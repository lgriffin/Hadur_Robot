# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 91.1 | 162 / 210 | 1.80 | 22.5% | 46512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 22.5% | 162 |
| mz.AntiGrav 1.0 | 2.7 | 14.4% | 17 |
| radnor.DoctorBob 1.42 | 2.7 | 14.2% | 14 |
| mld.Infinity 2.2 | 3.7 | 12.3% | 12 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 3 |
| GarmBox.Oranges 1.0 | 6.7 | 6.5% | 0 |
| sample.Walls 1.0 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 9.5 | 3.7% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 93.0 | 29 / 35 | 7550 |
| 2 | 1 | 74.7 | 95.9 | 28 / 35 | 8274 |
| 3 | 1 | 73.8 | 92.7 | 29 / 35 | 7572 |
| 4 | 1 | 72.9 | 87.9 | 24 / 35 | 7837 |
| 5 | 1 | 72.3 | 85.7 | 27 / 35 | 7263 |
| 6 | 1 | 73.5 | 91.1 | 25 / 35 | 8016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 82 | 94% |
| radnor.DoctorBob 1.42 | 41 | 90% |
| mld.Infinity 2.2 | 28 | 100% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 44% | 66 |
| mz.AntiGrav 1.0 | 11 | 22% | 77 |
| mld.Infinity 2.2 | 6 | 12% | 33 |
| amz.NanoClone 1.41 | 6 | 12% | 11 |
| jangs.ns51 1.0 | 3 | 6% | 8 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.5 | 135 / 210 | 2.03 | 19.4% | 33508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.4% | 135 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 38 |
| mld.DustBunny 3.8 | 2.8 | 13.1% | 15 |
| maribo.melee.BMV 0.1 | 4.5 | 10.2% | 3 |
| zyx.nano.Ant 1.1 | 5.7 | 8.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 9 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 1 |
| fullsail.SweetTea 1.1 | 8.3 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.4 | 20 / 35 | 5460 |
| 2 | 1 | 70.3 | 88.9 | 25 / 35 | 6433 |
| 3 | 1 | 69.5 | 89.8 | 25 / 35 | 5705 |
| 4 | 1 | 68.3 | 85.4 | 21 / 35 | 5138 |
| 5 | 1 | 69.4 | 88.6 | 22 / 35 | 5624 |
| 6 | 1 | 68.6 | 87.0 | 22 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 66 | 91% |
| oog.melee.Mercutio 1.0 | 54 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| maribo.melee.BMV 0.1 | 12 | 75% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 8 | 88% |
| zyx.nano.Ant 1.1 | 4 | 75% |

Hadur died in 75 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 36% | 73 |
| mld.DustBunny 3.8 | 18 | 24% | 68 |
| zyx.nano.Ant 1.1 | 9 | 12% | 14 |
| maribo.melee.BMV 0.1 | 8 | 11% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 7% | 13 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 13 |
| fullsail.SweetTea 1.1 | 2 | 3% | 9 |
| bzdp.BoxCar 2.0 | 2 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.4 | 135 / 210 | 2.50 | 20.0% | 37635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.0% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.4% | 6 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.8% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.1% | 17 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.0% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.5% | 3 |
| sample.Tracker 1.0 | 9.3 | 5.1% | 1 |
| sample.Fire 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 80.6 | 22 / 35 | 6017 |
| 2 | 1 | 70.8 | 84.4 | 23 / 35 | 6799 |
| 3 | 1 | 68.2 | 77.5 | 21 / 35 | 5894 |
| 4 | 1 | 70.3 | 83.8 | 23 / 35 | 6652 |
| 5 | 1 | 70.9 | 88.6 | 24 / 35 | 6246 |
| 6 | 1 | 69.7 | 85.4 | 22 / 35 | 6027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 42 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 71% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 18 | 94% |
| sp.Nanos.Ember 1.1 | 18 | 94% |
| fm.mammillarias 1.3 | 9 | 89% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 26% | 41 |
| cb.nano.Insomnia 1.0 | 15 | 20% | 22 |
| myl.micro.Troodon 1.10 | 14 | 18% | 55 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 36 |
| fm.mammillarias 1.3 | 6 | 8% | 14 |
| sample.Fire 1.0 | 4 | 5% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 24 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 83.8 | 148 / 210 | 2.46 | 20.1% | 38747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.1% | 148 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.7% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.2% | 15 |
| tj.zombie1n 1.0.1 | 6.0 | 8.7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 8.3% | 7 |
| yk.JahMicro 1.0 | 7.3 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 9.2 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.3 | 25 / 35 | 6015 |
| 2 | 1 | 69.8 | 82.5 | 25 / 35 | 6638 |
| 3 | 1 | 69.4 | 81.0 | 24 / 35 | 6531 |
| 4 | 1 | 71.0 | 87.3 | 26 / 35 | 6748 |
| 5 | 1 | 71.2 | 90.8 | 25 / 35 | 6652 |
| 6 | 1 | 68.4 | 79.7 | 23 / 35 | 6163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 95% |
| stelo.SoJNanoMelee 1.1 | 42 | 86% |
| tj.zombie1n 1.0.1 | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 79% |
| yk.JahMicro 1.0 | 8 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 21 | 34% | 81 |
| stelo.SoJNanoMelee 1.1 | 14 | 23% | 37 |
| tvv.micro.Antares 1.1.1 | 10 | 16% | 25 |
| tj.zombie1n 1.0.1 | 4 | 6% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 20 |
| yk.JahMicro 1.0 | 3 | 5% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 12 |
| sample.VelociRobot 1.0 | 3 | 5% | 6 |
| repositorio.NanoStep 1.0 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 67.7 | 96 / 210 | 3.90 | 15.8% | 28725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 15.8% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.2% | 29 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 34 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.8% | 17 |
| sam.Samspin 1.0 | 5.3 | 9.9% | 11 |
| EBBU.Sim2 1.02 | 6.2 | 9.6% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 9.1% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.2 | 8.9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 7.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 76.8 | 19 / 35 | 4742 |
| 2 | 1 | 59.1 | 54.6 | 10 / 35 | 4613 |
| 3 | 1 | 62.7 | 64.4 | 17 / 35 | 4557 |
| 4 | 1 | 67.2 | 77.5 | 21 / 35 | 5552 |
| 5 | 1 | 64.2 | 73.3 | 17 / 35 | 4754 |
| 6 | 1 | 60.7 | 59.7 | 12 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 98% |
| oog.melee.Corsair 1.0 | 23 | 78% |
| ahf.NanoAndrew .4 | 17 | 82% |
| zyx.nano.BacillusComma 1.0 | 8 | 100% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 57 |
| oog.melee.Corsair 1.0 | 18 | 16% | 39 |
| robar.nano.Assertive_Melee 0.2 | 16 | 14% | 16 |
| sam.Samspin 1.0 | 13 | 11% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 11% | 12 |
| ahf.NanoAndrew .4 | 11 | 10% | 28 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 18 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| sample.TrackFire 1.0 | 4 | 4% | 5 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 86.7 | 139 / 210 | 2.20 | 19.7% | 34186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.7% | 139 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.2% | 27 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.1% | 12 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.1% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.6% | 4 |
| fm.claire 1.7 | 6.5 | 8.3% | 4 |
| sample.SpinBot 1.0 | 7.8 | 7.0% | 6 |
| pa.Improved 1.0 | 8.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.2 | 22 / 35 | 5505 |
| 2 | 1 | 69.3 | 87.3 | 25 / 35 | 5289 |
| 3 | 1 | 70.2 | 88.9 | 24 / 35 | 6251 |
| 4 | 1 | 69.0 | 84.4 | 23 / 35 | 5491 |
| 5 | 1 | 69.1 | 87.3 | 23 / 35 | 5584 |
| 6 | 1 | 70.5 | 90.2 | 22 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 83% |
| oog.melee.CapuletDroid 1.1 | 39 | 97% |
| gh.nano.Grofvuil 0.2 | 20 | 85% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| fm.claire 1.7 | 8 | 75% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| pa.Improved 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.SpinBot 1.0 | 3 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 35% | 68 |
| gh.nano.Grofvuil 0.2 | 9 | 13% | 31 |
| arthord.NanoSatanMelee Beta | 8 | 11% | 20 |
| winamp32.micro.MicroMacro 1.0 | 8 | 11% | 15 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 45 |
| fm.claire 1.7 | 6 | 8% | 10 |
| sample.SpinBot 1.0 | 6 | 8% | 10 |
| kurios.DOSexe .9b | 2 | 3% | 8 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.0 | 103 / 210 | 2.71 | 18.2% | 34391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.2% | 103 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.5% | 54 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.4% | 17 |
| mz.MicroGodMelee 1 | 3.5 | 12.3% | 30 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 3 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 0 |
| acogdev.alpha 0.2 | 7.5 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.8% | 3 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 75.6 | 15 / 35 | 5915 |
| 2 | 1 | 66.8 | 80.0 | 15 / 35 | 5318 |
| 3 | 1 | 67.9 | 80.3 | 18 / 35 | 5684 |
| 4 | 1 | 68.9 | 84.8 | 19 / 35 | 5989 |
| 5 | 1 | 67.9 | 83.5 | 20 / 35 | 5449 |
| 6 | 1 | 68.4 | 81.9 | 16 / 35 | 6036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 88% |
| mz.MicroGodMelee 1 | 36 | 67% |
| gh.micro.Gruweltje 0.7 | 27 | 52% |
| DBall.Anarchy 0.1 | 13 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 30 | 28% | 50 |
| mz.MicroGodMelee 1 | 28 | 26% | 53 |
| spinnercat.micro.Tyger 0.1 | 24 | 22% | 60 |
| acogdev.alpha 0.2 | 8 | 7% | 8 |
| el.JumpShoot 0.2 | 7 | 7% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 16 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 70.7 | 108 / 210 | 3.63 | 16.8% | 31238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.8% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.0 | 14.2% | 38 |
| simonton.micro.Sprout 1.1.3 | 3.0 | 12.7% | 28 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.9% | 7 |
| awesomeness.Elite 1.0 | 5.5 | 9.2% | 7 |
| germ.TheMind .2 | 6.0 | 9.2% | 7 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 10 |
| lrem.micro.MoggFanatic 0.2 | 7.3 | 8.2% | 2 |
| sample.Crazy 1.0 | 8.7 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 76.2 | 18 / 35 | 5429 |
| 2 | 1 | 64.0 | 67.9 | 15 / 35 | 5000 |
| 3 | 1 | 63.2 | 61.9 | 14 / 35 | 5434 |
| 4 | 1 | 64.5 | 69.5 | 19 / 35 | 4988 |
| 5 | 1 | 64.7 | 70.2 | 19 / 35 | 4962 |
| 6 | 1 | 67.8 | 78.7 | 23 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 96% |
| germ.TheMind .2 | 12 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| stelo.UntouchableNano 1.3 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 43% | 94 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 14% | 32 |
| stelo.UntouchableNano 1.3 | 10 | 10% | 18 |
| awesomeness.Elite 1.0 | 8 | 8% | 16 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 9 |
| germ.TheMind .2 | 7 | 7% | 18 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 10 |
| sample.Crazy 1.0 | 4 | 4% | 8 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.1 | 154 / 210 | 1.89 | 20.5% | 31609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.5% | 154 |
| rz.HawkOnFire 0.1 | 2.0 | 13.4% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.9% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 9.9% | 2 |
| maribo.IotaCT 1.1 | 4.7 | 10.0% | 7 |
| timmit.nano.TimDog 0.33 | 6.8 | 8.7% | 4 |
| stelo.PatternRobot 1.0 | 7.2 | 8.3% | 7 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.5 | 26 / 35 | 5172 |
| 2 | 1 | 69.7 | 87.6 | 22 / 35 | 5036 |
| 3 | 1 | 70.7 | 90.8 | 27 / 35 | 5192 |
| 4 | 1 | 70.8 | 87.6 | 28 / 35 | 5406 |
| 5 | 1 | 71.2 | 91.7 | 24 / 35 | 5325 |
| 6 | 1 | 71.5 | 93.3 | 27 / 35 | 5478 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 93% |
| nz.jdc.nano.GridFu 1.0 | 31 | 94% |
| stelo.PatternRobot 1.0 | 21 | 81% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 9 | 89% |
| spinnercat.Omen 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| timmit.nano.TimDog 0.33 | 8 | 63% |

Hadur died in 56 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 73 |
| nz.jdc.nano.GridFu 1.0 | 10 | 18% | 43 |
| stelo.PatternRobot 1.0 | 8 | 14% | 25 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 18 |
| ratosh.Wesco 1.4 | 7 | 13% | 19 |
| maribo.IotaCT 1.1 | 5 | 9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 7 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.4 | 179 / 210 | 1.68 | 21.8% | 40304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.8% | 179 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.6% | 10 |
| baal.nano.N 1.42 | 2.7 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.8% | 1 |
| zyx.micro.Ant 1.1 | 5.0 | 9.5% | 9 |
| sanja.First 0.1 | 6.3 | 8.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.9% | 2 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 8.5 | 7.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.7 | 28 / 35 | 6681 |
| 2 | 1 | 72.1 | 93.3 | 31 / 35 | 6888 |
| 3 | 1 | 73.0 | 96.8 | 31 / 35 | 7148 |
| 4 | 1 | 69.8 | 84.4 | 26 / 35 | 6221 |
| 5 | 1 | 71.7 | 93.3 | 31 / 35 | 6516 |
| 6 | 1 | 72.6 | 94.9 | 32 / 35 | 6850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 100% |
| baal.nano.N 1.42 | 34 | 91% |
| cvt.Firsty 1.0 | 26 | 96% |
| sanja.First 0.1 | 25 | 100% |
| Grystrion.TrackerWO 1.0 | 23 | 96% |
| zyx.micro.Ant 1.1 | 21 | 90% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 8 | 26% | 33 |
| baal.nano.N 1.42 | 7 | 23% | 39 |
| Grystrion.TrackerWO 1.0 | 6 | 19% | 22 |
| tvv.nano.Polaris 1.2 | 3 | 10% | 51 |
| cvt.Firsty 1.0 | 3 | 10% | 28 |
| sanja.First 0.1 | 2 | 6% | 22 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 1 |
| sample.RamFire 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.9 | 95 / 210 | 3.35 | 16.7% | 33338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 16.7% | 95 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 56 |
| cs.Wren 1.0 | 3.0 | 13.1% | 23 |
| js.PinBall 1.6 | 3.8 | 11.3% | 16 |
| mz.Cork 0.1 | 5.0 | 10.4% | 8 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 3 |
| evd.X1 0.01 | 7.0 | 7.7% | 5 |
| jsal.Jsalbot 1.0 | 7.7 | 6.9% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 0 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 75.2 | 13 / 35 | 5565 |
| 2 | 1 | 65.4 | 73.0 | 18 / 35 | 5493 |
| 3 | 1 | 66.3 | 78.7 | 15 / 35 | 5357 |
| 4 | 1 | 68.9 | 83.8 | 22 / 35 | 6095 |
| 5 | 2 | 64.3 | 68.9 | 14 / 35 | 5580 |
| 6 | 1 | 62.1 | 63.8 | 13 / 35 | 5248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 73% |
| cs.Wren 1.0 | 36 | 78% |
| js.PinBall 1.6 | 11 | 82% |
| mz.Cork 0.1 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 115 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 42 | 37% | 95 |
| cs.Wren 1.0 | 22 | 19% | 40 |
| evd.X1 0.01 | 16 | 14% | 16 |
| PSW.Relentless 0.1 | 10 | 9% | 10 |
| js.PinBall 1.6 | 9 | 8% | 20 |
| joe.ADinosaur 1.0 | 7 | 6% | 8 |
| mz.Cork 0.1 | 6 | 5% | 17 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.8 | 135 / 210 | 2.46 | 19.0% | 29617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.0% | 135 |
| myl.nano.Graviton 1.10 | 2.8 | 11.6% | 15 |
| ntc.Opposite 1.5 | 3.0 | 11.6% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.8% | 12 |
| disan.Chair 2.2.0 | 7.0 | 8.2% | 7 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.7% | 8 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.6 | 21 / 35 | 4372 |
| 2 | 1 | 67.9 | 80.6 | 24 / 35 | 5100 |
| 3 | 1 | 68.9 | 86.3 | 20 / 35 | 5166 |
| 4 | 1 | 65.4 | 76.2 | 19 / 35 | 4290 |
| 5 | 1 | 70.7 | 91.7 | 26 / 35 | 5251 |
| 6 | 1 | 69.7 | 86.3 | 25 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 85% |
| stelo.AreaTargetingBot 1.1 | 33 | 85% |
| ntc.Opposite 1.5 | 20 | 85% |
| donjezza.Muncho 1.0 | 14 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| disan.Chair 2.2.0 | 13 | 92% |
| DBall.NUKE 0.1 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 2 | 50% |

Hadur died in 75 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 21% | 53 |
| stelo.AreaTargetingBot 1.1 | 13 | 17% | 37 |
| ntc.Opposite 1.5 | 12 | 16% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 15% | 23 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 20 |
| donjezza.Muncho 1.0 | 4 | 5% | 10 |
| pbg.R2D2 1.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 3 | 4% | 12 |
| disan.Chair 2.2.0 | 2 | 3% | 16 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.0 | 89 / 210 | 3.25 | 16.3% | 26918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.3 | 16.3% | 89 |
| oog.melee.Capulet 1.2 | 2.3 | 14.1% | 47 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.2% | 30 |
| yagami.Tidus 0.11 | 4.0 | 12.1% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.5% | 19 |
| ejb.Polaris 1.0.1 | 6.0 | 10.5% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.7 | 13 / 35 | 4262 |
| 2 | 1 | 67.7 | 85.4 | 21 / 35 | 4217 |
| 3 | 2 | 61.5 | 62.5 | 10 / 35 | 4381 |
| 4 | 1 | 67.9 | 82.9 | 19 / 35 | 4797 |
| 5 | 1 | 64.7 | 69.8 | 14 / 35 | 4902 |
| 6 | 2 | 65.3 | 75.9 | 12 / 35 | 4359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 31 | 61% |
| kawigi.micro.Shiz 1.1 | 26 | 88% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 83% |
| yagami.Tidus 0.11 | 20 | 75% |
| ejb.Polaris 1.0.1 | 11 | 91% |
| step.nanoPri 1.0 | 3 | 67% |

Hadur died in 121 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 42% | 71 |
| yagami.Tidus 0.11 | 23 | 19% | 36 |
| kawigi.micro.Shiz 1.1 | 16 | 13% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 12% | 38 |
| ejb.Polaris 1.0.1 | 5 | 4% | 18 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 4 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.5 | 133 / 210 | 2.84 | 17.6% | 27364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.6% | 133 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 19 |
| wee.Gem 1.8.4 | 3.7 | 11.5% | 22 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 11 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 5 |
| m3thos.Eva00 1.1 | 5.5 | 9.8% | 13 |
| bayen.UbaMicro 1.4 | 6.5 | 9.1% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 1 |
| maribo.FollowFire 1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.2 | 24 / 35 | 4618 |
| 2 | 1 | 67.0 | 81.6 | 22 / 35 | 4558 |
| 3 | 1 | 68.4 | 85.4 | 24 / 35 | 5023 |
| 4 | 1 | 66.5 | 79.0 | 23 / 35 | 4626 |
| 5 | 1 | 64.3 | 73.3 | 17 / 35 | 4302 |
| 6 | 1 | 65.4 | 75.6 | 23 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 56 | 91% |
| wee.Gem 1.8.4 | 32 | 100% |
| wompi.Quokka 1.6 | 19 | 89% |
| m3thos.Eva00 1.1 | 14 | 79% |
| ratosh.Nobo 0.21 | 13 | 85% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 17 | 22% | 65 |
| ratosh.Nobo 0.21 | 13 | 17% | 25 |
| maribo.FollowFire 1 | 13 | 17% | 14 |
| m3thos.Eva00 1.1 | 11 | 14% | 24 |
| wee.Gem 1.8.4 | 6 | 8% | 40 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 6% | 7 |
| wompi.Quokka 1.6 | 4 | 5% | 16 |
| bayen.UbaMicro 1.4 | 2 | 3% | 7 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 85.8 | 126 / 210 | 2.28 | 20.9% | 46023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.9% | 126 |
| wompi.Wallaby 5.1 | 2.0 | 17.5% | 54 |
| mz.NanoGod 2.02 | 3.0 | 14.4% | 21 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 6 |
| ayk.WallHugger 1.0 | 5.2 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 87.6 | 24 / 35 | 8349 |
| 2 | 1 | 71.1 | 82.9 | 20 / 35 | 7666 |
| 3 | 1 | 71.6 | 85.7 | 20 / 35 | 7348 |
| 4 | 1 | 73.2 | 90.2 | 23 / 35 | 8003 |
| 5 | 1 | 71.9 | 85.7 | 21 / 35 | 7667 |
| 6 | 1 | 70.5 | 82.5 | 18 / 35 | 6990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 95 | 83% |
| mz.NanoGod 2.02 | 18 | 50% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| stelo.PianistNano 1.2 | 7 | 86% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| sample.SittingDuck 1.0 | 5 | 100% |
| cli.WasteOfAmmo 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 34 | 40% | 48 |
| wompi.Wallaby 5.1 | 30 | 36% | 122 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 19 |
| ayk.WallHugger 1.0 | 4 | 5% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 4 |
| drd.Dreadknoght 0.9 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.4 | 103 / 210 | 3.48 | 16.6% | 29145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.6% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.0% | 21 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 25 |
| bvh.micro.Freya 0.3 | 4.0 | 11.2% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.6% | 11 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 4 |
| ap.Frederick 1.1 | 8.2 | 7.3% | 10 |
| dl.BetterWalls 1.0 | 9.2 | 6.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.1 | 17 / 35 | 4516 |
| 2 | 1 | 65.2 | 73.3 | 18 / 35 | 4972 |
| 3 | 1 | 65.2 | 73.3 | 18 / 35 | 4817 |
| 4 | 1 | 62.3 | 65.4 | 14 / 35 | 4603 |
| 5 | 1 | 65.9 | 74.3 | 19 / 35 | 5213 |
| 6 | 1 | 64.4 | 71.1 | 17 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 88% |
| dummy.micro.Sparrow 2.5 | 22 | 77% |
| bvh.micro.Freya 0.3 | 16 | 69% |
| stelo.MirrorMicro 1.0 | 11 | 82% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 19% | 48 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 18% | 41 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 13% | 15 |
| bvh.micro.Freya 0.3 | 12 | 11% | 23 |
| conscience.Electron 1.3g | 11 | 10% | 15 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 18 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.5 | 149 / 210 | 2.12 | 21.4% | 42801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.4% | 149 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.4% | 21 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.6% | 15 |
| sul.Lunar 1.1 | 3.7 | 11.3% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 6 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 9.2 | 5.3% | 3 |
| sample.Corners 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 84.4 | 23 / 35 | 6838 |
| 2 | 1 | 71.4 | 85.4 | 22 / 35 | 7217 |
| 3 | 1 | 70.8 | 85.7 | 23 / 35 | 7030 |
| 4 | 1 | 71.8 | 88.9 | 27 / 35 | 7066 |
| 5 | 1 | 72.1 | 87.3 | 26 / 35 | 6988 |
| 6 | 1 | 73.3 | 93.3 | 28 / 35 | 7662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 91% |
| sul.Lunar 1.1 | 42 | 100% |
| supersample.SuperBoxBot 1.0 | 28 | 86% |
| dsw.StaticD 1.0 | 10 | 70% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 27 | 44% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 27% | 68 |
| dsw.StaticD 1.0 | 9 | 15% | 20 |
| sul.Lunar 1.1 | 4 | 6% | 49 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 83.7 | 124 / 210 | 2.47 | 19.4% | 39842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.4% | 124 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 12.4% | 24 |
| radnor.DoctorBob 1.42 | 3.3 | 11.8% | 24 |
| mld.Wisdom 1.0 | 3.5 | 11.8% | 19 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.1% | 6 |
| amz.NanoClone 1.41 | 5.5 | 9.4% | 7 |
| GarmBox.Oranges 1.0 | 7.3 | 7.5% | 0 |
| sample.Walls 1.0 | 8.0 | 7.5% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.7 | 21 / 35 | 6649 |
| 2 | 1 | 68.1 | 80.6 | 20 / 35 | 6439 |
| 3 | 1 | 69.1 | 85.4 | 22 / 35 | 6178 |
| 4 | 1 | 70.5 | 87.0 | 24 / 35 | 7011 |
| 5 | 1 | 68.1 | 81.6 | 16 / 35 | 6794 |
| 6 | 1 | 69.0 | 81.6 | 21 / 35 | 6771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 66 | 85% |
| radnor.DoctorBob 1.42 | 24 | 79% |
| mld.Wisdom 1.0 | 20 | 60% |
| KiraNL.Chupacabra 0.4 | 9 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 7 | 71% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 31% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 28% | 80 |
| radnor.DoctorBob 1.42 | 14 | 16% | 40 |
| KiraNL.Chupacabra 0.4 | 10 | 12% | 21 |
| amz.NanoClone 1.41 | 5 | 6% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 2 | 2% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 6 |

