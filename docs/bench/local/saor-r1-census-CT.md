# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 68.7 | 65 / 210 | 3.81 | 16.2% | 38127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCT 0.1 | 2.0 | 16.2% | 65 |
| mz.AntiGrav 1.0 | 2.2 | 15.4% | 37 |
| radnor.DoctorBob 1.42 | 2.2 | 15.3% | 51 |
| mld.Infinity 2.2 | 3.7 | 13.4% | 37 |
| amz.NanoClone 1.41 | 5.0 | 10.9% | 13 |
| sample.Walls 1.0 | 6.2 | 7.4% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 5 |
| arthord.MannyPacquiao Beta | 9.0 | 4.8% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 74.6 | 13 / 35 | 6521 |
| 2 | 4 | 60.9 | 59.7 | 6 / 35 | 5459 |
| 3 | 1 | 64.0 | 66.7 | 11 / 35 | 5933 |
| 4 | 3 | 63.9 | 63.8 | 6 / 35 | 6543 |
| 5 | 1 | 69.1 | 77.8 | 18 / 35 | 7191 |
| 6 | 2 | 66.1 | 69.8 | 11 / 35 | 6480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 42 | 57% |
| radnor.DoctorBob 1.42 | 25 | 60% |
| mld.Infinity 2.2 | 23 | 83% |
| amz.NanoClone 1.41 | 5 | 60% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 51 | 35% | 61 |
| mz.AntiGrav 1.0 | 39 | 27% | 77 |
| amz.NanoClone 1.41 | 22 | 15% | 28 |
| mld.Infinity 2.2 | 20 | 14% | 19 |
| GarmBox.Oranges 1.0 | 6 | 4% | 6 |
| jangs.ns51 1.0 | 4 | 3% | 9 |
| sample.Walls 1.0 | 1 | 1% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| sample.Target 1.0 | 1 | 1% | 0 |

## Melee bench: F02

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 62.8 | 41 / 210 | 4.35 | 13.6% | 28270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 1.7 | 16.1% | 94 |
| mld.DustBunny 3.8 | 2.8 | 14.1% | 37 |
| hadur117.micro.SaorCT 0.1 | 3.0 | 13.6% | 41 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 9.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.0% | 12 |
| fullsail.SweetTea 1.1 | 7.3 | 7.8% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 74.3 | 7 / 35 | 5003 |
| 2 | 2 | 63.2 | 70.8 | 7 / 35 | 5488 |
| 3 | 3 | 61.5 | 67.9 | 8 / 35 | 4519 |
| 4 | 7 | 47.2 | 32.1 | 0 / 35 | 3892 |
| 5 | 3 | 58.3 | 61.9 | 3 / 35 | 4231 |
| 6 | 2 | 63.0 | 69.5 | 16 / 35 | 5137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 66% |
| mld.DustBunny 3.8 | 24 | 42% |
| fullsail.SweetTea 1.1 | 6 | 33% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 50% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 52 | 31% | 62 |
| zyx.nano.Ant 1.1 | 26 | 15% | 26 |
| oog.melee.Mercutio 1.0 | 25 | 15% | 44 |
| fullsail.SweetTea 1.1 | 18 | 11% | 21 |
| maribo.melee.BMV 0.1 | 12 | 7% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 7% | 12 |
| cs.Grudge 1.0 | 11 | 6% | 12 |
| bzdp.BoxCar 2.0 | 8 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6 | 4% | 9 |

## Melee bench: F03

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 55.9 | 26 / 210 | 4.97 | 13.1% | 31038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.0 | 16.8% | 101 |
| myl.nano.KomoriNinja 1.1 | 2.5 | 13.1% | 19 |
| hadur117.micro.SaorCT 0.1 | 2.7 | 13.1% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.8% | 36 |
| fm.mammillarias 1.3 | 5.3 | 9.7% | 7 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.5% | 14 |
| cs.sheldor.Talon 1.1 | 7.3 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.4% | 4 |
| sample.Tracker 1.0 | 9.5 | 5.4% | 1 |
| sample.Fire 1.0 | 9.5 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 57.8 | 1 / 35 | 5219 |
| 2 | 2 | 61.5 | 59.7 | 10 / 35 | 5537 |
| 3 | 3 | 56.7 | 53.7 | 1 / 35 | 4759 |
| 4 | 2 | 59.9 | 58.4 | 6 / 35 | 5058 |
| 5 | 3 | 56.9 | 48.6 | 3 / 35 | 5354 |
| 6 | 3 | 59.4 | 57.5 | 5 / 35 | 5111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 38% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 38% |
| myl.nano.KomoriNinja 1.1 | 8 | 63% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| cb.nano.Insomnia 1.0 | 3 | 100% |
| fm.mammillarias 1.3 | 3 | 33% |
| sample.Fire 1.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 29% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 39 | 21% | 45 |
| myl.nano.KomoriNinja 1.1 | 25 | 14% | 32 |
| fm.mammillarias 1.3 | 23 | 12% | 24 |
| sample.Tracker 1.0 | 14 | 8% | 14 |
| cb.nano.Insomnia 1.0 | 11 | 6% | 11 |
| sample.Fire 1.0 | 8 | 4% | 10 |
| sp.Nanos.Ember 1.1 | 7 | 4% | 9 |
| cs.sheldor.Talon 1.1 | 5 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.8 | 45 / 210 | 3.90 | 15.5% | 34973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCT 0.1 | 1.3 | 15.5% | 45 |
| kawigi.nano.Lib 1.0 | 1.7 | 15.3% | 65 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.8% | 26 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 12 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.6% | 37 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.1% | 3 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.3% | 11 |
| repositorio.NanoStep 1.0 | 8.3 | 6.8% | 4 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.1 | 6 / 35 | 5993 |
| 2 | 2 | 59.5 | 56.8 | 6 / 35 | 5458 |
| 3 | 1 | 66.7 | 80.6 | 12 / 35 | 5995 |
| 4 | 1 | 64.8 | 75.2 | 9 / 35 | 5620 |
| 5 | 1 | 65.0 | 73.0 | 7 / 35 | 6159 |
| 6 | 2 | 59.8 | 56.2 | 5 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 38 | 24% |
| stelo.SoJNanoMelee 1.1 | 17 | 18% |
| tvv.micro.Antares 1.1.1 | 15 | 80% |
| tj.zombie1n 1.0.1 | 8 | 75% |
| yk.JahMicro 1.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 57% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 92 | 55% | 104 |
| stelo.SoJNanoMelee 1.1 | 30 | 18% | 37 |
| tj.zombie1n 1.0.1 | 13 | 8% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 6% | 14 |
| tvv.micro.Antares 1.1.1 | 6 | 4% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 4% | 6 |
| yk.JahMicro 1.0 | 4 | 2% | 8 |
| repositorio.NanoStep 1.0 | 4 | 2% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 53.3 | 28 / 210 | 5.20 | 11.9% | 26055 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 42 |
| ahf.NanoAndrew .4 | 2.7 | 12.0% | 40 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.9% | 46 |
| hadur117.micro.SaorCT 0.1 | 3.7 | 11.9% | 28 |
| EBBU.Sim2 1.02 | 4.8 | 10.6% | 15 |
| sam.Samspin 1.0 | 5.2 | 10.7% | 20 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 9.4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.1% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 57.1 | 3 / 35 | 4780 |
| 2 | 6 | 51.4 | 47.9 | 5 / 35 | 3320 |
| 3 | 6 | 50.4 | 41.3 | 3 / 35 | 3692 |
| 4 | 4 | 55.1 | 50.5 | 6 / 35 | 4173 |
| 5 | 1 | 58.7 | 61.3 | 4 / 35 | 5006 |
| 6 | 1 | 60.0 | 61.9 | 7 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 55% |
| oog.melee.Corsair 1.0 | 14 | 64% |
| ahf.NanoAndrew .4 | 10 | 0% |
| sam.Samspin 1.0 | 6 | 33% |
| EBBU.Sim2 1.02 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 5 | 20% |
| sample.TrackFire 1.0 | 3 | 67% |

Hadur died in 182 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 35 | 19% | 35 |
| simonton.nano.MeleeSeed 1.8 | 29 | 16% | 41 |
| EBBU.Sim2 1.02 | 23 | 13% | 25 |
| robar.nano.Assertive_Melee 0.2 | 19 | 10% | 19 |
| oog.melee.Corsair 1.0 | 18 | 10% | 28 |
| zyx.nano.BacillusComma 1.0 | 16 | 9% | 18 |
| sam.Samspin 1.0 | 16 | 9% | 17 |
| sample.TrackFire 1.0 | 15 | 8% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 6% | 10 |

## Melee bench: F06

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 56.7 | 29 / 210 | 4.90 | 12.5% | 26922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 77 |
| gh.nano.Grofvuil 0.2 | 2.3 | 13.2% | 22 |
| hadur117.micro.SaorCT 0.1 | 2.8 | 12.5% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.9% | 36 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 10.0% | 16 |
| fm.claire 1.7 | 6.0 | 9.0% | 5 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.5% | 12 |
| sample.SpinBot 1.0 | 7.8 | 7.5% | 10 |
| pa.Improved 1.0 | 9.5 | 6.3% | 4 |
| kurios.DOSexe .9b | 9.5 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 59.0 | 6 / 35 | 3945 |
| 2 | 4 | 52.8 | 48.9 | 2 / 35 | 3821 |
| 3 | 3 | 56.8 | 57.8 | 2 / 35 | 4473 |
| 4 | 3 | 57.4 | 57.1 | 5 / 35 | 4345 |
| 5 | 2 | 61.7 | 63.2 | 7 / 35 | 5485 |
| 6 | 2 | 57.8 | 54.3 | 7 / 35 | 4853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 26% |
| oog.melee.CapuletDroid 1.1 | 12 | 75% |
| gh.nano.Grofvuil 0.2 | 7 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 50% |
| sample.SpinBot 1.0 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 35% | 76 |
| gh.nano.Grofvuil 0.2 | 31 | 17% | 41 |
| oog.melee.CapuletDroid 1.1 | 21 | 12% | 19 |
| fm.claire 1.7 | 17 | 9% | 17 |
| kurios.DOSexe .9b | 16 | 9% | 18 |
| winamp32.micro.MicroMacro 1.0 | 12 | 7% | 12 |
| arthord.NanoSatanMelee Beta | 9 | 5% | 10 |
| sample.SpinBot 1.0 | 7 | 4% | 9 |
| pa.Improved 1.0 | 5 | 3% | 8 |

## Melee bench: F07

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.7 | 47.5 | 18 / 210 | 5.73 | 10.9% | 26562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.2 | 16.0% | 71 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 15.2% | 65 |
| mz.MicroGodMelee 1 | 2.8 | 13.5% | 23 |
| hadur117.micro.SaorCT 0.1 | 4.3 | 10.9% | 18 |
| DBall.Anarchy 0.1 | 4.8 | 9.2% | 14 |
| caimano.Furia_Ceca 0.22 | 6.2 | 8.0% | 5 |
| acogdev.alpha 0.2 | 7.7 | 7.3% | 2 |
| el.JumpShoot 0.2 | 7.7 | 7.3% | 7 |
| mbro.Detektor3 0.1.1 | 8.8 | 6.3% | 6 |
| fire219.CatBot 1.0 | 9.3 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 48.1 | 37.1 | 0 / 35 | 3817 |
| 2 | 5 | 50.7 | 39.4 | 1 / 35 | 4590 |
| 3 | 4 | 55.6 | 52.7 | 2 / 35 | 4404 |
| 4 | 4 | 55.9 | 51.1 | 5 / 35 | 4479 |
| 5 | 3 | 59.7 | 60.0 | 6 / 35 | 5260 |
| 6 | 4 | 52.4 | 44.4 | 4 / 35 | 4012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 18 | 6% |
| mz.MicroGodMelee 1 | 12 | 75% |
| gh.micro.Gruweltje 0.7 | 7 | 29% |
| DBall.Anarchy 0.1 | 5 | 80% |
| el.JumpShoot 0.2 | 1 | 0% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 27% | 53 |
| mz.MicroGodMelee 1 | 39 | 20% | 47 |
| gh.micro.Gruweltje 0.7 | 39 | 20% | 41 |
| caimano.Furia_Ceca 0.22 | 20 | 10% | 21 |
| acogdev.alpha 0.2 | 13 | 7% | 14 |
| fire219.CatBot 1.0 | 9 | 5% | 9 |
| DBall.Anarchy 0.1 | 8 | 4% | 12 |
| el.JumpShoot 0.2 | 8 | 4% | 9 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 44.7 | 23 / 210 | 5.98 | 10.6% | 25737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.0 | 17.3% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 13.7% | 36 |
| hadur117.micro.SaorCT 0.1 | 3.5 | 10.6% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 10.0% | 7 |
| germ.TheMind .2 | 5.7 | 9.5% | 11 |
| awesomeness.Elite 1.0 | 6.0 | 9.5% | 13 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.6% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.5% | 2 |
| sample.Crazy 1.0 | 8.7 | 7.3% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 52.8 | 45.4 | 2 / 35 | 4446 |
| 2 | 3 | 53.3 | 45.1 | 4 / 35 | 4481 |
| 3 | 3 | 55.7 | 52.4 | 3 / 35 | 4526 |
| 4 | 4 | 50.6 | 39.4 | 3 / 35 | 4106 |
| 5 | 4 | 53.1 | 44.4 | 4 / 35 | 4120 |
| 6 | 4 | 52.4 | 41.6 | 7 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 31 | 23% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 63% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| sample.Crazy 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| germ.TheMind .2 | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 31% | 64 |
| germ.TheMind .2 | 28 | 15% | 28 |
| awesomeness.Elite 1.0 | 22 | 12% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 12% | 26 |
| qualidafial.MajorDick 1.0.1 | 21 | 11% | 21 |
| stelo.UntouchableNano 1.3 | 19 | 10% | 22 |
| lrem.micro.MoggFanatic 0.2 | 8 | 4% | 8 |
| mym.EdgeStalker 1.0 | 6 | 3% | 7 |
| sample.Crazy 1.0 | 4 | 2% | 7 |

## Melee bench: F09

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 54.2 | 33 / 210 | 5.12 | 11.8% | 23336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 1.2 | 14.9% | 67 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 12.8% | 27 |
| hadur117.micro.SaorCT 0.1 | 3.5 | 11.8% | 33 |
| timmit.nano.TimDog 0.33 | 4.0 | 11.6% | 30 |
| maribo.IotaCT 1.1 | 4.5 | 11.1% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 9.6% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 9.4% | 9 |
| stelo.PatternRobot 1.0 | 7.7 | 9.2% | 16 |
| spinnercat.Omen 1.0 | 8.2 | 8.3% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 56.5 | 7 / 35 | 3831 |
| 2 | 5 | 55.3 | 50.5 | 5 / 35 | 4029 |
| 3 | 5 | 53.9 | 49.8 | 5 / 35 | 3591 |
| 4 | 3 | 55.9 | 54.0 | 3 / 35 | 3745 |
| 5 | 2 | 60.2 | 61.9 | 10 / 35 | 3997 |
| 6 | 3 | 56.4 | 52.7 | 3 / 35 | 4143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 24 | 29% |
| nz.jdc.nano.GridFu 1.0 | 19 | 68% |
| maribo.IotaCT 1.1 | 9 | 78% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 0% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| stelo.PatternRobot 1.0 | 2 | 0% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 41 | 23% | 46 |
| ratosh.Wesco 1.4 | 34 | 19% | 35 |
| nz.jdc.nano.GridFu 1.0 | 26 | 15% | 41 |
| timmit.nano.TimDog 0.33 | 26 | 15% | 28 |
| stelo.PatternRobot 1.0 | 23 | 13% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 7% | 13 |
| maribo.IotaCT 1.1 | 10 | 6% | 17 |
| spinnercat.Omen 1.0 | 5 | 3% | 5 |

## Melee bench: F10

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.1 | 86 / 210 | 3.42 | 16.7% | 35159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorCT 0.1 | 1.0 | 16.7% | 86 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.7% | 36 |
| baal.nano.N 1.42 | 3.2 | 11.8% | 14 |
| zyx.micro.Ant 1.1 | 3.7 | 11.2% | 30 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.9% | 6 |
| cvt.Firsty 1.0 | 7.3 | 8.1% | 22 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.5% | 5 |
| sanja.First 0.1 | 7.3 | 8.4% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.6% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.2 | 12 / 35 | 5326 |
| 2 | 1 | 66.6 | 77.8 | 18 / 35 | 6026 |
| 3 | 1 | 62.9 | 69.5 | 10 / 35 | 5709 |
| 4 | 1 | 65.9 | 76.5 | 13 / 35 | 6225 |
| 5 | 1 | 66.8 | 77.5 | 18 / 35 | 6374 |
| 6 | 1 | 63.0 | 67.3 | 15 / 35 | 5499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 81% |
| baal.nano.N 1.42 | 21 | 90% |
| cvt.Firsty 1.0 | 14 | 21% |
| sanja.First 0.1 | 13 | 92% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| zyx.micro.Ant 1.1 | 9 | 22% |
| Grystrion.TrackerWO 1.0 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 59 | 48% | 65 |
| cvt.Firsty 1.0 | 23 | 19% | 29 |
| tvv.nano.Polaris 1.2 | 13 | 10% | 33 |
| Grystrion.TrackerWO 1.0 | 10 | 8% | 19 |
| baal.nano.N 1.42 | 8 | 6% | 26 |
| amk.Punbot.Punbot 0.01 | 5 | 4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 3 | 2% | 8 |
| sample.RamFire 1.0 | 2 | 2% | 2 |
| sanja.First 0.1 | 1 | 1% | 21 |

## Melee bench: F11

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.4 | 42.2 | 18 / 210 | 6.20 | 10.0% | 25733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.7% | 99 |
| cs.Wren 1.0 | 2.3 | 13.0% | 26 |
| js.PinBall 1.6 | 3.3 | 11.9% | 18 |
| mz.Cork 0.1 | 3.5 | 11.8% | 23 |
| joe.ADinosaur 1.0 | 5.0 | 10.3% | 7 |
| hadur117.micro.SaorCT 0.1 | 5.8 | 10.0% | 18 |
| evd.X1 0.01 | 6.7 | 8.8% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 7.4% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 49.7 | 38.4 | 1 / 35 | 4153 |
| 2 | 6 | 49.3 | 40.3 | 2 / 35 | 3752 |
| 3 | 6 | 51.9 | 42.5 | 2 / 35 | 4555 |
| 4 | 5 | 53.3 | 43.8 | 7 / 35 | 4415 |
| 5 | 7 | 49.2 | 38.1 | 1 / 35 | 4315 |
| 6 | 5 | 54.9 | 49.8 | 5 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 29 | 41% |
| cs.Wren 1.0 | 9 | 44% |
| js.PinBall 1.6 | 2 | 50% |
| mz.Cork 0.1 | 2 | 50% |

Hadur died in 192 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 27% | 62 |
| cs.Wren 1.0 | 34 | 18% | 38 |
| evd.X1 0.01 | 26 | 14% | 27 |
| js.PinBall 1.6 | 22 | 11% | 24 |
| mz.Cork 0.1 | 21 | 11% | 22 |
| joe.ADinosaur 1.0 | 21 | 11% | 21 |
| PSW.Relentless 0.1 | 11 | 6% | 11 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 53.8 | 35 / 210 | 5.16 | 12.2% | 25514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 1.7 | 13.1% | 55 |
| hadur117.micro.SaorCT 0.1 | 2.7 | 12.2% | 35 |
| ntc.Opposite 1.5 | 3.2 | 11.9% | 27 |
| pfvicm.Sobieski 7.2.3b | 3.8 | 11.3% | 17 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.5% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.8% | 11 |
| disan.Chair 2.2.0 | 7.2 | 8.9% | 14 |
| DBall.NUKE 0.1 | 7.3 | 8.6% | 8 |
| pbg.R2D2 1.0 | 9.3 | 6.3% | 5 |
| donjezza.Muncho 1.0 | 9.7 | 6.4% | 13 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.4 | 54.0 | 6 / 35 | 4276 |
| 2 | 1 | 60.0 | 62.5 | 5 / 35 | 4921 |
| 3 | 2 | 57.7 | 58.7 | 6 / 35 | 4306 |
| 4 | 4 | 53.1 | 46.3 | 3 / 35 | 4034 |
| 5 | 1 | 57.0 | 55.9 | 9 / 35 | 3894 |
| 6 | 6 | 52.9 | 45.1 | 6 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 30% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| DBall.NUKE 0.1 | 8 | 63% |
| stelo.AreaTargetingBot 1.1 | 8 | 50% |
| ntc.Opposite 1.5 | 7 | 29% |
| donjezza.Muncho 1.0 | 6 | 33% |
| disan.Chair 2.2.0 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 40 | 23% | 41 |
| ntc.Opposite 1.5 | 30 | 17% | 32 |
| myl.nano.Graviton 1.10 | 27 | 15% | 35 |
| stelo.AreaTargetingBot 1.1 | 24 | 14% | 29 |
| disan.Chair 2.2.0 | 19 | 11% | 20 |
| donjezza.Muncho 1.0 | 11 | 6% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 5% | 15 |
| pbg.R2D2 1.0 | 9 | 5% | 12 |
| DBall.NUKE 0.1 | 7 | 4% | 14 |

## Melee bench: F13

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 47.0 | 19 / 210 | 5.77 | 10.6% | 22552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 1.7 | 14.7% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.2% | 31 |
| oog.melee.Capulet 1.2 | 2.7 | 13.5% | 56 |
| yagami.Tidus 0.11 | 3.7 | 12.6% | 24 |
| ejb.Polaris 1.0.1 | 4.8 | 11.6% | 13 |
| hadur117.micro.SaorCT 0.1 | 5.7 | 10.6% | 19 |
| stelo.MirrorNano 1.3 | 7.3 | 8.1% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.9% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.4 | 39.0 | 2 / 35 | 3299 |
| 2 | 6 | 53.7 | 47.0 | 3 / 35 | 3792 |
| 3 | 5 | 56.5 | 47.6 | 6 / 35 | 4137 |
| 4 | 5 | 54.2 | 48.3 | 3 / 35 | 3601 |
| 5 | 6 | 53.4 | 46.0 | 2 / 35 | 3998 |
| 6 | 6 | 55.7 | 54.3 | 3 / 35 | 3725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 13 | 54% |
| kawigi.micro.Shiz 1.1 | 9 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 67% |
| yagami.Tidus 0.11 | 4 | 50% |
| ejb.Polaris 1.0.1 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 38 | 20% | 39 |
| kawigi.micro.Shiz 1.1 | 33 | 17% | 36 |
| oog.melee.Capulet 1.2 | 29 | 15% | 36 |
| step.nanoPri 1.0 | 26 | 14% | 26 |
| ejb.Polaris 1.0.1 | 24 | 13% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 8% | 22 |
| kurios.DOSexe .9a | 15 | 8% | 15 |
| stelo.MirrorNano 1.3 | 11 | 6% | 11 |

## Melee bench: F14

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 59.0 | 52 / 210 | 4.69 | 12.7% | 23794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bzdp.Pansy 2.1 | 1.8 | 13.4% | 47 |
| wee.Gem 1.8.4 | 2.3 | 12.8% | 47 |
| hadur117.micro.SaorCT 0.1 | 2.8 | 12.7% | 52 |
| ratosh.Nobo 0.21 | 3.5 | 12.0% | 23 |
| wompi.Quokka 1.6 | 4.7 | 11.3% | 19 |
| m3thos.Eva00 1.1 | 5.8 | 10.5% | 15 |
| bayen.UbaMicro 1.4 | 7.2 | 8.7% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 61.3 | 12 / 35 | 3503 |
| 2 | 2 | 60.7 | 65.4 | 10 / 35 | 4345 |
| 3 | 2 | 58.8 | 62.9 | 10 / 35 | 4002 |
| 4 | 4 | 55.8 | 55.6 | 7 / 35 | 3818 |
| 5 | 3 | 56.8 | 57.1 | 8 / 35 | 4084 |
| 6 | 4 | 54.8 | 51.7 | 5 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 28 | 54% |
| wee.Gem 1.8.4 | 19 | 84% |
| m3thos.Eva00 1.1 | 8 | 63% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| ratosh.Nobo 0.21 | 7 | 57% |
| wompi.Quokka 1.6 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 23 | 15% | 30 |
| bzdp.Pansy 2.1 | 21 | 13% | 37 |
| ratosh.Nobo 0.21 | 21 | 13% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 21 | 13% | 21 |
| stelo.MyAgileRobot 0.2 | 19 | 12% | 20 |
| wee.Gem 1.8.4 | 15 | 9% | 31 |
| wompi.Quokka 1.6 | 14 | 9% | 17 |
| bayen.UbaMicro 1.4 | 13 | 8% | 17 |
| maribo.FollowFire 1 | 11 | 7% | 12 |

## Melee bench: F15

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 73.8 | 97 / 210 | 3.36 | 18.0% | 41992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 18.0% | 86 |
| hadur117.micro.SaorCT 0.1 | 1.7 | 18.0% | 97 |
| mz.NanoGod 2.02 | 2.8 | 14.7% | 13 |
| ayk.WallHugger 1.0 | 4.3 | 10.8% | 0 |
| exauge.GateKeeper 1.1.121g | 4.7 | 10.3% | 8 |
| stuff.Vlad 0.1 | 6.2 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 3 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 81.6 | 20 / 35 | 7657 |
| 2 | 3 | 63.9 | 62.2 | 10 / 35 | 6145 |
| 3 | 2 | 67.5 | 70.5 | 13 / 35 | 7074 |
| 4 | 2 | 67.6 | 71.7 | 14 / 35 | 6679 |
| 5 | 1 | 70.8 | 81.3 | 21 / 35 | 7578 |
| 6 | 1 | 69.0 | 75.6 | 19 / 35 | 6859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 70 | 83% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| drd.Dreadknoght 0.9 | 9 | 78% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 51 | 45% | 63 |
| wompi.Wallaby 5.1 | 19 | 17% | 81 |
| exauge.GateKeeper 1.1.121g | 16 | 14% | 23 |
| ayk.WallHugger 1.0 | 16 | 14% | 20 |
| drd.Dreadknoght 0.9 | 6 | 5% | 13 |
| stuff.Vlad 0.1 | 4 | 4% | 8 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 54.2 | 39 / 210 | 5.12 | 12.2% | 25877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.3 | 13.9% | 50 |
| hadur117.micro.SaorCT 0.1 | 2.7 | 12.2% | 39 |
| bvh.micro.Freya 0.3 | 3.7 | 11.5% | 20 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.8% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 31 |
| conscience.Electron 1.3g | 5.5 | 10.1% | 8 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.4% | 7 |
| ap.Frederick 1.1 | 8.3 | 7.2% | 19 |
| dl.BetterWalls 1.0 | 9.2 | 6.6% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.7 | 55.9 | 7 / 35 | 4220 |
| 2 | 2 | 57.1 | 56.2 | 5 / 35 | 4540 |
| 3 | 1 | 59.7 | 60.0 | 10 / 35 | 4571 |
| 4 | 4 | 56.0 | 53.7 | 7 / 35 | 4225 |
| 5 | 4 | 53.4 | 48.9 | 4 / 35 | 4114 |
| 6 | 3 | 54.8 | 50.5 | 6 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 26% |
| dummy.micro.Sparrow 2.5 | 18 | 61% |
| bvh.micro.Freya 0.3 | 9 | 89% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 29% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 46 | 27% | 48 |
| voidious.micro.BlitzBat 1.05 | 40 | 23% | 47 |
| mn.nano.perceptual.Impact 1.3.0 | 28 | 16% | 25 |
| dummy.micro.Sparrow 2.5 | 22 | 13% | 34 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 11% | 23 |
| dl.BetterWalls 1.0 | 7 | 4% | 10 |
| stelo.MirrorMicro 1.0 | 5 | 3% | 14 |
| bvh.micro.Freya 0.3 | 5 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 58.1 | 40 / 210 | 4.77 | 13.9% | 33623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.2 | 16.7% | 58 |
| hadur117.micro.SaorCT 0.1 | 2.2 | 13.9% | 40 |
| supersample.SuperBoxBot 1.0 | 2.7 | 13.5% | 41 |
| sul.Lunar 1.1 | 4.0 | 11.9% | 24 |
| dsw.StaticD 1.0 | 5.3 | 9.7% | 10 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.6% | 11 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 10 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 9 |
| sample.Corners 1.0 | 9.7 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 58.1 | 8 / 35 | 5777 |
| 2 | 3 | 60.6 | 58.1 | 7 / 35 | 5274 |
| 3 | 2 | 61.6 | 58.1 | 6 / 35 | 6023 |
| 4 | 2 | 61.8 | 62.2 | 8 / 35 | 5449 |
| 5 | 3 | 54.7 | 46.3 | 3 / 35 | 4793 |
| 6 | 1 | 64.1 | 66.0 | 8 / 35 | 6307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 27 | 52% |
| sul.Lunar 1.1 | 15 | 100% |
| dsw.StaticD 1.0 | 8 | 63% |
| supersample.SuperBoxBot 1.0 | 7 | 14% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |
| sample.MyFirstRobot 1.0 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 66 | 39% | 66 |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 20% | 46 |
| dsw.StaticD 1.0 | 21 | 12% | 26 |
| mme.NikeEnhanced 2.0 | 15 | 9% | 17 |
| sul.Lunar 1.1 | 11 | 6% | 27 |
| sample.MyFirstJuniorRobot 1.0 | 9 | 5% | 10 |
| sample.MyFirstRobot 1.0 | 7 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 5 |
| sample.Corners 1.0 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorCT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 53.0 | 32 / 210 | 5.23 | 11.9% | 28263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.8 | 14.1% | 45 |
| mld.Wisdom 1.0 | 2.2 | 13.6% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.7% | 47 |
| hadur117.micro.SaorCT 0.1 | 4.2 | 11.9% | 32 |
| KiraNL.Chupacabra 0.4 | 4.7 | 11.1% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 18 |
| sample.Walls 1.0 | 7.2 | 8.3% | 12 |
| GarmBox.Oranges 1.0 | 8.2 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.8% | 5 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 56.8 | 7 / 35 | 4580 |
| 2 | 5 | 54.0 | 46.0 | 3 / 35 | 4931 |
| 3 | 6 | 52.6 | 44.4 | 6 / 35 | 4270 |
| 4 | 4 | 57.2 | 56.5 | 6 / 35 | 4829 |
| 5 | 4 | 56.8 | 55.2 | 4 / 35 | 4704 |
| 6 | 2 | 58.5 | 59.0 | 6 / 35 | 4949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 41% |
| radnor.DoctorBob 1.42 | 15 | 60% |
| amz.NanoClone 1.41 | 8 | 50% |
| mld.Wisdom 1.0 | 6 | 33% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 44 | 25% | 47 |
| radnor.DoctorBob 1.42 | 36 | 20% | 42 |
| KiraNL.Chupacabra 0.4 | 30 | 17% | 35 |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 16% | 37 |
| amz.NanoClone 1.41 | 19 | 11% | 23 |
| sample.Walls 1.0 | 9 | 5% | 11 |
| GarmBox.Oranges 1.0 | 8 | 4% | 8 |
| jangs.ns51 1.0 | 3 | 2% | 5 |

