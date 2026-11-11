# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.6 | 145 / 210 | 2.11 | 21.2% | 43034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.2% | 145 |
| mz.AntiGrav 1.0 | 2.8 | 13.9% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 22 |
| mld.Infinity 2.2 | 3.3 | 13.4% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 6.5% | 0 |
| sample.Walls 1.0 | 7.0 | 6.3% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 92.4 | 28 / 35 | 6955 |
| 2 | 1 | 72.7 | 89.8 | 28 / 35 | 7340 |
| 3 | 1 | 74.0 | 94.9 | 29 / 35 | 7425 |
| 4 | 1 | 71.2 | 85.7 | 24 / 35 | 6740 |
| 5 | 1 | 71.5 | 84.8 | 20 / 35 | 7624 |
| 6 | 1 | 69.2 | 78.1 | 16 / 35 | 6950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 97% |
| mld.Infinity 2.2 | 43 | 79% |
| radnor.DoctorBob 1.42 | 36 | 81% |
| amz.NanoClone 1.41 | 10 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 41% | 70 |
| mld.Infinity 2.2 | 15 | 23% | 21 |
| mz.AntiGrav 1.0 | 12 | 18% | 86 |
| amz.NanoClone 1.41 | 9 | 14% | 17 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.4 | 141 / 210 | 2.13 | 18.9% | 29997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.9% | 141 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.3% | 44 |
| mld.DustBunny 3.8 | 3.2 | 12.7% | 12 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 2 |
| zyx.nano.Ant 1.1 | 6.0 | 8.2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.6% | 2 |
| fullsail.SweetTea 1.1 | 7.3 | 7.4% | 1 |
| bzdp.BoxCar 2.0 | 8.5 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 20 / 35 | 4671 |
| 2 | 1 | 69.0 | 87.6 | 23 / 35 | 5027 |
| 3 | 1 | 68.2 | 87.9 | 21 / 35 | 4922 |
| 4 | 1 | 69.3 | 90.2 | 26 / 35 | 5329 |
| 5 | 1 | 69.1 | 87.9 | 25 / 35 | 5168 |
| 6 | 1 | 68.8 | 87.9 | 26 / 35 | 4880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 96 | 86% |
| mld.DustBunny 3.8 | 42 | 93% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 30% | 103 |
| mld.DustBunny 3.8 | 16 | 23% | 56 |
| zyx.nano.Ant 1.1 | 9 | 13% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 12% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6 | 9% | 10 |
| maribo.melee.BMV 0.1 | 5 | 7% | 9 |
| fullsail.SweetTea 1.1 | 3 | 4% | 10 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 80.8 | 123 / 210 | 2.73 | 19.2% | 36069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.2% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.6% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.0% | 19 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 8 |
| fm.mammillarias 1.3 | 6.2 | 9.0% | 6 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.6% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.3% | 5 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |
| sample.Fire 1.0 | 9.5 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 74.3 | 18 / 35 | 6132 |
| 2 | 1 | 68.8 | 83.2 | 19 / 35 | 5822 |
| 3 | 1 | 68.7 | 77.1 | 20 / 35 | 6106 |
| 4 | 1 | 69.7 | 84.4 | 19 / 35 | 5915 |
| 5 | 1 | 69.8 | 84.1 | 23 / 35 | 6262 |
| 6 | 1 | 69.1 | 81.6 | 24 / 35 | 5832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 83% |
| myl.nano.KomoriNinja 1.1 | 21 | 100% |
| cb.nano.Insomnia 1.0 | 18 | 78% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 8 | 88% |
| sample.Fire 1.0 | 4 | 50% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 27 | 31% | 21 |
| myl.micro.Troodon 1.10 | 17 | 20% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 13% | 29 |
| fm.mammillarias 1.3 | 9 | 10% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 35 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 13 |
| sample.Fire 1.0 | 4 | 5% | 7 |
| sample.Tracker 1.0 | 4 | 5% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 17 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.3 | 143 / 210 | 2.23 | 20.3% | 37624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.3% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 12 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.6% | 20 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.2% | 4 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.0 | 21 / 35 | 6272 |
| 2 | 1 | 71.2 | 89.5 | 28 / 35 | 6365 |
| 3 | 1 | 68.1 | 80.0 | 20 / 35 | 5921 |
| 4 | 1 | 70.7 | 87.6 | 29 / 35 | 6522 |
| 5 | 1 | 70.2 | 87.0 | 22 / 35 | 6279 |
| 6 | 1 | 70.1 | 86.7 | 23 / 35 | 6265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 91% |
| stelo.SoJNanoMelee 1.1 | 40 | 73% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 14 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| yk.JahMicro 1.0 | 7 | 57% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 20 | 29% | 44 |
| kawigi.nano.Lib 1.0 | 19 | 28% | 90 |
| tj.zombie1n 1.0.1 | 8 | 12% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 12% | 9 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 21 |
| yk.JahMicro 1.0 | 5 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 18 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 62.1 | 94 / 210 | 4.41 | 14.9% | 27699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 14.9% | 94 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 23 |
| ahf.NanoAndrew .4 | 2.7 | 12.1% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.8% | 25 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 17 |
| EBBU.Sim2 1.02 | 6.2 | 9.8% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.0% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 64.1 | 15 / 35 | 4767 |
| 2 | 1 | 63.3 | 64.8 | 18 / 35 | 4822 |
| 3 | 1 | 60.6 | 59.4 | 15 / 35 | 4342 |
| 4 | 1 | 62.7 | 63.5 | 14 / 35 | 4982 |
| 5 | 1 | 59.9 | 56.2 | 17 / 35 | 4266 |
| 6 | 1 | 62.1 | 64.4 | 15 / 35 | 4520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 97% |
| ahf.NanoAndrew .4 | 22 | 86% |
| simonton.nano.MeleeSeed 1.8 | 21 | 76% |
| EBBU.Sim2 1.02 | 12 | 83% |
| robar.nano.Assertive_Melee 0.2 | 8 | 88% |
| sam.Samspin 1.0 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 299. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 27% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 20 | 17% | 19 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 21 |
| EBBU.Sim2 1.02 | 12 | 10% | 25 |
| ahf.NanoAndrew .4 | 10 | 9% | 31 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 11 |
| oog.melee.Corsair 1.0 | 8 | 7% | 43 |
| sam.Samspin 1.0 | 7 | 6% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.0 | 134 / 210 | 2.71 | 18.4% | 31371 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.4% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.2% | 7 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.0% | 6 |
| fm.claire 1.7 | 6.0 | 8.3% | 2 |
| pa.Improved 1.0 | 8.3 | 6.4% | 3 |
| sample.SpinBot 1.0 | 8.5 | 6.5% | 4 |
| kurios.DOSexe .9b | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.0 | 24 / 35 | 4949 |
| 2 | 1 | 68.7 | 83.8 | 24 / 35 | 5292 |
| 3 | 1 | 67.6 | 80.0 | 23 / 35 | 5200 |
| 4 | 1 | 67.8 | 79.4 | 21 / 35 | 5458 |
| 5 | 1 | 69.4 | 88.9 | 24 / 35 | 5375 |
| 6 | 1 | 65.5 | 74.6 | 18 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 91% |
| oog.melee.CapuletDroid 1.1 | 35 | 94% |
| gh.nano.Grofvuil 0.2 | 21 | 86% |
| arthord.NanoSatanMelee Beta | 8 | 75% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 28% | 94 |
| gh.nano.Grofvuil 0.2 | 14 | 18% | 37 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 17 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 13 |
| fm.claire 1.7 | 6 | 8% | 13 |
| pa.Improved 1.0 | 5 | 7% | 8 |
| kurios.DOSexe .9b | 5 | 7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 15 |
| sample.SpinBot 1.0 | 3 | 4% | 7 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.7 | 105 / 210 | 2.65 | 17.9% | 31719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.9% | 105 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.3% | 36 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.6% | 40 |
| mz.MicroGodMelee 1 | 4.0 | 12.9% | 13 |
| caimano.Furia_Ceca 0.22 | 5.5 | 7.9% | 4 |
| DBall.Anarchy 0.1 | 5.7 | 8.0% | 8 |
| el.JumpShoot 0.2 | 7.2 | 6.5% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.7% | 2 |
| acogdev.alpha 0.2 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.9 | 16 / 35 | 5465 |
| 2 | 1 | 70.5 | 89.8 | 21 / 35 | 6014 |
| 3 | 1 | 68.1 | 86.0 | 18 / 35 | 5170 |
| 4 | 1 | 68.3 | 88.6 | 21 / 35 | 4870 |
| 5 | 1 | 66.1 | 76.5 | 18 / 35 | 5042 |
| 6 | 1 | 65.2 | 73.3 | 11 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 54% |
| mz.MicroGodMelee 1 | 43 | 79% |
| gh.micro.Gruweltje 0.7 | 42 | 81% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 37 | 35% | 58 |
| gh.micro.Gruweltje 0.7 | 25 | 24% | 65 |
| mz.MicroGodMelee 1 | 24 | 23% | 58 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 12 |
| DBall.Anarchy 0.1 | 4 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 67.8 | 95 / 210 | 3.90 | 15.5% | 28298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.9% | 56 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 15.5% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 7 |
| germ.TheMind .2 | 5.3 | 9.4% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 5 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 3 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 71.7 | 17 / 35 | 4442 |
| 2 | 1 | 66.1 | 74.9 | 18 / 35 | 5351 |
| 3 | 1 | 61.8 | 61.6 | 14 / 35 | 4810 |
| 4 | 2 | 65.9 | 75.2 | 17 / 35 | 4855 |
| 5 | 1 | 65.0 | 73.7 | 19 / 35 | 4683 |
| 6 | 3 | 56.3 | 49.5 | 10 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| germ.TheMind .2 | 6 | 83% |
| sample.Crazy 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 53% | 109 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 35 |
| lrem.micro.MoggFanatic 0.2 | 10 | 9% | 12 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 14 |
| germ.TheMind .2 | 6 | 5% | 17 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 7 |
| awesomeness.Elite 1.0 | 4 | 3% | 5 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.4 | 165 / 210 | 1.78 | 20.7% | 31429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.7% | 165 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 10 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.9% | 16 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 3 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.5% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 7.6% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.0% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.0% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.9 | 26 / 35 | 4735 |
| 2 | 1 | 71.2 | 90.2 | 27 / 35 | 5451 |
| 3 | 1 | 71.7 | 92.4 | 27 / 35 | 5449 |
| 4 | 1 | 71.7 | 93.0 | 29 / 35 | 5193 |
| 5 | 1 | 71.1 | 90.8 | 27 / 35 | 5794 |
| 6 | 1 | 71.4 | 94.0 | 29 / 35 | 4807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 91 | 95% |
| nz.jdc.nano.GridFu 1.0 | 50 | 86% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| maribo.IotaCT 1.1 | 11 | 100% |
| ratosh.Wesco 1.4 | 8 | 100% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 13 | 29% | 71 |
| rz.HawkOnFire 0.1 | 9 | 20% | 69 |
| timmit.nano.TimDog 0.33 | 8 | 18% | 19 |
| maribo.IotaCT 1.1 | 4 | 9% | 16 |
| stelo.PatternRobot 1.0 | 4 | 9% | 9 |
| spinnercat.Omen 1.0 | 4 | 9% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 4 |
| ratosh.Wesco 1.4 | 1 | 2% | 15 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.1 | 169 / 210 | 1.71 | 21.5% | 39465 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.5% | 169 |
| baal.nano.N 1.42 | 2.2 | 12.4% | 8 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.5% | 9 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 9 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 1 |
| cvt.Firsty 1.0 | 6.3 | 8.5% | 12 |
| sanja.First 0.1 | 6.8 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 26 / 35 | 7093 |
| 2 | 1 | 71.4 | 89.8 | 28 / 35 | 6438 |
| 3 | 1 | 71.3 | 92.7 | 28 / 35 | 6350 |
| 4 | 1 | 70.9 | 91.1 | 25 / 35 | 6426 |
| 5 | 1 | 72.3 | 92.4 | 29 / 35 | 6837 |
| 6 | 1 | 72.2 | 94.9 | 33 / 35 | 6321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 48 | 98% |
| cvt.Firsty 1.0 | 32 | 91% |
| tvv.nano.Polaris 1.2 | 29 | 90% |
| sanja.First 0.1 | 25 | 92% |
| zyx.micro.Ant 1.1 | 19 | 95% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 26% | 40 |
| tvv.nano.Polaris 1.2 | 10 | 24% | 51 |
| cvt.Firsty 1.0 | 7 | 17% | 31 |
| baal.nano.N 1.42 | 4 | 10% | 34 |
| sanja.First 0.1 | 3 | 7% | 25 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 5 |
| sample.RamFire 1.0 | 2 | 5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 11 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.7 | 75 / 210 | 3.63 | 15.5% | 29750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.5 | 15.5% | 75 |
| kc.micro.Figment 1.0 | 1.5 | 16.1% | 85 |
| cs.Wren 1.0 | 3.3 | 12.3% | 13 |
| js.PinBall 1.6 | 4.2 | 11.2% | 14 |
| mz.Cork 0.1 | 4.5 | 10.9% | 7 |
| joe.ADinosaur 1.0 | 6.2 | 8.7% | 3 |
| evd.X1 0.01 | 6.8 | 8.0% | 7 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.6 | 12 / 35 | 5109 |
| 2 | 2 | 62.7 | 68.3 | 11 / 35 | 4963 |
| 3 | 2 | 61.8 | 65.7 | 10 / 35 | 4894 |
| 4 | 1 | 63.9 | 74.3 | 16 / 35 | 4566 |
| 5 | 2 | 63.4 | 71.1 | 12 / 35 | 4816 |
| 6 | 1 | 65.8 | 76.5 | 14 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 80 | 46% |
| cs.Wren 1.0 | 19 | 84% |
| js.PinBall 1.6 | 8 | 75% |
| mz.Cork 0.1 | 7 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 75 | 56% | 109 |
| cs.Wren 1.0 | 14 | 10% | 30 |
| js.PinBall 1.6 | 11 | 8% | 19 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| joe.ADinosaur 1.0 | 8 | 6% | 9 |
| evd.X1 0.01 | 7 | 5% | 8 |
| mz.Cork 0.1 | 6 | 4% | 16 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.5 | 122 / 210 | 2.49 | 18.5% | 27912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.5% | 122 |
| myl.nano.Graviton 1.10 | 2.5 | 12.8% | 35 |
| ntc.Opposite 1.5 | 3.2 | 12.1% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.8% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.1% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.4% | 3 |
| disan.Chair 2.2.0 | 7.5 | 7.7% | 4 |
| DBall.NUKE 0.1 | 7.5 | 7.5% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.2 | 18 / 35 | 4028 |
| 2 | 1 | 68.9 | 87.6 | 23 / 35 | 4539 |
| 3 | 1 | 67.9 | 84.8 | 19 / 35 | 4830 |
| 4 | 1 | 66.6 | 80.3 | 16 / 35 | 4528 |
| 5 | 1 | 69.3 | 84.8 | 24 / 35 | 5251 |
| 6 | 1 | 67.1 | 81.3 | 22 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 74% |
| stelo.AreaTargetingBot 1.1 | 37 | 68% |
| ntc.Opposite 1.5 | 23 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| disan.Chair 2.2.0 | 12 | 100% |
| donjezza.Muncho 1.0 | 10 | 90% |
| DBall.NUKE 0.1 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 23 | 25% | 56 |
| stelo.AreaTargetingBot 1.1 | 23 | 25% | 45 |
| ntc.Opposite 1.5 | 19 | 21% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 23 |
| pfvicm.Sobieski 7.2.3b | 9 | 10% | 19 |
| disan.Chair 2.2.0 | 3 | 3% | 11 |
| donjezza.Muncho 1.0 | 2 | 2% | 12 |
| DBall.NUKE 0.1 | 2 | 2% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 72.1 | 96 / 210 | 3.51 | 15.3% | 22829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 15.3% | 96 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 42 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 22 |
| yagami.Tidus 0.11 | 5.0 | 11.9% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 6 |
| stelo.MirrorNano 1.3 | 7.3 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 67.3 | 14 / 35 | 3897 |
| 2 | 1 | 66.5 | 81.0 | 21 / 35 | 4031 |
| 3 | 1 | 65.1 | 76.5 | 17 / 35 | 3614 |
| 4 | 1 | 63.0 | 69.5 | 15 / 35 | 3670 |
| 5 | 1 | 63.3 | 69.2 | 16 / 35 | 3831 |
| 6 | 2 | 62.4 | 68.9 | 13 / 35 | 3786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 38 | 79% |
| oog.melee.Capulet 1.2 | 30 | 73% |
| yagami.Tidus 0.11 | 23 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 100% |
| ejb.Polaris 1.0.1 | 4 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 42% | 75 |
| kawigi.micro.Shiz 1.1 | 19 | 17% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 11% | 41 |
| yagami.Tidus 0.11 | 10 | 9% | 27 |
| ejb.Polaris 1.0.1 | 7 | 6% | 11 |
| stelo.MirrorNano 1.3 | 7 | 6% | 8 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.3 | 127 / 210 | 3.13 | 16.7% | 24695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.7% | 127 |
| bzdp.Pansy 2.1 | 2.5 | 12.7% | 16 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 29 |
| wompi.Quokka 1.6 | 3.5 | 11.9% | 16 |
| ratosh.Nobo 0.21 | 4.8 | 10.7% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 9.2% | 4 |
| m3thos.Eva00 1.1 | 6.5 | 9.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.4% | 2 |
| stelo.MyAgileRobot 0.2 | 8.7 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.8 | 20 / 35 | 3863 |
| 2 | 1 | 66.9 | 80.0 | 23 / 35 | 4374 |
| 3 | 1 | 62.2 | 69.5 | 17 / 35 | 3644 |
| 4 | 1 | 65.2 | 79.4 | 21 / 35 | 3959 |
| 5 | 1 | 69.0 | 89.2 | 27 / 35 | 4770 |
| 6 | 1 | 63.4 | 69.2 | 19 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 93% |
| wee.Gem 1.8.4 | 32 | 94% |
| m3thos.Eva00 1.1 | 17 | 88% |
| wompi.Quokka 1.6 | 15 | 100% |
| ratosh.Nobo 0.21 | 8 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 17 | 20% | 29 |
| maribo.FollowFire 1 | 12 | 14% | 11 |
| bzdp.Pansy 2.1 | 10 | 12% | 56 |
| wee.Gem 1.8.4 | 9 | 11% | 44 |
| m3thos.Eva00 1.1 | 9 | 11% | 18 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 12 |
| bayen.UbaMicro 1.4 | 7 | 8% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| ratosh.Nobo 0.21 | 4 | 5% | 19 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 84.6 | 63 / 210 | 2.39 | 20.3% | 48802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 20.3% | 63 |
| wompi.Wallaby 5.1 | 1.7 | 19.9% | 130 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 8 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 6 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.3 | 85.4 | 7 / 35 | 8183 |
| 2 | 1 | 72.2 | 84.4 | 11 / 35 | 8321 |
| 3 | 1 | 70.0 | 79.7 | 12 / 35 | 7399 |
| 4 | 1 | 72.2 | 86.3 | 14 / 35 | 8144 |
| 5 | 2 | 71.8 | 86.7 | 10 / 35 | 8110 |
| 6 | 1 | 72.6 | 84.8 | 9 / 35 | 8645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 127 | 27% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| mz.NanoGod 2.02 | 13 | 92% |
| stuff.Vlad 0.1 | 4 | 75% |
| ayk.WallHugger 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 119 | 80% | 158 |
| mz.NanoGod 2.02 | 12 | 8% | 26 |
| exauge.GateKeeper 1.1.121g | 7 | 5% | 9 |
| ayk.WallHugger 1.0 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 5 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.0 | 108 / 210 | 3.34 | 16.5% | 26737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.5% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 32 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.2 | 12.1% | 27 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 18 |
| bvh.micro.Freya 0.3 | 4.7 | 11.1% | 10 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 5 |
| conscience.Electron 1.3g | 6.5 | 8.4% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 6 |
| dl.BetterWalls 1.0 | 9.3 | 5.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.3 | 64.8 | 15 / 35 | 4076 |
| 2 | 1 | 64.7 | 77.5 | 18 / 35 | 3973 |
| 3 | 1 | 66.4 | 79.0 | 19 / 35 | 4524 |
| 4 | 1 | 66.8 | 77.1 | 21 / 35 | 5243 |
| 5 | 1 | 64.7 | 74.3 | 20 / 35 | 4251 |
| 6 | 1 | 64.3 | 71.1 | 15 / 35 | 4670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 76% |
| dummy.micro.Sparrow 2.5 | 28 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 86% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 27% | 70 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 43 |
| conscience.Electron 1.3g | 14 | 14% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 15 |
| bvh.micro.Freya 0.3 | 10 | 10% | 19 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 7 |
| dl.BetterWalls 1.0 | 3 | 3% | 2 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.4 | 153 / 210 | 2.13 | 21.3% | 40999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.3% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 17 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.6% | 8 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.4% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 3 |
| tlp.ThreeLeggedPig 1 | 6.3 | 8.1% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 1 |
| sample.Corners 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 91.7 | 28 / 35 | 7930 |
| 2 | 1 | 72.1 | 89.5 | 27 / 35 | 6676 |
| 3 | 1 | 70.5 | 84.1 | 24 / 35 | 6597 |
| 4 | 1 | 71.2 | 85.4 | 25 / 35 | 6805 |
| 5 | 1 | 71.5 | 89.2 | 25 / 35 | 6723 |
| 6 | 1 | 70.4 | 84.4 | 24 / 35 | 6268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 74 | 91% |
| sul.Lunar 1.1 | 33 | 88% |
| supersample.SuperBoxBot 1.0 | 21 | 90% |
| sample.MyFirstRobot 1.0 | 12 | 92% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| dsw.StaticD 1.0 | 9 | 78% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 29% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 24% | 74 |
| sul.Lunar 1.1 | 8 | 14% | 41 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 10 |
| dsw.StaticD 1.0 | 4 | 7% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 7% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 15 |
| sample.Corners 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.7 | 126 / 210 | 2.47 | 19.4% | 38701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.4% | 126 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 22 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.9% | 18 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.4% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 10 |
| sample.Walls 1.0 | 7.3 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.0 | 6.6% | 5 |
| GarmBox.Oranges 1.0 | 8.7 | 6.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.9 | 26 / 35 | 6730 |
| 2 | 1 | 68.1 | 79.0 | 18 / 35 | 6622 |
| 3 | 1 | 69.5 | 87.0 | 18 / 35 | 6347 |
| 4 | 1 | 69.7 | 84.1 | 24 / 35 | 6459 |
| 5 | 1 | 70.5 | 87.6 | 22 / 35 | 6605 |
| 6 | 1 | 66.3 | 75.6 | 18 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 86% |
| radnor.DoctorBob 1.42 | 43 | 74% |
| mld.Wisdom 1.0 | 26 | 81% |
| amz.NanoClone 1.41 | 17 | 76% |
| KiraNL.Chupacabra 0.4 | 15 | 80% |
| jangs.ns51 1.0 | 6 | 83% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 20% | 46 |
| mld.Wisdom 1.0 | 16 | 19% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 18% | 54 |
| KiraNL.Chupacabra 0.4 | 15 | 18% | 31 |
| amz.NanoClone 1.41 | 11 | 13% | 18 |
| sample.Walls 1.0 | 5 | 6% | 10 |
| jangs.ns51 1.0 | 3 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

