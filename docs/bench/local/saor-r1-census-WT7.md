# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 91.1 | 158 / 210 | 1.80 | 22.2% | 45292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.2% | 158 |
| radnor.DoctorBob 1.42 | 2.3 | 14.4% | 15 |
| mz.AntiGrav 1.0 | 2.8 | 13.5% | 13 |
| mld.Infinity 2.2 | 3.8 | 12.3% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| sample.Walls 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 4 |
| GarmBox.Oranges 1.0 | 7.3 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 90.2 | 28 / 35 | 7163 |
| 2 | 1 | 73.5 | 95.2 | 30 / 35 | 7222 |
| 3 | 1 | 73.8 | 91.7 | 27 / 35 | 8228 |
| 4 | 1 | 72.1 | 86.7 | 24 / 35 | 7308 |
| 5 | 1 | 73.1 | 89.8 | 25 / 35 | 7800 |
| 6 | 1 | 72.7 | 93.0 | 24 / 35 | 7571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 97% |
| radnor.DoctorBob 1.42 | 43 | 88% |
| mld.Infinity 2.2 | 31 | 94% |
| amz.NanoClone 1.41 | 11 | 91% |
| jangs.ns51 1.0 | 6 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 42% | 65 |
| mz.AntiGrav 1.0 | 9 | 17% | 66 |
| mld.Infinity 2.2 | 9 | 17% | 39 |
| amz.NanoClone 1.41 | 5 | 10% | 12 |
| jangs.ns51 1.0 | 4 | 8% | 12 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 6 |
| sample.Walls 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.2 | 116 / 210 | 2.33 | 18.8% | 33313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.8% | 116 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 54 |
| mld.DustBunny 3.8 | 3.0 | 14.3% | 22 |
| maribo.melee.BMV 0.1 | 4.5 | 9.9% | 3 |
| zyx.nano.Ant 1.1 | 4.8 | 8.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.9% | 5 |
| bzdp.BoxCar 2.0 | 8.0 | 6.6% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.7% | 3 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 19 / 35 | 5425 |
| 2 | 1 | 67.0 | 78.7 | 14 / 35 | 5616 |
| 3 | 1 | 70.8 | 92.1 | 23 / 35 | 6175 |
| 4 | 1 | 68.0 | 85.7 | 17 / 35 | 5395 |
| 5 | 1 | 68.8 | 87.0 | 24 / 35 | 5242 |
| 6 | 1 | 68.1 | 82.2 | 19 / 35 | 5460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 70 | 81% |
| oog.melee.Mercutio 1.0 | 52 | 69% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 36 | 38% | 82 |
| oog.melee.Mercutio 1.0 | 32 | 34% | 75 |
| zyx.nano.Ant 1.1 | 9 | 9% | 13 |
| maribo.melee.BMV 0.1 | 6 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 16 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 81.6 | 137 / 210 | 2.65 | 20.1% | 39412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.1% | 137 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 13 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 5 |
| cb.nano.Insomnia 1.0 | 5.7 | 8.9% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.3% | 8 |
| sample.Fire 1.0 | 9.5 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 70.8 | 19 / 35 | 5758 |
| 2 | 1 | 68.8 | 78.4 | 19 / 35 | 6696 |
| 3 | 1 | 70.8 | 83.2 | 23 / 35 | 6843 |
| 4 | 1 | 72.9 | 90.8 | 30 / 35 | 6998 |
| 5 | 1 | 71.2 | 84.8 | 23 / 35 | 6819 |
| 6 | 1 | 69.8 | 81.9 | 23 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 87% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 14 | 79% |
| fm.mammillarias 1.3 | 10 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 25% | 68 |
| myl.nano.KomoriNinja 1.1 | 15 | 21% | 48 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 18% | 31 |
| cb.nano.Insomnia 1.0 | 8 | 11% | 11 |
| fm.mammillarias 1.3 | 6 | 8% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 9 |
| sample.Fire 1.0 | 4 | 5% | 6 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 19 |
| sample.Tracker 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.4 | 148 / 210 | 1.86 | 21.7% | 43402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.7% | 148 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.6% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 4 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.5 | 23 / 35 | 6919 |
| 2 | 1 | 70.5 | 84.1 | 22 / 35 | 7265 |
| 3 | 1 | 72.5 | 94.3 | 28 / 35 | 7355 |
| 4 | 1 | 72.4 | 91.4 | 26 / 35 | 7357 |
| 5 | 1 | 71.8 | 90.8 | 25 / 35 | 6870 |
| 6 | 1 | 72.4 | 91.4 | 24 / 35 | 7636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 85% |
| stelo.SoJNanoMelee 1.1 | 42 | 76% |
| tvv.micro.Antares 1.1.1 | 23 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 39% | 83 |
| stelo.SoJNanoMelee 1.1 | 15 | 24% | 32 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 21 |
| tj.zombie1n 1.0.1 | 5 | 8% | 11 |
| repositorio.NanoStep 1.0 | 4 | 6% | 13 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 67.5 | 90 / 210 | 3.92 | 15.9% | 29858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 15.9% | 90 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 36 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 31 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.5% | 19 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 9.6% | 9 |
| EBBU.Sim2 1.02 | 5.7 | 9.7% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.4% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.1% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.9 | 18 / 35 | 4707 |
| 2 | 1 | 60.9 | 60.6 | 11 / 35 | 4747 |
| 3 | 1 | 62.9 | 66.7 | 12 / 35 | 5074 |
| 4 | 1 | 63.5 | 66.0 | 16 / 35 | 4686 |
| 5 | 1 | 64.7 | 68.9 | 17 / 35 | 5240 |
| 6 | 1 | 66.0 | 74.9 | 16 / 35 | 5404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 58% |
| simonton.nano.MeleeSeed 1.8 | 27 | 89% |
| ahf.NanoAndrew .4 | 24 | 75% |
| sam.Samspin 1.0 | 13 | 85% |
| robar.nano.Assertive_Melee 0.2 | 7 | 71% |
| EBBU.Sim2 1.02 | 5 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 23% | 50 |
| oog.melee.Corsair 1.0 | 24 | 20% | 45 |
| ahf.NanoAndrew .4 | 16 | 13% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 11 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 15 |
| robar.nano.Assertive_Melee 0.2 | 10 | 8% | 14 |
| EBBU.Sim2 1.02 | 9 | 7% | 13 |
| sam.Samspin 1.0 | 8 | 7% | 18 |
| sample.TrackFire 1.0 | 3 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.7 | 141 / 210 | 2.11 | 19.9% | 34779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.9% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.3% | 10 |
| fm.claire 1.7 | 5.7 | 8.7% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.3% | 5 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.3% | 6 |
| pa.Improved 1.0 | 8.2 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.8% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.7 | 21 / 35 | 5122 |
| 2 | 1 | 69.7 | 86.7 | 22 / 35 | 5725 |
| 3 | 1 | 69.6 | 87.6 | 21 / 35 | 5686 |
| 4 | 1 | 71.3 | 89.8 | 27 / 35 | 6277 |
| 5 | 1 | 70.2 | 91.1 | 28 / 35 | 5519 |
| 6 | 1 | 71.0 | 91.1 | 22 / 35 | 6450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 87% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| gh.nano.Grofvuil 0.2 | 12 | 75% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 30% | 88 |
| gh.nano.Grofvuil 0.2 | 16 | 23% | 29 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 15 |
| oog.melee.CapuletDroid 1.1 | 8 | 12% | 47 |
| fm.claire 1.7 | 6 | 9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| kurios.DOSexe .9b | 2 | 3% | 4 |
| pa.Improved 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.0 | 101 / 210 | 2.62 | 18.5% | 35967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.5% | 101 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 38 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 29 |
| mz.MicroGodMelee 1 | 4.0 | 12.4% | 30 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 6 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.5% | 0 |
| el.JumpShoot 0.2 | 6.8 | 6.9% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.9 | 15 / 35 | 5869 |
| 2 | 1 | 69.0 | 83.5 | 19 / 35 | 6184 |
| 3 | 1 | 66.8 | 75.2 | 14 / 35 | 6020 |
| 4 | 1 | 67.8 | 80.3 | 18 / 35 | 5887 |
| 5 | 1 | 68.3 | 83.5 | 17 / 35 | 5881 |
| 6 | 1 | 69.0 | 86.7 | 18 / 35 | 6126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 80% |
| mz.MicroGodMelee 1 | 34 | 65% |
| gh.micro.Gruweltje 0.7 | 27 | 67% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 31% | 58 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 51 |
| spinnercat.micro.Tyger 0.1 | 28 | 26% | 68 |
| acogdev.alpha 0.2 | 7 | 6% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 73.5 | 115 / 210 | 3.39 | 17.2% | 31508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 17.2% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 22 |
| germ.TheMind .2 | 5.0 | 9.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 5.8 | 9.0% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 80.0 | 23 / 35 | 6101 |
| 2 | 1 | 67.2 | 77.1 | 22 / 35 | 5414 |
| 3 | 1 | 66.2 | 72.4 | 22 / 35 | 5203 |
| 4 | 2 | 61.7 | 61.6 | 14 / 35 | 4501 |
| 5 | 2 | 67.2 | 78.1 | 19 / 35 | 5391 |
| 6 | 1 | 64.9 | 71.7 | 15 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 92% |
| germ.TheMind .2 | 12 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 38% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 18% | 37 |
| awesomeness.Elite 1.0 | 13 | 14% | 18 |
| stelo.UntouchableNano 1.3 | 10 | 11% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 13 |
| germ.TheMind .2 | 4 | 4% | 18 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.8 | 158 / 210 | 1.92 | 20.5% | 32575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.5% | 158 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 9 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.5% | 2 |
| spinnercat.Omen 1.0 | 7.3 | 7.9% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 26 / 35 | 4713 |
| 2 | 1 | 69.8 | 85.7 | 25 / 35 | 5375 |
| 3 | 1 | 71.1 | 90.2 | 25 / 35 | 5544 |
| 4 | 1 | 70.9 | 88.3 | 27 / 35 | 5688 |
| 5 | 1 | 72.6 | 95.6 | 30 / 35 | 5526 |
| 6 | 1 | 71.5 | 89.8 | 25 / 35 | 5729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 94% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| timmit.nano.TimDog 0.33 | 15 | 87% |
| maribo.IotaCT 1.1 | 11 | 82% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 27% | 79 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 49 |
| maribo.IotaCT 1.1 | 7 | 13% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 12 |
| ratosh.Wesco 1.4 | 6 | 12% | 12 |
| timmit.nano.TimDog 0.33 | 4 | 8% | 20 |
| stelo.PatternRobot 1.0 | 4 | 8% | 13 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.1 | 172 / 210 | 1.71 | 22.1% | 42224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.1% | 172 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.3% | 16 |
| baal.nano.N 1.42 | 3.0 | 11.6% | 9 |
| zyx.micro.Ant 1.1 | 4.5 | 9.5% | 7 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.3% | 0 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.7% | 0 |
| sanja.First 0.1 | 7.2 | 8.0% | 3 |
| cvt.Firsty 1.0 | 7.5 | 7.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.2% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.8 | 28 / 35 | 6280 |
| 2 | 1 | 72.0 | 89.5 | 26 / 35 | 7059 |
| 3 | 1 | 72.8 | 96.2 | 31 / 35 | 7080 |
| 4 | 1 | 73.2 | 95.2 | 31 / 35 | 7385 |
| 5 | 1 | 71.4 | 88.6 | 27 / 35 | 6843 |
| 6 | 1 | 73.1 | 93.3 | 29 / 35 | 7577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 89% |
| baal.nano.N 1.42 | 35 | 91% |
| cvt.Firsty 1.0 | 32 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| sanja.First 0.1 | 19 | 95% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 11 | 29% | 35 |
| zyx.micro.Ant 1.1 | 10 | 26% | 45 |
| tvv.nano.Polaris 1.2 | 7 | 18% | 67 |
| cvt.Firsty 1.0 | 2 | 5% | 23 |
| sanja.First 0.1 | 2 | 5% | 17 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 12 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.6 | 93 / 210 | 3.47 | 16.6% | 33483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.6% | 93 |
| kc.micro.Figment 1.0 | 2.2 | 14.9% | 63 |
| cs.Wren 1.0 | 3.2 | 12.7% | 22 |
| mz.Cork 0.1 | 4.3 | 10.9% | 11 |
| js.PinBall 1.6 | 4.5 | 11.0% | 9 |
| joe.ADinosaur 1.0 | 5.8 | 9.4% | 5 |
| evd.X1 0.01 | 7.0 | 7.7% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.7 | 15 / 35 | 5359 |
| 2 | 1 | 66.1 | 74.0 | 14 / 35 | 5845 |
| 3 | 1 | 64.7 | 72.1 | 16 / 35 | 5299 |
| 4 | 1 | 64.6 | 71.7 | 15 / 35 | 5523 |
| 5 | 1 | 64.1 | 68.6 | 15 / 35 | 5475 |
| 6 | 1 | 66.6 | 76.5 | 18 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 66% |
| cs.Wren 1.0 | 23 | 83% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 10 | 70% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 44% | 100 |
| cs.Wren 1.0 | 21 | 18% | 37 |
| joe.ADinosaur 1.0 | 12 | 10% | 15 |
| mz.Cork 0.1 | 10 | 9% | 18 |
| evd.X1 0.01 | 7 | 6% | 10 |
| js.PinBall 1.6 | 6 | 5% | 12 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.2 | 145 / 210 | 2.24 | 19.8% | 31916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.8% | 145 |
| ntc.Opposite 1.5 | 2.8 | 11.5% | 6 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.1% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.8% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 5 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 6 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.4% | 11 |
| pbg.R2D2 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 24 / 35 | 5529 |
| 2 | 1 | 70.0 | 87.9 | 27 / 35 | 5398 |
| 3 | 1 | 70.4 | 91.1 | 28 / 35 | 5027 |
| 4 | 1 | 72.5 | 97.5 | 30 / 35 | 5600 |
| 5 | 1 | 65.3 | 72.4 | 18 / 35 | 4999 |
| 6 | 1 | 67.2 | 79.0 | 18 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 85% |
| stelo.AreaTargetingBot 1.1 | 24 | 96% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 100% |
| ntc.Opposite 1.5 | 21 | 95% |
| disan.Chair 2.2.0 | 17 | 100% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| donjezza.Muncho 1.0 | 10 | 80% |
| DBall.NUKE 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 23% | 48 |
| pfvicm.Sobieski 7.2.3b | 13 | 20% | 22 |
| ntc.Opposite 1.5 | 12 | 18% | 30 |
| stelo.AreaTargetingBot 1.1 | 11 | 17% | 38 |
| disan.Chair 2.2.0 | 6 | 9% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 8% | 26 |
| donjezza.Muncho 1.0 | 3 | 5% | 9 |
| DBall.NUKE 0.1 | 1 | 2% | 13 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.9 | 92 / 210 | 3.26 | 16.4% | 27339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 16.4% | 92 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 51 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.3% | 16 |
| yagami.Tidus 0.11 | 4.8 | 11.6% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 8 |
| step.nanoPri 1.0 | 7.5 | 7.4% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 6.9% | 2 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 61.3 | 12 / 35 | 4626 |
| 2 | 1 | 67.5 | 83.5 | 18 / 35 | 4518 |
| 3 | 1 | 67.7 | 80.6 | 16 / 35 | 5202 |
| 4 | 1 | 63.4 | 69.2 | 15 / 35 | 4103 |
| 5 | 1 | 67.6 | 83.5 | 20 / 35 | 4193 |
| 6 | 1 | 64.3 | 71.4 | 11 / 35 | 4697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 69% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 91% |
| yagami.Tidus 0.11 | 16 | 94% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 40% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 45 |
| yagami.Tidus 0.11 | 16 | 14% | 31 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| step.nanoPri 1.0 | 8 | 7% | 9 |
| kawigi.micro.Shiz 1.1 | 7 | 6% | 27 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.9 | 134 / 210 | 2.54 | 18.5% | 30021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.5% | 134 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 24 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 23 |
| wompi.Quokka 1.6 | 3.8 | 11.1% | 5 |
| ratosh.Nobo 0.21 | 5.2 | 10.2% | 6 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.3 | 23 / 35 | 5018 |
| 2 | 1 | 66.6 | 79.4 | 21 / 35 | 4566 |
| 3 | 1 | 68.8 | 87.3 | 25 / 35 | 5367 |
| 4 | 1 | 66.4 | 78.4 | 20 / 35 | 4801 |
| 5 | 1 | 68.5 | 85.4 | 21 / 35 | 5287 |
| 6 | 1 | 68.6 | 86.3 | 24 / 35 | 4982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 93% |
| wee.Gem 1.8.4 | 24 | 96% |
| wompi.Quokka 1.6 | 22 | 100% |
| m3thos.Eva00 1.1 | 18 | 94% |
| ratosh.Nobo 0.21 | 11 | 82% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 26% | 72 |
| m3thos.Eva00 1.1 | 12 | 16% | 21 |
| wee.Gem 1.8.4 | 10 | 13% | 38 |
| ratosh.Nobo 0.21 | 8 | 10% | 20 |
| bayen.UbaMicro 1.4 | 8 | 10% | 17 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 8 |
| wompi.Quokka 1.6 | 4 | 5% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 9 |
| maribo.FollowFire 1 | 4 | 5% | 4 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.7 | 138 / 210 | 1.93 | 22.5% | 50858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.5% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 49 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 17 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 3 |
| ayk.WallHugger 1.0 | 5.2 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 85.1 | 23 / 35 | 8287 |
| 2 | 1 | 73.2 | 89.5 | 16 / 35 | 8204 |
| 3 | 1 | 74.6 | 91.4 | 23 / 35 | 9021 |
| 4 | 1 | 73.7 | 91.7 | 26 / 35 | 8060 |
| 5 | 1 | 74.0 | 88.9 | 25 / 35 | 8413 |
| 6 | 1 | 74.5 | 91.4 | 25 / 35 | 8873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 84% |
| mz.NanoGod 2.02 | 18 | 56% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 44% | 141 |
| mz.NanoGod 2.02 | 20 | 28% | 32 |
| exauge.GateKeeper 1.1.121g | 11 | 15% | 21 |
| stelo.PianistNano 1.2 | 5 | 7% | 7 |
| ayk.WallHugger 1.0 | 4 | 6% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 67.9 | 86 / 210 | 3.89 | 15.7% | 28654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 15.7% | 86 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 24 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.5% | 24 |
| bvh.micro.Freya 0.3 | 3.8 | 12.0% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.2% | 29 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 7 |
| conscience.Electron 1.3g | 7.3 | 7.7% | 0 |
| ap.Frederick 1.1 | 7.7 | 7.1% | 17 |
| dl.BetterWalls 1.0 | 9.0 | 5.9% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 64.1 | 15 / 35 | 4654 |
| 2 | 1 | 63.7 | 69.5 | 13 / 35 | 4580 |
| 3 | 2 | 60.5 | 59.4 | 9 / 35 | 4530 |
| 4 | 1 | 65.0 | 70.2 | 17 / 35 | 5032 |
| 5 | 1 | 64.0 | 71.1 | 16 / 35 | 4451 |
| 6 | 1 | 65.6 | 73.0 | 16 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 88% |
| dummy.micro.Sparrow 2.5 | 23 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 68% |
| bvh.micro.Freya 0.3 | 22 | 64% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 25 | 20% | 35 |
| voidious.micro.BlitzBat 1.05 | 20 | 16% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 15 | 12% | 36 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 12% | 15 |
| conscience.Electron 1.3g | 13 | 10% | 13 |
| dl.BetterWalls 1.0 | 10 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 14 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 86.3 | 155 / 210 | 2.23 | 21.9% | 45502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.9% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 21 |
| sul.Lunar 1.1 | 3.0 | 11.6% | 11 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.1% | 7 |
| dsw.StaticD 1.0 | 5.3 | 8.8% | 8 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.8% | 1 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.7% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.0% | 2 |
| sample.Corners 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 85.7 | 25 / 35 | 7398 |
| 2 | 1 | 72.9 | 87.9 | 28 / 35 | 7889 |
| 3 | 1 | 69.9 | 75.9 | 19 / 35 | 7386 |
| 4 | 1 | 72.8 | 87.9 | 26 / 35 | 7896 |
| 5 | 1 | 71.4 | 85.1 | 26 / 35 | 7061 |
| 6 | 1 | 73.8 | 95.2 | 31 / 35 | 7872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 58 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 95% |
| sample.MyFirstRobot 1.0 | 20 | 95% |
| supersample.SuperBoxBot 1.0 | 19 | 95% |
| dsw.StaticD 1.0 | 12 | 58% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 29% | 61 |
| supersample.SuperBoxBot 1.0 | 14 | 25% | 29 |
| dsw.StaticD 1.0 | 8 | 15% | 18 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 7 |
| sul.Lunar 1.1 | 3 | 5% | 62 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 7 |
| sample.Corners 1.0 | 3 | 5% | 4 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 16 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 6 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 81.1 | 117 / 210 | 2.70 | 19.0% | 39712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.0% | 117 |
| mld.Wisdom 1.0 | 3.0 | 12.4% | 18 |
| radnor.DoctorBob 1.42 | 3.0 | 12.9% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.1% | 14 |
| amz.NanoClone 1.41 | 4.7 | 10.3% | 12 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 9 |
| sample.Walls 1.0 | 7.2 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 86.3 | 22 / 35 | 6990 |
| 2 | 1 | 69.8 | 85.1 | 22 / 35 | 6725 |
| 3 | 1 | 67.9 | 76.2 | 20 / 35 | 6420 |
| 4 | 1 | 69.0 | 83.8 | 18 / 35 | 6586 |
| 5 | 1 | 67.7 | 78.4 | 18 / 35 | 6457 |
| 6 | 1 | 67.7 | 76.5 | 17 / 35 | 6534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 90% |
| radnor.DoctorBob 1.42 | 29 | 76% |
| amz.NanoClone 1.41 | 17 | 82% |
| mld.Wisdom 1.0 | 14 | 79% |
| KiraNL.Chupacabra 0.4 | 14 | 86% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 32% | 58 |
| mld.Wisdom 1.0 | 19 | 20% | 34 |
| KiraNL.Chupacabra 0.4 | 15 | 16% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 12% | 46 |
| amz.NanoClone 1.41 | 11 | 12% | 18 |
| sample.Walls 1.0 | 4 | 4% | 12 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

