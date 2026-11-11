# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.3 | 63 / 210 | 3.59 | 15.2% | 25785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 1.5 | 16.2% | 52 |
| hadur117.micro.SaorOG2 0.1 | 2.5 | 15.2% | 63 |
| mld.Infinity 2.2 | 2.7 | 14.9% | 45 |
| mz.AntiGrav 1.0 | 3.3 | 14.6% | 32 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 10 |
| sample.Walls 1.0 | 6.3 | 7.9% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 4 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.3 | 69.8 | 13 / 35 | 4323 |
| 2 | 1 | 66.4 | 79.4 | 13 / 35 | 4537 |
| 3 | 2 | 65.5 | 75.9 | 13 / 35 | 4435 |
| 4 | 4 | 61.8 | 67.0 | 7 / 35 | 3981 |
| 5 | 3 | 62.5 | 69.2 | 6 / 35 | 4276 |
| 6 | 2 | 62.3 | 66.3 | 11 / 35 | 4233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 59% |
| mld.Infinity 2.2 | 30 | 53% |
| mz.AntiGrav 1.0 | 21 | 81% |
| jangs.ns51 1.0 | 3 | 33% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 36% | 75 |
| mld.Infinity 2.2 | 40 | 27% | 36 |
| mz.AntiGrav 1.0 | 26 | 18% | 52 |
| sample.Walls 1.0 | 11 | 7% | 19 |
| amz.NanoClone 1.41 | 7 | 5% | 11 |
| GarmBox.Oranges 1.0 | 5 | 3% | 6 |
| jangs.ns51 1.0 | 3 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| sample.Target 1.0 | 1 | 1% | 0 |

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.7 | 100 / 210 | 3.28 | 15.6% | 22779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 15.6% | 100 |
| mld.DustBunny 3.8 | 2.3 | 14.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.6% | 58 |
| maribo.melee.BMV 0.1 | 4.5 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.3% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 9.2% | 15 |
| zyx.nano.Ant 1.1 | 6.3 | 8.8% | 1 |
| bzdp.BoxCar 2.0 | 8.2 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.8 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 77.5 | 15 / 35 | 4049 |
| 2 | 1 | 63.5 | 79.4 | 17 / 35 | 3363 |
| 3 | 1 | 66.2 | 82.2 | 20 / 35 | 4111 |
| 4 | 1 | 65.2 | 82.2 | 20 / 35 | 3488 |
| 5 | 3 | 56.1 | 46.3 | 8 / 35 | 4059 |
| 6 | 1 | 65.0 | 80.3 | 20 / 35 | 3709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 52 | 77% |
| mld.DustBunny 3.8 | 32 | 91% |
| djdjdj.NanoSkunk10 1.0 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 19% | 60 |
| mld.DustBunny 3.8 | 20 | 18% | 53 |
| zyx.nano.Ant 1.1 | 20 | 18% | 22 |
| djdjdj.NanoSkunk10 1.0 | 13 | 12% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 12% | 22 |
| cs.Grudge 1.0 | 10 | 9% | 10 |
| maribo.melee.BMV 0.1 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 69.1 | 77 / 210 | 3.78 | 15.2% | 25023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.0 | 17.0% | 75 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 15.2% | 77 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.9% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.2% | 19 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.7% | 13 |
| fm.mammillarias 1.3 | 6.3 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.5% | 4 |
| sample.Fire 1.0 | 9.2 | 5.7% | 8 |
| sample.Tracker 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 63.5 | 11 / 35 | 4110 |
| 2 | 2 | 62.6 | 68.3 | 12 / 35 | 4360 |
| 3 | 2 | 65.3 | 75.6 | 15 / 35 | 4391 |
| 4 | 2 | 61.4 | 63.8 | 14 / 35 | 3854 |
| 5 | 2 | 63.9 | 72.7 | 13 / 35 | 4171 |
| 6 | 2 | 62.7 | 70.8 | 12 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 74% |
| cb.nano.Insomnia 1.0 | 17 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 69% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| sample.Fire 1.0 | 6 | 33% |
| sample.Tracker 1.0 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 36 | 27% | 82 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 20% | 33 |
| myl.nano.KomoriNinja 1.1 | 21 | 16% | 39 |
| cb.nano.Insomnia 1.0 | 16 | 12% | 13 |
| sample.Fire 1.0 | 13 | 10% | 15 |
| fm.mammillarias 1.3 | 7 | 5% | 9 |
| sample.Tracker 1.0 | 6 | 4% | 6 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 75.9 | 100 / 210 | 3.17 | 16.7% | 28101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.7% | 100 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 25 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.8% | 26 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 10.1% | 29 |
| tj.zombie1n 1.0.1 | 5.0 | 10.4% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.1% | 6 |
| yk.JahMicro 1.0 | 7.7 | 7.8% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 75.6 | 14 / 35 | 4963 |
| 2 | 1 | 66.2 | 76.8 | 18 / 35 | 4853 |
| 3 | 1 | 66.5 | 77.8 | 20 / 35 | 5083 |
| 4 | 2 | 62.4 | 68.6 | 12 / 35 | 4330 |
| 5 | 1 | 64.8 | 75.9 | 18 / 35 | 4613 |
| 6 | 1 | 65.8 | 81.0 | 18 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 45 | 91% |
| stelo.SoJNanoMelee 1.1 | 27 | 56% |
| tvv.micro.Antares 1.1.1 | 23 | 70% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| tj.zombie1n 1.0.1 | 9 | 89% |
| yk.JahMicro 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 60% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 27% | 75 |
| stelo.SoJNanoMelee 1.1 | 28 | 25% | 38 |
| tvv.micro.Antares 1.1.1 | 19 | 17% | 39 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 9% | 16 |
| tj.zombie1n 1.0.1 | 8 | 7% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 12 |
| yk.JahMicro 1.0 | 5 | 5% | 9 |
| repositorio.NanoStep 1.0 | 3 | 3% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 58.9 | 58 / 210 | 4.70 | 12.9% | 21238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 1.8 | 13.1% | 30 |
| hadur117.micro.SaorOG2 0.1 | 2.0 | 12.9% | 58 |
| ahf.NanoAndrew .4 | 3.7 | 11.7% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.6% | 30 |
| sam.Samspin 1.0 | 4.0 | 11.1% | 29 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.4% | 19 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.4% | 8 |
| EBBU.Sim2 1.02 | 7.3 | 9.2% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 1 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.4 | 62.2 | 12 / 35 | 3722 |
| 2 | 1 | 60.3 | 65.4 | 11 / 35 | 3659 |
| 3 | 3 | 55.5 | 54.3 | 8 / 35 | 3242 |
| 4 | 1 | 58.6 | 60.3 | 9 / 35 | 3679 |
| 5 | 4 | 56.2 | 52.4 | 7 / 35 | 3457 |
| 6 | 2 | 57.9 | 58.7 | 11 / 35 | 3479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 68% |
| oog.melee.Corsair 1.0 | 24 | 75% |
| ahf.NanoAndrew .4 | 11 | 64% |
| sam.Samspin 1.0 | 10 | 60% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| EBBU.Sim2 1.02 | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 22% | 46 |
| ahf.NanoAndrew .4 | 23 | 15% | 31 |
| zyx.nano.BacillusComma 1.0 | 21 | 14% | 26 |
| robar.nano.Assertive_Melee 0.2 | 17 | 11% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 11% | 16 |
| sam.Samspin 1.0 | 14 | 9% | 19 |
| EBBU.Sim2 1.02 | 14 | 9% | 16 |
| oog.melee.Corsair 1.0 | 9 | 6% | 32 |
| sample.TrackFire 1.0 | 5 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.7 | 108 / 210 | 2.73 | 16.7% | 23732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.7% | 108 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.2% | 40 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 17 |
| arthord.NanoSatanMelee Beta | 4.7 | 9.9% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.1% | 16 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 7 |
| fm.claire 1.7 | 7.0 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.2 | 8.3% | 8 |
| pa.Improved 1.0 | 9.2 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.8 | 21 / 35 | 4205 |
| 2 | 1 | 64.1 | 77.5 | 17 / 35 | 3624 |
| 3 | 1 | 63.1 | 76.5 | 16 / 35 | 3498 |
| 4 | 1 | 67.2 | 84.4 | 21 / 35 | 4469 |
| 5 | 2 | 62.3 | 74.6 | 12 / 35 | 3710 |
| 6 | 1 | 67.7 | 87.6 | 21 / 35 | 4226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 82% |
| oog.melee.CapuletDroid 1.1 | 24 | 63% |
| arthord.NanoSatanMelee Beta | 22 | 82% |
| gh.nano.Grofvuil 0.2 | 17 | 71% |
| sample.SpinBot 1.0 | 7 | 71% |
| winamp32.micro.MicroMacro 1.0 | 4 | 25% |
| pa.Improved 1.0 | 2 | 50% |
| fm.claire 1.7 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 27% | 86 |
| sample.SpinBot 1.0 | 16 | 16% | 21 |
| arthord.NanoSatanMelee Beta | 15 | 15% | 26 |
| oog.melee.CapuletDroid 1.1 | 14 | 14% | 11 |
| gh.nano.Grofvuil 0.2 | 12 | 12% | 34 |
| winamp32.micro.MicroMacro 1.0 | 9 | 9% | 12 |
| kurios.DOSexe .9b | 4 | 4% | 8 |
| fm.claire 1.7 | 4 | 4% | 6 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 66.8 | 49 / 210 | 3.99 | 13.7% | 22310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 1.0 | 16.8% | 73 |
| spinnercat.micro.Tyger 0.1 | 2.0 | 14.4% | 43 |
| hadur117.micro.SaorOG2 0.1 | 3.0 | 13.7% | 49 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 17 |
| DBall.Anarchy 0.1 | 5.0 | 9.6% | 15 |
| caimano.Furia_Ceca 0.22 | 7.2 | 7.1% | 2 |
| mbro.Detektor3 0.1.1 | 7.5 | 6.6% | 7 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 3 |
| acogdev.alpha 0.2 | 8.2 | 6.8% | 2 |
| fire219.CatBot 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 70.2 | 6 / 35 | 3939 |
| 2 | 3 | 59.9 | 64.4 | 10 / 35 | 3705 |
| 3 | 3 | 59.0 | 64.1 | 7 / 35 | 3726 |
| 4 | 3 | 59.8 | 64.1 | 8 / 35 | 3575 |
| 5 | 3 | 61.4 | 69.5 | 9 / 35 | 3771 |
| 6 | 3 | 60.5 | 68.6 | 9 / 35 | 3594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 26 | 46% |
| gh.micro.Gruweltje 0.7 | 25 | 32% |
| mz.MicroGodMelee 1 | 16 | 88% |
| DBall.Anarchy 0.1 | 16 | 75% |
| mbro.Detektor3 0.1.1 | 3 | 33% |
| acogdev.alpha 0.2 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 30% | 60 |
| gh.micro.Gruweltje 0.7 | 44 | 27% | 56 |
| acogdev.alpha 0.2 | 23 | 14% | 24 |
| DBall.Anarchy 0.1 | 11 | 7% | 16 |
| mz.MicroGodMelee 1 | 10 | 6% | 23 |
| mbro.Detektor3 0.1.1 | 8 | 5% | 11 |
| caimano.Furia_Ceca 0.22 | 7 | 4% | 8 |
| el.JumpShoot 0.2 | 6 | 4% | 8 |
| fire219.CatBot 1.0 | 4 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 62.5 | 68 / 210 | 4.38 | 13.7% | 23372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.4% | 62 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 14.2% | 40 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 13.7% | 68 |
| awesomeness.Elite 1.0 | 5.2 | 9.2% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.1% | 8 |
| germ.TheMind .2 | 6.0 | 9.1% | 11 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.1% | 1 |
| sample.Crazy 1.0 | 7.8 | 7.4% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 63.8 | 17 / 35 | 3778 |
| 2 | 3 | 59.2 | 59.7 | 9 / 35 | 3889 |
| 3 | 2 | 64.3 | 75.6 | 15 / 35 | 4190 |
| 4 | 3 | 55.9 | 49.8 | 7 / 35 | 3880 |
| 5 | 3 | 54.4 | 51.1 | 7 / 35 | 3446 |
| 6 | 2 | 64.5 | 74.9 | 13 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| germ.TheMind .2 | 8 | 63% |
| awesomeness.Elite 1.0 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 57% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 6 | 33% |

Hadur died in 142 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 50% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 15% | 33 |
| germ.TheMind .2 | 13 | 9% | 18 |
| qualidafial.MajorDick 1.0.1 | 11 | 8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 9 |
| mym.EdgeStalker 1.0 | 6 | 4% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 11 |
| awesomeness.Elite 1.0 | 4 | 3% | 11 |
| sample.Crazy 1.0 | 4 | 3% | 7 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.4 | 109 / 210 | 2.59 | 17.4% | 24238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 17.4% | 109 |
| rz.HawkOnFire 0.1 | 2.5 | 14.1% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.6% | 24 |
| maribo.IotaCT 1.1 | 4.0 | 11.6% | 19 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.6% | 13 |
| stelo.PatternRobot 1.0 | 6.0 | 9.0% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.8% | 2 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 4 |
| spinnercat.Omen 1.0 | 8.7 | 6.9% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 74.3 | 14 / 35 | 3432 |
| 2 | 1 | 70.2 | 93.7 | 26 / 35 | 4166 |
| 3 | 1 | 66.6 | 81.3 | 17 / 35 | 4151 |
| 4 | 1 | 68.5 | 87.6 | 19 / 35 | 4338 |
| 5 | 1 | 65.8 | 75.2 | 17 / 35 | 4083 |
| 6 | 1 | 66.9 | 82.2 | 16 / 35 | 4068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 50 | 88% |
| nz.jdc.nano.GridFu 1.0 | 45 | 78% |
| maribo.IotaCT 1.1 | 20 | 60% |
| timmit.nano.TimDog 0.33 | 14 | 64% |
| stelo.PatternRobot 1.0 | 12 | 58% |
| ratosh.Wesco 1.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 27 | 27% | 61 |
| timmit.nano.TimDog 0.33 | 18 | 18% | 29 |
| rz.HawkOnFire 0.1 | 16 | 16% | 50 |
| maribo.IotaCT 1.1 | 15 | 15% | 33 |
| stelo.PatternRobot 1.0 | 13 | 13% | 18 |
| ratosh.Wesco 1.4 | 5 | 5% | 7 |
| spinnercat.Omen 1.0 | 4 | 4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 4 |

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.7 | 135 / 210 | 2.29 | 19.0% | 32189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 19.0% | 135 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.9% | 32 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 7 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.6% | 4 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 6 |
| sanja.First 0.1 | 5.7 | 9.1% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 3 |
| cvt.Firsty 1.0 | 7.5 | 8.0% | 12 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.7% | 5 |
| sample.RamFire 1.0 | 9.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.2 | 22 / 35 | 5212 |
| 2 | 1 | 69.2 | 91.1 | 23 / 35 | 5155 |
| 3 | 1 | 68.3 | 86.0 | 23 / 35 | 5343 |
| 4 | 1 | 66.6 | 79.0 | 21 / 35 | 5080 |
| 5 | 1 | 68.6 | 86.7 | 24 / 35 | 5512 |
| 6 | 1 | 69.7 | 89.2 | 22 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 59% |
| baal.nano.N 1.42 | 39 | 97% |
| cvt.Firsty 1.0 | 30 | 80% |
| sanja.First 0.1 | 20 | 90% |
| Grystrion.TrackerWO 1.0 | 10 | 90% |
| amk.Punbot.Punbot 0.01 | 9 | 100% |
| zyx.micro.Ant 1.1 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 0% |

Hadur died in 79 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 27 | 34% | 57 |
| cvt.Firsty 1.0 | 12 | 15% | 37 |
| zyx.micro.Ant 1.1 | 10 | 13% | 28 |
| sample.RamFire 1.0 | 9 | 11% | 8 |
| Grystrion.TrackerWO 1.0 | 7 | 9% | 16 |
| sanja.First 0.1 | 5 | 6% | 28 |
| baal.nano.N 1.42 | 5 | 6% | 25 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 54.4 | 35 / 210 | 5.10 | 11.7% | 22948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 17.1% | 109 |
| cs.Wren 1.0 | 2.7 | 13.3% | 25 |
| hadur117.micro.SaorOG2 0.1 | 3.7 | 11.7% | 35 |
| mz.Cork 0.1 | 3.7 | 12.0% | 18 |
| js.PinBall 1.6 | 3.8 | 11.6% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 2 |
| evd.X1 0.01 | 7.2 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 9 |
| PSW.Relentless 0.1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 62.9 | 9 / 35 | 4082 |
| 2 | 3 | 57.2 | 60.3 | 4 / 35 | 3710 |
| 3 | 4 | 56.1 | 54.3 | 7 / 35 | 3572 |
| 4 | 3 | 56.4 | 55.9 | 6 / 35 | 4011 |
| 5 | 5 | 51.3 | 43.8 | 2 / 35 | 3657 |
| 6 | 4 | 54.7 | 49.5 | 7 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 48 | 19% |
| cs.Wren 1.0 | 14 | 100% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 5 | 80% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 85 | 48% | 93 |
| cs.Wren 1.0 | 19 | 11% | 33 |
| evd.X1 0.01 | 17 | 10% | 17 |
| joe.ADinosaur 1.0 | 16 | 9% | 17 |
| js.PinBall 1.6 | 15 | 9% | 18 |
| mz.Cork 0.1 | 11 | 6% | 17 |
| PSW.Relentless 0.1 | 9 | 5% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 67.7 | 73 / 210 | 3.90 | 14.5% | 22339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.3 | 14.5% | 73 |
| ntc.Opposite 1.5 | 2.7 | 12.1% | 24 |
| myl.nano.Graviton 1.10 | 3.0 | 12.2% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.9% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.7% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.9% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.6% | 8 |
| disan.Chair 2.2.0 | 7.7 | 8.2% | 9 |
| donjezza.Muncho 1.0 | 9.0 | 6.6% | 15 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 56.2 | 9 / 35 | 3445 |
| 2 | 1 | 64.0 | 75.9 | 13 / 35 | 3909 |
| 3 | 1 | 60.9 | 66.3 | 14 / 35 | 3820 |
| 4 | 1 | 58.2 | 58.7 | 8 / 35 | 4045 |
| 5 | 1 | 61.8 | 69.8 | 13 / 35 | 3611 |
| 6 | 1 | 64.0 | 79.4 | 16 / 35 | 3509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 82% |
| stelo.AreaTargetingBot 1.1 | 15 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| ntc.Opposite 1.5 | 9 | 56% |
| DBall.NUKE 0.1 | 8 | 88% |
| donjezza.Muncho 1.0 | 6 | 67% |
| disan.Chair 2.2.0 | 5 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 22% | 45 |
| pfvicm.Sobieski 7.2.3b | 23 | 17% | 28 |
| myl.nano.Graviton 1.10 | 21 | 15% | 46 |
| ntc.Opposite 1.5 | 19 | 14% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 18 | 13% | 25 |
| disan.Chair 2.2.0 | 9 | 7% | 10 |
| DBall.NUKE 0.1 | 8 | 6% | 16 |
| donjezza.Muncho 1.0 | 6 | 4% | 10 |
| pbg.R2D2 1.0 | 3 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 60.4 | 63 / 210 | 4.57 | 12.4% | 16987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 15.3% | 63 |
| kawigi.micro.Shiz 1.1 | 1.8 | 14.8% | 50 |
| hadur117.micro.SaorOG2 0.1 | 4.0 | 12.4% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 14 |
| yagami.Tidus 0.11 | 4.3 | 11.8% | 11 |
| ejb.Polaris 1.0.1 | 5.3 | 11.4% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.9 | 54.9 | 9 / 35 | 2806 |
| 2 | 3 | 58.1 | 61.6 | 10 / 35 | 2656 |
| 3 | 4 | 59.3 | 60.3 | 11 / 35 | 2982 |
| 4 | 2 | 62.2 | 72.1 | 13 / 35 | 3151 |
| 5 | 6 | 54.4 | 49.8 | 9 / 35 | 2813 |
| 6 | 4 | 59.3 | 63.5 | 11 / 35 | 2579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 73% |
| oog.melee.Capulet 1.2 | 25 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 100% |
| yagami.Tidus 0.11 | 8 | 88% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 33% | 68 |
| kawigi.micro.Shiz 1.1 | 20 | 14% | 34 |
| yagami.Tidus 0.11 | 20 | 14% | 27 |
| ejb.Polaris 1.0.1 | 18 | 12% | 24 |
| stelo.MirrorNano 1.3 | 12 | 8% | 12 |
| kurios.DOSexe .9a | 12 | 8% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 7% | 27 |
| step.nanoPri 1.0 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.8 | 95 / 210 | 3.45 | 14.9% | 19804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 14.9% | 95 |
| wee.Gem 1.8.4 | 2.3 | 13.6% | 50 |
| bzdp.Pansy 2.1 | 2.7 | 12.9% | 25 |
| wompi.Quokka 1.6 | 4.3 | 12.0% | 13 |
| ratosh.Nobo 0.21 | 4.5 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 72.4 | 17 / 35 | 3319 |
| 2 | 1 | 61.1 | 70.5 | 16 / 35 | 3100 |
| 3 | 2 | 60.5 | 70.2 | 11 / 35 | 3074 |
| 4 | 1 | 63.4 | 75.6 | 18 / 35 | 3461 |
| 5 | 1 | 62.1 | 71.1 | 16 / 35 | 3529 |
| 6 | 1 | 63.5 | 77.1 | 17 / 35 | 3321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 43 | 77% |
| bzdp.Pansy 2.1 | 30 | 93% |
| wompi.Quokka 1.6 | 17 | 76% |
| ratosh.Nobo 0.21 | 11 | 82% |
| m3thos.Eva00 1.1 | 9 | 89% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 32 | 28% | 67 |
| wompi.Quokka 1.6 | 21 | 18% | 28 |
| bzdp.Pansy 2.1 | 18 | 16% | 42 |
| m3thos.Eva00 1.1 | 10 | 9% | 20 |
| ratosh.Nobo 0.21 | 10 | 9% | 19 |
| maribo.FollowFire 1 | 10 | 9% | 9 |
| bayen.UbaMicro 1.4 | 9 | 8% | 11 |
| stelo.MyAgileRobot 0.2 | 4 | 3% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.9 | 18 / 210 | 3.26 | 15.9% | 32478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.7% | 171 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 15.9% | 18 |
| mz.NanoGod 2.02 | 2.8 | 14.9% | 14 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 5 |
| ayk.WallHugger 1.0 | 5.3 | 8.9% | 0 |
| stuff.Vlad 0.1 | 5.3 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 71.4 | 4 / 35 | 5205 |
| 2 | 2 | 65.6 | 75.9 | 2 / 35 | 5153 |
| 3 | 2 | 65.9 | 74.3 | 2 / 35 | 5876 |
| 4 | 3 | 64.2 | 68.9 | 4 / 35 | 5112 |
| 5 | 2 | 66.5 | 77.1 | 3 / 35 | 5705 |
| 6 | 2 | 66.9 | 81.6 | 3 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 5% |
| mz.NanoGod 2.02 | 9 | 56% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 67% |
| sample.SittingDuck 1.0 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 127 | 66% | 130 |
| mz.NanoGod 2.02 | 32 | 17% | 41 |
| ayk.WallHugger 1.0 | 10 | 5% | 12 |
| exauge.GateKeeper 1.1.121g | 10 | 5% | 12 |
| stuff.Vlad 0.1 | 6 | 3% | 8 |
| drd.Dreadknoght 0.9 | 5 | 3% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| sample.SittingDuck 1.0 | 1 | 1% | 0 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.0 | 78 / 210 | 4.24 | 13.6% | 20122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 1.5 | 14.0% | 34 |
| hadur117.micro.SaorOG2 0.1 | 1.7 | 13.6% | 78 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.3% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.5% | 20 |
| bvh.micro.Freya 0.3 | 4.5 | 11.4% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.6% | 13 |
| conscience.Electron 1.3g | 7.7 | 7.9% | 4 |
| dl.BetterWalls 1.0 | 8.0 | 7.3% | 7 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.8 | 65.7 | 11 / 35 | 3370 |
| 2 | 2 | 57.9 | 60.0 | 12 / 35 | 3376 |
| 3 | 1 | 59.6 | 65.1 | 13 / 35 | 3277 |
| 4 | 3 | 57.4 | 55.9 | 12 / 35 | 3466 |
| 5 | 2 | 60.2 | 66.3 | 14 / 35 | 3346 |
| 6 | 1 | 61.7 | 71.1 | 16 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 71% |
| dummy.micro.Sparrow 2.5 | 20 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 77% |
| bvh.micro.Freya 0.3 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 4 | 50% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 25 | 19% | 25 |
| voidious.micro.BlitzBat 1.05 | 23 | 17% | 53 |
| dl.BetterWalls 1.0 | 21 | 16% | 24 |
| dummy.micro.Sparrow 2.5 | 18 | 14% | 37 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 14% | 36 |
| bvh.micro.Freya 0.3 | 10 | 8% | 15 |
| conscience.Electron 1.3g | 9 | 7% | 11 |
| stelo.MirrorMicro 1.0 | 7 | 5% | 9 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.3 | 94 / 210 | 3.68 | 15.9% | 26917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.3 | 17.1% | 47 |
| hadur117.micro.SaorOG2 0.1 | 1.7 | 15.9% | 94 |
| sul.Lunar 1.1 | 3.3 | 12.3% | 27 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.6% | 16 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.6% | 6 |
| dsw.StaticD 1.0 | 6.2 | 8.3% | 5 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.5% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 7 |
| sample.Corners 1.0 | 9.0 | 5.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 71.1 | 15 / 35 | 4156 |
| 2 | 2 | 60.9 | 61.9 | 12 / 35 | 4230 |
| 3 | 1 | 65.2 | 73.0 | 18 / 35 | 4524 |
| 4 | 2 | 65.3 | 71.7 | 16 / 35 | 4946 |
| 5 | 1 | 66.6 | 78.7 | 19 / 35 | 4709 |
| 6 | 2 | 62.8 | 65.1 | 14 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 78% |
| sul.Lunar 1.1 | 29 | 86% |
| supersample.SuperBoxBot 1.0 | 13 | 100% |
| dsw.StaticD 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| sample.MyFirstRobot 1.0 | 3 | 33% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 42% | 87 |
| supersample.SuperBoxBot 1.0 | 19 | 16% | 25 |
| mme.NikeEnhanced 2.0 | 14 | 12% | 18 |
| sample.Corners 1.0 | 10 | 9% | 12 |
| sul.Lunar 1.1 | 9 | 8% | 39 |
| sample.MyFirstRobot 1.0 | 6 | 5% | 9 |
| dsw.StaticD 1.0 | 4 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.4 | 68 / 210 | 3.84 | 14.7% | 27510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 14.7% | 68 |
| radnor.DoctorBob 1.42 | 1.7 | 13.9% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.2% | 26 |
| mld.Wisdom 1.0 | 3.8 | 12.2% | 22 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 10 |
| amz.NanoClone 1.41 | 5.5 | 10.5% | 13 |
| sample.Walls 1.0 | 7.0 | 8.5% | 12 |
| jangs.ns51 1.0 | 8.0 | 6.9% | 11 |
| GarmBox.Oranges 1.0 | 8.7 | 6.7% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 67.3 | 10 / 35 | 4959 |
| 2 | 2 | 60.9 | 65.1 | 12 / 35 | 4169 |
| 3 | 1 | 64.8 | 78.1 | 16 / 35 | 4933 |
| 4 | 1 | 63.6 | 72.7 | 12 / 35 | 4877 |
| 5 | 2 | 59.9 | 63.8 | 9 / 35 | 4119 |
| 6 | 2 | 60.1 | 63.5 | 9 / 35 | 4453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 26 | 65% |
| radnor.DoctorBob 1.42 | 21 | 52% |
| mld.Wisdom 1.0 | 14 | 93% |
| jangs.ns51 1.0 | 10 | 60% |
| sample.Walls 1.0 | 10 | 70% |
| amz.NanoClone 1.41 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| GarmBox.Oranges 1.0 | 3 | 33% |
| sample.Target 1.0 | 2 | 50% |

Hadur died in 142 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 24% | 54 |
| radnor.DoctorBob 1.42 | 34 | 24% | 49 |
| mld.Wisdom 1.0 | 21 | 15% | 39 |
| KiraNL.Chupacabra 0.4 | 17 | 12% | 24 |
| jangs.ns51 1.0 | 10 | 7% | 13 |
| amz.NanoClone 1.41 | 9 | 6% | 13 |
| sample.Walls 1.0 | 8 | 6% | 11 |
| GarmBox.Oranges 1.0 | 6 | 4% | 5 |
| sample.Target 1.0 | 3 | 2% | 0 |

