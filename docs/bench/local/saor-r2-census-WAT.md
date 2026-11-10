# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 90.9 | 161 / 210 | 1.82 | 21.8% | 42947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.8% | 161 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 14 |
| radnor.DoctorBob 1.42 | 3.2 | 14.0% | 13 |
| mld.Infinity 2.2 | 3.2 | 13.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 3 |
| sample.Walls 1.0 | 6.3 | 6.8% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.3% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.9 | 27 / 35 | 7064 |
| 2 | 1 | 73.1 | 92.4 | 27 / 35 | 7460 |
| 3 | 1 | 72.9 | 90.2 | 27 / 35 | 7236 |
| 4 | 1 | 73.4 | 93.7 | 28 / 35 | 7168 |
| 5 | 1 | 72.5 | 90.5 | 24 / 35 | 6905 |
| 6 | 1 | 73.0 | 89.8 | 28 / 35 | 7114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 95% |
| radnor.DoctorBob 1.42 | 49 | 90% |
| mld.Infinity 2.2 | 34 | 85% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 36% | 63 |
| mz.AntiGrav 1.0 | 16 | 32% | 81 |
| mld.Infinity 2.2 | 9 | 18% | 37 |
| amz.NanoClone 1.41 | 4 | 8% | 10 |
| jangs.ns51 1.0 | 2 | 4% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| sample.Walls 1.0 | 0 | 0% | 9 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.3 | 131 / 210 | 2.14 | 19.2% | 32515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 19.2% | 131 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.8% | 44 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 17 |
| maribo.melee.BMV 0.1 | 4.7 | 10.3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.6% | 3 |
| zyx.nano.Ant 1.1 | 6.5 | 7.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 6 |
| fullsail.SweetTea 1.1 | 7.7 | 6.6% | 2 |
| bzdp.BoxCar 2.0 | 9.0 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 24 / 35 | 5800 |
| 2 | 1 | 69.6 | 91.7 | 23 / 35 | 5088 |
| 3 | 1 | 68.6 | 89.5 | 19 / 35 | 5113 |
| 4 | 1 | 70.3 | 92.1 | 27 / 35 | 5502 |
| 5 | 1 | 70.5 | 92.7 | 25 / 35 | 5710 |
| 6 | 2 | 64.2 | 66.0 | 13 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 76 | 78% |
| mld.DustBunny 3.8 | 59 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 33% | 95 |
| mld.DustBunny 3.8 | 24 | 30% | 65 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 14 |
| maribo.melee.BMV 0.1 | 6 | 7% | 10 |
| fullsail.SweetTea 1.1 | 5 | 6% | 8 |
| cs.Grudge 1.0 | 4 | 5% | 3 |
| zyx.nano.Ant 1.1 | 3 | 4% | 5 |
| bzdp.BoxCar 2.0 | 3 | 4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.0 | 123 / 210 | 2.35 | 19.6% | 35462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.6% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.9% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.7% | 29 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 8 |
| fm.mammillarias 1.3 | 5.8 | 8.8% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 2 |
| sample.Tracker 1.0 | 9.2 | 4.8% | 1 |
| sample.Fire 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.8 | 21 / 35 | 5768 |
| 2 | 1 | 70.0 | 86.7 | 17 / 35 | 6467 |
| 3 | 1 | 68.7 | 83.2 | 20 / 35 | 5564 |
| 4 | 1 | 69.7 | 85.4 | 22 / 35 | 6074 |
| 5 | 1 | 69.4 | 82.9 | 23 / 35 | 5541 |
| 6 | 1 | 70.1 | 87.0 | 20 / 35 | 6048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 68% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 2 | 50% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 31 | 36% | 48 |
| myl.micro.Troodon 1.10 | 19 | 22% | 74 |
| cb.nano.Insomnia 1.0 | 15 | 17% | 16 |
| myl.nano.KomoriNinja 1.1 | 14 | 16% | 44 |
| fm.mammillarias 1.3 | 5 | 6% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 13 |
| sample.Fire 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.0 | 152 / 210 | 2.26 | 20.7% | 39285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.7% | 152 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 11 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.0% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 8 |
| tj.zombie1n 1.0.1 | 6.5 | 8.2% | 2 |
| yk.JahMicro 1.0 | 8.0 | 7.6% | 0 |
| repositorio.NanoStep 1.0 | 8.5 | 6.8% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 89.5 | 28 / 35 | 7224 |
| 2 | 1 | 71.7 | 91.1 | 27 / 35 | 6617 |
| 3 | 1 | 66.9 | 74.0 | 19 / 35 | 5972 |
| 4 | 1 | 70.6 | 86.3 | 25 / 35 | 6570 |
| 5 | 1 | 70.9 | 84.8 | 26 / 35 | 6755 |
| 6 | 1 | 70.9 | 90.5 | 27 / 35 | 6147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 94% |
| stelo.SoJNanoMelee 1.1 | 39 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 82% |
| tvv.micro.Antares 1.1.1 | 20 | 90% |
| tj.zombie1n 1.0.1 | 11 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 33% | 77 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 17% | 26 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 31 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 13 |
| repositorio.NanoStep 1.0 | 3 | 5% | 11 |
| yk.JahMicro 1.0 | 3 | 5% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |
| tj.zombie1n 1.0.1 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 64.2 | 75 / 210 | 4.22 | 14.8% | 27061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.3 | 14.8% | 75 |
| oog.melee.Corsair 1.0 | 1.8 | 13.7% | 45 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.2% | 30 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 26 |
| EBBU.Sim2 1.02 | 6.0 | 9.7% | 4 |
| sam.Samspin 1.0 | 6.3 | 9.7% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.1% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.9 | 64.4 | 13 / 35 | 4410 |
| 2 | 2 | 58.5 | 55.2 | 11 / 35 | 3862 |
| 3 | 2 | 59.7 | 58.4 | 9 / 35 | 4564 |
| 4 | 1 | 62.7 | 68.6 | 14 / 35 | 4439 |
| 5 | 1 | 65.5 | 72.7 | 15 / 35 | 5307 |
| 6 | 1 | 61.9 | 65.7 | 13 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 45 | 58% |
| simonton.nano.MeleeSeed 1.8 | 26 | 81% |
| ahf.NanoAndrew .4 | 17 | 88% |
| EBBU.Sim2 1.02 | 7 | 86% |
| sam.Samspin 1.0 | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 21% | 56 |
| simonton.nano.MeleeSeed 1.8 | 24 | 18% | 45 |
| robar.nano.Assertive_Melee 0.2 | 19 | 14% | 23 |
| zyx.nano.BacillusComma 1.0 | 16 | 12% | 18 |
| EBBU.Sim2 1.02 | 13 | 10% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 8% | 7 |
| sample.TrackFire 1.0 | 9 | 7% | 11 |
| sam.Samspin 1.0 | 8 | 6% | 8 |
| ahf.NanoAndrew .4 | 7 | 5% | 23 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.2 | 151 / 210 | 2.06 | 19.8% | 33247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.8% | 151 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.3% | 20 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.4% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.6% | 13 |
| fm.claire 1.7 | 4.8 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.6% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.5% | 4 |
| pa.Improved 1.0 | 8.7 | 6.0% | 2 |
| sample.SpinBot 1.0 | 9.0 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 26 / 35 | 5302 |
| 2 | 1 | 69.5 | 87.6 | 24 / 35 | 5617 |
| 3 | 1 | 68.8 | 85.4 | 23 / 35 | 5546 |
| 4 | 1 | 70.0 | 88.6 | 26 / 35 | 5756 |
| 5 | 1 | 70.1 | 89.8 | 26 / 35 | 5498 |
| 6 | 1 | 69.7 | 87.0 | 26 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 84 | 90% |
| gh.nano.Grofvuil 0.2 | 27 | 93% |
| oog.melee.CapuletDroid 1.1 | 21 | 100% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| kurios.DOSexe .9b | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| pa.Improved 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 29% | 82 |
| gh.nano.Grofvuil 0.2 | 15 | 25% | 44 |
| arthord.NanoSatanMelee Beta | 7 | 12% | 15 |
| sample.SpinBot 1.0 | 6 | 10% | 11 |
| oog.melee.CapuletDroid 1.1 | 4 | 7% | 31 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 9 |
| fm.claire 1.7 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 3 | 5% | 6 |
| pa.Improved 1.0 | 1 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.3 | 113 / 210 | 2.69 | 18.5% | 35130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.5% | 113 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 17 |
| mz.MicroGodMelee 1 | 4.0 | 13.0% | 34 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 1 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 1 |
| acogdev.alpha 0.2 | 8.5 | 5.7% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.4 | 21 / 35 | 6169 |
| 2 | 1 | 68.1 | 80.6 | 19 / 35 | 5736 |
| 3 | 1 | 66.4 | 74.0 | 18 / 35 | 5912 |
| 4 | 1 | 67.5 | 80.0 | 16 / 35 | 5578 |
| 5 | 1 | 67.6 | 81.6 | 16 / 35 | 5399 |
| 6 | 1 | 70.2 | 87.0 | 23 / 35 | 6336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 93% |
| mz.MicroGodMelee 1 | 39 | 67% |
| gh.micro.Gruweltje 0.7 | 34 | 79% |
| DBall.Anarchy 0.1 | 7 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 31% | 64 |
| mz.MicroGodMelee 1 | 26 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 20 | 21% | 55 |
| el.JumpShoot 0.2 | 5 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 8 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 68.5 | 103 / 210 | 3.84 | 16.2% | 30197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.5 | 16.2% | 103 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.4% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.6% | 6 |
| germ.TheMind .2 | 5.8 | 9.1% | 10 |
| awesomeness.Elite 1.0 | 6.0 | 9.1% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 2 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.6% | 9 |
| sample.Crazy 1.0 | 9.0 | 6.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 67.3 | 19 / 35 | 4891 |
| 2 | 2 | 60.2 | 57.5 | 12 / 35 | 4259 |
| 3 | 1 | 66.9 | 76.5 | 19 / 35 | 5374 |
| 4 | 2 | 62.7 | 65.1 | 16 / 35 | 4756 |
| 5 | 1 | 67.2 | 77.8 | 18 / 35 | 5609 |
| 6 | 1 | 64.4 | 66.7 | 19 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| germ.TheMind .2 | 9 | 78% |
| awesomeness.Elite 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 37% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 22% | 42 |
| germ.TheMind .2 | 14 | 13% | 20 |
| awesomeness.Elite 1.0 | 9 | 8% | 15 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 10 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 86.7 | 152 / 210 | 2.20 | 19.8% | 31331 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.8% | 152 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.1% | 13 |
| maribo.IotaCT 1.1 | 4.2 | 10.2% | 4 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 10 |
| ratosh.Wesco 1.4 | 6.8 | 8.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.7% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 8.0% | 8 |
| spinnercat.Omen 1.0 | 8.0 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 24 / 35 | 5018 |
| 2 | 1 | 71.0 | 89.2 | 27 / 35 | 5176 |
| 3 | 1 | 72.1 | 90.8 | 27 / 35 | 5671 |
| 4 | 1 | 70.5 | 87.3 | 29 / 35 | 5214 |
| 5 | 1 | 69.5 | 85.1 | 24 / 35 | 5050 |
| 6 | 1 | 68.7 | 82.2 | 21 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 94% |
| nz.jdc.nano.GridFu 1.0 | 39 | 95% |
| stelo.PatternRobot 1.0 | 19 | 89% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 26% | 80 |
| stelo.PatternRobot 1.0 | 12 | 21% | 26 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 15 |
| ratosh.Wesco 1.4 | 8 | 14% | 14 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 44 |
| maribo.IotaCT 1.1 | 4 | 7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| spinnercat.Omen 1.0 | 2 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.1 | 168 / 210 | 1.80 | 21.0% | 37607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.0% | 168 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 13 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.2% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 10 |
| sanja.First 0.1 | 6.5 | 8.1% | 2 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.5% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.7 | 28 / 35 | 6507 |
| 2 | 1 | 69.9 | 87.9 | 28 / 35 | 5853 |
| 3 | 1 | 72.2 | 95.2 | 27 / 35 | 6669 |
| 4 | 1 | 70.9 | 89.5 | 29 / 35 | 6393 |
| 5 | 1 | 71.3 | 90.8 | 28 / 35 | 6192 |
| 6 | 1 | 70.4 | 91.4 | 28 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 48 | 96% |
| baal.nano.N 1.42 | 39 | 90% |
| sanja.First 0.1 | 27 | 100% |
| zyx.micro.Ant 1.1 | 20 | 80% |
| cvt.Firsty 1.0 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 26% | 28 |
| baal.nano.N 1.42 | 8 | 19% | 50 |
| Grystrion.TrackerWO 1.0 | 8 | 19% | 14 |
| tvv.nano.Polaris 1.2 | 5 | 12% | 58 |
| cvt.Firsty 1.0 | 5 | 12% | 19 |
| sample.RamFire 1.0 | 5 | 12% | 6 |
| sanja.First 0.1 | 0 | 0% | 18 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 8 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.3 | 84 / 210 | 4.03 | 15.0% | 29654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.3% | 65 |
| hadur117.micro.SaorWAT 0.1 | 1.7 | 15.0% | 84 |
| cs.Wren 1.0 | 3.0 | 12.6% | 17 |
| js.PinBall 1.6 | 4.7 | 10.7% | 12 |
| mz.Cork 0.1 | 4.7 | 11.0% | 14 |
| joe.ADinosaur 1.0 | 5.7 | 9.5% | 5 |
| evd.X1 0.01 | 7.3 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.2% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.5 | 16 / 35 | 5106 |
| 2 | 2 | 59.9 | 59.4 | 14 / 35 | 4561 |
| 3 | 2 | 60.1 | 62.2 | 11 / 35 | 4475 |
| 4 | 2 | 62.9 | 65.7 | 15 / 35 | 5213 |
| 5 | 2 | 62.3 | 66.0 | 13 / 35 | 4669 |
| 6 | 1 | 65.2 | 74.0 | 15 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 82% |
| cs.Wren 1.0 | 16 | 100% |
| mz.Cork 0.1 | 14 | 86% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 39% | 95 |
| cs.Wren 1.0 | 18 | 14% | 33 |
| joe.ADinosaur 1.0 | 15 | 12% | 17 |
| evd.X1 0.01 | 15 | 12% | 16 |
| js.PinBall 1.6 | 10 | 8% | 16 |
| mz.Cork 0.1 | 8 | 6% | 15 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 3 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.9 | 129 / 210 | 2.54 | 18.8% | 30302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.8% | 129 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 31 |
| ntc.Opposite 1.5 | 3.2 | 11.5% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.7% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.1% | 15 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 10.0% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.4% | 5 |
| DBall.NUKE 0.1 | 8.3 | 7.2% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.5% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.0 | 24 / 35 | 5045 |
| 2 | 1 | 69.6 | 89.2 | 26 / 35 | 4951 |
| 3 | 1 | 67.8 | 79.4 | 20 / 35 | 5243 |
| 4 | 1 | 70.4 | 89.5 | 25 / 35 | 5487 |
| 5 | 1 | 66.6 | 82.2 | 17 / 35 | 4796 |
| 6 | 1 | 64.5 | 70.8 | 17 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 82% |
| stelo.AreaTargetingBot 1.1 | 27 | 96% |
| ntc.Opposite 1.5 | 22 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| disan.Chair 2.2.0 | 17 | 88% |
| donjezza.Muncho 1.0 | 14 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| DBall.NUKE 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 21 | 26% | 42 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 28 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 40 |
| ntc.Opposite 1.5 | 11 | 14% | 23 |
| disan.Chair 2.2.0 | 7 | 9% | 24 |
| donjezza.Muncho 1.0 | 4 | 5% | 15 |
| DBall.NUKE 0.1 | 1 | 1% | 8 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.7 | 82 / 210 | 3.46 | 16.1% | 27215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.3 | 16.1% | 82 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 52 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.8% | 23 |
| yagami.Tidus 0.11 | 4.8 | 11.7% | 12 |
| ejb.Polaris 1.0.1 | 5.5 | 11.0% | 7 |
| step.nanoPri 1.0 | 7.5 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.0 | 15 / 35 | 4474 |
| 2 | 1 | 65.9 | 74.9 | 14 / 35 | 4613 |
| 3 | 1 | 67.1 | 79.7 | 18 / 35 | 4657 |
| 4 | 1 | 65.5 | 73.3 | 13 / 35 | 4752 |
| 5 | 3 | 61.3 | 61.3 | 9 / 35 | 4049 |
| 6 | 1 | 65.5 | 74.0 | 13 / 35 | 4670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 86% |
| oog.melee.Capulet 1.2 | 24 | 33% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 13 | 85% |
| ejb.Polaris 1.0.1 | 5 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 56 | 43% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 13% | 48 |
| yagami.Tidus 0.11 | 17 | 13% | 27 |
| ejb.Polaris 1.0.1 | 12 | 9% | 19 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 27 |
| stelo.MirrorNano 1.3 | 6 | 5% | 8 |
| step.nanoPri 1.0 | 5 | 4% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.2 | 128 / 210 | 2.70 | 17.8% | 27795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.8% | 128 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 22 |
| wompi.Quokka 1.6 | 3.3 | 11.5% | 21 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 16 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 15 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.3% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 6.2% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 76.8 | 14 / 35 | 4030 |
| 2 | 1 | 67.3 | 82.5 | 23 / 35 | 4735 |
| 3 | 1 | 68.4 | 84.8 | 24 / 35 | 4895 |
| 4 | 1 | 70.2 | 88.9 | 27 / 35 | 5536 |
| 5 | 1 | 64.4 | 76.5 | 17 / 35 | 4110 |
| 6 | 1 | 65.8 | 77.5 | 23 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 67 | 91% |
| wee.Gem 1.8.4 | 23 | 96% |
| wompi.Quokka 1.6 | 18 | 89% |
| ratosh.Nobo 0.21 | 15 | 73% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 69 |
| ratosh.Nobo 0.21 | 15 | 18% | 25 |
| wompi.Quokka 1.6 | 10 | 12% | 26 |
| bayen.UbaMicro 1.4 | 8 | 10% | 12 |
| maribo.FollowFire 1 | 8 | 10% | 9 |
| wee.Gem 1.8.4 | 7 | 8% | 38 |
| m3thos.Eva00 1.1 | 6 | 7% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 7 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 7 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 89.5 | 139 / 210 | 1.95 | 21.6% | 46534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.6% | 139 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 58 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 11 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 2 |
| stuff.Vlad 0.1 | 6.2 | 8.1% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 88.3 | 22 / 35 | 7497 |
| 2 | 1 | 71.8 | 86.0 | 18 / 35 | 7778 |
| 3 | 1 | 73.3 | 89.5 | 23 / 35 | 8278 |
| 4 | 1 | 72.9 | 87.9 | 25 / 35 | 7521 |
| 5 | 1 | 74.2 | 94.6 | 28 / 35 | 7660 |
| 6 | 1 | 73.2 | 90.5 | 23 / 35 | 7800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 83% |
| mz.NanoGod 2.02 | 22 | 73% |
| exauge.GateKeeper 1.1.121g | 14 | 93% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 47% | 129 |
| mz.NanoGod 2.02 | 24 | 33% | 47 |
| exauge.GateKeeper 1.1.121g | 9 | 13% | 15 |
| ayk.WallHugger 1.0 | 3 | 4% | 9 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.0 | 114 / 210 | 3.34 | 17.0% | 29405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.0% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 23 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 22 |
| bvh.micro.Freya 0.3 | 4.3 | 10.8% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.4% | 14 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 5 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 2 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 70.8 | 20 / 35 | 4628 |
| 2 | 1 | 66.6 | 77.1 | 22 / 35 | 5071 |
| 3 | 1 | 64.0 | 68.9 | 15 / 35 | 4917 |
| 4 | 1 | 64.9 | 72.7 | 17 / 35 | 4816 |
| 5 | 1 | 66.1 | 78.4 | 20 / 35 | 4660 |
| 6 | 1 | 66.5 | 76.2 | 20 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 90% |
| dummy.micro.Sparrow 2.5 | 36 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 88% |
| bvh.micro.Freya 0.3 | 12 | 75% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 18 | 19% | 50 |
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 15% | 13 |
| bvh.micro.Freya 0.3 | 13 | 14% | 23 |
| conscience.Electron 1.3g | 12 | 13% | 15 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 16 |
| dl.BetterWalls 1.0 | 8 | 8% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 7% | 25 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.2 | 145 / 210 | 2.24 | 20.8% | 40684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.8% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.2% | 8 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.7% | 7 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.5% | 6 |
| dsw.StaticD 1.0 | 5.5 | 9.4% | 12 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 5 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.Corners 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 89.5 | 27 / 35 | 7321 |
| 2 | 1 | 69.7 | 83.2 | 23 / 35 | 6302 |
| 3 | 1 | 72.2 | 92.1 | 30 / 35 | 6692 |
| 4 | 1 | 69.1 | 80.3 | 16 / 35 | 6703 |
| 5 | 1 | 69.6 | 82.5 | 20 / 35 | 6574 |
| 6 | 1 | 72.0 | 89.5 | 29 / 35 | 7092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 84% |
| supersample.SuperBoxBot 1.0 | 28 | 96% |
| dsw.StaticD 1.0 | 16 | 44% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 34% | 63 |
| dsw.StaticD 1.0 | 15 | 23% | 23 |
| supersample.SuperBoxBot 1.0 | 11 | 17% | 30 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 17 |
| sul.Lunar 1.1 | 5 | 8% | 54 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.5 | 112 / 210 | 2.67 | 18.6% | 37354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.6% | 112 |
| mld.Wisdom 1.0 | 2.8 | 13.0% | 25 |
| radnor.DoctorBob 1.42 | 2.8 | 12.6% | 21 |
| amz.NanoClone 1.41 | 4.2 | 11.0% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.2% | 24 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.9% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.0% | 1 |
| sample.Walls 1.0 | 7.5 | 7.2% | 4 |
| jangs.ns51 1.0 | 9.0 | 5.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.2 | 19 / 35 | 5818 |
| 2 | 1 | 67.6 | 80.3 | 15 / 35 | 6048 |
| 3 | 1 | 69.8 | 85.7 | 21 / 35 | 6905 |
| 4 | 1 | 67.0 | 79.0 | 14 / 35 | 5926 |
| 5 | 1 | 69.5 | 83.8 | 20 / 35 | 6656 |
| 6 | 1 | 69.0 | 84.8 | 23 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 85% |
| radnor.DoctorBob 1.42 | 26 | 73% |
| mld.Wisdom 1.0 | 24 | 63% |
| amz.NanoClone 1.41 | 18 | 78% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 98 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 37 | 38% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 57 |
| radnor.DoctorBob 1.42 | 19 | 19% | 43 |
| KiraNL.Chupacabra 0.4 | 8 | 8% | 15 |
| amz.NanoClone 1.41 | 7 | 7% | 19 |
| GarmBox.Oranges 1.0 | 4 | 4% | 6 |
| sample.Walls 1.0 | 3 | 3% | 10 |
| jangs.ns51 1.0 | 0 | 0% | 5 |

