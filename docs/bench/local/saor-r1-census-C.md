# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.7 | 93.5 | 174 / 210 | 1.59 | 22.8% | 44567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.8% | 174 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 12 |
| mz.AntiGrav 1.0 | 3.0 | 13.4% | 5 |
| mld.Infinity 2.2 | 3.2 | 13.4% | 17 |
| amz.NanoClone 1.41 | 5.0 | 10.1% | 1 |
| sample.Walls 1.0 | 6.7 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 1 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 92.7 | 29 / 35 | 7618 |
| 2 | 1 | 74.2 | 96.2 | 32 / 35 | 7760 |
| 3 | 1 | 72.3 | 87.9 | 23 / 35 | 7316 |
| 4 | 1 | 73.7 | 93.7 | 29 / 35 | 6944 |
| 5 | 1 | 73.2 | 94.6 | 29 / 35 | 6835 |
| 6 | 1 | 75.0 | 95.9 | 32 / 35 | 8094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 100% |
| mld.Infinity 2.2 | 49 | 92% |
| radnor.DoctorBob 1.42 | 40 | 93% |
| jangs.ns51 1.0 | 8 | 88% |
| amz.NanoClone 1.41 | 7 | 86% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 44% | 84 |
| mld.Infinity 2.2 | 8 | 22% | 12 |
| amz.NanoClone 1.41 | 5 | 14% | 10 |
| mz.AntiGrav 1.0 | 3 | 8% | 76 |
| jangs.ns51 1.0 | 3 | 8% | 9 |
| GarmBox.Oranges 1.0 | 1 | 3% | 4 |
| sample.Walls 1.0 | 0 | 0% | 7 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.5 | 156 / 210 | 1.86 | 19.8% | 31482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.8% | 156 |
| oog.melee.Mercutio 1.0 | 2.0 | 14.5% | 32 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 4 |
| maribo.melee.BMV 0.1 | 4.2 | 10.0% | 1 |
| zyx.nano.Ant 1.1 | 5.5 | 8.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 8.9% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 7.9% | 5 |
| fullsail.SweetTea 1.1 | 8.0 | 7.1% | 5 |
| bzdp.BoxCar 2.0 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 92.1 | 25 / 35 | 5250 |
| 2 | 1 | 69.4 | 91.1 | 26 / 35 | 5209 |
| 3 | 1 | 67.3 | 83.2 | 23 / 35 | 4942 |
| 4 | 1 | 68.7 | 89.2 | 25 / 35 | 4849 |
| 5 | 1 | 71.6 | 95.2 | 30 / 35 | 5704 |
| 6 | 1 | 71.0 | 92.1 | 27 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 95 | 78% |
| mld.DustBunny 3.8 | 38 | 97% |
| djdjdj.NanoSkunk10 1.0 | 17 | 88% |
| maribo.melee.BMV 0.1 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 65% | 119 |
| mld.DustBunny 3.8 | 6 | 11% | 34 |
| maribo.melee.BMV 0.1 | 6 | 11% | 11 |
| zyx.nano.Ant 1.1 | 4 | 7% | 7 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 17 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 11 |
| fullsail.SweetTea 1.1 | 0 | 0% | 8 |

## Melee bench: F03

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 88.9 | 156 / 210 | 2.00 | 21.3% | 38902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.3% | 156 |
| myl.micro.Troodon 1.10 | 2.2 | 13.8% | 24 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.2% | 8 |
| cb.nano.Insomnia 1.0 | 5.0 | 9.6% | 9 |
| fm.mammillarias 1.3 | 6.0 | 9.1% | 3 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 1 |
| sample.Fire 1.0 | 9.3 | 4.6% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.0 | 23 / 35 | 6223 |
| 2 | 1 | 71.7 | 87.6 | 26 / 35 | 6511 |
| 3 | 1 | 70.7 | 87.0 | 25 / 35 | 6209 |
| 4 | 1 | 72.4 | 90.2 | 28 / 35 | 6847 |
| 5 | 1 | 72.1 | 92.7 | 27 / 35 | 6502 |
| 6 | 1 | 72.2 | 90.2 | 27 / 35 | 6610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 49 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 42 | 100% |
| myl.nano.KomoriNinja 1.1 | 25 | 92% |
| cb.nano.Insomnia 1.0 | 25 | 80% |
| sp.Nanos.Ember 1.1 | 14 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 83% |
| fm.mammillarias 1.3 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 674. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 14 | 26% | 68 |
| cb.nano.Insomnia 1.0 | 11 | 20% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 17% | 38 |
| myl.nano.KomoriNinja 1.1 | 7 | 13% | 43 |
| fm.mammillarias 1.3 | 6 | 11% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 9% | 11 |
| sample.Fire 1.0 | 2 | 4% | 6 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 19 |
| sample.Tracker 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.3 | 166 / 210 | 1.79 | 21.6% | 39893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.6% | 166 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.3% | 10 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.8% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.0% | 1 |
| tj.zombie1n 1.0.1 | 5.2 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 8.7% | 10 |
| yk.JahMicro 1.0 | 6.5 | 8.4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 88.3 | 26 / 35 | 6508 |
| 2 | 1 | 72.9 | 96.8 | 32 / 35 | 6857 |
| 3 | 1 | 70.7 | 88.9 | 24 / 35 | 6242 |
| 4 | 1 | 72.3 | 91.7 | 31 / 35 | 6802 |
| 5 | 1 | 71.4 | 91.1 | 27 / 35 | 6556 |
| 6 | 1 | 71.7 | 90.8 | 26 / 35 | 6928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 65 | 94% |
| stelo.SoJNanoMelee 1.1 | 39 | 87% |
| tvv.micro.Antares 1.1.1 | 23 | 91% |
| tj.zombie1n 1.0.1 | 23 | 96% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 92% |
| yk.JahMicro 1.0 | 7 | 86% |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 36% | 83 |
| stelo.SoJNanoMelee 1.1 | 9 | 20% | 31 |
| tvv.micro.Antares 1.1.1 | 5 | 11% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 11% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 7% | 24 |
| yk.JahMicro 1.0 | 3 | 7% | 7 |
| repositorio.NanoStep 1.0 | 1 | 2% | 9 |
| tj.zombie1n 1.0.1 | 1 | 2% | 8 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 71.2 | 101 / 210 | 3.60 | 16.3% | 29565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 16.3% | 101 |
| oog.melee.Corsair 1.0 | 2.2 | 13.1% | 44 |
| ahf.NanoAndrew .4 | 3.2 | 11.4% | 24 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.2% | 20 |
| EBBU.Sim2 1.02 | 5.2 | 9.9% | 3 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 8 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.0% | 6 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.9% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.7 | 17 / 35 | 5159 |
| 2 | 1 | 65.7 | 74.0 | 18 / 35 | 5144 |
| 3 | 1 | 63.3 | 67.3 | 16 / 35 | 4945 |
| 4 | 1 | 62.9 | 69.5 | 17 / 35 | 4661 |
| 5 | 1 | 62.2 | 66.3 | 15 / 35 | 4685 |
| 6 | 1 | 65.8 | 77.1 | 18 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 34 | 56% |
| ahf.NanoAndrew .4 | 31 | 97% |
| simonton.nano.MeleeSeed 1.8 | 22 | 86% |
| EBBU.Sim2 1.02 | 14 | 100% |
| sam.Samspin 1.0 | 12 | 83% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 438. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 26% | 57 |
| bwbaugh.nano.Tirunculus 0.0.0a | 19 | 17% | 20 |
| simonton.nano.MeleeSeed 1.8 | 18 | 16% | 38 |
| sam.Samspin 1.0 | 11 | 10% | 17 |
| robar.nano.Assertive_Melee 0.2 | 11 | 10% | 13 |
| zyx.nano.BacillusComma 1.0 | 10 | 9% | 12 |
| ahf.NanoAndrew .4 | 7 | 6% | 35 |
| EBBU.Sim2 1.02 | 5 | 4% | 16 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.9 | 154 / 210 | 2.09 | 19.7% | 32611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.7% | 154 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 22 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.4% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5.2 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.4% | 1 |
| fm.claire 1.7 | 6.2 | 8.4% | 0 |
| sample.SpinBot 1.0 | 8.3 | 6.9% | 2 |
| pa.Improved 1.0 | 9.0 | 6.5% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.5 | 24 / 35 | 5144 |
| 2 | 1 | 70.2 | 90.2 | 25 / 35 | 5847 |
| 3 | 1 | 70.1 | 90.8 | 28 / 35 | 5422 |
| 4 | 1 | 68.8 | 85.1 | 26 / 35 | 5315 |
| 5 | 1 | 69.5 | 90.2 | 25 / 35 | 5279 |
| 6 | 1 | 69.8 | 87.6 | 26 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 93% |
| oog.melee.CapuletDroid 1.1 | 35 | 83% |
| gh.nano.Grofvuil 0.2 | 25 | 100% |
| arthord.NanoSatanMelee Beta | 15 | 93% |
| sample.SpinBot 1.0 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| fm.claire 1.7 | 6 | 100% |
| pa.Improved 1.0 | 5 | 80% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 14 | 23% | 22 |
| d414.nano.Quantum 1.0.0 | 13 | 22% | 69 |
| gh.nano.Grofvuil 0.2 | 11 | 18% | 46 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 21 |
| pa.Improved 1.0 | 4 | 7% | 12 |
| fm.claire 1.7 | 3 | 5% | 11 |
| sample.SpinBot 1.0 | 3 | 5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 6 |
| kurios.DOSexe .9b | 1 | 2% | 12 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.9 | 97 / 210 | 2.36 | 18.6% | 34186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 18.6% | 97 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.2% | 49 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.5 | 13.2% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 5 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.7% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.2 | 6.2% | 0 |
| acogdev.alpha 0.2 | 8.2 | 6.3% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 13 / 35 | 6498 |
| 2 | 1 | 69.9 | 92.1 | 20 / 35 | 5726 |
| 3 | 1 | 67.6 | 81.6 | 14 / 35 | 5493 |
| 4 | 1 | 68.0 | 85.1 | 15 / 35 | 5349 |
| 5 | 1 | 67.7 | 79.7 | 16 / 35 | 5775 |
| 6 | 1 | 67.9 | 84.8 | 19 / 35 | 5345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 57 | 86% |
| mz.MicroGodMelee 1 | 40 | 53% |
| gh.micro.Gruweltje 0.7 | 36 | 22% |
| DBall.Anarchy 0.1 | 12 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 46 | 41% | 63 |
| mz.MicroGodMelee 1 | 32 | 28% | 56 |
| spinnercat.micro.Tyger 0.1 | 19 | 17% | 55 |
| DBall.Anarchy 0.1 | 5 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 10 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 3 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 77.4 | 134 / 210 | 3.03 | 17.7% | 31813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.2 | 17.7% | 134 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.4% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 12.8% | 23 |
| qualidafial.MajorDick 1.0.1 | 4.2 | 9.6% | 9 |
| germ.TheMind .2 | 5.2 | 9.0% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 7.9% | 4 |
| stelo.UntouchableNano 1.3 | 8.2 | 7.2% | 4 |
| sample.Crazy 1.0 | 8.3 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 67.9 | 17 / 35 | 5252 |
| 2 | 1 | 69.0 | 84.8 | 27 / 35 | 5276 |
| 3 | 1 | 65.1 | 72.7 | 24 / 35 | 5055 |
| 4 | 1 | 66.0 | 74.9 | 21 / 35 | 5188 |
| 5 | 1 | 68.7 | 84.8 | 24 / 35 | 5530 |
| 6 | 1 | 67.6 | 79.4 | 21 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 92% |
| simonton.nano.WeekendObsession_Melee 1.0 | 26 | 88% |
| germ.TheMind .2 | 10 | 90% |
| sample.Crazy 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |

Hadur died in 77 of 210 rounds, at a mean tick of 421. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 45% | 116 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 19% | 26 |
| germ.TheMind .2 | 6 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 5 | 6% | 10 |
| awesomeness.Elite 1.0 | 4 | 5% | 13 |
| qualidafial.MajorDick 1.0.1 | 3 | 4% | 8 |
| mym.EdgeStalker 1.0 | 3 | 4% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.8 | 162 / 210 | 1.83 | 20.5% | 30938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 20.5% | 162 |
| rz.HawkOnFire 0.1 | 2.0 | 13.2% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.5% | 8 |
| maribo.IotaCT 1.1 | 3.8 | 11.1% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 2 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.5% | 7 |
| ratosh.Wesco 1.4 | 7.0 | 8.5% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 7.6% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.5% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.8 | 29 / 35 | 5072 |
| 2 | 1 | 70.8 | 88.6 | 27 / 35 | 5118 |
| 3 | 1 | 71.7 | 92.1 | 27 / 35 | 5287 |
| 4 | 1 | 71.5 | 94.9 | 29 / 35 | 5184 |
| 5 | 1 | 69.6 | 87.3 | 25 / 35 | 4712 |
| 6 | 1 | 71.3 | 92.1 | 25 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 93% |
| nz.jdc.nano.GridFu 1.0 | 36 | 94% |
| timmit.nano.TimDog 0.33 | 18 | 89% |
| stelo.PatternRobot 1.0 | 13 | 85% |
| maribo.IotaCT 1.1 | 13 | 92% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 7 | 100% |
| ratosh.Wesco 1.4 | 6 | 67% |

Hadur died in 48 of 210 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 9 | 19% | 29 |
| stelo.PatternRobot 1.0 | 9 | 19% | 13 |
| nz.jdc.nano.GridFu 1.0 | 8 | 17% | 43 |
| rz.HawkOnFire 0.1 | 6 | 13% | 65 |
| ratosh.Wesco 1.4 | 6 | 13% | 11 |
| maribo.IotaCT 1.1 | 5 | 10% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 8% | 16 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |

## Melee bench: F10

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.1 | 178 / 210 | 1.71 | 21.5% | 37895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 21.5% | 178 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 21 |
| baal.nano.N 1.42 | 2.8 | 11.7% | 3 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.8% | 0 |
| zyx.micro.Ant 1.1 | 4.8 | 9.1% | 1 |
| sanja.First 0.1 | 5.8 | 8.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.1% | 0 |
| cvt.Firsty 1.0 | 8.7 | 6.9% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.1 | 30 / 35 | 6103 |
| 2 | 1 | 72.9 | 97.1 | 32 / 35 | 6588 |
| 3 | 1 | 71.5 | 92.4 | 30 / 35 | 6246 |
| 4 | 1 | 70.7 | 87.9 | 29 / 35 | 6215 |
| 5 | 1 | 71.8 | 94.3 | 29 / 35 | 6644 |
| 6 | 1 | 70.6 | 88.6 | 28 / 35 | 6099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 43 | 93% |
| baal.nano.N 1.42 | 43 | 98% |
| cvt.Firsty 1.0 | 25 | 96% |
| zyx.micro.Ant 1.1 | 21 | 100% |
| sanja.First 0.1 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 8 | 25% | 58 |
| zyx.micro.Ant 1.1 | 8 | 25% | 39 |
| Grystrion.TrackerWO 1.0 | 6 | 19% | 22 |
| sample.RamFire 1.0 | 4 | 13% | 7 |
| baal.nano.N 1.42 | 2 | 6% | 35 |
| cvt.Firsty 1.0 | 2 | 6% | 17 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sanja.First 0.1 | 0 | 0% | 17 |

## Melee bench: F11

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.0 | 73 / 210 | 3.79 | 15.2% | 29923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.4% | 74 |
| hadur117.micro.SaorC 0.1 | 1.5 | 15.2% | 73 |
| cs.Wren 1.0 | 3.0 | 13.0% | 25 |
| mz.Cork 0.1 | 4.0 | 11.6% | 15 |
| js.PinBall 1.6 | 5.2 | 10.4% | 7 |
| joe.ADinosaur 1.0 | 5.8 | 9.4% | 4 |
| evd.X1 0.01 | 7.0 | 7.8% | 5 |
| jsal.Jsalbot 1.0 | 8.0 | 6.7% | 4 |
| donjezza.Jezza 1.0 | 9.3 | 5.3% | 4 |
| PSW.Relentless 0.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 67.3 | 12 / 35 | 5013 |
| 2 | 2 | 57.6 | 56.2 | 8 / 35 | 4508 |
| 3 | 2 | 65.0 | 74.3 | 14 / 35 | 5208 |
| 4 | 1 | 62.9 | 68.3 | 11 / 35 | 5171 |
| 5 | 1 | 63.8 | 71.4 | 16 / 35 | 4900 |
| 6 | 1 | 64.7 | 76.5 | 12 / 35 | 5123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 78 | 51% |
| cs.Wren 1.0 | 17 | 94% |
| mz.Cork 0.1 | 10 | 80% |
| jsal.Jsalbot 1.0 | 4 | 50% |
| js.PinBall 1.6 | 3 | 100% |
| evd.X1 0.01 | 3 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 63 | 46% | 104 |
| cs.Wren 1.0 | 15 | 11% | 25 |
| evd.X1 0.01 | 15 | 11% | 17 |
| joe.ADinosaur 1.0 | 14 | 10% | 18 |
| mz.Cork 0.1 | 11 | 8% | 17 |
| js.PinBall 1.6 | 9 | 7% | 13 |
| jsal.Jsalbot 1.0 | 5 | 4% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.7 | 144 / 210 | 2.38 | 19.3% | 29804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.3% | 144 |
| myl.nano.Graviton 1.10 | 2.7 | 11.6% | 27 |
| ntc.Opposite 1.5 | 2.8 | 11.4% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.4% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 10 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.6% | 5 |
| DBall.NUKE 0.1 | 7.3 | 7.8% | 4 |
| disan.Chair 2.2.0 | 7.8 | 7.9% | 2 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 27 / 35 | 5150 |
| 2 | 1 | 67.6 | 81.9 | 23 / 35 | 4699 |
| 3 | 1 | 71.0 | 94.3 | 27 / 35 | 5234 |
| 4 | 1 | 68.6 | 83.2 | 22 / 35 | 5128 |
| 5 | 1 | 66.4 | 78.1 | 20 / 35 | 4842 |
| 6 | 1 | 67.7 | 81.6 | 25 / 35 | 4751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 37 | 86% |
| stelo.AreaTargetingBot 1.1 | 35 | 94% |
| ntc.Opposite 1.5 | 24 | 88% |
| DBall.NUKE 0.1 | 19 | 100% |
| donjezza.Muncho 1.0 | 15 | 93% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| disan.Chair 2.2.0 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 24% | 48 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 18% | 26 |
| ntc.Opposite 1.5 | 10 | 15% | 27 |
| stelo.AreaTargetingBot 1.1 | 5 | 7% | 34 |
| pbg.R2D2 1.0 | 4 | 6% | 11 |
| disan.Chair 2.2.0 | 3 | 4% | 6 |
| DBall.NUKE 0.1 | 2 | 3% | 15 |
| donjezza.Muncho 1.0 | 2 | 3% | 14 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 66.9 | 82 / 210 | 3.98 | 15.0% | 25731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.3 | 15.0% | 82 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.1% | 35 |
| oog.melee.Capulet 1.2 | 2.8 | 13.5% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 24 |
| yagami.Tidus 0.11 | 5.0 | 12.1% | 12 |
| ejb.Polaris 1.0.1 | 5.7 | 11.2% | 17 |
| stelo.MirrorNano 1.3 | 7.5 | 7.6% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 67.9 | 14 / 35 | 4156 |
| 2 | 1 | 66.0 | 76.5 | 14 / 35 | 4748 |
| 3 | 1 | 63.5 | 69.5 | 15 / 35 | 4145 |
| 4 | 2 | 60.9 | 62.5 | 10 / 35 | 4155 |
| 5 | 1 | 62.8 | 66.0 | 15 / 35 | 4154 |
| 6 | 2 | 61.8 | 59.0 | 14 / 35 | 4373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 28 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 79% |
| kawigi.micro.Shiz 1.1 | 22 | 100% |
| yagami.Tidus 0.11 | 17 | 100% |
| ejb.Polaris 1.0.1 | 9 | 44% |

Hadur died in 128 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 38% | 73 |
| ejb.Polaris 1.0.1 | 17 | 13% | 23 |
| yagami.Tidus 0.11 | 16 | 13% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 12% | 37 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 25 |
| kurios.DOSexe .9a | 10 | 8% | 9 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 78.4 | 134 / 210 | 2.95 | 17.5% | 27202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 134 |
| wee.Gem 1.8.4 | 2.8 | 12.3% | 34 |
| bzdp.Pansy 2.1 | 3.3 | 12.1% | 11 |
| wompi.Quokka 1.6 | 3.7 | 11.2% | 8 |
| ratosh.Nobo 0.21 | 4.3 | 11.3% | 8 |
| m3thos.Eva00 1.1 | 6.3 | 9.1% | 7 |
| bayen.UbaMicro 1.4 | 6.5 | 8.7% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 6.2% | 2 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.1 | 23 / 35 | 4277 |
| 2 | 1 | 65.9 | 76.5 | 22 / 35 | 4519 |
| 3 | 1 | 66.3 | 78.7 | 21 / 35 | 4554 |
| 4 | 1 | 66.2 | 78.4 | 22 / 35 | 4693 |
| 5 | 1 | 64.8 | 74.0 | 21 / 35 | 4351 |
| 6 | 1 | 68.6 | 85.4 | 25 / 35 | 4808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 93% |
| wee.Gem 1.8.4 | 41 | 98% |
| wompi.Quokka 1.6 | 25 | 92% |
| ratosh.Nobo 0.21 | 18 | 89% |
| bayen.UbaMicro 1.4 | 6 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 50% |

Hadur died in 77 of 210 rounds, at a mean tick of 420. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jeremyreeder.Vincent 2011.12.09 | 13 | 17% | 19 |
| bayen.UbaMicro 1.4 | 12 | 16% | 27 |
| maribo.FollowFire 1 | 12 | 16% | 10 |
| wompi.Quokka 1.6 | 10 | 13% | 24 |
| bzdp.Pansy 2.1 | 9 | 12% | 45 |
| wee.Gem 1.8.4 | 9 | 12% | 42 |
| ratosh.Nobo 0.21 | 5 | 6% | 22 |
| stelo.MyAgileRobot 0.2 | 4 | 5% | 7 |
| m3thos.Eva00 1.1 | 3 | 4% | 12 |

## Melee bench: F15

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 84.1 | 81 / 210 | 2.43 | 19.6% | 44384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 19.1% | 106 |
| hadur117.micro.SaorC 0.1 | 1.5 | 19.6% | 81 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 18 |
| ayk.WallHugger 1.0 | 4.5 | 9.2% | 1 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 3 |
| stuff.Vlad 0.1 | 6.2 | 8.3% | 1 |
| stelo.PianistNano 1.2 | 6.7 | 7.6% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.0 | 81.3 | 12 / 35 | 7351 |
| 2 | 2 | 70.0 | 81.3 | 11 / 35 | 7390 |
| 3 | 2 | 69.6 | 80.0 | 12 / 35 | 7414 |
| 4 | 1 | 71.9 | 91.1 | 17 / 35 | 7388 |
| 5 | 1 | 71.2 | 85.1 | 14 / 35 | 7482 |
| 6 | 1 | 70.9 | 85.7 | 15 / 35 | 7359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 106 | 39% |
| drd.Dreadknoght 0.9 | 13 | 100% |
| mz.NanoGod 2.02 | 12 | 58% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| ayk.WallHugger 1.0 | 7 | 86% |
| stuff.Vlad 0.1 | 4 | 75% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 89 | 69% | 132 |
| mz.NanoGod 2.02 | 27 | 21% | 39 |
| exauge.GateKeeper 1.1.121g | 5 | 4% | 9 |
| ayk.WallHugger 1.0 | 3 | 2% | 12 |
| stelo.PianistNano 1.2 | 3 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 10 |

## Melee bench: F16

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 76.9 | 120 / 210 | 3.08 | 17.5% | 29702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 17.5% | 120 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.6% | 15 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.6% | 24 |
| bvh.micro.Freya 0.3 | 3.8 | 10.9% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.3 | 10.0% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.6% | 10 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 0 |
| ap.Frederick 1.1 | 8.2 | 7.0% | 8 |
| dl.BetterWalls 1.0 | 8.5 | 6.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 78.4 | 18 / 35 | 4898 |
| 2 | 1 | 64.8 | 70.8 | 20 / 35 | 4928 |
| 3 | 1 | 67.9 | 84.8 | 23 / 35 | 4955 |
| 4 | 1 | 64.8 | 72.7 | 20 / 35 | 4643 |
| 5 | 1 | 66.8 | 79.0 | 22 / 35 | 5133 |
| 6 | 1 | 66.6 | 75.9 | 17 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| dummy.micro.Sparrow 2.5 | 36 | 86% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 76% |
| bvh.micro.Freya 0.3 | 16 | 94% |
| ap.Frederick 1.1 | 11 | 100% |
| stelo.MirrorMicro 1.0 | 8 | 75% |
| conscience.Electron 1.3g | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 518. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 15 | 16% | 48 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 16% | 16 |
| conscience.Electron 1.3g | 14 | 15% | 19 |
| voidious.micro.BlitzBat 1.05 | 13 | 14% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 14% | 30 |
| stelo.MirrorMicro 1.0 | 8 | 9% | 21 |
| dl.BetterWalls 1.0 | 7 | 8% | 14 |
| bvh.micro.Freya 0.3 | 6 | 7% | 16 |

## Melee bench: F17

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 91.5 | 172 / 210 | 1.77 | 22.1% | 42493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 22.1% | 172 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.1% | 14 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 6 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 8 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.3% | 0 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 3 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.1% | 0 |
| sample.MyFirstRobot 1.0 | 8.3 | 5.8% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 9.0 | 5.3% | 2 |
| sample.Corners 1.0 | 9.5 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 89.8 | 28 / 35 | 7388 |
| 2 | 1 | 73.5 | 94.6 | 30 / 35 | 7249 |
| 3 | 1 | 70.4 | 85.1 | 26 / 35 | 6361 |
| 4 | 1 | 72.9 | 93.7 | 29 / 35 | 7223 |
| 5 | 1 | 71.6 | 88.6 | 28 / 35 | 6862 |
| 6 | 1 | 74.0 | 97.1 | 31 / 35 | 7410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 63 | 95% |
| sul.Lunar 1.1 | 51 | 100% |
| supersample.SuperBoxBot 1.0 | 24 | 88% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| dsw.StaticD 1.0 | 11 | 91% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| sample.Corners 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 16 | 41% | 79 |
| supersample.SuperBoxBot 1.0 | 13 | 33% | 33 |
| dsw.StaticD 1.0 | 5 | 13% | 22 |
| sample.MyFirstRobot 1.0 | 2 | 5% | 9 |
| sample.Corners 1.0 | 1 | 3% | 5 |
| mme.NikeEnhanced 2.0 | 1 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 3% | 2 |
| sul.Lunar 1.1 | 0 | 0% | 52 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F18

hadur117.micro.SaorC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 82.2 | 123 / 210 | 2.60 | 19.1% | 38854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorC 0.1 | 1.0 | 19.1% | 123 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 27 |
| mld.Wisdom 1.0 | 3.2 | 12.0% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.9% | 22 |
| KiraNL.Chupacabra 0.4 | 5.5 | 9.4% | 7 |
| amz.NanoClone 1.41 | 5.7 | 9.6% | 7 |
| sample.Walls 1.0 | 7.0 | 7.9% | 4 |
| GarmBox.Oranges 1.0 | 7.7 | 7.4% | 0 |
| jangs.ns51 1.0 | 9.2 | 5.6% | 4 |
| sample.Target 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.1 | 21 / 35 | 6591 |
| 2 | 1 | 69.0 | 83.5 | 21 / 35 | 6414 |
| 3 | 1 | 69.7 | 85.1 | 21 / 35 | 6806 |
| 4 | 1 | 69.4 | 83.5 | 21 / 35 | 6615 |
| 5 | 1 | 67.8 | 78.7 | 21 / 35 | 6177 |
| 6 | 1 | 67.5 | 77.5 | 18 / 35 | 6251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 53 | 89% |
| radnor.DoctorBob 1.42 | 38 | 82% |
| mld.Wisdom 1.0 | 17 | 65% |
| KiraNL.Chupacabra 0.4 | 11 | 73% |
| amz.NanoClone 1.41 | 8 | 88% |
| GarmBox.Oranges 1.0 | 7 | 100% |
| jangs.ns51 1.0 | 6 | 83% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 24 | 27% | 36 |
| radnor.DoctorBob 1.42 | 19 | 21% | 54 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 18% | 62 |
| KiraNL.Chupacabra 0.4 | 13 | 15% | 23 |
| amz.NanoClone 1.41 | 7 | 8% | 12 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| jangs.ns51 1.0 | 3 | 3% | 8 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |

