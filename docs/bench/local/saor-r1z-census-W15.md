# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.6 | 149 / 210 | 1.94 | 21.5% | 43400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 21.5% | 149 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 22 |
| mz.AntiGrav 1.0 | 2.7 | 13.8% | 12 |
| mld.Infinity 2.2 | 4.2 | 12.5% | 13 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 9 |
| sample.Walls 1.0 | 6.7 | 6.9% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.6% | 2 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 88.6 | 24 / 35 | 6976 |
| 2 | 1 | 72.9 | 91.4 | 27 / 35 | 7347 |
| 3 | 1 | 72.7 | 91.7 | 26 / 35 | 7211 |
| 4 | 1 | 72.9 | 91.7 | 27 / 35 | 7221 |
| 5 | 1 | 71.3 | 84.4 | 20 / 35 | 7252 |
| 6 | 1 | 72.5 | 89.5 | 25 / 35 | 7393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 94% |
| mld.Infinity 2.2 | 43 | 95% |
| radnor.DoctorBob 1.42 | 36 | 78% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 1 | 0% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 41% | 60 |
| mz.AntiGrav 1.0 | 12 | 20% | 61 |
| mld.Infinity 2.2 | 8 | 13% | 48 |
| amz.NanoClone 1.41 | 8 | 13% | 15 |
| sample.Walls 1.0 | 3 | 5% | 10 |
| jangs.ns51 1.0 | 3 | 5% | 8 |
| GarmBox.Oranges 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.9 | 129 / 210 | 2.00 | 18.9% | 31106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.9% | 129 |
| oog.melee.Mercutio 1.0 | 2.3 | 13.9% | 41 |
| mld.DustBunny 3.8 | 3.7 | 12.5% | 17 |
| maribo.melee.BMV 0.1 | 4.2 | 10.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.6% | 9 |
| bzdp.BoxCar 2.0 | 8.0 | 7.3% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 7.1% | 4 |
| cs.Grudge 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.8 | 22 / 35 | 4784 |
| 2 | 1 | 67.4 | 83.5 | 19 / 35 | 5527 |
| 3 | 1 | 68.3 | 88.3 | 19 / 35 | 5512 |
| 4 | 1 | 68.5 | 88.3 | 21 / 35 | 5050 |
| 5 | 1 | 69.3 | 91.1 | 22 / 35 | 5354 |
| 6 | 1 | 69.5 | 92.7 | 26 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 75% |
| mld.DustBunny 3.8 | 54 | 85% |
| djdjdj.NanoSkunk10 1.0 | 15 | 93% |
| maribo.melee.BMV 0.1 | 11 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| fullsail.SweetTea 1.1 | 9 | 89% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 33% | 73 |
| mld.DustBunny 3.8 | 24 | 30% | 66 |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 15% | 20 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 17 |
| maribo.melee.BMV 0.1 | 4 | 5% | 14 |
| fullsail.SweetTea 1.1 | 4 | 5% | 8 |
| zyx.nano.Ant 1.1 | 4 | 5% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 77.7 | 97 / 210 | 3.01 | 18.1% | 36183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.1% | 97 |
| myl.micro.Troodon 1.10 | 2.2 | 14.9% | 47 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.6% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.1% | 25 |
| fm.mammillarias 1.3 | 5.0 | 9.3% | 7 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 13 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 2 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 4 |
| sample.Fire 1.0 | 9.0 | 5.5% | 3 |
| sample.Tracker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 69.8 | 13 / 35 | 5653 |
| 2 | 1 | 67.7 | 77.1 | 14 / 35 | 5991 |
| 3 | 1 | 69.3 | 84.1 | 18 / 35 | 6437 |
| 4 | 1 | 68.1 | 78.4 | 17 / 35 | 6187 |
| 5 | 1 | 65.7 | 72.7 | 14 / 35 | 5765 |
| 6 | 1 | 69.4 | 83.8 | 21 / 35 | 6150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 32 | 84% |
| myl.micro.Troodon 1.10 | 32 | 97% |
| myl.nano.KomoriNinja 1.1 | 19 | 79% |
| cb.nano.Insomnia 1.0 | 15 | 87% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 28 | 25% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 26 | 23% | 46 |
| fm.mammillarias 1.3 | 21 | 18% | 24 |
| myl.nano.KomoriNinja 1.1 | 14 | 12% | 39 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 17 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 6 |
| sample.Fire 1.0 | 3 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.6 | 123 / 210 | 2.48 | 19.1% | 35844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 19.1% | 123 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.8% | 30 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.9% | 28 |
| tj.zombie1n 1.0.1 | 5.2 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.9% | 2 |
| yk.JahMicro 1.0 | 6.8 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 15 / 35 | 5742 |
| 2 | 1 | 68.5 | 82.2 | 20 / 35 | 6045 |
| 3 | 1 | 68.0 | 83.8 | 22 / 35 | 5391 |
| 4 | 1 | 70.2 | 88.6 | 24 / 35 | 6615 |
| 5 | 1 | 70.5 | 91.7 | 22 / 35 | 6433 |
| 6 | 1 | 67.0 | 78.4 | 20 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 86% |
| stelo.SoJNanoMelee 1.1 | 41 | 78% |
| tvv.micro.Antares 1.1.1 | 13 | 85% |
| tj.zombie1n 1.0.1 | 12 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| yk.JahMicro 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 33% | 80 |
| stelo.SoJNanoMelee 1.1 | 25 | 29% | 42 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 8% | 11 |
| tj.zombie1n 1.0.1 | 7 | 8% | 10 |
| tvv.micro.Antares 1.1.1 | 5 | 6% | 20 |
| yk.JahMicro 1.0 | 4 | 5% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 14 |
| sample.VelociRobot 1.0 | 4 | 5% | 7 |
| repositorio.NanoStep 1.0 | 2 | 2% | 11 |

## Melee bench: F05

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 70.7 | 83 / 210 | 3.64 | 15.6% | 28735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 15.6% | 83 |
| oog.melee.Corsair 1.0 | 2.2 | 12.5% | 31 |
| ahf.NanoAndrew .4 | 3.7 | 11.3% | 26 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.0% | 30 |
| sam.Samspin 1.0 | 4.8 | 10.2% | 17 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.1% | 10 |
| EBBU.Sim2 1.02 | 7.2 | 9.4% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.3 | 6.4% | 0 |
| sample.TrackFire 1.0 | 9.7 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 66.0 | 15 / 35 | 4706 |
| 2 | 1 | 60.9 | 67.9 | 9 / 35 | 4604 |
| 3 | 1 | 64.1 | 73.3 | 15 / 35 | 4896 |
| 4 | 1 | 64.2 | 72.7 | 15 / 35 | 5167 |
| 5 | 1 | 66.1 | 80.0 | 16 / 35 | 4960 |
| 6 | 1 | 61.2 | 64.1 | 13 / 35 | 4402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 64% |
| simonton.nano.MeleeSeed 1.8 | 30 | 87% |
| ahf.NanoAndrew .4 | 19 | 74% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sam.Samspin 1.0 | 21 | 17% | 28 |
| oog.melee.Corsair 1.0 | 20 | 16% | 43 |
| robar.nano.Assertive_Melee 0.2 | 20 | 16% | 24 |
| simonton.nano.MeleeSeed 1.8 | 16 | 13% | 38 |
| EBBU.Sim2 1.02 | 15 | 12% | 26 |
| ahf.NanoAndrew .4 | 11 | 9% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 9% | 10 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.9 | 131 / 210 | 2.00 | 19.6% | 32904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 19.6% | 131 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 31 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.1% | 18 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 9 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.2% | 4 |
| fm.claire 1.7 | 6.5 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 4 |
| pa.Improved 1.0 | 8.8 | 6.2% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.0 | 24 / 35 | 5691 |
| 2 | 1 | 69.7 | 87.0 | 22 / 35 | 6114 |
| 3 | 1 | 67.6 | 83.8 | 21 / 35 | 5186 |
| 4 | 1 | 70.1 | 93.3 | 24 / 35 | 5250 |
| 5 | 1 | 68.7 | 88.3 | 17 / 35 | 5225 |
| 6 | 1 | 68.9 | 88.3 | 23 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 79% |
| oog.melee.CapuletDroid 1.1 | 46 | 87% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 37% | 78 |
| oog.melee.CapuletDroid 1.1 | 15 | 19% | 55 |
| gh.nano.Grofvuil 0.2 | 8 | 10% | 25 |
| sample.SpinBot 1.0 | 8 | 10% | 13 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 10 |
| pa.Improved 1.0 | 4 | 5% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 9 |
| kurios.DOSexe .9b | 3 | 4% | 7 |
| fm.claire 1.7 | 3 | 4% | 5 |

## Melee bench: F07

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.3 | 92 / 210 | 2.87 | 17.4% | 33023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.4% | 92 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 40 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 13.8% | 38 |
| mz.MicroGodMelee 1 | 4.0 | 12.1% | 28 |
| DBall.Anarchy 0.1 | 5.0 | 8.7% | 7 |
| caimano.Furia_Ceca 0.22 | 6.8 | 7.5% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.6% | 1 |
| acogdev.alpha 0.2 | 7.7 | 6.6% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.9% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.1 | 17 / 35 | 5177 |
| 2 | 1 | 68.1 | 81.6 | 15 / 35 | 6191 |
| 3 | 1 | 65.1 | 76.5 | 14 / 35 | 5198 |
| 4 | 1 | 67.2 | 80.0 | 16 / 35 | 5767 |
| 5 | 1 | 65.6 | 79.0 | 14 / 35 | 4998 |
| 6 | 1 | 67.4 | 81.3 | 16 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 73% |
| mz.MicroGodMelee 1 | 35 | 63% |
| gh.micro.Gruweltje 0.7 | 27 | 67% |
| DBall.Anarchy 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 26 | 22% | 47 |
| spinnercat.micro.Tyger 0.1 | 24 | 20% | 58 |
| mz.MicroGodMelee 1 | 23 | 19% | 41 |
| caimano.Furia_Ceca 0.22 | 12 | 10% | 14 |
| acogdev.alpha 0.2 | 12 | 10% | 13 |
| el.JumpShoot 0.2 | 7 | 6% | 8 |
| DBall.Anarchy 0.1 | 5 | 4% | 13 |
| fire219.CatBot 1.0 | 5 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 4 | 3% | 9 |

## Melee bench: F08

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.5 | 90 / 210 | 3.84 | 15.5% | 29306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.5 | 15.5% | 90 |
| simonton.micro.Sprout 1.1.3 | 1.5 | 15.4% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.2 | 13.3% | 27 |
| germ.TheMind .2 | 4.7 | 9.6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 8 |
| awesomeness.Elite 1.0 | 6.5 | 8.6% | 9 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.3% | 9 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.4% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 73.0 | 15 / 35 | 4656 |
| 2 | 2 | 62.8 | 66.7 | 16 / 35 | 4846 |
| 3 | 2 | 62.5 | 66.3 | 13 / 35 | 4835 |
| 4 | 1 | 61.8 | 63.8 | 12 / 35 | 4905 |
| 5 | 2 | 62.4 | 66.7 | 16 / 35 | 4698 |
| 6 | 1 | 65.5 | 74.3 | 18 / 35 | 5366 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 86% |
| germ.TheMind .2 | 11 | 82% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 437. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 36% | 77 |
| germ.TheMind .2 | 20 | 17% | 27 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 15% | 36 |
| stelo.UntouchableNano 1.3 | 14 | 12% | 21 |
| awesomeness.Elite 1.0 | 10 | 8% | 18 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 10 |
| sample.Crazy 1.0 | 2 | 2% | 9 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.1 | 122 / 210 | 2.61 | 18.1% | 28448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.1% | 122 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.3% | 18 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.8% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.8% | 12 |
| ratosh.Wesco 1.4 | 6.5 | 9.1% | 9 |
| stelo.PatternRobot 1.0 | 8.2 | 8.0% | 11 |
| spinnercat.Omen 1.0 | 8.5 | 7.7% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 16 / 35 | 4837 |
| 2 | 1 | 67.0 | 79.7 | 18 / 35 | 4325 |
| 3 | 1 | 69.1 | 85.1 | 25 / 35 | 4853 |
| 4 | 1 | 68.7 | 85.1 | 22 / 35 | 4753 |
| 5 | 1 | 68.8 | 84.1 | 22 / 35 | 5002 |
| 6 | 1 | 67.0 | 79.0 | 19 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 55 | 89% |
| nz.jdc.nano.GridFu 1.0 | 26 | 96% |
| maribo.IotaCT 1.1 | 16 | 100% |
| stelo.PatternRobot 1.0 | 11 | 73% |
| timmit.nano.TimDog 0.33 | 10 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 21 | 24% | 58 |
| ratosh.Wesco 1.4 | 16 | 18% | 27 |
| timmit.nano.TimDog 0.33 | 13 | 15% | 23 |
| stelo.PatternRobot 1.0 | 12 | 14% | 23 |
| nz.jdc.nano.GridFu 1.0 | 11 | 13% | 38 |
| maribo.IotaCT 1.1 | 6 | 7% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 8 |
| spinnercat.Omen 1.0 | 4 | 5% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.6 | 126 / 210 | 2.48 | 19.0% | 35006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 19.0% | 126 |
| tvv.nano.Polaris 1.2 | 2.0 | 13.0% | 36 |
| baal.nano.N 1.42 | 3.2 | 11.2% | 6 |
| zyx.micro.Ant 1.1 | 4.7 | 10.0% | 17 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.6% | 5 |
| sanja.First 0.1 | 6.7 | 8.7% | 6 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 8.0% | 1 |
| cvt.Firsty 1.0 | 7.7 | 7.5% | 11 |
| sample.RamFire 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.5 | 27 / 35 | 6007 |
| 2 | 1 | 67.5 | 81.9 | 17 / 35 | 5691 |
| 3 | 1 | 68.3 | 83.5 | 24 / 35 | 5743 |
| 4 | 1 | 66.1 | 77.5 | 15 / 35 | 5539 |
| 5 | 1 | 68.7 | 85.7 | 20 / 35 | 6316 |
| 6 | 1 | 68.3 | 83.5 | 23 / 35 | 5710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 28 | 93% |
| tvv.nano.Polaris 1.2 | 25 | 84% |
| sanja.First 0.1 | 23 | 96% |
| cvt.Firsty 1.0 | 17 | 76% |
| zyx.micro.Ant 1.1 | 17 | 65% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 10 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 42 | 49% | 54 |
| tvv.nano.Polaris 1.2 | 11 | 13% | 45 |
| Grystrion.TrackerWO 1.0 | 10 | 12% | 21 |
| cvt.Firsty 1.0 | 8 | 9% | 20 |
| baal.nano.N 1.42 | 5 | 6% | 27 |
| sanja.First 0.1 | 4 | 5% | 24 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 10 |
| sample.RamFire 1.0 | 2 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 66.5 | 74 / 210 | 4.02 | 14.9% | 30457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 14.7% | 68 |
| hadur117.micro.SaorW15 0.1 | 1.7 | 14.9% | 74 |
| cs.Wren 1.0 | 3.0 | 13.0% | 31 |
| js.PinBall 1.6 | 4.5 | 11.3% | 15 |
| mz.Cork 0.1 | 4.5 | 11.4% | 16 |
| joe.ADinosaur 1.0 | 6.2 | 9.7% | 2 |
| evd.X1 0.01 | 6.8 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 5.2% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 63.5 | 9 / 35 | 5133 |
| 2 | 2 | 61.5 | 65.7 | 12 / 35 | 4741 |
| 3 | 1 | 66.5 | 77.8 | 20 / 35 | 5457 |
| 4 | 1 | 61.5 | 64.4 | 12 / 35 | 5120 |
| 5 | 2 | 61.1 | 63.2 | 11 / 35 | 4915 |
| 6 | 2 | 61.8 | 64.1 | 10 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 44 | 82% |
| cs.Wren 1.0 | 24 | 67% |
| mz.Cork 0.1 | 10 | 100% |
| js.PinBall 1.6 | 8 | 88% |
| donjezza.Jezza 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 37 | 27% | 75 |
| cs.Wren 1.0 | 28 | 20% | 38 |
| evd.X1 0.01 | 28 | 20% | 28 |
| joe.ADinosaur 1.0 | 18 | 13% | 18 |
| PSW.Relentless 0.1 | 10 | 7% | 9 |
| js.PinBall 1.6 | 8 | 6% | 15 |
| mz.Cork 0.1 | 6 | 4% | 19 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.4 | 124 / 210 | 2.58 | 18.3% | 28835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 18.3% | 124 |
| myl.nano.Graviton 1.10 | 2.8 | 12.0% | 21 |
| ntc.Opposite 1.5 | 3.0 | 11.4% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.8% | 15 |
| disan.Chair 2.2.0 | 7.3 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 4 |
| donjezza.Muncho 1.0 | 8.7 | 6.5% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 18 / 35 | 4779 |
| 2 | 1 | 67.5 | 83.8 | 19 / 35 | 4929 |
| 3 | 1 | 69.3 | 87.9 | 25 / 35 | 5062 |
| 4 | 1 | 65.5 | 76.2 | 21 / 35 | 4409 |
| 5 | 1 | 66.0 | 77.8 | 19 / 35 | 4650 |
| 6 | 1 | 68.8 | 85.7 | 22 / 35 | 5006 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 84% |
| stelo.AreaTargetingBot 1.1 | 26 | 85% |
| ntc.Opposite 1.5 | 22 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| disan.Chair 2.2.0 | 14 | 86% |
| donjezza.Muncho 1.0 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| DBall.NUKE 0.1 | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 27 | 31% | 36 |
| myl.nano.Graviton 1.10 | 15 | 17% | 51 |
| pfvicm.Sobieski 7.2.3b | 12 | 14% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 20 |
| stelo.AreaTargetingBot 1.1 | 9 | 10% | 27 |
| disan.Chair 2.2.0 | 7 | 8% | 21 |
| pbg.R2D2 1.0 | 4 | 5% | 10 |
| donjezza.Muncho 1.0 | 2 | 2% | 11 |
| DBall.NUKE 0.1 | 1 | 1% | 10 |

## Melee bench: F13

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.5 | 67 / 210 | 3.93 | 14.5% | 25253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 2.2 | 14.5% | 67 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 44 |
| oog.melee.Capulet 1.2 | 2.5 | 14.5% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.5% | 33 |
| yagami.Tidus 0.11 | 4.3 | 12.6% | 16 |
| ejb.Polaris 1.0.1 | 6.0 | 9.8% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 74.6 | 13 / 35 | 4505 |
| 2 | 2 | 62.5 | 69.5 | 10 / 35 | 4104 |
| 3 | 4 | 60.7 | 61.6 | 13 / 35 | 3850 |
| 4 | 2 | 60.3 | 60.3 | 10 / 35 | 4088 |
| 5 | 2 | 64.0 | 69.8 | 13 / 35 | 4380 |
| 6 | 2 | 63.1 | 68.9 | 8 / 35 | 4326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 88% |
| yagami.Tidus 0.11 | 16 | 88% |
| kawigi.micro.Shiz 1.1 | 14 | 86% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 59 | 41% | 87 |
| yagami.Tidus 0.11 | 27 | 19% | 38 |
| kawigi.micro.Shiz 1.1 | 23 | 16% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 6% | 24 |
| ejb.Polaris 1.0.1 | 7 | 5% | 11 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| kurios.DOSexe .9a | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.3 | 120 / 210 | 2.78 | 17.2% | 25831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 17.2% | 120 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 16 |
| wompi.Quokka 1.6 | 3.3 | 11.1% | 20 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 18 |
| wee.Gem 1.8.4 | 4.7 | 10.9% | 24 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 4 |
| bayen.UbaMicro 1.4 | 6.7 | 9.2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.6 | 17 / 35 | 4230 |
| 2 | 1 | 65.6 | 83.2 | 21 / 35 | 3744 |
| 3 | 1 | 65.8 | 78.4 | 19 / 35 | 4543 |
| 4 | 1 | 67.6 | 84.1 | 23 / 35 | 4759 |
| 5 | 1 | 64.4 | 77.5 | 21 / 35 | 4032 |
| 6 | 1 | 66.4 | 83.8 | 19 / 35 | 4523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 91% |
| wee.Gem 1.8.4 | 24 | 96% |
| wompi.Quokka 1.6 | 18 | 83% |
| ratosh.Nobo 0.21 | 18 | 83% |
| m3thos.Eva00 1.1 | 15 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 20 | 22% | 24 |
| bzdp.Pansy 2.1 | 14 | 15% | 50 |
| ratosh.Nobo 0.21 | 12 | 13% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 12% | 16 |
| wompi.Quokka 1.6 | 9 | 10% | 22 |
| wee.Gem 1.8.4 | 8 | 9% | 39 |
| maribo.FollowFire 1 | 7 | 8% | 8 |
| stelo.MyAgileRobot 0.2 | 6 | 7% | 12 |
| m3thos.Eva00 1.1 | 4 | 4% | 14 |

## Melee bench: F15

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 87.0 | 130 / 210 | 2.17 | 20.6% | 43664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 20.6% | 130 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 57 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 16 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 5 |
| ayk.WallHugger 1.0 | 4.8 | 9.9% | 1 |
| stuff.Vlad 0.1 | 6.2 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.3 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.9 | 23 / 35 | 7560 |
| 2 | 1 | 70.5 | 81.9 | 19 / 35 | 6962 |
| 3 | 1 | 71.3 | 88.3 | 22 / 35 | 6739 |
| 4 | 1 | 72.5 | 91.4 | 23 / 35 | 7176 |
| 5 | 1 | 73.1 | 89.2 | 22 / 35 | 8056 |
| 6 | 1 | 70.6 | 82.2 | 21 / 35 | 7171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 108 | 85% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| ayk.WallHugger 1.0 | 10 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 34 | 42% | 134 |
| mz.NanoGod 2.02 | 24 | 30% | 34 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 18 |
| ayk.WallHugger 1.0 | 4 | 5% | 9 |
| stuff.Vlad 0.1 | 4 | 5% | 5 |
| stelo.PianistNano 1.2 | 4 | 5% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 5 |

## Melee bench: F16

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.6 | 107 / 210 | 3.29 | 16.9% | 28978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 16.9% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 21 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.8% | 25 |
| bvh.micro.Freya 0.3 | 3.5 | 11.6% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.2% | 15 |
| conscience.Electron 1.3g | 6.2 | 8.7% | 5 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 4 |
| ap.Frederick 1.1 | 8.2 | 7.1% | 11 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.1 | 19 / 35 | 4704 |
| 2 | 1 | 66.2 | 75.6 | 18 / 35 | 5384 |
| 3 | 1 | 64.5 | 73.7 | 18 / 35 | 4525 |
| 4 | 1 | 67.7 | 82.5 | 23 / 35 | 4905 |
| 5 | 1 | 65.7 | 75.6 | 20 / 35 | 4831 |
| 6 | 1 | 60.8 | 61.9 | 9 / 35 | 4629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 48 | 88% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 75% |
| bvh.micro.Freya 0.3 | 20 | 80% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 67% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 59 |
| conscience.Electron 1.3g | 16 | 16% | 21 |
| bvh.micro.Freya 0.3 | 14 | 14% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 13 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 36 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 27 |
| dl.BetterWalls 1.0 | 8 | 8% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 15 |

## Melee bench: F17

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.4 | 133 / 210 | 2.22 | 20.4% | 40803 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 20.4% | 133 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 24 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 12 |
| mme.NikeEnhanced 2.0 | 4.3 | 10.4% | 9 |
| supersample.SuperBoxBot 1.0 | 4.7 | 10.5% | 14 |
| dsw.StaticD 1.0 | 5.5 | 8.6% | 9 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 3 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.5% | 2 |
| sample.Corners 1.0 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.3 | 23 / 35 | 6577 |
| 2 | 1 | 69.5 | 81.3 | 22 / 35 | 6622 |
| 3 | 1 | 69.2 | 83.5 | 18 / 35 | 6725 |
| 4 | 1 | 71.7 | 91.1 | 26 / 35 | 6843 |
| 5 | 1 | 71.2 | 87.9 | 21 / 35 | 7214 |
| 6 | 1 | 71.0 | 87.3 | 23 / 35 | 6822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 48 | 88% |
| sul.Lunar 1.1 | 44 | 100% |
| supersample.SuperBoxBot 1.0 | 23 | 70% |
| dsw.StaticD 1.0 | 11 | 64% |
| mme.NikeEnhanced 2.0 | 9 | 78% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 77 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 32% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 23% | 60 |
| mme.NikeEnhanced 2.0 | 15 | 19% | 21 |
| dsw.StaticD 1.0 | 10 | 13% | 20 |
| sample.Corners 1.0 | 4 | 5% | 9 |
| sul.Lunar 1.1 | 3 | 4% | 45 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorW15 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.1 | 80 / 210 | 3.42 | 16.7% | 35657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorW15 0.1 | 1.0 | 16.7% | 80 |
| mld.Wisdom 1.0 | 2.8 | 13.1% | 37 |
| radnor.DoctorBob 1.42 | 3.0 | 12.6% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.8% | 33 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.0% | 10 |
| amz.NanoClone 1.41 | 6.3 | 9.4% | 8 |
| sample.Walls 1.0 | 7.0 | 8.7% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.6% | 4 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.7 | 15 / 35 | 5842 |
| 2 | 1 | 64.0 | 69.2 | 12 / 35 | 5811 |
| 3 | 1 | 66.6 | 77.5 | 15 / 35 | 6179 |
| 4 | 1 | 65.8 | 74.6 | 12 / 35 | 6132 |
| 5 | 1 | 65.5 | 71.1 | 16 / 35 | 6241 |
| 6 | 1 | 63.7 | 72.7 | 10 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 70% |
| radnor.DoctorBob 1.42 | 29 | 55% |
| mld.Wisdom 1.0 | 24 | 50% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 7 | 71% |
| amz.NanoClone 1.41 | 4 | 75% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 42 | 32% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 18% | 56 |
| radnor.DoctorBob 1.42 | 20 | 15% | 36 |
| KiraNL.Chupacabra 0.4 | 19 | 15% | 23 |
| amz.NanoClone 1.41 | 10 | 8% | 12 |
| GarmBox.Oranges 1.0 | 7 | 5% | 8 |
| sample.Walls 1.0 | 5 | 4% | 11 |
| jangs.ns51 1.0 | 3 | 2% | 8 |

