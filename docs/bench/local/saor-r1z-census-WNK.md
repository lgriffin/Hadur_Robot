# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.5 | 143 / 210 | 2.04 | 20.9% | 42396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.9% | 143 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 24 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 18 |
| mld.Infinity 2.2 | 4.2 | 12.5% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 8 |
| sample.Walls 1.0 | 6.3 | 7.1% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.1 | 28 / 35 | 6719 |
| 2 | 1 | 71.7 | 88.3 | 24 / 35 | 7132 |
| 3 | 1 | 72.2 | 90.8 | 26 / 35 | 6985 |
| 4 | 1 | 71.9 | 89.2 | 21 / 35 | 7384 |
| 5 | 1 | 69.4 | 81.0 | 21 / 35 | 6489 |
| 6 | 1 | 72.5 | 89.5 | 23 / 35 | 7687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 78 | 90% |
| radnor.DoctorBob 1.42 | 43 | 79% |
| mld.Infinity 2.2 | 28 | 89% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 34% | 64 |
| mz.AntiGrav 1.0 | 21 | 31% | 70 |
| amz.NanoClone 1.41 | 10 | 15% | 18 |
| mld.Infinity 2.2 | 9 | 13% | 39 |
| GarmBox.Oranges 1.0 | 2 | 3% | 5 |
| sample.Walls 1.0 | 1 | 1% | 8 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.9 | 129 / 210 | 2.09 | 19.0% | 32681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 19.0% | 129 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.5% | 44 |
| mld.DustBunny 3.8 | 3.0 | 12.4% | 15 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 5 |
| zyx.nano.Ant 1.1 | 6.0 | 8.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.8% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.4% | 10 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 25 / 35 | 5052 |
| 2 | 1 | 69.6 | 89.5 | 21 / 35 | 6033 |
| 3 | 1 | 68.4 | 87.3 | 22 / 35 | 5587 |
| 4 | 1 | 69.0 | 91.4 | 22 / 35 | 5220 |
| 5 | 1 | 69.1 | 88.6 | 23 / 35 | 5410 |
| 6 | 1 | 67.9 | 86.7 | 16 / 35 | 5379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 79% |
| mld.DustBunny 3.8 | 43 | 93% |
| djdjdj.NanoSkunk10 1.0 | 16 | 100% |
| maribo.melee.BMV 0.1 | 14 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 41% | 78 |
| mld.DustBunny 3.8 | 20 | 25% | 57 |
| maribo.melee.BMV 0.1 | 9 | 11% | 17 |
| fullsail.SweetTea 1.1 | 6 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| zyx.nano.Ant 1.1 | 5 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 19 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 78.8 | 109 / 210 | 2.91 | 18.4% | 35429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.4% | 109 |
| myl.micro.Troodon 1.10 | 2.0 | 15.8% | 56 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.4% | 6 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.9% | 10 |
| fm.mammillarias 1.3 | 5.0 | 10.0% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 10.4% | 19 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.1% | 3 |
| sample.Fire 1.0 | 9.2 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 72.7 | 14 / 35 | 5810 |
| 2 | 1 | 67.9 | 78.1 | 19 / 35 | 6013 |
| 3 | 1 | 69.8 | 83.8 | 23 / 35 | 6108 |
| 4 | 1 | 69.8 | 83.8 | 19 / 35 | 6392 |
| 5 | 1 | 67.0 | 76.8 | 16 / 35 | 5662 |
| 6 | 1 | 66.9 | 77.5 | 18 / 35 | 5444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 86% |
| cb.nano.Insomnia 1.0 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| myl.nano.KomoriNinja 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| fm.mammillarias 1.3 | 31 | 31% | 36 |
| myl.micro.Troodon 1.10 | 28 | 28% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 18% | 36 |
| cb.nano.Insomnia 1.0 | 13 | 13% | 18 |
| myl.nano.KomoriNinja 1.1 | 5 | 5% | 19 |
| sample.Fire 1.0 | 4 | 4% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 18 |
| cs.sheldor.Talon 1.1 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 82.5 | 122 / 210 | 2.57 | 19.3% | 38033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 19.3% | 122 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 25 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.6% | 25 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 8.5% | 3 |
| yk.JahMicro 1.0 | 6.3 | 8.4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 7.6% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.4 | 19 / 35 | 6602 |
| 2 | 1 | 69.7 | 88.3 | 23 / 35 | 5999 |
| 3 | 1 | 69.7 | 83.5 | 23 / 35 | 6603 |
| 4 | 1 | 67.1 | 77.8 | 16 / 35 | 6069 |
| 5 | 1 | 68.7 | 82.9 | 21 / 35 | 6178 |
| 6 | 1 | 68.2 | 78.4 | 20 / 35 | 6582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 86% |
| stelo.SoJNanoMelee 1.1 | 39 | 85% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| yk.JahMicro 1.0 | 8 | 100% |
| tj.zombie1n 1.0.1 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 42% | 81 |
| stelo.SoJNanoMelee 1.1 | 18 | 20% | 44 |
| tvv.micro.Antares 1.1.1 | 10 | 11% | 28 |
| repositorio.NanoStep 1.0 | 6 | 7% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 6% | 10 |
| tj.zombie1n 1.0.1 | 5 | 6% | 6 |
| yk.JahMicro 1.0 | 4 | 5% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 16 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 71.0 | 76 / 210 | 3.61 | 15.9% | 30291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 15.9% | 76 |
| oog.melee.Corsair 1.0 | 2.8 | 12.3% | 32 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 11.7% | 30 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 38 |
| sam.Samspin 1.0 | 5.5 | 10.0% | 12 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 9.0% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 70.2 | 10 / 35 | 4998 |
| 2 | 1 | 64.9 | 74.0 | 15 / 35 | 5049 |
| 3 | 1 | 63.2 | 70.8 | 12 / 35 | 4916 |
| 4 | 1 | 64.1 | 72.1 | 14 / 35 | 5283 |
| 5 | 1 | 63.0 | 68.9 | 11 / 35 | 5190 |
| 6 | 1 | 63.4 | 70.2 | 14 / 35 | 4855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 34 | 88% |
| oog.melee.Corsair 1.0 | 27 | 56% |
| ahf.NanoAndrew .4 | 15 | 33% |
| sam.Samspin 1.0 | 10 | 80% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 29 | 22% | 31 |
| oog.melee.Corsair 1.0 | 21 | 16% | 40 |
| ahf.NanoAndrew .4 | 20 | 15% | 27 |
| zyx.nano.BacillusComma 1.0 | 14 | 10% | 16 |
| EBBU.Sim2 1.02 | 13 | 10% | 21 |
| sam.Samspin 1.0 | 12 | 9% | 20 |
| simonton.nano.MeleeSeed 1.8 | 11 | 8% | 37 |
| sample.TrackFire 1.0 | 7 | 5% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 5% | 8 |

## Melee bench: F06

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.7 | 121 / 210 | 2.47 | 18.5% | 32064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.5% | 121 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 40 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.4% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 25 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.1% | 2 |
| fm.claire 1.7 | 5.8 | 8.4% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.3% | 2 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 3 |
| pa.Improved 1.0 | 9.2 | 6.1% | 4 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.9 | 21 / 35 | 5426 |
| 2 | 1 | 68.1 | 87.3 | 19 / 35 | 5195 |
| 3 | 1 | 69.7 | 90.5 | 23 / 35 | 5660 |
| 4 | 1 | 64.9 | 75.9 | 13 / 35 | 5067 |
| 5 | 1 | 67.5 | 81.6 | 22 / 35 | 5529 |
| 6 | 1 | 68.3 | 85.1 | 23 / 35 | 5187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 77% |
| oog.melee.CapuletDroid 1.1 | 33 | 91% |
| arthord.NanoSatanMelee Beta | 17 | 100% |
| gh.nano.Grofvuil 0.2 | 15 | 93% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 67% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 32% | 69 |
| arthord.NanoSatanMelee Beta | 15 | 17% | 24 |
| oog.melee.CapuletDroid 1.1 | 12 | 13% | 44 |
| gh.nano.Grofvuil 0.2 | 9 | 10% | 26 |
| sample.SpinBot 1.0 | 9 | 10% | 12 |
| fm.claire 1.7 | 8 | 9% | 12 |
| kurios.DOSexe .9b | 4 | 4% | 9 |
| pa.Improved 1.0 | 3 | 3% | 9 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.2 | 80 / 210 | 3.14 | 16.7% | 32737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.7% | 80 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.2% | 51 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.1% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 35 |
| DBall.Anarchy 0.1 | 5.7 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.8% | 0 |
| acogdev.alpha 0.2 | 7.3 | 7.0% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 71.7 | 9 / 35 | 5358 |
| 2 | 1 | 64.6 | 73.3 | 12 / 35 | 5407 |
| 3 | 1 | 66.2 | 77.8 | 13 / 35 | 5728 |
| 4 | 1 | 66.1 | 76.5 | 16 / 35 | 5550 |
| 5 | 1 | 64.4 | 73.7 | 14 / 35 | 4988 |
| 6 | 1 | 67.7 | 84.1 | 16 / 35 | 5706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 87% |
| mz.MicroGodMelee 1 | 27 | 56% |
| gh.micro.Gruweltje 0.7 | 23 | 61% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| acogdev.alpha 0.2 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 30% | 64 |
| gh.micro.Gruweltje 0.7 | 34 | 26% | 52 |
| mz.MicroGodMelee 1 | 30 | 23% | 46 |
| acogdev.alpha 0.2 | 12 | 9% | 17 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 3 | 2% | 10 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.8 | 87 / 210 | 3.72 | 15.9% | 32056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.3 | 15.9% | 87 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.3% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 36 |
| germ.TheMind .2 | 4.5 | 10.3% | 11 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.7% | 4 |
| awesomeness.Elite 1.0 | 7.3 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.8 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 73.7 | 15 / 35 | 5804 |
| 2 | 2 | 63.7 | 70.8 | 14 / 35 | 5071 |
| 3 | 1 | 64.5 | 71.4 | 17 / 35 | 4967 |
| 4 | 1 | 65.6 | 71.1 | 16 / 35 | 5887 |
| 5 | 1 | 64.5 | 74.0 | 12 / 35 | 5284 |
| 6 | 2 | 60.1 | 57.8 | 13 / 35 | 5043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 56% |
| germ.TheMind .2 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 123 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 30% | 82 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 20% | 34 |
| germ.TheMind .2 | 20 | 16% | 30 |
| stelo.UntouchableNano 1.3 | 15 | 12% | 20 |
| qualidafial.MajorDick 1.0.1 | 10 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 9 |
| awesomeness.Elite 1.0 | 6 | 5% | 11 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.7 | 122 / 210 | 2.65 | 18.2% | 29257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.2% | 122 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.0% | 9 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.3% | 15 |
| maribo.IotaCT 1.1 | 4.8 | 10.8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 7.8% | 10 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.0 | 20 / 35 | 4722 |
| 2 | 1 | 70.6 | 90.2 | 25 / 35 | 5084 |
| 3 | 1 | 65.7 | 74.3 | 17 / 35 | 4478 |
| 4 | 1 | 66.5 | 77.8 | 16 / 35 | 4756 |
| 5 | 1 | 69.4 | 83.8 | 22 / 35 | 5470 |
| 6 | 1 | 68.8 | 84.1 | 22 / 35 | 4747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 92% |
| nz.jdc.nano.GridFu 1.0 | 23 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 67% |
| maribo.IotaCT 1.1 | 7 | 86% |
| ratosh.Wesco 1.4 | 7 | 86% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 23 | 26% | 26 |
| rz.HawkOnFire 0.1 | 18 | 20% | 62 |
| timmit.nano.TimDog 0.33 | 15 | 17% | 28 |
| ratosh.Wesco 1.4 | 15 | 17% | 24 |
| nz.jdc.nano.GridFu 1.0 | 8 | 9% | 38 |
| maribo.IotaCT 1.1 | 4 | 5% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.3 | 152 / 210 | 2.06 | 20.5% | 38528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.5% | 152 |
| baal.nano.N 1.42 | 2.2 | 12.4% | 11 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.6% | 15 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.0 | 9.9% | 15 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.5% | 3 |
| sanja.First 0.1 | 7.2 | 7.9% | 6 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 3 |
| cvt.Firsty 1.0 | 8.2 | 7.1% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.0 | 25 / 35 | 6422 |
| 2 | 1 | 67.9 | 81.9 | 23 / 35 | 5616 |
| 3 | 1 | 69.9 | 87.6 | 24 / 35 | 6109 |
| 4 | 1 | 69.5 | 87.3 | 23 / 35 | 6097 |
| 5 | 1 | 71.6 | 91.1 | 28 / 35 | 7068 |
| 6 | 1 | 72.4 | 94.6 | 29 / 35 | 7216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 34 | 88% |
| tvv.nano.Polaris 1.2 | 32 | 81% |
| sanja.First 0.1 | 21 | 86% |
| cvt.Firsty 1.0 | 21 | 95% |
| zyx.micro.Ant 1.1 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 16 | 94% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 29% | 43 |
| tvv.nano.Polaris 1.2 | 12 | 21% | 46 |
| baal.nano.N 1.42 | 8 | 14% | 37 |
| Grystrion.TrackerWO 1.0 | 8 | 14% | 18 |
| cvt.Firsty 1.0 | 5 | 9% | 21 |
| sanja.First 0.1 | 4 | 7% | 24 |
| sample.RamFire 1.0 | 2 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |

## Melee bench: F11

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.2 | 83 / 210 | 3.77 | 15.9% | 32620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.5 | 15.9% | 83 |
| kc.micro.Figment 1.0 | 1.5 | 15.7% | 67 |
| cs.Wren 1.0 | 3.3 | 12.3% | 21 |
| js.PinBall 1.6 | 4.0 | 11.5% | 14 |
| mz.Cork 0.1 | 4.8 | 10.7% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 3 |
| evd.X1 0.01 | 6.8 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.7 | 17 / 35 | 6154 |
| 2 | 2 | 61.0 | 58.1 | 15 / 35 | 5000 |
| 3 | 1 | 66.2 | 77.5 | 12 / 35 | 5824 |
| 4 | 2 | 62.1 | 63.8 | 13 / 35 | 5163 |
| 5 | 2 | 61.9 | 62.9 | 11 / 35 | 5057 |
| 6 | 1 | 65.4 | 74.3 | 15 / 35 | 5422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 70% |
| cs.Wren 1.0 | 23 | 74% |
| js.PinBall 1.6 | 11 | 91% |
| mz.Cork 0.1 | 5 | 60% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 39% | 102 |
| evd.X1 0.01 | 21 | 16% | 22 |
| cs.Wren 1.0 | 17 | 13% | 28 |
| js.PinBall 1.6 | 11 | 9% | 18 |
| joe.ADinosaur 1.0 | 11 | 9% | 12 |
| mz.Cork 0.1 | 10 | 8% | 16 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.2 | 116 / 210 | 2.78 | 18.0% | 30108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.0% | 116 |
| myl.nano.Graviton 1.10 | 3.2 | 11.7% | 33 |
| ntc.Opposite 1.5 | 3.3 | 11.5% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.7% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 6 |
| DBall.NUKE 0.1 | 7.2 | 8.5% | 7 |
| disan.Chair 2.2.0 | 7.5 | 8.5% | 9 |
| donjezza.Muncho 1.0 | 9.2 | 5.7% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.1 | 23 / 35 | 4771 |
| 2 | 1 | 64.0 | 71.7 | 15 / 35 | 4753 |
| 3 | 1 | 67.4 | 81.3 | 20 / 35 | 5210 |
| 4 | 1 | 70.0 | 89.5 | 21 / 35 | 5629 |
| 5 | 1 | 67.3 | 79.7 | 19 / 35 | 5409 |
| 6 | 1 | 64.8 | 74.0 | 18 / 35 | 4336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 85% |
| myl.nano.Graviton 1.10 | 26 | 85% |
| disan.Chair 2.2.0 | 19 | 84% |
| ntc.Opposite 1.5 | 16 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| donjezza.Muncho 1.0 | 6 | 83% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 21% | 45 |
| pfvicm.Sobieski 7.2.3b | 19 | 20% | 27 |
| ntc.Opposite 1.5 | 17 | 18% | 27 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 46 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 22 |
| disan.Chair 2.2.0 | 6 | 6% | 19 |
| pbg.R2D2 1.0 | 5 | 5% | 5 |
| DBall.NUKE 0.1 | 4 | 4% | 14 |
| donjezza.Muncho 1.0 | 2 | 2% | 4 |

## Melee bench: F13

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.6 | 53 / 210 | 3.92 | 14.5% | 25973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 2.0 | 14.5% | 53 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.6% | 51 |
| oog.melee.Capulet 1.2 | 2.5 | 13.6% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.3% | 26 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 60.3 | 6 / 35 | 4337 |
| 2 | 2 | 64.0 | 72.1 | 9 / 35 | 4406 |
| 3 | 1 | 63.2 | 69.5 | 11 / 35 | 4431 |
| 4 | 1 | 63.9 | 70.2 | 12 / 35 | 4538 |
| 5 | 1 | 64.8 | 77.5 | 9 / 35 | 4436 |
| 6 | 4 | 57.8 | 55.9 | 6 / 35 | 3825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 88% |
| oog.melee.Capulet 1.2 | 17 | 47% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 69% |
| yagami.Tidus 0.11 | 9 | 78% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| step.nanoPri 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 52 | 33% | 67 |
| yagami.Tidus 0.11 | 33 | 21% | 40 |
| kawigi.micro.Shiz 1.1 | 21 | 13% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 12% | 31 |
| ejb.Polaris 1.0.1 | 13 | 8% | 17 |
| step.nanoPri 1.0 | 9 | 6% | 11 |
| stelo.MirrorNano 1.3 | 8 | 5% | 8 |
| kurios.DOSexe .9a | 2 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.5 | 128 / 210 | 2.84 | 17.5% | 27969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 17.5% | 128 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 18 |
| wee.Gem 1.8.4 | 2.8 | 12.0% | 32 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 12 |
| ratosh.Nobo 0.21 | 4.7 | 10.8% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 8.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 77.1 | 20 / 35 | 4494 |
| 2 | 1 | 67.6 | 81.9 | 26 / 35 | 4795 |
| 3 | 1 | 67.6 | 83.8 | 22 / 35 | 4973 |
| 4 | 1 | 63.5 | 72.1 | 18 / 35 | 4295 |
| 5 | 1 | 67.2 | 82.5 | 21 / 35 | 5009 |
| 6 | 1 | 66.2 | 79.7 | 21 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 94% |
| wee.Gem 1.8.4 | 33 | 100% |
| wompi.Quokka 1.6 | 24 | 96% |
| m3thos.Eva00 1.1 | 13 | 77% |
| ratosh.Nobo 0.21 | 12 | 92% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 17% | 60 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 14% | 16 |
| stelo.MyAgileRobot 0.2 | 12 | 14% | 13 |
| wee.Gem 1.8.4 | 11 | 13% | 47 |
| ratosh.Nobo 0.21 | 9 | 11% | 20 |
| m3thos.Eva00 1.1 | 8 | 10% | 14 |
| wompi.Quokka 1.6 | 6 | 7% | 22 |
| maribo.FollowFire 1 | 6 | 7% | 5 |
| bayen.UbaMicro 1.4 | 5 | 6% | 12 |

## Melee bench: F15

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 87.6 | 131 / 210 | 2.11 | 21.2% | 46723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 21.2% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.4% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 18 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 4.7 | 9.8% | 0 |
| stuff.Vlad 0.1 | 6.2 | 8.1% | 2 |
| stelo.PianistNano 1.2 | 6.7 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.6 | 22 / 35 | 7565 |
| 2 | 1 | 73.1 | 90.8 | 24 / 35 | 8032 |
| 3 | 1 | 70.8 | 79.7 | 16 / 35 | 7669 |
| 4 | 1 | 73.0 | 89.8 | 22 / 35 | 8249 |
| 5 | 1 | 72.8 | 89.8 | 26 / 35 | 7751 |
| 6 | 1 | 72.1 | 87.0 | 21 / 35 | 7457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 82% |
| mz.NanoGod 2.02 | 20 | 60% |
| exauge.GateKeeper 1.1.121g | 19 | 89% |
| ayk.WallHugger 1.0 | 9 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 42% | 121 |
| mz.NanoGod 2.02 | 24 | 30% | 42 |
| exauge.GateKeeper 1.1.121g | 10 | 13% | 20 |
| ayk.WallHugger 1.0 | 5 | 6% | 13 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 3 | 4% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.2 | 113 / 210 | 3.50 | 16.3% | 28557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.3% | 113 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.8% | 24 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 24 |
| bvh.micro.Freya 0.3 | 3.7 | 11.6% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 14 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 3 |
| conscience.Electron 1.3g | 6.8 | 8.5% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.5% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 70.5 | 14 / 35 | 4335 |
| 2 | 1 | 65.0 | 72.1 | 20 / 35 | 4905 |
| 3 | 1 | 62.9 | 69.8 | 18 / 35 | 4138 |
| 4 | 1 | 67.0 | 79.0 | 22 / 35 | 5307 |
| 5 | 1 | 64.2 | 70.2 | 20 / 35 | 4848 |
| 6 | 1 | 64.8 | 71.7 | 19 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 36 | 92% |
| voidious.micro.BlitzBat 1.05 | 31 | 94% |
| dummy.micro.Sparrow 2.5 | 28 | 93% |
| bvh.micro.Freya 0.3 | 18 | 72% |
| ap.Frederick 1.1 | 8 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 16 | 16% | 25 |
| conscience.Electron 1.3g | 16 | 16% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 48 |
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 41 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 38 |
| dl.BetterWalls 1.0 | 6 | 6% | 9 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.8 | 134 / 210 | 2.28 | 20.5% | 41889 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.5% | 134 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.2% | 27 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 12 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.1% | 19 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.5% | 2 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 7 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 0 |
| sample.Corners 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.6 | 19 / 35 | 7096 |
| 2 | 1 | 72.1 | 91.4 | 27 / 35 | 7177 |
| 3 | 1 | 69.8 | 80.6 | 24 / 35 | 7076 |
| 4 | 1 | 72.6 | 91.1 | 26 / 35 | 7734 |
| 5 | 1 | 68.8 | 77.8 | 17 / 35 | 7094 |
| 6 | 1 | 68.8 | 86.0 | 21 / 35 | 5712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 42 | 83% |
| supersample.SuperBoxBot 1.0 | 26 | 77% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 42% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 27% | 62 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 14 |
| dsw.StaticD 1.0 | 5 | 6% | 10 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 13 |
| sul.Lunar 1.1 | 3 | 4% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 13 |
| sample.Corners 1.0 | 2 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.7 | 92 / 210 | 3.28 | 16.9% | 34959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.9% | 92 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 37 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.6% | 28 |
| mld.Wisdom 1.0 | 3.5 | 12.3% | 31 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.4% | 6 |
| amz.NanoClone 1.41 | 5.7 | 9.7% | 10 |
| sample.Walls 1.0 | 7.0 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 20 / 35 | 6440 |
| 2 | 1 | 64.9 | 73.7 | 15 / 35 | 5588 |
| 3 | 1 | 62.5 | 67.3 | 12 / 35 | 5220 |
| 4 | 1 | 64.9 | 70.2 | 15 / 35 | 6013 |
| 5 | 1 | 66.6 | 74.9 | 18 / 35 | 6005 |
| 6 | 1 | 65.6 | 76.2 | 12 / 35 | 5693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 81% |
| radnor.DoctorBob 1.42 | 26 | 81% |
| mld.Wisdom 1.0 | 19 | 63% |
| amz.NanoClone 1.41 | 10 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 39 | 33% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 21% | 57 |
| radnor.DoctorBob 1.42 | 16 | 14% | 39 |
| KiraNL.Chupacabra 0.4 | 14 | 12% | 20 |
| GarmBox.Oranges 1.0 | 7 | 6% | 8 |
| jangs.ns51 1.0 | 6 | 5% | 12 |
| amz.NanoClone 1.41 | 6 | 5% | 11 |
| sample.Walls 1.0 | 5 | 4% | 9 |

