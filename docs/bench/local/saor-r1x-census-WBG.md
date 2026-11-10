# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 89.5 | 155 / 210 | 1.94 | 21.9% | 44513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.9% | 155 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 24 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 7 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 18 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| sample.Walls 1.0 | 6.0 | 7.2% | 0 |
| GarmBox.Oranges 1.0 | 7.3 | 5.9% | 1 |
| jangs.ns51 1.0 | 7.7 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 93.7 | 29 / 35 | 8317 |
| 2 | 1 | 71.6 | 85.4 | 24 / 35 | 6933 |
| 3 | 1 | 72.7 | 90.8 | 27 / 35 | 7133 |
| 4 | 1 | 72.8 | 89.5 | 25 / 35 | 7404 |
| 5 | 1 | 72.9 | 91.1 | 26 / 35 | 7327 |
| 6 | 1 | 72.6 | 86.7 | 24 / 35 | 7399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 100% |
| radnor.DoctorBob 1.42 | 43 | 86% |
| mld.Infinity 2.2 | 33 | 85% |
| amz.NanoClone 1.41 | 4 | 50% |
| GarmBox.Oranges 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 48% | 68 |
| mld.Infinity 2.2 | 13 | 23% | 43 |
| mz.AntiGrav 1.0 | 7 | 13% | 70 |
| amz.NanoClone 1.41 | 4 | 7% | 7 |
| GarmBox.Oranges 1.0 | 3 | 5% | 6 |
| sample.Walls 1.0 | 1 | 2% | 10 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.2 | 118 / 210 | 2.33 | 18.6% | 32160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.6% | 118 |
| mld.DustBunny 3.8 | 2.3 | 14.0% | 24 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.1% | 51 |
| maribo.melee.BMV 0.1 | 4.3 | 10.5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 6.0 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 5 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 4 |
| bzdp.BoxCar 2.0 | 8.7 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.7 | 20 / 35 | 5288 |
| 2 | 1 | 67.3 | 80.0 | 19 / 35 | 5157 |
| 3 | 1 | 68.2 | 86.3 | 21 / 35 | 5250 |
| 4 | 1 | 70.5 | 91.7 | 25 / 35 | 5806 |
| 5 | 1 | 68.0 | 84.1 | 16 / 35 | 5740 |
| 6 | 1 | 66.6 | 82.5 | 17 / 35 | 4919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 57 | 79% |
| oog.melee.Mercutio 1.0 | 54 | 74% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 8 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 35% | 66 |
| oog.melee.Mercutio 1.0 | 29 | 32% | 75 |
| maribo.melee.BMV 0.1 | 8 | 9% | 19 |
| zyx.nano.Ant 1.1 | 6 | 7% | 10 |
| fullsail.SweetTea 1.1 | 5 | 5% | 10 |
| cs.Grudge 1.0 | 4 | 4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 80.1 | 124 / 210 | 2.79 | 19.3% | 37123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 19.3% | 124 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 11 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.5% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.3% | 19 |
| fm.mammillarias 1.3 | 5.7 | 8.8% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 5 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 79.0 | 18 / 35 | 6445 |
| 2 | 1 | 70.7 | 83.8 | 23 / 35 | 6518 |
| 3 | 1 | 69.0 | 81.0 | 22 / 35 | 6065 |
| 4 | 1 | 68.9 | 77.5 | 21 / 35 | 6205 |
| 5 | 1 | 69.0 | 81.3 | 23 / 35 | 5987 |
| 6 | 1 | 67.7 | 78.1 | 17 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 79% |
| cb.nano.Insomnia 1.0 | 22 | 91% |
| myl.nano.KomoriNinja 1.1 | 16 | 88% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| cs.sheldor.Talon 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 2 | 50% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 24% | 43 |
| cb.nano.Insomnia 1.0 | 21 | 24% | 28 |
| myl.micro.Troodon 1.10 | 10 | 12% | 58 |
| myl.nano.KomoriNinja 1.1 | 10 | 12% | 34 |
| cs.sheldor.Talon 1.1 | 7 | 8% | 12 |
| fm.mammillarias 1.3 | 7 | 8% | 9 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 18 |
| sample.Fire 1.0 | 4 | 5% | 4 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.3 | 146 / 210 | 2.32 | 20.4% | 39334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.4% | 146 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.0% | 14 |
| tvv.micro.Antares 1.1.1 | 3.3 | 11.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 3.8 | 10.6% | 24 |
| tj.zombie1n 1.0.1 | 5.7 | 8.8% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.4% | 1 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.7 | 27 / 35 | 6680 |
| 2 | 1 | 71.5 | 90.2 | 26 / 35 | 7075 |
| 3 | 1 | 72.5 | 93.0 | 30 / 35 | 7068 |
| 4 | 1 | 68.7 | 81.9 | 20 / 35 | 6131 |
| 5 | 1 | 69.5 | 83.8 | 24 / 35 | 6230 |
| 6 | 1 | 67.7 | 76.2 | 19 / 35 | 6150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 59 | 81% |
| kawigi.nano.Lib 1.0 | 58 | 97% |
| tj.zombie1n 1.0.1 | 13 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 92% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 33% | 78 |
| stelo.SoJNanoMelee 1.1 | 19 | 30% | 57 |
| tj.zombie1n 1.0.1 | 9 | 14% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 12 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 18 |
| repositorio.NanoStep 1.0 | 3 | 5% | 7 |
| sample.VelociRobot 1.0 | 2 | 3% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 17 |
| yk.JahMicro 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.3 | 98 / 210 | 3.40 | 16.5% | 28949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 16.5% | 98 |
| oog.melee.Corsair 1.0 | 2.3 | 12.3% | 27 |
| ahf.NanoAndrew .4 | 2.7 | 11.9% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.3% | 23 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.0% | 7 |
| sam.Samspin 1.0 | 6.7 | 9.1% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 66.7 | 15 / 35 | 4473 |
| 2 | 1 | 63.8 | 71.7 | 18 / 35 | 4412 |
| 3 | 1 | 66.1 | 79.4 | 19 / 35 | 5061 |
| 4 | 1 | 63.2 | 68.3 | 13 / 35 | 4845 |
| 5 | 1 | 65.1 | 74.9 | 18 / 35 | 4655 |
| 6 | 1 | 66.6 | 78.7 | 15 / 35 | 5503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 69% |
| ahf.NanoAndrew .4 | 30 | 80% |
| simonton.nano.MeleeSeed 1.8 | 30 | 83% |
| zyx.nano.BacillusComma 1.0 | 8 | 75% |
| sam.Samspin 1.0 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 23 | 20% | 54 |
| oog.melee.Corsair 1.0 | 21 | 19% | 46 |
| simonton.nano.MeleeSeed 1.8 | 20 | 18% | 36 |
| zyx.nano.BacillusComma 1.0 | 15 | 13% | 20 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 19 |
| sam.Samspin 1.0 | 7 | 6% | 15 |
| EBBU.Sim2 1.02 | 6 | 5% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 5 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.7 | 130 / 210 | 2.38 | 18.9% | 32404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.9% | 130 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 33 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.7% | 17 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 3 |
| fm.claire 1.7 | 6.5 | 8.1% | 2 |
| sample.SpinBot 1.0 | 7.7 | 7.1% | 4 |
| pa.Improved 1.0 | 9.3 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 21 / 35 | 5809 |
| 2 | 1 | 66.9 | 77.8 | 19 / 35 | 5487 |
| 3 | 1 | 66.6 | 81.6 | 20 / 35 | 4591 |
| 4 | 1 | 69.7 | 87.6 | 24 / 35 | 5759 |
| 5 | 1 | 69.7 | 89.5 | 25 / 35 | 5394 |
| 6 | 1 | 68.3 | 84.4 | 21 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 84% |
| oog.melee.CapuletDroid 1.1 | 31 | 97% |
| gh.nano.Grofvuil 0.2 | 14 | 57% |
| arthord.NanoSatanMelee Beta | 13 | 77% |
| sample.SpinBot 1.0 | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 41% | 83 |
| gh.nano.Grofvuil 0.2 | 17 | 21% | 30 |
| arthord.NanoSatanMelee Beta | 11 | 14% | 20 |
| oog.melee.CapuletDroid 1.1 | 9 | 11% | 43 |
| fm.claire 1.7 | 5 | 6% | 9 |
| pa.Improved 1.0 | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 2 | 3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 12 |
| kurios.DOSexe .9b | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.2 | 111 / 210 | 2.42 | 18.9% | 36140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.9% | 111 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.4% | 30 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.8% | 30 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 29 |
| DBall.Anarchy 0.1 | 5.0 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.8% | 2 |
| el.JumpShoot 0.2 | 8.8 | 5.8% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.9 | 17 / 35 | 6214 |
| 2 | 1 | 70.6 | 91.1 | 23 / 35 | 6224 |
| 3 | 1 | 67.6 | 79.7 | 16 / 35 | 5734 |
| 4 | 1 | 68.8 | 82.9 | 17 / 35 | 6281 |
| 5 | 1 | 68.1 | 82.5 | 17 / 35 | 5889 |
| 6 | 1 | 69.3 | 87.3 | 21 / 35 | 5798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 79% |
| mz.MicroGodMelee 1 | 47 | 68% |
| gh.micro.Gruweltje 0.7 | 18 | 78% |
| DBall.Anarchy 0.1 | 13 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 31% | 66 |
| spinnercat.micro.Tyger 0.1 | 28 | 28% | 70 |
| gh.micro.Gruweltje 0.7 | 19 | 19% | 36 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 11 |
| acogdev.alpha 0.2 | 5 | 5% | 5 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 13 |

## Melee bench: F08

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.7 | 127 / 210 | 3.28 | 17.4% | 31498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.3 | 17.4% | 127 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 31 |
| germ.TheMind .2 | 4.2 | 9.3% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.0% | 5 |
| awesomeness.Elite 1.0 | 6.3 | 8.5% | 8 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 8.0 | 7.5% | 3 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 77.1 | 21 / 35 | 5639 |
| 2 | 1 | 69.0 | 82.5 | 26 / 35 | 5903 |
| 3 | 1 | 66.2 | 75.9 | 22 / 35 | 5021 |
| 4 | 1 | 69.6 | 85.4 | 23 / 35 | 5803 |
| 5 | 1 | 65.1 | 71.4 | 21 / 35 | 4918 |
| 6 | 3 | 59.1 | 55.6 | 14 / 35 | 4214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 93% |
| germ.TheMind .2 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 355. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 52% | 104 |
| germ.TheMind .2 | 11 | 13% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 10% | 30 |
| qualidafial.MajorDick 1.0.1 | 7 | 8% | 11 |
| awesomeness.Elite 1.0 | 5 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.6 | 155 / 210 | 2.02 | 20.0% | 30908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.0% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 12.9% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 5 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 7 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.3% | 2 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 4 |
| stelo.PatternRobot 1.0 | 7.8 | 8.2% | 12 |
| spinnercat.Omen 1.0 | 8.2 | 7.9% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 24 / 35 | 4765 |
| 2 | 1 | 71.3 | 93.0 | 27 / 35 | 5215 |
| 3 | 1 | 72.1 | 94.3 | 30 / 35 | 5303 |
| 4 | 1 | 69.1 | 84.1 | 23 / 35 | 4932 |
| 5 | 1 | 71.8 | 92.7 | 28 / 35 | 5587 |
| 6 | 1 | 68.9 | 84.4 | 23 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 91% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| timmit.nano.TimDog 0.33 | 17 | 88% |
| stelo.PatternRobot 1.0 | 17 | 65% |
| ratosh.Wesco 1.4 | 10 | 80% |
| maribo.IotaCT 1.1 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 65 |
| stelo.PatternRobot 1.0 | 10 | 18% | 20 |
| timmit.nano.TimDog 0.33 | 9 | 16% | 26 |
| nz.jdc.nano.GridFu 1.0 | 8 | 15% | 51 |
| ratosh.Wesco 1.4 | 7 | 13% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| maribo.IotaCT 1.1 | 2 | 4% | 12 |
| spinnercat.Omen 1.0 | 2 | 4% | 10 |

## Melee bench: F10

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.3 | 180 / 210 | 1.51 | 22.2% | 40899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 22.2% | 180 |
| baal.nano.N 1.42 | 2.5 | 11.2% | 6 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.3% | 11 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 8.9% | 4 |
| sanja.First 0.1 | 5.7 | 8.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 0 |
| cvt.Firsty 1.0 | 8.5 | 7.1% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 95.6 | 31 / 35 | 6732 |
| 2 | 1 | 71.4 | 92.1 | 29 / 35 | 6519 |
| 3 | 1 | 73.3 | 97.8 | 32 / 35 | 7015 |
| 4 | 1 | 70.3 | 87.6 | 26 / 35 | 6560 |
| 5 | 1 | 73.6 | 98.7 | 33 / 35 | 7152 |
| 6 | 1 | 72.4 | 94.0 | 29 / 35 | 6921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 89% |
| tvv.nano.Polaris 1.2 | 37 | 95% |
| sanja.First 0.1 | 28 | 100% |
| cvt.Firsty 1.0 | 26 | 100% |
| zyx.micro.Ant 1.1 | 23 | 96% |
| Grystrion.TrackerWO 1.0 | 20 | 95% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 7 | 23% | 39 |
| Grystrion.TrackerWO 1.0 | 6 | 20% | 16 |
| zyx.micro.Ant 1.1 | 5 | 17% | 34 |
| tvv.nano.Polaris 1.2 | 4 | 13% | 56 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 7 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 5 |
| sample.RamFire 1.0 | 2 | 7% | 2 |
| sanja.First 0.1 | 1 | 3% | 23 |
| cvt.Firsty 1.0 | 1 | 3% | 21 |

## Melee bench: F11

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.7 | 81 / 210 | 3.73 | 16.0% | 32847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.5 | 16.0% | 81 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 68 |
| cs.Wren 1.0 | 3.2 | 13.1% | 23 |
| mz.Cork 0.1 | 4.2 | 10.9% | 19 |
| js.PinBall 1.6 | 4.5 | 10.9% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 2 |
| evd.X1 0.01 | 6.8 | 8.0% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 6.0% | 3 |
| donjezza.Jezza 1.0 | 8.7 | 5.7% | 1 |
| PSW.Relentless 0.1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 56.2 | 10 / 35 | 4913 |
| 2 | 1 | 64.1 | 67.6 | 15 / 35 | 5540 |
| 3 | 2 | 62.4 | 63.5 | 14 / 35 | 5239 |
| 4 | 1 | 65.9 | 74.3 | 13 / 35 | 5880 |
| 5 | 1 | 68.0 | 83.5 | 15 / 35 | 6089 |
| 6 | 1 | 64.2 | 73.0 | 14 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 61 | 64% |
| cs.Wren 1.0 | 26 | 92% |
| mz.Cork 0.1 | 8 | 75% |
| js.PinBall 1.6 | 6 | 83% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 38% | 93 |
| cs.Wren 1.0 | 19 | 15% | 35 |
| joe.ADinosaur 1.0 | 15 | 12% | 18 |
| PSW.Relentless 0.1 | 13 | 10% | 13 |
| mz.Cork 0.1 | 12 | 9% | 18 |
| evd.X1 0.01 | 12 | 9% | 13 |
| js.PinBall 1.6 | 6 | 5% | 12 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.4 | 122 / 210 | 2.94 | 17.9% | 29582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.9% | 122 |
| myl.nano.Graviton 1.10 | 2.3 | 12.6% | 29 |
| ntc.Opposite 1.5 | 3.5 | 10.7% | 7 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.8% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.5 | 9.6% | 3 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 8 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 73.0 | 18 / 35 | 4838 |
| 2 | 1 | 69.9 | 87.3 | 27 / 35 | 5621 |
| 3 | 1 | 63.0 | 68.3 | 16 / 35 | 4430 |
| 4 | 1 | 66.4 | 76.2 | 21 / 35 | 4978 |
| 5 | 1 | 66.8 | 81.0 | 20 / 35 | 4710 |
| 6 | 1 | 68.2 | 84.8 | 20 / 35 | 5005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 78% |
| myl.nano.Graviton 1.10 | 35 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 86% |
| DBall.NUKE 0.1 | 13 | 100% |
| ntc.Opposite 1.5 | 10 | 100% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 21 | 24% | 47 |
| myl.nano.Graviton 1.10 | 15 | 17% | 50 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 26 |
| disan.Chair 2.2.0 | 10 | 11% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 9% | 15 |
| ntc.Opposite 1.5 | 8 | 9% | 15 |
| DBall.NUKE 0.1 | 5 | 6% | 17 |
| donjezza.Muncho 1.0 | 3 | 3% | 10 |
| pbg.R2D2 1.0 | 3 | 3% | 7 |

## Melee bench: F13

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.9 | 70 / 210 | 3.80 | 14.9% | 26041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.7 | 14.9% | 70 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 49 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 13.0% | 29 |
| yagami.Tidus 0.11 | 4.8 | 11.8% | 16 |
| ejb.Polaris 1.0.1 | 5.7 | 11.1% | 8 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.5 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 66.3 | 8 / 35 | 4272 |
| 2 | 1 | 64.7 | 74.3 | 12 / 35 | 4572 |
| 3 | 3 | 60.3 | 59.4 | 8 / 35 | 4261 |
| 4 | 1 | 65.1 | 73.0 | 17 / 35 | 4380 |
| 5 | 1 | 64.8 | 75.9 | 16 / 35 | 4054 |
| 6 | 2 | 62.4 | 64.4 | 9 / 35 | 4502 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 28 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 68% |
| oog.melee.Capulet 1.2 | 22 | 55% |
| yagami.Tidus 0.11 | 11 | 82% |
| ejb.Polaris 1.0.1 | 8 | 75% |

Hadur died in 140 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 73 | 52% | 87 |
| yagami.Tidus 0.11 | 18 | 13% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 36 |
| ejb.Polaris 1.0.1 | 12 | 9% | 18 |
| kawigi.micro.Shiz 1.1 | 8 | 6% | 31 |
| kurios.DOSexe .9a | 7 | 5% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.6 | 135 / 210 | 2.84 | 17.8% | 28804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.8% | 135 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 17 |
| wompi.Quokka 1.6 | 3.2 | 11.7% | 13 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 23 |
| ratosh.Nobo 0.21 | 5.2 | 10.3% | 7 |
| m3thos.Eva00 1.1 | 5.5 | 9.7% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.8 | 19 / 35 | 4517 |
| 2 | 1 | 69.0 | 86.7 | 27 / 35 | 4901 |
| 3 | 1 | 65.9 | 78.1 | 21 / 35 | 4522 |
| 4 | 1 | 66.8 | 80.0 | 24 / 35 | 4969 |
| 5 | 1 | 66.5 | 75.9 | 22 / 35 | 4902 |
| 6 | 1 | 66.9 | 79.0 | 22 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 93% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 14 | 79% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| m3thos.Eva00 1.1 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 22% | 65 |
| maribo.FollowFire 1 | 10 | 13% | 10 |
| ratosh.Nobo 0.21 | 9 | 12% | 22 |
| wompi.Quokka 1.6 | 8 | 10% | 26 |
| bayen.UbaMicro 1.4 | 8 | 10% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 11 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 10 |
| wee.Gem 1.8.4 | 5 | 6% | 38 |
| m3thos.Eva00 1.1 | 5 | 6% | 12 |

## Melee bench: F15

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.4 | 127 / 210 | 2.14 | 21.2% | 46628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.2% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 16 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 7 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 79.7 | 17 / 35 | 7954 |
| 2 | 1 | 71.7 | 85.7 | 16 / 35 | 7880 |
| 3 | 1 | 73.5 | 94.3 | 29 / 35 | 7541 |
| 4 | 1 | 72.9 | 90.2 | 21 / 35 | 7879 |
| 5 | 1 | 73.0 | 89.5 | 23 / 35 | 8081 |
| 6 | 1 | 71.5 | 84.8 | 21 / 35 | 7293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 81% |
| ayk.WallHugger 1.0 | 14 | 100% |
| mz.NanoGod 2.02 | 14 | 50% |
| exauge.GateKeeper 1.1.121g | 11 | 64% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 46% | 131 |
| mz.NanoGod 2.02 | 28 | 33% | 45 |
| exauge.GateKeeper 1.1.121g | 9 | 11% | 13 |
| ayk.WallHugger 1.0 | 7 | 8% | 14 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.2 | 106 / 210 | 3.23 | 17.1% | 30678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 17.1% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.5% | 22 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 20 |
| bvh.micro.Freya 0.3 | 3.3 | 11.4% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.1% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 4 |
| conscience.Electron 1.3g | 7.3 | 8.1% | 1 |
| dl.BetterWalls 1.0 | 8.0 | 7.1% | 3 |
| ap.Frederick 1.1 | 8.0 | 7.4% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.7 | 17 / 35 | 5011 |
| 2 | 1 | 65.4 | 74.9 | 17 / 35 | 5323 |
| 3 | 1 | 66.8 | 78.4 | 18 / 35 | 5256 |
| 4 | 1 | 65.9 | 77.8 | 18 / 35 | 5249 |
| 5 | 1 | 65.4 | 74.3 | 18 / 35 | 5142 |
| 6 | 1 | 65.0 | 73.3 | 18 / 35 | 4697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 84% |
| dummy.micro.Sparrow 2.5 | 23 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 71% |
| bvh.micro.Freya 0.3 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 10 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 19% | 40 |
| dummy.micro.Sparrow 2.5 | 19 | 18% | 40 |
| voidious.micro.BlitzBat 1.05 | 16 | 15% | 52 |
| conscience.Electron 1.3g | 16 | 15% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 12 |
| dl.BetterWalls 1.0 | 10 | 10% | 14 |
| bvh.micro.Freya 0.3 | 8 | 8% | 19 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 15 |

## Melee bench: F17

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.4 | 149 / 210 | 1.95 | 21.7% | 42934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.7% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 24 |
| sul.Lunar 1.1 | 3.0 | 12.0% | 19 |
| supersample.SuperBoxBot 1.0 | 4.3 | 9.8% | 5 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.9% | 0 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.8% | 0 |
| sample.Corners 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 83.8 | 26 / 35 | 7193 |
| 2 | 1 | 72.8 | 91.4 | 26 / 35 | 7305 |
| 3 | 1 | 70.7 | 87.3 | 19 / 35 | 6975 |
| 4 | 1 | 72.3 | 90.2 | 25 / 35 | 7284 |
| 5 | 1 | 71.9 | 87.3 | 25 / 35 | 7004 |
| 6 | 1 | 73.6 | 96.5 | 28 / 35 | 7173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 57 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 50 | 84% |
| supersample.SuperBoxBot 1.0 | 24 | 88% |
| dsw.StaticD 1.0 | 12 | 50% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 36% | 75 |
| dsw.StaticD 1.0 | 16 | 26% | 24 |
| supersample.SuperBoxBot 1.0 | 14 | 23% | 23 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 15 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 5 |
| sul.Lunar 1.1 | 1 | 2% | 53 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.7 | 115 / 210 | 2.82 | 18.3% | 38132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.3% | 115 |
| radnor.DoctorBob 1.42 | 2.7 | 12.8% | 19 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 22 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.2% | 10 |
| amz.NanoClone 1.41 | 5.8 | 9.8% | 11 |
| sample.Walls 1.0 | 7.2 | 7.8% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 7.1% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.3% | 4 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.4 | 21 / 35 | 6603 |
| 2 | 1 | 70.4 | 87.3 | 24 / 35 | 7109 |
| 3 | 1 | 63.8 | 70.5 | 12 / 35 | 5699 |
| 4 | 1 | 67.7 | 78.7 | 19 / 35 | 6378 |
| 5 | 1 | 67.0 | 77.1 | 17 / 35 | 6414 |
| 6 | 1 | 67.4 | 79.4 | 22 / 35 | 5929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 90% |
| radnor.DoctorBob 1.42 | 25 | 88% |
| mld.Wisdom 1.0 | 18 | 61% |
| jangs.ns51 1.0 | 13 | 92% |
| amz.NanoClone 1.41 | 11 | 82% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 31 | 33% | 41 |
| radnor.DoctorBob 1.42 | 24 | 25% | 56 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 9% | 46 |
| amz.NanoClone 1.41 | 7 | 7% | 11 |
| GarmBox.Oranges 1.0 | 6 | 6% | 9 |
| jangs.ns51 1.0 | 4 | 4% | 11 |
| sample.Walls 1.0 | 1 | 1% | 9 |

