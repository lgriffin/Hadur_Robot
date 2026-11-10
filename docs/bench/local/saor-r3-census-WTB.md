# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.6 | 154 / 210 | 2.02 | 21.3% | 43079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.3% | 154 |
| mz.AntiGrav 1.0 | 2.5 | 13.9% | 13 |
| radnor.DoctorBob 1.42 | 3.2 | 13.4% | 16 |
| mld.Infinity 2.2 | 3.5 | 12.9% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.1% | 2 |
| sample.Walls 1.0 | 6.5 | 7.4% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 7.0% | 1 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 4 |
| arthord.MannyPacquiao Beta | 8.8 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 88.6 | 27 / 35 | 7107 |
| 2 | 1 | 70.1 | 81.0 | 22 / 35 | 6502 |
| 3 | 1 | 72.1 | 89.2 | 24 / 35 | 7103 |
| 4 | 1 | 72.5 | 91.4 | 30 / 35 | 7031 |
| 5 | 1 | 73.3 | 93.3 | 26 / 35 | 7789 |
| 6 | 1 | 72.1 | 88.3 | 25 / 35 | 7547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 94% |
| mld.Infinity 2.2 | 41 | 93% |
| radnor.DoctorBob 1.42 | 36 | 89% |
| amz.NanoClone 1.41 | 8 | 88% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.AntiGrav 1.0 | 19 | 34% | 68 |
| radnor.DoctorBob 1.42 | 19 | 34% | 66 |
| amz.NanoClone 1.41 | 7 | 13% | 13 |
| mld.Infinity 2.2 | 6 | 11% | 45 |
| GarmBox.Oranges 1.0 | 3 | 5% | 4 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.8 | 110 / 210 | 2.55 | 18.1% | 32051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 18.1% | 110 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 52 |
| mld.DustBunny 3.8 | 2.7 | 13.7% | 27 |
| maribo.melee.BMV 0.1 | 4.3 | 10.4% | 3 |
| zyx.nano.Ant 1.1 | 5.5 | 8.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.7% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 10 |
| fullsail.SweetTea 1.1 | 8.2 | 7.0% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.3 | 22 / 35 | 5473 |
| 2 | 1 | 68.9 | 88.3 | 19 / 35 | 5683 |
| 3 | 1 | 67.3 | 83.5 | 16 / 35 | 5076 |
| 4 | 1 | 70.2 | 92.4 | 25 / 35 | 5739 |
| 5 | 1 | 69.3 | 89.8 | 18 / 35 | 5396 |
| 6 | 2 | 60.1 | 54.3 | 10 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 56 | 84% |
| oog.melee.Mercutio 1.0 | 51 | 65% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 50% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 35% | 78 |
| mld.DustBunny 3.8 | 24 | 24% | 60 |
| maribo.melee.BMV 0.1 | 10 | 10% | 14 |
| zyx.nano.Ant 1.1 | 8 | 8% | 13 |
| cs.Grudge 1.0 | 8 | 8% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 12 |
| fullsail.SweetTea 1.1 | 5 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 12 |
| bzdp.BoxCar 2.0 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.9 | 149 / 210 | 2.18 | 20.8% | 38173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.8% | 149 |
| myl.micro.Troodon 1.10 | 2.2 | 13.5% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.3% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.3% | 18 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 9 |
| fm.mammillarias 1.3 | 5.3 | 9.5% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.9% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 1 |
| sample.Fire 1.0 | 9.2 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 26 / 35 | 6630 |
| 2 | 1 | 70.8 | 86.7 | 26 / 35 | 6241 |
| 3 | 1 | 71.2 | 87.3 | 26 / 35 | 6478 |
| 4 | 1 | 71.0 | 86.0 | 24 / 35 | 6335 |
| 5 | 1 | 69.5 | 84.4 | 22 / 35 | 5845 |
| 6 | 1 | 71.4 | 86.7 | 25 / 35 | 6644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 46 | 78% |
| myl.nano.KomoriNinja 1.1 | 22 | 95% |
| sp.Nanos.Ember 1.1 | 17 | 100% |
| cb.nano.Insomnia 1.0 | 15 | 93% |
| fm.mammillarias 1.3 | 7 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 36% | 47 |
| myl.micro.Troodon 1.10 | 14 | 23% | 69 |
| myl.nano.KomoriNinja 1.1 | 8 | 13% | 40 |
| cb.nano.Insomnia 1.0 | 7 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 7% | 9 |
| fm.mammillarias 1.3 | 2 | 3% | 6 |
| sample.Fire 1.0 | 2 | 3% | 5 |
| sp.Nanos.Ember 1.1 | 1 | 2% | 18 |
| sample.Tracker 1.0 | 1 | 2% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.0 | 156 / 210 | 1.99 | 21.1% | 40007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.1% | 156 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.5% | 18 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 11 |
| tj.zombie1n 1.0.1 | 4.3 | 9.5% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.0% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.1% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.8% | 3 |
| yk.JahMicro 1.0 | 7.2 | 7.3% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.8 | 25 / 35 | 6313 |
| 2 | 1 | 73.3 | 96.2 | 29 / 35 | 7394 |
| 3 | 1 | 68.8 | 80.6 | 23 / 35 | 6258 |
| 4 | 1 | 70.4 | 84.8 | 27 / 35 | 6520 |
| 5 | 1 | 70.9 | 89.5 | 26 / 35 | 6363 |
| 6 | 1 | 72.5 | 93.3 | 26 / 35 | 7159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 85% |
| stelo.SoJNanoMelee 1.1 | 26 | 96% |
| tvv.micro.Antares 1.1.1 | 25 | 92% |
| tj.zombie1n 1.0.1 | 19 | 84% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 93% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 41% | 81 |
| tvv.micro.Antares 1.1.1 | 8 | 15% | 46 |
| tj.zombie1n 1.0.1 | 6 | 11% | 10 |
| stelo.SoJNanoMelee 1.1 | 4 | 7% | 22 |
| sample.VelociRobot 1.0 | 4 | 7% | 9 |
| yk.JahMicro 1.0 | 4 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 11 |
| repositorio.NanoStep 1.0 | 1 | 2% | 1 |

## Melee bench: F05

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.4 | 97 / 210 | 3.40 | 16.5% | 28920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 16.5% | 97 |
| oog.melee.Corsair 1.0 | 2.7 | 12.3% | 26 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.2% | 22 |
| sam.Samspin 1.0 | 4.8 | 10.0% | 15 |
| EBBU.Sim2 1.02 | 6.5 | 9.1% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 8.6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.7 | 18 / 35 | 4995 |
| 2 | 1 | 63.4 | 70.8 | 14 / 35 | 4660 |
| 3 | 1 | 62.5 | 67.9 | 14 / 35 | 4761 |
| 4 | 1 | 65.6 | 78.1 | 16 / 35 | 4853 |
| 5 | 1 | 67.3 | 80.0 | 20 / 35 | 5395 |
| 6 | 1 | 61.4 | 63.8 | 15 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 48 | 83% |
| oog.melee.Corsair 1.0 | 30 | 60% |
| ahf.NanoAndrew .4 | 22 | 77% |
| EBBU.Sim2 1.02 | 6 | 100% |
| sam.Samspin 1.0 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 20 | 17% | 54 |
| oog.melee.Corsair 1.0 | 19 | 17% | 42 |
| ahf.NanoAndrew .4 | 19 | 17% | 36 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 19 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 15 |
| sam.Samspin 1.0 | 9 | 8% | 14 |
| EBBU.Sim2 1.02 | 7 | 6% | 10 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 141 / 210 | 2.25 | 19.3% | 32770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.3% | 141 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.1% | 23 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.2% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.4% | 15 |
| arthord.NanoSatanMelee Beta | 5.3 | 9.3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 4 |
| fm.claire 1.7 | 6.7 | 7.9% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.1% | 6 |
| pa.Improved 1.0 | 9.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 23 / 35 | 5264 |
| 2 | 1 | 71.1 | 93.7 | 28 / 35 | 5591 |
| 3 | 1 | 66.0 | 78.7 | 17 / 35 | 5082 |
| 4 | 1 | 68.3 | 87.0 | 21 / 35 | 5312 |
| 5 | 1 | 68.3 | 82.5 | 23 / 35 | 5500 |
| 6 | 1 | 71.4 | 93.3 | 29 / 35 | 6021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 84% |
| oog.melee.CapuletDroid 1.1 | 36 | 100% |
| gh.nano.Grofvuil 0.2 | 20 | 95% |
| arthord.NanoSatanMelee Beta | 18 | 83% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| sample.SpinBot 1.0 | 6 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 26% | 67 |
| gh.nano.Grofvuil 0.2 | 16 | 23% | 31 |
| oog.melee.CapuletDroid 1.1 | 10 | 14% | 46 |
| arthord.NanoSatanMelee Beta | 10 | 14% | 26 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 15 |
| sample.SpinBot 1.0 | 4 | 6% | 8 |
| fm.claire 1.7 | 4 | 6% | 8 |
| pa.Improved 1.0 | 1 | 1% | 2 |
| kurios.DOSexe .9b | 0 | 0% | 7 |

## Melee bench: F07

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 83.5 | 111 / 210 | 2.49 | 19.0% | 36437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.0% | 111 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.3% | 31 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.4% | 23 |
| mz.MicroGodMelee 1 | 3.7 | 12.6% | 30 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.0 | 6.9% | 5 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.9 | 20 / 35 | 6265 |
| 2 | 1 | 69.0 | 83.5 | 19 / 35 | 6264 |
| 3 | 1 | 68.9 | 83.8 | 19 / 35 | 6058 |
| 4 | 1 | 68.4 | 83.8 | 18 / 35 | 5864 |
| 5 | 1 | 67.3 | 76.5 | 15 / 35 | 6020 |
| 6 | 1 | 68.8 | 84.4 | 20 / 35 | 5966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 89% |
| mz.MicroGodMelee 1 | 39 | 64% |
| gh.micro.Gruweltje 0.7 | 31 | 68% |
| DBall.Anarchy 0.1 | 10 | 100% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 30 | 30% | 54 |
| gh.micro.Gruweltje 0.7 | 25 | 25% | 57 |
| spinnercat.micro.Tyger 0.1 | 25 | 25% | 52 |
| DBall.Anarchy 0.1 | 5 | 5% | 16 |
| el.JumpShoot 0.2 | 5 | 5% | 6 |
| acogdev.alpha 0.2 | 4 | 4% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 11 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 75.8 | 119 / 210 | 3.18 | 17.7% | 33370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.7% | 119 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 32 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 25 |
| germ.TheMind .2 | 5.5 | 9.1% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.5 | 9.0% | 8 |
| awesomeness.Elite 1.0 | 5.7 | 8.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 4 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.1% | 7 |
| sample.Crazy 1.0 | 9.0 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 79.0 | 21 / 35 | 6113 |
| 2 | 1 | 64.8 | 71.1 | 15 / 35 | 5586 |
| 3 | 1 | 64.6 | 70.5 | 17 / 35 | 5040 |
| 4 | 1 | 65.8 | 71.7 | 20 / 35 | 5479 |
| 5 | 1 | 66.5 | 74.9 | 23 / 35 | 5125 |
| 6 | 1 | 70.0 | 87.3 | 23 / 35 | 6027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 91% |
| germ.TheMind .2 | 11 | 82% |
| stelo.UntouchableNano 1.3 | 9 | 67% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |

Hadur died in 91 of 210 rounds, at a mean tick of 442. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 44% | 99 |
| stelo.UntouchableNano 1.3 | 11 | 12% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 11% | 30 |
| awesomeness.Elite 1.0 | 9 | 10% | 18 |
| germ.TheMind .2 | 8 | 9% | 16 |
| lrem.micro.MoggFanatic 0.2 | 8 | 9% | 12 |
| mym.EdgeStalker 1.0 | 3 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 8 |

## Melee bench: F09

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.3 | 143 / 210 | 2.14 | 19.6% | 30697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 19.6% | 143 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.5% | 9 |
| maribo.IotaCT 1.1 | 4.2 | 10.5% | 6 |
| timmit.nano.TimDog 0.33 | 5.2 | 10.0% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 3 |
| spinnercat.Omen 1.0 | 7.2 | 8.4% | 3 |
| ratosh.Wesco 1.4 | 8.2 | 8.2% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.9% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 23 / 35 | 4996 |
| 2 | 1 | 68.2 | 78.7 | 22 / 35 | 5159 |
| 3 | 1 | 68.8 | 87.9 | 23 / 35 | 4786 |
| 4 | 1 | 70.7 | 86.7 | 25 / 35 | 5245 |
| 5 | 1 | 70.4 | 91.1 | 25 / 35 | 4974 |
| 6 | 1 | 71.0 | 91.4 | 25 / 35 | 5537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 73 | 86% |
| nz.jdc.nano.GridFu 1.0 | 25 | 100% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| maribo.IotaCT 1.1 | 12 | 92% |
| timmit.nano.TimDog 0.33 | 12 | 75% |
| ratosh.Wesco 1.4 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 75% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 16 | 23% | 26 |
| rz.HawkOnFire 0.1 | 15 | 22% | 57 |
| ratosh.Wesco 1.4 | 10 | 14% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 40 |
| maribo.IotaCT 1.1 | 6 | 9% | 24 |
| stelo.PatternRobot 1.0 | 6 | 9% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 9 |
| spinnercat.Omen 1.0 | 3 | 4% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 90.7 | 175 / 210 | 1.84 | 21.7% | 40539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.7% | 175 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.7% | 8 |
| baal.nano.N 1.42 | 2.8 | 11.1% | 7 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.7% | 3 |
| zyx.micro.Ant 1.1 | 5.7 | 8.9% | 10 |
| sanja.First 0.1 | 6.3 | 8.8% | 3 |
| cvt.Firsty 1.0 | 7.2 | 8.0% | 3 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 0 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.6% | 1 |
| sample.RamFire 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 88.3 | 28 / 35 | 6546 |
| 2 | 1 | 71.3 | 91.4 | 31 / 35 | 6327 |
| 3 | 1 | 72.6 | 94.6 | 31 / 35 | 6708 |
| 4 | 1 | 71.1 | 87.9 | 29 / 35 | 6708 |
| 5 | 1 | 72.3 | 92.4 | 29 / 35 | 7093 |
| 6 | 1 | 71.7 | 89.5 | 27 / 35 | 7157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 100% |
| baal.nano.N 1.42 | 32 | 97% |
| sanja.First 0.1 | 30 | 97% |
| cvt.Firsty 1.0 | 26 | 96% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 16 | 88% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 489. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 23% | 31 |
| baal.nano.N 1.42 | 6 | 17% | 36 |
| tvv.nano.Polaris 1.2 | 4 | 11% | 55 |
| sample.RamFire 1.0 | 4 | 11% | 6 |
| cvt.Firsty 1.0 | 3 | 9% | 25 |
| squidM.TentalceMeleeNano 1.1 | 3 | 9% | 12 |
| amk.Punbot.Punbot 0.01 | 3 | 9% | 5 |
| sanja.First 0.1 | 2 | 6% | 24 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 14 |

## Melee bench: F11

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.6 | 89 / 210 | 3.73 | 16.0% | 32597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.2 | 16.0% | 89 |
| kc.micro.Figment 1.0 | 2.2 | 14.2% | 51 |
| cs.Wren 1.0 | 3.2 | 12.7% | 22 |
| mz.Cork 0.1 | 4.3 | 11.2% | 18 |
| js.PinBall 1.6 | 4.5 | 11.1% | 15 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 9 |
| evd.X1 0.01 | 6.5 | 8.3% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.6 | 17 / 35 | 5313 |
| 2 | 1 | 64.6 | 69.5 | 16 / 35 | 5727 |
| 3 | 2 | 60.7 | 60.0 | 10 / 35 | 5184 |
| 4 | 1 | 65.2 | 71.4 | 15 / 35 | 5860 |
| 5 | 1 | 65.6 | 76.8 | 18 / 35 | 5200 |
| 6 | 1 | 61.1 | 59.4 | 13 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 77% |
| cs.Wren 1.0 | 22 | 77% |
| js.PinBall 1.6 | 10 | 70% |
| mz.Cork 0.1 | 9 | 67% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 2 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 41% | 102 |
| cs.Wren 1.0 | 19 | 16% | 32 |
| js.PinBall 1.6 | 13 | 11% | 20 |
| joe.ADinosaur 1.0 | 12 | 10% | 12 |
| mz.Cork 0.1 | 10 | 8% | 15 |
| evd.X1 0.01 | 10 | 8% | 12 |
| PSW.Relentless 0.1 | 5 | 4% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.3 | 131 / 210 | 2.59 | 18.8% | 30122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.8% | 131 |
| myl.nano.Graviton 1.10 | 2.5 | 12.0% | 26 |
| ntc.Opposite 1.5 | 3.5 | 11.2% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.6% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 5 |
| disan.Chair 2.2.0 | 6.8 | 8.6% | 8 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 5.7% | 3 |
| pbg.R2D2 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 23 / 35 | 4880 |
| 2 | 1 | 68.1 | 81.3 | 22 / 35 | 5098 |
| 3 | 1 | 65.9 | 74.9 | 18 / 35 | 4835 |
| 4 | 1 | 68.0 | 83.5 | 19 / 35 | 4927 |
| 5 | 1 | 68.3 | 83.2 | 23 / 35 | 5156 |
| 6 | 1 | 69.6 | 86.0 | 26 / 35 | 5226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 43 | 93% |
| myl.nano.Graviton 1.10 | 36 | 86% |
| ntc.Opposite 1.5 | 19 | 84% |
| disan.Chair 2.2.0 | 15 | 87% |
| DBall.NUKE 0.1 | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| donjezza.Muncho 1.0 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 21 | 26% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 19% | 24 |
| myl.nano.Graviton 1.10 | 13 | 16% | 44 |
| ntc.Opposite 1.5 | 10 | 13% | 23 |
| stelo.AreaTargetingBot 1.1 | 8 | 10% | 33 |
| disan.Chair 2.2.0 | 7 | 9% | 23 |
| DBall.NUKE 0.1 | 4 | 5% | 14 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 72.6 | 79 / 210 | 3.46 | 15.6% | 26476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.5 | 15.6% | 79 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 47 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.4% | 17 |
| yagami.Tidus 0.11 | 5.0 | 11.7% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 74.3 | 14 / 35 | 4506 |
| 2 | 2 | 64.3 | 73.0 | 10 / 35 | 4276 |
| 3 | 1 | 64.6 | 74.3 | 15 / 35 | 4441 |
| 4 | 1 | 64.6 | 72.7 | 15 / 35 | 4457 |
| 5 | 3 | 60.6 | 61.3 | 8 / 35 | 4165 |
| 6 | 1 | 66.5 | 80.3 | 17 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 29 | 62% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 96% |
| kawigi.micro.Shiz 1.1 | 21 | 95% |
| yagami.Tidus 0.11 | 12 | 75% |
| ejb.Polaris 1.0.1 | 10 | 90% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 44% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 15% | 43 |
| yagami.Tidus 0.11 | 17 | 13% | 21 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 30 |
| ejb.Polaris 1.0.1 | 8 | 6% | 20 |
| stelo.MirrorNano 1.3 | 6 | 5% | 6 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.9 | 135 / 210 | 2.63 | 18.1% | 28708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 18.1% | 135 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 16 |
| ratosh.Nobo 0.21 | 3.7 | 11.3% | 11 |
| wee.Gem 1.8.4 | 3.7 | 11.6% | 20 |
| wompi.Quokka 1.6 | 4.7 | 10.9% | 8 |
| m3thos.Eva00 1.1 | 5.3 | 10.3% | 14 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.4% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 75.6 | 23 / 35 | 4543 |
| 2 | 1 | 65.4 | 77.1 | 20 / 35 | 4466 |
| 3 | 1 | 66.8 | 80.3 | 19 / 35 | 5050 |
| 4 | 1 | 68.4 | 85.4 | 25 / 35 | 4901 |
| 5 | 1 | 69.5 | 91.7 | 23 / 35 | 5076 |
| 6 | 1 | 67.1 | 81.0 | 25 / 35 | 4672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 90% |
| wee.Gem 1.8.4 | 42 | 95% |
| wompi.Quokka 1.6 | 20 | 85% |
| ratosh.Nobo 0.21 | 16 | 94% |
| m3thos.Eva00 1.1 | 14 | 86% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 434. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 23% | 59 |
| wee.Gem 1.8.4 | 13 | 17% | 60 |
| bayen.UbaMicro 1.4 | 10 | 13% | 13 |
| ratosh.Nobo 0.21 | 9 | 12% | 24 |
| maribo.FollowFire 1 | 7 | 9% | 9 |
| wompi.Quokka 1.6 | 6 | 8% | 21 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 9 |
| m3thos.Eva00 1.1 | 4 | 5% | 9 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 82.1 | 116 / 210 | 2.61 | 20.2% | 44659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 20.2% | 116 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 71 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 15 |
| ayk.WallHugger 1.0 | 4.2 | 10.1% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.6% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.8% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 6.1% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 86.0 | 23 / 35 | 7745 |
| 2 | 1 | 71.2 | 82.9 | 17 / 35 | 7700 |
| 3 | 1 | 69.9 | 76.5 | 16 / 35 | 7471 |
| 4 | 1 | 70.1 | 81.6 | 17 / 35 | 6930 |
| 5 | 1 | 72.6 | 86.7 | 23 / 35 | 7676 |
| 6 | 1 | 70.2 | 79.0 | 20 / 35 | 7137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 103 | 78% |
| mz.NanoGod 2.02 | 12 | 50% |
| ayk.WallHugger 1.0 | 9 | 100% |
| exauge.GateKeeper 1.1.121g | 9 | 100% |
| drd.Dreadknoght 0.9 | 9 | 89% |
| stelo.PianistNano 1.2 | 4 | 75% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 47% | 128 |
| mz.NanoGod 2.02 | 29 | 31% | 40 |
| ayk.WallHugger 1.0 | 6 | 6% | 15 |
| exauge.GateKeeper 1.1.121g | 5 | 5% | 10 |
| stelo.PianistNano 1.2 | 5 | 5% | 6 |
| stuff.Vlad 0.1 | 4 | 4% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.6 | 106 / 210 | 3.29 | 17.1% | 30174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.1% | 106 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 24 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.9% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.2% | 26 |
| bvh.micro.Freya 0.3 | 4.5 | 10.8% | 17 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.4% | 4 |
| conscience.Electron 1.3g | 7.2 | 7.8% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.7% | 11 |
| dl.BetterWalls 1.0 | 9.2 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.6 | 20 / 35 | 5023 |
| 2 | 1 | 67.2 | 79.4 | 19 / 35 | 5417 |
| 3 | 1 | 64.4 | 69.5 | 18 / 35 | 4844 |
| 4 | 1 | 62.8 | 66.7 | 10 / 35 | 4905 |
| 5 | 1 | 67.8 | 81.3 | 25 / 35 | 4958 |
| 6 | 1 | 64.2 | 69.8 | 14 / 35 | 5027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 35 | 77% |
| dummy.micro.Sparrow 2.5 | 27 | 93% |
| bvh.micro.Freya 0.3 | 18 | 78% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 24% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 52 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 34 |
| bvh.micro.Freya 0.3 | 12 | 12% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 12% | 14 |
| conscience.Electron 1.3g | 10 | 10% | 13 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 15 |
| dl.BetterWalls 1.0 | 6 | 6% | 8 |

## Melee bench: F17

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.5 | 152 / 210 | 2.12 | 21.5% | 43039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 21.5% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.7% | 20 |
| sul.Lunar 1.1 | 3.3 | 11.4% | 9 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 12 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.5% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 9 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.9% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.0% | 4 |
| sample.Corners 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 91.7 | 25 / 35 | 7607 |
| 2 | 1 | 72.7 | 90.2 | 29 / 35 | 7422 |
| 3 | 1 | 71.7 | 85.4 | 26 / 35 | 7230 |
| 4 | 1 | 72.9 | 91.7 | 26 / 35 | 7622 |
| 5 | 1 | 69.6 | 81.6 | 21 / 35 | 6507 |
| 6 | 1 | 70.5 | 84.4 | 25 / 35 | 6651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 52 | 94% |
| sul.Lunar 1.1 | 47 | 98% |
| supersample.SuperBoxBot 1.0 | 28 | 89% |
| dsw.StaticD 1.0 | 12 | 33% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 17 | 29% | 68 |
| supersample.SuperBoxBot 1.0 | 17 | 29% | 40 |
| dsw.StaticD 1.0 | 11 | 19% | 17 |
| sample.Corners 1.0 | 5 | 9% | 9 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 10 |
| sul.Lunar 1.1 | 2 | 3% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTB 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 75.5 | 95 / 210 | 3.20 | 17.4% | 36651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTB 0.1 | 1.0 | 17.4% | 95 |
| radnor.DoctorBob 1.42 | 2.2 | 14.0% | 35 |
| mld.Wisdom 1.0 | 3.3 | 12.6% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.7% | 28 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 3 |
| amz.NanoClone 1.41 | 5.8 | 9.3% | 10 |
| sample.Walls 1.0 | 6.8 | 8.0% | 12 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 1 |
| GarmBox.Oranges 1.0 | 8.5 | 6.7% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 79.0 | 19 / 35 | 5758 |
| 2 | 1 | 64.5 | 68.6 | 13 / 35 | 5857 |
| 3 | 1 | 67.9 | 78.1 | 15 / 35 | 6675 |
| 4 | 1 | 66.8 | 77.1 | 15 / 35 | 6097 |
| 5 | 1 | 65.6 | 74.0 | 14 / 35 | 5954 |
| 6 | 1 | 67.2 | 76.2 | 19 / 35 | 6310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 45 | 80% |
| radnor.DoctorBob 1.42 | 33 | 70% |
| mld.Wisdom 1.0 | 20 | 55% |
| jangs.ns51 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| amz.NanoClone 1.41 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 75% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 33% | 48 |
| radnor.DoctorBob 1.42 | 27 | 23% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 15% | 54 |
| KiraNL.Chupacabra 0.4 | 13 | 11% | 19 |
| amz.NanoClone 1.41 | 8 | 7% | 8 |
| GarmBox.Oranges 1.0 | 6 | 5% | 10 |
| jangs.ns51 1.0 | 3 | 3% | 12 |
| sample.Walls 1.0 | 3 | 3% | 7 |

