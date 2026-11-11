# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.4 | 144 / 210 | 2.05 | 21.4% | 43691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.4% | 144 |
| mz.AntiGrav 1.0 | 2.7 | 14.5% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 14.1% | 21 |
| mld.Infinity 2.2 | 3.3 | 13.2% | 23 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 3 |
| jangs.ns51 1.0 | 6.5 | 6.7% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.1% | 0 |
| sample.Walls 1.0 | 7.8 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.8 | 23 / 35 | 6923 |
| 2 | 1 | 72.1 | 85.1 | 25 / 35 | 7494 |
| 3 | 1 | 72.6 | 90.8 | 25 / 35 | 7014 |
| 4 | 1 | 73.5 | 91.7 | 26 / 35 | 7550 |
| 5 | 1 | 71.1 | 86.7 | 20 / 35 | 6883 |
| 6 | 1 | 73.4 | 92.1 | 25 / 35 | 7827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 94% |
| mld.Infinity 2.2 | 42 | 81% |
| radnor.DoctorBob 1.42 | 37 | 84% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 7 | 86% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 39% | 75 |
| mld.Infinity 2.2 | 18 | 27% | 17 |
| mz.AntiGrav 1.0 | 10 | 15% | 80 |
| amz.NanoClone 1.41 | 6 | 9% | 16 |
| sample.Walls 1.0 | 4 | 6% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 9 |
| arthord.MannyPacquiao Beta | 1 | 2% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.5 | 135 / 210 | 2.12 | 19.0% | 30522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.0% | 135 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.1% | 41 |
| mld.DustBunny 3.8 | 2.7 | 14.2% | 16 |
| maribo.melee.BMV 0.1 | 4.8 | 9.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 7.9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.1% | 5 |
| zyx.nano.Ant 1.1 | 6.5 | 7.7% | 2 |
| fullsail.SweetTea 1.1 | 7.2 | 6.7% | 2 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 90.2 | 20 / 35 | 4761 |
| 2 | 1 | 69.8 | 91.7 | 25 / 35 | 4857 |
| 3 | 1 | 67.9 | 83.2 | 23 / 35 | 5012 |
| 4 | 1 | 70.8 | 94.0 | 26 / 35 | 5326 |
| 5 | 1 | 69.6 | 91.1 | 24 / 35 | 5064 |
| 6 | 1 | 66.9 | 74.9 | 17 / 35 | 5502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 88 | 81% |
| mld.DustBunny 3.8 | 52 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 33% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 40% | 100 |
| mld.DustBunny 3.8 | 19 | 25% | 61 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 17% | 21 |
| zyx.nano.Ant 1.1 | 4 | 5% | 6 |
| cs.Grudge 1.0 | 4 | 5% | 4 |
| fullsail.SweetTea 1.1 | 3 | 4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 3 |
| maribo.melee.BMV 0.1 | 0 | 0% | 3 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.9 | 136 / 210 | 2.36 | 20.0% | 36183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.0% | 136 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.9% | 14 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.2% | 15 |
| fm.mammillarias 1.3 | 6.0 | 9.2% | 7 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 5.8% | 0 |
| sample.Fire 1.0 | 9.0 | 5.0% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 24 / 35 | 6119 |
| 2 | 1 | 70.1 | 85.1 | 22 / 35 | 6001 |
| 3 | 1 | 69.8 | 84.1 | 21 / 35 | 5848 |
| 4 | 1 | 69.8 | 82.2 | 20 / 35 | 6427 |
| 5 | 1 | 70.0 | 85.4 | 25 / 35 | 5791 |
| 6 | 1 | 70.5 | 86.3 | 24 / 35 | 5997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 93% |
| cb.nano.Insomnia 1.0 | 33 | 85% |
| stelo.SoRobotNanoMelee 1.2 | 25 | 80% |
| myl.nano.KomoriNinja 1.1 | 25 | 100% |
| fm.mammillarias 1.3 | 9 | 56% |
| sample.Fire 1.0 | 6 | 83% |
| sp.Nanos.Ember 1.1 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 22 | 29% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 23% | 30 |
| fm.mammillarias 1.3 | 12 | 16% | 22 |
| myl.micro.Troodon 1.10 | 9 | 12% | 68 |
| sample.Fire 1.0 | 6 | 8% | 14 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 9 |
| myl.nano.KomoriNinja 1.1 | 3 | 4% | 40 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.3 | 148 / 210 | 2.41 | 20.3% | 38840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.3% | 148 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.8% | 11 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.7% | 10 |
| stelo.SoJNanoMelee 1.1 | 3.7 | 10.1% | 21 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 13 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.0 | 7.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 80.0 | 22 / 35 | 6640 |
| 2 | 1 | 66.7 | 73.0 | 22 / 35 | 5602 |
| 3 | 1 | 71.7 | 88.9 | 28 / 35 | 6726 |
| 4 | 1 | 70.8 | 90.2 | 27 / 35 | 6229 |
| 5 | 1 | 69.2 | 82.2 | 23 / 35 | 6345 |
| 6 | 1 | 72.3 | 91.7 | 26 / 35 | 7298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 94% |
| stelo.SoJNanoMelee 1.1 | 40 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 100% |
| tj.zombie1n 1.0.1 | 16 | 69% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| yk.JahMicro 1.0 | 5 | 80% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 44% | 98 |
| stelo.SoJNanoMelee 1.1 | 12 | 19% | 38 |
| tj.zombie1n 1.0.1 | 7 | 11% | 8 |
| tvv.micro.Antares 1.1.1 | 5 | 8% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 5 |
| repositorio.NanoStep 1.0 | 3 | 5% | 8 |
| yk.JahMicro 1.0 | 3 | 5% | 4 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 20 |

## Melee bench: F05

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 67.7 | 100 / 210 | 3.91 | 16.0% | 29578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.0% | 100 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 38 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.9% | 22 |
| sam.Samspin 1.0 | 5.8 | 9.7% | 12 |
| EBBU.Sim2 1.02 | 6.0 | 10.1% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.2 | 21 / 35 | 5127 |
| 2 | 1 | 63.8 | 66.3 | 13 / 35 | 5167 |
| 3 | 1 | 63.6 | 67.3 | 19 / 35 | 4712 |
| 4 | 1 | 60.4 | 59.7 | 17 / 35 | 4234 |
| 5 | 1 | 65.3 | 73.7 | 15 / 35 | 5429 |
| 6 | 1 | 62.6 | 63.8 | 15 / 35 | 4909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 86% |
| oog.melee.Corsair 1.0 | 30 | 90% |
| ahf.NanoAndrew .4 | 20 | 95% |
| robar.nano.Assertive_Melee 0.2 | 9 | 78% |
| EBBU.Sim2 1.02 | 8 | 63% |
| sam.Samspin 1.0 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 28% | 63 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14% | 15 |
| oog.melee.Corsair 1.0 | 14 | 13% | 41 |
| zyx.nano.BacillusComma 1.0 | 14 | 13% | 19 |
| robar.nano.Assertive_Melee 0.2 | 13 | 12% | 18 |
| ahf.NanoAndrew .4 | 8 | 7% | 26 |
| sam.Samspin 1.0 | 8 | 7% | 12 |
| EBBU.Sim2 1.02 | 7 | 6% | 13 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |

## Melee bench: F06

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 138 / 210 | 2.34 | 19.0% | 31734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.0% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.3% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.4% | 11 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 5 |
| fm.claire 1.7 | 6.0 | 8.8% | 0 |
| pa.Improved 1.0 | 8.5 | 6.0% | 0 |
| sample.SpinBot 1.0 | 8.7 | 5.6% | 3 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.3 | 24 / 35 | 5725 |
| 2 | 1 | 67.1 | 81.3 | 17 / 35 | 4953 |
| 3 | 1 | 68.6 | 87.0 | 26 / 35 | 4522 |
| 4 | 1 | 69.6 | 86.3 | 23 / 35 | 5406 |
| 5 | 1 | 68.1 | 81.0 | 24 / 35 | 5357 |
| 6 | 1 | 69.8 | 88.9 | 24 / 35 | 5771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 86% |
| oog.melee.CapuletDroid 1.1 | 42 | 93% |
| gh.nano.Grofvuil 0.2 | 20 | 75% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 31% | 97 |
| gh.nano.Grofvuil 0.2 | 15 | 20% | 36 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 20 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 16 |
| fm.claire 1.7 | 6 | 8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 16 |
| kurios.DOSexe .9b | 3 | 4% | 8 |
| sample.SpinBot 1.0 | 2 | 3% | 3 |
| pa.Improved 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.0 | 106 / 210 | 2.71 | 17.7% | 31073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.7% | 106 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.6% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.0% | 35 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 13 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.0% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 3 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 2 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.9 | 19 / 35 | 5661 |
| 2 | 1 | 67.1 | 78.4 | 20 / 35 | 5165 |
| 3 | 1 | 65.5 | 73.0 | 18 / 35 | 5342 |
| 4 | 1 | 67.1 | 81.3 | 17 / 35 | 5130 |
| 5 | 1 | 66.8 | 81.9 | 15 / 35 | 4909 |
| 6 | 1 | 67.1 | 82.5 | 17 / 35 | 4866 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 66% |
| gh.micro.Gruweltje 0.7 | 51 | 69% |
| mz.MicroGodMelee 1 | 31 | 90% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 31% | 58 |
| gh.micro.Gruweltje 0.7 | 30 | 29% | 75 |
| mz.MicroGodMelee 1 | 16 | 15% | 41 |
| acogdev.alpha 0.2 | 7 | 7% | 10 |
| el.JumpShoot 0.2 | 5 | 5% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 2 |
| DBall.Anarchy 0.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.5 | 92 / 210 | 3.93 | 15.6% | 28778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.7 | 15.6% | 92 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.1% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 32 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.4% | 6 |
| awesomeness.Elite 1.0 | 5.7 | 9.1% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.9% | 4 |
| germ.TheMind .2 | 6.0 | 8.9% | 8 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 75.2 | 20 / 35 | 5086 |
| 2 | 1 | 63.4 | 67.9 | 16 / 35 | 4802 |
| 3 | 2 | 64.6 | 71.4 | 14 / 35 | 4853 |
| 4 | 1 | 65.1 | 71.7 | 18 / 35 | 5087 |
| 5 | 3 | 59.8 | 56.8 | 12 / 35 | 4441 |
| 6 | 2 | 61.1 | 61.6 | 12 / 35 | 4509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| germ.TheMind .2 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 53% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 14% | 33 |
| germ.TheMind .2 | 9 | 8% | 15 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 13 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 6 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.3 | 157 / 210 | 1.87 | 20.4% | 31231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.4% | 157 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 13 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 8 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.3 | 8.5% | 8 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 4 |
| spinnercat.Omen 1.0 | 8.5 | 7.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 22 / 35 | 5284 |
| 2 | 1 | 72.1 | 94.6 | 30 / 35 | 5161 |
| 3 | 1 | 70.6 | 87.9 | 25 / 35 | 5329 |
| 4 | 1 | 72.5 | 96.2 | 31 / 35 | 5443 |
| 5 | 1 | 70.8 | 88.6 | 24 / 35 | 5474 |
| 6 | 1 | 68.6 | 84.4 | 25 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 93% |
| nz.jdc.nano.GridFu 1.0 | 44 | 91% |
| timmit.nano.TimDog 0.33 | 18 | 89% |
| ratosh.Wesco 1.4 | 9 | 78% |
| stelo.PatternRobot 1.0 | 8 | 63% |
| maribo.IotaCT 1.1 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 23% | 78 |
| stelo.PatternRobot 1.0 | 12 | 23% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 52 |
| timmit.nano.TimDog 0.33 | 7 | 13% | 24 |
| ratosh.Wesco 1.4 | 6 | 11% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 9% | 8 |
| maribo.IotaCT 1.1 | 2 | 4% | 10 |
| spinnercat.Omen 1.0 | 2 | 4% | 2 |

## Melee bench: F10

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.9 | 175 / 210 | 1.55 | 21.8% | 39568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.8% | 175 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 5 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.7% | 12 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 8 |
| sanja.First 0.1 | 5.8 | 8.4% | 2 |
| cvt.Firsty 1.0 | 7.3 | 7.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.5 | 27 / 35 | 6326 |
| 2 | 1 | 72.6 | 94.0 | 31 / 35 | 6967 |
| 3 | 1 | 73.0 | 98.4 | 33 / 35 | 6545 |
| 4 | 1 | 71.4 | 93.0 | 26 / 35 | 6476 |
| 5 | 1 | 70.7 | 90.8 | 26 / 35 | 6222 |
| 6 | 1 | 73.1 | 97.5 | 32 / 35 | 7032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 89% |
| baal.nano.N 1.42 | 38 | 97% |
| cvt.Firsty 1.0 | 29 | 97% |
| sanja.First 0.1 | 28 | 100% |
| zyx.micro.Ant 1.1 | 22 | 91% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 28% | 36 |
| tvv.nano.Polaris 1.2 | 7 | 19% | 54 |
| Grystrion.TrackerWO 1.0 | 6 | 17% | 19 |
| baal.nano.N 1.42 | 5 | 14% | 40 |
| cvt.Firsty 1.0 | 4 | 11% | 22 |
| sanja.First 0.1 | 1 | 3% | 24 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 64.4 | 63 / 210 | 4.20 | 14.4% | 28976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 85 |
| hadur117.micro.SaorOG5 0.1 | 1.8 | 14.4% | 63 |
| cs.Wren 1.0 | 2.7 | 13.2% | 24 |
| js.PinBall 1.6 | 4.2 | 11.5% | 16 |
| mz.Cork 0.1 | 4.8 | 11.2% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 8.7% | 4 |
| evd.X1 0.01 | 6.7 | 8.0% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 69.2 | 13 / 35 | 5212 |
| 2 | 1 | 61.6 | 62.9 | 11 / 35 | 4954 |
| 3 | 2 | 61.0 | 65.1 | 10 / 35 | 4578 |
| 4 | 2 | 61.4 | 64.1 | 7 / 35 | 4952 |
| 5 | 3 | 56.7 | 51.4 | 9 / 35 | 4447 |
| 6 | 2 | 63.6 | 73.7 | 13 / 35 | 4833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 37% |
| cs.Wren 1.0 | 21 | 90% |
| mz.Cork 0.1 | 8 | 88% |
| js.PinBall 1.6 | 7 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 79 | 53% | 106 |
| evd.X1 0.01 | 18 | 12% | 19 |
| cs.Wren 1.0 | 12 | 8% | 25 |
| mz.Cork 0.1 | 10 | 7% | 19 |
| joe.ADinosaur 1.0 | 10 | 7% | 11 |
| js.PinBall 1.6 | 7 | 5% | 13 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.0 | 113 / 210 | 2.98 | 17.5% | 27006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.5% | 113 |
| myl.nano.Graviton 1.10 | 2.7 | 12.2% | 26 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.8% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.4% | 4 |
| ntc.Opposite 1.5 | 4.5 | 10.7% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.3% | 5 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 8 |
| disan.Chair 2.2.0 | 7.5 | 8.5% | 9 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.1 | 24 / 35 | 4647 |
| 2 | 1 | 64.5 | 74.6 | 16 / 35 | 4035 |
| 3 | 1 | 65.2 | 74.9 | 17 / 35 | 4635 |
| 4 | 1 | 68.2 | 87.9 | 20 / 35 | 4476 |
| 5 | 1 | 67.3 | 81.0 | 21 / 35 | 4510 |
| 6 | 1 | 64.8 | 71.7 | 15 / 35 | 4703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 91% |
| stelo.AreaTargetingBot 1.1 | 33 | 55% |
| ntc.Opposite 1.5 | 17 | 82% |
| DBall.NUKE 0.1 | 16 | 94% |
| donjezza.Muncho 1.0 | 15 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| disan.Chair 2.2.0 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 34 | 34% | 51 |
| ntc.Opposite 1.5 | 16 | 16% | 25 |
| myl.nano.Graviton 1.10 | 14 | 14% | 43 |
| pfvicm.Sobieski 7.2.3b | 12 | 12% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 27 |
| DBall.NUKE 0.1 | 7 | 7% | 17 |
| disan.Chair 2.2.0 | 4 | 4% | 12 |
| pbg.R2D2 1.0 | 3 | 3% | 6 |
| donjezza.Muncho 1.0 | 2 | 2% | 13 |

## Melee bench: F13

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.5 | 83 / 210 | 4.02 | 14.6% | 23522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.8 | 14.6% | 83 |
| oog.melee.Capulet 1.2 | 1.8 | 14.9% | 51 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 24 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 4 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 65.1 | 13 / 35 | 3653 |
| 2 | 2 | 63.1 | 68.3 | 12 / 35 | 4285 |
| 3 | 1 | 64.4 | 69.5 | 17 / 35 | 4206 |
| 4 | 2 | 60.8 | 62.9 | 12 / 35 | 3534 |
| 5 | 1 | 64.9 | 71.7 | 16 / 35 | 4221 |
| 6 | 3 | 60.6 | 61.3 | 13 / 35 | 3623 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 76% |
| kawigi.micro.Shiz 1.1 | 23 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 100% |
| yagami.Tidus 0.11 | 14 | 86% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| kurios.DOSexe .9a | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 39% | 74 |
| kawigi.micro.Shiz 1.1 | 20 | 16% | 33 |
| yagami.Tidus 0.11 | 13 | 10% | 25 |
| ejb.Polaris 1.0.1 | 13 | 10% | 24 |
| kurios.DOSexe .9a | 12 | 9% | 12 |
| step.nanoPri 1.0 | 7 | 6% | 7 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 5% | 28 |

## Melee bench: F14

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.6 | 131 / 210 | 2.93 | 17.2% | 25147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.2% | 131 |
| bzdp.Pansy 2.1 | 2.5 | 12.4% | 23 |
| ratosh.Nobo 0.21 | 2.7 | 11.8% | 11 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 14 |
| wee.Gem 1.8.4 | 4.7 | 11.0% | 14 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.2% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.6 | 26 / 35 | 3959 |
| 2 | 1 | 63.8 | 72.4 | 20 / 35 | 3973 |
| 3 | 1 | 65.0 | 76.2 | 21 / 35 | 4340 |
| 4 | 1 | 68.4 | 87.3 | 26 / 35 | 4614 |
| 5 | 1 | 62.9 | 68.6 | 15 / 35 | 4042 |
| 6 | 1 | 66.1 | 79.4 | 23 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 91% |
| wee.Gem 1.8.4 | 25 | 96% |
| ratosh.Nobo 0.21 | 23 | 87% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 15 | 87% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 19% | 63 |
| wompi.Quokka 1.6 | 12 | 15% | 25 |
| maribo.FollowFire 1 | 11 | 14% | 12 |
| wee.Gem 1.8.4 | 9 | 11% | 31 |
| ratosh.Nobo 0.21 | 9 | 11% | 26 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 9 |
| m3thos.Eva00 1.1 | 7 | 9% | 22 |
| bayen.UbaMicro 1.4 | 7 | 9% | 16 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.4 | 65 / 210 | 2.31 | 20.4% | 48359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.5 | 20.4% | 65 |
| wompi.Wallaby 5.1 | 1.5 | 20.3% | 133 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 8 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.1% | 2 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 84.4 | 12 / 35 | 7379 |
| 2 | 2 | 71.5 | 84.1 | 10 / 35 | 8019 |
| 3 | 1 | 73.7 | 89.5 | 14 / 35 | 8960 |
| 4 | 2 | 69.3 | 81.0 | 8 / 35 | 6534 |
| 5 | 1 | 73.2 | 88.6 | 11 / 35 | 9179 |
| 6 | 2 | 71.5 | 84.8 | 10 / 35 | 8288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 134 | 27% |
| mz.NanoGod 2.02 | 15 | 87% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 81% | 161 |
| mz.NanoGod 2.02 | 10 | 7% | 24 |
| ayk.WallHugger 1.0 | 7 | 5% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 7 |
| stelo.PianistNano 1.2 | 4 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.6 | 99 / 210 | 3.91 | 15.5% | 27081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 15.5% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 29 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.3% | 25 |
| bvh.micro.Freya 0.3 | 4.3 | 11.4% | 14 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 3 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 12 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.5 | 58.7 | 13 / 35 | 4246 |
| 2 | 1 | 62.8 | 65.4 | 18 / 35 | 4440 |
| 3 | 1 | 65.3 | 74.6 | 20 / 35 | 4772 |
| 4 | 1 | 62.5 | 66.0 | 16 / 35 | 4243 |
| 5 | 1 | 64.7 | 73.3 | 16 / 35 | 4720 |
| 6 | 1 | 63.2 | 67.6 | 16 / 35 | 4660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 74% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| dummy.micro.Sparrow 2.5 | 23 | 96% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 24 | 22% | 26 |
| voidious.micro.BlitzBat 1.05 | 23 | 21% | 58 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 18% | 41 |
| conscience.Electron 1.3g | 12 | 11% | 15 |
| dl.BetterWalls 1.0 | 10 | 9% | 12 |
| dummy.micro.Sparrow 2.5 | 9 | 8% | 32 |
| bvh.micro.Freya 0.3 | 9 | 8% | 16 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 83.0 | 147 / 210 | 2.53 | 20.5% | 40616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.5% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 20 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.3% | 14 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 8.0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.9% | 5 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 4 |
| sample.Corners 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.5 | 23 / 35 | 6960 |
| 2 | 1 | 72.9 | 91.1 | 28 / 35 | 7388 |
| 3 | 1 | 71.8 | 85.7 | 25 / 35 | 6801 |
| 4 | 1 | 68.3 | 76.2 | 24 / 35 | 6028 |
| 5 | 1 | 69.9 | 80.3 | 24 / 35 | 6872 |
| 6 | 1 | 69.6 | 82.2 | 23 / 35 | 6567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 98% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 22 | 95% |
| dsw.StaticD 1.0 | 11 | 82% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 78% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 26% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 22% | 69 |
| dsw.StaticD 1.0 | 8 | 12% | 20 |
| sul.Lunar 1.1 | 6 | 9% | 40 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 8% | 13 |
| tlp.ThreeLeggedPig 1 | 5 | 8% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 13 |
| sample.Corners 1.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.7 | 118 / 210 | 2.74 | 18.8% | 38500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.8% | 118 |
| mld.Wisdom 1.0 | 2.5 | 12.7% | 24 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.0% | 16 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.2% | 10 |
| amz.NanoClone 1.41 | 5.7 | 9.8% | 8 |
| sample.Walls 1.0 | 7.0 | 7.8% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.1 | 15 / 35 | 5565 |
| 2 | 1 | 69.2 | 83.5 | 21 / 35 | 6655 |
| 3 | 1 | 68.6 | 84.8 | 20 / 35 | 5959 |
| 4 | 1 | 68.2 | 77.8 | 18 / 35 | 7063 |
| 5 | 1 | 70.2 | 84.1 | 22 / 35 | 7021 |
| 6 | 1 | 68.9 | 82.9 | 22 / 35 | 6237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 79% |
| mld.Wisdom 1.0 | 28 | 75% |
| amz.NanoClone 1.41 | 12 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 27% | 59 |
| mld.Wisdom 1.0 | 23 | 25% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 21% | 58 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 19 |
| amz.NanoClone 1.41 | 5 | 5% | 11 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 1 | 1% | 5 |

