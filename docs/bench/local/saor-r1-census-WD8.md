# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 89.2 | 144 / 210 | 1.97 | 21.1% | 42288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 21.1% | 144 |
| radnor.DoctorBob 1.42 | 2.3 | 14.6% | 24 |
| mz.AntiGrav 1.0 | 3.0 | 13.8% | 16 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 7 |
| GarmBox.Oranges 1.0 | 6.5 | 6.9% | 0 |
| sample.Walls 1.0 | 6.7 | 6.7% | 2 |
| jangs.ns51 1.0 | 8.0 | 5.9% | 4 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.0 | 25 / 35 | 6890 |
| 2 | 1 | 71.7 | 86.7 | 26 / 35 | 6956 |
| 3 | 1 | 72.4 | 90.5 | 25 / 35 | 7516 |
| 4 | 1 | 71.8 | 87.9 | 24 / 35 | 7024 |
| 5 | 1 | 72.9 | 91.7 | 24 / 35 | 7542 |
| 6 | 1 | 70.1 | 85.4 | 20 / 35 | 6360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 94% |
| radnor.DoctorBob 1.42 | 46 | 83% |
| mld.Infinity 2.2 | 35 | 86% |
| amz.NanoClone 1.41 | 10 | 40% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 32% | 64 |
| mld.Infinity 2.2 | 13 | 20% | 40 |
| mz.AntiGrav 1.0 | 12 | 18% | 65 |
| amz.NanoClone 1.41 | 11 | 17% | 18 |
| GarmBox.Oranges 1.0 | 4 | 6% | 7 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.3 | 109 / 210 | 2.78 | 17.4% | 29863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.3 | 17.4% | 109 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 55 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 28 |
| maribo.melee.BMV 0.1 | 4.2 | 10.4% | 5 |
| zyx.nano.Ant 1.1 | 5.7 | 8.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.6% | 7 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 0 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.4 | 18 / 35 | 4836 |
| 2 | 1 | 66.6 | 81.3 | 18 / 35 | 4981 |
| 3 | 1 | 68.1 | 89.5 | 22 / 35 | 4816 |
| 4 | 3 | 58.8 | 52.7 | 8 / 35 | 4684 |
| 5 | 1 | 67.0 | 84.1 | 20 / 35 | 4995 |
| 6 | 1 | 69.8 | 89.5 | 23 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 79% |
| mld.DustBunny 3.8 | 49 | 82% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 34 | 34% | 70 |
| oog.melee.Mercutio 1.0 | 25 | 25% | 75 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 10% | 14 |
| zyx.nano.Ant 1.1 | 10 | 10% | 12 |
| cs.Grudge 1.0 | 10 | 10% | 10 |
| maribo.melee.BMV 0.1 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 4 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 82.0 | 120 / 210 | 2.62 | 19.1% | 35282 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 19.1% | 120 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.8% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.8% | 17 |
| fm.mammillarias 1.3 | 5.3 | 9.6% | 7 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.4% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.0% | 3 |
| sample.Fire 1.0 | 9.2 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.9 | 19 / 35 | 5632 |
| 2 | 1 | 69.5 | 84.1 | 20 / 35 | 5968 |
| 3 | 1 | 67.8 | 81.6 | 19 / 35 | 5466 |
| 4 | 1 | 70.0 | 84.4 | 22 / 35 | 6171 |
| 5 | 1 | 67.5 | 74.3 | 18 / 35 | 6113 |
| 6 | 1 | 69.5 | 85.7 | 22 / 35 | 5932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 84% |
| myl.nano.KomoriNinja 1.1 | 19 | 89% |
| cb.nano.Insomnia 1.0 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 9 | 78% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 28% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 22% | 38 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 14 |
| fm.mammillarias 1.3 | 12 | 13% | 19 |
| myl.nano.KomoriNinja 1.1 | 10 | 11% | 38 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 14 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 15 |
| sample.Tracker 1.0 | 1 | 1% | 3 |
| sample.Fire 1.0 | 0 | 0% | 6 |

## Melee bench: F04

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 81.8 | 133 / 210 | 2.64 | 19.5% | 38473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 19.5% | 133 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.6% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 14 |
| tj.zombie1n 1.0.1 | 4.5 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.3% | 19 |
| yk.JahMicro 1.0 | 6.5 | 8.6% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.5 | 8.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.3% | 8 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.1 | 25 / 35 | 7109 |
| 2 | 1 | 68.8 | 79.4 | 23 / 35 | 6481 |
| 3 | 1 | 70.9 | 86.7 | 24 / 35 | 7059 |
| 4 | 1 | 69.5 | 85.4 | 23 / 35 | 6209 |
| 5 | 1 | 67.7 | 77.5 | 20 / 35 | 6172 |
| 6 | 1 | 65.2 | 70.8 | 18 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 50 | 88% |
| stelo.SoJNanoMelee 1.1 | 36 | 81% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| tj.zombie1n 1.0.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 100% |
| yk.JahMicro 1.0 | 9 | 78% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 44% | 85 |
| stelo.SoJNanoMelee 1.1 | 19 | 24% | 45 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 9% | 10 |
| tj.zombie1n 1.0.1 | 6 | 8% | 11 |
| yk.JahMicro 1.0 | 5 | 6% | 10 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 15 |
| repositorio.NanoStep 1.0 | 1 | 1% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F05

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.2 | 91 / 210 | 3.69 | 15.7% | 28647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 15.7% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 26 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.4% | 30 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 9.5% | 15 |
| EBBU.Sim2 1.02 | 6.2 | 9.7% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 8.9% | 8 |
| sam.Samspin 1.0 | 6.8 | 9.0% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 65.1 | 15 / 35 | 4874 |
| 2 | 1 | 64.3 | 73.3 | 18 / 35 | 4937 |
| 3 | 1 | 63.1 | 71.1 | 14 / 35 | 4692 |
| 4 | 1 | 64.0 | 74.3 | 17 / 35 | 4536 |
| 5 | 1 | 61.5 | 63.8 | 14 / 35 | 4445 |
| 6 | 1 | 64.6 | 73.3 | 13 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 84% |
| oog.melee.Corsair 1.0 | 30 | 77% |
| ahf.NanoAndrew .4 | 14 | 93% |
| EBBU.Sim2 1.02 | 13 | 85% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 19 | 16% | 48 |
| robar.nano.Assertive_Melee 0.2 | 17 | 14% | 20 |
| oog.melee.Corsair 1.0 | 16 | 13% | 41 |
| ahf.NanoAndrew .4 | 14 | 12% | 29 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 14 |
| EBBU.Sim2 1.02 | 11 | 9% | 21 |
| sam.Samspin 1.0 | 11 | 9% | 17 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 14 |
| sample.TrackFire 1.0 | 6 | 5% | 6 |

## Melee bench: F06

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 126 / 210 | 2.47 | 18.7% | 31933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 18.7% | 126 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 34 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.6% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.3% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.0% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.9% | 8 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 3 |
| fm.claire 1.7 | 7.5 | 7.8% | 2 |
| pa.Improved 1.0 | 9.3 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 80.0 | 19 / 35 | 5145 |
| 2 | 1 | 67.9 | 83.8 | 21 / 35 | 5130 |
| 3 | 1 | 70.0 | 89.5 | 25 / 35 | 5521 |
| 4 | 1 | 66.4 | 80.3 | 19 / 35 | 4852 |
| 5 | 1 | 67.3 | 81.6 | 19 / 35 | 5425 |
| 6 | 1 | 69.4 | 87.0 | 23 / 35 | 5860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 82% |
| oog.melee.CapuletDroid 1.1 | 35 | 94% |
| gh.nano.Grofvuil 0.2 | 12 | 100% |
| winamp32.micro.MicroMacro 1.0 | 11 | 91% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 2 | 0% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 43% | 84 |
| oog.melee.CapuletDroid 1.1 | 12 | 14% | 41 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 18 |
| gh.nano.Grofvuil 0.2 | 7 | 8% | 25 |
| fm.claire 1.7 | 7 | 8% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 17 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| pa.Improved 1.0 | 2 | 2% | 5 |

## Melee bench: F07

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.4 | 97 / 210 | 2.77 | 17.6% | 33134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 17.6% | 97 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 31 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.4% | 41 |
| mz.MicroGodMelee 1 | 4.0 | 12.5% | 30 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| acogdev.alpha 0.2 | 6.8 | 7.1% | 0 |
| el.JumpShoot 0.2 | 8.3 | 6.0% | 4 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 17 / 35 | 5434 |
| 2 | 1 | 68.4 | 83.5 | 18 / 35 | 5863 |
| 3 | 1 | 68.5 | 84.4 | 19 / 35 | 6010 |
| 4 | 1 | 65.9 | 78.1 | 15 / 35 | 5333 |
| 5 | 1 | 66.7 | 79.7 | 17 / 35 | 5174 |
| 6 | 1 | 65.0 | 76.8 | 11 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 48 | 73% |
| mz.MicroGodMelee 1 | 38 | 71% |
| gh.micro.Gruweltje 0.7 | 22 | 86% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 113 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 34% | 65 |
| gh.micro.Gruweltje 0.7 | 24 | 21% | 47 |
| mz.MicroGodMelee 1 | 20 | 18% | 44 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 11 |
| acogdev.alpha 0.2 | 7 | 6% | 10 |
| DBall.Anarchy 0.1 | 6 | 5% | 19 |
| el.JumpShoot 0.2 | 5 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.4 | 97 / 210 | 3.67 | 16.1% | 30480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.2 | 16.1% | 97 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.7% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 43 |
| germ.TheMind .2 | 4.5 | 9.7% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.1% | 9 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 5 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.5% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.7 | 7.7% | 2 |
| sample.Crazy 1.0 | 9.0 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.9 | 19 / 35 | 5225 |
| 2 | 1 | 65.0 | 71.4 | 18 / 35 | 5150 |
| 3 | 2 | 62.5 | 65.4 | 14 / 35 | 4889 |
| 4 | 1 | 65.7 | 73.7 | 18 / 35 | 5360 |
| 5 | 1 | 62.2 | 64.8 | 14 / 35 | 4806 |
| 6 | 1 | 64.0 | 71.1 | 14 / 35 | 5050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 100% |
| germ.TheMind .2 | 11 | 82% |
| awesomeness.Elite 1.0 | 9 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 46% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 35 |
| germ.TheMind .2 | 15 | 13% | 25 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 14 |
| awesomeness.Elite 1.0 | 6 | 5% | 19 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 8 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 4 |

## Melee bench: F09

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.9 | 128 / 210 | 2.36 | 18.7% | 29329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 18.7% | 128 |
| rz.HawkOnFire 0.1 | 2.0 | 14.2% | 30 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 17 |
| maribo.IotaCT 1.1 | 4.8 | 10.3% | 7 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 6 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.8% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.7% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.0 | 14 / 35 | 4453 |
| 2 | 1 | 69.3 | 88.3 | 23 / 35 | 4912 |
| 3 | 1 | 69.0 | 84.1 | 23 / 35 | 4983 |
| 4 | 1 | 70.0 | 87.6 | 24 / 35 | 5454 |
| 5 | 1 | 67.0 | 80.0 | 19 / 35 | 4734 |
| 6 | 1 | 70.3 | 90.5 | 25 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 86% |
| nz.jdc.nano.GridFu 1.0 | 26 | 92% |
| maribo.IotaCT 1.1 | 17 | 94% |
| timmit.nano.TimDog 0.33 | 15 | 67% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 28 | 34% | 68 |
| timmit.nano.TimDog 0.33 | 14 | 17% | 26 |
| nz.jdc.nano.GridFu 1.0 | 12 | 15% | 46 |
| ratosh.Wesco 1.4 | 9 | 11% | 20 |
| stelo.PatternRobot 1.0 | 7 | 9% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 11 |
| maribo.IotaCT 1.1 | 4 | 5% | 18 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.7 | 136 / 210 | 2.10 | 20.0% | 37161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 20.0% | 136 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.8% | 28 |
| baal.nano.N 1.42 | 3.3 | 10.8% | 8 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 0 |
| zyx.micro.Ant 1.1 | 4.7 | 10.0% | 18 |
| sanja.First 0.1 | 5.8 | 8.8% | 5 |
| cvt.Firsty 1.0 | 7.0 | 8.3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.8 | 7.4% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.4 | 26 / 35 | 5952 |
| 2 | 1 | 69.3 | 86.0 | 23 / 35 | 6135 |
| 3 | 1 | 68.9 | 86.3 | 22 / 35 | 5964 |
| 4 | 1 | 70.9 | 88.6 | 22 / 35 | 7128 |
| 5 | 1 | 67.6 | 83.8 | 19 / 35 | 5578 |
| 6 | 1 | 70.3 | 89.2 | 24 / 35 | 6404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 81% |
| cvt.Firsty 1.0 | 29 | 90% |
| baal.nano.N 1.42 | 24 | 88% |
| sanja.First 0.1 | 23 | 96% |
| zyx.micro.Ant 1.1 | 19 | 68% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 28 | 37% | 43 |
| tvv.nano.Polaris 1.2 | 16 | 21% | 47 |
| cvt.Firsty 1.0 | 8 | 11% | 32 |
| baal.nano.N 1.42 | 7 | 9% | 31 |
| Grystrion.TrackerWO 1.0 | 6 | 8% | 16 |
| amk.Punbot.Punbot 0.01 | 5 | 7% | 9 |
| sanja.First 0.1 | 4 | 5% | 25 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.5 | 83 / 210 | 3.83 | 15.3% | 29926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.2% | 61 |
| hadur117.micro.SaorWD8 0.1 | 1.7 | 15.3% | 83 |
| cs.Wren 1.0 | 2.8 | 13.4% | 26 |
| mz.Cork 0.1 | 4.0 | 11.4% | 11 |
| js.PinBall 1.6 | 5.0 | 10.4% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.1% | 6 |
| evd.X1 0.01 | 7.0 | 8.0% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 57.1 | 9 / 35 | 4690 |
| 2 | 1 | 61.6 | 65.1 | 13 / 35 | 4743 |
| 3 | 1 | 66.3 | 76.2 | 18 / 35 | 5181 |
| 4 | 2 | 65.0 | 77.1 | 14 / 35 | 5118 |
| 5 | 2 | 63.7 | 70.2 | 17 / 35 | 4633 |
| 6 | 2 | 62.7 | 65.4 | 12 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 51 | 75% |
| cs.Wren 1.0 | 32 | 91% |
| mz.Cork 0.1 | 6 | 100% |
| js.PinBall 1.6 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 45 | 35% | 90 |
| cs.Wren 1.0 | 25 | 20% | 43 |
| evd.X1 0.01 | 22 | 17% | 22 |
| joe.ADinosaur 1.0 | 14 | 11% | 15 |
| mz.Cork 0.1 | 11 | 9% | 20 |
| js.PinBall 1.6 | 3 | 2% | 8 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 129 / 210 | 2.43 | 18.7% | 28909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 18.7% | 129 |
| ntc.Opposite 1.5 | 2.7 | 11.9% | 17 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.7% | 15 |
| myl.nano.Graviton 1.10 | 3.8 | 11.1% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 9.9% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 7 |
| DBall.NUKE 0.1 | 6.8 | 8.3% | 4 |
| disan.Chair 2.2.0 | 7.7 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 9.5 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.8 | 21 / 35 | 5264 |
| 2 | 1 | 66.1 | 79.7 | 21 / 35 | 4445 |
| 3 | 1 | 68.4 | 86.0 | 20 / 35 | 5223 |
| 4 | 1 | 67.7 | 86.0 | 24 / 35 | 4116 |
| 5 | 1 | 67.2 | 82.2 | 18 / 35 | 4774 |
| 6 | 1 | 68.9 | 86.0 | 25 / 35 | 5087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 95% |
| myl.nano.Graviton 1.10 | 25 | 92% |
| DBall.NUKE 0.1 | 23 | 100% |
| ntc.Opposite 1.5 | 17 | 76% |
| disan.Chair 2.2.0 | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 19 | 23% | 32 |
| pfvicm.Sobieski 7.2.3b | 15 | 18% | 21 |
| stelo.AreaTargetingBot 1.1 | 14 | 17% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 26 |
| myl.nano.Graviton 1.10 | 10 | 12% | 39 |
| disan.Chair 2.2.0 | 7 | 9% | 15 |
| DBall.NUKE 0.1 | 2 | 2% | 24 |
| pbg.R2D2 1.0 | 2 | 2% | 9 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.5 | 69 / 210 | 3.93 | 14.6% | 24433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 53 |
| hadur117.micro.SaorWD8 0.1 | 2.2 | 14.6% | 69 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.6% | 42 |
| yagami.Tidus 0.11 | 3.7 | 12.7% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.7% | 29 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 2 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 65.4 | 9 / 35 | 3842 |
| 2 | 3 | 60.9 | 64.4 | 11 / 35 | 3849 |
| 3 | 3 | 62.3 | 68.6 | 12 / 35 | 3857 |
| 4 | 1 | 65.7 | 75.2 | 13 / 35 | 4668 |
| 5 | 2 | 62.0 | 63.2 | 10 / 35 | 4120 |
| 6 | 2 | 63.1 | 67.9 | 14 / 35 | 4097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 69% |
| kawigi.micro.Shiz 1.1 | 26 | 77% |
| yagami.Tidus 0.11 | 19 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 60% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| yagami.Tidus 0.11 | 38 | 27% | 48 |
| oog.melee.Capulet 1.2 | 35 | 25% | 55 |
| kawigi.micro.Shiz 1.1 | 22 | 16% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 26 |
| stelo.MirrorNano 1.3 | 9 | 6% | 9 |
| kurios.DOSexe .9a | 9 | 6% | 9 |
| ejb.Polaris 1.0.1 | 7 | 5% | 12 |
| step.nanoPri 1.0 | 5 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 77.1 | 112 / 210 | 3.06 | 16.7% | 25966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 16.7% | 112 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 27 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 30 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 13 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 11 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 13 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 71.1 | 19 / 35 | 4174 |
| 2 | 1 | 63.4 | 74.0 | 17 / 35 | 3864 |
| 3 | 1 | 67.6 | 85.7 | 21 / 35 | 4641 |
| 4 | 1 | 64.2 | 72.7 | 16 / 35 | 4600 |
| 5 | 1 | 66.7 | 83.8 | 21 / 35 | 4311 |
| 6 | 1 | 64.7 | 75.2 | 18 / 35 | 4376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 85% |
| wee.Gem 1.8.4 | 28 | 100% |
| wompi.Quokka 1.6 | 15 | 93% |
| bayen.UbaMicro 1.4 | 12 | 92% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 5 | 60% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 23 | 23% | 62 |
| m3thos.Eva00 1.1 | 16 | 16% | 22 |
| ratosh.Nobo 0.21 | 14 | 14% | 21 |
| maribo.FollowFire 1 | 11 | 11% | 10 |
| bayen.UbaMicro 1.4 | 10 | 10% | 19 |
| wee.Gem 1.8.4 | 7 | 7% | 40 |
| stelo.MyAgileRobot 0.2 | 7 | 7% | 11 |
| wompi.Quokka 1.6 | 6 | 6% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 4% | 9 |

## Melee bench: F15

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 84.5 | 128 / 210 | 2.40 | 20.3% | 43628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 20.3% | 128 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 66 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 9 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 85.7 | 20 / 35 | 7034 |
| 2 | 1 | 70.5 | 80.3 | 20 / 35 | 7164 |
| 3 | 1 | 70.7 | 81.6 | 22 / 35 | 7246 |
| 4 | 1 | 72.0 | 87.6 | 21 / 35 | 7336 |
| 5 | 1 | 71.4 | 85.4 | 21 / 35 | 7396 |
| 6 | 1 | 71.9 | 86.3 | 24 / 35 | 7452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 102 | 82% |
| mz.NanoGod 2.02 | 15 | 80% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 44% | 127 |
| mz.NanoGod 2.02 | 21 | 26% | 37 |
| exauge.GateKeeper 1.1.121g | 12 | 15% | 19 |
| ayk.WallHugger 1.0 | 6 | 7% | 9 |
| stuff.Vlad 0.1 | 4 | 5% | 6 |
| drd.Dreadknoght 0.9 | 3 | 4% | 9 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 68.5 | 99 / 210 | 3.83 | 16.0% | 29305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 16.0% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 27 |
| bvh.micro.Freya 0.3 | 3.5 | 11.2% | 15 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.5% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 25 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.8% | 4 |
| ap.Frederick 1.1 | 8.0 | 7.2% | 9 |
| dl.BetterWalls 1.0 | 9.2 | 6.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 61.6 | 14 / 35 | 4966 |
| 2 | 1 | 64.8 | 71.7 | 15 / 35 | 5115 |
| 3 | 1 | 63.0 | 67.0 | 18 / 35 | 4487 |
| 4 | 1 | 66.4 | 78.1 | 20 / 35 | 5073 |
| 5 | 1 | 62.6 | 64.1 | 15 / 35 | 4807 |
| 6 | 1 | 63.7 | 68.6 | 17 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 74% |
| dummy.micro.Sparrow 2.5 | 19 | 84% |
| bvh.micro.Freya 0.3 | 18 | 100% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 19% | 21 |
| voidious.micro.BlitzBat 1.05 | 20 | 18% | 50 |
| conscience.Electron 1.3g | 19 | 17% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 16% | 38 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 34 |
| bvh.micro.Freya 0.3 | 6 | 5% | 20 |
| dl.BetterWalls 1.0 | 5 | 5% | 13 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 83.3 | 128 / 210 | 2.50 | 20.1% | 41196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 20.1% | 128 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 30 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 15 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.4% | 19 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 4 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.2% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 5 |
| sample.Corners 1.0 | 9.2 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 74.3 | 17 / 35 | 6456 |
| 2 | 1 | 70.9 | 86.7 | 23 / 35 | 7065 |
| 3 | 1 | 69.9 | 81.3 | 20 / 35 | 7257 |
| 4 | 1 | 70.1 | 85.4 | 21 / 35 | 6810 |
| 5 | 1 | 71.3 | 89.5 | 26 / 35 | 6693 |
| 6 | 1 | 70.1 | 82.5 | 21 / 35 | 6915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 87% |
| sul.Lunar 1.1 | 38 | 100% |
| supersample.SuperBoxBot 1.0 | 22 | 91% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| dsw.StaticD 1.0 | 7 | 57% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 35 | 42% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 29% | 67 |
| mme.NikeEnhanced 2.0 | 7 | 8% | 17 |
| dsw.StaticD 1.0 | 6 | 7% | 13 |
| sul.Lunar 1.1 | 5 | 6% | 42 |
| sample.Corners 1.0 | 2 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.micro.SaorWD8 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.7 | 116 / 210 | 2.91 | 18.0% | 36352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD8 0.1 | 1.0 | 18.0% | 116 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 33 |
| mld.Wisdom 1.0 | 2.8 | 12.0% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 17 |
| KiraNL.Chupacabra 0.4 | 5.2 | 9.9% | 7 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 9 |
| GarmBox.Oranges 1.0 | 7.3 | 7.8% | 1 |
| sample.Walls 1.0 | 7.8 | 7.7% | 7 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 2 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 71.1 | 19 / 35 | 5678 |
| 2 | 1 | 65.5 | 72.4 | 17 / 35 | 5951 |
| 3 | 1 | 68.4 | 83.2 | 21 / 35 | 6339 |
| 4 | 1 | 65.5 | 75.6 | 17 / 35 | 5277 |
| 5 | 1 | 69.3 | 84.4 | 18 / 35 | 6858 |
| 6 | 1 | 69.3 | 85.7 | 24 / 35 | 6249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 95% |
| radnor.DoctorBob 1.42 | 31 | 90% |
| mld.Wisdom 1.0 | 24 | 63% |
| amz.NanoClone 1.41 | 12 | 67% |
| jangs.ns51 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 29% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 20% | 56 |
| radnor.DoctorBob 1.42 | 16 | 17% | 45 |
| amz.NanoClone 1.41 | 14 | 15% | 19 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 22 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 7 |

