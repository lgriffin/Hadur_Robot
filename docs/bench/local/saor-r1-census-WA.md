# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 83.9 | 114 / 210 | 2.45 | 19.8% | 42217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 19.8% | 114 |
| radnor.DoctorBob 1.42 | 2.7 | 14.5% | 26 |
| mz.AntiGrav 1.0 | 2.8 | 14.6% | 25 |
| mld.Infinity 2.2 | 3.5 | 13.5% | 37 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 5 |
| sample.Walls 1.0 | 6.7 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 78.4 | 19 / 35 | 6684 |
| 2 | 1 | 71.0 | 85.1 | 20 / 35 | 7233 |
| 3 | 1 | 69.8 | 82.2 | 17 / 35 | 7080 |
| 4 | 1 | 69.9 | 83.8 | 17 / 35 | 7002 |
| 5 | 1 | 72.0 | 87.6 | 23 / 35 | 7154 |
| 6 | 1 | 70.9 | 86.0 | 18 / 35 | 7064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 56 | 82% |
| mld.Infinity 2.2 | 37 | 76% |
| radnor.DoctorBob 1.42 | 33 | 85% |
| amz.NanoClone 1.41 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 31 | 32% | 92 |
| radnor.DoctorBob 1.42 | 23 | 23% | 57 |
| mld.Infinity 2.2 | 17 | 17% | 12 |
| amz.NanoClone 1.41 | 14 | 14% | 18 |
| sample.Walls 1.0 | 7 | 7% | 15 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.2 | 68 / 210 | 3.05 | 16.4% | 29808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.7 | 16.4% | 68 |
| mld.DustBunny 3.8 | 1.8 | 14.8% | 51 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.3% | 56 |
| maribo.melee.BMV 0.1 | 4.7 | 10.3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.2% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.7% | 14 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 1 |
| fullsail.SweetTea 1.1 | 8.0 | 6.3% | 5 |
| bzdp.BoxCar 2.0 | 8.5 | 6.7% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 85.4 | 15 / 35 | 4620 |
| 2 | 1 | 66.9 | 82.2 | 13 / 35 | 5434 |
| 3 | 1 | 66.9 | 86.0 | 13 / 35 | 5054 |
| 4 | 3 | 61.5 | 60.3 | 4 / 35 | 5427 |
| 5 | 3 | 60.9 | 69.2 | 8 / 35 | 3950 |
| 6 | 1 | 66.9 | 80.3 | 15 / 35 | 5323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 45 | 31% |
| oog.melee.Mercutio 1.0 | 44 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 25% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 142 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 66 | 46% | 81 |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 12% | 20 |
| oog.melee.Mercutio 1.0 | 15 | 11% | 55 |
| zyx.nano.Ant 1.1 | 11 | 8% | 13 |
| cs.Grudge 1.0 | 11 | 8% | 10 |
| fullsail.SweetTea 1.1 | 9 | 6% | 10 |
| maribo.melee.BMV 0.1 | 7 | 5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 7 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.1 | 43 / 210 | 3.42 | 16.7% | 35646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.3 | 16.8% | 91 |
| hadur117.micro.SaorWA 0.1 | 1.7 | 16.7% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.4% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 11.5% | 39 |
| fm.mammillarias 1.3 | 5.2 | 9.7% | 4 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.1% | 13 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 1 |
| sample.Tracker 1.0 | 9.2 | 4.7% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 74.9 | 8 / 35 | 6133 |
| 2 | 1 | 65.3 | 73.3 | 7 / 35 | 5789 |
| 3 | 1 | 65.0 | 71.4 | 10 / 35 | 5710 |
| 4 | 2 | 66.8 | 75.2 | 7 / 35 | 6336 |
| 5 | 2 | 65.6 | 74.6 | 6 / 35 | 5837 |
| 6 | 2 | 64.3 | 68.9 | 5 / 35 | 5841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 29% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 20% |
| myl.nano.KomoriNinja 1.1 | 12 | 42% |
| cb.nano.Insomnia 1.0 | 8 | 63% |
| fm.mammillarias 1.3 | 7 | 71% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 64 | 38% | 81 |
| stelo.SoRobotNanoMelee 1.2 | 45 | 27% | 50 |
| fm.mammillarias 1.3 | 22 | 13% | 26 |
| myl.nano.KomoriNinja 1.1 | 17 | 10% | 26 |
| cb.nano.Insomnia 1.0 | 12 | 7% | 11 |
| sample.Fire 1.0 | 3 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 1% | 4 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.9 | 90 / 210 | 2.63 | 18.5% | 37009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 18.5% | 90 |
| kawigi.nano.Lib 1.0 | 2.2 | 14.1% | 53 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 10.1% | 36 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 8.4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.4% | 10 |
| yk.JahMicro 1.0 | 7.5 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 16 / 35 | 6401 |
| 2 | 1 | 65.9 | 79.0 | 11 / 35 | 5471 |
| 3 | 1 | 68.2 | 81.3 | 17 / 35 | 6244 |
| 4 | 1 | 69.5 | 87.3 | 19 / 35 | 6550 |
| 5 | 1 | 67.2 | 80.3 | 10 / 35 | 6393 |
| 6 | 1 | 67.6 | 81.0 | 17 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 40 | 55% |
| stelo.SoJNanoMelee 1.1 | 29 | 48% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tj.zombie1n 1.0.1 | 8 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 50% | 84 |
| stelo.SoJNanoMelee 1.1 | 36 | 30% | 53 |
| tj.zombie1n 1.0.1 | 8 | 7% | 11 |
| tvv.micro.Antares 1.1.1 | 4 | 3% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 20 |
| yk.JahMicro 1.0 | 3 | 2% | 7 |
| repositorio.NanoStep 1.0 | 3 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 65.2 | 65 / 210 | 4.13 | 14.4% | 26571 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.2 | 14.4% | 65 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 38 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.7% | 40 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 24 |
| EBBU.Sim2 1.02 | 5.0 | 10.7% | 10 |
| sam.Samspin 1.0 | 6.0 | 9.9% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.5% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.4% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 60.0 | 12 / 35 | 4372 |
| 2 | 1 | 60.3 | 67.0 | 6 / 35 | 4103 |
| 3 | 1 | 64.3 | 75.9 | 16 / 35 | 4808 |
| 4 | 1 | 61.0 | 66.3 | 11 / 35 | 4281 |
| 5 | 2 | 59.0 | 60.3 | 5 / 35 | 4392 |
| 6 | 1 | 61.4 | 61.9 | 15 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 65% |
| oog.melee.Corsair 1.0 | 24 | 71% |
| ahf.NanoAndrew .4 | 15 | 93% |
| EBBU.Sim2 1.02 | 10 | 90% |
| sam.Samspin 1.0 | 5 | 20% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 50% |

Hadur died in 145 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 28 | 19% | 31 |
| simonton.nano.MeleeSeed 1.8 | 22 | 15% | 41 |
| EBBU.Sim2 1.02 | 17 | 12% | 25 |
| zyx.nano.BacillusComma 1.0 | 17 | 12% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 12% | 17 |
| sam.Samspin 1.0 | 16 | 11% | 19 |
| oog.melee.Corsair 1.0 | 15 | 10% | 30 |
| sample.TrackFire 1.0 | 8 | 6% | 9 |
| ahf.NanoAndrew .4 | 5 | 3% | 18 |

## Melee bench: F06

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 79.8 | 89 / 210 | 2.82 | 17.1% | 29181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.2 | 17.1% | 89 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.5% | 61 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 26 |
| fm.claire 1.7 | 5.2 | 9.3% | 2 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.8% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.6% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.4% | 7 |
| pa.Improved 1.0 | 9.2 | 6.0% | 4 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.6 | 15 / 35 | 4974 |
| 2 | 1 | 64.6 | 78.4 | 15 / 35 | 4538 |
| 3 | 1 | 63.0 | 71.4 | 12 / 35 | 4487 |
| 4 | 2 | 64.3 | 75.9 | 10 / 35 | 4760 |
| 5 | 1 | 66.6 | 83.2 | 15 / 35 | 4861 |
| 6 | 1 | 69.1 | 89.2 | 22 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 33% |
| oog.melee.CapuletDroid 1.1 | 20 | 75% |
| gh.nano.Grofvuil 0.2 | 18 | 94% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| sample.SpinBot 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 83% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 121 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 54% | 96 |
| fm.claire 1.7 | 14 | 12% | 20 |
| oog.melee.CapuletDroid 1.1 | 13 | 11% | 14 |
| sample.SpinBot 1.0 | 12 | 10% | 18 |
| gh.nano.Grofvuil 0.2 | 8 | 7% | 27 |
| pa.Improved 1.0 | 5 | 4% | 11 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 10 |
| kurios.DOSexe .9b | 1 | 1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.7 | 62 / 210 | 3.55 | 15.6% | 30820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.7 | 15.6% | 62 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.5% | 44 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.9% | 54 |
| mz.MicroGodMelee 1 | 4.0 | 11.8% | 19 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 11 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.3% | 4 |
| acogdev.alpha 0.2 | 7.8 | 6.8% | 4 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.3% | 6 |
| el.JumpShoot 0.2 | 8.7 | 6.3% | 6 |
| fire219.CatBot 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.2 | 14 / 35 | 5446 |
| 2 | 1 | 64.3 | 75.9 | 10 / 35 | 5180 |
| 3 | 1 | 66.0 | 78.1 | 14 / 35 | 5076 |
| 4 | 2 | 62.9 | 68.3 | 10 / 35 | 5047 |
| 5 | 3 | 60.8 | 64.4 | 6 / 35 | 4900 |
| 6 | 2 | 62.8 | 68.3 | 8 / 35 | 5171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 30% |
| gh.micro.Gruweltje 0.7 | 28 | 50% |
| mz.MicroGodMelee 1 | 23 | 87% |
| DBall.Anarchy 0.1 | 11 | 100% |
| el.JumpShoot 0.2 | 5 | 20% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 41% | 69 |
| gh.micro.Gruweltje 0.7 | 27 | 18% | 43 |
| caimano.Furia_Ceca 0.22 | 16 | 11% | 17 |
| acogdev.alpha 0.2 | 14 | 9% | 14 |
| mz.MicroGodMelee 1 | 10 | 7% | 33 |
| el.JumpShoot 0.2 | 10 | 7% | 11 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 5 |
| DBall.Anarchy 0.1 | 3 | 2% | 15 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 65.5 | 58 / 210 | 4.10 | 14.5% | 28483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.7% | 75 |
| hadur117.micro.SaorWA 0.1 | 2.0 | 14.5% | 58 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.8% | 39 |
| germ.TheMind .2 | 4.5 | 10.0% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.9% | 5 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 6 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.1 | 55.2 | 9 / 35 | 4520 |
| 2 | 1 | 66.1 | 78.7 | 12 / 35 | 5155 |
| 3 | 2 | 62.0 | 70.5 | 11 / 35 | 4379 |
| 4 | 2 | 63.2 | 70.2 | 8 / 35 | 5140 |
| 5 | 2 | 61.9 | 63.2 | 12 / 35 | 4934 |
| 6 | 3 | 58.0 | 55.2 | 6 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 43% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 73% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| germ.TheMind .2 | 4 | 75% |
| awesomeness.Elite 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 46% | 100 |
| germ.TheMind .2 | 21 | 14% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 13% | 28 |
| stelo.UntouchableNano 1.3 | 15 | 10% | 18 |
| awesomeness.Elite 1.0 | 15 | 10% | 17 |
| mym.EdgeStalker 1.0 | 4 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 76.8 | 66 / 210 | 3.09 | 16.2% | 26778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.2 | 16.2% | 66 |
| rz.HawkOnFire 0.1 | 2.0 | 14.4% | 53 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.7% | 22 |
| maribo.IotaCT 1.1 | 4.5 | 11.2% | 18 |
| ratosh.Wesco 1.4 | 5.7 | 10.0% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 6.7 | 9.4% | 12 |
| stelo.PatternRobot 1.0 | 7.2 | 8.4% | 17 |
| spinnercat.Omen 1.0 | 8.7 | 7.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 14 / 35 | 4970 |
| 2 | 1 | 65.7 | 77.8 | 11 / 35 | 4791 |
| 3 | 1 | 64.9 | 77.5 | 13 / 35 | 4246 |
| 4 | 2 | 64.1 | 73.7 | 11 / 35 | 4063 |
| 5 | 1 | 64.3 | 75.9 | 10 / 35 | 4380 |
| 6 | 1 | 63.8 | 74.3 | 7 / 35 | 4328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 47 | 43% |
| nz.jdc.nano.GridFu 1.0 | 24 | 79% |
| stelo.PatternRobot 1.0 | 14 | 50% |
| maribo.IotaCT 1.1 | 10 | 30% |
| ratosh.Wesco 1.4 | 9 | 44% |
| timmit.nano.TimDog 0.33 | 7 | 57% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 75% |

Hadur died in 144 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 50 | 35% | 62 |
| ratosh.Wesco 1.4 | 34 | 24% | 43 |
| stelo.PatternRobot 1.0 | 22 | 15% | 27 |
| nz.jdc.nano.GridFu 1.0 | 13 | 9% | 36 |
| maribo.IotaCT 1.1 | 12 | 8% | 18 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.7 | 113 / 210 | 2.56 | 18.4% | 34131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 18.4% | 113 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.9% | 20 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 11 |
| zyx.micro.Ant 1.1 | 3.8 | 10.9% | 28 |
| Grystrion.TrackerWO 1.0 | 4.8 | 10.3% | 5 |
| sanja.First 0.1 | 6.0 | 9.1% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.8% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.5% | 17 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 19 / 35 | 5588 |
| 2 | 1 | 67.7 | 81.3 | 20 / 35 | 5905 |
| 3 | 1 | 66.2 | 80.6 | 18 / 35 | 5374 |
| 4 | 1 | 67.9 | 83.5 | 20 / 35 | 5673 |
| 5 | 1 | 69.1 | 87.9 | 20 / 35 | 6010 |
| 6 | 1 | 66.0 | 76.8 | 16 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 30 | 90% |
| baal.nano.N 1.42 | 22 | 95% |
| sanja.First 0.1 | 21 | 67% |
| cvt.Firsty 1.0 | 17 | 53% |
| Grystrion.TrackerWO 1.0 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| zyx.micro.Ant 1.1 | 15 | 53% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 50 | 51% | 62 |
| cvt.Firsty 1.0 | 19 | 19% | 34 |
| Grystrion.TrackerWO 1.0 | 9 | 9% | 28 |
| sanja.First 0.1 | 8 | 8% | 24 |
| tvv.nano.Polaris 1.2 | 5 | 5% | 27 |
| baal.nano.N 1.42 | 5 | 5% | 24 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 62.8 | 49 / 210 | 4.35 | 13.8% | 27773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.4% | 96 |
| hadur117.micro.SaorWA 0.1 | 2.3 | 13.8% | 49 |
| cs.Wren 1.0 | 2.8 | 13.3% | 22 |
| mz.Cork 0.1 | 4.3 | 11.0% | 15 |
| js.PinBall 1.6 | 4.5 | 11.3% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 4 |
| evd.X1 0.01 | 7.0 | 8.4% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.4% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 60.3 | 7 / 35 | 4182 |
| 2 | 3 | 60.4 | 62.5 | 6 / 35 | 4600 |
| 3 | 2 | 61.0 | 65.1 | 8 / 35 | 4881 |
| 4 | 2 | 59.1 | 59.0 | 9 / 35 | 4349 |
| 5 | 3 | 60.3 | 60.6 | 9 / 35 | 4866 |
| 6 | 2 | 63.1 | 68.9 | 10 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 41% |
| cs.Wren 1.0 | 11 | 64% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 77 | 48% | 102 |
| evd.X1 0.01 | 28 | 17% | 31 |
| cs.Wren 1.0 | 27 | 17% | 33 |
| joe.ADinosaur 1.0 | 9 | 6% | 9 |
| mz.Cork 0.1 | 7 | 4% | 13 |
| js.PinBall 1.6 | 6 | 4% | 10 |
| PSW.Relentless 0.1 | 5 | 3% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 75.0 | 74 / 210 | 3.25 | 16.3% | 27090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 16.3% | 74 |
| myl.nano.Graviton 1.10 | 2.7 | 12.4% | 49 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.5% | 34 |
| ntc.Opposite 1.5 | 3.7 | 11.2% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 9.9% | 2 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.3% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 8 |
| DBall.NUKE 0.1 | 7.8 | 8.0% | 9 |
| donjezza.Muncho 1.0 | 8.5 | 7.2% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.4 | 15 / 35 | 4577 |
| 2 | 1 | 63.6 | 73.7 | 9 / 35 | 4522 |
| 3 | 1 | 62.6 | 71.7 | 11 / 35 | 4401 |
| 4 | 1 | 65.1 | 79.0 | 14 / 35 | 4308 |
| 5 | 1 | 65.8 | 77.8 | 15 / 35 | 4716 |
| 6 | 1 | 62.5 | 68.3 | 10 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 29 | 55% |
| myl.nano.Graviton 1.10 | 24 | 29% |
| ntc.Opposite 1.5 | 15 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| donjezza.Muncho 1.0 | 9 | 56% |
| disan.Chair 2.2.0 | 7 | 71% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 27% | 49 |
| stelo.AreaTargetingBot 1.1 | 31 | 22% | 45 |
| pfvicm.Sobieski 7.2.3b | 20 | 14% | 25 |
| ntc.Opposite 1.5 | 17 | 12% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 18 |
| donjezza.Muncho 1.0 | 9 | 6% | 16 |
| disan.Chair 2.2.0 | 5 | 4% | 11 |
| pbg.R2D2 1.0 | 3 | 2% | 8 |
| DBall.NUKE 0.1 | 2 | 1% | 14 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.6 | 38 / 210 | 4.01 | 14.0% | 25143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 15.2% | 68 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 63 |
| hadur117.micro.SaorWA 0.1 | 2.5 | 14.0% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 19 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 15 |
| ejb.Polaris 1.0.1 | 6.0 | 9.9% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 69.2 | 8 / 35 | 4251 |
| 2 | 3 | 60.2 | 60.6 | 7 / 35 | 4128 |
| 3 | 2 | 62.5 | 69.5 | 9 / 35 | 4102 |
| 4 | 3 | 59.5 | 61.6 | 3 / 35 | 4029 |
| 5 | 2 | 63.4 | 72.4 | 6 / 35 | 4418 |
| 6 | 3 | 61.3 | 66.0 | 5 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 45% |
| kawigi.micro.Shiz 1.1 | 20 | 35% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 93% |
| yagami.Tidus 0.11 | 9 | 44% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 44 | 26% | 49 |
| oog.melee.Capulet 1.2 | 41 | 24% | 52 |
| yagami.Tidus 0.11 | 39 | 23% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 13% | 37 |
| ejb.Polaris 1.0.1 | 11 | 6% | 15 |
| step.nanoPri 1.0 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.2 | 102 / 210 | 3.23 | 16.1% | 25211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 16.1% | 102 |
| wee.Gem 1.8.4 | 2.8 | 12.1% | 32 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 19 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 17 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 5.5 | 10.4% | 23 |
| bayen.UbaMicro 1.4 | 7.0 | 8.8% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.4% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 71.4 | 17 / 35 | 3920 |
| 2 | 1 | 64.7 | 75.2 | 17 / 35 | 4589 |
| 3 | 1 | 63.6 | 74.3 | 16 / 35 | 4144 |
| 4 | 1 | 66.8 | 82.5 | 21 / 35 | 4607 |
| 5 | 1 | 60.8 | 68.3 | 13 / 35 | 3743 |
| 6 | 1 | 65.3 | 79.7 | 18 / 35 | 4208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 38 | 92% |
| bzdp.Pansy 2.1 | 33 | 79% |
| ratosh.Nobo 0.21 | 18 | 67% |
| wompi.Quokka 1.6 | 16 | 100% |
| m3thos.Eva00 1.1 | 12 | 42% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 25 | 23% | 31 |
| bzdp.Pansy 2.1 | 18 | 17% | 44 |
| ratosh.Nobo 0.21 | 15 | 14% | 29 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 12% | 15 |
| wee.Gem 1.8.4 | 9 | 8% | 43 |
| bayen.UbaMicro 1.4 | 8 | 7% | 15 |
| stelo.MyAgileRobot 0.2 | 7 | 6% | 7 |
| maribo.FollowFire 1 | 7 | 6% | 7 |
| wompi.Quokka 1.6 | 6 | 6% | 18 |

## Melee bench: F15

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 87.2 | 112 / 210 | 2.15 | 20.3% | 42816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 20.3% | 112 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 72 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 13 |
| exauge.GateKeeper 1.1.121g | 4.2 | 10.4% | 11 |
| ayk.WallHugger 1.0 | 5.3 | 8.5% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 90.2 | 22 / 35 | 7887 |
| 2 | 1 | 70.8 | 87.3 | 16 / 35 | 6946 |
| 3 | 1 | 70.4 | 85.7 | 16 / 35 | 6947 |
| 4 | 1 | 71.3 | 85.1 | 20 / 35 | 7197 |
| 5 | 1 | 71.1 | 88.9 | 18 / 35 | 6771 |
| 6 | 1 | 71.2 | 86.3 | 20 / 35 | 7068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 113 | 60% |
| mz.NanoGod 2.02 | 20 | 80% |
| exauge.GateKeeper 1.1.121g | 19 | 53% |
| drd.Dreadknoght 0.9 | 7 | 86% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 53 | 54% | 128 |
| exauge.GateKeeper 1.1.121g | 21 | 21% | 25 |
| mz.NanoGod 2.02 | 17 | 17% | 31 |
| ayk.WallHugger 1.0 | 3 | 3% | 8 |
| drd.Dreadknoght 0.9 | 2 | 2% | 10 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.9 | 61 / 210 | 3.80 | 15.3% | 28500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.5 | 15.3% | 61 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 14.3% | 56 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 29 |
| bvh.micro.Freya 0.3 | 3.7 | 11.6% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.2% | 24 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.0% | 3 |
| ap.Frederick 1.1 | 8.7 | 6.8% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 72.1 | 9 / 35 | 4502 |
| 2 | 1 | 65.0 | 74.6 | 13 / 35 | 5279 |
| 3 | 3 | 60.0 | 61.6 | 8 / 35 | 4508 |
| 4 | 1 | 61.4 | 63.2 | 11 / 35 | 4773 |
| 5 | 1 | 63.1 | 69.8 | 11 / 35 | 4783 |
| 6 | 2 | 63.9 | 72.4 | 9 / 35 | 4655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 21% |
| dummy.micro.Sparrow 2.5 | 30 | 60% |
| bvh.micro.Freya 0.3 | 20 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 46% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 64 | 43% | 80 |
| dummy.micro.Sparrow 2.5 | 19 | 13% | 34 |
| conscience.Electron 1.3g | 17 | 11% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 11% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 11% | 27 |
| dl.BetterWalls 1.0 | 7 | 5% | 8 |
| bvh.micro.Freya 0.3 | 6 | 4% | 18 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 7 |

## Melee bench: F17

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 82.6 | 108 / 210 | 2.57 | 19.3% | 39305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 19.3% | 108 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.3% | 30 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 18 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.2% | 24 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.4% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.5% | 2 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 10 |
| sample.Corners 1.0 | 9.7 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.4 | 19 / 35 | 6281 |
| 2 | 1 | 68.2 | 81.0 | 14 / 35 | 6102 |
| 3 | 1 | 69.3 | 80.6 | 21 / 35 | 6840 |
| 4 | 1 | 66.1 | 73.7 | 13 / 35 | 6342 |
| 5 | 1 | 68.0 | 77.1 | 19 / 35 | 6436 |
| 6 | 1 | 72.1 | 90.8 | 22 / 35 | 7304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 84% |
| sul.Lunar 1.1 | 29 | 100% |
| supersample.SuperBoxBot 1.0 | 20 | 50% |
| dsw.StaticD 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 8 | 38% |
| mme.NikeEnhanced 2.0 | 8 | 50% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| sample.Corners 1.0 | 2 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 43 | 42% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 24% | 68 |
| mme.NikeEnhanced 2.0 | 13 | 13% | 17 |
| sample.MyFirstRobot 1.0 | 8 | 8% | 13 |
| sample.Corners 1.0 | 5 | 5% | 5 |
| sul.Lunar 1.1 | 4 | 4% | 39 |
| dsw.StaticD 1.0 | 3 | 3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.7 | 82 / 210 | 3.37 | 16.3% | 33500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWA 0.1 | 1.0 | 16.3% | 82 |
| radnor.DoctorBob 1.42 | 2.7 | 13.2% | 30 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.9% | 39 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.9% | 21 |
| amz.NanoClone 1.41 | 5.7 | 10.2% | 10 |
| sample.Walls 1.0 | 7.3 | 7.5% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.8% | 5 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.7 | 16 / 35 | 5743 |
| 2 | 1 | 62.4 | 65.7 | 11 / 35 | 5576 |
| 3 | 1 | 64.7 | 73.7 | 14 / 35 | 5601 |
| 4 | 1 | 64.2 | 71.7 | 13 / 35 | 5288 |
| 5 | 1 | 64.5 | 73.0 | 11 / 35 | 5758 |
| 6 | 1 | 65.9 | 78.1 | 17 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 61% |
| radnor.DoctorBob 1.42 | 32 | 72% |
| mld.Wisdom 1.0 | 20 | 70% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| jangs.ns51 1.0 | 8 | 63% |
| amz.NanoClone 1.41 | 6 | 67% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| KiraNL.Chupacabra 0.4 | 30 | 23% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 22% | 52 |
| mld.Wisdom 1.0 | 24 | 19% | 41 |
| radnor.DoctorBob 1.42 | 21 | 16% | 35 |
| amz.NanoClone 1.41 | 12 | 9% | 16 |
| jangs.ns51 1.0 | 7 | 5% | 12 |
| GarmBox.Oranges 1.0 | 4 | 3% | 7 |
| sample.Walls 1.0 | 2 | 2% | 8 |

