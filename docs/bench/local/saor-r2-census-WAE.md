# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 89.3 | 148 / 210 | 1.97 | 21.9% | 45836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.9% | 148 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 23 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.7 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 88.9 | 25 / 35 | 7570 |
| 2 | 1 | 72.2 | 85.7 | 24 / 35 | 7474 |
| 3 | 1 | 72.8 | 88.3 | 26 / 35 | 7699 |
| 4 | 1 | 73.6 | 92.4 | 26 / 35 | 7483 |
| 5 | 1 | 73.2 | 91.1 | 23 / 35 | 7982 |
| 6 | 1 | 72.8 | 89.2 | 24 / 35 | 7628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 95% |
| mld.Infinity 2.2 | 35 | 94% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| amz.NanoClone 1.41 | 11 | 55% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 33% | 62 |
| mz.AntiGrav 1.0 | 14 | 22% | 76 |
| mld.Infinity 2.2 | 11 | 17% | 42 |
| amz.NanoClone 1.41 | 8 | 13% | 15 |
| GarmBox.Oranges 1.0 | 4 | 6% | 4 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 122 / 210 | 2.44 | 18.8% | 34404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 18.8% | 122 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 52 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 17 |
| maribo.melee.BMV 0.1 | 4.5 | 10.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.7 | 8.5% | 9 |
| zyx.nano.Ant 1.1 | 6.2 | 8.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.9% | 3 |
| fullsail.SweetTea 1.1 | 7.8 | 6.8% | 1 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 19 / 35 | 5416 |
| 2 | 1 | 68.7 | 83.8 | 19 / 35 | 5940 |
| 3 | 1 | 70.8 | 94.0 | 25 / 35 | 5802 |
| 4 | 1 | 70.8 | 92.7 | 26 / 35 | 6220 |
| 5 | 1 | 68.7 | 86.3 | 23 / 35 | 5469 |
| 6 | 2 | 62.7 | 61.6 | 10 / 35 | 5557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 77% |
| mld.DustBunny 3.8 | 57 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 35% | 88 |
| mld.DustBunny 3.8 | 29 | 32% | 73 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| maribo.melee.BMV 0.1 | 6 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 10 |
| zyx.nano.Ant 1.1 | 5 | 5% | 6 |
| fullsail.SweetTea 1.1 | 4 | 4% | 9 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.9 | 135 / 210 | 2.36 | 20.4% | 38941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.4% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.4% | 17 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.4% | 7 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 6 |
| sample.Fire 1.0 | 9.3 | 4.6% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 24 / 35 | 7052 |
| 2 | 1 | 71.0 | 87.9 | 22 / 35 | 6446 |
| 3 | 1 | 71.8 | 86.0 | 23 / 35 | 7211 |
| 4 | 1 | 70.8 | 87.6 | 23 / 35 | 6156 |
| 5 | 1 | 69.8 | 81.6 | 20 / 35 | 6481 |
| 6 | 1 | 68.3 | 78.7 | 23 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 78% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| fm.mammillarias 1.3 | 7 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 57% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 28% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 25% | 45 |
| cb.nano.Insomnia 1.0 | 11 | 15% | 20 |
| myl.nano.KomoriNinja 1.1 | 9 | 12% | 34 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 10 |
| sample.Fire 1.0 | 4 | 5% | 7 |
| fm.mammillarias 1.3 | 3 | 4% | 12 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 81.1 | 140 / 210 | 2.70 | 19.6% | 38567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.6% | 140 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 10 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.0% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.7% | 23 |
| tj.zombie1n 1.0.1 | 5.7 | 9.0% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.4% | 6 |
| yk.JahMicro 1.0 | 7.2 | 8.3% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.3 | 26 / 35 | 6381 |
| 2 | 1 | 67.6 | 75.6 | 24 / 35 | 5935 |
| 3 | 1 | 69.5 | 82.5 | 23 / 35 | 6535 |
| 4 | 1 | 69.5 | 80.6 | 26 / 35 | 6559 |
| 5 | 1 | 68.5 | 79.0 | 22 / 35 | 6192 |
| 6 | 1 | 69.5 | 81.6 | 19 / 35 | 6965 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 96% |
| stelo.SoJNanoMelee 1.1 | 32 | 91% |
| tvv.micro.Antares 1.1.1 | 20 | 75% |
| tj.zombie1n 1.0.1 | 19 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 89% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 33% | 75 |
| stelo.SoJNanoMelee 1.1 | 13 | 19% | 33 |
| tvv.micro.Antares 1.1.1 | 11 | 16% | 32 |
| tj.zombie1n 1.0.1 | 7 | 10% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 29 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.9 | 103 / 210 | 3.44 | 17.0% | 31980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.0% | 103 |
| oog.melee.Corsair 1.0 | 2.2 | 13.3% | 36 |
| ahf.NanoAndrew .4 | 3.2 | 11.5% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.8% | 20 |
| EBBU.Sim2 1.02 | 5.0 | 10.0% | 6 |
| sam.Samspin 1.0 | 6.7 | 9.2% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.7% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.4% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 21 / 35 | 5221 |
| 2 | 1 | 64.1 | 68.9 | 14 / 35 | 5409 |
| 3 | 1 | 65.2 | 71.1 | 18 / 35 | 5215 |
| 4 | 1 | 68.2 | 80.0 | 17 / 35 | 5846 |
| 5 | 1 | 62.4 | 66.0 | 15 / 35 | 4529 |
| 6 | 1 | 66.3 | 73.0 | 18 / 35 | 5760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 46 | 74% |
| simonton.nano.MeleeSeed 1.8 | 30 | 93% |
| ahf.NanoAndrew .4 | 21 | 86% |
| sam.Samspin 1.0 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| EBBU.Sim2 1.02 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 21% | 54 |
| simonton.nano.MeleeSeed 1.8 | 17 | 16% | 42 |
| ahf.NanoAndrew .4 | 16 | 15% | 39 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 15 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 19 |
| EBBU.Sim2 1.02 | 10 | 9% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 11 |
| sam.Samspin 1.0 | 6 | 6% | 11 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.7 | 144 / 210 | 2.11 | 20.0% | 35108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.0% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.2% | 12 |
| fm.claire 1.7 | 5.2 | 8.7% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 5 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.5% | 5 |
| pa.Improved 1.0 | 8.0 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.1% | 1 |
| sample.SpinBot 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.9 | 20 / 35 | 5838 |
| 2 | 1 | 68.8 | 83.8 | 22 / 35 | 5859 |
| 3 | 1 | 71.1 | 90.2 | 27 / 35 | 5948 |
| 4 | 1 | 69.0 | 85.7 | 24 / 35 | 5642 |
| 5 | 1 | 70.7 | 89.5 | 24 / 35 | 6005 |
| 6 | 1 | 70.8 | 88.9 | 27 / 35 | 5816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 88% |
| oog.melee.CapuletDroid 1.1 | 33 | 100% |
| gh.nano.Grofvuil 0.2 | 22 | 77% |
| arthord.NanoSatanMelee Beta | 13 | 85% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 35% | 92 |
| gh.nano.Grofvuil 0.2 | 13 | 20% | 33 |
| oog.melee.CapuletDroid 1.1 | 9 | 14% | 39 |
| arthord.NanoSatanMelee Beta | 5 | 8% | 14 |
| fm.claire 1.7 | 5 | 8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 10 |
| kurios.DOSexe .9b | 4 | 6% | 7 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |
| pa.Improved 1.0 | 1 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.1 | 101 / 210 | 2.61 | 18.8% | 37600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.8% | 101 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 12.7% | 31 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.3% | 6 |
| DBall.Anarchy 0.1 | 5.8 | 8.0% | 4 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.9 | 18 / 35 | 6241 |
| 2 | 1 | 65.7 | 71.4 | 14 / 35 | 6152 |
| 3 | 1 | 69.5 | 85.4 | 19 / 35 | 6401 |
| 4 | 1 | 68.0 | 80.3 | 14 / 35 | 5937 |
| 5 | 1 | 70.8 | 90.2 | 18 / 35 | 6727 |
| 6 | 1 | 68.9 | 83.5 | 18 / 35 | 6142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 81% |
| mz.MicroGodMelee 1 | 35 | 60% |
| gh.micro.Gruweltje 0.7 | 32 | 72% |
| el.JumpShoot 0.2 | 6 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 29% | 69 |
| mz.MicroGodMelee 1 | 31 | 28% | 54 |
| gh.micro.Gruweltje 0.7 | 28 | 26% | 57 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 8 |
| acogdev.alpha 0.2 | 5 | 5% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 64.8 | 87 / 210 | 4.17 | 15.4% | 29971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.5 | 15.4% | 87 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.7% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 41 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.9% | 8 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.5% | 10 |
| germ.TheMind .2 | 6.5 | 9.1% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.8% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 69.8 | 14 / 35 | 5175 |
| 2 | 1 | 64.0 | 69.2 | 20 / 35 | 4665 |
| 3 | 2 | 63.8 | 64.4 | 15 / 35 | 5180 |
| 4 | 1 | 61.6 | 60.6 | 15 / 35 | 4903 |
| 5 | 1 | 62.4 | 64.1 | 11 / 35 | 5254 |
| 6 | 2 | 61.5 | 60.6 | 12 / 35 | 4794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 81% |
| germ.TheMind .2 | 12 | 75% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| awesomeness.Elite 1.0 | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 43% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 14% | 28 |
| germ.TheMind .2 | 13 | 11% | 24 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 9 | 7% | 14 |
| awesomeness.Elite 1.0 | 9 | 7% | 13 |
| mym.EdgeStalker 1.0 | 7 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 9 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.7 | 156 / 210 | 1.93 | 20.7% | 33670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.7% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 14.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 16 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.8% | 10 |
| maribo.IotaCT 1.1 | 5.0 | 9.9% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.6% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 8.2% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 7.4% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.5 | 26 / 35 | 5671 |
| 2 | 1 | 69.2 | 81.6 | 23 / 35 | 5222 |
| 3 | 1 | 72.4 | 92.7 | 27 / 35 | 5862 |
| 4 | 1 | 70.7 | 86.7 | 25 / 35 | 5467 |
| 5 | 1 | 72.3 | 93.3 | 25 / 35 | 5873 |
| 6 | 1 | 72.6 | 94.3 | 30 / 35 | 5575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 99 | 93% |
| nz.jdc.nano.GridFu 1.0 | 22 | 100% |
| timmit.nano.TimDog 0.33 | 11 | 55% |
| maribo.IotaCT 1.1 | 11 | 100% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 44% | 93 |
| timmit.nano.TimDog 0.33 | 9 | 17% | 17 |
| stelo.PatternRobot 1.0 | 7 | 13% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 35 |
| maribo.IotaCT 1.1 | 4 | 7% | 20 |
| ratosh.Wesco 1.4 | 3 | 6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 91.9 | 171 / 210 | 1.73 | 22.0% | 42177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.0% | 171 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.6% | 19 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.3% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 5 |
| sanja.First 0.1 | 6.5 | 8.4% | 4 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.6% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.0 | 32 / 35 | 7098 |
| 2 | 1 | 71.5 | 91.7 | 27 / 35 | 6881 |
| 3 | 1 | 72.9 | 95.2 | 28 / 35 | 7308 |
| 4 | 1 | 71.4 | 87.3 | 27 / 35 | 6916 |
| 5 | 1 | 72.7 | 93.7 | 31 / 35 | 7253 |
| 6 | 1 | 71.4 | 90.2 | 26 / 35 | 6721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 93% |
| tvv.nano.Polaris 1.2 | 36 | 86% |
| cvt.Firsty 1.0 | 29 | 97% |
| zyx.micro.Ant 1.1 | 25 | 92% |
| sanja.First 0.1 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 23% | 38 |
| tvv.nano.Polaris 1.2 | 8 | 21% | 60 |
| baal.nano.N 1.42 | 6 | 15% | 38 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 16 |
| cvt.Firsty 1.0 | 4 | 10% | 25 |
| sanja.First 0.1 | 2 | 5% | 14 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 9 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.3 | 83 / 210 | 3.85 | 15.6% | 32075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 15.6% | 83 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 58 |
| cs.Wren 1.0 | 3.3 | 12.1% | 19 |
| js.PinBall 1.6 | 4.5 | 11.3% | 16 |
| mz.Cork 0.1 | 4.5 | 11.1% | 17 |
| joe.ADinosaur 1.0 | 5.5 | 9.7% | 5 |
| evd.X1 0.01 | 7.0 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.6 | 16 / 35 | 5371 |
| 2 | 2 | 62.5 | 65.1 | 12 / 35 | 5239 |
| 3 | 1 | 62.1 | 65.7 | 12 / 35 | 5036 |
| 4 | 1 | 65.5 | 73.0 | 17 / 35 | 5649 |
| 5 | 1 | 59.0 | 55.2 | 10 / 35 | 4968 |
| 6 | 1 | 66.3 | 75.2 | 16 / 35 | 5812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 70% |
| cs.Wren 1.0 | 12 | 75% |
| js.PinBall 1.6 | 11 | 82% |
| mz.Cork 0.1 | 9 | 78% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 42% | 105 |
| cs.Wren 1.0 | 16 | 13% | 23 |
| js.PinBall 1.6 | 13 | 10% | 20 |
| mz.Cork 0.1 | 11 | 9% | 17 |
| evd.X1 0.01 | 11 | 9% | 13 |
| joe.ADinosaur 1.0 | 10 | 8% | 13 |
| PSW.Relentless 0.1 | 10 | 8% | 10 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.2 | 128 / 210 | 2.51 | 19.1% | 31167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.1% | 128 |
| myl.nano.Graviton 1.10 | 3.0 | 11.6% | 26 |
| ntc.Opposite 1.5 | 3.3 | 11.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 3 |
| disan.Chair 2.2.0 | 7.3 | 7.9% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 9 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 7 |
| pbg.R2D2 1.0 | 9.5 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.9 | 22 / 35 | 5739 |
| 2 | 1 | 69.2 | 84.1 | 23 / 35 | 5431 |
| 3 | 1 | 67.1 | 77.8 | 17 / 35 | 4721 |
| 4 | 1 | 68.1 | 81.6 | 20 / 35 | 5103 |
| 5 | 1 | 67.9 | 82.9 | 21 / 35 | 4988 |
| 6 | 1 | 70.0 | 89.8 | 25 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 80% |
| stelo.AreaTargetingBot 1.1 | 28 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 100% |
| ntc.Opposite 1.5 | 17 | 88% |
| disan.Chair 2.2.0 | 13 | 85% |
| donjezza.Muncho 1.0 | 9 | 100% |
| DBall.NUKE 0.1 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 22% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 19% | 29 |
| pfvicm.Sobieski 7.2.3b | 14 | 17% | 27 |
| stelo.AreaTargetingBot 1.1 | 13 | 16% | 29 |
| ntc.Opposite 1.5 | 9 | 11% | 25 |
| DBall.NUKE 0.1 | 4 | 5% | 15 |
| disan.Chair 2.2.0 | 3 | 4% | 14 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| donjezza.Muncho 1.0 | 3 | 4% | 6 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.3 | 86 / 210 | 3.22 | 16.3% | 27225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.3% | 86 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 33 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.6% | 21 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 17 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.1 | 16 / 35 | 4491 |
| 2 | 1 | 66.5 | 80.0 | 13 / 35 | 4874 |
| 3 | 1 | 66.0 | 77.5 | 14 / 35 | 4626 |
| 4 | 1 | 65.2 | 72.1 | 16 / 35 | 4520 |
| 5 | 1 | 65.1 | 76.5 | 16 / 35 | 4369 |
| 6 | 1 | 63.1 | 68.6 | 11 / 35 | 4345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 85% |
| yagami.Tidus 0.11 | 22 | 86% |
| kawigi.micro.Shiz 1.1 | 22 | 91% |
| ejb.Polaris 1.0.1 | 7 | 86% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 40% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 15% | 44 |
| yagami.Tidus 0.11 | 18 | 15% | 36 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 29 |
| ejb.Polaris 1.0.1 | 10 | 8% | 17 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 76.5 | 127 / 210 | 3.12 | 17.2% | 28031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.2% | 127 |
| bzdp.Pansy 2.1 | 2.3 | 12.7% | 23 |
| wee.Gem 1.8.4 | 3.5 | 11.8% | 27 |
| ratosh.Nobo 0.21 | 4.2 | 11.0% | 9 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 11 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.7% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.4 | 22 / 35 | 4750 |
| 2 | 1 | 63.2 | 68.9 | 19 / 35 | 4548 |
| 3 | 1 | 64.1 | 69.5 | 19 / 35 | 4577 |
| 4 | 1 | 66.4 | 78.7 | 22 / 35 | 4548 |
| 5 | 1 | 69.4 | 89.2 | 25 / 35 | 5004 |
| 6 | 1 | 65.3 | 74.0 | 20 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 95% |
| wee.Gem 1.8.4 | 34 | 100% |
| m3thos.Eva00 1.1 | 17 | 100% |
| wompi.Quokka 1.6 | 12 | 92% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 3 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 18 | 21% | 21 |
| bzdp.Pansy 2.1 | 16 | 19% | 54 |
| ratosh.Nobo 0.21 | 16 | 19% | 23 |
| m3thos.Eva00 1.1 | 10 | 12% | 25 |
| wompi.Quokka 1.6 | 8 | 10% | 21 |
| wee.Gem 1.8.4 | 6 | 7% | 41 |
| bayen.UbaMicro 1.4 | 6 | 7% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 7 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 3 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 89.4 | 145 / 210 | 1.95 | 22.7% | 51840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.7% | 145 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 54 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 8 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.7% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 9.0% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 89.2 | 24 / 35 | 8616 |
| 2 | 1 | 74.3 | 87.6 | 25 / 35 | 8981 |
| 3 | 1 | 72.4 | 83.5 | 22 / 35 | 8239 |
| 4 | 1 | 74.9 | 92.7 | 27 / 35 | 8578 |
| 5 | 1 | 74.7 | 94.6 | 25 / 35 | 8307 |
| 6 | 1 | 74.2 | 88.9 | 22 / 35 | 9119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 126 | 83% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| mz.NanoGod 2.02 | 12 | 92% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 51% | 149 |
| mz.NanoGod 2.02 | 14 | 22% | 29 |
| exauge.GateKeeper 1.1.121g | 7 | 11% | 13 |
| ayk.WallHugger 1.0 | 7 | 11% | 8 |
| stelo.PianistNano 1.2 | 4 | 6% | 9 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.2 | 98 / 210 | 3.59 | 16.3% | 28479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.3% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 30 |
| bvh.micro.Freya 0.3 | 3.5 | 11.8% | 16 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.8% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 12 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 62.2 | 13 / 35 | 4100 |
| 2 | 1 | 65.3 | 73.0 | 15 / 35 | 4866 |
| 3 | 1 | 66.2 | 74.3 | 20 / 35 | 5273 |
| 4 | 1 | 64.2 | 68.3 | 15 / 35 | 4994 |
| 5 | 1 | 64.3 | 74.0 | 15 / 35 | 4504 |
| 6 | 1 | 65.8 | 75.6 | 20 / 35 | 4742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 85% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 70% |
| bvh.micro.Freya 0.3 | 19 | 89% |
| stelo.MirrorMicro 1.0 | 6 | 50% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 21% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 21% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 16% | 34 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 39 |
| bvh.micro.Freya 0.3 | 11 | 10% | 23 |
| dl.BetterWalls 1.0 | 8 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 12 |
| conscience.Electron 1.3g | 8 | 7% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.1 | 158 / 210 | 2.07 | 22.0% | 44858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.0% | 158 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.0% | 14 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 10 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.1% | 10 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 9 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 2 |
| sample.Corners 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 85.7 | 25 / 35 | 7221 |
| 2 | 1 | 72.7 | 89.2 | 25 / 35 | 7503 |
| 3 | 1 | 71.4 | 83.5 | 26 / 35 | 7418 |
| 4 | 1 | 72.0 | 89.2 | 24 / 35 | 7334 |
| 5 | 1 | 74.5 | 94.3 | 32 / 35 | 8216 |
| 6 | 1 | 71.7 | 87.0 | 26 / 35 | 7166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 58 | 98% |
| supersample.SuperBoxBot 1.0 | 34 | 88% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 97% |
| dsw.StaticD 1.0 | 14 | 71% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 33% | 38 |
| dsw.StaticD 1.0 | 12 | 23% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 17% | 47 |
| sul.Lunar 1.1 | 6 | 12% | 63 |
| tlp.ThreeLeggedPig 1 | 4 | 8% | 10 |
| sample.Corners 1.0 | 2 | 4% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.6 | 104 / 210 | 2.93 | 18.0% | 37324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.0% | 104 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 31 |
| mld.Wisdom 1.0 | 3.0 | 12.8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.4% | 23 |
| amz.NanoClone 1.41 | 4.5 | 11.0% | 20 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.5% | 8 |
| sample.Walls 1.0 | 7.5 | 6.9% | 4 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 3 |
| jangs.ns51 1.0 | 9.0 | 5.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 23 / 35 | 7143 |
| 2 | 1 | 63.3 | 65.4 | 17 / 35 | 5326 |
| 3 | 1 | 67.4 | 79.7 | 15 / 35 | 6114 |
| 4 | 1 | 68.3 | 79.4 | 20 / 35 | 6348 |
| 5 | 1 | 67.4 | 80.3 | 17 / 35 | 5995 |
| 6 | 1 | 66.7 | 76.8 | 12 / 35 | 6398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 80% |
| mld.Wisdom 1.0 | 26 | 77% |
| davidalves.net.DuelistNanoMelee 1.01 | 26 | 85% |
| amz.NanoClone 1.41 | 17 | 88% |
| KiraNL.Chupacabra 0.4 | 9 | 67% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 29% | 55 |
| radnor.DoctorBob 1.42 | 22 | 21% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 16% | 41 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 25 |
| amz.NanoClone 1.41 | 14 | 13% | 19 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 4 |

