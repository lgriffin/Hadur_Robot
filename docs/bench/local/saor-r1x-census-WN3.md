# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.6 | 144 / 210 | 2.12 | 21.0% | 43547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.0% | 144 |
| radnor.DoctorBob 1.42 | 2.3 | 14.1% | 21 |
| mz.AntiGrav 1.0 | 2.7 | 14.1% | 18 |
| mld.Infinity 2.2 | 4.0 | 12.7% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| sample.Walls 1.0 | 6.7 | 7.4% | 3 |
| GarmBox.Oranges 1.0 | 6.8 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 91.4 | 28 / 35 | 7476 |
| 2 | 1 | 73.2 | 92.7 | 27 / 35 | 7553 |
| 3 | 1 | 68.5 | 79.7 | 17 / 35 | 6502 |
| 4 | 1 | 70.5 | 85.7 | 24 / 35 | 6636 |
| 5 | 1 | 71.6 | 84.8 | 22 / 35 | 7399 |
| 6 | 1 | 73.3 | 91.1 | 26 / 35 | 7981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 91% |
| mld.Infinity 2.2 | 36 | 89% |
| radnor.DoctorBob 1.42 | 24 | 83% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 8 | 63% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 27 | 41% | 58 |
| mz.AntiGrav 1.0 | 14 | 21% | 72 |
| mld.Infinity 2.2 | 12 | 18% | 49 |
| amz.NanoClone 1.41 | 8 | 12% | 13 |
| sample.Walls 1.0 | 2 | 3% | 9 |
| jangs.ns51 1.0 | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.7 | 133 / 210 | 1.93 | 19.2% | 31942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.2% | 133 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.2% | 54 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 16 |
| maribo.melee.BMV 0.1 | 4.0 | 10.9% | 0 |
| zyx.nano.Ant 1.1 | 6.0 | 8.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.9% | 2 |
| bzdp.BoxCar 2.0 | 7.2 | 7.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.9% | 3 |
| fullsail.SweetTea 1.1 | 7.7 | 6.6% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 21 / 35 | 5506 |
| 2 | 1 | 67.7 | 82.2 | 18 / 35 | 5555 |
| 3 | 1 | 69.6 | 92.7 | 26 / 35 | 5096 |
| 4 | 1 | 68.9 | 91.1 | 23 / 35 | 5035 |
| 5 | 1 | 69.4 | 91.1 | 23 / 35 | 5298 |
| 6 | 1 | 69.5 | 92.1 | 22 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 66 | 92% |
| oog.melee.Mercutio 1.0 | 62 | 68% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 33 | 42% | 74 |
| mld.DustBunny 3.8 | 20 | 26% | 81 |
| maribo.melee.BMV 0.1 | 5 | 6% | 14 |
| fullsail.SweetTea 1.1 | 5 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 12 |
| zyx.nano.Ant 1.1 | 4 | 5% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 9 |
| bzdp.BoxCar 2.0 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 82.2 | 120 / 210 | 2.60 | 19.4% | 38021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.4% | 120 |
| myl.micro.Troodon 1.10 | 2.0 | 15.1% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.0% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 25 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.9% | 8 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.7% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.5% | 5 |
| sample.Fire 1.0 | 9.0 | 4.9% | 1 |
| sample.Tracker 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.4 | 27 / 35 | 6491 |
| 2 | 1 | 67.9 | 78.1 | 17 / 35 | 6220 |
| 3 | 1 | 68.9 | 80.0 | 17 / 35 | 6371 |
| 4 | 1 | 68.6 | 78.4 | 20 / 35 | 6092 |
| 5 | 1 | 69.2 | 83.5 | 18 / 35 | 6301 |
| 6 | 1 | 69.6 | 81.0 | 21 / 35 | 6546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 61 | 93% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 81% |
| cb.nano.Insomnia 1.0 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| myl.nano.KomoriNinja 1.1 | 7 | 71% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 24 | 27% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 22% | 38 |
| myl.micro.Troodon 1.10 | 19 | 21% | 74 |
| fm.mammillarias 1.3 | 11 | 12% | 13 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 23 |
| sample.Fire 1.0 | 4 | 4% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 15 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.0 | 146 / 210 | 1.99 | 21.0% | 40800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.0% | 146 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 16 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 1 |
| tj.zombie1n 1.0.1 | 5.8 | 8.7% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.5% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 8.7% | 15 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 4 |
| repositorio.NanoStep 1.0 | 8.2 | 6.8% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.1 | 28 / 35 | 7338 |
| 2 | 1 | 70.1 | 87.0 | 23 / 35 | 6436 |
| 3 | 1 | 70.6 | 88.6 | 23 / 35 | 6768 |
| 4 | 1 | 71.5 | 92.1 | 25 / 35 | 6935 |
| 5 | 1 | 71.1 | 88.3 | 24 / 35 | 6798 |
| 6 | 1 | 70.2 | 86.3 | 23 / 35 | 6525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 57 | 93% |
| stelo.SoJNanoMelee 1.1 | 36 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 68% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| tj.zombie1n 1.0.1 | 11 | 82% |
| repositorio.NanoStep 1.0 | 7 | 100% |
| yk.JahMicro 1.0 | 7 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 28% | 82 |
| stelo.SoJNanoMelee 1.1 | 14 | 22% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 11% | 23 |
| tj.zombie1n 1.0.1 | 7 | 11% | 10 |
| tvv.micro.Antares 1.1.1 | 6 | 9% | 25 |
| repositorio.NanoStep 1.0 | 4 | 6% | 16 |
| yk.JahMicro 1.0 | 4 | 6% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 6% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.6 | 79 / 210 | 3.64 | 15.8% | 30276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 15.8% | 79 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 40 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.3% | 24 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 8 |
| sam.Samspin 1.0 | 6.0 | 9.9% | 14 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 66.3 | 15 / 35 | 4900 |
| 2 | 1 | 64.0 | 68.6 | 13 / 35 | 5411 |
| 3 | 1 | 64.5 | 76.2 | 14 / 35 | 5006 |
| 4 | 1 | 62.6 | 69.2 | 10 / 35 | 5019 |
| 5 | 1 | 65.5 | 77.8 | 16 / 35 | 5208 |
| 6 | 1 | 61.2 | 65.7 | 11 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 31 | 48% |
| simonton.nano.MeleeSeed 1.8 | 26 | 96% |
| ahf.NanoAndrew .4 | 14 | 71% |
| EBBU.Sim2 1.02 | 13 | 92% |
| zyx.nano.BacillusComma 1.0 | 11 | 82% |
| sam.Samspin 1.0 | 8 | 50% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |

Hadur died in 131 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 21% | 41 |
| simonton.nano.MeleeSeed 1.8 | 18 | 14% | 43 |
| sam.Samspin 1.0 | 18 | 14% | 22 |
| robar.nano.Assertive_Melee 0.2 | 16 | 12% | 22 |
| ahf.NanoAndrew .4 | 15 | 11% | 30 |
| zyx.nano.BacillusComma 1.0 | 15 | 11% | 18 |
| EBBU.Sim2 1.02 | 11 | 8% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 6% | 7 |
| sample.TrackFire 1.0 | 3 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.3 | 134 / 210 | 2.23 | 19.2% | 33012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.2% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 38 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.6% | 6 |
| arthord.NanoSatanMelee Beta | 4.5 | 9.7% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.6% | 6 |
| fm.claire 1.7 | 6.8 | 7.9% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.0% | 6 |
| pa.Improved 1.0 | 9.2 | 5.7% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.5 | 21 / 35 | 5418 |
| 2 | 1 | 69.1 | 84.4 | 24 / 35 | 5709 |
| 3 | 1 | 69.7 | 90.8 | 22 / 35 | 5527 |
| 4 | 1 | 69.6 | 89.8 | 24 / 35 | 5513 |
| 5 | 1 | 67.4 | 81.6 | 22 / 35 | 5069 |
| 6 | 1 | 69.3 | 87.6 | 21 / 35 | 5776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 77% |
| oog.melee.CapuletDroid 1.1 | 33 | 97% |
| arthord.NanoSatanMelee Beta | 26 | 85% |
| gh.nano.Grofvuil 0.2 | 9 | 100% |
| sample.SpinBot 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 34% | 70 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 47 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 25 |
| arthord.NanoSatanMelee Beta | 9 | 12% | 25 |
| sample.SpinBot 1.0 | 6 | 8% | 11 |
| fm.claire 1.7 | 4 | 5% | 7 |
| kurios.DOSexe .9b | 3 | 4% | 12 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 8 |
| pa.Improved 1.0 | 2 | 3% | 5 |

## Melee bench: F07

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.2 | 92 / 210 | 3.23 | 17.0% | 33673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.2 | 17.0% | 92 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.8% | 35 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 39 |
| mz.MicroGodMelee 1 | 3.5 | 13.6% | 27 |
| DBall.Anarchy 0.1 | 5.0 | 9.0% | 8 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.4% | 2 |
| fire219.CatBot 1.0 | 9.2 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.0 | 11 / 35 | 5961 |
| 2 | 2 | 62.4 | 66.3 | 12 / 35 | 4800 |
| 3 | 1 | 64.9 | 73.0 | 17 / 35 | 5263 |
| 4 | 1 | 67.8 | 80.0 | 18 / 35 | 6186 |
| 5 | 1 | 67.6 | 81.0 | 18 / 35 | 5950 |
| 6 | 1 | 66.7 | 77.1 | 16 / 35 | 5513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 40 | 78% |
| spinnercat.micro.Tyger 0.1 | 39 | 87% |
| gh.micro.Gruweltje 0.7 | 10 | 90% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 39 | 33% | 68 |
| gh.micro.Gruweltje 0.7 | 28 | 24% | 39 |
| spinnercat.micro.Tyger 0.1 | 21 | 18% | 54 |
| caimano.Furia_Ceca 0.22 | 10 | 8% | 12 |
| acogdev.alpha 0.2 | 8 | 7% | 9 |
| el.JumpShoot 0.2 | 6 | 5% | 8 |
| DBall.Anarchy 0.1 | 4 | 3% | 16 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 68.1 | 96 / 210 | 3.87 | 16.0% | 33205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.5 | 16.0% | 96 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 14.1% | 42 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 6 |
| germ.TheMind .2 | 5.2 | 9.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 5 |
| awesomeness.Elite 1.0 | 6.8 | 8.4% | 3 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.7% | 8 |
| sample.Crazy 1.0 | 8.0 | 7.3% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 18 / 35 | 5664 |
| 2 | 1 | 65.2 | 72.7 | 15 / 35 | 5776 |
| 3 | 3 | 57.6 | 52.7 | 12 / 35 | 4790 |
| 4 | 1 | 66.0 | 72.4 | 19 / 35 | 5702 |
| 5 | 1 | 66.0 | 73.3 | 18 / 35 | 5859 |
| 6 | 2 | 62.2 | 60.3 | 14 / 35 | 5414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 90% |
| qualidafial.MajorDick 1.0.1 | 10 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| germ.TheMind .2 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 404. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 47% | 104 |
| germ.TheMind .2 | 15 | 13% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 12% | 32 |
| qualidafial.MajorDick 1.0.1 | 9 | 8% | 13 |
| awesomeness.Elite 1.0 | 7 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6 | 5% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 87.6 | 145 / 210 | 2.11 | 19.9% | 32271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.9% | 145 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 12.0% | 14 |
| rz.HawkOnFire 0.1 | 2.5 | 13.1% | 21 |
| maribo.IotaCT 1.1 | 4.3 | 10.4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.6% | 3 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.4% | 7 |
| ratosh.Wesco 1.4 | 7.5 | 8.4% | 4 |
| stelo.PatternRobot 1.0 | 7.8 | 8.2% | 6 |
| spinnercat.Omen 1.0 | 8.2 | 7.9% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 25 / 35 | 5537 |
| 2 | 1 | 70.5 | 91.1 | 25 / 35 | 5338 |
| 3 | 1 | 68.6 | 83.8 | 22 / 35 | 5112 |
| 4 | 1 | 71.4 | 90.5 | 25 / 35 | 5635 |
| 5 | 1 | 67.2 | 80.3 | 19 / 35 | 4636 |
| 6 | 1 | 72.0 | 90.8 | 29 / 35 | 6013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 97% |
| nz.jdc.nano.GridFu 1.0 | 34 | 97% |
| stelo.PatternRobot 1.0 | 21 | 95% |
| timmit.nano.TimDog 0.33 | 13 | 62% |
| ratosh.Wesco 1.4 | 12 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| maribo.IotaCT 1.1 | 4 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 510. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 15 | 23% | 69 |
| timmit.nano.TimDog 0.33 | 14 | 22% | 23 |
| stelo.PatternRobot 1.0 | 9 | 14% | 26 |
| nz.jdc.nano.GridFu 1.0 | 8 | 12% | 43 |
| ratosh.Wesco 1.4 | 8 | 12% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 11% | 14 |
| maribo.IotaCT 1.1 | 2 | 3% | 9 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |

## Melee bench: F10

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.3 | 160 / 210 | 1.78 | 21.2% | 39624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.2% | 160 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.8% | 19 |
| baal.nano.N 1.42 | 2.8 | 11.5% | 10 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.0% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.5% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6.3 | 8.4% | 2 |
| sanja.First 0.1 | 7.0 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.7% | 2 |
| cvt.Firsty 1.0 | 8.5 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.2 | 25 / 35 | 6326 |
| 2 | 1 | 72.4 | 95.2 | 30 / 35 | 7007 |
| 3 | 1 | 69.7 | 87.9 | 21 / 35 | 6533 |
| 4 | 1 | 70.9 | 88.3 | 27 / 35 | 6730 |
| 5 | 1 | 71.3 | 94.3 | 26 / 35 | 6268 |
| 6 | 1 | 72.0 | 93.0 | 31 / 35 | 6760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 31 | 100% |
| tvv.nano.Polaris 1.2 | 31 | 84% |
| cvt.Firsty 1.0 | 29 | 93% |
| zyx.micro.Ant 1.1 | 27 | 89% |
| sanja.First 0.1 | 21 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 9 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 28% | 42 |
| tvv.nano.Polaris 1.2 | 13 | 26% | 51 |
| baal.nano.N 1.42 | 6 | 12% | 38 |
| cvt.Firsty 1.0 | 5 | 10% | 24 |
| Grystrion.TrackerWO 1.0 | 5 | 10% | 12 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 8 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 10 |
| sample.RamFire 1.0 | 1 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 17 |

## Melee bench: F11

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 70.4 | 71 / 210 | 3.67 | 15.5% | 30995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.3 | 15.5% | 71 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 72 |
| cs.Wren 1.0 | 2.8 | 13.0% | 26 |
| js.PinBall 1.6 | 4.3 | 10.8% | 14 |
| mz.Cork 0.1 | 4.5 | 11.1% | 13 |
| joe.ADinosaur 1.0 | 6.3 | 8.8% | 0 |
| evd.X1 0.01 | 6.8 | 8.3% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 8.7 | 6.2% | 8 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.2 | 9 / 35 | 5234 |
| 2 | 1 | 64.4 | 74.0 | 11 / 35 | 5538 |
| 3 | 1 | 64.5 | 74.3 | 12 / 35 | 5384 |
| 4 | 1 | 64.4 | 73.7 | 13 / 35 | 5533 |
| 5 | 2 | 61.7 | 64.1 | 13 / 35 | 4598 |
| 6 | 2 | 61.8 | 66.0 | 13 / 35 | 4708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 45 | 56% |
| cs.Wren 1.0 | 26 | 73% |
| mz.Cork 0.1 | 10 | 80% |
| js.PinBall 1.6 | 10 | 90% |
| donjezza.Jezza 1.0 | 6 | 83% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 42% | 89 |
| cs.Wren 1.0 | 22 | 16% | 41 |
| evd.X1 0.01 | 17 | 12% | 18 |
| joe.ADinosaur 1.0 | 13 | 9% | 15 |
| mz.Cork 0.1 | 8 | 6% | 14 |
| js.PinBall 1.6 | 7 | 5% | 15 |
| jsal.Jsalbot 1.0 | 6 | 4% | 9 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |

## Melee bench: F12

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.0 | 136 / 210 | 2.35 | 19.1% | 30447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 19.1% | 136 |
| myl.nano.Graviton 1.10 | 3.2 | 11.3% | 15 |
| ntc.Opposite 1.5 | 3.3 | 11.4% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.2% | 4 |
| DBall.NUKE 0.1 | 7.3 | 7.9% | 5 |
| disan.Chair 2.2.0 | 8.2 | 7.5% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 9 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 21 / 35 | 5264 |
| 2 | 1 | 67.7 | 82.5 | 22 / 35 | 4910 |
| 3 | 1 | 70.3 | 90.8 | 29 / 35 | 4996 |
| 4 | 1 | 69.7 | 89.2 | 25 / 35 | 5340 |
| 5 | 1 | 66.9 | 79.4 | 18 / 35 | 4927 |
| 6 | 1 | 67.3 | 81.9 | 21 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 40 | 95% |
| stelo.AreaTargetingBot 1.1 | 33 | 97% |
| ntc.Opposite 1.5 | 20 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 94% |
| disan.Chair 2.2.0 | 12 | 75% |
| DBall.NUKE 0.1 | 10 | 90% |
| donjezza.Muncho 1.0 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| pbg.R2D2 1.0 | 4 | 75% |

Hadur died in 75 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 24 | 32% | 28 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 41 |
| myl.nano.Graviton 1.10 | 10 | 13% | 49 |
| ntc.Opposite 1.5 | 7 | 9% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 8% | 22 |
| disan.Chair 2.2.0 | 6 | 8% | 11 |
| DBall.NUKE 0.1 | 4 | 5% | 14 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.0 | 63 / 210 | 3.88 | 14.8% | 26843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.7 | 14.8% | 63 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 49 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.0% | 47 |
| yagami.Tidus 0.11 | 4.3 | 12.4% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 23 |
| ejb.Polaris 1.0.1 | 6.0 | 10.3% | 9 |
| step.nanoPri 1.0 | 7.3 | 7.2% | 0 |
| stelo.MirrorNano 1.3 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 60.3 | 9 / 35 | 4330 |
| 2 | 1 | 64.1 | 70.8 | 11 / 35 | 4411 |
| 3 | 1 | 65.0 | 73.0 | 12 / 35 | 4782 |
| 4 | 3 | 61.3 | 62.5 | 11 / 35 | 4298 |
| 5 | 1 | 63.6 | 70.2 | 11 / 35 | 4553 |
| 6 | 1 | 63.1 | 71.1 | 9 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 24 | 63% |
| kawigi.micro.Shiz 1.1 | 23 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| yagami.Tidus 0.11 | 14 | 71% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 72 | 49% | 91 |
| yagami.Tidus 0.11 | 22 | 15% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 12% | 30 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 31 |
| ejb.Polaris 1.0.1 | 9 | 6% | 16 |
| stelo.MirrorNano 1.3 | 7 | 5% | 7 |
| step.nanoPri 1.0 | 5 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.9 | 139 / 210 | 2.63 | 18.2% | 29683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 18.2% | 139 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 19 |
| wee.Gem 1.8.4 | 3.3 | 11.1% | 13 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 13 |
| ratosh.Nobo 0.21 | 4.5 | 10.7% | 9 |
| m3thos.Eva00 1.1 | 6.0 | 9.5% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 3 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.4 | 24 / 35 | 5291 |
| 2 | 1 | 67.6 | 84.1 | 24 / 35 | 4726 |
| 3 | 1 | 64.6 | 73.3 | 20 / 35 | 4647 |
| 4 | 1 | 65.4 | 77.8 | 21 / 35 | 4248 |
| 5 | 1 | 68.5 | 85.1 | 24 / 35 | 5221 |
| 6 | 1 | 69.2 | 86.7 | 26 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 98% |
| wee.Gem 1.8.4 | 31 | 100% |
| wompi.Quokka 1.6 | 17 | 100% |
| ratosh.Nobo 0.21 | 16 | 88% |
| m3thos.Eva00 1.1 | 13 | 92% |
| bayen.UbaMicro 1.4 | 9 | 67% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 17% | 55 |
| bayen.UbaMicro 1.4 | 10 | 14% | 16 |
| ratosh.Nobo 0.21 | 9 | 13% | 24 |
| maribo.FollowFire 1 | 9 | 13% | 8 |
| wompi.Quokka 1.6 | 8 | 11% | 21 |
| wee.Gem 1.8.4 | 6 | 8% | 49 |
| m3thos.Eva00 1.1 | 6 | 8% | 19 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 10 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 8 |

## Melee bench: F15

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 82.5 | 120 / 210 | 2.58 | 20.1% | 44918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 20.1% | 120 |
| wompi.Wallaby 5.1 | 2.0 | 17.8% | 60 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 21 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.8% | 3 |
| stuff.Vlad 0.1 | 6.0 | 8.6% | 2 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 2 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 86.7 | 23 / 35 | 7547 |
| 2 | 1 | 71.0 | 80.0 | 20 / 35 | 7372 |
| 3 | 1 | 70.5 | 81.0 | 20 / 35 | 7054 |
| 4 | 1 | 70.1 | 78.7 | 16 / 35 | 7509 |
| 5 | 1 | 72.3 | 86.7 | 24 / 35 | 7904 |
| 6 | 1 | 70.6 | 81.9 | 17 / 35 | 7532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 92 | 82% |
| mz.NanoGod 2.02 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 13 | 100% |
| ayk.WallHugger 1.0 | 12 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 90 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 38 | 42% | 124 |
| mz.NanoGod 2.02 | 32 | 36% | 41 |
| ayk.WallHugger 1.0 | 8 | 9% | 17 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 13 |
| stelo.PianistNano 1.2 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.8 | 109 / 210 | 3.45 | 16.6% | 29295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 16.6% | 109 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.9% | 29 |
| dummy.micro.Sparrow 2.5 | 3.2 | 11.8% | 25 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 9 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 2 |
| ap.Frederick 1.1 | 8.2 | 7.1% | 6 |
| dl.BetterWalls 1.0 | 8.7 | 6.5% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.5 | 18 / 35 | 4770 |
| 2 | 1 | 65.6 | 74.9 | 21 / 35 | 5041 |
| 3 | 1 | 68.0 | 84.8 | 20 / 35 | 5110 |
| 4 | 1 | 64.6 | 76.2 | 14 / 35 | 5021 |
| 5 | 1 | 63.4 | 67.3 | 17 / 35 | 4979 |
| 6 | 1 | 62.2 | 64.1 | 19 / 35 | 4374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 39 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 85% |
| dummy.micro.Sparrow 2.5 | 25 | 100% |
| bvh.micro.Freya 0.3 | 10 | 80% |
| stelo.MirrorMicro 1.0 | 10 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 19 | 19% | 51 |
| conscience.Electron 1.3g | 17 | 17% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 14% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 43 |
| dl.BetterWalls 1.0 | 13 | 13% | 16 |
| bvh.micro.Freya 0.3 | 11 | 11% | 18 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 37 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 15 |

## Melee bench: F17

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 89.7 | 153 / 210 | 1.93 | 21.6% | 43215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 21.6% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.6% | 19 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 11 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.4% | 6 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.1% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.7% | 10 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 6.1% | 2 |
| sample.Corners 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.9 | 26 / 35 | 7659 |
| 2 | 1 | 72.4 | 93.0 | 27 / 35 | 6829 |
| 3 | 1 | 71.3 | 88.9 | 23 / 35 | 7099 |
| 4 | 1 | 69.2 | 85.7 | 22 / 35 | 6204 |
| 5 | 1 | 73.8 | 94.9 | 29 / 35 | 7866 |
| 6 | 1 | 71.9 | 87.6 | 26 / 35 | 7558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 96% |
| supersample.SuperBoxBot 1.0 | 32 | 97% |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 77% |
| dsw.StaticD 1.0 | 17 | 65% |
| mme.NikeEnhanced 2.0 | 14 | 100% |
| sample.MyFirstRobot 1.0 | 12 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 28% | 48 |
| supersample.SuperBoxBot 1.0 | 12 | 21% | 42 |
| dsw.StaticD 1.0 | 11 | 19% | 24 |
| sample.Corners 1.0 | 6 | 11% | 10 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 13 |
| sample.MyFirstRobot 1.0 | 3 | 5% | 11 |
| sul.Lunar 1.1 | 2 | 4% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 3 |

## Melee bench: F18

hadur117.micro.SaorWN3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 80.7 | 115 / 210 | 2.74 | 18.3% | 36798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWN3 0.1 | 1.0 | 18.3% | 115 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 31 |
| mld.Wisdom 1.0 | 3.0 | 12.5% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.0 | 11.5% | 16 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.3% | 8 |
| amz.NanoClone 1.41 | 5.7 | 10.2% | 10 |
| sample.Walls 1.0 | 7.2 | 8.0% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 0 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 90.8 | 24 / 35 | 6429 |
| 2 | 1 | 66.0 | 74.3 | 18 / 35 | 6001 |
| 3 | 1 | 66.7 | 76.2 | 18 / 35 | 5939 |
| 4 | 1 | 65.5 | 77.1 | 14 / 35 | 5685 |
| 5 | 1 | 68.4 | 83.5 | 23 / 35 | 5955 |
| 6 | 1 | 68.6 | 82.2 | 18 / 35 | 6789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 51 | 90% |
| radnor.DoctorBob 1.42 | 24 | 63% |
| mld.Wisdom 1.0 | 15 | 87% |
| amz.NanoClone 1.41 | 12 | 92% |
| KiraNL.Chupacabra 0.4 | 12 | 100% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Walls 1.0 | 7 | 86% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 38 | 40% | 51 |
| radnor.DoctorBob 1.42 | 23 | 24% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 14% | 56 |
| KiraNL.Chupacabra 0.4 | 7 | 7% | 24 |
| amz.NanoClone 1.41 | 7 | 7% | 14 |
| jangs.ns51 1.0 | 4 | 4% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 1 | 1% | 8 |

