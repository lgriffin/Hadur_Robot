# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 86.8 | 145 / 210 | 2.19 | 21.2% | 44269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.2% | 145 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 18 |
| mld.Infinity 2.2 | 3.2 | 13.7% | 21 |
| radnor.DoctorBob 1.42 | 3.2 | 13.9% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 1 |
| sample.Walls 1.0 | 6.5 | 7.2% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 3.8% | 1 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 85.1 | 22 / 35 | 7413 |
| 2 | 1 | 72.1 | 87.6 | 25 / 35 | 7181 |
| 3 | 1 | 69.3 | 80.3 | 22 / 35 | 6589 |
| 4 | 1 | 72.3 | 86.7 | 24 / 35 | 7928 |
| 5 | 1 | 74.2 | 92.4 | 26 / 35 | 8208 |
| 6 | 1 | 72.2 | 88.9 | 26 / 35 | 6950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 91% |
| mld.Infinity 2.2 | 35 | 91% |
| radnor.DoctorBob 1.42 | 33 | 94% |
| amz.NanoClone 1.41 | 5 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 35% | 59 |
| mz.AntiGrav 1.0 | 22 | 32% | 83 |
| amz.NanoClone 1.41 | 7 | 10% | 13 |
| mld.Infinity 2.2 | 6 | 9% | 35 |
| jangs.ns51 1.0 | 3 | 4% | 7 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 2 | 3% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 78.8 | 118 / 210 | 2.90 | 18.0% | 32783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 18.0% | 118 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.4% | 53 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 14 |
| maribo.melee.BMV 0.1 | 4.8 | 9.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.3% | 6 |
| zyx.nano.Ant 1.1 | 5.8 | 9.0% | 3 |
| fullsail.SweetTea 1.1 | 7.5 | 7.2% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.9% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 26 / 35 | 5576 |
| 2 | 1 | 67.9 | 83.8 | 21 / 35 | 5037 |
| 3 | 1 | 69.6 | 90.2 | 22 / 35 | 5663 |
| 4 | 2 | 63.0 | 61.3 | 11 / 35 | 5445 |
| 5 | 2 | 61.4 | 55.9 | 12 / 35 | 5238 |
| 6 | 1 | 70.7 | 92.4 | 26 / 35 | 5824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 72% |
| mld.DustBunny 3.8 | 45 | 93% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 4 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 28% | 65 |
| cs.Grudge 1.0 | 19 | 21% | 17 |
| mld.DustBunny 3.8 | 16 | 17% | 62 |
| maribo.melee.BMV 0.1 | 7 | 8% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 14 |
| fullsail.SweetTea 1.1 | 6 | 7% | 11 |
| zyx.nano.Ant 1.1 | 6 | 7% | 11 |
| bzdp.BoxCar 2.0 | 5 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 11 |

## Melee bench: F03

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 82.0 | 122 / 210 | 2.62 | 19.5% | 37719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.5% | 122 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 45 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.2% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 17 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.4% | 7 |
| fm.mammillarias 1.3 | 6.0 | 8.8% | 1 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 6 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 1 |
| sample.Fire 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 79.7 | 20 / 35 | 6065 |
| 2 | 1 | 68.8 | 79.4 | 16 / 35 | 6588 |
| 3 | 1 | 68.0 | 76.5 | 20 / 35 | 5830 |
| 4 | 1 | 70.3 | 87.0 | 20 / 35 | 6307 |
| 5 | 1 | 69.6 | 80.0 | 22 / 35 | 6245 |
| 6 | 1 | 71.7 | 89.5 | 24 / 35 | 6684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 79% |
| cb.nano.Insomnia 1.0 | 26 | 92% |
| myl.nano.KomoriNinja 1.1 | 15 | 80% |
| sp.Nanos.Ember 1.1 | 9 | 78% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 26% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 18% | 36 |
| cb.nano.Insomnia 1.0 | 13 | 15% | 22 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 33 |
| sp.Nanos.Ember 1.1 | 9 | 10% | 16 |
| fm.mammillarias 1.3 | 7 | 8% | 11 |
| sample.Tracker 1.0 | 5 | 6% | 6 |
| sample.Fire 1.0 | 2 | 2% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.1 | 150 / 210 | 1.98 | 20.9% | 39098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 20.9% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 13 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 10.0% | 18 |
| tj.zombie1n 1.0.1 | 5.5 | 8.8% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.2% | 8 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.0 | 23 / 35 | 6577 |
| 2 | 1 | 71.7 | 92.4 | 27 / 35 | 6662 |
| 3 | 1 | 71.0 | 89.5 | 24 / 35 | 6690 |
| 4 | 1 | 70.6 | 88.6 | 26 / 35 | 6394 |
| 5 | 1 | 68.9 | 84.4 | 21 / 35 | 5934 |
| 6 | 1 | 72.3 | 92.7 | 29 / 35 | 6841 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 93% |
| stelo.SoJNanoMelee 1.1 | 50 | 84% |
| tvv.micro.Antares 1.1.1 | 19 | 79% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 72% |
| tj.zombie1n 1.0.1 | 15 | 87% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 75% |
| sample.VelociRobot 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 32% | 84 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 41 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 18 |
| tj.zombie1n 1.0.1 | 4 | 7% | 8 |
| yk.JahMicro 1.0 | 2 | 3% | 9 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 2 | 3% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 4 |

## Melee bench: F05

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.4 | 78 / 210 | 3.75 | 15.7% | 29211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 15.7% | 78 |
| oog.melee.Corsair 1.0 | 1.7 | 13.3% | 52 |
| ahf.NanoAndrew .4 | 3.5 | 11.7% | 23 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.8% | 22 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.6% | 16 |
| sam.Samspin 1.0 | 6.7 | 8.8% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 64.1 | 14 / 35 | 4711 |
| 2 | 2 | 59.4 | 57.5 | 9 / 35 | 4615 |
| 3 | 1 | 65.9 | 76.5 | 18 / 35 | 5229 |
| 4 | 2 | 62.4 | 68.6 | 8 / 35 | 4713 |
| 5 | 1 | 64.5 | 74.0 | 12 / 35 | 4993 |
| 6 | 1 | 65.3 | 75.9 | 17 / 35 | 4950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 41% |
| simonton.nano.MeleeSeed 1.8 | 27 | 81% |
| ahf.NanoAndrew .4 | 23 | 87% |
| sam.Samspin 1.0 | 7 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 27% | 52 |
| robar.nano.Assertive_Melee 0.2 | 19 | 14% | 23 |
| ahf.NanoAndrew .4 | 18 | 14% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 18 | 14% | 16 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 34 |
| zyx.nano.BacillusComma 1.0 | 12 | 9% | 15 |
| EBBU.Sim2 1.02 | 8 | 6% | 12 |
| sam.Samspin 1.0 | 7 | 5% | 14 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.3 | 130 / 210 | 2.50 | 18.7% | 32192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.7% | 130 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 41 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.2% | 9 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.6% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 6 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.8% | 7 |
| fm.claire 1.7 | 6.3 | 8.5% | 0 |
| sample.SpinBot 1.0 | 7.7 | 7.1% | 1 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 24 / 35 | 6163 |
| 2 | 1 | 70.0 | 89.5 | 27 / 35 | 5409 |
| 3 | 1 | 64.9 | 75.2 | 15 / 35 | 4842 |
| 4 | 1 | 68.8 | 83.2 | 26 / 35 | 5610 |
| 5 | 1 | 67.2 | 82.5 | 18 / 35 | 5172 |
| 6 | 1 | 66.7 | 80.3 | 20 / 35 | 4996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 76% |
| oog.melee.CapuletDroid 1.1 | 31 | 97% |
| arthord.NanoSatanMelee Beta | 15 | 87% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 34% | 79 |
| gh.nano.Grofvuil 0.2 | 13 | 16% | 28 |
| arthord.NanoSatanMelee Beta | 10 | 13% | 16 |
| kurios.DOSexe .9b | 6 | 8% | 10 |
| fm.claire 1.7 | 6 | 8% | 10 |
| sample.SpinBot 1.0 | 6 | 8% | 10 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 42 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 12 |
| pa.Improved 1.0 | 2 | 3% | 2 |

## Melee bench: F07

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 84.9 | 126 / 210 | 2.36 | 19.3% | 35932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.3% | 126 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.4% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.5% | 17 |
| mz.MicroGodMelee 1 | 3.7 | 13.1% | 31 |
| DBall.Anarchy 0.1 | 5.5 | 8.1% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 86.7 | 25 / 35 | 6121 |
| 2 | 1 | 68.7 | 83.8 | 19 / 35 | 5979 |
| 3 | 1 | 70.2 | 89.2 | 20 / 35 | 6133 |
| 4 | 1 | 71.5 | 92.1 | 23 / 35 | 6684 |
| 5 | 1 | 67.2 | 77.1 | 20 / 35 | 5748 |
| 6 | 1 | 67.5 | 80.3 | 19 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 91% |
| mz.MicroGodMelee 1 | 45 | 69% |
| gh.micro.Gruweltje 0.7 | 30 | 80% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 27 | 32% | 55 |
| mz.MicroGodMelee 1 | 25 | 30% | 54 |
| spinnercat.micro.Tyger 0.1 | 15 | 18% | 62 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 8 |
| fire219.CatBot 1.0 | 4 | 5% | 4 |
| DBall.Anarchy 0.1 | 3 | 4% | 14 |
| acogdev.alpha 0.2 | 3 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.8 | 104 / 210 | 3.63 | 16.2% | 29048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 16.2% | 104 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 44 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 24 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 6 |
| germ.TheMind .2 | 5.2 | 9.4% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.4% | 11 |
| awesomeness.Elite 1.0 | 7.5 | 8.0% | 7 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 76.5 | 16 / 35 | 4993 |
| 2 | 1 | 61.6 | 63.2 | 13 / 35 | 4564 |
| 3 | 2 | 65.3 | 73.7 | 18 / 35 | 4832 |
| 4 | 1 | 67.6 | 80.3 | 24 / 35 | 5398 |
| 5 | 2 | 61.7 | 61.3 | 14 / 35 | 4656 |
| 6 | 1 | 64.6 | 69.8 | 19 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 85% |
| germ.TheMind .2 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| awesomeness.Elite 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 48% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 32 |
| stelo.UntouchableNano 1.3 | 11 | 10% | 16 |
| awesomeness.Elite 1.0 | 9 | 8% | 14 |
| germ.TheMind .2 | 6 | 6% | 16 |
| mym.EdgeStalker 1.0 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.1 | 149 / 210 | 2.16 | 19.9% | 31780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 19.9% | 149 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 13 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 1 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.5% | 9 |
| stelo.PatternRobot 1.0 | 7.3 | 8.1% | 5 |
| ratosh.Wesco 1.4 | 8.0 | 7.8% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 7.8% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.4 | 23 / 35 | 5497 |
| 2 | 1 | 71.0 | 89.5 | 27 / 35 | 5561 |
| 3 | 1 | 68.2 | 82.5 | 22 / 35 | 5136 |
| 4 | 1 | 70.2 | 87.0 | 27 / 35 | 5227 |
| 5 | 1 | 70.4 | 89.5 | 24 / 35 | 5156 |
| 6 | 1 | 70.6 | 89.8 | 26 / 35 | 5203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 93% |
| nz.jdc.nano.GridFu 1.0 | 30 | 97% |
| maribo.IotaCT 1.1 | 14 | 93% |
| stelo.PatternRobot 1.0 | 13 | 100% |
| timmit.nano.TimDog 0.33 | 12 | 58% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| spinnercat.Omen 1.0 | 8 | 100% |
| ratosh.Wesco 1.4 | 7 | 57% |

Hadur died in 61 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 25% | 73 |
| timmit.nano.TimDog 0.33 | 11 | 18% | 22 |
| ratosh.Wesco 1.4 | 10 | 16% | 18 |
| nz.jdc.nano.GridFu 1.0 | 7 | 11% | 45 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 11% | 13 |
| stelo.PatternRobot 1.0 | 5 | 8% | 9 |
| maribo.IotaCT 1.1 | 3 | 5% | 19 |
| spinnercat.Omen 1.0 | 2 | 3% | 8 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.8 | 176 / 210 | 1.56 | 22.0% | 40283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 22.0% | 176 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.2% | 10 |
| baal.nano.N 1.42 | 2.8 | 10.9% | 5 |
| Grystrion.TrackerWO 1.0 | 3.8 | 10.2% | 1 |
| zyx.micro.Ant 1.1 | 5.3 | 9.3% | 9 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.5% | 0 |
| sanja.First 0.1 | 6.7 | 8.7% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.3% | 7 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.7 | 29 / 35 | 6896 |
| 2 | 1 | 73.1 | 96.8 | 32 / 35 | 6947 |
| 3 | 1 | 72.5 | 94.9 | 28 / 35 | 6997 |
| 4 | 1 | 72.7 | 97.1 | 30 / 35 | 6479 |
| 5 | 1 | 71.1 | 91.7 | 27 / 35 | 6364 |
| 6 | 1 | 71.4 | 90.5 | 30 / 35 | 6600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 37 | 92% |
| tvv.nano.Polaris 1.2 | 34 | 91% |
| baal.nano.N 1.42 | 25 | 96% |
| sanja.First 0.1 | 22 | 100% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| zyx.micro.Ant 1.1 | 19 | 79% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 29% | 40 |
| tvv.nano.Polaris 1.2 | 6 | 18% | 50 |
| cvt.Firsty 1.0 | 5 | 15% | 35 |
| baal.nano.N 1.42 | 4 | 12% | 31 |
| Grystrion.TrackerWO 1.0 | 4 | 12% | 16 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 9 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 6 |
| sanja.First 0.1 | 1 | 3% | 22 |

## Melee bench: F11

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.2 | 92 / 210 | 3.50 | 16.4% | 32613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 16.4% | 92 |
| kc.micro.Figment 1.0 | 1.8 | 16.1% | 73 |
| cs.Wren 1.0 | 3.2 | 12.4% | 16 |
| mz.Cork 0.1 | 4.3 | 11.0% | 10 |
| js.PinBall 1.6 | 4.7 | 10.8% | 10 |
| evd.X1 0.01 | 6.3 | 8.5% | 2 |
| joe.ADinosaur 1.0 | 6.5 | 8.7% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 8.7 | 5.6% | 6 |
| PSW.Relentless 0.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.6 | 17 / 35 | 5534 |
| 2 | 2 | 64.0 | 68.3 | 13 / 35 | 5287 |
| 3 | 1 | 62.6 | 63.5 | 15 / 35 | 5107 |
| 4 | 1 | 65.7 | 74.0 | 15 / 35 | 5661 |
| 5 | 1 | 66.1 | 78.4 | 15 / 35 | 5338 |
| 6 | 1 | 66.0 | 74.3 | 17 / 35 | 5686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 75 | 76% |
| cs.Wren 1.0 | 20 | 95% |
| js.PinBall 1.6 | 7 | 86% |
| mz.Cork 0.1 | 4 | 50% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 40% | 108 |
| cs.Wren 1.0 | 15 | 13% | 28 |
| mz.Cork 0.1 | 13 | 11% | 17 |
| evd.X1 0.01 | 12 | 10% | 13 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| js.PinBall 1.6 | 9 | 8% | 15 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.3 | 132 / 210 | 2.59 | 18.9% | 30193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.9% | 132 |
| ntc.Opposite 1.5 | 2.8 | 11.4% | 9 |
| myl.nano.Graviton 1.10 | 3.8 | 10.8% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.3% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.3% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.8% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.6% | 6 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.5 | 26 / 35 | 5384 |
| 2 | 1 | 69.3 | 87.3 | 23 / 35 | 5257 |
| 3 | 1 | 68.9 | 86.3 | 23 / 35 | 5063 |
| 4 | 1 | 68.3 | 85.1 | 22 / 35 | 4745 |
| 5 | 1 | 67.6 | 79.0 | 22 / 35 | 5188 |
| 6 | 1 | 64.7 | 73.7 | 16 / 35 | 4556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 86% |
| myl.nano.Graviton 1.10 | 26 | 92% |
| ntc.Opposite 1.5 | 21 | 86% |
| DBall.NUKE 0.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| disan.Chair 2.2.0 | 12 | 92% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 27 |
| stelo.AreaTargetingBot 1.1 | 15 | 19% | 42 |
| myl.nano.Graviton 1.10 | 13 | 16% | 39 |
| ntc.Opposite 1.5 | 11 | 14% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 22 |
| disan.Chair 2.2.0 | 7 | 9% | 21 |
| DBall.NUKE 0.1 | 2 | 3% | 18 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 2 | 3% | 7 |

## Melee bench: F13

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.1 | 71 / 210 | 3.51 | 15.6% | 26691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.2 | 15.6% | 71 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.0% | 35 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.1% | 25 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 10 |
| ejb.Polaris 1.0.1 | 5.8 | 10.9% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.0 | 9 / 35 | 4418 |
| 2 | 1 | 64.4 | 72.7 | 14 / 35 | 4218 |
| 3 | 2 | 62.1 | 66.3 | 9 / 35 | 4296 |
| 4 | 1 | 63.0 | 66.7 | 11 / 35 | 4566 |
| 5 | 1 | 62.7 | 67.3 | 12 / 35 | 4413 |
| 6 | 1 | 68.2 | 85.7 | 16 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 30% |
| kawigi.micro.Shiz 1.1 | 27 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 73% |
| yagami.Tidus 0.11 | 14 | 79% |
| ejb.Polaris 1.0.1 | 7 | 86% |

Hadur died in 139 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 40% | 70 |
| yagami.Tidus 0.11 | 26 | 19% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 12% | 34 |
| ejb.Polaris 1.0.1 | 15 | 11% | 25 |
| kawigi.micro.Shiz 1.1 | 9 | 6% | 30 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.4 | 148 / 210 | 2.49 | 18.7% | 29598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.7% | 148 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 15 |
| wee.Gem 1.8.4 | 3.7 | 11.1% | 14 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 11 |
| ratosh.Nobo 0.21 | 4.2 | 10.8% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 6.5 | 9.0% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 24 / 35 | 4628 |
| 2 | 1 | 67.9 | 81.9 | 24 / 35 | 4881 |
| 3 | 1 | 68.4 | 84.4 | 25 / 35 | 5154 |
| 4 | 1 | 69.0 | 85.7 | 26 / 35 | 5101 |
| 5 | 1 | 66.2 | 76.8 | 22 / 35 | 4970 |
| 6 | 1 | 69.5 | 91.1 | 27 / 35 | 4864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 66 | 95% |
| wee.Gem 1.8.4 | 35 | 100% |
| wompi.Quokka 1.6 | 24 | 88% |
| ratosh.Nobo 0.21 | 14 | 100% |
| m3thos.Eva00 1.1 | 7 | 86% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 10 | 16% | 61 |
| wompi.Quokka 1.6 | 9 | 14% | 23 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 14% | 12 |
| maribo.FollowFire 1 | 8 | 13% | 11 |
| wee.Gem 1.8.4 | 7 | 11% | 47 |
| bayen.UbaMicro 1.4 | 7 | 11% | 15 |
| ratosh.Nobo 0.21 | 5 | 8% | 18 |
| stelo.MyAgileRobot 0.2 | 5 | 8% | 11 |
| m3thos.Eva00 1.1 | 4 | 6% | 11 |

## Melee bench: F15

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 90.0 | 132 / 210 | 1.90 | 21.7% | 46807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 21.7% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 20 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.2% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 92.7 | 25 / 35 | 8063 |
| 2 | 1 | 72.1 | 88.9 | 17 / 35 | 7220 |
| 3 | 1 | 73.1 | 89.2 | 24 / 35 | 7956 |
| 4 | 1 | 72.6 | 90.5 | 25 / 35 | 7494 |
| 5 | 1 | 72.2 | 86.7 | 19 / 35 | 7825 |
| 6 | 1 | 73.8 | 92.1 | 22 / 35 | 8249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 84% |
| mz.NanoGod 2.02 | 11 | 45% |
| ayk.WallHugger 1.0 | 10 | 90% |
| exauge.GateKeeper 1.1.121g | 10 | 80% |
| drd.Dreadknoght 0.9 | 9 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 49% | 138 |
| mz.NanoGod 2.02 | 25 | 32% | 35 |
| ayk.WallHugger 1.0 | 7 | 9% | 13 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.7 | 108 / 210 | 3.28 | 17.1% | 30424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.3 | 17.1% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 12.8% | 21 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.4% | 25 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.1% | 19 |
| bvh.micro.Freya 0.3 | 4.3 | 10.5% | 17 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.5% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.2 | 22 / 35 | 5319 |
| 2 | 1 | 67.2 | 81.0 | 20 / 35 | 5399 |
| 3 | 3 | 56.8 | 53.0 | 11 / 35 | 3839 |
| 4 | 1 | 67.4 | 81.0 | 18 / 35 | 5351 |
| 5 | 1 | 65.0 | 72.7 | 19 / 35 | 4790 |
| 6 | 1 | 66.8 | 77.1 | 18 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 92% |
| dummy.micro.Sparrow 2.5 | 24 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 78% |
| bvh.micro.Freya 0.3 | 13 | 69% |
| stelo.MirrorMicro 1.0 | 12 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 19% | 59 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 41 |
| bvh.micro.Freya 0.3 | 15 | 15% | 23 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 14% | 30 |
| conscience.Electron 1.3g | 13 | 13% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 15 |
| dl.BetterWalls 1.0 | 8 | 8% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.3 | 161 / 210 | 1.87 | 22.0% | 42985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 22.0% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.0% | 8 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 7 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 10 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.0% | 7 |
| dsw.StaticD 1.0 | 6.2 | 8.1% | 6 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.1% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.Corners 1.0 | 9.8 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.3 | 25 / 35 | 7043 |
| 2 | 1 | 73.4 | 93.7 | 29 / 35 | 7411 |
| 3 | 1 | 72.0 | 89.5 | 30 / 35 | 6744 |
| 4 | 1 | 72.8 | 91.7 | 27 / 35 | 7368 |
| 5 | 1 | 73.6 | 94.9 | 29 / 35 | 7664 |
| 6 | 1 | 70.0 | 83.8 | 21 / 35 | 6755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 46 | 93% |
| supersample.SuperBoxBot 1.0 | 30 | 90% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| dsw.StaticD 1.0 | 8 | 88% |
| sample.MyFirstRobot 1.0 | 7 | 86% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 14 | 28% | 60 |
| supersample.SuperBoxBot 1.0 | 14 | 28% | 30 |
| dsw.StaticD 1.0 | 6 | 12% | 20 |
| mme.NikeEnhanced 2.0 | 5 | 10% | 16 |
| sul.Lunar 1.1 | 4 | 8% | 58 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 8% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| sample.Corners 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWTH 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 78.8 | 117 / 210 | 2.90 | 18.3% | 37466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTH 0.1 | 1.0 | 18.3% | 117 |
| radnor.DoctorBob 1.42 | 2.0 | 13.4% | 31 |
| mld.Wisdom 1.0 | 3.3 | 11.8% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 21 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 7 |
| amz.NanoClone 1.41 | 5.7 | 10.1% | 9 |
| sample.Walls 1.0 | 7.3 | 8.0% | 7 |
| GarmBox.Oranges 1.0 | 7.7 | 7.1% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 84.8 | 24 / 35 | 6747 |
| 2 | 1 | 68.5 | 83.5 | 23 / 35 | 5971 |
| 3 | 1 | 65.9 | 71.1 | 17 / 35 | 6193 |
| 4 | 1 | 68.9 | 82.5 | 20 / 35 | 6453 |
| 5 | 1 | 66.7 | 77.1 | 17 / 35 | 5919 |
| 6 | 1 | 66.1 | 74.0 | 16 / 35 | 6183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 89% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| mld.Wisdom 1.0 | 18 | 50% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| amz.NanoClone 1.41 | 11 | 91% |
| GarmBox.Oranges 1.0 | 9 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 496. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 35% | 47 |
| radnor.DoctorBob 1.42 | 23 | 25% | 58 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 43 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 21 |
| amz.NanoClone 1.41 | 6 | 6% | 14 |
| sample.Walls 1.0 | 3 | 3% | 12 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 6 |

