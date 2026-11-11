# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 72 over 6 battles (12.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 92.0 | 160 / 210 | 1.72 | 22.2% | 44212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.2% | 160 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 11 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 17 |
| mld.Infinity 2.2 | 4.2 | 12.5% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 3 |
| sample.Walls 1.0 | 6.5 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 5 |
| GarmBox.Oranges 1.0 | 7.3 | 6.1% | 0 |
| sample.Target 1.0 | 9.5 | 3.8% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 94.9 | 27 / 35 | 7823 |
| 2 | 1 | 72.5 | 88.6 | 26 / 35 | 6914 |
| 3 | 1 | 73.4 | 92.4 | 26 / 35 | 7614 |
| 4 | 1 | 73.0 | 90.8 | 30 / 35 | 7420 |
| 5 | 1 | 71.8 | 89.5 | 24 / 35 | 6459 |
| 6 | 1 | 74.4 | 95.9 | 27 / 35 | 7982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 96% |
| mld.Infinity 2.2 | 52 | 88% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| jangs.ns51 1.0 | 9 | 67% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Target 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 37% | 73 |
| mz.AntiGrav 1.0 | 13 | 25% | 92 |
| mld.Infinity 2.2 | 7 | 14% | 14 |
| jangs.ns51 1.0 | 5 | 10% | 12 |
| amz.NanoClone 1.41 | 4 | 8% | 9 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| sample.Target 1.0 | 1 | 2% | 0 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 142 / 210 | 2.33 | 18.9% | 31238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.9% | 142 |
| mld.DustBunny 3.8 | 2.5 | 14.7% | 21 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.6% | 38 |
| maribo.melee.BMV 0.1 | 4.2 | 10.0% | 1 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 7.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.0% | 6 |
| bzdp.BoxCar 2.0 | 7.7 | 7.0% | 2 |
| fullsail.SweetTea 1.1 | 7.8 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.8 | 26 / 35 | 5641 |
| 2 | 1 | 69.6 | 90.8 | 26 / 35 | 5118 |
| 3 | 1 | 68.5 | 84.8 | 26 / 35 | 4976 |
| 4 | 1 | 67.1 | 78.4 | 22 / 35 | 4919 |
| 5 | 1 | 69.4 | 90.2 | 25 / 35 | 4926 |
| 6 | 1 | 67.9 | 77.1 | 17 / 35 | 5658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 79 | 86% |
| mld.DustBunny 3.8 | 62 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 33% | 97 |
| mld.DustBunny 3.8 | 18 | 26% | 67 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 13% | 14 |
| zyx.nano.Ant 1.1 | 4 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 6% | 8 |
| bzdp.BoxCar 2.0 | 3 | 4% | 5 |
| maribo.melee.BMV 0.1 | 3 | 4% | 5 |
| fullsail.SweetTea 1.1 | 3 | 4% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 81.6 | 128 / 210 | 2.66 | 19.6% | 36392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.6% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 41 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 22 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 2 |
| cb.nano.Insomnia 1.0 | 6.0 | 8.7% | 5 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.5% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.7% | 2 |
| sample.Fire 1.0 | 9.5 | 4.9% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 81.9 | 24 / 35 | 6232 |
| 2 | 1 | 69.1 | 79.4 | 23 / 35 | 6209 |
| 3 | 1 | 68.8 | 81.6 | 20 / 35 | 5554 |
| 4 | 1 | 69.0 | 78.1 | 19 / 35 | 6201 |
| 5 | 1 | 69.9 | 84.8 | 19 / 35 | 5974 |
| 6 | 1 | 70.0 | 83.8 | 23 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 74 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 78% |
| cb.nano.Insomnia 1.0 | 16 | 88% |
| myl.nano.KomoriNinja 1.1 | 15 | 100% |
| sp.Nanos.Ember 1.1 | 8 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 50% |

Hadur died in 82 of 210 rounds, at a mean tick of 593. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 28% | 98 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 22% | 29 |
| fm.mammillarias 1.3 | 9 | 11% | 17 |
| cb.nano.Insomnia 1.0 | 9 | 11% | 10 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 25 |
| sample.Fire 1.0 | 5 | 6% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 7 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 14 |
| sample.Tracker 1.0 | 2 | 2% | 1 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.9 | 155 / 210 | 2.27 | 20.6% | 38654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.6% | 155 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.2% | 12 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.0% | 9 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.1% | 14 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 2 |
| yk.JahMicro 1.0 | 6.7 | 8.0% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.8 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 80.6 | 22 / 35 | 5989 |
| 2 | 1 | 69.5 | 84.1 | 25 / 35 | 5931 |
| 3 | 1 | 71.3 | 87.9 | 27 / 35 | 6747 |
| 4 | 1 | 72.2 | 90.5 | 27 / 35 | 7118 |
| 5 | 1 | 69.8 | 82.9 | 25 / 35 | 6421 |
| 6 | 1 | 71.5 | 89.5 | 29 / 35 | 6448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 95% |
| stelo.SoJNanoMelee 1.1 | 31 | 94% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| tj.zombie1n 1.0.1 | 18 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 45% | 96 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 35 |
| tj.zombie1n 1.0.1 | 5 | 9% | 9 |
| repositorio.NanoStep 1.0 | 4 | 7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 9 |
| tvv.micro.Antares 1.1.1 | 3 | 5% | 20 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 13 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 73.9 | 115 / 210 | 3.35 | 17.1% | 30462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.1% | 115 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.8% | 18 |
| ahf.NanoAndrew .4 | 3.7 | 11.1% | 23 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 13 |
| EBBU.Sim2 1.02 | 6.2 | 9.4% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.6% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 72.4 | 21 / 35 | 4959 |
| 2 | 1 | 64.8 | 69.5 | 15 / 35 | 5285 |
| 3 | 1 | 69.6 | 89.8 | 28 / 35 | 4952 |
| 4 | 1 | 66.1 | 72.7 | 18 / 35 | 5596 |
| 5 | 1 | 62.6 | 65.7 | 15 / 35 | 4794 |
| 6 | 1 | 64.8 | 73.0 | 18 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 47 | 89% |
| oog.melee.Corsair 1.0 | 39 | 95% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| EBBU.Sim2 1.02 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 18 | 19% | 55 |
| zyx.nano.BacillusComma 1.0 | 15 | 16% | 17 |
| robar.nano.Assertive_Melee 0.2 | 14 | 15% | 21 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 15% | 15 |
| EBBU.Sim2 1.02 | 9 | 9% | 15 |
| oog.melee.Corsair 1.0 | 8 | 8% | 43 |
| ahf.NanoAndrew .4 | 8 | 8% | 26 |
| sam.Samspin 1.0 | 6 | 6% | 12 |
| sample.TrackFire 1.0 | 3 | 3% | 4 |

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 54 over 6 battles (9.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.6 | 164 / 210 | 1.84 | 20.6% | 34090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.6% | 164 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.8% | 20 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.2% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.1% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.7% | 5 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.3% | 1 |
| fm.claire 1.7 | 6.2 | 8.3% | 2 |
| sample.SpinBot 1.0 | 8.7 | 6.0% | 1 |
| pa.Improved 1.0 | 8.7 | 6.0% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 83.2 | 25 / 35 | 5297 |
| 2 | 1 | 72.4 | 96.5 | 30 / 35 | 5937 |
| 3 | 1 | 71.7 | 94.3 | 28 / 35 | 6100 |
| 4 | 1 | 69.5 | 86.7 | 25 / 35 | 5216 |
| 5 | 1 | 71.0 | 92.4 | 29 / 35 | 5709 |
| 6 | 1 | 70.8 | 90.8 | 27 / 35 | 5831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 93% |
| oog.melee.CapuletDroid 1.1 | 42 | 93% |
| gh.nano.Grofvuil 0.2 | 22 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 14 | 30% | 26 |
| d414.nano.Quantum 1.0.0 | 13 | 28% | 92 |
| gh.nano.Grofvuil 0.2 | 5 | 11% | 35 |
| winamp32.micro.MicroMacro 1.0 | 5 | 11% | 14 |
| sample.SpinBot 1.0 | 4 | 9% | 11 |
| arthord.NanoSatanMelee Beta | 2 | 4% | 14 |
| fm.claire 1.7 | 2 | 4% | 4 |
| kurios.DOSexe .9b | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 6 |

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 58 over 6 battles (9.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.1 | 122 / 210 | 2.25 | 18.8% | 32204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.8% | 122 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.8% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 11 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.5% | 1 |
| DBall.Anarchy 0.1 | 6.0 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.2 | 6.9% | 5 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 1 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.5 | 21 / 35 | 5569 |
| 2 | 1 | 69.4 | 88.6 | 20 / 35 | 5519 |
| 3 | 1 | 68.2 | 84.1 | 23 / 35 | 4934 |
| 4 | 1 | 69.2 | 89.5 | 20 / 35 | 5453 |
| 5 | 1 | 68.6 | 84.1 | 19 / 35 | 5396 |
| 6 | 1 | 67.3 | 79.7 | 19 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 54 | 69% |
| spinnercat.micro.Tyger 0.1 | 53 | 62% |
| mz.MicroGodMelee 1 | 45 | 91% |
| el.JumpShoot 0.2 | 8 | 88% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 34 | 39% | 59 |
| gh.micro.Gruweltje 0.7 | 31 | 35% | 75 |
| mz.MicroGodMelee 1 | 13 | 15% | 54 |
| acogdev.alpha 0.2 | 3 | 3% | 3 |
| el.JumpShoot 0.2 | 2 | 2% | 7 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.5 | 111 / 210 | 3.11 | 17.4% | 31840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.4% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.9% | 50 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 4 |
| germ.TheMind .2 | 5.0 | 9.4% | 4 |
| awesomeness.Elite 1.0 | 5.8 | 8.6% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 1 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.2% | 7 |
| sample.Crazy 1.0 | 8.5 | 6.6% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 75.9 | 19 / 35 | 5414 |
| 2 | 1 | 66.6 | 77.5 | 20 / 35 | 5304 |
| 3 | 1 | 63.9 | 70.2 | 15 / 35 | 4772 |
| 4 | 1 | 69.1 | 84.4 | 22 / 35 | 5527 |
| 5 | 1 | 66.6 | 76.5 | 18 / 35 | 5463 |
| 6 | 1 | 65.9 | 74.6 | 17 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 91 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 83% |
| qualidafial.MajorDick 1.0.1 | 13 | 92% |
| sample.Crazy 1.0 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| germ.TheMind .2 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 51 | 52% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 33 |
| germ.TheMind .2 | 11 | 11% | 21 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 4 | 4% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 9 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.4 | 161 / 210 | 2.04 | 20.1% | 29893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 161 |
| rz.HawkOnFire 0.1 | 2.0 | 14.6% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 9 |
| maribo.IotaCT 1.1 | 4.3 | 10.3% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.4% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.2% | 4 |
| ratosh.Wesco 1.4 | 7.0 | 8.2% | 5 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 8 |
| spinnercat.Omen 1.0 | 8.8 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.3 | 27 / 35 | 4803 |
| 2 | 1 | 72.3 | 95.2 | 31 / 35 | 5114 |
| 3 | 1 | 69.3 | 82.9 | 26 / 35 | 4740 |
| 4 | 1 | 70.3 | 89.5 | 28 / 35 | 4888 |
| 5 | 1 | 70.2 | 86.7 | 23 / 35 | 5079 |
| 6 | 1 | 71.1 | 88.9 | 26 / 35 | 5269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 93 | 96% |
| nz.jdc.nano.GridFu 1.0 | 34 | 97% |
| stelo.PatternRobot 1.0 | 12 | 75% |
| maribo.IotaCT 1.1 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 100% |
| ratosh.Wesco 1.4 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 24% | 78 |
| nz.jdc.nano.GridFu 1.0 | 11 | 22% | 59 |
| stelo.PatternRobot 1.0 | 9 | 18% | 14 |
| timmit.nano.TimDog 0.33 | 6 | 12% | 18 |
| maribo.IotaCT 1.1 | 5 | 10% | 18 |
| ratosh.Wesco 1.4 | 5 | 10% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.0 | 179 / 210 | 1.63 | 22.1% | 40379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.1% | 179 |
| baal.nano.N 1.42 | 2.5 | 11.6% | 4 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.4% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.5% | 3 |
| sanja.First 0.1 | 6.0 | 8.6% | 4 |
| amk.Punbot.Punbot 0.01 | 6.3 | 8.2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 7.9% | 0 |
| zyx.micro.Ant 1.1 | 6.8 | 8.6% | 8 |
| cvt.Firsty 1.0 | 8.7 | 7.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 92.7 | 30 / 35 | 6673 |
| 2 | 1 | 71.8 | 88.6 | 29 / 35 | 6876 |
| 3 | 1 | 71.7 | 91.4 | 29 / 35 | 6673 |
| 4 | 1 | 73.1 | 97.5 | 31 / 35 | 6950 |
| 5 | 1 | 72.1 | 93.0 | 30 / 35 | 6686 |
| 6 | 1 | 72.2 | 94.6 | 30 / 35 | 6521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 39 | 100% |
| tvv.nano.Polaris 1.2 | 36 | 97% |
| sanja.First 0.1 | 29 | 97% |
| cvt.Firsty 1.0 | 26 | 100% |
| amk.Punbot.Punbot 0.01 | 20 | 90% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 7 | 23% | 52 |
| Grystrion.TrackerWO 1.0 | 6 | 19% | 18 |
| zyx.micro.Ant 1.1 | 5 | 16% | 30 |
| amk.Punbot.Punbot 0.01 | 5 | 16% | 8 |
| sanja.First 0.1 | 4 | 13% | 30 |
| sample.RamFire 1.0 | 2 | 6% | 5 |
| baal.nano.N 1.42 | 1 | 3% | 32 |
| cvt.Firsty 1.0 | 1 | 3% | 27 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 45 over 6 battles (7.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.7 | 78 / 210 | 3.55 | 16.0% | 32125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 16.0% | 78 |
| kc.micro.Figment 1.0 | 1.8 | 15.6% | 78 |
| mz.Cork 0.1 | 3.5 | 11.6% | 14 |
| cs.Wren 1.0 | 3.8 | 11.6% | 22 |
| js.PinBall 1.6 | 4.7 | 10.5% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.4% | 1 |
| evd.X1 0.01 | 7.0 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 74.9 | 16 / 35 | 5956 |
| 2 | 1 | 63.5 | 68.3 | 15 / 35 | 5272 |
| 3 | 1 | 67.0 | 77.1 | 16 / 35 | 6114 |
| 4 | 2 | 63.8 | 74.0 | 8 / 35 | 4917 |
| 5 | 2 | 60.8 | 64.4 | 10 / 35 | 4805 |
| 6 | 1 | 63.4 | 71.4 | 13 / 35 | 5061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 76 | 37% |
| mz.Cork 0.1 | 15 | 87% |
| cs.Wren 1.0 | 14 | 93% |
| js.PinBall 1.6 | 10 | 100% |
| jsal.Jsalbot 1.0 | 8 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |

Hadur died in 132 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 70 | 53% | 99 |
| evd.X1 0.01 | 19 | 14% | 21 |
| js.PinBall 1.6 | 11 | 8% | 21 |
| PSW.Relentless 0.1 | 10 | 8% | 9 |
| cs.Wren 1.0 | 7 | 5% | 24 |
| mz.Cork 0.1 | 6 | 5% | 14 |
| joe.ADinosaur 1.0 | 6 | 5% | 10 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.1 | 139 / 210 | 2.34 | 19.3% | 29505 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.3% | 139 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.8% | 7 |
| myl.nano.Graviton 1.10 | 3.5 | 11.5% | 12 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 15 |
| pfvicm.Sobieski 7.2.3b | 6.5 | 8.6% | 3 |
| disan.Chair 2.2.0 | 6.7 | 8.4% | 6 |
| DBall.NUKE 0.1 | 7.0 | 8.3% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 12 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 23 / 35 | 4821 |
| 2 | 1 | 66.7 | 79.7 | 20 / 35 | 4676 |
| 3 | 1 | 68.2 | 83.8 | 22 / 35 | 4939 |
| 4 | 1 | 69.5 | 86.0 | 26 / 35 | 4930 |
| 5 | 1 | 70.1 | 90.5 | 27 / 35 | 4965 |
| 6 | 1 | 68.8 | 85.7 | 21 / 35 | 5174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 88% |
| stelo.AreaTargetingBot 1.1 | 26 | 65% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 100% |
| disan.Chair 2.2.0 | 21 | 90% |
| ntc.Opposite 1.5 | 17 | 88% |
| donjezza.Muncho 1.0 | 15 | 80% |
| DBall.NUKE 0.1 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 22% | 37 |
| myl.nano.Graviton 1.10 | 14 | 19% | 52 |
| ntc.Opposite 1.5 | 9 | 12% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 23 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 15 |
| donjezza.Muncho 1.0 | 6 | 8% | 15 |
| disan.Chair 2.2.0 | 5 | 7% | 19 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 88 over 6 battles (14.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 75.0 | 109 / 210 | 3.25 | 16.3% | 25270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 16.3% | 109 |
| oog.melee.Capulet 1.2 | 2.2 | 14.7% | 44 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.8% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 19 |
| yagami.Tidus 0.11 | 4.8 | 11.7% | 7 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 1 |
| stelo.MirrorNano 1.3 | 7.2 | 7.2% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 71.7 | 17 / 35 | 4084 |
| 2 | 2 | 65.4 | 74.9 | 19 / 35 | 4057 |
| 3 | 2 | 64.9 | 72.1 | 16 / 35 | 4287 |
| 4 | 1 | 66.8 | 76.5 | 20 / 35 | 4511 |
| 5 | 1 | 65.0 | 75.2 | 17 / 35 | 4070 |
| 6 | 1 | 66.7 | 79.4 | 20 / 35 | 4261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 84% |
| kawigi.micro.Shiz 1.1 | 37 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 96% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 45% | 85 |
| kawigi.micro.Shiz 1.1 | 17 | 17% | 38 |
| yagami.Tidus 0.11 | 14 | 14% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 11% | 37 |
| kurios.DOSexe .9a | 8 | 8% | 8 |
| ejb.Polaris 1.0.1 | 3 | 3% | 10 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 52 over 6 battles (8.7 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.5 | 141 / 210 | 2.85 | 17.6% | 26086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.6% | 141 |
| bzdp.Pansy 2.1 | 2.5 | 12.3% | 14 |
| wee.Gem 1.8.4 | 3.3 | 11.6% | 22 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 13 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 5.7 | 10.2% | 9 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 80.6 | 25 / 35 | 4597 |
| 2 | 1 | 68.8 | 88.9 | 27 / 35 | 4774 |
| 3 | 1 | 67.7 | 83.8 | 25 / 35 | 4394 |
| 4 | 1 | 65.9 | 78.7 | 23 / 35 | 4226 |
| 5 | 1 | 67.2 | 82.9 | 25 / 35 | 4247 |
| 6 | 1 | 60.5 | 61.9 | 16 / 35 | 3848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 98% |
| wee.Gem 1.8.4 | 34 | 100% |
| m3thos.Eva00 1.1 | 19 | 89% |
| wompi.Quokka 1.6 | 19 | 100% |
| ratosh.Nobo 0.21 | 15 | 87% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 12 | 17% | 26 |
| maribo.FollowFire 1 | 10 | 14% | 12 |
| bzdp.Pansy 2.1 | 9 | 13% | 51 |
| wee.Gem 1.8.4 | 9 | 13% | 45 |
| m3thos.Eva00 1.1 | 7 | 10% | 25 |
| bayen.UbaMicro 1.4 | 7 | 10% | 16 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 7 |
| wompi.Quokka 1.6 | 4 | 6% | 12 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 87.1 | 82 / 210 | 2.16 | 21.1% | 50501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 21.1% | 82 |
| wompi.Wallaby 5.1 | 1.8 | 19.5% | 112 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 13 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.8% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 0 |
| ayk.WallHugger 1.0 | 5.5 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 91.1 | 15 / 35 | 8817 |
| 2 | 1 | 73.7 | 89.8 | 13 / 35 | 8966 |
| 3 | 2 | 71.1 | 84.4 | 14 / 35 | 7825 |
| 4 | 1 | 71.6 | 81.9 | 12 / 35 | 8283 |
| 5 | 1 | 72.2 | 85.4 | 13 / 35 | 8252 |
| 6 | 1 | 72.8 | 90.2 | 15 / 35 | 8358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 134 | 38% |
| exauge.GateKeeper 1.1.121g | 13 | 92% |
| mz.NanoGod 2.02 | 13 | 54% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 95 | 74% | 151 |
| mz.NanoGod 2.02 | 18 | 14% | 32 |
| ayk.WallHugger 1.0 | 6 | 5% | 9 |
| exauge.GateKeeper 1.1.121g | 5 | 4% | 10 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 75.9 | 110 / 210 | 3.17 | 17.2% | 29063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.2% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.3% | 32 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 25 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.7% | 13 |
| stelo.MirrorMicro 1.0 | 5.8 | 8.9% | 5 |
| conscience.Electron 1.3g | 6.8 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.3 | 19 / 35 | 4834 |
| 2 | 1 | 64.6 | 73.7 | 17 / 35 | 4255 |
| 3 | 1 | 68.1 | 81.6 | 22 / 35 | 5515 |
| 4 | 1 | 68.4 | 85.7 | 20 / 35 | 5292 |
| 5 | 1 | 61.3 | 61.9 | 14 / 35 | 4460 |
| 6 | 1 | 65.1 | 72.4 | 18 / 35 | 4707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 52 | 67% |
| dummy.micro.Sparrow 2.5 | 33 | 82% |
| bvh.micro.Freya 0.3 | 26 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 87% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 31% | 65 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 44 |
| conscience.Electron 1.3g | 12 | 12% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 10% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 33 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 12 |
| bvh.micro.Freya 0.3 | 5 | 5% | 15 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 86.6 | 159 / 210 | 2.21 | 21.3% | 41755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.3% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 19 |
| sul.Lunar 1.1 | 3.3 | 11.2% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.1% | 6 |
| dsw.StaticD 1.0 | 5.3 | 9.0% | 4 |
| mme.NikeEnhanced 2.0 | 5.5 | 9.2% | 4 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.6% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 3 |
| sample.Corners 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 83.5 | 28 / 35 | 7207 |
| 2 | 1 | 71.8 | 87.6 | 27 / 35 | 6969 |
| 3 | 1 | 72.1 | 87.9 | 26 / 35 | 7343 |
| 4 | 1 | 71.2 | 87.6 | 25 / 35 | 6569 |
| 5 | 1 | 70.8 | 83.2 | 24 / 35 | 6797 |
| 6 | 1 | 72.1 | 89.5 | 29 / 35 | 6870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 57 | 95% |
| supersample.SuperBoxBot 1.0 | 35 | 94% |
| sul.Lunar 1.1 | 33 | 97% |
| dsw.StaticD 1.0 | 12 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 18 | 35% | 65 |
| supersample.SuperBoxBot 1.0 | 16 | 31% | 41 |
| mme.NikeEnhanced 2.0 | 6 | 12% | 16 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 11 |
| sul.Lunar 1.1 | 2 | 4% | 43 |
| dsw.StaticD 1.0 | 2 | 4% | 22 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 3 |
| sample.Corners 1.0 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 79.0 | 122 / 210 | 2.89 | 18.6% | 38442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.6% | 122 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 31 |
| mld.Wisdom 1.0 | 3.0 | 12.0% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.3% | 20 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.2% | 4 |
| amz.NanoClone 1.41 | 5.8 | 9.4% | 6 |
| sample.Walls 1.0 | 7.2 | 7.5% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.3 | 6.8% | 2 |
| sample.Target 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 77.5 | 18 / 35 | 6344 |
| 2 | 1 | 71.1 | 88.6 | 26 / 35 | 6976 |
| 3 | 1 | 68.7 | 81.9 | 24 / 35 | 6246 |
| 4 | 1 | 67.3 | 77.5 | 19 / 35 | 6247 |
| 5 | 1 | 67.0 | 74.3 | 19 / 35 | 6363 |
| 6 | 1 | 66.2 | 74.6 | 16 / 35 | 6266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 82% |
| radnor.DoctorBob 1.42 | 32 | 81% |
| mld.Wisdom 1.0 | 18 | 100% |
| amz.NanoClone 1.41 | 11 | 100% |
| KiraNL.Chupacabra 0.4 | 11 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |

Hadur died in 88 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 24% | 44 |
| mld.Wisdom 1.0 | 19 | 22% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 19% | 56 |
| KiraNL.Chupacabra 0.4 | 8 | 9% | 19 |
| amz.NanoClone 1.41 | 7 | 8% | 15 |
| jangs.ns51 1.0 | 7 | 8% | 11 |
| sample.Walls 1.0 | 7 | 8% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

