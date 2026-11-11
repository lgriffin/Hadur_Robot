# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 91.1 | 164 / 210 | 1.80 | 21.7% | 41850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.7% | 164 |
| mz.AntiGrav 1.0 | 2.2 | 14.5% | 14 |
| radnor.DoctorBob 1.42 | 2.8 | 13.5% | 12 |
| mld.Infinity 2.2 | 4.0 | 12.5% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| jangs.ns51 1.0 | 7.0 | 6.3% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 1 |
| sample.Walls 1.0 | 7.2 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 5.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 84.8 | 21 / 35 | 6801 |
| 2 | 1 | 73.1 | 92.1 | 27 / 35 | 7326 |
| 3 | 1 | 72.2 | 89.5 | 28 / 35 | 6547 |
| 4 | 1 | 71.9 | 90.5 | 28 / 35 | 6698 |
| 5 | 1 | 74.1 | 95.9 | 31 / 35 | 7290 |
| 6 | 1 | 73.2 | 93.7 | 29 / 35 | 7188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 89 | 93% |
| radnor.DoctorBob 1.42 | 38 | 87% |
| mld.Infinity 2.2 | 36 | 97% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 38% | 55 |
| mz.AntiGrav 1.0 | 13 | 28% | 88 |
| mld.Infinity 2.2 | 7 | 15% | 40 |
| amz.NanoClone 1.41 | 5 | 11% | 16 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| jangs.ns51 1.0 | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.5 | 137 / 210 | 2.22 | 18.8% | 31062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.8% | 137 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 39 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 14 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 7 |
| fullsail.SweetTea 1.1 | 7.7 | 7.3% | 4 |
| bzdp.BoxCar 2.0 | 9.0 | 5.3% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.5 | 19 / 35 | 4710 |
| 2 | 1 | 71.0 | 93.0 | 28 / 35 | 5709 |
| 3 | 1 | 69.6 | 88.9 | 24 / 35 | 5905 |
| 4 | 1 | 68.4 | 87.3 | 22 / 35 | 5076 |
| 5 | 1 | 65.8 | 79.7 | 21 / 35 | 4396 |
| 6 | 1 | 69.8 | 92.4 | 23 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 68 | 79% |
| mld.DustBunny 3.8 | 64 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 37% | 87 |
| mld.DustBunny 3.8 | 21 | 29% | 73 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 8% | 15 |
| zyx.nano.Ant 1.1 | 5 | 7% | 10 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 8 |
| cs.Grudge 1.0 | 3 | 4% | 3 |
| maribo.melee.BMV 0.1 | 2 | 3% | 4 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 82.5 | 131 / 210 | 2.57 | 19.5% | 35101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.5% | 131 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 15 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 7 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.3% | 1 |
| sample.Fire 1.0 | 9.0 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 71.4 | 18 / 35 | 5162 |
| 2 | 1 | 69.8 | 83.8 | 21 / 35 | 6046 |
| 3 | 1 | 70.4 | 88.6 | 25 / 35 | 5693 |
| 4 | 1 | 71.1 | 90.8 | 26 / 35 | 5968 |
| 5 | 1 | 70.5 | 84.4 | 21 / 35 | 6587 |
| 6 | 1 | 68.0 | 76.2 | 20 / 35 | 5645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 89% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 25% | 76 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 23% | 36 |
| cb.nano.Insomnia 1.0 | 11 | 14% | 22 |
| fm.mammillarias 1.3 | 11 | 14% | 14 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 33 |
| sample.Fire 1.0 | 6 | 8% | 9 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 9 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 9 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.4 | 162 / 210 | 1.96 | 20.9% | 37636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.9% | 162 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 12 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 10 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.8% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.3% | 3 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 6.9% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 25 / 35 | 6270 |
| 2 | 1 | 70.0 | 85.1 | 25 / 35 | 6282 |
| 3 | 1 | 72.0 | 93.3 | 30 / 35 | 6371 |
| 4 | 1 | 69.5 | 87.3 | 24 / 35 | 5893 |
| 5 | 1 | 71.3 | 90.5 | 28 / 35 | 6356 |
| 6 | 1 | 72.1 | 93.3 | 30 / 35 | 6464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 92% |
| stelo.SoJNanoMelee 1.1 | 43 | 98% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 86% |
| tj.zombie1n 1.0.1 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 33% | 86 |
| tvv.micro.Antares 1.1.1 | 9 | 19% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 13% | 26 |
| tj.zombie1n 1.0.1 | 6 | 13% | 9 |
| stelo.SoJNanoMelee 1.1 | 4 | 8% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 4 |
| sample.VelociRobot 1.0 | 2 | 4% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.7 | 96 / 210 | 3.63 | 16.1% | 28640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.1% | 96 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 41 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 16 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.6% | 7 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.0 | 20 / 35 | 4699 |
| 2 | 1 | 63.4 | 66.3 | 14 / 35 | 5066 |
| 3 | 1 | 64.4 | 71.1 | 20 / 35 | 4716 |
| 4 | 1 | 63.9 | 73.0 | 12 / 35 | 4753 |
| 5 | 1 | 63.6 | 69.8 | 15 / 35 | 4734 |
| 6 | 1 | 61.9 | 63.2 | 15 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 91% |
| oog.melee.Corsair 1.0 | 34 | 47% |
| ahf.NanoAndrew .4 | 25 | 92% |
| EBBU.Sim2 1.02 | 10 | 100% |
| sam.Samspin 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 22% | 42 |
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 53 |
| ahf.NanoAndrew .4 | 12 | 11% | 33 |
| robar.nano.Assertive_Melee 0.2 | 12 | 11% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 11% | 13 |
| zyx.nano.BacillusComma 1.0 | 11 | 10% | 10 |
| EBBU.Sim2 1.02 | 10 | 9% | 22 |
| sam.Samspin 1.0 | 8 | 7% | 17 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.6 | 143 / 210 | 2.39 | 18.9% | 30713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.9% | 143 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.5% | 13 |
| fm.claire 1.7 | 5.7 | 8.6% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.6% | 7 |
| pa.Improved 1.0 | 8.3 | 6.1% | 0 |
| sample.SpinBot 1.0 | 8.7 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 28 / 35 | 5865 |
| 2 | 1 | 69.6 | 89.5 | 26 / 35 | 4926 |
| 3 | 1 | 70.0 | 89.5 | 27 / 35 | 5219 |
| 4 | 1 | 66.9 | 79.0 | 22 / 35 | 4874 |
| 5 | 1 | 66.1 | 78.4 | 20 / 35 | 4725 |
| 6 | 1 | 66.7 | 77.5 | 20 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 91% |
| oog.melee.CapuletDroid 1.1 | 39 | 100% |
| arthord.NanoSatanMelee Beta | 10 | 70% |
| gh.nano.Grofvuil 0.2 | 9 | 78% |
| fm.claire 1.7 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 67 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 36% | 93 |
| arthord.NanoSatanMelee Beta | 12 | 18% | 17 |
| gh.nano.Grofvuil 0.2 | 11 | 16% | 28 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 43 |
| fm.claire 1.7 | 4 | 6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 7 |
| pa.Improved 1.0 | 3 | 4% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.0 | 122 / 210 | 2.62 | 18.3% | 32872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.3% | 122 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.4% | 16 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 26 |
| DBall.Anarchy 0.1 | 5.5 | 8.9% | 4 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.4% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.2 | 5.9% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 27 / 35 | 5848 |
| 2 | 1 | 69.2 | 84.1 | 22 / 35 | 5830 |
| 3 | 1 | 67.7 | 81.6 | 17 / 35 | 5510 |
| 4 | 1 | 65.7 | 73.0 | 16 / 35 | 5370 |
| 5 | 1 | 69.0 | 88.3 | 25 / 35 | 5151 |
| 6 | 1 | 64.9 | 73.7 | 15 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 66 | 89% |
| gh.micro.Gruweltje 0.7 | 34 | 62% |
| mz.MicroGodMelee 1 | 34 | 79% |
| caimano.Furia_Ceca 0.22 | 6 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 34% | 60 |
| spinnercat.micro.Tyger 0.1 | 22 | 25% | 67 |
| mz.MicroGodMelee 1 | 21 | 24% | 53 |
| acogdev.alpha 0.2 | 5 | 6% | 6 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 10 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.6 | 112 / 210 | 3.46 | 16.5% | 29524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.5% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.9% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 24 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.6% | 7 |
| germ.TheMind .2 | 5.3 | 9.3% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 1 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.7% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 64.1 | 17 / 35 | 4588 |
| 2 | 1 | 64.3 | 68.3 | 18 / 35 | 5115 |
| 3 | 1 | 66.2 | 75.9 | 21 / 35 | 5120 |
| 4 | 1 | 67.0 | 79.4 | 21 / 35 | 5070 |
| 5 | 1 | 65.1 | 73.0 | 17 / 35 | 4945 |
| 6 | 1 | 65.0 | 75.2 | 18 / 35 | 4686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| germ.TheMind .2 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 39% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 39 |
| germ.TheMind .2 | 12 | 12% | 22 |
| awesomeness.Elite 1.0 | 9 | 9% | 17 |
| qualidafial.MajorDick 1.0.1 | 9 | 9% | 10 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.9 | 160 / 210 | 1.91 | 20.0% | 29352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.0% | 160 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 12 |
| maribo.IotaCT 1.1 | 4.3 | 10.1% | 5 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.3 | 27 / 35 | 4695 |
| 2 | 1 | 71.9 | 95.6 | 30 / 35 | 5258 |
| 3 | 1 | 70.5 | 91.7 | 27 / 35 | 5192 |
| 4 | 1 | 70.5 | 89.5 | 30 / 35 | 4818 |
| 5 | 1 | 68.4 | 81.0 | 24 / 35 | 4412 |
| 6 | 1 | 69.4 | 88.3 | 22 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 89 | 90% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| stelo.PatternRobot 1.0 | 17 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 78% |
| ratosh.Wesco 1.4 | 8 | 88% |
| maribo.IotaCT 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 32% | 71 |
| timmit.nano.TimDog 0.33 | 7 | 14% | 19 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 41 |
| stelo.PatternRobot 1.0 | 6 | 12% | 20 |
| ratosh.Wesco 1.4 | 6 | 12% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 8 |
| rrh.Iwillfindyou 2.0 | 3 | 6% | 3 |
| maribo.IotaCT 1.1 | 2 | 4% | 20 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.1 | 161 / 210 | 1.90 | 20.9% | 37352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.9% | 161 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.3% | 17 |
| baal.nano.N 1.42 | 2.5 | 12.2% | 6 |
| zyx.micro.Ant 1.1 | 4.7 | 9.1% | 13 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 5 |
| sanja.First 0.1 | 6.0 | 8.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.9% | 3 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 7.0% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 28 / 35 | 6032 |
| 2 | 1 | 71.5 | 93.0 | 30 / 35 | 6372 |
| 3 | 1 | 71.1 | 91.1 | 25 / 35 | 6470 |
| 4 | 1 | 70.7 | 92.1 | 27 / 35 | 6041 |
| 5 | 1 | 68.9 | 81.3 | 23 / 35 | 5936 |
| 6 | 1 | 71.4 | 90.2 | 28 / 35 | 6501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 93% |
| tvv.nano.Polaris 1.2 | 42 | 98% |
| cvt.Firsty 1.0 | 21 | 95% |
| sanja.First 0.1 | 19 | 95% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 27% | 40 |
| baal.nano.N 1.42 | 11 | 22% | 48 |
| tvv.nano.Polaris 1.2 | 6 | 12% | 56 |
| Grystrion.TrackerWO 1.0 | 6 | 12% | 13 |
| cvt.Firsty 1.0 | 4 | 8% | 20 |
| sanja.First 0.1 | 3 | 6% | 19 |
| sample.RamFire 1.0 | 3 | 6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 5 |

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.5 | 94 / 210 | 3.66 | 15.7% | 29293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 15.7% | 94 |
| kc.micro.Figment 1.0 | 1.8 | 14.5% | 54 |
| cs.Wren 1.0 | 3.0 | 12.5% | 23 |
| js.PinBall 1.6 | 4.5 | 11.0% | 11 |
| mz.Cork 0.1 | 4.5 | 11.3% | 13 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 6 |
| evd.X1 0.01 | 7.2 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 7.2% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.6 | 18 / 35 | 4368 |
| 2 | 1 | 62.0 | 63.8 | 12 / 35 | 5167 |
| 3 | 1 | 63.3 | 73.3 | 17 / 35 | 4310 |
| 4 | 3 | 58.1 | 54.0 | 9 / 35 | 4730 |
| 5 | 1 | 68.0 | 83.2 | 20 / 35 | 5549 |
| 6 | 1 | 66.5 | 81.0 | 18 / 35 | 5169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 74% |
| cs.Wren 1.0 | 32 | 78% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 9 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 60% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 41 | 35% | 90 |
| cs.Wren 1.0 | 20 | 17% | 38 |
| js.PinBall 1.6 | 15 | 13% | 22 |
| joe.ADinosaur 1.0 | 13 | 11% | 18 |
| evd.X1 0.01 | 11 | 9% | 14 |
| mz.Cork 0.1 | 8 | 7% | 14 |
| jsal.Jsalbot 1.0 | 4 | 3% | 7 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.7 | 143 / 210 | 2.20 | 19.4% | 29620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.4% | 143 |
| myl.nano.Graviton 1.10 | 2.5 | 12.0% | 14 |
| ntc.Opposite 1.5 | 3.7 | 10.8% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.1% | 3 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.7% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.1% | 19 |
| disan.Chair 2.2.0 | 6.7 | 8.7% | 8 |
| DBall.NUKE 0.1 | 7.8 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 23 / 35 | 4826 |
| 2 | 1 | 68.8 | 87.3 | 24 / 35 | 4657 |
| 3 | 1 | 70.0 | 90.5 | 27 / 35 | 5048 |
| 4 | 1 | 65.7 | 74.9 | 19 / 35 | 4831 |
| 5 | 1 | 69.9 | 90.8 | 24 / 35 | 5006 |
| 6 | 1 | 70.0 | 90.5 | 26 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 52 | 94% |
| disan.Chair 2.2.0 | 23 | 83% |
| stelo.AreaTargetingBot 1.1 | 20 | 90% |
| ntc.Opposite 1.5 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| DBall.NUKE 0.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 24% | 54 |
| stelo.AreaTargetingBot 1.1 | 13 | 19% | 31 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 15% | 22 |
| disan.Chair 2.2.0 | 9 | 13% | 24 |
| ntc.Opposite 1.5 | 4 | 6% | 17 |
| donjezza.Muncho 1.0 | 2 | 3% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 22 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.8 | 97 / 210 | 3.00 | 16.7% | 26106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.7% | 97 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 33 |
| oog.melee.Capulet 1.2 | 2.8 | 13.6% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 23 |
| yagami.Tidus 0.11 | 4.5 | 12.0% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.5 | 14 / 35 | 4324 |
| 2 | 1 | 64.0 | 68.6 | 15 / 35 | 4170 |
| 3 | 1 | 67.3 | 80.6 | 16 / 35 | 4757 |
| 4 | 1 | 65.3 | 74.9 | 16 / 35 | 4271 |
| 5 | 1 | 67.4 | 85.1 | 18 / 35 | 4369 |
| 6 | 1 | 66.7 | 81.3 | 18 / 35 | 4215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 87% |
| kawigi.micro.Shiz 1.1 | 29 | 97% |
| yagami.Tidus 0.11 | 28 | 100% |
| oog.melee.Capulet 1.2 | 24 | 42% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 113 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 49% | 71 |
| yagami.Tidus 0.11 | 20 | 18% | 41 |
| kawigi.micro.Shiz 1.1 | 13 | 12% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 37 |
| ejb.Polaris 1.0.1 | 8 | 7% | 22 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| kurios.DOSexe .9a | 3 | 3% | 3 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.4 | 128 / 210 | 2.86 | 17.4% | 26557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.4% | 128 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 23 |
| ratosh.Nobo 0.21 | 3.7 | 11.4% | 9 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 13 |
| wee.Gem 1.8.4 | 4.2 | 11.5% | 23 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 21 / 35 | 4630 |
| 2 | 1 | 67.3 | 84.1 | 25 / 35 | 4418 |
| 3 | 1 | 65.7 | 76.8 | 19 / 35 | 4691 |
| 4 | 1 | 65.9 | 75.9 | 18 / 35 | 4608 |
| 5 | 1 | 64.8 | 75.9 | 18 / 35 | 4113 |
| 6 | 1 | 67.0 | 84.1 | 27 / 35 | 4097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 88% |
| wee.Gem 1.8.4 | 31 | 97% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 14 | 93% |
| ratosh.Nobo 0.21 | 12 | 75% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| stelo.MyAgileRobot 0.2 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |

Hadur died in 82 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 26% | 59 |
| bayen.UbaMicro 1.4 | 10 | 12% | 14 |
| wee.Gem 1.8.4 | 9 | 11% | 43 |
| ratosh.Nobo 0.21 | 9 | 11% | 24 |
| m3thos.Eva00 1.1 | 7 | 9% | 19 |
| maribo.FollowFire 1 | 7 | 9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 9 |
| wompi.Quokka 1.6 | 6 | 7% | 21 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 11 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 89.2 | 141 / 210 | 1.97 | 21.6% | 46027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.6% | 141 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 44 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 15 |
| ayk.WallHugger 1.0 | 4.5 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.8% | 8 |
| stuff.Vlad 0.1 | 6.3 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 7.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.3 | 20 / 35 | 7428 |
| 2 | 1 | 72.0 | 84.1 | 22 / 35 | 7642 |
| 3 | 1 | 72.8 | 91.4 | 23 / 35 | 7273 |
| 4 | 1 | 74.1 | 93.7 | 29 / 35 | 7929 |
| 5 | 1 | 72.8 | 87.3 | 22 / 35 | 7996 |
| 6 | 1 | 73.3 | 90.5 | 25 / 35 | 7759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 93% |
| mz.NanoGod 2.02 | 19 | 68% |
| exauge.GateKeeper 1.1.121g | 15 | 73% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 40% | 133 |
| mz.NanoGod 2.02 | 24 | 33% | 44 |
| exauge.GateKeeper 1.1.121g | 11 | 15% | 14 |
| ayk.WallHugger 1.0 | 4 | 6% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.6 | 114 / 210 | 3.20 | 16.9% | 28198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.9% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.9% | 21 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 21 |
| bvh.micro.Freya 0.3 | 3.8 | 11.7% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 19 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 6.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.7 | 20 / 35 | 4289 |
| 2 | 1 | 67.5 | 84.1 | 23 / 35 | 4661 |
| 3 | 1 | 63.4 | 69.2 | 15 / 35 | 4771 |
| 4 | 1 | 65.8 | 78.4 | 20 / 35 | 4722 |
| 5 | 1 | 67.0 | 80.0 | 21 / 35 | 4735 |
| 6 | 1 | 62.5 | 62.9 | 15 / 35 | 5020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 92% |
| dummy.micro.Sparrow 2.5 | 37 | 97% |
| bvh.micro.Freya 0.3 | 27 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 50% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 16 | 16% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 18 |
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 50 |
| bvh.micro.Freya 0.3 | 13 | 13% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 22 |
| conscience.Electron 1.3g | 12 | 12% | 15 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 87.5 | 151 / 210 | 2.12 | 21.1% | 39403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.1% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 19 |
| sul.Lunar 1.1 | 3.3 | 11.9% | 12 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 5 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 82.5 | 25 / 35 | 6139 |
| 2 | 1 | 73.3 | 91.7 | 27 / 35 | 7233 |
| 3 | 1 | 70.1 | 83.2 | 23 / 35 | 6325 |
| 4 | 1 | 72.7 | 90.2 | 25 / 35 | 7005 |
| 5 | 1 | 70.9 | 87.6 | 26 / 35 | 6516 |
| 6 | 1 | 71.1 | 89.8 | 25 / 35 | 6185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 64 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 91% |
| supersample.SuperBoxBot 1.0 | 25 | 92% |
| dsw.StaticD 1.0 | 14 | 57% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 32% | 38 |
| dsw.StaticD 1.0 | 10 | 17% | 19 |
| sul.Lunar 1.1 | 8 | 14% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 12% | 51 |
| mme.NikeEnhanced 2.0 | 7 | 12% | 14 |
| sample.Corners 1.0 | 6 | 10% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.1 | 117 / 210 | 2.61 | 18.6% | 36843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.6% | 117 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.3% | 21 |
| mld.Wisdom 1.0 | 3.7 | 11.8% | 19 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 14 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 9 |
| sample.Walls 1.0 | 7.5 | 7.2% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 5.9% | 0 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.5 | 14 / 35 | 6008 |
| 2 | 1 | 70.0 | 86.7 | 21 / 35 | 6704 |
| 3 | 1 | 70.4 | 91.1 | 25 / 35 | 6246 |
| 4 | 1 | 67.4 | 78.1 | 21 / 35 | 6063 |
| 5 | 1 | 67.8 | 80.3 | 18 / 35 | 6165 |
| 6 | 1 | 67.0 | 79.7 | 18 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 83% |
| radnor.DoctorBob 1.42 | 31 | 94% |
| mld.Wisdom 1.0 | 15 | 60% |
| KiraNL.Chupacabra 0.4 | 13 | 62% |
| amz.NanoClone 1.41 | 11 | 82% |
| sample.Walls 1.0 | 8 | 100% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 29% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 20% | 70 |
| KiraNL.Chupacabra 0.4 | 17 | 18% | 24 |
| radnor.DoctorBob 1.42 | 14 | 15% | 47 |
| amz.NanoClone 1.41 | 11 | 12% | 22 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

