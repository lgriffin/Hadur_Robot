# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 86.1 | 138 / 210 | 2.25 | 20.4% | 41748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.4% | 138 |
| mz.AntiGrav 1.0 | 2.8 | 14.2% | 19 |
| radnor.DoctorBob 1.42 | 2.8 | 14.0% | 20 |
| mld.Infinity 2.2 | 3.3 | 13.4% | 24 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 6 |
| sample.Walls 1.0 | 6.7 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 3 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 91.4 | 26 / 35 | 7172 |
| 2 | 1 | 71.9 | 88.3 | 24 / 35 | 7195 |
| 3 | 1 | 70.8 | 87.0 | 22 / 35 | 6820 |
| 4 | 1 | 70.8 | 85.4 | 23 / 35 | 6793 |
| 5 | 1 | 69.6 | 78.1 | 19 / 35 | 7094 |
| 6 | 1 | 71.4 | 86.3 | 24 / 35 | 6674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 92% |
| mld.Infinity 2.2 | 35 | 83% |
| radnor.DoctorBob 1.42 | 32 | 88% |
| amz.NanoClone 1.41 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 31 | 43% | 73 |
| mld.Infinity 2.2 | 15 | 21% | 47 |
| mz.AntiGrav 1.0 | 10 | 14% | 61 |
| amz.NanoClone 1.41 | 6 | 8% | 10 |
| sample.Walls 1.0 | 4 | 6% | 9 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 3 | 4% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.5 | 126 / 210 | 2.13 | 19.0% | 33459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.0% | 126 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 53 |
| mld.DustBunny 3.8 | 3.2 | 12.1% | 14 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.6% | 10 |
| zyx.nano.Ant 1.1 | 6.7 | 8.4% | 0 |
| bzdp.BoxCar 2.0 | 7.7 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.3 | 6.8% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.9 | 20 / 35 | 5227 |
| 2 | 1 | 69.0 | 87.0 | 22 / 35 | 5990 |
| 3 | 1 | 67.8 | 85.7 | 21 / 35 | 5567 |
| 4 | 1 | 70.3 | 93.3 | 23 / 35 | 5674 |
| 5 | 1 | 69.2 | 86.7 | 21 / 35 | 5941 |
| 6 | 1 | 68.4 | 90.2 | 19 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 57 | 68% |
| mld.DustBunny 3.8 | 44 | 91% |
| djdjdj.NanoSkunk10 1.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 67% |
| fullsail.SweetTea 1.1 | 11 | 100% |
| maribo.melee.BMV 0.1 | 11 | 64% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 42% | 81 |
| mld.DustBunny 3.8 | 16 | 19% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 14% | 20 |
| maribo.melee.BMV 0.1 | 10 | 12% | 13 |
| zyx.nano.Ant 1.1 | 6 | 7% | 13 |
| fullsail.SweetTea 1.1 | 5 | 6% | 17 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 13 |
| bzdp.BoxCar 2.0 | 0 | 0% | 5 |
| cs.Grudge 1.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 80.5 | 113 / 210 | 2.76 | 19.0% | 36655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.0% | 113 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.4% | 29 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 4 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.1% | 6 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |
| sample.Fire 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.6 | 17 / 35 | 5515 |
| 2 | 1 | 70.7 | 86.0 | 23 / 35 | 6385 |
| 3 | 1 | 70.3 | 85.1 | 22 / 35 | 6282 |
| 4 | 1 | 70.9 | 88.6 | 22 / 35 | 6640 |
| 5 | 1 | 65.8 | 72.1 | 11 / 35 | 5778 |
| 6 | 1 | 67.8 | 76.5 | 18 / 35 | 6055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 78% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| myl.nano.KomoriNinja 1.1 | 11 | 91% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 4 | 75% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 28 | 29% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 22% | 44 |
| fm.mammillarias 1.3 | 15 | 15% | 19 |
| myl.nano.KomoriNinja 1.1 | 13 | 13% | 32 |
| cb.nano.Insomnia 1.0 | 10 | 10% | 12 |
| sample.Fire 1.0 | 6 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 14 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.9 | 157 / 210 | 1.82 | 21.3% | 40410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.3% | 157 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.4% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 2 |
| tj.zombie1n 1.0.1 | 6.2 | 8.7% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.2 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.1 | 26 / 35 | 7066 |
| 2 | 1 | 69.8 | 87.9 | 25 / 35 | 6124 |
| 3 | 1 | 71.1 | 90.8 | 23 / 35 | 7033 |
| 4 | 1 | 72.7 | 96.5 | 29 / 35 | 6893 |
| 5 | 1 | 71.2 | 90.5 | 26 / 35 | 6658 |
| 6 | 1 | 71.0 | 88.6 | 28 / 35 | 6636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 53 | 87% |
| kawigi.nano.Lib 1.0 | 47 | 96% |
| tj.zombie1n 1.0.1 | 17 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 100% |
| tvv.micro.Antares 1.1.1 | 15 | 87% |
| yk.JahMicro 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 34% | 78 |
| stelo.SoJNanoMelee 1.1 | 14 | 26% | 36 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 24 |
| tj.zombie1n 1.0.1 | 5 | 9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 22 |
| yk.JahMicro 1.0 | 3 | 6% | 13 |
| sample.VelociRobot 1.0 | 1 | 2% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 71.2 | 84 / 210 | 3.59 | 15.8% | 29613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 15.8% | 84 |
| oog.melee.Corsair 1.0 | 2.7 | 12.4% | 34 |
| ahf.NanoAndrew .4 | 2.8 | 12.2% | 42 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 24 |
| EBBU.Sim2 1.02 | 5.2 | 9.9% | 6 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 9.6% | 9 |
| sam.Samspin 1.0 | 6.5 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.5% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.0 | 17 / 35 | 5265 |
| 2 | 1 | 62.0 | 67.6 | 11 / 35 | 4701 |
| 3 | 1 | 63.6 | 73.7 | 13 / 35 | 4877 |
| 4 | 1 | 62.2 | 67.9 | 14 / 35 | 4791 |
| 5 | 1 | 63.7 | 68.9 | 15 / 35 | 5302 |
| 6 | 1 | 62.7 | 70.2 | 14 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 33 | 85% |
| oog.melee.Corsair 1.0 | 22 | 55% |
| ahf.NanoAndrew .4 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 12 | 83% |
| EBBU.Sim2 1.02 | 12 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 42 |
| ahf.NanoAndrew .4 | 19 | 15% | 34 |
| robar.nano.Assertive_Melee 0.2 | 18 | 14% | 23 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 37 |
| EBBU.Sim2 1.02 | 14 | 11% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 15 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 16 |
| sam.Samspin 1.0 | 6 | 5% | 12 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.0 | 132 / 210 | 2.26 | 19.2% | 33106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.2% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 32 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 9.4% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 5 |
| fm.claire 1.7 | 6.7 | 8.5% | 2 |
| sample.SpinBot 1.0 | 7.7 | 7.2% | 2 |
| pa.Improved 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.8 | 24 / 35 | 5820 |
| 2 | 1 | 68.3 | 84.8 | 21 / 35 | 5374 |
| 3 | 1 | 68.8 | 86.7 | 21 / 35 | 5556 |
| 4 | 1 | 68.5 | 84.1 | 23 / 35 | 5488 |
| 5 | 1 | 71.0 | 94.0 | 25 / 35 | 5751 |
| 6 | 1 | 65.6 | 75.9 | 18 / 35 | 5117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 80% |
| oog.melee.CapuletDroid 1.1 | 26 | 96% |
| gh.nano.Grofvuil 0.2 | 20 | 80% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 40% | 84 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 35 |
| gh.nano.Grofvuil 0.2 | 8 | 10% | 25 |
| sample.SpinBot 1.0 | 7 | 9% | 15 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 13 |
| fm.claire 1.7 | 7 | 9% | 11 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 17 |
| kurios.DOSexe .9b | 4 | 5% | 7 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.3 | 111 / 210 | 2.59 | 18.4% | 34837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 18.4% | 111 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.7% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 27 |
| mz.MicroGodMelee 1 | 3.5 | 12.5% | 21 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.4% | 3 |
| el.JumpShoot 0.2 | 7.0 | 6.6% | 2 |
| acogdev.alpha 0.2 | 8.2 | 6.2% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 6.2% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 19 / 35 | 5830 |
| 2 | 1 | 67.8 | 79.0 | 18 / 35 | 5958 |
| 3 | 1 | 70.4 | 90.5 | 23 / 35 | 6235 |
| 4 | 1 | 68.8 | 82.9 | 21 / 35 | 6199 |
| 5 | 2 | 63.2 | 69.2 | 12 / 35 | 5165 |
| 6 | 1 | 67.8 | 85.4 | 18 / 35 | 5450 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 86% |
| mz.MicroGodMelee 1 | 39 | 74% |
| gh.micro.Gruweltje 0.7 | 18 | 44% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 32% | 48 |
| mz.MicroGodMelee 1 | 24 | 24% | 59 |
| spinnercat.micro.Tyger 0.1 | 22 | 22% | 58 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 12 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 9 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |

## Melee bench: F08

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.4 | 108 / 210 | 3.04 | 17.4% | 32874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 17.4% | 108 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.5% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 25 |
| germ.TheMind .2 | 4.2 | 9.8% | 11 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.0% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 3 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.8 | 6.5% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 19 / 35 | 4710 |
| 2 | 2 | 64.6 | 71.1 | 14 / 35 | 5566 |
| 3 | 1 | 67.2 | 78.7 | 20 / 35 | 5949 |
| 4 | 1 | 65.7 | 74.3 | 16 / 35 | 5417 |
| 5 | 1 | 68.1 | 81.6 | 21 / 35 | 5593 |
| 6 | 1 | 66.6 | 76.8 | 18 / 35 | 5639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 67% |
| germ.TheMind .2 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| awesomeness.Elite 1.0 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 43% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 38 |
| germ.TheMind .2 | 9 | 9% | 18 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 15 |
| awesomeness.Elite 1.0 | 8 | 8% | 13 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 131 / 210 | 2.33 | 18.8% | 29475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.8% | 131 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.9% | 15 |
| maribo.IotaCT 1.1 | 3.8 | 11.0% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.2% | 3 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.2% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 3 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 8 |
| spinnercat.Omen 1.0 | 8.2 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 21 / 35 | 4678 |
| 2 | 1 | 68.5 | 82.9 | 21 / 35 | 5001 |
| 3 | 1 | 69.7 | 87.6 | 26 / 35 | 4838 |
| 4 | 1 | 68.1 | 84.4 | 19 / 35 | 4728 |
| 5 | 1 | 70.1 | 87.0 | 25 / 35 | 5290 |
| 6 | 1 | 67.8 | 83.5 | 19 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 88% |
| nz.jdc.nano.GridFu 1.0 | 29 | 97% |
| maribo.IotaCT 1.1 | 11 | 73% |
| stelo.PatternRobot 1.0 | 11 | 73% |
| spinnercat.Omen 1.0 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 88% |
| ratosh.Wesco 1.4 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |

Hadur died in 79 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 23% | 72 |
| stelo.PatternRobot 1.0 | 15 | 19% | 26 |
| timmit.nano.TimDog 0.33 | 15 | 19% | 23 |
| nz.jdc.nano.GridFu 1.0 | 13 | 16% | 42 |
| ratosh.Wesco 1.4 | 7 | 9% | 14 |
| maribo.IotaCT 1.1 | 6 | 8% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.7 | 162 / 210 | 2.02 | 20.6% | 36952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.6% | 162 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 6 |
| tvv.nano.Polaris 1.2 | 2.8 | 12.0% | 17 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.4% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 9.2% | 10 |
| sanja.First 0.1 | 6.3 | 8.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.6% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.0% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 30 / 35 | 5826 |
| 2 | 1 | 70.7 | 90.5 | 28 / 35 | 6255 |
| 3 | 1 | 70.4 | 90.8 | 25 / 35 | 6048 |
| 4 | 1 | 72.0 | 92.7 | 29 / 35 | 6922 |
| 5 | 1 | 69.6 | 82.9 | 25 / 35 | 5951 |
| 6 | 1 | 69.2 | 85.1 | 25 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 34 | 97% |
| tvv.nano.Polaris 1.2 | 33 | 100% |
| sanja.First 0.1 | 26 | 100% |
| zyx.micro.Ant 1.1 | 24 | 100% |
| cvt.Firsty 1.0 | 21 | 86% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 28% | 48 |
| baal.nano.N 1.42 | 7 | 14% | 37 |
| cvt.Firsty 1.0 | 7 | 14% | 20 |
| tvv.nano.Polaris 1.2 | 6 | 12% | 47 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 12 |
| sanja.First 0.1 | 4 | 8% | 24 |
| sample.RamFire 1.0 | 3 | 6% | 3 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.7 | 88 / 210 | 3.81 | 15.4% | 30830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 15.4% | 88 |
| kc.micro.Figment 1.0 | 2.0 | 15.1% | 55 |
| cs.Wren 1.0 | 2.8 | 13.2% | 31 |
| js.PinBall 1.6 | 4.3 | 11.4% | 18 |
| mz.Cork 0.1 | 4.7 | 10.7% | 6 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 4 |
| evd.X1 0.01 | 7.0 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.4% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 69.2 | 11 / 35 | 5334 |
| 2 | 1 | 63.0 | 69.5 | 17 / 35 | 4565 |
| 3 | 1 | 63.4 | 67.0 | 16 / 35 | 5216 |
| 4 | 1 | 63.8 | 70.5 | 15 / 35 | 5178 |
| 5 | 1 | 63.0 | 66.3 | 15 / 35 | 5133 |
| 6 | 1 | 63.9 | 69.8 | 14 / 35 | 5404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 71% |
| cs.Wren 1.0 | 27 | 93% |
| mz.Cork 0.1 | 7 | 100% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| js.PinBall 1.6 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 54 | 44% | 104 |
| joe.ADinosaur 1.0 | 18 | 15% | 20 |
| cs.Wren 1.0 | 14 | 11% | 30 |
| evd.X1 0.01 | 13 | 11% | 13 |
| js.PinBall 1.6 | 9 | 7% | 16 |
| mz.Cork 0.1 | 5 | 4% | 10 |
| PSW.Relentless 0.1 | 4 | 3% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.6 | 115 / 210 | 2.56 | 18.4% | 30248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.4% | 115 |
| myl.nano.Graviton 1.10 | 2.3 | 11.4% | 22 |
| ntc.Opposite 1.5 | 2.8 | 11.8% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.7% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.8 | 9.1% | 13 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 14 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 6 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.1 | 17 / 35 | 5375 |
| 2 | 1 | 68.3 | 85.7 | 22 / 35 | 5035 |
| 3 | 1 | 65.4 | 79.7 | 15 / 35 | 4392 |
| 4 | 1 | 68.2 | 86.3 | 20 / 35 | 4998 |
| 5 | 1 | 68.1 | 81.3 | 22 / 35 | 5377 |
| 6 | 1 | 68.1 | 85.7 | 19 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 31 | 94% |
| stelo.AreaTargetingBot 1.1 | 28 | 93% |
| ntc.Opposite 1.5 | 18 | 44% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| disan.Chair 2.2.0 | 15 | 80% |
| donjezza.Muncho 1.0 | 14 | 79% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 30 | 31% | 40 |
| pfvicm.Sobieski 7.2.3b | 17 | 18% | 25 |
| stelo.AreaTargetingBot 1.1 | 15 | 16% | 39 |
| myl.nano.Graviton 1.10 | 14 | 15% | 46 |
| disan.Chair 2.2.0 | 8 | 8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 19 |
| donjezza.Muncho 1.0 | 5 | 5% | 11 |
| DBall.NUKE 0.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 67.2 | 65 / 210 | 3.95 | 14.3% | 24305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.2 | 15.1% | 62 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 40 |
| hadur117.micro.SaorWNF 0.1 | 2.7 | 14.3% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 21 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 73.7 | 14 / 35 | 4170 |
| 2 | 4 | 60.5 | 62.5 | 9 / 35 | 3682 |
| 3 | 3 | 61.8 | 66.3 | 10 / 35 | 3913 |
| 4 | 2 | 64.2 | 73.0 | 12 / 35 | 4257 |
| 5 | 3 | 61.2 | 67.6 | 10 / 35 | 3893 |
| 6 | 3 | 61.1 | 60.0 | 10 / 35 | 4390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 79% |
| oog.melee.Capulet 1.2 | 22 | 59% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| yagami.Tidus 0.11 | 11 | 82% |
| ejb.Polaris 1.0.1 | 8 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 65 | 45% | 85 |
| yagami.Tidus 0.11 | 21 | 14% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 12% | 36 |
| kawigi.micro.Shiz 1.1 | 15 | 10% | 25 |
| ejb.Polaris 1.0.1 | 11 | 8% | 15 |
| stelo.MirrorNano 1.3 | 6 | 4% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.9 | 129 / 210 | 2.72 | 17.8% | 28786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 17.8% | 129 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 17 |
| wompi.Quokka 1.6 | 3.2 | 11.8% | 19 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 21 |
| ratosh.Nobo 0.21 | 4.5 | 10.9% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 8.7 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.6 | 18 / 35 | 4673 |
| 2 | 1 | 67.0 | 80.6 | 22 / 35 | 5003 |
| 3 | 1 | 68.5 | 88.6 | 26 / 35 | 4757 |
| 4 | 1 | 65.0 | 76.8 | 16 / 35 | 4575 |
| 5 | 1 | 66.0 | 77.5 | 22 / 35 | 4715 |
| 6 | 1 | 68.7 | 86.3 | 25 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 96% |
| wee.Gem 1.8.4 | 33 | 91% |
| wompi.Quokka 1.6 | 27 | 78% |
| ratosh.Nobo 0.21 | 11 | 100% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 14 | 17% | 31 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 15% | 13 |
| bzdp.Pansy 2.1 | 11 | 14% | 50 |
| wee.Gem 1.8.4 | 11 | 14% | 49 |
| ratosh.Nobo 0.21 | 11 | 14% | 23 |
| bayen.UbaMicro 1.4 | 7 | 9% | 16 |
| m3thos.Eva00 1.1 | 6 | 7% | 16 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 9 |
| maribo.FollowFire 1 | 4 | 5% | 3 |

## Melee bench: F15

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 84.8 | 117 / 210 | 2.37 | 20.4% | 45257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.4% | 117 |
| wompi.Wallaby 5.1 | 2.0 | 18.3% | 65 |
| mz.NanoGod 2.02 | 3.0 | 15.2% | 22 |
| ayk.WallHugger 1.0 | 4.0 | 10.2% | 3 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.8% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.1% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 82.9 | 19 / 35 | 7066 |
| 2 | 1 | 72.0 | 86.3 | 19 / 35 | 8149 |
| 3 | 1 | 73.6 | 92.4 | 24 / 35 | 7946 |
| 4 | 1 | 71.7 | 85.1 | 20 / 35 | 7690 |
| 5 | 1 | 71.1 | 83.8 | 20 / 35 | 7134 |
| 6 | 1 | 69.4 | 78.1 | 15 / 35 | 7272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 80% |
| mz.NanoGod 2.02 | 14 | 43% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 46% | 123 |
| mz.NanoGod 2.02 | 31 | 33% | 43 |
| ayk.WallHugger 1.0 | 8 | 9% | 20 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 15 |
| stelo.PianistNano 1.2 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.0 | 112 / 210 | 3.25 | 16.9% | 29219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 16.9% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 27 |
| dummy.micro.Sparrow 2.5 | 3.0 | 11.8% | 17 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 17 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.0% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 2 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 7 |
| ap.Frederick 1.1 | 8.8 | 6.6% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.0 | 20 / 35 | 5582 |
| 2 | 1 | 65.4 | 75.2 | 20 / 35 | 4744 |
| 3 | 1 | 67.1 | 79.4 | 20 / 35 | 5441 |
| 4 | 1 | 65.1 | 75.2 | 18 / 35 | 4591 |
| 5 | 1 | 61.2 | 63.2 | 15 / 35 | 4367 |
| 6 | 1 | 65.1 | 75.9 | 19 / 35 | 4494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 79% |
| dummy.micro.Sparrow 2.5 | 30 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 88% |
| bvh.micro.Freya 0.3 | 17 | 76% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 20% | 54 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| dl.BetterWalls 1.0 | 13 | 13% | 17 |
| conscience.Electron 1.3g | 11 | 11% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 33 |
| bvh.micro.Freya 0.3 | 9 | 9% | 24 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 11 |

## Melee bench: F17

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 88.9 | 147 / 210 | 2.00 | 21.1% | 41651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.1% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 19 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 13 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 2 |
| dsw.StaticD 1.0 | 6.2 | 8.4% | 13 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.8% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 5 |
| sample.Corners 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 93.0 | 29 / 35 | 7357 |
| 2 | 1 | 72.1 | 91.7 | 27 / 35 | 7226 |
| 3 | 1 | 69.8 | 85.4 | 22 / 35 | 6635 |
| 4 | 1 | 71.3 | 89.2 | 26 / 35 | 6777 |
| 5 | 1 | 70.1 | 85.1 | 22 / 35 | 6513 |
| 6 | 1 | 71.3 | 88.9 | 21 / 35 | 7143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 86% |
| sul.Lunar 1.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 25 | 92% |
| dsw.StaticD 1.0 | 14 | 57% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 22 | 35% | 65 |
| supersample.SuperBoxBot 1.0 | 19 | 30% | 36 |
| dsw.StaticD 1.0 | 8 | 13% | 17 |
| sul.Lunar 1.1 | 5 | 8% | 50 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 13 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| sample.Corners 1.0 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 78.5 | 117 / 210 | 2.94 | 18.1% | 37511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.1% | 117 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 26 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 8 |
| KiraNL.Chupacabra 0.4 | 6.0 | 9.2% | 4 |
| sample.Walls 1.0 | 6.8 | 8.2% | 9 |
| GarmBox.Oranges 1.0 | 8.0 | 7.6% | 2 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 3 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 70.8 | 16 / 35 | 5795 |
| 2 | 1 | 66.3 | 76.2 | 16 / 35 | 6049 |
| 3 | 1 | 70.4 | 88.9 | 25 / 35 | 6836 |
| 4 | 1 | 66.1 | 73.3 | 19 / 35 | 6178 |
| 5 | 1 | 67.6 | 80.0 | 19 / 35 | 6177 |
| 6 | 1 | 68.7 | 81.6 | 22 / 35 | 6476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 91% |
| radnor.DoctorBob 1.42 | 37 | 76% |
| mld.Wisdom 1.0 | 20 | 60% |
| sample.Walls 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 506. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 28% | 37 |
| radnor.DoctorBob 1.42 | 22 | 24% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 62 |
| amz.NanoClone 1.41 | 13 | 14% | 18 |
| KiraNL.Chupacabra 0.4 | 7 | 8% | 16 |
| GarmBox.Oranges 1.0 | 3 | 3% | 7 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 5 |

