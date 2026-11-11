# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.7 | 139 / 210 | 2.29 | 20.7% | 41929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.7% | 139 |
| radnor.DoctorBob 1.42 | 2.5 | 14.9% | 24 |
| mz.AntiGrav 1.0 | 2.7 | 14.6% | 21 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 3 |
| sample.Walls 1.0 | 6.2 | 7.5% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 25 / 35 | 6890 |
| 2 | 1 | 70.9 | 83.8 | 23 / 35 | 6853 |
| 3 | 1 | 71.1 | 83.5 | 23 / 35 | 6704 |
| 4 | 1 | 71.4 | 85.4 | 21 / 35 | 7171 |
| 5 | 1 | 72.6 | 89.5 | 25 / 35 | 7209 |
| 6 | 1 | 71.1 | 84.4 | 22 / 35 | 7102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 72 | 92% |
| radnor.DoctorBob 1.42 | 40 | 83% |
| mld.Infinity 2.2 | 30 | 87% |
| amz.NanoClone 1.41 | 4 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 36% | 65 |
| mz.AntiGrav 1.0 | 23 | 32% | 83 |
| mld.Infinity 2.2 | 8 | 11% | 32 |
| amz.NanoClone 1.41 | 6 | 8% | 11 |
| sample.Walls 1.0 | 4 | 6% | 10 |
| jangs.ns51 1.0 | 4 | 6% | 5 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.6 | 132 / 210 | 2.20 | 18.9% | 32847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.9% | 132 |
| oog.melee.Mercutio 1.0 | 2.3 | 14.1% | 36 |
| maribo.melee.BMV 0.1 | 3.7 | 10.8% | 4 |
| mld.DustBunny 3.8 | 3.8 | 11.9% | 14 |
| zyx.nano.Ant 1.1 | 5.8 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.3 | 7.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.6% | 6 |
| fullsail.SweetTea 1.1 | 7.8 | 7.6% | 12 |
| bzdp.BoxCar 2.0 | 8.3 | 7.4% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.0 | 19 / 35 | 4870 |
| 2 | 1 | 70.0 | 92.4 | 24 / 35 | 5820 |
| 3 | 1 | 69.4 | 89.5 | 22 / 35 | 6072 |
| 4 | 1 | 69.1 | 86.7 | 22 / 35 | 5680 |
| 5 | 1 | 68.8 | 85.4 | 24 / 35 | 5466 |
| 6 | 1 | 67.5 | 84.8 | 21 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 60 | 78% |
| mld.DustBunny 3.8 | 47 | 85% |
| maribo.melee.BMV 0.1 | 14 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 91% |
| djdjdj.NanoSkunk10 1.0 | 11 | 100% |
| fullsail.SweetTea 1.1 | 8 | 63% |
| zyx.nano.Ant 1.1 | 7 | 86% |

Hadur died in 78 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 27 | 35% | 79 |
| mld.DustBunny 3.8 | 16 | 21% | 49 |
| maribo.melee.BMV 0.1 | 9 | 12% | 20 |
| fullsail.SweetTea 1.1 | 7 | 9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 6 | 8% | 18 |
| zyx.nano.Ant 1.1 | 6 | 8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 19 |
| bzdp.BoxCar 2.0 | 2 | 3% | 4 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.3 | 135 / 210 | 2.50 | 20.1% | 38480 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.1% | 135 |
| myl.micro.Troodon 1.10 | 2.3 | 13.6% | 26 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.7% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.4% | 21 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.9% | 8 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 6 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.8% | 1 |
| sp.Nanos.Ember 1.1 | 7.7 | 6.9% | 4 |
| sample.Tracker 1.0 | 9.3 | 5.1% | 1 |
| sample.Fire 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.0 | 25 / 35 | 6212 |
| 2 | 1 | 70.7 | 86.3 | 24 / 35 | 6275 |
| 3 | 1 | 69.3 | 81.0 | 20 / 35 | 6247 |
| 4 | 1 | 71.3 | 84.8 | 23 / 35 | 7032 |
| 5 | 1 | 69.3 | 79.7 | 20 / 35 | 6461 |
| 6 | 1 | 69.7 | 81.9 | 23 / 35 | 6253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 40 | 78% |
| myl.micro.Troodon 1.10 | 33 | 97% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 21 | 90% |
| sp.Nanos.Ember 1.1 | 20 | 95% |
| fm.mammillarias 1.3 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 3 | 67% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 34 |
| cb.nano.Insomnia 1.0 | 15 | 20% | 18 |
| myl.nano.KomoriNinja 1.1 | 12 | 16% | 49 |
| fm.mammillarias 1.3 | 12 | 16% | 16 |
| myl.micro.Troodon 1.10 | 9 | 12% | 53 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 24 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| sample.Fire 1.0 | 2 | 3% | 7 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 86.0 | 152 / 210 | 2.26 | 20.7% | 40528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.7% | 152 |
| kawigi.nano.Lib 1.0 | 2.0 | 12.9% | 12 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.5% | 15 |
| tj.zombie1n 1.0.1 | 5.3 | 8.9% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 9.0% | 1 |
| yk.JahMicro 1.0 | 6.8 | 8.2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.6% | 4 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 28 / 35 | 7147 |
| 2 | 1 | 69.3 | 77.8 | 24 / 35 | 6838 |
| 3 | 1 | 70.5 | 86.0 | 24 / 35 | 6591 |
| 4 | 1 | 71.6 | 89.8 | 27 / 35 | 6963 |
| 5 | 1 | 72.3 | 93.0 | 29 / 35 | 6938 |
| 6 | 1 | 67.7 | 78.7 | 20 / 35 | 6051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 97% |
| stelo.SoJNanoMelee 1.1 | 50 | 90% |
| tj.zombie1n 1.0.1 | 18 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 75% |
| tvv.micro.Antares 1.1.1 | 10 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 28% | 89 |
| stelo.SoJNanoMelee 1.1 | 11 | 19% | 36 |
| tvv.micro.Antares 1.1.1 | 8 | 14% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 12% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 12% | 9 |
| tj.zombie1n 1.0.1 | 6 | 10% | 9 |
| sample.VelociRobot 1.0 | 2 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| yk.JahMicro 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.3 | 89 / 210 | 3.58 | 16.1% | 28943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 16.1% | 89 |
| oog.melee.Corsair 1.0 | 2.5 | 12.2% | 32 |
| ahf.NanoAndrew .4 | 3.0 | 11.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.1% | 26 |
| sam.Samspin 1.0 | 6.0 | 9.9% | 14 |
| EBBU.Sim2 1.02 | 6.0 | 9.6% | 3 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.0% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.0% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 68.6 | 17 / 35 | 4838 |
| 2 | 1 | 63.6 | 72.4 | 14 / 35 | 4457 |
| 3 | 1 | 61.2 | 64.4 | 14 / 35 | 4353 |
| 4 | 1 | 65.4 | 75.6 | 15 / 35 | 5149 |
| 5 | 1 | 66.3 | 80.6 | 17 / 35 | 5345 |
| 6 | 1 | 62.5 | 66.3 | 12 / 35 | 4801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 53% |
| simonton.nano.MeleeSeed 1.8 | 28 | 89% |
| ahf.NanoAndrew .4 | 25 | 72% |
| zyx.nano.BacillusComma 1.0 | 9 | 89% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 9 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 27 | 22% | 44 |
| simonton.nano.MeleeSeed 1.8 | 22 | 18% | 47 |
| ahf.NanoAndrew .4 | 20 | 16% | 38 |
| robar.nano.Assertive_Melee 0.2 | 18 | 15% | 22 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 10 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| EBBU.Sim2 1.02 | 6 | 5% | 15 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.8 | 127 / 210 | 2.46 | 18.8% | 32912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.8% | 127 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 33 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.2% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 15 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 4 |
| fm.claire 1.7 | 5.5 | 8.7% | 4 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.1% | 2 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 2 |
| pa.Improved 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 21 / 35 | 5137 |
| 2 | 1 | 68.4 | 81.9 | 20 / 35 | 5884 |
| 3 | 1 | 67.6 | 81.3 | 20 / 35 | 5374 |
| 4 | 1 | 68.6 | 84.8 | 23 / 35 | 5349 |
| 5 | 1 | 68.9 | 85.1 | 24 / 35 | 5557 |
| 6 | 1 | 68.1 | 83.2 | 19 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 82% |
| oog.melee.CapuletDroid 1.1 | 22 | 95% |
| gh.nano.Grofvuil 0.2 | 19 | 79% |
| arthord.NanoSatanMelee Beta | 14 | 86% |
| fm.claire 1.7 | 8 | 88% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 37% | 80 |
| gh.nano.Grofvuil 0.2 | 18 | 21% | 39 |
| arthord.NanoSatanMelee Beta | 8 | 10% | 13 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 31 |
| fm.claire 1.7 | 6 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 6 | 7% | 12 |
| kurios.DOSexe .9b | 4 | 5% | 12 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| pa.Improved 1.0 | 2 | 2% | 4 |

## Melee bench: F07

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.2 | 117 / 210 | 2.60 | 18.6% | 34932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.6% | 117 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 34 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.4% | 25 |
| mz.MicroGodMelee 1 | 3.7 | 12.4% | 15 |
| DBall.Anarchy 0.1 | 5.2 | 9.0% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.9% | 5 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 4 |
| acogdev.alpha 0.2 | 8.0 | 6.3% | 2 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.5% | 1 |
| fire219.CatBot 1.0 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.7 | 21 / 35 | 6535 |
| 2 | 1 | 67.3 | 80.0 | 17 / 35 | 5480 |
| 3 | 1 | 68.1 | 81.9 | 18 / 35 | 5726 |
| 4 | 1 | 69.1 | 85.1 | 20 / 35 | 5883 |
| 5 | 1 | 69.0 | 86.7 | 20 / 35 | 5600 |
| 6 | 1 | 66.8 | 73.7 | 21 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 47 | 89% |
| mz.MicroGodMelee 1 | 42 | 86% |
| gh.micro.Gruweltje 0.7 | 31 | 48% |
| DBall.Anarchy 0.1 | 10 | 100% |
| el.JumpShoot 0.2 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 60% |
| acogdev.alpha 0.2 | 2 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 38% | 60 |
| spinnercat.micro.Tyger 0.1 | 17 | 18% | 46 |
| mz.MicroGodMelee 1 | 16 | 17% | 55 |
| caimano.Furia_Ceca 0.22 | 8 | 9% | 13 |
| acogdev.alpha 0.2 | 7 | 8% | 8 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 9 |

## Melee bench: F08

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 67.4 | 93 / 210 | 3.94 | 15.8% | 30723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.3 | 15.8% | 93 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.8% | 39 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.5% | 7 |
| germ.TheMind .2 | 5.3 | 9.3% | 6 |
| awesomeness.Elite 1.0 | 6.0 | 8.9% | 11 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 8.0% | 1 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 6 |
| sample.Crazy 1.0 | 8.5 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 69.2 | 19 / 35 | 5425 |
| 2 | 2 | 65.0 | 72.7 | 17 / 35 | 5005 |
| 3 | 1 | 62.2 | 64.1 | 12 / 35 | 5023 |
| 4 | 1 | 63.6 | 66.7 | 17 / 35 | 5011 |
| 5 | 1 | 64.3 | 69.2 | 15 / 35 | 5431 |
| 6 | 2 | 61.8 | 62.2 | 13 / 35 | 4828 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 75% |
| germ.TheMind .2 | 13 | 100% |
| awesomeness.Elite 1.0 | 4 | 25% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 50% | 109 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 13% | 33 |
| awesomeness.Elite 1.0 | 12 | 10% | 18 |
| stelo.UntouchableNano 1.3 | 10 | 9% | 16 |
| germ.TheMind .2 | 7 | 6% | 13 |
| mym.EdgeStalker 1.0 | 5 | 4% | 5 |
| qualidafial.MajorDick 1.0.1 | 5 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 6 |

## Melee bench: F09

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.6 | 153 / 210 | 2.03 | 20.2% | 32707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 20.2% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 13.0% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.6% | 6 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.9% | 4 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 10 |
| stelo.PatternRobot 1.0 | 7.2 | 8.3% | 8 |
| spinnercat.Omen 1.0 | 8.0 | 7.7% | 2 |
| ratosh.Wesco 1.4 | 8.2 | 7.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 26 / 35 | 5578 |
| 2 | 1 | 71.1 | 90.5 | 24 / 35 | 5268 |
| 3 | 1 | 70.2 | 86.0 | 27 / 35 | 5325 |
| 4 | 1 | 70.3 | 89.8 | 25 / 35 | 5450 |
| 5 | 1 | 70.3 | 88.3 | 25 / 35 | 5333 |
| 6 | 1 | 70.5 | 88.3 | 26 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 89% |
| nz.jdc.nano.GridFu 1.0 | 37 | 100% |
| stelo.PatternRobot 1.0 | 19 | 89% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| maribo.IotaCT 1.1 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 5 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 30% | 64 |
| timmit.nano.TimDog 0.33 | 12 | 21% | 25 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 55 |
| stelo.PatternRobot 1.0 | 6 | 11% | 18 |
| maribo.IotaCT 1.1 | 6 | 11% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 9% | 10 |
| ratosh.Wesco 1.4 | 3 | 5% | 11 |
| spinnercat.Omen 1.0 | 0 | 0% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.2 | 174 / 210 | 1.61 | 21.8% | 40567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 21.8% | 174 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.4% | 14 |
| baal.nano.N 1.42 | 3.0 | 11.3% | 5 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 0 |
| zyx.micro.Ant 1.1 | 5.0 | 9.3% | 8 |
| sanja.First 0.1 | 5.8 | 8.4% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.2% | 2 |
| cvt.Firsty 1.0 | 8.7 | 6.5% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.5 | 27 / 35 | 6391 |
| 2 | 1 | 71.2 | 91.4 | 28 / 35 | 6670 |
| 3 | 1 | 72.1 | 94.9 | 29 / 35 | 6587 |
| 4 | 1 | 71.2 | 89.2 | 26 / 35 | 6814 |
| 5 | 1 | 73.1 | 96.2 | 31 / 35 | 7091 |
| 6 | 1 | 73.1 | 97.1 | 33 / 35 | 7014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 89% |
| baal.nano.N 1.42 | 36 | 92% |
| sanja.First 0.1 | 25 | 96% |
| zyx.micro.Ant 1.1 | 22 | 86% |
| amk.Punbot.Punbot 0.01 | 22 | 100% |
| cvt.Firsty 1.0 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 10 | 28% | 27 |
| tvv.nano.Polaris 1.2 | 8 | 22% | 70 |
| baal.nano.N 1.42 | 7 | 19% | 47 |
| Grystrion.TrackerWO 1.0 | 6 | 17% | 11 |
| cvt.Firsty 1.0 | 2 | 6% | 19 |
| sanja.First 0.1 | 2 | 6% | 17 |
| sample.RamFire 1.0 | 1 | 3% | 2 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 8 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |

## Melee bench: F11

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 62.5 | 74 / 210 | 4.37 | 14.6% | 31345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 14.8% | 56 |
| hadur117.micro.SaorWTD 0.1 | 1.8 | 14.6% | 74 |
| cs.Wren 1.0 | 2.8 | 13.0% | 32 |
| js.PinBall 1.6 | 4.3 | 11.3% | 15 |
| mz.Cork 0.1 | 4.8 | 10.8% | 13 |
| joe.ADinosaur 1.0 | 6.0 | 9.7% | 3 |
| evd.X1 0.01 | 6.8 | 8.5% | 5 |
| jsal.Jsalbot 1.0 | 8.5 | 6.5% | 6 |
| donjezza.Jezza 1.0 | 8.8 | 6.2% | 6 |
| PSW.Relentless 0.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 73.7 | 16 / 35 | 5147 |
| 2 | 2 | 62.3 | 63.8 | 12 / 35 | 5297 |
| 3 | 2 | 60.1 | 57.5 | 8 / 35 | 5227 |
| 4 | 2 | 60.4 | 60.0 | 12 / 35 | 5096 |
| 5 | 1 | 63.7 | 66.7 | 16 / 35 | 5680 |
| 6 | 3 | 58.8 | 53.7 | 10 / 35 | 4898 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 46 | 76% |
| cs.Wren 1.0 | 20 | 85% |
| mz.Cork 0.1 | 10 | 90% |
| js.PinBall 1.6 | 6 | 83% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| evd.X1 0.01 | 1 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 58 | 42% | 100 |
| joe.ADinosaur 1.0 | 19 | 14% | 21 |
| cs.Wren 1.0 | 18 | 13% | 27 |
| js.PinBall 1.6 | 11 | 8% | 18 |
| mz.Cork 0.1 | 10 | 7% | 15 |
| PSW.Relentless 0.1 | 9 | 7% | 11 |
| evd.X1 0.01 | 8 | 6% | 7 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 82.5 | 135 / 210 | 2.57 | 18.7% | 29667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.7% | 135 |
| myl.nano.Graviton 1.10 | 2.8 | 11.7% | 22 |
| stelo.AreaTargetingBot 1.1 | 3.5 | 11.2% | 18 |
| ntc.Opposite 1.5 | 3.7 | 11.2% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.2% | 3 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.3% | 7 |
| disan.Chair 2.2.0 | 6.5 | 8.5% | 8 |
| DBall.NUKE 0.1 | 8.0 | 7.3% | 3 |
| donjezza.Muncho 1.0 | 9.0 | 6.3% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 22 / 35 | 5204 |
| 2 | 1 | 69.4 | 85.7 | 25 / 35 | 5305 |
| 3 | 1 | 68.3 | 85.1 | 22 / 35 | 4933 |
| 4 | 1 | 65.7 | 77.5 | 19 / 35 | 4632 |
| 5 | 1 | 67.1 | 79.0 | 21 / 35 | 4887 |
| 6 | 1 | 68.4 | 84.8 | 26 / 35 | 4706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 38 | 87% |
| myl.nano.Graviton 1.10 | 29 | 90% |
| disan.Chair 2.2.0 | 16 | 94% |
| ntc.Opposite 1.5 | 15 | 93% |
| donjezza.Muncho 1.0 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| pbg.R2D2 1.0 | 7 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 21% | 44 |
| ntc.Opposite 1.5 | 13 | 17% | 29 |
| myl.nano.Graviton 1.10 | 13 | 17% | 27 |
| pfvicm.Sobieski 7.2.3b | 12 | 16% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 12% | 24 |
| disan.Chair 2.2.0 | 6 | 8% | 24 |
| pbg.R2D2 1.0 | 4 | 5% | 12 |
| donjezza.Muncho 1.0 | 2 | 3% | 14 |
| DBall.NUKE 0.1 | 2 | 3% | 12 |

## Melee bench: F13

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.0 | 62 / 210 | 4.06 | 14.5% | 26578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.7 | 14.5% | 60 |
| hadur117.micro.SaorWTD 0.1 | 1.8 | 14.5% | 62 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 28 |
| yagami.Tidus 0.11 | 4.5 | 12.2% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.2% | 7 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 74.9 | 7 / 35 | 4969 |
| 2 | 1 | 62.4 | 69.2 | 10 / 35 | 4265 |
| 3 | 1 | 62.8 | 65.4 | 13 / 35 | 4524 |
| 4 | 3 | 61.8 | 63.2 | 9 / 35 | 4337 |
| 5 | 3 | 60.1 | 57.8 | 12 / 35 | 4243 |
| 6 | 2 | 62.4 | 65.7 | 11 / 35 | 4240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| oog.melee.Capulet 1.2 | 19 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 74% |
| yagami.Tidus 0.11 | 14 | 93% |
| ejb.Polaris 1.0.1 | 2 | 50% |

Hadur died in 148 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 58 | 39% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 16% | 36 |
| yagami.Tidus 0.11 | 23 | 16% | 34 |
| ejb.Polaris 1.0.1 | 12 | 8% | 14 |
| kawigi.micro.Shiz 1.1 | 11 | 7% | 31 |
| kurios.DOSexe .9a | 11 | 7% | 11 |
| step.nanoPri 1.0 | 5 | 3% | 6 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.5 | 130 / 210 | 2.75 | 17.8% | 28739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 17.8% | 130 |
| wee.Gem 1.8.4 | 3.2 | 11.8% | 28 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 21 |
| wompi.Quokka 1.6 | 3.3 | 11.4% | 13 |
| ratosh.Nobo 0.21 | 4.7 | 10.7% | 5 |
| m3thos.Eva00 1.1 | 5.7 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 7.0 | 9.1% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.5% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 21 / 35 | 5029 |
| 2 | 1 | 65.4 | 74.9 | 21 / 35 | 4668 |
| 3 | 1 | 66.5 | 81.6 | 21 / 35 | 4621 |
| 4 | 1 | 62.0 | 67.9 | 14 / 35 | 4221 |
| 5 | 1 | 69.4 | 86.7 | 28 / 35 | 5190 |
| 6 | 1 | 68.6 | 86.7 | 25 / 35 | 5010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 87% |
| wee.Gem 1.8.4 | 38 | 97% |
| wompi.Quokka 1.6 | 23 | 83% |
| m3thos.Eva00 1.1 | 16 | 88% |
| ratosh.Nobo 0.21 | 16 | 81% |
| bayen.UbaMicro 1.4 | 7 | 71% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 50 |
| ratosh.Nobo 0.21 | 12 | 15% | 28 |
| wompi.Quokka 1.6 | 10 | 13% | 21 |
| bayen.UbaMicro 1.4 | 9 | 11% | 18 |
| wee.Gem 1.8.4 | 8 | 10% | 45 |
| m3thos.Eva00 1.1 | 7 | 9% | 20 |
| maribo.FollowFire 1 | 7 | 9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 9% | 8 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 7 |

## Melee bench: F15

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 81.0 | 98 / 210 | 2.71 | 19.7% | 45368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 19.7% | 98 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 72 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 22 |
| ayk.WallHugger 1.0 | 4.2 | 10.6% | 8 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 6.7% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 83.2 | 18 / 35 | 7630 |
| 2 | 1 | 72.3 | 83.8 | 21 / 35 | 7991 |
| 3 | 1 | 69.1 | 78.1 | 15 / 35 | 6841 |
| 4 | 1 | 70.2 | 80.6 | 11 / 35 | 8025 |
| 5 | 1 | 70.7 | 81.3 | 16 / 35 | 7468 |
| 6 | 1 | 70.8 | 79.0 | 17 / 35 | 7413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 94 | 71% |
| mz.NanoGod 2.02 | 13 | 54% |
| ayk.WallHugger 1.0 | 8 | 88% |
| exauge.GateKeeper 1.1.121g | 8 | 88% |
| sample.SittingDuck 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 51 | 45% | 121 |
| mz.NanoGod 2.02 | 30 | 26% | 40 |
| ayk.WallHugger 1.0 | 15 | 13% | 22 |
| exauge.GateKeeper 1.1.121g | 9 | 8% | 12 |
| stelo.PianistNano 1.2 | 5 | 4% | 7 |
| stuff.Vlad 0.1 | 4 | 4% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 73.9 | 108 / 210 | 3.35 | 17.0% | 30788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 17.0% | 108 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.3% | 25 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.4% | 21 |
| bvh.micro.Freya 0.3 | 4.3 | 10.9% | 17 |
| stelo.MirrorMicro 1.0 | 6.3 | 9.1% | 9 |
| conscience.Electron 1.3g | 6.5 | 8.7% | 0 |
| ap.Frederick 1.1 | 8.3 | 6.6% | 7 |
| dl.BetterWalls 1.0 | 9.0 | 6.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.1 | 20 / 35 | 5306 |
| 2 | 1 | 66.7 | 78.4 | 19 / 35 | 5439 |
| 3 | 1 | 62.5 | 64.4 | 13 / 35 | 4768 |
| 4 | 1 | 67.5 | 81.0 | 23 / 35 | 5119 |
| 5 | 1 | 67.2 | 80.6 | 17 / 35 | 5602 |
| 6 | 1 | 62.2 | 61.9 | 16 / 35 | 4554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 47 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 29 | 76% |
| dummy.micro.Sparrow 2.5 | 25 | 76% |
| bvh.micro.Freya 0.3 | 19 | 84% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 4 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 21% | 58 |
| dummy.micro.Sparrow 2.5 | 18 | 18% | 38 |
| conscience.Electron 1.3g | 16 | 16% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 15 | 15% | 37 |
| bvh.micro.Freya 0.3 | 7 | 7% | 19 |
| dl.BetterWalls 1.0 | 6 | 6% | 11 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 14 |

## Melee bench: F17

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 87.0 | 156 / 210 | 2.17 | 21.2% | 42792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 21.2% | 156 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.6% | 13 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.6% | 12 |
| sul.Lunar 1.1 | 3.5 | 11.4% | 14 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.1% | 4 |
| dsw.StaticD 1.0 | 5.7 | 9.0% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.5% | 3 |
| sample.Corners 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.9 | 29 / 35 | 6492 |
| 2 | 1 | 71.8 | 88.9 | 27 / 35 | 7282 |
| 3 | 1 | 70.1 | 82.5 | 26 / 35 | 6748 |
| 4 | 1 | 70.1 | 82.9 | 22 / 35 | 6962 |
| 5 | 1 | 72.5 | 90.2 | 25 / 35 | 7494 |
| 6 | 1 | 72.7 | 88.6 | 27 / 35 | 7814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 42 | 93% |
| sul.Lunar 1.1 | 40 | 100% |
| supersample.SuperBoxBot 1.0 | 36 | 97% |
| dsw.StaticD 1.0 | 14 | 71% |
| tlp.ThreeLeggedPig 1 | 9 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 29% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 27% | 59 |
| dsw.StaticD 1.0 | 10 | 18% | 23 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 13 |
| tlp.ThreeLeggedPig 1 | 3 | 5% | 9 |
| sul.Lunar 1.1 | 2 | 4% | 46 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 7 |
| sample.Corners 1.0 | 1 | 2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWTD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 77.5 | 103 / 210 | 3.03 | 18.0% | 38122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWTD 0.1 | 1.0 | 18.0% | 103 |
| radnor.DoctorBob 1.42 | 2.0 | 13.7% | 37 |
| mld.Wisdom 1.0 | 3.7 | 11.5% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.0% | 23 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.2% | 8 |
| amz.NanoClone 1.41 | 5.8 | 10.1% | 11 |
| sample.Walls 1.0 | 7.3 | 7.5% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.0% | 1 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.3 | 19 / 35 | 6394 |
| 2 | 1 | 67.3 | 78.7 | 17 / 35 | 6311 |
| 3 | 1 | 67.1 | 77.5 | 17 / 35 | 6153 |
| 4 | 1 | 69.6 | 82.2 | 21 / 35 | 7026 |
| 5 | 1 | 65.0 | 71.7 | 13 / 35 | 5977 |
| 6 | 1 | 66.6 | 73.3 | 16 / 35 | 6261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 31 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| mld.Wisdom 1.0 | 11 | 55% |
| sample.Walls 1.0 | 10 | 100% |
| amz.NanoClone 1.41 | 8 | 100% |
| sample.Target 1.0 | 6 | 100% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 31% | 41 |
| radnor.DoctorBob 1.42 | 27 | 25% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 16% | 54 |
| KiraNL.Chupacabra 0.4 | 16 | 15% | 25 |
| amz.NanoClone 1.41 | 5 | 5% | 14 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| sample.Walls 1.0 | 3 | 3% | 13 |
| jangs.ns51 1.0 | 2 | 2% | 4 |

