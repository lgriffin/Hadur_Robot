# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.4 | 154 / 210 | 1.86 | 21.8% | 42942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.8% | 154 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 14.1% | 21 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 2 |
| GarmBox.Oranges 1.0 | 6.5 | 6.7% | 0 |
| sample.Walls 1.0 | 6.7 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 94.6 | 29 / 35 | 7558 |
| 2 | 1 | 71.1 | 85.1 | 19 / 35 | 6989 |
| 3 | 1 | 72.7 | 91.4 | 29 / 35 | 6690 |
| 4 | 1 | 73.5 | 95.2 | 29 / 35 | 7079 |
| 5 | 1 | 73.4 | 90.8 | 26 / 35 | 7705 |
| 6 | 1 | 71.0 | 85.4 | 22 / 35 | 6921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 84 | 92% |
| radnor.DoctorBob 1.42 | 41 | 85% |
| mld.Infinity 2.2 | 28 | 93% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 33% | 63 |
| mz.AntiGrav 1.0 | 16 | 28% | 77 |
| mld.Infinity 2.2 | 9 | 16% | 36 |
| amz.NanoClone 1.41 | 6 | 11% | 13 |
| jangs.ns51 1.0 | 4 | 7% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.8 | 127 / 210 | 2.37 | 18.7% | 32412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.7% | 127 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 49 |
| mld.DustBunny 3.8 | 3.2 | 13.3% | 14 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.8% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 6.1% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 7.1% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 20 / 35 | 5271 |
| 2 | 1 | 67.0 | 81.0 | 17 / 35 | 5113 |
| 3 | 1 | 70.5 | 93.3 | 25 / 35 | 5979 |
| 4 | 1 | 68.7 | 89.2 | 22 / 35 | 4900 |
| 5 | 1 | 69.7 | 91.7 | 25 / 35 | 5132 |
| 6 | 1 | 66.9 | 71.7 | 18 / 35 | 6017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 77% |
| mld.DustBunny 3.8 | 62 | 90% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 40% | 82 |
| mld.DustBunny 3.8 | 15 | 18% | 66 |
| zyx.nano.Ant 1.1 | 10 | 12% | 14 |
| maribo.melee.BMV 0.1 | 9 | 11% | 16 |
| cs.Grudge 1.0 | 5 | 6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 8 |
| fullsail.SweetTea 1.1 | 3 | 4% | 5 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 79.6 | 129 / 210 | 2.84 | 19.0% | 34586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.0% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 9 |
| cb.nano.Insomnia 1.0 | 4.3 | 10.2% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.4% | 17 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.6% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 72.7 | 19 / 35 | 5221 |
| 2 | 1 | 68.3 | 79.0 | 20 / 35 | 5600 |
| 3 | 1 | 69.0 | 79.0 | 21 / 35 | 5982 |
| 4 | 1 | 71.4 | 87.3 | 27 / 35 | 6619 |
| 5 | 1 | 69.1 | 80.6 | 23 / 35 | 5558 |
| 6 | 1 | 68.1 | 78.7 | 19 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 59 | 93% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 61% |
| fm.mammillarias 1.3 | 13 | 92% |
| myl.nano.KomoriNinja 1.1 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 28% | 79 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 17% | 30 |
| cb.nano.Insomnia 1.0 | 14 | 17% | 21 |
| fm.mammillarias 1.3 | 12 | 15% | 20 |
| myl.nano.KomoriNinja 1.1 | 5 | 6% | 27 |
| sample.Fire 1.0 | 5 | 6% | 9 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 13 |
| sample.Tracker 1.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.4 | 160 / 210 | 2.05 | 21.0% | 39423 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.0% | 160 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.0% | 14 |
| tj.zombie1n 1.0.1 | 5.5 | 8.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 5.7 | 8.7% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.5% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 7.0% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.7 | 28 / 35 | 6237 |
| 2 | 1 | 70.5 | 87.3 | 26 / 35 | 6279 |
| 3 | 1 | 72.2 | 94.0 | 28 / 35 | 6818 |
| 4 | 1 | 69.9 | 84.4 | 26 / 35 | 6155 |
| 5 | 1 | 71.7 | 89.8 | 25 / 35 | 7140 |
| 6 | 1 | 71.2 | 87.9 | 27 / 35 | 6794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 92% |
| stelo.SoJNanoMelee 1.1 | 35 | 91% |
| tvv.micro.Antares 1.1.1 | 23 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 90% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 38% | 80 |
| stelo.SoJNanoMelee 1.1 | 7 | 14% | 31 |
| tvv.micro.Antares 1.1.1 | 5 | 10% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 10% | 23 |
| tj.zombie1n 1.0.1 | 4 | 8% | 7 |
| yk.JahMicro 1.0 | 3 | 6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 9 |
| repositorio.NanoStep 1.0 | 2 | 4% | 12 |
| sample.VelociRobot 1.0 | 2 | 4% | 7 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 65.9 | 89 / 210 | 4.07 | 14.9% | 26205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.3 | 14.9% | 89 |
| oog.melee.Corsair 1.0 | 1.7 | 13.3% | 47 |
| ahf.NanoAndrew .4 | 4.2 | 11.1% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.8% | 21 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 8 |
| sam.Samspin 1.0 | 6.5 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 67.3 | 15 / 35 | 4804 |
| 2 | 2 | 59.2 | 57.8 | 15 / 35 | 3868 |
| 3 | 1 | 61.1 | 63.5 | 16 / 35 | 4081 |
| 4 | 2 | 56.7 | 53.7 | 10 / 35 | 3879 |
| 5 | 1 | 64.6 | 74.3 | 15 / 35 | 4788 |
| 6 | 1 | 65.4 | 79.0 | 18 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 69% |
| simonton.nano.MeleeSeed 1.8 | 34 | 85% |
| ahf.NanoAndrew .4 | 19 | 89% |
| robar.nano.Assertive_Melee 0.2 | 7 | 57% |
| EBBU.Sim2 1.02 | 6 | 83% |
| sam.Samspin 1.0 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 20% | 50 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 15% | 19 |
| oog.melee.Corsair 1.0 | 17 | 14% | 39 |
| EBBU.Sim2 1.02 | 15 | 12% | 22 |
| ahf.NanoAndrew .4 | 11 | 9% | 28 |
| sam.Samspin 1.0 | 8 | 7% | 13 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 7 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.1 | 133 / 210 | 2.61 | 18.5% | 31564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.3% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.8% | 8 |
| fm.claire 1.7 | 6.0 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 3 |
| sample.SpinBot 1.0 | 8.3 | 6.9% | 1 |
| pa.Improved 1.0 | 8.8 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 78.1 | 20 / 35 | 5632 |
| 2 | 1 | 66.2 | 76.2 | 21 / 35 | 5107 |
| 3 | 1 | 68.0 | 83.8 | 22 / 35 | 5261 |
| 4 | 1 | 68.0 | 81.6 | 23 / 35 | 5087 |
| 5 | 1 | 68.0 | 83.2 | 24 / 35 | 4884 |
| 6 | 1 | 69.9 | 89.8 | 23 / 35 | 5593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 94% |
| oog.melee.CapuletDroid 1.1 | 28 | 96% |
| gh.nano.Grofvuil 0.2 | 20 | 75% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 5 | 80% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 31% | 78 |
| gh.nano.Grofvuil 0.2 | 17 | 22% | 36 |
| oog.melee.CapuletDroid 1.1 | 14 | 18% | 48 |
| fm.claire 1.7 | 6 | 8% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 9 |
| arthord.NanoSatanMelee Beta | 3 | 4% | 12 |
| pa.Improved 1.0 | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| kurios.DOSexe .9b | 2 | 3% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.7 | 106 / 210 | 2.56 | 18.5% | 34148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 106 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 30 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 26 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.5% | 7 |
| DBall.Anarchy 0.1 | 5.7 | 8.4% | 5 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 2 |
| acogdev.alpha 0.2 | 8.2 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 17 / 35 | 5893 |
| 2 | 1 | 67.3 | 81.3 | 15 / 35 | 5388 |
| 3 | 1 | 67.9 | 80.0 | 18 / 35 | 5401 |
| 4 | 1 | 70.3 | 90.2 | 20 / 35 | 6178 |
| 5 | 1 | 68.7 | 80.3 | 21 / 35 | 6002 |
| 6 | 1 | 67.0 | 80.3 | 15 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 84% |
| mz.MicroGodMelee 1 | 45 | 76% |
| gh.micro.Gruweltje 0.7 | 19 | 53% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| DBall.Anarchy 0.1 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 32% | 73 |
| spinnercat.micro.Tyger 0.1 | 25 | 24% | 58 |
| gh.micro.Gruweltje 0.7 | 24 | 23% | 38 |
| acogdev.alpha 0.2 | 9 | 9% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 14 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.5 | 104 / 210 | 3.84 | 15.8% | 28375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.8% | 104 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.3% | 4 |
| germ.TheMind .2 | 5.3 | 9.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5.7 | 9.1% | 7 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 7 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.2% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 66.3 | 16 / 35 | 4828 |
| 2 | 1 | 62.4 | 66.0 | 16 / 35 | 4350 |
| 3 | 1 | 65.1 | 73.3 | 18 / 35 | 4756 |
| 4 | 1 | 62.5 | 62.5 | 15 / 35 | 4837 |
| 5 | 1 | 63.3 | 70.2 | 18 / 35 | 4577 |
| 6 | 1 | 66.0 | 72.4 | 21 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 81% |
| germ.TheMind .2 | 9 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 44% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 17% | 35 |
| germ.TheMind .2 | 10 | 9% | 21 |
| qualidafial.MajorDick 1.0.1 | 10 | 9% | 11 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 15 |
| awesomeness.Elite 1.0 | 6 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.3 | 156 / 210 | 1.96 | 20.4% | 32173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.4% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.2% | 13 |
| maribo.IotaCT 1.1 | 4.5 | 10.1% | 7 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.1% | 0 |
| stelo.PatternRobot 1.0 | 7.0 | 8.3% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.0% | 1 |
| spinnercat.Omen 1.0 | 8.5 | 7.1% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.0 | 24 / 35 | 5166 |
| 2 | 1 | 70.2 | 86.7 | 27 / 35 | 5138 |
| 3 | 1 | 71.7 | 91.1 | 29 / 35 | 5513 |
| 4 | 1 | 70.9 | 88.3 | 26 / 35 | 5698 |
| 5 | 1 | 71.4 | 93.0 | 25 / 35 | 5074 |
| 6 | 1 | 71.0 | 90.8 | 25 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 89% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| maribo.IotaCT 1.1 | 12 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 31% | 64 |
| timmit.nano.TimDog 0.33 | 9 | 17% | 22 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 52 |
| stelo.PatternRobot 1.0 | 7 | 13% | 16 |
| maribo.IotaCT 1.1 | 5 | 9% | 25 |
| ratosh.Wesco 1.4 | 5 | 9% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 6 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.6 | 167 / 210 | 1.84 | 21.3% | 39231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.3% | 167 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 10 |
| baal.nano.N 1.42 | 2.8 | 12.0% | 10 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.0% | 3 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 8 |
| cvt.Firsty 1.0 | 6.8 | 7.8% | 5 |
| sanja.First 0.1 | 7.0 | 7.8% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.9% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.6 | 31 / 35 | 6485 |
| 2 | 1 | 72.6 | 93.7 | 29 / 35 | 6973 |
| 3 | 1 | 70.2 | 85.7 | 25 / 35 | 6380 |
| 4 | 1 | 71.0 | 89.2 | 29 / 35 | 6245 |
| 5 | 1 | 69.7 | 87.3 | 25 / 35 | 6078 |
| 6 | 1 | 72.1 | 92.4 | 28 / 35 | 7070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 91% |
| baal.nano.N 1.42 | 44 | 89% |
| cvt.Firsty 1.0 | 33 | 94% |
| sanja.First 0.1 | 17 | 94% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 10 | 23% | 46 |
| zyx.micro.Ant 1.1 | 10 | 23% | 28 |
| tvv.nano.Polaris 1.2 | 6 | 14% | 56 |
| Grystrion.TrackerWO 1.0 | 6 | 14% | 18 |
| cvt.Firsty 1.0 | 3 | 7% | 25 |
| sample.RamFire 1.0 | 3 | 7% | 4 |
| sanja.First 0.1 | 2 | 5% | 21 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 68.0 | 79 / 210 | 3.88 | 15.6% | 32127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.3 | 15.6% | 79 |
| kc.micro.Figment 1.0 | 2.0 | 14.3% | 51 |
| cs.Wren 1.0 | 3.0 | 13.0% | 27 |
| mz.Cork 0.1 | 4.3 | 11.3% | 15 |
| js.PinBall 1.6 | 4.3 | 11.4% | 18 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 3 |
| evd.X1 0.01 | 6.7 | 8.3% | 3 |
| donjezza.Jezza 1.0 | 8.5 | 6.1% | 8 |
| jsal.Jsalbot 1.0 | 8.5 | 6.4% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.0 | 14 / 35 | 5252 |
| 2 | 1 | 62.1 | 63.5 | 10 / 35 | 5509 |
| 3 | 2 | 61.2 | 62.9 | 11 / 35 | 4778 |
| 4 | 1 | 64.1 | 70.5 | 15 / 35 | 5220 |
| 5 | 2 | 59.8 | 57.1 | 11 / 35 | 4977 |
| 6 | 1 | 68.2 | 80.3 | 18 / 35 | 6391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 70% |
| cs.Wren 1.0 | 30 | 83% |
| mz.Cork 0.1 | 11 | 64% |
| js.PinBall 1.6 | 6 | 83% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 41% | 88 |
| cs.Wren 1.0 | 23 | 18% | 47 |
| evd.X1 0.01 | 20 | 15% | 21 |
| js.PinBall 1.6 | 10 | 8% | 18 |
| joe.ADinosaur 1.0 | 8 | 6% | 8 |
| mz.Cork 0.1 | 7 | 5% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.5 | 146 / 210 | 2.04 | 19.9% | 30029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.9% | 146 |
| myl.nano.Graviton 1.10 | 2.3 | 11.7% | 22 |
| ntc.Opposite 1.5 | 3.0 | 11.5% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.6% | 1 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.6% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.3% | 6 |
| disan.Chair 2.2.0 | 6.7 | 8.6% | 11 |
| DBall.NUKE 0.1 | 7.3 | 7.8% | 2 |
| donjezza.Muncho 1.0 | 9.3 | 6.2% | 7 |
| pbg.R2D2 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.3 | 25 / 35 | 4569 |
| 2 | 1 | 67.4 | 83.5 | 21 / 35 | 4744 |
| 3 | 1 | 69.6 | 89.5 | 24 / 35 | 5139 |
| 4 | 1 | 70.2 | 90.5 | 25 / 35 | 5233 |
| 5 | 1 | 69.9 | 89.8 | 24 / 35 | 5141 |
| 6 | 1 | 70.6 | 91.1 | 27 / 35 | 5203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 91% |
| ntc.Opposite 1.5 | 26 | 92% |
| stelo.AreaTargetingBot 1.1 | 21 | 95% |
| disan.Chair 2.2.0 | 20 | 85% |
| donjezza.Muncho 1.0 | 19 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| DBall.NUKE 0.1 | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 13 | 20% | 57 |
| stelo.AreaTargetingBot 1.1 | 12 | 18% | 32 |
| ntc.Opposite 1.5 | 11 | 17% | 28 |
| pfvicm.Sobieski 7.2.3b | 11 | 17% | 19 |
| disan.Chair 2.2.0 | 7 | 11% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 9% | 16 |
| donjezza.Muncho 1.0 | 2 | 3% | 15 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| DBall.NUKE 0.1 | 1 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.8 | 84 / 210 | 3.45 | 15.8% | 26227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.3 | 15.8% | 84 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 41 |
| oog.melee.Capulet 1.2 | 2.7 | 14.0% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 13.4% | 25 |
| yagami.Tidus 0.11 | 5.2 | 11.5% | 14 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 61.3 | 11 / 35 | 3987 |
| 2 | 1 | 63.8 | 69.8 | 14 / 35 | 4301 |
| 3 | 1 | 66.7 | 80.3 | 15 / 35 | 4213 |
| 4 | 1 | 65.3 | 74.9 | 12 / 35 | 4541 |
| 5 | 1 | 66.7 | 77.8 | 18 / 35 | 4524 |
| 6 | 1 | 64.9 | 72.4 | 14 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 84% |
| kawigi.micro.Shiz 1.1 | 28 | 93% |
| oog.melee.Capulet 1.2 | 22 | 59% |
| yagami.Tidus 0.11 | 14 | 79% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 40% | 65 |
| kawigi.micro.Shiz 1.1 | 22 | 17% | 37 |
| yagami.Tidus 0.11 | 18 | 14% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 13% | 48 |
| ejb.Polaris 1.0.1 | 9 | 7% | 19 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.5 | 132 / 210 | 2.93 | 17.5% | 27989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.5% | 132 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 25 |
| wompi.Quokka 1.6 | 3.3 | 11.5% | 11 |
| wee.Gem 1.8.4 | 3.8 | 11.1% | 26 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 5 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.4 | 21 / 35 | 4463 |
| 2 | 1 | 63.1 | 67.0 | 17 / 35 | 4598 |
| 3 | 1 | 67.0 | 81.6 | 23 / 35 | 4636 |
| 4 | 1 | 69.0 | 89.5 | 25 / 35 | 4887 |
| 5 | 1 | 65.3 | 74.3 | 23 / 35 | 4722 |
| 6 | 1 | 66.6 | 80.3 | 23 / 35 | 4683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 91% |
| wee.Gem 1.8.4 | 29 | 100% |
| wompi.Quokka 1.6 | 23 | 96% |
| m3thos.Eva00 1.1 | 16 | 94% |
| ratosh.Nobo 0.21 | 16 | 94% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 21% | 58 |
| wompi.Quokka 1.6 | 12 | 15% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 14% | 14 |
| maribo.FollowFire 1 | 10 | 13% | 8 |
| ratosh.Nobo 0.21 | 9 | 12% | 22 |
| wee.Gem 1.8.4 | 7 | 9% | 47 |
| bayen.UbaMicro 1.4 | 6 | 8% | 13 |
| m3thos.Eva00 1.1 | 4 | 5% | 11 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 4 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 90.4 | 134 / 210 | 1.86 | 22.0% | 47531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 22.0% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 11 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.2 | 8.7% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.6 | 21 / 35 | 7386 |
| 2 | 1 | 74.3 | 90.2 | 27 / 35 | 8174 |
| 3 | 1 | 73.2 | 90.5 | 22 / 35 | 8180 |
| 4 | 1 | 73.6 | 93.3 | 22 / 35 | 7880 |
| 5 | 1 | 73.6 | 92.1 | 20 / 35 | 8035 |
| 6 | 1 | 72.9 | 87.9 | 22 / 35 | 7876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 138 | 78% |
| mz.NanoGod 2.02 | 12 | 67% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 57% | 148 |
| mz.NanoGod 2.02 | 24 | 32% | 36 |
| stuff.Vlad 0.1 | 4 | 5% | 9 |
| ayk.WallHugger 1.0 | 3 | 4% | 5 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.4 | 107 / 210 | 3.49 | 16.7% | 29869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 16.7% | 107 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 14.0% | 26 |
| bvh.micro.Freya 0.3 | 3.5 | 11.5% | 17 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.5% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.0% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 4 |
| ap.Frederick 1.1 | 7.7 | 7.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 9.7 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 68.9 | 16 / 35 | 4823 |
| 2 | 2 | 60.8 | 58.1 | 12 / 35 | 4842 |
| 3 | 1 | 65.9 | 75.6 | 18 / 35 | 5136 |
| 4 | 1 | 66.9 | 80.3 | 21 / 35 | 4941 |
| 5 | 1 | 66.4 | 75.2 | 22 / 35 | 5153 |
| 6 | 1 | 66.3 | 76.2 | 18 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 61 | 90% |
| dummy.micro.Sparrow 2.5 | 19 | 95% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 82% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 23% | 77 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 21% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 28 |
| bvh.micro.Freya 0.3 | 13 | 13% | 23 |
| dummy.micro.Sparrow 2.5 | 12 | 12% | 30 |
| conscience.Electron 1.3g | 10 | 10% | 13 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |
| dl.BetterWalls 1.0 | 4 | 4% | 7 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.3 | 154 / 210 | 2.32 | 21.1% | 41838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.1% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 12 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 7 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 7 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 2 |
| sample.Corners 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 79.7 | 26 / 35 | 6631 |
| 2 | 1 | 73.7 | 94.0 | 28 / 35 | 7958 |
| 3 | 1 | 71.0 | 82.5 | 26 / 35 | 7011 |
| 4 | 1 | 70.7 | 84.8 | 26 / 35 | 6600 |
| 5 | 1 | 71.2 | 85.4 | 23 / 35 | 7061 |
| 6 | 1 | 70.8 | 85.4 | 25 / 35 | 6577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 95% |
| supersample.SuperBoxBot 1.0 | 26 | 92% |
| dsw.StaticD 1.0 | 18 | 61% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 34% | 38 |
| dsw.StaticD 1.0 | 13 | 23% | 25 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 14% | 50 |
| tlp.ThreeLeggedPig 1 | 6 | 11% | 12 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 20 |
| sul.Lunar 1.1 | 4 | 7% | 51 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.6 | 116 / 210 | 2.48 | 19.3% | 39558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.3% | 116 |
| radnor.DoctorBob 1.42 | 2.5 | 12.6% | 22 |
| mld.Wisdom 1.0 | 3.0 | 12.1% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.7% | 25 |
| KiraNL.Chupacabra 0.4 | 5.0 | 9.9% | 10 |
| amz.NanoClone 1.41 | 5.3 | 10.5% | 13 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 1 |
| sample.Walls 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.3 | 6.7% | 2 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 23 / 35 | 6933 |
| 2 | 1 | 70.6 | 89.2 | 23 / 35 | 6824 |
| 3 | 1 | 67.7 | 77.5 | 14 / 35 | 6838 |
| 4 | 1 | 66.6 | 77.8 | 15 / 35 | 5945 |
| 5 | 1 | 69.6 | 85.4 | 23 / 35 | 6385 |
| 6 | 1 | 68.2 | 80.6 | 18 / 35 | 6633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 83% |
| radnor.DoctorBob 1.42 | 35 | 86% |
| mld.Wisdom 1.0 | 22 | 68% |
| amz.NanoClone 1.41 | 18 | 67% |
| KiraNL.Chupacabra 0.4 | 14 | 93% |
| sample.Walls 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 29% | 43 |
| radnor.DoctorBob 1.42 | 20 | 21% | 55 |
| KiraNL.Chupacabra 0.4 | 14 | 15% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 14% | 45 |
| amz.NanoClone 1.41 | 11 | 12% | 21 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |

