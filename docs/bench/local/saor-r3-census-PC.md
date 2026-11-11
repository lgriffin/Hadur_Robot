# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.7 | 165 / 210 | 1.92 | 21.5% | 41609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 21.5% | 165 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 18 |
| mld.Infinity 2.2 | 3.0 | 13.6% | 17 |
| mz.AntiGrav 1.0 | 3.7 | 13.2% | 5 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| sample.Walls 1.0 | 6.3 | 7.3% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 90.2 | 30 / 35 | 6953 |
| 2 | 1 | 73.0 | 93.7 | 28 / 35 | 6696 |
| 3 | 1 | 71.6 | 88.6 | 28 / 35 | 6500 |
| 4 | 1 | 70.5 | 83.8 | 23 / 35 | 6639 |
| 5 | 1 | 72.8 | 90.2 | 27 / 35 | 7363 |
| 6 | 1 | 73.6 | 92.1 | 29 / 35 | 7458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 100% |
| radnor.DoctorBob 1.42 | 51 | 92% |
| mld.Infinity 2.2 | 49 | 94% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 38% | 88 |
| mz.AntiGrav 1.0 | 11 | 24% | 70 |
| amz.NanoClone 1.41 | 9 | 20% | 18 |
| mld.Infinity 2.2 | 4 | 9% | 15 |
| sample.Walls 1.0 | 3 | 7% | 10 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.2 | 142 / 210 | 2.42 | 18.5% | 29043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.3 | 18.5% | 142 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.2% | 37 |
| mld.DustBunny 3.8 | 2.7 | 13.4% | 9 |
| maribo.melee.BMV 0.1 | 4.3 | 10.5% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.0% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.5% | 4 |
| fullsail.SweetTea 1.1 | 8.0 | 6.6% | 2 |
| bzdp.BoxCar 2.0 | 8.0 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.4 | 28 / 35 | 4910 |
| 2 | 1 | 70.3 | 93.7 | 24 / 35 | 5160 |
| 3 | 1 | 67.7 | 81.3 | 24 / 35 | 4761 |
| 4 | 1 | 70.7 | 94.6 | 30 / 35 | 5212 |
| 5 | 1 | 68.3 | 86.0 | 26 / 35 | 4754 |
| 6 | 3 | 60.0 | 57.5 | 10 / 35 | 4246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 79 | 85% |
| mld.DustBunny 3.8 | 47 | 96% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 35% | 93 |
| mld.DustBunny 3.8 | 8 | 12% | 39 |
| zyx.nano.Ant 1.1 | 8 | 12% | 15 |
| maribo.melee.BMV 0.1 | 7 | 10% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 10% | 15 |
| cs.Grudge 1.0 | 6 | 9% | 8 |
| fullsail.SweetTea 1.1 | 4 | 6% | 8 |
| bzdp.BoxCar 2.0 | 4 | 6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 11 |

## Melee bench: F03

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.3 | 170 / 210 | 1.79 | 21.5% | 36932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 21.5% | 170 |
| myl.micro.Troodon 1.10 | 2.0 | 13.4% | 17 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.7% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.3% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.1% | 2 |
| sample.Fire 1.0 | 9.3 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.7 | 29 / 35 | 6204 |
| 2 | 1 | 71.8 | 87.9 | 28 / 35 | 6846 |
| 3 | 1 | 72.5 | 93.0 | 30 / 35 | 6331 |
| 4 | 1 | 70.0 | 86.0 | 24 / 35 | 5649 |
| 5 | 1 | 70.2 | 88.9 | 27 / 35 | 5373 |
| 6 | 1 | 73.5 | 98.1 | 32 / 35 | 6529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 98% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 95% |
| myl.nano.KomoriNinja 1.1 | 25 | 96% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 15 | 100% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 11 | 28% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 25% | 45 |
| cb.nano.Insomnia 1.0 | 8 | 20% | 10 |
| myl.nano.KomoriNinja 1.1 | 4 | 10% | 35 |
| sp.Nanos.Ember 1.1 | 2 | 5% | 24 |
| fm.mammillarias 1.3 | 2 | 5% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 5% | 6 |
| sample.Fire 1.0 | 1 | 3% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 87.0 | 155 / 210 | 2.17 | 20.2% | 36052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 20.2% | 155 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 10 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.2% | 17 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.7% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.3 | 27 / 35 | 6120 |
| 2 | 1 | 68.0 | 81.9 | 23 / 35 | 5392 |
| 3 | 1 | 68.7 | 84.1 | 25 / 35 | 5780 |
| 4 | 1 | 71.7 | 95.6 | 28 / 35 | 6100 |
| 5 | 1 | 70.7 | 90.2 | 26 / 35 | 6216 |
| 6 | 1 | 70.2 | 84.1 | 26 / 35 | 6444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 95% |
| stelo.SoJNanoMelee 1.1 | 41 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 87% |
| tj.zombie1n 1.0.1 | 13 | 100% |
| yk.JahMicro 1.0 | 8 | 88% |
| sample.VelociRobot 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 31% | 85 |
| tvv.micro.Antares 1.1.1 | 9 | 16% | 32 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 24 |
| tj.zombie1n 1.0.1 | 6 | 11% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 9 |
| yk.JahMicro 1.0 | 2 | 4% | 11 |
| repositorio.NanoStep 1.0 | 2 | 4% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 11 |

## Melee bench: F05

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.6 | 103 / 210 | 3.38 | 16.7% | 29814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 16.7% | 103 |
| oog.melee.Corsair 1.0 | 2.5 | 12.3% | 23 |
| ahf.NanoAndrew .4 | 3.0 | 12.3% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 24 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 16 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.5% | 3 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 70.2 | 15 / 35 | 5377 |
| 2 | 1 | 64.7 | 73.3 | 16 / 35 | 4856 |
| 3 | 1 | 65.1 | 76.2 | 17 / 35 | 4607 |
| 4 | 1 | 65.1 | 74.3 | 20 / 35 | 4888 |
| 5 | 1 | 67.7 | 81.0 | 22 / 35 | 5467 |
| 6 | 1 | 62.2 | 66.7 | 13 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 79% |
| oog.melee.Corsair 1.0 | 32 | 78% |
| ahf.NanoAndrew .4 | 27 | 78% |
| EBBU.Sim2 1.02 | 10 | 90% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 23% | 44 |
| ahf.NanoAndrew .4 | 18 | 17% | 45 |
| oog.melee.Corsair 1.0 | 13 | 12% | 45 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 11% | 14 |
| robar.nano.Assertive_Melee 0.2 | 11 | 10% | 17 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 12 |
| sam.Samspin 1.0 | 8 | 7% | 14 |
| EBBU.Sim2 1.02 | 7 | 7% | 13 |
| sample.TrackFire 1.0 | 4 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.6 | 148 / 210 | 2.21 | 18.9% | 29190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 18.9% | 148 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.1% | 17 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.7% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.6% | 15 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 10 |
| fm.claire 1.7 | 6.3 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 5 |
| pa.Improved 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 25 / 35 | 4467 |
| 2 | 1 | 66.8 | 79.0 | 22 / 35 | 5020 |
| 3 | 1 | 69.4 | 91.1 | 26 / 35 | 4982 |
| 4 | 1 | 67.8 | 81.9 | 23 / 35 | 4888 |
| 5 | 1 | 70.9 | 96.2 | 30 / 35 | 5168 |
| 6 | 1 | 67.7 | 87.0 | 22 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 95% |
| oog.melee.CapuletDroid 1.1 | 42 | 83% |
| gh.nano.Grofvuil 0.2 | 25 | 96% |
| arthord.NanoSatanMelee Beta | 16 | 88% |
| pa.Improved 1.0 | 6 | 67% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 17 | 27% | 20 |
| d414.nano.Quantum 1.0.0 | 13 | 20% | 69 |
| fm.claire 1.7 | 8 | 13% | 10 |
| arthord.NanoSatanMelee Beta | 7 | 11% | 22 |
| gh.nano.Grofvuil 0.2 | 6 | 9% | 45 |
| sample.SpinBot 1.0 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 13 |
| pa.Improved 1.0 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 15 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.3 | 115 / 210 | 2.23 | 18.6% | 32040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 18.6% | 115 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.5% | 12 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 31 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 11 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 3 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 0 |
| fire219.CatBot 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 20 / 35 | 5275 |
| 2 | 1 | 69.3 | 89.5 | 21 / 35 | 5554 |
| 3 | 1 | 68.4 | 85.7 | 20 / 35 | 5294 |
| 4 | 1 | 70.4 | 93.7 | 25 / 35 | 5533 |
| 5 | 1 | 66.3 | 79.4 | 11 / 35 | 5303 |
| 6 | 1 | 67.1 | 84.8 | 18 / 35 | 5081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 91% |
| mz.MicroGodMelee 1 | 47 | 55% |
| gh.micro.Gruweltje 0.7 | 40 | 53% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 5 | 60% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 34% | 63 |
| gh.micro.Gruweltje 0.7 | 28 | 29% | 56 |
| spinnercat.micro.Tyger 0.1 | 13 | 13% | 51 |
| el.JumpShoot 0.2 | 6 | 6% | 9 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| DBall.Anarchy 0.1 | 3 | 3% | 14 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 76.8 | 124 / 210 | 3.09 | 17.6% | 31627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.2 | 17.6% | 124 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.8% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 5 |
| germ.TheMind .2 | 5.3 | 9.2% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.1% | 2 |
| stelo.UntouchableNano 1.3 | 6.8 | 7.6% | 4 |
| sample.Crazy 1.0 | 9.0 | 6.4% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.4 | 17 / 35 | 5455 |
| 2 | 1 | 66.1 | 78.4 | 20 / 35 | 4857 |
| 3 | 1 | 67.5 | 80.6 | 23 / 35 | 5304 |
| 4 | 1 | 67.7 | 78.7 | 21 / 35 | 5744 |
| 5 | 1 | 68.9 | 81.3 | 25 / 35 | 5608 |
| 6 | 2 | 63.7 | 69.2 | 18 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 79% |
| germ.TheMind .2 | 13 | 92% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 33 | 38% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 19% | 38 |
| germ.TheMind .2 | 11 | 13% | 25 |
| stelo.UntouchableNano 1.3 | 6 | 7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6 | 7% | 8 |
| awesomeness.Elite 1.0 | 5 | 6% | 12 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 10 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |

## Melee bench: F09

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.5 | 165 / 210 | 1.86 | 20.1% | 28770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 20.1% | 165 |
| rz.HawkOnFire 0.1 | 2.3 | 13.0% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 7 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 9 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.8% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.6% | 4 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 4 |
| spinnercat.Omen 1.0 | 8.7 | 7.3% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 28 / 35 | 4743 |
| 2 | 1 | 69.5 | 86.3 | 25 / 35 | 4615 |
| 3 | 1 | 70.9 | 90.5 | 27 / 35 | 5077 |
| 4 | 1 | 68.8 | 86.0 | 25 / 35 | 4534 |
| 5 | 1 | 70.4 | 92.4 | 28 / 35 | 4740 |
| 6 | 1 | 71.8 | 95.2 | 32 / 35 | 5061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 91% |
| nz.jdc.nano.GridFu 1.0 | 38 | 95% |
| timmit.nano.TimDog 0.33 | 21 | 81% |
| stelo.PatternRobot 1.0 | 15 | 100% |
| ratosh.Wesco 1.4 | 12 | 75% |
| maribo.IotaCT 1.1 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 10 | 22% | 27 |
| ratosh.Wesco 1.4 | 10 | 22% | 23 |
| rz.HawkOnFire 0.1 | 9 | 20% | 61 |
| stelo.PatternRobot 1.0 | 9 | 20% | 16 |
| nz.jdc.nano.GridFu 1.0 | 5 | 11% | 50 |
| maribo.IotaCT 1.1 | 2 | 4% | 19 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.8 | 183 / 210 | 1.56 | 21.7% | 37566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 21.7% | 183 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 10 |
| baal.nano.N 1.42 | 2.5 | 12.0% | 5 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 0 |
| zyx.micro.Ant 1.1 | 5.5 | 9.0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 0 |
| sanja.First 0.1 | 6.8 | 8.0% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.0% | 4 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.4 | 31 / 35 | 6187 |
| 2 | 1 | 72.8 | 99.4 | 33 / 35 | 6528 |
| 3 | 1 | 70.4 | 87.9 | 29 / 35 | 6077 |
| 4 | 1 | 71.5 | 94.9 | 29 / 35 | 5800 |
| 5 | 1 | 71.4 | 91.1 | 28 / 35 | 6359 |
| 6 | 1 | 72.7 | 98.1 | 33 / 35 | 6615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 43 | 95% |
| tvv.nano.Polaris 1.2 | 36 | 97% |
| cvt.Firsty 1.0 | 28 | 93% |
| sanja.First 0.1 | 25 | 100% |
| zyx.micro.Ant 1.1 | 23 | 96% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 6 | 21% | 30 |
| Grystrion.TrackerWO 1.0 | 6 | 21% | 16 |
| tvv.nano.Polaris 1.2 | 5 | 17% | 56 |
| cvt.Firsty 1.0 | 4 | 14% | 30 |
| amk.Punbot.Punbot 0.01 | 3 | 10% | 8 |
| baal.nano.N 1.42 | 2 | 7% | 35 |
| sample.RamFire 1.0 | 1 | 3% | 4 |
| sanja.First 0.1 | 0 | 0% | 22 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 71.0 | 92 / 210 | 3.61 | 15.7% | 28880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.3 | 15.7% | 92 |
| kc.micro.Figment 1.0 | 1.7 | 15.0% | 62 |
| cs.Wren 1.0 | 3.7 | 12.1% | 16 |
| js.PinBall 1.6 | 3.8 | 11.6% | 16 |
| mz.Cork 0.1 | 4.7 | 11.1% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 3 |
| evd.X1 0.01 | 6.5 | 8.8% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.3% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.6% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.8 | 19 / 35 | 4892 |
| 2 | 2 | 62.1 | 65.4 | 12 / 35 | 4859 |
| 3 | 1 | 62.3 | 67.6 | 17 / 35 | 4490 |
| 4 | 1 | 63.5 | 69.8 | 17 / 35 | 4843 |
| 5 | 2 | 63.1 | 68.9 | 14 / 35 | 4633 |
| 6 | 1 | 64.9 | 76.5 | 13 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 64% |
| cs.Wren 1.0 | 30 | 100% |
| joe.ADinosaur 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 5 | 80% |
| js.PinBall 1.6 | 5 | 100% |
| mz.Cork 0.1 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 51 | 43% | 100 |
| joe.ADinosaur 1.0 | 16 | 13% | 20 |
| js.PinBall 1.6 | 12 | 10% | 22 |
| mz.Cork 0.1 | 10 | 8% | 15 |
| evd.X1 0.01 | 9 | 8% | 10 |
| cs.Wren 1.0 | 8 | 7% | 23 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.8 | 147 / 210 | 2.28 | 19.0% | 27958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 19.0% | 147 |
| myl.nano.Graviton 1.10 | 3.5 | 11.3% | 18 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 10.9% | 18 |
| ntc.Opposite 1.5 | 3.7 | 10.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.2% | 3 |
| disan.Chair 2.2.0 | 7.0 | 8.7% | 9 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 2 |
| donjezza.Muncho 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 24 / 35 | 4683 |
| 2 | 1 | 66.8 | 79.4 | 21 / 35 | 4841 |
| 3 | 1 | 68.3 | 83.8 | 24 / 35 | 4883 |
| 4 | 1 | 68.5 | 87.9 | 26 / 35 | 4430 |
| 5 | 1 | 67.1 | 83.2 | 23 / 35 | 4405 |
| 6 | 1 | 70.5 | 93.7 | 29 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 82% |
| myl.nano.Graviton 1.10 | 37 | 92% |
| ntc.Opposite 1.5 | 20 | 90% |
| disan.Chair 2.2.0 | 18 | 94% |
| DBall.NUKE 0.1 | 15 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 23% | 47 |
| pfvicm.Sobieski 7.2.3b | 13 | 20% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 25 |
| myl.nano.Graviton 1.10 | 7 | 11% | 32 |
| disan.Chair 2.2.0 | 6 | 9% | 20 |
| ntc.Opposite 1.5 | 5 | 8% | 23 |
| DBall.NUKE 0.1 | 4 | 6% | 16 |
| donjezza.Muncho 1.0 | 4 | 6% | 12 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.6 | 86 / 210 | 3.47 | 15.5% | 24612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.2 | 15.5% | 86 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.3% | 33 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.2% | 27 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.8 | 15 / 35 | 4363 |
| 2 | 1 | 63.5 | 70.2 | 11 / 35 | 4259 |
| 3 | 1 | 65.4 | 78.4 | 15 / 35 | 4118 |
| 4 | 1 | 64.8 | 75.2 | 16 / 35 | 4088 |
| 5 | 2 | 62.5 | 68.3 | 14 / 35 | 3649 |
| 6 | 1 | 65.3 | 73.7 | 15 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 65% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 73% |
| yagami.Tidus 0.11 | 20 | 80% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 41% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 41 |
| yagami.Tidus 0.11 | 20 | 16% | 33 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 28 |
| ejb.Polaris 1.0.1 | 11 | 9% | 18 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.1 | 126 / 210 | 2.88 | 17.3% | 26409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 17.3% | 126 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 20 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 22 |
| ratosh.Nobo 0.21 | 3.8 | 11.3% | 10 |
| wompi.Quokka 1.6 | 4.2 | 11.7% | 16 |
| bayen.UbaMicro 1.4 | 6.3 | 9.3% | 7 |
| m3thos.Eva00 1.1 | 6.5 | 9.5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.9 | 24 / 35 | 4220 |
| 2 | 1 | 62.9 | 68.6 | 18 / 35 | 4066 |
| 3 | 1 | 65.9 | 78.4 | 20 / 35 | 4500 |
| 4 | 1 | 66.9 | 81.3 | 20 / 35 | 4569 |
| 5 | 1 | 65.7 | 78.1 | 20 / 35 | 4396 |
| 6 | 1 | 67.9 | 85.4 | 24 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 87% |
| wee.Gem 1.8.4 | 42 | 93% |
| wompi.Quokka 1.6 | 18 | 72% |
| ratosh.Nobo 0.21 | 15 | 93% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 18% | 49 |
| wompi.Quokka 1.6 | 15 | 18% | 33 |
| maribo.FollowFire 1 | 13 | 15% | 13 |
| ratosh.Nobo 0.21 | 10 | 12% | 25 |
| bayen.UbaMicro 1.4 | 9 | 11% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 13 |
| wee.Gem 1.8.4 | 6 | 7% | 39 |
| m3thos.Eva00 1.1 | 5 | 6% | 15 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.3 | 93 / 210 | 2.14 | 20.3% | 44790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 20.3% | 93 |
| wompi.Wallaby 5.1 | 2.0 | 18.9% | 102 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 10 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 2 |
| ayk.WallHugger 1.0 | 4.7 | 9.7% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.0 | 16 / 35 | 7240 |
| 2 | 1 | 71.9 | 89.8 | 14 / 35 | 8007 |
| 3 | 1 | 71.0 | 90.5 | 19 / 35 | 6635 |
| 4 | 1 | 71.8 | 88.3 | 15 / 35 | 7727 |
| 5 | 1 | 72.1 | 87.3 | 15 / 35 | 7728 |
| 6 | 1 | 70.2 | 81.9 | 14 / 35 | 7453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 39% |
| mz.NanoGod 2.02 | 19 | 74% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 11 | 91% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 86 | 74% | 138 |
| mz.NanoGod 2.02 | 17 | 15% | 37 |
| ayk.WallHugger 1.0 | 8 | 7% | 18 |
| exauge.GateKeeper 1.1.121g | 3 | 3% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.6 | 107 / 210 | 3.65 | 16.1% | 27046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 16.1% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.4% | 17 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.2% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 20 |
| stelo.MirrorMicro 1.0 | 5.7 | 10.1% | 14 |
| conscience.Electron 1.3g | 6.8 | 9.3% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 1 |
| ap.Frederick 1.1 | 8.8 | 6.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 63.5 | 13 / 35 | 4414 |
| 2 | 1 | 65.4 | 76.2 | 22 / 35 | 4362 |
| 3 | 1 | 62.6 | 64.4 | 15 / 35 | 4822 |
| 4 | 1 | 66.6 | 81.3 | 23 / 35 | 4258 |
| 5 | 1 | 64.2 | 70.8 | 19 / 35 | 4556 |
| 6 | 1 | 63.4 | 67.3 | 15 / 35 | 4634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 82% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| stelo.MirrorMicro 1.0 | 12 | 50% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 19 | 18% | 22 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 34 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 16 |
| stelo.MirrorMicro 1.0 | 12 | 12% | 19 |
| bvh.micro.Freya 0.3 | 10 | 10% | 19 |
| voidious.micro.BlitzBat 1.05 | 9 | 9% | 42 |
| dl.BetterWalls 1.0 | 9 | 9% | 15 |

## Melee bench: F17

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.4 | 168 / 210 | 1.96 | 21.4% | 40556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 21.4% | 168 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 10 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 11 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.5% | 12 |
| dsw.StaticD 1.0 | 5.2 | 8.8% | 4 |
| mme.NikeEnhanced 2.0 | 5.7 | 8.7% | 1 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 5 |
| sample.Corners 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.1 | 29 / 35 | 6999 |
| 2 | 1 | 70.9 | 85.7 | 26 / 35 | 6698 |
| 3 | 1 | 70.4 | 84.4 | 25 / 35 | 6296 |
| 4 | 1 | 73.1 | 94.0 | 32 / 35 | 7277 |
| 5 | 1 | 71.8 | 90.8 | 30 / 35 | 6403 |
| 6 | 1 | 71.5 | 89.2 | 26 / 35 | 6883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 98% |
| supersample.SuperBoxBot 1.0 | 37 | 89% |
| dsw.StaticD 1.0 | 10 | 80% |
| sample.Corners 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 43% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 20% | 63 |
| sul.Lunar 1.1 | 4 | 9% | 58 |
| dsw.StaticD 1.0 | 4 | 9% | 19 |
| sample.MyFirstRobot 1.0 | 4 | 9% | 8 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.6 | 125 / 210 | 2.83 | 18.4% | 37090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPC 0.1 | 1.0 | 18.4% | 125 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 26 |
| mld.Wisdom 1.0 | 3.2 | 12.5% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.3% | 18 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.3% | 10 |
| amz.NanoClone 1.41 | 5.5 | 9.5% | 3 |
| sample.Walls 1.0 | 7.5 | 7.7% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 22 / 35 | 6437 |
| 2 | 1 | 68.0 | 80.0 | 21 / 35 | 6304 |
| 3 | 1 | 71.7 | 92.4 | 27 / 35 | 6973 |
| 4 | 1 | 66.6 | 73.3 | 18 / 35 | 6194 |
| 5 | 1 | 64.4 | 71.1 | 17 / 35 | 5598 |
| 6 | 1 | 65.7 | 74.3 | 20 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 93% |
| radnor.DoctorBob 1.42 | 37 | 86% |
| mld.Wisdom 1.0 | 22 | 77% |
| jangs.ns51 1.0 | 10 | 90% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 36% | 45 |
| KiraNL.Chupacabra 0.4 | 18 | 21% | 26 |
| radnor.DoctorBob 1.42 | 17 | 20% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 13% | 53 |
| amz.NanoClone 1.41 | 4 | 5% | 12 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |

