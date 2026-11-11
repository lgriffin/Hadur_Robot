# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 91.1 | 154 / 210 | 1.80 | 22.3% | 46270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.3% | 154 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 17 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 20 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 13 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 3 |
| GarmBox.Oranges 1.0 | 6.3 | 6.8% | 0 |
| sample.Walls 1.0 | 7.3 | 6.5% | 3 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 90.5 | 26 / 35 | 7317 |
| 2 | 1 | 72.6 | 92.4 | 23 / 35 | 7509 |
| 3 | 1 | 74.0 | 93.3 | 27 / 35 | 7825 |
| 4 | 1 | 74.6 | 94.9 | 30 / 35 | 8114 |
| 5 | 1 | 74.1 | 92.7 | 26 / 35 | 8026 |
| 6 | 1 | 71.1 | 82.5 | 22 / 35 | 7479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 93% |
| radnor.DoctorBob 1.42 | 39 | 77% |
| mld.Infinity 2.2 | 36 | 92% |
| amz.NanoClone 1.41 | 6 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 50% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 40% | 62 |
| mz.AntiGrav 1.0 | 16 | 28% | 77 |
| mld.Infinity 2.2 | 6 | 11% | 41 |
| amz.NanoClone 1.41 | 4 | 7% | 8 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| arthord.MannyPacquiao Beta | 2 | 4% | 6 |
| GarmBox.Oranges 1.0 | 2 | 4% | 5 |
| sample.Walls 1.0 | 2 | 4% | 2 |

## Melee bench: F02

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.7 | 128 / 210 | 2.11 | 19.6% | 35203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.6% | 128 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.8% | 51 |
| mld.DustBunny 3.8 | 3.2 | 13.8% | 16 |
| maribo.melee.BMV 0.1 | 3.8 | 10.4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.2% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.3% | 5 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| bzdp.BoxCar 2.0 | 7.7 | 7.2% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 5.7% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.6 | 19 / 35 | 5580 |
| 2 | 1 | 67.7 | 81.3 | 17 / 35 | 5628 |
| 3 | 1 | 71.5 | 94.9 | 27 / 35 | 6489 |
| 4 | 1 | 71.7 | 93.0 | 26 / 35 | 6309 |
| 5 | 1 | 68.2 | 84.1 | 21 / 35 | 5193 |
| 6 | 1 | 70.3 | 91.1 | 18 / 35 | 6004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 74 | 82% |
| oog.melee.Mercutio 1.0 | 61 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 83% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 40% | 83 |
| mld.DustBunny 3.8 | 28 | 34% | 84 |
| maribo.melee.BMV 0.1 | 5 | 6% | 9 |
| cs.Grudge 1.0 | 5 | 6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 11 |
| zyx.nano.Ant 1.1 | 3 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 7 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 81.6 | 126 / 210 | 2.65 | 20.0% | 39929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.0% | 126 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.5% | 10 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.9% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.9% | 20 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 5 |
| sample.Fire 1.0 | 9.3 | 4.8% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.8 | 22 / 35 | 6093 |
| 2 | 1 | 70.1 | 81.0 | 22 / 35 | 7037 |
| 3 | 1 | 69.2 | 79.7 | 17 / 35 | 6665 |
| 4 | 1 | 71.7 | 87.9 | 23 / 35 | 6879 |
| 5 | 1 | 70.0 | 81.3 | 23 / 35 | 6733 |
| 6 | 1 | 68.7 | 75.2 | 19 / 35 | 6522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 87% |
| cb.nano.Insomnia 1.0 | 25 | 100% |
| myl.nano.KomoriNinja 1.1 | 20 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 61% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| cs.sheldor.Talon 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 7 | 86% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 18 | 21% | 66 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 21% | 29 |
| cb.nano.Insomnia 1.0 | 16 | 19% | 23 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 40 |
| fm.mammillarias 1.3 | 7 | 8% | 12 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 14 |
| sample.Fire 1.0 | 4 | 5% | 7 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 15 |
| sample.Tracker 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.2 | 142 / 210 | 2.24 | 20.7% | 40957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 20.7% | 142 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.3% | 14 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.7% | 18 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 4 |
| yk.JahMicro 1.0 | 7.5 | 7.7% | 6 |
| repositorio.NanoStep 1.0 | 8.8 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 96.2 | 31 / 35 | 6999 |
| 2 | 1 | 68.5 | 77.8 | 19 / 35 | 6770 |
| 3 | 1 | 70.4 | 85.4 | 27 / 35 | 6644 |
| 4 | 1 | 71.0 | 90.5 | 23 / 35 | 6547 |
| 5 | 1 | 70.4 | 84.4 | 22 / 35 | 6991 |
| 6 | 1 | 69.7 | 83.2 | 20 / 35 | 7006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 92% |
| stelo.SoJNanoMelee 1.1 | 39 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 86% |
| tvv.micro.Antares 1.1.1 | 18 | 83% |
| tj.zombie1n 1.0.1 | 14 | 64% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 38% | 85 |
| stelo.SoJNanoMelee 1.1 | 16 | 24% | 38 |
| tj.zombie1n 1.0.1 | 8 | 12% | 11 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 7% | 22 |
| repositorio.NanoStep 1.0 | 3 | 4% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 9 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F05

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 69.2 | 97 / 210 | 3.78 | 16.2% | 30575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 16.2% | 97 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 39 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 20 |
| EBBU.Sim2 1.02 | 5.3 | 9.8% | 6 |
| sam.Samspin 1.0 | 6.0 | 9.8% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.2% | 11 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 71.7 | 20 / 35 | 5304 |
| 2 | 1 | 61.8 | 61.9 | 14 / 35 | 4943 |
| 3 | 1 | 62.3 | 64.8 | 14 / 35 | 4971 |
| 4 | 1 | 65.3 | 70.2 | 17 / 35 | 5377 |
| 5 | 1 | 65.0 | 74.0 | 17 / 35 | 5046 |
| 6 | 1 | 64.2 | 72.4 | 15 / 35 | 4934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 38 | 68% |
| simonton.nano.MeleeSeed 1.8 | 34 | 94% |
| ahf.NanoAndrew .4 | 18 | 94% |
| EBBU.Sim2 1.02 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 71% |
| sam.Samspin 1.0 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 20% | 50 |
| simonton.nano.MeleeSeed 1.8 | 20 | 18% | 48 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 18 |
| EBBU.Sim2 1.02 | 14 | 12% | 19 |
| ahf.NanoAndrew .4 | 10 | 9% | 30 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 9 |
| sample.TrackFire 1.0 | 8 | 7% | 13 |
| sam.Samspin 1.0 | 6 | 5% | 11 |

## Melee bench: F06

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.9 | 134 / 210 | 2.27 | 19.4% | 34253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.4% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.2% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 10.9% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.1% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 6 |
| fm.claire 1.7 | 5.8 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 0 |
| sample.SpinBot 1.0 | 8.5 | 6.5% | 2 |
| pa.Improved 1.0 | 9.2 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 82.2 | 17 / 35 | 5236 |
| 2 | 1 | 69.0 | 83.5 | 20 / 35 | 6163 |
| 3 | 1 | 69.7 | 85.4 | 25 / 35 | 5957 |
| 4 | 1 | 70.2 | 90.2 | 25 / 35 | 6087 |
| 5 | 1 | 70.3 | 88.6 | 25 / 35 | 5831 |
| 6 | 1 | 68.2 | 85.7 | 22 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 79% |
| oog.melee.CapuletDroid 1.1 | 37 | 89% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 38% | 89 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 43 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 14 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 16 |
| gh.nano.Grofvuil 0.2 | 6 | 8% | 19 |
| fm.claire 1.7 | 5 | 7% | 8 |
| kurios.DOSexe .9b | 3 | 4% | 9 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| pa.Improved 1.0 | 2 | 3% | 7 |

## Melee bench: F07

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.3 | 102 / 210 | 2.78 | 18.4% | 35772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.4% | 102 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.1% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 25 |
| mz.MicroGodMelee 1 | 3.5 | 13.5% | 40 |
| DBall.Anarchy 0.1 | 5.2 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 70.2 | 9 / 35 | 5145 |
| 2 | 1 | 69.9 | 82.5 | 20 / 35 | 6624 |
| 3 | 1 | 66.7 | 75.9 | 13 / 35 | 5824 |
| 4 | 1 | 68.0 | 81.0 | 17 / 35 | 5861 |
| 5 | 1 | 70.0 | 86.7 | 21 / 35 | 6340 |
| 6 | 1 | 70.0 | 85.4 | 22 / 35 | 5978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 96% |
| mz.MicroGodMelee 1 | 43 | 63% |
| gh.micro.Gruweltje 0.7 | 22 | 77% |
| DBall.Anarchy 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 33% | 66 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 53 |
| spinnercat.micro.Tyger 0.1 | 23 | 21% | 57 |
| acogdev.alpha 0.2 | 8 | 7% | 10 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 4 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 65.6 | 90 / 210 | 4.10 | 15.6% | 30573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.5 | 15.6% | 90 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.0% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 34 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.6% | 4 |
| germ.TheMind .2 | 5.7 | 9.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 5.7 | 9.0% | 2 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 7 |
| stelo.UntouchableNano 1.3 | 7.0 | 7.9% | 11 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 67.3 | 19 / 35 | 5577 |
| 2 | 2 | 61.1 | 58.1 | 10 / 35 | 4962 |
| 3 | 2 | 62.7 | 65.7 | 12 / 35 | 4776 |
| 4 | 2 | 61.4 | 58.1 | 13 / 35 | 5080 |
| 5 | 1 | 65.5 | 74.3 | 19 / 35 | 4915 |
| 6 | 1 | 65.0 | 69.8 | 17 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| germ.TheMind .2 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 6 | 67% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 120 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 46% | 99 |
| germ.TheMind .2 | 14 | 12% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 11% | 34 |
| awesomeness.Elite 1.0 | 10 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 8 | 7% | 10 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 11 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 90.5 | 160 / 210 | 1.85 | 21.0% | 34715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.0% | 160 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.7% | 6 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 8 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.7% | 8 |
| ratosh.Wesco 1.4 | 6.7 | 8.5% | 7 |
| stelo.PatternRobot 1.0 | 7.0 | 7.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.9% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 7.4% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 86.0 | 25 / 35 | 5968 |
| 2 | 1 | 72.4 | 94.0 | 29 / 35 | 5809 |
| 3 | 1 | 72.3 | 91.7 | 27 / 35 | 6001 |
| 4 | 1 | 71.9 | 94.0 | 27 / 35 | 5943 |
| 5 | 1 | 72.3 | 94.6 | 27 / 35 | 5765 |
| 6 | 1 | 69.7 | 82.9 | 25 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 91 | 96% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| maribo.IotaCT 1.1 | 18 | 89% |
| stelo.PatternRobot 1.0 | 16 | 88% |
| timmit.nano.TimDog 0.33 | 12 | 58% |
| ratosh.Wesco 1.4 | 9 | 78% |
| spinnercat.Omen 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 13 | 26% | 73 |
| timmit.nano.TimDog 0.33 | 10 | 20% | 20 |
| stelo.PatternRobot 1.0 | 8 | 16% | 19 |
| ratosh.Wesco 1.4 | 6 | 12% | 17 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 48 |
| maribo.IotaCT 1.1 | 5 | 10% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 93.4 | 174 / 210 | 1.60 | 22.3% | 43001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.3% | 174 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.9% | 5 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.8% | 2 |
| zyx.micro.Ant 1.1 | 5.0 | 8.8% | 4 |
| sanja.First 0.1 | 6.2 | 8.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.3% | 5 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 97.5 | 30 / 35 | 7129 |
| 2 | 1 | 71.3 | 86.7 | 26 / 35 | 6993 |
| 3 | 1 | 73.4 | 96.2 | 31 / 35 | 7335 |
| 4 | 1 | 72.2 | 88.9 | 27 / 35 | 7589 |
| 5 | 1 | 71.8 | 93.3 | 29 / 35 | 6800 |
| 6 | 1 | 73.3 | 97.8 | 31 / 35 | 7155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 48 | 94% |
| tvv.nano.Polaris 1.2 | 43 | 91% |
| cvt.Firsty 1.0 | 20 | 90% |
| sanja.First 0.1 | 20 | 100% |
| zyx.micro.Ant 1.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 26% | 69 |
| zyx.micro.Ant 1.1 | 9 | 24% | 29 |
| baal.nano.N 1.42 | 5 | 13% | 36 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 20 |
| sanja.First 0.1 | 4 | 11% | 26 |
| cvt.Firsty 1.0 | 4 | 11% | 19 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 69.9 | 91 / 210 | 3.70 | 16.2% | 33553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.3 | 16.2% | 91 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 65 |
| cs.Wren 1.0 | 3.3 | 12.1% | 14 |
| js.PinBall 1.6 | 4.0 | 11.4% | 19 |
| mz.Cork 0.1 | 4.8 | 10.5% | 9 |
| joe.ADinosaur 1.0 | 6.3 | 8.7% | 4 |
| evd.X1 0.01 | 6.5 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 8.3 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 6.0% | 3 |
| PSW.Relentless 0.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 62.5 | 12 / 35 | 5276 |
| 2 | 1 | 62.0 | 67.9 | 15 / 35 | 4682 |
| 3 | 1 | 66.2 | 75.2 | 13 / 35 | 5801 |
| 4 | 1 | 64.3 | 68.6 | 14 / 35 | 5839 |
| 5 | 2 | 63.6 | 66.0 | 15 / 35 | 5442 |
| 6 | 1 | 68.4 | 79.4 | 22 / 35 | 6513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 71% |
| cs.Wren 1.0 | 18 | 83% |
| js.PinBall 1.6 | 13 | 69% |
| mz.Cork 0.1 | 7 | 71% |
| joe.ADinosaur 1.0 | 5 | 80% |
| donjezza.Jezza 1.0 | 5 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 47% | 107 |
| cs.Wren 1.0 | 17 | 14% | 29 |
| evd.X1 0.01 | 12 | 10% | 12 |
| js.PinBall 1.6 | 9 | 8% | 23 |
| joe.ADinosaur 1.0 | 9 | 8% | 13 |
| mz.Cork 0.1 | 9 | 8% | 13 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.8 | 142 / 210 | 2.28 | 19.6% | 31492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 19.6% | 142 |
| myl.nano.Graviton 1.10 | 2.8 | 11.2% | 14 |
| ntc.Opposite 1.5 | 3.3 | 11.2% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 8 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.6% | 12 |
| DBall.NUKE 0.1 | 6.8 | 8.3% | 8 |
| disan.Chair 2.2.0 | 7.3 | 8.5% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 5.5% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.4 | 20 / 35 | 5086 |
| 2 | 1 | 69.6 | 85.7 | 26 / 35 | 5304 |
| 3 | 1 | 71.1 | 94.0 | 27 / 35 | 5340 |
| 4 | 1 | 70.4 | 90.2 | 27 / 35 | 5598 |
| 5 | 1 | 67.6 | 80.3 | 21 / 35 | 5104 |
| 6 | 1 | 68.9 | 86.0 | 21 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 93% |
| ntc.Opposite 1.5 | 25 | 84% |
| stelo.AreaTargetingBot 1.1 | 24 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 100% |
| disan.Chair 2.2.0 | 15 | 87% |
| donjezza.Muncho 1.0 | 12 | 83% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 14 | 21% | 23 |
| stelo.AreaTargetingBot 1.1 | 13 | 19% | 36 |
| ntc.Opposite 1.5 | 13 | 19% | 23 |
| myl.nano.Graviton 1.10 | 9 | 13% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 12% | 25 |
| disan.Chair 2.2.0 | 4 | 6% | 18 |
| donjezza.Muncho 1.0 | 4 | 6% | 9 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.5 | 86 / 210 | 3.38 | 16.1% | 27803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.3 | 16.1% | 86 |
| oog.melee.Capulet 1.2 | 2.5 | 13.5% | 37 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.6% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 35 |
| yagami.Tidus 0.11 | 4.7 | 12.2% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 11 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 22 / 35 | 4517 |
| 2 | 1 | 65.2 | 75.2 | 14 / 35 | 4530 |
| 3 | 1 | 66.1 | 76.2 | 16 / 35 | 4870 |
| 4 | 2 | 62.9 | 66.0 | 12 / 35 | 4454 |
| 5 | 1 | 65.7 | 74.0 | 13 / 35 | 5019 |
| 6 | 2 | 62.0 | 64.1 | 9 / 35 | 4413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 63% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| oog.melee.Capulet 1.2 | 26 | 65% |
| yagami.Tidus 0.11 | 18 | 94% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 47 | 38% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 20% | 46 |
| yagami.Tidus 0.11 | 22 | 18% | 38 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 32 |
| ejb.Polaris 1.0.1 | 8 | 6% | 13 |
| kurios.DOSexe .9a | 5 | 4% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.0 | 133 / 210 | 2.89 | 17.9% | 29756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.9% | 133 |
| bzdp.Pansy 2.1 | 3.2 | 11.9% | 17 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 23 |
| ratosh.Nobo 0.21 | 3.7 | 11.0% | 8 |
| wompi.Quokka 1.6 | 4.2 | 11.2% | 18 |
| m3thos.Eva00 1.1 | 6.2 | 9.5% | 7 |
| bayen.UbaMicro 1.4 | 6.3 | 8.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 79.0 | 21 / 35 | 4900 |
| 2 | 1 | 68.0 | 82.5 | 23 / 35 | 5137 |
| 3 | 1 | 67.1 | 78.4 | 23 / 35 | 5102 |
| 4 | 1 | 65.5 | 73.0 | 18 / 35 | 5034 |
| 5 | 1 | 67.4 | 81.6 | 23 / 35 | 4940 |
| 6 | 1 | 67.0 | 79.4 | 25 / 35 | 4643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 94% |
| wee.Gem 1.8.4 | 30 | 97% |
| ratosh.Nobo 0.21 | 22 | 91% |
| wompi.Quokka 1.6 | 18 | 89% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 12 | 15% | 12 |
| bzdp.Pansy 2.1 | 11 | 14% | 51 |
| ratosh.Nobo 0.21 | 10 | 13% | 24 |
| stelo.MyAgileRobot 0.2 | 9 | 12% | 11 |
| wee.Gem 1.8.4 | 8 | 10% | 44 |
| wompi.Quokka 1.6 | 8 | 10% | 24 |
| m3thos.Eva00 1.1 | 8 | 10% | 20 |
| bayen.UbaMicro 1.4 | 7 | 9% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 87.3 | 127 / 210 | 2.14 | 22.0% | 50314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 22.0% | 127 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 60 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 14 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 6 |
| stuff.Vlad 0.1 | 4.8 | 9.2% | 2 |
| ayk.WallHugger 1.0 | 5.7 | 8.7% | 1 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 82.9 | 18 / 35 | 8013 |
| 2 | 1 | 74.1 | 90.8 | 22 / 35 | 8934 |
| 3 | 1 | 73.4 | 86.7 | 22 / 35 | 8454 |
| 4 | 1 | 73.2 | 87.6 | 22 / 35 | 8095 |
| 5 | 1 | 73.4 | 89.2 | 23 / 35 | 8228 |
| 6 | 1 | 73.3 | 86.7 | 20 / 35 | 8590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 80% |
| mz.NanoGod 2.02 | 13 | 85% |
| exauge.GateKeeper 1.1.121g | 7 | 57% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 0% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 45% | 140 |
| mz.NanoGod 2.02 | 16 | 19% | 27 |
| exauge.GateKeeper 1.1.121g | 13 | 16% | 19 |
| stuff.Vlad 0.1 | 9 | 11% | 12 |
| ayk.WallHugger 1.0 | 5 | 6% | 4 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.3 | 105 / 210 | 3.40 | 17.0% | 30771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 17.0% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.9% | 19 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 9.7% | 16 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.5% | 10 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 0 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 8 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.7 | 16 / 35 | 5171 |
| 2 | 1 | 64.9 | 71.1 | 18 / 35 | 4904 |
| 3 | 1 | 67.2 | 78.4 | 20 / 35 | 5157 |
| 4 | 1 | 62.0 | 62.5 | 13 / 35 | 5009 |
| 5 | 1 | 66.6 | 78.7 | 21 / 35 | 5144 |
| 6 | 1 | 66.9 | 77.5 | 17 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 55 | 85% |
| dummy.micro.Sparrow 2.5 | 19 | 95% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 77% |
| ap.Frederick 1.1 | 8 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 26% | 74 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 14 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 32 |
| conscience.Electron 1.3g | 13 | 12% | 14 |
| dl.BetterWalls 1.0 | 11 | 10% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 10% | 25 |
| stelo.MirrorMicro 1.0 | 9 | 9% | 17 |
| bvh.micro.Freya 0.3 | 7 | 7% | 17 |

## Melee bench: F17

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.2 | 145 / 210 | 2.33 | 21.5% | 44826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 21.5% | 145 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.9% | 26 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 16 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 7 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.9% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.4% | 2 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.7% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.0% | 5 |
| sample.Corners 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 87.0 | 24 / 35 | 7333 |
| 2 | 1 | 71.4 | 84.4 | 21 / 35 | 7486 |
| 3 | 1 | 73.3 | 87.9 | 25 / 35 | 8044 |
| 4 | 1 | 70.6 | 80.3 | 22 / 35 | 7514 |
| 5 | 1 | 72.6 | 87.0 | 29 / 35 | 7345 |
| 6 | 1 | 71.6 | 84.8 | 24 / 35 | 7104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 45 | 87% |
| supersample.SuperBoxBot 1.0 | 24 | 100% |
| mme.NikeEnhanced 2.0 | 15 | 100% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 27 | 40% | 65 |
| supersample.SuperBoxBot 1.0 | 10 | 15% | 28 |
| sul.Lunar 1.1 | 8 | 12% | 51 |
| dsw.StaticD 1.0 | 7 | 10% | 19 |
| tlp.ThreeLeggedPig 1 | 5 | 7% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 6% | 10 |
| mme.NikeEnhanced 2.0 | 3 | 4% | 17 |
| sample.Corners 1.0 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 6 |

## Melee bench: F18

hadur117.micro.SaorWGA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 78.8 | 116 / 210 | 2.91 | 18.6% | 38519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGA 0.1 | 1.0 | 18.6% | 116 |
| radnor.DoctorBob 1.42 | 2.8 | 13.3% | 31 |
| mld.Wisdom 1.0 | 3.2 | 12.6% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 15 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 3 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 11 |
| sample.Walls 1.0 | 7.5 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 8.0 | 7.0% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.2% | 2 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.6 | 21 / 35 | 6561 |
| 2 | 1 | 70.2 | 85.4 | 20 / 35 | 6887 |
| 3 | 1 | 67.0 | 75.2 | 20 / 35 | 6094 |
| 4 | 1 | 68.7 | 81.3 | 19 / 35 | 6615 |
| 5 | 1 | 67.2 | 76.8 | 20 / 35 | 5909 |
| 6 | 1 | 67.1 | 72.4 | 16 / 35 | 6453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 44 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 95% |
| mld.Wisdom 1.0 | 17 | 76% |
| amz.NanoClone 1.41 | 11 | 82% |
| KiraNL.Chupacabra 0.4 | 7 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 490. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 27% | 40 |
| radnor.DoctorBob 1.42 | 20 | 21% | 52 |
| KiraNL.Chupacabra 0.4 | 19 | 20% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 16% | 53 |
| amz.NanoClone 1.41 | 7 | 7% | 15 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |

