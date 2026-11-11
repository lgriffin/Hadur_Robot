# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.9 | 146 / 210 | 2.00 | 21.2% | 41771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.2% | 146 |
| mz.AntiGrav 1.0 | 2.5 | 14.2% | 12 |
| radnor.DoctorBob 1.42 | 3.0 | 14.2% | 26 |
| mld.Infinity 2.2 | 3.5 | 13.2% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 4 |
| sample.Walls 1.0 | 6.5 | 6.5% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 90.8 | 24 / 35 | 7507 |
| 2 | 1 | 71.5 | 88.3 | 23 / 35 | 6662 |
| 3 | 1 | 71.4 | 88.6 | 26 / 35 | 6328 |
| 4 | 1 | 71.8 | 87.6 | 24 / 35 | 6959 |
| 5 | 1 | 71.7 | 87.6 | 25 / 35 | 6919 |
| 6 | 1 | 72.8 | 90.8 | 24 / 35 | 7396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 70 | 96% |
| mld.Infinity 2.2 | 45 | 89% |
| radnor.DoctorBob 1.42 | 35 | 69% |
| amz.NanoClone 1.41 | 8 | 88% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 45% | 69 |
| mz.AntiGrav 1.0 | 14 | 22% | 85 |
| mld.Infinity 2.2 | 10 | 15% | 16 |
| amz.NanoClone 1.41 | 4 | 6% | 13 |
| jangs.ns51 1.0 | 3 | 5% | 8 |
| GarmBox.Oranges 1.0 | 3 | 5% | 7 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.5 | 146 / 210 | 2.04 | 19.2% | 30062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.2% | 146 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.2% | 44 |
| mld.DustBunny 3.8 | 3.2 | 12.9% | 8 |
| maribo.melee.BMV 0.1 | 3.8 | 10.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.0 | 8.1% | 3 |
| zyx.nano.Ant 1.1 | 6.7 | 7.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.5% | 5 |
| fullsail.SweetTea 1.1 | 7.5 | 7.3% | 2 |
| bzdp.BoxCar 2.0 | 7.8 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 25 / 35 | 4685 |
| 2 | 1 | 69.9 | 91.1 | 24 / 35 | 5333 |
| 3 | 1 | 69.6 | 91.1 | 27 / 35 | 4997 |
| 4 | 1 | 68.3 | 88.6 | 23 / 35 | 4793 |
| 5 | 1 | 68.9 | 86.3 | 24 / 35 | 5064 |
| 6 | 1 | 68.8 | 85.1 | 23 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 88 | 81% |
| mld.DustBunny 3.8 | 49 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 26 | 41% | 105 |
| mld.DustBunny 3.8 | 14 | 22% | 51 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 16 |
| maribo.melee.BMV 0.1 | 6 | 9% | 11 |
| fullsail.SweetTea 1.1 | 6 | 9% | 11 |
| zyx.nano.Ant 1.1 | 2 | 3% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 5 |
| cs.Grudge 1.0 | 2 | 3% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 86.6 | 143 / 210 | 2.20 | 20.2% | 35219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.2% | 143 |
| myl.micro.Troodon 1.10 | 2.0 | 14.7% | 34 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.9% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.6% | 12 |
| fm.mammillarias 1.3 | 5.3 | 9.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.5 | 6.1% | 2 |
| sample.Fire 1.0 | 8.8 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 83.2 | 22 / 35 | 6178 |
| 2 | 1 | 69.5 | 82.9 | 23 / 35 | 5519 |
| 3 | 1 | 69.5 | 82.5 | 20 / 35 | 5757 |
| 4 | 1 | 72.8 | 97.5 | 29 / 35 | 6123 |
| 5 | 1 | 68.8 | 80.3 | 22 / 35 | 5912 |
| 6 | 1 | 71.3 | 93.3 | 27 / 35 | 5730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 69 | 88% |
| stelo.SoRobotNanoMelee 1.2 | 26 | 85% |
| myl.nano.KomoriNinja 1.1 | 26 | 96% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| sp.Nanos.Ember 1.1 | 7 | 86% |
| fm.mammillarias 1.3 | 6 | 83% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 17 | 25% | 32 |
| myl.micro.Troodon 1.10 | 16 | 24% | 80 |
| cb.nano.Insomnia 1.0 | 12 | 18% | 14 |
| myl.nano.KomoriNinja 1.1 | 6 | 9% | 38 |
| fm.mammillarias 1.3 | 6 | 9% | 13 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 14 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 10 |
| sample.Tracker 1.0 | 2 | 3% | 4 |
| sample.Fire 1.0 | 0 | 0% | 5 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.2 | 143 / 210 | 2.24 | 20.5% | 39139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.5% | 143 |
| tvv.micro.Antares 1.1.1 | 2.3 | 12.3% | 18 |
| kawigi.nano.Lib 1.0 | 2.7 | 12.4% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.2% | 1 |
| tj.zombie1n 1.0.1 | 5.3 | 9.4% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 8.6% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 8.0% | 2 |
| yk.JahMicro 1.0 | 7.2 | 7.9% | 5 |
| repositorio.NanoStep 1.0 | 8.8 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 81.9 | 21 / 35 | 6450 |
| 2 | 1 | 69.7 | 82.5 | 23 / 35 | 6249 |
| 3 | 1 | 70.3 | 85.4 | 24 / 35 | 6495 |
| 4 | 1 | 72.5 | 94.0 | 27 / 35 | 7032 |
| 5 | 1 | 70.8 | 90.2 | 25 / 35 | 6614 |
| 6 | 1 | 69.2 | 83.5 | 23 / 35 | 6299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 67 | 87% |
| stelo.SoJNanoMelee 1.1 | 27 | 81% |
| tvv.micro.Antares 1.1.1 | 21 | 90% |
| tj.zombie1n 1.0.1 | 15 | 80% |
| yk.JahMicro 1.0 | 13 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 32% | 89 |
| stelo.SoJNanoMelee 1.1 | 13 | 19% | 28 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 10% | 13 |
| tj.zombie1n 1.0.1 | 6 | 9% | 11 |
| yk.JahMicro 1.0 | 6 | 9% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 6% | 18 |
| repositorio.NanoStep 1.0 | 1 | 1% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 70.2 | 117 / 210 | 3.69 | 16.6% | 29917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.6% | 117 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 28 |
| ahf.NanoAndrew .4 | 3.0 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.2% | 13 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.2 | 9.5% | 5 |
| sam.Samspin 1.0 | 6.3 | 9.4% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 71.7 | 23 / 35 | 5188 |
| 2 | 1 | 64.6 | 71.1 | 20 / 35 | 4699 |
| 3 | 1 | 67.8 | 80.3 | 24 / 35 | 5365 |
| 4 | 1 | 66.5 | 75.9 | 21 / 35 | 5327 |
| 5 | 1 | 62.1 | 60.0 | 15 / 35 | 4791 |
| 6 | 1 | 61.4 | 61.9 | 14 / 35 | 4547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 37 | 95% |
| simonton.nano.MeleeSeed 1.8 | 32 | 84% |
| ahf.NanoAndrew .4 | 28 | 96% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| EBBU.Sim2 1.02 | 8 | 100% |
| sam.Samspin 1.0 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 316. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 31 | 33% | 59 |
| robar.nano.Assertive_Melee 0.2 | 13 | 14% | 21 |
| EBBU.Sim2 1.02 | 11 | 12% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 12% | 10 |
| sam.Samspin 1.0 | 7 | 7% | 12 |
| oog.melee.Corsair 1.0 | 6 | 6% | 40 |
| ahf.NanoAndrew .4 | 6 | 6% | 37 |
| zyx.nano.BacillusComma 1.0 | 6 | 6% | 11 |
| sample.TrackFire 1.0 | 3 | 3% | 5 |

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.9 | 159 / 210 | 2.00 | 20.1% | 32989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 159 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 22 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.5% | 3 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.8% | 9 |
| fm.claire 1.7 | 5.8 | 8.4% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.7% | 4 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 4 |
| pa.Improved 1.0 | 8.5 | 6.3% | 1 |
| sample.SpinBot 1.0 | 8.7 | 6.3% | 4 |
| kurios.DOSexe .9b | 9.5 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.3 | 24 / 35 | 4970 |
| 2 | 1 | 69.9 | 88.9 | 28 / 35 | 5421 |
| 3 | 1 | 71.1 | 94.3 | 25 / 35 | 5917 |
| 4 | 1 | 69.4 | 86.0 | 27 / 35 | 5628 |
| 5 | 1 | 68.8 | 84.8 | 26 / 35 | 5104 |
| 6 | 1 | 71.3 | 92.1 | 29 / 35 | 5949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 92% |
| oog.melee.CapuletDroid 1.1 | 36 | 86% |
| gh.nano.Grofvuil 0.2 | 26 | 100% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| pa.Improved 1.0 | 6 | 83% |
| kurios.DOSexe .9b | 5 | 100% |
| fm.claire 1.7 | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 16 | 31% | 29 |
| d414.nano.Quantum 1.0.0 | 14 | 27% | 91 |
| arthord.NanoSatanMelee Beta | 7 | 14% | 24 |
| sample.SpinBot 1.0 | 4 | 8% | 8 |
| gh.nano.Grofvuil 0.2 | 3 | 6% | 22 |
| fm.claire 1.7 | 3 | 6% | 9 |
| winamp32.micro.MicroMacro 1.0 | 2 | 4% | 10 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| pa.Improved 1.0 | 1 | 2% | 8 |

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 47 over 6 battles (7.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.3 | 106 / 210 | 2.69 | 17.9% | 32672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.9% | 106 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.1% | 35 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.9% | 45 |
| mz.MicroGodMelee 1 | 3.8 | 12.3% | 10 |
| DBall.Anarchy 0.1 | 5.2 | 9.1% | 7 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.6% | 1 |
| el.JumpShoot 0.2 | 7.8 | 6.1% | 5 |
| acogdev.alpha 0.2 | 8.3 | 6.0% | 1 |
| fire219.CatBot 1.0 | 8.5 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 22 / 35 | 5709 |
| 2 | 1 | 65.2 | 74.0 | 12 / 35 | 5012 |
| 3 | 1 | 66.3 | 77.8 | 14 / 35 | 5657 |
| 4 | 1 | 68.5 | 82.5 | 20 / 35 | 5541 |
| 5 | 1 | 67.7 | 81.6 | 18 / 35 | 5421 |
| 6 | 1 | 68.6 | 87.6 | 20 / 35 | 5332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 52% |
| mz.MicroGodMelee 1 | 40 | 93% |
| gh.micro.Gruweltje 0.7 | 40 | 78% |
| DBall.Anarchy 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 3 | 0% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 46 | 44% | 70 |
| gh.micro.Gruweltje 0.7 | 20 | 19% | 59 |
| mz.MicroGodMelee 1 | 10 | 10% | 46 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 7 |
| acogdev.alpha 0.2 | 6 | 6% | 7 |
| DBall.Anarchy 0.1 | 5 | 5% | 7 |
| el.JumpShoot 0.2 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 68.1 | 99 / 210 | 3.87 | 16.0% | 29960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.5 | 16.0% | 99 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.4% | 9 |
| germ.TheMind .2 | 4.8 | 9.5% | 7 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.3% | 7 |
| awesomeness.Elite 1.0 | 7.0 | 8.3% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.5 | 7.9% | 2 |
| sample.Crazy 1.0 | 8.5 | 7.2% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 57.1 | 13 / 35 | 4520 |
| 2 | 1 | 62.9 | 61.9 | 15 / 35 | 5154 |
| 3 | 2 | 62.4 | 64.8 | 14 / 35 | 4690 |
| 4 | 1 | 69.2 | 85.1 | 24 / 35 | 5667 |
| 5 | 1 | 63.3 | 64.1 | 15 / 35 | 4908 |
| 6 | 1 | 66.1 | 75.6 | 18 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 89% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 50% |
| sample.Crazy 1.0 | 6 | 100% |
| germ.TheMind .2 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 54% | 108 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 14% | 38 |
| germ.TheMind .2 | 14 | 13% | 18 |
| qualidafial.MajorDick 1.0.1 | 8 | 7% | 9 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 9 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 11 |
| awesomeness.Elite 1.0 | 1 | 1% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.7 | 152 / 210 | 2.02 | 20.2% | 31546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.2% | 152 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 14 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.6% | 14 |
| maribo.IotaCT 1.1 | 4.3 | 10.6% | 8 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.6% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 1 |
| stelo.PatternRobot 1.0 | 7.2 | 8.5% | 14 |
| ratosh.Wesco 1.4 | 7.2 | 8.3% | 2 |
| spinnercat.Omen 1.0 | 9.0 | 7.3% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.5 | 23 / 35 | 5015 |
| 2 | 1 | 67.4 | 77.8 | 19 / 35 | 5065 |
| 3 | 1 | 71.9 | 93.3 | 29 / 35 | 5211 |
| 4 | 1 | 72.3 | 93.3 | 25 / 35 | 5864 |
| 5 | 1 | 71.5 | 92.4 | 29 / 35 | 5578 |
| 6 | 1 | 70.7 | 91.7 | 27 / 35 | 4813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 95% |
| nz.jdc.nano.GridFu 1.0 | 31 | 90% |
| maribo.IotaCT 1.1 | 20 | 95% |
| stelo.PatternRobot 1.0 | 13 | 46% |
| timmit.nano.TimDog 0.33 | 11 | 100% |
| ratosh.Wesco 1.4 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 13 | 22% | 19 |
| nz.jdc.nano.GridFu 1.0 | 9 | 16% | 50 |
| ratosh.Wesco 1.4 | 9 | 16% | 20 |
| rz.HawkOnFire 0.1 | 8 | 14% | 65 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 12% | 10 |
| timmit.nano.TimDog 0.33 | 6 | 10% | 19 |
| maribo.IotaCT 1.1 | 5 | 9% | 21 |
| spinnercat.Omen 1.0 | 1 | 2% | 4 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.5 | 159 / 210 | 2.12 | 20.7% | 37917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.7% | 159 |
| baal.nano.N 1.42 | 2.3 | 12.0% | 9 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.6% | 17 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.2% | 2 |
| zyx.micro.Ant 1.1 | 5.5 | 9.4% | 10 |
| cvt.Firsty 1.0 | 7.2 | 7.4% | 10 |
| sanja.First 0.1 | 7.2 | 7.9% | 2 |
| amk.Punbot.Punbot 0.01 | 7.3 | 7.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 28 / 35 | 6966 |
| 2 | 1 | 67.1 | 73.3 | 22 / 35 | 5743 |
| 3 | 1 | 71.7 | 93.3 | 31 / 35 | 6365 |
| 4 | 1 | 69.1 | 81.9 | 22 / 35 | 6092 |
| 5 | 1 | 72.0 | 95.2 | 29 / 35 | 6582 |
| 6 | 1 | 70.4 | 87.3 | 27 / 35 | 6169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 40 | 93% |
| baal.nano.N 1.42 | 31 | 97% |
| cvt.Firsty 1.0 | 30 | 77% |
| sanja.First 0.1 | 18 | 89% |
| zyx.micro.Ant 1.1 | 17 | 94% |
| Grystrion.TrackerWO 1.0 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 17% | 37 |
| cvt.Firsty 1.0 | 9 | 17% | 27 |
| baal.nano.N 1.42 | 8 | 15% | 32 |
| tvv.nano.Polaris 1.2 | 7 | 13% | 49 |
| Grystrion.TrackerWO 1.0 | 7 | 13% | 22 |
| sanja.First 0.1 | 5 | 10% | 21 |
| amk.Punbot.Punbot 0.01 | 4 | 8% | 7 |
| sample.RamFire 1.0 | 2 | 4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 8 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.4 | 67 / 210 | 3.76 | 15.3% | 30804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.4% | 85 |
| hadur117.micro.SaorWD1 0.1 | 1.8 | 15.3% | 67 |
| cs.Wren 1.0 | 3.8 | 12.0% | 17 |
| js.PinBall 1.6 | 4.0 | 11.4% | 14 |
| mz.Cork 0.1 | 4.2 | 11.0% | 14 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 2 |
| evd.X1 0.01 | 6.7 | 8.4% | 4 |
| jsal.Jsalbot 1.0 | 8.2 | 6.1% | 5 |
| donjezza.Jezza 1.0 | 9.2 | 5.5% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 74.6 | 11 / 35 | 5166 |
| 2 | 2 | 60.8 | 66.7 | 7 / 35 | 4563 |
| 3 | 1 | 64.6 | 72.1 | 18 / 35 | 5046 |
| 4 | 2 | 64.1 | 71.1 | 13 / 35 | 5212 |
| 5 | 2 | 63.4 | 67.0 | 11 / 35 | 5717 |
| 6 | 2 | 61.6 | 64.8 | 7 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 88 | 44% |
| mz.Cork 0.1 | 10 | 80% |
| cs.Wren 1.0 | 10 | 90% |
| js.PinBall 1.6 | 9 | 78% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 85 | 59% | 126 |
| mz.Cork 0.1 | 14 | 10% | 23 |
| evd.X1 0.01 | 12 | 8% | 12 |
| cs.Wren 1.0 | 8 | 6% | 17 |
| js.PinBall 1.6 | 8 | 6% | 11 |
| joe.ADinosaur 1.0 | 8 | 6% | 8 |
| PSW.Relentless 0.1 | 5 | 3% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.6 | 141 / 210 | 2.12 | 19.5% | 30019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.5% | 141 |
| myl.nano.Graviton 1.10 | 3.0 | 11.5% | 14 |
| ntc.Opposite 1.5 | 3.2 | 11.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 9.8% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 9.7% | 9 |
| disan.Chair 2.2.0 | 7.2 | 8.4% | 5 |
| DBall.NUKE 0.1 | 7.3 | 8.4% | 6 |
| donjezza.Muncho 1.0 | 9.2 | 6.1% | 6 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.0 | 21 / 35 | 4961 |
| 2 | 1 | 70.0 | 92.7 | 26 / 35 | 4809 |
| 3 | 1 | 68.8 | 86.0 | 23 / 35 | 5216 |
| 4 | 1 | 68.4 | 84.4 | 22 / 35 | 5100 |
| 5 | 1 | 69.6 | 90.2 | 25 / 35 | 4860 |
| 6 | 1 | 68.9 | 86.0 | 24 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 92% |
| stelo.AreaTargetingBot 1.1 | 31 | 61% |
| ntc.Opposite 1.5 | 28 | 82% |
| disan.Chair 2.2.0 | 20 | 85% |
| DBall.NUKE 0.1 | 16 | 94% |
| donjezza.Muncho 1.0 | 13 | 77% |
| pfvicm.Sobieski 7.2.3b | 11 | 91% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 19 | 26% | 41 |
| ntc.Opposite 1.5 | 13 | 18% | 33 |
| myl.nano.Graviton 1.10 | 12 | 16% | 52 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 7% | 21 |
| donjezza.Muncho 1.0 | 5 | 7% | 12 |
| disan.Chair 2.2.0 | 4 | 5% | 12 |
| DBall.NUKE 0.1 | 3 | 4% | 18 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.9 | 102 / 210 | 3.26 | 16.2% | 25234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.2% | 102 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 37 |
| oog.melee.Capulet 1.2 | 3.0 | 13.9% | 33 |
| yagami.Tidus 0.11 | 4.0 | 12.1% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 11.8% | 13 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 10 |
| stelo.MirrorNano 1.3 | 7.0 | 8.1% | 1 |
| step.nanoPri 1.0 | 8.0 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.1 | 16 / 35 | 4254 |
| 2 | 1 | 65.1 | 76.5 | 18 / 35 | 3974 |
| 3 | 1 | 64.4 | 70.5 | 18 / 35 | 4016 |
| 4 | 1 | 65.4 | 71.4 | 17 / 35 | 4594 |
| 5 | 1 | 66.2 | 77.5 | 19 / 35 | 4224 |
| 6 | 1 | 63.6 | 69.5 | 14 / 35 | 4172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 81% |
| kawigi.micro.Shiz 1.1 | 36 | 72% |
| yagami.Tidus 0.11 | 19 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 100% |
| ejb.Polaris 1.0.1 | 10 | 80% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 32% | 62 |
| yagami.Tidus 0.11 | 22 | 20% | 42 |
| kawigi.micro.Shiz 1.1 | 21 | 19% | 42 |
| ejb.Polaris 1.0.1 | 11 | 10% | 19 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 6% | 31 |
| kurios.DOSexe .9a | 4 | 4% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 50 over 6 battles (8.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.6 | 139 / 210 | 2.65 | 18.1% | 27572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.1% | 139 |
| wee.Gem 1.8.4 | 2.5 | 12.2% | 23 |
| bzdp.Pansy 2.1 | 2.7 | 12.2% | 14 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 8 |
| ratosh.Nobo 0.21 | 4.8 | 10.6% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 7.7 | 7.3% | 3 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.2 | 22 / 35 | 4219 |
| 2 | 1 | 66.6 | 80.0 | 22 / 35 | 4608 |
| 3 | 1 | 67.1 | 79.7 | 22 / 35 | 4747 |
| 4 | 1 | 67.6 | 82.5 | 23 / 35 | 4901 |
| 5 | 1 | 69.8 | 92.7 | 31 / 35 | 4575 |
| 6 | 1 | 66.1 | 78.7 | 19 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 57 | 95% |
| wee.Gem 1.8.4 | 41 | 100% |
| wompi.Quokka 1.6 | 20 | 100% |
| ratosh.Nobo 0.21 | 10 | 70% |
| m3thos.Eva00 1.1 | 7 | 86% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 399. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 20% | 59 |
| ratosh.Nobo 0.21 | 13 | 18% | 23 |
| m3thos.Eva00 1.1 | 9 | 13% | 18 |
| wompi.Quokka 1.6 | 8 | 11% | 15 |
| maribo.FollowFire 1 | 7 | 10% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 12 |
| wee.Gem 1.8.4 | 5 | 7% | 45 |
| stelo.MyAgileRobot 0.2 | 5 | 7% | 9 |
| bayen.UbaMicro 1.4 | 4 | 6% | 13 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 87.6 | 76 / 210 | 2.11 | 21.4% | 51831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 21.4% | 76 |
| wompi.Wallaby 5.1 | 1.8 | 19.5% | 115 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 9 |
| exauge.GateKeeper 1.1.121g | 4.3 | 9.7% | 6 |
| stuff.Vlad 0.1 | 5.2 | 8.9% | 2 |
| ayk.WallHugger 1.0 | 5.5 | 8.7% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 3.0% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 90.8 | 11 / 35 | 8739 |
| 2 | 1 | 72.2 | 83.8 | 12 / 35 | 8536 |
| 3 | 2 | 70.4 | 80.3 | 10 / 35 | 7971 |
| 4 | 1 | 74.2 | 91.7 | 16 / 35 | 9329 |
| 5 | 1 | 72.6 | 87.9 | 12 / 35 | 8342 |
| 6 | 1 | 73.7 | 91.1 | 15 / 35 | 8914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 133 | 29% |
| mz.NanoGod 2.02 | 20 | 85% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| stuff.Vlad 0.1 | 6 | 83% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 67% |

Hadur died in 134 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 108 | 81% | 153 |
| exauge.GateKeeper 1.1.121g | 10 | 7% | 14 |
| mz.NanoGod 2.02 | 9 | 7% | 28 |
| ayk.WallHugger 1.0 | 4 | 3% | 4 |
| stelo.PianistNano 1.2 | 2 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.2 | 107 / 210 | 3.32 | 16.6% | 27561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.6% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.2% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 3.8 | 12.3% | 26 |
| bvh.micro.Freya 0.3 | 4.0 | 11.3% | 14 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.6% | 23 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.0% | 4 |
| conscience.Electron 1.3g | 6.8 | 7.6% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.6% | 11 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 79.4 | 20 / 35 | 4603 |
| 2 | 1 | 65.2 | 74.9 | 19 / 35 | 4401 |
| 3 | 1 | 63.7 | 70.5 | 17 / 35 | 4456 |
| 4 | 1 | 65.9 | 75.6 | 18 / 35 | 5055 |
| 5 | 1 | 61.6 | 66.0 | 11 / 35 | 4539 |
| 6 | 1 | 66.4 | 78.7 | 22 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 33 | 88% |
| dummy.micro.Sparrow 2.5 | 25 | 72% |
| bvh.micro.Freya 0.3 | 16 | 88% |
| stelo.MirrorMicro 1.0 | 7 | 86% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 57 |
| davidalves.net.DuelistMicroMelee 1.4 | 18 | 17% | 53 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 15% | 16 |
| dummy.micro.Sparrow 2.5 | 13 | 13% | 34 |
| conscience.Electron 1.3g | 12 | 12% | 13 |
| dl.BetterWalls 1.0 | 10 | 10% | 13 |
| bvh.micro.Freya 0.3 | 9 | 9% | 14 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.1 | 152 / 210 | 2.16 | 21.4% | 41723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.4% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 18 |
| sul.Lunar 1.1 | 3.3 | 11.0% | 9 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.6% | 12 |
| dsw.StaticD 1.0 | 4.8 | 9.3% | 8 |
| mme.NikeEnhanced 2.0 | 6.0 | 8.7% | 2 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.9% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.1% | 4 |
| sample.Corners 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 82.5 | 22 / 35 | 6955 |
| 2 | 1 | 71.7 | 86.3 | 26 / 35 | 7353 |
| 3 | 1 | 72.0 | 87.3 | 25 / 35 | 7017 |
| 4 | 1 | 70.8 | 84.4 | 25 / 35 | 6471 |
| 5 | 1 | 71.4 | 87.6 | 25 / 35 | 6718 |
| 6 | 1 | 73.7 | 94.6 | 29 / 35 | 7209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 60 | 90% |
| sul.Lunar 1.1 | 33 | 97% |
| supersample.SuperBoxBot 1.0 | 27 | 74% |
| dsw.StaticD 1.0 | 17 | 82% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| tlp.ThreeLeggedPig 1 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 5 | 80% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 45% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 17% | 57 |
| sul.Lunar 1.1 | 5 | 9% | 39 |
| dsw.StaticD 1.0 | 5 | 9% | 26 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 8 |
| sample.Corners 1.0 | 2 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 84.2 | 134 / 210 | 2.42 | 19.7% | 40635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.7% | 134 |
| radnor.DoctorBob 1.42 | 3.0 | 12.4% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.7% | 22 |
| mld.Wisdom 1.0 | 3.7 | 11.6% | 9 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.4% | 6 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 12 |
| GarmBox.Oranges 1.0 | 7.7 | 7.2% | 0 |
| sample.Walls 1.0 | 7.8 | 6.9% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.4% | 4 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.1 | 21 / 35 | 6776 |
| 2 | 1 | 72.3 | 90.8 | 27 / 35 | 7368 |
| 3 | 1 | 69.8 | 85.4 | 21 / 35 | 6886 |
| 4 | 1 | 68.7 | 82.9 | 20 / 35 | 6457 |
| 5 | 1 | 67.0 | 76.2 | 19 / 35 | 6274 |
| 6 | 1 | 70.4 | 86.0 | 26 / 35 | 6874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 51 | 92% |
| radnor.DoctorBob 1.42 | 30 | 87% |
| mld.Wisdom 1.0 | 17 | 100% |
| amz.NanoClone 1.41 | 14 | 79% |
| KiraNL.Chupacabra 0.4 | 12 | 83% |
| sample.Walls 1.0 | 9 | 89% |
| jangs.ns51 1.0 | 8 | 75% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 28% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 17% | 61 |
| mld.Wisdom 1.0 | 12 | 16% | 33 |
| KiraNL.Chupacabra 0.4 | 12 | 16% | 24 |
| amz.NanoClone 1.41 | 10 | 13% | 18 |
| jangs.ns51 1.0 | 5 | 7% | 11 |
| GarmBox.Oranges 1.0 | 2 | 3% | 3 |
| sample.Walls 1.0 | 1 | 1% | 4 |

