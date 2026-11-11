# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.5 | 154 / 210 | 1.95 | 21.4% | 43891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 21.4% | 154 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 22 |
| mz.AntiGrav 1.0 | 2.8 | 13.7% | 16 |
| mld.Infinity 2.2 | 4.0 | 12.2% | 11 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 5 |
| sample.Walls 1.0 | 6.3 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 0 |
| sample.Target 1.0 | 9.5 | 3.8% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 83.5 | 23 / 35 | 7282 |
| 2 | 1 | 74.0 | 94.0 | 29 / 35 | 8025 |
| 3 | 1 | 71.4 | 87.0 | 23 / 35 | 7105 |
| 4 | 1 | 73.0 | 94.0 | 28 / 35 | 7245 |
| 5 | 1 | 72.1 | 89.5 | 26 / 35 | 7095 |
| 6 | 1 | 71.9 | 88.9 | 25 / 35 | 7139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 96% |
| radnor.DoctorBob 1.42 | 39 | 85% |
| mld.Infinity 2.2 | 35 | 100% |
| jangs.ns51 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 46% | 68 |
| mz.AntiGrav 1.0 | 12 | 21% | 64 |
| mld.Infinity 2.2 | 6 | 11% | 46 |
| amz.NanoClone 1.41 | 6 | 11% | 14 |
| jangs.ns51 1.0 | 4 | 7% | 9 |
| GarmBox.Oranges 1.0 | 2 | 4% | 2 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.5 | 124 / 210 | 2.03 | 18.9% | 32154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.9% | 124 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 51 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 14 |
| maribo.melee.BMV 0.1 | 3.8 | 10.3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 4 |
| zyx.nano.Ant 1.1 | 6.2 | 7.9% | 0 |
| fullsail.SweetTea 1.1 | 7.2 | 7.7% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 6.9% | 5 |
| bzdp.BoxCar 2.0 | 8.2 | 7.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 20 / 35 | 5057 |
| 2 | 1 | 68.8 | 88.9 | 19 / 35 | 5971 |
| 3 | 1 | 67.0 | 83.8 | 16 / 35 | 5280 |
| 4 | 1 | 69.7 | 92.1 | 24 / 35 | 5452 |
| 5 | 1 | 69.4 | 89.8 | 25 / 35 | 5156 |
| 6 | 1 | 68.7 | 87.6 | 20 / 35 | 5238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 62 | 69% |
| mld.DustBunny 3.8 | 52 | 94% |
| djdjdj.NanoSkunk10 1.0 | 12 | 92% |
| maribo.melee.BMV 0.1 | 12 | 58% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 44% | 85 |
| mld.DustBunny 3.8 | 13 | 15% | 58 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 14 |
| maribo.melee.BMV 0.1 | 9 | 10% | 14 |
| fullsail.SweetTea 1.1 | 7 | 8% | 15 |
| zyx.nano.Ant 1.1 | 5 | 6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 12 |
| cs.Grudge 1.0 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.4 | 108 / 210 | 2.76 | 18.3% | 33925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.3% | 108 |
| myl.micro.Troodon 1.10 | 2.0 | 15.7% | 52 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.1% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.4% | 5 |
| fm.mammillarias 1.3 | 5.2 | 9.8% | 2 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.0% | 7 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.4% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.4% | 1 |
| sample.Fire 1.0 | 9.3 | 4.5% | 3 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.4 | 16 / 35 | 5577 |
| 2 | 1 | 67.9 | 79.0 | 17 / 35 | 5735 |
| 3 | 1 | 67.7 | 81.6 | 20 / 35 | 5398 |
| 4 | 1 | 66.1 | 76.8 | 14 / 35 | 5153 |
| 5 | 1 | 68.9 | 80.6 | 18 / 35 | 6055 |
| 6 | 1 | 69.5 | 85.1 | 23 / 35 | 6007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 94% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 78% |
| fm.mammillarias 1.3 | 10 | 90% |
| myl.nano.KomoriNinja 1.1 | 9 | 89% |
| sp.Nanos.Ember 1.1 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 25% | 40 |
| myl.micro.Troodon 1.10 | 25 | 25% | 80 |
| fm.mammillarias 1.3 | 23 | 23% | 26 |
| cb.nano.Insomnia 1.0 | 14 | 14% | 19 |
| myl.nano.KomoriNinja 1.1 | 8 | 8% | 26 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 5 |
| sample.Fire 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 85.8 | 133 / 210 | 2.28 | 20.1% | 39529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.1% | 133 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.0% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.5% | 3 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.5% | 21 |
| tj.zombie1n 1.0.1 | 6.0 | 8.6% | 6 |
| yk.JahMicro 1.0 | 7.0 | 8.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.2% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 7 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.4 | 24 / 35 | 6243 |
| 2 | 1 | 67.0 | 76.8 | 17 / 35 | 6260 |
| 3 | 1 | 70.7 | 88.3 | 22 / 35 | 6931 |
| 4 | 1 | 70.1 | 87.3 | 24 / 35 | 6456 |
| 5 | 1 | 71.1 | 90.5 | 25 / 35 | 6732 |
| 6 | 1 | 70.0 | 86.3 | 21 / 35 | 6907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 81% |
| stelo.SoJNanoMelee 1.1 | 44 | 86% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 4 | 50% |

Hadur died in 78 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 35 | 45% | 76 |
| stelo.SoJNanoMelee 1.1 | 12 | 15% | 38 |
| yk.JahMicro 1.0 | 7 | 9% | 12 |
| tvv.micro.Antares 1.1.1 | 6 | 8% | 28 |
| repositorio.NanoStep 1.0 | 5 | 6% | 9 |
| tj.zombie1n 1.0.1 | 5 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 5% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.9 | 89 / 210 | 3.70 | 15.9% | 29892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 15.9% | 89 |
| oog.melee.Corsair 1.0 | 2.3 | 12.4% | 31 |
| ahf.NanoAndrew .4 | 3.8 | 11.6% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 25 |
| sam.Samspin 1.0 | 4.8 | 10.4% | 14 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.0% | 8 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 62.9 | 12 / 35 | 4707 |
| 2 | 1 | 65.1 | 74.0 | 19 / 35 | 5228 |
| 3 | 1 | 61.6 | 64.1 | 14 / 35 | 4675 |
| 4 | 1 | 62.2 | 67.0 | 12 / 35 | 4919 |
| 5 | 1 | 64.0 | 72.1 | 14 / 35 | 5117 |
| 6 | 1 | 66.5 | 79.7 | 18 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 86% |
| oog.melee.Corsair 1.0 | 25 | 68% |
| ahf.NanoAndrew .4 | 24 | 79% |
| sam.Samspin 1.0 | 12 | 92% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 3 | 67% |

Hadur died in 122 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 17% | 40 |
| robar.nano.Assertive_Melee 0.2 | 20 | 16% | 24 |
| EBBU.Sim2 1.02 | 18 | 15% | 23 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 37 |
| ahf.NanoAndrew .4 | 15 | 12% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 13 |
| sam.Samspin 1.0 | 9 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 13 |
| sample.TrackFire 1.0 | 4 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.8 | 125 / 210 | 2.55 | 18.5% | 32096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.5% | 125 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 35 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.6% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.1% | 15 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.0% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.4% | 8 |
| fm.claire 1.7 | 6.5 | 8.2% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 4 |
| pa.Improved 1.0 | 9.2 | 6.3% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.0 | 17 / 35 | 4708 |
| 2 | 1 | 69.8 | 86.0 | 24 / 35 | 6237 |
| 3 | 1 | 66.2 | 78.1 | 20 / 35 | 5017 |
| 4 | 1 | 69.1 | 87.6 | 22 / 35 | 5327 |
| 5 | 1 | 70.8 | 92.4 | 27 / 35 | 5897 |
| 6 | 1 | 64.2 | 73.3 | 15 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 80% |
| oog.melee.CapuletDroid 1.1 | 32 | 94% |
| gh.nano.Grofvuil 0.2 | 14 | 71% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| sample.SpinBot 1.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 36% | 76 |
| gh.nano.Grofvuil 0.2 | 17 | 20% | 31 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 41 |
| fm.claire 1.7 | 8 | 9% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 17 |
| sample.SpinBot 1.0 | 6 | 7% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 9 |
| kurios.DOSexe .9b | 2 | 2% | 8 |
| pa.Improved 1.0 | 2 | 2% | 8 |

## Melee bench: F07

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.0 | 80 / 210 | 2.98 | 17.1% | 33352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 17.1% | 80 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.8% | 36 |
| mz.MicroGodMelee 1 | 3.0 | 13.7% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.7% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 11 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.6% | 2 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 3 |
| el.JumpShoot 0.2 | 8.3 | 6.4% | 4 |
| fire219.CatBot 1.0 | 8.5 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 72.4 | 16 / 35 | 5497 |
| 2 | 1 | 66.3 | 81.0 | 13 / 35 | 5333 |
| 3 | 1 | 66.1 | 78.1 | 14 / 35 | 5496 |
| 4 | 1 | 67.6 | 81.9 | 12 / 35 | 6004 |
| 5 | 1 | 66.3 | 79.7 | 12 / 35 | 5442 |
| 6 | 1 | 65.4 | 75.2 | 13 / 35 | 5580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 86% |
| mz.MicroGodMelee 1 | 39 | 44% |
| gh.micro.Gruweltje 0.7 | 26 | 46% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 43 | 33% | 66 |
| gh.micro.Gruweltje 0.7 | 31 | 24% | 46 |
| spinnercat.micro.Tyger 0.1 | 25 | 19% | 52 |
| acogdev.alpha 0.2 | 10 | 8% | 13 |
| caimano.Furia_Ceca 0.22 | 9 | 7% | 9 |
| el.JumpShoot 0.2 | 4 | 3% | 6 |
| fire219.CatBot 1.0 | 3 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |

## Melee bench: F08

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 72.8 | 107 / 210 | 3.45 | 16.7% | 32074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.2 | 16.7% | 107 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.2% | 29 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.7% | 6 |
| germ.TheMind .2 | 5.5 | 9.1% | 8 |
| awesomeness.Elite 1.0 | 5.7 | 9.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 1 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 71.7 | 18 / 35 | 5517 |
| 2 | 1 | 63.9 | 70.8 | 16 / 35 | 4908 |
| 3 | 1 | 64.3 | 69.5 | 19 / 35 | 4993 |
| 4 | 1 | 65.8 | 73.7 | 17 / 35 | 5500 |
| 5 | 2 | 64.1 | 68.9 | 16 / 35 | 5256 |
| 6 | 1 | 67.9 | 82.2 | 21 / 35 | 5900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 91% |
| stelo.UntouchableNano 1.3 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| germ.TheMind .2 | 5 | 80% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 41% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 45 |
| stelo.UntouchableNano 1.3 | 13 | 13% | 21 |
| germ.TheMind .2 | 10 | 10% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 11 |

## Melee bench: F09

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.7 | 136 / 210 | 2.29 | 19.2% | 31011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 19.2% | 136 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 12 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 12 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.5% | 6 |
| stelo.PatternRobot 1.0 | 7.7 | 8.4% | 8 |
| spinnercat.Omen 1.0 | 8.3 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.2 | 27 / 35 | 5413 |
| 2 | 1 | 67.5 | 81.6 | 20 / 35 | 4793 |
| 3 | 1 | 69.5 | 85.7 | 22 / 35 | 5366 |
| 4 | 1 | 68.1 | 81.9 | 19 / 35 | 4995 |
| 5 | 1 | 70.2 | 86.7 | 24 / 35 | 5225 |
| 6 | 1 | 70.0 | 88.9 | 24 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 63 | 92% |
| nz.jdc.nano.GridFu 1.0 | 30 | 97% |
| stelo.PatternRobot 1.0 | 15 | 67% |
| maribo.IotaCT 1.1 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| ratosh.Wesco 1.4 | 8 | 88% |
| spinnercat.Omen 1.0 | 6 | 83% |

Hadur died in 74 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 20 | 27% | 31 |
| rz.HawkOnFire 0.1 | 17 | 23% | 70 |
| ratosh.Wesco 1.4 | 12 | 16% | 18 |
| timmit.nano.TimDog 0.33 | 9 | 12% | 20 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 10 |
| spinnercat.Omen 1.0 | 3 | 4% | 10 |
| maribo.IotaCT 1.1 | 2 | 3% | 13 |

## Melee bench: F10

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.5 | 158 / 210 | 1.76 | 20.8% | 37738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 20.8% | 158 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.4% | 12 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.3% | 6 |
| zyx.micro.Ant 1.1 | 5.2 | 9.4% | 13 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.6% | 0 |
| sanja.First 0.1 | 7.0 | 8.2% | 4 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 2 |
| cvt.Firsty 1.0 | 8.5 | 7.0% | 7 |
| sample.RamFire 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.1 | 26 / 35 | 6118 |
| 2 | 1 | 71.7 | 93.7 | 29 / 35 | 6389 |
| 3 | 1 | 70.2 | 93.3 | 25 / 35 | 6200 |
| 4 | 1 | 70.2 | 86.7 | 23 / 35 | 6502 |
| 5 | 1 | 71.9 | 95.9 | 28 / 35 | 6477 |
| 6 | 1 | 69.6 | 87.6 | 27 / 35 | 6052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 43 | 88% |
| tvv.nano.Polaris 1.2 | 38 | 95% |
| cvt.Firsty 1.0 | 26 | 88% |
| zyx.micro.Ant 1.1 | 19 | 74% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| sanja.First 0.1 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 23 | 44% | 43 |
| cvt.Firsty 1.0 | 7 | 13% | 30 |
| Grystrion.TrackerWO 1.0 | 7 | 13% | 19 |
| tvv.nano.Polaris 1.2 | 6 | 12% | 46 |
| baal.nano.N 1.42 | 6 | 12% | 39 |
| sample.RamFire 1.0 | 2 | 4% | 3 |
| sanja.First 0.1 | 1 | 2% | 17 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 65.4 | 72 / 210 | 4.11 | 14.7% | 30745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 16.0% | 78 |
| hadur117.micro.SaorWNG 0.1 | 2.0 | 14.7% | 72 |
| cs.Wren 1.0 | 3.0 | 12.6% | 19 |
| js.PinBall 1.6 | 4.2 | 11.4% | 16 |
| mz.Cork 0.1 | 4.3 | 11.1% | 15 |
| joe.ADinosaur 1.0 | 6.3 | 9.5% | 5 |
| evd.X1 0.01 | 6.7 | 8.4% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 6.0% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 52.4 | 9 / 35 | 4710 |
| 2 | 1 | 64.2 | 71.1 | 15 / 35 | 5443 |
| 3 | 1 | 63.8 | 69.8 | 14 / 35 | 5271 |
| 4 | 4 | 58.3 | 57.1 | 8 / 35 | 4455 |
| 5 | 1 | 67.2 | 81.6 | 16 / 35 | 5875 |
| 6 | 2 | 60.7 | 60.6 | 10 / 35 | 4991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 62% |
| cs.Wren 1.0 | 25 | 92% |
| js.PinBall 1.6 | 8 | 50% |
| donjezza.Jezza 1.0 | 7 | 100% |
| mz.Cork 0.1 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 67 | 49% | 102 |
| cs.Wren 1.0 | 19 | 14% | 31 |
| evd.X1 0.01 | 18 | 13% | 20 |
| js.PinBall 1.6 | 15 | 11% | 21 |
| joe.ADinosaur 1.0 | 12 | 9% | 13 |
| mz.Cork 0.1 | 6 | 4% | 14 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.0 | 127 / 210 | 2.44 | 18.7% | 29514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 18.7% | 127 |
| ntc.Opposite 1.5 | 2.8 | 11.8% | 10 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.3% | 29 |
| myl.nano.Graviton 1.10 | 3.7 | 11.2% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.7% | 6 |
| DBall.NUKE 0.1 | 7.2 | 8.1% | 4 |
| disan.Chair 2.2.0 | 7.5 | 7.7% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 5 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 74.9 | 16 / 35 | 4735 |
| 2 | 1 | 69.2 | 88.3 | 24 / 35 | 5035 |
| 3 | 1 | 66.6 | 80.0 | 19 / 35 | 4689 |
| 4 | 1 | 70.7 | 92.7 | 25 / 35 | 5411 |
| 5 | 1 | 68.7 | 87.3 | 23 / 35 | 4883 |
| 6 | 1 | 66.8 | 81.0 | 20 / 35 | 4761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 91% |
| myl.nano.Graviton 1.10 | 33 | 100% |
| ntc.Opposite 1.5 | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 7 | 43% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 23% | 41 |
| ntc.Opposite 1.5 | 17 | 20% | 32 |
| myl.nano.Graviton 1.10 | 13 | 15% | 47 |
| pfvicm.Sobieski 7.2.3b | 13 | 15% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 23 |
| disan.Chair 2.2.0 | 8 | 10% | 17 |
| DBall.NUKE 0.1 | 2 | 2% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 7 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.5 | 61 / 210 | 3.74 | 14.8% | 25996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 2.0 | 14.8% | 61 |
| oog.melee.Capulet 1.2 | 2.7 | 14.1% | 55 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.2% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.4% | 24 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.7 | 15 / 35 | 4530 |
| 2 | 3 | 61.9 | 64.8 | 10 / 35 | 4271 |
| 3 | 3 | 63.4 | 68.6 | 13 / 35 | 4487 |
| 4 | 1 | 63.0 | 70.8 | 8 / 35 | 4215 |
| 5 | 3 | 58.7 | 59.7 | 4 / 35 | 4078 |
| 6 | 1 | 64.6 | 73.7 | 11 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 88% |
| oog.melee.Capulet 1.2 | 24 | 25% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| yagami.Tidus 0.11 | 7 | 86% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 39% | 68 |
| yagami.Tidus 0.11 | 30 | 20% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 19% | 48 |
| ejb.Polaris 1.0.1 | 14 | 9% | 19 |
| kawigi.micro.Shiz 1.1 | 11 | 7% | 29 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.0 | 138 / 210 | 2.71 | 17.8% | 27825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 17.8% | 138 |
| wee.Gem 1.8.4 | 2.8 | 11.9% | 24 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 16 |
| ratosh.Nobo 0.21 | 3.8 | 11.6% | 9 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 17 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 4 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.7 | 19 / 35 | 4509 |
| 2 | 1 | 67.8 | 84.4 | 24 / 35 | 4643 |
| 3 | 1 | 64.2 | 74.9 | 20 / 35 | 4262 |
| 4 | 1 | 69.0 | 87.6 | 27 / 35 | 4805 |
| 5 | 1 | 66.5 | 77.1 | 23 / 35 | 4709 |
| 6 | 1 | 67.5 | 82.9 | 25 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 96% |
| wee.Gem 1.8.4 | 39 | 97% |
| m3thos.Eva00 1.1 | 19 | 95% |
| wompi.Quokka 1.6 | 16 | 94% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 19% | 58 |
| wee.Gem 1.8.4 | 9 | 12% | 56 |
| m3thos.Eva00 1.1 | 9 | 12% | 22 |
| wompi.Quokka 1.6 | 9 | 12% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 11 |
| maribo.FollowFire 1 | 9 | 12% | 9 |
| bayen.UbaMicro 1.4 | 7 | 10% | 17 |
| ratosh.Nobo 0.21 | 5 | 7% | 9 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.3 | 138 / 210 | 1.96 | 21.5% | 46579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 21.5% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 51 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 14 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.3% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 89.5 | 23 / 35 | 7687 |
| 2 | 1 | 72.7 | 89.2 | 22 / 35 | 7466 |
| 3 | 1 | 72.9 | 92.7 | 22 / 35 | 7810 |
| 4 | 1 | 72.5 | 87.6 | 22 / 35 | 7950 |
| 5 | 1 | 74.4 | 93.7 | 27 / 35 | 8286 |
| 6 | 1 | 71.4 | 83.2 | 22 / 35 | 7380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 115 | 77% |
| mz.NanoGod 2.02 | 17 | 76% |
| ayk.WallHugger 1.0 | 10 | 100% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| drd.Dreadknoght 0.9 | 9 | 89% |
| stelo.PianistNano 1.2 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 49% | 136 |
| mz.NanoGod 2.02 | 17 | 23% | 35 |
| exauge.GateKeeper 1.1.121g | 9 | 12% | 10 |
| ayk.WallHugger 1.0 | 6 | 8% | 14 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 73.3 | 102 / 210 | 3.40 | 16.4% | 28269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.2 | 16.4% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.2% | 33 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.7% | 16 |
| bvh.micro.Freya 0.3 | 3.8 | 11.0% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.2% | 22 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 9 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 64.1 | 14 / 35 | 4241 |
| 2 | 1 | 65.5 | 75.6 | 18 / 35 | 4990 |
| 3 | 2 | 58.2 | 56.8 | 12 / 35 | 3974 |
| 4 | 1 | 69.2 | 89.8 | 22 / 35 | 5108 |
| 5 | 1 | 66.3 | 76.5 | 18 / 35 | 5118 |
| 6 | 1 | 65.6 | 76.8 | 18 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 92% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 7 | 71% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 21% | 55 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 15% | 41 |
| bvh.micro.Freya 0.3 | 13 | 12% | 21 |
| dl.BetterWalls 1.0 | 8 | 7% | 17 |
| stelo.MirrorMicro 1.0 | 7 | 6% | 15 |
| conscience.Electron 1.3g | 6 | 6% | 6 |

## Melee bench: F17

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.2 | 145 / 210 | 1.97 | 21.3% | 43509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 21.3% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 18 |
| sul.Lunar 1.1 | 3.5 | 10.9% | 10 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.8% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 8 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 4 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.2% | 4 |
| sample.Corners 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.7 | 29 / 35 | 7435 |
| 2 | 1 | 70.6 | 85.7 | 21 / 35 | 6804 |
| 3 | 1 | 71.7 | 92.1 | 24 / 35 | 6952 |
| 4 | 1 | 70.5 | 86.7 | 23 / 35 | 6915 |
| 5 | 1 | 71.4 | 87.0 | 23 / 35 | 7788 |
| 6 | 1 | 72.3 | 90.2 | 25 / 35 | 7615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 53 | 83% |
| sul.Lunar 1.1 | 35 | 100% |
| supersample.SuperBoxBot 1.0 | 27 | 93% |
| dsw.StaticD 1.0 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 34% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 28% | 58 |
| mme.NikeEnhanced 2.0 | 8 | 12% | 18 |
| dsw.StaticD 1.0 | 6 | 9% | 19 |
| sul.Lunar 1.1 | 3 | 5% | 43 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 12 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 6 |
| sample.Corners 1.0 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWNG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.4 | 93 / 210 | 3.21 | 17.0% | 35884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNG 0.1 | 1.0 | 17.0% | 93 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 30 |
| mld.Wisdom 1.0 | 3.0 | 12.6% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 33 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 8 |
| amz.NanoClone 1.41 | 5.5 | 10.5% | 20 |
| sample.Walls 1.0 | 7.0 | 8.2% | 4 |
| GarmBox.Oranges 1.0 | 8.2 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 13 / 35 | 5710 |
| 2 | 1 | 66.0 | 76.8 | 14 / 35 | 6046 |
| 3 | 1 | 65.0 | 75.2 | 13 / 35 | 5684 |
| 4 | 1 | 66.4 | 76.2 | 20 / 35 | 5756 |
| 5 | 1 | 67.1 | 78.7 | 18 / 35 | 6120 |
| 6 | 1 | 67.3 | 77.8 | 15 / 35 | 6568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 73% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| mld.Wisdom 1.0 | 14 | 79% |
| amz.NanoClone 1.41 | 13 | 77% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 37 | 32% | 49 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 21% | 51 |
| radnor.DoctorBob 1.42 | 17 | 15% | 42 |
| KiraNL.Chupacabra 0.4 | 17 | 15% | 23 |
| amz.NanoClone 1.41 | 15 | 13% | 22 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 2 | 2% | 10 |
| jangs.ns51 1.0 | 1 | 1% | 7 |

