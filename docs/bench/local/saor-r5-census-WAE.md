# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.9 | 149 / 210 | 2.00 | 21.8% | 44964 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.8% | 149 |
| radnor.DoctorBob 1.42 | 2.5 | 14.1% | 20 |
| mz.AntiGrav 1.0 | 3.0 | 13.4% | 13 |
| mld.Infinity 2.2 | 3.5 | 13.0% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 7 |
| sample.Walls 1.0 | 6.7 | 6.5% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.2% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 91.4 | 24 / 35 | 7828 |
| 2 | 1 | 71.1 | 81.3 | 20 / 35 | 7009 |
| 3 | 1 | 71.4 | 89.2 | 24 / 35 | 6853 |
| 4 | 1 | 70.5 | 81.3 | 21 / 35 | 6997 |
| 5 | 1 | 74.7 | 94.6 | 29 / 35 | 8292 |
| 6 | 1 | 74.5 | 95.6 | 31 / 35 | 7985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 96% |
| radnor.DoctorBob 1.42 | 38 | 82% |
| mld.Infinity 2.2 | 31 | 94% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 6 | 83% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 34% | 63 |
| mz.AntiGrav 1.0 | 11 | 18% | 66 |
| amz.NanoClone 1.41 | 11 | 18% | 22 |
| mld.Infinity 2.2 | 6 | 10% | 32 |
| arthord.MannyPacquiao Beta | 5 | 8% | 9 |
| jangs.ns51 1.0 | 5 | 8% | 5 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 0 |

## Melee bench: F02

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.6 | 118 / 210 | 2.30 | 19.0% | 33706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.0% | 118 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.4% | 53 |
| mld.DustBunny 3.8 | 2.7 | 14.1% | 26 |
| maribo.melee.BMV 0.1 | 4.0 | 11.1% | 6 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 8.1% | 6 |
| fullsail.SweetTea 1.1 | 6.8 | 7.3% | 2 |
| zyx.nano.Ant 1.1 | 7.7 | 7.0% | 0 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.2 | 19 / 35 | 5543 |
| 2 | 1 | 69.9 | 88.3 | 22 / 35 | 5983 |
| 3 | 1 | 68.4 | 83.8 | 19 / 35 | 5657 |
| 4 | 1 | 69.2 | 88.3 | 21 / 35 | 5618 |
| 5 | 1 | 68.6 | 84.4 | 16 / 35 | 5762 |
| 6 | 1 | 68.3 | 85.4 | 21 / 35 | 5143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 57 | 77% |
| oog.melee.Mercutio 1.0 | 55 | 73% |
| maribo.melee.BMV 0.1 | 14 | 79% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 6 | 83% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 31 | 34% | 77 |
| oog.melee.Mercutio 1.0 | 30 | 33% | 70 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 11% | 16 |
| maribo.melee.BMV 0.1 | 8 | 9% | 17 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 8 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| fullsail.SweetTea 1.1 | 2 | 2% | 9 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 79.3 | 127 / 210 | 2.86 | 19.3% | 36844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.3% | 127 |
| myl.micro.Troodon 1.10 | 2.0 | 15.0% | 43 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 10.9% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.7% | 15 |
| cb.nano.Insomnia 1.0 | 4.3 | 10.4% | 11 |
| fm.mammillarias 1.3 | 5.7 | 9.5% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.8% | 5 |
| sample.Fire 1.0 | 9.3 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 72.4 | 18 / 35 | 5571 |
| 2 | 1 | 69.7 | 81.9 | 22 / 35 | 6207 |
| 3 | 1 | 70.6 | 83.5 | 23 / 35 | 6418 |
| 4 | 1 | 69.2 | 76.8 | 22 / 35 | 6155 |
| 5 | 1 | 69.1 | 81.3 | 23 / 35 | 5886 |
| 6 | 1 | 69.6 | 80.0 | 19 / 35 | 6607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 98% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 95% |
| fm.mammillarias 1.3 | 10 | 100% |
| myl.nano.KomoriNinja 1.1 | 8 | 88% |
| sp.Nanos.Ember 1.1 | 8 | 75% |
| cs.sheldor.Talon 1.1 | 6 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 20 | 24% | 42 |
| fm.mammillarias 1.3 | 16 | 19% | 19 |
| myl.micro.Troodon 1.10 | 14 | 17% | 66 |
| cb.nano.Insomnia 1.0 | 14 | 17% | 15 |
| myl.nano.KomoriNinja 1.1 | 6 | 7% | 30 |
| sample.Fire 1.0 | 5 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 16 |

## Melee bench: F04

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 89.7 | 154 / 210 | 1.92 | 21.4% | 41155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.4% | 154 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.5% | 17 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.6% | 15 |
| tj.zombie1n 1.0.1 | 5.7 | 8.7% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 8.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.0% | 8 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 30 / 35 | 6622 |
| 2 | 1 | 73.2 | 94.3 | 30 / 35 | 7294 |
| 3 | 1 | 71.0 | 87.0 | 25 / 35 | 6783 |
| 4 | 1 | 70.4 | 87.6 | 21 / 35 | 6655 |
| 5 | 1 | 71.1 | 86.3 | 23 / 35 | 7120 |
| 6 | 1 | 71.1 | 90.5 | 25 / 35 | 6681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 88% |
| stelo.SoJNanoMelee 1.1 | 41 | 88% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 19 | 68% |
| tj.zombie1n 1.0.1 | 11 | 91% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 30% | 83 |
| stelo.SoJNanoMelee 1.1 | 15 | 27% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 18% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 10 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 20 |
| repositorio.NanoStep 1.0 | 2 | 4% | 8 |
| tj.zombie1n 1.0.1 | 2 | 4% | 8 |
| yk.JahMicro 1.0 | 0 | 0% | 12 |
| sample.VelociRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F05

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 65.7 | 76 / 210 | 4.09 | 15.3% | 29447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 15.3% | 76 |
| oog.melee.Corsair 1.0 | 1.8 | 13.0% | 44 |
| ahf.NanoAndrew .4 | 3.3 | 11.8% | 37 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.8% | 25 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 4 |
| sam.Samspin 1.0 | 5.8 | 10.2% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.9% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.8% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.2% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.2 | 13 / 35 | 4973 |
| 2 | 1 | 59.9 | 57.5 | 11 / 35 | 4596 |
| 3 | 1 | 61.5 | 61.9 | 10 / 35 | 4863 |
| 4 | 1 | 66.0 | 74.3 | 18 / 35 | 5301 |
| 5 | 2 | 58.8 | 57.8 | 10 / 35 | 4350 |
| 6 | 1 | 65.1 | 72.7 | 14 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 35 | 54% |
| simonton.nano.MeleeSeed 1.8 | 34 | 76% |
| ahf.NanoAndrew .4 | 18 | 78% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sam.Samspin 1.0 | 8 | 75% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 28 | 21% | 49 |
| oog.melee.Corsair 1.0 | 27 | 20% | 42 |
| ahf.NanoAndrew .4 | 18 | 13% | 35 |
| robar.nano.Assertive_Melee 0.2 | 14 | 10% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 10% | 14 |
| zyx.nano.BacillusComma 1.0 | 11 | 8% | 15 |
| EBBU.Sim2 1.02 | 9 | 7% | 15 |
| sam.Samspin 1.0 | 7 | 5% | 12 |
| sample.TrackFire 1.0 | 7 | 5% | 8 |

## Melee bench: F06

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.7 | 137 / 210 | 2.11 | 19.9% | 35042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.9% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 30 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.0% | 16 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.7% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.6% | 1 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.2% | 7 |
| fm.claire 1.7 | 6.2 | 8.4% | 2 |
| pa.Improved 1.0 | 8.3 | 6.0% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.7% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 87.0 | 24 / 35 | 5645 |
| 2 | 1 | 71.6 | 94.0 | 25 / 35 | 6442 |
| 3 | 1 | 68.4 | 85.1 | 19 / 35 | 5303 |
| 4 | 1 | 69.1 | 84.4 | 21 / 35 | 5600 |
| 5 | 1 | 71.7 | 94.0 | 26 / 35 | 6446 |
| 6 | 1 | 68.2 | 81.6 | 22 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 82% |
| oog.melee.CapuletDroid 1.1 | 42 | 98% |
| gh.nano.Grofvuil 0.2 | 15 | 73% |
| arthord.NanoSatanMelee Beta | 11 | 82% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| fm.claire 1.7 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 38% | 91 |
| oog.melee.CapuletDroid 1.1 | 12 | 16% | 51 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 28 |
| arthord.NanoSatanMelee Beta | 11 | 15% | 16 |
| fm.claire 1.7 | 5 | 7% | 7 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 10 |
| kurios.DOSexe .9b | 1 | 1% | 4 |
| pa.Improved 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.3 | 102 / 210 | 2.78 | 18.4% | 36117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.4% | 102 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 37 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.6% | 30 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 33 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 2 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 4 |
| el.JumpShoot 0.2 | 7.5 | 6.2% | 1 |
| acogdev.alpha 0.2 | 8.3 | 5.7% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 77.1 | 15 / 35 | 6085 |
| 2 | 1 | 69.2 | 85.1 | 18 / 35 | 5838 |
| 3 | 1 | 65.6 | 71.4 | 13 / 35 | 5806 |
| 4 | 1 | 69.2 | 82.9 | 15 / 35 | 6171 |
| 5 | 1 | 69.3 | 84.1 | 22 / 35 | 6095 |
| 6 | 1 | 68.5 | 81.0 | 19 / 35 | 6122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 60 | 93% |
| mz.MicroGodMelee 1 | 32 | 63% |
| gh.micro.Gruweltje 0.7 | 22 | 64% |
| DBall.Anarchy 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 29 | 27% | 74 |
| gh.micro.Gruweltje 0.7 | 29 | 27% | 52 |
| mz.MicroGodMelee 1 | 25 | 23% | 47 |
| caimano.Furia_Ceca 0.22 | 10 | 9% | 13 |
| acogdev.alpha 0.2 | 8 | 7% | 9 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 71.2 | 110 / 210 | 3.59 | 16.9% | 32339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.2 | 16.9% | 110 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.3% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 8 |
| germ.TheMind .2 | 5.2 | 9.4% | 8 |
| awesomeness.Elite 1.0 | 6.7 | 8.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.0% | 9 |
| sample.Crazy 1.0 | 8.8 | 6.9% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 85.1 | 22 / 35 | 6300 |
| 2 | 1 | 67.7 | 78.7 | 20 / 35 | 5598 |
| 3 | 1 | 62.6 | 61.0 | 15 / 35 | 5209 |
| 4 | 1 | 63.1 | 64.1 | 15 / 35 | 5271 |
| 5 | 2 | 61.6 | 62.5 | 17 / 35 | 4479 |
| 6 | 1 | 67.2 | 75.9 | 21 / 35 | 5482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 81% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 83% |
| qualidafial.MajorDick 1.0.1 | 15 | 100% |
| germ.TheMind .2 | 7 | 71% |
| stelo.UntouchableNano 1.3 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| awesomeness.Elite 1.0 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 50 | 50% | 92 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 46 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 14 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 15 |
| germ.TheMind .2 | 6 | 6% | 13 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 5 |

## Melee bench: F09

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 90.1 | 154 / 210 | 1.90 | 20.8% | 34243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 20.8% | 154 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.0% | 11 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 6 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.4% | 3 |
| stelo.PatternRobot 1.0 | 7.7 | 7.9% | 6 |
| spinnercat.Omen 1.0 | 8.3 | 7.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 97.5 | 29 / 35 | 5917 |
| 2 | 1 | 69.8 | 83.2 | 26 / 35 | 5187 |
| 3 | 1 | 72.5 | 92.1 | 26 / 35 | 6130 |
| 4 | 1 | 71.4 | 89.8 | 26 / 35 | 5620 |
| 5 | 1 | 70.0 | 87.0 | 21 / 35 | 5108 |
| 6 | 1 | 72.0 | 90.8 | 26 / 35 | 6281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 86 | 93% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| timmit.nano.TimDog 0.33 | 16 | 81% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 21% | 75 |
| stelo.PatternRobot 1.0 | 10 | 18% | 18 |
| ratosh.Wesco 1.4 | 8 | 14% | 19 |
| timmit.nano.TimDog 0.33 | 7 | 13% | 18 |
| maribo.IotaCT 1.1 | 6 | 11% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 11% | 11 |
| nz.jdc.nano.GridFu 1.0 | 5 | 9% | 42 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |

## Melee bench: F10

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.0 | 157 / 210 | 1.99 | 21.4% | 42141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.4% | 157 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.0% | 18 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 7 |
| zyx.micro.Ant 1.1 | 4.5 | 10.0% | 11 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 6 |
| sanja.First 0.1 | 6.0 | 8.4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.6% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.7% | 1 |
| cvt.Firsty 1.0 | 8.7 | 7.2% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 77.8 | 21 / 35 | 6338 |
| 2 | 1 | 73.2 | 94.9 | 28 / 35 | 7726 |
| 3 | 1 | 71.0 | 88.3 | 27 / 35 | 6526 |
| 4 | 1 | 72.5 | 89.5 | 29 / 35 | 7469 |
| 5 | 1 | 71.0 | 90.2 | 24 / 35 | 6740 |
| 6 | 1 | 72.3 | 93.3 | 28 / 35 | 7342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 33 | 91% |
| tvv.nano.Polaris 1.2 | 33 | 91% |
| cvt.Firsty 1.0 | 26 | 92% |
| zyx.micro.Ant 1.1 | 23 | 83% |
| amk.Punbot.Punbot 0.01 | 20 | 100% |
| sanja.First 0.1 | 19 | 95% |
| Grystrion.TrackerWO 1.0 | 11 | 91% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 21% | 45 |
| baal.nano.N 1.42 | 9 | 17% | 41 |
| cvt.Firsty 1.0 | 8 | 15% | 21 |
| tvv.nano.Polaris 1.2 | 7 | 13% | 51 |
| Grystrion.TrackerWO 1.0 | 7 | 13% | 14 |
| sanja.First 0.1 | 5 | 9% | 20 |
| sample.RamFire 1.0 | 4 | 8% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.0 | 76 / 210 | 3.88 | 15.7% | 32847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.3 | 15.7% | 76 |
| kc.micro.Figment 1.0 | 1.8 | 15.3% | 64 |
| cs.Wren 1.0 | 3.0 | 12.7% | 19 |
| js.PinBall 1.6 | 4.0 | 11.5% | 21 |
| mz.Cork 0.1 | 5.0 | 10.4% | 11 |
| joe.ADinosaur 1.0 | 5.8 | 9.3% | 3 |
| evd.X1 0.01 | 7.2 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.6% | 5 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 68.9 | 9 / 35 | 5286 |
| 2 | 1 | 65.3 | 70.8 | 14 / 35 | 5844 |
| 3 | 1 | 64.1 | 70.2 | 12 / 35 | 5443 |
| 4 | 1 | 66.9 | 76.5 | 19 / 35 | 5789 |
| 5 | 1 | 61.9 | 61.9 | 14 / 35 | 5403 |
| 6 | 2 | 60.3 | 60.0 | 8 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 60% |
| cs.Wren 1.0 | 15 | 80% |
| mz.Cork 0.1 | 7 | 86% |
| js.PinBall 1.6 | 6 | 67% |
| joe.ADinosaur 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 66 | 49% | 117 |
| js.PinBall 1.6 | 20 | 15% | 25 |
| cs.Wren 1.0 | 13 | 10% | 21 |
| evd.X1 0.01 | 13 | 10% | 13 |
| joe.ADinosaur 1.0 | 9 | 7% | 10 |
| PSW.Relentless 0.1 | 6 | 4% | 7 |
| mz.Cork 0.1 | 4 | 3% | 9 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.7 | 132 / 210 | 2.47 | 19.2% | 30703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 19.2% | 132 |
| myl.nano.Graviton 1.10 | 2.5 | 11.8% | 21 |
| ntc.Opposite 1.5 | 3.2 | 11.4% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.3% | 3 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.4% | 6 |
| disan.Chair 2.2.0 | 6.2 | 8.9% | 6 |
| DBall.NUKE 0.1 | 7.8 | 7.1% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 5.9% | 3 |
| pbg.R2D2 1.0 | 10.0 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.4 | 25 / 35 | 5084 |
| 2 | 1 | 68.2 | 83.5 | 23 / 35 | 4695 |
| 3 | 1 | 70.2 | 88.3 | 22 / 35 | 5543 |
| 4 | 1 | 67.2 | 76.5 | 20 / 35 | 5255 |
| 5 | 1 | 67.6 | 82.2 | 22 / 35 | 4742 |
| 6 | 1 | 68.0 | 79.4 | 20 / 35 | 5384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 92% |
| stelo.AreaTargetingBot 1.1 | 32 | 84% |
| ntc.Opposite 1.5 | 21 | 86% |
| disan.Chair 2.2.0 | 21 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| donjezza.Muncho 1.0 | 11 | 91% |
| pfvicm.Sobieski 7.2.3b | 8 | 50% |
| DBall.NUKE 0.1 | 5 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 15 | 19% | 32 |
| ntc.Opposite 1.5 | 15 | 19% | 27 |
| myl.nano.Graviton 1.10 | 11 | 14% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 23 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 19 |
| disan.Chair 2.2.0 | 9 | 11% | 26 |
| pbg.R2D2 1.0 | 6 | 8% | 11 |
| DBall.NUKE 0.1 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.2 | 92 / 210 | 3.41 | 16.1% | 26798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.1% | 92 |
| oog.melee.Capulet 1.2 | 2.8 | 13.9% | 50 |
| kawigi.micro.Shiz 1.1 | 3.3 | 13.1% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 30 |
| yagami.Tidus 0.11 | 4.8 | 12.3% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.6% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.7 | 14 / 35 | 4413 |
| 2 | 1 | 64.5 | 69.8 | 16 / 35 | 4401 |
| 3 | 1 | 65.2 | 72.7 | 15 / 35 | 4776 |
| 4 | 1 | 66.2 | 76.8 | 17 / 35 | 4558 |
| 5 | 1 | 66.6 | 76.8 | 18 / 35 | 4429 |
| 6 | 1 | 62.3 | 63.5 | 12 / 35 | 4221 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 81% |
| kawigi.micro.Shiz 1.1 | 23 | 100% |
| yagami.Tidus 0.11 | 17 | 100% |
| ejb.Polaris 1.0.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 38% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 17% | 46 |
| yagami.Tidus 0.11 | 19 | 16% | 36 |
| kawigi.micro.Shiz 1.1 | 13 | 11% | 32 |
| ejb.Polaris 1.0.1 | 10 | 8% | 14 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.0 | 126 / 210 | 2.89 | 17.7% | 28967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 17.7% | 126 |
| bzdp.Pansy 2.1 | 2.7 | 12.9% | 21 |
| ratosh.Nobo 0.21 | 3.2 | 11.7% | 20 |
| wee.Gem 1.8.4 | 4.2 | 11.5% | 22 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 5.8 | 9.9% | 9 |
| bayen.UbaMicro 1.4 | 6.7 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.5% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.0 | 20 / 35 | 4547 |
| 2 | 1 | 63.5 | 67.9 | 16 / 35 | 4571 |
| 3 | 1 | 68.7 | 83.5 | 25 / 35 | 5192 |
| 4 | 1 | 66.4 | 79.7 | 18 / 35 | 4710 |
| 5 | 1 | 69.0 | 85.7 | 25 / 35 | 5192 |
| 6 | 1 | 65.7 | 76.2 | 22 / 35 | 4755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 63 | 90% |
| wee.Gem 1.8.4 | 29 | 100% |
| wompi.Quokka 1.6 | 17 | 100% |
| m3thos.Eva00 1.1 | 15 | 80% |
| ratosh.Nobo 0.21 | 12 | 58% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 414. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 18% | 24 |
| maribo.FollowFire 1 | 12 | 14% | 14 |
| bzdp.Pansy 2.1 | 11 | 13% | 60 |
| wee.Gem 1.8.4 | 11 | 13% | 45 |
| stelo.MyAgileRobot 0.2 | 10 | 12% | 10 |
| m3thos.Eva00 1.1 | 8 | 9% | 21 |
| wompi.Quokka 1.6 | 7 | 8% | 21 |
| bayen.UbaMicro 1.4 | 7 | 8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 85.7 | 112 / 210 | 2.29 | 21.3% | 50051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.3% | 112 |
| wompi.Wallaby 5.1 | 2.0 | 18.2% | 78 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 12 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 6 |
| ayk.WallHugger 1.0 | 5.3 | 8.7% | 0 |
| stuff.Vlad 0.1 | 5.7 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 6.3 | 8.2% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 1 |
| sample.SittingDuck 1.0 | 9.0 | 3.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 86.0 | 20 / 35 | 8046 |
| 2 | 1 | 71.4 | 79.0 | 15 / 35 | 8199 |
| 3 | 1 | 73.0 | 87.6 | 20 / 35 | 8250 |
| 4 | 1 | 73.5 | 90.8 | 18 / 35 | 8421 |
| 5 | 1 | 72.7 | 85.1 | 22 / 35 | 8096 |
| 6 | 1 | 73.0 | 85.7 | 17 / 35 | 9039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 73% |
| mz.NanoGod 2.02 | 15 | 87% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| ayk.WallHugger 1.0 | 4 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 56 | 57% | 141 |
| mz.NanoGod 2.02 | 24 | 24% | 37 |
| exauge.GateKeeper 1.1.121g | 8 | 8% | 14 |
| ayk.WallHugger 1.0 | 5 | 5% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.0 | 103 / 210 | 3.43 | 16.6% | 28436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 16.6% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.6% | 34 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.9% | 22 |
| bvh.micro.Freya 0.3 | 3.8 | 11.9% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 10.6% | 16 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 6 |
| conscience.Electron 1.3g | 7.2 | 7.7% | 3 |
| ap.Frederick 1.1 | 8.0 | 6.9% | 9 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 70.5 | 14 / 35 | 4473 |
| 2 | 1 | 64.5 | 73.3 | 18 / 35 | 4609 |
| 3 | 1 | 68.1 | 82.9 | 19 / 35 | 5409 |
| 4 | 1 | 65.4 | 73.0 | 17 / 35 | 4966 |
| 5 | 1 | 62.0 | 64.8 | 16 / 35 | 4185 |
| 6 | 1 | 65.0 | 73.3 | 19 / 35 | 4794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 87% |
| dummy.micro.Sparrow 2.5 | 26 | 85% |
| bvh.micro.Freya 0.3 | 24 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 80% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 2 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 25% | 63 |
| conscience.Electron 1.3g | 17 | 16% | 18 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 41 |
| bvh.micro.Freya 0.3 | 13 | 12% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 11% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 9% | 27 |
| dl.BetterWalls 1.0 | 8 | 7% | 8 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 12 |

## Melee bench: F17

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 87.7 | 150 / 210 | 2.11 | 21.8% | 44741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 21.8% | 150 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.7% | 16 |
| sul.Lunar 1.1 | 3.2 | 11.6% | 8 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.8% | 13 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 5 |
| dsw.StaticD 1.0 | 6.0 | 8.5% | 9 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.4% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.4% | 6 |
| sample.Corners 1.0 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.0 | 23 / 35 | 7265 |
| 2 | 1 | 71.7 | 86.3 | 23 / 35 | 7373 |
| 3 | 1 | 71.8 | 85.7 | 22 / 35 | 7919 |
| 4 | 1 | 74.1 | 95.6 | 30 / 35 | 7672 |
| 5 | 1 | 72.0 | 88.6 | 26 / 35 | 7295 |
| 6 | 1 | 71.1 | 82.9 | 26 / 35 | 7217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 59 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 38 | 92% |
| supersample.SuperBoxBot 1.0 | 31 | 81% |
| dsw.StaticD 1.0 | 11 | 45% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 75% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 20 | 33% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 22% | 50 |
| dsw.StaticD 1.0 | 13 | 22% | 26 |
| mme.NikeEnhanced 2.0 | 8 | 13% | 12 |
| sul.Lunar 1.1 | 3 | 5% | 67 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 10 |
| sample.Corners 1.0 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAE 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 79.8 | 106 / 210 | 2.82 | 18.5% | 38605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAE 0.1 | 1.0 | 18.5% | 106 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 35 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.5% | 18 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 7 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 14 |
| GarmBox.Oranges 1.0 | 7.7 | 6.9% | 0 |
| sample.Walls 1.0 | 7.7 | 7.3% | 4 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 77.8 | 14 / 35 | 6615 |
| 2 | 1 | 67.3 | 76.8 | 16 / 35 | 6325 |
| 3 | 1 | 69.0 | 83.2 | 22 / 35 | 6304 |
| 4 | 1 | 69.2 | 83.2 | 19 / 35 | 6497 |
| 5 | 1 | 68.8 | 82.9 | 20 / 35 | 6340 |
| 6 | 1 | 67.0 | 74.9 | 15 / 35 | 6524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 65% |
| davidalves.net.DuelistNanoMelee 1.01 | 36 | 92% |
| mld.Wisdom 1.0 | 27 | 67% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| amz.NanoClone 1.41 | 9 | 67% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Walls 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 28% | 58 |
| mld.Wisdom 1.0 | 25 | 24% | 46 |
| KiraNL.Chupacabra 0.4 | 17 | 16% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 15% | 47 |
| amz.NanoClone 1.41 | 8 | 8% | 17 |
| sample.Walls 1.0 | 4 | 4% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |

