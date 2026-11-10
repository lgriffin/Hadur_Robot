# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.6 | 159 / 210 | 1.84 | 21.8% | 42271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.8% | 159 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 9 |
| radnor.DoctorBob 1.42 | 3.0 | 13.8% | 20 |
| mld.Infinity 2.2 | 3.7 | 12.6% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 4 |
| GarmBox.Oranges 1.0 | 6.8 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.2% | 1 |
| sample.Walls 1.0 | 7.2 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 94.9 | 27 / 35 | 7465 |
| 2 | 1 | 71.6 | 85.4 | 23 / 35 | 6720 |
| 3 | 1 | 71.6 | 87.6 | 26 / 35 | 6860 |
| 4 | 1 | 73.1 | 93.0 | 27 / 35 | 7044 |
| 5 | 1 | 72.5 | 90.5 | 28 / 35 | 6923 |
| 6 | 1 | 73.4 | 92.4 | 28 / 35 | 7259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 81 | 98% |
| radnor.DoctorBob 1.42 | 38 | 87% |
| mld.Infinity 2.2 | 31 | 90% |
| jangs.ns51 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 39% | 59 |
| mz.AntiGrav 1.0 | 13 | 25% | 76 |
| mld.Infinity 2.2 | 10 | 20% | 42 |
| amz.NanoClone 1.41 | 4 | 8% | 12 |
| arthord.MannyPacquiao Beta | 2 | 4% | 8 |
| jangs.ns51 1.0 | 1 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 0 |
| sample.Walls 1.0 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 76.1 | 99 / 210 | 3.15 | 17.1% | 31009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.5 | 17.1% | 99 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.7% | 62 |
| mld.DustBunny 3.8 | 2.5 | 14.0% | 25 |
| maribo.melee.BMV 0.1 | 4.2 | 11.1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.8% | 6 |
| zyx.nano.Ant 1.1 | 6.3 | 8.1% | 3 |
| fullsail.SweetTea 1.1 | 7.2 | 7.4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.1% | 6 |
| bzdp.BoxCar 2.0 | 8.7 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.2 | 17 / 35 | 5187 |
| 2 | 1 | 70.0 | 91.4 | 25 / 35 | 5479 |
| 3 | 1 | 68.5 | 87.9 | 23 / 35 | 5091 |
| 4 | 3 | 57.8 | 48.9 | 4 / 35 | 4774 |
| 5 | 1 | 68.8 | 87.6 | 22 / 35 | 5295 |
| 6 | 2 | 61.3 | 57.8 | 8 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 51 | 82% |
| oog.melee.Mercutio 1.0 | 48 | 71% |
| fullsail.SweetTea 1.1 | 10 | 80% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 37 | 33% | 69 |
| mld.DustBunny 3.8 | 24 | 22% | 71 |
| cs.Grudge 1.0 | 17 | 15% | 16 |
| maribo.melee.BMV 0.1 | 11 | 10% | 14 |
| fullsail.SweetTea 1.1 | 7 | 6% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 9 |
| zyx.nano.Ant 1.1 | 5 | 5% | 8 |
| bzdp.BoxCar 2.0 | 3 | 3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |

## Melee bench: F03

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.2 | 135 / 210 | 2.33 | 20.4% | 38181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 20.4% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.3% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.0% | 4 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.7% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.9% | 20 |
| fm.mammillarias 1.3 | 5.7 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.7% | 6 |
| sample.Fire 1.0 | 9.5 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 81.6 | 21 / 35 | 6568 |
| 2 | 1 | 70.5 | 82.5 | 23 / 35 | 6792 |
| 3 | 1 | 72.3 | 90.8 | 26 / 35 | 6719 |
| 4 | 1 | 69.7 | 83.2 | 21 / 35 | 5957 |
| 5 | 1 | 71.5 | 91.1 | 25 / 35 | 6475 |
| 6 | 1 | 69.2 | 82.2 | 19 / 35 | 5670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 79% |
| cb.nano.Insomnia 1.0 | 19 | 95% |
| myl.nano.KomoriNinja 1.1 | 19 | 95% |
| sp.Nanos.Ember 1.1 | 15 | 93% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 28% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 39 |
| cb.nano.Insomnia 1.0 | 14 | 19% | 25 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 43 |
| fm.mammillarias 1.3 | 6 | 8% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 19 |
| sample.Fire 1.0 | 2 | 3% | 4 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.2 | 164 / 210 | 1.89 | 21.2% | 39621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.2% | 164 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.3% | 12 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.9% | 12 |
| tj.zombie1n 1.0.1 | 4.5 | 8.9% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.0% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.3% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 7.9% | 2 |
| yk.JahMicro 1.0 | 7.0 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 9.3 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 28 / 35 | 7226 |
| 2 | 1 | 70.9 | 87.9 | 27 / 35 | 6797 |
| 3 | 1 | 71.1 | 92.1 | 30 / 35 | 6032 |
| 4 | 1 | 71.9 | 94.6 | 28 / 35 | 6574 |
| 5 | 1 | 72.1 | 93.3 | 28 / 35 | 6849 |
| 6 | 1 | 68.7 | 80.3 | 23 / 35 | 6143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 95% |
| stelo.SoJNanoMelee 1.1 | 43 | 88% |
| tj.zombie1n 1.0.1 | 17 | 100% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 88% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoJNanoMelee 1.1 | 13 | 28% | 42 |
| kawigi.nano.Lib 1.0 | 12 | 26% | 81 |
| tvv.micro.Antares 1.1.1 | 8 | 17% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 9% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 7% | 21 |
| tj.zombie1n 1.0.1 | 3 | 7% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| yk.JahMicro 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |

## Melee bench: F05

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 67.1 | 88 / 210 | 3.96 | 15.7% | 29102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 15.7% | 88 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 37 |
| ahf.NanoAndrew .4 | 3.2 | 11.8% | 33 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 10.8% | 17 |
| sam.Samspin 1.0 | 5.7 | 9.5% | 11 |
| EBBU.Sim2 1.02 | 6.2 | 9.5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.9% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.9% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.0 | 16 / 35 | 4970 |
| 2 | 1 | 64.6 | 69.8 | 15 / 35 | 5505 |
| 3 | 1 | 62.8 | 68.3 | 15 / 35 | 4521 |
| 4 | 1 | 63.2 | 63.8 | 17 / 35 | 4630 |
| 5 | 1 | 61.8 | 61.0 | 14 / 35 | 4686 |
| 6 | 1 | 62.5 | 67.0 | 11 / 35 | 4790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 59% |
| simonton.nano.MeleeSeed 1.8 | 25 | 100% |
| ahf.NanoAndrew .4 | 19 | 79% |
| sam.Samspin 1.0 | 14 | 100% |
| EBBU.Sim2 1.02 | 9 | 89% |
| zyx.nano.BacillusComma 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 379. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 43 |
| oog.melee.Corsair 1.0 | 21 | 17% | 39 |
| ahf.NanoAndrew .4 | 16 | 13% | 33 |
| EBBU.Sim2 1.02 | 14 | 11% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 11% | 16 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 19 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 18 |
| sam.Samspin 1.0 | 5 | 4% | 17 |
| sample.TrackFire 1.0 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.8 | 152 / 210 | 2.00 | 19.9% | 32774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.9% | 152 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 21 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.0% | 13 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.9% | 2 |
| fm.claire 1.7 | 6.3 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.4% | 2 |
| pa.Improved 1.0 | 9.2 | 6.0% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 25 / 35 | 5617 |
| 2 | 1 | 69.0 | 86.0 | 25 / 35 | 5491 |
| 3 | 1 | 71.6 | 97.8 | 30 / 35 | 5612 |
| 4 | 1 | 67.1 | 81.9 | 20 / 35 | 5020 |
| 5 | 1 | 70.2 | 91.7 | 26 / 35 | 5427 |
| 6 | 1 | 69.9 | 87.6 | 26 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 88% |
| oog.melee.CapuletDroid 1.1 | 38 | 89% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| arthord.NanoSatanMelee Beta | 21 | 90% |
| winamp32.micro.MicroMacro 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| sample.SpinBot 1.0 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 31% | 73 |
| gh.nano.Grofvuil 0.2 | 13 | 22% | 34 |
| oog.melee.CapuletDroid 1.1 | 7 | 12% | 44 |
| arthord.NanoSatanMelee Beta | 5 | 9% | 18 |
| kurios.DOSexe .9b | 4 | 7% | 9 |
| sample.SpinBot 1.0 | 4 | 7% | 8 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 14 |
| fm.claire 1.7 | 2 | 3% | 5 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.6 | 111 / 210 | 2.39 | 18.8% | 34800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 18.8% | 111 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.6% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 26 |
| mz.MicroGodMelee 1 | 3.3 | 13.1% | 27 |
| DBall.Anarchy 0.1 | 5.0 | 8.4% | 8 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.5% | 1 |
| acogdev.alpha 0.2 | 7.5 | 6.7% | 2 |
| fire219.CatBot 1.0 | 8.0 | 6.2% | 0 |
| el.JumpShoot 0.2 | 9.0 | 5.7% | 1 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.4 | 20 / 35 | 6402 |
| 2 | 1 | 69.6 | 87.3 | 24 / 35 | 5599 |
| 3 | 1 | 68.1 | 83.5 | 16 / 35 | 5523 |
| 4 | 1 | 69.5 | 85.7 | 20 / 35 | 6027 |
| 5 | 1 | 68.6 | 85.7 | 17 / 35 | 5746 |
| 6 | 1 | 66.5 | 79.7 | 14 / 35 | 5503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 89% |
| mz.MicroGodMelee 1 | 42 | 67% |
| gh.micro.Gruweltje 0.7 | 28 | 54% |
| DBall.Anarchy 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 67% |

Hadur died in 99 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 27 | 27% | 47 |
| mz.MicroGodMelee 1 | 26 | 26% | 55 |
| spinnercat.micro.Tyger 0.1 | 22 | 22% | 63 |
| acogdev.alpha 0.2 | 9 | 9% | 14 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 10 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 11 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.0 | 117 / 210 | 3.52 | 16.6% | 29623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.2 | 16.6% | 117 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.3% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.3% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 5 |
| germ.TheMind .2 | 5.0 | 9.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 9.2% | 5 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 8 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.9% | 5 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 74.0 | 20 / 35 | 4582 |
| 2 | 1 | 66.0 | 74.3 | 19 / 35 | 5312 |
| 3 | 1 | 66.6 | 74.0 | 22 / 35 | 5356 |
| 4 | 1 | 65.5 | 70.8 | 21 / 35 | 5042 |
| 5 | 2 | 63.9 | 69.2 | 16 / 35 | 4697 |
| 6 | 1 | 63.7 | 69.8 | 19 / 35 | 4634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 87% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 91% |
| germ.TheMind .2 | 9 | 78% |
| stelo.UntouchableNano 1.3 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 37 | 40% | 101 |
| germ.TheMind .2 | 14 | 15% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 12% | 31 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 17 |
| lrem.micro.MoggFanatic 0.2 | 9 | 10% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| awesomeness.Elite 1.0 | 4 | 4% | 10 |
| mym.EdgeStalker 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.1 | 153 / 210 | 2.07 | 19.9% | 30877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.9% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 13.1% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 5 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.9% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.4% | 8 |
| ratosh.Wesco 1.4 | 7.0 | 8.7% | 4 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 7 |
| spinnercat.Omen 1.0 | 8.3 | 7.6% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.9 | 22 / 35 | 5429 |
| 2 | 1 | 71.6 | 91.7 | 28 / 35 | 5340 |
| 3 | 1 | 69.8 | 85.7 | 25 / 35 | 4967 |
| 4 | 1 | 69.8 | 87.6 | 24 / 35 | 4834 |
| 5 | 1 | 71.7 | 96.2 | 30 / 35 | 5242 |
| 6 | 1 | 69.4 | 84.8 | 24 / 35 | 5065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 55 | 87% |
| nz.jdc.nano.GridFu 1.0 | 41 | 100% |
| stelo.PatternRobot 1.0 | 23 | 83% |
| timmit.nano.TimDog 0.33 | 15 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 90% |
| maribo.IotaCT 1.1 | 9 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 24% | 51 |
| stelo.PatternRobot 1.0 | 13 | 22% | 24 |
| timmit.nano.TimDog 0.33 | 11 | 19% | 23 |
| ratosh.Wesco 1.4 | 7 | 12% | 16 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 52 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 15 |
| maribo.IotaCT 1.1 | 3 | 5% | 21 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.0 | 165 / 210 | 1.81 | 21.4% | 39389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.4% | 165 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.3% | 19 |
| baal.nano.N 1.42 | 3.2 | 11.2% | 5 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.7% | 5 |
| zyx.micro.Ant 1.1 | 4.7 | 9.5% | 10 |
| sanja.First 0.1 | 6.3 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.0% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 6.9% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 2 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.2 | 30 / 35 | 6333 |
| 2 | 1 | 70.6 | 87.9 | 25 / 35 | 6486 |
| 3 | 1 | 72.5 | 95.2 | 31 / 35 | 6818 |
| 4 | 1 | 70.5 | 86.0 | 24 / 35 | 6730 |
| 5 | 1 | 71.2 | 90.8 | 27 / 35 | 6406 |
| 6 | 1 | 71.6 | 90.8 | 28 / 35 | 6616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 36 | 94% |
| cvt.Firsty 1.0 | 32 | 97% |
| zyx.micro.Ant 1.1 | 29 | 83% |
| baal.nano.N 1.42 | 28 | 93% |
| sanja.First 0.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 16 | 94% |
| Grystrion.TrackerWO 1.0 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 16 | 36% | 54 |
| tvv.nano.Polaris 1.2 | 7 | 16% | 55 |
| baal.nano.N 1.42 | 4 | 9% | 28 |
| sanja.First 0.1 | 4 | 9% | 20 |
| cvt.Firsty 1.0 | 4 | 9% | 19 |
| Grystrion.TrackerWO 1.0 | 4 | 9% | 13 |
| amk.Punbot.Punbot 0.01 | 3 | 7% | 8 |
| sample.RamFire 1.0 | 3 | 7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 72.1 | 90 / 210 | 3.51 | 16.2% | 31420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.3 | 16.2% | 90 |
| kc.micro.Figment 1.0 | 1.7 | 15.4% | 71 |
| cs.Wren 1.0 | 3.0 | 12.6% | 16 |
| js.PinBall 1.6 | 4.3 | 11.6% | 15 |
| mz.Cork 0.1 | 5.0 | 10.6% | 6 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 2 |
| evd.X1 0.01 | 6.8 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.2% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 67.0 | 12 / 35 | 5209 |
| 2 | 1 | 66.7 | 74.9 | 16 / 35 | 5874 |
| 3 | 2 | 60.9 | 60.0 | 13 / 35 | 4965 |
| 4 | 1 | 63.8 | 70.5 | 14 / 35 | 4922 |
| 5 | 1 | 66.3 | 80.6 | 17 / 35 | 5168 |
| 6 | 1 | 66.9 | 79.7 | 18 / 35 | 5282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 64% |
| cs.Wren 1.0 | 27 | 89% |
| js.PinBall 1.6 | 9 | 89% |
| mz.Cork 0.1 | 8 | 100% |
| donjezza.Jezza 1.0 | 7 | 100% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 46 | 38% | 91 |
| cs.Wren 1.0 | 17 | 14% | 35 |
| evd.X1 0.01 | 16 | 13% | 18 |
| joe.ADinosaur 1.0 | 15 | 13% | 17 |
| js.PinBall 1.6 | 13 | 11% | 19 |
| mz.Cork 0.1 | 6 | 5% | 15 |
| donjezza.Jezza 1.0 | 3 | 3% | 7 |
| PSW.Relentless 0.1 | 3 | 3% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |

## Melee bench: F12

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.1 | 134 / 210 | 2.25 | 19.7% | 32107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.7% | 134 |
| ntc.Opposite 1.5 | 3.2 | 11.0% | 8 |
| myl.nano.Graviton 1.10 | 3.3 | 10.9% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.3% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.8% | 16 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.4% | 8 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.9% | 3 |
| pbg.R2D2 1.0 | 9.5 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.1 | 24 / 35 | 5617 |
| 2 | 1 | 68.2 | 83.5 | 20 / 35 | 5217 |
| 3 | 1 | 69.0 | 88.3 | 19 / 35 | 5400 |
| 4 | 1 | 70.9 | 89.8 | 28 / 35 | 5303 |
| 5 | 1 | 68.7 | 86.0 | 21 / 35 | 5001 |
| 6 | 1 | 69.4 | 84.1 | 22 / 35 | 5569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 40 | 85% |
| myl.nano.Graviton 1.10 | 37 | 78% |
| donjezza.Muncho 1.0 | 17 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| DBall.NUKE 0.1 | 14 | 100% |
| disan.Chair 2.2.0 | 14 | 79% |
| ntc.Opposite 1.5 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 9 | 67% |
| pbg.R2D2 1.0 | 5 | 60% |

Hadur died in 76 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 20% | 42 |
| pfvicm.Sobieski 7.2.3b | 14 | 18% | 23 |
| stelo.AreaTargetingBot 1.1 | 13 | 17% | 44 |
| ntc.Opposite 1.5 | 13 | 17% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 18 |
| disan.Chair 2.2.0 | 6 | 8% | 20 |
| donjezza.Muncho 1.0 | 3 | 4% | 11 |
| pbg.R2D2 1.0 | 3 | 4% | 6 |
| DBall.NUKE 0.1 | 0 | 0% | 16 |

## Melee bench: F13

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.0 | 78 / 210 | 3.61 | 15.5% | 26041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.7 | 15.5% | 78 |
| oog.melee.Capulet 1.2 | 2.3 | 13.6% | 47 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.8% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 25 |
| yagami.Tidus 0.11 | 4.7 | 12.1% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 9 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 1 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 69.2 | 10 / 35 | 4207 |
| 2 | 1 | 66.2 | 79.4 | 15 / 35 | 4538 |
| 3 | 4 | 59.1 | 57.1 | 9 / 35 | 3937 |
| 4 | 1 | 62.3 | 66.7 | 12 / 35 | 4005 |
| 5 | 1 | 67.8 | 81.9 | 16 / 35 | 5039 |
| 6 | 1 | 64.3 | 71.7 | 16 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 27 | 85% |
| oog.melee.Capulet 1.2 | 26 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 68% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 37% | 67 |
| yagami.Tidus 0.11 | 24 | 18% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 37 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 31 |
| ejb.Polaris 1.0.1 | 12 | 9% | 19 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 6 | 5% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.9 | 125 / 210 | 2.81 | 17.8% | 28902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 17.8% | 125 |
| ratosh.Nobo 0.21 | 3.2 | 11.7% | 14 |
| bzdp.Pansy 2.1 | 3.3 | 11.6% | 15 |
| wompi.Quokka 1.6 | 3.8 | 11.2% | 19 |
| wee.Gem 1.8.4 | 4.8 | 10.9% | 22 |
| m3thos.Eva00 1.1 | 5.3 | 10.1% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 8.9% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 20 / 35 | 5061 |
| 2 | 1 | 64.2 | 73.0 | 18 / 35 | 4430 |
| 3 | 1 | 65.0 | 73.3 | 19 / 35 | 5004 |
| 4 | 1 | 69.6 | 89.5 | 24 / 35 | 5114 |
| 5 | 1 | 68.8 | 87.6 | 26 / 35 | 4710 |
| 6 | 1 | 64.1 | 71.1 | 18 / 35 | 4583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 37 | 95% |
| bzdp.Pansy 2.1 | 36 | 97% |
| wompi.Quokka 1.6 | 22 | 86% |
| ratosh.Nobo 0.21 | 17 | 82% |
| m3thos.Eva00 1.1 | 15 | 80% |
| stelo.MyAgileRobot 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 14 | 16% | 33 |
| ratosh.Nobo 0.21 | 13 | 15% | 28 |
| maribo.FollowFire 1 | 12 | 14% | 14 |
| m3thos.Eva00 1.1 | 11 | 13% | 19 |
| bzdp.Pansy 2.1 | 10 | 12% | 35 |
| wee.Gem 1.8.4 | 8 | 9% | 48 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 8 |
| bayen.UbaMicro 1.4 | 5 | 6% | 12 |

## Melee bench: F15

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.3 | 136 / 210 | 1.79 | 22.1% | 48643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 22.1% | 136 |
| wompi.Wallaby 5.1 | 2.0 | 17.3% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 17 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.3% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.2% | 2 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 91.4 | 24 / 35 | 8858 |
| 2 | 1 | 74.4 | 94.0 | 24 / 35 | 8587 |
| 3 | 1 | 71.2 | 86.3 | 17 / 35 | 7511 |
| 4 | 1 | 73.6 | 91.4 | 27 / 35 | 7929 |
| 5 | 1 | 73.5 | 92.4 | 23 / 35 | 7852 |
| 6 | 1 | 72.8 | 92.1 | 21 / 35 | 7906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 114 | 79% |
| mz.NanoGod 2.02 | 22 | 55% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 9 | 89% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 51% | 137 |
| mz.NanoGod 2.02 | 24 | 32% | 41 |
| exauge.GateKeeper 1.1.121g | 7 | 9% | 10 |
| ayk.WallHugger 1.0 | 4 | 5% | 7 |
| stuff.Vlad 0.1 | 2 | 3% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 9 |

## Melee bench: F16

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.3 | 104 / 210 | 3.50 | 16.7% | 29759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 16.7% | 104 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.1% | 20 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.1% | 25 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.7% | 15 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 9 |
| conscience.Electron 1.3g | 7.3 | 7.7% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 10 |
| dl.BetterWalls 1.0 | 8.5 | 6.9% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 20 / 35 | 5315 |
| 2 | 1 | 66.5 | 75.6 | 19 / 35 | 5547 |
| 3 | 1 | 63.4 | 67.9 | 17 / 35 | 4603 |
| 4 | 1 | 63.6 | 70.2 | 14 / 35 | 4562 |
| 5 | 1 | 62.8 | 65.7 | 15 / 35 | 4825 |
| 6 | 1 | 66.2 | 77.1 | 19 / 35 | 4907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 40 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 83% |
| dummy.micro.Sparrow 2.5 | 22 | 91% |
| bvh.micro.Freya 0.3 | 19 | 89% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| conscience.Electron 1.3g | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 17 | 16% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 15% | 16 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 32 |
| conscience.Electron 1.3g | 14 | 13% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 12% | 34 |
| dl.BetterWalls 1.0 | 13 | 12% | 18 |
| bvh.micro.Freya 0.3 | 11 | 10% | 27 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 11 |

## Melee bench: F17

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 88.9 | 151 / 210 | 2.00 | 21.7% | 42770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 21.7% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.3 | 13.7% | 14 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 17 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.4% | 8 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.4% | 2 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.4% | 2 |
| tlp.ThreeLeggedPig 1 | 7.7 | 6.7% | 1 |
| sample.Corners 1.0 | 9.3 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 89.2 | 26 / 35 | 7379 |
| 2 | 1 | 72.1 | 91.4 | 26 / 35 | 6979 |
| 3 | 1 | 72.1 | 87.9 | 24 / 35 | 7237 |
| 4 | 1 | 72.8 | 94.0 | 27 / 35 | 7020 |
| 5 | 1 | 70.6 | 82.9 | 24 / 35 | 6875 |
| 6 | 1 | 71.7 | 87.9 | 24 / 35 | 7280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 47 | 91% |
| sul.Lunar 1.1 | 38 | 100% |
| supersample.SuperBoxBot 1.0 | 26 | 92% |
| dsw.StaticD 1.0 | 15 | 47% |
| mme.NikeEnhanced 2.0 | 13 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 10 | 90% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| sample.Corners 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 19 | 32% | 56 |
| supersample.SuperBoxBot 1.0 | 19 | 32% | 40 |
| dsw.StaticD 1.0 | 13 | 22% | 25 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 11 |
| sul.Lunar 1.1 | 2 | 3% | 44 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorWTA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.0 | 132 / 210 | 2.44 | 19.6% | 39656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTA 0.1 | 1.0 | 19.6% | 132 |
| radnor.DoctorBob 1.42 | 2.8 | 12.8% | 16 |
| mld.Wisdom 1.0 | 3.3 | 12.2% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 17 |
| amz.NanoClone 1.41 | 4.8 | 9.9% | 10 |
| KiraNL.Chupacabra 0.4 | 5.2 | 9.8% | 10 |
| sample.Walls 1.0 | 7.5 | 7.6% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 84.1 | 22 / 35 | 6759 |
| 2 | 1 | 69.3 | 81.6 | 23 / 35 | 6478 |
| 3 | 1 | 67.8 | 80.3 | 20 / 35 | 5853 |
| 4 | 1 | 70.9 | 89.2 | 25 / 35 | 6780 |
| 5 | 1 | 69.1 | 81.0 | 19 / 35 | 7108 |
| 6 | 1 | 70.3 | 87.9 | 23 / 35 | 6678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 55 | 91% |
| radnor.DoctorBob 1.42 | 39 | 92% |
| mld.Wisdom 1.0 | 18 | 78% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 29% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 21% | 60 |
| radnor.DoctorBob 1.42 | 13 | 17% | 55 |
| KiraNL.Chupacabra 0.4 | 11 | 14% | 19 |
| amz.NanoClone 1.41 | 7 | 9% | 12 |
| jangs.ns51 1.0 | 3 | 4% | 5 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 2 | 3% | 10 |

