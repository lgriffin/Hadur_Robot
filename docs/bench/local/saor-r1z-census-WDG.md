# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.2 | 154 / 210 | 1.88 | 21.6% | 42598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.6% | 154 |
| radnor.DoctorBob 1.42 | 2.3 | 14.5% | 28 |
| mz.AntiGrav 1.0 | 3.0 | 13.6% | 13 |
| mld.Infinity 2.2 | 3.7 | 12.4% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 1 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| sample.Walls 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 85.1 | 25 / 35 | 6385 |
| 2 | 1 | 71.9 | 89.5 | 25 / 35 | 7085 |
| 3 | 1 | 73.9 | 94.0 | 27 / 35 | 7867 |
| 4 | 1 | 72.5 | 91.7 | 24 / 35 | 7059 |
| 5 | 1 | 72.9 | 91.1 | 26 / 35 | 7375 |
| 6 | 1 | 72.2 | 89.8 | 27 / 35 | 6827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 94% |
| mld.Infinity 2.2 | 47 | 89% |
| radnor.DoctorBob 1.42 | 31 | 81% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 45% | 69 |
| mz.AntiGrav 1.0 | 13 | 23% | 69 |
| mld.Infinity 2.2 | 9 | 16% | 40 |
| amz.NanoClone 1.41 | 4 | 7% | 9 |
| jangs.ns51 1.0 | 2 | 4% | 7 |
| arthord.MannyPacquiao Beta | 2 | 4% | 4 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.3 | 131 / 210 | 1.96 | 19.5% | 33854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.5% | 131 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 42 |
| mld.DustBunny 3.8 | 3.3 | 12.4% | 18 |
| maribo.melee.BMV 0.1 | 3.8 | 10.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 7 |
| zyx.nano.Ant 1.1 | 6.8 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 7 |
| fullsail.SweetTea 1.1 | 7.3 | 7.5% | 3 |
| bzdp.BoxCar 2.0 | 7.7 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 20 / 35 | 5336 |
| 2 | 1 | 69.1 | 86.7 | 22 / 35 | 5913 |
| 3 | 1 | 69.0 | 89.8 | 21 / 35 | 5609 |
| 4 | 1 | 70.0 | 89.5 | 25 / 35 | 5870 |
| 5 | 1 | 70.3 | 90.2 | 24 / 35 | 5779 |
| 6 | 1 | 68.5 | 88.6 | 19 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 70% |
| mld.DustBunny 3.8 | 55 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 19 | 74% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 45% | 88 |
| mld.DustBunny 3.8 | 16 | 20% | 62 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 10% | 19 |
| maribo.melee.BMV 0.1 | 5 | 6% | 12 |
| bzdp.BoxCar 2.0 | 5 | 6% | 7 |
| zyx.nano.Ant 1.1 | 4 | 5% | 6 |
| fullsail.SweetTea 1.1 | 3 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 9 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.5 | 147 / 210 | 2.22 | 20.6% | 37766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.6% | 147 |
| myl.micro.Troodon 1.10 | 2.2 | 13.2% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.1% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.9% | 20 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.7% | 6 |
| fm.mammillarias 1.3 | 5.2 | 9.8% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.1% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 23 / 35 | 5860 |
| 2 | 1 | 71.4 | 88.3 | 23 / 35 | 6809 |
| 3 | 1 | 71.6 | 90.8 | 28 / 35 | 6208 |
| 4 | 1 | 67.3 | 76.5 | 19 / 35 | 5453 |
| 5 | 1 | 72.2 | 89.5 | 27 / 35 | 6894 |
| 6 | 1 | 71.7 | 88.6 | 27 / 35 | 6542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 89% |
| myl.micro.Troodon 1.10 | 38 | 95% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| sp.Nanos.Ember 1.1 | 19 | 100% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| fm.mammillarias 1.3 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 30% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 22% | 41 |
| myl.micro.Troodon 1.10 | 13 | 21% | 63 |
| myl.nano.KomoriNinja 1.1 | 7 | 11% | 32 |
| fm.mammillarias 1.3 | 6 | 10% | 12 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 7 |
| sp.Nanos.Ember 1.1 | 1 | 2% | 26 |
| sample.Fire 1.0 | 1 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.0 | 155 / 210 | 2.17 | 20.8% | 39853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.8% | 155 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.2% | 20 |
| kawigi.nano.Lib 1.0 | 2.8 | 11.9% | 10 |
| tj.zombie1n 1.0.1 | 5.0 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.2% | 1 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.1% | 6 |
| repositorio.NanoStep 1.0 | 9.2 | 5.9% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.8 | 27 / 35 | 6453 |
| 2 | 1 | 72.5 | 92.1 | 29 / 35 | 7043 |
| 3 | 1 | 70.1 | 81.9 | 24 / 35 | 6937 |
| 4 | 1 | 69.6 | 85.1 | 25 / 35 | 6175 |
| 5 | 1 | 71.2 | 87.3 | 24 / 35 | 7065 |
| 6 | 1 | 70.0 | 84.8 | 26 / 35 | 6180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 44 | 93% |
| stelo.SoJNanoMelee 1.1 | 39 | 95% |
| tj.zombie1n 1.0.1 | 30 | 90% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 35% | 66 |
| tvv.micro.Antares 1.1.1 | 11 | 20% | 38 |
| stelo.SoJNanoMelee 1.1 | 8 | 15% | 31 |
| tj.zombie1n 1.0.1 | 6 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 12 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |
| yk.JahMicro 1.0 | 0 | 0% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 65.3 | 88 / 210 | 4.12 | 15.3% | 28229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.3% | 88 |
| ahf.NanoAndrew .4 | 2.3 | 12.3% | 32 |
| oog.melee.Corsair 1.0 | 2.7 | 12.3% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 19 |
| sam.Samspin 1.0 | 5.7 | 9.5% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.1% | 8 |
| EBBU.Sim2 1.02 | 6.2 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.7% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 7.2% | 3 |
| sample.TrackFire 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.9 | 17 / 35 | 5019 |
| 2 | 2 | 57.0 | 52.1 | 8 / 35 | 4136 |
| 3 | 1 | 62.0 | 63.2 | 15 / 35 | 4660 |
| 4 | 1 | 61.9 | 62.5 | 13 / 35 | 4850 |
| 5 | 1 | 66.0 | 77.1 | 17 / 35 | 4989 |
| 6 | 1 | 63.2 | 68.3 | 18 / 35 | 4575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 97% |
| oog.melee.Corsair 1.0 | 31 | 65% |
| ahf.NanoAndrew .4 | 19 | 68% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |

Hadur died in 123 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 47 |
| oog.melee.Corsair 1.0 | 21 | 17% | 43 |
| zyx.nano.BacillusComma 1.0 | 19 | 15% | 22 |
| ahf.NanoAndrew .4 | 17 | 14% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 14% | 17 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 17 |
| EBBU.Sim2 1.02 | 6 | 5% | 14 |
| sam.Samspin 1.0 | 4 | 3% | 11 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.6 | 129 / 210 | 2.39 | 19.1% | 33636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.1% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 35 |
| gh.nano.Grofvuil 0.2 | 3.7 | 11.5% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.4% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.1% | 7 |
| fm.claire 1.7 | 6.2 | 8.7% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 4 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 27 / 35 | 5786 |
| 2 | 1 | 67.3 | 81.9 | 20 / 35 | 5174 |
| 3 | 1 | 68.1 | 82.2 | 22 / 35 | 5334 |
| 4 | 1 | 68.6 | 85.4 | 20 / 35 | 5791 |
| 5 | 1 | 67.9 | 80.6 | 19 / 35 | 5837 |
| 6 | 1 | 68.4 | 83.5 | 21 / 35 | 5714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 80% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| sample.SpinBot 1.0 | 17 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| gh.nano.Grofvuil 0.2 | 11 | 91% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 26% | 56 |
| gh.nano.Grofvuil 0.2 | 18 | 22% | 31 |
| arthord.NanoSatanMelee Beta | 14 | 17% | 24 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 56 |
| sample.SpinBot 1.0 | 8 | 10% | 15 |
| fm.claire 1.7 | 6 | 7% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 6 |
| kurios.DOSexe .9b | 2 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.9 | 106 / 210 | 2.63 | 18.5% | 35152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.5% | 106 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 31 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.8% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.1% | 31 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.0% | 2 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 6 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 4 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.8% | 0 |
| fire219.CatBot 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.3 | 17 / 35 | 5712 |
| 2 | 1 | 69.0 | 85.1 | 20 / 35 | 5698 |
| 3 | 1 | 67.9 | 78.4 | 17 / 35 | 6144 |
| 4 | 1 | 67.1 | 81.0 | 16 / 35 | 5480 |
| 5 | 1 | 69.3 | 86.3 | 21 / 35 | 6031 |
| 6 | 1 | 67.7 | 80.0 | 15 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 82% |
| mz.MicroGodMelee 1 | 36 | 58% |
| gh.micro.Gruweltje 0.7 | 26 | 62% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 27 | 26% | 54 |
| mz.MicroGodMelee 1 | 27 | 26% | 49 |
| spinnercat.micro.Tyger 0.1 | 23 | 22% | 58 |
| acogdev.alpha 0.2 | 10 | 10% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| fire219.CatBot 1.0 | 6 | 6% | 7 |
| DBall.Anarchy 0.1 | 2 | 2% | 13 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.6 | 118 / 210 | 3.29 | 17.3% | 31472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.3% | 118 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 14.2% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.3% | 31 |
| germ.TheMind .2 | 4.8 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.2 | 9.1% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.0% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.6% | 6 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 25 / 35 | 5589 |
| 2 | 1 | 67.3 | 78.1 | 18 / 35 | 5617 |
| 3 | 1 | 66.1 | 73.7 | 20 / 35 | 5416 |
| 4 | 1 | 63.3 | 66.7 | 18 / 35 | 4955 |
| 5 | 1 | 64.4 | 72.1 | 19 / 35 | 4495 |
| 6 | 1 | 65.8 | 72.7 | 18 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 79% |
| germ.TheMind .2 | 9 | 89% |
| sample.Crazy 1.0 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 45% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 17% | 38 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 13 |
| germ.TheMind .2 | 8 | 9% | 18 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.9 | 150 / 210 | 2.09 | 20.0% | 31799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.0% | 150 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 13 |
| maribo.IotaCT 1.1 | 4.7 | 10.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.0% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 9 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 8.0% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.2 | 23 / 35 | 5168 |
| 2 | 1 | 70.8 | 89.8 | 25 / 35 | 5482 |
| 3 | 1 | 71.0 | 89.8 | 26 / 35 | 5556 |
| 4 | 1 | 70.4 | 88.3 | 27 / 35 | 5196 |
| 5 | 1 | 69.0 | 85.1 | 20 / 35 | 5207 |
| 6 | 1 | 71.6 | 91.1 | 29 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 94% |
| nz.jdc.nano.GridFu 1.0 | 33 | 97% |
| timmit.nano.TimDog 0.33 | 13 | 69% |
| maribo.IotaCT 1.1 | 12 | 83% |
| ratosh.Wesco 1.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 11 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 13 | 22% | 25 |
| nz.jdc.nano.GridFu 1.0 | 11 | 18% | 49 |
| rz.HawkOnFire 0.1 | 10 | 17% | 70 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 17% | 19 |
| stelo.PatternRobot 1.0 | 8 | 13% | 12 |
| maribo.IotaCT 1.1 | 3 | 5% | 11 |
| rrh.Iwillfindyou 2.0 | 3 | 5% | 3 |
| ratosh.Wesco 1.4 | 2 | 3% | 13 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.5 | 179 / 210 | 1.67 | 21.9% | 40204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.9% | 179 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 4 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.2% | 0 |
| sanja.First 0.1 | 6.8 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.7% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 96.2 | 31 / 35 | 7248 |
| 2 | 1 | 71.8 | 94.0 | 30 / 35 | 6386 |
| 3 | 1 | 71.0 | 88.3 | 29 / 35 | 6514 |
| 4 | 1 | 71.9 | 91.4 | 31 / 35 | 6833 |
| 5 | 1 | 71.5 | 91.4 | 29 / 35 | 6592 |
| 6 | 1 | 72.5 | 94.0 | 29 / 35 | 6631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 96% |
| tvv.nano.Polaris 1.2 | 37 | 92% |
| cvt.Firsty 1.0 | 26 | 92% |
| zyx.micro.Ant 1.1 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 7 | 22% | 60 |
| baal.nano.N 1.42 | 6 | 19% | 52 |
| zyx.micro.Ant 1.1 | 6 | 19% | 28 |
| sample.RamFire 1.0 | 4 | 13% | 4 |
| amk.Punbot.Punbot 0.01 | 3 | 9% | 6 |
| cvt.Firsty 1.0 | 2 | 6% | 24 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 9 |
| sanja.First 0.1 | 1 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 11 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 66.0 | 72 / 210 | 4.06 | 15.1% | 30947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 74 |
| hadur117.micro.SaorWDG 0.1 | 2.0 | 15.1% | 72 |
| cs.Wren 1.0 | 3.2 | 12.4% | 21 |
| js.PinBall 1.6 | 4.0 | 11.9% | 18 |
| mz.Cork 0.1 | 4.3 | 10.8% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 6 |
| evd.X1 0.01 | 7.0 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.8% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 71.4 | 10 / 35 | 4832 |
| 2 | 1 | 64.9 | 71.1 | 16 / 35 | 5618 |
| 3 | 2 | 64.5 | 70.5 | 13 / 35 | 5441 |
| 4 | 1 | 65.4 | 71.4 | 17 / 35 | 5412 |
| 5 | 2 | 60.7 | 61.0 | 8 / 35 | 5061 |
| 6 | 4 | 56.5 | 50.8 | 8 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 63% |
| cs.Wren 1.0 | 26 | 77% |
| mz.Cork 0.1 | 6 | 100% |
| js.PinBall 1.6 | 6 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 41% | 96 |
| cs.Wren 1.0 | 19 | 14% | 31 |
| js.PinBall 1.6 | 15 | 11% | 19 |
| joe.ADinosaur 1.0 | 14 | 10% | 20 |
| evd.X1 0.01 | 14 | 10% | 13 |
| PSW.Relentless 0.1 | 11 | 8% | 11 |
| mz.Cork 0.1 | 7 | 5% | 16 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.6 | 135 / 210 | 2.74 | 18.8% | 31017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.8% | 135 |
| myl.nano.Graviton 1.10 | 2.3 | 12.0% | 27 |
| ntc.Opposite 1.5 | 2.8 | 11.2% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.0% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.6% | 7 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 10 |
| DBall.NUKE 0.1 | 8.2 | 7.8% | 2 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 5 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 19 / 35 | 4857 |
| 2 | 1 | 67.5 | 78.4 | 23 / 35 | 4989 |
| 3 | 1 | 68.4 | 83.2 | 23 / 35 | 5066 |
| 4 | 1 | 67.0 | 75.6 | 22 / 35 | 5147 |
| 5 | 1 | 68.9 | 85.4 | 25 / 35 | 5038 |
| 6 | 1 | 69.8 | 84.4 | 23 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 89% |
| myl.nano.Graviton 1.10 | 29 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| disan.Chair 2.2.0 | 15 | 87% |
| ntc.Opposite 1.5 | 15 | 93% |
| DBall.NUKE 0.1 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 13 | 17% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 34 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 23 |
| ntc.Opposite 1.5 | 8 | 11% | 18 |
| myl.nano.Graviton 1.10 | 7 | 9% | 34 |
| disan.Chair 2.2.0 | 7 | 9% | 19 |
| DBall.NUKE 0.1 | 6 | 8% | 22 |
| pbg.R2D2 1.0 | 5 | 7% | 11 |
| donjezza.Muncho 1.0 | 4 | 5% | 9 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.9 | 78 / 210 | 3.53 | 15.7% | 27009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.7% | 78 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 53 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 16 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 12 / 35 | 4296 |
| 2 | 1 | 65.2 | 73.3 | 17 / 35 | 4495 |
| 3 | 2 | 61.0 | 63.5 | 9 / 35 | 4066 |
| 4 | 1 | 66.0 | 74.0 | 14 / 35 | 4937 |
| 5 | 1 | 64.5 | 73.0 | 11 / 35 | 4697 |
| 6 | 1 | 66.2 | 79.7 | 15 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 56% |
| kawigi.micro.Shiz 1.1 | 24 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 91% |
| yagami.Tidus 0.11 | 10 | 100% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 134 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 41% | 71 |
| yagami.Tidus 0.11 | 19 | 14% | 30 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 34 |
| ejb.Polaris 1.0.1 | 12 | 9% | 23 |
| stelo.MirrorNano 1.3 | 11 | 8% | 11 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 4 |
| logiblocs.SittingDroid 1.0 | 1 | 1% | 0 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.1 | 111 / 210 | 3.33 | 16.6% | 27540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 16.6% | 111 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 26 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 20 |
| ratosh.Nobo 0.21 | 3.5 | 11.4% | 8 |
| wee.Gem 1.8.4 | 3.8 | 11.7% | 20 |
| m3thos.Eva00 1.1 | 5.8 | 10.2% | 17 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 61.6 | 10 / 35 | 4380 |
| 2 | 1 | 67.0 | 81.9 | 21 / 35 | 4637 |
| 3 | 1 | 65.9 | 77.5 | 20 / 35 | 4752 |
| 4 | 1 | 65.3 | 76.5 | 18 / 35 | 4546 |
| 5 | 1 | 62.3 | 64.4 | 17 / 35 | 4496 |
| 6 | 1 | 67.5 | 82.5 | 25 / 35 | 4729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 92% |
| wee.Gem 1.8.4 | 34 | 91% |
| wompi.Quokka 1.6 | 18 | 89% |
| m3thos.Eva00 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 16 | 16% | 32 |
| bzdp.Pansy 2.1 | 13 | 13% | 37 |
| wompi.Quokka 1.6 | 13 | 13% | 28 |
| wee.Gem 1.8.4 | 11 | 11% | 47 |
| m3thos.Eva00 1.1 | 11 | 11% | 20 |
| maribo.FollowFire 1 | 11 | 11% | 11 |
| stelo.MyAgileRobot 0.2 | 9 | 9% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 9% | 9 |
| bayen.UbaMicro 1.4 | 6 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 85.9 | 132 / 210 | 2.27 | 21.1% | 45798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.1% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 59 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 11 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.8% | 4 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.2 | 24 / 35 | 8068 |
| 2 | 1 | 73.4 | 87.6 | 21 / 35 | 8171 |
| 3 | 1 | 70.8 | 82.5 | 19 / 35 | 7361 |
| 4 | 1 | 72.1 | 86.0 | 24 / 35 | 7534 |
| 5 | 1 | 70.9 | 81.9 | 21 / 35 | 7246 |
| 6 | 1 | 72.2 | 88.3 | 23 / 35 | 7418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 79% |
| mz.NanoGod 2.02 | 20 | 75% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 42% | 127 |
| mz.NanoGod 2.02 | 25 | 32% | 46 |
| stelo.PianistNano 1.2 | 5 | 6% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| ayk.WallHugger 1.0 | 5 | 6% | 8 |
| stuff.Vlad 0.1 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 2 | 3% | 5 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.2 | 102 / 210 | 3.50 | 16.5% | 28787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.5% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 30 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 26 |
| bvh.micro.Freya 0.3 | 4.5 | 10.6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 22 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.8% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.6% | 6 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.8 | 17 / 35 | 4904 |
| 2 | 1 | 64.7 | 75.6 | 14 / 35 | 4672 |
| 3 | 1 | 65.7 | 75.9 | 18 / 35 | 4667 |
| 4 | 1 | 63.0 | 65.4 | 14 / 35 | 4684 |
| 5 | 1 | 64.0 | 70.8 | 20 / 35 | 4420 |
| 6 | 1 | 66.2 | 74.6 | 19 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 85% |
| dummy.micro.Sparrow 2.5 | 24 | 100% |
| bvh.micro.Freya 0.3 | 18 | 72% |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 58% |
| stelo.MirrorMicro 1.0 | 10 | 90% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 63 |
| dummy.micro.Sparrow 2.5 | 19 | 18% | 46 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 16% | 18 |
| bvh.micro.Freya 0.3 | 16 | 15% | 19 |
| conscience.Electron 1.3g | 11 | 10% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 8% | 21 |
| stelo.MirrorMicro 1.0 | 9 | 8% | 19 |
| dl.BetterWalls 1.0 | 8 | 7% | 8 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.5 | 150 / 210 | 2.21 | 21.5% | 42882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.5% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 17 |
| supersample.SuperBoxBot 1.0 | 4.0 | 9.9% | 5 |
| dsw.StaticD 1.0 | 5.3 | 9.0% | 4 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.9% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.7% | 5 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 2 |
| sample.Corners 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.1 | 28 / 35 | 7744 |
| 2 | 1 | 69.9 | 79.4 | 22 / 35 | 6740 |
| 3 | 1 | 70.7 | 82.5 | 23 / 35 | 7145 |
| 4 | 1 | 72.3 | 92.1 | 26 / 35 | 6958 |
| 5 | 1 | 71.9 | 86.7 | 25 / 35 | 7223 |
| 6 | 1 | 71.9 | 86.3 | 26 / 35 | 7072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 91% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 20 | 100% |
| dsw.StaticD 1.0 | 14 | 86% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 25% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 18% | 63 |
| dsw.StaticD 1.0 | 11 | 18% | 26 |
| sul.Lunar 1.1 | 7 | 12% | 56 |
| sample.Corners 1.0 | 4 | 7% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 7 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.8 | 108 / 210 | 2.64 | 18.9% | 38768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.9% | 108 |
| radnor.DoctorBob 1.42 | 2.3 | 12.9% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 34 |
| mld.Wisdom 1.0 | 3.7 | 11.8% | 19 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.0% | 5 |
| amz.NanoClone 1.41 | 5.5 | 9.7% | 11 |
| sample.Walls 1.0 | 7.2 | 7.6% | 4 |
| GarmBox.Oranges 1.0 | 8.3 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.9 | 19 / 35 | 6606 |
| 2 | 1 | 66.4 | 76.8 | 14 / 35 | 6025 |
| 3 | 1 | 66.1 | 75.6 | 17 / 35 | 5888 |
| 4 | 1 | 71.1 | 88.6 | 21 / 35 | 7241 |
| 5 | 1 | 67.5 | 78.7 | 17 / 35 | 6236 |
| 6 | 1 | 70.4 | 89.2 | 20 / 35 | 6772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 55 | 78% |
| radnor.DoctorBob 1.42 | 26 | 77% |
| mld.Wisdom 1.0 | 16 | 50% |
| jangs.ns51 1.0 | 12 | 100% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 23% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 22% | 68 |
| mld.Wisdom 1.0 | 20 | 20% | 34 |
| KiraNL.Chupacabra 0.4 | 19 | 19% | 24 |
| amz.NanoClone 1.41 | 10 | 10% | 17 |
| sample.Walls 1.0 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

