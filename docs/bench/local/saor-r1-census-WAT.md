# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 143 / 210 | 2.10 | 21.2% | 43315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.2% | 143 |
| radnor.DoctorBob 1.42 | 2.3 | 14.7% | 31 |
| mz.AntiGrav 1.0 | 2.7 | 14.6% | 19 |
| mld.Infinity 2.2 | 4.0 | 12.7% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 3 |
| sample.Walls 1.0 | 6.5 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 8.7 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 86.7 | 22 / 35 | 6917 |
| 2 | 1 | 72.4 | 90.8 | 25 / 35 | 6854 |
| 3 | 1 | 72.1 | 87.3 | 25 / 35 | 7422 |
| 4 | 1 | 72.9 | 89.5 | 26 / 35 | 7445 |
| 5 | 1 | 73.0 | 87.6 | 24 / 35 | 7979 |
| 6 | 1 | 71.0 | 84.8 | 21 / 35 | 6698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 85 | 93% |
| radnor.DoctorBob 1.42 | 32 | 66% |
| mld.Infinity 2.2 | 29 | 93% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 36% | 53 |
| mz.AntiGrav 1.0 | 17 | 25% | 86 |
| amz.NanoClone 1.41 | 12 | 18% | 17 |
| mld.Infinity 2.2 | 10 | 15% | 34 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 5 |
| sample.Walls 1.0 | 1 | 1% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 131 / 210 | 2.05 | 19.2% | 32286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.2% | 131 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.1% | 50 |
| mld.DustBunny 3.8 | 3.3 | 13.5% | 20 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.3% | 3 |
| zyx.nano.Ant 1.1 | 6.3 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.7% | 1 |
| bzdp.BoxCar 2.0 | 8.2 | 6.4% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.1% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 23 / 35 | 5673 |
| 2 | 1 | 67.1 | 81.9 | 19 / 35 | 4813 |
| 3 | 1 | 68.0 | 85.4 | 19 / 35 | 5310 |
| 4 | 1 | 71.9 | 97.1 | 32 / 35 | 6030 |
| 5 | 1 | 68.0 | 83.8 | 18 / 35 | 5309 |
| 6 | 1 | 68.8 | 89.2 | 20 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 75% |
| mld.DustBunny 3.8 | 64 | 80% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 42% | 85 |
| mld.DustBunny 3.8 | 30 | 38% | 76 |
| maribo.melee.BMV 0.1 | 4 | 5% | 14 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 9 |
| fullsail.SweetTea 1.1 | 4 | 5% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 11 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 0 | 0% | 5 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.5 | 143 / 210 | 2.30 | 20.0% | 35868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.0% | 143 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.8% | 18 |
| fm.mammillarias 1.3 | 5.0 | 9.5% | 3 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.3 | 6.0% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.3 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.2 | 24 / 35 | 5367 |
| 2 | 1 | 71.0 | 88.6 | 21 / 35 | 6559 |
| 3 | 1 | 67.8 | 81.3 | 20 / 35 | 5443 |
| 4 | 1 | 69.7 | 85.4 | 26 / 35 | 5645 |
| 5 | 1 | 71.8 | 90.5 | 27 / 35 | 6558 |
| 6 | 1 | 70.8 | 85.1 | 25 / 35 | 6296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 86% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| myl.nano.KomoriNinja 1.1 | 12 | 83% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| sample.Tracker 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 22 | 33% | 80 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 22% | 35 |
| cb.nano.Insomnia 1.0 | 8 | 12% | 18 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 30 |
| fm.mammillarias 1.3 | 7 | 10% | 15 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 13 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 11 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 83.7 | 134 / 210 | 2.47 | 19.7% | 37863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.7% | 134 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.3% | 11 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 16 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.5% | 26 |
| tj.zombie1n 1.0.1 | 5.3 | 9.5% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 7 |
| yk.JahMicro 1.0 | 7.7 | 7.5% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.0 | 22 / 35 | 6688 |
| 2 | 1 | 70.7 | 86.3 | 24 / 35 | 6600 |
| 3 | 1 | 67.6 | 78.7 | 22 / 35 | 5786 |
| 4 | 1 | 70.3 | 86.0 | 23 / 35 | 6614 |
| 5 | 1 | 69.7 | 86.0 | 22 / 35 | 6169 |
| 6 | 1 | 67.8 | 78.7 | 21 / 35 | 6006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 41 | 85% |
| kawigi.nano.Lib 1.0 | 39 | 92% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 80% |
| tj.zombie1n 1.0.1 | 18 | 72% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 50% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 46% | 81 |
| stelo.SoJNanoMelee 1.1 | 15 | 20% | 44 |
| tj.zombie1n 1.0.1 | 8 | 11% | 11 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 3 |
| sample.VelociRobot 1.0 | 2 | 3% | 8 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| repositorio.NanoStep 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.9 | 87 / 210 | 3.89 | 15.7% | 29016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 15.7% | 87 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 39 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 26 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.2% | 25 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.6% | 8 |
| EBBU.Sim2 1.02 | 6.3 | 9.8% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.9% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 61.9 | 13 / 35 | 4813 |
| 2 | 1 | 64.2 | 70.2 | 15 / 35 | 4885 |
| 3 | 1 | 62.7 | 63.8 | 16 / 35 | 4691 |
| 4 | 1 | 61.9 | 63.8 | 11 / 35 | 4805 |
| 5 | 1 | 65.7 | 74.9 | 17 / 35 | 5047 |
| 6 | 1 | 64.1 | 72.7 | 15 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 84% |
| ahf.NanoAndrew .4 | 26 | 81% |
| oog.melee.Corsair 1.0 | 22 | 59% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 22% | 51 |
| oog.melee.Corsair 1.0 | 22 | 18% | 41 |
| zyx.nano.BacillusComma 1.0 | 18 | 15% | 20 |
| ahf.NanoAndrew .4 | 17 | 14% | 36 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 12 |
| EBBU.Sim2 1.02 | 9 | 7% | 15 |
| sam.Samspin 1.0 | 2 | 2% | 11 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.0 | 134 / 210 | 2.26 | 19.2% | 32601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.2% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.7% | 15 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.4% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 4 |
| fm.claire 1.7 | 6.7 | 8.1% | 1 |
| sample.SpinBot 1.0 | 8.3 | 6.3% | 0 |
| pa.Improved 1.0 | 9.2 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 22 / 35 | 5315 |
| 2 | 1 | 69.9 | 89.8 | 27 / 35 | 5160 |
| 3 | 1 | 69.4 | 85.7 | 23 / 35 | 5719 |
| 4 | 1 | 66.6 | 78.7 | 17 / 35 | 5463 |
| 5 | 1 | 70.2 | 90.2 | 25 / 35 | 5755 |
| 6 | 1 | 67.4 | 83.8 | 20 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 76% |
| oog.melee.CapuletDroid 1.1 | 40 | 98% |
| arthord.NanoSatanMelee Beta | 20 | 100% |
| gh.nano.Grofvuil 0.2 | 15 | 67% |
| kurios.DOSexe .9b | 7 | 86% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 42% | 78 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 25 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 22 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 43 |
| fm.claire 1.7 | 6 | 8% | 9 |
| sample.SpinBot 1.0 | 4 | 5% | 8 |
| pa.Improved 1.0 | 4 | 5% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 7 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.4 | 100 / 210 | 2.76 | 17.9% | 33821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 17.9% | 100 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.4% | 47 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.4% | 33 |
| mz.MicroGodMelee 1 | 3.7 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 75.9 | 11 / 35 | 5522 |
| 2 | 1 | 67.8 | 83.5 | 14 / 35 | 5663 |
| 3 | 1 | 69.7 | 87.3 | 23 / 35 | 5757 |
| 4 | 1 | 68.8 | 81.0 | 21 / 35 | 5852 |
| 5 | 1 | 67.5 | 79.7 | 17 / 35 | 5626 |
| 6 | 2 | 66.0 | 75.2 | 14 / 35 | 5401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 79% |
| mz.MicroGodMelee 1 | 43 | 65% |
| gh.micro.Gruweltje 0.7 | 31 | 45% |
| DBall.Anarchy 0.1 | 7 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 36 | 32% | 60 |
| mz.MicroGodMelee 1 | 31 | 28% | 64 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 57 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 7 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.0 | 103 / 210 | 3.79 | 16.0% | 29375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.5 | 16.0% | 103 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.9% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 37 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 10.2% | 11 |
| germ.TheMind .2 | 5.3 | 9.7% | 8 |
| awesomeness.Elite 1.0 | 6.0 | 8.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 2 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 70.2 | 14 / 35 | 4639 |
| 2 | 2 | 61.9 | 63.2 | 16 / 35 | 4809 |
| 3 | 1 | 65.2 | 72.1 | 18 / 35 | 5156 |
| 4 | 1 | 63.4 | 66.3 | 17 / 35 | 4685 |
| 5 | 2 | 63.9 | 67.9 | 18 / 35 | 4803 |
| 6 | 1 | 66.3 | 74.6 | 20 / 35 | 5283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 90% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 5 | 100% |
| germ.TheMind .2 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 376. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 47% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 14% | 35 |
| germ.TheMind .2 | 15 | 14% | 17 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 13 |
| awesomeness.Elite 1.0 | 6 | 6% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.7 | 165 / 210 | 1.84 | 20.5% | 31302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.5% | 165 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 5 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 4 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 1 |
| stelo.PatternRobot 1.0 | 6.8 | 8.3% | 11 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 5 |
| spinnercat.Omen 1.0 | 8.8 | 7.4% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.3 | 28 / 35 | 5660 |
| 2 | 1 | 69.5 | 84.8 | 25 / 35 | 5272 |
| 3 | 1 | 70.5 | 89.2 | 27 / 35 | 5090 |
| 4 | 1 | 70.8 | 90.5 | 29 / 35 | 5043 |
| 5 | 1 | 71.5 | 94.3 | 27 / 35 | 5114 |
| 6 | 1 | 71.6 | 91.1 | 29 / 35 | 5123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 96% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| stelo.PatternRobot 1.0 | 19 | 84% |
| timmit.nano.TimDog 0.33 | 17 | 88% |
| ratosh.Wesco 1.4 | 12 | 92% |
| maribo.IotaCT 1.1 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 24% | 68 |
| stelo.PatternRobot 1.0 | 10 | 22% | 21 |
| nz.jdc.nano.GridFu 1.0 | 8 | 17% | 54 |
| timmit.nano.TimDog 0.33 | 8 | 17% | 21 |
| ratosh.Wesco 1.4 | 3 | 7% | 15 |
| maribo.IotaCT 1.1 | 2 | 4% | 20 |
| spinnercat.Omen 1.0 | 2 | 4% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.9 | 177 / 210 | 1.73 | 21.6% | 38803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.6% | 177 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 12 |
| baal.nano.N 1.42 | 3.0 | 11.8% | 7 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.3% | 3 |
| zyx.micro.Ant 1.1 | 4.7 | 9.8% | 7 |
| sanja.First 0.1 | 7.3 | 7.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.5% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 6.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 85.1 | 28 / 35 | 6340 |
| 2 | 1 | 71.4 | 90.8 | 30 / 35 | 6222 |
| 3 | 1 | 72.3 | 93.0 | 29 / 35 | 6790 |
| 4 | 1 | 71.2 | 91.4 | 30 / 35 | 6113 |
| 5 | 1 | 71.8 | 94.0 | 30 / 35 | 6427 |
| 6 | 1 | 73.0 | 96.8 | 30 / 35 | 6911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 47 | 96% |
| tvv.nano.Polaris 1.2 | 39 | 97% |
| cvt.Firsty 1.0 | 31 | 94% |
| zyx.micro.Ant 1.1 | 23 | 91% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| sanja.First 0.1 | 9 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 27% | 44 |
| Grystrion.TrackerWO 1.0 | 8 | 24% | 19 |
| tvv.nano.Polaris 1.2 | 4 | 12% | 55 |
| baal.nano.N 1.42 | 4 | 12% | 45 |
| cvt.Firsty 1.0 | 4 | 12% | 28 |
| sample.RamFire 1.0 | 2 | 6% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |
| sanja.First 0.1 | 0 | 0% | 12 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.9 | 94 / 210 | 3.26 | 16.8% | 32705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.8% | 94 |
| kc.micro.Figment 1.0 | 1.8 | 14.6% | 60 |
| cs.Wren 1.0 | 3.0 | 12.8% | 25 |
| js.PinBall 1.6 | 4.2 | 11.5% | 17 |
| mz.Cork 0.1 | 5.2 | 10.5% | 6 |
| joe.ADinosaur 1.0 | 5.7 | 9.0% | 3 |
| evd.X1 0.01 | 7.0 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.2 | 14 / 35 | 5068 |
| 2 | 1 | 65.9 | 75.9 | 16 / 35 | 5517 |
| 3 | 2 | 62.6 | 67.0 | 11 / 35 | 5300 |
| 4 | 1 | 64.5 | 72.1 | 15 / 35 | 5276 |
| 5 | 1 | 67.6 | 80.0 | 21 / 35 | 5855 |
| 6 | 1 | 67.1 | 79.4 | 17 / 35 | 5689 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 67% |
| cs.Wren 1.0 | 31 | 81% |
| mz.Cork 0.1 | 11 | 100% |
| donjezza.Jezza 1.0 | 8 | 88% |
| js.PinBall 1.6 | 5 | 80% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 44% | 96 |
| cs.Wren 1.0 | 18 | 16% | 36 |
| js.PinBall 1.6 | 17 | 15% | 26 |
| evd.X1 0.01 | 9 | 8% | 10 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| joe.ADinosaur 1.0 | 6 | 5% | 6 |
| mz.Cork 0.1 | 4 | 3% | 16 |
| donjezza.Jezza 1.0 | 3 | 3% | 10 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.5 | 137 / 210 | 2.40 | 19.1% | 29259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.1% | 137 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 24 |
| ntc.Opposite 1.5 | 3.3 | 11.0% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.4% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 4 |
| disan.Chair 2.2.0 | 6.7 | 8.6% | 7 |
| DBall.NUKE 0.1 | 8.0 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.5 | 26 / 35 | 5148 |
| 2 | 1 | 69.5 | 90.5 | 24 / 35 | 4717 |
| 3 | 1 | 66.2 | 75.2 | 18 / 35 | 4938 |
| 4 | 1 | 68.4 | 82.2 | 22 / 35 | 4900 |
| 5 | 1 | 69.4 | 85.7 | 28 / 35 | 5028 |
| 6 | 1 | 67.3 | 83.8 | 19 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 50 | 86% |
| stelo.AreaTargetingBot 1.1 | 31 | 84% |
| ntc.Opposite 1.5 | 20 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| donjezza.Muncho 1.0 | 12 | 100% |
| disan.Chair 2.2.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| DBall.NUKE 0.1 | 7 | 86% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 76 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 20% | 58 |
| ntc.Opposite 1.5 | 13 | 17% | 26 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 14% | 22 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 20 |
| disan.Chair 2.2.0 | 7 | 9% | 18 |
| pbg.R2D2 1.0 | 4 | 5% | 8 |
| DBall.NUKE 0.1 | 3 | 4% | 10 |
| donjezza.Muncho 1.0 | 2 | 3% | 7 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.7 | 81 / 210 | 3.37 | 16.1% | 27031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.1% | 81 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 38 |
| oog.melee.Capulet 1.2 | 3.0 | 13.6% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.1% | 27 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 5 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 7 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.8 | 13 / 35 | 3965 |
| 2 | 1 | 69.3 | 84.8 | 21 / 35 | 5418 |
| 3 | 1 | 66.7 | 76.5 | 15 / 35 | 4576 |
| 4 | 1 | 65.2 | 72.1 | 13 / 35 | 4797 |
| 5 | 2 | 62.8 | 70.5 | 9 / 35 | 4100 |
| 6 | 1 | 62.3 | 67.3 | 10 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 85% |
| kawigi.micro.Shiz 1.1 | 20 | 100% |
| yagami.Tidus 0.11 | 11 | 91% |
| ejb.Polaris 1.0.1 | 6 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 40% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 16% | 49 |
| yagami.Tidus 0.11 | 21 | 16% | 34 |
| ejb.Polaris 1.0.1 | 18 | 14% | 26 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 24 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.4 | 137 / 210 | 2.68 | 18.0% | 28200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.0% | 137 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 21 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 16 |
| wee.Gem 1.8.4 | 4.0 | 11.2% | 23 |
| ratosh.Nobo 0.21 | 4.5 | 10.8% | 4 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 27 / 35 | 5097 |
| 2 | 1 | 67.2 | 81.0 | 23 / 35 | 4658 |
| 3 | 1 | 67.5 | 81.6 | 24 / 35 | 4690 |
| 4 | 1 | 66.7 | 81.0 | 21 / 35 | 4647 |
| 5 | 1 | 65.6 | 79.0 | 20 / 35 | 4333 |
| 6 | 1 | 66.0 | 77.1 | 22 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 95% |
| wee.Gem 1.8.4 | 26 | 96% |
| wompi.Quokka 1.6 | 19 | 95% |
| ratosh.Nobo 0.21 | 13 | 100% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 18% | 67 |
| wee.Gem 1.8.4 | 12 | 16% | 43 |
| ratosh.Nobo 0.21 | 10 | 14% | 23 |
| maribo.FollowFire 1 | 9 | 12% | 10 |
| wompi.Quokka 1.6 | 8 | 11% | 21 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 8 |
| bayen.UbaMicro 1.4 | 5 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 13 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 89.0 | 135 / 210 | 1.99 | 21.7% | 47457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.7% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 8 |
| ayk.WallHugger 1.0 | 4.5 | 9.4% | 2 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 3 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 92.7 | 23 / 35 | 8017 |
| 2 | 1 | 73.4 | 93.0 | 21 / 35 | 7724 |
| 3 | 1 | 73.8 | 90.5 | 26 / 35 | 8096 |
| 4 | 1 | 73.5 | 92.4 | 26 / 35 | 7733 |
| 5 | 1 | 71.8 | 82.9 | 17 / 35 | 8242 |
| 6 | 1 | 71.7 | 82.9 | 22 / 35 | 7645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 126 | 80% |
| exauge.GateKeeper 1.1.121g | 19 | 95% |
| mz.NanoGod 2.02 | 11 | 73% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 48% | 144 |
| mz.NanoGod 2.02 | 23 | 31% | 34 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 15 |
| ayk.WallHugger 1.0 | 4 | 5% | 9 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.6 | 108 / 210 | 3.20 | 17.1% | 29212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.1% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 25 |
| dummy.micro.Sparrow 2.5 | 3.0 | 13.0% | 24 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.1% | 18 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 5 |
| conscience.Electron 1.3g | 6.5 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.7 | 6.4% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.1 | 18 / 35 | 5015 |
| 2 | 1 | 66.6 | 78.7 | 19 / 35 | 4915 |
| 3 | 1 | 66.1 | 75.9 | 14 / 35 | 5283 |
| 4 | 1 | 62.2 | 64.1 | 14 / 35 | 4622 |
| 5 | 1 | 63.9 | 69.2 | 20 / 35 | 4637 |
| 6 | 1 | 69.0 | 88.6 | 23 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 83% |
| dummy.micro.Sparrow 2.5 | 34 | 88% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 90% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 24% | 69 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 46 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 14 |
| bvh.micro.Freya 0.3 | 10 | 10% | 18 |
| conscience.Electron 1.3g | 10 | 10% | 14 |
| dl.BetterWalls 1.0 | 10 | 10% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 85.2 | 140 / 210 | 2.33 | 20.9% | 41520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.9% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.7% | 9 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.1% | 12 |
| dsw.StaticD 1.0 | 4.8 | 9.4% | 18 |
| mme.NikeEnhanced 2.0 | 5.8 | 8.9% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 3 |
| sample.Corners 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.3 | 30 / 35 | 6948 |
| 2 | 1 | 71.9 | 87.6 | 26 / 35 | 6848 |
| 3 | 1 | 69.0 | 80.0 | 22 / 35 | 6396 |
| 4 | 1 | 68.6 | 75.6 | 18 / 35 | 6751 |
| 5 | 1 | 69.8 | 80.6 | 18 / 35 | 6819 |
| 6 | 1 | 73.4 | 93.0 | 26 / 35 | 7758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 100% |
| supersample.SuperBoxBot 1.0 | 34 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 96% |
| dsw.StaticD 1.0 | 21 | 38% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 4 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 23 | 32% | 38 |
| supersample.SuperBoxBot 1.0 | 20 | 28% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 18% | 50 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 11 |
| sul.Lunar 1.1 | 4 | 6% | 50 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 11 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.9 | 106 / 210 | 2.90 | 18.1% | 36690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.1% | 106 |
| radnor.DoctorBob 1.42 | 2.7 | 13.2% | 31 |
| mld.Wisdom 1.0 | 3.5 | 12.4% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 32 |
| amz.NanoClone 1.41 | 4.2 | 10.8% | 10 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.5% | 4 |
| sample.Walls 1.0 | 7.5 | 7.4% | 7 |
| GarmBox.Oranges 1.0 | 7.8 | 7.4% | 0 |
| jangs.ns51 1.0 | 8.7 | 5.9% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 77.5 | 19 / 35 | 6331 |
| 2 | 1 | 68.7 | 81.6 | 22 / 35 | 6377 |
| 3 | 1 | 65.4 | 75.2 | 15 / 35 | 5606 |
| 4 | 1 | 68.2 | 82.9 | 19 / 35 | 5759 |
| 5 | 1 | 66.7 | 77.5 | 18 / 35 | 5545 |
| 6 | 1 | 68.1 | 78.7 | 13 / 35 | 7072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 78% |
| radnor.DoctorBob 1.42 | 35 | 80% |
| mld.Wisdom 1.0 | 20 | 85% |
| amz.NanoClone 1.41 | 13 | 62% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 32% | 50 |
| radnor.DoctorBob 1.42 | 21 | 20% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 18% | 49 |
| KiraNL.Chupacabra 0.4 | 14 | 13% | 21 |
| amz.NanoClone 1.41 | 13 | 12% | 20 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

