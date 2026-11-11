# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 91.9 | 170 / 210 | 1.73 | 22.2% | 43924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.2% | 170 |
| radnor.DoctorBob 1.42 | 2.3 | 14.4% | 19 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 10 |
| mld.Infinity 2.2 | 4.0 | 12.3% | 8 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| sample.Walls 1.0 | 7.0 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.8% | 0 |
| sample.Target 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 92.4 | 29 / 35 | 7629 |
| 2 | 1 | 71.9 | 90.2 | 29 / 35 | 6719 |
| 3 | 1 | 74.9 | 96.5 | 30 / 35 | 7783 |
| 4 | 1 | 72.5 | 89.8 | 24 / 35 | 7295 |
| 5 | 1 | 74.1 | 94.9 | 30 / 35 | 7607 |
| 6 | 1 | 72.4 | 87.6 | 28 / 35 | 6891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 100% |
| radnor.DoctorBob 1.42 | 43 | 91% |
| mld.Infinity 2.2 | 34 | 91% |
| jangs.ns51 1.0 | 9 | 89% |
| amz.NanoClone 1.41 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 44% | 84 |
| mld.Infinity 2.2 | 9 | 22% | 11 |
| mz.AntiGrav 1.0 | 4 | 10% | 72 |
| amz.NanoClone 1.41 | 3 | 7% | 11 |
| jangs.ns51 1.0 | 3 | 7% | 7 |
| sample.Walls 1.0 | 2 | 5% | 15 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.0 | 139 / 210 | 2.08 | 19.4% | 31887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 139 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.4% | 42 |
| mld.DustBunny 3.8 | 2.8 | 13.4% | 10 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 0 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.6% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 8 |
| fullsail.SweetTea 1.1 | 7.8 | 6.6% | 6 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.9 | 28 / 35 | 5450 |
| 2 | 1 | 70.3 | 93.3 | 27 / 35 | 5047 |
| 3 | 1 | 69.2 | 89.2 | 21 / 35 | 5518 |
| 4 | 1 | 70.7 | 92.7 | 27 / 35 | 5611 |
| 5 | 1 | 70.1 | 92.1 | 23 / 35 | 5308 |
| 6 | 1 | 63.8 | 66.0 | 13 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 77 | 73% |
| mld.DustBunny 3.8 | 51 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| fullsail.SweetTea 1.1 | 8 | 63% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 46% | 91 |
| mld.DustBunny 3.8 | 12 | 17% | 49 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 13% | 17 |
| fullsail.SweetTea 1.1 | 5 | 7% | 14 |
| cs.Grudge 1.0 | 5 | 7% | 5 |
| zyx.nano.Ant 1.1 | 4 | 6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 13 |
| maribo.melee.BMV 0.1 | 1 | 1% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 91.3 | 163 / 210 | 1.78 | 21.6% | 38014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.6% | 163 |
| myl.micro.Troodon 1.10 | 2.0 | 13.2% | 19 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.2% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.9% | 8 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.0% | 12 |
| fm.mammillarias 1.3 | 6.2 | 9.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 4 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.1 | 30 / 35 | 6460 |
| 2 | 1 | 72.3 | 93.0 | 27 / 35 | 6716 |
| 3 | 1 | 70.2 | 86.7 | 25 / 35 | 5649 |
| 4 | 1 | 73.0 | 95.9 | 30 / 35 | 6495 |
| 5 | 1 | 71.4 | 89.5 | 25 / 35 | 6376 |
| 6 | 1 | 71.6 | 90.8 | 26 / 35 | 6318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 51 | 92% |
| myl.micro.Troodon 1.10 | 47 | 96% |
| cb.nano.Insomnia 1.0 | 33 | 79% |
| myl.nano.KomoriNinja 1.1 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 17 | 88% |
| fm.mammillarias 1.3 | 7 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 14 | 30% | 13 |
| myl.micro.Troodon 1.10 | 10 | 21% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 19% | 44 |
| fm.mammillarias 1.3 | 4 | 9% | 7 |
| myl.nano.KomoriNinja 1.1 | 3 | 6% | 31 |
| sp.Nanos.Ember 1.1 | 3 | 6% | 21 |
| cs.sheldor.Talon 1.1 | 2 | 4% | 9 |
| sample.Fire 1.0 | 1 | 2% | 6 |
| sample.Tracker 1.0 | 1 | 2% | 2 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.1 | 154 / 210 | 2.25 | 20.5% | 38509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 154 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 12 |
| tj.zombie1n 1.0.1 | 4.5 | 9.5% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.2% | 11 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.3 | 5.9% | 2 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 86.3 | 25 / 35 | 6314 |
| 2 | 1 | 73.1 | 96.5 | 32 / 35 | 6908 |
| 3 | 1 | 67.8 | 76.2 | 20 / 35 | 6184 |
| 4 | 1 | 72.5 | 93.7 | 30 / 35 | 6700 |
| 5 | 1 | 69.8 | 83.8 | 24 / 35 | 6307 |
| 6 | 1 | 68.7 | 80.3 | 23 / 35 | 6096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 94% |
| stelo.SoJNanoMelee 1.1 | 31 | 97% |
| tvv.micro.Antares 1.1.1 | 25 | 96% |
| tj.zombie1n 1.0.1 | 20 | 85% |
| yk.JahMicro 1.0 | 11 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 2 | 50% |

Hadur died in 58 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 34% | 84 |
| stelo.SoJNanoMelee 1.1 | 8 | 14% | 25 |
| yk.JahMicro 1.0 | 7 | 12% | 15 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 17 |
| tj.zombie1n 1.0.1 | 4 | 7% | 10 |
| repositorio.NanoStep 1.0 | 3 | 5% | 8 |
| sample.VelociRobot 1.0 | 2 | 3% | 9 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.8 | 103 / 210 | 3.72 | 16.2% | 29756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.2% | 103 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 31 |
| ahf.NanoAndrew .4 | 3.0 | 12.1% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 16 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 8 |
| sam.Samspin 1.0 | 6.2 | 9.3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 72.7 | 18 / 35 | 4806 |
| 2 | 1 | 63.2 | 65.7 | 17 / 35 | 4819 |
| 3 | 1 | 62.9 | 63.5 | 16 / 35 | 5194 |
| 4 | 1 | 65.6 | 75.6 | 20 / 35 | 4879 |
| 5 | 1 | 64.3 | 71.4 | 19 / 35 | 4852 |
| 6 | 1 | 64.4 | 69.8 | 13 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 95% |
| ahf.NanoAndrew .4 | 25 | 84% |
| oog.melee.Corsair 1.0 | 22 | 73% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 383. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 22% | 51 |
| robar.nano.Assertive_Melee 0.2 | 17 | 16% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 13% | 13 |
| ahf.NanoAndrew .4 | 12 | 11% | 33 |
| oog.melee.Corsair 1.0 | 10 | 9% | 31 |
| EBBU.Sim2 1.02 | 10 | 9% | 20 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 15 |
| sam.Samspin 1.0 | 7 | 7% | 12 |
| sample.TrackFire 1.0 | 5 | 5% | 9 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.9 | 146 / 210 | 2.00 | 19.8% | 32479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 146 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 22 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.6% | 14 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 5 |
| fm.claire 1.7 | 6.0 | 8.6% | 4 |
| sample.SpinBot 1.0 | 8.2 | 7.3% | 2 |
| pa.Improved 1.0 | 8.8 | 6.3% | 1 |
| kurios.DOSexe .9b | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.8 | 19 / 35 | 4920 |
| 2 | 1 | 70.1 | 91.7 | 27 / 35 | 5415 |
| 3 | 1 | 69.6 | 86.7 | 24 / 35 | 5524 |
| 4 | 1 | 70.1 | 90.8 | 26 / 35 | 5543 |
| 5 | 1 | 69.9 | 90.5 | 26 / 35 | 5354 |
| 6 | 1 | 69.9 | 89.8 | 24 / 35 | 5723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 91% |
| oog.melee.CapuletDroid 1.1 | 36 | 94% |
| gh.nano.Grofvuil 0.2 | 21 | 81% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 11 | 73% |
| sample.SpinBot 1.0 | 8 | 75% |
| fm.claire 1.7 | 6 | 67% |
| pa.Improved 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 25% | 73 |
| gh.nano.Grofvuil 0.2 | 14 | 22% | 43 |
| arthord.NanoSatanMelee Beta | 11 | 17% | 23 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 23 |
| fm.claire 1.7 | 5 | 8% | 13 |
| sample.SpinBot 1.0 | 4 | 6% | 11 |
| pa.Improved 1.0 | 1 | 2% | 6 |
| kurios.DOSexe .9b | 1 | 2% | 5 |

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.7 | 120 / 210 | 2.20 | 19.3% | 35103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.3% | 120 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.1% | 34 |
| mz.MicroGodMelee 1 | 3.0 | 13.4% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 11 |
| DBall.Anarchy 0.1 | 5.5 | 8.7% | 5 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 1 |
| fire219.CatBot 1.0 | 8.2 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.6% | 3 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.6 | 24 / 35 | 5706 |
| 2 | 1 | 68.9 | 86.7 | 19 / 35 | 5429 |
| 3 | 1 | 71.4 | 91.7 | 23 / 35 | 6417 |
| 4 | 1 | 67.4 | 81.3 | 18 / 35 | 5649 |
| 5 | 1 | 69.2 | 88.9 | 20 / 35 | 5618 |
| 6 | 1 | 68.8 | 83.2 | 16 / 35 | 6284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 93% |
| mz.MicroGodMelee 1 | 48 | 50% |
| gh.micro.Gruweltje 0.7 | 29 | 31% |
| DBall.Anarchy 0.1 | 22 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 40 | 44% | 71 |
| gh.micro.Gruweltje 0.7 | 27 | 30% | 47 |
| spinnercat.micro.Tyger 0.1 | 9 | 10% | 53 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| acogdev.alpha 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 16 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.3 | 114 / 210 | 3.59 | 16.7% | 31647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.5 | 16.7% | 114 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.3% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 32 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 5 |
| germ.TheMind .2 | 5.0 | 9.4% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.3% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 67.0 | 19 / 35 | 5233 |
| 2 | 1 | 65.3 | 71.7 | 21 / 35 | 5206 |
| 3 | 2 | 63.1 | 65.7 | 16 / 35 | 4878 |
| 4 | 1 | 67.7 | 78.7 | 21 / 35 | 5695 |
| 5 | 3 | 61.3 | 61.6 | 13 / 35 | 4730 |
| 6 | 1 | 69.4 | 82.9 | 24 / 35 | 5905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 80% |
| germ.TheMind .2 | 6 | 83% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 55% | 114 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 18% | 31 |
| germ.TheMind .2 | 7 | 7% | 16 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 9 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| awesomeness.Elite 1.0 | 3 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 10 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.5 | 168 / 210 | 1.94 | 20.4% | 30064 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.4% | 168 |
| rz.HawkOnFire 0.1 | 2.3 | 13.2% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 6 |
| maribo.IotaCT 1.1 | 4.0 | 10.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 1 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.7% | 2 |
| spinnercat.Omen 1.0 | 7.7 | 8.1% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 7.9% | 1 |
| stelo.PatternRobot 1.0 | 8.3 | 7.6% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.5 | 27 / 35 | 4644 |
| 2 | 1 | 69.3 | 85.1 | 27 / 35 | 4611 |
| 3 | 1 | 71.7 | 92.1 | 28 / 35 | 5243 |
| 4 | 1 | 71.2 | 91.4 | 30 / 35 | 5116 |
| 5 | 1 | 70.9 | 88.6 | 27 / 35 | 5371 |
| 6 | 1 | 71.1 | 90.5 | 29 / 35 | 5079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 97% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| maribo.IotaCT 1.1 | 18 | 94% |
| stelo.PatternRobot 1.0 | 13 | 92% |
| timmit.nano.TimDog 0.33 | 12 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 100% |
| spinnercat.Omen 1.0 | 10 | 100% |
| ratosh.Wesco 1.4 | 7 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 13 | 31% | 30 |
| rz.HawkOnFire 0.1 | 10 | 24% | 66 |
| nz.jdc.nano.GridFu 1.0 | 7 | 17% | 45 |
| stelo.PatternRobot 1.0 | 5 | 12% | 20 |
| maribo.IotaCT 1.1 | 3 | 7% | 20 |
| ratosh.Wesco 1.4 | 3 | 7% | 14 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.7 | 182 / 210 | 1.74 | 21.6% | 39019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.6% | 182 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.2% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.4% | 3 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.2% | 0 |
| zyx.micro.Ant 1.1 | 5.3 | 8.9% | 2 |
| sanja.First 0.1 | 6.0 | 8.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.0% | 0 |
| cvt.Firsty 1.0 | 7.7 | 7.7% | 6 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 85.7 | 26 / 35 | 6249 |
| 2 | 1 | 72.1 | 93.3 | 30 / 35 | 6834 |
| 3 | 1 | 72.5 | 94.6 | 33 / 35 | 6434 |
| 4 | 1 | 71.1 | 90.8 | 30 / 35 | 6359 |
| 5 | 1 | 72.0 | 92.1 | 31 / 35 | 6627 |
| 6 | 1 | 72.0 | 94.0 | 32 / 35 | 6516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 98% |
| tvv.nano.Polaris 1.2 | 35 | 100% |
| cvt.Firsty 1.0 | 30 | 97% |
| sanja.First 0.1 | 22 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| zyx.micro.Ant 1.1 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 9 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 6 | 21% | 55 |
| zyx.micro.Ant 1.1 | 5 | 18% | 33 |
| Grystrion.TrackerWO 1.0 | 5 | 18% | 19 |
| sample.RamFire 1.0 | 4 | 14% | 4 |
| cvt.Firsty 1.0 | 3 | 11% | 25 |
| baal.nano.N 1.42 | 2 | 7% | 34 |
| sanja.First 0.1 | 2 | 7% | 18 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 10 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.2 | 96 / 210 | 3.23 | 16.8% | 31740 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.8% | 96 |
| kc.micro.Figment 1.0 | 2.0 | 14.7% | 63 |
| cs.Wren 1.0 | 3.0 | 12.7% | 12 |
| mz.Cork 0.1 | 4.5 | 10.9% | 10 |
| js.PinBall 1.6 | 4.5 | 11.0% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 8.8% | 5 |
| evd.X1 0.01 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.9% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 21 / 35 | 5168 |
| 2 | 1 | 62.5 | 65.1 | 13 / 35 | 5300 |
| 3 | 1 | 68.0 | 82.2 | 17 / 35 | 5829 |
| 4 | 1 | 63.5 | 71.1 | 13 / 35 | 4909 |
| 5 | 1 | 66.2 | 76.2 | 18 / 35 | 5525 |
| 6 | 1 | 64.4 | 73.7 | 14 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 58% |
| cs.Wren 1.0 | 36 | 86% |
| mz.Cork 0.1 | 14 | 93% |
| js.PinBall 1.6 | 8 | 50% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 5 | 60% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 40% | 92 |
| joe.ADinosaur 1.0 | 13 | 11% | 15 |
| cs.Wren 1.0 | 12 | 11% | 31 |
| mz.Cork 0.1 | 11 | 10% | 23 |
| evd.X1 0.01 | 11 | 10% | 14 |
| js.PinBall 1.6 | 10 | 9% | 17 |
| PSW.Relentless 0.1 | 6 | 5% | 5 |
| jsal.Jsalbot 1.0 | 3 | 3% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.3 | 142 / 210 | 2.59 | 18.8% | 29868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.8% | 142 |
| ntc.Opposite 1.5 | 3.0 | 10.9% | 8 |
| myl.nano.Graviton 1.10 | 3.5 | 10.8% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.5% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.6% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 7 |
| disan.Chair 2.2.0 | 7.0 | 8.8% | 8 |
| DBall.NUKE 0.1 | 7.8 | 8.3% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 7 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 82.9 | 22 / 35 | 4939 |
| 2 | 1 | 69.6 | 87.9 | 27 / 35 | 5027 |
| 3 | 1 | 65.6 | 73.7 | 18 / 35 | 4860 |
| 4 | 1 | 67.9 | 81.3 | 25 / 35 | 5001 |
| 5 | 1 | 68.7 | 82.9 | 25 / 35 | 5223 |
| 6 | 1 | 68.5 | 85.4 | 25 / 35 | 4818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 35 | 97% |
| myl.nano.Graviton 1.10 | 26 | 81% |
| disan.Chair 2.2.0 | 21 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 100% |
| DBall.NUKE 0.1 | 17 | 94% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| ntc.Opposite 1.5 | 10 | 100% |
| donjezza.Muncho 1.0 | 8 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 23% | 38 |
| ntc.Opposite 1.5 | 13 | 18% | 23 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 18 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 31 |
| disan.Chair 2.2.0 | 6 | 8% | 19 |
| DBall.NUKE 0.1 | 4 | 6% | 26 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |
| donjezza.Muncho 1.0 | 2 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.0 | 94 / 210 | 3.16 | 16.5% | 26887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.5% | 94 |
| oog.melee.Capulet 1.2 | 2.7 | 13.4% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 25 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.2% | 34 |
| yagami.Tidus 0.11 | 5.2 | 11.1% | 5 |
| ejb.Polaris 1.0.1 | 5.5 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 8.0% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.4 | 17 / 35 | 4558 |
| 2 | 1 | 65.7 | 74.9 | 17 / 35 | 4536 |
| 3 | 1 | 66.0 | 74.9 | 16 / 35 | 4700 |
| 4 | 1 | 65.2 | 76.5 | 14 / 35 | 4464 |
| 5 | 1 | 64.1 | 69.8 | 15 / 35 | 4456 |
| 6 | 1 | 64.9 | 75.6 | 15 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 41 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| yagami.Tidus 0.11 | 17 | 94% |
| ejb.Polaris 1.0.1 | 10 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 47% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 13% | 36 |
| ejb.Polaris 1.0.1 | 15 | 13% | 28 |
| yagami.Tidus 0.11 | 13 | 11% | 26 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 26 |
| step.nanoPri 1.0 | 6 | 5% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.6 | 139 / 210 | 2.56 | 18.1% | 27222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 139 |
| bzdp.Pansy 2.1 | 2.3 | 12.3% | 15 |
| wompi.Quokka 1.6 | 3.5 | 11.7% | 14 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 26 |
| ratosh.Nobo 0.21 | 4.7 | 10.6% | 4 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.5 | 20 / 35 | 4523 |
| 2 | 1 | 66.5 | 83.8 | 23 / 35 | 4199 |
| 3 | 1 | 68.1 | 85.7 | 25 / 35 | 4576 |
| 4 | 1 | 66.7 | 78.7 | 21 / 35 | 4716 |
| 5 | 1 | 69.5 | 90.5 | 27 / 35 | 4943 |
| 6 | 1 | 66.1 | 79.7 | 23 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 90% |
| wee.Gem 1.8.4 | 35 | 94% |
| wompi.Quokka 1.6 | 33 | 94% |
| ratosh.Nobo 0.21 | 17 | 100% |
| m3thos.Eva00 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 18% | 53 |
| wee.Gem 1.8.4 | 11 | 15% | 45 |
| wompi.Quokka 1.6 | 11 | 15% | 33 |
| maribo.FollowFire 1 | 11 | 15% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 14% | 13 |
| bayen.UbaMicro 1.4 | 6 | 8% | 15 |
| ratosh.Nobo 0.21 | 5 | 7% | 19 |
| m3thos.Eva00 1.1 | 4 | 5% | 13 |
| stelo.MyAgileRobot 0.2 | 2 | 3% | 4 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 82.4 | 63 / 210 | 2.59 | 19.2% | 45080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 19.9% | 129 |
| hadur117.micro.SaorC 0.1 | 1.7 | 19.2% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 12 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 7.3 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.3% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.6 | 78.4 | 8 / 35 | 6734 |
| 2 | 2 | 69.7 | 76.8 | 9 / 35 | 7883 |
| 3 | 2 | 70.8 | 83.8 | 10 / 35 | 7498 |
| 4 | 1 | 71.7 | 88.6 | 14 / 35 | 7830 |
| 5 | 1 | 71.7 | 88.3 | 12 / 35 | 8010 |
| 6 | 2 | 68.6 | 78.4 | 10 / 35 | 7125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 110 | 25% |
| mz.NanoGod 2.02 | 16 | 75% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 102 | 69% | 135 |
| mz.NanoGod 2.02 | 21 | 14% | 37 |
| ayk.WallHugger 1.0 | 10 | 7% | 11 |
| exauge.GateKeeper 1.1.121g | 8 | 5% | 11 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.3 | 122 / 210 | 2.87 | 18.1% | 30902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 122 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.3% | 15 |
| bvh.micro.Freya 0.3 | 3.0 | 11.7% | 17 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.3% | 23 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.6% | 9 |
| conscience.Electron 1.3g | 7.2 | 8.0% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.7 | 15 / 35 | 5128 |
| 2 | 1 | 68.5 | 85.4 | 24 / 35 | 4880 |
| 3 | 1 | 65.1 | 70.5 | 18 / 35 | 5056 |
| 4 | 1 | 67.1 | 78.1 | 20 / 35 | 5312 |
| 5 | 1 | 68.1 | 81.0 | 22 / 35 | 5352 |
| 6 | 1 | 68.7 | 87.0 | 23 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 89% |
| bvh.micro.Freya 0.3 | 26 | 85% |
| dummy.micro.Sparrow 2.5 | 25 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 78% |
| stelo.MirrorMicro 1.0 | 9 | 78% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 52 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 18% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 17% | 46 |
| conscience.Electron 1.3g | 12 | 13% | 14 |
| dummy.micro.Sparrow 2.5 | 11 | 12% | 34 |
| bvh.micro.Freya 0.3 | 8 | 9% | 17 |
| stelo.MirrorMicro 1.0 | 5 | 6% | 19 |
| dl.BetterWalls 1.0 | 4 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 87.4 | 154 / 210 | 2.14 | 21.1% | 40977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.1% | 154 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 12 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.2% | 8 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.2% | 2 |
| dsw.StaticD 1.0 | 6.3 | 8.3% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 2 |
| sample.MyFirstRobot 1.0 | 8.2 | 5.9% | 3 |
| sample.Corners 1.0 | 9.0 | 5.7% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 79.4 | 21 / 35 | 6505 |
| 2 | 1 | 71.0 | 87.6 | 26 / 35 | 6576 |
| 3 | 1 | 71.7 | 89.2 | 29 / 35 | 6635 |
| 4 | 1 | 72.1 | 91.1 | 26 / 35 | 6906 |
| 5 | 1 | 72.1 | 89.2 | 26 / 35 | 7168 |
| 6 | 1 | 71.7 | 87.6 | 26 / 35 | 7187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 59 | 92% |
| sul.Lunar 1.1 | 45 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 96% |
| dsw.StaticD 1.0 | 12 | 50% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 27% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 22% | 58 |
| dsw.StaticD 1.0 | 10 | 17% | 22 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 13 |
| sul.Lunar 1.1 | 5 | 8% | 46 |
| sample.Corners 1.0 | 3 | 5% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.9 | 127 / 210 | 2.63 | 18.9% | 37923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.9% | 127 |
| radnor.DoctorBob 1.42 | 2.2 | 13.2% | 28 |
| mld.Wisdom 1.0 | 3.5 | 12.4% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.4% | 16 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 9 |
| amz.NanoClone 1.41 | 5.8 | 9.7% | 4 |
| sample.Walls 1.0 | 6.7 | 8.0% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.7 | 5.7% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 83.8 | 21 / 35 | 6677 |
| 2 | 1 | 65.0 | 69.5 | 18 / 35 | 5702 |
| 3 | 1 | 69.2 | 85.1 | 22 / 35 | 6279 |
| 4 | 1 | 69.8 | 86.0 | 24 / 35 | 6370 |
| 5 | 1 | 67.2 | 74.6 | 18 / 35 | 6497 |
| 6 | 1 | 70.4 | 92.1 | 24 / 35 | 6398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 96% |
| radnor.DoctorBob 1.42 | 44 | 70% |
| mld.Wisdom 1.0 | 26 | 85% |
| KiraNL.Chupacabra 0.4 | 11 | 73% |
| jangs.ns51 1.0 | 8 | 75% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 29% | 43 |
| radnor.DoctorBob 1.42 | 24 | 28% | 53 |
| KiraNL.Chupacabra 0.4 | 16 | 19% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 13% | 62 |
| sample.Walls 1.0 | 5 | 6% | 11 |
| amz.NanoClone 1.41 | 2 | 2% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

