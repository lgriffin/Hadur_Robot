# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 90.6 | 154 / 210 | 1.85 | 22.0% | 44628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.0% | 154 |
| mz.AntiGrav 1.0 | 2.5 | 14.0% | 10 |
| radnor.DoctorBob 1.42 | 2.5 | 14.6% | 22 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 2 |
| GarmBox.Oranges 1.0 | 6.5 | 6.8% | 1 |
| sample.Walls 1.0 | 7.0 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 89.2 | 23 / 35 | 7246 |
| 2 | 1 | 72.7 | 88.6 | 25 / 35 | 7506 |
| 3 | 1 | 73.3 | 91.4 | 26 / 35 | 7491 |
| 4 | 1 | 72.1 | 87.9 | 25 / 35 | 7113 |
| 5 | 1 | 74.0 | 93.0 | 29 / 35 | 7901 |
| 6 | 1 | 73.4 | 93.3 | 26 / 35 | 7371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 96% |
| radnor.DoctorBob 1.42 | 50 | 82% |
| mld.Infinity 2.2 | 31 | 87% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 39% | 75 |
| mz.AntiGrav 1.0 | 12 | 21% | 85 |
| amz.NanoClone 1.41 | 8 | 14% | 14 |
| mld.Infinity 2.2 | 8 | 14% | 13 |
| jangs.ns51 1.0 | 2 | 4% | 10 |
| sample.Walls 1.0 | 2 | 4% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.9 | 142 / 210 | 2.27 | 18.9% | 31701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.9% | 142 |
| mld.DustBunny 3.8 | 2.5 | 14.3% | 14 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 37 |
| maribo.melee.BMV 0.1 | 4.8 | 9.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.3% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.3% | 4 |
| zyx.nano.Ant 1.1 | 6.3 | 7.9% | 1 |
| bzdp.BoxCar 2.0 | 7.8 | 7.5% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 5.9% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 25 / 35 | 5214 |
| 2 | 1 | 68.5 | 88.3 | 23 / 35 | 4846 |
| 3 | 1 | 69.4 | 92.1 | 26 / 35 | 4881 |
| 4 | 1 | 71.0 | 95.6 | 29 / 35 | 5331 |
| 5 | 1 | 65.9 | 67.3 | 18 / 35 | 5992 |
| 6 | 1 | 68.6 | 85.4 | 21 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 75 | 79% |
| mld.DustBunny 3.8 | 58 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 42% | 95 |
| mld.DustBunny 3.8 | 15 | 22% | 64 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 13 |
| fullsail.SweetTea 1.1 | 4 | 6% | 11 |
| maribo.melee.BMV 0.1 | 4 | 6% | 7 |
| zyx.nano.Ant 1.1 | 4 | 6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 6% | 5 |
| cs.Grudge 1.0 | 3 | 4% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 84.3 | 141 / 210 | 2.41 | 20.0% | 36857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.0% | 141 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.3% | 5 |
| cb.nano.Insomnia 1.0 | 4.2 | 10.4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 10.0% | 12 |
| fm.mammillarias 1.3 | 5.2 | 9.7% | 8 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 2 |
| sample.Fire 1.0 | 9.5 | 4.5% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 85.7 | 26 / 35 | 6426 |
| 2 | 1 | 70.0 | 83.8 | 22 / 35 | 6362 |
| 3 | 1 | 71.1 | 89.2 | 24 / 35 | 6161 |
| 4 | 1 | 70.2 | 86.0 | 25 / 35 | 6019 |
| 5 | 1 | 67.9 | 75.9 | 20 / 35 | 5956 |
| 6 | 1 | 70.2 | 85.1 | 24 / 35 | 5933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 66 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 24 | 88% |
| cb.nano.Insomnia 1.0 | 19 | 89% |
| fm.mammillarias 1.3 | 18 | 83% |
| myl.nano.KomoriNinja 1.1 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 29% | 86 |
| cb.nano.Insomnia 1.0 | 15 | 22% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 16% | 25 |
| fm.mammillarias 1.3 | 10 | 14% | 18 |
| sample.Fire 1.0 | 4 | 6% | 8 |
| sample.Tracker 1.0 | 4 | 6% | 6 |
| myl.nano.KomoriNinja 1.1 | 2 | 3% | 26 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 19 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.6 | 152 / 210 | 2.12 | 20.9% | 39646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.9% | 152 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 11 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.3% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 8.7% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 8.7% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.4% | 2 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 21 / 35 | 6068 |
| 2 | 1 | 70.0 | 83.5 | 25 / 35 | 6257 |
| 3 | 1 | 71.2 | 89.5 | 27 / 35 | 6642 |
| 4 | 1 | 71.4 | 89.2 | 27 / 35 | 6750 |
| 5 | 1 | 70.5 | 87.3 | 23 / 35 | 6828 |
| 6 | 1 | 72.4 | 90.8 | 29 / 35 | 7101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 76 | 93% |
| stelo.SoJNanoMelee 1.1 | 33 | 70% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 100% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| yk.JahMicro 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 31% | 90 |
| stelo.SoJNanoMelee 1.1 | 15 | 26% | 37 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 9 |
| sample.VelociRobot 1.0 | 5 | 9% | 6 |
| tj.zombie1n 1.0.1 | 4 | 7% | 12 |
| repositorio.NanoStep 1.0 | 2 | 3% | 5 |
| yk.JahMicro 1.0 | 2 | 3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 17 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.3 | 98 / 210 | 3.85 | 16.0% | 28911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.0% | 98 |
| oog.melee.Corsair 1.0 | 2.2 | 13.2% | 30 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 22 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 25 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 8.9% | 10 |
| EBBU.Sim2 1.02 | 6.5 | 9.4% | 6 |
| sam.Samspin 1.0 | 6.5 | 9.5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 76.2 | 21 / 35 | 5234 |
| 2 | 1 | 66.0 | 76.2 | 20 / 35 | 4859 |
| 3 | 1 | 61.7 | 61.3 | 14 / 35 | 4806 |
| 4 | 1 | 60.5 | 58.7 | 11 / 35 | 4551 |
| 5 | 1 | 64.1 | 69.5 | 17 / 35 | 4797 |
| 6 | 1 | 63.3 | 67.9 | 15 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 89% |
| simonton.nano.MeleeSeed 1.8 | 31 | 84% |
| ahf.NanoAndrew .4 | 22 | 95% |
| sam.Samspin 1.0 | 8 | 88% |
| zyx.nano.BacillusComma 1.0 | 6 | 50% |
| EBBU.Sim2 1.02 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 27% | 54 |
| oog.melee.Corsair 1.0 | 17 | 15% | 43 |
| EBBU.Sim2 1.02 | 17 | 15% | 23 |
| zyx.nano.BacillusComma 1.0 | 14 | 12% | 19 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 9 |
| ahf.NanoAndrew .4 | 7 | 6% | 31 |
| sam.Samspin 1.0 | 4 | 4% | 9 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.2 | 159 / 210 | 1.89 | 20.4% | 33666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.4% | 159 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 22 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.6% | 6 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.2% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 5 |
| fm.claire 1.7 | 5.8 | 8.3% | 2 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 2 |
| sample.SpinBot 1.0 | 8.3 | 6.3% | 2 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 26 / 35 | 5760 |
| 2 | 1 | 70.2 | 89.2 | 28 / 35 | 5498 |
| 3 | 1 | 71.3 | 92.4 | 28 / 35 | 5943 |
| 4 | 1 | 69.5 | 87.0 | 28 / 35 | 5420 |
| 5 | 1 | 69.0 | 85.1 | 22 / 35 | 5491 |
| 6 | 1 | 71.3 | 95.9 | 27 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 91% |
| oog.melee.CapuletDroid 1.1 | 34 | 91% |
| gh.nano.Grofvuil 0.2 | 27 | 93% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 31% | 98 |
| oog.melee.CapuletDroid 1.1 | 10 | 19% | 18 |
| gh.nano.Grofvuil 0.2 | 7 | 13% | 37 |
| arthord.NanoSatanMelee Beta | 5 | 10% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5 | 10% | 16 |
| pa.Improved 1.0 | 3 | 6% | 7 |
| kurios.DOSexe .9b | 2 | 4% | 6 |
| sample.SpinBot 1.0 | 2 | 4% | 4 |
| fm.claire 1.7 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.9 | 119 / 210 | 2.72 | 18.2% | 33038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.2% | 119 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.8% | 31 |
| mz.MicroGodMelee 1 | 3.8 | 13.0% | 14 |
| DBall.Anarchy 0.1 | 5.0 | 9.2% | 8 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 1 |
| el.JumpShoot 0.2 | 7.3 | 6.4% | 1 |
| acogdev.alpha 0.2 | 7.8 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.4% | 0 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 72.1 | 16 / 35 | 5461 |
| 2 | 1 | 68.6 | 84.4 | 22 / 35 | 5311 |
| 3 | 1 | 68.7 | 83.5 | 21 / 35 | 5317 |
| 4 | 1 | 68.6 | 82.9 | 21 / 35 | 5802 |
| 5 | 1 | 68.2 | 81.6 | 18 / 35 | 5914 |
| 6 | 1 | 67.8 | 81.0 | 21 / 35 | 5233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 49 | 94% |
| gh.micro.Gruweltje 0.7 | 44 | 80% |
| spinnercat.micro.Tyger 0.1 | 39 | 67% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 31 | 34% | 58 |
| gh.micro.Gruweltje 0.7 | 20 | 22% | 60 |
| mz.MicroGodMelee 1 | 16 | 18% | 58 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 8 |
| fire219.CatBot 1.0 | 6 | 7% | 7 |
| DBall.Anarchy 0.1 | 5 | 5% | 10 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 70.6 | 88 / 210 | 3.65 | 16.1% | 29968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 16.1% | 88 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.9% | 62 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 33 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.8% | 3 |
| germ.TheMind .2 | 5.3 | 9.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 3 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.3 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 66.7 | 18 / 35 | 4844 |
| 2 | 1 | 63.4 | 69.5 | 12 / 35 | 4764 |
| 3 | 1 | 66.0 | 73.0 | 15 / 35 | 5680 |
| 4 | 2 | 65.0 | 73.7 | 13 / 35 | 4848 |
| 5 | 1 | 66.0 | 75.9 | 16 / 35 | 4997 |
| 6 | 2 | 62.3 | 64.8 | 14 / 35 | 4835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 63% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| lrem.micro.MoggFanatic 0.2 | 7 | 86% |
| sample.Crazy 1.0 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| germ.TheMind .2 | 2 | 0% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 54% | 111 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 19% | 38 |
| germ.TheMind .2 | 15 | 12% | 17 |
| awesomeness.Elite 1.0 | 6 | 5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 9 |
| stelo.UntouchableNano 1.3 | 3 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 8 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.7 | 156 / 210 | 2.01 | 20.3% | 31761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.3% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 6 |
| maribo.IotaCT 1.1 | 4.0 | 10.4% | 6 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 8.3% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 99.7 | 34 / 35 | 5524 |
| 2 | 1 | 69.2 | 84.4 | 23 / 35 | 4949 |
| 3 | 1 | 71.1 | 91.1 | 24 / 35 | 5232 |
| 4 | 1 | 69.9 | 85.4 | 24 / 35 | 5148 |
| 5 | 1 | 70.1 | 85.1 | 26 / 35 | 5364 |
| 6 | 1 | 70.1 | 86.7 | 25 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 84 | 94% |
| nz.jdc.nano.GridFu 1.0 | 42 | 98% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| maribo.IotaCT 1.1 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 57% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 28% | 75 |
| ratosh.Wesco 1.4 | 13 | 24% | 24 |
| timmit.nano.TimDog 0.33 | 10 | 19% | 20 |
| stelo.PatternRobot 1.0 | 8 | 15% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3 | 6% | 49 |
| maribo.IotaCT 1.1 | 2 | 4% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.7 | 172 / 210 | 1.75 | 21.7% | 39952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.7% | 172 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 16 |
| baal.nano.N 1.42 | 2.7 | 11.6% | 2 |
| zyx.micro.Ant 1.1 | 4.5 | 9.7% | 6 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.2% | 2 |
| sanja.First 0.1 | 5.8 | 8.6% | 1 |
| cvt.Firsty 1.0 | 7.0 | 7.9% | 9 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 83.8 | 25 / 35 | 6332 |
| 2 | 1 | 72.5 | 94.3 | 28 / 35 | 6874 |
| 3 | 1 | 73.7 | 99.0 | 33 / 35 | 7064 |
| 4 | 1 | 73.3 | 96.8 | 33 / 35 | 6757 |
| 5 | 1 | 71.2 | 92.4 | 29 / 35 | 6285 |
| 6 | 1 | 69.9 | 83.8 | 24 / 35 | 6640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 95% |
| baal.nano.N 1.42 | 36 | 100% |
| cvt.Firsty 1.0 | 29 | 86% |
| zyx.micro.Ant 1.1 | 23 | 96% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cvt.Firsty 1.0 | 10 | 26% | 32 |
| tvv.nano.Polaris 1.2 | 8 | 21% | 54 |
| zyx.micro.Ant 1.1 | 6 | 15% | 39 |
| Grystrion.TrackerWO 1.0 | 6 | 15% | 19 |
| baal.nano.N 1.42 | 4 | 10% | 26 |
| sample.RamFire 1.0 | 3 | 8% | 8 |
| sanja.First 0.1 | 1 | 3% | 17 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.3 | 69 / 210 | 4.03 | 14.9% | 30325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.5% | 76 |
| hadur117.micro.SaorWD1 0.1 | 1.7 | 14.9% | 69 |
| cs.Wren 1.0 | 3.2 | 12.7% | 25 |
| mz.Cork 0.1 | 4.2 | 11.0% | 14 |
| js.PinBall 1.6 | 4.7 | 10.8% | 8 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 3 |
| evd.X1 0.01 | 7.0 | 7.8% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.2% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.9% | 7 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 66.0 | 11 / 35 | 4647 |
| 2 | 2 | 60.6 | 62.2 | 9 / 35 | 4948 |
| 3 | 2 | 62.5 | 63.8 | 9 / 35 | 5315 |
| 4 | 1 | 64.9 | 73.3 | 16 / 35 | 5332 |
| 5 | 2 | 62.8 | 68.9 | 10 / 35 | 4885 |
| 6 | 1 | 61.9 | 63.8 | 14 / 35 | 5198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 46% |
| cs.Wren 1.0 | 15 | 80% |
| mz.Cork 0.1 | 10 | 90% |
| js.PinBall 1.6 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 142 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 78 | 55% | 115 |
| cs.Wren 1.0 | 16 | 11% | 24 |
| joe.ADinosaur 1.0 | 12 | 8% | 12 |
| evd.X1 0.01 | 11 | 8% | 12 |
| js.PinBall 1.6 | 8 | 6% | 15 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| mz.Cork 0.1 | 6 | 4% | 15 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.8 | 130 / 210 | 2.46 | 18.9% | 30151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.9% | 130 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 24 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.7% | 9 |
| myl.nano.Graviton 1.10 | 4.0 | 10.8% | 15 |
| ntc.Opposite 1.5 | 4.3 | 10.9% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.7% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.7% | 4 |
| DBall.NUKE 0.1 | 7.5 | 7.7% | 5 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 2 |
| donjezza.Muncho 1.0 | 9.8 | 5.1% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 23 / 35 | 5280 |
| 2 | 1 | 68.8 | 87.0 | 22 / 35 | 5157 |
| 3 | 1 | 65.7 | 77.1 | 20 / 35 | 4616 |
| 4 | 1 | 67.2 | 80.3 | 18 / 35 | 5051 |
| 5 | 1 | 71.2 | 93.7 | 27 / 35 | 5055 |
| 6 | 1 | 67.9 | 83.2 | 20 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 62% |
| myl.nano.Graviton 1.10 | 25 | 96% |
| ntc.Opposite 1.5 | 25 | 88% |
| DBall.NUKE 0.1 | 18 | 100% |
| disan.Chair 2.2.0 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| donjezza.Muncho 1.0 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 23% | 49 |
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 29 |
| myl.nano.Graviton 1.10 | 12 | 14% | 42 |
| ntc.Opposite 1.5 | 11 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 28 |
| disan.Chair 2.2.0 | 6 | 7% | 12 |
| pbg.R2D2 1.0 | 4 | 5% | 6 |
| DBall.NUKE 0.1 | 2 | 2% | 19 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.6 | 101 / 210 | 3.38 | 16.0% | 25209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.0% | 101 |
| oog.melee.Capulet 1.2 | 2.7 | 14.3% | 34 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 39 |
| yagami.Tidus 0.11 | 4.0 | 12.4% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 11.8% | 17 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.9 | 19 / 35 | 4232 |
| 2 | 1 | 63.7 | 70.2 | 15 / 35 | 4126 |
| 3 | 1 | 65.1 | 74.6 | 19 / 35 | 4234 |
| 4 | 1 | 64.6 | 71.1 | 16 / 35 | 4083 |
| 5 | 1 | 66.9 | 80.6 | 17 / 35 | 4311 |
| 6 | 1 | 63.8 | 69.2 | 15 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 79% |
| kawigi.micro.Shiz 1.1 | 30 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 90% |
| yagami.Tidus 0.11 | 16 | 88% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 40% | 73 |
| yagami.Tidus 0.11 | 18 | 17% | 35 |
| kawigi.micro.Shiz 1.1 | 11 | 10% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 35 |
| ejb.Polaris 1.0.1 | 10 | 9% | 16 |
| step.nanoPri 1.0 | 6 | 6% | 7 |
| kurios.DOSexe .9a | 6 | 6% | 6 |
| stelo.MirrorNano 1.3 | 4 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.5 | 143 / 210 | 2.58 | 18.1% | 27313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.1% | 143 |
| wee.Gem 1.8.4 | 2.7 | 12.0% | 24 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 12 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 11 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 4 |
| m3thos.Eva00 1.1 | 5.7 | 9.6% | 10 |
| bayen.UbaMicro 1.4 | 6.3 | 9.2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.1 | 21 / 35 | 4543 |
| 2 | 1 | 66.8 | 79.4 | 23 / 35 | 4537 |
| 3 | 1 | 67.1 | 84.1 | 25 / 35 | 4357 |
| 4 | 1 | 67.8 | 84.1 | 24 / 35 | 4638 |
| 5 | 1 | 66.7 | 80.6 | 24 / 35 | 4477 |
| 6 | 1 | 69.3 | 89.5 | 26 / 35 | 4761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 92% |
| wee.Gem 1.8.4 | 30 | 93% |
| wompi.Quokka 1.6 | 29 | 93% |
| m3thos.Eva00 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 10 | 100% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 11 | 16% | 31 |
| maribo.FollowFire 1 | 11 | 16% | 12 |
| bzdp.Pansy 2.1 | 8 | 12% | 59 |
| wee.Gem 1.8.4 | 8 | 12% | 46 |
| wompi.Quokka 1.6 | 7 | 10% | 16 |
| m3thos.Eva00 1.1 | 7 | 10% | 15 |
| bayen.UbaMicro 1.4 | 6 | 9% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 6 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 6 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 83.4 | 65 / 210 | 2.49 | 20.3% | 50071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 20.3% | 65 |
| wompi.Wallaby 5.1 | 1.7 | 19.9% | 124 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 15 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.1% | 4 |
| stuff.Vlad 0.1 | 5.3 | 8.3% | 1 |
| ayk.WallHugger 1.0 | 5.5 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.8 | 11 / 35 | 8399 |
| 2 | 2 | 71.5 | 83.2 | 10 / 35 | 8575 |
| 3 | 1 | 71.7 | 83.2 | 12 / 35 | 8434 |
| 4 | 1 | 72.1 | 85.4 | 13 / 35 | 8478 |
| 5 | 2 | 70.7 | 80.0 | 10 / 35 | 8076 |
| 6 | 1 | 71.6 | 85.1 | 9 / 35 | 8109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 28% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 10 | 70% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 107 | 74% | 151 |
| mz.NanoGod 2.02 | 19 | 13% | 31 |
| exauge.GateKeeper 1.1.121g | 11 | 8% | 14 |
| ayk.WallHugger 1.0 | 4 | 3% | 7 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.8 | 103 / 210 | 3.81 | 15.9% | 27771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 15.9% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 23 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 23 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.8% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.9% | 10 |
| conscience.Electron 1.3g | 7.3 | 7.9% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 14 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 65.4 | 18 / 35 | 4070 |
| 2 | 1 | 66.9 | 79.0 | 20 / 35 | 5253 |
| 3 | 1 | 64.7 | 72.1 | 18 / 35 | 4626 |
| 4 | 2 | 59.9 | 59.0 | 13 / 35 | 4402 |
| 5 | 1 | 65.5 | 74.0 | 18 / 35 | 4795 |
| 6 | 1 | 61.9 | 63.2 | 16 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 77% |
| dummy.micro.Sparrow 2.5 | 28 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| bvh.micro.Freya 0.3 | 16 | 100% |
| stelo.MirrorMicro 1.0 | 10 | 100% |
| ap.Frederick 1.1 | 5 | 80% |

Hadur died in 107 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 21% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 22 | 21% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 16% | 34 |
| conscience.Electron 1.3g | 13 | 12% | 17 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 38 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 20 |
| bvh.micro.Freya 0.3 | 5 | 5% | 12 |
| dl.BetterWalls 1.0 | 5 | 5% | 11 |
| ap.Frederick 1.1 | 2 | 2% | 0 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.8 | 156 / 210 | 2.10 | 21.5% | 42147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.5% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 16 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 12 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.4% | 14 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.6% | 2 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.1% | 1 |
| sample.Corners 1.0 | 9.7 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 89.2 | 27 / 35 | 7297 |
| 2 | 1 | 72.8 | 89.8 | 28 / 35 | 7203 |
| 3 | 1 | 73.1 | 93.7 | 30 / 35 | 6944 |
| 4 | 1 | 72.0 | 87.0 | 25 / 35 | 7405 |
| 5 | 1 | 70.4 | 85.4 | 22 / 35 | 6549 |
| 6 | 1 | 70.4 | 81.9 | 24 / 35 | 6749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 53 | 89% |
| supersample.SuperBoxBot 1.0 | 33 | 79% |
| sul.Lunar 1.1 | 32 | 94% |
| sample.MyFirstRobot 1.0 | 20 | 95% |
| dsw.StaticD 1.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 44% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 18% | 54 |
| sul.Lunar 1.1 | 5 | 9% | 43 |
| dsw.StaticD 1.0 | 5 | 9% | 20 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 23 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |
| sample.Corners 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.3 | 117 / 210 | 2.69 | 18.9% | 39333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.9% | 117 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 26 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 18 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.6% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.8 | 10.6% | 16 |
| amz.NanoClone 1.41 | 5.2 | 9.9% | 13 |
| sample.Walls 1.0 | 7.3 | 7.8% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 81.3 | 17 / 35 | 6932 |
| 2 | 1 | 68.6 | 81.0 | 17 / 35 | 6668 |
| 3 | 1 | 68.8 | 82.9 | 21 / 35 | 6478 |
| 4 | 1 | 63.9 | 68.9 | 12 / 35 | 5586 |
| 5 | 1 | 68.1 | 79.0 | 21 / 35 | 6503 |
| 6 | 1 | 72.5 | 94.6 | 29 / 35 | 7166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 92% |
| mld.Wisdom 1.0 | 19 | 68% |
| amz.NanoClone 1.41 | 15 | 73% |
| KiraNL.Chupacabra 0.4 | 11 | 73% |
| jangs.ns51 1.0 | 9 | 67% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 24% | 37 |
| radnor.DoctorBob 1.42 | 20 | 22% | 61 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 26 |
| amz.NanoClone 1.41 | 13 | 14% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 11% | 47 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

