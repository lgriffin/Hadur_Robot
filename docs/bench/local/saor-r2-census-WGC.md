# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 91.5 | 161 / 210 | 1.76 | 22.4% | 45101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.4% | 161 |
| radnor.DoctorBob 1.42 | 2.5 | 13.9% | 13 |
| mz.AntiGrav 1.0 | 3.0 | 13.6% | 12 |
| mld.Infinity 2.2 | 3.5 | 13.1% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 6 |
| sample.Walls 1.0 | 6.7 | 6.1% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 91.7 | 26 / 35 | 7361 |
| 2 | 1 | 72.2 | 88.3 | 25 / 35 | 6928 |
| 3 | 1 | 72.5 | 88.3 | 25 / 35 | 7606 |
| 4 | 1 | 73.7 | 93.3 | 29 / 35 | 7358 |
| 5 | 1 | 74.2 | 94.0 | 29 / 35 | 7757 |
| 6 | 1 | 74.1 | 93.7 | 27 / 35 | 8091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 99% |
| radnor.DoctorBob 1.42 | 46 | 89% |
| mld.Infinity 2.2 | 41 | 95% |
| amz.NanoClone 1.41 | 6 | 33% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 37% | 70 |
| mz.AntiGrav 1.0 | 14 | 29% | 72 |
| amz.NanoClone 1.41 | 9 | 18% | 15 |
| mld.Infinity 2.2 | 5 | 10% | 40 |
| sample.Walls 1.0 | 3 | 6% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.3 | 119 / 210 | 2.69 | 18.5% | 34098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.3 | 18.5% | 119 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.8% | 53 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 14 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.3 | 8.9% | 14 |
| zyx.nano.Ant 1.1 | 6.2 | 8.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.3% | 3 |
| fullsail.SweetTea 1.1 | 8.7 | 6.4% | 1 |
| bzdp.BoxCar 2.0 | 8.8 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 18 / 35 | 5695 |
| 2 | 1 | 69.3 | 87.9 | 27 / 35 | 5214 |
| 3 | 1 | 70.5 | 90.5 | 23 / 35 | 6092 |
| 4 | 1 | 67.7 | 80.3 | 20 / 35 | 5923 |
| 5 | 1 | 69.4 | 85.1 | 23 / 35 | 5849 |
| 6 | 3 | 61.8 | 57.8 | 8 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 80% |
| mld.DustBunny 3.8 | 50 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 75% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 91 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 32% | 81 |
| mld.DustBunny 3.8 | 27 | 30% | 66 |
| zyx.nano.Ant 1.1 | 10 | 11% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 9% | 13 |
| maribo.melee.BMV 0.1 | 7 | 8% | 15 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 8 |
| cs.Grudge 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.2 | 132 / 210 | 2.51 | 19.8% | 37225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.8% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.5% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.1% | 16 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.8% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 3 |
| sample.Fire 1.0 | 9.2 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 80.0 | 21 / 35 | 5854 |
| 2 | 1 | 70.1 | 83.2 | 21 / 35 | 6401 |
| 3 | 1 | 70.6 | 85.4 | 26 / 35 | 6200 |
| 4 | 1 | 69.1 | 81.9 | 19 / 35 | 6150 |
| 5 | 1 | 69.2 | 81.3 | 22 / 35 | 5953 |
| 6 | 1 | 71.1 | 87.3 | 23 / 35 | 6667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 84% |
| cb.nano.Insomnia 1.0 | 23 | 100% |
| fm.mammillarias 1.3 | 14 | 93% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 24% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 19% | 39 |
| cb.nano.Insomnia 1.0 | 15 | 19% | 25 |
| fm.mammillarias 1.3 | 11 | 14% | 18 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 31 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 8 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 16 |
| sample.Tracker 1.0 | 3 | 4% | 2 |
| sample.Fire 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.9 | 155 / 210 | 2.18 | 21.0% | 40906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.0% | 155 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.6% | 18 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 8.9% | 7 |
| tj.zombie1n 1.0.1 | 5.7 | 8.7% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.5% | 1 |
| yk.JahMicro 1.0 | 6.5 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 6 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 88.6 | 25 / 35 | 6823 |
| 2 | 1 | 71.5 | 90.8 | 26 / 35 | 6664 |
| 3 | 1 | 71.3 | 89.8 | 25 / 35 | 6783 |
| 4 | 1 | 69.5 | 80.3 | 25 / 35 | 6746 |
| 5 | 1 | 72.4 | 90.8 | 30 / 35 | 7233 |
| 6 | 1 | 69.7 | 81.3 | 24 / 35 | 6657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 76 | 92% |
| stelo.SoJNanoMelee 1.1 | 32 | 100% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| yk.JahMicro 1.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 33% | 96 |
| stelo.SoJNanoMelee 1.1 | 10 | 18% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 15% | 23 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 24 |
| tj.zombie1n 1.0.1 | 5 | 9% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 3 |
| yk.JahMicro 1.0 | 2 | 4% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 69.5 | 99 / 210 | 3.74 | 16.5% | 31593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.5% | 99 |
| oog.melee.Corsair 1.0 | 2.0 | 13.2% | 45 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 18 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 13 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 13 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.4% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 65.1 | 16 / 35 | 5234 |
| 2 | 1 | 61.8 | 62.9 | 12 / 35 | 4745 |
| 3 | 1 | 64.5 | 68.3 | 19 / 35 | 5274 |
| 4 | 1 | 68.4 | 81.3 | 18 / 35 | 5986 |
| 5 | 1 | 65.0 | 71.4 | 16 / 35 | 5158 |
| 6 | 1 | 64.8 | 68.3 | 18 / 35 | 5196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 61% |
| simonton.nano.MeleeSeed 1.8 | 32 | 91% |
| ahf.NanoAndrew .4 | 28 | 86% |
| sam.Samspin 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 22% | 51 |
| simonton.nano.MeleeSeed 1.8 | 22 | 20% | 42 |
| robar.nano.Assertive_Melee 0.2 | 15 | 14% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 14% | 16 |
| EBBU.Sim2 1.02 | 11 | 10% | 18 |
| ahf.NanoAndrew .4 | 9 | 8% | 35 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 13 |
| sample.TrackFire 1.0 | 5 | 5% | 7 |
| sam.Samspin 1.0 | 1 | 1% | 8 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.5 | 138 / 210 | 2.30 | 19.2% | 32035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.2% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.4% | 20 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.8% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.5% | 10 |
| fm.claire 1.7 | 7.2 | 7.7% | 0 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9b | 9.2 | 5.5% | 1 |
| pa.Improved 1.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.6 | 25 / 35 | 5017 |
| 2 | 1 | 65.5 | 75.2 | 18 / 35 | 4788 |
| 3 | 1 | 70.4 | 92.1 | 24 / 35 | 5654 |
| 4 | 1 | 68.6 | 83.8 | 23 / 35 | 5381 |
| 5 | 1 | 69.8 | 86.3 | 25 / 35 | 5906 |
| 6 | 1 | 69.2 | 87.9 | 23 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 85% |
| oog.melee.CapuletDroid 1.1 | 33 | 97% |
| arthord.NanoSatanMelee Beta | 20 | 85% |
| gh.nano.Grofvuil 0.2 | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 42% | 91 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 24 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 16 |
| fm.claire 1.7 | 7 | 10% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 14 |
| oog.melee.CapuletDroid 1.1 | 4 | 6% | 37 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.3 | 106 / 210 | 2.60 | 18.6% | 35599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.6% | 106 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.7% | 30 |
| gh.micro.Gruweltje 0.7 | 2.8 | 13.9% | 31 |
| mz.MicroGodMelee 1 | 3.8 | 13.3% | 31 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.2% | 4 |
| fire219.CatBot 1.0 | 7.8 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 2 |
| acogdev.alpha 0.2 | 8.8 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 70.5 | 12 / 35 | 5399 |
| 2 | 1 | 71.5 | 93.0 | 23 / 35 | 6589 |
| 3 | 1 | 70.1 | 87.0 | 20 / 35 | 6363 |
| 4 | 1 | 66.3 | 73.7 | 18 / 35 | 5444 |
| 5 | 1 | 69.9 | 88.9 | 23 / 35 | 5927 |
| 6 | 1 | 67.3 | 80.6 | 10 / 35 | 5877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 84% |
| mz.MicroGodMelee 1 | 36 | 72% |
| gh.micro.Gruweltje 0.7 | 19 | 58% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 30% | 75 |
| mz.MicroGodMelee 1 | 29 | 28% | 59 |
| gh.micro.Gruweltje 0.7 | 24 | 23% | 41 |
| acogdev.alpha 0.2 | 7 | 7% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 71.8 | 101 / 210 | 3.54 | 16.7% | 31839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.7% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.4% | 56 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.1% | 22 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.5% | 1 |
| awesomeness.Elite 1.0 | 6.5 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.4% | 12 |
| germ.TheMind .2 | 6.8 | 8.5% | 4 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.8 | 15 / 35 | 5025 |
| 2 | 1 | 66.3 | 73.0 | 17 / 35 | 5756 |
| 3 | 1 | 64.1 | 67.9 | 17 / 35 | 5053 |
| 4 | 1 | 63.0 | 64.4 | 15 / 35 | 5101 |
| 5 | 1 | 66.7 | 76.8 | 17 / 35 | 5477 |
| 6 | 1 | 67.0 | 77.8 | 20 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| stelo.UntouchableNano 1.3 | 12 | 75% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 40% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 17% | 36 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 19 |
| germ.TheMind .2 | 8 | 7% | 17 |
| mym.EdgeStalker 1.0 | 7 | 6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 15 |
| sample.Crazy 1.0 | 3 | 3% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.5 | 143 / 210 | 2.13 | 20.1% | 33381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.1% | 143 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 17 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.6% | 15 |
| maribo.IotaCT 1.1 | 4.7 | 10.4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.6% | 2 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.4 | 26 / 35 | 6165 |
| 2 | 1 | 71.7 | 91.4 | 27 / 35 | 5733 |
| 3 | 1 | 71.0 | 88.3 | 27 / 35 | 5234 |
| 4 | 1 | 68.0 | 79.7 | 21 / 35 | 4926 |
| 5 | 1 | 68.8 | 82.2 | 21 / 35 | 5343 |
| 6 | 1 | 71.0 | 90.8 | 21 / 35 | 5980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 92% |
| nz.jdc.nano.GridFu 1.0 | 27 | 96% |
| timmit.nano.TimDog 0.33 | 16 | 56% |
| stelo.PatternRobot 1.0 | 15 | 87% |
| maribo.IotaCT 1.1 | 9 | 67% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 18 | 27% | 37 |
| rz.HawkOnFire 0.1 | 17 | 25% | 68 |
| maribo.IotaCT 1.1 | 8 | 12% | 22 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 36 |
| stelo.PatternRobot 1.0 | 5 | 7% | 16 |
| ratosh.Wesco 1.4 | 5 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 11 |
| spinnercat.Omen 1.0 | 2 | 3% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.0 | 159 / 210 | 1.81 | 21.6% | 41131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.6% | 159 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 17 |
| baal.nano.N 1.42 | 3.0 | 11.9% | 10 |
| zyx.micro.Ant 1.1 | 4.2 | 10.0% | 15 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.1% | 0 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.9% | 1 |
| sanja.First 0.1 | 6.8 | 7.9% | 2 |
| cvt.Firsty 1.0 | 7.8 | 7.4% | 6 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.5 | 27 / 35 | 6854 |
| 2 | 1 | 71.6 | 90.8 | 26 / 35 | 6736 |
| 3 | 1 | 71.9 | 91.7 | 29 / 35 | 6820 |
| 4 | 1 | 72.6 | 90.2 | 29 / 35 | 7194 |
| 5 | 1 | 71.5 | 91.7 | 24 / 35 | 6804 |
| 6 | 1 | 70.7 | 90.8 | 24 / 35 | 6723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 89% |
| baal.nano.N 1.42 | 42 | 93% |
| zyx.micro.Ant 1.1 | 26 | 69% |
| cvt.Firsty 1.0 | 22 | 86% |
| sanja.First 0.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 35% | 40 |
| tvv.nano.Polaris 1.2 | 10 | 20% | 57 |
| baal.nano.N 1.42 | 7 | 14% | 38 |
| Grystrion.TrackerWO 1.0 | 6 | 12% | 18 |
| cvt.Firsty 1.0 | 4 | 8% | 19 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 10 |
| sanja.First 0.1 | 1 | 2% | 18 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 5 |
| sample.RamFire 1.0 | 1 | 2% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.7 | 88 / 210 | 3.73 | 16.1% | 32918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.1% | 88 |
| kc.micro.Figment 1.0 | 1.8 | 15.0% | 62 |
| cs.Wren 1.0 | 3.8 | 11.8% | 21 |
| mz.Cork 0.1 | 3.8 | 11.8% | 16 |
| js.PinBall 1.6 | 4.3 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 8.9% | 2 |
| evd.X1 0.01 | 6.8 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.0 | 16 / 35 | 5150 |
| 2 | 1 | 66.3 | 74.9 | 19 / 35 | 5743 |
| 3 | 1 | 62.9 | 66.0 | 12 / 35 | 5598 |
| 4 | 1 | 64.5 | 67.3 | 14 / 35 | 5837 |
| 5 | 1 | 65.8 | 75.2 | 17 / 35 | 5598 |
| 6 | 2 | 60.3 | 60.6 | 10 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 69% |
| mz.Cork 0.1 | 24 | 92% |
| cs.Wren 1.0 | 19 | 79% |
| js.PinBall 1.6 | 7 | 71% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| evd.X1 0.01 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 92 |
| cs.Wren 1.0 | 16 | 13% | 29 |
| js.PinBall 1.6 | 14 | 11% | 20 |
| evd.X1 0.01 | 13 | 11% | 15 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| mz.Cork 0.1 | 8 | 7% | 21 |
| joe.ADinosaur 1.0 | 8 | 7% | 10 |
| jsal.Jsalbot 1.0 | 5 | 4% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.9 | 129 / 210 | 2.54 | 18.8% | 29748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 129 |
| ntc.Opposite 1.5 | 3.5 | 11.3% | 15 |
| myl.nano.Graviton 1.10 | 4.0 | 10.7% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.2% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 9 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 11 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 3 |
| donjezza.Muncho 1.0 | 8.8 | 6.2% | 5 |
| pbg.R2D2 1.0 | 10.0 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.5 | 19 / 35 | 4957 |
| 2 | 1 | 68.4 | 85.1 | 24 / 35 | 4987 |
| 3 | 1 | 69.3 | 86.3 | 24 / 35 | 5013 |
| 4 | 1 | 68.4 | 83.2 | 23 / 35 | 5083 |
| 5 | 1 | 67.2 | 81.3 | 19 / 35 | 4988 |
| 6 | 1 | 68.0 | 85.1 | 20 / 35 | 4720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 90% |
| myl.nano.Graviton 1.10 | 30 | 93% |
| ntc.Opposite 1.5 | 19 | 63% |
| disan.Chair 2.2.0 | 19 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| DBall.NUKE 0.1 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 19% | 34 |
| pfvicm.Sobieski 7.2.3b | 15 | 18% | 27 |
| ntc.Opposite 1.5 | 14 | 17% | 32 |
| myl.nano.Graviton 1.10 | 13 | 16% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 11% | 20 |
| disan.Chair 2.2.0 | 7 | 8% | 23 |
| pbg.R2D2 1.0 | 6 | 7% | 9 |
| donjezza.Muncho 1.0 | 2 | 2% | 9 |
| DBall.NUKE 0.1 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.0 | 80 / 210 | 3.52 | 16.1% | 28395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.1% | 80 |
| oog.melee.Capulet 1.2 | 2.2 | 14.1% | 56 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.3% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 24 |
| yagami.Tidus 0.11 | 5.5 | 11.7% | 8 |
| ejb.Polaris 1.0.1 | 5.5 | 11.1% | 9 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 73.7 | 15 / 35 | 4976 |
| 2 | 1 | 66.9 | 74.6 | 16 / 35 | 4764 |
| 3 | 1 | 65.0 | 69.2 | 13 / 35 | 4682 |
| 4 | 2 | 61.4 | 63.5 | 6 / 35 | 4143 |
| 5 | 1 | 67.6 | 81.3 | 18 / 35 | 5219 |
| 6 | 1 | 64.0 | 69.5 | 12 / 35 | 4611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 74% |
| oog.melee.Capulet 1.2 | 25 | 56% |
| yagami.Tidus 0.11 | 21 | 90% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 131 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 35% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 19% | 52 |
| ejb.Polaris 1.0.1 | 22 | 17% | 29 |
| yagami.Tidus 0.11 | 19 | 15% | 38 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 25 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.7 | 133 / 210 | 2.82 | 17.9% | 28977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.9% | 133 |
| bzdp.Pansy 2.1 | 2.3 | 12.5% | 16 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 20 |
| ratosh.Nobo 0.21 | 4.0 | 11.2% | 12 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 16 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.7% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 72.4 | 21 / 35 | 4520 |
| 2 | 1 | 66.1 | 76.8 | 19 / 35 | 4955 |
| 3 | 1 | 67.5 | 81.6 | 23 / 35 | 5026 |
| 4 | 1 | 64.1 | 71.1 | 19 / 35 | 4305 |
| 5 | 1 | 68.2 | 83.5 | 24 / 35 | 4961 |
| 6 | 1 | 70.3 | 93.0 | 27 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 98% |
| wee.Gem 1.8.4 | 30 | 97% |
| m3thos.Eva00 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 13 | 92% |
| wompi.Quokka 1.6 | 13 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 50% |
| bayen.UbaMicro 1.4 | 4 | 75% |

Hadur died in 77 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 17 | 22% | 33 |
| bzdp.Pansy 2.1 | 12 | 16% | 69 |
| m3thos.Eva00 1.1 | 11 | 14% | 19 |
| bayen.UbaMicro 1.4 | 7 | 9% | 13 |
| maribo.FollowFire 1 | 7 | 9% | 8 |
| wee.Gem 1.8.4 | 6 | 8% | 36 |
| wompi.Quokka 1.6 | 6 | 8% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 10 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.3 | 132 / 210 | 1.97 | 22.3% | 51116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.3% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 18 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.2% | 1 |
| ayk.WallHugger 1.0 | 5.3 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 92.4 | 23 / 35 | 8927 |
| 2 | 1 | 73.4 | 89.5 | 20 / 35 | 8144 |
| 3 | 1 | 73.9 | 89.8 | 24 / 35 | 8550 |
| 4 | 1 | 73.4 | 87.0 | 21 / 35 | 8597 |
| 5 | 1 | 74.2 | 89.5 | 23 / 35 | 8373 |
| 6 | 1 | 73.6 | 87.3 | 21 / 35 | 8525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 80% |
| mz.NanoGod 2.02 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 50% | 146 |
| mz.NanoGod 2.02 | 28 | 36% | 42 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| exauge.GateKeeper 1.1.121g | 3 | 4% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.3 | 99 / 210 | 3.67 | 16.3% | 29331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.3% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 25 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.9% | 16 |
| bvh.micro.Freya 0.3 | 4.3 | 11.4% | 24 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.0% | 2 |
| conscience.Electron 1.3g | 6.5 | 8.3% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 16 |
| dl.BetterWalls 1.0 | 9.0 | 6.5% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 70.8 | 20 / 35 | 4480 |
| 2 | 1 | 64.0 | 70.2 | 19 / 35 | 4867 |
| 3 | 1 | 62.8 | 69.2 | 11 / 35 | 4786 |
| 4 | 1 | 65.0 | 74.0 | 15 / 35 | 4805 |
| 5 | 1 | 65.7 | 70.5 | 19 / 35 | 5260 |
| 6 | 1 | 63.3 | 67.3 | 15 / 35 | 5133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 77% |
| dummy.micro.Sparrow 2.5 | 21 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 94% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 27% | 63 |
| dummy.micro.Sparrow 2.5 | 22 | 20% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 13% | 35 |
| bvh.micro.Freya 0.3 | 12 | 11% | 26 |
| conscience.Electron 1.3g | 9 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 14 |
| dl.BetterWalls 1.0 | 2 | 2% | 6 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 85.5 | 142 / 210 | 2.30 | 21.5% | 44557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.5% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.8% | 14 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.2% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 5 |
| sample.Corners 1.0 | 9.7 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 87.3 | 24 / 35 | 7632 |
| 2 | 1 | 70.3 | 80.3 | 21 / 35 | 7201 |
| 3 | 1 | 72.5 | 87.3 | 25 / 35 | 7657 |
| 4 | 1 | 72.4 | 88.3 | 24 / 35 | 7597 |
| 5 | 1 | 69.0 | 79.0 | 21 / 35 | 6379 |
| 6 | 1 | 73.8 | 90.8 | 27 / 35 | 8091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 84% |
| supersample.SuperBoxBot 1.0 | 20 | 70% |
| dsw.StaticD 1.0 | 16 | 75% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 34% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 24% | 60 |
| dsw.StaticD 1.0 | 9 | 13% | 24 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 16 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 11 |
| sul.Lunar 1.1 | 3 | 4% | 45 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.7 | 113 / 210 | 2.74 | 18.7% | 38373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.7% | 113 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 25 |
| mld.Wisdom 1.0 | 2.8 | 12.4% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.1% | 24 |
| amz.NanoClone 1.41 | 5.2 | 10.7% | 8 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 10 |
| sample.Walls 1.0 | 7.2 | 7.3% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.6% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.8 | 22 / 35 | 5748 |
| 2 | 1 | 69.7 | 85.7 | 20 / 35 | 6756 |
| 3 | 1 | 68.5 | 80.6 | 17 / 35 | 6911 |
| 4 | 1 | 68.2 | 78.7 | 19 / 35 | 6385 |
| 5 | 1 | 67.5 | 77.1 | 16 / 35 | 6515 |
| 6 | 1 | 67.4 | 78.1 | 19 / 35 | 6058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 91% |
| mld.Wisdom 1.0 | 20 | 55% |
| KiraNL.Chupacabra 0.4 | 14 | 93% |
| amz.NanoClone 1.41 | 10 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 26% | 40 |
| radnor.DoctorBob 1.42 | 22 | 23% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 21% | 46 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 22 |
| amz.NanoClone 1.41 | 10 | 10% | 21 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 2 | 2% | 8 |

