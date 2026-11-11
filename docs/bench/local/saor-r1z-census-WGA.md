# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 85.8 | 142 / 210 | 2.28 | 21.4% | 44751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.4% | 142 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 30 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 18 |
| mld.Infinity 2.2 | 3.8 | 12.0% | 12 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 3 |
| sample.Walls 1.0 | 6.5 | 7.2% | 3 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 86.7 | 25 / 35 | 7671 |
| 2 | 1 | 72.2 | 86.3 | 21 / 35 | 7555 |
| 3 | 1 | 71.5 | 82.5 | 23 / 35 | 7215 |
| 4 | 1 | 72.2 | 87.9 | 23 / 35 | 7313 |
| 5 | 1 | 70.9 | 83.5 | 22 / 35 | 6801 |
| 6 | 1 | 73.6 | 87.6 | 28 / 35 | 8196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 96% |
| radnor.DoctorBob 1.42 | 41 | 66% |
| mld.Infinity 2.2 | 29 | 93% |
| jangs.ns51 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 44% | 66 |
| mz.AntiGrav 1.0 | 16 | 24% | 72 |
| mld.Infinity 2.2 | 8 | 12% | 36 |
| amz.NanoClone 1.41 | 6 | 9% | 15 |
| jangs.ns51 1.0 | 4 | 6% | 8 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |
| sample.Walls 1.0 | 1 | 1% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 139 / 210 | 2.07 | 19.6% | 34409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.6% | 139 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 50 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 7 |
| maribo.melee.BMV 0.1 | 3.7 | 10.9% | 5 |
| zyx.nano.Ant 1.1 | 4.8 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 6.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.4% | 3 |
| fullsail.SweetTea 1.1 | 7.5 | 7.2% | 3 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.3 | 22 / 35 | 5443 |
| 2 | 1 | 69.4 | 85.4 | 23 / 35 | 6109 |
| 3 | 1 | 68.4 | 85.4 | 21 / 35 | 5787 |
| 4 | 1 | 70.2 | 89.2 | 28 / 35 | 5621 |
| 5 | 1 | 69.1 | 90.2 | 19 / 35 | 5533 |
| 6 | 1 | 71.0 | 91.1 | 26 / 35 | 5916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 77 | 71% |
| mld.DustBunny 3.8 | 64 | 94% |
| maribo.melee.BMV 0.1 | 12 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 43% | 88 |
| mld.DustBunny 3.8 | 12 | 17% | 66 |
| maribo.melee.BMV 0.1 | 7 | 10% | 16 |
| zyx.nano.Ant 1.1 | 7 | 10% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 10 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 7 |
| fullsail.SweetTea 1.1 | 3 | 4% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 85.6 | 145 / 210 | 2.30 | 20.6% | 38530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.6% | 145 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 19 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.2% | 6 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 4 |
| sample.Tracker 1.0 | 9.2 | 4.9% | 0 |
| sample.Fire 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 85.4 | 23 / 35 | 6543 |
| 2 | 1 | 71.6 | 89.2 | 27 / 35 | 6362 |
| 3 | 1 | 70.8 | 83.8 | 22 / 35 | 6706 |
| 4 | 1 | 71.1 | 84.4 | 27 / 35 | 6707 |
| 5 | 1 | 68.6 | 80.0 | 19 / 35 | 5835 |
| 6 | 1 | 71.9 | 90.8 | 27 / 35 | 6377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 63 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 85% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 23% | 34 |
| myl.micro.Troodon 1.10 | 14 | 21% | 78 |
| fm.mammillarias 1.3 | 11 | 17% | 16 |
| cb.nano.Insomnia 1.0 | 10 | 15% | 20 |
| sp.Nanos.Ember 1.1 | 7 | 11% | 13 |
| myl.nano.KomoriNinja 1.1 | 4 | 6% | 32 |
| sample.Fire 1.0 | 2 | 3% | 6 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.3 | 144 / 210 | 2.23 | 20.9% | 41649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.9% | 144 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.0% | 19 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.8% | 19 |
| tj.zombie1n 1.0.1 | 5.0 | 8.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.7% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.4% | 9 |
| yk.JahMicro 1.0 | 6.3 | 8.2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.7% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 86.0 | 26 / 35 | 6879 |
| 2 | 1 | 69.8 | 82.5 | 24 / 35 | 6679 |
| 3 | 1 | 71.1 | 85.7 | 23 / 35 | 7093 |
| 4 | 1 | 71.2 | 87.3 | 22 / 35 | 7339 |
| 5 | 1 | 72.0 | 92.1 | 26 / 35 | 6976 |
| 6 | 1 | 70.5 | 84.1 | 23 / 35 | 6683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 90% |
| tvv.micro.Antares 1.1.1 | 32 | 84% |
| stelo.SoJNanoMelee 1.1 | 23 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 73% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 39% | 80 |
| tvv.micro.Antares 1.1.1 | 11 | 16% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 13% | 26 |
| stelo.SoJNanoMelee 1.1 | 7 | 10% | 19 |
| tj.zombie1n 1.0.1 | 5 | 7% | 12 |
| yk.JahMicro 1.0 | 4 | 6% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 7 |
| repositorio.NanoStep 1.0 | 1 | 1% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 8 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 70.1 | 90 / 210 | 3.70 | 16.6% | 31780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.6% | 90 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 37 |
| ahf.NanoAndrew .4 | 3.3 | 11.9% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.5% | 30 |
| EBBU.Sim2 1.02 | 5.5 | 10.0% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.4% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.5% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 68.6 | 15 / 35 | 5132 |
| 2 | 1 | 67.7 | 78.7 | 16 / 35 | 5954 |
| 3 | 1 | 65.0 | 69.8 | 17 / 35 | 5329 |
| 4 | 1 | 63.7 | 66.3 | 15 / 35 | 5081 |
| 5 | 1 | 60.9 | 59.0 | 12 / 35 | 4637 |
| 6 | 1 | 67.2 | 77.8 | 15 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 64% |
| simonton.nano.MeleeSeed 1.8 | 28 | 82% |
| ahf.NanoAndrew .4 | 22 | 77% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| EBBU.Sim2 1.02 | 11 | 82% |
| sam.Samspin 1.0 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 412. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 18% | 41 |
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 39 |
| EBBU.Sim2 1.02 | 20 | 17% | 27 |
| ahf.NanoAndrew .4 | 15 | 13% | 36 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 14 |
| robar.nano.Assertive_Melee 0.2 | 10 | 8% | 19 |
| sam.Samspin 1.0 | 4 | 3% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 141 / 210 | 2.12 | 19.7% | 33612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.7% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 9.8% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 5 |
| fm.claire 1.7 | 6.5 | 8.1% | 1 |
| pa.Improved 1.0 | 8.7 | 6.1% | 0 |
| sample.SpinBot 1.0 | 8.8 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.0 | 25 / 35 | 6115 |
| 2 | 1 | 70.0 | 91.4 | 23 / 35 | 5441 |
| 3 | 1 | 70.0 | 89.8 | 25 / 35 | 5631 |
| 4 | 1 | 68.9 | 81.9 | 23 / 35 | 5936 |
| 5 | 1 | 67.4 | 80.0 | 21 / 35 | 5287 |
| 6 | 1 | 69.3 | 87.9 | 24 / 35 | 5202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 86% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| oog.melee.CapuletDroid 1.1 | 22 | 91% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 36% | 89 |
| oog.melee.CapuletDroid 1.1 | 14 | 20% | 38 |
| gh.nano.Grofvuil 0.2 | 12 | 17% | 33 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 16 |
| sample.SpinBot 1.0 | 4 | 6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 16 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| fm.claire 1.7 | 2 | 3% | 3 |
| kurios.DOSexe .9b | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.5 | 95 / 210 | 2.84 | 18.0% | 35136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.0% | 95 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.9% | 34 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.6% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 13.6% | 39 |
| caimano.Furia_Ceca 0.22 | 5.5 | 7.8% | 1 |
| DBall.Anarchy 0.1 | 5.7 | 7.9% | 5 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.0 | 16 / 35 | 5720 |
| 2 | 1 | 67.6 | 79.0 | 20 / 35 | 5857 |
| 3 | 1 | 67.8 | 79.4 | 14 / 35 | 5863 |
| 4 | 1 | 65.9 | 75.6 | 12 / 35 | 5527 |
| 5 | 1 | 67.8 | 80.0 | 16 / 35 | 5743 |
| 6 | 1 | 69.4 | 83.2 | 17 / 35 | 6426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 86% |
| mz.MicroGodMelee 1 | 35 | 46% |
| gh.micro.Gruweltje 0.7 | 21 | 67% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 43 | 37% | 68 |
| gh.micro.Gruweltje 0.7 | 27 | 23% | 45 |
| spinnercat.micro.Tyger 0.1 | 26 | 23% | 62 |
| DBall.Anarchy 0.1 | 5 | 4% | 8 |
| acogdev.alpha 0.2 | 5 | 4% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 9 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 71.3 | 108 / 210 | 3.59 | 16.9% | 32347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.9% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 13.6% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.4% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.9% | 9 |
| germ.TheMind .2 | 5.3 | 9.4% | 8 |
| awesomeness.Elite 1.0 | 5.7 | 9.0% | 12 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 65.4 | 19 / 35 | 5220 |
| 2 | 1 | 67.1 | 77.1 | 21 / 35 | 5409 |
| 3 | 1 | 65.8 | 73.0 | 17 / 35 | 5448 |
| 4 | 1 | 66.3 | 73.3 | 17 / 35 | 5724 |
| 5 | 1 | 63.1 | 64.8 | 13 / 35 | 5149 |
| 6 | 1 | 66.5 | 74.0 | 21 / 35 | 5397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| germ.TheMind .2 | 8 | 100% |
| awesomeness.Elite 1.0 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 43% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 19% | 37 |
| awesomeness.Elite 1.0 | 9 | 9% | 19 |
| germ.TheMind .2 | 9 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 7 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.5 | 149 / 210 | 1.85 | 20.9% | 35295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.9% | 149 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.1% | 10 |
| maribo.IotaCT 1.1 | 4.5 | 10.3% | 9 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.3% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.8% | 0 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 8 |
| stelo.PatternRobot 1.0 | 7.5 | 8.2% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.3 | 29 / 35 | 5825 |
| 2 | 1 | 70.2 | 86.3 | 22 / 35 | 5986 |
| 3 | 1 | 72.3 | 94.0 | 27 / 35 | 5990 |
| 4 | 1 | 69.8 | 84.4 | 23 / 35 | 5468 |
| 5 | 1 | 72.6 | 95.6 | 26 / 35 | 6028 |
| 6 | 1 | 70.6 | 88.6 | 22 / 35 | 5998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 94% |
| nz.jdc.nano.GridFu 1.0 | 34 | 94% |
| timmit.nano.TimDog 0.33 | 14 | 64% |
| maribo.IotaCT 1.1 | 13 | 85% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 30% | 73 |
| timmit.nano.TimDog 0.33 | 12 | 20% | 24 |
| stelo.PatternRobot 1.0 | 7 | 11% | 14 |
| nz.jdc.nano.GridFu 1.0 | 6 | 10% | 49 |
| ratosh.Wesco 1.4 | 6 | 10% | 13 |
| maribo.IotaCT 1.1 | 5 | 8% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 11 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 91.6 | 167 / 210 | 1.76 | 22.0% | 42388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.0% | 167 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.6% | 11 |
| baal.nano.N 1.42 | 3.0 | 11.6% | 11 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.0 | 9.2% | 9 |
| sanja.First 0.1 | 6.3 | 8.6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 5 |
| sample.RamFire 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 92.1 | 27 / 35 | 7575 |
| 2 | 1 | 73.7 | 97.5 | 33 / 35 | 7412 |
| 3 | 1 | 71.9 | 92.7 | 27 / 35 | 7089 |
| 4 | 1 | 71.3 | 89.2 | 26 / 35 | 6737 |
| 5 | 1 | 71.8 | 89.8 | 26 / 35 | 7016 |
| 6 | 1 | 71.0 | 88.3 | 28 / 35 | 6559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 40 | 85% |
| tvv.nano.Polaris 1.2 | 36 | 92% |
| cvt.Firsty 1.0 | 28 | 93% |
| Grystrion.TrackerWO 1.0 | 23 | 96% |
| sanja.First 0.1 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 16 | 88% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 30% | 36 |
| tvv.nano.Polaris 1.2 | 9 | 21% | 53 |
| baal.nano.N 1.42 | 8 | 19% | 36 |
| sanja.First 0.1 | 4 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 16 |
| cvt.Firsty 1.0 | 2 | 5% | 26 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 8 |
| sample.RamFire 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.0 | 79 / 210 | 3.79 | 16.0% | 33644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.0% | 79 |
| kc.micro.Figment 1.0 | 2.2 | 14.4% | 66 |
| cs.Wren 1.0 | 2.8 | 13.1% | 26 |
| js.PinBall 1.6 | 4.2 | 11.4% | 12 |
| mz.Cork 0.1 | 4.8 | 10.4% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.7% | 6 |
| evd.X1 0.01 | 7.0 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 60.6 | 9 / 35 | 5588 |
| 2 | 1 | 66.4 | 77.5 | 16 / 35 | 5553 |
| 3 | 1 | 66.0 | 75.6 | 16 / 35 | 5728 |
| 4 | 1 | 64.3 | 68.6 | 14 / 35 | 5521 |
| 5 | 1 | 63.2 | 64.8 | 11 / 35 | 5687 |
| 6 | 1 | 63.4 | 67.0 | 13 / 35 | 5567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 57% |
| cs.Wren 1.0 | 31 | 81% |
| js.PinBall 1.6 | 8 | 100% |
| mz.Cork 0.1 | 7 | 86% |
| jsal.Jsalbot 1.0 | 7 | 57% |
| donjezza.Jezza 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 65 | 50% | 102 |
| cs.Wren 1.0 | 18 | 14% | 31 |
| evd.X1 0.01 | 14 | 11% | 16 |
| joe.ADinosaur 1.0 | 9 | 7% | 14 |
| mz.Cork 0.1 | 8 | 6% | 15 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 5 | 4% | 7 |
| js.PinBall 1.6 | 3 | 2% | 11 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.1 | 144 / 210 | 2.16 | 20.1% | 32494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.1% | 144 |
| myl.nano.Graviton 1.10 | 2.3 | 12.6% | 26 |
| ntc.Opposite 1.5 | 3.2 | 10.9% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.2% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.6% | 11 |
| stelo.AreaTargetingBot 1.1 | 5.7 | 9.0% | 6 |
| DBall.NUKE 0.1 | 6.8 | 8.2% | 3 |
| disan.Chair 2.2.0 | 7.3 | 8.0% | 2 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 20 / 35 | 4717 |
| 2 | 1 | 71.2 | 89.5 | 27 / 35 | 5756 |
| 3 | 1 | 69.9 | 88.3 | 24 / 35 | 5386 |
| 4 | 1 | 71.2 | 91.4 | 29 / 35 | 5720 |
| 5 | 1 | 69.0 | 85.1 | 23 / 35 | 5156 |
| 6 | 1 | 69.9 | 86.7 | 21 / 35 | 5759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 52 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 27 | 96% |
| stelo.AreaTargetingBot 1.1 | 20 | 85% |
| donjezza.Muncho 1.0 | 16 | 94% |
| ntc.Opposite 1.5 | 15 | 100% |
| disan.Chair 2.2.0 | 13 | 85% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 24 | 36% | 65 |
| ntc.Opposite 1.5 | 12 | 18% | 24 |
| pfvicm.Sobieski 7.2.3b | 10 | 15% | 26 |
| stelo.AreaTargetingBot 1.1 | 7 | 10% | 27 |
| DBall.NUKE 0.1 | 6 | 9% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 4% | 21 |
| disan.Chair 2.2.0 | 2 | 3% | 14 |
| donjezza.Muncho 1.0 | 2 | 3% | 10 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.7 | 86 / 210 | 3.54 | 15.8% | 26760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 15.8% | 86 |
| oog.melee.Capulet 1.2 | 2.3 | 14.2% | 48 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.3% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 19 |
| yagami.Tidus 0.11 | 5.2 | 11.7% | 11 |
| ejb.Polaris 1.0.1 | 5.2 | 11.3% | 13 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 69.2 | 13 / 35 | 4328 |
| 2 | 1 | 65.0 | 72.4 | 13 / 35 | 4572 |
| 3 | 1 | 67.2 | 79.0 | 20 / 35 | 4576 |
| 4 | 1 | 64.8 | 72.7 | 15 / 35 | 4504 |
| 5 | 1 | 62.9 | 67.0 | 12 / 35 | 4359 |
| 6 | 1 | 63.9 | 70.2 | 13 / 35 | 4421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 83% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| yagami.Tidus 0.11 | 19 | 89% |
| ejb.Polaris 1.0.1 | 7 | 57% |

Hadur died in 124 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 31% | 63 |
| yagami.Tidus 0.11 | 22 | 18% | 37 |
| ejb.Polaris 1.0.1 | 18 | 15% | 27 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 30 |
| kurios.DOSexe .9a | 13 | 10% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 10% | 35 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 129 / 210 | 2.68 | 18.2% | 29459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.2% | 129 |
| bzdp.Pansy 2.1 | 2.5 | 12.3% | 23 |
| ratosh.Nobo 0.21 | 3.0 | 11.5% | 5 |
| wee.Gem 1.8.4 | 4.3 | 10.8% | 19 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 14 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 7.0 | 8.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 5 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.7 | 21 / 35 | 4993 |
| 2 | 1 | 65.6 | 77.1 | 22 / 35 | 4293 |
| 3 | 1 | 67.7 | 81.0 | 20 / 35 | 5237 |
| 4 | 1 | 67.5 | 81.3 | 22 / 35 | 4966 |
| 5 | 1 | 68.7 | 84.4 | 22 / 35 | 5358 |
| 6 | 1 | 67.3 | 85.4 | 22 / 35 | 4612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 84% |
| wompi.Quokka 1.6 | 25 | 92% |
| wee.Gem 1.8.4 | 24 | 92% |
| ratosh.Nobo 0.21 | 16 | 94% |
| bayen.UbaMicro 1.4 | 9 | 56% |
| m3thos.Eva00 1.1 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 15 | 18% | 26 |
| bzdp.Pansy 2.1 | 14 | 17% | 62 |
| wee.Gem 1.8.4 | 12 | 15% | 37 |
| stelo.MyAgileRobot 0.2 | 12 | 15% | 14 |
| ratosh.Nobo 0.21 | 8 | 10% | 23 |
| bayen.UbaMicro 1.4 | 8 | 10% | 16 |
| maribo.FollowFire 1 | 5 | 6% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.7 | 92.0 | 146 / 210 | 1.72 | 23.2% | 53866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 23.2% | 146 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 7 |
| stuff.Vlad 0.1 | 4.8 | 9.2% | 1 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 0 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 93.3 | 23 / 35 | 8781 |
| 2 | 1 | 74.1 | 90.5 | 22 / 35 | 8722 |
| 3 | 1 | 75.4 | 95.9 | 28 / 35 | 8705 |
| 4 | 1 | 74.5 | 92.7 | 22 / 35 | 8890 |
| 5 | 1 | 74.1 | 87.0 | 26 / 35 | 9185 |
| 6 | 1 | 75.3 | 92.4 | 25 / 35 | 9583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 137 | 80% |
| mz.NanoGod 2.02 | 13 | 85% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| stuff.Vlad 0.1 | 7 | 86% |
| ayk.WallHugger 1.0 | 5 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 67% | 154 |
| mz.NanoGod 2.02 | 12 | 19% | 29 |
| ayk.WallHugger 1.0 | 3 | 5% | 8 |
| exauge.GateKeeper 1.1.121g | 3 | 5% | 7 |
| stuff.Vlad 0.1 | 3 | 5% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.6 | 108 / 210 | 3.38 | 17.0% | 29939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.0% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 16 |
| bvh.micro.Freya 0.3 | 3.3 | 12.1% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 11 |
| conscience.Electron 1.3g | 7.0 | 7.5% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.9 | 16 / 35 | 4930 |
| 2 | 1 | 68.7 | 85.1 | 25 / 35 | 4910 |
| 3 | 1 | 66.8 | 79.7 | 19 / 35 | 4983 |
| 4 | 1 | 61.7 | 61.9 | 15 / 35 | 4643 |
| 5 | 1 | 67.0 | 80.3 | 16 / 35 | 5191 |
| 6 | 1 | 64.3 | 66.7 | 17 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 89% |
| dummy.micro.Sparrow 2.5 | 28 | 82% |
| bvh.micro.Freya 0.3 | 21 | 71% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 83% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 25% | 75 |
| conscience.Electron 1.3g | 22 | 21% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 30 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 30 |
| bvh.micro.Freya 0.3 | 10 | 10% | 22 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |
| dl.BetterWalls 1.0 | 4 | 4% | 5 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 82.7 | 135 / 210 | 2.56 | 20.6% | 41931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.6% | 135 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 26 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.7% | 15 |
| sul.Lunar 1.1 | 3.7 | 11.2% | 9 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 7 |
| dsw.StaticD 1.0 | 6.0 | 7.9% | 4 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.8% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.1% | 5 |
| sample.Corners 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 90.2 | 25 / 35 | 7271 |
| 2 | 1 | 71.4 | 85.1 | 24 / 35 | 7089 |
| 3 | 1 | 70.4 | 82.2 | 24 / 35 | 6793 |
| 4 | 1 | 70.5 | 77.8 | 21 / 35 | 7148 |
| 5 | 1 | 68.7 | 75.9 | 19 / 35 | 6585 |
| 6 | 1 | 70.8 | 85.1 | 22 / 35 | 7045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 45 | 89% |
| sul.Lunar 1.1 | 37 | 97% |
| supersample.SuperBoxBot 1.0 | 29 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| dsw.StaticD 1.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 33% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 27% | 60 |
| sul.Lunar 1.1 | 7 | 9% | 44 |
| sample.MyFirstRobot 1.0 | 6 | 8% | 11 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 14 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 10 |
| dsw.StaticD 1.0 | 4 | 5% | 16 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.0 | 108 / 210 | 2.62 | 19.1% | 39771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.1% | 108 |
| radnor.DoctorBob 1.42 | 2.5 | 12.7% | 25 |
| mld.Wisdom 1.0 | 2.8 | 12.2% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.2% | 26 |
| amz.NanoClone 1.41 | 5.2 | 10.5% | 12 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.3% | 11 |
| GarmBox.Oranges 1.0 | 7.3 | 7.4% | 0 |
| sample.Walls 1.0 | 7.8 | 7.2% | 5 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 3 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.7 | 20 / 35 | 6638 |
| 2 | 1 | 67.1 | 77.5 | 16 / 35 | 6382 |
| 3 | 1 | 64.0 | 68.6 | 11 / 35 | 5567 |
| 4 | 1 | 70.7 | 84.1 | 22 / 35 | 7499 |
| 5 | 1 | 71.5 | 91.4 | 20 / 35 | 7125 |
| 6 | 1 | 69.0 | 83.8 | 19 / 35 | 6560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 87% |
| mld.Wisdom 1.0 | 21 | 48% |
| KiraNL.Chupacabra 0.4 | 15 | 87% |
| amz.NanoClone 1.41 | 14 | 79% |
| jangs.ns51 1.0 | 9 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 31% | 47 |
| radnor.DoctorBob 1.42 | 24 | 24% | 56 |
| amz.NanoClone 1.41 | 15 | 15% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 13% | 35 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 28 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 5 |

