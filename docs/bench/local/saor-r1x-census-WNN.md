# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.1 | 147 / 210 | 2.07 | 21.0% | 41496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 21.0% | 147 |
| radnor.DoctorBob 1.42 | 2.7 | 14.4% | 27 |
| mld.Infinity 2.2 | 3.2 | 12.8% | 12 |
| mz.AntiGrav 1.0 | 3.2 | 13.7% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 7 |
| sample.Walls 1.0 | 6.7 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.5% | 0 |
| sample.Target 1.0 | 9.5 | 3.9% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.7 | 23 / 35 | 7429 |
| 2 | 1 | 71.4 | 85.7 | 25 / 35 | 6811 |
| 3 | 1 | 72.1 | 90.5 | 27 / 35 | 7116 |
| 4 | 1 | 70.7 | 85.4 | 21 / 35 | 6511 |
| 5 | 1 | 72.0 | 88.9 | 26 / 35 | 6724 |
| 6 | 1 | 71.5 | 86.7 | 25 / 35 | 6905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 90% |
| radnor.DoctorBob 1.42 | 44 | 91% |
| mld.Infinity 2.2 | 37 | 95% |
| amz.NanoClone 1.41 | 9 | 56% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 19 | 29% | 65 |
| radnor.DoctorBob 1.42 | 17 | 26% | 69 |
| amz.NanoClone 1.41 | 11 | 17% | 15 |
| mld.Infinity 2.2 | 8 | 12% | 35 |
| sample.Walls 1.0 | 4 | 6% | 9 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.2 | 122 / 210 | 2.24 | 18.5% | 30569 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 18.5% | 122 |
| mld.DustBunny 3.8 | 2.5 | 13.7% | 18 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.1% | 51 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 6 |
| zyx.nano.Ant 1.1 | 5.5 | 9.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.3% | 8 |
| bzdp.BoxCar 2.0 | 8.3 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 5.8% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 21 / 35 | 5094 |
| 2 | 1 | 70.8 | 94.0 | 26 / 35 | 5652 |
| 3 | 1 | 65.7 | 77.8 | 15 / 35 | 5068 |
| 4 | 1 | 68.5 | 87.6 | 23 / 35 | 5066 |
| 5 | 1 | 66.7 | 83.2 | 16 / 35 | 4869 |
| 6 | 1 | 68.3 | 88.6 | 21 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 60 | 87% |
| oog.melee.Mercutio 1.0 | 60 | 65% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| maribo.melee.BMV 0.1 | 3 | 33% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 32% | 74 |
| mld.DustBunny 3.8 | 22 | 25% | 65 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 17 |
| maribo.melee.BMV 0.1 | 9 | 10% | 12 |
| fullsail.SweetTea 1.1 | 6 | 7% | 11 |
| zyx.nano.Ant 1.1 | 5 | 6% | 11 |
| cs.Grudge 1.0 | 5 | 6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 76.9 | 104 / 210 | 3.08 | 18.1% | 34286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 18.1% | 104 |
| myl.micro.Troodon 1.10 | 2.0 | 15.2% | 52 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.1% | 23 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.4% | 7 |
| fm.mammillarias 1.3 | 5.2 | 9.9% | 10 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.4% | 9 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.6% | 2 |
| sp.Nanos.Ember 1.1 | 8.5 | 6.5% | 2 |
| sample.Fire 1.0 | 9.2 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 74.0 | 13 / 35 | 5925 |
| 2 | 1 | 66.0 | 71.7 | 16 / 35 | 5420 |
| 3 | 1 | 70.0 | 86.0 | 20 / 35 | 6271 |
| 4 | 1 | 70.4 | 86.3 | 24 / 35 | 6155 |
| 5 | 1 | 65.2 | 70.5 | 16 / 35 | 5091 |
| 6 | 1 | 65.8 | 72.7 | 15 / 35 | 5424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 29 | 72% |
| cb.nano.Insomnia 1.0 | 20 | 95% |
| myl.nano.KomoriNinja 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 6 | 83% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 29 | 27% | 41 |
| myl.micro.Troodon 1.10 | 21 | 20% | 68 |
| cb.nano.Insomnia 1.0 | 17 | 16% | 19 |
| fm.mammillarias 1.3 | 15 | 14% | 16 |
| myl.nano.KomoriNinja 1.1 | 10 | 9% | 31 |
| cs.sheldor.Talon 1.1 | 8 | 8% | 12 |
| sample.Tracker 1.0 | 3 | 3% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 14 |
| sample.Fire 1.0 | 1 | 1% | 6 |

## Melee bench: F04

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.3 | 156 / 210 | 2.06 | 20.7% | 38333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 20.7% | 156 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.9% | 19 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.4% | 8 |
| tj.zombie1n 1.0.1 | 4.7 | 9.0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 7.8% | 4 |
| yk.JahMicro 1.0 | 7.8 | 7.2% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.4 | 22 / 35 | 6241 |
| 2 | 1 | 72.2 | 94.0 | 30 / 35 | 6401 |
| 3 | 1 | 72.1 | 92.4 | 29 / 35 | 6685 |
| 4 | 1 | 71.4 | 91.1 | 28 / 35 | 6275 |
| 5 | 1 | 69.7 | 85.1 | 24 / 35 | 6282 |
| 6 | 1 | 70.1 | 87.6 | 23 / 35 | 6449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 75 | 89% |
| stelo.SoJNanoMelee 1.1 | 38 | 89% |
| tvv.micro.Antares 1.1.1 | 25 | 100% |
| tj.zombie1n 1.0.1 | 9 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 48% | 107 |
| stelo.SoJNanoMelee 1.1 | 10 | 19% | 26 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 28 |
| repositorio.NanoStep 1.0 | 4 | 7% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 6% | 11 |
| tj.zombie1n 1.0.1 | 2 | 4% | 5 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.0 | 75 / 210 | 4.06 | 14.8% | 26744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 14.8% | 75 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 37 |
| ahf.NanoAndrew .4 | 3.7 | 11.3% | 32 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.6% | 25 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 12 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.3% | 13 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.9 | 12 / 35 | 5135 |
| 2 | 1 | 61.2 | 64.8 | 11 / 35 | 4362 |
| 3 | 1 | 59.4 | 59.7 | 13 / 35 | 4070 |
| 4 | 1 | 60.7 | 65.4 | 8 / 35 | 4423 |
| 5 | 1 | 61.6 | 66.0 | 14 / 35 | 4358 |
| 6 | 1 | 63.7 | 72.1 | 17 / 35 | 4396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 58% |
| simonton.nano.MeleeSeed 1.8 | 22 | 91% |
| ahf.NanoAndrew .4 | 20 | 65% |
| sam.Samspin 1.0 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| EBBU.Sim2 1.02 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 5 | 20% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 17% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 21 | 15% | 21 |
| robar.nano.Assertive_Melee 0.2 | 19 | 14% | 21 |
| ahf.NanoAndrew .4 | 18 | 13% | 32 |
| simonton.nano.MeleeSeed 1.8 | 15 | 11% | 35 |
| EBBU.Sim2 1.02 | 15 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 10 | 7% | 15 |
| sample.TrackFire 1.0 | 8 | 6% | 8 |
| sam.Samspin 1.0 | 7 | 5% | 14 |

## Melee bench: F06

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.4 | 129 / 210 | 2.31 | 18.8% | 31410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 18.8% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.3% | 40 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.5% | 5 |
| fm.claire 1.7 | 6.7 | 8.0% | 1 |
| sample.SpinBot 1.0 | 7.0 | 7.9% | 5 |
| pa.Improved 1.0 | 9.3 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.3 | 20 / 35 | 5365 |
| 2 | 1 | 67.8 | 84.8 | 20 / 35 | 5100 |
| 3 | 1 | 68.9 | 87.3 | 24 / 35 | 5160 |
| 4 | 1 | 68.6 | 86.3 | 20 / 35 | 5671 |
| 5 | 1 | 68.5 | 86.0 | 23 / 35 | 5170 |
| 6 | 1 | 68.0 | 87.6 | 22 / 35 | 4944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 85% |
| oog.melee.CapuletDroid 1.1 | 27 | 89% |
| gh.nano.Grofvuil 0.2 | 20 | 95% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 5 | 80% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 30% | 76 |
| gh.nano.Grofvuil 0.2 | 13 | 16% | 33 |
| oog.melee.CapuletDroid 1.1 | 11 | 13% | 37 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 16 |
| sample.SpinBot 1.0 | 8 | 10% | 12 |
| fm.claire 1.7 | 7 | 9% | 9 |
| kurios.DOSexe .9b | 4 | 5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 10 |
| pa.Improved 1.0 | 2 | 2% | 7 |

## Melee bench: F07

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 78.9 | 96 / 210 | 2.90 | 17.4% | 32698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 17.4% | 96 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.8% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.9% | 36 |
| mz.MicroGodMelee 1 | 3.3 | 12.9% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.7% | 2 |
| fire219.CatBot 1.0 | 8.5 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 3 |
| el.JumpShoot 0.2 | 9.0 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.8 | 19 / 35 | 5918 |
| 2 | 1 | 66.5 | 79.0 | 16 / 35 | 5379 |
| 3 | 1 | 64.3 | 73.0 | 15 / 35 | 4855 |
| 4 | 1 | 65.5 | 75.2 | 15 / 35 | 5290 |
| 5 | 1 | 67.0 | 80.6 | 15 / 35 | 5591 |
| 6 | 1 | 67.1 | 80.6 | 16 / 35 | 5665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 81% |
| mz.MicroGodMelee 1 | 37 | 51% |
| gh.micro.Gruweltje 0.7 | 27 | 70% |
| DBall.Anarchy 0.1 | 11 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 31 | 27% | 50 |
| spinnercat.micro.Tyger 0.1 | 26 | 23% | 59 |
| gh.micro.Gruweltje 0.7 | 17 | 15% | 38 |
| acogdev.alpha 0.2 | 15 | 13% | 18 |
| caimano.Furia_Ceca 0.22 | 14 | 12% | 18 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |

## Melee bench: F08

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.6 | 96 / 210 | 3.55 | 16.2% | 29533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.3 | 16.2% | 96 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 12.8% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 5 |
| germ.TheMind .2 | 5.0 | 9.8% | 10 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 0 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 8 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 74.0 | 17 / 35 | 4756 |
| 2 | 1 | 66.5 | 79.0 | 20 / 35 | 5218 |
| 3 | 2 | 62.5 | 67.6 | 10 / 35 | 4706 |
| 4 | 1 | 63.2 | 68.3 | 15 / 35 | 4645 |
| 5 | 1 | 65.7 | 73.7 | 20 / 35 | 5454 |
| 6 | 1 | 62.9 | 67.3 | 14 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 73% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 71% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 9 | 67% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 40% | 87 |
| germ.TheMind .2 | 16 | 14% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 11% | 29 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 16 |
| awesomeness.Elite 1.0 | 9 | 8% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 13 |
| mym.EdgeStalker 1.0 | 5 | 4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 3 | 3% | 13 |

## Melee bench: F09

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.4 | 133 / 210 | 2.31 | 18.9% | 29228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 18.9% | 133 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 15 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 4 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 17 |
| ratosh.Wesco 1.4 | 6.0 | 9.3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 9.0% | 0 |
| stelo.PatternRobot 1.0 | 7.7 | 7.9% | 6 |
| spinnercat.Omen 1.0 | 8.8 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 20 / 35 | 4556 |
| 2 | 1 | 71.1 | 92.4 | 25 / 35 | 5141 |
| 3 | 1 | 69.2 | 85.7 | 25 / 35 | 5213 |
| 4 | 1 | 70.7 | 90.5 | 25 / 35 | 4953 |
| 5 | 1 | 64.6 | 73.3 | 15 / 35 | 4186 |
| 6 | 1 | 69.3 | 87.0 | 23 / 35 | 5179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 68 | 90% |
| nz.jdc.nano.GridFu 1.0 | 32 | 94% |
| ratosh.Wesco 1.4 | 12 | 83% |
| maribo.IotaCT 1.1 | 11 | 91% |
| stelo.PatternRobot 1.0 | 10 | 80% |
| timmit.nano.TimDog 0.33 | 10 | 70% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 30% | 71 |
| stelo.PatternRobot 1.0 | 18 | 23% | 24 |
| ratosh.Wesco 1.4 | 9 | 12% | 19 |
| timmit.nano.TimDog 0.33 | 9 | 12% | 19 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 40 |
| maribo.IotaCT 1.1 | 4 | 5% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 8 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.6 | 148 / 210 | 2.11 | 20.3% | 37525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 20.3% | 148 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 21 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 7 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 13 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.6% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.7% | 2 |
| sanja.First 0.1 | 6.7 | 8.5% | 2 |
| cvt.Firsty 1.0 | 7.0 | 8.1% | 12 |
| amk.Punbot.Punbot 0.01 | 9.0 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 82.9 | 22 / 35 | 5986 |
| 2 | 1 | 70.2 | 86.3 | 26 / 35 | 6350 |
| 3 | 1 | 70.2 | 87.9 | 25 / 35 | 6009 |
| 4 | 1 | 70.1 | 90.5 | 26 / 35 | 6016 |
| 5 | 1 | 70.0 | 87.3 | 24 / 35 | 6264 |
| 6 | 1 | 71.3 | 90.8 | 25 / 35 | 6900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 91% |
| cvt.Firsty 1.0 | 31 | 84% |
| baal.nano.N 1.42 | 26 | 92% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 94% |
| zyx.micro.Ant 1.1 | 15 | 80% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 26 | 41% | 47 |
| tvv.nano.Polaris 1.2 | 8 | 13% | 48 |
| cvt.Firsty 1.0 | 7 | 11% | 24 |
| Grystrion.TrackerWO 1.0 | 7 | 11% | 14 |
| baal.nano.N 1.42 | 5 | 8% | 30 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 8 |
| sanja.First 0.1 | 3 | 5% | 26 |
| sample.RamFire 1.0 | 2 | 3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 65.7 | 83 / 210 | 4.09 | 15.0% | 30191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.5 | 15.0% | 83 |
| kc.micro.Figment 1.0 | 1.5 | 14.7% | 59 |
| cs.Wren 1.0 | 3.8 | 11.7% | 25 |
| js.PinBall 1.6 | 4.2 | 11.7% | 17 |
| mz.Cork 0.1 | 4.3 | 11.4% | 10 |
| joe.ADinosaur 1.0 | 5.7 | 9.9% | 8 |
| evd.X1 0.01 | 7.0 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 2 |
| PSW.Relentless 0.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.7 | 60.6 | 12 / 35 | 4940 |
| 2 | 2 | 63.6 | 69.2 | 16 / 35 | 5024 |
| 3 | 2 | 62.1 | 63.5 | 12 / 35 | 5259 |
| 4 | 2 | 59.1 | 59.4 | 11 / 35 | 4450 |
| 5 | 1 | 63.5 | 70.2 | 19 / 35 | 4828 |
| 6 | 1 | 64.7 | 71.4 | 13 / 35 | 5690 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 81% |
| cs.Wren 1.0 | 16 | 88% |
| mz.Cork 0.1 | 12 | 92% |
| joe.ADinosaur 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 4 | 100% |
| js.PinBall 1.6 | 4 | 75% |
| evd.X1 0.01 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 46% | 108 |
| js.PinBall 1.6 | 17 | 13% | 25 |
| evd.X1 0.01 | 14 | 11% | 14 |
| joe.ADinosaur 1.0 | 13 | 10% | 15 |
| cs.Wren 1.0 | 10 | 8% | 18 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| mz.Cork 0.1 | 5 | 4% | 14 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.6 | 114 / 210 | 2.93 | 17.6% | 28493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 17.6% | 114 |
| myl.nano.Graviton 1.10 | 2.2 | 12.0% | 27 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.4% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.9% | 8 |
| disan.Chair 2.2.0 | 7.3 | 8.0% | 11 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 6.3% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.6 | 17 / 35 | 4788 |
| 2 | 1 | 67.1 | 81.6 | 22 / 35 | 4813 |
| 3 | 1 | 71.3 | 94.0 | 28 / 35 | 5280 |
| 4 | 1 | 62.5 | 66.7 | 13 / 35 | 4645 |
| 5 | 1 | 68.0 | 85.1 | 23 / 35 | 4688 |
| 6 | 1 | 61.0 | 63.5 | 11 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 83% |
| stelo.AreaTargetingBot 1.1 | 32 | 88% |
| ntc.Opposite 1.5 | 16 | 88% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 7 | 86% |
| donjezza.Muncho 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 21% | 49 |
| stelo.AreaTargetingBot 1.1 | 15 | 15% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 14% | 26 |
| pfvicm.Sobieski 7.2.3b | 14 | 14% | 21 |
| ntc.Opposite 1.5 | 11 | 11% | 29 |
| disan.Chair 2.2.0 | 7 | 7% | 18 |
| DBall.NUKE 0.1 | 7 | 7% | 14 |
| pbg.R2D2 1.0 | 5 | 5% | 10 |
| donjezza.Muncho 1.0 | 4 | 4% | 10 |

## Melee bench: F13

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.0 | 70 / 210 | 3.52 | 15.6% | 26420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.5 | 15.6% | 70 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 38 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 29 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 16 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.0 | 16 / 35 | 4497 |
| 2 | 1 | 65.4 | 76.8 | 12 / 35 | 4578 |
| 3 | 3 | 59.0 | 59.0 | 8 / 35 | 3773 |
| 4 | 1 | 66.0 | 75.6 | 15 / 35 | 4728 |
| 5 | 2 | 62.9 | 66.7 | 10 / 35 | 4304 |
| 6 | 1 | 65.0 | 74.9 | 9 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 57% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 72% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 31% | 60 |
| yagami.Tidus 0.11 | 30 | 21% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 35 |
| kawigi.micro.Shiz 1.1 | 16 | 11% | 36 |
| ejb.Polaris 1.0.1 | 12 | 9% | 17 |
| stelo.MirrorNano 1.3 | 9 | 6% | 9 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 6 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.8 | 116 / 210 | 3.18 | 16.7% | 26591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 16.7% | 116 |
| bzdp.Pansy 2.1 | 2.7 | 12.6% | 28 |
| wee.Gem 1.8.4 | 3.0 | 12.1% | 28 |
| wompi.Quokka 1.6 | 4.2 | 11.1% | 12 |
| ratosh.Nobo 0.21 | 5.0 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.2 | 21 / 35 | 4880 |
| 2 | 1 | 62.5 | 67.0 | 18 / 35 | 4314 |
| 3 | 1 | 64.2 | 74.6 | 18 / 35 | 4322 |
| 4 | 1 | 63.1 | 68.3 | 16 / 35 | 4198 |
| 5 | 1 | 66.1 | 79.4 | 19 / 35 | 4640 |
| 6 | 1 | 66.7 | 83.5 | 24 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 81% |
| wee.Gem 1.8.4 | 37 | 97% |
| wompi.Quokka 1.6 | 18 | 100% |
| ratosh.Nobo 0.21 | 13 | 69% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 24 | 25% | 63 |
| m3thos.Eva00 1.1 | 11 | 12% | 20 |
| ratosh.Nobo 0.21 | 11 | 12% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 12% | 12 |
| maribo.FollowFire 1 | 10 | 11% | 10 |
| wompi.Quokka 1.6 | 9 | 9% | 22 |
| bayen.UbaMicro 1.4 | 8 | 8% | 15 |
| wee.Gem 1.8.4 | 6 | 6% | 42 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.6 | 135 / 210 | 1.94 | 21.5% | 45937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 21.5% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 41 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 24 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 7 |
| ayk.WallHugger 1.0 | 5.2 | 8.8% | 0 |
| stuff.Vlad 0.1 | 5.3 | 8.7% | 3 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 91.4 | 25 / 35 | 7661 |
| 2 | 1 | 72.5 | 88.9 | 20 / 35 | 7741 |
| 3 | 1 | 72.4 | 88.6 | 23 / 35 | 7517 |
| 4 | 1 | 72.9 | 88.3 | 21 / 35 | 7784 |
| 5 | 1 | 74.6 | 95.6 | 26 / 35 | 8447 |
| 6 | 1 | 70.9 | 84.8 | 20 / 35 | 6787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 84% |
| mz.NanoGod 2.02 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 17 | 76% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 33% |
| sample.SittingDuck 1.0 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 45% | 128 |
| mz.NanoGod 2.02 | 21 | 27% | 41 |
| exauge.GateKeeper 1.1.121g | 13 | 17% | 17 |
| ayk.WallHugger 1.0 | 4 | 5% | 9 |
| stuff.Vlad 0.1 | 2 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.1 | 102 / 210 | 3.69 | 16.1% | 28690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 16.1% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.0% | 25 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 24 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.4% | 28 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.7% | 3 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 0 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 12 |
| dl.BetterWalls 1.0 | 9.2 | 6.3% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 70.2 | 16 / 35 | 4701 |
| 2 | 1 | 64.5 | 72.4 | 17 / 35 | 4930 |
| 3 | 1 | 61.7 | 63.2 | 16 / 35 | 4335 |
| 4 | 1 | 62.3 | 64.4 | 15 / 35 | 4697 |
| 5 | 1 | 65.8 | 73.3 | 18 / 35 | 5211 |
| 6 | 1 | 65.8 | 77.1 | 20 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 31 | 90% |
| voidious.micro.BlitzBat 1.05 | 29 | 90% |
| dummy.micro.Sparrow 2.5 | 23 | 96% |
| bvh.micro.Freya 0.3 | 16 | 81% |
| ap.Frederick 1.1 | 10 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 20 |
| conscience.Electron 1.3g | 18 | 17% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 43 |
| dummy.micro.Sparrow 2.5 | 11 | 10% | 33 |
| bvh.micro.Freya 0.3 | 11 | 10% | 19 |
| dl.BetterWalls 1.0 | 7 | 6% | 14 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 8 |

## Melee bench: F17

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.2 | 132 / 210 | 2.51 | 20.2% | 40285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 20.2% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 14.2% | 24 |
| supersample.SuperBoxBot 1.0 | 3.2 | 11.7% | 19 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.6% | 2 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.9% | 6 |
| sample.Corners 1.0 | 8.7 | 5.9% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 9.3 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 85.4 | 23 / 35 | 7159 |
| 2 | 1 | 71.8 | 87.9 | 25 / 35 | 7197 |
| 3 | 1 | 70.6 | 85.4 | 23 / 35 | 6676 |
| 4 | 1 | 69.9 | 79.7 | 22 / 35 | 7132 |
| 5 | 1 | 68.0 | 78.7 | 19 / 35 | 5937 |
| 6 | 1 | 69.1 | 81.9 | 20 / 35 | 6184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 93% |
| sul.Lunar 1.1 | 34 | 100% |
| supersample.SuperBoxBot 1.0 | 27 | 81% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| dsw.StaticD 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 41 | 53% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 19% | 55 |
| sul.Lunar 1.1 | 5 | 6% | 39 |
| dsw.StaticD 1.0 | 4 | 5% | 18 |
| sample.MyFirstRobot 1.0 | 4 | 5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 13 |
| sample.Corners 1.0 | 1 | 1% | 4 |

## Melee bench: F18

hadur117.micro.SaorWNN 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 80.3 | 104 / 210 | 2.77 | 18.4% | 38138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNN 0.1 | 1.0 | 18.4% | 104 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 35 |
| mld.Wisdom 1.0 | 3.0 | 12.6% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.6% | 25 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.4% | 9 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 8 |
| sample.Walls 1.0 | 7.5 | 7.6% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.1% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 18 / 35 | 6422 |
| 2 | 1 | 68.2 | 80.6 | 16 / 35 | 6542 |
| 3 | 1 | 67.4 | 82.5 | 18 / 35 | 5766 |
| 4 | 1 | 67.1 | 77.5 | 13 / 35 | 6705 |
| 5 | 1 | 67.9 | 78.1 | 20 / 35 | 6213 |
| 6 | 1 | 68.3 | 81.0 | 19 / 35 | 6490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 82% |
| radnor.DoctorBob 1.42 | 33 | 73% |
| mld.Wisdom 1.0 | 21 | 57% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 5 | 60% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 28% | 45 |
| radnor.DoctorBob 1.42 | 23 | 22% | 50 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 16% | 53 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 23 |
| amz.NanoClone 1.41 | 10 | 9% | 15 |
| jangs.ns51 1.0 | 5 | 5% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| sample.Walls 1.0 | 2 | 2% | 6 |

