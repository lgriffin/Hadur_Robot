# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 87.2 | 125 / 210 | 2.15 | 20.3% | 39866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 20.3% | 125 |
| radnor.DoctorBob 1.42 | 2.5 | 14.4% | 27 |
| mz.AntiGrav 1.0 | 3.0 | 14.0% | 15 |
| mld.Infinity 2.2 | 3.7 | 13.3% | 31 |
| amz.NanoClone 1.41 | 4.8 | 10.8% | 8 |
| GarmBox.Oranges 1.0 | 6.7 | 6.8% | 0 |
| sample.Walls 1.0 | 6.7 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.7 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.2% | 0 |
| sample.Target 1.0 | 9.7 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 92.7 | 21 / 35 | 7026 |
| 2 | 1 | 70.9 | 87.0 | 20 / 35 | 6801 |
| 3 | 1 | 70.5 | 84.1 | 23 / 35 | 6793 |
| 4 | 1 | 71.4 | 87.3 | 22 / 35 | 6749 |
| 5 | 1 | 70.6 | 87.3 | 17 / 35 | 6540 |
| 6 | 1 | 69.8 | 85.1 | 22 / 35 | 5957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 58 | 95% |
| mld.Infinity 2.2 | 46 | 70% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| amz.NanoClone 1.41 | 5 | 40% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 42% | 81 |
| mld.Infinity 2.2 | 21 | 25% | 15 |
| mz.AntiGrav 1.0 | 15 | 18% | 79 |
| amz.NanoClone 1.41 | 8 | 9% | 12 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |
| arthord.MannyPacquiao Beta | 2 | 2% | 4 |
| sample.Walls 1.0 | 1 | 1% | 10 |
| jangs.ns51 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.7 | 109 / 210 | 2.64 | 17.5% | 28518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.3 | 17.5% | 109 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.2% | 63 |
| mld.DustBunny 3.8 | 2.8 | 13.2% | 14 |
| djdjdj.NanoSkunk10 1.0 | 4.5 | 10.2% | 13 |
| maribo.melee.BMV 0.1 | 4.7 | 10.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.9% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| bzdp.BoxCar 2.0 | 8.2 | 6.7% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.4% | 2 |
| cs.Grudge 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.1 | 19 / 35 | 4812 |
| 2 | 1 | 67.7 | 88.9 | 16 / 35 | 4734 |
| 3 | 1 | 69.5 | 94.3 | 23 / 35 | 4979 |
| 4 | 1 | 68.2 | 86.7 | 21 / 35 | 4826 |
| 5 | 1 | 68.1 | 87.9 | 22 / 35 | 4682 |
| 6 | 3 | 57.4 | 48.6 | 8 / 35 | 4485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 76 | 66% |
| mld.DustBunny 3.8 | 38 | 95% |
| djdjdj.NanoSkunk10 1.0 | 9 | 56% |
| maribo.melee.BMV 0.1 | 9 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| fullsail.SweetTea 1.1 | 6 | 83% |

Hadur died in 102 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 45 | 44% | 91 |
| djdjdj.NanoSkunk10 1.0 | 17 | 17% | 24 |
| mld.DustBunny 3.8 | 12 | 12% | 44 |
| maribo.melee.BMV 0.1 | 8 | 8% | 15 |
| cs.Grudge 1.0 | 7 | 7% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 15 |
| zyx.nano.Ant 1.1 | 5 | 5% | 6 |
| fullsail.SweetTea 1.1 | 2 | 2% | 8 |

## Melee bench: F03

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 84.7 | 142 / 210 | 2.38 | 19.9% | 35137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 19.9% | 142 |
| myl.micro.Troodon 1.10 | 2.0 | 13.9% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.9% | 16 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.4% | 6 |
| fm.mammillarias 1.3 | 5.3 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.8% | 3 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |
| sample.Fire 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.6 | 21 / 35 | 5872 |
| 2 | 1 | 69.7 | 86.7 | 22 / 35 | 5715 |
| 3 | 1 | 68.9 | 79.7 | 25 / 35 | 5714 |
| 4 | 1 | 69.7 | 84.8 | 25 / 35 | 5633 |
| 5 | 1 | 70.5 | 87.9 | 23 / 35 | 6304 |
| 6 | 1 | 70.8 | 88.3 | 26 / 35 | 5899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 32 | 97% |
| cb.nano.Insomnia 1.0 | 26 | 88% |
| myl.nano.KomoriNinja 1.1 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 16 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| sample.Fire 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 34% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 18% | 36 |
| cb.nano.Insomnia 1.0 | 10 | 15% | 14 |
| myl.nano.KomoriNinja 1.1 | 8 | 12% | 39 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 15 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 17 |
| sample.Fire 1.0 | 3 | 4% | 9 |
| fm.mammillarias 1.3 | 3 | 4% | 8 |

## Melee bench: F04

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.6 | 151 / 210 | 1.76 | 21.3% | 38969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 21.3% | 151 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.0% | 15 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.6% | 19 |
| stelo.SoJNanoMelee 1.1 | 4.2 | 9.3% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.6% | 0 |
| tj.zombie1n 1.0.1 | 6.0 | 8.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.0% | 4 |
| yk.JahMicro 1.0 | 7.5 | 7.6% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 25 / 35 | 6384 |
| 2 | 1 | 71.1 | 90.8 | 24 / 35 | 6435 |
| 3 | 1 | 71.3 | 89.8 | 25 / 35 | 6658 |
| 4 | 1 | 70.7 | 91.1 | 22 / 35 | 6331 |
| 5 | 1 | 71.1 | 88.9 | 24 / 35 | 6481 |
| 6 | 1 | 73.0 | 98.1 | 31 / 35 | 6680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 87% |
| stelo.SoJNanoMelee 1.1 | 50 | 94% |
| tvv.micro.Antares 1.1.1 | 18 | 56% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 83% |
| tj.zombie1n 1.0.1 | 10 | 90% |
| yk.JahMicro 1.0 | 9 | 78% |
| repositorio.NanoStep 1.0 | 5 | 80% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.micro.Antares 1.1.1 | 18 | 30% | 40 |
| kawigi.nano.Lib 1.0 | 14 | 23% | 78 |
| stelo.SoJNanoMelee 1.1 | 14 | 23% | 40 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 18 |
| repositorio.NanoStep 1.0 | 3 | 5% | 10 |
| tj.zombie1n 1.0.1 | 3 | 5% | 4 |
| yk.JahMicro 1.0 | 2 | 3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 4 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F05

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 72.4 | 101 / 210 | 3.48 | 16.2% | 28388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 16.2% | 101 |
| oog.melee.Corsair 1.0 | 2.0 | 13.1% | 32 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.9% | 20 |
| sam.Samspin 1.0 | 5.2 | 10.0% | 9 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 8.0 | 8.3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 64.1 | 14 / 35 | 4799 |
| 2 | 1 | 64.0 | 73.0 | 21 / 35 | 4569 |
| 3 | 1 | 63.9 | 73.7 | 16 / 35 | 4503 |
| 4 | 1 | 67.0 | 80.6 | 18 / 35 | 5252 |
| 5 | 1 | 62.4 | 68.3 | 14 / 35 | 4421 |
| 6 | 1 | 64.9 | 74.9 | 18 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 30 | 93% |
| oog.melee.Corsair 1.0 | 28 | 61% |
| ahf.NanoAndrew .4 | 26 | 88% |
| sam.Samspin 1.0 | 19 | 89% |
| EBBU.Sim2 1.02 | 11 | 91% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 26% | 51 |
| ahf.NanoAndrew .4 | 18 | 16% | 48 |
| simonton.nano.MeleeSeed 1.8 | 18 | 16% | 39 |
| robar.nano.Assertive_Melee 0.2 | 17 | 15% | 20 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 7% | 7 |
| sam.Samspin 1.0 | 6 | 5% | 16 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 11 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |

## Melee bench: F06

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.6 | 152 / 210 | 2.21 | 19.1% | 29552 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 19.1% | 152 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 27 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.1% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.8% | 4 |
| fm.claire 1.7 | 6.0 | 8.6% | 1 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 0 |
| pa.Improved 1.0 | 9.2 | 6.0% | 4 |
| kurios.DOSexe .9b | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.0 | 26 / 35 | 4235 |
| 2 | 1 | 69.8 | 89.8 | 24 / 35 | 5363 |
| 3 | 1 | 70.0 | 91.1 | 29 / 35 | 5059 |
| 4 | 1 | 69.6 | 88.3 | 28 / 35 | 5252 |
| 5 | 1 | 68.6 | 87.3 | 24 / 35 | 4796 |
| 6 | 1 | 65.9 | 75.9 | 21 / 35 | 4847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 95% |
| oog.melee.CapuletDroid 1.1 | 33 | 91% |
| gh.nano.Grofvuil 0.2 | 18 | 78% |
| arthord.NanoSatanMelee Beta | 14 | 100% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| pa.Improved 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 28% | 86 |
| oog.melee.CapuletDroid 1.1 | 14 | 23% | 18 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 37 |
| arthord.NanoSatanMelee Beta | 5 | 8% | 17 |
| pa.Improved 1.0 | 4 | 7% | 9 |
| sample.SpinBot 1.0 | 4 | 7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 13 |
| fm.claire 1.7 | 3 | 5% | 8 |
| kurios.DOSexe .9b | 2 | 3% | 11 |

## Melee bench: F07

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.0 | 81 / 210 | 2.62 | 17.8% | 32940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 17.8% | 81 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.4% | 50 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.6% | 21 |
| mz.MicroGodMelee 1 | 3.5 | 12.9% | 45 |
| DBall.Anarchy 0.1 | 5.2 | 9.2% | 8 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.2% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 3 |
| acogdev.alpha 0.2 | 7.7 | 6.3% | 1 |
| fire219.CatBot 1.0 | 8.3 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.3 | 11 / 35 | 5473 |
| 2 | 1 | 69.1 | 87.6 | 17 / 35 | 5774 |
| 3 | 1 | 67.0 | 80.0 | 16 / 35 | 5116 |
| 4 | 1 | 67.3 | 81.3 | 15 / 35 | 5608 |
| 5 | 1 | 65.5 | 77.1 | 9 / 35 | 5323 |
| 6 | 1 | 67.8 | 84.4 | 13 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 49 | 88% |
| mz.MicroGodMelee 1 | 40 | 33% |
| gh.micro.Gruweltje 0.7 | 36 | 25% |
| DBall.Anarchy 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 50 | 39% | 71 |
| gh.micro.Gruweltje 0.7 | 46 | 36% | 62 |
| spinnercat.micro.Tyger 0.1 | 18 | 14% | 43 |
| acogdev.alpha 0.2 | 7 | 5% | 8 |
| fire219.CatBot 1.0 | 4 | 3% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 11 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 3 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 4 |

## Melee bench: F08

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 72.0 | 106 / 210 | 3.52 | 16.4% | 30594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 16.4% | 106 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.7% | 30 |
| germ.TheMind .2 | 4.7 | 9.6% | 8 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.4% | 9 |
| awesomeness.Elite 1.0 | 6.0 | 9.0% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.3% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.7% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 65.7 | 17 / 35 | 5144 |
| 2 | 1 | 65.5 | 74.0 | 19 / 35 | 5066 |
| 3 | 1 | 63.4 | 68.9 | 16 / 35 | 4782 |
| 4 | 1 | 65.5 | 72.7 | 16 / 35 | 5586 |
| 5 | 1 | 65.4 | 75.6 | 19 / 35 | 5044 |
| 6 | 1 | 65.8 | 75.2 | 19 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 75 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 89% |
| awesomeness.Elite 1.0 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 8 | 75% |
| germ.TheMind .2 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 52 | 50% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 21% | 37 |
| stelo.UntouchableNano 1.3 | 8 | 8% | 12 |
| germ.TheMind .2 | 7 | 7% | 16 |
| awesomeness.Elite 1.0 | 6 | 6% | 16 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 7 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.7 | 159 / 210 | 2.01 | 20.0% | 29623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 20.0% | 159 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.7% | 5 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.1% | 10 |
| maribo.IotaCT 1.1 | 4.7 | 10.8% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.9% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.2% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 3 |
| stelo.PatternRobot 1.0 | 8.8 | 7.0% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.0 | 23 / 35 | 5125 |
| 2 | 1 | 72.7 | 96.8 | 32 / 35 | 5212 |
| 3 | 1 | 69.9 | 87.6 | 28 / 35 | 4706 |
| 4 | 1 | 68.3 | 80.3 | 24 / 35 | 4576 |
| 5 | 1 | 70.9 | 90.5 | 28 / 35 | 4910 |
| 6 | 1 | 70.9 | 90.2 | 24 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 96% |
| nz.jdc.nano.GridFu 1.0 | 40 | 95% |
| timmit.nano.TimDog 0.33 | 13 | 77% |
| maribo.IotaCT 1.1 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 91% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| ratosh.Wesco 1.4 | 7 | 57% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 23% | 65 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 24 |
| stelo.PatternRobot 1.0 | 7 | 13% | 16 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 43 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 10% | 13 |
| ratosh.Wesco 1.4 | 5 | 10% | 12 |
| maribo.IotaCT 1.1 | 4 | 8% | 26 |
| spinnercat.Omen 1.0 | 4 | 8% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.3 | 154 / 210 | 2.06 | 20.1% | 34052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 20.1% | 154 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.6% | 24 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 6 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.8% | 3 |
| sanja.First 0.1 | 7.0 | 8.5% | 5 |
| cvt.Firsty 1.0 | 7.5 | 7.7% | 8 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.4 | 24 / 35 | 5125 |
| 2 | 1 | 71.1 | 93.7 | 28 / 35 | 5991 |
| 3 | 1 | 70.7 | 91.1 | 25 / 35 | 6132 |
| 4 | 1 | 69.2 | 84.1 | 26 / 35 | 5458 |
| 5 | 1 | 70.1 | 89.5 | 25 / 35 | 5834 |
| 6 | 1 | 69.8 | 86.7 | 26 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 33 | 79% |
| baal.nano.N 1.42 | 30 | 93% |
| cvt.Firsty 1.0 | 29 | 83% |
| zyx.micro.Ant 1.1 | 22 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 15 | 93% |
| sanja.First 0.1 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 11 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Grystrion.TrackerWO 1.0 | 13 | 23% | 26 |
| tvv.nano.Polaris 1.2 | 12 | 21% | 52 |
| zyx.micro.Ant 1.1 | 11 | 19% | 36 |
| cvt.Firsty 1.0 | 8 | 14% | 22 |
| baal.nano.N 1.42 | 4 | 7% | 28 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 8 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 15 |
| sanja.First 0.1 | 2 | 4% | 14 |
| sample.RamFire 1.0 | 2 | 4% | 5 |

## Melee bench: F11

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.2 | 57 / 210 | 4.04 | 14.5% | 28365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.4% | 79 |
| hadur117.micro.SaorG2 0.1 | 1.8 | 14.5% | 57 |
| cs.Wren 1.0 | 3.5 | 12.5% | 20 |
| js.PinBall 1.6 | 4.0 | 11.8% | 20 |
| mz.Cork 0.1 | 4.5 | 11.1% | 21 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 3 |
| evd.X1 0.01 | 7.0 | 7.9% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 66.3 | 7 / 35 | 5044 |
| 2 | 2 | 60.6 | 64.4 | 8 / 35 | 4602 |
| 3 | 2 | 63.5 | 72.1 | 13 / 35 | 4650 |
| 4 | 2 | 58.0 | 55.2 | 10 / 35 | 4461 |
| 5 | 2 | 60.5 | 66.0 | 6 / 35 | 4368 |
| 6 | 1 | 64.7 | 73.0 | 13 / 35 | 5240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 67 | 40% |
| cs.Wren 1.0 | 19 | 84% |
| mz.Cork 0.1 | 8 | 63% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 4 | 25% |
| joe.ADinosaur 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 69 | 45% | 100 |
| js.PinBall 1.6 | 21 | 14% | 24 |
| cs.Wren 1.0 | 14 | 9% | 23 |
| joe.ADinosaur 1.0 | 12 | 8% | 16 |
| evd.X1 0.01 | 12 | 8% | 13 |
| mz.Cork 0.1 | 11 | 7% | 18 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 4 | 3% | 5 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.5 | 124 / 210 | 2.57 | 18.1% | 27065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 18.1% | 124 |
| myl.nano.Graviton 1.10 | 2.8 | 11.6% | 21 |
| ntc.Opposite 1.5 | 3.5 | 11.3% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 17 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 10.0% | 6 |
| disan.Chair 2.2.0 | 7.2 | 8.5% | 7 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 10 |
| donjezza.Muncho 1.0 | 9.3 | 5.7% | 10 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.9 | 23 / 35 | 5231 |
| 2 | 1 | 67.2 | 82.5 | 22 / 35 | 4460 |
| 3 | 1 | 64.8 | 75.9 | 20 / 35 | 4055 |
| 4 | 1 | 67.4 | 84.4 | 17 / 35 | 4589 |
| 5 | 1 | 66.9 | 83.8 | 24 / 35 | 3957 |
| 6 | 1 | 66.6 | 80.6 | 18 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 36 | 81% |
| myl.nano.Graviton 1.10 | 32 | 91% |
| disan.Chair 2.2.0 | 20 | 95% |
| ntc.Opposite 1.5 | 15 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 79% |
| DBall.NUKE 0.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 9 | 67% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |

Hadur died in 86 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 22 | 26% | 30 |
| stelo.AreaTargetingBot 1.1 | 19 | 22% | 49 |
| myl.nano.Graviton 1.10 | 13 | 15% | 47 |
| ntc.Opposite 1.5 | 10 | 12% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 9% | 18 |
| donjezza.Muncho 1.0 | 5 | 6% | 12 |
| disan.Chair 2.2.0 | 4 | 5% | 16 |
| DBall.NUKE 0.1 | 3 | 3% | 8 |
| pbg.R2D2 1.0 | 2 | 2% | 7 |

## Melee bench: F13

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 65.6 | 67 / 210 | 4.10 | 14.4% | 24093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.7 | 14.4% | 67 |
| oog.melee.Capulet 1.2 | 2.0 | 14.5% | 61 |
| kawigi.micro.Shiz 1.1 | 3.0 | 12.9% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 22 |
| yagami.Tidus 0.11 | 4.7 | 12.4% | 14 |
| ejb.Polaris 1.0.1 | 5.5 | 11.2% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.0 | 64.1 | 11 / 35 | 4219 |
| 2 | 2 | 60.9 | 64.4 | 9 / 35 | 3727 |
| 3 | 3 | 60.9 | 59.7 | 8 / 35 | 4135 |
| 4 | 1 | 64.0 | 71.7 | 13 / 35 | 4179 |
| 5 | 2 | 62.7 | 67.3 | 13 / 35 | 3917 |
| 6 | 1 | 62.4 | 66.0 | 13 / 35 | 3916 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 89% |
| kawigi.micro.Shiz 1.1 | 17 | 100% |
| yagami.Tidus 0.11 | 13 | 92% |
| ejb.Polaris 1.0.1 | 9 | 67% |

Hadur died in 144 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 69 | 48% | 82 |
| ejb.Polaris 1.0.1 | 21 | 15% | 32 |
| yagami.Tidus 0.11 | 21 | 15% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 10% | 35 |
| step.nanoPri 1.0 | 7 | 5% | 8 |
| kawigi.micro.Shiz 1.1 | 5 | 3% | 17 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.0 | 125 / 210 | 2.71 | 17.6% | 26212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 17.6% | 125 |
| wee.Gem 1.8.4 | 3.0 | 12.0% | 34 |
| wompi.Quokka 1.6 | 3.3 | 11.6% | 20 |
| bzdp.Pansy 2.1 | 3.5 | 11.8% | 8 |
| ratosh.Nobo 0.21 | 4.2 | 10.9% | 10 |
| m3thos.Eva00 1.1 | 6.3 | 9.6% | 8 |
| bayen.UbaMicro 1.4 | 6.7 | 9.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.6% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 19 / 35 | 4589 |
| 2 | 1 | 68.4 | 84.4 | 23 / 35 | 4767 |
| 3 | 1 | 65.0 | 74.0 | 20 / 35 | 4432 |
| 4 | 1 | 67.7 | 87.0 | 24 / 35 | 4179 |
| 5 | 1 | 64.8 | 75.6 | 18 / 35 | 4159 |
| 6 | 1 | 66.4 | 82.5 | 21 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 96% |
| wee.Gem 1.8.4 | 41 | 71% |
| wompi.Quokka 1.6 | 24 | 75% |
| ratosh.Nobo 0.21 | 16 | 75% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| m3thos.Eva00 1.1 | 8 | 88% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 17 | 20% | 45 |
| ratosh.Nobo 0.21 | 14 | 16% | 28 |
| wompi.Quokka 1.6 | 14 | 16% | 26 |
| maribo.FollowFire 1 | 11 | 13% | 12 |
| m3thos.Eva00 1.1 | 9 | 11% | 18 |
| bzdp.Pansy 2.1 | 8 | 9% | 53 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 7% | 8 |
| bayen.UbaMicro 1.4 | 4 | 5% | 14 |
| stelo.MyAgileRobot 0.2 | 2 | 2% | 5 |

## Melee bench: F15

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 83.0 | 56 / 210 | 2.53 | 18.5% | 40529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.0% | 131 |
| hadur117.micro.SaorG2 0.1 | 1.8 | 18.5% | 56 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 17 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 4.5 | 10.1% | 2 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.5% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 81.0 | 7 / 35 | 6233 |
| 2 | 2 | 69.2 | 81.3 | 10 / 35 | 7000 |
| 3 | 2 | 70.6 | 86.7 | 9 / 35 | 7478 |
| 4 | 2 | 69.0 | 80.3 | 9 / 35 | 6629 |
| 5 | 2 | 68.7 | 80.6 | 9 / 35 | 6433 |
| 6 | 1 | 70.4 | 87.9 | 12 / 35 | 6756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 110 | 23% |
| mz.NanoGod 2.02 | 15 | 73% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| sample.SittingDuck 1.0 | 3 | 67% |
| stuff.Vlad 0.1 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 70% | 134 |
| mz.NanoGod 2.02 | 27 | 17% | 41 |
| exauge.GateKeeper 1.1.121g | 9 | 6% | 13 |
| ayk.WallHugger 1.0 | 5 | 3% | 9 |
| stelo.PianistNano 1.2 | 3 | 2% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.0 | 116 / 210 | 3.16 | 16.9% | 26926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 16.9% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 18 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.4% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.1% | 16 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 17 |
| stelo.MirrorMicro 1.0 | 6.5 | 9.0% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.7% | 4 |
| ap.Frederick 1.1 | 8.0 | 7.4% | 18 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.7 | 20 / 35 | 4415 |
| 2 | 1 | 63.7 | 70.5 | 18 / 35 | 4399 |
| 3 | 1 | 68.7 | 87.6 | 25 / 35 | 4868 |
| 4 | 1 | 66.2 | 75.9 | 20 / 35 | 4891 |
| 5 | 1 | 64.3 | 74.6 | 16 / 35 | 4328 |
| 6 | 1 | 63.0 | 68.9 | 17 / 35 | 4025 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 96% |
| dummy.micro.Sparrow 2.5 | 25 | 96% |
| bvh.micro.Freya 0.3 | 18 | 89% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 88% |
| ap.Frederick 1.1 | 10 | 70% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| conscience.Electron 1.3g | 4 | 50% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 19 | 20% | 23 |
| dl.BetterWalls 1.0 | 14 | 15% | 21 |
| bvh.micro.Freya 0.3 | 13 | 14% | 22 |
| dummy.micro.Sparrow 2.5 | 11 | 12% | 35 |
| voidious.micro.BlitzBat 1.05 | 10 | 11% | 46 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 10% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 10% | 11 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 17 |
| ap.Frederick 1.1 | 3 | 3% | 0 |

## Melee bench: F17

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 87.8 | 153 / 210 | 2.10 | 21.1% | 40986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 21.1% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.1% | 21 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 12 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 7 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.1% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 7 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.8% | 4 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 86.0 | 23 / 35 | 6861 |
| 2 | 1 | 72.8 | 93.0 | 26 / 35 | 7262 |
| 3 | 1 | 70.6 | 85.4 | 26 / 35 | 6183 |
| 4 | 1 | 71.0 | 88.6 | 26 / 35 | 6386 |
| 5 | 1 | 71.6 | 86.0 | 28 / 35 | 7346 |
| 6 | 1 | 71.4 | 87.9 | 24 / 35 | 6948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 58 | 90% |
| sul.Lunar 1.1 | 46 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 97% |
| mme.NikeEnhanced 2.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| dsw.StaticD 1.0 | 6 | 50% |
| sample.MyFirstRobot 1.0 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 30% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 69 |
| dsw.StaticD 1.0 | 13 | 23% | 23 |
| sul.Lunar 1.1 | 6 | 11% | 55 |
| mme.NikeEnhanced 2.0 | 3 | 5% | 9 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorG2 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 76.0 | 91 / 210 | 3.16 | 17.4% | 36435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorG2 0.1 | 1.0 | 17.4% | 91 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 34 |
| mld.Wisdom 1.0 | 2.7 | 12.8% | 22 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.6% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 20 |
| amz.NanoClone 1.41 | 5.2 | 10.5% | 15 |
| sample.Walls 1.0 | 7.2 | 7.9% | 8 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 2 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 2 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 77.8 | 15 / 35 | 6227 |
| 2 | 1 | 65.1 | 71.4 | 15 / 35 | 5950 |
| 3 | 1 | 66.3 | 75.6 | 14 / 35 | 6249 |
| 4 | 1 | 67.6 | 78.7 | 18 / 35 | 5944 |
| 5 | 1 | 65.8 | 75.6 | 15 / 35 | 5731 |
| 6 | 1 | 66.9 | 77.1 | 14 / 35 | 6334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 34 | 59% |
| davidalves.net.DuelistNanoMelee 1.01 | 31 | 90% |
| mld.Wisdom 1.0 | 20 | 80% |
| KiraNL.Chupacabra 0.4 | 10 | 50% |
| amz.NanoClone 1.41 | 9 | 78% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 36 | 30% | 60 |
| mld.Wisdom 1.0 | 22 | 18% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 16% | 49 |
| KiraNL.Chupacabra 0.4 | 19 | 16% | 25 |
| amz.NanoClone 1.41 | 11 | 9% | 16 |
| sample.Walls 1.0 | 7 | 6% | 9 |
| jangs.ns51 1.0 | 4 | 3% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

