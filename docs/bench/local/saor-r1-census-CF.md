# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.2 | 98 / 210 | 2.70 | 18.9% | 40326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 18.9% | 98 |
| mz.AntiGrav 1.0 | 2.3 | 15.1% | 34 |
| radnor.DoctorBob 1.42 | 2.8 | 14.3% | 25 |
| mld.Infinity 2.2 | 3.8 | 13.7% | 37 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 8 |
| sample.Walls 1.0 | 6.2 | 7.9% | 3 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 1 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 4 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 76.5 | 9 / 35 | 6268 |
| 2 | 1 | 71.1 | 85.7 | 21 / 35 | 6828 |
| 3 | 1 | 70.1 | 84.8 | 20 / 35 | 6759 |
| 4 | 1 | 70.9 | 86.7 | 20 / 35 | 6933 |
| 5 | 1 | 68.5 | 78.1 | 16 / 35 | 6585 |
| 6 | 1 | 67.9 | 75.2 | 12 / 35 | 6953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 52 | 77% |
| mld.Infinity 2.2 | 35 | 77% |
| radnor.DoctorBob 1.42 | 30 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 3 | 33% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 34 | 30% | 94 |
| radnor.DoctorBob 1.42 | 33 | 29% | 56 |
| mld.Infinity 2.2 | 20 | 18% | 15 |
| amz.NanoClone 1.41 | 16 | 14% | 19 |
| sample.Walls 1.0 | 4 | 4% | 12 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| arthord.MannyPacquiao Beta | 2 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 77.8 | 79 / 210 | 3.00 | 16.5% | 29103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.3 | 16.5% | 79 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.3% | 78 |
| mld.DustBunny 3.8 | 2.3 | 14.6% | 26 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 6 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.1% | 8 |
| fullsail.SweetTea 1.1 | 7.5 | 7.5% | 3 |
| bzdp.BoxCar 2.0 | 9.2 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 82.2 | 15 / 35 | 4860 |
| 2 | 1 | 67.9 | 85.4 | 18 / 35 | 5075 |
| 3 | 1 | 66.7 | 87.0 | 12 / 35 | 5252 |
| 4 | 3 | 58.0 | 50.5 | 4 / 35 | 4549 |
| 5 | 1 | 66.1 | 81.3 | 15 / 35 | 4729 |
| 6 | 1 | 65.7 | 80.3 | 15 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 58% |
| mld.DustBunny 3.8 | 35 | 60% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 40% |
| maribo.melee.BMV 0.1 | 4 | 50% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 45 | 34% | 66 |
| oog.melee.Mercutio 1.0 | 34 | 26% | 71 |
| zyx.nano.Ant 1.1 | 14 | 11% | 16 |
| fullsail.SweetTea 1.1 | 9 | 7% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 6% | 12 |
| maribo.melee.BMV 0.1 | 7 | 5% | 9 |
| cs.Grudge 1.0 | 7 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 10 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.5 | 50 / 210 | 3.39 | 16.3% | 32553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.2 | 16.3% | 50 |
| myl.micro.Troodon 1.10 | 1.8 | 15.5% | 75 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.1% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.9% | 50 |
| fm.mammillarias 1.3 | 5.3 | 10.1% | 7 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 13 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.7 | 9 / 35 | 5631 |
| 2 | 1 | 64.7 | 70.8 | 9 / 35 | 5755 |
| 3 | 1 | 65.8 | 75.2 | 9 / 35 | 5437 |
| 4 | 2 | 64.9 | 72.1 | 8 / 35 | 5439 |
| 5 | 1 | 63.9 | 74.6 | 7 / 35 | 5073 |
| 6 | 1 | 65.3 | 76.5 | 8 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 48% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 15% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| myl.nano.KomoriNinja 1.1 | 7 | 43% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 71% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 160 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 28% | 49 |
| myl.micro.Troodon 1.10 | 44 | 28% | 69 |
| fm.mammillarias 1.3 | 27 | 17% | 27 |
| myl.nano.KomoriNinja 1.1 | 16 | 10% | 26 |
| cb.nano.Insomnia 1.0 | 13 | 8% | 13 |
| cs.sheldor.Talon 1.1 | 6 | 4% | 9 |
| sample.Fire 1.0 | 5 | 3% | 8 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 8 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.2 | 97 / 210 | 2.60 | 18.6% | 36563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 18.6% | 97 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.5% | 38 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 10.1% | 38 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.3% | 3 |
| yk.JahMicro 1.0 | 7.3 | 7.5% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 17 / 35 | 6255 |
| 2 | 1 | 66.1 | 73.3 | 13 / 35 | 6116 |
| 3 | 1 | 66.7 | 80.6 | 15 / 35 | 5609 |
| 4 | 1 | 69.3 | 86.7 | 19 / 35 | 6352 |
| 5 | 1 | 65.4 | 75.9 | 11 / 35 | 5519 |
| 6 | 1 | 70.9 | 91.7 | 22 / 35 | 6712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 41 | 59% |
| stelo.SoJNanoMelee 1.1 | 32 | 47% |
| tvv.micro.Antares 1.1.1 | 25 | 96% |
| tj.zombie1n 1.0.1 | 15 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| sample.VelociRobot 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 6 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 44% | 85 |
| stelo.SoJNanoMelee 1.1 | 32 | 27% | 51 |
| tj.zombie1n 1.0.1 | 14 | 12% | 15 |
| tvv.micro.Antares 1.1.1 | 7 | 6% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 15 |
| sample.VelociRobot 1.0 | 3 | 3% | 6 |
| repositorio.NanoStep 1.0 | 2 | 2% | 6 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.8 | 83 / 210 | 3.27 | 16.3% | 28867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 16.3% | 83 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 39 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.4% | 19 |
| EBBU.Sim2 1.02 | 5.0 | 9.8% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 20 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.6 | 14 / 35 | 5102 |
| 2 | 1 | 64.5 | 75.2 | 15 / 35 | 4751 |
| 3 | 1 | 63.4 | 71.7 | 14 / 35 | 4689 |
| 4 | 1 | 64.8 | 79.0 | 13 / 35 | 4736 |
| 5 | 1 | 62.3 | 72.1 | 12 / 35 | 4391 |
| 6 | 1 | 65.0 | 75.2 | 15 / 35 | 5198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 63% |
| simonton.nano.MeleeSeed 1.8 | 36 | 81% |
| ahf.NanoAndrew .4 | 19 | 53% |
| sam.Samspin 1.0 | 15 | 53% |
| EBBU.Sim2 1.02 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 20% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 18 | 14% | 42 |
| sam.Samspin 1.0 | 18 | 14% | 28 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 41 |
| ahf.NanoAndrew .4 | 17 | 13% | 28 |
| EBBU.Sim2 1.02 | 17 | 13% | 24 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 16 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 7% | 10 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.6 | 85 / 210 | 2.66 | 17.7% | 31585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.2 | 17.7% | 85 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.9% | 69 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 24 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.6% | 4 |
| fm.claire 1.7 | 6.5 | 8.3% | 3 |
| sample.SpinBot 1.0 | 7.7 | 7.7% | 7 |
| pa.Improved 1.0 | 9.2 | 6.1% | 3 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.0 | 12 / 35 | 5182 |
| 2 | 1 | 66.9 | 81.9 | 15 / 35 | 5323 |
| 3 | 2 | 66.5 | 81.0 | 12 / 35 | 5364 |
| 4 | 1 | 66.8 | 81.9 | 15 / 35 | 5030 |
| 5 | 1 | 67.1 | 81.6 | 15 / 35 | 5536 |
| 6 | 1 | 66.0 | 77.1 | 16 / 35 | 5150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 39% |
| oog.melee.CapuletDroid 1.1 | 20 | 75% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| sample.SpinBot 1.0 | 12 | 92% |
| arthord.NanoSatanMelee Beta | 8 | 100% |
| fm.claire 1.7 | 5 | 60% |
| kurios.DOSexe .9b | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 33% |

Hadur died in 129 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 53% | 100 |
| sample.SpinBot 1.0 | 14 | 11% | 24 |
| oog.melee.CapuletDroid 1.1 | 14 | 11% | 12 |
| gh.nano.Grofvuil 0.2 | 9 | 7% | 26 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 16 |
| fm.claire 1.7 | 9 | 7% | 10 |
| pa.Improved 1.0 | 3 | 2% | 10 |
| kurios.DOSexe .9b | 2 | 2% | 8 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.4 | 60 / 210 | 2.95 | 16.7% | 31913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.2 | 16.7% | 60 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.2% | 45 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.7% | 56 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 31 |
| DBall.Anarchy 0.1 | 5.0 | 8.7% | 9 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 5 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 3 |
| fire219.CatBot 1.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.7 | 11 / 35 | 5284 |
| 2 | 1 | 67.0 | 83.5 | 10 / 35 | 5418 |
| 3 | 1 | 66.0 | 78.1 | 13 / 35 | 5313 |
| 4 | 2 | 65.8 | 76.2 | 10 / 35 | 5465 |
| 5 | 1 | 66.4 | 83.5 | 9 / 35 | 5070 |
| 6 | 1 | 64.5 | 75.2 | 7 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 28% |
| mz.MicroGodMelee 1 | 33 | 64% |
| gh.micro.Gruweltje 0.7 | 29 | 38% |
| DBall.Anarchy 0.1 | 12 | 100% |
| el.JumpShoot 0.2 | 6 | 33% |
| caimano.Furia_Ceca 0.22 | 4 | 50% |
| mbro.Detektor3 0.1.1 | 2 | 50% |

Hadur died in 150 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 41% | 74 |
| gh.micro.Gruweltje 0.7 | 29 | 19% | 41 |
| mz.MicroGodMelee 1 | 18 | 12% | 39 |
| caimano.Furia_Ceca 0.22 | 17 | 11% | 18 |
| el.JumpShoot 0.2 | 9 | 6% | 11 |
| mbro.Detektor3 0.1.1 | 5 | 3% | 6 |
| acogdev.alpha 0.2 | 5 | 3% | 5 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 12 |

## Melee bench: F08

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 60 / 210 | 3.56 | 16.0% | 32103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.5% | 78 |
| hadur117.micro.SaorCF 0.1 | 1.7 | 16.0% | 60 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.8% | 29 |
| germ.TheMind .2 | 4.3 | 9.8% | 15 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.0% | 8 |
| awesomeness.Elite 1.0 | 6.8 | 7.9% | 8 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.6% | 2 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 70.2 | 10 / 35 | 5222 |
| 2 | 2 | 63.7 | 68.9 | 9 / 35 | 5302 |
| 3 | 1 | 63.5 | 67.9 | 11 / 35 | 5577 |
| 4 | 2 | 63.5 | 71.7 | 10 / 35 | 4967 |
| 5 | 1 | 65.4 | 74.9 | 11 / 35 | 5480 |
| 6 | 2 | 65.8 | 75.9 | 9 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 64 | 42% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 60% |
| awesomeness.Elite 1.0 | 7 | 71% |
| germ.TheMind .2 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 45% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 21% | 49 |
| stelo.UntouchableNano 1.3 | 16 | 11% | 19 |
| germ.TheMind .2 | 14 | 9% | 18 |
| qualidafial.MajorDick 1.0.1 | 7 | 5% | 8 |
| awesomeness.Elite 1.0 | 5 | 3% | 9 |
| sample.Crazy 1.0 | 5 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5 | 3% | 5 |

## Melee bench: F09

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.2 | 91 / 210 | 2.69 | 17.6% | 28325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 17.6% | 91 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 47 |
| maribo.IotaCT 1.1 | 3.5 | 11.8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.9% | 14 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 8.0% | 18 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.3 | 11 / 35 | 4481 |
| 2 | 1 | 69.4 | 88.6 | 22 / 35 | 4967 |
| 3 | 1 | 67.8 | 82.5 | 18 / 35 | 4674 |
| 4 | 1 | 65.5 | 77.8 | 12 / 35 | 4633 |
| 5 | 1 | 66.1 | 80.6 | 14 / 35 | 4465 |
| 6 | 1 | 68.1 | 83.5 | 14 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 41% |
| nz.jdc.nano.GridFu 1.0 | 32 | 88% |
| maribo.IotaCT 1.1 | 19 | 63% |
| stelo.PatternRobot 1.0 | 12 | 33% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |

Hadur died in 119 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 45 | 38% | 61 |
| stelo.PatternRobot 1.0 | 24 | 20% | 28 |
| nz.jdc.nano.GridFu 1.0 | 12 | 10% | 47 |
| maribo.IotaCT 1.1 | 11 | 9% | 26 |
| ratosh.Wesco 1.4 | 11 | 9% | 16 |
| timmit.nano.TimDog 0.33 | 10 | 8% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 3% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.2 | 112 / 210 | 2.15 | 19.5% | 36920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 19.5% | 112 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 20 |
| baal.nano.N 1.42 | 3.2 | 11.3% | 9 |
| zyx.micro.Ant 1.1 | 4.3 | 10.4% | 29 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.7% | 3 |
| sanja.First 0.1 | 6.2 | 8.9% | 11 |
| cvt.Firsty 1.0 | 7.8 | 7.6% | 21 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.8% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 18 / 35 | 6042 |
| 2 | 1 | 69.7 | 89.2 | 20 / 35 | 6251 |
| 3 | 1 | 69.2 | 84.8 | 20 / 35 | 6351 |
| 4 | 1 | 67.6 | 86.7 | 16 / 35 | 5647 |
| 5 | 1 | 69.2 | 89.2 | 17 / 35 | 6143 |
| 6 | 1 | 70.3 | 89.2 | 21 / 35 | 6486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 27 | 96% |
| tvv.nano.Polaris 1.2 | 26 | 92% |
| sanja.First 0.1 | 23 | 70% |
| zyx.micro.Ant 1.1 | 23 | 26% |
| cvt.Firsty 1.0 | 20 | 45% |
| Grystrion.TrackerWO 1.0 | 18 | 78% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 47 | 47% | 59 |
| cvt.Firsty 1.0 | 18 | 18% | 32 |
| sanja.First 0.1 | 9 | 9% | 24 |
| tvv.nano.Polaris 1.2 | 7 | 7% | 28 |
| Grystrion.TrackerWO 1.0 | 6 | 6% | 14 |
| baal.nano.N 1.42 | 4 | 4% | 37 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 7 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 5 |
| sample.RamFire 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 68.6 | 47 / 210 | 3.82 | 14.9% | 30362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.9% | 98 |
| hadur117.micro.SaorCF 0.1 | 1.8 | 14.9% | 47 |
| cs.Wren 1.0 | 3.2 | 13.0% | 29 |
| mz.Cork 0.1 | 4.5 | 10.8% | 10 |
| js.PinBall 1.6 | 4.5 | 11.0% | 14 |
| joe.ADinosaur 1.0 | 5.8 | 9.2% | 0 |
| evd.X1 0.01 | 7.3 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.5% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 5.4% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 68.9 | 7 / 35 | 5268 |
| 2 | 2 | 61.2 | 64.1 | 5 / 35 | 4878 |
| 3 | 1 | 62.3 | 70.8 | 9 / 35 | 4813 |
| 4 | 2 | 63.3 | 69.8 | 11 / 35 | 5219 |
| 5 | 2 | 62.7 | 70.5 | 6 / 35 | 5213 |
| 6 | 2 | 62.0 | 67.6 | 9 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 34% |
| cs.Wren 1.0 | 19 | 37% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 3 | 33% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 77 | 47% | 100 |
| cs.Wren 1.0 | 33 | 20% | 41 |
| evd.X1 0.01 | 18 | 11% | 20 |
| mz.Cork 0.1 | 11 | 7% | 14 |
| PSW.Relentless 0.1 | 10 | 6% | 10 |
| joe.ADinosaur 1.0 | 6 | 4% | 9 |
| js.PinBall 1.6 | 5 | 3% | 8 |
| jsal.Jsalbot 1.0 | 5 | 3% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.5 | 82 / 210 | 3.11 | 16.7% | 28031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 16.7% | 82 |
| myl.nano.Graviton 1.10 | 2.5 | 11.7% | 37 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.5% | 7 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.3% | 8 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 11 |
| DBall.NUKE 0.1 | 7.3 | 8.1% | 5 |
| donjezza.Muncho 1.0 | 8.7 | 7.1% | 15 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.5 | 19 / 35 | 5124 |
| 2 | 1 | 63.5 | 73.7 | 12 / 35 | 4582 |
| 3 | 1 | 61.2 | 66.3 | 9 / 35 | 4453 |
| 4 | 1 | 65.7 | 76.8 | 18 / 35 | 4721 |
| 5 | 1 | 65.3 | 79.4 | 12 / 35 | 4836 |
| 6 | 1 | 64.8 | 79.4 | 12 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 53% |
| myl.nano.Graviton 1.10 | 20 | 50% |
| ntc.Opposite 1.5 | 15 | 67% |
| disan.Chair 2.2.0 | 14 | 79% |
| donjezza.Muncho 1.0 | 12 | 67% |
| DBall.NUKE 0.1 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| pbg.R2D2 1.0 | 1 | 0% |

Hadur died in 131 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 22% | 48 |
| ntc.Opposite 1.5 | 25 | 19% | 33 |
| stelo.AreaTargetingBot 1.1 | 23 | 18% | 33 |
| pfvicm.Sobieski 7.2.3b | 20 | 15% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 9% | 21 |
| donjezza.Muncho 1.0 | 8 | 6% | 17 |
| disan.Chair 2.2.0 | 6 | 5% | 10 |
| pbg.R2D2 1.0 | 6 | 5% | 9 |
| DBall.NUKE 0.1 | 2 | 2% | 15 |

## Melee bench: F13

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 67.0 | 43 / 210 | 3.97 | 13.9% | 23965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.3 | 15.5% | 70 |
| hadur117.micro.SaorCF 0.1 | 2.8 | 13.9% | 43 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 52 |
| yagami.Tidus 0.11 | 3.3 | 13.3% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.2% | 21 |
| ejb.Polaris 1.0.1 | 6.0 | 9.7% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.3% | 2 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 67.0 | 6 / 35 | 3809 |
| 2 | 3 | 60.2 | 62.5 | 6 / 35 | 3965 |
| 3 | 2 | 63.5 | 71.7 | 8 / 35 | 4600 |
| 4 | 3 | 62.6 | 73.7 | 6 / 35 | 3793 |
| 5 | 5 | 56.4 | 54.9 | 2 / 35 | 3645 |
| 6 | 1 | 63.9 | 72.1 | 15 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 42% |
| oog.melee.Capulet 1.2 | 21 | 29% |
| yagami.Tidus 0.11 | 20 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 90% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 55 | 33% | 60 |
| oog.melee.Capulet 1.2 | 48 | 29% | 56 |
| yagami.Tidus 0.11 | 32 | 19% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 6% | 21 |
| stelo.MirrorNano 1.3 | 7 | 4% | 8 |
| ejb.Polaris 1.0.1 | 6 | 4% | 12 |
| step.nanoPri 1.0 | 6 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.6 | 103 / 210 | 3.01 | 17.0% | 28334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 17.0% | 103 |
| wee.Gem 1.8.4 | 2.8 | 11.9% | 28 |
| bzdp.Pansy 2.1 | 3.2 | 12.4% | 28 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 12 |
| wompi.Quokka 1.6 | 4.3 | 11.1% | 16 |
| m3thos.Eva00 1.1 | 5.3 | 10.5% | 14 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.3 | 17 / 35 | 4914 |
| 2 | 1 | 67.7 | 82.9 | 17 / 35 | 5260 |
| 3 | 1 | 65.4 | 74.0 | 19 / 35 | 5058 |
| 4 | 1 | 64.0 | 73.7 | 16 / 35 | 4326 |
| 5 | 1 | 66.2 | 81.3 | 19 / 35 | 4574 |
| 6 | 1 | 64.8 | 79.7 | 15 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 83% |
| wee.Gem 1.8.4 | 29 | 72% |
| wompi.Quokka 1.6 | 23 | 83% |
| ratosh.Nobo 0.21 | 17 | 82% |
| m3thos.Eva00 1.1 | 11 | 55% |
| bayen.UbaMicro 1.4 | 4 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 108 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 22 | 20% | 29 |
| bzdp.Pansy 2.1 | 15 | 14% | 58 |
| wee.Gem 1.8.4 | 14 | 13% | 36 |
| ratosh.Nobo 0.21 | 12 | 11% | 26 |
| wompi.Quokka 1.6 | 12 | 11% | 23 |
| maribo.FollowFire 1 | 10 | 9% | 9 |
| bayen.UbaMicro 1.4 | 9 | 8% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 6% | 10 |
| stelo.MyAgileRobot 0.2 | 7 | 6% | 6 |

## Melee bench: F15

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 85.2 | 115 / 210 | 2.33 | 20.2% | 43654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 20.2% | 115 |
| wompi.Wallaby 5.1 | 2.0 | 18.3% | 78 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 10 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 4 |
| ayk.WallHugger 1.0 | 5.2 | 9.9% | 0 |
| stuff.Vlad 0.1 | 5.7 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 81.6 | 18 / 35 | 6858 |
| 2 | 1 | 71.0 | 82.2 | 17 / 35 | 7306 |
| 3 | 1 | 72.1 | 86.0 | 21 / 35 | 7809 |
| 4 | 1 | 71.7 | 86.3 | 20 / 35 | 7631 |
| 5 | 1 | 71.6 | 86.3 | 19 / 35 | 6885 |
| 6 | 1 | 71.6 | 88.6 | 20 / 35 | 7165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 62% |
| mz.NanoGod 2.02 | 16 | 94% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 7 | 86% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| stelo.PianistNano 1.2 | 5 | 80% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 52 | 54% | 127 |
| mz.NanoGod 2.02 | 20 | 21% | 38 |
| exauge.GateKeeper 1.1.121g | 11 | 11% | 15 |
| ayk.WallHugger 1.0 | 8 | 8% | 18 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.7 | 88 / 210 | 3.19 | 16.6% | 28841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 16.6% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.3% | 38 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.5% | 34 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.2% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 2 |
| ap.Frederick 1.1 | 7.8 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 9.3 | 6.3% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 76.8 | 12 / 35 | 4522 |
| 2 | 1 | 64.1 | 71.1 | 16 / 35 | 4954 |
| 3 | 1 | 65.9 | 76.8 | 16 / 35 | 5035 |
| 4 | 1 | 62.7 | 69.2 | 11 / 35 | 4644 |
| 5 | 1 | 67.2 | 81.6 | 18 / 35 | 5045 |
| 6 | 1 | 65.1 | 78.4 | 15 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 51% |
| davidalves.net.DuelistMicroMelee 1.4 | 31 | 52% |
| dummy.micro.Sparrow 2.5 | 29 | 76% |
| bvh.micro.Freya 0.3 | 24 | 83% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 33% | 64 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 23% | 49 |
| dummy.micro.Sparrow 2.5 | 13 | 11% | 38 |
| bvh.micro.Freya 0.3 | 10 | 8% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 7% | 7 |
| conscience.Electron 1.3g | 8 | 7% | 12 |
| dl.BetterWalls 1.0 | 7 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 10 |

## Melee bench: F17

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.0 | 116 / 210 | 2.44 | 19.7% | 39778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.0 | 19.7% | 116 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 32 |
| supersample.SuperBoxBot 1.0 | 3.5 | 12.0% | 25 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 9 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.4% | 6 |
| dsw.StaticD 1.0 | 5.7 | 8.3% | 4 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.2% | 9 |
| sample.Corners 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.5 | 22 / 35 | 6722 |
| 2 | 1 | 68.9 | 84.1 | 15 / 35 | 6367 |
| 3 | 1 | 71.4 | 91.7 | 24 / 35 | 6621 |
| 4 | 1 | 67.4 | 74.3 | 17 / 35 | 6534 |
| 5 | 1 | 70.4 | 85.7 | 19 / 35 | 7194 |
| 6 | 1 | 67.8 | 77.8 | 19 / 35 | 6340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 72% |
| sul.Lunar 1.1 | 42 | 95% |
| supersample.SuperBoxBot 1.0 | 18 | 50% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 11 | 82% |
| sample.MyFirstRobot 1.0 | 9 | 56% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 67% |
| sample.Corners 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 37 | 38% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 28% | 62 |
| sample.MyFirstRobot 1.0 | 8 | 8% | 11 |
| mme.NikeEnhanced 2.0 | 7 | 7% | 17 |
| sul.Lunar 1.1 | 5 | 5% | 46 |
| dsw.StaticD 1.0 | 4 | 4% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 4 | 4% | 6 |
| sample.Corners 1.0 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorCF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.5 | 75 / 210 | 3.20 | 16.8% | 35387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCF 0.1 | 1.3 | 16.8% | 75 |
| radnor.DoctorBob 1.42 | 2.5 | 13.6% | 44 |
| mld.Wisdom 1.0 | 3.2 | 12.6% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.4% | 40 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 13 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 5 |
| sample.Walls 1.0 | 6.5 | 8.6% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.7% | 3 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.0 | 13 / 35 | 5854 |
| 2 | 1 | 64.1 | 71.4 | 14 / 35 | 5259 |
| 3 | 1 | 66.6 | 79.0 | 14 / 35 | 6008 |
| 4 | 3 | 61.0 | 65.7 | 5 / 35 | 4896 |
| 5 | 1 | 67.0 | 75.6 | 16 / 35 | 6663 |
| 6 | 1 | 68.0 | 81.3 | 13 / 35 | 6707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 70% |
| radnor.DoctorBob 1.42 | 28 | 57% |
| mld.Wisdom 1.0 | 24 | 54% |
| amz.NanoClone 1.41 | 9 | 67% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| sample.Walls 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 0% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 25% | 47 |
| radnor.DoctorBob 1.42 | 25 | 18% | 42 |
| KiraNL.Chupacabra 0.4 | 24 | 18% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 17% | 51 |
| sample.Walls 1.0 | 11 | 8% | 15 |
| amz.NanoClone 1.41 | 10 | 7% | 13 |
| jangs.ns51 1.0 | 6 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |

