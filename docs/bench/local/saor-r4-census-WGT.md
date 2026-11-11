# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 90.2 | 154 / 210 | 1.88 | 22.3% | 46310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.3% | 154 |
| mz.AntiGrav 1.0 | 2.2 | 14.7% | 13 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 27 |
| mld.Infinity 2.2 | 4.0 | 12.0% | 9 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.6% | 0 |
| sample.Walls 1.0 | 6.8 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 92.1 | 24 / 35 | 7358 |
| 2 | 1 | 72.7 | 85.7 | 25 / 35 | 8156 |
| 3 | 1 | 73.7 | 92.4 | 26 / 35 | 7684 |
| 4 | 1 | 73.6 | 93.7 | 27 / 35 | 7638 |
| 5 | 1 | 72.7 | 85.1 | 25 / 35 | 7857 |
| 6 | 1 | 73.5 | 92.4 | 27 / 35 | 7617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 96 | 95% |
| mld.Infinity 2.2 | 31 | 94% |
| radnor.DoctorBob 1.42 | 29 | 86% |
| amz.NanoClone 1.41 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 39% | 62 |
| mz.AntiGrav 1.0 | 17 | 30% | 84 |
| mld.Infinity 2.2 | 7 | 13% | 37 |
| amz.NanoClone 1.41 | 6 | 11% | 12 |
| jangs.ns51 1.0 | 3 | 5% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.8 | 120 / 210 | 2.28 | 19.0% | 33993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 120 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 51 |
| mld.DustBunny 3.8 | 3.0 | 13.1% | 15 |
| maribo.melee.BMV 0.1 | 4.0 | 11.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.1% | 4 |
| zyx.nano.Ant 1.1 | 6.5 | 7.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.8% | 9 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 2 |
| fullsail.SweetTea 1.1 | 8.2 | 6.1% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 17 / 35 | 5502 |
| 2 | 1 | 66.7 | 76.2 | 16 / 35 | 5594 |
| 3 | 1 | 68.8 | 89.5 | 20 / 35 | 5621 |
| 4 | 1 | 70.4 | 92.1 | 24 / 35 | 5534 |
| 5 | 1 | 69.6 | 87.6 | 22 / 35 | 5787 |
| 6 | 1 | 69.4 | 85.7 | 21 / 35 | 5955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 75% |
| mld.DustBunny 3.8 | 58 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 40% |
| maribo.melee.BMV 0.1 | 9 | 78% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 30% | 81 |
| mld.DustBunny 3.8 | 25 | 28% | 66 |
| maribo.melee.BMV 0.1 | 11 | 12% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 11% | 11 |
| zyx.nano.Ant 1.1 | 6 | 7% | 12 |
| fullsail.SweetTea 1.1 | 4 | 4% | 9 |
| cs.Grudge 1.0 | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 81.7 | 126 / 210 | 2.64 | 19.8% | 38206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.8% | 126 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 46 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.5% | 18 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 5 |
| fm.mammillarias 1.3 | 6.2 | 9.1% | 2 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.1% | 1 |
| sample.Fire 1.0 | 8.8 | 5.0% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 86.3 | 23 / 35 | 6619 |
| 2 | 1 | 71.1 | 82.9 | 23 / 35 | 7081 |
| 3 | 1 | 70.5 | 83.2 | 22 / 35 | 6515 |
| 4 | 1 | 66.9 | 77.1 | 17 / 35 | 5328 |
| 5 | 1 | 68.9 | 76.5 | 19 / 35 | 6384 |
| 6 | 1 | 70.7 | 84.4 | 22 / 35 | 6279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 82% |
| myl.nano.KomoriNinja 1.1 | 19 | 84% |
| cb.nano.Insomnia 1.0 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| sample.Fire 1.0 | 6 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 35 |
| cb.nano.Insomnia 1.0 | 17 | 20% | 21 |
| myl.micro.Troodon 1.10 | 15 | 18% | 67 |
| myl.nano.KomoriNinja 1.1 | 15 | 18% | 39 |
| sample.Fire 1.0 | 5 | 6% | 14 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 11 |
| fm.mammillarias 1.3 | 4 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 12 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.6 | 135 / 210 | 2.39 | 20.3% | 40222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.3% | 135 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.4% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.6% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 8.4% | 7 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 7.2% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 81.9 | 22 / 35 | 6403 |
| 2 | 1 | 70.3 | 84.1 | 22 / 35 | 6790 |
| 3 | 1 | 70.0 | 80.0 | 23 / 35 | 6904 |
| 4 | 1 | 69.9 | 83.2 | 21 / 35 | 6875 |
| 5 | 1 | 70.2 | 86.3 | 22 / 35 | 6622 |
| 6 | 1 | 71.3 | 92.1 | 25 / 35 | 6628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 79% |
| stelo.SoJNanoMelee 1.1 | 28 | 93% |
| tvv.micro.Antares 1.1.1 | 25 | 76% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 81% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 42% | 89 |
| stelo.SoJNanoMelee 1.1 | 11 | 14% | 24 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 13% | 27 |
| tvv.micro.Antares 1.1.1 | 9 | 12% | 27 |
| tj.zombie1n 1.0.1 | 8 | 11% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| repositorio.NanoStep 1.0 | 1 | 1% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 66.9 | 77 / 210 | 3.98 | 15.6% | 29422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 15.6% | 77 |
| oog.melee.Corsair 1.0 | 2.2 | 13.8% | 41 |
| ahf.NanoAndrew .4 | 3.5 | 11.7% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.2% | 25 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.7% | 6 |
| sam.Samspin 1.0 | 6.7 | 9.3% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.7 | 16 / 35 | 4982 |
| 2 | 1 | 60.9 | 58.1 | 9 / 35 | 4854 |
| 3 | 1 | 64.3 | 68.6 | 13 / 35 | 5081 |
| 4 | 1 | 63.0 | 68.6 | 10 / 35 | 4827 |
| 5 | 1 | 65.9 | 72.7 | 17 / 35 | 5353 |
| 6 | 1 | 60.3 | 60.6 | 12 / 35 | 4325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 56% |
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| ahf.NanoAndrew .4 | 23 | 74% |
| EBBU.Sim2 1.02 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 24% | 53 |
| simonton.nano.MeleeSeed 1.8 | 29 | 22% | 53 |
| ahf.NanoAndrew .4 | 16 | 12% | 33 |
| EBBU.Sim2 1.02 | 14 | 10% | 21 |
| zyx.nano.BacillusComma 1.0 | 14 | 10% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 6 | 4% | 6 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.9 | 132 / 210 | 2.27 | 19.5% | 34408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.5% | 132 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.6% | 33 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.4% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.0% | 5 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.4% | 5 |
| fm.claire 1.7 | 6.2 | 8.7% | 2 |
| pa.Improved 1.0 | 8.2 | 6.6% | 2 |
| sample.SpinBot 1.0 | 8.7 | 6.3% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.9 | 21 / 35 | 5408 |
| 2 | 1 | 69.7 | 86.3 | 22 / 35 | 6080 |
| 3 | 1 | 71.1 | 92.7 | 24 / 35 | 6295 |
| 4 | 1 | 69.7 | 86.7 | 25 / 35 | 5595 |
| 5 | 1 | 69.3 | 87.0 | 22 / 35 | 5772 |
| 6 | 1 | 67.2 | 80.0 | 18 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 88% |
| oog.melee.CapuletDroid 1.1 | 32 | 88% |
| gh.nano.Grofvuil 0.2 | 17 | 82% |
| arthord.NanoSatanMelee Beta | 11 | 73% |
| fm.claire 1.7 | 8 | 88% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 23% | 70 |
| gh.nano.Grofvuil 0.2 | 15 | 19% | 40 |
| arthord.NanoSatanMelee Beta | 14 | 18% | 18 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 38 |
| sample.SpinBot 1.0 | 9 | 11% | 13 |
| fm.claire 1.7 | 6 | 8% | 11 |
| kurios.DOSexe .9b | 4 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 7 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.2 | 90 / 210 | 2.69 | 18.3% | 36187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.3% | 90 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 45 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.9% | 35 |
| mz.MicroGodMelee 1 | 4.0 | 12.3% | 29 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.2% | 1 |
| DBall.Anarchy 0.1 | 5.7 | 8.3% | 6 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 4 |
| fire219.CatBot 1.0 | 8.5 | 6.0% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 14 / 35 | 5902 |
| 2 | 1 | 67.2 | 78.1 | 15 / 35 | 5916 |
| 3 | 1 | 68.9 | 84.8 | 17 / 35 | 6020 |
| 4 | 1 | 69.3 | 85.4 | 17 / 35 | 6312 |
| 5 | 1 | 65.4 | 73.3 | 11 / 35 | 5903 |
| 6 | 1 | 68.3 | 80.3 | 16 / 35 | 6134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 85% |
| mz.MicroGodMelee 1 | 36 | 64% |
| gh.micro.Gruweltje 0.7 | 32 | 41% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 46 | 38% | 66 |
| mz.MicroGodMelee 1 | 31 | 26% | 54 |
| spinnercat.micro.Tyger 0.1 | 22 | 18% | 56 |
| acogdev.alpha 0.2 | 7 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 10 |
| DBall.Anarchy 0.1 | 3 | 3% | 9 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 72.1 | 110 / 210 | 3.51 | 17.1% | 32638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.3 | 17.1% | 110 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 28 |
| germ.TheMind .2 | 5.2 | 9.4% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 1 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 6 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 74.9 | 18 / 35 | 5488 |
| 2 | 1 | 63.4 | 67.0 | 20 / 35 | 4583 |
| 3 | 1 | 66.6 | 72.7 | 19 / 35 | 5846 |
| 4 | 1 | 67.0 | 77.5 | 19 / 35 | 5271 |
| 5 | 1 | 68.6 | 77.5 | 20 / 35 | 6517 |
| 6 | 3 | 62.8 | 63.2 | 14 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 86% |
| germ.TheMind .2 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 43% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 20% | 35 |
| germ.TheMind .2 | 11 | 11% | 19 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 10 |
| awesomeness.Elite 1.0 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 8 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.0 | 155 / 210 | 1.99 | 20.5% | 32352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.5% | 155 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.0% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 11 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.7% | 0 |
| ratosh.Wesco 1.4 | 6.7 | 8.6% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.6% | 3 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.9 | 26 / 35 | 5787 |
| 2 | 1 | 71.2 | 88.9 | 25 / 35 | 5615 |
| 3 | 1 | 71.5 | 89.8 | 27 / 35 | 5604 |
| 4 | 1 | 71.4 | 90.8 | 27 / 35 | 5028 |
| 5 | 1 | 71.8 | 94.3 | 28 / 35 | 5189 |
| 6 | 1 | 69.0 | 82.2 | 22 / 35 | 5129 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 93% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| timmit.nano.TimDog 0.33 | 17 | 88% |
| ratosh.Wesco 1.4 | 14 | 100% |
| maribo.IotaCT 1.1 | 10 | 80% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 33% | 71 |
| stelo.PatternRobot 1.0 | 9 | 16% | 15 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 24 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 50 |
| maribo.IotaCT 1.1 | 5 | 9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 9% | 8 |
| ratosh.Wesco 1.4 | 4 | 7% | 20 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 90.8 | 159 / 210 | 1.83 | 21.8% | 41608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.8% | 159 |
| baal.nano.N 1.42 | 2.7 | 12.0% | 11 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.2% | 20 |
| zyx.micro.Ant 1.1 | 4.5 | 9.7% | 10 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.3% | 2 |
| sanja.First 0.1 | 5.8 | 8.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.4 | 28 / 35 | 6858 |
| 2 | 1 | 73.9 | 98.4 | 32 / 35 | 7616 |
| 3 | 1 | 71.8 | 90.5 | 26 / 35 | 6928 |
| 4 | 1 | 71.1 | 89.8 | 24 / 35 | 6448 |
| 5 | 1 | 70.6 | 85.7 | 22 / 35 | 6595 |
| 6 | 1 | 72.1 | 88.9 | 27 / 35 | 7163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 84% |
| baal.nano.N 1.42 | 42 | 90% |
| cvt.Firsty 1.0 | 26 | 92% |
| zyx.micro.Ant 1.1 | 22 | 77% |
| sanja.First 0.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 13 | 25% | 48 |
| tvv.nano.Polaris 1.2 | 12 | 23% | 64 |
| zyx.micro.Ant 1.1 | 11 | 21% | 31 |
| Grystrion.TrackerWO 1.0 | 7 | 13% | 12 |
| cvt.Firsty 1.0 | 3 | 6% | 23 |
| sample.RamFire 1.0 | 3 | 6% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 7 |
| sanja.First 0.1 | 1 | 2% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.6 | 87 / 210 | 3.83 | 15.8% | 32231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 15.8% | 87 |
| kc.micro.Figment 1.0 | 1.8 | 14.6% | 52 |
| js.PinBall 1.6 | 3.5 | 12.0% | 21 |
| cs.Wren 1.0 | 3.7 | 12.4% | 22 |
| mz.Cork 0.1 | 5.0 | 10.7% | 13 |
| joe.ADinosaur 1.0 | 5.8 | 9.3% | 6 |
| evd.X1 0.01 | 7.2 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.9 | 17 / 35 | 5500 |
| 2 | 2 | 59.9 | 58.1 | 11 / 35 | 4713 |
| 3 | 1 | 65.7 | 74.6 | 16 / 35 | 5687 |
| 4 | 1 | 63.9 | 69.5 | 14 / 35 | 5017 |
| 5 | 1 | 62.7 | 63.2 | 14 / 35 | 5427 |
| 6 | 1 | 64.6 | 70.2 | 15 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 71 | 73% |
| cs.Wren 1.0 | 18 | 83% |
| js.PinBall 1.6 | 8 | 63% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| mz.Cork 0.1 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 75% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 46% | 104 |
| joe.ADinosaur 1.0 | 13 | 11% | 18 |
| cs.Wren 1.0 | 12 | 10% | 23 |
| js.PinBall 1.6 | 12 | 10% | 17 |
| PSW.Relentless 0.1 | 11 | 9% | 11 |
| mz.Cork 0.1 | 7 | 6% | 14 |
| evd.X1 0.01 | 6 | 5% | 8 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 9 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.3 | 130 / 210 | 2.59 | 19.0% | 30634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 130 |
| ntc.Opposite 1.5 | 2.8 | 12.0% | 15 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.6% | 18 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.4% | 6 |
| DBall.NUKE 0.1 | 6.8 | 8.3% | 6 |
| disan.Chair 2.2.0 | 6.8 | 8.2% | 11 |
| pbg.R2D2 1.0 | 9.5 | 5.2% | 3 |
| donjezza.Muncho 1.0 | 9.5 | 5.7% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.7 | 17 / 35 | 5046 |
| 2 | 1 | 67.3 | 80.0 | 22 / 35 | 4805 |
| 3 | 1 | 69.3 | 84.4 | 25 / 35 | 5383 |
| 4 | 1 | 67.4 | 76.8 | 19 / 35 | 5258 |
| 5 | 1 | 68.3 | 84.1 | 23 / 35 | 4747 |
| 6 | 1 | 70.3 | 88.9 | 24 / 35 | 5395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 88% |
| stelo.AreaTargetingBot 1.1 | 26 | 88% |
| ntc.Opposite 1.5 | 25 | 84% |
| disan.Chair 2.2.0 | 19 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| donjezza.Muncho 1.0 | 8 | 88% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 15 | 19% | 34 |
| pfvicm.Sobieski 7.2.3b | 14 | 18% | 18 |
| myl.nano.Graviton 1.10 | 12 | 15% | 46 |
| stelo.AreaTargetingBot 1.1 | 11 | 14% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 28 |
| disan.Chair 2.2.0 | 9 | 11% | 19 |
| pbg.R2D2 1.0 | 4 | 5% | 9 |
| donjezza.Muncho 1.0 | 3 | 4% | 10 |
| DBall.NUKE 0.1 | 2 | 3% | 13 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.6 | 80 / 210 | 3.73 | 15.4% | 26586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.5 | 15.4% | 80 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 42 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.5 | 11.8% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 60.0 | 9 / 35 | 4055 |
| 2 | 2 | 62.1 | 63.2 | 12 / 35 | 4203 |
| 3 | 1 | 66.6 | 75.6 | 17 / 35 | 4910 |
| 4 | 1 | 67.1 | 80.6 | 19 / 35 | 4575 |
| 5 | 2 | 61.9 | 63.8 | 9 / 35 | 4224 |
| 6 | 1 | 65.3 | 74.6 | 14 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 61% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 80% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 130 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 38% | 66 |
| yagami.Tidus 0.11 | 18 | 14% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 12% | 39 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 33 |
| ejb.Polaris 1.0.1 | 13 | 10% | 25 |
| step.nanoPri 1.0 | 6 | 5% | 7 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 6 | 5% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.0 | 143 / 210 | 2.44 | 18.6% | 28616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.6% | 143 |
| bzdp.Pansy 2.1 | 2.5 | 12.7% | 18 |
| wee.Gem 1.8.4 | 3.0 | 11.3% | 18 |
| wompi.Quokka 1.6 | 4.2 | 10.9% | 11 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.5% | 2 |
| stelo.MyAgileRobot 0.2 | 8.5 | 6.2% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.8 | 21 / 35 | 3952 |
| 2 | 1 | 68.3 | 85.1 | 25 / 35 | 4808 |
| 3 | 1 | 67.4 | 83.8 | 23 / 35 | 4826 |
| 4 | 1 | 68.8 | 87.6 | 22 / 35 | 5096 |
| 5 | 1 | 68.2 | 83.8 | 28 / 35 | 4730 |
| 6 | 1 | 69.2 | 86.7 | 24 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 81 | 90% |
| wee.Gem 1.8.4 | 26 | 100% |
| wompi.Quokka 1.6 | 16 | 88% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 24% | 74 |
| maribo.FollowFire 1 | 9 | 13% | 9 |
| stelo.MyAgileRobot 0.2 | 8 | 12% | 11 |
| wee.Gem 1.8.4 | 7 | 10% | 38 |
| bayen.UbaMicro 1.4 | 7 | 10% | 13 |
| ratosh.Nobo 0.21 | 6 | 9% | 20 |
| m3thos.Eva00 1.1 | 6 | 9% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 7 |
| wompi.Quokka 1.6 | 3 | 4% | 18 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 86.6 | 123 / 210 | 2.21 | 21.9% | 50911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.9% | 123 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 23 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 9.0% | 0 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 4.9% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 87.0 | 18 / 35 | 8502 |
| 2 | 1 | 72.8 | 83.5 | 20 / 35 | 8180 |
| 3 | 1 | 73.2 | 86.3 | 22 / 35 | 8459 |
| 4 | 1 | 74.9 | 93.0 | 24 / 35 | 8935 |
| 5 | 1 | 74.1 | 90.8 | 24 / 35 | 8622 |
| 6 | 1 | 71.2 | 78.7 | 15 / 35 | 8213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 113 | 83% |
| mz.NanoGod 2.02 | 15 | 53% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 43% | 135 |
| mz.NanoGod 2.02 | 29 | 33% | 41 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 9 |
| stelo.PianistNano 1.2 | 6 | 7% | 6 |
| stuff.Vlad 0.1 | 4 | 5% | 8 |
| ayk.WallHugger 1.0 | 2 | 2% | 8 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.8 | 106 / 210 | 3.27 | 17.1% | 30164 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.1% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 14.2% | 29 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.8% | 20 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 6 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 5 |
| dl.BetterWalls 1.0 | 8.8 | 5.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.9 | 22 / 35 | 5156 |
| 2 | 1 | 66.2 | 75.9 | 19 / 35 | 4945 |
| 3 | 1 | 66.0 | 76.5 | 21 / 35 | 4722 |
| 4 | 1 | 65.1 | 70.2 | 17 / 35 | 5220 |
| 5 | 1 | 62.1 | 65.1 | 9 / 35 | 4986 |
| 6 | 1 | 66.7 | 78.4 | 18 / 35 | 5135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 89% |
| dummy.micro.Sparrow 2.5 | 27 | 85% |
| bvh.micro.Freya 0.3 | 18 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 75% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |

Hadur died in 104 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 65 |
| conscience.Electron 1.3g | 18 | 17% | 18 |
| bvh.micro.Freya 0.3 | 16 | 15% | 33 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 37 |
| dl.BetterWalls 1.0 | 11 | 11% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 8 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.2 | 141 / 210 | 2.33 | 21.2% | 43599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.2% | 141 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.2% | 20 |
| sul.Lunar 1.1 | 2.8 | 11.8% | 15 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.7% | 11 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.6% | 7 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 3 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.3% | 2 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.3 | 25 / 35 | 7650 |
| 2 | 1 | 70.3 | 82.2 | 22 / 35 | 6819 |
| 3 | 1 | 70.2 | 81.3 | 20 / 35 | 7104 |
| 4 | 1 | 71.8 | 84.1 | 22 / 35 | 7455 |
| 5 | 1 | 73.7 | 94.3 | 30 / 35 | 7285 |
| 6 | 1 | 70.4 | 81.0 | 22 / 35 | 7286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 82% |
| supersample.SuperBoxBot 1.0 | 35 | 86% |
| dsw.StaticD 1.0 | 12 | 75% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 28% | 58 |
| dsw.StaticD 1.0 | 15 | 21% | 26 |
| supersample.SuperBoxBot 1.0 | 13 | 18% | 32 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 16 |
| sample.MyFirstRobot 1.0 | 5 | 7% | 7 |
| sul.Lunar 1.1 | 4 | 6% | 57 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 6 |
| sample.Corners 1.0 | 3 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 79.8 | 114 / 210 | 2.82 | 19.0% | 40916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.0% | 114 |
| radnor.DoctorBob 1.42 | 2.3 | 13.6% | 34 |
| mld.Wisdom 1.0 | 2.8 | 12.7% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.4% | 22 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 6 |
| sample.Walls 1.0 | 7.3 | 7.2% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 81.3 | 19 / 35 | 7386 |
| 2 | 1 | 70.8 | 84.8 | 23 / 35 | 7220 |
| 3 | 1 | 69.7 | 85.7 | 19 / 35 | 6988 |
| 4 | 1 | 66.0 | 72.1 | 14 / 35 | 6042 |
| 5 | 1 | 68.9 | 80.0 | 20 / 35 | 6817 |
| 6 | 1 | 67.7 | 74.9 | 19 / 35 | 6463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 65% |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 88% |
| mld.Wisdom 1.0 | 24 | 88% |
| amz.NanoClone 1.41 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 28% | 52 |
| radnor.DoctorBob 1.42 | 24 | 25% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 53 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 24 |
| amz.NanoClone 1.41 | 5 | 5% | 14 |
| GarmBox.Oranges 1.0 | 4 | 4% | 3 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 3 | 3% | 6 |

