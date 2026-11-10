# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 87.6 | 125 / 210 | 2.12 | 20.3% | 40979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 20.3% | 125 |
| radnor.DoctorBob 1.42 | 2.5 | 14.6% | 38 |
| mld.Infinity 2.2 | 3.2 | 13.7% | 25 |
| mz.AntiGrav 1.0 | 3.3 | 14.0% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 3 |
| sample.Walls 1.0 | 6.5 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.3 | 22 / 35 | 7357 |
| 2 | 1 | 71.3 | 88.9 | 23 / 35 | 6517 |
| 3 | 1 | 68.9 | 82.9 | 17 / 35 | 6023 |
| 4 | 1 | 71.0 | 87.6 | 19 / 35 | 7072 |
| 5 | 1 | 71.3 | 87.3 | 20 / 35 | 7345 |
| 6 | 1 | 71.5 | 90.5 | 24 / 35 | 6665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 60 | 93% |
| mld.Infinity 2.2 | 40 | 88% |
| radnor.DoctorBob 1.42 | 36 | 50% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 49% | 64 |
| mz.AntiGrav 1.0 | 19 | 22% | 67 |
| mld.Infinity 2.2 | 9 | 11% | 47 |
| amz.NanoClone 1.41 | 9 | 11% | 13 |
| GarmBox.Oranges 1.0 | 2 | 2% | 6 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.3 | 115 / 210 | 2.23 | 18.5% | 31882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 18.5% | 115 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 28 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.6% | 44 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 5 |
| zyx.nano.Ant 1.1 | 6.3 | 8.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.3% | 4 |
| fullsail.SweetTea 1.1 | 8.2 | 6.5% | 2 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.0 | 22 / 35 | 5428 |
| 2 | 1 | 68.1 | 85.4 | 18 / 35 | 5573 |
| 3 | 1 | 66.6 | 83.2 | 18 / 35 | 5071 |
| 4 | 1 | 67.6 | 84.1 | 14 / 35 | 5220 |
| 5 | 1 | 68.2 | 86.3 | 20 / 35 | 5336 |
| 6 | 1 | 69.5 | 92.7 | 23 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 83% |
| oog.melee.Mercutio 1.0 | 45 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 67% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 33% | 76 |
| oog.melee.Mercutio 1.0 | 24 | 25% | 60 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 11% | 25 |
| maribo.melee.BMV 0.1 | 10 | 10% | 19 |
| zyx.nano.Ant 1.1 | 7 | 7% | 9 |
| fullsail.SweetTea 1.1 | 5 | 5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 7 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 81.6 | 115 / 210 | 2.66 | 19.2% | 37979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 19.2% | 115 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 50 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.6% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.9% | 22 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.3% | 7 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 1 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.6% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |
| sample.Fire 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 81.6 | 20 / 35 | 6388 |
| 2 | 1 | 67.4 | 77.8 | 18 / 35 | 5657 |
| 3 | 1 | 69.5 | 83.2 | 20 / 35 | 6564 |
| 4 | 1 | 69.5 | 84.4 | 20 / 35 | 6308 |
| 5 | 1 | 68.9 | 80.6 | 19 / 35 | 6363 |
| 6 | 1 | 69.6 | 81.9 | 18 / 35 | 6699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 87% |
| myl.nano.KomoriNinja 1.1 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 12 | 92% |
| sp.Nanos.Ember 1.1 | 11 | 82% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 26% | 42 |
| myl.micro.Troodon 1.10 | 20 | 21% | 67 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 14 |
| myl.nano.KomoriNinja 1.1 | 12 | 13% | 38 |
| fm.mammillarias 1.3 | 10 | 11% | 12 |
| cs.sheldor.Talon 1.1 | 9 | 9% | 13 |
| sp.Nanos.Ember 1.1 | 5 | 5% | 17 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.0 | 148 / 210 | 2.08 | 20.8% | 40594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 20.8% | 148 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 16 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.9% | 10 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.7% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 1 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 2 |
| yk.JahMicro 1.0 | 7.3 | 7.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.0% | 11 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.1 | 23 / 35 | 6476 |
| 2 | 1 | 73.4 | 96.2 | 31 / 35 | 7295 |
| 3 | 1 | 70.5 | 86.7 | 26 / 35 | 6681 |
| 4 | 1 | 70.4 | 87.3 | 25 / 35 | 6811 |
| 5 | 1 | 70.1 | 87.3 | 23 / 35 | 6505 |
| 6 | 1 | 69.8 | 85.7 | 20 / 35 | 6826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 90% |
| stelo.SoJNanoMelee 1.1 | 50 | 84% |
| tj.zombie1n 1.0.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 69% |
| tvv.micro.Antares 1.1.1 | 9 | 89% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 35% | 75 |
| stelo.SoJNanoMelee 1.1 | 14 | 23% | 44 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 9 |
| tj.zombie1n 1.0.1 | 4 | 6% | 11 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.7 | 94 / 210 | 3.19 | 16.8% | 30457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 16.8% | 94 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 34 |
| ahf.NanoAndrew .4 | 3.2 | 11.3% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 23 |
| EBBU.Sim2 1.02 | 5.7 | 9.7% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.3% | 6 |
| sam.Samspin 1.0 | 7.0 | 9.0% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 76.2 | 17 / 35 | 4688 |
| 2 | 1 | 63.9 | 73.7 | 11 / 35 | 4981 |
| 3 | 1 | 63.5 | 72.4 | 14 / 35 | 4698 |
| 4 | 1 | 65.9 | 77.1 | 17 / 35 | 5207 |
| 5 | 1 | 65.6 | 76.2 | 19 / 35 | 5132 |
| 6 | 1 | 66.6 | 78.4 | 16 / 35 | 5751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 95% |
| oog.melee.Corsair 1.0 | 28 | 50% |
| ahf.NanoAndrew .4 | 22 | 64% |
| sam.Samspin 1.0 | 13 | 92% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 116 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 23 | 20% | 35 |
| oog.melee.Corsair 1.0 | 22 | 19% | 35 |
| ahf.NanoAndrew .4 | 18 | 16% | 35 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 14 |
| EBBU.Sim2 1.02 | 12 | 10% | 17 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 45 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 7 |
| sam.Samspin 1.0 | 6 | 5% | 18 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.6 | 124 / 210 | 2.56 | 18.4% | 31598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 18.4% | 124 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 26 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.5% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.5% | 20 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 6 |
| fm.claire 1.7 | 6.3 | 8.5% | 3 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.0 | 16 / 35 | 5130 |
| 2 | 1 | 70.2 | 90.8 | 25 / 35 | 5892 |
| 3 | 1 | 67.0 | 80.0 | 17 / 35 | 5513 |
| 4 | 1 | 67.9 | 81.3 | 24 / 35 | 4990 |
| 5 | 1 | 66.2 | 79.7 | 20 / 35 | 4955 |
| 6 | 1 | 67.7 | 84.1 | 22 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 87% |
| gh.nano.Grofvuil 0.2 | 20 | 85% |
| oog.melee.CapuletDroid 1.1 | 18 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| kurios.DOSexe .9b | 6 | 83% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 1 | 0% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 29% | 65 |
| gh.nano.Grofvuil 0.2 | 16 | 19% | 39 |
| oog.melee.CapuletDroid 1.1 | 12 | 14% | 35 |
| arthord.NanoSatanMelee Beta | 12 | 14% | 28 |
| sample.SpinBot 1.0 | 8 | 9% | 12 |
| fm.claire 1.7 | 8 | 9% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 12 |
| kurios.DOSexe .9b | 2 | 2% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.2 | 100 / 210 | 2.79 | 17.9% | 34703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 17.9% | 100 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 39 |
| mz.MicroGodMelee 1 | 3.5 | 13.1% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 3 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 3 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 3 |
| fire219.CatBot 1.0 | 8.8 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.9 | 17 / 35 | 5527 |
| 2 | 1 | 67.8 | 81.9 | 19 / 35 | 5342 |
| 3 | 1 | 68.7 | 84.4 | 14 / 35 | 6331 |
| 4 | 1 | 67.1 | 80.3 | 17 / 35 | 5737 |
| 5 | 1 | 66.9 | 78.1 | 17 / 35 | 5676 |
| 6 | 1 | 67.9 | 80.3 | 16 / 35 | 6090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 80% |
| mz.MicroGodMelee 1 | 32 | 84% |
| DBall.Anarchy 0.1 | 13 | 100% |
| gh.micro.Gruweltje 0.7 | 13 | 46% |
| el.JumpShoot 0.2 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 26% | 68 |
| mz.MicroGodMelee 1 | 26 | 24% | 52 |
| gh.micro.Gruweltje 0.7 | 25 | 23% | 39 |
| caimano.Furia_Ceca 0.22 | 12 | 11% | 14 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 15 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.2 | 94 / 210 | 3.68 | 15.9% | 30758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.5 | 15.9% | 94 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.7% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 11 |
| germ.TheMind .2 | 5.2 | 9.6% | 9 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 9 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.2% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.5% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.0 | 15 / 35 | 4915 |
| 2 | 1 | 63.4 | 69.8 | 15 / 35 | 5105 |
| 3 | 1 | 65.8 | 75.6 | 14 / 35 | 5183 |
| 4 | 2 | 61.6 | 62.5 | 15 / 35 | 4927 |
| 5 | 2 | 62.4 | 67.0 | 13 / 35 | 4938 |
| 6 | 1 | 67.6 | 79.4 | 22 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 67% |
| awesomeness.Elite 1.0 | 7 | 71% |
| germ.TheMind .2 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 44% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 22% | 38 |
| lrem.micro.MoggFanatic 0.2 | 10 | 9% | 15 |
| germ.TheMind .2 | 8 | 7% | 14 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 12 |
| awesomeness.Elite 1.0 | 6 | 5% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.4 | 135 / 210 | 2.50 | 18.7% | 29613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 18.7% | 135 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 10 |
| maribo.IotaCT 1.1 | 3.8 | 10.7% | 11 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 2 |
| spinnercat.Omen 1.0 | 7.2 | 8.4% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 8.3% | 10 |
| ratosh.Wesco 1.4 | 8.0 | 8.2% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.3 | 22 / 35 | 5106 |
| 2 | 1 | 67.4 | 79.0 | 24 / 35 | 4603 |
| 3 | 1 | 67.4 | 78.7 | 18 / 35 | 4943 |
| 4 | 1 | 70.2 | 90.5 | 26 / 35 | 4835 |
| 5 | 1 | 65.5 | 76.2 | 19 / 35 | 4507 |
| 6 | 1 | 71.0 | 89.5 | 26 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 61 | 97% |
| nz.jdc.nano.GridFu 1.0 | 36 | 97% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 92% |
| stelo.PatternRobot 1.0 | 10 | 90% |
| maribo.IotaCT 1.1 | 8 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| timmit.nano.TimDog 0.33 | 6 | 67% |
| ratosh.Wesco 1.4 | 4 | 75% |

Hadur died in 77 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 24 | 31% | 26 |
| timmit.nano.TimDog 0.33 | 19 | 25% | 26 |
| nz.jdc.nano.GridFu 1.0 | 12 | 16% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 15 |
| ratosh.Wesco 1.4 | 6 | 8% | 13 |
| rz.HawkOnFire 0.1 | 5 | 6% | 55 |
| maribo.IotaCT 1.1 | 4 | 5% | 14 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |

## Melee bench: F10

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.0 | 152 / 210 | 1.99 | 20.5% | 38264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 20.5% | 152 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 21 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.7% | 15 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.8% | 2 |
| sanja.First 0.1 | 6.8 | 8.4% | 6 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.8% | 3 |
| cvt.Firsty 1.0 | 8.7 | 7.0% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.1 | 28 / 35 | 5959 |
| 2 | 1 | 70.6 | 91.4 | 26 / 35 | 6523 |
| 3 | 1 | 68.7 | 82.5 | 23 / 35 | 6140 |
| 4 | 1 | 68.6 | 81.9 | 21 / 35 | 6139 |
| 5 | 1 | 72.3 | 95.6 | 29 / 35 | 6809 |
| 6 | 1 | 70.9 | 91.7 | 25 / 35 | 6694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 88% |
| zyx.micro.Ant 1.1 | 25 | 72% |
| baal.nano.N 1.42 | 23 | 87% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| cvt.Firsty 1.0 | 19 | 89% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 31% | 49 |
| tvv.nano.Polaris 1.2 | 14 | 24% | 52 |
| baal.nano.N 1.42 | 6 | 10% | 27 |
| Grystrion.TrackerWO 1.0 | 6 | 10% | 23 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 8 |
| cvt.Firsty 1.0 | 3 | 5% | 22 |
| sanja.First 0.1 | 3 | 5% | 20 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 7 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 67.4 | 77 / 210 | 3.94 | 14.9% | 29721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.6% | 76 |
| hadur117.micro.SaorWOC 0.1 | 1.8 | 14.9% | 77 |
| cs.Wren 1.0 | 3.3 | 12.5% | 19 |
| mz.Cork 0.1 | 4.3 | 11.1% | 17 |
| js.PinBall 1.6 | 4.5 | 10.6% | 9 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 5 |
| evd.X1 0.01 | 7.0 | 8.1% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 1 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 67.6 | 15 / 35 | 5025 |
| 2 | 2 | 61.5 | 64.8 | 13 / 35 | 4904 |
| 3 | 1 | 65.3 | 73.3 | 16 / 35 | 5641 |
| 4 | 2 | 61.7 | 67.9 | 9 / 35 | 4969 |
| 5 | 2 | 59.1 | 59.7 | 9 / 35 | 4654 |
| 6 | 2 | 63.1 | 70.8 | 15 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 61% |
| cs.Wren 1.0 | 24 | 96% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 67 | 50% | 109 |
| joe.ADinosaur 1.0 | 15 | 11% | 18 |
| cs.Wren 1.0 | 13 | 10% | 26 |
| evd.X1 0.01 | 12 | 9% | 12 |
| mz.Cork 0.1 | 9 | 7% | 19 |
| js.PinBall 1.6 | 9 | 7% | 13 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 142 / 210 | 2.21 | 19.4% | 30045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 19.4% | 142 |
| myl.nano.Graviton 1.10 | 2.2 | 11.9% | 27 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.3% | 11 |
| ntc.Opposite 1.5 | 4.5 | 10.4% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.9% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.5% | 1 |
| DBall.NUKE 0.1 | 7.0 | 8.5% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 10 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.6 | 26 / 35 | 4764 |
| 2 | 1 | 68.9 | 88.3 | 21 / 35 | 5039 |
| 3 | 1 | 69.5 | 86.3 | 25 / 35 | 5400 |
| 4 | 1 | 68.1 | 82.5 | 21 / 35 | 5166 |
| 5 | 1 | 69.6 | 90.5 | 26 / 35 | 5070 |
| 6 | 1 | 67.6 | 83.8 | 23 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 89% |
| myl.nano.Graviton 1.10 | 34 | 85% |
| disan.Chair 2.2.0 | 23 | 83% |
| DBall.NUKE 0.1 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| ntc.Opposite 1.5 | 16 | 81% |
| donjezza.Muncho 1.0 | 12 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 67% |

Hadur died in 69 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 14 | 20% | 54 |
| pfvicm.Sobieski 7.2.3b | 14 | 20% | 23 |
| stelo.AreaTargetingBot 1.1 | 11 | 16% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 13% | 19 |
| ntc.Opposite 1.5 | 8 | 12% | 19 |
| disan.Chair 2.2.0 | 7 | 10% | 24 |
| donjezza.Muncho 1.0 | 3 | 4% | 9 |
| DBall.NUKE 0.1 | 2 | 3% | 19 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.7 | 81 / 210 | 3.55 | 15.6% | 26778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.3 | 15.6% | 81 |
| oog.melee.Capulet 1.2 | 2.8 | 14.0% | 52 |
| kawigi.micro.Shiz 1.1 | 2.8 | 14.1% | 36 |
| yagami.Tidus 0.11 | 3.5 | 12.9% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.8% | 16 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.9 | 16 / 35 | 4602 |
| 2 | 1 | 63.8 | 70.2 | 14 / 35 | 4405 |
| 3 | 1 | 63.4 | 71.1 | 15 / 35 | 3886 |
| 4 | 3 | 62.0 | 65.4 | 8 / 35 | 4534 |
| 5 | 1 | 62.5 | 65.1 | 10 / 35 | 4665 |
| 6 | 1 | 66.2 | 76.5 | 18 / 35 | 4686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 66% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| yagami.Tidus 0.11 | 18 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 81% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 45% | 83 |
| yagami.Tidus 0.11 | 29 | 22% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 29 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 29 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 3 |
| ejb.Polaris 1.0.1 | 2 | 2% | 8 |

## Melee bench: F14

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.9 | 123 / 210 | 2.90 | 17.4% | 28122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 17.4% | 123 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 18 |
| ratosh.Nobo 0.21 | 3.8 | 11.2% | 12 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 25 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 14 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 9.2% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.0 | 19 / 35 | 4340 |
| 2 | 1 | 65.4 | 76.5 | 21 / 35 | 4516 |
| 3 | 1 | 66.7 | 82.2 | 21 / 35 | 4809 |
| 4 | 1 | 67.2 | 80.6 | 21 / 35 | 5102 |
| 5 | 1 | 67.8 | 83.8 | 22 / 35 | 5174 |
| 6 | 1 | 63.7 | 70.5 | 19 / 35 | 4181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 95% |
| wee.Gem 1.8.4 | 32 | 97% |
| wompi.Quokka 1.6 | 24 | 92% |
| ratosh.Nobo 0.21 | 16 | 75% |
| bayen.UbaMicro 1.4 | 10 | 60% |
| m3thos.Eva00 1.1 | 9 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jeremyreeder.Vincent 2011.12.09 | 16 | 18% | 17 |
| bayen.UbaMicro 1.4 | 15 | 17% | 24 |
| ratosh.Nobo 0.21 | 14 | 16% | 30 |
| m3thos.Eva00 1.1 | 10 | 11% | 19 |
| wee.Gem 1.8.4 | 9 | 10% | 47 |
| wompi.Quokka 1.6 | 7 | 8% | 17 |
| bzdp.Pansy 2.1 | 6 | 7% | 43 |
| maribo.FollowFire 1 | 6 | 7% | 6 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 84.1 | 90 / 210 | 2.43 | 19.4% | 43342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.2% | 94 |
| hadur117.micro.SaorWOC 0.1 | 1.5 | 19.4% | 90 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 15 |
| ayk.WallHugger 1.0 | 4.7 | 9.9% | 2 |
| stuff.Vlad 0.1 | 5.2 | 8.8% | 1 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.7% | 8 |
| stelo.PianistNano 1.2 | 7.0 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 80.6 | 12 / 35 | 7276 |
| 2 | 2 | 69.4 | 81.6 | 12 / 35 | 6954 |
| 3 | 1 | 71.6 | 87.6 | 19 / 35 | 7421 |
| 4 | 2 | 70.1 | 83.2 | 16 / 35 | 6915 |
| 5 | 1 | 71.5 | 87.9 | 15 / 35 | 7355 |
| 6 | 1 | 70.6 | 83.5 | 16 / 35 | 7421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 50% |
| mz.NanoGod 2.02 | 11 | 73% |
| exauge.GateKeeper 1.1.121g | 8 | 75% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 74 | 61% | 137 |
| mz.NanoGod 2.02 | 23 | 19% | 36 |
| exauge.GateKeeper 1.1.121g | 12 | 10% | 17 |
| ayk.WallHugger 1.0 | 5 | 4% | 9 |
| stuff.Vlad 0.1 | 5 | 4% | 6 |
| drd.Dreadknoght 0.9 | 2 | 2% | 5 |

## Melee bench: F16

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.5 | 111 / 210 | 3.12 | 17.2% | 30012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 17.2% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 25 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 22 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.7% | 15 |
| stelo.MirrorMicro 1.0 | 6.8 | 8.5% | 5 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 2 |
| ap.Frederick 1.1 | 7.5 | 7.4% | 13 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 80.0 | 22 / 35 | 5224 |
| 2 | 1 | 64.8 | 71.7 | 17 / 35 | 5237 |
| 3 | 1 | 66.6 | 80.6 | 19 / 35 | 4859 |
| 4 | 1 | 64.2 | 71.4 | 19 / 35 | 4677 |
| 5 | 1 | 65.3 | 76.2 | 16 / 35 | 5028 |
| 6 | 1 | 66.7 | 78.7 | 18 / 35 | 4987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 88% |
| dummy.micro.Sparrow 2.5 | 26 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 80% |
| bvh.micro.Freya 0.3 | 16 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 20% | 62 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| bvh.micro.Freya 0.3 | 15 | 15% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 34 |
| dummy.micro.Sparrow 2.5 | 11 | 11% | 37 |
| conscience.Electron 1.3g | 9 | 9% | 12 |
| dl.BetterWalls 1.0 | 8 | 8% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 14 |

## Melee bench: F17

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.5 | 145 / 210 | 2.21 | 20.9% | 42389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 20.9% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.9% | 16 |
| sul.Lunar 1.1 | 3.0 | 12.1% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.6% | 11 |
| dsw.StaticD 1.0 | 5.3 | 8.6% | 8 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.5% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 7.1% | 7 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 1 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.9% | 5 |
| sample.Corners 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.2 | 24 / 35 | 6940 |
| 2 | 1 | 69.9 | 84.8 | 21 / 35 | 6615 |
| 3 | 1 | 70.6 | 86.0 | 25 / 35 | 6974 |
| 4 | 1 | 70.7 | 83.2 | 25 / 35 | 7067 |
| 5 | 1 | 71.1 | 86.0 | 23 / 35 | 7322 |
| 6 | 1 | 72.0 | 89.8 | 27 / 35 | 7471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 91% |
| supersample.SuperBoxBot 1.0 | 24 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| dsw.StaticD 1.0 | 8 | 38% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 30 | 46% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 54 |
| dsw.StaticD 1.0 | 7 | 11% | 11 |
| sul.Lunar 1.1 | 6 | 9% | 58 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 12 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWOC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.8 | 69 / 210 | 3.18 | 16.7% | 35751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWOC 0.1 | 1.0 | 16.7% | 69 |
| radnor.DoctorBob 1.42 | 2.2 | 14.2% | 50 |
| mld.Wisdom 1.0 | 3.2 | 12.9% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.3% | 32 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 4 |
| amz.NanoClone 1.41 | 5.8 | 9.2% | 13 |
| sample.Walls 1.0 | 7.2 | 8.1% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.2 | 12 / 35 | 6190 |
| 2 | 1 | 66.8 | 81.3 | 13 / 35 | 6066 |
| 3 | 1 | 65.9 | 78.1 | 12 / 35 | 5925 |
| 4 | 1 | 65.5 | 74.3 | 12 / 35 | 6169 |
| 5 | 1 | 62.6 | 67.3 | 10 / 35 | 5499 |
| 6 | 1 | 64.1 | 71.4 | 10 / 35 | 5902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 82% |
| radnor.DoctorBob 1.42 | 30 | 27% |
| mld.Wisdom 1.0 | 17 | 41% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 32% | 61 |
| mld.Wisdom 1.0 | 40 | 28% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 16% | 50 |
| KiraNL.Chupacabra 0.4 | 13 | 9% | 22 |
| amz.NanoClone 1.41 | 11 | 8% | 13 |
| GarmBox.Oranges 1.0 | 4 | 3% | 6 |
| sample.Walls 1.0 | 3 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 1% | 5 |

