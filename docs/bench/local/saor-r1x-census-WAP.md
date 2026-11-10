# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 91.3 | 163 / 210 | 1.79 | 22.2% | 43835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 22.2% | 163 |
| mz.AntiGrav 1.0 | 2.5 | 14.6% | 11 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.1% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| sample.Walls 1.0 | 7.0 | 6.2% | 1 |
| jangs.ns51 1.0 | 7.3 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 89.2 | 27 / 35 | 6897 |
| 2 | 1 | 73.8 | 91.7 | 26 / 35 | 7891 |
| 3 | 1 | 73.0 | 89.8 | 26 / 35 | 7292 |
| 4 | 1 | 74.1 | 93.7 | 29 / 35 | 7761 |
| 5 | 1 | 73.2 | 94.0 | 27 / 35 | 6921 |
| 6 | 1 | 72.6 | 89.2 | 28 / 35 | 7073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 99 | 94% |
| radnor.DoctorBob 1.42 | 36 | 92% |
| mld.Infinity 2.2 | 26 | 92% |
| amz.NanoClone 1.41 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 38% | 55 |
| mz.AntiGrav 1.0 | 17 | 35% | 97 |
| mld.Infinity 2.2 | 7 | 15% | 39 |
| jangs.ns51 1.0 | 2 | 4% | 5 |
| amz.NanoClone 1.41 | 2 | 4% | 4 |
| GarmBox.Oranges 1.0 | 2 | 4% | 2 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.4 | 134 / 210 | 2.22 | 18.9% | 31023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.9% | 134 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 48 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 18 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 3 |
| zyx.nano.Ant 1.1 | 6.5 | 8.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.1% | 6 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 0 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 28 / 35 | 5014 |
| 2 | 1 | 68.9 | 87.6 | 21 / 35 | 5135 |
| 3 | 1 | 64.1 | 67.0 | 11 / 35 | 5300 |
| 4 | 1 | 68.9 | 87.9 | 27 / 35 | 4926 |
| 5 | 1 | 69.1 | 88.9 | 20 / 35 | 5437 |
| 6 | 1 | 70.6 | 96.2 | 27 / 35 | 5211 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 74 | 91% |
| oog.melee.Mercutio 1.0 | 50 | 72% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 35% | 83 |
| oog.melee.Mercutio 1.0 | 22 | 29% | 69 |
| cs.Grudge 1.0 | 6 | 8% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 19 |
| zyx.nano.Ant 1.1 | 5 | 6% | 7 |
| maribo.melee.BMV 0.1 | 4 | 5% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 7 |
| fullsail.SweetTea 1.1 | 2 | 3% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 81.6 | 122 / 210 | 2.65 | 19.4% | 35576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.4% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 16 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.8% | 13 |
| fm.mammillarias 1.3 | 6.0 | 8.7% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 4 |
| sample.Fire 1.0 | 9.0 | 5.2% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.1 | 21 / 35 | 6408 |
| 2 | 1 | 68.5 | 79.7 | 21 / 35 | 5638 |
| 3 | 1 | 68.1 | 78.1 | 21 / 35 | 5674 |
| 4 | 1 | 68.7 | 81.6 | 17 / 35 | 5854 |
| 5 | 1 | 69.9 | 80.6 | 23 / 35 | 6134 |
| 6 | 1 | 70.0 | 85.7 | 19 / 35 | 5868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 84% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| myl.nano.KomoriNinja 1.1 | 17 | 100% |
| fm.mammillarias 1.3 | 6 | 83% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 24% | 42 |
| myl.micro.Troodon 1.10 | 18 | 20% | 69 |
| cb.nano.Insomnia 1.0 | 15 | 17% | 20 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 32 |
| fm.mammillarias 1.3 | 7 | 8% | 11 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 13 |
| sample.Tracker 1.0 | 5 | 6% | 6 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| sample.Fire 1.0 | 4 | 5% | 7 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.9 | 157 / 210 | 2.18 | 20.2% | 36115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.2% | 157 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 21 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.2% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 5.7 | 9.0% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 1 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.5 | 21 / 35 | 5467 |
| 2 | 1 | 70.4 | 85.1 | 25 / 35 | 6533 |
| 3 | 1 | 71.1 | 90.2 | 29 / 35 | 6191 |
| 4 | 1 | 70.8 | 89.5 | 28 / 35 | 6129 |
| 5 | 1 | 69.7 | 86.3 | 26 / 35 | 5693 |
| 6 | 1 | 70.3 | 87.0 | 28 / 35 | 6102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 88% |
| stelo.SoJNanoMelee 1.1 | 39 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 100% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 49% | 95 |
| stelo.SoJNanoMelee 1.1 | 9 | 17% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 24 |
| tj.zombie1n 1.0.1 | 4 | 8% | 6 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 26 |
| yk.JahMicro 1.0 | 3 | 6% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 4 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 95 / 210 | 3.55 | 16.3% | 28761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.3% | 95 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 40 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 18 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 14 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.7% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.4% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 63.5 | 16 / 35 | 4706 |
| 2 | 1 | 62.0 | 67.6 | 11 / 35 | 4319 |
| 3 | 1 | 68.5 | 83.8 | 22 / 35 | 5403 |
| 4 | 1 | 63.5 | 70.2 | 15 / 35 | 4791 |
| 5 | 1 | 64.8 | 74.9 | 14 / 35 | 4693 |
| 6 | 1 | 64.6 | 69.8 | 17 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 90% |
| oog.melee.Corsair 1.0 | 35 | 57% |
| ahf.NanoAndrew .4 | 19 | 74% |
| sam.Samspin 1.0 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| EBBU.Sim2 1.02 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |

Hadur died in 115 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 22% | 45 |
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 54 |
| ahf.NanoAndrew .4 | 16 | 14% | 28 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 23 |
| sam.Samspin 1.0 | 13 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 8 |
| EBBU.Sim2 1.02 | 4 | 3% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 136 / 210 | 2.18 | 19.0% | 30380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.0% | 136 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 38 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.2% | 5 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 2 |
| fm.claire 1.7 | 6.5 | 8.3% | 0 |
| sample.SpinBot 1.0 | 8.3 | 6.5% | 0 |
| pa.Improved 1.0 | 8.8 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 26 / 35 | 5599 |
| 2 | 1 | 67.6 | 83.5 | 22 / 35 | 4858 |
| 3 | 1 | 69.0 | 88.3 | 24 / 35 | 4986 |
| 4 | 1 | 68.8 | 87.0 | 23 / 35 | 5216 |
| 5 | 1 | 67.4 | 86.0 | 19 / 35 | 4657 |
| 6 | 1 | 68.3 | 84.4 | 22 / 35 | 5064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 78% |
| oog.melee.CapuletDroid 1.1 | 28 | 96% |
| gh.nano.Grofvuil 0.2 | 22 | 91% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 74 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 51% | 93 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 25 |
| oog.melee.CapuletDroid 1.1 | 6 | 8% | 38 |
| fm.claire 1.7 | 6 | 8% | 9 |
| kurios.DOSexe .9b | 4 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 16 |
| arthord.NanoSatanMelee Beta | 3 | 4% | 13 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.2 | 113 / 210 | 2.33 | 19.0% | 34911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.0% | 113 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 37 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 20 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 1 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 5 |
| acogdev.alpha 0.2 | 8.0 | 5.9% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.5% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 18 / 35 | 6055 |
| 2 | 1 | 68.1 | 84.1 | 18 / 35 | 5269 |
| 3 | 1 | 70.0 | 88.6 | 18 / 35 | 6155 |
| 4 | 1 | 69.0 | 82.2 | 18 / 35 | 6438 |
| 5 | 1 | 68.5 | 86.0 | 19 / 35 | 5410 |
| 6 | 1 | 68.9 | 84.8 | 22 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 81% |
| mz.MicroGodMelee 1 | 39 | 87% |
| gh.micro.Gruweltje 0.7 | 31 | 61% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 33% | 71 |
| gh.micro.Gruweltje 0.7 | 30 | 31% | 61 |
| mz.MicroGodMelee 1 | 15 | 15% | 48 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 6 |
| acogdev.alpha 0.2 | 5 | 5% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.0 | 95 / 210 | 3.61 | 16.2% | 29316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.5 | 16.2% | 95 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.6% | 52 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.1% | 26 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 9 |
| awesomeness.Elite 1.0 | 5.8 | 9.1% | 13 |
| germ.TheMind .2 | 6.0 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.6% | 8 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.1 | 18 / 35 | 5395 |
| 2 | 1 | 66.2 | 76.8 | 18 / 35 | 5086 |
| 3 | 1 | 68.5 | 84.4 | 23 / 35 | 5288 |
| 4 | 1 | 64.6 | 70.2 | 17 / 35 | 4813 |
| 5 | 2 | 61.2 | 61.9 | 10 / 35 | 4583 |
| 6 | 3 | 58.1 | 55.2 | 9 / 35 | 4151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 100% |
| germ.TheMind .2 | 9 | 78% |
| awesomeness.Elite 1.0 | 7 | 29% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 49% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 13% | 27 |
| germ.TheMind .2 | 14 | 12% | 22 |
| qualidafial.MajorDick 1.0.1 | 10 | 9% | 15 |
| awesomeness.Elite 1.0 | 8 | 7% | 12 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 8 |
| sample.Crazy 1.0 | 2 | 2% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.7 | 164 / 210 | 1.93 | 20.3% | 30922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.3% | 164 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.7% | 10 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 7.7 | 7.7% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 28 / 35 | 5256 |
| 2 | 1 | 68.9 | 84.1 | 25 / 35 | 4845 |
| 3 | 1 | 70.5 | 92.4 | 28 / 35 | 4676 |
| 4 | 1 | 71.8 | 93.7 | 29 / 35 | 5278 |
| 5 | 1 | 71.6 | 91.4 | 28 / 35 | 5413 |
| 6 | 1 | 70.6 | 84.1 | 26 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 90 | 96% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| timmit.nano.TimDog 0.33 | 16 | 75% |
| ratosh.Wesco 1.4 | 5 | 100% |
| maribo.IotaCT 1.1 | 5 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 24% | 66 |
| timmit.nano.TimDog 0.33 | 7 | 15% | 21 |
| stelo.PatternRobot 1.0 | 6 | 13% | 16 |
| ratosh.Wesco 1.4 | 6 | 13% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 13% | 7 |
| nz.jdc.nano.GridFu 1.0 | 4 | 9% | 51 |
| maribo.IotaCT 1.1 | 4 | 9% | 21 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.8 | 182 / 210 | 1.47 | 22.1% | 39153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 22.1% | 182 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.5% | 8 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 7 |
| Grystrion.TrackerWO 1.0 | 3.7 | 10.5% | 0 |
| zyx.micro.Ant 1.1 | 5.0 | 9.3% | 4 |
| sanja.First 0.1 | 6.5 | 8.6% | 0 |
| cvt.Firsty 1.0 | 7.2 | 7.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.7 | 6.6% | 6 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 27 / 35 | 6335 |
| 2 | 1 | 73.4 | 98.7 | 33 / 35 | 6834 |
| 3 | 1 | 73.4 | 97.8 | 32 / 35 | 7154 |
| 4 | 1 | 71.6 | 93.7 | 31 / 35 | 6006 |
| 5 | 1 | 72.0 | 95.9 | 29 / 35 | 6484 |
| 6 | 1 | 72.0 | 94.9 | 30 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 91% |
| baal.nano.N 1.42 | 39 | 97% |
| cvt.Firsty 1.0 | 30 | 97% |
| sanja.First 0.1 | 23 | 100% |
| zyx.micro.Ant 1.1 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 16 | 88% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 39% | 40 |
| tvv.nano.Polaris 1.2 | 5 | 18% | 57 |
| baal.nano.N 1.42 | 3 | 11% | 44 |
| cvt.Firsty 1.0 | 2 | 7% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 4 |
| sample.RamFire 1.0 | 2 | 7% | 2 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 4% | 11 |
| sanja.First 0.1 | 0 | 0% | 22 |

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 66.9 | 84 / 210 | 3.98 | 15.0% | 29307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 15.0% | 84 |
| kc.micro.Figment 1.0 | 2.3 | 13.8% | 56 |
| cs.Wren 1.0 | 2.5 | 13.2% | 31 |
| mz.Cork 0.1 | 4.3 | 11.4% | 16 |
| js.PinBall 1.6 | 4.7 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 4 |
| evd.X1 0.01 | 6.8 | 8.7% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.8% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 58.4 | 12 / 35 | 4190 |
| 2 | 1 | 65.3 | 74.6 | 17 / 35 | 5313 |
| 3 | 2 | 60.8 | 61.9 | 14 / 35 | 4854 |
| 4 | 1 | 64.1 | 75.2 | 14 / 35 | 4851 |
| 5 | 1 | 62.2 | 68.3 | 14 / 35 | 4896 |
| 6 | 1 | 62.7 | 63.2 | 13 / 35 | 5203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 43 | 74% |
| cs.Wren 1.0 | 28 | 82% |
| mz.Cork 0.1 | 14 | 93% |
| js.PinBall 1.6 | 9 | 78% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 39% | 86 |
| cs.Wren 1.0 | 19 | 15% | 38 |
| evd.X1 0.01 | 16 | 13% | 16 |
| js.PinBall 1.6 | 11 | 9% | 19 |
| mz.Cork 0.1 | 9 | 7% | 21 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| joe.ADinosaur 1.0 | 7 | 6% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.1 | 144 / 210 | 2.16 | 19.6% | 30058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.6% | 144 |
| myl.nano.Graviton 1.10 | 2.8 | 12.1% | 26 |
| ntc.Opposite 1.5 | 3.0 | 11.4% | 3 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.7% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 1 |
| disan.Chair 2.2.0 | 6.7 | 8.5% | 6 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 6.0% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.2 | 23 / 35 | 4646 |
| 2 | 1 | 69.0 | 86.3 | 23 / 35 | 5205 |
| 3 | 1 | 70.1 | 91.1 | 27 / 35 | 4760 |
| 4 | 1 | 68.0 | 83.2 | 22 / 35 | 4802 |
| 5 | 1 | 69.9 | 88.6 | 24 / 35 | 5294 |
| 6 | 1 | 70.2 | 90.2 | 25 / 35 | 5351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 82% |
| ntc.Opposite 1.5 | 28 | 96% |
| disan.Chair 2.2.0 | 27 | 93% |
| stelo.AreaTargetingBot 1.1 | 20 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| donjezza.Muncho 1.0 | 10 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 69 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 26% | 48 |
| stelo.AreaTargetingBot 1.1 | 18 | 26% | 39 |
| pfvicm.Sobieski 7.2.3b | 11 | 16% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 26 |
| ntc.Opposite 1.5 | 8 | 12% | 24 |
| disan.Chair 2.2.0 | 4 | 6% | 27 |
| DBall.NUKE 0.1 | 2 | 3% | 12 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.6 | 85 / 210 | 3.38 | 16.0% | 26286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.2 | 16.0% | 85 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 44 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 26 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 7 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.8 | 18 / 35 | 4417 |
| 2 | 1 | 64.1 | 71.4 | 9 / 35 | 4490 |
| 3 | 2 | 63.9 | 69.5 | 15 / 35 | 3960 |
| 4 | 1 | 67.6 | 82.2 | 17 / 35 | 4544 |
| 5 | 1 | 64.7 | 71.4 | 13 / 35 | 4546 |
| 6 | 1 | 63.5 | 70.2 | 13 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 59% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 75% |
| yagami.Tidus 0.11 | 18 | 89% |
| ejb.Polaris 1.0.1 | 8 | 63% |

Hadur died in 125 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 35% | 73 |
| yagami.Tidus 0.11 | 24 | 19% | 36 |
| kawigi.micro.Shiz 1.1 | 18 | 14% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 12% | 32 |
| ejb.Polaris 1.0.1 | 8 | 6% | 14 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.5 | 123 / 210 | 3.02 | 17.1% | 26348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.1% | 123 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 18 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 13 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 25 |
| ratosh.Nobo 0.21 | 4.2 | 11.3% | 15 |
| m3thos.Eva00 1.1 | 6.2 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 75.2 | 20 / 35 | 4318 |
| 2 | 1 | 67.6 | 82.9 | 25 / 35 | 4391 |
| 3 | 1 | 62.5 | 67.9 | 17 / 35 | 4302 |
| 4 | 1 | 67.1 | 80.6 | 21 / 35 | 4742 |
| 5 | 1 | 67.3 | 84.8 | 22 / 35 | 4464 |
| 6 | 1 | 64.2 | 73.7 | 18 / 35 | 4131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 91% |
| wompi.Quokka 1.6 | 24 | 88% |
| wee.Gem 1.8.4 | 24 | 96% |
| ratosh.Nobo 0.21 | 20 | 85% |
| m3thos.Eva00 1.1 | 16 | 81% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 18% | 56 |
| bayen.UbaMicro 1.4 | 14 | 16% | 16 |
| maribo.FollowFire 1 | 11 | 13% | 11 |
| m3thos.Eva00 1.1 | 9 | 10% | 23 |
| stelo.MyAgileRobot 0.2 | 9 | 10% | 10 |
| wompi.Quokka 1.6 | 8 | 9% | 29 |
| ratosh.Nobo 0.21 | 7 | 8% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| wee.Gem 1.8.4 | 6 | 7% | 32 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 87.2 | 133 / 210 | 2.15 | 21.3% | 46684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.3% | 133 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 17 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 6 |
| ayk.WallHugger 1.0 | 4.8 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.1% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 88.6 | 23 / 35 | 8181 |
| 2 | 1 | 71.2 | 79.7 | 19 / 35 | 7710 |
| 3 | 1 | 72.7 | 91.1 | 24 / 35 | 7190 |
| 4 | 1 | 72.7 | 88.9 | 21 / 35 | 7643 |
| 5 | 1 | 73.2 | 89.2 | 24 / 35 | 7944 |
| 6 | 1 | 72.5 | 86.0 | 22 / 35 | 8016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 84% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| mz.NanoGod 2.02 | 14 | 64% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 45% | 147 |
| mz.NanoGod 2.02 | 23 | 30% | 32 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 15 |
| ayk.WallHugger 1.0 | 5 | 6% | 7 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.3 | 108 / 210 | 3.04 | 17.3% | 28907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.3% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 26 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 24 |
| bvh.micro.Freya 0.3 | 3.8 | 11.6% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.0% | 13 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.8% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.0% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.5% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.9 | 18 / 35 | 4445 |
| 2 | 1 | 67.4 | 82.9 | 19 / 35 | 5141 |
| 3 | 1 | 62.4 | 65.1 | 15 / 35 | 4816 |
| 4 | 1 | 67.6 | 84.4 | 23 / 35 | 4730 |
| 5 | 1 | 67.9 | 82.9 | 17 / 35 | 5146 |
| 6 | 1 | 66.4 | 79.7 | 16 / 35 | 4629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 84% |
| dummy.micro.Sparrow 2.5 | 33 | 88% |
| bvh.micro.Freya 0.3 | 21 | 71% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 68% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 60 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 48 |
| bvh.micro.Freya 0.3 | 17 | 17% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 12 |
| dl.BetterWalls 1.0 | 9 | 9% | 12 |
| conscience.Electron 1.3g | 7 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 13 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 87.8 | 156 / 210 | 2.10 | 21.0% | 39243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.0% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 8 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 9 |
| dsw.StaticD 1.0 | 5.3 | 8.9% | 10 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 2 |
| sample.Corners 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.9 | 25 / 35 | 6091 |
| 2 | 1 | 72.7 | 94.3 | 29 / 35 | 6698 |
| 3 | 1 | 73.1 | 92.7 | 30 / 35 | 7331 |
| 4 | 1 | 68.7 | 77.8 | 20 / 35 | 6181 |
| 5 | 1 | 72.2 | 91.4 | 28 / 35 | 6693 |
| 6 | 1 | 70.0 | 82.5 | 24 / 35 | 6249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 65 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 95% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 16 | 63% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 13 | 24% | 61 |
| supersample.SuperBoxBot 1.0 | 13 | 24% | 29 |
| dsw.StaticD 1.0 | 10 | 19% | 24 |
| sul.Lunar 1.1 | 8 | 15% | 69 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.2 | 117 / 210 | 2.51 | 18.9% | 37408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.9% | 117 |
| radnor.DoctorBob 1.42 | 3.2 | 12.2% | 26 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.2% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 12 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 4 |
| sample.Walls 1.0 | 7.3 | 7.5% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.5 | 19 / 35 | 6579 |
| 2 | 1 | 69.8 | 87.9 | 22 / 35 | 6289 |
| 3 | 1 | 67.2 | 80.0 | 18 / 35 | 5960 |
| 4 | 1 | 66.0 | 76.5 | 17 / 35 | 5668 |
| 5 | 1 | 68.3 | 83.8 | 19 / 35 | 6241 |
| 6 | 1 | 70.5 | 88.6 | 22 / 35 | 6671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 89% |
| mld.Wisdom 1.0 | 23 | 65% |
| amz.NanoClone 1.41 | 13 | 69% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 36 | 39% | 51 |
| radnor.DoctorBob 1.42 | 19 | 20% | 48 |
| amz.NanoClone 1.41 | 13 | 14% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 12% | 45 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 22 |
| sample.Walls 1.0 | 2 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 8 |
| jangs.ns51 1.0 | 1 | 1% | 7 |

