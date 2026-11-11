# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.8 | 139 / 210 | 2.10 | 21.2% | 43320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.2% | 139 |
| radnor.DoctorBob 1.42 | 2.5 | 14.6% | 27 |
| mz.AntiGrav 1.0 | 2.8 | 13.5% | 14 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 10 |
| GarmBox.Oranges 1.0 | 6.8 | 6.7% | 0 |
| sample.Walls 1.0 | 6.8 | 6.4% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 83.5 | 24 / 35 | 7014 |
| 2 | 1 | 72.2 | 90.5 | 23 / 35 | 7270 |
| 3 | 1 | 70.7 | 82.9 | 22 / 35 | 7044 |
| 4 | 1 | 72.7 | 91.1 | 22 / 35 | 7357 |
| 5 | 1 | 72.8 | 87.6 | 22 / 35 | 7504 |
| 6 | 1 | 72.6 | 91.4 | 26 / 35 | 7131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 93% |
| mld.Infinity 2.2 | 41 | 93% |
| radnor.DoctorBob 1.42 | 31 | 81% |
| amz.NanoClone 1.41 | 8 | 50% |
| jangs.ns51 1.0 | 6 | 83% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 37% | 60 |
| mz.AntiGrav 1.0 | 20 | 28% | 68 |
| mld.Infinity 2.2 | 10 | 14% | 46 |
| amz.NanoClone 1.41 | 8 | 11% | 11 |
| jangs.ns51 1.0 | 4 | 6% | 8 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 5 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.2 | 104 / 210 | 2.78 | 18.0% | 33959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.3 | 18.0% | 104 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.2% | 64 |
| mld.DustBunny 3.8 | 3.5 | 13.4% | 17 |
| maribo.melee.BMV 0.1 | 4.5 | 10.1% | 6 |
| zyx.nano.Ant 1.1 | 5.7 | 8.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.2% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.2% | 9 |
| bzdp.BoxCar 2.0 | 7.8 | 7.2% | 2 |
| fullsail.SweetTea 1.1 | 8.0 | 6.4% | 3 |
| cs.Grudge 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.2 | 22 / 35 | 5443 |
| 2 | 1 | 68.4 | 83.2 | 16 / 35 | 5920 |
| 3 | 1 | 70.9 | 90.2 | 22 / 35 | 6480 |
| 4 | 1 | 68.1 | 82.2 | 17 / 35 | 6216 |
| 5 | 1 | 68.4 | 84.1 | 19 / 35 | 5503 |
| 6 | 3 | 57.6 | 51.4 | 8 / 35 | 4397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 65% |
| mld.DustBunny 3.8 | 55 | 85% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| maribo.melee.BMV 0.1 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 37% | 82 |
| mld.DustBunny 3.8 | 25 | 24% | 66 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 11% | 17 |
| maribo.melee.BMV 0.1 | 10 | 9% | 14 |
| cs.Grudge 1.0 | 9 | 8% | 9 |
| zyx.nano.Ant 1.1 | 6 | 6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.3 | 132 / 210 | 2.50 | 20.1% | 37899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.1% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 15 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.5% | 19 |
| fm.mammillarias 1.3 | 6.2 | 8.8% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 3 |
| sample.Fire 1.0 | 9.3 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 82.9 | 26 / 35 | 6551 |
| 2 | 1 | 71.4 | 87.3 | 24 / 35 | 6836 |
| 3 | 1 | 70.1 | 84.1 | 22 / 35 | 5894 |
| 4 | 1 | 70.8 | 84.8 | 22 / 35 | 6688 |
| 5 | 1 | 68.3 | 80.3 | 17 / 35 | 5589 |
| 6 | 1 | 69.7 | 80.6 | 21 / 35 | 6341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 96% |
| cb.nano.Insomnia 1.0 | 29 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 73% |
| myl.nano.KomoriNinja 1.1 | 17 | 82% |
| fm.mammillarias 1.3 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 22 | 28% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 33 |
| myl.micro.Troodon 1.10 | 12 | 15% | 68 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 29 |
| sp.Nanos.Ember 1.1 | 7 | 9% | 20 |
| fm.mammillarias 1.3 | 7 | 9% | 15 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 11 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.4 | 136 / 210 | 2.68 | 20.0% | 40653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.0% | 136 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.7% | 22 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.0% | 21 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.4% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 7 |
| yk.JahMicro 1.0 | 6.8 | 8.4% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 83.8 | 25 / 35 | 7078 |
| 2 | 1 | 71.7 | 87.6 | 26 / 35 | 7471 |
| 3 | 1 | 68.9 | 79.7 | 22 / 35 | 6502 |
| 4 | 1 | 69.6 | 79.7 | 24 / 35 | 6620 |
| 5 | 1 | 69.4 | 81.6 | 21 / 35 | 6734 |
| 6 | 1 | 67.7 | 75.9 | 18 / 35 | 6248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 46 | 89% |
| stelo.SoJNanoMelee 1.1 | 29 | 93% |
| tvv.micro.Antares 1.1.1 | 26 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 100% |
| tj.zombie1n 1.0.1 | 14 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 38 | 51% | 86 |
| tvv.micro.Antares 1.1.1 | 12 | 16% | 32 |
| stelo.SoJNanoMelee 1.1 | 12 | 16% | 30 |
| yk.JahMicro 1.0 | 4 | 5% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 10 |
| tj.zombie1n 1.0.1 | 2 | 3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 20 |
| repositorio.NanoStep 1.0 | 1 | 1% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 70.5 | 96 / 210 | 3.65 | 16.7% | 31851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.7% | 96 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 31 |
| ahf.NanoAndrew .4 | 2.8 | 11.8% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.8% | 22 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 5 |
| sam.Samspin 1.0 | 6.2 | 9.5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.3% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 67.0 | 14 / 35 | 5307 |
| 2 | 1 | 65.0 | 74.3 | 16 / 35 | 4986 |
| 3 | 1 | 67.9 | 78.1 | 19 / 35 | 5830 |
| 4 | 1 | 66.1 | 72.4 | 18 / 35 | 5607 |
| 5 | 1 | 64.0 | 67.0 | 15 / 35 | 5319 |
| 6 | 1 | 62.9 | 64.4 | 14 / 35 | 4802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 89% |
| oog.melee.Corsair 1.0 | 30 | 63% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 13 | 100% |
| sam.Samspin 1.0 | 11 | 73% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 22% | 51 |
| oog.melee.Corsair 1.0 | 23 | 20% | 47 |
| EBBU.Sim2 1.02 | 14 | 12% | 23 |
| ahf.NanoAndrew .4 | 12 | 10% | 29 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 20 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 7 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.8 | 145 / 210 | 1.92 | 20.3% | 35130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.3% | 145 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 5 |
| fm.claire 1.7 | 6.0 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 7.8% | 5 |
| sample.SpinBot 1.0 | 8.2 | 6.2% | 0 |
| pa.Improved 1.0 | 8.8 | 6.0% | 0 |
| kurios.DOSexe .9b | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 24 / 35 | 4908 |
| 2 | 1 | 70.9 | 92.7 | 26 / 35 | 5733 |
| 3 | 1 | 69.3 | 82.5 | 21 / 35 | 6146 |
| 4 | 1 | 71.5 | 92.4 | 25 / 35 | 6294 |
| 5 | 1 | 70.6 | 91.7 | 27 / 35 | 5634 |
| 6 | 1 | 71.0 | 90.5 | 22 / 35 | 6415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 84% |
| oog.melee.CapuletDroid 1.1 | 36 | 97% |
| gh.nano.Grofvuil 0.2 | 18 | 89% |
| arthord.NanoSatanMelee Beta | 12 | 75% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 5 | 80% |
| sample.SpinBot 1.0 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 45% | 84 |
| gh.nano.Grofvuil 0.2 | 13 | 20% | 32 |
| oog.melee.CapuletDroid 1.1 | 6 | 9% | 43 |
| arthord.NanoSatanMelee Beta | 5 | 8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 14 |
| fm.claire 1.7 | 4 | 6% | 9 |
| kurios.DOSexe .9b | 2 | 3% | 8 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| sample.SpinBot 1.0 | 1 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.5 | 115 / 210 | 2.40 | 19.0% | 35638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.0% | 115 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.7% | 24 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.9% | 32 |
| mz.MicroGodMelee 1 | 4.0 | 12.3% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.0 | 6.8% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.4% | 1 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.6 | 15 / 35 | 5219 |
| 2 | 1 | 71.2 | 87.3 | 20 / 35 | 6897 |
| 3 | 1 | 70.2 | 88.6 | 22 / 35 | 6431 |
| 4 | 1 | 66.4 | 77.1 | 15 / 35 | 5317 |
| 5 | 1 | 70.5 | 89.8 | 23 / 35 | 5917 |
| 6 | 1 | 69.7 | 89.5 | 20 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 72 | 86% |
| gh.micro.Gruweltje 0.7 | 30 | 63% |
| mz.MicroGodMelee 1 | 28 | 71% |
| el.JumpShoot 0.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |

Hadur died in 96 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 28 | 29% | 56 |
| spinnercat.micro.Tyger 0.1 | 25 | 26% | 75 |
| mz.MicroGodMelee 1 | 23 | 24% | 43 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 10 |
| DBall.Anarchy 0.1 | 4 | 4% | 10 |
| el.JumpShoot 0.2 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 68.0 | 100 / 210 | 3.88 | 16.1% | 30784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 16.1% | 100 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.4% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.8% | 32 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 7 |
| germ.TheMind .2 | 5.3 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.6% | 10 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.1 | 19 / 35 | 5148 |
| 2 | 2 | 58.8 | 53.7 | 12 / 35 | 4510 |
| 3 | 1 | 64.7 | 67.6 | 13 / 35 | 5533 |
| 4 | 1 | 64.6 | 69.5 | 17 / 35 | 5139 |
| 5 | 1 | 67.3 | 78.1 | 21 / 35 | 5516 |
| 6 | 1 | 64.1 | 67.3 | 18 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 100% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| awesomeness.Elite 1.0 | 7 | 86% |
| germ.TheMind .2 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |
| sample.Crazy 1.0 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 39% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 20% | 40 |
| awesomeness.Elite 1.0 | 12 | 11% | 19 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 10 |
| germ.TheMind .2 | 5 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.0 | 150 / 210 | 1.99 | 20.5% | 33707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.5% | 150 |
| rz.HawkOnFire 0.1 | 2.2 | 13.3% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 5 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.3% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.0 | 7.5% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.5 | 22 / 35 | 4976 |
| 2 | 1 | 72.0 | 91.4 | 28 / 35 | 5757 |
| 3 | 1 | 71.5 | 87.6 | 25 / 35 | 5847 |
| 4 | 1 | 71.8 | 89.5 | 28 / 35 | 6070 |
| 5 | 1 | 71.8 | 93.7 | 26 / 35 | 5551 |
| 6 | 1 | 70.4 | 89.5 | 21 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 73 | 96% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| maribo.IotaCT 1.1 | 16 | 88% |
| stelo.PatternRobot 1.0 | 14 | 79% |
| timmit.nano.TimDog 0.33 | 14 | 71% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 17 | 28% | 33 |
| stelo.PatternRobot 1.0 | 12 | 20% | 21 |
| rz.HawkOnFire 0.1 | 10 | 17% | 64 |
| maribo.IotaCT 1.1 | 7 | 12% | 21 |
| ratosh.Wesco 1.4 | 5 | 8% | 10 |
| nz.jdc.nano.GridFu 1.0 | 4 | 7% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 6 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.6 | 157 / 210 | 2.03 | 21.1% | 40427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.1% | 157 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.3% | 20 |
| baal.nano.N 1.42 | 2.5 | 12.2% | 12 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.4% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 7.8% | 1 |
| cvt.Firsty 1.0 | 7.2 | 7.9% | 7 |
| sanja.First 0.1 | 7.2 | 7.7% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.5% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 82.2 | 23 / 35 | 6351 |
| 2 | 1 | 70.3 | 86.3 | 24 / 35 | 6496 |
| 3 | 1 | 71.0 | 90.5 | 26 / 35 | 6595 |
| 4 | 1 | 73.9 | 97.8 | 32 / 35 | 7330 |
| 5 | 1 | 72.6 | 94.0 | 31 / 35 | 7050 |
| 6 | 1 | 68.9 | 80.6 | 21 / 35 | 6605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 90% |
| tvv.nano.Polaris 1.2 | 41 | 88% |
| cvt.Firsty 1.0 | 26 | 92% |
| zyx.micro.Ant 1.1 | 20 | 95% |
| sanja.First 0.1 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 93% |
| Grystrion.TrackerWO 1.0 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 22% | 39 |
| tvv.nano.Polaris 1.2 | 11 | 20% | 60 |
| baal.nano.N 1.42 | 10 | 19% | 47 |
| Grystrion.TrackerWO 1.0 | 9 | 17% | 15 |
| cvt.Firsty 1.0 | 4 | 7% | 22 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 1 |
| sanja.First 0.1 | 1 | 2% | 11 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 66.8 | 88 / 210 | 3.99 | 15.8% | 33765 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.2 | 15.8% | 88 |
| kc.micro.Figment 1.0 | 2.0 | 14.4% | 55 |
| cs.Wren 1.0 | 3.3 | 12.7% | 24 |
| mz.Cork 0.1 | 4.0 | 11.2% | 13 |
| js.PinBall 1.6 | 4.5 | 10.9% | 16 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 6 |
| evd.X1 0.01 | 6.8 | 8.0% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.0% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 67.9 | 15 / 35 | 6040 |
| 2 | 1 | 63.3 | 65.4 | 14 / 35 | 5628 |
| 3 | 1 | 64.8 | 69.5 | 17 / 35 | 5524 |
| 4 | 2 | 57.3 | 53.0 | 10 / 35 | 4673 |
| 5 | 1 | 66.7 | 74.6 | 16 / 35 | 6295 |
| 6 | 1 | 64.5 | 70.2 | 16 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 72% |
| cs.Wren 1.0 | 23 | 87% |
| mz.Cork 0.1 | 15 | 93% |
| js.PinBall 1.6 | 12 | 58% |
| joe.ADinosaur 1.0 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 40% | 93 |
| js.PinBall 1.6 | 17 | 14% | 24 |
| mz.Cork 0.1 | 14 | 11% | 23 |
| evd.X1 0.01 | 12 | 10% | 13 |
| cs.Wren 1.0 | 11 | 9% | 26 |
| joe.ADinosaur 1.0 | 10 | 8% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.9 | 127 / 210 | 2.54 | 18.8% | 30766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.8% | 127 |
| myl.nano.Graviton 1.10 | 2.5 | 11.6% | 29 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.3% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.7% | 12 |
| disan.Chair 2.2.0 | 7.2 | 8.7% | 8 |
| DBall.NUKE 0.1 | 7.5 | 7.8% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 84.8 | 24 / 35 | 5543 |
| 2 | 1 | 67.9 | 80.0 | 21 / 35 | 5080 |
| 3 | 1 | 69.0 | 84.4 | 23 / 35 | 5342 |
| 4 | 1 | 67.0 | 80.3 | 21 / 35 | 4916 |
| 5 | 1 | 66.8 | 82.5 | 18 / 35 | 4732 |
| 6 | 1 | 68.2 | 85.4 | 20 / 35 | 5153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 91% |
| myl.nano.Graviton 1.10 | 31 | 100% |
| ntc.Opposite 1.5 | 17 | 88% |
| disan.Chair 2.2.0 | 16 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| DBall.NUKE 0.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 67% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 20% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 20% | 31 |
| pfvicm.Sobieski 7.2.3b | 13 | 15% | 19 |
| myl.nano.Graviton 1.10 | 12 | 14% | 44 |
| ntc.Opposite 1.5 | 11 | 13% | 27 |
| disan.Chair 2.2.0 | 7 | 8% | 17 |
| DBall.NUKE 0.1 | 5 | 6% | 14 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.7 | 91 / 210 | 3.19 | 16.5% | 27037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.5% | 91 |
| oog.melee.Capulet 1.2 | 2.8 | 14.0% | 51 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.1% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 23 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 10 |
| ejb.Polaris 1.0.1 | 5.5 | 10.6% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.1 | 11 / 35 | 4739 |
| 2 | 1 | 65.5 | 72.4 | 12 / 35 | 4800 |
| 3 | 1 | 67.5 | 82.2 | 20 / 35 | 4444 |
| 4 | 1 | 65.2 | 74.0 | 17 / 35 | 4245 |
| 5 | 1 | 66.5 | 77.8 | 19 / 35 | 4411 |
| 6 | 1 | 64.1 | 69.5 | 12 / 35 | 4398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 77% |
| yagami.Tidus 0.11 | 24 | 96% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| ejb.Polaris 1.0.1 | 4 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 39% | 67 |
| yagami.Tidus 0.11 | 17 | 14% | 40 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 39 |
| ejb.Polaris 1.0.1 | 11 | 9% | 16 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| step.nanoPri 1.0 | 5 | 4% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.6 | 126 / 210 | 2.92 | 17.6% | 28754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.6% | 126 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 20 |
| wee.Gem 1.8.4 | 3.0 | 11.9% | 28 |
| ratosh.Nobo 0.21 | 4.3 | 10.9% | 12 |
| wompi.Quokka 1.6 | 4.5 | 10.8% | 12 |
| m3thos.Eva00 1.1 | 5.3 | 10.2% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 26 / 35 | 5154 |
| 2 | 1 | 67.6 | 80.0 | 22 / 35 | 5141 |
| 3 | 1 | 65.0 | 75.2 | 19 / 35 | 4412 |
| 4 | 1 | 64.9 | 74.0 | 20 / 35 | 4603 |
| 5 | 1 | 68.8 | 87.6 | 23 / 35 | 4932 |
| 6 | 1 | 63.2 | 69.2 | 16 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 95% |
| wee.Gem 1.8.4 | 25 | 92% |
| ratosh.Nobo 0.21 | 20 | 85% |
| m3thos.Eva00 1.1 | 15 | 93% |
| wompi.Quokka 1.6 | 13 | 92% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 16 | 19% | 22 |
| bzdp.Pansy 2.1 | 13 | 15% | 51 |
| ratosh.Nobo 0.21 | 12 | 14% | 30 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 11% | 12 |
| wee.Gem 1.8.4 | 8 | 10% | 38 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 9 |
| m3thos.Eva00 1.1 | 7 | 8% | 22 |
| wompi.Quokka 1.6 | 6 | 7% | 18 |
| maribo.FollowFire 1 | 5 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 88.4 | 136 / 210 | 2.05 | 22.3% | 50895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.3% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 15 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 3 |
| stuff.Vlad 0.1 | 5.2 | 9.0% | 0 |
| ayk.WallHugger 1.0 | 5.3 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 87.9 | 24 / 35 | 8574 |
| 2 | 1 | 74.8 | 91.7 | 23 / 35 | 8984 |
| 3 | 1 | 72.7 | 84.8 | 22 / 35 | 7829 |
| 4 | 1 | 73.0 | 86.0 | 21 / 35 | 8512 |
| 5 | 1 | 73.2 | 91.4 | 23 / 35 | 8010 |
| 6 | 1 | 74.2 | 88.3 | 23 / 35 | 8986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 81% |
| mz.NanoGod 2.02 | 23 | 74% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 43% | 134 |
| mz.NanoGod 2.02 | 19 | 25% | 38 |
| exauge.GateKeeper 1.1.121g | 13 | 17% | 21 |
| ayk.WallHugger 1.0 | 8 | 11% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.0 | 109 / 210 | 3.43 | 16.8% | 29589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.8% | 109 |
| dummy.micro.Sparrow 2.5 | 2.2 | 13.4% | 36 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.6% | 15 |
| bvh.micro.Freya 0.3 | 4.2 | 11.4% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 20 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.6% | 2 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.5% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 23 / 35 | 5368 |
| 2 | 1 | 64.4 | 70.8 | 14 / 35 | 5000 |
| 3 | 1 | 65.3 | 74.3 | 18 / 35 | 4813 |
| 4 | 1 | 68.5 | 81.3 | 22 / 35 | 5707 |
| 5 | 1 | 64.2 | 69.5 | 18 / 35 | 4963 |
| 6 | 1 | 58.9 | 58.7 | 14 / 35 | 3738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| dummy.micro.Sparrow 2.5 | 30 | 90% |
| bvh.micro.Freya 0.3 | 25 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 67% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 22% | 37 |
| voidious.micro.BlitzBat 1.05 | 17 | 17% | 56 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 43 |
| conscience.Electron 1.3g | 13 | 13% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 12 |
| bvh.micro.Freya 0.3 | 12 | 12% | 26 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 12 |
| dl.BetterWalls 1.0 | 5 | 5% | 6 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 80.8 | 133 / 210 | 2.72 | 20.5% | 43149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.5% | 133 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 24 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.4% | 22 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.3% | 6 |
| dsw.StaticD 1.0 | 6.2 | 8.4% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.6% | 3 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.7% | 3 |
| sample.Corners 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 84.8 | 22 / 35 | 7723 |
| 2 | 1 | 72.6 | 88.3 | 27 / 35 | 7678 |
| 3 | 1 | 72.1 | 87.0 | 24 / 35 | 7369 |
| 4 | 1 | 67.0 | 70.2 | 19 / 35 | 6236 |
| 5 | 1 | 69.3 | 74.3 | 19 / 35 | 7026 |
| 6 | 1 | 70.5 | 80.6 | 22 / 35 | 7117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 95% |
| supersample.SuperBoxBot 1.0 | 21 | 76% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 10 | 40% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 32% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 21% | 62 |
| dsw.StaticD 1.0 | 13 | 17% | 20 |
| sul.Lunar 1.1 | 8 | 10% | 57 |
| mme.NikeEnhanced 2.0 | 5 | 6% | 9 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| sample.Corners 1.0 | 2 | 3% | 4 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.1 | 124 / 210 | 2.52 | 19.7% | 41502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.7% | 124 |
| radnor.DoctorBob 1.42 | 2.5 | 12.6% | 19 |
| mld.Wisdom 1.0 | 3.0 | 12.6% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.1% | 17 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.3% | 11 |
| amz.NanoClone 1.41 | 5.8 | 9.2% | 1 |
| sample.Walls 1.0 | 7.5 | 7.7% | 6 |
| GarmBox.Oranges 1.0 | 7.7 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 86.3 | 20 / 35 | 7463 |
| 2 | 1 | 70.2 | 82.5 | 23 / 35 | 7095 |
| 3 | 1 | 68.9 | 82.5 | 20 / 35 | 6858 |
| 4 | 1 | 68.2 | 80.3 | 18 / 35 | 6602 |
| 5 | 1 | 69.0 | 81.9 | 21 / 35 | 6594 |
| 6 | 1 | 69.9 | 85.1 | 22 / 35 | 6890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 94% |
| radnor.DoctorBob 1.42 | 45 | 76% |
| mld.Wisdom 1.0 | 27 | 67% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| jangs.ns51 1.0 | 10 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 31% | 45 |
| radnor.DoctorBob 1.42 | 20 | 23% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 19% | 56 |
| KiraNL.Chupacabra 0.4 | 10 | 12% | 23 |
| amz.NanoClone 1.41 | 6 | 7% | 9 |
| GarmBox.Oranges 1.0 | 4 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 8 |
| sample.Walls 1.0 | 1 | 1% | 6 |

