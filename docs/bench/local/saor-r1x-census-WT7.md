# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.4 | 143 / 210 | 2.13 | 21.1% | 42617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.1% | 143 |
| mz.AntiGrav 1.0 | 2.3 | 15.0% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 14.3% | 26 |
| mld.Infinity 2.2 | 3.8 | 13.1% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| sample.Walls 1.0 | 6.5 | 6.4% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 1 |
| sample.Target 1.0 | 9.3 | 3.9% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 80.0 | 20 / 35 | 6900 |
| 2 | 1 | 73.8 | 93.7 | 29 / 35 | 7334 |
| 3 | 1 | 71.0 | 83.5 | 24 / 35 | 6863 |
| 4 | 1 | 72.8 | 92.4 | 25 / 35 | 7147 |
| 5 | 1 | 74.1 | 93.7 | 27 / 35 | 7616 |
| 6 | 1 | 70.3 | 81.3 | 18 / 35 | 6757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 95% |
| mld.Infinity 2.2 | 33 | 97% |
| radnor.DoctorBob 1.42 | 28 | 86% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 45% | 76 |
| mz.AntiGrav 1.0 | 24 | 36% | 82 |
| amz.NanoClone 1.41 | 5 | 7% | 11 |
| mld.Infinity 2.2 | 2 | 3% | 24 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 3 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.4 | 104 / 210 | 2.77 | 18.0% | 33158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 18.0% | 104 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 55 |
| mld.DustBunny 3.8 | 2.7 | 14.4% | 26 |
| maribo.melee.BMV 0.1 | 4.5 | 9.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.9% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 8.4% | 14 |
| zyx.nano.Ant 1.1 | 6.5 | 8.5% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 5.8% | 1 |
| bzdp.BoxCar 2.0 | 8.8 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.3 | 20 / 35 | 6278 |
| 2 | 1 | 68.0 | 84.1 | 18 / 35 | 5308 |
| 3 | 1 | 68.7 | 83.8 | 21 / 35 | 5352 |
| 4 | 1 | 68.8 | 85.4 | 20 / 35 | 5907 |
| 5 | 2 | 62.6 | 59.4 | 7 / 35 | 5785 |
| 6 | 1 | 66.5 | 82.2 | 18 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 58 | 79% |
| oog.melee.Mercutio 1.0 | 54 | 72% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 33% | 78 |
| mld.DustBunny 3.8 | 32 | 30% | 70 |
| maribo.melee.BMV 0.1 | 10 | 9% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 12 |
| zyx.nano.Ant 1.1 | 7 | 7% | 9 |
| fullsail.SweetTea 1.1 | 7 | 7% | 8 |
| cs.Grudge 1.0 | 5 | 5% | 4 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 83.9 | 136 / 210 | 2.45 | 20.5% | 40077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.5% | 136 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 31 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.8% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.9% | 16 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.2% | 7 |
| fm.mammillarias 1.3 | 5.3 | 9.3% | 6 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 3 |
| sample.Tracker 1.0 | 9.2 | 5.2% | 1 |
| sample.Fire 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 83.5 | 23 / 35 | 6988 |
| 2 | 1 | 71.3 | 87.3 | 24 / 35 | 6585 |
| 3 | 1 | 71.9 | 86.3 | 24 / 35 | 7021 |
| 4 | 1 | 70.4 | 83.5 | 21 / 35 | 6469 |
| 5 | 1 | 68.6 | 77.8 | 21 / 35 | 6191 |
| 6 | 1 | 71.0 | 85.1 | 23 / 35 | 6823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 91% |
| cb.nano.Insomnia 1.0 | 19 | 84% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| myl.nano.KomoriNinja 1.1 | 12 | 100% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 24% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 23% | 49 |
| cb.nano.Insomnia 1.0 | 13 | 18% | 15 |
| myl.nano.KomoriNinja 1.1 | 8 | 11% | 32 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 19 |
| fm.mammillarias 1.3 | 6 | 8% | 10 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 8 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.6 | 146 / 210 | 2.11 | 21.1% | 41910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.1% | 146 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 20 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.1% | 14 |
| tj.zombie1n 1.0.1 | 4.7 | 9.2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.5% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.1% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 7.9% | 2 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.3 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 87.6 | 24 / 35 | 7078 |
| 2 | 1 | 71.8 | 90.5 | 25 / 35 | 7093 |
| 3 | 1 | 71.9 | 92.1 | 24 / 35 | 7253 |
| 4 | 1 | 69.8 | 81.9 | 23 / 35 | 6922 |
| 5 | 1 | 70.6 | 84.8 | 24 / 35 | 6955 |
| 6 | 1 | 71.4 | 88.9 | 26 / 35 | 6609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 77 | 84% |
| stelo.SoJNanoMelee 1.1 | 28 | 89% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 93% |
| yk.JahMicro 1.0 | 8 | 88% |
| repositorio.NanoStep 1.0 | 6 | 83% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 45% | 94 |
| stelo.SoJNanoMelee 1.1 | 8 | 13% | 17 |
| tj.zombie1n 1.0.1 | 7 | 11% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 22 |
| yk.JahMicro 1.0 | 2 | 3% | 11 |
| repositorio.NanoStep 1.0 | 1 | 2% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 65.8 | 89 / 210 | 4.08 | 15.8% | 30326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 15.8% | 89 |
| oog.melee.Corsair 1.0 | 2.0 | 13.4% | 44 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.3% | 19 |
| sam.Samspin 1.0 | 6.2 | 9.2% | 12 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 66.7 | 15 / 35 | 5154 |
| 2 | 1 | 62.9 | 65.4 | 13 / 35 | 5007 |
| 3 | 1 | 65.5 | 70.2 | 14 / 35 | 5543 |
| 4 | 1 | 64.5 | 71.1 | 16 / 35 | 4838 |
| 5 | 1 | 61.7 | 60.0 | 14 / 35 | 4888 |
| 6 | 1 | 61.9 | 61.3 | 17 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 95% |
| oog.melee.Corsair 1.0 | 27 | 67% |
| ahf.NanoAndrew .4 | 15 | 73% |
| EBBU.Sim2 1.02 | 10 | 90% |
| sam.Samspin 1.0 | 8 | 88% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |

Hadur died in 121 of 210 rounds, at a mean tick of 348. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 56 |
| ahf.NanoAndrew .4 | 21 | 17% | 37 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 22 |
| oog.melee.Corsair 1.0 | 16 | 13% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| sam.Samspin 1.0 | 11 | 9% | 18 |
| EBBU.Sim2 1.02 | 10 | 8% | 15 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 10 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.3 | 144 / 210 | 2.05 | 20.0% | 35096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.0% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 27 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.4% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.6% | 18 |
| fm.claire 1.7 | 5.7 | 8.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.5% | 3 |
| pa.Improved 1.0 | 8.7 | 5.8% | 1 |
| sample.SpinBot 1.0 | 8.7 | 6.1% | 3 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.1 | 26 / 35 | 5835 |
| 2 | 1 | 69.5 | 83.5 | 22 / 35 | 5824 |
| 3 | 1 | 69.3 | 86.3 | 23 / 35 | 5805 |
| 4 | 1 | 71.9 | 93.7 | 28 / 35 | 6393 |
| 5 | 1 | 71.2 | 94.3 | 26 / 35 | 5950 |
| 6 | 1 | 66.9 | 80.0 | 19 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 84 | 87% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 39% | 96 |
| oog.melee.CapuletDroid 1.1 | 13 | 19% | 46 |
| gh.nano.Grofvuil 0.2 | 13 | 19% | 28 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 15 |
| fm.claire 1.7 | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 10 |
| kurios.DOSexe .9b | 1 | 1% | 3 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.4 | 98 / 210 | 2.85 | 18.0% | 35028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.0% | 98 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.7% | 54 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.2% | 22 |
| mz.MicroGodMelee 1 | 4.0 | 12.5% | 28 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.5% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.3 | 15 / 35 | 5660 |
| 2 | 1 | 68.3 | 81.9 | 15 / 35 | 5983 |
| 3 | 1 | 66.8 | 73.3 | 15 / 35 | 6031 |
| 4 | 1 | 68.1 | 81.3 | 17 / 35 | 6068 |
| 5 | 1 | 67.9 | 79.0 | 18 / 35 | 5906 |
| 6 | 1 | 67.6 | 80.6 | 18 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 91% |
| mz.MicroGodMelee 1 | 34 | 62% |
| gh.micro.Gruweltje 0.7 | 31 | 61% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 36 | 32% | 58 |
| mz.MicroGodMelee 1 | 31 | 28% | 53 |
| spinnercat.micro.Tyger 0.1 | 25 | 22% | 68 |
| acogdev.alpha 0.2 | 10 | 9% | 10 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 75.9 | 122 / 210 | 3.17 | 17.8% | 33283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.8% | 122 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.7% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 20 |
| germ.TheMind .2 | 5.2 | 9.0% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 10 |
| qualidafial.MajorDick 1.0.1 | 6.2 | 8.7% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.8% | 6 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.1% | 8 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 74.9 | 21 / 35 | 5798 |
| 2 | 1 | 63.1 | 64.8 | 16 / 35 | 5089 |
| 3 | 1 | 68.1 | 80.0 | 24 / 35 | 5710 |
| 4 | 1 | 68.9 | 82.9 | 22 / 35 | 5798 |
| 5 | 1 | 66.2 | 74.6 | 20 / 35 | 5130 |
| 6 | 1 | 67.6 | 78.1 | 19 / 35 | 5758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 97% |
| germ.TheMind .2 | 11 | 73% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 50% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 14% | 33 |
| lrem.micro.MoggFanatic 0.2 | 9 | 10% | 11 |
| germ.TheMind .2 | 6 | 7% | 18 |
| stelo.UntouchableNano 1.3 | 6 | 7% | 13 |
| awesomeness.Elite 1.0 | 4 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.5 | 152 / 210 | 2.03 | 20.6% | 33780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.6% | 152 |
| rz.HawkOnFire 0.1 | 2.2 | 14.1% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 12 |
| maribo.IotaCT 1.1 | 4.0 | 10.3% | 6 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.4% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 8.3 | 7.4% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 81.9 | 22 / 35 | 5581 |
| 2 | 1 | 71.7 | 90.2 | 29 / 35 | 5808 |
| 3 | 1 | 70.6 | 87.0 | 23 / 35 | 5648 |
| 4 | 1 | 71.5 | 92.1 | 27 / 35 | 5628 |
| 5 | 1 | 71.1 | 88.9 | 26 / 35 | 5323 |
| 6 | 1 | 71.5 | 91.1 | 25 / 35 | 5792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 93% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 14 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 56% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| maribo.IotaCT 1.1 | 6 | 83% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 26% | 71 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 20 |
| nz.jdc.nano.GridFu 1.0 | 9 | 16% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 14% | 13 |
| ratosh.Wesco 1.4 | 5 | 9% | 16 |
| stelo.PatternRobot 1.0 | 4 | 7% | 18 |
| maribo.IotaCT 1.1 | 4 | 7% | 11 |
| spinnercat.Omen 1.0 | 2 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 94.1 | 176 / 210 | 1.53 | 22.6% | 43871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.6% | 176 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 11 |
| baal.nano.N 1.42 | 2.7 | 11.6% | 7 |
| zyx.micro.Ant 1.1 | 4.8 | 9.3% | 12 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 1 |
| sanja.First 0.1 | 6.0 | 8.6% | 2 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.7 | 27 / 35 | 7266 |
| 2 | 1 | 74.3 | 99.4 | 34 / 35 | 7613 |
| 3 | 1 | 72.6 | 93.7 | 27 / 35 | 7194 |
| 4 | 1 | 73.0 | 94.9 | 30 / 35 | 7203 |
| 5 | 1 | 71.7 | 89.2 | 30 / 35 | 6984 |
| 6 | 1 | 73.4 | 94.6 | 28 / 35 | 7611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 88% |
| baal.nano.N 1.42 | 39 | 95% |
| cvt.Firsty 1.0 | 30 | 100% |
| sanja.First 0.1 | 28 | 100% |
| zyx.micro.Ant 1.1 | 20 | 80% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 32% | 32 |
| tvv.nano.Polaris 1.2 | 8 | 24% | 55 |
| baal.nano.N 1.42 | 7 | 21% | 47 |
| cvt.Firsty 1.0 | 3 | 9% | 25 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 10 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 7 |
| sanja.First 0.1 | 1 | 3% | 25 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 65.7 | 75 / 210 | 4.09 | 15.2% | 31318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.2% | 64 |
| hadur117.micro.SaorWT7 0.1 | 1.8 | 15.2% | 75 |
| cs.Wren 1.0 | 3.5 | 12.2% | 21 |
| js.PinBall 1.6 | 4.2 | 11.2% | 12 |
| mz.Cork 0.1 | 4.3 | 11.1% | 18 |
| joe.ADinosaur 1.0 | 5.8 | 9.7% | 5 |
| evd.X1 0.01 | 7.2 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 8 |
| PSW.Relentless 0.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 53.7 | 9 / 35 | 4694 |
| 2 | 2 | 63.5 | 65.1 | 11 / 35 | 5567 |
| 3 | 1 | 64.7 | 69.5 | 14 / 35 | 5696 |
| 4 | 2 | 63.1 | 70.2 | 12 / 35 | 4701 |
| 5 | 1 | 64.7 | 69.2 | 15 / 35 | 5715 |
| 6 | 2 | 62.7 | 66.7 | 14 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 67% |
| cs.Wren 1.0 | 25 | 84% |
| js.PinBall 1.6 | 9 | 67% |
| mz.Cork 0.1 | 6 | 67% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 60 | 44% | 101 |
| cs.Wren 1.0 | 19 | 14% | 30 |
| evd.X1 0.01 | 13 | 10% | 15 |
| joe.ADinosaur 1.0 | 13 | 10% | 14 |
| mz.Cork 0.1 | 10 | 7% | 18 |
| js.PinBall 1.6 | 9 | 7% | 20 |
| PSW.Relentless 0.1 | 8 | 6% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.2 | 136 / 210 | 2.24 | 19.7% | 31920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.7% | 136 |
| ntc.Opposite 1.5 | 2.5 | 11.7% | 6 |
| myl.nano.Graviton 1.10 | 3.7 | 11.1% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 19 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.5% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.1% | 6 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 7 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.2 | 25 / 35 | 5418 |
| 2 | 1 | 68.0 | 81.3 | 21 / 35 | 5254 |
| 3 | 1 | 67.8 | 83.8 | 19 / 35 | 5183 |
| 4 | 1 | 69.4 | 87.0 | 24 / 35 | 5172 |
| 5 | 1 | 69.5 | 83.8 | 22 / 35 | 5625 |
| 6 | 1 | 70.2 | 91.1 | 25 / 35 | 5268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 86% |
| stelo.AreaTargetingBot 1.1 | 31 | 81% |
| ntc.Opposite 1.5 | 21 | 86% |
| donjezza.Muncho 1.0 | 18 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 100% |
| disan.Chair 2.2.0 | 16 | 81% |
| DBall.NUKE 0.1 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 24% | 43 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 20 |
| myl.nano.Graviton 1.10 | 11 | 15% | 48 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 23 |
| ntc.Opposite 1.5 | 8 | 11% | 20 |
| disan.Chair 2.2.0 | 7 | 9% | 23 |
| donjezza.Muncho 1.0 | 4 | 5% | 13 |
| DBall.NUKE 0.1 | 2 | 3% | 13 |
| pbg.R2D2 1.0 | 2 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.7 | 81 / 210 | 3.64 | 15.7% | 27788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 15.7% | 81 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 41 |
| oog.melee.Capulet 1.2 | 2.7 | 13.9% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 21 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 62.2 | 14 / 35 | 4928 |
| 2 | 2 | 64.5 | 70.5 | 13 / 35 | 4400 |
| 3 | 1 | 65.2 | 72.4 | 14 / 35 | 4730 |
| 4 | 1 | 64.9 | 75.6 | 12 / 35 | 4438 |
| 5 | 1 | 65.0 | 71.4 | 14 / 35 | 4778 |
| 6 | 1 | 64.7 | 72.1 | 14 / 35 | 4514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 79% |
| oog.melee.Capulet 1.2 | 21 | 62% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| yagami.Tidus 0.11 | 14 | 86% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 129 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 35% | 60 |
| yagami.Tidus 0.11 | 19 | 15% | 31 |
| ejb.Polaris 1.0.1 | 16 | 12% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 12% | 44 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 30 |
| stelo.MirrorNano 1.3 | 9 | 7% | 9 |
| step.nanoPri 1.0 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.9 | 137 / 210 | 2.90 | 17.6% | 27747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.6% | 137 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 9 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 23 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 17 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 9 |
| m3thos.Eva00 1.1 | 5.5 | 10.0% | 11 |
| bayen.UbaMicro 1.4 | 7.0 | 8.8% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 71.1 | 20 / 35 | 4015 |
| 2 | 1 | 66.1 | 79.0 | 21 / 35 | 4420 |
| 3 | 1 | 65.5 | 74.6 | 19 / 35 | 4685 |
| 4 | 1 | 67.7 | 81.6 | 26 / 35 | 4933 |
| 5 | 1 | 66.0 | 76.8 | 21 / 35 | 4868 |
| 6 | 1 | 69.5 | 90.5 | 30 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 100% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 19 | 95% |
| m3thos.Eva00 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 18% | 23 |
| wompi.Quokka 1.6 | 10 | 14% | 25 |
| wee.Gem 1.8.4 | 9 | 12% | 51 |
| maribo.FollowFire 1 | 9 | 12% | 10 |
| m3thos.Eva00 1.1 | 8 | 11% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 12 |
| bayen.UbaMicro 1.4 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 6 |
| bzdp.Pansy 2.1 | 5 | 7% | 57 |

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.2 | 90.9 | 145 / 210 | 1.82 | 22.8% | 51527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.8% | 145 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 49 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 13 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 3 |
| stuff.Vlad 0.1 | 5.5 | 9.1% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.1 | 92.4 | 27 / 35 | 8660 |
| 2 | 1 | 72.9 | 87.0 | 23 / 35 | 8104 |
| 3 | 1 | 74.1 | 91.1 | 22 / 35 | 9046 |
| 4 | 1 | 73.4 | 87.9 | 23 / 35 | 8074 |
| 5 | 1 | 74.7 | 92.4 | 24 / 35 | 8789 |
| 6 | 1 | 75.2 | 94.6 | 26 / 35 | 8854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 135 | 80% |
| exauge.GateKeeper 1.1.121g | 15 | 87% |
| mz.NanoGod 2.02 | 15 | 73% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 52% | 144 |
| mz.NanoGod 2.02 | 20 | 30% | 36 |
| exauge.GateKeeper 1.1.121g | 7 | 11% | 12 |
| ayk.WallHugger 1.0 | 2 | 3% | 8 |
| stelo.PianistNano 1.2 | 2 | 3% | 5 |
| stuff.Vlad 0.1 | 1 | 2% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.9 | 108 / 210 | 3.53 | 16.5% | 28757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.5% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 22 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.5% | 21 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 16 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.2 | 8.0% | 3 |
| ap.Frederick 1.1 | 8.0 | 7.3% | 10 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 62.2 | 15 / 35 | 4585 |
| 2 | 1 | 65.4 | 75.6 | 16 / 35 | 5259 |
| 3 | 1 | 66.1 | 75.9 | 21 / 35 | 4899 |
| 4 | 1 | 62.6 | 67.6 | 15 / 35 | 4417 |
| 5 | 1 | 68.8 | 85.7 | 23 / 35 | 5312 |
| 6 | 1 | 62.5 | 64.4 | 18 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 88% |
| dummy.micro.Sparrow 2.5 | 28 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 92% |
| bvh.micro.Freya 0.3 | 12 | 92% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 56 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 14 |
| bvh.micro.Freya 0.3 | 11 | 11% | 21 |
| conscience.Electron 1.3g | 11 | 11% | 13 |
| dl.BetterWalls 1.0 | 8 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 84.6 | 136 / 210 | 2.39 | 21.2% | 44222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.2% | 136 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 24 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 9 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.0% | 18 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.9% | 1 |
| dsw.StaticD 1.0 | 5.5 | 8.6% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.6% | 7 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.3% | 5 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 79.7 | 21 / 35 | 7259 |
| 2 | 1 | 70.6 | 84.1 | 21 / 35 | 6992 |
| 3 | 1 | 71.9 | 87.6 | 24 / 35 | 7374 |
| 4 | 1 | 73.2 | 87.6 | 22 / 35 | 8325 |
| 5 | 1 | 68.8 | 77.1 | 21 / 35 | 6167 |
| 6 | 1 | 73.7 | 91.1 | 27 / 35 | 8105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 89% |
| supersample.SuperBoxBot 1.0 | 22 | 86% |
| dsw.StaticD 1.0 | 10 | 60% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 27% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 25% | 58 |
| sul.Lunar 1.1 | 10 | 13% | 63 |
| dsw.StaticD 1.0 | 10 | 13% | 17 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 6% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 7 |
| sample.Corners 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.3 | 117 / 210 | 2.68 | 18.8% | 38973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.8% | 117 |
| mld.Wisdom 1.0 | 2.7 | 12.7% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.0% | 20 |
| amz.NanoClone 1.41 | 4.5 | 11.0% | 16 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.4% | 4 |
| sample.Walls 1.0 | 7.3 | 7.3% | 3 |
| GarmBox.Oranges 1.0 | 8.2 | 6.6% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.5 | 20 / 35 | 6242 |
| 2 | 1 | 66.4 | 74.9 | 17 / 35 | 6290 |
| 3 | 1 | 67.6 | 79.0 | 19 / 35 | 6146 |
| 4 | 1 | 68.3 | 80.3 | 21 / 35 | 6534 |
| 5 | 1 | 70.2 | 86.0 | 21 / 35 | 7012 |
| 6 | 1 | 69.6 | 85.1 | 19 / 35 | 6749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 94% |
| mld.Wisdom 1.0 | 19 | 84% |
| amz.NanoClone 1.41 | 13 | 92% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 29% | 47 |
| radnor.DoctorBob 1.42 | 22 | 23% | 57 |
| amz.NanoClone 1.41 | 13 | 14% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 12% | 41 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 18 |
| sample.Walls 1.0 | 5 | 5% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

