# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.5 | 149 / 210 | 2.12 | 21.1% | 42466 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.1% | 149 |
| radnor.DoctorBob 1.42 | 2.7 | 13.5% | 15 |
| mz.AntiGrav 1.0 | 2.8 | 13.9% | 20 |
| mld.Infinity 2.2 | 3.5 | 12.8% | 22 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 3 |
| sample.Walls 1.0 | 6.3 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.3 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 87.3 | 25 / 35 | 7191 |
| 2 | 1 | 72.2 | 88.3 | 24 / 35 | 7188 |
| 3 | 1 | 72.4 | 90.8 | 25 / 35 | 7261 |
| 4 | 1 | 71.2 | 84.8 | 24 / 35 | 6900 |
| 5 | 1 | 70.0 | 81.9 | 22 / 35 | 6575 |
| 6 | 1 | 72.8 | 92.1 | 29 / 35 | 7351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 90% |
| mld.Infinity 2.2 | 41 | 100% |
| radnor.DoctorBob 1.42 | 26 | 96% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 50% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 21 | 34% | 73 |
| radnor.DoctorBob 1.42 | 18 | 30% | 55 |
| amz.NanoClone 1.41 | 8 | 13% | 12 |
| mld.Infinity 2.2 | 6 | 10% | 41 |
| arthord.MannyPacquiao Beta | 4 | 7% | 7 |
| sample.Walls 1.0 | 2 | 3% | 9 |
| jangs.ns51 1.0 | 1 | 2% | 8 |
| GarmBox.Oranges 1.0 | 1 | 2% | 3 |

## Melee bench: F02

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 131 / 210 | 2.40 | 18.9% | 33500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 18.9% | 131 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 47 |
| mld.DustBunny 3.8 | 2.5 | 13.5% | 12 |
| maribo.melee.BMV 0.1 | 4.2 | 10.2% | 3 |
| zyx.nano.Ant 1.1 | 6.3 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.8% | 10 |
| fullsail.SweetTea 1.1 | 8.0 | 6.6% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.4 | 21 / 35 | 5481 |
| 2 | 1 | 71.3 | 92.1 | 27 / 35 | 6011 |
| 3 | 1 | 68.9 | 87.9 | 21 / 35 | 5494 |
| 4 | 1 | 70.6 | 91.4 | 29 / 35 | 5679 |
| 5 | 1 | 69.3 | 87.6 | 24 / 35 | 5520 |
| 6 | 2 | 60.5 | 54.9 | 9 / 35 | 5315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 59 | 88% |
| oog.melee.Mercutio 1.0 | 56 | 73% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 29 | 37% | 75 |
| mld.DustBunny 3.8 | 16 | 20% | 65 |
| maribo.melee.BMV 0.1 | 9 | 11% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 10% | 17 |
| fullsail.SweetTea 1.1 | 7 | 9% | 13 |
| cs.Grudge 1.0 | 7 | 9% | 7 |
| zyx.nano.Ant 1.1 | 2 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 15 |

## Melee bench: F03

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 85.2 | 132 / 210 | 2.33 | 20.2% | 38179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.2% | 132 |
| myl.micro.Troodon 1.10 | 2.2 | 13.9% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.7% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.4% | 16 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 10 |
| fm.mammillarias 1.3 | 6.2 | 8.8% | 4 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.2% | 3 |
| sample.Tracker 1.0 | 9.5 | 5.2% | 0 |
| sample.Fire 1.0 | 9.5 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 83.5 | 19 / 35 | 6161 |
| 2 | 1 | 70.9 | 89.2 | 22 / 35 | 6514 |
| 3 | 1 | 69.3 | 79.7 | 20 / 35 | 6652 |
| 4 | 1 | 71.8 | 90.8 | 28 / 35 | 6423 |
| 5 | 1 | 70.5 | 84.4 | 23 / 35 | 6495 |
| 6 | 1 | 69.2 | 83.8 | 20 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 83% |
| cb.nano.Insomnia 1.0 | 22 | 100% |
| myl.nano.KomoriNinja 1.1 | 17 | 88% |
| sp.Nanos.Ember 1.1 | 11 | 100% |
| fm.mammillarias 1.3 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 25 | 32% | 78 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 24% | 43 |
| cb.nano.Insomnia 1.0 | 15 | 19% | 23 |
| fm.mammillarias 1.3 | 8 | 10% | 10 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 28 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 15 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 8 |
| sample.Fire 1.0 | 1 | 1% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 86.8 | 150 / 210 | 2.19 | 20.7% | 40704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.7% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.7% | 12 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 17 |
| tj.zombie1n 1.0.1 | 4.8 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 1 |
| yk.JahMicro 1.0 | 6.2 | 8.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.8% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.3 | 29 / 35 | 6792 |
| 2 | 1 | 70.4 | 84.4 | 25 / 35 | 6824 |
| 3 | 1 | 71.2 | 90.8 | 23 / 35 | 6835 |
| 4 | 1 | 69.4 | 81.6 | 23 / 35 | 6545 |
| 5 | 1 | 71.6 | 87.9 | 27 / 35 | 7113 |
| 6 | 1 | 69.4 | 82.9 | 23 / 35 | 6595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 92% |
| stelo.SoJNanoMelee 1.1 | 34 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 82% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 15 | 93% |
| yk.JahMicro 1.0 | 10 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 33% | 80 |
| stelo.SoJNanoMelee 1.1 | 11 | 18% | 42 |
| tj.zombie1n 1.0.1 | 7 | 12% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 10% | 24 |
| yk.JahMicro 1.0 | 6 | 10% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 3 |

## Melee bench: F05

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 70.3 | 90 / 210 | 3.67 | 15.9% | 28549 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 15.9% | 90 |
| oog.melee.Corsair 1.0 | 2.2 | 13.3% | 45 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 28 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.7% | 22 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 5 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.4% | 10 |
| sam.Samspin 1.0 | 6.3 | 9.2% | 5 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 7.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.6 | 16 / 35 | 4926 |
| 2 | 1 | 63.9 | 71.7 | 14 / 35 | 4629 |
| 3 | 1 | 63.9 | 70.5 | 16 / 35 | 4851 |
| 4 | 1 | 65.1 | 76.5 | 16 / 35 | 4882 |
| 5 | 1 | 62.5 | 66.0 | 13 / 35 | 5010 |
| 6 | 1 | 61.4 | 62.5 | 15 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 50% |
| simonton.nano.MeleeSeed 1.8 | 30 | 97% |
| ahf.NanoAndrew .4 | 22 | 77% |
| zyx.nano.BacillusComma 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 23% | 52 |
| simonton.nano.MeleeSeed 1.8 | 26 | 22% | 50 |
| ahf.NanoAndrew .4 | 17 | 14% | 37 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 18 |
| zyx.nano.BacillusComma 1.0 | 10 | 8% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 10 |
| EBBU.Sim2 1.02 | 7 | 6% | 15 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |
| sam.Samspin 1.0 | 3 | 3% | 10 |

## Melee bench: F06

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.5 | 123 / 210 | 2.58 | 18.5% | 32344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.5% | 123 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 37 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.1% | 13 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 9 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.8% | 6 |
| fm.claire 1.7 | 6.2 | 8.5% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.2% | 0 |
| pa.Improved 1.0 | 9.2 | 6.2% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 76.8 | 17 / 35 | 5155 |
| 2 | 1 | 68.6 | 84.1 | 20 / 35 | 5854 |
| 3 | 1 | 68.5 | 87.6 | 21 / 35 | 5150 |
| 4 | 1 | 66.3 | 76.2 | 22 / 35 | 4809 |
| 5 | 1 | 68.7 | 83.8 | 22 / 35 | 5775 |
| 6 | 1 | 68.7 | 86.3 | 21 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 82% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| arthord.NanoSatanMelee Beta | 20 | 90% |
| gh.nano.Grofvuil 0.2 | 14 | 86% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| kurios.DOSexe .9b | 3 | 67% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 33% | 70 |
| gh.nano.Grofvuil 0.2 | 13 | 15% | 29 |
| winamp32.micro.MicroMacro 1.0 | 10 | 11% | 18 |
| fm.claire 1.7 | 10 | 11% | 11 |
| arthord.NanoSatanMelee Beta | 8 | 9% | 20 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 36 |
| kurios.DOSexe .9b | 5 | 6% | 13 |
| sample.SpinBot 1.0 | 3 | 3% | 7 |
| pa.Improved 1.0 | 3 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.3 | 117 / 210 | 2.50 | 18.8% | 35411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.8% | 117 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.6% | 31 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 28 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.9% | 21 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 4 |
| DBall.Anarchy 0.1 | 6.0 | 8.0% | 6 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 1 |
| fire219.CatBot 1.0 | 8.3 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.1% | 3 |
| acogdev.alpha 0.2 | 8.8 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.1 | 21 / 35 | 6047 |
| 2 | 1 | 67.7 | 80.3 | 18 / 35 | 5864 |
| 3 | 1 | 67.9 | 79.7 | 19 / 35 | 5593 |
| 4 | 1 | 69.4 | 86.0 | 23 / 35 | 5912 |
| 5 | 1 | 69.4 | 87.0 | 21 / 35 | 6274 |
| 6 | 1 | 67.7 | 82.5 | 15 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 88% |
| mz.MicroGodMelee 1 | 52 | 79% |
| gh.micro.Gruweltje 0.7 | 24 | 67% |
| DBall.Anarchy 0.1 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 26 | 28% | 63 |
| spinnercat.micro.Tyger 0.1 | 24 | 26% | 62 |
| gh.micro.Gruweltje 0.7 | 23 | 25% | 50 |
| mbro.Detektor3 0.1.1 | 5 | 5% | 10 |
| acogdev.alpha 0.2 | 5 | 5% | 7 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |

## Melee bench: F08

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 70.3 | 103 / 210 | 3.67 | 16.4% | 30529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 16.4% | 103 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.7% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.2% | 24 |
| awesomeness.Elite 1.0 | 4.7 | 9.5% | 14 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.5% | 7 |
| germ.TheMind .2 | 5.7 | 9.4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.3% | 4 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 6 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 50.2 | 13 / 35 | 4659 |
| 2 | 1 | 62.3 | 63.8 | 17 / 35 | 4778 |
| 3 | 1 | 68.5 | 83.5 | 19 / 35 | 5522 |
| 4 | 1 | 66.6 | 76.8 | 17 / 35 | 5236 |
| 5 | 1 | 66.2 | 74.0 | 19 / 35 | 5427 |
| 6 | 1 | 65.0 | 73.7 | 18 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 74% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 91% |
| germ.TheMind .2 | 10 | 100% |
| awesomeness.Elite 1.0 | 10 | 70% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 45% | 98 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 12% | 27 |
| awesomeness.Elite 1.0 | 13 | 12% | 23 |
| germ.TheMind .2 | 10 | 9% | 21 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 14 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 9 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 9 |
| mym.EdgeStalker 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 87.7 | 160 / 210 | 2.10 | 20.2% | 32261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 20.2% | 160 |
| rz.HawkOnFire 0.1 | 2.0 | 13.3% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 10 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 9 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 8.8 | 7.1% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.3 | 26 / 35 | 5338 |
| 2 | 1 | 71.1 | 89.8 | 29 / 35 | 5484 |
| 3 | 1 | 70.3 | 87.3 | 27 / 35 | 5248 |
| 4 | 1 | 71.1 | 90.5 | 27 / 35 | 5432 |
| 5 | 1 | 70.1 | 86.7 | 27 / 35 | 5543 |
| 6 | 1 | 69.4 | 84.8 | 24 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 58 | 100% |
| nz.jdc.nano.GridFu 1.0 | 39 | 100% |
| stelo.PatternRobot 1.0 | 25 | 100% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| maribo.IotaCT 1.1 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| ratosh.Wesco 1.4 | 6 | 67% |
| spinnercat.Omen 1.0 | 6 | 83% |

Hadur died in 50 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 11 | 22% | 29 |
| ratosh.Wesco 1.4 | 11 | 22% | 16 |
| rz.HawkOnFire 0.1 | 7 | 14% | 51 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 12 |
| stelo.PatternRobot 1.0 | 5 | 10% | 17 |
| maribo.IotaCT 1.1 | 3 | 6% | 18 |
| spinnercat.Omen 1.0 | 1 | 2% | 8 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 94.4 | 178 / 210 | 1.50 | 22.0% | 39845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 22.0% | 178 |
| tvv.nano.Polaris 1.2 | 2.0 | 12.2% | 7 |
| baal.nano.N 1.42 | 3.3 | 10.9% | 7 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 1 |
| zyx.micro.Ant 1.1 | 5.5 | 9.0% | 6 |
| sanja.First 0.1 | 5.8 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 2 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 7 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.2% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.2 | 31 / 35 | 6682 |
| 2 | 1 | 72.5 | 97.1 | 30 / 35 | 6846 |
| 3 | 1 | 70.5 | 89.8 | 29 / 35 | 6200 |
| 4 | 1 | 72.1 | 94.9 | 27 / 35 | 6735 |
| 5 | 1 | 73.0 | 96.2 | 32 / 35 | 6961 |
| 6 | 1 | 71.4 | 92.1 | 29 / 35 | 6421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 98% |
| baal.nano.N 1.42 | 37 | 84% |
| cvt.Firsty 1.0 | 25 | 92% |
| zyx.micro.Ant 1.1 | 20 | 90% |
| sanja.First 0.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 24% | 39 |
| zyx.micro.Ant 1.1 | 8 | 24% | 31 |
| tvv.nano.Polaris 1.2 | 5 | 15% | 57 |
| cvt.Firsty 1.0 | 4 | 12% | 24 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 15 |
| sanja.First 0.1 | 2 | 6% | 24 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 10 |
| sample.RamFire 1.0 | 1 | 3% | 2 |

## Melee bench: F11

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 70.4 | 92 / 210 | 3.67 | 16.1% | 32585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 16.1% | 92 |
| kc.micro.Figment 1.0 | 2.0 | 14.6% | 53 |
| cs.Wren 1.0 | 3.5 | 12.6% | 27 |
| js.PinBall 1.6 | 4.2 | 11.6% | 15 |
| mz.Cork 0.1 | 4.7 | 11.1% | 14 |
| joe.ADinosaur 1.0 | 5.5 | 9.6% | 2 |
| evd.X1 0.01 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 4 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 70.8 | 14 / 35 | 5183 |
| 2 | 1 | 63.2 | 68.6 | 16 / 35 | 5153 |
| 3 | 1 | 63.4 | 65.1 | 16 / 35 | 5367 |
| 4 | 1 | 64.4 | 70.5 | 14 / 35 | 5560 |
| 5 | 1 | 66.9 | 76.5 | 18 / 35 | 5979 |
| 6 | 1 | 64.4 | 70.8 | 14 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 79% |
| cs.Wren 1.0 | 29 | 69% |
| mz.Cork 0.1 | 11 | 100% |
| js.PinBall 1.6 | 8 | 100% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 520. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 41 | 34% | 92 |
| cs.Wren 1.0 | 19 | 16% | 32 |
| js.PinBall 1.6 | 16 | 13% | 22 |
| evd.X1 0.01 | 16 | 13% | 16 |
| joe.ADinosaur 1.0 | 11 | 9% | 16 |
| mz.Cork 0.1 | 8 | 7% | 17 |
| PSW.Relentless 0.1 | 8 | 7% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.8 | 124 / 210 | 2.73 | 18.5% | 29862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.5% | 124 |
| ntc.Opposite 1.5 | 2.5 | 11.9% | 10 |
| myl.nano.Graviton 1.10 | 3.3 | 11.3% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.7% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.0% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 6 |
| disan.Chair 2.2.0 | 6.8 | 8.5% | 13 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 6.0% | 8 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 76.8 | 19 / 35 | 4793 |
| 2 | 1 | 66.9 | 81.3 | 20 / 35 | 4585 |
| 3 | 1 | 68.2 | 84.1 | 20 / 35 | 5082 |
| 4 | 1 | 68.8 | 83.8 | 23 / 35 | 5127 |
| 5 | 1 | 65.4 | 73.7 | 19 / 35 | 4537 |
| 6 | 1 | 69.7 | 85.1 | 23 / 35 | 5738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 90% |
| myl.nano.Graviton 1.10 | 32 | 81% |
| ntc.Opposite 1.5 | 20 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| disan.Chair 2.2.0 | 10 | 70% |
| DBall.NUKE 0.1 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| donjezza.Muncho 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 21% | 42 |
| myl.nano.Graviton 1.10 | 17 | 20% | 40 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 32 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 21 |
| pbg.R2D2 1.0 | 8 | 9% | 12 |
| disan.Chair 2.2.0 | 6 | 7% | 22 |
| ntc.Opposite 1.5 | 6 | 7% | 19 |
| donjezza.Muncho 1.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 1 | 1% | 13 |

## Melee bench: F13

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.5 | 82 / 210 | 3.47 | 15.8% | 26751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 15.8% | 82 |
| oog.melee.Capulet 1.2 | 2.3 | 13.9% | 52 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.3% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.7% | 27 |
| yagami.Tidus 0.11 | 4.5 | 11.9% | 12 |
| ejb.Polaris 1.0.1 | 6.0 | 10.6% | 8 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.9 | 15 / 35 | 4528 |
| 2 | 1 | 66.9 | 77.8 | 16 / 35 | 4655 |
| 3 | 1 | 65.5 | 76.8 | 13 / 35 | 4588 |
| 4 | 2 | 62.8 | 69.2 | 11 / 35 | 4131 |
| 5 | 1 | 64.3 | 72.4 | 14 / 35 | 4345 |
| 6 | 1 | 62.4 | 64.1 | 13 / 35 | 4504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 100% |
| oog.melee.Capulet 1.2 | 31 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| yagami.Tidus 0.11 | 10 | 100% |
| ejb.Polaris 1.0.1 | 3 | 67% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 36% | 69 |
| yagami.Tidus 0.11 | 23 | 18% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 38 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 31 |
| ejb.Polaris 1.0.1 | 8 | 6% | 15 |
| stelo.MirrorNano 1.3 | 8 | 6% | 9 |
| step.nanoPri 1.0 | 6 | 5% | 8 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.7 | 145 / 210 | 2.47 | 18.7% | 29734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.7% | 145 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 17 |
| wee.Gem 1.8.4 | 3.5 | 11.2% | 19 |
| wompi.Quokka 1.6 | 3.7 | 11.0% | 10 |
| ratosh.Nobo 0.21 | 4.2 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 5 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.1% | 2 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.5 | 23 / 35 | 4833 |
| 2 | 1 | 69.1 | 88.9 | 27 / 35 | 4763 |
| 3 | 1 | 68.0 | 83.2 | 25 / 35 | 4938 |
| 4 | 1 | 65.6 | 76.2 | 19 / 35 | 4857 |
| 5 | 1 | 69.5 | 89.5 | 28 / 35 | 5177 |
| 6 | 1 | 67.7 | 81.6 | 23 / 35 | 5166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 90% |
| wee.Gem 1.8.4 | 37 | 97% |
| wompi.Quokka 1.6 | 25 | 100% |
| ratosh.Nobo 0.21 | 12 | 75% |
| bayen.UbaMicro 1.4 | 10 | 100% |
| m3thos.Eva00 1.1 | 9 | 89% |
| stelo.MyAgileRobot 0.2 | 8 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 6 | 83% |

Hadur died in 66 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 10 | 15% | 55 |
| ratosh.Nobo 0.21 | 10 | 15% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 15% | 11 |
| bzdp.Pansy 2.1 | 8 | 12% | 52 |
| maribo.FollowFire 1 | 7 | 11% | 7 |
| wompi.Quokka 1.6 | 6 | 9% | 23 |
| stelo.MyAgileRobot 0.2 | 6 | 9% | 12 |
| m3thos.Eva00 1.1 | 5 | 8% | 20 |
| bayen.UbaMicro 1.4 | 4 | 6% | 12 |

## Melee bench: F15

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 85.9 | 115 / 210 | 2.27 | 20.8% | 46298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.2 | 20.8% | 115 |
| wompi.Wallaby 5.1 | 1.8 | 18.0% | 72 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 13 |
| ayk.WallHugger 1.0 | 4.2 | 10.2% | 3 |
| exauge.GateKeeper 1.1.121g | 5.3 | 9.2% | 5 |
| stuff.Vlad 0.1 | 5.5 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 85.4 | 17 / 35 | 7867 |
| 2 | 1 | 72.6 | 89.2 | 24 / 35 | 7369 |
| 3 | 1 | 71.7 | 84.8 | 17 / 35 | 8055 |
| 4 | 1 | 74.1 | 91.1 | 26 / 35 | 8173 |
| 5 | 1 | 72.8 | 89.5 | 22 / 35 | 7826 |
| 6 | 2 | 67.8 | 75.6 | 9 / 35 | 7008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 69% |
| mz.NanoGod 2.02 | 12 | 42% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 48 | 50% | 131 |
| mz.NanoGod 2.02 | 25 | 26% | 35 |
| exauge.GateKeeper 1.1.121g | 11 | 11% | 15 |
| ayk.WallHugger 1.0 | 8 | 8% | 14 |
| drd.Dreadknoght 0.9 | 3 | 3% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.0 | 110 / 210 | 3.43 | 16.8% | 29499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 16.8% | 110 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 23 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.4% | 16 |
| bvh.micro.Freya 0.3 | 3.7 | 11.2% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 22 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.9% | 5 |
| conscience.Electron 1.3g | 7.0 | 8.6% | 3 |
| ap.Frederick 1.1 | 8.3 | 7.3% | 12 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.5 | 19 / 35 | 4730 |
| 2 | 1 | 66.2 | 78.7 | 19 / 35 | 4774 |
| 3 | 1 | 63.6 | 66.0 | 13 / 35 | 5251 |
| 4 | 1 | 64.0 | 69.5 | 17 / 35 | 4900 |
| 5 | 1 | 66.3 | 76.8 | 21 / 35 | 4892 |
| 6 | 1 | 66.1 | 76.5 | 21 / 35 | 4952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 87% |
| bvh.micro.Freya 0.3 | 23 | 91% |
| dummy.micro.Sparrow 2.5 | 22 | 95% |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 90% |
| ap.Frederick 1.1 | 7 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 18 | 18% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 18% | 16 |
| voidious.micro.BlitzBat 1.05 | 17 | 17% | 52 |
| bvh.micro.Freya 0.3 | 14 | 14% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 12% | 32 |
| dummy.micro.Sparrow 2.5 | 9 | 9% | 31 |
| dl.BetterWalls 1.0 | 9 | 9% | 12 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 13 |

## Melee bench: F17

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.6 | 148 / 210 | 2.39 | 21.1% | 43121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 21.1% | 148 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 21 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 16 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 10.0% | 6 |
| dsw.StaticD 1.0 | 5.7 | 9.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.9% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 1 |
| sample.Corners 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 85.4 | 25 / 35 | 7305 |
| 2 | 1 | 70.4 | 82.5 | 23 / 35 | 6948 |
| 3 | 1 | 72.1 | 87.9 | 28 / 35 | 7160 |
| 4 | 1 | 70.8 | 83.5 | 25 / 35 | 6877 |
| 5 | 1 | 72.7 | 88.6 | 26 / 35 | 8000 |
| 6 | 1 | 69.5 | 79.4 | 21 / 35 | 6831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 48 | 92% |
| supersample.SuperBoxBot 1.0 | 26 | 77% |
| dsw.StaticD 1.0 | 12 | 67% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| mme.NikeEnhanced 2.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 39% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 26% | 59 |
| dsw.StaticD 1.0 | 8 | 13% | 19 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 11 |
| sul.Lunar 1.1 | 4 | 6% | 57 |
| sample.Corners 1.0 | 3 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F18

hadur117.micro.SaorWBG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 77.5 | 107 / 210 | 3.02 | 18.1% | 38217 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWBG 0.1 | 1.0 | 18.1% | 107 |
| radnor.DoctorBob 1.42 | 2.0 | 13.9% | 33 |
| mld.Wisdom 1.0 | 3.0 | 11.9% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 10.7% | 17 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 10 |
| amz.NanoClone 1.41 | 5.7 | 9.8% | 10 |
| sample.Walls 1.0 | 7.3 | 8.4% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 7.5% | 0 |
| jangs.ns51 1.0 | 9.0 | 5.5% | 4 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.3 | 15 / 35 | 5927 |
| 2 | 1 | 65.7 | 70.8 | 16 / 35 | 6401 |
| 3 | 1 | 68.7 | 79.0 | 21 / 35 | 6748 |
| 4 | 1 | 67.4 | 76.2 | 20 / 35 | 6275 |
| 5 | 1 | 68.5 | 80.6 | 17 / 35 | 6633 |
| 6 | 1 | 67.0 | 77.1 | 18 / 35 | 6233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 97% |
| radnor.DoctorBob 1.42 | 25 | 76% |
| mld.Wisdom 1.0 | 16 | 69% |
| sample.Walls 1.0 | 14 | 100% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 6 | 83% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 32% | 46 |
| radnor.DoctorBob 1.42 | 22 | 21% | 51 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 16% | 48 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 25 |
| sample.Walls 1.0 | 10 | 10% | 18 |
| amz.NanoClone 1.41 | 6 | 6% | 13 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

