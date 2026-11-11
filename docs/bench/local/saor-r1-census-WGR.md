# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.2 | 151 / 210 | 1.88 | 21.7% | 44027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.7% | 151 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 20 |
| radnor.DoctorBob 1.42 | 3.2 | 13.5% | 14 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 5 |
| GarmBox.Oranges 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 2 |
| sample.Walls 1.0 | 7.5 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.0 | 27 / 35 | 7202 |
| 2 | 1 | 72.3 | 89.2 | 22 / 35 | 7462 |
| 3 | 1 | 71.0 | 83.5 | 25 / 35 | 6785 |
| 4 | 1 | 72.2 | 89.2 | 22 / 35 | 7407 |
| 5 | 1 | 72.9 | 91.7 | 27 / 35 | 7047 |
| 6 | 1 | 74.4 | 94.6 | 28 / 35 | 8124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 93% |
| mld.Infinity 2.2 | 41 | 100% |
| radnor.DoctorBob 1.42 | 27 | 89% |
| amz.NanoClone 1.41 | 12 | 75% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Walls 1.0 | 3 | 67% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 34% | 57 |
| mz.AntiGrav 1.0 | 16 | 26% | 72 |
| amz.NanoClone 1.41 | 11 | 18% | 21 |
| mld.Infinity 2.2 | 8 | 13% | 40 |
| sample.Walls 1.0 | 3 | 5% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.2 | 111 / 210 | 2.87 | 17.8% | 32108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 17.8% | 111 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.1% | 62 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 17 |
| maribo.melee.BMV 0.1 | 4.7 | 9.6% | 0 |
| zyx.nano.Ant 1.1 | 4.8 | 9.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.1% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.7% | 6 |
| fullsail.SweetTea 1.1 | 7.7 | 7.1% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 82.2 | 17 / 35 | 5755 |
| 2 | 1 | 67.7 | 83.5 | 23 / 35 | 4842 |
| 3 | 1 | 67.6 | 81.3 | 20 / 35 | 5490 |
| 4 | 1 | 68.6 | 85.4 | 22 / 35 | 5618 |
| 5 | 1 | 67.0 | 81.9 | 17 / 35 | 5193 |
| 6 | 3 | 63.1 | 61.0 | 12 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 75% |
| mld.DustBunny 3.8 | 56 | 88% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 34% | 81 |
| mld.DustBunny 3.8 | 19 | 19% | 64 |
| maribo.melee.BMV 0.1 | 10 | 10% | 16 |
| zyx.nano.Ant 1.1 | 10 | 10% | 12 |
| cs.Grudge 1.0 | 10 | 10% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 10 |
| fullsail.SweetTea 1.1 | 6 | 6% | 8 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 84.2 | 129 / 210 | 2.42 | 20.3% | 39064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.3% | 129 |
| myl.micro.Troodon 1.10 | 2.2 | 14.6% | 41 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.0% | 4 |
| fm.mammillarias 1.3 | 5.0 | 9.5% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.9% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 12 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.7 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.7 | 21 / 35 | 6478 |
| 2 | 1 | 69.0 | 81.6 | 17 / 35 | 6263 |
| 3 | 1 | 70.7 | 83.5 | 23 / 35 | 6390 |
| 4 | 1 | 70.1 | 80.6 | 22 / 35 | 6473 |
| 5 | 1 | 72.8 | 92.4 | 25 / 35 | 7342 |
| 6 | 1 | 69.4 | 81.6 | 21 / 35 | 6118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 93% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 85% |
| myl.nano.KomoriNinja 1.1 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 9 | 67% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 26% | 65 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 17% | 27 |
| cb.nano.Insomnia 1.0 | 11 | 14% | 17 |
| fm.mammillarias 1.3 | 11 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 40 |
| sp.Nanos.Ember 1.1 | 8 | 10% | 18 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 11 |
| sample.Fire 1.0 | 2 | 2% | 9 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.5 | 136 / 210 | 2.57 | 19.8% | 38821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.8% | 136 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.3% | 8 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.3% | 18 |
| tj.zombie1n 1.0.1 | 4.5 | 9.7% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.6% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.5% | 8 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.5 | 26 / 35 | 6981 |
| 2 | 1 | 69.1 | 81.9 | 23 / 35 | 6092 |
| 3 | 1 | 69.9 | 83.5 | 24 / 35 | 6624 |
| 4 | 1 | 68.3 | 75.9 | 21 / 35 | 6594 |
| 5 | 1 | 67.8 | 79.0 | 17 / 35 | 6182 |
| 6 | 1 | 69.9 | 84.4 | 25 / 35 | 6348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 25 | 88% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| stelo.SoJNanoMelee 1.1 | 21 | 95% |
| tj.zombie1n 1.0.1 | 19 | 79% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 34% | 74 |
| stelo.SoJNanoMelee 1.1 | 10 | 14% | 22 |
| tvv.micro.Antares 1.1.1 | 8 | 11% | 37 |
| tj.zombie1n 1.0.1 | 8 | 11% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 9% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 8% | 27 |
| sample.VelociRobot 1.0 | 5 | 7% | 8 |
| yk.JahMicro 1.0 | 3 | 4% | 9 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.5 | 100 / 210 | 3.65 | 16.5% | 30550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.5% | 100 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 34 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 21 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.1% | 19 |
| sam.Samspin 1.0 | 5.5 | 9.6% | 11 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.6% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.4% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.1 | 17 / 35 | 4819 |
| 2 | 1 | 63.5 | 68.9 | 15 / 35 | 4719 |
| 3 | 1 | 66.4 | 74.3 | 19 / 35 | 5550 |
| 4 | 1 | 61.3 | 61.9 | 13 / 35 | 4881 |
| 5 | 1 | 63.4 | 65.7 | 13 / 35 | 5154 |
| 6 | 1 | 67.6 | 80.3 | 23 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 95% |
| oog.melee.Corsair 1.0 | 33 | 67% |
| ahf.NanoAndrew .4 | 24 | 75% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 19% | 46 |
| simonton.nano.MeleeSeed 1.8 | 18 | 16% | 48 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 16% | 21 |
| zyx.nano.BacillusComma 1.0 | 14 | 13% | 14 |
| ahf.NanoAndrew .4 | 11 | 10% | 33 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 15 |
| sam.Samspin 1.0 | 7 | 6% | 15 |
| EBBU.Sim2 1.02 | 7 | 6% | 13 |
| sample.TrackFire 1.0 | 4 | 4% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.5 | 126 / 210 | 2.21 | 19.0% | 31697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.0% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 38 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 18 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.0% | 7 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.0% | 2 |
| fm.claire 1.7 | 6.5 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 2 |
| pa.Improved 1.0 | 9.3 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.1 | 24 / 35 | 5431 |
| 2 | 1 | 69.0 | 87.9 | 23 / 35 | 5336 |
| 3 | 1 | 68.7 | 82.2 | 22 / 35 | 5866 |
| 4 | 1 | 68.8 | 89.2 | 17 / 35 | 5281 |
| 5 | 1 | 67.4 | 85.7 | 19 / 35 | 4703 |
| 6 | 1 | 68.7 | 88.9 | 21 / 35 | 5080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 77% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| gh.nano.Grofvuil 0.2 | 21 | 62% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 33% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 37% | 83 |
| gh.nano.Grofvuil 0.2 | 15 | 18% | 31 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 19 |
| fm.claire 1.7 | 8 | 10% | 10 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 42 |
| sample.SpinBot 1.0 | 4 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 8 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.4 | 112 / 210 | 2.50 | 19.0% | 36678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.0% | 112 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.3% | 32 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.6% | 26 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 0 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 18 / 35 | 6193 |
| 2 | 1 | 70.0 | 85.1 | 21 / 35 | 6603 |
| 3 | 1 | 68.2 | 79.7 | 20 / 35 | 5909 |
| 4 | 1 | 70.8 | 89.5 | 20 / 35 | 6769 |
| 5 | 1 | 67.6 | 81.6 | 17 / 35 | 5563 |
| 6 | 1 | 67.4 | 80.3 | 16 / 35 | 5641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 86% |
| mz.MicroGodMelee 1 | 40 | 73% |
| gh.micro.Gruweltje 0.7 | 25 | 64% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 30% | 72 |
| gh.micro.Gruweltje 0.7 | 26 | 27% | 54 |
| mz.MicroGodMelee 1 | 20 | 20% | 48 |
| acogdev.alpha 0.2 | 7 | 7% | 9 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 10 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 70.6 | 99 / 210 | 3.64 | 16.3% | 30305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 16.3% | 99 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 14.0% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 8 |
| germ.TheMind .2 | 5.0 | 9.7% | 8 |
| awesomeness.Elite 1.0 | 6.2 | 8.9% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 66.7 | 18 / 35 | 4833 |
| 2 | 2 | 63.6 | 69.8 | 14 / 35 | 4777 |
| 3 | 1 | 67.1 | 74.6 | 19 / 35 | 5922 |
| 4 | 1 | 64.7 | 70.5 | 16 / 35 | 4981 |
| 5 | 2 | 62.9 | 67.6 | 14 / 35 | 4596 |
| 6 | 1 | 65.9 | 74.6 | 18 / 35 | 5196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| germ.TheMind .2 | 12 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 42% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 25% | 47 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 11 |
| germ.TheMind .2 | 6 | 5% | 14 |
| awesomeness.Elite 1.0 | 5 | 4% | 14 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 6 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.3 | 151 / 210 | 1.97 | 20.1% | 31728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.1% | 151 |
| rz.HawkOnFire 0.1 | 2.2 | 13.8% | 20 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.9% | 16 |
| maribo.IotaCT 1.1 | 4.8 | 10.1% | 5 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 6.8 | 8.2% | 1 |
| stelo.PatternRobot 1.0 | 7.8 | 7.6% | 4 |
| spinnercat.Omen 1.0 | 8.8 | 7.0% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.0 | 22 / 35 | 4575 |
| 2 | 1 | 70.9 | 88.6 | 27 / 35 | 5472 |
| 3 | 1 | 71.4 | 93.0 | 27 / 35 | 5253 |
| 4 | 1 | 70.8 | 93.0 | 25 / 35 | 5112 |
| 5 | 1 | 71.6 | 91.4 | 26 / 35 | 5802 |
| 6 | 1 | 70.6 | 88.6 | 24 / 35 | 5514 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 88% |
| nz.jdc.nano.GridFu 1.0 | 45 | 96% |
| timmit.nano.TimDog 0.33 | 18 | 83% |
| stelo.PatternRobot 1.0 | 11 | 82% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| maribo.IotaCT 1.1 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 59 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 34% | 71 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 29 |
| stelo.PatternRobot 1.0 | 9 | 15% | 15 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 54 |
| ratosh.Wesco 1.4 | 6 | 10% | 14 |
| maribo.IotaCT 1.1 | 3 | 5% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.3 | 166 / 210 | 1.78 | 21.5% | 39914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.5% | 166 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 16 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 5 |
| zyx.micro.Ant 1.1 | 4.5 | 10.1% | 12 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 0 |
| sanja.First 0.1 | 5.7 | 8.8% | 3 |
| cvt.Firsty 1.0 | 7.3 | 7.5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.3 | 27 / 35 | 7134 |
| 2 | 1 | 67.9 | 79.4 | 23 / 35 | 5641 |
| 3 | 1 | 72.1 | 92.4 | 30 / 35 | 6761 |
| 4 | 1 | 72.6 | 94.0 | 30 / 35 | 6894 |
| 5 | 1 | 72.0 | 94.0 | 29 / 35 | 6826 |
| 6 | 1 | 72.0 | 94.9 | 27 / 35 | 6658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 92% |
| baal.nano.N 1.42 | 35 | 100% |
| cvt.Firsty 1.0 | 30 | 93% |
| zyx.micro.Ant 1.1 | 25 | 80% |
| sanja.First 0.1 | 21 | 95% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 38% | 40 |
| baal.nano.N 1.42 | 8 | 18% | 37 |
| tvv.nano.Polaris 1.2 | 6 | 13% | 58 |
| cvt.Firsty 1.0 | 5 | 11% | 28 |
| sanja.First 0.1 | 3 | 7% | 21 |
| Grystrion.TrackerWO 1.0 | 2 | 4% | 10 |
| sample.RamFire 1.0 | 2 | 4% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.9 | 75 / 210 | 3.71 | 15.9% | 32662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 15.9% | 75 |
| kc.micro.Figment 1.0 | 2.0 | 14.1% | 60 |
| cs.Wren 1.0 | 3.2 | 12.5% | 25 |
| mz.Cork 0.1 | 4.3 | 11.3% | 15 |
| js.PinBall 1.6 | 4.7 | 11.5% | 17 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 4 |
| evd.X1 0.01 | 6.7 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.2% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 69.8 | 13 / 35 | 5482 |
| 2 | 2 | 63.3 | 69.2 | 10 / 35 | 5046 |
| 3 | 1 | 61.8 | 66.3 | 11 / 35 | 5042 |
| 4 | 1 | 65.2 | 72.4 | 15 / 35 | 5482 |
| 5 | 1 | 64.6 | 69.8 | 11 / 35 | 6015 |
| 6 | 1 | 65.2 | 71.7 | 15 / 35 | 5595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 57% |
| cs.Wren 1.0 | 23 | 91% |
| mz.Cork 0.1 | 15 | 73% |
| js.PinBall 1.6 | 13 | 62% |
| jsal.Jsalbot 1.0 | 6 | 67% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 0% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 42% | 89 |
| cs.Wren 1.0 | 22 | 16% | 34 |
| js.PinBall 1.6 | 16 | 12% | 24 |
| mz.Cork 0.1 | 11 | 8% | 27 |
| joe.ADinosaur 1.0 | 8 | 6% | 11 |
| evd.X1 0.01 | 8 | 6% | 9 |
| PSW.Relentless 0.1 | 7 | 5% | 6 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.7 | 118 / 210 | 2.64 | 18.3% | 29123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.3% | 118 |
| myl.nano.Graviton 1.10 | 2.5 | 12.1% | 30 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.5% | 15 |
| ntc.Opposite 1.5 | 4.0 | 11.6% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.3% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.2% | 5 |
| disan.Chair 2.2.0 | 7.2 | 7.9% | 10 |
| DBall.NUKE 0.1 | 7.8 | 7.3% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.1% | 5 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.6 | 20 / 35 | 4598 |
| 2 | 1 | 66.3 | 78.1 | 19 / 35 | 4846 |
| 3 | 1 | 66.5 | 77.8 | 17 / 35 | 4943 |
| 4 | 1 | 68.0 | 85.4 | 21 / 35 | 4856 |
| 5 | 1 | 68.2 | 83.8 | 20 / 35 | 4994 |
| 6 | 1 | 68.3 | 84.8 | 21 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 82% |
| stelo.AreaTargetingBot 1.1 | 27 | 81% |
| disan.Chair 2.2.0 | 18 | 72% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 73% |
| ntc.Opposite 1.5 | 14 | 79% |
| donjezza.Muncho 1.0 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| DBall.NUKE 0.1 | 8 | 88% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 22% | 34 |
| myl.nano.Graviton 1.10 | 17 | 18% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 16% | 27 |
| stelo.AreaTargetingBot 1.1 | 14 | 15% | 33 |
| ntc.Opposite 1.5 | 13 | 14% | 21 |
| disan.Chair 2.2.0 | 5 | 5% | 17 |
| donjezza.Muncho 1.0 | 4 | 4% | 16 |
| DBall.NUKE 0.1 | 2 | 2% | 9 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.7 | 78 / 210 | 3.54 | 15.7% | 26767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 15.7% | 78 |
| oog.melee.Capulet 1.2 | 2.5 | 13.8% | 53 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 35 |
| yagami.Tidus 0.11 | 4.2 | 12.1% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 24 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 7 |
| stelo.MirrorNano 1.3 | 7.5 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 71.4 | 10 / 35 | 4332 |
| 2 | 1 | 64.2 | 75.2 | 13 / 35 | 3918 |
| 3 | 1 | 64.1 | 69.5 | 15 / 35 | 4699 |
| 4 | 1 | 64.1 | 69.8 | 12 / 35 | 4576 |
| 5 | 1 | 67.5 | 79.7 | 17 / 35 | 5159 |
| 6 | 2 | 61.9 | 64.8 | 11 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 70% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| oog.melee.Capulet 1.2 | 23 | 57% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 31% | 55 |
| yagami.Tidus 0.11 | 25 | 19% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 39 |
| kawigi.micro.Shiz 1.1 | 19 | 14% | 35 |
| ejb.Polaris 1.0.1 | 14 | 11% | 20 |
| kurios.DOSexe .9a | 6 | 5% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.8 | 139 / 210 | 2.64 | 18.1% | 28292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.1% | 139 |
| bzdp.Pansy 2.1 | 2.3 | 12.6% | 21 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 24 |
| ratosh.Nobo 0.21 | 4.0 | 11.0% | 9 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 12 |
| m3thos.Eva00 1.1 | 5.8 | 9.6% | 1 |
| bayen.UbaMicro 1.4 | 7.2 | 8.0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.0 | 24 / 35 | 4667 |
| 2 | 1 | 65.1 | 73.7 | 20 / 35 | 4673 |
| 3 | 1 | 69.2 | 89.5 | 25 / 35 | 4921 |
| 4 | 1 | 66.9 | 81.9 | 22 / 35 | 4387 |
| 5 | 1 | 68.6 | 84.4 | 25 / 35 | 4926 |
| 6 | 1 | 67.1 | 81.3 | 23 / 35 | 4718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 95% |
| wee.Gem 1.8.4 | 33 | 91% |
| wompi.Quokka 1.6 | 25 | 92% |
| m3thos.Eva00 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| ratosh.Nobo 0.21 | 7 | 71% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 18% | 66 |
| maribo.FollowFire 1 | 12 | 17% | 11 |
| ratosh.Nobo 0.21 | 11 | 15% | 23 |
| wompi.Quokka 1.6 | 8 | 11% | 24 |
| wee.Gem 1.8.4 | 7 | 10% | 38 |
| m3thos.Eva00 1.1 | 7 | 10% | 19 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 9 |
| bayen.UbaMicro 1.4 | 2 | 3% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 89.0 | 135 / 210 | 1.99 | 22.3% | 50286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 22.3% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 57 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 13 |
| ayk.WallHugger 1.0 | 5.0 | 9.5% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.9% | 0 |
| exauge.GateKeeper 1.1.121g | 5.5 | 9.0% | 5 |
| stelo.PianistNano 1.2 | 6.0 | 8.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 89.2 | 23 / 35 | 8458 |
| 2 | 1 | 71.1 | 82.5 | 15 / 35 | 7395 |
| 3 | 1 | 72.3 | 82.2 | 22 / 35 | 7959 |
| 4 | 1 | 75.2 | 94.0 | 27 / 35 | 9115 |
| 5 | 1 | 75.7 | 95.6 | 27 / 35 | 9217 |
| 6 | 1 | 73.4 | 90.8 | 21 / 35 | 8142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 79% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stelo.PianistNano 1.2 | 5 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 51% | 147 |
| mz.NanoGod 2.02 | 23 | 30% | 36 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 12 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| ayk.WallHugger 1.0 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.0 | 106 / 210 | 3.52 | 16.5% | 28669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.5% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 33 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 17 |
| bvh.micro.Freya 0.3 | 3.7 | 11.7% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.5 | 9.6% | 11 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.6% | 13 |
| conscience.Electron 1.3g | 6.7 | 8.5% | 0 |
| ap.Frederick 1.1 | 8.5 | 6.5% | 7 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.6 | 20 / 35 | 5075 |
| 2 | 1 | 63.8 | 67.6 | 17 / 35 | 4759 |
| 3 | 1 | 66.2 | 75.6 | 19 / 35 | 4834 |
| 4 | 1 | 64.3 | 72.7 | 17 / 35 | 4887 |
| 5 | 1 | 63.2 | 67.9 | 17 / 35 | 4505 |
| 6 | 1 | 63.4 | 67.6 | 16 / 35 | 4609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 85% |
| dummy.micro.Sparrow 2.5 | 26 | 88% |
| bvh.micro.Freya 0.3 | 23 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 25% | 62 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 18% | 19 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 34 |
| conscience.Electron 1.3g | 13 | 12% | 18 |
| bvh.micro.Freya 0.3 | 12 | 11% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 27 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 15 |
| dl.BetterWalls 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.0 | 142 / 210 | 2.35 | 21.3% | 44003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.3% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 17 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.6% | 17 |
| sul.Lunar 1.1 | 3.5 | 11.9% | 17 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 6 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.0 | 6.4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 1 |
| sample.Corners 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 86.3 | 28 / 35 | 7745 |
| 2 | 1 | 71.6 | 84.1 | 25 / 35 | 6840 |
| 3 | 1 | 69.8 | 77.8 | 20 / 35 | 7219 |
| 4 | 1 | 73.0 | 91.4 | 25 / 35 | 7727 |
| 5 | 1 | 70.1 | 81.9 | 20 / 35 | 7035 |
| 6 | 1 | 72.5 | 88.6 | 24 / 35 | 7437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 90% |
| supersample.SuperBoxBot 1.0 | 37 | 84% |
| dsw.StaticD 1.0 | 12 | 58% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 38% | 47 |
| dsw.StaticD 1.0 | 12 | 17% | 20 |
| sul.Lunar 1.1 | 9 | 13% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 11% | 49 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 13 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 9 |
| sample.Corners 1.0 | 3 | 4% | 5 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 80.8 | 116 / 210 | 2.72 | 18.9% | 39319 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.9% | 116 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 36 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.2% | 15 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 7 |
| GarmBox.Oranges 1.0 | 7.0 | 7.9% | 0 |
| sample.Walls 1.0 | 8.0 | 6.9% | 3 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.1 | 23 / 35 | 6207 |
| 2 | 1 | 67.6 | 78.1 | 16 / 35 | 6629 |
| 3 | 1 | 68.7 | 81.3 | 21 / 35 | 6599 |
| 4 | 1 | 70.3 | 84.1 | 20 / 35 | 7278 |
| 5 | 1 | 68.0 | 79.0 | 19 / 35 | 6322 |
| 6 | 1 | 67.1 | 77.5 | 17 / 35 | 6284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 98% |
| radnor.DoctorBob 1.42 | 38 | 61% |
| mld.Wisdom 1.0 | 22 | 73% |
| amz.NanoClone 1.41 | 11 | 91% |
| jangs.ns51 1.0 | 10 | 80% |
| GarmBox.Oranges 1.0 | 9 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |

Hadur died in 94 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 28% | 41 |
| radnor.DoctorBob 1.42 | 23 | 24% | 51 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 26 |
| amz.NanoClone 1.41 | 11 | 12% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 9% | 47 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 1 | 1% | 9 |

