# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.9 | 136 / 210 | 2.18 | 20.6% | 42082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 20.6% | 136 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 22 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 23 |
| mld.Infinity 2.2 | 3.7 | 12.8% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 5 |
| sample.Walls 1.0 | 6.5 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 91.4 | 26 / 35 | 7353 |
| 2 | 1 | 71.8 | 86.3 | 23 / 35 | 7412 |
| 3 | 1 | 71.1 | 87.6 | 24 / 35 | 6636 |
| 4 | 1 | 70.3 | 84.1 | 18 / 35 | 6840 |
| 5 | 1 | 68.5 | 80.0 | 17 / 35 | 6306 |
| 6 | 1 | 73.0 | 92.1 | 28 / 35 | 7535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 83% |
| mld.Infinity 2.2 | 42 | 95% |
| radnor.DoctorBob 1.42 | 35 | 80% |
| amz.NanoClone 1.41 | 5 | 80% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 47% | 72 |
| mz.AntiGrav 1.0 | 15 | 20% | 57 |
| amz.NanoClone 1.41 | 9 | 12% | 16 |
| mld.Infinity 2.2 | 7 | 9% | 43 |
| sample.Walls 1.0 | 3 | 4% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.8 | 124 / 210 | 2.19 | 18.7% | 31587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.7% | 124 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 47 |
| mld.DustBunny 3.8 | 3.5 | 13.1% | 20 |
| maribo.melee.BMV 0.1 | 3.7 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.0% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 6.7% | 2 |
| bzdp.BoxCar 2.0 | 8.3 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.6 | 26 / 35 | 5123 |
| 2 | 1 | 67.3 | 84.1 | 20 / 35 | 5507 |
| 3 | 1 | 65.5 | 76.5 | 15 / 35 | 5037 |
| 4 | 1 | 69.9 | 91.1 | 21 / 35 | 5611 |
| 5 | 1 | 69.1 | 89.5 | 22 / 35 | 5212 |
| 6 | 1 | 69.0 | 90.8 | 20 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 69% |
| mld.DustBunny 3.8 | 53 | 79% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| zyx.nano.Ant 1.1 | 8 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 33% | 74 |
| mld.DustBunny 3.8 | 28 | 32% | 62 |
| maribo.melee.BMV 0.1 | 9 | 10% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 16 |
| zyx.nano.Ant 1.1 | 5 | 6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 15 |
| fullsail.SweetTea 1.1 | 4 | 5% | 15 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.0 | 113 / 210 | 2.62 | 18.8% | 35514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.8% | 113 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.9% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.9% | 22 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.3% | 15 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 7 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.7% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 2 |
| sample.Fire 1.0 | 9.0 | 5.1% | 1 |
| sample.Tracker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.6 | 21 / 35 | 6008 |
| 2 | 1 | 69.4 | 85.4 | 18 / 35 | 6118 |
| 3 | 1 | 66.4 | 74.0 | 12 / 35 | 6056 |
| 4 | 1 | 67.4 | 79.4 | 19 / 35 | 5564 |
| 5 | 1 | 68.9 | 81.6 | 22 / 35 | 5766 |
| 6 | 1 | 69.1 | 84.1 | 21 / 35 | 6002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 67% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| myl.nano.KomoriNinja 1.1 | 18 | 83% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 3 | 33% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 26 | 27% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 23% | 43 |
| fm.mammillarias 1.3 | 16 | 16% | 17 |
| cb.nano.Insomnia 1.0 | 12 | 12% | 16 |
| myl.nano.KomoriNinja 1.1 | 11 | 11% | 27 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 16 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 10 |
| sample.Fire 1.0 | 1 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.6 | 146 / 210 | 1.85 | 21.1% | 40441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 21.1% | 146 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.7% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.2% | 23 |
| yk.JahMicro 1.0 | 5.5 | 8.6% | 4 |
| tj.zombie1n 1.0.1 | 5.7 | 8.8% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.7% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 85.1 | 22 / 35 | 6624 |
| 2 | 1 | 71.2 | 92.4 | 24 / 35 | 6789 |
| 3 | 1 | 72.0 | 93.3 | 26 / 35 | 6842 |
| 4 | 1 | 70.3 | 89.5 | 24 / 35 | 6409 |
| 5 | 1 | 70.8 | 89.8 | 25 / 35 | 6597 |
| 6 | 1 | 72.3 | 93.3 | 25 / 35 | 7180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 97% |
| stelo.SoJNanoMelee 1.1 | 41 | 78% |
| tj.zombie1n 1.0.1 | 19 | 74% |
| tvv.micro.Antares 1.1.1 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 30% | 91 |
| stelo.SoJNanoMelee 1.1 | 18 | 28% | 38 |
| tj.zombie1n 1.0.1 | 9 | 14% | 13 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 7 |
| yk.JahMicro 1.0 | 2 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.7 | 88 / 210 | 3.37 | 16.6% | 31112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 16.6% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 39 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 38 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.1% | 17 |
| sam.Samspin 1.0 | 6.0 | 9.4% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.1% | 7 |
| EBBU.Sim2 1.02 | 6.3 | 9.3% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.0% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.6 | 11 / 35 | 5023 |
| 2 | 1 | 65.5 | 76.2 | 17 / 35 | 5318 |
| 3 | 1 | 65.3 | 74.0 | 19 / 35 | 4834 |
| 4 | 1 | 63.0 | 68.9 | 11 / 35 | 5261 |
| 5 | 1 | 66.3 | 81.0 | 15 / 35 | 5235 |
| 6 | 1 | 64.9 | 73.3 | 15 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 53% |
| simonton.nano.MeleeSeed 1.8 | 26 | 92% |
| ahf.NanoAndrew .4 | 23 | 78% |
| sam.Samspin 1.0 | 10 | 80% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| EBBU.Sim2 1.02 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 24% | 45 |
| ahf.NanoAndrew .4 | 25 | 20% | 48 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 35 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 19 |
| EBBU.Sim2 1.02 | 12 | 10% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 13 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 12 |
| sam.Samspin 1.0 | 7 | 6% | 16 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.7 | 128 / 210 | 2.47 | 18.6% | 31578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.6% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 16 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 7 |
| fm.claire 1.7 | 6.0 | 8.2% | 2 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 3 |
| pa.Improved 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.7 | 22 / 35 | 5647 |
| 2 | 1 | 65.4 | 79.7 | 16 / 35 | 4628 |
| 3 | 1 | 69.7 | 90.8 | 24 / 35 | 5331 |
| 4 | 1 | 68.9 | 87.6 | 23 / 35 | 5308 |
| 5 | 1 | 67.1 | 80.6 | 19 / 35 | 5245 |
| 6 | 1 | 68.5 | 83.8 | 24 / 35 | 5419 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 76% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| gh.nano.Grofvuil 0.2 | 16 | 81% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 39% | 83 |
| gh.nano.Grofvuil 0.2 | 15 | 18% | 32 |
| oog.melee.CapuletDroid 1.1 | 14 | 17% | 49 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 14 |
| fm.claire 1.7 | 8 | 10% | 13 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 9 |
| sample.SpinBot 1.0 | 2 | 2% | 3 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.8 | 116 / 210 | 2.55 | 18.7% | 35734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.7% | 116 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 26 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 28 |
| mz.MicroGodMelee 1 | 3.8 | 13.0% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 3 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.5 | 19 / 35 | 5856 |
| 2 | 1 | 70.2 | 89.8 | 23 / 35 | 6032 |
| 3 | 1 | 69.6 | 85.7 | 20 / 35 | 6280 |
| 4 | 1 | 69.6 | 84.1 | 23 / 35 | 6325 |
| 5 | 1 | 66.5 | 75.6 | 18 / 35 | 5546 |
| 6 | 1 | 66.5 | 78.7 | 13 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 89% |
| mz.MicroGodMelee 1 | 43 | 79% |
| gh.micro.Gruweltje 0.7 | 19 | 68% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 31 | 33% | 50 |
| mz.MicroGodMelee 1 | 27 | 28% | 57 |
| spinnercat.micro.Tyger 0.1 | 19 | 20% | 64 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 10 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 11 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 6 |

## Melee bench: F08

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.9 | 102 / 210 | 3.35 | 16.8% | 33012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.2 | 16.8% | 102 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 16.0% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 9.8% | 6 |
| germ.TheMind .2 | 5.2 | 9.4% | 6 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.2% | 6 |
| awesomeness.Elite 1.0 | 7.2 | 7.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.7% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.0 | 19 / 35 | 5823 |
| 2 | 2 | 62.2 | 64.8 | 11 / 35 | 5219 |
| 3 | 1 | 62.5 | 65.1 | 15 / 35 | 5203 |
| 4 | 1 | 68.4 | 86.0 | 21 / 35 | 5391 |
| 5 | 1 | 66.0 | 73.7 | 18 / 35 | 5718 |
| 6 | 1 | 65.5 | 72.7 | 18 / 35 | 5658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 77% |
| germ.TheMind .2 | 8 | 88% |
| sample.Crazy 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 37% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 21% | 42 |
| germ.TheMind .2 | 16 | 15% | 28 |
| qualidafial.MajorDick 1.0.1 | 11 | 10% | 12 |
| awesomeness.Elite 1.0 | 7 | 6% | 8 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 11 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.5 | 145 / 210 | 2.22 | 19.4% | 30151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 19.4% | 145 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 12 |
| maribo.IotaCT 1.1 | 4.3 | 10.7% | 9 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.8% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.7% | 3 |
| ratosh.Wesco 1.4 | 7.2 | 8.5% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 11 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.7 | 22 / 35 | 5489 |
| 2 | 1 | 70.2 | 89.5 | 26 / 35 | 4969 |
| 3 | 1 | 69.9 | 87.6 | 26 / 35 | 5115 |
| 4 | 1 | 70.0 | 88.3 | 25 / 35 | 5140 |
| 5 | 1 | 68.8 | 82.5 | 24 / 35 | 4811 |
| 6 | 1 | 68.1 | 85.1 | 22 / 35 | 4627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| maribo.IotaCT 1.1 | 12 | 100% |
| stelo.PatternRobot 1.0 | 10 | 70% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 20% | 68 |
| nz.jdc.nano.GridFu 1.0 | 12 | 18% | 51 |
| timmit.nano.TimDog 0.33 | 11 | 17% | 27 |
| stelo.PatternRobot 1.0 | 11 | 17% | 17 |
| maribo.IotaCT 1.1 | 6 | 9% | 18 |
| ratosh.Wesco 1.4 | 6 | 9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 9% | 12 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 153 / 210 | 1.89 | 20.5% | 37422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 20.5% | 153 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.0% | 22 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 7 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 3 |
| zyx.micro.Ant 1.1 | 5.3 | 9.9% | 16 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.5% | 0 |
| sanja.First 0.1 | 6.8 | 8.2% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 8.5 | 6.9% | 6 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 24 / 35 | 6367 |
| 2 | 1 | 70.5 | 91.4 | 26 / 35 | 5982 |
| 3 | 1 | 70.1 | 87.3 | 26 / 35 | 6393 |
| 4 | 1 | 70.9 | 92.1 | 28 / 35 | 6337 |
| 5 | 1 | 70.1 | 89.2 | 23 / 35 | 6202 |
| 6 | 1 | 70.1 | 89.8 | 26 / 35 | 6141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 36 | 94% |
| tvv.nano.Polaris 1.2 | 36 | 83% |
| cvt.Firsty 1.0 | 22 | 91% |
| zyx.micro.Ant 1.1 | 21 | 67% |
| sanja.First 0.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 20 | 35% | 39 |
| tvv.nano.Polaris 1.2 | 14 | 25% | 55 |
| Grystrion.TrackerWO 1.0 | 8 | 14% | 22 |
| baal.nano.N 1.42 | 5 | 9% | 33 |
| cvt.Firsty 1.0 | 5 | 9% | 24 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 6 |
| sanja.First 0.1 | 1 | 2% | 21 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |

## Melee bench: F11

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.7 | 79 / 210 | 3.90 | 15.1% | 30400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.6% | 65 |
| hadur117.micro.SaorW26 0.1 | 1.7 | 15.1% | 79 |
| cs.Wren 1.0 | 3.0 | 13.1% | 24 |
| js.PinBall 1.6 | 4.5 | 10.9% | 11 |
| mz.Cork 0.1 | 4.7 | 10.8% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.4% | 7 |
| evd.X1 0.01 | 6.7 | 8.1% | 4 |
| jsal.Jsalbot 1.0 | 8.5 | 6.2% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 70.8 | 16 / 35 | 5298 |
| 2 | 2 | 64.2 | 72.4 | 15 / 35 | 5071 |
| 3 | 2 | 62.9 | 68.6 | 15 / 35 | 4926 |
| 4 | 1 | 61.9 | 64.8 | 13 / 35 | 5119 |
| 5 | 2 | 61.7 | 63.2 | 11 / 35 | 5042 |
| 6 | 2 | 61.9 | 66.7 | 9 / 35 | 4944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 66% |
| cs.Wren 1.0 | 22 | 82% |
| js.PinBall 1.6 | 10 | 100% |
| mz.Cork 0.1 | 8 | 75% |
| donjezza.Jezza 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 132 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 44% | 103 |
| cs.Wren 1.0 | 22 | 17% | 35 |
| joe.ADinosaur 1.0 | 14 | 11% | 15 |
| mz.Cork 0.1 | 12 | 9% | 20 |
| evd.X1 0.01 | 10 | 8% | 11 |
| js.PinBall 1.6 | 9 | 7% | 18 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.5 | 114 / 210 | 2.84 | 17.9% | 29350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.9% | 114 |
| ntc.Opposite 1.5 | 3.2 | 11.4% | 15 |
| myl.nano.Graviton 1.10 | 3.2 | 11.5% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.1% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.6% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.9% | 9 |
| disan.Chair 2.2.0 | 6.8 | 8.4% | 13 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 21 / 35 | 5313 |
| 2 | 1 | 66.7 | 79.4 | 18 / 35 | 5123 |
| 3 | 1 | 65.3 | 75.2 | 17 / 35 | 4600 |
| 4 | 1 | 64.1 | 72.7 | 16 / 35 | 4441 |
| 5 | 1 | 64.9 | 76.2 | 16 / 35 | 4536 |
| 6 | 1 | 69.6 | 86.7 | 26 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 76% |
| myl.nano.Graviton 1.10 | 27 | 89% |
| ntc.Opposite 1.5 | 17 | 76% |
| DBall.NUKE 0.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 32 | 33% | 44 |
| myl.nano.Graviton 1.10 | 15 | 15% | 43 |
| stelo.AreaTargetingBot 1.1 | 15 | 15% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 17 |
| disan.Chair 2.2.0 | 10 | 10% | 18 |
| ntc.Opposite 1.5 | 7 | 7% | 23 |
| pbg.R2D2 1.0 | 3 | 3% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 11 |
| DBall.NUKE 0.1 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 63.9 | 64 / 210 | 4.25 | 14.1% | 26397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.2 | 14.4% | 49 |
| hadur117.micro.SaorW26 0.1 | 2.3 | 14.1% | 64 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 43 |
| yagami.Tidus 0.11 | 3.8 | 12.4% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.3% | 28 |
| ejb.Polaris 1.0.1 | 5.5 | 11.5% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 68.3 | 12 / 35 | 4113 |
| 2 | 2 | 62.7 | 65.7 | 11 / 35 | 4457 |
| 3 | 1 | 63.0 | 69.2 | 10 / 35 | 4457 |
| 4 | 3 | 57.9 | 52.7 | 9 / 35 | 4306 |
| 5 | 1 | 64.7 | 70.5 | 14 / 35 | 4963 |
| 6 | 5 | 59.0 | 57.1 | 8 / 35 | 4101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 22 | 50% |
| yagami.Tidus 0.11 | 19 | 79% |
| kawigi.micro.Shiz 1.1 | 17 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 94% |
| ejb.Polaris 1.0.1 | 7 | 43% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 43% | 74 |
| yagami.Tidus 0.11 | 29 | 20% | 41 |
| ejb.Polaris 1.0.1 | 21 | 14% | 28 |
| kawigi.micro.Shiz 1.1 | 14 | 10% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 6% | 27 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.8 | 123 / 210 | 3.00 | 17.2% | 28183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.2% | 123 |
| wee.Gem 1.8.4 | 3.0 | 11.6% | 24 |
| wompi.Quokka 1.6 | 3.2 | 11.6% | 12 |
| bzdp.Pansy 2.1 | 3.2 | 12.3% | 21 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.3% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 74.9 | 20 / 35 | 4224 |
| 2 | 1 | 65.3 | 77.8 | 19 / 35 | 4494 |
| 3 | 1 | 65.6 | 79.0 | 19 / 35 | 4458 |
| 4 | 1 | 66.2 | 78.1 | 21 / 35 | 4800 |
| 5 | 1 | 67.1 | 80.3 | 23 / 35 | 5148 |
| 6 | 1 | 65.9 | 76.5 | 21 / 35 | 5059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| wee.Gem 1.8.4 | 33 | 100% |
| wompi.Quokka 1.6 | 24 | 92% |
| ratosh.Nobo 0.21 | 14 | 79% |
| m3thos.Eva00 1.1 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 17% | 53 |
| wompi.Quokka 1.6 | 11 | 13% | 26 |
| bayen.UbaMicro 1.4 | 11 | 13% | 17 |
| m3thos.Eva00 1.1 | 10 | 11% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 11% | 12 |
| maribo.FollowFire 1 | 9 | 10% | 8 |
| ratosh.Nobo 0.21 | 8 | 9% | 19 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 9 |
| wee.Gem 1.8.4 | 6 | 7% | 42 |

## Melee bench: F15

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 84.4 | 108 / 210 | 2.40 | 19.8% | 43146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.3 | 19.8% | 108 |
| wompi.Wallaby 5.1 | 1.7 | 18.7% | 80 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 16 |
| ayk.WallHugger 1.0 | 4.3 | 10.1% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 90.5 | 20 / 35 | 7542 |
| 2 | 1 | 72.1 | 88.9 | 18 / 35 | 7759 |
| 3 | 1 | 71.3 | 85.4 | 19 / 35 | 7146 |
| 4 | 2 | 69.2 | 81.0 | 14 / 35 | 6663 |
| 5 | 1 | 71.4 | 84.4 | 21 / 35 | 7073 |
| 6 | 2 | 68.7 | 76.5 | 16 / 35 | 6963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 73% |
| mz.NanoGod 2.02 | 19 | 74% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 52 | 50% | 130 |
| mz.NanoGod 2.02 | 32 | 31% | 45 |
| exauge.GateKeeper 1.1.121g | 9 | 9% | 16 |
| ayk.WallHugger 1.0 | 7 | 7% | 10 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.6 | 107 / 210 | 3.10 | 17.1% | 30156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.1% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 22 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 20 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 1 |
| ap.Frederick 1.1 | 8.2 | 6.8% | 7 |
| dl.BetterWalls 1.0 | 9.2 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.5 | 15 / 35 | 5716 |
| 2 | 1 | 65.9 | 77.8 | 21 / 35 | 4909 |
| 3 | 1 | 62.9 | 67.9 | 16 / 35 | 4568 |
| 4 | 1 | 67.3 | 83.5 | 21 / 35 | 4910 |
| 5 | 1 | 66.8 | 81.0 | 18 / 35 | 5158 |
| 6 | 1 | 64.1 | 72.1 | 16 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 79% |
| dummy.micro.Sparrow 2.5 | 26 | 77% |
| bvh.micro.Freya 0.3 | 22 | 73% |
| stelo.MirrorMicro 1.0 | 5 | 80% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 103 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 19 | 18% | 36 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 17% | 47 |
| conscience.Electron 1.3g | 14 | 14% | 18 |
| bvh.micro.Freya 0.3 | 13 | 13% | 19 |
| dl.BetterWalls 1.0 | 10 | 10% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 10 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 10 |

## Melee bench: F17

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.8 | 145 / 210 | 2.01 | 21.4% | 43945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 21.4% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.1% | 6 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.2% | 17 |
| dsw.StaticD 1.0 | 5.0 | 9.1% | 9 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 4 |
| sample.Corners 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.4 | 28 / 35 | 7737 |
| 2 | 1 | 71.2 | 90.2 | 25 / 35 | 6801 |
| 3 | 1 | 69.7 | 81.9 | 22 / 35 | 6795 |
| 4 | 1 | 71.4 | 88.9 | 21 / 35 | 7694 |
| 5 | 1 | 70.8 | 85.1 | 22 / 35 | 7317 |
| 6 | 1 | 73.1 | 94.3 | 27 / 35 | 7601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 85% |
| sul.Lunar 1.1 | 44 | 100% |
| supersample.SuperBoxBot 1.0 | 21 | 90% |
| dsw.StaticD 1.0 | 16 | 50% |
| mme.NikeEnhanced 2.0 | 15 | 80% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 32% | 35 |
| dsw.StaticD 1.0 | 15 | 23% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 22% | 54 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 16 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 5 |
| sul.Lunar 1.1 | 1 | 2% | 46 |
| sample.Corners 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.0 | 97 / 210 | 3.25 | 17.1% | 36552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.1% | 97 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 34 |
| mld.Wisdom 1.0 | 3.3 | 12.4% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.7% | 31 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 8 |
| sample.Walls 1.0 | 7.2 | 8.2% | 9 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 78.1 | 14 / 35 | 5892 |
| 2 | 1 | 66.1 | 73.7 | 15 / 35 | 6505 |
| 3 | 1 | 66.2 | 75.9 | 15 / 35 | 5967 |
| 4 | 1 | 66.9 | 76.5 | 21 / 35 | 5898 |
| 5 | 1 | 65.1 | 73.0 | 14 / 35 | 5988 |
| 6 | 1 | 65.9 | 73.0 | 18 / 35 | 6302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 76% |
| radnor.DoctorBob 1.42 | 30 | 77% |
| mld.Wisdom 1.0 | 16 | 69% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| sample.Walls 1.0 | 12 | 100% |
| amz.NanoClone 1.41 | 8 | 75% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 30% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 24% | 57 |
| radnor.DoctorBob 1.42 | 18 | 16% | 43 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 31 |
| amz.NanoClone 1.41 | 6 | 5% | 10 |
| GarmBox.Oranges 1.0 | 6 | 5% | 7 |
| jangs.ns51 1.0 | 4 | 4% | 7 |
| sample.Walls 1.0 | 2 | 2% | 9 |

