# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.5 | 158 / 210 | 1.94 | 21.7% | 42944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.7% | 158 |
| mz.AntiGrav 1.0 | 2.2 | 14.5% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 14 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 2 |
| sample.Walls 1.0 | 6.7 | 6.9% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 89.8 | 24 / 35 | 7290 |
| 2 | 1 | 72.6 | 91.7 | 28 / 35 | 6874 |
| 3 | 1 | 71.0 | 83.5 | 24 / 35 | 7037 |
| 4 | 1 | 73.3 | 94.3 | 29 / 35 | 7243 |
| 5 | 1 | 72.8 | 88.3 | 25 / 35 | 7339 |
| 6 | 1 | 72.9 | 89.5 | 28 / 35 | 7161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 86 | 93% |
| radnor.DoctorBob 1.42 | 37 | 89% |
| mld.Infinity 2.2 | 29 | 97% |
| amz.NanoClone 1.41 | 9 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 20 | 38% | 82 |
| radnor.DoctorBob 1.42 | 12 | 23% | 56 |
| mld.Infinity 2.2 | 6 | 12% | 39 |
| amz.NanoClone 1.41 | 6 | 12% | 19 |
| jangs.ns51 1.0 | 4 | 8% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 1 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| sample.Walls 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.9 | 126 / 210 | 2.45 | 18.6% | 31845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.3 | 18.6% | 126 |
| mld.DustBunny 3.8 | 2.2 | 14.6% | 24 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.2% | 45 |
| maribo.melee.BMV 0.1 | 4.2 | 10.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.7% | 6 |
| zyx.nano.Ant 1.1 | 5.8 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 6 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 1 |
| bzdp.BoxCar 2.0 | 9.0 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.5 | 24 / 35 | 5933 |
| 2 | 1 | 69.8 | 90.8 | 25 / 35 | 5251 |
| 3 | 1 | 69.1 | 87.9 | 22 / 35 | 5211 |
| 4 | 1 | 69.4 | 89.8 | 25 / 35 | 5457 |
| 5 | 1 | 70.5 | 92.7 | 23 / 35 | 5587 |
| 6 | 3 | 58.6 | 52.7 | 7 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 84% |
| oog.melee.Mercutio 1.0 | 45 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| fullsail.SweetTea 1.1 | 9 | 100% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 28 | 33% | 80 |
| oog.melee.Mercutio 1.0 | 20 | 24% | 57 |
| maribo.melee.BMV 0.1 | 7 | 8% | 15 |
| zyx.nano.Ant 1.1 | 7 | 8% | 9 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| fullsail.SweetTea 1.1 | 5 | 6% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 80.4 | 124 / 210 | 2.77 | 19.3% | 36627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.3% | 124 |
| myl.micro.Troodon 1.10 | 2.2 | 14.4% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.3% | 25 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 5 |
| fm.mammillarias 1.3 | 5.8 | 9.3% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 76.5 | 19 / 35 | 6029 |
| 2 | 1 | 66.2 | 72.1 | 18 / 35 | 5529 |
| 3 | 1 | 69.7 | 81.9 | 18 / 35 | 6545 |
| 4 | 1 | 70.4 | 86.3 | 22 / 35 | 5897 |
| 5 | 1 | 70.0 | 80.3 | 22 / 35 | 6345 |
| 6 | 1 | 70.3 | 85.1 | 25 / 35 | 6282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 71% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| fm.mammillarias 1.3 | 8 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 75% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 30% | 50 |
| myl.micro.Troodon 1.10 | 22 | 26% | 76 |
| cb.nano.Insomnia 1.0 | 11 | 13% | 16 |
| fm.mammillarias 1.3 | 8 | 9% | 13 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 26 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 15 |
| sample.Fire 1.0 | 3 | 3% | 6 |
| sample.Tracker 1.0 | 3 | 3% | 2 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 88.1 | 153 / 210 | 2.07 | 20.8% | 39657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.8% | 153 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.4% | 20 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.5% | 12 |
| tj.zombie1n 1.0.1 | 5.0 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.9% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.7% | 11 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.6% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 85.7 | 27 / 35 | 6276 |
| 2 | 1 | 71.0 | 88.3 | 23 / 35 | 6813 |
| 3 | 1 | 70.1 | 82.5 | 24 / 35 | 6654 |
| 4 | 1 | 71.5 | 92.1 | 28 / 35 | 6475 |
| 5 | 1 | 72.5 | 94.3 | 28 / 35 | 7208 |
| 6 | 1 | 69.5 | 85.7 | 23 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 79 | 91% |
| stelo.SoJNanoMelee 1.1 | 36 | 89% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 77% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 42% | 106 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 25 |
| tj.zombie1n 1.0.1 | 9 | 16% | 14 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 4 |
| yk.JahMicro 1.0 | 2 | 4% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 63.9 | 84 / 210 | 4.25 | 14.9% | 27299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 14.9% | 84 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 34 |
| ahf.NanoAndrew .4 | 3.3 | 11.8% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.5% | 25 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.8% | 11 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 66.3 | 14 / 35 | 4440 |
| 2 | 1 | 63.8 | 67.9 | 17 / 35 | 4665 |
| 3 | 1 | 60.3 | 60.3 | 12 / 35 | 4601 |
| 4 | 1 | 65.2 | 73.3 | 15 / 35 | 5032 |
| 5 | 1 | 61.2 | 61.3 | 17 / 35 | 4347 |
| 6 | 1 | 58.0 | 54.0 | 9 / 35 | 4214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 100% |
| oog.melee.Corsair 1.0 | 28 | 61% |
| ahf.NanoAndrew .4 | 19 | 89% |
| sam.Samspin 1.0 | 10 | 80% |
| robar.nano.Assertive_Melee 0.2 | 9 | 78% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| EBBU.Sim2 1.02 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 20% | 43 |
| oog.melee.Corsair 1.0 | 22 | 17% | 43 |
| robar.nano.Assertive_Melee 0.2 | 20 | 16% | 25 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 17 |
| EBBU.Sim2 1.02 | 13 | 10% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 13 |
| ahf.NanoAndrew .4 | 10 | 8% | 30 |
| sam.Samspin 1.0 | 6 | 5% | 15 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.7 | 135 / 210 | 2.38 | 19.2% | 33001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.2% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.7% | 14 |
| fm.claire 1.7 | 5.3 | 9.1% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 9.1% | 6 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.7% | 5 |
| sample.SpinBot 1.0 | 8.0 | 6.7% | 2 |
| pa.Improved 1.0 | 8.8 | 5.7% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.8 | 23 / 35 | 5484 |
| 2 | 1 | 66.9 | 79.0 | 20 / 35 | 5060 |
| 3 | 1 | 67.3 | 80.6 | 21 / 35 | 5017 |
| 4 | 1 | 69.6 | 86.7 | 23 / 35 | 5723 |
| 5 | 1 | 70.1 | 89.2 | 24 / 35 | 5783 |
| 6 | 1 | 70.2 | 88.9 | 24 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 85% |
| oog.melee.CapuletDroid 1.1 | 25 | 100% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| arthord.NanoSatanMelee Beta | 13 | 85% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 40% | 91 |
| gh.nano.Grofvuil 0.2 | 13 | 17% | 26 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 40 |
| fm.claire 1.7 | 7 | 9% | 13 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 11 |
| sample.SpinBot 1.0 | 4 | 5% | 5 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 16 |
| pa.Improved 1.0 | 2 | 3% | 5 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.0 | 110 / 210 | 2.53 | 18.5% | 33970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 110 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.8% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 29 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.3 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 79.7 | 17 / 35 | 6221 |
| 2 | 1 | 66.6 | 78.7 | 17 / 35 | 5226 |
| 3 | 1 | 67.7 | 83.2 | 17 / 35 | 5162 |
| 4 | 1 | 67.3 | 78.7 | 18 / 35 | 5510 |
| 5 | 1 | 70.1 | 90.5 | 21 / 35 | 5893 |
| 6 | 1 | 69.3 | 87.0 | 20 / 35 | 5958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 88% |
| mz.MicroGodMelee 1 | 34 | 68% |
| gh.micro.Gruweltje 0.7 | 32 | 63% |
| el.JumpShoot 0.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 31% | 53 |
| gh.micro.Gruweltje 0.7 | 29 | 29% | 53 |
| spinnercat.micro.Tyger 0.1 | 21 | 21% | 68 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 7 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.4 | 109 / 210 | 3.39 | 17.0% | 31593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.0% | 109 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.9% | 7 |
| germ.TheMind .2 | 5.5 | 9.1% | 4 |
| awesomeness.Elite 1.0 | 5.8 | 8.9% | 12 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 66.0 | 15 / 35 | 4727 |
| 2 | 1 | 67.3 | 78.7 | 19 / 35 | 5361 |
| 3 | 1 | 70.2 | 87.6 | 25 / 35 | 5841 |
| 4 | 1 | 64.6 | 70.8 | 14 / 35 | 5320 |
| 5 | 1 | 65.1 | 71.7 | 20 / 35 | 5042 |
| 6 | 1 | 63.7 | 65.7 | 16 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 84 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 100% |
| germ.TheMind .2 | 14 | 93% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 101 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 47% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 15% | 33 |
| germ.TheMind .2 | 11 | 11% | 20 |
| awesomeness.Elite 1.0 | 10 | 10% | 18 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 11 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.3 | 155 / 210 | 1.97 | 20.4% | 31900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.4% | 155 |
| rz.HawkOnFire 0.1 | 2.0 | 14.2% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 10 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.2% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.0% | 2 |
| ratosh.Wesco 1.4 | 6.5 | 8.4% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 7.6% | 2 |
| spinnercat.Omen 1.0 | 8.8 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.3 | 25 / 35 | 4972 |
| 2 | 1 | 70.2 | 84.4 | 25 / 35 | 5144 |
| 3 | 1 | 71.2 | 89.5 | 25 / 35 | 5365 |
| 4 | 1 | 70.4 | 88.9 | 26 / 35 | 5268 |
| 5 | 1 | 72.1 | 93.3 | 28 / 35 | 5930 |
| 6 | 1 | 71.0 | 91.1 | 26 / 35 | 5221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 93% |
| nz.jdc.nano.GridFu 1.0 | 38 | 97% |
| timmit.nano.TimDog 0.33 | 12 | 75% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| ratosh.Wesco 1.4 | 10 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| maribo.IotaCT 1.1 | 4 | 50% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 27% | 74 |
| ratosh.Wesco 1.4 | 8 | 15% | 19 |
| stelo.PatternRobot 1.0 | 8 | 15% | 15 |
| maribo.IotaCT 1.1 | 7 | 13% | 14 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 55 |
| timmit.nano.TimDog 0.33 | 5 | 9% | 17 |
| spinnercat.Omen 1.0 | 4 | 7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.5 | 179 / 210 | 1.77 | 21.6% | 39842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.6% | 179 |
| baal.nano.N 1.42 | 2.3 | 12.2% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.1% | 11 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 4 |
| Grystrion.TrackerWO 1.0 | 5.7 | 8.5% | 1 |
| sanja.First 0.1 | 6.2 | 8.4% | 1 |
| cvt.Firsty 1.0 | 7.3 | 7.6% | 7 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.7% | 1 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 94.3 | 31 / 35 | 7413 |
| 2 | 1 | 71.2 | 90.5 | 29 / 35 | 6680 |
| 3 | 1 | 70.7 | 87.9 | 28 / 35 | 6406 |
| 4 | 1 | 72.3 | 93.0 | 31 / 35 | 6784 |
| 5 | 1 | 71.2 | 92.4 | 29 / 35 | 6326 |
| 6 | 1 | 71.3 | 90.8 | 31 / 35 | 6233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 96% |
| baal.nano.N 1.42 | 43 | 100% |
| cvt.Firsty 1.0 | 32 | 94% |
| zyx.micro.Ant 1.1 | 23 | 91% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 5 | 16% | 55 |
| zyx.micro.Ant 1.1 | 5 | 16% | 30 |
| Grystrion.TrackerWO 1.0 | 5 | 16% | 14 |
| baal.nano.N 1.42 | 4 | 13% | 44 |
| cvt.Firsty 1.0 | 4 | 13% | 31 |
| squidM.TentalceMeleeNano 1.1 | 3 | 10% | 8 |
| sanja.First 0.1 | 2 | 6% | 20 |
| sample.RamFire 1.0 | 2 | 6% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.5 | 93 / 210 | 3.47 | 16.3% | 31599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 16.3% | 93 |
| kc.micro.Figment 1.0 | 2.2 | 14.6% | 56 |
| cs.Wren 1.0 | 3.2 | 12.6% | 24 |
| mz.Cork 0.1 | 4.0 | 11.4% | 10 |
| js.PinBall 1.6 | 4.8 | 11.2% | 16 |
| joe.ADinosaur 1.0 | 5.7 | 9.6% | 4 |
| evd.X1 0.01 | 7.0 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.1 | 17 / 35 | 5449 |
| 2 | 1 | 65.2 | 71.4 | 18 / 35 | 5177 |
| 3 | 1 | 64.9 | 73.3 | 16 / 35 | 5092 |
| 4 | 1 | 63.5 | 70.8 | 13 / 35 | 4943 |
| 5 | 1 | 65.9 | 78.1 | 17 / 35 | 5497 |
| 6 | 2 | 62.8 | 63.5 | 12 / 35 | 5441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 69% |
| cs.Wren 1.0 | 25 | 80% |
| mz.Cork 0.1 | 12 | 100% |
| js.PinBall 1.6 | 9 | 78% |
| joe.ADinosaur 1.0 | 5 | 60% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 46% | 102 |
| cs.Wren 1.0 | 19 | 16% | 36 |
| evd.X1 0.01 | 18 | 15% | 18 |
| mz.Cork 0.1 | 8 | 7% | 16 |
| js.PinBall 1.6 | 8 | 7% | 16 |
| joe.ADinosaur 1.0 | 6 | 5% | 9 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.4 | 134 / 210 | 2.59 | 18.7% | 28842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.7% | 134 |
| lrem.micro.SpikeSoldier 0.4 | 3.2 | 11.0% | 3 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 7 |
| myl.nano.Graviton 1.10 | 3.5 | 11.2% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.4% | 15 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.3% | 8 |
| disan.Chair 2.2.0 | 6.8 | 8.8% | 8 |
| DBall.NUKE 0.1 | 7.7 | 8.1% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 79.7 | 20 / 35 | 4910 |
| 2 | 1 | 67.7 | 81.3 | 22 / 35 | 5083 |
| 3 | 1 | 67.2 | 81.6 | 22 / 35 | 4389 |
| 4 | 1 | 70.0 | 90.5 | 27 / 35 | 5082 |
| 5 | 1 | 66.9 | 79.7 | 20 / 35 | 4717 |
| 6 | 1 | 67.8 | 81.6 | 23 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 92% |
| myl.nano.Graviton 1.10 | 25 | 88% |
| disan.Chair 2.2.0 | 22 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 90% |
| ntc.Opposite 1.5 | 19 | 79% |
| donjezza.Muncho 1.0 | 9 | 100% |
| DBall.NUKE 0.1 | 7 | 100% |
| pbg.R2D2 1.0 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |

Hadur died in 78 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 23% | 48 |
| ntc.Opposite 1.5 | 15 | 19% | 25 |
| myl.nano.Graviton 1.10 | 13 | 17% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 27 |
| disan.Chair 2.2.0 | 8 | 10% | 27 |
| pfvicm.Sobieski 7.2.3b | 5 | 6% | 11 |
| DBall.NUKE 0.1 | 4 | 5% | 16 |
| donjezza.Muncho 1.0 | 3 | 4% | 11 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.8 | 85 / 210 | 3.36 | 15.9% | 25768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.9% | 85 |
| oog.melee.Capulet 1.2 | 2.5 | 14.1% | 52 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.7% | 22 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 6 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 14 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.9 | 15 / 35 | 4400 |
| 2 | 1 | 66.0 | 78.7 | 15 / 35 | 4397 |
| 3 | 1 | 65.9 | 77.5 | 14 / 35 | 4370 |
| 4 | 2 | 61.2 | 65.4 | 9 / 35 | 3909 |
| 5 | 1 | 63.3 | 67.6 | 14 / 35 | 4363 |
| 6 | 1 | 66.3 | 77.8 | 18 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 77% |
| kawigi.micro.Shiz 1.1 | 22 | 91% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 7 | 57% |

Hadur died in 126 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 39% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 50 |
| yagami.Tidus 0.11 | 20 | 16% | 34 |
| ejb.Polaris 1.0.1 | 14 | 11% | 21 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 27 |
| stelo.MirrorNano 1.3 | 5 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.1 | 138 / 210 | 2.70 | 17.9% | 27394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.9% | 138 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 16 |
| wee.Gem 1.8.4 | 3.5 | 11.4% | 24 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 10 |
| wompi.Quokka 1.6 | 4.3 | 11.3% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 5 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 80.0 | 20 / 35 | 4810 |
| 2 | 1 | 67.9 | 86.0 | 25 / 35 | 4500 |
| 3 | 1 | 68.9 | 87.3 | 26 / 35 | 4897 |
| 4 | 1 | 66.3 | 76.5 | 23 / 35 | 4564 |
| 5 | 1 | 65.5 | 75.6 | 22 / 35 | 4504 |
| 6 | 1 | 66.0 | 81.0 | 22 / 35 | 4119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 95% |
| wee.Gem 1.8.4 | 34 | 97% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 18 | 89% |
| m3thos.Eva00 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 12 | 17% | 29 |
| ratosh.Nobo 0.21 | 12 | 17% | 28 |
| bzdp.Pansy 2.1 | 11 | 15% | 62 |
| maribo.FollowFire 1 | 9 | 13% | 11 |
| m3thos.Eva00 1.1 | 7 | 10% | 13 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 7 |
| bayen.UbaMicro 1.4 | 6 | 8% | 11 |
| wee.Gem 1.8.4 | 4 | 6% | 41 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 90.4 | 144 / 210 | 1.87 | 22.2% | 47923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 22.2% | 144 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 43 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 16 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.6% | 6 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 84.1 | 24 / 35 | 7680 |
| 2 | 1 | 73.8 | 92.1 | 25 / 35 | 8221 |
| 3 | 1 | 72.6 | 87.9 | 22 / 35 | 7398 |
| 4 | 1 | 74.7 | 93.7 | 26 / 35 | 8488 |
| 5 | 1 | 73.5 | 92.4 | 25 / 35 | 7705 |
| 6 | 1 | 73.8 | 92.1 | 22 / 35 | 8431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 129 | 81% |
| exauge.GateKeeper 1.1.121g | 16 | 81% |
| mz.NanoGod 2.02 | 16 | 69% |
| stelo.PianistNano 1.2 | 6 | 100% |
| stuff.Vlad 0.1 | 5 | 80% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 47% | 141 |
| mz.NanoGod 2.02 | 18 | 27% | 34 |
| exauge.GateKeeper 1.1.121g | 5 | 8% | 12 |
| ayk.WallHugger 1.0 | 5 | 8% | 11 |
| stelo.PianistNano 1.2 | 4 | 6% | 7 |
| stuff.Vlad 0.1 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 2% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.5 | 115 / 210 | 3.38 | 17.1% | 30065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.1% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 19 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.0% | 24 |
| bvh.micro.Freya 0.3 | 4.5 | 10.8% | 9 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 5 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 5 |
| ap.Frederick 1.1 | 8.0 | 6.9% | 15 |
| dl.BetterWalls 1.0 | 9.2 | 6.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.5 | 18 / 35 | 4824 |
| 2 | 1 | 66.5 | 77.5 | 19 / 35 | 5134 |
| 3 | 1 | 67.6 | 79.7 | 21 / 35 | 5188 |
| 4 | 1 | 65.3 | 72.1 | 20 / 35 | 5126 |
| 5 | 1 | 65.3 | 70.8 | 18 / 35 | 5155 |
| 6 | 1 | 62.7 | 63.8 | 19 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 30 | 77% |
| dummy.micro.Sparrow 2.5 | 29 | 97% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| ap.Frederick 1.1 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 24% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 22% | 22 |
| voidious.micro.BlitzBat 1.05 | 14 | 15% | 51 |
| dummy.micro.Sparrow 2.5 | 14 | 15% | 43 |
| conscience.Electron 1.3g | 9 | 9% | 12 |
| bvh.micro.Freya 0.3 | 6 | 6% | 13 |
| dl.BetterWalls 1.0 | 6 | 6% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.1 | 150 / 210 | 2.25 | 21.1% | 41389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.1% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 13.0% | 12 |
| sul.Lunar 1.1 | 3.0 | 12.0% | 13 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.5% | 16 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.6% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.4% | 2 |
| sample.Corners 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 81.3 | 21 / 35 | 7005 |
| 2 | 1 | 73.5 | 94.6 | 30 / 35 | 7269 |
| 3 | 1 | 70.0 | 81.9 | 24 / 35 | 6568 |
| 4 | 1 | 71.0 | 84.4 | 24 / 35 | 6955 |
| 5 | 1 | 70.5 | 83.2 | 22 / 35 | 6946 |
| 6 | 1 | 72.0 | 91.1 | 29 / 35 | 6646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 50 | 100% |
| supersample.SuperBoxBot 1.0 | 35 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 91% |
| dsw.StaticD 1.0 | 13 | 62% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| mme.NikeEnhanced 2.0 | 5 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 31% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 26% | 54 |
| dsw.StaticD 1.0 | 9 | 15% | 18 |
| sul.Lunar 1.1 | 6 | 10% | 55 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 13 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.3 | 106 / 210 | 2.95 | 18.2% | 37777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.2% | 106 |
| radnor.DoctorBob 1.42 | 2.0 | 13.6% | 33 |
| mld.Wisdom 1.0 | 3.2 | 11.7% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.1% | 26 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 7 |
| amz.NanoClone 1.41 | 5.5 | 10.3% | 8 |
| sample.Walls 1.0 | 7.0 | 8.1% | 7 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 4 |
| GarmBox.Oranges 1.0 | 8.5 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.4 | 16 / 35 | 5939 |
| 2 | 1 | 67.3 | 76.2 | 16 / 35 | 6388 |
| 3 | 1 | 66.2 | 73.7 | 15 / 35 | 6153 |
| 4 | 1 | 69.8 | 87.6 | 25 / 35 | 6372 |
| 5 | 1 | 68.5 | 82.5 | 17 / 35 | 6697 |
| 6 | 1 | 67.4 | 77.5 | 17 / 35 | 6228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 79% |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 76% |
| mld.Wisdom 1.0 | 17 | 59% |
| amz.NanoClone 1.41 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 23% | 63 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 19% | 52 |
| mld.Wisdom 1.0 | 20 | 19% | 32 |
| KiraNL.Chupacabra 0.4 | 20 | 19% | 27 |
| amz.NanoClone 1.41 | 7 | 7% | 15 |
| jangs.ns51 1.0 | 5 | 5% | 8 |
| sample.Walls 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |

