# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.9 | 145 / 210 | 2.18 | 20.8% | 42750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 20.8% | 145 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 24 |
| mz.AntiGrav 1.0 | 2.8 | 14.1% | 21 |
| mld.Infinity 2.2 | 3.7 | 13.2% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 5 |
| sample.Walls 1.0 | 6.7 | 6.6% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 1 |
| sample.Target 1.0 | 9.3 | 4.0% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 79.0 | 20 / 35 | 6063 |
| 2 | 1 | 73.2 | 92.1 | 27 / 35 | 7995 |
| 3 | 1 | 74.0 | 94.0 | 29 / 35 | 7737 |
| 4 | 1 | 70.5 | 83.8 | 22 / 35 | 6951 |
| 5 | 1 | 70.6 | 83.5 | 22 / 35 | 6568 |
| 6 | 1 | 72.1 | 88.9 | 25 / 35 | 7436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 93% |
| radnor.DoctorBob 1.42 | 34 | 76% |
| mld.Infinity 2.2 | 33 | 97% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 37% | 52 |
| mz.AntiGrav 1.0 | 15 | 23% | 70 |
| amz.NanoClone 1.41 | 11 | 17% | 17 |
| mld.Infinity 2.2 | 7 | 11% | 43 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 2 | 3% | 9 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 6 |

## Melee bench: F02

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 131 / 210 | 2.05 | 19.0% | 32358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 19.0% | 131 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 41 |
| mld.DustBunny 3.8 | 3.3 | 12.6% | 14 |
| maribo.melee.BMV 0.1 | 3.7 | 10.8% | 2 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 8.9% | 6 |
| fullsail.SweetTea 1.1 | 7.8 | 7.5% | 7 |
| bzdp.BoxCar 2.0 | 8.0 | 7.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.2 | 6.5% | 6 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.7 | 23 / 35 | 5184 |
| 2 | 1 | 68.0 | 85.4 | 22 / 35 | 5555 |
| 3 | 1 | 70.0 | 93.3 | 23 / 35 | 5849 |
| 4 | 1 | 68.7 | 86.3 | 21 / 35 | 5172 |
| 5 | 1 | 67.8 | 84.1 | 20 / 35 | 5295 |
| 6 | 1 | 69.9 | 94.3 | 22 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 73% |
| mld.DustBunny 3.8 | 52 | 87% |
| djdjdj.NanoSkunk10 1.0 | 19 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 35% | 82 |
| mld.DustBunny 3.8 | 17 | 21% | 53 |
| zyx.nano.Ant 1.1 | 11 | 14% | 13 |
| fullsail.SweetTea 1.1 | 8 | 10% | 12 |
| maribo.melee.BMV 0.1 | 4 | 5% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 12 |
| bzdp.BoxCar 2.0 | 4 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 17 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.7 | 125 / 210 | 2.47 | 19.6% | 37382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 19.6% | 125 |
| myl.micro.Troodon 1.10 | 2.3 | 14.4% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 11.8% | 31 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.4% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.6% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.4% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 76.8 | 20 / 35 | 6164 |
| 2 | 1 | 69.5 | 83.8 | 20 / 35 | 6242 |
| 3 | 1 | 70.8 | 87.3 | 23 / 35 | 6371 |
| 4 | 1 | 69.3 | 85.1 | 18 / 35 | 6198 |
| 5 | 1 | 71.6 | 89.2 | 27 / 35 | 6740 |
| 6 | 1 | 67.6 | 80.0 | 17 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 46 | 80% |
| cb.nano.Insomnia 1.0 | 10 | 100% |
| fm.mammillarias 1.3 | 10 | 90% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| myl.nano.KomoriNinja 1.1 | 9 | 78% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 33% | 60 |
| myl.micro.Troodon 1.10 | 21 | 25% | 68 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 32 |
| fm.mammillarias 1.3 | 10 | 12% | 16 |
| cb.nano.Insomnia 1.0 | 7 | 8% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 5 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 14 |
| sample.Fire 1.0 | 1 | 1% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.4 | 149 / 210 | 1.78 | 21.4% | 41497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 21.4% | 149 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.8% | 14 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.2% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.2% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.1% | 25 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 3 |
| yk.JahMicro 1.0 | 6.0 | 8.5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.0 | 25 / 35 | 7141 |
| 2 | 1 | 72.1 | 94.6 | 27 / 35 | 6699 |
| 3 | 1 | 70.6 | 88.9 | 24 / 35 | 6836 |
| 4 | 1 | 72.0 | 91.1 | 27 / 35 | 7293 |
| 5 | 1 | 70.4 | 87.6 | 20 / 35 | 6945 |
| 6 | 1 | 71.2 | 92.1 | 26 / 35 | 6583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 91% |
| stelo.SoJNanoMelee 1.1 | 41 | 88% |
| tj.zombie1n 1.0.1 | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| yk.JahMicro 1.0 | 10 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 41% | 85 |
| stelo.SoJNanoMelee 1.1 | 13 | 21% | 34 |
| tj.zombie1n 1.0.1 | 7 | 11% | 14 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 17 |
| yk.JahMicro 1.0 | 4 | 7% | 14 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.2 | 88 / 210 | 3.50 | 16.2% | 30800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 16.2% | 88 |
| oog.melee.Corsair 1.0 | 2.5 | 12.5% | 27 |
| ahf.NanoAndrew .4 | 2.8 | 11.8% | 35 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.8% | 23 |
| sam.Samspin 1.0 | 5.0 | 9.8% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.1 | 16 / 35 | 5326 |
| 2 | 1 | 67.1 | 79.7 | 16 / 35 | 5676 |
| 3 | 1 | 61.2 | 64.1 | 14 / 35 | 4768 |
| 4 | 1 | 63.8 | 68.9 | 18 / 35 | 5239 |
| 5 | 1 | 63.8 | 71.7 | 13 / 35 | 5113 |
| 6 | 1 | 62.7 | 70.5 | 11 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 64% |
| simonton.nano.MeleeSeed 1.8 | 24 | 92% |
| ahf.NanoAndrew .4 | 20 | 75% |
| sam.Samspin 1.0 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 8 | 100% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 439. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 26 | 21% | 43 |
| oog.melee.Corsair 1.0 | 23 | 19% | 44 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 30 |
| EBBU.Sim2 1.02 | 13 | 11% | 18 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 16 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 31 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 7% | 8 |
| sam.Samspin 1.0 | 8 | 7% | 16 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.8 | 138 / 210 | 2.37 | 18.9% | 32131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.9% | 138 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.9% | 8 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 6 |
| fm.claire 1.7 | 6.0 | 8.6% | 1 |
| sample.SpinBot 1.0 | 8.3 | 7.3% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 80.6 | 19 / 35 | 4932 |
| 2 | 1 | 69.6 | 88.3 | 25 / 35 | 5592 |
| 3 | 1 | 69.7 | 86.0 | 25 / 35 | 5999 |
| 4 | 1 | 69.5 | 88.9 | 24 / 35 | 5716 |
| 5 | 1 | 68.2 | 85.4 | 23 / 35 | 5242 |
| 6 | 1 | 66.1 | 79.4 | 22 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 82% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 5 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 36% | 79 |
| gh.nano.Grofvuil 0.2 | 11 | 15% | 26 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 45 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 11 |
| fm.claire 1.7 | 5 | 7% | 11 |
| kurios.DOSexe .9b | 5 | 7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 14 |
| sample.SpinBot 1.0 | 4 | 6% | 6 |
| pa.Improved 1.0 | 3 | 4% | 9 |

## Melee bench: F07

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.3 | 104 / 210 | 2.59 | 18.4% | 35184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.4% | 104 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.3% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 22 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 28 |
| DBall.Anarchy 0.1 | 5.2 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.2% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.7% | 6 |
| acogdev.alpha 0.2 | 8.3 | 6.2% | 3 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 81.3 | 18 / 35 | 6363 |
| 2 | 1 | 66.6 | 79.0 | 11 / 35 | 5688 |
| 3 | 1 | 68.5 | 84.1 | 20 / 35 | 5845 |
| 4 | 1 | 68.6 | 83.8 | 20 / 35 | 5883 |
| 5 | 1 | 68.8 | 83.5 | 17 / 35 | 6300 |
| 6 | 1 | 67.1 | 82.2 | 18 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 87% |
| mz.MicroGodMelee 1 | 34 | 74% |
| gh.micro.Gruweltje 0.7 | 33 | 58% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 27% | 61 |
| gh.micro.Gruweltje 0.7 | 28 | 26% | 51 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 63 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 7 |
| acogdev.alpha 0.2 | 6 | 6% | 6 |
| el.JumpShoot 0.2 | 4 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.1 | 102 / 210 | 3.60 | 16.2% | 31354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.9% | 47 |
| hadur117.micro.SaorW26 0.1 | 1.7 | 16.2% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 30 |
| germ.TheMind .2 | 4.7 | 9.7% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 5.7 | 8.8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 7.7% | 4 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 4 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 70.8 | 18 / 35 | 5509 |
| 2 | 2 | 63.6 | 68.6 | 16 / 35 | 4987 |
| 3 | 2 | 64.8 | 71.1 | 15 / 35 | 5148 |
| 4 | 3 | 60.0 | 59.7 | 10 / 35 | 4924 |
| 5 | 1 | 68.6 | 81.6 | 23 / 35 | 5718 |
| 6 | 1 | 65.4 | 74.6 | 20 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 73% |
| germ.TheMind .2 | 11 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 49% | 105 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 30 |
| germ.TheMind .2 | 14 | 13% | 24 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 14 |
| awesomeness.Elite 1.0 | 6 | 6% | 14 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 11 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 6 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.7 | 145 / 210 | 2.10 | 19.8% | 31554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 19.8% | 145 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 10.1% | 3 |
| maribo.IotaCT 1.1 | 5.0 | 10.2% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.5% | 10 |
| spinnercat.Omen 1.0 | 7.7 | 8.0% | 5 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 3 |
| stelo.PatternRobot 1.0 | 8.5 | 7.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 26 / 35 | 5444 |
| 2 | 1 | 70.3 | 89.5 | 26 / 35 | 5348 |
| 3 | 1 | 70.2 | 87.6 | 24 / 35 | 5224 |
| 4 | 1 | 69.7 | 88.3 | 23 / 35 | 5181 |
| 5 | 1 | 67.5 | 79.4 | 20 / 35 | 4577 |
| 6 | 1 | 71.4 | 90.8 | 26 / 35 | 5780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 82 | 93% |
| nz.jdc.nano.GridFu 1.0 | 30 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| maribo.IotaCT 1.1 | 8 | 88% |
| spinnercat.Omen 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| ratosh.Wesco 1.4 | 5 | 80% |

Hadur died in 65 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 20% | 61 |
| ratosh.Wesco 1.4 | 13 | 20% | 21 |
| timmit.nano.TimDog 0.33 | 11 | 17% | 22 |
| stelo.PatternRobot 1.0 | 11 | 17% | 20 |
| nz.jdc.nano.GridFu 1.0 | 10 | 15% | 54 |
| maribo.IotaCT 1.1 | 3 | 5% | 15 |
| spinnercat.Omen 1.0 | 2 | 3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 6 |

## Melee bench: F10

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.1 | 163 / 210 | 1.71 | 21.3% | 39654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 21.3% | 163 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 1 |
| zyx.micro.Ant 1.1 | 5.7 | 8.8% | 6 |
| sanja.First 0.1 | 5.7 | 8.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.9% | 1 |
| cvt.Firsty 1.0 | 7.3 | 7.5% | 10 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.5% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 26 / 35 | 6615 |
| 2 | 1 | 71.5 | 94.3 | 29 / 35 | 6404 |
| 3 | 1 | 71.7 | 92.1 | 27 / 35 | 6979 |
| 4 | 1 | 71.8 | 94.0 | 30 / 35 | 6828 |
| 5 | 1 | 72.2 | 95.2 | 28 / 35 | 6865 |
| 6 | 1 | 69.0 | 84.1 | 23 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 36 | 86% |
| baal.nano.N 1.42 | 33 | 94% |
| tvv.nano.Polaris 1.2 | 31 | 87% |
| sanja.First 0.1 | 27 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| zyx.micro.Ant 1.1 | 15 | 87% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 36% | 36 |
| tvv.nano.Polaris 1.2 | 9 | 19% | 54 |
| cvt.Firsty 1.0 | 7 | 15% | 27 |
| amk.Punbot.Punbot 0.01 | 5 | 11% | 7 |
| baal.nano.N 1.42 | 4 | 9% | 29 |
| sanja.First 0.1 | 2 | 4% | 26 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 2% | 20 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.8 | 86 / 210 | 3.80 | 15.2% | 29394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.9% | 66 |
| hadur117.micro.SaorW26 0.1 | 1.7 | 15.2% | 86 |
| cs.Wren 1.0 | 3.3 | 12.1% | 11 |
| mz.Cork 0.1 | 4.3 | 10.7% | 16 |
| js.PinBall 1.6 | 4.8 | 10.9% | 13 |
| joe.ADinosaur 1.0 | 5.7 | 9.4% | 5 |
| evd.X1 0.01 | 6.8 | 8.3% | 4 |
| jsal.Jsalbot 1.0 | 8.3 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 8.7 | 6.2% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 63.2 | 10 / 35 | 4847 |
| 2 | 2 | 61.7 | 65.4 | 13 / 35 | 4712 |
| 3 | 1 | 65.9 | 79.4 | 16 / 35 | 5164 |
| 4 | 2 | 63.0 | 70.2 | 15 / 35 | 4754 |
| 5 | 2 | 62.0 | 65.1 | 15 / 35 | 4761 |
| 6 | 1 | 63.5 | 69.8 | 17 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 56 | 68% |
| cs.Wren 1.0 | 29 | 90% |
| mz.Cork 0.1 | 9 | 100% |
| donjezza.Jezza 1.0 | 7 | 100% |
| js.PinBall 1.6 | 6 | 67% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 45% | 108 |
| cs.Wren 1.0 | 17 | 14% | 25 |
| evd.X1 0.01 | 14 | 11% | 15 |
| js.PinBall 1.6 | 12 | 10% | 19 |
| mz.Cork 0.1 | 11 | 9% | 20 |
| joe.ADinosaur 1.0 | 10 | 8% | 11 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |

## Melee bench: F12

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.2 | 126 / 210 | 2.60 | 18.4% | 29697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 18.4% | 126 |
| ntc.Opposite 1.5 | 3.2 | 10.9% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.1% | 8 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.0% | 22 |
| myl.nano.Graviton 1.10 | 4.3 | 11.0% | 22 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 6 |
| DBall.NUKE 0.1 | 7.5 | 8.2% | 8 |
| disan.Chair 2.2.0 | 7.5 | 8.2% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 4 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.8 | 27 / 35 | 5263 |
| 2 | 1 | 68.7 | 86.3 | 23 / 35 | 4974 |
| 3 | 1 | 65.1 | 73.7 | 17 / 35 | 4882 |
| 4 | 1 | 65.9 | 78.4 | 19 / 35 | 4554 |
| 5 | 1 | 67.5 | 81.0 | 20 / 35 | 5118 |
| 6 | 1 | 67.9 | 84.1 | 20 / 35 | 4906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 77% |
| myl.nano.Graviton 1.10 | 30 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 24 | 92% |
| ntc.Opposite 1.5 | 15 | 93% |
| donjezza.Muncho 1.0 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| disan.Chair 2.2.0 | 10 | 90% |
| DBall.NUKE 0.1 | 9 | 78% |

Hadur died in 84 of 210 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 19% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 19% | 34 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 28 |
| myl.nano.Graviton 1.10 | 14 | 17% | 38 |
| ntc.Opposite 1.5 | 10 | 12% | 21 |
| DBall.NUKE 0.1 | 5 | 6% | 16 |
| disan.Chair 2.2.0 | 3 | 4% | 11 |
| donjezza.Muncho 1.0 | 2 | 2% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 65.9 | 73 / 210 | 4.07 | 14.5% | 25985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.8 | 14.5% | 73 |
| oog.melee.Capulet 1.2 | 2.3 | 14.5% | 49 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.4% | 29 |
| yagami.Tidus 0.11 | 4.0 | 12.7% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 70.5 | 15 / 35 | 4078 |
| 2 | 1 | 63.3 | 68.6 | 12 / 35 | 4485 |
| 3 | 1 | 64.3 | 73.0 | 15 / 35 | 4419 |
| 4 | 3 | 61.5 | 63.8 | 10 / 35 | 4224 |
| 5 | 2 | 62.1 | 64.1 | 11 / 35 | 4482 |
| 6 | 3 | 59.0 | 55.2 | 10 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 64% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| yagami.Tidus 0.11 | 21 | 100% |
| kawigi.micro.Shiz 1.1 | 15 | 93% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 42% | 80 |
| yagami.Tidus 0.11 | 26 | 19% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 12% | 30 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 24 |
| ejb.Polaris 1.0.1 | 8 | 6% | 13 |
| step.nanoPri 1.0 | 7 | 5% | 8 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| logiblocs.SittingDroid 1.0 | 1 | 1% | 0 |

## Melee bench: F14

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.9 | 126 / 210 | 2.90 | 17.5% | 28699 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.5% | 126 |
| wompi.Quokka 1.6 | 2.7 | 12.2% | 19 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 18 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 23 |
| ratosh.Nobo 0.21 | 5.3 | 10.1% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 3 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 23 / 35 | 4773 |
| 2 | 1 | 64.4 | 71.7 | 19 / 35 | 4775 |
| 3 | 1 | 65.0 | 74.0 | 19 / 35 | 4668 |
| 4 | 1 | 68.0 | 87.3 | 22 / 35 | 4895 |
| 5 | 1 | 67.8 | 82.9 | 23 / 35 | 5248 |
| 6 | 1 | 65.2 | 76.8 | 20 / 35 | 4340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 95% |
| wee.Gem 1.8.4 | 30 | 100% |
| wompi.Quokka 1.6 | 29 | 93% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 12 | 14% | 27 |
| ratosh.Nobo 0.21 | 12 | 14% | 21 |
| m3thos.Eva00 1.1 | 10 | 12% | 19 |
| bayen.UbaMicro 1.4 | 10 | 12% | 17 |
| bzdp.Pansy 2.1 | 9 | 11% | 47 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 10 |
| maribo.FollowFire 1 | 8 | 10% | 10 |
| wee.Gem 1.8.4 | 7 | 8% | 49 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |

## Melee bench: F15

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 84.1 | 115 / 210 | 2.43 | 20.1% | 44825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.2 | 20.1% | 115 |
| wompi.Wallaby 5.1 | 1.8 | 18.1% | 70 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 21 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 1 |
| ayk.WallHugger 1.0 | 5.0 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 76.2 | 9 / 35 | 6655 |
| 2 | 1 | 73.0 | 90.2 | 22 / 35 | 7925 |
| 3 | 1 | 72.0 | 88.3 | 22 / 35 | 7553 |
| 4 | 1 | 69.4 | 78.4 | 19 / 35 | 7008 |
| 5 | 1 | 71.2 | 83.5 | 20 / 35 | 7598 |
| 6 | 1 | 72.9 | 87.9 | 23 / 35 | 8086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 78% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| mz.NanoGod 2.02 | 12 | 58% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 6 | 83% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 45% | 131 |
| mz.NanoGod 2.02 | 31 | 33% | 40 |
| exauge.GateKeeper 1.1.121g | 14 | 15% | 19 |
| ayk.WallHugger 1.0 | 4 | 4% | 8 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.5 | 111 / 210 | 3.39 | 16.6% | 29622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 16.6% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 25 |
| bvh.micro.Freya 0.3 | 3.8 | 11.2% | 13 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.1% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 10.8% | 20 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.5% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.4% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 73.0 | 18 / 35 | 4547 |
| 2 | 1 | 62.8 | 67.3 | 15 / 35 | 4925 |
| 3 | 1 | 66.7 | 79.4 | 22 / 35 | 5141 |
| 4 | 1 | 65.3 | 73.3 | 19 / 35 | 5323 |
| 5 | 1 | 66.8 | 79.0 | 23 / 35 | 4919 |
| 6 | 1 | 62.8 | 68.9 | 14 / 35 | 4767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 89% |
| bvh.micro.Freya 0.3 | 26 | 96% |
| dummy.micro.Sparrow 2.5 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 65% |
| stelo.MirrorMicro 1.0 | 10 | 90% |
| conscience.Electron 1.3g | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 18% | 33 |
| voidious.micro.BlitzBat 1.05 | 16 | 16% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| conscience.Electron 1.3g | 14 | 14% | 21 |
| dummy.micro.Sparrow 2.5 | 11 | 11% | 28 |
| bvh.micro.Freya 0.3 | 9 | 9% | 31 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 17 |
| dl.BetterWalls 1.0 | 8 | 8% | 10 |

## Melee bench: F17

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.4 | 150 / 210 | 1.95 | 21.3% | 42295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 21.3% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 21 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 13 |
| sul.Lunar 1.1 | 3.7 | 10.9% | 7 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.5% | 4 |
| dsw.StaticD 1.0 | 6.2 | 8.1% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 6 |
| sample.Corners 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 90.5 | 25 / 35 | 7257 |
| 2 | 1 | 69.5 | 81.6 | 21 / 35 | 7055 |
| 3 | 1 | 73.6 | 95.9 | 29 / 35 | 7462 |
| 4 | 1 | 70.4 | 88.9 | 21 / 35 | 6525 |
| 5 | 1 | 73.2 | 96.8 | 31 / 35 | 6872 |
| 6 | 1 | 70.4 | 82.9 | 23 / 35 | 7124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 94% |
| sul.Lunar 1.1 | 38 | 97% |
| supersample.SuperBoxBot 1.0 | 20 | 100% |
| sample.MyFirstRobot 1.0 | 15 | 100% |
| dsw.StaticD 1.0 | 13 | 77% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 41% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 21% | 64 |
| dsw.StaticD 1.0 | 7 | 11% | 19 |
| sul.Lunar 1.1 | 5 | 8% | 47 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 7% | 8 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 14 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorW26 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.2 | 91 / 210 | 3.32 | 17.1% | 36936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW26 0.1 | 1.0 | 17.1% | 91 |
| radnor.DoctorBob 1.42 | 3.0 | 12.6% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.2% | 31 |
| mld.Wisdom 1.0 | 3.2 | 11.9% | 23 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 11 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.6% | 10 |
| sample.Walls 1.0 | 7.0 | 8.1% | 9 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 4 |
| GarmBox.Oranges 1.0 | 8.5 | 6.8% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.2 | 16 / 35 | 5846 |
| 2 | 1 | 67.9 | 78.7 | 20 / 35 | 6385 |
| 3 | 1 | 66.5 | 78.1 | 16 / 35 | 6195 |
| 4 | 1 | 65.4 | 74.3 | 14 / 35 | 6070 |
| 5 | 1 | 66.7 | 76.5 | 15 / 35 | 6366 |
| 6 | 1 | 63.6 | 67.3 | 10 / 35 | 6074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 84% |
| radnor.DoctorBob 1.42 | 27 | 70% |
| mld.Wisdom 1.0 | 16 | 44% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 32% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 20% | 52 |
| radnor.DoctorBob 1.42 | 19 | 16% | 40 |
| KiraNL.Chupacabra 0.4 | 19 | 16% | 28 |
| amz.NanoClone 1.41 | 12 | 10% | 20 |
| sample.Walls 1.0 | 3 | 3% | 12 |
| jangs.ns51 1.0 | 2 | 2% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

