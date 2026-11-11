# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 91.3 | 163 / 210 | 1.79 | 22.0% | 42607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 22.0% | 163 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 18 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 7 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 4 |
| GarmBox.Oranges 1.0 | 6.2 | 7.0% | 0 |
| sample.Walls 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 93.7 | 31 / 35 | 6960 |
| 2 | 1 | 72.2 | 87.6 | 25 / 35 | 7069 |
| 3 | 1 | 74.0 | 94.0 | 28 / 35 | 7656 |
| 4 | 1 | 72.5 | 92.4 | 27 / 35 | 6652 |
| 5 | 1 | 71.5 | 87.3 | 24 / 35 | 6543 |
| 6 | 1 | 73.9 | 92.7 | 28 / 35 | 7727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 100% |
| radnor.DoctorBob 1.42 | 49 | 92% |
| mld.Infinity 2.2 | 28 | 93% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 15 | 32% | 61 |
| mld.Infinity 2.2 | 11 | 23% | 45 |
| mz.AntiGrav 1.0 | 9 | 19% | 73 |
| amz.NanoClone 1.41 | 8 | 17% | 11 |
| sample.Walls 1.0 | 2 | 4% | 7 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.0 | 127 / 210 | 2.35 | 18.7% | 31669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.7% | 127 |
| mld.DustBunny 3.8 | 2.5 | 14.2% | 23 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.7% | 42 |
| maribo.melee.BMV 0.1 | 4.5 | 10.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.3% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 8.4% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.8% | 3 |
| fullsail.SweetTea 1.1 | 6.8 | 6.9% | 7 |
| bzdp.BoxCar 2.0 | 8.7 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 21 / 35 | 5353 |
| 2 | 1 | 69.5 | 93.0 | 25 / 35 | 4789 |
| 3 | 1 | 68.0 | 85.1 | 21 / 35 | 5142 |
| 4 | 1 | 69.5 | 89.5 | 24 / 35 | 5470 |
| 5 | 1 | 67.8 | 82.2 | 22 / 35 | 5030 |
| 6 | 1 | 66.8 | 72.7 | 14 / 35 | 5885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 75 | 85% |
| oog.melee.Mercutio 1.0 | 56 | 79% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 32% | 77 |
| oog.melee.Mercutio 1.0 | 25 | 30% | 81 |
| fullsail.SweetTea 1.1 | 9 | 11% | 12 |
| maribo.melee.BMV 0.1 | 7 | 8% | 13 |
| zyx.nano.Ant 1.1 | 7 | 8% | 8 |
| cs.Grudge 1.0 | 6 | 7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 2% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.1 | 139 / 210 | 2.43 | 20.1% | 37167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.1% | 139 |
| myl.micro.Troodon 1.10 | 2.2 | 14.3% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.2% | 26 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.4% | 4 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.7 | 5.9% | 0 |
| sample.Fire 1.0 | 9.0 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 85.4 | 24 / 35 | 6340 |
| 2 | 1 | 68.6 | 78.4 | 19 / 35 | 6168 |
| 3 | 1 | 70.1 | 85.4 | 23 / 35 | 5905 |
| 4 | 1 | 69.5 | 81.0 | 22 / 35 | 6109 |
| 5 | 1 | 70.8 | 84.4 | 25 / 35 | 6315 |
| 6 | 1 | 71.6 | 89.8 | 26 / 35 | 6330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 74% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| myl.nano.KomoriNinja 1.1 | 20 | 95% |
| fm.mammillarias 1.3 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 25% | 35 |
| myl.micro.Troodon 1.10 | 17 | 24% | 63 |
| myl.nano.KomoriNinja 1.1 | 12 | 17% | 40 |
| cb.nano.Insomnia 1.0 | 12 | 17% | 20 |
| fm.mammillarias 1.3 | 8 | 11% | 20 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 9 |
| sample.Fire 1.0 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 11 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.2 | 143 / 210 | 2.15 | 20.5% | 38750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.5% | 143 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 21 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.3% | 17 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.0% | 9 |
| yk.JahMicro 1.0 | 7.0 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.5 | 20 / 35 | 6340 |
| 2 | 1 | 71.7 | 91.1 | 25 / 35 | 6937 |
| 3 | 1 | 70.6 | 89.2 | 26 / 35 | 6324 |
| 4 | 1 | 68.9 | 84.8 | 21 / 35 | 6007 |
| 5 | 1 | 70.9 | 88.3 | 27 / 35 | 6469 |
| 6 | 1 | 70.7 | 86.7 | 24 / 35 | 6673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 91% |
| stelo.SoJNanoMelee 1.1 | 26 | 85% |
| tj.zombie1n 1.0.1 | 19 | 79% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| repositorio.NanoStep 1.0 | 10 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| sample.VelociRobot 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 40% | 88 |
| stelo.SoJNanoMelee 1.1 | 18 | 26% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 12% | 21 |
| tj.zombie1n 1.0.1 | 6 | 9% | 8 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 64.4 | 84 / 210 | 4.20 | 15.1% | 27842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.1% | 84 |
| oog.melee.Corsair 1.0 | 1.8 | 13.6% | 42 |
| ahf.NanoAndrew .4 | 3.7 | 11.0% | 21 |
| sam.Samspin 1.0 | 4.8 | 10.4% | 23 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.4% | 8 |
| EBBU.Sim2 1.02 | 6.2 | 9.8% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.8% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 64.1 | 13 / 35 | 4939 |
| 2 | 1 | 63.9 | 68.3 | 14 / 35 | 4942 |
| 3 | 1 | 64.1 | 70.5 | 17 / 35 | 4629 |
| 4 | 1 | 61.3 | 62.5 | 13 / 35 | 4342 |
| 5 | 1 | 62.6 | 66.0 | 15 / 35 | 4581 |
| 6 | 2 | 59.5 | 55.2 | 12 / 35 | 4409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| oog.melee.Corsair 1.0 | 33 | 64% |
| ahf.NanoAndrew .4 | 11 | 73% |
| sam.Samspin 1.0 | 11 | 82% |
| robar.nano.Assertive_Melee 0.2 | 9 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 126 of 210 rounds, at a mean tick of 371. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 18% | 48 |
| oog.melee.Corsair 1.0 | 22 | 17% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 14% | 18 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 24 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 14 |
| ahf.NanoAndrew .4 | 10 | 8% | 20 |
| sam.Samspin 1.0 | 10 | 8% | 17 |
| EBBU.Sim2 1.02 | 9 | 7% | 16 |
| sample.TrackFire 1.0 | 7 | 6% | 8 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.2 | 146 / 210 | 2.15 | 19.5% | 32096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.5% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 22 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.7% | 9 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 11.1% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.5% | 4 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.3% | 5 |
| fm.claire 1.7 | 6.5 | 8.1% | 1 |
| sample.SpinBot 1.0 | 8.5 | 6.4% | 2 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.3 | 23 / 35 | 5558 |
| 2 | 1 | 69.2 | 86.0 | 24 / 35 | 5642 |
| 3 | 1 | 66.9 | 79.4 | 20 / 35 | 4965 |
| 4 | 1 | 69.6 | 89.8 | 24 / 35 | 5409 |
| 5 | 1 | 70.9 | 92.1 | 28 / 35 | 5400 |
| 6 | 1 | 69.6 | 88.9 | 27 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 91% |
| oog.melee.CapuletDroid 1.1 | 29 | 100% |
| gh.nano.Grofvuil 0.2 | 16 | 94% |
| arthord.NanoSatanMelee Beta | 12 | 75% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 28% | 84 |
| arthord.NanoSatanMelee Beta | 12 | 18% | 16 |
| gh.nano.Grofvuil 0.2 | 11 | 17% | 36 |
| oog.melee.CapuletDroid 1.1 | 9 | 14% | 41 |
| fm.claire 1.7 | 6 | 9% | 8 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 11 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| pa.Improved 1.0 | 2 | 3% | 3 |
| sample.SpinBot 1.0 | 1 | 2% | 5 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 80.3 | 104 / 210 | 2.77 | 18.2% | 34772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 18.2% | 104 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.1% | 37 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 4.0 | 12.9% | 30 |
| DBall.Anarchy 0.1 | 5.5 | 8.5% | 8 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.4% | 0 |
| acogdev.alpha 0.2 | 7.7 | 6.2% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 70.2 | 14 / 35 | 5268 |
| 2 | 1 | 70.8 | 87.6 | 21 / 35 | 6594 |
| 3 | 1 | 67.3 | 81.0 | 17 / 35 | 5519 |
| 4 | 1 | 66.6 | 79.0 | 16 / 35 | 5611 |
| 5 | 1 | 68.8 | 85.1 | 19 / 35 | 5740 |
| 6 | 1 | 68.1 | 79.0 | 17 / 35 | 6040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 58 | 91% |
| gh.micro.Gruweltje 0.7 | 32 | 59% |
| mz.MicroGodMelee 1 | 32 | 59% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 31% | 56 |
| gh.micro.Gruweltje 0.7 | 27 | 25% | 50 |
| spinnercat.micro.Tyger 0.1 | 24 | 23% | 69 |
| acogdev.alpha 0.2 | 11 | 10% | 12 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 8 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.0 | 103 / 210 | 3.52 | 16.6% | 30249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.5 | 16.6% | 103 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 4 |
| germ.TheMind .2 | 5.2 | 9.3% | 9 |
| awesomeness.Elite 1.0 | 6.2 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 74.9 | 21 / 35 | 5268 |
| 2 | 1 | 63.8 | 69.5 | 16 / 35 | 4800 |
| 3 | 1 | 66.7 | 79.0 | 17 / 35 | 5054 |
| 4 | 3 | 60.5 | 57.8 | 13 / 35 | 4520 |
| 5 | 1 | 66.8 | 77.8 | 20 / 35 | 5401 |
| 6 | 2 | 65.9 | 72.7 | 16 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 78% |
| awesomeness.Elite 1.0 | 11 | 91% |
| germ.TheMind .2 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| lrem.micro.MoggFanatic 0.2 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 4 | 75% |

Hadur died in 108 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 46% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 39 |
| germ.TheMind .2 | 12 | 11% | 23 |
| qualidafial.MajorDick 1.0.1 | 10 | 9% | 12 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 15 |
| awesomeness.Elite 1.0 | 4 | 4% | 13 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.5 | 157 / 210 | 1.77 | 20.5% | 31266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.5% | 157 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.4% | 7 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 10 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 3 |
| ratosh.Wesco 1.4 | 6.7 | 8.4% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 26 / 35 | 5096 |
| 2 | 1 | 71.9 | 94.0 | 27 / 35 | 5212 |
| 3 | 1 | 70.0 | 87.9 | 25 / 35 | 5231 |
| 4 | 1 | 71.2 | 92.1 | 25 / 35 | 5280 |
| 5 | 1 | 70.1 | 90.8 | 25 / 35 | 5020 |
| 6 | 1 | 72.0 | 93.0 | 29 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 85 | 91% |
| nz.jdc.nano.GridFu 1.0 | 31 | 94% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| timmit.nano.TimDog 0.33 | 14 | 86% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 36% | 74 |
| timmit.nano.TimDog 0.33 | 12 | 23% | 27 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 51 |
| maribo.IotaCT 1.1 | 5 | 9% | 19 |
| ratosh.Wesco 1.4 | 4 | 8% | 16 |
| stelo.PatternRobot 1.0 | 3 | 6% | 12 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 93.8 | 177 / 210 | 1.56 | 21.9% | 39481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.9% | 177 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.2% | 11 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 6 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 6 |
| sanja.First 0.1 | 6.7 | 8.0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.9% | 1 |
| cvt.Firsty 1.0 | 7.2 | 7.7% | 3 |
| amk.Punbot.Punbot 0.01 | 8.7 | 7.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.3 | 28 / 35 | 6415 |
| 2 | 1 | 72.9 | 96.2 | 31 / 35 | 6960 |
| 3 | 1 | 71.6 | 87.9 | 29 / 35 | 6806 |
| 4 | 1 | 72.1 | 95.2 | 30 / 35 | 6370 |
| 5 | 1 | 72.2 | 95.6 | 29 / 35 | 6616 |
| 6 | 1 | 72.0 | 94.6 | 30 / 35 | 6314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 95% |
| baal.nano.N 1.42 | 40 | 90% |
| cvt.Firsty 1.0 | 30 | 97% |
| zyx.micro.Ant 1.1 | 24 | 88% |
| sanja.First 0.1 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 27% | 33 |
| tvv.nano.Polaris 1.2 | 6 | 18% | 64 |
| baal.nano.N 1.42 | 6 | 18% | 41 |
| Grystrion.TrackerWO 1.0 | 5 | 15% | 13 |
| cvt.Firsty 1.0 | 4 | 12% | 23 |
| sanja.First 0.1 | 3 | 9% | 20 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.7 | 87 / 210 | 3.54 | 16.1% | 31349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.0% | 71 |
| hadur117.micro.SaorWAU 0.1 | 1.7 | 16.1% | 87 |
| cs.Wren 1.0 | 3.3 | 12.5% | 16 |
| mz.Cork 0.1 | 4.2 | 11.2% | 17 |
| js.PinBall 1.6 | 4.5 | 10.9% | 5 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 0 |
| evd.X1 0.01 | 6.8 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 6 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 66.7 | 13 / 35 | 5132 |
| 2 | 2 | 63.1 | 67.9 | 12 / 35 | 5041 |
| 3 | 1 | 66.4 | 77.5 | 15 / 35 | 5463 |
| 4 | 2 | 65.2 | 75.6 | 16 / 35 | 5040 |
| 5 | 1 | 64.8 | 72.7 | 14 / 35 | 5349 |
| 6 | 2 | 64.4 | 70.2 | 17 / 35 | 5324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 71% |
| cs.Wren 1.0 | 26 | 88% |
| mz.Cork 0.1 | 10 | 70% |
| js.PinBall 1.6 | 6 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 47% | 113 |
| cs.Wren 1.0 | 24 | 20% | 38 |
| evd.X1 0.01 | 13 | 11% | 14 |
| mz.Cork 0.1 | 10 | 8% | 13 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| js.PinBall 1.6 | 3 | 2% | 12 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.7 | 133 / 210 | 2.38 | 19.1% | 30042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.1% | 133 |
| ntc.Opposite 1.5 | 2.8 | 12.0% | 15 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.7% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 6 |
| disan.Chair 2.2.0 | 6.5 | 8.7% | 8 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.8% | 4 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 24 / 35 | 5116 |
| 2 | 1 | 69.5 | 89.2 | 25 / 35 | 5025 |
| 3 | 1 | 65.1 | 72.7 | 17 / 35 | 4798 |
| 4 | 1 | 70.0 | 90.8 | 21 / 35 | 5269 |
| 5 | 1 | 66.8 | 79.0 | 21 / 35 | 4686 |
| 6 | 1 | 69.4 | 87.0 | 25 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 88% |
| stelo.AreaTargetingBot 1.1 | 31 | 90% |
| ntc.Opposite 1.5 | 25 | 68% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| donjezza.Muncho 1.0 | 13 | 85% |
| disan.Chair 2.2.0 | 12 | 92% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 24% | 46 |
| stelo.AreaTargetingBot 1.1 | 16 | 21% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 25 |
| ntc.Opposite 1.5 | 12 | 15% | 23 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 22 |
| donjezza.Muncho 1.0 | 4 | 5% | 14 |
| disan.Chair 2.2.0 | 3 | 4% | 15 |
| DBall.NUKE 0.1 | 1 | 1% | 14 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.5 | 87 / 210 | 3.12 | 16.6% | 27453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.6% | 87 |
| oog.melee.Capulet 1.2 | 2.7 | 13.4% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.2% | 27 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.0% | 31 |
| yagami.Tidus 0.11 | 5.2 | 11.6% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 9 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.9 | 18 / 35 | 4661 |
| 2 | 1 | 66.5 | 77.8 | 16 / 35 | 4734 |
| 3 | 1 | 66.3 | 77.8 | 18 / 35 | 4282 |
| 4 | 1 | 66.0 | 77.8 | 11 / 35 | 4546 |
| 5 | 1 | 64.3 | 72.4 | 10 / 35 | 4739 |
| 6 | 1 | 65.8 | 77.1 | 14 / 35 | 4491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 59% |
| kawigi.micro.Shiz 1.1 | 26 | 92% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 88% |
| yagami.Tidus 0.11 | 18 | 89% |
| ejb.Polaris 1.0.1 | 10 | 70% |
| stelo.MirrorNano 1.3 | 1 | 0% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 35% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 15% | 41 |
| yagami.Tidus 0.11 | 18 | 15% | 34 |
| ejb.Polaris 1.0.1 | 15 | 12% | 26 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 30 |
| stelo.MirrorNano 1.3 | 9 | 7% | 8 |
| kurios.DOSexe .9a | 6 | 5% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.3 | 125 / 210 | 2.95 | 17.2% | 27096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.2% | 125 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 18 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 34 |
| ratosh.Nobo 0.21 | 4.2 | 11.6% | 12 |
| wompi.Quokka 1.6 | 4.3 | 11.4% | 12 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.5 | 21 / 35 | 4781 |
| 2 | 1 | 62.6 | 66.3 | 16 / 35 | 4322 |
| 3 | 1 | 67.9 | 84.1 | 24 / 35 | 4624 |
| 4 | 1 | 67.0 | 84.1 | 23 / 35 | 4367 |
| 5 | 1 | 66.7 | 79.7 | 22 / 35 | 4773 |
| 6 | 1 | 65.0 | 78.1 | 19 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 96% |
| wee.Gem 1.8.4 | 29 | 97% |
| ratosh.Nobo 0.21 | 17 | 82% |
| wompi.Quokka 1.6 | 17 | 88% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 20% | 65 |
| ratosh.Nobo 0.21 | 17 | 20% | 30 |
| wompi.Quokka 1.6 | 13 | 15% | 28 |
| wee.Gem 1.8.4 | 11 | 13% | 39 |
| maribo.FollowFire 1 | 9 | 11% | 7 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| m3thos.Eva00 1.1 | 6 | 7% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 7 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 4 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 88.5 | 135 / 210 | 2.03 | 21.6% | 47234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.6% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 18.3% | 60 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 9 |
| exauge.GateKeeper 1.1.121g | 4.8 | 10.2% | 3 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 6.7 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 4.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 89.5 | 22 / 35 | 7540 |
| 2 | 1 | 74.3 | 90.8 | 25 / 35 | 8422 |
| 3 | 1 | 74.0 | 93.0 | 25 / 35 | 8146 |
| 4 | 1 | 72.9 | 87.6 | 23 / 35 | 8056 |
| 5 | 1 | 72.3 | 87.0 | 18 / 35 | 7787 |
| 6 | 1 | 71.7 | 83.2 | 22 / 35 | 7283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 86% |
| exauge.GateKeeper 1.1.121g | 18 | 89% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| mz.NanoGod 2.02 | 3 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 28 | 36% | 37 |
| wompi.Wallaby 5.1 | 27 | 35% | 134 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 16 |
| stuff.Vlad 0.1 | 6 | 8% | 9 |
| stelo.PianistNano 1.2 | 4 | 5% | 7 |
| ayk.WallHugger 1.0 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.0 | 109 / 210 | 3.16 | 16.9% | 28011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.9% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.2% | 23 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 27 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.4% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.0 | 6.7% | 6 |
| dl.BetterWalls 1.0 | 9.2 | 6.1% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 66.7 | 17 / 35 | 4295 |
| 2 | 1 | 66.1 | 77.8 | 16 / 35 | 4988 |
| 3 | 1 | 66.2 | 79.4 | 20 / 35 | 4514 |
| 4 | 1 | 66.8 | 79.7 | 17 / 35 | 5072 |
| 5 | 1 | 64.0 | 72.7 | 15 / 35 | 4713 |
| 6 | 1 | 66.5 | 79.7 | 24 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 82% |
| dummy.micro.Sparrow 2.5 | 37 | 81% |
| bvh.micro.Freya 0.3 | 25 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 90% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 23% | 45 |
| voidious.micro.BlitzBat 1.05 | 18 | 18% | 58 |
| conscience.Electron 1.3g | 15 | 15% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 31 |
| bvh.micro.Freya 0.3 | 10 | 10% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 15 |
| dl.BetterWalls 1.0 | 6 | 6% | 5 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.9 | 157 / 210 | 2.18 | 21.2% | 40127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.2% | 157 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 17 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.3% | 12 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 8 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.8% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 4 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.7% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.7% | 3 |
| sample.Corners 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 85.1 | 25 / 35 | 6314 |
| 2 | 1 | 70.7 | 83.5 | 24 / 35 | 6866 |
| 3 | 1 | 71.2 | 89.2 | 26 / 35 | 6319 |
| 4 | 1 | 70.9 | 82.9 | 26 / 35 | 6642 |
| 5 | 1 | 71.6 | 85.7 | 26 / 35 | 6952 |
| 6 | 1 | 73.4 | 94.9 | 30 / 35 | 7034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 92% |
| supersample.SuperBoxBot 1.0 | 31 | 94% |
| dsw.StaticD 1.0 | 8 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 30% | 65 |
| supersample.SuperBoxBot 1.0 | 15 | 28% | 32 |
| dsw.StaticD 1.0 | 6 | 11% | 24 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 9% | 12 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 7 |
| sample.Corners 1.0 | 3 | 6% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 7 |
| sul.Lunar 1.1 | 1 | 2% | 52 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.2 | 100 / 210 | 2.70 | 18.5% | 38231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 100 |
| mld.Wisdom 1.0 | 2.5 | 13.1% | 29 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.9% | 27 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 14 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 10 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 1 |
| sample.Walls 1.0 | 7.7 | 6.9% | 3 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 1 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.9 | 15 / 35 | 6690 |
| 2 | 1 | 69.3 | 83.8 | 19 / 35 | 6749 |
| 3 | 1 | 70.3 | 91.1 | 20 / 35 | 6447 |
| 4 | 1 | 69.3 | 82.9 | 18 / 35 | 6589 |
| 5 | 1 | 66.4 | 76.8 | 15 / 35 | 5869 |
| 6 | 1 | 64.4 | 70.5 | 13 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 83% |
| radnor.DoctorBob 1.42 | 33 | 79% |
| mld.Wisdom 1.0 | 25 | 60% |
| KiraNL.Chupacabra 0.4 | 14 | 71% |
| amz.NanoClone 1.41 | 10 | 70% |
| sample.Walls 1.0 | 4 | 75% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 41 | 37% | 54 |
| radnor.DoctorBob 1.42 | 17 | 15% | 41 |
| KiraNL.Chupacabra 0.4 | 17 | 15% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 15% | 49 |
| amz.NanoClone 1.41 | 8 | 7% | 19 |
| sample.Walls 1.0 | 7 | 6% | 11 |
| jangs.ns51 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

