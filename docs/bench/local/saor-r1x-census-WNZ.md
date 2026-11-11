# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 84.9 | 131 / 210 | 2.36 | 20.4% | 42887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.4% | 131 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 31 |
| mz.AntiGrav 1.0 | 2.8 | 14.3% | 21 |
| mld.Infinity 2.2 | 3.7 | 12.5% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 10 |
| sample.Walls 1.0 | 6.0 | 7.5% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 1 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.9 | 20 / 35 | 7046 |
| 2 | 1 | 71.9 | 87.6 | 24 / 35 | 7373 |
| 3 | 1 | 68.8 | 76.5 | 18 / 35 | 6897 |
| 4 | 1 | 72.0 | 88.3 | 24 / 35 | 7371 |
| 5 | 1 | 71.5 | 88.9 | 22 / 35 | 6944 |
| 6 | 1 | 71.4 | 85.1 | 23 / 35 | 7256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 92% |
| mld.Infinity 2.2 | 31 | 97% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 35% | 65 |
| mz.AntiGrav 1.0 | 17 | 21% | 65 |
| amz.NanoClone 1.41 | 13 | 16% | 18 |
| mld.Infinity 2.2 | 8 | 10% | 30 |
| sample.Walls 1.0 | 7 | 9% | 12 |
| GarmBox.Oranges 1.0 | 4 | 5% | 5 |
| jangs.ns51 1.0 | 3 | 4% | 11 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.2 | 93 / 210 | 3.23 | 16.6% | 31398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.5 | 16.6% | 93 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 67 |
| mld.DustBunny 3.8 | 3.0 | 13.4% | 19 |
| maribo.melee.BMV 0.1 | 3.8 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.5% | 9 |
| zyx.nano.Ant 1.1 | 6.3 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.5% | 14 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 6.3% | 4 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.3 | 19 / 35 | 5621 |
| 2 | 1 | 68.2 | 83.8 | 21 / 35 | 6032 |
| 3 | 1 | 64.8 | 75.6 | 13 / 35 | 4976 |
| 4 | 1 | 68.5 | 87.6 | 19 / 35 | 5393 |
| 5 | 4 | 52.9 | 40.3 | 4 / 35 | 4132 |
| 6 | 1 | 67.1 | 82.5 | 17 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 58% |
| mld.DustBunny 3.8 | 37 | 81% |
| djdjdj.NanoSkunk10 1.0 | 13 | 100% |
| maribo.melee.BMV 0.1 | 8 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 30% | 74 |
| mld.DustBunny 3.8 | 26 | 22% | 56 |
| maribo.melee.BMV 0.1 | 15 | 13% | 17 |
| cs.Grudge 1.0 | 10 | 9% | 11 |
| zyx.nano.Ant 1.1 | 9 | 8% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 6% | 15 |
| fullsail.SweetTea 1.1 | 6 | 5% | 8 |
| bzdp.BoxCar 2.0 | 6 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 8 |

## Melee bench: F03

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 75.8 | 93 / 210 | 3.18 | 17.6% | 35471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.6% | 93 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 51 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.5% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.5% | 31 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.0% | 13 |
| fm.mammillarias 1.3 | 5.8 | 9.0% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 2 |
| sample.Fire 1.0 | 9.3 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 76.8 | 18 / 35 | 6299 |
| 2 | 1 | 66.3 | 74.9 | 13 / 35 | 5940 |
| 3 | 1 | 66.7 | 76.2 | 17 / 35 | 5858 |
| 4 | 1 | 65.6 | 73.7 | 13 / 35 | 5616 |
| 5 | 1 | 65.6 | 71.1 | 13 / 35 | 5841 |
| 6 | 1 | 68.2 | 81.9 | 19 / 35 | 5917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 34 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 77% |
| myl.nano.KomoriNinja 1.1 | 19 | 79% |
| cb.nano.Insomnia 1.0 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 5 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 32 | 27% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 22% | 41 |
| fm.mammillarias 1.3 | 19 | 16% | 23 |
| myl.nano.KomoriNinja 1.1 | 18 | 15% | 43 |
| cb.nano.Insomnia 1.0 | 10 | 9% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 6 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 9 |
| sample.Fire 1.0 | 3 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.0 | 150 / 210 | 2.26 | 20.4% | 39814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.4% | 150 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 24 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.6% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.5% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 5 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.0 | 27 / 35 | 6689 |
| 2 | 1 | 70.5 | 87.6 | 24 / 35 | 6670 |
| 3 | 1 | 71.1 | 88.9 | 29 / 35 | 6534 |
| 4 | 1 | 72.0 | 91.7 | 28 / 35 | 7210 |
| 5 | 1 | 67.9 | 77.5 | 21 / 35 | 6123 |
| 6 | 1 | 69.2 | 83.5 | 21 / 35 | 6588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 90% |
| stelo.SoJNanoMelee 1.1 | 36 | 94% |
| tj.zombie1n 1.0.1 | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 85% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 42% | 97 |
| stelo.SoJNanoMelee 1.1 | 10 | 17% | 31 |
| tj.zombie1n 1.0.1 | 10 | 17% | 12 |
| yk.JahMicro 1.0 | 5 | 8% | 13 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 19 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.6 | 89 / 210 | 3.65 | 15.8% | 29110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 15.8% | 89 |
| oog.melee.Corsair 1.0 | 2.7 | 12.2% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.7% | 25 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 31 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 12 |
| sam.Samspin 1.0 | 7.0 | 9.3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 70.5 | 13 / 35 | 4758 |
| 2 | 1 | 62.6 | 69.2 | 15 / 35 | 4431 |
| 3 | 1 | 64.9 | 74.6 | 15 / 35 | 5201 |
| 4 | 1 | 60.0 | 61.9 | 11 / 35 | 4404 |
| 5 | 1 | 63.4 | 68.3 | 15 / 35 | 5093 |
| 6 | 1 | 66.1 | 79.0 | 20 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 84% |
| ahf.NanoAndrew .4 | 22 | 86% |
| oog.melee.Corsair 1.0 | 20 | 55% |
| sam.Samspin 1.0 | 13 | 92% |
| EBBU.Sim2 1.02 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| sample.TrackFire 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 48 |
| robar.nano.Assertive_Melee 0.2 | 24 | 20% | 30 |
| oog.melee.Corsair 1.0 | 21 | 17% | 34 |
| ahf.NanoAndrew .4 | 15 | 12% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 13 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 16 |
| EBBU.Sim2 1.02 | 8 | 7% | 17 |
| sam.Samspin 1.0 | 7 | 6% | 18 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.9 | 130 / 210 | 2.45 | 18.7% | 32640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 18.7% | 130 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 6 |
| fm.claire 1.7 | 6.3 | 8.4% | 0 |
| sample.SpinBot 1.0 | 8.2 | 7.2% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 3 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 24 / 35 | 5387 |
| 2 | 1 | 67.0 | 82.5 | 18 / 35 | 5137 |
| 3 | 1 | 70.5 | 92.1 | 25 / 35 | 5748 |
| 4 | 1 | 64.8 | 72.4 | 20 / 35 | 4885 |
| 5 | 1 | 69.4 | 86.3 | 20 / 35 | 6002 |
| 6 | 1 | 68.2 | 84.4 | 23 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 89% |
| oog.melee.CapuletDroid 1.1 | 27 | 93% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| arthord.NanoSatanMelee Beta | 14 | 71% |
| kurios.DOSexe .9b | 6 | 67% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 36% | 95 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 36 |
| gh.nano.Grofvuil 0.2 | 9 | 11% | 23 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 14 |
| fm.claire 1.7 | 8 | 10% | 10 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 15 |
| sample.SpinBot 1.0 | 6 | 8% | 9 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.6 | 83 / 210 | 3.20 | 17.1% | 34415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.3 | 17.1% | 83 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.2% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 12.8% | 37 |
| DBall.Anarchy 0.1 | 5.2 | 9.0% | 6 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.1% | 4 |
| acogdev.alpha 0.2 | 7.7 | 6.6% | 2 |
| el.JumpShoot 0.2 | 8.3 | 6.3% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.9 | 19 / 35 | 6104 |
| 2 | 1 | 67.3 | 79.7 | 14 / 35 | 5976 |
| 3 | 2 | 65.1 | 72.7 | 10 / 35 | 5598 |
| 4 | 1 | 65.4 | 74.6 | 15 / 35 | 5420 |
| 5 | 2 | 63.3 | 69.2 | 12 / 35 | 5076 |
| 6 | 1 | 66.6 | 74.3 | 13 / 35 | 6241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 88% |
| mz.MicroGodMelee 1 | 32 | 59% |
| gh.micro.Gruweltje 0.7 | 20 | 65% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 28% | 51 |
| spinnercat.micro.Tyger 0.1 | 28 | 22% | 59 |
| gh.micro.Gruweltje 0.7 | 28 | 22% | 50 |
| caimano.Furia_Ceca 0.22 | 13 | 10% | 14 |
| DBall.Anarchy 0.1 | 6 | 5% | 12 |
| acogdev.alpha 0.2 | 6 | 5% | 6 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| el.JumpShoot 0.2 | 4 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.6 | 94 / 210 | 3.73 | 16.0% | 31742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.3 | 16.0% | 94 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.9% | 64 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.5% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 3 |
| germ.TheMind .2 | 5.5 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 7 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 4 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.9 | 17 / 35 | 5446 |
| 2 | 1 | 63.9 | 67.9 | 15 / 35 | 5558 |
| 3 | 1 | 63.9 | 69.5 | 17 / 35 | 5062 |
| 4 | 2 | 65.1 | 71.4 | 15 / 35 | 5409 |
| 5 | 1 | 65.7 | 76.8 | 17 / 35 | 5381 |
| 6 | 2 | 62.1 | 63.2 | 13 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| germ.TheMind .2 | 6 | 83% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 38% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 16% | 37 |
| germ.TheMind .2 | 17 | 15% | 24 |
| stelo.UntouchableNano 1.3 | 14 | 12% | 17 |
| qualidafial.MajorDick 1.0.1 | 9 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 12 |
| awesomeness.Elite 1.0 | 5 | 4% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.7 | 118 / 210 | 2.73 | 18.1% | 30681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 18.1% | 118 |
| rz.HawkOnFire 0.1 | 2.3 | 13.7% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.9% | 20 |
| maribo.IotaCT 1.1 | 4.0 | 11.2% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 6.2 | 8.9% | 8 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.4% | 10 |
| stelo.PatternRobot 1.0 | 8.2 | 7.8% | 11 |
| spinnercat.Omen 1.0 | 8.8 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.5 | 20 / 35 | 5192 |
| 2 | 1 | 69.9 | 87.6 | 23 / 35 | 5200 |
| 3 | 1 | 67.1 | 78.1 | 19 / 35 | 4782 |
| 4 | 1 | 64.4 | 70.5 | 14 / 35 | 4846 |
| 5 | 1 | 68.8 | 82.9 | 20 / 35 | 5412 |
| 6 | 1 | 68.5 | 81.9 | 22 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 62 | 85% |
| nz.jdc.nano.GridFu 1.0 | 21 | 95% |
| stelo.PatternRobot 1.0 | 17 | 82% |
| maribo.IotaCT 1.1 | 15 | 93% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| timmit.nano.TimDog 0.33 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 25 | 27% | 67 |
| nz.jdc.nano.GridFu 1.0 | 15 | 16% | 41 |
| stelo.PatternRobot 1.0 | 15 | 16% | 27 |
| ratosh.Wesco 1.4 | 12 | 13% | 20 |
| timmit.nano.TimDog 0.33 | 12 | 13% | 17 |
| maribo.IotaCT 1.1 | 8 | 9% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 9 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.7 | 147 / 210 | 2.11 | 20.2% | 38289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.2% | 147 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.8% | 19 |
| baal.nano.N 1.42 | 2.8 | 11.9% | 9 |
| zyx.micro.Ant 1.1 | 4.7 | 9.8% | 16 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.8% | 4 |
| sanja.First 0.1 | 6.0 | 8.3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.6% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 26 / 35 | 6755 |
| 2 | 1 | 70.3 | 89.5 | 26 / 35 | 6138 |
| 3 | 1 | 70.4 | 84.8 | 26 / 35 | 6885 |
| 4 | 1 | 68.9 | 86.7 | 22 / 35 | 5997 |
| 5 | 1 | 68.0 | 80.6 | 21 / 35 | 5883 |
| 6 | 1 | 71.1 | 92.7 | 26 / 35 | 6631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 50 | 88% |
| baal.nano.N 1.42 | 27 | 93% |
| cvt.Firsty 1.0 | 24 | 96% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| sanja.First 0.1 | 15 | 93% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 23 | 37% | 46 |
| tvv.nano.Polaris 1.2 | 13 | 21% | 63 |
| baal.nano.N 1.42 | 7 | 11% | 29 |
| sanja.First 0.1 | 6 | 10% | 22 |
| cvt.Firsty 1.0 | 5 | 8% | 26 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| Grystrion.TrackerWO 1.0 | 2 | 3% | 10 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.7 | 70 / 210 | 4.09 | 14.7% | 30391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 75 |
| hadur117.micro.SaorWNZ 0.1 | 1.8 | 14.7% | 70 |
| cs.Wren 1.0 | 3.3 | 12.8% | 26 |
| mz.Cork 0.1 | 3.7 | 11.6% | 14 |
| js.PinBall 1.6 | 5.0 | 10.6% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 5 |
| evd.X1 0.01 | 6.7 | 8.2% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 5 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 71.4 | 15 / 35 | 5191 |
| 2 | 2 | 60.8 | 61.0 | 10 / 35 | 5041 |
| 3 | 2 | 61.3 | 65.1 | 10 / 35 | 4899 |
| 4 | 1 | 62.3 | 66.7 | 12 / 35 | 5366 |
| 5 | 2 | 61.2 | 63.8 | 11 / 35 | 4906 |
| 6 | 2 | 61.9 | 66.0 | 12 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 70% |
| cs.Wren 1.0 | 22 | 68% |
| js.PinBall 1.6 | 7 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 41% | 100 |
| cs.Wren 1.0 | 25 | 18% | 35 |
| mz.Cork 0.1 | 14 | 10% | 19 |
| evd.X1 0.01 | 14 | 10% | 15 |
| joe.ADinosaur 1.0 | 11 | 8% | 12 |
| js.PinBall 1.6 | 9 | 6% | 14 |
| jsal.Jsalbot 1.0 | 5 | 4% | 8 |
| PSW.Relentless 0.1 | 4 | 3% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.2 | 103 / 210 | 3.05 | 17.4% | 29343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.4% | 103 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 33 |
| ntc.Opposite 1.5 | 3.8 | 11.3% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.6% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.6% | 13 |
| DBall.NUKE 0.1 | 7.7 | 8.3% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.6 | 18 / 35 | 5210 |
| 2 | 1 | 65.2 | 74.9 | 14 / 35 | 4835 |
| 3 | 1 | 65.4 | 74.3 | 18 / 35 | 4886 |
| 4 | 1 | 66.4 | 78.1 | 20 / 35 | 4906 |
| 5 | 1 | 64.3 | 73.3 | 14 / 35 | 4620 |
| 6 | 1 | 67.4 | 82.2 | 19 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| myl.nano.Graviton 1.10 | 22 | 73% |
| ntc.Opposite 1.5 | 18 | 78% |
| DBall.NUKE 0.1 | 12 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| disan.Chair 2.2.0 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 24 | 22% | 42 |
| pfvicm.Sobieski 7.2.3b | 21 | 20% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 19 | 18% | 29 |
| stelo.AreaTargetingBot 1.1 | 18 | 17% | 38 |
| ntc.Opposite 1.5 | 16 | 15% | 32 |
| disan.Chair 2.2.0 | 4 | 4% | 12 |
| pbg.R2D2 1.0 | 3 | 3% | 6 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 11 |

## Melee bench: F13

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 66.5 | 56 / 210 | 4.01 | 14.0% | 24154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.2 | 15.2% | 64 |
| hadur117.micro.SaorWNZ 0.1 | 2.2 | 14.0% | 56 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.6% | 37 |
| yagami.Tidus 0.11 | 3.8 | 12.8% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 12.2% | 23 |
| ejb.Polaris 1.0.1 | 5.5 | 10.9% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 68.3 | 12 / 35 | 4021 |
| 2 | 3 | 61.5 | 65.4 | 11 / 35 | 4015 |
| 3 | 2 | 60.7 | 64.4 | 7 / 35 | 3940 |
| 4 | 3 | 60.7 | 63.8 | 11 / 35 | 3777 |
| 5 | 2 | 62.6 | 66.7 | 6 / 35 | 4508 |
| 6 | 2 | 62.5 | 70.5 | 9 / 35 | 3893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 41% |
| kawigi.micro.Shiz 1.1 | 18 | 94% |
| yagami.Tidus 0.11 | 16 | 88% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 82% |
| ejb.Polaris 1.0.1 | 5 | 40% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 32% | 63 |
| yagami.Tidus 0.11 | 33 | 21% | 46 |
| kawigi.micro.Shiz 1.1 | 26 | 17% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 15% | 32 |
| ejb.Polaris 1.0.1 | 8 | 5% | 15 |
| stelo.MirrorNano 1.3 | 8 | 5% | 10 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.9 | 119 / 210 | 2.99 | 16.9% | 27372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 16.9% | 119 |
| bzdp.Pansy 2.1 | 2.5 | 12.3% | 22 |
| wompi.Quokka 1.6 | 3.3 | 11.7% | 20 |
| wee.Gem 1.8.4 | 4.0 | 11.5% | 27 |
| ratosh.Nobo 0.21 | 4.7 | 11.3% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 8 |
| bayen.UbaMicro 1.4 | 6.5 | 8.9% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.0 | 21 / 35 | 4502 |
| 2 | 1 | 68.4 | 88.9 | 25 / 35 | 4998 |
| 3 | 1 | 65.3 | 79.7 | 21 / 35 | 4511 |
| 4 | 1 | 67.1 | 82.5 | 21 / 35 | 4926 |
| 5 | 1 | 61.7 | 65.4 | 17 / 35 | 4231 |
| 6 | 1 | 62.4 | 70.2 | 14 / 35 | 4204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 96% |
| wee.Gem 1.8.4 | 27 | 93% |
| wompi.Quokka 1.6 | 26 | 92% |
| m3thos.Eva00 1.1 | 17 | 94% |
| ratosh.Nobo 0.21 | 11 | 73% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 16 | 18% | 36 |
| ratosh.Nobo 0.21 | 15 | 16% | 23 |
| wee.Gem 1.8.4 | 12 | 13% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 13% | 13 |
| maribo.FollowFire 1 | 12 | 13% | 13 |
| bzdp.Pansy 2.1 | 10 | 11% | 52 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 6 |
| m3thos.Eva00 1.1 | 4 | 4% | 16 |
| bayen.UbaMicro 1.4 | 4 | 4% | 10 |

## Melee bench: F15

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.2 | 127 / 210 | 2.15 | 20.9% | 45610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.9% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 53 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 23 |
| ayk.WallHugger 1.0 | 4.5 | 10.3% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 82.5 | 19 / 35 | 7432 |
| 2 | 1 | 70.7 | 81.0 | 19 / 35 | 7729 |
| 3 | 1 | 72.6 | 88.9 | 23 / 35 | 7380 |
| 4 | 1 | 72.4 | 89.8 | 21 / 35 | 7445 |
| 5 | 1 | 72.6 | 87.9 | 25 / 35 | 7671 |
| 6 | 1 | 73.2 | 93.3 | 20 / 35 | 7953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 80% |
| mz.NanoGod 2.02 | 18 | 44% |
| ayk.WallHugger 1.0 | 14 | 100% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 83 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 32 | 39% | 43 |
| wompi.Wallaby 5.1 | 27 | 33% | 114 |
| ayk.WallHugger 1.0 | 11 | 13% | 20 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 14 |
| stuff.Vlad 0.1 | 5 | 6% | 8 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 9 |

## Melee bench: F16

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.2 | 112 / 210 | 3.41 | 16.4% | 27790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 16.4% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 16 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.8% | 21 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 18 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 13 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.7 | 21 / 35 | 4996 |
| 2 | 1 | 62.2 | 68.3 | 15 / 35 | 4334 |
| 3 | 1 | 61.8 | 67.3 | 15 / 35 | 4496 |
| 4 | 1 | 65.0 | 73.3 | 21 / 35 | 4784 |
| 5 | 1 | 66.2 | 79.4 | 20 / 35 | 4625 |
| 6 | 1 | 64.5 | 72.1 | 20 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 96% |
| dummy.micro.Sparrow 2.5 | 24 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 91% |
| bvh.micro.Freya 0.3 | 18 | 83% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 67% |

Hadur died in 98 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 24 | 24% | 41 |
| voidious.micro.BlitzBat 1.05 | 23 | 23% | 60 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 15% | 43 |
| dl.BetterWalls 1.0 | 9 | 9% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 17 |
| conscience.Electron 1.3g | 7 | 7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 7% | 8 |
| bvh.micro.Freya 0.3 | 6 | 6% | 19 |

## Melee bench: F17

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.1 | 137 / 210 | 2.34 | 20.4% | 41386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 20.4% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 21 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.5% | 23 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 11 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 3 |
| dsw.StaticD 1.0 | 6.3 | 8.1% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.6% | 3 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 90.8 | 27 / 35 | 7386 |
| 2 | 1 | 71.2 | 89.5 | 23 / 35 | 6848 |
| 3 | 1 | 71.0 | 87.3 | 25 / 35 | 6691 |
| 4 | 1 | 69.9 | 81.9 | 21 / 35 | 7253 |
| 5 | 1 | 69.2 | 81.0 | 21 / 35 | 6465 |
| 6 | 1 | 69.1 | 80.3 | 20 / 35 | 6743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 92% |
| sul.Lunar 1.1 | 47 | 100% |
| supersample.SuperBoxBot 1.0 | 21 | 62% |
| dsw.StaticD 1.0 | 11 | 55% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 44% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 22% | 59 |
| dsw.StaticD 1.0 | 9 | 12% | 18 |
| mme.NikeEnhanced 2.0 | 8 | 11% | 16 |
| sul.Lunar 1.1 | 2 | 3% | 48 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 6 |
| sample.Corners 1.0 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorWNZ 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.5 | 104 / 210 | 3.11 | 17.6% | 37770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNZ 0.1 | 1.0 | 17.6% | 104 |
| radnor.DoctorBob 1.42 | 2.2 | 13.5% | 30 |
| mld.Wisdom 1.0 | 3.3 | 12.3% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.4% | 28 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.6% | 8 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 8 |
| sample.Walls 1.0 | 7.0 | 8.1% | 2 |
| GarmBox.Oranges 1.0 | 8.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.3 | 18 / 35 | 5785 |
| 2 | 1 | 67.5 | 77.1 | 22 / 35 | 6467 |
| 3 | 1 | 67.8 | 76.8 | 17 / 35 | 6630 |
| 4 | 1 | 68.2 | 81.3 | 18 / 35 | 6764 |
| 5 | 1 | 67.7 | 82.9 | 17 / 35 | 6272 |
| 6 | 1 | 63.4 | 66.7 | 12 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 93% |
| radnor.DoctorBob 1.42 | 32 | 81% |
| mld.Wisdom 1.0 | 12 | 50% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| sample.Target 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 28% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 21% | 66 |
| radnor.DoctorBob 1.42 | 20 | 19% | 54 |
| KiraNL.Chupacabra 0.4 | 14 | 13% | 19 |
| amz.NanoClone 1.41 | 11 | 10% | 14 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 6 |

