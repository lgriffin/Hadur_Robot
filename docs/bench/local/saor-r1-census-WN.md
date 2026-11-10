# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.7 | 145 / 210 | 2.01 | 21.0% | 42526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 21.0% | 145 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 23 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 12 |
| mld.Infinity 2.2 | 3.7 | 12.5% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.6% | 7 |
| sample.Walls 1.0 | 6.2 | 7.3% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 89.8 | 27 / 35 | 7563 |
| 2 | 1 | 71.8 | 90.2 | 24 / 35 | 7059 |
| 3 | 1 | 70.7 | 83.2 | 23 / 35 | 6932 |
| 4 | 1 | 71.9 | 90.8 | 26 / 35 | 6702 |
| 5 | 1 | 71.6 | 89.8 | 21 / 35 | 6872 |
| 6 | 1 | 72.0 | 88.6 | 24 / 35 | 7398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 67 | 79% |
| mld.Infinity 2.2 | 44 | 93% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| amz.NanoClone 1.41 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 28 | 43% | 92 |
| radnor.DoctorBob 1.42 | 16 | 25% | 57 |
| amz.NanoClone 1.41 | 6 | 9% | 15 |
| mld.Infinity 2.2 | 5 | 8% | 10 |
| sample.Walls 1.0 | 4 | 6% | 17 |
| GarmBox.Oranges 1.0 | 4 | 6% | 5 |
| jangs.ns51 1.0 | 2 | 3% | 9 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 123 / 210 | 2.25 | 18.5% | 29624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 18.5% | 123 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.2% | 44 |
| mld.DustBunny 3.8 | 2.5 | 14.1% | 29 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 1 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.9% | 8 |
| fullsail.SweetTea 1.1 | 7.5 | 7.0% | 4 |
| bzdp.BoxCar 2.0 | 8.0 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.0 | 15 / 35 | 4656 |
| 2 | 1 | 67.7 | 83.2 | 22 / 35 | 4779 |
| 3 | 1 | 68.6 | 87.6 | 21 / 35 | 5286 |
| 4 | 1 | 68.3 | 87.3 | 17 / 35 | 5190 |
| 5 | 1 | 67.8 | 87.6 | 20 / 35 | 4711 |
| 6 | 1 | 69.8 | 91.7 | 28 / 35 | 5002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 75% |
| mld.DustBunny 3.8 | 54 | 65% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| zyx.nano.Ant 1.1 | 8 | 88% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 43% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 35 | 40% | 73 |
| oog.melee.Mercutio 1.0 | 24 | 27% | 74 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 12 |
| zyx.nano.Ant 1.1 | 7 | 8% | 14 |
| fullsail.SweetTea 1.1 | 4 | 5% | 11 |
| maribo.melee.BMV 0.1 | 4 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 11 |
| cs.Grudge 1.0 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.3 | 95 / 210 | 2.78 | 18.4% | 35797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.2 | 18.4% | 95 |
| myl.micro.Troodon 1.10 | 1.8 | 16.3% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.2% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.2% | 11 |
| fm.mammillarias 1.3 | 5.0 | 9.8% | 10 |
| cb.nano.Insomnia 1.0 | 6.3 | 8.5% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.7% | 1 |
| sample.Tracker 1.0 | 9.3 | 5.2% | 1 |
| sample.Fire 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 15 / 35 | 5587 |
| 2 | 1 | 68.7 | 84.1 | 16 / 35 | 5905 |
| 3 | 1 | 70.5 | 85.7 | 20 / 35 | 6495 |
| 4 | 1 | 67.5 | 77.8 | 16 / 35 | 6189 |
| 5 | 2 | 67.3 | 77.8 | 12 / 35 | 6163 |
| 6 | 1 | 66.0 | 74.6 | 16 / 35 | 5458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 70% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 59% |
| myl.nano.KomoriNinja 1.1 | 17 | 65% |
| cb.nano.Insomnia 1.0 | 9 | 100% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 8 | 50% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 37% | 87 |
| stelo.SoRobotNanoMelee 1.2 | 34 | 29% | 47 |
| fm.mammillarias 1.3 | 15 | 13% | 20 |
| myl.nano.KomoriNinja 1.1 | 11 | 9% | 24 |
| cb.nano.Insomnia 1.0 | 6 | 5% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 14 |

## Melee bench: F04

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.4 | 118 / 210 | 2.31 | 19.6% | 37172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 19.6% | 118 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.0% | 42 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.7% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.3% | 28 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.2% | 0 |
| tj.zombie1n 1.0.1 | 5.7 | 8.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 3 |
| yk.JahMicro 1.0 | 7.2 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 19 / 35 | 6212 |
| 2 | 1 | 68.2 | 82.5 | 19 / 35 | 5993 |
| 3 | 1 | 69.0 | 82.9 | 20 / 35 | 6596 |
| 4 | 1 | 70.4 | 89.8 | 20 / 35 | 6335 |
| 5 | 1 | 69.1 | 85.7 | 21 / 35 | 5854 |
| 6 | 1 | 68.8 | 83.5 | 19 / 35 | 6182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 75% |
| stelo.SoJNanoMelee 1.1 | 32 | 63% |
| tj.zombie1n 1.0.1 | 20 | 85% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 71% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 46 | 50% | 97 |
| stelo.SoJNanoMelee 1.1 | 21 | 23% | 38 |
| tj.zombie1n 1.0.1 | 7 | 8% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 7% | 7 |
| tvv.micro.Antares 1.1.1 | 4 | 4% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 18 |
| yk.JahMicro 1.0 | 3 | 3% | 8 |
| repositorio.NanoStep 1.0 | 1 | 1% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.4 | 94 / 210 | 3.58 | 16.2% | 29769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 16.2% | 94 |
| oog.melee.Corsair 1.0 | 2.2 | 12.7% | 26 |
| ahf.NanoAndrew .4 | 3.5 | 11.3% | 21 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.4% | 35 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 7 |
| sam.Samspin 1.0 | 6.2 | 9.4% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.4% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 65.4 | 13 / 35 | 4983 |
| 2 | 1 | 61.8 | 63.5 | 13 / 35 | 4765 |
| 3 | 1 | 63.0 | 69.8 | 16 / 35 | 4393 |
| 4 | 1 | 66.3 | 77.1 | 17 / 35 | 5567 |
| 5 | 1 | 66.1 | 77.1 | 19 / 35 | 5059 |
| 6 | 1 | 64.8 | 75.2 | 16 / 35 | 5002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 44 | 77% |
| oog.melee.Corsair 1.0 | 33 | 70% |
| ahf.NanoAndrew .4 | 21 | 90% |
| EBBU.Sim2 1.02 | 11 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 25% | 67 |
| zyx.nano.BacillusComma 1.0 | 17 | 14% | 22 |
| EBBU.Sim2 1.02 | 16 | 14% | 22 |
| oog.melee.Corsair 1.0 | 12 | 10% | 31 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 11 |
| ahf.NanoAndrew .4 | 9 | 8% | 26 |
| sam.Samspin 1.0 | 9 | 8% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.6 | 128 / 210 | 2.03 | 19.6% | 33463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 19.6% | 128 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.5% | 50 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 10 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.6% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.6% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 8.5% | 9 |
| fm.claire 1.7 | 6.2 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.2 | 7.6% | 2 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.3 | 15 / 35 | 5096 |
| 2 | 1 | 69.3 | 91.4 | 22 / 35 | 5235 |
| 3 | 1 | 70.1 | 88.9 | 21 / 35 | 5963 |
| 4 | 1 | 68.9 | 87.6 | 23 / 35 | 5165 |
| 5 | 1 | 67.7 | 81.9 | 16 / 35 | 5886 |
| 6 | 1 | 72.2 | 95.2 | 31 / 35 | 6118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 60% |
| oog.melee.CapuletDroid 1.1 | 24 | 83% |
| gh.nano.Grofvuil 0.2 | 19 | 95% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| sample.SpinBot 1.0 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 3 | 67% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 46 | 55% | 103 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 20 |
| oog.melee.CapuletDroid 1.1 | 11 | 13% | 17 |
| fm.claire 1.7 | 6 | 7% | 10 |
| gh.nano.Grofvuil 0.2 | 5 | 6% | 28 |
| sample.SpinBot 1.0 | 3 | 4% | 14 |
| pa.Improved 1.0 | 1 | 1% | 7 |
| kurios.DOSexe .9b | 1 | 1% | 4 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 7 |

## Melee bench: F07

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.9 | 106 / 210 | 2.54 | 18.3% | 33454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 18.3% | 106 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.5% | 42 |
| gh.micro.Gruweltje 0.7 | 3.0 | 13.6% | 28 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 16 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 6 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.2% | 7 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 3 |
| acogdev.alpha 0.2 | 8.0 | 6.5% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 15 / 35 | 5305 |
| 2 | 1 | 67.4 | 81.3 | 18 / 35 | 5579 |
| 3 | 1 | 69.3 | 85.7 | 21 / 35 | 5913 |
| 4 | 1 | 68.7 | 85.7 | 17 / 35 | 5838 |
| 5 | 1 | 68.8 | 87.0 | 19 / 35 | 5611 |
| 6 | 1 | 66.2 | 78.7 | 16 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 62% |
| mz.MicroGodMelee 1 | 41 | 90% |
| gh.micro.Gruweltje 0.7 | 21 | 48% |
| DBall.Anarchy 0.1 | 17 | 100% |
| caimano.Furia_Ceca 0.22 | 8 | 50% |
| el.JumpShoot 0.2 | 5 | 60% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 44 | 42% | 79 |
| gh.micro.Gruweltje 0.7 | 20 | 19% | 38 |
| acogdev.alpha 0.2 | 12 | 12% | 17 |
| mz.MicroGodMelee 1 | 10 | 10% | 36 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 11 |
| el.JumpShoot 0.2 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 14 |

## Melee bench: F08

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.4 | 88 / 210 | 3.58 | 16.0% | 29851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.3 | 16.0% | 88 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 53 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 27 |
| germ.TheMind .2 | 4.5 | 9.8% | 13 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 2 |
| awesomeness.Elite 1.0 | 6.5 | 8.5% | 8 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.0% | 7 |
| sample.Crazy 1.0 | 8.8 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.8 | 15 / 35 | 4999 |
| 2 | 1 | 64.6 | 75.6 | 15 / 35 | 4904 |
| 3 | 1 | 64.2 | 68.3 | 16 / 35 | 5371 |
| 4 | 2 | 62.4 | 70.8 | 13 / 35 | 4439 |
| 5 | 1 | 66.2 | 79.0 | 18 / 35 | 4860 |
| 6 | 2 | 62.8 | 63.8 | 11 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 63% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 90% |
| germ.TheMind .2 | 9 | 78% |
| awesomeness.Elite 1.0 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 67% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 39% | 94 |
| germ.TheMind .2 | 24 | 20% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 16% | 32 |
| stelo.UntouchableNano 1.3 | 11 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 5 | 4% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 3% | 9 |
| sample.Crazy 1.0 | 4 | 3% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.5 | 113 / 210 | 2.30 | 18.6% | 28993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 18.6% | 113 |
| rz.HawkOnFire 0.1 | 2.0 | 14.6% | 45 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 15 |
| maribo.IotaCT 1.1 | 4.8 | 10.4% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.2% | 7 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 5 |
| stelo.PatternRobot 1.0 | 7.3 | 8.3% | 13 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 23 / 35 | 5456 |
| 2 | 1 | 66.6 | 78.7 | 18 / 35 | 4281 |
| 3 | 1 | 67.5 | 82.9 | 15 / 35 | 4783 |
| 4 | 1 | 68.6 | 87.3 | 18 / 35 | 4628 |
| 5 | 1 | 68.9 | 86.7 | 18 / 35 | 5343 |
| 6 | 1 | 69.1 | 86.0 | 21 / 35 | 4502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 59% |
| nz.jdc.nano.GridFu 1.0 | 32 | 81% |
| stelo.PatternRobot 1.0 | 17 | 41% |
| timmit.nano.TimDog 0.33 | 12 | 83% |
| maribo.IotaCT 1.1 | 11 | 82% |
| ratosh.Wesco 1.4 | 10 | 70% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 37 | 38% | 84 |
| stelo.PatternRobot 1.0 | 18 | 18% | 26 |
| nz.jdc.nano.GridFu 1.0 | 15 | 15% | 42 |
| ratosh.Wesco 1.4 | 10 | 10% | 20 |
| timmit.nano.TimDog 0.33 | 8 | 8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 5% | 7 |
| maribo.IotaCT 1.1 | 4 | 4% | 12 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |

## Melee bench: F10

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.8 | 144 / 210 | 2.01 | 20.2% | 36680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 20.2% | 144 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.4% | 13 |
| baal.nano.N 1.42 | 3.0 | 11.1% | 5 |
| Grystrion.TrackerWO 1.0 | 3.8 | 10.5% | 6 |
| zyx.micro.Ant 1.1 | 4.2 | 10.2% | 17 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.5% | 4 |
| sanja.First 0.1 | 7.3 | 8.1% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.3% | 14 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 4 |
| sample.RamFire 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 22 / 35 | 5875 |
| 2 | 1 | 70.8 | 90.8 | 27 / 35 | 6360 |
| 3 | 1 | 70.9 | 94.0 | 28 / 35 | 6064 |
| 4 | 1 | 71.1 | 92.1 | 24 / 35 | 6515 |
| 5 | 1 | 68.2 | 82.5 | 20 / 35 | 5892 |
| 6 | 1 | 69.2 | 87.9 | 23 / 35 | 5974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 89% |
| baal.nano.N 1.42 | 33 | 100% |
| cvt.Firsty 1.0 | 26 | 58% |
| Grystrion.TrackerWO 1.0 | 25 | 92% |
| zyx.micro.Ant 1.1 | 19 | 58% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| sanja.First 0.1 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 27 | 40% | 50 |
| cvt.Firsty 1.0 | 11 | 16% | 32 |
| tvv.nano.Polaris 1.2 | 10 | 15% | 34 |
| Grystrion.TrackerWO 1.0 | 7 | 10% | 32 |
| baal.nano.N 1.42 | 4 | 6% | 24 |
| sanja.First 0.1 | 3 | 4% | 24 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 5 |
| sample.RamFire 1.0 | 2 | 3% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 6 |

## Melee bench: F11

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 64.3 | 57 / 210 | 4.21 | 14.1% | 28082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.2% | 75 |
| hadur117.micro.SaorWN 0.1 | 2.2 | 14.1% | 57 |
| cs.Wren 1.0 | 2.8 | 12.7% | 28 |
| js.PinBall 1.6 | 4.5 | 11.5% | 17 |
| mz.Cork 0.1 | 4.5 | 11.3% | 16 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 7 |
| evd.X1 0.01 | 6.7 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 7.0% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 4 |
| PSW.Relentless 0.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 61.6 | 8 / 35 | 4474 |
| 2 | 2 | 63.1 | 72.1 | 9 / 35 | 4944 |
| 3 | 1 | 63.7 | 71.1 | 15 / 35 | 4888 |
| 4 | 2 | 57.7 | 57.5 | 10 / 35 | 4160 |
| 5 | 3 | 60.4 | 60.3 | 7 / 35 | 4943 |
| 6 | 2 | 60.7 | 63.5 | 8 / 35 | 4673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 46% |
| cs.Wren 1.0 | 17 | 53% |
| mz.Cork 0.1 | 11 | 73% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 5 | 40% |
| donjezza.Jezza 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 153 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 42% | 96 |
| cs.Wren 1.0 | 26 | 17% | 35 |
| evd.X1 0.01 | 20 | 13% | 20 |
| joe.ADinosaur 1.0 | 16 | 10% | 17 |
| js.PinBall 1.6 | 13 | 8% | 18 |
| mz.Cork 0.1 | 8 | 5% | 13 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.3 | 86 / 210 | 3.22 | 16.8% | 28243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 16.8% | 86 |
| myl.nano.Graviton 1.10 | 2.7 | 12.1% | 39 |
| stelo.AreaTargetingBot 1.1 | 3.2 | 11.7% | 32 |
| ntc.Opposite 1.5 | 4.7 | 10.7% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 8 |
| DBall.NUKE 0.1 | 7.0 | 8.3% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.7% | 14 |
| donjezza.Muncho 1.0 | 9.0 | 6.8% | 11 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 73.3 | 12 / 35 | 4253 |
| 2 | 1 | 64.4 | 72.4 | 14 / 35 | 4797 |
| 3 | 1 | 66.7 | 81.0 | 16 / 35 | 4938 |
| 4 | 1 | 64.5 | 74.0 | 13 / 35 | 4590 |
| 5 | 1 | 64.2 | 73.3 | 11 / 35 | 4959 |
| 6 | 1 | 66.4 | 78.1 | 20 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 61% |
| myl.nano.Graviton 1.10 | 25 | 44% |
| donjezza.Muncho 1.0 | 16 | 69% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| DBall.NUKE 0.1 | 11 | 91% |
| disan.Chair 2.2.0 | 11 | 82% |
| ntc.Opposite 1.5 | 6 | 50% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 31 | 25% | 46 |
| stelo.AreaTargetingBot 1.1 | 27 | 22% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 12% | 25 |
| pfvicm.Sobieski 7.2.3b | 15 | 12% | 20 |
| ntc.Opposite 1.5 | 12 | 10% | 14 |
| disan.Chair 2.2.0 | 11 | 9% | 18 |
| donjezza.Muncho 1.0 | 6 | 5% | 18 |
| DBall.NUKE 0.1 | 6 | 5% | 17 |
| pbg.R2D2 1.0 | 2 | 2% | 6 |

## Melee bench: F13

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.7 | 67 / 210 | 3.55 | 15.3% | 26300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.7 | 15.3% | 67 |
| oog.melee.Capulet 1.2 | 2.0 | 14.9% | 59 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.3% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.2% | 13 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 5 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 69.8 | 9 / 35 | 4192 |
| 2 | 3 | 62.2 | 67.9 | 9 / 35 | 3973 |
| 3 | 1 | 66.4 | 78.1 | 16 / 35 | 4674 |
| 4 | 1 | 64.5 | 75.6 | 8 / 35 | 4473 |
| 5 | 1 | 64.3 | 71.1 | 12 / 35 | 4439 |
| 6 | 2 | 62.8 | 67.6 | 13 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 50% |
| kawigi.micro.Shiz 1.1 | 28 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 82% |
| yagami.Tidus 0.11 | 19 | 58% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 38% | 71 |
| yagami.Tidus 0.11 | 34 | 24% | 47 |
| kawigi.micro.Shiz 1.1 | 24 | 17% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 9% | 30 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| ejb.Polaris 1.0.1 | 6 | 4% | 11 |
| kurios.DOSexe .9a | 3 | 2% | 2 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.9 | 120 / 210 | 2.90 | 17.0% | 25960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 17.0% | 120 |
| wee.Gem 1.8.4 | 2.5 | 12.3% | 29 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 24 |
| wompi.Quokka 1.6 | 3.7 | 11.5% | 7 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 6.2 | 9.8% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.0 | 19 / 35 | 4721 |
| 2 | 1 | 63.0 | 72.4 | 16 / 35 | 4032 |
| 3 | 1 | 66.4 | 80.6 | 19 / 35 | 4362 |
| 4 | 1 | 63.7 | 74.0 | 19 / 35 | 3793 |
| 5 | 1 | 63.7 | 74.6 | 19 / 35 | 4125 |
| 6 | 1 | 69.7 | 91.1 | 28 / 35 | 4927 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 84% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 20 | 90% |
| ratosh.Nobo 0.21 | 17 | 82% |
| bayen.UbaMicro 1.4 | 10 | 60% |
| m3thos.Eva00 1.1 | 8 | 63% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 14 | 15% | 49 |
| bzdp.Pansy 2.1 | 13 | 14% | 51 |
| ratosh.Nobo 0.21 | 13 | 14% | 26 |
| wompi.Quokka 1.6 | 11 | 12% | 32 |
| maribo.FollowFire 1 | 11 | 12% | 11 |
| bayen.UbaMicro 1.4 | 10 | 11% | 15 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| m3thos.Eva00 1.1 | 5 | 5% | 9 |

## Melee bench: F15

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.0 | 69 / 210 | 2.53 | 19.1% | 43739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 123 |
| hadur117.micro.SaorWN 0.1 | 1.7 | 19.1% | 69 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 13 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 4 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 77.5 | 10 / 35 | 7052 |
| 2 | 2 | 70.3 | 83.5 | 14 / 35 | 7204 |
| 3 | 2 | 70.8 | 85.1 | 8 / 35 | 8049 |
| 4 | 1 | 70.7 | 88.3 | 12 / 35 | 6705 |
| 5 | 1 | 70.2 | 81.6 | 13 / 35 | 7150 |
| 6 | 2 | 70.1 | 82.2 | 12 / 35 | 7579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 122 | 34% |
| mz.NanoGod 2.02 | 15 | 87% |
| exauge.GateKeeper 1.1.121g | 6 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 99 | 70% | 141 |
| mz.NanoGod 2.02 | 20 | 14% | 35 |
| exauge.GateKeeper 1.1.121g | 11 | 8% | 13 |
| ayk.WallHugger 1.0 | 5 | 4% | 6 |
| stelo.PianistNano 1.2 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 2 | 1% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.2 | 95 / 210 | 3.60 | 16.2% | 28876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 16.2% | 95 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 31 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.4% | 31 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 4 |
| conscience.Electron 1.3g | 7.0 | 8.6% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 6.3% | 6 |
| ap.Frederick 1.1 | 8.8 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 72.1 | 15 / 35 | 4448 |
| 2 | 1 | 63.9 | 70.2 | 17 / 35 | 4583 |
| 3 | 1 | 63.8 | 68.6 | 16 / 35 | 4807 |
| 4 | 1 | 66.5 | 78.7 | 16 / 35 | 5292 |
| 5 | 1 | 62.8 | 66.3 | 12 / 35 | 4854 |
| 6 | 1 | 64.6 | 71.1 | 19 / 35 | 4892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 59% |
| dummy.micro.Sparrow 2.5 | 35 | 69% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| bvh.micro.Freya 0.3 | 13 | 85% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 32 | 28% | 59 |
| dummy.micro.Sparrow 2.5 | 20 | 17% | 45 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 17% | 22 |
| conscience.Electron 1.3g | 14 | 12% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 10% | 32 |
| bvh.micro.Freya 0.3 | 8 | 7% | 14 |
| dl.BetterWalls 1.0 | 7 | 6% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 9 |

## Melee bench: F17

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.3 | 126 / 210 | 2.23 | 20.3% | 40822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 20.3% | 126 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 29 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.8% | 28 |
| sul.Lunar 1.1 | 3.8 | 11.4% | 14 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.5% | 7 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 2 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.1% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.5% | 1 |
| sample.Corners 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 86.3 | 21 / 35 | 6585 |
| 2 | 1 | 70.2 | 86.3 | 18 / 35 | 7004 |
| 3 | 1 | 69.1 | 79.7 | 21 / 35 | 6802 |
| 4 | 1 | 70.7 | 86.3 | 23 / 35 | 6760 |
| 5 | 1 | 70.9 | 88.9 | 22 / 35 | 6660 |
| 6 | 1 | 71.2 | 90.2 | 21 / 35 | 7011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 86% |
| sul.Lunar 1.1 | 38 | 97% |
| supersample.SuperBoxBot 1.0 | 21 | 57% |
| mme.NikeEnhanced 2.0 | 12 | 92% |
| dsw.StaticD 1.0 | 9 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 87 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 43 | 49% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 17% | 55 |
| mme.NikeEnhanced 2.0 | 14 | 16% | 25 |
| dsw.StaticD 1.0 | 4 | 5% | 14 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 9 |
| sul.Lunar 1.1 | 2 | 2% | 45 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 4 |
| sample.Corners 1.0 | 2 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.3 | 116 / 210 | 2.69 | 18.5% | 37646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN 0.1 | 1.0 | 18.5% | 116 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 27 |
| mld.Wisdom 1.0 | 3.0 | 12.2% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 24 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 15 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.8% | 5 |
| GarmBox.Oranges 1.0 | 7.5 | 7.5% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 4 |
| jangs.ns51 1.0 | 9.2 | 5.8% | 3 |
| sample.Target 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.9 | 18 / 35 | 5739 |
| 2 | 1 | 66.8 | 77.5 | 18 / 35 | 6117 |
| 3 | 1 | 69.3 | 84.8 | 24 / 35 | 6265 |
| 4 | 1 | 68.6 | 84.8 | 17 / 35 | 6475 |
| 5 | 1 | 67.8 | 80.6 | 19 / 35 | 6178 |
| 6 | 1 | 69.0 | 84.1 | 20 / 35 | 6872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 79% |
| radnor.DoctorBob 1.42 | 42 | 86% |
| mld.Wisdom 1.0 | 22 | 77% |
| amz.NanoClone 1.41 | 12 | 83% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 0% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 24% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 23% | 57 |
| radnor.DoctorBob 1.42 | 15 | 16% | 44 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 26 |
| amz.NanoClone 1.41 | 10 | 11% | 21 |
| jangs.ns51 1.0 | 6 | 6% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| sample.Walls 1.0 | 2 | 2% | 8 |

