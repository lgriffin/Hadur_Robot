# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 57 over 6 battles (9.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.2 | 145 / 210 | 1.89 | 21.7% | 43872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.7% | 145 |
| radnor.DoctorBob 1.42 | 2.8 | 14.1% | 23 |
| mld.Infinity 2.2 | 2.8 | 13.9% | 25 |
| mz.AntiGrav 1.0 | 3.3 | 13.5% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 5 |
| GarmBox.Oranges 1.0 | 6.5 | 6.6% | 0 |
| sample.Walls 1.0 | 7.3 | 6.0% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 8.7 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 89.8 | 26 / 35 | 7007 |
| 2 | 1 | 73.3 | 90.2 | 28 / 35 | 7614 |
| 3 | 1 | 71.3 | 88.3 | 21 / 35 | 7072 |
| 4 | 1 | 73.1 | 92.7 | 25 / 35 | 7327 |
| 5 | 1 | 73.9 | 92.1 | 22 / 35 | 8152 |
| 6 | 1 | 72.0 | 87.9 | 23 / 35 | 6700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 61 | 75% |
| mz.AntiGrav 1.0 | 58 | 98% |
| radnor.DoctorBob 1.42 | 48 | 75% |
| amz.NanoClone 1.41 | 6 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1133. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 40% | 85 |
| mld.Infinity 2.2 | 18 | 28% | 20 |
| mz.AntiGrav 1.0 | 9 | 14% | 72 |
| amz.NanoClone 1.41 | 6 | 9% | 13 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.6 | 137 / 210 | 2.39 | 18.7% | 30768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.7% | 137 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.4% | 49 |
| mld.DustBunny 3.8 | 3.0 | 13.7% | 12 |
| maribo.melee.BMV 0.1 | 4.7 | 10.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 7.9% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.7% | 4 |
| fullsail.SweetTea 1.1 | 7.7 | 7.0% | 1 |
| bzdp.BoxCar 2.0 | 8.5 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.0 | 24 / 35 | 5345 |
| 2 | 1 | 66.7 | 80.3 | 19 / 35 | 4775 |
| 3 | 1 | 70.2 | 90.8 | 29 / 35 | 5371 |
| 4 | 1 | 67.6 | 83.8 | 22 / 35 | 4793 |
| 5 | 1 | 69.3 | 89.5 | 28 / 35 | 4625 |
| 6 | 1 | 66.0 | 70.2 | 15 / 35 | 5859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 89 | 81% |
| mld.DustBunny 3.8 | 51 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 42% | 108 |
| mld.DustBunny 3.8 | 16 | 22% | 55 |
| cs.Grudge 1.0 | 7 | 10% | 6 |
| zyx.nano.Ant 1.1 | 6 | 8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 10 |
| maribo.melee.BMV 0.1 | 3 | 4% | 10 |
| fullsail.SweetTea 1.1 | 2 | 3% | 7 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 80.9 | 119 / 210 | 2.72 | 18.9% | 33935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.9% | 119 |
| myl.micro.Troodon 1.10 | 2.2 | 14.1% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.9% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.2% | 27 |
| cb.nano.Insomnia 1.0 | 4.3 | 10.3% | 11 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 1 |
| sample.Fire 1.0 | 9.2 | 5.2% | 2 |
| sample.Tracker 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 83.8 | 24 / 35 | 5935 |
| 2 | 1 | 67.8 | 79.0 | 20 / 35 | 5699 |
| 3 | 1 | 68.4 | 79.0 | 19 / 35 | 5727 |
| 4 | 1 | 66.1 | 74.3 | 15 / 35 | 5209 |
| 5 | 1 | 69.7 | 85.4 | 22 / 35 | 5669 |
| 6 | 1 | 69.3 | 83.8 | 19 / 35 | 5696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 45 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 70% |
| cb.nano.Insomnia 1.0 | 27 | 96% |
| myl.nano.KomoriNinja 1.1 | 26 | 88% |
| fm.mammillarias 1.3 | 4 | 75% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 27 | 30% | 39 |
| cb.nano.Insomnia 1.0 | 19 | 21% | 25 |
| myl.micro.Troodon 1.10 | 17 | 19% | 68 |
| myl.nano.KomoriNinja 1.1 | 13 | 14% | 40 |
| fm.mammillarias 1.3 | 7 | 8% | 9 |
| sample.Fire 1.0 | 3 | 3% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 9 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 10 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 55 over 6 battles (9.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.2 | 147 / 210 | 2.06 | 20.6% | 37701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.6% | 147 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.5% | 21 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.8% | 9 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.4% | 4 |
| tj.zombie1n 1.0.1 | 6.2 | 8.5% | 8 |
| yk.JahMicro 1.0 | 6.3 | 8.4% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.9 | 25 / 35 | 6181 |
| 2 | 1 | 69.8 | 86.3 | 25 / 35 | 5870 |
| 3 | 1 | 70.5 | 85.1 | 26 / 35 | 6528 |
| 4 | 1 | 70.0 | 87.6 | 21 / 35 | 6297 |
| 5 | 1 | 71.3 | 90.8 | 27 / 35 | 6572 |
| 6 | 1 | 70.8 | 90.5 | 23 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 78% |
| stelo.SoJNanoMelee 1.1 | 48 | 77% |
| tvv.micro.Antares 1.1.1 | 20 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 93% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| yk.JahMicro 1.0 | 14 | 93% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 27 | 43% | 79 |
| stelo.SoJNanoMelee 1.1 | 17 | 27% | 45 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 19 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| tj.zombie1n 1.0.1 | 2 | 3% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 69.6 | 111 / 210 | 3.73 | 16.6% | 30510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.6% | 111 |
| oog.melee.Corsair 1.0 | 2.3 | 12.3% | 23 |
| ahf.NanoAndrew .4 | 3.2 | 11.9% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.0% | 18 |
| EBBU.Sim2 1.02 | 4.7 | 10.5% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 7 |
| sam.Samspin 1.0 | 6.7 | 9.1% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.7% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.7 | 19 / 35 | 5095 |
| 2 | 1 | 67.0 | 77.1 | 23 / 35 | 5214 |
| 3 | 1 | 64.8 | 70.8 | 18 / 35 | 5041 |
| 4 | 1 | 67.1 | 74.3 | 19 / 35 | 5815 |
| 5 | 1 | 62.0 | 61.3 | 16 / 35 | 4810 |
| 6 | 1 | 61.7 | 61.6 | 16 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 89% |
| ahf.NanoAndrew .4 | 36 | 100% |
| oog.melee.Corsair 1.0 | 27 | 81% |
| sam.Samspin 1.0 | 10 | 90% |
| EBBU.Sim2 1.02 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 27% | 55 |
| zyx.nano.BacillusComma 1.0 | 19 | 19% | 24 |
| robar.nano.Assertive_Melee 0.2 | 15 | 15% | 23 |
| oog.melee.Corsair 1.0 | 11 | 11% | 34 |
| ahf.NanoAndrew .4 | 9 | 9% | 38 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 9% | 10 |
| EBBU.Sim2 1.02 | 7 | 7% | 12 |
| sam.Samspin 1.0 | 1 | 1% | 11 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 144 / 210 | 2.17 | 19.4% | 31545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.4% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.3% | 6 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.4% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 8 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.8% | 2 |
| fm.claire 1.7 | 6.7 | 7.9% | 1 |
| pa.Improved 1.0 | 8.5 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.2 | 5.7% | 1 |
| sample.SpinBot 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 28 / 35 | 5116 |
| 2 | 1 | 68.8 | 84.4 | 25 / 35 | 5227 |
| 3 | 1 | 69.8 | 88.9 | 25 / 35 | 5462 |
| 4 | 1 | 69.0 | 88.9 | 20 / 35 | 5125 |
| 5 | 1 | 69.7 | 86.7 | 26 / 35 | 5435 |
| 6 | 1 | 67.9 | 82.5 | 20 / 35 | 5180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 82% |
| oog.melee.CapuletDroid 1.1 | 34 | 82% |
| gh.nano.Grofvuil 0.2 | 27 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 30% | 82 |
| oog.melee.CapuletDroid 1.1 | 19 | 29% | 25 |
| arthord.NanoSatanMelee Beta | 9 | 14% | 23 |
| gh.nano.Grofvuil 0.2 | 6 | 9% | 39 |
| fm.claire 1.7 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 15 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 1 | 2% | 1 |

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.9 | 106 / 210 | 2.54 | 18.2% | 32352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.2% | 106 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 41 |
| mz.MicroGodMelee 1 | 3.7 | 13.3% | 24 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 2 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.3% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.8 | 5.2% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.2 | 19 / 35 | 5943 |
| 2 | 1 | 69.3 | 86.3 | 21 / 35 | 5426 |
| 3 | 1 | 66.9 | 79.7 | 18 / 35 | 4816 |
| 4 | 1 | 66.8 | 78.7 | 15 / 35 | 5398 |
| 5 | 1 | 67.6 | 81.3 | 16 / 35 | 5390 |
| 6 | 1 | 67.6 | 82.2 | 17 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 50% |
| mz.MicroGodMelee 1 | 48 | 83% |
| gh.micro.Gruweltje 0.7 | 44 | 70% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 37% | 66 |
| mz.MicroGodMelee 1 | 24 | 23% | 56 |
| gh.micro.Gruweltje 0.7 | 23 | 22% | 59 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 10 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 65.9 | 83 / 210 | 4.07 | 15.2% | 28460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.5 | 15.2% | 83 |
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.3% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.2% | 37 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.8% | 8 |
| germ.TheMind .2 | 5.3 | 9.6% | 3 |
| awesomeness.Elite 1.0 | 5.8 | 8.9% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.0% | 10 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.6 | 18 / 35 | 4891 |
| 2 | 1 | 63.1 | 65.7 | 13 / 35 | 4954 |
| 3 | 2 | 62.2 | 66.0 | 11 / 35 | 4639 |
| 4 | 1 | 62.9 | 67.0 | 16 / 35 | 4829 |
| 5 | 2 | 60.5 | 59.4 | 12 / 35 | 4465 |
| 6 | 2 | 63.4 | 68.9 | 13 / 35 | 4682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 63% |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 75% |
| stelo.UntouchableNano 1.3 | 12 | 83% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| germ.TheMind .2 | 7 | 86% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 61 | 48% | 104 |
| stelo.UntouchableNano 1.3 | 14 | 11% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 10% | 29 |
| germ.TheMind .2 | 11 | 9% | 19 |
| awesomeness.Elite 1.0 | 10 | 8% | 14 |
| lrem.micro.MoggFanatic 0.2 | 8 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 9 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.8 | 153 / 210 | 2.00 | 20.2% | 31384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.2% | 153 |
| rz.HawkOnFire 0.1 | 2.3 | 14.0% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 13 |
| maribo.IotaCT 1.1 | 4.2 | 10.3% | 15 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.7% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.4% | 2 |
| stelo.PatternRobot 1.0 | 7.3 | 7.6% | 7 |
| spinnercat.Omen 1.0 | 8.7 | 7.1% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.8 | 24 / 35 | 4910 |
| 2 | 1 | 71.4 | 92.4 | 30 / 35 | 4709 |
| 3 | 1 | 69.8 | 86.0 | 21 / 35 | 5478 |
| 4 | 1 | 70.6 | 87.3 | 25 / 35 | 5359 |
| 5 | 1 | 70.6 | 89.5 | 24 / 35 | 5482 |
| 6 | 1 | 72.2 | 94.0 | 29 / 35 | 5446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 87 | 97% |
| nz.jdc.nano.GridFu 1.0 | 33 | 91% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| maribo.IotaCT 1.1 | 12 | 75% |
| ratosh.Wesco 1.4 | 9 | 78% |
| stelo.PatternRobot 1.0 | 8 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 12 | 21% | 29 |
| rz.HawkOnFire 0.1 | 10 | 18% | 73 |
| nz.jdc.nano.GridFu 1.0 | 10 | 18% | 52 |
| maribo.IotaCT 1.1 | 7 | 12% | 17 |
| stelo.PatternRobot 1.0 | 7 | 12% | 12 |
| ratosh.Wesco 1.4 | 5 | 9% | 14 |
| spinnercat.Omen 1.0 | 3 | 5% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.9 | 182 / 210 | 1.64 | 21.8% | 38930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.8% | 182 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 10 |
| baal.nano.N 1.42 | 3.2 | 11.8% | 6 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.7% | 4 |
| sanja.First 0.1 | 6.8 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 7.2 | 7.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.1% | 0 |
| cvt.Firsty 1.0 | 8.3 | 6.9% | 3 |
| sample.RamFire 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 29 / 35 | 6597 |
| 2 | 1 | 72.4 | 94.0 | 30 / 35 | 6687 |
| 3 | 1 | 72.8 | 99.4 | 33 / 35 | 6497 |
| 4 | 1 | 70.1 | 87.3 | 29 / 35 | 5815 |
| 5 | 1 | 71.6 | 89.8 | 30 / 35 | 6317 |
| 6 | 1 | 73.0 | 95.2 | 31 / 35 | 7017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 98% |
| tvv.nano.Polaris 1.2 | 38 | 97% |
| zyx.micro.Ant 1.1 | 28 | 96% |
| cvt.Firsty 1.0 | 24 | 88% |
| sanja.First 0.1 | 24 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 27% | 48 |
| sample.RamFire 1.0 | 5 | 17% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 13% | 38 |
| cvt.Firsty 1.0 | 4 | 13% | 23 |
| baal.nano.N 1.42 | 3 | 10% | 27 |
| Grystrion.TrackerWO 1.0 | 2 | 7% | 23 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 10 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 6 |
| sanja.First 0.1 | 0 | 0% | 20 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.8 | 72 / 210 | 3.90 | 15.0% | 29986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.6% | 89 |
| hadur117.micro.SaorOG4 0.1 | 2.0 | 15.0% | 72 |
| cs.Wren 1.0 | 3.2 | 11.9% | 19 |
| js.PinBall 1.6 | 3.8 | 11.4% | 11 |
| mz.Cork 0.1 | 5.0 | 10.7% | 8 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 3 |
| evd.X1 0.01 | 7.3 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 7.5 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 75.9 | 15 / 35 | 5193 |
| 2 | 1 | 63.0 | 68.9 | 15 / 35 | 4896 |
| 3 | 2 | 64.1 | 71.1 | 12 / 35 | 5346 |
| 4 | 4 | 57.7 | 56.8 | 5 / 35 | 4229 |
| 5 | 2 | 61.5 | 63.2 | 11 / 35 | 4948 |
| 6 | 2 | 64.6 | 70.8 | 14 / 35 | 5374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 76 | 47% |
| cs.Wren 1.0 | 16 | 88% |
| mz.Cork 0.1 | 11 | 82% |
| js.PinBall 1.6 | 6 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 139 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 73 | 53% | 115 |
| joe.ADinosaur 1.0 | 18 | 13% | 20 |
| evd.X1 0.01 | 12 | 9% | 12 |
| cs.Wren 1.0 | 11 | 8% | 23 |
| mz.Cork 0.1 | 9 | 6% | 16 |
| js.PinBall 1.6 | 8 | 6% | 12 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.0 | 114 / 210 | 2.80 | 17.8% | 28089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.8% | 114 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 22 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.7% | 25 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.4% | 1 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 11 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 9 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 28 / 35 | 5099 |
| 2 | 1 | 68.7 | 83.8 | 22 / 35 | 5232 |
| 3 | 1 | 64.6 | 73.3 | 14 / 35 | 4701 |
| 4 | 1 | 64.4 | 75.2 | 15 / 35 | 4283 |
| 5 | 1 | 65.1 | 75.6 | 17 / 35 | 4709 |
| 6 | 1 | 65.0 | 77.5 | 18 / 35 | 4065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 88% |
| stelo.AreaTargetingBot 1.1 | 31 | 52% |
| disan.Chair 2.2.0 | 18 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| ntc.Opposite 1.5 | 15 | 73% |
| DBall.NUKE 0.1 | 10 | 100% |
| donjezza.Muncho 1.0 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 25 | 26% | 39 |
| pfvicm.Sobieski 7.2.3b | 22 | 22% | 29 |
| myl.nano.Graviton 1.10 | 13 | 13% | 50 |
| ntc.Opposite 1.5 | 12 | 12% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 33 |
| disan.Chair 2.2.0 | 10 | 10% | 17 |
| DBall.NUKE 0.1 | 4 | 4% | 13 |
| donjezza.Muncho 1.0 | 1 | 1% | 7 |
| pbg.R2D2 1.0 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.6 | 101 / 210 | 3.46 | 15.8% | 23631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 15.8% | 101 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.1% | 35 |
| oog.melee.Capulet 1.2 | 2.8 | 14.1% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.3% | 16 |
| yagami.Tidus 0.11 | 5.0 | 11.7% | 7 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 2 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.3 | 20 / 35 | 3752 |
| 2 | 1 | 62.9 | 69.5 | 13 / 35 | 3676 |
| 3 | 1 | 66.3 | 76.8 | 18 / 35 | 4334 |
| 4 | 2 | 61.9 | 64.8 | 14 / 35 | 3892 |
| 5 | 1 | 66.7 | 79.0 | 20 / 35 | 4072 |
| 6 | 1 | 64.3 | 71.4 | 16 / 35 | 3905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 86% |
| kawigi.micro.Shiz 1.1 | 32 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 96% |
| yagami.Tidus 0.11 | 12 | 83% |
| ejb.Polaris 1.0.1 | 9 | 89% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 39% | 65 |
| kawigi.micro.Shiz 1.1 | 17 | 16% | 41 |
| yagami.Tidus 0.11 | 15 | 14% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 10% | 38 |
| ejb.Polaris 1.0.1 | 9 | 8% | 20 |
| stelo.MirrorNano 1.3 | 8 | 7% | 8 |
| kurios.DOSexe .9a | 5 | 5% | 8 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.5 | 131 / 210 | 2.76 | 17.9% | 28020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.9% | 131 |
| wee.Gem 1.8.4 | 2.8 | 12.3% | 28 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 19 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 14 |
| ratosh.Nobo 0.21 | 4.8 | 11.1% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 7.2 | 8.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 72.4 | 19 / 35 | 4525 |
| 2 | 1 | 66.8 | 81.0 | 23 / 35 | 4350 |
| 3 | 1 | 68.6 | 87.3 | 22 / 35 | 4719 |
| 4 | 1 | 66.8 | 80.6 | 23 / 35 | 4514 |
| 5 | 1 | 67.6 | 81.9 | 23 / 35 | 4960 |
| 6 | 1 | 66.9 | 79.7 | 21 / 35 | 4952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 50 | 92% |
| bzdp.Pansy 2.1 | 46 | 91% |
| wompi.Quokka 1.6 | 19 | 95% |
| ratosh.Nobo 0.21 | 15 | 73% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| m3thos.Eva00 1.1 | 7 | 71% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 12 | 15% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 14% | 14 |
| bzdp.Pansy 2.1 | 10 | 13% | 51 |
| wee.Gem 1.8.4 | 10 | 13% | 50 |
| maribo.FollowFire 1 | 10 | 13% | 12 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 11 |
| wompi.Quokka 1.6 | 7 | 9% | 18 |
| m3thos.Eva00 1.1 | 6 | 8% | 17 |
| bayen.UbaMicro 1.4 | 5 | 6% | 10 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 82.1 | 60 / 210 | 2.61 | 19.7% | 47144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 20.0% | 132 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 19.7% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 13 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 2 |
| stuff.Vlad 0.1 | 5.2 | 9.0% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 9.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.3% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 2.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 85.1 | 12 / 35 | 8274 |
| 2 | 2 | 69.3 | 77.5 | 10 / 35 | 6921 |
| 3 | 1 | 73.2 | 89.2 | 10 / 35 | 8878 |
| 4 | 2 | 67.9 | 70.8 | 11 / 35 | 6866 |
| 5 | 2 | 71.6 | 87.0 | 9 / 35 | 7853 |
| 6 | 2 | 71.6 | 83.2 | 8 / 35 | 8352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 118 | 18% |
| mz.NanoGod 2.02 | 22 | 91% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 114 | 75% | 142 |
| mz.NanoGod 2.02 | 13 | 9% | 34 |
| exauge.GateKeeper 1.1.121g | 10 | 7% | 15 |
| ayk.WallHugger 1.0 | 7 | 5% | 9 |
| stelo.PianistNano 1.2 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.2 | 109 / 210 | 3.32 | 16.6% | 27944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.6% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 14.5% | 40 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 19 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 16 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 8 |
| conscience.Electron 1.3g | 7.3 | 7.7% | 1 |
| ap.Frederick 1.1 | 7.8 | 6.7% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 5.7% | 0 |
| dl.BetterWalls 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 72.7 | 15 / 35 | 4672 |
| 2 | 1 | 67.2 | 79.7 | 19 / 35 | 5081 |
| 3 | 1 | 65.4 | 76.5 | 20 / 35 | 4505 |
| 4 | 1 | 64.6 | 72.7 | 20 / 35 | 4507 |
| 5 | 1 | 62.8 | 67.9 | 15 / 35 | 4548 |
| 6 | 1 | 65.6 | 75.6 | 20 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 58 | 71% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 88% |
| bvh.micro.Freya 0.3 | 21 | 100% |
| dummy.micro.Sparrow 2.5 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 35% | 76 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 21% | 22 |
| conscience.Electron 1.3g | 12 | 12% | 14 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 34 |
| bvh.micro.Freya 0.3 | 6 | 6% | 9 |
| dl.BetterWalls 1.0 | 5 | 5% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 12 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 83.7 | 133 / 210 | 2.47 | 20.3% | 40342 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.3% | 133 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.2% | 22 |
| supersample.SuperBoxBot 1.0 | 3.2 | 11.9% | 22 |
| sul.Lunar 1.1 | 4.0 | 10.9% | 9 |
| mme.NikeEnhanced 2.0 | 5.0 | 10.0% | 11 |
| dsw.StaticD 1.0 | 5.8 | 9.2% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.5% | 2 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 85.4 | 22 / 35 | 6912 |
| 2 | 1 | 70.2 | 81.9 | 22 / 35 | 6678 |
| 3 | 1 | 72.2 | 87.6 | 27 / 35 | 7381 |
| 4 | 1 | 69.5 | 81.0 | 21 / 35 | 6533 |
| 5 | 1 | 69.3 | 81.0 | 21 / 35 | 6107 |
| 6 | 1 | 70.6 | 85.4 | 20 / 35 | 6731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 90% |
| sul.Lunar 1.1 | 38 | 95% |
| supersample.SuperBoxBot 1.0 | 32 | 66% |
| dsw.StaticD 1.0 | 16 | 94% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |

Hadur died in 78 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 29 | 37% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 24% | 63 |
| mme.NikeEnhanced 2.0 | 9 | 12% | 11 |
| sul.Lunar 1.1 | 8 | 10% | 41 |
| dsw.StaticD 1.0 | 5 | 6% | 19 |
| tlp.ThreeLeggedPig 1 | 4 | 5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 6 |
| sample.Corners 1.0 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 81.8 | 124 / 210 | 2.64 | 19.4% | 41309 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.4% | 124 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 27 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.0% | 20 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.4% | 10 |
| amz.NanoClone 1.41 | 5.5 | 9.3% | 4 |
| sample.Walls 1.0 | 7.3 | 7.4% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 4 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 81.3 | 22 / 35 | 7038 |
| 2 | 1 | 69.8 | 84.1 | 21 / 35 | 7326 |
| 3 | 1 | 69.4 | 83.5 | 22 / 35 | 6281 |
| 4 | 1 | 68.4 | 78.1 | 18 / 35 | 6824 |
| 5 | 1 | 68.9 | 80.3 | 18 / 35 | 6781 |
| 6 | 1 | 70.2 | 83.5 | 23 / 35 | 7059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 83% |
| radnor.DoctorBob 1.42 | 46 | 80% |
| mld.Wisdom 1.0 | 22 | 77% |
| amz.NanoClone 1.41 | 13 | 92% |
| jangs.ns51 1.0 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 30% | 42 |
| KiraNL.Chupacabra 0.4 | 17 | 20% | 24 |
| radnor.DoctorBob 1.42 | 16 | 18% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 16% | 53 |
| amz.NanoClone 1.41 | 6 | 7% | 17 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| sample.Walls 1.0 | 3 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

