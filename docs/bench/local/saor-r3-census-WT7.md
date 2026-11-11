# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 86.6 | 143 / 210 | 2.20 | 21.2% | 43586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.2% | 143 |
| mz.AntiGrav 1.0 | 2.8 | 14.3% | 16 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 20 |
| mld.Infinity 2.2 | 3.3 | 13.1% | 26 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 3 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| sample.Walls 1.0 | 6.7 | 6.8% | 2 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 87.9 | 26 / 35 | 7274 |
| 2 | 1 | 72.4 | 90.8 | 23 / 35 | 7180 |
| 3 | 1 | 72.2 | 88.6 | 22 / 35 | 7265 |
| 4 | 1 | 71.5 | 83.2 | 24 / 35 | 7011 |
| 5 | 1 | 73.0 | 87.3 | 25 / 35 | 7576 |
| 6 | 1 | 71.2 | 81.9 | 23 / 35 | 7280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 92% |
| mld.Infinity 2.2 | 39 | 85% |
| radnor.DoctorBob 1.42 | 27 | 96% |
| amz.NanoClone 1.41 | 9 | 78% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 36% | 62 |
| mld.Infinity 2.2 | 15 | 22% | 40 |
| mz.AntiGrav 1.0 | 12 | 18% | 71 |
| amz.NanoClone 1.41 | 9 | 13% | 19 |
| sample.Walls 1.0 | 3 | 4% | 6 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.2 | 96 / 210 | 3.05 | 17.4% | 32406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 17.4% | 96 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.7% | 75 |
| mld.DustBunny 3.8 | 3.0 | 14.4% | 20 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 6 |
| zyx.nano.Ant 1.1 | 5.5 | 8.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 4 |
| fullsail.SweetTea 1.1 | 7.5 | 7.0% | 4 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.3 | 19 / 35 | 5737 |
| 2 | 1 | 68.6 | 86.3 | 20 / 35 | 5362 |
| 3 | 1 | 65.6 | 77.5 | 13 / 35 | 4823 |
| 4 | 2 | 64.7 | 66.0 | 11 / 35 | 5454 |
| 5 | 1 | 68.9 | 87.3 | 20 / 35 | 5417 |
| 6 | 1 | 64.2 | 65.1 | 13 / 35 | 5613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 66% |
| mld.DustBunny 3.8 | 49 | 82% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 41 | 36% | 79 |
| mld.DustBunny 3.8 | 30 | 26% | 71 |
| cs.Grudge 1.0 | 10 | 9% | 9 |
| fullsail.SweetTea 1.1 | 7 | 6% | 14 |
| maribo.melee.BMV 0.1 | 7 | 6% | 11 |
| zyx.nano.Ant 1.1 | 6 | 5% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 8 |
| bzdp.BoxCar 2.0 | 4 | 4% | 6 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 77.9 | 123 / 210 | 2.99 | 19.1% | 37330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.1% | 123 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.4% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.8% | 13 |
| fm.mammillarias 1.3 | 5.0 | 9.6% | 4 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.4% | 7 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 6 |
| sample.Fire 1.0 | 9.3 | 4.9% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 73.3 | 17 / 35 | 5892 |
| 2 | 1 | 71.0 | 87.0 | 19 / 35 | 6836 |
| 3 | 1 | 69.5 | 80.3 | 23 / 35 | 6057 |
| 4 | 1 | 69.4 | 77.1 | 23 / 35 | 6362 |
| 5 | 1 | 66.7 | 70.5 | 17 / 35 | 5892 |
| 6 | 1 | 69.3 | 79.0 | 24 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 57 | 89% |
| myl.nano.KomoriNinja 1.1 | 24 | 96% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 88% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 23% | 71 |
| cb.nano.Insomnia 1.0 | 19 | 22% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 13% | 25 |
| fm.mammillarias 1.3 | 11 | 13% | 12 |
| myl.nano.KomoriNinja 1.1 | 10 | 11% | 42 |
| sample.Fire 1.0 | 6 | 7% | 8 |
| sp.Nanos.Ember 1.1 | 5 | 6% | 19 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 7 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 88.1 | 155 / 210 | 2.07 | 21.3% | 42244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.3% | 155 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.0% | 1 |
| tj.zombie1n 1.0.1 | 5.3 | 8.8% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.5% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.8% | 10 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 25 / 35 | 6759 |
| 2 | 1 | 72.9 | 92.1 | 28 / 35 | 7603 |
| 3 | 1 | 67.9 | 77.8 | 22 / 35 | 5906 |
| 4 | 1 | 72.9 | 93.3 | 30 / 35 | 7299 |
| 5 | 1 | 71.0 | 86.7 | 25 / 35 | 7294 |
| 6 | 1 | 72.6 | 92.7 | 25 / 35 | 7383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 87% |
| stelo.SoJNanoMelee 1.1 | 29 | 93% |
| tvv.micro.Antares 1.1.1 | 18 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| yk.JahMicro 1.0 | 13 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 53% | 88 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 30 |
| stelo.SoJNanoMelee 1.1 | 6 | 11% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 23 |
| tj.zombie1n 1.0.1 | 3 | 5% | 11 |
| yk.JahMicro 1.0 | 0 | 0% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.8 | 92 / 210 | 3.72 | 16.3% | 30229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.3% | 92 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 35 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 23 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.3% | 10 |
| sam.Samspin 1.0 | 6.5 | 9.2% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.2 | 15 / 35 | 5249 |
| 2 | 1 | 67.2 | 77.1 | 21 / 35 | 5545 |
| 3 | 1 | 64.4 | 66.0 | 16 / 35 | 5432 |
| 4 | 1 | 63.0 | 67.0 | 16 / 35 | 4608 |
| 5 | 1 | 61.1 | 62.5 | 11 / 35 | 4543 |
| 6 | 1 | 64.0 | 70.8 | 13 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 93% |
| oog.melee.Corsair 1.0 | 35 | 57% |
| ahf.NanoAndrew .4 | 18 | 89% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 23% | 50 |
| simonton.nano.MeleeSeed 1.8 | 26 | 22% | 55 |
| ahf.NanoAndrew .4 | 20 | 17% | 36 |
| EBBU.Sim2 1.02 | 14 | 12% | 22 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 15 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 12 |
| sam.Samspin 1.0 | 5 | 4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 5 |
| sample.TrackFire 1.0 | 3 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.7 | 135 / 210 | 2.29 | 19.6% | 34150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.6% | 135 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 32 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.0% | 12 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.2% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 6 |
| fm.claire 1.7 | 7.0 | 7.5% | 0 |
| pa.Improved 1.0 | 8.3 | 6.6% | 2 |
| sample.SpinBot 1.0 | 8.7 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.6 | 22 / 35 | 5654 |
| 2 | 1 | 70.7 | 91.4 | 25 / 35 | 5870 |
| 3 | 1 | 69.2 | 86.7 | 23 / 35 | 5371 |
| 4 | 1 | 69.9 | 86.3 | 22 / 35 | 6066 |
| 5 | 1 | 66.6 | 80.0 | 18 / 35 | 4857 |
| 6 | 1 | 70.7 | 87.9 | 25 / 35 | 6332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 82% |
| oog.melee.CapuletDroid 1.1 | 25 | 100% |
| arthord.NanoSatanMelee Beta | 20 | 95% |
| gh.nano.Grofvuil 0.2 | 18 | 94% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 46% | 96 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 24 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 32 |
| gh.nano.Grofvuil 0.2 | 7 | 9% | 27 |
| pa.Improved 1.0 | 5 | 7% | 7 |
| fm.claire 1.7 | 5 | 7% | 5 |
| sample.SpinBot 1.0 | 5 | 7% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 7 |
| kurios.DOSexe .9b | 2 | 3% | 6 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 78.7 | 101 / 210 | 2.91 | 18.1% | 35973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.1% | 101 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.1% | 35 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.5% | 35 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 31 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.3% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 78.4 | 19 / 35 | 6364 |
| 2 | 1 | 67.9 | 80.3 | 16 / 35 | 6395 |
| 3 | 1 | 71.6 | 91.1 | 23 / 35 | 6709 |
| 4 | 1 | 66.0 | 74.3 | 19 / 35 | 5164 |
| 5 | 1 | 66.1 | 74.3 | 13 / 35 | 5647 |
| 6 | 1 | 65.5 | 74.0 | 11 / 35 | 5694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 56 | 86% |
| mz.MicroGodMelee 1 | 37 | 62% |
| gh.micro.Gruweltje 0.7 | 25 | 68% |
| caimano.Furia_Ceca 0.22 | 7 | 86% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 28% | 58 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 66 |
| gh.micro.Gruweltje 0.7 | 26 | 24% | 44 |
| acogdev.alpha 0.2 | 10 | 9% | 11 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 19 |
| fire219.CatBot 1.0 | 4 | 4% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.2 | 115 / 210 | 3.50 | 16.7% | 30266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 16.7% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 34 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.8% | 7 |
| awesomeness.Elite 1.0 | 5.5 | 8.9% | 13 |
| germ.TheMind .2 | 5.5 | 9.0% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 4 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.4% | 2 |
| sample.Crazy 1.0 | 8.3 | 7.0% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 61.6 | 17 / 35 | 4568 |
| 2 | 1 | 69.9 | 88.9 | 25 / 35 | 5620 |
| 3 | 1 | 65.9 | 71.7 | 21 / 35 | 5328 |
| 4 | 1 | 65.8 | 75.6 | 18 / 35 | 4892 |
| 5 | 1 | 64.5 | 69.8 | 19 / 35 | 5176 |
| 6 | 2 | 62.8 | 65.7 | 15 / 35 | 4682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 82% |
| qualidafial.MajorDick 1.0.1 | 13 | 92% |
| germ.TheMind .2 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 55% | 109 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 18% | 35 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 10 |
| germ.TheMind .2 | 4 | 4% | 15 |
| awesomeness.Elite 1.0 | 3 | 3% | 10 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 5 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.9 | 152 / 210 | 1.91 | 20.5% | 33285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.5% | 152 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 23 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.8% | 5 |
| maribo.IotaCT 1.1 | 3.8 | 10.9% | 9 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.1% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.5% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.5% | 5 |
| stelo.PatternRobot 1.0 | 7.7 | 7.6% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 92.7 | 28 / 35 | 5746 |
| 2 | 1 | 71.5 | 92.4 | 26 / 35 | 5924 |
| 3 | 1 | 69.7 | 89.5 | 21 / 35 | 5424 |
| 4 | 1 | 71.5 | 91.7 | 28 / 35 | 5513 |
| 5 | 1 | 71.0 | 87.9 | 26 / 35 | 5511 |
| 6 | 1 | 69.8 | 85.1 | 23 / 35 | 5167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 91% |
| nz.jdc.nano.GridFu 1.0 | 32 | 97% |
| timmit.nano.TimDog 0.33 | 16 | 81% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| ratosh.Wesco 1.4 | 12 | 83% |
| maribo.IotaCT 1.1 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 31% | 70 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 26 |
| ratosh.Wesco 1.4 | 9 | 16% | 20 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 47 |
| maribo.IotaCT 1.1 | 5 | 9% | 20 |
| stelo.PatternRobot 1.0 | 4 | 7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 8 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.3 | 165 / 210 | 1.87 | 21.7% | 41902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.7% | 165 |
| baal.nano.N 1.42 | 2.3 | 12.4% | 8 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.7% | 15 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.4% | 1 |
| zyx.micro.Ant 1.1 | 5.5 | 8.9% | 11 |
| sanja.First 0.1 | 6.2 | 8.3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 7 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 83.8 | 25 / 35 | 6455 |
| 2 | 1 | 72.6 | 94.0 | 29 / 35 | 7183 |
| 3 | 1 | 72.5 | 94.3 | 28 / 35 | 7086 |
| 4 | 1 | 71.2 | 88.6 | 27 / 35 | 6766 |
| 5 | 1 | 72.7 | 92.4 | 28 / 35 | 7443 |
| 6 | 1 | 71.8 | 88.9 | 28 / 35 | 6969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 51 | 96% |
| tvv.nano.Polaris 1.2 | 40 | 90% |
| sanja.First 0.1 | 25 | 92% |
| cvt.Firsty 1.0 | 24 | 88% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| zyx.micro.Ant 1.1 | 12 | 83% |
| amk.Punbot.Punbot 0.01 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 24% | 56 |
| zyx.micro.Ant 1.1 | 10 | 22% | 28 |
| cvt.Firsty 1.0 | 8 | 18% | 28 |
| baal.nano.N 1.42 | 4 | 9% | 50 |
| sanja.First 0.1 | 4 | 9% | 20 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 12 |
| sample.RamFire 1.0 | 3 | 7% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 67.9 | 83 / 210 | 3.89 | 15.7% | 32394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.2 | 15.7% | 83 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 64 |
| cs.Wren 1.0 | 3.0 | 13.1% | 22 |
| mz.Cork 0.1 | 4.3 | 11.3% | 11 |
| js.PinBall 1.6 | 4.8 | 10.7% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 5 |
| evd.X1 0.01 | 6.8 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 69.5 | 15 / 35 | 5757 |
| 2 | 2 | 62.2 | 64.8 | 15 / 35 | 4782 |
| 3 | 1 | 65.3 | 74.9 | 13 / 35 | 5466 |
| 4 | 1 | 64.3 | 69.2 | 12 / 35 | 5672 |
| 5 | 1 | 60.4 | 60.3 | 13 / 35 | 4906 |
| 6 | 1 | 65.0 | 68.9 | 15 / 35 | 5811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 51 | 65% |
| cs.Wren 1.0 | 30 | 80% |
| mz.Cork 0.1 | 12 | 75% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| js.PinBall 1.6 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 46% | 97 |
| cs.Wren 1.0 | 19 | 15% | 37 |
| joe.ADinosaur 1.0 | 11 | 9% | 13 |
| evd.X1 0.01 | 11 | 9% | 12 |
| js.PinBall 1.6 | 10 | 8% | 16 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| mz.Cork 0.1 | 6 | 5% | 13 |
| jsal.Jsalbot 1.0 | 2 | 2% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.0 | 142 / 210 | 2.35 | 19.6% | 31743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.6% | 142 |
| myl.nano.Graviton 1.10 | 2.2 | 12.0% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.1% | 1 |
| ntc.Opposite 1.5 | 4.3 | 10.7% | 9 |
| stelo.AreaTargetingBot 1.1 | 6.0 | 9.3% | 12 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 8 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 4 |
| pbg.R2D2 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 22 / 35 | 5209 |
| 2 | 1 | 68.3 | 81.9 | 23 / 35 | 5279 |
| 3 | 1 | 66.5 | 77.8 | 20 / 35 | 4257 |
| 4 | 1 | 70.7 | 90.8 | 27 / 35 | 5687 |
| 5 | 1 | 68.8 | 84.8 | 23 / 35 | 5332 |
| 6 | 1 | 71.6 | 91.7 | 27 / 35 | 5979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 50 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 95% |
| stelo.AreaTargetingBot 1.1 | 21 | 86% |
| ntc.Opposite 1.5 | 16 | 100% |
| donjezza.Muncho 1.0 | 16 | 100% |
| DBall.NUKE 0.1 | 13 | 92% |
| disan.Chair 2.2.0 | 10 | 80% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 16 | 24% | 23 |
| myl.nano.Graviton 1.10 | 14 | 21% | 45 |
| ntc.Opposite 1.5 | 12 | 18% | 27 |
| stelo.AreaTargetingBot 1.1 | 8 | 12% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 25 |
| disan.Chair 2.2.0 | 3 | 4% | 17 |
| DBall.NUKE 0.1 | 3 | 4% | 16 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |
| donjezza.Muncho 1.0 | 1 | 1% | 14 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.0 | 101 / 210 | 2.98 | 17.1% | 27831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.1% | 101 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 49 |
| kawigi.micro.Shiz 1.1 | 3.7 | 13.1% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 15 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 9.4% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.1 | 18 / 35 | 4659 |
| 2 | 1 | 65.7 | 73.7 | 14 / 35 | 4670 |
| 3 | 1 | 68.1 | 80.6 | 18 / 35 | 5004 |
| 4 | 1 | 64.5 | 69.2 | 14 / 35 | 4346 |
| 5 | 1 | 68.7 | 85.4 | 21 / 35 | 4582 |
| 6 | 1 | 66.9 | 81.0 | 16 / 35 | 4570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 83% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 19 | 95% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 38% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 23% | 55 |
| yagami.Tidus 0.11 | 19 | 17% | 36 |
| kawigi.micro.Shiz 1.1 | 8 | 7% | 28 |
| ejb.Polaris 1.0.1 | 7 | 6% | 12 |
| stelo.MirrorNano 1.3 | 5 | 5% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.3 | 128 / 210 | 2.50 | 18.4% | 29574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.4% | 128 |
| bzdp.Pansy 2.1 | 2.5 | 12.8% | 23 |
| wee.Gem 1.8.4 | 2.8 | 12.2% | 27 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 18 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 6 |
| m3thos.Eva00 1.1 | 5.7 | 9.6% | 7 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.4 | 20 / 35 | 4761 |
| 2 | 1 | 66.7 | 80.6 | 19 / 35 | 4651 |
| 3 | 1 | 69.4 | 88.3 | 25 / 35 | 5135 |
| 4 | 1 | 67.4 | 82.9 | 22 / 35 | 4769 |
| 5 | 1 | 69.0 | 87.6 | 22 / 35 | 5372 |
| 6 | 1 | 67.0 | 81.3 | 20 / 35 | 4886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 87% |
| wee.Gem 1.8.4 | 27 | 89% |
| m3thos.Eva00 1.1 | 18 | 89% |
| wompi.Quokka 1.6 | 17 | 76% |
| ratosh.Nobo 0.21 | 14 | 79% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 22 | 27% | 72 |
| wee.Gem 1.8.4 | 16 | 20% | 48 |
| wompi.Quokka 1.6 | 11 | 13% | 19 |
| m3thos.Eva00 1.1 | 9 | 11% | 21 |
| ratosh.Nobo 0.21 | 8 | 10% | 21 |
| maribo.FollowFire 1 | 5 | 6% | 5 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 7 |
| bayen.UbaMicro 1.4 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 86.1 | 121 / 210 | 2.25 | 21.7% | 50277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.7% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 68 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 18 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.7% | 1 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 7.7 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 89.2 | 22 / 35 | 8300 |
| 2 | 1 | 74.1 | 89.5 | 20 / 35 | 8704 |
| 3 | 1 | 70.4 | 77.5 | 18 / 35 | 7731 |
| 4 | 1 | 71.5 | 81.3 | 19 / 35 | 7652 |
| 5 | 1 | 75.0 | 93.7 | 24 / 35 | 9049 |
| 6 | 1 | 73.3 | 85.4 | 18 / 35 | 8841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 73% |
| mz.NanoGod 2.02 | 16 | 50% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 52% | 137 |
| mz.NanoGod 2.02 | 23 | 25% | 34 |
| exauge.GateKeeper 1.1.121g | 7 | 8% | 10 |
| ayk.WallHugger 1.0 | 6 | 7% | 13 |
| stuff.Vlad 0.1 | 4 | 4% | 8 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 73.9 | 105 / 210 | 3.35 | 17.2% | 31566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 17.2% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 29 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.1% | 19 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.2% | 16 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.2% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 4 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.1% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.3 | 20 / 35 | 5464 |
| 2 | 1 | 66.0 | 75.6 | 15 / 35 | 5497 |
| 3 | 1 | 65.1 | 73.0 | 16 / 35 | 5148 |
| 4 | 1 | 64.2 | 67.9 | 16 / 35 | 5242 |
| 5 | 1 | 64.2 | 70.2 | 19 / 35 | 4721 |
| 6 | 1 | 67.4 | 76.2 | 19 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 83% |
| dummy.micro.Sparrow 2.5 | 28 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| bvh.micro.Freya 0.3 | 20 | 75% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 29 | 27% | 61 |
| conscience.Electron 1.3g | 17 | 16% | 17 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 31 |
| bvh.micro.Freya 0.3 | 12 | 11% | 20 |
| dl.BetterWalls 1.0 | 10 | 9% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 11 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.9 | 146 / 210 | 2.27 | 21.4% | 44161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.4% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.7% | 17 |
| sul.Lunar 1.1 | 3.3 | 12.1% | 17 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.5% | 14 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.5% | 5 |
| dsw.StaticD 1.0 | 6.2 | 8.1% | 6 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.6% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 2 |
| sample.Corners 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 84.1 | 22 / 35 | 7728 |
| 2 | 1 | 70.6 | 82.5 | 23 / 35 | 6778 |
| 3 | 1 | 73.7 | 94.0 | 27 / 35 | 7797 |
| 4 | 1 | 71.5 | 84.4 | 25 / 35 | 7498 |
| 5 | 1 | 71.4 | 87.3 | 24 / 35 | 7166 |
| 6 | 1 | 71.5 | 83.2 | 25 / 35 | 7194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 33 | 94% |
| supersample.SuperBoxBot 1.0 | 28 | 89% |
| dsw.StaticD 1.0 | 14 | 79% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 35% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 17% | 45 |
| sul.Lunar 1.1 | 8 | 12% | 61 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 19 |
| dsw.StaticD 1.0 | 6 | 9% | 20 |
| sample.MyFirstRobot 1.0 | 4 | 6% | 11 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |
| sample.Corners 1.0 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.0 | 114 / 210 | 2.62 | 19.0% | 38972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.0% | 114 |
| radnor.DoctorBob 1.42 | 2.7 | 12.6% | 20 |
| mld.Wisdom 1.0 | 2.8 | 12.2% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.6% | 26 |
| amz.NanoClone 1.41 | 5.2 | 10.4% | 12 |
| KiraNL.Chupacabra 0.4 | 5.7 | 10.0% | 9 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 1 |
| sample.Walls 1.0 | 8.2 | 7.0% | 5 |
| jangs.ns51 1.0 | 8.3 | 6.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 80.3 | 20 / 35 | 6206 |
| 2 | 1 | 66.8 | 76.5 | 17 / 35 | 6018 |
| 3 | 1 | 69.9 | 85.7 | 21 / 35 | 6754 |
| 4 | 1 | 71.0 | 91.4 | 22 / 35 | 6734 |
| 5 | 1 | 67.7 | 75.9 | 14 / 35 | 6893 |
| 6 | 1 | 68.6 | 81.9 | 20 / 35 | 6367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 79% |
| radnor.DoctorBob 1.42 | 32 | 88% |
| mld.Wisdom 1.0 | 27 | 59% |
| amz.NanoClone 1.41 | 16 | 75% |
| KiraNL.Chupacabra 0.4 | 10 | 70% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 27% | 41 |
| KiraNL.Chupacabra 0.4 | 19 | 20% | 26 |
| radnor.DoctorBob 1.42 | 17 | 18% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 17% | 57 |
| amz.NanoClone 1.41 | 9 | 9% | 21 |
| jangs.ns51 1.0 | 5 | 5% | 8 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

