# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.1 | 158 / 210 | 1.90 | 21.8% | 43451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.8% | 158 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 23 |
| mz.AntiGrav 1.0 | 3.0 | 13.9% | 13 |
| mld.Infinity 2.2 | 3.8 | 12.4% | 8 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| sample.Walls 1.0 | 7.0 | 6.7% | 4 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 87.9 | 25 / 35 | 7557 |
| 2 | 1 | 71.8 | 86.0 | 25 / 35 | 6886 |
| 3 | 1 | 74.2 | 94.9 | 29 / 35 | 7834 |
| 4 | 1 | 69.9 | 82.5 | 19 / 35 | 6712 |
| 5 | 1 | 74.5 | 94.0 | 31 / 35 | 7510 |
| 6 | 1 | 73.2 | 94.9 | 29 / 35 | 6952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 94% |
| mld.Infinity 2.2 | 46 | 91% |
| radnor.DoctorBob 1.42 | 44 | 80% |
| amz.NanoClone 1.41 | 10 | 90% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 50% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 40% | 68 |
| mz.AntiGrav 1.0 | 12 | 23% | 88 |
| mld.Infinity 2.2 | 7 | 13% | 10 |
| amz.NanoClone 1.41 | 3 | 6% | 15 |
| jangs.ns51 1.0 | 3 | 6% | 9 |
| arthord.MannyPacquiao Beta | 2 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| sample.Target 1.0 | 1 | 2% | 0 |

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.4 | 159 / 210 | 1.86 | 19.7% | 30873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.7% | 159 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 30 |
| mld.DustBunny 3.8 | 3.7 | 12.4% | 12 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 0 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.3% | 3 |
| fullsail.SweetTea 1.1 | 8.0 | 7.2% | 2 |
| bzdp.BoxCar 2.0 | 8.0 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.1 | 25 / 35 | 4972 |
| 2 | 1 | 70.3 | 90.2 | 27 / 35 | 5519 |
| 3 | 1 | 66.9 | 82.5 | 22 / 35 | 4966 |
| 4 | 1 | 68.7 | 86.3 | 25 / 35 | 4718 |
| 5 | 1 | 70.6 | 92.4 | 28 / 35 | 5390 |
| 6 | 1 | 71.8 | 99.0 | 32 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 91 | 90% |
| mld.DustBunny 3.8 | 55 | 93% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 16 | 31% | 98 |
| mld.DustBunny 3.8 | 10 | 20% | 62 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 18% | 15 |
| maribo.melee.BMV 0.1 | 4 | 8% | 9 |
| zyx.nano.Ant 1.1 | 4 | 8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 3 | 6% | 5 |
| fullsail.SweetTea 1.1 | 2 | 4% | 9 |
| bzdp.BoxCar 2.0 | 2 | 4% | 3 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.4 | 138 / 210 | 2.40 | 19.9% | 35417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.9% | 138 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.1% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 10 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 0 |
| sample.Tracker 1.0 | 9.2 | 5.0% | 0 |
| sample.Fire 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 80.0 | 21 / 35 | 6425 |
| 2 | 1 | 71.8 | 91.7 | 28 / 35 | 6136 |
| 3 | 1 | 69.5 | 84.8 | 23 / 35 | 5285 |
| 4 | 1 | 70.1 | 85.4 | 22 / 35 | 6286 |
| 5 | 1 | 71.6 | 92.1 | 25 / 35 | 6036 |
| 6 | 1 | 66.5 | 72.7 | 19 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 78 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 78% |
| myl.nano.KomoriNinja 1.1 | 24 | 92% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 26% | 97 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 25% | 33 |
| cb.nano.Insomnia 1.0 | 13 | 18% | 15 |
| sample.Fire 1.0 | 6 | 8% | 10 |
| fm.mammillarias 1.3 | 5 | 7% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 6% | 27 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 10 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 9 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.3 | 156 / 210 | 2.14 | 21.0% | 40220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.0% | 156 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.9% | 6 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.3% | 12 |
| tj.zombie1n 1.0.1 | 4.3 | 9.7% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.1% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.2% | 11 |
| yk.JahMicro 1.0 | 6.8 | 8.3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.4% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.7 | 25 / 35 | 6396 |
| 2 | 1 | 70.9 | 86.0 | 25 / 35 | 6895 |
| 3 | 1 | 70.5 | 88.3 | 27 / 35 | 6186 |
| 4 | 1 | 73.1 | 95.2 | 28 / 35 | 7287 |
| 5 | 1 | 69.6 | 79.7 | 26 / 35 | 6647 |
| 6 | 1 | 71.4 | 88.9 | 25 / 35 | 6809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 89% |
| stelo.SoJNanoMelee 1.1 | 28 | 93% |
| tj.zombie1n 1.0.1 | 22 | 82% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| yk.JahMicro 1.0 | 11 | 82% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 33% | 88 |
| tj.zombie1n 1.0.1 | 10 | 19% | 14 |
| tvv.micro.Antares 1.1.1 | 8 | 15% | 29 |
| stelo.SoJNanoMelee 1.1 | 6 | 11% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 18 |
| yk.JahMicro 1.0 | 4 | 7% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 12 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.1 | 111 / 210 | 3.60 | 16.7% | 30160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.7% | 111 |
| oog.melee.Corsair 1.0 | 2.0 | 12.7% | 28 |
| ahf.NanoAndrew .4 | 3.7 | 11.2% | 23 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.0% | 20 |
| EBBU.Sim2 1.02 | 5.2 | 10.0% | 3 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.4% | 4 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 13 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.2 | 20 / 35 | 4492 |
| 2 | 1 | 64.7 | 70.2 | 18 / 35 | 4973 |
| 3 | 1 | 63.0 | 66.7 | 14 / 35 | 4757 |
| 4 | 1 | 67.2 | 76.5 | 22 / 35 | 5519 |
| 5 | 1 | 65.9 | 72.7 | 20 / 35 | 5438 |
| 6 | 1 | 64.5 | 70.2 | 17 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 50 | 82% |
| simonton.nano.MeleeSeed 1.8 | 36 | 86% |
| ahf.NanoAndrew .4 | 15 | 100% |
| EBBU.Sim2 1.02 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| sam.Samspin 1.0 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 30% | 60 |
| oog.melee.Corsair 1.0 | 20 | 20% | 57 |
| zyx.nano.BacillusComma 1.0 | 12 | 12% | 14 |
| robar.nano.Assertive_Melee 0.2 | 11 | 11% | 19 |
| ahf.NanoAndrew .4 | 8 | 8% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 7% | 7 |
| EBBU.Sim2 1.02 | 5 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |
| sam.Samspin 1.0 | 3 | 3% | 9 |

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 149 / 210 | 2.05 | 19.8% | 32695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.8% | 149 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 12 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 3 |
| fm.claire 1.7 | 6.3 | 8.4% | 1 |
| pa.Improved 1.0 | 8.0 | 6.2% | 0 |
| sample.SpinBot 1.0 | 9.3 | 5.4% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 27 / 35 | 5808 |
| 2 | 1 | 70.5 | 90.8 | 25 / 35 | 5488 |
| 3 | 1 | 69.3 | 87.0 | 26 / 35 | 5036 |
| 4 | 1 | 68.7 | 84.4 | 23 / 35 | 5221 |
| 5 | 1 | 70.4 | 92.1 | 27 / 35 | 5281 |
| 6 | 1 | 68.7 | 82.2 | 21 / 35 | 5861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 80% |
| oog.melee.CapuletDroid 1.1 | 34 | 100% |
| gh.nano.Grofvuil 0.2 | 20 | 85% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 39% | 105 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 30 |
| oog.melee.CapuletDroid 1.1 | 9 | 15% | 16 |
| fm.claire 1.7 | 4 | 7% | 11 |
| kurios.DOSexe .9b | 4 | 7% | 10 |
| arthord.NanoSatanMelee Beta | 3 | 5% | 14 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 11 |
| sample.SpinBot 1.0 | 3 | 5% | 4 |
| pa.Improved 1.0 | 2 | 3% | 7 |

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.3 | 121 / 210 | 2.41 | 18.9% | 34195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.9% | 121 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.7% | 40 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.6% | 25 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 15 |
| DBall.Anarchy 0.1 | 5.5 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.4% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 3 |
| acogdev.alpha 0.2 | 8.5 | 5.5% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.7 | 15 / 35 | 5395 |
| 2 | 1 | 70.2 | 89.2 | 21 / 35 | 6125 |
| 3 | 1 | 70.2 | 87.0 | 23 / 35 | 5856 |
| 4 | 1 | 68.7 | 82.9 | 17 / 35 | 5961 |
| 5 | 1 | 68.7 | 84.1 | 23 / 35 | 5164 |
| 6 | 1 | 69.0 | 83.8 | 22 / 35 | 5694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 65 | 62% |
| mz.MicroGodMelee 1 | 56 | 93% |
| gh.micro.Gruweltje 0.7 | 32 | 69% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 33% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 37 | 42% | 71 |
| mz.MicroGodMelee 1 | 17 | 19% | 61 |
| gh.micro.Gruweltje 0.7 | 17 | 19% | 51 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 4 | 4% | 3 |
| DBall.Anarchy 0.1 | 3 | 3% | 6 |
| acogdev.alpha 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 69.6 | 97 / 210 | 3.74 | 16.1% | 30043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 16.1% | 97 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.1% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.6% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 10.2% | 10 |
| germ.TheMind .2 | 5.0 | 9.7% | 5 |
| awesomeness.Elite 1.0 | 6.5 | 8.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.4% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 56.5 | 12 / 35 | 5073 |
| 2 | 2 | 61.2 | 63.2 | 12 / 35 | 4373 |
| 3 | 1 | 65.7 | 74.0 | 19 / 35 | 5155 |
| 4 | 1 | 62.6 | 64.4 | 16 / 35 | 4619 |
| 5 | 1 | 67.1 | 79.0 | 18 / 35 | 5287 |
| 6 | 1 | 67.7 | 80.3 | 20 / 35 | 5536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 69% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| awesomeness.Elite 1.0 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 53% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 36 |
| awesomeness.Elite 1.0 | 11 | 10% | 19 |
| germ.TheMind .2 | 8 | 7% | 17 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 9 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 6 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.5 | 155 / 210 | 2.13 | 20.1% | 31924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.4% | 14 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 10 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.7% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 7.7% | 3 |
| ratosh.Wesco 1.4 | 7.5 | 7.9% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 7.3% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.2 | 28 / 35 | 5196 |
| 2 | 1 | 68.4 | 81.0 | 22 / 35 | 4952 |
| 3 | 1 | 70.7 | 87.9 | 25 / 35 | 5448 |
| 4 | 1 | 70.7 | 89.8 | 26 / 35 | 5391 |
| 5 | 1 | 72.1 | 92.1 | 28 / 35 | 5621 |
| 6 | 1 | 70.4 | 84.8 | 26 / 35 | 5316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 95% |
| nz.jdc.nano.GridFu 1.0 | 39 | 90% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| maribo.IotaCT 1.1 | 12 | 92% |
| timmit.nano.TimDog 0.33 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 63 |
| stelo.PatternRobot 1.0 | 12 | 22% | 21 |
| nz.jdc.nano.GridFu 1.0 | 10 | 18% | 62 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 12 |
| ratosh.Wesco 1.4 | 5 | 9% | 13 |
| maribo.IotaCT 1.1 | 4 | 7% | 29 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 88.5 | 166 / 210 | 2.04 | 21.5% | 41518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.5% | 166 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 10 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.6% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 7 |
| sanja.First 0.1 | 6.5 | 8.1% | 2 |
| cvt.Firsty 1.0 | 7.7 | 7.0% | 5 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 78.4 | 25 / 35 | 6353 |
| 2 | 1 | 71.1 | 89.2 | 25 / 35 | 6756 |
| 3 | 1 | 72.6 | 93.3 | 30 / 35 | 7105 |
| 4 | 1 | 71.5 | 86.7 | 26 / 35 | 7307 |
| 5 | 1 | 71.3 | 88.9 | 28 / 35 | 6641 |
| 6 | 1 | 73.3 | 94.3 | 32 / 35 | 7356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 94% |
| baal.nano.N 1.42 | 34 | 97% |
| cvt.Firsty 1.0 | 26 | 96% |
| zyx.micro.Ant 1.1 | 23 | 91% |
| sanja.First 0.1 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 22% | 37 |
| baal.nano.N 1.42 | 8 | 18% | 32 |
| Grystrion.TrackerWO 1.0 | 8 | 18% | 20 |
| tvv.nano.Polaris 1.2 | 4 | 9% | 51 |
| cvt.Firsty 1.0 | 4 | 9% | 22 |
| sample.RamFire 1.0 | 4 | 9% | 6 |
| sanja.First 0.1 | 3 | 7% | 25 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 64.8 | 59 / 210 | 4.17 | 14.5% | 29801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 89 |
| hadur117.micro.SaorWD1 0.1 | 2.2 | 14.5% | 59 |
| cs.Wren 1.0 | 3.2 | 12.5% | 23 |
| mz.Cork 0.1 | 4.2 | 11.3% | 13 |
| js.PinBall 1.6 | 4.7 | 11.0% | 15 |
| joe.ADinosaur 1.0 | 5.7 | 9.3% | 3 |
| evd.X1 0.01 | 7.0 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 8.7 | 6.0% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.9 | 16 / 35 | 5273 |
| 2 | 2 | 62.7 | 67.0 | 10 / 35 | 5107 |
| 3 | 2 | 61.3 | 63.8 | 9 / 35 | 4850 |
| 4 | 3 | 56.1 | 52.1 | 3 / 35 | 4497 |
| 5 | 2 | 64.9 | 74.6 | 10 / 35 | 5341 |
| 6 | 3 | 59.1 | 55.2 | 11 / 35 | 4733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 77 | 38% |
| donjezza.Jezza 1.0 | 10 | 70% |
| mz.Cork 0.1 | 8 | 88% |
| cs.Wren 1.0 | 8 | 75% |
| js.PinBall 1.6 | 7 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 90 | 60% | 121 |
| evd.X1 0.01 | 16 | 11% | 15 |
| cs.Wren 1.0 | 13 | 9% | 20 |
| mz.Cork 0.1 | 8 | 5% | 12 |
| joe.ADinosaur 1.0 | 8 | 5% | 12 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 10 |
| js.PinBall 1.6 | 3 | 2% | 9 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.3 | 140 / 210 | 2.41 | 19.2% | 30614 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.2% | 140 |
| myl.nano.Graviton 1.10 | 2.5 | 12.0% | 21 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.4% | 3 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.0% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.6% | 18 |
| disan.Chair 2.2.0 | 6.5 | 8.6% | 7 |
| DBall.NUKE 0.1 | 7.7 | 7.5% | 3 |
| donjezza.Muncho 1.0 | 9.3 | 6.0% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.5 | 24 / 35 | 4645 |
| 2 | 1 | 69.1 | 85.7 | 24 / 35 | 5353 |
| 3 | 1 | 68.3 | 80.0 | 23 / 35 | 5325 |
| 4 | 1 | 66.7 | 78.7 | 20 / 35 | 4789 |
| 5 | 1 | 69.7 | 90.8 | 22 / 35 | 5244 |
| 6 | 1 | 69.6 | 87.3 | 27 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 87% |
| ntc.Opposite 1.5 | 23 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 95% |
| stelo.AreaTargetingBot 1.1 | 16 | 50% |
| donjezza.Muncho 1.0 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 93% |
| DBall.NUKE 0.1 | 13 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 5 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 23% | 38 |
| pfvicm.Sobieski 7.2.3b | 16 | 23% | 24 |
| myl.nano.Graviton 1.10 | 10 | 14% | 51 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 13% | 25 |
| ntc.Opposite 1.5 | 8 | 11% | 26 |
| donjezza.Muncho 1.0 | 6 | 8% | 18 |
| disan.Chair 2.2.0 | 3 | 4% | 10 |
| pbg.R2D2 1.0 | 2 | 3% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.2 | 98 / 210 | 3.50 | 15.8% | 25147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.5 | 15.8% | 98 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.3% | 38 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 31 |
| yagami.Tidus 0.11 | 4.2 | 12.4% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 24 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 5 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.7 | 17 / 35 | 4028 |
| 2 | 1 | 64.7 | 72.4 | 15 / 35 | 4430 |
| 3 | 1 | 66.0 | 77.5 | 20 / 35 | 4027 |
| 4 | 4 | 60.6 | 57.8 | 13 / 35 | 3727 |
| 5 | 1 | 66.8 | 79.0 | 18 / 35 | 4613 |
| 6 | 1 | 64.9 | 73.0 | 15 / 35 | 4322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 42 | 88% |
| oog.melee.Capulet 1.2 | 23 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 91% |
| yagami.Tidus 0.11 | 19 | 74% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 112 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 37% | 67 |
| yagami.Tidus 0.11 | 20 | 18% | 38 |
| kawigi.micro.Shiz 1.1 | 18 | 16% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 8% | 38 |
| ejb.Polaris 1.0.1 | 9 | 8% | 13 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.2 | 136 / 210 | 2.87 | 17.7% | 27578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.7% | 136 |
| bzdp.Pansy 2.1 | 2.5 | 12.6% | 15 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 27 |
| ratosh.Nobo 0.21 | 4.3 | 10.9% | 5 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 12 |
| m3thos.Eva00 1.1 | 5.5 | 9.8% | 10 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.3 | 21 / 35 | 4504 |
| 2 | 1 | 66.4 | 80.0 | 24 / 35 | 4365 |
| 3 | 1 | 67.1 | 79.7 | 22 / 35 | 4928 |
| 4 | 1 | 68.1 | 82.2 | 22 / 35 | 5227 |
| 5 | 1 | 64.7 | 73.0 | 22 / 35 | 4199 |
| 6 | 1 | 67.7 | 86.0 | 25 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 94% |
| wee.Gem 1.8.4 | 25 | 88% |
| wompi.Quokka 1.6 | 20 | 80% |
| m3thos.Eva00 1.1 | 19 | 79% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 14 | 19% | 16 |
| bzdp.Pansy 2.1 | 11 | 15% | 67 |
| wee.Gem 1.8.4 | 10 | 13% | 35 |
| wompi.Quokka 1.6 | 10 | 13% | 19 |
| stelo.MyAgileRobot 0.2 | 10 | 13% | 15 |
| bayen.UbaMicro 1.4 | 8 | 11% | 16 |
| m3thos.Eva00 1.1 | 7 | 9% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 7 |
| ratosh.Nobo 0.21 | 2 | 3% | 15 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 85.9 | 79 / 210 | 2.27 | 21.3% | 52800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.3% | 79 |
| wompi.Wallaby 5.1 | 2.0 | 19.8% | 121 |
| mz.NanoGod 2.02 | 3.0 | 13.4% | 5 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 8.9% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 85.7 | 15 / 35 | 8220 |
| 2 | 1 | 72.2 | 83.5 | 13 / 35 | 8825 |
| 3 | 1 | 72.8 | 85.7 | 13 / 35 | 9010 |
| 4 | 1 | 72.3 | 83.5 | 13 / 35 | 8441 |
| 5 | 1 | 72.5 | 86.0 | 8 / 35 | 9283 |
| 6 | 1 | 74.0 | 91.1 | 17 / 35 | 9021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 139 | 35% |
| mz.NanoGod 2.02 | 15 | 100% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 105 | 80% | 155 |
| mz.NanoGod 2.02 | 13 | 10% | 28 |
| exauge.GateKeeper 1.1.121g | 6 | 5% | 11 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| ayk.WallHugger 1.0 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |
| sample.SittingDuck 1.0 | 1 | 1% | 0 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.4 | 114 / 210 | 3.12 | 17.2% | 28563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.2% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.8% | 30 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.3% | 21 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 17 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.0% | 5 |
| conscience.Electron 1.3g | 7.2 | 7.4% | 4 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 4 |
| dl.BetterWalls 1.0 | 8.8 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 23 / 35 | 4767 |
| 2 | 1 | 64.6 | 73.7 | 19 / 35 | 4310 |
| 3 | 1 | 65.9 | 77.8 | 17 / 35 | 4933 |
| 4 | 1 | 66.3 | 76.2 | 20 / 35 | 4842 |
| 5 | 1 | 64.9 | 71.7 | 18 / 35 | 4832 |
| 6 | 1 | 65.6 | 75.2 | 17 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 75% |
| dummy.micro.Sparrow 2.5 | 31 | 94% |
| bvh.micro.Freya 0.3 | 22 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 81% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 4 | 75% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 30 | 31% | 73 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 18% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 17% | 32 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 41 |
| bvh.micro.Freya 0.3 | 9 | 9% | 21 |
| conscience.Electron 1.3g | 6 | 6% | 9 |
| dl.BetterWalls 1.0 | 4 | 4% | 9 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 9 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 83.8 | 143 / 210 | 2.46 | 21.0% | 43065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.0% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 19 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 15 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.0% | 16 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.0% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.9% | 2 |
| tlp.ThreeLeggedPig 1 | 6.3 | 8.1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.6% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 2 |
| sample.Corners 1.0 | 9.8 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 86.7 | 24 / 35 | 7761 |
| 2 | 1 | 70.8 | 82.5 | 24 / 35 | 7242 |
| 3 | 1 | 69.8 | 79.0 | 20 / 35 | 7038 |
| 4 | 1 | 69.7 | 79.0 | 21 / 35 | 6780 |
| 5 | 1 | 72.3 | 89.8 | 29 / 35 | 6913 |
| 6 | 1 | 71.6 | 85.4 | 25 / 35 | 7331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 48 | 90% |
| sul.Lunar 1.1 | 40 | 95% |
| supersample.SuperBoxBot 1.0 | 32 | 81% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| dsw.StaticD 1.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 41% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 19% | 57 |
| sul.Lunar 1.1 | 7 | 10% | 39 |
| mme.NikeEnhanced 2.0 | 7 | 10% | 18 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 16 |
| dsw.StaticD 1.0 | 3 | 4% | 14 |
| sample.Corners 1.0 | 1 | 1% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 82.2 | 128 / 210 | 2.60 | 19.2% | 38957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.2% | 128 |
| mld.Wisdom 1.0 | 2.7 | 11.9% | 18 |
| radnor.DoctorBob 1.42 | 2.7 | 12.7% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.4% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 7 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 8 |
| GarmBox.Oranges 1.0 | 7.3 | 7.7% | 1 |
| sample.Walls 1.0 | 8.0 | 7.3% | 4 |
| jangs.ns51 1.0 | 8.7 | 5.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 82.5 | 23 / 35 | 6676 |
| 2 | 1 | 66.3 | 75.2 | 19 / 35 | 5903 |
| 3 | 1 | 69.9 | 82.5 | 20 / 35 | 7363 |
| 4 | 1 | 69.7 | 85.7 | 22 / 35 | 6574 |
| 5 | 1 | 69.6 | 84.8 | 25 / 35 | 6164 |
| 6 | 1 | 68.8 | 82.2 | 19 / 35 | 6277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 92% |
| radnor.DoctorBob 1.42 | 44 | 73% |
| mld.Wisdom 1.0 | 17 | 82% |
| amz.NanoClone 1.41 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 10 | 80% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 67% |

Hadur died in 84 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 26% | 53 |
| mld.Wisdom 1.0 | 16 | 19% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 17% | 62 |
| KiraNL.Chupacabra 0.4 | 14 | 17% | 22 |
| amz.NanoClone 1.41 | 7 | 8% | 11 |
| jangs.ns51 1.0 | 6 | 7% | 9 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| sample.Target 1.0 | 1 | 1% | 0 |

