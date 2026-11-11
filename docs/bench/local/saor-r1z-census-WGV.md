# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 90.3 | 149 / 210 | 1.88 | 21.4% | 43365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 21.4% | 149 |
| mz.AntiGrav 1.0 | 2.3 | 14.2% | 16 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 20 |
| mld.Infinity 2.2 | 3.8 | 12.4% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| sample.Walls 1.0 | 6.2 | 7.6% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 8.2 | 5.7% | 2 |
| arthord.MannyPacquiao Beta | 9.0 | 4.4% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 87.9 | 24 / 35 | 7169 |
| 2 | 1 | 72.9 | 91.4 | 27 / 35 | 7725 |
| 3 | 1 | 72.3 | 90.2 | 25 / 35 | 7454 |
| 4 | 1 | 72.0 | 90.5 | 22 / 35 | 7240 |
| 5 | 1 | 71.4 | 86.3 | 23 / 35 | 7039 |
| 6 | 1 | 72.6 | 95.2 | 28 / 35 | 6738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 93% |
| mld.Infinity 2.2 | 37 | 95% |
| radnor.DoctorBob 1.42 | 37 | 76% |
| amz.NanoClone 1.41 | 5 | 60% |
| sample.Walls 1.0 | 4 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 36% | 58 |
| mz.AntiGrav 1.0 | 16 | 26% | 72 |
| mld.Infinity 2.2 | 8 | 13% | 47 |
| amz.NanoClone 1.41 | 6 | 10% | 9 |
| sample.Walls 1.0 | 3 | 5% | 12 |
| jangs.ns51 1.0 | 3 | 5% | 5 |
| arthord.MannyPacquiao Beta | 2 | 3% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.4 | 132 / 210 | 1.87 | 19.3% | 32017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.3% | 132 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 43 |
| mld.DustBunny 3.8 | 4.0 | 11.7% | 11 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 5 |
| zyx.nano.Ant 1.1 | 5.5 | 8.9% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.8% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.3% | 9 |
| bzdp.BoxCar 2.0 | 7.5 | 7.5% | 0 |
| fullsail.SweetTea 1.1 | 7.8 | 7.3% | 6 |
| cs.Grudge 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 21 / 35 | 5531 |
| 2 | 1 | 70.3 | 93.7 | 27 / 35 | 5743 |
| 3 | 1 | 69.0 | 90.8 | 23 / 35 | 5397 |
| 4 | 1 | 68.5 | 87.3 | 19 / 35 | 5103 |
| 5 | 1 | 70.2 | 95.2 | 26 / 35 | 5182 |
| 6 | 1 | 67.3 | 86.0 | 16 / 35 | 5061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 73 | 75% |
| mld.DustBunny 3.8 | 38 | 87% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 64% |
| maribo.melee.BMV 0.1 | 11 | 64% |
| fullsail.SweetTea 1.1 | 8 | 63% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 35% | 85 |
| mld.DustBunny 3.8 | 20 | 25% | 53 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 20 |
| maribo.melee.BMV 0.1 | 8 | 10% | 12 |
| fullsail.SweetTea 1.1 | 6 | 8% | 15 |
| zyx.nano.Ant 1.1 | 6 | 8% | 8 |
| bzdp.BoxCar 2.0 | 2 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 11 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.1 | 112 / 210 | 2.70 | 18.8% | 35727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 18.8% | 112 |
| myl.micro.Troodon 1.10 | 2.2 | 13.8% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.4% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.9% | 15 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.1% | 8 |
| fm.mammillarias 1.3 | 5.5 | 9.3% | 3 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 8 |
| sample.Fire 1.0 | 9.2 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 78.4 | 17 / 35 | 5834 |
| 2 | 1 | 67.8 | 80.0 | 19 / 35 | 5611 |
| 3 | 1 | 68.2 | 80.3 | 17 / 35 | 6063 |
| 4 | 1 | 71.0 | 90.2 | 23 / 35 | 6357 |
| 5 | 1 | 66.1 | 74.9 | 14 / 35 | 5617 |
| 6 | 1 | 69.4 | 82.5 | 22 / 35 | 6245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 82% |
| myl.micro.Troodon 1.10 | 32 | 81% |
| cb.nano.Insomnia 1.0 | 18 | 83% |
| myl.nano.KomoriNinja 1.1 | 14 | 93% |
| sp.Nanos.Ember 1.1 | 12 | 92% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 26% | 54 |
| stelo.SoRobotNanoMelee 1.2 | 24 | 24% | 49 |
| cb.nano.Insomnia 1.0 | 17 | 17% | 19 |
| fm.mammillarias 1.3 | 14 | 14% | 19 |
| myl.nano.KomoriNinja 1.1 | 8 | 8% | 31 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 22 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 8 |
| sample.Fire 1.0 | 2 | 2% | 7 |

## Melee bench: F04

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.7 | 151 / 210 | 2.11 | 20.6% | 39552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 20.6% | 151 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.9% | 15 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.4% | 1 |
| tj.zombie1n 1.0.1 | 5.7 | 8.8% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 5.7 | 8.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.6% | 14 |
| yk.JahMicro 1.0 | 7.0 | 8.0% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 82.5 | 21 / 35 | 6318 |
| 2 | 1 | 71.9 | 91.4 | 27 / 35 | 6872 |
| 3 | 1 | 70.2 | 87.3 | 24 / 35 | 6468 |
| 4 | 1 | 68.2 | 80.3 | 24 / 35 | 6142 |
| 5 | 1 | 71.8 | 93.7 | 28 / 35 | 6733 |
| 6 | 1 | 71.6 | 90.8 | 27 / 35 | 7019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 96% |
| stelo.SoJNanoMelee 1.1 | 35 | 89% |
| tvv.micro.Antares 1.1.1 | 22 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| yk.JahMicro 1.0 | 10 | 90% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 44% | 86 |
| stelo.SoJNanoMelee 1.1 | 12 | 20% | 30 |
| tj.zombie1n 1.0.1 | 7 | 12% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 24 |
| yk.JahMicro 1.0 | 3 | 5% | 17 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 77.4 | 96 / 210 | 3.04 | 17.0% | 30393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.0% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.8% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 21 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.0% | 22 |
| sam.Samspin 1.0 | 4.8 | 10.7% | 15 |
| EBBU.Sim2 1.02 | 5.5 | 9.6% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.0% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 71.1 | 16 / 35 | 4746 |
| 2 | 1 | 63.9 | 74.3 | 14 / 35 | 4795 |
| 3 | 1 | 66.1 | 81.6 | 16 / 35 | 5153 |
| 4 | 1 | 66.2 | 78.1 | 15 / 35 | 5184 |
| 5 | 1 | 66.1 | 80.6 | 17 / 35 | 5106 |
| 6 | 1 | 66.8 | 78.4 | 18 / 35 | 5409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 40 | 90% |
| oog.melee.Corsair 1.0 | 30 | 47% |
| ahf.NanoAndrew .4 | 24 | 71% |
| sam.Samspin 1.0 | 14 | 79% |
| zyx.nano.BacillusComma 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 3 | 33% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 24 | 21% | 44 |
| ahf.NanoAndrew .4 | 19 | 17% | 38 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 18 |
| EBBU.Sim2 1.02 | 14 | 12% | 24 |
| sam.Samspin 1.0 | 13 | 11% | 22 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 5% | 6 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.4 | 131 / 210 | 2.13 | 19.5% | 33931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.5% | 131 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 32 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 15 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.8% | 5 |
| fm.claire 1.7 | 6.2 | 8.5% | 3 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.3% | 4 |
| sample.SpinBot 1.0 | 8.5 | 6.4% | 5 |
| pa.Improved 1.0 | 9.0 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.5 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.6 | 22 / 35 | 5885 |
| 2 | 1 | 68.1 | 87.3 | 21 / 35 | 4999 |
| 3 | 1 | 68.0 | 80.6 | 21 / 35 | 5736 |
| 4 | 1 | 69.9 | 90.5 | 23 / 35 | 5729 |
| 5 | 1 | 68.5 | 85.4 | 20 / 35 | 5705 |
| 6 | 1 | 70.6 | 92.1 | 24 / 35 | 5877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 80% |
| oog.melee.CapuletDroid 1.1 | 40 | 95% |
| gh.nano.Grofvuil 0.2 | 16 | 88% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| sample.SpinBot 1.0 | 7 | 86% |
| fm.claire 1.7 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 75% |

Hadur died in 79 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 39% | 74 |
| sample.SpinBot 1.0 | 14 | 18% | 16 |
| gh.nano.Grofvuil 0.2 | 13 | 16% | 31 |
| arthord.NanoSatanMelee Beta | 7 | 9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4 | 5% | 40 |
| fm.claire 1.7 | 4 | 5% | 8 |
| kurios.DOSexe .9b | 3 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 9 |
| pa.Improved 1.0 | 1 | 1% | 7 |

## Melee bench: F07

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 96 / 210 | 2.69 | 17.9% | 34263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.9% | 96 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.4% | 40 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.6% | 26 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 35 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.6% | 2 |
| acogdev.alpha 0.2 | 7.3 | 6.3% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.2 | 15 / 35 | 6188 |
| 2 | 1 | 67.6 | 84.4 | 15 / 35 | 5442 |
| 3 | 1 | 67.4 | 81.6 | 18 / 35 | 5695 |
| 4 | 1 | 68.5 | 83.5 | 17 / 35 | 6097 |
| 5 | 1 | 67.1 | 79.7 | 17 / 35 | 5405 |
| 6 | 1 | 65.2 | 75.2 | 14 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 84% |
| mz.MicroGodMelee 1 | 34 | 62% |
| gh.micro.Gruweltje 0.7 | 22 | 64% |
| DBall.Anarchy 0.1 | 13 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 32 | 28% | 53 |
| spinnercat.micro.Tyger 0.1 | 29 | 25% | 59 |
| gh.micro.Gruweltje 0.7 | 25 | 22% | 52 |
| caimano.Furia_Ceca 0.22 | 9 | 8% | 10 |
| acogdev.alpha 0.2 | 6 | 5% | 8 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 7 |
| el.JumpShoot 0.2 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 12 |

## Melee bench: F08

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.5 | 101 / 210 | 3.56 | 16.4% | 32097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 16.4% | 101 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.7% | 7 |
| germ.TheMind .2 | 5.5 | 9.2% | 4 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 5 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.1% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.2% | 5 |
| sample.Crazy 1.0 | 8.3 | 7.3% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 66.3 | 16 / 35 | 4971 |
| 2 | 1 | 63.9 | 69.2 | 16 / 35 | 5261 |
| 3 | 1 | 66.2 | 77.1 | 17 / 35 | 5627 |
| 4 | 1 | 64.4 | 69.5 | 16 / 35 | 5419 |
| 5 | 1 | 65.7 | 73.0 | 18 / 35 | 5661 |
| 6 | 1 | 65.3 | 74.0 | 18 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 90% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 9 | 56% |
| awesomeness.Elite 1.0 | 8 | 100% |
| germ.TheMind .2 | 7 | 86% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 38% | 84 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 16% | 39 |
| stelo.UntouchableNano 1.3 | 17 | 16% | 23 |
| germ.TheMind .2 | 12 | 11% | 20 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 11 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 8 |
| awesomeness.Elite 1.0 | 4 | 4% | 14 |
| mym.EdgeStalker 1.0 | 4 | 4% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.5 | 140 / 210 | 2.30 | 19.0% | 28710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.0% | 140 |
| rz.HawkOnFire 0.1 | 2.0 | 14.2% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 10 |
| maribo.IotaCT 1.1 | 4.8 | 10.2% | 9 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.2% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.2% | 3 |
| ratosh.Wesco 1.4 | 7.2 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 24 / 35 | 4354 |
| 2 | 1 | 71.3 | 94.6 | 26 / 35 | 5115 |
| 3 | 1 | 68.5 | 83.8 | 20 / 35 | 4897 |
| 4 | 1 | 66.8 | 76.8 | 22 / 35 | 4667 |
| 5 | 1 | 69.6 | 87.0 | 25 / 35 | 4953 |
| 6 | 1 | 68.6 | 83.5 | 23 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 91% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| stelo.PatternRobot 1.0 | 14 | 100% |
| timmit.nano.TimDog 0.33 | 13 | 69% |
| ratosh.Wesco 1.4 | 9 | 100% |
| maribo.IotaCT 1.1 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 23% | 59 |
| timmit.nano.TimDog 0.33 | 14 | 20% | 23 |
| ratosh.Wesco 1.4 | 10 | 14% | 24 |
| stelo.PatternRobot 1.0 | 9 | 13% | 17 |
| maribo.IotaCT 1.1 | 7 | 10% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 10% | 11 |
| nz.jdc.nano.GridFu 1.0 | 6 | 9% | 47 |
| spinnercat.Omen 1.0 | 1 | 1% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.4 | 147 / 210 | 2.05 | 20.3% | 38148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 20.3% | 147 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.1% | 21 |
| baal.nano.N 1.42 | 2.7 | 11.7% | 11 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 13 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 3 |
| sanja.First 0.1 | 6.5 | 8.5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.6% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.3 | 6.8% | 9 |
| sample.RamFire 1.0 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.4 | 25 / 35 | 6659 |
| 2 | 1 | 71.2 | 94.3 | 24 / 35 | 6594 |
| 3 | 1 | 70.7 | 90.2 | 27 / 35 | 6351 |
| 4 | 1 | 69.1 | 85.7 | 23 / 35 | 6133 |
| 5 | 1 | 70.2 | 89.2 | 25 / 35 | 6324 |
| 6 | 1 | 69.0 | 85.4 | 23 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 92% |
| baal.nano.N 1.42 | 38 | 92% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| cvt.Firsty 1.0 | 17 | 71% |
| zyx.micro.Ant 1.1 | 16 | 81% |
| Grystrion.TrackerWO 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 23 | 37% | 45 |
| cvt.Firsty 1.0 | 9 | 14% | 25 |
| baal.nano.N 1.42 | 8 | 13% | 32 |
| tvv.nano.Polaris 1.2 | 7 | 11% | 51 |
| Grystrion.TrackerWO 1.0 | 6 | 10% | 14 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 10 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 7 |
| sanja.First 0.1 | 2 | 3% | 21 |
| sample.RamFire 1.0 | 2 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.7 | 79 / 210 | 3.90 | 15.1% | 30090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.7 | 15.1% | 79 |
| kc.micro.Figment 1.0 | 1.8 | 15.1% | 67 |
| cs.Wren 1.0 | 2.8 | 12.9% | 24 |
| js.PinBall 1.6 | 4.5 | 10.7% | 13 |
| mz.Cork 0.1 | 4.7 | 11.2% | 15 |
| joe.ADinosaur 1.0 | 5.7 | 9.4% | 4 |
| evd.X1 0.01 | 6.8 | 8.4% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 2 |
| donjezza.Jezza 1.0 | 9.3 | 5.5% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.5 | 13 / 35 | 5182 |
| 2 | 1 | 63.4 | 71.1 | 16 / 35 | 4902 |
| 3 | 2 | 59.7 | 57.8 | 10 / 35 | 5217 |
| 4 | 2 | 64.9 | 77.1 | 17 / 35 | 4616 |
| 5 | 2 | 62.3 | 66.7 | 12 / 35 | 5006 |
| 6 | 2 | 61.7 | 63.2 | 11 / 35 | 5167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 47 | 68% |
| cs.Wren 1.0 | 29 | 76% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 7 | 100% |
| joe.ADinosaur 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 53 | 40% | 90 |
| cs.Wren 1.0 | 21 | 16% | 40 |
| evd.X1 0.01 | 18 | 14% | 19 |
| joe.ADinosaur 1.0 | 13 | 10% | 14 |
| mz.Cork 0.1 | 12 | 9% | 19 |
| js.PinBall 1.6 | 10 | 8% | 17 |
| PSW.Relentless 0.1 | 3 | 2% | 2 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.6 | 135 / 210 | 2.30 | 19.3% | 31390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 19.3% | 135 |
| myl.nano.Graviton 1.10 | 2.7 | 12.2% | 24 |
| ntc.Opposite 1.5 | 3.5 | 10.9% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 9.5% | 5 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 7 |
| DBall.NUKE 0.1 | 7.8 | 7.9% | 4 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.4 | 21 / 35 | 5284 |
| 2 | 1 | 69.6 | 88.3 | 25 / 35 | 5033 |
| 3 | 1 | 65.8 | 75.6 | 17 / 35 | 4827 |
| 4 | 1 | 70.6 | 91.4 | 28 / 35 | 5393 |
| 5 | 1 | 71.0 | 91.1 | 25 / 35 | 6087 |
| 6 | 1 | 66.9 | 81.6 | 19 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 46 | 96% |
| stelo.AreaTargetingBot 1.1 | 39 | 87% |
| ntc.Opposite 1.5 | 14 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| disan.Chair 2.2.0 | 11 | 91% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| DBall.NUKE 0.1 | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 26% | 27 |
| myl.nano.Graviton 1.10 | 13 | 17% | 59 |
| stelo.AreaTargetingBot 1.1 | 12 | 16% | 42 |
| ntc.Opposite 1.5 | 11 | 14% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 19 |
| disan.Chair 2.2.0 | 8 | 11% | 16 |
| pbg.R2D2 1.0 | 3 | 4% | 7 |
| DBall.NUKE 0.1 | 0 | 0% | 12 |
| donjezza.Muncho 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 68.3 | 81 / 210 | 3.85 | 14.8% | 25844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.8 | 14.8% | 81 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.5% | 47 |
| oog.melee.Capulet 1.2 | 2.3 | 14.1% | 49 |
| yagami.Tidus 0.11 | 4.3 | 12.5% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.3% | 19 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 71.1 | 18 / 35 | 4197 |
| 2 | 3 | 60.8 | 64.1 | 12 / 35 | 3970 |
| 3 | 1 | 64.1 | 72.4 | 16 / 35 | 4361 |
| 4 | 1 | 64.5 | 70.8 | 12 / 35 | 4614 |
| 5 | 2 | 62.5 | 67.0 | 12 / 35 | 4480 |
| 6 | 3 | 61.3 | 64.4 | 11 / 35 | 4222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 97% |
| oog.melee.Capulet 1.2 | 26 | 42% |
| yagami.Tidus 0.11 | 19 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 94% |
| ejb.Polaris 1.0.1 | 3 | 33% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 66 | 51% | 73 |
| yagami.Tidus 0.11 | 16 | 12% | 35 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 8% | 35 |
| ejb.Polaris 1.0.1 | 11 | 8% | 16 |
| kurios.DOSexe .9a | 5 | 4% | 4 |
| stelo.MirrorNano 1.3 | 4 | 3% | 6 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.2 | 132 / 210 | 2.60 | 17.9% | 28307 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.9% | 132 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 18 |
| wee.Gem 1.8.4 | 3.2 | 11.7% | 21 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 14 |
| ratosh.Nobo 0.21 | 4.3 | 10.9% | 12 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 2 |
| maribo.FollowFire 1 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.6 | 26 / 35 | 4881 |
| 2 | 1 | 67.2 | 81.9 | 21 / 35 | 5013 |
| 3 | 1 | 67.8 | 86.3 | 22 / 35 | 4753 |
| 4 | 1 | 66.0 | 79.4 | 20 / 35 | 4792 |
| 5 | 1 | 63.7 | 73.0 | 19 / 35 | 4198 |
| 6 | 1 | 67.5 | 84.8 | 24 / 35 | 4670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 92% |
| wee.Gem 1.8.4 | 36 | 100% |
| wompi.Quokka 1.6 | 18 | 72% |
| ratosh.Nobo 0.21 | 16 | 81% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| m3thos.Eva00 1.1 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |

Hadur died in 78 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bayen.UbaMicro 1.4 | 16 | 21% | 20 |
| wee.Gem 1.8.4 | 12 | 15% | 54 |
| bzdp.Pansy 2.1 | 12 | 15% | 51 |
| wompi.Quokka 1.6 | 9 | 12% | 25 |
| ratosh.Nobo 0.21 | 7 | 9% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 13 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 11 |
| maribo.FollowFire 1 | 5 | 6% | 6 |
| m3thos.Eva00 1.1 | 4 | 5% | 10 |

## Melee bench: F15

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 83.7 | 120 / 210 | 2.47 | 20.0% | 44362 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.2 | 20.0% | 120 |
| wompi.Wallaby 5.1 | 1.8 | 18.1% | 65 |
| mz.NanoGod 2.02 | 3.0 | 14.8% | 21 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.9% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 83.2 | 18 / 35 | 7250 |
| 2 | 1 | 72.6 | 89.5 | 26 / 35 | 7525 |
| 3 | 1 | 72.3 | 87.9 | 21 / 35 | 7817 |
| 4 | 1 | 72.0 | 85.7 | 23 / 35 | 7727 |
| 5 | 1 | 70.5 | 83.5 | 16 / 35 | 7276 |
| 6 | 2 | 68.0 | 72.4 | 16 / 35 | 6767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 107 | 85% |
| mz.NanoGod 2.02 | 12 | 50% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| drd.Dreadknoght 0.9 | 6 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 90 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 42% | 141 |
| mz.NanoGod 2.02 | 30 | 33% | 38 |
| exauge.GateKeeper 1.1.121g | 10 | 11% | 14 |
| ayk.WallHugger 1.0 | 7 | 8% | 9 |
| stuff.Vlad 0.1 | 3 | 3% | 3 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.9 | 113 / 210 | 3.35 | 16.6% | 28926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.2 | 16.6% | 113 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 23 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.6% | 23 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.0% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.9% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.3% | 6 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 5 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 61.0 | 15 / 35 | 3952 |
| 2 | 1 | 66.2 | 78.1 | 20 / 35 | 5084 |
| 3 | 1 | 68.1 | 83.5 | 24 / 35 | 5208 |
| 4 | 1 | 63.3 | 71.4 | 16 / 35 | 4626 |
| 5 | 1 | 65.2 | 75.6 | 19 / 35 | 4880 |
| 6 | 1 | 65.5 | 74.0 | 19 / 35 | 5176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 86% |
| bvh.micro.Freya 0.3 | 25 | 100% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| ap.Frederick 1.1 | 6 | 100% |
| stelo.MirrorMicro 1.0 | 4 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 17 | 17% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 17% | 16 |
| dummy.micro.Sparrow 2.5 | 15 | 15% | 42 |
| dl.BetterWalls 1.0 | 13 | 13% | 16 |
| voidious.micro.BlitzBat 1.05 | 11 | 11% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 11 | 11% | 39 |
| bvh.micro.Freya 0.3 | 10 | 10% | 26 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 7 |

## Melee bench: F17

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 88.5 | 143 / 210 | 2.04 | 21.2% | 42552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 21.2% | 143 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 20 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 6 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.1% | 24 |
| mme.NikeEnhanced 2.0 | 5.0 | 8.9% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 6.1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.Corners 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.8 | 25 / 35 | 7361 |
| 2 | 1 | 69.4 | 80.6 | 21 / 35 | 6195 |
| 3 | 1 | 71.0 | 86.3 | 21 / 35 | 7211 |
| 4 | 1 | 71.4 | 90.5 | 26 / 35 | 6705 |
| 5 | 1 | 73.3 | 92.4 | 25 / 35 | 8027 |
| 6 | 1 | 71.6 | 90.2 | 25 / 35 | 7053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 41 | 88% |
| supersample.SuperBoxBot 1.0 | 28 | 86% |
| dsw.StaticD 1.0 | 14 | 64% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| mme.NikeEnhanced 2.0 | 9 | 78% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 37% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 28% | 56 |
| dsw.StaticD 1.0 | 10 | 15% | 25 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 10 |
| sul.Lunar 1.1 | 2 | 3% | 50 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 10 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 3 |
| sample.Corners 1.0 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.micro.SaorWGV 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 77.8 | 109 / 210 | 3.00 | 17.8% | 37025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWGV 0.1 | 1.0 | 17.8% | 109 |
| radnor.DoctorBob 1.42 | 2.8 | 12.4% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.0% | 31 |
| mld.Wisdom 1.0 | 3.8 | 11.5% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 13 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.7% | 8 |
| sample.Walls 1.0 | 7.7 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.7% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.7% | 7 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.7 | 16 / 35 | 5692 |
| 2 | 1 | 66.3 | 77.1 | 16 / 35 | 5995 |
| 3 | 1 | 70.5 | 88.6 | 20 / 35 | 7022 |
| 4 | 1 | 68.2 | 81.0 | 21 / 35 | 6644 |
| 5 | 1 | 66.7 | 78.7 | 22 / 35 | 5631 |
| 6 | 1 | 64.3 | 68.9 | 14 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 85% |
| radnor.DoctorBob 1.42 | 22 | 86% |
| mld.Wisdom 1.0 | 13 | 69% |
| sample.Walls 1.0 | 12 | 100% |
| amz.NanoClone 1.41 | 11 | 64% |
| jangs.ns51 1.0 | 10 | 90% |
| KiraNL.Chupacabra 0.4 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 29% | 39 |
| radnor.DoctorBob 1.42 | 22 | 22% | 48 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 54 |
| amz.NanoClone 1.41 | 12 | 12% | 17 |
| KiraNL.Chupacabra 0.4 | 10 | 10% | 19 |
| GarmBox.Oranges 1.0 | 6 | 6% | 8 |
| jangs.ns51 1.0 | 5 | 5% | 12 |
| sample.Walls 1.0 | 1 | 1% | 10 |

