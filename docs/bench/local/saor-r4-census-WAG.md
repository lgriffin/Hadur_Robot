# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 92.3 | 167 / 210 | 1.69 | 22.7% | 45600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 22.7% | 167 |
| mz.AntiGrav 1.0 | 2.5 | 13.8% | 11 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 15 |
| mld.Infinity 2.2 | 3.8 | 12.1% | 8 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| sample.Walls 1.0 | 6.3 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 5 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 94.0 | 29 / 35 | 7697 |
| 2 | 1 | 72.5 | 88.6 | 25 / 35 | 7116 |
| 3 | 1 | 75.3 | 96.8 | 30 / 35 | 8500 |
| 4 | 1 | 74.8 | 95.2 | 31 / 35 | 8055 |
| 5 | 1 | 73.3 | 91.4 | 28 / 35 | 7478 |
| 6 | 1 | 71.1 | 87.9 | 24 / 35 | 6754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 92% |
| mld.Infinity 2.2 | 40 | 98% |
| radnor.DoctorBob 1.42 | 38 | 89% |
| amz.NanoClone 1.41 | 11 | 91% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 16 | 37% | 78 |
| radnor.DoctorBob 1.42 | 15 | 35% | 58 |
| amz.NanoClone 1.41 | 6 | 14% | 16 |
| mld.Infinity 2.2 | 3 | 7% | 39 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| sample.Walls 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 135 / 210 | 2.05 | 19.2% | 32129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.2% | 135 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.0% | 37 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 23 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.0% | 3 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 18 / 35 | 5250 |
| 2 | 1 | 69.7 | 90.2 | 22 / 35 | 5737 |
| 3 | 1 | 69.2 | 92.1 | 22 / 35 | 5268 |
| 4 | 1 | 69.6 | 90.5 | 25 / 35 | 5249 |
| 5 | 1 | 69.4 | 87.3 | 24 / 35 | 5906 |
| 6 | 1 | 67.6 | 85.1 | 24 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 75% |
| mld.DustBunny 3.8 | 53 | 79% |
| djdjdj.NanoSkunk10 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 30 | 40% | 69 |
| oog.melee.Mercutio 1.0 | 26 | 35% | 77 |
| zyx.nano.Ant 1.1 | 6 | 8% | 10 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 12 |
| maribo.melee.BMV 0.1 | 3 | 4% | 10 |
| bzdp.BoxCar 2.0 | 2 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 9 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 82.3 | 133 / 210 | 2.59 | 19.5% | 34764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.5% | 133 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.6% | 14 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.4% | 4 |
| fm.mammillarias 1.3 | 5.8 | 9.6% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 12 |
| sample.Fire 1.0 | 9.0 | 5.8% | 2 |
| sample.Tracker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 22 / 35 | 5586 |
| 2 | 1 | 67.7 | 75.9 | 20 / 35 | 5534 |
| 3 | 1 | 70.7 | 88.9 | 24 / 35 | 6168 |
| 4 | 1 | 68.4 | 79.0 | 22 / 35 | 5395 |
| 5 | 1 | 69.6 | 81.0 | 23 / 35 | 6166 |
| 6 | 1 | 69.9 | 83.2 | 22 / 35 | 5915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 38 | 97% |
| myl.micro.Troodon 1.10 | 35 | 89% |
| myl.nano.KomoriNinja 1.1 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 69% |
| fm.mammillarias 1.3 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| sample.Fire 1.0 | 5 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 21% | 53 |
| cb.nano.Insomnia 1.0 | 13 | 17% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 14% | 38 |
| fm.mammillarias 1.3 | 9 | 12% | 15 |
| sp.Nanos.Ember 1.1 | 7 | 9% | 21 |
| sample.Fire 1.0 | 7 | 9% | 10 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 36 |
| sample.Tracker 1.0 | 6 | 8% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 5 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.0 | 156 / 210 | 1.99 | 20.9% | 38962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.9% | 156 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.0% | 23 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.3% | 14 |
| tj.zombie1n 1.0.1 | 5.0 | 9.1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.5% | 0 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.2% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.9 | 29 / 35 | 6736 |
| 2 | 1 | 70.2 | 85.1 | 24 / 35 | 6432 |
| 3 | 1 | 71.7 | 90.2 | 28 / 35 | 6582 |
| 4 | 1 | 71.0 | 89.2 | 26 / 35 | 6654 |
| 5 | 1 | 70.1 | 85.7 | 24 / 35 | 6598 |
| 6 | 1 | 70.6 | 88.9 | 25 / 35 | 5960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 72 | 96% |
| stelo.SoJNanoMelee 1.1 | 51 | 88% |
| tvv.micro.Antares 1.1.1 | 15 | 100% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 75% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 48% | 102 |
| stelo.SoJNanoMelee 1.1 | 15 | 28% | 44 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 5 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 12 |
| repositorio.NanoStep 1.0 | 2 | 4% | 6 |
| yk.JahMicro 1.0 | 2 | 4% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 8 |
| tj.zombie1n 1.0.1 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.1 | 91 / 210 | 3.78 | 15.7% | 28155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 15.7% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 23 |
| ahf.NanoAndrew .4 | 4.2 | 11.0% | 19 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 14 |
| sam.Samspin 1.0 | 5.8 | 9.9% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 8.9% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 69.2 | 15 / 35 | 4415 |
| 2 | 1 | 63.2 | 67.6 | 15 / 35 | 4851 |
| 3 | 1 | 61.5 | 64.1 | 14 / 35 | 4547 |
| 4 | 1 | 64.6 | 72.7 | 17 / 35 | 4930 |
| 5 | 1 | 62.2 | 68.3 | 15 / 35 | 4317 |
| 6 | 1 | 64.7 | 72.7 | 15 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 89% |
| oog.melee.Corsair 1.0 | 33 | 64% |
| ahf.NanoAndrew .4 | 16 | 88% |
| EBBU.Sim2 1.02 | 10 | 90% |
| sam.Samspin 1.0 | 10 | 90% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 27% | 56 |
| oog.melee.Corsair 1.0 | 22 | 18% | 42 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| EBBU.Sim2 1.02 | 11 | 9% | 14 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 14 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 16 |
| ahf.NanoAndrew .4 | 9 | 7% | 36 |
| sam.Samspin 1.0 | 8 | 7% | 13 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.3 | 147 / 210 | 2.06 | 19.9% | 33469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.9% | 147 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 29 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 6 |
| fm.claire 1.7 | 5.5 | 8.9% | 3 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.3% | 2 |
| sample.SpinBot 1.0 | 7.5 | 7.0% | 4 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 25 / 35 | 5549 |
| 2 | 1 | 67.9 | 81.0 | 19 / 35 | 5631 |
| 3 | 1 | 70.3 | 90.5 | 26 / 35 | 5673 |
| 4 | 1 | 70.2 | 91.1 | 25 / 35 | 5502 |
| 5 | 1 | 71.4 | 94.3 | 29 / 35 | 5965 |
| 6 | 1 | 68.5 | 85.1 | 23 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 86% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| sample.SpinBot 1.0 | 7 | 100% |
| fm.claire 1.7 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 32% | 79 |
| gh.nano.Grofvuil 0.2 | 13 | 21% | 32 |
| oog.melee.CapuletDroid 1.1 | 11 | 17% | 47 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 17 |
| fm.claire 1.7 | 6 | 10% | 9 |
| pa.Improved 1.0 | 3 | 5% | 6 |
| sample.SpinBot 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 1 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 11 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 100 / 210 | 2.68 | 18.0% | 33503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 18.0% | 100 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 25 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 42 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 4 |
| el.JumpShoot 0.2 | 6.5 | 7.0% | 3 |
| caimano.Furia_Ceca 0.22 | 7.0 | 6.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.1% | 3 |
| acogdev.alpha 0.2 | 8.8 | 6.2% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 21 / 35 | 6145 |
| 2 | 2 | 62.4 | 68.3 | 12 / 35 | 4870 |
| 3 | 1 | 66.2 | 78.7 | 16 / 35 | 4986 |
| 4 | 1 | 68.4 | 82.2 | 18 / 35 | 5971 |
| 5 | 1 | 68.1 | 85.4 | 16 / 35 | 5490 |
| 6 | 1 | 69.1 | 85.1 | 17 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 87% |
| mz.MicroGodMelee 1 | 42 | 48% |
| gh.micro.Gruweltje 0.7 | 26 | 69% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 80% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 30% | 51 |
| gh.micro.Gruweltje 0.7 | 29 | 26% | 58 |
| spinnercat.micro.Tyger 0.1 | 21 | 19% | 56 |
| acogdev.alpha 0.2 | 8 | 7% | 9 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 7 |
| fire219.CatBot 1.0 | 6 | 5% | 6 |
| mbro.Detektor3 0.1.1 | 5 | 4% | 9 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 9 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.4 | 98 / 210 | 3.67 | 16.1% | 29540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 16.1% | 98 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 27 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.4% | 5 |
| germ.TheMind .2 | 5.7 | 9.6% | 9 |
| awesomeness.Elite 1.0 | 6.2 | 8.8% | 10 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.4% | 3 |
| sample.Crazy 1.0 | 8.7 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 74.6 | 18 / 35 | 5495 |
| 2 | 1 | 65.3 | 75.6 | 20 / 35 | 4748 |
| 3 | 1 | 62.7 | 65.7 | 16 / 35 | 4482 |
| 4 | 2 | 64.0 | 70.2 | 14 / 35 | 4876 |
| 5 | 1 | 63.9 | 69.5 | 15 / 35 | 5187 |
| 6 | 1 | 62.9 | 66.7 | 15 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| awesomeness.Elite 1.0 | 8 | 63% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 49% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 9% | 24 |
| germ.TheMind .2 | 10 | 9% | 21 |
| awesomeness.Elite 1.0 | 10 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 9 | 8% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 9 |
| sample.Crazy 1.0 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.2 | 160 / 210 | 1.97 | 20.3% | 30836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.3% | 160 |
| rz.HawkOnFire 0.1 | 2.2 | 13.0% | 9 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.7% | 10 |
| maribo.IotaCT 1.1 | 4.2 | 10.7% | 8 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.7% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 8.1% | 0 |
| ratosh.Wesco 1.4 | 8.0 | 8.1% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.6% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.7 | 25 / 35 | 5454 |
| 2 | 1 | 70.3 | 87.6 | 28 / 35 | 4707 |
| 3 | 1 | 69.6 | 85.7 | 24 / 35 | 5097 |
| 4 | 1 | 69.9 | 85.1 | 25 / 35 | 5007 |
| 5 | 1 | 71.8 | 96.5 | 29 / 35 | 5075 |
| 6 | 1 | 71.3 | 88.6 | 29 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 59 | 98% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| timmit.nano.TimDog 0.33 | 20 | 90% |
| maribo.IotaCT 1.1 | 17 | 88% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 89% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 9 | 18% | 28 |
| maribo.IotaCT 1.1 | 8 | 16% | 20 |
| rz.HawkOnFire 0.1 | 7 | 14% | 54 |
| stelo.PatternRobot 1.0 | 6 | 12% | 20 |
| ratosh.Wesco 1.4 | 6 | 12% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 14 |
| nz.jdc.nano.GridFu 1.0 | 4 | 8% | 45 |
| spinnercat.Omen 1.0 | 3 | 6% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.7 | 173 / 210 | 1.57 | 21.8% | 39221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.8% | 173 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.0% | 14 |
| baal.nano.N 1.42 | 3.0 | 11.2% | 7 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.8 | 9.2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 2 |
| sanja.First 0.1 | 6.5 | 8.2% | 0 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 3 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 0 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 29 / 35 | 6619 |
| 2 | 1 | 71.6 | 93.3 | 30 / 35 | 6336 |
| 3 | 1 | 72.6 | 94.9 | 31 / 35 | 6666 |
| 4 | 1 | 71.5 | 91.7 | 29 / 35 | 6436 |
| 5 | 1 | 71.5 | 94.3 | 26 / 35 | 6592 |
| 6 | 1 | 71.8 | 93.3 | 28 / 35 | 6572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 100% |
| baal.nano.N 1.42 | 34 | 88% |
| cvt.Firsty 1.0 | 30 | 93% |
| sanja.First 0.1 | 22 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 18 | 94% |
| zyx.micro.Ant 1.1 | 16 | 75% |
| sample.RamFire 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 37% | 36 |
| baal.nano.N 1.42 | 10 | 26% | 33 |
| tvv.nano.Polaris 1.2 | 4 | 11% | 56 |
| cvt.Firsty 1.0 | 3 | 8% | 32 |
| sanja.First 0.1 | 2 | 5% | 28 |
| Grystrion.TrackerWO 1.0 | 2 | 5% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 1 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.4 | 94 / 210 | 3.39 | 16.6% | 33022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.6% | 94 |
| kc.micro.Figment 1.0 | 2.2 | 14.5% | 53 |
| cs.Wren 1.0 | 3.0 | 12.7% | 19 |
| js.PinBall 1.6 | 4.2 | 11.0% | 13 |
| mz.Cork 0.1 | 4.8 | 10.8% | 11 |
| joe.ADinosaur 1.0 | 6.3 | 8.9% | 6 |
| evd.X1 0.01 | 6.5 | 8.6% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 8 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.7 | 15 / 35 | 5644 |
| 2 | 1 | 66.3 | 77.5 | 18 / 35 | 5347 |
| 3 | 1 | 65.1 | 72.4 | 13 / 35 | 5707 |
| 4 | 1 | 66.6 | 76.8 | 18 / 35 | 5911 |
| 5 | 1 | 64.5 | 72.4 | 16 / 35 | 5324 |
| 6 | 1 | 63.5 | 69.8 | 14 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 72% |
| cs.Wren 1.0 | 24 | 88% |
| js.PinBall 1.6 | 10 | 60% |
| mz.Cork 0.1 | 9 | 78% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 45% | 106 |
| cs.Wren 1.0 | 19 | 16% | 37 |
| js.PinBall 1.6 | 13 | 11% | 18 |
| evd.X1 0.01 | 11 | 9% | 12 |
| mz.Cork 0.1 | 8 | 7% | 16 |
| joe.ADinosaur 1.0 | 6 | 5% | 6 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.5 | 147 / 210 | 2.12 | 19.9% | 30693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.9% | 147 |
| ntc.Opposite 1.5 | 2.5 | 11.3% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.7% | 4 |
| myl.nano.Graviton 1.10 | 3.8 | 10.9% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.4% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 8 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.4% | 2 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 84.8 | 24 / 35 | 5202 |
| 2 | 1 | 69.7 | 87.6 | 27 / 35 | 4987 |
| 3 | 1 | 68.2 | 82.5 | 23 / 35 | 4987 |
| 4 | 1 | 68.7 | 85.7 | 22 / 35 | 4977 |
| 5 | 1 | 70.4 | 89.8 | 25 / 35 | 5427 |
| 6 | 1 | 71.0 | 94.6 | 26 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 33 | 88% |
| myl.nano.Graviton 1.10 | 30 | 90% |
| ntc.Opposite 1.5 | 24 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 91% |
| disan.Chair 2.2.0 | 16 | 94% |
| DBall.NUKE 0.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 27% | 46 |
| stelo.AreaTargetingBot 1.1 | 11 | 17% | 36 |
| pfvicm.Sobieski 7.2.3b | 11 | 17% | 20 |
| ntc.Opposite 1.5 | 8 | 13% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 13% | 22 |
| DBall.NUKE 0.1 | 3 | 5% | 19 |
| disan.Chair 2.2.0 | 3 | 5% | 18 |
| donjezza.Muncho 1.0 | 1 | 2% | 9 |
| pbg.R2D2 1.0 | 1 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.9 | 82 / 210 | 3.62 | 15.6% | 26474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.5 | 15.6% | 82 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 36 |
| oog.melee.Capulet 1.2 | 3.0 | 13.6% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 22 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 9 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 7 |
| step.nanoPri 1.0 | 7.5 | 6.8% | 2 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.5 | 15 / 35 | 4827 |
| 2 | 2 | 62.9 | 68.3 | 9 / 35 | 4313 |
| 3 | 2 | 63.1 | 66.3 | 13 / 35 | 4300 |
| 4 | 1 | 66.8 | 78.1 | 20 / 35 | 4484 |
| 5 | 1 | 63.8 | 70.2 | 12 / 35 | 4362 |
| 6 | 2 | 62.6 | 66.0 | 13 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 87% |
| oog.melee.Capulet 1.2 | 27 | 44% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 14 | 100% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 2 | 50% |

Hadur died in 129 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 37% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 45 |
| yagami.Tidus 0.11 | 18 | 14% | 30 |
| kawigi.micro.Shiz 1.1 | 17 | 13% | 35 |
| ejb.Polaris 1.0.1 | 9 | 7% | 15 |
| stelo.MirrorNano 1.3 | 9 | 7% | 9 |
| step.nanoPri 1.0 | 4 | 3% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.9 | 139 / 210 | 2.45 | 18.3% | 27974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.3% | 139 |
| bzdp.Pansy 2.1 | 2.3 | 12.2% | 24 |
| ratosh.Nobo 0.21 | 3.5 | 11.3% | 8 |
| wompi.Quokka 1.6 | 3.8 | 11.5% | 17 |
| wee.Gem 1.8.4 | 4.5 | 10.8% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.6% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.5 | 25 / 35 | 4618 |
| 2 | 1 | 69.3 | 90.8 | 24 / 35 | 4837 |
| 3 | 1 | 68.6 | 88.9 | 26 / 35 | 4858 |
| 4 | 1 | 66.4 | 80.0 | 22 / 35 | 4702 |
| 5 | 1 | 66.2 | 79.0 | 21 / 35 | 4483 |
| 6 | 1 | 66.8 | 81.3 | 21 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 87% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 20 | 80% |
| ratosh.Nobo 0.21 | 18 | 100% |
| m3thos.Eva00 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 25% | 69 |
| bayen.UbaMicro 1.4 | 10 | 14% | 15 |
| wompi.Quokka 1.6 | 9 | 13% | 17 |
| ratosh.Nobo 0.21 | 8 | 11% | 26 |
| m3thos.Eva00 1.1 | 8 | 11% | 22 |
| maribo.FollowFire 1 | 7 | 10% | 7 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 8 |
| wee.Gem 1.8.4 | 4 | 6% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 88.0 | 132 / 210 | 2.08 | 21.3% | 45784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.3% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 13 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 2 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.3 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 88.6 | 17 / 35 | 8258 |
| 2 | 1 | 74.4 | 97.5 | 30 / 35 | 7516 |
| 3 | 1 | 73.8 | 92.1 | 24 / 35 | 7923 |
| 4 | 1 | 71.6 | 84.4 | 23 / 35 | 7343 |
| 5 | 1 | 71.7 | 85.4 | 21 / 35 | 7147 |
| 6 | 1 | 70.9 | 80.3 | 17 / 35 | 7597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 79% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 49% | 140 |
| mz.NanoGod 2.02 | 25 | 32% | 38 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 14 |
| ayk.WallHugger 1.0 | 6 | 8% | 8 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.3 | 103 / 210 | 3.40 | 16.6% | 28161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.6% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.7% | 25 |
| bvh.micro.Freya 0.3 | 3.5 | 12.0% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.3% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.2% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.0% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 9 |
| dl.BetterWalls 1.0 | 8.7 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.4 | 19 / 35 | 5024 |
| 2 | 1 | 65.8 | 77.1 | 18 / 35 | 4692 |
| 3 | 1 | 65.7 | 76.5 | 19 / 35 | 4606 |
| 4 | 1 | 63.7 | 70.2 | 16 / 35 | 4466 |
| 5 | 1 | 61.3 | 65.4 | 14 / 35 | 4121 |
| 6 | 1 | 65.5 | 72.1 | 17 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 88% |
| dummy.micro.Sparrow 2.5 | 23 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 23 | 78% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 48 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 34 |
| bvh.micro.Freya 0.3 | 16 | 15% | 29 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 41 |
| conscience.Electron 1.3g | 13 | 12% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 15 |
| dl.BetterWalls 1.0 | 12 | 11% | 14 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 82.3 | 145 / 210 | 2.59 | 20.3% | 39913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.3% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.8% | 24 |
| sul.Lunar 1.1 | 3.0 | 11.8% | 11 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.4% | 11 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.8% | 8 |
| dsw.StaticD 1.0 | 6.0 | 8.9% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 0 |
| sample.Corners 1.0 | 9.3 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 67.6 | 20 / 35 | 5793 |
| 2 | 1 | 71.7 | 86.7 | 27 / 35 | 6938 |
| 3 | 1 | 71.9 | 86.3 | 25 / 35 | 7438 |
| 4 | 1 | 70.1 | 82.9 | 21 / 35 | 6702 |
| 5 | 1 | 71.0 | 85.4 | 25 / 35 | 6891 |
| 6 | 1 | 70.0 | 85.1 | 27 / 35 | 6151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 45 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 90% |
| supersample.SuperBoxBot 1.0 | 23 | 96% |
| dsw.StaticD 1.0 | 14 | 71% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 31% | 58 |
| supersample.SuperBoxBot 1.0 | 17 | 26% | 34 |
| dsw.StaticD 1.0 | 9 | 14% | 24 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 13 |
| sul.Lunar 1.1 | 5 | 8% | 56 |
| sample.Corners 1.0 | 3 | 5% | 6 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 77.7 | 107 / 210 | 3.00 | 17.7% | 35210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.7% | 107 |
| radnor.DoctorBob 1.42 | 2.5 | 12.9% | 28 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 23 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 14 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.4% | 8 |
| sample.Walls 1.0 | 7.3 | 7.8% | 7 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 7 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 74.3 | 17 / 35 | 5538 |
| 2 | 1 | 66.4 | 75.2 | 21 / 35 | 5531 |
| 3 | 1 | 66.2 | 76.5 | 16 / 35 | 5940 |
| 4 | 1 | 68.0 | 82.2 | 20 / 35 | 6045 |
| 5 | 1 | 68.8 | 81.9 | 18 / 35 | 6486 |
| 6 | 1 | 65.3 | 76.2 | 15 / 35 | 5670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 85% |
| radnor.DoctorBob 1.42 | 32 | 88% |
| mld.Wisdom 1.0 | 13 | 77% |
| sample.Walls 1.0 | 12 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 25% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 22% | 61 |
| radnor.DoctorBob 1.42 | 20 | 19% | 52 |
| amz.NanoClone 1.41 | 12 | 12% | 15 |
| KiraNL.Chupacabra 0.4 | 11 | 11% | 19 |
| jangs.ns51 1.0 | 5 | 5% | 8 |
| sample.Walls 1.0 | 4 | 4% | 12 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

