# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 54 over 6 battles (9.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.3 | 129 / 210 | 2.05 | 20.2% | 37030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.2% | 129 |
| mz.AntiGrav 1.0 | 2.7 | 14.6% | 15 |
| radnor.DoctorBob 1.42 | 2.7 | 14.6% | 33 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 24 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 4 |
| GarmBox.Oranges 1.0 | 6.3 | 7.1% | 0 |
| sample.Walls 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.3% | 4 |
| sample.Target 1.0 | 9.5 | 3.5% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.0 | 22 / 35 | 5999 |
| 2 | 1 | 70.5 | 87.9 | 19 / 35 | 6211 |
| 3 | 1 | 72.5 | 92.1 | 23 / 35 | 6907 |
| 4 | 1 | 71.7 | 92.4 | 22 / 35 | 6101 |
| 5 | 1 | 70.7 | 86.7 | 21 / 35 | 6292 |
| 6 | 1 | 69.7 | 84.8 | 22 / 35 | 5520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 93% |
| radnor.DoctorBob 1.42 | 44 | 64% |
| mld.Infinity 2.2 | 34 | 76% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 60% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 52% | 87 |
| mz.AntiGrav 1.0 | 15 | 19% | 81 |
| mld.Infinity 2.2 | 10 | 12% | 9 |
| amz.NanoClone 1.41 | 7 | 9% | 13 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| sample.Walls 1.0 | 1 | 1% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.4 | 138 / 210 | 2.40 | 18.5% | 29127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.2 | 18.5% | 138 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.2% | 48 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 10 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 8.9% | 7 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 8.0 | 6.3% | 4 |
| bzdp.BoxCar 2.0 | 8.5 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 27 / 35 | 5015 |
| 2 | 1 | 70.0 | 91.7 | 26 / 35 | 4970 |
| 3 | 1 | 69.1 | 87.0 | 25 / 35 | 4890 |
| 4 | 1 | 69.7 | 95.2 | 27 / 35 | 4554 |
| 5 | 1 | 65.9 | 80.6 | 18 / 35 | 4484 |
| 6 | 2 | 64.1 | 63.2 | 15 / 35 | 5214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 87 | 84% |
| mld.DustBunny 3.8 | 46 | 87% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 32% | 103 |
| mld.DustBunny 3.8 | 15 | 21% | 48 |
| zyx.nano.Ant 1.1 | 9 | 13% | 11 |
| djdjdj.NanoSkunk10 1.0 | 7 | 10% | 12 |
| cs.Grudge 1.0 | 6 | 8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 13 |
| fullsail.SweetTea 1.1 | 3 | 4% | 7 |
| maribo.melee.BMV 0.1 | 3 | 4% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 82.9 | 118 / 210 | 2.54 | 19.1% | 34093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.1% | 118 |
| myl.micro.Troodon 1.10 | 2.0 | 16.3% | 53 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.7% | 8 |
| cb.nano.Insomnia 1.0 | 4.5 | 10.2% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.6% | 14 |
| fm.mammillarias 1.3 | 6.2 | 8.7% | 2 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.8% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 4 |
| sample.Fire 1.0 | 9.3 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.6 | 17 / 35 | 5076 |
| 2 | 1 | 70.6 | 87.6 | 20 / 35 | 6032 |
| 3 | 1 | 67.9 | 78.1 | 21 / 35 | 5323 |
| 4 | 1 | 68.1 | 79.0 | 18 / 35 | 5967 |
| 5 | 1 | 71.0 | 89.5 | 24 / 35 | 5978 |
| 6 | 1 | 68.8 | 82.2 | 18 / 35 | 5717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 80 | 79% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 96% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 40% | 108 |
| cb.nano.Insomnia 1.0 | 18 | 20% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 12% | 16 |
| fm.mammillarias 1.3 | 10 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 13 |
| myl.nano.KomoriNinja 1.1 | 5 | 5% | 21 |
| sp.Nanos.Ember 1.1 | 5 | 5% | 16 |
| sample.Fire 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.1 | 140 / 210 | 2.34 | 19.6% | 34690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.6% | 140 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.7% | 20 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.2% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.3% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.1% | 21 |
| tj.zombie1n 1.0.1 | 5.7 | 9.0% | 8 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.8% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.2 | 23 / 35 | 6132 |
| 2 | 1 | 67.4 | 80.6 | 21 / 35 | 5235 |
| 3 | 1 | 71.0 | 91.4 | 24 / 35 | 6067 |
| 4 | 1 | 68.6 | 83.2 | 23 / 35 | 5670 |
| 5 | 1 | 69.8 | 86.0 | 24 / 35 | 6204 |
| 6 | 1 | 69.3 | 87.0 | 25 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 97% |
| stelo.SoJNanoMelee 1.1 | 25 | 64% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| yk.JahMicro 1.0 | 9 | 67% |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 25% | 96 |
| tvv.micro.Antares 1.1.1 | 17 | 24% | 33 |
| stelo.SoJNanoMelee 1.1 | 16 | 23% | 31 |
| tj.zombie1n 1.0.1 | 7 | 10% | 8 |
| yk.JahMicro 1.0 | 5 | 7% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 10 |
| repositorio.NanoStep 1.0 | 3 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.5 | 97 / 210 | 3.84 | 15.9% | 28742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 15.9% | 97 |
| oog.melee.Corsair 1.0 | 2.5 | 12.4% | 28 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 19 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 13 |
| EBBU.Sim2 1.02 | 6.0 | 9.9% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.7% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 69.8 | 17 / 35 | 4742 |
| 2 | 1 | 66.7 | 78.7 | 20 / 35 | 4966 |
| 3 | 1 | 63.9 | 69.2 | 16 / 35 | 4969 |
| 4 | 1 | 62.8 | 65.4 | 15 / 35 | 4733 |
| 5 | 1 | 62.4 | 65.1 | 18 / 35 | 4425 |
| 6 | 1 | 62.0 | 62.5 | 11 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 81% |
| oog.melee.Corsair 1.0 | 27 | 81% |
| ahf.NanoAndrew .4 | 23 | 83% |
| sam.Samspin 1.0 | 17 | 71% |
| EBBU.Sim2 1.02 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 114 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 35 | 31% | 61 |
| oog.melee.Corsair 1.0 | 19 | 17% | 40 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 11 |
| ahf.NanoAndrew .4 | 9 | 8% | 29 |
| EBBU.Sim2 1.02 | 9 | 8% | 16 |
| sam.Samspin 1.0 | 8 | 7% | 23 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 9 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.6 | 159 / 210 | 1.84 | 20.1% | 31729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.1% | 159 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 28 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.1% | 5 |
| oog.melee.CapuletDroid 1.1 | 5.2 | 9.5% | 10 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.4% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.1% | 6 |
| fm.claire 1.7 | 6.0 | 8.3% | 0 |
| pa.Improved 1.0 | 8.5 | 5.8% | 1 |
| sample.SpinBot 1.0 | 8.8 | 5.4% | 0 |
| kurios.DOSexe .9b | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.8 | 24 / 35 | 5543 |
| 2 | 1 | 69.5 | 90.2 | 24 / 35 | 5039 |
| 3 | 1 | 69.9 | 89.5 | 26 / 35 | 5166 |
| 4 | 1 | 71.4 | 94.9 | 31 / 35 | 5354 |
| 5 | 1 | 70.0 | 88.6 | 28 / 35 | 5192 |
| 6 | 1 | 70.3 | 89.8 | 26 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 88% |
| gh.nano.Grofvuil 0.2 | 33 | 97% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 40% | 101 |
| arthord.NanoSatanMelee Beta | 11 | 21% | 23 |
| oog.melee.CapuletDroid 1.1 | 6 | 11% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 9% | 15 |
| gh.nano.Grofvuil 0.2 | 4 | 8% | 45 |
| fm.claire 1.7 | 4 | 8% | 5 |
| pa.Improved 1.0 | 2 | 4% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.7 | 102 / 210 | 2.65 | 17.6% | 30091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.6% | 102 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.7% | 47 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.2% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 17 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.5 | 6.6% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.1% | 1 |
| acogdev.alpha 0.2 | 8.8 | 5.8% | 0 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.1 | 14 / 35 | 4849 |
| 2 | 1 | 66.8 | 81.6 | 16 / 35 | 5069 |
| 3 | 1 | 67.3 | 82.2 | 18 / 35 | 4833 |
| 4 | 1 | 66.8 | 80.0 | 13 / 35 | 5226 |
| 5 | 1 | 68.0 | 86.7 | 22 / 35 | 4672 |
| 6 | 1 | 68.0 | 82.5 | 19 / 35 | 5442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 63% |
| gh.micro.Gruweltje 0.7 | 48 | 58% |
| mz.MicroGodMelee 1 | 31 | 90% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 43 | 40% | 76 |
| spinnercat.micro.Tyger 0.1 | 34 | 31% | 57 |
| mz.MicroGodMelee 1 | 12 | 11% | 43 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 10 |
| acogdev.alpha 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 67.4 | 77 / 210 | 3.94 | 15.2% | 27888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.7% | 70 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 15.2% | 77 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.7% | 6 |
| germ.TheMind .2 | 5.3 | 8.9% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 5 |
| awesomeness.Elite 1.0 | 7.3 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 7 |
| sample.Crazy 1.0 | 8.2 | 7.4% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 65.7 | 10 / 35 | 4312 |
| 2 | 2 | 63.7 | 68.3 | 16 / 35 | 4620 |
| 3 | 2 | 63.7 | 71.1 | 11 / 35 | 4760 |
| 4 | 3 | 62.0 | 66.3 | 14 / 35 | 4294 |
| 5 | 1 | 63.7 | 67.9 | 12 / 35 | 5151 |
| 6 | 2 | 62.7 | 64.8 | 14 / 35 | 4751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 57% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 73% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| germ.TheMind .2 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 54% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 20% | 44 |
| germ.TheMind .2 | 8 | 6% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 6 | 5% | 10 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.8 | 134 / 210 | 2.28 | 19.0% | 28081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.0% | 134 |
| rz.HawkOnFire 0.1 | 2.0 | 14.6% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.2% | 15 |
| maribo.IotaCT 1.1 | 3.8 | 11.2% | 13 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.1% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 8.4% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.0% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 84.1 | 22 / 35 | 4766 |
| 2 | 1 | 69.1 | 85.1 | 24 / 35 | 5006 |
| 3 | 1 | 68.3 | 86.0 | 20 / 35 | 4048 |
| 4 | 1 | 72.5 | 96.8 | 31 / 35 | 5371 |
| 5 | 1 | 67.0 | 77.8 | 20 / 35 | 4497 |
| 6 | 1 | 68.2 | 84.8 | 17 / 35 | 4393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 87 | 91% |
| nz.jdc.nano.GridFu 1.0 | 30 | 87% |
| maribo.IotaCT 1.1 | 16 | 69% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 30% | 81 |
| timmit.nano.TimDog 0.33 | 14 | 18% | 25 |
| maribo.IotaCT 1.1 | 10 | 13% | 21 |
| nz.jdc.nano.GridFu 1.0 | 9 | 12% | 44 |
| stelo.PatternRobot 1.0 | 8 | 11% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 4 |
| spinnercat.Omen 1.0 | 4 | 5% | 7 |
| ratosh.Wesco 1.4 | 3 | 4% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.6 | 154 / 210 | 2.03 | 20.6% | 37444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.6% | 154 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.8% | 17 |
| baal.nano.N 1.42 | 3.0 | 11.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.5 | 10.1% | 8 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 7 |
| sanja.First 0.1 | 6.8 | 8.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 3 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.5% | 4 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 6 |
| sample.RamFire 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.0 | 29 / 35 | 6264 |
| 2 | 1 | 72.7 | 95.6 | 28 / 35 | 6848 |
| 3 | 1 | 69.7 | 85.4 | 25 / 35 | 6105 |
| 4 | 1 | 70.5 | 86.3 | 23 / 35 | 6636 |
| 5 | 1 | 69.1 | 83.8 | 23 / 35 | 5994 |
| 6 | 1 | 69.8 | 87.3 | 26 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 88% |
| baal.nano.N 1.42 | 36 | 97% |
| cvt.Firsty 1.0 | 23 | 96% |
| zyx.micro.Ant 1.1 | 21 | 90% |
| amk.Punbot.Punbot 0.01 | 18 | 94% |
| sanja.First 0.1 | 15 | 93% |
| Grystrion.TrackerWO 1.0 | 11 | 82% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 27% | 36 |
| tvv.nano.Polaris 1.2 | 14 | 25% | 64 |
| baal.nano.N 1.42 | 8 | 14% | 32 |
| sanja.First 0.1 | 5 | 9% | 26 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 9 |
| amk.Punbot.Punbot 0.01 | 4 | 7% | 10 |
| cvt.Firsty 1.0 | 3 | 5% | 17 |
| sample.RamFire 1.0 | 2 | 4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |

## Melee bench: F11

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 68.1 | 61 / 210 | 3.87 | 14.6% | 27743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.7% | 101 |
| hadur117.micro.SaorOG3 0.1 | 1.8 | 14.6% | 61 |
| cs.Wren 1.0 | 3.7 | 12.1% | 13 |
| js.PinBall 1.6 | 3.8 | 11.5% | 11 |
| mz.Cork 0.1 | 4.8 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 8.6% | 5 |
| evd.X1 0.01 | 7.0 | 7.6% | 2 |
| jsal.Jsalbot 1.0 | 7.5 | 7.3% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 6.2% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 60.6 | 6 / 35 | 4246 |
| 2 | 2 | 63.8 | 69.5 | 18 / 35 | 4882 |
| 3 | 1 | 62.7 | 71.7 | 11 / 35 | 4527 |
| 4 | 2 | 63.9 | 72.4 | 12 / 35 | 4972 |
| 5 | 2 | 61.8 | 67.6 | 6 / 35 | 4836 |
| 6 | 2 | 60.5 | 66.7 | 8 / 35 | 4280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 75 | 28% |
| cs.Wren 1.0 | 21 | 95% |
| js.PinBall 1.6 | 7 | 86% |
| mz.Cork 0.1 | 7 | 86% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 92 | 61% | 115 |
| js.PinBall 1.6 | 14 | 9% | 23 |
| evd.X1 0.01 | 13 | 9% | 14 |
| cs.Wren 1.0 | 11 | 7% | 26 |
| mz.Cork 0.1 | 7 | 5% | 15 |
| PSW.Relentless 0.1 | 7 | 5% | 7 |
| joe.ADinosaur 1.0 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 1% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.4 | 117 / 210 | 2.76 | 18.0% | 28364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.0% | 117 |
| myl.nano.Graviton 1.10 | 3.3 | 11.4% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.9% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.9% | 27 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.4% | 7 |
| ntc.Opposite 1.5 | 4.8 | 10.4% | 9 |
| disan.Chair 2.2.0 | 6.8 | 8.9% | 7 |
| DBall.NUKE 0.1 | 7.3 | 7.9% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.3 | 22 / 35 | 4947 |
| 2 | 1 | 66.5 | 77.1 | 19 / 35 | 4815 |
| 3 | 1 | 65.3 | 76.5 | 14 / 35 | 4909 |
| 4 | 1 | 67.2 | 77.8 | 18 / 35 | 5008 |
| 5 | 1 | 67.8 | 87.6 | 22 / 35 | 4289 |
| 6 | 1 | 67.2 | 83.2 | 22 / 35 | 4396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 60% |
| myl.nano.Graviton 1.10 | 30 | 83% |
| disan.Chair 2.2.0 | 21 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 88% |
| ntc.Opposite 1.5 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 12 | 75% |
| DBall.NUKE 0.1 | 11 | 91% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 27 | 28% | 45 |
| pfvicm.Sobieski 7.2.3b | 22 | 23% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 14% | 31 |
| myl.nano.Graviton 1.10 | 12 | 13% | 32 |
| ntc.Opposite 1.5 | 11 | 12% | 22 |
| DBall.NUKE 0.1 | 4 | 4% | 21 |
| disan.Chair 2.2.0 | 3 | 3% | 15 |
| donjezza.Muncho 1.0 | 1 | 1% | 7 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.4 | 99 / 210 | 3.30 | 16.1% | 24948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 16.1% | 99 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.6% | 44 |
| oog.melee.Capulet 1.2 | 3.3 | 13.5% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 19 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.2 | 17 / 35 | 4395 |
| 2 | 1 | 66.1 | 79.4 | 18 / 35 | 3977 |
| 3 | 1 | 65.4 | 74.6 | 16 / 35 | 4024 |
| 4 | 1 | 65.1 | 75.9 | 16 / 35 | 4050 |
| 5 | 1 | 62.8 | 67.3 | 16 / 35 | 3845 |
| 6 | 1 | 66.1 | 74.0 | 16 / 35 | 4657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 38 | 79% |
| oog.melee.Capulet 1.2 | 35 | 77% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 93% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 34% | 66 |
| yagami.Tidus 0.11 | 22 | 20% | 41 |
| kawigi.micro.Shiz 1.1 | 22 | 20% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 45 |
| ejb.Polaris 1.0.1 | 10 | 9% | 14 |
| kurios.DOSexe .9a | 4 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.1 | 132 / 210 | 2.97 | 17.2% | 25372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.2% | 132 |
| wee.Gem 1.8.4 | 2.7 | 12.1% | 32 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 21 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 10 |
| ratosh.Nobo 0.21 | 4.8 | 10.7% | 5 |
| m3thos.Eva00 1.1 | 5.8 | 10.1% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.1% | 1 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.6 | 24 / 35 | 4495 |
| 2 | 1 | 65.8 | 79.4 | 20 / 35 | 4264 |
| 3 | 1 | 66.7 | 78.1 | 23 / 35 | 4657 |
| 4 | 1 | 64.2 | 72.7 | 17 / 35 | 4004 |
| 5 | 1 | 62.5 | 69.2 | 20 / 35 | 3534 |
| 6 | 1 | 68.2 | 87.6 | 28 / 35 | 4418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 91% |
| wee.Gem 1.8.4 | 35 | 97% |
| wompi.Quokka 1.6 | 19 | 89% |
| ratosh.Nobo 0.21 | 13 | 100% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 21% | 55 |
| maribo.FollowFire 1 | 14 | 18% | 15 |
| m3thos.Eva00 1.1 | 9 | 12% | 24 |
| bayen.UbaMicro 1.4 | 9 | 12% | 16 |
| ratosh.Nobo 0.21 | 8 | 10% | 23 |
| wee.Gem 1.8.4 | 6 | 8% | 35 |
| wompi.Quokka 1.6 | 6 | 8% | 19 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 8 |

## Melee bench: F15

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 80.4 | 25 / 210 | 2.77 | 18.7% | 45440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.6% | 176 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 18.7% | 25 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 5 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.4% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 1 |
| sample.SittingDuck 1.0 | 9.5 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.2 | 77.1 | 2 / 35 | 7440 |
| 2 | 2 | 70.2 | 83.2 | 4 / 35 | 7738 |
| 3 | 2 | 69.5 | 80.0 | 7 / 35 | 7237 |
| 4 | 2 | 70.6 | 82.2 | 6 / 35 | 7808 |
| 5 | 2 | 69.5 | 79.7 | 5 / 35 | 7223 |
| 6 | 2 | 69.7 | 80.0 | 1 / 35 | 7994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 5% |
| mz.NanoGod 2.02 | 9 | 100% |
| exauge.GateKeeper 1.1.121g | 6 | 83% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 152 | 82% | 159 |
| mz.NanoGod 2.02 | 11 | 6% | 25 |
| exauge.GateKeeper 1.1.121g | 10 | 5% | 13 |
| ayk.WallHugger 1.0 | 7 | 4% | 7 |
| stelo.PianistNano 1.2 | 4 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.9 | 113 / 210 | 3.26 | 16.8% | 27519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 16.8% | 113 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.6% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.5 | 11.6% | 27 |
| bvh.micro.Freya 0.3 | 3.7 | 12.1% | 12 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 20 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.8% | 2 |
| conscience.Electron 1.3g | 7.2 | 7.5% | 0 |
| ap.Frederick 1.1 | 8.0 | 7.1% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.2 | 15 / 35 | 4483 |
| 2 | 1 | 66.3 | 78.1 | 22 / 35 | 4679 |
| 3 | 1 | 65.0 | 73.3 | 19 / 35 | 4395 |
| 4 | 1 | 66.8 | 81.0 | 21 / 35 | 4445 |
| 5 | 1 | 65.7 | 77.8 | 19 / 35 | 4691 |
| 6 | 1 | 64.4 | 69.8 | 17 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| dummy.micro.Sparrow 2.5 | 35 | 91% |
| voidious.micro.BlitzBat 1.05 | 30 | 70% |
| bvh.micro.Freya 0.3 | 28 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 88% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 28% | 53 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 19% | 43 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 17 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 48 |
| conscience.Electron 1.3g | 11 | 11% | 14 |
| dl.BetterWalls 1.0 | 7 | 7% | 11 |
| bvh.micro.Freya 0.3 | 5 | 5% | 16 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 7 |

## Melee bench: F17

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 51 over 6 battles (8.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 89.4 | 155 / 210 | 1.95 | 21.5% | 40712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 21.5% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 8 |
| supersample.SuperBoxBot 1.0 | 4.5 | 10.2% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.5% | 4 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 8 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.7% | 3 |
| sample.Corners 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.5 | 27 / 35 | 6687 |
| 2 | 1 | 72.8 | 95.2 | 29 / 35 | 6841 |
| 3 | 1 | 70.7 | 84.1 | 26 / 35 | 6295 |
| 4 | 1 | 72.3 | 89.5 | 27 / 35 | 7071 |
| 5 | 1 | 72.9 | 90.5 | 26 / 35 | 7433 |
| 6 | 1 | 70.5 | 86.7 | 20 / 35 | 6385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 62 | 94% |
| sul.Lunar 1.1 | 46 | 96% |
| supersample.SuperBoxBot 1.0 | 18 | 89% |
| dsw.StaticD 1.0 | 14 | 86% |
| mme.NikeEnhanced 2.0 | 8 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 60% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 26% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 21% | 59 |
| dsw.StaticD 1.0 | 9 | 16% | 19 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 16 |
| sample.MyFirstRobot 1.0 | 5 | 9% | 10 |
| sul.Lunar 1.1 | 4 | 7% | 49 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 10 |
| sample.Corners 1.0 | 3 | 5% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 8 |

## Melee bench: F18

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.5 | 113 / 210 | 2.67 | 18.9% | 39326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.9% | 113 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.3% | 17 |
| mld.Wisdom 1.0 | 4.0 | 11.6% | 14 |
| KiraNL.Chupacabra 0.4 | 4.2 | 10.5% | 8 |
| amz.NanoClone 1.41 | 5.8 | 9.6% | 7 |
| sample.Walls 1.0 | 7.3 | 8.0% | 7 |
| GarmBox.Oranges 1.0 | 8.3 | 6.7% | 2 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 21 / 35 | 6807 |
| 2 | 1 | 68.7 | 85.1 | 20 / 35 | 5753 |
| 3 | 1 | 68.6 | 80.3 | 20 / 35 | 6582 |
| 4 | 1 | 70.2 | 85.7 | 21 / 35 | 7166 |
| 5 | 1 | 66.8 | 74.6 | 16 / 35 | 6378 |
| 6 | 1 | 67.0 | 76.5 | 15 / 35 | 6640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 94% |
| radnor.DoctorBob 1.42 | 40 | 58% |
| amz.NanoClone 1.41 | 15 | 80% |
| mld.Wisdom 1.0 | 11 | 73% |
| KiraNL.Chupacabra 0.4 | 10 | 60% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 34% | 63 |
| KiraNL.Chupacabra 0.4 | 21 | 21% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 20% | 68 |
| amz.NanoClone 1.41 | 9 | 9% | 16 |
| mld.Wisdom 1.0 | 8 | 8% | 18 |
| GarmBox.Oranges 1.0 | 4 | 4% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

