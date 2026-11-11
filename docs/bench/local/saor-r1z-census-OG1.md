# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 76.6 | 74 / 210 | 3.11 | 16.8% | 30687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 16.8% | 74 |
| radnor.DoctorBob 1.42 | 2.2 | 15.8% | 45 |
| mld.Infinity 2.2 | 3.0 | 15.1% | 51 |
| mz.AntiGrav 1.0 | 3.7 | 14.9% | 29 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 4 |
| sample.Walls 1.0 | 6.3 | 7.2% | 5 |
| GarmBox.Oranges 1.0 | 6.7 | 6.4% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 1 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.6 | 12 / 35 | 5629 |
| 2 | 1 | 67.0 | 78.1 | 11 / 35 | 5154 |
| 3 | 2 | 64.0 | 72.4 | 8 / 35 | 4500 |
| 4 | 1 | 66.3 | 74.9 | 12 / 35 | 5048 |
| 5 | 1 | 67.4 | 76.5 | 14 / 35 | 5660 |
| 6 | 1 | 68.3 | 82.9 | 17 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 35 | 49% |
| radnor.DoctorBob 1.42 | 35 | 49% |
| mz.AntiGrav 1.0 | 34 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 69 | 51% | 92 |
| mld.Infinity 2.2 | 34 | 25% | 33 |
| mz.AntiGrav 1.0 | 18 | 13% | 54 |
| amz.NanoClone 1.41 | 9 | 7% | 12 |
| arthord.MannyPacquiao Beta | 2 | 1% | 5 |
| sample.Walls 1.0 | 2 | 1% | 4 |
| jangs.ns51 1.0 | 2 | 1% | 4 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.6 | 134 / 210 | 2.20 | 18.0% | 25752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.0% | 134 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.0% | 45 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 13 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.4% | 7 |
| zyx.nano.Ant 1.1 | 5.8 | 9.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.3% | 5 |
| bzdp.BoxCar 2.0 | 8.3 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 23 / 35 | 4352 |
| 2 | 1 | 68.1 | 89.8 | 21 / 35 | 4482 |
| 3 | 1 | 65.8 | 83.2 | 19 / 35 | 3961 |
| 4 | 1 | 67.3 | 83.8 | 21 / 35 | 4568 |
| 5 | 1 | 67.7 | 87.6 | 24 / 35 | 3947 |
| 6 | 1 | 69.2 | 92.1 | 26 / 35 | 4442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 74 | 80% |
| mld.DustBunny 3.8 | 52 | 88% |
| djdjdj.NanoSkunk10 1.0 | 14 | 93% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 30% | 86 |
| mld.DustBunny 3.8 | 11 | 14% | 54 |
| zyx.nano.Ant 1.1 | 11 | 14% | 13 |
| maribo.melee.BMV 0.1 | 9 | 12% | 11 |
| bzdp.BoxCar 2.0 | 7 | 9% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 8% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 20 |
| fullsail.SweetTea 1.1 | 4 | 5% | 9 |

## Melee bench: F03

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 77.9 | 108 / 210 | 2.99 | 17.8% | 30730 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 17.8% | 108 |
| myl.micro.Troodon 1.10 | 2.0 | 15.4% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.7% | 25 |
| fm.mammillarias 1.3 | 4.8 | 10.0% | 3 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.5% | 13 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 4 |
| sample.Tracker 1.0 | 9.3 | 4.6% | 0 |
| sample.Fire 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 72.1 | 18 / 35 | 4814 |
| 2 | 1 | 67.5 | 81.9 | 17 / 35 | 4916 |
| 3 | 1 | 67.8 | 78.7 | 19 / 35 | 5377 |
| 4 | 1 | 66.3 | 76.2 | 14 / 35 | 5154 |
| 5 | 1 | 68.3 | 78.1 | 19 / 35 | 5677 |
| 6 | 1 | 67.5 | 80.3 | 21 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 61 | 85% |
| myl.nano.KomoriNinja 1.1 | 23 | 91% |
| cb.nano.Insomnia 1.0 | 18 | 72% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 65% |
| fm.mammillarias 1.3 | 9 | 89% |
| sp.Nanos.Ember 1.1 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 24% | 35 |
| myl.micro.Troodon 1.10 | 21 | 21% | 82 |
| cb.nano.Insomnia 1.0 | 17 | 17% | 11 |
| myl.nano.KomoriNinja 1.1 | 16 | 16% | 45 |
| fm.mammillarias 1.3 | 9 | 9% | 12 |
| sp.Nanos.Ember 1.1 | 5 | 5% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 8 |
| sample.Tracker 1.0 | 4 | 4% | 4 |
| sample.Fire 1.0 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.3 | 112 / 210 | 2.50 | 18.4% | 31631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.4% | 112 |
| tvv.micro.Antares 1.1.1 | 2.3 | 13.5% | 35 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.5% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.9% | 30 |
| tj.zombie1n 1.0.1 | 4.7 | 9.8% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.8% | 0 |
| yk.JahMicro 1.0 | 6.8 | 8.4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.3% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 17 / 35 | 5162 |
| 2 | 1 | 70.2 | 91.1 | 22 / 35 | 5792 |
| 3 | 1 | 67.5 | 85.4 | 20 / 35 | 5025 |
| 4 | 1 | 67.7 | 83.2 | 20 / 35 | 5310 |
| 5 | 1 | 64.3 | 74.0 | 14 / 35 | 4664 |
| 6 | 1 | 68.3 | 83.5 | 19 / 35 | 5678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 85% |
| tvv.micro.Antares 1.1.1 | 28 | 68% |
| stelo.SoJNanoMelee 1.1 | 22 | 55% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 100% |
| tj.zombie1n 1.0.1 | 10 | 70% |
| yk.JahMicro 1.0 | 9 | 78% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 29 | 29% | 41 |
| tvv.micro.Antares 1.1.1 | 25 | 25% | 42 |
| kawigi.nano.Lib 1.0 | 24 | 24% | 69 |
| tj.zombie1n 1.0.1 | 6 | 6% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 5% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 17 |
| yk.JahMicro 1.0 | 3 | 3% | 7 |
| repositorio.NanoStep 1.0 | 2 | 2% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F05

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 66.7 | 83 / 210 | 4.00 | 15.0% | 25704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 15.0% | 83 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 27 |
| ahf.NanoAndrew .4 | 3.3 | 12.1% | 39 |
| sam.Samspin 1.0 | 4.3 | 10.8% | 19 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.9% | 20 |
| EBBU.Sim2 1.02 | 5.7 | 10.0% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.2% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 67.3 | 15 / 35 | 4118 |
| 2 | 1 | 62.0 | 70.2 | 12 / 35 | 4094 |
| 3 | 1 | 65.0 | 74.3 | 18 / 35 | 4553 |
| 4 | 1 | 59.6 | 57.8 | 9 / 35 | 4426 |
| 5 | 1 | 61.5 | 64.8 | 15 / 35 | 4243 |
| 6 | 1 | 61.9 | 65.7 | 14 / 35 | 4270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 85% |
| simonton.nano.MeleeSeed 1.8 | 23 | 91% |
| ahf.NanoAndrew .4 | 21 | 62% |
| sam.Samspin 1.0 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| EBBU.Sim2 1.02 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 127 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 19 | 15% | 24 |
| ahf.NanoAndrew .4 | 18 | 14% | 32 |
| zyx.nano.BacillusComma 1.0 | 16 | 13% | 20 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 38 |
| oog.melee.Corsair 1.0 | 14 | 11% | 36 |
| sam.Samspin 1.0 | 14 | 11% | 20 |
| EBBU.Sim2 1.02 | 13 | 10% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 9% | 12 |
| sample.TrackFire 1.0 | 6 | 5% | 7 |

## Melee bench: F06

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.2 | 134 / 210 | 2.33 | 18.1% | 26020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.1% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 27 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.8% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 15 |
| winamp32.micro.MicroMacro 1.0 | 4.7 | 10.1% | 13 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 2 |
| sample.SpinBot 1.0 | 7.2 | 7.7% | 4 |
| fm.claire 1.7 | 7.7 | 7.7% | 1 |
| pa.Improved 1.0 | 9.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.4 | 24 / 35 | 4708 |
| 2 | 1 | 68.7 | 87.6 | 24 / 35 | 4832 |
| 3 | 1 | 65.1 | 77.1 | 19 / 35 | 4115 |
| 4 | 1 | 68.5 | 92.4 | 24 / 35 | 4026 |
| 5 | 1 | 67.1 | 85.1 | 22 / 35 | 4254 |
| 6 | 1 | 66.4 | 83.5 | 21 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 85% |
| oog.melee.CapuletDroid 1.1 | 34 | 91% |
| gh.nano.Grofvuil 0.2 | 25 | 84% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 12 | 92% |
| fm.claire 1.7 | 5 | 80% |
| sample.SpinBot 1.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 77 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 27% | 76 |
| gh.nano.Grofvuil 0.2 | 16 | 21% | 41 |
| oog.melee.CapuletDroid 1.1 | 11 | 14% | 14 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 21 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 20 |
| fm.claire 1.7 | 6 | 8% | 13 |
| sample.SpinBot 1.0 | 5 | 6% | 14 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| pa.Improved 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.7 | 79 / 210 | 3.19 | 15.8% | 25305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.8% | 79 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.6% | 46 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.1% | 38 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 20 |
| DBall.Anarchy 0.1 | 5.0 | 9.8% | 16 |
| caimano.Furia_Ceca 0.22 | 6.2 | 8.0% | 4 |
| el.JumpShoot 0.2 | 8.0 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 73.3 | 11 / 35 | 3700 |
| 2 | 1 | 64.5 | 77.8 | 13 / 35 | 4365 |
| 3 | 1 | 64.2 | 76.5 | 15 / 35 | 4186 |
| 4 | 1 | 64.2 | 75.9 | 13 / 35 | 4228 |
| 5 | 1 | 65.1 | 78.1 | 16 / 35 | 4238 |
| 6 | 1 | 63.4 | 72.4 | 11 / 35 | 4588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 48% |
| gh.micro.Gruweltje 0.7 | 30 | 60% |
| mz.MicroGodMelee 1 | 28 | 82% |
| DBall.Anarchy 0.1 | 14 | 57% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 31% | 56 |
| gh.micro.Gruweltje 0.7 | 34 | 26% | 60 |
| mz.MicroGodMelee 1 | 19 | 15% | 37 |
| DBall.Anarchy 0.1 | 11 | 8% | 16 |
| acogdev.alpha 0.2 | 10 | 8% | 13 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 13 |
| el.JumpShoot 0.2 | 5 | 4% | 6 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 61.9 | 74 / 210 | 4.43 | 14.1% | 25644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 15.5% | 57 |
| hadur117.micro.SaorOG1 0.1 | 2.3 | 14.1% | 74 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 13.9% | 37 |
| germ.TheMind .2 | 4.3 | 10.1% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.5% | 6 |
| awesomeness.Elite 1.0 | 5.7 | 9.2% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.5% | 6 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 8 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 69.2 | 17 / 35 | 4577 |
| 2 | 2 | 58.7 | 59.0 | 12 / 35 | 4015 |
| 3 | 3 | 60.7 | 60.0 | 14 / 35 | 4269 |
| 4 | 3 | 60.8 | 64.8 | 12 / 35 | 3997 |
| 5 | 2 | 62.5 | 66.7 | 12 / 35 | 4568 |
| 6 | 3 | 57.3 | 51.4 | 7 / 35 | 4218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 73% |
| germ.TheMind .2 | 7 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 3 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 459. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 49% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 15% | 34 |
| germ.TheMind .2 | 12 | 9% | 18 |
| awesomeness.Elite 1.0 | 10 | 7% | 15 |
| lrem.micro.MoggFanatic 0.2 | 9 | 7% | 9 |
| stelo.UntouchableNano 1.3 | 6 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 9 |
| mym.EdgeStalker 1.0 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 3 | 2% | 10 |

## Melee bench: F09

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.7 | 109 / 210 | 2.92 | 16.4% | 20434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.4% | 109 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.0% | 24 |
| maribo.IotaCT 1.1 | 4.3 | 11.2% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.3% | 7 |
| timmit.nano.TimDog 0.33 | 6.7 | 9.5% | 7 |
| ratosh.Wesco 1.4 | 6.8 | 8.5% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 8.0% | 12 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.1 | 19 / 35 | 3438 |
| 2 | 1 | 62.9 | 73.0 | 14 / 35 | 3049 |
| 3 | 1 | 65.7 | 80.6 | 17 / 35 | 3487 |
| 4 | 1 | 64.7 | 76.8 | 18 / 35 | 3325 |
| 5 | 1 | 65.9 | 78.7 | 20 / 35 | 3600 |
| 6 | 1 | 67.3 | 84.8 | 21 / 35 | 3535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 51 | 88% |
| nz.jdc.nano.GridFu 1.0 | 37 | 78% |
| maribo.IotaCT 1.1 | 15 | 87% |
| ratosh.Wesco 1.4 | 9 | 67% |
| timmit.nano.TimDog 0.33 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 24 | 24% | 58 |
| rz.HawkOnFire 0.1 | 18 | 18% | 53 |
| ratosh.Wesco 1.4 | 15 | 15% | 20 |
| maribo.IotaCT 1.1 | 14 | 14% | 36 |
| stelo.PatternRobot 1.0 | 14 | 14% | 18 |
| timmit.nano.TimDog 0.33 | 8 | 8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 8 |
| spinnercat.Omen 1.0 | 3 | 3% | 4 |

## Melee bench: F10

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.4 | 122 / 210 | 2.40 | 18.5% | 31166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 18.5% | 122 |
| tvv.nano.Polaris 1.2 | 2.3 | 13.2% | 39 |
| baal.nano.N 1.42 | 2.7 | 12.3% | 8 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.4% | 6 |
| zyx.micro.Ant 1.1 | 5.0 | 9.5% | 10 |
| sanja.First 0.1 | 5.7 | 8.8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.3% | 5 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.4% | 11 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.3 | 21 / 35 | 5554 |
| 2 | 1 | 67.5 | 84.1 | 21 / 35 | 5169 |
| 3 | 1 | 67.7 | 85.7 | 21 / 35 | 5055 |
| 4 | 1 | 67.6 | 85.4 | 22 / 35 | 4765 |
| 5 | 1 | 66.4 | 79.4 | 14 / 35 | 5312 |
| 6 | 1 | 67.9 | 84.8 | 23 / 35 | 5311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 55% |
| baal.nano.N 1.42 | 29 | 100% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| sanja.First 0.1 | 17 | 82% |
| cvt.Firsty 1.0 | 16 | 69% |
| Grystrion.TrackerWO 1.0 | 13 | 85% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| amk.Punbot.Punbot 0.01 | 6 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 31 | 34% | 59 |
| zyx.micro.Ant 1.1 | 14 | 16% | 30 |
| Grystrion.TrackerWO 1.0 | 14 | 16% | 24 |
| cvt.Firsty 1.0 | 10 | 11% | 23 |
| squidM.TentalceMeleeNano 1.1 | 6 | 7% | 14 |
| baal.nano.N 1.42 | 5 | 6% | 30 |
| sanja.First 0.1 | 5 | 6% | 21 |
| amk.Punbot.Punbot 0.01 | 3 | 3% | 3 |
| sample.RamFire 1.0 | 2 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 67.0 | 53 / 210 | 3.97 | 13.8% | 23887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.7% | 97 |
| hadur117.micro.SaorOG1 0.1 | 2.2 | 13.8% | 53 |
| cs.Wren 1.0 | 3.2 | 12.4% | 17 |
| js.PinBall 1.6 | 4.3 | 11.4% | 19 |
| mz.Cork 0.1 | 4.3 | 11.4% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 2 |
| evd.X1 0.01 | 6.8 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 7 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 0 |
| PSW.Relentless 0.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 71.4 | 8 / 35 | 3580 |
| 2 | 3 | 58.0 | 60.6 | 7 / 35 | 3727 |
| 3 | 2 | 59.6 | 62.2 | 12 / 35 | 4177 |
| 4 | 2 | 59.8 | 64.8 | 7 / 35 | 3947 |
| 5 | 2 | 62.3 | 73.7 | 6 / 35 | 3969 |
| 6 | 2 | 62.2 | 69.2 | 13 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 41% |
| cs.Wren 1.0 | 16 | 75% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 71 | 45% | 104 |
| cs.Wren 1.0 | 22 | 14% | 31 |
| evd.X1 0.01 | 18 | 11% | 20 |
| joe.ADinosaur 1.0 | 14 | 9% | 16 |
| js.PinBall 1.6 | 14 | 9% | 16 |
| mz.Cork 0.1 | 8 | 5% | 10 |
| PSW.Relentless 0.1 | 5 | 3% | 4 |
| jsal.Jsalbot 1.0 | 4 | 3% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.1 | 103 / 210 | 2.97 | 16.7% | 23927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.0 | 16.7% | 103 |
| myl.nano.Graviton 1.10 | 2.7 | 12.1% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 11.3% | 10 |
| ntc.Opposite 1.5 | 4.2 | 11.1% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 11.0% | 29 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.2% | 9 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 8 |
| DBall.NUKE 0.1 | 7.7 | 8.1% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 1 |
| donjezza.Muncho 1.0 | 9.5 | 5.2% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.6 | 18 / 35 | 4096 |
| 2 | 1 | 66.4 | 82.5 | 16 / 35 | 4495 |
| 3 | 1 | 66.6 | 81.6 | 21 / 35 | 4276 |
| 4 | 1 | 63.4 | 72.4 | 14 / 35 | 3916 |
| 5 | 1 | 65.2 | 79.0 | 18 / 35 | 3800 |
| 6 | 1 | 63.7 | 77.8 | 16 / 35 | 3344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 85% |
| stelo.AreaTargetingBot 1.1 | 26 | 38% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 90% |
| disan.Chair 2.2.0 | 17 | 82% |
| DBall.NUKE 0.1 | 14 | 79% |
| ntc.Opposite 1.5 | 13 | 69% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| donjezza.Muncho 1.0 | 4 | 50% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 31 | 29% | 49 |
| pfvicm.Sobieski 7.2.3b | 20 | 19% | 25 |
| myl.nano.Graviton 1.10 | 15 | 14% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 13% | 27 |
| ntc.Opposite 1.5 | 10 | 9% | 26 |
| disan.Chair 2.2.0 | 6 | 6% | 6 |
| DBall.NUKE 0.1 | 5 | 5% | 16 |
| pbg.R2D2 1.0 | 3 | 3% | 7 |
| donjezza.Muncho 1.0 | 3 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 68.7 | 84 / 210 | 3.82 | 14.4% | 20787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 2.0 | 14.7% | 42 |
| oog.melee.Capulet 1.2 | 2.0 | 14.8% | 39 |
| hadur117.micro.SaorOG1 0.1 | 2.2 | 14.4% | 84 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.5% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.8% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.5 | 16 / 35 | 3982 |
| 2 | 2 | 61.2 | 66.3 | 13 / 35 | 3150 |
| 3 | 1 | 62.8 | 67.0 | 13 / 35 | 3830 |
| 4 | 2 | 63.0 | 71.7 | 14 / 35 | 3303 |
| 5 | 4 | 60.0 | 61.0 | 11 / 35 | 3317 |
| 6 | 3 | 62.8 | 69.5 | 17 / 35 | 3205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 83% |
| kawigi.micro.Shiz 1.1 | 31 | 77% |
| yagami.Tidus 0.11 | 16 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 93% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 126 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 40% | 76 |
| yagami.Tidus 0.11 | 30 | 24% | 46 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 28 |
| ejb.Polaris 1.0.1 | 12 | 10% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 7% | 30 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.4 | 95 / 210 | 3.48 | 15.0% | 20583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.0% | 95 |
| wee.Gem 1.8.4 | 2.0 | 13.5% | 44 |
| bzdp.Pansy 2.1 | 3.5 | 12.3% | 23 |
| wompi.Quokka 1.6 | 3.7 | 12.0% | 22 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 14 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 68.3 | 14 / 35 | 3353 |
| 2 | 1 | 65.2 | 83.2 | 19 / 35 | 3344 |
| 3 | 1 | 61.2 | 69.5 | 16 / 35 | 3176 |
| 4 | 1 | 63.7 | 77.1 | 18 / 35 | 3445 |
| 5 | 1 | 62.7 | 71.1 | 18 / 35 | 3519 |
| 6 | 2 | 60.6 | 65.4 | 10 / 35 | 3746 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 39 | 74% |
| bzdp.Pansy 2.1 | 38 | 87% |
| wompi.Quokka 1.6 | 21 | 81% |
| ratosh.Nobo 0.21 | 8 | 100% |
| m3thos.Eva00 1.1 | 7 | 71% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 26 | 23% | 56 |
| wompi.Quokka 1.6 | 16 | 14% | 25 |
| bzdp.Pansy 2.1 | 15 | 13% | 43 |
| bayen.UbaMicro 1.4 | 14 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 11% | 15 |
| m3thos.Eva00 1.1 | 12 | 10% | 19 |
| maribo.FollowFire 1 | 9 | 8% | 10 |
| ratosh.Nobo 0.21 | 6 | 5% | 15 |
| stelo.MyAgileRobot 0.2 | 4 | 3% | 7 |

## Melee bench: F15

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 80.8 | 30 / 210 | 2.72 | 18.6% | 43931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.2% | 160 |
| hadur117.micro.SaorOG1 0.1 | 2.0 | 18.6% | 30 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 13 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.2% | 4 |
| ayk.WallHugger 1.0 | 5.5 | 8.6% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 7.5% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.2 | 84.1 | 8 / 35 | 7024 |
| 2 | 2 | 68.9 | 76.5 | 3 / 35 | 7293 |
| 3 | 2 | 69.8 | 82.5 | 4 / 35 | 7351 |
| 4 | 2 | 70.0 | 80.3 | 5 / 35 | 7511 |
| 5 | 2 | 70.3 | 80.6 | 5 / 35 | 7587 |
| 6 | 2 | 69.1 | 81.0 | 5 / 35 | 7165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 7% |
| mz.NanoGod 2.02 | 16 | 81% |
| exauge.GateKeeper 1.1.121g | 5 | 60% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 130 | 72% | 137 |
| mz.NanoGod 2.02 | 25 | 14% | 42 |
| exauge.GateKeeper 1.1.121g | 9 | 5% | 10 |
| stuff.Vlad 0.1 | 7 | 4% | 8 |
| ayk.WallHugger 1.0 | 4 | 2% | 5 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |
| drd.Dreadknoght 0.9 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 67.0 | 82 / 210 | 3.97 | 14.3% | 21617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.5 | 14.3% | 82 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.9% | 38 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.2% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 12.1% | 23 |
| bvh.micro.Freya 0.3 | 4.0 | 12.0% | 16 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.7% | 6 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 17 |
| dl.BetterWalls 1.0 | 8.8 | 6.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 73.7 | 18 / 35 | 3519 |
| 2 | 2 | 59.6 | 64.8 | 14 / 35 | 3186 |
| 3 | 2 | 59.6 | 64.4 | 12 / 35 | 3317 |
| 4 | 2 | 60.7 | 65.4 | 12 / 35 | 3894 |
| 5 | 1 | 62.7 | 71.7 | 15 / 35 | 3779 |
| 6 | 1 | 60.4 | 61.9 | 11 / 35 | 3922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 62% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 86% |
| dummy.micro.Sparrow 2.5 | 20 | 90% |
| bvh.micro.Freya 0.3 | 14 | 93% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 27% | 57 |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 22% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 12% | 14 |
| bvh.micro.Freya 0.3 | 14 | 11% | 18 |
| dummy.micro.Sparrow 2.5 | 12 | 9% | 37 |
| conscience.Electron 1.3g | 9 | 7% | 11 |
| dl.BetterWalls 1.0 | 8 | 6% | 10 |
| stelo.MirrorMicro 1.0 | 8 | 6% | 8 |

## Melee bench: F17

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 76.2 | 103 / 210 | 3.14 | 18.1% | 34662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 18.1% | 103 |
| sheldor.melee.nano.TestMelee 0.1 | 1.8 | 16.5% | 40 |
| sul.Lunar 1.1 | 3.3 | 12.0% | 25 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.2% | 16 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.3% | 8 |
| sample.Corners 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 74.6 | 16 / 35 | 6355 |
| 2 | 1 | 66.1 | 74.0 | 16 / 35 | 5287 |
| 3 | 1 | 67.4 | 76.5 | 16 / 35 | 5681 |
| 4 | 1 | 67.6 | 77.1 | 20 / 35 | 5627 |
| 5 | 2 | 67.3 | 74.6 | 14 / 35 | 5893 |
| 6 | 1 | 69.0 | 80.6 | 21 / 35 | 5819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 43 | 84% |
| sul.Lunar 1.1 | 29 | 100% |
| supersample.SuperBoxBot 1.0 | 20 | 75% |
| sample.MyFirstRobot 1.0 | 11 | 73% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| dsw.StaticD 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 39 | 36% | 81 |
| supersample.SuperBoxBot 1.0 | 28 | 26% | 37 |
| mme.NikeEnhanced 2.0 | 10 | 9% | 15 |
| dsw.StaticD 1.0 | 9 | 8% | 14 |
| sul.Lunar 1.1 | 8 | 7% | 39 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 10 |
| sample.Corners 1.0 | 4 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.7 | 77 / 210 | 3.54 | 15.8% | 31591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG1 0.1 | 1.2 | 15.8% | 77 |
| radnor.DoctorBob 1.42 | 1.8 | 14.4% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.9% | 30 |
| mld.Wisdom 1.0 | 3.7 | 12.0% | 17 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 10 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 11 |
| sample.Walls 1.0 | 7.0 | 8.4% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 7.2% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 72.7 | 11 / 35 | 5321 |
| 2 | 1 | 65.0 | 73.0 | 14 / 35 | 5257 |
| 3 | 1 | 63.8 | 71.4 | 14 / 35 | 5341 |
| 4 | 2 | 61.6 | 64.1 | 12 / 35 | 4974 |
| 5 | 1 | 65.6 | 74.0 | 14 / 35 | 5906 |
| 6 | 1 | 63.8 | 75.2 | 12 / 35 | 4792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 35% |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 77% |
| mld.Wisdom 1.0 | 14 | 86% |
| amz.NanoClone 1.41 | 10 | 50% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 60% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 50 | 37% | 64 |
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 28% | 69 |
| KiraNL.Chupacabra 0.4 | 15 | 11% | 18 |
| mld.Wisdom 1.0 | 11 | 8% | 24 |
| amz.NanoClone 1.41 | 9 | 7% | 14 |
| jangs.ns51 1.0 | 6 | 4% | 10 |
| sample.Walls 1.0 | 3 | 2% | 6 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |

