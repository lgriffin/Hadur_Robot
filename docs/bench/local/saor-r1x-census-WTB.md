# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.7 | 147 / 210 | 2.11 | 21.2% | 42981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.2% | 147 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 22 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.6% | 16 |
| amz.NanoClone 1.41 | 5.0 | 11.0% | 6 |
| sample.Walls 1.0 | 6.3 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.0 | 21 / 35 | 6602 |
| 2 | 1 | 72.7 | 91.4 | 25 / 35 | 7206 |
| 3 | 1 | 72.7 | 89.8 | 27 / 35 | 7294 |
| 4 | 1 | 73.9 | 93.3 | 30 / 35 | 7498 |
| 5 | 1 | 71.0 | 84.8 | 21 / 35 | 7241 |
| 6 | 1 | 71.5 | 85.7 | 23 / 35 | 7140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 94% |
| mld.Infinity 2.2 | 39 | 95% |
| radnor.DoctorBob 1.42 | 36 | 78% |
| amz.NanoClone 1.41 | 10 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 50% | 69 |
| amz.NanoClone 1.41 | 9 | 14% | 15 |
| mld.Infinity 2.2 | 8 | 13% | 50 |
| mz.AntiGrav 1.0 | 5 | 8% | 49 |
| jangs.ns51 1.0 | 4 | 6% | 7 |
| GarmBox.Oranges 1.0 | 3 | 5% | 5 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.3 | 137 / 210 | 2.06 | 19.5% | 33680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.5% | 137 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 48 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 14 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 3 |
| bzdp.BoxCar 2.0 | 6.3 | 8.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 3 |
| zyx.nano.Ant 1.1 | 7.5 | 7.3% | 2 |
| fullsail.SweetTea 1.1 | 8.7 | 5.9% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 22 / 35 | 5422 |
| 2 | 1 | 69.5 | 89.8 | 25 / 35 | 5467 |
| 3 | 1 | 70.3 | 91.7 | 27 / 35 | 5701 |
| 4 | 1 | 70.7 | 90.2 | 25 / 35 | 6197 |
| 5 | 1 | 67.0 | 78.7 | 14 / 35 | 5654 |
| 6 | 1 | 69.2 | 89.5 | 24 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 77% |
| mld.DustBunny 3.8 | 58 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 74 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 38% | 83 |
| mld.DustBunny 3.8 | 22 | 30% | 64 |
| maribo.melee.BMV 0.1 | 8 | 11% | 16 |
| zyx.nano.Ant 1.1 | 6 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 16 |
| fullsail.SweetTea 1.1 | 3 | 4% | 8 |
| bzdp.BoxCar 2.0 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 2 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 9 |

## Melee bench: F03

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.1 | 146 / 210 | 2.25 | 20.6% | 38544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.6% | 146 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 16 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.1% | 7 |
| fm.mammillarias 1.3 | 5.8 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.4% | 1 |
| sample.Fire 1.0 | 9.2 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 93.0 | 27 / 35 | 6950 |
| 2 | 1 | 71.3 | 89.2 | 26 / 35 | 6108 |
| 3 | 1 | 71.0 | 85.7 | 26 / 35 | 6698 |
| 4 | 1 | 70.5 | 86.3 | 24 / 35 | 6311 |
| 5 | 1 | 68.2 | 78.1 | 20 / 35 | 6090 |
| 6 | 1 | 70.6 | 84.4 | 23 / 35 | 6387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 41 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 40 | 90% |
| cb.nano.Insomnia 1.0 | 33 | 97% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| sp.Nanos.Ember 1.1 | 14 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 27% | 42 |
| myl.nano.KomoriNinja 1.1 | 15 | 23% | 43 |
| myl.micro.Troodon 1.10 | 13 | 20% | 54 |
| sample.Fire 1.0 | 6 | 9% | 13 |
| fm.mammillarias 1.3 | 6 | 9% | 13 |
| cb.nano.Insomnia 1.0 | 3 | 5% | 11 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 23 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 11 |

## Melee bench: F04

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.4 | 148 / 210 | 2.14 | 20.9% | 40393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.9% | 148 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 18 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.8% | 8 |
| tj.zombie1n 1.0.1 | 4.5 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.9% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 0 |
| yk.JahMicro 1.0 | 6.8 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 88.3 | 23 / 35 | 6861 |
| 2 | 1 | 71.1 | 88.9 | 26 / 35 | 6620 |
| 3 | 1 | 73.1 | 94.0 | 29 / 35 | 7549 |
| 4 | 1 | 71.8 | 92.1 | 28 / 35 | 6966 |
| 5 | 1 | 67.4 | 76.8 | 20 / 35 | 5672 |
| 6 | 1 | 70.2 | 84.1 | 22 / 35 | 6725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 89% |
| stelo.SoJNanoMelee 1.1 | 44 | 75% |
| tj.zombie1n 1.0.1 | 25 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 86% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 29% | 86 |
| stelo.SoJNanoMelee 1.1 | 18 | 29% | 43 |
| tj.zombie1n 1.0.1 | 6 | 10% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 24 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 21 |
| repositorio.NanoStep 1.0 | 2 | 3% | 5 |
| yk.JahMicro 1.0 | 1 | 2% | 10 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.4 | 83 / 210 | 3.85 | 15.7% | 29732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 15.7% | 83 |
| oog.melee.Corsair 1.0 | 2.5 | 12.9% | 35 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 27 |
| sam.Samspin 1.0 | 5.2 | 9.7% | 15 |
| EBBU.Sim2 1.02 | 5.7 | 9.3% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.7% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.9% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 66.0 | 13 / 35 | 4788 |
| 2 | 1 | 66.1 | 79.0 | 16 / 35 | 5201 |
| 3 | 1 | 62.2 | 65.1 | 12 / 35 | 4948 |
| 4 | 1 | 62.3 | 67.0 | 10 / 35 | 4930 |
| 5 | 1 | 64.0 | 69.2 | 15 / 35 | 5138 |
| 6 | 1 | 62.1 | 63.8 | 17 / 35 | 4727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 67% |
| simonton.nano.MeleeSeed 1.8 | 25 | 96% |
| ahf.NanoAndrew .4 | 19 | 74% |
| sam.Samspin 1.0 | 11 | 73% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 27% | 56 |
| robar.nano.Assertive_Melee 0.2 | 20 | 16% | 24 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 39 |
| ahf.NanoAndrew .4 | 14 | 11% | 30 |
| sam.Samspin 1.0 | 13 | 10% | 23 |
| EBBU.Sim2 1.02 | 12 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 8 | 6% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 8 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.0 | 138 / 210 | 2.26 | 19.5% | 34087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.5% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 25 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 13 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.3% | 4 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.6% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 11 |
| fm.claire 1.7 | 6.7 | 8.2% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 2 |
| pa.Improved 1.0 | 9.2 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 24 / 35 | 5372 |
| 2 | 1 | 68.8 | 84.8 | 20 / 35 | 5654 |
| 3 | 1 | 68.9 | 85.1 | 21 / 35 | 5600 |
| 4 | 1 | 69.7 | 86.7 | 25 / 35 | 5756 |
| 5 | 1 | 68.2 | 81.6 | 21 / 35 | 5741 |
| 6 | 1 | 70.9 | 92.4 | 27 / 35 | 5964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 82% |
| oog.melee.CapuletDroid 1.1 | 30 | 97% |
| arthord.NanoSatanMelee Beta | 22 | 91% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| sample.SpinBot 1.0 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 30% | 63 |
| gh.nano.Grofvuil 0.2 | 13 | 18% | 37 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 40 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 24 |
| sample.SpinBot 1.0 | 7 | 10% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 14 |
| fm.claire 1.7 | 4 | 5% | 4 |
| kurios.DOSexe .9b | 3 | 4% | 11 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 84.2 | 122 / 210 | 2.42 | 19.3% | 37022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.3% | 122 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 31 |
| mz.MicroGodMelee 1 | 3.0 | 12.8% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.9% | 19 |
| DBall.Anarchy 0.1 | 5.0 | 8.9% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 1 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.8 | 21 / 35 | 6297 |
| 2 | 1 | 69.6 | 87.3 | 20 / 35 | 6032 |
| 3 | 1 | 70.7 | 87.3 | 24 / 35 | 6415 |
| 4 | 1 | 70.1 | 84.4 | 20 / 35 | 6673 |
| 5 | 1 | 68.8 | 82.9 | 23 / 35 | 5773 |
| 6 | 1 | 67.2 | 79.4 | 14 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 88% |
| mz.MicroGodMelee 1 | 47 | 68% |
| gh.micro.Gruweltje 0.7 | 20 | 80% |
| DBall.Anarchy 0.1 | 11 | 100% |
| acogdev.alpha 0.2 | 5 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 30 | 34% | 72 |
| gh.micro.Gruweltje 0.7 | 19 | 22% | 43 |
| spinnercat.micro.Tyger 0.1 | 15 | 17% | 44 |
| acogdev.alpha 0.2 | 9 | 10% | 14 |
| caimano.Furia_Ceca 0.22 | 8 | 9% | 10 |
| fire219.CatBot 1.0 | 5 | 6% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 9 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 67.5 | 107 / 210 | 3.92 | 15.9% | 29734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 15.9% | 107 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.6% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 14.0% | 30 |
| germ.TheMind .2 | 4.8 | 9.9% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 4 |
| awesomeness.Elite 1.0 | 5.8 | 9.0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 5 |
| sample.Crazy 1.0 | 9.0 | 6.6% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.4 | 19 / 35 | 5543 |
| 2 | 1 | 64.6 | 70.5 | 19 / 35 | 4695 |
| 3 | 1 | 64.6 | 67.3 | 16 / 35 | 5368 |
| 4 | 2 | 62.7 | 63.2 | 18 / 35 | 4850 |
| 5 | 1 | 63.3 | 67.0 | 18 / 35 | 4651 |
| 6 | 1 | 63.0 | 64.8 | 17 / 35 | 4627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 96% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| awesomeness.Elite 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 333. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 40% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 43 |
| germ.TheMind .2 | 12 | 12% | 20 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 12 |
| awesomeness.Elite 1.0 | 9 | 9% | 20 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.3 | 158 / 210 | 1.96 | 20.5% | 32665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.5% | 158 |
| rz.HawkOnFire 0.1 | 2.3 | 13.2% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.1% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 10.3% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 2 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.4% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.9% | 9 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.6 | 25 / 35 | 5621 |
| 2 | 1 | 73.1 | 96.2 | 30 / 35 | 6061 |
| 3 | 1 | 70.4 | 86.0 | 25 / 35 | 5441 |
| 4 | 1 | 71.8 | 92.1 | 27 / 35 | 5494 |
| 5 | 1 | 68.7 | 84.4 | 25 / 35 | 4619 |
| 6 | 1 | 70.6 | 89.5 | 26 / 35 | 5429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 94% |
| nz.jdc.nano.GridFu 1.0 | 37 | 100% |
| stelo.PatternRobot 1.0 | 17 | 82% |
| maribo.IotaCT 1.1 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 71% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 23% | 73 |
| stelo.PatternRobot 1.0 | 10 | 19% | 23 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 51 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 13% | 12 |
| ratosh.Wesco 1.4 | 4 | 8% | 10 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |
| maribo.IotaCT 1.1 | 1 | 2% | 12 |

## Melee bench: F10

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.5 | 170 / 210 | 1.68 | 21.9% | 40758 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.9% | 170 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 2 |
| Grystrion.TrackerWO 1.0 | 5.3 | 8.8% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 8.6% | 7 |
| cvt.Firsty 1.0 | 6.5 | 7.9% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.1% | 1 |
| sanja.First 0.1 | 6.7 | 8.3% | 5 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.8% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 95.2 | 29 / 35 | 6800 |
| 2 | 1 | 72.5 | 93.3 | 29 / 35 | 6991 |
| 3 | 1 | 73.1 | 97.5 | 29 / 35 | 7094 |
| 4 | 1 | 71.6 | 91.4 | 28 / 35 | 6668 |
| 5 | 1 | 71.2 | 90.2 | 28 / 35 | 6509 |
| 6 | 1 | 70.9 | 87.3 | 27 / 35 | 6696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 38 | 92% |
| tvv.nano.Polaris 1.2 | 37 | 89% |
| baal.nano.N 1.42 | 32 | 94% |
| sanja.First 0.1 | 22 | 100% |
| zyx.micro.Ant 1.1 | 17 | 76% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 25% | 54 |
| zyx.micro.Ant 1.1 | 10 | 25% | 30 |
| baal.nano.N 1.42 | 5 | 13% | 36 |
| sample.RamFire 1.0 | 5 | 13% | 5 |
| cvt.Firsty 1.0 | 4 | 10% | 30 |
| sanja.First 0.1 | 3 | 8% | 22 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 11 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 11 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |

## Melee bench: F11

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.0 | 83 / 210 | 3.70 | 15.9% | 32599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 15.9% | 83 |
| kc.micro.Figment 1.0 | 2.3 | 14.2% | 55 |
| cs.Wren 1.0 | 3.0 | 12.8% | 29 |
| js.PinBall 1.6 | 3.8 | 11.6% | 19 |
| mz.Cork 0.1 | 5.0 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 5 |
| evd.X1 0.01 | 7.2 | 8.0% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 64.4 | 13 / 35 | 4960 |
| 2 | 1 | 65.3 | 74.9 | 12 / 35 | 5597 |
| 3 | 1 | 61.5 | 63.2 | 11 / 35 | 5344 |
| 4 | 1 | 65.8 | 71.1 | 16 / 35 | 6323 |
| 5 | 1 | 64.3 | 71.7 | 12 / 35 | 5357 |
| 6 | 1 | 65.2 | 74.6 | 19 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 48 | 71% |
| cs.Wren 1.0 | 30 | 77% |
| js.PinBall 1.6 | 10 | 90% |
| mz.Cork 0.1 | 9 | 89% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 50% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 127 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 39% | 84 |
| joe.ADinosaur 1.0 | 19 | 15% | 21 |
| cs.Wren 1.0 | 17 | 13% | 36 |
| js.PinBall 1.6 | 12 | 9% | 22 |
| mz.Cork 0.1 | 11 | 9% | 20 |
| evd.X1 0.01 | 8 | 6% | 10 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.7 | 135 / 210 | 2.38 | 19.1% | 29587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.1% | 135 |
| ntc.Opposite 1.5 | 2.8 | 11.4% | 7 |
| myl.nano.Graviton 1.10 | 2.8 | 11.2% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.8% | 3 |
| DBall.NUKE 0.1 | 7.2 | 8.4% | 8 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 9 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 27 / 35 | 5119 |
| 2 | 1 | 68.8 | 85.1 | 21 / 35 | 5253 |
| 3 | 1 | 67.2 | 81.9 | 22 / 35 | 4589 |
| 4 | 1 | 67.3 | 79.7 | 20 / 35 | 5061 |
| 5 | 1 | 67.9 | 82.5 | 22 / 35 | 4964 |
| 6 | 1 | 68.5 | 87.6 | 23 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 85% |
| stelo.AreaTargetingBot 1.1 | 28 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 90% |
| ntc.Opposite 1.5 | 16 | 94% |
| donjezza.Muncho 1.0 | 16 | 94% |
| DBall.NUKE 0.1 | 15 | 100% |
| disan.Chair 2.2.0 | 12 | 83% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 24 | 32% | 56 |
| stelo.AreaTargetingBot 1.1 | 15 | 20% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 26 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 20 |
| ntc.Opposite 1.5 | 8 | 11% | 19 |
| disan.Chair 2.2.0 | 4 | 5% | 16 |
| DBall.NUKE 0.1 | 3 | 4% | 18 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.6 | 80 / 210 | 3.64 | 15.5% | 27012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 15.5% | 80 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 42 |
| oog.melee.Capulet 1.2 | 3.5 | 13.2% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.1% | 28 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 7 |
| ejb.Polaris 1.0.1 | 5.5 | 11.0% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 1 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.7 | 13 / 35 | 4573 |
| 2 | 1 | 67.8 | 81.3 | 18 / 35 | 5088 |
| 3 | 1 | 63.6 | 70.2 | 13 / 35 | 4151 |
| 4 | 1 | 62.7 | 67.6 | 13 / 35 | 4178 |
| 5 | 2 | 61.9 | 64.1 | 12 / 35 | 4361 |
| 6 | 1 | 63.3 | 67.0 | 11 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 82% |
| oog.melee.Capulet 1.2 | 23 | 57% |
| kawigi.micro.Shiz 1.1 | 21 | 86% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 9 | 89% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 36% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 47 |
| yagami.Tidus 0.11 | 19 | 15% | 30 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 30 |
| ejb.Polaris 1.0.1 | 13 | 10% | 25 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.1 | 132 / 210 | 2.70 | 18.0% | 29491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.0% | 132 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 22 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 16 |
| wompi.Quokka 1.6 | 3.5 | 11.2% | 14 |
| ratosh.Nobo 0.21 | 4.2 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 23 / 35 | 4678 |
| 2 | 1 | 64.6 | 73.0 | 18 / 35 | 4685 |
| 3 | 1 | 65.6 | 74.9 | 20 / 35 | 4873 |
| 4 | 1 | 69.3 | 88.9 | 26 / 35 | 4954 |
| 5 | 1 | 67.4 | 82.5 | 23 / 35 | 5087 |
| 6 | 1 | 68.2 | 85.1 | 22 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 94% |
| wee.Gem 1.8.4 | 42 | 98% |
| wompi.Quokka 1.6 | 21 | 95% |
| ratosh.Nobo 0.21 | 13 | 77% |
| bayen.UbaMicro 1.4 | 8 | 38% |
| m3thos.Eva00 1.1 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 15 | 19% | 18 |
| ratosh.Nobo 0.21 | 11 | 14% | 26 |
| bzdp.Pansy 2.1 | 10 | 13% | 50 |
| maribo.FollowFire 1 | 10 | 13% | 12 |
| wee.Gem 1.8.4 | 8 | 10% | 57 |
| m3thos.Eva00 1.1 | 8 | 10% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 11 |
| wompi.Quokka 1.6 | 5 | 6% | 17 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 4 |

## Melee bench: F15

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 87.7 | 121 / 210 | 2.10 | 21.3% | 47855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.3% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 67 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 15 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 86.3 | 19 / 35 | 7433 |
| 2 | 1 | 72.2 | 88.6 | 18 / 35 | 7902 |
| 3 | 1 | 71.9 | 83.8 | 22 / 35 | 7738 |
| 4 | 1 | 73.1 | 88.9 | 18 / 35 | 8495 |
| 5 | 1 | 73.3 | 91.1 | 21 / 35 | 8388 |
| 6 | 1 | 72.6 | 87.6 | 23 / 35 | 7899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 99 | 73% |
| mz.NanoGod 2.02 | 19 | 79% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 49 | 54% | 124 |
| mz.NanoGod 2.02 | 22 | 24% | 47 |
| exauge.GateKeeper 1.1.121g | 9 | 10% | 17 |
| ayk.WallHugger 1.0 | 5 | 6% | 12 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.4 | 108 / 210 | 3.30 | 16.9% | 30024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.9% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.1% | 21 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 17 |
| bvh.micro.Freya 0.3 | 3.8 | 11.0% | 19 |
| stelo.MirrorMicro 1.0 | 5.2 | 9.8% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.0% | 17 |
| conscience.Electron 1.3g | 7.5 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 19 / 35 | 5182 |
| 2 | 1 | 67.0 | 82.2 | 18 / 35 | 5184 |
| 3 | 1 | 66.9 | 81.0 | 23 / 35 | 4778 |
| 4 | 1 | 63.2 | 69.8 | 16 / 35 | 4507 |
| 5 | 1 | 62.9 | 65.1 | 14 / 35 | 5149 |
| 6 | 1 | 64.8 | 70.5 | 18 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 88% |
| dummy.micro.Sparrow 2.5 | 25 | 92% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 79% |
| stelo.MirrorMicro 1.0 | 10 | 90% |
| conscience.Electron 1.3g | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 20% | 19 |
| voidious.micro.BlitzBat 1.05 | 17 | 17% | 54 |
| conscience.Electron 1.3g | 16 | 16% | 20 |
| dummy.micro.Sparrow 2.5 | 15 | 15% | 39 |
| bvh.micro.Freya 0.3 | 15 | 15% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 7% | 25 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 17 |
| dl.BetterWalls 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.3 | 144 / 210 | 2.23 | 21.0% | 41988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.0% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 20 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.4% | 14 |
| sul.Lunar 1.1 | 4.0 | 11.1% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.7 | 7.0% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.5% | 0 |
| sample.Corners 1.0 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 88.9 | 26 / 35 | 7544 |
| 2 | 1 | 70.0 | 82.5 | 21 / 35 | 6685 |
| 3 | 1 | 71.3 | 85.4 | 24 / 35 | 7015 |
| 4 | 1 | 72.0 | 90.5 | 25 / 35 | 7048 |
| 5 | 1 | 70.9 | 85.7 | 24 / 35 | 6876 |
| 6 | 1 | 70.6 | 84.8 | 24 / 35 | 6820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 89% |
| sul.Lunar 1.1 | 44 | 98% |
| supersample.SuperBoxBot 1.0 | 32 | 88% |
| dsw.StaticD 1.0 | 10 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 21 | 31% | 69 |
| supersample.SuperBoxBot 1.0 | 16 | 24% | 35 |
| dsw.StaticD 1.0 | 9 | 13% | 17 |
| sul.Lunar 1.1 | 6 | 9% | 55 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 8 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 8 |
| sample.Corners 1.0 | 4 | 6% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.6 | 114 / 210 | 2.84 | 18.4% | 38071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.4% | 114 |
| radnor.DoctorBob 1.42 | 2.7 | 12.4% | 23 |
| mld.Wisdom 1.0 | 2.8 | 12.2% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.3% | 25 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 11 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 10 |
| sample.Walls 1.0 | 7.3 | 7.9% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.4 | 18 / 35 | 6262 |
| 2 | 1 | 68.9 | 80.6 | 19 / 35 | 7010 |
| 3 | 1 | 68.5 | 83.8 | 21 / 35 | 6110 |
| 4 | 1 | 68.6 | 81.6 | 23 / 35 | 6244 |
| 5 | 1 | 67.0 | 75.2 | 16 / 35 | 6517 |
| 6 | 1 | 66.4 | 77.8 | 17 / 35 | 5928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 87% |
| radnor.DoctorBob 1.42 | 22 | 82% |
| mld.Wisdom 1.0 | 16 | 63% |
| KiraNL.Chupacabra 0.4 | 15 | 80% |
| sample.Walls 1.0 | 11 | 100% |
| amz.NanoClone 1.41 | 10 | 90% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 28% | 44 |
| radnor.DoctorBob 1.42 | 21 | 22% | 45 |
| KiraNL.Chupacabra 0.4 | 19 | 20% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 14% | 54 |
| amz.NanoClone 1.41 | 7 | 7% | 15 |
| jangs.ns51 1.0 | 6 | 6% | 6 |
| sample.Walls 1.0 | 3 | 3% | 11 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |

