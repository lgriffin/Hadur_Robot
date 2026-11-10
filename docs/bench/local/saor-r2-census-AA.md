# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 92.2 | 170 / 210 | 1.70 | 22.2% | 43208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 22.2% | 170 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 12 |
| mz.AntiGrav 1.0 | 2.7 | 13.6% | 10 |
| mld.Infinity 2.2 | 4.0 | 12.3% | 11 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 5 |
| GarmBox.Oranges 1.0 | 6.8 | 6.8% | 0 |
| sample.Walls 1.0 | 6.8 | 7.0% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.1 | 27 / 35 | 6933 |
| 2 | 1 | 74.5 | 96.5 | 33 / 35 | 7658 |
| 3 | 1 | 72.4 | 90.5 | 28 / 35 | 7226 |
| 4 | 1 | 72.6 | 92.1 | 26 / 35 | 7001 |
| 5 | 1 | 73.8 | 95.2 | 31 / 35 | 7093 |
| 6 | 1 | 72.6 | 87.9 | 25 / 35 | 7297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 69 | 97% |
| mld.Infinity 2.2 | 43 | 95% |
| radnor.DoctorBob 1.42 | 35 | 91% |
| jangs.ns51 1.0 | 11 | 100% |
| amz.NanoClone 1.41 | 8 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 45% | 77 |
| mz.AntiGrav 1.0 | 8 | 20% | 68 |
| amz.NanoClone 1.41 | 6 | 15% | 13 |
| mld.Infinity 2.2 | 3 | 8% | 17 |
| sample.Walls 1.0 | 3 | 8% | 14 |
| jangs.ns51 1.0 | 1 | 3% | 7 |
| GarmBox.Oranges 1.0 | 1 | 3% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 5 |

## Melee bench: F02

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.7 | 150 / 210 | 1.93 | 19.6% | 31208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.6% | 150 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.3% | 37 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 8 |
| maribo.melee.BMV 0.1 | 4.3 | 10.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 8.8% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 7.7 | 6.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 6.7% | 8 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 2 |
| cs.Grudge 1.0 | 9.2 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 28 / 35 | 5593 |
| 2 | 1 | 68.6 | 89.5 | 22 / 35 | 4825 |
| 3 | 1 | 68.7 | 87.3 | 23 / 35 | 4889 |
| 4 | 1 | 67.1 | 80.6 | 21 / 35 | 5008 |
| 5 | 1 | 70.6 | 92.4 | 27 / 35 | 5543 |
| 6 | 1 | 70.6 | 93.0 | 29 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 87 | 79% |
| mld.DustBunny 3.8 | 59 | 92% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 38% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 25 | 41% | 90 |
| mld.DustBunny 3.8 | 13 | 21% | 58 |
| djdjdj.NanoSkunk10 1.0 | 6 | 10% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 10 |
| maribo.melee.BMV 0.1 | 4 | 7% | 10 |
| zyx.nano.Ant 1.1 | 3 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 5% | 8 |
| bzdp.BoxCar 2.0 | 1 | 2% | 5 |
| cs.Grudge 1.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 90.1 | 162 / 210 | 1.90 | 21.2% | 37486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.2% | 162 |
| myl.micro.Troodon 1.10 | 2.0 | 13.4% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.8% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.7% | 9 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.6% | 8 |
| fm.mammillarias 1.3 | 5.7 | 8.8% | 3 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.9% | 2 |
| sample.Fire 1.0 | 9.3 | 4.7% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 91.7 | 28 / 35 | 6498 |
| 2 | 1 | 70.9 | 90.2 | 26 / 35 | 5790 |
| 3 | 1 | 71.2 | 86.7 | 28 / 35 | 6414 |
| 4 | 1 | 72.2 | 94.6 | 29 / 35 | 6287 |
| 5 | 1 | 71.0 | 89.2 | 26 / 35 | 6045 |
| 6 | 1 | 71.3 | 87.9 | 25 / 35 | 6452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 53 | 100% |
| myl.micro.Troodon 1.10 | 45 | 96% |
| cb.nano.Insomnia 1.0 | 31 | 81% |
| myl.nano.KomoriNinja 1.1 | 21 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 11 | 23% | 62 |
| cb.nano.Insomnia 1.0 | 11 | 23% | 7 |
| fm.mammillarias 1.3 | 8 | 17% | 15 |
| cs.sheldor.Talon 1.1 | 6 | 13% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 8% | 43 |
| myl.nano.KomoriNinja 1.1 | 3 | 6% | 39 |
| sp.Nanos.Ember 1.1 | 3 | 6% | 20 |
| sample.Fire 1.0 | 1 | 2% | 6 |
| sample.Tracker 1.0 | 1 | 2% | 3 |

## Melee bench: F04

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.2 | 164 / 210 | 2.06 | 21.1% | 40558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.1% | 164 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.3% | 14 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.1% | 4 |
| tj.zombie1n 1.0.1 | 4.5 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.0% | 15 |
| yk.JahMicro 1.0 | 6.0 | 8.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.7 | 8.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 80.0 | 24 / 35 | 6137 |
| 2 | 1 | 70.8 | 86.0 | 25 / 35 | 6625 |
| 3 | 1 | 71.1 | 87.9 | 27 / 35 | 6890 |
| 4 | 1 | 71.1 | 87.3 | 29 / 35 | 6884 |
| 5 | 1 | 72.2 | 92.7 | 29 / 35 | 6769 |
| 6 | 1 | 72.9 | 95.2 | 30 / 35 | 7253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 98% |
| stelo.SoJNanoMelee 1.1 | 37 | 95% |
| tj.zombie1n 1.0.1 | 21 | 81% |
| tvv.micro.Antares 1.1.1 | 18 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 82% |
| yk.JahMicro 1.0 | 10 | 90% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 12 | 26% | 82 |
| stelo.SoJNanoMelee 1.1 | 9 | 19% | 32 |
| tj.zombie1n 1.0.1 | 9 | 19% | 14 |
| tvv.micro.Antares 1.1.1 | 5 | 11% | 28 |
| yk.JahMicro 1.0 | 4 | 9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 9% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 6% | 19 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.3 | 105 / 210 | 3.50 | 16.5% | 29647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 16.5% | 105 |
| oog.melee.Corsair 1.0 | 2.2 | 12.6% | 31 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.3% | 23 |
| ahf.NanoAndrew .4 | 4.0 | 10.7% | 20 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 11 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.2% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.5 | 8.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.6 | 16 / 35 | 5230 |
| 2 | 1 | 66.0 | 76.5 | 21 / 35 | 4976 |
| 3 | 1 | 63.7 | 68.6 | 17 / 35 | 4935 |
| 4 | 1 | 64.1 | 72.7 | 18 / 35 | 4456 |
| 5 | 1 | 63.8 | 69.8 | 15 / 35 | 5039 |
| 6 | 1 | 64.5 | 71.4 | 18 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 50 | 90% |
| oog.melee.Corsair 1.0 | 31 | 65% |
| ahf.NanoAndrew .4 | 14 | 93% |
| sam.Samspin 1.0 | 10 | 100% |
| EBBU.Sim2 1.02 | 8 | 88% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 440. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 19 | 18% | 43 |
| simonton.nano.MeleeSeed 1.8 | 18 | 17% | 56 |
| robar.nano.Assertive_Melee 0.2 | 14 | 13% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 12% | 12 |
| zyx.nano.BacillusComma 1.0 | 11 | 10% | 17 |
| ahf.NanoAndrew .4 | 10 | 10% | 27 |
| EBBU.Sim2 1.02 | 10 | 10% | 20 |
| sam.Samspin 1.0 | 5 | 5% | 10 |
| sample.TrackFire 1.0 | 5 | 5% | 5 |

## Melee bench: F06

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.1 | 151 / 210 | 1.98 | 19.9% | 32914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.9% | 151 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 19 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.0% | 8 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.3% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 5 |
| fm.claire 1.7 | 6.0 | 8.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.8% | 4 |
| sample.SpinBot 1.0 | 7.5 | 7.3% | 2 |
| pa.Improved 1.0 | 9.0 | 6.3% | 2 |
| kurios.DOSexe .9b | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.3 | 27 / 35 | 4859 |
| 2 | 1 | 69.7 | 88.3 | 25 / 35 | 5461 |
| 3 | 1 | 69.3 | 84.8 | 25 / 35 | 5814 |
| 4 | 1 | 70.1 | 90.8 | 25 / 35 | 5602 |
| 5 | 1 | 69.9 | 87.9 | 23 / 35 | 5935 |
| 6 | 1 | 69.7 | 89.5 | 26 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 93% |
| oog.melee.CapuletDroid 1.1 | 47 | 87% |
| gh.nano.Grofvuil 0.2 | 15 | 100% |
| winamp32.micro.MicroMacro 1.0 | 10 | 80% |
| arthord.NanoSatanMelee Beta | 10 | 80% |
| sample.SpinBot 1.0 | 9 | 100% |
| pa.Improved 1.0 | 6 | 83% |
| fm.claire 1.7 | 6 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 22% | 74 |
| oog.melee.CapuletDroid 1.1 | 12 | 20% | 20 |
| arthord.NanoSatanMelee Beta | 10 | 17% | 25 |
| gh.nano.Grofvuil 0.2 | 7 | 12% | 33 |
| winamp32.micro.MicroMacro 1.0 | 4 | 7% | 20 |
| fm.claire 1.7 | 4 | 7% | 8 |
| kurios.DOSexe .9b | 3 | 5% | 12 |
| pa.Improved 1.0 | 3 | 5% | 10 |
| sample.SpinBot 1.0 | 3 | 5% | 6 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.7 | 104 / 210 | 2.20 | 19.2% | 35705 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.2% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.5% | 44 |
| mz.MicroGodMelee 1 | 3.3 | 13.0% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.4% | 16 |
| DBall.Anarchy 0.1 | 5.5 | 8.7% | 6 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.1% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 4 |
| acogdev.alpha 0.2 | 8.5 | 5.6% | 0 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.3 | 14 / 35 | 6081 |
| 2 | 1 | 69.4 | 84.1 | 21 / 35 | 6141 |
| 3 | 1 | 70.3 | 89.2 | 19 / 35 | 6323 |
| 4 | 1 | 67.8 | 84.1 | 14 / 35 | 5621 |
| 5 | 1 | 69.8 | 91.7 | 18 / 35 | 5746 |
| 6 | 1 | 68.3 | 84.4 | 18 / 35 | 5793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 51 | 92% |
| mz.MicroGodMelee 1 | 48 | 48% |
| gh.micro.Gruweltje 0.7 | 40 | 30% |
| DBall.Anarchy 0.1 | 14 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1055. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 38 | 36% | 66 |
| gh.micro.Gruweltje 0.7 | 38 | 36% | 52 |
| spinnercat.micro.Tyger 0.1 | 13 | 12% | 55 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| DBall.Anarchy 0.1 | 3 | 3% | 13 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.6 | 115 / 210 | 3.20 | 17.1% | 31108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.3 | 17.1% | 115 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 31 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 8.7% | 2 |
| germ.TheMind .2 | 5.3 | 8.9% | 5 |
| awesomeness.Elite 1.0 | 7.2 | 8.0% | 4 |
| sample.Crazy 1.0 | 8.2 | 7.3% | 3 |
| stelo.UntouchableNano 1.3 | 8.3 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.3 | 21 / 35 | 5742 |
| 2 | 1 | 65.2 | 74.6 | 16 / 35 | 5055 |
| 3 | 1 | 67.7 | 81.9 | 23 / 35 | 5243 |
| 4 | 3 | 60.6 | 61.6 | 15 / 35 | 4216 |
| 5 | 1 | 66.5 | 78.7 | 18 / 35 | 5502 |
| 6 | 1 | 66.7 | 75.6 | 22 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 85% |
| qualidafial.MajorDick 1.0.1 | 10 | 80% |
| germ.TheMind .2 | 6 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| awesomeness.Elite 1.0 | 2 | 50% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 45% | 113 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 18% | 36 |
| germ.TheMind .2 | 10 | 10% | 16 |
| awesomeness.Elite 1.0 | 8 | 8% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 6% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 10 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.7 | 166 / 210 | 1.75 | 20.6% | 30838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.6% | 166 |
| rz.HawkOnFire 0.1 | 2.2 | 13.2% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.4% | 6 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 10 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.1% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 8.1% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 1 |
| ratosh.Wesco 1.4 | 8.2 | 7.5% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.2 | 29 / 35 | 5726 |
| 2 | 1 | 69.4 | 89.2 | 22 / 35 | 4833 |
| 3 | 1 | 70.4 | 89.5 | 27 / 35 | 4832 |
| 4 | 1 | 71.8 | 93.3 | 30 / 35 | 5035 |
| 5 | 1 | 71.4 | 92.7 | 29 / 35 | 5265 |
| 6 | 1 | 70.8 | 89.2 | 29 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 59 | 95% |
| nz.jdc.nano.GridFu 1.0 | 43 | 98% |
| stelo.PatternRobot 1.0 | 21 | 86% |
| timmit.nano.TimDog 0.33 | 18 | 94% |
| maribo.IotaCT 1.1 | 17 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 89% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 10 | 23% | 58 |
| nz.jdc.nano.GridFu 1.0 | 8 | 18% | 52 |
| maribo.IotaCT 1.1 | 6 | 14% | 27 |
| stelo.PatternRobot 1.0 | 6 | 14% | 21 |
| timmit.nano.TimDog 0.33 | 5 | 11% | 22 |
| ratosh.Wesco 1.4 | 5 | 11% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 7% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.3 | 177 / 210 | 1.79 | 21.7% | 39856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.7% | 177 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.7% | 12 |
| baal.nano.N 1.42 | 3.2 | 11.0% | 3 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.2% | 2 |
| zyx.micro.Ant 1.1 | 5.0 | 9.1% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.0 | 8.5% | 0 |
| sanja.First 0.1 | 7.3 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.5% | 1 |
| cvt.Firsty 1.0 | 8.3 | 7.5% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.7 | 31 / 35 | 6926 |
| 2 | 1 | 70.8 | 87.0 | 29 / 35 | 6289 |
| 3 | 1 | 71.9 | 91.7 | 25 / 35 | 6884 |
| 4 | 1 | 70.9 | 87.9 | 29 / 35 | 6624 |
| 5 | 1 | 71.7 | 92.4 | 31 / 35 | 6565 |
| 6 | 1 | 72.2 | 94.9 | 32 / 35 | 6568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 94% |
| cvt.Firsty 1.0 | 34 | 100% |
| tvv.nano.Polaris 1.2 | 33 | 97% |
| sanja.First 0.1 | 24 | 100% |
| zyx.micro.Ant 1.1 | 20 | 90% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Grystrion.TrackerWO 1.0 | 9 | 27% | 22 |
| zyx.micro.Ant 1.1 | 8 | 24% | 40 |
| sample.RamFire 1.0 | 6 | 18% | 8 |
| tvv.nano.Polaris 1.2 | 4 | 12% | 51 |
| baal.nano.N 1.42 | 4 | 12% | 32 |
| cvt.Firsty 1.0 | 1 | 3% | 26 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sanja.First 0.1 | 0 | 0% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |

## Melee bench: F11

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.8 | 75 / 210 | 3.90 | 15.4% | 31442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.2 | 15.4% | 75 |
| kc.micro.Figment 1.0 | 2.3 | 14.9% | 73 |
| cs.Wren 1.0 | 3.2 | 12.7% | 15 |
| mz.Cork 0.1 | 4.2 | 11.0% | 12 |
| js.PinBall 1.6 | 4.5 | 11.1% | 18 |
| joe.ADinosaur 1.0 | 5.7 | 9.5% | 4 |
| evd.X1 0.01 | 7.2 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 7.2% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 64.8 | 14 / 35 | 4840 |
| 2 | 1 | 67.3 | 81.6 | 17 / 35 | 5504 |
| 3 | 1 | 62.7 | 66.3 | 11 / 35 | 5068 |
| 4 | 1 | 59.6 | 57.5 | 10 / 35 | 5069 |
| 5 | 1 | 64.6 | 70.8 | 13 / 35 | 5453 |
| 6 | 1 | 62.4 | 66.0 | 10 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 55% |
| cs.Wren 1.0 | 14 | 86% |
| joe.ADinosaur 1.0 | 7 | 71% |
| mz.Cork 0.1 | 7 | 57% |
| js.PinBall 1.6 | 7 | 57% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| PSW.Relentless 0.1 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 43% | 95 |
| joe.ADinosaur 1.0 | 22 | 16% | 26 |
| js.PinBall 1.6 | 12 | 9% | 20 |
| cs.Wren 1.0 | 11 | 8% | 19 |
| evd.X1 0.01 | 10 | 7% | 14 |
| mz.Cork 0.1 | 9 | 7% | 16 |
| PSW.Relentless 0.1 | 9 | 7% | 11 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.9 | 142 / 210 | 2.45 | 19.0% | 29654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.0% | 142 |
| myl.nano.Graviton 1.10 | 3.2 | 11.9% | 22 |
| ntc.Opposite 1.5 | 3.5 | 11.0% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 10.7% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.6% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 3 |
| DBall.NUKE 0.1 | 6.3 | 8.9% | 3 |
| disan.Chair 2.2.0 | 7.5 | 8.1% | 8 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 8 |
| pbg.R2D2 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.9 | 20 / 35 | 4817 |
| 2 | 1 | 69.7 | 89.5 | 25 / 35 | 5160 |
| 3 | 1 | 69.1 | 86.7 | 25 / 35 | 5010 |
| 4 | 1 | 69.9 | 88.9 | 27 / 35 | 5290 |
| 5 | 1 | 65.8 | 76.5 | 21 / 35 | 4602 |
| 6 | 1 | 69.0 | 86.0 | 24 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 87% |
| stelo.AreaTargetingBot 1.1 | 26 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 23 | 91% |
| DBall.NUKE 0.1 | 19 | 100% |
| ntc.Opposite 1.5 | 18 | 94% |
| donjezza.Muncho 1.0 | 12 | 92% |
| disan.Chair 2.2.0 | 11 | 82% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 14 | 20% | 37 |
| pfvicm.Sobieski 7.2.3b | 13 | 19% | 30 |
| ntc.Opposite 1.5 | 11 | 16% | 21 |
| myl.nano.Graviton 1.10 | 9 | 13% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 13% | 32 |
| disan.Chair 2.2.0 | 5 | 7% | 13 |
| DBall.NUKE 0.1 | 3 | 4% | 18 |
| donjezza.Muncho 1.0 | 3 | 4% | 12 |
| pbg.R2D2 1.0 | 3 | 4% | 5 |

## Melee bench: F13

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.0 | 91 / 210 | 3.25 | 16.3% | 27067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 16.3% | 91 |
| oog.melee.Capulet 1.2 | 2.7 | 13.8% | 43 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.5% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 20 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 7 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 67.0 | 17 / 35 | 4540 |
| 2 | 1 | 64.1 | 72.4 | 10 / 35 | 4490 |
| 3 | 1 | 63.6 | 69.2 | 15 / 35 | 4381 |
| 4 | 1 | 66.6 | 81.9 | 15 / 35 | 4273 |
| 5 | 1 | 66.9 | 79.7 | 16 / 35 | 4724 |
| 6 | 1 | 66.9 | 80.0 | 18 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 38 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 89% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| yagami.Tidus 0.11 | 18 | 94% |
| ejb.Polaris 1.0.1 | 6 | 33% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 43% | 72 |
| ejb.Polaris 1.0.1 | 15 | 13% | 20 |
| yagami.Tidus 0.11 | 14 | 12% | 30 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 36 |
| stelo.MirrorNano 1.3 | 10 | 8% | 10 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 4 |

## Melee bench: F14

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.2 | 133 / 210 | 2.79 | 17.8% | 27553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 17.8% | 133 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 16 |
| wee.Gem 1.8.4 | 3.5 | 11.8% | 27 |
| ratosh.Nobo 0.21 | 3.8 | 11.0% | 8 |
| wompi.Quokka 1.6 | 4.0 | 11.0% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 9.9% | 12 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.7% | 1 |
| maribo.FollowFire 1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.1 | 21 / 35 | 4777 |
| 2 | 1 | 66.8 | 81.0 | 23 / 35 | 4541 |
| 3 | 1 | 65.7 | 79.0 | 21 / 35 | 4069 |
| 4 | 1 | 66.4 | 78.1 | 21 / 35 | 4774 |
| 5 | 1 | 68.3 | 85.4 | 24 / 35 | 4816 |
| 6 | 1 | 66.3 | 79.4 | 23 / 35 | 4576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 94% |
| wee.Gem 1.8.4 | 34 | 91% |
| wompi.Quokka 1.6 | 22 | 100% |
| ratosh.Nobo 0.21 | 11 | 91% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| m3thos.Eva00 1.1 | 10 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 67% |

Hadur died in 77 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 16% | 59 |
| wee.Gem 1.8.4 | 12 | 16% | 43 |
| jeremyreeder.Vincent 2011.12.09 | 12 | 16% | 17 |
| stelo.MyAgileRobot 0.2 | 10 | 13% | 14 |
| m3thos.Eva00 1.1 | 8 | 10% | 17 |
| ratosh.Nobo 0.21 | 7 | 9% | 18 |
| wompi.Quokka 1.6 | 6 | 8% | 20 |
| bayen.UbaMicro 1.4 | 5 | 6% | 14 |
| maribo.FollowFire 1 | 5 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 86.5 | 80 / 210 | 2.22 | 20.2% | 46083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.3 | 20.2% | 80 |
| wompi.Wallaby 5.1 | 1.7 | 19.2% | 113 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 10 |
| ayk.WallHugger 1.0 | 4.7 | 9.5% | 0 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.8% | 5 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.3% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 90.2 | 15 / 35 | 7309 |
| 2 | 1 | 72.2 | 86.0 | 14 / 35 | 8299 |
| 3 | 1 | 70.9 | 87.3 | 12 / 35 | 7315 |
| 4 | 2 | 71.2 | 85.1 | 10 / 35 | 7782 |
| 5 | 2 | 70.9 | 83.2 | 13 / 35 | 7591 |
| 6 | 1 | 71.8 | 87.0 | 16 / 35 | 7787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 38% |
| mz.NanoGod 2.02 | 17 | 71% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |
| drd.Dreadknoght 0.9 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 97 | 74% | 144 |
| mz.NanoGod 2.02 | 16 | 12% | 32 |
| exauge.GateKeeper 1.1.121g | 8 | 6% | 15 |
| ayk.WallHugger 1.0 | 5 | 4% | 9 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 75.6 | 127 / 210 | 3.20 | 17.4% | 29184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 17.4% | 127 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 18 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.1% | 23 |
| bvh.micro.Freya 0.3 | 3.7 | 11.3% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.0% | 13 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.4% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.5% | 2 |
| ap.Frederick 1.1 | 8.8 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 26 / 35 | 4800 |
| 2 | 1 | 63.8 | 67.0 | 19 / 35 | 4858 |
| 3 | 1 | 66.9 | 81.9 | 24 / 35 | 4590 |
| 4 | 1 | 68.6 | 82.2 | 23 / 35 | 5452 |
| 5 | 1 | 65.1 | 71.4 | 19 / 35 | 4807 |
| 6 | 1 | 63.2 | 67.0 | 16 / 35 | 4677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 89% |
| dummy.micro.Sparrow 2.5 | 34 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 100% |
| bvh.micro.Freya 0.3 | 17 | 100% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 2 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 19% | 52 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 18% | 16 |
| dummy.micro.Sparrow 2.5 | 14 | 17% | 49 |
| bvh.micro.Freya 0.3 | 10 | 12% | 21 |
| conscience.Electron 1.3g | 8 | 10% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 8% | 33 |
| stelo.MirrorMicro 1.0 | 7 | 8% | 16 |
| dl.BetterWalls 1.0 | 7 | 8% | 12 |

## Melee bench: F17

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 89.1 | 158 / 210 | 1.98 | 21.4% | 41267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.4% | 158 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.9% | 12 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.4% | 8 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 1 |
| dsw.StaticD 1.0 | 5.3 | 8.7% | 8 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.1% | 3 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.8% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.8% | 1 |
| sample.Corners 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 85.4 | 23 / 35 | 7281 |
| 2 | 1 | 71.1 | 88.9 | 25 / 35 | 6803 |
| 3 | 1 | 71.9 | 90.2 | 27 / 35 | 6679 |
| 4 | 1 | 71.1 | 87.0 | 27 / 35 | 6458 |
| 5 | 1 | 71.6 | 90.2 | 27 / 35 | 6773 |
| 6 | 1 | 72.8 | 93.0 | 29 / 35 | 7273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 90% |
| sul.Lunar 1.1 | 43 | 91% |
| supersample.SuperBoxBot 1.0 | 33 | 91% |
| dsw.StaticD 1.0 | 14 | 79% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 14 | 26% | 65 |
| supersample.SuperBoxBot 1.0 | 13 | 24% | 38 |
| dsw.StaticD 1.0 | 13 | 24% | 28 |
| sul.Lunar 1.1 | 4 | 7% | 41 |
| sample.MyFirstRobot 1.0 | 4 | 7% | 10 |
| sample.Corners 1.0 | 2 | 4% | 6 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 83.0 | 127 / 210 | 2.53 | 19.1% | 38292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.1% | 127 |
| radnor.DoctorBob 1.42 | 2.8 | 12.5% | 23 |
| mld.Wisdom 1.0 | 3.0 | 12.2% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 11.5% | 22 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.0% | 6 |
| amz.NanoClone 1.41 | 5.3 | 9.8% | 10 |
| sample.Walls 1.0 | 7.2 | 7.8% | 3 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.7 | 6.6% | 1 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.5 | 25 / 35 | 6717 |
| 2 | 1 | 67.2 | 77.1 | 16 / 35 | 6381 |
| 3 | 1 | 69.7 | 86.7 | 25 / 35 | 6132 |
| 4 | 1 | 68.7 | 83.5 | 20 / 35 | 6370 |
| 5 | 1 | 67.7 | 77.8 | 20 / 35 | 6366 |
| 6 | 1 | 68.5 | 82.2 | 21 / 35 | 6326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 53 | 94% |
| radnor.DoctorBob 1.42 | 29 | 72% |
| mld.Wisdom 1.0 | 21 | 67% |
| KiraNL.Chupacabra 0.4 | 13 | 92% |
| jangs.ns51 1.0 | 11 | 100% |
| amz.NanoClone 1.41 | 9 | 89% |
| sample.Walls 1.0 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 67% |

Hadur died in 84 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 32% | 48 |
| radnor.DoctorBob 1.42 | 20 | 24% | 45 |
| KiraNL.Chupacabra 0.4 | 14 | 17% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 14% | 58 |
| amz.NanoClone 1.41 | 4 | 5% | 7 |
| GarmBox.Oranges 1.0 | 3 | 4% | 7 |
| sample.Walls 1.0 | 2 | 2% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 8 |

