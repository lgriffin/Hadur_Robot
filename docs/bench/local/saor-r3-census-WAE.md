# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.5 | 151 / 210 | 2.04 | 21.8% | 44903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.8% | 151 |
| radnor.DoctorBob 1.42 | 2.2 | 14.1% | 21 |
| mz.AntiGrav 1.0 | 3.3 | 13.6% | 18 |
| mld.Infinity 2.2 | 3.5 | 13.0% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 3 |
| sample.Walls 1.0 | 6.3 | 6.6% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 2 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 0 |
| sample.Target 1.0 | 9.5 | 4.1% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 81.6 | 20 / 35 | 7102 |
| 2 | 1 | 71.0 | 83.5 | 22 / 35 | 6970 |
| 3 | 1 | 72.0 | 86.3 | 24 / 35 | 7343 |
| 4 | 1 | 73.1 | 89.2 | 26 / 35 | 7850 |
| 5 | 1 | 74.6 | 95.9 | 30 / 35 | 7980 |
| 6 | 1 | 74.2 | 94.3 | 29 / 35 | 7658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 97% |
| radnor.DoctorBob 1.42 | 40 | 83% |
| mld.Infinity 2.2 | 34 | 100% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 44% | 67 |
| mz.AntiGrav 1.0 | 16 | 27% | 72 |
| amz.NanoClone 1.41 | 7 | 12% | 9 |
| mld.Infinity 2.2 | 3 | 5% | 43 |
| jangs.ns51 1.0 | 3 | 5% | 9 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| sample.Walls 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.2 | 123 / 210 | 2.51 | 18.7% | 33359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.3 | 18.7% | 123 |
| mld.DustBunny 3.8 | 2.2 | 15.1% | 19 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.8% | 58 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 1 |
| zyx.nano.Ant 1.1 | 5.0 | 8.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.5% | 4 |
| fullsail.SweetTea 1.1 | 7.7 | 6.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.0% | 2 |
| bzdp.BoxCar 2.0 | 8.3 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 20 / 35 | 5306 |
| 2 | 1 | 69.7 | 89.8 | 23 / 35 | 5413 |
| 3 | 1 | 70.3 | 88.9 | 23 / 35 | 6167 |
| 4 | 1 | 69.3 | 85.7 | 23 / 35 | 5439 |
| 5 | 1 | 68.9 | 86.0 | 22 / 35 | 5453 |
| 6 | 3 | 63.4 | 61.9 | 12 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 76 | 87% |
| oog.melee.Mercutio 1.0 | 49 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 29 | 33% | 88 |
| oog.melee.Mercutio 1.0 | 27 | 31% | 66 |
| cs.Grudge 1.0 | 8 | 9% | 9 |
| maribo.melee.BMV 0.1 | 7 | 8% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 12 |
| fullsail.SweetTea 1.1 | 4 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 6 |
| zyx.nano.Ant 1.1 | 4 | 5% | 5 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.1 | 145 / 210 | 2.16 | 21.1% | 40171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.1% | 145 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.6% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.4% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 5 |
| fm.mammillarias 1.3 | 5.2 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 5 |
| sample.Fire 1.0 | 9.3 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.6 | 23 / 35 | 6292 |
| 2 | 1 | 70.6 | 85.4 | 23 / 35 | 6555 |
| 3 | 1 | 70.0 | 82.9 | 21 / 35 | 6457 |
| 4 | 1 | 72.7 | 92.1 | 27 / 35 | 6868 |
| 5 | 1 | 70.9 | 81.6 | 25 / 35 | 6520 |
| 6 | 1 | 73.1 | 92.1 | 26 / 35 | 7479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 67 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 92% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| sp.Nanos.Ember 1.1 | 16 | 88% |
| myl.nano.KomoriNinja 1.1 | 13 | 85% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 28% | 82 |
| myl.nano.KomoriNinja 1.1 | 10 | 15% | 28 |
| cb.nano.Insomnia 1.0 | 9 | 14% | 20 |
| fm.mammillarias 1.3 | 9 | 14% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 11% | 27 |
| sp.Nanos.Ember 1.1 | 5 | 8% | 19 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 8 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.3 | 150 / 210 | 2.14 | 21.0% | 41272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.0% | 150 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 12 |
| tj.zombie1n 1.0.1 | 5.2 | 8.8% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.4% | 1 |
| yk.JahMicro 1.0 | 6.5 | 7.7% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.4% | 6 |
| repositorio.NanoStep 1.0 | 8.5 | 7.0% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.2 | 31 / 35 | 6818 |
| 2 | 1 | 72.6 | 92.1 | 31 / 35 | 7182 |
| 3 | 1 | 70.6 | 86.3 | 24 / 35 | 6744 |
| 4 | 1 | 70.9 | 88.9 | 26 / 35 | 6681 |
| 5 | 1 | 70.3 | 84.8 | 21 / 35 | 6842 |
| 6 | 1 | 68.5 | 76.5 | 17 / 35 | 7005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 92% |
| stelo.SoJNanoMelee 1.1 | 36 | 92% |
| tvv.micro.Antares 1.1.1 | 23 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tj.zombie1n 1.0.1 | 11 | 82% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 42% | 82 |
| stelo.SoJNanoMelee 1.1 | 9 | 15% | 31 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 31 |
| yk.JahMicro 1.0 | 7 | 11% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 24 |
| tj.zombie1n 1.0.1 | 4 | 6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 64.8 | 83 / 210 | 4.17 | 15.4% | 29437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 15.4% | 83 |
| oog.melee.Corsair 1.0 | 2.2 | 13.4% | 40 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.0% | 18 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.9% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 65.4 | 17 / 35 | 4976 |
| 2 | 1 | 60.5 | 59.4 | 13 / 35 | 4486 |
| 3 | 1 | 64.4 | 71.4 | 13 / 35 | 5061 |
| 4 | 1 | 64.5 | 69.5 | 15 / 35 | 5210 |
| 5 | 1 | 60.5 | 61.6 | 10 / 35 | 4511 |
| 6 | 1 | 62.9 | 61.6 | 15 / 35 | 5193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 61% |
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| ahf.NanoAndrew .4 | 16 | 81% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sam.Samspin 1.0 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| EBBU.Sim2 1.02 | 4 | 75% |

Hadur died in 127 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 26% | 49 |
| oog.melee.Corsair 1.0 | 23 | 18% | 51 |
| robar.nano.Assertive_Melee 0.2 | 21 | 17% | 27 |
| ahf.NanoAndrew .4 | 13 | 10% | 28 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 12 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 14 |
| EBBU.Sim2 1.02 | 7 | 6% | 13 |
| sam.Samspin 1.0 | 7 | 6% | 11 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 132 / 210 | 2.34 | 19.1% | 32992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.1% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 20 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.6% | 11 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.4% | 7 |
| fm.claire 1.7 | 6.7 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.8 | 5.9% | 2 |
| kurios.DOSexe .9b | 9.0 | 5.6% | 1 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 23 / 35 | 5631 |
| 2 | 1 | 69.9 | 88.9 | 24 / 35 | 5542 |
| 3 | 1 | 68.5 | 82.2 | 21 / 35 | 5670 |
| 4 | 1 | 68.2 | 85.4 | 19 / 35 | 5362 |
| 5 | 1 | 69.9 | 87.0 | 26 / 35 | 5965 |
| 6 | 1 | 66.5 | 79.7 | 19 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 90% |
| oog.melee.CapuletDroid 1.1 | 31 | 94% |
| gh.nano.Grofvuil 0.2 | 22 | 82% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 35% | 85 |
| gh.nano.Grofvuil 0.2 | 15 | 19% | 37 |
| oog.melee.CapuletDroid 1.1 | 12 | 15% | 41 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 17 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 11 |
| fm.claire 1.7 | 4 | 5% | 5 |
| pa.Improved 1.0 | 3 | 4% | 5 |
| sample.SpinBot 1.0 | 3 | 4% | 3 |
| kurios.DOSexe .9b | 2 | 3% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.0 | 112 / 210 | 2.44 | 19.2% | 37142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.2% | 112 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.1% | 26 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 25 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.8% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.7% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.5 | 16 / 35 | 5380 |
| 2 | 1 | 70.2 | 87.9 | 17 / 35 | 6681 |
| 3 | 1 | 70.1 | 86.7 | 21 / 35 | 6620 |
| 4 | 1 | 69.3 | 82.9 | 20 / 35 | 6127 |
| 5 | 1 | 69.3 | 82.2 | 21 / 35 | 6443 |
| 6 | 1 | 69.3 | 87.0 | 17 / 35 | 5891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 92% |
| mz.MicroGodMelee 1 | 37 | 65% |
| gh.micro.Gruweltje 0.7 | 25 | 68% |
| DBall.Anarchy 0.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 6 | 83% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 28 | 29% | 58 |
| spinnercat.micro.Tyger 0.1 | 26 | 27% | 71 |
| mz.MicroGodMelee 1 | 25 | 26% | 49 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 13 |
| acogdev.alpha 0.2 | 6 | 6% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 74.4 | 113 / 210 | 3.30 | 17.6% | 33254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.6% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.5% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 37 |
| germ.TheMind .2 | 4.5 | 9.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.1% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.6% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.3% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.1 | 19 / 35 | 5315 |
| 2 | 1 | 64.5 | 69.2 | 14 / 35 | 5235 |
| 3 | 1 | 69.2 | 83.5 | 25 / 35 | 5568 |
| 4 | 1 | 67.1 | 74.0 | 21 / 35 | 5677 |
| 5 | 1 | 67.2 | 72.4 | 19 / 35 | 5991 |
| 6 | 1 | 64.7 | 69.2 | 15 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 76% |
| lrem.micro.MoggFanatic 0.2 | 8 | 88% |
| germ.TheMind .2 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 41% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 36 |
| awesomeness.Elite 1.0 | 10 | 10% | 14 |
| germ.TheMind .2 | 9 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 3 | 3% | 11 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 90.3 | 151 / 210 | 1.88 | 21.0% | 35300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.0% | 151 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 19 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 13 |
| maribo.IotaCT 1.1 | 4.8 | 10.0% | 7 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.5% | 0 |
| stelo.PatternRobot 1.0 | 7.2 | 8.2% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 88.6 | 24 / 35 | 6277 |
| 2 | 1 | 71.6 | 90.5 | 23 / 35 | 5981 |
| 3 | 1 | 70.4 | 87.0 | 23 / 35 | 5471 |
| 4 | 1 | 72.8 | 94.9 | 28 / 35 | 5939 |
| 5 | 1 | 73.1 | 94.9 | 28 / 35 | 6219 |
| 6 | 1 | 70.6 | 85.7 | 25 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 87 | 90% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 53% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| maribo.IotaCT 1.1 | 10 | 80% |
| spinnercat.Omen 1.0 | 6 | 83% |
| ratosh.Wesco 1.4 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 25% | 71 |
| timmit.nano.TimDog 0.33 | 12 | 20% | 28 |
| nz.jdc.nano.GridFu 1.0 | 9 | 15% | 54 |
| stelo.PatternRobot 1.0 | 9 | 15% | 17 |
| maribo.IotaCT 1.1 | 7 | 12% | 14 |
| ratosh.Wesco 1.4 | 5 | 8% | 11 |
| spinnercat.Omen 1.0 | 2 | 3% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.0 | 159 / 210 | 1.99 | 21.3% | 41254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.3% | 159 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.2% | 17 |
| baal.nano.N 1.42 | 2.7 | 11.8% | 10 |
| Grystrion.TrackerWO 1.0 | 4.7 | 10.0% | 4 |
| zyx.micro.Ant 1.1 | 5.5 | 9.1% | 9 |
| sanja.First 0.1 | 5.8 | 8.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.6% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.7% | 6 |
| amk.Punbot.Punbot 0.01 | 8.2 | 6.9% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 26 / 35 | 6324 |
| 2 | 1 | 70.4 | 87.9 | 26 / 35 | 6761 |
| 3 | 1 | 72.0 | 92.1 | 27 / 35 | 7136 |
| 4 | 1 | 71.6 | 90.5 | 26 / 35 | 6606 |
| 5 | 1 | 71.3 | 85.7 | 26 / 35 | 7384 |
| 6 | 1 | 72.2 | 91.7 | 28 / 35 | 7043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 88% |
| tvv.nano.Polaris 1.2 | 39 | 90% |
| cvt.Firsty 1.0 | 25 | 92% |
| zyx.micro.Ant 1.1 | 22 | 86% |
| sanja.First 0.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 22% | 58 |
| zyx.micro.Ant 1.1 | 11 | 22% | 38 |
| baal.nano.N 1.42 | 10 | 20% | 38 |
| Grystrion.TrackerWO 1.0 | 7 | 14% | 18 |
| sanja.First 0.1 | 4 | 8% | 19 |
| sample.RamFire 1.0 | 4 | 8% | 5 |
| cvt.Firsty 1.0 | 3 | 6% | 25 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.8 | 88 / 210 | 3.72 | 16.0% | 32574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.3 | 16.0% | 88 |
| kc.micro.Figment 1.0 | 1.8 | 15.0% | 61 |
| cs.Wren 1.0 | 3.0 | 13.0% | 21 |
| js.PinBall 1.6 | 4.3 | 11.0% | 20 |
| mz.Cork 0.1 | 4.5 | 11.0% | 10 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 1 |
| evd.X1 0.01 | 6.7 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.4% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.1 | 56.8 | 10 / 35 | 4879 |
| 2 | 1 | 66.7 | 76.2 | 14 / 35 | 6003 |
| 3 | 2 | 63.5 | 67.3 | 15 / 35 | 5301 |
| 4 | 1 | 65.7 | 75.2 | 17 / 35 | 5350 |
| 5 | 1 | 66.0 | 75.6 | 18 / 35 | 5429 |
| 6 | 1 | 63.7 | 67.6 | 14 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 70% |
| cs.Wren 1.0 | 24 | 88% |
| mz.Cork 0.1 | 11 | 91% |
| js.PinBall 1.6 | 8 | 63% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 96 |
| cs.Wren 1.0 | 20 | 16% | 34 |
| evd.X1 0.01 | 14 | 11% | 15 |
| mz.Cork 0.1 | 11 | 9% | 24 |
| js.PinBall 1.6 | 11 | 9% | 16 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.9 | 128 / 210 | 2.63 | 18.9% | 30866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.9% | 128 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 29 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.8% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.2% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.3% | 3 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 10 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 4 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 5.9% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.4 | 24 / 35 | 5360 |
| 2 | 1 | 66.7 | 78.4 | 19 / 35 | 4726 |
| 3 | 1 | 67.8 | 82.2 | 22 / 35 | 4675 |
| 4 | 1 | 70.0 | 87.3 | 22 / 35 | 5847 |
| 5 | 1 | 65.7 | 76.2 | 19 / 35 | 4777 |
| 6 | 1 | 69.3 | 82.5 | 22 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 70% |
| lrem.micro.SpikeSoldier 0.4 | 25 | 96% |
| stelo.AreaTargetingBot 1.1 | 24 | 96% |
| ntc.Opposite 1.5 | 21 | 86% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 11 | 82% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 82 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 18% | 41 |
| ntc.Opposite 1.5 | 15 | 18% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 18% | 32 |
| stelo.AreaTargetingBot 1.1 | 13 | 16% | 36 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 17 |
| disan.Chair 2.2.0 | 6 | 7% | 15 |
| donjezza.Muncho 1.0 | 3 | 4% | 15 |
| DBall.NUKE 0.1 | 2 | 2% | 11 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 75.9 | 94 / 210 | 3.17 | 16.8% | 28374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.8% | 94 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 30 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 24 |
| yagami.Tidus 0.11 | 4.5 | 11.8% | 10 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.3 | 12 / 35 | 5030 |
| 2 | 1 | 67.6 | 78.7 | 17 / 35 | 5115 |
| 3 | 1 | 67.4 | 80.3 | 17 / 35 | 4494 |
| 4 | 1 | 65.3 | 72.7 | 14 / 35 | 4951 |
| 5 | 1 | 63.8 | 68.6 | 16 / 35 | 4169 |
| 6 | 1 | 67.4 | 80.6 | 18 / 35 | 4615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 63% |
| kawigi.micro.Shiz 1.1 | 35 | 97% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 75% |
| yagami.Tidus 0.11 | 19 | 89% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| step.nanoPri 1.0 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 38% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 19% | 37 |
| kawigi.micro.Shiz 1.1 | 16 | 14% | 43 |
| yagami.Tidus 0.11 | 16 | 14% | 33 |
| ejb.Polaris 1.0.1 | 10 | 9% | 17 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.8 | 134 / 210 | 2.91 | 17.8% | 29203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.8% | 134 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 20 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 23 |
| wompi.Quokka 1.6 | 4.0 | 11.3% | 11 |
| ratosh.Nobo 0.21 | 4.3 | 11.2% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.5 | 20 / 35 | 4642 |
| 2 | 1 | 68.9 | 86.0 | 28 / 35 | 5187 |
| 3 | 1 | 62.5 | 65.1 | 15 / 35 | 4519 |
| 4 | 1 | 68.1 | 85.7 | 26 / 35 | 4537 |
| 5 | 1 | 65.9 | 75.6 | 19 / 35 | 5023 |
| 6 | 1 | 68.7 | 82.9 | 26 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 97% |
| wee.Gem 1.8.4 | 38 | 100% |
| wompi.Quokka 1.6 | 16 | 88% |
| ratosh.Nobo 0.21 | 14 | 86% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 346. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 20% | 27 |
| wompi.Quokka 1.6 | 12 | 16% | 24 |
| maribo.FollowFire 1 | 12 | 16% | 12 |
| bzdp.Pansy 2.1 | 10 | 13% | 56 |
| wee.Gem 1.8.4 | 7 | 9% | 49 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 11 |
| bayen.UbaMicro 1.4 | 6 | 8% | 13 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 5 |
| m3thos.Eva00 1.1 | 3 | 4% | 11 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 89.4 | 134 / 210 | 1.95 | 22.3% | 50294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.3% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 52 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 12 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.3% | 8 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 81.3 | 20 / 35 | 7793 |
| 2 | 1 | 74.4 | 92.7 | 22 / 35 | 8772 |
| 3 | 1 | 72.7 | 84.1 | 19 / 35 | 8276 |
| 4 | 1 | 74.0 | 92.1 | 23 / 35 | 8050 |
| 5 | 1 | 74.9 | 93.0 | 25 / 35 | 8812 |
| 6 | 1 | 74.7 | 93.3 | 25 / 35 | 8591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 80% |
| mz.NanoGod 2.02 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 14 | 86% |
| stelo.PianistNano 1.2 | 3 | 33% |
| ayk.WallHugger 1.0 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 53% | 144 |
| mz.NanoGod 2.02 | 17 | 22% | 28 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 14 |
| ayk.WallHugger 1.0 | 6 | 8% | 11 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.3 | 103 / 210 | 3.68 | 16.1% | 27856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.1% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.0% | 17 |
| bvh.micro.Freya 0.3 | 4.0 | 11.6% | 24 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 22 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.6% | 10 |
| conscience.Electron 1.3g | 6.3 | 8.6% | 4 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 4 |
| ap.Frederick 1.1 | 8.8 | 6.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.1 | 23 / 35 | 4571 |
| 2 | 1 | 61.5 | 64.1 | 12 / 35 | 4538 |
| 3 | 1 | 63.6 | 68.9 | 18 / 35 | 4557 |
| 4 | 1 | 66.5 | 74.6 | 21 / 35 | 5076 |
| 5 | 1 | 62.2 | 67.6 | 16 / 35 | 4332 |
| 6 | 1 | 63.4 | 69.2 | 13 / 35 | 4782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 92% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| dummy.micro.Sparrow 2.5 | 18 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 75% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 107 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 67 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 20 |
| bvh.micro.Freya 0.3 | 16 | 15% | 29 |
| conscience.Electron 1.3g | 14 | 13% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 27 |
| dummy.micro.Sparrow 2.5 | 10 | 9% | 26 |
| dl.BetterWalls 1.0 | 9 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 14 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 84.8 | 141 / 210 | 2.37 | 21.3% | 44183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.3% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 22 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 18 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 9 |
| dsw.StaticD 1.0 | 5.3 | 8.6% | 8 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 8.0 | 6.4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.0% | 1 |
| sample.Corners 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 79.7 | 24 / 35 | 7469 |
| 2 | 1 | 72.2 | 84.1 | 25 / 35 | 7786 |
| 3 | 1 | 72.3 | 88.3 | 25 / 35 | 7491 |
| 4 | 1 | 72.9 | 90.8 | 23 / 35 | 7570 |
| 5 | 1 | 70.5 | 82.2 | 22 / 35 | 7032 |
| 6 | 1 | 70.5 | 83.8 | 22 / 35 | 6835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 40 | 88% |
| sul.Lunar 1.1 | 38 | 97% |
| supersample.SuperBoxBot 1.0 | 36 | 81% |
| sample.MyFirstRobot 1.0 | 13 | 100% |
| dsw.StaticD 1.0 | 10 | 70% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 23 | 33% | 63 |
| supersample.SuperBoxBot 1.0 | 16 | 23% | 37 |
| dsw.StaticD 1.0 | 9 | 13% | 22 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 8 |
| sample.Corners 1.0 | 4 | 6% | 7 |
| sul.Lunar 1.1 | 3 | 4% | 41 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 80.5 | 106 / 210 | 2.75 | 18.9% | 40694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.9% | 106 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 35 |
| mld.Wisdom 1.0 | 2.5 | 12.8% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.1% | 21 |
| amz.NanoClone 1.41 | 5.2 | 9.9% | 8 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.7% | 7 |
| sample.Walls 1.0 | 7.5 | 7.1% | 3 |
| GarmBox.Oranges 1.0 | 8.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 74.6 | 17 / 35 | 6089 |
| 2 | 1 | 69.0 | 82.2 | 18 / 35 | 6844 |
| 3 | 1 | 68.6 | 82.9 | 16 / 35 | 6633 |
| 4 | 1 | 69.5 | 81.9 | 22 / 35 | 6980 |
| 5 | 1 | 68.2 | 78.1 | 14 / 35 | 6975 |
| 6 | 1 | 69.6 | 83.5 | 19 / 35 | 7173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 80% |
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 28 | 71% |
| amz.NanoClone 1.41 | 11 | 73% |
| KiraNL.Chupacabra 0.4 | 10 | 70% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 33% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 22% | 49 |
| radnor.DoctorBob 1.42 | 20 | 19% | 51 |
| amz.NanoClone 1.41 | 12 | 11% | 17 |
| KiraNL.Chupacabra 0.4 | 10 | 10% | 21 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

