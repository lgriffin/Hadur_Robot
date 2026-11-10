# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.2 | 153 / 210 | 1.98 | 21.6% | 42899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.6% | 153 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 21 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 20 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 1 |
| sample.Walls 1.0 | 6.2 | 7.3% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.6% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 96.5 | 29 / 35 | 7358 |
| 2 | 1 | 72.4 | 89.2 | 24 / 35 | 7244 |
| 3 | 1 | 72.1 | 87.9 | 24 / 35 | 7261 |
| 4 | 1 | 72.4 | 89.5 | 27 / 35 | 6891 |
| 5 | 1 | 70.6 | 82.5 | 23 / 35 | 6779 |
| 6 | 1 | 73.0 | 89.2 | 26 / 35 | 7366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 96% |
| radnor.DoctorBob 1.42 | 44 | 86% |
| mld.Infinity 2.2 | 32 | 94% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 45% | 69 |
| mld.Infinity 2.2 | 11 | 19% | 43 |
| mz.AntiGrav 1.0 | 6 | 10% | 60 |
| amz.NanoClone 1.41 | 6 | 10% | 14 |
| jangs.ns51 1.0 | 5 | 9% | 7 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.5 | 122 / 210 | 2.22 | 19.1% | 33764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.1% | 122 |
| mld.DustBunny 3.8 | 2.5 | 14.1% | 21 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 50 |
| maribo.melee.BMV 0.1 | 4.3 | 10.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 8.4% | 9 |
| zyx.nano.Ant 1.1 | 6.5 | 7.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.8% | 2 |
| fullsail.SweetTea 1.1 | 7.7 | 6.6% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.8 | 20 / 35 | 5513 |
| 2 | 1 | 70.3 | 91.1 | 21 / 35 | 5954 |
| 3 | 1 | 69.2 | 87.9 | 22 / 35 | 5628 |
| 4 | 1 | 70.1 | 93.0 | 24 / 35 | 5798 |
| 5 | 1 | 67.5 | 82.2 | 17 / 35 | 5434 |
| 6 | 1 | 68.7 | 86.7 | 18 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 72% |
| mld.DustBunny 3.8 | 52 | 88% |
| maribo.melee.BMV 0.1 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 5 | 60% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 38% | 76 |
| mld.DustBunny 3.8 | 26 | 29% | 70 |
| maribo.melee.BMV 0.1 | 7 | 8% | 15 |
| zyx.nano.Ant 1.1 | 7 | 8% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 15 |
| fullsail.SweetTea 1.1 | 4 | 4% | 10 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 78.9 | 124 / 210 | 2.90 | 19.2% | 37093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 124 |
| myl.micro.Troodon 1.10 | 2.3 | 14.5% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.3% | 7 |
| cb.nano.Insomnia 1.0 | 4.3 | 9.9% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.6% | 23 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 4 |
| sample.Fire 1.0 | 9.5 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 74.9 | 22 / 35 | 6423 |
| 2 | 1 | 69.8 | 82.9 | 21 / 35 | 6492 |
| 3 | 1 | 67.5 | 75.6 | 16 / 35 | 5662 |
| 4 | 1 | 70.2 | 82.5 | 23 / 35 | 6198 |
| 5 | 1 | 68.7 | 77.1 | 20 / 35 | 6467 |
| 6 | 1 | 69.1 | 80.3 | 22 / 35 | 5851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 95% |
| myl.nano.KomoriNinja 1.1 | 26 | 96% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 71% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 8 | 75% |
| sample.Fire 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 35 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 18 |
| myl.nano.KomoriNinja 1.1 | 14 | 16% | 44 |
| fm.mammillarias 1.3 | 13 | 15% | 20 |
| myl.micro.Troodon 1.10 | 10 | 11% | 58 |
| cs.sheldor.Talon 1.1 | 7 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 16 |
| sample.Fire 1.0 | 3 | 3% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.0 | 147 / 210 | 1.99 | 21.2% | 40522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.2% | 147 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 22 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 8 |
| tj.zombie1n 1.0.1 | 5.2 | 8.9% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.1% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.3% | 10 |
| yk.JahMicro 1.0 | 6.7 | 8.4% | 6 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.5 | 23 / 35 | 6846 |
| 2 | 1 | 70.5 | 86.7 | 23 / 35 | 6456 |
| 3 | 1 | 71.6 | 92.1 | 26 / 35 | 6702 |
| 4 | 1 | 72.4 | 94.0 | 26 / 35 | 6629 |
| 5 | 1 | 69.8 | 84.4 | 22 / 35 | 6496 |
| 6 | 1 | 72.6 | 93.7 | 27 / 35 | 7393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 76% |
| stelo.SoJNanoMelee 1.1 | 34 | 91% |
| tvv.micro.Antares 1.1.1 | 23 | 96% |
| tj.zombie1n 1.0.1 | 21 | 86% |
| yk.JahMicro 1.0 | 13 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 33 | 52% | 86 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 7 |
| stelo.SoJNanoMelee 1.1 | 6 | 10% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 20 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 34 |
| tj.zombie1n 1.0.1 | 4 | 6% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 12 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.3 | 79 / 210 | 3.86 | 16.0% | 30640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.0% | 79 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 43 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 21 |
| ahf.NanoAndrew .4 | 3.8 | 11.4% | 34 |
| EBBU.Sim2 1.02 | 6.0 | 9.5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.3% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.0% | 8 |
| sam.Samspin 1.0 | 6.8 | 9.0% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 66.3 | 13 / 35 | 4760 |
| 2 | 1 | 63.0 | 67.3 | 9 / 35 | 5073 |
| 3 | 1 | 65.3 | 71.7 | 14 / 35 | 5360 |
| 4 | 1 | 65.7 | 71.7 | 16 / 35 | 5505 |
| 5 | 1 | 64.5 | 72.1 | 13 / 35 | 5031 |
| 6 | 1 | 61.7 | 60.3 | 14 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 61% |
| simonton.nano.MeleeSeed 1.8 | 34 | 82% |
| ahf.NanoAndrew .4 | 17 | 65% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sam.Samspin 1.0 | 6 | 100% |
| EBBU.Sim2 1.02 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 24% | 57 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 37 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 11% | 15 |
| ahf.NanoAndrew .4 | 14 | 11% | 30 |
| sam.Samspin 1.0 | 11 | 8% | 15 |
| EBBU.Sim2 1.02 | 11 | 8% | 13 |
| zyx.nano.BacillusComma 1.0 | 11 | 8% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 121 / 210 | 2.39 | 18.8% | 32073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.8% | 121 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.4% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 6 |
| fm.claire 1.7 | 6.8 | 7.9% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.1% | 6 |
| pa.Improved 1.0 | 9.0 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 17 / 35 | 5517 |
| 2 | 1 | 66.8 | 81.3 | 20 / 35 | 4935 |
| 3 | 1 | 67.7 | 84.1 | 18 / 35 | 5199 |
| 4 | 1 | 69.5 | 88.6 | 25 / 35 | 5160 |
| 5 | 1 | 71.2 | 91.7 | 24 / 35 | 6179 |
| 6 | 1 | 65.6 | 78.7 | 17 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 79% |
| oog.melee.CapuletDroid 1.1 | 34 | 94% |
| arthord.NanoSatanMelee Beta | 10 | 70% |
| gh.nano.Grofvuil 0.2 | 10 | 90% |
| kurios.DOSexe .9b | 5 | 60% |
| sample.SpinBot 1.0 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 50% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 45% | 91 |
| arthord.NanoSatanMelee Beta | 12 | 13% | 14 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 28 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 42 |
| kurios.DOSexe .9b | 5 | 6% | 8 |
| fm.claire 1.7 | 5 | 6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 7 |
| sample.SpinBot 1.0 | 4 | 4% | 7 |
| pa.Improved 1.0 | 3 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.0 | 100 / 210 | 2.80 | 18.0% | 34221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.0% | 100 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 37 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.7% | 32 |
| mz.MicroGodMelee 1 | 4.0 | 12.7% | 29 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 8 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 1 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.8% | 1 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.8 | 17 / 35 | 5408 |
| 2 | 1 | 67.1 | 78.4 | 19 / 35 | 5301 |
| 3 | 1 | 66.3 | 73.0 | 16 / 35 | 5624 |
| 4 | 1 | 69.4 | 85.4 | 17 / 35 | 6428 |
| 5 | 1 | 67.2 | 78.7 | 15 / 35 | 5611 |
| 6 | 1 | 67.4 | 79.7 | 16 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 91% |
| mz.MicroGodMelee 1 | 33 | 64% |
| gh.micro.Gruweltje 0.7 | 28 | 54% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 29% | 56 |
| gh.micro.Gruweltje 0.7 | 30 | 27% | 52 |
| spinnercat.micro.Tyger 0.1 | 28 | 25% | 71 |
| fire219.CatBot 1.0 | 8 | 7% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 68.5 | 103 / 210 | 3.84 | 16.3% | 31367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 16.3% | 103 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.5% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 38 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 8 |
| germ.TheMind .2 | 5.2 | 9.6% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 9.0% | 6 |
| awesomeness.Elite 1.0 | 6.5 | 8.9% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.4% | 2 |
| sample.Crazy 1.0 | 8.3 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.7 | 18 / 35 | 5334 |
| 2 | 1 | 63.5 | 64.4 | 15 / 35 | 5353 |
| 3 | 2 | 63.6 | 64.4 | 16 / 35 | 5298 |
| 4 | 1 | 65.0 | 71.1 | 23 / 35 | 4903 |
| 5 | 1 | 66.4 | 73.3 | 16 / 35 | 5742 |
| 6 | 1 | 63.0 | 64.8 | 15 / 35 | 4737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 61% |
| qualidafial.MajorDick 1.0.1 | 12 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| germ.TheMind .2 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 39% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 33 |
| germ.TheMind .2 | 10 | 9% | 15 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 16 |
| awesomeness.Elite 1.0 | 9 | 8% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.1 | 144 / 210 | 2.07 | 20.1% | 32523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.1% | 144 |
| rz.HawkOnFire 0.1 | 2.0 | 14.5% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 11 |
| timmit.nano.TimDog 0.33 | 4.7 | 9.9% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.5% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 8.0% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 8.0% | 4 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 88.6 | 24 / 35 | 5687 |
| 2 | 1 | 71.7 | 91.7 | 27 / 35 | 5704 |
| 3 | 1 | 71.1 | 90.5 | 25 / 35 | 5435 |
| 4 | 1 | 68.9 | 84.1 | 22 / 35 | 5113 |
| 5 | 1 | 70.6 | 87.9 | 22 / 35 | 5400 |
| 6 | 1 | 70.0 | 86.0 | 24 / 35 | 5184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 84 | 96% |
| nz.jdc.nano.GridFu 1.0 | 27 | 93% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| timmit.nano.TimDog 0.33 | 14 | 57% |
| maribo.IotaCT 1.1 | 8 | 75% |
| ratosh.Wesco 1.4 | 5 | 60% |
| spinnercat.Omen 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 27% | 83 |
| timmit.nano.TimDog 0.33 | 18 | 27% | 31 |
| ratosh.Wesco 1.4 | 9 | 14% | 15 |
| stelo.PatternRobot 1.0 | 6 | 9% | 17 |
| maribo.IotaCT 1.1 | 5 | 8% | 16 |
| nz.jdc.nano.GridFu 1.0 | 4 | 6% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 5 |
| spinnercat.Omen 1.0 | 2 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.1 | 162 / 210 | 1.80 | 21.6% | 40364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.6% | 162 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.4% | 17 |
| baal.nano.N 1.42 | 2.8 | 12.0% | 8 |
| Grystrion.TrackerWO 1.0 | 3.8 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 8.9% | 9 |
| sanja.First 0.1 | 5.7 | 8.7% | 5 |
| cvt.Firsty 1.0 | 7.3 | 7.8% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 86.0 | 23 / 35 | 5955 |
| 2 | 1 | 72.6 | 93.3 | 27 / 35 | 6962 |
| 3 | 1 | 72.2 | 89.2 | 26 / 35 | 7212 |
| 4 | 1 | 71.6 | 93.3 | 28 / 35 | 6565 |
| 5 | 1 | 72.2 | 93.3 | 29 / 35 | 6902 |
| 6 | 1 | 71.6 | 91.4 | 29 / 35 | 6768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 90% |
| cvt.Firsty 1.0 | 36 | 89% |
| tvv.nano.Polaris 1.2 | 33 | 94% |
| sanja.First 0.1 | 25 | 96% |
| zyx.micro.Ant 1.1 | 15 | 80% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 23% | 32 |
| baal.nano.N 1.42 | 8 | 17% | 42 |
| tvv.nano.Polaris 1.2 | 7 | 15% | 53 |
| Grystrion.TrackerWO 1.0 | 7 | 15% | 17 |
| cvt.Firsty 1.0 | 6 | 13% | 29 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 9 |
| sample.RamFire 1.0 | 3 | 6% | 3 |
| sanja.First 0.1 | 2 | 4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.0 | 91 / 210 | 3.70 | 15.9% | 32082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.5 | 15.9% | 91 |
| kc.micro.Figment 1.0 | 1.5 | 15.2% | 62 |
| cs.Wren 1.0 | 3.5 | 12.0% | 17 |
| mz.Cork 0.1 | 4.2 | 11.3% | 16 |
| js.PinBall 1.6 | 4.3 | 11.3% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 0 |
| evd.X1 0.01 | 6.8 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 6 |
| donjezza.Jezza 1.0 | 9.3 | 5.1% | 2 |
| PSW.Relentless 0.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.4 | 16 / 35 | 5585 |
| 2 | 1 | 66.6 | 75.6 | 18 / 35 | 5722 |
| 3 | 2 | 60.7 | 63.2 | 11 / 35 | 4560 |
| 4 | 1 | 65.7 | 77.5 | 17 / 35 | 5494 |
| 5 | 2 | 61.4 | 62.2 | 13 / 35 | 5037 |
| 6 | 2 | 64.7 | 69.2 | 16 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 75% |
| cs.Wren 1.0 | 21 | 95% |
| mz.Cork 0.1 | 12 | 67% |
| js.PinBall 1.6 | 7 | 71% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 47% | 111 |
| mz.Cork 0.1 | 14 | 12% | 23 |
| cs.Wren 1.0 | 12 | 10% | 27 |
| joe.ADinosaur 1.0 | 10 | 8% | 15 |
| evd.X1 0.01 | 9 | 8% | 10 |
| js.PinBall 1.6 | 8 | 7% | 12 |
| PSW.Relentless 0.1 | 8 | 7% | 9 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.7 | 123 / 210 | 2.64 | 18.4% | 28645 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.4% | 123 |
| myl.nano.Graviton 1.10 | 3.0 | 11.6% | 19 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.2% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 4 |
| disan.Chair 2.2.0 | 6.8 | 8.7% | 9 |
| DBall.NUKE 0.1 | 8.0 | 7.8% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.6 | 23 / 35 | 4913 |
| 2 | 1 | 68.0 | 82.9 | 20 / 35 | 5192 |
| 3 | 1 | 64.4 | 74.9 | 13 / 35 | 4305 |
| 4 | 1 | 66.3 | 77.5 | 19 / 35 | 4458 |
| 5 | 1 | 68.8 | 87.6 | 24 / 35 | 4655 |
| 6 | 1 | 69.2 | 86.0 | 24 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 94% |
| stelo.AreaTargetingBot 1.1 | 26 | 92% |
| disan.Chair 2.2.0 | 24 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 63% |
| ntc.Opposite 1.5 | 15 | 87% |
| donjezza.Muncho 1.0 | 10 | 70% |
| DBall.NUKE 0.1 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 18% | 28 |
| myl.nano.Graviton 1.10 | 15 | 17% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 15% | 23 |
| stelo.AreaTargetingBot 1.1 | 11 | 13% | 30 |
| ntc.Opposite 1.5 | 11 | 13% | 24 |
| disan.Chair 2.2.0 | 9 | 10% | 21 |
| DBall.NUKE 0.1 | 7 | 8% | 18 |
| donjezza.Muncho 1.0 | 5 | 6% | 11 |
| pbg.R2D2 1.0 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.9 | 71 / 210 | 3.89 | 15.1% | 26830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.5 | 15.1% | 71 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.1% | 45 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.8% | 26 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 10 |
| ejb.Polaris 1.0.1 | 5.7 | 10.5% | 6 |
| step.nanoPri 1.0 | 7.3 | 7.3% | 2 |
| stelo.MirrorNano 1.3 | 7.7 | 7.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 65.7 | 13 / 35 | 4418 |
| 2 | 4 | 60.2 | 61.0 | 10 / 35 | 3820 |
| 3 | 1 | 65.2 | 71.4 | 14 / 35 | 4815 |
| 4 | 1 | 64.4 | 71.1 | 12 / 35 | 4638 |
| 5 | 1 | 63.0 | 67.6 | 10 / 35 | 4562 |
| 6 | 1 | 63.9 | 70.5 | 12 / 35 | 4577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| oog.melee.Capulet 1.2 | 22 | 50% |
| yagami.Tidus 0.11 | 8 | 88% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 42% | 76 |
| yagami.Tidus 0.11 | 21 | 15% | 32 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 34 |
| ejb.Polaris 1.0.1 | 14 | 10% | 18 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| step.nanoPri 1.0 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.2 | 127 / 210 | 2.88 | 17.4% | 27453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.4% | 127 |
| bzdp.Pansy 2.1 | 2.7 | 12.6% | 17 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 9 |
| wompi.Quokka 1.6 | 3.7 | 11.8% | 15 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 24 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 4 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.3 | 22 / 35 | 4640 |
| 2 | 1 | 66.7 | 81.6 | 23 / 35 | 4222 |
| 3 | 1 | 63.4 | 69.8 | 17 / 35 | 4555 |
| 4 | 1 | 66.1 | 75.9 | 20 / 35 | 4777 |
| 5 | 1 | 64.8 | 75.6 | 20 / 35 | 4359 |
| 6 | 1 | 68.8 | 85.7 | 25 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 63 | 94% |
| wompi.Quokka 1.6 | 30 | 80% |
| ratosh.Nobo 0.21 | 17 | 82% |
| wee.Gem 1.8.4 | 16 | 81% |
| bayen.UbaMicro 1.4 | 9 | 56% |
| m3thos.Eva00 1.1 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 17 | 20% | 19 |
| bzdp.Pansy 2.1 | 14 | 16% | 58 |
| ratosh.Nobo 0.21 | 11 | 13% | 28 |
| wompi.Quokka 1.6 | 11 | 13% | 26 |
| bayen.UbaMicro 1.4 | 10 | 12% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 10 |
| wee.Gem 1.8.4 | 6 | 7% | 29 |
| m3thos.Eva00 1.1 | 4 | 5% | 12 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 88.4 | 130 / 210 | 2.05 | 22.2% | 51383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 22.2% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 66 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 8 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 3 |
| ayk.WallHugger 1.0 | 5.2 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 85.7 | 20 / 35 | 8261 |
| 2 | 1 | 74.0 | 89.8 | 23 / 35 | 8701 |
| 3 | 1 | 74.3 | 92.1 | 22 / 35 | 8672 |
| 4 | 1 | 73.1 | 87.6 | 22 / 35 | 8219 |
| 5 | 1 | 73.8 | 87.9 | 22 / 35 | 8729 |
| 6 | 1 | 73.6 | 87.0 | 21 / 35 | 8801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 78% |
| mz.NanoGod 2.02 | 15 | 80% |
| exauge.GateKeeper 1.1.121g | 14 | 93% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 44% | 130 |
| mz.NanoGod 2.02 | 27 | 34% | 41 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 13 |
| ayk.WallHugger 1.0 | 7 | 9% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.8 | 113 / 210 | 3.18 | 17.2% | 30147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.2% | 113 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 20 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.3% | 7 |
| conscience.Electron 1.3g | 7.2 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 6 |
| dl.BetterWalls 1.0 | 9.2 | 5.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.2 | 13 / 35 | 4928 |
| 2 | 1 | 68.4 | 84.1 | 23 / 35 | 5424 |
| 3 | 1 | 69.0 | 86.3 | 25 / 35 | 5193 |
| 4 | 1 | 64.3 | 72.7 | 18 / 35 | 4565 |
| 5 | 1 | 65.0 | 71.1 | 17 / 35 | 5157 |
| 6 | 1 | 64.4 | 71.1 | 17 / 35 | 4880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| dummy.micro.Sparrow 2.5 | 32 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 70% |
| bvh.micro.Freya 0.3 | 15 | 80% |
| ap.Frederick 1.1 | 13 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 20% | 40 |
| dummy.micro.Sparrow 2.5 | 17 | 18% | 39 |
| voidious.micro.BlitzBat 1.05 | 16 | 16% | 53 |
| conscience.Electron 1.3g | 14 | 14% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 16 |
| bvh.micro.Freya 0.3 | 10 | 10% | 21 |
| dl.BetterWalls 1.0 | 5 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 11 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 83.0 | 128 / 210 | 2.53 | 20.7% | 43737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.7% | 128 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 30 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 18 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.5% | 13 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.1% | 5 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 6 |
| sample.Corners 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 86.7 | 24 / 35 | 7656 |
| 2 | 1 | 69.1 | 76.8 | 18 / 35 | 7294 |
| 3 | 1 | 69.9 | 83.5 | 18 / 35 | 6647 |
| 4 | 1 | 73.0 | 90.8 | 28 / 35 | 7556 |
| 5 | 1 | 69.8 | 76.5 | 19 / 35 | 7287 |
| 6 | 1 | 71.1 | 83.5 | 21 / 35 | 7297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 33 | 91% |
| supersample.SuperBoxBot 1.0 | 33 | 88% |
| dsw.StaticD 1.0 | 10 | 70% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 23 | 28% | 59 |
| supersample.SuperBoxBot 1.0 | 23 | 28% | 39 |
| dsw.StaticD 1.0 | 12 | 15% | 26 |
| sul.Lunar 1.1 | 9 | 11% | 52 |
| mme.NikeEnhanced 2.0 | 6 | 7% | 12 |
| sample.MyFirstRobot 1.0 | 5 | 6% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| sample.Corners 1.0 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.3 | 111 / 210 | 2.68 | 18.8% | 38763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.8% | 111 |
| mld.Wisdom 1.0 | 2.3 | 12.6% | 27 |
| radnor.DoctorBob 1.42 | 2.7 | 13.1% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.6% | 18 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.5% | 12 |
| amz.NanoClone 1.41 | 5.5 | 9.6% | 9 |
| sample.Walls 1.0 | 7.5 | 7.5% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 7.4% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 79.0 | 19 / 35 | 6424 |
| 2 | 1 | 68.5 | 81.9 | 20 / 35 | 6542 |
| 3 | 1 | 66.7 | 77.1 | 15 / 35 | 6093 |
| 4 | 1 | 68.2 | 82.2 | 18 / 35 | 6204 |
| 5 | 1 | 69.4 | 84.1 | 19 / 35 | 6871 |
| 6 | 1 | 69.5 | 83.5 | 20 / 35 | 6629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 89% |
| radnor.DoctorBob 1.42 | 35 | 74% |
| mld.Wisdom 1.0 | 25 | 68% |
| KiraNL.Chupacabra 0.4 | 10 | 70% |
| jangs.ns51 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 30% | 49 |
| radnor.DoctorBob 1.42 | 21 | 21% | 59 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 47 |
| amz.NanoClone 1.41 | 8 | 8% | 15 |
| sample.Walls 1.0 | 4 | 4% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

