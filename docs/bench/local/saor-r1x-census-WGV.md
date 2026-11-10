# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.8 | 152 / 210 | 1.92 | 21.5% | 43844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 21.5% | 152 |
| mz.AntiGrav 1.0 | 2.3 | 14.3% | 18 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 21 |
| mld.Infinity 2.2 | 4.0 | 12.5% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 4 |
| sample.Walls 1.0 | 6.5 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 3.9% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.6 | 24 / 35 | 7431 |
| 2 | 1 | 73.0 | 90.8 | 27 / 35 | 7470 |
| 3 | 1 | 72.0 | 88.6 | 25 / 35 | 7339 |
| 4 | 1 | 72.9 | 90.8 | 26 / 35 | 7289 |
| 5 | 1 | 72.2 | 89.8 | 25 / 35 | 7113 |
| 6 | 1 | 72.5 | 91.1 | 25 / 35 | 7202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 95% |
| mld.Infinity 2.2 | 38 | 95% |
| radnor.DoctorBob 1.42 | 37 | 86% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 44% | 68 |
| mz.AntiGrav 1.0 | 14 | 24% | 71 |
| amz.NanoClone 1.41 | 8 | 14% | 13 |
| mld.Infinity 2.2 | 6 | 10% | 41 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| sample.Walls 1.0 | 1 | 2% | 8 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 133 / 210 | 2.05 | 19.2% | 33056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.2% | 133 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 37 |
| mld.DustBunny 3.8 | 3.2 | 12.5% | 17 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.0% | 10 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.1% | 5 |
| bzdp.BoxCar 2.0 | 7.5 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 9.2 | 5.6% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.4 | 25 / 35 | 5522 |
| 2 | 1 | 70.1 | 92.4 | 26 / 35 | 5797 |
| 3 | 1 | 67.7 | 85.7 | 17 / 35 | 5213 |
| 4 | 1 | 67.8 | 83.5 | 18 / 35 | 5528 |
| 5 | 1 | 69.1 | 91.7 | 24 / 35 | 5374 |
| 6 | 1 | 68.7 | 84.4 | 23 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 49 | 84% |
| oog.melee.Mercutio 1.0 | 49 | 80% |
| djdjdj.NanoSkunk10 1.0 | 17 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 93% |
| maribo.melee.BMV 0.1 | 14 | 86% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 27% | 64 |
| mld.DustBunny 3.8 | 19 | 24% | 53 |
| maribo.melee.BMV 0.1 | 8 | 10% | 18 |
| zyx.nano.Ant 1.1 | 8 | 10% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 8% | 20 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 23 |
| fullsail.SweetTea 1.1 | 5 | 6% | 11 |
| bzdp.BoxCar 2.0 | 5 | 6% | 6 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 82.4 | 111 / 210 | 2.59 | 19.3% | 37656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.3% | 111 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.2% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.3% | 28 |
| fm.mammillarias 1.3 | 5.7 | 8.9% | 2 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.1% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 3 |
| sample.Fire 1.0 | 9.0 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 83.2 | 19 / 35 | 6765 |
| 2 | 1 | 66.3 | 76.5 | 13 / 35 | 5394 |
| 3 | 1 | 69.1 | 84.1 | 18 / 35 | 6235 |
| 4 | 1 | 68.7 | 81.3 | 20 / 35 | 6096 |
| 5 | 1 | 68.8 | 80.6 | 17 / 35 | 6123 |
| 6 | 1 | 71.7 | 88.6 | 24 / 35 | 7043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 66% |
| cb.nano.Insomnia 1.0 | 15 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 27 | 27% | 65 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 25% | 46 |
| cb.nano.Insomnia 1.0 | 14 | 14% | 17 |
| fm.mammillarias 1.3 | 13 | 13% | 14 |
| myl.nano.KomoriNinja 1.1 | 9 | 9% | 35 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 11 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 16 |
| sample.Fire 1.0 | 1 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.6 | 148 / 210 | 1.93 | 20.9% | 39519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 20.9% | 148 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.8% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.2% | 19 |
| tj.zombie1n 1.0.1 | 5.2 | 8.8% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.2% | 4 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 2 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.0 | 25 / 35 | 6327 |
| 2 | 1 | 68.9 | 79.4 | 23 / 35 | 6524 |
| 3 | 1 | 72.8 | 96.8 | 30 / 35 | 7083 |
| 4 | 1 | 71.3 | 90.5 | 24 / 35 | 7034 |
| 5 | 1 | 70.3 | 87.9 | 23 / 35 | 6423 |
| 6 | 1 | 70.1 | 90.2 | 23 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 90% |
| stelo.SoJNanoMelee 1.1 | 44 | 82% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| yk.JahMicro 1.0 | 11 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 37% | 83 |
| stelo.SoJNanoMelee 1.1 | 16 | 26% | 44 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 17 |
| tj.zombie1n 1.0.1 | 4 | 6% | 9 |
| yk.JahMicro 1.0 | 2 | 3% | 12 |
| repositorio.NanoStep 1.0 | 2 | 3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 6 |
| sample.VelociRobot 1.0 | 2 | 3% | 5 |

## Melee bench: F05

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.9 | 92 / 210 | 3.17 | 16.9% | 31106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 16.9% | 92 |
| oog.melee.Corsair 1.0 | 2.5 | 13.0% | 38 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 17 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 25 |
| EBBU.Sim2 1.02 | 5.3 | 9.7% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.5% | 13 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.7% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.7 | 19 / 35 | 5237 |
| 2 | 1 | 67.7 | 81.6 | 20 / 35 | 5661 |
| 3 | 1 | 66.7 | 80.6 | 17 / 35 | 5304 |
| 4 | 1 | 63.2 | 72.1 | 9 / 35 | 4885 |
| 5 | 1 | 65.1 | 73.7 | 15 / 35 | 5446 |
| 6 | 1 | 61.6 | 67.6 | 12 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 97% |
| oog.melee.Corsair 1.0 | 27 | 56% |
| ahf.NanoAndrew .4 | 24 | 83% |
| EBBU.Sim2 1.02 | 10 | 80% |
| sam.Samspin 1.0 | 9 | 78% |
| robar.nano.Assertive_Melee 0.2 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 23 | 19% | 23 |
| oog.melee.Corsair 1.0 | 22 | 19% | 45 |
| ahf.NanoAndrew .4 | 18 | 15% | 40 |
| EBBU.Sim2 1.02 | 18 | 15% | 23 |
| sam.Samspin 1.0 | 10 | 8% | 17 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 36 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 14 |
| sample.TrackFire 1.0 | 6 | 5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.7 | 125 / 210 | 2.47 | 18.5% | 31617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 18.5% | 125 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.3% | 27 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.6% | 19 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.7% | 20 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.6% | 5 |
| fm.claire 1.7 | 6.7 | 8.4% | 6 |
| sample.SpinBot 1.0 | 7.3 | 7.2% | 2 |
| pa.Improved 1.0 | 8.8 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 76.2 | 15 / 35 | 5155 |
| 2 | 1 | 68.2 | 81.9 | 23 / 35 | 5508 |
| 3 | 1 | 67.7 | 84.1 | 20 / 35 | 5223 |
| 4 | 1 | 66.4 | 81.9 | 17 / 35 | 4931 |
| 5 | 1 | 67.8 | 84.1 | 20 / 35 | 5208 |
| 6 | 1 | 70.8 | 93.7 | 30 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 91% |
| oog.melee.CapuletDroid 1.1 | 23 | 100% |
| arthord.NanoSatanMelee Beta | 17 | 94% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| fm.claire 1.7 | 8 | 88% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 86 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 26% | 73 |
| gh.nano.Grofvuil 0.2 | 16 | 19% | 32 |
| fm.claire 1.7 | 13 | 15% | 21 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 30 |
| arthord.NanoSatanMelee Beta | 10 | 12% | 15 |
| sample.SpinBot 1.0 | 8 | 9% | 14 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 14 |
| kurios.DOSexe .9b | 3 | 3% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.6 | 92 / 210 | 2.84 | 17.6% | 34027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.6% | 92 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.6% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 34 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 3 |
| el.JumpShoot 0.2 | 7.3 | 6.7% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.9% | 4 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 0 |
| fire219.CatBot 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.8 | 15 / 35 | 5780 |
| 2 | 1 | 65.3 | 72.7 | 15 / 35 | 5385 |
| 3 | 1 | 68.8 | 85.4 | 18 / 35 | 5939 |
| 4 | 1 | 66.1 | 78.7 | 11 / 35 | 5475 |
| 5 | 1 | 66.5 | 78.1 | 15 / 35 | 5894 |
| 6 | 1 | 67.0 | 78.7 | 18 / 35 | 5554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 82% |
| mz.MicroGodMelee 1 | 37 | 59% |
| gh.micro.Gruweltje 0.7 | 16 | 63% |
| DBall.Anarchy 0.1 | 11 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 75% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 29% | 50 |
| mz.MicroGodMelee 1 | 34 | 29% | 52 |
| spinnercat.micro.Tyger 0.1 | 25 | 21% | 64 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 10 |
| acogdev.alpha 0.2 | 6 | 5% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 6 |
| fire219.CatBot 1.0 | 4 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 0 | 0% | 11 |

## Melee bench: F08

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.1 | 88 / 210 | 3.87 | 15.4% | 30431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.9% | 51 |
| hadur117.micro.SaorWGV 0.1 | 1.7 | 15.4% | 88 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 30 |
| germ.TheMind .2 | 4.8 | 10.1% | 16 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.3% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.9% | 3 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 6 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 8 |
| sample.Crazy 1.0 | 8.7 | 6.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 70.2 | 16 / 35 | 5488 |
| 2 | 1 | 67.0 | 75.9 | 19 / 35 | 5951 |
| 3 | 2 | 62.6 | 68.9 | 13 / 35 | 4475 |
| 4 | 3 | 59.5 | 58.7 | 12 / 35 | 4504 |
| 5 | 1 | 61.4 | 64.1 | 12 / 35 | 4954 |
| 6 | 2 | 64.4 | 70.8 | 16 / 35 | 5059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 86% |
| germ.TheMind .2 | 15 | 60% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 33% |
| awesomeness.Elite 1.0 | 3 | 67% |

Hadur died in 122 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 40% | 93 |
| germ.TheMind .2 | 22 | 18% | 29 |
| stelo.UntouchableNano 1.3 | 12 | 10% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 9% | 32 |
| awesomeness.Elite 1.0 | 11 | 9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 7 |
| mym.EdgeStalker 1.0 | 3 | 2% | 4 |
| sample.Crazy 1.0 | 2 | 2% | 5 |

## Melee bench: F09

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.5 | 146 / 210 | 2.04 | 19.7% | 31206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.7% | 146 |
| rz.HawkOnFire 0.1 | 2.3 | 13.2% | 19 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.4% | 3 |
| maribo.IotaCT 1.1 | 5.0 | 10.2% | 9 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 10 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.3% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 22 / 35 | 4986 |
| 2 | 1 | 71.3 | 92.1 | 27 / 35 | 5344 |
| 3 | 1 | 69.8 | 87.9 | 25 / 35 | 5435 |
| 4 | 1 | 70.3 | 90.8 | 23 / 35 | 5337 |
| 5 | 1 | 69.0 | 86.3 | 25 / 35 | 5031 |
| 6 | 1 | 70.0 | 88.6 | 24 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 88% |
| nz.jdc.nano.GridFu 1.0 | 48 | 100% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| maribo.IotaCT 1.1 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 91% |
| ratosh.Wesco 1.4 | 7 | 71% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 21% | 59 |
| timmit.nano.TimDog 0.33 | 13 | 20% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 14% | 15 |
| ratosh.Wesco 1.4 | 8 | 12% | 20 |
| nz.jdc.nano.GridFu 1.0 | 7 | 11% | 59 |
| stelo.PatternRobot 1.0 | 7 | 11% | 13 |
| maribo.IotaCT 1.1 | 5 | 8% | 14 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.9 | 170 / 210 | 1.55 | 21.5% | 38845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 21.5% | 170 |
| baal.nano.N 1.42 | 2.5 | 11.4% | 6 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.6% | 10 |
| Grystrion.TrackerWO 1.0 | 3.8 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 9.0% | 8 |
| sanja.First 0.1 | 6.0 | 8.7% | 6 |
| squidM.TentalceMeleeNano 1.1 | 6.2 | 8.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.2% | 2 |
| cvt.Firsty 1.0 | 8.7 | 6.8% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.3 | 29 / 35 | 6433 |
| 2 | 1 | 71.8 | 94.6 | 30 / 35 | 6469 |
| 3 | 1 | 72.3 | 95.2 | 30 / 35 | 6715 |
| 4 | 1 | 71.1 | 92.7 | 27 / 35 | 6461 |
| 5 | 1 | 71.9 | 95.2 | 30 / 35 | 6433 |
| 6 | 1 | 70.3 | 91.1 | 24 / 35 | 6334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 100% |
| baal.nano.N 1.42 | 38 | 92% |
| sanja.First 0.1 | 27 | 89% |
| cvt.Firsty 1.0 | 22 | 100% |
| zyx.micro.Ant 1.1 | 20 | 90% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 92% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 38% | 39 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 50 |
| baal.nano.N 1.42 | 5 | 13% | 46 |
| sanja.First 0.1 | 5 | 13% | 24 |
| cvt.Firsty 1.0 | 4 | 10% | 23 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 11 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 63.5 | 66 / 210 | 4.29 | 14.1% | 28805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.7% | 86 |
| hadur117.micro.SaorWGV 0.1 | 2.3 | 14.1% | 66 |
| cs.Wren 1.0 | 2.7 | 12.8% | 19 |
| mz.Cork 0.1 | 4.2 | 11.5% | 19 |
| js.PinBall 1.6 | 4.8 | 10.6% | 7 |
| joe.ADinosaur 1.0 | 6.2 | 9.2% | 4 |
| evd.X1 0.01 | 7.2 | 8.5% | 5 |
| jsal.Jsalbot 1.0 | 7.7 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 64.8 | 14 / 35 | 4777 |
| 2 | 2 | 63.0 | 68.9 | 12 / 35 | 4749 |
| 3 | 2 | 61.5 | 63.5 | 13 / 35 | 5090 |
| 4 | 3 | 59.0 | 55.9 | 12 / 35 | 4462 |
| 5 | 3 | 58.4 | 59.4 | 7 / 35 | 4342 |
| 6 | 2 | 62.6 | 68.6 | 8 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 62% |
| cs.Wren 1.0 | 18 | 89% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 40% | 97 |
| cs.Wren 1.0 | 22 | 15% | 29 |
| joe.ADinosaur 1.0 | 22 | 15% | 25 |
| evd.X1 0.01 | 17 | 12% | 18 |
| mz.Cork 0.1 | 9 | 6% | 15 |
| js.PinBall 1.6 | 8 | 5% | 11 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.3 | 126 / 210 | 2.69 | 18.4% | 29545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 18.4% | 126 |
| ntc.Opposite 1.5 | 3.0 | 11.3% | 16 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.1% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 10.1% | 13 |
| disan.Chair 2.2.0 | 7.5 | 8.5% | 9 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.5 | 19 / 35 | 4795 |
| 2 | 1 | 67.0 | 78.7 | 18 / 35 | 4742 |
| 3 | 1 | 66.4 | 77.5 | 19 / 35 | 4859 |
| 4 | 1 | 69.4 | 87.3 | 26 / 35 | 5216 |
| 5 | 1 | 68.6 | 86.7 | 24 / 35 | 4881 |
| 6 | 1 | 67.2 | 80.0 | 20 / 35 | 5052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 36 | 86% |
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| ntc.Opposite 1.5 | 17 | 71% |
| DBall.NUKE 0.1 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 20% | 42 |
| pfvicm.Sobieski 7.2.3b | 17 | 20% | 22 |
| myl.nano.Graviton 1.10 | 16 | 19% | 45 |
| ntc.Opposite 1.5 | 15 | 18% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 12% | 27 |
| disan.Chair 2.2.0 | 5 | 6% | 14 |
| DBall.NUKE 0.1 | 3 | 4% | 16 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F13

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 67.8 | 67 / 210 | 3.90 | 14.7% | 25366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.5 | 14.7% | 67 |
| oog.melee.Capulet 1.2 | 2.0 | 14.7% | 56 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 30 |
| yagami.Tidus 0.11 | 4.7 | 11.7% | 11 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 12 |
| stelo.MirrorNano 1.3 | 7.2 | 8.0% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 63.8 | 9 / 35 | 4616 |
| 2 | 1 | 63.8 | 70.5 | 13 / 35 | 4353 |
| 3 | 1 | 63.8 | 69.5 | 14 / 35 | 4438 |
| 4 | 1 | 64.0 | 70.8 | 13 / 35 | 4304 |
| 5 | 1 | 63.6 | 71.4 | 11 / 35 | 4399 |
| 6 | 3 | 58.5 | 60.6 | 7 / 35 | 3256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 52% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 65% |
| yagami.Tidus 0.11 | 11 | 100% |
| ejb.Polaris 1.0.1 | 3 | 33% |

Hadur died in 143 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 60 | 42% | 73 |
| yagami.Tidus 0.11 | 21 | 15% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 13% | 36 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 42 |
| ejb.Polaris 1.0.1 | 14 | 10% | 17 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.9 | 121 / 210 | 2.99 | 17.0% | 26982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.0% | 121 |
| bzdp.Pansy 2.1 | 2.2 | 12.5% | 16 |
| wee.Gem 1.8.4 | 3.0 | 12.0% | 25 |
| wompi.Quokka 1.6 | 4.3 | 11.1% | 19 |
| ratosh.Nobo 0.21 | 4.5 | 11.1% | 12 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 11 |
| bayen.UbaMicro 1.4 | 7.2 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 76.5 | 20 / 35 | 4639 |
| 2 | 1 | 66.3 | 82.9 | 20 / 35 | 4610 |
| 3 | 1 | 65.0 | 75.6 | 19 / 35 | 4321 |
| 4 | 1 | 65.1 | 76.2 | 20 / 35 | 4621 |
| 5 | 1 | 66.2 | 79.4 | 22 / 35 | 4556 |
| 6 | 1 | 65.3 | 76.8 | 20 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 96% |
| wee.Gem 1.8.4 | 38 | 92% |
| ratosh.Nobo 0.21 | 13 | 92% |
| m3thos.Eva00 1.1 | 12 | 75% |
| wompi.Quokka 1.6 | 10 | 70% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 428. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 17% | 26 |
| maribo.FollowFire 1 | 14 | 16% | 15 |
| m3thos.Eva00 1.1 | 12 | 13% | 22 |
| wee.Gem 1.8.4 | 11 | 12% | 48 |
| wompi.Quokka 1.6 | 11 | 12% | 17 |
| bayen.UbaMicro 1.4 | 8 | 9% | 13 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 8 |
| bzdp.Pansy 2.1 | 6 | 7% | 50 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 9 |

## Melee bench: F15

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 83.7 | 114 / 210 | 2.47 | 20.2% | 45482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 20.2% | 114 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 61 |
| mz.NanoGod 2.02 | 3.2 | 14.7% | 23 |
| ayk.WallHugger 1.0 | 4.3 | 10.2% | 3 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 7 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 2 |
| sample.SittingDuck 1.0 | 9.3 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 87.0 | 21 / 35 | 7657 |
| 2 | 1 | 70.7 | 81.3 | 18 / 35 | 7767 |
| 3 | 1 | 70.9 | 82.2 | 19 / 35 | 7482 |
| 4 | 1 | 72.0 | 87.9 | 17 / 35 | 7793 |
| 5 | 1 | 72.5 | 85.1 | 23 / 35 | 7911 |
| 6 | 1 | 69.0 | 78.7 | 16 / 35 | 6872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 77% |
| mz.NanoGod 2.02 | 19 | 58% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 40% | 115 |
| mz.NanoGod 2.02 | 37 | 38% | 51 |
| exauge.GateKeeper 1.1.121g | 10 | 10% | 14 |
| ayk.WallHugger 1.0 | 7 | 7% | 11 |
| stelo.PianistNano 1.2 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 8 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 73.1 | 103 / 210 | 3.42 | 16.4% | 28731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 16.4% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.5% | 25 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.7% | 24 |
| bvh.micro.Freya 0.3 | 4.2 | 11.3% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 6.5% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.1 | 17 / 35 | 4946 |
| 2 | 1 | 64.6 | 74.6 | 15 / 35 | 5037 |
| 3 | 1 | 62.5 | 67.0 | 16 / 35 | 4478 |
| 4 | 1 | 64.8 | 75.2 | 14 / 35 | 5049 |
| 5 | 1 | 63.3 | 67.9 | 17 / 35 | 4614 |
| 6 | 1 | 67.4 | 81.6 | 24 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 95% |
| dummy.micro.Sparrow 2.5 | 27 | 81% |
| bvh.micro.Freya 0.3 | 20 | 65% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 80% |
| stelo.MirrorMicro 1.0 | 7 | 71% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 50 |
| bvh.micro.Freya 0.3 | 18 | 17% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 17% | 15 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 39 |
| conscience.Electron 1.3g | 10 | 9% | 12 |
| dl.BetterWalls 1.0 | 7 | 7% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 13 |

## Melee bench: F17

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 90.3 | 153 / 210 | 1.87 | 21.6% | 42498 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 21.6% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 11 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.4% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 10 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.8% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.3% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.7% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 4 |
| sample.Corners 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 88.3 | 22 / 35 | 6840 |
| 2 | 1 | 71.9 | 90.5 | 24 / 35 | 7324 |
| 3 | 1 | 72.6 | 90.8 | 28 / 35 | 7396 |
| 4 | 1 | 73.0 | 94.3 | 28 / 35 | 7441 |
| 5 | 1 | 70.2 | 86.0 | 23 / 35 | 6563 |
| 6 | 1 | 72.1 | 92.1 | 28 / 35 | 6934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 96% |
| sul.Lunar 1.1 | 39 | 100% |
| supersample.SuperBoxBot 1.0 | 36 | 83% |
| dsw.StaticD 1.0 | 13 | 69% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 23 | 40% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 61 |
| mme.NikeEnhanced 2.0 | 7 | 12% | 14 |
| dsw.StaticD 1.0 | 5 | 9% | 17 |
| sul.Lunar 1.1 | 3 | 5% | 46 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.2 | 89 / 210 | 3.41 | 16.6% | 35213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 16.6% | 89 |
| radnor.DoctorBob 1.42 | 2.5 | 13.6% | 36 |
| mld.Wisdom 1.0 | 3.3 | 12.6% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.7% | 28 |
| amz.NanoClone 1.41 | 5.2 | 10.2% | 18 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 8 |
| sample.Walls 1.0 | 7.2 | 7.9% | 10 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 1 |
| jangs.ns51 1.0 | 9.0 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.6 | 19 / 35 | 6081 |
| 2 | 1 | 65.2 | 74.6 | 13 / 35 | 5982 |
| 3 | 1 | 64.0 | 70.5 | 12 / 35 | 5581 |
| 4 | 1 | 63.2 | 66.7 | 15 / 35 | 5721 |
| 5 | 1 | 65.5 | 76.8 | 14 / 35 | 5895 |
| 6 | 1 | 65.9 | 75.2 | 16 / 35 | 5953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 81% |
| radnor.DoctorBob 1.42 | 30 | 80% |
| mld.Wisdom 1.0 | 9 | 56% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 50% |
| sample.Walls 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 4 | 75% |

Hadur died in 121 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 27% | 40 |
| radnor.DoctorBob 1.42 | 21 | 17% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 17% | 52 |
| amz.NanoClone 1.41 | 14 | 12% | 15 |
| KiraNL.Chupacabra 0.4 | 13 | 11% | 25 |
| jangs.ns51 1.0 | 8 | 7% | 11 |
| GarmBox.Oranges 1.0 | 6 | 5% | 9 |
| sample.Walls 1.0 | 6 | 5% | 9 |

