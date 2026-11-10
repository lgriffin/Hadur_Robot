# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 89.1 | 160 / 210 | 1.98 | 21.7% | 43797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.7% | 160 |
| radnor.DoctorBob 1.42 | 2.2 | 14.2% | 19 |
| mz.AntiGrav 1.0 | 3.2 | 13.4% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.1% | 7 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 2 |
| sample.Walls 1.0 | 6.3 | 7.6% | 3 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 91.7 | 29 / 35 | 7022 |
| 2 | 1 | 72.3 | 85.7 | 26 / 35 | 7602 |
| 3 | 1 | 73.0 | 90.5 | 27 / 35 | 7402 |
| 4 | 1 | 72.9 | 89.8 | 26 / 35 | 7478 |
| 5 | 1 | 71.9 | 86.7 | 26 / 35 | 7432 |
| 6 | 1 | 71.9 | 90.2 | 26 / 35 | 6861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 97% |
| mld.Infinity 2.2 | 42 | 98% |
| radnor.DoctorBob 1.42 | 41 | 85% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 46% | 68 |
| mz.AntiGrav 1.0 | 11 | 22% | 68 |
| mld.Infinity 2.2 | 6 | 12% | 48 |
| amz.NanoClone 1.41 | 5 | 10% | 8 |
| GarmBox.Oranges 1.0 | 3 | 6% | 5 |
| sample.Walls 1.0 | 2 | 4% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 86.8 | 130 / 210 | 2.19 | 19.2% | 33807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.2% | 130 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.0% | 42 |
| mld.DustBunny 3.8 | 3.0 | 13.0% | 16 |
| maribo.melee.BMV 0.1 | 4.7 | 10.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 6 |
| zyx.nano.Ant 1.1 | 6.0 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.1% | 10 |
| bzdp.BoxCar 2.0 | 8.2 | 7.4% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 7.3% | 2 |
| cs.Grudge 1.0 | 9.2 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.2 | 20 / 35 | 6055 |
| 2 | 1 | 69.2 | 88.6 | 25 / 35 | 5474 |
| 3 | 1 | 66.7 | 81.0 | 16 / 35 | 5166 |
| 4 | 1 | 68.7 | 84.1 | 23 / 35 | 5643 |
| 5 | 1 | 70.2 | 88.9 | 25 / 35 | 6076 |
| 6 | 1 | 69.1 | 89.2 | 21 / 35 | 5393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 76% |
| mld.DustBunny 3.8 | 51 | 84% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 8 | 88% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 33% | 76 |
| mld.DustBunny 3.8 | 24 | 30% | 67 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 9% | 18 |
| fullsail.SweetTea 1.1 | 7 | 9% | 10 |
| maribo.melee.BMV 0.1 | 6 | 8% | 11 |
| zyx.nano.Ant 1.1 | 4 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 15 |
| cs.Grudge 1.0 | 2 | 3% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 84.6 | 138 / 210 | 2.39 | 20.5% | 39686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.5% | 138 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.1% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.8% | 14 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.9% | 9 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.6% | 1 |
| fm.mammillarias 1.3 | 6.3 | 9.0% | 3 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.9% | 4 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.7 | 27 / 35 | 6959 |
| 2 | 1 | 68.7 | 78.7 | 18 / 35 | 6373 |
| 3 | 1 | 69.9 | 83.8 | 20 / 35 | 6480 |
| 4 | 1 | 70.4 | 85.1 | 23 / 35 | 6709 |
| 5 | 1 | 70.7 | 81.6 | 24 / 35 | 6979 |
| 6 | 1 | 71.1 | 86.3 | 26 / 35 | 6186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 44 | 89% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| sp.Nanos.Ember 1.1 | 16 | 88% |
| myl.nano.KomoriNinja 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.Tracker 1.0 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 25% | 42 |
| myl.micro.Troodon 1.10 | 14 | 19% | 65 |
| cb.nano.Insomnia 1.0 | 13 | 18% | 19 |
| fm.mammillarias 1.3 | 11 | 15% | 17 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 26 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 12 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 23 |
| sample.Fire 1.0 | 2 | 3% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.9 | 153 / 210 | 2.09 | 20.8% | 39603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.8% | 153 |
| tvv.micro.Antares 1.1.1 | 2.5 | 11.9% | 12 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.0% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 10.1% | 18 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.8% | 0 |
| yk.JahMicro 1.0 | 7.0 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 9.3 | 6.0% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 82.9 | 20 / 35 | 6733 |
| 2 | 1 | 71.6 | 91.1 | 29 / 35 | 6636 |
| 3 | 1 | 70.6 | 87.0 | 28 / 35 | 6567 |
| 4 | 1 | 72.3 | 94.0 | 30 / 35 | 6574 |
| 5 | 1 | 71.6 | 89.8 | 24 / 35 | 7279 |
| 6 | 1 | 68.7 | 82.9 | 22 / 35 | 5814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 55 | 87% |
| kawigi.nano.Lib 1.0 | 48 | 90% |
| tvv.micro.Antares 1.1.1 | 23 | 78% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 95% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 34% | 65 |
| stelo.SoJNanoMelee 1.1 | 13 | 22% | 43 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 16% | 16 |
| tvv.micro.Antares 1.1.1 | 7 | 12% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 23 |
| tj.zombie1n 1.0.1 | 3 | 5% | 8 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.0 | 105 / 210 | 3.61 | 16.3% | 29162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.3% | 105 |
| oog.melee.Corsair 1.0 | 2.0 | 12.8% | 37 |
| ahf.NanoAndrew .4 | 3.5 | 11.2% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 10.7% | 13 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.6% | 8 |
| sam.Samspin 1.0 | 6.7 | 9.1% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.9% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.4 | 16 / 35 | 4785 |
| 2 | 1 | 62.9 | 64.4 | 19 / 35 | 4745 |
| 3 | 1 | 63.4 | 67.9 | 18 / 35 | 4781 |
| 4 | 1 | 64.4 | 71.7 | 16 / 35 | 4925 |
| 5 | 1 | 64.1 | 68.9 | 16 / 35 | 4826 |
| 6 | 1 | 67.0 | 81.3 | 20 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 36 | 69% |
| simonton.nano.MeleeSeed 1.8 | 33 | 97% |
| ahf.NanoAndrew .4 | 19 | 84% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 20 | 19% | 38 |
| oog.melee.Corsair 1.0 | 18 | 17% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 14% | 17 |
| zyx.nano.BacillusComma 1.0 | 13 | 12% | 17 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 40 |
| robar.nano.Assertive_Melee 0.2 | 10 | 9% | 15 |
| EBBU.Sim2 1.02 | 9 | 8% | 17 |
| sam.Samspin 1.0 | 6 | 6% | 13 |
| sample.TrackFire 1.0 | 4 | 4% | 8 |

## Melee bench: F06

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.5 | 139 / 210 | 2.22 | 19.6% | 34298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.6% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 30 |
| gh.nano.Grofvuil 0.2 | 3.7 | 11.5% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4.8 | 9.0% | 6 |
| fm.claire 1.7 | 6.0 | 8.1% | 2 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.1% | 4 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 0 |
| pa.Improved 1.0 | 9.2 | 6.4% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 22 / 35 | 5677 |
| 2 | 1 | 70.2 | 88.6 | 25 / 35 | 6219 |
| 3 | 1 | 68.0 | 84.8 | 19 / 35 | 5393 |
| 4 | 1 | 69.3 | 86.7 | 26 / 35 | 5285 |
| 5 | 1 | 69.7 | 85.1 | 24 / 35 | 6067 |
| 6 | 1 | 69.4 | 86.7 | 23 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 85% |
| oog.melee.CapuletDroid 1.1 | 37 | 97% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| arthord.NanoSatanMelee Beta | 11 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| kurios.DOSexe .9b | 5 | 100% |
| pa.Improved 1.0 | 2 | 50% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 43% | 86 |
| gh.nano.Grofvuil 0.2 | 15 | 21% | 31 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 13 |
| oog.melee.CapuletDroid 1.1 | 6 | 8% | 48 |
| winamp32.micro.MicroMacro 1.0 | 5 | 7% | 10 |
| sample.SpinBot 1.0 | 5 | 7% | 8 |
| pa.Improved 1.0 | 2 | 3% | 3 |
| fm.claire 1.7 | 1 | 1% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 7 |

## Melee bench: F07

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.8 | 104 / 210 | 2.46 | 18.5% | 34949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.5% | 104 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 33 |
| gh.micro.Gruweltje 0.7 | 3.0 | 14.4% | 30 |
| mz.MicroGodMelee 1 | 3.2 | 13.2% | 35 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 0 |
| acogdev.alpha 0.2 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.7% | 5 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 19 / 35 | 5586 |
| 2 | 1 | 69.2 | 87.6 | 18 / 35 | 6086 |
| 3 | 1 | 65.6 | 74.3 | 12 / 35 | 5713 |
| 4 | 1 | 70.0 | 86.7 | 22 / 35 | 6055 |
| 5 | 1 | 69.7 | 91.1 | 20 / 35 | 5753 |
| 6 | 1 | 66.6 | 78.1 | 13 / 35 | 5756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 80% |
| mz.MicroGodMelee 1 | 42 | 50% |
| gh.micro.Gruweltje 0.7 | 18 | 78% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 39 | 36% | 63 |
| gh.micro.Gruweltje 0.7 | 24 | 22% | 40 |
| spinnercat.micro.Tyger 0.1 | 22 | 21% | 62 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 13 |
| acogdev.alpha 0.2 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 13 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 72.0 | 113 / 210 | 3.52 | 16.9% | 31777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.3 | 16.9% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 33 |
| germ.TheMind .2 | 4.8 | 9.6% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.4% | 5 |
| awesomeness.Elite 1.0 | 6.3 | 8.3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.3% | 2 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.5% | 7 |
| sample.Crazy 1.0 | 8.3 | 7.0% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 58.7 | 13 / 35 | 4225 |
| 2 | 1 | 68.8 | 83.8 | 20 / 35 | 6113 |
| 3 | 1 | 67.0 | 77.1 | 21 / 35 | 5394 |
| 4 | 2 | 65.7 | 68.6 | 20 / 35 | 5675 |
| 5 | 1 | 66.7 | 76.2 | 20 / 35 | 5135 |
| 6 | 1 | 64.4 | 67.6 | 19 / 35 | 5235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 95% |
| germ.TheMind .2 | 8 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 44% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 11% | 33 |
| lrem.micro.MoggFanatic 0.2 | 10 | 10% | 16 |
| germ.TheMind .2 | 9 | 9% | 14 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 12 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| sample.Crazy 1.0 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.2 | 147 / 210 | 2.24 | 19.7% | 31553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.7% | 147 |
| rz.HawkOnFire 0.1 | 2.3 | 12.9% | 14 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 11.9% | 8 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 9 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.5% | 2 |
| stelo.PatternRobot 1.0 | 7.3 | 8.6% | 12 |
| spinnercat.Omen 1.0 | 7.7 | 8.1% | 6 |
| ratosh.Wesco 1.4 | 8.3 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.8 | 22 / 35 | 5245 |
| 2 | 1 | 70.6 | 87.9 | 26 / 35 | 5038 |
| 3 | 1 | 68.2 | 82.5 | 22 / 35 | 5190 |
| 4 | 1 | 68.6 | 82.9 | 22 / 35 | 5135 |
| 5 | 1 | 71.1 | 89.2 | 27 / 35 | 5685 |
| 6 | 1 | 70.8 | 89.8 | 28 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 94% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| maribo.IotaCT 1.1 | 19 | 89% |
| stelo.PatternRobot 1.0 | 14 | 71% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| ratosh.Wesco 1.4 | 8 | 75% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 21% | 59 |
| timmit.nano.TimDog 0.33 | 11 | 17% | 24 |
| nz.jdc.nano.GridFu 1.0 | 10 | 16% | 49 |
| ratosh.Wesco 1.4 | 10 | 16% | 21 |
| stelo.PatternRobot 1.0 | 9 | 14% | 15 |
| maribo.IotaCT 1.1 | 5 | 8% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 12 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.4 | 179 / 210 | 1.60 | 22.3% | 41582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 22.3% | 179 |
| baal.nano.N 1.42 | 2.5 | 11.5% | 5 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 11 |
| Grystrion.TrackerWO 1.0 | 4.0 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.8 | 8.9% | 5 |
| sanja.First 0.1 | 6.7 | 8.3% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.2% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 27 / 35 | 6803 |
| 2 | 1 | 71.4 | 89.5 | 30 / 35 | 6503 |
| 3 | 1 | 73.2 | 95.6 | 31 / 35 | 7463 |
| 4 | 1 | 72.2 | 90.5 | 29 / 35 | 7199 |
| 5 | 1 | 72.9 | 96.2 | 32 / 35 | 6836 |
| 6 | 1 | 72.8 | 95.9 | 30 / 35 | 6778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 37 | 84% |
| baal.nano.N 1.42 | 35 | 100% |
| cvt.Firsty 1.0 | 34 | 97% |
| sanja.First 0.1 | 25 | 96% |
| amk.Punbot.Punbot 0.01 | 21 | 100% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 31% | 58 |
| zyx.micro.Ant 1.1 | 7 | 22% | 33 |
| sanja.First 0.1 | 4 | 13% | 21 |
| cvt.Firsty 1.0 | 3 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 20 |
| baal.nano.N 1.42 | 2 | 6% | 39 |
| sample.RamFire 1.0 | 2 | 6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.4 | 94 / 210 | 3.57 | 16.1% | 31682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 16.1% | 94 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 57 |
| cs.Wren 1.0 | 3.2 | 13.1% | 26 |
| js.PinBall 1.6 | 4.0 | 11.2% | 12 |
| mz.Cork 0.1 | 4.7 | 10.7% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 2 |
| evd.X1 0.01 | 7.2 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.4 | 16 / 35 | 5130 |
| 2 | 1 | 64.4 | 71.4 | 17 / 35 | 5289 |
| 3 | 1 | 65.5 | 72.7 | 18 / 35 | 5675 |
| 4 | 2 | 60.8 | 63.5 | 11 / 35 | 4457 |
| 5 | 1 | 67.0 | 81.9 | 16 / 35 | 5507 |
| 6 | 1 | 63.9 | 66.7 | 16 / 35 | 5624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 81% |
| cs.Wren 1.0 | 38 | 87% |
| js.PinBall 1.6 | 7 | 71% |
| mz.Cork 0.1 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 42% | 100 |
| mz.Cork 0.1 | 16 | 14% | 20 |
| cs.Wren 1.0 | 13 | 11% | 39 |
| js.PinBall 1.6 | 11 | 9% | 18 |
| joe.ADinosaur 1.0 | 11 | 9% | 12 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 5 | 4% | 6 |
| evd.X1 0.01 | 4 | 3% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.3 | 141 / 210 | 2.32 | 19.3% | 30550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.3% | 141 |
| ntc.Opposite 1.5 | 2.8 | 11.7% | 13 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.4% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 9 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 6 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 5.6% | 2 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.1 | 22 / 35 | 5186 |
| 2 | 1 | 67.8 | 79.0 | 24 / 35 | 5022 |
| 3 | 1 | 69.5 | 88.3 | 22 / 35 | 5462 |
| 4 | 1 | 68.3 | 82.5 | 26 / 35 | 4968 |
| 5 | 1 | 70.0 | 90.8 | 25 / 35 | 5158 |
| 6 | 1 | 68.4 | 86.0 | 22 / 35 | 4754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 37 | 92% |
| myl.nano.Graviton 1.10 | 36 | 94% |
| ntc.Opposite 1.5 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 79% |
| donjezza.Muncho 1.0 | 13 | 92% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 28% | 44 |
| myl.nano.Graviton 1.10 | 11 | 16% | 48 |
| ntc.Opposite 1.5 | 11 | 16% | 21 |
| pfvicm.Sobieski 7.2.3b | 11 | 16% | 20 |
| disan.Chair 2.2.0 | 6 | 9% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 6% | 21 |
| DBall.NUKE 0.1 | 4 | 6% | 18 |
| pbg.R2D2 1.0 | 2 | 3% | 5 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.0 | 72 / 210 | 3.70 | 15.2% | 26223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.5 | 15.2% | 72 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 44 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.9% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 29 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.4% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.0 | 14 / 35 | 4519 |
| 2 | 1 | 63.6 | 69.2 | 12 / 35 | 4422 |
| 3 | 1 | 62.6 | 69.2 | 11 / 35 | 4092 |
| 4 | 3 | 60.5 | 59.7 | 11 / 35 | 4029 |
| 5 | 1 | 65.7 | 76.8 | 15 / 35 | 4631 |
| 6 | 2 | 63.8 | 71.1 | 9 / 35 | 4530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 70% |
| kawigi.micro.Shiz 1.1 | 24 | 88% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 91% |
| yagami.Tidus 0.11 | 11 | 82% |
| ejb.Polaris 1.0.1 | 4 | 75% |

Hadur died in 138 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 39% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 16% | 42 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 32 |
| yagami.Tidus 0.11 | 17 | 12% | 27 |
| ejb.Polaris 1.0.1 | 10 | 7% | 16 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| stelo.MirrorNano 1.3 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 6 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.8 | 117 / 210 | 3.18 | 17.0% | 28263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.0% | 117 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 15 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 38 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 17 |
| ratosh.Nobo 0.21 | 5.0 | 10.7% | 10 |
| bayen.UbaMicro 1.4 | 6.0 | 9.3% | 7 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.9% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 3 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 27 / 35 | 4672 |
| 2 | 1 | 65.1 | 74.6 | 18 / 35 | 4648 |
| 3 | 1 | 67.2 | 81.3 | 22 / 35 | 5085 |
| 4 | 1 | 61.6 | 63.5 | 12 / 35 | 4481 |
| 5 | 1 | 64.5 | 71.4 | 18 / 35 | 4529 |
| 6 | 1 | 66.0 | 76.8 | 20 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 96% |
| wompi.Quokka 1.6 | 23 | 83% |
| wee.Gem 1.8.4 | 22 | 86% |
| ratosh.Nobo 0.21 | 20 | 95% |
| m3thos.Eva00 1.1 | 8 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 93 of 210 rounds, at a mean tick of 379. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 19 | 20% | 43 |
| ratosh.Nobo 0.21 | 13 | 14% | 28 |
| bzdp.Pansy 2.1 | 12 | 13% | 53 |
| wompi.Quokka 1.6 | 11 | 12% | 24 |
| bayen.UbaMicro 1.4 | 11 | 12% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 11 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 10 |
| m3thos.Eva00 1.1 | 6 | 6% | 14 |
| maribo.FollowFire 1 | 5 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 86.3 | 121 / 210 | 2.23 | 21.1% | 47576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.1% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 64 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 18 |
| ayk.WallHugger 1.0 | 4.5 | 9.7% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 3 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 85.1 | 19 / 35 | 8247 |
| 2 | 1 | 73.2 | 89.5 | 25 / 35 | 8327 |
| 3 | 1 | 73.2 | 88.3 | 21 / 35 | 8348 |
| 4 | 1 | 70.7 | 83.5 | 16 / 35 | 7540 |
| 5 | 1 | 72.4 | 87.9 | 22 / 35 | 7530 |
| 6 | 1 | 71.4 | 83.8 | 18 / 35 | 7584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 101 | 76% |
| mz.NanoGod 2.02 | 17 | 65% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 49% | 129 |
| mz.NanoGod 2.02 | 29 | 33% | 46 |
| ayk.WallHugger 1.0 | 7 | 8% | 10 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 12 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.3 | 105 / 210 | 3.58 | 16.3% | 28512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.3% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.1% | 24 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 16 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 20 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 8 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 12 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.8 | 18 / 35 | 4462 |
| 2 | 1 | 65.7 | 75.6 | 17 / 35 | 4890 |
| 3 | 1 | 62.4 | 65.1 | 16 / 35 | 4466 |
| 4 | 1 | 67.3 | 80.0 | 21 / 35 | 5310 |
| 5 | 1 | 63.6 | 69.2 | 15 / 35 | 4804 |
| 6 | 1 | 63.3 | 68.3 | 18 / 35 | 4580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| dummy.micro.Sparrow 2.5 | 22 | 95% |
| bvh.micro.Freya 0.3 | 16 | 75% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 23 | 22% | 27 |
| voidious.micro.BlitzBat 1.05 | 17 | 16% | 53 |
| bvh.micro.Freya 0.3 | 14 | 13% | 23 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 36 |
| dl.BetterWalls 1.0 | 13 | 12% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 29 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.4 | 154 / 210 | 2.14 | 21.4% | 43083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.4% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.0% | 17 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 15 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.6% | 6 |
| dsw.StaticD 1.0 | 5.3 | 8.7% | 7 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.0% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.0% | 0 |
| sample.Corners 1.0 | 8.7 | 5.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 94.0 | 29 / 35 | 7393 |
| 2 | 1 | 72.1 | 87.9 | 27 / 35 | 7198 |
| 3 | 1 | 71.4 | 88.6 | 25 / 35 | 7010 |
| 4 | 1 | 72.7 | 89.8 | 27 / 35 | 7757 |
| 5 | 1 | 68.5 | 75.6 | 19 / 35 | 6837 |
| 6 | 1 | 71.8 | 88.3 | 27 / 35 | 6888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 96% |
| supersample.SuperBoxBot 1.0 | 29 | 93% |
| dsw.StaticD 1.0 | 15 | 60% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 30% | 61 |
| supersample.SuperBoxBot 1.0 | 14 | 25% | 36 |
| dsw.StaticD 1.0 | 14 | 25% | 29 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 12 |
| sul.Lunar 1.1 | 3 | 5% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 13 |
| sample.Corners 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.1 | 111 / 210 | 2.88 | 18.2% | 37546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.2% | 111 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 20 |
| mld.Wisdom 1.0 | 4.0 | 11.6% | 21 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 5 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 8 |
| sample.Walls 1.0 | 6.7 | 8.2% | 8 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 5 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.0 | 16 / 35 | 6203 |
| 2 | 1 | 66.7 | 77.8 | 19 / 35 | 5999 |
| 3 | 1 | 69.2 | 83.5 | 18 / 35 | 6861 |
| 4 | 1 | 68.3 | 81.6 | 22 / 35 | 6073 |
| 5 | 1 | 66.6 | 74.9 | 19 / 35 | 6311 |
| 6 | 1 | 67.0 | 75.9 | 17 / 35 | 6099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 91% |
| radnor.DoctorBob 1.42 | 30 | 90% |
| mld.Wisdom 1.0 | 14 | 57% |
| amz.NanoClone 1.41 | 11 | 82% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 78% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 27% | 36 |
| radnor.DoctorBob 1.42 | 20 | 20% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 59 |
| amz.NanoClone 1.41 | 16 | 16% | 24 |
| KiraNL.Chupacabra 0.4 | 9 | 9% | 17 |
| jangs.ns51 1.0 | 7 | 7% | 8 |
| GarmBox.Oranges 1.0 | 5 | 5% | 7 |
| sample.Walls 1.0 | 1 | 1% | 10 |

