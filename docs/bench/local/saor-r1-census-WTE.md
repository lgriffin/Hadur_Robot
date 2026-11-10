# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.6 | 158 / 210 | 1.94 | 21.6% | 43365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 21.6% | 158 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 20 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 10 |
| mld.Infinity 2.2 | 3.8 | 12.9% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 6 |
| sample.Walls 1.0 | 6.8 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 1 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.4 | 26 / 35 | 7171 |
| 2 | 1 | 72.6 | 89.8 | 28 / 35 | 7236 |
| 3 | 1 | 73.3 | 92.1 | 30 / 35 | 7559 |
| 4 | 1 | 71.3 | 87.0 | 24 / 35 | 7182 |
| 5 | 1 | 72.6 | 91.1 | 26 / 35 | 7080 |
| 6 | 1 | 71.7 | 85.1 | 24 / 35 | 7137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 80 | 99% |
| mld.Infinity 2.2 | 39 | 95% |
| radnor.DoctorBob 1.42 | 33 | 79% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 31% | 52 |
| mld.Infinity 2.2 | 12 | 23% | 50 |
| mz.AntiGrav 1.0 | 10 | 19% | 69 |
| amz.NanoClone 1.41 | 7 | 13% | 15 |
| sample.Walls 1.0 | 3 | 6% | 5 |
| jangs.ns51 1.0 | 2 | 4% | 7 |
| arthord.MannyPacquiao Beta | 2 | 4% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.5 | 110 / 210 | 2.93 | 17.7% | 31829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.3 | 17.7% | 110 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.8% | 56 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 20 |
| maribo.melee.BMV 0.1 | 4.8 | 9.9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.1% | 5 |
| zyx.nano.Ant 1.1 | 5.7 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.9% | 7 |
| fullsail.SweetTea 1.1 | 7.3 | 7.5% | 3 |
| bzdp.BoxCar 2.0 | 9.0 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 26 / 35 | 5271 |
| 2 | 1 | 66.5 | 79.0 | 17 / 35 | 5154 |
| 3 | 1 | 69.7 | 87.6 | 24 / 35 | 5920 |
| 4 | 2 | 62.6 | 60.6 | 13 / 35 | 5089 |
| 5 | 1 | 68.4 | 88.3 | 21 / 35 | 5236 |
| 6 | 2 | 63.0 | 63.5 | 9 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 85% |
| mld.DustBunny 3.8 | 48 | 85% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| maribo.melee.BMV 0.1 | 5 | 40% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 29% | 72 |
| mld.DustBunny 3.8 | 24 | 24% | 64 |
| cs.Grudge 1.0 | 14 | 14% | 13 |
| zyx.nano.Ant 1.1 | 9 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 12 |
| maribo.melee.BMV 0.1 | 6 | 6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 12 |
| fullsail.SweetTea 1.1 | 4 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |

## Melee bench: F03

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 87.9 | 148 / 210 | 2.09 | 20.9% | 39019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.9% | 148 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 32 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 10.9% | 17 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.5% | 2 |
| fm.mammillarias 1.3 | 5.5 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.4 | 27 / 35 | 6260 |
| 2 | 1 | 70.0 | 83.2 | 20 / 35 | 6509 |
| 3 | 1 | 71.7 | 91.1 | 26 / 35 | 6388 |
| 4 | 1 | 72.4 | 90.8 | 25 / 35 | 7208 |
| 5 | 1 | 69.2 | 79.4 | 24 / 35 | 6330 |
| 6 | 1 | 71.3 | 91.4 | 26 / 35 | 6324 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 44 | 82% |
| cb.nano.Insomnia 1.0 | 23 | 100% |
| myl.nano.KomoriNinja 1.1 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| fm.mammillarias 1.3 | 8 | 88% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 15 | 24% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 23% | 43 |
| fm.mammillarias 1.3 | 9 | 15% | 14 |
| cb.nano.Insomnia 1.0 | 7 | 11% | 10 |
| myl.nano.KomoriNinja 1.1 | 6 | 10% | 37 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 19 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 11 |
| sample.Tracker 1.0 | 3 | 5% | 5 |
| sample.Fire 1.0 | 1 | 2% | 6 |

## Melee bench: F04

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.6 | 154 / 210 | 2.11 | 20.8% | 39600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.8% | 154 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 9 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.3% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.4% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 6 |
| yk.JahMicro 1.0 | 6.3 | 8.5% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.9% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.1 | 26 / 35 | 6281 |
| 2 | 1 | 71.8 | 92.1 | 28 / 35 | 6772 |
| 3 | 1 | 68.3 | 79.0 | 23 / 35 | 6167 |
| 4 | 1 | 70.9 | 86.3 | 26 / 35 | 6935 |
| 5 | 1 | 71.3 | 91.4 | 28 / 35 | 6482 |
| 6 | 1 | 70.2 | 85.7 | 23 / 35 | 6963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 85% |
| stelo.SoJNanoMelee 1.1 | 48 | 88% |
| tvv.micro.Antares 1.1.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 83% |
| yk.JahMicro 1.0 | 10 | 90% |
| tj.zombie1n 1.0.1 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 34% | 72 |
| stelo.SoJNanoMelee 1.1 | 12 | 21% | 40 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 14% | 12 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 37 |
| yk.JahMicro 1.0 | 5 | 9% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 17 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| tj.zombie1n 1.0.1 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.9 | 100 / 210 | 3.53 | 16.3% | 29157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 16.3% | 100 |
| oog.melee.Corsair 1.0 | 2.7 | 12.0% | 25 |
| ahf.NanoAndrew .4 | 3.0 | 12.0% | 32 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.4% | 30 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 6 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.3 | 17 / 35 | 4808 |
| 2 | 1 | 65.3 | 76.5 | 18 / 35 | 4892 |
| 3 | 1 | 60.2 | 60.6 | 13 / 35 | 4461 |
| 4 | 1 | 63.5 | 67.6 | 16 / 35 | 4908 |
| 5 | 1 | 66.7 | 80.0 | 19 / 35 | 4925 |
| 6 | 1 | 65.1 | 73.0 | 17 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 81% |
| oog.melee.Corsair 1.0 | 29 | 76% |
| ahf.NanoAndrew .4 | 22 | 82% |
| sam.Samspin 1.0 | 16 | 94% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 21% | 46 |
| ahf.NanoAndrew .4 | 17 | 15% | 36 |
| oog.melee.Corsair 1.0 | 16 | 15% | 40 |
| robar.nano.Assertive_Melee 0.2 | 15 | 14% | 18 |
| EBBU.Sim2 1.02 | 10 | 9% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 13 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 12 |
| sam.Samspin 1.0 | 7 | 6% | 19 |
| sample.TrackFire 1.0 | 3 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.5 | 145 / 210 | 2.21 | 19.7% | 34150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 19.7% | 145 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 25 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 12 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.2% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.8% | 4 |
| fm.claire 1.7 | 6.0 | 8.9% | 4 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.9% | 4 |
| sample.SpinBot 1.0 | 8.0 | 7.2% | 5 |
| pa.Improved 1.0 | 9.3 | 5.4% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.0 | 22 / 35 | 5181 |
| 2 | 1 | 68.5 | 84.8 | 24 / 35 | 5318 |
| 3 | 1 | 68.1 | 81.3 | 20 / 35 | 5704 |
| 4 | 1 | 71.6 | 93.0 | 29 / 35 | 6316 |
| 5 | 1 | 70.0 | 89.2 | 26 / 35 | 5751 |
| 6 | 1 | 70.1 | 89.8 | 24 / 35 | 5880 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 90% |
| oog.melee.CapuletDroid 1.1 | 36 | 100% |
| arthord.NanoSatanMelee Beta | 20 | 100% |
| gh.nano.Grofvuil 0.2 | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| sample.SpinBot 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 34% | 67 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 45 |
| arthord.NanoSatanMelee Beta | 9 | 13% | 19 |
| gh.nano.Grofvuil 0.2 | 8 | 12% | 28 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 18 |
| fm.claire 1.7 | 5 | 7% | 8 |
| sample.SpinBot 1.0 | 4 | 6% | 10 |
| kurios.DOSexe .9b | 3 | 4% | 11 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.5 | 102 / 210 | 2.67 | 18.3% | 35220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 18.3% | 102 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 35 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.0% | 21 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 1 |
| acogdev.alpha 0.2 | 7.5 | 6.6% | 2 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.7% | 1 |
| fire219.CatBot 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.9 | 17 / 35 | 5782 |
| 2 | 1 | 68.2 | 80.0 | 17 / 35 | 6498 |
| 3 | 1 | 68.9 | 83.5 | 17 / 35 | 6206 |
| 4 | 1 | 66.7 | 81.6 | 14 / 35 | 5360 |
| 5 | 1 | 67.9 | 81.3 | 18 / 35 | 5769 |
| 6 | 1 | 67.9 | 80.6 | 19 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 41 | 56% |
| spinnercat.micro.Tyger 0.1 | 37 | 89% |
| gh.micro.Gruweltje 0.7 | 26 | 81% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 44 | 41% | 69 |
| spinnercat.micro.Tyger 0.1 | 25 | 23% | 52 |
| gh.micro.Gruweltje 0.7 | 18 | 17% | 42 |
| DBall.Anarchy 0.1 | 6 | 6% | 19 |
| acogdev.alpha 0.2 | 5 | 5% | 8 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 71.9 | 117 / 210 | 3.53 | 16.8% | 30982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.2 | 16.8% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.9% | 6 |
| awesomeness.Elite 1.0 | 5.5 | 9.1% | 5 |
| germ.TheMind .2 | 5.5 | 9.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| sample.Crazy 1.0 | 8.2 | 7.2% | 4 |
| stelo.UntouchableNano 1.3 | 8.8 | 6.7% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.5 | 23 / 35 | 5908 |
| 2 | 1 | 64.4 | 67.0 | 19 / 35 | 5170 |
| 3 | 1 | 67.5 | 79.4 | 21 / 35 | 5452 |
| 4 | 2 | 63.1 | 66.3 | 16 / 35 | 4769 |
| 5 | 1 | 66.1 | 74.3 | 21 / 35 | 5012 |
| 6 | 1 | 61.5 | 61.6 | 17 / 35 | 4671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 91% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 374. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 37% | 93 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 22% | 44 |
| germ.TheMind .2 | 11 | 12% | 21 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 12 |
| awesomeness.Elite 1.0 | 5 | 5% | 12 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |

## Melee bench: F09

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.2 | 153 / 210 | 1.98 | 20.2% | 32063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.2% | 153 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 11.8% | 12 |
| maribo.IotaCT 1.1 | 4.8 | 9.9% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.9% | 3 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 8 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 8.2% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.6% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.3 | 28 / 35 | 6014 |
| 2 | 1 | 69.9 | 88.6 | 26 / 35 | 4798 |
| 3 | 1 | 69.7 | 87.3 | 24 / 35 | 5233 |
| 4 | 1 | 68.9 | 85.1 | 23 / 35 | 4909 |
| 5 | 1 | 71.5 | 91.4 | 27 / 35 | 5725 |
| 6 | 1 | 70.5 | 88.3 | 25 / 35 | 5384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 89% |
| nz.jdc.nano.GridFu 1.0 | 38 | 97% |
| timmit.nano.TimDog 0.33 | 18 | 83% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| maribo.IotaCT 1.1 | 8 | 88% |
| ratosh.Wesco 1.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 62 |
| timmit.nano.TimDog 0.33 | 11 | 19% | 27 |
| ratosh.Wesco 1.4 | 7 | 12% | 18 |
| nz.jdc.nano.GridFu 1.0 | 6 | 11% | 50 |
| stelo.PatternRobot 1.0 | 6 | 11% | 20 |
| maribo.IotaCT 1.1 | 5 | 9% | 16 |
| spinnercat.Omen 1.0 | 5 | 9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |

## Melee bench: F10

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 95.8 | 183 / 210 | 1.38 | 22.3% | 40310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 22.3% | 183 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 9 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 3 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 10 |
| sanja.First 0.1 | 6.7 | 8.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 1 |
| cvt.Firsty 1.0 | 8.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 93.3 | 30 / 35 | 6244 |
| 2 | 1 | 72.4 | 93.7 | 30 / 35 | 6777 |
| 3 | 1 | 73.4 | 99.7 | 34 / 35 | 6724 |
| 4 | 1 | 72.3 | 96.8 | 30 / 35 | 6906 |
| 5 | 1 | 72.4 | 95.9 | 29 / 35 | 6766 |
| 6 | 1 | 72.6 | 95.2 | 30 / 35 | 6893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 95% |
| zyx.micro.Ant 1.1 | 34 | 79% |
| baal.nano.N 1.42 | 32 | 94% |
| cvt.Firsty 1.0 | 28 | 100% |
| sanja.First 0.1 | 24 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 41% | 44 |
| Grystrion.TrackerWO 1.0 | 4 | 15% | 15 |
| tvv.nano.Polaris 1.2 | 3 | 11% | 56 |
| baal.nano.N 1.42 | 3 | 11% | 32 |
| sanja.First 0.1 | 2 | 7% | 22 |
| sample.RamFire 1.0 | 2 | 7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 4 |
| cvt.Firsty 1.0 | 0 | 0% | 24 |

## Melee bench: F11

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 90 / 210 | 3.55 | 16.1% | 31776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.3 | 16.1% | 90 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 60 |
| cs.Wren 1.0 | 2.8 | 12.7% | 28 |
| mz.Cork 0.1 | 4.2 | 11.2% | 10 |
| js.PinBall 1.6 | 4.8 | 10.5% | 11 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 4 |
| evd.X1 0.01 | 7.2 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 66.3 | 15 / 35 | 5160 |
| 2 | 1 | 64.5 | 71.4 | 19 / 35 | 5161 |
| 3 | 1 | 64.7 | 73.7 | 12 / 35 | 5655 |
| 4 | 1 | 67.5 | 80.3 | 17 / 35 | 5944 |
| 5 | 1 | 64.8 | 72.4 | 15 / 35 | 5295 |
| 6 | 2 | 61.1 | 65.7 | 12 / 35 | 4561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 74 | 69% |
| cs.Wren 1.0 | 27 | 74% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 45% | 105 |
| cs.Wren 1.0 | 18 | 15% | 33 |
| joe.ADinosaur 1.0 | 13 | 11% | 14 |
| js.PinBall 1.6 | 12 | 10% | 17 |
| mz.Cork 0.1 | 8 | 7% | 12 |
| evd.X1 0.01 | 7 | 6% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 8 |

## Melee bench: F12

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.0 | 147 / 210 | 2.17 | 19.8% | 31108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 19.8% | 147 |
| ntc.Opposite 1.5 | 2.8 | 11.2% | 8 |
| myl.nano.Graviton 1.10 | 3.2 | 12.0% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.2% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.4% | 3 |
| disan.Chair 2.2.0 | 7.2 | 8.1% | 6 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 5.7% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.3 | 22 / 35 | 5067 |
| 2 | 1 | 69.3 | 87.0 | 23 / 35 | 5273 |
| 3 | 1 | 70.0 | 90.5 | 26 / 35 | 5132 |
| 4 | 1 | 70.3 | 89.8 | 26 / 35 | 5370 |
| 5 | 1 | 70.8 | 90.8 | 27 / 35 | 5313 |
| 6 | 1 | 68.3 | 83.8 | 23 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 46 | 93% |
| stelo.AreaTargetingBot 1.1 | 28 | 93% |
| ntc.Opposite 1.5 | 19 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| pfvicm.Sobieski 7.2.3b | 12 | 100% |
| disan.Chair 2.2.0 | 12 | 92% |
| donjezza.Muncho 1.0 | 11 | 91% |
| DBall.NUKE 0.1 | 9 | 89% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 14 | 22% | 21 |
| myl.nano.Graviton 1.10 | 12 | 19% | 48 |
| stelo.AreaTargetingBot 1.1 | 12 | 19% | 41 |
| ntc.Opposite 1.5 | 10 | 16% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 13% | 24 |
| disan.Chair 2.2.0 | 4 | 6% | 19 |
| donjezza.Muncho 1.0 | 3 | 5% | 12 |
| pbg.R2D2 1.0 | 1 | 2% | 11 |
| DBall.NUKE 0.1 | 0 | 0% | 6 |

## Melee bench: F13

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.0 | 89 / 210 | 3.52 | 15.7% | 26044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 15.7% | 89 |
| oog.melee.Capulet 1.2 | 2.8 | 13.1% | 45 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 20 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 10 |
| stelo.MirrorNano 1.3 | 7.5 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 74.3 | 16 / 35 | 4862 |
| 2 | 1 | 64.0 | 73.3 | 14 / 35 | 4260 |
| 3 | 1 | 62.5 | 66.0 | 14 / 35 | 4102 |
| 4 | 1 | 64.1 | 72.7 | 15 / 35 | 4225 |
| 5 | 1 | 65.4 | 74.0 | 14 / 35 | 4534 |
| 6 | 1 | 63.9 | 71.4 | 16 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 32 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| oog.melee.Capulet 1.2 | 27 | 56% |
| yagami.Tidus 0.11 | 18 | 100% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| step.nanoPri 1.0 | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 37% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 43 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 36 |
| yagami.Tidus 0.11 | 13 | 11% | 31 |
| ejb.Polaris 1.0.1 | 11 | 9% | 16 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| step.nanoPri 1.0 | 6 | 5% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 7 |

## Melee bench: F14

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.4 | 139 / 210 | 2.67 | 17.9% | 27632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 17.9% | 139 |
| bzdp.Pansy 2.1 | 2.2 | 12.9% | 24 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 19 |
| wompi.Quokka 1.6 | 4.2 | 11.3% | 9 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 10 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.6% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.8 | 23 / 35 | 4557 |
| 2 | 1 | 68.6 | 86.0 | 25 / 35 | 4884 |
| 3 | 1 | 66.4 | 82.2 | 24 / 35 | 4151 |
| 4 | 1 | 67.3 | 81.6 | 24 / 35 | 4882 |
| 5 | 1 | 67.8 | 85.1 | 23 / 35 | 4617 |
| 6 | 1 | 65.6 | 76.8 | 20 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 93% |
| wee.Gem 1.8.4 | 41 | 98% |
| wompi.Quokka 1.6 | 23 | 96% |
| ratosh.Nobo 0.21 | 15 | 73% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| m3thos.Eva00 1.1 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 21% | 60 |
| wee.Gem 1.8.4 | 10 | 14% | 52 |
| ratosh.Nobo 0.21 | 10 | 14% | 23 |
| maribo.FollowFire 1 | 10 | 14% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 10 |
| m3thos.Eva00 1.1 | 6 | 8% | 15 |
| wompi.Quokka 1.6 | 4 | 6% | 20 |
| bayen.UbaMicro 1.4 | 4 | 6% | 8 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.2 | 122 / 210 | 2.33 | 20.6% | 45063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 20.6% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 18.1% | 69 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 16 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.7% | 1 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 83.5 | 22 / 35 | 6949 |
| 2 | 1 | 71.4 | 86.3 | 22 / 35 | 7276 |
| 3 | 1 | 72.1 | 86.7 | 20 / 35 | 7604 |
| 4 | 1 | 71.8 | 85.7 | 20 / 35 | 7515 |
| 5 | 1 | 71.2 | 82.9 | 19 / 35 | 7487 |
| 6 | 1 | 72.4 | 86.0 | 19 / 35 | 8232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 73% |
| mz.NanoGod 2.02 | 20 | 65% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 44% | 126 |
| mz.NanoGod 2.02 | 32 | 36% | 48 |
| ayk.WallHugger 1.0 | 8 | 9% | 12 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 12 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 74.5 | 103 / 210 | 3.30 | 17.0% | 30050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 17.0% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.9% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.7% | 27 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 21 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 4 |
| conscience.Electron 1.3g | 7.2 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 6 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.1 | 17 / 35 | 5094 |
| 2 | 1 | 65.2 | 73.7 | 19 / 35 | 4637 |
| 3 | 1 | 65.4 | 74.6 | 17 / 35 | 4973 |
| 4 | 1 | 65.6 | 78.7 | 14 / 35 | 5071 |
| 5 | 1 | 63.7 | 67.0 | 14 / 35 | 5004 |
| 6 | 1 | 67.7 | 81.9 | 22 / 35 | 5271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 89% |
| dummy.micro.Sparrow 2.5 | 23 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 73% |
| bvh.micro.Freya 0.3 | 15 | 73% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 495. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 21% | 63 |
| mn.nano.perceptual.Impact 1.3.0 | 19 | 18% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 38 |
| dummy.micro.Sparrow 2.5 | 14 | 13% | 37 |
| bvh.micro.Freya 0.3 | 12 | 11% | 19 |
| conscience.Electron 1.3g | 11 | 10% | 13 |
| dl.BetterWalls 1.0 | 7 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.3 | 155 / 210 | 2.05 | 21.7% | 42858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 21.7% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 25 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.1% | 10 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 8 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 2 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.6% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.5% | 2 |
| sample.Corners 1.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 81.9 | 26 / 35 | 7305 |
| 2 | 1 | 72.0 | 89.2 | 24 / 35 | 7154 |
| 3 | 1 | 72.3 | 90.8 | 25 / 35 | 7236 |
| 4 | 1 | 71.0 | 88.9 | 24 / 35 | 6427 |
| 5 | 1 | 72.2 | 90.2 | 27 / 35 | 7205 |
| 6 | 1 | 72.6 | 88.9 | 29 / 35 | 7531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 53 | 91% |
| sul.Lunar 1.1 | 43 | 98% |
| supersample.SuperBoxBot 1.0 | 34 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 100% |
| dsw.StaticD 1.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 86% |
| sample.Corners 1.0 | 4 | 75% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 35% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 27% | 64 |
| dsw.StaticD 1.0 | 8 | 15% | 20 |
| sul.Lunar 1.1 | 5 | 9% | 51 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 77.5 | 110 / 210 | 3.03 | 17.9% | 37126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTE 0.1 | 1.0 | 17.9% | 110 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 38 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.0% | 21 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 6 |
| amz.NanoClone 1.41 | 5.7 | 9.3% | 6 |
| sample.Walls 1.0 | 7.7 | 7.6% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.5 | 7.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 67.6 | 17 / 35 | 5753 |
| 2 | 1 | 66.8 | 75.6 | 19 / 35 | 6199 |
| 3 | 1 | 66.1 | 75.9 | 15 / 35 | 5838 |
| 4 | 1 | 68.3 | 82.2 | 18 / 35 | 6587 |
| 5 | 1 | 67.7 | 80.0 | 19 / 35 | 6212 |
| 6 | 1 | 69.0 | 83.5 | 22 / 35 | 6537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 86% |
| mld.Wisdom 1.0 | 14 | 79% |
| jangs.ns51 1.0 | 12 | 83% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 26% | 41 |
| radnor.DoctorBob 1.42 | 23 | 23% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 55 |
| KiraNL.Chupacabra 0.4 | 17 | 17% | 27 |
| amz.NanoClone 1.41 | 7 | 7% | 12 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 7 |

