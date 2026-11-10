# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.6 | 140 / 210 | 2.21 | 20.7% | 41907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 20.7% | 140 |
| radnor.DoctorBob 1.42 | 2.5 | 14.7% | 34 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 10 |
| amz.NanoClone 1.41 | 5.0 | 10.8% | 6 |
| sample.Walls 1.0 | 6.3 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.5% | 1 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 80.6 | 21 / 35 | 6502 |
| 2 | 1 | 72.8 | 92.4 | 26 / 35 | 6972 |
| 3 | 1 | 73.9 | 94.0 | 26 / 35 | 7827 |
| 4 | 1 | 69.9 | 82.5 | 22 / 35 | 6569 |
| 5 | 1 | 72.0 | 89.5 | 23 / 35 | 7043 |
| 6 | 1 | 70.6 | 80.3 | 22 / 35 | 6994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 61 | 95% |
| mld.Infinity 2.2 | 40 | 100% |
| radnor.DoctorBob 1.42 | 38 | 71% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 44% | 68 |
| mz.AntiGrav 1.0 | 13 | 19% | 58 |
| amz.NanoClone 1.41 | 10 | 14% | 16 |
| mld.Infinity 2.2 | 6 | 9% | 38 |
| GarmBox.Oranges 1.0 | 6 | 9% | 7 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 8 |
| sample.Walls 1.0 | 1 | 1% | 7 |

## Melee bench: F02

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.3 | 103 / 210 | 2.78 | 17.5% | 30726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.3 | 17.5% | 103 |
| mld.DustBunny 3.8 | 2.2 | 14.0% | 24 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.5% | 59 |
| maribo.melee.BMV 0.1 | 4.5 | 9.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.2% | 7 |
| fullsail.SweetTea 1.1 | 8.0 | 7.4% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 3 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 87.0 | 14 / 35 | 4909 |
| 2 | 1 | 69.8 | 91.4 | 22 / 35 | 5580 |
| 3 | 1 | 66.8 | 80.6 | 18 / 35 | 5112 |
| 4 | 3 | 58.6 | 51.7 | 8 / 35 | 4848 |
| 5 | 1 | 66.2 | 80.3 | 18 / 35 | 4933 |
| 6 | 1 | 69.1 | 90.5 | 23 / 35 | 5344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 82% |
| oog.melee.Mercutio 1.0 | 43 | 51% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 10 | 90% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| maribo.melee.BMV 0.1 | 5 | 60% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 38% | 66 |
| mld.DustBunny 3.8 | 22 | 21% | 64 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 11% | 23 |
| zyx.nano.Ant 1.1 | 9 | 8% | 13 |
| cs.Grudge 1.0 | 9 | 8% | 8 |
| maribo.melee.BMV 0.1 | 5 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 14 |
| fullsail.SweetTea 1.1 | 3 | 3% | 10 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 79.0 | 118 / 210 | 2.89 | 18.7% | 35481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 18.7% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 15.3% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.3% | 23 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 11 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 4 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 4 |
| sample.Fire 1.0 | 8.8 | 5.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 84.4 | 22 / 35 | 6137 |
| 2 | 1 | 69.2 | 82.5 | 22 / 35 | 5796 |
| 3 | 1 | 68.2 | 78.4 | 19 / 35 | 5953 |
| 4 | 1 | 66.3 | 73.7 | 16 / 35 | 5661 |
| 5 | 1 | 68.1 | 74.3 | 18 / 35 | 6298 |
| 6 | 1 | 68.4 | 81.0 | 21 / 35 | 5636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 79% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| myl.nano.KomoriNinja 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 26% | 45 |
| myl.micro.Troodon 1.10 | 20 | 22% | 66 |
| fm.mammillarias 1.3 | 18 | 19% | 22 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 17 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 26 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 16 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 6 |
| sample.Fire 1.0 | 3 | 3% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.8 | 128 / 210 | 2.55 | 19.6% | 38606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 19.6% | 128 |
| tvv.micro.Antares 1.1.1 | 2.2 | 12.4% | 16 |
| kawigi.nano.Lib 1.0 | 3.0 | 11.8% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.1% | 23 |
| tj.zombie1n 1.0.1 | 5.2 | 9.1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 9.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 9 |
| yk.JahMicro 1.0 | 7.3 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 80.3 | 21 / 35 | 6571 |
| 2 | 1 | 69.0 | 83.5 | 23 / 35 | 6346 |
| 3 | 1 | 68.4 | 80.6 | 23 / 35 | 6171 |
| 4 | 1 | 71.0 | 89.2 | 21 / 35 | 6974 |
| 5 | 1 | 68.1 | 80.0 | 19 / 35 | 6216 |
| 6 | 1 | 68.9 | 82.9 | 21 / 35 | 6328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 49 | 92% |
| stelo.SoJNanoMelee 1.1 | 39 | 90% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| tj.zombie1n 1.0.1 | 13 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 60% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 28 | 34% | 77 |
| stelo.SoJNanoMelee 1.1 | 17 | 21% | 39 |
| tvv.micro.Antares 1.1.1 | 9 | 11% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 10% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 16 |
| tj.zombie1n 1.0.1 | 4 | 5% | 11 |
| yk.JahMicro 1.0 | 3 | 4% | 12 |
| repositorio.NanoStep 1.0 | 3 | 4% | 8 |
| sample.VelociRobot 1.0 | 3 | 4% | 6 |

## Melee bench: F05

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 65.8 | 80 / 210 | 4.08 | 14.9% | 27625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.3 | 14.9% | 80 |
| oog.melee.Corsair 1.0 | 1.8 | 12.9% | 38 |
| ahf.NanoAndrew .4 | 4.2 | 11.1% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 22 |
| sam.Samspin 1.0 | 5.2 | 10.2% | 18 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 63.2 | 14 / 35 | 4687 |
| 2 | 2 | 57.9 | 53.3 | 8 / 35 | 4555 |
| 3 | 1 | 62.2 | 67.3 | 13 / 35 | 4683 |
| 4 | 1 | 63.6 | 73.7 | 15 / 35 | 4744 |
| 5 | 2 | 58.8 | 58.4 | 11 / 35 | 4310 |
| 6 | 1 | 66.0 | 78.7 | 19 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 93% |
| oog.melee.Corsair 1.0 | 26 | 46% |
| ahf.NanoAndrew .4 | 14 | 57% |
| sam.Samspin 1.0 | 11 | 91% |
| EBBU.Sim2 1.02 | 11 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |

Hadur died in 130 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 20% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 23 | 18% | 20 |
| simonton.nano.MeleeSeed 1.8 | 21 | 16% | 39 |
| ahf.NanoAndrew .4 | 18 | 14% | 32 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 22 |
| sam.Samspin 1.0 | 7 | 5% | 17 |
| EBBU.Sim2 1.02 | 6 | 5% | 17 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 13 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |

## Melee bench: F06

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.6 | 132 / 210 | 2.39 | 18.8% | 31802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 18.8% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 41 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.1% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 12 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 7 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 2 |
| pa.Improved 1.0 | 9.3 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.9 | 23 / 35 | 5509 |
| 2 | 1 | 69.3 | 89.2 | 24 / 35 | 5377 |
| 3 | 1 | 64.8 | 74.9 | 17 / 35 | 4837 |
| 4 | 1 | 70.2 | 90.8 | 24 / 35 | 5899 |
| 5 | 1 | 68.3 | 87.6 | 23 / 35 | 4641 |
| 6 | 1 | 67.8 | 82.2 | 21 / 35 | 5539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 81% |
| oog.melee.CapuletDroid 1.1 | 23 | 100% |
| arthord.NanoSatanMelee Beta | 23 | 96% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| sample.SpinBot 1.0 | 8 | 100% |
| fm.claire 1.7 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 33% | 74 |
| gh.nano.Grofvuil 0.2 | 14 | 18% | 29 |
| fm.claire 1.7 | 10 | 13% | 11 |
| oog.melee.CapuletDroid 1.1 | 9 | 12% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 17 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 16 |
| sample.SpinBot 1.0 | 5 | 6% | 11 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.8 | 79 / 210 | 3.18 | 16.8% | 32802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.2 | 16.8% | 79 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.0% | 45 |
| mz.MicroGodMelee 1 | 3.0 | 13.9% | 48 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.4% | 25 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 0 |
| acogdev.alpha 0.2 | 7.5 | 6.7% | 5 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.2% | 2 |
| el.JumpShoot 0.2 | 8.8 | 6.2% | 3 |
| fire219.CatBot 1.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.3 | 13 / 35 | 5903 |
| 2 | 1 | 65.7 | 72.7 | 15 / 35 | 5827 |
| 3 | 1 | 65.3 | 75.6 | 15 / 35 | 5328 |
| 4 | 1 | 64.1 | 74.9 | 13 / 35 | 4847 |
| 5 | 2 | 65.3 | 74.3 | 10 / 35 | 5324 |
| 6 | 1 | 66.2 | 76.2 | 13 / 35 | 5573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 45 | 42% |
| spinnercat.micro.Tyger 0.1 | 38 | 89% |
| gh.micro.Gruweltje 0.7 | 20 | 40% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 37 | 28% | 61 |
| gh.micro.Gruweltje 0.7 | 32 | 24% | 49 |
| spinnercat.micro.Tyger 0.1 | 24 | 18% | 47 |
| caimano.Furia_Ceca 0.22 | 11 | 8% | 11 |
| acogdev.alpha 0.2 | 9 | 7% | 9 |
| el.JumpShoot 0.2 | 6 | 5% | 6 |
| DBall.Anarchy 0.1 | 5 | 4% | 12 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 12 |
| fire219.CatBot 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 68.5 | 89 / 210 | 3.84 | 15.8% | 30603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.5 | 15.8% | 89 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.5% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 11 |
| germ.TheMind .2 | 5.0 | 9.9% | 8 |
| awesomeness.Elite 1.0 | 6.2 | 8.4% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.4% | 0 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.9% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.5% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 66.7 | 14 / 35 | 5720 |
| 2 | 1 | 64.8 | 71.1 | 16 / 35 | 5081 |
| 3 | 1 | 65.7 | 75.9 | 15 / 35 | 5298 |
| 4 | 3 | 59.7 | 57.5 | 12 / 35 | 4322 |
| 5 | 1 | 64.0 | 69.2 | 14 / 35 | 5288 |
| 6 | 2 | 64.6 | 70.5 | 18 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| awesomeness.Elite 1.0 | 11 | 73% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| germ.TheMind .2 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 36% | 82 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 19% | 37 |
| germ.TheMind .2 | 18 | 15% | 28 |
| awesomeness.Elite 1.0 | 10 | 8% | 16 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 16 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 9 |
| sample.Crazy 1.0 | 3 | 2% | 7 |
| mym.EdgeStalker 1.0 | 3 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.5 | 122 / 210 | 2.49 | 18.5% | 29194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 18.5% | 122 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 12 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 13 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 9.0% | 1 |
| stelo.PatternRobot 1.0 | 6.8 | 9.1% | 8 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 10 |
| spinnercat.Omen 1.0 | 8.5 | 7.6% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.5 | 25 / 35 | 5497 |
| 2 | 1 | 66.6 | 79.0 | 17 / 35 | 4903 |
| 3 | 1 | 68.8 | 85.7 | 22 / 35 | 4939 |
| 4 | 1 | 67.6 | 83.2 | 20 / 35 | 4363 |
| 5 | 1 | 67.3 | 81.6 | 19 / 35 | 4722 |
| 6 | 1 | 67.9 | 81.0 | 19 / 35 | 4770 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 93% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| stelo.PatternRobot 1.0 | 21 | 81% |
| maribo.IotaCT 1.1 | 8 | 75% |
| ratosh.Wesco 1.4 | 8 | 75% |
| timmit.nano.TimDog 0.33 | 7 | 29% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |

Hadur died in 88 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 22% | 65 |
| stelo.PatternRobot 1.0 | 19 | 22% | 30 |
| ratosh.Wesco 1.4 | 13 | 15% | 24 |
| timmit.nano.TimDog 0.33 | 13 | 15% | 18 |
| maribo.IotaCT 1.1 | 9 | 10% | 17 |
| nz.jdc.nano.GridFu 1.0 | 8 | 9% | 43 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.7 | 140 / 210 | 2.02 | 20.2% | 37005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 20.2% | 140 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 20 |
| baal.nano.N 1.42 | 3.2 | 11.4% | 10 |
| zyx.micro.Ant 1.1 | 3.7 | 11.0% | 21 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.8% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.4% | 2 |
| sanja.First 0.1 | 7.2 | 8.0% | 5 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.0% | 7 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 22 / 35 | 6016 |
| 2 | 1 | 71.0 | 92.4 | 28 / 35 | 6396 |
| 3 | 1 | 68.4 | 84.8 | 20 / 35 | 5965 |
| 4 | 1 | 70.6 | 91.4 | 25 / 35 | 6010 |
| 5 | 1 | 69.0 | 87.6 | 22 / 35 | 6053 |
| 6 | 1 | 70.9 | 90.8 | 23 / 35 | 6565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 31 | 87% |
| zyx.micro.Ant 1.1 | 30 | 77% |
| baal.nano.N 1.42 | 28 | 75% |
| cvt.Firsty 1.0 | 23 | 87% |
| sanja.First 0.1 | 16 | 94% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 29 | 40% | 53 |
| baal.nano.N 1.42 | 11 | 15% | 25 |
| tvv.nano.Polaris 1.2 | 8 | 11% | 58 |
| Grystrion.TrackerWO 1.0 | 8 | 11% | 18 |
| cvt.Firsty 1.0 | 7 | 10% | 20 |
| sanja.First 0.1 | 4 | 6% | 20 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 7 |
| sample.RamFire 1.0 | 1 | 1% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 63.3 | 49 / 210 | 4.30 | 14.1% | 29191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.4% | 94 |
| hadur117.micro.SaorWD2 0.1 | 2.0 | 14.1% | 49 |
| cs.Wren 1.0 | 3.2 | 12.5% | 23 |
| mz.Cork 0.1 | 4.3 | 11.1% | 8 |
| js.PinBall 1.6 | 4.7 | 11.0% | 18 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 5 |
| evd.X1 0.01 | 6.7 | 8.4% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.3 | 8 / 35 | 5272 |
| 2 | 2 | 61.2 | 63.5 | 10 / 35 | 4656 |
| 3 | 2 | 57.3 | 54.9 | 6 / 35 | 4590 |
| 4 | 2 | 60.0 | 64.4 | 7 / 35 | 4424 |
| 5 | 2 | 60.4 | 58.1 | 10 / 35 | 4906 |
| 6 | 2 | 62.5 | 65.7 | 8 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 48% |
| cs.Wren 1.0 | 17 | 53% |
| joe.ADinosaur 1.0 | 5 | 80% |
| js.PinBall 1.6 | 4 | 50% |
| donjezza.Jezza 1.0 | 3 | 100% |
| mz.Cork 0.1 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 74 | 46% | 103 |
| cs.Wren 1.0 | 22 | 14% | 28 |
| evd.X1 0.01 | 20 | 12% | 20 |
| joe.ADinosaur 1.0 | 17 | 10% | 23 |
| PSW.Relentless 0.1 | 10 | 6% | 11 |
| mz.Cork 0.1 | 8 | 5% | 10 |
| js.PinBall 1.6 | 6 | 4% | 9 |
| donjezza.Jezza 1.0 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.7 | 108 / 210 | 2.92 | 17.6% | 28857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 17.6% | 108 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 30 |
| ntc.Opposite 1.5 | 2.8 | 11.4% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 10.1% | 10 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 5 |
| disan.Chair 2.2.0 | 7.7 | 8.1% | 7 |
| pbg.R2D2 1.0 | 9.3 | 5.7% | 5 |
| donjezza.Muncho 1.0 | 9.7 | 5.4% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 22 / 35 | 4711 |
| 2 | 1 | 67.1 | 82.9 | 19 / 35 | 4649 |
| 3 | 1 | 67.3 | 81.0 | 20 / 35 | 4892 |
| 4 | 1 | 67.4 | 80.0 | 17 / 35 | 5238 |
| 5 | 1 | 61.4 | 63.5 | 14 / 35 | 4377 |
| 6 | 1 | 67.4 | 84.4 | 16 / 35 | 4990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 30 | 90% |
| stelo.AreaTargetingBot 1.1 | 29 | 72% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 11 | 82% |
| ntc.Opposite 1.5 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| donjezza.Muncho 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 27 | 26% | 37 |
| ntc.Opposite 1.5 | 17 | 17% | 20 |
| stelo.AreaTargetingBot 1.1 | 14 | 14% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 28 |
| myl.nano.Graviton 1.10 | 12 | 12% | 37 |
| disan.Chair 2.2.0 | 8 | 8% | 20 |
| donjezza.Muncho 1.0 | 5 | 5% | 8 |
| DBall.NUKE 0.1 | 3 | 3% | 17 |
| pbg.R2D2 1.0 | 3 | 3% | 10 |

## Melee bench: F13

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.8 | 71 / 210 | 3.36 | 15.7% | 26642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.5 | 15.7% | 71 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 41 |
| oog.melee.Capulet 1.2 | 3.2 | 13.5% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.5% | 23 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 11.0% | 13 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 76.8 | 14 / 35 | 4901 |
| 2 | 1 | 63.7 | 72.4 | 9 / 35 | 4489 |
| 3 | 1 | 67.2 | 82.5 | 15 / 35 | 4739 |
| 4 | 4 | 59.7 | 61.6 | 7 / 35 | 3924 |
| 5 | 1 | 65.0 | 75.6 | 14 / 35 | 4167 |
| 6 | 1 | 64.9 | 74.0 | 12 / 35 | 4422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| oog.melee.Capulet 1.2 | 23 | 39% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| yagami.Tidus 0.11 | 17 | 94% |
| ejb.Polaris 1.0.1 | 7 | 43% |

Hadur died in 139 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 37% | 66 |
| yagami.Tidus 0.11 | 24 | 17% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 15% | 41 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 32 |
| ejb.Polaris 1.0.1 | 13 | 9% | 19 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 6 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.6 | 122 / 210 | 2.74 | 17.6% | 28497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 17.6% | 122 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 20 |
| ratosh.Nobo 0.21 | 3.7 | 11.6% | 14 |
| wee.Gem 1.8.4 | 3.8 | 11.2% | 20 |
| wompi.Quokka 1.6 | 4.2 | 11.4% | 19 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 3 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 3 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 4 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 26 / 35 | 4907 |
| 2 | 1 | 66.1 | 81.3 | 17 / 35 | 4634 |
| 3 | 1 | 66.5 | 78.7 | 21 / 35 | 4995 |
| 4 | 1 | 65.3 | 75.9 | 18 / 35 | 4778 |
| 5 | 1 | 66.0 | 80.6 | 22 / 35 | 4442 |
| 6 | 1 | 65.4 | 75.6 | 18 / 35 | 4741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 88% |
| wee.Gem 1.8.4 | 36 | 97% |
| ratosh.Nobo 0.21 | 17 | 82% |
| bayen.UbaMicro 1.4 | 12 | 67% |
| wompi.Quokka 1.6 | 10 | 80% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 60% |
| m3thos.Eva00 1.1 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 21% | 58 |
| ratosh.Nobo 0.21 | 15 | 16% | 25 |
| wee.Gem 1.8.4 | 11 | 12% | 44 |
| wompi.Quokka 1.6 | 10 | 11% | 19 |
| bayen.UbaMicro 1.4 | 10 | 11% | 19 |
| maribo.FollowFire 1 | 9 | 10% | 9 |
| m3thos.Eva00 1.1 | 7 | 8% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 5% | 12 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 12 |

## Melee bench: F15

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.8 | 102 / 210 | 2.19 | 20.3% | 44326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 20.3% | 102 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 75 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 23 |
| ayk.WallHugger 1.0 | 4.7 | 9.3% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.9% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.1% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.6% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 89.2 | 20 / 35 | 7394 |
| 2 | 1 | 71.2 | 86.7 | 17 / 35 | 7050 |
| 3 | 1 | 69.1 | 81.9 | 14 / 35 | 6556 |
| 4 | 1 | 72.5 | 91.4 | 17 / 35 | 8349 |
| 5 | 1 | 73.0 | 92.1 | 19 / 35 | 7912 |
| 6 | 1 | 69.4 | 79.7 | 15 / 35 | 7065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 68% |
| exauge.GateKeeper 1.1.121g | 17 | 82% |
| mz.NanoGod 2.02 | 13 | 31% |
| ayk.WallHugger 1.0 | 8 | 75% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 42% | 119 |
| mz.NanoGod 2.02 | 35 | 32% | 44 |
| exauge.GateKeeper 1.1.121g | 15 | 14% | 19 |
| ayk.WallHugger 1.0 | 7 | 6% | 14 |
| stuff.Vlad 0.1 | 3 | 3% | 4 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 8 |

## Melee bench: F16

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.8 | 99 / 210 | 3.62 | 16.1% | 28720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 16.1% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.5% | 19 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.3% | 26 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.8% | 23 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 11 |
| conscience.Electron 1.3g | 7.3 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.7 | 6.9% | 12 |
| dl.BetterWalls 1.0 | 8.7 | 6.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 71.1 | 18 / 35 | 4530 |
| 2 | 1 | 60.0 | 59.7 | 15 / 35 | 4305 |
| 3 | 1 | 67.3 | 79.7 | 22 / 35 | 5230 |
| 4 | 1 | 62.8 | 69.5 | 12 / 35 | 4929 |
| 5 | 1 | 66.1 | 79.0 | 17 / 35 | 4931 |
| 6 | 1 | 62.8 | 66.0 | 15 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| dummy.micro.Sparrow 2.5 | 27 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 67% |
| bvh.micro.Freya 0.3 | 15 | 73% |
| stelo.MirrorMicro 1.0 | 5 | 60% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 28 | 25% | 26 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 40 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 30 |
| conscience.Electron 1.3g | 14 | 13% | 15 |
| voidious.micro.BlitzBat 1.05 | 12 | 11% | 46 |
| bvh.micro.Freya 0.3 | 12 | 11% | 24 |
| dl.BetterWalls 1.0 | 12 | 11% | 17 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 12 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.7 | 137 / 210 | 2.47 | 20.1% | 40038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 20.1% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 25 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 10 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 16 |
| mme.NikeEnhanced 2.0 | 4.5 | 10.0% | 4 |
| dsw.StaticD 1.0 | 6.7 | 8.4% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.4% | 4 |
| sample.Corners 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 83.8 | 21 / 35 | 7225 |
| 2 | 1 | 70.1 | 84.4 | 19 / 35 | 6792 |
| 3 | 1 | 70.0 | 82.9 | 23 / 35 | 6808 |
| 4 | 1 | 69.3 | 81.6 | 25 / 35 | 5876 |
| 5 | 1 | 69.2 | 83.8 | 21 / 35 | 6230 |
| 6 | 1 | 71.3 | 85.7 | 28 / 35 | 7107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 90% |
| sul.Lunar 1.1 | 40 | 100% |
| supersample.SuperBoxBot 1.0 | 29 | 93% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| dsw.StaticD 1.0 | 9 | 11% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 31% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 24% | 59 |
| dsw.StaticD 1.0 | 12 | 16% | 20 |
| sul.Lunar 1.1 | 6 | 8% | 45 |
| mme.NikeEnhanced 2.0 | 6 | 8% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 13 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 5 |
| sample.Corners 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.5 | 103 / 210 | 2.93 | 18.0% | 36940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD2 0.1 | 1.0 | 18.0% | 103 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 35 |
| mld.Wisdom 1.0 | 2.8 | 12.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.6% | 22 |
| amz.NanoClone 1.41 | 5.2 | 9.9% | 8 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.1% | 8 |
| sample.Walls 1.0 | 7.2 | 8.1% | 8 |
| GarmBox.Oranges 1.0 | 8.0 | 7.4% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 4 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.2 | 20 / 35 | 6232 |
| 2 | 1 | 69.0 | 82.2 | 17 / 35 | 6951 |
| 3 | 1 | 66.4 | 78.7 | 15 / 35 | 5728 |
| 4 | 1 | 66.4 | 74.3 | 17 / 35 | 6370 |
| 5 | 1 | 65.4 | 73.0 | 14 / 35 | 5879 |
| 6 | 1 | 66.9 | 80.6 | 20 / 35 | 5780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 83% |
| radnor.DoctorBob 1.42 | 32 | 69% |
| mld.Wisdom 1.0 | 23 | 70% |
| KiraNL.Chupacabra 0.4 | 13 | 77% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 26% | 47 |
| radnor.DoctorBob 1.42 | 26 | 24% | 55 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 10% | 37 |
| amz.NanoClone 1.41 | 10 | 9% | 15 |
| jangs.ns51 1.0 | 6 | 6% | 9 |
| GarmBox.Oranges 1.0 | 5 | 5% | 11 |
| sample.Walls 1.0 | 5 | 5% | 10 |

