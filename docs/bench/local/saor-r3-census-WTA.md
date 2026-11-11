# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 152 / 210 | 2.10 | 21.4% | 43370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.4% | 152 |
| mz.AntiGrav 1.0 | 2.3 | 14.4% | 17 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 16 |
| mld.Infinity 2.2 | 3.8 | 12.8% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 4 |
| GarmBox.Oranges 1.0 | 6.3 | 7.1% | 0 |
| sample.Walls 1.0 | 7.2 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 3.9% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 94.0 | 31 / 35 | 7656 |
| 2 | 1 | 73.1 | 90.2 | 26 / 35 | 7401 |
| 3 | 1 | 71.7 | 86.3 | 25 / 35 | 7241 |
| 4 | 1 | 72.2 | 85.4 | 27 / 35 | 7291 |
| 5 | 1 | 70.0 | 82.9 | 21 / 35 | 6327 |
| 6 | 1 | 72.6 | 88.3 | 22 / 35 | 7454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 96% |
| radnor.DoctorBob 1.42 | 34 | 94% |
| mld.Infinity 2.2 | 32 | 94% |
| amz.NanoClone 1.41 | 9 | 67% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 17 | 29% | 57 |
| mld.Infinity 2.2 | 14 | 24% | 47 |
| amz.NanoClone 1.41 | 13 | 22% | 19 |
| mz.AntiGrav 1.0 | 10 | 17% | 73 |
| sample.Walls 1.0 | 2 | 3% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.4 | 125 / 210 | 2.31 | 18.8% | 32291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.8% | 125 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 48 |
| mld.DustBunny 3.8 | 2.8 | 13.8% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.8% | 6 |
| zyx.nano.Ant 1.1 | 6.0 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.3% | 6 |
| bzdp.BoxCar 2.0 | 7.7 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.2% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 22 / 35 | 5825 |
| 2 | 1 | 68.7 | 89.5 | 22 / 35 | 5033 |
| 3 | 1 | 69.6 | 90.2 | 19 / 35 | 5447 |
| 4 | 1 | 69.7 | 88.3 | 24 / 35 | 5616 |
| 5 | 1 | 69.3 | 90.2 | 22 / 35 | 5090 |
| 6 | 1 | 64.2 | 65.7 | 16 / 35 | 5280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 60 | 88% |
| oog.melee.Mercutio 1.0 | 57 | 68% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| maribo.melee.BMV 0.1 | 10 | 90% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 44% | 72 |
| mld.DustBunny 3.8 | 18 | 21% | 71 |
| maribo.melee.BMV 0.1 | 7 | 8% | 18 |
| cs.Grudge 1.0 | 7 | 8% | 7 |
| zyx.nano.Ant 1.1 | 5 | 6% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 11 |
| fullsail.SweetTea 1.1 | 3 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 10 |
| bzdp.BoxCar 2.0 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.3 | 138 / 210 | 2.41 | 20.3% | 38485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.3% | 138 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.6% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.8% | 18 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.6% | 6 |
| fm.mammillarias 1.3 | 5.8 | 8.7% | 4 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.9% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 2 |
| sample.Fire 1.0 | 9.3 | 5.3% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.1 | 27 / 35 | 6675 |
| 2 | 1 | 68.1 | 75.6 | 20 / 35 | 5897 |
| 3 | 1 | 70.6 | 86.3 | 22 / 35 | 6602 |
| 4 | 1 | 69.6 | 82.2 | 23 / 35 | 6311 |
| 5 | 1 | 69.7 | 80.6 | 21 / 35 | 6529 |
| 6 | 1 | 71.1 | 88.9 | 25 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 73% |
| cb.nano.Insomnia 1.0 | 29 | 97% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 14 | 93% |
| sample.Fire 1.0 | 5 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 35% | 48 |
| myl.micro.Troodon 1.10 | 10 | 14% | 56 |
| myl.nano.KomoriNinja 1.1 | 10 | 14% | 33 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 13 |
| fm.mammillarias 1.3 | 8 | 11% | 13 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 26 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 10 |
| sample.Fire 1.0 | 3 | 4% | 8 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.5 | 148 / 210 | 2.03 | 21.0% | 40074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.0% | 148 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 8 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.9% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 6 |
| yk.JahMicro 1.0 | 7.0 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.6 | 29 / 35 | 7256 |
| 2 | 1 | 69.3 | 82.2 | 23 / 35 | 6392 |
| 3 | 1 | 69.9 | 88.3 | 21 / 35 | 6193 |
| 4 | 1 | 71.5 | 88.6 | 25 / 35 | 7143 |
| 5 | 1 | 71.5 | 89.8 | 27 / 35 | 6591 |
| 6 | 1 | 70.2 | 86.7 | 23 / 35 | 6499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 94% |
| stelo.SoJNanoMelee 1.1 | 34 | 85% |
| tvv.micro.Antares 1.1.1 | 19 | 89% |
| tj.zombie1n 1.0.1 | 13 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 77% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 67% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 40% | 88 |
| stelo.SoJNanoMelee 1.1 | 12 | 19% | 29 |
| tvv.micro.Antares 1.1.1 | 8 | 13% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 23 |
| tj.zombie1n 1.0.1 | 5 | 8% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 7 |
| yk.JahMicro 1.0 | 2 | 3% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.8 | 95 / 210 | 3.54 | 16.5% | 29747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.5% | 95 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.5% | 27 |
| ahf.NanoAndrew .4 | 3.8 | 10.9% | 25 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 10 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.3% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.5 | 20 / 35 | 5378 |
| 2 | 1 | 63.8 | 68.9 | 17 / 35 | 4804 |
| 3 | 1 | 63.8 | 68.6 | 14 / 35 | 4891 |
| 4 | 1 | 63.1 | 68.6 | 14 / 35 | 4581 |
| 5 | 1 | 64.7 | 71.4 | 15 / 35 | 5066 |
| 6 | 1 | 66.0 | 76.8 | 15 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 69% |
| simonton.nano.MeleeSeed 1.8 | 29 | 83% |
| ahf.NanoAndrew .4 | 20 | 60% |
| sam.Samspin 1.0 | 17 | 94% |
| robar.nano.Assertive_Melee 0.2 | 8 | 75% |
| EBBU.Sim2 1.02 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 43 |
| oog.melee.Corsair 1.0 | 22 | 19% | 53 |
| ahf.NanoAndrew .4 | 19 | 17% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14% | 18 |
| robar.nano.Assertive_Melee 0.2 | 12 | 10% | 16 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 13 |
| EBBU.Sim2 1.02 | 6 | 5% | 9 |
| sam.Samspin 1.0 | 4 | 3% | 17 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.7 | 132 / 210 | 2.47 | 19.0% | 33237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.0% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 30 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 6 |
| fm.claire 1.7 | 6.2 | 8.5% | 1 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.1% | 5 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 5 |
| pa.Improved 1.0 | 9.3 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.9 | 18 / 35 | 5211 |
| 2 | 1 | 67.8 | 82.9 | 23 / 35 | 5038 |
| 3 | 1 | 69.9 | 89.2 | 22 / 35 | 6039 |
| 4 | 1 | 68.7 | 83.2 | 21 / 35 | 5736 |
| 5 | 1 | 69.1 | 85.4 | 22 / 35 | 5696 |
| 6 | 1 | 69.4 | 86.7 | 26 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 84% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 83% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| fm.claire 1.7 | 8 | 100% |
| sample.SpinBot 1.0 | 8 | 100% |
| arthord.NanoSatanMelee Beta | 5 | 80% |
| pa.Improved 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 36% | 74 |
| gh.nano.Grofvuil 0.2 | 15 | 19% | 40 |
| oog.melee.CapuletDroid 1.1 | 12 | 15% | 43 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 11 |
| fm.claire 1.7 | 7 | 9% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 15 |
| sample.SpinBot 1.0 | 3 | 4% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.9 | 107 / 210 | 2.36 | 18.9% | 35276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.9% | 107 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.6% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 12.9% | 18 |
| mz.MicroGodMelee 1 | 3.5 | 13.1% | 41 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 10 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.7% | 2 |
| el.JumpShoot 0.2 | 7.3 | 6.7% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.6% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.1 | 14 / 35 | 5568 |
| 2 | 1 | 69.3 | 89.5 | 20 / 35 | 5819 |
| 3 | 1 | 69.9 | 88.3 | 22 / 35 | 5880 |
| 4 | 1 | 68.1 | 81.9 | 16 / 35 | 5789 |
| 5 | 1 | 70.8 | 90.8 | 23 / 35 | 6352 |
| 6 | 1 | 65.9 | 74.9 | 12 / 35 | 5868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 82% |
| mz.MicroGodMelee 1 | 42 | 62% |
| gh.micro.Gruweltje 0.7 | 28 | 64% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 41 | 40% | 69 |
| gh.micro.Gruweltje 0.7 | 25 | 24% | 49 |
| spinnercat.micro.Tyger 0.1 | 17 | 17% | 50 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 12 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| el.JumpShoot 0.2 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 73.3 | 116 / 210 | 3.40 | 17.0% | 30957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.0% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.4% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.6% | 34 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.9% | 5 |
| germ.TheMind .2 | 5.5 | 8.8% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.4% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 7 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.0 | 21 / 35 | 5035 |
| 2 | 1 | 63.6 | 64.4 | 18 / 35 | 5135 |
| 3 | 1 | 65.0 | 70.8 | 18 / 35 | 5056 |
| 4 | 1 | 66.9 | 76.8 | 22 / 35 | 5145 |
| 5 | 1 | 66.7 | 75.6 | 19 / 35 | 5614 |
| 6 | 1 | 65.2 | 72.4 | 18 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 92% |
| qualidafial.MajorDick 1.0.1 | 13 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| germ.TheMind .2 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 48% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 16% | 37 |
| stelo.UntouchableNano 1.3 | 8 | 9% | 15 |
| awesomeness.Elite 1.0 | 8 | 9% | 15 |
| germ.TheMind .2 | 7 | 7% | 14 |
| mym.EdgeStalker 1.0 | 5 | 5% | 5 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 9 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.6 | 156 / 210 | 1.84 | 20.5% | 31657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.5% | 156 |
| rz.HawkOnFire 0.1 | 2.2 | 13.1% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 8 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 6 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.1% | 3 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 7 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.9% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.7 | 26 / 35 | 5244 |
| 2 | 1 | 71.2 | 90.5 | 28 / 35 | 5327 |
| 3 | 1 | 71.8 | 93.3 | 28 / 35 | 5388 |
| 4 | 1 | 70.1 | 89.5 | 21 / 35 | 5477 |
| 5 | 1 | 71.3 | 94.0 | 27 / 35 | 5263 |
| 6 | 1 | 70.6 | 89.8 | 26 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 67 | 96% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| stelo.PatternRobot 1.0 | 18 | 78% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 79% |
| ratosh.Wesco 1.4 | 10 | 70% |
| maribo.IotaCT 1.1 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 13 | 24% | 18 |
| rz.HawkOnFire 0.1 | 11 | 20% | 68 |
| ratosh.Wesco 1.4 | 10 | 19% | 22 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 57 |
| timmit.nano.TimDog 0.33 | 5 | 9% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 14 |
| maribo.IotaCT 1.1 | 4 | 7% | 13 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.0 | 162 / 210 | 1.90 | 21.2% | 40209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.2% | 162 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.8% | 15 |
| baal.nano.N 1.42 | 3.0 | 11.4% | 8 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 3 |
| sanja.First 0.1 | 5.8 | 8.7% | 3 |
| zyx.micro.Ant 1.1 | 6.0 | 8.6% | 9 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.6% | 2 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 9 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.2 | 26 / 35 | 7003 |
| 2 | 1 | 72.1 | 94.3 | 30 / 35 | 6638 |
| 3 | 1 | 71.7 | 92.1 | 28 / 35 | 6934 |
| 4 | 1 | 71.8 | 89.8 | 27 / 35 | 7090 |
| 5 | 1 | 69.8 | 85.7 | 24 / 35 | 6535 |
| 6 | 1 | 69.7 | 87.9 | 27 / 35 | 6009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 95% |
| baal.nano.N 1.42 | 31 | 90% |
| sanja.First 0.1 | 28 | 96% |
| cvt.Firsty 1.0 | 26 | 88% |
| zyx.micro.Ant 1.1 | 18 | 78% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 29% | 31 |
| baal.nano.N 1.42 | 9 | 19% | 38 |
| Grystrion.TrackerWO 1.0 | 8 | 17% | 15 |
| tvv.nano.Polaris 1.2 | 6 | 13% | 63 |
| cvt.Firsty 1.0 | 6 | 13% | 19 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 3 |
| sanja.First 0.1 | 1 | 2% | 27 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.2 | 92 / 210 | 3.59 | 16.1% | 31196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.1% | 92 |
| kc.micro.Figment 1.0 | 2.0 | 15.2% | 58 |
| cs.Wren 1.0 | 3.2 | 12.6% | 23 |
| js.PinBall 1.6 | 4.2 | 11.2% | 13 |
| mz.Cork 0.1 | 4.8 | 10.7% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 5 |
| evd.X1 0.01 | 6.7 | 8.1% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 60.3 | 15 / 35 | 5028 |
| 2 | 1 | 64.6 | 72.7 | 12 / 35 | 5263 |
| 3 | 1 | 64.1 | 69.5 | 18 / 35 | 5057 |
| 4 | 1 | 65.2 | 74.3 | 15 / 35 | 5400 |
| 5 | 1 | 67.9 | 82.9 | 18 / 35 | 5551 |
| 6 | 1 | 62.8 | 67.6 | 14 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 76% |
| cs.Wren 1.0 | 23 | 74% |
| js.PinBall 1.6 | 14 | 79% |
| mz.Cork 0.1 | 10 | 70% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 43 | 36% | 96 |
| cs.Wren 1.0 | 16 | 14% | 33 |
| joe.ADinosaur 1.0 | 15 | 13% | 18 |
| js.PinBall 1.6 | 14 | 12% | 18 |
| evd.X1 0.01 | 12 | 10% | 12 |
| mz.Cork 0.1 | 10 | 8% | 20 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.4 | 133 / 210 | 2.31 | 19.0% | 29216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.0% | 133 |
| ntc.Opposite 1.5 | 2.8 | 11.2% | 5 |
| myl.nano.Graviton 1.10 | 3.5 | 11.1% | 20 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.2% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.5 | 9.1% | 5 |
| DBall.NUKE 0.1 | 6.8 | 8.2% | 5 |
| disan.Chair 2.2.0 | 7.5 | 8.2% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.5% | 7 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 22 / 35 | 5292 |
| 2 | 1 | 67.0 | 81.0 | 21 / 35 | 4743 |
| 3 | 1 | 68.4 | 88.3 | 21 / 35 | 4785 |
| 4 | 1 | 69.4 | 89.5 | 26 / 35 | 4852 |
| 5 | 1 | 69.3 | 87.9 | 24 / 35 | 4913 |
| 6 | 1 | 65.8 | 76.5 | 19 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 75% |
| myl.nano.Graviton 1.10 | 35 | 91% |
| donjezza.Muncho 1.0 | 24 | 96% |
| ntc.Opposite 1.5 | 21 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 80% |
| disan.Chair 2.2.0 | 10 | 90% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |

Hadur died in 78 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 26% | 49 |
| pfvicm.Sobieski 7.2.3b | 16 | 21% | 24 |
| myl.nano.Graviton 1.10 | 11 | 14% | 40 |
| ntc.Opposite 1.5 | 11 | 14% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 25 |
| disan.Chair 2.2.0 | 4 | 5% | 12 |
| DBall.NUKE 0.1 | 3 | 4% | 17 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 76.5 | 91 / 210 | 3.11 | 16.7% | 28156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.7% | 91 |
| oog.melee.Capulet 1.2 | 2.3 | 13.7% | 48 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 21 |
| yagami.Tidus 0.11 | 4.7 | 11.7% | 8 |
| ejb.Polaris 1.0.1 | 5.8 | 10.1% | 9 |
| step.nanoPri 1.0 | 7.5 | 7.4% | 1 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 73.3 | 14 / 35 | 4579 |
| 2 | 1 | 63.5 | 71.4 | 13 / 35 | 4272 |
| 3 | 1 | 65.8 | 75.9 | 14 / 35 | 4596 |
| 4 | 1 | 67.1 | 78.7 | 17 / 35 | 4843 |
| 5 | 1 | 68.9 | 85.7 | 21 / 35 | 4967 |
| 6 | 1 | 65.6 | 74.0 | 12 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 53% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 86% |
| yagami.Tidus 0.11 | 19 | 89% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 41% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 14% | 44 |
| yagami.Tidus 0.11 | 17 | 14% | 31 |
| kawigi.micro.Shiz 1.1 | 15 | 13% | 30 |
| step.nanoPri 1.0 | 8 | 7% | 8 |
| ejb.Polaris 1.0.1 | 6 | 5% | 16 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.4 | 128 / 210 | 2.95 | 17.5% | 28149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.5% | 128 |
| bzdp.Pansy 2.1 | 2.3 | 12.5% | 30 |
| wompi.Quokka 1.6 | 3.7 | 11.8% | 11 |
| wee.Gem 1.8.4 | 3.8 | 11.9% | 24 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.5 | 6.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 73.7 | 19 / 35 | 4590 |
| 2 | 1 | 68.7 | 84.4 | 25 / 35 | 5191 |
| 3 | 1 | 65.5 | 75.2 | 20 / 35 | 4460 |
| 4 | 1 | 68.1 | 86.3 | 25 / 35 | 4801 |
| 5 | 1 | 63.7 | 69.8 | 17 / 35 | 4457 |
| 6 | 1 | 66.9 | 80.6 | 22 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 48 | 98% |
| bzdp.Pansy 2.1 | 39 | 82% |
| wompi.Quokka 1.6 | 30 | 87% |
| ratosh.Nobo 0.21 | 10 | 90% |
| m3thos.Eva00 1.1 | 9 | 89% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 45 |
| ratosh.Nobo 0.21 | 13 | 15% | 23 |
| wompi.Quokka 1.6 | 11 | 13% | 30 |
| bayen.UbaMicro 1.4 | 8 | 10% | 14 |
| stelo.MyAgileRobot 0.2 | 8 | 10% | 10 |
| m3thos.Eva00 1.1 | 7 | 8% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 8% | 9 |
| maribo.FollowFire 1 | 7 | 8% | 6 |
| wee.Gem 1.8.4 | 5 | 6% | 57 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 89.9 | 141 / 210 | 1.91 | 21.5% | 45888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.5% | 141 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 43 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 21 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.4% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.4% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.0 | 26 / 35 | 7911 |
| 2 | 1 | 73.3 | 92.1 | 24 / 35 | 7632 |
| 3 | 1 | 70.9 | 85.4 | 20 / 35 | 7086 |
| 4 | 1 | 71.8 | 88.3 | 20 / 35 | 7326 |
| 5 | 1 | 73.7 | 91.7 | 26 / 35 | 7854 |
| 6 | 1 | 73.2 | 88.9 | 25 / 35 | 8079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 84% |
| mz.NanoGod 2.02 | 22 | 73% |
| exauge.GateKeeper 1.1.121g | 15 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 6 | 83% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 32 | 46% | 139 |
| mz.NanoGod 2.02 | 23 | 33% | 38 |
| exauge.GateKeeper 1.1.121g | 5 | 7% | 11 |
| stelo.PianistNano 1.2 | 3 | 4% | 7 |
| ayk.WallHugger 1.0 | 3 | 4% | 7 |
| drd.Dreadknoght 0.9 | 3 | 4% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.7 | 100 / 210 | 3.55 | 16.3% | 28494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.3% | 100 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 25 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 23 |
| bvh.micro.Freya 0.3 | 4.2 | 11.6% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.5 | 9.8% | 12 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.5% | 10 |
| conscience.Electron 1.3g | 6.3 | 8.7% | 5 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 6 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 6.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.6 | 20 / 35 | 4897 |
| 2 | 1 | 65.7 | 74.3 | 16 / 35 | 5279 |
| 3 | 1 | 63.3 | 68.3 | 15 / 35 | 4317 |
| 4 | 1 | 63.0 | 69.2 | 15 / 35 | 4431 |
| 5 | 1 | 65.5 | 75.2 | 17 / 35 | 5043 |
| 6 | 1 | 63.1 | 67.6 | 17 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 89% |
| dummy.micro.Sparrow 2.5 | 33 | 85% |
| bvh.micro.Freya 0.3 | 26 | 69% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 1 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 24 | 22% | 47 |
| voidious.micro.BlitzBat 1.05 | 18 | 16% | 50 |
| bvh.micro.Freya 0.3 | 17 | 15% | 32 |
| conscience.Electron 1.3g | 16 | 15% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 7% | 25 |
| dl.BetterWalls 1.0 | 8 | 7% | 12 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 8 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 84.0 | 146 / 210 | 2.44 | 20.8% | 41764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.8% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 23 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 8 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 11 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.7% | 4 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.9% | 1 |
| sample.Corners 1.0 | 8.8 | 5.7% | 1 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 81.9 | 23 / 35 | 7110 |
| 2 | 1 | 69.9 | 84.1 | 22 / 35 | 6602 |
| 3 | 1 | 70.9 | 84.1 | 25 / 35 | 6675 |
| 4 | 1 | 71.9 | 87.6 | 28 / 35 | 6909 |
| 5 | 1 | 71.7 | 86.0 | 27 / 35 | 7150 |
| 6 | 1 | 70.4 | 80.3 | 21 / 35 | 7318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 53 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 89% |
| supersample.SuperBoxBot 1.0 | 28 | 82% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| dsw.StaticD 1.0 | 7 | 57% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 30% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 20% | 53 |
| sul.Lunar 1.1 | 7 | 11% | 60 |
| dsw.StaticD 1.0 | 7 | 11% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 9% | 16 |
| sample.Corners 1.0 | 5 | 8% | 8 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 2 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.9 | 117 / 210 | 2.63 | 18.9% | 38700 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.9% | 117 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 31 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.6% | 20 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.2% | 5 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 14 |
| sample.Walls 1.0 | 7.2 | 7.9% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.7 | 21 / 35 | 6431 |
| 2 | 1 | 67.8 | 78.4 | 17 / 35 | 6562 |
| 3 | 1 | 69.9 | 85.7 | 21 / 35 | 7131 |
| 4 | 1 | 67.7 | 78.4 | 20 / 35 | 6161 |
| 5 | 1 | 67.8 | 81.3 | 19 / 35 | 6021 |
| 6 | 1 | 68.3 | 81.6 | 19 / 35 | 6394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 95% |
| radnor.DoctorBob 1.42 | 27 | 81% |
| mld.Wisdom 1.0 | 20 | 70% |
| sample.Walls 1.0 | 10 | 100% |
| amz.NanoClone 1.41 | 10 | 60% |
| jangs.ns51 1.0 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 7 | 86% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 30% | 45 |
| radnor.DoctorBob 1.42 | 17 | 18% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 17% | 55 |
| amz.NanoClone 1.41 | 13 | 14% | 20 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 19 |
| jangs.ns51 1.0 | 4 | 4% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| sample.Walls 1.0 | 2 | 2% | 7 |

