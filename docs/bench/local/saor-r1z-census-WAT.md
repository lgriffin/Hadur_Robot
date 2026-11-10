# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.7 | 155 / 210 | 1.93 | 21.6% | 42329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.6% | 155 |
| mz.AntiGrav 1.0 | 2.2 | 14.4% | 18 |
| radnor.DoctorBob 1.42 | 3.0 | 14.1% | 16 |
| mld.Infinity 2.2 | 4.0 | 12.7% | 18 |
| amz.NanoClone 1.41 | 4.8 | 10.1% | 1 |
| sample.Walls 1.0 | 6.7 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.7% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 91.4 | 27 / 35 | 6953 |
| 2 | 1 | 72.1 | 87.0 | 24 / 35 | 6990 |
| 3 | 1 | 72.2 | 89.5 | 24 / 35 | 7084 |
| 4 | 1 | 73.6 | 93.0 | 26 / 35 | 7710 |
| 5 | 1 | 72.5 | 90.2 | 28 / 35 | 6858 |
| 6 | 1 | 71.9 | 87.0 | 26 / 35 | 6734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 83 | 92% |
| mld.Infinity 2.2 | 36 | 92% |
| radnor.DoctorBob 1.42 | 30 | 93% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 38% | 57 |
| mz.AntiGrav 1.0 | 16 | 29% | 84 |
| mld.Infinity 2.2 | 8 | 15% | 39 |
| amz.NanoClone 1.41 | 6 | 11% | 14 |
| sample.Walls 1.0 | 2 | 4% | 7 |
| jangs.ns51 1.0 | 2 | 4% | 5 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.4 | 137 / 210 | 2.04 | 19.2% | 31978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 19.2% | 137 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 39 |
| mld.DustBunny 3.8 | 3.5 | 13.0% | 20 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.6% | 3 |
| zyx.nano.Ant 1.1 | 6.0 | 8.2% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.4% | 6 |
| bzdp.BoxCar 2.0 | 8.2 | 6.8% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 23 / 35 | 5234 |
| 2 | 1 | 68.0 | 88.9 | 21 / 35 | 4979 |
| 3 | 1 | 69.2 | 86.7 | 25 / 35 | 5719 |
| 4 | 1 | 71.1 | 94.9 | 25 / 35 | 5564 |
| 5 | 1 | 69.6 | 90.2 | 23 / 35 | 5285 |
| 6 | 1 | 67.5 | 81.6 | 20 / 35 | 5197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 77% |
| mld.DustBunny 3.8 | 60 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 88% |
| maribo.melee.BMV 0.1 | 11 | 100% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 33% | 89 |
| mld.DustBunny 3.8 | 23 | 32% | 60 |
| zyx.nano.Ant 1.1 | 8 | 11% | 12 |
| maribo.melee.BMV 0.1 | 6 | 8% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 17 |
| fullsail.SweetTea 1.1 | 5 | 7% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.3 | 137 / 210 | 2.32 | 20.3% | 37690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.3% | 137 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.2% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.1% | 21 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 6 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.3% | 3 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.4 | 19 / 35 | 5971 |
| 2 | 1 | 71.3 | 87.6 | 24 / 35 | 6321 |
| 3 | 1 | 70.4 | 86.0 | 24 / 35 | 6410 |
| 4 | 1 | 71.0 | 87.0 | 24 / 35 | 6326 |
| 5 | 1 | 71.8 | 89.2 | 24 / 35 | 6520 |
| 6 | 1 | 69.8 | 82.5 | 22 / 35 | 6142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 64 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 78% |
| myl.nano.KomoriNinja 1.1 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 9 | 78% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 28% | 46 |
| myl.micro.Troodon 1.10 | 12 | 16% | 69 |
| fm.mammillarias 1.3 | 11 | 15% | 17 |
| myl.nano.KomoriNinja 1.1 | 9 | 12% | 32 |
| cb.nano.Insomnia 1.0 | 9 | 12% | 14 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 11 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 12 |
| sample.Fire 1.0 | 1 | 1% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.3 | 160 / 210 | 2.14 | 20.9% | 39219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.9% | 160 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.5% | 13 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.2% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 9.2% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.9% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 6 |
| yk.JahMicro 1.0 | 7.5 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.6 | 26 / 35 | 6188 |
| 2 | 1 | 72.0 | 91.1 | 28 / 35 | 6956 |
| 3 | 1 | 69.1 | 83.5 | 24 / 35 | 5779 |
| 4 | 1 | 70.7 | 86.3 | 26 / 35 | 6507 |
| 5 | 1 | 71.9 | 88.6 | 28 / 35 | 6905 |
| 6 | 1 | 72.0 | 92.7 | 28 / 35 | 6884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 95% |
| stelo.SoJNanoMelee 1.1 | 32 | 100% |
| tvv.micro.Antares 1.1.1 | 22 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 84% |
| yk.JahMicro 1.0 | 12 | 92% |
| tj.zombie1n 1.0.1 | 10 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 52% | 89 |
| tvv.micro.Antares 1.1.1 | 8 | 16% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 8% | 22 |
| yk.JahMicro 1.0 | 4 | 8% | 13 |
| tj.zombie1n 1.0.1 | 4 | 8% | 12 |
| stelo.SoJNanoMelee 1.1 | 3 | 6% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.2 | 97 / 210 | 3.69 | 16.2% | 29016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.2% | 97 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 26 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 36 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.8% | 22 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.6% | 5 |
| EBBU.Sim2 1.02 | 6.7 | 9.4% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.7 | 17 / 35 | 4677 |
| 2 | 1 | 63.8 | 72.4 | 16 / 35 | 4409 |
| 3 | 1 | 64.3 | 68.6 | 19 / 35 | 5064 |
| 4 | 1 | 64.9 | 73.0 | 16 / 35 | 5104 |
| 5 | 1 | 66.7 | 77.5 | 19 / 35 | 5156 |
| 6 | 1 | 59.8 | 57.8 | 10 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 100% |
| oog.melee.Corsair 1.0 | 25 | 80% |
| ahf.NanoAndrew .4 | 21 | 67% |
| robar.nano.Assertive_Melee 0.2 | 14 | 100% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 362. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 27 | 24% | 38 |
| simonton.nano.MeleeSeed 1.8 | 21 | 19% | 48 |
| ahf.NanoAndrew .4 | 13 | 12% | 33 |
| oog.melee.Corsair 1.0 | 12 | 11% | 32 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 10% | 13 |
| zyx.nano.BacillusComma 1.0 | 11 | 10% | 12 |
| EBBU.Sim2 1.02 | 10 | 9% | 18 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |
| sam.Samspin 1.0 | 3 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.5 | 126 / 210 | 2.67 | 18.3% | 31074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.3% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 34 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.0% | 11 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 8 |
| fm.claire 1.7 | 6.3 | 8.6% | 3 |
| sample.SpinBot 1.0 | 8.7 | 6.2% | 2 |
| pa.Improved 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 76.8 | 19 / 35 | 4765 |
| 2 | 1 | 68.0 | 84.4 | 21 / 35 | 5186 |
| 3 | 1 | 68.8 | 87.0 | 22 / 35 | 5148 |
| 4 | 1 | 65.2 | 73.0 | 18 / 35 | 4920 |
| 5 | 1 | 67.8 | 81.3 | 20 / 35 | 5388 |
| 6 | 1 | 69.7 | 86.3 | 26 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 88% |
| gh.nano.Grofvuil 0.2 | 20 | 80% |
| oog.melee.CapuletDroid 1.1 | 18 | 100% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| fm.claire 1.7 | 7 | 71% |
| pa.Improved 1.0 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 26% | 82 |
| arthord.NanoSatanMelee Beta | 16 | 19% | 26 |
| gh.nano.Grofvuil 0.2 | 14 | 17% | 33 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 29 |
| winamp32.micro.MicroMacro 1.0 | 9 | 11% | 16 |
| fm.claire 1.7 | 6 | 7% | 9 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 3 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.7 | 108 / 210 | 2.47 | 18.7% | 34870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 18.7% | 108 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 35 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 21 |
| mz.MicroGodMelee 1 | 3.7 | 13.2% | 36 |
| DBall.Anarchy 0.1 | 5.0 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.4% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.4% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 21 / 35 | 6067 |
| 2 | 1 | 68.9 | 82.5 | 21 / 35 | 5943 |
| 3 | 1 | 68.1 | 82.5 | 16 / 35 | 5563 |
| 4 | 1 | 69.0 | 86.3 | 17 / 35 | 6268 |
| 5 | 1 | 69.2 | 83.8 | 22 / 35 | 5829 |
| 6 | 2 | 65.4 | 75.6 | 11 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 87% |
| mz.MicroGodMelee 1 | 36 | 64% |
| gh.micro.Gruweltje 0.7 | 33 | 70% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |

Hadur died in 102 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 35% | 57 |
| gh.micro.Gruweltje 0.7 | 26 | 25% | 57 |
| spinnercat.micro.Tyger 0.1 | 20 | 20% | 60 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 11 |
| fire219.CatBot 1.0 | 6 | 6% | 6 |
| el.JumpShoot 0.2 | 5 | 5% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |
| acogdev.alpha 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.3 | 116 / 210 | 3.13 | 17.4% | 30871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 17.4% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.1% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 24 |
| germ.TheMind .2 | 5.0 | 9.6% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 5 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 4 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.0% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.5% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.0 | 21 / 35 | 4940 |
| 2 | 1 | 65.9 | 77.1 | 17 / 35 | 4992 |
| 3 | 1 | 64.9 | 71.1 | 18 / 35 | 5248 |
| 4 | 1 | 66.2 | 78.4 | 18 / 35 | 4762 |
| 5 | 1 | 68.2 | 80.6 | 21 / 35 | 5740 |
| 6 | 1 | 66.1 | 71.7 | 21 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| germ.TheMind .2 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 41% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 22% | 35 |
| germ.TheMind .2 | 9 | 9% | 20 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 10 |
| awesomeness.Elite 1.0 | 3 | 3% | 10 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.4 | 157 / 210 | 1.86 | 20.5% | 31622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.5% | 157 |
| rz.HawkOnFire 0.1 | 2.2 | 14.3% | 20 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 8 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 7 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 1 |
| ratosh.Wesco 1.4 | 7.3 | 8.0% | 6 |
| stelo.PatternRobot 1.0 | 7.5 | 7.6% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 26 / 35 | 5332 |
| 2 | 1 | 71.1 | 89.5 | 27 / 35 | 5384 |
| 3 | 1 | 70.5 | 87.6 | 23 / 35 | 5400 |
| 4 | 1 | 71.4 | 91.4 | 28 / 35 | 5317 |
| 5 | 1 | 70.8 | 91.1 | 26 / 35 | 5200 |
| 6 | 1 | 71.0 | 91.7 | 27 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 91% |
| nz.jdc.nano.GridFu 1.0 | 33 | 94% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| maribo.IotaCT 1.1 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| ratosh.Wesco 1.4 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 25% | 70 |
| timmit.nano.TimDog 0.33 | 10 | 19% | 29 |
| ratosh.Wesco 1.4 | 9 | 17% | 17 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 46 |
| stelo.PatternRobot 1.0 | 7 | 13% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 5 |
| maribo.IotaCT 1.1 | 2 | 4% | 15 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.4 | 164 / 210 | 1.86 | 21.1% | 38137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.1% | 164 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 6 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.0% | 12 |
| zyx.micro.Ant 1.1 | 4.2 | 9.9% | 13 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 4 |
| sanja.First 0.1 | 6.0 | 8.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.7% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 7 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.6 | 27 / 35 | 6319 |
| 2 | 1 | 70.9 | 92.7 | 25 / 35 | 6519 |
| 3 | 1 | 71.9 | 90.8 | 29 / 35 | 6982 |
| 4 | 1 | 71.2 | 89.8 | 28 / 35 | 6201 |
| 5 | 1 | 71.2 | 91.4 | 29 / 35 | 6223 |
| 6 | 1 | 70.2 | 89.2 | 26 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 100% |
| baal.nano.N 1.42 | 41 | 95% |
| cvt.Firsty 1.0 | 23 | 100% |
| sanja.First 0.1 | 22 | 100% |
| zyx.micro.Ant 1.1 | 19 | 63% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 30% | 33 |
| baal.nano.N 1.42 | 9 | 20% | 38 |
| tvv.nano.Polaris 1.2 | 8 | 17% | 56 |
| cvt.Firsty 1.0 | 5 | 11% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 20 |
| sample.RamFire 1.0 | 3 | 7% | 4 |
| sanja.First 0.1 | 2 | 4% | 23 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 9 |

## Melee bench: F11

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.8 | 101 / 210 | 3.45 | 16.6% | 32772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.2 | 16.6% | 101 |
| kc.micro.Figment 1.0 | 2.0 | 14.5% | 49 |
| cs.Wren 1.0 | 3.2 | 12.4% | 23 |
| js.PinBall 1.6 | 4.2 | 11.6% | 14 |
| mz.Cork 0.1 | 4.5 | 11.1% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 1 |
| evd.X1 0.01 | 7.0 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.6% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 70.8 | 13 / 35 | 5630 |
| 2 | 1 | 65.3 | 75.6 | 15 / 35 | 5463 |
| 3 | 1 | 65.5 | 74.3 | 17 / 35 | 5450 |
| 4 | 2 | 61.2 | 63.5 | 13 / 35 | 4945 |
| 5 | 1 | 66.6 | 75.6 | 22 / 35 | 5508 |
| 6 | 1 | 67.1 | 77.1 | 21 / 35 | 5776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 59 | 76% |
| cs.Wren 1.0 | 22 | 82% |
| mz.Cork 0.1 | 17 | 88% |
| js.PinBall 1.6 | 14 | 71% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 42% | 97 |
| cs.Wren 1.0 | 15 | 14% | 29 |
| mz.Cork 0.1 | 11 | 10% | 25 |
| evd.X1 0.01 | 11 | 10% | 12 |
| js.PinBall 1.6 | 10 | 9% | 19 |
| PSW.Relentless 0.1 | 7 | 6% | 8 |
| joe.ADinosaur 1.0 | 6 | 6% | 9 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.5 | 131 / 210 | 2.57 | 18.7% | 28911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.7% | 131 |
| ntc.Opposite 1.5 | 3.0 | 11.9% | 10 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.8% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.6% | 13 |
| DBall.NUKE 0.1 | 7.8 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 8.7 | 6.3% | 10 |
| pbg.R2D2 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 22 / 35 | 5061 |
| 2 | 1 | 68.8 | 84.4 | 23 / 35 | 4958 |
| 3 | 1 | 64.3 | 71.1 | 17 / 35 | 4475 |
| 4 | 1 | 69.4 | 87.3 | 24 / 35 | 5130 |
| 5 | 1 | 67.8 | 82.5 | 22 / 35 | 4684 |
| 6 | 1 | 68.0 | 85.1 | 23 / 35 | 4603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 93% |
| ntc.Opposite 1.5 | 31 | 87% |
| stelo.AreaTargetingBot 1.1 | 29 | 86% |
| disan.Chair 2.2.0 | 14 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| DBall.NUKE 0.1 | 6 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 81 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 20% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 16% | 24 |
| ntc.Opposite 1.5 | 12 | 15% | 31 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 24 |
| disan.Chair 2.2.0 | 8 | 10% | 19 |
| myl.nano.Graviton 1.10 | 7 | 9% | 41 |
| DBall.NUKE 0.1 | 5 | 6% | 10 |
| donjezza.Muncho 1.0 | 5 | 6% | 10 |
| pbg.R2D2 1.0 | 4 | 5% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.2 | 83 / 210 | 3.41 | 16.0% | 26643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.5 | 16.0% | 83 |
| oog.melee.Capulet 1.2 | 2.0 | 14.3% | 45 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.2% | 22 |
| yagami.Tidus 0.11 | 4.5 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 79.4 | 17 / 35 | 4931 |
| 2 | 1 | 63.7 | 70.2 | 11 / 35 | 4043 |
| 3 | 3 | 62.3 | 63.2 | 11 / 35 | 4178 |
| 4 | 1 | 64.8 | 72.1 | 14 / 35 | 4538 |
| 5 | 1 | 68.7 | 86.3 | 18 / 35 | 4879 |
| 6 | 2 | 62.9 | 68.3 | 12 / 35 | 4074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| yagami.Tidus 0.11 | 28 | 82% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| oog.melee.Capulet 1.2 | 23 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| ejb.Polaris 1.0.1 | 8 | 63% |

Hadur died in 127 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 37% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 18% | 46 |
| yagami.Tidus 0.11 | 18 | 14% | 38 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 32 |
| ejb.Polaris 1.0.1 | 9 | 7% | 17 |
| kurios.DOSexe .9a | 9 | 7% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 76.5 | 118 / 210 | 3.12 | 16.8% | 26267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.8% | 118 |
| bzdp.Pansy 2.1 | 2.3 | 12.9% | 27 |
| wompi.Quokka 1.6 | 3.3 | 12.0% | 24 |
| wee.Gem 1.8.4 | 4.0 | 11.4% | 20 |
| ratosh.Nobo 0.21 | 4.3 | 11.0% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.0 | 25 / 35 | 4736 |
| 2 | 1 | 64.0 | 74.0 | 16 / 35 | 4355 |
| 3 | 1 | 65.8 | 76.5 | 21 / 35 | 4222 |
| 4 | 1 | 65.7 | 76.8 | 19 / 35 | 4495 |
| 5 | 1 | 65.6 | 78.1 | 22 / 35 | 4260 |
| 6 | 1 | 63.5 | 73.3 | 15 / 35 | 4199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 89% |
| wee.Gem 1.8.4 | 30 | 93% |
| ratosh.Nobo 0.21 | 19 | 89% |
| wompi.Quokka 1.6 | 14 | 86% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 20 | 21% | 57 |
| wee.Gem 1.8.4 | 13 | 14% | 47 |
| bayen.UbaMicro 1.4 | 12 | 13% | 17 |
| ratosh.Nobo 0.21 | 11 | 12% | 29 |
| wompi.Quokka 1.6 | 11 | 12% | 22 |
| m3thos.Eva00 1.1 | 9 | 10% | 13 |
| maribo.FollowFire 1 | 9 | 10% | 9 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 89.9 | 138 / 210 | 1.90 | 21.8% | 47430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 21.8% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 54 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 13 |
| ayk.WallHugger 1.0 | 4.8 | 9.3% | 3 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.6% | 1 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.8 | 22 / 35 | 7557 |
| 2 | 1 | 74.1 | 92.7 | 26 / 35 | 8143 |
| 3 | 1 | 73.4 | 91.1 | 25 / 35 | 8012 |
| 4 | 1 | 73.6 | 89.8 | 22 / 35 | 8168 |
| 5 | 1 | 71.7 | 84.4 | 20 / 35 | 7321 |
| 6 | 1 | 73.5 | 91.7 | 23 / 35 | 8229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 136 | 78% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| mz.NanoGod 2.02 | 8 | 75% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 50% | 150 |
| mz.NanoGod 2.02 | 14 | 19% | 22 |
| exauge.GateKeeper 1.1.121g | 10 | 14% | 14 |
| stelo.PianistNano 1.2 | 5 | 7% | 7 |
| ayk.WallHugger 1.0 | 4 | 6% | 7 |
| stuff.Vlad 0.1 | 3 | 4% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.0 | 107 / 210 | 3.43 | 16.7% | 28778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 16.7% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 33 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 22 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.1% | 14 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 3 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.0 | 23 / 35 | 5046 |
| 2 | 1 | 60.1 | 58.7 | 12 / 35 | 4486 |
| 3 | 1 | 68.0 | 85.1 | 23 / 35 | 4953 |
| 4 | 1 | 62.8 | 67.6 | 14 / 35 | 4680 |
| 5 | 1 | 63.0 | 67.3 | 16 / 35 | 4430 |
| 6 | 1 | 66.8 | 79.0 | 19 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 85% |
| dummy.micro.Sparrow 2.5 | 26 | 92% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 82% |
| stelo.MirrorMicro 1.0 | 9 | 78% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 4 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 56 |
| dummy.micro.Sparrow 2.5 | 17 | 17% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 28 |
| conscience.Electron 1.3g | 11 | 11% | 17 |
| bvh.micro.Freya 0.3 | 10 | 10% | 24 |
| dl.BetterWalls 1.0 | 9 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 15 |

## Melee bench: F17

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 83.5 | 138 / 210 | 2.48 | 20.7% | 41834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 20.7% | 138 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.6% | 20 |
| sul.Lunar 1.1 | 3.0 | 11.9% | 15 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.8% | 6 |
| dsw.StaticD 1.0 | 6.2 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 7.0% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 3 |
| sample.Corners 1.0 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.4 | 23 / 35 | 7069 |
| 2 | 1 | 69.3 | 78.7 | 18 / 35 | 6885 |
| 3 | 1 | 69.4 | 78.7 | 19 / 35 | 6998 |
| 4 | 1 | 72.3 | 89.5 | 30 / 35 | 6949 |
| 5 | 1 | 70.2 | 82.2 | 25 / 35 | 6509 |
| 6 | 1 | 72.0 | 86.7 | 23 / 35 | 7424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 55 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 75% |
| supersample.SuperBoxBot 1.0 | 21 | 81% |
| dsw.StaticD 1.0 | 12 | 67% |
| mme.NikeEnhanced 2.0 | 11 | 82% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 26% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 22% | 43 |
| dsw.StaticD 1.0 | 13 | 18% | 25 |
| mme.NikeEnhanced 2.0 | 8 | 11% | 13 |
| sul.Lunar 1.1 | 6 | 8% | 59 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 10 |
| sample.Corners 1.0 | 4 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |

## Melee bench: F18

hadur117.micro.SaorWAT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.6 | 116 / 210 | 2.75 | 18.5% | 36377 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAT 0.1 | 1.0 | 18.5% | 116 |
| radnor.DoctorBob 1.42 | 2.7 | 12.9% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.6% | 33 |
| mld.Wisdom 1.0 | 3.5 | 11.7% | 16 |
| amz.NanoClone 1.41 | 5.2 | 10.3% | 10 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 4 |
| sample.Walls 1.0 | 7.5 | 7.4% | 3 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.3 | 6.1% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 19 / 35 | 6807 |
| 2 | 1 | 68.5 | 78.7 | 22 / 35 | 6488 |
| 3 | 1 | 68.6 | 86.3 | 20 / 35 | 5934 |
| 4 | 1 | 67.0 | 77.1 | 18 / 35 | 5556 |
| 5 | 1 | 66.8 | 76.2 | 20 / 35 | 5451 |
| 6 | 1 | 67.2 | 76.2 | 17 / 35 | 6141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 86% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| mld.Wisdom 1.0 | 19 | 68% |
| amz.NanoClone 1.41 | 12 | 67% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 31% | 42 |
| radnor.DoctorBob 1.42 | 22 | 23% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 22% | 65 |
| KiraNL.Chupacabra 0.4 | 9 | 10% | 15 |
| amz.NanoClone 1.41 | 9 | 10% | 14 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |

