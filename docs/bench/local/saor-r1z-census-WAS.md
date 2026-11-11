# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.8 | 148 / 210 | 1.91 | 21.4% | 42708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.4% | 148 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 18 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 14 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 7 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| sample.Walls 1.0 | 6.8 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.3% | 3 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 90.2 | 26 / 35 | 7030 |
| 2 | 1 | 72.0 | 88.9 | 23 / 35 | 7408 |
| 3 | 1 | 72.9 | 91.4 | 28 / 35 | 6961 |
| 4 | 1 | 73.0 | 90.8 | 24 / 35 | 7460 |
| 5 | 1 | 72.6 | 90.2 | 25 / 35 | 7270 |
| 6 | 1 | 71.0 | 87.6 | 22 / 35 | 6579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 88% |
| radnor.DoctorBob 1.42 | 45 | 91% |
| mld.Infinity 2.2 | 31 | 97% |
| amz.NanoClone 1.41 | 6 | 67% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 40% | 74 |
| mz.AntiGrav 1.0 | 15 | 24% | 67 |
| mld.Infinity 2.2 | 7 | 11% | 39 |
| amz.NanoClone 1.41 | 7 | 11% | 14 |
| sample.Walls 1.0 | 3 | 5% | 4 |
| arthord.MannyPacquiao Beta | 3 | 5% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.7 | 150 / 210 | 1.84 | 19.7% | 32664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.7% | 150 |
| oog.melee.Mercutio 1.0 | 2.2 | 13.8% | 33 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 10 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 9.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.6% | 8 |
| fullsail.SweetTea 1.1 | 7.8 | 6.8% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 23 / 35 | 5709 |
| 2 | 1 | 70.2 | 90.8 | 25 / 35 | 5891 |
| 3 | 1 | 69.1 | 89.2 | 22 / 35 | 5604 |
| 4 | 1 | 69.5 | 90.8 | 25 / 35 | 5249 |
| 5 | 1 | 69.1 | 89.8 | 26 / 35 | 4968 |
| 6 | 1 | 70.6 | 95.2 | 29 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 92% |
| oog.melee.Mercutio 1.0 | 61 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 80% |
| fullsail.SweetTea 1.1 | 12 | 83% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 17 | 28% | 71 |
| mld.DustBunny 3.8 | 10 | 17% | 61 |
| zyx.nano.Ant 1.1 | 10 | 17% | 14 |
| djdjdj.NanoSkunk10 1.0 | 6 | 10% | 16 |
| maribo.melee.BMV 0.1 | 6 | 10% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 15 |
| fullsail.SweetTea 1.1 | 4 | 7% | 13 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 77.1 | 117 / 210 | 3.06 | 18.4% | 33961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.4% | 117 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.2% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.5% | 23 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 7 |
| fm.mammillarias 1.3 | 6.2 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.6% | 7 |
| sample.Fire 1.0 | 9.2 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 84.1 | 22 / 35 | 6005 |
| 2 | 1 | 65.8 | 70.5 | 18 / 35 | 5272 |
| 3 | 1 | 70.4 | 86.0 | 23 / 35 | 6134 |
| 4 | 1 | 69.5 | 83.8 | 22 / 35 | 5834 |
| 5 | 1 | 66.1 | 72.7 | 17 / 35 | 5411 |
| 6 | 1 | 64.5 | 65.7 | 15 / 35 | 5305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 44 | 77% |
| myl.micro.Troodon 1.10 | 35 | 94% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| myl.nano.KomoriNinja 1.1 | 16 | 88% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 5 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 20% | 49 |
| cb.nano.Insomnia 1.0 | 17 | 18% | 21 |
| myl.micro.Troodon 1.10 | 16 | 17% | 51 |
| myl.nano.KomoriNinja 1.1 | 12 | 13% | 33 |
| fm.mammillarias 1.3 | 12 | 13% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 13 |
| sample.Fire 1.0 | 6 | 6% | 12 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 10 |
| sample.Tracker 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.2 | 154 / 210 | 1.97 | 21.1% | 40066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.1% | 154 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.6% | 13 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 18 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.2% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 5.8 | 9.0% | 5 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.7% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.1 | 28 / 35 | 6676 |
| 2 | 1 | 70.3 | 89.2 | 24 / 35 | 6219 |
| 3 | 1 | 70.2 | 86.0 | 25 / 35 | 6444 |
| 4 | 1 | 70.8 | 86.3 | 24 / 35 | 6741 |
| 5 | 1 | 71.7 | 90.5 | 24 / 35 | 7194 |
| 6 | 1 | 72.2 | 92.1 | 29 / 35 | 6792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 83% |
| stelo.SoJNanoMelee 1.1 | 45 | 80% |
| tvv.micro.Antares 1.1.1 | 26 | 100% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 46% | 81 |
| stelo.SoJNanoMelee 1.1 | 15 | 27% | 37 |
| tj.zombie1n 1.0.1 | 6 | 11% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 5 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 36 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 14 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| yk.JahMicro 1.0 | 0 | 0% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.2 | 88 / 210 | 3.95 | 15.5% | 28037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.2 | 15.5% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 13.3% | 42 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 10.9% | 22 |
| ahf.NanoAndrew .4 | 3.8 | 11.6% | 30 |
| sam.Samspin 1.0 | 5.0 | 9.9% | 10 |
| EBBU.Sim2 1.02 | 6.7 | 9.3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.0% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.0 | 17 / 35 | 4723 |
| 2 | 1 | 64.8 | 73.0 | 19 / 35 | 4604 |
| 3 | 1 | 62.3 | 67.0 | 9 / 35 | 4746 |
| 4 | 1 | 65.1 | 72.1 | 16 / 35 | 4955 |
| 5 | 2 | 60.0 | 59.0 | 14 / 35 | 4199 |
| 6 | 1 | 62.0 | 65.4 | 13 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 68% |
| simonton.nano.MeleeSeed 1.8 | 31 | 87% |
| ahf.NanoAndrew .4 | 12 | 83% |
| sam.Samspin 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 47 |
| ahf.NanoAndrew .4 | 18 | 15% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 15% | 17 |
| oog.melee.Corsair 1.0 | 17 | 14% | 42 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 23 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 18 |
| EBBU.Sim2 1.02 | 8 | 7% | 14 |
| sam.Samspin 1.0 | 5 | 4% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.3 | 147 / 210 | 2.23 | 19.5% | 32649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.5% | 147 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 24 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 11 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 9.3% | 11 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.9% | 4 |
| fm.claire 1.7 | 5.7 | 8.8% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.6% | 5 |
| pa.Improved 1.0 | 9.2 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 24 / 35 | 6118 |
| 2 | 1 | 69.1 | 88.9 | 25 / 35 | 5063 |
| 3 | 1 | 68.4 | 84.8 | 23 / 35 | 5260 |
| 4 | 1 | 67.4 | 82.5 | 22 / 35 | 5025 |
| 5 | 1 | 69.2 | 85.4 | 25 / 35 | 5450 |
| 6 | 1 | 69.7 | 85.7 | 28 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 93% |
| oog.melee.CapuletDroid 1.1 | 35 | 89% |
| gh.nano.Grofvuil 0.2 | 22 | 86% |
| arthord.NanoSatanMelee Beta | 17 | 100% |
| kurios.DOSexe .9b | 5 | 40% |
| sample.SpinBot 1.0 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 22% | 66 |
| gh.nano.Grofvuil 0.2 | 10 | 16% | 37 |
| arthord.NanoSatanMelee Beta | 9 | 14% | 21 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 41 |
| fm.claire 1.7 | 7 | 11% | 10 |
| sample.SpinBot 1.0 | 6 | 9% | 8 |
| kurios.DOSexe .9b | 5 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 10 |
| pa.Improved 1.0 | 1 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.3 | 105 / 210 | 2.77 | 17.9% | 33278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.9% | 105 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.7% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 24 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 30 |
| DBall.Anarchy 0.1 | 5.2 | 8.9% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.8% | 3 |
| el.JumpShoot 0.2 | 8.8 | 6.1% | 3 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.9 | 22 / 35 | 5903 |
| 2 | 1 | 67.0 | 78.7 | 18 / 35 | 5398 |
| 3 | 1 | 65.4 | 75.6 | 14 / 35 | 5393 |
| 4 | 1 | 65.3 | 75.6 | 13 / 35 | 5301 |
| 5 | 1 | 68.3 | 84.8 | 19 / 35 | 5446 |
| 6 | 1 | 68.7 | 84.4 | 19 / 35 | 5837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 87% |
| mz.MicroGodMelee 1 | 26 | 69% |
| gh.micro.Gruweltje 0.7 | 24 | 75% |
| DBall.Anarchy 0.1 | 12 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 30% | 55 |
| gh.micro.Gruweltje 0.7 | 27 | 26% | 51 |
| spinnercat.micro.Tyger 0.1 | 15 | 14% | 56 |
| caimano.Furia_Ceca 0.22 | 11 | 10% | 12 |
| acogdev.alpha 0.2 | 8 | 8% | 8 |
| DBall.Anarchy 0.1 | 5 | 5% | 13 |
| el.JumpShoot 0.2 | 4 | 4% | 9 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.9 | 113 / 210 | 3.35 | 17.0% | 31599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.0% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.3% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.9% | 8 |
| germ.TheMind .2 | 5.0 | 9.7% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.4% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.3 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.1 | 20 / 35 | 4907 |
| 2 | 1 | 66.0 | 75.9 | 23 / 35 | 4909 |
| 3 | 1 | 67.1 | 76.2 | 20 / 35 | 5699 |
| 4 | 1 | 64.6 | 71.4 | 18 / 35 | 5003 |
| 5 | 1 | 65.5 | 70.8 | 18 / 35 | 5785 |
| 6 | 1 | 63.2 | 65.1 | 14 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 87% |
| awesomeness.Elite 1.0 | 8 | 88% |
| germ.TheMind .2 | 8 | 88% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 50% |

Hadur died in 99 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 38 | 38% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 17% | 35 |
| awesomeness.Elite 1.0 | 10 | 10% | 19 |
| germ.TheMind .2 | 9 | 9% | 22 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 7 |

## Melee bench: F09

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.8 | 161 / 210 | 1.83 | 20.4% | 30846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.4% | 161 |
| rz.HawkOnFire 0.1 | 2.5 | 13.2% | 10 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 7 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.0% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 7.6% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.8 | 31 / 35 | 5804 |
| 2 | 1 | 71.4 | 92.7 | 30 / 35 | 5204 |
| 3 | 1 | 69.8 | 86.7 | 25 / 35 | 5096 |
| 4 | 1 | 70.2 | 88.3 | 23 / 35 | 5148 |
| 5 | 1 | 70.6 | 91.1 | 28 / 35 | 4716 |
| 6 | 1 | 69.7 | 88.3 | 24 / 35 | 4878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 98% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| timmit.nano.TimDog 0.33 | 17 | 76% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| maribo.IotaCT 1.1 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |

Hadur died in 50 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 9 | 18% | 72 |
| timmit.nano.TimDog 0.33 | 9 | 18% | 20 |
| stelo.PatternRobot 1.0 | 9 | 18% | 18 |
| maribo.IotaCT 1.1 | 7 | 14% | 20 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 46 |
| ratosh.Wesco 1.4 | 6 | 12% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 11 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.2 | 166 / 210 | 1.79 | 21.1% | 37642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.1% | 166 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 15 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 8 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 0 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 10 |
| sanja.First 0.1 | 5.5 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 6.9% | 1 |
| cvt.Firsty 1.0 | 8.5 | 7.1% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.3 | 27 / 35 | 6787 |
| 2 | 1 | 71.7 | 94.9 | 31 / 35 | 6185 |
| 3 | 1 | 72.0 | 95.6 | 30 / 35 | 6319 |
| 4 | 1 | 67.7 | 78.4 | 23 / 35 | 5557 |
| 5 | 1 | 70.9 | 90.8 | 26 / 35 | 6359 |
| 6 | 1 | 71.8 | 94.3 | 29 / 35 | 6435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 86% |
| tvv.nano.Polaris 1.2 | 35 | 97% |
| cvt.Firsty 1.0 | 24 | 96% |
| sanja.First 0.1 | 21 | 95% |
| zyx.micro.Ant 1.1 | 19 | 79% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 30% | 37 |
| baal.nano.N 1.42 | 10 | 23% | 45 |
| tvv.nano.Polaris 1.2 | 5 | 11% | 45 |
| sanja.First 0.1 | 5 | 11% | 22 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 21 |
| cvt.Firsty 1.0 | 3 | 7% | 19 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 8 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.4 | 78 / 210 | 3.93 | 15.3% | 30956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.3 | 15.3% | 78 |
| kc.micro.Figment 1.0 | 1.8 | 15.2% | 66 |
| cs.Wren 1.0 | 3.2 | 12.4% | 25 |
| mz.Cork 0.1 | 4.5 | 11.1% | 9 |
| js.PinBall 1.6 | 4.5 | 11.1% | 14 |
| joe.ADinosaur 1.0 | 5.7 | 9.2% | 6 |
| evd.X1 0.01 | 7.0 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 66.3 | 12 / 35 | 4890 |
| 2 | 1 | 62.2 | 65.1 | 9 / 35 | 5299 |
| 3 | 1 | 63.3 | 69.2 | 15 / 35 | 4995 |
| 4 | 1 | 63.8 | 67.0 | 15 / 35 | 5407 |
| 5 | 2 | 63.6 | 70.2 | 14 / 35 | 4878 |
| 6 | 1 | 63.0 | 66.7 | 13 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 65% |
| cs.Wren 1.0 | 23 | 74% |
| mz.Cork 0.1 | 10 | 80% |
| joe.ADinosaur 1.0 | 6 | 100% |
| js.PinBall 1.6 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 69 | 52% | 116 |
| evd.X1 0.01 | 15 | 11% | 18 |
| cs.Wren 1.0 | 12 | 9% | 25 |
| js.PinBall 1.6 | 10 | 8% | 14 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| mz.Cork 0.1 | 8 | 6% | 12 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.3 | 130 / 210 | 2.41 | 18.9% | 29556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.9% | 130 |
| myl.nano.Graviton 1.10 | 2.3 | 11.8% | 26 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 1 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.3% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 6 |
| disan.Chair 2.2.0 | 7.3 | 7.9% | 9 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.5 | 25 / 35 | 5364 |
| 2 | 1 | 66.8 | 80.3 | 21 / 35 | 4571 |
| 3 | 1 | 66.6 | 80.0 | 18 / 35 | 5017 |
| 4 | 1 | 70.5 | 92.7 | 25 / 35 | 5231 |
| 5 | 1 | 66.5 | 79.4 | 19 / 35 | 4709 |
| 6 | 1 | 68.2 | 83.8 | 22 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 44 | 77% |
| stelo.AreaTargetingBot 1.1 | 19 | 95% |
| ntc.Opposite 1.5 | 15 | 100% |
| DBall.NUKE 0.1 | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| disan.Chair 2.2.0 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 23% | 49 |
| stelo.AreaTargetingBot 1.1 | 17 | 21% | 42 |
| pfvicm.Sobieski 7.2.3b | 16 | 20% | 29 |
| ntc.Opposite 1.5 | 10 | 12% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 21 |
| disan.Chair 2.2.0 | 4 | 5% | 14 |
| DBall.NUKE 0.1 | 3 | 4% | 12 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| donjezza.Muncho 1.0 | 1 | 1% | 11 |

## Melee bench: F13

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.9 | 89 / 210 | 3.35 | 16.2% | 26686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 16.2% | 89 |
| oog.melee.Capulet 1.2 | 2.7 | 13.3% | 49 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.0% | 25 |
| yagami.Tidus 0.11 | 3.8 | 12.4% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 13.0% | 30 |
| ejb.Polaris 1.0.1 | 6.0 | 9.9% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 67.9 | 14 / 35 | 4493 |
| 2 | 1 | 66.2 | 79.4 | 17 / 35 | 4427 |
| 3 | 1 | 62.7 | 65.4 | 12 / 35 | 4305 |
| 4 | 1 | 64.9 | 74.0 | 15 / 35 | 4451 |
| 5 | 1 | 65.7 | 76.2 | 14 / 35 | 4412 |
| 6 | 1 | 66.9 | 80.6 | 17 / 35 | 4598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 88% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 36% | 59 |
| yagami.Tidus 0.11 | 27 | 22% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 41 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 35 |
| kurios.DOSexe .9a | 8 | 7% | 8 |
| ejb.Polaris 1.0.1 | 7 | 6% | 14 |
| stelo.MirrorNano 1.3 | 4 | 3% | 8 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.0 | 137 / 210 | 2.62 | 18.0% | 27227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.0% | 137 |
| bzdp.Pansy 2.1 | 2.3 | 12.1% | 12 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 22 |
| ratosh.Nobo 0.21 | 3.8 | 11.3% | 11 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 13 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 14 |
| bayen.UbaMicro 1.4 | 7.0 | 8.7% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.3% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.2 | 26 / 35 | 4312 |
| 2 | 1 | 67.6 | 82.9 | 26 / 35 | 4490 |
| 3 | 1 | 65.7 | 78.4 | 17 / 35 | 4469 |
| 4 | 1 | 69.1 | 90.8 | 28 / 35 | 4557 |
| 5 | 1 | 66.0 | 76.8 | 22 / 35 | 4636 |
| 6 | 1 | 65.9 | 80.0 | 18 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 91% |
| wee.Gem 1.8.4 | 36 | 100% |
| wompi.Quokka 1.6 | 24 | 88% |
| ratosh.Nobo 0.21 | 19 | 79% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 23% | 60 |
| ratosh.Nobo 0.21 | 14 | 19% | 28 |
| wompi.Quokka 1.6 | 11 | 15% | 30 |
| stelo.MyAgileRobot 0.2 | 9 | 12% | 10 |
| m3thos.Eva00 1.1 | 6 | 8% | 14 |
| maribo.FollowFire 1 | 6 | 8% | 6 |
| wee.Gem 1.8.4 | 4 | 5% | 43 |
| bayen.UbaMicro 1.4 | 3 | 4% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 87.9 | 130 / 210 | 2.09 | 21.2% | 45852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.2% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 48 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 26 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.9% | 5 |
| ayk.WallHugger 1.0 | 4.5 | 9.7% | 1 |
| stuff.Vlad 0.1 | 6.2 | 7.8% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 4.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 90.8 | 23 / 35 | 7878 |
| 2 | 1 | 70.0 | 80.6 | 18 / 35 | 6828 |
| 3 | 1 | 73.2 | 91.7 | 22 / 35 | 7872 |
| 4 | 1 | 72.0 | 87.3 | 20 / 35 | 7294 |
| 5 | 1 | 73.6 | 91.7 | 26 / 35 | 8196 |
| 6 | 1 | 71.9 | 85.4 | 21 / 35 | 7784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 83% |
| mz.NanoGod 2.02 | 16 | 31% |
| ayk.WallHugger 1.0 | 12 | 100% |
| drd.Dreadknoght 0.9 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 41% | 124 |
| mz.NanoGod 2.02 | 28 | 35% | 40 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 16 |
| ayk.WallHugger 1.0 | 6 | 8% | 17 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 8 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.3 | 109 / 210 | 3.50 | 16.6% | 29072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 16.6% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 25 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 15 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.9% | 5 |
| conscience.Electron 1.3g | 6.5 | 8.7% | 2 |
| dl.BetterWalls 1.0 | 8.7 | 6.6% | 8 |
| ap.Frederick 1.1 | 9.0 | 6.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 14 / 35 | 4950 |
| 2 | 1 | 67.2 | 80.0 | 21 / 35 | 5120 |
| 3 | 1 | 65.5 | 74.3 | 19 / 35 | 5005 |
| 4 | 1 | 66.4 | 78.4 | 21 / 35 | 4877 |
| 5 | 1 | 64.5 | 70.8 | 17 / 35 | 4618 |
| 6 | 1 | 61.1 | 62.2 | 17 / 35 | 4502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 88% |
| dummy.micro.Sparrow 2.5 | 24 | 92% |
| stelo.MirrorMicro 1.0 | 12 | 92% |
| bvh.micro.Freya 0.3 | 8 | 63% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 24% | 59 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 19% | 19 |
| bvh.micro.Freya 0.3 | 14 | 14% | 18 |
| dl.BetterWalls 1.0 | 11 | 11% | 15 |
| dummy.micro.Sparrow 2.5 | 9 | 9% | 30 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 32 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 21 |
| conscience.Electron 1.3g | 8 | 8% | 14 |

## Melee bench: F17

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 86.9 | 151 / 210 | 2.18 | 21.0% | 40784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.0% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 6 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 4 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.6% | 6 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.8% | 3 |
| sample.Corners 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 84.1 | 23 / 35 | 6679 |
| 2 | 1 | 70.7 | 85.1 | 26 / 35 | 6928 |
| 3 | 1 | 71.0 | 88.3 | 25 / 35 | 6843 |
| 4 | 1 | 71.2 | 86.0 | 25 / 35 | 6738 |
| 5 | 1 | 72.6 | 91.4 | 28 / 35 | 7202 |
| 6 | 1 | 70.5 | 86.3 | 24 / 35 | 6394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 90% |
| sul.Lunar 1.1 | 48 | 100% |
| supersample.SuperBoxBot 1.0 | 29 | 83% |
| dsw.StaticD 1.0 | 12 | 67% |
| mme.NikeEnhanced 2.0 | 10 | 80% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 30% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 28% | 62 |
| mme.NikeEnhanced 2.0 | 7 | 12% | 15 |
| tlp.ThreeLeggedPig 1 | 6 | 10% | 11 |
| dsw.StaticD 1.0 | 5 | 8% | 18 |
| sul.Lunar 1.1 | 2 | 3% | 45 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| sample.Corners 1.0 | 2 | 3% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F18

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 74.7 | 97 / 210 | 3.28 | 17.0% | 35011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.0% | 97 |
| radnor.DoctorBob 1.42 | 2.0 | 13.5% | 41 |
| mld.Wisdom 1.0 | 3.8 | 12.3% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.7% | 26 |
| amz.NanoClone 1.41 | 5.2 | 10.5% | 13 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.2% | 7 |
| sample.Walls 1.0 | 7.2 | 7.7% | 5 |
| jangs.ns51 1.0 | 8.2 | 6.6% | 1 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.2 | 17 / 35 | 5440 |
| 2 | 1 | 65.3 | 73.0 | 14 / 35 | 6136 |
| 3 | 1 | 65.9 | 74.0 | 20 / 35 | 5510 |
| 4 | 1 | 66.6 | 78.7 | 14 / 35 | 6283 |
| 5 | 1 | 66.5 | 73.3 | 16 / 35 | 6492 |
| 6 | 1 | 65.0 | 73.7 | 16 / 35 | 5150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 88% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| mld.Wisdom 1.0 | 25 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 29% | 54 |
| radnor.DoctorBob 1.42 | 28 | 25% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 18% | 53 |
| KiraNL.Chupacabra 0.4 | 12 | 11% | 20 |
| amz.NanoClone 1.41 | 10 | 9% | 14 |
| GarmBox.Oranges 1.0 | 5 | 4% | 4 |
| jangs.ns51 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 1 | 1% | 5 |

