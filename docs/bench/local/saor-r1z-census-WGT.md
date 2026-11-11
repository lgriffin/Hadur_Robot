# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.2 | 150 / 210 | 1.97 | 21.7% | 44830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.7% | 150 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 17 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 20 |
| mld.Infinity 2.2 | 4.0 | 12.5% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 6 |
| GarmBox.Oranges 1.0 | 6.3 | 7.5% | 1 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 88.9 | 27 / 35 | 7729 |
| 2 | 1 | 70.3 | 82.9 | 20 / 35 | 6683 |
| 3 | 1 | 72.6 | 89.2 | 25 / 35 | 7504 |
| 4 | 1 | 73.9 | 94.0 | 26 / 35 | 8025 |
| 5 | 1 | 71.6 | 87.3 | 26 / 35 | 6786 |
| 6 | 1 | 73.9 | 93.0 | 26 / 35 | 8103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 89% |
| radnor.DoctorBob 1.42 | 37 | 81% |
| mld.Infinity 2.2 | 33 | 94% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 5 | 80% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 22 | 37% | 86 |
| radnor.DoctorBob 1.42 | 18 | 30% | 59 |
| mld.Infinity 2.2 | 9 | 15% | 42 |
| amz.NanoClone 1.41 | 7 | 12% | 13 |
| sample.Walls 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.6 | 127 / 210 | 2.11 | 19.5% | 35214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.5% | 127 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.2% | 51 |
| maribo.melee.BMV 0.1 | 3.7 | 11.0% | 0 |
| mld.DustBunny 3.8 | 4.5 | 12.4% | 19 |
| zyx.nano.Ant 1.1 | 4.8 | 8.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 7.6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.5% | 1 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.0 | 6.4% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.9 | 20 / 35 | 6129 |
| 2 | 1 | 71.4 | 93.7 | 26 / 35 | 6671 |
| 3 | 1 | 67.7 | 83.2 | 18 / 35 | 5794 |
| 4 | 1 | 70.1 | 88.3 | 23 / 35 | 5885 |
| 5 | 1 | 68.9 | 84.8 | 22 / 35 | 5317 |
| 6 | 1 | 68.7 | 87.0 | 18 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 66 | 74% |
| mld.DustBunny 3.8 | 59 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 56% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |

Hadur died in 83 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 45% | 90 |
| mld.DustBunny 3.8 | 20 | 24% | 64 |
| maribo.melee.BMV 0.1 | 9 | 11% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 13 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| zyx.nano.Ant 1.1 | 3 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 78.5 | 123 / 210 | 2.94 | 19.1% | 37269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.1% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.9% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.1% | 10 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.0% | 14 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 2 |
| sample.Fire 1.0 | 9.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 73.0 | 19 / 35 | 5792 |
| 2 | 1 | 67.9 | 75.6 | 18 / 35 | 6052 |
| 3 | 1 | 68.6 | 75.9 | 18 / 35 | 6416 |
| 4 | 1 | 71.0 | 84.8 | 26 / 35 | 6685 |
| 5 | 1 | 69.6 | 82.5 | 23 / 35 | 6143 |
| 6 | 1 | 68.7 | 79.0 | 19 / 35 | 6181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 85% |
| cb.nano.Insomnia 1.0 | 23 | 91% |
| myl.nano.KomoriNinja 1.1 | 21 | 76% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 22 | 25% | 27 |
| myl.micro.Troodon 1.10 | 19 | 22% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 16% | 31 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 28 |
| fm.mammillarias 1.3 | 6 | 7% | 14 |
| sample.Tracker 1.0 | 6 | 7% | 6 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 21 |
| sample.Fire 1.0 | 4 | 5% | 5 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 87.9 | 150 / 210 | 2.09 | 21.2% | 41607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.2% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 18 |
| tj.zombie1n 1.0.1 | 5.0 | 9.1% | 3 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 8.9% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.7% | 2 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.8% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.0 | 22 / 35 | 6546 |
| 2 | 1 | 70.9 | 88.6 | 27 / 35 | 6488 |
| 3 | 1 | 71.0 | 86.0 | 25 / 35 | 6786 |
| 4 | 1 | 71.6 | 87.9 | 26 / 35 | 7235 |
| 5 | 1 | 72.3 | 91.7 | 24 / 35 | 7349 |
| 6 | 1 | 71.5 | 87.3 | 26 / 35 | 7203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 92% |
| stelo.SoJNanoMelee 1.1 | 34 | 85% |
| tvv.micro.Antares 1.1.1 | 25 | 88% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 86% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 38% | 85 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 38 |
| tj.zombie1n 1.0.1 | 6 | 10% | 8 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 18 |
| yk.JahMicro 1.0 | 3 | 5% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.0 | 90 / 210 | 3.52 | 17.0% | 32960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.0% | 90 |
| oog.melee.Corsair 1.0 | 2.0 | 13.2% | 43 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 23 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.1% | 21 |
| EBBU.Sim2 1.02 | 6.0 | 9.8% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.2% | 12 |
| sam.Samspin 1.0 | 6.5 | 8.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.3 | 12 / 35 | 5302 |
| 2 | 1 | 65.1 | 70.8 | 16 / 35 | 5527 |
| 3 | 1 | 68.0 | 78.4 | 18 / 35 | 6097 |
| 4 | 1 | 66.2 | 75.6 | 19 / 35 | 5262 |
| 5 | 1 | 65.8 | 72.1 | 15 / 35 | 5395 |
| 6 | 1 | 63.6 | 67.0 | 10 / 35 | 5377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 54% |
| simonton.nano.MeleeSeed 1.8 | 32 | 91% |
| ahf.NanoAndrew .4 | 18 | 83% |
| EBBU.Sim2 1.02 | 11 | 91% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sam.Samspin 1.0 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 25% | 57 |
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 43 |
| EBBU.Sim2 1.02 | 18 | 15% | 27 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 22 |
| ahf.NanoAndrew .4 | 13 | 11% | 28 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 8 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 9 |
| sample.TrackFire 1.0 | 5 | 4% | 8 |
| sam.Samspin 1.0 | 3 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.6 | 121 / 210 | 2.56 | 18.9% | 34396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.9% | 121 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 39 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.7% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.6% | 10 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.6% | 5 |
| fm.claire 1.7 | 6.3 | 8.3% | 1 |
| sample.SpinBot 1.0 | 8.7 | 6.2% | 2 |
| pa.Improved 1.0 | 8.7 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 21 / 35 | 5693 |
| 2 | 1 | 67.9 | 82.9 | 19 / 35 | 5550 |
| 3 | 1 | 69.0 | 84.1 | 19 / 35 | 5961 |
| 4 | 1 | 68.0 | 83.2 | 20 / 35 | 5547 |
| 5 | 1 | 67.1 | 75.2 | 19 / 35 | 5654 |
| 6 | 1 | 69.8 | 85.4 | 23 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 82% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| gh.nano.Grofvuil 0.2 | 15 | 87% |
| arthord.NanoSatanMelee Beta | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 5 | 40% |
| fm.claire 1.7 | 5 | 80% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 34% | 88 |
| oog.melee.CapuletDroid 1.1 | 13 | 14% | 41 |
| gh.nano.Grofvuil 0.2 | 13 | 14% | 30 |
| arthord.NanoSatanMelee Beta | 13 | 14% | 18 |
| winamp32.micro.MicroMacro 1.0 | 9 | 10% | 10 |
| fm.claire 1.7 | 4 | 4% | 7 |
| sample.SpinBot 1.0 | 4 | 4% | 5 |
| kurios.DOSexe .9b | 3 | 3% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.6 | 103 / 210 | 2.57 | 18.7% | 36177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.7% | 103 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 15.0% | 34 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.3% | 34 |
| mz.MicroGodMelee 1 | 3.8 | 13.4% | 32 |
| DBall.Anarchy 0.1 | 5.0 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 6.5 | 6.9% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.7% | 5 |
| acogdev.alpha 0.2 | 8.5 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 0 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.5 | 12 / 35 | 5908 |
| 2 | 1 | 68.3 | 81.3 | 18 / 35 | 6130 |
| 3 | 1 | 64.6 | 72.7 | 15 / 35 | 4661 |
| 4 | 1 | 71.1 | 87.0 | 20 / 35 | 7112 |
| 5 | 1 | 69.2 | 86.7 | 17 / 35 | 5742 |
| 6 | 1 | 71.2 | 90.5 | 21 / 35 | 6624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 64 | 86% |
| mz.MicroGodMelee 1 | 38 | 68% |
| gh.micro.Gruweltje 0.7 | 27 | 59% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 29% | 58 |
| spinnercat.micro.Tyger 0.1 | 29 | 27% | 80 |
| gh.micro.Gruweltje 0.7 | 25 | 23% | 44 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 9 |
| DBall.Anarchy 0.1 | 5 | 5% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.1 | 117 / 210 | 3.15 | 17.7% | 32630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.7% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 24 |
| germ.TheMind .2 | 5.3 | 9.4% | 12 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.1% | 4 |
| awesomeness.Elite 1.0 | 5.5 | 8.8% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.9% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.5 | 25 / 35 | 5547 |
| 2 | 1 | 67.7 | 78.4 | 21 / 35 | 5584 |
| 3 | 1 | 66.1 | 75.6 | 20 / 35 | 5232 |
| 4 | 1 | 66.6 | 77.8 | 18 / 35 | 5498 |
| 5 | 1 | 63.6 | 67.3 | 12 / 35 | 5066 |
| 6 | 1 | 67.3 | 74.9 | 21 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| germ.TheMind .2 | 7 | 57% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 51% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 14% | 39 |
| germ.TheMind .2 | 10 | 11% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 13 |
| awesomeness.Elite 1.0 | 4 | 4% | 11 |
| mym.EdgeStalker 1.0 | 4 | 4% | 8 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.9 | 149 / 210 | 1.91 | 20.8% | 35599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.8% | 149 |
| rz.HawkOnFire 0.1 | 2.2 | 14.1% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.1% | 8 |
| maribo.IotaCT 1.1 | 4.3 | 10.2% | 6 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.1% | 13 |
| stelo.PatternRobot 1.0 | 7.0 | 8.4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 7.9% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 7.4% | 1 |
| ratosh.Wesco 1.4 | 7.8 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.1 | 26 / 35 | 6218 |
| 2 | 1 | 71.8 | 92.7 | 26 / 35 | 6090 |
| 3 | 1 | 70.3 | 86.7 | 23 / 35 | 5817 |
| 4 | 1 | 70.7 | 88.6 | 25 / 35 | 5455 |
| 5 | 1 | 70.7 | 88.3 | 22 / 35 | 5821 |
| 6 | 1 | 72.5 | 92.1 | 27 / 35 | 6198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 91 | 92% |
| nz.jdc.nano.GridFu 1.0 | 26 | 96% |
| stelo.PatternRobot 1.0 | 18 | 89% |
| timmit.nano.TimDog 0.33 | 14 | 50% |
| ratosh.Wesco 1.4 | 7 | 100% |
| maribo.IotaCT 1.1 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 25% | 87 |
| timmit.nano.TimDog 0.33 | 13 | 21% | 20 |
| stelo.PatternRobot 1.0 | 12 | 20% | 26 |
| nz.jdc.nano.GridFu 1.0 | 7 | 11% | 43 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 11% | 9 |
| ratosh.Wesco 1.4 | 4 | 7% | 9 |
| maribo.IotaCT 1.1 | 2 | 3% | 11 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.2 | 168 / 210 | 1.70 | 22.0% | 41955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.0% | 168 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.4% | 16 |
| baal.nano.N 1.42 | 2.5 | 12.3% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.3% | 3 |
| zyx.micro.Ant 1.1 | 5.3 | 8.7% | 8 |
| sanja.First 0.1 | 6.0 | 8.4% | 2 |
| cvt.Firsty 1.0 | 7.0 | 7.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 86.7 | 23 / 35 | 6866 |
| 2 | 1 | 72.6 | 92.7 | 30 / 35 | 7127 |
| 3 | 1 | 73.4 | 95.2 | 31 / 35 | 7386 |
| 4 | 1 | 71.6 | 89.8 | 28 / 35 | 6554 |
| 5 | 1 | 72.2 | 94.6 | 28 / 35 | 6961 |
| 6 | 1 | 72.2 | 94.0 | 28 / 35 | 7061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 48 | 90% |
| tvv.nano.Polaris 1.2 | 40 | 95% |
| cvt.Firsty 1.0 | 26 | 96% |
| sanja.First 0.1 | 22 | 91% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| zyx.micro.Ant 1.1 | 14 | 93% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 24% | 45 |
| tvv.nano.Polaris 1.2 | 7 | 17% | 67 |
| zyx.micro.Ant 1.1 | 6 | 14% | 27 |
| cvt.Firsty 1.0 | 5 | 12% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 13 |
| amk.Punbot.Punbot 0.01 | 4 | 10% | 7 |
| sanja.First 0.1 | 3 | 7% | 19 |
| squidM.TentalceMeleeNano 1.1 | 3 | 7% | 8 |
| sample.RamFire 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 66.9 | 75 / 210 | 3.98 | 15.5% | 33167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.7 | 14.4% | 64 |
| hadur117.micro.SaorWGT 0.1 | 1.8 | 15.5% | 75 |
| cs.Wren 1.0 | 2.8 | 12.3% | 25 |
| mz.Cork 0.1 | 4.0 | 11.4% | 13 |
| js.PinBall 1.6 | 4.7 | 11.3% | 16 |
| evd.X1 0.01 | 6.5 | 8.7% | 1 |
| joe.ADinosaur 1.0 | 6.5 | 9.3% | 9 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.3 | 18 / 35 | 6099 |
| 2 | 1 | 68.2 | 81.3 | 20 / 35 | 6336 |
| 3 | 3 | 58.0 | 53.0 | 7 / 35 | 5142 |
| 4 | 1 | 63.4 | 66.7 | 10 / 35 | 5782 |
| 5 | 1 | 61.7 | 65.1 | 11 / 35 | 5024 |
| 6 | 4 | 57.9 | 54.0 | 9 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 63% |
| cs.Wren 1.0 | 22 | 86% |
| mz.Cork 0.1 | 8 | 75% |
| jsal.Jsalbot 1.0 | 7 | 86% |
| js.PinBall 1.6 | 6 | 100% |
| evd.X1 0.01 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 62 | 46% | 97 |
| mz.Cork 0.1 | 15 | 11% | 22 |
| cs.Wren 1.0 | 13 | 10% | 27 |
| js.PinBall 1.6 | 12 | 9% | 18 |
| evd.X1 0.01 | 11 | 8% | 17 |
| joe.ADinosaur 1.0 | 9 | 7% | 12 |
| PSW.Relentless 0.1 | 8 | 6% | 9 |
| donjezza.Jezza 1.0 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.3 | 133 / 210 | 2.50 | 19.0% | 30392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 133 |
| myl.nano.Graviton 1.10 | 2.5 | 12.2% | 24 |
| ntc.Opposite 1.5 | 3.8 | 10.8% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 8.7% | 6 |
| disan.Chair 2.2.0 | 6.3 | 8.9% | 9 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.5 | 21 / 35 | 4943 |
| 2 | 1 | 68.8 | 86.7 | 22 / 35 | 5117 |
| 3 | 1 | 66.3 | 77.5 | 20 / 35 | 4737 |
| 4 | 1 | 69.5 | 86.3 | 25 / 35 | 5193 |
| 5 | 1 | 69.8 | 88.6 | 24 / 35 | 5266 |
| 6 | 1 | 67.3 | 78.1 | 21 / 35 | 5136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 90% |
| stelo.AreaTargetingBot 1.1 | 21 | 95% |
| disan.Chair 2.2.0 | 17 | 82% |
| donjezza.Muncho 1.0 | 16 | 100% |
| ntc.Opposite 1.5 | 15 | 93% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 79 of 210 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 19% | 52 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 21 |
| ntc.Opposite 1.5 | 11 | 14% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 14% | 22 |
| stelo.AreaTargetingBot 1.1 | 8 | 10% | 22 |
| disan.Chair 2.2.0 | 7 | 9% | 21 |
| DBall.NUKE 0.1 | 6 | 8% | 21 |
| pbg.R2D2 1.0 | 5 | 6% | 10 |
| donjezza.Muncho 1.0 | 3 | 4% | 11 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.1 | 81 / 210 | 3.42 | 15.9% | 26477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 14.8% | 65 |
| hadur117.micro.SaorWGT 0.1 | 1.7 | 15.9% | 81 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.1% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.5% | 22 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 7 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 66.3 | 8 / 35 | 4041 |
| 2 | 1 | 66.5 | 78.1 | 15 / 35 | 4460 |
| 3 | 1 | 67.2 | 80.6 | 14 / 35 | 4881 |
| 4 | 1 | 65.6 | 72.7 | 17 / 35 | 4571 |
| 5 | 1 | 65.4 | 73.3 | 15 / 35 | 4673 |
| 6 | 3 | 62.4 | 67.3 | 12 / 35 | 3851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 51% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 74% |
| yagami.Tidus 0.11 | 16 | 100% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 129 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 50% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 40 |
| yagami.Tidus 0.11 | 13 | 10% | 24 |
| ejb.Polaris 1.0.1 | 11 | 9% | 16 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 30 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 3 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.5 | 124 / 210 | 2.85 | 17.6% | 27845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.6% | 124 |
| bzdp.Pansy 2.1 | 2.8 | 12.5% | 19 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 21 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 14 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 13 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 12 |
| bayen.UbaMicro 1.4 | 7.0 | 8.1% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.9 | 18 / 35 | 5055 |
| 2 | 1 | 68.5 | 85.4 | 25 / 35 | 4926 |
| 3 | 1 | 65.3 | 74.9 | 21 / 35 | 4404 |
| 4 | 1 | 67.3 | 80.6 | 22 / 35 | 4536 |
| 5 | 1 | 64.1 | 73.3 | 16 / 35 | 4340 |
| 6 | 1 | 67.8 | 87.6 | 22 / 35 | 4584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 96% |
| wee.Gem 1.8.4 | 30 | 90% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 10 | 80% |
| m3thos.Eva00 1.1 | 7 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 17% | 61 |
| ratosh.Nobo 0.21 | 15 | 17% | 29 |
| wompi.Quokka 1.6 | 14 | 16% | 26 |
| wee.Gem 1.8.4 | 11 | 13% | 40 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 12 |
| maribo.FollowFire 1 | 8 | 9% | 10 |
| bayen.UbaMicro 1.4 | 6 | 7% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 87.7 | 137 / 210 | 2.10 | 22.4% | 51942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.4% | 137 |
| wompi.Wallaby 5.1 | 2.0 | 16.8% | 43 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 23 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 87.3 | 24 / 35 | 8434 |
| 2 | 1 | 74.2 | 89.8 | 25 / 35 | 8536 |
| 3 | 1 | 72.9 | 84.1 | 22 / 35 | 8392 |
| 4 | 1 | 75.2 | 95.2 | 26 / 35 | 9084 |
| 5 | 1 | 71.8 | 82.2 | 16 / 35 | 8258 |
| 6 | 1 | 74.4 | 87.6 | 24 / 35 | 9238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 118 | 86% |
| exauge.GateKeeper 1.1.121g | 13 | 77% |
| mz.NanoGod 2.02 | 13 | 69% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 40% | 137 |
| mz.NanoGod 2.02 | 25 | 34% | 40 |
| exauge.GateKeeper 1.1.121g | 7 | 10% | 13 |
| ayk.WallHugger 1.0 | 5 | 7% | 9 |
| stuff.Vlad 0.1 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.5 | 106 / 210 | 2.76 | 18.2% | 32556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.2% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 32 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.4% | 25 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.0% | 21 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 1 |
| conscience.Electron 1.3g | 7.2 | 7.5% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 6 |
| dl.BetterWalls 1.0 | 9.0 | 6.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.7 | 14 / 35 | 4893 |
| 2 | 1 | 68.7 | 85.4 | 18 / 35 | 5597 |
| 3 | 1 | 67.3 | 79.7 | 20 / 35 | 5218 |
| 4 | 1 | 68.8 | 83.5 | 19 / 35 | 6109 |
| 5 | 1 | 65.2 | 74.3 | 16 / 35 | 5162 |
| 6 | 1 | 68.3 | 81.3 | 19 / 35 | 5577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 59 | 81% |
| dummy.micro.Sparrow 2.5 | 30 | 83% |
| bvh.micro.Freya 0.3 | 20 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 23% |
| stelo.MirrorMicro 1.0 | 11 | 91% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 24% | 67 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 50 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 16% | 21 |
| bvh.micro.Freya 0.3 | 14 | 13% | 23 |
| conscience.Electron 1.3g | 9 | 9% | 10 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 22 |
| dl.BetterWalls 1.0 | 8 | 8% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 6% | 6 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 83.9 | 142 / 210 | 2.45 | 21.0% | 43781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.0% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 18 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 16 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.3% | 11 |
| mme.NikeEnhanced 2.0 | 4.7 | 10.1% | 11 |
| dsw.StaticD 1.0 | 6.2 | 8.7% | 6 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.1% | 3 |
| sample.Corners 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 87.6 | 27 / 35 | 7753 |
| 2 | 1 | 72.4 | 89.2 | 27 / 35 | 7419 |
| 3 | 1 | 72.1 | 87.0 | 23 / 35 | 7562 |
| 4 | 1 | 70.0 | 81.0 | 23 / 35 | 6784 |
| 5 | 1 | 71.8 | 83.8 | 23 / 35 | 7622 |
| 6 | 1 | 68.1 | 74.6 | 19 / 35 | 6641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 95% |
| supersample.SuperBoxBot 1.0 | 22 | 77% |
| mme.NikeEnhanced 2.0 | 16 | 69% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 35% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 20% | 52 |
| dsw.StaticD 1.0 | 10 | 14% | 25 |
| sul.Lunar 1.1 | 9 | 13% | 59 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 16 |
| sample.Corners 1.0 | 3 | 4% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.6 | 108 / 210 | 2.74 | 18.8% | 40125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.8% | 108 |
| mld.Wisdom 1.0 | 2.8 | 12.3% | 23 |
| radnor.DoctorBob 1.42 | 3.3 | 11.9% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 16 |
| amz.NanoClone 1.41 | 5.2 | 10.3% | 15 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 6 |
| sample.Walls 1.0 | 7.0 | 7.9% | 8 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 6 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 73.3 | 14 / 35 | 6673 |
| 2 | 1 | 69.9 | 84.8 | 17 / 35 | 7271 |
| 3 | 1 | 67.9 | 80.0 | 18 / 35 | 6414 |
| 4 | 1 | 69.8 | 87.0 | 19 / 35 | 6831 |
| 5 | 1 | 68.7 | 80.3 | 19 / 35 | 7050 |
| 6 | 1 | 67.1 | 78.4 | 21 / 35 | 5886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 24 | 63% |
| mld.Wisdom 1.0 | 24 | 54% |
| KiraNL.Chupacabra 0.4 | 17 | 88% |
| amz.NanoClone 1.41 | 11 | 55% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 34% | 51 |
| radnor.DoctorBob 1.42 | 20 | 20% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 49 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 24 |
| amz.NanoClone 1.41 | 10 | 10% | 16 |
| jangs.ns51 1.0 | 5 | 5% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| sample.Walls 1.0 | 1 | 1% | 10 |

