# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 88.3 | 150 / 210 | 2.06 | 21.2% | 41592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.2% | 150 |
| mz.AntiGrav 1.0 | 2.8 | 14.0% | 14 |
| mld.Infinity 2.2 | 2.8 | 13.9% | 24 |
| radnor.DoctorBob 1.42 | 3.3 | 13.7% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| sample.Walls 1.0 | 6.5 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 91.4 | 26 / 35 | 7175 |
| 2 | 1 | 71.9 | 85.7 | 24 / 35 | 6947 |
| 3 | 1 | 71.1 | 85.7 | 24 / 35 | 6576 |
| 4 | 1 | 71.7 | 88.3 | 25 / 35 | 6809 |
| 5 | 1 | 72.6 | 91.1 | 27 / 35 | 7069 |
| 6 | 1 | 72.1 | 87.3 | 24 / 35 | 7016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 97% |
| mld.Infinity 2.2 | 39 | 97% |
| radnor.DoctorBob 1.42 | 35 | 86% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 43% | 63 |
| mz.AntiGrav 1.0 | 18 | 30% | 78 |
| amz.NanoClone 1.41 | 6 | 10% | 11 |
| mld.Infinity 2.2 | 5 | 8% | 40 |
| sample.Walls 1.0 | 3 | 5% | 7 |
| arthord.MannyPacquiao Beta | 2 | 3% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.4 | 105 / 210 | 2.85 | 17.5% | 30869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.5% | 105 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.3% | 67 |
| mld.DustBunny 3.8 | 3.3 | 13.4% | 14 |
| maribo.melee.BMV 0.1 | 4.5 | 10.1% | 4 |
| zyx.nano.Ant 1.1 | 5.3 | 9.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.4% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.8% | 9 |
| bzdp.BoxCar 2.0 | 8.0 | 6.5% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 20 / 35 | 5251 |
| 2 | 1 | 66.7 | 81.0 | 20 / 35 | 5023 |
| 3 | 1 | 68.0 | 84.1 | 20 / 35 | 5201 |
| 4 | 1 | 64.9 | 77.5 | 14 / 35 | 4766 |
| 5 | 1 | 67.2 | 79.7 | 21 / 35 | 5214 |
| 6 | 1 | 64.6 | 68.3 | 10 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 59 | 66% |
| mld.DustBunny 3.8 | 48 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 33% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 43 | 41% | 88 |
| mld.DustBunny 3.8 | 18 | 17% | 59 |
| maribo.melee.BMV 0.1 | 9 | 8% | 13 |
| bzdp.BoxCar 2.0 | 9 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 13 |
| zyx.nano.Ant 1.1 | 7 | 7% | 9 |
| cs.Grudge 1.0 | 6 | 6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 7 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 84.0 | 133 / 210 | 2.44 | 19.9% | 36711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.9% | 133 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 20 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 1 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.3% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.6% | 1 |
| sample.Fire 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 79.4 | 18 / 35 | 5623 |
| 2 | 1 | 71.4 | 89.2 | 23 / 35 | 6595 |
| 3 | 1 | 70.9 | 86.3 | 24 / 35 | 6196 |
| 4 | 1 | 68.3 | 77.8 | 20 / 35 | 5882 |
| 5 | 1 | 69.7 | 84.4 | 23 / 35 | 5951 |
| 6 | 1 | 71.2 | 87.0 | 25 / 35 | 6464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 82% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| myl.nano.KomoriNinja 1.1 | 14 | 86% |
| fm.mammillarias 1.3 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 29% | 43 |
| myl.micro.Troodon 1.10 | 18 | 23% | 76 |
| fm.mammillarias 1.3 | 10 | 13% | 20 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 11 |
| sp.Nanos.Ember 1.1 | 7 | 9% | 16 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 35 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 4 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 85.3 | 145 / 210 | 2.32 | 20.0% | 37231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.0% | 145 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.4% | 15 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.4% | 7 |
| yk.JahMicro 1.0 | 7.0 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 6.7% | 3 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 84.1 | 24 / 35 | 6902 |
| 2 | 1 | 69.3 | 83.8 | 23 / 35 | 5947 |
| 3 | 1 | 67.6 | 77.8 | 23 / 35 | 5419 |
| 4 | 1 | 71.4 | 92.4 | 27 / 35 | 6437 |
| 5 | 1 | 69.3 | 84.1 | 21 / 35 | 6147 |
| 6 | 1 | 70.9 | 89.5 | 27 / 35 | 6379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 87% |
| stelo.SoJNanoMelee 1.1 | 36 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 76% |
| tvv.micro.Antares 1.1.1 | 21 | 90% |
| tj.zombie1n 1.0.1 | 10 | 90% |
| yk.JahMicro 1.0 | 3 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 42% | 86 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 12% | 21 |
| tj.zombie1n 1.0.1 | 8 | 12% | 12 |
| stelo.SoJNanoMelee 1.1 | 6 | 9% | 30 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.4 | 87 / 210 | 3.57 | 16.4% | 29960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.4% | 87 |
| oog.melee.Corsair 1.0 | 2.2 | 13.2% | 48 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 25 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 26 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 5 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.6% | 4 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.1 | 15 / 35 | 4800 |
| 2 | 1 | 65.3 | 73.7 | 17 / 35 | 5016 |
| 3 | 1 | 66.0 | 76.5 | 15 / 35 | 5118 |
| 4 | 1 | 63.4 | 67.3 | 13 / 35 | 5159 |
| 5 | 1 | 62.6 | 65.7 | 13 / 35 | 4937 |
| 6 | 1 | 64.8 | 74.3 | 14 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 45% |
| simonton.nano.MeleeSeed 1.8 | 28 | 79% |
| ahf.NanoAndrew .4 | 27 | 89% |
| sam.Samspin 1.0 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| EBBU.Sim2 1.02 | 4 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 25% | 52 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 39 |
| ahf.NanoAndrew .4 | 18 | 15% | 41 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 14 |
| EBBU.Sim2 1.02 | 10 | 8% | 13 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 17 |
| sam.Samspin 1.0 | 5 | 4% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.5 | 132 / 210 | 2.40 | 19.1% | 32950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.1% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.7% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.0% | 12 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.4% | 8 |
| fm.claire 1.7 | 6.8 | 8.1% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.6% | 0 |
| pa.Improved 1.0 | 8.8 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 20 / 35 | 5452 |
| 2 | 1 | 68.1 | 79.4 | 21 / 35 | 5518 |
| 3 | 1 | 68.6 | 86.7 | 22 / 35 | 5197 |
| 4 | 1 | 69.5 | 90.2 | 23 / 35 | 5438 |
| 5 | 1 | 68.9 | 84.1 | 22 / 35 | 5474 |
| 6 | 1 | 69.6 | 85.1 | 24 / 35 | 5871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 87% |
| oog.melee.CapuletDroid 1.1 | 28 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 100% |
| arthord.NanoSatanMelee Beta | 8 | 100% |
| fm.claire 1.7 | 7 | 86% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 42% | 87 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 41 |
| gh.nano.Grofvuil 0.2 | 10 | 13% | 34 |
| winamp32.micro.MicroMacro 1.0 | 10 | 13% | 18 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 11 |
| fm.claire 1.7 | 4 | 5% | 7 |
| kurios.DOSexe .9b | 4 | 5% | 6 |
| sample.SpinBot 1.0 | 4 | 5% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.6 | 121 / 210 | 2.48 | 18.8% | 34429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.8% | 121 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.3% | 21 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.5% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 13.4% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.0% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.6% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.6% | 3 |
| fire219.CatBot 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 24 / 35 | 6181 |
| 2 | 1 | 69.3 | 86.7 | 22 / 35 | 5647 |
| 3 | 1 | 66.6 | 76.5 | 20 / 35 | 5110 |
| 4 | 1 | 68.9 | 83.2 | 18 / 35 | 5756 |
| 5 | 1 | 69.7 | 85.7 | 20 / 35 | 6082 |
| 6 | 1 | 67.7 | 80.6 | 17 / 35 | 5653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 89% |
| mz.MicroGodMelee 1 | 47 | 79% |
| gh.micro.Gruweltje 0.7 | 22 | 86% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 33% | 64 |
| spinnercat.micro.Tyger 0.1 | 26 | 29% | 68 |
| gh.micro.Gruweltje 0.7 | 15 | 17% | 45 |
| acogdev.alpha 0.2 | 7 | 8% | 9 |
| caimano.Furia_Ceca 0.22 | 7 | 8% | 9 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 5 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.3 | 119 / 210 | 3.13 | 17.4% | 30878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.4% | 119 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.1% | 20 |
| germ.TheMind .2 | 4.7 | 9.5% | 8 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.8% | 3 |
| awesomeness.Elite 1.0 | 7.2 | 8.4% | 11 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.3% | 2 |
| sample.Crazy 1.0 | 8.5 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.1 | 20 / 35 | 5426 |
| 2 | 1 | 63.3 | 66.3 | 18 / 35 | 4664 |
| 3 | 1 | 70.0 | 85.4 | 24 / 35 | 6197 |
| 4 | 1 | 66.1 | 75.9 | 20 / 35 | 4872 |
| 5 | 1 | 65.0 | 73.0 | 18 / 35 | 4998 |
| 6 | 1 | 66.4 | 80.0 | 19 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 90% |
| germ.TheMind .2 | 13 | 92% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 8 | 88% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 48% | 103 |
| germ.TheMind .2 | 15 | 16% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 12% | 34 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 7 |
| awesomeness.Elite 1.0 | 4 | 4% | 13 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.0 | 152 / 210 | 1.99 | 20.1% | 31020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.1% | 152 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 15 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.4% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 5 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 9.0% | 0 |
| spinnercat.Omen 1.0 | 7.0 | 8.2% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.4% | 5 |
| ratosh.Wesco 1.4 | 8.2 | 7.9% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 23 / 35 | 4988 |
| 2 | 1 | 70.5 | 86.3 | 24 / 35 | 5295 |
| 3 | 1 | 70.8 | 91.7 | 27 / 35 | 5171 |
| 4 | 1 | 69.3 | 84.8 | 24 / 35 | 5060 |
| 5 | 1 | 71.3 | 92.7 | 28 / 35 | 5066 |
| 6 | 1 | 71.5 | 92.4 | 26 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 81 | 95% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| stelo.PatternRobot 1.0 | 18 | 78% |
| timmit.nano.TimDog 0.33 | 13 | 69% |
| ratosh.Wesco 1.4 | 6 | 50% |
| maribo.IotaCT 1.1 | 5 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 15 | 26% | 27 |
| rz.HawkOnFire 0.1 | 13 | 22% | 69 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 56 |
| ratosh.Wesco 1.4 | 8 | 14% | 16 |
| stelo.PatternRobot 1.0 | 5 | 9% | 14 |
| maribo.IotaCT 1.1 | 5 | 9% | 13 |
| spinnercat.Omen 1.0 | 3 | 5% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 7 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.1 | 180 / 210 | 1.62 | 21.8% | 39021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.8% | 180 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 13 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 6 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 3 |
| zyx.micro.Ant 1.1 | 4.7 | 9.6% | 4 |
| sanja.First 0.1 | 6.5 | 8.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.9% | 0 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.5 | 31 / 35 | 6651 |
| 2 | 1 | 72.8 | 96.2 | 30 / 35 | 6926 |
| 3 | 1 | 71.7 | 92.7 | 30 / 35 | 6222 |
| 4 | 1 | 71.5 | 90.8 | 29 / 35 | 6694 |
| 5 | 1 | 71.3 | 90.5 | 28 / 35 | 6466 |
| 6 | 1 | 71.4 | 92.1 | 32 / 35 | 6062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 89% |
| baal.nano.N 1.42 | 45 | 100% |
| cvt.Firsty 1.0 | 28 | 93% |
| zyx.micro.Ant 1.1 | 24 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| sanja.First 0.1 | 13 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 23% | 36 |
| tvv.nano.Polaris 1.2 | 6 | 20% | 61 |
| baal.nano.N 1.42 | 4 | 13% | 37 |
| Grystrion.TrackerWO 1.0 | 4 | 13% | 17 |
| cvt.Firsty 1.0 | 3 | 10% | 22 |
| squidM.TentalceMeleeNano 1.1 | 3 | 10% | 7 |
| sanja.First 0.1 | 1 | 3% | 23 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.2 | 86 / 210 | 3.69 | 15.9% | 31824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.5% | 64 |
| hadur117.micro.SaorWAU 0.1 | 1.5 | 15.9% | 86 |
| js.PinBall 1.6 | 3.5 | 12.1% | 18 |
| cs.Wren 1.0 | 3.7 | 12.0% | 22 |
| mz.Cork 0.1 | 4.8 | 10.6% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 4 |
| evd.X1 0.01 | 7.0 | 7.7% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 2 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 67.6 | 13 / 35 | 5476 |
| 2 | 1 | 63.9 | 70.8 | 12 / 35 | 5454 |
| 3 | 2 | 63.7 | 72.1 | 17 / 35 | 4849 |
| 4 | 2 | 63.7 | 67.9 | 14 / 35 | 5178 |
| 5 | 1 | 63.4 | 67.3 | 13 / 35 | 5375 |
| 6 | 1 | 65.7 | 75.2 | 17 / 35 | 5492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 71% |
| cs.Wren 1.0 | 15 | 87% |
| js.PinBall 1.6 | 12 | 83% |
| mz.Cork 0.1 | 9 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 38% | 98 |
| js.PinBall 1.6 | 16 | 13% | 25 |
| mz.Cork 0.1 | 16 | 13% | 20 |
| cs.Wren 1.0 | 13 | 10% | 22 |
| evd.X1 0.01 | 13 | 10% | 15 |
| joe.ADinosaur 1.0 | 11 | 9% | 16 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.4 | 141 / 210 | 2.40 | 19.2% | 29551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.2% | 141 |
| ntc.Opposite 1.5 | 3.2 | 11.6% | 6 |
| myl.nano.Graviton 1.10 | 3.2 | 11.6% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.8% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.1% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.1% | 6 |
| disan.Chair 2.2.0 | 6.5 | 9.0% | 8 |
| DBall.NUKE 0.1 | 8.0 | 7.3% | 2 |
| donjezza.Muncho 1.0 | 9.3 | 5.2% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.2 | 24 / 35 | 4774 |
| 2 | 1 | 66.2 | 78.7 | 19 / 35 | 4618 |
| 3 | 1 | 69.6 | 87.0 | 28 / 35 | 4911 |
| 4 | 1 | 69.2 | 84.8 | 22 / 35 | 5276 |
| 5 | 1 | 71.1 | 94.0 | 29 / 35 | 5260 |
| 6 | 1 | 67.1 | 79.7 | 19 / 35 | 4712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 93% |
| stelo.AreaTargetingBot 1.1 | 30 | 93% |
| disan.Chair 2.2.0 | 24 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 89% |
| ntc.Opposite 1.5 | 17 | 94% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| DBall.NUKE 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 70 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 17 | 24% | 40 |
| myl.nano.Graviton 1.10 | 16 | 23% | 52 |
| pfvicm.Sobieski 7.2.3b | 11 | 16% | 20 |
| disan.Chair 2.2.0 | 7 | 10% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 10% | 20 |
| stelo.AreaTargetingBot 1.1 | 5 | 7% | 26 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |
| DBall.NUKE 0.1 | 2 | 3% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.3 | 74 / 210 | 3.77 | 15.0% | 24721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.5 | 15.0% | 74 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 58 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 22 |
| yagami.Tidus 0.11 | 5.2 | 12.2% | 7 |
| ejb.Polaris 1.0.1 | 5.3 | 10.9% | 15 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 62.9 | 14 / 35 | 3803 |
| 2 | 2 | 61.2 | 62.9 | 10 / 35 | 3909 |
| 3 | 1 | 65.1 | 73.3 | 11 / 35 | 4700 |
| 4 | 1 | 63.3 | 70.8 | 13 / 35 | 3953 |
| 5 | 1 | 64.8 | 72.7 | 10 / 35 | 4459 |
| 6 | 1 | 64.0 | 73.0 | 16 / 35 | 3897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 63% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 67% |
| yagami.Tidus 0.11 | 15 | 93% |
| ejb.Polaris 1.0.1 | 7 | 57% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 38% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% | 40 |
| yagami.Tidus 0.11 | 20 | 14% | 35 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 26 |
| ejb.Polaris 1.0.1 | 12 | 9% | 16 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 6 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.3 | 139 / 210 | 2.60 | 18.1% | 28068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.1% | 139 |
| ratosh.Nobo 0.21 | 3.0 | 11.7% | 8 |
| bzdp.Pansy 2.1 | 3.3 | 12.0% | 14 |
| wompi.Quokka 1.6 | 4.0 | 11.3% | 9 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 25 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 2 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.6 | 19 / 35 | 4639 |
| 2 | 1 | 69.4 | 92.7 | 26 / 35 | 4775 |
| 3 | 1 | 68.6 | 86.0 | 25 / 35 | 5076 |
| 4 | 1 | 66.6 | 80.0 | 22 / 35 | 4607 |
| 5 | 1 | 66.1 | 80.0 | 24 / 35 | 4271 |
| 6 | 1 | 67.1 | 80.3 | 23 / 35 | 4700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 96% |
| wee.Gem 1.8.4 | 27 | 93% |
| ratosh.Nobo 0.21 | 26 | 92% |
| wompi.Quokka 1.6 | 24 | 88% |
| m3thos.Eva00 1.1 | 14 | 93% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 17% | 62 |
| wompi.Quokka 1.6 | 11 | 15% | 26 |
| wee.Gem 1.8.4 | 8 | 11% | 39 |
| ratosh.Nobo 0.21 | 7 | 10% | 21 |
| m3thos.Eva00 1.1 | 7 | 10% | 19 |
| maribo.FollowFire 1 | 7 | 10% | 10 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 8 |
| bayen.UbaMicro 1.4 | 6 | 8% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 8 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 88.6 | 127 / 210 | 2.03 | 21.5% | 47398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.5% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 16 |
| ayk.WallHugger 1.0 | 4.8 | 9.2% | 0 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.4% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 87.9 | 21 / 35 | 8066 |
| 2 | 1 | 71.7 | 84.4 | 20 / 35 | 7616 |
| 3 | 1 | 73.2 | 93.3 | 21 / 35 | 7677 |
| 4 | 1 | 72.5 | 85.7 | 22 / 35 | 7809 |
| 5 | 1 | 73.9 | 91.7 | 26 / 35 | 8143 |
| 6 | 1 | 72.7 | 88.3 | 17 / 35 | 8087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 75% |
| exauge.GateKeeper 1.1.121g | 17 | 100% |
| mz.NanoGod 2.02 | 15 | 67% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 52% | 138 |
| mz.NanoGod 2.02 | 23 | 27% | 38 |
| ayk.WallHugger 1.0 | 7 | 8% | 10 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 13 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.5 | 125 / 210 | 2.84 | 17.9% | 29898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.9% | 125 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.7% | 23 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 23 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 12 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 4 |
| conscience.Electron 1.3g | 7.5 | 7.4% | 2 |
| ap.Frederick 1.1 | 7.8 | 6.6% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.6% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 75.2 | 22 / 35 | 4631 |
| 2 | 1 | 68.6 | 86.3 | 21 / 35 | 5274 |
| 3 | 1 | 65.8 | 75.9 | 20 / 35 | 4824 |
| 4 | 1 | 66.8 | 77.8 | 23 / 35 | 4883 |
| 5 | 1 | 68.6 | 86.0 | 22 / 35 | 5323 |
| 6 | 1 | 65.9 | 75.9 | 17 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 89% |
| dummy.micro.Sparrow 2.5 | 38 | 87% |
| bvh.micro.Freya 0.3 | 19 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 6 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 24% | 51 |
| voidious.micro.BlitzBat 1.05 | 18 | 21% | 64 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 21% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 12% | 29 |
| bvh.micro.Freya 0.3 | 8 | 9% | 19 |
| conscience.Electron 1.3g | 8 | 9% | 11 |
| dl.BetterWalls 1.0 | 2 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 15 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.8 | 162 / 210 | 1.91 | 21.9% | 42442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.9% | 162 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 13 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 7 |
| supersample.SuperBoxBot 1.0 | 4.7 | 10.0% | 5 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 5 |
| dsw.StaticD 1.0 | 5.2 | 9.2% | 13 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.3% | 3 |
| sample.Corners 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 91.1 | 28 / 35 | 7298 |
| 2 | 1 | 73.6 | 96.2 | 31 / 35 | 7108 |
| 3 | 1 | 71.3 | 85.7 | 23 / 35 | 6738 |
| 4 | 1 | 72.6 | 92.1 | 28 / 35 | 7330 |
| 5 | 1 | 71.3 | 85.1 | 24 / 35 | 7193 |
| 6 | 1 | 71.9 | 88.9 | 28 / 35 | 6775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 55 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 96% |
| dsw.StaticD 1.0 | 19 | 63% |
| supersample.SuperBoxBot 1.0 | 18 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 12 | 25% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 23% | 56 |
| supersample.SuperBoxBot 1.0 | 11 | 23% | 27 |
| sul.Lunar 1.1 | 5 | 10% | 61 |
| mme.NikeEnhanced 2.0 | 4 | 8% | 10 |
| sample.Corners 1.0 | 3 | 6% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.9 | 116 / 210 | 2.72 | 18.6% | 37541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.6% | 116 |
| radnor.DoctorBob 1.42 | 2.5 | 13.2% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.3% | 29 |
| mld.Wisdom 1.0 | 3.5 | 12.0% | 17 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.5% | 8 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 13 |
| GarmBox.Oranges 1.0 | 7.5 | 6.8% | 0 |
| sample.Walls 1.0 | 7.7 | 7.4% | 3 |
| jangs.ns51 1.0 | 8.8 | 5.8% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.8 | 19 / 35 | 6139 |
| 2 | 1 | 67.4 | 77.8 | 19 / 35 | 5992 |
| 3 | 1 | 68.3 | 78.7 | 20 / 35 | 6337 |
| 4 | 1 | 70.0 | 86.3 | 21 / 35 | 6958 |
| 5 | 1 | 66.7 | 77.5 | 18 / 35 | 5784 |
| 6 | 1 | 68.2 | 80.3 | 19 / 35 | 6331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 90% |
| radnor.DoctorBob 1.42 | 34 | 91% |
| mld.Wisdom 1.0 | 19 | 74% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| jangs.ns51 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 28% | 39 |
| radnor.DoctorBob 1.42 | 18 | 19% | 50 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 59 |
| amz.NanoClone 1.41 | 9 | 10% | 16 |
| sample.Walls 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 3 |

