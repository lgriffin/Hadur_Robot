# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.6 | 148 / 210 | 1.93 | 21.7% | 44579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.7% | 148 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 25 |
| mz.AntiGrav 1.0 | 2.8 | 14.4% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 3 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.3 | 26 / 35 | 7540 |
| 2 | 1 | 72.8 | 90.2 | 26 / 35 | 7257 |
| 3 | 1 | 72.9 | 91.4 | 23 / 35 | 7664 |
| 4 | 1 | 72.8 | 87.3 | 22 / 35 | 7854 |
| 5 | 1 | 72.6 | 89.2 | 25 / 35 | 7450 |
| 6 | 1 | 72.7 | 91.4 | 26 / 35 | 6814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 92% |
| radnor.DoctorBob 1.42 | 40 | 78% |
| mld.Infinity 2.2 | 33 | 91% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 46% | 69 |
| mz.AntiGrav 1.0 | 14 | 22% | 74 |
| mld.Infinity 2.2 | 8 | 13% | 36 |
| amz.NanoClone 1.41 | 8 | 13% | 16 |
| arthord.MannyPacquiao Beta | 2 | 3% | 2 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| sample.Walls 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.3 | 128 / 210 | 2.23 | 19.1% | 33827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.1% | 128 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 45 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 19 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 2 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.2% | 6 |
| fullsail.SweetTea 1.1 | 7.5 | 7.0% | 6 |
| bzdp.BoxCar 2.0 | 8.7 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 25 / 35 | 6114 |
| 2 | 1 | 69.5 | 87.6 | 23 / 35 | 5896 |
| 3 | 1 | 67.1 | 81.9 | 15 / 35 | 5178 |
| 4 | 1 | 68.5 | 82.9 | 21 / 35 | 6186 |
| 5 | 1 | 68.4 | 85.1 | 20 / 35 | 5524 |
| 6 | 1 | 68.5 | 87.0 | 24 / 35 | 4929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 71 | 89% |
| oog.melee.Mercutio 1.0 | 58 | 64% |
| fullsail.SweetTea 1.1 | 10 | 90% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 34% | 73 |
| mld.DustBunny 3.8 | 23 | 28% | 78 |
| zyx.nano.Ant 1.1 | 8 | 10% | 11 |
| maribo.melee.BMV 0.1 | 6 | 7% | 14 |
| fullsail.SweetTea 1.1 | 6 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 11 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| cs.Grudge 1.0 | 2 | 2% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 80.0 | 123 / 210 | 2.80 | 19.4% | 37019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.4% | 123 |
| myl.micro.Troodon 1.10 | 2.7 | 13.5% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 3.2 | 11.3% | 24 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.1% | 12 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 4 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.2% | 11 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 6 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 81.6 | 20 / 35 | 6098 |
| 2 | 1 | 70.0 | 81.0 | 22 / 35 | 6412 |
| 3 | 1 | 67.3 | 74.0 | 16 / 35 | 5870 |
| 4 | 1 | 69.9 | 83.2 | 22 / 35 | 6135 |
| 5 | 1 | 67.1 | 74.3 | 19 / 35 | 5725 |
| 6 | 1 | 71.1 | 86.0 | 24 / 35 | 6779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 82% |
| myl.nano.KomoriNinja 1.1 | 17 | 100% |
| cb.nano.Insomnia 1.0 | 16 | 100% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 30% | 49 |
| myl.micro.Troodon 1.10 | 17 | 20% | 57 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 33 |
| cb.nano.Insomnia 1.0 | 9 | 10% | 16 |
| fm.mammillarias 1.3 | 7 | 8% | 13 |
| sample.Fire 1.0 | 6 | 7% | 9 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sample.Tracker 1.0 | 5 | 6% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 16 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.6 | 156 / 210 | 2.12 | 20.9% | 39846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.9% | 156 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.3% | 1 |
| tj.zombie1n 1.0.1 | 6.2 | 8.4% | 6 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 96.2 | 28 / 35 | 7412 |
| 2 | 1 | 71.0 | 86.7 | 27 / 35 | 6772 |
| 3 | 1 | 70.6 | 84.4 | 26 / 35 | 6614 |
| 4 | 1 | 68.5 | 77.1 | 24 / 35 | 6257 |
| 5 | 1 | 71.5 | 91.1 | 27 / 35 | 6430 |
| 6 | 1 | 70.7 | 89.8 | 24 / 35 | 6361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 78 | 96% |
| stelo.SoJNanoMelee 1.1 | 31 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 100% |
| tvv.micro.Antares 1.1.1 | 21 | 81% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 50% | 98 |
| stelo.SoJNanoMelee 1.1 | 7 | 13% | 30 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 24 |
| tj.zombie1n 1.0.1 | 5 | 9% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 27 |
| repositorio.NanoStep 1.0 | 2 | 4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 5 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |
| yk.JahMicro 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.6 | 103 / 210 | 3.29 | 17.4% | 32209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.4% | 103 |
| oog.melee.Corsair 1.0 | 2.7 | 12.5% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 11.5% | 25 |
| ahf.NanoAndrew .4 | 3.8 | 11.4% | 26 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.2% | 5 |
| EBBU.Sim2 1.02 | 6.3 | 9.4% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 66.3 | 15 / 35 | 4795 |
| 2 | 1 | 67.7 | 79.4 | 19 / 35 | 5659 |
| 3 | 1 | 65.3 | 74.6 | 15 / 35 | 5072 |
| 4 | 1 | 66.7 | 77.8 | 19 / 35 | 5390 |
| 5 | 1 | 68.9 | 81.9 | 20 / 35 | 6052 |
| 6 | 1 | 63.9 | 67.6 | 15 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 45 | 84% |
| oog.melee.Corsair 1.0 | 34 | 56% |
| ahf.NanoAndrew .4 | 22 | 86% |
| EBBU.Sim2 1.02 | 7 | 100% |
| sam.Samspin 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 23% | 44 |
| simonton.nano.MeleeSeed 1.8 | 23 | 21% | 55 |
| ahf.NanoAndrew .4 | 16 | 15% | 39 |
| zyx.nano.BacillusComma 1.0 | 13 | 12% | 15 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 20 |
| sam.Samspin 1.0 | 9 | 8% | 15 |
| EBBU.Sim2 1.02 | 7 | 6% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 5% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.9 | 131 / 210 | 2.36 | 19.4% | 34454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.4% | 131 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.6% | 40 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 6 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 4 |
| fm.claire 1.7 | 6.0 | 8.4% | 1 |
| sample.SpinBot 1.0 | 8.8 | 5.8% | 0 |
| pa.Improved 1.0 | 8.8 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.4 | 26 / 35 | 6348 |
| 2 | 1 | 70.9 | 89.2 | 27 / 35 | 6217 |
| 3 | 1 | 67.8 | 79.0 | 22 / 35 | 5430 |
| 4 | 1 | 67.5 | 79.0 | 15 / 35 | 5753 |
| 5 | 1 | 70.2 | 91.4 | 22 / 35 | 5503 |
| 6 | 1 | 67.0 | 79.4 | 19 / 35 | 5203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 82% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| gh.nano.Grofvuil 0.2 | 14 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 4 | 75% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 42% | 96 |
| oog.melee.CapuletDroid 1.1 | 13 | 16% | 29 |
| gh.nano.Grofvuil 0.2 | 12 | 15% | 36 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 12 |
| fm.claire 1.7 | 3 | 4% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 4 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 82.2 | 114 / 210 | 2.60 | 19.0% | 37033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.0% | 114 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.4% | 29 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 33 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 2 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.2 | 5.9% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 76.5 | 14 / 35 | 5565 |
| 2 | 1 | 70.4 | 84.4 | 22 / 35 | 6801 |
| 3 | 1 | 68.4 | 81.9 | 19 / 35 | 5855 |
| 4 | 1 | 67.6 | 78.1 | 16 / 35 | 5971 |
| 5 | 1 | 69.4 | 84.1 | 22 / 35 | 6176 |
| 6 | 1 | 70.6 | 87.9 | 21 / 35 | 6665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 71 | 90% |
| mz.MicroGodMelee 1 | 30 | 60% |
| gh.micro.Gruweltje 0.7 | 22 | 77% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 27 | 28% | 82 |
| gh.micro.Gruweltje 0.7 | 24 | 25% | 48 |
| mz.MicroGodMelee 1 | 24 | 25% | 41 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| el.JumpShoot 0.2 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 14 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.1 | 101 / 210 | 3.78 | 16.3% | 30790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.3% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 34 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.9% | 8 |
| germ.TheMind .2 | 5.2 | 9.7% | 6 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 9 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 58.1 | 14 / 35 | 5178 |
| 2 | 1 | 66.5 | 75.6 | 18 / 35 | 5391 |
| 3 | 1 | 62.8 | 64.4 | 15 / 35 | 4831 |
| 4 | 1 | 65.0 | 70.8 | 18 / 35 | 4992 |
| 5 | 1 | 63.7 | 66.3 | 15 / 35 | 5138 |
| 6 | 1 | 67.5 | 79.4 | 21 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| awesomeness.Elite 1.0 | 6 | 100% |
| germ.TheMind .2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 45% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 18% | 35 |
| germ.TheMind .2 | 14 | 13% | 25 |
| awesomeness.Elite 1.0 | 10 | 9% | 19 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 7 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.8 | 152 / 210 | 2.10 | 20.1% | 31829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.1% | 152 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.6% | 11 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 11 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.1% | 2 |
| stelo.PatternRobot 1.0 | 7.2 | 8.3% | 5 |
| ratosh.Wesco 1.4 | 7.5 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 8.8 | 6.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.4 | 24 / 35 | 4955 |
| 2 | 1 | 71.6 | 89.2 | 28 / 35 | 5872 |
| 3 | 1 | 69.1 | 83.2 | 23 / 35 | 5054 |
| 4 | 1 | 72.2 | 94.3 | 28 / 35 | 5966 |
| 5 | 1 | 70.2 | 88.6 | 23 / 35 | 4783 |
| 6 | 1 | 70.1 | 86.3 | 26 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 92% |
| nz.jdc.nano.GridFu 1.0 | 27 | 96% |
| stelo.PatternRobot 1.0 | 24 | 92% |
| timmit.nano.TimDog 0.33 | 21 | 62% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 15 | 26% | 35 |
| rz.HawkOnFire 0.1 | 13 | 22% | 66 |
| stelo.PatternRobot 1.0 | 8 | 14% | 24 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 40 |
| ratosh.Wesco 1.4 | 7 | 12% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 7 |
| spinnercat.Omen 1.0 | 3 | 5% | 5 |
| maribo.IotaCT 1.1 | 1 | 2% | 11 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 89.5 | 164 / 210 | 1.95 | 21.5% | 41554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.5% | 164 |
| baal.nano.N 1.42 | 2.3 | 12.0% | 9 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.7% | 16 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 2 |
| sanja.First 0.1 | 5.3 | 9.2% | 6 |
| zyx.micro.Ant 1.1 | 5.7 | 8.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 0 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 2 |
| cvt.Firsty 1.0 | 8.5 | 6.8% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 31 / 35 | 6777 |
| 2 | 1 | 71.0 | 90.5 | 25 / 35 | 6553 |
| 3 | 1 | 70.7 | 86.0 | 23 / 35 | 6956 |
| 4 | 1 | 72.3 | 92.7 | 30 / 35 | 7050 |
| 5 | 1 | 71.7 | 88.6 | 27 / 35 | 7183 |
| 6 | 1 | 71.3 | 86.3 | 28 / 35 | 7035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 86% |
| sanja.First 0.1 | 32 | 97% |
| tvv.nano.Polaris 1.2 | 29 | 97% |
| cvt.Firsty 1.0 | 19 | 89% |
| Grystrion.TrackerWO 1.0 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| zyx.micro.Ant 1.1 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 13 | 28% | 45 |
| zyx.micro.Ant 1.1 | 7 | 15% | 31 |
| tvv.nano.Polaris 1.2 | 6 | 13% | 53 |
| cvt.Firsty 1.0 | 5 | 11% | 27 |
| sanja.First 0.1 | 5 | 11% | 24 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 12 |
| sample.RamFire 1.0 | 3 | 7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.8 | 89 / 210 | 3.54 | 16.4% | 33094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.4% | 89 |
| kc.micro.Figment 1.0 | 2.0 | 15.3% | 62 |
| cs.Wren 1.0 | 3.0 | 13.5% | 29 |
| js.PinBall 1.6 | 4.3 | 10.8% | 10 |
| mz.Cork 0.1 | 4.8 | 10.7% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 8.3% | 4 |
| evd.X1 0.01 | 6.8 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 7.7 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 73.3 | 16 / 35 | 5391 |
| 2 | 1 | 65.1 | 72.4 | 14 / 35 | 5393 |
| 3 | 1 | 64.4 | 68.6 | 14 / 35 | 5663 |
| 4 | 1 | 65.4 | 72.4 | 17 / 35 | 5656 |
| 5 | 1 | 66.3 | 75.9 | 16 / 35 | 5713 |
| 6 | 1 | 63.4 | 68.3 | 12 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 69% |
| cs.Wren 1.0 | 24 | 88% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 8 | 63% |
| donjezza.Jezza 1.0 | 3 | 67% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 47% | 105 |
| cs.Wren 1.0 | 18 | 15% | 31 |
| joe.ADinosaur 1.0 | 12 | 10% | 13 |
| mz.Cork 0.1 | 11 | 9% | 16 |
| evd.X1 0.01 | 7 | 6% | 8 |
| js.PinBall 1.6 | 6 | 5% | 16 |
| jsal.Jsalbot 1.0 | 4 | 3% | 13 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.9 | 136 / 210 | 2.36 | 19.5% | 31496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.5% | 136 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 23 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.3 | 7.8% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 5 |
| pbg.R2D2 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.7 | 23 / 35 | 5658 |
| 2 | 1 | 70.4 | 88.9 | 24 / 35 | 5462 |
| 3 | 1 | 68.3 | 83.2 | 22 / 35 | 4986 |
| 4 | 1 | 66.5 | 74.9 | 19 / 35 | 4987 |
| 5 | 1 | 69.5 | 88.3 | 25 / 35 | 5102 |
| 6 | 1 | 69.4 | 87.3 | 23 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 91% |
| ntc.Opposite 1.5 | 29 | 86% |
| stelo.AreaTargetingBot 1.1 | 23 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 89% |
| donjezza.Muncho 1.0 | 14 | 86% |
| DBall.NUKE 0.1 | 10 | 100% |
| disan.Chair 2.2.0 | 9 | 78% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 75 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 21% | 28 |
| myl.nano.Graviton 1.10 | 15 | 20% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 19% | 31 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 32 |
| ntc.Opposite 1.5 | 8 | 11% | 26 |
| disan.Chair 2.2.0 | 5 | 7% | 14 |
| DBall.NUKE 0.1 | 2 | 3% | 14 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.7 | 82 / 210 | 3.37 | 15.9% | 25925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.5 | 15.9% | 82 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.2% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 25 |
| yagami.Tidus 0.11 | 3.8 | 12.6% | 16 |
| oog.melee.Capulet 1.2 | 3.8 | 12.8% | 41 |
| ejb.Polaris 1.0.1 | 6.0 | 9.5% | 4 |
| stelo.MirrorNano 1.3 | 7.0 | 8.2% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.1% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.6 | 19 / 35 | 4692 |
| 2 | 4 | 59.0 | 58.7 | 8 / 35 | 3786 |
| 3 | 1 | 66.5 | 78.4 | 16 / 35 | 4630 |
| 4 | 1 | 64.8 | 70.5 | 16 / 35 | 4574 |
| 5 | 1 | 65.3 | 76.5 | 14 / 35 | 4084 |
| 6 | 1 | 64.5 | 76.5 | 9 / 35 | 4159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 75% |
| yagami.Tidus 0.11 | 25 | 84% |
| kawigi.micro.Shiz 1.1 | 24 | 96% |
| oog.melee.Capulet 1.2 | 24 | 46% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 27% | 48 |
| yagami.Tidus 0.11 | 27 | 21% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 46 |
| kawigi.micro.Shiz 1.1 | 17 | 13% | 33 |
| ejb.Polaris 1.0.1 | 13 | 10% | 21 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.2 | 136 / 210 | 2.69 | 18.0% | 28873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.0% | 136 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 18 |
| ratosh.Nobo 0.21 | 3.7 | 11.4% | 12 |
| wee.Gem 1.8.4 | 4.0 | 11.1% | 15 |
| wompi.Quokka 1.6 | 4.8 | 10.3% | 11 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 8.9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 22 / 35 | 5064 |
| 2 | 1 | 66.0 | 77.8 | 21 / 35 | 4602 |
| 3 | 1 | 68.2 | 84.1 | 24 / 35 | 5067 |
| 4 | 1 | 64.2 | 72.7 | 19 / 35 | 4396 |
| 5 | 1 | 69.3 | 87.6 | 29 / 35 | 5117 |
| 6 | 1 | 66.0 | 78.4 | 21 / 35 | 4627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 89% |
| wee.Gem 1.8.4 | 29 | 100% |
| ratosh.Nobo 0.21 | 20 | 90% |
| m3thos.Eva00 1.1 | 12 | 92% |
| wompi.Quokka 1.6 | 10 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 74 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 23% | 70 |
| ratosh.Nobo 0.21 | 12 | 16% | 31 |
| wee.Gem 1.8.4 | 9 | 12% | 36 |
| maribo.FollowFire 1 | 9 | 12% | 9 |
| wompi.Quokka 1.6 | 6 | 8% | 17 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 8 |
| bayen.UbaMicro 1.4 | 5 | 7% | 14 |
| m3thos.Eva00 1.1 | 4 | 5% | 15 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 89.6 | 135 / 210 | 1.94 | 22.4% | 51152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.4% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 50 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 14 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 7 |
| ayk.WallHugger 1.0 | 5.2 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.2 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.5 | 18 / 35 | 7794 |
| 2 | 1 | 74.3 | 90.8 | 23 / 35 | 8778 |
| 3 | 1 | 74.3 | 90.5 | 22 / 35 | 8707 |
| 4 | 1 | 72.7 | 86.3 | 21 / 35 | 8273 |
| 5 | 1 | 74.4 | 92.7 | 25 / 35 | 8565 |
| 6 | 1 | 75.2 | 93.7 | 26 / 35 | 9035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 126 | 83% |
| mz.NanoGod 2.02 | 20 | 75% |
| exauge.GateKeeper 1.1.121g | 14 | 64% |
| ayk.WallHugger 1.0 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 47% | 136 |
| mz.NanoGod 2.02 | 24 | 32% | 43 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 12 |
| stuff.Vlad 0.1 | 3 | 4% | 10 |
| ayk.WallHugger 1.0 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.5 | 106 / 210 | 3.57 | 16.4% | 28879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.4% | 106 |
| dummy.micro.Sparrow 2.5 | 2.5 | 12.7% | 26 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.4% | 19 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.1% | 13 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.4% | 10 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 9.0 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.6 | 18 / 35 | 5021 |
| 2 | 1 | 67.1 | 80.3 | 24 / 35 | 4768 |
| 3 | 1 | 64.5 | 71.1 | 18 / 35 | 4863 |
| 4 | 1 | 66.5 | 77.1 | 18 / 35 | 5326 |
| 5 | 1 | 60.8 | 60.3 | 15 / 35 | 4444 |
| 6 | 1 | 60.7 | 59.4 | 13 / 35 | 4457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 93% |
| dummy.micro.Sparrow 2.5 | 33 | 88% |
| bvh.micro.Freya 0.3 | 22 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 88% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 21 | 20% | 49 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 21 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 33 |
| bvh.micro.Freya 0.3 | 13 | 13% | 27 |
| conscience.Electron 1.3g | 13 | 13% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |
| dl.BetterWalls 1.0 | 3 | 3% | 6 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.1 | 145 / 210 | 2.34 | 21.5% | 44813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.5% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.3% | 22 |
| sul.Lunar 1.1 | 2.8 | 12.0% | 19 |
| supersample.SuperBoxBot 1.0 | 4.5 | 9.9% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 1 |
| dsw.StaticD 1.0 | 5.7 | 8.3% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.7% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 4 |
| sample.Corners 1.0 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 83.8 | 26 / 35 | 7608 |
| 2 | 1 | 72.3 | 87.0 | 26 / 35 | 7465 |
| 3 | 1 | 69.7 | 75.6 | 22 / 35 | 7112 |
| 4 | 1 | 71.6 | 83.8 | 23 / 35 | 7337 |
| 5 | 1 | 73.3 | 92.7 | 24 / 35 | 7817 |
| 6 | 1 | 72.1 | 87.9 | 24 / 35 | 7474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 90% |
| supersample.SuperBoxBot 1.0 | 20 | 85% |
| sample.MyFirstRobot 1.0 | 12 | 100% |
| dsw.StaticD 1.0 | 11 | 64% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 19 | 29% | 58 |
| supersample.SuperBoxBot 1.0 | 16 | 24% | 30 |
| dsw.StaticD 1.0 | 10 | 15% | 20 |
| sul.Lunar 1.1 | 8 | 12% | 62 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 8 |
| sample.Corners 1.0 | 3 | 5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 80.7 | 112 / 210 | 2.74 | 19.1% | 41303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.1% | 112 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 31 |
| mld.Wisdom 1.0 | 3.2 | 12.3% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.8% | 21 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.1% | 5 |
| amz.NanoClone 1.41 | 5.3 | 10.2% | 10 |
| sample.Walls 1.0 | 7.3 | 7.6% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 82.9 | 20 / 35 | 7319 |
| 2 | 1 | 66.5 | 73.0 | 14 / 35 | 6571 |
| 3 | 1 | 68.7 | 80.3 | 19 / 35 | 6625 |
| 4 | 1 | 69.9 | 84.1 | 21 / 35 | 7155 |
| 5 | 1 | 67.1 | 78.1 | 17 / 35 | 6335 |
| 6 | 1 | 70.8 | 85.7 | 21 / 35 | 7298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 90% |
| mld.Wisdom 1.0 | 21 | 67% |
| amz.NanoClone 1.41 | 16 | 81% |
| KiraNL.Chupacabra 0.4 | 14 | 100% |
| sample.Walls 1.0 | 7 | 86% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 30% | 42 |
| radnor.DoctorBob 1.42 | 23 | 23% | 61 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 40 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 25 |
| amz.NanoClone 1.41 | 10 | 10% | 18 |
| sample.Walls 1.0 | 6 | 6% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

