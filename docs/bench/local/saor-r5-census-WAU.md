# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 88.5 | 148 / 210 | 2.03 | 21.4% | 42943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.4% | 148 |
| mz.AntiGrav 1.0 | 2.2 | 14.7% | 22 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 21 |
| mld.Infinity 2.2 | 4.0 | 12.7% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 8 |
| sample.Walls 1.0 | 6.7 | 6.3% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 86.7 | 23 / 35 | 7097 |
| 2 | 1 | 72.8 | 89.8 | 26 / 35 | 7553 |
| 3 | 1 | 72.4 | 89.8 | 26 / 35 | 6951 |
| 4 | 1 | 71.6 | 87.3 | 22 / 35 | 6938 |
| 5 | 1 | 72.8 | 89.2 | 27 / 35 | 7159 |
| 6 | 1 | 72.7 | 88.3 | 24 / 35 | 7245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 88% |
| radnor.DoctorBob 1.42 | 37 | 81% |
| mld.Infinity 2.2 | 36 | 97% |
| amz.NanoClone 1.41 | 8 | 50% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 41% | 63 |
| mz.AntiGrav 1.0 | 22 | 35% | 75 |
| amz.NanoClone 1.41 | 10 | 16% | 18 |
| mld.Infinity 2.2 | 4 | 6% | 38 |
| jangs.ns51 1.0 | 1 | 2% | 7 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 119 / 210 | 2.35 | 18.6% | 31791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 18.6% | 119 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.1% | 57 |
| mld.DustBunny 3.8 | 2.7 | 14.3% | 23 |
| maribo.melee.BMV 0.1 | 4.0 | 10.4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.1% | 5 |
| bzdp.BoxCar 2.0 | 7.0 | 7.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.6% | 1 |
| fullsail.SweetTea 1.1 | 8.0 | 6.9% | 2 |
| cs.Grudge 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.5 | 23 / 35 | 5295 |
| 2 | 2 | 65.4 | 68.3 | 14 / 35 | 5617 |
| 3 | 1 | 69.9 | 91.4 | 23 / 35 | 5349 |
| 4 | 1 | 65.5 | 77.8 | 18 / 35 | 4558 |
| 5 | 1 | 70.2 | 92.4 | 22 / 35 | 5615 |
| 6 | 1 | 69.2 | 89.5 | 19 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 75% |
| oog.melee.Mercutio 1.0 | 56 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 8 | 75% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 36 | 39% | 84 |
| mld.DustBunny 3.8 | 29 | 32% | 69 |
| maribo.melee.BMV 0.1 | 7 | 8% | 16 |
| zyx.nano.Ant 1.1 | 5 | 5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 11 |
| fullsail.SweetTea 1.1 | 3 | 3% | 6 |
| cs.Grudge 1.0 | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.4 | 135 / 210 | 2.31 | 20.2% | 37154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.2% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 28 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.8% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.0% | 24 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.3% | 8 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 4 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 23 / 35 | 6203 |
| 2 | 1 | 69.9 | 82.5 | 21 / 35 | 6304 |
| 3 | 1 | 70.8 | 87.6 | 24 / 35 | 6280 |
| 4 | 1 | 70.6 | 86.0 | 22 / 35 | 6455 |
| 5 | 1 | 69.7 | 83.5 | 23 / 35 | 5689 |
| 6 | 1 | 70.4 | 86.3 | 22 / 35 | 6223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 56 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 59% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 16 | 88% |
| sp.Nanos.Ember 1.1 | 14 | 93% |
| fm.mammillarias 1.3 | 8 | 75% |
| cs.sheldor.Talon 1.1 | 5 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 32% | 49 |
| myl.micro.Troodon 1.10 | 15 | 20% | 64 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 12 |
| fm.mammillarias 1.3 | 8 | 11% | 12 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 33 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 22 |
| sample.Fire 1.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 9 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.1 | 151 / 210 | 2.25 | 20.7% | 40351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.7% | 151 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.2% | 12 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.8% | 13 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.7% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 8.6% | 6 |
| yk.JahMicro 1.0 | 6.5 | 8.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 7.9% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.8 | 27 / 35 | 7505 |
| 2 | 1 | 71.2 | 91.1 | 25 / 35 | 6426 |
| 3 | 1 | 72.1 | 89.8 | 29 / 35 | 7019 |
| 4 | 1 | 70.1 | 81.0 | 24 / 35 | 6906 |
| 5 | 1 | 69.7 | 82.5 | 24 / 35 | 6529 |
| 6 | 1 | 68.5 | 81.6 | 22 / 35 | 5966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 94% |
| stelo.SoJNanoMelee 1.1 | 37 | 84% |
| tvv.micro.Antares 1.1.1 | 22 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 36% | 82 |
| stelo.SoJNanoMelee 1.1 | 14 | 24% | 43 |
| tvv.micro.Antares 1.1.1 | 7 | 12% | 34 |
| tj.zombie1n 1.0.1 | 5 | 8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 13 |
| yk.JahMicro 1.0 | 3 | 5% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 6 |
| repositorio.NanoStep 1.0 | 2 | 3% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 72.7 | 89 / 210 | 3.46 | 16.2% | 29010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.2% | 89 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 33 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 30 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.1% | 21 |
| EBBU.Sim2 1.02 | 4.7 | 10.3% | 11 |
| sam.Samspin 1.0 | 6.2 | 9.5% | 13 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.8% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.8% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 72.1 | 12 / 35 | 5243 |
| 2 | 1 | 59.3 | 63.2 | 9 / 35 | 4332 |
| 3 | 1 | 64.4 | 74.9 | 14 / 35 | 4772 |
| 4 | 1 | 64.7 | 73.7 | 16 / 35 | 4681 |
| 5 | 1 | 65.2 | 72.7 | 18 / 35 | 5033 |
| 6 | 1 | 66.7 | 79.7 | 20 / 35 | 4949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 57% |
| simonton.nano.MeleeSeed 1.8 | 28 | 86% |
| ahf.NanoAndrew .4 | 25 | 76% |
| EBBU.Sim2 1.02 | 10 | 70% |
| robar.nano.Assertive_Melee 0.2 | 9 | 100% |
| sam.Samspin 1.0 | 8 | 75% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |

Hadur died in 122 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 23% | 49 |
| ahf.NanoAndrew .4 | 22 | 18% | 41 |
| oog.melee.Corsair 1.0 | 18 | 15% | 38 |
| robar.nano.Assertive_Melee 0.2 | 16 | 13% | 27 |
| EBBU.Sim2 1.02 | 12 | 10% | 20 |
| sam.Samspin 1.0 | 10 | 8% | 13 |
| zyx.nano.BacillusComma 1.0 | 9 | 7% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 4% | 5 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 134 / 210 | 2.26 | 19.2% | 32581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.2% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 10 |
| fm.claire 1.7 | 5.5 | 9.1% | 3 |
| oog.melee.CapuletDroid 1.1 | 5.5 | 9.0% | 11 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.9% | 6 |
| sample.SpinBot 1.0 | 8.2 | 6.7% | 2 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.9 | 25 / 35 | 5369 |
| 2 | 1 | 68.5 | 86.0 | 19 / 35 | 5541 |
| 3 | 1 | 68.2 | 81.6 | 20 / 35 | 5578 |
| 4 | 1 | 70.1 | 91.4 | 25 / 35 | 5327 |
| 5 | 1 | 68.8 | 87.6 | 24 / 35 | 5188 |
| 6 | 1 | 68.4 | 86.7 | 21 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 79% |
| gh.nano.Grofvuil 0.2 | 21 | 90% |
| oog.melee.CapuletDroid 1.1 | 20 | 95% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 10 | 60% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 42% | 86 |
| oog.melee.CapuletDroid 1.1 | 13 | 17% | 32 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 16 |
| winamp32.micro.MicroMacro 1.0 | 6 | 8% | 13 |
| gh.nano.Grofvuil 0.2 | 5 | 7% | 32 |
| sample.SpinBot 1.0 | 5 | 7% | 6 |
| kurios.DOSexe .9b | 4 | 5% | 10 |
| fm.claire 1.7 | 2 | 3% | 8 |
| pa.Improved 1.0 | 1 | 1% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.1 | 99 / 210 | 2.70 | 18.5% | 35600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 99 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.3% | 43 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.9% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 23 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 9 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 2 |
| acogdev.alpha 0.2 | 9.0 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 75.9 | 18 / 35 | 5501 |
| 2 | 1 | 68.5 | 84.1 | 13 / 35 | 5950 |
| 3 | 1 | 70.2 | 85.1 | 22 / 35 | 6499 |
| 4 | 1 | 70.7 | 90.2 | 18 / 35 | 6245 |
| 5 | 1 | 66.2 | 74.0 | 15 / 35 | 5512 |
| 6 | 1 | 67.2 | 77.1 | 13 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 78% |
| gh.micro.Gruweltje 0.7 | 41 | 66% |
| mz.MicroGodMelee 1 | 38 | 68% |
| el.JumpShoot 0.2 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 680. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 29% | 62 |
| mz.MicroGodMelee 1 | 29 | 26% | 54 |
| spinnercat.micro.Tyger 0.1 | 27 | 24% | 63 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 12 |
| acogdev.alpha 0.2 | 6 | 5% | 7 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 72.7 | 111 / 210 | 3.46 | 17.0% | 31510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.0% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.6% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 24 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.4% | 5 |
| germ.TheMind .2 | 5.2 | 9.4% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.1% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 75.9 | 19 / 35 | 5108 |
| 2 | 1 | 64.4 | 70.5 | 17 / 35 | 4892 |
| 3 | 1 | 64.6 | 66.0 | 20 / 35 | 5103 |
| 4 | 1 | 68.0 | 79.7 | 21 / 35 | 5751 |
| 5 | 1 | 67.4 | 77.1 | 17 / 35 | 5840 |
| 6 | 1 | 63.3 | 67.0 | 17 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 95% |
| germ.TheMind .2 | 11 | 73% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 45% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 16% | 30 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 15 |
| germ.TheMind .2 | 7 | 7% | 20 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 10 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| awesomeness.Elite 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.6 | 154 / 210 | 1.76 | 20.6% | 31125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.6% | 154 |
| rz.HawkOnFire 0.1 | 2.2 | 13.7% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.8% | 11 |
| maribo.IotaCT 1.1 | 4.7 | 9.8% | 5 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 8.7% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.5% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 7.9% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 7.1% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 26 / 35 | 4981 |
| 2 | 1 | 70.7 | 89.8 | 26 / 35 | 5063 |
| 3 | 1 | 71.6 | 91.7 | 27 / 35 | 5372 |
| 4 | 1 | 72.1 | 94.6 | 29 / 35 | 5555 |
| 5 | 1 | 70.9 | 91.1 | 23 / 35 | 5116 |
| 6 | 1 | 70.5 | 91.1 | 23 / 35 | 5038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 96% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| stelo.PatternRobot 1.0 | 18 | 72% |
| timmit.nano.TimDog 0.33 | 15 | 73% |
| maribo.IotaCT 1.1 | 7 | 86% |
| ratosh.Wesco 1.4 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 32% | 75 |
| stelo.PatternRobot 1.0 | 10 | 18% | 21 |
| ratosh.Wesco 1.4 | 9 | 16% | 14 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 26 |
| spinnercat.Omen 1.0 | 4 | 7% | 8 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| maribo.IotaCT 1.1 | 1 | 2% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.3 | 175 / 210 | 1.69 | 21.9% | 40433 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.9% | 175 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.9% | 16 |
| baal.nano.N 1.42 | 3.0 | 11.2% | 8 |
| Grystrion.TrackerWO 1.0 | 4.5 | 10.0% | 1 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 3 |
| amk.Punbot.Punbot 0.01 | 6.8 | 7.8% | 4 |
| sanja.First 0.1 | 7.0 | 8.2% | 0 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 92.1 | 30 / 35 | 6542 |
| 2 | 1 | 71.7 | 92.4 | 28 / 35 | 6678 |
| 3 | 1 | 73.3 | 96.5 | 32 / 35 | 7016 |
| 4 | 1 | 70.5 | 88.6 | 28 / 35 | 6194 |
| 5 | 1 | 72.8 | 93.3 | 30 / 35 | 7310 |
| 6 | 1 | 71.6 | 91.1 | 27 / 35 | 6693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 86% |
| cvt.Firsty 1.0 | 32 | 100% |
| baal.nano.N 1.42 | 27 | 96% |
| zyx.micro.Ant 1.1 | 24 | 96% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| sanja.First 0.1 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 9 | 26% | 63 |
| zyx.micro.Ant 1.1 | 7 | 20% | 37 |
| sanja.First 0.1 | 5 | 14% | 28 |
| baal.nano.N 1.42 | 3 | 9% | 29 |
| cvt.Firsty 1.0 | 3 | 9% | 23 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 14 |
| amk.Punbot.Punbot 0.01 | 3 | 9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 8 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.5 | 98 / 210 | 3.39 | 16.5% | 32277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 16.5% | 98 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 50 |
| cs.Wren 1.0 | 3.5 | 12.2% | 16 |
| mz.Cork 0.1 | 4.2 | 11.0% | 12 |
| js.PinBall 1.6 | 4.5 | 11.1% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 4 |
| evd.X1 0.01 | 7.2 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 10 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.9 | 16 / 35 | 5013 |
| 2 | 2 | 62.8 | 64.8 | 13 / 35 | 5378 |
| 3 | 1 | 64.8 | 73.0 | 14 / 35 | 5540 |
| 4 | 1 | 66.9 | 77.8 | 19 / 35 | 5504 |
| 5 | 1 | 65.4 | 76.2 | 20 / 35 | 5074 |
| 6 | 1 | 65.6 | 74.3 | 16 / 35 | 5768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 69 | 77% |
| cs.Wren 1.0 | 24 | 83% |
| js.PinBall 1.6 | 10 | 80% |
| joe.ADinosaur 1.0 | 8 | 100% |
| mz.Cork 0.1 | 5 | 40% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 41% | 101 |
| cs.Wren 1.0 | 15 | 13% | 34 |
| js.PinBall 1.6 | 13 | 12% | 21 |
| mz.Cork 0.1 | 12 | 11% | 18 |
| evd.X1 0.01 | 12 | 11% | 11 |
| PSW.Relentless 0.1 | 6 | 5% | 7 |
| joe.ADinosaur 1.0 | 5 | 4% | 9 |
| jsal.Jsalbot 1.0 | 3 | 3% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.5 | 132 / 210 | 2.57 | 18.6% | 28849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.6% | 132 |
| ntc.Opposite 1.5 | 2.7 | 11.7% | 11 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.6% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.0% | 8 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.4% | 7 |
| disan.Chair 2.2.0 | 6.7 | 8.7% | 11 |
| DBall.NUKE 0.1 | 7.5 | 8.0% | 1 |
| pbg.R2D2 1.0 | 9.5 | 5.4% | 2 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.0 | 20 / 35 | 4814 |
| 2 | 1 | 70.1 | 91.4 | 27 / 35 | 4809 |
| 3 | 1 | 65.6 | 74.0 | 19 / 35 | 4759 |
| 4 | 1 | 67.8 | 81.3 | 21 / 35 | 4922 |
| 5 | 1 | 68.3 | 83.8 | 22 / 35 | 4988 |
| 6 | 1 | 67.8 | 83.8 | 23 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 98% |
| stelo.AreaTargetingBot 1.1 | 30 | 93% |
| disan.Chair 2.2.0 | 19 | 84% |
| ntc.Opposite 1.5 | 17 | 82% |
| pfvicm.Sobieski 7.2.3b | 10 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| donjezza.Muncho 1.0 | 9 | 100% |
| DBall.NUKE 0.1 | 6 | 83% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 24 |
| ntc.Opposite 1.5 | 12 | 15% | 23 |
| myl.nano.Graviton 1.10 | 10 | 13% | 46 |
| disan.Chair 2.2.0 | 10 | 13% | 21 |
| stelo.AreaTargetingBot 1.1 | 8 | 10% | 36 |
| DBall.NUKE 0.1 | 6 | 8% | 12 |
| pbg.R2D2 1.0 | 3 | 4% | 10 |
| donjezza.Muncho 1.0 | 1 | 1% | 11 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.0 | 84 / 210 | 3.25 | 16.3% | 27104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.3% | 84 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 34 |
| oog.melee.Capulet 1.2 | 3.3 | 13.2% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.7% | 27 |
| yagami.Tidus 0.11 | 4.0 | 12.5% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 2 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 76.5 | 15 / 35 | 4730 |
| 2 | 1 | 66.0 | 77.5 | 13 / 35 | 4441 |
| 3 | 1 | 64.7 | 71.7 | 15 / 35 | 4315 |
| 4 | 1 | 64.2 | 72.4 | 13 / 35 | 4144 |
| 5 | 1 | 66.1 | 76.8 | 17 / 35 | 4669 |
| 6 | 1 | 66.2 | 74.9 | 11 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 80% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| oog.melee.Capulet 1.2 | 18 | 44% |
| yagami.Tidus 0.11 | 14 | 100% |
| ejb.Polaris 1.0.1 | 12 | 75% |
| stelo.MirrorNano 1.3 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 33% | 54 |
| yagami.Tidus 0.11 | 21 | 17% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 16% | 49 |
| ejb.Polaris 1.0.1 | 18 | 14% | 30 |
| kawigi.micro.Shiz 1.1 | 11 | 9% | 27 |
| stelo.MirrorNano 1.3 | 7 | 6% | 9 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.4 | 132 / 210 | 2.67 | 17.9% | 27843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.9% | 132 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 23 |
| wee.Gem 1.8.4 | 3.3 | 11.5% | 22 |
| ratosh.Nobo 0.21 | 4.2 | 11.2% | 7 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 13 |
| m3thos.Eva00 1.1 | 5.5 | 10.2% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.4 | 24 / 35 | 4591 |
| 2 | 1 | 67.1 | 81.6 | 23 / 35 | 4700 |
| 3 | 1 | 62.1 | 68.9 | 14 / 35 | 4072 |
| 4 | 1 | 66.0 | 77.8 | 20 / 35 | 4628 |
| 5 | 1 | 69.4 | 88.9 | 26 / 35 | 4905 |
| 6 | 1 | 68.8 | 86.0 | 25 / 35 | 4947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 91% |
| wee.Gem 1.8.4 | 36 | 97% |
| wompi.Quokka 1.6 | 18 | 89% |
| ratosh.Nobo 0.21 | 16 | 88% |
| m3thos.Eva00 1.1 | 11 | 73% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 21% | 62 |
| wompi.Quokka 1.6 | 11 | 14% | 26 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 13% | 11 |
| bayen.UbaMicro 1.4 | 9 | 12% | 19 |
| m3thos.Eva00 1.1 | 9 | 12% | 13 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |
| ratosh.Nobo 0.21 | 6 | 8% | 19 |
| wee.Gem 1.8.4 | 5 | 6% | 47 |
| maribo.FollowFire 1 | 5 | 6% | 4 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 86.6 | 136 / 210 | 2.20 | 21.4% | 46992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 21.4% | 136 |
| wompi.Wallaby 5.1 | 1.8 | 18.4% | 59 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 9 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 5 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 0 |
| stuff.Vlad 0.1 | 5.5 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.9 | 22 / 35 | 7499 |
| 2 | 1 | 74.5 | 93.3 | 27 / 35 | 8100 |
| 3 | 1 | 73.2 | 89.8 | 22 / 35 | 7785 |
| 4 | 2 | 69.5 | 74.6 | 16 / 35 | 7232 |
| 5 | 1 | 71.7 | 81.6 | 22 / 35 | 7647 |
| 6 | 1 | 74.7 | 91.4 | 27 / 35 | 8729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 131 | 85% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| mz.NanoGod 2.02 | 12 | 92% |
| ayk.WallHugger 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 45% | 142 |
| mz.NanoGod 2.02 | 17 | 23% | 33 |
| exauge.GateKeeper 1.1.121g | 13 | 17% | 18 |
| ayk.WallHugger 1.0 | 5 | 7% | 7 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 75.1 | 116 / 210 | 3.24 | 17.4% | 30374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 17.4% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.8% | 19 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.0% | 18 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 20 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.8% | 8 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 3 |
| ap.Frederick 1.1 | 8.2 | 6.6% | 6 |
| dl.BetterWalls 1.0 | 9.2 | 6.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 71.7 | 16 / 35 | 5094 |
| 2 | 1 | 67.3 | 79.7 | 23 / 35 | 5046 |
| 3 | 1 | 68.9 | 84.1 | 23 / 35 | 5476 |
| 4 | 1 | 68.0 | 82.5 | 21 / 35 | 5019 |
| 5 | 1 | 62.5 | 64.8 | 14 / 35 | 4640 |
| 6 | 1 | 64.8 | 67.6 | 19 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 97% |
| dummy.micro.Sparrow 2.5 | 28 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 22 | 77% |
| stelo.MirrorMicro 1.0 | 11 | 82% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 17% | 55 |
| dummy.micro.Sparrow 2.5 | 16 | 17% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 15% | 15 |
| conscience.Electron 1.3g | 12 | 13% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 12% | 34 |
| bvh.micro.Freya 0.3 | 11 | 12% | 27 |
| dl.BetterWalls 1.0 | 8 | 9% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 85.6 | 147 / 210 | 2.30 | 21.1% | 42206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.1% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.7% | 13 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.5% | 9 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.6% | 8 |
| dsw.StaticD 1.0 | 5.7 | 9.1% | 8 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 5.8% | 1 |
| sample.Corners 1.0 | 9.8 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 25 / 35 | 6965 |
| 2 | 1 | 73.3 | 91.7 | 27 / 35 | 7432 |
| 3 | 1 | 72.6 | 89.5 | 29 / 35 | 7089 |
| 4 | 1 | 68.7 | 76.8 | 18 / 35 | 6396 |
| 5 | 1 | 72.2 | 88.3 | 26 / 35 | 7312 |
| 6 | 1 | 69.6 | 79.4 | 22 / 35 | 7012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 59 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 92% |
| dsw.StaticD 1.0 | 20 | 70% |
| supersample.SuperBoxBot 1.0 | 19 | 95% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 32% | 62 |
| supersample.SuperBoxBot 1.0 | 17 | 27% | 33 |
| dsw.StaticD 1.0 | 14 | 22% | 29 |
| sul.Lunar 1.1 | 5 | 8% | 62 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 12 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 4 |
| sample.Corners 1.0 | 1 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.4 | 113 / 210 | 2.77 | 18.6% | 37763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.6% | 113 |
| radnor.DoctorBob 1.42 | 2.5 | 13.0% | 29 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.6% | 26 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.4% | 8 |
| amz.NanoClone 1.41 | 5.8 | 9.8% | 9 |
| sample.Walls 1.0 | 7.0 | 7.7% | 4 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 2 |
| GarmBox.Oranges 1.0 | 8.5 | 6.8% | 0 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.5 | 19 / 35 | 6453 |
| 2 | 1 | 68.8 | 81.6 | 19 / 35 | 6334 |
| 3 | 1 | 66.4 | 74.6 | 21 / 35 | 5834 |
| 4 | 1 | 66.6 | 75.9 | 15 / 35 | 6242 |
| 5 | 1 | 69.3 | 84.4 | 18 / 35 | 6621 |
| 6 | 1 | 68.7 | 83.2 | 21 / 35 | 6279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 91% |
| radnor.DoctorBob 1.42 | 32 | 78% |
| mld.Wisdom 1.0 | 22 | 64% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| amz.NanoClone 1.41 | 12 | 92% |
| jangs.ns51 1.0 | 11 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 31% | 46 |
| radnor.DoctorBob 1.42 | 22 | 22% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 47 |
| KiraNL.Chupacabra 0.4 | 15 | 15% | 29 |
| amz.NanoClone 1.41 | 4 | 4% | 10 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 12 |

