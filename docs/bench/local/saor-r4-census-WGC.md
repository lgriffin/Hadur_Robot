# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 90.7 | 150 / 210 | 1.84 | 22.1% | 45182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.1% | 150 |
| radnor.DoctorBob 1.42 | 2.7 | 14.5% | 21 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 14 |
| mld.Infinity 2.2 | 3.3 | 13.2% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 6.8% | 0 |
| sample.Walls 1.0 | 6.8 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 3 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 2 |
| sample.Target 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 90.8 | 24 / 35 | 7168 |
| 2 | 1 | 72.1 | 86.3 | 25 / 35 | 7344 |
| 3 | 1 | 73.8 | 91.4 | 26 / 35 | 7436 |
| 4 | 1 | 73.4 | 91.4 | 25 / 35 | 7839 |
| 5 | 1 | 73.8 | 93.7 | 25 / 35 | 7817 |
| 6 | 1 | 73.0 | 90.5 | 25 / 35 | 7578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 90% |
| radnor.DoctorBob 1.42 | 41 | 85% |
| mld.Infinity 2.2 | 40 | 90% |
| amz.NanoClone 1.41 | 8 | 88% |
| arthord.MannyPacquiao Beta | 6 | 67% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 40% | 77 |
| mz.AntiGrav 1.0 | 16 | 27% | 59 |
| mld.Infinity 2.2 | 8 | 13% | 39 |
| amz.NanoClone 1.41 | 5 | 8% | 13 |
| arthord.MannyPacquiao Beta | 3 | 5% | 6 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| GarmBox.Oranges 1.0 | 1 | 2% | 5 |
| sample.Walls 1.0 | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.7 | 116 / 210 | 2.56 | 18.7% | 34947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.7% | 116 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.3% | 59 |
| mld.DustBunny 3.8 | 3.8 | 12.8% | 15 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 3 |
| zyx.nano.Ant 1.1 | 5.3 | 8.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 6.5% | 8 |
| bzdp.BoxCar 2.0 | 8.0 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.5% | 2 |
| cs.Grudge 1.0 | 8.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 16 / 35 | 5527 |
| 2 | 1 | 69.8 | 88.6 | 20 / 35 | 5651 |
| 3 | 1 | 70.1 | 88.9 | 21 / 35 | 6557 |
| 4 | 1 | 70.8 | 91.1 | 26 / 35 | 6121 |
| 5 | 1 | 67.2 | 81.6 | 20 / 35 | 4901 |
| 6 | 1 | 66.1 | 69.2 | 13 / 35 | 6190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 67 | 73% |
| mld.DustBunny 3.8 | 51 | 86% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 37% | 88 |
| mld.DustBunny 3.8 | 29 | 31% | 68 |
| zyx.nano.Ant 1.1 | 8 | 8% | 11 |
| fullsail.SweetTea 1.1 | 7 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 9 |
| maribo.melee.BMV 0.1 | 4 | 4% | 10 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| cs.Grudge 1.0 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 80.7 | 121 / 210 | 2.73 | 19.5% | 37591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 19.5% | 121 |
| myl.micro.Troodon 1.10 | 2.3 | 14.4% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.1% | 24 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.2% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 7 |
| sample.Fire 1.0 | 9.5 | 4.7% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.3 | 22 / 35 | 6606 |
| 2 | 1 | 69.6 | 81.3 | 19 / 35 | 6324 |
| 3 | 1 | 70.5 | 82.5 | 20 / 35 | 6717 |
| 4 | 1 | 71.2 | 89.2 | 25 / 35 | 6168 |
| 5 | 1 | 69.2 | 79.0 | 18 / 35 | 6235 |
| 6 | 1 | 66.0 | 71.1 | 17 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 71% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| myl.nano.KomoriNinja 1.1 | 18 | 89% |
| sp.Nanos.Ember 1.1 | 11 | 73% |
| fm.mammillarias 1.3 | 7 | 86% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 22% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 22% | 39 |
| myl.nano.KomoriNinja 1.1 | 12 | 13% | 39 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 21 |
| fm.mammillarias 1.3 | 10 | 11% | 12 |
| sp.Nanos.Ember 1.1 | 8 | 9% | 16 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| sample.Fire 1.0 | 2 | 2% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.5 | 139 / 210 | 2.48 | 20.4% | 41206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.4% | 139 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 19 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.8% | 21 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.8% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5.8 | 8.8% | 3 |
| tj.zombie1n 1.0.1 | 6.0 | 8.7% | 6 |
| yk.JahMicro 1.0 | 6.3 | 8.2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.6% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 90.5 | 26 / 35 | 6828 |
| 2 | 1 | 69.9 | 81.9 | 22 / 35 | 6813 |
| 3 | 1 | 64.9 | 66.7 | 18 / 35 | 5916 |
| 4 | 1 | 70.5 | 82.5 | 26 / 35 | 7137 |
| 5 | 1 | 70.8 | 86.0 | 21 / 35 | 7325 |
| 6 | 1 | 72.5 | 93.7 | 26 / 35 | 7187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 83% |
| stelo.SoJNanoMelee 1.1 | 35 | 89% |
| tvv.micro.Antares 1.1.1 | 23 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 96% |
| tj.zombie1n 1.0.1 | 9 | 67% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 31 | 44% | 83 |
| tj.zombie1n 1.0.1 | 9 | 13% | 11 |
| stelo.SoJNanoMelee 1.1 | 8 | 11% | 31 |
| tvv.micro.Antares 1.1.1 | 7 | 10% | 33 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 8% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 27 |
| sample.VelociRobot 1.0 | 3 | 4% | 5 |
| yk.JahMicro 1.0 | 2 | 3% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 9 |

## Melee bench: F05

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.6 | 97 / 210 | 3.55 | 16.7% | 31328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.7% | 97 |
| oog.melee.Corsair 1.0 | 2.5 | 13.2% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 25 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.6% | 26 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 4 |
| sam.Samspin 1.0 | 5.8 | 9.5% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.1% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.4 | 23 / 35 | 5402 |
| 2 | 1 | 63.3 | 67.6 | 13 / 35 | 4972 |
| 3 | 1 | 62.9 | 65.7 | 13 / 35 | 4844 |
| 4 | 1 | 67.2 | 75.9 | 19 / 35 | 5730 |
| 5 | 1 | 64.1 | 66.0 | 14 / 35 | 5538 |
| 6 | 1 | 64.1 | 69.2 | 15 / 35 | 4842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 44 | 66% |
| simonton.nano.MeleeSeed 1.8 | 33 | 91% |
| ahf.NanoAndrew .4 | 20 | 90% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| EBBU.Sim2 1.02 | 6 | 100% |
| sam.Samspin 1.0 | 4 | 50% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 22 | 19% | 52 |
| simonton.nano.MeleeSeed 1.8 | 18 | 16% | 46 |
| ahf.NanoAndrew .4 | 15 | 13% | 34 |
| sam.Samspin 1.0 | 15 | 13% | 21 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 20 |
| EBBU.Sim2 1.02 | 9 | 8% | 16 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 8 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.0 | 129 / 210 | 2.26 | 18.9% | 31429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.9% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 36 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.3% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.2% | 12 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 11 |
| fm.claire 1.7 | 6.5 | 8.2% | 0 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 4 |
| pa.Improved 1.0 | 9.2 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.0 | 21 / 35 | 5222 |
| 2 | 1 | 68.6 | 85.4 | 23 / 35 | 5348 |
| 3 | 1 | 69.3 | 88.6 | 24 / 35 | 5038 |
| 4 | 1 | 68.6 | 88.6 | 22 / 35 | 4924 |
| 5 | 1 | 67.5 | 78.7 | 19 / 35 | 5684 |
| 6 | 1 | 68.6 | 88.6 | 20 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 79% |
| oog.melee.CapuletDroid 1.1 | 28 | 93% |
| gh.nano.Grofvuil 0.2 | 19 | 84% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| kurios.DOSexe .9b | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 37% | 87 |
| oog.melee.CapuletDroid 1.1 | 13 | 16% | 40 |
| arthord.NanoSatanMelee Beta | 11 | 14% | 19 |
| gh.nano.Grofvuil 0.2 | 10 | 12% | 23 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 11 |
| sample.SpinBot 1.0 | 5 | 6% | 8 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| pa.Improved 1.0 | 3 | 4% | 5 |
| fm.claire 1.7 | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.0 | 109 / 210 | 2.62 | 18.8% | 36607 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.8% | 109 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.2% | 26 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.4% | 29 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 37 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 3 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.8 | 20 / 35 | 6222 |
| 2 | 1 | 68.8 | 82.5 | 18 / 35 | 6128 |
| 3 | 1 | 67.8 | 80.0 | 15 / 35 | 5998 |
| 4 | 1 | 70.4 | 88.6 | 22 / 35 | 6157 |
| 5 | 1 | 68.7 | 81.0 | 16 / 35 | 6376 |
| 6 | 1 | 67.1 | 76.2 | 18 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 91% |
| mz.MicroGodMelee 1 | 46 | 61% |
| gh.micro.Gruweltje 0.7 | 31 | 65% |
| caimano.Furia_Ceca 0.22 | 8 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 36% | 65 |
| gh.micro.Gruweltje 0.7 | 25 | 25% | 52 |
| spinnercat.micro.Tyger 0.1 | 21 | 21% | 57 |
| fire219.CatBot 1.0 | 6 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 12 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 67.7 | 94 / 210 | 3.90 | 16.1% | 31660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.5 | 16.1% | 94 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 14.0% | 40 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.8% | 9 |
| germ.TheMind .2 | 5.7 | 9.0% | 6 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 6 |
| sample.Crazy 1.0 | 8.2 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 71.1 | 16 / 35 | 4990 |
| 2 | 1 | 67.8 | 78.1 | 21 / 35 | 5672 |
| 3 | 3 | 57.4 | 49.8 | 9 / 35 | 4606 |
| 4 | 2 | 59.9 | 56.5 | 11 / 35 | 4736 |
| 5 | 1 | 64.6 | 67.9 | 16 / 35 | 5605 |
| 6 | 1 | 68.9 | 82.9 | 21 / 35 | 6051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 71% |
| germ.TheMind .2 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| sample.Crazy 1.0 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 49% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 18% | 39 |
| germ.TheMind .2 | 9 | 8% | 20 |
| lrem.micro.MoggFanatic 0.2 | 9 | 8% | 13 |
| awesomeness.Elite 1.0 | 7 | 6% | 15 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 8 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.1 | 154 / 210 | 2.07 | 20.4% | 33111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.4% | 154 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 17 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 0 |
| ratosh.Wesco 1.4 | 6.2 | 9.0% | 7 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.1% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 6 |
| spinnercat.Omen 1.0 | 8.7 | 6.9% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 87.0 | 26 / 35 | 5587 |
| 2 | 1 | 69.7 | 84.1 | 23 / 35 | 5245 |
| 3 | 1 | 71.8 | 90.8 | 28 / 35 | 5640 |
| 4 | 1 | 72.9 | 95.6 | 29 / 35 | 5864 |
| 5 | 1 | 70.9 | 87.6 | 25 / 35 | 5531 |
| 6 | 1 | 69.1 | 83.5 | 23 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 96% |
| nz.jdc.nano.GridFu 1.0 | 36 | 94% |
| timmit.nano.TimDog 0.33 | 16 | 81% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| ratosh.Wesco 1.4 | 12 | 92% |
| maribo.IotaCT 1.1 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 68 |
| stelo.PatternRobot 1.0 | 11 | 20% | 24 |
| nz.jdc.nano.GridFu 1.0 | 9 | 16% | 53 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 21 |
| ratosh.Wesco 1.4 | 6 | 11% | 19 |
| maribo.IotaCT 1.1 | 4 | 7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 0 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.3 | 161 / 210 | 1.88 | 21.7% | 41915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.7% | 161 |
| baal.nano.N 1.42 | 2.3 | 12.2% | 9 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.3% | 14 |
| zyx.micro.Ant 1.1 | 4.5 | 9.9% | 9 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.3% | 5 |
| sanja.First 0.1 | 6.3 | 8.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.4% | 3 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.1% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 91.1 | 29 / 35 | 6934 |
| 2 | 1 | 71.0 | 86.0 | 24 / 35 | 7125 |
| 3 | 1 | 71.9 | 92.7 | 26 / 35 | 6915 |
| 4 | 1 | 72.2 | 89.8 | 27 / 35 | 7368 |
| 5 | 1 | 72.5 | 91.7 | 30 / 35 | 7009 |
| 6 | 1 | 71.2 | 90.2 | 25 / 35 | 6564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 44 | 86% |
| tvv.nano.Polaris 1.2 | 37 | 95% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| cvt.Firsty 1.0 | 21 | 90% |
| sanja.First 0.1 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 88% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 29% | 43 |
| baal.nano.N 1.42 | 9 | 18% | 40 |
| tvv.nano.Polaris 1.2 | 8 | 16% | 61 |
| Grystrion.TrackerWO 1.0 | 7 | 14% | 14 |
| sample.RamFire 1.0 | 5 | 10% | 5 |
| sanja.First 0.1 | 3 | 6% | 21 |
| cvt.Firsty 1.0 | 2 | 4% | 17 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.5 | 84 / 210 | 3.56 | 16.3% | 33494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.5 | 16.3% | 84 |
| kc.micro.Figment 1.0 | 1.5 | 16.0% | 70 |
| cs.Wren 1.0 | 3.3 | 12.2% | 15 |
| mz.Cork 0.1 | 3.8 | 11.7% | 17 |
| js.PinBall 1.6 | 4.8 | 10.7% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 8.5% | 1 |
| evd.X1 0.01 | 6.7 | 7.7% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 74.9 | 15 / 35 | 5607 |
| 2 | 1 | 66.4 | 77.1 | 13 / 35 | 5882 |
| 3 | 2 | 61.8 | 64.8 | 12 / 35 | 4967 |
| 4 | 2 | 63.3 | 67.3 | 11 / 35 | 5445 |
| 5 | 1 | 65.6 | 74.0 | 16 / 35 | 5750 |
| 6 | 2 | 65.7 | 71.1 | 17 / 35 | 5843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 76 | 63% |
| cs.Wren 1.0 | 16 | 94% |
| mz.Cork 0.1 | 12 | 67% |
| js.PinBall 1.6 | 6 | 67% |
| donjezza.Jezza 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 47% | 108 |
| cs.Wren 1.0 | 16 | 13% | 32 |
| evd.X1 0.01 | 14 | 11% | 16 |
| mz.Cork 0.1 | 10 | 8% | 19 |
| joe.ADinosaur 1.0 | 10 | 8% | 12 |
| js.PinBall 1.6 | 9 | 7% | 13 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| PSW.Relentless 0.1 | 3 | 2% | 1 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 86.8 | 147 / 210 | 2.19 | 20.0% | 32299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 20.0% | 147 |
| myl.nano.Graviton 1.10 | 2.5 | 12.2% | 17 |
| ntc.Opposite 1.5 | 2.7 | 11.8% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.0% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.2% | 7 |
| disan.Chair 2.2.0 | 6.0 | 8.9% | 11 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.0% | 2 |
| DBall.NUKE 0.1 | 7.7 | 7.5% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.2 | 21 / 35 | 5251 |
| 2 | 1 | 69.3 | 84.4 | 23 / 35 | 5455 |
| 3 | 1 | 70.0 | 89.2 | 25 / 35 | 5301 |
| 4 | 1 | 68.4 | 80.6 | 24 / 35 | 5249 |
| 5 | 1 | 70.3 | 91.4 | 25 / 35 | 5251 |
| 6 | 1 | 71.8 | 92.1 | 29 / 35 | 5792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 45 | 89% |
| stelo.AreaTargetingBot 1.1 | 31 | 90% |
| ntc.Opposite 1.5 | 23 | 91% |
| disan.Chair 2.2.0 | 21 | 62% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| donjezza.Muncho 1.0 | 15 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 15 | 23% | 34 |
| myl.nano.Graviton 1.10 | 12 | 19% | 46 |
| disan.Chair 2.2.0 | 10 | 16% | 28 |
| stelo.AreaTargetingBot 1.1 | 9 | 14% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 13% | 24 |
| pfvicm.Sobieski 7.2.3b | 4 | 6% | 14 |
| donjezza.Muncho 1.0 | 4 | 6% | 12 |
| DBall.NUKE 0.1 | 2 | 3% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.0 | 88 / 210 | 3.25 | 16.5% | 28046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.5% | 88 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.6% | 28 |
| oog.melee.Capulet 1.2 | 3.3 | 13.6% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 22 |
| yagami.Tidus 0.11 | 4.5 | 11.8% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 9 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.9 | 18 / 35 | 4955 |
| 2 | 1 | 67.5 | 80.6 | 18 / 35 | 4952 |
| 3 | 1 | 64.2 | 70.8 | 12 / 35 | 4313 |
| 4 | 1 | 63.4 | 68.6 | 10 / 35 | 4672 |
| 5 | 1 | 64.2 | 72.7 | 13 / 35 | 4154 |
| 6 | 1 | 66.5 | 75.2 | 17 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 72% |
| yagami.Tidus 0.11 | 20 | 95% |
| kawigi.micro.Shiz 1.1 | 19 | 95% |
| ejb.Polaris 1.0.1 | 6 | 83% |

Hadur died in 122 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 32% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 18% | 48 |
| yagami.Tidus 0.11 | 20 | 16% | 36 |
| kawigi.micro.Shiz 1.1 | 19 | 16% | 38 |
| ejb.Polaris 1.0.1 | 10 | 8% | 14 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.8 | 122 / 210 | 3.09 | 17.1% | 27536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 17.1% | 122 |
| bzdp.Pansy 2.1 | 2.3 | 13.1% | 25 |
| ratosh.Nobo 0.21 | 3.3 | 11.8% | 14 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 27 |
| wompi.Quokka 1.6 | 4.5 | 10.9% | 14 |
| m3thos.Eva00 1.1 | 6.2 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 6.5 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 22 / 35 | 4982 |
| 2 | 1 | 65.0 | 73.3 | 18 / 35 | 4676 |
| 3 | 1 | 65.4 | 74.6 | 20 / 35 | 4590 |
| 4 | 1 | 63.0 | 66.7 | 17 / 35 | 4264 |
| 5 | 1 | 65.5 | 77.1 | 22 / 35 | 4264 |
| 6 | 1 | 67.1 | 83.5 | 23 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 65 | 91% |
| wee.Gem 1.8.4 | 22 | 86% |
| ratosh.Nobo 0.21 | 21 | 90% |
| wompi.Quokka 1.6 | 12 | 83% |
| m3thos.Eva00 1.1 | 9 | 78% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 15% | 62 |
| m3thos.Eva00 1.1 | 12 | 13% | 21 |
| wee.Gem 1.8.4 | 11 | 12% | 34 |
| wompi.Quokka 1.6 | 11 | 12% | 20 |
| stelo.MyAgileRobot 0.2 | 11 | 12% | 14 |
| ratosh.Nobo 0.21 | 10 | 11% | 30 |
| bayen.UbaMicro 1.4 | 10 | 11% | 14 |
| maribo.FollowFire 1 | 8 | 9% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 74.0 | 89.7 | 147 / 210 | 1.93 | 22.6% | 51312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 22.6% | 147 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 51 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 9 |
| exauge.GateKeeper 1.1.121g | 4.2 | 10.0% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 92.7 | 25 / 35 | 8965 |
| 2 | 1 | 74.7 | 90.2 | 25 / 35 | 9083 |
| 3 | 1 | 72.6 | 84.1 | 20 / 35 | 8263 |
| 4 | 1 | 75.3 | 94.9 | 27 / 35 | 8638 |
| 5 | 1 | 72.3 | 84.8 | 24 / 35 | 7829 |
| 6 | 1 | 74.4 | 91.4 | 26 / 35 | 8534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 127 | 83% |
| mz.NanoGod 2.02 | 18 | 83% |
| exauge.GateKeeper 1.1.121g | 14 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 27 | 43% | 135 |
| mz.NanoGod 2.02 | 22 | 35% | 35 |
| exauge.GateKeeper 1.1.121g | 8 | 13% | 17 |
| ayk.WallHugger 1.0 | 3 | 5% | 8 |
| stelo.PianistNano 1.2 | 2 | 3% | 7 |
| drd.Dreadknoght 0.9 | 1 | 2% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.2 | 98 / 210 | 3.50 | 16.7% | 31098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 16.7% | 98 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 19 |
| bvh.micro.Freya 0.3 | 3.5 | 11.7% | 17 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.0% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.5% | 25 |
| stelo.MirrorMicro 1.0 | 5.0 | 9.9% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.1% | 16 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.0 | 14 / 35 | 5665 |
| 2 | 1 | 64.6 | 71.4 | 17 / 35 | 5018 |
| 3 | 1 | 64.6 | 72.4 | 17 / 35 | 4737 |
| 4 | 1 | 64.3 | 70.2 | 18 / 35 | 5104 |
| 5 | 1 | 65.8 | 73.3 | 14 / 35 | 5312 |
| 6 | 1 | 65.6 | 73.0 | 18 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 94% |
| dummy.micro.Sparrow 2.5 | 26 | 81% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 31% |
| stelo.MirrorMicro 1.0 | 9 | 78% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 113 of 210 rounds, at a mean tick of 468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 19% | 67 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 18% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 26 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 37 |
| bvh.micro.Freya 0.3 | 12 | 11% | 21 |
| conscience.Electron 1.3g | 12 | 11% | 14 |
| dl.BetterWalls 1.0 | 10 | 9% | 11 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 14 |

## Melee bench: F17

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 85.0 | 147 / 210 | 2.35 | 21.4% | 44322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 21.4% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.0% | 20 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.3% | 11 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 13 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.7% | 7 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.8% | 0 |
| sample.MyFirstRobot 1.0 | 7.8 | 6.1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.Corners 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 91.1 | 27 / 35 | 7832 |
| 2 | 1 | 73.2 | 88.6 | 26 / 35 | 7889 |
| 3 | 1 | 70.0 | 78.4 | 24 / 35 | 6847 |
| 4 | 1 | 67.5 | 71.7 | 18 / 35 | 6183 |
| 5 | 1 | 74.6 | 96.8 | 29 / 35 | 8079 |
| 6 | 1 | 70.9 | 83.2 | 23 / 35 | 7492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 52 | 100% |
| supersample.SuperBoxBot 1.0 | 41 | 85% |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 91% |
| dsw.StaticD 1.0 | 10 | 70% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 32% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 29% | 55 |
| sul.Lunar 1.1 | 8 | 13% | 61 |
| dsw.StaticD 1.0 | 7 | 11% | 22 |
| sample.Corners 1.0 | 5 | 8% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWGC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 77.9 | 108 / 210 | 2.99 | 18.2% | 38539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGC 0.1 | 1.0 | 18.2% | 108 |
| mld.Wisdom 1.0 | 2.3 | 13.2% | 29 |
| radnor.DoctorBob 1.42 | 2.8 | 12.9% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.9% | 18 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 10 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 10 |
| sample.Walls 1.0 | 7.5 | 7.7% | 7 |
| jangs.ns51 1.0 | 8.2 | 6.7% | 2 |
| GarmBox.Oranges 1.0 | 8.3 | 6.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 81.0 | 23 / 35 | 6865 |
| 2 | 1 | 64.1 | 69.8 | 14 / 35 | 5457 |
| 3 | 1 | 68.8 | 80.6 | 19 / 35 | 6714 |
| 4 | 1 | 68.2 | 78.4 | 16 / 35 | 6769 |
| 5 | 1 | 66.9 | 76.8 | 18 / 35 | 6336 |
| 6 | 1 | 68.2 | 80.6 | 18 / 35 | 6398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 83% |
| mld.Wisdom 1.0 | 23 | 74% |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 78% |
| amz.NanoClone 1.41 | 14 | 100% |
| jangs.ns51 1.0 | 12 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 34% | 54 |
| radnor.DoctorBob 1.42 | 16 | 16% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 15% | 37 |
| amz.NanoClone 1.41 | 12 | 12% | 22 |
| KiraNL.Chupacabra 0.4 | 12 | 12% | 21 |
| jangs.ns51 1.0 | 5 | 5% | 10 |
| GarmBox.Oranges 1.0 | 4 | 4% | 7 |
| sample.Walls 1.0 | 3 | 3% | 3 |

