# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 86.9 | 147 / 210 | 2.18 | 21.4% | 44782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 21.4% | 147 |
| mz.AntiGrav 1.0 | 2.8 | 13.8% | 9 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 24 |
| mld.Infinity 2.2 | 3.3 | 12.9% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 7 |
| sample.Walls 1.0 | 6.3 | 7.4% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.2 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 25 / 35 | 7261 |
| 2 | 1 | 71.1 | 81.0 | 24 / 35 | 7141 |
| 3 | 1 | 72.7 | 88.3 | 23 / 35 | 7927 |
| 4 | 1 | 73.0 | 89.5 | 24 / 35 | 7985 |
| 5 | 1 | 72.6 | 88.6 | 26 / 35 | 7584 |
| 6 | 1 | 71.5 | 86.7 | 25 / 35 | 6884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 100% |
| mld.Infinity 2.2 | 35 | 91% |
| radnor.DoctorBob 1.42 | 24 | 75% |
| amz.NanoClone 1.41 | 9 | 67% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 38% | 52 |
| mz.AntiGrav 1.0 | 11 | 17% | 69 |
| amz.NanoClone 1.41 | 11 | 17% | 16 |
| mld.Infinity 2.2 | 9 | 14% | 49 |
| GarmBox.Oranges 1.0 | 7 | 11% | 8 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.6 | 106 / 210 | 2.75 | 17.9% | 32765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.3 | 17.9% | 106 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 54 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 30 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 5 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 7 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.3 | 19 / 35 | 5311 |
| 2 | 1 | 69.9 | 89.8 | 21 / 35 | 5863 |
| 3 | 1 | 67.2 | 82.2 | 20 / 35 | 5150 |
| 4 | 3 | 60.2 | 54.3 | 5 / 35 | 5155 |
| 5 | 1 | 70.3 | 91.4 | 23 / 35 | 6077 |
| 6 | 1 | 67.6 | 85.4 | 18 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 53 | 81% |
| oog.melee.Mercutio 1.0 | 49 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 30 | 29% | 68 |
| oog.melee.Mercutio 1.0 | 28 | 27% | 69 |
| maribo.melee.BMV 0.1 | 8 | 8% | 12 |
| zyx.nano.Ant 1.1 | 8 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 15 |
| cs.Grudge 1.0 | 7 | 7% | 8 |
| fullsail.SweetTea 1.1 | 6 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 12 |
| bzdp.BoxCar 2.0 | 5 | 5% | 5 |

## Melee bench: F03

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 79.9 | 121 / 210 | 2.80 | 19.3% | 37917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 19.3% | 121 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.2% | 21 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 9 |
| fm.mammillarias 1.3 | 5.7 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 77.1 | 22 / 35 | 5969 |
| 2 | 1 | 71.6 | 87.0 | 22 / 35 | 7339 |
| 3 | 1 | 70.7 | 85.7 | 22 / 35 | 6865 |
| 4 | 1 | 68.4 | 79.4 | 21 / 35 | 6009 |
| 5 | 1 | 67.4 | 77.8 | 16 / 35 | 5680 |
| 6 | 1 | 67.9 | 72.7 | 18 / 35 | 6055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 83% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 28% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 21% | 44 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 16 |
| fm.mammillarias 1.3 | 11 | 12% | 14 |
| myl.nano.KomoriNinja 1.1 | 10 | 11% | 36 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 9 |
| sample.Fire 1.0 | 3 | 3% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 14 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.3 | 151 / 210 | 2.14 | 20.9% | 40509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.9% | 151 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 11 |
| tj.zombie1n 1.0.1 | 5.5 | 8.8% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.2% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.6% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.3% | 4 |
| yk.JahMicro 1.0 | 6.7 | 8.0% | 6 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 82.5 | 23 / 35 | 6397 |
| 2 | 1 | 71.6 | 89.2 | 26 / 35 | 6883 |
| 3 | 1 | 70.9 | 88.3 | 25 / 35 | 6626 |
| 4 | 1 | 70.7 | 84.1 | 23 / 35 | 7329 |
| 5 | 1 | 71.2 | 89.2 | 27 / 35 | 6565 |
| 6 | 1 | 71.4 | 90.5 | 27 / 35 | 6709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 89% |
| stelo.SoJNanoMelee 1.1 | 49 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| yk.JahMicro 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 31% | 81 |
| stelo.SoJNanoMelee 1.1 | 13 | 22% | 36 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 12% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 29 |
| yk.JahMicro 1.0 | 5 | 8% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 25 |
| tj.zombie1n 1.0.1 | 4 | 7% | 10 |
| repositorio.NanoStep 1.0 | 2 | 3% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.9 | 81 / 210 | 3.70 | 15.9% | 29553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 15.9% | 81 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 38 |
| ahf.NanoAndrew .4 | 3.3 | 11.9% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.1% | 27 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 9 |
| EBBU.Sim2 1.02 | 6.0 | 9.4% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.0% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.4% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 65.4 | 13 / 35 | 4868 |
| 2 | 1 | 62.3 | 68.3 | 10 / 35 | 4779 |
| 3 | 1 | 67.1 | 78.4 | 20 / 35 | 5395 |
| 4 | 1 | 64.0 | 72.7 | 12 / 35 | 4749 |
| 5 | 1 | 63.6 | 69.8 | 14 / 35 | 4974 |
| 6 | 1 | 62.3 | 65.1 | 12 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 83% |
| oog.melee.Corsair 1.0 | 32 | 44% |
| ahf.NanoAndrew .4 | 21 | 62% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sample.TrackFire 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 24% | 49 |
| ahf.NanoAndrew .4 | 26 | 20% | 42 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 46 |
| robar.nano.Assertive_Melee 0.2 | 16 | 12% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 10% | 13 |
| sam.Samspin 1.0 | 8 | 6% | 14 |
| zyx.nano.BacillusComma 1.0 | 7 | 5% | 12 |
| EBBU.Sim2 1.02 | 6 | 5% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.6 | 128 / 210 | 2.48 | 18.9% | 33652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.9% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 46 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.3% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.6% | 9 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 4 |
| fm.claire 1.7 | 5.7 | 9.1% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.6% | 9 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 1 |
| pa.Improved 1.0 | 9.2 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 18 / 35 | 5373 |
| 2 | 1 | 69.1 | 88.6 | 22 / 35 | 5391 |
| 3 | 1 | 69.7 | 85.4 | 24 / 35 | 5901 |
| 4 | 1 | 68.2 | 79.7 | 21 / 35 | 5949 |
| 5 | 1 | 68.8 | 83.2 | 23 / 35 | 5688 |
| 6 | 1 | 67.6 | 82.9 | 20 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 79% |
| oog.melee.CapuletDroid 1.1 | 45 | 98% |
| gh.nano.Grofvuil 0.2 | 13 | 77% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| fm.claire 1.7 | 8 | 75% |
| sample.SpinBot 1.0 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 36% | 73 |
| gh.nano.Grofvuil 0.2 | 12 | 14% | 22 |
| arthord.NanoSatanMelee Beta | 12 | 14% | 17 |
| fm.claire 1.7 | 9 | 11% | 16 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 55 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 11 |
| sample.SpinBot 1.0 | 4 | 5% | 7 |
| kurios.DOSexe .9b | 4 | 5% | 6 |
| pa.Improved 1.0 | 3 | 4% | 3 |

## Melee bench: F07

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.1 | 113 / 210 | 2.52 | 18.9% | 36684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.9% | 113 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.7% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 12.8% | 21 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 26 |
| DBall.Anarchy 0.1 | 5.2 | 9.1% | 9 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 1 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 24 / 35 | 6056 |
| 2 | 1 | 68.8 | 83.5 | 22 / 35 | 5890 |
| 3 | 1 | 67.5 | 78.4 | 14 / 35 | 6252 |
| 4 | 1 | 68.1 | 80.6 | 15 / 35 | 6285 |
| 5 | 1 | 69.3 | 83.5 | 21 / 35 | 6385 |
| 6 | 1 | 68.6 | 83.8 | 17 / 35 | 5816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 79% |
| mz.MicroGodMelee 1 | 42 | 69% |
| gh.micro.Gruweltje 0.7 | 23 | 65% |
| DBall.Anarchy 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 9 | 89% |
| el.JumpShoot 0.2 | 8 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 27 | 28% | 57 |
| gh.micro.Gruweltje 0.7 | 27 | 28% | 52 |
| spinnercat.micro.Tyger 0.1 | 21 | 22% | 53 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 11 |
| DBall.Anarchy 0.1 | 4 | 4% | 16 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 70.8 | 112 / 210 | 3.62 | 16.6% | 31558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.3 | 16.6% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 6 |
| germ.TheMind .2 | 5.3 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 73.3 | 18 / 35 | 5400 |
| 2 | 1 | 66.7 | 74.0 | 22 / 35 | 5777 |
| 3 | 1 | 67.4 | 76.8 | 20 / 35 | 5801 |
| 4 | 1 | 65.4 | 72.4 | 19 / 35 | 5364 |
| 5 | 3 | 59.9 | 58.7 | 16 / 35 | 4228 |
| 6 | 1 | 64.6 | 69.8 | 17 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 95% |
| germ.TheMind .2 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 50% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 40 |
| qualidafial.MajorDick 1.0.1 | 9 | 9% | 13 |
| germ.TheMind .2 | 8 | 8% | 18 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 12 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| mym.EdgeStalker 1.0 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.4 | 149 / 210 | 2.14 | 20.2% | 33153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.2% | 149 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.0% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 4 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 8.8% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 8.0% | 1 |
| stelo.PatternRobot 1.0 | 8.5 | 7.5% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.4 | 26 / 35 | 6103 |
| 2 | 1 | 71.2 | 88.9 | 27 / 35 | 5362 |
| 3 | 1 | 71.5 | 89.8 | 27 / 35 | 5797 |
| 4 | 1 | 70.0 | 86.7 | 25 / 35 | 5353 |
| 5 | 1 | 68.9 | 81.6 | 21 / 35 | 5428 |
| 6 | 1 | 69.6 | 85.7 | 23 / 35 | 5110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 96% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| maribo.IotaCT 1.1 | 12 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 14 | 23% | 26 |
| rz.HawkOnFire 0.1 | 10 | 16% | 61 |
| ratosh.Wesco 1.4 | 8 | 13% | 22 |
| maribo.IotaCT 1.1 | 7 | 11% | 25 |
| stelo.PatternRobot 1.0 | 7 | 11% | 12 |
| nz.jdc.nano.GridFu 1.0 | 6 | 10% | 40 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 11 |
| spinnercat.Omen 1.0 | 3 | 5% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.2 | 167 / 210 | 1.88 | 21.3% | 39495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 21.3% | 167 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 5 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 3 |
| sanja.First 0.1 | 5.7 | 8.6% | 2 |
| zyx.micro.Ant 1.1 | 6.0 | 8.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.1% | 2 |
| cvt.Firsty 1.0 | 7.3 | 7.7% | 7 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 80.3 | 23 / 35 | 6172 |
| 2 | 1 | 72.3 | 94.6 | 31 / 35 | 6788 |
| 3 | 1 | 72.5 | 96.5 | 30 / 35 | 6725 |
| 4 | 1 | 71.1 | 90.2 | 29 / 35 | 6759 |
| 5 | 1 | 71.2 | 88.9 | 28 / 35 | 6495 |
| 6 | 1 | 71.3 | 90.8 | 26 / 35 | 6556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 91% |
| baal.nano.N 1.42 | 40 | 98% |
| zyx.micro.Ant 1.1 | 23 | 96% |
| cvt.Firsty 1.0 | 23 | 91% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 43 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 23% | 64 |
| Grystrion.TrackerWO 1.0 | 8 | 19% | 20 |
| baal.nano.N 1.42 | 6 | 14% | 38 |
| cvt.Firsty 1.0 | 4 | 9% | 18 |
| sample.RamFire 1.0 | 4 | 9% | 7 |
| zyx.micro.Ant 1.1 | 3 | 7% | 29 |
| sanja.First 0.1 | 3 | 7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 3 | 7% | 8 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 6 |

## Melee bench: F11

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.4 | 74 / 210 | 3.84 | 15.6% | 32305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.3% | 72 |
| hadur117.micro.SaorWTD 0.1 | 1.5 | 15.6% | 74 |
| cs.Wren 1.0 | 3.0 | 13.3% | 27 |
| mz.Cork 0.1 | 4.3 | 11.2% | 12 |
| js.PinBall 1.6 | 4.7 | 11.2% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 7 |
| evd.X1 0.01 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.1% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 72.1 | 13 / 35 | 5400 |
| 2 | 1 | 64.2 | 69.8 | 14 / 35 | 5473 |
| 3 | 1 | 63.9 | 68.6 | 12 / 35 | 5345 |
| 4 | 2 | 63.0 | 67.3 | 11 / 35 | 5229 |
| 5 | 1 | 64.3 | 69.5 | 13 / 35 | 5662 |
| 6 | 2 | 61.9 | 63.2 | 11 / 35 | 5196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 66% |
| cs.Wren 1.0 | 24 | 67% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 5 | 80% |
| donjezza.Jezza 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 25% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 43% | 99 |
| cs.Wren 1.0 | 29 | 21% | 39 |
| joe.ADinosaur 1.0 | 14 | 10% | 16 |
| js.PinBall 1.6 | 12 | 9% | 17 |
| mz.Cork 0.1 | 10 | 7% | 14 |
| evd.X1 0.01 | 8 | 6% | 9 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 1% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.9 | 139 / 210 | 2.45 | 19.1% | 29988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 19.1% | 139 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 21 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 10.7% | 4 |
| ntc.Opposite 1.5 | 4.0 | 10.8% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.9% | 14 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 1 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.2 | 28 / 35 | 5606 |
| 2 | 1 | 65.6 | 73.7 | 18 / 35 | 4833 |
| 3 | 1 | 70.1 | 90.2 | 24 / 35 | 5329 |
| 4 | 1 | 68.5 | 81.6 | 23 / 35 | 5131 |
| 5 | 1 | 68.7 | 86.3 | 27 / 35 | 4493 |
| 6 | 1 | 65.6 | 76.2 | 19 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 94% |
| myl.nano.Graviton 1.10 | 30 | 97% |
| ntc.Opposite 1.5 | 19 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 14 | 79% |
| donjezza.Muncho 1.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 26% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 17% | 24 |
| ntc.Opposite 1.5 | 11 | 15% | 26 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 23 |
| disan.Chair 2.2.0 | 8 | 11% | 21 |
| stelo.AreaTargetingBot 1.1 | 6 | 8% | 31 |
| donjezza.Muncho 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 18 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.5 | 63 / 210 | 3.74 | 15.2% | 27409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.7 | 15.2% | 63 |
| oog.melee.Capulet 1.2 | 1.8 | 14.6% | 64 |
| kawigi.micro.Shiz 1.1 | 3.2 | 12.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 23 |
| yagami.Tidus 0.11 | 4.5 | 11.6% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 8.2% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.4% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.3 | 14 / 35 | 4958 |
| 2 | 3 | 61.9 | 63.5 | 10 / 35 | 4338 |
| 3 | 2 | 62.6 | 68.9 | 7 / 35 | 4340 |
| 4 | 2 | 61.8 | 64.4 | 11 / 35 | 4243 |
| 5 | 1 | 63.2 | 67.9 | 12 / 35 | 4441 |
| 6 | 1 | 64.3 | 71.1 | 9 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 53% |
| kawigi.micro.Shiz 1.1 | 19 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 67% |
| yagami.Tidus 0.11 | 14 | 79% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 44% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 15% | 33 |
| yagami.Tidus 0.11 | 14 | 10% | 24 |
| ejb.Polaris 1.0.1 | 14 | 10% | 21 |
| stelo.MirrorNano 1.3 | 12 | 8% | 13 |
| kawigi.micro.Shiz 1.1 | 8 | 5% | 22 |
| kurios.DOSexe .9a | 8 | 5% | 8 |
| step.nanoPri 1.0 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.7 | 135 / 210 | 2.56 | 18.2% | 29437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.2% | 135 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 16 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 25 |
| ratosh.Nobo 0.21 | 3.8 | 11.2% | 11 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 12 |
| m3thos.Eva00 1.1 | 5.8 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.4 | 21 / 35 | 4924 |
| 2 | 1 | 67.2 | 81.0 | 22 / 35 | 5116 |
| 3 | 1 | 67.2 | 84.1 | 23 / 35 | 4658 |
| 4 | 1 | 69.7 | 93.3 | 25 / 35 | 4979 |
| 5 | 1 | 66.7 | 76.8 | 23 / 35 | 5010 |
| 6 | 1 | 67.0 | 82.5 | 21 / 35 | 4750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 93% |
| wee.Gem 1.8.4 | 38 | 95% |
| wompi.Quokka 1.6 | 18 | 94% |
| m3thos.Eva00 1.1 | 15 | 87% |
| ratosh.Nobo 0.21 | 12 | 83% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 17% | 26 |
| bzdp.Pansy 2.1 | 10 | 13% | 52 |
| bayen.UbaMicro 1.4 | 10 | 13% | 17 |
| maribo.FollowFire 1 | 10 | 13% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 10 |
| wee.Gem 1.8.4 | 8 | 11% | 51 |
| wompi.Quokka 1.6 | 6 | 8% | 21 |
| m3thos.Eva00 1.1 | 5 | 7% | 16 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 4 |

## Melee bench: F15

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 84.0 | 107 / 210 | 2.44 | 20.2% | 46156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.2 | 20.2% | 107 |
| wompi.Wallaby 5.1 | 1.8 | 18.2% | 79 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 19 |
| ayk.WallHugger 1.0 | 4.2 | 10.3% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.6% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.2 | 81.0 | 15 / 35 | 7594 |
| 2 | 1 | 70.5 | 80.3 | 17 / 35 | 7668 |
| 3 | 1 | 71.5 | 84.1 | 19 / 35 | 7709 |
| 4 | 1 | 71.7 | 87.9 | 15 / 35 | 7468 |
| 5 | 1 | 71.9 | 85.1 | 20 / 35 | 7636 |
| 6 | 1 | 72.1 | 85.4 | 21 / 35 | 8081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 72% |
| ayk.WallHugger 1.0 | 14 | 100% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| mz.NanoGod 2.02 | 9 | 22% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 45% | 122 |
| mz.NanoGod 2.02 | 33 | 31% | 38 |
| exauge.GateKeeper 1.1.121g | 12 | 11% | 17 |
| ayk.WallHugger 1.0 | 9 | 9% | 21 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.1 | 114 / 210 | 3.15 | 17.3% | 30062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 17.3% | 114 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 11.9% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.3 | 11.5% | 19 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.5% | 24 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 21 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.7% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 6.8% | 3 |
| ap.Frederick 1.1 | 9.0 | 6.5% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.8 | 22 / 35 | 5124 |
| 2 | 1 | 66.9 | 80.3 | 23 / 35 | 4793 |
| 3 | 1 | 67.2 | 81.3 | 21 / 35 | 5101 |
| 4 | 1 | 62.5 | 65.7 | 15 / 35 | 4745 |
| 5 | 1 | 65.9 | 76.5 | 18 / 35 | 5147 |
| 6 | 1 | 65.3 | 75.2 | 15 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 35 | 80% |
| bvh.micro.Freya 0.3 | 25 | 80% |
| dummy.micro.Sparrow 2.5 | 17 | 82% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 16 | 17% | 36 |
| conscience.Electron 1.3g | 16 | 17% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 16% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 15% | 45 |
| voidious.micro.BlitzBat 1.05 | 12 | 13% | 44 |
| bvh.micro.Freya 0.3 | 12 | 13% | 23 |
| dl.BetterWalls 1.0 | 6 | 6% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.4 | 150 / 210 | 2.22 | 21.5% | 43883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 21.5% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.9% | 18 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 9 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.2% | 9 |
| dsw.StaticD 1.0 | 5.2 | 9.3% | 11 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 5 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.0% | 1 |
| sample.MyFirstRobot 1.0 | 7.8 | 6.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 2 |
| sample.Corners 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 81.6 | 22 / 35 | 7221 |
| 2 | 1 | 73.9 | 94.6 | 30 / 35 | 7615 |
| 3 | 1 | 70.9 | 82.2 | 22 / 35 | 7339 |
| 4 | 1 | 70.4 | 80.6 | 23 / 35 | 7258 |
| 5 | 1 | 73.1 | 94.3 | 28 / 35 | 7359 |
| 6 | 1 | 71.1 | 85.1 | 25 / 35 | 7091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 94% |
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 18 | 61% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 28% | 66 |
| dsw.StaticD 1.0 | 14 | 23% | 30 |
| supersample.SuperBoxBot 1.0 | 13 | 21% | 28 |
| sul.Lunar 1.1 | 8 | 13% | 52 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 11 |
| sample.Corners 1.0 | 2 | 3% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 78.8 | 103 / 210 | 2.91 | 18.3% | 38648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.3% | 103 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 24 |
| mld.Wisdom 1.0 | 3.2 | 12.8% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.3% | 28 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 12 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.6% | 9 |
| sample.Walls 1.0 | 7.0 | 8.3% | 8 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 77.1 | 18 / 35 | 6394 |
| 2 | 1 | 68.5 | 81.6 | 17 / 35 | 6268 |
| 3 | 1 | 66.1 | 73.7 | 16 / 35 | 6021 |
| 4 | 1 | 69.9 | 85.1 | 20 / 35 | 7062 |
| 5 | 1 | 68.2 | 80.0 | 16 / 35 | 6798 |
| 6 | 1 | 66.3 | 75.2 | 16 / 35 | 6105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 77% |
| mld.Wisdom 1.0 | 19 | 63% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 36% | 56 |
| radnor.DoctorBob 1.42 | 24 | 22% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 18% | 50 |
| KiraNL.Chupacabra 0.4 | 9 | 8% | 16 |
| amz.NanoClone 1.41 | 7 | 7% | 15 |
| jangs.ns51 1.0 | 4 | 4% | 6 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 7 |

