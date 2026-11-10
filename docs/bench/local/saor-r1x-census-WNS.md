# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.1 | 147 / 210 | 2.07 | 21.2% | 43438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 21.2% | 147 |
| mz.AntiGrav 1.0 | 2.5 | 14.5% | 23 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 21 |
| mld.Infinity 2.2 | 3.7 | 12.5% | 11 |
| amz.NanoClone 1.41 | 4.8 | 10.3% | 4 |
| sample.Walls 1.0 | 6.3 | 7.4% | 2 |
| jangs.ns51 1.0 | 7.3 | 6.5% | 1 |
| GarmBox.Oranges 1.0 | 7.5 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 83.8 | 20 / 35 | 7091 |
| 2 | 1 | 71.9 | 87.6 | 24 / 35 | 7205 |
| 3 | 1 | 72.7 | 91.4 | 28 / 35 | 7165 |
| 4 | 1 | 71.2 | 86.0 | 23 / 35 | 6930 |
| 5 | 1 | 72.0 | 86.0 | 24 / 35 | 7292 |
| 6 | 1 | 73.8 | 93.7 | 28 / 35 | 7755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 94% |
| radnor.DoctorBob 1.42 | 36 | 83% |
| mld.Infinity 2.2 | 31 | 97% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 7 | 86% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 38% | 62 |
| amz.NanoClone 1.41 | 12 | 19% | 18 |
| mz.AntiGrav 1.0 | 11 | 17% | 71 |
| mld.Infinity 2.2 | 5 | 8% | 37 |
| jangs.ns51 1.0 | 5 | 8% | 11 |
| GarmBox.Oranges 1.0 | 4 | 6% | 6 |
| sample.Walls 1.0 | 1 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |

## Melee bench: F02

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 124 / 210 | 2.14 | 18.7% | 31022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 18.7% | 124 |
| mld.DustBunny 3.8 | 2.3 | 14.1% | 27 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.8% | 41 |
| maribo.melee.BMV 0.1 | 4.0 | 10.2% | 0 |
| zyx.nano.Ant 1.1 | 6.2 | 8.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.9% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.1% | 9 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 1 |
| fullsail.SweetTea 1.1 | 8.8 | 5.2% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.9 | 23 / 35 | 5141 |
| 2 | 1 | 68.3 | 87.9 | 19 / 35 | 5308 |
| 3 | 1 | 67.8 | 86.0 | 22 / 35 | 4834 |
| 4 | 1 | 68.4 | 87.6 | 17 / 35 | 5450 |
| 5 | 1 | 67.3 | 83.5 | 17 / 35 | 5039 |
| 6 | 1 | 69.7 | 91.1 | 26 / 35 | 5250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 59 | 81% |
| oog.melee.Mercutio 1.0 | 46 | 67% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 32 | 36% | 79 |
| oog.melee.Mercutio 1.0 | 29 | 33% | 63 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 10% | 23 |
| zyx.nano.Ant 1.1 | 8 | 9% | 9 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
| cs.Grudge 1.0 | 3 | 3% | 3 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 16 |
| maribo.melee.BMV 0.1 | 1 | 1% | 6 |

## Melee bench: F03

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 81.5 | 117 / 210 | 2.66 | 19.1% | 36660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 19.1% | 117 |
| myl.micro.Troodon 1.10 | 2.0 | 14.6% | 43 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.7% | 21 |
| fm.mammillarias 1.3 | 5.5 | 9.5% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 6 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.8% | 0 |
| sp.Nanos.Ember 1.1 | 7.5 | 6.7% | 3 |
| sample.Fire 1.0 | 9.2 | 5.0% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 20 / 35 | 6222 |
| 2 | 1 | 67.5 | 79.0 | 19 / 35 | 5521 |
| 3 | 1 | 69.2 | 80.6 | 21 / 35 | 6106 |
| 4 | 1 | 69.3 | 84.4 | 20 / 35 | 6148 |
| 5 | 1 | 70.4 | 84.8 | 22 / 35 | 6270 |
| 6 | 1 | 67.9 | 76.8 | 15 / 35 | 6393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 73% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| myl.nano.KomoriNinja 1.1 | 17 | 94% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| fm.mammillarias 1.3 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 597. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 30% | 45 |
| fm.mammillarias 1.3 | 19 | 20% | 25 |
| myl.micro.Troodon 1.10 | 18 | 19% | 60 |
| cb.nano.Insomnia 1.0 | 9 | 10% | 14 |
| myl.nano.KomoriNinja 1.1 | 8 | 9% | 33 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 16 |
| sample.Fire 1.0 | 2 | 2% | 7 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.2 | 147 / 210 | 2.06 | 20.8% | 40147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 20.8% | 147 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.0% | 17 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 9.8% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 3 |
| tj.zombie1n 1.0.1 | 6.2 | 8.3% | 5 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.1% | 8 |
| repositorio.NanoStep 1.0 | 8.7 | 6.9% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 94.9 | 30 / 35 | 7076 |
| 2 | 1 | 69.6 | 83.5 | 23 / 35 | 6477 |
| 3 | 1 | 71.2 | 88.9 | 26 / 35 | 6991 |
| 4 | 1 | 69.1 | 84.1 | 21 / 35 | 6274 |
| 5 | 1 | 70.1 | 88.6 | 24 / 35 | 6452 |
| 6 | 1 | 70.8 | 89.2 | 23 / 35 | 6877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 52 | 85% |
| stelo.SoJNanoMelee 1.1 | 48 | 88% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 69% |
| tj.zombie1n 1.0.1 | 13 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 90% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 39% | 77 |
| stelo.SoJNanoMelee 1.1 | 10 | 16% | 30 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 31 |
| tvv.micro.Antares 1.1.1 | 7 | 11% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 9% | 12 |
| tj.zombie1n 1.0.1 | 4 | 6% | 11 |
| yk.JahMicro 1.0 | 4 | 6% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 75.4 | 96 / 210 | 3.21 | 16.8% | 30782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 16.8% | 96 |
| oog.melee.Corsair 1.0 | 2.0 | 12.8% | 38 |
| ahf.NanoAndrew .4 | 3.0 | 12.1% | 28 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.2% | 15 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 14 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 7 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 72.7 | 14 / 35 | 4661 |
| 2 | 1 | 64.9 | 73.3 | 18 / 35 | 5058 |
| 3 | 1 | 66.8 | 81.6 | 16 / 35 | 5396 |
| 4 | 1 | 65.4 | 76.5 | 16 / 35 | 5102 |
| 5 | 1 | 65.9 | 78.1 | 17 / 35 | 5298 |
| 6 | 1 | 63.7 | 70.5 | 15 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 33 | 58% |
| simonton.nano.MeleeSeed 1.8 | 25 | 88% |
| ahf.NanoAndrew .4 | 22 | 77% |
| EBBU.Sim2 1.02 | 14 | 93% |
| sam.Samspin 1.0 | 11 | 91% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 23% | 49 |
| robar.nano.Assertive_Melee 0.2 | 24 | 21% | 32 |
| ahf.NanoAndrew .4 | 20 | 17% | 35 |
| EBBU.Sim2 1.02 | 10 | 9% | 22 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 27 |
| sam.Samspin 1.0 | 9 | 8% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 8% | 9 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 12 |
| sample.TrackFire 1.0 | 2 | 2% | 4 |

## Melee bench: F06

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.3 | 133 / 210 | 2.23 | 19.2% | 32975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 19.2% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 38 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.2% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.1% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 7 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.1% | 6 |
| fm.claire 1.7 | 6.7 | 8.3% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.3% | 2 |
| pa.Improved 1.0 | 9.2 | 6.0% | 4 |
| kurios.DOSexe .9b | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 27 / 35 | 5761 |
| 2 | 1 | 69.6 | 89.2 | 24 / 35 | 5353 |
| 3 | 1 | 69.1 | 85.4 | 23 / 35 | 5741 |
| 4 | 1 | 69.1 | 87.0 | 21 / 35 | 5898 |
| 5 | 1 | 66.4 | 80.0 | 17 / 35 | 5116 |
| 6 | 1 | 67.5 | 83.5 | 21 / 35 | 5106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 84% |
| oog.melee.CapuletDroid 1.1 | 34 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 80% |
| winamp32.micro.MicroMacro 1.0 | 9 | 67% |
| gh.nano.Grofvuil 0.2 | 9 | 100% |
| sample.SpinBot 1.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 75% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 38% | 80 |
| sample.SpinBot 1.0 | 11 | 14% | 15 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 44 |
| gh.nano.Grofvuil 0.2 | 7 | 9% | 22 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 14 |
| fm.claire 1.7 | 6 | 8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 6% | 10 |
| kurios.DOSexe .9b | 3 | 4% | 10 |
| pa.Improved 1.0 | 2 | 3% | 6 |

## Melee bench: F07

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.6 | 95 / 210 | 2.74 | 18.0% | 35008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 18.0% | 95 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.8% | 33 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.0% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 12.6% | 31 |
| DBall.Anarchy 0.1 | 5.0 | 9.0% | 7 |
| caimano.Furia_Ceca 0.22 | 6.5 | 7.6% | 2 |
| acogdev.alpha 0.2 | 7.3 | 6.6% | 4 |
| el.JumpShoot 0.2 | 8.0 | 6.2% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.0% | 5 |
| fire219.CatBot 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.3 | 17 / 35 | 6559 |
| 2 | 1 | 68.6 | 84.4 | 19 / 35 | 5884 |
| 3 | 1 | 67.0 | 81.3 | 14 / 35 | 5419 |
| 4 | 1 | 67.9 | 80.0 | 18 / 35 | 6129 |
| 5 | 1 | 65.5 | 77.1 | 11 / 35 | 5582 |
| 6 | 1 | 67.0 | 79.7 | 16 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 84% |
| mz.MicroGodMelee 1 | 37 | 59% |
| gh.micro.Gruweltje 0.7 | 26 | 69% |
| DBall.Anarchy 0.1 | 7 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 67% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 34 | 30% | 54 |
| mz.MicroGodMelee 1 | 25 | 22% | 44 |
| spinnercat.micro.Tyger 0.1 | 24 | 21% | 63 |
| caimano.Furia_Ceca 0.22 | 15 | 13% | 16 |
| acogdev.alpha 0.2 | 7 | 6% | 12 |
| el.JumpShoot 0.2 | 6 | 5% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 1 |
| DBall.Anarchy 0.1 | 1 | 1% | 8 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |

## Melee bench: F08

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.8 | 111 / 210 | 3.18 | 17.1% | 32088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.2 | 17.1% | 111 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.7% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.6% | 19 |
| germ.TheMind .2 | 4.0 | 10.2% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.7 | 9.1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.7% | 1 |
| awesomeness.Elite 1.0 | 7.0 | 8.0% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.8% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 75.6 | 17 / 35 | 5188 |
| 2 | 1 | 67.2 | 78.7 | 21 / 35 | 5365 |
| 3 | 1 | 66.4 | 76.2 | 19 / 35 | 5562 |
| 4 | 1 | 65.7 | 76.5 | 19 / 35 | 5055 |
| 5 | 1 | 65.2 | 72.7 | 17 / 35 | 5518 |
| 6 | 1 | 66.1 | 75.2 | 18 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 100% |
| germ.TheMind .2 | 14 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 40% | 90 |
| germ.TheMind .2 | 17 | 17% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 12% | 35 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 14 |
| awesomeness.Elite 1.0 | 8 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 13 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |

## Melee bench: F09

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 86.7 | 136 / 210 | 2.20 | 19.4% | 31303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 19.4% | 136 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.7% | 11 |
| maribo.IotaCT 1.1 | 3.7 | 11.2% | 14 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.2% | 6 |
| ratosh.Wesco 1.4 | 6.7 | 8.6% | 7 |
| spinnercat.Omen 1.0 | 8.2 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 8.2 | 7.5% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.5 | 27 / 35 | 5207 |
| 2 | 1 | 68.7 | 84.4 | 18 / 35 | 5013 |
| 3 | 1 | 71.0 | 89.5 | 24 / 35 | 5588 |
| 4 | 1 | 68.7 | 83.5 | 22 / 35 | 4918 |
| 5 | 1 | 69.2 | 84.8 | 22 / 35 | 5243 |
| 6 | 1 | 69.9 | 88.6 | 23 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 62 | 97% |
| nz.jdc.nano.GridFu 1.0 | 28 | 93% |
| stelo.PatternRobot 1.0 | 15 | 80% |
| maribo.IotaCT 1.1 | 14 | 71% |
| timmit.nano.TimDog 0.33 | 11 | 82% |
| ratosh.Wesco 1.4 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Wesco 1.4 | 16 | 22% | 25 |
| timmit.nano.TimDog 0.33 | 15 | 20% | 24 |
| stelo.PatternRobot 1.0 | 14 | 19% | 21 |
| rz.HawkOnFire 0.1 | 10 | 14% | 54 |
| nz.jdc.nano.GridFu 1.0 | 10 | 14% | 43 |
| maribo.IotaCT 1.1 | 6 | 8% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 11 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.4 | 153 / 210 | 2.05 | 20.4% | 38005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 20.4% | 153 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 21 |
| baal.nano.N 1.42 | 3.0 | 11.4% | 10 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 12 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.5% | 3 |
| sanja.First 0.1 | 7.0 | 8.1% | 4 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.8% | 2 |
| cvt.Firsty 1.0 | 8.2 | 7.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.6 | 20 / 35 | 6048 |
| 2 | 1 | 70.9 | 92.4 | 28 / 35 | 6327 |
| 3 | 1 | 69.1 | 83.8 | 24 / 35 | 6380 |
| 4 | 1 | 71.0 | 89.5 | 27 / 35 | 6712 |
| 5 | 1 | 71.1 | 89.5 | 27 / 35 | 6758 |
| 6 | 1 | 70.4 | 93.3 | 27 / 35 | 5780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 93% |
| baal.nano.N 1.42 | 27 | 89% |
| cvt.Firsty 1.0 | 23 | 100% |
| sanja.First 0.1 | 19 | 100% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| zyx.micro.Ant 1.1 | 17 | 82% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 80% |

Hadur died in 59 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 24 | 41% | 39 |
| tvv.nano.Polaris 1.2 | 7 | 12% | 46 |
| baal.nano.N 1.42 | 7 | 12% | 37 |
| Grystrion.TrackerWO 1.0 | 4 | 7% | 25 |
| cvt.Firsty 1.0 | 4 | 7% | 24 |
| sanja.First 0.1 | 4 | 7% | 19 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 12 |
| sample.RamFire 1.0 | 3 | 5% | 4 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 3 |

## Melee bench: F11

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 63.0 | 71 / 210 | 4.33 | 14.2% | 29252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.0% | 67 |
| hadur117.micro.SaorWNS 0.1 | 2.2 | 14.2% | 71 |
| cs.Wren 1.0 | 2.8 | 13.0% | 30 |
| mz.Cork 0.1 | 4.3 | 11.5% | 14 |
| js.PinBall 1.6 | 4.8 | 11.1% | 13 |
| joe.ADinosaur 1.0 | 5.5 | 9.9% | 3 |
| evd.X1 0.01 | 7.0 | 8.3% | 2 |
| donjezza.Jezza 1.0 | 8.5 | 6.0% | 8 |
| jsal.Jsalbot 1.0 | 8.5 | 6.5% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 64.4 | 12 / 35 | 5029 |
| 2 | 1 | 65.5 | 72.7 | 17 / 35 | 5516 |
| 3 | 3 | 58.7 | 56.8 | 12 / 35 | 4378 |
| 4 | 3 | 58.4 | 54.9 | 13 / 35 | 4604 |
| 5 | 1 | 61.6 | 68.3 | 9 / 35 | 4914 |
| 6 | 3 | 59.9 | 61.0 | 8 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 58 | 69% |
| cs.Wren 1.0 | 15 | 73% |
| mz.Cork 0.1 | 12 | 83% |
| js.PinBall 1.6 | 5 | 60% |
| donjezza.Jezza 1.0 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 56 | 40% | 97 |
| joe.ADinosaur 1.0 | 21 | 15% | 23 |
| cs.Wren 1.0 | 16 | 11% | 26 |
| js.PinBall 1.6 | 13 | 9% | 17 |
| mz.Cork 0.1 | 12 | 9% | 20 |
| evd.X1 0.01 | 12 | 9% | 12 |
| PSW.Relentless 0.1 | 5 | 4% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.9 | 118 / 210 | 2.81 | 17.8% | 28185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 17.8% | 118 |
| myl.nano.Graviton 1.10 | 2.7 | 11.8% | 29 |
| ntc.Opposite 1.5 | 3.3 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.4% | 3 |
| DBall.NUKE 0.1 | 7.3 | 8.0% | 5 |
| disan.Chair 2.2.0 | 7.7 | 7.6% | 5 |
| donjezza.Muncho 1.0 | 9.2 | 6.6% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.5 | 22 / 35 | 4695 |
| 2 | 1 | 66.9 | 80.3 | 20 / 35 | 4595 |
| 3 | 1 | 67.7 | 81.9 | 20 / 35 | 5262 |
| 4 | 1 | 62.4 | 68.6 | 13 / 35 | 4359 |
| 5 | 1 | 66.0 | 79.4 | 20 / 35 | 4384 |
| 6 | 1 | 68.5 | 86.7 | 23 / 35 | 4890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 29 | 90% |
| myl.nano.Graviton 1.10 | 28 | 89% |
| ntc.Opposite 1.5 | 20 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| DBall.NUKE 0.1 | 11 | 100% |
| disan.Chair 2.2.0 | 10 | 100% |
| donjezza.Muncho 1.0 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| pbg.R2D2 1.0 | 3 | 67% |

Hadur died in 95 of 210 rounds, at a mean tick of 508. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 26 | 27% | 40 |
| stelo.AreaTargetingBot 1.1 | 17 | 18% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 17 | 18% | 31 |
| ntc.Opposite 1.5 | 15 | 16% | 27 |
| myl.nano.Graviton 1.10 | 11 | 12% | 37 |
| DBall.NUKE 0.1 | 3 | 3% | 9 |
| pbg.R2D2 1.0 | 3 | 3% | 7 |
| donjezza.Muncho 1.0 | 2 | 2% | 11 |
| disan.Chair 2.2.0 | 1 | 1% | 9 |

## Melee bench: F13

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.6 | 68 / 210 | 3.74 | 14.8% | 25592 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.8 | 14.8% | 68 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.6% | 52 |
| oog.melee.Capulet 1.2 | 2.2 | 14.2% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 23 |
| yagami.Tidus 0.11 | 4.8 | 12.0% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 4 |
| stelo.MirrorNano 1.3 | 7.0 | 7.9% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 64.4 | 11 / 35 | 4177 |
| 2 | 1 | 65.0 | 74.0 | 16 / 35 | 4489 |
| 3 | 3 | 60.5 | 65.7 | 8 / 35 | 3963 |
| 4 | 1 | 62.9 | 67.6 | 11 / 35 | 4513 |
| 5 | 3 | 62.6 | 67.6 | 11 / 35 | 4251 |
| 6 | 1 | 65.0 | 78.1 | 11 / 35 | 4199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 74% |
| kawigi.micro.Shiz 1.1 | 22 | 82% |
| yagami.Tidus 0.11 | 12 | 83% |
| ejb.Polaris 1.0.1 | 8 | 88% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 54 | 38% | 69 |
| yagami.Tidus 0.11 | 24 | 17% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 15% | 39 |
| kawigi.micro.Shiz 1.1 | 15 | 11% | 29 |
| ejb.Polaris 1.0.1 | 11 | 8% | 21 |
| kurios.DOSexe .9a | 7 | 5% | 7 |
| step.nanoPri 1.0 | 6 | 4% | 7 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 78.5 | 125 / 210 | 2.93 | 17.2% | 27269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 17.2% | 125 |
| wee.Gem 1.8.4 | 2.3 | 12.5% | 29 |
| bzdp.Pansy 2.1 | 3.3 | 11.7% | 13 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 18 |
| ratosh.Nobo 0.21 | 4.7 | 10.9% | 7 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 12 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.0% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 69.5 | 14 / 35 | 4382 |
| 2 | 1 | 64.5 | 74.3 | 19 / 35 | 4542 |
| 3 | 1 | 66.6 | 78.7 | 22 / 35 | 4738 |
| 4 | 1 | 66.8 | 84.1 | 22 / 35 | 4299 |
| 5 | 1 | 67.7 | 85.7 | 25 / 35 | 4711 |
| 6 | 1 | 66.6 | 78.7 | 23 / 35 | 4597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 50 | 96% |
| bzdp.Pansy 2.1 | 42 | 95% |
| ratosh.Nobo 0.21 | 13 | 85% |
| m3thos.Eva00 1.1 | 13 | 85% |
| wompi.Quokka 1.6 | 12 | 75% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| m3thos.Eva00 1.1 | 13 | 15% | 27 |
| ratosh.Nobo 0.21 | 11 | 13% | 22 |
| wompi.Quokka 1.6 | 11 | 13% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 13% | 12 |
| wee.Gem 1.8.4 | 10 | 11% | 53 |
| bayen.UbaMicro 1.4 | 8 | 9% | 14 |
| stelo.MyAgileRobot 0.2 | 8 | 9% | 11 |
| maribo.FollowFire 1 | 8 | 9% | 9 |
| bzdp.Pansy 2.1 | 7 | 8% | 42 |

## Melee bench: F15

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 86.9 | 129 / 210 | 2.18 | 20.6% | 43729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 20.6% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 23 |
| ayk.WallHugger 1.0 | 4.3 | 10.3% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 3 |
| stuff.Vlad 0.1 | 5.8 | 8.8% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.5% | 2 |
| sample.SittingDuck 1.0 | 9.2 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 82.9 | 21 / 35 | 6825 |
| 2 | 1 | 70.8 | 84.1 | 20 / 35 | 6910 |
| 3 | 1 | 70.6 | 82.2 | 18 / 35 | 7104 |
| 4 | 1 | 73.1 | 89.8 | 26 / 35 | 7505 |
| 5 | 1 | 73.2 | 90.8 | 22 / 35 | 7722 |
| 6 | 1 | 72.5 | 91.4 | 22 / 35 | 7663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 82% |
| mz.NanoGod 2.02 | 13 | 69% |
| exauge.GateKeeper 1.1.121g | 11 | 82% |
| drd.Dreadknoght 0.9 | 7 | 86% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 37% | 126 |
| mz.NanoGod 2.02 | 30 | 37% | 43 |
| exauge.GateKeeper 1.1.121g | 9 | 11% | 15 |
| ayk.WallHugger 1.0 | 6 | 7% | 12 |
| stuff.Vlad 0.1 | 4 | 5% | 7 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.9 | 112 / 210 | 3.17 | 17.1% | 29425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 17.1% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 23 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.0% | 20 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.8% | 18 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.2% | 6 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 5 |
| dl.BetterWalls 1.0 | 8.8 | 6.6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.5 | 18 / 35 | 4815 |
| 2 | 1 | 69.0 | 85.7 | 23 / 35 | 5450 |
| 3 | 1 | 61.8 | 67.0 | 11 / 35 | 4721 |
| 4 | 1 | 66.0 | 75.9 | 21 / 35 | 4804 |
| 5 | 1 | 64.7 | 73.7 | 19 / 35 | 4650 |
| 6 | 1 | 66.2 | 76.5 | 20 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 86% |
| dummy.micro.Sparrow 2.5 | 28 | 89% |
| bvh.micro.Freya 0.3 | 25 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 89% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 50 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 43 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 37 |
| conscience.Electron 1.3g | 11 | 11% | 16 |
| dl.BetterWalls 1.0 | 11 | 11% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 11% | 10 |
| bvh.micro.Freya 0.3 | 8 | 8% | 19 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 18 |

## Melee bench: F17

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.3 | 132 / 210 | 2.41 | 20.1% | 40348 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 20.1% | 132 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.0% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.9% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 12.1% | 22 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 7 |
| dsw.StaticD 1.0 | 5.7 | 8.5% | 7 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.8% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.7% | 1 |
| sample.Corners 1.0 | 9.5 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 77.1 | 15 / 35 | 6838 |
| 2 | 1 | 71.7 | 88.6 | 24 / 35 | 7315 |
| 3 | 1 | 70.8 | 86.7 | 21 / 35 | 6995 |
| 4 | 1 | 70.6 | 86.7 | 26 / 35 | 6469 |
| 5 | 1 | 70.8 | 87.6 | 25 / 35 | 6405 |
| 6 | 1 | 68.5 | 79.0 | 21 / 35 | 6326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 47 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 92% |
| supersample.SuperBoxBot 1.0 | 27 | 85% |
| dsw.StaticD 1.0 | 9 | 56% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| sample.Corners 1.0 | 7 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 32 | 40% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 23% | 58 |
| dsw.StaticD 1.0 | 10 | 12% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 9% | 11 |
| sul.Lunar 1.1 | 4 | 5% | 51 |
| mme.NikeEnhanced 2.0 | 4 | 5% | 11 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 3 |
| sample.Corners 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 77.5 | 102 / 210 | 3.03 | 17.6% | 36735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNS 0.1 | 1.0 | 17.6% | 102 |
| mld.Wisdom 1.0 | 2.7 | 12.7% | 29 |
| radnor.DoctorBob 1.42 | 2.7 | 13.3% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 9 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 10 |
| sample.Walls 1.0 | 7.3 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.5% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.7% | 2 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.2 | 20 / 35 | 5924 |
| 2 | 1 | 65.5 | 76.2 | 17 / 35 | 5497 |
| 3 | 1 | 65.6 | 70.5 | 14 / 35 | 6466 |
| 4 | 1 | 67.0 | 80.0 | 15 / 35 | 6325 |
| 5 | 1 | 66.9 | 74.6 | 17 / 35 | 6409 |
| 6 | 1 | 67.8 | 81.3 | 19 / 35 | 6114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 83% |
| radnor.DoctorBob 1.42 | 28 | 68% |
| mld.Wisdom 1.0 | 18 | 67% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| amz.NanoClone 1.41 | 7 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 30% | 47 |
| radnor.DoctorBob 1.42 | 18 | 17% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 15% | 54 |
| KiraNL.Chupacabra 0.4 | 15 | 14% | 23 |
| amz.NanoClone 1.41 | 15 | 14% | 22 |
| GarmBox.Oranges 1.0 | 5 | 5% | 6 |
| sample.Walls 1.0 | 4 | 4% | 13 |
| jangs.ns51 1.0 | 3 | 3% | 7 |

