# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.5 | 144 / 210 | 1.95 | 21.4% | 43949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.4% | 144 |
| mz.AntiGrav 1.0 | 2.7 | 14.2% | 18 |
| radnor.DoctorBob 1.42 | 2.7 | 14.1% | 27 |
| mld.Infinity 2.2 | 3.7 | 12.9% | 10 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 8 |
| sample.Walls 1.0 | 6.2 | 7.4% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.5% | 2 |
| sample.Target 1.0 | 9.3 | 3.8% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 91.4 | 26 / 35 | 7742 |
| 2 | 1 | 72.3 | 90.2 | 25 / 35 | 6935 |
| 3 | 1 | 71.8 | 84.8 | 22 / 35 | 7741 |
| 4 | 1 | 71.6 | 89.5 | 21 / 35 | 7000 |
| 5 | 1 | 72.0 | 89.2 | 23 / 35 | 7101 |
| 6 | 1 | 73.1 | 91.7 | 27 / 35 | 7430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 91% |
| mld.Infinity 2.2 | 41 | 95% |
| radnor.DoctorBob 1.42 | 36 | 78% |
| amz.NanoClone 1.41 | 9 | 44% |
| sample.Walls 1.0 | 8 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 38% | 57 |
| mz.AntiGrav 1.0 | 14 | 21% | 69 |
| amz.NanoClone 1.41 | 12 | 18% | 18 |
| mld.Infinity 2.2 | 7 | 11% | 50 |
| sample.Walls 1.0 | 3 | 5% | 9 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| arthord.MannyPacquiao Beta | 2 | 3% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.0 | 138 / 210 | 2.08 | 19.2% | 32554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.2% | 138 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.3% | 38 |
| mld.DustBunny 3.8 | 3.0 | 12.7% | 14 |
| maribo.melee.BMV 0.1 | 3.8 | 10.6% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 6.2 | 8.6% | 1 |
| fullsail.SweetTea 1.1 | 7.7 | 7.5% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.0% | 7 |
| bzdp.BoxCar 2.0 | 8.2 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 21 / 35 | 4908 |
| 2 | 1 | 69.1 | 90.2 | 25 / 35 | 5601 |
| 3 | 1 | 68.8 | 85.1 | 23 / 35 | 5795 |
| 4 | 1 | 69.1 | 85.7 | 23 / 35 | 5587 |
| 5 | 1 | 68.5 | 85.7 | 23 / 35 | 5077 |
| 6 | 1 | 70.3 | 93.0 | 23 / 35 | 5586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 53 | 81% |
| mld.DustBunny 3.8 | 45 | 91% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| maribo.melee.BMV 0.1 | 15 | 87% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 32% | 72 |
| mld.DustBunny 3.8 | 17 | 23% | 52 |
| maribo.melee.BMV 0.1 | 9 | 12% | 17 |
| zyx.nano.Ant 1.1 | 7 | 10% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6 | 8% | 24 |
| fullsail.SweetTea 1.1 | 6 | 8% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 13 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.8 | 135 / 210 | 2.46 | 19.9% | 36943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.9% | 135 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.5% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.6% | 19 |
| fm.mammillarias 1.3 | 4.8 | 10.0% | 8 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 1 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 2 |
| sample.Fire 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 75.2 | 17 / 35 | 5629 |
| 2 | 1 | 71.5 | 88.6 | 25 / 35 | 6624 |
| 3 | 1 | 70.5 | 85.4 | 23 / 35 | 6539 |
| 4 | 1 | 71.1 | 85.4 | 25 / 35 | 6391 |
| 5 | 1 | 68.8 | 82.2 | 22 / 35 | 5542 |
| 6 | 1 | 70.1 | 86.0 | 23 / 35 | 6218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 81% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 94% |
| fm.mammillarias 1.3 | 10 | 80% |
| sp.Nanos.Ember 1.1 | 9 | 100% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 25% | 41 |
| fm.mammillarias 1.3 | 11 | 15% | 19 |
| myl.micro.Troodon 1.10 | 10 | 13% | 62 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 33 |
| cs.sheldor.Talon 1.1 | 9 | 12% | 17 |
| cb.nano.Insomnia 1.0 | 7 | 9% | 10 |
| sample.Tracker 1.0 | 4 | 5% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 17 |
| sample.Fire 1.0 | 2 | 3% | 6 |

## Melee bench: F04

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.6 | 146 / 210 | 2.30 | 20.5% | 39919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 20.5% | 146 |
| tvv.micro.Antares 1.1.1 | 2.2 | 12.4% | 19 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.1% | 14 |
| tj.zombie1n 1.0.1 | 5.0 | 9.3% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.2% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 4 |
| yk.JahMicro 1.0 | 7.2 | 8.1% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 83.5 | 22 / 35 | 6185 |
| 2 | 1 | 70.4 | 84.4 | 25 / 35 | 6766 |
| 3 | 1 | 71.5 | 88.9 | 28 / 35 | 6743 |
| 4 | 1 | 71.8 | 92.4 | 26 / 35 | 6808 |
| 5 | 1 | 68.3 | 76.5 | 21 / 35 | 6620 |
| 6 | 1 | 70.9 | 87.6 | 24 / 35 | 6797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 95% |
| stelo.SoJNanoMelee 1.1 | 46 | 89% |
| tvv.micro.Antares 1.1.1 | 20 | 80% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 88% |
| yk.JahMicro 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 30% | 80 |
| tj.zombie1n 1.0.1 | 13 | 20% | 17 |
| stelo.SoJNanoMelee 1.1 | 9 | 14% | 34 |
| tvv.micro.Antares 1.1.1 | 9 | 14% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 11% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 14 |
| yk.JahMicro 1.0 | 2 | 3% | 10 |
| repositorio.NanoStep 1.0 | 2 | 3% | 10 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.8 | 97 / 210 | 3.90 | 15.5% | 27959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 15.5% | 97 |
| oog.melee.Corsair 1.0 | 2.5 | 12.5% | 31 |
| ahf.NanoAndrew .4 | 2.8 | 11.9% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.6% | 17 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 4 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.3% | 12 |
| sam.Samspin 1.0 | 6.5 | 9.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.3 | 18 / 35 | 4728 |
| 2 | 1 | 61.7 | 63.8 | 12 / 35 | 4752 |
| 3 | 1 | 63.9 | 69.8 | 16 / 35 | 4791 |
| 4 | 1 | 64.8 | 73.7 | 19 / 35 | 4942 |
| 5 | 1 | 59.5 | 60.0 | 13 / 35 | 4067 |
| 6 | 1 | 64.1 | 72.1 | 19 / 35 | 4679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 94% |
| ahf.NanoAndrew .4 | 23 | 87% |
| oog.melee.Corsair 1.0 | 23 | 65% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 18% | 47 |
| oog.melee.Corsair 1.0 | 19 | 17% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 13% | 19 |
| ahf.NanoAndrew .4 | 14 | 12% | 33 |
| EBBU.Sim2 1.02 | 13 | 12% | 20 |
| robar.nano.Assertive_Melee 0.2 | 12 | 11% | 27 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 12 |
| sam.Samspin 1.0 | 6 | 5% | 14 |
| sample.TrackFire 1.0 | 4 | 4% | 4 |

## Melee bench: F06

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.7 | 132 / 210 | 2.47 | 19.0% | 33417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.0% | 132 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 21 |
| gh.nano.Grofvuil 0.2 | 3.7 | 11.0% | 16 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 11.0% | 19 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.3% | 11 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 6 |
| fm.claire 1.7 | 6.7 | 8.2% | 1 |
| sample.SpinBot 1.0 | 8.2 | 6.9% | 1 |
| pa.Improved 1.0 | 8.8 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 77.5 | 18 / 35 | 5641 |
| 2 | 1 | 68.8 | 86.0 | 25 / 35 | 5185 |
| 3 | 1 | 68.9 | 83.8 | 23 / 35 | 5913 |
| 4 | 1 | 68.7 | 83.8 | 22 / 35 | 5573 |
| 5 | 1 | 68.2 | 82.2 | 23 / 35 | 5434 |
| 6 | 1 | 69.4 | 88.6 | 21 / 35 | 5671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 95% |
| oog.melee.CapuletDroid 1.1 | 41 | 100% |
| gh.nano.Grofvuil 0.2 | 17 | 88% |
| arthord.NanoSatanMelee Beta | 14 | 64% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| fm.claire 1.7 | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 23% | 66 |
| arthord.NanoSatanMelee Beta | 15 | 19% | 17 |
| gh.nano.Grofvuil 0.2 | 12 | 15% | 26 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 50 |
| fm.claire 1.7 | 7 | 9% | 13 |
| sample.SpinBot 1.0 | 7 | 9% | 12 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 11 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| pa.Improved 1.0 | 3 | 4% | 5 |

## Melee bench: F07

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.9 | 101 / 210 | 2.54 | 18.5% | 35738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 18.5% | 101 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.1% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.6% | 21 |
| mz.MicroGodMelee 1 | 3.7 | 13.0% | 33 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 3 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.2% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 5 |
| acogdev.alpha 0.2 | 7.8 | 6.2% | 5 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 15 / 35 | 5685 |
| 2 | 1 | 67.7 | 79.7 | 17 / 35 | 5769 |
| 3 | 1 | 69.4 | 86.7 | 17 / 35 | 6395 |
| 4 | 1 | 66.5 | 76.5 | 16 / 35 | 5546 |
| 5 | 1 | 68.3 | 82.5 | 19 / 35 | 5907 |
| 6 | 1 | 69.8 | 87.9 | 17 / 35 | 6436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 80% |
| mz.MicroGodMelee 1 | 41 | 63% |
| gh.micro.Gruweltje 0.7 | 24 | 63% |
| DBall.Anarchy 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 31% | 63 |
| spinnercat.micro.Tyger 0.1 | 30 | 28% | 68 |
| gh.micro.Gruweltje 0.7 | 26 | 24% | 42 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| DBall.Anarchy 0.1 | 4 | 4% | 11 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |
| fire219.CatBot 1.0 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 69.3 | 107 / 210 | 3.77 | 16.5% | 31836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.2 | 16.5% | 107 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.0% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 6 |
| germ.TheMind .2 | 5.0 | 9.6% | 10 |
| awesomeness.Elite 1.0 | 5.7 | 9.0% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.7 | 8.0% | 1 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.4% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 62.9 | 15 / 35 | 5077 |
| 2 | 1 | 65.3 | 70.8 | 20 / 35 | 5265 |
| 3 | 2 | 62.0 | 62.5 | 16 / 35 | 4683 |
| 4 | 1 | 67.4 | 75.6 | 21 / 35 | 5929 |
| 5 | 1 | 62.9 | 66.3 | 15 / 35 | 4970 |
| 6 | 1 | 67.8 | 77.5 | 20 / 35 | 5912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 89% |
| awesomeness.Elite 1.0 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 100% |
| germ.TheMind .2 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 48% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 13% | 33 |
| awesomeness.Elite 1.0 | 12 | 12% | 21 |
| germ.TheMind .2 | 9 | 9% | 16 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 15 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.6 | 144 / 210 | 2.03 | 19.9% | 31347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.9% | 144 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 9 |
| maribo.IotaCT 1.1 | 4.2 | 10.8% | 10 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.6% | 3 |
| ratosh.Wesco 1.4 | 7.7 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 25 / 35 | 5404 |
| 2 | 1 | 70.1 | 87.3 | 27 / 35 | 5126 |
| 3 | 1 | 69.3 | 86.0 | 23 / 35 | 4723 |
| 4 | 1 | 71.3 | 93.7 | 25 / 35 | 5239 |
| 5 | 1 | 69.5 | 85.4 | 23 / 35 | 5496 |
| 6 | 1 | 69.5 | 86.3 | 21 / 35 | 5359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 73 | 92% |
| nz.jdc.nano.GridFu 1.0 | 34 | 100% |
| maribo.IotaCT 1.1 | 14 | 86% |
| stelo.PatternRobot 1.0 | 13 | 69% |
| timmit.nano.TimDog 0.33 | 10 | 50% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 20 | 30% | 26 |
| stelo.PatternRobot 1.0 | 15 | 23% | 29 |
| rz.HawkOnFire 0.1 | 11 | 17% | 65 |
| ratosh.Wesco 1.4 | 9 | 14% | 17 |
| nz.jdc.nano.GridFu 1.0 | 5 | 8% | 47 |
| spinnercat.Omen 1.0 | 3 | 5% | 7 |
| maribo.IotaCT 1.1 | 2 | 3% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |

## Melee bench: F10

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.1 | 171 / 210 | 1.80 | 21.3% | 38826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.3% | 171 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.2% | 18 |
| baal.nano.N 1.42 | 3.2 | 10.9% | 3 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 3 |
| zyx.micro.Ant 1.1 | 5.5 | 9.3% | 10 |
| sanja.First 0.1 | 5.7 | 8.8% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.4% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.1% | 1 |
| cvt.Firsty 1.0 | 8.3 | 6.8% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.2 | 29 / 35 | 6189 |
| 2 | 1 | 71.8 | 93.7 | 28 / 35 | 6633 |
| 3 | 1 | 70.8 | 89.5 | 27 / 35 | 6359 |
| 4 | 1 | 70.7 | 91.1 | 28 / 35 | 6151 |
| 5 | 1 | 72.1 | 90.8 | 29 / 35 | 6965 |
| 6 | 1 | 71.5 | 91.1 | 30 / 35 | 6529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 97% |
| sanja.First 0.1 | 29 | 100% |
| cvt.Firsty 1.0 | 28 | 100% |
| baal.nano.N 1.42 | 27 | 96% |
| zyx.micro.Ant 1.1 | 25 | 88% |
| amk.Punbot.Punbot 0.01 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 8 | 100% |
| Grystrion.TrackerWO 1.0 | 7 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 31% | 43 |
| Grystrion.TrackerWO 1.0 | 6 | 15% | 14 |
| tvv.nano.Polaris 1.2 | 5 | 13% | 60 |
| baal.nano.N 1.42 | 5 | 13% | 25 |
| sanja.First 0.1 | 5 | 13% | 22 |
| sample.RamFire 1.0 | 3 | 8% | 6 |
| cvt.Firsty 1.0 | 1 | 3% | 25 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 69.0 | 92 / 210 | 3.79 | 15.7% | 31257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.5 | 15.7% | 92 |
| kc.micro.Figment 1.0 | 1.5 | 15.3% | 61 |
| cs.Wren 1.0 | 3.2 | 11.9% | 14 |
| js.PinBall 1.6 | 4.2 | 11.4% | 17 |
| mz.Cork 0.1 | 4.8 | 11.0% | 10 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 5 |
| evd.X1 0.01 | 6.7 | 8.6% | 5 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 4 |
| PSW.Relentless 0.1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.4 | 18 / 35 | 5473 |
| 2 | 1 | 63.8 | 68.9 | 14 / 35 | 5375 |
| 3 | 2 | 60.9 | 61.0 | 14 / 35 | 4983 |
| 4 | 2 | 61.9 | 65.7 | 15 / 35 | 4806 |
| 5 | 2 | 65.0 | 73.0 | 15 / 35 | 5267 |
| 6 | 1 | 63.4 | 67.0 | 16 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 68 | 72% |
| cs.Wren 1.0 | 22 | 100% |
| js.PinBall 1.6 | 10 | 70% |
| mz.Cork 0.1 | 6 | 83% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 0% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 46% | 114 |
| cs.Wren 1.0 | 13 | 11% | 24 |
| js.PinBall 1.6 | 13 | 11% | 21 |
| evd.X1 0.01 | 11 | 9% | 12 |
| joe.ADinosaur 1.0 | 11 | 9% | 11 |
| mz.Cork 0.1 | 8 | 7% | 14 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |

## Melee bench: F12

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.7 | 138 / 210 | 2.29 | 19.2% | 29502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 19.2% | 138 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 21 |
| ntc.Opposite 1.5 | 3.0 | 11.1% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.2% | 2 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.3% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.3% | 4 |
| disan.Chair 2.2.0 | 7.5 | 8.0% | 8 |
| DBall.NUKE 0.1 | 7.5 | 8.3% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.4% | 6 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.8 | 25 / 35 | 5168 |
| 2 | 1 | 66.9 | 78.4 | 21 / 35 | 4797 |
| 3 | 1 | 67.3 | 81.0 | 21 / 35 | 4814 |
| 4 | 1 | 67.2 | 82.5 | 23 / 35 | 4424 |
| 5 | 1 | 69.2 | 87.9 | 24 / 35 | 5095 |
| 6 | 1 | 70.6 | 94.6 | 24 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 84% |
| myl.nano.Graviton 1.10 | 32 | 94% |
| DBall.NUKE 0.1 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| donjezza.Muncho 1.0 | 14 | 100% |
| ntc.Opposite 1.5 | 13 | 85% |
| disan.Chair 2.2.0 | 9 | 67% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 16 | 21% | 29 |
| stelo.AreaTargetingBot 1.1 | 15 | 20% | 42 |
| myl.nano.Graviton 1.10 | 11 | 15% | 44 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 15% | 16 |
| pfvicm.Sobieski 7.2.3b | 9 | 12% | 22 |
| disan.Chair 2.2.0 | 6 | 8% | 14 |
| pbg.R2D2 1.0 | 5 | 7% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 15 |
| donjezza.Muncho 1.0 | 1 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.3 | 76 / 210 | 3.40 | 15.9% | 27217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.2 | 15.9% | 76 |
| oog.melee.Capulet 1.2 | 2.0 | 14.2% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 25 |
| kawigi.micro.Shiz 1.1 | 3.5 | 13.5% | 31 |
| yagami.Tidus 0.11 | 4.8 | 11.9% | 14 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.5 | 66.3 | 13 / 35 | 3762 |
| 2 | 1 | 64.9 | 73.0 | 11 / 35 | 4575 |
| 3 | 2 | 62.4 | 69.2 | 9 / 35 | 4074 |
| 4 | 1 | 64.3 | 71.1 | 13 / 35 | 4509 |
| 5 | 1 | 65.2 | 71.1 | 12 / 35 | 5071 |
| 6 | 1 | 69.4 | 88.9 | 18 / 35 | 5226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 48% |
| kawigi.micro.Shiz 1.1 | 24 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 74% |
| yagami.Tidus 0.11 | 20 | 80% |
| ejb.Polaris 1.0.1 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 38% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 16% | 40 |
| yagami.Tidus 0.11 | 21 | 16% | 35 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 35 |
| ejb.Polaris 1.0.1 | 11 | 8% | 17 |
| kurios.DOSexe .9a | 7 | 5% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.0 | 126 / 210 | 2.98 | 17.3% | 27568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 17.3% | 126 |
| bzdp.Pansy 2.1 | 2.5 | 12.2% | 14 |
| wee.Gem 1.8.4 | 3.8 | 11.5% | 22 |
| ratosh.Nobo 0.21 | 4.0 | 11.3% | 10 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 14 |
| m3thos.Eva00 1.1 | 5.5 | 10.0% | 12 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.9% | 4 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.4% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.6 | 22 / 35 | 4719 |
| 2 | 1 | 67.6 | 85.1 | 24 / 35 | 4486 |
| 3 | 1 | 66.1 | 81.6 | 20 / 35 | 4383 |
| 4 | 1 | 67.6 | 81.9 | 22 / 35 | 5004 |
| 5 | 1 | 65.9 | 76.2 | 22 / 35 | 4675 |
| 6 | 1 | 62.3 | 67.6 | 16 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 98% |
| wee.Gem 1.8.4 | 30 | 90% |
| ratosh.Nobo 0.21 | 17 | 94% |
| wompi.Quokka 1.6 | 17 | 76% |
| m3thos.Eva00 1.1 | 11 | 82% |
| bayen.UbaMicro 1.4 | 4 | 25% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 13 | 15% | 48 |
| bayen.UbaMicro 1.4 | 13 | 15% | 15 |
| bzdp.Pansy 2.1 | 12 | 14% | 63 |
| m3thos.Eva00 1.1 | 10 | 12% | 18 |
| maribo.FollowFire 1 | 10 | 12% | 8 |
| ratosh.Nobo 0.21 | 9 | 11% | 22 |
| wompi.Quokka 1.6 | 7 | 8% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 9 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 88.4 | 125 / 210 | 2.05 | 21.6% | 48694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 21.6% | 125 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 63 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 17 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.3% | 0 |
| stuff.Vlad 0.1 | 5.8 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.1% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 91.4 | 22 / 35 | 8509 |
| 2 | 1 | 73.4 | 89.5 | 22 / 35 | 8437 |
| 3 | 1 | 74.8 | 94.3 | 26 / 35 | 8823 |
| 4 | 1 | 71.4 | 83.8 | 17 / 35 | 7576 |
| 5 | 1 | 71.3 | 85.7 | 19 / 35 | 7390 |
| 6 | 1 | 72.1 | 85.4 | 19 / 35 | 7959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 79% |
| mz.NanoGod 2.02 | 18 | 61% |
| exauge.GateKeeper 1.1.121g | 15 | 93% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 6 | 83% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 53% | 133 |
| mz.NanoGod 2.02 | 27 | 32% | 42 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 14 |
| ayk.WallHugger 1.0 | 3 | 4% | 9 |
| stuff.Vlad 0.1 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 2 | 2% | 7 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.9 | 105 / 210 | 3.62 | 16.1% | 28172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 16.1% | 105 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 25 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.2% | 24 |
| bvh.micro.Freya 0.3 | 3.5 | 11.6% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.9% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.4% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.5% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 10 |
| dl.BetterWalls 1.0 | 8.8 | 6.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 70.2 | 16 / 35 | 4977 |
| 2 | 1 | 64.6 | 72.1 | 17 / 35 | 4675 |
| 3 | 1 | 65.3 | 76.8 | 20 / 35 | 4748 |
| 4 | 1 | 62.8 | 66.7 | 15 / 35 | 4472 |
| 5 | 1 | 61.8 | 63.8 | 16 / 35 | 4448 |
| 6 | 1 | 65.6 | 75.9 | 21 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 25 | 80% |
| dummy.micro.Sparrow 2.5 | 24 | 92% |
| bvh.micro.Freya 0.3 | 15 | 87% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 19% | 22 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 48 |
| dummy.micro.Sparrow 2.5 | 17 | 16% | 42 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 14% | 39 |
| conscience.Electron 1.3g | 11 | 10% | 14 |
| bvh.micro.Freya 0.3 | 9 | 8% | 18 |
| dl.BetterWalls 1.0 | 9 | 8% | 14 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 13 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 83.9 | 146 / 210 | 2.45 | 20.6% | 41515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 20.6% | 146 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 17 |
| sul.Lunar 1.1 | 3.3 | 10.9% | 6 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 14 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.8% | 8 |
| dsw.StaticD 1.0 | 5.7 | 8.9% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.8% | 6 |
| tlp.ThreeLeggedPig 1 | 8.2 | 6.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.2% | 7 |
| sample.Corners 1.0 | 9.3 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 78.7 | 22 / 35 | 7023 |
| 2 | 1 | 72.0 | 88.9 | 28 / 35 | 7144 |
| 3 | 1 | 71.1 | 87.3 | 24 / 35 | 7089 |
| 4 | 1 | 71.4 | 87.6 | 26 / 35 | 6868 |
| 5 | 1 | 70.2 | 82.9 | 24 / 35 | 6572 |
| 6 | 1 | 69.2 | 77.8 | 22 / 35 | 6819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 45 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 89% |
| supersample.SuperBoxBot 1.0 | 22 | 95% |
| dsw.StaticD 1.0 | 14 | 79% |
| mme.NikeEnhanced 2.0 | 11 | 82% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 29% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 23% | 47 |
| dsw.StaticD 1.0 | 8 | 12% | 19 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 19 |
| sample.MyFirstRobot 1.0 | 5 | 8% | 11 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 10 |
| sul.Lunar 1.1 | 3 | 5% | 46 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 14 |
| sample.Corners 1.0 | 3 | 5% | 7 |

## Melee bench: F18

hadur117.micro.SaorWTM 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 74.8 | 95 / 210 | 3.27 | 17.3% | 36925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTM 0.1 | 1.0 | 17.3% | 95 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 32 |
| mld.Wisdom 1.0 | 3.5 | 12.0% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.9% | 24 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.6% | 15 |
| amz.NanoClone 1.41 | 5.5 | 10.0% | 12 |
| sample.Walls 1.0 | 7.0 | 7.9% | 6 |
| GarmBox.Oranges 1.0 | 8.3 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.5% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 68.9 | 11 / 35 | 5666 |
| 2 | 1 | 71.7 | 90.5 | 25 / 35 | 7329 |
| 3 | 1 | 65.5 | 72.1 | 16 / 35 | 5884 |
| 4 | 1 | 64.2 | 70.8 | 16 / 35 | 5577 |
| 5 | 1 | 65.7 | 74.0 | 13 / 35 | 6219 |
| 6 | 1 | 65.8 | 72.4 | 14 / 35 | 6250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 84% |
| radnor.DoctorBob 1.42 | 27 | 67% |
| mld.Wisdom 1.0 | 15 | 60% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 50% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 25% | 53 |
| mld.Wisdom 1.0 | 29 | 25% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 23 | 20% | 59 |
| KiraNL.Chupacabra 0.4 | 14 | 12% | 25 |
| amz.NanoClone 1.41 | 9 | 8% | 16 |
| jangs.ns51 1.0 | 5 | 4% | 8 |
| GarmBox.Oranges 1.0 | 4 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 7 |

