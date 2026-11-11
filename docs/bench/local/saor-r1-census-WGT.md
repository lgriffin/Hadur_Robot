# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.0 | 149 / 210 | 2.17 | 21.4% | 43981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.4% | 149 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 9 |
| radnor.DoctorBob 1.42 | 2.8 | 13.5% | 19 |
| mld.Infinity 2.2 | 3.5 | 13.0% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 7 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 4 |
| GarmBox.Oranges 1.0 | 7.5 | 6.3% | 0 |
| sample.Target 1.0 | 9.3 | 3.7% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 83.5 | 25 / 35 | 7042 |
| 2 | 1 | 73.9 | 94.3 | 27 / 35 | 7614 |
| 3 | 1 | 71.1 | 81.0 | 23 / 35 | 7122 |
| 4 | 1 | 71.9 | 88.6 | 25 / 35 | 7020 |
| 5 | 1 | 72.1 | 88.6 | 24 / 35 | 7349 |
| 6 | 1 | 72.7 | 86.0 | 25 / 35 | 7834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 88 | 95% |
| mld.Infinity 2.2 | 36 | 86% |
| radnor.DoctorBob 1.42 | 23 | 78% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| arthord.MannyPacquiao Beta | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 21 | 34% | 83 |
| radnor.DoctorBob 1.42 | 18 | 29% | 52 |
| mld.Infinity 2.2 | 13 | 21% | 43 |
| amz.NanoClone 1.41 | 4 | 6% | 13 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.4 | 127 / 210 | 2.05 | 19.4% | 34243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.4% | 127 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.9% | 53 |
| mld.DustBunny 3.8 | 3.0 | 13.9% | 22 |
| maribo.melee.BMV 0.1 | 4.8 | 9.4% | 0 |
| zyx.nano.Ant 1.1 | 4.8 | 9.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.4% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 0 |
| bzdp.BoxCar 2.0 | 9.2 | 5.2% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 18 / 35 | 5109 |
| 2 | 1 | 69.8 | 91.4 | 19 / 35 | 5777 |
| 3 | 1 | 70.2 | 91.4 | 25 / 35 | 5717 |
| 4 | 1 | 71.0 | 91.4 | 22 / 35 | 6587 |
| 5 | 1 | 70.6 | 92.7 | 24 / 35 | 5779 |
| 6 | 1 | 66.4 | 77.1 | 19 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 75 | 84% |
| oog.melee.Mercutio 1.0 | 56 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 50% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 38% | 82 |
| mld.DustBunny 3.8 | 31 | 37% | 83 |
| zyx.nano.Ant 1.1 | 8 | 10% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 13 |
| fullsail.SweetTea 1.1 | 4 | 5% | 7 |
| maribo.melee.BMV 0.1 | 1 | 1% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 83.4 | 123 / 210 | 2.49 | 19.9% | 38075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.9% | 123 |
| myl.micro.Troodon 1.10 | 2.5 | 13.6% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.3% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 18 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 6 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 9 |
| cs.sheldor.Talon 1.1 | 6.0 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 5 |
| sample.Fire 1.0 | 9.2 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 83.8 | 18 / 35 | 6345 |
| 2 | 1 | 68.7 | 79.4 | 19 / 35 | 6180 |
| 3 | 1 | 71.1 | 87.6 | 22 / 35 | 6795 |
| 4 | 1 | 71.5 | 88.6 | 24 / 35 | 6264 |
| 5 | 1 | 68.4 | 77.8 | 19 / 35 | 6060 |
| 6 | 1 | 70.0 | 83.5 | 21 / 35 | 6431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 69% |
| cb.nano.Insomnia 1.0 | 21 | 90% |
| myl.nano.KomoriNinja 1.1 | 21 | 95% |
| sp.Nanos.Ember 1.1 | 15 | 93% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 26% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 22% | 33 |
| cb.nano.Insomnia 1.0 | 12 | 14% | 17 |
| myl.nano.KomoriNinja 1.1 | 10 | 11% | 37 |
| fm.mammillarias 1.3 | 9 | 10% | 20 |
| sp.Nanos.Ember 1.1 | 7 | 8% | 20 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 7 |
| sample.Tracker 1.0 | 2 | 2% | 4 |
| sample.Fire 1.0 | 1 | 1% | 4 |

## Melee bench: F04

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.9 | 146 / 210 | 2.27 | 20.6% | 40652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.6% | 146 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 14 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.2% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.7% | 14 |
| yk.JahMicro 1.0 | 6.2 | 8.2% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 8.5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.1% | 7 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 89.8 | 25 / 35 | 6972 |
| 2 | 1 | 71.3 | 89.2 | 24 / 35 | 6957 |
| 3 | 1 | 71.1 | 90.2 | 28 / 35 | 6561 |
| 4 | 1 | 69.5 | 81.9 | 22 / 35 | 6689 |
| 5 | 1 | 70.5 | 84.1 | 24 / 35 | 6855 |
| 6 | 1 | 69.5 | 80.0 | 23 / 35 | 6618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 92% |
| stelo.SoJNanoMelee 1.1 | 24 | 96% |
| yk.JahMicro 1.0 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 68% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| tj.zombie1n 1.0.1 | 16 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 36% | 85 |
| stelo.SoJNanoMelee 1.1 | 10 | 16% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 13% | 23 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 32 |
| tj.zombie1n 1.0.1 | 6 | 9% | 8 |
| yk.JahMicro 1.0 | 5 | 8% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 10 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.1 | 87 / 210 | 3.60 | 16.6% | 32305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.6% | 87 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 42 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.7% | 22 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.0% | 6 |
| sam.Samspin 1.0 | 6.5 | 9.0% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.6% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 69.8 | 12 / 35 | 5583 |
| 2 | 1 | 66.3 | 74.9 | 18 / 35 | 5590 |
| 3 | 1 | 66.2 | 75.2 | 17 / 35 | 5490 |
| 4 | 1 | 63.1 | 66.0 | 14 / 35 | 5059 |
| 5 | 1 | 65.4 | 72.7 | 15 / 35 | 5563 |
| 6 | 1 | 62.8 | 67.9 | 11 / 35 | 5020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 35 | 57% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 71% |
| sam.Samspin 1.0 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 23% | 58 |
| oog.melee.Corsair 1.0 | 23 | 19% | 41 |
| robar.nano.Assertive_Melee 0.2 | 22 | 18% | 27 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| ahf.NanoAndrew .4 | 11 | 9% | 29 |
| EBBU.Sim2 1.02 | 10 | 8% | 18 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 11 |
| sam.Samspin 1.0 | 6 | 5% | 9 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.2 | 136 / 210 | 2.15 | 19.6% | 33573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 19.6% | 136 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 26 |
| gh.nano.Grofvuil 0.2 | 3.3 | 12.0% | 13 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.6% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 10 |
| fm.claire 1.7 | 6.0 | 8.5% | 0 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 7 |
| sample.SpinBot 1.0 | 8.5 | 6.2% | 3 |
| pa.Improved 1.0 | 8.7 | 5.8% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 26 / 35 | 5414 |
| 2 | 1 | 70.3 | 90.5 | 26 / 35 | 5667 |
| 3 | 1 | 68.7 | 85.7 | 19 / 35 | 5608 |
| 4 | 1 | 68.5 | 86.3 | 20 / 35 | 5381 |
| 5 | 1 | 69.5 | 89.8 | 23 / 35 | 5321 |
| 6 | 1 | 68.7 | 79.7 | 22 / 35 | 6182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 89% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| gh.nano.Grofvuil 0.2 | 18 | 83% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 32% | 78 |
| gh.nano.Grofvuil 0.2 | 17 | 23% | 35 |
| oog.melee.CapuletDroid 1.1 | 11 | 15% | 51 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 17 |
| fm.claire 1.7 | 7 | 9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 11 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| sample.SpinBot 1.0 | 2 | 3% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.6 | 98 / 210 | 2.83 | 18.2% | 35794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.2% | 98 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 27 |
| mz.MicroGodMelee 1 | 3.3 | 13.5% | 34 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 6 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.5% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.5% | 1 |
| acogdev.alpha 0.2 | 8.2 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 13 / 35 | 5991 |
| 2 | 1 | 65.1 | 70.2 | 12 / 35 | 5733 |
| 3 | 1 | 70.1 | 86.0 | 22 / 35 | 6356 |
| 4 | 1 | 68.4 | 81.9 | 22 / 35 | 5711 |
| 5 | 1 | 67.9 | 78.1 | 14 / 35 | 6588 |
| 6 | 1 | 67.0 | 76.8 | 15 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 80% |
| mz.MicroGodMelee 1 | 46 | 61% |
| gh.micro.Gruweltje 0.7 | 26 | 69% |
| el.JumpShoot 0.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 34% | 68 |
| gh.micro.Gruweltje 0.7 | 26 | 23% | 45 |
| spinnercat.micro.Tyger 0.1 | 17 | 15% | 53 |
| acogdev.alpha 0.2 | 11 | 10% | 12 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 10 |
| fire219.CatBot 1.0 | 5 | 4% | 5 |
| DBall.Anarchy 0.1 | 4 | 4% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 73.4 | 111 / 210 | 3.40 | 17.4% | 32952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.2 | 17.4% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.5% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 30 |
| germ.TheMind .2 | 4.5 | 9.7% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.6% | 9 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 9 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.0% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.8% | 1 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 67.3 | 16 / 35 | 5021 |
| 2 | 1 | 67.0 | 74.0 | 18 / 35 | 5919 |
| 3 | 1 | 65.5 | 71.4 | 19 / 35 | 5338 |
| 4 | 1 | 65.0 | 71.1 | 18 / 35 | 5209 |
| 5 | 1 | 68.3 | 80.3 | 19 / 35 | 5781 |
| 6 | 1 | 67.5 | 76.2 | 21 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 75% |
| awesomeness.Elite 1.0 | 12 | 83% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 35% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 21% | 38 |
| awesomeness.Elite 1.0 | 12 | 12% | 20 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 16 |
| germ.TheMind .2 | 9 | 9% | 19 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.7 | 160 / 210 | 1.93 | 20.9% | 34276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 20.9% | 160 |
| rz.HawkOnFire 0.1 | 2.2 | 14.3% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 12 |
| maribo.IotaCT 1.1 | 4.5 | 10.0% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.3% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 8.3% | 3 |
| stelo.PatternRobot 1.0 | 7.0 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 9.0 | 6.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 80.6 | 23 / 35 | 4937 |
| 2 | 1 | 72.3 | 92.7 | 25 / 35 | 5847 |
| 3 | 1 | 72.5 | 93.3 | 30 / 35 | 5858 |
| 4 | 1 | 72.8 | 94.3 | 29 / 35 | 6140 |
| 5 | 1 | 71.8 | 90.2 | 27 / 35 | 5728 |
| 6 | 1 | 71.1 | 87.0 | 26 / 35 | 5766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 98% |
| nz.jdc.nano.GridFu 1.0 | 41 | 100% |
| stelo.PatternRobot 1.0 | 14 | 86% |
| timmit.nano.TimDog 0.33 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 71% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 29% | 86 |
| timmit.nano.TimDog 0.33 | 14 | 27% | 24 |
| stelo.PatternRobot 1.0 | 7 | 14% | 16 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 7 |
| maribo.IotaCT 1.1 | 2 | 4% | 11 |
| ratosh.Wesco 1.4 | 2 | 4% | 10 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |

## Melee bench: F10

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.1 | 166 / 210 | 1.62 | 22.2% | 42576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.2% | 166 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.5% | 10 |
| baal.nano.N 1.42 | 3.2 | 11.8% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 2 |
| zyx.micro.Ant 1.1 | 5.2 | 9.6% | 13 |
| sanja.First 0.1 | 5.8 | 8.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 0 |
| cvt.Firsty 1.0 | 7.3 | 7.4% | 7 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 96.5 | 31 / 35 | 7419 |
| 2 | 1 | 72.4 | 96.2 | 27 / 35 | 6834 |
| 3 | 1 | 71.3 | 87.9 | 26 / 35 | 7023 |
| 4 | 1 | 72.3 | 94.6 | 26 / 35 | 7074 |
| 5 | 1 | 72.0 | 90.5 | 29 / 35 | 6919 |
| 6 | 1 | 72.6 | 92.7 | 27 / 35 | 7307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 48 | 92% |
| tvv.nano.Polaris 1.2 | 40 | 88% |
| cvt.Firsty 1.0 | 24 | 83% |
| zyx.micro.Ant 1.1 | 21 | 81% |
| sanja.First 0.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 27% | 36 |
| baal.nano.N 1.42 | 9 | 20% | 47 |
| tvv.nano.Polaris 1.2 | 8 | 18% | 58 |
| Grystrion.TrackerWO 1.0 | 5 | 11% | 19 |
| cvt.Firsty 1.0 | 4 | 9% | 18 |
| sanja.First 0.1 | 2 | 5% | 18 |
| amk.Punbot.Punbot 0.01 | 2 | 5% | 6 |
| sample.RamFire 1.0 | 2 | 5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.3 | 91 / 210 | 3.50 | 16.7% | 34415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.7% | 91 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 61 |
| cs.Wren 1.0 | 3.7 | 12.1% | 24 |
| js.PinBall 1.6 | 4.0 | 11.6% | 14 |
| mz.Cork 0.1 | 4.3 | 11.3% | 11 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 1 |
| evd.X1 0.01 | 7.0 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 7.8 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.1% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.4 | 16 / 35 | 5899 |
| 2 | 1 | 67.2 | 78.1 | 16 / 35 | 6167 |
| 3 | 1 | 61.8 | 62.9 | 11 / 35 | 5374 |
| 4 | 1 | 64.8 | 69.5 | 16 / 35 | 5582 |
| 5 | 1 | 65.9 | 73.7 | 18 / 35 | 5439 |
| 6 | 1 | 65.3 | 71.1 | 14 / 35 | 5954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 65 | 65% |
| cs.Wren 1.0 | 22 | 91% |
| js.PinBall 1.6 | 12 | 83% |
| mz.Cork 0.1 | 11 | 91% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 49% | 105 |
| evd.X1 0.01 | 18 | 15% | 20 |
| joe.ADinosaur 1.0 | 12 | 10% | 15 |
| cs.Wren 1.0 | 9 | 8% | 22 |
| js.PinBall 1.6 | 9 | 8% | 19 |
| mz.Cork 0.1 | 9 | 8% | 18 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| PSW.Relentless 0.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.8 | 123 / 210 | 2.55 | 18.7% | 30034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.7% | 123 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 22 |
| ntc.Opposite 1.5 | 3.2 | 11.8% | 9 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.3% | 21 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.7% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.8% | 5 |
| disan.Chair 2.2.0 | 6.7 | 8.6% | 12 |
| DBall.NUKE 0.1 | 7.8 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.8 | 18 / 35 | 4763 |
| 2 | 1 | 69.3 | 85.1 | 23 / 35 | 5244 |
| 3 | 1 | 68.9 | 84.4 | 22 / 35 | 5551 |
| 4 | 1 | 67.1 | 82.5 | 18 / 35 | 4476 |
| 5 | 1 | 70.2 | 90.5 | 23 / 35 | 5112 |
| 6 | 1 | 66.4 | 76.2 | 19 / 35 | 4888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 78% |
| myl.nano.Graviton 1.10 | 27 | 93% |
| ntc.Opposite 1.5 | 25 | 88% |
| disan.Chair 2.2.0 | 17 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| donjezza.Muncho 1.0 | 10 | 70% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| DBall.NUKE 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 21 | 24% | 55 |
| myl.nano.Graviton 1.10 | 13 | 15% | 34 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 28 |
| disan.Chair 2.2.0 | 11 | 13% | 17 |
| ntc.Opposite 1.5 | 9 | 10% | 20 |
| donjezza.Muncho 1.0 | 8 | 9% | 15 |
| pbg.R2D2 1.0 | 2 | 2% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.8 | 85 / 210 | 3.18 | 16.5% | 28682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.5% | 85 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 45 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.2% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 24 |
| yagami.Tidus 0.11 | 4.5 | 12.0% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 7.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 69.2 | 12 / 35 | 4631 |
| 2 | 1 | 66.0 | 79.4 | 14 / 35 | 4474 |
| 3 | 1 | 67.1 | 78.4 | 17 / 35 | 4914 |
| 4 | 1 | 67.0 | 79.0 | 13 / 35 | 5162 |
| 5 | 1 | 63.3 | 70.5 | 12 / 35 | 4272 |
| 6 | 1 | 67.5 | 78.1 | 17 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| oog.melee.Capulet 1.2 | 26 | 50% |
| yagami.Tidus 0.11 | 19 | 79% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 63 | 50% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 43 |
| yagami.Tidus 0.11 | 18 | 14% | 32 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 29 |
| ejb.Polaris 1.0.1 | 10 | 8% | 18 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| step.nanoPri 1.0 | 0 | 0% | 1 |

## Melee bench: F14

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.5 | 127 / 210 | 2.93 | 17.4% | 28053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 17.4% | 127 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 14 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 24 |
| ratosh.Nobo 0.21 | 4.3 | 11.2% | 13 |
| wompi.Quokka 1.6 | 4.3 | 11.0% | 19 |
| m3thos.Eva00 1.1 | 5.7 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.7 | 6.6% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 76.2 | 19 / 35 | 5185 |
| 2 | 1 | 66.1 | 80.6 | 21 / 35 | 4188 |
| 3 | 1 | 64.2 | 73.3 | 17 / 35 | 4441 |
| 4 | 1 | 68.7 | 88.3 | 27 / 35 | 4756 |
| 5 | 1 | 66.1 | 77.1 | 22 / 35 | 4743 |
| 6 | 1 | 65.6 | 75.6 | 21 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 90% |
| wee.Gem 1.8.4 | 35 | 97% |
| wompi.Quokka 1.6 | 19 | 74% |
| ratosh.Nobo 0.21 | 15 | 87% |
| bayen.UbaMicro 1.4 | 13 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 0% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 15% | 55 |
| ratosh.Nobo 0.21 | 13 | 15% | 26 |
| wee.Gem 1.8.4 | 11 | 13% | 53 |
| wompi.Quokka 1.6 | 10 | 12% | 19 |
| maribo.FollowFire 1 | 10 | 12% | 9 |
| m3thos.Eva00 1.1 | 9 | 10% | 15 |
| bayen.UbaMicro 1.4 | 9 | 10% | 15 |
| stelo.MyAgileRobot 0.2 | 9 | 10% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 5 |

## Melee bench: F15

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 89.5 | 138 / 210 | 1.94 | 22.3% | 50662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 22.3% | 138 |
| wompi.Wallaby 5.1 | 2.0 | 17.1% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 14 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.9% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 9.3% | 0 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 88.9 | 20 / 35 | 7533 |
| 2 | 1 | 73.3 | 87.9 | 25 / 35 | 7874 |
| 3 | 1 | 73.9 | 88.9 | 21 / 35 | 9000 |
| 4 | 1 | 74.3 | 90.5 | 25 / 35 | 8871 |
| 5 | 1 | 73.9 | 89.2 | 23 / 35 | 8880 |
| 6 | 1 | 74.3 | 91.7 | 24 / 35 | 8504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 82% |
| exauge.GateKeeper 1.1.121g | 22 | 91% |
| mz.NanoGod 2.02 | 18 | 67% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 41% | 129 |
| mz.NanoGod 2.02 | 26 | 36% | 39 |
| exauge.GateKeeper 1.1.121g | 8 | 11% | 13 |
| ayk.WallHugger 1.0 | 3 | 4% | 13 |
| stuff.Vlad 0.1 | 3 | 4% | 8 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.0 | 108 / 210 | 3.43 | 16.6% | 28806 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 16.6% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 25 |
| bvh.micro.Freya 0.3 | 3.3 | 11.7% | 19 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.8% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.2% | 19 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.5% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 67.6 | 14 / 35 | 4395 |
| 2 | 1 | 64.8 | 72.7 | 18 / 35 | 4890 |
| 3 | 1 | 66.4 | 77.1 | 18 / 35 | 5184 |
| 4 | 1 | 62.1 | 64.4 | 15 / 35 | 4581 |
| 5 | 1 | 65.6 | 74.3 | 20 / 35 | 4819 |
| 6 | 1 | 67.5 | 81.6 | 23 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 91% |
| dummy.micro.Sparrow 2.5 | 29 | 93% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 60% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 22% | 66 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 15 |
| conscience.Electron 1.3g | 14 | 14% | 17 |
| bvh.micro.Freya 0.3 | 11 | 11% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 11% | 21 |
| stelo.MirrorMicro 1.0 | 9 | 9% | 16 |
| dl.BetterWalls 1.0 | 4 | 4% | 5 |

## Melee bench: F17

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 153 / 210 | 2.10 | 21.9% | 45122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 21.9% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.1% | 15 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.6% | 9 |
| dsw.StaticD 1.0 | 5.5 | 8.8% | 7 |
| mme.NikeEnhanced 2.0 | 5.7 | 9.0% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.9% | 3 |
| sample.Corners 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 85.7 | 23 / 35 | 7159 |
| 2 | 1 | 72.2 | 88.3 | 26 / 35 | 7584 |
| 3 | 1 | 73.7 | 89.8 | 27 / 35 | 8263 |
| 4 | 1 | 71.5 | 84.4 | 22 / 35 | 7298 |
| 5 | 1 | 72.9 | 92.4 | 28 / 35 | 7557 |
| 6 | 1 | 71.9 | 86.0 | 27 / 35 | 7261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 85% |
| supersample.SuperBoxBot 1.0 | 36 | 89% |
| dsw.StaticD 1.0 | 11 | 73% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 86% |
| sample.MyFirstRobot 1.0 | 6 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 29% | 58 |
| supersample.SuperBoxBot 1.0 | 17 | 29% | 39 |
| dsw.StaticD 1.0 | 6 | 10% | 16 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 10 |
| sul.Lunar 1.1 | 5 | 9% | 63 |
| sample.Corners 1.0 | 3 | 5% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F18

hadur117.micro.SaorWGT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 81.9 | 109 / 210 | 2.63 | 18.9% | 38419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGT 0.1 | 1.0 | 18.9% | 109 |
| mld.Wisdom 1.0 | 2.5 | 13.2% | 29 |
| radnor.DoctorBob 1.42 | 2.7 | 12.9% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 12.0% | 24 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.9% | 6 |
| amz.NanoClone 1.41 | 5.5 | 9.5% | 8 |
| sample.Walls 1.0 | 7.3 | 7.0% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 75.2 | 17 / 35 | 6157 |
| 2 | 1 | 69.1 | 83.8 | 17 / 35 | 6631 |
| 3 | 1 | 68.1 | 80.6 | 18 / 35 | 6259 |
| 4 | 1 | 69.2 | 84.8 | 20 / 35 | 6504 |
| 5 | 1 | 69.0 | 83.8 | 18 / 35 | 6359 |
| 6 | 1 | 69.0 | 83.2 | 19 / 35 | 6509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 88% |
| radnor.DoctorBob 1.42 | 29 | 66% |
| mld.Wisdom 1.0 | 24 | 58% |
| KiraNL.Chupacabra 0.4 | 12 | 100% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 29% | 47 |
| radnor.DoctorBob 1.42 | 26 | 26% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 51 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 24 |
| amz.NanoClone 1.41 | 6 | 6% | 15 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |

