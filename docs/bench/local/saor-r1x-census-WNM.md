# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.3 | 150 / 210 | 2.05 | 21.2% | 43838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 21.2% | 150 |
| mz.AntiGrav 1.0 | 2.3 | 14.5% | 22 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 19 |
| mld.Infinity 2.2 | 3.8 | 12.5% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| GarmBox.Oranges 1.0 | 6.5 | 7.1% | 0 |
| sample.Walls 1.0 | 7.2 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.7 | 27 / 35 | 7174 |
| 2 | 1 | 71.4 | 85.4 | 22 / 35 | 7217 |
| 3 | 1 | 73.2 | 92.7 | 28 / 35 | 7570 |
| 4 | 1 | 72.6 | 90.2 | 25 / 35 | 7660 |
| 5 | 1 | 67.6 | 73.3 | 18 / 35 | 6400 |
| 6 | 1 | 74.0 | 94.6 | 30 / 35 | 7817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 73 | 92% |
| mld.Infinity 2.2 | 35 | 89% |
| radnor.DoctorBob 1.42 | 35 | 91% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| jangs.ns51 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 38% | 66 |
| mz.AntiGrav 1.0 | 14 | 23% | 67 |
| mld.Infinity 2.2 | 10 | 17% | 41 |
| amz.NanoClone 1.41 | 7 | 12% | 13 |
| GarmBox.Oranges 1.0 | 4 | 7% | 5 |
| sample.Walls 1.0 | 2 | 3% | 9 |
| jangs.ns51 1.0 | 0 | 0% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.9 | 128 / 210 | 2.18 | 18.7% | 31795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.7% | 128 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.4% | 45 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 3 |
| mld.DustBunny 3.8 | 4.0 | 12.0% | 16 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 9.4% | 2 |
| zyx.nano.Ant 1.1 | 6.5 | 8.5% | 1 |
| bzdp.BoxCar 2.0 | 6.8 | 8.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.2% | 10 |
| fullsail.SweetTea 1.1 | 8.8 | 6.6% | 4 |
| cs.Grudge 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 21 / 35 | 5291 |
| 2 | 1 | 70.0 | 90.8 | 24 / 35 | 6282 |
| 3 | 1 | 67.4 | 85.7 | 19 / 35 | 4797 |
| 4 | 1 | 67.0 | 83.8 | 21 / 35 | 5145 |
| 5 | 1 | 67.1 | 81.9 | 19 / 35 | 5149 |
| 6 | 1 | 68.6 | 87.9 | 24 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 56 | 77% |
| mld.DustBunny 3.8 | 46 | 85% |
| djdjdj.NanoSkunk10 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| zyx.nano.Ant 1.1 | 9 | 100% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 26% | 65 |
| mld.DustBunny 3.8 | 19 | 23% | 56 |
| maribo.melee.BMV 0.1 | 12 | 15% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 12% | 20 |
| zyx.nano.Ant 1.1 | 8 | 10% | 15 |
| fullsail.SweetTea 1.1 | 5 | 6% | 14 |
| bzdp.BoxCar 2.0 | 3 | 4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 16 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 83.7 | 121 / 210 | 2.47 | 19.6% | 38038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 19.6% | 121 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.5% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.1% | 22 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.7% | 8 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 3 |
| sample.Tracker 1.0 | 9.5 | 4.2% | 0 |
| sample.Fire 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 80.0 | 17 / 35 | 5742 |
| 2 | 1 | 70.2 | 86.0 | 22 / 35 | 6403 |
| 3 | 1 | 70.0 | 83.8 | 20 / 35 | 6668 |
| 4 | 1 | 70.2 | 81.6 | 22 / 35 | 6779 |
| 5 | 1 | 68.5 | 80.6 | 17 / 35 | 6283 |
| 6 | 1 | 71.0 | 90.2 | 23 / 35 | 6163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 74% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 76% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 30 | 34% | 52 |
| myl.micro.Troodon 1.10 | 17 | 19% | 61 |
| cb.nano.Insomnia 1.0 | 15 | 17% | 19 |
| myl.nano.KomoriNinja 1.1 | 10 | 11% | 31 |
| fm.mammillarias 1.3 | 10 | 11% | 21 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 16 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 7 |
| sample.Fire 1.0 | 2 | 2% | 2 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.9 | 151 / 210 | 2.00 | 20.9% | 39939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.9% | 151 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.5% | 20 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 7 |
| tj.zombie1n 1.0.1 | 4.8 | 9.6% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 8.7% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.8% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.8% | 5 |
| yk.JahMicro 1.0 | 7.5 | 7.6% | 2 |
| repositorio.NanoStep 1.0 | 8.3 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 85.7 | 22 / 35 | 6626 |
| 2 | 1 | 69.7 | 85.1 | 24 / 35 | 6359 |
| 3 | 1 | 70.1 | 85.7 | 22 / 35 | 6531 |
| 4 | 1 | 70.5 | 88.3 | 27 / 35 | 6300 |
| 5 | 1 | 71.9 | 94.0 | 24 / 35 | 7042 |
| 6 | 1 | 73.1 | 94.6 | 32 / 35 | 7081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 93% |
| stelo.SoJNanoMelee 1.1 | 41 | 95% |
| tvv.micro.Antares 1.1.1 | 22 | 91% |
| tj.zombie1n 1.0.1 | 21 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 36% | 80 |
| tj.zombie1n 1.0.1 | 12 | 20% | 16 |
| stelo.SoJNanoMelee 1.1 | 7 | 12% | 33 |
| tvv.micro.Antares 1.1.1 | 7 | 12% | 32 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 19 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 7 |
| repositorio.NanoStep 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 70.3 | 86 / 210 | 3.67 | 15.5% | 28307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 15.5% | 86 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 30 |
| ahf.NanoAndrew .4 | 3.0 | 12.2% | 38 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.3% | 24 |
| sam.Samspin 1.0 | 5.5 | 9.5% | 10 |
| EBBU.Sim2 1.02 | 5.7 | 9.7% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.2% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 66.7 | 17 / 35 | 4398 |
| 2 | 1 | 61.4 | 68.3 | 12 / 35 | 4342 |
| 3 | 1 | 63.2 | 69.8 | 14 / 35 | 4766 |
| 4 | 1 | 64.2 | 71.4 | 14 / 35 | 5131 |
| 5 | 1 | 61.6 | 68.9 | 10 / 35 | 4735 |
| 6 | 1 | 65.3 | 76.8 | 19 / 35 | 4935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 69% |
| simonton.nano.MeleeSeed 1.8 | 20 | 85% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 14 | 93% |
| EBBU.Sim2 1.02 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 24 | 19% | 39 |
| robar.nano.Assertive_Melee 0.2 | 22 | 18% | 27 |
| oog.melee.Corsair 1.0 | 18 | 14% | 43 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 32 |
| EBBU.Sim2 1.02 | 13 | 10% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 11 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 14 |
| sam.Samspin 1.0 | 8 | 6% | 19 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.1 | 123 / 210 | 2.43 | 18.5% | 31553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.5% | 123 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.8% | 36 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 15 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 6 |
| fm.claire 1.7 | 6.3 | 8.5% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.6% | 6 |
| pa.Improved 1.0 | 9.3 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 20 / 35 | 5260 |
| 2 | 1 | 68.3 | 84.4 | 21 / 35 | 5412 |
| 3 | 1 | 67.5 | 85.1 | 19 / 35 | 5007 |
| 4 | 1 | 69.3 | 87.9 | 23 / 35 | 5574 |
| 5 | 1 | 65.8 | 79.7 | 16 / 35 | 4749 |
| 6 | 1 | 68.2 | 82.2 | 24 / 35 | 5551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 83% |
| oog.melee.CapuletDroid 1.1 | 26 | 100% |
| gh.nano.Grofvuil 0.2 | 17 | 94% |
| arthord.NanoSatanMelee Beta | 7 | 71% |
| kurios.DOSexe .9b | 7 | 57% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 37% | 88 |
| gh.nano.Grofvuil 0.2 | 11 | 13% | 32 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 15 |
| oog.melee.CapuletDroid 1.1 | 9 | 10% | 36 |
| sample.SpinBot 1.0 | 9 | 10% | 10 |
| fm.claire 1.7 | 7 | 8% | 8 |
| kurios.DOSexe .9b | 6 | 7% | 10 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.4 | 93 / 210 | 2.77 | 17.9% | 34892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 17.9% | 93 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.5% | 33 |
| mz.MicroGodMelee 1 | 3.5 | 12.5% | 32 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 10 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.5% | 1 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.0% | 1 |
| el.JumpShoot 0.2 | 8.5 | 6.4% | 4 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.9 | 15 / 35 | 5896 |
| 2 | 1 | 69.2 | 85.7 | 18 / 35 | 6276 |
| 3 | 1 | 64.9 | 74.0 | 10 / 35 | 5473 |
| 4 | 1 | 67.9 | 85.1 | 19 / 35 | 5367 |
| 5 | 1 | 69.2 | 87.0 | 19 / 35 | 6281 |
| 6 | 1 | 65.5 | 74.6 | 12 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 42 | 76% |
| mz.MicroGodMelee 1 | 33 | 67% |
| gh.micro.Gruweltje 0.7 | 27 | 63% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 6 | 83% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 29% | 54 |
| spinnercat.micro.Tyger 0.1 | 33 | 28% | 60 |
| gh.micro.Gruweltje 0.7 | 28 | 24% | 56 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 7 |
| acogdev.alpha 0.2 | 6 | 5% | 9 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.6 | 103 / 210 | 3.92 | 15.6% | 30428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.2% | 46 |
| hadur117.micro.SaorWNM 0.1 | 1.8 | 15.6% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 28 |
| germ.TheMind .2 | 5.0 | 9.5% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 7 |
| awesomeness.Elite 1.0 | 6.0 | 8.8% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.1% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.1% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.2 | 22 / 35 | 5621 |
| 2 | 2 | 63.8 | 69.2 | 15 / 35 | 5159 |
| 3 | 2 | 64.0 | 71.4 | 19 / 35 | 4757 |
| 4 | 2 | 61.1 | 61.9 | 15 / 35 | 4746 |
| 5 | 3 | 61.1 | 62.5 | 13 / 35 | 4749 |
| 6 | 1 | 63.0 | 64.1 | 19 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| germ.TheMind .2 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 38% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 22% | 36 |
| germ.TheMind .2 | 11 | 10% | 21 |
| lrem.micro.MoggFanatic 0.2 | 8 | 7% | 11 |
| awesomeness.Elite 1.0 | 7 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 11 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 7 |

## Melee bench: F09

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 80.1 | 122 / 210 | 2.80 | 18.1% | 29822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.1% | 122 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 20 |
| maribo.IotaCT 1.1 | 4.2 | 11.1% | 14 |
| timmit.nano.TimDog 0.33 | 5.0 | 10.3% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.2% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 8.7% | 6 |
| stelo.PatternRobot 1.0 | 8.0 | 8.1% | 8 |
| spinnercat.Omen 1.0 | 8.3 | 7.9% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 25 / 35 | 4925 |
| 2 | 1 | 66.3 | 77.5 | 19 / 35 | 4642 |
| 3 | 1 | 67.4 | 77.5 | 20 / 35 | 5084 |
| 4 | 1 | 66.1 | 76.5 | 18 / 35 | 4520 |
| 5 | 1 | 68.4 | 79.0 | 20 / 35 | 5352 |
| 6 | 1 | 69.0 | 84.4 | 20 / 35 | 5299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 88% |
| nz.jdc.nano.GridFu 1.0 | 26 | 100% |
| stelo.PatternRobot 1.0 | 15 | 80% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| maribo.IotaCT 1.1 | 12 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 24% | 63 |
| timmit.nano.TimDog 0.33 | 15 | 17% | 33 |
| nz.jdc.nano.GridFu 1.0 | 14 | 16% | 41 |
| stelo.PatternRobot 1.0 | 13 | 15% | 23 |
| ratosh.Wesco 1.4 | 11 | 13% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 7% | 9 |
| maribo.IotaCT 1.1 | 5 | 6% | 18 |
| spinnercat.Omen 1.0 | 3 | 3% | 6 |

## Melee bench: F10

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.7 | 160 / 210 | 1.83 | 20.9% | 38630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.9% | 160 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.6% | 23 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 6 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 8.9% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.5% | 1 |
| sanja.First 0.1 | 6.7 | 8.2% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.6% | 5 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 24 / 35 | 6266 |
| 2 | 1 | 71.2 | 93.3 | 26 / 35 | 6652 |
| 3 | 1 | 69.0 | 84.4 | 25 / 35 | 5896 |
| 4 | 1 | 71.7 | 92.4 | 28 / 35 | 6742 |
| 5 | 1 | 71.3 | 92.4 | 28 / 35 | 6497 |
| 6 | 1 | 71.7 | 93.3 | 29 / 35 | 6577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 88% |
| baal.nano.N 1.42 | 37 | 95% |
| cvt.Firsty 1.0 | 23 | 96% |
| Grystrion.TrackerWO 1.0 | 22 | 95% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 14 | 79% |
| sanja.First 0.1 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 17 | 33% | 32 |
| baal.nano.N 1.42 | 8 | 16% | 37 |
| tvv.nano.Polaris 1.2 | 7 | 14% | 56 |
| cvt.Firsty 1.0 | 5 | 10% | 29 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 17 |
| sanja.First 0.1 | 4 | 8% | 21 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 6 |

## Melee bench: F11

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 63.9 | 81 / 210 | 4.25 | 14.7% | 30407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 75 |
| hadur117.micro.SaorWNM 0.1 | 1.7 | 14.7% | 81 |
| cs.Wren 1.0 | 3.2 | 12.7% | 17 |
| mz.Cork 0.1 | 4.2 | 11.2% | 12 |
| js.PinBall 1.6 | 4.5 | 11.2% | 12 |
| joe.ADinosaur 1.0 | 6.3 | 8.6% | 3 |
| evd.X1 0.01 | 6.7 | 8.1% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 8.5 | 6.3% | 5 |
| PSW.Relentless 0.1 | 10.0 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 63.8 | 14 / 35 | 5207 |
| 2 | 1 | 65.7 | 74.6 | 14 / 35 | 5735 |
| 3 | 1 | 62.2 | 62.9 | 17 / 35 | 5120 |
| 4 | 1 | 62.7 | 66.0 | 14 / 35 | 5213 |
| 5 | 2 | 59.6 | 61.0 | 12 / 35 | 4352 |
| 6 | 3 | 58.2 | 54.9 | 10 / 35 | 4780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 51 | 76% |
| cs.Wren 1.0 | 23 | 87% |
| js.PinBall 1.6 | 7 | 100% |
| mz.Cork 0.1 | 7 | 86% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 39 | 30% | 82 |
| evd.X1 0.01 | 22 | 17% | 24 |
| PSW.Relentless 0.1 | 14 | 11% | 14 |
| js.PinBall 1.6 | 13 | 10% | 20 |
| joe.ADinosaur 1.0 | 13 | 10% | 15 |
| cs.Wren 1.0 | 12 | 9% | 29 |
| mz.Cork 0.1 | 12 | 9% | 17 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 4 |

## Melee bench: F12

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.6 | 117 / 210 | 2.74 | 18.1% | 29375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 18.1% | 117 |
| myl.nano.Graviton 1.10 | 2.5 | 12.6% | 34 |
| ntc.Opposite 1.5 | 3.0 | 12.1% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 9.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.9% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.6% | 16 |
| disan.Chair 2.2.0 | 6.8 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.7 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 8.8 | 6.5% | 4 |
| pbg.R2D2 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 20 / 35 | 4642 |
| 2 | 1 | 67.4 | 81.0 | 22 / 35 | 4768 |
| 3 | 1 | 64.2 | 73.7 | 15 / 35 | 4245 |
| 4 | 1 | 68.3 | 81.9 | 21 / 35 | 5316 |
| 5 | 1 | 67.7 | 80.6 | 20 / 35 | 5404 |
| 6 | 1 | 67.4 | 82.2 | 19 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 88% |
| ntc.Opposite 1.5 | 24 | 83% |
| stelo.AreaTargetingBot 1.1 | 22 | 82% |
| donjezza.Muncho 1.0 | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| DBall.NUKE 0.1 | 6 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 27 | 29% | 58 |
| pfvicm.Sobieski 7.2.3b | 17 | 18% | 28 |
| ntc.Opposite 1.5 | 16 | 17% | 27 |
| stelo.AreaTargetingBot 1.1 | 11 | 12% | 34 |
| disan.Chair 2.2.0 | 8 | 9% | 19 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 8% | 13 |
| DBall.NUKE 0.1 | 3 | 3% | 13 |
| donjezza.Muncho 1.0 | 3 | 3% | 12 |
| pbg.R2D2 1.0 | 1 | 1% | 6 |

## Melee bench: F13

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.7 | 70 / 210 | 3.90 | 14.8% | 26284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.7 | 14.8% | 70 |
| oog.melee.Capulet 1.2 | 2.2 | 14.5% | 54 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 36 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.3% | 20 |
| ejb.Polaris 1.0.1 | 5.5 | 10.9% | 15 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 69.8 | 11 / 35 | 4078 |
| 2 | 1 | 63.3 | 69.8 | 14 / 35 | 4021 |
| 3 | 1 | 64.2 | 69.8 | 14 / 35 | 4655 |
| 4 | 1 | 64.4 | 73.0 | 12 / 35 | 4548 |
| 5 | 1 | 63.7 | 67.0 | 14 / 35 | 4521 |
| 6 | 4 | 59.4 | 56.8 | 5 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 53% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| yagami.Tidus 0.11 | 16 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 93% |
| ejb.Polaris 1.0.1 | 3 | 67% |

Hadur died in 140 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 41% | 78 |
| yagami.Tidus 0.11 | 25 | 18% | 35 |
| ejb.Polaris 1.0.1 | 15 | 11% | 20 |
| kawigi.micro.Shiz 1.1 | 14 | 10% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 29 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.2 | 129 / 210 | 2.79 | 17.5% | 27397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 17.5% | 129 |
| bzdp.Pansy 2.1 | 3.0 | 11.8% | 14 |
| ratosh.Nobo 0.21 | 3.7 | 11.2% | 17 |
| wee.Gem 1.8.4 | 3.7 | 11.2% | 14 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 19 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 9.0% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.4% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.1 | 23 / 35 | 4178 |
| 2 | 1 | 64.8 | 78.7 | 17 / 35 | 4116 |
| 3 | 1 | 68.2 | 84.1 | 25 / 35 | 5144 |
| 4 | 1 | 67.0 | 83.2 | 23 / 35 | 4624 |
| 5 | 1 | 64.2 | 74.3 | 17 / 35 | 4595 |
| 6 | 1 | 67.4 | 82.5 | 24 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 93% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 18 | 83% |
| m3thos.Eva00 1.1 | 14 | 100% |
| ratosh.Nobo 0.21 | 11 | 55% |
| bayen.UbaMicro 1.4 | 7 | 57% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 14 | 17% | 26 |
| bzdp.Pansy 2.1 | 12 | 15% | 61 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 12% | 12 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 12 |
| wee.Gem 1.8.4 | 8 | 10% | 40 |
| wompi.Quokka 1.6 | 8 | 10% | 20 |
| bayen.UbaMicro 1.4 | 8 | 10% | 12 |
| maribo.FollowFire 1 | 8 | 10% | 8 |
| m3thos.Eva00 1.1 | 4 | 5% | 18 |

## Melee bench: F15

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 83.0 | 116 / 210 | 2.53 | 20.1% | 45260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 20.1% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 69 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 19 |
| ayk.WallHugger 1.0 | 4.3 | 9.9% | 2 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 80.3 | 18 / 35 | 7023 |
| 2 | 1 | 71.2 | 82.2 | 18 / 35 | 7713 |
| 3 | 1 | 69.4 | 76.8 | 18 / 35 | 7074 |
| 4 | 1 | 71.5 | 85.7 | 18 / 35 | 7628 |
| 5 | 1 | 73.5 | 91.4 | 23 / 35 | 8176 |
| 6 | 1 | 70.9 | 81.3 | 21 / 35 | 7646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 86 | 79% |
| mz.NanoGod 2.02 | 20 | 80% |
| exauge.GateKeeper 1.1.121g | 12 | 100% |
| ayk.WallHugger 1.0 | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 35 | 37% | 113 |
| mz.NanoGod 2.02 | 34 | 36% | 52 |
| ayk.WallHugger 1.0 | 10 | 11% | 19 |
| exauge.GateKeeper 1.1.121g | 9 | 9% | 13 |
| stelo.PianistNano 1.2 | 4 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.1 | 105 / 210 | 3.42 | 16.7% | 30332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 16.7% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.3% | 23 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 25 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.2% | 15 |
| conscience.Electron 1.3g | 6.3 | 8.4% | 2 |
| stelo.MirrorMicro 1.0 | 6.7 | 8.5% | 5 |
| ap.Frederick 1.1 | 8.2 | 6.9% | 12 |
| dl.BetterWalls 1.0 | 9.0 | 6.8% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 21 / 35 | 4883 |
| 2 | 1 | 62.3 | 67.0 | 15 / 35 | 4502 |
| 3 | 1 | 66.4 | 79.0 | 19 / 35 | 5427 |
| 4 | 1 | 64.4 | 72.4 | 15 / 35 | 5154 |
| 5 | 1 | 65.3 | 72.1 | 19 / 35 | 5046 |
| 6 | 1 | 64.6 | 70.5 | 16 / 35 | 5320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 84% |
| dummy.micro.Sparrow 2.5 | 27 | 78% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 17 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 60 |
| dummy.micro.Sparrow 2.5 | 20 | 19% | 48 |
| conscience.Electron 1.3g | 20 | 19% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 12% | 14 |
| bvh.micro.Freya 0.3 | 9 | 9% | 18 |
| dl.BetterWalls 1.0 | 9 | 9% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 28 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 7 |

## Melee bench: F17

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 91.0 | 156 / 210 | 1.81 | 21.9% | 43781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 21.9% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.7% | 15 |
| sul.Lunar 1.1 | 3.2 | 11.1% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 13 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 4 |
| dsw.StaticD 1.0 | 6.3 | 8.0% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.1% | 2 |
| sample.Corners 1.0 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.1 | 27 / 35 | 7408 |
| 2 | 1 | 72.3 | 92.4 | 26 / 35 | 7427 |
| 3 | 1 | 72.0 | 91.4 | 28 / 35 | 6970 |
| 4 | 1 | 73.0 | 93.7 | 27 / 35 | 7539 |
| 5 | 1 | 69.8 | 85.1 | 20 / 35 | 6613 |
| 6 | 1 | 73.0 | 91.4 | 28 / 35 | 7824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 91% |
| sul.Lunar 1.1 | 47 | 98% |
| supersample.SuperBoxBot 1.0 | 26 | 81% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 100% |
| sample.Corners 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| dsw.StaticD 1.0 | 5 | 60% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 41% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 26% | 65 |
| dsw.StaticD 1.0 | 4 | 7% | 9 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 5 |
| sample.Corners 1.0 | 3 | 6% | 14 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 12 |
| sul.Lunar 1.1 | 2 | 4% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 9 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWNM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.9 | 101 / 210 | 3.26 | 17.3% | 36436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNM 0.1 | 1.0 | 17.3% | 101 |
| radnor.DoctorBob 1.42 | 2.2 | 13.3% | 35 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.3% | 23 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.8% | 13 |
| amz.NanoClone 1.41 | 5.7 | 10.0% | 9 |
| sample.Walls 1.0 | 7.2 | 8.1% | 4 |
| GarmBox.Oranges 1.0 | 8.0 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.1% | 7 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.7 | 18 / 35 | 5938 |
| 2 | 1 | 64.4 | 69.8 | 13 / 35 | 6123 |
| 3 | 1 | 65.4 | 69.8 | 16 / 35 | 6202 |
| 4 | 1 | 65.9 | 75.9 | 18 / 35 | 5774 |
| 5 | 1 | 66.9 | 76.2 | 20 / 35 | 6020 |
| 6 | 1 | 66.9 | 77.8 | 16 / 35 | 6379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 84% |
| radnor.DoctorBob 1.42 | 30 | 83% |
| mld.Wisdom 1.0 | 16 | 81% |
| sample.Walls 1.0 | 10 | 100% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| jangs.ns51 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 109 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 32% | 52 |
| radnor.DoctorBob 1.42 | 22 | 20% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 14% | 43 |
| KiraNL.Chupacabra 0.4 | 15 | 14% | 20 |
| amz.NanoClone 1.41 | 10 | 9% | 17 |
| jangs.ns51 1.0 | 6 | 6% | 12 |
| GarmBox.Oranges 1.0 | 4 | 4% | 3 |
| sample.Walls 1.0 | 2 | 2% | 10 |

