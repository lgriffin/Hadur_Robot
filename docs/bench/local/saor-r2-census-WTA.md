# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 91.4 | 160 / 210 | 1.78 | 22.2% | 44455 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 22.2% | 160 |
| radnor.DoctorBob 1.42 | 2.3 | 14.3% | 25 |
| mld.Infinity 2.2 | 3.3 | 12.7% | 7 |
| mz.AntiGrav 1.0 | 3.3 | 13.2% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| sample.Walls 1.0 | 6.8 | 6.8% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.3% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 91.4 | 29 / 35 | 6710 |
| 2 | 1 | 72.5 | 89.5 | 27 / 35 | 7336 |
| 3 | 1 | 73.2 | 91.4 | 27 / 35 | 7638 |
| 4 | 1 | 73.8 | 92.7 | 26 / 35 | 7598 |
| 5 | 1 | 73.9 | 94.3 | 24 / 35 | 7548 |
| 6 | 1 | 72.7 | 88.9 | 27 / 35 | 7625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 98% |
| radnor.DoctorBob 1.42 | 52 | 83% |
| mld.Infinity 2.2 | 39 | 97% |
| jangs.ns51 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 46% | 70 |
| mz.AntiGrav 1.0 | 10 | 19% | 62 |
| amz.NanoClone 1.41 | 7 | 13% | 15 |
| mld.Infinity 2.2 | 6 | 12% | 43 |
| GarmBox.Oranges 1.0 | 2 | 4% | 1 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| jangs.ns51 1.0 | 1 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 120 / 210 | 2.38 | 18.7% | 33029 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 18.7% | 120 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.7% | 52 |
| mld.DustBunny 3.8 | 3.7 | 12.4% | 16 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.2% | 4 |
| zyx.nano.Ant 1.1 | 6.2 | 8.6% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.0% | 8 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 91.1 | 21 / 35 | 5561 |
| 2 | 1 | 71.0 | 94.6 | 24 / 35 | 5943 |
| 3 | 1 | 68.4 | 87.6 | 19 / 35 | 5295 |
| 4 | 1 | 69.7 | 90.5 | 24 / 35 | 5891 |
| 5 | 1 | 68.1 | 84.1 | 21 / 35 | 5469 |
| 6 | 2 | 62.0 | 60.0 | 11 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 71 | 72% |
| mld.DustBunny 3.8 | 36 | 81% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 78% |
| maribo.melee.BMV 0.1 | 12 | 67% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 8 | 88% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 36% | 89 |
| mld.DustBunny 3.8 | 20 | 22% | 47 |
| zyx.nano.Ant 1.1 | 10 | 11% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 16 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 18 |
| fullsail.SweetTea 1.1 | 5 | 6% | 11 |
| maribo.melee.BMV 0.1 | 5 | 6% | 10 |
| bzdp.BoxCar 2.0 | 4 | 4% | 4 |
| cs.Grudge 1.0 | 3 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 83.7 | 127 / 210 | 2.47 | 19.7% | 36163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.7% | 127 |
| myl.micro.Troodon 1.10 | 2.3 | 14.0% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.3% | 20 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.4% | 6 |
| fm.mammillarias 1.3 | 6.2 | 8.5% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.7% | 1 |
| sample.Fire 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 85.7 | 21 / 35 | 6016 |
| 2 | 1 | 69.0 | 80.0 | 19 / 35 | 6100 |
| 3 | 1 | 70.1 | 86.3 | 22 / 35 | 6133 |
| 4 | 1 | 68.7 | 78.4 | 19 / 35 | 6104 |
| 5 | 1 | 68.3 | 79.0 | 19 / 35 | 5704 |
| 6 | 1 | 71.8 | 92.7 | 27 / 35 | 6106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 40 | 80% |
| myl.micro.Troodon 1.10 | 39 | 90% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| sample.Fire 1.0 | 5 | 80% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 24% | 44 |
| myl.micro.Troodon 1.10 | 17 | 20% | 58 |
| cb.nano.Insomnia 1.0 | 17 | 20% | 24 |
| myl.nano.KomoriNinja 1.1 | 9 | 11% | 34 |
| sp.Nanos.Ember 1.1 | 6 | 7% | 20 |
| fm.mammillarias 1.3 | 5 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 8 |
| sample.Fire 1.0 | 4 | 5% | 11 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.3 | 144 / 210 | 2.23 | 20.6% | 39668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.6% | 144 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.1% | 14 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.3% | 15 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.4% | 20 |
| tj.zombie1n 1.0.1 | 5.3 | 9.0% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.3 | 8.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.2% | 8 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 4 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.7 | 27 / 35 | 6702 |
| 2 | 1 | 68.8 | 81.9 | 19 / 35 | 6301 |
| 3 | 1 | 71.9 | 90.5 | 27 / 35 | 7061 |
| 4 | 1 | 68.9 | 81.0 | 24 / 35 | 6085 |
| 5 | 1 | 71.9 | 92.4 | 25 / 35 | 6934 |
| 6 | 1 | 69.1 | 80.6 | 22 / 35 | 6585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 91% |
| stelo.SoJNanoMelee 1.1 | 44 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| tj.zombie1n 1.0.1 | 16 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 83% |
| yk.JahMicro 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |

Hadur died in 66 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 29% | 77 |
| stelo.SoJNanoMelee 1.1 | 19 | 29% | 37 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 12% | 26 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 10 |
| tj.zombie1n 1.0.1 | 4 | 6% | 10 |
| repositorio.NanoStep 1.0 | 3 | 5% | 11 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |
| yk.JahMicro 1.0 | 0 | 0% | 10 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.1 | 88 / 210 | 3.87 | 15.6% | 28161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 15.6% | 88 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 31 |
| ahf.NanoAndrew .4 | 3.5 | 11.7% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.3% | 27 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 7 |
| sam.Samspin 1.0 | 5.8 | 9.8% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.0 | 9.6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 8.3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 71.4 | 14 / 35 | 5103 |
| 2 | 1 | 63.0 | 66.0 | 14 / 35 | 5020 |
| 3 | 1 | 65.0 | 75.2 | 17 / 35 | 4515 |
| 4 | 1 | 64.2 | 74.0 | 17 / 35 | 4429 |
| 5 | 1 | 59.9 | 56.2 | 12 / 35 | 4583 |
| 6 | 1 | 62.0 | 65.7 | 14 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 38 | 89% |
| ahf.NanoAndrew .4 | 20 | 85% |
| oog.melee.Corsair 1.0 | 16 | 63% |
| EBBU.Sim2 1.02 | 11 | 91% |
| sam.Samspin 1.0 | 8 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 20 | 16% | 37 |
| oog.melee.Corsair 1.0 | 20 | 16% | 32 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 24 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 47 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 19 |
| EBBU.Sim2 1.02 | 13 | 11% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 13 |
| sam.Samspin 1.0 | 7 | 6% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.3 | 139 / 210 | 2.06 | 19.8% | 33660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.8% | 139 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.3% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 6 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 4 |
| fm.claire 1.7 | 7.0 | 8.0% | 3 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 3 |
| pa.Improved 1.0 | 9.2 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.5 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 28 / 35 | 6286 |
| 2 | 1 | 68.6 | 83.8 | 25 / 35 | 5352 |
| 3 | 1 | 68.3 | 85.7 | 21 / 35 | 5065 |
| 4 | 1 | 68.4 | 84.8 | 19 / 35 | 5503 |
| 5 | 1 | 70.6 | 90.5 | 24 / 35 | 5858 |
| 6 | 1 | 70.0 | 92.4 | 22 / 35 | 5596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 82% |
| oog.melee.CapuletDroid 1.1 | 43 | 100% |
| gh.nano.Grofvuil 0.2 | 18 | 72% |
| arthord.NanoSatanMelee Beta | 15 | 73% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| fm.claire 1.7 | 2 | 0% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 38% | 81 |
| gh.nano.Grofvuil 0.2 | 11 | 15% | 27 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 16 |
| fm.claire 1.7 | 7 | 10% | 8 |
| oog.melee.CapuletDroid 1.1 | 4 | 6% | 47 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 11 |
| sample.SpinBot 1.0 | 4 | 6% | 8 |
| kurios.DOSexe .9b | 4 | 6% | 5 |
| pa.Improved 1.0 | 3 | 4% | 7 |

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.0 | 108 / 210 | 2.53 | 18.7% | 34846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.7% | 108 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.0% | 28 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.1% | 32 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 31 |
| DBall.Anarchy 0.1 | 5.5 | 8.8% | 7 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.7% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 83.8 | 19 / 35 | 6405 |
| 2 | 1 | 67.3 | 80.3 | 16 / 35 | 5601 |
| 3 | 1 | 69.3 | 86.3 | 20 / 35 | 5852 |
| 4 | 1 | 69.0 | 83.8 | 21 / 35 | 6004 |
| 5 | 1 | 67.0 | 78.1 | 16 / 35 | 5548 |
| 6 | 1 | 68.1 | 85.7 | 16 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 82% |
| mz.MicroGodMelee 1 | 36 | 67% |
| gh.micro.Gruweltje 0.7 | 18 | 61% |
| DBall.Anarchy 0.1 | 16 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 33% | 57 |
| spinnercat.micro.Tyger 0.1 | 29 | 28% | 69 |
| gh.micro.Gruweltje 0.7 | 18 | 17% | 36 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 10 |
| acogdev.alpha 0.2 | 5 | 5% | 10 |
| DBall.Anarchy 0.1 | 3 | 3% | 19 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 1 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.1 | 122 / 210 | 3.33 | 17.2% | 31065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 17.2% | 122 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 5 |
| germ.TheMind .2 | 5.8 | 9.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 3 |
| awesomeness.Elite 1.0 | 6.5 | 8.3% | 8 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.6% | 3 |
| sample.Crazy 1.0 | 8.0 | 7.4% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 71.7 | 19 / 35 | 5307 |
| 2 | 1 | 68.1 | 80.6 | 24 / 35 | 5198 |
| 3 | 1 | 68.0 | 79.7 | 22 / 35 | 5553 |
| 4 | 2 | 64.3 | 68.3 | 19 / 35 | 4956 |
| 5 | 1 | 65.6 | 73.7 | 18 / 35 | 5035 |
| 6 | 1 | 64.6 | 70.5 | 20 / 35 | 5016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| germ.TheMind .2 | 3 | 67% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 36 | 41% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 15% | 34 |
| germ.TheMind .2 | 9 | 10% | 15 |
| lrem.micro.MoggFanatic 0.2 | 9 | 10% | 13 |
| qualidafial.MajorDick 1.0.1 | 7 | 8% | 10 |
| awesomeness.Elite 1.0 | 4 | 5% | 11 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 9 |
| mym.EdgeStalker 1.0 | 4 | 5% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.4 | 155 / 210 | 1.86 | 20.8% | 32984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.8% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 8 |
| maribo.IotaCT 1.1 | 4.5 | 10.1% | 8 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.7% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 6 |
| spinnercat.Omen 1.0 | 7.3 | 8.4% | 1 |
| ratosh.Wesco 1.4 | 8.0 | 7.7% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 7.2% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 28 / 35 | 5828 |
| 2 | 1 | 71.1 | 88.9 | 27 / 35 | 5410 |
| 3 | 1 | 69.1 | 82.5 | 20 / 35 | 5239 |
| 4 | 1 | 72.4 | 93.7 | 28 / 35 | 5796 |
| 5 | 1 | 71.3 | 92.4 | 25 / 35 | 5214 |
| 6 | 1 | 71.8 | 92.4 | 27 / 35 | 5497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 85 | 91% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| timmit.nano.TimDog 0.33 | 16 | 69% |
| stelo.PatternRobot 1.0 | 13 | 77% |
| maribo.IotaCT 1.1 | 11 | 82% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 75% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |

Hadur died in 55 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 27% | 68 |
| timmit.nano.TimDog 0.33 | 10 | 18% | 24 |
| stelo.PatternRobot 1.0 | 9 | 16% | 13 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 55 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 9% | 13 |
| maribo.IotaCT 1.1 | 4 | 7% | 15 |
| ratosh.Wesco 1.4 | 3 | 5% | 10 |
| spinnercat.Omen 1.0 | 2 | 4% | 11 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.8 | 172 / 210 | 1.83 | 21.4% | 38717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.4% | 172 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.9% | 15 |
| baal.nano.N 1.42 | 3.0 | 10.8% | 4 |
| zyx.micro.Ant 1.1 | 4.3 | 10.0% | 12 |
| Grystrion.TrackerWO 1.0 | 5.7 | 9.0% | 1 |
| sanja.First 0.1 | 6.5 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 0 |
| amk.Punbot.Punbot 0.01 | 7.0 | 7.8% | 1 |
| cvt.Firsty 1.0 | 8.7 | 6.7% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 95.9 | 31 / 35 | 7103 |
| 2 | 1 | 71.5 | 92.1 | 29 / 35 | 6537 |
| 3 | 1 | 72.2 | 92.7 | 30 / 35 | 6386 |
| 4 | 1 | 70.2 | 86.7 | 28 / 35 | 6101 |
| 5 | 1 | 71.6 | 91.4 | 30 / 35 | 6733 |
| 6 | 1 | 69.7 | 86.0 | 24 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 91% |
| cvt.Firsty 1.0 | 30 | 100% |
| baal.nano.N 1.42 | 30 | 97% |
| zyx.micro.Ant 1.1 | 29 | 86% |
| amk.Punbot.Punbot 0.01 | 22 | 100% |
| sanja.First 0.1 | 22 | 100% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 18 | 47% | 56 |
| tvv.nano.Polaris 1.2 | 7 | 18% | 45 |
| baal.nano.N 1.42 | 4 | 11% | 32 |
| sample.RamFire 1.0 | 3 | 8% | 4 |
| cvt.Firsty 1.0 | 2 | 5% | 23 |
| sanja.First 0.1 | 1 | 3% | 18 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 13 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 8 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.9 | 87 / 210 | 3.89 | 15.5% | 31225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 15.5% | 87 |
| kc.micro.Figment 1.0 | 2.5 | 13.6% | 51 |
| cs.Wren 1.0 | 2.8 | 13.2% | 30 |
| js.PinBall 1.6 | 4.2 | 11.4% | 18 |
| mz.Cork 0.1 | 4.7 | 11.2% | 13 |
| joe.ADinosaur 1.0 | 5.8 | 9.6% | 5 |
| evd.X1 0.01 | 7.2 | 8.5% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.1% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.8 | 60.6 | 13 / 35 | 4732 |
| 2 | 1 | 65.2 | 74.0 | 18 / 35 | 5110 |
| 3 | 1 | 63.5 | 69.5 | 13 / 35 | 5320 |
| 4 | 1 | 61.9 | 65.4 | 12 / 35 | 4815 |
| 5 | 1 | 65.5 | 72.7 | 18 / 35 | 5674 |
| 6 | 1 | 62.8 | 65.1 | 13 / 35 | 5574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 73% |
| cs.Wren 1.0 | 25 | 88% |
| js.PinBall 1.6 | 10 | 80% |
| mz.Cork 0.1 | 10 | 90% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 44 | 36% | 88 |
| cs.Wren 1.0 | 18 | 15% | 35 |
| js.PinBall 1.6 | 17 | 14% | 26 |
| evd.X1 0.01 | 15 | 12% | 16 |
| mz.Cork 0.1 | 9 | 7% | 14 |
| PSW.Relentless 0.1 | 9 | 7% | 10 |
| joe.ADinosaur 1.0 | 8 | 7% | 9 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 137 / 210 | 2.44 | 19.1% | 29573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.1% | 137 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 15 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.0% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 2 |
| DBall.NUKE 0.1 | 7.3 | 8.2% | 5 |
| disan.Chair 2.2.0 | 7.3 | 8.1% | 6 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 71.4 | 20 / 35 | 4105 |
| 2 | 1 | 69.5 | 88.3 | 23 / 35 | 5145 |
| 3 | 1 | 67.2 | 78.4 | 23 / 35 | 4689 |
| 4 | 1 | 68.7 | 83.5 | 24 / 35 | 5117 |
| 5 | 1 | 69.7 | 89.8 | 24 / 35 | 5115 |
| 6 | 1 | 70.2 | 92.4 | 23 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 97% |
| stelo.AreaTargetingBot 1.1 | 30 | 83% |
| ntc.Opposite 1.5 | 25 | 80% |
| donjezza.Muncho 1.0 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| disan.Chair 2.2.0 | 9 | 78% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 19% | 22 |
| ntc.Opposite 1.5 | 13 | 18% | 33 |
| myl.nano.Graviton 1.10 | 12 | 16% | 49 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 22 |
| disan.Chair 2.2.0 | 5 | 7% | 13 |
| pbg.R2D2 1.0 | 3 | 4% | 12 |
| DBall.NUKE 0.1 | 2 | 3% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 10 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.6 | 77 / 210 | 3.46 | 15.6% | 25177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 15.6% | 77 |
| oog.melee.Capulet 1.2 | 1.8 | 14.5% | 55 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.0% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.7% | 22 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 10 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 8.0% | 0 |
| step.nanoPri 1.0 | 8.0 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 69.8 | 11 / 35 | 4163 |
| 2 | 1 | 65.5 | 76.2 | 12 / 35 | 4511 |
| 3 | 1 | 66.4 | 80.3 | 15 / 35 | 4207 |
| 4 | 1 | 62.0 | 66.3 | 10 / 35 | 4107 |
| 5 | 1 | 64.6 | 72.7 | 13 / 35 | 4233 |
| 6 | 1 | 64.1 | 70.5 | 16 / 35 | 3956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 34 | 44% |
| kawigi.micro.Shiz 1.1 | 22 | 91% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 77% |
| yagami.Tidus 0.11 | 19 | 95% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 36% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 17% | 44 |
| yagami.Tidus 0.11 | 20 | 15% | 37 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 27 |
| ejb.Polaris 1.0.1 | 11 | 8% | 17 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| kurios.DOSexe .9a | 6 | 5% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 78.7 | 127 / 210 | 2.92 | 17.4% | 27734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.4% | 127 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 16 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 22 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 12 |
| wompi.Quokka 1.6 | 4.2 | 11.3% | 16 |
| m3thos.Eva00 1.1 | 5.8 | 9.8% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.6% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 4 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.8 | 21 / 35 | 4581 |
| 2 | 1 | 64.7 | 74.6 | 20 / 35 | 4230 |
| 3 | 1 | 62.9 | 64.8 | 17 / 35 | 4516 |
| 4 | 1 | 66.8 | 81.9 | 21 / 35 | 4584 |
| 5 | 1 | 67.9 | 87.0 | 23 / 35 | 4793 |
| 6 | 1 | 67.3 | 79.0 | 25 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 43 | 93% |
| bzdp.Pansy 2.1 | 39 | 95% |
| wompi.Quokka 1.6 | 18 | 94% |
| ratosh.Nobo 0.21 | 18 | 78% |
| m3thos.Eva00 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 18% | 32 |
| maribo.FollowFire 1 | 13 | 16% | 16 |
| wee.Gem 1.8.4 | 11 | 13% | 50 |
| bzdp.Pansy 2.1 | 9 | 11% | 47 |
| wompi.Quokka 1.6 | 9 | 11% | 21 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 9 |
| m3thos.Eva00 1.1 | 6 | 7% | 13 |
| bayen.UbaMicro 1.4 | 6 | 7% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 89.4 | 134 / 210 | 1.95 | 21.7% | 46486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.7% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 61 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 8 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 5 |
| stuff.Vlad 0.1 | 6.2 | 8.4% | 2 |
| stelo.PianistNano 1.2 | 6.7 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 89.2 | 25 / 35 | 8012 |
| 2 | 1 | 72.3 | 87.6 | 23 / 35 | 7423 |
| 3 | 1 | 71.5 | 83.2 | 16 / 35 | 7835 |
| 4 | 1 | 74.0 | 94.6 | 26 / 35 | 7739 |
| 5 | 1 | 74.0 | 91.4 | 24 / 35 | 8187 |
| 6 | 1 | 72.1 | 90.5 | 20 / 35 | 7290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 116 | 75% |
| mz.NanoGod 2.02 | 16 | 81% |
| ayk.WallHugger 1.0 | 13 | 100% |
| exauge.GateKeeper 1.1.121g | 11 | 82% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 53% | 132 |
| mz.NanoGod 2.02 | 17 | 22% | 34 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 15 |
| ayk.WallHugger 1.0 | 5 | 6% | 13 |
| stelo.PianistNano 1.2 | 5 | 6% | 5 |
| stuff.Vlad 0.1 | 3 | 4% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.4 | 116 / 210 | 3.03 | 17.4% | 29113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.4% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 25 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.8% | 23 |
| bvh.micro.Freya 0.3 | 4.2 | 10.9% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.1% | 16 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 9 |
| conscience.Electron 1.3g | 6.7 | 8.6% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.3% | 1 |
| ap.Frederick 1.1 | 8.7 | 6.4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.4 | 19 / 35 | 4915 |
| 2 | 1 | 65.9 | 76.2 | 21 / 35 | 4721 |
| 3 | 1 | 66.6 | 77.1 | 19 / 35 | 5219 |
| 4 | 1 | 65.8 | 75.9 | 19 / 35 | 4958 |
| 5 | 1 | 65.8 | 75.6 | 20 / 35 | 4870 |
| 6 | 1 | 64.9 | 74.3 | 18 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 80% |
| davidalves.net.DuelistMicroMelee 1.4 | 33 | 85% |
| dummy.micro.Sparrow 2.5 | 24 | 96% |
| bvh.micro.Freya 0.3 | 20 | 85% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 26% | 60 |
| dummy.micro.Sparrow 2.5 | 17 | 18% | 37 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 15% | 41 |
| conscience.Electron 1.3g | 14 | 15% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 10% | 10 |
| bvh.micro.Freya 0.3 | 8 | 9% | 23 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 14 |
| dl.BetterWalls 1.0 | 3 | 3% | 8 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 85.3 | 147 / 210 | 2.32 | 21.0% | 41750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.0% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 19 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 14 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.9% | 12 |
| mme.NikeEnhanced 2.0 | 4.7 | 9.6% | 8 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 3 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 3 |
| sample.Corners 1.0 | 9.5 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 81.6 | 23 / 35 | 6199 |
| 2 | 1 | 71.7 | 86.3 | 25 / 35 | 6901 |
| 3 | 1 | 72.2 | 91.4 | 26 / 35 | 6987 |
| 4 | 1 | 71.6 | 87.0 | 25 / 35 | 7202 |
| 5 | 1 | 70.1 | 81.0 | 23 / 35 | 6782 |
| 6 | 1 | 72.2 | 84.8 | 25 / 35 | 7679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 51 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 92% |
| supersample.SuperBoxBot 1.0 | 24 | 96% |
| dsw.StaticD 1.0 | 13 | 77% |
| mme.NikeEnhanced 2.0 | 11 | 73% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 83% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 27% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 25% | 53 |
| dsw.StaticD 1.0 | 12 | 19% | 26 |
| sul.Lunar 1.1 | 5 | 8% | 48 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 14 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 6 |
| sample.Corners 1.0 | 4 | 6% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.2 | 120 / 210 | 2.70 | 18.6% | 37138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.6% | 120 |
| radnor.DoctorBob 1.42 | 2.3 | 13.1% | 26 |
| mld.Wisdom 1.0 | 3.0 | 12.2% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 10.6% | 17 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 2 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 17 |
| sample.Walls 1.0 | 7.2 | 7.9% | 6 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 76.5 | 19 / 35 | 6224 |
| 2 | 1 | 67.4 | 77.5 | 18 / 35 | 6216 |
| 3 | 1 | 67.7 | 81.0 | 19 / 35 | 6121 |
| 4 | 1 | 67.8 | 82.5 | 20 / 35 | 5687 |
| 5 | 1 | 70.3 | 88.3 | 22 / 35 | 7124 |
| 6 | 1 | 67.8 | 81.3 | 22 / 35 | 5766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 94% |
| radnor.DoctorBob 1.42 | 28 | 86% |
| mld.Wisdom 1.0 | 24 | 75% |
| amz.NanoClone 1.41 | 11 | 55% |
| KiraNL.Chupacabra 0.4 | 10 | 100% |
| sample.Walls 1.0 | 8 | 88% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 27% | 46 |
| amz.NanoClone 1.41 | 18 | 20% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 19% | 59 |
| radnor.DoctorBob 1.42 | 14 | 16% | 40 |
| KiraNL.Chupacabra 0.4 | 10 | 11% | 20 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 5 |
| sample.Walls 1.0 | 1 | 1% | 7 |

