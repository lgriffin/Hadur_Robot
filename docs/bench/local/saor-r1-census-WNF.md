# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.1 | 146 / 210 | 2.07 | 21.0% | 42322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.0% | 146 |
| mz.AntiGrav 1.0 | 2.2 | 14.3% | 22 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 19 |
| mld.Infinity 2.2 | 4.2 | 12.5% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 3 |
| sample.Walls 1.0 | 6.2 | 7.5% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 82.9 | 23 / 35 | 6579 |
| 2 | 1 | 71.9 | 90.5 | 24 / 35 | 6797 |
| 3 | 1 | 72.5 | 89.2 | 28 / 35 | 7108 |
| 4 | 1 | 73.0 | 91.7 | 26 / 35 | 7954 |
| 5 | 1 | 70.1 | 84.4 | 21 / 35 | 6737 |
| 6 | 1 | 72.4 | 89.8 | 24 / 35 | 7147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 83 | 92% |
| mld.Infinity 2.2 | 34 | 97% |
| radnor.DoctorBob 1.42 | 28 | 75% |
| jangs.ns51 1.0 | 6 | 100% |
| amz.NanoClone 1.41 | 6 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 42% | 57 |
| mz.AntiGrav 1.0 | 20 | 31% | 86 |
| amz.NanoClone 1.41 | 6 | 9% | 13 |
| mld.Infinity 2.2 | 3 | 5% | 35 |
| GarmBox.Oranges 1.0 | 3 | 5% | 6 |
| sample.Walls 1.0 | 2 | 3% | 8 |
| jangs.ns51 1.0 | 2 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.9 | 123 / 210 | 2.54 | 18.1% | 30579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 18.1% | 123 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.3% | 45 |
| mld.DustBunny 3.8 | 2.8 | 13.5% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.8% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 9.1% | 8 |
| zyx.nano.Ant 1.1 | 6.2 | 8.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 7 |
| fullsail.SweetTea 1.1 | 8.2 | 6.5% | 1 |
| bzdp.BoxCar 2.0 | 8.7 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 22 / 35 | 4904 |
| 2 | 1 | 70.4 | 93.7 | 28 / 35 | 5433 |
| 3 | 1 | 67.3 | 86.0 | 20 / 35 | 4784 |
| 4 | 2 | 62.2 | 59.7 | 13 / 35 | 5100 |
| 5 | 1 | 69.7 | 92.1 | 23 / 35 | 5595 |
| 6 | 1 | 66.3 | 81.3 | 17 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 82% |
| mld.DustBunny 3.8 | 43 | 79% |
| djdjdj.NanoSkunk10 1.0 | 14 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 91% |
| maribo.melee.BMV 0.1 | 11 | 82% |
| fullsail.SweetTea 1.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 28 | 32% | 58 |
| oog.melee.Mercutio 1.0 | 23 | 26% | 75 |
| zyx.nano.Ant 1.1 | 8 | 9% | 12 |
| cs.Grudge 1.0 | 8 | 9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 14 |
| maribo.melee.BMV 0.1 | 5 | 6% | 12 |
| bzdp.BoxCar 2.0 | 3 | 3% | 4 |
| fullsail.SweetTea 1.1 | 2 | 2% | 10 |

## Melee bench: F03

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.4 | 128 / 210 | 2.31 | 19.9% | 37856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.9% | 128 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.4% | 6 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.5% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.0% | 3 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.8% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.1% | 6 |
| sample.Fire 1.0 | 9.2 | 5.2% | 3 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 84.4 | 23 / 35 | 6258 |
| 2 | 1 | 70.4 | 87.3 | 21 / 35 | 6446 |
| 3 | 1 | 69.7 | 85.7 | 20 / 35 | 6119 |
| 4 | 1 | 69.7 | 84.8 | 21 / 35 | 6453 |
| 5 | 1 | 69.1 | 81.6 | 19 / 35 | 5841 |
| 6 | 1 | 71.2 | 88.6 | 24 / 35 | 6739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 51 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 86% |
| cb.nano.Insomnia 1.0 | 18 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 7 | 86% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 29% | 68 |
| cb.nano.Insomnia 1.0 | 21 | 26% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 18% | 40 |
| fm.mammillarias 1.3 | 9 | 11% | 14 |
| myl.nano.KomoriNinja 1.1 | 5 | 6% | 29 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 20 |
| sample.Fire 1.0 | 2 | 2% | 6 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.8 | 149 / 210 | 1.91 | 20.8% | 39003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.8% | 149 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.7% | 15 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.5% | 10 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.6% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 9.4% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 8.5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.9% | 6 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 6.5% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.4 | 26 / 35 | 6901 |
| 2 | 1 | 67.8 | 82.5 | 19 / 35 | 5882 |
| 3 | 1 | 71.5 | 93.3 | 26 / 35 | 6551 |
| 4 | 1 | 71.4 | 92.1 | 27 / 35 | 6785 |
| 5 | 1 | 72.0 | 93.0 | 28 / 35 | 6946 |
| 6 | 1 | 69.2 | 86.7 | 23 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 87% |
| stelo.SoJNanoMelee 1.1 | 45 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 76% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| yk.JahMicro 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 36% | 88 |
| stelo.SoJNanoMelee 1.1 | 18 | 30% | 36 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 24 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 10% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 20 |
| tj.zombie1n 1.0.1 | 4 | 7% | 8 |
| repositorio.NanoStep 1.0 | 1 | 2% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 9 |
| yk.JahMicro 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.6 | 84 / 210 | 3.46 | 16.3% | 31059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 16.3% | 84 |
| ahf.NanoAndrew .4 | 2.8 | 11.5% | 33 |
| oog.melee.Corsair 1.0 | 3.0 | 12.5% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.4% | 28 |
| sam.Samspin 1.0 | 5.3 | 10.0% | 11 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.4% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.6 | 61.6 | 8 / 35 | 4652 |
| 2 | 1 | 64.9 | 75.2 | 17 / 35 | 5121 |
| 3 | 1 | 64.3 | 72.4 | 12 / 35 | 5324 |
| 4 | 1 | 67.6 | 81.9 | 19 / 35 | 5742 |
| 5 | 1 | 61.1 | 66.0 | 10 / 35 | 4537 |
| 6 | 1 | 67.0 | 78.7 | 18 / 35 | 5683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 71% |
| ahf.NanoAndrew .4 | 22 | 59% |
| simonton.nano.MeleeSeed 1.8 | 20 | 85% |
| sam.Samspin 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 7 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 127 of 210 rounds, at a mean tick of 458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 29 | 23% | 44 |
| oog.melee.Corsair 1.0 | 23 | 18% | 52 |
| robar.nano.Assertive_Melee 0.2 | 22 | 17% | 27 |
| zyx.nano.BacillusComma 1.0 | 15 | 12% | 17 |
| simonton.nano.MeleeSeed 1.8 | 13 | 10% | 28 |
| EBBU.Sim2 1.02 | 11 | 9% | 17 |
| sam.Samspin 1.0 | 7 | 6% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 3% | 4 |
| sample.TrackFire 1.0 | 3 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.8 | 140 / 210 | 1.91 | 19.9% | 33389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.9% | 140 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.3% | 11 |
| fm.claire 1.7 | 5.5 | 8.8% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.5% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.1% | 2 |
| sample.SpinBot 1.0 | 8.0 | 6.9% | 3 |
| pa.Improved 1.0 | 9.2 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 22 / 35 | 5193 |
| 2 | 1 | 69.8 | 90.5 | 23 / 35 | 5678 |
| 3 | 1 | 70.0 | 90.8 | 23 / 35 | 5815 |
| 4 | 1 | 70.0 | 89.8 | 26 / 35 | 5550 |
| 5 | 1 | 69.7 | 88.3 | 24 / 35 | 5800 |
| 6 | 1 | 69.5 | 89.5 | 22 / 35 | 5353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 81% |
| oog.melee.CapuletDroid 1.1 | 34 | 97% |
| gh.nano.Grofvuil 0.2 | 22 | 77% |
| arthord.NanoSatanMelee Beta | 18 | 94% |
| fm.claire 1.7 | 7 | 71% |
| sample.SpinBot 1.0 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 2 | 50% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 39% | 72 |
| gh.nano.Grofvuil 0.2 | 16 | 23% | 40 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 47 |
| arthord.NanoSatanMelee Beta | 5 | 7% | 13 |
| sample.SpinBot 1.0 | 5 | 7% | 10 |
| fm.claire 1.7 | 4 | 6% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 10 |
| kurios.DOSexe .9b | 2 | 3% | 5 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.3 | 109 / 210 | 2.41 | 18.6% | 35014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.6% | 109 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.8% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.7% | 35 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 26 |
| DBall.Anarchy 0.1 | 5.0 | 8.7% | 2 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.3% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.7 | 5.9% | 1 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 21 / 35 | 5840 |
| 2 | 1 | 66.7 | 78.1 | 16 / 35 | 5888 |
| 3 | 1 | 67.8 | 83.2 | 19 / 35 | 5571 |
| 4 | 1 | 67.2 | 81.3 | 16 / 35 | 5677 |
| 5 | 1 | 70.0 | 90.2 | 22 / 35 | 6099 |
| 6 | 1 | 68.4 | 84.1 | 15 / 35 | 5939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 78% |
| mz.MicroGodMelee 1 | 43 | 72% |
| gh.micro.Gruweltje 0.7 | 25 | 68% |
| DBall.Anarchy 0.1 | 17 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 30 | 30% | 60 |
| gh.micro.Gruweltje 0.7 | 28 | 28% | 53 |
| mz.MicroGodMelee 1 | 26 | 26% | 60 |
| DBall.Anarchy 0.1 | 3 | 3% | 16 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |
| el.JumpShoot 0.2 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.2 | 104 / 210 | 3.41 | 16.5% | 31387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.3 | 16.5% | 104 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.6% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.3% | 20 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.6% | 7 |
| germ.TheMind .2 | 5.2 | 9.8% | 11 |
| awesomeness.Elite 1.0 | 6.5 | 8.2% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.5% | 9 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.4 | 15 / 35 | 5296 |
| 2 | 2 | 61.9 | 66.0 | 14 / 35 | 4746 |
| 3 | 1 | 66.3 | 75.2 | 21 / 35 | 5280 |
| 4 | 2 | 64.9 | 72.4 | 18 / 35 | 5317 |
| 5 | 1 | 66.5 | 78.4 | 20 / 35 | 5458 |
| 6 | 1 | 65.7 | 74.6 | 16 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 88% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| germ.TheMind .2 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 49% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 19% | 40 |
| germ.TheMind .2 | 14 | 13% | 18 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 14 |
| awesomeness.Elite 1.0 | 5 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 7 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.8 | 137 / 210 | 2.28 | 19.2% | 30462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.2% | 137 |
| rz.HawkOnFire 0.1 | 2.0 | 13.5% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.9% | 10 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 10 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.3 | 9.3% | 6 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 7 |
| stelo.PatternRobot 1.0 | 7.0 | 8.9% | 8 |
| spinnercat.Omen 1.0 | 8.7 | 7.4% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.7 | 21 / 35 | 4967 |
| 2 | 1 | 69.2 | 84.8 | 24 / 35 | 5081 |
| 3 | 1 | 68.6 | 84.1 | 22 / 35 | 4854 |
| 4 | 1 | 71.2 | 90.8 | 27 / 35 | 4931 |
| 5 | 1 | 68.6 | 81.6 | 23 / 35 | 5245 |
| 6 | 1 | 69.2 | 86.7 | 20 / 35 | 5384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 92% |
| nz.jdc.nano.GridFu 1.0 | 37 | 97% |
| stelo.PatternRobot 1.0 | 17 | 82% |
| ratosh.Wesco 1.4 | 11 | 73% |
| maribo.IotaCT 1.1 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 16 | 22% | 23 |
| rz.HawkOnFire 0.1 | 15 | 21% | 55 |
| timmit.nano.TimDog 0.33 | 13 | 18% | 22 |
| ratosh.Wesco 1.4 | 11 | 15% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 11% | 10 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 52 |
| maribo.IotaCT 1.1 | 2 | 3% | 15 |
| spinnercat.Omen 1.0 | 2 | 3% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.5 | 147 / 210 | 2.03 | 20.3% | 37874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 20.3% | 147 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 19 |
| baal.nano.N 1.42 | 3.2 | 11.3% | 8 |
| zyx.micro.Ant 1.1 | 3.7 | 10.8% | 24 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.8% | 2 |
| sanja.First 0.1 | 6.8 | 7.9% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.7% | 0 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.5% | 3 |
| cvt.Firsty 1.0 | 8.0 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 25 / 35 | 6341 |
| 2 | 1 | 71.6 | 93.3 | 28 / 35 | 6531 |
| 3 | 1 | 68.8 | 82.9 | 23 / 35 | 6183 |
| 4 | 1 | 67.7 | 83.5 | 20 / 35 | 5707 |
| 5 | 1 | 70.7 | 89.5 | 24 / 35 | 6595 |
| 6 | 1 | 70.7 | 89.2 | 27 / 35 | 6517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 86% |
| cvt.Firsty 1.0 | 25 | 96% |
| baal.nano.N 1.42 | 23 | 78% |
| zyx.micro.Ant 1.1 | 19 | 74% |
| sanja.First 0.1 | 18 | 100% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 25 | 40% | 45 |
| tvv.nano.Polaris 1.2 | 12 | 19% | 56 |
| Grystrion.TrackerWO 1.0 | 8 | 13% | 20 |
| baal.nano.N 1.42 | 6 | 10% | 34 |
| cvt.Firsty 1.0 | 5 | 8% | 22 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 6 |
| sample.RamFire 1.0 | 2 | 3% | 2 |
| sanja.First 0.1 | 1 | 2% | 16 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.2 | 77 / 210 | 3.86 | 15.3% | 31351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.3 | 15.3% | 77 |
| kc.micro.Figment 1.0 | 1.7 | 14.8% | 59 |
| cs.Wren 1.0 | 3.5 | 12.5% | 26 |
| mz.Cork 0.1 | 4.2 | 11.5% | 11 |
| js.PinBall 1.6 | 4.3 | 11.5% | 16 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 7 |
| evd.X1 0.01 | 6.7 | 8.5% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 8 |
| donjezza.Jezza 1.0 | 9.2 | 5.3% | 4 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 63.8 | 13 / 35 | 5013 |
| 2 | 1 | 64.6 | 73.0 | 13 / 35 | 5458 |
| 3 | 2 | 60.8 | 62.2 | 12 / 35 | 5059 |
| 4 | 1 | 65.6 | 74.9 | 13 / 35 | 5637 |
| 5 | 1 | 62.7 | 66.3 | 11 / 35 | 5370 |
| 6 | 1 | 63.3 | 68.9 | 15 / 35 | 4814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 65% |
| cs.Wren 1.0 | 24 | 63% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 10 | 90% |
| donjezza.Jezza 1.0 | 3 | 67% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 47% | 106 |
| cs.Wren 1.0 | 17 | 13% | 30 |
| mz.Cork 0.1 | 13 | 10% | 22 |
| evd.X1 0.01 | 13 | 10% | 15 |
| joe.ADinosaur 1.0 | 10 | 8% | 12 |
| js.PinBall 1.6 | 7 | 5% | 11 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.1 | 130 / 210 | 2.25 | 19.2% | 30135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 19.2% | 130 |
| myl.nano.Graviton 1.10 | 3.0 | 11.7% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.5% | 6 |
| ntc.Opposite 1.5 | 4.0 | 10.4% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 19 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.5 | 7.9% | 7 |
| DBall.NUKE 0.1 | 7.5 | 8.1% | 2 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 20 / 35 | 5008 |
| 2 | 1 | 70.0 | 90.2 | 25 / 35 | 5341 |
| 3 | 1 | 69.8 | 89.5 | 24 / 35 | 5350 |
| 4 | 1 | 67.5 | 82.2 | 23 / 35 | 4639 |
| 5 | 1 | 68.6 | 87.9 | 19 / 35 | 4845 |
| 6 | 1 | 66.8 | 79.4 | 19 / 35 | 4952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 83% |
| myl.nano.Graviton 1.10 | 37 | 76% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 89% |
| DBall.NUKE 0.1 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| ntc.Opposite 1.5 | 12 | 83% |
| disan.Chair 2.2.0 | 10 | 70% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 17 | 21% | 43 |
| myl.nano.Graviton 1.10 | 16 | 20% | 44 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 19 |
| ntc.Opposite 1.5 | 9 | 11% | 18 |
| disan.Chair 2.2.0 | 7 | 9% | 17 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |
| DBall.NUKE 0.1 | 2 | 3% | 22 |
| donjezza.Muncho 1.0 | 1 | 1% | 14 |

## Melee bench: F13

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.4 | 76 / 210 | 3.30 | 15.8% | 26430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.3 | 15.8% | 76 |
| oog.melee.Capulet 1.2 | 1.8 | 14.7% | 58 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.6% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 25 |
| yagami.Tidus 0.11 | 4.7 | 12.4% | 11 |
| ejb.Polaris 1.0.1 | 5.8 | 10.0% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 77.5 | 12 / 35 | 4421 |
| 2 | 2 | 63.0 | 67.3 | 13 / 35 | 4248 |
| 3 | 1 | 64.7 | 74.9 | 13 / 35 | 4254 |
| 4 | 2 | 63.8 | 73.7 | 11 / 35 | 4187 |
| 5 | 1 | 64.4 | 74.6 | 9 / 35 | 4404 |
| 6 | 1 | 66.9 | 78.4 | 18 / 35 | 4916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 48% |
| kawigi.micro.Shiz 1.1 | 26 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 80% |
| yagami.Tidus 0.11 | 19 | 84% |
| ejb.Polaris 1.0.1 | 5 | 20% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 55 | 41% | 72 |
| yagami.Tidus 0.11 | 26 | 19% | 39 |
| kawigi.micro.Shiz 1.1 | 18 | 13% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 10% | 35 |
| ejb.Polaris 1.0.1 | 10 | 7% | 15 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.5 | 141 / 210 | 2.57 | 18.4% | 29144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 18.4% | 141 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 19 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 22 |
| ratosh.Nobo 0.21 | 3.8 | 11.1% | 7 |
| wompi.Quokka 1.6 | 4.3 | 10.9% | 12 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 8.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 7.0% | 2 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.3% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.5 | 20 / 35 | 5111 |
| 2 | 1 | 69.3 | 89.2 | 26 / 35 | 5048 |
| 3 | 1 | 65.8 | 76.2 | 23 / 35 | 4559 |
| 4 | 1 | 69.6 | 87.9 | 26 / 35 | 5050 |
| 5 | 1 | 66.5 | 79.7 | 23 / 35 | 4439 |
| 6 | 1 | 68.0 | 85.7 | 23 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 64 | 91% |
| wee.Gem 1.8.4 | 39 | 97% |
| wompi.Quokka 1.6 | 18 | 83% |
| ratosh.Nobo 0.21 | 12 | 92% |
| m3thos.Eva00 1.1 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 20% | 59 |
| wompi.Quokka 1.6 | 10 | 14% | 27 |
| ratosh.Nobo 0.21 | 10 | 14% | 16 |
| maribo.FollowFire 1 | 8 | 12% | 8 |
| bayen.UbaMicro 1.4 | 7 | 10% | 16 |
| wee.Gem 1.8.4 | 6 | 9% | 47 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 9% | 11 |
| m3thos.Eva00 1.1 | 5 | 7% | 18 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.4 | 122 / 210 | 2.14 | 20.6% | 44139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.2 | 20.6% | 122 |
| wompi.Wallaby 5.1 | 1.8 | 17.8% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.7% | 26 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.3% | 4 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.7% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 89.5 | 23 / 35 | 7571 |
| 2 | 1 | 70.8 | 86.0 | 20 / 35 | 6999 |
| 3 | 1 | 74.1 | 94.9 | 26 / 35 | 8226 |
| 4 | 1 | 72.1 | 88.9 | 21 / 35 | 7511 |
| 5 | 2 | 67.6 | 77.5 | 13 / 35 | 6168 |
| 6 | 1 | 71.9 | 87.3 | 19 / 35 | 7664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 110 | 79% |
| mz.NanoGod 2.02 | 17 | 65% |
| ayk.WallHugger 1.0 | 9 | 100% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 48% | 135 |
| mz.NanoGod 2.02 | 27 | 31% | 39 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 13 |
| ayk.WallHugger 1.0 | 8 | 9% | 13 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.3 | 101 / 210 | 3.31 | 16.8% | 30172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 16.8% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 20 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 29 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 8 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 6.2% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 6.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 18 / 35 | 5414 |
| 2 | 1 | 60.0 | 61.3 | 13 / 35 | 4213 |
| 3 | 1 | 67.9 | 82.2 | 21 / 35 | 5412 |
| 4 | 1 | 63.6 | 69.5 | 14 / 35 | 4848 |
| 5 | 1 | 65.3 | 75.2 | 19 / 35 | 4953 |
| 6 | 1 | 65.4 | 74.0 | 16 / 35 | 5332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 37 | 81% |
| dummy.micro.Sparrow 2.5 | 31 | 81% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 73% |
| bvh.micro.Freya 0.3 | 15 | 93% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 22% | 41 |
| voidious.micro.BlitzBat 1.05 | 18 | 17% | 57 |
| dummy.micro.Sparrow 2.5 | 16 | 15% | 39 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| dl.BetterWalls 1.0 | 11 | 10% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 8 |
| bvh.micro.Freya 0.3 | 8 | 7% | 18 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 15 |

## Melee bench: F17

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 89.5 | 155 / 210 | 1.94 | 21.6% | 43321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 21.6% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 9 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.8% | 11 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.3% | 6 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.7% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.4% | 4 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 3 |
| sample.Corners 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 87.6 | 24 / 35 | 7085 |
| 2 | 1 | 72.2 | 90.5 | 26 / 35 | 7151 |
| 3 | 1 | 71.5 | 88.3 | 27 / 35 | 6850 |
| 4 | 1 | 71.3 | 87.6 | 24 / 35 | 6895 |
| 5 | 1 | 72.7 | 92.1 | 26 / 35 | 7953 |
| 6 | 1 | 72.5 | 91.1 | 28 / 35 | 7387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 88% |
| sul.Lunar 1.1 | 48 | 98% |
| supersample.SuperBoxBot 1.0 | 31 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| mme.NikeEnhanced 2.0 | 9 | 100% |
| dsw.StaticD 1.0 | 9 | 67% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 30% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 23% | 53 |
| sul.Lunar 1.1 | 9 | 16% | 56 |
| mme.NikeEnhanced 2.0 | 7 | 13% | 18 |
| dsw.StaticD 1.0 | 4 | 7% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 5% | 12 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 6 |
| sample.Corners 1.0 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F18

hadur117.micro.SaorWNF 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.0 | 95 / 210 | 3.16 | 17.3% | 36236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNF 0.1 | 1.0 | 17.3% | 95 |
| radnor.DoctorBob 1.42 | 2.8 | 12.7% | 24 |
| mld.Wisdom 1.0 | 2.8 | 12.8% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 23 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 17 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.3% | 10 |
| sample.Walls 1.0 | 6.7 | 8.4% | 7 |
| GarmBox.Oranges 1.0 | 8.3 | 7.0% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.2 | 16 / 35 | 6331 |
| 2 | 1 | 69.3 | 84.4 | 21 / 35 | 6827 |
| 3 | 1 | 64.8 | 75.2 | 10 / 35 | 5474 |
| 4 | 1 | 62.9 | 67.3 | 16 / 35 | 5217 |
| 5 | 1 | 67.3 | 77.5 | 17 / 35 | 6441 |
| 6 | 1 | 65.8 | 75.2 | 15 / 35 | 5946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 83% |
| mld.Wisdom 1.0 | 22 | 73% |
| radnor.DoctorBob 1.42 | 16 | 63% |
| amz.NanoClone 1.41 | 9 | 67% |
| jangs.ns51 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 75% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 37 | 32% | 53 |
| KiraNL.Chupacabra 0.4 | 20 | 17% | 31 |
| radnor.DoctorBob 1.42 | 18 | 16% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 14% | 51 |
| amz.NanoClone 1.41 | 14 | 12% | 20 |
| sample.Walls 1.0 | 5 | 4% | 9 |
| GarmBox.Oranges 1.0 | 4 | 3% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 9 |

