# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.5 | 157 / 210 | 1.95 | 21.4% | 41859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.4% | 157 |
| mz.AntiGrav 1.0 | 2.3 | 14.0% | 15 |
| mld.Infinity 2.2 | 3.3 | 13.4% | 20 |
| radnor.DoctorBob 1.42 | 3.3 | 13.4% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 4 |
| sample.Walls 1.0 | 6.2 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 86.7 | 26 / 35 | 6510 |
| 2 | 1 | 73.2 | 89.5 | 27 / 35 | 7849 |
| 3 | 1 | 73.0 | 92.7 | 25 / 35 | 7153 |
| 4 | 1 | 71.3 | 87.6 | 26 / 35 | 6420 |
| 5 | 1 | 72.0 | 89.5 | 26 / 35 | 6920 |
| 6 | 1 | 72.5 | 90.8 | 27 / 35 | 7007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 97% |
| mld.Infinity 2.2 | 49 | 92% |
| radnor.DoctorBob 1.42 | 34 | 85% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 6 | 83% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 31% | 29 |
| radnor.DoctorBob 1.42 | 16 | 29% | 66 |
| mz.AntiGrav 1.0 | 7 | 13% | 69 |
| amz.NanoClone 1.41 | 7 | 13% | 16 |
| jangs.ns51 1.0 | 4 | 7% | 5 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| sample.Walls 1.0 | 0 | 0% | 12 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.0 | 126 / 210 | 2.44 | 18.5% | 31233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 18.5% | 126 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.8% | 56 |
| mld.DustBunny 3.8 | 3.2 | 12.6% | 9 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 1 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.6% | 4 |
| bzdp.BoxCar 2.0 | 7.3 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 6.9% | 12 |
| fullsail.SweetTea 1.1 | 8.8 | 6.0% | 1 |
| cs.Grudge 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 24 / 35 | 5443 |
| 2 | 1 | 68.4 | 85.1 | 19 / 35 | 5218 |
| 3 | 1 | 70.4 | 94.6 | 25 / 35 | 5630 |
| 4 | 1 | 67.6 | 84.8 | 22 / 35 | 4777 |
| 5 | 1 | 70.0 | 93.0 | 25 / 35 | 5226 |
| 6 | 2 | 61.0 | 55.2 | 11 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 76 | 68% |
| mld.DustBunny 3.8 | 40 | 95% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 60% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 38% | 84 |
| mld.DustBunny 3.8 | 11 | 13% | 41 |
| zyx.nano.Ant 1.1 | 8 | 10% | 9 |
| cs.Grudge 1.0 | 8 | 10% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 14 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 23 |
| maribo.melee.BMV 0.1 | 5 | 6% | 12 |
| fullsail.SweetTea 1.1 | 5 | 6% | 10 |
| bzdp.BoxCar 2.0 | 2 | 2% | 6 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 87.1 | 159 / 210 | 2.16 | 20.9% | 37818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.9% | 159 |
| myl.micro.Troodon 1.10 | 2.0 | 13.5% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.4% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.5% | 12 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.0% | 1 |
| fm.mammillarias 1.3 | 6.2 | 8.4% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.1% | 4 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 79.4 | 22 / 35 | 6036 |
| 2 | 1 | 71.7 | 89.2 | 28 / 35 | 6371 |
| 3 | 1 | 72.5 | 94.0 | 30 / 35 | 6556 |
| 4 | 1 | 70.5 | 86.7 | 27 / 35 | 5793 |
| 5 | 1 | 70.8 | 84.4 | 25 / 35 | 6594 |
| 6 | 1 | 71.5 | 89.2 | 27 / 35 | 6468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 47 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 44 | 91% |
| cb.nano.Insomnia 1.0 | 23 | 100% |
| myl.nano.KomoriNinja 1.1 | 20 | 95% |
| sp.Nanos.Ember 1.1 | 15 | 100% |
| fm.mammillarias 1.3 | 9 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 12 | 24% | 43 |
| myl.micro.Troodon 1.10 | 10 | 20% | 61 |
| myl.nano.KomoriNinja 1.1 | 8 | 16% | 37 |
| cb.nano.Insomnia 1.0 | 7 | 14% | 11 |
| fm.mammillarias 1.3 | 4 | 8% | 13 |
| sp.Nanos.Ember 1.1 | 3 | 6% | 18 |
| cs.sheldor.Talon 1.1 | 3 | 6% | 13 |
| sample.Tracker 1.0 | 3 | 6% | 5 |
| sample.Fire 1.0 | 1 | 2% | 6 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.9 | 158 / 210 | 2.09 | 20.9% | 39341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.9% | 158 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 22 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 7 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.0% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 0 |
| yk.JahMicro 1.0 | 6.8 | 7.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 28 / 35 | 6757 |
| 2 | 1 | 72.8 | 97.1 | 33 / 35 | 6423 |
| 3 | 1 | 68.3 | 79.4 | 24 / 35 | 5959 |
| 4 | 1 | 72.7 | 94.3 | 28 / 35 | 7030 |
| 5 | 1 | 70.5 | 85.7 | 25 / 35 | 6738 |
| 6 | 1 | 68.6 | 79.7 | 20 / 35 | 6434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 83% |
| stelo.SoJNanoMelee 1.1 | 41 | 95% |
| tj.zombie1n 1.0.1 | 20 | 85% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 44% | 84 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 15% | 13 |
| stelo.SoJNanoMelee 1.1 | 7 | 13% | 32 |
| tj.zombie1n 1.0.1 | 6 | 12% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 19 |
| yk.JahMicro 1.0 | 3 | 6% | 10 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 23 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.4 | 98 / 210 | 3.30 | 16.7% | 30225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.7% | 98 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 35 |
| ahf.NanoAndrew .4 | 3.2 | 11.4% | 29 |
| EBBU.Sim2 1.02 | 5.0 | 10.1% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.4% | 17 |
| sam.Samspin 1.0 | 5.7 | 9.8% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.9% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 71.4 | 15 / 35 | 4893 |
| 2 | 1 | 65.7 | 76.5 | 19 / 35 | 5366 |
| 3 | 1 | 63.4 | 68.3 | 11 / 35 | 5109 |
| 4 | 1 | 67.1 | 82.9 | 19 / 35 | 5257 |
| 5 | 1 | 65.9 | 78.4 | 21 / 35 | 4737 |
| 6 | 1 | 63.0 | 68.9 | 13 / 35 | 4863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 51% |
| simonton.nano.MeleeSeed 1.8 | 32 | 91% |
| ahf.NanoAndrew .4 | 25 | 92% |
| sam.Samspin 1.0 | 11 | 91% |
| EBBU.Sim2 1.02 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 27% | 54 |
| ahf.NanoAndrew .4 | 14 | 12% | 41 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 18 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 18 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 36 |
| EBBU.Sim2 1.02 | 11 | 10% | 18 |
| sam.Samspin 1.0 | 9 | 8% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 3 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.8 | 153 / 210 | 2.19 | 19.6% | 32409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.6% | 153 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 21 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.8% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.2% | 3 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 5 |
| fm.claire 1.7 | 6.2 | 8.2% | 0 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 3 |
| pa.Improved 1.0 | 9.2 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 26 / 35 | 5561 |
| 2 | 1 | 68.9 | 87.6 | 25 / 35 | 5017 |
| 3 | 1 | 68.9 | 85.1 | 25 / 35 | 5279 |
| 4 | 1 | 67.9 | 85.4 | 22 / 35 | 4851 |
| 5 | 1 | 71.5 | 93.3 | 30 / 35 | 5954 |
| 6 | 1 | 69.0 | 82.2 | 25 / 35 | 5747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 90% |
| oog.melee.CapuletDroid 1.1 | 34 | 88% |
| gh.nano.Grofvuil 0.2 | 17 | 94% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 14 | 25% | 23 |
| gh.nano.Grofvuil 0.2 | 13 | 23% | 40 |
| d414.nano.Quantum 1.0.0 | 10 | 18% | 72 |
| arthord.NanoSatanMelee Beta | 7 | 12% | 15 |
| sample.SpinBot 1.0 | 5 | 9% | 11 |
| fm.claire 1.7 | 4 | 7% | 16 |
| kurios.DOSexe .9b | 3 | 5% | 12 |
| pa.Improved 1.0 | 1 | 2% | 7 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 13 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.2 | 109 / 210 | 2.33 | 18.7% | 34155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.7% | 109 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 39 |
| mz.MicroGodMelee 1 | 3.2 | 13.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.2% | 16 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 5 |
| fire219.CatBot 1.0 | 8.0 | 6.4% | 1 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 1 |
| acogdev.alpha 0.2 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 19 / 35 | 5964 |
| 2 | 1 | 67.1 | 81.0 | 19 / 35 | 5329 |
| 3 | 1 | 67.3 | 82.5 | 17 / 35 | 5297 |
| 4 | 1 | 67.9 | 84.1 | 13 / 35 | 5831 |
| 5 | 1 | 70.4 | 91.7 | 22 / 35 | 5790 |
| 6 | 1 | 69.0 | 88.3 | 19 / 35 | 5944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 53 | 58% |
| spinnercat.micro.Tyger 0.1 | 51 | 88% |
| gh.micro.Gruweltje 0.7 | 27 | 37% |
| DBall.Anarchy 0.1 | 11 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 43 | 42% | 81 |
| gh.micro.Gruweltje 0.7 | 32 | 31% | 46 |
| spinnercat.micro.Tyger 0.1 | 11 | 11% | 44 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 13 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.8 | 123 / 210 | 3.27 | 17.3% | 32032 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 17.3% | 123 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.4% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.9% | 27 |
| germ.TheMind .2 | 5.0 | 9.8% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.7% | 3 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.0% | 3 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.2 | 18 / 35 | 4988 |
| 2 | 1 | 66.8 | 75.2 | 23 / 35 | 5574 |
| 3 | 1 | 65.9 | 71.1 | 21 / 35 | 5622 |
| 4 | 2 | 64.3 | 68.9 | 18 / 35 | 5004 |
| 5 | 1 | 64.9 | 72.4 | 17 / 35 | 5175 |
| 6 | 1 | 69.7 | 86.0 | 26 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 88% |
| germ.TheMind .2 | 19 | 95% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 87% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 54% | 118 |
| germ.TheMind .2 | 10 | 11% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 10% | 30 |
| awesomeness.Elite 1.0 | 7 | 8% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 4 | 5% | 8 |
| stelo.UntouchableNano 1.3 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.9 | 164 / 210 | 1.90 | 20.5% | 31181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 164 |
| rz.HawkOnFire 0.1 | 2.2 | 13.0% | 13 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.6% | 10 |
| maribo.IotaCT 1.1 | 4.8 | 10.3% | 8 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 3 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 7.0% | 3 |
| stelo.PatternRobot 1.0 | 8.3 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 24 / 35 | 4782 |
| 2 | 1 | 70.6 | 87.9 | 26 / 35 | 5108 |
| 3 | 1 | 71.8 | 90.2 | 27 / 35 | 5875 |
| 4 | 1 | 72.6 | 94.9 | 31 / 35 | 5564 |
| 5 | 1 | 71.2 | 91.1 | 29 / 35 | 5191 |
| 6 | 1 | 70.0 | 87.3 | 27 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 98% |
| nz.jdc.nano.GridFu 1.0 | 48 | 96% |
| timmit.nano.TimDog 0.33 | 16 | 100% |
| maribo.IotaCT 1.1 | 13 | 77% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| ratosh.Wesco 1.4 | 9 | 100% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 11 | 23% | 26 |
| nz.jdc.nano.GridFu 1.0 | 10 | 21% | 63 |
| rz.HawkOnFire 0.1 | 10 | 21% | 57 |
| maribo.IotaCT 1.1 | 5 | 11% | 21 |
| stelo.PatternRobot 1.0 | 5 | 11% | 13 |
| ratosh.Wesco 1.4 | 2 | 4% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.0 | 185 / 210 | 1.63 | 22.1% | 40603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.1% | 185 |
| baal.nano.N 1.42 | 2.3 | 11.5% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.6% | 11 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.5% | 0 |
| sanja.First 0.1 | 5.8 | 8.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.5% | 1 |
| zyx.micro.Ant 1.1 | 6.2 | 8.7% | 4 |
| cvt.Firsty 1.0 | 7.7 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.3 | 32 / 35 | 6755 |
| 2 | 1 | 73.0 | 96.8 | 32 / 35 | 6841 |
| 3 | 1 | 72.4 | 95.2 | 29 / 35 | 6947 |
| 4 | 1 | 72.0 | 90.8 | 31 / 35 | 7046 |
| 5 | 1 | 71.7 | 90.5 | 30 / 35 | 6611 |
| 6 | 1 | 71.4 | 90.5 | 31 / 35 | 6403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 96% |
| tvv.nano.Polaris 1.2 | 41 | 95% |
| cvt.Firsty 1.0 | 33 | 100% |
| sanja.First 0.1 | 24 | 96% |
| amk.Punbot.Punbot 0.01 | 21 | 95% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| zyx.micro.Ant 1.1 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 6 | 24% | 63 |
| baal.nano.N 1.42 | 4 | 16% | 37 |
| cvt.Firsty 1.0 | 3 | 12% | 27 |
| Grystrion.TrackerWO 1.0 | 3 | 12% | 20 |
| sanja.First 0.1 | 3 | 12% | 19 |
| sample.RamFire 1.0 | 3 | 12% | 4 |
| zyx.micro.Ant 1.1 | 2 | 8% | 23 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 66.7 | 80 / 210 | 4.00 | 15.2% | 30715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 15.2% | 80 |
| kc.micro.Figment 1.0 | 1.7 | 14.3% | 58 |
| cs.Wren 1.0 | 3.5 | 12.3% | 17 |
| js.PinBall 1.6 | 3.7 | 12.2% | 26 |
| mz.Cork 0.1 | 4.8 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 3 |
| evd.X1 0.01 | 6.8 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 67.0 | 14 / 35 | 4522 |
| 2 | 2 | 61.2 | 61.6 | 10 / 35 | 4883 |
| 3 | 2 | 61.6 | 63.2 | 13 / 35 | 4988 |
| 4 | 1 | 63.1 | 66.3 | 14 / 35 | 5450 |
| 5 | 1 | 63.4 | 71.1 | 12 / 35 | 5252 |
| 6 | 1 | 64.9 | 71.1 | 17 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 66% |
| cs.Wren 1.0 | 21 | 95% |
| js.PinBall 1.6 | 12 | 58% |
| mz.Cork 0.1 | 8 | 100% |
| donjezza.Jezza 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 42% | 93 |
| js.PinBall 1.6 | 16 | 12% | 28 |
| evd.X1 0.01 | 16 | 12% | 16 |
| cs.Wren 1.0 | 14 | 11% | 29 |
| joe.ADinosaur 1.0 | 12 | 9% | 13 |
| mz.Cork 0.1 | 10 | 8% | 12 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 5 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.6 | 153 / 210 | 2.21 | 19.6% | 29325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.6% | 153 |
| ntc.Opposite 1.5 | 2.5 | 11.5% | 5 |
| myl.nano.Graviton 1.10 | 3.2 | 11.2% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 3 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 10.0% | 15 |
| disan.Chair 2.2.0 | 6.8 | 8.6% | 6 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 5 |
| pbg.R2D2 1.0 | 9.7 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 26 / 35 | 4711 |
| 2 | 1 | 70.7 | 92.4 | 29 / 35 | 4995 |
| 3 | 1 | 66.1 | 77.1 | 21 / 35 | 4684 |
| 4 | 1 | 70.1 | 90.2 | 28 / 35 | 4927 |
| 5 | 1 | 70.7 | 90.5 | 26 / 35 | 5027 |
| 6 | 1 | 68.2 | 81.3 | 23 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 97% |
| stelo.AreaTargetingBot 1.1 | 35 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 100% |
| disan.Chair 2.2.0 | 18 | 83% |
| ntc.Opposite 1.5 | 18 | 94% |
| DBall.NUKE 0.1 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 12 | 92% |
| donjezza.Muncho 1.0 | 8 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 15 | 26% | 32 |
| stelo.AreaTargetingBot 1.1 | 13 | 22% | 38 |
| ntc.Opposite 1.5 | 7 | 12% | 18 |
| myl.nano.Graviton 1.10 | 6 | 10% | 42 |
| disan.Chair 2.2.0 | 6 | 10% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 9% | 28 |
| pbg.R2D2 1.0 | 3 | 5% | 7 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |
| DBall.NUKE 0.1 | 1 | 2% | 16 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.5 | 92 / 210 | 3.65 | 15.6% | 26040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 15.6% | 92 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 48 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.9% | 13 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 6 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.9 | 17 / 35 | 4215 |
| 2 | 1 | 66.2 | 74.0 | 17 / 35 | 4957 |
| 3 | 1 | 64.9 | 69.8 | 14 / 35 | 4582 |
| 4 | 1 | 63.2 | 68.6 | 17 / 35 | 4079 |
| 5 | 1 | 64.7 | 72.7 | 16 / 35 | 4272 |
| 6 | 3 | 60.6 | 63.2 | 11 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 54% |
| kawigi.micro.Shiz 1.1 | 31 | 90% |
| yagami.Tidus 0.11 | 21 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 94% |
| ejb.Polaris 1.0.1 | 7 | 71% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 48% | 79 |
| yagami.Tidus 0.11 | 11 | 9% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 29 |
| stelo.MirrorNano 1.3 | 11 | 9% | 12 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 24 |
| ejb.Polaris 1.0.1 | 10 | 8% | 23 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.0 | 129 / 210 | 2.98 | 17.3% | 27327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.3% | 129 |
| wee.Gem 1.8.4 | 2.7 | 12.6% | 32 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 22 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 4 |
| wompi.Quokka 1.6 | 4.7 | 10.9% | 12 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 9.2% | 3 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.5% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.0 | 20 / 35 | 4837 |
| 2 | 1 | 68.7 | 87.6 | 27 / 35 | 4919 |
| 3 | 1 | 66.5 | 79.7 | 20 / 35 | 4325 |
| 4 | 1 | 64.2 | 71.4 | 20 / 35 | 4331 |
| 5 | 1 | 66.3 | 78.4 | 21 / 35 | 4593 |
| 6 | 1 | 65.5 | 77.1 | 21 / 35 | 4322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 91% |
| wee.Gem 1.8.4 | 43 | 98% |
| wompi.Quokka 1.6 | 18 | 83% |
| m3thos.Eva00 1.1 | 12 | 92% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 14 | 17% | 52 |
| ratosh.Nobo 0.21 | 14 | 17% | 28 |
| wompi.Quokka 1.6 | 12 | 15% | 29 |
| maribo.FollowFire 1 | 12 | 15% | 11 |
| bayen.UbaMicro 1.4 | 10 | 12% | 17 |
| bzdp.Pansy 2.1 | 7 | 9% | 45 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 5 |
| m3thos.Eva00 1.1 | 4 | 5% | 13 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.5 | 72 / 210 | 2.58 | 19.2% | 43181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.0% | 125 |
| hadur117.micro.SaorC 0.1 | 1.8 | 19.2% | 72 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 12 |
| ayk.WallHugger 1.0 | 4.3 | 9.7% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.2% | 1 |
| stuff.Vlad 0.1 | 6.0 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.1 | 82.9 | 11 / 35 | 7500 |
| 2 | 2 | 70.5 | 82.5 | 8 / 35 | 7832 |
| 3 | 2 | 70.3 | 81.3 | 12 / 35 | 7340 |
| 4 | 2 | 68.7 | 79.4 | 15 / 35 | 5878 |
| 5 | 2 | 68.4 | 79.0 | 11 / 35 | 6547 |
| 6 | 1 | 72.5 | 89.8 | 15 / 35 | 8084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 121 | 31% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| mz.NanoGod 2.02 | 8 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 107 | 78% | 154 |
| mz.NanoGod 2.02 | 16 | 12% | 27 |
| ayk.WallHugger 1.0 | 4 | 3% | 8 |
| stelo.PianistNano 1.2 | 4 | 3% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.1 | 129 / 210 | 3.06 | 17.7% | 29992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.7% | 129 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 19 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.5% | 15 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 18 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 12 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.9 | 24 / 35 | 5213 |
| 2 | 1 | 67.3 | 78.7 | 23 / 35 | 5305 |
| 3 | 1 | 67.2 | 79.0 | 25 / 35 | 4963 |
| 4 | 1 | 64.5 | 73.0 | 15 / 35 | 4601 |
| 5 | 1 | 67.4 | 78.4 | 23 / 35 | 5130 |
| 6 | 1 | 64.1 | 70.8 | 19 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 90% |
| dummy.micro.Sparrow 2.5 | 32 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 18 | 100% |
| stelo.MirrorMicro 1.0 | 12 | 83% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 18 | 22% | 18 |
| voidious.micro.BlitzBat 1.05 | 15 | 18% | 48 |
| conscience.Electron 1.3g | 14 | 17% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 12% | 33 |
| dummy.micro.Sparrow 2.5 | 9 | 11% | 40 |
| dl.BetterWalls 1.0 | 8 | 10% | 15 |
| bvh.micro.Freya 0.3 | 6 | 7% | 14 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 21 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.6 | 159 / 210 | 2.11 | 21.3% | 42170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.3% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 17 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 8 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.6% | 10 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.0% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.5% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.6% | 0 |
| sample.Corners 1.0 | 9.2 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.7 | 30 / 35 | 7365 |
| 2 | 1 | 69.5 | 81.3 | 22 / 35 | 6590 |
| 3 | 1 | 72.3 | 88.6 | 27 / 35 | 7411 |
| 4 | 1 | 72.3 | 90.8 | 27 / 35 | 7013 |
| 5 | 1 | 70.5 | 84.1 | 25 / 35 | 6671 |
| 6 | 1 | 71.5 | 87.3 | 28 / 35 | 7120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 96% |
| sul.Lunar 1.1 | 41 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 96% |
| dsw.StaticD 1.0 | 13 | 92% |
| mme.NikeEnhanced 2.0 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 6 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 14 | 26% | 71 |
| supersample.SuperBoxBot 1.0 | 14 | 26% | 30 |
| dsw.StaticD 1.0 | 10 | 19% | 24 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 18 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 8 |
| sul.Lunar 1.1 | 2 | 4% | 40 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
| sample.Corners 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.1 | 133 / 210 | 2.61 | 19.0% | 37765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.0% | 133 |
| mld.Wisdom 1.0 | 2.5 | 12.3% | 17 |
| radnor.DoctorBob 1.42 | 3.2 | 12.3% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 19 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 4 |
| amz.NanoClone 1.41 | 5.5 | 10.2% | 10 |
| sample.Walls 1.0 | 7.0 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 21 / 35 | 6054 |
| 2 | 1 | 70.3 | 88.6 | 23 / 35 | 6409 |
| 3 | 1 | 69.9 | 86.7 | 25 / 35 | 6436 |
| 4 | 1 | 65.8 | 74.3 | 18 / 35 | 5861 |
| 5 | 1 | 70.0 | 82.5 | 25 / 35 | 6885 |
| 6 | 1 | 67.8 | 80.0 | 21 / 35 | 6120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 91% |
| radnor.DoctorBob 1.42 | 33 | 79% |
| mld.Wisdom 1.0 | 22 | 77% |
| amz.NanoClone 1.41 | 15 | 87% |
| KiraNL.Chupacabra 0.4 | 14 | 100% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 31% | 44 |
| radnor.DoctorBob 1.42 | 16 | 21% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 19% | 59 |
| KiraNL.Chupacabra 0.4 | 10 | 13% | 20 |
| amz.NanoClone 1.41 | 9 | 12% | 20 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 8 |
| jangs.ns51 1.0 | 0 | 0% | 5 |

