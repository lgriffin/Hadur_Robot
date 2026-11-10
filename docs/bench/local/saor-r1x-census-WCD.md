# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 81.2 | 128 / 210 | 2.70 | 19.4% | 40809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 19.4% | 128 |
| radnor.DoctorBob 1.42 | 2.7 | 14.5% | 23 |
| mz.AntiGrav 1.0 | 2.7 | 14.3% | 22 |
| mld.Infinity 2.2 | 3.7 | 13.4% | 25 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 7 |
| sample.Walls 1.0 | 6.2 | 7.4% | 3 |
| GarmBox.Oranges 1.0 | 7.0 | 6.9% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 9.3 | 4.4% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 85.4 | 24 / 35 | 7274 |
| 2 | 1 | 68.0 | 76.8 | 18 / 35 | 6335 |
| 3 | 1 | 67.9 | 74.9 | 18 / 35 | 6443 |
| 4 | 1 | 69.6 | 80.6 | 21 / 35 | 6928 |
| 5 | 1 | 71.2 | 85.7 | 24 / 35 | 6993 |
| 6 | 1 | 70.5 | 83.5 | 23 / 35 | 6836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 64 | 94% |
| mld.Infinity 2.2 | 31 | 100% |
| radnor.DoctorBob 1.42 | 24 | 88% |
| amz.NanoClone 1.41 | 5 | 40% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 539. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 51% | 74 |
| mz.AntiGrav 1.0 | 18 | 22% | 70 |
| mld.Infinity 2.2 | 10 | 12% | 36 |
| amz.NanoClone 1.41 | 9 | 11% | 11 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.6 | 123 / 210 | 2.39 | 18.6% | 33124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 18.6% | 123 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.6% | 46 |
| mld.DustBunny 3.8 | 3.0 | 13.6% | 17 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 3 |
| zyx.nano.Ant 1.1 | 5.3 | 8.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 5 |
| bzdp.BoxCar 2.0 | 7.8 | 7.6% | 1 |
| fullsail.SweetTea 1.1 | 8.5 | 6.3% | 1 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 22 / 35 | 5608 |
| 2 | 1 | 69.0 | 85.4 | 21 / 35 | 5706 |
| 3 | 1 | 67.5 | 82.5 | 19 / 35 | 5404 |
| 4 | 1 | 66.6 | 80.6 | 16 / 35 | 5340 |
| 5 | 1 | 66.9 | 80.0 | 21 / 35 | 5107 |
| 6 | 1 | 70.6 | 93.0 | 24 / 35 | 5959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 61 | 89% |
| oog.melee.Mercutio 1.0 | 54 | 70% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 78% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 34 | 39% | 81 |
| mld.DustBunny 3.8 | 21 | 24% | 64 |
| maribo.melee.BMV 0.1 | 10 | 11% | 14 |
| zyx.nano.Ant 1.1 | 7 | 8% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5 | 6% | 14 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 3% | 14 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 3 | 3% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.6 | 144 / 210 | 2.11 | 20.7% | 38991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 20.7% | 144 |
| myl.micro.Troodon 1.10 | 2.3 | 12.8% | 23 |
| myl.nano.KomoriNinja 1.1 | 2.7 | 12.3% | 11 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 11.0% | 15 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.7% | 11 |
| fm.mammillarias 1.3 | 6.5 | 8.7% | 1 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 5 |
| sample.Tracker 1.0 | 9.3 | 4.8% | 0 |
| sample.Fire 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 91.4 | 27 / 35 | 7004 |
| 2 | 1 | 68.8 | 82.5 | 19 / 35 | 5760 |
| 3 | 1 | 71.0 | 90.8 | 24 / 35 | 6381 |
| 4 | 1 | 71.3 | 89.8 | 26 / 35 | 6556 |
| 5 | 1 | 70.9 | 85.4 | 22 / 35 | 6926 |
| 6 | 1 | 70.5 | 85.7 | 26 / 35 | 6364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 46 | 91% |
| stelo.SoRobotNanoMelee 1.2 | 41 | 85% |
| cb.nano.Insomnia 1.0 | 25 | 96% |
| myl.nano.KomoriNinja 1.1 | 18 | 89% |
| sp.Nanos.Ember 1.1 | 15 | 87% |
| sample.Fire 1.0 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 17 | 26% | 53 |
| myl.nano.KomoriNinja 1.1 | 12 | 18% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 18% | 41 |
| cb.nano.Insomnia 1.0 | 8 | 12% | 19 |
| fm.mammillarias 1.3 | 8 | 12% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 19 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 13 |
| sample.Tracker 1.0 | 2 | 3% | 4 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 84.6 | 137 / 210 | 2.39 | 20.1% | 40548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 20.1% | 137 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.3% | 18 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 16 |
| tj.zombie1n 1.0.1 | 4.3 | 9.4% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 8.7% | 20 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 9.2 | 6.6% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 87.6 | 23 / 35 | 7216 |
| 2 | 1 | 69.8 | 83.5 | 23 / 35 | 6657 |
| 3 | 1 | 69.7 | 85.1 | 24 / 35 | 6464 |
| 4 | 1 | 71.0 | 86.3 | 25 / 35 | 7232 |
| 5 | 1 | 68.8 | 81.6 | 21 / 35 | 6533 |
| 6 | 1 | 69.3 | 83.5 | 21 / 35 | 6446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 54 | 94% |
| stelo.SoJNanoMelee 1.1 | 36 | 89% |
| tj.zombie1n 1.0.1 | 19 | 84% |
| tvv.micro.Antares 1.1.1 | 16 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 33% | 80 |
| stelo.SoJNanoMelee 1.1 | 12 | 16% | 27 |
| tvv.micro.Antares 1.1.1 | 9 | 12% | 32 |
| tj.zombie1n 1.0.1 | 8 | 11% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 8% | 21 |
| sample.VelociRobot 1.0 | 3 | 4% | 6 |
| repositorio.NanoStep 1.0 | 2 | 3% | 11 |
| yk.JahMicro 1.0 | 2 | 3% | 9 |

## Melee bench: F05

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 71.7 | 91 / 210 | 3.55 | 15.9% | 29788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 15.9% | 91 |
| oog.melee.Corsair 1.0 | 2.2 | 12.8% | 30 |
| ahf.NanoAndrew .4 | 3.3 | 12.1% | 34 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.2% | 25 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 10 |
| EBBU.Sim2 1.02 | 6.0 | 9.4% | 7 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.1% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.2 | 65.1 | 14 / 35 | 4603 |
| 2 | 1 | 64.3 | 74.9 | 14 / 35 | 4990 |
| 3 | 1 | 65.3 | 73.7 | 20 / 35 | 5227 |
| 4 | 1 | 63.3 | 71.7 | 15 / 35 | 4734 |
| 5 | 1 | 63.6 | 70.2 | 14 / 35 | 5251 |
| 6 | 1 | 64.3 | 74.6 | 14 / 35 | 4983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 88% |
| oog.melee.Corsair 1.0 | 31 | 68% |
| ahf.NanoAndrew .4 | 21 | 62% |
| EBBU.Sim2 1.02 | 12 | 100% |
| sam.Samspin 1.0 | 10 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 32 | 27% | 44 |
| oog.melee.Corsair 1.0 | 21 | 18% | 43 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 44 |
| robar.nano.Assertive_Melee 0.2 | 14 | 12% | 20 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 15 |
| sam.Samspin 1.0 | 10 | 8% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 6% | 8 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.7 | 114 / 210 | 2.82 | 17.9% | 32785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 17.9% | 114 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 39 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 20 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.2% | 16 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.8% | 7 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 5 |
| fm.claire 1.7 | 7.0 | 8.2% | 2 |
| sample.SpinBot 1.0 | 7.3 | 7.8% | 5 |
| pa.Improved 1.0 | 9.0 | 6.3% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.1 | 17 / 35 | 5485 |
| 2 | 1 | 68.8 | 89.2 | 23 / 35 | 5286 |
| 3 | 1 | 64.9 | 71.7 | 15 / 35 | 5560 |
| 4 | 1 | 66.0 | 74.0 | 18 / 35 | 5463 |
| 5 | 1 | 68.1 | 84.8 | 21 / 35 | 5459 |
| 6 | 1 | 67.6 | 81.6 | 20 / 35 | 5532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 56 | 84% |
| oog.melee.CapuletDroid 1.1 | 34 | 91% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| gh.nano.Grofvuil 0.2 | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| sample.SpinBot 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 25% | 62 |
| gh.nano.Grofvuil 0.2 | 17 | 18% | 28 |
| oog.melee.CapuletDroid 1.1 | 10 | 10% | 40 |
| arthord.NanoSatanMelee Beta | 10 | 10% | 19 |
| fm.claire 1.7 | 10 | 10% | 14 |
| winamp32.micro.MicroMacro 1.0 | 9 | 9% | 17 |
| sample.SpinBot 1.0 | 9 | 9% | 14 |
| kurios.DOSexe .9b | 7 | 7% | 13 |
| pa.Improved 1.0 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 76.4 | 97 / 210 | 3.12 | 17.2% | 34485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.2 | 17.2% | 97 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.5% | 44 |
| mz.MicroGodMelee 1 | 3.3 | 13.9% | 26 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 13.3% | 31 |
| DBall.Anarchy 0.1 | 5.5 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 4 |
| acogdev.alpha 0.2 | 7.0 | 7.0% | 2 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.7% | 3 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 70.8 | 13 / 35 | 5864 |
| 2 | 1 | 64.3 | 69.8 | 14 / 35 | 5432 |
| 3 | 1 | 67.4 | 78.4 | 15 / 35 | 6183 |
| 4 | 1 | 66.8 | 78.1 | 18 / 35 | 5738 |
| 5 | 1 | 68.0 | 81.3 | 22 / 35 | 5641 |
| 6 | 1 | 67.2 | 80.0 | 15 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 39 | 72% |
| spinnercat.micro.Tyger 0.1 | 38 | 84% |
| gh.micro.Gruweltje 0.7 | 18 | 83% |
| DBall.Anarchy 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 45 | 40% | 76 |
| gh.micro.Gruweltje 0.7 | 35 | 31% | 56 |
| spinnercat.micro.Tyger 0.1 | 18 | 16% | 46 |
| acogdev.alpha 0.2 | 5 | 4% | 8 |
| caimano.Furia_Ceca 0.22 | 5 | 4% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 74.8 | 118 / 210 | 3.27 | 17.2% | 32827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.2 | 17.2% | 118 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 16.4% | 52 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 21 |
| germ.TheMind .2 | 5.2 | 9.4% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.2 | 9.0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| awesomeness.Elite 1.0 | 6.5 | 8.1% | 2 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.4% | 4 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 73.7 | 19 / 35 | 5467 |
| 2 | 1 | 64.2 | 68.9 | 18 / 35 | 5056 |
| 3 | 1 | 66.2 | 73.0 | 22 / 35 | 5671 |
| 4 | 1 | 68.0 | 79.0 | 21 / 35 | 5864 |
| 5 | 1 | 67.5 | 84.1 | 20 / 35 | 5228 |
| 6 | 2 | 65.0 | 69.8 | 18 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 82% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 95% |
| germ.TheMind .2 | 7 | 100% |
| awesomeness.Elite 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 46% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 13% | 33 |
| awesomeness.Elite 1.0 | 11 | 12% | 20 |
| germ.TheMind .2 | 11 | 12% | 19 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 13 |
| mym.EdgeStalker 1.0 | 5 | 5% | 6 |
| stelo.UntouchableNano 1.3 | 3 | 3% | 10 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 79.6 | 123 / 210 | 2.84 | 18.3% | 31324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 18.3% | 123 |
| rz.HawkOnFire 0.1 | 2.2 | 14.2% | 30 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.1% | 19 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 4 |
| timmit.nano.TimDog 0.33 | 5.2 | 10.1% | 14 |
| ratosh.Wesco 1.4 | 7.7 | 8.2% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.3 | 7.4% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 76.8 | 20 / 35 | 5279 |
| 2 | 1 | 69.4 | 83.8 | 19 / 35 | 5382 |
| 3 | 1 | 67.9 | 78.4 | 20 / 35 | 5063 |
| 4 | 1 | 67.4 | 74.6 | 21 / 35 | 5212 |
| 5 | 1 | 68.0 | 80.6 | 20 / 35 | 5079 |
| 6 | 1 | 69.0 | 83.2 | 23 / 35 | 5309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 66 | 91% |
| nz.jdc.nano.GridFu 1.0 | 31 | 97% |
| ratosh.Wesco 1.4 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| stelo.PatternRobot 1.0 | 7 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 23 | 26% | 60 |
| timmit.nano.TimDog 0.33 | 18 | 21% | 26 |
| nz.jdc.nano.GridFu 1.0 | 14 | 16% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 13% | 20 |
| ratosh.Wesco 1.4 | 7 | 8% | 17 |
| stelo.PatternRobot 1.0 | 7 | 8% | 11 |
| maribo.IotaCT 1.1 | 5 | 6% | 8 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.1 | 176 / 210 | 1.62 | 22.2% | 42353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 22.2% | 176 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.1% | 12 |
| baal.nano.N 1.42 | 2.7 | 11.6% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 3 |
| zyx.micro.Ant 1.1 | 5.7 | 8.7% | 5 |
| sanja.First 0.1 | 6.0 | 8.5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.0% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.2% | 3 |
| cvt.Firsty 1.0 | 8.0 | 6.9% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.7 | 30 / 35 | 7186 |
| 2 | 1 | 72.8 | 95.9 | 29 / 35 | 7078 |
| 3 | 1 | 72.2 | 91.4 | 28 / 35 | 7407 |
| 4 | 1 | 72.6 | 94.9 | 33 / 35 | 6857 |
| 5 | 1 | 71.9 | 92.1 | 28 / 35 | 6691 |
| 6 | 1 | 72.2 | 91.4 | 28 / 35 | 7134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 39 | 95% |
| baal.nano.N 1.42 | 34 | 88% |
| cvt.Firsty 1.0 | 28 | 96% |
| sanja.First 0.1 | 26 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 24% | 34 |
| Grystrion.TrackerWO 1.0 | 7 | 21% | 25 |
| tvv.nano.Polaris 1.2 | 6 | 18% | 64 |
| amk.Punbot.Punbot 0.01 | 6 | 18% | 8 |
| sanja.First 0.1 | 3 | 9% | 24 |
| zyx.micro.Ant 1.1 | 3 | 9% | 22 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 10 |
| cvt.Firsty 1.0 | 0 | 0% | 21 |

## Melee bench: F11

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 62.8 | 68 / 210 | 4.35 | 14.3% | 30714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.9% | 77 |
| hadur117.micro.SaorWCD 0.1 | 1.8 | 14.3% | 68 |
| cs.Wren 1.0 | 3.2 | 12.8% | 13 |
| js.PinBall 1.6 | 4.2 | 11.5% | 18 |
| mz.Cork 0.1 | 4.7 | 11.2% | 17 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 3 |
| evd.X1 0.01 | 7.3 | 7.4% | 3 |
| jsal.Jsalbot 1.0 | 7.7 | 7.0% | 7 |
| PSW.Relentless 0.1 | 9.5 | 5.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 60.6 | 13 / 35 | 5270 |
| 2 | 1 | 62.1 | 63.5 | 12 / 35 | 5342 |
| 3 | 2 | 61.0 | 64.8 | 10 / 35 | 4709 |
| 4 | 2 | 61.8 | 65.4 | 12 / 35 | 4992 |
| 5 | 2 | 57.9 | 54.9 | 8 / 35 | 4865 |
| 6 | 2 | 63.4 | 67.3 | 13 / 35 | 5536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 52 | 63% |
| cs.Wren 1.0 | 16 | 100% |
| mz.Cork 0.1 | 8 | 75% |
| js.PinBall 1.6 | 6 | 67% |
| joe.ADinosaur 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 39% | 93 |
| cs.Wren 1.0 | 22 | 15% | 33 |
| mz.Cork 0.1 | 19 | 13% | 25 |
| js.PinBall 1.6 | 15 | 11% | 19 |
| joe.ADinosaur 1.0 | 14 | 10% | 18 |
| evd.X1 0.01 | 9 | 6% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| jsal.Jsalbot 1.0 | 2 | 1% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.6 | 117 / 210 | 3.38 | 16.9% | 29314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 16.9% | 117 |
| ntc.Opposite 1.5 | 3.3 | 11.2% | 8 |
| pfvicm.Sobieski 7.2.3b | 3.7 | 11.0% | 4 |
| myl.nano.Graviton 1.10 | 3.7 | 11.4% | 25 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.3% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 5.7 | 9.9% | 4 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 12 |
| DBall.NUKE 0.1 | 7.7 | 8.5% | 11 |
| donjezza.Muncho 1.0 | 9.0 | 6.4% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 66.3 | 15 / 35 | 4999 |
| 2 | 1 | 69.2 | 87.0 | 27 / 35 | 5229 |
| 3 | 1 | 66.3 | 77.5 | 22 / 35 | 4973 |
| 4 | 1 | 64.1 | 69.2 | 19 / 35 | 4794 |
| 5 | 1 | 60.7 | 64.1 | 13 / 35 | 4147 |
| 6 | 1 | 66.7 | 77.5 | 21 / 35 | 5172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 29 | 79% |
| myl.nano.Graviton 1.10 | 28 | 96% |
| ntc.Opposite 1.5 | 15 | 87% |
| DBall.NUKE 0.1 | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| donjezza.Muncho 1.0 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 30 | 31% | 37 |
| stelo.AreaTargetingBot 1.1 | 24 | 25% | 41 |
| ntc.Opposite 1.5 | 11 | 11% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 22 |
| myl.nano.Graviton 1.10 | 8 | 8% | 36 |
| disan.Chair 2.2.0 | 6 | 6% | 14 |
| DBall.NUKE 0.1 | 5 | 5% | 20 |
| donjezza.Muncho 1.0 | 1 | 1% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 57.7 | 45 / 210 | 4.81 | 12.9% | 25264 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.3 | 15.4% | 65 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 43 |
| yagami.Tidus 0.11 | 3.3 | 12.8% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 29 |
| hadur117.micro.SaorWCD 0.1 | 4.0 | 12.9% | 45 |
| ejb.Polaris 1.0.1 | 5.7 | 11.2% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 57.8 | 10 / 35 | 4240 |
| 2 | 5 | 56.5 | 50.5 | 5 / 35 | 4052 |
| 3 | 1 | 64.3 | 71.4 | 12 / 35 | 4686 |
| 4 | 4 | 59.3 | 58.4 | 8 / 35 | 4048 |
| 5 | 4 | 58.5 | 54.0 | 7 / 35 | 4196 |
| 6 | 6 | 57.2 | 54.0 | 3 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 53% |
| yagami.Tidus 0.11 | 11 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 100% |
| kawigi.micro.Shiz 1.1 | 10 | 90% |
| ejb.Polaris 1.0.1 | 3 | 33% |

Hadur died in 165 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 61 | 37% | 76 |
| ejb.Polaris 1.0.1 | 27 | 16% | 31 |
| yagami.Tidus 0.11 | 22 | 13% | 29 |
| kawigi.micro.Shiz 1.1 | 15 | 9% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 7% | 21 |
| step.nanoPri 1.0 | 11 | 7% | 11 |
| stelo.MirrorNano 1.3 | 10 | 6% | 12 |
| kurios.DOSexe .9a | 7 | 4% | 7 |

## Melee bench: F14

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.5 | 107 / 210 | 3.57 | 16.0% | 27948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 16.0% | 107 |
| wee.Gem 1.8.4 | 2.7 | 12.5% | 36 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 20 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 15 |
| ratosh.Nobo 0.21 | 4.7 | 10.9% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 9.6% | 10 |
| bayen.UbaMicro 1.4 | 6.3 | 9.6% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.0% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 74.3 | 17 / 35 | 5049 |
| 2 | 1 | 64.2 | 72.4 | 21 / 35 | 4358 |
| 3 | 1 | 61.5 | 66.7 | 18 / 35 | 4340 |
| 4 | 1 | 62.7 | 68.3 | 17 / 35 | 4700 |
| 5 | 1 | 62.8 | 68.3 | 15 / 35 | 4546 |
| 6 | 1 | 66.3 | 79.0 | 19 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 93% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 17 | 88% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| ratosh.Nobo 0.21 | 8 | 88% |
| m3thos.Eva00 1.1 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 16 | 15% | 49 |
| bzdp.Pansy 2.1 | 15 | 14% | 50 |
| wompi.Quokka 1.6 | 15 | 14% | 27 |
| ratosh.Nobo 0.21 | 15 | 14% | 22 |
| bayen.UbaMicro 1.4 | 12 | 12% | 19 |
| maribo.FollowFire 1 | 12 | 12% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 9% | 11 |
| m3thos.Eva00 1.1 | 7 | 7% | 15 |
| stelo.MyAgileRobot 0.2 | 3 | 3% | 6 |

## Melee bench: F15

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 78.3 | 89 / 210 | 2.96 | 19.0% | 44917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.3 | 19.0% | 89 |
| wompi.Wallaby 5.1 | 1.7 | 18.5% | 93 |
| mz.NanoGod 2.02 | 3.0 | 14.9% | 19 |
| ayk.WallHugger 1.0 | 4.2 | 10.3% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 7 |
| stuff.Vlad 0.1 | 6.5 | 8.2% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.8% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 79.7 | 16 / 35 | 7585 |
| 2 | 1 | 68.9 | 76.8 | 16 / 35 | 6907 |
| 3 | 2 | 69.7 | 78.4 | 13 / 35 | 7762 |
| 4 | 1 | 69.5 | 78.1 | 13 / 35 | 7493 |
| 5 | 1 | 71.0 | 81.6 | 16 / 35 | 7648 |
| 6 | 2 | 69.1 | 74.9 | 15 / 35 | 7522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 90 | 66% |
| mz.NanoGod 2.02 | 14 | 64% |
| exauge.GateKeeper 1.1.121g | 12 | 75% |
| ayk.WallHugger 1.0 | 8 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 54 | 45% | 119 |
| mz.NanoGod 2.02 | 44 | 36% | 53 |
| exauge.GateKeeper 1.1.121g | 11 | 9% | 14 |
| ayk.WallHugger 1.0 | 5 | 4% | 12 |
| stuff.Vlad 0.1 | 3 | 2% | 6 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.0 | 94 / 210 | 3.79 | 15.8% | 29573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.2 | 15.8% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 26 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.0% | 25 |
| bvh.micro.Freya 0.3 | 4.2 | 10.8% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.9% | 24 |
| stelo.MirrorMicro 1.0 | 5.7 | 9.4% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 2 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 9 |
| dl.BetterWalls 1.0 | 8.7 | 7.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 67.0 | 16 / 35 | 4439 |
| 2 | 2 | 62.8 | 66.3 | 15 / 35 | 4917 |
| 3 | 1 | 62.5 | 66.0 | 14 / 35 | 4862 |
| 4 | 1 | 63.8 | 68.6 | 17 / 35 | 5092 |
| 5 | 1 | 65.4 | 74.9 | 16 / 35 | 5310 |
| 6 | 1 | 64.3 | 71.1 | 16 / 35 | 4953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| dummy.micro.Sparrow 2.5 | 25 | 76% |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 44% |
| bvh.micro.Freya 0.3 | 11 | 91% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 19% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 17% | 36 |
| dummy.micro.Sparrow 2.5 | 17 | 15% | 40 |
| bvh.micro.Freya 0.3 | 14 | 12% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 12% | 13 |
| conscience.Electron 1.3g | 11 | 9% | 18 |
| dl.BetterWalls 1.0 | 10 | 9% | 16 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 15 |

## Melee bench: F17

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 81.6 | 137 / 210 | 2.65 | 20.4% | 44179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.0 | 20.4% | 137 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 22 |
| sul.Lunar 1.1 | 3.3 | 11.6% | 16 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.3% | 17 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.8% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.8 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.1% | 5 |
| sample.Corners 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 84.1 | 23 / 35 | 7102 |
| 2 | 1 | 68.8 | 75.9 | 18 / 35 | 7023 |
| 3 | 1 | 71.4 | 85.4 | 24 / 35 | 7431 |
| 4 | 1 | 70.0 | 81.0 | 21 / 35 | 7302 |
| 5 | 1 | 71.4 | 84.8 | 26 / 35 | 7544 |
| 6 | 1 | 70.6 | 78.7 | 25 / 35 | 7777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 48 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 47 | 94% |
| supersample.SuperBoxBot 1.0 | 19 | 74% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dsw.StaticD 1.0 | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 21 | 29% | 63 |
| supersample.SuperBoxBot 1.0 | 21 | 29% | 32 |
| dsw.StaticD 1.0 | 13 | 18% | 22 |
| sul.Lunar 1.1 | 5 | 7% | 52 |
| mme.NikeEnhanced 2.0 | 4 | 5% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 9 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 7 |
| sample.Corners 1.0 | 2 | 3% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 10 |

## Melee bench: F18

hadur117.micro.SaorWCD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 66.7 | 87 / 210 | 4.00 | 15.6% | 34393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWCD 0.1 | 1.2 | 15.6% | 87 |
| radnor.DoctorBob 1.42 | 1.8 | 14.1% | 41 |
| mld.Wisdom 1.0 | 3.7 | 12.3% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 26 |
| amz.NanoClone 1.41 | 4.7 | 10.9% | 15 |
| KiraNL.Chupacabra 0.4 | 6.0 | 9.5% | 9 |
| sample.Walls 1.0 | 7.2 | 8.4% | 10 |
| GarmBox.Oranges 1.0 | 7.8 | 7.5% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 67.0 | 14 / 35 | 6033 |
| 2 | 1 | 64.9 | 69.5 | 16 / 35 | 5826 |
| 3 | 1 | 65.6 | 72.4 | 16 / 35 | 6411 |
| 4 | 1 | 60.3 | 60.0 | 10 / 35 | 5316 |
| 5 | 1 | 64.4 | 71.7 | 17 / 35 | 5245 |
| 6 | 2 | 61.8 | 59.7 | 14 / 35 | 5562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 86% |
| radnor.DoctorBob 1.42 | 26 | 65% |
| mld.Wisdom 1.0 | 14 | 86% |
| amz.NanoClone 1.41 | 11 | 91% |
| sample.Walls 1.0 | 9 | 100% |
| sample.Target 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 423. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 28% | 60 |
| mld.Wisdom 1.0 | 34 | 28% | 43 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 14% | 49 |
| KiraNL.Chupacabra 0.4 | 17 | 14% | 18 |
| amz.NanoClone 1.41 | 10 | 8% | 17 |
| GarmBox.Oranges 1.0 | 5 | 4% | 8 |
| sample.Walls 1.0 | 3 | 2% | 9 |
| jangs.ns51 1.0 | 3 | 2% | 5 |

