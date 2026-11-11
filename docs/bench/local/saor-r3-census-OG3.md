# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 85.0 | 126 / 210 | 2.35 | 19.9% | 37899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.9% | 126 |
| mz.AntiGrav 1.0 | 2.5 | 14.9% | 21 |
| radnor.DoctorBob 1.42 | 2.7 | 14.8% | 25 |
| mld.Infinity 2.2 | 3.8 | 13.4% | 30 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 3 |
| sample.Walls 1.0 | 6.7 | 6.5% | 2 |
| GarmBox.Oranges 1.0 | 7.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 8.8 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.7 | 24 / 35 | 6925 |
| 2 | 1 | 70.0 | 81.6 | 20 / 35 | 6604 |
| 3 | 1 | 69.4 | 78.7 | 22 / 35 | 6041 |
| 4 | 1 | 71.1 | 86.7 | 22 / 35 | 6079 |
| 5 | 1 | 70.6 | 88.3 | 21 / 35 | 5953 |
| 6 | 1 | 69.7 | 83.2 | 17 / 35 | 6297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 91% |
| mld.Infinity 2.2 | 43 | 74% |
| radnor.DoctorBob 1.42 | 35 | 74% |
| amz.NanoClone 1.41 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 42% | 70 |
| mld.Infinity 2.2 | 19 | 23% | 21 |
| mz.AntiGrav 1.0 | 17 | 20% | 83 |
| amz.NanoClone 1.41 | 4 | 5% | 11 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 10 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 2 | 2% | 4 |

## Melee bench: F02

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.8 | 153 / 210 | 2.19 | 19.1% | 30070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.2 | 19.1% | 153 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 34 |
| mld.DustBunny 3.8 | 2.7 | 13.9% | 17 |
| maribo.melee.BMV 0.1 | 4.2 | 10.3% | 0 |
| zyx.nano.Ant 1.1 | 5.0 | 9.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.2% | 1 |
| bzdp.BoxCar 2.0 | 8.0 | 6.6% | 0 |
| fullsail.SweetTea 1.1 | 8.5 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 27 / 35 | 4953 |
| 2 | 1 | 69.4 | 88.9 | 29 / 35 | 4797 |
| 3 | 1 | 69.7 | 90.2 | 26 / 35 | 5063 |
| 4 | 1 | 69.5 | 89.2 | 27 / 35 | 5073 |
| 5 | 1 | 70.3 | 94.9 | 28 / 35 | 4895 |
| 6 | 2 | 64.9 | 66.0 | 16 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 93 | 95% |
| mld.DustBunny 3.8 | 47 | 85% |
| maribo.melee.BMV 0.1 | 8 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 20 | 35% | 58 |
| oog.melee.Mercutio 1.0 | 13 | 23% | 97 |
| zyx.nano.Ant 1.1 | 7 | 12% | 12 |
| maribo.melee.BMV 0.1 | 4 | 7% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 10 |
| cs.Grudge 1.0 | 4 | 7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 8 |
| fullsail.SweetTea 1.1 | 2 | 4% | 5 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.0 | 131 / 210 | 2.71 | 19.0% | 34015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.0% | 131 |
| myl.micro.Troodon 1.10 | 2.0 | 15.8% | 42 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 14 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.8% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.5% | 8 |
| fm.mammillarias 1.3 | 5.3 | 9.0% | 1 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 3 |
| sample.Tracker 1.0 | 9.5 | 5.1% | 0 |
| sample.Fire 1.0 | 9.5 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.4 | 23 / 35 | 5580 |
| 2 | 1 | 69.4 | 84.4 | 24 / 35 | 5478 |
| 3 | 1 | 67.0 | 74.0 | 19 / 35 | 5440 |
| 4 | 1 | 69.3 | 82.5 | 21 / 35 | 5798 |
| 5 | 1 | 66.9 | 74.9 | 17 / 35 | 5460 |
| 6 | 1 | 70.9 | 85.4 | 27 / 35 | 6259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 85 | 88% |
| myl.nano.KomoriNinja 1.1 | 20 | 95% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 92% |
| fm.mammillarias 1.3 | 7 | 86% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 31 | 39% | 104 |
| cb.nano.Insomnia 1.0 | 15 | 19% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 11% | 23 |
| fm.mammillarias 1.3 | 9 | 11% | 13 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 31 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 4 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 11 |

## Melee bench: F04

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.0 | 120 / 210 | 2.62 | 19.0% | 34975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.0% | 120 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.7% | 19 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.2% | 29 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.8 | 10.1% | 5 |
| yk.JahMicro 1.0 | 5.7 | 8.9% | 7 |
| tj.zombie1n 1.0.1 | 5.8 | 9.0% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.6% | 4 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.5% | 16 |
| repositorio.NanoStep 1.0 | 8.8 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 74.3 | 17 / 35 | 4974 |
| 2 | 1 | 69.4 | 84.8 | 24 / 35 | 6181 |
| 3 | 1 | 69.1 | 86.7 | 19 / 35 | 5649 |
| 4 | 1 | 67.7 | 79.4 | 17 / 35 | 6027 |
| 5 | 1 | 67.1 | 78.7 | 19 / 35 | 5506 |
| 6 | 1 | 71.1 | 87.9 | 24 / 35 | 6638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 47 | 87% |
| stelo.SoJNanoMelee 1.1 | 29 | 66% |
| tvv.micro.Antares 1.1.1 | 23 | 65% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 88% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| yk.JahMicro 1.0 | 9 | 78% |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 83% |
| repositorio.NanoStep 1.0 | 5 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 32% | 76 |
| tvv.micro.Antares 1.1.1 | 17 | 19% | 33 |
| stelo.SoJNanoMelee 1.1 | 16 | 18% | 31 |
| Grystrion.RandomTrackerNOREV 1.0 | 10 | 11% | 19 |
| tj.zombie1n 1.0.1 | 7 | 8% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 17 |
| yk.JahMicro 1.0 | 4 | 4% | 8 |
| repositorio.NanoStep 1.0 | 2 | 2% | 11 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 69.0 | 106 / 210 | 3.79 | 16.0% | 28169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 16.0% | 106 |
| oog.melee.Corsair 1.0 | 2.7 | 12.5% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.2 | 11.8% | 22 |
| ahf.NanoAndrew .4 | 3.7 | 11.4% | 26 |
| EBBU.Sim2 1.02 | 5.2 | 10.0% | 9 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.2% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 75.2 | 21 / 35 | 4628 |
| 2 | 1 | 61.4 | 63.2 | 14 / 35 | 4394 |
| 3 | 1 | 63.8 | 68.6 | 17 / 35 | 4918 |
| 4 | 1 | 66.0 | 75.6 | 20 / 35 | 5087 |
| 5 | 1 | 62.8 | 66.3 | 19 / 35 | 4209 |
| 6 | 1 | 63.3 | 65.1 | 15 / 35 | 4933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 43 | 91% |
| oog.melee.Corsair 1.0 | 37 | 92% |
| ahf.NanoAndrew .4 | 17 | 71% |
| sam.Samspin 1.0 | 12 | 83% |
| EBBU.Sim2 1.02 | 9 | 67% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 25% | 63 |
| ahf.NanoAndrew .4 | 14 | 13% | 26 |
| robar.nano.Assertive_Melee 0.2 | 12 | 12% | 19 |
| EBBU.Sim2 1.02 | 12 | 12% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 9% | 10 |
| oog.melee.Corsair 1.0 | 8 | 8% | 36 |
| sam.Samspin 1.0 | 8 | 8% | 17 |
| zyx.nano.BacillusComma 1.0 | 8 | 8% | 10 |
| sample.TrackFire 1.0 | 7 | 7% | 10 |

## Melee bench: F06

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.3 | 145 / 210 | 2.05 | 19.8% | 32317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.8% | 145 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.8% | 28 |
| gh.nano.Grofvuil 0.2 | 2.8 | 12.2% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.4% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.0% | 6 |
| fm.claire 1.7 | 5.7 | 9.3% | 1 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.0% | 2 |
| pa.Improved 1.0 | 8.5 | 5.9% | 1 |
| sample.SpinBot 1.0 | 9.2 | 5.3% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.3 | 23 / 35 | 5284 |
| 2 | 1 | 69.5 | 85.7 | 24 / 35 | 5406 |
| 3 | 1 | 70.0 | 90.5 | 26 / 35 | 5045 |
| 4 | 1 | 68.9 | 87.9 | 25 / 35 | 4890 |
| 5 | 1 | 70.2 | 89.5 | 25 / 35 | 5628 |
| 6 | 1 | 70.6 | 89.8 | 22 / 35 | 6064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 91% |
| oog.melee.CapuletDroid 1.1 | 36 | 89% |
| gh.nano.Grofvuil 0.2 | 33 | 82% |
| winamp32.micro.MicroMacro 1.0 | 13 | 92% |
| fm.claire 1.7 | 9 | 100% |
| arthord.NanoSatanMelee Beta | 6 | 83% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 18 | 28% | 26 |
| d414.nano.Quantum 1.0.0 | 16 | 25% | 82 |
| gh.nano.Grofvuil 0.2 | 16 | 25% | 49 |
| arthord.NanoSatanMelee Beta | 6 | 9% | 16 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 16 |
| fm.claire 1.7 | 2 | 3% | 9 |
| sample.SpinBot 1.0 | 2 | 3% | 2 |
| kurios.DOSexe .9b | 1 | 2% | 6 |
| pa.Improved 1.0 | 1 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.7 | 93 / 210 | 2.92 | 17.1% | 29770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.2 | 17.1% | 93 |
| gh.micro.Gruweltje 0.7 | 2.0 | 16.0% | 47 |
| spinnercat.micro.Tyger 0.1 | 2.8 | 14.3% | 33 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 19 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 7 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.9% | 1 |
| el.JumpShoot 0.2 | 6.8 | 6.7% | 4 |
| acogdev.alpha 0.2 | 8.3 | 5.9% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.5% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 77.8 | 16 / 35 | 5246 |
| 2 | 1 | 67.9 | 85.4 | 17 / 35 | 5022 |
| 3 | 1 | 65.4 | 76.8 | 18 / 35 | 4408 |
| 4 | 1 | 66.4 | 78.1 | 15 / 35 | 5109 |
| 5 | 2 | 64.2 | 69.2 | 12 / 35 | 4928 |
| 6 | 1 | 67.2 | 84.8 | 15 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 59% |
| gh.micro.Gruweltje 0.7 | 42 | 57% |
| mz.MicroGodMelee 1 | 30 | 83% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 50% |

Hadur died in 117 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 39 | 33% | 73 |
| spinnercat.micro.Tyger 0.1 | 38 | 32% | 62 |
| mz.MicroGodMelee 1 | 14 | 12% | 37 |
| acogdev.alpha 0.2 | 9 | 8% | 10 |
| fire219.CatBot 1.0 | 7 | 6% | 6 |
| DBall.Anarchy 0.1 | 3 | 3% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |

## Melee bench: F08

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 64.2 | 79 / 210 | 4.22 | 14.6% | 27154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.4% | 62 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 14.6% | 79 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.7% | 37 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 10 |
| germ.TheMind .2 | 5.0 | 9.1% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.2% | 3 |
| awesomeness.Elite 1.0 | 7.0 | 8.1% | 6 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.1% | 4 |
| sample.Crazy 1.0 | 8.2 | 7.4% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 63.2 | 11 / 35 | 4463 |
| 2 | 1 | 62.7 | 67.0 | 13 / 35 | 4718 |
| 3 | 2 | 61.7 | 67.3 | 14 / 35 | 4131 |
| 4 | 2 | 59.7 | 57.5 | 11 / 35 | 4404 |
| 5 | 2 | 61.2 | 61.3 | 15 / 35 | 4653 |
| 6 | 2 | 63.8 | 68.9 | 15 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 58% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 81% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| germ.TheMind .2 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 5 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 511. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 60% | 119 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 18% | 39 |
| germ.TheMind .2 | 9 | 7% | 15 |
| awesomeness.Elite 1.0 | 4 | 3% | 9 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 7 |
| sample.Crazy 1.0 | 4 | 3% | 6 |
| mym.EdgeStalker 1.0 | 3 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 5 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 36 over 6 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.4 | 139 / 210 | 2.31 | 19.1% | 28071 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 19.1% | 139 |
| rz.HawkOnFire 0.1 | 2.0 | 14.5% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 17 |
| maribo.IotaCT 1.1 | 4.0 | 11.3% | 14 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 9.0% | 1 |
| stelo.PatternRobot 1.0 | 7.2 | 8.0% | 7 |
| ratosh.Wesco 1.4 | 7.7 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 7.8% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 22 / 35 | 5006 |
| 2 | 1 | 69.0 | 82.5 | 24 / 35 | 4986 |
| 3 | 1 | 68.8 | 83.5 | 18 / 35 | 4794 |
| 4 | 1 | 69.6 | 87.0 | 23 / 35 | 4613 |
| 5 | 1 | 69.8 | 89.5 | 27 / 35 | 4311 |
| 6 | 1 | 68.7 | 84.1 | 25 / 35 | 4361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 87 | 90% |
| nz.jdc.nano.GridFu 1.0 | 34 | 85% |
| maribo.IotaCT 1.1 | 17 | 82% |
| stelo.PatternRobot 1.0 | 8 | 63% |
| ratosh.Wesco 1.4 | 5 | 100% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 71 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 19 | 27% | 83 |
| stelo.PatternRobot 1.0 | 11 | 15% | 14 |
| nz.jdc.nano.GridFu 1.0 | 9 | 13% | 46 |
| ratosh.Wesco 1.4 | 9 | 13% | 14 |
| maribo.IotaCT 1.1 | 8 | 11% | 31 |
| timmit.nano.TimDog 0.33 | 7 | 10% | 12 |
| spinnercat.Omen 1.0 | 4 | 6% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.0 | 157 / 210 | 2.08 | 20.5% | 36512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 20.5% | 157 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.6% | 17 |
| baal.nano.N 1.42 | 3.0 | 11.7% | 7 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.4% | 3 |
| zyx.micro.Ant 1.1 | 5.3 | 8.9% | 7 |
| squidM.TentalceMeleeNano 1.1 | 6.5 | 8.4% | 5 |
| sanja.First 0.1 | 6.7 | 8.4% | 4 |
| cvt.Firsty 1.0 | 6.8 | 8.0% | 9 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.1 | 27 / 35 | 6260 |
| 2 | 1 | 71.9 | 91.4 | 28 / 35 | 6905 |
| 3 | 1 | 70.6 | 86.0 | 24 / 35 | 6315 |
| 4 | 1 | 68.0 | 81.6 | 23 / 35 | 5539 |
| 5 | 1 | 70.9 | 90.5 | 28 / 35 | 5896 |
| 6 | 1 | 69.1 | 86.7 | 27 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 89% |
| baal.nano.N 1.42 | 37 | 92% |
| cvt.Firsty 1.0 | 27 | 93% |
| sanja.First 0.1 | 19 | 89% |
| zyx.micro.Ant 1.1 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| Grystrion.TrackerWO 1.0 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 13 | 23% | 52 |
| cvt.Firsty 1.0 | 8 | 14% | 34 |
| zyx.micro.Ant 1.1 | 8 | 14% | 30 |
| baal.nano.N 1.42 | 7 | 13% | 39 |
| sanja.First 0.1 | 6 | 11% | 21 |
| squidM.TentalceMeleeNano 1.1 | 6 | 11% | 11 |
| Grystrion.TrackerWO 1.0 | 5 | 9% | 11 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 5 |
| sample.RamFire 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.7 | 56 / 210 | 4.00 | 14.4% | 27774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.0 | 17.5% | 106 |
| hadur117.micro.SaorOG3 0.1 | 2.0 | 14.4% | 56 |
| cs.Wren 1.0 | 3.2 | 12.1% | 15 |
| js.PinBall 1.6 | 4.5 | 11.0% | 14 |
| mz.Cork 0.1 | 4.7 | 10.6% | 9 |
| joe.ADinosaur 1.0 | 5.7 | 9.2% | 5 |
| evd.X1 0.01 | 7.0 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 1 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 67.9 | 9 / 35 | 4396 |
| 2 | 2 | 63.4 | 70.8 | 9 / 35 | 4948 |
| 3 | 2 | 59.2 | 60.0 | 9 / 35 | 4376 |
| 4 | 2 | 59.1 | 60.0 | 7 / 35 | 4354 |
| 5 | 2 | 62.6 | 70.2 | 11 / 35 | 4693 |
| 6 | 2 | 63.7 | 71.4 | 11 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 72 | 32% |
| cs.Wren 1.0 | 14 | 86% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 85 | 55% | 110 |
| evd.X1 0.01 | 17 | 11% | 18 |
| cs.Wren 1.0 | 14 | 9% | 26 |
| joe.ADinosaur 1.0 | 12 | 8% | 14 |
| PSW.Relentless 0.1 | 9 | 6% | 9 |
| js.PinBall 1.6 | 8 | 5% | 13 |
| mz.Cork 0.1 | 5 | 3% | 10 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |
| donjezza.Jezza 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.2 | 125 / 210 | 2.70 | 18.3% | 28766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.3% | 125 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 18 |
| ntc.Opposite 1.5 | 3.2 | 11.6% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.6% | 4 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.5% | 4 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.4% | 21 |
| disan.Chair 2.2.0 | 6.8 | 8.7% | 13 |
| DBall.NUKE 0.1 | 7.7 | 8.0% | 7 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 11 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.0 | 18 / 35 | 4852 |
| 2 | 1 | 67.5 | 82.2 | 21 / 35 | 4853 |
| 3 | 1 | 68.6 | 87.3 | 22 / 35 | 4699 |
| 4 | 1 | 68.8 | 82.2 | 24 / 35 | 5304 |
| 5 | 1 | 66.1 | 78.4 | 20 / 35 | 4607 |
| 6 | 1 | 65.8 | 75.9 | 20 / 35 | 4451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 42 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 22 | 100% |
| stelo.AreaTargetingBot 1.1 | 21 | 62% |
| disan.Chair 2.2.0 | 16 | 88% |
| ntc.Opposite 1.5 | 15 | 87% |
| donjezza.Muncho 1.0 | 12 | 75% |
| DBall.NUKE 0.1 | 7 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 20 | 22% | 39 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 22 |
| myl.nano.Graviton 1.10 | 12 | 13% | 49 |
| ntc.Opposite 1.5 | 12 | 13% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 11% | 22 |
| disan.Chair 2.2.0 | 8 | 9% | 17 |
| DBall.NUKE 0.1 | 4 | 4% | 15 |
| donjezza.Muncho 1.0 | 4 | 4% | 11 |
| pbg.R2D2 1.0 | 4 | 4% | 8 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.0 | 84 / 210 | 3.61 | 15.3% | 23997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.3 | 15.3% | 84 |
| kawigi.micro.Shiz 1.1 | 1.7 | 14.7% | 49 |
| oog.melee.Capulet 1.2 | 3.0 | 13.5% | 38 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.5% | 19 |
| ejb.Polaris 1.0.1 | 6.0 | 10.7% | 6 |
| stelo.MirrorNano 1.3 | 7.5 | 7.1% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.9% | 1 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.8 | 14 / 35 | 3790 |
| 2 | 2 | 63.5 | 68.3 | 11 / 35 | 4428 |
| 3 | 1 | 64.4 | 73.3 | 16 / 35 | 3813 |
| 4 | 1 | 65.1 | 74.6 | 18 / 35 | 4011 |
| 5 | 1 | 65.2 | 74.9 | 14 / 35 | 4168 |
| 6 | 2 | 61.5 | 64.1 | 11 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 36 | 72% |
| kawigi.micro.Shiz 1.1 | 28 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 100% |
| yagami.Tidus 0.11 | 18 | 83% |
| ejb.Polaris 1.0.1 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 42 | 33% | 70 |
| yagami.Tidus 0.11 | 23 | 18% | 38 |
| kawigi.micro.Shiz 1.1 | 21 | 17% | 29 |
| ejb.Polaris 1.0.1 | 16 | 13% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 41 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 49 over 6 battles (8.2 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.6 | 141 / 210 | 2.66 | 17.7% | 25107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 17.7% | 141 |
| bzdp.Pansy 2.1 | 2.7 | 11.9% | 17 |
| wee.Gem 1.8.4 | 3.2 | 11.6% | 21 |
| ratosh.Nobo 0.21 | 4.3 | 10.9% | 4 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 13 |
| m3thos.Eva00 1.1 | 5.5 | 9.9% | 4 |
| bayen.UbaMicro 1.4 | 7.0 | 9.0% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 4 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 73.0 | 18 / 35 | 4184 |
| 2 | 1 | 63.0 | 71.1 | 16 / 35 | 4120 |
| 3 | 1 | 68.1 | 88.9 | 27 / 35 | 4100 |
| 4 | 1 | 65.6 | 78.7 | 25 / 35 | 3878 |
| 5 | 1 | 68.4 | 87.3 | 28 / 35 | 4285 |
| 6 | 1 | 69.3 | 90.5 | 27 / 35 | 4540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 91% |
| wee.Gem 1.8.4 | 35 | 100% |
| wompi.Quokka 1.6 | 25 | 92% |
| ratosh.Nobo 0.21 | 17 | 100% |
| m3thos.Eva00 1.1 | 13 | 92% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.MyAgileRobot 0.2 | 12 | 17% | 16 |
| wompi.Quokka 1.6 | 10 | 14% | 24 |
| bzdp.Pansy 2.1 | 8 | 12% | 49 |
| wee.Gem 1.8.4 | 8 | 12% | 49 |
| maribo.FollowFire 1 | 8 | 12% | 11 |
| ratosh.Nobo 0.21 | 7 | 10% | 17 |
| bayen.UbaMicro 1.4 | 7 | 10% | 13 |
| m3thos.Eva00 1.1 | 5 | 7% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 5 |

## Melee bench: F15

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 81.8 | 41 / 210 | 2.64 | 19.1% | 45589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.9% | 149 |
| hadur117.micro.SaorOG3 0.1 | 1.8 | 19.1% | 41 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 14 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.9% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.0% | 2 |
| stuff.Vlad 0.1 | 5.5 | 8.6% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.2% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.1% | 1 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 72.2 | 85.7 | 10 / 35 | 7879 |
| 2 | 2 | 69.6 | 81.9 | 5 / 35 | 7100 |
| 3 | 2 | 70.1 | 81.0 | 4 / 35 | 7684 |
| 4 | 1 | 71.3 | 84.8 | 11 / 35 | 8119 |
| 5 | 2 | 69.7 | 80.3 | 4 / 35 | 7420 |
| 6 | 2 | 69.2 | 77.1 | 7 / 35 | 7387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 125 | 14% |
| mz.NanoGod 2.02 | 14 | 79% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stuff.Vlad 0.1 | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 50% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 129 | 76% | 146 |
| mz.NanoGod 2.02 | 20 | 12% | 32 |
| ayk.WallHugger 1.0 | 7 | 4% | 7 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 9 |
| stuff.Vlad 0.1 | 3 | 2% | 7 |
| stelo.PianistNano 1.2 | 3 | 2% | 3 |
| drd.Dreadknoght 0.9 | 2 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 67.0 | 88 / 210 | 3.97 | 15.3% | 26787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 15.3% | 88 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.4% | 33 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.4% | 25 |
| bvh.micro.Freya 0.3 | 3.8 | 11.8% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 9.9% | 16 |
| stelo.MirrorMicro 1.0 | 6.5 | 8.9% | 7 |
| conscience.Electron 1.3g | 6.7 | 8.2% | 3 |
| ap.Frederick 1.1 | 8.3 | 7.3% | 14 |
| dl.BetterWalls 1.0 | 8.3 | 7.0% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 67.3 | 13 / 35 | 4235 |
| 2 | 1 | 64.2 | 69.5 | 18 / 35 | 4678 |
| 3 | 1 | 60.0 | 62.2 | 10 / 35 | 3938 |
| 4 | 1 | 61.8 | 65.7 | 13 / 35 | 4357 |
| 5 | 1 | 61.5 | 63.2 | 14 / 35 | 4675 |
| 6 | 1 | 65.8 | 74.3 | 20 / 35 | 4904 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 68% |
| dummy.micro.Sparrow 2.5 | 26 | 85% |
| bvh.micro.Freya 0.3 | 21 | 95% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 6 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 83% |

Hadur died in 122 of 210 rounds, at a mean tick of 429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 28% | 66 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 19% | 22 |
| conscience.Electron 1.3g | 19 | 16% | 26 |
| dummy.micro.Sparrow 2.5 | 16 | 13% | 36 |
| dl.BetterWalls 1.0 | 10 | 8% | 12 |
| bvh.micro.Freya 0.3 | 9 | 7% | 20 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 7% | 20 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 7 |

## Melee bench: F17

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 44 over 6 battles (7.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.6 | 151 / 210 | 2.03 | 21.6% | 42231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 21.6% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.5% | 18 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.6% | 13 |
| sul.Lunar 1.1 | 3.7 | 11.5% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.8% | 5 |
| dsw.StaticD 1.0 | 6.3 | 8.0% | 3 |
| tlp.ThreeLeggedPig 1 | 6.5 | 7.8% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.0% | 2 |
| sample.MyFirstRobot 1.0 | 8.7 | 5.7% | 2 |
| sample.Corners 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 84.8 | 24 / 35 | 6781 |
| 2 | 1 | 72.1 | 91.4 | 23 / 35 | 7052 |
| 3 | 1 | 72.9 | 90.5 | 29 / 35 | 7298 |
| 4 | 1 | 71.3 | 85.1 | 25 / 35 | 6720 |
| 5 | 1 | 72.2 | 88.6 | 23 / 35 | 7349 |
| 6 | 1 | 72.2 | 91.1 | 27 / 35 | 7031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 56 | 91% |
| sul.Lunar 1.1 | 40 | 98% |
| supersample.SuperBoxBot 1.0 | 34 | 82% |
| dsw.StaticD 1.0 | 12 | 83% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| mme.NikeEnhanced 2.0 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 20 | 32% | 73 |
| supersample.SuperBoxBot 1.0 | 16 | 26% | 40 |
| sul.Lunar 1.1 | 6 | 10% | 47 |
| dsw.StaticD 1.0 | 5 | 8% | 16 |
| mme.NikeEnhanced 2.0 | 5 | 8% | 7 |
| sample.Corners 1.0 | 3 | 5% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG3 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 78.2 | 111 / 210 | 2.96 | 18.2% | 38043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG3 0.1 | 1.0 | 18.2% | 111 |
| radnor.DoctorBob 1.42 | 2.0 | 13.4% | 35 |
| mld.Wisdom 1.0 | 3.3 | 12.0% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 19 |
| KiraNL.Chupacabra 0.4 | 4.7 | 10.6% | 9 |
| amz.NanoClone 1.41 | 6.0 | 9.2% | 9 |
| sample.Walls 1.0 | 7.2 | 7.9% | 11 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 2 |
| jangs.ns51 1.0 | 8.8 | 6.4% | 3 |
| sample.Target 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.8 | 18 / 35 | 6568 |
| 2 | 1 | 66.6 | 73.3 | 18 / 35 | 6196 |
| 3 | 1 | 67.8 | 79.0 | 22 / 35 | 6211 |
| 4 | 1 | 66.6 | 75.6 | 18 / 35 | 6250 |
| 5 | 1 | 65.0 | 70.5 | 14 / 35 | 5978 |
| 6 | 1 | 69.9 | 86.0 | 21 / 35 | 6840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 63% |
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 97% |
| mld.Wisdom 1.0 | 19 | 95% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| GarmBox.Oranges 1.0 | 9 | 89% |
| sample.Walls 1.0 | 9 | 100% |
| jangs.ns51 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 2 | 100% |
| sample.Target 1.0 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 40 | 40% | 63 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 26 |
| mld.Wisdom 1.0 | 12 | 12% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 10% | 48 |
| amz.NanoClone 1.41 | 9 | 9% | 14 |
| sample.Walls 1.0 | 5 | 5% | 11 |
| jangs.ns51 1.0 | 4 | 4% | 11 |
| GarmBox.Oranges 1.0 | 2 | 2% | 4 |
| sample.Target 1.0 | 1 | 1% | 0 |

