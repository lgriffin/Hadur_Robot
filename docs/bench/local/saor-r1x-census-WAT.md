# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.4 | 148 / 210 | 2.13 | 21.1% | 41863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.1% | 148 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 21 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 22 |
| mz.AntiGrav 1.0 | 3.5 | 13.6% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.7% | 3 |
| sample.Walls 1.0 | 6.3 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.2 | 6.2% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 82.5 | 25 / 35 | 7302 |
| 2 | 1 | 72.7 | 90.5 | 24 / 35 | 7241 |
| 3 | 1 | 72.2 | 87.0 | 26 / 35 | 6881 |
| 4 | 1 | 70.6 | 82.2 | 23 / 35 | 6583 |
| 5 | 1 | 72.0 | 89.8 | 26 / 35 | 6591 |
| 6 | 1 | 72.9 | 92.4 | 24 / 35 | 7265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 94% |
| mld.Infinity 2.2 | 46 | 87% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| amz.NanoClone 1.41 | 12 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 35% | 56 |
| mz.AntiGrav 1.0 | 20 | 32% | 70 |
| mld.Infinity 2.2 | 10 | 16% | 49 |
| amz.NanoClone 1.41 | 5 | 8% | 18 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.7 | 126 / 210 | 2.20 | 18.8% | 31448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.8% | 126 |
| mld.DustBunny 3.8 | 2.5 | 14.6% | 21 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 47 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 1 |
| zyx.nano.Ant 1.1 | 5.8 | 8.2% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.8% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.7% | 3 |
| bzdp.BoxCar 2.0 | 7.5 | 7.4% | 1 |
| fullsail.SweetTea 1.1 | 8.0 | 6.7% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.0 | 22 / 35 | 5171 |
| 2 | 1 | 68.0 | 85.7 | 19 / 35 | 5249 |
| 3 | 1 | 68.2 | 84.8 | 20 / 35 | 5263 |
| 4 | 1 | 69.8 | 90.2 | 23 / 35 | 5405 |
| 5 | 1 | 68.4 | 86.0 | 22 / 35 | 5095 |
| 6 | 1 | 68.7 | 87.3 | 20 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 84 | 86% |
| oog.melee.Mercutio 1.0 | 45 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 38% | 72 |
| mld.DustBunny 3.8 | 25 | 29% | 87 |
| fullsail.SweetTea 1.1 | 8 | 9% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 9% | 11 |
| maribo.melee.BMV 0.1 | 5 | 6% | 13 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.9 | 134 / 210 | 2.45 | 20.1% | 37100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.1% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 7 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.3% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 14 |
| cs.sheldor.Talon 1.1 | 5.8 | 8.8% | 1 |
| fm.mammillarias 1.3 | 6.7 | 8.3% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 3 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 76.2 | 19 / 35 | 5956 |
| 2 | 1 | 69.6 | 83.8 | 21 / 35 | 5858 |
| 3 | 1 | 69.4 | 81.0 | 19 / 35 | 5932 |
| 4 | 1 | 73.3 | 94.9 | 31 / 35 | 6904 |
| 5 | 1 | 70.0 | 83.5 | 24 / 35 | 5934 |
| 6 | 1 | 70.4 | 84.1 | 20 / 35 | 6516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 90% |
| cb.nano.Insomnia 1.0 | 31 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 87% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 28% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 42 |
| cb.nano.Insomnia 1.0 | 15 | 20% | 22 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 11 |
| fm.mammillarias 1.3 | 6 | 8% | 11 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 30 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 11 |
| sample.Tracker 1.0 | 3 | 4% | 6 |
| sample.Fire 1.0 | 2 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.6 | 148 / 210 | 2.21 | 20.6% | 38909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.6% | 148 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.8% | 11 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.3% | 10 |
| tj.zombie1n 1.0.1 | 5.0 | 9.0% | 11 |
| yk.JahMicro 1.0 | 5.7 | 8.8% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.2% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 8.1% | 14 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.7 | 19 / 35 | 6018 |
| 2 | 1 | 71.0 | 87.0 | 27 / 35 | 6547 |
| 3 | 1 | 72.1 | 92.1 | 27 / 35 | 7041 |
| 4 | 1 | 71.8 | 92.1 | 27 / 35 | 6731 |
| 5 | 1 | 68.9 | 83.5 | 22 / 35 | 5868 |
| 6 | 1 | 70.6 | 85.1 | 26 / 35 | 6704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 93% |
| stelo.SoJNanoMelee 1.1 | 38 | 82% |
| tvv.micro.Antares 1.1.1 | 25 | 84% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 67% |
| yk.JahMicro 1.0 | 11 | 91% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 30% | 69 |
| stelo.SoJNanoMelee 1.1 | 15 | 24% | 37 |
| tj.zombie1n 1.0.1 | 8 | 13% | 17 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 39 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 18 |
| yk.JahMicro 1.0 | 3 | 5% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.3 | 87 / 210 | 3.67 | 16.2% | 30241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.2% | 87 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 36 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 22 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 9.7% | 9 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 6 |
| sam.Samspin 1.0 | 6.5 | 9.4% | 14 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.0% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 62.2 | 9 / 35 | 4975 |
| 2 | 1 | 64.5 | 71.7 | 17 / 35 | 4889 |
| 3 | 1 | 67.4 | 79.7 | 19 / 35 | 5493 |
| 4 | 1 | 64.4 | 72.4 | 15 / 35 | 4802 |
| 5 | 1 | 65.9 | 72.1 | 14 / 35 | 5690 |
| 6 | 1 | 61.8 | 63.8 | 13 / 35 | 4392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 59% |
| simonton.nano.MeleeSeed 1.8 | 33 | 85% |
| ahf.NanoAndrew .4 | 19 | 74% |
| EBBU.Sim2 1.02 | 10 | 100% |
| sam.Samspin 1.0 | 9 | 78% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 19% | 52 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 44 |
| ahf.NanoAndrew .4 | 18 | 15% | 33 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 23 |
| EBBU.Sim2 1.02 | 11 | 9% | 19 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 10 |
| sam.Samspin 1.0 | 7 | 6% | 12 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.1 | 141 / 210 | 2.07 | 19.6% | 32831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.6% | 141 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.9% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.0% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.3% | 4 |
| arthord.NanoSatanMelee Beta | 5.3 | 8.8% | 5 |
| fm.claire 1.7 | 6.7 | 7.8% | 0 |
| pa.Improved 1.0 | 8.2 | 6.3% | 0 |
| sample.SpinBot 1.0 | 9.3 | 5.4% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.1 | 29 / 35 | 5245 |
| 2 | 1 | 69.1 | 86.7 | 23 / 35 | 5457 |
| 3 | 1 | 69.4 | 86.0 | 21 / 35 | 5587 |
| 4 | 1 | 68.6 | 86.0 | 22 / 35 | 5171 |
| 5 | 1 | 68.8 | 88.6 | 24 / 35 | 5099 |
| 6 | 1 | 70.7 | 89.2 | 22 / 35 | 6272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 87% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| gh.nano.Grofvuil 0.2 | 20 | 75% |
| arthord.NanoSatanMelee Beta | 12 | 75% |
| fm.claire 1.7 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 41% | 80 |
| gh.nano.Grofvuil 0.2 | 11 | 16% | 37 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 17 |
| winamp32.micro.MicroMacro 1.0 | 8 | 12% | 14 |
| oog.melee.CapuletDroid 1.1 | 5 | 7% | 46 |
| fm.claire 1.7 | 3 | 4% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 78.6 | 88 / 210 | 2.93 | 17.5% | 33425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.5% | 88 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.1% | 38 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 15.2% | 43 |
| mz.MicroGodMelee 1 | 3.7 | 13.3% | 28 |
| DBall.Anarchy 0.1 | 5.5 | 8.1% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.2 | 5.8% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.5% | 2 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.6 | 18 / 35 | 5714 |
| 2 | 1 | 65.7 | 71.7 | 14 / 35 | 5369 |
| 3 | 1 | 67.9 | 82.9 | 15 / 35 | 5751 |
| 4 | 1 | 66.5 | 77.5 | 12 / 35 | 5447 |
| 5 | 1 | 64.9 | 73.7 | 11 / 35 | 5354 |
| 6 | 1 | 69.0 | 84.1 | 18 / 35 | 5790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 73% |
| mz.MicroGodMelee 1 | 34 | 47% |
| gh.micro.Gruweltje 0.7 | 20 | 70% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 28% | 49 |
| spinnercat.micro.Tyger 0.1 | 31 | 25% | 69 |
| gh.micro.Gruweltje 0.7 | 28 | 23% | 51 |
| fire219.CatBot 1.0 | 9 | 7% | 10 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 10 |
| el.JumpShoot 0.2 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 4 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 75.2 | 114 / 210 | 3.23 | 17.3% | 31258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.3% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.2% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 28 |
| germ.TheMind .2 | 5.2 | 9.3% | 4 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.3% | 8 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.2% | 4 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.9% | 3 |
| sample.Crazy 1.0 | 8.3 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.0 | 21 / 35 | 5160 |
| 2 | 1 | 66.4 | 77.8 | 19 / 35 | 5111 |
| 3 | 1 | 64.4 | 69.2 | 14 / 35 | 5151 |
| 4 | 1 | 67.9 | 78.7 | 19 / 35 | 5811 |
| 5 | 1 | 64.4 | 68.6 | 20 / 35 | 4841 |
| 6 | 1 | 67.3 | 77.8 | 21 / 35 | 5184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 83% |
| germ.TheMind .2 | 10 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 50% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 22% | 40 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 10 |
| germ.TheMind .2 | 5 | 5% | 18 |
| awesomeness.Elite 1.0 | 4 | 4% | 14 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.2 | 160 / 210 | 1.79 | 20.5% | 31034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.5% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 12 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 4 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 8.1% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.5% | 0 |
| stelo.PatternRobot 1.0 | 7.3 | 7.5% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.3 | 24 / 35 | 5283 |
| 2 | 1 | 70.8 | 92.1 | 27 / 35 | 5290 |
| 3 | 1 | 71.2 | 91.1 | 26 / 35 | 5424 |
| 4 | 1 | 71.6 | 94.6 | 29 / 35 | 5085 |
| 5 | 1 | 71.0 | 91.1 | 28 / 35 | 4941 |
| 6 | 1 | 70.7 | 90.2 | 26 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 91% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| maribo.IotaCT 1.1 | 16 | 88% |
| timmit.nano.TimDog 0.33 | 15 | 87% |
| ratosh.Wesco 1.4 | 8 | 75% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 28% | 78 |
| nz.jdc.nano.GridFu 1.0 | 9 | 18% | 52 |
| stelo.PatternRobot 1.0 | 9 | 18% | 20 |
| timmit.nano.TimDog 0.33 | 7 | 14% | 20 |
| maribo.IotaCT 1.1 | 4 | 8% | 12 |
| ratosh.Wesco 1.4 | 4 | 8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 95.6 | 182 / 210 | 1.40 | 22.0% | 38675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 22.0% | 182 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 4 |
| tvv.nano.Polaris 1.2 | 2.8 | 12.1% | 9 |
| zyx.micro.Ant 1.1 | 4.3 | 9.7% | 7 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.1% | 2 |
| sanja.First 0.1 | 6.2 | 8.1% | 0 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 4 |
| amk.Punbot.Punbot 0.01 | 8.2 | 6.8% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 97.5 | 31 / 35 | 6454 |
| 2 | 1 | 71.4 | 93.0 | 28 / 35 | 6378 |
| 3 | 1 | 73.1 | 98.4 | 32 / 35 | 6886 |
| 4 | 1 | 71.9 | 96.8 | 31 / 35 | 6184 |
| 5 | 1 | 71.3 | 91.4 | 29 / 35 | 6474 |
| 6 | 1 | 72.0 | 96.2 | 31 / 35 | 6299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 95% |
| tvv.nano.Polaris 1.2 | 42 | 100% |
| cvt.Firsty 1.0 | 32 | 94% |
| zyx.micro.Ant 1.1 | 25 | 92% |
| sanja.First 0.1 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 36% | 38 |
| baal.nano.N 1.42 | 5 | 18% | 36 |
| tvv.nano.Polaris 1.2 | 4 | 14% | 59 |
| cvt.Firsty 1.0 | 2 | 7% | 34 |
| sanja.First 0.1 | 2 | 7% | 18 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 9 |
| Grystrion.TrackerWO 1.0 | 2 | 7% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 3 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.5 | 90 / 210 | 3.56 | 16.2% | 32024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.3 | 16.2% | 90 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 62 |
| cs.Wren 1.0 | 3.0 | 12.4% | 16 |
| js.PinBall 1.6 | 4.3 | 11.1% | 12 |
| mz.Cork 0.1 | 4.5 | 10.6% | 14 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 5 |
| evd.X1 0.01 | 7.3 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.2% | 4 |
| PSW.Relentless 0.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 72.7 | 16 / 35 | 5330 |
| 2 | 1 | 66.5 | 74.9 | 17 / 35 | 5792 |
| 3 | 2 | 63.1 | 67.6 | 12 / 35 | 5257 |
| 4 | 1 | 65.3 | 73.3 | 16 / 35 | 5488 |
| 5 | 1 | 64.6 | 72.1 | 15 / 35 | 5494 |
| 6 | 2 | 62.5 | 68.6 | 14 / 35 | 4663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 68% |
| cs.Wren 1.0 | 18 | 78% |
| mz.Cork 0.1 | 11 | 91% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| js.PinBall 1.6 | 6 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 46% | 108 |
| cs.Wren 1.0 | 18 | 15% | 28 |
| joe.ADinosaur 1.0 | 12 | 10% | 14 |
| js.PinBall 1.6 | 10 | 8% | 13 |
| evd.X1 0.01 | 9 | 7% | 11 |
| PSW.Relentless 0.1 | 7 | 6% | 8 |
| mz.Cork 0.1 | 5 | 4% | 16 |
| jsal.Jsalbot 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.6 | 133 / 210 | 2.48 | 18.9% | 29009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.9% | 133 |
| myl.nano.Graviton 1.10 | 2.5 | 12.1% | 21 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.4% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 7 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.0% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 9 |
| DBall.NUKE 0.1 | 7.3 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 26 / 35 | 5419 |
| 2 | 1 | 68.8 | 88.3 | 23 / 35 | 4532 |
| 3 | 1 | 68.4 | 83.2 | 25 / 35 | 4854 |
| 4 | 1 | 64.8 | 71.1 | 20 / 35 | 4468 |
| 5 | 1 | 66.4 | 79.4 | 16 / 35 | 4449 |
| 6 | 1 | 69.8 | 88.9 | 23 / 35 | 5287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 30 | 97% |
| stelo.AreaTargetingBot 1.1 | 28 | 82% |
| ntc.Opposite 1.5 | 25 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 80% |
| DBall.NUKE 0.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 14 | 100% |
| disan.Chair 2.2.0 | 13 | 77% |
| pfvicm.Sobieski 7.2.3b | 12 | 92% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 18 | 23% | 24 |
| stelo.AreaTargetingBot 1.1 | 14 | 18% | 37 |
| myl.nano.Graviton 1.10 | 13 | 16% | 47 |
| ntc.Opposite 1.5 | 13 | 16% | 28 |
| pfvicm.Sobieski 7.2.3b | 12 | 15% | 20 |
| disan.Chair 2.2.0 | 6 | 8% | 16 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 10 |
| donjezza.Muncho 1.0 | 0 | 0% | 11 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.7 | 96 / 210 | 3.00 | 16.8% | 26660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.8% | 96 |
| oog.melee.Capulet 1.2 | 2.2 | 13.9% | 48 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.2% | 37 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 6 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.1% | 15 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 66.0 | 13 / 35 | 3953 |
| 2 | 1 | 67.4 | 81.6 | 15 / 35 | 4808 |
| 3 | 1 | 67.6 | 82.5 | 18 / 35 | 4895 |
| 4 | 1 | 65.5 | 73.3 | 15 / 35 | 4634 |
| 5 | 1 | 67.7 | 86.7 | 19 / 35 | 4254 |
| 6 | 1 | 65.5 | 76.2 | 16 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 53% |
| kawigi.micro.Shiz 1.1 | 27 | 96% |
| yagami.Tidus 0.11 | 25 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 91% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 114 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 46% | 77 |
| yagami.Tidus 0.11 | 15 | 13% | 36 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 10% | 32 |
| ejb.Polaris 1.0.1 | 9 | 8% | 21 |
| step.nanoPri 1.0 | 6 | 5% | 7 |
| stelo.MirrorNano 1.3 | 4 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.4 | 134 / 210 | 2.68 | 17.8% | 27676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.8% | 134 |
| wompi.Quokka 1.6 | 2.8 | 11.9% | 14 |
| bzdp.Pansy 2.1 | 3.0 | 11.6% | 17 |
| wee.Gem 1.8.4 | 4.0 | 11.2% | 25 |
| ratosh.Nobo 0.21 | 4.5 | 10.9% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 7 |
| bayen.UbaMicro 1.4 | 6.7 | 9.1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.1 | 21 / 35 | 4622 |
| 2 | 1 | 66.7 | 82.9 | 25 / 35 | 4393 |
| 3 | 1 | 64.4 | 74.0 | 16 / 35 | 4472 |
| 4 | 1 | 67.7 | 86.3 | 24 / 35 | 4684 |
| 5 | 1 | 68.2 | 85.7 | 24 / 35 | 4783 |
| 6 | 1 | 67.2 | 81.3 | 24 / 35 | 4722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 92% |
| wompi.Quokka 1.6 | 29 | 90% |
| wee.Gem 1.8.4 | 23 | 100% |
| ratosh.Nobo 0.21 | 22 | 86% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| m3thos.Eva00 1.1 | 7 | 57% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 58 |
| wompi.Quokka 1.6 | 12 | 16% | 30 |
| m3thos.Eva00 1.1 | 11 | 14% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 12 |
| maribo.FollowFire 1 | 8 | 11% | 8 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 10 |
| wee.Gem 1.8.4 | 6 | 8% | 33 |
| bayen.UbaMicro 1.4 | 6 | 8% | 16 |
| ratosh.Nobo 0.21 | 4 | 5% | 18 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 90.4 | 144 / 210 | 1.87 | 22.0% | 47352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 22.0% | 144 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 43 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 17 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 6 |
| stuff.Vlad 0.1 | 5.0 | 9.0% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 91.4 | 28 / 35 | 8122 |
| 2 | 1 | 74.7 | 94.6 | 26 / 35 | 8567 |
| 3 | 1 | 74.5 | 93.3 | 26 / 35 | 8521 |
| 4 | 1 | 72.6 | 88.9 | 19 / 35 | 7761 |
| 5 | 1 | 72.7 | 89.8 | 25 / 35 | 7544 |
| 6 | 1 | 70.5 | 84.1 | 20 / 35 | 6837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 85% |
| exauge.GateKeeper 1.1.121g | 16 | 100% |
| mz.NanoGod 2.02 | 15 | 67% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 48% | 137 |
| mz.NanoGod 2.02 | 24 | 36% | 39 |
| exauge.GateKeeper 1.1.121g | 3 | 5% | 11 |
| ayk.WallHugger 1.0 | 3 | 5% | 8 |
| stuff.Vlad 0.1 | 2 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.0 | 104 / 210 | 3.43 | 16.6% | 28165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.6% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.0% | 21 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.8% | 27 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.3% | 23 |
| bvh.micro.Freya 0.3 | 4.7 | 10.8% | 11 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 8 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 6 |
| ap.Frederick 1.1 | 8.3 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 75.2 | 21 / 35 | 4207 |
| 2 | 1 | 66.4 | 77.8 | 19 / 35 | 4683 |
| 3 | 2 | 61.8 | 64.8 | 12 / 35 | 4168 |
| 4 | 1 | 67.0 | 83.2 | 20 / 35 | 4714 |
| 5 | 1 | 64.7 | 69.5 | 15 / 35 | 5186 |
| 6 | 1 | 64.5 | 67.6 | 17 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| dummy.micro.Sparrow 2.5 | 30 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 72% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 21% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 19% | 42 |
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 56 |
| conscience.Electron 1.3g | 19 | 18% | 20 |
| bvh.micro.Freya 0.3 | 10 | 9% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 7% | 8 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 10 |
| dl.BetterWalls 1.0 | 3 | 3% | 4 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.4 | 150 / 210 | 2.40 | 21.0% | 41691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.0% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 17 |
| sul.Lunar 1.1 | 3.0 | 12.0% | 12 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.8% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 4 |
| sample.Corners 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 84.8 | 26 / 35 | 7179 |
| 2 | 1 | 68.4 | 75.6 | 22 / 35 | 6171 |
| 3 | 1 | 71.7 | 87.0 | 26 / 35 | 7064 |
| 4 | 1 | 70.6 | 80.6 | 22 / 35 | 7125 |
| 5 | 1 | 71.2 | 83.5 | 23 / 35 | 7289 |
| 6 | 1 | 73.2 | 95.2 | 31 / 35 | 6863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 64 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 95% |
| supersample.SuperBoxBot 1.0 | 21 | 90% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| dsw.StaticD 1.0 | 6 | 67% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 30% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 23% | 67 |
| dsw.StaticD 1.0 | 8 | 13% | 13 |
| sul.Lunar 1.1 | 5 | 8% | 65 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.8 | 108 / 210 | 2.90 | 18.2% | 37602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.2% | 108 |
| radnor.DoctorBob 1.42 | 2.7 | 12.9% | 26 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 23 |
| amz.NanoClone 1.41 | 4.5 | 10.8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.1% | 23 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 7 |
| sample.Walls 1.0 | 7.3 | 7.6% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 78.7 | 19 / 35 | 6562 |
| 2 | 1 | 66.3 | 74.3 | 17 / 35 | 5946 |
| 3 | 1 | 68.6 | 80.3 | 22 / 35 | 6555 |
| 4 | 1 | 68.9 | 85.1 | 21 / 35 | 6136 |
| 5 | 1 | 67.2 | 78.1 | 12 / 35 | 6419 |
| 6 | 1 | 66.5 | 76.5 | 17 / 35 | 5984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 81% |
| radnor.DoctorBob 1.42 | 29 | 93% |
| mld.Wisdom 1.0 | 26 | 65% |
| amz.NanoClone 1.41 | 15 | 60% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 33% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 18% | 53 |
| radnor.DoctorBob 1.42 | 17 | 17% | 47 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 16 |
| amz.NanoClone 1.41 | 12 | 12% | 23 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

