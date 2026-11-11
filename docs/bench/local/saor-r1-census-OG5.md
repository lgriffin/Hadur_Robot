# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 85.9 | 137 / 210 | 2.27 | 20.6% | 41137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.6% | 137 |
| mz.AntiGrav 1.0 | 2.7 | 14.6% | 13 |
| radnor.DoctorBob 1.42 | 2.8 | 14.6% | 26 |
| mld.Infinity 2.2 | 3.5 | 13.5% | 27 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| GarmBox.Oranges 1.0 | 6.3 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.0% | 2 |
| sample.Walls 1.0 | 7.3 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.7% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 87.0 | 21 / 35 | 6836 |
| 2 | 1 | 70.7 | 81.3 | 20 / 35 | 6855 |
| 3 | 1 | 70.3 | 83.8 | 23 / 35 | 6306 |
| 4 | 1 | 72.7 | 91.4 | 25 / 35 | 6956 |
| 5 | 1 | 71.3 | 84.1 | 22 / 35 | 7205 |
| 6 | 1 | 72.4 | 87.6 | 26 / 35 | 6979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 65 | 94% |
| radnor.DoctorBob 1.42 | 40 | 83% |
| mld.Infinity 2.2 | 35 | 80% |
| amz.NanoClone 1.41 | 7 | 86% |
| jangs.ns51 1.0 | 5 | 80% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 35 | 47% | 73 |
| mz.AntiGrav 1.0 | 17 | 23% | 86 |
| mld.Infinity 2.2 | 9 | 12% | 17 |
| amz.NanoClone 1.41 | 5 | 7% | 11 |
| sample.Walls 1.0 | 3 | 4% | 8 |
| jangs.ns51 1.0 | 3 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 21 over 6 battles (3.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.0 | 151 / 210 | 2.17 | 19.0% | 29253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.0% | 151 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.1% | 34 |
| mld.DustBunny 3.8 | 3.0 | 13.6% | 11 |
| maribo.melee.BMV 0.1 | 4.0 | 10.5% | 4 |
| zyx.nano.Ant 1.1 | 6.0 | 8.5% | 1 |
| fullsail.SweetTea 1.1 | 6.5 | 7.7% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.6% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 6.8% | 3 |
| bzdp.BoxCar 2.0 | 8.8 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.2 | 25 / 35 | 4858 |
| 2 | 1 | 69.9 | 91.1 | 27 / 35 | 5221 |
| 3 | 1 | 68.2 | 86.0 | 26 / 35 | 4541 |
| 4 | 1 | 69.0 | 86.3 | 26 / 35 | 4870 |
| 5 | 1 | 67.4 | 84.1 | 22 / 35 | 4743 |
| 6 | 1 | 68.7 | 85.4 | 25 / 35 | 5020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 91 | 89% |
| mld.DustBunny 3.8 | 51 | 88% |
| maribo.melee.BMV 0.1 | 12 | 92% |
| fullsail.SweetTea 1.1 | 5 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 21 | 35% | 100 |
| mld.DustBunny 3.8 | 15 | 25% | 62 |
| fullsail.SweetTea 1.1 | 7 | 12% | 15 |
| zyx.nano.Ant 1.1 | 5 | 8% | 7 |
| cs.Grudge 1.0 | 4 | 7% | 5 |
| maribo.melee.BMV 0.1 | 3 | 5% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 6 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |

## Melee bench: F03

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 82.1 | 126 / 210 | 2.61 | 19.1% | 34097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.1% | 126 |
| myl.micro.Troodon 1.10 | 2.3 | 14.1% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.2% | 27 |
| fm.mammillarias 1.3 | 5.3 | 9.8% | 3 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.8% | 9 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.2% | 1 |
| sample.Fire 1.0 | 8.8 | 5.0% | 2 |
| sample.Tracker 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 20 / 35 | 5260 |
| 2 | 1 | 69.1 | 83.2 | 24 / 35 | 5457 |
| 3 | 1 | 69.2 | 81.6 | 22 / 35 | 6123 |
| 4 | 1 | 68.5 | 80.6 | 19 / 35 | 5676 |
| 5 | 1 | 69.6 | 82.9 | 21 / 35 | 5772 |
| 6 | 1 | 68.7 | 79.7 | 20 / 35 | 5809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 44 | 89% |
| cb.nano.Insomnia 1.0 | 33 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 73% |
| myl.nano.KomoriNinja 1.1 | 28 | 89% |
| fm.mammillarias 1.3 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 24 | 29% | 40 |
| cb.nano.Insomnia 1.0 | 19 | 23% | 14 |
| myl.micro.Troodon 1.10 | 13 | 15% | 67 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 45 |
| fm.mammillarias 1.3 | 7 | 8% | 13 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 18 |
| sample.Fire 1.0 | 3 | 4% | 5 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 4 |

## Melee bench: F04

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 85.9 | 151 / 210 | 2.27 | 20.3% | 37696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.3% | 151 |
| tvv.micro.Antares 1.1.1 | 2.2 | 13.4% | 13 |
| kawigi.nano.Lib 1.0 | 2.8 | 12.7% | 10 |
| tj.zombie1n 1.0.1 | 4.8 | 9.0% | 7 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.6% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 6.2 | 8.3% | 5 |
| yk.JahMicro 1.0 | 6.5 | 7.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 7.9% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 84.8 | 22 / 35 | 5777 |
| 2 | 1 | 71.5 | 94.0 | 31 / 35 | 5837 |
| 3 | 1 | 68.7 | 78.7 | 22 / 35 | 6297 |
| 4 | 1 | 69.2 | 84.4 | 23 / 35 | 5947 |
| 5 | 1 | 69.7 | 81.0 | 23 / 35 | 6713 |
| 6 | 1 | 72.3 | 92.4 | 30 / 35 | 7125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 61 | 97% |
| stelo.SoJNanoMelee 1.1 | 30 | 77% |
| tvv.micro.Antares 1.1.1 | 22 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 100% |
| tj.zombie1n 1.0.1 | 12 | 83% |
| yk.JahMicro 1.0 | 11 | 100% |
| repositorio.NanoStep 1.0 | 5 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 17 | 29% | 79 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 38 |
| tvv.micro.Antares 1.1.1 | 7 | 12% | 35 |
| yk.JahMicro 1.0 | 5 | 8% | 10 |
| tj.zombie1n 1.0.1 | 5 | 8% | 8 |
| sample.VelociRobot 1.0 | 5 | 8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 16 |
| repositorio.NanoStep 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 20 over 6 battles (3.3 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.2 | 112 / 210 | 3.59 | 16.8% | 30787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.8% | 112 |
| oog.melee.Corsair 1.0 | 2.0 | 12.7% | 24 |
| ahf.NanoAndrew .4 | 3.3 | 11.4% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.1% | 22 |
| EBBU.Sim2 1.02 | 4.7 | 10.5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 9.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.7% | 6 |
| sam.Samspin 1.0 | 7.2 | 8.7% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 64.1 | 15 / 35 | 4643 |
| 2 | 1 | 65.3 | 69.8 | 17 / 35 | 5344 |
| 3 | 1 | 65.5 | 74.0 | 20 / 35 | 5174 |
| 4 | 1 | 65.5 | 72.7 | 20 / 35 | 4910 |
| 5 | 1 | 67.6 | 78.1 | 22 / 35 | 5617 |
| 6 | 1 | 64.5 | 68.6 | 18 / 35 | 5099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 44 | 93% |
| oog.melee.Corsair 1.0 | 39 | 82% |
| ahf.NanoAndrew .4 | 17 | 94% |
| EBBU.Sim2 1.02 | 9 | 89% |
| sam.Samspin 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 83% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 373. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 24 | 24% | 64 |
| robar.nano.Assertive_Melee 0.2 | 18 | 18% | 24 |
| oog.melee.Corsair 1.0 | 15 | 15% | 43 |
| zyx.nano.BacillusComma 1.0 | 11 | 11% | 13 |
| ahf.NanoAndrew .4 | 9 | 9% | 30 |
| EBBU.Sim2 1.02 | 8 | 8% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 8% | 6 |
| sam.Samspin 1.0 | 4 | 4% | 8 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 56 over 6 battles (9.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.1 | 156 / 210 | 1.80 | 20.2% | 31940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.2% | 156 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 27 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.8% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.3% | 9 |
| arthord.NanoSatanMelee Beta | 4.8 | 9.8% | 4 |
| fm.claire 1.7 | 6.2 | 8.5% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.3% | 3 |
| pa.Improved 1.0 | 8.3 | 6.5% | 0 |
| sample.SpinBot 1.0 | 9.3 | 5.5% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.5 | 30 / 35 | 5411 |
| 2 | 1 | 70.6 | 92.4 | 28 / 35 | 5351 |
| 3 | 1 | 70.9 | 93.7 | 26 / 35 | 5414 |
| 4 | 1 | 70.8 | 91.7 | 28 / 35 | 5619 |
| 5 | 1 | 67.4 | 83.8 | 19 / 35 | 5061 |
| 6 | 1 | 70.3 | 94.3 | 25 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 86% |
| oog.melee.CapuletDroid 1.1 | 46 | 91% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| arthord.NanoSatanMelee Beta | 19 | 95% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 33% | 86 |
| oog.melee.CapuletDroid 1.1 | 10 | 19% | 20 |
| fm.claire 1.7 | 9 | 17% | 15 |
| arthord.NanoSatanMelee Beta | 8 | 15% | 26 |
| gh.nano.Grofvuil 0.2 | 6 | 11% | 35 |
| kurios.DOSexe .9b | 2 | 4% | 7 |
| pa.Improved 1.0 | 1 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 13 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 104 / 210 | 2.69 | 17.9% | 32052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.9% | 104 |
| gh.micro.Gruweltje 0.7 | 2.2 | 15.0% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.4% | 41 |
| mz.MicroGodMelee 1 | 3.8 | 12.7% | 14 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.0 | 8.0% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.6% | 3 |
| fire219.CatBot 1.0 | 8.5 | 6.1% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.8% | 1 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.5 | 20 / 35 | 6135 |
| 2 | 1 | 64.7 | 71.1 | 12 / 35 | 5444 |
| 3 | 1 | 68.8 | 85.7 | 20 / 35 | 5298 |
| 4 | 1 | 67.6 | 81.9 | 17 / 35 | 5514 |
| 5 | 1 | 66.6 | 78.4 | 16 / 35 | 5099 |
| 6 | 1 | 66.2 | 80.0 | 19 / 35 | 4562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 58% |
| mz.MicroGodMelee 1 | 43 | 93% |
| gh.micro.Gruweltje 0.7 | 37 | 62% |
| el.JumpShoot 0.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 36% | 67 |
| gh.micro.Gruweltje 0.7 | 34 | 32% | 65 |
| mz.MicroGodMelee 1 | 14 | 13% | 50 |
| caimano.Furia_Ceca 0.22 | 6 | 6% | 9 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 67.9 | 83 / 210 | 3.89 | 15.4% | 27931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.5 | 15.4% | 83 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 14.3% | 38 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 13 |
| germ.TheMind .2 | 5.0 | 9.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 6.3 | 8.9% | 9 |
| stelo.UntouchableNano 1.3 | 8.0 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.8 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 70.2 | 15 / 35 | 4744 |
| 2 | 1 | 63.2 | 69.2 | 15 / 35 | 4490 |
| 3 | 3 | 60.8 | 61.6 | 12 / 35 | 4519 |
| 4 | 1 | 64.6 | 72.1 | 17 / 35 | 4639 |
| 5 | 1 | 62.7 | 66.3 | 12 / 35 | 4837 |
| 6 | 2 | 63.3 | 68.3 | 12 / 35 | 4702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 63 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 75% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 67% |
| sample.Crazy 1.0 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 50% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| germ.TheMind .2 | 3 | 33% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 59 | 46% | 100 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 22% | 38 |
| germ.TheMind .2 | 11 | 9% | 13 |
| stelo.UntouchableNano 1.3 | 8 | 6% | 14 |
| awesomeness.Elite 1.0 | 7 | 6% | 16 |
| lrem.micro.MoggFanatic 0.2 | 5 | 4% | 9 |
| mym.EdgeStalker 1.0 | 4 | 3% | 4 |
| qualidafial.MajorDick 1.0.1 | 3 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 8 |

## Melee bench: F09

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.8 | 153 / 210 | 2.19 | 20.1% | 32273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.1% | 153 |
| rz.HawkOnFire 0.1 | 2.0 | 14.0% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 12.5% | 10 |
| maribo.IotaCT 1.1 | 4.0 | 11.2% | 8 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.5% | 8 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 8.9% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 8.0% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 6.9% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 86.7 | 25 / 35 | 5436 |
| 2 | 1 | 71.0 | 89.2 | 26 / 35 | 5397 |
| 3 | 1 | 70.9 | 87.6 | 27 / 35 | 5412 |
| 4 | 1 | 71.9 | 92.4 | 29 / 35 | 5243 |
| 5 | 1 | 70.7 | 85.1 | 25 / 35 | 5581 |
| 6 | 1 | 68.4 | 79.7 | 21 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 70 | 96% |
| nz.jdc.nano.GridFu 1.0 | 39 | 100% |
| timmit.nano.TimDog 0.33 | 21 | 86% |
| maribo.IotaCT 1.1 | 18 | 83% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| ratosh.Wesco 1.4 | 6 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 524. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 12 | 21% | 63 |
| ratosh.Wesco 1.4 | 9 | 16% | 14 |
| nz.jdc.nano.GridFu 1.0 | 8 | 14% | 50 |
| timmit.nano.TimDog 0.33 | 8 | 14% | 24 |
| maribo.IotaCT 1.1 | 6 | 11% | 22 |
| stelo.PatternRobot 1.0 | 5 | 9% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 7 |
| rrh.Iwillfindyou 2.0 | 3 | 5% | 3 |
| spinnercat.Omen 1.0 | 2 | 4% | 7 |

## Melee bench: F10

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.6 | 157 / 210 | 2.02 | 20.8% | 38031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.8% | 157 |
| baal.nano.N 1.42 | 2.3 | 12.0% | 9 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.6% | 11 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.9% | 4 |
| zyx.micro.Ant 1.1 | 5.2 | 9.5% | 11 |
| sanja.First 0.1 | 5.3 | 9.0% | 5 |
| cvt.Firsty 1.0 | 7.2 | 7.9% | 9 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.5 | 7.0% | 4 |
| sample.RamFire 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 28 / 35 | 6487 |
| 2 | 1 | 70.9 | 90.2 | 26 / 35 | 6289 |
| 3 | 1 | 69.9 | 86.0 | 22 / 35 | 6628 |
| 4 | 1 | 70.8 | 89.5 | 28 / 35 | 6196 |
| 5 | 1 | 71.1 | 89.8 | 29 / 35 | 6300 |
| 6 | 1 | 69.5 | 83.2 | 24 / 35 | 6131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 38 | 95% |
| cvt.Firsty 1.0 | 33 | 85% |
| tvv.nano.Polaris 1.2 | 31 | 97% |
| sanja.First 0.1 | 25 | 92% |
| Grystrion.TrackerWO 1.0 | 18 | 89% |
| zyx.micro.Ant 1.1 | 14 | 86% |
| amk.Punbot.Punbot 0.01 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 17% | 36 |
| cvt.Firsty 1.0 | 8 | 15% | 30 |
| sanja.First 0.1 | 8 | 15% | 23 |
| Grystrion.TrackerWO 1.0 | 8 | 15% | 19 |
| baal.nano.N 1.42 | 6 | 11% | 39 |
| amk.Punbot.Punbot 0.01 | 6 | 11% | 6 |
| tvv.nano.Polaris 1.2 | 5 | 9% | 46 |
| sample.RamFire 1.0 | 3 | 6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 68.0 | 76 / 210 | 3.88 | 15.0% | 28610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.6% | 88 |
| hadur117.micro.SaorOG5 0.1 | 1.7 | 15.0% | 76 |
| cs.Wren 1.0 | 3.0 | 12.7% | 16 |
| js.PinBall 1.6 | 4.3 | 11.1% | 11 |
| mz.Cork 0.1 | 4.5 | 11.0% | 11 |
| joe.ADinosaur 1.0 | 6.0 | 9.1% | 3 |
| evd.X1 0.01 | 7.3 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 7.7 | 7.3% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 2 |
| PSW.Relentless 0.1 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 66.3 | 8 / 35 | 4746 |
| 2 | 1 | 61.6 | 63.8 | 14 / 35 | 5175 |
| 3 | 1 | 64.2 | 72.1 | 19 / 35 | 4727 |
| 4 | 2 | 61.4 | 67.0 | 12 / 35 | 4330 |
| 5 | 2 | 62.0 | 67.6 | 12 / 35 | 4512 |
| 6 | 2 | 63.9 | 71.1 | 11 / 35 | 5120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 44% |
| cs.Wren 1.0 | 26 | 88% |
| mz.Cork 0.1 | 12 | 92% |
| jsal.Jsalbot 1.0 | 7 | 100% |
| js.PinBall 1.6 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 61 | 46% | 93 |
| joe.ADinosaur 1.0 | 19 | 14% | 22 |
| cs.Wren 1.0 | 17 | 13% | 35 |
| evd.X1 0.01 | 14 | 10% | 14 |
| mz.Cork 0.1 | 7 | 5% | 16 |
| js.PinBall 1.6 | 7 | 5% | 13 |
| PSW.Relentless 0.1 | 7 | 5% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 6 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.4 | 114 / 210 | 2.50 | 18.4% | 28245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.4% | 114 |
| ntc.Opposite 1.5 | 3.0 | 11.5% | 9 |
| myl.nano.Graviton 1.10 | 3.5 | 11.5% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.6% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.7% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 12 |
| disan.Chair 2.2.0 | 7.7 | 8.1% | 11 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 5 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 17 / 35 | 5166 |
| 2 | 1 | 66.5 | 82.2 | 18 / 35 | 4434 |
| 3 | 1 | 67.5 | 81.6 | 19 / 35 | 5165 |
| 4 | 1 | 67.3 | 84.1 | 20 / 35 | 4339 |
| 5 | 1 | 68.0 | 87.6 | 20 / 35 | 4453 |
| 6 | 1 | 67.6 | 82.9 | 20 / 35 | 4688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 74% |
| stelo.AreaTargetingBot 1.1 | 37 | 51% |
| ntc.Opposite 1.5 | 27 | 81% |
| disan.Chair 2.2.0 | 14 | 71% |
| donjezza.Muncho 1.0 | 13 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 86% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 26 | 26% | 51 |
| myl.nano.Graviton 1.10 | 21 | 21% | 49 |
| pfvicm.Sobieski 7.2.3b | 18 | 18% | 29 |
| ntc.Opposite 1.5 | 12 | 12% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 27 |
| disan.Chair 2.2.0 | 6 | 6% | 7 |
| DBall.NUKE 0.1 | 4 | 4% | 7 |
| pbg.R2D2 1.0 | 3 | 3% | 4 |
| donjezza.Muncho 1.0 | 2 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.3 | 89 / 210 | 3.31 | 15.7% | 23798 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 15.7% | 89 |
| oog.melee.Capulet 1.2 | 2.5 | 14.2% | 43 |
| kawigi.micro.Shiz 1.1 | 2.8 | 14.0% | 44 |
| yagami.Tidus 0.11 | 4.0 | 12.4% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.3% | 21 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 4 |
| stelo.MirrorNano 1.3 | 7.5 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 69.2 | 15 / 35 | 3747 |
| 2 | 1 | 66.1 | 79.7 | 18 / 35 | 3817 |
| 3 | 1 | 64.9 | 75.2 | 15 / 35 | 3926 |
| 4 | 1 | 65.5 | 77.1 | 16 / 35 | 3942 |
| 5 | 1 | 62.4 | 68.3 | 12 / 35 | 3919 |
| 6 | 1 | 65.5 | 76.2 | 13 / 35 | 4447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 86% |
| kawigi.micro.Shiz 1.1 | 26 | 62% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 4 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 41% | 76 |
| kawigi.micro.Shiz 1.1 | 27 | 22% | 37 |
| yagami.Tidus 0.11 | 15 | 12% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% | 37 |
| ejb.Polaris 1.0.1 | 5 | 4% | 12 |
| step.nanoPri 1.0 | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.8 | 145 / 210 | 2.55 | 18.1% | 26276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.1% | 145 |
| bzdp.Pansy 2.1 | 2.2 | 13.1% | 21 |
| ratosh.Nobo 0.21 | 3.3 | 11.6% | 8 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 19 |
| wompi.Quokka 1.6 | 5.3 | 10.4% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 9.6% | 7 |
| bayen.UbaMicro 1.4 | 7.0 | 8.3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.6% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.3 | 23 / 35 | 4178 |
| 2 | 1 | 64.7 | 74.9 | 21 / 35 | 4033 |
| 3 | 1 | 66.3 | 78.4 | 22 / 35 | 4519 |
| 4 | 1 | 68.1 | 84.1 | 24 / 35 | 4665 |
| 5 | 1 | 68.6 | 88.6 | 27 / 35 | 4458 |
| 6 | 1 | 68.9 | 90.5 | 28 / 35 | 4423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 65 | 94% |
| wee.Gem 1.8.4 | 40 | 98% |
| ratosh.Nobo 0.21 | 18 | 89% |
| m3thos.Eva00 1.1 | 18 | 89% |
| wompi.Quokka 1.6 | 7 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 445. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 14 | 22% | 67 |
| m3thos.Eva00 1.1 | 8 | 12% | 18 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 12% | 13 |
| maribo.FollowFire 1 | 8 | 12% | 10 |
| bayen.UbaMicro 1.4 | 7 | 11% | 16 |
| ratosh.Nobo 0.21 | 6 | 9% | 20 |
| wee.Gem 1.8.4 | 5 | 8% | 40 |
| wompi.Quokka 1.6 | 5 | 8% | 15 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 8 |

## Melee bench: F15

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 82.7 | 62 / 210 | 2.56 | 20.1% | 48601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 20.1% | 62 |
| wompi.Wallaby 5.1 | 1.7 | 20.4% | 137 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 7 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.6% | 3 |
| ayk.WallHugger 1.0 | 5.0 | 9.3% | 1 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.5% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 83.2 | 12 / 35 | 8456 |
| 2 | 1 | 71.8 | 84.1 | 11 / 35 | 7938 |
| 3 | 2 | 70.0 | 77.8 | 6 / 35 | 7714 |
| 4 | 2 | 71.6 | 83.2 | 7 / 35 | 8166 |
| 5 | 1 | 71.3 | 80.6 | 15 / 35 | 7991 |
| 6 | 1 | 72.2 | 87.3 | 11 / 35 | 8336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 130 | 28% |
| mz.NanoGod 2.02 | 13 | 85% |
| exauge.GateKeeper 1.1.121g | 10 | 70% |
| stelo.PianistNano 1.2 | 4 | 100% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 74% | 150 |
| mz.NanoGod 2.02 | 20 | 14% | 33 |
| ayk.WallHugger 1.0 | 8 | 5% | 11 |
| exauge.GateKeeper 1.1.121g | 8 | 5% | 10 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.4 | 112 / 210 | 3.21 | 16.8% | 26652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.8% | 112 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.4% | 27 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.7% | 21 |
| bvh.micro.Freya 0.3 | 4.5 | 11.3% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.7% | 17 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.1% | 8 |
| conscience.Electron 1.3g | 6.8 | 7.8% | 2 |
| ap.Frederick 1.1 | 8.2 | 6.7% | 7 |
| dl.BetterWalls 1.0 | 9.3 | 5.9% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.6 | 18 / 35 | 4288 |
| 2 | 1 | 67.6 | 85.1 | 23 / 35 | 4532 |
| 3 | 1 | 64.0 | 73.7 | 19 / 35 | 4002 |
| 4 | 1 | 65.8 | 75.2 | 18 / 35 | 4966 |
| 5 | 1 | 64.5 | 72.1 | 17 / 35 | 4509 |
| 6 | 1 | 64.4 | 72.1 | 17 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 71% |
| dummy.micro.Sparrow 2.5 | 34 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 28 | 86% |
| bvh.micro.Freya 0.3 | 13 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 485. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 35% | 69 |
| dummy.micro.Sparrow 2.5 | 16 | 16% | 52 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 13% | 41 |
| bvh.micro.Freya 0.3 | 7 | 7% | 12 |
| conscience.Electron 1.3g | 5 | 5% | 7 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 8 |
| dl.BetterWalls 1.0 | 3 | 3% | 5 |

## Melee bench: F17

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 87.5 | 151 / 210 | 2.13 | 21.4% | 41880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.4% | 151 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 23 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 9 |
| supersample.SuperBoxBot 1.0 | 3.7 | 11.2% | 18 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.4% | 2 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.7% | 5 |
| sample.MyFirstRobot 1.0 | 8.5 | 6.1% | 2 |
| sample.Corners 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 87.3 | 26 / 35 | 7169 |
| 2 | 1 | 71.8 | 88.9 | 24 / 35 | 6815 |
| 3 | 1 | 73.4 | 93.3 | 29 / 35 | 7656 |
| 4 | 1 | 69.2 | 78.1 | 19 / 35 | 6807 |
| 5 | 1 | 71.5 | 86.3 | 27 / 35 | 6854 |
| 6 | 1 | 71.7 | 90.8 | 26 / 35 | 6579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 43 | 91% |
| sul.Lunar 1.1 | 42 | 98% |
| supersample.SuperBoxBot 1.0 | 32 | 78% |
| sample.MyFirstRobot 1.0 | 16 | 94% |
| dsw.StaticD 1.0 | 10 | 90% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 5 | 80% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 24 | 38% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 19% | 52 |
| sul.Lunar 1.1 | 7 | 11% | 50 |
| dsw.StaticD 1.0 | 6 | 10% | 21 |
| mme.NikeEnhanced 2.0 | 4 | 6% | 12 |
| tlp.ThreeLeggedPig 1 | 4 | 6% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 7 |
| sample.Corners 1.0 | 1 | 2% | 3 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.2 | 119 / 210 | 2.88 | 18.4% | 36830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.4% | 119 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 26 |
| mld.Wisdom 1.0 | 3.3 | 12.1% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 12.1% | 23 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.6% | 7 |
| amz.NanoClone 1.41 | 5.3 | 10.3% | 10 |
| sample.Walls 1.0 | 7.5 | 7.2% | 9 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 1 |
| jangs.ns51 1.0 | 8.3 | 6.2% | 1 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 78.4 | 19 / 35 | 6449 |
| 2 | 1 | 69.4 | 88.3 | 25 / 35 | 5654 |
| 3 | 1 | 66.1 | 72.4 | 18 / 35 | 5774 |
| 4 | 1 | 67.6 | 77.1 | 18 / 35 | 6356 |
| 5 | 1 | 66.0 | 73.7 | 15 / 35 | 6120 |
| 6 | 1 | 69.7 | 85.1 | 24 / 35 | 6477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 83% |
| radnor.DoctorBob 1.42 | 30 | 77% |
| mld.Wisdom 1.0 | 25 | 84% |
| amz.NanoClone 1.41 | 11 | 91% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 527. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 22 | 24% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 22% | 64 |
| radnor.DoctorBob 1.42 | 19 | 21% | 39 |
| KiraNL.Chupacabra 0.4 | 15 | 16% | 27 |
| amz.NanoClone 1.41 | 10 | 11% | 20 |
| GarmBox.Oranges 1.0 | 3 | 3% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| sample.Walls 1.0 | 1 | 1% | 3 |

