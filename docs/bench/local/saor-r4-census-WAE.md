# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 88.8 | 155 / 210 | 2.01 | 21.9% | 44782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.9% | 155 |
| mz.AntiGrav 1.0 | 2.5 | 14.4% | 23 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 19 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 9 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 0 |
| sample.Walls 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 90.5 | 27 / 35 | 7307 |
| 2 | 1 | 74.3 | 94.6 | 31 / 35 | 7520 |
| 3 | 1 | 72.3 | 85.7 | 23 / 35 | 7710 |
| 4 | 1 | 71.0 | 84.1 | 23 / 35 | 6908 |
| 5 | 1 | 72.2 | 86.7 | 25 / 35 | 7657 |
| 6 | 1 | 73.7 | 91.1 | 26 / 35 | 7680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 94% |
| radnor.DoctorBob 1.42 | 45 | 93% |
| mld.Infinity 2.2 | 41 | 98% |
| amz.NanoClone 1.41 | 5 | 80% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 42% | 67 |
| mz.AntiGrav 1.0 | 16 | 29% | 72 |
| amz.NanoClone 1.41 | 7 | 13% | 12 |
| mld.Infinity 2.2 | 5 | 9% | 42 |
| GarmBox.Oranges 1.0 | 2 | 4% | 5 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.3 | 110 / 210 | 2.77 | 18.1% | 33538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.1% | 110 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.2% | 60 |
| mld.DustBunny 3.8 | 2.7 | 14.1% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.5% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 8 |
| zyx.nano.Ant 1.1 | 7.3 | 7.2% | 1 |
| fullsail.SweetTea 1.1 | 7.5 | 6.4% | 2 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 19 / 35 | 5410 |
| 2 | 1 | 68.7 | 82.2 | 18 / 35 | 6108 |
| 3 | 1 | 66.8 | 81.9 | 16 / 35 | 5170 |
| 4 | 1 | 68.4 | 83.5 | 23 / 35 | 5342 |
| 5 | 1 | 68.4 | 83.5 | 18 / 35 | 5565 |
| 6 | 1 | 66.0 | 67.3 | 16 / 35 | 5943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 70% |
| mld.DustBunny 3.8 | 54 | 89% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 41% | 86 |
| mld.DustBunny 3.8 | 22 | 22% | 64 |
| maribo.melee.BMV 0.1 | 7 | 7% | 12 |
| zyx.nano.Ant 1.1 | 7 | 7% | 9 |
| cs.Grudge 1.0 | 6 | 6% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 8 |
| fullsail.SweetTea 1.1 | 4 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.4 | 140 / 210 | 2.40 | 20.2% | 37493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.2% | 140 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.8% | 9 |
| fm.mammillarias 1.3 | 6.3 | 8.7% | 1 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 5 |
| sample.Fire 1.0 | 9.3 | 4.8% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 76.2 | 23 / 35 | 5578 |
| 2 | 1 | 70.9 | 85.7 | 24 / 35 | 6620 |
| 3 | 1 | 70.7 | 87.0 | 23 / 35 | 6232 |
| 4 | 1 | 69.8 | 82.9 | 20 / 35 | 6154 |
| 5 | 1 | 69.5 | 82.5 | 22 / 35 | 6139 |
| 6 | 1 | 72.4 | 92.4 | 28 / 35 | 6770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 88% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 39 |
| myl.micro.Troodon 1.10 | 15 | 21% | 67 |
| cb.nano.Insomnia 1.0 | 14 | 20% | 23 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 30 |
| fm.mammillarias 1.3 | 7 | 10% | 13 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 17 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 11 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.8 | 158 / 210 | 1.91 | 21.7% | 42452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.7% | 158 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 10 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 0 |
| yk.JahMicro 1.0 | 6.5 | 7.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 3 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.2 | 26 / 35 | 6712 |
| 2 | 1 | 72.4 | 92.7 | 30 / 35 | 6881 |
| 3 | 1 | 72.2 | 91.1 | 24 / 35 | 7457 |
| 4 | 1 | 72.1 | 93.7 | 27 / 35 | 6934 |
| 5 | 1 | 71.4 | 88.3 | 24 / 35 | 7359 |
| 6 | 1 | 71.8 | 90.2 | 27 / 35 | 7109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 88% |
| stelo.SoJNanoMelee 1.1 | 37 | 97% |
| tj.zombie1n 1.0.1 | 21 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 80% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| yk.JahMicro 1.0 | 12 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 45% | 79 |
| stelo.SoJNanoMelee 1.1 | 7 | 13% | 28 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 19 |
| tj.zombie1n 1.0.1 | 5 | 9% | 13 |
| yk.JahMicro 1.0 | 2 | 4% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 65.9 | 90 / 210 | 4.07 | 15.8% | 30736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 15.8% | 90 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 40 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.1% | 17 |
| EBBU.Sim2 1.02 | 5.8 | 10.0% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 9 |
| sam.Samspin 1.0 | 6.5 | 9.2% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 63.5 | 17 / 35 | 4961 |
| 2 | 1 | 63.8 | 66.3 | 14 / 35 | 5157 |
| 3 | 1 | 65.0 | 70.2 | 17 / 35 | 5281 |
| 4 | 1 | 62.9 | 64.4 | 13 / 35 | 5202 |
| 5 | 1 | 63.6 | 66.3 | 16 / 35 | 5021 |
| 6 | 1 | 63.1 | 64.4 | 13 / 35 | 5114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 91% |
| ahf.NanoAndrew .4 | 26 | 81% |
| oog.melee.Corsair 1.0 | 26 | 58% |
| EBBU.Sim2 1.02 | 10 | 90% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sam.Samspin 1.0 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 361. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 22% | 55 |
| oog.melee.Corsair 1.0 | 24 | 20% | 41 |
| robar.nano.Assertive_Melee 0.2 | 23 | 19% | 26 |
| ahf.NanoAndrew .4 | 11 | 9% | 39 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 10 |
| EBBU.Sim2 1.02 | 7 | 6% | 12 |
| sam.Samspin 1.0 | 5 | 4% | 8 |
| sample.TrackFire 1.0 | 5 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 146 / 210 | 2.12 | 19.7% | 34227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.7% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 9 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.0% | 5 |
| fm.claire 1.7 | 5.7 | 8.6% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 3 |
| pa.Improved 1.0 | 8.8 | 6.3% | 1 |
| kurios.DOSexe .9b | 8.8 | 5.9% | 2 |
| sample.SpinBot 1.0 | 9.3 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.3 | 25 / 35 | 5709 |
| 2 | 1 | 71.2 | 93.3 | 29 / 35 | 5865 |
| 3 | 1 | 68.2 | 82.5 | 20 / 35 | 5528 |
| 4 | 1 | 68.2 | 82.2 | 21 / 35 | 5801 |
| 5 | 1 | 69.5 | 92.1 | 25 / 35 | 5281 |
| 6 | 1 | 70.1 | 87.6 | 26 / 35 | 6043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 89% |
| oog.melee.CapuletDroid 1.1 | 25 | 92% |
| gh.nano.Grofvuil 0.2 | 24 | 100% |
| arthord.NanoSatanMelee Beta | 19 | 79% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| pa.Improved 1.0 | 7 | 86% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 64 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 34% | 79 |
| gh.nano.Grofvuil 0.2 | 11 | 17% | 34 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 39 |
| arthord.NanoSatanMelee Beta | 7 | 11% | 18 |
| kurios.DOSexe .9b | 5 | 8% | 8 |
| fm.claire 1.7 | 4 | 6% | 9 |
| pa.Improved 1.0 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 12 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 84.2 | 104 / 210 | 2.42 | 19.0% | 36800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.0% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.1% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 13.2% | 28 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.4% | 6 |
| DBall.Anarchy 0.1 | 5.5 | 8.7% | 5 |
| el.JumpShoot 0.2 | 7.3 | 6.2% | 3 |
| fire219.CatBot 1.0 | 8.2 | 5.9% | 0 |
| acogdev.alpha 0.2 | 9.2 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.6 | 20 / 35 | 6151 |
| 2 | 1 | 68.0 | 81.0 | 16 / 35 | 5928 |
| 3 | 1 | 69.2 | 82.2 | 17 / 35 | 6478 |
| 4 | 1 | 68.3 | 85.7 | 17 / 35 | 5722 |
| 5 | 1 | 68.8 | 83.2 | 17 / 35 | 5786 |
| 6 | 1 | 69.6 | 84.4 | 17 / 35 | 6735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 86% |
| mz.MicroGodMelee 1 | 46 | 63% |
| gh.micro.Gruweltje 0.7 | 31 | 58% |
| caimano.Furia_Ceca 0.22 | 8 | 63% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 38 | 36% | 59 |
| mz.MicroGodMelee 1 | 30 | 28% | 63 |
| spinnercat.micro.Tyger 0.1 | 19 | 18% | 56 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.0 | 105 / 210 | 3.52 | 16.8% | 31391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.8% | 105 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 34 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.7% | 3 |
| germ.TheMind .2 | 5.5 | 9.7% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.7 | 9.0% | 2 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 8 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.0% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.5% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 72.7 | 16 / 35 | 5279 |
| 2 | 1 | 67.1 | 78.1 | 19 / 35 | 5454 |
| 3 | 2 | 62.5 | 62.2 | 12 / 35 | 4875 |
| 4 | 1 | 68.0 | 80.3 | 23 / 35 | 5471 |
| 5 | 1 | 66.8 | 75.9 | 21 / 35 | 5460 |
| 6 | 1 | 61.7 | 62.5 | 14 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 80% |
| germ.TheMind .2 | 15 | 93% |
| awesomeness.Elite 1.0 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 41% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 43 |
| germ.TheMind .2 | 13 | 12% | 25 |
| awesomeness.Elite 1.0 | 8 | 8% | 16 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 14 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 11 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.6 | 150 / 210 | 2.12 | 20.1% | 32754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.1% | 150 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 9.9% | 8 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.4% | 6 |
| ratosh.Wesco 1.4 | 6.7 | 8.7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 3 |
| stelo.PatternRobot 1.0 | 7.2 | 8.1% | 2 |
| spinnercat.Omen 1.0 | 8.7 | 7.4% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 93.7 | 28 / 35 | 6003 |
| 2 | 1 | 69.7 | 82.5 | 23 / 35 | 5681 |
| 3 | 1 | 71.2 | 91.4 | 26 / 35 | 5408 |
| 4 | 1 | 69.9 | 86.0 | 24 / 35 | 5521 |
| 5 | 1 | 69.1 | 85.4 | 23 / 35 | 4969 |
| 6 | 1 | 70.4 | 86.3 | 26 / 35 | 5172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 93% |
| nz.jdc.nano.GridFu 1.0 | 24 | 96% |
| stelo.PatternRobot 1.0 | 21 | 95% |
| ratosh.Wesco 1.4 | 9 | 78% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| maribo.IotaCT 1.1 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 27% | 67 |
| timmit.nano.TimDog 0.33 | 11 | 18% | 21 |
| ratosh.Wesco 1.4 | 10 | 17% | 21 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 41 |
| stelo.PatternRobot 1.0 | 7 | 12% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 10 |
| maribo.IotaCT 1.1 | 3 | 5% | 18 |
| spinnercat.Omen 1.0 | 1 | 2% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 91.7 | 175 / 210 | 1.75 | 22.1% | 42179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.1% | 175 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 16 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 6 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.7% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 8.8% | 4 |
| sanja.First 0.1 | 6.7 | 8.0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 0 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 8.3 | 6.9% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 94.3 | 30 / 35 | 7848 |
| 2 | 1 | 71.9 | 91.4 | 27 / 35 | 7006 |
| 3 | 1 | 71.1 | 86.0 | 28 / 35 | 6716 |
| 4 | 1 | 72.7 | 94.3 | 31 / 35 | 7087 |
| 5 | 1 | 72.0 | 93.0 | 29 / 35 | 6699 |
| 6 | 1 | 72.0 | 91.1 | 30 / 35 | 6823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 90% |
| baal.nano.N 1.42 | 46 | 98% |
| cvt.Firsty 1.0 | 24 | 96% |
| zyx.micro.Ant 1.1 | 17 | 100% |
| sanja.First 0.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 29% | 39 |
| tvv.nano.Polaris 1.2 | 8 | 23% | 57 |
| baal.nano.N 1.42 | 5 | 14% | 44 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 18 |
| sample.RamFire 1.0 | 3 | 9% | 3 |
| cvt.Firsty 1.0 | 2 | 6% | 20 |
| sanja.First 0.1 | 2 | 6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 7 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.0 | 101 / 210 | 3.34 | 16.9% | 33323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.9% | 101 |
| kc.micro.Figment 1.0 | 1.8 | 14.7% | 50 |
| cs.Wren 1.0 | 3.3 | 12.4% | 18 |
| js.PinBall 1.6 | 4.0 | 11.6% | 10 |
| mz.Cork 0.1 | 4.8 | 10.7% | 21 |
| joe.ADinosaur 1.0 | 5.8 | 9.0% | 4 |
| evd.X1 0.01 | 7.0 | 7.4% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 60.3 | 11 / 35 | 4869 |
| 2 | 1 | 62.5 | 64.8 | 13 / 35 | 5415 |
| 3 | 1 | 69.3 | 85.4 | 20 / 35 | 6498 |
| 4 | 1 | 63.6 | 69.8 | 13 / 35 | 5217 |
| 5 | 1 | 68.7 | 83.2 | 24 / 35 | 5941 |
| 6 | 1 | 67.5 | 80.6 | 20 / 35 | 5383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 74% |
| cs.Wren 1.0 | 24 | 79% |
| js.PinBall 1.6 | 13 | 92% |
| donjezza.Jezza 1.0 | 7 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| mz.Cork 0.1 | 5 | 60% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 39% | 99 |
| cs.Wren 1.0 | 17 | 15% | 36 |
| js.PinBall 1.6 | 12 | 11% | 21 |
| joe.ADinosaur 1.0 | 12 | 11% | 17 |
| mz.Cork 0.1 | 9 | 8% | 13 |
| evd.X1 0.01 | 9 | 8% | 9 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 6 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.1 | 124 / 210 | 2.61 | 18.9% | 31245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.9% | 124 |
| ntc.Opposite 1.5 | 3.0 | 11.8% | 16 |
| myl.nano.Graviton 1.10 | 3.3 | 11.0% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.3% | 3 |
| disan.Chair 2.2.0 | 6.5 | 8.9% | 7 |
| DBall.NUKE 0.1 | 7.8 | 7.5% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.9 | 20 / 35 | 5251 |
| 2 | 1 | 68.1 | 81.6 | 21 / 35 | 5129 |
| 3 | 1 | 66.6 | 75.9 | 19 / 35 | 5173 |
| 4 | 1 | 69.9 | 87.3 | 23 / 35 | 5535 |
| 5 | 1 | 67.6 | 82.2 | 21 / 35 | 4679 |
| 6 | 1 | 68.4 | 82.5 | 20 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 28 | 89% |
| disan.Chair 2.2.0 | 28 | 89% |
| stelo.AreaTargetingBot 1.1 | 27 | 78% |
| ntc.Opposite 1.5 | 26 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| donjezza.Muncho 1.0 | 8 | 100% |
| DBall.NUKE 0.1 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 23% | 47 |
| ntc.Opposite 1.5 | 16 | 18% | 29 |
| pfvicm.Sobieski 7.2.3b | 14 | 16% | 16 |
| myl.nano.Graviton 1.10 | 13 | 15% | 38 |
| disan.Chair 2.2.0 | 10 | 11% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 30 |
| DBall.NUKE 0.1 | 4 | 5% | 6 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 72.5 | 86 / 210 | 3.48 | 15.9% | 26892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 15.9% | 86 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 38 |
| oog.melee.Capulet 1.2 | 3.2 | 13.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.5% | 22 |
| yagami.Tidus 0.11 | 4.8 | 12.1% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.3 | 14 / 35 | 4324 |
| 2 | 1 | 64.3 | 67.9 | 11 / 35 | 4844 |
| 3 | 1 | 66.8 | 82.5 | 12 / 35 | 4557 |
| 4 | 1 | 63.9 | 69.5 | 16 / 35 | 4183 |
| 5 | 1 | 64.1 | 71.1 | 16 / 35 | 4063 |
| 6 | 1 | 66.6 | 75.6 | 17 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 77% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 10 | 80% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 40% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 41 |
| kawigi.micro.Shiz 1.1 | 18 | 15% | 41 |
| yagami.Tidus 0.11 | 15 | 12% | 27 |
| ejb.Polaris 1.0.1 | 8 | 6% | 19 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 5 | 4% | 3 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.9 | 132 / 210 | 2.63 | 18.2% | 29142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.2% | 132 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 15 |
| wee.Gem 1.8.4 | 3.8 | 11.7% | 28 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 12 |
| ratosh.Nobo 0.21 | 4.2 | 11.3% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.5 | 22 / 35 | 4907 |
| 2 | 1 | 67.2 | 79.4 | 24 / 35 | 4874 |
| 3 | 1 | 67.8 | 84.8 | 23 / 35 | 4583 |
| 4 | 1 | 68.2 | 81.6 | 23 / 35 | 5259 |
| 5 | 1 | 68.5 | 88.6 | 21 / 35 | 5037 |
| 6 | 1 | 66.3 | 79.7 | 19 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 96% |
| wee.Gem 1.8.4 | 24 | 92% |
| ratosh.Nobo 0.21 | 21 | 86% |
| wompi.Quokka 1.6 | 17 | 100% |
| m3thos.Eva00 1.1 | 13 | 92% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 68 |
| ratosh.Nobo 0.21 | 13 | 17% | 28 |
| wompi.Quokka 1.6 | 11 | 14% | 26 |
| wee.Gem 1.8.4 | 9 | 12% | 39 |
| m3thos.Eva00 1.1 | 7 | 9% | 17 |
| bayen.UbaMicro 1.4 | 7 | 9% | 10 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 10 |
| maribo.FollowFire 1 | 7 | 9% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.1 | 90.0 | 139 / 210 | 1.90 | 22.7% | 52017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 22.7% | 139 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 47 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 18 |
| ayk.WallHugger 1.0 | 4.7 | 9.1% | 1 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.1% | 3 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 91.1 | 23 / 35 | 8596 |
| 2 | 1 | 72.2 | 82.2 | 19 / 35 | 8455 |
| 3 | 1 | 74.3 | 91.4 | 24 / 35 | 8764 |
| 4 | 1 | 75.1 | 94.6 | 26 / 35 | 8958 |
| 5 | 1 | 73.5 | 88.3 | 23 / 35 | 8277 |
| 6 | 1 | 75.0 | 92.4 | 24 / 35 | 8967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 84% |
| mz.NanoGod 2.02 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 56% | 149 |
| mz.NanoGod 2.02 | 20 | 28% | 34 |
| exauge.GateKeeper 1.1.121g | 4 | 6% | 8 |
| stelo.PianistNano 1.2 | 4 | 6% | 7 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| ayk.WallHugger 1.0 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.9 | 110 / 210 | 3.17 | 17.2% | 30187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.2% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 21 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 22 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.2% | 22 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.7% | 12 |
| conscience.Electron 1.3g | 7.2 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.0% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.0 | 17 / 35 | 4989 |
| 2 | 1 | 67.3 | 81.6 | 19 / 35 | 5064 |
| 3 | 1 | 65.4 | 72.4 | 16 / 35 | 5590 |
| 4 | 1 | 64.4 | 72.4 | 17 / 35 | 4607 |
| 5 | 1 | 66.6 | 79.7 | 19 / 35 | 4928 |
| 6 | 1 | 66.2 | 75.2 | 22 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 56 | 95% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 63% |
| bvh.micro.Freya 0.3 | 14 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 74 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 18% | 37 |
| dummy.micro.Sparrow 2.5 | 18 | 18% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 13 |
| bvh.micro.Freya 0.3 | 10 | 10% | 16 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| conscience.Electron 1.3g | 7 | 7% | 8 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 86.0 | 139 / 210 | 2.26 | 21.4% | 44323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.4% | 139 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 22 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 17 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 11 |
| dsw.StaticD 1.0 | 5.3 | 9.2% | 15 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.4% | 2 |
| sample.Corners 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.0 | 22 / 35 | 6832 |
| 2 | 1 | 72.2 | 87.9 | 22 / 35 | 7390 |
| 3 | 1 | 71.5 | 85.7 | 20 / 35 | 7680 |
| 4 | 1 | 72.8 | 87.3 | 29 / 35 | 7803 |
| 5 | 1 | 72.4 | 89.8 | 25 / 35 | 7481 |
| 6 | 1 | 71.3 | 84.4 | 21 / 35 | 7137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 89% |
| sul.Lunar 1.1 | 44 | 100% |
| supersample.SuperBoxBot 1.0 | 29 | 86% |
| dsw.StaticD 1.0 | 17 | 35% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 19 | 26% | 59 |
| supersample.SuperBoxBot 1.0 | 18 | 25% | 37 |
| dsw.StaticD 1.0 | 17 | 24% | 26 |
| sul.Lunar 1.1 | 5 | 7% | 52 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 7 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 13 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 8 |
| sample.Corners 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.9 | 119 / 210 | 2.45 | 19.8% | 42101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.8% | 119 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 30 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 9.9% | 16 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 6 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 12 |
| sample.Walls 1.0 | 7.2 | 7.5% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 87.0 | 20 / 35 | 7051 |
| 2 | 1 | 69.9 | 86.0 | 19 / 35 | 7090 |
| 3 | 1 | 70.9 | 87.0 | 23 / 35 | 7275 |
| 4 | 1 | 68.7 | 78.1 | 18 / 35 | 6944 |
| 5 | 1 | 69.6 | 79.7 | 21 / 35 | 7203 |
| 6 | 1 | 69.4 | 85.7 | 18 / 35 | 6538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 76% |
| mld.Wisdom 1.0 | 30 | 63% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 89% |
| sample.Walls 1.0 | 13 | 92% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| amz.NanoClone 1.41 | 11 | 73% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 28% | 49 |
| radnor.DoctorBob 1.42 | 20 | 21% | 60 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 19% | 41 |
| amz.NanoClone 1.41 | 12 | 13% | 18 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 23 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

