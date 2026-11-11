# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 91.3 | 162 / 210 | 1.78 | 22.0% | 43431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 22.0% | 162 |
| mz.AntiGrav 1.0 | 2.5 | 13.9% | 11 |
| radnor.DoctorBob 1.42 | 2.7 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.8 | 12.7% | 16 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 3 |
| sample.Walls 1.0 | 6.8 | 6.7% | 0 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 8.8 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 86.0 | 22 / 35 | 6919 |
| 2 | 1 | 73.8 | 94.6 | 28 / 35 | 7178 |
| 3 | 1 | 72.4 | 89.5 | 26 / 35 | 6999 |
| 4 | 1 | 73.4 | 92.4 | 30 / 35 | 7515 |
| 5 | 1 | 72.7 | 91.7 | 27 / 35 | 7101 |
| 6 | 1 | 73.7 | 93.7 | 29 / 35 | 7719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 74 | 97% |
| mld.Infinity 2.2 | 38 | 95% |
| radnor.DoctorBob 1.42 | 33 | 91% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Target 1.0 | 5 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 5 | 60% |
| jangs.ns51 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 38% | 60 |
| mz.AntiGrav 1.0 | 14 | 29% | 71 |
| mld.Infinity 2.2 | 4 | 8% | 41 |
| amz.NanoClone 1.41 | 4 | 8% | 9 |
| jangs.ns51 1.0 | 4 | 8% | 8 |
| sample.Walls 1.0 | 2 | 4% | 10 |
| GarmBox.Oranges 1.0 | 2 | 4% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.2 | 115 / 210 | 2.70 | 18.2% | 32543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.3 | 18.2% | 115 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.2% | 47 |
| mld.DustBunny 3.8 | 2.5 | 14.0% | 25 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 5 |
| zyx.nano.Ant 1.1 | 5.8 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.0% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.0% | 11 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 2 |
| bzdp.BoxCar 2.0 | 8.8 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 18 / 35 | 5687 |
| 2 | 1 | 69.7 | 87.6 | 24 / 35 | 5904 |
| 3 | 3 | 60.4 | 56.5 | 8 / 35 | 4823 |
| 4 | 1 | 63.0 | 62.5 | 11 / 35 | 5281 |
| 5 | 1 | 70.6 | 94.3 | 27 / 35 | 5439 |
| 6 | 1 | 70.9 | 94.9 | 27 / 35 | 5409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 80% |
| mld.DustBunny 3.8 | 48 | 81% |
| djdjdj.NanoSkunk10 1.0 | 12 | 100% |
| fullsail.SweetTea 1.1 | 8 | 88% |
| maribo.melee.BMV 0.1 | 7 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 50% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 32 | 34% | 80 |
| mld.DustBunny 3.8 | 28 | 29% | 69 |
| cs.Grudge 1.0 | 9 | 9% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 11 |
| zyx.nano.Ant 1.1 | 5 | 5% | 10 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 14 |
| maribo.melee.BMV 0.1 | 4 | 4% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 83.0 | 124 / 210 | 2.53 | 19.5% | 35968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.5% | 124 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 36 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.2% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 10.7% | 21 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.4% | 7 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 6 |
| sample.Fire 1.0 | 9.3 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 77.1 | 18 / 35 | 6135 |
| 2 | 1 | 69.5 | 83.5 | 23 / 35 | 5582 |
| 3 | 1 | 72.2 | 93.3 | 27 / 35 | 6309 |
| 4 | 1 | 69.3 | 81.6 | 19 / 35 | 6122 |
| 5 | 1 | 67.6 | 77.1 | 17 / 35 | 5764 |
| 6 | 1 | 69.6 | 85.4 | 20 / 35 | 6056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 73% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 12 | 75% |
| cs.sheldor.Talon 1.1 | 5 | 80% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 22% | 26 |
| myl.micro.Troodon 1.10 | 18 | 21% | 65 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 21% | 37 |
| myl.nano.KomoriNinja 1.1 | 11 | 13% | 35 |
| fm.mammillarias 1.3 | 10 | 12% | 16 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 10 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 17 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| sample.Fire 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.7 | 150 / 210 | 2.20 | 20.5% | 38369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.5% | 150 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.3% | 13 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.7% | 17 |
| tj.zombie1n 1.0.1 | 5.0 | 9.5% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.8% | 4 |
| yk.JahMicro 1.0 | 7.3 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 91.1 | 27 / 35 | 6618 |
| 2 | 1 | 69.1 | 81.9 | 23 / 35 | 6387 |
| 3 | 1 | 67.6 | 80.0 | 20 / 35 | 5715 |
| 4 | 1 | 70.8 | 89.8 | 25 / 35 | 6357 |
| 5 | 1 | 71.9 | 92.4 | 28 / 35 | 6626 |
| 6 | 1 | 70.6 | 84.8 | 27 / 35 | 6666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 95% |
| stelo.SoJNanoMelee 1.1 | 49 | 82% |
| tj.zombie1n 1.0.1 | 15 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 83% |
| yk.JahMicro 1.0 | 8 | 100% |
| sample.VelociRobot 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 37% | 87 |
| stelo.SoJNanoMelee 1.1 | 14 | 23% | 39 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 13% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 21 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 18 |
| yk.JahMicro 1.0 | 3 | 5% | 9 |
| tj.zombie1n 1.0.1 | 3 | 5% | 7 |
| sample.VelociRobot 1.0 | 2 | 3% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.6 | 102 / 210 | 3.46 | 16.5% | 28443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 16.5% | 102 |
| oog.melee.Corsair 1.0 | 2.3 | 12.3% | 27 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 26 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.1% | 20 |
| EBBU.Sim2 1.02 | 5.5 | 9.8% | 4 |
| sam.Samspin 1.0 | 6.0 | 9.5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.0% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.3% | 14 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 24 / 35 | 5130 |
| 2 | 1 | 62.0 | 67.3 | 14 / 35 | 4417 |
| 3 | 1 | 64.8 | 74.3 | 15 / 35 | 4902 |
| 4 | 1 | 66.1 | 76.2 | 20 / 35 | 4681 |
| 5 | 1 | 63.7 | 69.8 | 13 / 35 | 4802 |
| 6 | 1 | 62.5 | 66.7 | 16 / 35 | 4511 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 90% |
| oog.melee.Corsair 1.0 | 25 | 64% |
| ahf.NanoAndrew .4 | 20 | 80% |
| EBBU.Sim2 1.02 | 13 | 100% |
| sam.Samspin 1.0 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 7 | 71% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 24% | 57 |
| robar.nano.Assertive_Melee 0.2 | 19 | 17% | 23 |
| oog.melee.Corsair 1.0 | 15 | 14% | 34 |
| ahf.NanoAndrew .4 | 12 | 11% | 31 |
| zyx.nano.BacillusComma 1.0 | 12 | 11% | 15 |
| EBBU.Sim2 1.02 | 9 | 8% | 20 |
| sam.Samspin 1.0 | 7 | 6% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 8 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |

## Melee bench: F06

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.7 | 150 / 210 | 2.29 | 19.5% | 33095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.5% | 150 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.4% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.0% | 8 |
| arthord.NanoSatanMelee Beta | 5.5 | 8.7% | 3 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.5% | 2 |
| fm.claire 1.7 | 6.3 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.3 | 7.6% | 2 |
| pa.Improved 1.0 | 9.3 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 25 / 35 | 5515 |
| 2 | 1 | 70.7 | 91.1 | 29 / 35 | 5865 |
| 3 | 1 | 69.3 | 85.1 | 24 / 35 | 5677 |
| 4 | 1 | 69.3 | 84.8 | 26 / 35 | 5670 |
| 5 | 1 | 66.2 | 75.2 | 22 / 35 | 5184 |
| 6 | 1 | 69.1 | 88.6 | 24 / 35 | 5184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 94% |
| oog.melee.CapuletDroid 1.1 | 32 | 100% |
| arthord.NanoSatanMelee Beta | 21 | 95% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| sample.SpinBot 1.0 | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 32% | 73 |
| gh.nano.Grofvuil 0.2 | 12 | 20% | 31 |
| arthord.NanoSatanMelee Beta | 7 | 12% | 20 |
| winamp32.micro.MicroMacro 1.0 | 6 | 10% | 17 |
| oog.melee.CapuletDroid 1.1 | 5 | 8% | 42 |
| fm.claire 1.7 | 5 | 8% | 8 |
| pa.Improved 1.0 | 4 | 7% | 5 |
| kurios.DOSexe .9b | 1 | 2% | 8 |
| sample.SpinBot 1.0 | 1 | 2% | 6 |

## Melee bench: F07

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.4 | 116 / 210 | 2.59 | 18.5% | 33832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.5% | 116 |
| spinnercat.micro.Tyger 0.1 | 2.5 | 14.1% | 29 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.0% | 24 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 26 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.8% | 3 |
| el.JumpShoot 0.2 | 8.2 | 6.3% | 6 |
| fire219.CatBot 1.0 | 8.3 | 6.1% | 0 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 2 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 74.6 | 14 / 35 | 5379 |
| 2 | 1 | 70.0 | 88.3 | 24 / 35 | 5854 |
| 3 | 1 | 68.9 | 82.5 | 20 / 35 | 6232 |
| 4 | 1 | 69.0 | 84.4 | 22 / 35 | 5412 |
| 5 | 1 | 67.6 | 83.2 | 18 / 35 | 5398 |
| 6 | 1 | 67.7 | 81.3 | 18 / 35 | 5557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 85% |
| mz.MicroGodMelee 1 | 38 | 63% |
| gh.micro.Gruweltje 0.7 | 17 | 76% |
| DBall.Anarchy 0.1 | 14 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 26 | 28% | 69 |
| mz.MicroGodMelee 1 | 25 | 27% | 53 |
| gh.micro.Gruweltje 0.7 | 15 | 16% | 32 |
| caimano.Furia_Ceca 0.22 | 8 | 9% | 12 |
| acogdev.alpha 0.2 | 8 | 9% | 9 |
| fire219.CatBot 1.0 | 5 | 5% | 6 |
| DBall.Anarchy 0.1 | 4 | 4% | 20 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |

## Melee bench: F08

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 75.9 | 116 / 210 | 3.17 | 17.6% | 32538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 17.6% | 116 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.2% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 26 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.6% | 7 |
| awesomeness.Elite 1.0 | 5.5 | 9.0% | 11 |
| germ.TheMind .2 | 5.7 | 9.0% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.6% | 3 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 69.5 | 18 / 35 | 5370 |
| 2 | 1 | 66.3 | 74.3 | 16 / 35 | 5603 |
| 3 | 1 | 66.9 | 75.6 | 22 / 35 | 5611 |
| 4 | 1 | 66.1 | 76.5 | 17 / 35 | 5473 |
| 5 | 1 | 68.5 | 84.4 | 23 / 35 | 5392 |
| 6 | 1 | 66.2 | 75.2 | 20 / 35 | 5089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 71 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 90% |
| germ.TheMind .2 | 10 | 90% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| stelo.UntouchableNano 1.3 | 8 | 88% |
| awesomeness.Elite 1.0 | 8 | 88% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 45% | 96 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 17% | 36 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 10 |
| awesomeness.Elite 1.0 | 7 | 7% | 18 |
| stelo.UntouchableNano 1.3 | 7 | 7% | 14 |
| germ.TheMind .2 | 6 | 6% | 18 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 5 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.8 | 159 / 210 | 2.00 | 20.1% | 30641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 20.1% | 159 |
| rz.HawkOnFire 0.1 | 2.3 | 13.6% | 19 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.7% | 8 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 11 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.5% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 1 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 27 / 35 | 4947 |
| 2 | 1 | 69.8 | 85.1 | 25 / 35 | 4992 |
| 3 | 1 | 71.7 | 95.2 | 30 / 35 | 4823 |
| 4 | 1 | 67.7 | 80.3 | 20 / 35 | 4967 |
| 5 | 1 | 71.9 | 89.8 | 30 / 35 | 5532 |
| 6 | 1 | 71.5 | 94.0 | 27 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 69 | 93% |
| nz.jdc.nano.GridFu 1.0 | 45 | 100% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| timmit.nano.TimDog 0.33 | 12 | 92% |
| maribo.IotaCT 1.1 | 9 | 78% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 27% | 65 |
| stelo.PatternRobot 1.0 | 8 | 15% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 52 |
| ratosh.Wesco 1.4 | 6 | 12% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 12% | 9 |
| timmit.nano.TimDog 0.33 | 5 | 10% | 23 |
| maribo.IotaCT 1.1 | 5 | 10% | 16 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.6 | 170 / 210 | 1.84 | 21.4% | 39318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.4% | 170 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 14 |
| baal.nano.N 1.42 | 2.8 | 11.1% | 3 |
| zyx.micro.Ant 1.1 | 4.3 | 9.7% | 12 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.4% | 3 |
| sanja.First 0.1 | 6.7 | 8.3% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.4% | 0 |
| cvt.Firsty 1.0 | 8.2 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 97.5 | 32 / 35 | 6657 |
| 2 | 1 | 72.4 | 92.7 | 30 / 35 | 6877 |
| 3 | 1 | 69.5 | 85.1 | 23 / 35 | 6063 |
| 4 | 1 | 69.9 | 85.4 | 25 / 35 | 6132 |
| 5 | 1 | 71.8 | 89.2 | 30 / 35 | 6923 |
| 6 | 1 | 71.9 | 94.0 | 30 / 35 | 6666 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 94% |
| baal.nano.N 1.42 | 32 | 97% |
| cvt.Firsty 1.0 | 25 | 100% |
| zyx.micro.Ant 1.1 | 24 | 92% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 86% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 35% | 37 |
| amk.Punbot.Punbot 0.01 | 5 | 13% | 9 |
| cvt.Firsty 1.0 | 4 | 10% | 27 |
| Grystrion.TrackerWO 1.0 | 4 | 10% | 17 |
| sample.RamFire 1.0 | 4 | 10% | 7 |
| baal.nano.N 1.42 | 3 | 8% | 31 |
| tvv.nano.Polaris 1.2 | 2 | 5% | 56 |
| sanja.First 0.1 | 2 | 5% | 17 |
| squidM.TentalceMeleeNano 1.1 | 2 | 5% | 7 |

## Melee bench: F11

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.7 | 86 / 210 | 3.55 | 16.0% | 31557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 16.0% | 86 |
| kc.micro.Figment 1.0 | 2.2 | 14.4% | 57 |
| cs.Wren 1.0 | 2.7 | 12.9% | 24 |
| js.PinBall 1.6 | 4.0 | 11.8% | 17 |
| mz.Cork 0.1 | 5.2 | 10.9% | 14 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 3 |
| evd.X1 0.01 | 7.0 | 7.6% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 5 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 68.3 | 12 / 35 | 5138 |
| 2 | 2 | 63.1 | 66.7 | 12 / 35 | 5270 |
| 3 | 1 | 63.0 | 69.5 | 13 / 35 | 5062 |
| 4 | 1 | 66.5 | 81.0 | 14 / 35 | 5643 |
| 5 | 1 | 64.0 | 71.4 | 13 / 35 | 5193 |
| 6 | 1 | 65.6 | 73.3 | 22 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 63% |
| cs.Wren 1.0 | 28 | 71% |
| mz.Cork 0.1 | 12 | 75% |
| js.PinBall 1.6 | 8 | 75% |
| joe.ADinosaur 1.0 | 6 | 100% |
| evd.X1 0.01 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 46% | 99 |
| cs.Wren 1.0 | 22 | 18% | 36 |
| evd.X1 0.01 | 11 | 9% | 14 |
| mz.Cork 0.1 | 9 | 7% | 18 |
| joe.ADinosaur 1.0 | 9 | 7% | 13 |
| js.PinBall 1.6 | 8 | 6% | 14 |
| donjezza.Jezza 1.0 | 4 | 3% | 8 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.8 | 129 / 210 | 2.46 | 19.1% | 30658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 19.1% | 129 |
| myl.nano.Graviton 1.10 | 2.8 | 11.5% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.6% | 21 |
| ntc.Opposite 1.5 | 4.5 | 10.3% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.5% | 7 |
| DBall.NUKE 0.1 | 7.0 | 8.4% | 3 |
| disan.Chair 2.2.0 | 7.0 | 8.5% | 8 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 5 |
| pbg.R2D2 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 22 / 35 | 4988 |
| 2 | 1 | 66.7 | 76.8 | 18 / 35 | 5192 |
| 3 | 1 | 69.1 | 85.1 | 24 / 35 | 5265 |
| 4 | 1 | 68.9 | 87.3 | 22 / 35 | 5122 |
| 5 | 1 | 69.4 | 88.3 | 23 / 35 | 5221 |
| 6 | 1 | 68.0 | 82.2 | 20 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 84% |
| stelo.AreaTargetingBot 1.1 | 34 | 91% |
| donjezza.Muncho 1.0 | 16 | 94% |
| DBall.NUKE 0.1 | 15 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 93% |
| ntc.Opposite 1.5 | 13 | 69% |
| disan.Chair 2.2.0 | 12 | 75% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 23% | 46 |
| stelo.AreaTargetingBot 1.1 | 16 | 20% | 42 |
| ntc.Opposite 1.5 | 11 | 14% | 23 |
| pfvicm.Sobieski 7.2.3b | 10 | 12% | 19 |
| disan.Chair 2.2.0 | 9 | 11% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 10% | 21 |
| DBall.NUKE 0.1 | 4 | 5% | 22 |
| donjezza.Muncho 1.0 | 2 | 2% | 12 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.8 | 88 / 210 | 3.36 | 16.3% | 27254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.2 | 16.3% | 88 |
| oog.melee.Capulet 1.2 | 2.7 | 13.5% | 50 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 27 |
| yagami.Tidus 0.11 | 5.2 | 11.5% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 6 |
| step.nanoPri 1.0 | 7.5 | 7.7% | 0 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 2 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.1 | 15 / 35 | 4837 |
| 2 | 1 | 62.9 | 66.0 | 15 / 35 | 4360 |
| 3 | 1 | 66.6 | 80.3 | 15 / 35 | 4687 |
| 4 | 2 | 63.6 | 69.8 | 16 / 35 | 4200 |
| 5 | 1 | 63.9 | 68.6 | 12 / 35 | 4215 |
| 6 | 1 | 67.1 | 81.0 | 15 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 68% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 74% |
| yagami.Tidus 0.11 | 12 | 92% |
| ejb.Polaris 1.0.1 | 12 | 75% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 37% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 42 |
| yagami.Tidus 0.11 | 17 | 14% | 29 |
| stelo.MirrorNano 1.3 | 11 | 9% | 11 |
| kurios.DOSexe .9a | 8 | 7% | 9 |
| kawigi.micro.Shiz 1.1 | 7 | 6% | 28 |
| ejb.Polaris 1.0.1 | 7 | 6% | 18 |
| step.nanoPri 1.0 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.4 | 135 / 210 | 2.68 | 18.0% | 28447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.0% | 135 |
| bzdp.Pansy 2.1 | 2.5 | 12.1% | 11 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 18 |
| wee.Gem 1.8.4 | 3.8 | 11.6% | 23 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 9 |
| m3thos.Eva00 1.1 | 6.3 | 9.5% | 5 |
| bayen.UbaMicro 1.4 | 6.7 | 8.9% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.6 | 23 / 35 | 4423 |
| 2 | 1 | 67.3 | 82.9 | 25 / 35 | 4560 |
| 3 | 1 | 66.8 | 80.6 | 21 / 35 | 4925 |
| 4 | 1 | 67.7 | 80.6 | 22 / 35 | 5139 |
| 5 | 1 | 67.6 | 84.4 | 23 / 35 | 4698 |
| 6 | 1 | 66.1 | 78.1 | 21 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 96% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 24 | 83% |
| ratosh.Nobo 0.21 | 19 | 84% |
| m3thos.Eva00 1.1 | 8 | 88% |
| bayen.UbaMicro 1.4 | 6 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 12 | 16% | 30 |
| ratosh.Nobo 0.21 | 12 | 16% | 25 |
| bayen.UbaMicro 1.4 | 12 | 16% | 13 |
| maribo.FollowFire 1 | 10 | 13% | 12 |
| bzdp.Pansy 2.1 | 7 | 9% | 60 |
| wee.Gem 1.8.4 | 7 | 9% | 41 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 7 |
| m3thos.Eva00 1.1 | 4 | 5% | 9 |

## Melee bench: F15

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.5 | 134 / 210 | 1.94 | 21.5% | 46553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.5% | 134 |
| wompi.Wallaby 5.1 | 2.0 | 17.7% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 17 |
| ayk.WallHugger 1.0 | 4.7 | 9.6% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.4% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 86.7 | 22 / 35 | 7427 |
| 2 | 1 | 73.0 | 91.1 | 23 / 35 | 7989 |
| 3 | 1 | 73.7 | 91.7 | 22 / 35 | 8526 |
| 4 | 1 | 71.8 | 89.2 | 20 / 35 | 7497 |
| 5 | 1 | 74.6 | 94.0 | 27 / 35 | 8298 |
| 6 | 1 | 70.8 | 84.4 | 20 / 35 | 6816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 82% |
| mz.NanoGod 2.02 | 22 | 68% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| ayk.WallHugger 1.0 | 10 | 100% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 75% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 33 | 43% | 134 |
| mz.NanoGod 2.02 | 26 | 34% | 41 |
| exauge.GateKeeper 1.1.121g | 8 | 10% | 15 |
| ayk.WallHugger 1.0 | 5 | 6% | 9 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.0 | 129 / 210 | 2.89 | 18.0% | 29947 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.0% | 129 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.2% | 19 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 16 |
| bvh.micro.Freya 0.3 | 3.7 | 11.4% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.4% | 11 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 4 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 1 |
| dl.BetterWalls 1.0 | 8.2 | 6.9% | 8 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 71.1 | 17 / 35 | 4770 |
| 2 | 1 | 68.4 | 82.9 | 24 / 35 | 5130 |
| 3 | 1 | 65.6 | 77.5 | 18 / 35 | 4575 |
| 4 | 1 | 65.6 | 72.4 | 22 / 35 | 5012 |
| 5 | 1 | 68.9 | 87.0 | 24 / 35 | 5141 |
| 6 | 1 | 68.4 | 83.5 | 24 / 35 | 5319 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 50 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 85% |
| dummy.micro.Sparrow 2.5 | 27 | 93% |
| bvh.micro.Freya 0.3 | 21 | 95% |
| stelo.MirrorMicro 1.0 | 8 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 0% |

Hadur died in 81 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 21 | 26% | 26 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 17% | 12 |
| dummy.micro.Sparrow 2.5 | 12 | 15% | 31 |
| voidious.micro.BlitzBat 1.05 | 9 | 11% | 50 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 9% | 36 |
| dl.BetterWalls 1.0 | 7 | 9% | 11 |
| bvh.micro.Freya 0.3 | 6 | 7% | 26 |
| stelo.MirrorMicro 1.0 | 5 | 6% | 17 |

## Melee bench: F17

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 89.9 | 161 / 210 | 1.90 | 21.8% | 41818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 21.8% | 161 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 15 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 12 |
| sul.Lunar 1.1 | 4.2 | 10.6% | 1 |
| mme.NikeEnhanced 2.0 | 4.3 | 9.8% | 11 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.9% | 2 |
| sample.Corners 1.0 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 89.5 | 28 / 35 | 6964 |
| 2 | 1 | 70.6 | 85.1 | 26 / 35 | 6388 |
| 3 | 1 | 72.2 | 90.2 | 27 / 35 | 7064 |
| 4 | 1 | 71.2 | 87.6 | 24 / 35 | 6834 |
| 5 | 1 | 73.3 | 94.3 | 27 / 35 | 7343 |
| 6 | 1 | 72.9 | 93.0 | 29 / 35 | 7225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 49 | 90% |
| sul.Lunar 1.1 | 49 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 73% |
| mme.NikeEnhanced 2.0 | 16 | 94% |
| dsw.StaticD 1.0 | 14 | 79% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 67% |

Hadur died in 50 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 36% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 24% | 53 |
| mme.NikeEnhanced 2.0 | 8 | 16% | 21 |
| dsw.StaticD 1.0 | 7 | 14% | 22 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sul.Lunar 1.1 | 1 | 2% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 6 |
| sample.Corners 1.0 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F18

hadur117.micro.SaorWAG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 81.5 | 110 / 210 | 2.66 | 18.9% | 38306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAG 0.1 | 1.0 | 18.9% | 110 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 32 |
| mld.Wisdom 1.0 | 3.0 | 12.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.1% | 24 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.2% | 9 |
| amz.NanoClone 1.41 | 6.0 | 9.2% | 7 |
| GarmBox.Oranges 1.0 | 7.3 | 7.4% | 1 |
| sample.Walls 1.0 | 7.7 | 7.4% | 3 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.4 | 15 / 35 | 5881 |
| 2 | 1 | 70.6 | 87.0 | 23 / 35 | 6696 |
| 3 | 1 | 67.7 | 78.7 | 19 / 35 | 6189 |
| 4 | 1 | 68.8 | 81.9 | 18 / 35 | 6436 |
| 5 | 1 | 69.0 | 84.4 | 18 / 35 | 6765 |
| 6 | 1 | 67.6 | 78.7 | 17 / 35 | 6339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 70% |
| radnor.DoctorBob 1.42 | 32 | 84% |
| mld.Wisdom 1.0 | 21 | 67% |
| sample.Walls 1.0 | 13 | 92% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| GarmBox.Oranges 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 34 | 34% | 47 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 25% | 59 |
| radnor.DoctorBob 1.42 | 21 | 21% | 53 |
| KiraNL.Chupacabra 0.4 | 9 | 9% | 17 |
| amz.NanoClone 1.41 | 6 | 6% | 13 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 12 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |

