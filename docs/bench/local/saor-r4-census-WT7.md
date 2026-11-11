# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.4 | 160 / 210 | 1.78 | 22.4% | 45692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 22.4% | 160 |
| mz.AntiGrav 1.0 | 2.7 | 14.4% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 13.7% | 18 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 13 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 2 |
| sample.Walls 1.0 | 6.5 | 6.3% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 1 |
| sample.Target 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.3 | 92.4 | 26 / 35 | 8339 |
| 2 | 1 | 73.7 | 94.3 | 29 / 35 | 7314 |
| 3 | 1 | 73.8 | 90.5 | 28 / 35 | 7809 |
| 4 | 1 | 71.6 | 86.3 | 22 / 35 | 7065 |
| 5 | 1 | 73.6 | 94.6 | 28 / 35 | 7632 |
| 6 | 1 | 73.1 | 90.2 | 27 / 35 | 7533 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 91 | 96% |
| mld.Infinity 2.2 | 39 | 97% |
| radnor.DoctorBob 1.42 | 32 | 75% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 48% | 67 |
| mz.AntiGrav 1.0 | 14 | 28% | 80 |
| amz.NanoClone 1.41 | 7 | 14% | 16 |
| mld.Infinity 2.2 | 3 | 6% | 36 |
| sample.Walls 1.0 | 2 | 4% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.1 | 118 / 210 | 2.52 | 18.6% | 33930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 18.6% | 118 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.1% | 56 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 22 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 2 |
| zyx.nano.Ant 1.1 | 5.8 | 8.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.2% | 3 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 2 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.1 | 23 / 35 | 5360 |
| 2 | 1 | 69.7 | 89.2 | 24 / 35 | 5294 |
| 3 | 1 | 69.1 | 88.9 | 21 / 35 | 5880 |
| 4 | 1 | 68.7 | 86.7 | 18 / 35 | 5577 |
| 5 | 1 | 70.7 | 90.2 | 25 / 35 | 6189 |
| 6 | 3 | 62.0 | 58.7 | 7 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 63 | 89% |
| oog.melee.Mercutio 1.0 | 60 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 33% | 74 |
| mld.DustBunny 3.8 | 22 | 24% | 71 |
| zyx.nano.Ant 1.1 | 13 | 14% | 19 |
| maribo.melee.BMV 0.1 | 11 | 12% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 14 |
| cs.Grudge 1.0 | 5 | 5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.2 | 122 / 210 | 2.70 | 19.8% | 39460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.8% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.6% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.2% | 17 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 10 |
| fm.mammillarias 1.3 | 5.8 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 5 |
| sample.Tracker 1.0 | 9.2 | 4.8% | 0 |
| sample.Fire 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.7 | 24 / 35 | 6942 |
| 2 | 1 | 70.0 | 85.1 | 19 / 35 | 6417 |
| 3 | 1 | 68.4 | 74.0 | 17 / 35 | 6666 |
| 4 | 1 | 70.1 | 84.1 | 21 / 35 | 6621 |
| 5 | 1 | 67.3 | 73.0 | 16 / 35 | 6039 |
| 6 | 1 | 70.8 | 84.1 | 25 / 35 | 6775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 84% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 16 | 94% |
| myl.nano.KomoriNinja 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 28% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 22% | 40 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 19 |
| fm.mammillarias 1.3 | 9 | 10% | 13 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 26 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 22 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 10 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| sample.Fire 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 87.7 | 153 / 210 | 2.10 | 21.2% | 42181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.2% | 153 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.0% | 11 |
| kawigi.nano.Lib 1.0 | 2.8 | 11.9% | 15 |
| tj.zombie1n 1.0.1 | 4.5 | 9.4% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 9.2% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.6% | 1 |
| yk.JahMicro 1.0 | 6.7 | 7.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.4 | 27 / 35 | 6664 |
| 2 | 1 | 71.3 | 86.3 | 26 / 35 | 7368 |
| 3 | 1 | 70.8 | 88.6 | 21 / 35 | 6923 |
| 4 | 1 | 70.4 | 85.1 | 24 / 35 | 6757 |
| 5 | 1 | 71.0 | 85.7 | 26 / 35 | 7144 |
| 6 | 1 | 72.0 | 88.3 | 29 / 35 | 7325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 45 | 91% |
| stelo.SoJNanoMelee 1.1 | 39 | 87% |
| tvv.micro.Antares 1.1.1 | 29 | 90% |
| tj.zombie1n 1.0.1 | 20 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 94% |
| yk.JahMicro 1.0 | 11 | 91% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 67% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 35% | 70 |
| stelo.SoJNanoMelee 1.1 | 11 | 19% | 30 |
| tvv.micro.Antares 1.1.1 | 9 | 16% | 44 |
| tj.zombie1n 1.0.1 | 7 | 12% | 13 |
| repositorio.NanoStep 1.0 | 3 | 5% | 10 |
| yk.JahMicro 1.0 | 3 | 5% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 4% | 20 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.8 | 82 / 210 | 3.80 | 16.1% | 31251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.1% | 82 |
| oog.melee.Corsair 1.0 | 2.5 | 12.9% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.4% | 27 |
| sam.Samspin 1.0 | 5.7 | 9.7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.3% | 6 |
| EBBU.Sim2 1.02 | 6.5 | 9.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.6% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.4 | 17 / 35 | 5831 |
| 2 | 1 | 62.5 | 62.2 | 12 / 35 | 5208 |
| 3 | 1 | 59.0 | 57.1 | 7 / 35 | 4538 |
| 4 | 1 | 65.4 | 74.0 | 17 / 35 | 5246 |
| 5 | 1 | 64.4 | 70.5 | 12 / 35 | 5388 |
| 6 | 1 | 64.7 | 70.8 | 17 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 46 | 59% |
| simonton.nano.MeleeSeed 1.8 | 26 | 81% |
| ahf.NanoAndrew .4 | 16 | 88% |
| sam.Samspin 1.0 | 7 | 71% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 26% | 63 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 40 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 15% | 20 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 20 |
| zyx.nano.BacillusComma 1.0 | 17 | 13% | 19 |
| ahf.NanoAndrew .4 | 12 | 9% | 26 |
| EBBU.Sim2 1.02 | 6 | 5% | 10 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |
| sam.Samspin 1.0 | 2 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.0 | 144 / 210 | 2.35 | 19.6% | 34976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.6% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 35 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.6% | 8 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.8% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 5 |
| fm.claire 1.7 | 6.3 | 8.2% | 1 |
| pa.Improved 1.0 | 8.7 | 6.4% | 1 |
| sample.SpinBot 1.0 | 8.8 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 25 / 35 | 5943 |
| 2 | 1 | 72.7 | 95.2 | 30 / 35 | 6555 |
| 3 | 1 | 70.3 | 88.3 | 26 / 35 | 6057 |
| 4 | 1 | 68.4 | 81.3 | 21 / 35 | 5866 |
| 5 | 1 | 68.1 | 79.0 | 21 / 35 | 5581 |
| 6 | 1 | 66.0 | 75.2 | 21 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 84% |
| oog.melee.CapuletDroid 1.1 | 35 | 97% |
| gh.nano.Grofvuil 0.2 | 17 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 36% | 87 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 17 |
| oog.melee.CapuletDroid 1.1 | 8 | 12% | 47 |
| fm.claire 1.7 | 8 | 12% | 11 |
| gh.nano.Grofvuil 0.2 | 7 | 10% | 20 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 11 |
| sample.SpinBot 1.0 | 4 | 6% | 6 |
| kurios.DOSexe .9b | 2 | 3% | 7 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.7 | 105 / 210 | 2.74 | 18.2% | 34604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.2% | 105 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.2% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.1% | 22 |
| mz.MicroGodMelee 1 | 3.5 | 13.5% | 28 |
| DBall.Anarchy 0.1 | 5.3 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.0% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.5 | 5.4% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 79.0 | 17 / 35 | 5768 |
| 2 | 1 | 66.7 | 77.5 | 15 / 35 | 5589 |
| 3 | 1 | 68.7 | 84.8 | 19 / 35 | 5506 |
| 4 | 1 | 67.7 | 77.8 | 19 / 35 | 5788 |
| 5 | 1 | 69.3 | 84.8 | 17 / 35 | 6156 |
| 6 | 1 | 68.3 | 80.3 | 18 / 35 | 5797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 87% |
| mz.MicroGodMelee 1 | 33 | 76% |
| gh.micro.Gruweltje 0.7 | 32 | 59% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 33 | 31% | 55 |
| spinnercat.micro.Tyger 0.1 | 30 | 29% | 73 |
| mz.MicroGodMelee 1 | 22 | 21% | 51 |
| fire219.CatBot 1.0 | 7 | 7% | 7 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 8 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 76.6 | 117 / 210 | 3.10 | 18.0% | 33852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.0% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.8% | 26 |
| germ.TheMind .2 | 5.2 | 9.2% | 7 |
| awesomeness.Elite 1.0 | 5.5 | 8.9% | 4 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 8.8% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 3 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 75.6 | 21 / 35 | 5779 |
| 2 | 1 | 65.5 | 74.0 | 15 / 35 | 5452 |
| 3 | 1 | 64.8 | 68.6 | 17 / 35 | 5258 |
| 4 | 1 | 69.1 | 83.8 | 23 / 35 | 5744 |
| 5 | 1 | 68.1 | 78.4 | 21 / 35 | 5908 |
| 6 | 1 | 67.8 | 79.4 | 20 / 35 | 5711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 83% |
| awesomeness.Elite 1.0 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| germ.TheMind .2 | 6 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 47 | 50% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 13% | 30 |
| awesomeness.Elite 1.0 | 7 | 7% | 14 |
| germ.TheMind .2 | 7 | 7% | 14 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 11 |
| mym.EdgeStalker 1.0 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 11 |
| sample.Crazy 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.1 | 160 / 210 | 1.90 | 20.9% | 33992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 20.9% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 5 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 6 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 8.8% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 8.3% | 4 |
| stelo.PatternRobot 1.0 | 7.2 | 8.1% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.7 | 26 / 35 | 5455 |
| 2 | 1 | 72.3 | 93.7 | 29 / 35 | 5553 |
| 3 | 1 | 73.0 | 96.2 | 28 / 35 | 6071 |
| 4 | 1 | 71.8 | 92.4 | 27 / 35 | 5723 |
| 5 | 1 | 71.6 | 89.2 | 27 / 35 | 5832 |
| 6 | 1 | 68.9 | 83.2 | 23 / 35 | 5358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 96% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| stelo.PatternRobot 1.0 | 15 | 100% |
| maribo.IotaCT 1.1 | 14 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 9 | 67% |
| ratosh.Wesco 1.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 32% | 59 |
| nz.jdc.nano.GridFu 1.0 | 10 | 20% | 52 |
| timmit.nano.TimDog 0.33 | 7 | 14% | 20 |
| maribo.IotaCT 1.1 | 4 | 8% | 24 |
| ratosh.Wesco 1.4 | 4 | 8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 10 |
| stelo.PatternRobot 1.0 | 3 | 6% | 18 |
| spinnercat.Omen 1.0 | 2 | 4% | 10 |

## Melee bench: F10

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 91.4 | 170 / 210 | 1.77 | 21.9% | 41944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.9% | 170 |
| baal.nano.N 1.42 | 2.5 | 11.6% | 7 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.6% | 10 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.6% | 4 |
| zyx.micro.Ant 1.1 | 5.2 | 9.2% | 5 |
| sanja.First 0.1 | 5.5 | 9.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.8% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 6 |
| amk.Punbot.Punbot 0.01 | 8.3 | 6.9% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 31 / 35 | 6935 |
| 2 | 1 | 72.0 | 90.8 | 27 / 35 | 7030 |
| 3 | 1 | 71.4 | 90.8 | 27 / 35 | 6681 |
| 4 | 1 | 72.1 | 94.6 | 31 / 35 | 6855 |
| 5 | 1 | 71.4 | 88.6 | 28 / 35 | 6940 |
| 6 | 1 | 72.0 | 88.9 | 26 / 35 | 7503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 42 | 93% |
| tvv.nano.Polaris 1.2 | 39 | 92% |
| sanja.First 0.1 | 29 | 100% |
| cvt.Firsty 1.0 | 22 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| zyx.micro.Ant 1.1 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 20% | 43 |
| Grystrion.TrackerWO 1.0 | 7 | 18% | 18 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 61 |
| zyx.micro.Ant 1.1 | 5 | 13% | 22 |
| sanja.First 0.1 | 4 | 10% | 29 |
| amk.Punbot.Punbot 0.01 | 4 | 10% | 7 |
| sample.RamFire 1.0 | 4 | 10% | 3 |
| cvt.Firsty 1.0 | 2 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.6 | 81 / 210 | 3.64 | 16.2% | 33224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.3 | 16.2% | 81 |
| kc.micro.Figment 1.0 | 1.8 | 14.7% | 67 |
| cs.Wren 1.0 | 3.3 | 12.4% | 21 |
| js.PinBall 1.6 | 3.8 | 11.7% | 15 |
| mz.Cork 0.1 | 4.7 | 11.0% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 4 |
| evd.X1 0.01 | 7.3 | 7.4% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 6.9% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 5 |
| PSW.Relentless 0.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.1 | 17 / 35 | 6185 |
| 2 | 2 | 63.1 | 64.8 | 14 / 35 | 5262 |
| 3 | 2 | 61.0 | 62.2 | 10 / 35 | 4998 |
| 4 | 1 | 66.7 | 77.5 | 15 / 35 | 5838 |
| 5 | 1 | 65.4 | 71.7 | 14 / 35 | 5674 |
| 6 | 1 | 63.3 | 69.5 | 11 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 60% |
| cs.Wren 1.0 | 20 | 75% |
| mz.Cork 0.1 | 15 | 73% |
| js.PinBall 1.6 | 8 | 63% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 75% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 45% | 103 |
| cs.Wren 1.0 | 13 | 10% | 25 |
| js.PinBall 1.6 | 13 | 10% | 21 |
| evd.X1 0.01 | 12 | 9% | 14 |
| joe.ADinosaur 1.0 | 10 | 8% | 10 |
| mz.Cork 0.1 | 9 | 7% | 17 |
| PSW.Relentless 0.1 | 9 | 7% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.8 | 144 / 210 | 2.19 | 19.7% | 31038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 19.7% | 144 |
| ntc.Opposite 1.5 | 2.5 | 11.9% | 8 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.0% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 9.9% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.4% | 4 |
| disan.Chair 2.2.0 | 6.3 | 8.9% | 11 |
| DBall.NUKE 0.1 | 8.2 | 7.2% | 3 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.0 | 20 / 35 | 5141 |
| 2 | 1 | 70.5 | 89.8 | 24 / 35 | 5810 |
| 3 | 1 | 67.3 | 81.0 | 21 / 35 | 4805 |
| 4 | 1 | 70.8 | 94.0 | 28 / 35 | 4979 |
| 5 | 1 | 68.6 | 83.8 | 24 / 35 | 4995 |
| 6 | 1 | 70.9 | 91.4 | 27 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 95% |
| stelo.AreaTargetingBot 1.1 | 33 | 88% |
| disan.Chair 2.2.0 | 24 | 83% |
| ntc.Opposite 1.5 | 23 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| donjezza.Muncho 1.0 | 8 | 63% |
| DBall.NUKE 0.1 | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 24% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 15% | 24 |
| pfvicm.Sobieski 7.2.3b | 10 | 15% | 18 |
| myl.nano.Graviton 1.10 | 9 | 13% | 45 |
| ntc.Opposite 1.5 | 6 | 9% | 26 |
| disan.Chair 2.2.0 | 5 | 7% | 19 |
| donjezza.Muncho 1.0 | 5 | 7% | 15 |
| pbg.R2D2 1.0 | 5 | 7% | 11 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.8 | 93 / 210 | 3.18 | 16.6% | 27226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.6% | 93 |
| oog.melee.Capulet 1.2 | 3.0 | 13.9% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 20 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.3% | 26 |
| yagami.Tidus 0.11 | 4.7 | 11.8% | 10 |
| ejb.Polaris 1.0.1 | 5.8 | 10.9% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.0 | 12 / 35 | 4528 |
| 2 | 1 | 65.8 | 76.5 | 13 / 35 | 4425 |
| 3 | 1 | 66.2 | 75.9 | 17 / 35 | 4636 |
| 4 | 1 | 67.0 | 79.0 | 19 / 35 | 4325 |
| 5 | 1 | 64.5 | 68.9 | 13 / 35 | 4601 |
| 6 | 1 | 67.3 | 80.3 | 19 / 35 | 4711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 74% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| yagami.Tidus 0.11 | 20 | 95% |
| ejb.Polaris 1.0.1 | 8 | 75% |

Hadur died in 117 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 38% | 68 |
| yagami.Tidus 0.11 | 21 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 15% | 44 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 28 |
| ejb.Polaris 1.0.1 | 11 | 9% | 19 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.4 | 127 / 210 | 2.67 | 18.0% | 29100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.0% | 127 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 16 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 23 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 24 |
| ratosh.Nobo 0.21 | 4.2 | 11.3% | 10 |
| m3thos.Eva00 1.1 | 6.0 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.7 | 21 / 35 | 4783 |
| 2 | 1 | 67.7 | 83.2 | 25 / 35 | 4804 |
| 3 | 1 | 66.4 | 78.1 | 19 / 35 | 4917 |
| 4 | 1 | 68.3 | 85.7 | 22 / 35 | 4962 |
| 5 | 1 | 66.7 | 82.5 | 20 / 35 | 4516 |
| 6 | 1 | 67.0 | 80.3 | 20 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 92% |
| wee.Gem 1.8.4 | 37 | 95% |
| wompi.Quokka 1.6 | 20 | 70% |
| m3thos.Eva00 1.1 | 15 | 100% |
| ratosh.Nobo 0.21 | 15 | 80% |
| bayen.UbaMicro 1.4 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 466. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 16 | 19% | 29 |
| bzdp.Pansy 2.1 | 14 | 16% | 58 |
| ratosh.Nobo 0.21 | 14 | 16% | 28 |
| bayen.UbaMicro 1.4 | 10 | 12% | 12 |
| maribo.FollowFire 1 | 9 | 11% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| wee.Gem 1.8.4 | 6 | 7% | 37 |
| m3thos.Eva00 1.1 | 5 | 6% | 21 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 4 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 85.7 | 120 / 210 | 2.29 | 21.6% | 50241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.6% | 120 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 65 |
| mz.NanoGod 2.02 | 3.0 | 15.0% | 17 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.9% | 5 |
| ayk.WallHugger 1.0 | 5.5 | 8.6% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.7% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 85.7 | 24 / 35 | 8518 |
| 2 | 1 | 73.7 | 88.6 | 19 / 35 | 8688 |
| 3 | 1 | 71.0 | 81.0 | 19 / 35 | 7619 |
| 4 | 1 | 72.9 | 85.4 | 23 / 35 | 8173 |
| 5 | 1 | 73.7 | 88.9 | 19 / 35 | 8828 |
| 6 | 1 | 73.0 | 84.8 | 16 / 35 | 8415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 78% |
| mz.NanoGod 2.02 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 43% | 133 |
| mz.NanoGod 2.02 | 33 | 37% | 47 |
| stuff.Vlad 0.1 | 7 | 8% | 8 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 11 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 2 | 2% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.5 | 97 / 210 | 3.74 | 16.0% | 28185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 16.0% | 97 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 32 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.1% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.6% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 22 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 5 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 75.6 | 18 / 35 | 5086 |
| 2 | 1 | 65.1 | 73.0 | 19 / 35 | 4607 |
| 3 | 1 | 62.2 | 64.8 | 12 / 35 | 4571 |
| 4 | 1 | 60.1 | 60.0 | 14 / 35 | 4212 |
| 5 | 1 | 66.8 | 76.8 | 21 / 35 | 5298 |
| 6 | 1 | 62.2 | 67.0 | 13 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 87% |
| dummy.micro.Sparrow 2.5 | 32 | 94% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 76% |
| bvh.micro.Freya 0.3 | 16 | 81% |
| stelo.MirrorMicro 1.0 | 8 | 63% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 19% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 19% | 17 |
| bvh.micro.Freya 0.3 | 16 | 14% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 13% | 33 |
| conscience.Electron 1.3g | 14 | 12% | 19 |
| dummy.micro.Sparrow 2.5 | 11 | 10% | 34 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 15 |
| dl.BetterWalls 1.0 | 7 | 6% | 11 |

## Melee bench: F17

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 150 / 210 | 2.10 | 21.8% | 43616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 21.8% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 19 |
| supersample.SuperBoxBot 1.0 | 4.0 | 11.2% | 12 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.5% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.5% | 0 |
| sample.Corners 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 83.8 | 21 / 35 | 7067 |
| 2 | 1 | 73.0 | 91.7 | 26 / 35 | 7573 |
| 3 | 1 | 72.2 | 87.0 | 25 / 35 | 7115 |
| 4 | 1 | 72.5 | 88.6 | 27 / 35 | 7203 |
| 5 | 1 | 72.2 | 85.7 | 27 / 35 | 7578 |
| 6 | 1 | 72.1 | 90.2 | 24 / 35 | 7080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 94% |
| sul.Lunar 1.1 | 45 | 93% |
| supersample.SuperBoxBot 1.0 | 31 | 87% |
| dsw.StaticD 1.0 | 15 | 73% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 35% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 30% | 67 |
| sul.Lunar 1.1 | 6 | 10% | 51 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 16 |
| dsw.StaticD 1.0 | 4 | 7% | 18 |
| sample.Corners 1.0 | 3 | 5% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWT7 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.2 | 113 / 210 | 2.88 | 18.5% | 38290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWT7 0.1 | 1.0 | 18.5% | 113 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 25 |
| mld.Wisdom 1.0 | 3.2 | 11.8% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 24 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 9 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 12 |
| GarmBox.Oranges 1.0 | 7.8 | 7.3% | 2 |
| sample.Walls 1.0 | 8.0 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.0 | 6.9% | 5 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 75.6 | 16 / 35 | 6240 |
| 2 | 1 | 68.7 | 82.2 | 21 / 35 | 6341 |
| 3 | 1 | 69.6 | 82.5 | 22 / 35 | 6941 |
| 4 | 1 | 67.3 | 76.8 | 17 / 35 | 6419 |
| 5 | 1 | 67.3 | 77.8 | 17 / 35 | 6092 |
| 6 | 1 | 68.5 | 80.0 | 20 / 35 | 6257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 81% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| mld.Wisdom 1.0 | 22 | 91% |
| KiraNL.Chupacabra 0.4 | 13 | 92% |
| amz.NanoClone 1.41 | 12 | 83% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 20% | 46 |
| mld.Wisdom 1.0 | 19 | 20% | 44 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 33 |
| radnor.DoctorBob 1.42 | 17 | 18% | 47 |
| amz.NanoClone 1.41 | 17 | 18% | 22 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

