# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 91.4 | 158 / 210 | 1.78 | 22.2% | 44282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.2% | 158 |
| radnor.DoctorBob 1.42 | 2.7 | 13.8% | 16 |
| mz.AntiGrav 1.0 | 3.0 | 13.7% | 14 |
| mld.Infinity 2.2 | 3.5 | 12.8% | 17 |
| amz.NanoClone 1.41 | 4.8 | 9.8% | 4 |
| sample.Walls 1.0 | 6.8 | 6.6% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 88.3 | 28 / 35 | 7539 |
| 2 | 1 | 73.1 | 92.7 | 28 / 35 | 7228 |
| 3 | 1 | 73.5 | 90.8 | 26 / 35 | 7688 |
| 4 | 1 | 72.2 | 90.8 | 21 / 35 | 7104 |
| 5 | 1 | 73.5 | 94.6 | 27 / 35 | 7315 |
| 6 | 1 | 73.0 | 91.1 | 28 / 35 | 7408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 96% |
| mld.Infinity 2.2 | 39 | 87% |
| radnor.DoctorBob 1.42 | 35 | 83% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 31% | 56 |
| mz.AntiGrav 1.0 | 15 | 29% | 75 |
| mld.Infinity 2.2 | 12 | 23% | 47 |
| amz.NanoClone 1.41 | 6 | 12% | 10 |
| jangs.ns51 1.0 | 1 | 2% | 8 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.4 | 112 / 210 | 2.59 | 18.3% | 32650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 18.3% | 112 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 59 |
| mld.DustBunny 3.8 | 2.7 | 13.8% | 14 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.7% | 3 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 8 |
| bzdp.BoxCar 2.0 | 8.2 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.8% | 4 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 24 / 35 | 5937 |
| 2 | 1 | 68.7 | 88.6 | 21 / 35 | 5243 |
| 3 | 1 | 68.7 | 85.1 | 22 / 35 | 5374 |
| 4 | 1 | 68.9 | 87.0 | 18 / 35 | 5807 |
| 5 | 2 | 62.2 | 59.0 | 11 / 35 | 5040 |
| 6 | 1 | 67.3 | 83.2 | 16 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 53 | 87% |
| oog.melee.Mercutio 1.0 | 53 | 64% |
| djdjdj.NanoSkunk10 1.0 | 15 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 37% | 74 |
| mld.DustBunny 3.8 | 23 | 23% | 68 |
| zyx.nano.Ant 1.1 | 9 | 9% | 11 |
| maribo.melee.BMV 0.1 | 8 | 8% | 14 |
| fullsail.SweetTea 1.1 | 7 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 10 |
| cs.Grudge 1.0 | 6 | 6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 12 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.5 | 132 / 210 | 2.49 | 19.8% | 36390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.8% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.7% | 15 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.9% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.9 | 19 / 35 | 5809 |
| 2 | 1 | 69.7 | 82.5 | 20 / 35 | 5993 |
| 3 | 1 | 71.4 | 87.9 | 24 / 35 | 6531 |
| 4 | 1 | 68.7 | 80.6 | 23 / 35 | 5637 |
| 5 | 1 | 68.2 | 78.1 | 18 / 35 | 5928 |
| 6 | 1 | 72.2 | 89.8 | 28 / 35 | 6492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 74% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 7 | 57% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 22% | 38 |
| myl.micro.Troodon 1.10 | 14 | 18% | 68 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 21 |
| fm.mammillarias 1.3 | 10 | 13% | 13 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 30 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 16 |
| sample.Fire 1.0 | 3 | 4% | 7 |
| sample.Tracker 1.0 | 3 | 4% | 2 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.0 | 152 / 210 | 2.08 | 21.2% | 41890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.2% | 152 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 17 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 2 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.2 | 7.6% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 83.8 | 23 / 35 | 7307 |
| 2 | 1 | 71.8 | 90.5 | 26 / 35 | 7096 |
| 3 | 1 | 71.1 | 87.9 | 26 / 35 | 6866 |
| 4 | 1 | 71.1 | 86.3 | 26 / 35 | 7043 |
| 5 | 1 | 70.3 | 86.7 | 22 / 35 | 6622 |
| 6 | 1 | 72.5 | 93.0 | 29 / 35 | 6956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 86% |
| stelo.SoJNanoMelee 1.1 | 46 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| yk.JahMicro 1.0 | 12 | 100% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 43% | 82 |
| stelo.SoJNanoMelee 1.1 | 14 | 23% | 36 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 23 |
| tj.zombie1n 1.0.1 | 4 | 7% | 6 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 26 |
| yk.JahMicro 1.0 | 2 | 3% | 14 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.7 | 81 / 210 | 3.91 | 15.5% | 28695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.5% | 81 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 35 |
| ahf.NanoAndrew .4 | 3.7 | 10.9% | 21 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.5% | 28 |
| sam.Samspin 1.0 | 5.3 | 10.1% | 13 |
| EBBU.Sim2 1.02 | 5.3 | 10.1% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.4% | 15 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 2 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.6 | 15 / 35 | 5251 |
| 2 | 1 | 58.8 | 57.5 | 10 / 35 | 4354 |
| 3 | 1 | 59.9 | 58.7 | 11 / 35 | 4501 |
| 4 | 1 | 62.6 | 65.1 | 13 / 35 | 4774 |
| 5 | 1 | 66.5 | 82.2 | 16 / 35 | 5016 |
| 6 | 1 | 63.4 | 67.9 | 16 / 35 | 4799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 65% |
| ahf.NanoAndrew .4 | 22 | 77% |
| simonton.nano.MeleeSeed 1.8 | 21 | 90% |
| sam.Samspin 1.0 | 12 | 75% |
| EBBU.Sim2 1.02 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 18% | 41 |
| ahf.NanoAndrew .4 | 18 | 14% | 38 |
| robar.nano.Assertive_Melee 0.2 | 18 | 14% | 21 |
| oog.melee.Corsair 1.0 | 16 | 12% | 31 |
| EBBU.Sim2 1.02 | 15 | 12% | 26 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 9% | 12 |
| sam.Samspin 1.0 | 11 | 8% | 19 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 138 / 210 | 2.07 | 19.8% | 34613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.8% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 11 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 12 |
| sample.SpinBot 1.0 | 6.5 | 8.1% | 5 |
| fm.claire 1.7 | 6.7 | 7.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.8% | 3 |
| pa.Improved 1.0 | 9.3 | 5.5% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 83.8 | 21 / 35 | 4890 |
| 2 | 1 | 69.0 | 84.8 | 20 / 35 | 5977 |
| 3 | 1 | 71.4 | 93.3 | 27 / 35 | 6160 |
| 4 | 1 | 70.1 | 89.2 | 22 / 35 | 6223 |
| 5 | 1 | 68.9 | 87.0 | 21 / 35 | 5412 |
| 6 | 1 | 70.7 | 90.8 | 27 / 35 | 5951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 77% |
| oog.melee.CapuletDroid 1.1 | 40 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 83% |
| arthord.NanoSatanMelee Beta | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 12 | 67% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 73 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 82 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 14 |
| gh.nano.Grofvuil 0.2 | 9 | 12% | 28 |
| winamp32.micro.MicroMacro 1.0 | 9 | 12% | 17 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 43 |
| kurios.DOSexe .9b | 4 | 5% | 11 |
| sample.SpinBot 1.0 | 4 | 5% | 6 |
| fm.claire 1.7 | 4 | 5% | 6 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.4 | 89 / 210 | 2.94 | 17.5% | 33433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.5% | 89 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 34 |
| mz.MicroGodMelee 1 | 3.5 | 13.4% | 39 |
| DBall.Anarchy 0.1 | 5.0 | 9.1% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.3% | 1 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.7% | 1 |
| el.JumpShoot 0.2 | 8.5 | 6.2% | 3 |
| acogdev.alpha 0.2 | 8.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 15 / 35 | 5797 |
| 2 | 1 | 64.7 | 71.4 | 13 / 35 | 5016 |
| 3 | 1 | 64.9 | 72.1 | 11 / 35 | 5641 |
| 4 | 1 | 69.2 | 87.0 | 18 / 35 | 6035 |
| 5 | 1 | 66.3 | 75.6 | 14 / 35 | 5498 |
| 6 | 1 | 67.4 | 80.0 | 18 / 35 | 5446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 76% |
| mz.MicroGodMelee 1 | 37 | 46% |
| gh.micro.Gruweltje 0.7 | 24 | 63% |
| DBall.Anarchy 0.1 | 11 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 39 | 32% | 57 |
| gh.micro.Gruweltje 0.7 | 31 | 26% | 52 |
| spinnercat.micro.Tyger 0.1 | 26 | 21% | 57 |
| acogdev.alpha 0.2 | 9 | 7% | 13 |
| fire219.CatBot 1.0 | 7 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 13 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 71.6 | 108 / 210 | 3.56 | 16.8% | 31726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.8% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.2% | 27 |
| simonton.micro.Sprout 1.1.3 | 2.7 | 13.7% | 35 |
| awesomeness.Elite 1.0 | 5.0 | 9.7% | 14 |
| germ.TheMind .2 | 5.2 | 9.3% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.4% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 8.0 | 8.0% | 9 |
| sample.Crazy 1.0 | 8.3 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.8 | 16 / 35 | 5233 |
| 2 | 1 | 67.3 | 80.0 | 21 / 35 | 5259 |
| 3 | 1 | 65.2 | 70.2 | 15 / 35 | 5593 |
| 4 | 1 | 67.5 | 78.7 | 21 / 35 | 5545 |
| 5 | 1 | 62.1 | 59.7 | 16 / 35 | 5051 |
| 6 | 1 | 64.7 | 70.2 | 19 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 88% |
| awesomeness.Elite 1.0 | 9 | 67% |
| germ.TheMind .2 | 8 | 88% |
| sample.Crazy 1.0 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 51% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 13% | 30 |
| awesomeness.Elite 1.0 | 8 | 8% | 17 |
| germ.TheMind .2 | 8 | 8% | 16 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.4 | 161 / 210 | 1.86 | 20.5% | 31203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.5% | 161 |
| rz.HawkOnFire 0.1 | 2.2 | 13.1% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.1% | 12 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 8 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.0% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.6% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 1 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 23 / 35 | 5026 |
| 2 | 1 | 70.3 | 89.5 | 27 / 35 | 5023 |
| 3 | 1 | 71.4 | 92.4 | 29 / 35 | 5111 |
| 4 | 1 | 70.8 | 89.5 | 26 / 35 | 5288 |
| 5 | 1 | 72.0 | 92.7 | 28 / 35 | 5577 |
| 6 | 1 | 71.3 | 90.8 | 28 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 97% |
| nz.jdc.nano.GridFu 1.0 | 38 | 97% |
| stelo.PatternRobot 1.0 | 15 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 71% |
| maribo.IotaCT 1.1 | 13 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 12 | 24% | 28 |
| rz.HawkOnFire 0.1 | 11 | 22% | 67 |
| nz.jdc.nano.GridFu 1.0 | 9 | 18% | 53 |
| ratosh.Wesco 1.4 | 5 | 10% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 14 |
| maribo.IotaCT 1.1 | 4 | 8% | 13 |
| stelo.PatternRobot 1.0 | 3 | 6% | 9 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.0 | 179 / 210 | 1.81 | 21.5% | 38843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.5% | 179 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 16 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 3 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.9% | 5 |
| zyx.micro.Ant 1.1 | 5.5 | 8.9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.7% | 0 |
| sanja.First 0.1 | 6.7 | 8.4% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.9% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 30 / 35 | 6139 |
| 2 | 1 | 70.9 | 87.3 | 29 / 35 | 6468 |
| 3 | 1 | 72.2 | 91.4 | 30 / 35 | 6890 |
| 4 | 1 | 71.1 | 91.7 | 28 / 35 | 6173 |
| 5 | 1 | 70.4 | 87.0 | 29 / 35 | 6359 |
| 6 | 1 | 72.9 | 96.5 | 33 / 35 | 6814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 95% |
| tvv.nano.Polaris 1.2 | 35 | 97% |
| cvt.Firsty 1.0 | 30 | 100% |
| sanja.First 0.1 | 23 | 100% |
| zyx.micro.Ant 1.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 27% | 45 |
| sample.RamFire 1.0 | 6 | 18% | 5 |
| tvv.nano.Polaris 1.2 | 5 | 15% | 45 |
| squidM.TentalceMeleeNano 1.1 | 3 | 9% | 14 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 14 |
| cvt.Firsty 1.0 | 2 | 6% | 23 |
| sanja.First 0.1 | 2 | 6% | 22 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 10 |
| zyx.micro.Ant 1.1 | 1 | 3% | 30 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.3 | 85 / 210 | 3.77 | 15.9% | 32452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 62 |
| hadur117.micro.SaorWDG 0.1 | 1.5 | 15.9% | 85 |
| cs.Wren 1.0 | 3.0 | 12.7% | 21 |
| mz.Cork 0.1 | 4.3 | 11.3% | 15 |
| js.PinBall 1.6 | 5.0 | 10.6% | 14 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 4 |
| evd.X1 0.01 | 6.7 | 7.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.4% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 64.8 | 16 / 35 | 5117 |
| 2 | 1 | 64.8 | 71.1 | 14 / 35 | 5638 |
| 3 | 1 | 65.3 | 72.4 | 15 / 35 | 5527 |
| 4 | 2 | 61.4 | 61.0 | 11 / 35 | 5235 |
| 5 | 2 | 62.4 | 65.1 | 12 / 35 | 5324 |
| 6 | 1 | 67.2 | 81.3 | 17 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 64 | 69% |
| cs.Wren 1.0 | 24 | 88% |
| js.PinBall 1.6 | 12 | 75% |
| mz.Cork 0.1 | 6 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 125 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 38% | 96 |
| cs.Wren 1.0 | 21 | 17% | 35 |
| js.PinBall 1.6 | 13 | 10% | 21 |
| joe.ADinosaur 1.0 | 12 | 10% | 13 |
| mz.Cork 0.1 | 11 | 9% | 17 |
| evd.X1 0.01 | 9 | 7% | 10 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.0 | 143 / 210 | 2.44 | 19.3% | 30354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.3% | 143 |
| myl.nano.Graviton 1.10 | 2.2 | 11.9% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.6% | 7 |
| ntc.Opposite 1.5 | 4.3 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 15 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 5 |
| disan.Chair 2.2.0 | 6.5 | 8.8% | 9 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 5.7% | 2 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.3 | 26 / 35 | 5124 |
| 2 | 1 | 70.0 | 87.0 | 26 / 35 | 5292 |
| 3 | 1 | 70.5 | 90.2 | 28 / 35 | 5172 |
| 4 | 1 | 66.8 | 77.1 | 19 / 35 | 5085 |
| 5 | 1 | 67.5 | 79.4 | 21 / 35 | 5170 |
| 6 | 1 | 67.9 | 84.1 | 23 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 98% |
| stelo.AreaTargetingBot 1.1 | 36 | 97% |
| disan.Chair 2.2.0 | 17 | 82% |
| donjezza.Muncho 1.0 | 13 | 100% |
| ntc.Opposite 1.5 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| DBall.NUKE 0.1 | 7 | 100% |
| pbg.R2D2 1.0 | 6 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 22% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 21% | 32 |
| myl.nano.Graviton 1.10 | 12 | 18% | 53 |
| pfvicm.Sobieski 7.2.3b | 10 | 15% | 24 |
| ntc.Opposite 1.5 | 7 | 10% | 20 |
| disan.Chair 2.2.0 | 4 | 6% | 14 |
| DBall.NUKE 0.1 | 3 | 4% | 9 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 71.2 | 73 / 210 | 3.59 | 15.5% | 26225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 15.5% | 73 |
| oog.melee.Capulet 1.2 | 2.3 | 14.1% | 52 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 24 |
| ejb.Polaris 1.0.1 | 5.2 | 10.5% | 14 |
| yagami.Tidus 0.11 | 5.2 | 11.7% | 10 |
| step.nanoPri 1.0 | 7.3 | 7.4% | 1 |
| stelo.MirrorNano 1.3 | 7.7 | 7.4% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 67.6 | 13 / 35 | 4306 |
| 2 | 1 | 64.5 | 72.1 | 11 / 35 | 4694 |
| 3 | 1 | 65.3 | 76.8 | 14 / 35 | 4309 |
| 4 | 1 | 62.9 | 67.6 | 10 / 35 | 4343 |
| 5 | 1 | 66.9 | 79.4 | 16 / 35 | 4587 |
| 6 | 2 | 61.4 | 63.8 | 9 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 51% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 75% |
| kawigi.micro.Shiz 1.1 | 20 | 85% |
| yagami.Tidus 0.11 | 17 | 88% |
| ejb.Polaris 1.0.1 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 35% | 67 |
| ejb.Polaris 1.0.1 | 20 | 15% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 39 |
| yagami.Tidus 0.11 | 16 | 12% | 29 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 30 |
| stelo.MirrorNano 1.3 | 9 | 7% | 10 |
| step.nanoPri 1.0 | 8 | 6% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.4 | 139 / 210 | 2.58 | 18.4% | 29329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.4% | 139 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 16 |
| wee.Gem 1.8.4 | 3.2 | 11.7% | 25 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 12 |
| ratosh.Nobo 0.21 | 4.7 | 10.5% | 10 |
| m3thos.Eva00 1.1 | 6.3 | 9.1% | 1 |
| bayen.UbaMicro 1.4 | 6.3 | 8.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 25 / 35 | 4787 |
| 2 | 1 | 68.7 | 83.2 | 24 / 35 | 5360 |
| 3 | 1 | 67.8 | 82.5 | 23 / 35 | 4963 |
| 4 | 1 | 68.3 | 84.8 | 24 / 35 | 4756 |
| 5 | 1 | 67.2 | 82.2 | 21 / 35 | 4987 |
| 6 | 1 | 66.2 | 78.4 | 22 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 96% |
| wee.Gem 1.8.4 | 39 | 92% |
| wompi.Quokka 1.6 | 26 | 92% |
| ratosh.Nobo 0.21 | 14 | 64% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| m3thos.Eva00 1.1 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 10 | 14% | 24 |
| bayen.UbaMicro 1.4 | 10 | 14% | 21 |
| maribo.FollowFire 1 | 10 | 14% | 10 |
| wee.Gem 1.8.4 | 8 | 11% | 52 |
| wompi.Quokka 1.6 | 8 | 11% | 32 |
| stelo.MyAgileRobot 0.2 | 8 | 11% | 12 |
| bzdp.Pansy 2.1 | 7 | 10% | 42 |
| m3thos.Eva00 1.1 | 6 | 8% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 5 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.0 | 125 / 210 | 2.17 | 21.0% | 46245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.0% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 22 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 0 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.3 | 8.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.6 | 19 / 35 | 7714 |
| 2 | 1 | 73.1 | 89.5 | 24 / 35 | 8113 |
| 3 | 1 | 72.2 | 89.8 | 22 / 35 | 7504 |
| 4 | 1 | 72.9 | 88.9 | 22 / 35 | 7855 |
| 5 | 1 | 70.6 | 79.7 | 18 / 35 | 7414 |
| 6 | 1 | 72.1 | 85.7 | 20 / 35 | 7645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 76% |
| exauge.GateKeeper 1.1.121g | 17 | 100% |
| mz.NanoGod 2.02 | 15 | 60% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 52% | 132 |
| mz.NanoGod 2.02 | 22 | 26% | 35 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 14 |
| ayk.WallHugger 1.0 | 5 | 6% | 10 |
| stelo.PianistNano 1.2 | 5 | 6% | 6 |
| stuff.Vlad 0.1 | 3 | 4% | 8 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 73.9 | 110 / 210 | 3.35 | 16.9% | 29410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.9% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.8% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 22 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.9% | 21 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 6 |
| conscience.Electron 1.3g | 7.2 | 8.2% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 7 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 65.1 | 12 / 35 | 4676 |
| 2 | 1 | 66.5 | 78.4 | 22 / 35 | 4807 |
| 3 | 1 | 66.3 | 74.0 | 19 / 35 | 5198 |
| 4 | 1 | 66.5 | 78.7 | 21 / 35 | 4986 |
| 5 | 1 | 65.3 | 74.3 | 18 / 35 | 4847 |
| 6 | 1 | 65.3 | 73.0 | 18 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 74% |
| dummy.micro.Sparrow 2.5 | 24 | 83% |
| bvh.micro.Freya 0.3 | 16 | 81% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 20% | 18 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 37 |
| conscience.Electron 1.3g | 15 | 15% | 20 |
| voidious.micro.BlitzBat 1.05 | 12 | 12% | 52 |
| bvh.micro.Freya 0.3 | 11 | 11% | 21 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |
| dl.BetterWalls 1.0 | 4 | 4% | 6 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.9 | 149 / 210 | 2.36 | 21.0% | 42254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.0% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.7% | 15 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 13 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.4% | 14 |
| dsw.StaticD 1.0 | 5.2 | 9.3% | 9 |
| mme.NikeEnhanced 2.0 | 5.8 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.9% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 2 |
| sample.Corners 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.6 | 26 / 35 | 7520 |
| 2 | 1 | 71.9 | 90.2 | 27 / 35 | 6749 |
| 3 | 1 | 70.2 | 80.6 | 25 / 35 | 6874 |
| 4 | 1 | 70.4 | 81.3 | 22 / 35 | 7012 |
| 5 | 1 | 71.8 | 85.1 | 27 / 35 | 7379 |
| 6 | 1 | 70.0 | 83.5 | 22 / 35 | 6720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 95% |
| supersample.SuperBoxBot 1.0 | 23 | 83% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 32% | 37 |
| dsw.StaticD 1.0 | 15 | 24% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 19% | 54 |
| sul.Lunar 1.1 | 8 | 13% | 53 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 10 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.Corners 1.0 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 80.4 | 128 / 210 | 2.76 | 19.0% | 38819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.0% | 128 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 28 |
| mld.Wisdom 1.0 | 2.8 | 12.1% | 21 |
| amz.NanoClone 1.41 | 4.5 | 10.5% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.6% | 11 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.6% | 6 |
| sample.Walls 1.0 | 7.0 | 8.0% | 8 |
| GarmBox.Oranges 1.0 | 8.2 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 79.0 | 21 / 35 | 6492 |
| 2 | 1 | 66.2 | 74.0 | 19 / 35 | 6050 |
| 3 | 1 | 71.8 | 89.8 | 25 / 35 | 7267 |
| 4 | 1 | 67.6 | 79.7 | 20 / 35 | 5701 |
| 5 | 1 | 68.5 | 79.0 | 23 / 35 | 6453 |
| 6 | 1 | 69.1 | 81.0 | 20 / 35 | 6856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 93% |
| radnor.DoctorBob 1.42 | 38 | 84% |
| mld.Wisdom 1.0 | 18 | 83% |
| amz.NanoClone 1.41 | 13 | 85% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 21 | 26% | 38 |
| radnor.DoctorBob 1.42 | 17 | 21% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 18% | 59 |
| KiraNL.Chupacabra 0.4 | 13 | 16% | 22 |
| amz.NanoClone 1.41 | 7 | 9% | 15 |
| GarmBox.Oranges 1.0 | 4 | 5% | 8 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| jangs.ns51 1.0 | 2 | 2% | 7 |

