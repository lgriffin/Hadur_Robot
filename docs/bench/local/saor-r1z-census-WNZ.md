# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.0 | 143 / 210 | 2.35 | 20.5% | 43260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.5% | 143 |
| radnor.DoctorBob 1.42 | 2.3 | 14.5% | 26 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 18 |
| mld.Infinity 2.2 | 3.8 | 13.0% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 9 |
| sample.Walls 1.0 | 6.3 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 92.7 | 29 / 35 | 7704 |
| 2 | 1 | 71.6 | 87.9 | 25 / 35 | 6974 |
| 3 | 1 | 72.6 | 88.9 | 26 / 35 | 7699 |
| 4 | 1 | 71.5 | 85.1 | 24 / 35 | 7285 |
| 5 | 1 | 69.2 | 77.1 | 18 / 35 | 7047 |
| 6 | 1 | 69.0 | 78.4 | 21 / 35 | 6551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 90% |
| mld.Infinity 2.2 | 43 | 98% |
| radnor.DoctorBob 1.42 | 23 | 91% |
| jangs.ns51 1.0 | 10 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 34% | 57 |
| mz.AntiGrav 1.0 | 20 | 29% | 62 |
| mld.Infinity 2.2 | 10 | 15% | 57 |
| amz.NanoClone 1.41 | 9 | 13% | 18 |
| GarmBox.Oranges 1.0 | 4 | 6% | 6 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.2 | 115 / 210 | 2.42 | 18.2% | 32818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 18.2% | 115 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 48 |
| mld.DustBunny 3.8 | 3.3 | 12.2% | 18 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4.5 | 9.7% | 8 |
| zyx.nano.Ant 1.1 | 6.8 | 8.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.6% | 11 |
| bzdp.BoxCar 2.0 | 7.5 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 21 / 35 | 5723 |
| 2 | 1 | 65.6 | 77.8 | 15 / 35 | 5441 |
| 3 | 1 | 67.3 | 85.7 | 18 / 35 | 5430 |
| 4 | 1 | 68.2 | 85.7 | 18 / 35 | 5552 |
| 5 | 1 | 68.0 | 84.4 | 23 / 35 | 5175 |
| 6 | 1 | 68.0 | 83.8 | 20 / 35 | 5497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 68% |
| mld.DustBunny 3.8 | 37 | 92% |
| djdjdj.NanoSkunk10 1.0 | 17 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| bzdp.BoxCar 2.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 37% | 79 |
| mld.DustBunny 3.8 | 17 | 18% | 46 |
| maribo.melee.BMV 0.1 | 12 | 13% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 12% | 20 |
| zyx.nano.Ant 1.1 | 8 | 8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6 | 6% | 21 |
| fullsail.SweetTea 1.1 | 3 | 3% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 73.0 | 100 / 210 | 3.43 | 17.2% | 34818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.2 | 17.2% | 100 |
| myl.micro.Troodon 1.10 | 1.8 | 15.1% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.4% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.7% | 29 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.2% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.8% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.5% | 6 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 1 |
| sample.Fire 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.3 | 18 / 35 | 6153 |
| 2 | 1 | 67.5 | 75.9 | 19 / 35 | 6125 |
| 3 | 1 | 64.7 | 68.9 | 15 / 35 | 5515 |
| 4 | 2 | 64.5 | 66.0 | 15 / 35 | 5781 |
| 5 | 1 | 64.2 | 67.6 | 13 / 35 | 5473 |
| 6 | 1 | 67.6 | 78.1 | 20 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 33 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 85% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| myl.nano.KomoriNinja 1.1 | 8 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 31 | 28% | 50 |
| myl.micro.Troodon 1.10 | 27 | 25% | 68 |
| fm.mammillarias 1.3 | 16 | 15% | 21 |
| cb.nano.Insomnia 1.0 | 13 | 12% | 17 |
| myl.nano.KomoriNinja 1.1 | 11 | 10% | 25 |
| sp.Nanos.Ember 1.1 | 5 | 5% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 11 |
| sample.Fire 1.0 | 3 | 3% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.9 | 136 / 210 | 2.27 | 19.9% | 38308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 19.9% | 136 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 21 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 11 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.1% | 28 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.9% | 2 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 19 / 35 | 6032 |
| 2 | 1 | 69.1 | 84.4 | 23 / 35 | 6286 |
| 3 | 1 | 68.5 | 83.2 | 21 / 35 | 6035 |
| 4 | 1 | 69.7 | 86.7 | 22 / 35 | 6529 |
| 5 | 1 | 70.1 | 88.3 | 26 / 35 | 6144 |
| 6 | 1 | 71.9 | 89.2 | 25 / 35 | 7282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 90% |
| stelo.SoJNanoMelee 1.1 | 40 | 78% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 40% | 82 |
| stelo.SoJNanoMelee 1.1 | 18 | 24% | 44 |
| tvv.micro.Antares 1.1.1 | 10 | 13% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 8% | 7 |
| tj.zombie1n 1.0.1 | 5 | 7% | 10 |
| yk.JahMicro 1.0 | 3 | 4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 15 |
| repositorio.NanoStep 1.0 | 1 | 1% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.5 | 78 / 210 | 3.93 | 15.1% | 28522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 15.1% | 78 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 45 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.3% | 29 |
| ahf.NanoAndrew .4 | 3.8 | 11.1% | 23 |
| zyx.nano.BacillusComma 1.0 | 5.8 | 9.7% | 12 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 4 |
| sam.Samspin 1.0 | 6.7 | 9.7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.8% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 73.0 | 15 / 35 | 5131 |
| 2 | 1 | 62.1 | 67.3 | 11 / 35 | 4689 |
| 3 | 1 | 60.9 | 62.2 | 11 / 35 | 4806 |
| 4 | 1 | 62.6 | 70.2 | 15 / 35 | 4663 |
| 5 | 1 | 61.4 | 67.3 | 14 / 35 | 4355 |
| 6 | 1 | 61.6 | 64.8 | 12 / 35 | 4878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 69% |
| simonton.nano.MeleeSeed 1.8 | 23 | 91% |
| ahf.NanoAndrew .4 | 21 | 67% |
| sam.Samspin 1.0 | 13 | 85% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 22 | 17% | 26 |
| oog.melee.Corsair 1.0 | 20 | 15% | 38 |
| simonton.nano.MeleeSeed 1.8 | 19 | 14% | 37 |
| ahf.NanoAndrew .4 | 19 | 14% | 35 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 15 |
| sam.Samspin 1.0 | 11 | 8% | 22 |
| EBBU.Sim2 1.02 | 9 | 7% | 13 |
| sample.TrackFire 1.0 | 4 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.1 | 118 / 210 | 2.79 | 17.8% | 31004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.8% | 118 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 45 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.6% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.0% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 6 |
| fm.claire 1.7 | 6.0 | 8.2% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.2% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 5 |
| kurios.DOSexe .9b | 9.3 | 5.9% | 0 |
| pa.Improved 1.0 | 9.3 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.3 | 18 / 35 | 5356 |
| 2 | 1 | 67.8 | 82.2 | 21 / 35 | 5407 |
| 3 | 1 | 65.6 | 74.9 | 18 / 35 | 5256 |
| 4 | 1 | 67.7 | 81.9 | 23 / 35 | 5310 |
| 5 | 1 | 66.7 | 79.7 | 18 / 35 | 4975 |
| 6 | 1 | 66.5 | 81.6 | 20 / 35 | 4700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 72% |
| oog.melee.CapuletDroid 1.1 | 29 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| gh.nano.Grofvuil 0.2 | 12 | 92% |
| sample.SpinBot 1.0 | 8 | 100% |
| fm.claire 1.7 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 36% | 80 |
| gh.nano.Grofvuil 0.2 | 20 | 21% | 33 |
| fm.claire 1.7 | 10 | 11% | 14 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 36 |
| arthord.NanoSatanMelee Beta | 8 | 9% | 14 |
| pa.Improved 1.0 | 4 | 4% | 11 |
| sample.SpinBot 1.0 | 4 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 9 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.0 | 83 / 210 | 2.98 | 17.0% | 32755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.2 | 17.0% | 83 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.1% | 44 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.2% | 35 |
| mz.MicroGodMelee 1 | 4.0 | 13.4% | 34 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.8% | 7 |
| acogdev.alpha 0.2 | 8.8 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 67.0 | 10 / 35 | 5031 |
| 2 | 1 | 65.6 | 75.9 | 13 / 35 | 5682 |
| 3 | 1 | 66.1 | 77.1 | 14 / 35 | 5771 |
| 4 | 1 | 67.8 | 82.9 | 20 / 35 | 5314 |
| 5 | 1 | 66.1 | 79.4 | 11 / 35 | 5453 |
| 6 | 1 | 68.1 | 85.7 | 15 / 35 | 5504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 76% |
| mz.MicroGodMelee 1 | 36 | 47% |
| gh.micro.Gruweltje 0.7 | 16 | 69% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 35 | 28% | 70 |
| mz.MicroGodMelee 1 | 33 | 26% | 44 |
| gh.micro.Gruweltje 0.7 | 28 | 22% | 45 |
| caimano.Furia_Ceca 0.22 | 18 | 14% | 22 |
| acogdev.alpha 0.2 | 5 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |

## Melee bench: F08

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 68.8 | 97 / 210 | 3.81 | 15.7% | 30452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.0% | 52 |
| hadur117.micro.SaorWNZ 0.1 | 1.8 | 15.7% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 12.7% | 26 |
| germ.TheMind .2 | 4.7 | 9.8% | 11 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 3 |
| awesomeness.Elite 1.0 | 7.2 | 8.3% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.5 | 22 / 35 | 5158 |
| 2 | 2 | 61.3 | 63.5 | 13 / 35 | 4926 |
| 3 | 2 | 61.7 | 63.5 | 15 / 35 | 4878 |
| 4 | 3 | 60.8 | 61.0 | 14 / 35 | 4945 |
| 5 | 2 | 63.5 | 69.2 | 15 / 35 | 5097 |
| 6 | 1 | 65.6 | 73.0 | 18 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| mym.EdgeStalker 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 40% | 91 |
| germ.TheMind .2 | 18 | 16% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 15% | 37 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 14 |
| awesomeness.Elite 1.0 | 7 | 6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 12 |
| mym.EdgeStalker 1.0 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 3 |

## Melee bench: F09

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.9 | 121 / 210 | 2.90 | 17.7% | 29267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.7% | 121 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 33 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 16 |
| maribo.IotaCT 1.1 | 3.8 | 10.9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 0 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.5% | 9 |
| spinnercat.Omen 1.0 | 7.8 | 8.2% | 5 |
| stelo.PatternRobot 1.0 | 8.0 | 8.3% | 7 |
| ratosh.Wesco 1.4 | 8.0 | 8.2% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.9 | 22 / 35 | 4770 |
| 2 | 1 | 67.0 | 77.1 | 20 / 35 | 4812 |
| 3 | 1 | 65.3 | 73.7 | 15 / 35 | 4757 |
| 4 | 1 | 66.8 | 77.8 | 20 / 35 | 4874 |
| 5 | 1 | 69.4 | 84.4 | 23 / 35 | 5420 |
| 6 | 1 | 67.4 | 78.7 | 21 / 35 | 4634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 57 | 86% |
| nz.jdc.nano.GridFu 1.0 | 28 | 96% |
| maribo.IotaCT 1.1 | 14 | 93% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 89 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 26 | 29% | 58 |
| timmit.nano.TimDog 0.33 | 15 | 17% | 28 |
| nz.jdc.nano.GridFu 1.0 | 13 | 15% | 53 |
| ratosh.Wesco 1.4 | 9 | 10% | 13 |
| stelo.PatternRobot 1.0 | 7 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 11 |
| maribo.IotaCT 1.1 | 6 | 7% | 21 |
| spinnercat.Omen 1.0 | 6 | 7% | 11 |

## Melee bench: F10

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.6 | 147 / 210 | 2.30 | 19.9% | 37443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 19.9% | 147 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.6% | 22 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 4 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 15 |
| sanja.First 0.1 | 6.3 | 8.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.4% | 3 |
| cvt.Firsty 1.0 | 8.2 | 6.9% | 9 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.4 | 23 / 35 | 6419 |
| 2 | 1 | 68.0 | 83.5 | 21 / 35 | 5800 |
| 3 | 1 | 68.6 | 81.3 | 24 / 35 | 6241 |
| 4 | 1 | 70.0 | 86.7 | 27 / 35 | 6165 |
| 5 | 1 | 71.8 | 93.7 | 31 / 35 | 6545 |
| 6 | 1 | 68.9 | 83.2 | 21 / 35 | 6273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 92% |
| baal.nano.N 1.42 | 34 | 91% |
| cvt.Firsty 1.0 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 91% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 32% | 38 |
| Grystrion.TrackerWO 1.0 | 9 | 14% | 27 |
| baal.nano.N 1.42 | 8 | 13% | 35 |
| cvt.Firsty 1.0 | 7 | 11% | 24 |
| tvv.nano.Polaris 1.2 | 5 | 8% | 39 |
| sanja.First 0.1 | 4 | 6% | 26 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 7 |
| sample.RamFire 1.0 | 3 | 5% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 63.1 | 65 / 210 | 4.32 | 14.2% | 30128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.5% | 77 |
| hadur117.micro.SaorWNZ 0.1 | 2.0 | 14.2% | 65 |
| cs.Wren 1.0 | 2.8 | 13.0% | 22 |
| js.PinBall 1.6 | 4.3 | 11.5% | 16 |
| mz.Cork 0.1 | 4.7 | 11.2% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 4 |
| evd.X1 0.01 | 6.7 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 69.8 | 12 / 35 | 5191 |
| 2 | 3 | 58.6 | 58.4 | 9 / 35 | 4627 |
| 3 | 2 | 60.7 | 61.0 | 8 / 35 | 5390 |
| 4 | 1 | 63.7 | 68.6 | 16 / 35 | 5401 |
| 5 | 2 | 60.5 | 61.9 | 11 / 35 | 4855 |
| 6 | 2 | 59.2 | 59.0 | 9 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 60% |
| cs.Wren 1.0 | 27 | 81% |
| js.PinBall 1.6 | 11 | 82% |
| mz.Cork 0.1 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 33% | 82 |
| joe.ADinosaur 1.0 | 24 | 17% | 25 |
| cs.Wren 1.0 | 23 | 16% | 37 |
| evd.X1 0.01 | 15 | 10% | 14 |
| js.PinBall 1.6 | 14 | 10% | 23 |
| mz.Cork 0.1 | 11 | 8% | 17 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.7 | 109 / 210 | 3.28 | 17.1% | 28991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.1% | 109 |
| myl.nano.Graviton 1.10 | 2.8 | 11.9% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.8% | 5 |
| ntc.Opposite 1.5 | 4.2 | 10.8% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.9% | 25 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 6 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 12 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.2 | 19 / 35 | 5154 |
| 2 | 1 | 63.5 | 70.8 | 16 / 35 | 4564 |
| 3 | 1 | 65.4 | 75.9 | 17 / 35 | 4797 |
| 4 | 1 | 63.9 | 72.1 | 16 / 35 | 4608 |
| 5 | 1 | 65.7 | 74.9 | 18 / 35 | 4920 |
| 6 | 1 | 67.3 | 79.4 | 23 / 35 | 4948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 86% |
| stelo.AreaTargetingBot 1.1 | 28 | 89% |
| donjezza.Muncho 1.0 | 14 | 100% |
| disan.Chair 2.2.0 | 11 | 73% |
| pfvicm.Sobieski 7.2.3b | 11 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| ntc.Opposite 1.5 | 10 | 80% |
| DBall.NUKE 0.1 | 9 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 24 | 24% | 30 |
| ntc.Opposite 1.5 | 18 | 18% | 24 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 40 |
| myl.nano.Graviton 1.10 | 13 | 13% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 20 |
| disan.Chair 2.2.0 | 9 | 9% | 20 |
| DBall.NUKE 0.1 | 4 | 4% | 18 |
| donjezza.Muncho 1.0 | 4 | 4% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 65.6 | 59 / 210 | 4.10 | 14.2% | 25599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 52 |
| hadur117.micro.SaorWNZ 0.1 | 2.3 | 14.2% | 59 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.3% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 24 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 9 |
| ejb.Polaris 1.0.1 | 5.5 | 11.0% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 2 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 68.3 | 10 / 35 | 4650 |
| 2 | 2 | 62.2 | 66.0 | 8 / 35 | 4570 |
| 3 | 4 | 59.5 | 62.5 | 8 / 35 | 3603 |
| 4 | 2 | 62.0 | 65.1 | 9 / 35 | 4450 |
| 5 | 1 | 63.1 | 69.5 | 13 / 35 | 4204 |
| 6 | 3 | 61.6 | 62.2 | 11 / 35 | 4122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 23 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 65% |
| yagami.Tidus 0.11 | 16 | 94% |
| kawigi.micro.Shiz 1.1 | 15 | 93% |
| ejb.Polaris 1.0.1 | 8 | 63% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 30% | 57 |
| yagami.Tidus 0.11 | 30 | 20% | 46 |
| kawigi.micro.Shiz 1.1 | 22 | 15% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 13% | 31 |
| ejb.Polaris 1.0.1 | 14 | 9% | 20 |
| stelo.MirrorNano 1.3 | 9 | 6% | 10 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.1 | 125 / 210 | 2.88 | 17.3% | 28200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.3% | 125 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 15 |
| wee.Gem 1.8.4 | 3.3 | 11.5% | 17 |
| ratosh.Nobo 0.21 | 3.8 | 11.3% | 14 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 23 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.2 | 20 / 35 | 5235 |
| 2 | 1 | 64.3 | 75.9 | 18 / 35 | 4381 |
| 3 | 1 | 64.2 | 72.7 | 21 / 35 | 4383 |
| 4 | 1 | 67.2 | 82.9 | 21 / 35 | 4906 |
| 5 | 1 | 64.1 | 74.9 | 19 / 35 | 4260 |
| 6 | 1 | 69.4 | 92.1 | 26 / 35 | 5035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 100% |
| wee.Gem 1.8.4 | 38 | 97% |
| ratosh.Nobo 0.21 | 18 | 83% |
| wompi.Quokka 1.6 | 13 | 77% |
| m3thos.Eva00 1.1 | 12 | 92% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 15 | 18% | 25 |
| ratosh.Nobo 0.21 | 14 | 16% | 21 |
| bzdp.Pansy 2.1 | 11 | 13% | 50 |
| wompi.Quokka 1.6 | 10 | 12% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 11% | 10 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 11 |
| maribo.FollowFire 1 | 7 | 8% | 7 |
| wee.Gem 1.8.4 | 6 | 7% | 52 |
| bayen.UbaMicro 1.4 | 5 | 6% | 10 |

## Melee bench: F15

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 86.6 | 134 / 210 | 2.20 | 20.9% | 45932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.9% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 18 |
| ayk.WallHugger 1.0 | 4.2 | 10.0% | 3 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.5% | 2 |
| stuff.Vlad 0.1 | 6.0 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 83.2 | 21 / 35 | 7427 |
| 2 | 1 | 71.9 | 86.0 | 22 / 35 | 7871 |
| 3 | 1 | 71.2 | 80.6 | 18 / 35 | 7702 |
| 4 | 1 | 73.1 | 91.4 | 23 / 35 | 7726 |
| 5 | 1 | 72.0 | 86.7 | 25 / 35 | 7252 |
| 6 | 1 | 73.4 | 91.7 | 25 / 35 | 7954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 89% |
| mz.NanoGod 2.02 | 19 | 79% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 5 | 80% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 39 | 51% | 55 |
| wompi.Wallaby 5.1 | 26 | 34% | 128 |
| exauge.GateKeeper 1.1.121g | 6 | 8% | 10 |
| ayk.WallHugger 1.0 | 4 | 5% | 10 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.8 | 93 / 210 | 3.81 | 15.7% | 28548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 15.7% | 93 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 31 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 26 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 10 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 7 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.6 | 18 / 35 | 4386 |
| 2 | 1 | 66.7 | 78.1 | 21 / 35 | 4941 |
| 3 | 1 | 60.6 | 63.2 | 11 / 35 | 4452 |
| 4 | 1 | 61.0 | 61.6 | 13 / 35 | 4626 |
| 5 | 1 | 63.3 | 65.1 | 15 / 35 | 5234 |
| 6 | 1 | 63.8 | 70.2 | 15 / 35 | 4909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 82% |
| dummy.micro.Sparrow 2.5 | 25 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 94% |
| bvh.micro.Freya 0.3 | 14 | 93% |
| stelo.MirrorMicro 1.0 | 7 | 71% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 117 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 24% | 59 |
| dummy.micro.Sparrow 2.5 | 21 | 18% | 45 |
| conscience.Electron 1.3g | 15 | 13% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 12% | 32 |
| stelo.MirrorMicro 1.0 | 12 | 10% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 9% | 10 |
| bvh.micro.Freya 0.3 | 9 | 8% | 15 |
| dl.BetterWalls 1.0 | 7 | 6% | 13 |

## Melee bench: F17

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.1 | 130 / 210 | 2.43 | 20.2% | 42145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.2% | 130 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 24 |
| sul.Lunar 1.1 | 3.2 | 12.5% | 21 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.7% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.1% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.Corners 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.9 | 19 / 35 | 6602 |
| 2 | 1 | 69.5 | 79.4 | 21 / 35 | 7343 |
| 3 | 1 | 69.6 | 81.9 | 21 / 35 | 6567 |
| 4 | 1 | 72.3 | 90.5 | 28 / 35 | 7526 |
| 5 | 1 | 70.6 | 82.5 | 23 / 35 | 7345 |
| 6 | 1 | 70.4 | 87.3 | 18 / 35 | 6762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 81% |
| supersample.SuperBoxBot 1.0 | 26 | 81% |
| dsw.StaticD 1.0 | 12 | 67% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 33 | 41% | 54 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 23% | 51 |
| mme.NikeEnhanced 2.0 | 8 | 10% | 12 |
| sul.Lunar 1.1 | 5 | 6% | 48 |
| dsw.StaticD 1.0 | 5 | 6% | 15 |
| tlp.ThreeLeggedPig 1 | 4 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 9 |
| sample.Corners 1.0 | 3 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F18

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.5 | 82 / 210 | 3.56 | 16.2% | 34620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 16.2% | 82 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.4% | 30 |
| mld.Wisdom 1.0 | 3.5 | 12.3% | 26 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 9 |
| amz.NanoClone 1.41 | 5.8 | 9.9% | 10 |
| sample.Walls 1.0 | 7.2 | 8.2% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 71.4 | 13 / 35 | 5769 |
| 2 | 1 | 65.3 | 76.2 | 12 / 35 | 5788 |
| 3 | 1 | 64.0 | 68.3 | 15 / 35 | 5627 |
| 4 | 1 | 64.7 | 71.4 | 15 / 35 | 5738 |
| 5 | 1 | 65.4 | 74.6 | 14 / 35 | 6070 |
| 6 | 1 | 63.4 | 67.3 | 13 / 35 | 5628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 78% |
| radnor.DoctorBob 1.42 | 29 | 66% |
| mld.Wisdom 1.0 | 16 | 56% |
| sample.Walls 1.0 | 10 | 100% |
| amz.NanoClone 1.41 | 9 | 78% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 24% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 23% | 58 |
| radnor.DoctorBob 1.42 | 28 | 22% | 49 |
| KiraNL.Chupacabra 0.4 | 15 | 12% | 21 |
| amz.NanoClone 1.41 | 14 | 11% | 21 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

