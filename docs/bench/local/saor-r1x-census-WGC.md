# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.0 | 144 / 210 | 1.99 | 21.4% | 42892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.4% | 144 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 27 |
| mz.AntiGrav 1.0 | 3.0 | 14.1% | 10 |
| mld.Infinity 2.2 | 3.3 | 13.0% | 20 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 6 |
| sample.Walls 1.0 | 6.8 | 6.4% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 92.7 | 27 / 35 | 7595 |
| 2 | 1 | 70.8 | 83.2 | 21 / 35 | 7277 |
| 3 | 1 | 72.4 | 91.1 | 24 / 35 | 6773 |
| 4 | 1 | 72.6 | 89.5 | 27 / 35 | 7232 |
| 5 | 1 | 71.7 | 86.7 | 23 / 35 | 6999 |
| 6 | 1 | 72.4 | 90.8 | 22 / 35 | 7016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 96% |
| mld.Infinity 2.2 | 37 | 86% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| amz.NanoClone 1.41 | 6 | 67% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 44% | 74 |
| mz.AntiGrav 1.0 | 11 | 17% | 73 |
| mld.Infinity 2.2 | 11 | 17% | 32 |
| amz.NanoClone 1.41 | 8 | 12% | 13 |
| jangs.ns51 1.0 | 3 | 5% | 4 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.3 | 123 / 210 | 2.06 | 19.2% | 33222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.2% | 123 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.3% | 59 |
| mld.DustBunny 3.8 | 3.0 | 13.8% | 17 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 2 |
| zyx.nano.Ant 1.1 | 6.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.1% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.6% | 1 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.0 | 6.4% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 24 / 35 | 6522 |
| 2 | 1 | 70.5 | 94.0 | 23 / 35 | 5938 |
| 3 | 1 | 67.4 | 81.0 | 19 / 35 | 5041 |
| 4 | 1 | 68.4 | 88.6 | 20 / 35 | 4831 |
| 5 | 1 | 69.4 | 87.3 | 17 / 35 | 5654 |
| 6 | 1 | 68.6 | 87.3 | 20 / 35 | 5236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 68% |
| mld.DustBunny 3.8 | 52 | 88% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| zyx.nano.Ant 1.1 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 47% | 92 |
| mld.DustBunny 3.8 | 24 | 28% | 69 |
| maribo.melee.BMV 0.1 | 6 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 8 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 8 |
| zyx.nano.Ant 1.1 | 2 | 2% | 11 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.4 | 130 / 210 | 2.67 | 19.7% | 36963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.7% | 130 |
| myl.micro.Troodon 1.10 | 2.2 | 14.5% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.2% | 14 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.7% | 9 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 1 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.5% | 2 |
| sp.Nanos.Ember 1.1 | 7.3 | 7.0% | 5 |
| sample.Fire 1.0 | 9.3 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 84.4 | 24 / 35 | 6616 |
| 2 | 1 | 66.7 | 73.0 | 17 / 35 | 5367 |
| 3 | 1 | 70.2 | 86.7 | 20 / 35 | 6150 |
| 4 | 1 | 70.3 | 83.2 | 23 / 35 | 6179 |
| 5 | 1 | 69.7 | 79.0 | 23 / 35 | 6336 |
| 6 | 1 | 70.4 | 82.2 | 23 / 35 | 6315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 77% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| fm.mammillarias 1.3 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 23% | 36 |
| myl.micro.Troodon 1.10 | 17 | 21% | 67 |
| cb.nano.Insomnia 1.0 | 14 | 18% | 18 |
| sp.Nanos.Ember 1.1 | 9 | 11% | 25 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 34 |
| sample.Fire 1.0 | 7 | 9% | 9 |
| fm.mammillarias 1.3 | 4 | 5% | 11 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.4 | 148 / 210 | 2.40 | 20.6% | 40675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.6% | 148 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.1% | 17 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.6% | 13 |
| tj.zombie1n 1.0.1 | 5.5 | 8.8% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.9% | 6 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.1 | 24 / 35 | 7219 |
| 2 | 1 | 70.9 | 84.4 | 26 / 35 | 6950 |
| 3 | 1 | 70.9 | 86.3 | 25 / 35 | 6973 |
| 4 | 1 | 70.1 | 82.9 | 24 / 35 | 6670 |
| 5 | 1 | 68.8 | 78.4 | 23 / 35 | 6309 |
| 6 | 1 | 70.2 | 82.2 | 26 / 35 | 6554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 92% |
| stelo.SoJNanoMelee 1.1 | 35 | 91% |
| tvv.micro.Antares 1.1.1 | 22 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 44% | 91 |
| tvv.micro.Antares 1.1.1 | 11 | 18% | 35 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 11 |
| repositorio.NanoStep 1.0 | 3 | 5% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 18 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| tj.zombie1n 1.0.1 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.6 | 93 / 210 | 3.73 | 16.4% | 30971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.4% | 93 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 35 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 27 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.3% | 12 |
| EBBU.Sim2 1.02 | 5.3 | 10.1% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 8.9% | 12 |
| sam.Samspin 1.0 | 6.5 | 9.4% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 71.7 | 15 / 35 | 5153 |
| 2 | 1 | 65.6 | 72.1 | 16 / 35 | 5309 |
| 3 | 1 | 66.5 | 74.9 | 21 / 35 | 5481 |
| 4 | 1 | 62.0 | 64.1 | 11 / 35 | 4751 |
| 5 | 1 | 65.4 | 70.8 | 15 / 35 | 5735 |
| 6 | 1 | 62.1 | 64.1 | 15 / 35 | 4542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 71% |
| simonton.nano.MeleeSeed 1.8 | 26 | 96% |
| ahf.NanoAndrew .4 | 21 | 62% |
| EBBU.Sim2 1.02 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| sam.Samspin 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 44 |
| oog.melee.Corsair 1.0 | 19 | 16% | 44 |
| robar.nano.Assertive_Melee 0.2 | 17 | 15% | 22 |
| ahf.NanoAndrew .4 | 15 | 13% | 29 |
| EBBU.Sim2 1.02 | 13 | 11% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| sam.Samspin 1.0 | 9 | 8% | 17 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 13 |
| sample.TrackFire 1.0 | 3 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.7 | 135 / 210 | 2.38 | 18.8% | 30996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 8 |
| fm.claire 1.7 | 5.8 | 8.8% | 2 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.0% | 3 |
| sample.SpinBot 1.0 | 8.3 | 6.7% | 2 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.6 | 22 / 35 | 4502 |
| 2 | 1 | 69.5 | 88.3 | 23 / 35 | 5266 |
| 3 | 1 | 68.8 | 86.0 | 26 / 35 | 5104 |
| 4 | 1 | 70.4 | 90.8 | 26 / 35 | 5529 |
| 5 | 1 | 68.0 | 82.5 | 20 / 35 | 5554 |
| 6 | 1 | 66.5 | 78.7 | 18 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 90% |
| oog.melee.CapuletDroid 1.1 | 27 | 89% |
| gh.nano.Grofvuil 0.2 | 15 | 73% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 33% | 91 |
| oog.melee.CapuletDroid 1.1 | 11 | 15% | 38 |
| gh.nano.Grofvuil 0.2 | 10 | 13% | 23 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 14 |
| fm.claire 1.7 | 6 | 8% | 11 |
| sample.SpinBot 1.0 | 5 | 7% | 7 |
| kurios.DOSexe .9b | 4 | 5% | 9 |
| pa.Improved 1.0 | 4 | 5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 11 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.9 | 112 / 210 | 2.36 | 19.1% | 36036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.1% | 112 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.1% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 27 |
| mz.MicroGodMelee 1 | 3.8 | 13.3% | 26 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.0% | 3 |
| DBall.Anarchy 0.1 | 5.8 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.5% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.1 | 16 / 35 | 5807 |
| 2 | 1 | 69.9 | 85.7 | 20 / 35 | 6265 |
| 3 | 1 | 71.0 | 88.9 | 25 / 35 | 6365 |
| 4 | 1 | 66.8 | 79.0 | 15 / 35 | 5304 |
| 5 | 1 | 69.5 | 87.3 | 15 / 35 | 6323 |
| 6 | 1 | 69.0 | 83.5 | 21 / 35 | 5972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 86% |
| mz.MicroGodMelee 1 | 44 | 66% |
| gh.micro.Gruweltje 0.7 | 32 | 69% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 33% | 62 |
| gh.micro.Gruweltje 0.7 | 30 | 31% | 56 |
| spinnercat.micro.Tyger 0.1 | 24 | 24% | 68 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 9 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 68.6 | 107 / 210 | 3.82 | 16.5% | 32307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.5% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 13.8% | 35 |
| simonton.micro.Sprout 1.1.3 | 2.5 | 13.7% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.9% | 11 |
| germ.TheMind .2 | 5.5 | 9.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 9.1% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 10 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.4% | 5 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 70.2 | 19 / 35 | 6214 |
| 2 | 2 | 62.1 | 61.0 | 16 / 35 | 4911 |
| 3 | 1 | 66.9 | 76.8 | 21 / 35 | 5280 |
| 4 | 1 | 63.6 | 63.8 | 16 / 35 | 5228 |
| 5 | 1 | 64.9 | 68.6 | 16 / 35 | 5500 |
| 6 | 1 | 65.1 | 71.4 | 19 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 7 | 86% |
| sample.Crazy 1.0 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 50% |
| germ.TheMind .2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 41% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 39 |
| germ.TheMind .2 | 10 | 10% | 19 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 14 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 8 |
| sample.Crazy 1.0 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.3 | 151 / 210 | 1.87 | 20.7% | 33607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.7% | 151 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 19 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 9 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.0% | 8 |
| maribo.IotaCT 1.1 | 5.0 | 10.0% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.1% | 4 |
| ratosh.Wesco 1.4 | 7.2 | 8.1% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 8.3% | 7 |
| spinnercat.Omen 1.0 | 8.5 | 7.4% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.7 | 24 / 35 | 5403 |
| 2 | 1 | 71.5 | 90.2 | 26 / 35 | 5540 |
| 3 | 1 | 71.8 | 90.5 | 28 / 35 | 5701 |
| 4 | 1 | 71.1 | 89.8 | 25 / 35 | 5457 |
| 5 | 1 | 71.1 | 93.0 | 23 / 35 | 5697 |
| 6 | 1 | 72.2 | 92.7 | 25 / 35 | 5809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 93% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| stelo.PatternRobot 1.0 | 23 | 87% |
| timmit.nano.TimDog 0.33 | 16 | 75% |
| ratosh.Wesco 1.4 | 13 | 85% |
| maribo.IotaCT 1.1 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 39% | 81 |
| timmit.nano.TimDog 0.33 | 13 | 22% | 27 |
| ratosh.Wesco 1.4 | 6 | 10% | 21 |
| stelo.PatternRobot 1.0 | 6 | 10% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 47 |
| maribo.IotaCT 1.1 | 4 | 7% | 13 |
| spinnercat.Omen 1.0 | 2 | 3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.6 | 160 / 210 | 1.93 | 21.3% | 40785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.3% | 160 |
| baal.nano.N 1.42 | 2.5 | 12.3% | 10 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 18 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.2% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 11 |
| sanja.First 0.1 | 5.8 | 8.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.9% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 26 / 35 | 6446 |
| 2 | 1 | 72.3 | 93.0 | 30 / 35 | 7016 |
| 3 | 1 | 70.5 | 86.0 | 25 / 35 | 6555 |
| 4 | 1 | 70.7 | 88.9 | 25 / 35 | 6726 |
| 5 | 1 | 69.5 | 83.5 | 23 / 35 | 6470 |
| 6 | 1 | 73.7 | 96.2 | 31 / 35 | 7572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 90% |
| tvv.nano.Polaris 1.2 | 38 | 84% |
| cvt.Firsty 1.0 | 28 | 96% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| sanja.First 0.1 | 21 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 26% | 32 |
| baal.nano.N 1.42 | 11 | 22% | 48 |
| tvv.nano.Polaris 1.2 | 10 | 20% | 53 |
| sample.RamFire 1.0 | 6 | 12% | 7 |
| sanja.First 0.1 | 2 | 4% | 21 |
| cvt.Firsty 1.0 | 2 | 4% | 18 |
| Grystrion.TrackerWO 1.0 | 2 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 67.3 | 81 / 210 | 3.94 | 15.7% | 33053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.3 | 15.7% | 81 |
| kc.micro.Figment 1.0 | 1.7 | 14.6% | 55 |
| cs.Wren 1.0 | 3.5 | 12.8% | 26 |
| mz.Cork 0.1 | 4.3 | 11.3% | 16 |
| js.PinBall 1.6 | 4.3 | 11.1% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 4 |
| evd.X1 0.01 | 6.7 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 10 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 1 |
| PSW.Relentless 0.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 66.7 | 12 / 35 | 5637 |
| 2 | 1 | 64.7 | 71.4 | 13 / 35 | 5803 |
| 3 | 1 | 64.0 | 68.9 | 15 / 35 | 5545 |
| 4 | 1 | 64.3 | 69.2 | 13 / 35 | 5398 |
| 5 | 2 | 62.5 | 62.5 | 14 / 35 | 5350 |
| 6 | 2 | 63.1 | 65.1 | 14 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 81% |
| cs.Wren 1.0 | 23 | 65% |
| mz.Cork 0.1 | 13 | 77% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| js.PinBall 1.6 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 129 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 35% | 98 |
| cs.Wren 1.0 | 19 | 15% | 32 |
| js.PinBall 1.6 | 15 | 12% | 16 |
| evd.X1 0.01 | 15 | 12% | 15 |
| joe.ADinosaur 1.0 | 11 | 9% | 11 |
| mz.Cork 0.1 | 10 | 8% | 17 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.3 | 128 / 210 | 2.50 | 18.8% | 29887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 128 |
| ntc.Opposite 1.5 | 2.3 | 12.1% | 17 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 9 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 5 |
| donjezza.Muncho 1.0 | 8.7 | 6.3% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.1 | 16 / 35 | 4215 |
| 2 | 1 | 67.7 | 78.1 | 19 / 35 | 5326 |
| 3 | 1 | 69.1 | 87.0 | 24 / 35 | 4974 |
| 4 | 1 | 68.4 | 82.9 | 22 / 35 | 5338 |
| 5 | 1 | 69.4 | 91.1 | 24 / 35 | 4722 |
| 6 | 1 | 69.7 | 89.5 | 23 / 35 | 5312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 92% |
| ntc.Opposite 1.5 | 25 | 68% |
| stelo.AreaTargetingBot 1.1 | 24 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 100% |
| disan.Chair 2.2.0 | 16 | 63% |
| donjezza.Muncho 1.0 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| DBall.NUKE 0.1 | 6 | 83% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 17 | 20% | 35 |
| pfvicm.Sobieski 7.2.3b | 14 | 17% | 25 |
| stelo.AreaTargetingBot 1.1 | 12 | 14% | 39 |
| myl.nano.Graviton 1.10 | 12 | 14% | 36 |
| disan.Chair 2.2.0 | 9 | 11% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 24 |
| donjezza.Muncho 1.0 | 5 | 6% | 8 |
| DBall.NUKE 0.1 | 4 | 5% | 7 |
| pbg.R2D2 1.0 | 2 | 2% | 16 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.8 | 92 / 210 | 3.27 | 16.5% | 27502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.2 | 16.5% | 92 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 40 |
| oog.melee.Capulet 1.2 | 3.0 | 13.3% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 21 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 3 |
| stelo.MirrorNano 1.3 | 7.5 | 7.0% | 1 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 69.2 | 13 / 35 | 4033 |
| 2 | 1 | 65.1 | 72.4 | 14 / 35 | 4599 |
| 3 | 1 | 66.1 | 78.1 | 14 / 35 | 4671 |
| 4 | 1 | 65.7 | 74.9 | 16 / 35 | 4383 |
| 5 | 1 | 67.4 | 78.4 | 19 / 35 | 4919 |
| 6 | 1 | 66.4 | 75.9 | 16 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 76% |
| yagami.Tidus 0.11 | 27 | 81% |
| oog.melee.Capulet 1.2 | 23 | 65% |
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 32% | 55 |
| yagami.Tidus 0.11 | 26 | 22% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 48 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 30 |
| ejb.Polaris 1.0.1 | 10 | 8% | 20 |
| stelo.MirrorNano 1.3 | 5 | 4% | 8 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.3 | 136 / 210 | 2.68 | 18.1% | 28332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.1% | 136 |
| wee.Gem 1.8.4 | 2.7 | 11.9% | 17 |
| bzdp.Pansy 2.1 | 3.3 | 11.8% | 14 |
| ratosh.Nobo 0.21 | 3.7 | 11.4% | 11 |
| wompi.Quokka 1.6 | 4.7 | 10.7% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 12 |
| bayen.UbaMicro 1.4 | 6.5 | 9.0% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.7 | 23 / 35 | 4506 |
| 2 | 1 | 67.8 | 84.4 | 24 / 35 | 4580 |
| 3 | 1 | 69.0 | 87.9 | 26 / 35 | 4913 |
| 4 | 1 | 68.4 | 86.7 | 25 / 35 | 4786 |
| 5 | 1 | 64.0 | 71.7 | 17 / 35 | 4324 |
| 6 | 1 | 66.8 | 77.5 | 21 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 95% |
| wee.Gem 1.8.4 | 37 | 100% |
| ratosh.Nobo 0.21 | 20 | 80% |
| wompi.Quokka 1.6 | 12 | 100% |
| m3thos.Eva00 1.1 | 12 | 67% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 75 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 62 |
| ratosh.Nobo 0.21 | 11 | 15% | 28 |
| wee.Gem 1.8.4 | 9 | 12% | 53 |
| bayen.UbaMicro 1.4 | 9 | 12% | 16 |
| wompi.Quokka 1.6 | 8 | 11% | 15 |
| maribo.FollowFire 1 | 7 | 9% | 7 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 11 |
| m3thos.Eva00 1.1 | 6 | 8% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 86.6 | 129 / 210 | 2.21 | 21.6% | 48595 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.6% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 54 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 20 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 8.0% | 3 |
| drd.Dreadknoght 0.9 | 8.0 | 4.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 93.7 | 22 / 35 | 8506 |
| 2 | 1 | 72.4 | 80.3 | 19 / 35 | 8378 |
| 3 | 1 | 73.6 | 89.5 | 25 / 35 | 7852 |
| 4 | 1 | 71.9 | 82.9 | 19 / 35 | 7967 |
| 5 | 1 | 71.7 | 83.2 | 20 / 35 | 7566 |
| 6 | 1 | 73.8 | 89.8 | 24 / 35 | 8326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 123 | 78% |
| mz.NanoGod 2.02 | 19 | 58% |
| exauge.GateKeeper 1.1.121g | 8 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stuff.Vlad 0.1 | 5 | 80% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 0% |

Hadur died in 81 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 46% | 139 |
| mz.NanoGod 2.02 | 24 | 30% | 34 |
| ayk.WallHugger 1.0 | 8 | 10% | 14 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 10 |
| stuff.Vlad 0.1 | 4 | 5% | 8 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.5 | 104 / 210 | 3.65 | 16.2% | 28664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.2% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 36 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.8% | 15 |
| bvh.micro.Freya 0.3 | 3.8 | 11.6% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.7% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.5% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 65.7 | 15 / 35 | 4495 |
| 2 | 1 | 63.5 | 68.9 | 19 / 35 | 4607 |
| 3 | 1 | 64.0 | 72.1 | 16 / 35 | 4546 |
| 4 | 1 | 64.3 | 70.8 | 18 / 35 | 4811 |
| 5 | 1 | 64.3 | 71.1 | 16 / 35 | 4794 |
| 6 | 1 | 66.3 | 74.6 | 20 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 90% |
| dummy.micro.Sparrow 2.5 | 26 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 75% |
| bvh.micro.Freya 0.3 | 20 | 85% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 62 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 18% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 32 |
| conscience.Electron 1.3g | 13 | 12% | 15 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 37 |
| dl.BetterWalls 1.0 | 10 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 9 | 8% | 15 |
| bvh.micro.Freya 0.3 | 8 | 8% | 20 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.1 | 140 / 210 | 2.34 | 21.3% | 43873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.3% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.2% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 16 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.1% | 12 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 3 |
| dsw.StaticD 1.0 | 6.0 | 8.8% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.7% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.7% | 0 |
| sample.Corners 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 83.5 | 23 / 35 | 7318 |
| 2 | 1 | 71.0 | 81.9 | 22 / 35 | 7113 |
| 3 | 1 | 73.8 | 91.7 | 28 / 35 | 7702 |
| 4 | 1 | 70.9 | 81.3 | 21 / 35 | 7554 |
| 5 | 1 | 70.2 | 83.2 | 22 / 35 | 6827 |
| 6 | 1 | 72.3 | 88.9 | 24 / 35 | 7359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 79% |
| supersample.SuperBoxBot 1.0 | 26 | 88% |
| dsw.StaticD 1.0 | 14 | 71% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 31% | 54 |
| dsw.StaticD 1.0 | 14 | 20% | 26 |
| supersample.SuperBoxBot 1.0 | 13 | 18% | 34 |
| sul.Lunar 1.1 | 10 | 14% | 59 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| sample.Corners 1.0 | 2 | 3% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.3 | 105 / 210 | 2.78 | 18.7% | 39449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.7% | 105 |
| radnor.DoctorBob 1.42 | 2.3 | 12.9% | 33 |
| mld.Wisdom 1.0 | 2.8 | 12.9% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.9% | 23 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.3% | 8 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 9 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 1 |
| sample.Walls 1.0 | 7.7 | 7.0% | 4 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 4 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 74.6 | 18 / 35 | 6946 |
| 2 | 1 | 68.9 | 84.8 | 18 / 35 | 6730 |
| 3 | 1 | 69.3 | 82.5 | 19 / 35 | 6696 |
| 4 | 1 | 68.2 | 80.6 | 18 / 35 | 6347 |
| 5 | 1 | 67.8 | 78.7 | 15 / 35 | 6627 |
| 6 | 1 | 67.8 | 80.3 | 17 / 35 | 6103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 27 | 78% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 89% |
| jangs.ns51 1.0 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 10 | 60% |
| amz.NanoClone 1.41 | 9 | 56% |
| sample.Target 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 106 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 33% | 55 |
| radnor.DoctorBob 1.42 | 20 | 19% | 50 |
| KiraNL.Chupacabra 0.4 | 17 | 16% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 15% | 44 |
| amz.NanoClone 1.41 | 6 | 6% | 10 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 3 | 3% | 7 |

