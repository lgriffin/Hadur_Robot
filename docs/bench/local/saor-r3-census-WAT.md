# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.1 | 148 / 210 | 2.16 | 21.0% | 41310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.0% | 148 |
| mz.AntiGrav 1.0 | 3.0 | 14.3% | 13 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 17 |
| mld.Infinity 2.2 | 3.0 | 13.8% | 25 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| sample.Walls 1.0 | 6.5 | 6.8% | 3 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 93.0 | 26 / 35 | 7226 |
| 2 | 1 | 70.4 | 83.2 | 20 / 35 | 6056 |
| 3 | 1 | 72.0 | 86.3 | 25 / 35 | 6964 |
| 4 | 1 | 72.7 | 89.8 | 28 / 35 | 7077 |
| 5 | 1 | 70.3 | 80.3 | 22 / 35 | 6737 |
| 6 | 1 | 72.7 | 89.8 | 27 / 35 | 7250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 94% |
| mld.Infinity 2.2 | 34 | 97% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| amz.NanoClone 1.41 | 6 | 67% |
| sample.Walls 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 21 | 34% | 82 |
| radnor.DoctorBob 1.42 | 16 | 26% | 55 |
| mld.Infinity 2.2 | 11 | 18% | 41 |
| amz.NanoClone 1.41 | 9 | 15% | 16 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.5 | 126 / 210 | 2.30 | 18.8% | 31851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 18.8% | 126 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 51 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 19 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.5% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.0% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 6.3% | 0 |
| bzdp.BoxCar 2.0 | 8.3 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.4 | 22 / 35 | 5186 |
| 2 | 1 | 68.8 | 88.3 | 24 / 35 | 4860 |
| 3 | 1 | 68.8 | 86.7 | 22 / 35 | 5260 |
| 4 | 1 | 69.5 | 87.9 | 24 / 35 | 5330 |
| 5 | 1 | 69.9 | 90.2 | 23 / 35 | 5670 |
| 6 | 2 | 65.2 | 68.6 | 11 / 35 | 5545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 67 | 90% |
| oog.melee.Mercutio 1.0 | 64 | 75% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 67% |

Hadur died in 85 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 33% | 80 |
| mld.DustBunny 3.8 | 25 | 29% | 76 |
| maribo.melee.BMV 0.1 | 11 | 13% | 15 |
| zyx.nano.Ant 1.1 | 8 | 9% | 10 |
| bzdp.BoxCar 2.0 | 5 | 6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| fullsail.SweetTea 1.1 | 1 | 1% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.6 | 142 / 210 | 2.30 | 20.3% | 36529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.3% | 142 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.6% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.2% | 18 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.1% | 4 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 3 |
| sample.Fire 1.0 | 9.3 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.2 | 28 / 35 | 6181 |
| 2 | 1 | 69.0 | 81.6 | 22 / 35 | 5825 |
| 3 | 1 | 71.4 | 88.9 | 24 / 35 | 6485 |
| 4 | 1 | 69.8 | 83.2 | 22 / 35 | 5994 |
| 5 | 1 | 70.5 | 86.0 | 24 / 35 | 6261 |
| 6 | 1 | 69.8 | 83.8 | 22 / 35 | 5783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 82% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| fm.mammillarias 1.3 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 24% | 63 |
| fm.mammillarias 1.3 | 15 | 22% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 21% | 43 |
| cb.nano.Insomnia 1.0 | 13 | 19% | 19 |
| myl.nano.KomoriNinja 1.1 | 4 | 6% | 33 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 14 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 10 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.1 | 154 / 210 | 2.07 | 20.8% | 39014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.8% | 154 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.6% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 11 |
| tj.zombie1n 1.0.1 | 4.5 | 9.1% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.2% | 7 |
| yk.JahMicro 1.0 | 8.0 | 7.5% | 1 |
| repositorio.NanoStep 1.0 | 8.5 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.7 | 22 / 35 | 6390 |
| 2 | 1 | 71.2 | 88.3 | 28 / 35 | 6688 |
| 3 | 1 | 70.5 | 87.9 | 24 / 35 | 6232 |
| 4 | 1 | 71.0 | 90.5 | 27 / 35 | 6212 |
| 5 | 1 | 71.9 | 90.5 | 27 / 35 | 6809 |
| 6 | 1 | 70.6 | 85.7 | 26 / 35 | 6683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 75 | 93% |
| stelo.SoJNanoMelee 1.1 | 39 | 92% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| tj.zombie1n 1.0.1 | 15 | 73% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 69% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 39% | 94 |
| stelo.SoJNanoMelee 1.1 | 8 | 14% | 33 |
| tj.zombie1n 1.0.1 | 8 | 14% | 13 |
| tvv.micro.Antares 1.1.1 | 7 | 12% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 11 |
| yk.JahMicro 1.0 | 1 | 2% | 5 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 66.6 | 93 / 210 | 4.01 | 15.8% | 29484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 15.8% | 93 |
| oog.melee.Corsair 1.0 | 2.2 | 13.2% | 36 |
| ahf.NanoAndrew .4 | 3.7 | 11.8% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.3% | 23 |
| EBBU.Sim2 1.02 | 5.2 | 10.4% | 10 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.7% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 60.0 | 16 / 35 | 4621 |
| 2 | 1 | 63.3 | 63.8 | 16 / 35 | 4909 |
| 3 | 1 | 65.3 | 72.7 | 17 / 35 | 5273 |
| 4 | 1 | 64.5 | 72.1 | 15 / 35 | 4903 |
| 5 | 1 | 64.5 | 67.0 | 16 / 35 | 5131 |
| 6 | 1 | 62.0 | 63.8 | 13 / 35 | 4647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| oog.melee.Corsair 1.0 | 30 | 63% |
| ahf.NanoAndrew .4 | 21 | 95% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 19% | 53 |
| oog.melee.Corsair 1.0 | 18 | 15% | 40 |
| EBBU.Sim2 1.02 | 16 | 14% | 21 |
| zyx.nano.BacillusComma 1.0 | 15 | 13% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 13% | 13 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 19 |
| ahf.NanoAndrew .4 | 8 | 7% | 29 |
| sam.Samspin 1.0 | 7 | 6% | 11 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.6 | 146 / 210 | 1.93 | 20.2% | 34137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.2% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.1% | 3 |
| fm.claire 1.7 | 5.8 | 8.4% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.2% | 5 |
| pa.Improved 1.0 | 8.7 | 6.0% | 0 |
| sample.SpinBot 1.0 | 8.8 | 5.8% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.2 | 20 / 35 | 5419 |
| 2 | 1 | 69.3 | 87.6 | 24 / 35 | 5294 |
| 3 | 1 | 71.2 | 92.1 | 27 / 35 | 6095 |
| 4 | 1 | 71.0 | 93.7 | 22 / 35 | 5797 |
| 5 | 1 | 71.6 | 94.3 | 28 / 35 | 5734 |
| 6 | 1 | 69.6 | 87.0 | 25 / 35 | 5798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 97 | 82% |
| oog.melee.CapuletDroid 1.1 | 24 | 96% |
| gh.nano.Grofvuil 0.2 | 19 | 100% |
| arthord.NanoSatanMelee Beta | 11 | 64% |
| winamp32.micro.MicroMacro 1.0 | 10 | 90% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 40% | 98 |
| arthord.NanoSatanMelee Beta | 10 | 15% | 15 |
| oog.melee.CapuletDroid 1.1 | 9 | 14% | 35 |
| gh.nano.Grofvuil 0.2 | 8 | 12% | 31 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 12 |
| sample.SpinBot 1.0 | 4 | 6% | 5 |
| fm.claire 1.7 | 3 | 5% | 5 |
| pa.Improved 1.0 | 0 | 0% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.6 | 108 / 210 | 2.57 | 18.4% | 33530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.4% | 108 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.6% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 28 |
| mz.MicroGodMelee 1 | 3.8 | 12.4% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.6% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 3 |
| acogdev.alpha 0.2 | 8.0 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.7% | 2 |
| fire219.CatBot 1.0 | 8.7 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 19 / 35 | 5528 |
| 2 | 1 | 65.5 | 73.7 | 17 / 35 | 5271 |
| 3 | 1 | 68.6 | 84.1 | 19 / 35 | 5672 |
| 4 | 1 | 70.8 | 91.7 | 23 / 35 | 6254 |
| 5 | 1 | 66.5 | 78.1 | 15 / 35 | 5156 |
| 6 | 1 | 67.4 | 79.7 | 15 / 35 | 5649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 82% |
| mz.MicroGodMelee 1 | 38 | 71% |
| gh.micro.Gruweltje 0.7 | 32 | 81% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 32% | 80 |
| gh.micro.Gruweltje 0.7 | 23 | 23% | 52 |
| mz.MicroGodMelee 1 | 19 | 19% | 45 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 11 |
| acogdev.alpha 0.2 | 8 | 8% | 7 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 68.9 | 95 / 210 | 3.80 | 15.9% | 29755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.5 | 15.9% | 95 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 29 |
| germ.TheMind .2 | 5.0 | 9.6% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.6% | 7 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 8 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.3% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.6% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.0 | 17 / 35 | 5234 |
| 2 | 3 | 59.6 | 56.8 | 13 / 35 | 4293 |
| 3 | 2 | 64.9 | 74.9 | 15 / 35 | 4811 |
| 4 | 1 | 63.4 | 67.3 | 15 / 35 | 4984 |
| 5 | 1 | 65.1 | 69.8 | 17 / 35 | 5259 |
| 6 | 1 | 65.2 | 70.5 | 18 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 88% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| germ.TheMind .2 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| awesomeness.Elite 1.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 50% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 36 |
| lrem.micro.MoggFanatic 0.2 | 9 | 8% | 12 |
| germ.TheMind .2 | 8 | 7% | 15 |
| awesomeness.Elite 1.0 | 7 | 6% | 15 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 11 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 4 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.9 | 158 / 210 | 1.90 | 20.3% | 31372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.3% | 158 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 10 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 8 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 7.5 | 8.0% | 6 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.3 | 23 / 35 | 5042 |
| 2 | 1 | 70.5 | 88.3 | 26 / 35 | 5075 |
| 3 | 1 | 71.7 | 94.9 | 29 / 35 | 5255 |
| 4 | 1 | 72.0 | 92.4 | 27 / 35 | 5669 |
| 5 | 1 | 69.6 | 88.6 | 25 / 35 | 5072 |
| 6 | 1 | 70.5 | 88.3 | 28 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 97% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| maribo.IotaCT 1.1 | 17 | 88% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 29% | 62 |
| maribo.IotaCT 1.1 | 8 | 15% | 26 |
| stelo.PatternRobot 1.0 | 8 | 15% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 12 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 55 |
| timmit.nano.TimDog 0.33 | 5 | 10% | 16 |
| ratosh.Wesco 1.4 | 3 | 6% | 13 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.8 | 159 / 210 | 2.10 | 20.7% | 38859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.7% | 159 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 18 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 12 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.7% | 1 |
| zyx.micro.Ant 1.1 | 5.3 | 9.3% | 10 |
| sanja.First 0.1 | 6.2 | 8.5% | 2 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.4% | 1 |
| cvt.Firsty 1.0 | 8.5 | 7.0% | 6 |
| sample.RamFire 1.0 | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 27 / 35 | 6333 |
| 2 | 1 | 70.6 | 87.6 | 26 / 35 | 6490 |
| 3 | 1 | 72.0 | 92.7 | 29 / 35 | 6585 |
| 4 | 1 | 69.0 | 83.5 | 24 / 35 | 6051 |
| 5 | 1 | 72.0 | 90.2 | 28 / 35 | 7058 |
| 6 | 1 | 68.7 | 80.0 | 25 / 35 | 6342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 88% |
| baal.nano.N 1.42 | 33 | 76% |
| sanja.First 0.1 | 25 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| cvt.Firsty 1.0 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 12 | 24% | 52 |
| baal.nano.N 1.42 | 10 | 20% | 38 |
| zyx.micro.Ant 1.1 | 9 | 18% | 32 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 21 |
| cvt.Firsty 1.0 | 5 | 10% | 18 |
| sample.RamFire 1.0 | 4 | 8% | 6 |
| sanja.First 0.1 | 3 | 6% | 28 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.2 | 90 / 210 | 3.32 | 16.5% | 31646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.5% | 90 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 62 |
| cs.Wren 1.0 | 3.0 | 13.3% | 28 |
| js.PinBall 1.6 | 4.5 | 11.1% | 13 |
| mz.Cork 0.1 | 5.0 | 10.8% | 7 |
| joe.ADinosaur 1.0 | 5.5 | 9.0% | 4 |
| evd.X1 0.01 | 7.3 | 7.5% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 8.5 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 17 / 35 | 5285 |
| 2 | 1 | 65.6 | 74.0 | 15 / 35 | 5374 |
| 3 | 1 | 65.4 | 74.0 | 16 / 35 | 5324 |
| 4 | 2 | 63.3 | 71.1 | 13 / 35 | 4860 |
| 5 | 1 | 64.2 | 68.6 | 16 / 35 | 5470 |
| 6 | 1 | 65.6 | 76.8 | 13 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 66% |
| cs.Wren 1.0 | 24 | 71% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 9 | 44% |
| donjezza.Jezza 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 46% | 103 |
| cs.Wren 1.0 | 25 | 21% | 32 |
| js.PinBall 1.6 | 12 | 10% | 20 |
| evd.X1 0.01 | 10 | 8% | 12 |
| mz.Cork 0.1 | 8 | 7% | 22 |
| joe.ADinosaur 1.0 | 8 | 7% | 9 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 140 / 210 | 2.40 | 19.1% | 29516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.1% | 140 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 26 |
| ntc.Opposite 1.5 | 3.3 | 11.1% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.6% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.1% | 6 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 8 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 26 / 35 | 5099 |
| 2 | 1 | 67.8 | 82.5 | 23 / 35 | 4786 |
| 3 | 1 | 68.9 | 87.3 | 24 / 35 | 4707 |
| 4 | 1 | 68.3 | 83.8 | 22 / 35 | 5013 |
| 5 | 1 | 68.4 | 84.8 | 22 / 35 | 5014 |
| 6 | 1 | 67.6 | 81.6 | 23 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 50 | 88% |
| stelo.AreaTargetingBot 1.1 | 22 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| disan.Chair 2.2.0 | 14 | 79% |
| DBall.NUKE 0.1 | 14 | 100% |
| ntc.Opposite 1.5 | 13 | 85% |
| donjezza.Muncho 1.0 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 21% | 56 |
| ntc.Opposite 1.5 | 14 | 20% | 21 |
| stelo.AreaTargetingBot 1.1 | 13 | 19% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 19% | 26 |
| pfvicm.Sobieski 7.2.3b | 7 | 10% | 17 |
| disan.Chair 2.2.0 | 4 | 6% | 20 |
| DBall.NUKE 0.1 | 2 | 3% | 22 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.8 | 86 / 210 | 3.27 | 16.1% | 26443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.1% | 86 |
| oog.melee.Capulet 1.2 | 2.0 | 14.5% | 42 |
| kawigi.micro.Shiz 1.1 | 3.7 | 13.4% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 29 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 7 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 70.5 | 11 / 35 | 4550 |
| 2 | 1 | 67.7 | 82.2 | 15 / 35 | 4700 |
| 3 | 1 | 65.2 | 74.9 | 15 / 35 | 4435 |
| 4 | 1 | 65.0 | 75.6 | 17 / 35 | 4170 |
| 5 | 1 | 65.5 | 76.8 | 14 / 35 | 4311 |
| 6 | 2 | 63.8 | 68.9 | 14 / 35 | 4277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 89% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 39% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 14% | 46 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 35 |
| yagami.Tidus 0.11 | 18 | 14% | 26 |
| ejb.Polaris 1.0.1 | 8 | 6% | 15 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.0 | 132 / 210 | 2.62 | 18.0% | 27484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.0% | 132 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 20 |
| ratosh.Nobo 0.21 | 3.7 | 11.7% | 10 |
| wee.Gem 1.8.4 | 3.7 | 11.9% | 27 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 12 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 3 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 76.5 | 19 / 35 | 4158 |
| 2 | 1 | 66.1 | 80.0 | 21 / 35 | 4213 |
| 3 | 1 | 68.3 | 85.1 | 25 / 35 | 4708 |
| 4 | 1 | 65.9 | 74.9 | 21 / 35 | 4662 |
| 5 | 1 | 69.1 | 88.9 | 23 / 35 | 5071 |
| 6 | 1 | 68.0 | 86.7 | 23 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 88% |
| wee.Gem 1.8.4 | 35 | 94% |
| ratosh.Nobo 0.21 | 19 | 74% |
| wompi.Quokka 1.6 | 18 | 89% |
| bayen.UbaMicro 1.4 | 10 | 60% |
| m3thos.Eva00 1.1 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 67 |
| ratosh.Nobo 0.21 | 12 | 15% | 24 |
| wompi.Quokka 1.6 | 12 | 15% | 24 |
| bayen.UbaMicro 1.4 | 9 | 12% | 17 |
| maribo.FollowFire 1 | 9 | 12% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 10 |
| wee.Gem 1.8.4 | 8 | 10% | 44 |
| m3thos.Eva00 1.1 | 3 | 4% | 8 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 89.5 | 134 / 210 | 1.94 | 21.6% | 46586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 21.6% | 134 |
| wompi.Wallaby 5.1 | 1.8 | 18.2% | 57 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 14 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 5 |
| ayk.WallHugger 1.0 | 5.0 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.5 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 7.3 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 90.2 | 21 / 35 | 8246 |
| 2 | 1 | 74.3 | 96.5 | 27 / 35 | 7848 |
| 3 | 1 | 72.8 | 89.2 | 21 / 35 | 7994 |
| 4 | 2 | 70.0 | 80.6 | 17 / 35 | 6848 |
| 5 | 1 | 74.6 | 95.2 | 24 / 35 | 8258 |
| 6 | 1 | 72.3 | 85.4 | 24 / 35 | 7392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 132 | 80% |
| exauge.GateKeeper 1.1.121g | 17 | 82% |
| mz.NanoGod 2.02 | 12 | 67% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 50% | 146 |
| mz.NanoGod 2.02 | 23 | 29% | 38 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 14 |
| ayk.WallHugger 1.0 | 3 | 4% | 5 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.4 | 106 / 210 | 3.58 | 16.5% | 28452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.5% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 23 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.4% | 24 |
| bvh.micro.Freya 0.3 | 4.8 | 11.0% | 12 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.8 | 22 / 35 | 5014 |
| 2 | 1 | 64.7 | 71.7 | 17 / 35 | 4982 |
| 3 | 1 | 63.4 | 68.6 | 15 / 35 | 4295 |
| 4 | 1 | 63.9 | 66.7 | 17 / 35 | 5022 |
| 5 | 1 | 67.9 | 82.9 | 24 / 35 | 4823 |
| 6 | 1 | 60.3 | 61.6 | 11 / 35 | 4316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 88% |
| dummy.micro.Sparrow 2.5 | 36 | 81% |
| bvh.micro.Freya 0.3 | 21 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 72% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 4 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 19% | 50 |
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 50 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 39 |
| conscience.Electron 1.3g | 13 | 12% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 11 |
| dl.BetterWalls 1.0 | 10 | 10% | 14 |
| bvh.micro.Freya 0.3 | 9 | 9% | 20 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 10 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 85.6 | 150 / 210 | 2.30 | 20.8% | 40151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.8% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 24 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.2% | 8 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 8 |
| dsw.StaticD 1.0 | 5.5 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 7.2 | 6.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.8% | 1 |
| sample.Corners 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.0 | 25 / 35 | 6364 |
| 2 | 1 | 69.7 | 85.1 | 22 / 35 | 6068 |
| 3 | 1 | 72.2 | 90.2 | 29 / 35 | 6800 |
| 4 | 1 | 69.9 | 79.4 | 22 / 35 | 6652 |
| 5 | 1 | 72.1 | 90.5 | 27 / 35 | 7103 |
| 6 | 1 | 70.9 | 81.6 | 25 / 35 | 7164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 91% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 28% | 66 |
| supersample.SuperBoxBot 1.0 | 17 | 28% | 35 |
| dsw.StaticD 1.0 | 7 | 12% | 16 |
| mme.NikeEnhanced 2.0 | 7 | 12% | 12 |
| sul.Lunar 1.1 | 5 | 8% | 54 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.0 | 105 / 210 | 2.62 | 18.7% | 38316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.7% | 105 |
| radnor.DoctorBob 1.42 | 2.0 | 13.9% | 38 |
| mld.Wisdom 1.0 | 3.3 | 12.5% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 27 |
| amz.NanoClone 1.41 | 5.3 | 10.2% | 8 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.3% | 3 |
| jangs.ns51 1.0 | 7.8 | 6.3% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 6.3% | 0 |
| sample.Walls 1.0 | 8.0 | 6.5% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.9 | 17 / 35 | 6103 |
| 2 | 1 | 69.3 | 83.8 | 16 / 35 | 7057 |
| 3 | 1 | 66.5 | 75.6 | 16 / 35 | 6174 |
| 4 | 1 | 69.5 | 85.4 | 20 / 35 | 6391 |
| 5 | 1 | 68.1 | 79.4 | 19 / 35 | 6196 |
| 6 | 1 | 69.2 | 86.0 | 17 / 35 | 6395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 94% |
| radnor.DoctorBob 1.42 | 31 | 74% |
| mld.Wisdom 1.0 | 28 | 79% |
| amz.NanoClone 1.41 | 15 | 87% |
| jangs.ns51 1.0 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 32% | 56 |
| radnor.DoctorBob 1.42 | 29 | 28% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 47 |
| KiraNL.Chupacabra 0.4 | 12 | 11% | 14 |
| amz.NanoClone 1.41 | 7 | 7% | 14 |
| sample.Walls 1.0 | 5 | 5% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 11 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

