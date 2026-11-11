# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 91.1 | 156 / 210 | 1.80 | 21.8% | 42754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.8% | 156 |
| mz.AntiGrav 1.0 | 2.5 | 14.7% | 18 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 17 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 4 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| sample.Walls 1.0 | 7.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 86.7 | 23 / 35 | 6460 |
| 2 | 1 | 73.4 | 93.7 | 26 / 35 | 7742 |
| 3 | 1 | 73.5 | 94.0 | 30 / 35 | 7144 |
| 4 | 1 | 72.3 | 89.2 | 25 / 35 | 7249 |
| 5 | 1 | 74.1 | 96.8 | 30 / 35 | 7280 |
| 6 | 1 | 71.4 | 86.0 | 22 / 35 | 6879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 89 | 94% |
| radnor.DoctorBob 1.42 | 34 | 85% |
| mld.Infinity 2.2 | 33 | 88% |
| jangs.ns51 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 35% | 49 |
| mz.AntiGrav 1.0 | 14 | 25% | 86 |
| mld.Infinity 2.2 | 12 | 22% | 43 |
| amz.NanoClone 1.41 | 5 | 9% | 13 |
| jangs.ns51 1.0 | 3 | 5% | 8 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.3 | 147 / 210 | 1.88 | 19.7% | 32557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.7% | 147 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.3% | 37 |
| mld.DustBunny 3.8 | 2.7 | 13.9% | 14 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.0% | 1 |
| zyx.nano.Ant 1.1 | 6.5 | 7.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.4% | 7 |
| bzdp.BoxCar 2.0 | 7.5 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 5.8% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.3 | 26 / 35 | 5420 |
| 2 | 1 | 67.9 | 84.4 | 21 / 35 | 5043 |
| 3 | 1 | 70.1 | 91.1 | 26 / 35 | 5759 |
| 4 | 1 | 70.6 | 91.4 | 24 / 35 | 6035 |
| 5 | 1 | 69.4 | 88.3 | 26 / 35 | 5162 |
| 6 | 1 | 69.8 | 92.1 | 24 / 35 | 5138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 79 | 84% |
| oog.melee.Mercutio 1.0 | 67 | 82% |
| maribo.melee.BMV 0.1 | 12 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 38% | 86 |
| mld.DustBunny 3.8 | 20 | 31% | 75 |
| maribo.melee.BMV 0.1 | 6 | 9% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 8% | 15 |
| djdjdj.NanoSkunk10 1.0 | 4 | 6% | 8 |
| fullsail.SweetTea 1.1 | 3 | 5% | 12 |
| zyx.nano.Ant 1.1 | 2 | 3% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 82.1 | 134 / 210 | 2.61 | 19.7% | 36492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.7% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 46 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.7% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.6% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 8 |
| fm.mammillarias 1.3 | 5.7 | 8.9% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.6 | 24 / 35 | 6511 |
| 2 | 1 | 65.0 | 67.0 | 13 / 35 | 5295 |
| 3 | 1 | 69.6 | 83.8 | 22 / 35 | 6083 |
| 4 | 1 | 71.3 | 86.0 | 24 / 35 | 6617 |
| 5 | 1 | 71.9 | 91.4 | 28 / 35 | 6595 |
| 6 | 1 | 67.9 | 76.5 | 23 / 35 | 5391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 85% |
| cb.nano.Insomnia 1.0 | 21 | 100% |
| myl.nano.KomoriNinja 1.1 | 20 | 100% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 23 | 30% | 45 |
| myl.micro.Troodon 1.10 | 16 | 21% | 64 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 34 |
| fm.mammillarias 1.3 | 10 | 13% | 19 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 21 |
| cb.nano.Insomnia 1.0 | 4 | 5% | 12 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 6 |
| sample.Tracker 1.0 | 3 | 4% | 4 |
| sample.Fire 1.0 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.5 | 156 / 210 | 2.03 | 21.3% | 41264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.3% | 156 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.5% | 14 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 13 |
| tj.zombie1n 1.0.1 | 4.7 | 9.3% | 10 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.6% | 0 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.5 | 27 / 35 | 6691 |
| 2 | 1 | 71.9 | 89.5 | 25 / 35 | 7261 |
| 3 | 1 | 71.5 | 88.9 | 26 / 35 | 6794 |
| 4 | 1 | 71.1 | 87.9 | 26 / 35 | 6890 |
| 5 | 1 | 70.3 | 86.0 | 25 / 35 | 6464 |
| 6 | 1 | 71.6 | 88.3 | 27 / 35 | 7164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 95% |
| stelo.SoJNanoMelee 1.1 | 28 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 95% |
| tj.zombie1n 1.0.1 | 17 | 82% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| yk.JahMicro 1.0 | 13 | 92% |
| sample.VelociRobot 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 33% | 86 |
| stelo.SoJNanoMelee 1.1 | 13 | 24% | 33 |
| tj.zombie1n 1.0.1 | 6 | 11% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 8 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 19 |
| yk.JahMicro 1.0 | 2 | 4% | 12 |
| repositorio.NanoStep 1.0 | 1 | 2% | 11 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.1 | 85 / 210 | 3.87 | 15.6% | 28343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 15.6% | 85 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 36 |
| ahf.NanoAndrew .4 | 3.5 | 11.8% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.5% | 29 |
| sam.Samspin 1.0 | 5.0 | 10.1% | 7 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.1% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 8.3% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 64.1 | 11 / 35 | 4663 |
| 2 | 1 | 61.3 | 60.3 | 16 / 35 | 4724 |
| 3 | 1 | 62.7 | 66.7 | 12 / 35 | 4364 |
| 4 | 1 | 63.6 | 70.2 | 13 / 35 | 4585 |
| 5 | 1 | 65.7 | 76.5 | 17 / 35 | 5109 |
| 6 | 1 | 64.4 | 70.8 | 16 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 89% |
| oog.melee.Corsair 1.0 | 32 | 53% |
| ahf.NanoAndrew .4 | 16 | 75% |
| sam.Samspin 1.0 | 14 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| EBBU.Sim2 1.02 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 23% | 48 |
| ahf.NanoAndrew .4 | 21 | 17% | 32 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 17 | 14% | 17 |
| EBBU.Sim2 1.02 | 14 | 11% | 21 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 16 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| sam.Samspin 1.0 | 4 | 3% | 15 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.7 | 146 / 210 | 2.01 | 19.8% | 32993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.8% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.4% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.2% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.7% | 1 |
| fm.claire 1.7 | 6.3 | 8.2% | 1 |
| sample.SpinBot 1.0 | 8.5 | 6.1% | 0 |
| kurios.DOSexe .9b | 8.8 | 6.0% | 1 |
| pa.Improved 1.0 | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.3 | 24 / 35 | 5338 |
| 2 | 1 | 70.7 | 93.0 | 27 / 35 | 5485 |
| 3 | 1 | 68.8 | 86.7 | 21 / 35 | 5529 |
| 4 | 1 | 68.3 | 84.1 | 22 / 35 | 5244 |
| 5 | 1 | 70.0 | 89.8 | 25 / 35 | 5562 |
| 6 | 1 | 70.6 | 90.5 | 27 / 35 | 5835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 88% |
| oog.melee.CapuletDroid 1.1 | 39 | 92% |
| winamp32.micro.MicroMacro 1.0 | 13 | 100% |
| gh.nano.Grofvuil 0.2 | 13 | 85% |
| arthord.NanoSatanMelee Beta | 8 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| fm.claire 1.7 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 41% | 86 |
| gh.nano.Grofvuil 0.2 | 13 | 20% | 26 |
| oog.melee.CapuletDroid 1.1 | 8 | 12% | 49 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 13 |
| sample.SpinBot 1.0 | 4 | 6% | 7 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 15 |
| fm.claire 1.7 | 3 | 5% | 5 |
| kurios.DOSexe .9b | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.2 | 113 / 210 | 2.60 | 18.6% | 35058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.6% | 113 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.8% | 39 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 0 |
| acogdev.alpha 0.2 | 8.0 | 6.0% | 0 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.4 | 26 / 35 | 6516 |
| 2 | 1 | 68.1 | 82.9 | 20 / 35 | 5760 |
| 3 | 1 | 66.9 | 78.4 | 17 / 35 | 5300 |
| 4 | 1 | 68.0 | 80.3 | 14 / 35 | 6224 |
| 5 | 1 | 67.0 | 79.0 | 18 / 35 | 5341 |
| 6 | 1 | 68.2 | 80.3 | 18 / 35 | 5917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 71 | 87% |
| mz.MicroGodMelee 1 | 40 | 73% |
| gh.micro.Gruweltje 0.7 | 23 | 57% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 34% | 81 |
| mz.MicroGodMelee 1 | 23 | 23% | 57 |
| gh.micro.Gruweltje 0.7 | 21 | 21% | 41 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.4 | 107 / 210 | 3.93 | 15.8% | 28846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.7 | 15.8% | 107 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 14.3% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.8% | 33 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.8% | 5 |
| germ.TheMind .2 | 5.3 | 9.5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 9.0% | 7 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 6 |
| sample.Crazy 1.0 | 8.0 | 7.1% | 2 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.7% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.1 | 23 / 35 | 5233 |
| 2 | 2 | 61.2 | 61.6 | 15 / 35 | 4579 |
| 3 | 2 | 63.7 | 68.3 | 18 / 35 | 4592 |
| 4 | 3 | 57.3 | 51.7 | 11 / 35 | 4013 |
| 5 | 1 | 63.3 | 67.0 | 16 / 35 | 4885 |
| 6 | 1 | 68.2 | 78.7 | 24 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 95% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| germ.TheMind .2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 335. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 51% | 113 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 10% | 21 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 16 |
| germ.TheMind .2 | 7 | 7% | 19 |
| awesomeness.Elite 1.0 | 7 | 7% | 14 |
| mym.EdgeStalker 1.0 | 7 | 7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 9 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.9 | 148 / 210 | 2.00 | 20.0% | 30500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.0% | 148 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.3% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 5 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.1% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 7.9% | 10 |
| spinnercat.Omen 1.0 | 8.5 | 7.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.9 | 24 / 35 | 5037 |
| 2 | 1 | 69.3 | 86.3 | 21 / 35 | 4879 |
| 3 | 1 | 71.8 | 92.7 | 25 / 35 | 5455 |
| 4 | 1 | 71.0 | 91.1 | 30 / 35 | 4687 |
| 5 | 1 | 69.6 | 83.5 | 21 / 35 | 5284 |
| 6 | 1 | 70.6 | 91.7 | 27 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 84 | 90% |
| nz.jdc.nano.GridFu 1.0 | 26 | 96% |
| timmit.nano.TimDog 0.33 | 17 | 71% |
| stelo.PatternRobot 1.0 | 11 | 82% |
| ratosh.Wesco 1.4 | 10 | 90% |
| maribo.IotaCT 1.1 | 9 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 32% | 76 |
| stelo.PatternRobot 1.0 | 12 | 19% | 15 |
| timmit.nano.TimDog 0.33 | 10 | 16% | 29 |
| ratosh.Wesco 1.4 | 7 | 11% | 19 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 40 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| maribo.IotaCT 1.1 | 2 | 3% | 16 |
| spinnercat.Omen 1.0 | 2 | 3% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.3 | 175 / 210 | 1.60 | 21.9% | 39778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.9% | 175 |
| baal.nano.N 1.42 | 2.5 | 11.8% | 7 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.3% | 11 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.1% | 9 |
| sanja.First 0.1 | 6.7 | 8.3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.5% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 3 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.8% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 97.1 | 32 / 35 | 6963 |
| 2 | 1 | 71.8 | 93.7 | 28 / 35 | 6818 |
| 3 | 1 | 71.2 | 89.8 | 27 / 35 | 6298 |
| 4 | 1 | 71.9 | 92.4 | 30 / 35 | 6280 |
| 5 | 1 | 72.7 | 94.3 | 30 / 35 | 6785 |
| 6 | 1 | 71.7 | 92.4 | 28 / 35 | 6634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 94% |
| baal.nano.N 1.42 | 35 | 97% |
| cvt.Firsty 1.0 | 35 | 94% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| sanja.First 0.1 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 34% | 35 |
| tvv.nano.Polaris 1.2 | 8 | 21% | 67 |
| baal.nano.N 1.42 | 6 | 16% | 39 |
| Grystrion.TrackerWO 1.0 | 4 | 11% | 9 |
| cvt.Firsty 1.0 | 3 | 8% | 27 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |
| sanja.First 0.1 | 0 | 0% | 16 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.6 | 90 / 210 | 3.55 | 16.3% | 32206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 16.0% | 73 |
| hadur117.micro.SaorWAU 0.1 | 1.5 | 16.3% | 90 |
| cs.Wren 1.0 | 3.5 | 12.4% | 18 |
| mz.Cork 0.1 | 4.2 | 11.1% | 13 |
| js.PinBall 1.6 | 4.3 | 11.1% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 3 |
| evd.X1 0.01 | 7.2 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.3% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 65.7 | 13 / 35 | 4996 |
| 2 | 2 | 63.9 | 68.9 | 14 / 35 | 5170 |
| 3 | 2 | 64.3 | 69.5 | 13 / 35 | 5212 |
| 4 | 1 | 62.0 | 62.5 | 13 / 35 | 5485 |
| 5 | 1 | 67.7 | 79.7 | 18 / 35 | 6032 |
| 6 | 1 | 67.7 | 83.5 | 19 / 35 | 5311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 64% |
| cs.Wren 1.0 | 27 | 89% |
| js.PinBall 1.6 | 11 | 91% |
| mz.Cork 0.1 | 7 | 86% |
| jsal.Jsalbot 1.0 | 3 | 33% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 44% | 105 |
| joe.ADinosaur 1.0 | 16 | 13% | 19 |
| cs.Wren 1.0 | 13 | 11% | 30 |
| PSW.Relentless 0.1 | 11 | 9% | 11 |
| js.PinBall 1.6 | 10 | 8% | 16 |
| evd.X1 0.01 | 10 | 8% | 11 |
| mz.Cork 0.1 | 6 | 5% | 11 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.7 | 137 / 210 | 2.47 | 19.0% | 29552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.0% | 137 |
| ntc.Opposite 1.5 | 2.8 | 11.6% | 7 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.4% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.5% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.9% | 5 |
| DBall.NUKE 0.1 | 8.0 | 7.7% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 7 |
| pbg.R2D2 1.0 | 9.3 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 22 / 35 | 4877 |
| 2 | 1 | 64.9 | 73.7 | 15 / 35 | 4794 |
| 3 | 1 | 67.9 | 82.2 | 24 / 35 | 4876 |
| 4 | 1 | 68.5 | 83.5 | 24 / 35 | 4935 |
| 5 | 1 | 68.6 | 85.1 | 23 / 35 | 4893 |
| 6 | 1 | 71.0 | 93.3 | 29 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 34 | 85% |
| ntc.Opposite 1.5 | 31 | 90% |
| stelo.AreaTargetingBot 1.1 | 31 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| disan.Chair 2.2.0 | 13 | 92% |
| donjezza.Muncho 1.0 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| DBall.NUKE 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 24% | 40 |
| myl.nano.Graviton 1.10 | 14 | 19% | 41 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 14% | 30 |
| ntc.Opposite 1.5 | 9 | 12% | 28 |
| DBall.NUKE 0.1 | 4 | 5% | 7 |
| donjezza.Muncho 1.0 | 3 | 4% | 13 |
| disan.Chair 2.2.0 | 3 | 4% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.4 | 85 / 210 | 3.49 | 15.8% | 25432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.8% | 85 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 51 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.4% | 25 |
| yagami.Tidus 0.11 | 3.8 | 12.4% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 26 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 8 |
| step.nanoPri 1.0 | 7.5 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 68.3 | 14 / 35 | 4169 |
| 2 | 1 | 66.1 | 75.2 | 16 / 35 | 4514 |
| 3 | 1 | 65.1 | 74.3 | 13 / 35 | 4134 |
| 4 | 1 | 65.0 | 71.7 | 14 / 35 | 4325 |
| 5 | 1 | 66.4 | 75.9 | 16 / 35 | 4509 |
| 6 | 2 | 62.5 | 68.9 | 12 / 35 | 3781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 59% |
| yagami.Tidus 0.11 | 25 | 92% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 70% |
| kawigi.micro.Shiz 1.1 | 21 | 100% |
| ejb.Polaris 1.0.1 | 9 | 89% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 31% | 57 |
| yagami.Tidus 0.11 | 24 | 19% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 40 |
| ejb.Polaris 1.0.1 | 16 | 13% | 28 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 29 |
| kurios.DOSexe .9a | 6 | 5% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 142 / 210 | 2.50 | 18.3% | 28407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.3% | 142 |
| bzdp.Pansy 2.1 | 2.3 | 12.4% | 16 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 23 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 14 |
| ratosh.Nobo 0.21 | 4.8 | 10.4% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.4 | 23 / 35 | 4779 |
| 2 | 1 | 66.9 | 83.2 | 23 / 35 | 4610 |
| 3 | 1 | 68.3 | 85.1 | 25 / 35 | 4715 |
| 4 | 1 | 71.2 | 96.5 | 32 / 35 | 5219 |
| 5 | 1 | 63.9 | 72.4 | 16 / 35 | 4511 |
| 6 | 1 | 66.5 | 78.7 | 23 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 63 | 94% |
| wee.Gem 1.8.4 | 32 | 100% |
| wompi.Quokka 1.6 | 23 | 96% |
| m3thos.Eva00 1.1 | 13 | 85% |
| ratosh.Nobo 0.21 | 11 | 91% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 12 | 18% | 27 |
| m3thos.Eva00 1.1 | 11 | 16% | 22 |
| bzdp.Pansy 2.1 | 10 | 15% | 65 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 13% | 11 |
| maribo.FollowFire 1 | 8 | 12% | 9 |
| wee.Gem 1.8.4 | 6 | 9% | 46 |
| ratosh.Nobo 0.21 | 5 | 7% | 15 |
| bayen.UbaMicro 1.4 | 4 | 6% | 8 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 89.1 | 145 / 210 | 1.98 | 21.8% | 47533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.8% | 145 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 54 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 5 |
| exauge.GateKeeper 1.1.121g | 4.2 | 10.1% | 2 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 9.1% | 3 |
| stelo.PianistNano 1.2 | 6.8 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.2 | 93.7 | 24 / 35 | 8540 |
| 2 | 1 | 73.0 | 88.3 | 23 / 35 | 8002 |
| 3 | 1 | 71.3 | 79.7 | 23 / 35 | 7887 |
| 4 | 1 | 73.5 | 89.5 | 25 / 35 | 7781 |
| 5 | 1 | 73.5 | 88.6 | 26 / 35 | 7794 |
| 6 | 1 | 73.4 | 94.9 | 24 / 35 | 7529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 129 | 86% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| mz.NanoGod 2.02 | 12 | 83% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 54% | 147 |
| mz.NanoGod 2.02 | 16 | 25% | 29 |
| exauge.GateKeeper 1.1.121g | 6 | 9% | 11 |
| ayk.WallHugger 1.0 | 4 | 6% | 10 |
| stuff.Vlad 0.1 | 3 | 5% | 7 |
| stelo.PianistNano 1.2 | 1 | 2% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.8 | 103 / 210 | 3.36 | 16.8% | 29241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.8% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 28 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 22 |
| bvh.micro.Freya 0.3 | 3.7 | 11.6% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.5% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.7% | 5 |
| conscience.Electron 1.3g | 7.7 | 7.5% | 1 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 6.3% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 6.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.6 | 17 / 35 | 4890 |
| 2 | 1 | 67.6 | 80.6 | 22 / 35 | 5143 |
| 3 | 1 | 64.8 | 72.4 | 17 / 35 | 4750 |
| 4 | 1 | 65.7 | 75.9 | 19 / 35 | 5141 |
| 5 | 1 | 64.4 | 73.3 | 15 / 35 | 4791 |
| 6 | 1 | 61.8 | 64.8 | 13 / 35 | 4526 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 82% |
| bvh.micro.Freya 0.3 | 24 | 92% |
| dummy.micro.Sparrow 2.5 | 21 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 78% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 33 | 31% | 69 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 15% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 28 |
| bvh.micro.Freya 0.3 | 9 | 8% | 29 |
| conscience.Electron 1.3g | 9 | 8% | 10 |
| dl.BetterWalls 1.0 | 6 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 13 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 91.4 | 164 / 210 | 1.77 | 22.1% | 42267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 22.1% | 164 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 13 |
| sul.Lunar 1.1 | 3.7 | 11.5% | 9 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 9 |
| dsw.StaticD 1.0 | 5.0 | 9.6% | 10 |
| mme.NikeEnhanced 2.0 | 6.0 | 8.5% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.6% | 2 |
| sample.Corners 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.6 | 25 / 35 | 7135 |
| 2 | 1 | 72.7 | 90.5 | 28 / 35 | 7208 |
| 3 | 1 | 72.7 | 94.6 | 28 / 35 | 6831 |
| 4 | 1 | 73.2 | 92.7 | 29 / 35 | 7361 |
| 5 | 1 | 72.9 | 93.7 | 31 / 35 | 6653 |
| 6 | 1 | 72.1 | 88.6 | 23 / 35 | 7079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 62 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 93% |
| supersample.SuperBoxBot 1.0 | 30 | 97% |
| dsw.StaticD 1.0 | 22 | 64% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 16 | 34% | 33 |
| supersample.SuperBoxBot 1.0 | 14 | 30% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 23% | 54 |
| sul.Lunar 1.1 | 3 | 6% | 69 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 83.5 | 116 / 210 | 2.48 | 19.1% | 38364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.1% | 116 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 22 |
| mld.Wisdom 1.0 | 3.2 | 12.3% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.0% | 23 |
| amz.NanoClone 1.41 | 4.8 | 11.0% | 12 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.4% | 5 |
| GarmBox.Oranges 1.0 | 7.5 | 7.2% | 1 |
| sample.Walls 1.0 | 7.7 | 7.2% | 5 |
| jangs.ns51 1.0 | 8.8 | 5.8% | 3 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 25 / 35 | 6583 |
| 2 | 1 | 68.4 | 85.1 | 14 / 35 | 6128 |
| 3 | 1 | 68.4 | 81.3 | 19 / 35 | 6205 |
| 4 | 1 | 67.4 | 78.1 | 17 / 35 | 6171 |
| 5 | 1 | 69.8 | 84.1 | 21 / 35 | 7164 |
| 6 | 1 | 68.8 | 85.1 | 20 / 35 | 6113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 86% |
| radnor.DoctorBob 1.42 | 33 | 79% |
| mld.Wisdom 1.0 | 27 | 63% |
| amz.NanoClone 1.41 | 17 | 76% |
| jangs.ns51 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 31% | 46 |
| radnor.DoctorBob 1.42 | 22 | 23% | 57 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 19% | 48 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 20 |
| amz.NanoClone 1.41 | 10 | 11% | 23 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 5 |

