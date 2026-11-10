# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.8 | 160 / 210 | 1.82 | 21.8% | 43021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.8% | 160 |
| radnor.DoctorBob 1.42 | 2.5 | 14.0% | 17 |
| mz.AntiGrav 1.0 | 2.7 | 13.8% | 14 |
| mld.Infinity 2.2 | 3.8 | 12.3% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 2 |
| sample.Walls 1.0 | 6.7 | 6.9% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.6% | 1 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 90.5 | 26 / 35 | 6507 |
| 2 | 1 | 73.4 | 91.7 | 25 / 35 | 7617 |
| 3 | 1 | 72.5 | 88.9 | 26 / 35 | 7411 |
| 4 | 1 | 71.9 | 87.9 | 26 / 35 | 7240 |
| 5 | 1 | 72.9 | 91.4 | 29 / 35 | 7316 |
| 6 | 1 | 73.0 | 94.6 | 28 / 35 | 6930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 96% |
| mld.Infinity 2.2 | 36 | 92% |
| radnor.DoctorBob 1.42 | 34 | 82% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 7 | 86% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 39% | 73 |
| mz.AntiGrav 1.0 | 9 | 18% | 77 |
| amz.NanoClone 1.41 | 7 | 14% | 17 |
| mld.Infinity 2.2 | 5 | 10% | 12 |
| GarmBox.Oranges 1.0 | 4 | 8% | 8 |
| sample.Walls 1.0 | 4 | 8% | 7 |
| jangs.ns51 1.0 | 2 | 4% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 80.9 | 124 / 210 | 2.72 | 18.0% | 30724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.0% | 124 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 54 |
| mld.DustBunny 3.8 | 3.0 | 12.9% | 16 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.0% | 4 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.2% | 7 |
| bzdp.BoxCar 2.0 | 7.3 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 6.1% | 2 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.9 | 25 / 35 | 4962 |
| 2 | 1 | 69.5 | 90.2 | 25 / 35 | 5524 |
| 3 | 1 | 66.2 | 79.7 | 21 / 35 | 4568 |
| 4 | 1 | 69.0 | 86.3 | 20 / 35 | 5340 |
| 5 | 1 | 64.4 | 64.8 | 12 / 35 | 5479 |
| 6 | 1 | 66.8 | 81.6 | 21 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 72% |
| mld.DustBunny 3.8 | 54 | 89% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 86% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 34% | 72 |
| mld.DustBunny 3.8 | 19 | 22% | 56 |
| zyx.nano.Ant 1.1 | 8 | 9% | 15 |
| cs.Grudge 1.0 | 8 | 9% | 9 |
| fullsail.SweetTea 1.1 | 7 | 8% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 12 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 14 |
| maribo.melee.BMV 0.1 | 4 | 5% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.7 | 156 / 210 | 2.10 | 21.2% | 39289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.2% | 156 |
| myl.micro.Troodon 1.10 | 2.0 | 13.6% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.2% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.8% | 9 |
| fm.mammillarias 1.3 | 5.8 | 8.7% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.5% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.3 | 24 / 35 | 6872 |
| 2 | 1 | 69.9 | 81.9 | 23 / 35 | 6372 |
| 3 | 1 | 70.4 | 83.2 | 25 / 35 | 5911 |
| 4 | 1 | 72.9 | 94.0 | 29 / 35 | 6759 |
| 5 | 1 | 71.7 | 87.9 | 28 / 35 | 6771 |
| 6 | 1 | 72.3 | 92.1 | 27 / 35 | 6604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 93% |
| cb.nano.Insomnia 1.0 | 24 | 88% |
| sp.Nanos.Ember 1.1 | 20 | 90% |
| myl.nano.KomoriNinja 1.1 | 17 | 82% |
| fm.mammillarias 1.3 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 11 | 20% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 20% | 43 |
| myl.nano.KomoriNinja 1.1 | 8 | 15% | 33 |
| cb.nano.Insomnia 1.0 | 7 | 13% | 10 |
| fm.mammillarias 1.3 | 5 | 9% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 7% | 14 |
| sp.Nanos.Ember 1.1 | 3 | 6% | 27 |
| sample.Fire 1.0 | 3 | 6% | 5 |
| sample.Tracker 1.0 | 2 | 4% | 4 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.6 | 150 / 210 | 2.20 | 20.5% | 39203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 14 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.7% | 7 |
| tj.zombie1n 1.0.1 | 5.5 | 8.9% | 8 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.7% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.6% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.8% | 3 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 5 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.4 | 26 / 35 | 6324 |
| 2 | 1 | 71.5 | 90.2 | 24 / 35 | 7089 |
| 3 | 1 | 69.1 | 80.0 | 23 / 35 | 6754 |
| 4 | 1 | 68.1 | 80.3 | 22 / 35 | 6026 |
| 5 | 1 | 71.7 | 92.7 | 28 / 35 | 6618 |
| 6 | 1 | 71.1 | 91.1 | 27 / 35 | 6392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 92% |
| stelo.SoJNanoMelee 1.1 | 35 | 94% |
| tvv.micro.Antares 1.1.1 | 20 | 100% |
| tj.zombie1n 1.0.1 | 17 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 71% |
| yk.JahMicro 1.0 | 10 | 80% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 38% | 90 |
| stelo.SoJNanoMelee 1.1 | 9 | 15% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 12% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 21 |
| tj.zombie1n 1.0.1 | 6 | 10% | 10 |
| yk.JahMicro 1.0 | 4 | 7% | 10 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 29 |
| repositorio.NanoStep 1.0 | 2 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.6 | 97 / 210 | 3.55 | 16.4% | 30201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.4% | 97 |
| oog.melee.Corsair 1.0 | 2.2 | 12.9% | 35 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 23 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 26 |
| EBBU.Sim2 1.02 | 6.2 | 9.3% | 4 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 66.3 | 15 / 35 | 5121 |
| 2 | 1 | 67.2 | 78.4 | 18 / 35 | 5658 |
| 3 | 1 | 64.5 | 70.5 | 17 / 35 | 4989 |
| 4 | 1 | 67.7 | 81.6 | 20 / 35 | 5475 |
| 5 | 1 | 60.0 | 61.3 | 11 / 35 | 4387 |
| 6 | 1 | 63.9 | 71.7 | 16 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 91% |
| oog.melee.Corsair 1.0 | 35 | 57% |
| ahf.NanoAndrew .4 | 17 | 88% |
| sam.Samspin 1.0 | 9 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 22 | 19% | 24 |
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 49 |
| oog.melee.Corsair 1.0 | 20 | 18% | 48 |
| ahf.NanoAndrew .4 | 11 | 10% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 10% | 12 |
| EBBU.Sim2 1.02 | 9 | 8% | 15 |
| sam.Samspin 1.0 | 9 | 8% | 15 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 13 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.5 | 144 / 210 | 2.13 | 19.2% | 31251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.2% | 144 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 26 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.0% | 6 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.8% | 14 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 7 |
| fm.claire 1.7 | 5.8 | 8.5% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.3% | 8 |
| sample.SpinBot 1.0 | 7.7 | 7.8% | 3 |
| pa.Improved 1.0 | 9.2 | 6.4% | 2 |
| kurios.DOSexe .9b | 9.7 | 6.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 23 / 35 | 5314 |
| 2 | 1 | 68.9 | 88.9 | 24 / 35 | 5285 |
| 3 | 1 | 67.8 | 83.8 | 23 / 35 | 5186 |
| 4 | 1 | 68.8 | 86.0 | 24 / 35 | 5151 |
| 5 | 1 | 67.5 | 82.5 | 23 / 35 | 5402 |
| 6 | 1 | 70.1 | 94.0 | 27 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 90% |
| oog.melee.CapuletDroid 1.1 | 35 | 91% |
| gh.nano.Grofvuil 0.2 | 16 | 94% |
| arthord.NanoSatanMelee Beta | 13 | 77% |
| winamp32.micro.MicroMacro 1.0 | 8 | 75% |
| kurios.DOSexe .9b | 8 | 63% |
| fm.claire 1.7 | 6 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 24% | 87 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 38 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 12 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 11 |
| kurios.DOSexe .9b | 7 | 10% | 22 |
| winamp32.micro.MicroMacro 1.0 | 7 | 10% | 17 |
| fm.claire 1.7 | 7 | 10% | 13 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| pa.Improved 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.9 | 106 / 210 | 2.54 | 18.6% | 35242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 106 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.1% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 21 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 24 |
| DBall.Anarchy 0.1 | 5.0 | 8.5% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 2 |
| acogdev.alpha 0.2 | 7.8 | 6.0% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 6.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 19 / 35 | 6368 |
| 2 | 1 | 70.5 | 91.1 | 20 / 35 | 6270 |
| 3 | 1 | 67.2 | 78.7 | 19 / 35 | 5408 |
| 4 | 1 | 66.4 | 76.5 | 11 / 35 | 5525 |
| 5 | 1 | 68.8 | 82.5 | 19 / 35 | 6009 |
| 6 | 1 | 67.8 | 81.0 | 18 / 35 | 5662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 87% |
| mz.MicroGodMelee 1 | 44 | 64% |
| gh.micro.Gruweltje 0.7 | 35 | 40% |
| DBall.Anarchy 0.1 | 13 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 38 | 36% | 54 |
| mz.MicroGodMelee 1 | 30 | 29% | 62 |
| spinnercat.micro.Tyger 0.1 | 17 | 16% | 51 |
| acogdev.alpha 0.2 | 6 | 6% | 9 |
| DBall.Anarchy 0.1 | 4 | 4% | 17 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.0 | 115 / 210 | 3.61 | 16.5% | 30810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.5% | 115 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.1% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 34 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 9 |
| awesomeness.Elite 1.0 | 5.7 | 9.2% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.7% | 3 |
| germ.TheMind .2 | 6.0 | 8.9% | 6 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 2 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 62.2 | 16 / 35 | 4574 |
| 2 | 1 | 64.7 | 71.7 | 20 / 35 | 4779 |
| 3 | 1 | 65.4 | 70.5 | 19 / 35 | 5572 |
| 4 | 1 | 65.0 | 71.1 | 18 / 35 | 5091 |
| 5 | 1 | 64.7 | 70.8 | 18 / 35 | 5207 |
| 6 | 1 | 67.7 | 79.7 | 24 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| germ.TheMind .2 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 52% | 110 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 15% | 35 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 15 |
| germ.TheMind .2 | 7 | 7% | 18 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.3 | 171 / 210 | 1.88 | 20.8% | 32187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.8% | 171 |
| rz.HawkOnFire 0.1 | 2.2 | 12.9% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 6 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.4% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 8.8% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 6 |
| stelo.PatternRobot 1.0 | 7.5 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 8.0% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.4 | 25 / 35 | 5331 |
| 2 | 1 | 71.8 | 93.7 | 30 / 35 | 5334 |
| 3 | 1 | 71.2 | 89.8 | 27 / 35 | 5439 |
| 4 | 1 | 72.0 | 93.3 | 30 / 35 | 5697 |
| 5 | 1 | 70.5 | 87.6 | 28 / 35 | 5035 |
| 6 | 1 | 71.9 | 92.7 | 31 / 35 | 5351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 97% |
| nz.jdc.nano.GridFu 1.0 | 43 | 100% |
| stelo.PatternRobot 1.0 | 17 | 100% |
| maribo.IotaCT 1.1 | 11 | 91% |
| ratosh.Wesco 1.4 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 11 | 28% | 26 |
| maribo.IotaCT 1.1 | 7 | 18% | 26 |
| rz.HawkOnFire 0.1 | 6 | 15% | 57 |
| ratosh.Wesco 1.4 | 6 | 15% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 10% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3 | 8% | 50 |
| stelo.PatternRobot 1.0 | 1 | 3% | 13 |
| spinnercat.Omen 1.0 | 1 | 3% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 89.2 | 170 / 210 | 1.98 | 20.8% | 37045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.8% | 170 |
| baal.nano.N 1.42 | 2.3 | 11.8% | 4 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.5% | 16 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.1% | 3 |
| sanja.First 0.1 | 5.8 | 8.9% | 7 |
| zyx.micro.Ant 1.1 | 6.3 | 9.0% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.4% | 0 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.2 | 28 / 35 | 6206 |
| 2 | 1 | 70.3 | 87.0 | 28 / 35 | 6378 |
| 3 | 1 | 72.3 | 92.4 | 31 / 35 | 6918 |
| 4 | 1 | 70.0 | 88.3 | 27 / 35 | 5805 |
| 5 | 1 | 69.5 | 86.0 | 27 / 35 | 5816 |
| 6 | 1 | 71.2 | 91.1 | 29 / 35 | 5922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 100% |
| tvv.nano.Polaris 1.2 | 30 | 83% |
| cvt.Firsty 1.0 | 30 | 100% |
| sanja.First 0.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| zyx.micro.Ant 1.1 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Grystrion.TrackerWO 1.0 | 9 | 23% | 24 |
| tvv.nano.Polaris 1.2 | 6 | 15% | 52 |
| zyx.micro.Ant 1.1 | 5 | 13% | 30 |
| sanja.First 0.1 | 4 | 10% | 23 |
| sample.RamFire 1.0 | 4 | 10% | 6 |
| baal.nano.N 1.42 | 3 | 8% | 40 |
| cvt.Firsty 1.0 | 3 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 3 | 8% | 10 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 3 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.8 | 85 / 210 | 3.54 | 16.1% | 31166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 16.1% | 85 |
| kc.micro.Figment 1.0 | 1.7 | 15.6% | 76 |
| cs.Wren 1.0 | 3.5 | 12.3% | 17 |
| mz.Cork 0.1 | 4.3 | 11.0% | 12 |
| js.PinBall 1.6 | 4.3 | 11.1% | 13 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 1 |
| evd.X1 0.01 | 6.7 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.2 | 15 / 35 | 5235 |
| 2 | 1 | 63.7 | 70.8 | 15 / 35 | 4782 |
| 3 | 2 | 64.2 | 72.1 | 9 / 35 | 5052 |
| 4 | 1 | 63.6 | 67.3 | 17 / 35 | 5500 |
| 5 | 2 | 61.4 | 61.9 | 13 / 35 | 4991 |
| 6 | 1 | 67.6 | 82.5 | 16 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 83 | 59% |
| cs.Wren 1.0 | 21 | 95% |
| mz.Cork 0.1 | 9 | 67% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 125 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 46% | 107 |
| cs.Wren 1.0 | 14 | 11% | 30 |
| joe.ADinosaur 1.0 | 14 | 11% | 14 |
| mz.Cork 0.1 | 13 | 10% | 16 |
| evd.X1 0.01 | 10 | 8% | 14 |
| js.PinBall 1.6 | 8 | 6% | 18 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.0 | 158 / 210 | 2.08 | 19.9% | 29887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.9% | 158 |
| myl.nano.Graviton 1.10 | 2.8 | 11.1% | 17 |
| ntc.Opposite 1.5 | 3.3 | 10.7% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.5% | 2 |
| disan.Chair 2.2.0 | 7.3 | 8.2% | 3 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 26 / 35 | 5103 |
| 2 | 1 | 69.8 | 91.7 | 27 / 35 | 4743 |
| 3 | 1 | 69.0 | 87.3 | 27 / 35 | 4742 |
| 4 | 1 | 67.5 | 79.7 | 23 / 35 | 5150 |
| 5 | 1 | 69.9 | 90.2 | 28 / 35 | 4898 |
| 6 | 1 | 70.4 | 89.5 | 27 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 91% |
| myl.nano.Graviton 1.10 | 37 | 89% |
| DBall.NUKE 0.1 | 19 | 100% |
| ntc.Opposite 1.5 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| disan.Chair 2.2.0 | 14 | 100% |
| donjezza.Muncho 1.0 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 11 | 21% | 22 |
| stelo.AreaTargetingBot 1.1 | 10 | 19% | 44 |
| myl.nano.Graviton 1.10 | 9 | 17% | 42 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 17% | 27 |
| ntc.Opposite 1.5 | 8 | 15% | 27 |
| DBall.NUKE 0.1 | 2 | 4% | 19 |
| donjezza.Muncho 1.0 | 2 | 4% | 6 |
| disan.Chair 2.2.0 | 1 | 2% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.7 | 90 / 210 | 3.55 | 15.6% | 25534 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 15.6% | 90 |
| oog.melee.Capulet 1.2 | 2.5 | 13.9% | 47 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.3% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.4% | 20 |
| yagami.Tidus 0.11 | 4.5 | 12.1% | 8 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 8 |
| stelo.MirrorNano 1.3 | 7.0 | 8.3% | 1 |
| step.nanoPri 1.0 | 8.0 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 74.9 | 13 / 35 | 4177 |
| 2 | 1 | 62.3 | 68.3 | 13 / 35 | 4000 |
| 3 | 1 | 63.3 | 68.9 | 13 / 35 | 4071 |
| 4 | 1 | 66.2 | 77.8 | 18 / 35 | 4428 |
| 5 | 1 | 65.5 | 71.7 | 17 / 35 | 4550 |
| 6 | 1 | 63.9 | 68.6 | 16 / 35 | 4308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 52% |
| kawigi.micro.Shiz 1.1 | 29 | 97% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 88% |
| yagami.Tidus 0.11 | 17 | 94% |
| ejb.Polaris 1.0.1 | 10 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 41% | 70 |
| yagami.Tidus 0.11 | 17 | 14% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 13% | 39 |
| ejb.Polaris 1.0.1 | 14 | 12% | 25 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 29 |
| stelo.MirrorNano 1.3 | 7 | 6% | 9 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.3 | 148 / 210 | 2.60 | 18.6% | 29114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 148 |
| bzdp.Pansy 2.1 | 2.7 | 12.0% | 12 |
| wee.Gem 1.8.4 | 3.3 | 12.1% | 28 |
| wompi.Quokka 1.6 | 3.7 | 11.3% | 10 |
| ratosh.Nobo 0.21 | 4.5 | 10.5% | 3 |
| m3thos.Eva00 1.1 | 6.2 | 9.3% | 3 |
| bayen.UbaMicro 1.4 | 6.8 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.0 | 24 / 35 | 4595 |
| 2 | 1 | 69.0 | 85.1 | 28 / 35 | 5054 |
| 3 | 1 | 67.5 | 84.4 | 24 / 35 | 4762 |
| 4 | 1 | 66.0 | 77.5 | 21 / 35 | 4435 |
| 5 | 1 | 68.1 | 78.4 | 25 / 35 | 5133 |
| 6 | 1 | 69.6 | 89.2 | 26 / 35 | 5135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 100% |
| wee.Gem 1.8.4 | 43 | 88% |
| wompi.Quokka 1.6 | 26 | 100% |
| m3thos.Eva00 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| ratosh.Nobo 0.21 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 13 | 21% | 15 |
| wee.Gem 1.8.4 | 11 | 17% | 51 |
| stelo.MyAgileRobot 0.2 | 9 | 14% | 13 |
| ratosh.Nobo 0.21 | 7 | 11% | 23 |
| bayen.UbaMicro 1.4 | 7 | 11% | 10 |
| wompi.Quokka 1.6 | 5 | 8% | 25 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 8% | 7 |
| bzdp.Pansy 2.1 | 3 | 5% | 48 |
| m3thos.Eva00 1.1 | 3 | 5% | 15 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 84.7 | 80 / 210 | 2.38 | 19.7% | 44883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.6% | 116 |
| hadur117.micro.SaorC 0.1 | 1.5 | 19.7% | 80 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 11 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.3% | 1 |
| ayk.WallHugger 1.0 | 5.0 | 9.3% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 79.7 | 8 / 35 | 7060 |
| 2 | 2 | 71.0 | 85.4 | 13 / 35 | 7648 |
| 3 | 1 | 71.5 | 87.6 | 18 / 35 | 7422 |
| 4 | 1 | 71.3 | 84.1 | 15 / 35 | 8002 |
| 5 | 2 | 70.8 | 84.4 | 14 / 35 | 7180 |
| 6 | 1 | 71.5 | 86.7 | 12 / 35 | 7571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 28% |
| mz.NanoGod 2.02 | 20 | 90% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 5 | 80% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 98 | 75% | 141 |
| mz.NanoGod 2.02 | 16 | 12% | 37 |
| ayk.WallHugger 1.0 | 8 | 6% | 14 |
| exauge.GateKeeper 1.1.121g | 6 | 5% | 9 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.7 | 116 / 210 | 3.37 | 17.1% | 29551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 17.1% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.0% | 20 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 16 |
| bvh.micro.Freya 0.3 | 3.8 | 11.0% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.6% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 12 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 82.9 | 23 / 35 | 5396 |
| 2 | 1 | 66.5 | 75.9 | 19 / 35 | 4984 |
| 3 | 2 | 62.0 | 62.2 | 17 / 35 | 4300 |
| 4 | 1 | 65.5 | 73.3 | 16 / 35 | 5029 |
| 5 | 1 | 66.6 | 77.1 | 21 / 35 | 5064 |
| 6 | 1 | 64.4 | 70.5 | 20 / 35 | 4778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 98% |
| dummy.micro.Sparrow 2.5 | 28 | 86% |
| bvh.micro.Freya 0.3 | 25 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 91% |
| stelo.MirrorMicro 1.0 | 9 | 33% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 19 | 20% | 19 |
| voidious.micro.BlitzBat 1.05 | 14 | 15% | 41 |
| conscience.Electron 1.3g | 14 | 15% | 15 |
| dummy.micro.Sparrow 2.5 | 13 | 14% | 45 |
| stelo.MirrorMicro 1.0 | 10 | 11% | 16 |
| bvh.micro.Freya 0.3 | 9 | 10% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 9% | 37 |
| dl.BetterWalls 1.0 | 7 | 7% | 11 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 92.1 | 165 / 210 | 1.71 | 22.2% | 43052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.2% | 165 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 6 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.4% | 12 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 5 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.1% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 1 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.9% | 3 |
| sample.Corners 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.3 | 24 / 35 | 6459 |
| 2 | 1 | 73.3 | 92.4 | 27 / 35 | 7799 |
| 3 | 1 | 73.0 | 96.2 | 30 / 35 | 6966 |
| 4 | 1 | 71.9 | 87.6 | 27 / 35 | 7357 |
| 5 | 1 | 73.2 | 94.6 | 28 / 35 | 7301 |
| 6 | 1 | 73.3 | 94.3 | 29 / 35 | 7170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 61 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 24 | 79% |
| dsw.StaticD 1.0 | 13 | 69% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 80% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 31% | 31 |
| dsw.StaticD 1.0 | 11 | 23% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 17% | 53 |
| mme.NikeEnhanced 2.0 | 4 | 8% | 17 |
| sul.Lunar 1.1 | 3 | 6% | 54 |
| sample.Corners 1.0 | 2 | 4% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.5 | 117 / 210 | 2.84 | 18.3% | 37505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 18.3% | 117 |
| radnor.DoctorBob 1.42 | 2.2 | 13.0% | 25 |
| mld.Wisdom 1.0 | 3.8 | 11.6% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 24 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 11 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 12 |
| sample.Walls 1.0 | 7.2 | 7.6% | 5 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 0 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 68.6 | 11 / 35 | 5869 |
| 2 | 1 | 67.1 | 78.4 | 20 / 35 | 6035 |
| 3 | 1 | 69.5 | 85.7 | 23 / 35 | 6596 |
| 4 | 1 | 67.8 | 80.3 | 22 / 35 | 5942 |
| 5 | 1 | 67.8 | 77.5 | 19 / 35 | 6584 |
| 6 | 1 | 69.8 | 86.7 | 22 / 35 | 6479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 93% |
| radnor.DoctorBob 1.42 | 39 | 82% |
| mld.Wisdom 1.0 | 14 | 71% |
| amz.NanoClone 1.41 | 12 | 100% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 31% | 41 |
| radnor.DoctorBob 1.42 | 21 | 22% | 59 |
| KiraNL.Chupacabra 0.4 | 16 | 17% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 16% | 53 |
| amz.NanoClone 1.41 | 5 | 5% | 15 |
| sample.Walls 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

