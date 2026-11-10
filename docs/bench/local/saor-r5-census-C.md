# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 91.7 | 162 / 210 | 1.75 | 22.2% | 44288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.2% | 162 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 12 |
| mz.AntiGrav 1.0 | 3.0 | 13.4% | 13 |
| mld.Infinity 2.2 | 3.3 | 13.3% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 5 |
| GarmBox.Oranges 1.0 | 6.3 | 6.9% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 3 |
| sample.Target 1.0 | 9.3 | 3.4% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 92.1 | 27 / 35 | 7608 |
| 2 | 1 | 73.6 | 92.1 | 28 / 35 | 7273 |
| 3 | 1 | 74.6 | 94.0 | 29 / 35 | 7923 |
| 4 | 1 | 71.8 | 88.6 | 23 / 35 | 7133 |
| 5 | 1 | 73.7 | 94.3 | 29 / 35 | 7422 |
| 6 | 1 | 72.4 | 89.2 | 26 / 35 | 6929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 97% |
| mld.Infinity 2.2 | 50 | 84% |
| radnor.DoctorBob 1.42 | 42 | 86% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 42% | 83 |
| mld.Infinity 2.2 | 11 | 23% | 19 |
| mz.AntiGrav 1.0 | 7 | 15% | 71 |
| amz.NanoClone 1.41 | 6 | 13% | 10 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| sample.Walls 1.0 | 1 | 2% | 11 |
| jangs.ns51 1.0 | 1 | 2% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.9 | 128 / 210 | 2.45 | 18.3% | 30278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.3% | 128 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.3% | 41 |
| mld.DustBunny 3.8 | 2.5 | 13.8% | 21 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 9.1% | 5 |
| zyx.nano.Ant 1.1 | 6.8 | 7.9% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.1% | 6 |
| fullsail.SweetTea 1.1 | 7.8 | 7.3% | 6 |
| bzdp.BoxCar 2.0 | 8.5 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.6 | 22 / 35 | 5142 |
| 2 | 1 | 64.5 | 64.1 | 15 / 35 | 5389 |
| 3 | 1 | 68.1 | 84.8 | 23 / 35 | 4836 |
| 4 | 1 | 68.4 | 89.2 | 22 / 35 | 4922 |
| 5 | 1 | 69.4 | 90.2 | 27 / 35 | 5160 |
| 6 | 1 | 67.9 | 86.3 | 19 / 35 | 4829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 74% |
| mld.DustBunny 3.8 | 56 | 84% |
| djdjdj.NanoSkunk10 1.0 | 11 | 91% |
| fullsail.SweetTea 1.1 | 9 | 78% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| maribo.melee.BMV 0.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 33% | 83 |
| mld.DustBunny 3.8 | 21 | 26% | 59 |
| maribo.melee.BMV 0.1 | 8 | 10% | 15 |
| cs.Grudge 1.0 | 7 | 9% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 7% | 9 |
| fullsail.SweetTea 1.1 | 4 | 5% | 13 |
| zyx.nano.Ant 1.1 | 4 | 5% | 7 |
| bzdp.BoxCar 2.0 | 3 | 4% | 3 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 14 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 88.8 | 158 / 210 | 2.01 | 20.9% | 36679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.9% | 158 |
| myl.micro.Troodon 1.10 | 2.2 | 13.7% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 6 |
| fm.mammillarias 1.3 | 5.7 | 8.9% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 2 |
| sample.Fire 1.0 | 9.2 | 5.2% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 87.9 | 24 / 35 | 6257 |
| 2 | 1 | 72.0 | 90.2 | 28 / 35 | 6520 |
| 3 | 1 | 71.5 | 90.8 | 28 / 35 | 6166 |
| 4 | 1 | 71.2 | 88.3 | 24 / 35 | 6416 |
| 5 | 1 | 70.6 | 87.3 | 27 / 35 | 5740 |
| 6 | 1 | 70.3 | 88.3 | 27 / 35 | 5580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 92% |
| cb.nano.Insomnia 1.0 | 24 | 88% |
| myl.nano.KomoriNinja 1.1 | 23 | 100% |
| sp.Nanos.Ember 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 30% | 39 |
| myl.micro.Troodon 1.10 | 11 | 21% | 67 |
| cb.nano.Insomnia 1.0 | 10 | 19% | 11 |
| myl.nano.KomoriNinja 1.1 | 4 | 8% | 40 |
| sp.Nanos.Ember 1.1 | 4 | 8% | 19 |
| fm.mammillarias 1.3 | 4 | 8% | 11 |
| cs.sheldor.Talon 1.1 | 2 | 4% | 16 |
| sample.Tracker 1.0 | 2 | 4% | 3 |
| sample.Fire 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 89.8 | 164 / 210 | 1.91 | 21.3% | 40256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.3% | 164 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.5% | 14 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.8% | 10 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 5 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.9% | 1 |
| yk.JahMicro 1.0 | 6.3 | 8.5% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 7.9% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 90.8 | 29 / 35 | 6565 |
| 2 | 1 | 72.6 | 93.7 | 31 / 35 | 7161 |
| 3 | 1 | 70.9 | 89.2 | 25 / 35 | 6533 |
| 4 | 1 | 71.1 | 88.3 | 26 / 35 | 6713 |
| 5 | 1 | 72.4 | 93.7 | 28 / 35 | 7230 |
| 6 | 1 | 69.1 | 83.5 | 25 / 35 | 6054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 93% |
| stelo.SoJNanoMelee 1.1 | 50 | 92% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| tj.zombie1n 1.0.1 | 16 | 94% |
| yk.JahMicro 1.0 | 12 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 36% | 81 |
| stelo.SoJNanoMelee 1.1 | 10 | 21% | 37 |
| tvv.micro.Antares 1.1.1 | 7 | 15% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 11% | 8 |
| yk.JahMicro 1.0 | 3 | 6% | 14 |
| tj.zombie1n 1.0.1 | 3 | 6% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 18 |
| repositorio.NanoStep 1.0 | 1 | 2% | 11 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.4 | 96 / 210 | 3.57 | 16.5% | 30478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.5% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.9% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.3% | 17 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 20 |
| sam.Samspin 1.0 | 5.2 | 9.7% | 15 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 11 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 8.3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 67.0 | 15 / 35 | 4760 |
| 2 | 1 | 66.1 | 76.8 | 20 / 35 | 5232 |
| 3 | 1 | 64.5 | 68.6 | 16 / 35 | 5228 |
| 4 | 1 | 61.5 | 64.1 | 12 / 35 | 4485 |
| 5 | 1 | 68.1 | 83.8 | 20 / 35 | 5564 |
| 6 | 1 | 63.5 | 68.3 | 13 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 36 | 92% |
| oog.melee.Corsair 1.0 | 35 | 60% |
| ahf.NanoAndrew .4 | 20 | 85% |
| EBBU.Sim2 1.02 | 9 | 100% |
| sam.Samspin 1.0 | 9 | 67% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 25 | 22% | 55 |
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 47 |
| ahf.NanoAndrew .4 | 18 | 16% | 38 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 13 |
| robar.nano.Assertive_Melee 0.2 | 11 | 10% | 16 |
| sam.Samspin 1.0 | 7 | 6% | 10 |
| EBBU.Sim2 1.02 | 5 | 4% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.6 | 149 / 210 | 2.12 | 19.4% | 31146 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.4% | 149 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 20 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 9.7% | 17 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.1% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.5% | 4 |
| fm.claire 1.7 | 6.7 | 8.1% | 2 |
| sample.SpinBot 1.0 | 7.8 | 7.2% | 3 |
| pa.Improved 1.0 | 8.8 | 6.4% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.6 | 24 / 35 | 5294 |
| 2 | 1 | 67.9 | 85.4 | 23 / 35 | 4823 |
| 3 | 1 | 68.7 | 87.9 | 23 / 35 | 5223 |
| 4 | 1 | 67.9 | 83.8 | 25 / 35 | 4927 |
| 5 | 1 | 71.2 | 93.0 | 29 / 35 | 5719 |
| 6 | 1 | 68.8 | 86.7 | 25 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 89% |
| oog.melee.CapuletDroid 1.1 | 37 | 78% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| sample.SpinBot 1.0 | 8 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 26% | 83 |
| gh.nano.Grofvuil 0.2 | 14 | 23% | 44 |
| oog.melee.CapuletDroid 1.1 | 13 | 21% | 21 |
| arthord.NanoSatanMelee Beta | 9 | 15% | 19 |
| sample.SpinBot 1.0 | 4 | 6% | 7 |
| fm.claire 1.7 | 3 | 5% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 2% | 8 |
| pa.Improved 1.0 | 1 | 2% | 8 |
| kurios.DOSexe .9b | 0 | 0% | 15 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.6 | 97 / 210 | 2.48 | 18.3% | 33847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.3% | 97 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.1% | 48 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.1% | 18 |
| mz.MicroGodMelee 1 | 3.5 | 13.1% | 42 |
| caimano.Furia_Ceca 0.22 | 5.3 | 8.2% | 3 |
| DBall.Anarchy 0.1 | 5.8 | 8.0% | 2 |
| fire219.CatBot 1.0 | 8.3 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.1% | 1 |
| el.JumpShoot 0.2 | 8.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.0 | 11 / 35 | 5627 |
| 2 | 1 | 69.0 | 87.0 | 16 / 35 | 5706 |
| 3 | 1 | 67.9 | 82.2 | 20 / 35 | 5497 |
| 4 | 1 | 70.2 | 92.4 | 18 / 35 | 5839 |
| 5 | 1 | 68.3 | 83.8 | 18 / 35 | 5740 |
| 6 | 1 | 65.8 | 76.2 | 14 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 94% |
| mz.MicroGodMelee 1 | 46 | 37% |
| gh.micro.Gruweltje 0.7 | 39 | 36% |
| DBall.Anarchy 0.1 | 12 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 42 | 37% | 64 |
| mz.MicroGodMelee 1 | 40 | 35% | 68 |
| spinnercat.micro.Tyger 0.1 | 16 | 14% | 42 |
| acogdev.alpha 0.2 | 6 | 5% | 6 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 8 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 5 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.3 | 129 / 210 | 3.13 | 17.5% | 31588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 129 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.6% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.3% | 30 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.7% | 7 |
| awesomeness.Elite 1.0 | 5.8 | 8.7% | 6 |
| germ.TheMind .2 | 6.0 | 8.9% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 1 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 68.9 | 19 / 35 | 5388 |
| 2 | 1 | 63.7 | 67.0 | 19 / 35 | 4923 |
| 3 | 1 | 67.4 | 77.5 | 22 / 35 | 5631 |
| 4 | 1 | 68.5 | 86.7 | 24 / 35 | 4946 |
| 5 | 1 | 67.1 | 79.7 | 21 / 35 | 5246 |
| 6 | 1 | 67.6 | 78.1 | 24 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 76% |
| qualidafial.MajorDick 1.0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 7 | 71% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 7 | 100% |
| germ.TheMind .2 | 6 | 100% |
| sample.Crazy 1.0 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 40 | 49% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 15% | 34 |
| qualidafial.MajorDick 1.0.1 | 8 | 10% | 16 |
| awesomeness.Elite 1.0 | 8 | 10% | 15 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 12 |
| germ.TheMind .2 | 3 | 4% | 8 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 4 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.3 | 167 / 210 | 1.78 | 20.7% | 30606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.7% | 167 |
| rz.HawkOnFire 0.1 | 2.3 | 13.1% | 8 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.6% | 14 |
| maribo.IotaCT 1.1 | 4.0 | 10.4% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.6% | 0 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.4% | 5 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.4% | 1 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.9 | 32 / 35 | 5419 |
| 2 | 1 | 70.7 | 88.9 | 25 / 35 | 5304 |
| 3 | 1 | 71.7 | 92.4 | 29 / 35 | 5400 |
| 4 | 1 | 67.8 | 82.2 | 21 / 35 | 4319 |
| 5 | 1 | 72.0 | 93.7 | 29 / 35 | 5225 |
| 6 | 1 | 72.1 | 94.9 | 31 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 98% |
| nz.jdc.nano.GridFu 1.0 | 44 | 91% |
| maribo.IotaCT 1.1 | 15 | 100% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| ratosh.Wesco 1.4 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 10 | 23% | 25 |
| stelo.PatternRobot 1.0 | 10 | 23% | 20 |
| nz.jdc.nano.GridFu 1.0 | 9 | 21% | 60 |
| rz.HawkOnFire 0.1 | 5 | 12% | 55 |
| ratosh.Wesco 1.4 | 4 | 9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 5% | 8 |
| spinnercat.Omen 1.0 | 2 | 5% | 5 |
| maribo.IotaCT 1.1 | 1 | 2% | 21 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 95.4 | 186 / 210 | 1.41 | 22.5% | 41296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.5% | 186 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.7% | 13 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 4 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.3% | 0 |
| zyx.micro.Ant 1.1 | 5.3 | 8.8% | 1 |
| squidM.TentalceMeleeNano 1.1 | 5.3 | 8.7% | 0 |
| sanja.First 0.1 | 7.0 | 8.0% | 1 |
| cvt.Firsty 1.0 | 8.2 | 7.2% | 5 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.8 | 29 / 35 | 6474 |
| 2 | 1 | 73.4 | 98.1 | 33 / 35 | 6913 |
| 3 | 1 | 72.0 | 94.6 | 30 / 35 | 6654 |
| 4 | 1 | 73.2 | 95.6 | 31 / 35 | 7226 |
| 5 | 1 | 71.9 | 93.3 | 28 / 35 | 6871 |
| 6 | 1 | 73.9 | 100.0 | 35 / 35 | 7158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 88% |
| cvt.Firsty 1.0 | 32 | 97% |
| baal.nano.N 1.42 | 30 | 97% |
| sanja.First 0.1 | 28 | 100% |
| zyx.micro.Ant 1.1 | 21 | 95% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 10 | 40% | 58 |
| Grystrion.TrackerWO 1.0 | 4 | 16% | 17 |
| cvt.Firsty 1.0 | 3 | 12% | 24 |
| sample.RamFire 1.0 | 3 | 12% | 3 |
| baal.nano.N 1.42 | 2 | 8% | 31 |
| zyx.micro.Ant 1.1 | 1 | 4% | 27 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 14 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 5 |
| sanja.First 0.1 | 0 | 0% | 23 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.4 | 79 / 210 | 3.84 | 15.5% | 31327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 15.5% | 79 |
| kc.micro.Figment 1.0 | 1.7 | 15.3% | 75 |
| cs.Wren 1.0 | 3.2 | 12.3% | 19 |
| js.PinBall 1.6 | 4.3 | 11.3% | 12 |
| mz.Cork 0.1 | 4.8 | 10.8% | 15 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 4 |
| evd.X1 0.01 | 6.7 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.0 | 14 / 35 | 4788 |
| 2 | 1 | 64.8 | 72.7 | 15 / 35 | 5437 |
| 3 | 2 | 63.0 | 69.5 | 10 / 35 | 5483 |
| 4 | 1 | 65.8 | 74.0 | 16 / 35 | 5614 |
| 5 | 1 | 64.7 | 70.8 | 15 / 35 | 5458 |
| 6 | 2 | 59.0 | 56.5 | 9 / 35 | 4547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 53% |
| cs.Wren 1.0 | 22 | 86% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 5 | 60% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 65 | 49% | 110 |
| cs.Wren 1.0 | 15 | 11% | 23 |
| evd.X1 0.01 | 15 | 11% | 17 |
| js.PinBall 1.6 | 13 | 10% | 17 |
| mz.Cork 0.1 | 10 | 8% | 19 |
| joe.ADinosaur 1.0 | 5 | 4% | 10 |
| PSW.Relentless 0.1 | 5 | 4% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.0 | 137 / 210 | 2.71 | 18.6% | 28981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 137 |
| myl.nano.Graviton 1.10 | 2.8 | 11.1% | 19 |
| ntc.Opposite 1.5 | 3.5 | 11.1% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 3 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 8 |
| DBall.NUKE 0.1 | 7.7 | 8.2% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 6.5% | 9 |
| pbg.R2D2 1.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 21 / 35 | 4710 |
| 2 | 1 | 66.8 | 77.1 | 22 / 35 | 4934 |
| 3 | 1 | 67.1 | 77.5 | 21 / 35 | 5136 |
| 4 | 1 | 69.3 | 84.4 | 27 / 35 | 4988 |
| 5 | 1 | 68.4 | 86.7 | 22 / 35 | 4675 |
| 6 | 1 | 67.6 | 81.0 | 24 / 35 | 4538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 94% |
| stelo.AreaTargetingBot 1.1 | 29 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 100% |
| donjezza.Muncho 1.0 | 15 | 93% |
| disan.Chair 2.2.0 | 14 | 71% |
| ntc.Opposite 1.5 | 13 | 100% |
| DBall.NUKE 0.1 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 17 | 23% | 32 |
| stelo.AreaTargetingBot 1.1 | 10 | 14% | 31 |
| ntc.Opposite 1.5 | 10 | 14% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 30 |
| myl.nano.Graviton 1.10 | 8 | 11% | 38 |
| disan.Chair 2.2.0 | 8 | 11% | 20 |
| DBall.NUKE 0.1 | 5 | 7% | 13 |
| donjezza.Muncho 1.0 | 4 | 5% | 18 |
| pbg.R2D2 1.0 | 3 | 4% | 9 |

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 68.6 | 84 / 210 | 3.83 | 15.1% | 25615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 15.1% | 84 |
| oog.melee.Capulet 1.2 | 2.8 | 13.8% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 29 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.0% | 26 |
| yagami.Tidus 0.11 | 5.2 | 10.9% | 6 |
| ejb.Polaris 1.0.1 | 5.3 | 11.2% | 18 |
| stelo.MirrorNano 1.3 | 7.3 | 8.1% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.3% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 64.8 | 15 / 35 | 4193 |
| 2 | 1 | 64.1 | 71.1 | 15 / 35 | 4564 |
| 3 | 1 | 65.0 | 71.4 | 13 / 35 | 4519 |
| 4 | 1 | 64.6 | 72.7 | 16 / 35 | 4215 |
| 5 | 1 | 62.7 | 67.3 | 15 / 35 | 4262 |
| 6 | 2 | 60.8 | 64.1 | 10 / 35 | 3862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 58% |
| kawigi.micro.Shiz 1.1 | 30 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 88% |
| yagami.Tidus 0.11 | 16 | 100% |
| ejb.Polaris 1.0.1 | 8 | 63% |

Hadur died in 126 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 57 | 45% | 83 |
| ejb.Polaris 1.0.1 | 18 | 14% | 28 |
| kawigi.micro.Shiz 1.1 | 15 | 12% | 32 |
| yagami.Tidus 0.11 | 10 | 8% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 24 |
| step.nanoPri 1.0 | 7 | 6% | 8 |
| kurios.DOSexe .9a | 6 | 5% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.0 | 142 / 210 | 2.89 | 17.8% | 28006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.8% | 142 |
| bzdp.Pansy 2.1 | 3.0 | 12.2% | 14 |
| wompi.Quokka 1.6 | 3.5 | 11.2% | 12 |
| ratosh.Nobo 0.21 | 3.8 | 11.0% | 8 |
| wee.Gem 1.8.4 | 4.3 | 11.1% | 22 |
| m3thos.Eva00 1.1 | 5.5 | 10.3% | 10 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 23 / 35 | 4765 |
| 2 | 1 | 66.9 | 80.0 | 26 / 35 | 4628 |
| 3 | 1 | 67.2 | 80.3 | 23 / 35 | 4952 |
| 4 | 1 | 64.7 | 70.2 | 20 / 35 | 4575 |
| 5 | 1 | 65.6 | 79.0 | 25 / 35 | 4003 |
| 6 | 1 | 68.6 | 84.1 | 25 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 91% |
| wee.Gem 1.8.4 | 41 | 93% |
| wompi.Quokka 1.6 | 25 | 100% |
| m3thos.Eva00 1.1 | 17 | 100% |
| ratosh.Nobo 0.21 | 11 | 100% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 13 | 18% | 15 |
| bzdp.Pansy 2.1 | 12 | 17% | 52 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 13% | 12 |
| wompi.Quokka 1.6 | 8 | 11% | 27 |
| m3thos.Eva00 1.1 | 8 | 11% | 22 |
| ratosh.Nobo 0.21 | 6 | 8% | 18 |
| stelo.MyAgileRobot 0.2 | 6 | 8% | 12 |
| wee.Gem 1.8.4 | 5 | 7% | 39 |
| bayen.UbaMicro 1.4 | 4 | 6% | 11 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.1 | 78 / 210 | 2.43 | 19.6% | 45069 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 19.6% | 78 |
| wompi.Wallaby 5.1 | 1.7 | 19.3% | 117 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 10 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 3 |
| stuff.Vlad 0.1 | 6.0 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 6.8% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 88.3 | 11 / 35 | 7851 |
| 2 | 2 | 68.3 | 76.2 | 11 / 35 | 6724 |
| 3 | 1 | 70.3 | 82.5 | 13 / 35 | 7566 |
| 4 | 1 | 71.9 | 87.6 | 17 / 35 | 8032 |
| 5 | 2 | 70.0 | 83.2 | 13 / 35 | 7204 |
| 6 | 1 | 71.2 | 86.7 | 13 / 35 | 7692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 113 | 33% |
| exauge.GateKeeper 1.1.121g | 12 | 83% |
| mz.NanoGod 2.02 | 12 | 92% |
| drd.Dreadknoght 0.9 | 8 | 88% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 94 | 71% | 138 |
| mz.NanoGod 2.02 | 17 | 13% | 35 |
| exauge.GateKeeper 1.1.121g | 7 | 5% | 10 |
| stelo.PianistNano 1.2 | 5 | 4% | 5 |
| ayk.WallHugger 1.0 | 4 | 3% | 7 |
| stuff.Vlad 0.1 | 4 | 3% | 7 |
| drd.Dreadknoght 0.9 | 2 | 2% | 8 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 78.8 | 140 / 210 | 2.90 | 18.1% | 29977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.1% | 140 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 15 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.1% | 13 |
| bvh.micro.Freya 0.3 | 4.3 | 11.0% | 12 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 7 |
| conscience.Electron 1.3g | 6.5 | 8.1% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.4% | 7 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.3 | 27 / 35 | 5171 |
| 2 | 1 | 67.1 | 78.4 | 25 / 35 | 4777 |
| 3 | 1 | 67.3 | 78.1 | 24 / 35 | 5083 |
| 4 | 1 | 66.9 | 77.8 | 22 / 35 | 4899 |
| 5 | 1 | 67.7 | 81.9 | 23 / 35 | 5095 |
| 6 | 1 | 64.8 | 70.5 | 19 / 35 | 4952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 96% |
| dummy.micro.Sparrow 2.5 | 39 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 32 | 94% |
| bvh.micro.Freya 0.3 | 16 | 88% |
| stelo.MirrorMicro 1.0 | 8 | 75% |

Hadur died in 70 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 15 | 21% | 15 |
| voidious.micro.BlitzBat 1.05 | 12 | 17% | 53 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 13% | 47 |
| conscience.Electron 1.3g | 9 | 13% | 11 |
| dl.BetterWalls 1.0 | 7 | 10% | 16 |
| dummy.micro.Sparrow 2.5 | 6 | 9% | 40 |
| stelo.MirrorMicro 1.0 | 6 | 9% | 16 |
| bvh.micro.Freya 0.3 | 6 | 9% | 11 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 89.7 | 170 / 210 | 1.92 | 21.9% | 42696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.9% | 170 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 11 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 6 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.5% | 4 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 2 |
| sample.Corners 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.4 | 29 / 35 | 7421 |
| 2 | 1 | 73.8 | 96.8 | 31 / 35 | 7311 |
| 3 | 1 | 70.0 | 81.3 | 24 / 35 | 6690 |
| 4 | 1 | 72.5 | 89.8 | 31 / 35 | 7121 |
| 5 | 1 | 71.3 | 87.0 | 28 / 35 | 6801 |
| 6 | 1 | 72.4 | 91.1 | 27 / 35 | 7352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 54 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 47 | 94% |
| supersample.SuperBoxBot 1.0 | 27 | 96% |
| dsw.StaticD 1.0 | 15 | 67% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 10 | 90% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 12 | 29% | 31 |
| dsw.StaticD 1.0 | 10 | 24% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 22% | 59 |
| sul.Lunar 1.1 | 3 | 7% | 56 |
| sample.MyFirstRobot 1.0 | 2 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 5% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 5% | 4 |
| sample.Corners 1.0 | 1 | 2% | 7 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 11 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 82.0 | 123 / 210 | 2.62 | 18.9% | 38389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.9% | 123 |
| radnor.DoctorBob 1.42 | 2.3 | 13.0% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.1% | 17 |
| mld.Wisdom 1.0 | 4.0 | 11.1% | 13 |
| amz.NanoClone 1.41 | 5.3 | 9.4% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.9% | 10 |
| sample.Walls 1.0 | 7.3 | 7.9% | 6 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.2 | 16 / 35 | 5764 |
| 2 | 1 | 68.6 | 81.3 | 21 / 35 | 6485 |
| 3 | 1 | 68.9 | 86.0 | 22 / 35 | 5976 |
| 4 | 1 | 68.3 | 83.2 | 21 / 35 | 6261 |
| 5 | 1 | 68.7 | 81.0 | 21 / 35 | 6712 |
| 6 | 1 | 70.2 | 85.4 | 22 / 35 | 7191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 61 | 92% |
| radnor.DoctorBob 1.42 | 35 | 71% |
| mld.Wisdom 1.0 | 19 | 74% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 5 | 60% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 30% | 44 |
| radnor.DoctorBob 1.42 | 21 | 24% | 49 |
| KiraNL.Chupacabra 0.4 | 16 | 18% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 14% | 64 |
| amz.NanoClone 1.41 | 7 | 8% | 11 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 5 |
| sample.Walls 1.0 | 0 | 0% | 10 |

