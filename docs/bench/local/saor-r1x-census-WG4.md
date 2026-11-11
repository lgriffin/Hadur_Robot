# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.1 | 143 / 210 | 1.98 | 21.8% | 45294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.8% | 143 |
| radnor.DoctorBob 1.42 | 2.5 | 14.0% | 27 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 15 |
| mld.Infinity 2.2 | 4.0 | 13.0% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 4 |
| GarmBox.Oranges 1.0 | 6.8 | 6.2% | 0 |
| sample.Walls 1.0 | 7.2 | 6.0% | 3 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.5% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.8 | 24 / 35 | 7363 |
| 2 | 1 | 73.4 | 89.5 | 26 / 35 | 7880 |
| 3 | 1 | 72.5 | 89.5 | 21 / 35 | 7176 |
| 4 | 1 | 72.8 | 90.5 | 25 / 35 | 7671 |
| 5 | 1 | 73.1 | 85.7 | 24 / 35 | 7858 |
| 6 | 1 | 72.4 | 89.5 | 23 / 35 | 7346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 99% |
| radnor.DoctorBob 1.42 | 40 | 70% |
| mld.Infinity 2.2 | 36 | 92% |
| amz.NanoClone 1.41 | 4 | 50% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 52% | 70 |
| mz.AntiGrav 1.0 | 10 | 15% | 65 |
| amz.NanoClone 1.41 | 10 | 15% | 17 |
| mld.Infinity 2.2 | 8 | 12% | 41 |
| arthord.MannyPacquiao Beta | 2 | 3% | 7 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.9 | 128 / 210 | 2.09 | 19.3% | 33892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.3% | 128 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 50 |
| mld.DustBunny 3.8 | 2.8 | 13.9% | 17 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 6 |
| zyx.nano.Ant 1.1 | 5.2 | 9.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.3% | 4 |
| cs.Grudge 1.0 | 8.7 | 5.7% | 0 |
| bzdp.BoxCar 2.0 | 8.8 | 6.0% | 0 |
| fullsail.SweetTea 1.1 | 9.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 24 / 35 | 5756 |
| 2 | 1 | 70.4 | 91.1 | 23 / 35 | 6096 |
| 3 | 1 | 69.8 | 85.7 | 20 / 35 | 6020 |
| 4 | 1 | 69.4 | 87.6 | 18 / 35 | 6042 |
| 5 | 1 | 68.5 | 87.9 | 19 / 35 | 5196 |
| 6 | 1 | 68.3 | 87.0 | 24 / 35 | 4782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 69 | 71% |
| mld.DustBunny 3.8 | 63 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| maribo.melee.BMV 0.1 | 8 | 63% |
| djdjdj.NanoSkunk10 1.0 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 40% | 82 |
| mld.DustBunny 3.8 | 22 | 27% | 75 |
| zyx.nano.Ant 1.1 | 8 | 10% | 9 |
| maribo.melee.BMV 0.1 | 6 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 16 |
| fullsail.SweetTea 1.1 | 3 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 81.2 | 116 / 210 | 2.69 | 19.3% | 36458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.3% | 116 |
| myl.micro.Troodon 1.10 | 2.2 | 13.7% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.0% | 22 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.1% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 4 |
| sample.Fire 1.0 | 9.3 | 5.2% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 81.3 | 18 / 35 | 6077 |
| 2 | 1 | 67.9 | 78.1 | 17 / 35 | 5725 |
| 3 | 1 | 71.6 | 90.8 | 24 / 35 | 6580 |
| 4 | 1 | 68.2 | 79.0 | 18 / 35 | 5857 |
| 5 | 1 | 69.2 | 79.7 | 19 / 35 | 6330 |
| 6 | 1 | 68.5 | 78.4 | 20 / 35 | 5889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 66% |
| cb.nano.Insomnia 1.0 | 24 | 88% |
| myl.nano.KomoriNinja 1.1 | 15 | 80% |
| sp.Nanos.Ember 1.1 | 12 | 67% |
| fm.mammillarias 1.3 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 27 | 29% | 46 |
| cb.nano.Insomnia 1.0 | 17 | 18% | 20 |
| myl.micro.Troodon 1.10 | 15 | 16% | 55 |
| myl.nano.KomoriNinja 1.1 | 15 | 16% | 42 |
| sp.Nanos.Ember 1.1 | 8 | 9% | 19 |
| fm.mammillarias 1.3 | 6 | 6% | 11 |
| sample.Fire 1.0 | 3 | 3% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 84.7 | 144 / 210 | 2.38 | 20.4% | 40668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.4% | 144 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.2% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 13.0% | 14 |
| tj.zombie1n 1.0.1 | 4.7 | 9.5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.1% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.3% | 13 |
| yk.JahMicro 1.0 | 6.5 | 7.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.4% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.3 | 27 / 35 | 6890 |
| 2 | 1 | 69.6 | 81.6 | 23 / 35 | 6557 |
| 3 | 1 | 71.0 | 87.6 | 23 / 35 | 7179 |
| 4 | 1 | 71.1 | 88.3 | 26 / 35 | 6791 |
| 5 | 1 | 69.3 | 80.3 | 21 / 35 | 6719 |
| 6 | 1 | 70.1 | 82.9 | 24 / 35 | 6532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 87% |
| tvv.micro.Antares 1.1.1 | 32 | 94% |
| stelo.SoJNanoMelee 1.1 | 29 | 90% |
| tj.zombie1n 1.0.1 | 16 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 90% |
| yk.JahMicro 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 41% | 85 |
| tj.zombie1n 1.0.1 | 11 | 17% | 12 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 29 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 42 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 14 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.8 | 84 / 210 | 3.90 | 15.8% | 30110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 15.8% | 84 |
| oog.melee.Corsair 1.0 | 2.5 | 13.0% | 43 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.7% | 23 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 28 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.2% | 6 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 57.8 | 52.1 | 10 / 35 | 4292 |
| 2 | 1 | 63.9 | 69.2 | 14 / 35 | 4947 |
| 3 | 1 | 64.3 | 72.1 | 13 / 35 | 5079 |
| 4 | 1 | 64.4 | 69.8 | 16 / 35 | 5142 |
| 5 | 1 | 64.1 | 68.3 | 15 / 35 | 4992 |
| 6 | 1 | 66.1 | 75.2 | 16 / 35 | 5658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 92% |
| oog.melee.Corsair 1.0 | 35 | 54% |
| ahf.NanoAndrew .4 | 15 | 80% |
| EBBU.Sim2 1.02 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 24% | 48 |
| simonton.nano.MeleeSeed 1.8 | 22 | 17% | 55 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 23 |
| ahf.NanoAndrew .4 | 14 | 11% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 13 |
| sam.Samspin 1.0 | 10 | 8% | 14 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 13 |
| EBBU.Sim2 1.02 | 6 | 5% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.2 | 138 / 210 | 1.97 | 19.9% | 33976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.9% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4.8 | 9.4% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.4% | 4 |
| fm.claire 1.7 | 6.7 | 8.0% | 4 |
| sample.SpinBot 1.0 | 8.5 | 6.6% | 2 |
| pa.Improved 1.0 | 8.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 26 / 35 | 5830 |
| 2 | 1 | 67.4 | 83.5 | 17 / 35 | 5000 |
| 3 | 1 | 69.2 | 88.9 | 22 / 35 | 5349 |
| 4 | 1 | 68.4 | 87.0 | 19 / 35 | 5210 |
| 5 | 1 | 70.7 | 90.8 | 25 / 35 | 6157 |
| 6 | 1 | 72.2 | 94.3 | 29 / 35 | 6430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 88% |
| oog.melee.CapuletDroid 1.1 | 30 | 97% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| fm.claire 1.7 | 3 | 33% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 89 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 27 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 39 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 17 |
| winamp32.micro.MicroMacro 1.0 | 7 | 10% | 17 |
| fm.claire 1.7 | 6 | 8% | 7 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 1 | 1% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.1 | 101 / 210 | 2.52 | 19.0% | 37662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.0% | 101 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.6% | 49 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 25 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 28 |
| DBall.Anarchy 0.1 | 5.5 | 7.9% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 0 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.3 | 13 / 35 | 6015 |
| 2 | 1 | 68.8 | 81.6 | 15 / 35 | 6267 |
| 3 | 1 | 68.1 | 78.1 | 16 / 35 | 6144 |
| 4 | 1 | 70.3 | 86.7 | 23 / 35 | 6432 |
| 5 | 1 | 68.7 | 85.4 | 15 / 35 | 6103 |
| 6 | 1 | 70.4 | 86.7 | 19 / 35 | 6701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 92% |
| mz.MicroGodMelee 1 | 32 | 63% |
| gh.micro.Gruweltje 0.7 | 29 | 59% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 43 | 39% | 62 |
| mz.MicroGodMelee 1 | 30 | 28% | 54 |
| spinnercat.micro.Tyger 0.1 | 17 | 16% | 57 |
| acogdev.alpha 0.2 | 9 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 9 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.8 | 97 / 210 | 3.45 | 16.7% | 31874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.3 | 16.7% | 97 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 53 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.5% | 5 |
| germ.TheMind .2 | 5.0 | 9.1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 6 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.2% | 10 |
| awesomeness.Elite 1.0 | 7.0 | 8.3% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 61.9 | 12 / 35 | 4494 |
| 2 | 2 | 61.8 | 65.7 | 10 / 35 | 4702 |
| 3 | 1 | 69.5 | 86.0 | 23 / 35 | 5719 |
| 4 | 1 | 67.3 | 77.8 | 17 / 35 | 5897 |
| 5 | 1 | 66.6 | 75.9 | 17 / 35 | 5884 |
| 6 | 1 | 64.8 | 69.5 | 18 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 87% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| sample.Crazy 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 50% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 5 | 80% |
| germ.TheMind .2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 38% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 23% | 42 |
| awesomeness.Elite 1.0 | 11 | 10% | 20 |
| germ.TheMind .2 | 10 | 9% | 15 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.5 | 159 / 210 | 1.95 | 20.7% | 33709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.7% | 159 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 8 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.2% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.4% | 1 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 2 |
| stelo.PatternRobot 1.0 | 7.7 | 7.7% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 7.2% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.9 | 26 / 35 | 5350 |
| 2 | 1 | 71.2 | 89.8 | 26 / 35 | 5721 |
| 3 | 1 | 71.9 | 91.4 | 27 / 35 | 5801 |
| 4 | 1 | 70.9 | 86.7 | 25 / 35 | 5606 |
| 5 | 1 | 71.5 | 90.5 | 27 / 35 | 5766 |
| 6 | 1 | 71.2 | 90.5 | 28 / 35 | 5465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 93% |
| nz.jdc.nano.GridFu 1.0 | 35 | 97% |
| maribo.IotaCT 1.1 | 17 | 100% |
| timmit.nano.TimDog 0.33 | 13 | 69% |
| stelo.PatternRobot 1.0 | 12 | 100% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 12 | 24% | 25 |
| rz.HawkOnFire 0.1 | 10 | 20% | 68 |
| nz.jdc.nano.GridFu 1.0 | 9 | 18% | 48 |
| stelo.PatternRobot 1.0 | 7 | 14% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 11 |
| maribo.IotaCT 1.1 | 4 | 8% | 23 |
| ratosh.Wesco 1.4 | 4 | 8% | 14 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.1 | 160 / 210 | 2.07 | 21.3% | 41394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.3% | 160 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.7% | 18 |
| baal.nano.N 1.42 | 2.8 | 12.0% | 12 |
| zyx.micro.Ant 1.1 | 4.7 | 9.3% | 4 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.4% | 2 |
| sanja.First 0.1 | 6.2 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.4% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.3% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 90.2 | 29 / 35 | 7253 |
| 2 | 1 | 71.3 | 87.6 | 27 / 35 | 7257 |
| 3 | 1 | 71.2 | 89.2 | 27 / 35 | 6642 |
| 4 | 1 | 70.5 | 84.8 | 25 / 35 | 6534 |
| 5 | 1 | 71.8 | 91.4 | 28 / 35 | 6917 |
| 6 | 1 | 70.7 | 85.7 | 24 / 35 | 6791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 93% |
| baal.nano.N 1.42 | 40 | 85% |
| cvt.Firsty 1.0 | 26 | 88% |
| zyx.micro.Ant 1.1 | 21 | 100% |
| sanja.First 0.1 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 13 | 26% | 49 |
| tvv.nano.Polaris 1.2 | 9 | 18% | 60 |
| zyx.micro.Ant 1.1 | 6 | 12% | 33 |
| cvt.Firsty 1.0 | 6 | 12% | 21 |
| Grystrion.TrackerWO 1.0 | 6 | 12% | 8 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 6 |
| sanja.First 0.1 | 3 | 6% | 17 |
| sample.RamFire 1.0 | 2 | 4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 62.5 | 65 / 210 | 4.38 | 14.5% | 31021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.8% | 69 |
| hadur117.micro.SaorWG4 0.1 | 1.7 | 14.5% | 65 |
| cs.Wren 1.0 | 3.0 | 12.8% | 31 |
| mz.Cork 0.1 | 4.3 | 11.3% | 14 |
| js.PinBall 1.6 | 4.5 | 11.2% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 7 |
| evd.X1 0.01 | 6.8 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.9% | 6 |
| PSW.Relentless 0.1 | 9.3 | 5.2% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 60.6 | 9 / 35 | 5181 |
| 2 | 1 | 64.9 | 70.5 | 15 / 35 | 5842 |
| 3 | 2 | 61.6 | 61.9 | 9 / 35 | 5371 |
| 4 | 1 | 61.6 | 60.0 | 15 / 35 | 5143 |
| 5 | 2 | 61.4 | 62.2 | 10 / 35 | 5200 |
| 6 | 2 | 58.6 | 59.7 | 7 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 61 | 67% |
| cs.Wren 1.0 | 19 | 79% |
| mz.Cork 0.1 | 6 | 83% |
| js.PinBall 1.6 | 4 | 50% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 145 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 39% | 101 |
| cs.Wren 1.0 | 19 | 13% | 29 |
| evd.X1 0.01 | 19 | 13% | 20 |
| js.PinBall 1.6 | 16 | 11% | 18 |
| PSW.Relentless 0.1 | 11 | 8% | 10 |
| mz.Cork 0.1 | 9 | 6% | 13 |
| joe.ADinosaur 1.0 | 8 | 6% | 9 |
| jsal.Jsalbot 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.2 | 135 / 210 | 2.33 | 19.4% | 30901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.4% | 135 |
| myl.nano.Graviton 1.10 | 3.3 | 11.0% | 14 |
| ntc.Opposite 1.5 | 3.5 | 11.2% | 12 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.6% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 8 |
| pfvicm.Sobieski 7.2.3b | 6.3 | 9.2% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.2% | 7 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 7 |
| donjezza.Muncho 1.0 | 8.5 | 6.7% | 9 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 28 / 35 | 5187 |
| 2 | 1 | 68.3 | 82.9 | 21 / 35 | 5409 |
| 3 | 1 | 68.0 | 81.9 | 20 / 35 | 4989 |
| 4 | 1 | 68.3 | 86.3 | 21 / 35 | 4665 |
| 5 | 1 | 68.5 | 83.5 | 23 / 35 | 4987 |
| 6 | 1 | 69.8 | 86.7 | 22 / 35 | 5664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 92% |
| stelo.AreaTargetingBot 1.1 | 26 | 96% |
| ntc.Opposite 1.5 | 25 | 72% |
| disan.Chair 2.2.0 | 22 | 77% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| DBall.NUKE 0.1 | 11 | 91% |
| donjezza.Muncho 1.0 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 21% | 52 |
| stelo.AreaTargetingBot 1.1 | 13 | 17% | 40 |
| ntc.Opposite 1.5 | 12 | 16% | 27 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 20 |
| disan.Chair 2.2.0 | 8 | 11% | 20 |
| DBall.NUKE 0.1 | 6 | 8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 7% | 18 |
| donjezza.Muncho 1.0 | 4 | 5% | 11 |
| pbg.R2D2 1.0 | 2 | 3% | 4 |

## Melee bench: F13

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.7 | 79 / 210 | 3.54 | 15.8% | 27178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 15.8% | 79 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 45 |
| oog.melee.Capulet 1.2 | 2.7 | 14.0% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.5% | 23 |
| yagami.Tidus 0.11 | 5.0 | 12.2% | 5 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 9 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 67.3 | 10 / 35 | 4414 |
| 2 | 1 | 64.2 | 71.7 | 12 / 35 | 4334 |
| 3 | 1 | 62.7 | 66.0 | 14 / 35 | 4269 |
| 4 | 1 | 68.7 | 81.9 | 20 / 35 | 5051 |
| 5 | 1 | 63.4 | 67.6 | 11 / 35 | 4707 |
| 6 | 1 | 65.4 | 75.9 | 12 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 47% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 88% |
| kawigi.micro.Shiz 1.1 | 25 | 76% |
| yagami.Tidus 0.11 | 19 | 95% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 132 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 37% | 67 |
| kawigi.micro.Shiz 1.1 | 20 | 15% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 46 |
| ejb.Polaris 1.0.1 | 14 | 11% | 22 |
| yagami.Tidus 0.11 | 12 | 9% | 24 |
| stelo.MirrorNano 1.3 | 8 | 6% | 9 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.9 | 129 / 210 | 2.54 | 18.1% | 27989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 18.1% | 129 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 23 |
| ratosh.Nobo 0.21 | 3.3 | 11.7% | 18 |
| wee.Gem 1.8.4 | 4.0 | 11.3% | 16 |
| wompi.Quokka 1.6 | 4.2 | 11.0% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.2 | 23 / 35 | 4443 |
| 2 | 1 | 67.5 | 84.8 | 20 / 35 | 4758 |
| 3 | 1 | 69.1 | 87.3 | 26 / 35 | 4959 |
| 4 | 1 | 63.1 | 72.7 | 13 / 35 | 4236 |
| 5 | 1 | 69.1 | 87.9 | 26 / 35 | 4887 |
| 6 | 1 | 66.7 | 81.3 | 21 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 95% |
| ratosh.Nobo 0.21 | 24 | 79% |
| wee.Gem 1.8.4 | 23 | 96% |
| wompi.Quokka 1.6 | 21 | 90% |
| m3thos.Eva00 1.1 | 10 | 70% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 22% | 66 |
| ratosh.Nobo 0.21 | 16 | 20% | 36 |
| wompi.Quokka 1.6 | 13 | 16% | 23 |
| bayen.UbaMicro 1.4 | 9 | 11% | 20 |
| maribo.FollowFire 1 | 7 | 9% | 7 |
| m3thos.Eva00 1.1 | 6 | 7% | 12 |
| wee.Gem 1.8.4 | 5 | 6% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 8 |

## Melee bench: F15

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 85.1 | 111 / 210 | 2.34 | 21.5% | 50896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 21.5% | 111 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 70 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 21 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 1 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.2 | 8.9% | 3 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 81.9 | 12 / 35 | 8134 |
| 2 | 1 | 72.6 | 84.4 | 18 / 35 | 8256 |
| 3 | 1 | 71.3 | 79.0 | 19 / 35 | 8128 |
| 4 | 1 | 73.5 | 89.2 | 19 / 35 | 8523 |
| 5 | 1 | 73.8 | 89.5 | 20 / 35 | 8812 |
| 6 | 1 | 74.3 | 86.7 | 23 / 35 | 9043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 70% |
| mz.NanoGod 2.02 | 20 | 60% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |

Hadur died in 100 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 45% | 129 |
| mz.NanoGod 2.02 | 34 | 34% | 47 |
| exauge.GateKeeper 1.1.121g | 10 | 10% | 14 |
| stuff.Vlad 0.1 | 4 | 4% | 6 |
| stelo.PianistNano 1.2 | 4 | 4% | 4 |
| ayk.WallHugger 1.0 | 3 | 3% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.6 | 118 / 210 | 2.92 | 17.8% | 30489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 17.8% | 118 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.8% | 31 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.8% | 11 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.9% | 4 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.4% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.1 | 19 / 35 | 5258 |
| 2 | 1 | 65.6 | 75.6 | 18 / 35 | 4870 |
| 3 | 1 | 68.9 | 86.0 | 24 / 35 | 5058 |
| 4 | 1 | 65.0 | 72.1 | 18 / 35 | 4720 |
| 5 | 1 | 66.6 | 78.4 | 17 / 35 | 5341 |
| 6 | 1 | 67.8 | 81.6 | 22 / 35 | 5242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 90% |
| dummy.micro.Sparrow 2.5 | 31 | 77% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 95% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 21% | 64 |
| dummy.micro.Sparrow 2.5 | 18 | 20% | 40 |
| bvh.micro.Freya 0.3 | 16 | 17% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 13% | 13 |
| conscience.Electron 1.3g | 10 | 11% | 13 |
| dl.BetterWalls 1.0 | 9 | 10% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 3% | 30 |

## Melee bench: F17

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 80.4 | 125 / 210 | 2.77 | 20.2% | 42151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 20.2% | 125 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.4% | 27 |
| sul.Lunar 1.1 | 3.2 | 12.1% | 21 |
| supersample.SuperBoxBot 1.0 | 4.7 | 9.8% | 9 |
| dsw.StaticD 1.0 | 4.8 | 9.4% | 13 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 5 |
| sample.Corners 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 85.7 | 22 / 35 | 6966 |
| 2 | 1 | 71.2 | 81.3 | 24 / 35 | 7314 |
| 3 | 1 | 69.5 | 77.8 | 19 / 35 | 6986 |
| 4 | 1 | 69.7 | 79.4 | 20 / 35 | 6967 |
| 5 | 1 | 68.2 | 73.3 | 17 / 35 | 6490 |
| 6 | 1 | 71.7 | 84.8 | 23 / 35 | 7428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 56 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 92% |
| supersample.SuperBoxBot 1.0 | 17 | 94% |
| dsw.StaticD 1.0 | 9 | 33% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| mme.NikeEnhanced 2.0 | 3 | 67% |

Hadur died in 85 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 23 | 27% | 59 |
| supersample.SuperBoxBot 1.0 | 21 | 25% | 30 |
| dsw.StaticD 1.0 | 13 | 15% | 25 |
| sul.Lunar 1.1 | 10 | 12% | 59 |
| mme.NikeEnhanced 2.0 | 8 | 9% | 10 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 9 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 83.7 | 121 / 210 | 2.47 | 19.6% | 40877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWG4 0.1 | 1.0 | 19.6% | 121 |
| mld.Wisdom 1.0 | 2.7 | 11.9% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 12.2% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 19 |
| amz.NanoClone 1.41 | 4.7 | 10.8% | 11 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.8% | 10 |
| sample.Walls 1.0 | 7.0 | 7.7% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 2 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 85.7 | 24 / 35 | 7077 |
| 2 | 1 | 68.0 | 80.6 | 17 / 35 | 6714 |
| 3 | 1 | 68.6 | 82.2 | 20 / 35 | 6433 |
| 4 | 1 | 69.7 | 84.4 | 18 / 35 | 7148 |
| 5 | 1 | 70.5 | 87.3 | 24 / 35 | 6484 |
| 6 | 1 | 69.1 | 81.6 | 18 / 35 | 7021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 95% |
| radnor.DoctorBob 1.42 | 25 | 76% |
| mld.Wisdom 1.0 | 22 | 73% |
| amz.NanoClone 1.41 | 19 | 79% |
| jangs.ns51 1.0 | 12 | 100% |
| sample.Walls 1.0 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 27% | 37 |
| radnor.DoctorBob 1.42 | 20 | 22% | 44 |
| KiraNL.Chupacabra 0.4 | 16 | 18% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 14% | 54 |
| amz.NanoClone 1.41 | 11 | 12% | 25 |
| sample.Walls 1.0 | 4 | 4% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 8 |

