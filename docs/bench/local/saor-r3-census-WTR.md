# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.5 | 158 / 210 | 1.85 | 21.8% | 43784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.8% | 158 |
| mz.AntiGrav 1.0 | 2.2 | 14.5% | 18 |
| radnor.DoctorBob 1.42 | 3.0 | 13.7% | 13 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 6 |
| sample.Walls 1.0 | 6.7 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.2% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 93.3 | 30 / 35 | 7623 |
| 2 | 1 | 72.2 | 89.8 | 25 / 35 | 7138 |
| 3 | 1 | 72.4 | 90.2 | 24 / 35 | 7275 |
| 4 | 1 | 74.4 | 95.9 | 29 / 35 | 8095 |
| 5 | 1 | 71.4 | 85.7 | 25 / 35 | 6596 |
| 6 | 1 | 72.2 | 88.3 | 25 / 35 | 7057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 92% |
| mld.Infinity 2.2 | 42 | 93% |
| radnor.DoctorBob 1.42 | 38 | 95% |
| amz.NanoClone 1.41 | 7 | 57% |
| sample.Target 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.Walls 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 19 | 37% | 80 |
| radnor.DoctorBob 1.42 | 14 | 27% | 53 |
| mld.Infinity 2.2 | 9 | 17% | 43 |
| amz.NanoClone 1.41 | 5 | 10% | 9 |
| sample.Walls 1.0 | 2 | 4% | 9 |
| GarmBox.Oranges 1.0 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.2 | 119 / 210 | 2.24 | 18.7% | 32340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.7% | 119 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 43 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 25 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 7 |
| zyx.nano.Ant 1.1 | 5.2 | 8.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 8.1% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.6% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 6.6% | 4 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.6 | 19 / 35 | 5532 |
| 2 | 1 | 69.5 | 91.4 | 25 / 35 | 5278 |
| 3 | 1 | 67.2 | 85.1 | 19 / 35 | 4945 |
| 4 | 1 | 70.0 | 90.5 | 22 / 35 | 5565 |
| 5 | 1 | 69.2 | 89.5 | 22 / 35 | 5251 |
| 6 | 1 | 66.0 | 72.1 | 12 / 35 | 5769 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 77% |
| mld.DustBunny 3.8 | 47 | 72% |
| maribo.melee.BMV 0.1 | 10 | 70% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 31 | 34% | 62 |
| oog.melee.Mercutio 1.0 | 30 | 33% | 87 |
| maribo.melee.BMV 0.1 | 8 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 8% | 12 |
| fullsail.SweetTea 1.1 | 6 | 7% | 11 |
| zyx.nano.Ant 1.1 | 5 | 5% | 10 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.1 | 152 / 210 | 2.07 | 21.2% | 39910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.2% | 152 |
| myl.micro.Troodon 1.10 | 2.0 | 13.5% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 9.9% | 12 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.3% | 3 |
| fm.mammillarias 1.3 | 5.7 | 9.2% | 1 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.4% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 87.9 | 24 / 35 | 7004 |
| 2 | 1 | 69.1 | 81.9 | 20 / 35 | 6105 |
| 3 | 1 | 73.5 | 95.9 | 30 / 35 | 7127 |
| 4 | 1 | 70.9 | 84.1 | 25 / 35 | 6616 |
| 5 | 1 | 72.5 | 91.7 | 26 / 35 | 6783 |
| 6 | 1 | 70.9 | 87.0 | 27 / 35 | 6275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 83% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| myl.nano.KomoriNinja 1.1 | 22 | 91% |
| sp.Nanos.Ember 1.1 | 22 | 95% |
| fm.mammillarias 1.3 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 28% | 34 |
| myl.micro.Troodon 1.10 | 13 | 22% | 60 |
| myl.nano.KomoriNinja 1.1 | 10 | 17% | 42 |
| cb.nano.Insomnia 1.0 | 7 | 12% | 18 |
| fm.mammillarias 1.3 | 7 | 12% | 14 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 23 |
| sample.Fire 1.0 | 2 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 1 | 2% | 8 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.8 | 152 / 210 | 2.01 | 21.0% | 39720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.0% | 152 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.6% | 15 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 8.8% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.0% | 11 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 83.2 | 24 / 35 | 6810 |
| 2 | 1 | 70.7 | 87.6 | 23 / 35 | 6568 |
| 3 | 1 | 71.3 | 93.3 | 25 / 35 | 6245 |
| 4 | 1 | 70.3 | 85.7 | 25 / 35 | 6360 |
| 5 | 1 | 70.8 | 87.6 | 26 / 35 | 6646 |
| 6 | 1 | 73.0 | 95.2 | 29 / 35 | 7091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 85% |
| stelo.SoJNanoMelee 1.1 | 53 | 94% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 65% |
| tj.zombie1n 1.0.1 | 16 | 88% |
| yk.JahMicro 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 29% | 79 |
| tvv.micro.Antares 1.1.1 | 10 | 17% | 38 |
| stelo.SoJNanoMelee 1.1 | 10 | 17% | 34 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 14% | 20 |
| tj.zombie1n 1.0.1 | 5 | 9% | 10 |
| yk.JahMicro 1.0 | 4 | 7% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 10 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 69.3 | 88 / 210 | 3.76 | 15.7% | 28482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 15.7% | 88 |
| oog.melee.Corsair 1.0 | 2.3 | 12.3% | 35 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.3% | 27 |
| ahf.NanoAndrew .4 | 4.0 | 10.7% | 26 |
| EBBU.Sim2 1.02 | 5.3 | 9.9% | 8 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 15 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 67.3 | 15 / 35 | 4746 |
| 2 | 1 | 63.4 | 68.6 | 15 / 35 | 4870 |
| 3 | 1 | 62.7 | 68.9 | 16 / 35 | 4478 |
| 4 | 1 | 62.9 | 70.2 | 14 / 35 | 4537 |
| 5 | 1 | 60.7 | 61.0 | 12 / 35 | 4806 |
| 6 | 1 | 66.3 | 80.0 | 16 / 35 | 5045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 56% |
| simonton.nano.MeleeSeed 1.8 | 30 | 83% |
| ahf.NanoAndrew .4 | 15 | 67% |
| EBBU.Sim2 1.02 | 12 | 92% |
| sam.Samspin 1.0 | 12 | 92% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 20% | 48 |
| simonton.nano.MeleeSeed 1.8 | 25 | 20% | 47 |
| ahf.NanoAndrew .4 | 19 | 16% | 31 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 17 |
| EBBU.Sim2 1.02 | 11 | 9% | 20 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 10 |
| sample.TrackFire 1.0 | 5 | 4% | 7 |
| sam.Samspin 1.0 | 3 | 2% | 12 |

## Melee bench: F06

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.2 | 133 / 210 | 2.42 | 19.1% | 33788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.1% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 31 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 9 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.5% | 6 |
| fm.claire 1.7 | 7.0 | 8.3% | 0 |
| sample.SpinBot 1.0 | 7.3 | 7.7% | 6 |
| pa.Improved 1.0 | 9.2 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 82.2 | 22 / 35 | 5715 |
| 2 | 1 | 68.4 | 82.9 | 23 / 35 | 5580 |
| 3 | 1 | 68.2 | 81.9 | 22 / 35 | 5409 |
| 4 | 1 | 68.2 | 83.2 | 19 / 35 | 5683 |
| 5 | 1 | 69.5 | 86.7 | 24 / 35 | 5612 |
| 6 | 1 | 69.2 | 88.3 | 23 / 35 | 5789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 83% |
| oog.melee.CapuletDroid 1.1 | 31 | 100% |
| gh.nano.Grofvuil 0.2 | 16 | 75% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 11 | 64% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 32% | 78 |
| gh.nano.Grofvuil 0.2 | 18 | 23% | 42 |
| fm.claire 1.7 | 9 | 12% | 15 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 13 |
| sample.SpinBot 1.0 | 6 | 8% | 9 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 34 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 11 |
| pa.Improved 1.0 | 1 | 1% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.3 | 100 / 210 | 2.41 | 18.7% | 34813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.7% | 100 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 34 |
| mz.MicroGodMelee 1 | 3.3 | 13.4% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.6% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 0 |
| fire219.CatBot 1.0 | 8.0 | 6.0% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.4 | 12 / 35 | 5590 |
| 2 | 1 | 66.8 | 77.5 | 12 / 35 | 5779 |
| 3 | 1 | 68.0 | 81.3 | 13 / 35 | 5849 |
| 4 | 1 | 70.0 | 88.3 | 21 / 35 | 5816 |
| 5 | 1 | 70.6 | 88.9 | 25 / 35 | 6160 |
| 6 | 1 | 68.3 | 84.4 | 17 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 84% |
| mz.MicroGodMelee 1 | 37 | 62% |
| gh.micro.Gruweltje 0.7 | 26 | 65% |
| DBall.Anarchy 0.1 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 7 | 71% |
| acogdev.alpha 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 36 | 33% | 62 |
| gh.micro.Gruweltje 0.7 | 33 | 30% | 52 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 59 |
| caimano.Furia_Ceca 0.22 | 7 | 6% | 12 |
| DBall.Anarchy 0.1 | 4 | 4% | 13 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 62.1 | 89 / 210 | 4.41 | 14.7% | 28428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.8 | 14.7% | 89 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 13.9% | 43 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.2% | 37 |
| germ.TheMind .2 | 5.7 | 9.3% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.3% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 9.3% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.6% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.6% | 5 |
| sample.Crazy 1.0 | 8.2 | 7.6% | 10 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 68.3 | 15 / 35 | 5279 |
| 2 | 2 | 62.3 | 65.4 | 17 / 35 | 4335 |
| 3 | 3 | 58.8 | 54.0 | 16 / 35 | 4378 |
| 4 | 2 | 58.5 | 52.1 | 13 / 35 | 4580 |
| 5 | 1 | 61.7 | 61.9 | 11 / 35 | 5103 |
| 6 | 2 | 64.5 | 70.8 | 17 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 83% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 33% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 345. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 45% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 14% | 32 |
| germ.TheMind .2 | 17 | 14% | 27 |
| awesomeness.Elite 1.0 | 8 | 7% | 13 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 3 | 2% | 10 |
| mym.EdgeStalker 1.0 | 3 | 2% | 5 |
| sample.Crazy 1.0 | 3 | 2% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.9 | 134 / 210 | 2.36 | 19.6% | 33304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.6% | 134 |
| rz.HawkOnFire 0.1 | 2.2 | 13.1% | 28 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.7% | 6 |
| timmit.nano.TimDog 0.33 | 4.5 | 10.9% | 15 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 8.0% | 9 |
| stelo.PatternRobot 1.0 | 7.8 | 7.5% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.3 | 23 / 35 | 5671 |
| 2 | 1 | 69.4 | 86.3 | 19 / 35 | 5316 |
| 3 | 1 | 69.8 | 85.7 | 24 / 35 | 5215 |
| 4 | 1 | 67.1 | 74.9 | 19 / 35 | 5217 |
| 5 | 1 | 69.4 | 83.2 | 23 / 35 | 5553 |
| 6 | 1 | 72.0 | 91.7 | 26 / 35 | 6332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 52 | 83% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 94% |
| stelo.PatternRobot 1.0 | 14 | 86% |
| timmit.nano.TimDog 0.33 | 14 | 71% |
| maribo.IotaCT 1.1 | 13 | 92% |
| ratosh.Wesco 1.4 | 6 | 67% |

Hadur died in 77 of 210 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 25 | 32% | 35 |
| rz.HawkOnFire 0.1 | 18 | 23% | 50 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 54 |
| ratosh.Wesco 1.4 | 8 | 10% | 15 |
| stelo.PatternRobot 1.0 | 8 | 10% | 14 |
| maribo.IotaCT 1.1 | 4 | 5% | 21 |
| spinnercat.Omen 1.0 | 3 | 4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 14 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 90.7 | 168 / 210 | 1.84 | 21.5% | 39550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.5% | 168 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.0% | 14 |
| baal.nano.N 1.42 | 2.5 | 11.5% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 10.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.4% | 1 |
| zyx.micro.Ant 1.1 | 5.8 | 9.0% | 6 |
| sanja.First 0.1 | 7.0 | 8.2% | 3 |
| cvt.Firsty 1.0 | 7.5 | 7.6% | 6 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.9% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.3 | 23 / 35 | 6460 |
| 2 | 1 | 71.1 | 89.8 | 27 / 35 | 6420 |
| 3 | 1 | 72.0 | 92.4 | 28 / 35 | 6743 |
| 4 | 1 | 71.7 | 92.7 | 29 / 35 | 6397 |
| 5 | 1 | 73.2 | 96.8 | 31 / 35 | 7277 |
| 6 | 1 | 71.5 | 91.1 | 30 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 91% |
| cvt.Firsty 1.0 | 35 | 97% |
| tvv.nano.Polaris 1.2 | 34 | 94% |
| zyx.micro.Ant 1.1 | 19 | 95% |
| sanja.First 0.1 | 18 | 94% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 31% | 29 |
| baal.nano.N 1.42 | 7 | 17% | 40 |
| Grystrion.TrackerWO 1.0 | 6 | 14% | 19 |
| tvv.nano.Polaris 1.2 | 4 | 10% | 48 |
| cvt.Firsty 1.0 | 4 | 10% | 32 |
| sample.RamFire 1.0 | 4 | 10% | 6 |
| sanja.First 0.1 | 2 | 5% | 19 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 9 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.7 | 84 / 210 | 3.91 | 15.6% | 32182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.3 | 15.6% | 84 |
| kc.micro.Figment 1.0 | 1.7 | 14.9% | 61 |
| cs.Wren 1.0 | 3.2 | 12.2% | 21 |
| mz.Cork 0.1 | 4.5 | 11.0% | 13 |
| js.PinBall 1.6 | 4.7 | 10.9% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 6 |
| evd.X1 0.01 | 6.7 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.7% | 9 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 5 |
| PSW.Relentless 0.1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 76.8 | 17 / 35 | 6053 |
| 2 | 1 | 63.0 | 66.0 | 14 / 35 | 5391 |
| 3 | 1 | 65.4 | 71.7 | 16 / 35 | 5748 |
| 4 | 2 | 62.1 | 64.4 | 12 / 35 | 5164 |
| 5 | 1 | 63.0 | 68.9 | 13 / 35 | 5139 |
| 6 | 2 | 59.8 | 58.1 | 12 / 35 | 4687 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 76% |
| cs.Wren 1.0 | 21 | 86% |
| mz.Cork 0.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 8 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 25% |
| js.PinBall 1.6 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 492. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 39% | 95 |
| js.PinBall 1.6 | 18 | 14% | 25 |
| cs.Wren 1.0 | 17 | 13% | 29 |
| joe.ADinosaur 1.0 | 12 | 10% | 13 |
| evd.X1 0.01 | 12 | 10% | 13 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| mz.Cork 0.1 | 7 | 6% | 13 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.8 | 130 / 210 | 2.46 | 19.0% | 30809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.0% | 130 |
| myl.nano.Graviton 1.10 | 3.2 | 11.4% | 19 |
| ntc.Opposite 1.5 | 3.7 | 10.9% | 13 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.1% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 6 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.3% | 3 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 3 |
| disan.Chair 2.2.0 | 7.8 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 10 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.1 | 23 / 35 | 5139 |
| 2 | 1 | 67.8 | 82.5 | 19 / 35 | 5289 |
| 3 | 1 | 69.5 | 86.7 | 24 / 35 | 5054 |
| 4 | 1 | 67.2 | 81.9 | 21 / 35 | 4747 |
| 5 | 1 | 68.2 | 81.9 | 20 / 35 | 5426 |
| 6 | 1 | 68.5 | 84.4 | 23 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 47 | 87% |
| myl.nano.Graviton 1.10 | 32 | 84% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| DBall.NUKE 0.1 | 15 | 93% |
| donjezza.Muncho 1.0 | 14 | 93% |
| disan.Chair 2.2.0 | 8 | 100% |
| ntc.Opposite 1.5 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 20 | 25% | 47 |
| stelo.AreaTargetingBot 1.1 | 18 | 23% | 53 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 15% | 32 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 17 |
| ntc.Opposite 1.5 | 9 | 11% | 13 |
| DBall.NUKE 0.1 | 3 | 4% | 15 |
| donjezza.Muncho 1.0 | 3 | 4% | 13 |
| disan.Chair 2.2.0 | 3 | 4% | 9 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.0 | 82 / 210 | 3.61 | 15.5% | 25972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 15.5% | 82 |
| oog.melee.Capulet 1.2 | 2.7 | 13.7% | 53 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.8% | 33 |
| yagami.Tidus 0.11 | 4.0 | 12.4% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.2% | 20 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 7 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.8 | 14 / 35 | 4356 |
| 2 | 1 | 66.0 | 76.5 | 15 / 35 | 4809 |
| 3 | 1 | 65.4 | 75.2 | 15 / 35 | 4471 |
| 4 | 2 | 61.2 | 63.8 | 12 / 35 | 4022 |
| 5 | 1 | 63.3 | 69.8 | 12 / 35 | 4366 |
| 6 | 1 | 61.6 | 63.8 | 14 / 35 | 3948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 46% |
| yagami.Tidus 0.11 | 24 | 96% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 80% |
| ejb.Polaris 1.0.1 | 5 | 80% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 38% | 69 |
| yagami.Tidus 0.11 | 25 | 20% | 41 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 33 |
| ejb.Polaris 1.0.1 | 11 | 9% | 15 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |
| kurios.DOSexe .9a | 5 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.2 | 132 / 210 | 2.88 | 17.3% | 26657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.3% | 132 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 16 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 13 |
| wee.Gem 1.8.4 | 3.7 | 11.2% | 23 |
| ratosh.Nobo 0.21 | 4.3 | 10.6% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.5 | 9.3% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.6% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 5 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 73.7 | 20 / 35 | 4068 |
| 2 | 1 | 62.2 | 66.0 | 17 / 35 | 4343 |
| 3 | 1 | 68.8 | 88.9 | 27 / 35 | 4830 |
| 4 | 1 | 66.0 | 78.1 | 24 / 35 | 4458 |
| 5 | 1 | 67.4 | 84.8 | 23 / 35 | 4570 |
| 6 | 1 | 66.7 | 83.5 | 21 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 89% |
| wee.Gem 1.8.4 | 33 | 100% |
| wompi.Quokka 1.6 | 29 | 86% |
| ratosh.Nobo 0.21 | 14 | 79% |
| m3thos.Eva00 1.1 | 13 | 92% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 386. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 14 | 18% | 19 |
| bzdp.Pansy 2.1 | 11 | 14% | 43 |
| ratosh.Nobo 0.21 | 10 | 13% | 25 |
| maribo.FollowFire 1 | 10 | 13% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 11% | 18 |
| m3thos.Eva00 1.1 | 9 | 11% | 18 |
| wompi.Quokka 1.6 | 6 | 8% | 26 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 10 |
| wee.Gem 1.8.4 | 4 | 5% | 41 |

## Melee bench: F15

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 84.5 | 118 / 210 | 2.40 | 20.5% | 44778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 20.5% | 118 |
| wompi.Wallaby 5.1 | 1.8 | 18.2% | 77 |
| mz.NanoGod 2.02 | 3.0 | 13.4% | 11 |
| ayk.WallHugger 1.0 | 4.3 | 10.4% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.6% | 3 |
| stuff.Vlad 0.1 | 5.8 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.3 | 20 / 35 | 7678 |
| 2 | 1 | 72.7 | 87.6 | 22 / 35 | 7766 |
| 3 | 2 | 69.1 | 76.2 | 15 / 35 | 6720 |
| 4 | 1 | 70.0 | 79.4 | 18 / 35 | 7125 |
| 5 | 1 | 73.1 | 89.8 | 24 / 35 | 7952 |
| 6 | 1 | 72.1 | 85.7 | 19 / 35 | 7537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 74% |
| mz.NanoGod 2.02 | 17 | 76% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 7 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |

Hadur died in 93 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 51% | 133 |
| mz.NanoGod 2.02 | 25 | 27% | 41 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 13 |
| ayk.WallHugger 1.0 | 6 | 6% | 12 |
| stelo.PianistNano 1.2 | 5 | 5% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.7 | 107 / 210 | 3.55 | 16.7% | 29694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.7% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 22 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 26 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.1% | 14 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 4 |
| conscience.Electron 1.3g | 6.8 | 8.3% | 1 |
| ap.Frederick 1.1 | 8.2 | 7.1% | 8 |
| dl.BetterWalls 1.0 | 9.0 | 6.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 66.3 | 15 / 35 | 4914 |
| 2 | 1 | 64.8 | 71.7 | 18 / 35 | 4837 |
| 3 | 1 | 67.5 | 77.8 | 20 / 35 | 5608 |
| 4 | 1 | 65.6 | 72.4 | 21 / 35 | 5135 |
| 5 | 1 | 66.6 | 79.4 | 18 / 35 | 4843 |
| 6 | 1 | 61.0 | 62.5 | 15 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 91% |
| dummy.micro.Sparrow 2.5 | 22 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 100% |
| bvh.micro.Freya 0.3 | 19 | 84% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 23% | 65 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 39 |
| conscience.Electron 1.3g | 16 | 16% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 13 |
| bvh.micro.Freya 0.3 | 11 | 11% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 29 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 15 |
| dl.BetterWalls 1.0 | 6 | 6% | 9 |

## Melee bench: F17

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.6 | 155 / 210 | 2.30 | 21.3% | 42906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.3% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 18 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 11 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 5 |
| dsw.StaticD 1.0 | 5.5 | 9.1% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 9.2 | 5.4% | 0 |
| sample.Corners 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 87.0 | 27 / 35 | 7642 |
| 2 | 1 | 68.1 | 74.9 | 21 / 35 | 6214 |
| 3 | 1 | 70.5 | 83.5 | 26 / 35 | 6625 |
| 4 | 1 | 73.6 | 92.1 | 29 / 35 | 7729 |
| 5 | 1 | 71.7 | 87.0 | 25 / 35 | 7234 |
| 6 | 1 | 72.3 | 89.2 | 27 / 35 | 7462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 96% |
| sul.Lunar 1.1 | 46 | 100% |
| supersample.SuperBoxBot 1.0 | 29 | 93% |
| dsw.StaticD 1.0 | 12 | 67% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 36% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 67 |
| dsw.StaticD 1.0 | 11 | 20% | 22 |
| sample.Corners 1.0 | 4 | 7% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 6 |
| sul.Lunar 1.1 | 2 | 4% | 51 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.8 | 120 / 210 | 2.72 | 18.6% | 37378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.6% | 120 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.2% | 26 |
| mld.Wisdom 1.0 | 3.8 | 12.0% | 18 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.1% | 10 |
| amz.NanoClone 1.41 | 5.5 | 9.7% | 10 |
| sample.Walls 1.0 | 7.2 | 7.6% | 3 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.8 | 20 / 35 | 6033 |
| 2 | 1 | 68.8 | 82.5 | 21 / 35 | 6291 |
| 3 | 1 | 68.2 | 80.6 | 19 / 35 | 6347 |
| 4 | 1 | 65.1 | 73.0 | 16 / 35 | 5468 |
| 5 | 1 | 71.7 | 93.0 | 25 / 35 | 6854 |
| 6 | 1 | 67.4 | 78.1 | 19 / 35 | 6385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 90% |
| radnor.DoctorBob 1.42 | 33 | 79% |
| mld.Wisdom 1.0 | 18 | 72% |
| sample.Walls 1.0 | 12 | 100% |
| amz.NanoClone 1.41 | 10 | 70% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| jangs.ns51 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 28% | 41 |
| radnor.DoctorBob 1.42 | 16 | 18% | 45 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 17% | 59 |
| KiraNL.Chupacabra 0.4 | 14 | 16% | 26 |
| amz.NanoClone 1.41 | 11 | 12% | 20 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| jangs.ns51 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

