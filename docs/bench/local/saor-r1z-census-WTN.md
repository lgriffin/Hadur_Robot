# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.1 | 156 / 210 | 2.07 | 21.7% | 43493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.7% | 156 |
| radnor.DoctorBob 1.42 | 2.7 | 14.0% | 15 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 10 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 6 |
| sample.Walls 1.0 | 6.7 | 6.7% | 4 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 83.2 | 21 / 35 | 6745 |
| 2 | 1 | 73.5 | 92.4 | 27 / 35 | 7322 |
| 3 | 1 | 71.5 | 86.3 | 23 / 35 | 7024 |
| 4 | 1 | 71.9 | 86.0 | 27 / 35 | 6991 |
| 5 | 1 | 74.4 | 93.3 | 30 / 35 | 7650 |
| 6 | 1 | 73.3 | 87.6 | 28 / 35 | 7761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 100% |
| radnor.DoctorBob 1.42 | 37 | 84% |
| mld.Infinity 2.2 | 33 | 97% |
| jangs.ns51 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 42% | 64 |
| mld.Infinity 2.2 | 12 | 22% | 50 |
| amz.NanoClone 1.41 | 7 | 13% | 15 |
| mz.AntiGrav 1.0 | 6 | 11% | 66 |
| jangs.ns51 1.0 | 4 | 7% | 8 |
| sample.Walls 1.0 | 2 | 4% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.0 | 133 / 210 | 1.99 | 19.3% | 33132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.3% | 133 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.7% | 45 |
| mld.DustBunny 3.8 | 3.3 | 12.5% | 17 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.9% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 1 |
| bzdp.BoxCar 2.0 | 7.3 | 7.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.4% | 6 |
| fullsail.SweetTea 1.1 | 8.5 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 20 / 35 | 5879 |
| 2 | 1 | 67.9 | 85.7 | 18 / 35 | 5427 |
| 3 | 1 | 70.3 | 90.8 | 24 / 35 | 6409 |
| 4 | 1 | 68.3 | 84.1 | 23 / 35 | 4938 |
| 5 | 1 | 69.9 | 91.7 | 26 / 35 | 5152 |
| 6 | 1 | 69.4 | 90.8 | 22 / 35 | 5327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 76 | 72% |
| mld.DustBunny 3.8 | 50 | 84% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 38% | 84 |
| mld.DustBunny 3.8 | 16 | 21% | 53 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 12% | 16 |
| maribo.melee.BMV 0.1 | 8 | 10% | 14 |
| zyx.nano.Ant 1.1 | 4 | 5% | 10 |
| bzdp.BoxCar 2.0 | 4 | 5% | 6 |
| cs.Grudge 1.0 | 4 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 14 |
| fullsail.SweetTea 1.1 | 1 | 1% | 9 |

## Melee bench: F03

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.3 | 124 / 210 | 2.68 | 19.4% | 36484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.4% | 124 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.0% | 21 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.3% | 2 |
| sample.Tracker 1.0 | 8.8 | 5.2% | 1 |
| sample.Fire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.9 | 22 / 35 | 6328 |
| 2 | 1 | 67.1 | 73.0 | 15 / 35 | 5860 |
| 3 | 1 | 67.3 | 77.8 | 20 / 35 | 5562 |
| 4 | 1 | 70.1 | 82.9 | 23 / 35 | 6122 |
| 5 | 1 | 69.4 | 79.0 | 21 / 35 | 6228 |
| 6 | 1 | 71.0 | 87.3 | 23 / 35 | 6384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 82% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 14 | 71% |
| fm.mammillarias 1.3 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 50% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 24% | 41 |
| myl.micro.Troodon 1.10 | 19 | 22% | 71 |
| cb.nano.Insomnia 1.0 | 14 | 16% | 22 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 32 |
| fm.mammillarias 1.3 | 11 | 13% | 15 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 4 |
| sample.Tracker 1.0 | 3 | 3% | 4 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 13 |
| sample.Fire 1.0 | 2 | 2% | 7 |

## Melee bench: F04

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.7 | 156 / 210 | 2.10 | 20.9% | 39614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.9% | 156 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.4% | 12 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.4% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.9% | 1 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.6% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.2 | 27 / 35 | 6392 |
| 2 | 1 | 72.6 | 93.3 | 29 / 35 | 6909 |
| 3 | 1 | 71.6 | 91.4 | 29 / 35 | 6347 |
| 4 | 1 | 69.8 | 83.5 | 23 / 35 | 6812 |
| 5 | 1 | 69.9 | 87.9 | 21 / 35 | 6275 |
| 6 | 1 | 71.2 | 87.0 | 27 / 35 | 6879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 94% |
| stelo.SoJNanoMelee 1.1 | 48 | 92% |
| tj.zombie1n 1.0.1 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 39% | 88 |
| stelo.SoJNanoMelee 1.1 | 9 | 17% | 42 |
| tj.zombie1n 1.0.1 | 7 | 13% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 11 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 26 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 11 |
| yk.JahMicro 1.0 | 2 | 4% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 64.1 | 86 / 210 | 4.23 | 15.0% | 27691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 15.0% | 86 |
| oog.melee.Corsair 1.0 | 1.8 | 13.5% | 44 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.1% | 25 |
| EBBU.Sim2 1.02 | 5.0 | 10.0% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.4% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.9% | 6 |
| sam.Samspin 1.0 | 7.2 | 8.9% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 61.9 | 15 / 35 | 4898 |
| 2 | 1 | 64.0 | 70.5 | 17 / 35 | 4803 |
| 3 | 1 | 62.6 | 66.0 | 16 / 35 | 4675 |
| 4 | 2 | 58.0 | 56.2 | 11 / 35 | 3940 |
| 5 | 1 | 63.3 | 67.0 | 12 / 35 | 4988 |
| 6 | 1 | 61.2 | 63.2 | 15 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 92% |
| ahf.NanoAndrew .4 | 20 | 75% |
| oog.melee.Corsair 1.0 | 20 | 55% |
| EBBU.Sim2 1.02 | 14 | 100% |
| sam.Samspin 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 357. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 19% | 53 |
| oog.melee.Corsair 1.0 | 20 | 16% | 34 |
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 14% | 22 |
| EBBU.Sim2 1.02 | 12 | 10% | 22 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 13 |
| ahf.NanoAndrew .4 | 8 | 6% | 25 |
| sam.Samspin 1.0 | 7 | 6% | 10 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.6 | 128 / 210 | 2.48 | 18.7% | 32294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.7% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 35 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.2% | 14 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 10.8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.3% | 15 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 2 |
| fm.claire 1.7 | 6.8 | 8.0% | 2 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 4 |
| pa.Improved 1.0 | 9.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 23 / 35 | 5078 |
| 2 | 1 | 67.9 | 81.3 | 24 / 35 | 5169 |
| 3 | 1 | 68.2 | 84.4 | 22 / 35 | 5331 |
| 4 | 1 | 67.7 | 84.8 | 18 / 35 | 5469 |
| 5 | 1 | 68.4 | 82.9 | 21 / 35 | 5691 |
| 6 | 1 | 68.3 | 84.4 | 20 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 78% |
| oog.melee.CapuletDroid 1.1 | 37 | 100% |
| gh.nano.Grofvuil 0.2 | 12 | 75% |
| sample.SpinBot 1.0 | 11 | 100% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| fm.claire 1.7 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 40% | 73 |
| gh.nano.Grofvuil 0.2 | 16 | 20% | 30 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 50 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 12 |
| sample.SpinBot 1.0 | 5 | 6% | 12 |
| fm.claire 1.7 | 5 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 10 |
| kurios.DOSexe .9b | 2 | 2% | 9 |
| pa.Improved 1.0 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.2 | 113 / 210 | 2.51 | 18.7% | 35267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 18.7% | 113 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.4% | 32 |
| mz.MicroGodMelee 1 | 3.0 | 13.6% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.3% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.9% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.1% | 3 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 19 / 35 | 6324 |
| 2 | 1 | 67.8 | 80.3 | 19 / 35 | 5501 |
| 3 | 1 | 69.6 | 89.8 | 21 / 35 | 6037 |
| 4 | 1 | 69.0 | 83.2 | 20 / 35 | 6148 |
| 5 | 1 | 69.3 | 82.9 | 22 / 35 | 5932 |
| 6 | 1 | 65.2 | 74.0 | 12 / 35 | 5325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 88% |
| mz.MicroGodMelee 1 | 42 | 62% |
| gh.micro.Gruweltje 0.7 | 25 | 72% |
| DBall.Anarchy 0.1 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| acogdev.alpha 0.2 | 3 | 67% |

Hadur died in 98 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 30% | 62 |
| gh.micro.Gruweltje 0.7 | 23 | 23% | 47 |
| spinnercat.micro.Tyger 0.1 | 21 | 21% | 55 |
| acogdev.alpha 0.2 | 7 | 7% | 9 |
| el.JumpShoot 0.2 | 6 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 9 |
| DBall.Anarchy 0.1 | 1 | 1% | 10 |

## Melee bench: F08

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.9 | 108 / 210 | 3.26 | 17.3% | 31689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 17.3% | 108 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 6 |
| germ.TheMind .2 | 5.2 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.7 | 8.9% | 8 |
| awesomeness.Elite 1.0 | 7.0 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 2 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 75.9 | 20 / 35 | 5624 |
| 2 | 1 | 65.9 | 73.3 | 20 / 35 | 5137 |
| 3 | 1 | 65.4 | 71.7 | 15 / 35 | 5357 |
| 4 | 2 | 63.0 | 67.3 | 15 / 35 | 4459 |
| 5 | 1 | 67.0 | 78.1 | 18 / 35 | 5364 |
| 6 | 1 | 68.7 | 82.9 | 20 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 79% |
| germ.TheMind .2 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 44% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 42 |
| germ.TheMind .2 | 10 | 10% | 22 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 13 |
| awesomeness.Elite 1.0 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 12 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.8 | 157 / 210 | 1.92 | 20.3% | 31602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.3% | 157 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.2% | 11 |
| maribo.IotaCT 1.1 | 4.0 | 10.4% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 3 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 4 |
| ratosh.Wesco 1.4 | 7.7 | 8.4% | 3 |
| stelo.PatternRobot 1.0 | 7.7 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.8 | 31 / 35 | 5670 |
| 2 | 1 | 69.4 | 86.7 | 23 / 35 | 4965 |
| 3 | 1 | 70.8 | 90.8 | 29 / 35 | 4940 |
| 4 | 1 | 68.1 | 80.6 | 20 / 35 | 4921 |
| 5 | 1 | 70.8 | 89.2 | 26 / 35 | 5174 |
| 6 | 1 | 72.0 | 94.6 | 28 / 35 | 5932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 99% |
| nz.jdc.nano.GridFu 1.0 | 25 | 100% |
| stelo.PatternRobot 1.0 | 19 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 93% |
| maribo.IotaCT 1.1 | 11 | 73% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 21% | 65 |
| stelo.PatternRobot 1.0 | 9 | 17% | 27 |
| timmit.nano.TimDog 0.33 | 9 | 17% | 25 |
| maribo.IotaCT 1.1 | 8 | 15% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 13% | 11 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 35 |
| ratosh.Wesco 1.4 | 4 | 8% | 10 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.0 | 165 / 210 | 1.90 | 21.3% | 39310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.3% | 165 |
| baal.nano.N 1.42 | 2.5 | 11.5% | 7 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 15 |
| zyx.micro.Ant 1.1 | 5.0 | 9.4% | 9 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.9% | 2 |
| sanja.First 0.1 | 6.8 | 8.2% | 0 |
| cvt.Firsty 1.0 | 8.2 | 7.5% | 8 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.6 | 30 / 35 | 6658 |
| 2 | 1 | 71.8 | 93.3 | 31 / 35 | 6294 |
| 3 | 1 | 70.6 | 87.3 | 25 / 35 | 6691 |
| 4 | 1 | 70.3 | 85.4 | 28 / 35 | 6230 |
| 5 | 1 | 70.0 | 85.4 | 22 / 35 | 6628 |
| 6 | 1 | 72.3 | 94.0 | 29 / 35 | 6809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 89% |
| tvv.nano.Polaris 1.2 | 36 | 92% |
| sanja.First 0.1 | 26 | 100% |
| cvt.Firsty 1.0 | 24 | 92% |
| zyx.micro.Ant 1.1 | 21 | 90% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 83% |

Hadur died in 45 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 29% | 49 |
| tvv.nano.Polaris 1.2 | 9 | 20% | 49 |
| baal.nano.N 1.42 | 8 | 18% | 39 |
| sanja.First 0.1 | 4 | 9% | 22 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 13 |
| cvt.Firsty 1.0 | 3 | 7% | 17 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 8 |
| sample.RamFire 1.0 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.0 | 81 / 210 | 3.97 | 15.3% | 31205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.3 | 15.3% | 81 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 62 |
| cs.Wren 1.0 | 3.3 | 12.7% | 21 |
| mz.Cork 0.1 | 4.3 | 11.2% | 15 |
| js.PinBall 1.6 | 4.3 | 10.9% | 19 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 5 |
| evd.X1 0.01 | 6.8 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.6% | 3 |
| PSW.Relentless 0.1 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.0 | 15 / 35 | 5415 |
| 2 | 1 | 63.5 | 67.0 | 14 / 35 | 5382 |
| 3 | 2 | 62.6 | 64.4 | 12 / 35 | 5383 |
| 4 | 1 | 61.1 | 61.6 | 14 / 35 | 4909 |
| 5 | 2 | 61.2 | 62.9 | 10 / 35 | 4936 |
| 6 | 1 | 64.7 | 72.4 | 16 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 75% |
| cs.Wren 1.0 | 23 | 83% |
| mz.Cork 0.1 | 13 | 92% |
| js.PinBall 1.6 | 8 | 38% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 40% | 93 |
| mz.Cork 0.1 | 17 | 13% | 32 |
| evd.X1 0.01 | 17 | 13% | 18 |
| cs.Wren 1.0 | 15 | 12% | 26 |
| joe.ADinosaur 1.0 | 15 | 12% | 18 |
| js.PinBall 1.6 | 10 | 8% | 14 |
| PSW.Relentless 0.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 82.9 | 136 / 210 | 2.54 | 19.2% | 31767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.2% | 136 |
| ntc.Opposite 1.5 | 2.8 | 11.3% | 8 |
| myl.nano.Graviton 1.10 | 3.3 | 11.5% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.6% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.4% | 18 |
| disan.Chair 2.2.0 | 7.3 | 7.9% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 22 / 35 | 5292 |
| 2 | 1 | 68.0 | 81.0 | 23 / 35 | 5081 |
| 3 | 1 | 69.9 | 87.0 | 23 / 35 | 5718 |
| 4 | 1 | 68.7 | 83.5 | 23 / 35 | 5259 |
| 5 | 1 | 67.1 | 78.4 | 20 / 35 | 5110 |
| 6 | 1 | 69.4 | 87.0 | 25 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 86% |
| myl.nano.Graviton 1.10 | 28 | 75% |
| ntc.Opposite 1.5 | 20 | 95% |
| donjezza.Muncho 1.0 | 15 | 100% |
| disan.Chair 2.2.0 | 13 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 100% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 74 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 23% | 43 |
| pfvicm.Sobieski 7.2.3b | 16 | 22% | 24 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 15% | 22 |
| ntc.Opposite 1.5 | 9 | 12% | 26 |
| disan.Chair 2.2.0 | 5 | 7% | 20 |
| DBall.NUKE 0.1 | 1 | 1% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 14 |

## Melee bench: F13

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.1 | 88 / 210 | 3.33 | 16.1% | 26126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.2 | 16.1% | 88 |
| oog.melee.Capulet 1.2 | 2.5 | 14.0% | 48 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.3% | 33 |
| yagami.Tidus 0.11 | 4.2 | 12.2% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 19 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 70.8 | 15 / 35 | 4063 |
| 2 | 1 | 65.9 | 78.4 | 14 / 35 | 4378 |
| 3 | 2 | 62.7 | 66.3 | 15 / 35 | 4077 |
| 4 | 1 | 66.5 | 80.3 | 13 / 35 | 4518 |
| 5 | 1 | 66.2 | 77.5 | 15 / 35 | 4600 |
| 6 | 1 | 64.6 | 71.1 | 16 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 83% |
| yagami.Tidus 0.11 | 22 | 95% |
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| ejb.Polaris 1.0.1 | 4 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 45% | 88 |
| yagami.Tidus 0.11 | 21 | 17% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 38 |
| kawigi.micro.Shiz 1.1 | 9 | 7% | 20 |
| ejb.Polaris 1.0.1 | 9 | 7% | 16 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.4 | 133 / 210 | 2.86 | 17.7% | 28574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 17.7% | 133 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 23 |
| wompi.Quokka 1.6 | 3.7 | 11.3% | 17 |
| wee.Gem 1.8.4 | 4.0 | 11.5% | 21 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 6 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.5 | 26 / 35 | 4809 |
| 2 | 1 | 68.0 | 83.8 | 24 / 35 | 4836 |
| 3 | 1 | 68.8 | 86.7 | 25 / 35 | 5061 |
| 4 | 1 | 65.8 | 78.1 | 19 / 35 | 4698 |
| 5 | 1 | 65.0 | 73.0 | 18 / 35 | 4869 |
| 6 | 1 | 64.5 | 72.1 | 21 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| wee.Gem 1.8.4 | 33 | 97% |
| wompi.Quokka 1.6 | 23 | 78% |
| ratosh.Nobo 0.21 | 17 | 88% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 15 | 19% | 29 |
| maribo.FollowFire 1 | 11 | 14% | 11 |
| ratosh.Nobo 0.21 | 9 | 12% | 24 |
| bayen.UbaMicro 1.4 | 9 | 12% | 18 |
| wee.Gem 1.8.4 | 8 | 10% | 50 |
| bzdp.Pansy 2.1 | 8 | 10% | 47 |
| m3thos.Eva00 1.1 | 7 | 9% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.1 | 132 / 210 | 2.07 | 21.4% | 45945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 21.4% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 20 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 2 |
| stuff.Vlad 0.1 | 5.5 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.2% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 89.5 | 21 / 35 | 8002 |
| 2 | 1 | 71.7 | 85.1 | 22 / 35 | 7071 |
| 3 | 1 | 72.7 | 90.5 | 21 / 35 | 7790 |
| 4 | 1 | 71.8 | 84.8 | 22 / 35 | 7698 |
| 5 | 1 | 72.8 | 92.1 | 23 / 35 | 7515 |
| 6 | 1 | 72.8 | 87.0 | 23 / 35 | 7869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 82% |
| drd.Dreadknoght 0.9 | 14 | 100% |
| mz.NanoGod 2.02 | 12 | 67% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| ayk.WallHugger 1.0 | 10 | 100% |
| stelo.PianistNano 1.2 | 6 | 83% |
| sample.SittingDuck 1.0 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 39% | 120 |
| mz.NanoGod 2.02 | 23 | 29% | 42 |
| exauge.GateKeeper 1.1.121g | 12 | 15% | 19 |
| ayk.WallHugger 1.0 | 7 | 9% | 12 |
| stelo.PianistNano 1.2 | 5 | 6% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.8 | 117 / 210 | 3.45 | 16.9% | 29316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 16.9% | 117 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.3% | 21 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.8% | 16 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 8 |
| conscience.Electron 1.3g | 7.3 | 7.8% | 0 |
| dl.BetterWalls 1.0 | 8.2 | 7.1% | 6 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 69.8 | 18 / 35 | 4972 |
| 2 | 1 | 66.9 | 78.1 | 22 / 35 | 4920 |
| 3 | 1 | 65.8 | 73.7 | 20 / 35 | 5026 |
| 4 | 1 | 66.5 | 77.1 | 21 / 35 | 5117 |
| 5 | 1 | 62.7 | 63.8 | 16 / 35 | 4870 |
| 6 | 1 | 64.6 | 74.3 | 20 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 79% |
| dummy.micro.Sparrow 2.5 | 29 | 90% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 3 | 67% |

Hadur died in 94 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 21% | 20 |
| dummy.micro.Sparrow 2.5 | 13 | 14% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 14% | 35 |
| bvh.micro.Freya 0.3 | 12 | 13% | 25 |
| conscience.Electron 1.3g | 11 | 12% | 13 |
| voidious.micro.BlitzBat 1.05 | 10 | 11% | 44 |
| dl.BetterWalls 1.0 | 9 | 10% | 16 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 85.0 | 142 / 210 | 2.35 | 20.7% | 40240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 20.7% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 23 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.0% | 8 |
| sul.Lunar 1.1 | 3.7 | 11.0% | 14 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 4 |
| dsw.StaticD 1.0 | 5.5 | 9.2% | 12 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.5% | 4 |
| sample.Corners 1.0 | 9.3 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.3 | 21 / 35 | 6579 |
| 2 | 1 | 72.9 | 90.2 | 27 / 35 | 7481 |
| 3 | 1 | 69.8 | 82.5 | 23 / 35 | 6494 |
| 4 | 1 | 72.0 | 88.3 | 26 / 35 | 6811 |
| 5 | 1 | 69.7 | 81.6 | 20 / 35 | 6631 |
| 6 | 1 | 70.4 | 86.0 | 25 / 35 | 6244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 96% |
| sul.Lunar 1.1 | 43 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 88% |
| dsw.StaticD 1.0 | 11 | 36% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 71% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 29% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 28% | 61 |
| dsw.StaticD 1.0 | 14 | 20% | 24 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 7% | 14 |
| sample.Corners 1.0 | 4 | 6% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 6 |
| sul.Lunar 1.1 | 2 | 3% | 45 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWTN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 81.3 | 130 / 210 | 2.68 | 19.1% | 39204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTN 0.1 | 1.0 | 19.1% | 130 |
| radnor.DoctorBob 1.42 | 2.2 | 13.1% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 21 |
| mld.Wisdom 1.0 | 3.7 | 11.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 7 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.8% | 6 |
| sample.Walls 1.0 | 7.2 | 7.7% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 73.0 | 19 / 35 | 6044 |
| 2 | 1 | 68.9 | 83.5 | 27 / 35 | 6007 |
| 3 | 1 | 68.9 | 81.3 | 17 / 35 | 6731 |
| 4 | 1 | 68.6 | 80.0 | 23 / 35 | 6620 |
| 5 | 1 | 69.8 | 85.7 | 24 / 35 | 6667 |
| 6 | 1 | 69.7 | 84.4 | 20 / 35 | 7135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 53 | 87% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| mld.Wisdom 1.0 | 12 | 58% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| amz.NanoClone 1.41 | 10 | 80% |
| sample.Walls 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 21 | 26% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 21% | 65 |
| radnor.DoctorBob 1.42 | 14 | 18% | 51 |
| KiraNL.Chupacabra 0.4 | 13 | 16% | 28 |
| amz.NanoClone 1.41 | 7 | 9% | 14 |
| sample.Walls 1.0 | 5 | 6% | 14 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

