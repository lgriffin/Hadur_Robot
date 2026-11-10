# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.4 | 148 / 210 | 1.87 | 21.5% | 43547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.5% | 148 |
| radnor.DoctorBob 1.42 | 2.5 | 14.3% | 22 |
| mz.AntiGrav 1.0 | 2.8 | 14.4% | 19 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 3 |
| sample.Walls 1.0 | 6.5 | 6.7% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 90.8 | 27 / 35 | 7695 |
| 2 | 1 | 71.6 | 88.3 | 22 / 35 | 7187 |
| 3 | 1 | 72.2 | 92.7 | 24 / 35 | 6934 |
| 4 | 1 | 71.8 | 89.2 | 23 / 35 | 6810 |
| 5 | 1 | 73.6 | 93.3 | 28 / 35 | 7554 |
| 6 | 1 | 72.0 | 87.9 | 24 / 35 | 7367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 95% |
| mld.Infinity 2.2 | 39 | 92% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 33% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 52% | 67 |
| amz.NanoClone 1.41 | 10 | 16% | 12 |
| mld.Infinity 2.2 | 8 | 13% | 45 |
| mz.AntiGrav 1.0 | 7 | 11% | 64 |
| jangs.ns51 1.0 | 3 | 5% | 10 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.1 | 128 / 210 | 2.34 | 18.8% | 32388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 18.8% | 128 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 47 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 14 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 3 |
| zyx.nano.Ant 1.1 | 5.0 | 9.3% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.4% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.4% | 11 |
| fullsail.SweetTea 1.1 | 8.0 | 6.6% | 2 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.7 | 23 / 35 | 5649 |
| 2 | 1 | 68.5 | 87.3 | 21 / 35 | 5287 |
| 3 | 1 | 70.6 | 94.9 | 24 / 35 | 5564 |
| 4 | 1 | 69.8 | 89.2 | 28 / 35 | 5374 |
| 5 | 1 | 67.5 | 84.4 | 19 / 35 | 5160 |
| 6 | 2 | 63.5 | 62.2 | 13 / 35 | 5354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 77% |
| mld.DustBunny 3.8 | 57 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 62% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 35% | 82 |
| mld.DustBunny 3.8 | 20 | 24% | 63 |
| maribo.melee.BMV 0.1 | 7 | 8% | 13 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| fullsail.SweetTea 1.1 | 2 | 2% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.9 | 132 / 210 | 2.45 | 20.1% | 38035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.1% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 7 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.9% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.5% | 18 |
| fm.mammillarias 1.3 | 5.5 | 9.8% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.8% | 2 |
| sample.Tracker 1.0 | 9.0 | 5.0% | 0 |
| sample.Fire 1.0 | 9.8 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.0 | 24 / 35 | 6252 |
| 2 | 1 | 71.3 | 86.0 | 25 / 35 | 6976 |
| 3 | 1 | 69.6 | 82.5 | 20 / 35 | 6406 |
| 4 | 1 | 70.8 | 88.3 | 25 / 35 | 6094 |
| 5 | 1 | 68.1 | 77.1 | 17 / 35 | 6061 |
| 6 | 1 | 69.5 | 82.5 | 21 / 35 | 6246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 85% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| myl.nano.KomoriNinja 1.1 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 14 | 100% |
| fm.mammillarias 1.3 | 12 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 18 | 23% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 40 |
| myl.micro.Troodon 1.10 | 14 | 18% | 54 |
| fm.mammillarias 1.3 | 9 | 12% | 15 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 34 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 19 |
| sample.Fire 1.0 | 5 | 6% | 10 |
| sample.Tracker 1.0 | 3 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.8 | 153 / 210 | 2.19 | 20.5% | 38811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.5% | 153 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.6% | 15 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.5% | 8 |
| tj.zombie1n 1.0.1 | 4.7 | 9.5% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.4% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 9.2% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.5% | 10 |
| yk.JahMicro 1.0 | 8.2 | 7.3% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 89.5 | 27 / 35 | 7031 |
| 2 | 1 | 70.7 | 86.7 | 28 / 35 | 6784 |
| 3 | 1 | 68.0 | 79.7 | 21 / 35 | 5809 |
| 4 | 1 | 70.3 | 87.0 | 25 / 35 | 6377 |
| 5 | 1 | 70.5 | 88.3 | 26 / 35 | 6350 |
| 6 | 1 | 70.9 | 89.5 | 26 / 35 | 6460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 91% |
| stelo.SoJNanoMelee 1.1 | 42 | 88% |
| tj.zombie1n 1.0.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 88% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 35% | 85 |
| stelo.SoJNanoMelee 1.1 | 10 | 18% | 32 |
| tj.zombie1n 1.0.1 | 9 | 16% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 24 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 9 |
| repositorio.NanoStep 1.0 | 2 | 4% | 8 |
| sample.VelociRobot 1.0 | 2 | 4% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.3 | 92 / 210 | 3.59 | 16.1% | 28925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.1% | 92 |
| oog.melee.Corsair 1.0 | 2.5 | 12.6% | 41 |
| ahf.NanoAndrew .4 | 3.5 | 11.6% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 24 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.3% | 7 |
| sam.Samspin 1.0 | 6.0 | 9.5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 1 |
| sample.TrackFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 64.8 | 12 / 35 | 4712 |
| 2 | 1 | 66.6 | 78.4 | 19 / 35 | 5253 |
| 3 | 1 | 62.4 | 66.0 | 15 / 35 | 4516 |
| 4 | 1 | 66.0 | 78.1 | 17 / 35 | 5227 |
| 5 | 1 | 62.2 | 67.9 | 12 / 35 | 4437 |
| 6 | 1 | 64.5 | 72.4 | 17 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 86% |
| oog.melee.Corsair 1.0 | 25 | 56% |
| ahf.NanoAndrew .4 | 16 | 81% |
| sam.Samspin 1.0 | 16 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 21% | 53 |
| oog.melee.Corsair 1.0 | 24 | 20% | 42 |
| robar.nano.Assertive_Melee 0.2 | 21 | 18% | 23 |
| EBBU.Sim2 1.02 | 13 | 11% | 25 |
| ahf.NanoAndrew .4 | 12 | 10% | 25 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 11 |
| sam.Samspin 1.0 | 7 | 6% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.2 | 138 / 210 | 2.15 | 19.3% | 32098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.3% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 34 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 7 |
| fm.claire 1.7 | 5.8 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.9% | 7 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 3 |
| pa.Improved 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 25 / 35 | 5129 |
| 2 | 1 | 68.8 | 85.4 | 22 / 35 | 5550 |
| 3 | 1 | 66.2 | 80.0 | 17 / 35 | 4707 |
| 4 | 1 | 70.4 | 92.1 | 25 / 35 | 5363 |
| 5 | 1 | 69.6 | 87.6 | 24 / 35 | 5828 |
| 6 | 1 | 69.6 | 89.2 | 25 / 35 | 5521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 88% |
| oog.melee.CapuletDroid 1.1 | 32 | 97% |
| arthord.NanoSatanMelee Beta | 23 | 91% |
| gh.nano.Grofvuil 0.2 | 14 | 79% |
| sample.SpinBot 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 33% | 77 |
| arthord.NanoSatanMelee Beta | 11 | 15% | 29 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 44 |
| fm.claire 1.7 | 9 | 13% | 16 |
| gh.nano.Grofvuil 0.2 | 8 | 11% | 18 |
| kurios.DOSexe .9b | 5 | 7% | 8 |
| sample.SpinBot 1.0 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 8 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.8 | 113 / 210 | 2.55 | 18.7% | 34818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.7% | 113 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 27 |
| mz.MicroGodMelee 1 | 3.8 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.2 | 7.9% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.5% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 0 |
| acogdev.alpha 0.2 | 8.2 | 6.1% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 21 / 35 | 5704 |
| 2 | 1 | 67.7 | 81.6 | 18 / 35 | 5355 |
| 3 | 1 | 70.2 | 86.7 | 21 / 35 | 6481 |
| 4 | 1 | 67.4 | 81.6 | 16 / 35 | 5415 |
| 5 | 1 | 69.0 | 83.2 | 18 / 35 | 6023 |
| 6 | 1 | 67.4 | 78.4 | 19 / 35 | 5840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 91% |
| mz.MicroGodMelee 1 | 41 | 71% |
| gh.micro.Gruweltje 0.7 | 25 | 64% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 30% | 59 |
| gh.micro.Gruweltje 0.7 | 26 | 27% | 48 |
| spinnercat.micro.Tyger 0.1 | 25 | 26% | 66 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 11 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| acogdev.alpha 0.2 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.1 | 110 / 210 | 3.51 | 16.8% | 30902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.8% | 110 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.3% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 28 |
| awesomeness.Elite 1.0 | 5.0 | 9.2% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.9% | 7 |
| germ.TheMind .2 | 6.3 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 8 |
| sample.Crazy 1.0 | 8.8 | 7.2% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 67.9 | 17 / 35 | 4678 |
| 2 | 1 | 65.7 | 73.7 | 18 / 35 | 5331 |
| 3 | 1 | 67.9 | 80.0 | 23 / 35 | 5312 |
| 4 | 1 | 64.2 | 67.6 | 17 / 35 | 5217 |
| 5 | 1 | 66.4 | 76.5 | 19 / 35 | 5545 |
| 6 | 1 | 63.6 | 66.7 | 16 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 81% |
| awesomeness.Elite 1.0 | 10 | 80% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 35% | 87 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 34 |
| awesomeness.Elite 1.0 | 13 | 13% | 23 |
| germ.TheMind .2 | 8 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 11 |
| mym.EdgeStalker 1.0 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 3 | 3% | 13 |

## Melee bench: F09

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.1 | 148 / 210 | 2.07 | 19.7% | 30217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.7% | 148 |
| rz.HawkOnFire 0.1 | 2.2 | 13.0% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 11 |
| maribo.IotaCT 1.1 | 4.2 | 10.7% | 11 |
| timmit.nano.TimDog 0.33 | 5.5 | 10.0% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.9% | 5 |
| stelo.PatternRobot 1.0 | 7.5 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 1 |
| ratosh.Wesco 1.4 | 8.0 | 7.8% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.0 | 25 / 35 | 5185 |
| 2 | 1 | 69.3 | 85.7 | 24 / 35 | 5065 |
| 3 | 1 | 70.7 | 92.1 | 26 / 35 | 4902 |
| 4 | 1 | 68.3 | 83.2 | 22 / 35 | 4949 |
| 5 | 1 | 70.2 | 87.0 | 25 / 35 | 5061 |
| 6 | 1 | 70.3 | 87.6 | 26 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 91% |
| nz.jdc.nano.GridFu 1.0 | 33 | 94% |
| stelo.PatternRobot 1.0 | 21 | 95% |
| timmit.nano.TimDog 0.33 | 17 | 53% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| maribo.IotaCT 1.1 | 9 | 100% |
| ratosh.Wesco 1.4 | 8 | 38% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 14 | 23% | 52 |
| rz.HawkOnFire 0.1 | 11 | 18% | 57 |
| timmit.nano.TimDog 0.33 | 10 | 16% | 22 |
| ratosh.Wesco 1.4 | 9 | 15% | 16 |
| stelo.PatternRobot 1.0 | 6 | 10% | 24 |
| maribo.IotaCT 1.1 | 6 | 10% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 14 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.0 | 170 / 210 | 1.81 | 21.4% | 39175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.4% | 170 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.5% | 14 |
| baal.nano.N 1.42 | 3.0 | 11.0% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.8% | 2 |
| zyx.micro.Ant 1.1 | 6.3 | 8.5% | 7 |
| sanja.First 0.1 | 6.7 | 8.2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.5% | 0 |
| cvt.Firsty 1.0 | 7.2 | 7.7% | 6 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.4% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.9 | 26 / 35 | 6392 |
| 2 | 1 | 70.9 | 86.3 | 28 / 35 | 6463 |
| 3 | 1 | 72.7 | 97.5 | 31 / 35 | 6661 |
| 4 | 1 | 71.0 | 90.8 | 27 / 35 | 6534 |
| 5 | 1 | 70.8 | 86.3 | 27 / 35 | 6677 |
| 6 | 1 | 72.4 | 96.2 | 31 / 35 | 6448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 95% |
| cvt.Firsty 1.0 | 32 | 94% |
| zyx.micro.Ant 1.1 | 24 | 88% |
| baal.nano.N 1.42 | 24 | 96% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Grystrion.TrackerWO 1.0 | 8 | 20% | 17 |
| baal.nano.N 1.42 | 7 | 18% | 26 |
| tvv.nano.Polaris 1.2 | 6 | 15% | 58 |
| cvt.Firsty 1.0 | 6 | 15% | 26 |
| zyx.micro.Ant 1.1 | 5 | 13% | 32 |
| sanja.First 0.1 | 3 | 8% | 22 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 12 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 7 |
| sample.RamFire 1.0 | 1 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 64.2 | 70 / 210 | 4.22 | 14.7% | 30731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.7% | 63 |
| hadur117.micro.SaorWTH 0.1 | 1.7 | 14.7% | 70 |
| cs.Wren 1.0 | 3.0 | 13.1% | 26 |
| js.PinBall 1.6 | 3.8 | 12.0% | 21 |
| mz.Cork 0.1 | 5.0 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 5 |
| evd.X1 0.01 | 7.2 | 7.9% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 6.3% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 63.5 | 11 / 35 | 5637 |
| 2 | 1 | 62.5 | 67.9 | 12 / 35 | 4907 |
| 3 | 1 | 61.1 | 62.2 | 12 / 35 | 4924 |
| 4 | 3 | 59.5 | 58.7 | 9 / 35 | 4772 |
| 5 | 2 | 62.2 | 64.8 | 14 / 35 | 4880 |
| 6 | 1 | 64.1 | 67.9 | 12 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 72% |
| cs.Wren 1.0 | 26 | 73% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| js.PinBall 1.6 | 4 | 75% |
| mz.Cork 0.1 | 4 | 50% |
| donjezza.Jezza 1.0 | 2 | 50% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 41% | 97 |
| cs.Wren 1.0 | 22 | 16% | 36 |
| evd.X1 0.01 | 14 | 10% | 14 |
| mz.Cork 0.1 | 13 | 9% | 17 |
| joe.ADinosaur 1.0 | 12 | 9% | 13 |
| js.PinBall 1.6 | 10 | 7% | 13 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.1 | 139 / 210 | 2.34 | 19.2% | 29719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.2% | 139 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 29 |
| ntc.Opposite 1.5 | 3.2 | 11.2% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.1% | 11 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.2% | 6 |
| disan.Chair 2.2.0 | 6.7 | 8.5% | 4 |
| DBall.NUKE 0.1 | 7.8 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 3 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.8 | 25 / 35 | 4901 |
| 2 | 1 | 68.5 | 84.8 | 23 / 35 | 5012 |
| 3 | 1 | 69.5 | 87.0 | 23 / 35 | 5308 |
| 4 | 1 | 70.4 | 91.1 | 25 / 35 | 5445 |
| 5 | 1 | 65.8 | 78.4 | 20 / 35 | 4244 |
| 6 | 1 | 67.0 | 79.7 | 23 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 89% |
| myl.nano.Graviton 1.10 | 30 | 77% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 96% |
| disan.Chair 2.2.0 | 16 | 88% |
| donjezza.Muncho 1.0 | 16 | 88% |
| ntc.Opposite 1.5 | 14 | 79% |
| pfvicm.Sobieski 7.2.3b | 12 | 83% |
| DBall.NUKE 0.1 | 12 | 92% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 24% | 43 |
| pfvicm.Sobieski 7.2.3b | 16 | 23% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 15% | 32 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 37 |
| ntc.Opposite 1.5 | 9 | 13% | 26 |
| DBall.NUKE 0.1 | 3 | 4% | 19 |
| disan.Chair 2.2.0 | 3 | 4% | 14 |
| donjezza.Muncho 1.0 | 2 | 3% | 8 |
| pbg.R2D2 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.1 | 88 / 210 | 3.42 | 16.0% | 26521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 16.0% | 88 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 41 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 24 |
| yagami.Tidus 0.11 | 4.3 | 12.2% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 13 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 65.7 | 12 / 35 | 4095 |
| 2 | 1 | 65.4 | 74.0 | 14 / 35 | 4893 |
| 3 | 1 | 68.4 | 82.5 | 20 / 35 | 4829 |
| 4 | 1 | 65.4 | 73.7 | 15 / 35 | 4430 |
| 5 | 1 | 61.7 | 65.7 | 10 / 35 | 3902 |
| 6 | 1 | 66.0 | 77.1 | 17 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 92% |
| yagami.Tidus 0.11 | 20 | 100% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| ejb.Polaris 1.0.1 | 5 | 60% |

Hadur died in 122 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 33% | 64 |
| yagami.Tidus 0.11 | 25 | 20% | 42 |
| kawigi.micro.Shiz 1.1 | 17 | 14% | 31 |
| ejb.Polaris 1.0.1 | 14 | 11% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 11% | 39 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.5 | 127 / 210 | 2.75 | 17.7% | 27348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 17.7% | 127 |
| wee.Gem 1.8.4 | 2.5 | 12.2% | 25 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 24 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 13 |
| ratosh.Nobo 0.21 | 5.0 | 10.6% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 9.0% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.6 | 18 / 35 | 4726 |
| 2 | 1 | 67.9 | 83.5 | 25 / 35 | 4679 |
| 3 | 1 | 66.4 | 80.0 | 23 / 35 | 4224 |
| 4 | 1 | 67.1 | 80.3 | 21 / 35 | 4894 |
| 5 | 1 | 65.5 | 80.3 | 18 / 35 | 4269 |
| 6 | 1 | 66.2 | 78.4 | 22 / 35 | 4556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 92% |
| wee.Gem 1.8.4 | 35 | 94% |
| wompi.Quokka 1.6 | 23 | 83% |
| m3thos.Eva00 1.1 | 13 | 100% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 12 | 14% | 57 |
| bzdp.Pansy 2.1 | 12 | 14% | 45 |
| bayen.UbaMicro 1.4 | 11 | 13% | 19 |
| ratosh.Nobo 0.21 | 9 | 11% | 23 |
| wompi.Quokka 1.6 | 9 | 11% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 11% | 13 |
| m3thos.Eva00 1.1 | 8 | 10% | 15 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 10 |
| maribo.FollowFire 1 | 5 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.2 | 121 / 210 | 2.24 | 20.5% | 44012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.5% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 71 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 16 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.2% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 90.5 | 24 / 35 | 7934 |
| 2 | 1 | 72.9 | 90.5 | 22 / 35 | 7631 |
| 3 | 1 | 70.1 | 82.9 | 16 / 35 | 6933 |
| 4 | 1 | 70.1 | 82.2 | 19 / 35 | 6917 |
| 5 | 1 | 70.0 | 83.2 | 19 / 35 | 6723 |
| 6 | 1 | 72.7 | 87.9 | 21 / 35 | 7874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 96 | 73% |
| mz.NanoGod 2.02 | 21 | 76% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 48% | 120 |
| mz.NanoGod 2.02 | 33 | 36% | 54 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 11 |
| ayk.WallHugger 1.0 | 5 | 5% | 11 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.1 | 97 / 210 | 3.69 | 16.1% | 28899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 16.1% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.2% | 28 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 28 |
| bvh.micro.Freya 0.3 | 4.5 | 10.6% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 5 |
| conscience.Electron 1.3g | 7.5 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.2 | 7.3% | 11 |
| dl.BetterWalls 1.0 | 8.3 | 7.3% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 64.8 | 14 / 35 | 4732 |
| 2 | 1 | 64.8 | 71.7 | 20 / 35 | 4854 |
| 3 | 1 | 60.5 | 62.9 | 11 / 35 | 4473 |
| 4 | 1 | 66.3 | 76.2 | 17 / 35 | 5276 |
| 5 | 1 | 65.6 | 76.2 | 17 / 35 | 4912 |
| 6 | 1 | 63.9 | 68.9 | 18 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 79% |
| dummy.micro.Sparrow 2.5 | 27 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| dl.BetterWalls 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 24 | 21% | 46 |
| voidious.micro.BlitzBat 1.05 | 22 | 19% | 51 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 18% | 20 |
| conscience.Electron 1.3g | 17 | 15% | 21 |
| dl.BetterWalls 1.0 | 10 | 9% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 7% | 29 |
| bvh.micro.Freya 0.3 | 8 | 7% | 17 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 11 |

## Melee bench: F17

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 86.1 | 149 / 210 | 2.25 | 21.1% | 41924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.1% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 27 |
| sul.Lunar 1.1 | 3.3 | 11.2% | 12 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.4% | 3 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.9% | 5 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 2 |
| sample.Corners 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 85.1 | 22 / 35 | 6742 |
| 2 | 1 | 71.9 | 88.6 | 24 / 35 | 7324 |
| 3 | 1 | 73.2 | 92.7 | 30 / 35 | 7046 |
| 4 | 1 | 70.0 | 81.9 | 23 / 35 | 6765 |
| 5 | 1 | 70.3 | 82.2 | 25 / 35 | 6851 |
| 6 | 1 | 71.4 | 86.3 | 25 / 35 | 7196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 88% |
| sul.Lunar 1.1 | 45 | 98% |
| supersample.SuperBoxBot 1.0 | 21 | 95% |
| dsw.StaticD 1.0 | 16 | 81% |
| sample.Corners 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 23 | 37% | 69 |
| supersample.SuperBoxBot 1.0 | 18 | 29% | 29 |
| dsw.StaticD 1.0 | 6 | 10% | 21 |
| sul.Lunar 1.1 | 4 | 6% | 52 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 8 |
| sample.Corners 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.4 | 114 / 210 | 2.85 | 18.4% | 38558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.4% | 114 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 24 |
| mld.Wisdom 1.0 | 3.7 | 11.8% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 10.9% | 14 |
| KiraNL.Chupacabra 0.4 | 4.7 | 9.8% | 12 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 11 |
| sample.Walls 1.0 | 7.2 | 8.4% | 10 |
| GarmBox.Oranges 1.0 | 8.2 | 7.7% | 2 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 74.3 | 17 / 35 | 6092 |
| 2 | 1 | 66.4 | 73.3 | 17 / 35 | 6383 |
| 3 | 1 | 67.8 | 79.0 | 19 / 35 | 6223 |
| 4 | 1 | 70.7 | 90.2 | 23 / 35 | 6889 |
| 5 | 1 | 67.8 | 80.3 | 17 / 35 | 6611 |
| 6 | 1 | 67.6 | 79.4 | 21 / 35 | 6360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 90% |
| radnor.DoctorBob 1.42 | 32 | 91% |
| mld.Wisdom 1.0 | 20 | 70% |
| sample.Walls 1.0 | 12 | 100% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 32% | 49 |
| radnor.DoctorBob 1.42 | 22 | 23% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 51 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 27 |
| amz.NanoClone 1.41 | 7 | 7% | 13 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 3 |

