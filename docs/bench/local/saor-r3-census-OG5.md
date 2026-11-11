# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.9 | 146 / 210 | 1.91 | 21.7% | 43994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.7% | 146 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 23 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 17 |
| mld.Infinity 2.2 | 3.5 | 13.1% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 3 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| jangs.ns51 1.0 | 6.7 | 6.4% | 1 |
| sample.Walls 1.0 | 7.7 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |
| sample.Target 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 92.7 | 29 / 35 | 7280 |
| 2 | 1 | 72.9 | 92.1 | 24 / 35 | 7204 |
| 3 | 1 | 72.8 | 90.5 | 23 / 35 | 7335 |
| 4 | 1 | 71.8 | 86.7 | 20 / 35 | 7511 |
| 5 | 1 | 73.0 | 90.5 | 27 / 35 | 7397 |
| 6 | 1 | 72.0 | 87.0 | 23 / 35 | 7267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 55 | 100% |
| mld.Infinity 2.2 | 48 | 79% |
| radnor.DoctorBob 1.42 | 43 | 77% |
| amz.NanoClone 1.41 | 10 | 90% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 48% | 83 |
| mld.Infinity 2.2 | 15 | 23% | 18 |
| mz.AntiGrav 1.0 | 8 | 13% | 70 |
| amz.NanoClone 1.41 | 5 | 8% | 16 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.4 | 142 / 210 | 2.31 | 18.7% | 29563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.2 | 18.7% | 142 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.5% | 40 |
| mld.DustBunny 3.8 | 2.5 | 14.5% | 16 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 1 |
| zyx.nano.Ant 1.1 | 5.2 | 9.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.4% | 7 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 24 / 35 | 5321 |
| 2 | 1 | 67.1 | 82.2 | 25 / 35 | 4174 |
| 3 | 1 | 68.3 | 89.5 | 24 / 35 | 4528 |
| 4 | 1 | 71.7 | 97.5 | 30 / 35 | 5515 |
| 5 | 1 | 69.6 | 90.2 | 27 / 35 | 4771 |
| 6 | 2 | 63.1 | 62.2 | 12 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 77 | 81% |
| mld.DustBunny 3.8 | 69 | 84% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 83% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 35% | 87 |
| mld.DustBunny 3.8 | 12 | 17% | 72 |
| zyx.nano.Ant 1.1 | 8 | 12% | 9 |
| maribo.melee.BMV 0.1 | 7 | 10% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 13 |
| cs.Grudge 1.0 | 5 | 7% | 6 |
| fullsail.SweetTea 1.1 | 4 | 6% | 5 |
| bzdp.BoxCar 2.0 | 2 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.9 | 137 / 210 | 2.45 | 20.1% | 37174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.1% | 137 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 22 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.2% | 2 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 9 |
| fm.mammillarias 1.3 | 5.8 | 9.3% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.7% | 2 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.3% | 2 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 84.8 | 23 / 35 | 6204 |
| 2 | 1 | 71.1 | 85.4 | 25 / 35 | 6574 |
| 3 | 1 | 71.0 | 86.7 | 24 / 35 | 6425 |
| 4 | 1 | 68.9 | 79.0 | 23 / 35 | 5524 |
| 5 | 1 | 70.6 | 89.5 | 21 / 35 | 6115 |
| 6 | 1 | 69.2 | 78.1 | 21 / 35 | 6332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 79% |
| cb.nano.Insomnia 1.0 | 28 | 93% |
| myl.nano.KomoriNinja 1.1 | 16 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| sp.Nanos.Ember 1.1 | 5 | 80% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Fire 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 16 | 22% | 73 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 19% | 28 |
| cb.nano.Insomnia 1.0 | 11 | 15% | 12 |
| cs.sheldor.Talon 1.1 | 9 | 12% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 10% | 36 |
| sample.Fire 1.0 | 7 | 10% | 13 |
| fm.mammillarias 1.3 | 6 | 8% | 12 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 15 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.5 | 155 / 210 | 2.03 | 21.1% | 40621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.1% | 155 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 12 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 14 |
| tj.zombie1n 1.0.1 | 4.7 | 9.2% | 11 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.4% | 0 |
| yk.JahMicro 1.0 | 6.5 | 8.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.9 | 25 / 35 | 6646 |
| 2 | 1 | 72.1 | 90.2 | 26 / 35 | 7386 |
| 3 | 1 | 72.7 | 92.4 | 28 / 35 | 7447 |
| 4 | 1 | 70.7 | 86.7 | 25 / 35 | 6532 |
| 5 | 1 | 70.5 | 85.7 | 27 / 35 | 6489 |
| 6 | 1 | 70.0 | 88.3 | 24 / 35 | 6121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 91% |
| tvv.micro.Antares 1.1.1 | 30 | 100% |
| stelo.SoJNanoMelee 1.1 | 21 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 100% |
| tj.zombie1n 1.0.1 | 18 | 67% |
| yk.JahMicro 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 44% | 96 |
| stelo.SoJNanoMelee 1.1 | 11 | 20% | 30 |
| tj.zombie1n 1.0.1 | 8 | 15% | 8 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 30 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| yk.JahMicro 1.0 | 3 | 5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 20 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 71.5 | 109 / 210 | 3.57 | 16.9% | 31294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.9% | 109 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.2% | 17 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 27 |
| EBBU.Sim2 1.02 | 5.7 | 9.9% | 3 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.8% | 10 |
| sam.Samspin 1.0 | 6.8 | 8.9% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.0 | 19 / 35 | 5151 |
| 2 | 1 | 64.1 | 65.1 | 15 / 35 | 5464 |
| 3 | 1 | 63.2 | 68.6 | 15 / 35 | 4860 |
| 4 | 1 | 65.6 | 70.8 | 18 / 35 | 5213 |
| 5 | 1 | 66.5 | 74.6 | 19 / 35 | 5358 |
| 6 | 1 | 66.8 | 75.9 | 23 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 36 | 78% |
| ahf.NanoAndrew .4 | 30 | 90% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 6 | 67% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 20% | 53 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 15% | 14 |
| robar.nano.Assertive_Melee 0.2 | 14 | 14% | 19 |
| oog.melee.Corsair 1.0 | 13 | 13% | 39 |
| ahf.NanoAndrew .4 | 11 | 11% | 40 |
| EBBU.Sim2 1.02 | 11 | 11% | 22 |
| sam.Samspin 1.0 | 9 | 9% | 11 |
| zyx.nano.BacillusComma 1.0 | 5 | 5% | 7 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.9 | 138 / 210 | 2.45 | 18.6% | 30446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.6% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 38 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.4% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.8% | 5 |
| fm.claire 1.7 | 6.5 | 8.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.0% | 4 |
| pa.Improved 1.0 | 8.3 | 6.5% | 4 |
| sample.SpinBot 1.0 | 8.8 | 6.3% | 3 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 25 / 35 | 5313 |
| 2 | 1 | 65.2 | 78.4 | 18 / 35 | 4647 |
| 3 | 1 | 65.9 | 77.5 | 21 / 35 | 4641 |
| 4 | 1 | 70.6 | 93.0 | 26 / 35 | 5490 |
| 5 | 1 | 67.9 | 81.9 | 24 / 35 | 5016 |
| 6 | 1 | 68.5 | 84.1 | 24 / 35 | 5339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 86% |
| oog.melee.CapuletDroid 1.1 | 33 | 97% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| arthord.NanoSatanMelee Beta | 6 | 50% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 4 | 75% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 27% | 89 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 34 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 18 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 16 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 16 |
| sample.SpinBot 1.0 | 5 | 7% | 8 |
| pa.Improved 1.0 | 4 | 5% | 8 |
| fm.claire 1.7 | 3 | 4% | 9 |
| kurios.DOSexe .9b | 2 | 3% | 12 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 76.7 | 106 / 210 | 3.10 | 17.2% | 30984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 17.2% | 106 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.8% | 41 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 15.0% | 35 |
| mz.MicroGodMelee 1 | 4.0 | 13.2% | 19 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.5% | 2 |
| acogdev.alpha 0.2 | 9.2 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.2 | 19 / 35 | 5181 |
| 2 | 1 | 67.3 | 78.7 | 17 / 35 | 5261 |
| 3 | 1 | 67.3 | 78.4 | 17 / 35 | 5553 |
| 4 | 2 | 64.0 | 70.5 | 16 / 35 | 4418 |
| 5 | 1 | 68.2 | 77.1 | 20 / 35 | 5741 |
| 6 | 2 | 65.4 | 73.3 | 17 / 35 | 4830 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 67% |
| mz.MicroGodMelee 1 | 42 | 86% |
| gh.micro.Gruweltje 0.7 | 42 | 79% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 33 | 32% | 63 |
| gh.micro.Gruweltje 0.7 | 23 | 22% | 63 |
| mz.MicroGodMelee 1 | 18 | 17% | 51 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 8 |
| acogdev.alpha 0.2 | 6 | 6% | 6 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 4 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.9 | 88 / 210 | 3.70 | 15.9% | 29585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 15.9% | 88 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.1% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.7% | 32 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 7 |
| awesomeness.Elite 1.0 | 5.0 | 9.4% | 13 |
| germ.TheMind .2 | 5.2 | 9.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.1% | 1 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.7% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 64.1 | 13 / 35 | 5035 |
| 2 | 1 | 68.1 | 80.6 | 16 / 35 | 5976 |
| 3 | 1 | 61.4 | 61.0 | 12 / 35 | 4938 |
| 4 | 2 | 63.5 | 70.8 | 15 / 35 | 4440 |
| 5 | 1 | 64.8 | 74.3 | 16 / 35 | 4839 |
| 6 | 1 | 62.7 | 68.9 | 16 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 86% |
| stelo.UntouchableNano 1.3 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| germ.TheMind .2 | 6 | 67% |
| awesomeness.Elite 1.0 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 45% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 18% | 38 |
| qualidafial.MajorDick 1.0.1 | 11 | 9% | 14 |
| awesomeness.Elite 1.0 | 9 | 7% | 14 |
| stelo.UntouchableNano 1.3 | 7 | 6% | 9 |
| germ.TheMind .2 | 6 | 5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 8 |
| mym.EdgeStalker 1.0 | 5 | 4% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.3 | 146 / 210 | 2.14 | 19.9% | 31198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.9% | 146 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.2% | 10 |
| maribo.IotaCT 1.1 | 3.5 | 11.2% | 9 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.0% | 2 |
| stelo.PatternRobot 1.0 | 7.2 | 8.2% | 14 |
| ratosh.Wesco 1.4 | 8.2 | 7.7% | 3 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.6 | 25 / 35 | 4994 |
| 2 | 1 | 70.8 | 86.3 | 27 / 35 | 5543 |
| 3 | 1 | 69.9 | 87.0 | 22 / 35 | 4889 |
| 4 | 1 | 70.2 | 89.5 | 25 / 35 | 5240 |
| 5 | 1 | 70.1 | 87.6 | 24 / 35 | 5192 |
| 6 | 1 | 70.5 | 85.7 | 23 / 35 | 5340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 95% |
| nz.jdc.nano.GridFu 1.0 | 26 | 100% |
| maribo.IotaCT 1.1 | 21 | 95% |
| stelo.PatternRobot 1.0 | 15 | 67% |
| timmit.nano.TimDog 0.33 | 7 | 71% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 16 | 24% | 27 |
| stelo.PatternRobot 1.0 | 15 | 23% | 22 |
| rz.HawkOnFire 0.1 | 10 | 15% | 67 |
| nz.jdc.nano.GridFu 1.0 | 10 | 15% | 48 |
| maribo.IotaCT 1.1 | 7 | 11% | 28 |
| ratosh.Wesco 1.4 | 3 | 5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 4 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.0 | 179 / 210 | 1.63 | 21.9% | 39608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.9% | 179 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.1% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 3 |
| zyx.micro.Ant 1.1 | 4.8 | 9.2% | 8 |
| Grystrion.TrackerWO 1.0 | 5.2 | 9.3% | 1 |
| sanja.First 0.1 | 6.5 | 8.4% | 2 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.7% | 1 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 91.7 | 29 / 35 | 7084 |
| 2 | 1 | 72.9 | 98.1 | 33 / 35 | 6352 |
| 3 | 1 | 71.6 | 90.5 | 29 / 35 | 6563 |
| 4 | 1 | 70.7 | 87.6 | 25 / 35 | 6344 |
| 5 | 1 | 72.5 | 94.9 | 31 / 35 | 6868 |
| 6 | 1 | 72.0 | 94.9 | 32 / 35 | 6397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 100% |
| tvv.nano.Polaris 1.2 | 40 | 95% |
| sanja.First 0.1 | 24 | 96% |
| cvt.Firsty 1.0 | 23 | 96% |
| amk.Punbot.Punbot 0.01 | 23 | 96% |
| zyx.micro.Ant 1.1 | 18 | 89% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 32% | 44 |
| sanja.First 0.1 | 5 | 16% | 25 |
| tvv.nano.Polaris 1.2 | 3 | 10% | 51 |
| baal.nano.N 1.42 | 3 | 10% | 33 |
| cvt.Firsty 1.0 | 3 | 10% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 15 |
| amk.Punbot.Punbot 0.01 | 3 | 10% | 6 |
| sample.RamFire 1.0 | 1 | 3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.9 | 66 / 210 | 3.89 | 15.1% | 29678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.7% | 85 |
| hadur117.micro.SaorOG5 0.1 | 1.8 | 15.1% | 66 |
| cs.Wren 1.0 | 2.8 | 13.1% | 27 |
| js.PinBall 1.6 | 4.3 | 11.2% | 12 |
| mz.Cork 0.1 | 4.7 | 10.7% | 8 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 5 |
| evd.X1 0.01 | 7.0 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 72.7 | 14 / 35 | 5324 |
| 2 | 3 | 57.2 | 54.0 | 7 / 35 | 4346 |
| 3 | 2 | 62.3 | 67.0 | 15 / 35 | 4568 |
| 4 | 2 | 61.7 | 65.7 | 9 / 35 | 4855 |
| 5 | 2 | 64.3 | 71.1 | 12 / 35 | 5001 |
| 6 | 1 | 65.7 | 76.8 | 9 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 42% |
| cs.Wren 1.0 | 20 | 90% |
| donjezza.Jezza 1.0 | 5 | 80% |
| js.PinBall 1.6 | 5 | 80% |
| mz.Cork 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 78 | 54% | 109 |
| cs.Wren 1.0 | 19 | 13% | 32 |
| evd.X1 0.01 | 12 | 8% | 16 |
| js.PinBall 1.6 | 10 | 7% | 15 |
| joe.ADinosaur 1.0 | 10 | 7% | 10 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| mz.Cork 0.1 | 6 | 4% | 12 |
| jsal.Jsalbot 1.0 | 2 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.3 | 121 / 210 | 2.60 | 18.3% | 28171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.3% | 121 |
| myl.nano.Graviton 1.10 | 2.7 | 11.9% | 27 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.9% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.6% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 6 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 5.9% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 23 / 35 | 4929 |
| 2 | 1 | 67.2 | 79.0 | 20 / 35 | 4800 |
| 3 | 1 | 69.5 | 89.2 | 24 / 35 | 5064 |
| 4 | 1 | 67.0 | 81.9 | 17 / 35 | 4592 |
| 5 | 1 | 66.2 | 80.3 | 19 / 35 | 4467 |
| 6 | 1 | 65.4 | 76.8 | 18 / 35 | 4319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 56% |
| myl.nano.Graviton 1.10 | 35 | 80% |
| ntc.Opposite 1.5 | 20 | 85% |
| donjezza.Muncho 1.0 | 14 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| disan.Chair 2.2.0 | 12 | 100% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 89 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 24 | 27% | 51 |
| ntc.Opposite 1.5 | 16 | 18% | 27 |
| pfvicm.Sobieski 7.2.3b | 14 | 16% | 20 |
| myl.nano.Graviton 1.10 | 12 | 13% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 19 |
| donjezza.Muncho 1.0 | 4 | 4% | 16 |
| DBall.NUKE 0.1 | 4 | 4% | 14 |
| disan.Chair 2.2.0 | 3 | 3% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 45 over 6 battles (7.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.7 | 83 / 210 | 3.82 | 14.9% | 23482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.8 | 14.9% | 83 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 46 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.9% | 47 |
| yagami.Tidus 0.11 | 4.0 | 12.7% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.6% | 16 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 3 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.6% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 69.8 | 16 / 35 | 3925 |
| 2 | 1 | 64.5 | 69.5 | 14 / 35 | 4268 |
| 3 | 2 | 62.6 | 67.9 | 12 / 35 | 4025 |
| 4 | 2 | 61.5 | 63.8 | 13 / 35 | 3439 |
| 5 | 1 | 65.1 | 74.9 | 15 / 35 | 3889 |
| 6 | 3 | 62.2 | 66.0 | 13 / 35 | 3936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 83% |
| kawigi.micro.Shiz 1.1 | 28 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 95% |
| yagami.Tidus 0.11 | 16 | 69% |
| ejb.Polaris 1.0.1 | 6 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 31% | 62 |
| yagami.Tidus 0.11 | 25 | 20% | 39 |
| kawigi.micro.Shiz 1.1 | 22 | 17% | 37 |
| ejb.Polaris 1.0.1 | 14 | 11% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 35 |
| stelo.MirrorNano 1.3 | 9 | 7% | 9 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.8 | 138 / 210 | 2.81 | 17.7% | 27156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.7% | 138 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 19 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 15 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 17 |
| ratosh.Nobo 0.21 | 4.3 | 11.3% | 6 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.3% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.6 | 23 / 35 | 4743 |
| 2 | 1 | 65.6 | 76.5 | 22 / 35 | 4338 |
| 3 | 1 | 67.9 | 83.8 | 23 / 35 | 4939 |
| 4 | 1 | 67.2 | 81.6 | 24 / 35 | 4616 |
| 5 | 1 | 64.2 | 72.7 | 21 / 35 | 4054 |
| 6 | 1 | 67.5 | 83.8 | 25 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 93% |
| wee.Gem 1.8.4 | 39 | 97% |
| wompi.Quokka 1.6 | 21 | 100% |
| ratosh.Nobo 0.21 | 13 | 92% |
| m3thos.Eva00 1.1 | 12 | 75% |
| bayen.UbaMicro 1.4 | 6 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 19% | 63 |
| wee.Gem 1.8.4 | 11 | 15% | 47 |
| bayen.UbaMicro 1.4 | 10 | 13% | 16 |
| maribo.FollowFire 1 | 10 | 13% | 11 |
| m3thos.Eva00 1.1 | 9 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 11 |
| ratosh.Nobo 0.21 | 6 | 8% | 17 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 6 |
| wompi.Quokka 1.6 | 3 | 4% | 20 |

## Melee bench: F15

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 85.7 | 63 / 210 | 2.29 | 20.6% | 50324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 20.6% | 63 |
| wompi.Wallaby 5.1 | 1.7 | 20.3% | 133 |
| mz.NanoGod 2.02 | 3.0 | 13.3% | 9 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 3 |
| stuff.Vlad 0.1 | 5.2 | 9.1% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 91.1 | 14 / 35 | 9351 |
| 2 | 1 | 71.7 | 84.1 | 10 / 35 | 8577 |
| 3 | 2 | 71.5 | 82.9 | 9 / 35 | 8313 |
| 4 | 2 | 72.1 | 87.3 | 7 / 35 | 8036 |
| 5 | 1 | 72.3 | 86.3 | 12 / 35 | 7837 |
| 6 | 1 | 70.9 | 82.2 | 11 / 35 | 8210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 138 | 29% |
| mz.NanoGod 2.02 | 14 | 86% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| stelo.PianistNano 1.2 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 80% | 159 |
| mz.NanoGod 2.02 | 12 | 8% | 24 |
| exauge.GateKeeper 1.1.121g | 10 | 7% | 14 |
| ayk.WallHugger 1.0 | 5 | 3% | 7 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.0 | 114 / 210 | 3.07 | 17.2% | 28099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.2% | 114 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 37 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 16 |
| bvh.micro.Freya 0.3 | 3.8 | 11.8% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.5% | 1 |
| conscience.Electron 1.3g | 6.7 | 8.1% | 0 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 5 |
| dl.BetterWalls 1.0 | 9.2 | 5.6% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 27 / 35 | 5008 |
| 2 | 1 | 64.6 | 73.7 | 18 / 35 | 4411 |
| 3 | 1 | 65.3 | 76.2 | 16 / 35 | 4690 |
| 4 | 1 | 64.6 | 71.7 | 15 / 35 | 4655 |
| 5 | 1 | 65.1 | 75.2 | 18 / 35 | 4617 |
| 6 | 1 | 66.3 | 78.7 | 20 / 35 | 4718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 63% |
| dummy.micro.Sparrow 2.5 | 32 | 94% |
| bvh.micro.Freya 0.3 | 26 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 84% |
| ap.Frederick 1.1 | 7 | 86% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 26% | 58 |
| dummy.micro.Sparrow 2.5 | 16 | 17% | 47 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 15% | 38 |
| conscience.Electron 1.3g | 14 | 15% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 11 |
| bvh.micro.Freya 0.3 | 8 | 8% | 21 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 10 |
| dl.BetterWalls 1.0 | 4 | 4% | 8 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 86.4 | 159 / 210 | 2.22 | 21.3% | 41037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.3% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 17 |
| sul.Lunar 1.1 | 3.7 | 11.0% | 13 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 8 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 6 |
| dsw.StaticD 1.0 | 5.5 | 9.0% | 1 |
| tlp.ThreeLeggedPig 1 | 6.7 | 7.8% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 3 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 87.6 | 26 / 35 | 7643 |
| 2 | 1 | 69.1 | 77.1 | 21 / 35 | 6347 |
| 3 | 1 | 71.6 | 89.2 | 29 / 35 | 6434 |
| 4 | 1 | 73.5 | 94.3 | 32 / 35 | 6861 |
| 5 | 1 | 71.6 | 86.3 | 26 / 35 | 7088 |
| 6 | 1 | 71.1 | 83.8 | 25 / 35 | 6664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 64 | 94% |
| sul.Lunar 1.1 | 29 | 97% |
| supersample.SuperBoxBot 1.0 | 24 | 88% |
| dsw.StaticD 1.0 | 20 | 100% |
| tlp.ThreeLeggedPig 1 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 14 | 27% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 24% | 62 |
| mme.NikeEnhanced 2.0 | 7 | 14% | 16 |
| dsw.StaticD 1.0 | 5 | 10% | 22 |
| sul.Lunar 1.1 | 3 | 6% | 38 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 6% | 13 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 6% | 9 |
| sample.Corners 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 79.7 | 118 / 210 | 2.83 | 18.7% | 38430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.7% | 118 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 32 |
| mld.Wisdom 1.0 | 3.5 | 12.1% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.9% | 18 |
| KiraNL.Chupacabra 0.4 | 5.2 | 9.9% | 8 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 9 |
| GarmBox.Oranges 1.0 | 7.5 | 7.7% | 0 |
| sample.Walls 1.0 | 7.7 | 7.2% | 4 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 5 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.7 | 23 / 35 | 6448 |
| 2 | 1 | 69.9 | 87.3 | 22 / 35 | 6574 |
| 3 | 1 | 69.9 | 85.1 | 23 / 35 | 6617 |
| 4 | 1 | 67.0 | 73.7 | 19 / 35 | 6364 |
| 5 | 1 | 66.6 | 76.8 | 15 / 35 | 5973 |
| 6 | 1 | 67.2 | 75.6 | 16 / 35 | 6454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 94% |
| radnor.DoctorBob 1.42 | 37 | 76% |
| mld.Wisdom 1.0 | 15 | 87% |
| KiraNL.Chupacabra 0.4 | 14 | 64% |
| jangs.ns51 1.0 | 12 | 75% |
| amz.NanoClone 1.41 | 7 | 86% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 26% | 41 |
| radnor.DoctorBob 1.42 | 20 | 22% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 64 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 16 |
| amz.NanoClone 1.41 | 8 | 9% | 14 |
| jangs.ns51 1.0 | 5 | 5% | 11 |
| sample.Walls 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |

