# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 80.5 | 124 / 210 | 2.75 | 19.4% | 41012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 19.4% | 124 |
| radnor.DoctorBob 1.42 | 2.7 | 14.7% | 30 |
| mz.AntiGrav 1.0 | 3.2 | 14.1% | 18 |
| mld.Infinity 2.2 | 3.2 | 13.4% | 31 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 5 |
| sample.Walls 1.0 | 6.2 | 7.8% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.6 | 24 / 35 | 7149 |
| 2 | 1 | 70.9 | 84.8 | 20 / 35 | 7184 |
| 3 | 1 | 67.7 | 74.9 | 18 / 35 | 6009 |
| 4 | 1 | 70.3 | 81.6 | 24 / 35 | 7098 |
| 5 | 1 | 67.1 | 68.9 | 15 / 35 | 6593 |
| 6 | 1 | 70.9 | 84.4 | 23 / 35 | 6979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 51 | 100% |
| mld.Infinity 2.2 | 33 | 91% |
| radnor.DoctorBob 1.42 | 31 | 87% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 49% | 72 |
| mld.Infinity 2.2 | 13 | 15% | 40 |
| mz.AntiGrav 1.0 | 12 | 14% | 64 |
| amz.NanoClone 1.41 | 10 | 12% | 14 |
| GarmBox.Oranges 1.0 | 5 | 6% | 7 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| sample.Walls 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.6 | 135 / 210 | 2.02 | 19.3% | 33418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 19.3% | 135 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.0% | 41 |
| mld.DustBunny 3.8 | 3.5 | 11.9% | 11 |
| maribo.melee.BMV 0.1 | 3.7 | 11.0% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.7% | 5 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.5% | 10 |
| bzdp.BoxCar 2.0 | 7.7 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.8 | 20 / 35 | 5209 |
| 2 | 1 | 67.8 | 86.0 | 20 / 35 | 5353 |
| 3 | 1 | 71.2 | 94.0 | 26 / 35 | 6548 |
| 4 | 1 | 68.9 | 85.7 | 23 / 35 | 5610 |
| 5 | 1 | 70.2 | 91.4 | 26 / 35 | 5597 |
| 6 | 1 | 67.7 | 84.8 | 20 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 56 | 91% |
| oog.melee.Mercutio 1.0 | 52 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 64% |
| maribo.melee.BMV 0.1 | 13 | 69% |
| fullsail.SweetTea 1.1 | 11 | 100% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 36% | 70 |
| mld.DustBunny 3.8 | 14 | 18% | 59 |
| zyx.nano.Ant 1.1 | 10 | 13% | 18 |
| maribo.melee.BMV 0.1 | 9 | 12% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 12 |
| fullsail.SweetTea 1.1 | 4 | 5% | 14 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 13 |
| bzdp.BoxCar 2.0 | 2 | 3% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 83.0 | 130 / 210 | 2.53 | 19.7% | 37822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 19.7% | 130 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.5% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.1% | 18 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.3% | 9 |
| fm.mammillarias 1.3 | 6.2 | 8.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.5% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.7% | 0 |
| sample.Fire 1.0 | 9.3 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.0 | 23 / 35 | 6307 |
| 2 | 1 | 71.6 | 87.9 | 25 / 35 | 7048 |
| 3 | 1 | 68.2 | 79.0 | 16 / 35 | 6240 |
| 4 | 1 | 68.9 | 80.3 | 22 / 35 | 6159 |
| 5 | 1 | 69.1 | 81.3 | 20 / 35 | 6120 |
| 6 | 1 | 69.1 | 82.2 | 24 / 35 | 5948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 78% |
| myl.nano.KomoriNinja 1.1 | 21 | 90% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 75% |

Hadur died in 80 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 23 | 29% | 46 |
| myl.micro.Troodon 1.10 | 14 | 18% | 50 |
| myl.nano.KomoriNinja 1.1 | 14 | 18% | 46 |
| fm.mammillarias 1.3 | 10 | 13% | 16 |
| cb.nano.Insomnia 1.0 | 6 | 8% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sample.Fire 1.0 | 3 | 4% | 9 |
| sample.Tracker 1.0 | 3 | 4% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 19 |

## Melee bench: F04

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.3 | 154 / 210 | 1.96 | 21.2% | 42015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 21.2% | 154 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.4% | 14 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.5% | 10 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.2% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.6% | 10 |
| yk.JahMicro 1.0 | 6.5 | 8.5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 28 / 35 | 6593 |
| 2 | 1 | 71.6 | 90.5 | 28 / 35 | 7082 |
| 3 | 1 | 71.9 | 92.1 | 26 / 35 | 7646 |
| 4 | 1 | 70.2 | 85.1 | 22 / 35 | 6974 |
| 5 | 1 | 70.4 | 85.7 | 25 / 35 | 6784 |
| 6 | 1 | 71.4 | 91.4 | 25 / 35 | 6936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 92% |
| stelo.SoJNanoMelee 1.1 | 41 | 95% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 18 | 78% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 71% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 32% | 76 |
| tj.zombie1n 1.0.1 | 12 | 21% | 15 |
| yk.JahMicro 1.0 | 7 | 13% | 15 |
| stelo.SoJNanoMelee 1.1 | 6 | 11% | 36 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 11 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.6 | 82 / 210 | 3.82 | 15.5% | 29263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 15.5% | 82 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 34 |
| ahf.NanoAndrew .4 | 3.2 | 12.0% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.6% | 27 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.4% | 12 |
| EBBU.Sim2 1.02 | 6.5 | 9.3% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 8 |
| sam.Samspin 1.0 | 6.7 | 9.3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.4% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 72.1 | 14 / 35 | 5036 |
| 2 | 1 | 63.8 | 70.5 | 13 / 35 | 5047 |
| 3 | 1 | 59.5 | 59.0 | 9 / 35 | 4614 |
| 4 | 1 | 63.2 | 68.9 | 15 / 35 | 4962 |
| 5 | 1 | 64.1 | 70.5 | 15 / 35 | 4847 |
| 6 | 1 | 63.4 | 70.8 | 16 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 63% |
| simonton.nano.MeleeSeed 1.8 | 25 | 100% |
| ahf.NanoAndrew .4 | 18 | 78% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| EBBU.Sim2 1.02 | 8 | 75% |
| sam.Samspin 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |

Hadur died in 130 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 21% | 48 |
| ahf.NanoAndrew .4 | 26 | 20% | 38 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 24 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 38 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 13 |
| EBBU.Sim2 1.02 | 9 | 7% | 15 |
| sam.Samspin 1.0 | 6 | 5% | 11 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.7 | 133 / 210 | 2.47 | 18.9% | 33748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 18.9% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 17 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.9% | 7 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.8% | 7 |
| fm.claire 1.7 | 6.2 | 8.2% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 5 |
| pa.Improved 1.0 | 9.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.0 | 24 / 35 | 5924 |
| 2 | 1 | 66.5 | 80.3 | 16 / 35 | 5282 |
| 3 | 1 | 69.5 | 86.3 | 25 / 35 | 5854 |
| 4 | 1 | 67.5 | 80.6 | 20 / 35 | 5480 |
| 5 | 1 | 68.8 | 85.1 | 24 / 35 | 5666 |
| 6 | 1 | 68.6 | 82.5 | 24 / 35 | 5542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 88% |
| oog.melee.CapuletDroid 1.1 | 47 | 98% |
| gh.nano.Grofvuil 0.2 | 21 | 81% |
| arthord.NanoSatanMelee Beta | 10 | 70% |
| winamp32.micro.MicroMacro 1.0 | 7 | 57% |
| sample.SpinBot 1.0 | 6 | 83% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 32% | 67 |
| gh.nano.Grofvuil 0.2 | 19 | 25% | 38 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 54 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 12 |
| fm.claire 1.7 | 7 | 9% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 15 |
| kurios.DOSexe .9b | 3 | 4% | 6 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 77.5 | 104 / 210 | 3.02 | 17.6% | 34767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 17.6% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.2% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 27 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 27 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 4 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.2% | 4 |
| acogdev.alpha 0.2 | 8.0 | 6.6% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 2 |
| fire219.CatBot 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 76.2 | 15 / 35 | 6328 |
| 2 | 1 | 66.0 | 75.9 | 16 / 35 | 5290 |
| 3 | 1 | 63.6 | 67.0 | 15 / 35 | 5328 |
| 4 | 1 | 67.1 | 79.4 | 17 / 35 | 5756 |
| 5 | 1 | 68.5 | 83.2 | 20 / 35 | 5887 |
| 6 | 1 | 69.3 | 83.5 | 21 / 35 | 6178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 88% |
| mz.MicroGodMelee 1 | 42 | 69% |
| gh.micro.Gruweltje 0.7 | 19 | 74% |
| DBall.Anarchy 0.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 27% | 61 |
| spinnercat.micro.Tyger 0.1 | 26 | 24% | 62 |
| gh.micro.Gruweltje 0.7 | 20 | 19% | 42 |
| acogdev.alpha 0.2 | 8 | 7% | 8 |
| el.JumpShoot 0.2 | 6 | 6% | 7 |
| fire219.CatBot 1.0 | 6 | 6% | 6 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 10 |
| DBall.Anarchy 0.1 | 4 | 4% | 10 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |

## Melee bench: F08

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 71.1 | 111 / 210 | 3.60 | 16.9% | 34428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 16.9% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.9% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.9% | 11 |
| germ.TheMind .2 | 4.8 | 9.8% | 8 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 11 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.9% | 3 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 70.8 | 20 / 35 | 5169 |
| 2 | 1 | 65.7 | 70.2 | 19 / 35 | 5870 |
| 3 | 1 | 68.0 | 76.8 | 22 / 35 | 6193 |
| 4 | 1 | 65.1 | 69.8 | 15 / 35 | 5722 |
| 5 | 1 | 64.0 | 67.0 | 16 / 35 | 5705 |
| 6 | 1 | 65.4 | 71.7 | 19 / 35 | 5769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 95% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| germ.TheMind .2 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 46% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 41 |
| awesomeness.Elite 1.0 | 11 | 11% | 18 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 11 |
| germ.TheMind .2 | 5 | 5% | 14 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 4 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.7 | 151 / 210 | 2.20 | 20.1% | 33122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.1% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 10 |
| maribo.IotaCT 1.1 | 3.8 | 10.8% | 10 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 3 |
| ratosh.Wesco 1.4 | 6.7 | 8.7% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 7.5% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 7.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.5 | 25 / 35 | 5814 |
| 2 | 1 | 69.2 | 84.4 | 25 / 35 | 4908 |
| 3 | 1 | 71.6 | 89.8 | 27 / 35 | 5847 |
| 4 | 1 | 69.7 | 85.1 | 25 / 35 | 5410 |
| 5 | 1 | 70.0 | 85.1 | 24 / 35 | 5434 |
| 6 | 1 | 70.6 | 86.3 | 25 / 35 | 5709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 36 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 14 | 100% |
| maribo.IotaCT 1.1 | 10 | 100% |
| spinnercat.Omen 1.0 | 9 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 17 | 29% | 27 |
| rz.HawkOnFire 0.1 | 13 | 22% | 65 |
| nz.jdc.nano.GridFu 1.0 | 6 | 10% | 52 |
| ratosh.Wesco 1.4 | 6 | 10% | 14 |
| stelo.PatternRobot 1.0 | 6 | 10% | 13 |
| maribo.IotaCT 1.1 | 5 | 8% | 20 |
| spinnercat.Omen 1.0 | 3 | 5% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.9 | 173 / 210 | 1.64 | 22.0% | 41624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 22.0% | 173 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 12 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 7 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 2 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 11 |
| sanja.First 0.1 | 6.2 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.7% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.2 | 29 / 35 | 7064 |
| 2 | 1 | 72.2 | 92.1 | 29 / 35 | 6951 |
| 3 | 1 | 72.7 | 94.3 | 30 / 35 | 7108 |
| 4 | 1 | 71.9 | 93.7 | 26 / 35 | 7070 |
| 5 | 1 | 73.5 | 96.8 | 30 / 35 | 7199 |
| 6 | 1 | 70.8 | 90.2 | 29 / 35 | 6232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 95% |
| baal.nano.N 1.42 | 36 | 97% |
| zyx.micro.Ant 1.1 | 26 | 85% |
| cvt.Firsty 1.0 | 23 | 96% |
| sanja.First 0.1 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 12 | 32% | 49 |
| zyx.micro.Ant 1.1 | 11 | 30% | 36 |
| tvv.nano.Polaris 1.2 | 5 | 14% | 55 |
| sanja.First 0.1 | 3 | 8% | 21 |
| cvt.Firsty 1.0 | 2 | 5% | 20 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| sample.RamFire 1.0 | 1 | 3% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 66.9 | 73 / 210 | 3.98 | 15.2% | 31749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.6% | 85 |
| hadur117.micro.SaorWCR 0.1 | 1.8 | 15.2% | 73 |
| cs.Wren 1.0 | 3.3 | 12.1% | 13 |
| mz.Cork 0.1 | 4.2 | 11.5% | 21 |
| js.PinBall 1.6 | 4.5 | 11.6% | 8 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 3 |
| evd.X1 0.01 | 7.2 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.2% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 71.7 | 13 / 35 | 5546 |
| 2 | 2 | 60.7 | 61.9 | 8 / 35 | 5006 |
| 3 | 2 | 64.5 | 71.1 | 17 / 35 | 5267 |
| 4 | 1 | 63.5 | 69.2 | 14 / 35 | 5176 |
| 5 | 2 | 63.4 | 66.7 | 12 / 35 | 5491 |
| 6 | 2 | 61.6 | 61.0 | 9 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 65% |
| cs.Wren 1.0 | 23 | 70% |
| mz.Cork 0.1 | 9 | 67% |
| js.PinBall 1.6 | 7 | 86% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 42% | 95 |
| cs.Wren 1.0 | 24 | 18% | 37 |
| js.PinBall 1.6 | 16 | 12% | 21 |
| mz.Cork 0.1 | 12 | 9% | 20 |
| evd.X1 0.01 | 12 | 9% | 12 |
| joe.ADinosaur 1.0 | 11 | 8% | 12 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.7 | 116 / 210 | 3.10 | 17.8% | 30748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 17.8% | 116 |
| ntc.Opposite 1.5 | 3.3 | 11.6% | 17 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 10.6% | 15 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.6% | 17 |
| myl.nano.Graviton 1.10 | 4.2 | 10.7% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 10.1% | 9 |
| DBall.NUKE 0.1 | 7.2 | 8.5% | 2 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 7 |
| donjezza.Muncho 1.0 | 9.5 | 5.9% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 65.4 | 14 / 35 | 4553 |
| 2 | 1 | 67.7 | 80.3 | 22 / 35 | 5190 |
| 3 | 1 | 65.9 | 74.3 | 19 / 35 | 5040 |
| 4 | 1 | 69.3 | 83.8 | 22 / 35 | 5863 |
| 5 | 1 | 68.5 | 85.1 | 22 / 35 | 5243 |
| 6 | 1 | 64.6 | 71.1 | 17 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 27 | 89% |
| ntc.Opposite 1.5 | 26 | 85% |
| stelo.AreaTargetingBot 1.1 | 23 | 91% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 12 | 92% |
| donjezza.Muncho 1.0 | 11 | 82% |
| pbg.R2D2 1.0 | 6 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 24 | 26% | 36 |
| pfvicm.Sobieski 7.2.3b | 22 | 23% | 31 |
| stelo.AreaTargetingBot 1.1 | 14 | 15% | 41 |
| myl.nano.Graviton 1.10 | 10 | 11% | 32 |
| disan.Chair 2.2.0 | 8 | 9% | 18 |
| DBall.NUKE 0.1 | 5 | 5% | 19 |
| donjezza.Muncho 1.0 | 5 | 5% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 5% | 10 |
| pbg.R2D2 1.0 | 1 | 1% | 11 |

## Melee bench: F13

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 65.5 | 65 / 210 | 4.10 | 14.6% | 26729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.7 | 14.6% | 65 |
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 62 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.3% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.4% | 25 |
| yagami.Tidus 0.11 | 4.5 | 12.4% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 8.2% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 64.8 | 7 / 35 | 4847 |
| 2 | 2 | 62.1 | 66.7 | 7 / 35 | 4576 |
| 3 | 2 | 62.5 | 66.0 | 10 / 35 | 4528 |
| 4 | 3 | 60.7 | 59.4 | 10 / 35 | 4172 |
| 5 | 1 | 63.1 | 64.4 | 15 / 35 | 4445 |
| 6 | 1 | 64.2 | 71.7 | 16 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 67% |
| kawigi.micro.Shiz 1.1 | 20 | 95% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 34% | 63 |
| yagami.Tidus 0.11 | 20 | 14% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 13% | 35 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 30 |
| ejb.Polaris 1.0.1 | 16 | 11% | 23 |
| step.nanoPri 1.0 | 10 | 7% | 11 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| kurios.DOSexe .9a | 6 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.1 | 133 / 210 | 2.70 | 18.0% | 29473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 18.0% | 133 |
| wee.Gem 1.8.4 | 3.2 | 11.6% | 21 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 13 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 11 |
| wompi.Quokka 1.6 | 4.0 | 11.3% | 17 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.8% | 2 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.1% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 24 / 35 | 4894 |
| 2 | 1 | 66.5 | 79.4 | 22 / 35 | 4969 |
| 3 | 1 | 66.7 | 80.0 | 20 / 35 | 4800 |
| 4 | 1 | 65.0 | 75.2 | 19 / 35 | 4884 |
| 5 | 1 | 65.7 | 75.9 | 21 / 35 | 4678 |
| 6 | 1 | 69.1 | 88.3 | 27 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 96% |
| wee.Gem 1.8.4 | 30 | 97% |
| wompi.Quokka 1.6 | 23 | 96% |
| ratosh.Nobo 0.21 | 16 | 88% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| m3thos.Eva00 1.1 | 8 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 17% | 29 |
| bzdp.Pansy 2.1 | 11 | 14% | 51 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 14% | 14 |
| m3thos.Eva00 1.1 | 10 | 13% | 24 |
| wompi.Quokka 1.6 | 9 | 12% | 26 |
| maribo.FollowFire 1 | 9 | 12% | 10 |
| wee.Gem 1.8.4 | 7 | 9% | 38 |
| bayen.UbaMicro 1.4 | 5 | 6% | 16 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 2 |

## Melee bench: F15

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 82.8 | 108 / 210 | 2.55 | 20.1% | 46528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.1% | 108 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 69 |
| mz.NanoGod 2.02 | 3.0 | 15.4% | 27 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.2 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 6.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 91.1 | 24 / 35 | 8144 |
| 2 | 1 | 70.6 | 81.9 | 15 / 35 | 7585 |
| 3 | 1 | 72.1 | 85.4 | 19 / 35 | 8336 |
| 4 | 1 | 68.6 | 74.9 | 14 / 35 | 7064 |
| 5 | 1 | 71.8 | 83.2 | 17 / 35 | 8024 |
| 6 | 1 | 70.3 | 80.3 | 19 / 35 | 7375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 95 | 75% |
| mz.NanoGod 2.02 | 17 | 35% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| drd.Dreadknoght 0.9 | 10 | 90% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 43 | 42% | 54 |
| wompi.Wallaby 5.1 | 38 | 37% | 113 |
| ayk.WallHugger 1.0 | 9 | 9% | 13 |
| exauge.GateKeeper 1.1.121g | 8 | 8% | 15 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.1 | 84 / 210 | 4.14 | 15.0% | 28437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.2 | 15.0% | 84 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 31 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.2 | 11.9% | 31 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.2% | 18 |
| bvh.micro.Freya 0.3 | 4.7 | 10.7% | 17 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 12 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 1 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.8% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 55.2 | 12 / 35 | 4545 |
| 2 | 1 | 63.4 | 68.9 | 14 / 35 | 4941 |
| 3 | 1 | 60.0 | 58.7 | 11 / 35 | 4714 |
| 4 | 1 | 64.7 | 74.0 | 17 / 35 | 4727 |
| 5 | 1 | 62.5 | 68.9 | 15 / 35 | 4410 |
| 6 | 1 | 62.3 | 64.8 | 15 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 73% |
| dummy.micro.Sparrow 2.5 | 17 | 94% |
| bvh.micro.Freya 0.3 | 14 | 86% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 24% | 54 |
| voidious.micro.BlitzBat 1.05 | 21 | 17% | 48 |
| conscience.Electron 1.3g | 17 | 13% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 13% | 18 |
| dummy.micro.Sparrow 2.5 | 16 | 13% | 29 |
| dl.BetterWalls 1.0 | 10 | 8% | 11 |
| bvh.micro.Freya 0.3 | 9 | 7% | 14 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.1 | 142 / 210 | 2.43 | 20.8% | 44110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 20.8% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 26 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.4% | 14 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 4 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 1 |
| sample.Corners 1.0 | 8.7 | 5.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.2% | 6 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 92.7 | 27 / 35 | 8148 |
| 2 | 1 | 71.3 | 87.0 | 26 / 35 | 7043 |
| 3 | 1 | 69.7 | 78.1 | 21 / 35 | 7399 |
| 4 | 1 | 69.4 | 79.7 | 21 / 35 | 7182 |
| 5 | 1 | 71.9 | 86.7 | 24 / 35 | 7597 |
| 6 | 1 | 69.8 | 80.6 | 23 / 35 | 6741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 41 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 40 | 93% |
| supersample.SuperBoxBot 1.0 | 20 | 85% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| dsw.StaticD 1.0 | 9 | 78% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 37% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 26% | 62 |
| dsw.StaticD 1.0 | 8 | 11% | 17 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 11 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 7 |
| sul.Lunar 1.1 | 3 | 4% | 46 |
| sample.Corners 1.0 | 3 | 4% | 10 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWCR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.0 | 98 / 210 | 3.52 | 16.7% | 36133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCR 0.1 | 1.0 | 16.7% | 98 |
| radnor.DoctorBob 1.42 | 2.3 | 13.5% | 32 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.0% | 26 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 11 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.6% | 10 |
| sample.Walls 1.0 | 6.8 | 8.1% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 7.7% | 1 |
| jangs.ns51 1.0 | 9.0 | 6.4% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 72.7 | 18 / 35 | 6548 |
| 2 | 1 | 64.1 | 69.2 | 15 / 35 | 5882 |
| 3 | 1 | 67.3 | 77.5 | 18 / 35 | 6507 |
| 4 | 1 | 66.9 | 77.8 | 22 / 35 | 5875 |
| 5 | 1 | 63.7 | 69.2 | 13 / 35 | 5666 |
| 6 | 1 | 63.1 | 65.7 | 12 / 35 | 5655 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 91% |
| radnor.DoctorBob 1.42 | 31 | 74% |
| mld.Wisdom 1.0 | 18 | 50% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 30% | 42 |
| radnor.DoctorBob 1.42 | 24 | 21% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 19% | 55 |
| KiraNL.Chupacabra 0.4 | 14 | 12% | 22 |
| sample.Walls 1.0 | 9 | 8% | 18 |
| amz.NanoClone 1.41 | 6 | 5% | 11 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

