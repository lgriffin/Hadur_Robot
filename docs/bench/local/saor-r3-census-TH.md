# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 88.5 | 150 / 210 | 2.03 | 21.1% | 42407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 21.1% | 150 |
| mz.AntiGrav 1.0 | 2.5 | 14.5% | 13 |
| radnor.DoctorBob 1.42 | 2.5 | 14.7% | 22 |
| mld.Infinity 2.2 | 4.0 | 12.7% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 3 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| sample.Walls 1.0 | 7.0 | 6.4% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 5 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 81.0 | 23 / 35 | 6455 |
| 2 | 1 | 71.0 | 85.7 | 22 / 35 | 6790 |
| 3 | 1 | 73.0 | 93.7 | 29 / 35 | 6945 |
| 4 | 1 | 73.1 | 91.4 | 27 / 35 | 7531 |
| 5 | 1 | 72.9 | 91.7 | 24 / 35 | 7561 |
| 6 | 1 | 72.4 | 87.6 | 25 / 35 | 7125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 100% |
| mld.Infinity 2.2 | 38 | 84% |
| radnor.DoctorBob 1.42 | 35 | 86% |
| amz.NanoClone 1.41 | 12 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 48% | 79 |
| mld.Infinity 2.2 | 16 | 27% | 26 |
| amz.NanoClone 1.41 | 6 | 10% | 15 |
| mz.AntiGrav 1.0 | 4 | 7% | 68 |
| sample.Walls 1.0 | 2 | 3% | 10 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.4 | 123 / 210 | 2.40 | 18.5% | 30966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 18.5% | 123 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 54 |
| mld.DustBunny 3.8 | 2.8 | 14.0% | 13 |
| maribo.melee.BMV 0.1 | 4.0 | 10.9% | 8 |
| zyx.nano.Ant 1.1 | 5.2 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.0% | 3 |
| fullsail.SweetTea 1.1 | 7.5 | 7.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.5% | 5 |
| bzdp.BoxCar 2.0 | 8.5 | 6.7% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 19 / 35 | 5008 |
| 2 | 1 | 66.5 | 83.2 | 17 / 35 | 4708 |
| 3 | 1 | 69.9 | 91.4 | 23 / 35 | 5265 |
| 4 | 1 | 68.9 | 86.0 | 25 / 35 | 5193 |
| 5 | 1 | 69.7 | 90.5 | 24 / 35 | 5191 |
| 6 | 1 | 65.4 | 66.3 | 15 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 74 | 68% |
| mld.DustBunny 3.8 | 56 | 86% |
| zyx.nano.Ant 1.1 | 8 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 36% | 88 |
| mld.DustBunny 3.8 | 20 | 23% | 51 |
| maribo.melee.BMV 0.1 | 9 | 10% | 20 |
| cs.Grudge 1.0 | 8 | 9% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 12 |
| zyx.nano.Ant 1.1 | 5 | 6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 11 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.0 | 157 / 210 | 1.99 | 21.2% | 37709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 21.2% | 157 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 6 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 2 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.1% | 7 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 1 |
| sample.Fire 1.0 | 9.2 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.4 | 28 / 35 | 6749 |
| 2 | 1 | 71.1 | 86.7 | 24 / 35 | 6142 |
| 3 | 1 | 69.5 | 85.4 | 22 / 35 | 5642 |
| 4 | 1 | 72.0 | 92.4 | 28 / 35 | 5984 |
| 5 | 1 | 70.8 | 84.1 | 26 / 35 | 6299 |
| 6 | 1 | 73.1 | 94.0 | 29 / 35 | 6893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 74 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 95% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| myl.nano.KomoriNinja 1.1 | 15 | 87% |
| cs.sheldor.Talon 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 8 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 25% | 87 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 20% | 37 |
| cb.nano.Insomnia 1.0 | 10 | 18% | 11 |
| fm.mammillarias 1.3 | 9 | 16% | 14 |
| myl.nano.KomoriNinja 1.1 | 5 | 9% | 36 |
| cs.sheldor.Talon 1.1 | 4 | 7% | 10 |
| sp.Nanos.Ember 1.1 | 2 | 4% | 10 |
| sample.Fire 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.5 | 151 / 210 | 2.12 | 21.1% | 41635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 21.1% | 151 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.6% | 15 |
| kawigi.nano.Lib 1.0 | 2.8 | 11.9% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.6% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 5.7 | 8.5% | 6 |
| tj.zombie1n 1.0.1 | 6.2 | 8.8% | 6 |
| yk.JahMicro 1.0 | 6.5 | 8.2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.1% | 2 |
| repositorio.NanoStep 1.0 | 9.2 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.0 | 23 / 35 | 7375 |
| 2 | 1 | 71.4 | 89.5 | 24 / 35 | 7170 |
| 3 | 1 | 70.6 | 84.8 | 27 / 35 | 6642 |
| 4 | 1 | 69.4 | 83.2 | 23 / 35 | 6458 |
| 5 | 1 | 71.3 | 88.6 | 27 / 35 | 6874 |
| 6 | 1 | 72.4 | 93.0 | 27 / 35 | 7116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 92% |
| stelo.SoJNanoMelee 1.1 | 49 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 89% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| yk.JahMicro 1.0 | 7 | 57% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 31% | 70 |
| tj.zombie1n 1.0.1 | 8 | 13% | 10 |
| stelo.SoJNanoMelee 1.1 | 7 | 11% | 36 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 30 |
| yk.JahMicro 1.0 | 7 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.8 | 123 / 210 | 3.09 | 17.7% | 31872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 17.7% | 123 |
| ahf.NanoAndrew .4 | 2.7 | 12.1% | 31 |
| oog.melee.Corsair 1.0 | 2.8 | 12.2% | 26 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.9% | 11 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 8 |
| EBBU.Sim2 1.02 | 6.2 | 9.3% | 3 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.3 | 25 / 35 | 5821 |
| 2 | 1 | 67.1 | 79.7 | 23 / 35 | 5203 |
| 3 | 1 | 66.7 | 77.1 | 20 / 35 | 5198 |
| 4 | 1 | 63.6 | 67.3 | 17 / 35 | 5176 |
| 5 | 1 | 66.9 | 79.0 | 21 / 35 | 5088 |
| 6 | 1 | 64.7 | 70.5 | 17 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 100% |
| ahf.NanoAndrew .4 | 33 | 85% |
| oog.melee.Corsair 1.0 | 30 | 70% |
| sam.Samspin 1.0 | 15 | 93% |
| EBBU.Sim2 1.02 | 13 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 24% | 52 |
| oog.melee.Corsair 1.0 | 17 | 20% | 43 |
| ahf.NanoAndrew .4 | 13 | 15% | 46 |
| robar.nano.Assertive_Melee 0.2 | 12 | 14% | 22 |
| EBBU.Sim2 1.02 | 8 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 7 | 8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 7% | 9 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
| sam.Samspin 1.0 | 1 | 1% | 8 |

## Melee bench: F06

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.2 | 151 / 210 | 2.24 | 19.3% | 31045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 19.3% | 151 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 18 |
| gh.nano.Grofvuil 0.2 | 3.7 | 11.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.6% | 23 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.8% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 0 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| pa.Improved 1.0 | 8.5 | 6.4% | 2 |
| sample.SpinBot 1.0 | 9.0 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 23 / 35 | 5249 |
| 2 | 1 | 70.0 | 89.5 | 27 / 35 | 5527 |
| 3 | 1 | 69.0 | 85.7 | 26 / 35 | 5213 |
| 4 | 1 | 67.7 | 87.6 | 25 / 35 | 4382 |
| 5 | 1 | 69.7 | 87.9 | 26 / 35 | 5240 |
| 6 | 1 | 69.0 | 84.8 | 24 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 95% |
| oog.melee.CapuletDroid 1.1 | 31 | 90% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 27% | 87 |
| oog.melee.CapuletDroid 1.1 | 14 | 23% | 21 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 39 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 19 |
| arthord.NanoSatanMelee Beta | 5 | 8% | 17 |
| sample.SpinBot 1.0 | 4 | 7% | 7 |
| fm.claire 1.7 | 3 | 5% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 8 |
| pa.Improved 1.0 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.7 | 85 / 210 | 3.00 | 17.3% | 33111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.2 | 17.3% | 85 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 45 |
| mz.MicroGodMelee 1 | 3.2 | 14.3% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.4% | 24 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.4% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 2 |
| acogdev.alpha 0.2 | 8.5 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.0 | 15 / 35 | 5926 |
| 2 | 2 | 64.1 | 69.2 | 9 / 35 | 5494 |
| 3 | 1 | 65.9 | 77.1 | 16 / 35 | 4818 |
| 4 | 1 | 68.0 | 83.5 | 15 / 35 | 5785 |
| 5 | 1 | 67.9 | 83.2 | 16 / 35 | 5640 |
| 6 | 1 | 65.1 | 72.4 | 14 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 57 | 47% |
| spinnercat.micro.Tyger 0.1 | 41 | 90% |
| gh.micro.Gruweltje 0.7 | 25 | 36% |
| DBall.Anarchy 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 56 | 45% | 87 |
| gh.micro.Gruweltje 0.7 | 34 | 27% | 49 |
| spinnercat.micro.Tyger 0.1 | 23 | 18% | 53 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 70.8 | 114 / 210 | 3.63 | 16.5% | 31517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.5 | 16.5% | 114 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 27 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.5% | 3 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 9 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.1% | 6 |
| germ.TheMind .2 | 6.8 | 8.6% | 4 |
| sample.Crazy 1.0 | 8.8 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.1 | 58.1 | 16 / 35 | 4741 |
| 2 | 3 | 64.9 | 69.2 | 15 / 35 | 5427 |
| 3 | 1 | 66.4 | 76.8 | 20 / 35 | 5386 |
| 4 | 1 | 64.7 | 69.2 | 20 / 35 | 5161 |
| 5 | 1 | 65.3 | 73.3 | 20 / 35 | 5159 |
| 6 | 1 | 67.7 | 78.1 | 23 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 92% |
| sample.Crazy 1.0 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 42% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 20% | 44 |
| awesomeness.Elite 1.0 | 12 | 13% | 21 |
| germ.TheMind .2 | 8 | 8% | 14 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 8 |

## Melee bench: F09

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.4 | 151 / 210 | 2.31 | 19.5% | 30614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 19.5% | 151 |
| rz.HawkOnFire 0.1 | 2.3 | 13.3% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 13 |
| maribo.IotaCT 1.1 | 4.0 | 11.0% | 6 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.4% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 8.0% | 8 |
| spinnercat.Omen 1.0 | 8.7 | 7.3% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.3 | 23 / 35 | 5120 |
| 2 | 1 | 69.8 | 86.7 | 24 / 35 | 4953 |
| 3 | 1 | 69.8 | 87.9 | 27 / 35 | 4820 |
| 4 | 1 | 69.6 | 85.7 | 26 / 35 | 5211 |
| 5 | 1 | 69.0 | 82.9 | 24 / 35 | 5003 |
| 6 | 1 | 71.1 | 87.9 | 27 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 94% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| timmit.nano.TimDog 0.33 | 23 | 83% |
| stelo.PatternRobot 1.0 | 15 | 80% |
| maribo.IotaCT 1.1 | 12 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 13 | 22% | 52 |
| stelo.PatternRobot 1.0 | 11 | 19% | 16 |
| rz.HawkOnFire 0.1 | 10 | 17% | 57 |
| timmit.nano.TimDog 0.33 | 10 | 17% | 35 |
| ratosh.Wesco 1.4 | 9 | 15% | 19 |
| maribo.IotaCT 1.1 | 3 | 5% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.4 | 175 / 210 | 1.78 | 21.5% | 38633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 21.5% | 175 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.9% | 13 |
| baal.nano.N 1.42 | 2.7 | 12.0% | 4 |
| sanja.First 0.1 | 4.7 | 9.1% | 1 |
| Grystrion.TrackerWO 1.0 | 5.5 | 8.9% | 1 |
| zyx.micro.Ant 1.1 | 5.8 | 9.3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.9% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.4% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.5 | 28 / 35 | 6718 |
| 2 | 1 | 72.5 | 94.3 | 32 / 35 | 6446 |
| 3 | 1 | 72.9 | 95.2 | 32 / 35 | 6745 |
| 4 | 1 | 71.5 | 89.8 | 28 / 35 | 6591 |
| 5 | 1 | 70.4 | 89.5 | 25 / 35 | 6290 |
| 6 | 1 | 70.6 | 89.8 | 30 / 35 | 5843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 54 | 96% |
| tvv.nano.Polaris 1.2 | 35 | 91% |
| sanja.First 0.1 | 30 | 100% |
| cvt.Firsty 1.0 | 22 | 95% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| zyx.micro.Ant 1.1 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 23% | 49 |
| zyx.micro.Ant 1.1 | 8 | 23% | 36 |
| baal.nano.N 1.42 | 6 | 17% | 56 |
| Grystrion.TrackerWO 1.0 | 5 | 14% | 12 |
| sanja.First 0.1 | 4 | 11% | 26 |
| cvt.Firsty 1.0 | 1 | 3% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.6 | 71 / 210 | 3.73 | 15.5% | 30740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.5 | 15.5% | 71 |
| kc.micro.Figment 1.0 | 1.5 | 16.2% | 87 |
| cs.Wren 1.0 | 3.3 | 12.3% | 20 |
| mz.Cork 0.1 | 4.3 | 11.2% | 11 |
| js.PinBall 1.6 | 4.3 | 11.1% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.4% | 6 |
| evd.X1 0.01 | 6.8 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.3% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 71.4 | 14 / 35 | 5380 |
| 2 | 2 | 61.6 | 61.9 | 8 / 35 | 5009 |
| 3 | 2 | 64.4 | 71.4 | 14 / 35 | 4978 |
| 4 | 1 | 62.7 | 68.3 | 8 / 35 | 5424 |
| 5 | 1 | 64.2 | 72.1 | 14 / 35 | 5093 |
| 6 | 2 | 64.0 | 72.7 | 13 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 78 | 45% |
| cs.Wren 1.0 | 17 | 94% |
| js.PinBall 1.6 | 8 | 88% |
| mz.Cork 0.1 | 6 | 83% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |

Hadur died in 141 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 76 | 54% | 116 |
| joe.ADinosaur 1.0 | 19 | 13% | 20 |
| mz.Cork 0.1 | 12 | 9% | 16 |
| js.PinBall 1.6 | 10 | 7% | 19 |
| cs.Wren 1.0 | 9 | 6% | 19 |
| evd.X1 0.01 | 9 | 6% | 10 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.9 | 142 / 210 | 2.27 | 19.5% | 30005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 19.5% | 142 |
| myl.nano.Graviton 1.10 | 2.2 | 12.3% | 21 |
| ntc.Opposite 1.5 | 3.3 | 11.0% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.0% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.2% | 13 |
| disan.Chair 2.2.0 | 6.8 | 8.6% | 9 |
| DBall.NUKE 0.1 | 8.0 | 7.3% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 27 / 35 | 5195 |
| 2 | 1 | 67.5 | 81.3 | 20 / 35 | 4721 |
| 3 | 1 | 69.9 | 88.9 | 27 / 35 | 4891 |
| 4 | 1 | 67.8 | 82.5 | 22 / 35 | 4699 |
| 5 | 1 | 69.8 | 89.2 | 27 / 35 | 4849 |
| 6 | 1 | 68.0 | 81.0 | 19 / 35 | 5650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 53 | 91% |
| stelo.AreaTargetingBot 1.1 | 29 | 90% |
| disan.Chair 2.2.0 | 20 | 95% |
| ntc.Opposite 1.5 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| DBall.NUKE 0.1 | 4 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 18 | 26% | 52 |
| ntc.Opposite 1.5 | 12 | 17% | 37 |
| pfvicm.Sobieski 7.2.3b | 12 | 17% | 20 |
| stelo.AreaTargetingBot 1.1 | 10 | 14% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 24 |
| disan.Chair 2.2.0 | 5 | 7% | 19 |
| donjezza.Muncho 1.0 | 4 | 6% | 13 |
| pbg.R2D2 1.0 | 1 | 1% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 7 |

## Melee bench: F13

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.7 | 94 / 210 | 3.55 | 15.7% | 26690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.2 | 15.7% | 94 |
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 47 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.7% | 21 |
| yagami.Tidus 0.11 | 5.3 | 11.5% | 8 |
| ejb.Polaris 1.0.1 | 5.5 | 10.6% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 67.9 | 13 / 35 | 4205 |
| 2 | 1 | 65.7 | 75.6 | 17 / 35 | 4533 |
| 3 | 1 | 64.0 | 67.9 | 18 / 35 | 4517 |
| 4 | 1 | 66.8 | 80.6 | 18 / 35 | 4582 |
| 5 | 2 | 61.6 | 63.2 | 10 / 35 | 4161 |
| 6 | 1 | 65.8 | 74.9 | 18 / 35 | 4692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 57% |
| kawigi.micro.Shiz 1.1 | 29 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 86% |
| yagami.Tidus 0.11 | 16 | 100% |
| ejb.Polaris 1.0.1 | 4 | 50% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 47% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 13% | 41 |
| yagami.Tidus 0.11 | 13 | 11% | 24 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| kawigi.micro.Shiz 1.1 | 10 | 9% | 29 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| step.nanoPri 1.0 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.8 | 133 / 210 | 2.91 | 17.6% | 27733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 17.6% | 133 |
| bzdp.Pansy 2.1 | 2.2 | 12.7% | 14 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 13 |
| wee.Gem 1.8.4 | 4.2 | 11.1% | 21 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 13 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 9.2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.2% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.9 | 25 / 35 | 4330 |
| 2 | 1 | 65.0 | 73.0 | 20 / 35 | 4756 |
| 3 | 1 | 64.9 | 74.9 | 18 / 35 | 4514 |
| 4 | 1 | 64.0 | 72.1 | 18 / 35 | 4207 |
| 5 | 1 | 69.3 | 86.3 | 26 / 35 | 5160 |
| 6 | 1 | 68.3 | 84.4 | 26 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 93% |
| wee.Gem 1.8.4 | 33 | 100% |
| ratosh.Nobo 0.21 | 13 | 92% |
| wompi.Quokka 1.6 | 12 | 92% |
| m3thos.Eva00 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 351. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 12 | 16% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 14% | 15 |
| wompi.Quokka 1.6 | 10 | 13% | 33 |
| ratosh.Nobo 0.21 | 9 | 12% | 24 |
| bayen.UbaMicro 1.4 | 9 | 12% | 13 |
| wee.Gem 1.8.4 | 7 | 9% | 42 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |
| bzdp.Pansy 2.1 | 6 | 8% | 47 |
| maribo.FollowFire 1 | 6 | 8% | 6 |

## Melee bench: F15

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 83.7 | 74 / 210 | 2.47 | 19.6% | 44791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 119 |
| hadur117.micro.SaorTH 0.1 | 1.7 | 19.6% | 74 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 11 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.3% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.5 | 86.3 | 11 / 35 | 7753 |
| 2 | 2 | 68.4 | 75.2 | 10 / 35 | 6998 |
| 3 | 2 | 70.3 | 84.4 | 10 / 35 | 7216 |
| 4 | 1 | 70.8 | 81.0 | 15 / 35 | 7665 |
| 5 | 2 | 71.7 | 86.3 | 12 / 35 | 7522 |
| 6 | 1 | 72.2 | 88.9 | 16 / 35 | 7637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 34% |
| mz.NanoGod 2.02 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 100 | 73% | 151 |
| mz.NanoGod 2.02 | 20 | 15% | 32 |
| exauge.GateKeeper 1.1.121g | 11 | 8% | 16 |
| ayk.WallHugger 1.0 | 3 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.5 | 121 / 210 | 3.12 | 17.3% | 29068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 17.3% | 121 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 21 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.3% | 21 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.1 | 20 / 35 | 5153 |
| 2 | 1 | 66.8 | 76.5 | 24 / 35 | 5078 |
| 3 | 1 | 64.3 | 69.2 | 18 / 35 | 5007 |
| 4 | 1 | 68.6 | 86.3 | 24 / 35 | 4845 |
| 5 | 1 | 64.0 | 72.4 | 14 / 35 | 4613 |
| 6 | 1 | 65.9 | 76.2 | 21 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 89% |
| dummy.micro.Sparrow 2.5 | 42 | 90% |
| bvh.micro.Freya 0.3 | 21 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 85% |
| stelo.MirrorMicro 1.0 | 5 | 40% |
| ap.Frederick 1.1 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 19 | 21% | 57 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 14% | 12 |
| voidious.micro.BlitzBat 1.05 | 12 | 13% | 46 |
| bvh.micro.Freya 0.3 | 12 | 13% | 25 |
| conscience.Electron 1.3g | 9 | 10% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 9% | 31 |
| dl.BetterWalls 1.0 | 8 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 8% | 15 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 91.0 | 169 / 210 | 1.81 | 22.1% | 43446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 22.1% | 169 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.6% | 16 |
| sul.Lunar 1.1 | 3.2 | 11.3% | 9 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.0% | 5 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 4 |
| sample.Corners 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 88.6 | 28 / 35 | 6547 |
| 2 | 1 | 72.0 | 88.6 | 27 / 35 | 7194 |
| 3 | 1 | 72.7 | 92.4 | 28 / 35 | 7312 |
| 4 | 1 | 73.4 | 94.0 | 30 / 35 | 7509 |
| 5 | 1 | 72.6 | 90.8 | 27 / 35 | 7413 |
| 6 | 1 | 72.9 | 91.4 | 29 / 35 | 7471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 74 | 99% |
| sul.Lunar 1.1 | 44 | 100% |
| supersample.SuperBoxBot 1.0 | 22 | 91% |
| dsw.StaticD 1.0 | 11 | 82% |
| tlp.ThreeLeggedPig 1 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 11 | 26% | 73 |
| supersample.SuperBoxBot 1.0 | 10 | 23% | 30 |
| dsw.StaticD 1.0 | 6 | 14% | 21 |
| mme.NikeEnhanced 2.0 | 5 | 12% | 13 |
| tlp.ThreeLeggedPig 1 | 4 | 9% | 11 |
| sul.Lunar 1.1 | 3 | 7% | 50 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.0 | 132 / 210 | 2.53 | 19.3% | 38909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTH 0.1 | 1.0 | 19.3% | 132 |
| mld.Wisdom 1.0 | 2.7 | 13.0% | 19 |
| radnor.DoctorBob 1.42 | 2.7 | 12.8% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.9% | 19 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 6 |
| sample.Walls 1.0 | 7.5 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.8 | 6.6% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 83.8 | 19 / 35 | 6305 |
| 2 | 1 | 66.5 | 76.2 | 17 / 35 | 5957 |
| 3 | 1 | 69.4 | 82.5 | 24 / 35 | 6664 |
| 4 | 1 | 72.9 | 94.3 | 28 / 35 | 7715 |
| 5 | 1 | 68.4 | 80.0 | 23 / 35 | 6405 |
| 6 | 1 | 67.9 | 81.3 | 21 / 35 | 5863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 96% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| mld.Wisdom 1.0 | 24 | 75% |
| amz.NanoClone 1.41 | 15 | 93% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 36% | 46 |
| radnor.DoctorBob 1.42 | 18 | 23% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 15% | 58 |
| KiraNL.Chupacabra 0.4 | 11 | 14% | 22 |
| amz.NanoClone 1.41 | 5 | 6% | 13 |
| jangs.ns51 1.0 | 2 | 3% | 8 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| sample.Walls 1.0 | 1 | 1% | 6 |

