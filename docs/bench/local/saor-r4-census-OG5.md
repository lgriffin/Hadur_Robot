# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 88.2 | 149 / 210 | 2.06 | 21.3% | 42031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.3% | 149 |
| radnor.DoctorBob 1.42 | 2.5 | 14.5% | 21 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 7 |
| mld.Infinity 2.2 | 3.5 | 13.9% | 25 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 7 |
| sample.Walls 1.0 | 7.0 | 6.2% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.1% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 87.9 | 25 / 35 | 6899 |
| 2 | 1 | 69.7 | 79.7 | 20 / 35 | 6299 |
| 3 | 1 | 72.6 | 91.4 | 27 / 35 | 6823 |
| 4 | 1 | 73.0 | 90.2 | 27 / 35 | 7296 |
| 5 | 1 | 72.6 | 89.2 | 24 / 35 | 7193 |
| 6 | 1 | 72.9 | 90.8 | 26 / 35 | 7521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 98% |
| mld.Infinity 2.2 | 52 | 87% |
| radnor.DoctorBob 1.42 | 32 | 88% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 46% | 74 |
| mld.Infinity 2.2 | 10 | 16% | 21 |
| mz.AntiGrav 1.0 | 8 | 13% | 76 |
| amz.NanoClone 1.41 | 5 | 8% | 7 |
| jangs.ns51 1.0 | 4 | 7% | 10 |
| GarmBox.Oranges 1.0 | 3 | 5% | 7 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.0 | 142 / 210 | 2.35 | 18.7% | 29738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 18.7% | 142 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.8% | 51 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 8 |
| maribo.melee.BMV 0.1 | 4.3 | 10.1% | 0 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 7.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.7% | 6 |
| bzdp.BoxCar 2.0 | 7.7 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 5.9% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 24 / 35 | 4953 |
| 2 | 1 | 70.5 | 95.6 | 25 / 35 | 5031 |
| 3 | 1 | 70.0 | 92.1 | 27 / 35 | 5162 |
| 4 | 1 | 68.4 | 85.1 | 25 / 35 | 4601 |
| 5 | 1 | 70.2 | 92.4 | 29 / 35 | 5150 |
| 6 | 3 | 60.8 | 55.2 | 12 / 35 | 4841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 94 | 83% |
| mld.DustBunny 3.8 | 52 | 96% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 33% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 22 | 32% | 105 |
| mld.DustBunny 3.8 | 14 | 21% | 63 |
| cs.Grudge 1.0 | 10 | 15% | 8 |
| zyx.nano.Ant 1.1 | 8 | 12% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 4 |
| maribo.melee.BMV 0.1 | 3 | 4% | 7 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 4 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.5 | 133 / 210 | 2.40 | 20.0% | 36542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.0% | 133 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.6% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.8% | 22 |
| fm.mammillarias 1.3 | 5.0 | 9.7% | 7 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.1% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 78.4 | 19 / 35 | 6214 |
| 2 | 1 | 70.8 | 87.3 | 23 / 35 | 6229 |
| 3 | 1 | 69.1 | 81.9 | 20 / 35 | 5933 |
| 4 | 1 | 68.2 | 79.4 | 20 / 35 | 5631 |
| 5 | 1 | 71.5 | 93.0 | 25 / 35 | 6089 |
| 6 | 1 | 71.3 | 87.0 | 26 / 35 | 6446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 89% |
| cb.nano.Insomnia 1.0 | 31 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 70% |
| myl.nano.KomoriNinja 1.1 | 17 | 94% |
| fm.mammillarias 1.3 | 10 | 60% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sp.Nanos.Ember 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 27% | 91 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 22% | 35 |
| cb.nano.Insomnia 1.0 | 13 | 17% | 12 |
| fm.mammillarias 1.3 | 9 | 12% | 13 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 30 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 10 |
| sample.Tracker 1.0 | 4 | 5% | 6 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 47 over 6 battles (7.8 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.0 | 142 / 210 | 2.26 | 20.2% | 37134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.2% | 142 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 11 |
| stelo.SoJNanoMelee 1.1 | 4.0 | 10.2% | 26 |
| tj.zombie1n 1.0.1 | 5.2 | 8.8% | 9 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.0 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 88.3 | 27 / 35 | 6394 |
| 2 | 1 | 69.2 | 81.3 | 22 / 35 | 6304 |
| 3 | 1 | 70.8 | 88.9 | 26 / 35 | 6400 |
| 4 | 1 | 70.1 | 86.0 | 24 / 35 | 6254 |
| 5 | 1 | 69.2 | 84.1 | 22 / 35 | 6091 |
| 6 | 1 | 69.5 | 87.3 | 21 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 89% |
| stelo.SoJNanoMelee 1.1 | 48 | 79% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 100% |
| tj.zombie1n 1.0.1 | 11 | 45% |
| repositorio.NanoStep 1.0 | 9 | 89% |
| yk.JahMicro 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 32% | 79 |
| stelo.SoJNanoMelee 1.1 | 20 | 29% | 52 |
| tj.zombie1n 1.0.1 | 8 | 12% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 11 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 19 |
| repositorio.NanoStep 1.0 | 4 | 6% | 13 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 13 |
| yk.JahMicro 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.0 | 107 / 210 | 3.52 | 16.5% | 28819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.5% | 107 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 26 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 22 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.8% | 22 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 11 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.4% | 13 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.8 | 20 / 35 | 4794 |
| 2 | 1 | 61.8 | 63.5 | 16 / 35 | 4465 |
| 3 | 1 | 64.6 | 70.8 | 17 / 35 | 4841 |
| 4 | 1 | 65.8 | 76.5 | 20 / 35 | 4728 |
| 5 | 1 | 65.8 | 77.1 | 19 / 35 | 4919 |
| 6 | 1 | 63.9 | 66.0 | 15 / 35 | 5072 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 79% |
| simonton.nano.MeleeSeed 1.8 | 36 | 89% |
| ahf.NanoAndrew .4 | 19 | 79% |
| EBBU.Sim2 1.02 | 12 | 83% |
| sam.Samspin 1.0 | 11 | 100% |
| robar.nano.Assertive_Melee 0.2 | 10 | 70% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 22% | 55 |
| oog.melee.Corsair 1.0 | 17 | 16% | 48 |
| robar.nano.Assertive_Melee 0.2 | 15 | 14% | 23 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 14 |
| ahf.NanoAndrew .4 | 11 | 10% | 25 |
| EBBU.Sim2 1.02 | 10 | 9% | 17 |
| sam.Samspin 1.0 | 7 | 7% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 7% | 6 |
| sample.TrackFire 1.0 | 4 | 4% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.5 | 162 / 210 | 1.86 | 20.2% | 31559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.2% | 162 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 15 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.7% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.6% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 4 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 3 |
| fm.claire 1.7 | 6.3 | 8.3% | 0 |
| pa.Improved 1.0 | 8.5 | 5.9% | 1 |
| sample.SpinBot 1.0 | 9.2 | 5.5% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 28 / 35 | 5684 |
| 2 | 1 | 71.8 | 94.6 | 29 / 35 | 5694 |
| 3 | 1 | 70.6 | 94.0 | 28 / 35 | 5110 |
| 4 | 1 | 68.6 | 87.3 | 24 / 35 | 4528 |
| 5 | 1 | 68.3 | 83.2 | 24 / 35 | 5035 |
| 6 | 1 | 71.2 | 93.0 | 29 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 94% |
| oog.melee.CapuletDroid 1.1 | 47 | 94% |
| gh.nano.Grofvuil 0.2 | 22 | 91% |
| winamp32.micro.MicroMacro 1.0 | 14 | 100% |
| arthord.NanoSatanMelee Beta | 10 | 90% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 31% | 88 |
| arthord.NanoSatanMelee Beta | 10 | 21% | 22 |
| oog.melee.CapuletDroid 1.1 | 8 | 17% | 17 |
| fm.claire 1.7 | 6 | 13% | 12 |
| gh.nano.Grofvuil 0.2 | 5 | 10% | 34 |
| winamp32.micro.MicroMacro 1.0 | 3 | 6% | 21 |
| sample.SpinBot 1.0 | 1 | 2% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.6 | 107 / 210 | 2.74 | 18.1% | 33706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.1% | 107 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 38 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.5% | 39 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 15 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.1% | 2 |
| DBall.Anarchy 0.1 | 5.7 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.2 | 7.0% | 4 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.6% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.4 | 17 / 35 | 6138 |
| 2 | 1 | 69.0 | 86.7 | 21 / 35 | 5369 |
| 3 | 1 | 69.2 | 85.7 | 16 / 35 | 6226 |
| 4 | 1 | 66.0 | 75.9 | 21 / 35 | 4838 |
| 5 | 1 | 64.8 | 71.1 | 16 / 35 | 5260 |
| 6 | 1 | 67.6 | 80.0 | 16 / 35 | 5875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 55% |
| mz.MicroGodMelee 1 | 44 | 86% |
| gh.micro.Gruweltje 0.7 | 43 | 70% |
| caimano.Furia_Ceca 0.22 | 5 | 80% |
| el.JumpShoot 0.2 | 5 | 60% |
| DBall.Anarchy 0.1 | 4 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 30 | 29% | 51 |
| gh.micro.Gruweltje 0.7 | 27 | 26% | 60 |
| mz.MicroGodMelee 1 | 17 | 17% | 54 |
| acogdev.alpha 0.2 | 8 | 8% | 8 |
| fire219.CatBot 1.0 | 7 | 7% | 7 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| el.JumpShoot 0.2 | 4 | 4% | 9 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.4 | 104 / 210 | 3.58 | 16.3% | 29069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.2 | 16.3% | 104 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.5% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 19 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 6 |
| germ.TheMind .2 | 5.0 | 9.7% | 11 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.6% | 5 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.2 | 19 / 35 | 4627 |
| 2 | 1 | 66.8 | 79.0 | 19 / 35 | 5203 |
| 3 | 1 | 64.6 | 73.3 | 17 / 35 | 4615 |
| 4 | 2 | 62.4 | 65.7 | 13 / 35 | 4777 |
| 5 | 1 | 65.8 | 74.3 | 19 / 35 | 4979 |
| 6 | 1 | 63.5 | 65.7 | 17 / 35 | 4868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 91% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 50% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 41 |
| germ.TheMind .2 | 14 | 13% | 23 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 12 |
| awesomeness.Elite 1.0 | 4 | 4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.1 | 150 / 210 | 2.07 | 20.2% | 32631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.2% | 150 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 13 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 7 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.4% | 3 |
| ratosh.Wesco 1.4 | 6.8 | 8.4% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.6% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.2 | 25 / 35 | 5509 |
| 2 | 1 | 71.0 | 87.3 | 25 / 35 | 5652 |
| 3 | 1 | 69.5 | 85.7 | 23 / 35 | 5137 |
| 4 | 1 | 70.0 | 87.0 | 24 / 35 | 5470 |
| 5 | 1 | 70.3 | 87.9 | 26 / 35 | 5243 |
| 6 | 1 | 71.7 | 91.7 | 27 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 92% |
| nz.jdc.nano.GridFu 1.0 | 37 | 95% |
| maribo.IotaCT 1.1 | 11 | 82% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| ratosh.Wesco 1.4 | 8 | 88% |
| stelo.PatternRobot 1.0 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 27% | 73 |
| stelo.PatternRobot 1.0 | 11 | 18% | 17 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 20 |
| ratosh.Wesco 1.4 | 8 | 13% | 16 |
| nz.jdc.nano.GridFu 1.0 | 7 | 12% | 55 |
| maribo.IotaCT 1.1 | 6 | 10% | 22 |
| rrh.Iwillfindyou 2.0 | 2 | 3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.3 | 163 / 210 | 1.97 | 21.1% | 38949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.1% | 163 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 20 |
| baal.nano.N 1.42 | 3.0 | 11.7% | 4 |
| zyx.micro.Ant 1.1 | 4.3 | 10.2% | 16 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.2% | 3 |
| sanja.First 0.1 | 5.7 | 8.7% | 3 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 0 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.2% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.8 | 26 / 35 | 6586 |
| 2 | 1 | 70.8 | 87.3 | 27 / 35 | 6677 |
| 3 | 1 | 72.1 | 91.7 | 29 / 35 | 6944 |
| 4 | 1 | 72.3 | 94.0 | 30 / 35 | 6596 |
| 5 | 1 | 71.5 | 90.2 | 28 / 35 | 6534 |
| 6 | 1 | 68.5 | 82.5 | 23 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 45 | 87% |
| baal.nano.N 1.42 | 36 | 97% |
| zyx.micro.Ant 1.1 | 29 | 76% |
| cvt.Firsty 1.0 | 22 | 100% |
| sanja.First 0.1 | 19 | 95% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 16 | 34% | 47 |
| tvv.nano.Polaris 1.2 | 8 | 17% | 57 |
| baal.nano.N 1.42 | 7 | 15% | 30 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 15 |
| sample.RamFire 1.0 | 5 | 11% | 6 |
| sanja.First 0.1 | 3 | 6% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 5 |
| cvt.Firsty 1.0 | 0 | 0% | 22 |

## Melee bench: F11

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.0 | 81 / 210 | 3.79 | 15.5% | 30800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 70 |
| hadur117.micro.SaorOG5 0.1 | 1.7 | 15.5% | 81 |
| cs.Wren 1.0 | 3.0 | 12.8% | 28 |
| js.PinBall 1.6 | 4.2 | 11.2% | 10 |
| mz.Cork 0.1 | 4.7 | 11.1% | 11 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 2 |
| evd.X1 0.01 | 6.8 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 71.1 | 14 / 35 | 5194 |
| 2 | 2 | 63.5 | 69.5 | 15 / 35 | 4932 |
| 3 | 2 | 63.9 | 71.4 | 11 / 35 | 5244 |
| 4 | 1 | 62.8 | 68.9 | 13 / 35 | 5168 |
| 5 | 1 | 65.6 | 72.4 | 15 / 35 | 5529 |
| 6 | 2 | 60.1 | 60.6 | 13 / 35 | 4733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 53% |
| cs.Wren 1.0 | 22 | 91% |
| mz.Cork 0.1 | 11 | 100% |
| js.PinBall 1.6 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 78 | 60% | 120 |
| cs.Wren 1.0 | 13 | 10% | 28 |
| evd.X1 0.01 | 12 | 9% | 15 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| mz.Cork 0.1 | 7 | 5% | 21 |
| js.PinBall 1.6 | 5 | 4% | 11 |
| PSW.Relentless 0.1 | 5 | 4% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.2 | 124 / 210 | 2.70 | 18.0% | 27623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.0% | 124 |
| myl.nano.Graviton 1.10 | 2.5 | 12.2% | 29 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.6% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.7% | 3 |
| ntc.Opposite 1.5 | 4.3 | 10.8% | 7 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.4% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 7 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 5.7% | 1 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 78.7 | 17 / 35 | 4082 |
| 2 | 1 | 67.2 | 80.6 | 21 / 35 | 4632 |
| 3 | 1 | 68.2 | 80.3 | 25 / 35 | 5195 |
| 4 | 1 | 67.8 | 82.9 | 23 / 35 | 4637 |
| 5 | 1 | 67.0 | 83.2 | 15 / 35 | 4805 |
| 6 | 1 | 67.2 | 81.3 | 23 / 35 | 4272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 46 | 93% |
| stelo.AreaTargetingBot 1.1 | 35 | 54% |
| disan.Chair 2.2.0 | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| ntc.Opposite 1.5 | 12 | 83% |
| donjezza.Muncho 1.0 | 11 | 100% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 34% | 44 |
| ntc.Opposite 1.5 | 12 | 14% | 26 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 19 |
| myl.nano.Graviton 1.10 | 11 | 13% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 34 |
| DBall.NUKE 0.1 | 7 | 8% | 14 |
| disan.Chair 2.2.0 | 3 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 44 over 6 battles (7.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.1 | 102 / 210 | 3.33 | 16.0% | 23682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 16.0% | 102 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.4% | 34 |
| oog.melee.Capulet 1.2 | 2.7 | 13.9% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.1% | 27 |
| yagami.Tidus 0.11 | 4.8 | 11.4% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 6 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.1 | 18 / 35 | 3852 |
| 2 | 1 | 67.6 | 81.0 | 22 / 35 | 4347 |
| 3 | 3 | 62.6 | 65.4 | 13 / 35 | 4054 |
| 4 | 1 | 64.9 | 72.4 | 17 / 35 | 3974 |
| 5 | 1 | 63.8 | 72.4 | 14 / 35 | 3520 |
| 6 | 1 | 65.5 | 76.5 | 18 / 35 | 3935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 84% |
| kawigi.micro.Shiz 1.1 | 35 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 89% |
| yagami.Tidus 0.11 | 13 | 69% |
| ejb.Polaris 1.0.1 | 8 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 35% | 64 |
| yagami.Tidus 0.11 | 16 | 15% | 29 |
| kawigi.micro.Shiz 1.1 | 15 | 14% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 12% | 42 |
| ejb.Polaris 1.0.1 | 12 | 11% | 22 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| kurios.DOSexe .9a | 4 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.5 | 138 / 210 | 2.85 | 17.4% | 25247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.4% | 138 |
| bzdp.Pansy 2.1 | 2.3 | 12.8% | 17 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 24 |
| ratosh.Nobo 0.21 | 4.2 | 11.4% | 10 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 13 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 6 |
| bayen.UbaMicro 1.4 | 7.5 | 7.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 27 / 35 | 4533 |
| 2 | 1 | 65.5 | 79.0 | 22 / 35 | 4003 |
| 3 | 1 | 64.4 | 75.2 | 21 / 35 | 3885 |
| 4 | 1 | 65.8 | 77.5 | 24 / 35 | 4206 |
| 5 | 1 | 66.2 | 78.1 | 23 / 35 | 4220 |
| 6 | 1 | 66.4 | 81.9 | 21 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 88% |
| wee.Gem 1.8.4 | 43 | 98% |
| ratosh.Nobo 0.21 | 16 | 81% |
| wompi.Quokka 1.6 | 15 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 22% | 67 |
| ratosh.Nobo 0.21 | 11 | 15% | 32 |
| maribo.FollowFire 1 | 10 | 14% | 11 |
| wee.Gem 1.8.4 | 8 | 11% | 43 |
| wompi.Quokka 1.6 | 7 | 10% | 15 |
| m3thos.Eva00 1.1 | 6 | 8% | 12 |
| bayen.UbaMicro 1.4 | 5 | 7% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 86.0 | 61 / 210 | 2.26 | 20.7% | 50678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 20.7% | 61 |
| wompi.Wallaby 5.1 | 1.7 | 19.9% | 128 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 7 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.9% | 8 |
| stuff.Vlad 0.1 | 5.2 | 8.9% | 1 |
| ayk.WallHugger 1.0 | 5.7 | 8.5% | 4 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 90.2 | 15 / 35 | 9111 |
| 2 | 1 | 72.8 | 89.8 | 10 / 35 | 8708 |
| 3 | 1 | 72.7 | 87.0 | 10 / 35 | 8748 |
| 4 | 2 | 71.0 | 85.1 | 7 / 35 | 7862 |
| 5 | 2 | 70.7 | 83.5 | 7 / 35 | 7692 |
| 6 | 1 | 71.9 | 80.6 | 12 / 35 | 8557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 23% |
| mz.NanoGod 2.02 | 17 | 88% |
| exauge.GateKeeper 1.1.121g | 12 | 67% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 50% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 122 | 82% | 157 |
| mz.NanoGod 2.02 | 12 | 8% | 24 |
| exauge.GateKeeper 1.1.121g | 10 | 7% | 16 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.9 | 101 / 210 | 3.62 | 16.0% | 26716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.0% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 29 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.6% | 25 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.7% | 6 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 2 |
| ap.Frederick 1.1 | 7.8 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 5.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 74.3 | 16 / 35 | 4415 |
| 2 | 1 | 63.1 | 71.1 | 16 / 35 | 3984 |
| 3 | 1 | 66.5 | 77.1 | 19 / 35 | 4889 |
| 4 | 1 | 63.6 | 68.9 | 18 / 35 | 4381 |
| 5 | 1 | 63.6 | 68.3 | 17 / 35 | 4752 |
| 6 | 1 | 62.5 | 65.7 | 15 / 35 | 4295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 72% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 89% |
| dummy.micro.Sparrow 2.5 | 22 | 91% |
| bvh.micro.Freya 0.3 | 12 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 25% | 63 |
| dummy.micro.Sparrow 2.5 | 16 | 15% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 44 |
| conscience.Electron 1.3g | 12 | 11% | 14 |
| stelo.MirrorMicro 1.0 | 10 | 9% | 16 |
| dl.BetterWalls 1.0 | 9 | 8% | 12 |
| bvh.micro.Freya 0.3 | 6 | 6% | 18 |

## Melee bench: F17

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 79.8 | 135 / 210 | 2.82 | 20.0% | 40676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.0% | 135 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 26 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 12 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 14 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 11 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.6% | 1 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 2 |
| sample.Corners 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 79.7 | 20 / 35 | 6984 |
| 2 | 1 | 70.0 | 80.3 | 24 / 35 | 6577 |
| 3 | 1 | 73.5 | 92.4 | 28 / 35 | 7849 |
| 4 | 1 | 67.0 | 72.4 | 17 / 35 | 5958 |
| 5 | 1 | 67.1 | 70.8 | 20 / 35 | 6110 |
| 6 | 1 | 71.4 | 83.2 | 26 / 35 | 7198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 86% |
| sul.Lunar 1.1 | 39 | 100% |
| supersample.SuperBoxBot 1.0 | 24 | 79% |
| dsw.StaticD 1.0 | 13 | 92% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 36% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 18% | 61 |
| dsw.StaticD 1.0 | 11 | 14% | 28 |
| tlp.ThreeLeggedPig 1 | 6 | 8% | 8 |
| sul.Lunar 1.1 | 5 | 7% | 36 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 4% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 7 |
| sample.Corners 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.9 | 116 / 210 | 2.63 | 18.9% | 38945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.9% | 116 |
| mld.Wisdom 1.0 | 2.2 | 12.9% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.2% | 21 |
| radnor.DoctorBob 1.42 | 3.5 | 12.2% | 18 |
| amz.NanoClone 1.41 | 5.3 | 9.9% | 11 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.8% | 8 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 2 |
| sample.Walls 1.0 | 8.0 | 6.8% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 6 |
| sample.Target 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 80.3 | 22 / 35 | 6282 |
| 2 | 1 | 71.2 | 90.8 | 20 / 35 | 7521 |
| 3 | 1 | 66.8 | 75.6 | 15 / 35 | 6311 |
| 4 | 1 | 67.3 | 78.4 | 18 / 35 | 5924 |
| 5 | 1 | 67.8 | 80.6 | 18 / 35 | 5935 |
| 6 | 1 | 69.9 | 85.7 | 23 / 35 | 6972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 94% |
| radnor.DoctorBob 1.42 | 31 | 90% |
| mld.Wisdom 1.0 | 24 | 54% |
| KiraNL.Chupacabra 0.4 | 11 | 64% |
| jangs.ns51 1.0 | 10 | 80% |
| amz.NanoClone 1.41 | 9 | 67% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 34% | 45 |
| radnor.DoctorBob 1.42 | 21 | 22% | 52 |
| KiraNL.Chupacabra 0.4 | 15 | 16% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 63 |
| amz.NanoClone 1.41 | 5 | 5% | 12 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

