# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.7 | 131 / 210 | 2.29 | 20.7% | 43479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.7% | 131 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 26 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 26 |
| mld.Infinity 2.2 | 3.8 | 12.5% | 15 |
| amz.NanoClone 1.41 | 4.8 | 10.9% | 9 |
| GarmBox.Oranges 1.0 | 6.5 | 7.3% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| sample.Target 1.0 | 9.3 | 3.7% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 90.5 | 24 / 35 | 7492 |
| 2 | 1 | 71.4 | 84.4 | 23 / 35 | 7278 |
| 3 | 1 | 71.5 | 83.8 | 20 / 35 | 7218 |
| 4 | 1 | 70.7 | 83.8 | 19 / 35 | 7223 |
| 5 | 1 | 71.7 | 87.3 | 24 / 35 | 6992 |
| 6 | 1 | 70.6 | 84.1 | 21 / 35 | 7276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 89% |
| radnor.DoctorBob 1.42 | 36 | 75% |
| mld.Infinity 2.2 | 32 | 94% |
| amz.NanoClone 1.41 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 43% | 69 |
| mz.AntiGrav 1.0 | 20 | 25% | 74 |
| amz.NanoClone 1.41 | 11 | 14% | 14 |
| mld.Infinity 2.2 | 5 | 6% | 37 |
| GarmBox.Oranges 1.0 | 4 | 5% | 5 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| sample.Walls 1.0 | 2 | 3% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 84.9 | 120 / 210 | 2.36 | 18.8% | 33655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 18.8% | 120 |
| oog.melee.Mercutio 1.0 | 2.3 | 15.1% | 57 |
| mld.DustBunny 3.8 | 2.7 | 14.7% | 19 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.0% | 5 |
| bzdp.BoxCar 2.0 | 7.3 | 6.6% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 0 |
| zyx.nano.Ant 1.1 | 8.5 | 6.3% | 0 |
| cs.Grudge 1.0 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.8 | 22 / 35 | 5909 |
| 2 | 1 | 69.8 | 87.0 | 20 / 35 | 6114 |
| 3 | 1 | 68.2 | 85.1 | 18 / 35 | 5658 |
| 4 | 1 | 68.1 | 84.8 | 20 / 35 | 5341 |
| 5 | 1 | 67.6 | 81.0 | 21 / 35 | 5205 |
| 6 | 1 | 68.0 | 81.6 | 19 / 35 | 5428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 82% |
| mld.DustBunny 3.8 | 55 | 87% |
| maribo.melee.BMV 0.1 | 12 | 83% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 33 | 37% | 78 |
| oog.melee.Mercutio 1.0 | 25 | 28% | 71 |
| fullsail.SweetTea 1.1 | 9 | 10% | 16 |
| maribo.melee.BMV 0.1 | 6 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| zyx.nano.Ant 1.1 | 5 | 6% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 81.0 | 128 / 210 | 2.71 | 19.6% | 37712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 19.6% | 128 |
| myl.micro.Troodon 1.10 | 2.2 | 14.3% | 39 |
| myl.nano.KomoriNinja 1.1 | 2.8 | 12.2% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 15 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.1% | 10 |
| fm.mammillarias 1.3 | 5.3 | 9.6% | 3 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.2% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 1 |
| sample.Fire 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 77.1 | 20 / 35 | 5696 |
| 2 | 1 | 71.7 | 88.9 | 22 / 35 | 6949 |
| 3 | 1 | 71.1 | 85.7 | 25 / 35 | 6434 |
| 4 | 1 | 71.7 | 88.3 | 26 / 35 | 6737 |
| 5 | 1 | 68.9 | 77.1 | 20 / 35 | 6403 |
| 6 | 2 | 66.0 | 68.9 | 15 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 54 | 89% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 94% |
| cb.nano.Insomnia 1.0 | 19 | 89% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 21 | 26% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 16% | 35 |
| myl.micro.Troodon 1.10 | 12 | 15% | 64 |
| myl.nano.KomoriNinja 1.1 | 12 | 15% | 35 |
| fm.mammillarias 1.3 | 12 | 15% | 14 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 10 |
| sample.Fire 1.0 | 3 | 4% | 9 |
| sample.Tracker 1.0 | 2 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.8 | 142 / 210 | 2.10 | 20.9% | 41180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.9% | 142 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.3% | 17 |
| tj.zombie1n 1.0.1 | 4.8 | 9.1% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.5% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.7% | 6 |
| yk.JahMicro 1.0 | 6.7 | 8.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.3% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.4 | 27 / 35 | 7367 |
| 2 | 1 | 69.6 | 82.9 | 24 / 35 | 6468 |
| 3 | 1 | 70.6 | 87.0 | 21 / 35 | 6956 |
| 4 | 1 | 69.3 | 82.5 | 21 / 35 | 6618 |
| 5 | 1 | 72.7 | 94.3 | 27 / 35 | 7166 |
| 6 | 1 | 70.6 | 87.6 | 22 / 35 | 6605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 92% |
| stelo.SoJNanoMelee 1.1 | 30 | 90% |
| tvv.micro.Antares 1.1.1 | 24 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 24 | 83% |
| tj.zombie1n 1.0.1 | 12 | 42% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 31% | 78 |
| tvv.micro.Antares 1.1.1 | 12 | 18% | 39 |
| stelo.SoJNanoMelee 1.1 | 11 | 16% | 27 |
| tj.zombie1n 1.0.1 | 8 | 12% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 10% | 32 |
| yk.JahMicro 1.0 | 6 | 9% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 4 |
| repositorio.NanoStep 1.0 | 1 | 1% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.8 | 90 / 210 | 3.62 | 16.4% | 30651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 16.4% | 90 |
| oog.melee.Corsair 1.0 | 2.0 | 13.5% | 39 |
| ahf.NanoAndrew .4 | 3.2 | 11.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.7% | 20 |
| EBBU.Sim2 1.02 | 5.0 | 10.0% | 11 |
| sam.Samspin 1.0 | 6.0 | 9.6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 8.6% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 66.0 | 11 / 35 | 4956 |
| 2 | 1 | 65.7 | 73.0 | 14 / 35 | 5558 |
| 3 | 1 | 67.1 | 79.4 | 20 / 35 | 5183 |
| 4 | 1 | 66.6 | 76.5 | 18 / 35 | 5189 |
| 5 | 1 | 62.2 | 62.9 | 14 / 35 | 4753 |
| 6 | 1 | 62.8 | 67.3 | 13 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 60% |
| simonton.nano.MeleeSeed 1.8 | 37 | 92% |
| ahf.NanoAndrew .4 | 23 | 70% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| EBBU.Sim2 1.02 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 19% | 48 |
| simonton.nano.MeleeSeed 1.8 | 19 | 16% | 45 |
| ahf.NanoAndrew .4 | 18 | 15% | 36 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 13 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 17 |
| EBBU.Sim2 1.02 | 8 | 7% | 9 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.2 | 129 / 210 | 2.15 | 19.2% | 32145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.2% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.7% | 17 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.1% | 4 |
| fm.claire 1.7 | 5.3 | 9.1% | 4 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 8.8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 6 |
| sample.SpinBot 1.0 | 8.3 | 7.1% | 4 |
| pa.Improved 1.0 | 8.8 | 6.3% | 4 |
| kurios.DOSexe .9b | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 24 / 35 | 6015 |
| 2 | 1 | 67.2 | 83.5 | 18 / 35 | 4834 |
| 3 | 1 | 67.7 | 85.1 | 20 / 35 | 5013 |
| 4 | 1 | 68.3 | 84.4 | 22 / 35 | 5215 |
| 5 | 1 | 68.7 | 83.8 | 20 / 35 | 5855 |
| 6 | 1 | 70.2 | 94.9 | 25 / 35 | 5213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 84% |
| oog.melee.CapuletDroid 1.1 | 20 | 95% |
| gh.nano.Grofvuil 0.2 | 18 | 67% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| fm.claire 1.7 | 9 | 67% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 36% | 90 |
| gh.nano.Grofvuil 0.2 | 14 | 17% | 30 |
| oog.melee.CapuletDroid 1.1 | 11 | 14% | 30 |
| arthord.NanoSatanMelee Beta | 9 | 11% | 16 |
| fm.claire 1.7 | 9 | 11% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 13 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| pa.Improved 1.0 | 1 | 1% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.0 | 102 / 210 | 2.71 | 18.5% | 35568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 18.5% | 102 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.4% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.2% | 22 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 32 |
| DBall.Anarchy 0.1 | 5.7 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 2 |
| fire219.CatBot 1.0 | 7.8 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.2 | 6.2% | 1 |
| mbro.Detektor3 0.1.1 | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.3 | 20 / 35 | 6540 |
| 2 | 1 | 67.9 | 81.6 | 15 / 35 | 5658 |
| 3 | 1 | 69.7 | 84.4 | 22 / 35 | 6232 |
| 4 | 2 | 64.7 | 70.5 | 14 / 35 | 5281 |
| 5 | 1 | 66.7 | 77.1 | 15 / 35 | 5490 |
| 6 | 1 | 69.3 | 83.8 | 16 / 35 | 6367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 84% |
| mz.MicroGodMelee 1 | 41 | 63% |
| gh.micro.Gruweltje 0.7 | 39 | 62% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 30 | 28% | 56 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 55 |
| spinnercat.micro.Tyger 0.1 | 28 | 26% | 63 |
| DBall.Anarchy 0.1 | 7 | 6% | 11 |
| acogdev.alpha 0.2 | 5 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 7 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 69.0 | 101 / 210 | 3.79 | 16.3% | 31277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 16.3% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.5% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.7% | 5 |
| germ.TheMind .2 | 5.5 | 9.2% | 4 |
| awesomeness.Elite 1.0 | 6.5 | 8.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 8 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 76.8 | 20 / 35 | 5712 |
| 2 | 1 | 63.4 | 66.3 | 16 / 35 | 5021 |
| 3 | 1 | 65.1 | 72.1 | 19 / 35 | 5009 |
| 4 | 1 | 63.4 | 66.3 | 15 / 35 | 5061 |
| 5 | 2 | 62.6 | 63.2 | 12 / 35 | 4862 |
| 6 | 1 | 64.9 | 69.2 | 19 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 78% |
| germ.TheMind .2 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| awesomeness.Elite 1.0 | 6 | 67% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 42% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 17% | 36 |
| stelo.UntouchableNano 1.3 | 13 | 12% | 17 |
| germ.TheMind .2 | 8 | 7% | 18 |
| awesomeness.Elite 1.0 | 7 | 6% | 16 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.7 | 158 / 210 | 1.92 | 20.8% | 33774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 20.8% | 158 |
| rz.HawkOnFire 0.1 | 2.0 | 13.9% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 6 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.7% | 1 |
| ratosh.Wesco 1.4 | 6.7 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.6% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.6 | 28 / 35 | 5673 |
| 2 | 1 | 72.3 | 93.7 | 27 / 35 | 5820 |
| 3 | 1 | 71.9 | 91.4 | 26 / 35 | 5648 |
| 4 | 1 | 71.6 | 92.1 | 28 / 35 | 5592 |
| 5 | 1 | 69.2 | 82.2 | 24 / 35 | 5188 |
| 6 | 1 | 71.9 | 90.5 | 25 / 35 | 5853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 85 | 94% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 67% |
| stelo.PatternRobot 1.0 | 12 | 75% |
| maribo.IotaCT 1.1 | 10 | 100% |
| ratosh.Wesco 1.4 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 16 | 31% | 30 |
| rz.HawkOnFire 0.1 | 10 | 19% | 76 |
| ratosh.Wesco 1.4 | 7 | 13% | 24 |
| stelo.PatternRobot 1.0 | 7 | 13% | 13 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 42 |
| maribo.IotaCT 1.1 | 3 | 6% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 5 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.4 | 161 / 210 | 1.77 | 21.6% | 41422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.6% | 161 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 17 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 4 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 9 |
| sanja.First 0.1 | 5.7 | 8.6% | 3 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.7% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 99.4 | 33 / 35 | 7364 |
| 2 | 1 | 71.8 | 91.1 | 25 / 35 | 7220 |
| 3 | 1 | 71.1 | 90.2 | 26 / 35 | 6837 |
| 4 | 1 | 72.5 | 91.7 | 26 / 35 | 7492 |
| 5 | 1 | 70.5 | 88.9 | 25 / 35 | 6229 |
| 6 | 1 | 70.4 | 87.3 | 26 / 35 | 6280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 91% |
| baal.nano.N 1.42 | 42 | 88% |
| zyx.micro.Ant 1.1 | 19 | 95% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| cvt.Firsty 1.0 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 14 | 28% | 45 |
| zyx.micro.Ant 1.1 | 11 | 22% | 32 |
| tvv.nano.Polaris 1.2 | 8 | 16% | 65 |
| Grystrion.TrackerWO 1.0 | 7 | 14% | 16 |
| cvt.Firsty 1.0 | 5 | 10% | 16 |
| sanja.First 0.1 | 4 | 8% | 22 |
| sample.RamFire 1.0 | 1 | 2% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.0 | 75 / 210 | 3.97 | 15.4% | 32637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.5 | 15.4% | 75 |
| kc.micro.Figment 1.0 | 1.7 | 15.5% | 81 |
| cs.Wren 1.0 | 3.2 | 12.7% | 19 |
| js.PinBall 1.6 | 4.0 | 11.4% | 13 |
| mz.Cork 0.1 | 4.8 | 11.0% | 2 |
| joe.ADinosaur 1.0 | 6.0 | 8.8% | 6 |
| evd.X1 0.01 | 6.8 | 8.2% | 6 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 73.3 | 15 / 35 | 5871 |
| 2 | 2 | 62.2 | 63.2 | 13 / 35 | 5424 |
| 3 | 2 | 62.3 | 64.8 | 10 / 35 | 5356 |
| 4 | 1 | 64.7 | 69.2 | 15 / 35 | 5638 |
| 5 | 2 | 63.0 | 66.0 | 10 / 35 | 5244 |
| 6 | 1 | 62.1 | 65.7 | 12 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 64 | 53% |
| cs.Wren 1.0 | 17 | 88% |
| mz.Cork 0.1 | 13 | 100% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 73 | 54% | 114 |
| js.PinBall 1.6 | 13 | 10% | 20 |
| cs.Wren 1.0 | 12 | 9% | 22 |
| evd.X1 0.01 | 12 | 9% | 16 |
| mz.Cork 0.1 | 8 | 6% | 12 |
| joe.ADinosaur 1.0 | 8 | 6% | 11 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.0 | 136 / 210 | 2.35 | 19.3% | 29966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.3% | 136 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.0% | 5 |
| ntc.Opposite 1.5 | 3.7 | 11.1% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.7% | 8 |
| disan.Chair 2.2.0 | 7.0 | 8.3% | 9 |
| DBall.NUKE 0.1 | 8.0 | 7.9% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 2 |
| pbg.R2D2 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 22 / 35 | 5167 |
| 2 | 1 | 67.4 | 82.5 | 19 / 35 | 4900 |
| 3 | 1 | 69.9 | 86.3 | 26 / 35 | 5325 |
| 4 | 1 | 67.3 | 83.8 | 22 / 35 | 4397 |
| 5 | 1 | 69.1 | 85.1 | 22 / 35 | 5114 |
| 6 | 1 | 69.6 | 86.3 | 25 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 35 | 91% |
| stelo.AreaTargetingBot 1.1 | 35 | 94% |
| disan.Chair 2.2.0 | 18 | 83% |
| ntc.Opposite 1.5 | 18 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| donjezza.Muncho 1.0 | 14 | 93% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| DBall.NUKE 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 19 | 25% | 38 |
| myl.nano.Graviton 1.10 | 12 | 16% | 47 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 36 |
| ntc.Opposite 1.5 | 11 | 15% | 24 |
| disan.Chair 2.2.0 | 8 | 11% | 23 |
| pfvicm.Sobieski 7.2.3b | 8 | 11% | 18 |
| DBall.NUKE 0.1 | 4 | 5% | 9 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.0 | 84 / 210 | 3.61 | 15.7% | 26337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.3 | 15.7% | 84 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 37 |
| oog.melee.Capulet 1.2 | 2.7 | 14.2% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 21 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 7 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 9 |
| stelo.MirrorNano 1.3 | 7.3 | 7.1% | 1 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 78.7 | 17 / 35 | 4822 |
| 2 | 2 | 63.2 | 66.3 | 13 / 35 | 4062 |
| 3 | 2 | 64.1 | 69.5 | 13 / 35 | 4388 |
| 4 | 1 | 62.7 | 66.7 | 11 / 35 | 4201 |
| 5 | 1 | 64.8 | 72.1 | 16 / 35 | 4170 |
| 6 | 1 | 65.2 | 72.4 | 14 / 35 | 4694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 71% |
| oog.melee.Capulet 1.2 | 25 | 64% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 17 | 82% |
| ejb.Polaris 1.0.1 | 9 | 89% |

Hadur died in 126 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 34% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 45 |
| yagami.Tidus 0.11 | 22 | 17% | 31 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 31 |
| ejb.Polaris 1.0.1 | 8 | 6% | 17 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| kurios.DOSexe .9a | 6 | 5% | 8 |
| step.nanoPri 1.0 | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.7 | 120 / 210 | 3.10 | 17.2% | 28760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 17.2% | 120 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 21 |
| wee.Gem 1.8.4 | 3.2 | 11.9% | 23 |
| wompi.Quokka 1.6 | 3.7 | 11.8% | 21 |
| ratosh.Nobo 0.21 | 4.2 | 11.6% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 25 / 35 | 5122 |
| 2 | 1 | 67.0 | 80.3 | 22 / 35 | 4823 |
| 3 | 1 | 61.5 | 63.5 | 18 / 35 | 3719 |
| 4 | 1 | 64.3 | 69.5 | 17 / 35 | 4958 |
| 5 | 1 | 64.6 | 72.1 | 17 / 35 | 4874 |
| 6 | 1 | 68.3 | 85.4 | 21 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 89% |
| wee.Gem 1.8.4 | 29 | 90% |
| wompi.Quokka 1.6 | 14 | 93% |
| ratosh.Nobo 0.21 | 12 | 92% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| bayen.UbaMicro 1.4 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 16% | 65 |
| ratosh.Nobo 0.21 | 13 | 14% | 24 |
| wee.Gem 1.8.4 | 12 | 13% | 41 |
| wompi.Quokka 1.6 | 12 | 13% | 22 |
| stelo.MyAgileRobot 0.2 | 10 | 11% | 13 |
| maribo.FollowFire 1 | 10 | 11% | 11 |
| bayen.UbaMicro 1.4 | 8 | 9% | 11 |
| m3thos.Eva00 1.1 | 6 | 7% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 10 |

## Melee bench: F15

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 86.0 | 111 / 210 | 2.26 | 21.2% | 48236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.2% | 111 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 71 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 17 |
| exauge.GateKeeper 1.1.121g | 4.3 | 10.4% | 10 |
| ayk.WallHugger 1.0 | 4.8 | 9.7% | 1 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 87.0 | 17 / 35 | 8421 |
| 2 | 1 | 73.2 | 86.7 | 22 / 35 | 7842 |
| 3 | 1 | 72.0 | 85.7 | 15 / 35 | 7972 |
| 4 | 1 | 73.3 | 89.5 | 21 / 35 | 8328 |
| 5 | 1 | 70.8 | 80.0 | 14 / 35 | 7692 |
| 6 | 1 | 73.1 | 87.3 | 22 / 35 | 7981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 111 | 73% |
| mz.NanoGod 2.02 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 13 | 77% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 51 | 50% | 132 |
| mz.NanoGod 2.02 | 28 | 28% | 40 |
| exauge.GateKeeper 1.1.121g | 12 | 12% | 19 |
| ayk.WallHugger 1.0 | 8 | 8% | 10 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 68.5 | 99 / 210 | 3.83 | 15.8% | 28820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.2 | 15.8% | 99 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 13.7% | 27 |
| bvh.micro.Freya 0.3 | 3.3 | 11.5% | 22 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.2% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.6% | 24 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 3 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 4 |
| ap.Frederick 1.1 | 8.8 | 6.7% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 70.8 | 15 / 35 | 4365 |
| 2 | 2 | 62.0 | 61.6 | 16 / 35 | 4662 |
| 3 | 1 | 58.0 | 54.6 | 11 / 35 | 4459 |
| 4 | 1 | 64.6 | 74.0 | 17 / 35 | 4756 |
| 5 | 1 | 66.0 | 74.0 | 20 / 35 | 5433 |
| 6 | 1 | 66.5 | 76.2 | 20 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 91% |
| dummy.micro.Sparrow 2.5 | 22 | 82% |
| bvh.micro.Freya 0.3 | 18 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 86% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 18% | 56 |
| dummy.micro.Sparrow 2.5 | 20 | 18% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 16% | 31 |
| conscience.Electron 1.3g | 17 | 15% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 14% | 18 |
| bvh.micro.Freya 0.3 | 9 | 8% | 22 |
| dl.BetterWalls 1.0 | 6 | 5% | 9 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.9 | 142 / 210 | 2.27 | 21.4% | 43503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 21.4% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 14 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.0% | 9 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.2% | 4 |
| dsw.StaticD 1.0 | 5.3 | 9.0% | 12 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.7% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.8% | 5 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.2% | 4 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.3 | 22 / 35 | 7576 |
| 2 | 1 | 71.0 | 85.1 | 23 / 35 | 6988 |
| 3 | 1 | 73.9 | 94.6 | 27 / 35 | 7989 |
| 4 | 1 | 71.5 | 87.6 | 24 / 35 | 6911 |
| 5 | 1 | 70.1 | 80.6 | 22 / 35 | 6891 |
| 6 | 1 | 70.9 | 81.3 | 24 / 35 | 7148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 90% |
| sul.Lunar 1.1 | 43 | 95% |
| supersample.SuperBoxBot 1.0 | 21 | 86% |
| dsw.StaticD 1.0 | 15 | 47% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dsw.StaticD 1.0 | 17 | 25% | 27 |
| supersample.SuperBoxBot 1.0 | 16 | 24% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 16% | 54 |
| sul.Lunar 1.1 | 9 | 13% | 48 |
| mme.NikeEnhanced 2.0 | 6 | 9% | 16 |
| sample.Corners 1.0 | 4 | 6% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 10 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 15 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWGR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.4 | 120 / 210 | 2.67 | 19.1% | 40002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGR 0.1 | 1.0 | 19.1% | 120 |
| radnor.DoctorBob 1.42 | 2.5 | 13.3% | 31 |
| mld.Wisdom 1.0 | 3.5 | 12.1% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.5% | 22 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 6 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 11 |
| sample.Walls 1.0 | 7.5 | 7.3% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.2% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 78.1 | 19 / 35 | 6182 |
| 2 | 1 | 70.8 | 86.3 | 23 / 35 | 7266 |
| 3 | 1 | 67.5 | 76.5 | 18 / 35 | 6524 |
| 4 | 1 | 70.4 | 87.0 | 21 / 35 | 6788 |
| 5 | 1 | 68.8 | 82.2 | 19 / 35 | 6474 |
| 6 | 1 | 67.9 | 78.4 | 20 / 35 | 6768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 73% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 91% |
| mld.Wisdom 1.0 | 21 | 76% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 29% | 60 |
| mld.Wisdom 1.0 | 23 | 25% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 18% | 48 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 19 |
| amz.NanoClone 1.41 | 9 | 10% | 20 |
| jangs.ns51 1.0 | 4 | 4% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 4 |

