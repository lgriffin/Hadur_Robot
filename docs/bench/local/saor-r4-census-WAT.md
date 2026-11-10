# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.0 | 150 / 210 | 2.17 | 20.8% | 40705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.8% | 150 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 16 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 23 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 1 |
| sample.Walls 1.0 | 6.5 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.7% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 79.4 | 20 / 35 | 6682 |
| 2 | 1 | 71.4 | 86.3 | 24 / 35 | 6863 |
| 3 | 1 | 72.0 | 86.7 | 27 / 35 | 7104 |
| 4 | 1 | 70.3 | 83.8 | 25 / 35 | 6138 |
| 5 | 1 | 73.4 | 93.7 | 27 / 35 | 7085 |
| 6 | 1 | 72.2 | 92.4 | 27 / 35 | 6833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 94% |
| radnor.DoctorBob 1.42 | 41 | 88% |
| mld.Infinity 2.2 | 27 | 100% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 23 | 38% | 90 |
| radnor.DoctorBob 1.42 | 19 | 32% | 62 |
| mld.Infinity 2.2 | 5 | 8% | 35 |
| amz.NanoClone 1.41 | 4 | 7% | 6 |
| jangs.ns51 1.0 | 3 | 5% | 5 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| sample.Walls 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.1 | 118 / 210 | 2.61 | 17.9% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.9% | 118 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.9% | 50 |
| mld.DustBunny 3.8 | 3.0 | 13.4% | 20 |
| maribo.melee.BMV 0.1 | 3.8 | 10.5% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.2% | 11 |
| bzdp.BoxCar 2.0 | 8.2 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.2% | 5 |
| cs.Grudge 1.0 | 9.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.1 | 21 / 35 | 5129 |
| 2 | 1 | 67.1 | 81.3 | 18 / 35 | 5142 |
| 3 | 1 | 65.1 | 78.7 | 17 / 35 | 4535 |
| 4 | 1 | 70.7 | 95.2 | 29 / 35 | 5297 |
| 5 | 1 | 67.5 | 82.9 | 19 / 35 | 5110 |
| 6 | 1 | 65.7 | 70.2 | 14 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 77% |
| mld.DustBunny 3.8 | 54 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 67% |

Hadur died in 93 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 39% | 81 |
| mld.DustBunny 3.8 | 23 | 25% | 63 |
| zyx.nano.Ant 1.1 | 9 | 10% | 13 |
| fullsail.SweetTea 1.1 | 7 | 8% | 12 |
| maribo.melee.BMV 0.1 | 6 | 6% | 14 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 13 |
| cs.Grudge 1.0 | 4 | 4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 84.6 | 137 / 210 | 2.39 | 19.9% | 35696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.9% | 137 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.1% | 17 |
| fm.mammillarias 1.3 | 5.5 | 9.4% | 3 |
| cb.nano.Insomnia 1.0 | 5.8 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.0 | 8.8% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 3 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.4 | 21 / 35 | 5876 |
| 2 | 1 | 71.1 | 87.0 | 23 / 35 | 6482 |
| 3 | 1 | 70.7 | 88.6 | 25 / 35 | 5827 |
| 4 | 1 | 70.1 | 86.7 | 23 / 35 | 5679 |
| 5 | 1 | 67.9 | 79.0 | 22 / 35 | 5406 |
| 6 | 1 | 69.9 | 81.6 | 23 / 35 | 6426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 82% |
| sp.Nanos.Ember 1.1 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 6 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 19% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 18% | 36 |
| fm.mammillarias 1.3 | 11 | 15% | 17 |
| cb.nano.Insomnia 1.0 | 11 | 15% | 16 |
| sp.Nanos.Ember 1.1 | 7 | 10% | 20 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 31 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 14 |
| sample.Fire 1.0 | 4 | 5% | 7 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.6 | 156 / 210 | 2.12 | 21.0% | 40085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.0% | 156 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.1% | 10 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.0% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.2% | 12 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 1 |
| yk.JahMicro 1.0 | 6.5 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 27 / 35 | 6784 |
| 2 | 1 | 70.7 | 86.7 | 26 / 35 | 6653 |
| 3 | 1 | 71.1 | 87.3 | 26 / 35 | 6708 |
| 4 | 1 | 69.6 | 84.8 | 25 / 35 | 6248 |
| 5 | 1 | 70.9 | 86.0 | 26 / 35 | 6650 |
| 6 | 1 | 71.3 | 88.3 | 26 / 35 | 7042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 91% |
| stelo.SoJNanoMelee 1.1 | 40 | 90% |
| tvv.micro.Antares 1.1.1 | 27 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 83% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 44% | 88 |
| stelo.SoJNanoMelee 1.1 | 10 | 19% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 18 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 30 |
| tj.zombie1n 1.0.1 | 4 | 7% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 7 |
| sample.VelociRobot 1.0 | 2 | 4% | 10 |
| yk.JahMicro 1.0 | 1 | 2% | 11 |
| repositorio.NanoStep 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.6 | 94 / 210 | 3.83 | 16.0% | 29598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.0% | 94 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 29 |
| ahf.NanoAndrew .4 | 3.7 | 11.7% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.1% | 25 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.4% | 9 |
| sam.Samspin 1.0 | 6.5 | 9.5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.5 | 16 / 35 | 5082 |
| 2 | 1 | 63.4 | 67.0 | 15 / 35 | 5035 |
| 3 | 1 | 63.5 | 66.0 | 15 / 35 | 4912 |
| 4 | 1 | 62.4 | 65.4 | 16 / 35 | 4317 |
| 5 | 1 | 65.2 | 72.1 | 15 / 35 | 5396 |
| 6 | 1 | 64.8 | 71.4 | 17 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 72% |
| simonton.nano.MeleeSeed 1.8 | 26 | 88% |
| ahf.NanoAndrew .4 | 20 | 85% |
| EBBU.Sim2 1.02 | 10 | 80% |
| sam.Samspin 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 8 | 63% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 21% | 49 |
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 47 |
| EBBU.Sim2 1.02 | 15 | 13% | 24 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 12 |
| ahf.NanoAndrew .4 | 10 | 8% | 28 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 11 |
| sam.Samspin 1.0 | 6 | 5% | 13 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.0 | 142 / 210 | 2.35 | 19.2% | 32753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.2% | 142 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 27 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.0% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 5 |
| fm.claire 1.7 | 5.7 | 8.8% | 2 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.3% | 5 |
| sample.SpinBot 1.0 | 8.0 | 6.8% | 3 |
| kurios.DOSexe .9b | 9.3 | 5.4% | 0 |
| pa.Improved 1.0 | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.7 | 20 / 35 | 5539 |
| 2 | 1 | 65.9 | 74.6 | 21 / 35 | 4909 |
| 3 | 1 | 70.9 | 93.0 | 27 / 35 | 5807 |
| 4 | 1 | 69.1 | 87.6 | 25 / 35 | 5138 |
| 5 | 1 | 71.6 | 93.7 | 28 / 35 | 6058 |
| 6 | 1 | 67.8 | 82.2 | 21 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 88% |
| oog.melee.CapuletDroid 1.1 | 40 | 98% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| fm.claire 1.7 | 10 | 100% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 36% | 77 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 35 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 16 |
| fm.claire 1.7 | 7 | 10% | 12 |
| sample.SpinBot 1.0 | 5 | 7% | 6 |
| oog.melee.CapuletDroid 1.1 | 4 | 6% | 43 |
| pa.Improved 1.0 | 3 | 4% | 7 |
| kurios.DOSexe .9b | 2 | 3% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.9 | 100 / 210 | 2.72 | 18.2% | 34393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.2% | 100 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 24 |
| mz.MicroGodMelee 1 | 3.5 | 13.7% | 41 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 9 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 1 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 20 / 35 | 5541 |
| 2 | 1 | 68.7 | 83.8 | 17 / 35 | 6047 |
| 3 | 1 | 66.2 | 74.3 | 14 / 35 | 5630 |
| 4 | 1 | 69.5 | 85.1 | 17 / 35 | 6109 |
| 5 | 1 | 69.0 | 85.1 | 17 / 35 | 5934 |
| 6 | 1 | 65.8 | 73.7 | 15 / 35 | 5132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 87% |
| mz.MicroGodMelee 1 | 42 | 57% |
| gh.micro.Gruweltje 0.7 | 24 | 79% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 35 | 32% | 66 |
| gh.micro.Gruweltje 0.7 | 29 | 26% | 51 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 58 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 9 |
| acogdev.alpha 0.2 | 5 | 5% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 71.7 | 106 / 210 | 3.54 | 16.7% | 29922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.7% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.1% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.1% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 6 |
| germ.TheMind .2 | 4.8 | 9.6% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 12 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 70.8 | 18 / 35 | 4621 |
| 2 | 1 | 65.0 | 72.7 | 16 / 35 | 4804 |
| 3 | 1 | 66.0 | 71.4 | 19 / 35 | 5390 |
| 4 | 1 | 63.4 | 67.6 | 16 / 35 | 4783 |
| 5 | 1 | 64.8 | 70.8 | 17 / 35 | 4927 |
| 6 | 1 | 67.4 | 77.1 | 20 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| awesomeness.Elite 1.0 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 44% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 31 |
| germ.TheMind .2 | 10 | 10% | 19 |
| awesomeness.Elite 1.0 | 10 | 10% | 14 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 10 |
| sample.Crazy 1.0 | 4 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.0 | 161 / 210 | 1.81 | 20.5% | 30618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.5% | 161 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 8 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 9 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.4% | 0 |
| spinnercat.Omen 1.0 | 7.0 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 8.1% | 7 |
| ratosh.Wesco 1.4 | 7.7 | 7.9% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.6 | 27 / 35 | 5242 |
| 2 | 1 | 71.0 | 88.9 | 29 / 35 | 4864 |
| 3 | 1 | 70.7 | 91.1 | 23 / 35 | 5230 |
| 4 | 1 | 70.7 | 89.8 | 27 / 35 | 5170 |
| 5 | 1 | 71.2 | 93.0 | 28 / 35 | 5054 |
| 6 | 1 | 71.6 | 94.3 | 27 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 92 | 95% |
| nz.jdc.nano.GridFu 1.0 | 29 | 100% |
| stelo.PatternRobot 1.0 | 17 | 88% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 29% | 73 |
| timmit.nano.TimDog 0.33 | 9 | 18% | 22 |
| stelo.PatternRobot 1.0 | 8 | 16% | 21 |
| maribo.IotaCT 1.1 | 5 | 10% | 21 |
| ratosh.Wesco 1.4 | 5 | 10% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.4 | 178 / 210 | 1.50 | 22.0% | 39419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 22.0% | 178 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 16 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 6 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 0 |
| zyx.micro.Ant 1.1 | 6.0 | 8.7% | 4 |
| sanja.First 0.1 | 6.2 | 8.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.7% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.8 | 29 / 35 | 6328 |
| 2 | 1 | 72.7 | 96.2 | 30 / 35 | 7005 |
| 3 | 1 | 72.3 | 95.2 | 29 / 35 | 6429 |
| 4 | 1 | 73.2 | 97.5 | 32 / 35 | 6673 |
| 5 | 1 | 72.2 | 95.9 | 30 / 35 | 6482 |
| 6 | 1 | 71.2 | 90.8 | 28 / 35 | 6502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 91% |
| cvt.Firsty 1.0 | 38 | 95% |
| tvv.nano.Polaris 1.2 | 24 | 88% |
| zyx.micro.Ant 1.1 | 23 | 91% |
| sanja.First 0.1 | 22 | 95% |
| amk.Punbot.Punbot 0.01 | 21 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 34% | 50 |
| baal.nano.N 1.42 | 7 | 22% | 55 |
| zyx.micro.Ant 1.1 | 5 | 16% | 30 |
| cvt.Firsty 1.0 | 3 | 9% | 24 |
| sanja.First 0.1 | 3 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 9 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |
| sample.RamFire 1.0 | 1 | 3% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.2 | 97 / 210 | 3.59 | 16.4% | 32762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.4% | 97 |
| kc.micro.Figment 1.0 | 2.2 | 13.9% | 55 |
| cs.Wren 1.0 | 3.0 | 12.5% | 22 |
| js.PinBall 1.6 | 4.5 | 11.3% | 12 |
| mz.Cork 0.1 | 4.8 | 10.7% | 8 |
| joe.ADinosaur 1.0 | 5.5 | 9.5% | 5 |
| evd.X1 0.01 | 7.0 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.7 | 16 / 35 | 5815 |
| 2 | 1 | 63.2 | 65.4 | 13 / 35 | 5277 |
| 3 | 1 | 65.5 | 72.4 | 18 / 35 | 5706 |
| 4 | 1 | 63.0 | 66.0 | 16 / 35 | 5315 |
| 5 | 1 | 66.6 | 79.7 | 15 / 35 | 5596 |
| 6 | 1 | 64.5 | 71.1 | 19 / 35 | 5053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 68% |
| cs.Wren 1.0 | 27 | 96% |
| mz.Cork 0.1 | 12 | 100% |
| js.PinBall 1.6 | 9 | 78% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 37% | 86 |
| cs.Wren 1.0 | 20 | 17% | 36 |
| js.PinBall 1.6 | 14 | 12% | 26 |
| evd.X1 0.01 | 13 | 11% | 16 |
| joe.ADinosaur 1.0 | 10 | 9% | 14 |
| PSW.Relentless 0.1 | 8 | 7% | 9 |
| mz.Cork 0.1 | 7 | 6% | 18 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.1 | 125 / 210 | 2.52 | 18.8% | 29490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.8% | 125 |
| myl.nano.Graviton 1.10 | 2.3 | 11.9% | 26 |
| ntc.Opposite 1.5 | 3.5 | 11.1% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.2% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 13 |
| DBall.NUKE 0.1 | 7.3 | 8.1% | 2 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 24 / 35 | 4901 |
| 2 | 1 | 67.6 | 83.2 | 21 / 35 | 4901 |
| 3 | 1 | 68.0 | 81.6 | 20 / 35 | 5242 |
| 4 | 1 | 67.1 | 80.6 | 21 / 35 | 4569 |
| 5 | 1 | 69.8 | 88.3 | 25 / 35 | 4975 |
| 6 | 1 | 66.3 | 78.4 | 14 / 35 | 4902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 83% |
| ntc.Opposite 1.5 | 25 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 88% |
| stelo.AreaTargetingBot 1.1 | 22 | 82% |
| DBall.NUKE 0.1 | 15 | 100% |
| donjezza.Muncho 1.0 | 10 | 100% |
| disan.Chair 2.2.0 | 8 | 50% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |

Hadur died in 86 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 16 | 19% | 29 |
| myl.nano.Graviton 1.10 | 15 | 17% | 48 |
| stelo.AreaTargetingBot 1.1 | 15 | 17% | 36 |
| ntc.Opposite 1.5 | 15 | 17% | 30 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 23 |
| disan.Chair 2.2.0 | 5 | 6% | 14 |
| DBall.NUKE 0.1 | 4 | 5% | 17 |
| donjezza.Muncho 1.0 | 4 | 5% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.6 | 94 / 210 | 3.20 | 16.4% | 26451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.4% | 94 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.0% | 25 |
| oog.melee.Capulet 1.2 | 3.2 | 13.7% | 47 |
| yagami.Tidus 0.11 | 5.0 | 11.5% | 7 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.0 | 18 / 35 | 4519 |
| 2 | 1 | 63.9 | 70.5 | 16 / 35 | 4208 |
| 3 | 1 | 66.6 | 80.6 | 16 / 35 | 4488 |
| 4 | 1 | 67.5 | 81.9 | 17 / 35 | 4679 |
| 5 | 1 | 64.9 | 74.9 | 14 / 35 | 4283 |
| 6 | 1 | 64.5 | 72.7 | 13 / 35 | 4274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 83% |
| kawigi.micro.Shiz 1.1 | 29 | 93% |
| oog.melee.Capulet 1.2 | 27 | 74% |
| yagami.Tidus 0.11 | 15 | 80% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 43% | 73 |
| yagami.Tidus 0.11 | 19 | 16% | 29 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 11% | 43 |
| ejb.Polaris 1.0.1 | 13 | 11% | 22 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| step.nanoPri 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.0 | 137 / 210 | 2.71 | 17.8% | 27465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.8% | 137 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 17 |
| wee.Gem 1.8.4 | 3.7 | 11.9% | 22 |
| ratosh.Nobo 0.21 | 3.8 | 11.2% | 6 |
| wompi.Quokka 1.6 | 4.5 | 10.8% | 10 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 14 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.7 | 24 / 35 | 4486 |
| 2 | 1 | 66.8 | 78.4 | 22 / 35 | 4891 |
| 3 | 1 | 67.5 | 85.1 | 22 / 35 | 4354 |
| 4 | 1 | 67.2 | 83.8 | 23 / 35 | 4741 |
| 5 | 1 | 64.7 | 73.7 | 18 / 35 | 4567 |
| 6 | 1 | 68.4 | 86.0 | 28 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 67 | 93% |
| wee.Gem 1.8.4 | 33 | 94% |
| ratosh.Nobo 0.21 | 17 | 94% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 20% | 69 |
| maribo.FollowFire 1 | 14 | 19% | 15 |
| wee.Gem 1.8.4 | 11 | 15% | 44 |
| m3thos.Eva00 1.1 | 10 | 14% | 17 |
| ratosh.Nobo 0.21 | 8 | 11% | 22 |
| wompi.Quokka 1.6 | 6 | 8% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 8 |
| bayen.UbaMicro 1.4 | 3 | 4% | 7 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 3 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 89.4 | 134 / 210 | 1.95 | 21.8% | 47400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.8% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 12 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.8% | 1 |
| stuff.Vlad 0.1 | 5.2 | 8.8% | 2 |
| ayk.WallHugger 1.0 | 5.7 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 85.4 | 21 / 35 | 7530 |
| 2 | 1 | 73.5 | 88.9 | 19 / 35 | 8327 |
| 3 | 1 | 72.5 | 85.7 | 22 / 35 | 7658 |
| 4 | 1 | 73.5 | 90.8 | 23 / 35 | 7960 |
| 5 | 1 | 73.8 | 92.4 | 25 / 35 | 8097 |
| 6 | 1 | 74.3 | 93.3 | 24 / 35 | 7828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 134 | 81% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| mz.NanoGod 2.02 | 10 | 70% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 52% | 151 |
| mz.NanoGod 2.02 | 25 | 32% | 33 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| ayk.WallHugger 1.0 | 2 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.4 | 109 / 210 | 2.94 | 17.5% | 29554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.5% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 30 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 22 |
| bvh.micro.Freya 0.3 | 4.5 | 11.3% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.6% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.9% | 7 |
| conscience.Electron 1.3g | 6.5 | 8.2% | 4 |
| ap.Frederick 1.1 | 8.2 | 6.5% | 5 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 66.0 | 8 / 35 | 4397 |
| 2 | 1 | 66.8 | 78.7 | 18 / 35 | 5208 |
| 3 | 1 | 66.4 | 78.4 | 18 / 35 | 4929 |
| 4 | 1 | 69.2 | 88.6 | 24 / 35 | 5151 |
| 5 | 1 | 67.7 | 82.9 | 23 / 35 | 5014 |
| 6 | 1 | 65.6 | 75.9 | 18 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 85% |
| dummy.micro.Sparrow 2.5 | 36 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 79% |
| bvh.micro.Freya 0.3 | 12 | 83% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 22% | 66 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 46 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 17% | 34 |
| bvh.micro.Freya 0.3 | 15 | 15% | 22 |
| conscience.Electron 1.3g | 11 | 11% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 10 |
| dl.BetterWalls 1.0 | 8 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 9 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.7 | 161 / 210 | 2.11 | 21.5% | 41399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.5% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.2% | 15 |
| supersample.SuperBoxBot 1.0 | 3.2 | 11.5% | 11 |
| sul.Lunar 1.1 | 3.8 | 11.2% | 7 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 6 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 4 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.6% | 0 |
| sample.Corners 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.4 | 24 / 35 | 6915 |
| 2 | 1 | 70.8 | 84.1 | 25 / 35 | 6645 |
| 3 | 1 | 72.0 | 87.6 | 28 / 35 | 7024 |
| 4 | 1 | 72.8 | 92.1 | 30 / 35 | 6932 |
| 5 | 1 | 73.2 | 93.0 | 29 / 35 | 7250 |
| 6 | 1 | 71.2 | 83.8 | 25 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 96% |
| sul.Lunar 1.1 | 46 | 98% |
| supersample.SuperBoxBot 1.0 | 40 | 85% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dsw.StaticD 1.0 | 7 | 86% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 43% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 18% | 59 |
| sul.Lunar 1.1 | 5 | 10% | 55 |
| dsw.StaticD 1.0 | 5 | 10% | 11 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 12 |
| sample.Corners 1.0 | 3 | 6% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.6 | 119 / 210 | 2.66 | 18.6% | 36513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.6% | 119 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.4% | 27 |
| mld.Wisdom 1.0 | 4.2 | 11.2% | 14 |
| KiraNL.Chupacabra 0.4 | 4.5 | 11.0% | 7 |
| amz.NanoClone 1.41 | 5.8 | 9.8% | 8 |
| sample.Walls 1.0 | 7.7 | 7.3% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 76.8 | 18 / 35 | 6297 |
| 2 | 1 | 69.3 | 85.7 | 20 / 35 | 6320 |
| 3 | 1 | 68.1 | 79.7 | 21 / 35 | 6065 |
| 4 | 1 | 68.2 | 81.0 | 23 / 35 | 5885 |
| 5 | 1 | 67.2 | 81.0 | 16 / 35 | 5578 |
| 6 | 1 | 69.4 | 85.4 | 21 / 35 | 6368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 85% |
| radnor.DoctorBob 1.42 | 35 | 86% |
| mld.Wisdom 1.0 | 19 | 68% |
| KiraNL.Chupacabra 0.4 | 17 | 88% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 21 | 23% | 37 |
| radnor.DoctorBob 1.42 | 20 | 22% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 19% | 58 |
| KiraNL.Chupacabra 0.4 | 17 | 19% | 30 |
| amz.NanoClone 1.41 | 9 | 10% | 14 |
| sample.Walls 1.0 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

