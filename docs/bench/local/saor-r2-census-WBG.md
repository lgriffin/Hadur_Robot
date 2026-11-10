# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.0 | 144 / 210 | 1.99 | 21.3% | 43436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.3% | 144 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 17 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 22 |
| mld.Infinity 2.2 | 4.0 | 12.6% | 20 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 3 |
| sample.Walls 1.0 | 6.5 | 7.3% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 1 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 84.8 | 22 / 35 | 6941 |
| 2 | 1 | 72.0 | 87.9 | 23 / 35 | 7560 |
| 3 | 1 | 73.4 | 93.7 | 28 / 35 | 7369 |
| 4 | 1 | 71.9 | 91.4 | 24 / 35 | 6800 |
| 5 | 1 | 73.4 | 91.1 | 25 / 35 | 7796 |
| 6 | 1 | 71.5 | 85.1 | 22 / 35 | 6970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 93% |
| radnor.DoctorBob 1.42 | 36 | 81% |
| mld.Infinity 2.2 | 32 | 91% |
| jangs.ns51 1.0 | 6 | 67% |
| amz.NanoClone 1.41 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 39% | 63 |
| mz.AntiGrav 1.0 | 18 | 27% | 80 |
| mld.Infinity 2.2 | 11 | 17% | 32 |
| amz.NanoClone 1.41 | 6 | 9% | 17 |
| jangs.ns51 1.0 | 3 | 5% | 5 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.8 | 122 / 210 | 2.46 | 18.6% | 32945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.3 | 18.6% | 122 |
| mld.DustBunny 3.8 | 2.2 | 14.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 45 |
| djdjdj.NanoSkunk10 1.0 | 4.8 | 9.5% | 5 |
| maribo.melee.BMV 0.1 | 5.2 | 9.4% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.9% | 9 |
| fullsail.SweetTea 1.1 | 7.8 | 6.8% | 5 |
| bzdp.BoxCar 2.0 | 8.2 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 22 / 35 | 5764 |
| 2 | 1 | 68.6 | 85.1 | 22 / 35 | 5336 |
| 3 | 1 | 70.1 | 89.5 | 25 / 35 | 5944 |
| 4 | 1 | 70.1 | 94.6 | 22 / 35 | 5552 |
| 5 | 1 | 68.2 | 85.4 | 21 / 35 | 5423 |
| 6 | 3 | 60.8 | 57.5 | 10 / 35 | 4926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 60 | 82% |
| oog.melee.Mercutio 1.0 | 57 | 79% |
| djdjdj.NanoSkunk10 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 32% | 75 |
| mld.DustBunny 3.8 | 25 | 28% | 69 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 11% | 21 |
| fullsail.SweetTea 1.1 | 6 | 7% | 7 |
| zyx.nano.Ant 1.1 | 6 | 7% | 6 |
| maribo.melee.BMV 0.1 | 5 | 6% | 11 |
| cs.Grudge 1.0 | 4 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 16 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 81.8 | 113 / 210 | 2.64 | 19.3% | 36701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.3% | 113 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 11 |
| cb.nano.Insomnia 1.0 | 4.0 | 10.7% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.6% | 25 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.5% | 1 |
| fm.mammillarias 1.3 | 6.5 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 4 |
| sample.Fire 1.0 | 9.0 | 5.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.2 | 17 / 35 | 6058 |
| 2 | 1 | 69.6 | 86.0 | 20 / 35 | 5832 |
| 3 | 1 | 70.3 | 83.2 | 21 / 35 | 6557 |
| 4 | 1 | 70.5 | 84.4 | 20 / 35 | 6788 |
| 5 | 1 | 65.6 | 72.1 | 15 / 35 | 5440 |
| 6 | 1 | 69.2 | 81.9 | 20 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 63% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 12 | 83% |
| sp.Nanos.Ember 1.1 | 10 | 80% |
| sample.Fire 1.0 | 4 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 29% | 45 |
| myl.micro.Troodon 1.10 | 23 | 24% | 64 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 22 |
| myl.nano.KomoriNinja 1.1 | 12 | 12% | 33 |
| fm.mammillarias 1.3 | 8 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 10 |
| sample.Tracker 1.0 | 3 | 3% | 4 |
| sample.Fire 1.0 | 2 | 2% | 6 |

## Melee bench: F04

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.3 | 157 / 210 | 1.96 | 21.4% | 40894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.4% | 157 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.5% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.5% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.3% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 9.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.9% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.7% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 6.0% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.3 | 23 / 35 | 6592 |
| 2 | 1 | 72.6 | 94.9 | 28 / 35 | 7011 |
| 3 | 1 | 69.4 | 83.2 | 20 / 35 | 6683 |
| 4 | 1 | 73.5 | 96.2 | 32 / 35 | 7261 |
| 5 | 1 | 70.6 | 85.4 | 27 / 35 | 6408 |
| 6 | 1 | 71.6 | 87.9 | 27 / 35 | 6939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 89% |
| stelo.SoJNanoMelee 1.1 | 51 | 88% |
| tj.zombie1n 1.0.1 | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| yk.JahMicro 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 45% | 78 |
| stelo.SoJNanoMelee 1.1 | 11 | 21% | 40 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 19 |
| yk.JahMicro 1.0 | 4 | 8% | 10 |
| sample.VelociRobot 1.0 | 2 | 4% | 12 |
| tj.zombie1n 1.0.1 | 2 | 4% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 6 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.2 | 100 / 210 | 3.59 | 16.2% | 28931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 16.2% | 100 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 31 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.8% | 16 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 15 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.0% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 65.4 | 15 / 35 | 4804 |
| 2 | 1 | 61.5 | 63.8 | 14 / 35 | 4548 |
| 3 | 1 | 65.3 | 74.3 | 17 / 35 | 5023 |
| 4 | 1 | 67.5 | 82.9 | 22 / 35 | 4915 |
| 5 | 1 | 62.7 | 65.1 | 14 / 35 | 4845 |
| 6 | 1 | 65.5 | 75.9 | 18 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 75% |
| simonton.nano.MeleeSeed 1.8 | 32 | 100% |
| ahf.NanoAndrew .4 | 25 | 76% |
| sam.Samspin 1.0 | 12 | 92% |
| EBBU.Sim2 1.02 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 19% | 48 |
| oog.melee.Corsair 1.0 | 18 | 16% | 47 |
| ahf.NanoAndrew .4 | 18 | 16% | 35 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 11% | 12 |
| EBBU.Sim2 1.02 | 11 | 10% | 19 |
| sam.Samspin 1.0 | 10 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 13 |
| robar.nano.Assertive_Melee 0.2 | 9 | 8% | 12 |
| sample.TrackFire 1.0 | 3 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.5 | 120 / 210 | 2.40 | 18.8% | 32846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.8% | 120 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.9% | 33 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 15 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.1% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 8 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| sample.SpinBot 1.0 | 8.2 | 7.1% | 2 |
| pa.Improved 1.0 | 8.8 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 19 / 35 | 5477 |
| 2 | 1 | 68.3 | 84.4 | 22 / 35 | 5245 |
| 3 | 1 | 69.1 | 87.0 | 20 / 35 | 5592 |
| 4 | 1 | 68.9 | 84.8 | 20 / 35 | 5839 |
| 5 | 1 | 66.5 | 81.3 | 18 / 35 | 5088 |
| 6 | 1 | 68.1 | 81.6 | 21 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 88% |
| oog.melee.CapuletDroid 1.1 | 35 | 91% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| gh.nano.Grofvuil 0.2 | 15 | 60% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 29% | 83 |
| gh.nano.Grofvuil 0.2 | 16 | 18% | 29 |
| oog.melee.CapuletDroid 1.1 | 13 | 14% | 39 |
| winamp32.micro.MicroMacro 1.0 | 11 | 12% | 17 |
| arthord.NanoSatanMelee Beta | 8 | 9% | 17 |
| fm.claire 1.7 | 6 | 7% | 6 |
| sample.SpinBot 1.0 | 5 | 6% | 8 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.2 | 133 / 210 | 2.15 | 19.5% | 35130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.5% | 133 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.0% | 18 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.8% | 25 |
| mz.MicroGodMelee 1 | 3.3 | 13.0% | 25 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 6 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.5% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 1 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 25 / 35 | 6223 |
| 2 | 1 | 69.0 | 86.0 | 19 / 35 | 5757 |
| 3 | 1 | 69.9 | 87.9 | 21 / 35 | 5993 |
| 4 | 1 | 71.2 | 94.0 | 26 / 35 | 6162 |
| 5 | 1 | 70.2 | 90.2 | 23 / 35 | 5835 |
| 6 | 1 | 66.5 | 76.2 | 19 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 91% |
| mz.MicroGodMelee 1 | 47 | 79% |
| gh.micro.Gruweltje 0.7 | 26 | 77% |
| DBall.Anarchy 0.1 | 13 | 100% |
| acogdev.alpha 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 25 | 32% | 68 |
| mz.MicroGodMelee 1 | 21 | 27% | 58 |
| gh.micro.Gruweltje 0.7 | 15 | 19% | 46 |
| DBall.Anarchy 0.1 | 5 | 6% | 13 |
| acogdev.alpha 0.2 | 4 | 5% | 6 |
| el.JumpShoot 0.2 | 3 | 4% | 6 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 7 |
| fire219.CatBot 1.0 | 2 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.4 | 117 / 210 | 3.30 | 17.3% | 32251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.3% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 3 |
| germ.TheMind .2 | 5.3 | 9.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 0 |
| awesomeness.Elite 1.0 | 6.8 | 8.6% | 6 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 5 |
| sample.Crazy 1.0 | 8.2 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 69.5 | 21 / 35 | 4861 |
| 2 | 1 | 67.7 | 77.5 | 22 / 35 | 5797 |
| 3 | 1 | 68.0 | 80.6 | 19 / 35 | 5711 |
| 4 | 1 | 66.9 | 75.6 | 19 / 35 | 5722 |
| 5 | 1 | 63.4 | 69.5 | 13 / 35 | 4720 |
| 6 | 1 | 66.4 | 73.7 | 23 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 88% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 5 | 60% |
| awesomeness.Elite 1.0 | 5 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 52% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 14% | 30 |
| germ.TheMind .2 | 11 | 12% | 16 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 16 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 7 |
| awesomeness.Elite 1.0 | 3 | 3% | 12 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 11 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.6 | 139 / 210 | 2.30 | 19.5% | 31831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.5% | 139 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.3% | 9 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.9% | 4 |
| ratosh.Wesco 1.4 | 6.3 | 8.9% | 6 |
| timmit.nano.TimDog 0.33 | 6.7 | 9.0% | 9 |
| spinnercat.Omen 1.0 | 7.8 | 8.1% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.8% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 25 / 35 | 5514 |
| 2 | 1 | 69.9 | 85.4 | 25 / 35 | 5399 |
| 3 | 1 | 69.1 | 84.8 | 21 / 35 | 5673 |
| 4 | 1 | 65.7 | 75.2 | 17 / 35 | 4586 |
| 5 | 1 | 70.7 | 87.3 | 25 / 35 | 5325 |
| 6 | 1 | 70.4 | 88.9 | 26 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 61 | 93% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| stelo.PatternRobot 1.0 | 17 | 82% |
| maribo.IotaCT 1.1 | 12 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| ratosh.Wesco 1.4 | 9 | 89% |
| spinnercat.Omen 1.0 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 50% |

Hadur died in 71 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 18% | 53 |
| timmit.nano.TimDog 0.33 | 13 | 18% | 23 |
| stelo.PatternRobot 1.0 | 13 | 18% | 20 |
| ratosh.Wesco 1.4 | 10 | 14% | 21 |
| nz.jdc.nano.GridFu 1.0 | 9 | 13% | 47 |
| maribo.IotaCT 1.1 | 8 | 11% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 12 |
| spinnercat.Omen 1.0 | 1 | 1% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.3 | 173 / 210 | 1.78 | 21.6% | 39899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.6% | 173 |
| baal.nano.N 1.42 | 2.5 | 11.7% | 8 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.5% | 9 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.8 | 9.1% | 6 |
| sanja.First 0.1 | 6.2 | 8.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.5% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 91.1 | 29 / 35 | 7084 |
| 2 | 1 | 72.6 | 95.9 | 29 / 35 | 6955 |
| 3 | 1 | 71.1 | 89.2 | 29 / 35 | 6413 |
| 4 | 1 | 72.5 | 92.7 | 32 / 35 | 6869 |
| 5 | 1 | 70.8 | 89.5 | 27 / 35 | 6477 |
| 6 | 1 | 70.5 | 89.5 | 27 / 35 | 6101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 92% |
| sanja.First 0.1 | 27 | 100% |
| tvv.nano.Polaris 1.2 | 26 | 92% |
| zyx.micro.Ant 1.1 | 25 | 84% |
| cvt.Firsty 1.0 | 24 | 92% |
| amk.Punbot.Punbot 0.01 | 23 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 46% | 38 |
| baal.nano.N 1.42 | 6 | 16% | 39 |
| Grystrion.TrackerWO 1.0 | 5 | 14% | 15 |
| tvv.nano.Polaris 1.2 | 3 | 8% | 43 |
| cvt.Firsty 1.0 | 2 | 5% | 28 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 8 |
| sanja.First 0.1 | 1 | 3% | 24 |
| sample.RamFire 1.0 | 1 | 3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 8 |

## Melee bench: F11

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.6 | 88 / 210 | 3.73 | 15.9% | 32358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.5 | 15.9% | 88 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 59 |
| cs.Wren 1.0 | 3.0 | 12.9% | 27 |
| js.PinBall 1.6 | 4.2 | 11.5% | 10 |
| mz.Cork 0.1 | 4.8 | 10.6% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 3 |
| evd.X1 0.01 | 6.8 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 66.3 | 15 / 35 | 5670 |
| 2 | 1 | 66.7 | 76.2 | 19 / 35 | 5694 |
| 3 | 2 | 63.2 | 70.5 | 12 / 35 | 4958 |
| 4 | 3 | 59.3 | 59.7 | 9 / 35 | 4533 |
| 5 | 1 | 64.3 | 69.2 | 15 / 35 | 5436 |
| 6 | 1 | 66.9 | 75.9 | 18 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 81% |
| cs.Wren 1.0 | 28 | 79% |
| js.PinBall 1.6 | 8 | 63% |
| mz.Cork 0.1 | 6 | 100% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 122 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 43% | 105 |
| cs.Wren 1.0 | 19 | 16% | 35 |
| joe.ADinosaur 1.0 | 14 | 11% | 14 |
| evd.X1 0.01 | 14 | 11% | 14 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| js.PinBall 1.6 | 6 | 5% | 10 |
| mz.Cork 0.1 | 5 | 4% | 15 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |

## Melee bench: F12

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.1 | 144 / 210 | 2.34 | 19.5% | 31027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.5% | 144 |
| myl.nano.Graviton 1.10 | 2.8 | 11.2% | 13 |
| stelo.AreaTargetingBot 1.1 | 3.0 | 10.9% | 16 |
| ntc.Opposite 1.5 | 4.5 | 10.3% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.3% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 1 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 8 |
| disan.Chair 2.2.0 | 7.7 | 8.0% | 9 |
| donjezza.Muncho 1.0 | 8.7 | 6.5% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 24 / 35 | 5316 |
| 2 | 1 | 69.4 | 88.6 | 26 / 35 | 5021 |
| 3 | 1 | 70.4 | 89.2 | 26 / 35 | 5502 |
| 4 | 1 | 65.5 | 76.2 | 18 / 35 | 4369 |
| 5 | 1 | 70.7 | 90.5 | 28 / 35 | 5461 |
| 6 | 1 | 68.0 | 80.3 | 22 / 35 | 5358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 89% |
| myl.nano.Graviton 1.10 | 37 | 95% |
| donjezza.Muncho 1.0 | 19 | 89% |
| ntc.Opposite 1.5 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 86% |
| DBall.NUKE 0.1 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 15 | 23% | 23 |
| ntc.Opposite 1.5 | 12 | 18% | 21 |
| stelo.AreaTargetingBot 1.1 | 11 | 17% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 14% | 25 |
| pbg.R2D2 1.0 | 7 | 11% | 12 |
| myl.nano.Graviton 1.10 | 5 | 8% | 44 |
| disan.Chair 2.2.0 | 4 | 6% | 19 |
| donjezza.Muncho 1.0 | 3 | 5% | 17 |
| DBall.NUKE 0.1 | 0 | 0% | 13 |

## Melee bench: F13

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.0 | 64 / 210 | 3.88 | 14.7% | 25876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.7 | 14.7% | 64 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 57 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.5% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.1% | 28 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.8 | 10 / 35 | 4352 |
| 2 | 2 | 63.2 | 67.6 | 14 / 35 | 4219 |
| 3 | 2 | 62.4 | 67.6 | 9 / 35 | 4349 |
| 4 | 1 | 64.3 | 74.3 | 10 / 35 | 4340 |
| 5 | 2 | 63.0 | 65.1 | 10 / 35 | 4531 |
| 6 | 2 | 61.2 | 63.8 | 11 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 56% |
| kawigi.micro.Shiz 1.1 | 24 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 64% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 44% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 14% | 33 |
| yagami.Tidus 0.11 | 20 | 14% | 32 |
| kawigi.micro.Shiz 1.1 | 11 | 8% | 26 |
| stelo.MirrorNano 1.3 | 11 | 8% | 11 |
| step.nanoPri 1.0 | 8 | 5% | 8 |
| ejb.Polaris 1.0.1 | 7 | 5% | 10 |
| kurios.DOSexe .9a | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.5 | 124 / 210 | 2.85 | 17.6% | 28295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.6% | 124 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 23 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 28 |
| ratosh.Nobo 0.21 | 3.8 | 11.1% | 8 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 6.3 | 9.2% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.0 | 23 / 35 | 4541 |
| 2 | 1 | 65.9 | 80.3 | 20 / 35 | 4287 |
| 3 | 1 | 68.0 | 85.7 | 21 / 35 | 5021 |
| 4 | 1 | 65.1 | 71.4 | 17 / 35 | 5099 |
| 5 | 1 | 64.8 | 73.3 | 21 / 35 | 4482 |
| 6 | 1 | 67.8 | 85.1 | 22 / 35 | 4865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 83% |
| wee.Gem 1.8.4 | 40 | 98% |
| wompi.Quokka 1.6 | 21 | 90% |
| ratosh.Nobo 0.21 | 17 | 82% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 16% | 42 |
| ratosh.Nobo 0.21 | 14 | 16% | 29 |
| wompi.Quokka 1.6 | 12 | 14% | 29 |
| bayen.UbaMicro 1.4 | 11 | 13% | 16 |
| wee.Gem 1.8.4 | 10 | 11% | 54 |
| stelo.MyAgileRobot 0.2 | 9 | 10% | 11 |
| maribo.FollowFire 1 | 7 | 8% | 8 |
| m3thos.Eva00 1.1 | 5 | 6% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 83.5 | 107 / 210 | 2.48 | 20.0% | 44764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.3 | 20.0% | 107 |
| wompi.Wallaby 5.1 | 1.7 | 17.6% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 25 |
| ayk.WallHugger 1.0 | 4.5 | 10.0% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.7% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 5 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.5 | 21 / 35 | 8148 |
| 2 | 2 | 67.7 | 73.7 | 13 / 35 | 6628 |
| 3 | 1 | 71.2 | 84.4 | 21 / 35 | 7183 |
| 4 | 1 | 72.3 | 86.7 | 19 / 35 | 8017 |
| 5 | 2 | 69.5 | 77.5 | 13 / 35 | 7399 |
| 6 | 1 | 72.1 | 89.5 | 20 / 35 | 7389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 74% |
| mz.NanoGod 2.02 | 18 | 39% |
| ayk.WallHugger 1.0 | 8 | 75% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 50% |
| sample.SittingDuck 1.0 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 46 | 44% | 126 |
| mz.NanoGod 2.02 | 32 | 31% | 46 |
| ayk.WallHugger 1.0 | 9 | 9% | 14 |
| exauge.GateKeeper 1.1.121g | 9 | 9% | 12 |
| stuff.Vlad 0.1 | 4 | 4% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 66.8 | 88 / 210 | 3.99 | 15.5% | 28481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 15.5% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 34 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.5% | 23 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.4% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.1% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.1 | 14 / 35 | 4956 |
| 2 | 1 | 62.8 | 68.6 | 14 / 35 | 4440 |
| 3 | 1 | 63.7 | 67.0 | 17 / 35 | 4754 |
| 4 | 1 | 62.6 | 66.7 | 15 / 35 | 4504 |
| 5 | 1 | 64.7 | 71.1 | 16 / 35 | 5277 |
| 6 | 1 | 61.3 | 62.5 | 12 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 75% |
| dummy.micro.Sparrow 2.5 | 16 | 88% |
| bvh.micro.Freya 0.3 | 12 | 92% |
| ap.Frederick 1.1 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 22% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 17% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 14% | 37 |
| dummy.micro.Sparrow 2.5 | 17 | 14% | 37 |
| conscience.Electron 1.3g | 16 | 13% | 18 |
| dl.BetterWalls 1.0 | 12 | 10% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 14 |
| bvh.micro.Freya 0.3 | 6 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.6 | 151 / 210 | 2.30 | 21.3% | 43392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.3% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 17 |
| sul.Lunar 1.1 | 3.7 | 11.2% | 13 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.9% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.0% | 3 |
| sample.Corners 1.0 | 9.0 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.0 | 27 / 35 | 7867 |
| 2 | 1 | 69.7 | 79.4 | 25 / 35 | 6836 |
| 3 | 1 | 70.2 | 81.3 | 21 / 35 | 6992 |
| 4 | 1 | 70.6 | 82.5 | 24 / 35 | 6849 |
| 5 | 1 | 71.8 | 87.0 | 25 / 35 | 7363 |
| 6 | 1 | 72.7 | 90.2 | 29 / 35 | 7485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 90% |
| sul.Lunar 1.1 | 42 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 90% |
| dsw.StaticD 1.0 | 13 | 62% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 31% | 61 |
| supersample.SuperBoxBot 1.0 | 17 | 29% | 41 |
| dsw.StaticD 1.0 | 13 | 22% | 25 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 7% | 11 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 9 |
| sul.Lunar 1.1 | 1 | 2% | 51 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.2 | 114 / 210 | 2.87 | 18.5% | 38286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.5% | 114 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 30 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.6% | 17 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 11 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 7 |
| sample.Walls 1.0 | 6.8 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 75.6 | 16 / 35 | 6415 |
| 2 | 1 | 69.4 | 81.3 | 23 / 35 | 6885 |
| 3 | 1 | 65.8 | 72.1 | 17 / 35 | 5846 |
| 4 | 1 | 68.8 | 81.0 | 20 / 35 | 6536 |
| 5 | 1 | 67.8 | 80.3 | 19 / 35 | 5982 |
| 6 | 1 | 69.3 | 85.1 | 19 / 35 | 6622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 92% |
| radnor.DoctorBob 1.42 | 30 | 77% |
| KiraNL.Chupacabra 0.4 | 13 | 92% |
| sample.Walls 1.0 | 12 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| mld.Wisdom 1.0 | 8 | 63% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 27% | 33 |
| radnor.DoctorBob 1.42 | 23 | 24% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 68 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 21 |
| jangs.ns51 1.0 | 7 | 7% | 9 |
| amz.NanoClone 1.41 | 6 | 6% | 12 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| sample.Walls 1.0 | 1 | 1% | 11 |

