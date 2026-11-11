# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 68 over 6 battles (11.3 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.1 | 126 / 210 | 2.25 | 19.9% | 36778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.9% | 126 |
| radnor.DoctorBob 1.42 | 2.8 | 14.4% | 31 |
| mz.AntiGrav 1.0 | 3.0 | 14.4% | 11 |
| mld.Infinity 2.2 | 3.2 | 14.4% | 36 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 2 |
| sample.Walls 1.0 | 6.8 | 6.6% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.0% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 81.6 | 20 / 35 | 6072 |
| 2 | 1 | 69.1 | 83.8 | 19 / 35 | 5786 |
| 3 | 1 | 71.4 | 89.8 | 23 / 35 | 5926 |
| 4 | 1 | 71.8 | 91.1 | 24 / 35 | 6088 |
| 5 | 1 | 70.4 | 83.5 | 20 / 35 | 6389 |
| 6 | 1 | 71.1 | 86.7 | 20 / 35 | 6517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 94% |
| mld.Infinity 2.2 | 43 | 70% |
| radnor.DoctorBob 1.42 | 29 | 66% |
| amz.NanoClone 1.41 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 67% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 33 | 39% | 65 |
| mz.AntiGrav 1.0 | 20 | 24% | 100 |
| mld.Infinity 2.2 | 20 | 24% | 16 |
| amz.NanoClone 1.41 | 5 | 6% | 9 |
| jangs.ns51 1.0 | 3 | 4% | 6 |
| GarmBox.Oranges 1.0 | 3 | 4% | 2 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 6 |

## Melee bench: F02

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.6 | 134 / 210 | 2.83 | 17.7% | 28999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.2 | 17.7% | 134 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.0% | 48 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 8 |
| maribo.melee.BMV 0.1 | 4.0 | 11.1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.2% | 7 |
| zyx.nano.Ant 1.1 | 7.5 | 7.7% | 0 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 0 |
| bzdp.BoxCar 2.0 | 8.2 | 6.5% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 27 / 35 | 5197 |
| 2 | 1 | 64.1 | 63.8 | 15 / 35 | 5490 |
| 3 | 1 | 69.3 | 90.8 | 27 / 35 | 4920 |
| 4 | 1 | 68.0 | 86.7 | 26 / 35 | 4124 |
| 5 | 1 | 68.9 | 89.8 | 26 / 35 | 4678 |
| 6 | 2 | 61.4 | 58.4 | 13 / 35 | 4590 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 74 | 88% |
| mld.DustBunny 3.8 | 42 | 95% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 19 | 25% | 91 |
| mld.DustBunny 3.8 | 16 | 21% | 48 |
| cs.Grudge 1.0 | 9 | 12% | 9 |
| zyx.nano.Ant 1.1 | 8 | 10% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 9% | 16 |
| fullsail.SweetTea 1.1 | 6 | 8% | 8 |
| djdjdj.NanoSkunk10 1.0 | 4 | 5% | 10 |
| bzdp.BoxCar 2.0 | 4 | 5% | 5 |
| maribo.melee.BMV 0.1 | 3 | 4% | 10 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 76.8 | 114 / 210 | 3.09 | 18.3% | 33728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.3% | 114 |
| myl.micro.Troodon 1.10 | 2.0 | 15.6% | 49 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 12.0% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 11.1% | 19 |
| fm.mammillarias 1.3 | 5.5 | 9.6% | 4 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.6% | 14 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.3% | 1 |
| sample.Tracker 1.0 | 9.2 | 4.8% | 1 |
| sample.Fire 1.0 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 72.7 | 21 / 35 | 5228 |
| 2 | 1 | 66.8 | 72.7 | 18 / 35 | 5486 |
| 3 | 1 | 68.7 | 78.7 | 17 / 35 | 6015 |
| 4 | 1 | 68.9 | 80.3 | 20 / 35 | 5876 |
| 5 | 1 | 68.3 | 81.3 | 17 / 35 | 5229 |
| 6 | 1 | 68.3 | 75.2 | 21 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 77 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 60% |
| myl.nano.KomoriNinja 1.1 | 15 | 100% |
| cb.nano.Insomnia 1.0 | 12 | 67% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 27 | 28% | 86 |
| cb.nano.Insomnia 1.0 | 24 | 25% | 21 |
| fm.mammillarias 1.3 | 13 | 14% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 11% | 24 |
| myl.nano.KomoriNinja 1.1 | 8 | 8% | 30 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 10 |
| sample.Fire 1.0 | 5 | 5% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 12 |

## Melee bench: F04

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 50 over 6 battles (8.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.6 | 134 / 210 | 2.57 | 19.2% | 35536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.2% | 134 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 21 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.3% | 14 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 9.1% | 19 |
| tj.zombie1n 1.0.1 | 5.7 | 9.3% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.8 | 8.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.6% | 5 |
| yk.JahMicro 1.0 | 6.7 | 8.6% | 6 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.3 | 23 / 35 | 6115 |
| 2 | 1 | 69.4 | 84.4 | 23 / 35 | 5981 |
| 3 | 1 | 67.2 | 80.3 | 19 / 35 | 5584 |
| 4 | 1 | 69.3 | 85.1 | 25 / 35 | 5872 |
| 5 | 1 | 66.6 | 77.5 | 21 / 35 | 5349 |
| 6 | 1 | 69.9 | 81.9 | 23 / 35 | 6635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 55 | 84% |
| stelo.SoJNanoMelee 1.1 | 33 | 91% |
| ers.nano.hawk.HawkLA 3.0m | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| tj.zombie1n 1.0.1 | 11 | 73% |
| yk.JahMicro 1.0 | 9 | 100% |
| repositorio.NanoStep 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 42% | 84 |
| stelo.SoJNanoMelee 1.1 | 11 | 14% | 39 |
| tvv.micro.Antares 1.1.1 | 9 | 12% | 25 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 9% | 24 |
| tj.zombie1n 1.0.1 | 7 | 9% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 8% | 8 |
| repositorio.NanoStep 1.0 | 2 | 3% | 12 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 96 / 210 | 3.89 | 15.6% | 27188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 15.6% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 29 |
| ahf.NanoAndrew .4 | 3.5 | 11.4% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.9% | 24 |
| sam.Samspin 1.0 | 5.5 | 10.4% | 13 |
| EBBU.Sim2 1.02 | 5.7 | 10.0% | 9 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.8% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.9% | 2 |
| sample.TrackFire 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 68.3 | 18 / 35 | 4468 |
| 2 | 1 | 63.4 | 70.8 | 17 / 35 | 4207 |
| 3 | 1 | 65.3 | 73.3 | 19 / 35 | 5104 |
| 4 | 1 | 62.0 | 63.8 | 15 / 35 | 4691 |
| 5 | 1 | 61.2 | 65.1 | 14 / 35 | 4213 |
| 6 | 1 | 62.1 | 66.3 | 13 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 83% |
| simonton.nano.MeleeSeed 1.8 | 31 | 81% |
| ahf.NanoAndrew .4 | 15 | 80% |
| sam.Samspin 1.0 | 11 | 73% |
| EBBU.Sim2 1.02 | 8 | 100% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 25% | 54 |
| robar.nano.Assertive_Melee 0.2 | 21 | 18% | 26 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 14 |
| EBBU.Sim2 1.02 | 12 | 11% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 10% | 13 |
| oog.melee.Corsair 1.0 | 9 | 8% | 40 |
| sam.Samspin 1.0 | 9 | 8% | 17 |
| ahf.NanoAndrew .4 | 7 | 6% | 22 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |

## Melee bench: F06

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 49 over 6 battles (8.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.6 | 149 / 210 | 2.30 | 19.3% | 31821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.3% | 149 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 13 |
| oog.melee.CapuletDroid 1.1 | 4.8 | 10.2% | 12 |
| fm.claire 1.7 | 5.7 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 5.7 | 8.6% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.7% | 4 |
| kurios.DOSexe .9b | 8.8 | 6.1% | 1 |
| pa.Improved 1.0 | 8.8 | 5.9% | 1 |
| sample.SpinBot 1.0 | 9.3 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 75.6 | 20 / 35 | 4956 |
| 2 | 1 | 70.3 | 89.8 | 28 / 35 | 5454 |
| 3 | 1 | 69.6 | 87.3 | 28 / 35 | 5535 |
| 4 | 1 | 67.6 | 81.3 | 21 / 35 | 4901 |
| 5 | 1 | 71.2 | 95.2 | 28 / 35 | 5544 |
| 6 | 1 | 69.1 | 84.4 | 24 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 88% |
| oog.melee.CapuletDroid 1.1 | 43 | 91% |
| gh.nano.Grofvuil 0.2 | 21 | 95% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 75% |

Hadur died in 64 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 33% | 88 |
| oog.melee.CapuletDroid 1.1 | 13 | 20% | 19 |
| gh.nano.Grofvuil 0.2 | 9 | 14% | 40 |
| fm.claire 1.7 | 5 | 8% | 13 |
| sample.SpinBot 1.0 | 5 | 8% | 5 |
| arthord.NanoSatanMelee Beta | 4 | 6% | 16 |
| kurios.DOSexe .9b | 3 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 14 |
| pa.Improved 1.0 | 1 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.6 | 104 / 210 | 2.74 | 17.7% | 32301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.7% | 104 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.3% | 42 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 14.0% | 29 |
| mz.MicroGodMelee 1 | 3.7 | 13.6% | 23 |
| DBall.Anarchy 0.1 | 5.2 | 8.6% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 2 |
| mbro.Detektor3 0.1.1 | 8.2 | 5.8% | 2 |
| acogdev.alpha 0.2 | 9.0 | 5.3% | 2 |
| fire219.CatBot 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.0 | 18 / 35 | 5408 |
| 2 | 1 | 68.9 | 86.3 | 20 / 35 | 5296 |
| 3 | 1 | 63.4 | 71.7 | 12 / 35 | 4621 |
| 4 | 1 | 68.9 | 84.8 | 23 / 35 | 5825 |
| 5 | 1 | 66.7 | 78.4 | 16 / 35 | 5087 |
| 6 | 1 | 68.1 | 81.6 | 15 / 35 | 6064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 53 | 92% |
| gh.micro.Gruweltje 0.7 | 39 | 49% |
| spinnercat.micro.Tyger 0.1 | 38 | 63% |
| DBall.Anarchy 0.1 | 7 | 86% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 50% |
| fire219.CatBot 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 36 | 33% | 61 |
| gh.micro.Gruweltje 0.7 | 30 | 28% | 56 |
| mz.MicroGodMelee 1 | 17 | 16% | 61 |
| fire219.CatBot 1.0 | 8 | 7% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 5 |
| acogdev.alpha 0.2 | 3 | 3% | 4 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.5 | 80 / 210 | 3.65 | 15.9% | 29560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.5 | 16.7% | 68 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 15.9% | 80 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 33 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.2% | 8 |
| germ.TheMind .2 | 5.3 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 69.2 | 12 / 35 | 4677 |
| 2 | 2 | 64.6 | 74.6 | 9 / 35 | 4804 |
| 3 | 2 | 63.5 | 68.6 | 14 / 35 | 4945 |
| 4 | 3 | 60.0 | 58.1 | 10 / 35 | 4454 |
| 5 | 2 | 66.4 | 75.9 | 17 / 35 | 5246 |
| 6 | 1 | 66.9 | 76.8 | 18 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 59% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 53% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| germ.TheMind .2 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 68 | 52% | 110 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 18% | 32 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 12 |
| qualidafial.MajorDick 1.0.1 | 8 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 7 | 5% | 7 |
| germ.TheMind .2 | 5 | 4% | 16 |
| awesomeness.Elite 1.0 | 5 | 4% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 9 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.3 | 132 / 210 | 2.41 | 18.6% | 27285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.6% | 132 |
| rz.HawkOnFire 0.1 | 2.2 | 13.5% | 21 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.8% | 14 |
| maribo.IotaCT 1.1 | 4.0 | 11.4% | 14 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.4% | 3 |
| ratosh.Wesco 1.4 | 7.0 | 8.6% | 6 |
| stelo.PatternRobot 1.0 | 7.7 | 8.4% | 12 |
| spinnercat.Omen 1.0 | 8.3 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 76.2 | 18 / 35 | 4120 |
| 2 | 1 | 67.4 | 81.9 | 21 / 35 | 4273 |
| 3 | 1 | 68.9 | 86.3 | 22 / 35 | 4642 |
| 4 | 1 | 69.6 | 85.7 | 23 / 35 | 5012 |
| 5 | 1 | 69.7 | 88.9 | 24 / 35 | 4525 |
| 6 | 1 | 69.4 | 87.0 | 24 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 89% |
| nz.jdc.nano.GridFu 1.0 | 23 | 91% |
| maribo.IotaCT 1.1 | 16 | 69% |
| timmit.nano.TimDog 0.33 | 14 | 86% |
| stelo.PatternRobot 1.0 | 12 | 83% |
| ratosh.Wesco 1.4 | 6 | 67% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 25% | 72 |
| stelo.PatternRobot 1.0 | 14 | 18% | 17 |
| maribo.IotaCT 1.1 | 12 | 15% | 29 |
| timmit.nano.TimDog 0.33 | 12 | 15% | 26 |
| ratosh.Wesco 1.4 | 10 | 13% | 19 |
| nz.jdc.nano.GridFu 1.0 | 9 | 11% | 38 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 4 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F10

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.6 | 156 / 210 | 1.75 | 20.8% | 36635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.8% | 156 |
| baal.nano.N 1.42 | 2.5 | 11.9% | 5 |
| tvv.nano.Polaris 1.2 | 2.7 | 12.1% | 23 |
| Grystrion.TrackerWO 1.0 | 4.5 | 10.1% | 4 |
| zyx.micro.Ant 1.1 | 5.8 | 8.7% | 7 |
| sanja.First 0.1 | 6.0 | 8.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.2% | 1 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 5 |
| cvt.Firsty 1.0 | 8.3 | 7.0% | 7 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.5 | 26 / 35 | 5862 |
| 2 | 1 | 70.0 | 91.1 | 24 / 35 | 5828 |
| 3 | 1 | 70.9 | 90.5 | 26 / 35 | 6193 |
| 4 | 1 | 71.2 | 91.4 | 26 / 35 | 6607 |
| 5 | 1 | 71.4 | 94.3 | 27 / 35 | 6105 |
| 6 | 1 | 70.7 | 92.1 | 27 / 35 | 6040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 40 | 100% |
| tvv.nano.Polaris 1.2 | 34 | 76% |
| sanja.First 0.1 | 23 | 100% |
| Grystrion.TrackerWO 1.0 | 19 | 95% |
| amk.Punbot.Punbot 0.01 | 17 | 88% |
| zyx.micro.Ant 1.1 | 16 | 100% |
| cvt.Firsty 1.0 | 14 | 79% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 19 | 35% | 58 |
| Grystrion.TrackerWO 1.0 | 9 | 16% | 24 |
| cvt.Firsty 1.0 | 7 | 13% | 18 |
| zyx.micro.Ant 1.1 | 6 | 11% | 26 |
| amk.Punbot.Punbot 0.01 | 5 | 9% | 10 |
| baal.nano.N 1.42 | 4 | 7% | 37 |
| sanja.First 0.1 | 3 | 5% | 29 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| sample.RamFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.5 | 59 / 210 | 4.02 | 14.4% | 27781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.4% | 95 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 14.4% | 59 |
| cs.Wren 1.0 | 2.8 | 12.6% | 19 |
| js.PinBall 1.6 | 4.5 | 11.5% | 12 |
| mz.Cork 0.1 | 4.5 | 11.4% | 14 |
| joe.ADinosaur 1.0 | 6.2 | 8.9% | 1 |
| evd.X1 0.01 | 6.8 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 2 |
| PSW.Relentless 0.1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.3 | 58.1 | 10 / 35 | 4175 |
| 2 | 2 | 63.2 | 68.9 | 8 / 35 | 5088 |
| 3 | 2 | 61.8 | 68.6 | 10 / 35 | 4285 |
| 4 | 3 | 58.2 | 57.5 | 6 / 35 | 4504 |
| 5 | 1 | 62.5 | 67.6 | 12 / 35 | 4783 |
| 6 | 2 | 65.4 | 78.1 | 13 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 54 | 17% |
| cs.Wren 1.0 | 20 | 90% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 11 | 100% |
| joe.ADinosaur 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 152 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 89 | 59% | 103 |
| cs.Wren 1.0 | 13 | 9% | 27 |
| mz.Cork 0.1 | 12 | 8% | 20 |
| evd.X1 0.01 | 11 | 7% | 11 |
| js.PinBall 1.6 | 10 | 7% | 23 |
| joe.ADinosaur 1.0 | 9 | 6% | 12 |
| PSW.Relentless 0.1 | 6 | 4% | 7 |
| jsal.Jsalbot 1.0 | 2 | 1% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.8 | 135 / 210 | 2.46 | 18.9% | 28771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.9% | 135 |
| lrem.micro.SpikeSoldier 0.4 | 3.5 | 10.7% | 8 |
| myl.nano.Graviton 1.10 | 3.5 | 10.9% | 14 |
| ntc.Opposite 1.5 | 3.8 | 10.8% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.2% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.7% | 4 |
| disan.Chair 2.2.0 | 6.3 | 9.2% | 14 |
| DBall.NUKE 0.1 | 7.8 | 8.1% | 2 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.0 | 21 / 35 | 4657 |
| 2 | 1 | 67.7 | 83.8 | 23 / 35 | 4479 |
| 3 | 1 | 68.9 | 87.6 | 25 / 35 | 4774 |
| 4 | 1 | 69.1 | 87.0 | 25 / 35 | 4881 |
| 5 | 1 | 66.5 | 75.2 | 19 / 35 | 4881 |
| 6 | 1 | 68.3 | 83.2 | 22 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 89% |
| ntc.Opposite 1.5 | 28 | 79% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 91% |
| disan.Chair 2.2.0 | 17 | 76% |
| stelo.AreaTargetingBot 1.1 | 16 | 75% |
| donjezza.Muncho 1.0 | 13 | 92% |
| DBall.NUKE 0.1 | 12 | 92% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 15 | 19% | 36 |
| pfvicm.Sobieski 7.2.3b | 14 | 18% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 16% | 28 |
| myl.nano.Graviton 1.10 | 11 | 14% | 41 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 30 |
| DBall.NUKE 0.1 | 5 | 6% | 15 |
| disan.Chair 2.2.0 | 5 | 6% | 14 |
| donjezza.Muncho 1.0 | 3 | 4% | 11 |
| pbg.R2D2 1.0 | 2 | 3% | 7 |

## Melee bench: F13

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.3 | 95 / 210 | 3.40 | 15.7% | 23390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.3 | 15.7% | 95 |
| oog.melee.Capulet 1.2 | 2.2 | 14.7% | 43 |
| kawigi.micro.Shiz 1.1 | 2.7 | 14.4% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 12.2% | 17 |
| yagami.Tidus 0.11 | 4.7 | 12.0% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 4 |
| stelo.MirrorNano 1.3 | 7.0 | 7.5% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 77.1 | 18 / 35 | 3646 |
| 2 | 1 | 65.1 | 70.5 | 17 / 35 | 4559 |
| 3 | 2 | 63.3 | 70.8 | 12 / 35 | 3849 |
| 4 | 1 | 64.3 | 75.6 | 16 / 35 | 3431 |
| 5 | 2 | 64.3 | 72.1 | 14 / 35 | 3829 |
| 6 | 1 | 65.4 | 73.7 | 18 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 38 | 76% |
| oog.melee.Capulet 1.2 | 38 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 96% |
| yagami.Tidus 0.11 | 12 | 83% |
| ejb.Polaris 1.0.1 | 5 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 37% | 71 |
| kawigi.micro.Shiz 1.1 | 24 | 21% | 43 |
| yagami.Tidus 0.11 | 22 | 19% | 37 |
| ejb.Polaris 1.0.1 | 8 | 7% | 15 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 5% | 32 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 1 |

## Melee bench: F14

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.4 | 142 / 210 | 2.77 | 17.6% | 25876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.6% | 142 |
| bzdp.Pansy 2.1 | 3.3 | 11.9% | 19 |
| wompi.Quokka 1.6 | 3.5 | 11.5% | 12 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 23 |
| ratosh.Nobo 0.21 | 3.7 | 11.7% | 7 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.4% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.7% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.0 | 26 / 35 | 4170 |
| 2 | 1 | 65.6 | 74.6 | 22 / 35 | 4510 |
| 3 | 1 | 66.7 | 83.5 | 22 / 35 | 4468 |
| 4 | 1 | 67.7 | 85.1 | 26 / 35 | 4252 |
| 5 | 1 | 63.7 | 73.0 | 20 / 35 | 3887 |
| 6 | 1 | 68.3 | 86.0 | 26 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 98% |
| wee.Gem 1.8.4 | 36 | 94% |
| ratosh.Nobo 0.21 | 24 | 88% |
| wompi.Quokka 1.6 | 21 | 95% |
| m3thos.Eva00 1.1 | 15 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| maribo.FollowFire 1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 11 | 16% | 12 |
| wee.Gem 1.8.4 | 10 | 14% | 48 |
| bzdp.Pansy 2.1 | 9 | 13% | 56 |
| ratosh.Nobo 0.21 | 9 | 13% | 27 |
| bayen.UbaMicro 1.4 | 7 | 10% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 7 | 10% | 8 |
| wompi.Quokka 1.6 | 6 | 9% | 16 |
| stelo.MyAgileRobot 0.2 | 6 | 9% | 7 |
| m3thos.Eva00 1.1 | 3 | 4% | 23 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 86.3 | 33 / 210 | 2.23 | 19.9% | 47776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 21.4% | 166 |
| hadur117.micro.SaorOG3 0.1 | 1.8 | 19.9% | 33 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 8 |
| ayk.WallHugger 1.0 | 4.7 | 9.2% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.1% | 1 |
| stuff.Vlad 0.1 | 6.0 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.5 | 7.8% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.6% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 89.5 | 7 / 35 | 8440 |
| 2 | 2 | 72.7 | 88.3 | 9 / 35 | 8462 |
| 3 | 2 | 71.3 | 87.0 | 5 / 35 | 7954 |
| 4 | 2 | 71.4 | 87.6 | 4 / 35 | 7916 |
| 5 | 2 | 70.0 | 82.5 | 4 / 35 | 7409 |
| 6 | 2 | 69.9 | 82.9 | 4 / 35 | 7595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 138 | 7% |
| mz.NanoGod 2.02 | 20 | 70% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 152 | 85% | 160 |
| mz.NanoGod 2.02 | 12 | 7% | 27 |
| exauge.GateKeeper 1.1.121g | 6 | 3% | 11 |
| stuff.Vlad 0.1 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.8 | 111 / 210 | 3.27 | 16.9% | 28003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 16.9% | 111 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.6% | 31 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 11.4% | 23 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 9 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.8% | 4 |
| conscience.Electron 1.3g | 7.0 | 7.7% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 6.2% | 2 |
| ap.Frederick 1.1 | 8.5 | 7.0% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.2 | 21 / 35 | 5392 |
| 2 | 1 | 65.5 | 74.9 | 20 / 35 | 4630 |
| 3 | 1 | 60.7 | 61.0 | 11 / 35 | 4282 |
| 4 | 1 | 66.8 | 79.7 | 23 / 35 | 4489 |
| 5 | 1 | 65.8 | 77.8 | 20 / 35 | 4500 |
| 6 | 1 | 64.6 | 73.3 | 16 / 35 | 4710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 77% |
| bvh.micro.Freya 0.3 | 28 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 89% |
| dummy.micro.Sparrow 2.5 | 18 | 94% |
| stelo.MirrorMicro 1.0 | 5 | 100% |
| ap.Frederick 1.1 | 5 | 80% |

Hadur died in 99 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 24% | 59 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 41 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 13% | 11 |
| dl.BetterWalls 1.0 | 12 | 12% | 18 |
| dummy.micro.Sparrow 2.5 | 10 | 10% | 31 |
| bvh.micro.Freya 0.3 | 10 | 10% | 20 |
| conscience.Electron 1.3g | 10 | 10% | 17 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 13 |
| ap.Frederick 1.1 | 2 | 2% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 81.8 | 129 / 210 | 2.64 | 20.1% | 40080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.1% | 129 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.2% | 27 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.5% | 14 |
| sul.Lunar 1.1 | 3.7 | 11.5% | 20 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.5% | 4 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 7 |
| tlp.ThreeLeggedPig 1 | 7.3 | 7.3% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 5 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.7% | 4 |
| sample.Corners 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 88.9 | 26 / 35 | 6376 |
| 2 | 1 | 70.7 | 83.8 | 21 / 35 | 7312 |
| 3 | 1 | 68.5 | 73.7 | 17 / 35 | 6730 |
| 4 | 1 | 69.1 | 75.9 | 20 / 35 | 6575 |
| 5 | 1 | 70.8 | 87.0 | 25 / 35 | 6494 |
| 6 | 1 | 70.1 | 81.6 | 20 / 35 | 6593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 59 | 85% |
| sul.Lunar 1.1 | 34 | 94% |
| supersample.SuperBoxBot 1.0 | 24 | 71% |
| dsw.StaticD 1.0 | 10 | 80% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 25 | 30% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 27% | 72 |
| dsw.StaticD 1.0 | 10 | 12% | 18 |
| mme.NikeEnhanced 2.0 | 7 | 9% | 18 |
| sample.Corners 1.0 | 5 | 6% | 7 |
| sul.Lunar 1.1 | 4 | 5% | 35 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 9 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 78.5 | 106 / 210 | 2.94 | 18.1% | 36962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.1% | 106 |
| radnor.DoctorBob 1.42 | 2.2 | 13.4% | 40 |
| mld.Wisdom 1.0 | 3.3 | 11.9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.4% | 21 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.5% | 9 |
| amz.NanoClone 1.41 | 5.2 | 10.1% | 8 |
| sample.Walls 1.0 | 7.3 | 8.0% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.9 | 18 / 35 | 6635 |
| 2 | 1 | 63.7 | 68.9 | 13 / 35 | 4960 |
| 3 | 1 | 66.9 | 76.5 | 15 / 35 | 6222 |
| 4 | 1 | 68.0 | 79.7 | 19 / 35 | 6194 |
| 5 | 1 | 68.0 | 79.4 | 19 / 35 | 6281 |
| 6 | 1 | 69.2 | 84.4 | 22 / 35 | 6670 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 83% |
| radnor.DoctorBob 1.42 | 41 | 56% |
| mld.Wisdom 1.0 | 15 | 87% |
| sample.Walls 1.0 | 14 | 100% |
| amz.NanoClone 1.41 | 10 | 80% |
| jangs.ns51 1.0 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 37 | 34% | 64 |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 18% | 55 |
| mld.Wisdom 1.0 | 16 | 15% | 36 |
| KiraNL.Chupacabra 0.4 | 14 | 13% | 17 |
| amz.NanoClone 1.41 | 9 | 8% | 14 |
| sample.Walls 1.0 | 5 | 5% | 10 |
| GarmBox.Oranges 1.0 | 4 | 4% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 8 |
2 death(s) with no robot to name.

