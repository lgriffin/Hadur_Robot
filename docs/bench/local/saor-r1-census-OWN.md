# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 89.2 | 144 / 210 | 1.98 | 20.9% | 41373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 20.9% | 144 |
| mz.AntiGrav 1.0 | 2.3 | 14.6% | 24 |
| radnor.DoctorBob 1.42 | 2.7 | 14.4% | 23 |
| mld.Infinity 2.2 | 4.0 | 12.8% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| sample.Walls 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 86.7 | 24 / 35 | 6630 |
| 2 | 1 | 70.7 | 84.8 | 21 / 35 | 6721 |
| 3 | 1 | 72.6 | 92.7 | 27 / 35 | 6964 |
| 4 | 1 | 72.0 | 90.5 | 24 / 35 | 6771 |
| 5 | 1 | 72.1 | 91.4 | 25 / 35 | 6771 |
| 6 | 1 | 72.4 | 88.9 | 23 / 35 | 7516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 93% |
| radnor.DoctorBob 1.42 | 42 | 79% |
| mld.Infinity 2.2 | 37 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 48% | 72 |
| mz.AntiGrav 1.0 | 14 | 21% | 70 |
| amz.NanoClone 1.41 | 9 | 14% | 17 |
| mld.Infinity 2.2 | 7 | 11% | 36 |
| GarmBox.Oranges 1.0 | 3 | 5% | 5 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.9 | 114 / 210 | 2.45 | 18.3% | 31292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 18.3% | 114 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 62 |
| mld.DustBunny 3.8 | 2.8 | 14.3% | 21 |
| maribo.melee.BMV 0.1 | 4.7 | 9.8% | 0 |
| zyx.nano.Ant 1.1 | 6.0 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.2% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 3 |
| bzdp.BoxCar 2.0 | 7.5 | 6.9% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.3 | 14 / 35 | 4795 |
| 2 | 1 | 68.8 | 87.6 | 23 / 35 | 5437 |
| 3 | 1 | 68.5 | 85.4 | 23 / 35 | 5510 |
| 4 | 1 | 68.7 | 87.9 | 22 / 35 | 4948 |
| 5 | 1 | 67.4 | 84.4 | 17 / 35 | 4973 |
| 6 | 1 | 65.9 | 71.4 | 15 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 81% |
| oog.melee.Mercutio 1.0 | 57 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 41% | 78 |
| mld.DustBunny 3.8 | 31 | 32% | 78 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 11 |
| maribo.melee.BMV 0.1 | 5 | 5% | 9 |
| cs.Grudge 1.0 | 5 | 5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 2% | 11 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.5 | 132 / 210 | 2.30 | 19.9% | 37020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 19.9% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.2% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.5% | 23 |
| cs.sheldor.Talon 1.1 | 5.7 | 8.6% | 0 |
| fm.mammillarias 1.3 | 5.8 | 9.0% | 1 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.4% | 4 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.1% | 1 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.0 | 23 / 35 | 6412 |
| 2 | 1 | 70.2 | 87.6 | 20 / 35 | 6268 |
| 3 | 1 | 71.2 | 90.5 | 27 / 35 | 6269 |
| 4 | 1 | 68.7 | 79.7 | 20 / 35 | 6113 |
| 5 | 1 | 70.1 | 85.4 | 22 / 35 | 6047 |
| 6 | 1 | 69.1 | 82.9 | 20 / 35 | 5911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 73% |
| myl.nano.KomoriNinja 1.1 | 26 | 96% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| fm.mammillarias 1.3 | 8 | 88% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 27% | 42 |
| myl.micro.Troodon 1.10 | 20 | 26% | 71 |
| fm.mammillarias 1.3 | 16 | 21% | 21 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 39 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 8 |
| cb.nano.Insomnia 1.0 | 3 | 4% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 12 |
| sample.Tracker 1.0 | 2 | 3% | 2 |
| sample.Fire 1.0 | 1 | 1% | 9 |

## Melee bench: F04

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 85.9 | 144 / 210 | 2.27 | 20.1% | 38281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 20.1% | 144 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.9% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 9.9% | 19 |
| tj.zombie1n 1.0.1 | 5.2 | 9.2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.6% | 2 |
| yk.JahMicro 1.0 | 7.7 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 8.2 | 7.0% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.9 | 24 / 35 | 6287 |
| 2 | 1 | 70.2 | 88.3 | 23 / 35 | 6174 |
| 3 | 1 | 70.8 | 90.2 | 27 / 35 | 6141 |
| 4 | 1 | 70.2 | 86.7 | 22 / 35 | 6805 |
| 5 | 1 | 70.2 | 87.0 | 26 / 35 | 6374 |
| 6 | 1 | 69.0 | 81.6 | 22 / 35 | 6500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 91% |
| stelo.SoJNanoMelee 1.1 | 42 | 86% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| tj.zombie1n 1.0.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 93% |
| yk.JahMicro 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 30% | 78 |
| stelo.SoJNanoMelee 1.1 | 15 | 23% | 34 |
| tj.zombie1n 1.0.1 | 11 | 17% | 14 |
| tvv.micro.Antares 1.1.1 | 9 | 14% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 11 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| repositorio.NanoStep 1.0 | 1 | 2% | 14 |

## Melee bench: F05

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.1 | 81 / 210 | 3.42 | 16.2% | 30340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 16.2% | 81 |
| oog.melee.Corsair 1.0 | 2.2 | 13.0% | 40 |
| ahf.NanoAndrew .4 | 3.0 | 12.2% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 26 |
| EBBU.Sim2 1.02 | 5.5 | 9.7% | 3 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.1% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 3 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.6 | 15 / 35 | 5089 |
| 2 | 1 | 66.6 | 78.7 | 15 / 35 | 5747 |
| 3 | 1 | 63.5 | 70.2 | 14 / 35 | 5027 |
| 4 | 1 | 61.8 | 67.3 | 11 / 35 | 4610 |
| 5 | 1 | 64.4 | 73.0 | 15 / 35 | 5046 |
| 6 | 1 | 62.8 | 68.9 | 11 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 58% |
| simonton.nano.MeleeSeed 1.8 | 25 | 96% |
| ahf.NanoAndrew .4 | 24 | 58% |
| sam.Samspin 1.0 | 10 | 90% |
| EBBU.Sim2 1.02 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 27 | 21% | 44 |
| oog.melee.Corsair 1.0 | 25 | 19% | 43 |
| robar.nano.Assertive_Melee 0.2 | 21 | 16% | 26 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 31 |
| EBBU.Sim2 1.02 | 14 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 16 |
| sam.Samspin 1.0 | 8 | 6% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 8 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.7 | 122 / 210 | 2.47 | 18.6% | 32266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 18.6% | 122 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.6% | 40 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 19 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.6% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.3% | 10 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 7.9% | 2 |
| pa.Improved 1.0 | 8.3 | 6.5% | 3 |
| sample.SpinBot 1.0 | 8.8 | 6.3% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 26 / 35 | 5819 |
| 2 | 1 | 65.3 | 74.3 | 18 / 35 | 5077 |
| 3 | 1 | 65.4 | 77.5 | 13 / 35 | 5192 |
| 4 | 1 | 69.1 | 88.9 | 22 / 35 | 5308 |
| 5 | 1 | 66.3 | 77.8 | 18 / 35 | 5008 |
| 6 | 1 | 70.7 | 92.4 | 25 / 35 | 5862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 84% |
| oog.melee.CapuletDroid 1.1 | 25 | 96% |
| gh.nano.Grofvuil 0.2 | 14 | 71% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| arthord.NanoSatanMelee Beta | 6 | 83% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 43% | 92 |
| gh.nano.Grofvuil 0.2 | 18 | 20% | 34 |
| arthord.NanoSatanMelee Beta | 8 | 9% | 12 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 37 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 12 |
| fm.claire 1.7 | 4 | 5% | 8 |
| sample.SpinBot 1.0 | 4 | 5% | 5 |
| pa.Improved 1.0 | 3 | 3% | 5 |
| kurios.DOSexe .9b | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.2 | 98 / 210 | 2.60 | 18.0% | 33709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 18.0% | 98 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 15.3% | 42 |
| gh.micro.Gruweltje 0.7 | 2.7 | 15.0% | 39 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 22 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.2 | 5.9% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 18 / 35 | 6049 |
| 2 | 1 | 68.6 | 86.0 | 17 / 35 | 5436 |
| 3 | 1 | 64.3 | 73.3 | 12 / 35 | 5151 |
| 4 | 1 | 69.5 | 86.7 | 19 / 35 | 6058 |
| 5 | 1 | 67.3 | 81.0 | 16 / 35 | 5543 |
| 6 | 1 | 66.6 | 78.4 | 16 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 63 | 83% |
| gh.micro.Gruweltje 0.7 | 27 | 59% |
| mz.MicroGodMelee 1 | 27 | 63% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 35 | 31% | 77 |
| gh.micro.Gruweltje 0.7 | 34 | 30% | 56 |
| mz.MicroGodMelee 1 | 22 | 20% | 43 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 13 |
| acogdev.alpha 0.2 | 8 | 7% | 9 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.7 | 104 / 210 | 3.64 | 16.2% | 30884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.3 | 16.2% | 104 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.7% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.4% | 29 |
| germ.TheMind .2 | 4.7 | 9.5% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.2% | 5 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 7 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.1% | 4 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 73.0 | 20 / 35 | 5025 |
| 2 | 1 | 65.0 | 72.4 | 17 / 35 | 5405 |
| 3 | 2 | 63.0 | 65.1 | 15 / 35 | 5171 |
| 4 | 1 | 66.7 | 75.9 | 20 / 35 | 5509 |
| 5 | 1 | 64.2 | 70.5 | 20 / 35 | 4776 |
| 6 | 1 | 62.7 | 67.3 | 12 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| germ.TheMind .2 | 7 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 48% | 115 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 30 |
| germ.TheMind .2 | 14 | 13% | 20 |
| stelo.UntouchableNano 1.3 | 13 | 12% | 17 |
| awesomeness.Elite 1.0 | 3 | 3% | 12 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.7 | 118 / 210 | 2.56 | 18.3% | 29024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 18.3% | 118 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 12.2% | 21 |
| timmit.nano.TimDog 0.33 | 4.3 | 10.3% | 15 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.5% | 4 |
| ratosh.Wesco 1.4 | 7.2 | 8.6% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 7.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.8 | 22 / 35 | 4628 |
| 2 | 1 | 67.8 | 80.6 | 18 / 35 | 4813 |
| 3 | 1 | 69.8 | 87.3 | 25 / 35 | 5287 |
| 4 | 1 | 69.3 | 85.7 | 20 / 35 | 5304 |
| 5 | 1 | 64.2 | 72.7 | 14 / 35 | 4287 |
| 6 | 1 | 68.6 | 86.0 | 19 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 88% |
| nz.jdc.nano.GridFu 1.0 | 23 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 60% |
| stelo.PatternRobot 1.0 | 14 | 93% |
| maribo.IotaCT 1.1 | 10 | 70% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 23 | 24% | 31 |
| rz.HawkOnFire 0.1 | 22 | 23% | 74 |
| nz.jdc.nano.GridFu 1.0 | 12 | 13% | 36 |
| ratosh.Wesco 1.4 | 11 | 12% | 20 |
| stelo.PatternRobot 1.0 | 8 | 9% | 18 |
| maribo.IotaCT 1.1 | 8 | 9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 9% | 13 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.2 | 165 / 210 | 1.79 | 21.1% | 38393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 21.1% | 165 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.3% | 18 |
| baal.nano.N 1.42 | 2.8 | 11.9% | 8 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 3 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 8 |
| sanja.First 0.1 | 5.7 | 8.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.5% | 2 |
| cvt.Firsty 1.0 | 7.8 | 7.4% | 4 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.6 | 26 / 35 | 6062 |
| 2 | 1 | 71.6 | 92.7 | 29 / 35 | 6428 |
| 3 | 1 | 72.1 | 95.2 | 30 / 35 | 6647 |
| 4 | 1 | 70.6 | 88.9 | 26 / 35 | 6370 |
| 5 | 1 | 70.4 | 87.9 | 26 / 35 | 6445 |
| 6 | 1 | 71.3 | 94.0 | 28 / 35 | 6441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 50 | 96% |
| baal.nano.N 1.42 | 44 | 93% |
| cvt.Firsty 1.0 | 23 | 96% |
| sanja.First 0.1 | 19 | 95% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| amk.Punbot.Punbot 0.01 | 7 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 33% | 35 |
| tvv.nano.Polaris 1.2 | 7 | 15% | 63 |
| Grystrion.TrackerWO 1.0 | 6 | 13% | 20 |
| sanja.First 0.1 | 5 | 11% | 23 |
| amk.Punbot.Punbot 0.01 | 5 | 11% | 9 |
| baal.nano.N 1.42 | 4 | 9% | 32 |
| cvt.Firsty 1.0 | 2 | 4% | 21 |
| sample.RamFire 1.0 | 2 | 4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.8 | 91 / 210 | 3.72 | 15.6% | 30542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 65 |
| hadur117.micro.SaorOWN 0.1 | 1.7 | 15.6% | 91 |
| cs.Wren 1.0 | 3.2 | 12.3% | 16 |
| js.PinBall 1.6 | 4.2 | 11.4% | 17 |
| mz.Cork 0.1 | 4.7 | 11.0% | 7 |
| joe.ADinosaur 1.0 | 6.0 | 8.9% | 3 |
| evd.X1 0.01 | 7.0 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 65.7 | 15 / 35 | 4895 |
| 2 | 1 | 67.0 | 78.1 | 20 / 35 | 5840 |
| 3 | 2 | 62.9 | 67.6 | 12 / 35 | 5210 |
| 4 | 2 | 65.2 | 75.6 | 17 / 35 | 5079 |
| 5 | 1 | 62.4 | 66.0 | 17 / 35 | 4882 |
| 6 | 2 | 61.3 | 65.7 | 10 / 35 | 4636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 68% |
| cs.Wren 1.0 | 22 | 91% |
| mz.Cork 0.1 | 12 | 100% |
| js.PinBall 1.6 | 11 | 64% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 50% | 110 |
| cs.Wren 1.0 | 12 | 10% | 26 |
| evd.X1 0.01 | 12 | 10% | 14 |
| js.PinBall 1.6 | 11 | 9% | 20 |
| joe.ADinosaur 1.0 | 9 | 8% | 10 |
| mz.Cork 0.1 | 6 | 5% | 15 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.5 | 117 / 210 | 2.76 | 18.1% | 30178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 18.1% | 117 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 28 |
| ntc.Opposite 1.5 | 3.5 | 11.1% | 16 |
| pfvicm.Sobieski 7.2.3b | 3.5 | 11.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.9% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.8% | 2 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 5 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 23 / 35 | 5013 |
| 2 | 1 | 66.6 | 80.0 | 17 / 35 | 4947 |
| 3 | 1 | 65.1 | 71.7 | 16 / 35 | 5391 |
| 4 | 1 | 66.5 | 80.0 | 16 / 35 | 4835 |
| 5 | 1 | 69.2 | 87.3 | 24 / 35 | 5151 |
| 6 | 1 | 66.5 | 78.4 | 21 / 35 | 4841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 84% |
| ntc.Opposite 1.5 | 19 | 74% |
| pfvicm.Sobieski 7.2.3b | 18 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 94% |
| stelo.AreaTargetingBot 1.1 | 16 | 81% |
| disan.Chair 2.2.0 | 13 | 85% |
| DBall.NUKE 0.1 | 10 | 90% |
| donjezza.Muncho 1.0 | 5 | 80% |

Hadur died in 94 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 22 | 23% | 56 |
| pfvicm.Sobieski 7.2.3b | 18 | 19% | 29 |
| ntc.Opposite 1.5 | 14 | 15% | 26 |
| disan.Chair 2.2.0 | 12 | 13% | 29 |
| stelo.AreaTargetingBot 1.1 | 9 | 10% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 21 |
| pbg.R2D2 1.0 | 5 | 5% | 8 |
| donjezza.Muncho 1.0 | 4 | 4% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.1 | 84 / 210 | 3.70 | 15.5% | 27214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 15.5% | 84 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 33 |
| oog.melee.Capulet 1.2 | 3.3 | 13.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 29 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.8% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.7 | 11 / 35 | 4499 |
| 2 | 1 | 64.0 | 69.8 | 13 / 35 | 4434 |
| 3 | 1 | 64.2 | 71.7 | 15 / 35 | 4336 |
| 4 | 1 | 62.9 | 66.0 | 11 / 35 | 4415 |
| 5 | 1 | 67.4 | 78.7 | 20 / 35 | 4940 |
| 6 | 1 | 63.7 | 68.3 | 14 / 35 | 4590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 78% |
| kawigi.micro.Shiz 1.1 | 25 | 100% |
| yagami.Tidus 0.11 | 22 | 95% |
| oog.melee.Capulet 1.2 | 17 | 65% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 44% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 44 |
| yagami.Tidus 0.11 | 14 | 11% | 36 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 30 |
| ejb.Polaris 1.0.1 | 10 | 8% | 20 |
| step.nanoPri 1.0 | 10 | 8% | 11 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.6 | 120 / 210 | 2.92 | 17.1% | 27248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 17.1% | 120 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 21 |
| wee.Gem 1.8.4 | 2.8 | 12.2% | 29 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 18 |
| wompi.Quokka 1.6 | 4.8 | 10.8% | 7 |
| bayen.UbaMicro 1.4 | 6.2 | 9.7% | 8 |
| m3thos.Eva00 1.1 | 6.8 | 9.3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 21 / 35 | 5061 |
| 2 | 1 | 64.1 | 73.0 | 16 / 35 | 4511 |
| 3 | 1 | 63.9 | 71.7 | 20 / 35 | 4538 |
| 4 | 1 | 65.1 | 76.8 | 21 / 35 | 4256 |
| 5 | 1 | 65.2 | 79.7 | 18 / 35 | 4156 |
| 6 | 1 | 68.1 | 85.4 | 24 / 35 | 4726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 93% |
| wee.Gem 1.8.4 | 32 | 97% |
| wompi.Quokka 1.6 | 16 | 94% |
| ratosh.Nobo 0.21 | 14 | 64% |
| bayen.UbaMicro 1.4 | 11 | 73% |
| m3thos.Eva00 1.1 | 9 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 18 | 20% | 58 |
| ratosh.Nobo 0.21 | 16 | 18% | 25 |
| bayen.UbaMicro 1.4 | 11 | 12% | 17 |
| bzdp.Pansy 2.1 | 10 | 11% | 47 |
| m3thos.Eva00 1.1 | 9 | 10% | 18 |
| wompi.Quokka 1.6 | 8 | 9% | 23 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 11 |
| maribo.FollowFire 1 | 5 | 6% | 6 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 5 |

## Melee bench: F15

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.5 | 129 / 210 | 2.12 | 20.8% | 44582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 20.8% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 55 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 14 |
| exauge.GateKeeper 1.1.121g | 4.5 | 10.1% | 8 |
| ayk.WallHugger 1.0 | 4.7 | 9.9% | 3 |
| stuff.Vlad 0.1 | 5.8 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 91.7 | 24 / 35 | 7352 |
| 2 | 1 | 70.2 | 80.3 | 18 / 35 | 7067 |
| 3 | 1 | 73.3 | 91.4 | 22 / 35 | 7953 |
| 4 | 1 | 71.1 | 85.1 | 16 / 35 | 7564 |
| 5 | 1 | 73.4 | 92.1 | 26 / 35 | 7573 |
| 6 | 1 | 71.1 | 84.4 | 23 / 35 | 7073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 124 | 78% |
| exauge.GateKeeper 1.1.121g | 19 | 79% |
| mz.NanoGod 2.02 | 14 | 71% |
| ayk.WallHugger 1.0 | 4 | 50% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 48% | 138 |
| mz.NanoGod 2.02 | 22 | 27% | 38 |
| exauge.GateKeeper 1.1.121g | 13 | 16% | 18 |
| ayk.WallHugger 1.0 | 5 | 6% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.8 | 109 / 210 | 3.09 | 17.1% | 29271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 17.1% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.4% | 30 |
| bvh.micro.Freya 0.3 | 3.8 | 11.7% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.5% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 17 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.9% | 5 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 6 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.5 | 16 / 35 | 5068 |
| 2 | 1 | 66.4 | 78.7 | 21 / 35 | 4619 |
| 3 | 1 | 64.1 | 72.1 | 17 / 35 | 4844 |
| 4 | 1 | 65.1 | 76.2 | 17 / 35 | 4816 |
| 5 | 1 | 66.4 | 79.0 | 20 / 35 | 4928 |
| 6 | 1 | 66.3 | 78.4 | 18 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 85% |
| dummy.micro.Sparrow 2.5 | 25 | 88% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 75% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 493. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 27% | 70 |
| dummy.micro.Sparrow 2.5 | 14 | 14% | 33 |
| conscience.Electron 1.3g | 14 | 14% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 32 |
| bvh.micro.Freya 0.3 | 10 | 10% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 12 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 15 |
| dl.BetterWalls 1.0 | 5 | 5% | 11 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 89.2 | 148 / 210 | 1.97 | 21.4% | 43251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 21.4% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 20 |
| supersample.SuperBoxBot 1.0 | 3.5 | 10.9% | 15 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 8 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 3 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.8% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 4 |
| sample.Corners 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.7 | 28 / 35 | 7196 |
| 2 | 1 | 73.8 | 96.5 | 29 / 35 | 7584 |
| 3 | 1 | 70.3 | 84.1 | 23 / 35 | 6771 |
| 4 | 1 | 71.6 | 88.9 | 24 / 35 | 7176 |
| 5 | 1 | 70.8 | 85.4 | 23 / 35 | 7318 |
| 6 | 1 | 70.5 | 86.7 | 21 / 35 | 7206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 55 | 89% |
| supersample.SuperBoxBot 1.0 | 15 | 93% |
| dsw.StaticD 1.0 | 12 | 50% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 45% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 21% | 60 |
| dsw.StaticD 1.0 | 9 | 15% | 15 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 11 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 11 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 6 |
| sul.Lunar 1.1 | 1 | 2% | 51 |
| sample.Corners 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorOWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 74.9 | 93 / 210 | 3.26 | 16.8% | 34756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOWN 0.1 | 1.0 | 16.8% | 93 |
| radnor.DoctorBob 1.42 | 2.7 | 13.4% | 24 |
| mld.Wisdom 1.0 | 3.0 | 12.8% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 30 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.9% | 13 |
| amz.NanoClone 1.41 | 6.0 | 9.8% | 8 |
| sample.Walls 1.0 | 7.5 | 7.4% | 2 |
| GarmBox.Oranges 1.0 | 7.7 | 7.2% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 68.9 | 15 / 35 | 5119 |
| 2 | 1 | 66.4 | 78.4 | 18 / 35 | 5814 |
| 3 | 1 | 66.7 | 80.6 | 17 / 35 | 5580 |
| 4 | 1 | 65.7 | 74.0 | 11 / 35 | 6149 |
| 5 | 1 | 63.6 | 69.5 | 13 / 35 | 5537 |
| 6 | 1 | 67.6 | 77.8 | 19 / 35 | 6557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 81% |
| radnor.DoctorBob 1.42 | 34 | 88% |
| mld.Wisdom 1.0 | 17 | 71% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 33% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 32% | 51 |
| radnor.DoctorBob 1.42 | 25 | 21% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 16% | 52 |
| KiraNL.Chupacabra 0.4 | 17 | 15% | 25 |
| amz.NanoClone 1.41 | 10 | 9% | 14 |
| sample.Walls 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

