# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.4 | 117 / 210 | 2.58 | 19.0% | 36320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 19.0% | 117 |
| radnor.DoctorBob 1.42 | 2.5 | 14.9% | 37 |
| mz.AntiGrav 1.0 | 3.2 | 14.2% | 25 |
| mld.Infinity 2.2 | 3.3 | 13.6% | 25 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 3 |
| sample.Walls 1.0 | 6.2 | 7.6% | 2 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 87.6 | 21 / 35 | 6909 |
| 2 | 1 | 70.8 | 85.7 | 22 / 35 | 6638 |
| 3 | 1 | 70.1 | 85.1 | 22 / 35 | 5721 |
| 4 | 1 | 69.0 | 80.6 | 18 / 35 | 6086 |
| 5 | 1 | 68.6 | 82.5 | 19 / 35 | 5572 |
| 6 | 1 | 65.8 | 73.0 | 15 / 35 | 5394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 53 | 92% |
| mld.Infinity 2.2 | 36 | 100% |
| radnor.DoctorBob 1.42 | 29 | 52% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 58% | 87 |
| mz.AntiGrav 1.0 | 18 | 19% | 65 |
| mld.Infinity 2.2 | 7 | 8% | 21 |
| sample.Walls 1.0 | 7 | 8% | 12 |
| amz.NanoClone 1.41 | 5 | 5% | 13 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.1 | 102 / 210 | 2.97 | 16.7% | 26920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.3 | 16.7% | 102 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.3% | 67 |
| mld.DustBunny 3.8 | 2.8 | 13.6% | 11 |
| djdjdj.NanoSkunk10 1.0 | 4.3 | 10.3% | 16 |
| maribo.melee.BMV 0.1 | 4.7 | 10.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.1% | 5 |
| zyx.nano.Ant 1.1 | 7.7 | 7.4% | 2 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.5% | 5 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 86.0 | 14 / 35 | 4884 |
| 2 | 1 | 67.4 | 86.3 | 23 / 35 | 4185 |
| 3 | 1 | 67.4 | 87.0 | 19 / 35 | 4437 |
| 4 | 1 | 68.9 | 89.5 | 23 / 35 | 4935 |
| 5 | 1 | 63.7 | 74.9 | 16 / 35 | 4117 |
| 6 | 3 | 56.1 | 44.8 | 7 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 68 | 68% |
| mld.DustBunny 3.8 | 32 | 97% |
| djdjdj.NanoSkunk10 1.0 | 14 | 93% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| fullsail.SweetTea 1.1 | 3 | 33% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 67% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 46 | 43% | 91 |
| djdjdj.NanoSkunk10 1.0 | 20 | 19% | 37 |
| mld.DustBunny 3.8 | 10 | 9% | 35 |
| cs.Grudge 1.0 | 10 | 9% | 10 |
| zyx.nano.Ant 1.1 | 8 | 7% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 8 |
| fullsail.SweetTea 1.1 | 4 | 4% | 7 |
| maribo.melee.BMV 0.1 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 86.3 | 149 / 210 | 2.23 | 20.1% | 34784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 20.1% | 149 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 31 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.5% | 10 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.8% | 8 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.4% | 0 |
| fm.mammillarias 1.3 | 6.3 | 9.1% | 3 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.9 | 23 / 35 | 5474 |
| 2 | 1 | 71.1 | 89.2 | 26 / 35 | 5658 |
| 3 | 1 | 70.4 | 85.7 | 24 / 35 | 6364 |
| 4 | 1 | 70.0 | 84.4 | 25 / 35 | 6079 |
| 5 | 1 | 68.8 | 81.6 | 26 / 35 | 5441 |
| 6 | 1 | 70.4 | 87.9 | 25 / 35 | 5768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 65 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 96% |
| cb.nano.Insomnia 1.0 | 26 | 92% |
| sp.Nanos.Ember 1.1 | 16 | 94% |
| myl.nano.KomoriNinja 1.1 | 16 | 88% |
| fm.mammillarias 1.3 | 8 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 23% | 73 |
| cb.nano.Insomnia 1.0 | 10 | 16% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 15% | 37 |
| cs.sheldor.Talon 1.1 | 9 | 15% | 18 |
| fm.mammillarias 1.3 | 8 | 13% | 13 |
| myl.nano.KomoriNinja 1.1 | 6 | 10% | 24 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 16 |
| sample.Tracker 1.0 | 2 | 3% | 4 |
| sample.Fire 1.0 | 1 | 2% | 7 |

## Melee bench: F04

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.6 | 129 / 210 | 2.57 | 19.0% | 34782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 19.0% | 129 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.3% | 9 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.2% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.7% | 23 |
| tj.zombie1n 1.0.1 | 5.3 | 9.2% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.2 | 8.8% | 3 |
| yk.JahMicro 1.0 | 6.7 | 8.7% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.4% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.2 | 21 / 35 | 5417 |
| 2 | 1 | 68.4 | 81.9 | 21 / 35 | 5785 |
| 3 | 1 | 67.5 | 80.6 | 20 / 35 | 5678 |
| 4 | 1 | 69.8 | 87.3 | 25 / 35 | 6246 |
| 5 | 1 | 68.3 | 83.2 | 23 / 35 | 5530 |
| 6 | 1 | 67.9 | 80.3 | 19 / 35 | 6126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 51 | 94% |
| stelo.SoJNanoMelee 1.1 | 36 | 97% |
| tvv.micro.Antares 1.1.1 | 18 | 72% |
| yk.JahMicro 1.0 | 12 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| tj.zombie1n 1.0.1 | 6 | 83% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 23% | 74 |
| tvv.micro.Antares 1.1.1 | 19 | 23% | 36 |
| stelo.SoJNanoMelee 1.1 | 12 | 15% | 32 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 11% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 22 |
| yk.JahMicro 1.0 | 7 | 9% | 12 |
| tj.zombie1n 1.0.1 | 5 | 6% | 6 |
| repositorio.NanoStep 1.0 | 2 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 7 |

## Melee bench: F05

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.3 | 85 / 210 | 3.76 | 15.4% | 26876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 15.4% | 85 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 32 |
| ahf.NanoAndrew .4 | 3.0 | 11.7% | 26 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 24 |
| sam.Samspin 1.0 | 5.5 | 10.0% | 12 |
| EBBU.Sim2 1.02 | 5.7 | 10.0% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.1% | 14 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 9.1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 72.1 | 16 / 35 | 4246 |
| 2 | 1 | 65.6 | 74.9 | 19 / 35 | 4962 |
| 3 | 1 | 60.1 | 61.0 | 10 / 35 | 4365 |
| 4 | 1 | 60.7 | 64.1 | 10 / 35 | 4416 |
| 5 | 1 | 65.4 | 79.7 | 14 / 35 | 4726 |
| 6 | 1 | 60.9 | 64.1 | 16 / 35 | 4161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 90% |
| oog.melee.Corsair 1.0 | 29 | 69% |
| ahf.NanoAndrew .4 | 24 | 75% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 23 | 18% | 37 |
| simonton.nano.MeleeSeed 1.8 | 19 | 15% | 42 |
| oog.melee.Corsair 1.0 | 17 | 14% | 42 |
| robar.nano.Assertive_Melee 0.2 | 15 | 12% | 17 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 19 |
| sam.Samspin 1.0 | 13 | 10% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 10% | 12 |
| EBBU.Sim2 1.02 | 9 | 7% | 18 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.1 | 151 / 210 | 2.07 | 19.4% | 30171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 19.4% | 151 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 17 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.9% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 6 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.2 | 7.6% | 3 |
| pa.Improved 1.0 | 9.0 | 6.2% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 27 / 35 | 5004 |
| 2 | 1 | 69.2 | 88.9 | 23 / 35 | 5332 |
| 3 | 1 | 70.0 | 92.1 | 27 / 35 | 5225 |
| 4 | 1 | 69.5 | 93.0 | 27 / 35 | 4934 |
| 5 | 1 | 68.2 | 86.0 | 24 / 35 | 4628 |
| 6 | 1 | 67.6 | 80.3 | 23 / 35 | 5048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 93% |
| oog.melee.CapuletDroid 1.1 | 34 | 85% |
| gh.nano.Grofvuil 0.2 | 22 | 86% |
| arthord.NanoSatanMelee Beta | 13 | 85% |
| winamp32.micro.MicroMacro 1.0 | 10 | 70% |
| sample.SpinBot 1.0 | 9 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 64 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 23% | 79 |
| gh.nano.Grofvuil 0.2 | 11 | 17% | 41 |
| oog.melee.CapuletDroid 1.1 | 11 | 17% | 21 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 16 |
| sample.SpinBot 1.0 | 5 | 8% | 13 |
| fm.claire 1.7 | 4 | 6% | 13 |
| pa.Improved 1.0 | 3 | 5% | 4 |
| kurios.DOSexe .9b | 1 | 2% | 4 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.7 | 90 / 210 | 2.56 | 17.7% | 31318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 17.7% | 90 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.7% | 54 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.1% | 21 |
| mz.MicroGodMelee 1 | 3.5 | 12.7% | 33 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 7 |
| caimano.Furia_Ceca 0.22 | 5.8 | 8.0% | 2 |
| mbro.Detektor3 0.1.1 | 8.0 | 6.2% | 1 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 1 |
| el.JumpShoot 0.2 | 8.5 | 6.3% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 16 / 35 | 5472 |
| 2 | 1 | 66.7 | 82.5 | 12 / 35 | 5125 |
| 3 | 1 | 66.9 | 85.1 | 13 / 35 | 4989 |
| 4 | 1 | 67.9 | 84.4 | 15 / 35 | 5521 |
| 5 | 1 | 64.5 | 73.7 | 15 / 35 | 4830 |
| 6 | 1 | 68.0 | 84.8 | 19 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.micro.Gruweltje 0.7 | 44 | 25% |
| spinnercat.micro.Tyger 0.1 | 43 | 84% |
| mz.MicroGodMelee 1 | 37 | 46% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| el.JumpShoot 0.2 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 55 | 45% | 75 |
| mz.MicroGodMelee 1 | 34 | 28% | 52 |
| spinnercat.micro.Tyger 0.1 | 15 | 12% | 43 |
| caimano.Furia_Ceca 0.22 | 4 | 3% | 5 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| acogdev.alpha 0.2 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 16 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 9 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.2 | 91 / 210 | 3.95 | 15.4% | 28964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.5 | 15.4% | 91 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.8% | 38 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.8% | 5 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 8.9% | 5 |
| germ.TheMind .2 | 5.7 | 9.2% | 10 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 5 |
| sample.Crazy 1.0 | 8.2 | 7.3% | 4 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.3% | 7 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.3 | 16 / 35 | 4938 |
| 2 | 2 | 62.8 | 68.6 | 15 / 35 | 4542 |
| 3 | 2 | 61.8 | 63.5 | 16 / 35 | 4560 |
| 4 | 2 | 62.2 | 64.1 | 13 / 35 | 5075 |
| 5 | 1 | 62.8 | 66.7 | 16 / 35 | 4595 |
| 6 | 1 | 64.7 | 72.1 | 15 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 47% |
| qualidafial.MajorDick 1.0.1 | 13 | 92% |
| germ.TheMind .2 | 9 | 89% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| awesomeness.Elite 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 53 | 45% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 21% | 37 |
| qualidafial.MajorDick 1.0.1 | 10 | 8% | 16 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 9 | 8% | 14 |
| awesomeness.Elite 1.0 | 6 | 5% | 9 |
| germ.TheMind .2 | 5 | 4% | 16 |
| mym.EdgeStalker 1.0 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.7 | 127 / 210 | 2.47 | 17.9% | 24054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 17.9% | 127 |
| rz.HawkOnFire 0.1 | 2.3 | 13.5% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.3 | 11.1% | 7 |
| maribo.IotaCT 1.1 | 4.5 | 10.4% | 10 |
| timmit.nano.TimDog 0.33 | 6.5 | 9.1% | 7 |
| spinnercat.Omen 1.0 | 6.8 | 8.8% | 5 |
| stelo.PatternRobot 1.0 | 8.2 | 7.7% | 13 |
| ratosh.Wesco 1.4 | 8.2 | 7.7% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.2 | 19 / 35 | 3846 |
| 2 | 1 | 63.4 | 69.8 | 17 / 35 | 3664 |
| 3 | 1 | 68.9 | 88.9 | 21 / 35 | 4089 |
| 4 | 1 | 68.3 | 86.0 | 23 / 35 | 4002 |
| 5 | 1 | 68.4 | 87.3 | 25 / 35 | 4252 |
| 6 | 1 | 68.9 | 87.9 | 22 / 35 | 4201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 53 | 85% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| stelo.PatternRobot 1.0 | 13 | 69% |
| dmh.robocode.robot.RedDwarf 0.4 | 13 | 77% |
| maribo.IotaCT 1.1 | 11 | 73% |
| spinnercat.Omen 1.0 | 11 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 22 | 27% | 56 |
| dmh.robocode.robot.RedDwarf 0.4 | 16 | 19% | 24 |
| stelo.PatternRobot 1.0 | 13 | 16% | 22 |
| maribo.IotaCT 1.1 | 10 | 12% | 23 |
| nz.jdc.nano.GridFu 1.0 | 7 | 8% | 40 |
| timmit.nano.TimDog 0.33 | 6 | 7% | 17 |
| ratosh.Wesco 1.4 | 5 | 6% | 8 |
| spinnercat.Omen 1.0 | 3 | 4% | 17 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.2 | 161 / 210 | 1.98 | 20.1% | 34186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 20.1% | 161 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.9% | 24 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 3 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.9% | 1 |
| zyx.micro.Ant 1.1 | 5.7 | 8.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 2 |
| sanja.First 0.1 | 6.7 | 8.3% | 5 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.7% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 28 / 35 | 5208 |
| 2 | 1 | 68.6 | 85.4 | 24 / 35 | 5704 |
| 3 | 1 | 69.4 | 87.0 | 27 / 35 | 5514 |
| 4 | 1 | 71.4 | 94.6 | 28 / 35 | 6283 |
| 5 | 1 | 70.2 | 91.7 | 26 / 35 | 5808 |
| 6 | 1 | 69.9 | 90.5 | 28 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 89% |
| baal.nano.N 1.42 | 26 | 96% |
| cvt.Firsty 1.0 | 23 | 96% |
| sanja.First 0.1 | 23 | 96% |
| zyx.micro.Ant 1.1 | 19 | 89% |
| amk.Punbot.Punbot 0.01 | 15 | 87% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 88% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 27% | 40 |
| tvv.nano.Polaris 1.2 | 11 | 22% | 57 |
| baal.nano.N 1.42 | 7 | 14% | 25 |
| Grystrion.TrackerWO 1.0 | 6 | 12% | 18 |
| squidM.TentalceMeleeNano 1.1 | 3 | 6% | 11 |
| amk.Punbot.Punbot 0.01 | 3 | 6% | 6 |
| sanja.First 0.1 | 2 | 4% | 24 |
| cvt.Firsty 1.0 | 2 | 4% | 17 |
| sample.RamFire 1.0 | 2 | 4% | 7 |

## Melee bench: F11

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 63.2 | 39 / 210 | 4.31 | 13.6% | 27103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 14.7% | 95 |
| cs.Wren 1.0 | 2.5 | 13.2% | 26 |
| hadur117.micro.SaorGP 0.1 | 2.7 | 13.6% | 39 |
| js.PinBall 1.6 | 4.2 | 11.7% | 23 |
| mz.Cork 0.1 | 4.7 | 11.3% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.8% | 3 |
| evd.X1 0.01 | 6.8 | 8.4% | 3 |
| jsal.Jsalbot 1.0 | 8.2 | 6.8% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 3 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 61.9 | 7 / 35 | 4581 |
| 2 | 2 | 60.5 | 66.7 | 4 / 35 | 4700 |
| 3 | 3 | 59.1 | 59.4 | 5 / 35 | 4921 |
| 4 | 3 | 59.6 | 63.5 | 7 / 35 | 4265 |
| 5 | 3 | 57.8 | 58.4 | 7 / 35 | 4210 |
| 6 | 2 | 61.8 | 69.5 | 9 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 15% |
| cs.Wren 1.0 | 20 | 95% |
| mz.Cork 0.1 | 7 | 71% |
| js.PinBall 1.6 | 7 | 57% |
| donjezza.Jezza 1.0 | 3 | 33% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 66 | 38% | 76 |
| cs.Wren 1.0 | 22 | 13% | 33 |
| js.PinBall 1.6 | 19 | 11% | 25 |
| evd.X1 0.01 | 19 | 11% | 19 |
| mz.Cork 0.1 | 17 | 10% | 23 |
| joe.ADinosaur 1.0 | 16 | 9% | 19 |
| PSW.Relentless 0.1 | 7 | 4% | 7 |
| jsal.Jsalbot 1.0 | 5 | 3% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.7 | 134 / 210 | 2.56 | 18.5% | 27519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 18.5% | 134 |
| ntc.Opposite 1.5 | 2.8 | 11.3% | 16 |
| myl.nano.Graviton 1.10 | 3.5 | 10.9% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.6% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.4% | 6 |
| DBall.NUKE 0.1 | 7.0 | 8.7% | 7 |
| disan.Chair 2.2.0 | 7.7 | 8.2% | 5 |
| donjezza.Muncho 1.0 | 9.5 | 5.1% | 6 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 24 / 35 | 4610 |
| 2 | 1 | 66.8 | 80.6 | 22 / 35 | 4643 |
| 3 | 1 | 67.5 | 81.6 | 21 / 35 | 4517 |
| 4 | 1 | 67.2 | 80.0 | 22 / 35 | 4673 |
| 5 | 1 | 68.3 | 85.7 | 24 / 35 | 4532 |
| 6 | 1 | 66.9 | 78.7 | 21 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 95% |
| myl.nano.Graviton 1.10 | 27 | 93% |
| ntc.Opposite 1.5 | 20 | 80% |
| DBall.NUKE 0.1 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| disan.Chair 2.2.0 | 11 | 100% |
| donjezza.Muncho 1.0 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 79 of 210 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 22% | 28 |
| ntc.Opposite 1.5 | 15 | 19% | 27 |
| myl.nano.Graviton 1.10 | 13 | 16% | 31 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 27 |
| DBall.NUKE 0.1 | 4 | 5% | 26 |
| donjezza.Muncho 1.0 | 4 | 5% | 9 |
| disan.Chair 2.2.0 | 3 | 4% | 11 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |

## Melee bench: F13

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 70.4 | 74 / 210 | 3.66 | 15.1% | 24715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.3 | 15.1% | 74 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 55 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.2% | 19 |
| yagami.Tidus 0.11 | 4.8 | 12.2% | 6 |
| ejb.Polaris 1.0.1 | 5.3 | 11.0% | 11 |
| stelo.MirrorNano 1.3 | 7.0 | 7.7% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.9% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 67.9 | 13 / 35 | 3671 |
| 2 | 2 | 63.6 | 70.5 | 8 / 35 | 4541 |
| 3 | 1 | 62.5 | 67.3 | 12 / 35 | 4101 |
| 4 | 1 | 62.1 | 66.7 | 11 / 35 | 3859 |
| 5 | 1 | 65.0 | 73.0 | 15 / 35 | 4449 |
| 6 | 1 | 65.1 | 77.1 | 15 / 35 | 4094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 63% |
| kawigi.micro.Shiz 1.1 | 27 | 70% |
| yagami.Tidus 0.11 | 19 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 87% |
| ejb.Polaris 1.0.1 | 10 | 50% |

Hadur died in 136 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 35% | 72 |
| kawigi.micro.Shiz 1.1 | 21 | 15% | 35 |
| ejb.Polaris 1.0.1 | 18 | 13% | 27 |
| yagami.Tidus 0.11 | 16 | 12% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 25 |
| step.nanoPri 1.0 | 8 | 6% | 8 |
| stelo.MirrorNano 1.3 | 7 | 5% | 9 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.3 | 124 / 210 | 3.13 | 16.8% | 25588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 16.8% | 124 |
| bzdp.Pansy 2.1 | 2.7 | 12.1% | 23 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 27 |
| wompi.Quokka 1.6 | 3.8 | 11.6% | 15 |
| ratosh.Nobo 0.21 | 4.5 | 11.1% | 7 |
| m3thos.Eva00 1.1 | 6.0 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.1% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 67.9 | 21 / 35 | 4283 |
| 2 | 1 | 65.1 | 74.6 | 21 / 35 | 4444 |
| 3 | 1 | 64.2 | 72.1 | 19 / 35 | 4394 |
| 4 | 1 | 67.4 | 84.8 | 26 / 35 | 3976 |
| 5 | 1 | 62.7 | 71.4 | 13 / 35 | 4096 |
| 6 | 1 | 68.1 | 87.3 | 24 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 42 | 98% |
| bzdp.Pansy 2.1 | 42 | 86% |
| wompi.Quokka 1.6 | 17 | 82% |
| m3thos.Eva00 1.1 | 14 | 100% |
| ratosh.Nobo 0.21 | 12 | 92% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 394. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 17 | 20% | 30 |
| bzdp.Pansy 2.1 | 13 | 15% | 40 |
| stelo.MyAgileRobot 0.2 | 13 | 15% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 13% | 13 |
| maribo.FollowFire 1 | 8 | 9% | 8 |
| wee.Gem 1.8.4 | 7 | 8% | 47 |
| ratosh.Nobo 0.21 | 7 | 8% | 21 |
| m3thos.Eva00 1.1 | 6 | 7% | 24 |
| bayen.UbaMicro 1.4 | 4 | 5% | 12 |

## Melee bench: F15

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 79.7 | 48 / 210 | 2.82 | 17.9% | 39583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 20.1% | 134 |
| hadur117.micro.SaorGP 0.1 | 2.0 | 17.9% | 48 |
| mz.NanoGod 2.02 | 3.0 | 15.2% | 22 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.5% | 2 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 2 |
| stuff.Vlad 0.1 | 6.0 | 8.0% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 2 |
| drd.Dreadknoght 0.9 | 7.8 | 6.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 3.2% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 82.9 | 8 / 35 | 7193 |
| 2 | 2 | 68.3 | 81.3 | 9 / 35 | 6424 |
| 3 | 2 | 68.5 | 77.1 | 9 / 35 | 6728 |
| 4 | 2 | 69.6 | 81.6 | 9 / 35 | 6813 |
| 5 | 2 | 67.3 | 75.9 | 8 / 35 | 6307 |
| 6 | 2 | 67.3 | 79.7 | 5 / 35 | 6118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 101 | 21% |
| mz.NanoGod 2.02 | 20 | 60% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| ayk.WallHugger 1.0 | 2 | 50% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 66% | 134 |
| mz.NanoGod 2.02 | 32 | 20% | 42 |
| exauge.GateKeeper 1.1.121g | 10 | 6% | 18 |
| ayk.WallHugger 1.0 | 7 | 4% | 8 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |

## Melee bench: F16

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.7 | 104 / 210 | 3.46 | 16.3% | 27218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 16.3% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 23 |
| bvh.micro.Freya 0.3 | 2.8 | 12.7% | 27 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.4% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.5 | 10.2% | 16 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.0% | 8 |
| conscience.Electron 1.3g | 6.2 | 8.7% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 4 |
| ap.Frederick 1.1 | 8.8 | 6.3% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.0 | 13 / 35 | 4622 |
| 2 | 1 | 63.3 | 68.6 | 16 / 35 | 4448 |
| 3 | 1 | 65.5 | 77.1 | 18 / 35 | 4826 |
| 4 | 1 | 63.8 | 69.2 | 17 / 35 | 4509 |
| 5 | 1 | 65.4 | 74.9 | 20 / 35 | 4372 |
| 6 | 1 | 66.1 | 79.4 | 20 / 35 | 4441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 95% |
| bvh.micro.Freya 0.3 | 27 | 96% |
| dummy.micro.Sparrow 2.5 | 27 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 86% |
| stelo.MirrorMicro 1.0 | 6 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 24 | 23% | 28 |
| voidious.micro.BlitzBat 1.05 | 15 | 14% | 43 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 37 |
| bvh.micro.Freya 0.3 | 14 | 13% | 33 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 13 |
| dl.BetterWalls 1.0 | 10 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 9 | 8% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 27 |

## Melee bench: F17

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 89.4 | 163 / 210 | 1.96 | 21.6% | 41584 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 21.6% | 163 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.0% | 13 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 10 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.5% | 8 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 4 |
| dsw.StaticD 1.0 | 6.2 | 8.4% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 3 |
| sample.Corners 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 82.2 | 26 / 35 | 6599 |
| 2 | 1 | 71.0 | 89.2 | 26 / 35 | 6249 |
| 3 | 1 | 69.8 | 82.2 | 22 / 35 | 6327 |
| 4 | 1 | 73.5 | 95.6 | 30 / 35 | 7704 |
| 5 | 1 | 73.2 | 94.9 | 29 / 35 | 7412 |
| 6 | 1 | 73.3 | 92.1 | 30 / 35 | 7293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 62 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 52 | 92% |
| supersample.SuperBoxBot 1.0 | 19 | 95% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| dsw.StaticD 1.0 | 7 | 86% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 35% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 27% | 59 |
| dsw.StaticD 1.0 | 5 | 10% | 19 |
| sul.Lunar 1.1 | 4 | 8% | 67 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 11 |
| sample.Corners 1.0 | 2 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorGP 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.4 | 128 / 210 | 2.50 | 19.1% | 37866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorGP 0.1 | 1.0 | 19.1% | 128 |
| radnor.DoctorBob 1.42 | 2.0 | 13.9% | 37 |
| mld.Wisdom 1.0 | 3.5 | 11.5% | 9 |
| KiraNL.Chupacabra 0.4 | 4.5 | 10.2% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.5% | 17 |
| amz.NanoClone 1.41 | 5.3 | 9.7% | 7 |
| sample.Walls 1.0 | 7.5 | 7.7% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.5% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.2 | 21 / 35 | 6703 |
| 2 | 1 | 71.0 | 88.6 | 25 / 35 | 6875 |
| 3 | 1 | 69.0 | 84.8 | 22 / 35 | 6182 |
| 4 | 1 | 68.7 | 83.8 | 22 / 35 | 6295 |
| 5 | 1 | 68.7 | 83.5 | 20 / 35 | 6225 |
| 6 | 1 | 66.4 | 77.5 | 18 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 39 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 97% |
| mld.Wisdom 1.0 | 23 | 91% |
| KiraNL.Chupacabra 0.4 | 13 | 85% |
| amz.NanoClone 1.41 | 11 | 82% |
| jangs.ns51 1.0 | 8 | 88% |
| sample.Target 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 29% | 61 |
| mld.Wisdom 1.0 | 15 | 18% | 39 |
| KiraNL.Chupacabra 0.4 | 14 | 17% | 21 |
| amz.NanoClone 1.41 | 10 | 12% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 11% | 44 |
| GarmBox.Oranges 1.0 | 6 | 7% | 7 |
| sample.Walls 1.0 | 3 | 4% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 8 |

