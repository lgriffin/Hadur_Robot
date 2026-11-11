# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 46 over 6 battles (7.7 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 90.1 | 153 / 210 | 1.89 | 21.4% | 41201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.4% | 153 |
| radnor.DoctorBob 1.42 | 2.7 | 14.5% | 21 |
| mz.AntiGrav 1.0 | 2.7 | 14.5% | 14 |
| mld.Infinity 2.2 | 3.7 | 13.0% | 19 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 2 |
| sample.Walls 1.0 | 6.8 | 6.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.2 | 6.0% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.8 | 93.0 | 30 / 35 | 7185 |
| 2 | 1 | 73.4 | 94.0 | 29 / 35 | 6816 |
| 3 | 1 | 72.3 | 91.1 | 25 / 35 | 6979 |
| 4 | 1 | 71.2 | 87.9 | 23 / 35 | 6442 |
| 5 | 1 | 72.1 | 89.5 | 23 / 35 | 7132 |
| 6 | 1 | 71.2 | 85.1 | 23 / 35 | 6647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 100% |
| radnor.DoctorBob 1.42 | 46 | 87% |
| mld.Infinity 2.2 | 45 | 84% |
| jangs.ns51 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 4 | 50% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 40% | 79 |
| mld.Infinity 2.2 | 14 | 25% | 17 |
| amz.NanoClone 1.41 | 8 | 14% | 13 |
| mz.AntiGrav 1.0 | 6 | 11% | 75 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 2 | 4% | 4 |
| arthord.MannyPacquiao Beta | 1 | 2% | 7 |
| sample.Walls 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 81.5 | 143 / 210 | 2.67 | 18.3% | 30223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.3% | 143 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.1% | 47 |
| mld.DustBunny 3.8 | 3.0 | 13.9% | 10 |
| maribo.melee.BMV 0.1 | 4.0 | 10.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.2 | 8.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 7.8% | 3 |
| fullsail.SweetTea 1.1 | 6.7 | 7.7% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 7.5% | 2 |
| bzdp.BoxCar 2.0 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 27 / 35 | 5037 |
| 2 | 1 | 64.7 | 66.7 | 16 / 35 | 5360 |
| 3 | 1 | 68.0 | 83.2 | 25 / 35 | 4895 |
| 4 | 1 | 66.2 | 78.1 | 21 / 35 | 4565 |
| 5 | 1 | 70.6 | 91.7 | 28 / 35 | 5288 |
| 6 | 1 | 68.8 | 84.8 | 26 / 35 | 5078 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 89% |
| mld.DustBunny 3.8 | 56 | 96% |
| maribo.melee.BMV 0.1 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 91% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 20 | 29% | 83 |
| mld.DustBunny 3.8 | 13 | 19% | 64 |
| fullsail.SweetTea 1.1 | 9 | 13% | 13 |
| maribo.melee.BMV 0.1 | 5 | 7% | 15 |
| cs.Grudge 1.0 | 5 | 7% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 15 |
| bzdp.BoxCar 2.0 | 4 | 6% | 6 |
| djdjdj.NanoSkunk10 1.0 | 4 | 6% | 4 |
| zyx.nano.Ant 1.1 | 3 | 4% | 5 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 85.6 | 144 / 210 | 2.30 | 20.2% | 36035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.2% | 144 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 25 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 10.1% | 14 |
| fm.mammillarias 1.3 | 4.8 | 9.9% | 6 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.9% | 13 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.2% | 2 |
| sample.Tracker 1.0 | 9.2 | 5.3% | 1 |
| sample.Fire 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 29 / 35 | 5495 |
| 2 | 1 | 70.6 | 89.2 | 20 / 35 | 6475 |
| 3 | 1 | 70.3 | 82.5 | 24 / 35 | 6529 |
| 4 | 1 | 68.8 | 79.4 | 23 / 35 | 5752 |
| 5 | 1 | 68.9 | 81.0 | 21 / 35 | 5505 |
| 6 | 1 | 71.2 | 87.6 | 27 / 35 | 6279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 66 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 81% |
| cb.nano.Insomnia 1.0 | 27 | 70% |
| myl.nano.KomoriNinja 1.1 | 25 | 100% |
| fm.mammillarias 1.3 | 10 | 60% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| sample.Tracker 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 15 | 23% | 8 |
| myl.micro.Troodon 1.10 | 14 | 21% | 81 |
| fm.mammillarias 1.3 | 12 | 18% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 14% | 26 |
| myl.nano.KomoriNinja 1.1 | 6 | 9% | 40 |
| cs.sheldor.Talon 1.1 | 5 | 8% | 13 |
| sp.Nanos.Ember 1.1 | 3 | 5% | 8 |
| sample.Fire 1.0 | 2 | 3% | 6 |
| sample.Tracker 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 46 over 6 battles (7.7 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 85.5 | 142 / 210 | 2.30 | 20.5% | 39971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.5% | 142 |
| tvv.micro.Antares 1.1.1 | 2.2 | 12.7% | 14 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.2% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.3% | 21 |
| tj.zombie1n 1.0.1 | 5.8 | 9.0% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.5% | 4 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 8.3% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 83.5 | 20 / 35 | 6430 |
| 2 | 1 | 69.7 | 85.4 | 24 / 35 | 6179 |
| 3 | 1 | 71.2 | 86.7 | 26 / 35 | 7053 |
| 4 | 1 | 70.0 | 82.5 | 23 / 35 | 6827 |
| 5 | 1 | 70.7 | 87.6 | 25 / 35 | 6689 |
| 6 | 1 | 70.8 | 87.3 | 24 / 35 | 6793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 60 | 93% |
| stelo.SoJNanoMelee 1.1 | 33 | 67% |
| tvv.micro.Antares 1.1.1 | 27 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 93% |
| tj.zombie1n 1.0.1 | 14 | 57% |
| yk.JahMicro 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 34% | 78 |
| stelo.SoJNanoMelee 1.1 | 16 | 24% | 41 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 36 |
| tj.zombie1n 1.0.1 | 8 | 12% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 7% | 5 |
| yk.JahMicro 1.0 | 4 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 18 |
| repositorio.NanoStep 1.0 | 1 | 1% | 7 |
| sample.VelociRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 69.6 | 107 / 210 | 3.73 | 16.5% | 29774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 16.5% | 107 |
| oog.melee.Corsair 1.0 | 2.5 | 12.8% | 26 |
| ahf.NanoAndrew .4 | 3.0 | 11.9% | 29 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 18 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 9.5% | 8 |
| EBBU.Sim2 1.02 | 5.7 | 10.0% | 9 |
| sam.Samspin 1.0 | 7.0 | 9.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 66.7 | 16 / 35 | 4879 |
| 2 | 1 | 67.0 | 76.2 | 19 / 35 | 5492 |
| 3 | 1 | 63.6 | 67.3 | 17 / 35 | 4750 |
| 4 | 1 | 64.4 | 66.3 | 19 / 35 | 4895 |
| 5 | 1 | 64.6 | 68.9 | 18 / 35 | 4942 |
| 6 | 1 | 65.3 | 72.4 | 18 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ahf.NanoAndrew .4 | 35 | 89% |
| oog.melee.Corsair 1.0 | 33 | 82% |
| simonton.nano.MeleeSeed 1.8 | 32 | 88% |
| sam.Samspin 1.0 | 9 | 89% |
| robar.nano.Assertive_Melee 0.2 | 8 | 75% |
| EBBU.Sim2 1.02 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 357. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 25% | 49 |
| robar.nano.Assertive_Melee 0.2 | 19 | 18% | 26 |
| oog.melee.Corsair 1.0 | 13 | 13% | 43 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 11% | 12 |
| ahf.NanoAndrew .4 | 10 | 10% | 40 |
| EBBU.Sim2 1.02 | 9 | 9% | 13 |
| zyx.nano.BacillusComma 1.0 | 7 | 7% | 8 |
| sam.Samspin 1.0 | 6 | 6% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 3 |

## Melee bench: F06

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 85.7 | 153 / 210 | 2.29 | 19.5% | 32115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 19.5% | 153 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.0% | 20 |
| gh.nano.Grofvuil 0.2 | 3.2 | 11.9% | 7 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 9.8% | 14 |
| fm.claire 1.7 | 5.0 | 9.6% | 2 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.2% | 5 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.1% | 6 |
| sample.SpinBot 1.0 | 8.7 | 5.8% | 5 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.0 | 26 / 35 | 5031 |
| 2 | 1 | 70.0 | 90.8 | 26 / 35 | 5057 |
| 3 | 1 | 70.7 | 87.0 | 26 / 35 | 6081 |
| 4 | 1 | 69.2 | 85.1 | 26 / 35 | 5324 |
| 5 | 1 | 68.7 | 84.4 | 24 / 35 | 5278 |
| 6 | 1 | 68.9 | 86.7 | 25 / 35 | 5344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 94% |
| oog.melee.CapuletDroid 1.1 | 31 | 94% |
| gh.nano.Grofvuil 0.2 | 23 | 96% |
| winamp32.micro.MicroMacro 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 9 | 78% |
| fm.claire 1.7 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 578. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 28% | 86 |
| gh.nano.Grofvuil 0.2 | 11 | 19% | 40 |
| arthord.NanoSatanMelee Beta | 9 | 16% | 21 |
| oog.melee.CapuletDroid 1.1 | 8 | 14% | 20 |
| fm.claire 1.7 | 6 | 10% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 15 |
| sample.SpinBot 1.0 | 3 | 5% | 4 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 44 over 6 battles (7.3 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.4 | 121 / 210 | 2.68 | 18.2% | 31925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.2% | 121 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.5% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.3% | 26 |
| mz.MicroGodMelee 1 | 3.5 | 13.3% | 13 |
| DBall.Anarchy 0.1 | 5.5 | 7.9% | 3 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 3 |
| el.JumpShoot 0.2 | 7.7 | 6.6% | 2 |
| acogdev.alpha 0.2 | 7.7 | 6.5% | 1 |
| fire219.CatBot 1.0 | 8.7 | 5.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.2 | 21 / 35 | 5525 |
| 2 | 1 | 67.2 | 78.4 | 18 / 35 | 5346 |
| 3 | 1 | 65.0 | 72.7 | 18 / 35 | 5001 |
| 4 | 1 | 69.0 | 83.2 | 22 / 35 | 5793 |
| 5 | 1 | 69.6 | 89.2 | 24 / 35 | 5379 |
| 6 | 1 | 67.2 | 81.6 | 18 / 35 | 4881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 56 | 95% |
| gh.micro.Gruweltje 0.7 | 45 | 73% |
| spinnercat.micro.Tyger 0.1 | 43 | 65% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 32 | 36% | 55 |
| gh.micro.Gruweltje 0.7 | 22 | 25% | 64 |
| mz.MicroGodMelee 1 | 15 | 17% | 62 |
| acogdev.alpha 0.2 | 5 | 6% | 5 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 9 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 73.2 | 102 / 210 | 3.41 | 16.6% | 29588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.8% | 54 |
| hadur117.micro.SaorOG4 0.1 | 1.7 | 16.6% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.7% | 21 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.3% | 5 |
| awesomeness.Elite 1.0 | 5.7 | 8.9% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 4 |
| germ.TheMind .2 | 6.2 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.6% | 8 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 72.1 | 17 / 35 | 4797 |
| 2 | 2 | 65.8 | 76.5 | 18 / 35 | 4751 |
| 3 | 2 | 64.2 | 71.4 | 14 / 35 | 4892 |
| 4 | 1 | 66.4 | 78.4 | 17 / 35 | 4941 |
| 5 | 2 | 64.5 | 68.6 | 17 / 35 | 4958 |
| 6 | 1 | 65.6 | 72.4 | 19 / 35 | 5249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 83% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| sample.Crazy 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 5 | 80% |
| germ.TheMind .2 | 4 | 50% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 50% |

Hadur died in 108 of 210 rounds, at a mean tick of 504. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 54% | 109 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 43 |
| germ.TheMind .2 | 13 | 12% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.1 | 151 / 210 | 1.98 | 20.3% | 31556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 20.3% | 151 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 17 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 4 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.0% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.6% | 1 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 3 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 11 |
| spinnercat.Omen 1.0 | 7.8 | 7.7% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.5 | 23 / 35 | 5853 |
| 2 | 1 | 69.7 | 84.4 | 25 / 35 | 4983 |
| 3 | 1 | 70.8 | 87.9 | 24 / 35 | 5351 |
| 4 | 1 | 71.1 | 91.7 | 27 / 35 | 4764 |
| 5 | 1 | 69.7 | 86.7 | 25 / 35 | 4877 |
| 6 | 1 | 72.3 | 94.3 | 27 / 35 | 5728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 78 | 92% |
| nz.jdc.nano.GridFu 1.0 | 36 | 94% |
| timmit.nano.TimDog 0.33 | 18 | 89% |
| maribo.IotaCT 1.1 | 10 | 80% |
| stelo.PatternRobot 1.0 | 9 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| ratosh.Wesco 1.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 17 | 29% | 72 |
| stelo.PatternRobot 1.0 | 11 | 19% | 21 |
| nz.jdc.nano.GridFu 1.0 | 10 | 17% | 48 |
| timmit.nano.TimDog 0.33 | 5 | 8% | 21 |
| maribo.IotaCT 1.1 | 5 | 8% | 21 |
| ratosh.Wesco 1.4 | 4 | 7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 6 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 0 |

## Melee bench: F10

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 90.6 | 173 / 210 | 1.84 | 21.6% | 40088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.6% | 173 |
| baal.nano.N 1.42 | 2.5 | 11.7% | 3 |
| tvv.nano.Polaris 1.2 | 2.5 | 12.1% | 17 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 1 |
| zyx.micro.Ant 1.1 | 4.8 | 9.6% | 6 |
| sanja.First 0.1 | 5.7 | 8.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 1 |
| cvt.Firsty 1.0 | 8.0 | 7.3% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.1 | 30 / 35 | 6385 |
| 2 | 1 | 71.3 | 88.6 | 26 / 35 | 6931 |
| 3 | 1 | 72.2 | 92.1 | 30 / 35 | 6520 |
| 4 | 1 | 71.5 | 92.1 | 30 / 35 | 6605 |
| 5 | 1 | 71.3 | 90.2 | 27 / 35 | 6719 |
| 6 | 1 | 71.8 | 88.9 | 30 / 35 | 6928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 46 | 98% |
| tvv.nano.Polaris 1.2 | 45 | 89% |
| zyx.micro.Ant 1.1 | 22 | 95% |
| sanja.First 0.1 | 21 | 100% |
| cvt.Firsty 1.0 | 20 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| sample.RamFire 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 7 | 19% | 51 |
| zyx.micro.Ant 1.1 | 7 | 19% | 43 |
| sample.RamFire 1.0 | 6 | 16% | 12 |
| cvt.Firsty 1.0 | 5 | 14% | 20 |
| baal.nano.N 1.42 | 3 | 8% | 32 |
| sanja.First 0.1 | 3 | 8% | 22 |
| Grystrion.TrackerWO 1.0 | 3 | 8% | 13 |
| amk.Punbot.Punbot 0.01 | 3 | 8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |

## Melee bench: F11

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 64.4 | 60 / 210 | 4.20 | 14.4% | 28543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 84 |
| hadur117.micro.SaorOG4 0.1 | 2.2 | 14.4% | 60 |
| cs.Wren 1.0 | 2.8 | 12.8% | 21 |
| js.PinBall 1.6 | 4.2 | 11.2% | 17 |
| mz.Cork 0.1 | 4.7 | 10.9% | 13 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 3 |
| evd.X1 0.01 | 6.8 | 8.0% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.9% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 6.3% | 5 |
| PSW.Relentless 0.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.1 | 55.2 | 7 / 35 | 4103 |
| 2 | 2 | 64.0 | 69.5 | 17 / 35 | 4971 |
| 3 | 2 | 60.9 | 61.9 | 9 / 35 | 4826 |
| 4 | 3 | 61.9 | 65.7 | 10 / 35 | 4919 |
| 5 | 1 | 64.0 | 72.7 | 9 / 35 | 5161 |
| 6 | 2 | 59.6 | 61.6 | 8 / 35 | 4563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 66 | 39% |
| cs.Wren 1.0 | 16 | 88% |
| mz.Cork 0.1 | 5 | 100% |
| evd.X1 0.01 | 5 | 60% |
| js.PinBall 1.6 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 86 | 57% | 123 |
| evd.X1 0.01 | 17 | 11% | 18 |
| mz.Cork 0.1 | 11 | 7% | 13 |
| js.PinBall 1.6 | 10 | 7% | 11 |
| cs.Wren 1.0 | 9 | 6% | 20 |
| joe.ADinosaur 1.0 | 7 | 5% | 8 |
| PSW.Relentless 0.1 | 7 | 5% | 6 |
| donjezza.Jezza 1.0 | 2 | 1% | 7 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.3 | 115 / 210 | 2.68 | 18.2% | 28735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 18.2% | 115 |
| myl.nano.Graviton 1.10 | 2.2 | 12.3% | 27 |
| ntc.Opposite 1.5 | 3.3 | 11.6% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 6 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.0% | 4 |
| disan.Chair 2.2.0 | 6.8 | 8.9% | 12 |
| DBall.NUKE 0.1 | 7.8 | 7.9% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 5.6% | 6 |
| pbg.R2D2 1.0 | 9.8 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.0 | 20 / 35 | 5336 |
| 2 | 1 | 66.0 | 78.7 | 14 / 35 | 4810 |
| 3 | 1 | 67.8 | 82.5 | 21 / 35 | 4893 |
| 4 | 1 | 63.9 | 72.1 | 16 / 35 | 4253 |
| 5 | 1 | 68.8 | 87.6 | 22 / 35 | 4807 |
| 6 | 1 | 68.3 | 86.0 | 22 / 35 | 4636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 86% |
| stelo.AreaTargetingBot 1.1 | 34 | 59% |
| ntc.Opposite 1.5 | 17 | 94% |
| disan.Chair 2.2.0 | 17 | 82% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| donjezza.Muncho 1.0 | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| DBall.NUKE 0.1 | 7 | 86% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 27 | 27% | 48 |
| myl.nano.Graviton 1.10 | 21 | 21% | 50 |
| ntc.Opposite 1.5 | 15 | 15% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 10 | 10% | 16 |
| disan.Chair 2.2.0 | 7 | 7% | 10 |
| donjezza.Muncho 1.0 | 2 | 2% | 10 |
| DBall.NUKE 0.1 | 2 | 2% | 8 |
| pbg.R2D2 1.0 | 2 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 71.6 | 94 / 210 | 3.56 | 15.6% | 24400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.3 | 15.6% | 94 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.5% | 42 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.8% | 19 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 9 |
| ejb.Polaris 1.0.1 | 6.0 | 11.0% | 10 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 73.0 | 16 / 35 | 3740 |
| 2 | 2 | 64.5 | 70.5 | 16 / 35 | 4115 |
| 3 | 1 | 65.4 | 74.9 | 14 / 35 | 4299 |
| 4 | 1 | 64.9 | 71.1 | 16 / 35 | 4302 |
| 5 | 1 | 65.3 | 73.7 | 20 / 35 | 4128 |
| 6 | 2 | 62.2 | 66.3 | 12 / 35 | 3816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 33 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 93% |
| oog.melee.Capulet 1.2 | 22 | 77% |
| yagami.Tidus 0.11 | 20 | 80% |
| ejb.Polaris 1.0.1 | 6 | 100% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 44 | 38% | 61 |
| yagami.Tidus 0.11 | 21 | 18% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 13% | 49 |
| kawigi.micro.Shiz 1.1 | 15 | 13% | 32 |
| step.nanoPri 1.0 | 8 | 7% | 8 |
| ejb.Polaris 1.0.1 | 7 | 6% | 11 |
| stelo.MirrorNano 1.3 | 3 | 3% | 6 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.6 | 142 / 210 | 2.75 | 17.7% | 26062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 17.7% | 142 |
| bzdp.Pansy 2.1 | 2.3 | 12.9% | 24 |
| ratosh.Nobo 0.21 | 3.5 | 11.6% | 8 |
| wee.Gem 1.8.4 | 4.0 | 11.3% | 18 |
| wompi.Quokka 1.6 | 4.7 | 10.8% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.7 | 8.4% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 76.8 | 22 / 35 | 4077 |
| 2 | 1 | 67.8 | 83.5 | 26 / 35 | 4683 |
| 3 | 1 | 67.5 | 82.5 | 24 / 35 | 4587 |
| 4 | 1 | 67.1 | 82.2 | 26 / 35 | 4185 |
| 5 | 1 | 67.6 | 85.7 | 26 / 35 | 4367 |
| 6 | 1 | 64.4 | 72.7 | 18 / 35 | 4163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 58 | 91% |
| wee.Gem 1.8.4 | 34 | 97% |
| ratosh.Nobo 0.21 | 21 | 90% |
| wompi.Quokka 1.6 | 20 | 100% |
| m3thos.Eva00 1.1 | 12 | 75% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 431. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 10 | 15% | 24 |
| m3thos.Eva00 1.1 | 10 | 15% | 23 |
| maribo.FollowFire 1 | 10 | 15% | 11 |
| bzdp.Pansy 2.1 | 8 | 12% | 53 |
| wee.Gem 1.8.4 | 8 | 12% | 45 |
| wompi.Quokka 1.6 | 7 | 10% | 18 |
| stelo.MyAgileRobot 0.2 | 7 | 10% | 14 |
| bayen.UbaMicro 1.4 | 4 | 6% | 12 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 6% | 7 |

## Melee bench: F15

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 83.9 | 58 / 210 | 2.45 | 20.2% | 49647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 20.7% | 139 |
| hadur117.micro.SaorOG4 0.1 | 1.8 | 20.2% | 58 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 8 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.0 | 8.8% | 2 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.1% | 2 |
| stelo.PianistNano 1.2 | 6.8 | 7.4% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.1% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 72.8 | 90.5 | 10 / 35 | 8315 |
| 2 | 2 | 71.2 | 81.9 | 11 / 35 | 8099 |
| 3 | 2 | 70.6 | 80.0 | 9 / 35 | 8290 |
| 4 | 2 | 71.5 | 84.1 | 9 / 35 | 7876 |
| 5 | 1 | 72.0 | 83.5 | 11 / 35 | 8663 |
| 6 | 2 | 71.6 | 83.5 | 8 / 35 | 8404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 139 | 24% |
| mz.NanoGod 2.02 | 14 | 79% |
| exauge.GateKeeper 1.1.121g | 5 | 80% |
| ayk.WallHugger 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1021. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 117 | 77% | 160 |
| mz.NanoGod 2.02 | 13 | 9% | 24 |
| exauge.GateKeeper 1.1.121g | 9 | 6% | 10 |
| stuff.Vlad 0.1 | 7 | 5% | 7 |
| stelo.PianistNano 1.2 | 3 | 2% | 5 |
| ayk.WallHugger 1.0 | 3 | 2% | 4 |

## Melee bench: F16

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 68.9 | 101 / 210 | 3.80 | 15.7% | 26489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 15.7% | 101 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.5% | 28 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.5% | 22 |
| bvh.micro.Freya 0.3 | 4.0 | 11.5% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.6% | 19 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.3% | 6 |
| conscience.Electron 1.3g | 7.0 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.3 | 6.6% | 10 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 69.5 | 17 / 35 | 4120 |
| 2 | 1 | 65.7 | 74.0 | 18 / 35 | 5109 |
| 3 | 1 | 63.9 | 72.1 | 15 / 35 | 4487 |
| 4 | 1 | 60.8 | 63.8 | 15 / 35 | 3892 |
| 5 | 1 | 65.0 | 71.7 | 20 / 35 | 4619 |
| 6 | 1 | 61.0 | 62.5 | 16 / 35 | 4262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 81% |
| dummy.micro.Sparrow 2.5 | 30 | 93% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 68% |
| bvh.micro.Freya 0.3 | 14 | 100% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 3 | 67% |

Hadur died in 109 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 19% | 55 |
| mn.nano.perceptual.Impact 1.3.0 | 21 | 19% | 21 |
| conscience.Electron 1.3g | 20 | 18% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 36 |
| dummy.micro.Sparrow 2.5 | 12 | 11% | 40 |
| dl.BetterWalls 1.0 | 9 | 8% | 11 |
| bvh.micro.Freya 0.3 | 7 | 6% | 15 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 10 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 85.2 | 152 / 210 | 2.33 | 21.2% | 41965 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.0 | 21.2% | 152 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.8% | 14 |
| sul.Lunar 1.1 | 3.0 | 11.9% | 18 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.6% | 9 |
| mme.NikeEnhanced 2.0 | 5.5 | 8.6% | 0 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.6% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.4% | 3 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.3% | 7 |
| sample.Corners 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 79.7 | 23 / 35 | 6924 |
| 2 | 1 | 69.8 | 79.0 | 23 / 35 | 6653 |
| 3 | 1 | 73.3 | 92.1 | 29 / 35 | 7394 |
| 4 | 1 | 71.4 | 84.4 | 26 / 35 | 7222 |
| 5 | 1 | 72.7 | 92.1 | 28 / 35 | 7010 |
| 6 | 1 | 70.6 | 84.1 | 23 / 35 | 6762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 44 | 89% |
| sul.Lunar 1.1 | 35 | 94% |
| supersample.SuperBoxBot 1.0 | 31 | 90% |
| dsw.StaticD 1.0 | 16 | 81% |
| sample.MyFirstRobot 1.0 | 13 | 92% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |

Hadur died in 61 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 31% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 23% | 53 |
| dsw.StaticD 1.0 | 10 | 16% | 27 |
| sul.Lunar 1.1 | 4 | 7% | 40 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 7% | 10 |
| tlp.ThreeLeggedPig 1 | 4 | 7% | 6 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 14 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 7 |
| sample.Corners 1.0 | 2 | 3% | 5 |

## Melee bench: F18

hadur117.micro.SaorOG4 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 74.4 | 99 / 210 | 3.30 | 17.4% | 36760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG4 0.1 | 1.2 | 17.4% | 99 |
| radnor.DoctorBob 1.42 | 1.8 | 14.2% | 46 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.7 | 12.2% | 28 |
| mld.Wisdom 1.0 | 4.2 | 11.1% | 13 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.2% | 8 |
| amz.NanoClone 1.41 | 5.2 | 10.0% | 5 |
| sample.Walls 1.0 | 7.8 | 7.3% | 4 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 2 |
| jangs.ns51 1.0 | 8.3 | 6.6% | 6 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 77.5 | 21 / 35 | 6646 |
| 2 | 2 | 63.7 | 66.0 | 13 / 35 | 5731 |
| 3 | 1 | 67.1 | 77.1 | 15 / 35 | 6168 |
| 4 | 1 | 68.5 | 81.3 | 19 / 35 | 6555 |
| 5 | 1 | 66.7 | 76.8 | 17 / 35 | 6137 |
| 6 | 1 | 63.4 | 67.9 | 14 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 79% |
| radnor.DoctorBob 1.42 | 42 | 62% |
| amz.NanoClone 1.41 | 12 | 83% |
| mld.Wisdom 1.0 | 12 | 83% |
| jangs.ns51 1.0 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 30 | 27% | 65 |
| radnor.DoctorBob 1.42 | 29 | 26% | 52 |
| mld.Wisdom 1.0 | 20 | 18% | 32 |
| KiraNL.Chupacabra 0.4 | 16 | 14% | 28 |
| jangs.ns51 1.0 | 5 | 5% | 11 |
| GarmBox.Oranges 1.0 | 5 | 5% | 5 |
| amz.NanoClone 1.41 | 4 | 4% | 10 |
| sample.Walls 1.0 | 2 | 2% | 5 |

