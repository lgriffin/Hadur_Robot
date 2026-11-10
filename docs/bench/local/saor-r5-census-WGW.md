# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.1 | 149 / 210 | 1.90 | 21.8% | 44856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.8% | 149 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 15 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 23 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 15 |
| amz.NanoClone 1.41 | 4.8 | 10.7% | 6 |
| GarmBox.Oranges 1.0 | 6.8 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.1% | 1 |
| sample.Walls 1.0 | 7.3 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 8.7 | 4.8% | 0 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 94.0 | 27 / 35 | 7767 |
| 2 | 1 | 71.8 | 88.3 | 25 / 35 | 7038 |
| 3 | 1 | 74.0 | 96.5 | 29 / 35 | 7577 |
| 4 | 1 | 72.5 | 87.9 | 25 / 35 | 7546 |
| 5 | 1 | 72.7 | 90.8 | 22 / 35 | 7767 |
| 6 | 1 | 71.0 | 82.9 | 21 / 35 | 7161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 75 | 95% |
| mld.Infinity 2.2 | 40 | 95% |
| radnor.DoctorBob 1.42 | 30 | 87% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 41% | 54 |
| mz.AntiGrav 1.0 | 16 | 26% | 81 |
| mld.Infinity 2.2 | 10 | 16% | 46 |
| amz.NanoClone 1.41 | 5 | 8% | 13 |
| jangs.ns51 1.0 | 3 | 5% | 5 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.5 | 114 / 210 | 2.58 | 18.2% | 32632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.3 | 18.2% | 114 |
| mld.DustBunny 3.8 | 2.2 | 14.6% | 27 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.6% | 55 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 1 |
| zyx.nano.Ant 1.1 | 6.5 | 8.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 7.6% | 5 |
| fullsail.SweetTea 1.1 | 7.5 | 7.2% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 21 / 35 | 5906 |
| 2 | 3 | 60.0 | 55.6 | 8 / 35 | 4994 |
| 3 | 1 | 70.3 | 90.8 | 23 / 35 | 5758 |
| 4 | 1 | 68.0 | 87.9 | 19 / 35 | 5230 |
| 5 | 1 | 70.1 | 89.2 | 25 / 35 | 5809 |
| 6 | 1 | 66.6 | 80.6 | 18 / 35 | 4935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 68 | 91% |
| oog.melee.Mercutio 1.0 | 53 | 74% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 35% | 72 |
| mld.DustBunny 3.8 | 25 | 26% | 85 |
| maribo.melee.BMV 0.1 | 10 | 10% | 13 |
| zyx.nano.Ant 1.1 | 9 | 9% | 12 |
| cs.Grudge 1.0 | 8 | 8% | 9 |
| fullsail.SweetTea 1.1 | 5 | 5% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 82.4 | 123 / 210 | 2.58 | 19.8% | 38081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.8% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 15 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 9 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 7 |
| sample.Fire 1.0 | 9.3 | 5.0% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.0 | 23 / 35 | 6075 |
| 2 | 1 | 70.6 | 82.5 | 19 / 35 | 6805 |
| 3 | 1 | 70.3 | 85.4 | 20 / 35 | 6582 |
| 4 | 1 | 68.3 | 79.7 | 19 / 35 | 6028 |
| 5 | 1 | 69.6 | 80.6 | 21 / 35 | 6564 |
| 6 | 1 | 68.6 | 79.4 | 21 / 35 | 6027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 97% |
| cb.nano.Insomnia 1.0 | 22 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 21 | 67% |
| myl.nano.KomoriNinja 1.1 | 19 | 63% |
| sp.Nanos.Ember 1.1 | 11 | 82% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 34 |
| myl.micro.Troodon 1.10 | 17 | 20% | 68 |
| myl.nano.KomoriNinja 1.1 | 16 | 18% | 41 |
| cb.nano.Insomnia 1.0 | 14 | 16% | 21 |
| fm.mammillarias 1.3 | 10 | 11% | 12 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 18 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| sample.Fire 1.0 | 1 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.8 | 160 / 210 | 2.00 | 21.3% | 41629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.3% | 160 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 10 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 14 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.4% | 7 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.3% | 5 |
| repositorio.NanoStep 1.0 | 8.5 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.6 | 26 / 35 | 6798 |
| 2 | 1 | 72.1 | 94.0 | 27 / 35 | 6865 |
| 3 | 1 | 70.0 | 84.4 | 24 / 35 | 6546 |
| 4 | 1 | 70.2 | 83.8 | 26 / 35 | 6571 |
| 5 | 1 | 73.8 | 96.5 | 31 / 35 | 7786 |
| 6 | 1 | 70.9 | 85.7 | 26 / 35 | 7063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 92% |
| tvv.micro.Antares 1.1.1 | 29 | 97% |
| stelo.SoJNanoMelee 1.1 | 28 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 44% | 97 |
| tj.zombie1n 1.0.1 | 8 | 16% | 11 |
| tvv.micro.Antares 1.1.1 | 5 | 10% | 30 |
| stelo.SoJNanoMelee 1.1 | 5 | 10% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 23 |
| yk.JahMicro 1.0 | 2 | 4% | 6 |
| sample.VelociRobot 1.0 | 2 | 4% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 68.8 | 82 / 210 | 3.81 | 16.2% | 31763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.2% | 82 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 29 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.6% | 22 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 18 |
| EBBU.Sim2 1.02 | 5.5 | 9.7% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 69.2 | 11 / 35 | 5527 |
| 2 | 1 | 65.2 | 69.8 | 14 / 35 | 5805 |
| 3 | 1 | 65.4 | 72.1 | 14 / 35 | 5338 |
| 4 | 1 | 64.4 | 70.5 | 16 / 35 | 5151 |
| 5 | 1 | 63.0 | 65.1 | 15 / 35 | 5019 |
| 6 | 1 | 62.5 | 66.0 | 12 / 35 | 4923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 79% |
| ahf.NanoAndrew .4 | 30 | 60% |
| oog.melee.Corsair 1.0 | 29 | 66% |
| EBBU.Sim2 1.02 | 8 | 88% |
| sam.Samspin 1.0 | 7 | 71% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 44 |
| simonton.nano.MeleeSeed 1.8 | 25 | 20% | 43 |
| ahf.NanoAndrew .4 | 21 | 16% | 43 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 19 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 16 |
| sam.Samspin 1.0 | 9 | 7% | 19 |
| EBBU.Sim2 1.02 | 8 | 6% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 8 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.5 | 118 / 210 | 2.40 | 18.6% | 31651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.6% | 118 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.4% | 45 |
| gh.nano.Grofvuil 0.2 | 3.8 | 10.4% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 9.9% | 12 |
| arthord.NanoSatanMelee Beta | 4.7 | 9.6% | 8 |
| fm.claire 1.7 | 6.0 | 8.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.6% | 11 |
| sample.SpinBot 1.0 | 8.3 | 7.0% | 4 |
| pa.Improved 1.0 | 9.2 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.7 | 22 / 35 | 5366 |
| 2 | 1 | 67.0 | 83.2 | 16 / 35 | 5187 |
| 3 | 1 | 67.0 | 83.8 | 18 / 35 | 4814 |
| 4 | 1 | 68.9 | 85.7 | 21 / 35 | 5464 |
| 5 | 1 | 67.9 | 82.2 | 19 / 35 | 5768 |
| 6 | 1 | 68.0 | 85.4 | 22 / 35 | 5052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 73% |
| oog.melee.CapuletDroid 1.1 | 19 | 95% |
| arthord.NanoSatanMelee Beta | 17 | 76% |
| gh.nano.Grofvuil 0.2 | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| sample.SpinBot 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 46% | 97 |
| arthord.NanoSatanMelee Beta | 14 | 15% | 21 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 32 |
| gh.nano.Grofvuil 0.2 | 9 | 10% | 21 |
| winamp32.micro.MicroMacro 1.0 | 7 | 8% | 17 |
| sample.SpinBot 1.0 | 4 | 4% | 9 |
| fm.claire 1.7 | 3 | 3% | 6 |
| kurios.DOSexe .9b | 2 | 2% | 4 |
| pa.Improved 1.0 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.6 | 104 / 210 | 2.75 | 18.5% | 36649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.5% | 104 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 37 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 28 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.7% | 2 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.3% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 1 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 14 / 35 | 5957 |
| 2 | 1 | 69.8 | 85.7 | 17 / 35 | 6745 |
| 3 | 1 | 66.3 | 76.8 | 15 / 35 | 5526 |
| 4 | 1 | 68.4 | 79.4 | 18 / 35 | 6250 |
| 5 | 1 | 71.2 | 91.7 | 25 / 35 | 6444 |
| 6 | 1 | 66.4 | 73.0 | 15 / 35 | 5727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 62 | 87% |
| mz.MicroGodMelee 1 | 31 | 68% |
| gh.micro.Gruweltje 0.7 | 30 | 60% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 29 | 27% | 53 |
| mz.MicroGodMelee 1 | 29 | 27% | 52 |
| spinnercat.micro.Tyger 0.1 | 25 | 24% | 70 |
| fire219.CatBot 1.0 | 7 | 7% | 7 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 4 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 67.6 | 93 / 210 | 3.92 | 15.9% | 30273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.5 | 15.9% | 93 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.9% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 38 |
| germ.TheMind .2 | 5.2 | 9.3% | 8 |
| awesomeness.Elite 1.0 | 5.3 | 9.1% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.3% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 1 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.0% | 5 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 72.1 | 21 / 35 | 5239 |
| 2 | 1 | 65.2 | 70.5 | 17 / 35 | 5165 |
| 3 | 1 | 64.3 | 67.6 | 16 / 35 | 5289 |
| 4 | 1 | 63.9 | 68.6 | 15 / 35 | 5051 |
| 5 | 2 | 62.9 | 63.5 | 16 / 35 | 4865 |
| 6 | 3 | 61.4 | 63.2 | 8 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 92% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| germ.TheMind .2 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 46% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 19% | 39 |
| awesomeness.Elite 1.0 | 12 | 10% | 18 |
| germ.TheMind .2 | 11 | 9% | 19 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 12 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.9 | 144 / 210 | 2.18 | 20.2% | 33431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.2% | 144 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.6% | 12 |
| maribo.IotaCT 1.1 | 4.0 | 10.9% | 9 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 9 |
| ratosh.Wesco 1.4 | 7.0 | 8.7% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.5% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 82.5 | 22 / 35 | 5292 |
| 2 | 1 | 71.5 | 87.6 | 27 / 35 | 5904 |
| 3 | 1 | 69.3 | 81.3 | 22 / 35 | 5325 |
| 4 | 1 | 70.0 | 85.7 | 22 / 35 | 5505 |
| 5 | 1 | 70.5 | 88.3 | 22 / 35 | 5715 |
| 6 | 1 | 72.9 | 96.2 | 29 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 77 | 90% |
| nz.jdc.nano.GridFu 1.0 | 31 | 90% |
| maribo.IotaCT 1.1 | 12 | 92% |
| timmit.nano.TimDog 0.33 | 11 | 73% |
| ratosh.Wesco 1.4 | 10 | 80% |
| stelo.PatternRobot 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 30% | 80 |
| timmit.nano.TimDog 0.33 | 12 | 18% | 25 |
| nz.jdc.nano.GridFu 1.0 | 11 | 16% | 42 |
| ratosh.Wesco 1.4 | 9 | 13% | 25 |
| stelo.PatternRobot 1.0 | 6 | 9% | 13 |
| maribo.IotaCT 1.1 | 5 | 7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.9 | 149 / 210 | 2.27 | 20.4% | 38379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 20.4% | 149 |
| baal.nano.N 1.42 | 2.2 | 12.6% | 16 |
| tvv.nano.Polaris 1.2 | 3.2 | 12.2% | 18 |
| zyx.micro.Ant 1.1 | 4.2 | 9.7% | 10 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.3% | 3 |
| sanja.First 0.1 | 6.3 | 8.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.8% | 2 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 26 / 35 | 6487 |
| 2 | 1 | 68.8 | 82.9 | 23 / 35 | 5829 |
| 3 | 1 | 70.7 | 87.3 | 27 / 35 | 6467 |
| 4 | 1 | 70.8 | 87.3 | 25 / 35 | 6607 |
| 5 | 1 | 69.9 | 82.2 | 24 / 35 | 6514 |
| 6 | 1 | 69.5 | 83.8 | 24 / 35 | 6475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 87% |
| tvv.nano.Polaris 1.2 | 32 | 84% |
| zyx.micro.Ant 1.1 | 24 | 92% |
| cvt.Firsty 1.0 | 21 | 81% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| sanja.First 0.1 | 15 | 93% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 15 | 25% | 55 |
| zyx.micro.Ant 1.1 | 10 | 16% | 34 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 39 |
| cvt.Firsty 1.0 | 7 | 11% | 22 |
| Grystrion.TrackerWO 1.0 | 6 | 10% | 17 |
| sample.RamFire 1.0 | 5 | 8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 4 | 7% | 4 |
| sanja.First 0.1 | 3 | 5% | 20 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 8 |

## Melee bench: F11

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.6 | 85 / 210 | 3.74 | 15.7% | 31460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.5 | 15.7% | 85 |
| kc.micro.Figment 1.0 | 1.5 | 16.3% | 73 |
| cs.Wren 1.0 | 3.3 | 12.1% | 16 |
| js.PinBall 1.6 | 4.3 | 10.9% | 13 |
| mz.Cork 0.1 | 4.3 | 10.8% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 8.9% | 3 |
| evd.X1 0.01 | 7.3 | 7.7% | 3 |
| jsal.Jsalbot 1.0 | 7.7 | 7.3% | 8 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.8 | 15 / 35 | 5932 |
| 2 | 1 | 65.1 | 75.9 | 15 / 35 | 5004 |
| 3 | 2 | 63.2 | 67.3 | 16 / 35 | 4909 |
| 4 | 2 | 61.1 | 61.6 | 9 / 35 | 5038 |
| 5 | 1 | 64.7 | 70.2 | 16 / 35 | 5578 |
| 6 | 2 | 61.9 | 64.8 | 14 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 74% |
| cs.Wren 1.0 | 22 | 82% |
| mz.Cork 0.1 | 11 | 91% |
| js.PinBall 1.6 | 8 | 75% |
| jsal.Jsalbot 1.0 | 7 | 86% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 42% | 98 |
| joe.ADinosaur 1.0 | 16 | 13% | 19 |
| cs.Wren 1.0 | 15 | 12% | 28 |
| evd.X1 0.01 | 15 | 12% | 17 |
| js.PinBall 1.6 | 9 | 7% | 18 |
| mz.Cork 0.1 | 9 | 7% | 15 |
| jsal.Jsalbot 1.0 | 5 | 4% | 9 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.2 | 127 / 210 | 2.51 | 19.2% | 31898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 19.2% | 127 |
| myl.nano.Graviton 1.10 | 2.5 | 11.8% | 21 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.7% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 9.9% | 18 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.1% | 2 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 10 |
| DBall.NUKE 0.1 | 8.2 | 7.6% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.3% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 19 / 35 | 5439 |
| 2 | 1 | 70.1 | 89.5 | 23 / 35 | 5291 |
| 3 | 1 | 70.2 | 89.5 | 23 / 35 | 5542 |
| 4 | 1 | 68.5 | 82.5 | 22 / 35 | 5279 |
| 5 | 1 | 67.2 | 78.4 | 20 / 35 | 5223 |
| 6 | 1 | 66.9 | 77.5 | 20 / 35 | 5124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 49 | 94% |
| ntc.Opposite 1.5 | 24 | 75% |
| stelo.AreaTargetingBot 1.1 | 22 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| donjezza.Muncho 1.0 | 11 | 91% |
| disan.Chair 2.2.0 | 8 | 63% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| DBall.NUKE 0.1 | 7 | 71% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 18% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 16% | 27 |
| stelo.AreaTargetingBot 1.1 | 13 | 16% | 24 |
| ntc.Opposite 1.5 | 12 | 14% | 31 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 16 |
| disan.Chair 2.2.0 | 8 | 10% | 20 |
| pbg.R2D2 1.0 | 4 | 5% | 10 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |
| DBall.NUKE 0.1 | 3 | 4% | 11 |

## Melee bench: F13

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.5 | 90 / 210 | 3.30 | 16.2% | 26500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.2 | 16.2% | 90 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 40 |
| oog.melee.Capulet 1.2 | 3.7 | 12.9% | 39 |
| yagami.Tidus 0.11 | 3.8 | 12.3% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 24 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 6 |
| stelo.MirrorNano 1.3 | 7.0 | 7.5% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 70.2 | 11 / 35 | 4593 |
| 2 | 1 | 66.5 | 78.4 | 16 / 35 | 4681 |
| 3 | 1 | 65.6 | 75.2 | 16 / 35 | 4435 |
| 4 | 1 | 64.1 | 68.9 | 17 / 35 | 4200 |
| 5 | 1 | 66.8 | 79.4 | 17 / 35 | 4768 |
| 6 | 2 | 64.4 | 74.9 | 13 / 35 | 3823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 30 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 77% |
| yagami.Tidus 0.11 | 27 | 93% |
| oog.melee.Capulet 1.2 | 19 | 42% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 34% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 18% | 48 |
| yagami.Tidus 0.11 | 16 | 13% | 39 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 26 |
| ejb.Polaris 1.0.1 | 10 | 8% | 17 |
| stelo.MirrorNano 1.3 | 9 | 8% | 8 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| step.nanoPri 1.0 | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.7 | 130 / 210 | 2.73 | 17.9% | 28393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 17.9% | 130 |
| bzdp.Pansy 2.1 | 2.2 | 12.8% | 24 |
| ratosh.Nobo 0.21 | 3.7 | 11.3% | 9 |
| wee.Gem 1.8.4 | 4.2 | 10.9% | 18 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 17 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 6 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.7 | 19 / 35 | 4751 |
| 2 | 1 | 63.4 | 70.5 | 19 / 35 | 4334 |
| 3 | 1 | 69.3 | 89.5 | 24 / 35 | 5059 |
| 4 | 1 | 67.6 | 81.3 | 25 / 35 | 4704 |
| 5 | 1 | 68.4 | 87.6 | 22 / 35 | 4767 |
| 6 | 1 | 67.5 | 82.9 | 21 / 35 | 4778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 91% |
| wee.Gem 1.8.4 | 27 | 93% |
| ratosh.Nobo 0.21 | 25 | 88% |
| wompi.Quokka 1.6 | 14 | 93% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 8 | 50% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 21% | 62 |
| bayen.UbaMicro 1.4 | 13 | 16% | 20 |
| wompi.Quokka 1.6 | 9 | 11% | 19 |
| wee.Gem 1.8.4 | 8 | 10% | 35 |
| ratosh.Nobo 0.21 | 8 | 10% | 29 |
| m3thos.Eva00 1.1 | 7 | 9% | 18 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 9 |
| maribo.FollowFire 1 | 6 | 7% | 8 |

## Melee bench: F15

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.5 | 92.9 | 148 / 210 | 1.64 | 23.2% | 51806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 23.2% | 148 |
| wompi.Wallaby 5.1 | 2.0 | 17.0% | 44 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 12 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.2% | 5 |
| ayk.WallHugger 1.0 | 4.7 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 4.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.9 | 94.3 | 26 / 35 | 8743 |
| 2 | 1 | 74.8 | 94.3 | 26 / 35 | 8777 |
| 3 | 1 | 75.6 | 96.2 | 28 / 35 | 8597 |
| 4 | 1 | 75.1 | 93.0 | 26 / 35 | 9049 |
| 5 | 1 | 73.5 | 89.8 | 19 / 35 | 8538 |
| 6 | 1 | 73.3 | 89.8 | 23 / 35 | 8102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 126 | 83% |
| exauge.GateKeeper 1.1.121g | 23 | 91% |
| mz.NanoGod 2.02 | 17 | 59% |
| ayk.WallHugger 1.0 | 7 | 86% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 28 | 44% | 142 |
| mz.NanoGod 2.02 | 28 | 44% | 43 |
| exauge.GateKeeper 1.1.121g | 4 | 6% | 11 |
| ayk.WallHugger 1.0 | 1 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 2% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 68.7 | 103 / 210 | 3.81 | 16.1% | 29719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 16.1% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 26 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 27 |
| bvh.micro.Freya 0.3 | 3.8 | 11.9% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.1% | 12 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.9% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 1 |
| ap.Frederick 1.1 | 7.8 | 7.2% | 7 |
| dl.BetterWalls 1.0 | 9.0 | 6.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.7 | 19 / 35 | 5114 |
| 2 | 1 | 64.0 | 70.8 | 17 / 35 | 4767 |
| 3 | 1 | 63.8 | 66.3 | 17 / 35 | 4890 |
| 4 | 1 | 63.6 | 67.6 | 17 / 35 | 5028 |
| 5 | 1 | 65.6 | 74.6 | 20 / 35 | 5164 |
| 6 | 1 | 61.3 | 59.4 | 13 / 35 | 4756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 91% |
| dummy.micro.Sparrow 2.5 | 24 | 83% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| ap.Frederick 1.1 | 11 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 82% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 21% | 45 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 20 |
| conscience.Electron 1.3g | 17 | 16% | 19 |
| voidious.micro.BlitzBat 1.05 | 15 | 14% | 58 |
| bvh.micro.Freya 0.3 | 11 | 10% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 22 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 13 |
| dl.BetterWalls 1.0 | 3 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.4 | 148 / 210 | 2.05 | 21.6% | 43726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 21.6% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.7 | 12.4% | 15 |
| supersample.SuperBoxBot 1.0 | 3.2 | 11.8% | 14 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 11 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 7 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 9 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 1 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.6 | 22 / 35 | 7654 |
| 2 | 1 | 71.2 | 85.1 | 27 / 35 | 7254 |
| 3 | 1 | 71.4 | 87.0 | 25 / 35 | 7052 |
| 4 | 1 | 72.2 | 92.4 | 24 / 35 | 7393 |
| 5 | 1 | 72.4 | 92.7 | 25 / 35 | 7007 |
| 6 | 1 | 71.9 | 84.4 | 25 / 35 | 7366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 46 | 98% |
| supersample.SuperBoxBot 1.0 | 38 | 82% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 92% |
| dsw.StaticD 1.0 | 18 | 56% |
| mme.NikeEnhanced 2.0 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 39% | 49 |
| dsw.StaticD 1.0 | 13 | 21% | 22 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 10% | 44 |
| sample.MyFirstRobot 1.0 | 6 | 10% | 15 |
| sul.Lunar 1.1 | 2 | 3% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.Corners 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 77.8 | 104 / 210 | 3.00 | 18.2% | 38722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGW 0.1 | 1.0 | 18.2% | 104 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 36 |
| mld.Wisdom 1.0 | 2.8 | 12.9% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.6% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 6 |
| sample.Walls 1.0 | 7.2 | 7.5% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.2 | 19 / 35 | 6591 |
| 2 | 1 | 69.1 | 81.3 | 21 / 35 | 6675 |
| 3 | 1 | 65.5 | 70.8 | 15 / 35 | 6100 |
| 4 | 1 | 64.3 | 67.6 | 13 / 35 | 5981 |
| 5 | 1 | 69.6 | 83.8 | 18 / 35 | 6932 |
| 6 | 1 | 68.5 | 80.0 | 18 / 35 | 6443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 41 | 68% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 100% |
| mld.Wisdom 1.0 | 16 | 63% |
| amz.NanoClone 1.41 | 13 | 92% |
| sample.Walls 1.0 | 11 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| jangs.ns51 1.0 | 5 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 30% | 48 |
| radnor.DoctorBob 1.42 | 29 | 27% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 16% | 42 |
| KiraNL.Chupacabra 0.4 | 13 | 12% | 25 |
| amz.NanoClone 1.41 | 8 | 8% | 19 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 3 | 3% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

