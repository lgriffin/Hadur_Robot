# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.6 | 155 / 210 | 1.94 | 21.6% | 42945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.6% | 155 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 10 |
| radnor.DoctorBob 1.42 | 3.2 | 13.8% | 23 |
| mld.Infinity 2.2 | 3.2 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 1 |
| sample.Walls 1.0 | 6.3 | 7.1% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.3% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 90.2 | 27 / 35 | 7613 |
| 2 | 1 | 72.8 | 89.5 | 25 / 35 | 7093 |
| 3 | 1 | 72.4 | 89.2 | 25 / 35 | 7260 |
| 4 | 1 | 71.8 | 90.8 | 24 / 35 | 6828 |
| 5 | 1 | 71.4 | 85.1 | 26 / 35 | 6691 |
| 6 | 1 | 73.6 | 92.7 | 28 / 35 | 7460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 96% |
| mld.Infinity 2.2 | 39 | 92% |
| radnor.DoctorBob 1.42 | 26 | 85% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 33% | 52 |
| mz.AntiGrav 1.0 | 11 | 20% | 76 |
| mld.Infinity 2.2 | 8 | 15% | 42 |
| amz.NanoClone 1.41 | 8 | 15% | 16 |
| jangs.ns51 1.0 | 4 | 7% | 8 |
| GarmBox.Oranges 1.0 | 3 | 5% | 3 |
| sample.Walls 1.0 | 2 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.8 | 142 / 210 | 2.00 | 19.5% | 32284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 19.5% | 142 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.5% | 37 |
| mld.DustBunny 3.8 | 2.5 | 13.6% | 13 |
| maribo.melee.BMV 0.1 | 4.5 | 10.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.7% | 6 |
| zyx.nano.Ant 1.1 | 6.0 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.6% | 7 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.2 | 5.5% | 0 |
| fullsail.SweetTea 1.1 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 97.5 | 30 / 35 | 5517 |
| 2 | 1 | 70.6 | 94.0 | 26 / 35 | 5414 |
| 3 | 1 | 70.3 | 93.0 | 28 / 35 | 5257 |
| 4 | 1 | 70.5 | 92.7 | 23 / 35 | 5733 |
| 5 | 2 | 62.3 | 61.0 | 10 / 35 | 5135 |
| 6 | 1 | 70.1 | 94.9 | 25 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 60 | 92% |
| oog.melee.Mercutio 1.0 | 53 | 81% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 0% |

Hadur died in 69 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 35% | 71 |
| mld.DustBunny 3.8 | 21 | 30% | 72 |
| cs.Grudge 1.0 | 7 | 10% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 16 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 13 |
| maribo.melee.BMV 0.1 | 3 | 4% | 12 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |
| fullsail.SweetTea 1.1 | 2 | 3% | 7 |
| zyx.nano.Ant 1.1 | 1 | 1% | 7 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 83.6 | 134 / 210 | 2.48 | 19.8% | 36778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.8% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.8% | 23 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 8 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 5 |
| sample.Fire 1.0 | 9.3 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 73.7 | 17 / 35 | 5110 |
| 2 | 1 | 69.6 | 83.8 | 22 / 35 | 5963 |
| 3 | 1 | 69.6 | 86.0 | 23 / 35 | 5687 |
| 4 | 1 | 68.5 | 79.7 | 22 / 35 | 5868 |
| 5 | 1 | 70.7 | 84.8 | 23 / 35 | 6552 |
| 6 | 1 | 73.3 | 93.7 | 27 / 35 | 7598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 78% |
| cb.nano.Insomnia 1.0 | 26 | 92% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 14 | 93% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 24% | 39 |
| cb.nano.Insomnia 1.0 | 13 | 17% | 20 |
| myl.micro.Troodon 1.10 | 12 | 16% | 60 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 31 |
| fm.mammillarias 1.3 | 9 | 12% | 15 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 16 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 18 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sample.Fire 1.0 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.3 | 162 / 210 | 2.14 | 20.8% | 38533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.8% | 162 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 11 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.4% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.0% | 4 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.2% | 14 |
| tj.zombie1n 1.0.1 | 6.0 | 8.8% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.2% | 5 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.9 | 29 / 35 | 6062 |
| 2 | 1 | 69.9 | 85.7 | 26 / 35 | 6214 |
| 3 | 1 | 69.5 | 83.5 | 24 / 35 | 6018 |
| 4 | 1 | 71.7 | 90.8 | 27 / 35 | 7017 |
| 5 | 1 | 67.6 | 77.1 | 24 / 35 | 5897 |
| 6 | 1 | 73.9 | 97.8 | 32 / 35 | 7325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 94% |
| stelo.SoJNanoMelee 1.1 | 44 | 89% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 14 | 29% | 76 |
| stelo.SoJNanoMelee 1.1 | 14 | 29% | 44 |
| tj.zombie1n 1.0.1 | 6 | 12% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 10% | 11 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 20 |
| yk.JahMicro 1.0 | 2 | 4% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 13 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.4 | 87 / 210 | 3.93 | 15.6% | 28937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 15.6% | 87 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 32 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.4% | 25 |
| EBBU.Sim2 1.02 | 5.3 | 10.0% | 8 |
| sam.Samspin 1.0 | 5.8 | 10.2% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.7% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.2 | 16 / 35 | 5022 |
| 2 | 1 | 63.7 | 70.8 | 15 / 35 | 4619 |
| 3 | 1 | 62.8 | 67.6 | 14 / 35 | 4700 |
| 4 | 1 | 64.6 | 72.7 | 16 / 35 | 5368 |
| 5 | 1 | 61.1 | 61.3 | 12 / 35 | 4579 |
| 6 | 1 | 62.2 | 62.9 | 14 / 35 | 4649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 95% |
| oog.melee.Corsair 1.0 | 21 | 62% |
| ahf.NanoAndrew .4 | 15 | 87% |
| EBBU.Sim2 1.02 | 13 | 77% |
| sam.Samspin 1.0 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 360. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 17% | 37 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 46 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 15% | 19 |
| EBBU.Sim2 1.02 | 16 | 13% | 19 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 20 |
| sam.Samspin 1.0 | 14 | 11% | 19 |
| ahf.NanoAndrew .4 | 12 | 10% | 32 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 12 |
| sample.TrackFire 1.0 | 3 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.7 | 137 / 210 | 2.29 | 19.3% | 33672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.3% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.9% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.5% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.6% | 8 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 6 |
| fm.claire 1.7 | 6.8 | 8.1% | 2 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| kurios.DOSexe .9b | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 24 / 35 | 5618 |
| 2 | 1 | 69.4 | 88.6 | 24 / 35 | 5451 |
| 3 | 1 | 69.4 | 89.5 | 22 / 35 | 5621 |
| 4 | 1 | 68.4 | 82.9 | 20 / 35 | 5571 |
| 5 | 1 | 69.5 | 86.0 | 25 / 35 | 5767 |
| 6 | 1 | 68.7 | 84.1 | 22 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 90% |
| oog.melee.CapuletDroid 1.1 | 41 | 93% |
| arthord.NanoSatanMelee Beta | 19 | 89% |
| gh.nano.Grofvuil 0.2 | 12 | 67% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 75% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 28% | 72 |
| gh.nano.Grofvuil 0.2 | 16 | 22% | 29 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 55 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 18 |
| fm.claire 1.7 | 7 | 9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 6 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.9 | 113 / 210 | 2.45 | 18.8% | 34946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.8% | 113 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.2% | 39 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 4.0 | 12.5% | 22 |
| DBall.Anarchy 0.1 | 5.3 | 8.9% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 1 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| acogdev.alpha 0.2 | 8.2 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.5% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.6 | 23 / 35 | 6150 |
| 2 | 1 | 67.7 | 84.1 | 16 / 35 | 5411 |
| 3 | 1 | 68.0 | 81.3 | 19 / 35 | 5679 |
| 4 | 1 | 69.4 | 83.5 | 20 / 35 | 5946 |
| 5 | 1 | 67.8 | 81.9 | 17 / 35 | 5738 |
| 6 | 1 | 68.9 | 84.8 | 18 / 35 | 6022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 79% |
| mz.MicroGodMelee 1 | 42 | 79% |
| gh.micro.Gruweltje 0.7 | 28 | 75% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 31% | 56 |
| spinnercat.micro.Tyger 0.1 | 24 | 25% | 64 |
| mz.MicroGodMelee 1 | 20 | 21% | 51 |
| DBall.Anarchy 0.1 | 8 | 8% | 17 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 74.3 | 121 / 210 | 3.31 | 17.4% | 32039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.4% | 121 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.5% | 6 |
| germ.TheMind .2 | 5.0 | 9.5% | 4 |
| awesomeness.Elite 1.0 | 6.3 | 8.2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.1% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.5% | 2 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 72.4 | 20 / 35 | 5412 |
| 2 | 1 | 67.8 | 81.0 | 20 / 35 | 5535 |
| 3 | 1 | 66.0 | 73.7 | 21 / 35 | 4965 |
| 4 | 1 | 66.7 | 74.0 | 21 / 35 | 5581 |
| 5 | 1 | 66.5 | 74.6 | 23 / 35 | 5336 |
| 6 | 1 | 64.8 | 70.2 | 16 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| germ.TheMind .2 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 46% | 99 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 16% | 35 |
| germ.TheMind .2 | 8 | 9% | 23 |
| qualidafial.MajorDick 1.0.1 | 8 | 9% | 9 |
| stelo.UntouchableNano 1.3 | 7 | 8% | 9 |
| awesomeness.Elite 1.0 | 6 | 7% | 16 |
| lrem.micro.MoggFanatic 0.2 | 5 | 6% | 8 |
| sample.Crazy 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.6 | 151 / 210 | 2.02 | 19.8% | 29023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.8% | 151 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 20 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 16 |
| maribo.IotaCT 1.1 | 4.5 | 10.2% | 3 |
| timmit.nano.TimDog 0.33 | 5.3 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.8% | 2 |
| stelo.PatternRobot 1.0 | 7.3 | 8.1% | 7 |
| spinnercat.Omen 1.0 | 8.0 | 7.6% | 1 |
| ratosh.Wesco 1.4 | 8.5 | 7.6% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.5 | 29 / 35 | 4795 |
| 2 | 1 | 70.0 | 88.6 | 25 / 35 | 4871 |
| 3 | 1 | 69.7 | 87.0 | 24 / 35 | 4656 |
| 4 | 1 | 70.2 | 88.9 | 23 / 35 | 5193 |
| 5 | 1 | 68.8 | 83.8 | 23 / 35 | 4794 |
| 6 | 1 | 70.9 | 93.0 | 27 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 91% |
| nz.jdc.nano.GridFu 1.0 | 40 | 95% |
| stelo.PatternRobot 1.0 | 20 | 80% |
| timmit.nano.TimDog 0.33 | 13 | 77% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 30% | 63 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 23 |
| stelo.PatternRobot 1.0 | 8 | 13% | 22 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 10 |
| ratosh.Wesco 1.4 | 4 | 7% | 19 |
| maribo.IotaCT 1.1 | 4 | 7% | 16 |
| spinnercat.Omen 1.0 | 3 | 5% | 7 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.1 | 167 / 210 | 1.71 | 21.7% | 40205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.7% | 167 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 15 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 7 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 5 |
| zyx.micro.Ant 1.1 | 4.7 | 9.9% | 9 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 3 |
| sanja.First 0.1 | 6.5 | 8.2% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.8 | 6.5% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 26 / 35 | 6096 |
| 2 | 1 | 71.7 | 90.5 | 28 / 35 | 6893 |
| 3 | 1 | 71.6 | 92.1 | 27 / 35 | 6580 |
| 4 | 1 | 72.1 | 94.9 | 28 / 35 | 6809 |
| 5 | 1 | 73.3 | 96.2 | 33 / 35 | 7185 |
| 6 | 1 | 71.4 | 91.4 | 25 / 35 | 6642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 92% |
| tvv.nano.Polaris 1.2 | 34 | 88% |
| zyx.micro.Ant 1.1 | 28 | 93% |
| cvt.Firsty 1.0 | 26 | 96% |
| sanja.First 0.1 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 14 | 93% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 86% |

Hadur died in 43 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 30% | 44 |
| tvv.nano.Polaris 1.2 | 8 | 19% | 50 |
| baal.nano.N 1.42 | 6 | 14% | 35 |
| Grystrion.TrackerWO 1.0 | 5 | 12% | 17 |
| cvt.Firsty 1.0 | 3 | 7% | 24 |
| sanja.First 0.1 | 3 | 7% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 9 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 3 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.2 | 84 / 210 | 3.86 | 15.7% | 31870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 15.7% | 84 |
| kc.micro.Figment 1.0 | 1.8 | 14.7% | 60 |
| cs.Wren 1.0 | 3.0 | 12.6% | 21 |
| mz.Cork 0.1 | 4.5 | 11.1% | 12 |
| js.PinBall 1.6 | 4.5 | 11.2% | 18 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 6 |
| evd.X1 0.01 | 7.2 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 7.7 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 6.1% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.3 | 19 / 35 | 5139 |
| 2 | 1 | 62.7 | 65.4 | 13 / 35 | 5164 |
| 3 | 1 | 65.1 | 74.3 | 14 / 35 | 5279 |
| 4 | 3 | 60.0 | 56.2 | 10 / 35 | 4953 |
| 5 | 1 | 64.7 | 71.4 | 13 / 35 | 5673 |
| 6 | 1 | 66.0 | 74.6 | 15 / 35 | 5662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 67% |
| cs.Wren 1.0 | 20 | 80% |
| mz.Cork 0.1 | 12 | 75% |
| js.PinBall 1.6 | 12 | 75% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 41% | 99 |
| cs.Wren 1.0 | 18 | 14% | 27 |
| joe.ADinosaur 1.0 | 17 | 13% | 19 |
| mz.Cork 0.1 | 13 | 10% | 20 |
| js.PinBall 1.6 | 9 | 7% | 21 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| evd.X1 0.01 | 6 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.2 | 146 / 210 | 2.15 | 19.8% | 31089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.8% | 146 |
| myl.nano.Graviton 1.10 | 2.8 | 11.8% | 16 |
| ntc.Opposite 1.5 | 3.8 | 10.6% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.4% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.8% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 6 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 5.8% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.1 | 24 / 35 | 5573 |
| 2 | 1 | 69.7 | 88.6 | 25 / 35 | 5122 |
| 3 | 1 | 69.3 | 87.9 | 23 / 35 | 5166 |
| 4 | 1 | 70.4 | 89.8 | 26 / 35 | 5453 |
| 5 | 1 | 70.0 | 88.6 | 27 / 35 | 5188 |
| 6 | 1 | 67.9 | 84.4 | 21 / 35 | 4587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 50 | 98% |
| stelo.AreaTargetingBot 1.1 | 35 | 83% |
| disan.Chair 2.2.0 | 22 | 86% |
| ntc.Opposite 1.5 | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| DBall.NUKE 0.1 | 10 | 100% |
| donjezza.Muncho 1.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 65 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 25% | 37 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 23 |
| myl.nano.Graviton 1.10 | 9 | 14% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 23 |
| ntc.Opposite 1.5 | 8 | 12% | 21 |
| disan.Chair 2.2.0 | 6 | 9% | 19 |
| pbg.R2D2 1.0 | 3 | 5% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 19 |
| donjezza.Muncho 1.0 | 1 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.7 | 82 / 210 | 3.37 | 15.9% | 25749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 15.9% | 82 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 39 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 22 |
| yagami.Tidus 0.11 | 5.0 | 11.9% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.4 | 15 / 35 | 3958 |
| 2 | 1 | 66.1 | 76.5 | 16 / 35 | 4422 |
| 3 | 1 | 65.5 | 75.9 | 13 / 35 | 4673 |
| 4 | 1 | 64.0 | 73.0 | 13 / 35 | 4307 |
| 5 | 1 | 65.1 | 76.5 | 13 / 35 | 4306 |
| 6 | 2 | 62.9 | 67.6 | 12 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 18 | 94% |
| yagami.Tidus 0.11 | 17 | 94% |
| ejb.Polaris 1.0.1 | 12 | 58% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 33% | 61 |
| yagami.Tidus 0.11 | 20 | 16% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 14% | 37 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 29 |
| ejb.Polaris 1.0.1 | 13 | 10% | 23 |
| kurios.DOSexe .9a | 10 | 8% | 10 |
| step.nanoPri 1.0 | 6 | 5% | 8 |
| stelo.MirrorNano 1.3 | 5 | 4% | 7 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.0 | 118 / 210 | 2.98 | 17.3% | 28458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.3% | 118 |
| bzdp.Pansy 2.1 | 2.5 | 12.5% | 21 |
| wompi.Quokka 1.6 | 3.0 | 12.0% | 13 |
| wee.Gem 1.8.4 | 4.0 | 11.3% | 30 |
| ratosh.Nobo 0.21 | 4.5 | 11.2% | 14 |
| m3thos.Eva00 1.1 | 6.0 | 9.3% | 3 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.9% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.9 | 23 / 35 | 4705 |
| 2 | 1 | 66.1 | 79.7 | 21 / 35 | 4378 |
| 3 | 1 | 64.9 | 74.9 | 16 / 35 | 4689 |
| 4 | 1 | 64.5 | 73.0 | 17 / 35 | 4798 |
| 5 | 1 | 67.3 | 81.0 | 22 / 35 | 4926 |
| 6 | 1 | 66.2 | 77.5 | 19 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 37 | 92% |
| wee.Gem 1.8.4 | 34 | 94% |
| wompi.Quokka 1.6 | 30 | 87% |
| m3thos.Eva00 1.1 | 13 | 100% |
| ratosh.Nobo 0.21 | 13 | 77% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 1 | 0% |

Hadur died in 92 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 21% | 54 |
| wompi.Quokka 1.6 | 12 | 13% | 29 |
| ratosh.Nobo 0.21 | 11 | 12% | 25 |
| maribo.FollowFire 1 | 10 | 11% | 10 |
| wee.Gem 1.8.4 | 9 | 10% | 45 |
| m3thos.Eva00 1.1 | 9 | 10% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 10% | 12 |
| bayen.UbaMicro 1.4 | 8 | 9% | 8 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.0 | 129 / 210 | 1.99 | 21.3% | 46002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.3% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 19 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 0 |
| stuff.Vlad 0.1 | 5.2 | 8.7% | 0 |
| ayk.WallHugger 1.0 | 5.2 | 9.2% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 85.1 | 20 / 35 | 7551 |
| 2 | 1 | 72.2 | 90.2 | 17 / 35 | 7335 |
| 3 | 1 | 72.4 | 88.3 | 22 / 35 | 7455 |
| 4 | 1 | 74.4 | 94.0 | 26 / 35 | 8508 |
| 5 | 1 | 72.7 | 91.1 | 23 / 35 | 7627 |
| 6 | 1 | 71.7 | 85.4 | 21 / 35 | 7526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 76% |
| mz.NanoGod 2.02 | 14 | 57% |
| exauge.GateKeeper 1.1.121g | 14 | 100% |
| ayk.WallHugger 1.0 | 9 | 100% |
| stelo.PianistNano 1.2 | 7 | 86% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 51% | 133 |
| mz.NanoGod 2.02 | 29 | 36% | 43 |
| exauge.GateKeeper 1.1.121g | 4 | 5% | 10 |
| ayk.WallHugger 1.0 | 3 | 4% | 11 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.7 | 103 / 210 | 3.55 | 16.5% | 28946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.5% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.7 | 11.2% | 15 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 23 |
| bvh.micro.Freya 0.3 | 4.5 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.8% | 4 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 69.5 | 17 / 35 | 4502 |
| 2 | 1 | 67.1 | 79.0 | 20 / 35 | 5171 |
| 3 | 1 | 64.3 | 72.7 | 14 / 35 | 4825 |
| 4 | 1 | 65.5 | 74.9 | 19 / 35 | 4653 |
| 5 | 1 | 64.3 | 66.3 | 19 / 35 | 5261 |
| 6 | 1 | 62.7 | 67.6 | 14 / 35 | 4534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 88% |
| dummy.micro.Sparrow 2.5 | 21 | 86% |
| bvh.micro.Freya 0.3 | 17 | 76% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 24% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 17% | 17 |
| bvh.micro.Freya 0.3 | 14 | 13% | 22 |
| conscience.Electron 1.3g | 14 | 13% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 42 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 32 |
| dl.BetterWalls 1.0 | 7 | 6% | 12 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 88.6 | 160 / 210 | 2.03 | 21.5% | 41280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.5% | 160 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 11 |
| supersample.SuperBoxBot 1.0 | 3.0 | 12.1% | 14 |
| sul.Lunar 1.1 | 4.0 | 10.9% | 6 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.9% | 2 |
| dsw.StaticD 1.0 | 5.8 | 8.2% | 6 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 3 |
| sample.Corners 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 95.2 | 29 / 35 | 7452 |
| 2 | 1 | 72.3 | 90.5 | 28 / 35 | 6589 |
| 3 | 1 | 71.6 | 86.7 | 26 / 35 | 7090 |
| 4 | 1 | 69.6 | 81.6 | 23 / 35 | 6514 |
| 5 | 1 | 71.9 | 88.6 | 26 / 35 | 6639 |
| 6 | 1 | 71.9 | 88.9 | 28 / 35 | 6996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 49 | 100% |
| supersample.SuperBoxBot 1.0 | 37 | 92% |
| dsw.StaticD 1.0 | 7 | 43% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 80% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 67% |

Hadur died in 50 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 42% | 45 |
| dsw.StaticD 1.0 | 7 | 14% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 12% | 60 |
| sul.Lunar 1.1 | 6 | 12% | 58 |
| tlp.ThreeLeggedPig 1 | 5 | 10% | 9 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.4 | 109 / 210 | 2.76 | 18.6% | 38259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.6% | 109 |
| radnor.DoctorBob 1.42 | 2.2 | 13.6% | 34 |
| mld.Wisdom 1.0 | 3.0 | 11.9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.8% | 23 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.8% | 9 |
| amz.NanoClone 1.41 | 5.7 | 9.8% | 14 |
| GarmBox.Oranges 1.0 | 7.5 | 7.3% | 2 |
| sample.Walls 1.0 | 7.8 | 7.2% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.8 | 23 / 35 | 6594 |
| 2 | 1 | 66.4 | 75.9 | 15 / 35 | 5963 |
| 3 | 1 | 69.8 | 85.1 | 23 / 35 | 6568 |
| 4 | 1 | 65.1 | 71.7 | 12 / 35 | 6026 |
| 5 | 1 | 68.7 | 82.9 | 19 / 35 | 6278 |
| 6 | 1 | 68.8 | 82.2 | 17 / 35 | 6830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 70% |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 82% |
| mld.Wisdom 1.0 | 16 | 69% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Target 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 27% | 42 |
| radnor.DoctorBob 1.42 | 26 | 26% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 52 |
| amz.NanoClone 1.41 | 15 | 15% | 21 |
| KiraNL.Chupacabra 0.4 | 12 | 12% | 19 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

