# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.7 | 146 / 210 | 2.11 | 21.2% | 42457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.2% | 146 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 14 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 23 |
| mld.Infinity 2.2 | 3.7 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 3 |
| GarmBox.Oranges 1.0 | 6.5 | 6.4% | 1 |
| sample.Walls 1.0 | 6.5 | 6.6% | 1 |
| jangs.ns51 1.0 | 8.3 | 5.3% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.3 | 21 / 35 | 7329 |
| 2 | 1 | 71.3 | 84.4 | 23 / 35 | 7074 |
| 3 | 1 | 71.9 | 87.0 | 26 / 35 | 6561 |
| 4 | 1 | 72.4 | 87.9 | 27 / 35 | 6913 |
| 5 | 1 | 73.2 | 91.4 | 27 / 35 | 7428 |
| 6 | 1 | 71.8 | 87.0 | 22 / 35 | 7152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 94% |
| mld.Infinity 2.2 | 47 | 85% |
| radnor.DoctorBob 1.42 | 35 | 83% |
| amz.NanoClone 1.41 | 11 | 91% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 34% | 67 |
| mz.AntiGrav 1.0 | 16 | 25% | 77 |
| mld.Infinity 2.2 | 13 | 20% | 23 |
| GarmBox.Oranges 1.0 | 5 | 8% | 7 |
| amz.NanoClone 1.41 | 3 | 5% | 12 |
| arthord.MannyPacquiao Beta | 3 | 5% | 6 |
| sample.Walls 1.0 | 1 | 2% | 9 |
| jangs.ns51 1.0 | 1 | 2% | 5 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.9 | 141 / 210 | 2.36 | 18.5% | 28368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.5% | 141 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.7% | 37 |
| mld.DustBunny 3.8 | 3.0 | 13.8% | 18 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.7% | 4 |
| zyx.nano.Ant 1.1 | 6.5 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.6% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 0 |
| cs.Grudge 1.0 | 8.8 | 5.3% | 0 |
| fullsail.SweetTea 1.1 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 23 / 35 | 5012 |
| 2 | 1 | 69.0 | 88.9 | 24 / 35 | 4783 |
| 3 | 1 | 69.3 | 88.6 | 25 / 35 | 4863 |
| 4 | 1 | 67.9 | 85.4 | 22 / 35 | 4648 |
| 5 | 1 | 64.0 | 68.6 | 19 / 35 | 4494 |
| 6 | 1 | 69.3 | 90.5 | 28 / 35 | 4568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 88 | 84% |
| mld.DustBunny 3.8 | 52 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 25 | 35% | 100 |
| mld.DustBunny 3.8 | 19 | 27% | 58 |
| maribo.melee.BMV 0.1 | 8 | 11% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 12 |
| fullsail.SweetTea 1.1 | 4 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 8 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |
| zyx.nano.Ant 1.1 | 3 | 4% | 4 |
| cs.Grudge 1.0 | 2 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 80.8 | 127 / 210 | 2.72 | 19.2% | 35036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.2% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.3% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.8% | 20 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.2% | 11 |
| cs.sheldor.Talon 1.1 | 6.0 | 8.6% | 1 |
| fm.mammillarias 1.3 | 6.2 | 8.9% | 4 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 2 |
| sample.Fire 1.0 | 9.2 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.9 | 20 / 35 | 6020 |
| 2 | 1 | 66.6 | 74.6 | 16 / 35 | 5600 |
| 3 | 1 | 68.9 | 80.0 | 24 / 35 | 5707 |
| 4 | 1 | 70.3 | 86.7 | 24 / 35 | 5842 |
| 5 | 1 | 69.2 | 79.7 | 21 / 35 | 6232 |
| 6 | 1 | 68.1 | 76.2 | 22 / 35 | 5635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 84% |
| cb.nano.Insomnia 1.0 | 32 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 65% |
| myl.nano.KomoriNinja 1.1 | 18 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sp.Nanos.Ember 1.1 | 4 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 25 | 30% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 27% | 33 |
| myl.micro.Troodon 1.10 | 17 | 20% | 75 |
| fm.mammillarias 1.3 | 7 | 8% | 14 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 30 |
| sample.Fire 1.0 | 3 | 4% | 8 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 15 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.4 | 145 / 210 | 2.14 | 20.5% | 38196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.5% | 145 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.4% | 14 |
| tj.zombie1n 1.0.1 | 5.0 | 8.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.7% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.4 | 24 / 35 | 5892 |
| 2 | 1 | 72.6 | 95.6 | 31 / 35 | 6514 |
| 3 | 1 | 68.3 | 79.4 | 22 / 35 | 6080 |
| 4 | 1 | 69.8 | 83.5 | 23 / 35 | 6469 |
| 5 | 1 | 70.6 | 87.0 | 21 / 35 | 6927 |
| 6 | 1 | 71.4 | 94.3 | 24 / 35 | 6314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 76 | 91% |
| stelo.SoJNanoMelee 1.1 | 33 | 73% |
| tvv.micro.Antares 1.1.1 | 18 | 83% |
| tj.zombie1n 1.0.1 | 14 | 79% |
| yk.JahMicro 1.0 | 13 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 26% | 94 |
| tj.zombie1n 1.0.1 | 15 | 23% | 20 |
| stelo.SoJNanoMelee 1.1 | 11 | 17% | 31 |
| yk.JahMicro 1.0 | 8 | 12% | 15 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| repositorio.NanoStep 1.0 | 1 | 2% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 67.7 | 108 / 210 | 3.91 | 16.0% | 29034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.0% | 108 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 27 |
| ahf.NanoAndrew .4 | 3.5 | 11.6% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.7% | 17 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 9 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.6% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 68.3 | 18 / 35 | 4609 |
| 2 | 1 | 65.0 | 71.1 | 19 / 35 | 4955 |
| 3 | 1 | 64.6 | 69.5 | 19 / 35 | 4864 |
| 4 | 1 | 63.1 | 63.2 | 17 / 35 | 4845 |
| 5 | 1 | 64.0 | 68.3 | 16 / 35 | 5012 |
| 6 | 1 | 63.3 | 65.7 | 19 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 89% |
| simonton.nano.MeleeSeed 1.8 | 31 | 90% |
| ahf.NanoAndrew .4 | 24 | 75% |
| sam.Samspin 1.0 | 13 | 92% |
| EBBU.Sim2 1.02 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 336. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 21 | 20% | 26 |
| simonton.nano.MeleeSeed 1.8 | 20 | 19% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 13% | 12 |
| ahf.NanoAndrew .4 | 10 | 10% | 30 |
| zyx.nano.BacillusComma 1.0 | 10 | 10% | 12 |
| sam.Samspin 1.0 | 9 | 9% | 15 |
| oog.melee.Corsair 1.0 | 8 | 8% | 40 |
| EBBU.Sim2 1.02 | 8 | 8% | 19 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.7 | 151 / 210 | 2.20 | 19.4% | 31193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.4% | 151 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 17 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.7% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.4% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.5% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.1% | 3 |
| fm.claire 1.7 | 6.3 | 8.3% | 2 |
| pa.Improved 1.0 | 8.5 | 6.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 22 / 35 | 5302 |
| 2 | 1 | 66.7 | 79.4 | 23 / 35 | 4517 |
| 3 | 1 | 69.8 | 90.8 | 26 / 35 | 5078 |
| 4 | 1 | 69.9 | 89.2 | 26 / 35 | 5589 |
| 5 | 1 | 68.2 | 81.9 | 24 / 35 | 5136 |
| 6 | 1 | 71.6 | 94.0 | 30 / 35 | 5571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 93% |
| oog.melee.CapuletDroid 1.1 | 44 | 84% |
| gh.nano.Grofvuil 0.2 | 22 | 91% |
| arthord.NanoSatanMelee Beta | 17 | 94% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 16 | 27% | 29 |
| d414.nano.Quantum 1.0.0 | 11 | 18% | 85 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 32 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 14 |
| fm.claire 1.7 | 5 | 8% | 11 |
| sample.SpinBot 1.0 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 1 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.3 | 119 / 210 | 2.86 | 17.8% | 31163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 17.8% | 119 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 34 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 29 |
| mz.MicroGodMelee 1 | 3.7 | 13.9% | 15 |
| DBall.Anarchy 0.1 | 5.7 | 8.4% | 8 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.1% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.2 | 5.7% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.1 | 23 / 35 | 5804 |
| 2 | 1 | 68.3 | 83.2 | 22 / 35 | 5311 |
| 3 | 1 | 66.9 | 78.4 | 16 / 35 | 5317 |
| 4 | 3 | 63.5 | 67.0 | 15 / 35 | 4687 |
| 5 | 1 | 67.3 | 79.4 | 20 / 35 | 5138 |
| 6 | 1 | 68.3 | 82.9 | 23 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 54 | 94% |
| spinnercat.micro.Tyger 0.1 | 49 | 71% |
| gh.micro.Gruweltje 0.7 | 30 | 77% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 25 | 27% | 56 |
| mz.MicroGodMelee 1 | 21 | 23% | 64 |
| gh.micro.Gruweltje 0.7 | 21 | 23% | 55 |
| fire219.CatBot 1.0 | 9 | 10% | 9 |
| DBall.Anarchy 0.1 | 6 | 7% | 10 |
| el.JumpShoot 0.2 | 4 | 4% | 5 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.2 | 97 / 210 | 3.95 | 15.4% | 27627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.8% | 49 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 15.4% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 9.1% | 4 |
| germ.TheMind .2 | 5.7 | 9.2% | 8 |
| awesomeness.Elite 1.0 | 6.2 | 8.8% | 7 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.7% | 4 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.2 | 19 / 35 | 4769 |
| 2 | 2 | 61.2 | 62.9 | 15 / 35 | 4101 |
| 3 | 2 | 64.9 | 71.1 | 17 / 35 | 5050 |
| 4 | 2 | 62.3 | 64.1 | 16 / 35 | 4531 |
| 5 | 1 | 64.6 | 69.8 | 18 / 35 | 4839 |
| 6 | 2 | 59.6 | 59.4 | 12 / 35 | 4337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| lrem.micro.MoggFanatic 0.2 | 9 | 89% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| germ.TheMind .2 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 44% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 18% | 35 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 13 |
| germ.TheMind .2 | 10 | 9% | 14 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 9 |
| sample.Crazy 1.0 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 5 | 4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.3 | 160 / 210 | 1.96 | 20.4% | 32041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.4% | 160 |
| rz.HawkOnFire 0.1 | 2.3 | 13.4% | 10 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 14 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 7 |
| ratosh.Wesco 1.4 | 5.7 | 9.2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.2% | 2 |
| timmit.nano.TimDog 0.33 | 6.8 | 8.7% | 1 |
| stelo.PatternRobot 1.0 | 7.5 | 7.8% | 9 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.7 | 29 / 35 | 5729 |
| 2 | 1 | 70.6 | 88.9 | 27 / 35 | 5437 |
| 3 | 1 | 69.5 | 83.8 | 23 / 35 | 5420 |
| 4 | 1 | 70.2 | 88.3 | 28 / 35 | 4977 |
| 5 | 1 | 71.6 | 91.7 | 28 / 35 | 5265 |
| 6 | 1 | 70.3 | 90.5 | 25 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 77 | 99% |
| nz.jdc.nano.GridFu 1.0 | 40 | 95% |
| ratosh.Wesco 1.4 | 12 | 83% |
| maribo.IotaCT 1.1 | 12 | 92% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| timmit.nano.TimDog 0.33 | 7 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 12 | 24% | 19 |
| ratosh.Wesco 1.4 | 11 | 22% | 31 |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% | 57 |
| rz.HawkOnFire 0.1 | 7 | 14% | 60 |
| timmit.nano.TimDog 0.33 | 7 | 14% | 13 |
| maribo.IotaCT 1.1 | 2 | 4% | 19 |
| rrh.Iwillfindyou 2.0 | 2 | 4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.9 | 173 / 210 | 1.73 | 21.7% | 39864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.7% | 173 |
| baal.nano.N 1.42 | 2.3 | 12.5% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.1% | 12 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.3% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 8.9% | 6 |
| sanja.First 0.1 | 5.8 | 8.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 7 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.1% | 1 |
| sample.RamFire 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 96.8 | 31 / 35 | 7199 |
| 2 | 1 | 71.4 | 90.2 | 29 / 35 | 6385 |
| 3 | 1 | 71.8 | 91.4 | 29 / 35 | 6747 |
| 4 | 1 | 71.2 | 91.1 | 29 / 35 | 6259 |
| 5 | 1 | 71.6 | 90.2 | 26 / 35 | 6670 |
| 6 | 1 | 71.5 | 91.4 | 29 / 35 | 6604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 53 | 100% |
| tvv.nano.Polaris 1.2 | 34 | 94% |
| sanja.First 0.1 | 22 | 100% |
| cvt.Firsty 1.0 | 22 | 100% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| Grystrion.TrackerWO 1.0 | 15 | 87% |
| amk.Punbot.Punbot 0.01 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 26% | 35 |
| tvv.nano.Polaris 1.2 | 9 | 24% | 56 |
| baal.nano.N 1.42 | 6 | 16% | 39 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 14 |
| cvt.Firsty 1.0 | 3 | 8% | 22 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 8 |
| sanja.First 0.1 | 2 | 5% | 25 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 63.4 | 65 / 210 | 4.29 | 14.2% | 28117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.0% | 86 |
| hadur117.micro.SaorOG4 0.1 | 2.0 | 14.2% | 65 |
| cs.Wren 1.0 | 3.0 | 13.0% | 18 |
| js.PinBall 1.6 | 4.5 | 11.5% | 14 |
| mz.Cork 0.1 | 4.5 | 11.4% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 8.8% | 2 |
| evd.X1 0.01 | 7.0 | 7.7% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 67.9 | 10 / 35 | 4833 |
| 2 | 2 | 61.7 | 63.2 | 12 / 35 | 4896 |
| 3 | 2 | 60.0 | 64.1 | 8 / 35 | 4115 |
| 4 | 2 | 59.6 | 58.1 | 10 / 35 | 4860 |
| 5 | 2 | 62.4 | 66.0 | 11 / 35 | 4808 |
| 6 | 2 | 61.1 | 61.3 | 14 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 46% |
| cs.Wren 1.0 | 12 | 100% |
| js.PinBall 1.6 | 7 | 57% |
| mz.Cork 0.1 | 7 | 100% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 81 | 55% | 115 |
| cs.Wren 1.0 | 17 | 12% | 22 |
| evd.X1 0.01 | 14 | 10% | 17 |
| js.PinBall 1.6 | 11 | 8% | 16 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| mz.Cork 0.1 | 6 | 4% | 11 |
| joe.ADinosaur 1.0 | 6 | 4% | 10 |
| jsal.Jsalbot 1.0 | 2 | 1% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.8 | 128 / 210 | 2.46 | 18.7% | 28141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.7% | 128 |
| myl.nano.Graviton 1.10 | 3.2 | 11.1% | 18 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.0% | 30 |
| ntc.Opposite 1.5 | 3.7 | 11.1% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 7 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 4 |
| disan.Chair 2.2.0 | 8.0 | 8.0% | 3 |
| donjezza.Muncho 1.0 | 8.7 | 6.7% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.7 | 18 / 35 | 4231 |
| 2 | 1 | 67.7 | 81.3 | 19 / 35 | 4997 |
| 3 | 1 | 68.2 | 84.1 | 22 / 35 | 4869 |
| 4 | 1 | 68.1 | 81.0 | 22 / 35 | 4981 |
| 5 | 1 | 68.9 | 89.8 | 24 / 35 | 4514 |
| 6 | 1 | 68.6 | 87.6 | 23 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 91% |
| stelo.AreaTargetingBot 1.1 | 33 | 70% |
| ntc.Opposite 1.5 | 20 | 85% |
| donjezza.Muncho 1.0 | 16 | 81% |
| disan.Chair 2.2.0 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| DBall.NUKE 0.1 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 21 | 26% | 39 |
| myl.nano.Graviton 1.10 | 14 | 17% | 45 |
| ntc.Opposite 1.5 | 11 | 13% | 25 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 21 |
| DBall.NUKE 0.1 | 7 | 9% | 17 |
| donjezza.Muncho 1.0 | 6 | 7% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 7% | 20 |
| pbg.R2D2 1.0 | 5 | 6% | 11 |
| disan.Chair 2.2.0 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.1 | 97 / 210 | 3.78 | 14.7% | 21659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 15.2% | 45 |
| oog.melee.Capulet 1.2 | 2.0 | 14.8% | 40 |
| hadur117.micro.SaorOG4 0.1 | 2.5 | 14.7% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 12 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 12 |
| ejb.Polaris 1.0.1 | 6.0 | 10.7% | 4 |
| stelo.MirrorNano 1.3 | 7.2 | 7.1% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 68.9 | 17 / 35 | 3400 |
| 2 | 1 | 65.7 | 76.5 | 18 / 35 | 3946 |
| 3 | 4 | 59.4 | 59.4 | 12 / 35 | 3403 |
| 4 | 3 | 62.9 | 67.9 | 16 / 35 | 3559 |
| 5 | 3 | 63.1 | 70.8 | 15 / 35 | 3368 |
| 6 | 1 | 64.5 | 71.1 | 19 / 35 | 3983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 35 | 80% |
| oog.melee.Capulet 1.2 | 33 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 96% |
| yagami.Tidus 0.11 | 9 | 78% |
| ejb.Polaris 1.0.1 | 8 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 40% | 70 |
| kawigi.micro.Shiz 1.1 | 21 | 19% | 45 |
| yagami.Tidus 0.11 | 20 | 18% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 8% | 37 |
| kurios.DOSexe .9a | 8 | 7% | 8 |
| ejb.Polaris 1.0.1 | 4 | 4% | 13 |
| stelo.MirrorNano 1.3 | 4 | 4% | 6 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 149 / 210 | 2.74 | 17.8% | 26261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.8% | 149 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 13 |
| wompi.Quokka 1.6 | 3.3 | 11.4% | 11 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 19 |
| ratosh.Nobo 0.21 | 4.2 | 11.3% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.2 | 21 / 35 | 4419 |
| 2 | 1 | 64.0 | 73.7 | 22 / 35 | 3853 |
| 3 | 1 | 67.4 | 84.1 | 27 / 35 | 4390 |
| 4 | 1 | 69.4 | 87.9 | 28 / 35 | 5040 |
| 5 | 1 | 67.5 | 82.5 | 26 / 35 | 4253 |
| 6 | 1 | 66.7 | 80.6 | 25 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 65 | 95% |
| wee.Gem 1.8.4 | 34 | 97% |
| ratosh.Nobo 0.21 | 21 | 100% |
| wompi.Quokka 1.6 | 16 | 94% |
| m3thos.Eva00 1.1 | 13 | 85% |
| stelo.MyAgileRobot 0.2 | 7 | 86% |
| bayen.UbaMicro 1.4 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 337. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 10 | 16% | 53 |
| maribo.FollowFire 1 | 10 | 16% | 12 |
| stelo.MyAgileRobot 0.2 | 9 | 15% | 11 |
| m3thos.Eva00 1.1 | 8 | 13% | 21 |
| wee.Gem 1.8.4 | 6 | 10% | 47 |
| wompi.Quokka 1.6 | 6 | 10% | 20 |
| bayen.UbaMicro 1.4 | 6 | 10% | 13 |
| ratosh.Nobo 0.21 | 4 | 6% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 85.0 | 63 / 210 | 2.35 | 20.5% | 49072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 20.5% | 63 |
| wompi.Wallaby 5.1 | 1.7 | 20.3% | 135 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 8 |
| stuff.Vlad 0.1 | 4.8 | 9.1% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 1 |
| ayk.WallHugger 1.0 | 5.5 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 4.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.7 | 85.4 | 9 / 35 | 8125 |
| 2 | 1 | 72.7 | 86.7 | 9 / 35 | 8887 |
| 3 | 2 | 70.6 | 80.3 | 6 / 35 | 7216 |
| 4 | 1 | 72.6 | 86.0 | 13 / 35 | 8381 |
| 5 | 1 | 72.8 | 86.3 | 12 / 35 | 8285 |
| 6 | 1 | 72.5 | 85.1 | 14 / 35 | 8178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 132 | 23% |
| mz.NanoGod 2.02 | 23 | 91% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ayk.WallHugger 1.0 | 3 | 100% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 150 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 121 | 81% | 158 |
| mz.NanoGod 2.02 | 14 | 9% | 33 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 6 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| ayk.WallHugger 1.0 | 3 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.2 | 106 / 210 | 3.59 | 16.1% | 26829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 16.1% | 106 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 13.8% | 31 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.7% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.1% | 15 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 6.1% | 2 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 76.2 | 20 / 35 | 4358 |
| 2 | 1 | 64.7 | 69.8 | 18 / 35 | 4835 |
| 3 | 2 | 60.0 | 59.0 | 10 / 35 | 4182 |
| 4 | 1 | 60.4 | 59.0 | 15 / 35 | 4155 |
| 5 | 1 | 66.2 | 79.0 | 19 / 35 | 4733 |
| 6 | 1 | 68.0 | 84.1 | 24 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 67% |
| dummy.micro.Sparrow 2.5 | 26 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 96% |
| bvh.micro.Freya 0.3 | 19 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 29% | 62 |
| conscience.Electron 1.3g | 17 | 16% | 20 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 39 |
| bvh.micro.Freya 0.3 | 10 | 10% | 20 |
| dl.BetterWalls 1.0 | 9 | 9% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 12 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 87.5 | 160 / 210 | 2.13 | 21.6% | 42700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.6% | 160 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.1% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.6% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.2% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.4% | 4 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 3 |
| sample.Corners 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 86.7 | 27 / 35 | 6823 |
| 2 | 1 | 73.4 | 93.7 | 29 / 35 | 7313 |
| 3 | 1 | 73.1 | 90.2 | 28 / 35 | 7791 |
| 4 | 1 | 70.7 | 83.2 | 24 / 35 | 7036 |
| 5 | 1 | 70.6 | 85.1 | 25 / 35 | 6581 |
| 6 | 1 | 72.1 | 86.0 | 27 / 35 | 7156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 69 | 97% |
| sul.Lunar 1.1 | 34 | 97% |
| supersample.SuperBoxBot 1.0 | 23 | 87% |
| dsw.StaticD 1.0 | 14 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 14 | 27% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 16% | 68 |
| dsw.StaticD 1.0 | 8 | 16% | 21 |
| sul.Lunar 1.1 | 6 | 12% | 44 |
| mme.NikeEnhanced 2.0 | 6 | 12% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 10% | 14 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 4 |
| sample.Corners 1.0 | 1 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.5 | 100 / 210 | 2.94 | 18.2% | 38437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.2% | 100 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 11.9% | 31 |
| mld.Wisdom 1.0 | 3.7 | 11.9% | 15 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.6% | 12 |
| amz.NanoClone 1.41 | 6.0 | 9.5% | 5 |
| GarmBox.Oranges 1.0 | 7.3 | 7.5% | 3 |
| sample.Walls 1.0 | 8.0 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.4 | 13 / 35 | 6392 |
| 2 | 1 | 69.4 | 86.3 | 21 / 35 | 6355 |
| 3 | 1 | 67.1 | 77.5 | 14 / 35 | 6341 |
| 4 | 1 | 67.4 | 76.5 | 17 / 35 | 6161 |
| 5 | 1 | 69.3 | 81.6 | 21 / 35 | 7015 |
| 6 | 1 | 66.6 | 76.5 | 14 / 35 | 6173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 76% |
| radnor.DoctorBob 1.42 | 35 | 60% |
| mld.Wisdom 1.0 | 27 | 81% |
| amz.NanoClone 1.41 | 11 | 82% |
| KiraNL.Chupacabra 0.4 | 10 | 70% |
| GarmBox.Oranges 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 3 | 33% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 29% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 21% | 57 |
| mld.Wisdom 1.0 | 23 | 21% | 46 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 19 |
| amz.NanoClone 1.41 | 6 | 5% | 12 |
| GarmBox.Oranges 1.0 | 5 | 5% | 8 |
| jangs.ns51 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

