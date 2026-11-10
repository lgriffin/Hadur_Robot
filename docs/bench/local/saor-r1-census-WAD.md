# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.6 | 93.0 | 164 / 210 | 1.63 | 22.7% | 45590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 22.7% | 164 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 17 |
| mz.AntiGrav 1.0 | 2.7 | 13.7% | 13 |
| mld.Infinity 2.2 | 4.0 | 11.6% | 10 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 4 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| sample.Walls 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.4% | 2 |
| arthord.MannyPacquiao Beta | 9.5 | 4.3% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 93.3 | 28 / 35 | 7295 |
| 2 | 1 | 73.2 | 90.8 | 28 / 35 | 7554 |
| 3 | 1 | 74.2 | 97.1 | 28 / 35 | 7652 |
| 4 | 1 | 72.8 | 91.1 | 24 / 35 | 7364 |
| 5 | 1 | 74.1 | 93.7 | 26 / 35 | 8016 |
| 6 | 1 | 73.7 | 92.1 | 30 / 35 | 7709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 95% |
| radnor.DoctorBob 1.42 | 42 | 81% |
| mld.Infinity 2.2 | 31 | 94% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 35% | 61 |
| mz.AntiGrav 1.0 | 10 | 22% | 67 |
| mld.Infinity 2.2 | 8 | 17% | 43 |
| amz.NanoClone 1.41 | 8 | 17% | 15 |
| sample.Walls 1.0 | 2 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.0 | 109 / 210 | 2.98 | 17.4% | 30812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.3 | 17.4% | 109 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.1% | 71 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 12 |
| maribo.melee.BMV 0.1 | 4.7 | 9.8% | 0 |
| zyx.nano.Ant 1.1 | 5.7 | 9.1% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.8% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.1% | 9 |
| bzdp.BoxCar 2.0 | 7.7 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.3 | 21 / 35 | 5021 |
| 2 | 1 | 68.7 | 88.3 | 22 / 35 | 5194 |
| 3 | 1 | 67.0 | 81.9 | 22 / 35 | 4918 |
| 4 | 3 | 59.4 | 52.7 | 11 / 35 | 4756 |
| 5 | 1 | 67.9 | 82.2 | 19 / 35 | 5773 |
| 6 | 1 | 65.5 | 75.9 | 14 / 35 | 5150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 74% |
| mld.DustBunny 3.8 | 43 | 86% |
| djdjdj.NanoSkunk10 1.0 | 9 | 89% |
| fullsail.SweetTea 1.1 | 8 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 57% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 30 | 30% | 75 |
| mld.DustBunny 3.8 | 25 | 25% | 58 |
| cs.Grudge 1.0 | 11 | 11% | 11 |
| fullsail.SweetTea 1.1 | 10 | 10% | 17 |
| zyx.nano.Ant 1.1 | 7 | 7% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 10 |
| maribo.melee.BMV 0.1 | 5 | 5% | 14 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 81.4 | 134 / 210 | 2.67 | 19.9% | 37932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.9% | 134 |
| myl.micro.Troodon 1.10 | 2.2 | 14.0% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.5% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.9% | 14 |
| fm.mammillarias 1.3 | 5.3 | 9.0% | 4 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.0% | 6 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.1% | 7 |
| sample.Fire 1.0 | 9.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 84.4 | 22 / 35 | 6245 |
| 2 | 1 | 67.8 | 72.1 | 20 / 35 | 6155 |
| 3 | 1 | 68.9 | 78.1 | 22 / 35 | 5963 |
| 4 | 1 | 70.2 | 83.8 | 22 / 35 | 6380 |
| 5 | 1 | 72.0 | 87.6 | 25 / 35 | 7061 |
| 6 | 1 | 69.7 | 82.5 | 23 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 43 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 95% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| myl.nano.KomoriNinja 1.1 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 12 | 83% |
| fm.mammillarias 1.3 | 7 | 86% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 28% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 18% | 48 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 38 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 15 |
| fm.mammillarias 1.3 | 9 | 12% | 16 |
| sp.Nanos.Ember 1.1 | 5 | 7% | 16 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 9 |
| sample.Fire 1.0 | 2 | 3% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.5 | 154 / 210 | 2.13 | 20.9% | 39961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.9% | 154 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.5% | 12 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.5% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.4% | 7 |
| tj.zombie1n 1.0.1 | 6.5 | 8.7% | 9 |
| yk.JahMicro 1.0 | 7.2 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 28 / 35 | 6612 |
| 2 | 1 | 72.9 | 94.3 | 27 / 35 | 7340 |
| 3 | 1 | 71.0 | 87.6 | 26 / 35 | 6658 |
| 4 | 1 | 70.3 | 85.4 | 25 / 35 | 6585 |
| 5 | 1 | 70.1 | 85.7 | 26 / 35 | 6406 |
| 6 | 1 | 69.2 | 82.2 | 22 / 35 | 6360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 56 | 91% |
| stelo.SoJNanoMelee 1.1 | 52 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 26 | 92% |
| tj.zombie1n 1.0.1 | 13 | 85% |
| tvv.micro.Antares 1.1.1 | 13 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 36% | 77 |
| stelo.SoJNanoMelee 1.1 | 14 | 25% | 42 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 13% | 12 |
| tj.zombie1n 1.0.1 | 6 | 11% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 28 |
| yk.JahMicro 1.0 | 2 | 4% | 4 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 20 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.1 | 96 / 210 | 3.60 | 16.3% | 28917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.3% | 96 |
| oog.melee.Corsair 1.0 | 2.0 | 12.6% | 35 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.9% | 18 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 7 |
| zyx.nano.BacillusComma 1.0 | 5.8 | 9.4% | 5 |
| sam.Samspin 1.0 | 6.3 | 9.1% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.9 | 18 / 35 | 5076 |
| 2 | 1 | 63.1 | 64.8 | 16 / 35 | 4964 |
| 3 | 1 | 60.7 | 61.3 | 14 / 35 | 4392 |
| 4 | 1 | 63.8 | 71.1 | 14 / 35 | 4849 |
| 5 | 1 | 63.8 | 71.1 | 14 / 35 | 4412 |
| 6 | 1 | 67.5 | 82.2 | 20 / 35 | 5224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 93% |
| oog.melee.Corsair 1.0 | 32 | 53% |
| ahf.NanoAndrew .4 | 21 | 71% |
| sam.Samspin 1.0 | 11 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| EBBU.Sim2 1.02 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 23 | 20% | 48 |
| simonton.nano.MeleeSeed 1.8 | 20 | 18% | 48 |
| ahf.NanoAndrew .4 | 18 | 16% | 33 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 21 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 15 |
| sam.Samspin 1.0 | 7 | 6% | 17 |
| EBBU.Sim2 1.02 | 4 | 4% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.7 | 139 / 210 | 2.02 | 20.0% | 35013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.0% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 34 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.0% | 13 |
| fm.claire 1.7 | 5.7 | 8.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.3% | 4 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.0% | 3 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 6 |
| pa.Improved 1.0 | 9.3 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 19 / 35 | 5353 |
| 2 | 1 | 69.3 | 86.7 | 22 / 35 | 5823 |
| 3 | 1 | 71.6 | 92.7 | 26 / 35 | 6359 |
| 4 | 1 | 70.3 | 90.8 | 25 / 35 | 5733 |
| 5 | 1 | 70.0 | 88.3 | 23 / 35 | 6109 |
| 6 | 1 | 69.9 | 88.9 | 24 / 35 | 5636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 79% |
| oog.melee.CapuletDroid 1.1 | 40 | 90% |
| gh.nano.Grofvuil 0.2 | 17 | 100% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| winamp32.micro.MicroMacro 1.0 | 9 | 78% |
| sample.SpinBot 1.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 50% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 46% | 87 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 49 |
| gh.nano.Grofvuil 0.2 | 8 | 11% | 30 |
| fm.claire 1.7 | 8 | 11% | 8 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 10 |
| pa.Improved 1.0 | 3 | 4% | 4 |
| sample.SpinBot 1.0 | 3 | 4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 11 |
| kurios.DOSexe .9b | 0 | 0% | 5 |

## Melee bench: F07

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 84.8 | 101 / 210 | 2.37 | 19.0% | 36840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.0% | 101 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 45 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 12.9% | 20 |
| mz.MicroGodMelee 1 | 3.5 | 12.5% | 30 |
| DBall.Anarchy 0.1 | 5.5 | 8.3% | 8 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.4% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 4 |
| acogdev.alpha 0.2 | 8.2 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.3 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.9 | 16 / 35 | 6380 |
| 2 | 1 | 69.8 | 87.9 | 22 / 35 | 5977 |
| 3 | 1 | 68.2 | 82.5 | 16 / 35 | 6039 |
| 4 | 1 | 68.2 | 83.2 | 15 / 35 | 5997 |
| 5 | 1 | 69.2 | 86.0 | 17 / 35 | 6277 |
| 6 | 1 | 68.0 | 81.0 | 15 / 35 | 6170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 43 | 88% |
| mz.MicroGodMelee 1 | 41 | 59% |
| gh.micro.Gruweltje 0.7 | 36 | 53% |
| DBall.Anarchy 0.1 | 14 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |

Hadur died in 109 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 35% | 61 |
| gh.micro.Gruweltje 0.7 | 33 | 30% | 60 |
| spinnercat.micro.Tyger 0.1 | 20 | 18% | 51 |
| acogdev.alpha 0.2 | 7 | 6% | 8 |
| el.JumpShoot 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 14 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.2 | 113 / 210 | 3.59 | 16.7% | 31549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.7% | 113 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.1% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.4% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.6% | 7 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 9 |
| germ.TheMind .2 | 6.0 | 8.6% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.8% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.4% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.7 | 16 / 35 | 5074 |
| 2 | 1 | 66.4 | 74.3 | 22 / 35 | 5560 |
| 3 | 1 | 62.8 | 63.8 | 19 / 35 | 4943 |
| 4 | 1 | 64.1 | 69.5 | 17 / 35 | 5082 |
| 5 | 1 | 65.7 | 73.7 | 19 / 35 | 5062 |
| 6 | 1 | 67.0 | 73.3 | 20 / 35 | 5828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 90% |
| awesomeness.Elite 1.0 | 12 | 83% |
| stelo.UntouchableNano 1.3 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 44% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 38 |
| awesomeness.Elite 1.0 | 8 | 8% | 19 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 14 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| germ.TheMind .2 | 7 | 7% | 12 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.2 | 158 / 210 | 1.98 | 20.5% | 32226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 20.5% | 158 |
| rz.HawkOnFire 0.1 | 2.5 | 13.6% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 12.9% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 10.3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 2 |
| timmit.nano.TimDog 0.33 | 6.3 | 8.6% | 8 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 7.7% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 7.6% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 87.0 | 24 / 35 | 5213 |
| 2 | 1 | 72.1 | 94.6 | 29 / 35 | 5353 |
| 3 | 1 | 72.0 | 93.0 | 29 / 35 | 5548 |
| 4 | 1 | 69.9 | 81.9 | 23 / 35 | 5414 |
| 5 | 1 | 71.3 | 91.7 | 26 / 35 | 5370 |
| 6 | 1 | 70.6 | 86.7 | 27 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 94% |
| nz.jdc.nano.GridFu 1.0 | 40 | 100% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 63% |
| maribo.IotaCT 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 60% |

Hadur died in 52 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 27% | 70 |
| ratosh.Wesco 1.4 | 9 | 17% | 16 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 54 |
| stelo.PatternRobot 1.0 | 7 | 13% | 19 |
| timmit.nano.TimDog 0.33 | 6 | 12% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 9 |
| maribo.IotaCT 1.1 | 3 | 6% | 15 |
| spinnercat.Omen 1.0 | 2 | 4% | 5 |

## Melee bench: F10

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.3 | 181 / 210 | 1.51 | 22.3% | 41630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 22.3% | 181 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.1% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 5 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 5.3 | 9.1% | 3 |
| zyx.micro.Ant 1.1 | 6.0 | 8.6% | 2 |
| sanja.First 0.1 | 6.3 | 7.9% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.0% | 0 |
| sample.RamFire 1.0 | 9.3 | 5.8% | 0 |
| cvt.Firsty 1.0 | 9.3 | 6.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 95.6 | 30 / 35 | 6883 |
| 2 | 1 | 73.1 | 97.1 | 32 / 35 | 6892 |
| 3 | 1 | 72.0 | 92.7 | 29 / 35 | 6834 |
| 4 | 1 | 72.0 | 90.8 | 29 / 35 | 7040 |
| 5 | 1 | 72.1 | 94.0 | 30 / 35 | 6682 |
| 6 | 1 | 73.2 | 95.6 | 31 / 35 | 7299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 87% |
| baal.nano.N 1.42 | 33 | 97% |
| sanja.First 0.1 | 29 | 100% |
| cvt.Firsty 1.0 | 26 | 88% |
| zyx.micro.Ant 1.1 | 21 | 95% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 83% |
| sample.RamFire 1.0 | 5 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 6 | 21% | 64 |
| sample.RamFire 1.0 | 5 | 17% | 7 |
| cvt.Firsty 1.0 | 4 | 14% | 19 |
| zyx.micro.Ant 1.1 | 3 | 10% | 29 |
| baal.nano.N 1.42 | 3 | 10% | 29 |
| sanja.First 0.1 | 2 | 7% | 27 |
| squidM.TentalceMeleeNano 1.1 | 2 | 7% | 14 |
| Grystrion.TrackerWO 1.0 | 2 | 7% | 13 |
| amk.Punbot.Punbot 0.01 | 2 | 7% | 4 |

## Melee bench: F11

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 64.9 | 74 / 210 | 4.16 | 14.9% | 31298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.3 | 14.9% | 74 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 73 |
| cs.Wren 1.0 | 2.8 | 12.8% | 20 |
| js.PinBall 1.6 | 4.7 | 10.9% | 14 |
| mz.Cork 0.1 | 5.0 | 10.7% | 16 |
| joe.ADinosaur 1.0 | 5.3 | 9.9% | 5 |
| evd.X1 0.01 | 7.2 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 60.3 | 12 / 35 | 4901 |
| 2 | 2 | 62.4 | 63.5 | 13 / 35 | 5276 |
| 3 | 1 | 63.9 | 71.7 | 14 / 35 | 5090 |
| 4 | 1 | 60.7 | 62.2 | 8 / 35 | 5001 |
| 5 | 1 | 61.7 | 61.6 | 13 / 35 | 5556 |
| 6 | 1 | 64.3 | 70.2 | 14 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 43 | 58% |
| cs.Wren 1.0 | 25 | 88% |
| mz.Cork 0.1 | 13 | 85% |
| donjezza.Jezza 1.0 | 6 | 100% |
| js.PinBall 1.6 | 5 | 80% |
| joe.ADinosaur 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 36% | 82 |
| cs.Wren 1.0 | 20 | 15% | 34 |
| js.PinBall 1.6 | 16 | 12% | 23 |
| evd.X1 0.01 | 16 | 12% | 17 |
| mz.Cork 0.1 | 12 | 9% | 22 |
| joe.ADinosaur 1.0 | 12 | 9% | 16 |
| PSW.Relentless 0.1 | 10 | 7% | 9 |
| jsal.Jsalbot 1.0 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.1 | 144 / 210 | 2.16 | 19.9% | 31021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.9% | 144 |
| ntc.Opposite 1.5 | 3.5 | 10.8% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.7% | 8 |
| myl.nano.Graviton 1.10 | 3.7 | 11.2% | 15 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 10.9% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.8% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 11 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 2 |
| donjezza.Muncho 1.0 | 9.0 | 5.6% | 3 |
| pbg.R2D2 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 96.8 | 29 / 35 | 5501 |
| 2 | 1 | 69.2 | 86.7 | 23 / 35 | 5092 |
| 3 | 1 | 70.4 | 90.5 | 27 / 35 | 5062 |
| 4 | 1 | 69.2 | 87.6 | 20 / 35 | 4978 |
| 5 | 1 | 68.3 | 81.9 | 22 / 35 | 5376 |
| 6 | 1 | 67.6 | 79.4 | 23 / 35 | 5012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 84% |
| myl.nano.Graviton 1.10 | 38 | 97% |
| lrem.micro.SpikeSoldier 0.4 | 19 | 89% |
| donjezza.Muncho 1.0 | 16 | 100% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 13 | 46% |
| ntc.Opposite 1.5 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 67 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 24% | 46 |
| myl.nano.Graviton 1.10 | 13 | 19% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 16% | 27 |
| disan.Chair 2.2.0 | 9 | 13% | 19 |
| pfvicm.Sobieski 7.2.3b | 8 | 12% | 14 |
| ntc.Opposite 1.5 | 7 | 10% | 24 |
| pbg.R2D2 1.0 | 2 | 3% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |
| DBall.NUKE 0.1 | 0 | 0% | 14 |

## Melee bench: F13

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.2 | 92 / 210 | 3.05 | 16.8% | 27579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.8% | 92 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.4% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.1% | 33 |
| oog.melee.Capulet 1.2 | 3.8 | 12.4% | 29 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 9 |
| ejb.Polaris 1.0.1 | 6.2 | 10.4% | 10 |
| stelo.MirrorNano 1.3 | 6.8 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.0 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.4 | 14 / 35 | 4533 |
| 2 | 1 | 67.2 | 79.4 | 19 / 35 | 4965 |
| 3 | 1 | 62.2 | 64.8 | 12 / 35 | 4005 |
| 4 | 1 | 66.2 | 79.7 | 14 / 35 | 4651 |
| 5 | 1 | 66.9 | 79.7 | 15 / 35 | 4689 |
| 6 | 1 | 67.2 | 80.3 | 18 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 54% |
| oog.melee.Capulet 1.2 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| yagami.Tidus 0.11 | 18 | 89% |
| ejb.Polaris 1.0.1 | 11 | 82% |
| stelo.MirrorNano 1.3 | 3 | 67% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 29% | 58 |
| oog.melee.Capulet 1.2 | 33 | 28% | 50 |
| yagami.Tidus 0.11 | 19 | 16% | 38 |
| ejb.Polaris 1.0.1 | 11 | 9% | 24 |
| kawigi.micro.Shiz 1.1 | 9 | 8% | 26 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.5 | 123 / 210 | 3.03 | 17.3% | 27898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 17.3% | 123 |
| bzdp.Pansy 2.1 | 2.7 | 12.4% | 20 |
| wee.Gem 1.8.4 | 3.2 | 11.4% | 23 |
| wompi.Quokka 1.6 | 4.3 | 11.2% | 12 |
| ratosh.Nobo 0.21 | 4.8 | 10.9% | 12 |
| bayen.UbaMicro 1.4 | 5.7 | 9.4% | 6 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 2 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 77.1 | 19 / 35 | 4457 |
| 2 | 1 | 66.3 | 78.7 | 18 / 35 | 4780 |
| 3 | 1 | 62.7 | 64.4 | 17 / 35 | 4800 |
| 4 | 1 | 66.3 | 79.4 | 22 / 35 | 4449 |
| 5 | 1 | 66.8 | 80.6 | 24 / 35 | 4564 |
| 6 | 1 | 68.5 | 84.4 | 23 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 93% |
| wee.Gem 1.8.4 | 31 | 94% |
| wompi.Quokka 1.6 | 19 | 84% |
| ratosh.Nobo 0.21 | 19 | 79% |
| bayen.UbaMicro 1.4 | 12 | 83% |
| m3thos.Eva00 1.1 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 18 | 21% | 60 |
| wompi.Quokka 1.6 | 14 | 16% | 30 |
| ratosh.Nobo 0.21 | 13 | 15% | 29 |
| wee.Gem 1.8.4 | 9 | 10% | 40 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 9% | 10 |
| maribo.FollowFire 1 | 8 | 9% | 9 |
| bayen.UbaMicro 1.4 | 7 | 8% | 16 |
| m3thos.Eva00 1.1 | 5 | 6% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 5 |

## Melee bench: F15

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 89.9 | 129 / 210 | 1.90 | 21.9% | 49018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.9% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 64 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 11 |
| ayk.WallHugger 1.0 | 4.2 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.2% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.3% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 87.0 | 17 / 35 | 8204 |
| 2 | 1 | 74.2 | 92.4 | 24 / 35 | 8715 |
| 3 | 1 | 73.7 | 92.4 | 23 / 35 | 8018 |
| 4 | 1 | 73.2 | 89.8 | 25 / 35 | 8123 |
| 5 | 1 | 73.1 | 89.5 | 22 / 35 | 8007 |
| 6 | 1 | 72.2 | 88.6 | 18 / 35 | 7951 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 120 | 71% |
| mz.NanoGod 2.02 | 14 | 71% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| ayk.WallHugger 1.0 | 12 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 56% | 140 |
| mz.NanoGod 2.02 | 20 | 25% | 31 |
| exauge.GateKeeper 1.1.121g | 8 | 10% | 16 |
| stuff.Vlad 0.1 | 4 | 5% | 8 |
| ayk.WallHugger 1.0 | 2 | 2% | 8 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |

## Melee bench: F16

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.3 | 111 / 210 | 3.58 | 16.9% | 30329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 16.9% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.8% | 20 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.5% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 10.8% | 27 |
| bvh.micro.Freya 0.3 | 4.3 | 11.1% | 17 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 2 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 1 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 9.2 | 6.1% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 72.1 | 19 / 35 | 5024 |
| 2 | 1 | 63.7 | 65.7 | 15 / 35 | 5234 |
| 3 | 1 | 67.5 | 78.7 | 22 / 35 | 5292 |
| 4 | 1 | 61.7 | 60.0 | 15 / 35 | 4731 |
| 5 | 1 | 62.9 | 66.0 | 16 / 35 | 4563 |
| 6 | 1 | 69.2 | 85.4 | 24 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 95% |
| dummy.micro.Sparrow 2.5 | 26 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 81% |
| bvh.micro.Freya 0.3 | 16 | 75% |
| stelo.MirrorMicro 1.0 | 11 | 91% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 21 | 21% | 20 |
| bvh.micro.Freya 0.3 | 16 | 16% | 28 |
| dummy.micro.Sparrow 2.5 | 15 | 15% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 36 |
| conscience.Electron 1.3g | 12 | 12% | 15 |
| voidious.micro.BlitzBat 1.05 | 10 | 10% | 48 |
| dl.BetterWalls 1.0 | 8 | 8% | 9 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 18 |

## Melee bench: F17

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.9 | 160 / 210 | 2.09 | 21.6% | 41865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 21.6% | 160 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 20 |
| sul.Lunar 1.1 | 3.3 | 10.9% | 10 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.0% | 5 |
| dsw.StaticD 1.0 | 5.5 | 8.9% | 8 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.1% | 2 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.8% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.3% | 3 |
| sample.Corners 1.0 | 8.7 | 5.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 82.9 | 24 / 35 | 6633 |
| 2 | 1 | 72.5 | 91.4 | 28 / 35 | 7192 |
| 3 | 1 | 72.4 | 87.3 | 27 / 35 | 7360 |
| 4 | 1 | 72.7 | 90.8 | 30 / 35 | 7111 |
| 5 | 1 | 70.7 | 81.6 | 25 / 35 | 6847 |
| 6 | 1 | 72.1 | 93.3 | 26 / 35 | 6722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 90% |
| sul.Lunar 1.1 | 41 | 95% |
| supersample.SuperBoxBot 1.0 | 24 | 100% |
| dsw.StaticD 1.0 | 15 | 60% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| sample.Corners 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 11 | 22% | 56 |
| dsw.StaticD 1.0 | 10 | 20% | 23 |
| sul.Lunar 1.1 | 9 | 18% | 48 |
| supersample.SuperBoxBot 1.0 | 7 | 14% | 29 |
| mme.NikeEnhanced 2.0 | 6 | 12% | 21 |
| sample.Corners 1.0 | 4 | 8% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 11 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWAD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.4 | 129 / 210 | 2.40 | 19.8% | 40448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAD 0.1 | 1.0 | 19.8% | 129 |
| radnor.DoctorBob 1.42 | 2.0 | 13.4% | 28 |
| mld.Wisdom 1.0 | 3.3 | 11.8% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 15 |
| amz.NanoClone 1.41 | 5.5 | 9.3% | 7 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.8% | 4 |
| GarmBox.Oranges 1.0 | 6.8 | 7.5% | 1 |
| sample.Walls 1.0 | 7.7 | 7.3% | 5 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 3 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 19 / 35 | 6390 |
| 2 | 1 | 69.9 | 86.3 | 20 / 35 | 6608 |
| 3 | 1 | 69.9 | 82.9 | 22 / 35 | 6997 |
| 4 | 1 | 66.4 | 76.5 | 14 / 35 | 6025 |
| 5 | 1 | 71.5 | 88.3 | 29 / 35 | 7154 |
| 6 | 1 | 71.7 | 90.5 | 25 / 35 | 7274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 58 | 91% |
| radnor.DoctorBob 1.42 | 35 | 77% |
| mld.Wisdom 1.0 | 22 | 64% |
| sample.Walls 1.0 | 9 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 67% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 27% | 36 |
| radnor.DoctorBob 1.42 | 19 | 23% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 20% | 63 |
| KiraNL.Chupacabra 0.4 | 10 | 12% | 27 |
| amz.NanoClone 1.41 | 8 | 10% | 13 |
| sample.Walls 1.0 | 3 | 4% | 6 |
| GarmBox.Oranges 1.0 | 3 | 4% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 3 |

