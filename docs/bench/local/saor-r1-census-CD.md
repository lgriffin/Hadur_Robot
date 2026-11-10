# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.9 | 152 / 210 | 1.90 | 21.5% | 43639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 21.5% | 152 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 13 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 24 |
| mld.Infinity 2.2 | 3.5 | 12.8% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 2 |
| sample.Walls 1.0 | 6.5 | 7.1% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.2 | 5.6% | 2 |
| arthord.MannyPacquiao Beta | 8.7 | 4.9% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.7 | 26 / 35 | 7237 |
| 2 | 1 | 71.5 | 87.9 | 27 / 35 | 6824 |
| 3 | 1 | 72.2 | 89.5 | 26 / 35 | 7467 |
| 4 | 1 | 72.5 | 90.5 | 23 / 35 | 7528 |
| 5 | 1 | 71.1 | 86.7 | 24 / 35 | 6780 |
| 6 | 1 | 73.4 | 91.4 | 26 / 35 | 7803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 86% |
| mld.Infinity 2.2 | 42 | 100% |
| radnor.DoctorBob 1.42 | 41 | 78% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 27 | 47% | 86 |
| radnor.DoctorBob 1.42 | 17 | 29% | 55 |
| amz.NanoClone 1.41 | 7 | 12% | 13 |
| GarmBox.Oranges 1.0 | 2 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| mld.Infinity 2.2 | 1 | 2% | 27 |
| sample.Walls 1.0 | 1 | 2% | 13 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.0 | 106 / 210 | 2.26 | 18.2% | 30696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 18.2% | 106 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 54 |
| mld.DustBunny 3.8 | 2.8 | 14.3% | 29 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 1 |
| zyx.nano.Ant 1.1 | 5.8 | 8.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.3% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 7 |
| fullsail.SweetTea 1.1 | 7.5 | 7.1% | 4 |
| bzdp.BoxCar 2.0 | 8.8 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.4 | 16 / 35 | 4830 |
| 2 | 1 | 64.8 | 74.9 | 16 / 35 | 4841 |
| 3 | 1 | 68.8 | 90.5 | 20 / 35 | 5197 |
| 4 | 1 | 67.7 | 85.1 | 15 / 35 | 5388 |
| 5 | 1 | 67.6 | 87.9 | 17 / 35 | 4955 |
| 6 | 1 | 69.8 | 92.4 | 22 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 65% |
| mld.DustBunny 3.8 | 51 | 71% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 50% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 37 | 36% | 74 |
| oog.melee.Mercutio 1.0 | 33 | 32% | 79 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 11% | 15 |
| zyx.nano.Ant 1.1 | 10 | 10% | 13 |
| fullsail.SweetTea 1.1 | 6 | 6% | 8 |
| maribo.melee.BMV 0.1 | 4 | 4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 77.3 | 96 / 210 | 3.04 | 17.8% | 33890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 17.8% | 96 |
| myl.micro.Troodon 1.10 | 2.0 | 15.7% | 59 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.0% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.2% | 9 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 6 |
| sample.Fire 1.0 | 9.5 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.0 | 15 / 35 | 5829 |
| 2 | 1 | 65.8 | 74.6 | 13 / 35 | 5257 |
| 3 | 1 | 68.4 | 79.0 | 16 / 35 | 6098 |
| 4 | 1 | 68.6 | 84.8 | 18 / 35 | 5483 |
| 5 | 1 | 66.5 | 74.9 | 16 / 35 | 5767 |
| 6 | 1 | 66.7 | 76.5 | 18 / 35 | 5456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 79% |
| myl.nano.KomoriNinja 1.1 | 17 | 82% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| sample.Fire 1.0 | 4 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 36 | 32% | 83 |
| cb.nano.Insomnia 1.0 | 22 | 19% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 15% | 27 |
| myl.nano.KomoriNinja 1.1 | 13 | 11% | 32 |
| fm.mammillarias 1.3 | 12 | 11% | 16 |
| cs.sheldor.Talon 1.1 | 7 | 6% | 8 |
| sample.Tracker 1.0 | 3 | 3% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 8 |
| sample.Fire 1.0 | 2 | 2% | 7 |

## Melee bench: F04

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.0 | 124 / 210 | 2.35 | 19.7% | 38633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 19.7% | 124 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 33 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.3% | 18 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 76.5 | 14 / 35 | 6263 |
| 2 | 1 | 70.3 | 87.0 | 23 / 35 | 6735 |
| 3 | 1 | 69.3 | 84.1 | 19 / 35 | 6685 |
| 4 | 1 | 69.9 | 84.8 | 21 / 35 | 6575 |
| 5 | 1 | 69.8 | 87.9 | 24 / 35 | 6172 |
| 6 | 1 | 70.0 | 89.8 | 23 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 89% |
| stelo.SoJNanoMelee 1.1 | 31 | 74% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 94% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| yk.JahMicro 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 4 | 75% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 40 | 47% | 91 |
| stelo.SoJNanoMelee 1.1 | 17 | 20% | 37 |
| tj.zombie1n 1.0.1 | 8 | 9% | 11 |
| repositorio.NanoStep 1.0 | 5 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 26 |
| sample.VelociRobot 1.0 | 4 | 5% | 10 |
| tvv.micro.Antares 1.1.1 | 3 | 3% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 3% | 4 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.8 | 93 / 210 | 3.45 | 16.2% | 29038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 16.2% | 93 |
| oog.melee.Corsair 1.0 | 2.5 | 12.7% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.0% | 24 |
| ahf.NanoAndrew .4 | 3.5 | 11.2% | 24 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 8 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 8.4% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 71.1 | 13 / 35 | 4972 |
| 2 | 1 | 61.5 | 63.5 | 10 / 35 | 4915 |
| 3 | 1 | 65.0 | 78.1 | 18 / 35 | 4543 |
| 4 | 1 | 63.0 | 69.5 | 16 / 35 | 4513 |
| 5 | 1 | 67.0 | 82.9 | 21 / 35 | 5069 |
| 6 | 1 | 64.2 | 71.4 | 15 / 35 | 5026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 86% |
| oog.melee.Corsair 1.0 | 26 | 73% |
| ahf.NanoAndrew .4 | 17 | 71% |
| sam.Samspin 1.0 | 13 | 100% |
| robar.nano.Assertive_Melee 0.2 | 10 | 70% |
| EBBU.Sim2 1.02 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 26 | 22% | 31 |
| ahf.NanoAndrew .4 | 18 | 15% | 32 |
| EBBU.Sim2 1.02 | 15 | 13% | 19 |
| oog.melee.Corsair 1.0 | 13 | 11% | 32 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 43 |
| sam.Samspin 1.0 | 8 | 7% | 19 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.7 | 112 / 210 | 2.64 | 17.7% | 29435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.2 | 17.7% | 112 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.3% | 55 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.7% | 4 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 2 |
| fm.claire 1.7 | 6.8 | 8.4% | 3 |
| sample.SpinBot 1.0 | 7.5 | 7.5% | 6 |
| pa.Improved 1.0 | 9.3 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 19 / 35 | 4667 |
| 2 | 1 | 65.0 | 77.1 | 15 / 35 | 4719 |
| 3 | 1 | 65.5 | 76.8 | 17 / 35 | 4888 |
| 4 | 1 | 68.5 | 86.0 | 23 / 35 | 5476 |
| 5 | 2 | 65.1 | 77.8 | 16 / 35 | 4579 |
| 6 | 1 | 68.1 | 85.4 | 22 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 56 | 63% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| gh.nano.Grofvuil 0.2 | 24 | 79% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| sample.SpinBot 1.0 | 6 | 67% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 44 | 45% | 80 |
| oog.melee.CapuletDroid 1.1 | 12 | 12% | 39 |
| gh.nano.Grofvuil 0.2 | 11 | 11% | 27 |
| fm.claire 1.7 | 11 | 11% | 16 |
| sample.SpinBot 1.0 | 9 | 9% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 3 | 3% | 7 |
| kurios.DOSexe .9b | 2 | 2% | 6 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.1 | 86 / 210 | 3.24 | 16.7% | 31797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.3 | 16.7% | 86 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 45 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.4% | 35 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 32 |
| DBall.Anarchy 0.1 | 5.3 | 9.0% | 4 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.6% | 2 |
| acogdev.alpha 0.2 | 6.7 | 6.9% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.4% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.7 | 12 / 35 | 5295 |
| 2 | 1 | 67.1 | 80.3 | 15 / 35 | 5666 |
| 3 | 3 | 62.6 | 68.6 | 10 / 35 | 4705 |
| 4 | 1 | 65.6 | 74.6 | 16 / 35 | 5559 |
| 5 | 1 | 65.9 | 77.8 | 16 / 35 | 5084 |
| 6 | 1 | 66.6 | 76.8 | 17 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 78% |
| mz.MicroGodMelee 1 | 32 | 59% |
| gh.micro.Gruweltje 0.7 | 21 | 62% |
| DBall.Anarchy 0.1 | 10 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 37 | 29% | 69 |
| mz.MicroGodMelee 1 | 30 | 24% | 43 |
| gh.micro.Gruweltje 0.7 | 22 | 17% | 41 |
| acogdev.alpha 0.2 | 16 | 13% | 16 |
| DBall.Anarchy 0.1 | 5 | 4% | 15 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 11 |
| el.JumpShoot 0.2 | 4 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.0 | 86 / 210 | 4.06 | 15.2% | 29418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.2% | 48 |
| hadur117.micro.SaorCD 0.1 | 1.7 | 15.2% | 86 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.2% | 38 |
| germ.TheMind .2 | 5.0 | 9.9% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.6% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 1 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.4% | 6 |
| sample.Crazy 1.0 | 8.8 | 7.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 71.7 | 15 / 35 | 4283 |
| 2 | 2 | 61.9 | 62.2 | 14 / 35 | 5099 |
| 3 | 1 | 64.5 | 67.6 | 17 / 35 | 5603 |
| 4 | 2 | 61.1 | 63.5 | 15 / 35 | 4349 |
| 5 | 1 | 62.3 | 63.2 | 13 / 35 | 5214 |
| 6 | 2 | 62.3 | 67.9 | 12 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 68% |
| germ.TheMind .2 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 33% | 80 |
| germ.TheMind .2 | 22 | 18% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 15% | 36 |
| stelo.UntouchableNano 1.3 | 14 | 11% | 17 |
| awesomeness.Elite 1.0 | 11 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 9 |
| mym.EdgeStalker 1.0 | 5 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 7 |
| sample.Crazy 1.0 | 3 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.9 | 120 / 210 | 2.54 | 18.3% | 28734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 18.3% | 120 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.0% | 13 |
| maribo.IotaCT 1.1 | 4.0 | 10.9% | 10 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.6% | 4 |
| ratosh.Wesco 1.4 | 7.3 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 8.4% | 5 |
| stelo.PatternRobot 1.0 | 8.2 | 7.8% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.8 | 20 / 35 | 4704 |
| 2 | 1 | 65.4 | 75.6 | 17 / 35 | 4225 |
| 3 | 1 | 68.9 | 85.4 | 21 / 35 | 4878 |
| 4 | 1 | 69.3 | 88.3 | 19 / 35 | 4995 |
| 5 | 1 | 67.7 | 81.0 | 18 / 35 | 5030 |
| 6 | 1 | 70.4 | 89.2 | 25 / 35 | 4902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 76% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| maribo.IotaCT 1.1 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| stelo.PatternRobot 1.0 | 9 | 44% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |

Hadur died in 90 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 34 | 38% | 71 |
| stelo.PatternRobot 1.0 | 18 | 20% | 23 |
| ratosh.Wesco 1.4 | 13 | 14% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 8% | 48 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 9 |
| maribo.IotaCT 1.1 | 4 | 4% | 19 |
| timmit.nano.TimDog 0.33 | 4 | 4% | 16 |
| spinnercat.Omen 1.0 | 3 | 3% | 5 |

## Melee bench: F10

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.2 | 132 / 210 | 2.42 | 19.3% | 36001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 19.3% | 132 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.6% | 27 |
| baal.nano.N 1.42 | 3.2 | 11.6% | 13 |
| zyx.micro.Ant 1.1 | 3.8 | 10.8% | 22 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 4 |
| sanja.First 0.1 | 6.5 | 8.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.1% | 7 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 20 / 35 | 5965 |
| 2 | 1 | 68.4 | 80.6 | 23 / 35 | 6018 |
| 3 | 1 | 71.2 | 92.4 | 26 / 35 | 6436 |
| 4 | 1 | 67.6 | 79.7 | 22 / 35 | 5758 |
| 5 | 1 | 68.8 | 82.9 | 20 / 35 | 6070 |
| 6 | 1 | 68.1 | 85.1 | 21 / 35 | 5754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 93% |
| baal.nano.N 1.42 | 24 | 83% |
| sanja.First 0.1 | 19 | 100% |
| zyx.micro.Ant 1.1 | 17 | 71% |
| cvt.Firsty 1.0 | 15 | 80% |
| Grystrion.TrackerWO 1.0 | 13 | 85% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| amk.Punbot.Punbot 0.01 | 8 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 38 | 49% | 57 |
| tvv.nano.Polaris 1.2 | 10 | 13% | 38 |
| cvt.Firsty 1.0 | 8 | 10% | 23 |
| baal.nano.N 1.42 | 7 | 9% | 26 |
| Grystrion.TrackerWO 1.0 | 7 | 9% | 18 |
| sanja.First 0.1 | 5 | 6% | 32 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 11 |

## Melee bench: F11

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.3 | 76 / 210 | 3.94 | 15.0% | 29358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.3 | 15.0% | 76 |
| kc.micro.Figment 1.0 | 1.8 | 14.2% | 64 |
| cs.Wren 1.0 | 3.3 | 12.7% | 26 |
| js.PinBall 1.6 | 3.8 | 11.9% | 13 |
| mz.Cork 0.1 | 4.7 | 11.1% | 14 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 6 |
| evd.X1 0.01 | 6.8 | 8.7% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 58.7 | 11 / 35 | 4749 |
| 2 | 1 | 63.4 | 69.5 | 16 / 35 | 4843 |
| 3 | 1 | 62.6 | 67.3 | 14 / 35 | 5016 |
| 4 | 1 | 63.4 | 72.4 | 13 / 35 | 4704 |
| 5 | 1 | 65.7 | 75.6 | 14 / 35 | 5477 |
| 6 | 2 | 59.4 | 60.3 | 8 / 35 | 4569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 60 | 68% |
| cs.Wren 1.0 | 22 | 91% |
| mz.Cork 0.1 | 7 | 100% |
| js.PinBall 1.6 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 33% |
| evd.X1 0.01 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 44 | 32% | 88 |
| evd.X1 0.01 | 29 | 21% | 30 |
| cs.Wren 1.0 | 22 | 16% | 35 |
| js.PinBall 1.6 | 12 | 9% | 15 |
| joe.ADinosaur 1.0 | 9 | 7% | 13 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| mz.Cork 0.1 | 6 | 4% | 9 |
| jsal.Jsalbot 1.0 | 6 | 4% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.6 | 112 / 210 | 2.74 | 17.8% | 28390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 17.8% | 112 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 24 |
| stelo.AreaTargetingBot 1.1 | 3.3 | 11.3% | 29 |
| ntc.Opposite 1.5 | 3.3 | 11.1% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.2% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.5% | 4 |
| DBall.NUKE 0.1 | 6.7 | 8.6% | 11 |
| disan.Chair 2.2.0 | 7.7 | 7.8% | 7 |
| pbg.R2D2 1.0 | 9.3 | 6.2% | 3 |
| donjezza.Muncho 1.0 | 9.7 | 5.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.0 | 18 / 35 | 4602 |
| 2 | 1 | 65.5 | 78.4 | 17 / 35 | 4530 |
| 3 | 1 | 67.3 | 81.3 | 17 / 35 | 5284 |
| 4 | 1 | 67.7 | 84.4 | 21 / 35 | 4710 |
| 5 | 1 | 66.7 | 80.3 | 19 / 35 | 4760 |
| 6 | 1 | 66.1 | 78.4 | 20 / 35 | 4504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 81% |
| myl.nano.Graviton 1.10 | 38 | 82% |
| ntc.Opposite 1.5 | 15 | 73% |
| DBall.NUKE 0.1 | 14 | 86% |
| disan.Chair 2.2.0 | 11 | 64% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 17% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 17% | 30 |
| ntc.Opposite 1.5 | 14 | 14% | 23 |
| pfvicm.Sobieski 7.2.3b | 14 | 14% | 21 |
| disan.Chair 2.2.0 | 13 | 13% | 21 |
| stelo.AreaTargetingBot 1.1 | 11 | 11% | 33 |
| DBall.NUKE 0.1 | 5 | 5% | 14 |
| pbg.R2D2 1.0 | 4 | 4% | 11 |
| donjezza.Muncho 1.0 | 3 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 65.7 | 55 / 210 | 4.09 | 14.1% | 23776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.5 | 14.7% | 53 |
| hadur117.micro.SaorCD 0.1 | 2.3 | 14.1% | 55 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.4% | 29 |
| yagami.Tidus 0.11 | 4.3 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 11.0% | 10 |
| step.nanoPri 1.0 | 7.5 | 7.5% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.9% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 56.8 | 7 / 35 | 3806 |
| 2 | 2 | 62.6 | 69.5 | 9 / 35 | 4001 |
| 3 | 3 | 60.8 | 63.5 | 9 / 35 | 3855 |
| 4 | 1 | 62.7 | 67.0 | 13 / 35 | 4124 |
| 5 | 3 | 61.8 | 68.3 | 8 / 35 | 3839 |
| 6 | 1 | 62.2 | 68.9 | 9 / 35 | 4151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 29 | 79% |
| oog.melee.Capulet 1.2 | 20 | 70% |
| yagami.Tidus 0.11 | 14 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 27% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 24% | 50 |
| kawigi.micro.Shiz 1.1 | 32 | 21% | 49 |
| yagami.Tidus 0.11 | 27 | 17% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 10% | 28 |
| ejb.Polaris 1.0.1 | 12 | 8% | 19 |
| stelo.MirrorNano 1.3 | 12 | 8% | 13 |
| kurios.DOSexe .9a | 10 | 6% | 10 |
| step.nanoPri 1.0 | 9 | 6% | 9 |

## Melee bench: F14

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 77.0 | 110 / 210 | 3.07 | 16.8% | 26599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 16.8% | 110 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 28 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 24 |
| ratosh.Nobo 0.21 | 3.8 | 11.0% | 9 |
| wompi.Quokka 1.6 | 4.2 | 11.5% | 14 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 13 |
| bayen.UbaMicro 1.4 | 7.2 | 8.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 3 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.3% | 4 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 76.5 | 17 / 35 | 4126 |
| 2 | 1 | 66.4 | 83.2 | 21 / 35 | 4235 |
| 3 | 1 | 63.6 | 71.4 | 15 / 35 | 4629 |
| 4 | 1 | 64.3 | 76.2 | 17 / 35 | 3992 |
| 5 | 1 | 67.0 | 78.4 | 22 / 35 | 4891 |
| 6 | 1 | 65.7 | 76.5 | 18 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 42 | 93% |
| bzdp.Pansy 2.1 | 40 | 80% |
| wompi.Quokka 1.6 | 15 | 73% |
| m3thos.Eva00 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 10 | 90% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 22 | 22% | 50 |
| stelo.MyAgileRobot 0.2 | 15 | 15% | 17 |
| bayen.UbaMicro 1.4 | 13 | 13% | 23 |
| ratosh.Nobo 0.21 | 13 | 13% | 19 |
| wompi.Quokka 1.6 | 11 | 11% | 16 |
| maribo.FollowFire 1 | 9 | 9% | 11 |
| wee.Gem 1.8.4 | 8 | 8% | 44 |
| m3thos.Eva00 1.1 | 7 | 7% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.8 | 145 / 210 | 2.00 | 21.6% | 45992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 21.6% | 145 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 42 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 15 |
| ayk.WallHugger 1.0 | 4.8 | 8.8% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 8.9% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 93.7 | 27 / 35 | 8040 |
| 2 | 1 | 69.7 | 78.7 | 19 / 35 | 7011 |
| 3 | 1 | 72.3 | 86.0 | 24 / 35 | 7699 |
| 4 | 1 | 73.4 | 92.4 | 23 / 35 | 7617 |
| 5 | 1 | 73.8 | 93.3 | 28 / 35 | 7902 |
| 6 | 1 | 73.0 | 88.9 | 24 / 35 | 7723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 90% |
| mz.NanoGod 2.02 | 25 | 60% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| ayk.WallHugger 1.0 | 4 | 75% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 24 | 36% | 43 |
| wompi.Wallaby 5.1 | 22 | 33% | 133 |
| ayk.WallHugger 1.0 | 7 | 10% | 11 |
| exauge.GateKeeper 1.1.121g | 7 | 10% | 10 |
| stuff.Vlad 0.1 | 3 | 4% | 4 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.7 | 103 / 210 | 3.37 | 16.7% | 29054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 16.7% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.3% | 26 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.3% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.6% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 10 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.5% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.6% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.8 | 16 / 35 | 4787 |
| 2 | 1 | 63.8 | 69.8 | 17 / 35 | 4838 |
| 3 | 1 | 67.0 | 79.7 | 21 / 35 | 4940 |
| 4 | 1 | 65.9 | 77.1 | 17 / 35 | 4875 |
| 5 | 1 | 64.0 | 73.0 | 16 / 35 | 4388 |
| 6 | 1 | 64.3 | 71.4 | 16 / 35 | 5226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 72% |
| dummy.micro.Sparrow 2.5 | 25 | 88% |
| bvh.micro.Freya 0.3 | 21 | 81% |
| stelo.MirrorMicro 1.0 | 12 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 51 |
| conscience.Electron 1.3g | 24 | 22% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 36 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 13 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 18 |
| bvh.micro.Freya 0.3 | 7 | 7% | 16 |
| dl.BetterWalls 1.0 | 5 | 5% | 10 |

## Melee bench: F17

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.6 | 131 / 210 | 2.20 | 20.4% | 40273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 20.4% | 131 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 25 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.6% | 16 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.8% | 5 |
| dsw.StaticD 1.0 | 6.2 | 8.4% | 12 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.4% | 0 |
| sample.Corners 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.3 | 26 / 35 | 6787 |
| 2 | 1 | 70.8 | 86.7 | 22 / 35 | 6941 |
| 3 | 1 | 72.2 | 94.6 | 25 / 35 | 6679 |
| 4 | 1 | 69.7 | 83.5 | 21 / 35 | 6917 |
| 5 | 1 | 66.2 | 73.3 | 16 / 35 | 6240 |
| 6 | 1 | 70.5 | 88.3 | 21 / 35 | 6709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 60 | 85% |
| sul.Lunar 1.1 | 25 | 92% |
| supersample.SuperBoxBot 1.0 | 23 | 83% |
| dsw.StaticD 1.0 | 13 | 46% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 31 | 39% | 49 |
| dsw.StaticD 1.0 | 15 | 19% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 18% | 64 |
| sul.Lunar 1.1 | 9 | 11% | 39 |
| mme.NikeEnhanced 2.0 | 5 | 6% | 7 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 7 |
| sample.Corners 1.0 | 1 | 1% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.7 | 108 / 210 | 2.92 | 17.9% | 36561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCD 0.1 | 1.0 | 17.9% | 108 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 26 |
| mld.Wisdom 1.0 | 3.8 | 11.6% | 14 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 11 |
| amz.NanoClone 1.41 | 5.2 | 10.3% | 12 |
| sample.Walls 1.0 | 6.8 | 8.4% | 5 |
| GarmBox.Oranges 1.0 | 8.5 | 6.5% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.2 | 24 / 35 | 6677 |
| 2 | 1 | 64.5 | 71.7 | 12 / 35 | 5676 |
| 3 | 1 | 64.6 | 72.1 | 19 / 35 | 5172 |
| 4 | 1 | 67.7 | 80.3 | 17 / 35 | 6487 |
| 5 | 1 | 67.6 | 81.3 | 16 / 35 | 6036 |
| 6 | 1 | 69.0 | 84.4 | 20 / 35 | 6513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 76% |
| radnor.DoctorBob 1.42 | 38 | 79% |
| mld.Wisdom 1.0 | 22 | 68% |
| amz.NanoClone 1.41 | 11 | 82% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 28% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 22% | 59 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 26 |
| radnor.DoctorBob 1.42 | 14 | 14% | 40 |
| amz.NanoClone 1.41 | 12 | 12% | 18 |
| jangs.ns51 1.0 | 4 | 4% | 12 |
| sample.Walls 1.0 | 2 | 2% | 11 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

