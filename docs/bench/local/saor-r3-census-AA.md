# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 90.0 | 159 / 210 | 1.90 | 21.9% | 44828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.9% | 159 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 17 |
| mz.AntiGrav 1.0 | 3.2 | 13.4% | 13 |
| mld.Infinity 2.2 | 3.3 | 12.6% | 15 |
| amz.NanoClone 1.41 | 4.8 | 10.4% | 4 |
| sample.Walls 1.0 | 7.0 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 1 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 1 |
| arthord.MannyPacquiao Beta | 9.5 | 3.9% | 0 |
| sample.Target 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 88.9 | 24 / 35 | 7556 |
| 2 | 1 | 71.9 | 86.7 | 28 / 35 | 7153 |
| 3 | 1 | 74.1 | 93.0 | 28 / 35 | 8239 |
| 4 | 1 | 72.8 | 93.3 | 29 / 35 | 6994 |
| 5 | 1 | 73.2 | 93.0 | 28 / 35 | 7424 |
| 6 | 1 | 71.5 | 85.1 | 22 / 35 | 7462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 62 | 95% |
| mld.Infinity 2.2 | 49 | 88% |
| radnor.DoctorBob 1.42 | 38 | 87% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 39% | 83 |
| mz.AntiGrav 1.0 | 14 | 27% | 70 |
| mld.Infinity 2.2 | 9 | 18% | 13 |
| amz.NanoClone 1.41 | 4 | 8% | 20 |
| jangs.ns51 1.0 | 2 | 4% | 10 |
| GarmBox.Oranges 1.0 | 1 | 2% | 4 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F02

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 140 / 210 | 2.47 | 18.6% | 30766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.3 | 18.6% | 140 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.3% | 43 |
| mld.DustBunny 3.8 | 2.7 | 13.6% | 9 |
| maribo.melee.BMV 0.1 | 4.2 | 10.5% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.3% | 10 |
| zyx.nano.Ant 1.1 | 6.3 | 8.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.7% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.9% | 1 |
| fullsail.SweetTea 1.1 | 8.7 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.3 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.8 | 30 / 35 | 5365 |
| 2 | 1 | 68.1 | 84.4 | 22 / 35 | 4999 |
| 3 | 1 | 69.7 | 91.4 | 23 / 35 | 5425 |
| 4 | 1 | 70.6 | 93.0 | 26 / 35 | 5410 |
| 5 | 1 | 68.4 | 87.3 | 26 / 35 | 4719 |
| 6 | 3 | 61.4 | 55.9 | 13 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 64 | 75% |
| mld.DustBunny 3.8 | 55 | 95% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 100% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 37% | 77 |
| mld.DustBunny 3.8 | 13 | 19% | 63 |
| cs.Grudge 1.0 | 10 | 14% | 8 |
| zyx.nano.Ant 1.1 | 7 | 10% | 12 |
| maribo.melee.BMV 0.1 | 4 | 6% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 20 |
| fullsail.SweetTea 1.1 | 3 | 4% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 11 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 87.7 | 154 / 210 | 2.10 | 20.8% | 37580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.8% | 154 |
| myl.micro.Troodon 1.10 | 2.0 | 13.7% | 23 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.9% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 10.8% | 14 |
| fm.mammillarias 1.3 | 5.2 | 9.1% | 2 |
| cb.nano.Insomnia 1.0 | 5.8 | 8.6% | 7 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.1% | 4 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |
| sample.Fire 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 95.9 | 32 / 35 | 7226 |
| 2 | 1 | 70.9 | 87.3 | 24 / 35 | 6600 |
| 3 | 1 | 71.5 | 89.8 | 26 / 35 | 6187 |
| 4 | 1 | 68.6 | 80.6 | 23 / 35 | 5574 |
| 5 | 1 | 70.6 | 87.6 | 25 / 35 | 6146 |
| 6 | 1 | 70.1 | 85.1 | 24 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 50 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 89% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| myl.nano.KomoriNinja 1.1 | 23 | 91% |
| sp.Nanos.Ember 1.1 | 21 | 100% |
| fm.mammillarias 1.3 | 5 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 13 | 23% | 35 |
| myl.micro.Troodon 1.10 | 12 | 21% | 65 |
| myl.nano.KomoriNinja 1.1 | 9 | 16% | 45 |
| cb.nano.Insomnia 1.0 | 9 | 16% | 13 |
| fm.mammillarias 1.3 | 8 | 14% | 15 |
| sample.Fire 1.0 | 2 | 4% | 8 |
| cs.sheldor.Talon 1.1 | 2 | 4% | 7 |
| sp.Nanos.Ember 1.1 | 1 | 2% | 22 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 88.0 | 156 / 210 | 2.08 | 20.7% | 39018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.7% | 156 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.1% | 20 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.9% | 16 |
| tj.zombie1n 1.0.1 | 4.7 | 9.1% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.7% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 8.7% | 4 |
| yk.JahMicro 1.0 | 6.8 | 8.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.7% | 6 |
| repositorio.NanoStep 1.0 | 8.7 | 6.8% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.6 | 27 / 35 | 6706 |
| 2 | 1 | 71.4 | 91.4 | 26 / 35 | 6617 |
| 3 | 1 | 71.2 | 89.8 | 26 / 35 | 6646 |
| 4 | 1 | 72.2 | 93.0 | 30 / 35 | 6674 |
| 5 | 1 | 69.6 | 83.8 | 26 / 35 | 6218 |
| 6 | 1 | 68.5 | 82.5 | 21 / 35 | 6157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 92% |
| stelo.SoJNanoMelee 1.1 | 44 | 100% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| tj.zombie1n 1.0.1 | 16 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 64% |
| yk.JahMicro 1.0 | 12 | 83% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 29% | 85 |
| stelo.SoJNanoMelee 1.1 | 9 | 16% | 34 |
| tvv.micro.Antares 1.1.1 | 8 | 15% | 23 |
| tj.zombie1n 1.0.1 | 7 | 13% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 11% | 15 |
| yk.JahMicro 1.0 | 5 | 9% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |

## Melee bench: F05

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 74.0 | 109 / 210 | 3.34 | 16.8% | 29733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 16.8% | 109 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 24 |
| ahf.NanoAndrew .4 | 3.0 | 11.7% | 25 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 22 |
| EBBU.Sim2 1.02 | 5.3 | 9.7% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.4% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 8.8% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7.8 | 8.1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.8% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.5 | 15 / 35 | 4870 |
| 2 | 1 | 63.6 | 69.8 | 16 / 35 | 4866 |
| 3 | 1 | 60.0 | 60.3 | 14 / 35 | 4394 |
| 4 | 1 | 67.1 | 80.6 | 22 / 35 | 5196 |
| 5 | 1 | 66.7 | 77.8 | 18 / 35 | 5112 |
| 6 | 1 | 69.1 | 85.7 | 24 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 74% |
| simonton.nano.MeleeSeed 1.8 | 33 | 94% |
| ahf.NanoAndrew .4 | 26 | 88% |
| EBBU.Sim2 1.02 | 13 | 85% |
| sam.Samspin 1.0 | 9 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 21 | 21% | 47 |
| oog.melee.Corsair 1.0 | 20 | 20% | 49 |
| robar.nano.Assertive_Melee 0.2 | 14 | 14% | 18 |
| zyx.nano.BacillusComma 1.0 | 9 | 9% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 9% | 10 |
| ahf.NanoAndrew .4 | 8 | 8% | 34 |
| EBBU.Sim2 1.02 | 7 | 7% | 16 |
| sample.TrackFire 1.0 | 7 | 7% | 8 |
| sam.Samspin 1.0 | 6 | 6% | 14 |

## Melee bench: F06

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.6 | 143 / 210 | 2.30 | 19.1% | 31024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.1% | 143 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 23 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.4% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 9.7% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 8 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.6% | 6 |
| fm.claire 1.7 | 6.3 | 8.1% | 0 |
| sample.SpinBot 1.0 | 7.3 | 7.7% | 5 |
| pa.Improved 1.0 | 9.2 | 6.3% | 1 |
| kurios.DOSexe .9b | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 21 / 35 | 4975 |
| 2 | 1 | 69.1 | 88.9 | 25 / 35 | 5116 |
| 3 | 1 | 69.4 | 90.5 | 24 / 35 | 5531 |
| 4 | 1 | 69.6 | 91.7 | 27 / 35 | 4771 |
| 5 | 1 | 65.9 | 74.0 | 20 / 35 | 5150 |
| 6 | 1 | 70.1 | 90.5 | 26 / 35 | 5481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 92% |
| oog.melee.CapuletDroid 1.1 | 36 | 81% |
| arthord.NanoSatanMelee Beta | 19 | 84% |
| gh.nano.Grofvuil 0.2 | 17 | 76% |
| sample.SpinBot 1.0 | 15 | 87% |
| winamp32.micro.MicroMacro 1.0 | 8 | 63% |
| kurios.DOSexe .9b | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 69 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 14 | 20% | 18 |
| d414.nano.Quantum 1.0.0 | 12 | 17% | 78 |
| arthord.NanoSatanMelee Beta | 11 | 16% | 21 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 37 |
| sample.SpinBot 1.0 | 8 | 12% | 14 |
| winamp32.micro.MicroMacro 1.0 | 4 | 6% | 16 |
| fm.claire 1.7 | 4 | 6% | 9 |
| pa.Improved 1.0 | 4 | 6% | 8 |
| kurios.DOSexe .9b | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.9 | 106 / 210 | 2.36 | 18.6% | 33206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.6% | 106 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.8% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.2% | 19 |
| mz.MicroGodMelee 1 | 3.3 | 13.3% | 37 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 0 |
| acogdev.alpha 0.2 | 8.0 | 6.2% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.1 | 19 / 35 | 5951 |
| 2 | 1 | 68.2 | 84.4 | 15 / 35 | 5703 |
| 3 | 1 | 68.1 | 83.2 | 16 / 35 | 5561 |
| 4 | 1 | 67.6 | 84.4 | 17 / 35 | 5202 |
| 5 | 1 | 68.3 | 85.7 | 18 / 35 | 5346 |
| 6 | 1 | 69.0 | 87.3 | 21 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 59 | 85% |
| mz.MicroGodMelee 1 | 44 | 43% |
| gh.micro.Gruweltje 0.7 | 34 | 41% |
| DBall.Anarchy 0.1 | 13 | 100% |
| el.JumpShoot 0.2 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| acogdev.alpha 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 41 | 39% | 62 |
| gh.micro.Gruweltje 0.7 | 28 | 27% | 50 |
| spinnercat.micro.Tyger 0.1 | 19 | 18% | 59 |
| DBall.Anarchy 0.1 | 4 | 4% | 14 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |

## Melee bench: F08

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.9 | 118 / 210 | 3.26 | 17.3% | 32299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.2 | 17.3% | 118 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.3% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.7% | 22 |
| germ.TheMind .2 | 5.0 | 9.7% | 6 |
| awesomeness.Elite 1.0 | 5.7 | 9.0% | 6 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 9.2% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.4% | 4 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.4% | 6 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 81.9 | 22 / 35 | 5781 |
| 2 | 1 | 68.4 | 83.2 | 20 / 35 | 5568 |
| 3 | 1 | 63.6 | 66.3 | 19 / 35 | 5105 |
| 4 | 1 | 66.2 | 76.5 | 20 / 35 | 5073 |
| 5 | 2 | 64.4 | 68.9 | 17 / 35 | 5332 |
| 6 | 1 | 65.9 | 72.7 | 20 / 35 | 5440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 77 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 22 | 82% |
| germ.TheMind .2 | 9 | 89% |
| awesomeness.Elite 1.0 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| stelo.UntouchableNano 1.3 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 45% | 105 |
| awesomeness.Elite 1.0 | 15 | 16% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 14% | 29 |
| germ.TheMind .2 | 7 | 7% | 15 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 10 |
| stelo.UntouchableNano 1.3 | 5 | 5% | 13 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 8 |
| mym.EdgeStalker 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.5 | 167 / 210 | 1.77 | 20.5% | 30289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 20.5% | 167 |
| rz.HawkOnFire 0.1 | 2.3 | 13.5% | 16 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 12.5% | 12 |
| maribo.IotaCT 1.1 | 4.7 | 10.3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.7% | 1 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 2 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 5 |
| ratosh.Wesco 1.4 | 8.0 | 7.5% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 7.2% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 28 / 35 | 5362 |
| 2 | 1 | 70.1 | 89.2 | 26 / 35 | 4791 |
| 3 | 1 | 71.4 | 93.0 | 28 / 35 | 5122 |
| 4 | 1 | 71.0 | 92.1 | 29 / 35 | 4943 |
| 5 | 1 | 70.9 | 89.5 | 29 / 35 | 4702 |
| 6 | 1 | 71.4 | 92.7 | 27 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 96% |
| nz.jdc.nano.GridFu 1.0 | 45 | 100% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| timmit.nano.TimDog 0.33 | 11 | 91% |
| maribo.IotaCT 1.1 | 11 | 91% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| ratosh.Wesco 1.4 | 4 | 75% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 33% | 67 |
| timmit.nano.TimDog 0.33 | 9 | 21% | 25 |
| stelo.PatternRobot 1.0 | 8 | 19% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4 | 9% | 56 |
| maribo.IotaCT 1.1 | 4 | 9% | 18 |
| ratosh.Wesco 1.4 | 3 | 7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.5 | 177 / 210 | 1.77 | 21.6% | 39633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 21.6% | 177 |
| tvv.nano.Polaris 1.2 | 2.2 | 11.8% | 11 |
| baal.nano.N 1.42 | 2.8 | 11.1% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 5.8 | 8.7% | 0 |
| sanja.First 0.1 | 6.8 | 8.1% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 4 |
| cvt.Firsty 1.0 | 8.7 | 6.8% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 90.8 | 30 / 35 | 6812 |
| 2 | 1 | 72.7 | 93.3 | 31 / 35 | 7038 |
| 3 | 1 | 71.8 | 91.7 | 32 / 35 | 6604 |
| 4 | 1 | 71.4 | 90.8 | 27 / 35 | 6540 |
| 5 | 1 | 71.3 | 91.7 | 29 / 35 | 6396 |
| 6 | 1 | 70.7 | 90.5 | 28 / 35 | 6243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 44 | 93% |
| cvt.Firsty 1.0 | 27 | 93% |
| baal.nano.N 1.42 | 26 | 100% |
| amk.Punbot.Punbot 0.01 | 24 | 92% |
| sanja.First 0.1 | 22 | 100% |
| zyx.micro.Ant 1.1 | 18 | 94% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 12 | 34% | 64 |
| zyx.micro.Ant 1.1 | 8 | 23% | 42 |
| cvt.Firsty 1.0 | 3 | 9% | 17 |
| amk.Punbot.Punbot 0.01 | 3 | 9% | 12 |
| baal.nano.N 1.42 | 2 | 6% | 30 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 15 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| sanja.First 0.1 | 1 | 3% | 18 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |
2 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.4 | 96 / 210 | 3.21 | 16.8% | 31601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.3 | 16.8% | 96 |
| kc.micro.Figment 1.0 | 1.7 | 15.4% | 68 |
| cs.Wren 1.0 | 3.3 | 12.3% | 12 |
| js.PinBall 1.6 | 4.2 | 11.2% | 11 |
| mz.Cork 0.1 | 4.7 | 10.8% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.3% | 3 |
| evd.X1 0.01 | 6.7 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.5% | 4 |
| donjezza.Jezza 1.0 | 8.8 | 5.7% | 5 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 67.3 | 8 / 35 | 4987 |
| 2 | 1 | 67.0 | 77.8 | 20 / 35 | 5435 |
| 3 | 1 | 68.5 | 87.0 | 19 / 35 | 5451 |
| 4 | 2 | 63.9 | 69.5 | 13 / 35 | 5138 |
| 5 | 1 | 67.2 | 81.3 | 19 / 35 | 5362 |
| 6 | 1 | 64.3 | 69.5 | 17 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 54% |
| cs.Wren 1.0 | 22 | 100% |
| js.PinBall 1.6 | 11 | 82% |
| mz.Cork 0.1 | 10 | 100% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 55 | 48% | 104 |
| js.PinBall 1.6 | 17 | 15% | 28 |
| cs.Wren 1.0 | 9 | 8% | 17 |
| mz.Cork 0.1 | 8 | 7% | 19 |
| joe.ADinosaur 1.0 | 8 | 7% | 15 |
| evd.X1 0.01 | 7 | 6% | 10 |
| PSW.Relentless 0.1 | 5 | 4% | 4 |
| jsal.Jsalbot 1.0 | 4 | 4% | 11 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.6 | 139 / 210 | 2.39 | 19.2% | 30325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.2% | 139 |
| myl.nano.Graviton 1.10 | 2.5 | 11.5% | 21 |
| ntc.Opposite 1.5 | 3.7 | 10.7% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 10.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 10.1% | 14 |
| DBall.NUKE 0.1 | 7.2 | 8.1% | 9 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 8 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 27 / 35 | 5457 |
| 2 | 1 | 68.1 | 83.5 | 23 / 35 | 4890 |
| 3 | 1 | 69.2 | 86.7 | 24 / 35 | 5099 |
| 4 | 1 | 67.0 | 81.9 | 21 / 35 | 4515 |
| 5 | 1 | 69.1 | 84.1 | 22 / 35 | 5505 |
| 6 | 1 | 67.4 | 81.9 | 22 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 39 | 85% |
| myl.nano.Graviton 1.10 | 37 | 89% |
| ntc.Opposite 1.5 | 20 | 85% |
| donjezza.Muncho 1.0 | 16 | 94% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| disan.Chair 2.2.0 | 12 | 92% |
| DBall.NUKE 0.1 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 17 | 24% | 44 |
| pfvicm.Sobieski 7.2.3b | 16 | 22% | 28 |
| stelo.AreaTargetingBot 1.1 | 14 | 19% | 41 |
| ntc.Opposite 1.5 | 11 | 15% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 6% | 20 |
| disan.Chair 2.2.0 | 4 | 6% | 20 |
| donjezza.Muncho 1.0 | 2 | 3% | 12 |
| DBall.NUKE 0.1 | 2 | 3% | 10 |
| pbg.R2D2 1.0 | 2 | 3% | 9 |

## Melee bench: F13

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.6 | 89 / 210 | 3.73 | 15.2% | 25096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 15.2% | 89 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.7% | 36 |
| oog.melee.Capulet 1.2 | 2.8 | 13.3% | 45 |
| yagami.Tidus 0.11 | 4.2 | 12.5% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.1% | 18 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.4% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 68.6 | 15 / 35 | 4280 |
| 2 | 1 | 64.9 | 74.0 | 15 / 35 | 4350 |
| 3 | 1 | 61.3 | 60.3 | 16 / 35 | 3955 |
| 4 | 1 | 63.8 | 73.3 | 15 / 35 | 3920 |
| 5 | 1 | 62.5 | 68.9 | 11 / 35 | 4249 |
| 6 | 1 | 64.8 | 72.7 | 17 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| oog.melee.Capulet 1.2 | 34 | 59% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 89% |
| yagami.Tidus 0.11 | 16 | 81% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 44% | 80 |
| yagami.Tidus 0.11 | 20 | 17% | 30 |
| kawigi.micro.Shiz 1.1 | 12 | 10% | 29 |
| ejb.Polaris 1.0.1 | 11 | 9% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 7% | 26 |
| stelo.MirrorNano 1.3 | 8 | 7% | 8 |
| kurios.DOSexe .9a | 5 | 4% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 7 |

## Melee bench: F14

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.5 | 139 / 210 | 2.75 | 18.0% | 28145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 18.0% | 139 |
| bzdp.Pansy 2.1 | 2.5 | 12.8% | 20 |
| wee.Gem 1.8.4 | 3.3 | 12.0% | 27 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 13 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 7 |
| m3thos.Eva00 1.1 | 6.0 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.8 | 8.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.0 | 25 / 35 | 4429 |
| 2 | 1 | 66.7 | 77.8 | 20 / 35 | 4954 |
| 3 | 1 | 67.2 | 80.3 | 22 / 35 | 4698 |
| 4 | 1 | 66.1 | 80.0 | 21 / 35 | 4322 |
| 5 | 1 | 68.0 | 82.5 | 26 / 35 | 4839 |
| 6 | 1 | 67.6 | 81.6 | 25 / 35 | 4903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 53 | 96% |
| bzdp.Pansy 2.1 | 44 | 86% |
| wompi.Quokka 1.6 | 21 | 90% |
| ratosh.Nobo 0.21 | 15 | 87% |
| m3thos.Eva00 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 17% | 51 |
| m3thos.Eva00 1.1 | 9 | 13% | 20 |
| stelo.MyAgileRobot 0.2 | 8 | 11% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 12 |
| maribo.FollowFire 1 | 8 | 11% | 11 |
| wee.Gem 1.8.4 | 7 | 10% | 47 |
| wompi.Quokka 1.6 | 7 | 10% | 18 |
| bayen.UbaMicro 1.4 | 7 | 10% | 16 |
| ratosh.Nobo 0.21 | 6 | 8% | 18 |

## Melee bench: F15

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.0 | 84 / 210 | 2.35 | 20.0% | 44723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.2 | 20.0% | 84 |
| wompi.Wallaby 5.1 | 1.8 | 18.9% | 105 |
| mz.NanoGod 2.02 | 3.0 | 14.6% | 13 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.4% | 4 |
| ayk.WallHugger 1.0 | 4.8 | 9.4% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 86.7 | 17 / 35 | 7720 |
| 2 | 2 | 70.4 | 83.8 | 10 / 35 | 7307 |
| 3 | 1 | 71.5 | 85.7 | 15 / 35 | 7695 |
| 4 | 1 | 71.5 | 86.0 | 15 / 35 | 7718 |
| 5 | 1 | 71.0 | 83.5 | 17 / 35 | 7245 |
| 6 | 1 | 70.2 | 84.1 | 10 / 35 | 7038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 110 | 38% |
| mz.NanoGod 2.02 | 20 | 65% |
| exauge.GateKeeper 1.1.121g | 14 | 79% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 83 | 66% | 135 |
| mz.NanoGod 2.02 | 21 | 17% | 36 |
| exauge.GateKeeper 1.1.121g | 9 | 7% | 12 |
| ayk.WallHugger 1.0 | 8 | 6% | 12 |
| stuff.Vlad 0.1 | 4 | 3% | 10 |
| drd.Dreadknoght 0.9 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 71.8 | 115 / 210 | 3.54 | 16.7% | 29361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 16.7% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.6% | 20 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.4% | 22 |
| bvh.micro.Freya 0.3 | 4.2 | 11.1% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.8% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 5 |
| conscience.Electron 1.3g | 6.7 | 8.3% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 6.7% | 1 |
| ap.Frederick 1.1 | 8.8 | 6.5% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 61.9 | 17 / 35 | 4431 |
| 2 | 1 | 66.6 | 76.8 | 22 / 35 | 4969 |
| 3 | 1 | 62.0 | 61.3 | 14 / 35 | 5042 |
| 4 | 1 | 64.5 | 70.5 | 18 / 35 | 4919 |
| 5 | 1 | 69.6 | 87.6 | 26 / 35 | 5342 |
| 6 | 1 | 64.7 | 72.7 | 18 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 89% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| bvh.micro.Freya 0.3 | 25 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 91% |
| stelo.MirrorMicro 1.0 | 6 | 83% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 23 | 24% | 23 |
| dummy.micro.Sparrow 2.5 | 15 | 16% | 41 |
| conscience.Electron 1.3g | 14 | 15% | 18 |
| voidious.micro.BlitzBat 1.05 | 11 | 12% | 45 |
| davidalves.net.DuelistMicroMelee 1.4 | 10 | 11% | 35 |
| bvh.micro.Freya 0.3 | 9 | 9% | 18 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 15 |

## Melee bench: F17

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.9 | 171 / 210 | 1.82 | 22.0% | 41619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 22.0% | 171 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 9 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.2% | 10 |
| sul.Lunar 1.1 | 3.5 | 11.5% | 7 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 1 |
| dsw.StaticD 1.0 | 5.8 | 8.8% | 5 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 5.9% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.4% | 4 |
| sample.Corners 1.0 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 94.0 | 32 / 35 | 6844 |
| 2 | 1 | 71.3 | 86.3 | 25 / 35 | 6426 |
| 3 | 1 | 74.0 | 96.8 | 33 / 35 | 7314 |
| 4 | 1 | 73.0 | 92.4 | 28 / 35 | 7248 |
| 5 | 1 | 73.2 | 94.9 | 29 / 35 | 7171 |
| 6 | 1 | 69.6 | 81.0 | 24 / 35 | 6616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 98% |
| sul.Lunar 1.1 | 42 | 98% |
| supersample.SuperBoxBot 1.0 | 29 | 97% |
| dsw.StaticD 1.0 | 17 | 82% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 11 | 26% | 63 |
| supersample.SuperBoxBot 1.0 | 10 | 24% | 39 |
| dsw.StaticD 1.0 | 6 | 14% | 23 |
| mme.NikeEnhanced 2.0 | 6 | 14% | 18 |
| sul.Lunar 1.1 | 4 | 10% | 47 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 10 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.Corners 1.0 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorAA 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.2 | 127 / 210 | 2.60 | 19.1% | 38897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorAA 0.1 | 1.0 | 19.1% | 127 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 17 |
| mld.Wisdom 1.0 | 3.5 | 11.9% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.5% | 14 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.0% | 8 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 8 |
| sample.Walls 1.0 | 7.7 | 7.8% | 9 |
| GarmBox.Oranges 1.0 | 7.7 | 7.9% | 0 |
| jangs.ns51 1.0 | 8.3 | 6.3% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 82.5 | 21 / 35 | 6815 |
| 2 | 1 | 67.2 | 76.8 | 19 / 35 | 5907 |
| 3 | 1 | 69.2 | 82.5 | 21 / 35 | 6862 |
| 4 | 1 | 69.7 | 86.0 | 23 / 35 | 6736 |
| 5 | 1 | 67.5 | 80.3 | 19 / 35 | 5819 |
| 6 | 1 | 69.7 | 85.1 | 24 / 35 | 6758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 45 | 91% |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 95% |
| mld.Wisdom 1.0 | 21 | 52% |
| jangs.ns51 1.0 | 12 | 83% |
| amz.NanoClone 1.41 | 11 | 82% |
| sample.Walls 1.0 | 9 | 89% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| KiraNL.Chupacabra 0.4 | 4 | 75% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 27 | 33% | 36 |
| KiraNL.Chupacabra 0.4 | 16 | 19% | 23 |
| radnor.DoctorBob 1.42 | 9 | 11% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 10% | 45 |
| sample.Walls 1.0 | 8 | 10% | 17 |
| jangs.ns51 1.0 | 6 | 7% | 12 |
| amz.NanoClone 1.41 | 5 | 6% | 12 |
| GarmBox.Oranges 1.0 | 4 | 5% | 7 |

