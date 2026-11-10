# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.7 | 139 / 210 | 2.29 | 20.5% | 42519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 20.5% | 139 |
| mz.AntiGrav 1.0 | 2.5 | 13.9% | 20 |
| radnor.DoctorBob 1.42 | 2.5 | 14.2% | 25 |
| mld.Infinity 2.2 | 4.2 | 12.6% | 16 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 6 |
| GarmBox.Oranges 1.0 | 6.5 | 6.9% | 1 |
| sample.Walls 1.0 | 6.8 | 7.2% | 2 |
| jangs.ns51 1.0 | 7.7 | 6.4% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 80.3 | 21 / 35 | 6862 |
| 2 | 1 | 72.2 | 89.2 | 24 / 35 | 7384 |
| 3 | 1 | 71.1 | 85.7 | 23 / 35 | 7092 |
| 4 | 1 | 71.7 | 88.3 | 25 / 35 | 7035 |
| 5 | 1 | 72.2 | 88.9 | 23 / 35 | 7584 |
| 6 | 1 | 69.8 | 81.9 | 23 / 35 | 6562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 95% |
| mld.Infinity 2.2 | 41 | 88% |
| radnor.DoctorBob 1.42 | 28 | 71% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 5 | 60% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 34% | 58 |
| mz.AntiGrav 1.0 | 13 | 18% | 62 |
| mld.Infinity 2.2 | 11 | 15% | 45 |
| amz.NanoClone 1.41 | 11 | 15% | 19 |
| jangs.ns51 1.0 | 5 | 7% | 9 |
| GarmBox.Oranges 1.0 | 3 | 4% | 5 |
| sample.Walls 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 3% | 4 |

## Melee bench: F02

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.3 | 111 / 210 | 2.32 | 18.4% | 32441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 18.4% | 111 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.9% | 62 |
| mld.DustBunny 3.8 | 2.8 | 12.9% | 16 |
| maribo.melee.BMV 0.1 | 4.0 | 10.1% | 3 |
| zyx.nano.Ant 1.1 | 5.5 | 9.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.1% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 7.3% | 2 |
| bzdp.BoxCar 2.0 | 8.0 | 7.4% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.1 | 16 / 35 | 5189 |
| 2 | 1 | 66.9 | 81.6 | 17 / 35 | 5536 |
| 3 | 1 | 68.3 | 87.3 | 17 / 35 | 5669 |
| 4 | 1 | 68.0 | 84.4 | 22 / 35 | 5213 |
| 5 | 1 | 69.3 | 90.2 | 20 / 35 | 5473 |
| 6 | 1 | 67.8 | 84.1 | 19 / 35 | 5361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 61 | 64% |
| mld.DustBunny 3.8 | 43 | 84% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 39% | 82 |
| mld.DustBunny 3.8 | 25 | 25% | 55 |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 11% | 16 |
| zyx.nano.Ant 1.1 | 9 | 9% | 11 |
| maribo.melee.BMV 0.1 | 6 | 6% | 11 |
| fullsail.SweetTea 1.1 | 5 | 5% | 13 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 18 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.6 | 121 / 210 | 2.57 | 19.5% | 38023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.5% | 121 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 12 |
| fm.mammillarias 1.3 | 4.7 | 10.1% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.8% | 23 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.9% | 8 |
| sp.Nanos.Ember 1.1 | 7.5 | 7.4% | 3 |
| cs.sheldor.Talon 1.1 | 7.5 | 7.7% | 0 |
| sample.Tracker 1.0 | 9.3 | 4.4% | 0 |
| sample.Fire 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 80.6 | 17 / 35 | 6556 |
| 2 | 1 | 70.6 | 87.9 | 25 / 35 | 6026 |
| 3 | 1 | 68.4 | 79.0 | 19 / 35 | 6260 |
| 4 | 1 | 71.0 | 86.0 | 23 / 35 | 6761 |
| 5 | 1 | 66.8 | 74.3 | 16 / 35 | 5845 |
| 6 | 1 | 70.3 | 87.6 | 21 / 35 | 6575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 41 | 80% |
| myl.micro.Troodon 1.10 | 38 | 95% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| myl.nano.KomoriNinja 1.1 | 13 | 77% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 21% | 41 |
| myl.micro.Troodon 1.10 | 17 | 19% | 64 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 22 |
| fm.mammillarias 1.3 | 15 | 17% | 17 |
| myl.nano.KomoriNinja 1.1 | 13 | 15% | 34 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 17 |
| sample.Fire 1.0 | 3 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.9 | 157 / 210 | 1.91 | 21.3% | 41678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.3% | 157 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.9% | 17 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.0% | 1 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 3 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.1% | 5 |
| yk.JahMicro 1.0 | 7.7 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 7.0% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.7 | 26 / 35 | 6459 |
| 2 | 1 | 71.0 | 91.7 | 25 / 35 | 6588 |
| 3 | 1 | 72.4 | 92.4 | 28 / 35 | 7283 |
| 4 | 1 | 72.8 | 92.7 | 26 / 35 | 7976 |
| 5 | 1 | 69.7 | 84.8 | 23 / 35 | 6614 |
| 6 | 1 | 71.6 | 91.1 | 29 / 35 | 6758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 95% |
| stelo.SoJNanoMelee 1.1 | 41 | 93% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| tj.zombie1n 1.0.1 | 16 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 75% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 34% | 85 |
| tvv.micro.Antares 1.1.1 | 9 | 17% | 34 |
| stelo.SoJNanoMelee 1.1 | 7 | 13% | 29 |
| tj.zombie1n 1.0.1 | 6 | 11% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 8% | 7 |
| repositorio.NanoStep 1.0 | 2 | 4% | 6 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.0 | 89 / 210 | 3.70 | 15.7% | 29197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 15.7% | 89 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 28 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 29 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.1% | 23 |
| sam.Samspin 1.0 | 5.5 | 10.1% | 15 |
| EBBU.Sim2 1.02 | 6.3 | 9.4% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 76.2 | 18 / 35 | 4642 |
| 2 | 1 | 61.1 | 64.8 | 15 / 35 | 4460 |
| 3 | 1 | 63.7 | 70.5 | 14 / 35 | 5034 |
| 4 | 1 | 64.4 | 72.1 | 14 / 35 | 5074 |
| 5 | 1 | 61.7 | 64.4 | 12 / 35 | 4810 |
| 6 | 1 | 64.3 | 72.1 | 16 / 35 | 5177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 64% |
| simonton.nano.MeleeSeed 1.8 | 26 | 92% |
| ahf.NanoAndrew .4 | 24 | 88% |
| sam.Samspin 1.0 | 12 | 100% |
| EBBU.Sim2 1.02 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 22 |
| ahf.NanoAndrew .4 | 17 | 14% | 38 |
| oog.melee.Corsair 1.0 | 17 | 14% | 35 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 39 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 12% | 15 |
| zyx.nano.BacillusComma 1.0 | 12 | 10% | 19 |
| sam.Samspin 1.0 | 12 | 10% | 17 |
| EBBU.Sim2 1.02 | 11 | 9% | 17 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.6 | 127 / 210 | 2.30 | 19.0% | 33105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.0% | 127 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 33 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.0% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.1% | 7 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.2% | 3 |
| fm.claire 1.7 | 6.3 | 8.3% | 0 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 5 |
| pa.Improved 1.0 | 9.2 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 23 / 35 | 5634 |
| 2 | 1 | 66.4 | 77.8 | 18 / 35 | 5122 |
| 3 | 1 | 67.5 | 82.2 | 21 / 35 | 5597 |
| 4 | 1 | 69.7 | 89.5 | 22 / 35 | 5852 |
| 5 | 1 | 68.9 | 86.0 | 23 / 35 | 5753 |
| 6 | 1 | 68.2 | 86.3 | 20 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 76% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| arthord.NanoSatanMelee Beta | 16 | 88% |
| gh.nano.Grofvuil 0.2 | 15 | 73% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 40% | 75 |
| gh.nano.Grofvuil 0.2 | 15 | 18% | 30 |
| oog.melee.CapuletDroid 1.1 | 10 | 12% | 44 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 15 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 13 |
| sample.SpinBot 1.0 | 6 | 7% | 11 |
| fm.claire 1.7 | 4 | 5% | 7 |
| pa.Improved 1.0 | 1 | 1% | 8 |
| kurios.DOSexe .9b | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.6 | 87 / 210 | 2.83 | 17.7% | 35156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 17.7% | 87 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.7% | 37 |
| mz.MicroGodMelee 1 | 3.2 | 13.4% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 14.3% | 43 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 8 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 0 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 1 |
| fire219.CatBot 1.0 | 9.0 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.2 | 15 / 35 | 5519 |
| 2 | 1 | 67.7 | 82.9 | 15 / 35 | 5997 |
| 3 | 1 | 67.7 | 79.4 | 16 / 35 | 6034 |
| 4 | 1 | 68.1 | 80.3 | 16 / 35 | 6293 |
| 5 | 1 | 65.7 | 75.9 | 10 / 35 | 5670 |
| 6 | 1 | 67.7 | 84.1 | 15 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 43 | 77% |
| mz.MicroGodMelee 1 | 37 | 51% |
| gh.micro.Gruweltje 0.7 | 23 | 74% |
| DBall.Anarchy 0.1 | 11 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 40 | 32% | 58 |
| spinnercat.micro.Tyger 0.1 | 30 | 24% | 64 |
| gh.micro.Gruweltje 0.7 | 28 | 23% | 47 |
| acogdev.alpha 0.2 | 10 | 8% | 11 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 7 |
| el.JumpShoot 0.2 | 3 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 76.2 | 114 / 210 | 3.14 | 17.3% | 32977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 17.3% | 114 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.2% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.2% | 3 |
| germ.TheMind .2 | 5.0 | 9.2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.4% | 3 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 5 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.6% | 3 |
| sample.Crazy 1.0 | 9.0 | 6.8% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 80.6 | 22 / 35 | 6132 |
| 2 | 1 | 63.3 | 67.3 | 17 / 35 | 5071 |
| 3 | 1 | 66.8 | 78.7 | 21 / 35 | 5343 |
| 4 | 1 | 66.2 | 76.8 | 18 / 35 | 5480 |
| 5 | 1 | 67.1 | 78.1 | 20 / 35 | 5577 |
| 6 | 1 | 65.6 | 75.6 | 16 / 35 | 5374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 71% |
| germ.TheMind .2 | 10 | 80% |
| awesomeness.Elite 1.0 | 9 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 45 | 47% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 19% | 34 |
| germ.TheMind .2 | 11 | 11% | 22 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 13 |
| awesomeness.Elite 1.0 | 6 | 6% | 17 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 12 |
| sample.Crazy 1.0 | 1 | 1% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.7 | 150 / 210 | 2.01 | 20.1% | 32873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 20.1% | 150 |
| rz.HawkOnFire 0.1 | 2.0 | 13.2% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 9.8% | 3 |
| maribo.IotaCT 1.1 | 5.0 | 10.3% | 10 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.8% | 7 |
| ratosh.Wesco 1.4 | 7.5 | 8.3% | 0 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 5 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 21 / 35 | 5402 |
| 2 | 1 | 69.0 | 83.8 | 25 / 35 | 4932 |
| 3 | 1 | 70.9 | 89.8 | 25 / 35 | 5760 |
| 4 | 1 | 71.3 | 91.4 | 26 / 35 | 5697 |
| 5 | 1 | 70.4 | 90.5 | 25 / 35 | 5334 |
| 6 | 1 | 71.8 | 93.3 | 28 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 62 | 92% |
| nz.jdc.nano.GridFu 1.0 | 39 | 97% |
| stelo.PatternRobot 1.0 | 23 | 96% |
| timmit.nano.TimDog 0.33 | 11 | 91% |
| maribo.IotaCT 1.1 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 89% |
| spinnercat.Omen 1.0 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 26% | 64 |
| nz.jdc.nano.GridFu 1.0 | 9 | 15% | 55 |
| timmit.nano.TimDog 0.33 | 9 | 15% | 24 |
| maribo.IotaCT 1.1 | 9 | 15% | 16 |
| stelo.PatternRobot 1.0 | 6 | 10% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 10% | 14 |
| ratosh.Wesco 1.4 | 5 | 8% | 10 |
| spinnercat.Omen 1.0 | 2 | 3% | 3 |

## Melee bench: F10

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.3 | 172 / 210 | 1.79 | 21.2% | 39159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.2% | 172 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.9% | 12 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 6 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.7% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.3% | 1 |
| sanja.First 0.1 | 6.7 | 8.3% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.1% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 31 / 35 | 6009 |
| 2 | 1 | 71.8 | 93.3 | 30 / 35 | 6767 |
| 3 | 1 | 71.1 | 92.1 | 28 / 35 | 6548 |
| 4 | 1 | 71.8 | 94.3 | 29 / 35 | 6480 |
| 5 | 1 | 70.6 | 85.4 | 28 / 35 | 6794 |
| 6 | 1 | 70.9 | 90.5 | 26 / 35 | 6561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 37 | 92% |
| tvv.nano.Polaris 1.2 | 35 | 100% |
| sanja.First 0.1 | 25 | 100% |
| cvt.Firsty 1.0 | 23 | 100% |
| Grystrion.TrackerWO 1.0 | 18 | 100% |
| zyx.micro.Ant 1.1 | 18 | 83% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 13 | 33% | 37 |
| baal.nano.N 1.42 | 10 | 26% | 44 |
| Grystrion.TrackerWO 1.0 | 5 | 13% | 17 |
| tvv.nano.Polaris 1.2 | 4 | 10% | 54 |
| sanja.First 0.1 | 4 | 10% | 21 |
| sample.RamFire 1.0 | 2 | 5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 15 |
| cvt.Firsty 1.0 | 0 | 0% | 15 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.1 | 82 / 210 | 3.69 | 15.6% | 31200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.3 | 15.6% | 82 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 60 |
| cs.Wren 1.0 | 3.0 | 12.2% | 25 |
| js.PinBall 1.6 | 4.5 | 11.3% | 16 |
| mz.Cork 0.1 | 4.8 | 10.6% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 3 |
| evd.X1 0.01 | 6.7 | 8.6% | 6 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.2% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 69.2 | 12 / 35 | 4829 |
| 2 | 1 | 65.8 | 76.8 | 15 / 35 | 5468 |
| 3 | 2 | 63.3 | 69.8 | 16 / 35 | 4948 |
| 4 | 2 | 60.3 | 61.3 | 11 / 35 | 4755 |
| 5 | 1 | 62.3 | 67.0 | 14 / 35 | 5076 |
| 6 | 1 | 66.4 | 76.5 | 14 / 35 | 6124 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 50 | 76% |
| cs.Wren 1.0 | 28 | 79% |
| mz.Cork 0.1 | 14 | 86% |
| js.PinBall 1.6 | 8 | 75% |
| joe.ADinosaur 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 0% |
| evd.X1 0.01 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 42 | 33% | 86 |
| cs.Wren 1.0 | 22 | 17% | 40 |
| evd.X1 0.01 | 21 | 16% | 21 |
| joe.ADinosaur 1.0 | 15 | 12% | 18 |
| js.PinBall 1.6 | 11 | 9% | 17 |
| mz.Cork 0.1 | 8 | 6% | 17 |
| jsal.Jsalbot 1.0 | 4 | 3% | 5 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.8 | 133 / 210 | 2.28 | 19.3% | 31358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.3% | 133 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 22 |
| ntc.Opposite 1.5 | 2.8 | 11.1% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.1% | 3 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.7% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.6% | 15 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 7 |
| DBall.NUKE 0.1 | 8.2 | 8.0% | 8 |
| donjezza.Muncho 1.0 | 8.7 | 6.4% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 24 / 35 | 5369 |
| 2 | 1 | 66.9 | 79.4 | 21 / 35 | 4913 |
| 3 | 1 | 68.7 | 85.4 | 21 / 35 | 5362 |
| 4 | 1 | 68.8 | 87.9 | 22 / 35 | 5165 |
| 5 | 1 | 68.9 | 87.6 | 23 / 35 | 5273 |
| 6 | 1 | 68.9 | 86.0 | 22 / 35 | 5276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 47 | 87% |
| stelo.AreaTargetingBot 1.1 | 41 | 88% |
| ntc.Opposite 1.5 | 15 | 73% |
| donjezza.Muncho 1.0 | 13 | 100% |
| disan.Chair 2.2.0 | 12 | 83% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| DBall.NUKE 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 18 | 23% | 31 |
| myl.nano.Graviton 1.10 | 17 | 22% | 53 |
| ntc.Opposite 1.5 | 16 | 21% | 27 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 37 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 8% | 16 |
| disan.Chair 2.2.0 | 4 | 5% | 15 |
| pbg.R2D2 1.0 | 3 | 4% | 10 |
| DBall.NUKE 0.1 | 2 | 3% | 9 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 67.8 | 52 / 210 | 3.90 | 14.3% | 25286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 15.1% | 58 |
| hadur117.micro.SaorWN3 0.1 | 2.2 | 14.3% | 52 |
| kawigi.micro.Shiz 1.1 | 3.0 | 14.0% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.8% | 29 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 9 |
| stelo.MirrorNano 1.3 | 7.3 | 7.1% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 71.7 | 9 / 35 | 4033 |
| 2 | 2 | 61.8 | 65.7 | 9 / 35 | 4272 |
| 3 | 3 | 61.8 | 66.3 | 6 / 35 | 3969 |
| 4 | 2 | 62.0 | 65.7 | 8 / 35 | 4611 |
| 5 | 2 | 62.3 | 67.9 | 11 / 35 | 4224 |
| 6 | 2 | 62.5 | 69.2 | 9 / 35 | 4177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 48% |
| kawigi.micro.Shiz 1.1 | 17 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 41% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 64 | 41% | 77 |
| kawigi.micro.Shiz 1.1 | 25 | 16% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 15% | 36 |
| yagami.Tidus 0.11 | 18 | 11% | 30 |
| ejb.Polaris 1.0.1 | 13 | 8% | 18 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.4 | 135 / 210 | 2.68 | 17.9% | 28884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 17.9% | 135 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 11 |
| wompi.Quokka 1.6 | 3.2 | 11.9% | 18 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 24 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 5 |
| bayen.UbaMicro 1.4 | 6.5 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 2 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.2 | 25 / 35 | 5370 |
| 2 | 1 | 66.3 | 80.0 | 22 / 35 | 4834 |
| 3 | 1 | 67.9 | 86.0 | 25 / 35 | 4725 |
| 4 | 1 | 67.7 | 83.2 | 23 / 35 | 4819 |
| 5 | 1 | 66.1 | 81.0 | 21 / 35 | 4585 |
| 6 | 1 | 65.3 | 74.9 | 19 / 35 | 4551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 94% |
| wee.Gem 1.8.4 | 33 | 97% |
| wompi.Quokka 1.6 | 24 | 88% |
| ratosh.Nobo 0.21 | 14 | 93% |
| m3thos.Eva00 1.1 | 10 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 13 | 17% | 28 |
| bzdp.Pansy 2.1 | 12 | 16% | 53 |
| maribo.FollowFire 1 | 12 | 16% | 14 |
| wee.Gem 1.8.4 | 10 | 13% | 45 |
| ratosh.Nobo 0.21 | 8 | 10% | 19 |
| bayen.UbaMicro 1.4 | 8 | 10% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 10 |
| m3thos.Eva00 1.1 | 3 | 4% | 14 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 10 |

## Melee bench: F15

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.6 | 121 / 210 | 2.30 | 20.3% | 44563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.2 | 20.3% | 121 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 67 |
| mz.NanoGod 2.02 | 2.8 | 15.3% | 17 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.3 | 8.9% | 2 |
| stuff.Vlad 0.1 | 5.5 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.9% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 89.2 | 25 / 35 | 7706 |
| 2 | 1 | 72.7 | 88.9 | 24 / 35 | 7873 |
| 3 | 1 | 71.1 | 85.1 | 17 / 35 | 7307 |
| 4 | 1 | 70.9 | 83.5 | 17 / 35 | 7541 |
| 5 | 1 | 71.8 | 87.0 | 21 / 35 | 7355 |
| 6 | 2 | 69.3 | 79.7 | 17 / 35 | 6781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 93 | 76% |
| ayk.WallHugger 1.0 | 15 | 93% |
| drd.Dreadknoght 0.9 | 11 | 100% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| mz.NanoGod 2.02 | 7 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 44% | 124 |
| mz.NanoGod 2.02 | 34 | 38% | 47 |
| ayk.WallHugger 1.0 | 6 | 7% | 14 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 9 |
| stelo.PianistNano 1.2 | 3 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 8 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.3 | 101 / 210 | 3.31 | 16.8% | 30361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 16.8% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.3% | 24 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.9% | 22 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.9% | 25 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.3% | 6 |
| conscience.Electron 1.3g | 6.7 | 8.4% | 1 |
| ap.Frederick 1.1 | 7.8 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 6.0% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 69.8 | 15 / 35 | 5006 |
| 2 | 1 | 68.3 | 85.4 | 21 / 35 | 5158 |
| 3 | 1 | 66.2 | 74.9 | 17 / 35 | 5580 |
| 4 | 1 | 62.5 | 69.5 | 13 / 35 | 4508 |
| 5 | 1 | 66.7 | 79.4 | 20 / 35 | 5198 |
| 6 | 1 | 63.4 | 66.7 | 15 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 26 | 77% |
| dummy.micro.Sparrow 2.5 | 24 | 71% |
| bvh.micro.Freya 0.3 | 14 | 79% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 67% |

Hadur died in 109 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 21 | 19% | 41 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 17% | 41 |
| bvh.micro.Freya 0.3 | 18 | 17% | 28 |
| voidious.micro.BlitzBat 1.05 | 15 | 14% | 49 |
| conscience.Electron 1.3g | 13 | 12% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 12 |
| dl.BetterWalls 1.0 | 9 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 9 |

## Melee bench: F17

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.2 | 156 / 210 | 1.98 | 21.8% | 44692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.8% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.8% | 14 |
| sul.Lunar 1.1 | 3.5 | 11.3% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.9% | 13 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.6% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 5 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.8% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.3% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 2 |
| sample.Corners 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.8 | 21 / 35 | 7032 |
| 2 | 1 | 73.4 | 92.7 | 28 / 35 | 7894 |
| 3 | 1 | 72.3 | 90.2 | 27 / 35 | 7427 |
| 4 | 1 | 72.2 | 90.5 | 27 / 35 | 7511 |
| 5 | 1 | 73.2 | 92.4 | 28 / 35 | 7963 |
| 6 | 1 | 70.8 | 85.4 | 25 / 35 | 6865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 43 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 100% |
| supersample.SuperBoxBot 1.0 | 33 | 94% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 100% |
| mme.NikeEnhanced 2.0 | 12 | 92% |
| dsw.StaticD 1.0 | 10 | 80% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 54 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 15 | 28% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 19% | 49 |
| dsw.StaticD 1.0 | 10 | 19% | 25 |
| sul.Lunar 1.1 | 6 | 11% | 53 |
| tlp.ThreeLeggedPig 1 | 5 | 9% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 6% | 12 |
| mme.NikeEnhanced 2.0 | 3 | 6% | 11 |
| sample.Corners 1.0 | 2 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.2 | 99 / 210 | 3.14 | 17.3% | 36154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 17.3% | 99 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 29 |
| mld.Wisdom 1.0 | 2.8 | 12.6% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.4% | 27 |
| KiraNL.Chupacabra 0.4 | 5.3 | 10.1% | 9 |
| amz.NanoClone 1.41 | 5.5 | 9.9% | 11 |
| sample.Walls 1.0 | 7.0 | 8.6% | 13 |
| GarmBox.Oranges 1.0 | 8.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.4 | 17 / 35 | 5826 |
| 2 | 1 | 67.6 | 80.6 | 19 / 35 | 6163 |
| 3 | 1 | 64.0 | 69.5 | 12 / 35 | 5652 |
| 4 | 1 | 67.5 | 78.7 | 21 / 35 | 6323 |
| 5 | 1 | 62.5 | 67.6 | 10 / 35 | 5578 |
| 6 | 1 | 68.8 | 82.2 | 20 / 35 | 6612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 85% |
| radnor.DoctorBob 1.42 | 34 | 76% |
| sample.Walls 1.0 | 15 | 93% |
| mld.Wisdom 1.0 | 11 | 55% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 517. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 35 | 32% | 40 |
| radnor.DoctorBob 1.42 | 30 | 27% | 62 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 20% | 52 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 21 |
| amz.NanoClone 1.41 | 8 | 7% | 14 |
| sample.Walls 1.0 | 3 | 3% | 13 |
| jangs.ns51 1.0 | 2 | 2% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

