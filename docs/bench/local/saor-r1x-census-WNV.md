# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.2 | 132 / 210 | 2.51 | 19.9% | 41218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 19.9% | 132 |
| radnor.DoctorBob 1.42 | 2.3 | 14.9% | 25 |
| mld.Infinity 2.2 | 3.2 | 13.7% | 29 |
| mz.AntiGrav 1.0 | 3.5 | 13.5% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 3 |
| sample.Walls 1.0 | 6.3 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.5 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 77.1 | 20 / 35 | 6920 |
| 2 | 1 | 71.9 | 89.2 | 23 / 35 | 7268 |
| 3 | 1 | 70.5 | 82.2 | 21 / 35 | 7171 |
| 4 | 1 | 71.1 | 87.0 | 26 / 35 | 6738 |
| 5 | 1 | 67.6 | 76.2 | 18 / 35 | 5879 |
| 6 | 1 | 72.1 | 87.6 | 24 / 35 | 7242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 46 | 87% |
| mz.AntiGrav 1.0 | 46 | 91% |
| mld.Infinity 2.2 | 34 | 91% |
| sample.Walls 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 5 | 60% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 41% | 78 |
| mz.AntiGrav 1.0 | 13 | 16% | 51 |
| mld.Infinity 2.2 | 12 | 15% | 44 |
| amz.NanoClone 1.41 | 12 | 15% | 15 |
| jangs.ns51 1.0 | 7 | 9% | 8 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.3 | 122 / 210 | 2.23 | 18.4% | 31051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 18.4% | 122 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 51 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 4 |
| zyx.nano.Ant 1.1 | 5.5 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.1% | 9 |
| bzdp.BoxCar 2.0 | 8.3 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 5.8% | 2 |
| cs.Grudge 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.2 | 23 / 35 | 5768 |
| 2 | 1 | 66.4 | 79.0 | 20 / 35 | 5042 |
| 3 | 1 | 68.7 | 88.9 | 22 / 35 | 5158 |
| 4 | 1 | 67.5 | 87.0 | 19 / 35 | 5010 |
| 5 | 1 | 68.7 | 89.2 | 23 / 35 | 5038 |
| 6 | 1 | 66.5 | 83.8 | 15 / 35 | 5035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 66 | 86% |
| oog.melee.Mercutio 1.0 | 47 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 71% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 70 |
| mld.DustBunny 3.8 | 24 | 27% | 71 |
| maribo.melee.BMV 0.1 | 12 | 14% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 13% | 23 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 14 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
| fullsail.SweetTea 1.1 | 0 | 0% | 4 |

## Melee bench: F03

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.7 | 133 / 210 | 2.47 | 19.9% | 38520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 19.9% | 133 |
| myl.micro.Troodon 1.10 | 2.5 | 13.6% | 31 |
| myl.nano.KomoriNinja 1.1 | 2.7 | 12.7% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 20 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 2 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.1% | 9 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.9 | 23 / 35 | 6411 |
| 2 | 1 | 70.4 | 86.3 | 25 / 35 | 6132 |
| 3 | 1 | 67.3 | 74.3 | 17 / 35 | 6173 |
| 4 | 1 | 69.8 | 83.8 | 21 / 35 | 6660 |
| 5 | 1 | 70.4 | 85.7 | 23 / 35 | 6461 |
| 6 | 1 | 71.5 | 89.8 | 24 / 35 | 6683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 92% |
| myl.nano.KomoriNinja 1.1 | 27 | 93% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 22% | 44 |
| myl.micro.Troodon 1.10 | 16 | 21% | 58 |
| fm.mammillarias 1.3 | 13 | 17% | 20 |
| cb.nano.Insomnia 1.0 | 13 | 17% | 16 |
| myl.nano.KomoriNinja 1.1 | 12 | 16% | 47 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 7 |
| sample.Fire 1.0 | 2 | 3% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 14 |

## Melee bench: F04

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.5 | 145 / 210 | 2.21 | 20.4% | 39827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 20.4% | 145 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.2% | 17 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.6% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 14 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.7% | 4 |
| yk.JahMicro 1.0 | 6.7 | 8.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 74.0 | 20 / 35 | 5921 |
| 2 | 1 | 71.7 | 91.7 | 27 / 35 | 6945 |
| 3 | 1 | 69.5 | 82.2 | 24 / 35 | 6691 |
| 4 | 1 | 71.8 | 91.4 | 24 / 35 | 7455 |
| 5 | 1 | 70.7 | 92.4 | 26 / 35 | 5902 |
| 6 | 1 | 70.4 | 87.3 | 24 / 35 | 6913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 91% |
| stelo.SoJNanoMelee 1.1 | 44 | 82% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| yk.JahMicro 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 32% | 78 |
| stelo.SoJNanoMelee 1.1 | 15 | 23% | 41 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 15% | 11 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 27 |
| tj.zombie1n 1.0.1 | 6 | 9% | 9 |
| yk.JahMicro 1.0 | 3 | 5% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 19 |
| repositorio.NanoStep 1.0 | 2 | 3% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.2 | 77 / 210 | 3.68 | 15.7% | 29874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 15.7% | 77 |
| oog.melee.Corsair 1.0 | 2.0 | 12.8% | 34 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 35 |
| sam.Samspin 1.0 | 4.5 | 10.9% | 23 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 7 |
| simonton.nano.MeleeSeed 1.8 | 6.0 | 9.8% | 19 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.5 | 14 / 35 | 4867 |
| 2 | 1 | 63.4 | 70.8 | 14 / 35 | 4902 |
| 3 | 1 | 62.4 | 67.9 | 11 / 35 | 4893 |
| 4 | 1 | 66.3 | 76.8 | 16 / 35 | 5632 |
| 5 | 1 | 61.9 | 66.7 | 13 / 35 | 4605 |
| 6 | 1 | 62.1 | 68.6 | 9 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 64% |
| simonton.nano.MeleeSeed 1.8 | 26 | 85% |
| ahf.NanoAndrew .4 | 21 | 67% |
| sam.Samspin 1.0 | 14 | 57% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |

Hadur died in 133 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 24 | 18% | 42 |
| oog.melee.Corsair 1.0 | 20 | 15% | 42 |
| robar.nano.Assertive_Melee 0.2 | 19 | 14% | 22 |
| EBBU.Sim2 1.02 | 16 | 12% | 19 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 34 |
| sam.Samspin 1.0 | 14 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.1 | 115 / 210 | 2.70 | 17.9% | 30773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 17.9% | 115 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 42 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.9% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 9 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 3 |
| fm.claire 1.7 | 6.8 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.2 | 8.1% | 7 |
| pa.Improved 1.0 | 9.2 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.8 | 21 / 35 | 5465 |
| 2 | 1 | 66.2 | 79.0 | 20 / 35 | 5009 |
| 3 | 1 | 68.9 | 85.1 | 21 / 35 | 5747 |
| 4 | 1 | 66.3 | 80.6 | 16 / 35 | 4963 |
| 5 | 1 | 63.8 | 70.8 | 16 / 35 | 4880 |
| 6 | 1 | 67.7 | 86.3 | 21 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 81% |
| oog.melee.CapuletDroid 1.1 | 25 | 92% |
| gh.nano.Grofvuil 0.2 | 9 | 78% |
| sample.SpinBot 1.0 | 8 | 100% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 38% | 95 |
| gh.nano.Grofvuil 0.2 | 15 | 16% | 24 |
| arthord.NanoSatanMelee Beta | 11 | 12% | 13 |
| oog.melee.CapuletDroid 1.1 | 8 | 8% | 30 |
| fm.claire 1.7 | 8 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 7 | 7% | 14 |
| kurios.DOSexe .9b | 5 | 5% | 15 |
| sample.SpinBot 1.0 | 4 | 4% | 6 |
| pa.Improved 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.1 | 83 / 210 | 3.06 | 17.1% | 33891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.2 | 17.1% | 83 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.9% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.7% | 36 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 33 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 0 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.8% | 6 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 16 / 35 | 6182 |
| 2 | 2 | 64.8 | 74.3 | 11 / 35 | 5281 |
| 3 | 1 | 67.1 | 80.6 | 13 / 35 | 5780 |
| 4 | 1 | 65.9 | 77.8 | 16 / 35 | 5132 |
| 5 | 1 | 63.6 | 68.6 | 13 / 35 | 5654 |
| 6 | 1 | 66.2 | 75.9 | 14 / 35 | 5862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 46 | 70% |
| spinnercat.micro.Tyger 0.1 | 34 | 79% |
| gh.micro.Gruweltje 0.7 | 30 | 50% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 42 | 33% | 73 |
| gh.micro.Gruweltje 0.7 | 32 | 25% | 49 |
| spinnercat.micro.Tyger 0.1 | 29 | 23% | 48 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 9 |
| acogdev.alpha 0.2 | 4 | 3% | 7 |
| fire219.CatBot 1.0 | 4 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 2% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 9 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.6 | 108 / 210 | 3.38 | 16.8% | 32525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.2 | 16.8% | 108 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 16.0% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 27 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.1% | 4 |
| germ.TheMind .2 | 5.5 | 9.0% | 9 |
| awesomeness.Elite 1.0 | 6.2 | 8.7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 0 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.2 | 7.4% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.2 | 21 / 35 | 5476 |
| 2 | 1 | 64.2 | 71.7 | 18 / 35 | 5076 |
| 3 | 1 | 64.8 | 72.7 | 16 / 35 | 5193 |
| 4 | 1 | 65.5 | 70.8 | 17 / 35 | 6051 |
| 5 | 2 | 65.5 | 74.9 | 19 / 35 | 4973 |
| 6 | 1 | 66.9 | 76.2 | 17 / 35 | 5756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| germ.TheMind .2 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 40% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 31 |
| germ.TheMind .2 | 14 | 13% | 21 |
| stelo.UntouchableNano 1.3 | 12 | 12% | 18 |
| lrem.micro.MoggFanatic 0.2 | 10 | 10% | 15 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 10 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 85.4 | 139 / 210 | 2.31 | 19.3% | 31188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 19.3% | 139 |
| rz.HawkOnFire 0.1 | 2.2 | 13.8% | 25 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 14 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 11 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 3 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 6 |
| ratosh.Wesco 1.4 | 8.0 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 7.6% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.7 | 28 / 35 | 5253 |
| 2 | 1 | 67.7 | 77.5 | 20 / 35 | 5459 |
| 3 | 1 | 70.9 | 92.4 | 22 / 35 | 5247 |
| 4 | 1 | 67.7 | 79.0 | 21 / 35 | 5057 |
| 5 | 1 | 68.1 | 80.6 | 22 / 35 | 5023 |
| 6 | 1 | 70.7 | 89.2 | 26 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 33 | 94% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 14 | 86% |
| maribo.IotaCT 1.1 | 9 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 21% | 65 |
| stelo.PatternRobot 1.0 | 13 | 18% | 20 |
| nz.jdc.nano.GridFu 1.0 | 10 | 14% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 14% | 15 |
| timmit.nano.TimDog 0.33 | 9 | 13% | 23 |
| ratosh.Wesco 1.4 | 7 | 10% | 14 |
| maribo.IotaCT 1.1 | 6 | 8% | 18 |
| spinnercat.Omen 1.0 | 1 | 1% | 8 |

## Melee bench: F10

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.4 | 155 / 210 | 2.04 | 20.5% | 38802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 20.5% | 155 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.2% | 20 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 8 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.3% | 16 |
| sanja.First 0.1 | 5.8 | 8.6% | 0 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.9% | 2 |
| cvt.Firsty 1.0 | 8.5 | 7.3% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.5 | 26 / 35 | 6206 |
| 2 | 1 | 71.4 | 92.7 | 28 / 35 | 6559 |
| 3 | 1 | 69.8 | 87.6 | 21 / 35 | 6676 |
| 4 | 1 | 70.0 | 89.2 | 26 / 35 | 6269 |
| 5 | 1 | 70.1 | 87.3 | 28 / 35 | 6244 |
| 6 | 1 | 71.2 | 90.2 | 26 / 35 | 6848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 37 | 95% |
| tvv.nano.Polaris 1.2 | 33 | 85% |
| cvt.Firsty 1.0 | 31 | 94% |
| amk.Punbot.Punbot 0.01 | 22 | 91% |
| sanja.First 0.1 | 14 | 100% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 27% | 37 |
| tvv.nano.Polaris 1.2 | 10 | 18% | 52 |
| baal.nano.N 1.42 | 8 | 15% | 45 |
| Grystrion.TrackerWO 1.0 | 6 | 11% | 16 |
| amk.Punbot.Punbot 0.01 | 6 | 11% | 11 |
| cvt.Firsty 1.0 | 5 | 9% | 25 |
| sanja.First 0.1 | 2 | 4% | 14 |
| sample.RamFire 1.0 | 2 | 4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 63.0 | 63 / 210 | 4.33 | 14.2% | 29829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.5% | 84 |
| hadur117.micro.SaorWNV 0.1 | 2.2 | 14.2% | 63 |
| cs.Wren 1.0 | 2.7 | 13.0% | 24 |
| js.PinBall 1.6 | 4.5 | 11.2% | 10 |
| mz.Cork 0.1 | 4.7 | 11.4% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 4 |
| evd.X1 0.01 | 6.7 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 70.8 | 13 / 35 | 5376 |
| 2 | 1 | 64.6 | 73.0 | 14 / 35 | 5261 |
| 3 | 2 | 57.7 | 54.3 | 10 / 35 | 4533 |
| 4 | 3 | 61.7 | 63.8 | 10 / 35 | 5058 |
| 5 | 2 | 58.8 | 58.1 | 8 / 35 | 4752 |
| 6 | 3 | 59.4 | 58.1 | 8 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 60% |
| cs.Wren 1.0 | 23 | 78% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 67 | 46% | 99 |
| cs.Wren 1.0 | 25 | 17% | 37 |
| evd.X1 0.01 | 16 | 11% | 17 |
| joe.ADinosaur 1.0 | 14 | 10% | 14 |
| mz.Cork 0.1 | 10 | 7% | 16 |
| js.PinBall 1.6 | 8 | 5% | 17 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.9 | 115 / 210 | 2.99 | 17.4% | 28280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 17.4% | 115 |
| myl.nano.Graviton 1.10 | 2.7 | 12.2% | 33 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 12.0% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 6 |
| ntc.Opposite 1.5 | 4.7 | 10.3% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.6% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 4 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.2 | 19 / 35 | 4988 |
| 2 | 1 | 64.2 | 75.9 | 18 / 35 | 4129 |
| 3 | 1 | 63.9 | 71.7 | 17 / 35 | 4590 |
| 4 | 1 | 64.6 | 72.1 | 18 / 35 | 4859 |
| 5 | 1 | 68.5 | 85.7 | 24 / 35 | 5046 |
| 6 | 1 | 66.6 | 79.0 | 19 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 79% |
| myl.nano.Graviton 1.10 | 36 | 89% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| donjezza.Muncho 1.0 | 12 | 92% |
| ntc.Opposite 1.5 | 11 | 82% |
| disan.Chair 2.2.0 | 8 | 100% |
| DBall.NUKE 0.1 | 7 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 32 | 33% | 46 |
| stelo.AreaTargetingBot 1.1 | 17 | 17% | 43 |
| ntc.Opposite 1.5 | 16 | 16% | 25 |
| myl.nano.Graviton 1.10 | 14 | 14% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 12 |
| disan.Chair 2.2.0 | 4 | 4% | 15 |
| DBall.NUKE 0.1 | 4 | 4% | 10 |
| donjezza.Muncho 1.0 | 3 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.6 | 72 / 210 | 3.74 | 15.2% | 27724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.3 | 15.2% | 72 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 44 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 27 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 63.8 | 10 / 35 | 4389 |
| 2 | 1 | 63.9 | 69.5 | 12 / 35 | 4763 |
| 3 | 1 | 63.7 | 70.2 | 10 / 35 | 4836 |
| 4 | 1 | 61.2 | 63.5 | 9 / 35 | 4304 |
| 5 | 1 | 66.3 | 76.5 | 17 / 35 | 4675 |
| 6 | 1 | 64.7 | 74.0 | 14 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| yagami.Tidus 0.11 | 19 | 95% |
| kawigi.micro.Shiz 1.1 | 17 | 88% |
| ejb.Polaris 1.0.1 | 9 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 35% | 64 |
| yagami.Tidus 0.11 | 29 | 21% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 31 |
| ejb.Polaris 1.0.1 | 14 | 10% | 28 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 22 |
| stelo.MirrorNano 1.3 | 10 | 7% | 10 |
| kurios.DOSexe .9a | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 134 / 210 | 2.74 | 17.7% | 28482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 17.7% | 134 |
| bzdp.Pansy 2.1 | 2.7 | 12.5% | 20 |
| wompi.Quokka 1.6 | 3.7 | 11.5% | 12 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 22 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 9.0% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.4% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.1 | 23 / 35 | 4394 |
| 2 | 1 | 67.5 | 84.1 | 22 / 35 | 4801 |
| 3 | 1 | 67.0 | 81.0 | 24 / 35 | 4921 |
| 4 | 1 | 67.1 | 83.2 | 22 / 35 | 4707 |
| 5 | 1 | 65.9 | 78.1 | 20 / 35 | 4906 |
| 6 | 1 | 66.7 | 79.7 | 23 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 89% |
| wee.Gem 1.8.4 | 33 | 100% |
| ratosh.Nobo 0.21 | 20 | 95% |
| wompi.Quokka 1.6 | 17 | 82% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 25% | 65 |
| ratosh.Nobo 0.21 | 12 | 16% | 31 |
| maribo.FollowFire 1 | 10 | 13% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 14 |
| bayen.UbaMicro 1.4 | 8 | 11% | 16 |
| wompi.Quokka 1.6 | 7 | 9% | 17 |
| wee.Gem 1.8.4 | 4 | 5% | 39 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 6 |
| m3thos.Eva00 1.1 | 3 | 4% | 12 |

## Melee bench: F15

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 80.0 | 111 / 210 | 2.80 | 19.0% | 42028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 18.3% | 62 |
| hadur117.micro.SaorWNV 0.1 | 1.5 | 19.0% | 111 |
| mz.NanoGod 2.02 | 3.0 | 15.0% | 28 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.0% | 5 |
| ayk.WallHugger 1.0 | 4.7 | 10.0% | 2 |
| stuff.Vlad 0.1 | 5.8 | 9.1% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.6 | 80.0 | 15 / 35 | 7072 |
| 2 | 2 | 67.8 | 73.3 | 16 / 35 | 6434 |
| 3 | 2 | 68.8 | 77.8 | 19 / 35 | 6754 |
| 4 | 1 | 70.1 | 80.6 | 18 / 35 | 7041 |
| 5 | 1 | 72.0 | 85.4 | 21 / 35 | 7767 |
| 6 | 1 | 70.8 | 82.9 | 22 / 35 | 6960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 99 | 85% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| ayk.WallHugger 1.0 | 7 | 86% |
| mz.NanoGod 2.02 | 6 | 83% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 38% | 125 |
| mz.NanoGod 2.02 | 37 | 37% | 42 |
| exauge.GateKeeper 1.1.121g | 8 | 8% | 14 |
| ayk.WallHugger 1.0 | 8 | 8% | 14 |
| stuff.Vlad 0.1 | 6 | 6% | 9 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 66.9 | 93 / 210 | 3.98 | 15.4% | 28769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 15.4% | 93 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 33 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.6% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 2 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 14 |
| dl.BetterWalls 1.0 | 8.5 | 7.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 61.9 | 14 / 35 | 4711 |
| 2 | 1 | 64.3 | 71.1 | 21 / 35 | 4638 |
| 3 | 1 | 63.3 | 67.6 | 13 / 35 | 5189 |
| 4 | 1 | 63.5 | 69.8 | 16 / 35 | 4683 |
| 5 | 1 | 62.3 | 63.8 | 16 / 35 | 4903 |
| 6 | 1 | 61.8 | 67.0 | 13 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 80% |
| dummy.micro.Sparrow 2.5 | 27 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 100% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 23% | 53 |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 18% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 18% | 23 |
| conscience.Electron 1.3g | 15 | 13% | 17 |
| dummy.micro.Sparrow 2.5 | 10 | 9% | 29 |
| bvh.micro.Freya 0.3 | 9 | 8% | 17 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 18 |
| dl.BetterWalls 1.0 | 6 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.8 | 156 / 210 | 2.10 | 21.3% | 43313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 21.3% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 11 |
| sul.Lunar 1.1 | 3.0 | 11.6% | 11 |
| supersample.SuperBoxBot 1.0 | 4.7 | 9.8% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 8 |
| dsw.StaticD 1.0 | 5.5 | 8.4% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.8% | 1 |
| sample.Corners 1.0 | 9.3 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.2 | 25 / 35 | 6895 |
| 2 | 1 | 72.2 | 89.8 | 28 / 35 | 7579 |
| 3 | 1 | 72.6 | 87.9 | 27 / 35 | 7811 |
| 4 | 1 | 71.0 | 86.7 | 25 / 35 | 7278 |
| 5 | 1 | 72.1 | 90.2 | 28 / 35 | 7339 |
| 6 | 1 | 69.4 | 83.2 | 23 / 35 | 6411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 96% |
| supersample.SuperBoxBot 1.0 | 23 | 87% |
| sample.MyFirstRobot 1.0 | 12 | 92% |
| dsw.StaticD 1.0 | 9 | 56% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 29% | 28 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 16% | 55 |
| dsw.StaticD 1.0 | 8 | 15% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 11% | 15 |
| sul.Lunar 1.1 | 5 | 9% | 61 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 15 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 8 |
| sample.Corners 1.0 | 1 | 2% | 6 |

## Melee bench: F18

hadur117.micro.SaorWNV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 69.7 | 89 / 210 | 3.72 | 16.2% | 34858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNV 0.1 | 1.0 | 16.2% | 89 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 26 |
| mld.Wisdom 1.0 | 2.7 | 13.2% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.5% | 26 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.8% | 18 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 12 |
| sample.Walls 1.0 | 7.3 | 8.0% | 7 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 68.3 | 16 / 35 | 5339 |
| 2 | 1 | 63.3 | 66.3 | 10 / 35 | 5974 |
| 3 | 1 | 64.5 | 70.8 | 16 / 35 | 5893 |
| 4 | 1 | 62.7 | 65.7 | 13 / 35 | 5412 |
| 5 | 1 | 67.3 | 75.9 | 19 / 35 | 6365 |
| 6 | 1 | 65.0 | 71.4 | 15 / 35 | 5875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 91% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| mld.Wisdom 1.0 | 18 | 50% |
| jangs.ns51 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 44 | 36% | 52 |
| radnor.DoctorBob 1.42 | 23 | 19% | 54 |
| KiraNL.Chupacabra 0.4 | 18 | 15% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 13% | 49 |
| amz.NanoClone 1.41 | 9 | 7% | 11 |
| sample.Walls 1.0 | 6 | 5% | 12 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 6 |

