# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.5 | 147 / 210 | 2.13 | 21.0% | 43480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.0% | 147 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 16 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 22 |
| radnor.DoctorBob 1.42 | 3.5 | 13.5% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 3 |
| sample.Walls 1.0 | 6.5 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.1 | 27 / 35 | 7490 |
| 2 | 1 | 70.4 | 82.2 | 21 / 35 | 7089 |
| 3 | 1 | 72.7 | 88.3 | 27 / 35 | 7569 |
| 4 | 1 | 71.1 | 85.1 | 21 / 35 | 7404 |
| 5 | 1 | 72.0 | 89.5 | 24 / 35 | 6979 |
| 6 | 1 | 71.9 | 87.6 | 27 / 35 | 6949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 94% |
| mld.Infinity 2.2 | 56 | 89% |
| radnor.DoctorBob 1.42 | 28 | 96% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 32% | 53 |
| mld.Infinity 2.2 | 11 | 17% | 61 |
| mz.AntiGrav 1.0 | 11 | 17% | 55 |
| amz.NanoClone 1.41 | 11 | 17% | 20 |
| sample.Walls 1.0 | 5 | 8% | 12 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| jangs.ns51 1.0 | 3 | 5% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.1 | 138 / 210 | 1.90 | 19.4% | 32400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.4% | 138 |
| mld.DustBunny 3.8 | 2.3 | 14.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.5% | 33 |
| maribo.melee.BMV 0.1 | 5.0 | 9.9% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 8.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 8 |
| bzdp.BoxCar 2.0 | 8.2 | 6.3% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.8 | 23 / 35 | 5741 |
| 2 | 1 | 69.3 | 88.9 | 21 / 35 | 5704 |
| 3 | 1 | 67.9 | 85.7 | 20 / 35 | 5037 |
| 4 | 1 | 70.0 | 94.3 | 27 / 35 | 5167 |
| 5 | 1 | 68.4 | 87.0 | 20 / 35 | 5410 |
| 6 | 1 | 70.3 | 94.6 | 27 / 35 | 5341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 76 | 83% |
| oog.melee.Mercutio 1.0 | 63 | 78% |
| djdjdj.NanoSkunk10 1.0 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 38% | 80 |
| mld.DustBunny 3.8 | 22 | 31% | 78 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 11% | 17 |
| zyx.nano.Ant 1.1 | 5 | 7% | 8 |
| maribo.melee.BMV 0.1 | 4 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 11 |
| bzdp.BoxCar 2.0 | 2 | 3% | 3 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.0 | 140 / 210 | 2.17 | 20.4% | 38206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.4% | 140 |
| myl.micro.Troodon 1.10 | 2.3 | 13.5% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 8 |
| cb.nano.Insomnia 1.0 | 4.2 | 10.3% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 22 |
| fm.mammillarias 1.3 | 6.3 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.7% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 4 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 85.1 | 24 / 35 | 6407 |
| 2 | 1 | 68.8 | 82.2 | 22 / 35 | 5844 |
| 3 | 1 | 70.3 | 86.0 | 22 / 35 | 6543 |
| 4 | 1 | 71.1 | 89.5 | 25 / 35 | 6411 |
| 5 | 1 | 71.4 | 90.5 | 23 / 35 | 6583 |
| 6 | 1 | 71.1 | 88.9 | 24 / 35 | 6418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 40 | 83% |
| cb.nano.Insomnia 1.0 | 35 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 26% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 46 |
| myl.nano.KomoriNinja 1.1 | 12 | 17% | 43 |
| fm.mammillarias 1.3 | 12 | 17% | 16 |
| cb.nano.Insomnia 1.0 | 7 | 10% | 12 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 6 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 14 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.7 | 147 / 210 | 2.01 | 20.7% | 39365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.7% | 147 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 21 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 11 |
| tj.zombie1n 1.0.1 | 5.0 | 9.2% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.2% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.2% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.2 | 26 / 35 | 6101 |
| 2 | 1 | 72.0 | 91.7 | 29 / 35 | 6911 |
| 3 | 1 | 70.2 | 88.6 | 21 / 35 | 6542 |
| 4 | 1 | 70.2 | 85.4 | 22 / 35 | 6654 |
| 5 | 1 | 69.8 | 86.3 | 24 / 35 | 6295 |
| 6 | 1 | 71.0 | 91.1 | 25 / 35 | 6862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 48 | 85% |
| stelo.SoJNanoMelee 1.1 | 42 | 86% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| tj.zombie1n 1.0.1 | 18 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| yk.JahMicro 1.0 | 11 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 40% | 77 |
| stelo.SoJNanoMelee 1.1 | 15 | 24% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 22 |
| tj.zombie1n 1.0.1 | 5 | 8% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 13 |
| yk.JahMicro 1.0 | 2 | 3% | 12 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 26 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 74.4 | 98 / 210 | 3.30 | 16.4% | 29144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 16.4% | 98 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.5% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.9% | 23 |
| EBBU.Sim2 1.02 | 5.2 | 10.0% | 8 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.2 | 18 / 35 | 4686 |
| 2 | 1 | 65.1 | 74.0 | 19 / 35 | 5043 |
| 3 | 1 | 65.0 | 77.1 | 14 / 35 | 5115 |
| 4 | 1 | 65.1 | 75.9 | 18 / 35 | 5077 |
| 5 | 1 | 65.3 | 76.2 | 16 / 35 | 5035 |
| 6 | 1 | 61.3 | 67.3 | 13 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 97% |
| oog.melee.Corsair 1.0 | 31 | 52% |
| sam.Samspin 1.0 | 16 | 94% |
| ahf.NanoAndrew .4 | 15 | 73% |
| EBBU.Sim2 1.02 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| sample.TrackFire 1.0 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |

Hadur died in 113 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 25% | 43 |
| ahf.NanoAndrew .4 | 24 | 21% | 38 |
| robar.nano.Assertive_Melee 0.2 | 19 | 17% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 12% | 11 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 41 |
| EBBU.Sim2 1.02 | 6 | 5% | 18 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 14 |
| sam.Samspin 1.0 | 3 | 3% | 18 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.9 | 139 / 210 | 2.18 | 19.4% | 32896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.4% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 24 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 13 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.4% | 13 |
| fm.claire 1.7 | 5.2 | 9.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 9 |
| arthord.NanoSatanMelee Beta | 7.2 | 8.2% | 5 |
| sample.SpinBot 1.0 | 7.2 | 7.7% | 4 |
| pa.Improved 1.0 | 9.2 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.5 | 26 / 35 | 5567 |
| 2 | 1 | 69.5 | 91.4 | 24 / 35 | 5402 |
| 3 | 1 | 69.1 | 87.9 | 22 / 35 | 5516 |
| 4 | 1 | 66.5 | 78.7 | 21 / 35 | 5012 |
| 5 | 1 | 69.6 | 86.0 | 24 / 35 | 6236 |
| 6 | 1 | 68.6 | 86.7 | 22 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 84% |
| oog.melee.CapuletDroid 1.1 | 37 | 95% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| sample.SpinBot 1.0 | 7 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 71 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 31% | 76 |
| gh.nano.Grofvuil 0.2 | 14 | 20% | 31 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 45 |
| fm.claire 1.7 | 6 | 8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 15 |
| sample.SpinBot 1.0 | 5 | 7% | 11 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 11 |
| kurios.DOSexe .9b | 4 | 6% | 7 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.1 | 104 / 210 | 2.80 | 17.8% | 33509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 17.8% | 104 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.4% | 34 |
| mz.MicroGodMelee 1 | 3.0 | 13.5% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.4% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 1 |
| acogdev.alpha 0.2 | 7.5 | 6.6% | 4 |
| el.JumpShoot 0.2 | 8.5 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.1 | 21 / 35 | 5694 |
| 2 | 1 | 65.0 | 73.3 | 14 / 35 | 5355 |
| 3 | 1 | 68.4 | 83.2 | 20 / 35 | 5590 |
| 4 | 1 | 67.1 | 77.1 | 17 / 35 | 5848 |
| 5 | 1 | 66.9 | 79.0 | 18 / 35 | 5420 |
| 6 | 1 | 67.4 | 83.5 | 14 / 35 | 5602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 44 | 73% |
| spinnercat.micro.Tyger 0.1 | 41 | 80% |
| gh.micro.Gruweltje 0.7 | 31 | 81% |
| DBall.Anarchy 0.1 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 35% | 73 |
| spinnercat.micro.Tyger 0.1 | 26 | 25% | 51 |
| gh.micro.Gruweltje 0.7 | 19 | 18% | 49 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 10 |
| mbro.Detektor3 0.1.1 | 6 | 6% | 8 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.1 | 109 / 210 | 3.42 | 16.7% | 31790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.3 | 16.7% | 109 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.1% | 32 |
| germ.TheMind .2 | 4.8 | 10.0% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 6 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.4% | 7 |
| sample.Crazy 1.0 | 8.5 | 6.7% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.1 | 18 / 35 | 5127 |
| 2 | 3 | 61.2 | 62.2 | 15 / 35 | 4419 |
| 3 | 1 | 67.5 | 78.7 | 21 / 35 | 6020 |
| 4 | 1 | 66.0 | 74.6 | 17 / 35 | 5702 |
| 5 | 1 | 66.0 | 75.2 | 20 / 35 | 5200 |
| 6 | 1 | 65.9 | 75.6 | 18 / 35 | 5322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 83% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| germ.TheMind .2 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 42% | 101 |
| germ.TheMind .2 | 17 | 17% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 10% | 21 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 8 | 8% | 18 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 13 |
| sample.Crazy 1.0 | 1 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.4 | 136 / 210 | 2.40 | 18.7% | 28965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.7% | 136 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.4% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 11.1% | 14 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 8.9% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.9% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 8.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.7 | 24 / 35 | 4911 |
| 2 | 1 | 69.7 | 88.3 | 24 / 35 | 5032 |
| 3 | 1 | 67.8 | 82.5 | 22 / 35 | 4477 |
| 4 | 1 | 69.3 | 82.9 | 22 / 35 | 5343 |
| 5 | 1 | 68.9 | 84.8 | 24 / 35 | 4569 |
| 6 | 1 | 67.5 | 82.5 | 20 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 90% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| stelo.PatternRobot 1.0 | 17 | 82% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| maribo.IotaCT 1.1 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 20% | 65 |
| timmit.nano.TimDog 0.33 | 15 | 20% | 23 |
| stelo.PatternRobot 1.0 | 14 | 19% | 24 |
| ratosh.Wesco 1.4 | 12 | 16% | 22 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 9% | 10 |
| spinnercat.Omen 1.0 | 3 | 4% | 6 |
| maribo.IotaCT 1.1 | 1 | 1% | 11 |

## Melee bench: F10

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.2 | 165 / 210 | 1.70 | 21.2% | 39010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.2% | 165 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.0% | 22 |
| baal.nano.N 1.42 | 3.0 | 10.9% | 4 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.1% | 4 |
| zyx.micro.Ant 1.1 | 4.3 | 9.9% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 0 |
| sanja.First 0.1 | 6.8 | 8.2% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 96.2 | 31 / 35 | 6531 |
| 2 | 1 | 71.2 | 91.4 | 28 / 35 | 6477 |
| 3 | 1 | 71.4 | 91.7 | 26 / 35 | 6765 |
| 4 | 1 | 69.4 | 87.3 | 26 / 35 | 5967 |
| 5 | 1 | 70.2 | 91.7 | 25 / 35 | 6185 |
| 6 | 1 | 72.3 | 94.6 | 29 / 35 | 7085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 93% |
| cvt.Firsty 1.0 | 28 | 100% |
| baal.nano.N 1.42 | 24 | 100% |
| zyx.micro.Ant 1.1 | 24 | 88% |
| sanja.First 0.1 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| sample.RamFire 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 19 | 42% | 38 |
| tvv.nano.Polaris 1.2 | 10 | 22% | 56 |
| cvt.Firsty 1.0 | 5 | 11% | 32 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 23 |
| sanja.First 0.1 | 2 | 4% | 25 |
| baal.nano.N 1.42 | 2 | 4% | 21 |
| sample.RamFire 1.0 | 2 | 4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 74.2 | 95 / 210 | 3.32 | 16.2% | 30436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 16.2% | 95 |
| kc.micro.Figment 1.0 | 1.8 | 14.6% | 58 |
| cs.Wren 1.0 | 3.0 | 13.3% | 22 |
| mz.Cork 0.1 | 4.5 | 10.9% | 12 |
| js.PinBall 1.6 | 4.7 | 11.2% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 3 |
| evd.X1 0.01 | 7.0 | 8.0% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 69.8 | 16 / 35 | 4693 |
| 2 | 1 | 65.5 | 78.4 | 15 / 35 | 5211 |
| 3 | 1 | 66.2 | 77.1 | 18 / 35 | 5498 |
| 4 | 1 | 63.3 | 69.5 | 15 / 35 | 4911 |
| 5 | 1 | 65.4 | 78.4 | 18 / 35 | 4813 |
| 6 | 1 | 64.1 | 72.1 | 13 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 78% |
| cs.Wren 1.0 | 37 | 73% |
| js.PinBall 1.6 | 12 | 92% |
| mz.Cork 0.1 | 9 | 89% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 40% | 97 |
| cs.Wren 1.0 | 20 | 17% | 40 |
| joe.ADinosaur 1.0 | 17 | 15% | 17 |
| evd.X1 0.01 | 12 | 10% | 13 |
| js.PinBall 1.6 | 10 | 9% | 21 |
| mz.Cork 0.1 | 7 | 6% | 13 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.9 | 136 / 210 | 2.45 | 18.9% | 29324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.9% | 136 |
| lrem.micro.SpikeSoldier 0.4 | 3.0 | 11.2% | 7 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 12 |
| myl.nano.Graviton 1.10 | 3.8 | 10.9% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.3% | 15 |
| pfvicm.Sobieski 7.2.3b | 6.7 | 9.1% | 3 |
| DBall.NUKE 0.1 | 6.7 | 9.0% | 10 |
| disan.Chair 2.2.0 | 7.0 | 8.7% | 8 |
| donjezza.Muncho 1.0 | 9.3 | 5.6% | 6 |
| pbg.R2D2 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 20 / 35 | 4902 |
| 2 | 1 | 68.0 | 84.4 | 23 / 35 | 4735 |
| 3 | 1 | 70.1 | 89.2 | 27 / 35 | 4882 |
| 4 | 1 | 69.6 | 87.9 | 25 / 35 | 4960 |
| 5 | 1 | 69.2 | 84.1 | 25 / 35 | 5319 |
| 6 | 1 | 65.3 | 77.1 | 16 / 35 | 4526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 33 | 82% |
| myl.nano.Graviton 1.10 | 33 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 89% |
| disan.Chair 2.2.0 | 16 | 88% |
| donjezza.Muncho 1.0 | 14 | 100% |
| DBall.NUKE 0.1 | 13 | 100% |
| ntc.Opposite 1.5 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 20% | 44 |
| stelo.AreaTargetingBot 1.1 | 15 | 20% | 37 |
| pfvicm.Sobieski 7.2.3b | 13 | 17% | 21 |
| ntc.Opposite 1.5 | 11 | 15% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 22 |
| DBall.NUKE 0.1 | 6 | 8% | 20 |
| disan.Chair 2.2.0 | 3 | 4% | 19 |
| donjezza.Muncho 1.0 | 2 | 3% | 10 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 65.9 | 66 / 210 | 4.07 | 14.5% | 26669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.7 | 14.5% | 66 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 47 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 31 |
| yagami.Tidus 0.11 | 4.2 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 65.7 | 10 / 35 | 4650 |
| 2 | 1 | 64.8 | 71.4 | 17 / 35 | 4717 |
| 3 | 1 | 61.8 | 65.1 | 9 / 35 | 4332 |
| 4 | 5 | 57.9 | 54.9 | 6 / 35 | 4002 |
| 5 | 1 | 61.2 | 62.5 | 9 / 35 | 4471 |
| 6 | 1 | 65.2 | 75.6 | 15 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 54% |
| oog.melee.Capulet 1.2 | 21 | 81% |
| kawigi.micro.Shiz 1.1 | 21 | 90% |
| yagami.Tidus 0.11 | 15 | 87% |
| ejb.Polaris 1.0.1 | 6 | 67% |

Hadur died in 144 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 41% | 75 |
| yagami.Tidus 0.11 | 28 | 19% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% | 42 |
| kawigi.micro.Shiz 1.1 | 16 | 11% | 30 |
| ejb.Polaris 1.0.1 | 6 | 4% | 12 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.5 | 140 / 210 | 2.48 | 18.4% | 29123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.4% | 140 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 20 |
| ratosh.Nobo 0.21 | 3.7 | 11.3% | 9 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 12 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 16 |
| m3thos.Eva00 1.1 | 5.2 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 7.2 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.6 | 21 / 35 | 5048 |
| 2 | 1 | 67.7 | 85.7 | 27 / 35 | 4514 |
| 3 | 1 | 68.3 | 85.7 | 24 / 35 | 4985 |
| 4 | 1 | 66.4 | 78.7 | 18 / 35 | 4980 |
| 5 | 1 | 66.7 | 78.4 | 22 / 35 | 4939 |
| 6 | 1 | 69.4 | 91.1 | 28 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| wee.Gem 1.8.4 | 39 | 97% |
| wompi.Quokka 1.6 | 30 | 80% |
| ratosh.Nobo 0.21 | 17 | 94% |
| m3thos.Eva00 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 20% | 56 |
| wompi.Quokka 1.6 | 14 | 20% | 31 |
| ratosh.Nobo 0.21 | 11 | 16% | 19 |
| bayen.UbaMicro 1.4 | 7 | 10% | 12 |
| wee.Gem 1.8.4 | 6 | 9% | 48 |
| maribo.FollowFire 1 | 6 | 9% | 7 |
| m3thos.Eva00 1.1 | 5 | 7% | 24 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.1 | 120 / 210 | 2.25 | 20.5% | 44848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.5% | 120 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 27 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 4 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 78.7 | 14 / 35 | 6876 |
| 2 | 1 | 73.0 | 90.5 | 24 / 35 | 7754 |
| 3 | 1 | 72.2 | 87.9 | 23 / 35 | 7488 |
| 4 | 1 | 71.7 | 86.7 | 17 / 35 | 7803 |
| 5 | 1 | 70.3 | 83.2 | 21 / 35 | 6981 |
| 6 | 1 | 73.0 | 89.5 | 21 / 35 | 7946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 99 | 77% |
| mz.NanoGod 2.02 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 6 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 43% | 123 |
| mz.NanoGod 2.02 | 30 | 33% | 46 |
| ayk.WallHugger 1.0 | 9 | 10% | 13 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 15 |
| stuff.Vlad 0.1 | 4 | 4% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.3 | 112 / 210 | 3.13 | 17.2% | 30387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 17.2% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 16 |
| dummy.micro.Sparrow 2.5 | 3.0 | 11.7% | 23 |
| bvh.micro.Freya 0.3 | 4.2 | 10.8% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 23 |
| conscience.Electron 1.3g | 6.5 | 8.5% | 5 |
| stelo.MirrorMicro 1.0 | 6.8 | 8.7% | 7 |
| dl.BetterWalls 1.0 | 8.2 | 6.7% | 2 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 70.8 | 19 / 35 | 4877 |
| 2 | 1 | 63.5 | 68.9 | 16 / 35 | 4741 |
| 3 | 1 | 66.0 | 77.5 | 18 / 35 | 4942 |
| 4 | 1 | 67.8 | 83.2 | 23 / 35 | 5348 |
| 5 | 1 | 64.7 | 72.7 | 16 / 35 | 5039 |
| 6 | 1 | 68.4 | 84.8 | 20 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 93% |
| dummy.micro.Sparrow 2.5 | 21 | 76% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 71% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 19% | 65 |
| dummy.micro.Sparrow 2.5 | 18 | 18% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 16% | 33 |
| conscience.Electron 1.3g | 16 | 16% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 13 |
| dl.BetterWalls 1.0 | 9 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 13 |
| bvh.micro.Freya 0.3 | 4 | 4% | 15 |

## Melee bench: F17

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 91.5 | 163 / 210 | 1.76 | 21.9% | 42838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.9% | 163 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 7 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.8% | 11 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.7% | 3 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.2% | 2 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.3% | 2 |
| sample.Corners 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 93.0 | 29 / 35 | 7633 |
| 2 | 1 | 72.2 | 93.7 | 26 / 35 | 6879 |
| 3 | 1 | 70.7 | 84.1 | 24 / 35 | 7305 |
| 4 | 1 | 71.9 | 90.2 | 28 / 35 | 6938 |
| 5 | 1 | 73.9 | 96.2 | 30 / 35 | 7548 |
| 6 | 1 | 72.0 | 92.1 | 26 / 35 | 6535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 56 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 88% |
| supersample.SuperBoxBot 1.0 | 24 | 79% |
| dsw.StaticD 1.0 | 14 | 79% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 40% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 26% | 55 |
| dsw.StaticD 1.0 | 6 | 13% | 21 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 5 |
| sul.Lunar 1.1 | 1 | 2% | 66 |
| sample.Corners 1.0 | 1 | 2% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F18

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.3 | 106 / 210 | 2.86 | 18.0% | 37401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.0% | 106 |
| radnor.DoctorBob 1.42 | 2.8 | 13.4% | 31 |
| mld.Wisdom 1.0 | 3.0 | 12.7% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 24 |
| amz.NanoClone 1.41 | 5.3 | 9.8% | 12 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.6% | 4 |
| sample.Walls 1.0 | 7.3 | 7.9% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.2 | 15 / 35 | 6194 |
| 2 | 1 | 69.0 | 84.4 | 21 / 35 | 6521 |
| 3 | 1 | 63.7 | 67.9 | 12 / 35 | 5907 |
| 4 | 1 | 68.4 | 82.9 | 20 / 35 | 6285 |
| 5 | 1 | 67.2 | 79.7 | 19 / 35 | 6039 |
| 6 | 1 | 69.0 | 84.8 | 19 / 35 | 6455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 84% |
| mld.Wisdom 1.0 | 27 | 59% |
| radnor.DoctorBob 1.42 | 24 | 71% |
| amz.NanoClone 1.41 | 10 | 90% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 41 | 39% | 62 |
| radnor.DoctorBob 1.42 | 28 | 27% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 13% | 53 |
| KiraNL.Chupacabra 0.4 | 10 | 10% | 15 |
| amz.NanoClone 1.41 | 6 | 6% | 12 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

