# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.7 | 150 / 210 | 2.11 | 21.4% | 43830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.4% | 150 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 23 |
| mz.AntiGrav 1.0 | 2.7 | 14.0% | 12 |
| mld.Infinity 2.2 | 4.0 | 12.8% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 7 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 3 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.3 | 26 / 35 | 7316 |
| 2 | 1 | 72.0 | 88.9 | 24 / 35 | 7091 |
| 3 | 1 | 74.3 | 94.6 | 27 / 35 | 7971 |
| 4 | 1 | 70.7 | 80.6 | 23 / 35 | 7118 |
| 5 | 1 | 71.9 | 85.7 | 25 / 35 | 7398 |
| 6 | 1 | 72.3 | 88.9 | 25 / 35 | 6936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 96% |
| radnor.DoctorBob 1.42 | 36 | 86% |
| mld.Infinity 2.2 | 31 | 90% |
| amz.NanoClone 1.41 | 6 | 83% |
| sample.Walls 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 42% | 69 |
| mz.AntiGrav 1.0 | 12 | 20% | 69 |
| mld.Infinity 2.2 | 8 | 13% | 38 |
| amz.NanoClone 1.41 | 4 | 7% | 10 |
| GarmBox.Oranges 1.0 | 4 | 7% | 5 |
| sample.Walls 1.0 | 3 | 5% | 8 |
| jangs.ns51 1.0 | 3 | 5% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.4 | 131 / 210 | 2.31 | 19.0% | 33247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.3 | 19.0% | 131 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.3% | 44 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 16 |
| maribo.melee.BMV 0.1 | 4.5 | 10.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.8% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.6% | 3 |
| fullsail.SweetTea 1.1 | 7.5 | 6.9% | 7 |
| bzdp.BoxCar 2.0 | 8.5 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.9 | 23 / 35 | 5578 |
| 2 | 1 | 69.4 | 91.1 | 25 / 35 | 5109 |
| 3 | 1 | 71.1 | 92.1 | 28 / 35 | 6079 |
| 4 | 1 | 70.7 | 90.5 | 25 / 35 | 6172 |
| 5 | 1 | 70.0 | 91.7 | 20 / 35 | 5768 |
| 6 | 3 | 60.6 | 58.1 | 10 / 35 | 4541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 64 | 84% |
| oog.melee.Mercutio 1.0 | 63 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 33% | 80 |
| mld.DustBunny 3.8 | 25 | 31% | 70 |
| cs.Grudge 1.0 | 8 | 10% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 14 |
| maribo.melee.BMV 0.1 | 5 | 6% | 11 |
| fullsail.SweetTea 1.1 | 5 | 6% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 15 |
| zyx.nano.Ant 1.1 | 2 | 3% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 87.1 | 141 / 210 | 2.16 | 20.6% | 38134 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 20.6% | 141 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 29 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.2% | 7 |
| cb.nano.Insomnia 1.0 | 4.3 | 9.9% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.5% | 18 |
| fm.mammillarias 1.3 | 6.0 | 8.8% | 2 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.5% | 5 |
| sample.Fire 1.0 | 9.2 | 5.2% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 84.4 | 22 / 35 | 6635 |
| 2 | 1 | 70.4 | 86.0 | 23 / 35 | 6500 |
| 3 | 1 | 70.9 | 85.4 | 23 / 35 | 6659 |
| 4 | 1 | 71.7 | 91.4 | 26 / 35 | 6226 |
| 5 | 1 | 69.6 | 85.7 | 22 / 35 | 6011 |
| 6 | 1 | 71.3 | 89.8 | 25 / 35 | 6103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 38 | 71% |
| cb.nano.Insomnia 1.0 | 28 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| sample.Fire 1.0 | 6 | 100% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 18 | 26% | 41 |
| myl.micro.Troodon 1.10 | 16 | 23% | 64 |
| myl.nano.KomoriNinja 1.1 | 11 | 16% | 46 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 15 |
| fm.mammillarias 1.3 | 7 | 10% | 11 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 16 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 9 |
| sample.Fire 1.0 | 1 | 1% | 5 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.1 | 150 / 210 | 2.07 | 21.0% | 40339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.0% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.6% | 16 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.1% | 13 |
| tj.zombie1n 1.0.1 | 6.0 | 8.6% | 5 |
| yk.JahMicro 1.0 | 6.5 | 8.2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.1% | 8 |
| repositorio.NanoStep 1.0 | 9.0 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 27 / 35 | 7212 |
| 2 | 1 | 68.0 | 78.1 | 20 / 35 | 5814 |
| 3 | 1 | 72.3 | 92.7 | 26 / 35 | 7318 |
| 4 | 1 | 71.0 | 87.6 | 24 / 35 | 6841 |
| 5 | 1 | 70.2 | 86.7 | 25 / 35 | 6534 |
| 6 | 1 | 71.5 | 90.8 | 28 / 35 | 6620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 86% |
| stelo.SoJNanoMelee 1.1 | 53 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 21 | 76% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 36% | 75 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 43 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 11 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 25 |
| tj.zombie1n 1.0.1 | 3 | 5% | 6 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.7 | 86 / 210 | 3.73 | 15.8% | 28456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 15.8% | 86 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 37 |
| ahf.NanoAndrew .4 | 3.7 | 11.1% | 23 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.1% | 26 |
| EBBU.Sim2 1.02 | 5.2 | 10.2% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.2% | 8 |
| sam.Samspin 1.0 | 6.7 | 9.1% | 13 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 8.3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 7.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.7 | 15 / 35 | 4554 |
| 2 | 1 | 63.7 | 70.2 | 15 / 35 | 4815 |
| 3 | 1 | 64.2 | 68.6 | 15 / 35 | 5268 |
| 4 | 1 | 63.9 | 72.7 | 15 / 35 | 4630 |
| 5 | 1 | 62.8 | 67.6 | 15 / 35 | 4765 |
| 6 | 1 | 61.5 | 66.3 | 11 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 89% |
| oog.melee.Corsair 1.0 | 34 | 62% |
| zyx.nano.BacillusComma 1.0 | 11 | 82% |
| ahf.NanoAndrew .4 | 9 | 56% |
| EBBU.Sim2 1.02 | 6 | 83% |
| sam.Samspin 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 19% | 48 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 50 |
| zyx.nano.BacillusComma 1.0 | 18 | 14% | 24 |
| ahf.NanoAndrew .4 | 13 | 10% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 10% | 16 |
| EBBU.Sim2 1.02 | 13 | 10% | 15 |
| robar.nano.Assertive_Melee 0.2 | 11 | 9% | 15 |
| sam.Samspin 1.0 | 9 | 7% | 14 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 137 / 210 | 2.34 | 19.2% | 33008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.2% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 38 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.1% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.2% | 9 |
| fm.claire 1.7 | 6.0 | 8.8% | 2 |
| sample.SpinBot 1.0 | 6.8 | 8.0% | 4 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.0% | 5 |
| pa.Improved 1.0 | 8.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.4 | 24 / 35 | 5851 |
| 2 | 1 | 70.0 | 91.1 | 25 / 35 | 5353 |
| 3 | 1 | 68.7 | 86.3 | 22 / 35 | 5301 |
| 4 | 1 | 67.5 | 79.4 | 19 / 35 | 5614 |
| 5 | 1 | 68.5 | 85.7 | 23 / 35 | 5416 |
| 6 | 1 | 68.7 | 83.5 | 24 / 35 | 5473 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 81% |
| oog.melee.CapuletDroid 1.1 | 35 | 100% |
| gh.nano.Grofvuil 0.2 | 19 | 89% |
| winamp32.micro.MicroMacro 1.0 | 13 | 69% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| sample.SpinBot 1.0 | 11 | 91% |
| fm.claire 1.7 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 38% | 72 |
| gh.nano.Grofvuil 0.2 | 14 | 19% | 37 |
| winamp32.micro.MicroMacro 1.0 | 10 | 14% | 20 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 47 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 13 |
| fm.claire 1.7 | 3 | 4% | 8 |
| sample.SpinBot 1.0 | 2 | 3% | 7 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| kurios.DOSexe .9b | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.0 | 102 / 210 | 2.71 | 18.1% | 34355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.1% | 102 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.3% | 33 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.8% | 27 |
| mz.MicroGodMelee 1 | 3.8 | 13.9% | 40 |
| DBall.Anarchy 0.1 | 5.0 | 8.3% | 3 |
| acogdev.alpha 0.2 | 7.0 | 6.6% | 0 |
| caimano.Furia_Ceca 0.22 | 7.2 | 6.9% | 1 |
| mbro.Detektor3 0.1.1 | 8.2 | 6.2% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 1 |
| fire219.CatBot 1.0 | 9.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 78.4 | 15 / 35 | 5282 |
| 2 | 1 | 67.1 | 79.4 | 20 / 35 | 5586 |
| 3 | 1 | 68.4 | 81.0 | 15 / 35 | 6242 |
| 4 | 1 | 68.5 | 85.7 | 19 / 35 | 5539 |
| 5 | 1 | 67.6 | 80.3 | 18 / 35 | 5627 |
| 6 | 1 | 67.9 | 81.0 | 15 / 35 | 6079 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 94% |
| mz.MicroGodMelee 1 | 45 | 58% |
| gh.micro.Gruweltje 0.7 | 20 | 50% |
| DBall.Anarchy 0.1 | 9 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 35% | 63 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 44 |
| spinnercat.micro.Tyger 0.1 | 16 | 15% | 59 |
| acogdev.alpha 0.2 | 10 | 9% | 13 |
| caimano.Furia_Ceca 0.22 | 8 | 7% | 11 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 74.9 | 112 / 210 | 3.26 | 17.3% | 32481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 17.3% | 112 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.5% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.4% | 6 |
| germ.TheMind .2 | 5.7 | 9.2% | 9 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.8% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 7.9% | 2 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 4 |
| sample.Crazy 1.0 | 7.8 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 70.8 | 18 / 35 | 4923 |
| 2 | 1 | 69.7 | 87.3 | 23 / 35 | 5915 |
| 3 | 1 | 65.5 | 71.7 | 17 / 35 | 5470 |
| 4 | 1 | 65.6 | 71.4 | 20 / 35 | 5193 |
| 5 | 1 | 66.3 | 74.9 | 18 / 35 | 5375 |
| 6 | 1 | 65.9 | 73.3 | 16 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| germ.TheMind .2 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 35% | 104 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 35 |
| germ.TheMind .2 | 13 | 13% | 22 |
| awesomeness.Elite 1.0 | 9 | 9% | 14 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 9 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.6 | 147 / 210 | 2.20 | 19.7% | 31404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.7% | 147 |
| rz.HawkOnFire 0.1 | 2.2 | 14.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.5% | 15 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 10 |
| maribo.IotaCT 1.1 | 4.8 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.4% | 4 |
| spinnercat.Omen 1.0 | 7.2 | 8.3% | 1 |
| ratosh.Wesco 1.4 | 8.0 | 7.5% | 3 |
| stelo.PatternRobot 1.0 | 8.7 | 7.2% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.3 | 24 / 35 | 5649 |
| 2 | 1 | 71.3 | 91.7 | 27 / 35 | 5325 |
| 3 | 1 | 70.4 | 86.0 | 25 / 35 | 5394 |
| 4 | 1 | 69.2 | 86.0 | 23 / 35 | 4924 |
| 5 | 1 | 70.2 | 86.3 | 26 / 35 | 5188 |
| 6 | 1 | 68.4 | 81.3 | 22 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 96% |
| nz.jdc.nano.GridFu 1.0 | 30 | 97% |
| timmit.nano.TimDog 0.33 | 11 | 64% |
| stelo.PatternRobot 1.0 | 11 | 82% |
| spinnercat.Omen 1.0 | 10 | 100% |
| maribo.IotaCT 1.1 | 9 | 78% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 18 | 29% | 31 |
| rz.HawkOnFire 0.1 | 11 | 17% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 16% | 13 |
| nz.jdc.nano.GridFu 1.0 | 8 | 13% | 43 |
| ratosh.Wesco 1.4 | 5 | 8% | 12 |
| stelo.PatternRobot 1.0 | 4 | 6% | 17 |
| maribo.IotaCT 1.1 | 4 | 6% | 12 |
| spinnercat.Omen 1.0 | 3 | 5% | 14 |

## Melee bench: F10

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.4 | 175 / 210 | 1.59 | 22.1% | 41037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 22.1% | 175 |
| baal.nano.N 1.42 | 2.5 | 11.5% | 8 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 14 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.2% | 0 |
| zyx.micro.Ant 1.1 | 5.5 | 8.8% | 3 |
| sanja.First 0.1 | 5.8 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.6% | 1 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.3% | 3 |
| cvt.Firsty 1.0 | 8.5 | 7.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.7 | 27 / 35 | 7050 |
| 2 | 1 | 73.3 | 94.6 | 31 / 35 | 7289 |
| 3 | 1 | 72.1 | 94.6 | 32 / 35 | 6439 |
| 4 | 1 | 72.2 | 93.7 | 27 / 35 | 6869 |
| 5 | 1 | 71.8 | 93.7 | 31 / 35 | 6406 |
| 6 | 1 | 71.5 | 90.5 | 27 / 35 | 6984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 95% |
| baal.nano.N 1.42 | 35 | 91% |
| cvt.Firsty 1.0 | 29 | 100% |
| amk.Punbot.Punbot 0.01 | 22 | 95% |
| sanja.First 0.1 | 22 | 100% |
| zyx.micro.Ant 1.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 9 | 25% | 38 |
| zyx.micro.Ant 1.1 | 9 | 25% | 33 |
| tvv.nano.Polaris 1.2 | 6 | 17% | 53 |
| sanja.First 0.1 | 3 | 8% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 16 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 9 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 30 |

## Melee bench: F11

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.6 | 91 / 210 | 3.74 | 15.9% | 32125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 14.7% | 56 |
| hadur117.micro.SaorWTR 0.1 | 1.5 | 15.9% | 91 |
| cs.Wren 1.0 | 3.2 | 12.9% | 20 |
| js.PinBall 1.6 | 4.2 | 11.1% | 14 |
| mz.Cork 0.1 | 4.7 | 10.9% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 3 |
| evd.X1 0.01 | 7.0 | 8.2% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 5 |
| PSW.Relentless 0.1 | 9.5 | 5.3% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 64.8 | 14 / 35 | 5032 |
| 2 | 1 | 63.4 | 67.0 | 13 / 35 | 5539 |
| 3 | 1 | 66.3 | 77.8 | 18 / 35 | 5625 |
| 4 | 2 | 62.4 | 63.5 | 14 / 35 | 5278 |
| 5 | 1 | 65.6 | 75.6 | 16 / 35 | 5459 |
| 6 | 2 | 63.9 | 68.9 | 16 / 35 | 5192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 84% |
| cs.Wren 1.0 | 23 | 96% |
| js.PinBall 1.6 | 10 | 60% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| donjezza.Jezza 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 120 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 42 | 35% | 98 |
| cs.Wren 1.0 | 19 | 16% | 28 |
| evd.X1 0.01 | 14 | 12% | 14 |
| js.PinBall 1.6 | 13 | 11% | 20 |
| joe.ADinosaur 1.0 | 13 | 11% | 14 |
| mz.Cork 0.1 | 9 | 8% | 16 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| jsal.Jsalbot 1.0 | 4 | 3% | 9 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.2 | 140 / 210 | 2.42 | 19.2% | 30639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 19.2% | 140 |
| myl.nano.Graviton 1.10 | 2.0 | 12.0% | 22 |
| ntc.Opposite 1.5 | 3.5 | 11.2% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 9.9% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 1 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.7% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 7 |
| pbg.R2D2 1.0 | 10.0 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 79.0 | 20 / 35 | 4881 |
| 2 | 1 | 67.4 | 79.4 | 22 / 35 | 5046 |
| 3 | 1 | 69.9 | 87.3 | 25 / 35 | 5559 |
| 4 | 1 | 68.5 | 83.5 | 25 / 35 | 5019 |
| 5 | 1 | 69.6 | 89.5 | 27 / 35 | 4858 |
| 6 | 1 | 68.9 | 86.3 | 21 / 35 | 5276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 85% |
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 20 | 95% |
| disan.Chair 2.2.0 | 17 | 94% |
| ntc.Opposite 1.5 | 16 | 94% |
| donjezza.Muncho 1.0 | 11 | 100% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 21% | 36 |
| pfvicm.Sobieski 7.2.3b | 14 | 19% | 22 |
| myl.nano.Graviton 1.10 | 13 | 18% | 40 |
| ntc.Opposite 1.5 | 8 | 11% | 26 |
| disan.Chair 2.2.0 | 8 | 11% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 22 |
| pbg.R2D2 1.0 | 5 | 7% | 9 |
| DBall.NUKE 0.1 | 2 | 3% | 19 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.7 | 72 / 210 | 3.54 | 15.7% | 26591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 15.7% | 72 |
| oog.melee.Capulet 1.2 | 2.7 | 13.9% | 57 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.4% | 29 |
| yagami.Tidus 0.11 | 5.0 | 11.6% | 9 |
| ejb.Polaris 1.0.1 | 5.5 | 10.9% | 14 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 67.9 | 10 / 35 | 4019 |
| 2 | 1 | 66.3 | 79.0 | 16 / 35 | 4147 |
| 3 | 1 | 64.0 | 68.3 | 15 / 35 | 4339 |
| 4 | 2 | 62.5 | 67.0 | 8 / 35 | 4132 |
| 5 | 1 | 64.6 | 72.4 | 13 / 35 | 4760 |
| 6 | 1 | 65.9 | 75.9 | 10 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 97% |
| oog.melee.Capulet 1.2 | 29 | 41% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 67% |
| yagami.Tidus 0.11 | 16 | 75% |
| ejb.Polaris 1.0.1 | 5 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 38% | 68 |
| yagami.Tidus 0.11 | 23 | 17% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 16% | 39 |
| step.nanoPri 1.0 | 10 | 7% | 11 |
| ejb.Polaris 1.0.1 | 9 | 7% | 14 |
| kawigi.micro.Shiz 1.1 | 7 | 5% | 28 |
| kurios.DOSexe .9a | 7 | 5% | 8 |
| stelo.MirrorNano 1.3 | 7 | 5% | 8 |

## Melee bench: F14

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.2 | 139 / 210 | 2.60 | 18.5% | 29718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.5% | 139 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 14 |
| wee.Gem 1.8.4 | 3.3 | 11.7% | 25 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 15 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 7 |
| m3thos.Eva00 1.1 | 5.7 | 9.9% | 8 |
| bayen.UbaMicro 1.4 | 7.3 | 7.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.3 | 23 / 35 | 5290 |
| 2 | 1 | 67.6 | 80.3 | 21 / 35 | 4915 |
| 3 | 1 | 65.6 | 75.6 | 23 / 35 | 4375 |
| 4 | 1 | 66.8 | 78.7 | 23 / 35 | 4750 |
| 5 | 1 | 68.0 | 84.1 | 26 / 35 | 4776 |
| 6 | 1 | 69.2 | 87.3 | 23 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 96% |
| wee.Gem 1.8.4 | 36 | 94% |
| wompi.Quokka 1.6 | 25 | 88% |
| m3thos.Eva00 1.1 | 16 | 81% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 12 | 17% | 22 |
| m3thos.Eva00 1.1 | 11 | 15% | 19 |
| maribo.FollowFire 1 | 9 | 13% | 10 |
| bzdp.Pansy 2.1 | 8 | 11% | 50 |
| wompi.Quokka 1.6 | 8 | 11% | 27 |
| wee.Gem 1.8.4 | 7 | 10% | 48 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 8 |
| bayen.UbaMicro 1.4 | 4 | 6% | 14 |

## Melee bench: F15

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 84.2 | 119 / 210 | 2.42 | 20.2% | 43268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.2 | 20.2% | 119 |
| wompi.Wallaby 5.1 | 1.8 | 17.8% | 61 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 18 |
| ayk.WallHugger 1.0 | 4.5 | 10.2% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 5 |
| stuff.Vlad 0.1 | 5.7 | 9.1% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.7% | 1 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 89.2 | 27 / 35 | 7414 |
| 2 | 1 | 70.1 | 79.0 | 18 / 35 | 7113 |
| 3 | 1 | 69.5 | 81.0 | 19 / 35 | 6455 |
| 4 | 1 | 72.3 | 86.0 | 23 / 35 | 7636 |
| 5 | 1 | 71.8 | 88.9 | 17 / 35 | 7492 |
| 6 | 2 | 70.0 | 81.0 | 15 / 35 | 7158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 96 | 77% |
| mz.NanoGod 2.02 | 17 | 53% |
| ayk.WallHugger 1.0 | 13 | 100% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 4 | 75% |
| stuff.Vlad 0.1 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 46% | 123 |
| mz.NanoGod 2.02 | 23 | 25% | 32 |
| ayk.WallHugger 1.0 | 8 | 9% | 18 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 14 |
| stelo.PianistNano 1.2 | 5 | 5% | 7 |
| stuff.Vlad 0.1 | 3 | 3% | 10 |
| drd.Dreadknoght 0.9 | 2 | 2% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.6 | 96 / 210 | 3.65 | 16.1% | 28439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 16.1% | 96 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 25 |
| bvh.micro.Freya 0.3 | 3.3 | 11.9% | 31 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.7% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 9 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.8% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 73.3 | 16 / 35 | 4834 |
| 2 | 1 | 64.6 | 72.4 | 17 / 35 | 4864 |
| 3 | 1 | 63.6 | 68.9 | 14 / 35 | 4725 |
| 4 | 1 | 63.1 | 69.5 | 16 / 35 | 4463 |
| 5 | 1 | 64.4 | 71.1 | 18 / 35 | 4973 |
| 6 | 1 | 62.6 | 68.3 | 15 / 35 | 4580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 86% |
| dummy.micro.Sparrow 2.5 | 21 | 81% |
| bvh.micro.Freya 0.3 | 15 | 60% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 3 | 67% |

Hadur died in 114 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 16% | 56 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 16% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 15% | 38 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 32 |
| conscience.Electron 1.3g | 17 | 15% | 21 |
| bvh.micro.Freya 0.3 | 16 | 14% | 23 |
| dl.BetterWalls 1.0 | 7 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 12 |

## Melee bench: F17

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.6 | 146 / 210 | 2.39 | 21.0% | 42285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 21.0% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 20 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 12 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.3% | 14 |
| dsw.StaticD 1.0 | 5.3 | 9.0% | 7 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.0% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.6% | 2 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.6% | 3 |
| sample.Corners 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 79.4 | 24 / 35 | 7165 |
| 2 | 1 | 72.8 | 92.1 | 25 / 35 | 7303 |
| 3 | 1 | 70.6 | 82.9 | 24 / 35 | 6757 |
| 4 | 1 | 71.4 | 84.1 | 25 / 35 | 7093 |
| 5 | 1 | 72.0 | 87.9 | 25 / 35 | 7295 |
| 6 | 1 | 70.0 | 81.3 | 23 / 35 | 6672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 92% |
| supersample.SuperBoxBot 1.0 | 34 | 85% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dsw.StaticD 1.0 | 8 | 50% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 27% | 60 |
| supersample.SuperBoxBot 1.0 | 12 | 19% | 28 |
| dsw.StaticD 1.0 | 11 | 17% | 18 |
| mme.NikeEnhanced 2.0 | 10 | 16% | 14 |
| sul.Lunar 1.1 | 4 | 6% | 58 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| sample.Corners 1.0 | 2 | 3% | 7 |

## Melee bench: F18

hadur117.micro.SaorWTR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 80.3 | 116 / 210 | 2.78 | 18.5% | 37748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTR 0.1 | 1.0 | 18.5% | 116 |
| radnor.DoctorBob 1.42 | 2.7 | 13.0% | 30 |
| mld.Wisdom 1.0 | 3.7 | 11.5% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 10.9% | 16 |
| KiraNL.Chupacabra 0.4 | 4.3 | 10.5% | 8 |
| amz.NanoClone 1.41 | 5.3 | 10.4% | 12 |
| sample.Walls 1.0 | 7.3 | 7.8% | 5 |
| GarmBox.Oranges 1.0 | 8.2 | 7.3% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 5 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.9 | 19 / 35 | 6175 |
| 2 | 1 | 69.9 | 85.1 | 23 / 35 | 6673 |
| 3 | 1 | 67.6 | 79.7 | 18 / 35 | 6045 |
| 4 | 1 | 69.4 | 83.2 | 20 / 35 | 6893 |
| 5 | 1 | 68.1 | 79.7 | 19 / 35 | 6652 |
| 6 | 1 | 64.5 | 72.1 | 17 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 88% |
| radnor.DoctorBob 1.42 | 35 | 71% |
| KiraNL.Chupacabra 0.4 | 13 | 100% |
| amz.NanoClone 1.41 | 11 | 73% |
| mld.Wisdom 1.0 | 10 | 50% |
| jangs.ns51 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 25 | 27% | 36 |
| radnor.DoctorBob 1.42 | 21 | 22% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 56 |
| KiraNL.Chupacabra 0.4 | 12 | 13% | 24 |
| amz.NanoClone 1.41 | 8 | 9% | 18 |
| GarmBox.Oranges 1.0 | 4 | 4% | 7 |
| sample.Walls 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 8 |

