# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.7 | 64 / 210 | 3.54 | 15.3% | 26139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.Infinity 2.2 | 1.8 | 15.7% | 59 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 15.3% | 64 |
| radnor.DoctorBob 1.42 | 2.8 | 14.9% | 43 |
| mz.AntiGrav 1.0 | 3.2 | 14.7% | 29 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 7 |
| sample.Walls 1.0 | 6.3 | 8.0% | 4 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 4 |
| sample.Target 1.0 | 9.3 | 4.3% | 2 |
| arthord.MannyPacquiao Beta | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.9 | 70.8 | 8 / 35 | 4323 |
| 2 | 1 | 63.9 | 70.2 | 13 / 35 | 4745 |
| 3 | 1 | 65.6 | 76.5 | 15 / 35 | 4628 |
| 4 | 1 | 66.9 | 81.6 | 15 / 35 | 4651 |
| 5 | 4 | 59.4 | 58.1 | 3 / 35 | 3655 |
| 6 | 2 | 64.4 | 73.3 | 10 / 35 | 4137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 37 | 57% |
| mz.AntiGrav 1.0 | 25 | 84% |
| radnor.DoctorBob 1.42 | 22 | 55% |
| amz.NanoClone 1.41 | 6 | 50% |
| jangs.ns51 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 0% |

Hadur died in 149 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 44 | 30% | 48 |
| radnor.DoctorBob 1.42 | 39 | 26% | 56 |
| mz.AntiGrav 1.0 | 31 | 21% | 62 |
| amz.NanoClone 1.41 | 13 | 9% | 15 |
| sample.Walls 1.0 | 7 | 5% | 9 |
| GarmBox.Oranges 1.0 | 5 | 3% | 6 |
| jangs.ns51 1.0 | 4 | 3% | 8 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |
| sample.Target 1.0 | 2 | 1% | 0 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.0 | 102 / 210 | 2.98 | 16.0% | 23013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 16.0% | 102 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.3% | 61 |
| mld.DustBunny 3.8 | 2.7 | 14.1% | 17 |
| maribo.melee.BMV 0.1 | 4.5 | 10.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.3% | 8 |
| zyx.nano.Ant 1.1 | 6.2 | 8.9% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.5% | 13 |
| fullsail.SweetTea 1.1 | 8.0 | 7.0% | 4 |
| bzdp.BoxCar 2.0 | 8.7 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 89.2 | 20 / 35 | 3716 |
| 2 | 1 | 65.4 | 84.1 | 21 / 35 | 3769 |
| 3 | 1 | 65.9 | 86.7 | 18 / 35 | 3982 |
| 4 | 2 | 64.4 | 78.1 | 18 / 35 | 3613 |
| 5 | 1 | 66.2 | 85.7 | 20 / 35 | 3719 |
| 6 | 3 | 54.9 | 44.1 | 5 / 35 | 4214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 58 | 76% |
| mld.DustBunny 3.8 | 40 | 80% |
| djdjdj.NanoSkunk10 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 25% | 59 |
| oog.melee.Mercutio 1.0 | 20 | 18% | 67 |
| zyx.nano.Ant 1.1 | 18 | 17% | 19 |
| cs.Grudge 1.0 | 12 | 11% | 13 |
| djdjdj.NanoSkunk10 1.0 | 9 | 8% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 6% | 14 |
| bzdp.BoxCar 2.0 | 6 | 6% | 7 |
| maribo.melee.BMV 0.1 | 6 | 6% | 6 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.3 | 88 / 210 | 3.76 | 15.3% | 25046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 1.2 | 16.9% | 73 |
| hadur117.micro.SaorOG2 0.1 | 1.8 | 15.3% | 88 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.6% | 20 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 4 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.5% | 10 |
| cs.sheldor.Talon 1.1 | 6.7 | 7.7% | 3 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.6% | 0 |
| sample.Fire 1.0 | 9.0 | 5.7% | 4 |
| sample.Tracker 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 70.5 | 17 / 35 | 3883 |
| 2 | 2 | 63.2 | 66.7 | 12 / 35 | 4691 |
| 3 | 2 | 64.6 | 75.6 | 16 / 35 | 4102 |
| 4 | 2 | 65.0 | 73.7 | 17 / 35 | 4589 |
| 5 | 2 | 59.0 | 59.0 | 11 / 35 | 3694 |
| 6 | 2 | 64.4 | 70.5 | 15 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 83% |
| cb.nano.Insomnia 1.0 | 19 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 79% |
| myl.nano.KomoriNinja 1.1 | 13 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |
| sp.Nanos.Ember 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 0% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 25% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 25 | 20% | 35 |
| cb.nano.Insomnia 1.0 | 22 | 18% | 17 |
| fm.mammillarias 1.3 | 14 | 11% | 17 |
| myl.nano.KomoriNinja 1.1 | 10 | 8% | 31 |
| sample.Tracker 1.0 | 7 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 8 |
| sample.Fire 1.0 | 5 | 4% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 11 |

## Melee bench: F04

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.7 | 87 / 210 | 3.00 | 16.5% | 27008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 16.5% | 87 |
| kawigi.nano.Lib 1.0 | 2.5 | 14.4% | 35 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.5% | 24 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 10.2% | 28 |
| tj.zombie1n 1.0.1 | 5.2 | 9.6% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.5% | 2 |
| yk.JahMicro 1.0 | 7.0 | 8.3% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 7.2% | 4 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 79.0 | 13 / 35 | 4198 |
| 2 | 1 | 63.0 | 72.1 | 14 / 35 | 4362 |
| 3 | 2 | 63.6 | 74.0 | 12 / 35 | 4555 |
| 4 | 1 | 65.7 | 78.7 | 16 / 35 | 4729 |
| 5 | 1 | 64.9 | 79.4 | 12 / 35 | 4607 |
| 6 | 1 | 66.7 | 83.2 | 20 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 72% |
| stelo.SoJNanoMelee 1.1 | 31 | 61% |
| tvv.micro.Antares 1.1.1 | 20 | 65% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| tj.zombie1n 1.0.1 | 7 | 71% |
| sample.VelociRobot 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 3 | 33% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 37 | 30% | 74 |
| stelo.SoJNanoMelee 1.1 | 37 | 30% | 52 |
| tvv.micro.Antares 1.1.1 | 19 | 15% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 12 | 10% | 13 |
| yk.JahMicro 1.0 | 6 | 5% | 7 |
| tj.zombie1n 1.0.1 | 5 | 4% | 10 |
| sample.VelociRobot 1.0 | 4 | 3% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |

## Melee bench: F05

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 63.2 | 75 / 210 | 4.31 | 13.9% | 21604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 13.9% | 75 |
| oog.melee.Corsair 1.0 | 1.8 | 13.4% | 40 |
| ahf.NanoAndrew .4 | 3.3 | 11.8% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.6% | 25 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.6% | 14 |
| sam.Samspin 1.0 | 6.2 | 9.7% | 10 |
| EBBU.Sim2 1.02 | 6.3 | 9.5% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.2% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 70.2 | 16 / 35 | 3894 |
| 2 | 1 | 62.8 | 73.0 | 14 / 35 | 3710 |
| 3 | 1 | 60.4 | 62.9 | 13 / 35 | 3911 |
| 4 | 2 | 58.3 | 60.0 | 11 / 35 | 3375 |
| 5 | 2 | 56.2 | 54.3 | 10 / 35 | 3245 |
| 6 | 2 | 58.3 | 59.0 | 11 / 35 | 3469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 75% |
| oog.melee.Corsair 1.0 | 30 | 87% |
| ahf.NanoAndrew .4 | 20 | 70% |
| sam.Samspin 1.0 | 8 | 63% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 29% | 61 |
| ahf.NanoAndrew .4 | 18 | 13% | 35 |
| oog.melee.Corsair 1.0 | 14 | 10% | 32 |
| EBBU.Sim2 1.02 | 14 | 10% | 17 |
| zyx.nano.BacillusComma 1.0 | 13 | 10% | 18 |
| robar.nano.Assertive_Melee 0.2 | 13 | 10% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 8% | 10 |
| sam.Samspin 1.0 | 10 | 7% | 17 |
| sample.TrackFire 1.0 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.0 | 96 / 210 | 3.16 | 15.6% | 21630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.6% | 96 |
| d414.nano.Quantum 1.0.0 | 1.5 | 15.4% | 46 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.7% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.0% | 24 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.8% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.7% | 7 |
| fm.claire 1.7 | 6.7 | 8.3% | 0 |
| sample.SpinBot 1.0 | 7.3 | 7.9% | 5 |
| pa.Improved 1.0 | 9.3 | 5.6% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 74.3 | 17 / 35 | 3461 |
| 2 | 2 | 60.5 | 68.6 | 13 / 35 | 3305 |
| 3 | 2 | 63.8 | 75.9 | 15 / 35 | 3618 |
| 4 | 1 | 64.5 | 78.4 | 20 / 35 | 3527 |
| 5 | 1 | 66.9 | 86.3 | 18 / 35 | 4149 |
| 6 | 2 | 62.3 | 72.4 | 13 / 35 | 3570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 72% |
| oog.melee.CapuletDroid 1.1 | 38 | 79% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| arthord.NanoSatanMelee Beta | 11 | 64% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 27% | 77 |
| oog.melee.CapuletDroid 1.1 | 20 | 17% | 22 |
| arthord.NanoSatanMelee Beta | 17 | 15% | 24 |
| gh.nano.Grofvuil 0.2 | 13 | 11% | 31 |
| winamp32.micro.MicroMacro 1.0 | 13 | 11% | 18 |
| sample.SpinBot 1.0 | 10 | 9% | 15 |
| fm.claire 1.7 | 5 | 4% | 9 |
| pa.Improved 1.0 | 4 | 3% | 6 |
| kurios.DOSexe .9b | 2 | 2% | 7 |

## Melee bench: F07

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.7 | 59 / 210 | 3.73 | 14.3% | 23116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 1.7 | 15.1% | 59 |
| gh.micro.Gruweltje 0.7 | 1.7 | 15.6% | 50 |
| hadur117.micro.SaorOG2 0.1 | 3.2 | 14.3% | 59 |
| mz.MicroGodMelee 1 | 3.5 | 13.7% | 22 |
| DBall.Anarchy 0.1 | 5.0 | 9.5% | 10 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 2 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 1 |
| el.JumpShoot 0.2 | 8.3 | 6.2% | 3 |
| mbro.Detektor3 0.1.1 | 8.5 | 5.9% | 5 |
| fire219.CatBot 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.9 | 67.3 | 7 / 35 | 3751 |
| 2 | 4 | 60.5 | 66.3 | 8 / 35 | 4043 |
| 3 | 3 | 60.4 | 68.3 | 10 / 35 | 3574 |
| 4 | 2 | 64.4 | 77.1 | 13 / 35 | 3962 |
| 5 | 2 | 62.1 | 73.3 | 11 / 35 | 3590 |
| 6 | 4 | 61.0 | 65.7 | 10 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 37 | 49% |
| spinnercat.micro.Tyger 0.1 | 31 | 45% |
| mz.MicroGodMelee 1 | 29 | 72% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| DBall.Anarchy 0.1 | 3 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 43 | 28% | 63 |
| spinnercat.micro.Tyger 0.1 | 35 | 23% | 51 |
| mz.MicroGodMelee 1 | 35 | 23% | 50 |
| acogdev.alpha 0.2 | 14 | 9% | 15 |
| DBall.Anarchy 0.1 | 10 | 7% | 13 |
| caimano.Furia_Ceca 0.22 | 7 | 5% | 8 |
| mbro.Detektor3 0.1.1 | 5 | 3% | 8 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 62.1 | 71 / 210 | 4.41 | 13.8% | 24196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.3% | 59 |
| hadur117.micro.SaorOG2 0.1 | 2.3 | 13.8% | 71 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.3 | 13.9% | 42 |
| germ.TheMind .2 | 4.7 | 10.0% | 12 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 2 |
| awesomeness.Elite 1.0 | 7.0 | 8.3% | 6 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.2% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.5% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 63.8 | 14 / 35 | 4232 |
| 2 | 2 | 58.1 | 57.1 | 9 / 35 | 3801 |
| 3 | 1 | 63.7 | 69.5 | 15 / 35 | 4723 |
| 4 | 3 | 60.2 | 62.5 | 13 / 35 | 3799 |
| 5 | 3 | 59.3 | 60.0 | 12 / 35 | 3705 |
| 6 | 3 | 58.2 | 59.7 | 8 / 35 | 3936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 67% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| germ.TheMind .2 | 5 | 60% |
| awesomeness.Elite 1.0 | 2 | 50% |
| stelo.UntouchableNano 1.3 | 2 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 43% | 101 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 22% | 44 |
| germ.TheMind .2 | 12 | 9% | 16 |
| awesomeness.Elite 1.0 | 9 | 6% | 13 |
| qualidafial.MajorDick 1.0.1 | 9 | 6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 9 | 6% | 10 |
| mym.EdgeStalker 1.0 | 5 | 4% | 6 |
| stelo.UntouchableNano 1.3 | 4 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.3 | 110 / 210 | 2.50 | 17.7% | 24877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 17.7% | 110 |
| rz.HawkOnFire 0.1 | 2.3 | 14.7% | 26 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.9% | 28 |
| maribo.IotaCT 1.1 | 4.0 | 11.5% | 25 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 6 |
| stelo.PatternRobot 1.0 | 7.0 | 8.2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.1% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 8.0% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.5 | 17 / 35 | 4148 |
| 2 | 1 | 67.4 | 82.9 | 18 / 35 | 4032 |
| 3 | 1 | 67.4 | 81.3 | 16 / 35 | 4688 |
| 4 | 1 | 69.6 | 90.2 | 23 / 35 | 4287 |
| 5 | 1 | 68.4 | 88.3 | 22 / 35 | 3882 |
| 6 | 1 | 64.6 | 74.9 | 14 / 35 | 3840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 85% |
| nz.jdc.nano.GridFu 1.0 | 47 | 77% |
| maribo.IotaCT 1.1 | 20 | 55% |
| timmit.nano.TimDog 0.33 | 6 | 67% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 100 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 24 | 24% | 63 |
| maribo.IotaCT 1.1 | 23 | 23% | 34 |
| rz.HawkOnFire 0.1 | 18 | 18% | 70 |
| stelo.PatternRobot 1.0 | 12 | 12% | 17 |
| ratosh.Wesco 1.4 | 9 | 9% | 10 |
| timmit.nano.TimDog 0.33 | 7 | 7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 6% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.5 | 132 / 210 | 2.49 | 18.7% | 32049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 18.7% | 132 |
| tvv.nano.Polaris 1.2 | 2.2 | 13.1% | 39 |
| baal.nano.N 1.42 | 2.8 | 11.8% | 11 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.2% | 7 |
| sanja.First 0.1 | 5.8 | 8.5% | 4 |
| zyx.micro.Ant 1.1 | 6.2 | 8.7% | 3 |
| cvt.Firsty 1.0 | 6.8 | 8.2% | 12 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 2 |
| sample.RamFire 1.0 | 10.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 23 / 35 | 5185 |
| 2 | 1 | 68.1 | 81.3 | 19 / 35 | 5990 |
| 3 | 1 | 66.7 | 78.7 | 20 / 35 | 5038 |
| 4 | 1 | 66.4 | 79.7 | 20 / 35 | 4953 |
| 5 | 1 | 68.5 | 88.3 | 22 / 35 | 5241 |
| 6 | 1 | 69.9 | 89.2 | 28 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 66% |
| baal.nano.N 1.42 | 32 | 100% |
| cvt.Firsty 1.0 | 31 | 90% |
| Grystrion.TrackerWO 1.0 | 15 | 73% |
| sanja.First 0.1 | 12 | 92% |
| zyx.micro.Ant 1.1 | 11 | 82% |
| amk.Punbot.Punbot 0.01 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 25 | 32% | 61 |
| Grystrion.TrackerWO 1.0 | 14 | 18% | 20 |
| zyx.micro.Ant 1.1 | 13 | 16% | 34 |
| cvt.Firsty 1.0 | 9 | 11% | 40 |
| sample.RamFire 1.0 | 8 | 10% | 12 |
| baal.nano.N 1.42 | 5 | 6% | 21 |
| sanja.First 0.1 | 3 | 4% | 17 |
| amk.Punbot.Punbot 0.01 | 2 | 3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 59.0 | 49 / 210 | 4.69 | 12.7% | 23654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 16.0% | 95 |
| cs.Wren 1.0 | 2.5 | 12.9% | 23 |
| hadur117.micro.SaorOG2 0.1 | 2.7 | 12.7% | 49 |
| js.PinBall 1.6 | 4.5 | 11.1% | 11 |
| mz.Cork 0.1 | 4.5 | 11.5% | 17 |
| joe.ADinosaur 1.0 | 5.8 | 9.9% | 4 |
| evd.X1 0.01 | 7.2 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 7.8 | 7.1% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.6% | 2 |
| PSW.Relentless 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.0 | 54.3 | 11 / 35 | 4126 |
| 2 | 2 | 59.0 | 61.3 | 9 / 35 | 4023 |
| 3 | 3 | 57.5 | 58.4 | 5 / 35 | 4245 |
| 4 | 2 | 58.3 | 61.9 | 7 / 35 | 3959 |
| 5 | 2 | 60.3 | 66.3 | 10 / 35 | 3600 |
| 6 | 4 | 55.2 | 51.7 | 7 / 35 | 3701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 53 | 25% |
| cs.Wren 1.0 | 20 | 85% |
| mz.Cork 0.1 | 8 | 88% |
| joe.ADinosaur 1.0 | 5 | 100% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 86 | 53% | 97 |
| cs.Wren 1.0 | 15 | 9% | 31 |
| evd.X1 0.01 | 15 | 9% | 16 |
| js.PinBall 1.6 | 11 | 7% | 18 |
| joe.ADinosaur 1.0 | 11 | 7% | 16 |
| PSW.Relentless 0.1 | 11 | 7% | 12 |
| mz.Cork 0.1 | 10 | 6% | 16 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 73.9 | 96 / 210 | 3.35 | 15.7% | 21538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.0 | 15.7% | 96 |
| myl.nano.Graviton 1.10 | 2.7 | 12.1% | 29 |
| ntc.Opposite 1.5 | 3.5 | 11.8% | 14 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.2% | 8 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.5% | 6 |
| DBall.NUKE 0.1 | 6.2 | 9.1% | 7 |
| disan.Chair 2.2.0 | 7.8 | 8.3% | 14 |
| donjezza.Muncho 1.0 | 9.5 | 5.9% | 10 |
| pbg.R2D2 1.0 | 9.5 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 69.2 | 16 / 35 | 3591 |
| 2 | 1 | 61.5 | 68.6 | 13 / 35 | 4083 |
| 3 | 1 | 66.7 | 86.0 | 21 / 35 | 3804 |
| 4 | 1 | 64.1 | 75.6 | 17 / 35 | 3767 |
| 5 | 1 | 62.1 | 69.5 | 12 / 35 | 3576 |
| 6 | 1 | 61.8 | 74.3 | 17 / 35 | 2717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 85% |
| stelo.AreaTargetingBot 1.1 | 28 | 46% |
| ntc.Opposite 1.5 | 15 | 87% |
| DBall.NUKE 0.1 | 14 | 86% |
| disan.Chair 2.2.0 | 12 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| donjezza.Muncho 1.0 | 6 | 50% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 30 | 25% | 44 |
| ntc.Opposite 1.5 | 18 | 15% | 28 |
| myl.nano.Graviton 1.10 | 17 | 14% | 44 |
| pfvicm.Sobieski 7.2.3b | 12 | 10% | 20 |
| DBall.NUKE 0.1 | 10 | 8% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 17 |
| disan.Chair 2.2.0 | 8 | 7% | 15 |
| donjezza.Muncho 1.0 | 7 | 6% | 10 |
| pbg.R2D2 1.0 | 4 | 3% | 10 |
4 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 61.9 | 63 / 210 | 4.43 | 12.4% | 16316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.5 | 14.7% | 52 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 39 |
| yagami.Tidus 0.11 | 3.7 | 13.0% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 13.0% | 27 |
| hadur117.micro.SaorOG2 0.1 | 4.3 | 12.4% | 63 |
| ejb.Polaris 1.0.1 | 5.3 | 11.1% | 7 |
| stelo.MirrorNano 1.3 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.4 | 61.6 | 11 / 35 | 2632 |
| 2 | 4 | 57.9 | 61.9 | 10 / 35 | 2419 |
| 3 | 3 | 59.3 | 62.2 | 13 / 35 | 2871 |
| 4 | 5 | 57.9 | 59.7 | 10 / 35 | 2701 |
| 5 | 6 | 56.7 | 57.5 | 7 / 35 | 2800 |
| 6 | 3 | 61.2 | 68.3 | 12 / 35 | 2893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 78% |
| oog.melee.Capulet 1.2 | 23 | 70% |
| yagami.Tidus 0.11 | 11 | 55% |
| ejb.Polaris 1.0.1 | 5 | 80% |

Hadur died in 147 of 210 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 36% | 66 |
| kawigi.micro.Shiz 1.1 | 22 | 15% | 34 |
| yagami.Tidus 0.11 | 21 | 14% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 11% | 38 |
| ejb.Polaris 1.0.1 | 12 | 8% | 19 |
| stelo.MirrorNano 1.3 | 11 | 7% | 11 |
| kurios.DOSexe .9a | 7 | 5% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.3 | 90 / 210 | 3.76 | 14.1% | 18114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 14.1% | 90 |
| wee.Gem 1.8.4 | 2.2 | 13.2% | 53 |
| bzdp.Pansy 2.1 | 3.2 | 12.6% | 27 |
| wompi.Quokka 1.6 | 3.7 | 12.3% | 21 |
| ratosh.Nobo 0.21 | 4.8 | 11.5% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.8% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.3 | 67.9 | 17 / 35 | 2902 |
| 2 | 1 | 60.6 | 73.3 | 13 / 35 | 2773 |
| 3 | 2 | 59.0 | 64.8 | 12 / 35 | 3135 |
| 4 | 1 | 62.0 | 71.7 | 16 / 35 | 3214 |
| 5 | 1 | 60.8 | 69.2 | 18 / 35 | 3041 |
| 6 | 1 | 60.7 | 68.9 | 14 / 35 | 3049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 35 | 77% |
| bzdp.Pansy 2.1 | 31 | 87% |
| wompi.Quokka 1.6 | 17 | 82% |
| ratosh.Nobo 0.21 | 9 | 100% |
| m3thos.Eva00 1.1 | 9 | 78% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 24 | 20% | 54 |
| maribo.FollowFire 1 | 19 | 16% | 19 |
| wompi.Quokka 1.6 | 16 | 13% | 26 |
| bzdp.Pansy 2.1 | 14 | 11% | 34 |
| ratosh.Nobo 0.21 | 14 | 11% | 23 |
| m3thos.Eva00 1.1 | 12 | 10% | 16 |
| bayen.UbaMicro 1.4 | 10 | 8% | 16 |
| stelo.MyAgileRobot 0.2 | 9 | 7% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.1 | 14 / 210 | 3.24 | 16.1% | 33993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 21.7% | 168 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 16.1% | 14 |
| mz.NanoGod 2.02 | 2.8 | 14.8% | 23 |
| ayk.WallHugger 1.0 | 4.5 | 9.7% | 1 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 7.7 | 6.1% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 4.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 74.0 | 4 / 35 | 5897 |
| 2 | 2 | 67.5 | 81.3 | 2 / 35 | 6441 |
| 3 | 2 | 66.8 | 75.9 | 2 / 35 | 5922 |
| 4 | 2 | 66.6 | 77.1 | 1 / 35 | 5607 |
| 5 | 2 | 66.0 | 78.4 | 4 / 35 | 5421 |
| 6 | 3 | 62.0 | 63.8 | 1 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 3% |
| mz.NanoGod 2.02 | 8 | 38% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 196 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 138 | 70% | 143 |
| mz.NanoGod 2.02 | 30 | 15% | 34 |
| exauge.GateKeeper 1.1.121g | 11 | 6% | 11 |
| ayk.WallHugger 1.0 | 9 | 5% | 9 |
| stuff.Vlad 0.1 | 5 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 62.7 | 72 / 210 | 4.36 | 13.3% | 19902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.7% | 38 |
| hadur117.micro.SaorOG2 0.1 | 2.2 | 13.3% | 72 |
| bvh.micro.Freya 0.3 | 3.3 | 12.1% | 22 |
| dummy.micro.Sparrow 2.5 | 3.5 | 12.2% | 26 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.7% | 29 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.3 | 8.1% | 2 |
| dl.BetterWalls 1.0 | 7.5 | 7.8% | 7 |
| ap.Frederick 1.1 | 9.2 | 6.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 64.1 | 13 / 35 | 3375 |
| 2 | 4 | 54.5 | 51.7 | 11 / 35 | 2918 |
| 3 | 1 | 62.8 | 72.4 | 15 / 35 | 3830 |
| 4 | 1 | 58.3 | 64.1 | 10 / 35 | 3200 |
| 5 | 1 | 59.5 | 64.1 | 14 / 35 | 3132 |
| 6 | 4 | 57.7 | 59.7 | 9 / 35 | 3447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 62% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| dummy.micro.Sparrow 2.5 | 14 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 70% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 4 | 75% |
| stelo.MirrorMicro 1.0 | 3 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 28 | 20% | 51 |
| dummy.micro.Sparrow 2.5 | 23 | 16% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 15% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 20 | 14% | 20 |
| bvh.micro.Freya 0.3 | 17 | 12% | 27 |
| dl.BetterWalls 1.0 | 13 | 9% | 16 |
| conscience.Electron 1.3g | 12 | 9% | 16 |
| stelo.MirrorMicro 1.0 | 6 | 4% | 11 |

## Melee bench: F17

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 69.6 | 88 / 210 | 3.74 | 15.8% | 28338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 1.5 | 16.3% | 35 |
| hadur117.micro.SaorOG2 0.1 | 1.5 | 15.8% | 88 |
| sul.Lunar 1.1 | 3.0 | 12.4% | 29 |
| mme.NikeEnhanced 2.0 | 4.7 | 10.3% | 14 |
| supersample.SuperBoxBot 1.0 | 4.8 | 10.1% | 18 |
| dsw.StaticD 1.0 | 5.7 | 9.2% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.4% | 9 |
| sample.Corners 1.0 | 9.3 | 5.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 68.9 | 13 / 35 | 4601 |
| 2 | 2 | 64.1 | 69.8 | 14 / 35 | 4821 |
| 3 | 2 | 61.9 | 61.0 | 13 / 35 | 4819 |
| 4 | 1 | 63.7 | 71.7 | 14 / 35 | 4299 |
| 5 | 1 | 66.6 | 78.7 | 17 / 35 | 4790 |
| 6 | 1 | 63.8 | 67.3 | 17 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 43 | 81% |
| sul.Lunar 1.1 | 21 | 62% |
| supersample.SuperBoxBot 1.0 | 12 | 75% |
| dsw.StaticD 1.0 | 8 | 100% |
| sample.Corners 1.0 | 8 | 63% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 50% |
| mme.NikeEnhanced 2.0 | 6 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 38 | 31% | 71 |
| supersample.SuperBoxBot 1.0 | 26 | 21% | 32 |
| sul.Lunar 1.1 | 17 | 14% | 36 |
| mme.NikeEnhanced 2.0 | 13 | 10% | 18 |
| sample.Corners 1.0 | 13 | 10% | 18 |
| dsw.StaticD 1.0 | 7 | 6% | 17 |
| sample.MyFirstRobot 1.0 | 7 | 6% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 73.4 | 69 / 210 | 3.40 | 15.4% | 27562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG2 0.1 | 1.2 | 15.4% | 69 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.3 | 13.5% | 42 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 39 |
| mld.Wisdom 1.0 | 4.0 | 11.4% | 18 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 11 |
| amz.NanoClone 1.41 | 5.7 | 9.9% | 12 |
| sample.Walls 1.0 | 6.8 | 8.6% | 10 |
| GarmBox.Oranges 1.0 | 8.0 | 7.2% | 1 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 7 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 79.7 | 10 / 35 | 4347 |
| 2 | 1 | 63.9 | 77.1 | 11 / 35 | 4418 |
| 3 | 1 | 64.3 | 75.9 | 13 / 35 | 4694 |
| 4 | 1 | 61.8 | 67.3 | 10 / 35 | 4913 |
| 5 | 2 | 61.3 | 68.3 | 12 / 35 | 4116 |
| 6 | 1 | 64.2 | 72.1 | 13 / 35 | 5074 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 67% |
| radnor.DoctorBob 1.42 | 31 | 58% |
| sample.Walls 1.0 | 13 | 77% |
| mld.Wisdom 1.0 | 11 | 55% |
| amz.NanoClone 1.41 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 6 | 67% |
| GarmBox.Oranges 1.0 | 4 | 75% |
| jangs.ns51 1.0 | 3 | 0% |
| sample.Target 1.0 | 1 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 25% | 60 |
| radnor.DoctorBob 1.42 | 35 | 25% | 54 |
| mld.Wisdom 1.0 | 21 | 15% | 25 |
| sample.Walls 1.0 | 14 | 10% | 20 |
| KiraNL.Chupacabra 0.4 | 12 | 9% | 16 |
| amz.NanoClone 1.41 | 11 | 8% | 14 |
| jangs.ns51 1.0 | 9 | 6% | 13 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |
| sample.Target 1.0 | 1 | 1% | 0 |

