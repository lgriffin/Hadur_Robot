# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.4 | 151 / 210 | 1.95 | 21.4% | 42233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.4% | 151 |
| mz.AntiGrav 1.0 | 2.2 | 14.6% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 14.0% | 18 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 16 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 0 |
| sample.Walls 1.0 | 7.2 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 87.6 | 24 / 35 | 6363 |
| 2 | 1 | 72.5 | 92.4 | 26 / 35 | 6688 |
| 3 | 1 | 71.9 | 88.9 | 24 / 35 | 7236 |
| 4 | 1 | 73.1 | 90.8 | 26 / 35 | 7663 |
| 5 | 1 | 71.5 | 85.4 | 24 / 35 | 6916 |
| 6 | 1 | 73.5 | 91.4 | 27 / 35 | 7367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 96% |
| mld.Infinity 2.2 | 36 | 94% |
| radnor.DoctorBob 1.42 | 31 | 87% |
| amz.NanoClone 1.41 | 8 | 75% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 41% | 64 |
| mz.AntiGrav 1.0 | 13 | 22% | 76 |
| amz.NanoClone 1.41 | 9 | 15% | 17 |
| mld.Infinity 2.2 | 6 | 10% | 39 |
| jangs.ns51 1.0 | 4 | 7% | 6 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.5 | 160 / 210 | 1.77 | 19.8% | 31670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.8% | 160 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.3% | 26 |
| mld.DustBunny 3.8 | 3.2 | 12.6% | 15 |
| maribo.melee.BMV 0.1 | 3.7 | 10.5% | 4 |
| zyx.nano.Ant 1.1 | 5.0 | 9.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 8.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.4% | 2 |
| fullsail.SweetTea 1.1 | 7.8 | 6.7% | 1 |
| bzdp.BoxCar 2.0 | 8.2 | 7.3% | 1 |
| cs.Grudge 1.0 | 9.3 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.0 | 26 / 35 | 5334 |
| 2 | 1 | 70.7 | 92.7 | 29 / 35 | 5795 |
| 3 | 1 | 69.6 | 89.8 | 26 / 35 | 5529 |
| 4 | 1 | 69.1 | 92.4 | 26 / 35 | 4699 |
| 5 | 1 | 68.1 | 84.4 | 23 / 35 | 5067 |
| 6 | 1 | 71.4 | 96.5 | 30 / 35 | 5246 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 73 | 88% |
| mld.DustBunny 3.8 | 62 | 90% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 17 | 34% | 71 |
| oog.melee.Mercutio 1.0 | 16 | 32% | 86 |
| maribo.melee.BMV 0.1 | 7 | 14% | 11 |
| fullsail.SweetTea 1.1 | 3 | 6% | 13 |
| zyx.nano.Ant 1.1 | 3 | 6% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 4% | 12 |
| djdjdj.NanoSkunk10 1.0 | 1 | 2% | 8 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.9 | 129 / 210 | 2.27 | 19.7% | 35230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.7% | 129 |
| myl.micro.Troodon 1.10 | 2.0 | 14.5% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.5% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.2% | 22 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 2 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.2% | 5 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 2 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.7 | 26 / 35 | 6321 |
| 2 | 1 | 70.0 | 85.1 | 22 / 35 | 6239 |
| 3 | 1 | 70.1 | 89.5 | 22 / 35 | 5613 |
| 4 | 1 | 68.7 | 83.2 | 20 / 35 | 5633 |
| 5 | 1 | 69.3 | 84.4 | 21 / 35 | 5827 |
| 6 | 1 | 68.1 | 81.3 | 18 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 84% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 73% |
| myl.nano.KomoriNinja 1.1 | 26 | 88% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 75% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 32% | 47 |
| myl.micro.Troodon 1.10 | 20 | 25% | 73 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 37 |
| cb.nano.Insomnia 1.0 | 8 | 10% | 13 |
| fm.mammillarias 1.3 | 6 | 7% | 14 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 8 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 12 |
| sample.Fire 1.0 | 2 | 2% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.7 | 156 / 210 | 2.20 | 20.5% | 38230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.5% | 156 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.4% | 16 |
| tvv.micro.Antares 1.1.1 | 3.2 | 12.2% | 13 |
| tj.zombie1n 1.0.1 | 4.7 | 9.4% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.8% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.7% | 3 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.7 | 22 / 35 | 5709 |
| 2 | 1 | 68.4 | 79.0 | 23 / 35 | 6055 |
| 3 | 1 | 70.8 | 87.6 | 27 / 35 | 6625 |
| 4 | 1 | 70.6 | 88.3 | 26 / 35 | 6340 |
| 5 | 1 | 73.2 | 97.5 | 31 / 35 | 6717 |
| 6 | 1 | 71.3 | 89.2 | 27 / 35 | 6784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 94% |
| stelo.SoJNanoMelee 1.1 | 27 | 85% |
| tvv.micro.Antares 1.1.1 | 24 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 23 | 91% |
| tj.zombie1n 1.0.1 | 19 | 95% |
| yk.JahMicro 1.0 | 10 | 90% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 37% | 90 |
| stelo.SoJNanoMelee 1.1 | 10 | 19% | 29 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 28 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 25 |
| yk.JahMicro 1.0 | 5 | 9% | 14 |
| tj.zombie1n 1.0.1 | 4 | 7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.7 | 107 / 210 | 3.28 | 17.0% | 29719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.0% | 107 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.5% | 25 |
| ahf.NanoAndrew .4 | 4.0 | 11.2% | 19 |
| EBBU.Sim2 1.02 | 5.3 | 10.3% | 7 |
| sam.Samspin 1.0 | 6.0 | 9.5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.4% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 5.9% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.2 | 56.2 | 12 / 35 | 4422 |
| 2 | 1 | 65.6 | 72.1 | 16 / 35 | 5405 |
| 3 | 1 | 68.4 | 84.8 | 22 / 35 | 5222 |
| 4 | 1 | 64.7 | 73.3 | 17 / 35 | 4571 |
| 5 | 1 | 66.9 | 81.9 | 19 / 35 | 4893 |
| 6 | 1 | 67.4 | 80.0 | 21 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 86% |
| oog.melee.Corsair 1.0 | 35 | 69% |
| ahf.NanoAndrew .4 | 25 | 84% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 7 | 43% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 22% | 56 |
| oog.melee.Corsair 1.0 | 19 | 18% | 47 |
| robar.nano.Assertive_Melee 0.2 | 16 | 15% | 24 |
| ahf.NanoAndrew .4 | 12 | 12% | 34 |
| zyx.nano.BacillusComma 1.0 | 9 | 9% | 11 |
| sam.Samspin 1.0 | 8 | 8% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 8% | 8 |
| EBBU.Sim2 1.02 | 7 | 7% | 15 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.7 | 133 / 210 | 2.29 | 18.8% | 30196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.8% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 36 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.2% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.6% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 4 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 7 |
| fm.claire 1.7 | 6.3 | 8.6% | 1 |
| pa.Improved 1.0 | 8.3 | 6.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 5.6% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.1 | 18 / 35 | 4644 |
| 2 | 1 | 68.2 | 84.8 | 22 / 35 | 4835 |
| 3 | 1 | 71.0 | 93.3 | 26 / 35 | 5809 |
| 4 | 1 | 66.1 | 79.7 | 18 / 35 | 4610 |
| 5 | 1 | 69.3 | 89.8 | 24 / 35 | 5032 |
| 6 | 1 | 69.7 | 89.5 | 25 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 84% |
| oog.melee.CapuletDroid 1.1 | 35 | 100% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 37% | 79 |
| gh.nano.Grofvuil 0.2 | 14 | 18% | 32 |
| arthord.NanoSatanMelee Beta | 11 | 14% | 16 |
| oog.melee.CapuletDroid 1.1 | 9 | 12% | 49 |
| fm.claire 1.7 | 8 | 10% | 10 |
| kurios.DOSexe .9b | 3 | 4% | 6 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 10 |
| sample.SpinBot 1.0 | 1 | 1% | 4 |
| pa.Improved 1.0 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.5 | 121 / 210 | 2.48 | 18.8% | 34167 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.8% | 121 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.6% | 33 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.7% | 24 |
| mz.MicroGodMelee 1 | 4.0 | 12.5% | 23 |
| DBall.Anarchy 0.1 | 5.2 | 8.2% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.5% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.8% | 0 |
| acogdev.alpha 0.2 | 8.7 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 80.6 | 18 / 35 | 5329 |
| 2 | 1 | 68.2 | 81.6 | 21 / 35 | 5484 |
| 3 | 1 | 69.6 | 86.7 | 21 / 35 | 6004 |
| 4 | 1 | 69.0 | 84.1 | 19 / 35 | 6108 |
| 5 | 1 | 69.0 | 85.1 | 21 / 35 | 5646 |
| 6 | 1 | 68.5 | 83.2 | 21 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 74 | 84% |
| mz.MicroGodMelee 1 | 36 | 78% |
| gh.micro.Gruweltje 0.7 | 30 | 87% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 35 | 39% | 83 |
| mz.MicroGodMelee 1 | 18 | 20% | 51 |
| gh.micro.Gruweltje 0.7 | 17 | 19% | 50 |
| acogdev.alpha 0.2 | 6 | 7% | 7 |
| fire219.CatBot 1.0 | 5 | 6% | 5 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| DBall.Anarchy 0.1 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.8 | 108 / 210 | 3.71 | 16.3% | 30182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.3 | 16.3% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.0% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.9% | 36 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.3% | 2 |
| germ.TheMind .2 | 5.3 | 9.6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 9.1% | 4 |
| awesomeness.Elite 1.0 | 6.2 | 8.9% | 7 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.4% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 70.8 | 22 / 35 | 5308 |
| 2 | 2 | 63.0 | 67.3 | 17 / 35 | 4524 |
| 3 | 1 | 69.0 | 83.2 | 20 / 35 | 6001 |
| 4 | 2 | 64.0 | 67.6 | 16 / 35 | 4768 |
| 5 | 1 | 63.5 | 66.3 | 17 / 35 | 5263 |
| 6 | 1 | 61.7 | 63.8 | 16 / 35 | 4318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 88% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| germ.TheMind .2 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 377. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 49 | 48% | 100 |
| awesomeness.Elite 1.0 | 15 | 15% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 13% | 36 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 12 |
| germ.TheMind .2 | 6 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 11 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 2 | 2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.8 | 160 / 210 | 1.91 | 20.3% | 30981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.3% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 14.3% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 8.9% | 0 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.1% | 5 |
| ratosh.Wesco 1.4 | 6.7 | 8.4% | 4 |
| stelo.PatternRobot 1.0 | 7.5 | 8.0% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.9 | 30 / 35 | 4954 |
| 2 | 1 | 71.4 | 89.5 | 29 / 35 | 5284 |
| 3 | 1 | 68.7 | 83.8 | 25 / 35 | 5006 |
| 4 | 1 | 71.9 | 92.1 | 28 / 35 | 5462 |
| 5 | 1 | 70.4 | 89.8 | 25 / 35 | 4968 |
| 6 | 1 | 70.0 | 88.9 | 23 / 35 | 5307 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 99 | 94% |
| nz.jdc.nano.GridFu 1.0 | 25 | 100% |
| stelo.PatternRobot 1.0 | 18 | 89% |
| ratosh.Wesco 1.4 | 9 | 89% |
| timmit.nano.TimDog 0.33 | 8 | 88% |
| maribo.IotaCT 1.1 | 7 | 86% |
| spinnercat.Omen 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 26% | 80 |
| stelo.PatternRobot 1.0 | 9 | 18% | 25 |
| ratosh.Wesco 1.4 | 9 | 18% | 22 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 38 |
| timmit.nano.TimDog 0.33 | 6 | 12% | 18 |
| maribo.IotaCT 1.1 | 5 | 10% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 6 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 92.3 | 169 / 210 | 1.69 | 21.3% | 37986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 21.3% | 169 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 17 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 8 |
| zyx.micro.Ant 1.1 | 4.7 | 9.6% | 8 |
| Grystrion.TrackerWO 1.0 | 5.3 | 9.1% | 0 |
| sanja.First 0.1 | 5.7 | 8.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.1% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.1 | 23 / 35 | 6113 |
| 2 | 1 | 72.7 | 97.8 | 33 / 35 | 6677 |
| 3 | 1 | 71.3 | 94.9 | 29 / 35 | 6062 |
| 4 | 1 | 70.0 | 87.3 | 25 / 35 | 6167 |
| 5 | 1 | 71.3 | 91.4 | 29 / 35 | 6220 |
| 6 | 1 | 72.9 | 97.5 | 30 / 35 | 6747 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 90% |
| baal.nano.N 1.42 | 37 | 92% |
| sanja.First 0.1 | 28 | 96% |
| cvt.Firsty 1.0 | 23 | 96% |
| zyx.micro.Ant 1.1 | 20 | 75% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 11 | 27% | 54 |
| zyx.micro.Ant 1.1 | 8 | 20% | 42 |
| baal.nano.N 1.42 | 7 | 17% | 37 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 12 |
| sanja.First 0.1 | 3 | 7% | 24 |
| cvt.Firsty 1.0 | 3 | 7% | 24 |
| sample.RamFire 1.0 | 3 | 7% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |

## Melee bench: F11

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.5 | 86 / 210 | 3.47 | 16.0% | 30290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.5 | 16.0% | 86 |
| kc.micro.Figment 1.0 | 1.7 | 15.2% | 61 |
| cs.Wren 1.0 | 2.8 | 12.7% | 21 |
| mz.Cork 0.1 | 4.3 | 11.1% | 14 |
| js.PinBall 1.6 | 4.7 | 10.9% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 5 |
| evd.X1 0.01 | 7.0 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 63.2 | 8 / 35 | 4362 |
| 2 | 1 | 65.9 | 78.1 | 17 / 35 | 5323 |
| 3 | 1 | 64.6 | 73.3 | 13 / 35 | 5107 |
| 4 | 1 | 65.9 | 79.0 | 15 / 35 | 5247 |
| 5 | 2 | 62.9 | 67.3 | 13 / 35 | 4962 |
| 6 | 1 | 65.4 | 74.3 | 20 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 64% |
| cs.Wren 1.0 | 25 | 80% |
| mz.Cork 0.1 | 9 | 89% |
| js.PinBall 1.6 | 9 | 78% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 48 | 39% | 99 |
| cs.Wren 1.0 | 25 | 20% | 44 |
| js.PinBall 1.6 | 13 | 10% | 20 |
| mz.Cork 0.1 | 12 | 10% | 17 |
| joe.ADinosaur 1.0 | 11 | 9% | 12 |
| PSW.Relentless 0.1 | 7 | 6% | 7 |
| evd.X1 0.01 | 5 | 4% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.8 | 149 / 210 | 2.19 | 19.4% | 28254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 19.4% | 149 |
| myl.nano.Graviton 1.10 | 3.0 | 11.7% | 16 |
| ntc.Opposite 1.5 | 3.2 | 11.5% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.9% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 10.1% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.3% | 3 |
| disan.Chair 2.2.0 | 7.2 | 8.0% | 3 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 3 |
| donjezza.Muncho 1.0 | 8.8 | 6.2% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.5 | 21 / 35 | 5271 |
| 2 | 1 | 68.2 | 86.0 | 24 / 35 | 4292 |
| 3 | 1 | 71.3 | 93.7 | 30 / 35 | 5305 |
| 4 | 1 | 68.0 | 82.2 | 25 / 35 | 4702 |
| 5 | 1 | 67.9 | 83.5 | 24 / 35 | 4260 |
| 6 | 1 | 69.6 | 92.1 | 25 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 45 | 96% |
| stelo.AreaTargetingBot 1.1 | 38 | 87% |
| ntc.Opposite 1.5 | 21 | 86% |
| disan.Chair 2.2.0 | 18 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| DBall.NUKE 0.1 | 8 | 100% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 13 | 21% | 38 |
| ntc.Opposite 1.5 | 12 | 20% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 18% | 27 |
| myl.nano.Graviton 1.10 | 10 | 16% | 49 |
| pfvicm.Sobieski 7.2.3b | 9 | 15% | 16 |
| pbg.R2D2 1.0 | 3 | 5% | 12 |
| disan.Chair 2.2.0 | 2 | 3% | 15 |
| DBall.NUKE 0.1 | 1 | 2% | 14 |
| donjezza.Muncho 1.0 | 0 | 0% | 12 |

## Melee bench: F13

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.1 | 85 / 210 | 3.33 | 15.9% | 25166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.5 | 15.9% | 85 |
| oog.melee.Capulet 1.2 | 1.8 | 14.4% | 53 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.2% | 16 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.5 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 68.6 | 11 / 35 | 3805 |
| 2 | 2 | 61.2 | 63.5 | 9 / 35 | 4008 |
| 3 | 1 | 64.7 | 76.5 | 15 / 35 | 4047 |
| 4 | 1 | 65.9 | 74.9 | 15 / 35 | 4646 |
| 5 | 1 | 65.9 | 75.2 | 15 / 35 | 4392 |
| 6 | 1 | 68.1 | 86.0 | 20 / 35 | 4268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 9 | 78% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 38% | 69 |
| yagami.Tidus 0.11 | 19 | 15% | 32 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 11% | 39 |
| ejb.Polaris 1.0.1 | 14 | 11% | 24 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.3 | 121 / 210 | 2.95 | 17.1% | 26344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 17.1% | 121 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 22 |
| wee.Gem 1.8.4 | 2.8 | 12.2% | 32 |
| ratosh.Nobo 0.21 | 4.2 | 11.7% | 12 |
| wompi.Quokka 1.6 | 4.3 | 11.2% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.4% | 7 |
| bayen.UbaMicro 1.4 | 7.2 | 8.6% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.2 | 19 / 35 | 4086 |
| 2 | 1 | 68.1 | 85.4 | 24 / 35 | 4705 |
| 3 | 1 | 65.9 | 78.4 | 18 / 35 | 4551 |
| 4 | 1 | 65.1 | 76.2 | 21 / 35 | 4159 |
| 5 | 1 | 65.1 | 79.0 | 19 / 35 | 4067 |
| 6 | 1 | 65.7 | 75.6 | 20 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 89% |
| wee.Gem 1.8.4 | 25 | 92% |
| ratosh.Nobo 0.21 | 20 | 80% |
| wompi.Quokka 1.6 | 20 | 90% |
| m3thos.Eva00 1.1 | 6 | 83% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 21 | 23% | 33 |
| bzdp.Pansy 2.1 | 14 | 15% | 57 |
| wompi.Quokka 1.6 | 12 | 13% | 19 |
| wee.Gem 1.8.4 | 11 | 12% | 46 |
| bayen.UbaMicro 1.4 | 10 | 11% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 11 |
| maribo.FollowFire 1 | 6 | 7% | 8 |
| m3thos.Eva00 1.1 | 5 | 5% | 13 |
| stelo.MyAgileRobot 0.2 | 4 | 4% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 91.2 | 142 / 210 | 1.79 | 22.4% | 48044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 22.4% | 142 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 52 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 11 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 1 |
| ayk.WallHugger 1.0 | 5.0 | 9.3% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 91.7 | 25 / 35 | 7324 |
| 2 | 1 | 73.5 | 87.6 | 22 / 35 | 8175 |
| 3 | 1 | 74.6 | 94.0 | 26 / 35 | 8513 |
| 4 | 1 | 73.8 | 90.5 | 24 / 35 | 8224 |
| 5 | 1 | 73.5 | 91.4 | 21 / 35 | 7909 |
| 6 | 1 | 73.8 | 92.1 | 24 / 35 | 7899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 82% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 80% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 44% | 134 |
| mz.NanoGod 2.02 | 23 | 34% | 39 |
| exauge.GateKeeper 1.1.121g | 6 | 9% | 12 |
| ayk.WallHugger 1.0 | 4 | 6% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.7 | 102 / 210 | 3.72 | 16.1% | 28084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 16.1% | 102 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 22 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.2% | 25 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 12 |
| dl.BetterWalls 1.0 | 8.7 | 6.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 64.4 | 13 / 35 | 5097 |
| 2 | 1 | 67.3 | 79.4 | 23 / 35 | 4871 |
| 3 | 1 | 63.5 | 70.8 | 17 / 35 | 4452 |
| 4 | 1 | 63.1 | 67.6 | 19 / 35 | 4212 |
| 5 | 1 | 64.6 | 69.8 | 16 / 35 | 4945 |
| 6 | 1 | 62.6 | 66.3 | 14 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 90% |
| dummy.micro.Sparrow 2.5 | 31 | 84% |
| bvh.micro.Freya 0.3 | 21 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 69% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 23% | 59 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 16 |
| conscience.Electron 1.3g | 13 | 12% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 11% | 27 |
| bvh.micro.Freya 0.3 | 12 | 11% | 23 |
| dl.BetterWalls 1.0 | 10 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.2 | 143 / 210 | 2.24 | 20.8% | 40575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 20.8% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.5 | 13.3% | 9 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 19 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.9% | 14 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 5 |
| dsw.StaticD 1.0 | 5.3 | 9.1% | 13 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.Corners 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.8 | 25 / 35 | 7230 |
| 2 | 1 | 72.3 | 91.4 | 27 / 35 | 6807 |
| 3 | 1 | 70.6 | 84.4 | 24 / 35 | 6893 |
| 4 | 1 | 69.1 | 81.9 | 19 / 35 | 6494 |
| 5 | 1 | 70.3 | 83.8 | 25 / 35 | 6428 |
| 6 | 1 | 70.5 | 84.8 | 23 / 35 | 6723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 43 | 88% |
| supersample.SuperBoxBot 1.0 | 36 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 100% |
| dsw.StaticD 1.0 | 20 | 50% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 36% | 43 |
| dsw.StaticD 1.0 | 17 | 25% | 30 |
| sul.Lunar 1.1 | 8 | 12% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 12% | 42 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 10 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
| sample.Corners 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWAP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.1 | 115 / 210 | 2.70 | 18.5% | 36745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAP 0.1 | 1.0 | 18.5% | 115 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 25 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 19 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.8% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.7% | 19 |
| amz.NanoClone 1.41 | 5.2 | 10.3% | 9 |
| sample.Walls 1.0 | 7.7 | 7.5% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.3 | 6.5% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.3 | 25 / 35 | 6273 |
| 2 | 1 | 68.9 | 82.5 | 20 / 35 | 6386 |
| 3 | 1 | 68.4 | 83.5 | 22 / 35 | 5860 |
| 4 | 1 | 66.7 | 77.1 | 12 / 35 | 6379 |
| 5 | 1 | 65.0 | 71.4 | 16 / 35 | 5719 |
| 6 | 1 | 68.2 | 83.5 | 20 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 38 | 92% |
| radnor.DoctorBob 1.42 | 31 | 84% |
| mld.Wisdom 1.0 | 22 | 77% |
| sample.Walls 1.0 | 14 | 93% |
| KiraNL.Chupacabra 0.4 | 13 | 69% |
| amz.NanoClone 1.41 | 10 | 60% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 34% | 52 |
| radnor.DoctorBob 1.42 | 20 | 21% | 47 |
| KiraNL.Chupacabra 0.4 | 15 | 16% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 11% | 41 |
| amz.NanoClone 1.41 | 10 | 11% | 14 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 2 | 2% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

