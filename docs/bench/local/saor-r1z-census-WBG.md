# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.4 | 147 / 210 | 1.96 | 21.6% | 44240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.6% | 147 |
| radnor.DoctorBob 1.42 | 2.2 | 14.7% | 23 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 14 |
| mld.Infinity 2.2 | 4.0 | 13.0% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 6.6% | 0 |
| sample.Walls 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.2 | 5.5% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 3 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 23 / 35 | 7298 |
| 2 | 1 | 72.1 | 89.8 | 23 / 35 | 7322 |
| 3 | 1 | 73.4 | 92.7 | 24 / 35 | 7624 |
| 4 | 1 | 72.8 | 87.9 | 27 / 35 | 7270 |
| 5 | 1 | 72.8 | 88.9 | 27 / 35 | 7134 |
| 6 | 1 | 72.2 | 88.9 | 23 / 35 | 7592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 95% |
| mld.Infinity 2.2 | 38 | 95% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| arthord.MannyPacquiao Beta | 5 | 60% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 44% | 62 |
| mz.AntiGrav 1.0 | 18 | 29% | 72 |
| mld.Infinity 2.2 | 9 | 14% | 42 |
| amz.NanoClone 1.41 | 5 | 8% | 14 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.8 | 131 / 210 | 2.19 | 19.1% | 33384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.1% | 131 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.2% | 44 |
| mld.DustBunny 3.8 | 3.5 | 12.1% | 9 |
| maribo.melee.BMV 0.1 | 3.7 | 10.7% | 5 |
| zyx.nano.Ant 1.1 | 5.5 | 9.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.9% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.2% | 13 |
| bzdp.BoxCar 2.0 | 8.2 | 7.2% | 1 |
| fullsail.SweetTea 1.1 | 8.7 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 23 / 35 | 5406 |
| 2 | 1 | 69.5 | 88.9 | 23 / 35 | 6019 |
| 3 | 1 | 70.3 | 92.7 | 24 / 35 | 5948 |
| 4 | 1 | 68.3 | 87.9 | 21 / 35 | 5091 |
| 5 | 1 | 68.0 | 83.5 | 19 / 35 | 5496 |
| 6 | 1 | 67.9 | 81.6 | 21 / 35 | 5424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 67% |
| mld.DustBunny 3.8 | 45 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 13 | 85% |
| fullsail.SweetTea 1.1 | 9 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 39% | 79 |
| mld.DustBunny 3.8 | 13 | 16% | 52 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 20 |
| maribo.melee.BMV 0.1 | 9 | 11% | 18 |
| zyx.nano.Ant 1.1 | 7 | 9% | 10 |
| fullsail.SweetTea 1.1 | 5 | 6% | 15 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 13 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.4 | 127 / 210 | 2.50 | 19.7% | 36844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.7% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.7% | 20 |
| myl.nano.KomoriNinja 1.1 | 4.2 | 11.0% | 9 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 8 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.7% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 5 |
| sample.Fire 1.0 | 9.3 | 5.1% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.4 | 17 / 35 | 5530 |
| 2 | 1 | 69.2 | 83.8 | 21 / 35 | 5717 |
| 3 | 1 | 71.1 | 87.9 | 22 / 35 | 6929 |
| 4 | 1 | 69.6 | 82.2 | 21 / 35 | 6169 |
| 5 | 1 | 70.7 | 86.3 | 27 / 35 | 6298 |
| 6 | 1 | 68.9 | 81.6 | 19 / 35 | 6201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 66% |
| cb.nano.Insomnia 1.0 | 28 | 96% |
| myl.nano.KomoriNinja 1.1 | 16 | 81% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 23% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 23% | 42 |
| fm.mammillarias 1.3 | 15 | 18% | 18 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 26 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 14 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 18 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 10 |
| sample.Fire 1.0 | 2 | 2% | 9 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.6 | 153 / 210 | 2.03 | 21.1% | 40876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.1% | 153 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.9% | 13 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.1% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.2% | 12 |
| tj.zombie1n 1.0.1 | 6.0 | 9.0% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 4 |
| yk.JahMicro 1.0 | 7.0 | 8.3% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 88.9 | 26 / 35 | 7097 |
| 2 | 1 | 70.3 | 86.0 | 26 / 35 | 6512 |
| 3 | 1 | 71.0 | 90.2 | 25 / 35 | 6803 |
| 4 | 1 | 71.7 | 89.8 | 28 / 35 | 6837 |
| 5 | 1 | 72.8 | 93.7 | 27 / 35 | 7292 |
| 6 | 1 | 68.9 | 82.9 | 21 / 35 | 6335 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 85% |
| stelo.SoJNanoMelee 1.1 | 47 | 89% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| tj.zombie1n 1.0.1 | 8 | 88% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 37% | 83 |
| tvv.micro.Antares 1.1.1 | 11 | 19% | 39 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 12 |
| tj.zombie1n 1.0.1 | 4 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 18 |
| yk.JahMicro 1.0 | 3 | 5% | 10 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.7 | 86 / 210 | 3.81 | 15.5% | 28026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 15.5% | 86 |
| oog.melee.Corsair 1.0 | 2.5 | 13.1% | 39 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.4% | 30 |
| ahf.NanoAndrew .4 | 4.0 | 11.2% | 25 |
| sam.Samspin 1.0 | 5.0 | 10.1% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.3% | 7 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 3 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.3% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 73.3 | 14 / 35 | 4854 |
| 2 | 1 | 61.5 | 65.4 | 14 / 35 | 4373 |
| 3 | 1 | 63.3 | 69.2 | 13 / 35 | 4812 |
| 4 | 1 | 60.9 | 64.4 | 13 / 35 | 4215 |
| 5 | 1 | 62.3 | 66.0 | 14 / 35 | 4788 |
| 6 | 1 | 65.0 | 74.0 | 18 / 35 | 4984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| oog.melee.Corsair 1.0 | 29 | 55% |
| ahf.NanoAndrew .4 | 14 | 93% |
| sam.Samspin 1.0 | 14 | 93% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 26% | 45 |
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 52 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 15 |
| ahf.NanoAndrew .4 | 13 | 10% | 27 |
| EBBU.Sim2 1.02 | 11 | 9% | 16 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 11 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 17 |
| sam.Samspin 1.0 | 9 | 7% | 23 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.0 | 126 / 210 | 2.35 | 18.9% | 32882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.9% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.4% | 18 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 16 |
| fm.claire 1.7 | 5.8 | 8.5% | 5 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.6% | 6 |
| sample.SpinBot 1.0 | 8.2 | 7.2% | 2 |
| pa.Improved 1.0 | 8.8 | 6.2% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.3 | 15 / 35 | 5481 |
| 2 | 1 | 68.9 | 87.6 | 21 / 35 | 5430 |
| 3 | 1 | 69.5 | 88.3 | 23 / 35 | 5465 |
| 4 | 1 | 68.4 | 85.4 | 21 / 35 | 5456 |
| 5 | 1 | 69.0 | 84.1 | 22 / 35 | 5801 |
| 6 | 1 | 67.5 | 83.5 | 24 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 83% |
| oog.melee.CapuletDroid 1.1 | 30 | 90% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| fm.claire 1.7 | 7 | 57% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 31% | 71 |
| gh.nano.Grofvuil 0.2 | 18 | 21% | 40 |
| arthord.NanoSatanMelee Beta | 12 | 14% | 24 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 40 |
| fm.claire 1.7 | 8 | 10% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 12 |
| kurios.DOSexe .9b | 3 | 4% | 4 |
| pa.Improved 1.0 | 2 | 2% | 4 |
| sample.SpinBot 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.2 | 104 / 210 | 2.60 | 18.4% | 35071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.4% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 29 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.3% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.4% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.0 | 15 / 35 | 6107 |
| 2 | 1 | 69.0 | 85.7 | 21 / 35 | 5663 |
| 3 | 1 | 68.4 | 83.5 | 19 / 35 | 5528 |
| 4 | 1 | 67.6 | 82.5 | 14 / 35 | 6115 |
| 5 | 1 | 67.2 | 80.0 | 18 / 35 | 5398 |
| 6 | 1 | 68.6 | 82.5 | 17 / 35 | 6260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 86% |
| mz.MicroGodMelee 1 | 41 | 73% |
| gh.micro.Gruweltje 0.7 | 25 | 60% |
| DBall.Anarchy 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 31% | 60 |
| gh.micro.Gruweltje 0.7 | 26 | 24% | 48 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 63 |
| DBall.Anarchy 0.1 | 8 | 7% | 15 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.6 | 117 / 210 | 3.29 | 17.4% | 31958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.4% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 21 |
| awesomeness.Elite 1.0 | 5.2 | 9.0% | 13 |
| germ.TheMind .2 | 5.7 | 9.0% | 8 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 4 |
| qualidafial.MajorDick 1.0.1 | 6.8 | 8.3% | 5 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 80.6 | 23 / 35 | 5158 |
| 2 | 1 | 66.6 | 75.9 | 18 / 35 | 5552 |
| 3 | 1 | 65.7 | 72.7 | 18 / 35 | 5290 |
| 4 | 1 | 65.5 | 71.1 | 20 / 35 | 5256 |
| 5 | 1 | 65.8 | 73.7 | 20 / 35 | 5263 |
| 6 | 1 | 65.9 | 73.3 | 18 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| awesomeness.Elite 1.0 | 11 | 64% |
| sample.Crazy 1.0 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 10 | 70% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| germ.TheMind .2 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 48% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 17% | 33 |
| awesomeness.Elite 1.0 | 11 | 12% | 21 |
| stelo.UntouchableNano 1.3 | 10 | 11% | 17 |
| germ.TheMind .2 | 6 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.9 | 131 / 210 | 2.36 | 19.2% | 30509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.2% | 131 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 15 |
| maribo.IotaCT 1.1 | 4.7 | 10.4% | 8 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.2% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.8 | 8.2% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 13 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.2 | 17 / 35 | 4831 |
| 2 | 1 | 69.1 | 83.2 | 24 / 35 | 5209 |
| 3 | 1 | 69.2 | 85.7 | 23 / 35 | 5073 |
| 4 | 1 | 69.8 | 86.7 | 24 / 35 | 5053 |
| 5 | 1 | 69.2 | 83.8 | 21 / 35 | 5477 |
| 6 | 1 | 69.5 | 87.6 | 22 / 35 | 4866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 54 | 94% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| stelo.PatternRobot 1.0 | 20 | 65% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 92% |
| ratosh.Wesco 1.4 | 11 | 64% |
| spinnercat.Omen 1.0 | 6 | 100% |
| maribo.IotaCT 1.1 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 24% | 59 |
| stelo.PatternRobot 1.0 | 15 | 19% | 24 |
| timmit.nano.TimDog 0.33 | 12 | 15% | 24 |
| ratosh.Wesco 1.4 | 11 | 14% | 19 |
| nz.jdc.nano.GridFu 1.0 | 10 | 13% | 49 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 9% | 14 |
| maribo.IotaCT 1.1 | 3 | 4% | 15 |
| spinnercat.Omen 1.0 | 1 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.2 | 178 / 210 | 1.52 | 22.2% | 41246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 22.2% | 178 |
| baal.nano.N 1.42 | 2.5 | 11.3% | 7 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.4% | 4 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.7% | 4 |
| zyx.micro.Ant 1.1 | 5.5 | 9.0% | 10 |
| sanja.First 0.1 | 6.3 | 8.6% | 2 |
| cvt.Firsty 1.0 | 6.8 | 7.9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 9.0 | 6.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.9 | 30 / 35 | 6995 |
| 2 | 1 | 71.7 | 93.0 | 27 / 35 | 6884 |
| 3 | 1 | 72.6 | 94.6 | 31 / 35 | 6874 |
| 4 | 1 | 70.6 | 90.5 | 27 / 35 | 6212 |
| 5 | 1 | 73.6 | 96.2 | 31 / 35 | 7526 |
| 6 | 1 | 72.5 | 95.9 | 32 / 35 | 6755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 51 | 96% |
| cvt.Firsty 1.0 | 37 | 95% |
| baal.nano.N 1.42 | 33 | 97% |
| zyx.micro.Ant 1.1 | 20 | 80% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 82% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 28% | 31 |
| baal.nano.N 1.42 | 7 | 22% | 39 |
| Grystrion.TrackerWO 1.0 | 7 | 22% | 19 |
| tvv.nano.Polaris 1.2 | 4 | 13% | 57 |
| cvt.Firsty 1.0 | 3 | 9% | 33 |
| sanja.First 0.1 | 2 | 6% | 18 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.7 | 78 / 210 | 3.81 | 15.7% | 32455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.3 | 15.7% | 78 |
| kc.micro.Figment 1.0 | 1.7 | 15.2% | 73 |
| cs.Wren 1.0 | 3.2 | 12.5% | 16 |
| js.PinBall 1.6 | 4.2 | 11.1% | 16 |
| mz.Cork 0.1 | 4.8 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 5 |
| evd.X1 0.01 | 7.0 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 2 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.3 | 13 / 35 | 5196 |
| 2 | 2 | 63.6 | 68.3 | 14 / 35 | 5260 |
| 3 | 1 | 65.0 | 72.7 | 11 / 35 | 5998 |
| 4 | 1 | 62.7 | 65.1 | 14 / 35 | 5355 |
| 5 | 2 | 61.3 | 62.2 | 10 / 35 | 5127 |
| 6 | 1 | 64.6 | 70.8 | 16 / 35 | 5519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 55% |
| cs.Wren 1.0 | 29 | 86% |
| js.PinBall 1.6 | 13 | 62% |
| mz.Cork 0.1 | 9 | 78% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 46% | 100 |
| js.PinBall 1.6 | 18 | 14% | 26 |
| cs.Wren 1.0 | 16 | 12% | 31 |
| joe.ADinosaur 1.0 | 11 | 8% | 13 |
| PSW.Relentless 0.1 | 9 | 7% | 11 |
| mz.Cork 0.1 | 7 | 5% | 15 |
| evd.X1 0.01 | 6 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.4 | 133 / 210 | 2.76 | 18.6% | 30115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.6% | 133 |
| myl.nano.Graviton 1.10 | 2.0 | 12.2% | 30 |
| ntc.Opposite 1.5 | 4.0 | 10.5% | 7 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.8% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 8 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 3 |
| pbg.R2D2 1.0 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.7 | 21 / 35 | 4659 |
| 2 | 1 | 67.8 | 77.5 | 21 / 35 | 5525 |
| 3 | 1 | 69.0 | 85.7 | 27 / 35 | 5010 |
| 4 | 1 | 66.8 | 79.0 | 19 / 35 | 5024 |
| 5 | 1 | 68.0 | 82.5 | 25 / 35 | 4865 |
| 6 | 1 | 67.0 | 78.1 | 20 / 35 | 5032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 90% |
| myl.nano.Graviton 1.10 | 29 | 90% |
| donjezza.Muncho 1.0 | 18 | 100% |
| ntc.Opposite 1.5 | 17 | 88% |
| disan.Chair 2.2.0 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 19% | 45 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 26 |
| ntc.Opposite 1.5 | 11 | 14% | 30 |
| stelo.AreaTargetingBot 1.1 | 7 | 9% | 28 |
| DBall.NUKE 0.1 | 7 | 9% | 19 |
| disan.Chair 2.2.0 | 7 | 9% | 17 |
| pbg.R2D2 1.0 | 2 | 3% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 69.5 | 74 / 210 | 3.75 | 15.3% | 27026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.7 | 15.3% | 74 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 51 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 27 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 16 |
| ejb.Polaris 1.0.1 | 5.5 | 10.6% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.8 | 18 / 35 | 4912 |
| 2 | 2 | 62.0 | 67.3 | 9 / 35 | 4304 |
| 3 | 1 | 65.3 | 75.2 | 17 / 35 | 4322 |
| 4 | 3 | 61.5 | 62.9 | 7 / 35 | 4574 |
| 5 | 1 | 64.4 | 69.8 | 13 / 35 | 4524 |
| 6 | 2 | 62.1 | 63.8 | 10 / 35 | 4390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 74% |
| oog.melee.Capulet 1.2 | 27 | 56% |
| kawigi.micro.Shiz 1.1 | 18 | 100% |
| yagami.Tidus 0.11 | 14 | 79% |
| ejb.Polaris 1.0.1 | 7 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 42% | 77 |
| yagami.Tidus 0.11 | 24 | 18% | 34 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 35 |
| stelo.MirrorNano 1.3 | 10 | 7% | 10 |
| ejb.Polaris 1.0.1 | 8 | 6% | 17 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

## Melee bench: F14

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.8 | 125 / 210 | 2.73 | 17.8% | 28921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.8% | 125 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 21 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 25 |
| wompi.Quokka 1.6 | 3.5 | 11.5% | 19 |
| ratosh.Nobo 0.21 | 5.0 | 10.4% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.2% | 5 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.5 | 20 / 35 | 4533 |
| 2 | 1 | 69.0 | 88.6 | 25 / 35 | 5096 |
| 3 | 1 | 66.1 | 77.8 | 20 / 35 | 4803 |
| 4 | 1 | 65.5 | 75.2 | 19 / 35 | 4796 |
| 5 | 1 | 64.6 | 74.6 | 17 / 35 | 4523 |
| 6 | 1 | 68.1 | 85.1 | 24 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 91% |
| wee.Gem 1.8.4 | 34 | 91% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 13 | 77% |
| m3thos.Eva00 1.1 | 10 | 80% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 21 | 25% | 65 |
| ratosh.Nobo 0.21 | 12 | 14% | 22 |
| wee.Gem 1.8.4 | 11 | 13% | 44 |
| wompi.Quokka 1.6 | 10 | 12% | 28 |
| m3thos.Eva00 1.1 | 8 | 9% | 15 |
| maribo.FollowFire 1 | 8 | 9% | 10 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 9 |
| bayen.UbaMicro 1.4 | 4 | 5% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 4 |

## Melee bench: F15

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 83.5 | 126 / 210 | 2.48 | 20.5% | 45148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.5% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 59 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 21 |
| ayk.WallHugger 1.0 | 4.5 | 9.4% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 2 |
| stuff.Vlad 0.1 | 6.0 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 7.7 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 78.7 | 21 / 35 | 7472 |
| 2 | 1 | 70.6 | 81.0 | 18 / 35 | 7723 |
| 3 | 1 | 72.9 | 88.9 | 24 / 35 | 7724 |
| 4 | 1 | 72.1 | 88.6 | 21 / 35 | 7485 |
| 5 | 1 | 71.6 | 82.9 | 21 / 35 | 7518 |
| 6 | 1 | 70.8 | 81.3 | 21 / 35 | 7226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 83% |
| mz.NanoGod 2.02 | 20 | 75% |
| exauge.GateKeeper 1.1.121g | 15 | 87% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 43% | 130 |
| mz.NanoGod 2.02 | 26 | 31% | 37 |
| ayk.WallHugger 1.0 | 8 | 10% | 10 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 13 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 9 |

## Melee bench: F16

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.7 | 101 / 210 | 3.28 | 17.0% | 30450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.0% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.4% | 17 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.7 | 11.4% | 19 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 26 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.2 | 20 / 35 | 5429 |
| 2 | 1 | 65.3 | 71.7 | 17 / 35 | 5097 |
| 3 | 1 | 67.5 | 79.7 | 21 / 35 | 5582 |
| 4 | 1 | 62.9 | 68.6 | 10 / 35 | 4811 |
| 5 | 1 | 66.7 | 78.4 | 21 / 35 | 5002 |
| 6 | 1 | 61.9 | 66.3 | 12 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 85% |
| bvh.micro.Freya 0.3 | 28 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 77% |
| dummy.micro.Sparrow 2.5 | 23 | 74% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 18% | 38 |
| bvh.micro.Freya 0.3 | 20 | 18% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 39 |
| voidious.micro.BlitzBat 1.05 | 15 | 14% | 48 |
| conscience.Electron 1.3g | 13 | 12% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 12 |
| dl.BetterWalls 1.0 | 9 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 88.4 | 153 / 210 | 2.04 | 21.5% | 42705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.5% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 6 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 9 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 1 |
| sample.Corners 1.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.0 | 26 / 35 | 7307 |
| 2 | 1 | 72.5 | 90.8 | 25 / 35 | 7327 |
| 3 | 1 | 71.5 | 90.2 | 26 / 35 | 6668 |
| 4 | 1 | 70.5 | 83.8 | 25 / 35 | 6727 |
| 5 | 1 | 73.0 | 92.1 | 26 / 35 | 7643 |
| 6 | 1 | 71.3 | 86.7 | 25 / 35 | 7033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 85% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 33 | 100% |
| dsw.StaticD 1.0 | 12 | 58% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 15 | 26% | 59 |
| supersample.SuperBoxBot 1.0 | 15 | 26% | 39 |
| dsw.StaticD 1.0 | 14 | 25% | 29 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 12 |
| sul.Lunar 1.1 | 2 | 4% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 6 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.1 | 109 / 210 | 2.97 | 18.0% | 36770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.0% | 109 |
| radnor.DoctorBob 1.42 | 2.3 | 12.8% | 25 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.9% | 29 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 11 |
| amz.NanoClone 1.41 | 6.0 | 9.3% | 10 |
| sample.Walls 1.0 | 7.0 | 8.0% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.0 | 20 / 35 | 6435 |
| 2 | 1 | 65.1 | 72.1 | 17 / 35 | 5575 |
| 3 | 1 | 65.3 | 72.4 | 14 / 35 | 5962 |
| 4 | 1 | 67.6 | 81.3 | 20 / 35 | 6002 |
| 5 | 1 | 68.6 | 82.2 | 20 / 35 | 6563 |
| 6 | 1 | 67.9 | 79.7 | 18 / 35 | 6233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 83% |
| radnor.DoctorBob 1.42 | 26 | 85% |
| sample.Walls 1.0 | 12 | 100% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| mld.Wisdom 1.0 | 10 | 80% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Target 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 30% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 21% | 62 |
| radnor.DoctorBob 1.42 | 17 | 17% | 42 |
| KiraNL.Chupacabra 0.4 | 14 | 14% | 19 |
| amz.NanoClone 1.41 | 7 | 7% | 11 |
| sample.Walls 1.0 | 5 | 5% | 16 |
| jangs.ns51 1.0 | 5 | 5% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

