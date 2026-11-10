# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 82.7 | 128 / 210 | 2.56 | 19.7% | 40881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 19.7% | 128 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 26 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 24 |
| mld.Infinity 2.2 | 4.2 | 12.9% | 24 |
| amz.NanoClone 1.41 | 4.7 | 11.2% | 5 |
| sample.Walls 1.0 | 6.0 | 7.3% | 2 |
| GarmBox.Oranges 1.0 | 7.5 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 84.1 | 26 / 35 | 6729 |
| 2 | 1 | 70.7 | 84.4 | 23 / 35 | 6916 |
| 3 | 1 | 67.8 | 76.5 | 17 / 35 | 6175 |
| 4 | 1 | 70.7 | 81.9 | 20 / 35 | 7465 |
| 5 | 1 | 72.5 | 90.8 | 25 / 35 | 7185 |
| 6 | 1 | 68.0 | 78.4 | 17 / 35 | 6411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 97% |
| mld.Infinity 2.2 | 34 | 85% |
| radnor.DoctorBob 1.42 | 22 | 95% |
| amz.NanoClone 1.41 | 6 | 67% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 29% | 50 |
| mz.AntiGrav 1.0 | 17 | 21% | 80 |
| amz.NanoClone 1.41 | 16 | 20% | 21 |
| mld.Infinity 2.2 | 14 | 17% | 38 |
| GarmBox.Oranges 1.0 | 7 | 9% | 7 |
| sample.Walls 1.0 | 2 | 2% | 8 |
| arthord.MannyPacquiao Beta | 2 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.9 | 112 / 210 | 2.45 | 18.2% | 31618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.2% | 112 |
| mld.DustBunny 3.8 | 2.3 | 14.1% | 21 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.0% | 51 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 7 |
| zyx.nano.Ant 1.1 | 6.0 | 8.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.1% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.8% | 8 |
| bzdp.BoxCar 2.0 | 7.5 | 7.7% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 6.9% | 3 |
| cs.Grudge 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 18 / 35 | 4712 |
| 2 | 1 | 65.4 | 74.9 | 13 / 35 | 5517 |
| 3 | 1 | 65.8 | 79.4 | 15 / 35 | 4933 |
| 4 | 1 | 70.9 | 92.7 | 25 / 35 | 6004 |
| 5 | 1 | 68.7 | 88.9 | 22 / 35 | 5069 |
| 6 | 1 | 69.1 | 89.5 | 19 / 35 | 5383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 62 | 87% |
| oog.melee.Mercutio 1.0 | 45 | 73% |
| maribo.melee.BMV 0.1 | 13 | 62% |
| fullsail.SweetTea 1.1 | 7 | 71% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 33% | 74 |
| oog.melee.Mercutio 1.0 | 25 | 26% | 62 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 10% | 17 |
| zyx.nano.Ant 1.1 | 10 | 10% | 12 |
| maribo.melee.BMV 0.1 | 8 | 8% | 14 |
| fullsail.SweetTea 1.1 | 8 | 8% | 14 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 12 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 77.2 | 98 / 210 | 3.05 | 17.7% | 34313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 17.7% | 98 |
| myl.micro.Troodon 1.10 | 2.0 | 14.9% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.7% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.4% | 34 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.9% | 9 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 6 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 2 |
| sample.Fire 1.0 | 9.5 | 4.6% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 71.4 | 13 / 35 | 5061 |
| 2 | 1 | 66.6 | 77.1 | 16 / 35 | 5436 |
| 3 | 1 | 69.2 | 83.5 | 19 / 35 | 6259 |
| 4 | 1 | 65.4 | 73.0 | 14 / 35 | 5293 |
| 5 | 1 | 67.7 | 79.7 | 16 / 35 | 5960 |
| 6 | 1 | 68.4 | 78.4 | 20 / 35 | 6304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 32 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 68% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 34 | 30% | 51 |
| myl.micro.Troodon 1.10 | 29 | 26% | 56 |
| fm.mammillarias 1.3 | 22 | 20% | 30 |
| cb.nano.Insomnia 1.0 | 11 | 10% | 16 |
| myl.nano.KomoriNinja 1.1 | 7 | 6% | 26 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 11 |
| sample.Tracker 1.0 | 2 | 2% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 12 |
| sample.Fire 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.8 | 131 / 210 | 2.19 | 20.1% | 38658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.1% | 131 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.7% | 23 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.2% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 10.0% | 19 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 6 |
| yk.JahMicro 1.0 | 8.2 | 7.2% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.2 | 24 / 35 | 6577 |
| 2 | 1 | 70.2 | 89.2 | 21 / 35 | 6323 |
| 3 | 1 | 71.5 | 91.1 | 23 / 35 | 6977 |
| 4 | 1 | 68.8 | 80.3 | 23 / 35 | 6351 |
| 5 | 1 | 69.2 | 85.7 | 19 / 35 | 6388 |
| 6 | 1 | 68.9 | 84.1 | 21 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 48 | 79% |
| kawigi.nano.Lib 1.0 | 43 | 88% |
| tvv.micro.Antares 1.1.1 | 20 | 85% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 80% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 83% |
| yk.JahMicro 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 38% | 72 |
| stelo.SoJNanoMelee 1.1 | 18 | 23% | 47 |
| tvv.micro.Antares 1.1.1 | 9 | 11% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 9% | 11 |
| tj.zombie1n 1.0.1 | 6 | 8% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 6% | 19 |
| repositorio.NanoStep 1.0 | 3 | 4% | 10 |
| sample.VelociRobot 1.0 | 1 | 1% | 8 |
| yk.JahMicro 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 75.6 | 102 / 210 | 3.20 | 16.7% | 29706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.7% | 102 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 28 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 33 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.3% | 31 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 3 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.0% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.9 | 20 / 35 | 5369 |
| 2 | 1 | 64.1 | 74.3 | 16 / 35 | 4522 |
| 3 | 1 | 65.5 | 78.1 | 15 / 35 | 5219 |
| 4 | 1 | 64.1 | 72.7 | 13 / 35 | 4997 |
| 5 | 1 | 63.1 | 67.9 | 18 / 35 | 4868 |
| 6 | 1 | 65.5 | 78.7 | 20 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 33 | 58% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 21 | 19% | 45 |
| robar.nano.Assertive_Melee 0.2 | 18 | 17% | 23 |
| EBBU.Sim2 1.02 | 14 | 13% | 21 |
| zyx.nano.BacillusComma 1.0 | 14 | 13% | 18 |
| ahf.NanoAndrew .4 | 11 | 10% | 30 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 9% | 13 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 33 |
| sam.Samspin 1.0 | 7 | 6% | 21 |
| sample.TrackFire 1.0 | 4 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.2 | 129 / 210 | 2.24 | 19.1% | 33273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 19.1% | 129 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 29 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.4% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.2% | 4 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.1% | 4 |
| fm.claire 1.7 | 6.8 | 8.2% | 6 |
| sample.SpinBot 1.0 | 7.3 | 7.5% | 5 |
| pa.Improved 1.0 | 9.2 | 6.0% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 22 / 35 | 5864 |
| 2 | 1 | 70.4 | 90.8 | 25 / 35 | 5964 |
| 3 | 1 | 66.3 | 81.0 | 20 / 35 | 4800 |
| 4 | 1 | 70.2 | 90.2 | 24 / 35 | 5912 |
| 5 | 1 | 65.7 | 78.1 | 14 / 35 | 5061 |
| 6 | 1 | 69.8 | 91.4 | 24 / 35 | 5672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 80% |
| oog.melee.CapuletDroid 1.1 | 33 | 91% |
| arthord.NanoSatanMelee Beta | 16 | 94% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| sample.SpinBot 1.0 | 11 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 81 of 210 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 35% | 69 |
| gh.nano.Grofvuil 0.2 | 13 | 16% | 33 |
| oog.melee.CapuletDroid 1.1 | 12 | 15% | 42 |
| arthord.NanoSatanMelee Beta | 11 | 14% | 20 |
| fm.claire 1.7 | 5 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 14 |
| kurios.DOSexe .9b | 3 | 4% | 8 |
| sample.SpinBot 1.0 | 3 | 4% | 8 |
| pa.Improved 1.0 | 2 | 2% | 8 |

## Melee bench: F07

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.1 | 89 / 210 | 3.24 | 16.9% | 33417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.5 | 16.9% | 89 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.3% | 54 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.1% | 27 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 27 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 1 |
| el.JumpShoot 0.2 | 8.0 | 6.3% | 1 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.2% | 4 |
| acogdev.alpha 0.2 | 8.8 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.1 | 62.5 | 7 / 35 | 4950 |
| 2 | 1 | 65.2 | 75.2 | 14 / 35 | 5204 |
| 3 | 1 | 68.3 | 81.6 | 22 / 35 | 5933 |
| 4 | 1 | 67.1 | 78.7 | 16 / 35 | 5914 |
| 5 | 1 | 65.2 | 73.3 | 13 / 35 | 5599 |
| 6 | 1 | 67.1 | 79.4 | 17 / 35 | 5817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 40 | 90% |
| mz.MicroGodMelee 1 | 33 | 76% |
| gh.micro.Gruweltje 0.7 | 24 | 58% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 25% | 47 |
| spinnercat.micro.Tyger 0.1 | 29 | 24% | 59 |
| mz.MicroGodMelee 1 | 22 | 18% | 45 |
| caimano.Furia_Ceca 0.22 | 13 | 11% | 13 |
| acogdev.alpha 0.2 | 10 | 8% | 14 |
| DBall.Anarchy 0.1 | 5 | 4% | 12 |
| fire219.CatBot 1.0 | 5 | 4% | 7 |
| mbro.Detektor3 0.1.1 | 5 | 4% | 7 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |

## Melee bench: F08

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.2 | 97 / 210 | 3.59 | 16.3% | 32122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.3 | 16.3% | 97 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.9% | 55 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.2% | 24 |
| germ.TheMind .2 | 4.2 | 9.6% | 10 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 8.7% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.6% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.3% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 12 |
| sample.Crazy 1.0 | 8.8 | 7.1% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 74.6 | 19 / 35 | 5790 |
| 2 | 2 | 63.2 | 67.3 | 16 / 35 | 5127 |
| 3 | 2 | 62.2 | 65.1 | 13 / 35 | 4790 |
| 4 | 1 | 65.0 | 73.3 | 15 / 35 | 5297 |
| 5 | 1 | 64.1 | 69.5 | 17 / 35 | 5424 |
| 6 | 1 | 66.8 | 77.5 | 17 / 35 | 5694 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 79% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 77% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| germ.TheMind .2 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 36% | 85 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 19% | 38 |
| stelo.UntouchableNano 1.3 | 16 | 14% | 27 |
| germ.TheMind .2 | 16 | 14% | 21 |
| mym.EdgeStalker 1.0 | 5 | 4% | 7 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 5 |
| awesomeness.Elite 1.0 | 4 | 4% | 10 |
| sample.Crazy 1.0 | 3 | 3% | 11 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.5 | 134 / 210 | 2.49 | 18.8% | 30906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 18.8% | 134 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.9% | 15 |
| maribo.IotaCT 1.1 | 4.3 | 10.2% | 7 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 6.5 | 8.9% | 7 |
| spinnercat.Omen 1.0 | 7.5 | 8.3% | 5 |
| stelo.PatternRobot 1.0 | 8.7 | 8.1% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 84.1 | 25 / 35 | 5298 |
| 2 | 1 | 70.1 | 87.0 | 25 / 35 | 5451 |
| 3 | 1 | 70.0 | 90.5 | 26 / 35 | 5191 |
| 4 | 1 | 68.0 | 79.7 | 20 / 35 | 5250 |
| 5 | 1 | 67.3 | 79.7 | 17 / 35 | 4595 |
| 6 | 1 | 67.4 | 80.0 | 21 / 35 | 5121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 92% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| timmit.nano.TimDog 0.33 | 14 | 86% |
| ratosh.Wesco 1.4 | 12 | 92% |
| stelo.PatternRobot 1.0 | 11 | 100% |
| maribo.IotaCT 1.1 | 8 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 25% | 64 |
| ratosh.Wesco 1.4 | 18 | 24% | 30 |
| stelo.PatternRobot 1.0 | 11 | 14% | 19 |
| timmit.nano.TimDog 0.33 | 10 | 13% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 11% | 11 |
| nz.jdc.nano.GridFu 1.0 | 7 | 9% | 37 |
| maribo.IotaCT 1.1 | 2 | 3% | 13 |
| spinnercat.Omen 1.0 | 1 | 1% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.5 | 145 / 210 | 2.13 | 20.3% | 38643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.3% | 145 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 28 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 8 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.4% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.7% | 10 |
| sanja.First 0.1 | 6.0 | 8.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 8.0% | 2 |
| cvt.Firsty 1.0 | 7.3 | 7.6% | 5 |
| amk.Punbot.Punbot 0.01 | 9.0 | 6.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.7 | 28 / 35 | 6834 |
| 2 | 1 | 68.3 | 83.2 | 21 / 35 | 5763 |
| 3 | 1 | 66.6 | 77.5 | 17 / 35 | 5899 |
| 4 | 1 | 72.3 | 94.0 | 28 / 35 | 7089 |
| 5 | 1 | 70.8 | 90.2 | 26 / 35 | 6716 |
| 6 | 1 | 70.0 | 86.3 | 25 / 35 | 6342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 34 | 91% |
| tvv.nano.Polaris 1.2 | 29 | 86% |
| cvt.Firsty 1.0 | 23 | 100% |
| zyx.micro.Ant 1.1 | 20 | 85% |
| sanja.First 0.1 | 19 | 95% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 26 | 40% | 43 |
| tvv.nano.Polaris 1.2 | 10 | 15% | 47 |
| Grystrion.TrackerWO 1.0 | 9 | 14% | 18 |
| baal.nano.N 1.42 | 8 | 12% | 37 |
| sanja.First 0.1 | 7 | 11% | 26 |
| sample.RamFire 1.0 | 3 | 5% | 3 |
| cvt.Firsty 1.0 | 1 | 2% | 25 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 62.4 | 64 / 210 | 4.38 | 14.1% | 29728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.1% | 68 |
| hadur117.micro.SaorWNK 0.1 | 2.0 | 14.1% | 64 |
| cs.Wren 1.0 | 3.2 | 13.0% | 31 |
| js.PinBall 1.6 | 4.2 | 11.7% | 13 |
| mz.Cork 0.1 | 4.5 | 11.5% | 18 |
| joe.ADinosaur 1.0 | 6.3 | 9.0% | 1 |
| evd.X1 0.01 | 6.7 | 8.6% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 68.6 | 12 / 35 | 5278 |
| 2 | 2 | 62.4 | 65.7 | 11 / 35 | 5056 |
| 3 | 2 | 59.1 | 58.4 | 11 / 35 | 4518 |
| 4 | 2 | 60.2 | 61.0 | 10 / 35 | 4911 |
| 5 | 1 | 61.4 | 64.8 | 9 / 35 | 5020 |
| 6 | 3 | 59.1 | 56.2 | 11 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 51 | 75% |
| cs.Wren 1.0 | 16 | 63% |
| js.PinBall 1.6 | 7 | 86% |
| mz.Cork 0.1 | 7 | 86% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 146 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 36% | 91 |
| cs.Wren 1.0 | 23 | 16% | 34 |
| evd.X1 0.01 | 20 | 14% | 20 |
| joe.ADinosaur 1.0 | 19 | 13% | 19 |
| js.PinBall 1.6 | 10 | 7% | 16 |
| PSW.Relentless 0.1 | 9 | 6% | 9 |
| mz.Cork 0.1 | 6 | 4% | 8 |
| jsal.Jsalbot 1.0 | 4 | 3% | 6 |
| donjezza.Jezza 1.0 | 3 | 2% | 7 |

## Melee bench: F12

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.2 | 108 / 210 | 2.88 | 17.8% | 29893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 17.8% | 108 |
| myl.nano.Graviton 1.10 | 2.7 | 12.2% | 32 |
| ntc.Opposite 1.5 | 3.3 | 11.3% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 16 |
| DBall.NUKE 0.1 | 6.2 | 8.9% | 9 |
| pfvicm.Sobieski 7.2.3b | 6.5 | 9.1% | 9 |
| disan.Chair 2.2.0 | 7.7 | 8.1% | 3 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 11 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.0 | 20 / 35 | 4956 |
| 2 | 1 | 67.3 | 81.0 | 16 / 35 | 5411 |
| 3 | 1 | 65.6 | 76.5 | 17 / 35 | 4860 |
| 4 | 1 | 66.2 | 78.7 | 16 / 35 | 4981 |
| 5 | 1 | 67.6 | 79.4 | 21 / 35 | 5162 |
| 6 | 1 | 65.4 | 79.4 | 18 / 35 | 4523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 82% |
| stelo.AreaTargetingBot 1.1 | 27 | 78% |
| ntc.Opposite 1.5 | 20 | 95% |
| DBall.NUKE 0.1 | 13 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| donjezza.Muncho 1.0 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| disan.Chair 2.2.0 | 4 | 75% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 28% | 60 |
| pfvicm.Sobieski 7.2.3b | 17 | 17% | 21 |
| stelo.AreaTargetingBot 1.1 | 16 | 16% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 17 |
| ntc.Opposite 1.5 | 9 | 9% | 20 |
| DBall.NUKE 0.1 | 8 | 8% | 20 |
| disan.Chair 2.2.0 | 8 | 8% | 16 |
| pbg.R2D2 1.0 | 3 | 3% | 13 |
| donjezza.Muncho 1.0 | 2 | 2% | 9 |

## Melee bench: F13

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 65.3 | 61 / 210 | 4.12 | 14.4% | 26162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 2.0 | 14.4% | 60 |
| hadur117.micro.SaorWNK 0.1 | 2.3 | 14.4% | 61 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 26 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 2 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 66.3 | 10 / 35 | 4090 |
| 2 | 1 | 65.0 | 73.3 | 12 / 35 | 4724 |
| 3 | 4 | 58.2 | 54.9 | 9 / 35 | 4052 |
| 4 | 3 | 60.8 | 62.5 | 11 / 35 | 4127 |
| 5 | 3 | 62.4 | 65.7 | 10 / 35 | 4437 |
| 6 | 1 | 64.1 | 68.9 | 9 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 21 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 72% |
| kawigi.micro.Shiz 1.1 | 16 | 94% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 9 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 38% | 73 |
| kawigi.micro.Shiz 1.1 | 28 | 19% | 42 |
| yagami.Tidus 0.11 | 26 | 17% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 9% | 30 |
| step.nanoPri 1.0 | 10 | 7% | 11 |
| kurios.DOSexe .9a | 6 | 4% | 2 |
| stelo.MirrorNano 1.3 | 5 | 3% | 6 |
| ejb.Polaris 1.0.1 | 4 | 3% | 12 |

## Melee bench: F14

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.2 | 119 / 210 | 3.32 | 16.5% | 27610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.5% | 119 |
| bzdp.Pansy 2.1 | 2.7 | 12.6% | 23 |
| ratosh.Nobo 0.21 | 3.7 | 11.5% | 9 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 18 |
| wee.Gem 1.8.4 | 4.2 | 11.3% | 20 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 15 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.2% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 66.7 | 17 / 35 | 4243 |
| 2 | 1 | 65.7 | 75.9 | 22 / 35 | 4864 |
| 3 | 1 | 66.2 | 79.0 | 24 / 35 | 4626 |
| 4 | 1 | 64.3 | 73.7 | 20 / 35 | 4460 |
| 5 | 1 | 66.3 | 76.5 | 22 / 35 | 4854 |
| 6 | 1 | 63.7 | 73.7 | 14 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 100% |
| wee.Gem 1.8.4 | 36 | 100% |
| ratosh.Nobo 0.21 | 15 | 87% |
| wompi.Quokka 1.6 | 13 | 92% |
| m3thos.Eva00 1.1 | 8 | 50% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 22 | 24% | 23 |
| m3thos.Eva00 1.1 | 13 | 14% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 14% | 16 |
| wompi.Quokka 1.6 | 11 | 12% | 19 |
| stelo.MyAgileRobot 0.2 | 10 | 11% | 12 |
| ratosh.Nobo 0.21 | 7 | 8% | 22 |
| bzdp.Pansy 2.1 | 6 | 7% | 48 |
| bayen.UbaMicro 1.4 | 5 | 5% | 9 |
| wee.Gem 1.8.4 | 4 | 4% | 43 |

## Melee bench: F15

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 86.6 | 131 / 210 | 2.20 | 21.1% | 46411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 21.1% | 131 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 18 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.8% | 8 |
| ayk.WallHugger 1.0 | 4.8 | 9.2% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 86.3 | 20 / 35 | 7950 |
| 2 | 1 | 72.3 | 83.8 | 21 / 35 | 7934 |
| 3 | 1 | 71.1 | 85.4 | 21 / 35 | 7200 |
| 4 | 1 | 72.5 | 87.9 | 21 / 35 | 7804 |
| 5 | 1 | 71.9 | 86.3 | 23 / 35 | 7494 |
| 6 | 1 | 73.0 | 89.8 | 25 / 35 | 8029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 101 | 82% |
| mz.NanoGod 2.02 | 19 | 63% |
| drd.Dreadknoght 0.9 | 11 | 100% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 31 | 39% | 49 |
| wompi.Wallaby 5.1 | 25 | 31% | 115 |
| exauge.GateKeeper 1.1.121g | 13 | 16% | 18 |
| ayk.WallHugger 1.0 | 7 | 9% | 10 |
| stelo.PianistNano 1.2 | 2 | 3% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 9 |
| stuff.Vlad 0.1 | 1 | 1% | 7 |

## Melee bench: F16

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.8 | 111 / 210 | 3.18 | 16.9% | 29515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.9% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 19 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.0% | 23 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.9% | 21 |
| stelo.MirrorMicro 1.0 | 6.5 | 8.9% | 5 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 3 |
| ap.Frederick 1.1 | 7.7 | 7.3% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 23 / 35 | 5364 |
| 2 | 1 | 65.0 | 75.6 | 20 / 35 | 4736 |
| 3 | 1 | 63.9 | 71.4 | 18 / 35 | 4680 |
| 4 | 1 | 66.7 | 81.6 | 21 / 35 | 4979 |
| 5 | 1 | 64.0 | 73.0 | 15 / 35 | 4664 |
| 6 | 1 | 62.9 | 65.7 | 14 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 94% |
| dummy.micro.Sparrow 2.5 | 33 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 77% |
| bvh.micro.Freya 0.3 | 22 | 91% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 19% | 55 |
| dummy.micro.Sparrow 2.5 | 18 | 18% | 46 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 34 |
| bvh.micro.Freya 0.3 | 12 | 12% | 27 |
| conscience.Electron 1.3g | 11 | 11% | 13 |
| dl.BetterWalls 1.0 | 7 | 7% | 11 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 10 |

## Melee bench: F17

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 86.2 | 140 / 210 | 2.24 | 20.7% | 42677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 20.7% | 140 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.6% | 14 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 18 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.3% | 15 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.7% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.0 | 6.6% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.4% | 6 |
| sample.Corners 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.8 | 24 / 35 | 7066 |
| 2 | 1 | 72.1 | 90.5 | 25 / 35 | 7447 |
| 3 | 1 | 71.6 | 87.0 | 25 / 35 | 7616 |
| 4 | 1 | 71.5 | 87.0 | 26 / 35 | 7292 |
| 5 | 1 | 68.9 | 79.4 | 20 / 35 | 6710 |
| 6 | 1 | 69.0 | 83.8 | 20 / 35 | 6546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 43 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 87% |
| supersample.SuperBoxBot 1.0 | 29 | 79% |
| sample.MyFirstRobot 1.0 | 13 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| dsw.StaticD 1.0 | 9 | 56% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 770. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 28% | 50 |
| supersample.SuperBoxBot 1.0 | 18 | 25% | 33 |
| sul.Lunar 1.1 | 8 | 11% | 52 |
| mme.NikeEnhanced 2.0 | 8 | 11% | 14 |
| dsw.StaticD 1.0 | 6 | 8% | 19 |
| tlp.ThreeLeggedPig 1 | 6 | 8% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 7% | 17 |
| sample.Corners 1.0 | 1 | 1% | 8 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWNK 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.2 | 92 / 210 | 3.59 | 16.5% | 35233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNK 0.1 | 1.0 | 16.5% | 92 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 30 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.0% | 31 |
| amz.NanoClone 1.41 | 5.2 | 10.9% | 18 |
| KiraNL.Chupacabra 0.4 | 5.8 | 10.2% | 8 |
| sample.Walls 1.0 | 7.0 | 7.8% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.5 | 17 / 35 | 5888 |
| 2 | 1 | 65.9 | 72.4 | 17 / 35 | 6374 |
| 3 | 1 | 67.2 | 78.7 | 17 / 35 | 6229 |
| 4 | 1 | 62.7 | 65.4 | 12 / 35 | 5383 |
| 5 | 1 | 62.0 | 62.2 | 11 / 35 | 5512 |
| 6 | 1 | 65.0 | 71.1 | 18 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 81% |
| radnor.DoctorBob 1.42 | 24 | 88% |
| mld.Wisdom 1.0 | 14 | 71% |
| amz.NanoClone 1.41 | 12 | 50% |
| jangs.ns51 1.0 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 27% | 43 |
| radnor.DoctorBob 1.42 | 24 | 20% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 19% | 53 |
| KiraNL.Chupacabra 0.4 | 12 | 10% | 18 |
| amz.NanoClone 1.41 | 11 | 9% | 16 |
| sample.Walls 1.0 | 9 | 8% | 13 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 3% | 8 |

