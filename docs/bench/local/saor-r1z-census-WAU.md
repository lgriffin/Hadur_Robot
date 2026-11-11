# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 89.7 | 158 / 210 | 1.93 | 21.5% | 41950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.5% | 158 |
| radnor.DoctorBob 1.42 | 2.7 | 13.8% | 15 |
| mz.AntiGrav 1.0 | 3.0 | 13.6% | 15 |
| mld.Infinity 2.2 | 3.3 | 12.9% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 3 |
| GarmBox.Oranges 1.0 | 6.7 | 6.9% | 1 |
| sample.Walls 1.0 | 6.7 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.5 | 96.2 | 31 / 35 | 7951 |
| 2 | 1 | 68.0 | 78.7 | 19 / 35 | 5828 |
| 3 | 1 | 72.6 | 90.2 | 25 / 35 | 7154 |
| 4 | 1 | 72.6 | 89.5 | 26 / 35 | 7173 |
| 5 | 1 | 72.5 | 90.2 | 28 / 35 | 6846 |
| 6 | 1 | 73.4 | 93.3 | 29 / 35 | 6998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 79 | 94% |
| radnor.DoctorBob 1.42 | 38 | 87% |
| mld.Infinity 2.2 | 37 | 95% |
| amz.NanoClone 1.41 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 42% | 66 |
| mz.AntiGrav 1.0 | 14 | 26% | 73 |
| mld.Infinity 2.2 | 8 | 15% | 48 |
| amz.NanoClone 1.41 | 5 | 9% | 9 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| sample.Walls 1.0 | 0 | 0% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.6 | 134 / 210 | 2.11 | 19.1% | 32799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.1% | 134 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.4% | 50 |
| mld.DustBunny 3.8 | 3.8 | 12.2% | 13 |
| maribo.melee.BMV 0.1 | 3.8 | 10.9% | 3 |
| zyx.nano.Ant 1.1 | 5.2 | 9.0% | 0 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.5% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.0% | 3 |
| bzdp.BoxCar 2.0 | 8.0 | 7.0% | 0 |
| fullsail.SweetTea 1.1 | 8.7 | 6.3% | 2 |
| cs.Grudge 1.0 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 21 / 35 | 5610 |
| 2 | 1 | 65.1 | 75.6 | 17 / 35 | 4989 |
| 3 | 1 | 69.4 | 90.5 | 24 / 35 | 5563 |
| 4 | 1 | 71.5 | 94.9 | 30 / 35 | 5759 |
| 5 | 1 | 70.3 | 91.1 | 23 / 35 | 5727 |
| 6 | 1 | 68.8 | 87.6 | 19 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 65 | 74% |
| mld.DustBunny 3.8 | 60 | 87% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 100% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| fullsail.SweetTea 1.1 | 7 | 86% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 31 | 40% | 82 |
| mld.DustBunny 3.8 | 18 | 23% | 65 |
| maribo.melee.BMV 0.1 | 11 | 14% | 18 |
| zyx.nano.Ant 1.1 | 7 | 9% | 11 |
| fullsail.SweetTea 1.1 | 4 | 5% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 12 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 10 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 79.8 | 134 / 210 | 2.82 | 19.2% | 35477 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.2% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 9 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.2% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.8% | 13 |
| fm.mammillarias 1.3 | 5.8 | 9.1% | 4 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.3% | 5 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 80.3 | 23 / 35 | 6059 |
| 2 | 1 | 68.0 | 76.5 | 23 / 35 | 5748 |
| 3 | 1 | 70.7 | 87.0 | 24 / 35 | 6272 |
| 4 | 1 | 68.3 | 74.9 | 21 / 35 | 5943 |
| 5 | 1 | 65.7 | 69.5 | 18 / 35 | 5274 |
| 6 | 1 | 71.3 | 90.5 | 25 / 35 | 6181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 91% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| myl.nano.KomoriNinja 1.1 | 21 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 94% |
| sp.Nanos.Ember 1.1 | 12 | 92% |
| fm.mammillarias 1.3 | 9 | 100% |
| sample.Fire 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 22 | 29% | 65 |
| cb.nano.Insomnia 1.0 | 16 | 21% | 24 |
| myl.nano.KomoriNinja 1.1 | 9 | 12% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 12% | 27 |
| fm.mammillarias 1.3 | 7 | 9% | 12 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 21 |
| sample.Fire 1.0 | 4 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 8 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 86.8 | 148 / 210 | 2.19 | 20.7% | 39780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.7% | 148 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.0% | 13 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.5% | 16 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.1% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.7% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 8.8% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.1% | 5 |
| yk.JahMicro 1.0 | 6.7 | 8.0% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 6.8% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 76.5 | 22 / 35 | 6247 |
| 2 | 1 | 72.6 | 92.7 | 30 / 35 | 7231 |
| 3 | 1 | 70.1 | 85.1 | 23 / 35 | 6815 |
| 4 | 1 | 70.2 | 88.6 | 22 / 35 | 6407 |
| 5 | 1 | 70.2 | 85.4 | 22 / 35 | 6465 |
| 6 | 1 | 71.9 | 92.7 | 29 / 35 | 6615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 95% |
| stelo.SoJNanoMelee 1.1 | 40 | 88% |
| tvv.micro.Antares 1.1.1 | 25 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 20 | 80% |
| tj.zombie1n 1.0.1 | 10 | 90% |
| yk.JahMicro 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 50% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 31% | 79 |
| stelo.SoJNanoMelee 1.1 | 15 | 24% | 46 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 13% | 25 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 13% | 12 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 24 |
| yk.JahMicro 1.0 | 4 | 6% | 8 |
| repositorio.NanoStep 1.0 | 3 | 5% | 9 |
| tj.zombie1n 1.0.1 | 1 | 2% | 3 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 65.2 | 81 / 210 | 4.13 | 15.2% | 28603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.2% | 81 |
| oog.melee.Corsair 1.0 | 2.3 | 13.0% | 38 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.9% | 28 |
| ahf.NanoAndrew .4 | 3.3 | 11.8% | 25 |
| EBBU.Sim2 1.02 | 5.2 | 10.1% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.1% | 10 |
| sam.Samspin 1.0 | 6.8 | 9.2% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.5% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 73.0 | 19 / 35 | 5229 |
| 2 | 1 | 63.1 | 67.6 | 14 / 35 | 4756 |
| 3 | 1 | 64.4 | 74.0 | 14 / 35 | 4598 |
| 4 | 1 | 60.2 | 56.8 | 12 / 35 | 4655 |
| 5 | 2 | 59.1 | 54.6 | 11 / 35 | 4681 |
| 6 | 1 | 61.7 | 65.1 | 11 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 30 | 63% |
| simonton.nano.MeleeSeed 1.8 | 29 | 83% |
| ahf.NanoAndrew .4 | 15 | 93% |
| EBBU.Sim2 1.02 | 12 | 100% |
| sam.Samspin 1.0 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 29 | 22% | 48 |
| oog.melee.Corsair 1.0 | 24 | 19% | 46 |
| robar.nano.Assertive_Melee 0.2 | 18 | 14% | 23 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 12% | 20 |
| EBBU.Sim2 1.02 | 12 | 9% | 18 |
| zyx.nano.BacillusComma 1.0 | 11 | 9% | 13 |
| ahf.NanoAndrew .4 | 8 | 6% | 26 |
| sample.TrackFire 1.0 | 7 | 5% | 7 |
| sam.Samspin 1.0 | 5 | 4% | 9 |

## Melee bench: F06

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.2 | 134 / 210 | 2.24 | 19.3% | 32894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.3% | 134 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.7% | 45 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.5% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.0% | 12 |
| fm.claire 1.7 | 5.7 | 8.6% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.6% | 4 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 3 |
| sample.SpinBot 1.0 | 8.3 | 6.4% | 2 |
| pa.Improved 1.0 | 8.7 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.7 | 23 / 35 | 5452 |
| 2 | 1 | 67.6 | 79.4 | 20 / 35 | 5291 |
| 3 | 1 | 70.6 | 93.0 | 25 / 35 | 5690 |
| 4 | 1 | 70.0 | 88.3 | 24 / 35 | 5605 |
| 5 | 1 | 67.3 | 80.6 | 21 / 35 | 5059 |
| 6 | 1 | 68.6 | 84.1 | 21 / 35 | 5797 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 90 | 83% |
| oog.melee.CapuletDroid 1.1 | 27 | 100% |
| gh.nano.Grofvuil 0.2 | 11 | 82% |
| winamp32.micro.MicroMacro 1.0 | 8 | 75% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| fm.claire 1.7 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 45% | 104 |
| gh.nano.Grofvuil 0.2 | 11 | 14% | 22 |
| oog.melee.CapuletDroid 1.1 | 10 | 13% | 39 |
| winamp32.micro.MicroMacro 1.0 | 7 | 9% | 16 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 12 |
| fm.claire 1.7 | 4 | 5% | 5 |
| kurios.DOSexe .9b | 2 | 3% | 6 |
| sample.SpinBot 1.0 | 2 | 3% | 4 |
| pa.Improved 1.0 | 2 | 3% | 1 |

## Melee bench: F07

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.5 | 105 / 210 | 2.67 | 18.4% | 35246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.4% | 105 |
| gh.micro.Gruweltje 0.7 | 2.3 | 15.0% | 39 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.6% | 31 |
| mz.MicroGodMelee 1 | 3.5 | 13.0% | 29 |
| DBall.Anarchy 0.1 | 5.2 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.3 | 7.5% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.7% | 0 |
| acogdev.alpha 0.2 | 8.0 | 6.1% | 0 |
| mbro.Detektor3 0.1.1 | 8.3 | 5.9% | 1 |
| fire219.CatBot 1.0 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 17 / 35 | 6193 |
| 2 | 1 | 66.8 | 79.0 | 16 / 35 | 5582 |
| 3 | 1 | 69.4 | 83.5 | 20 / 35 | 6144 |
| 4 | 1 | 66.8 | 77.5 | 19 / 35 | 5591 |
| 5 | 1 | 69.5 | 87.0 | 20 / 35 | 6183 |
| 6 | 1 | 66.3 | 76.5 | 13 / 35 | 5553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 87% |
| mz.MicroGodMelee 1 | 36 | 67% |
| gh.micro.Gruweltje 0.7 | 35 | 57% |
| el.JumpShoot 0.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 30% | 58 |
| mz.MicroGodMelee 1 | 31 | 30% | 58 |
| spinnercat.micro.Tyger 0.1 | 21 | 20% | 54 |
| el.JumpShoot 0.2 | 6 | 6% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 11 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 8 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| fire219.CatBot 1.0 | 3 | 3% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 5 |

## Melee bench: F08

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 71.1 | 108 / 210 | 3.60 | 16.6% | 30273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.6% | 108 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.9% | 7 |
| germ.TheMind .2 | 4.7 | 9.6% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.5% | 7 |
| awesomeness.Elite 1.0 | 7.2 | 8.1% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 6 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.1 | 21 / 35 | 4939 |
| 2 | 1 | 64.3 | 68.3 | 15 / 35 | 5115 |
| 3 | 1 | 65.8 | 74.3 | 19 / 35 | 4973 |
| 4 | 1 | 66.3 | 76.5 | 20 / 35 | 4897 |
| 5 | 1 | 62.5 | 61.6 | 14 / 35 | 5091 |
| 6 | 1 | 64.6 | 68.9 | 19 / 35 | 5258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 96% |
| qualidafial.MajorDick 1.0.1 | 8 | 100% |
| germ.TheMind .2 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| awesomeness.Elite 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 67% |

Hadur died in 102 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 46 | 45% | 102 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 17% | 37 |
| germ.TheMind .2 | 9 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 9 | 9% | 10 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 8 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 11 |
| mym.EdgeStalker 1.0 | 4 | 4% | 5 |
| sample.Crazy 1.0 | 3 | 3% | 9 |
| awesomeness.Elite 1.0 | 2 | 2% | 9 |

## Melee bench: F09

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.5 | 154 / 210 | 2.03 | 20.0% | 30560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 20.0% | 154 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 8 |
| timmit.nano.TimDog 0.33 | 4.8 | 10.1% | 11 |
| maribo.IotaCT 1.1 | 5.0 | 10.1% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.3% | 4 |
| ratosh.Wesco 1.4 | 7.7 | 8.1% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 7.4% | 2 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.6 | 25 / 35 | 5165 |
| 2 | 1 | 68.8 | 84.4 | 22 / 35 | 4899 |
| 3 | 1 | 68.8 | 83.2 | 20 / 35 | 4959 |
| 4 | 1 | 71.3 | 91.4 | 28 / 35 | 4984 |
| 5 | 1 | 71.9 | 93.7 | 29 / 35 | 5440 |
| 6 | 1 | 70.8 | 89.8 | 30 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 74 | 97% |
| nz.jdc.nano.GridFu 1.0 | 29 | 100% |
| timmit.nano.TimDog 0.33 | 21 | 62% |
| stelo.PatternRobot 1.0 | 17 | 94% |
| ratosh.Wesco 1.4 | 10 | 90% |
| maribo.IotaCT 1.1 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 14 | 25% | 30 |
| rz.HawkOnFire 0.1 | 11 | 20% | 73 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 14% | 14 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 45 |
| ratosh.Wesco 1.4 | 7 | 13% | 15 |
| stelo.PatternRobot 1.0 | 5 | 9% | 16 |
| maribo.IotaCT 1.1 | 3 | 5% | 10 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.7 | 179 / 210 | 1.48 | 22.2% | 40792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 22.2% | 179 |
| tvv.nano.Polaris 1.2 | 2.7 | 11.5% | 8 |
| baal.nano.N 1.42 | 2.7 | 11.9% | 9 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.9% | 1 |
| sanja.First 0.1 | 5.5 | 8.9% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 7.8% | 0 |
| cvt.Firsty 1.0 | 7.8 | 7.2% | 6 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.0% | 0 |
| sample.RamFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 99.4 | 33 / 35 | 7051 |
| 2 | 1 | 71.3 | 90.5 | 30 / 35 | 6329 |
| 3 | 1 | 71.9 | 94.3 | 30 / 35 | 6679 |
| 4 | 1 | 71.5 | 89.5 | 26 / 35 | 7008 |
| 5 | 1 | 73.0 | 96.8 | 29 / 35 | 6911 |
| 6 | 1 | 72.9 | 97.5 | 31 / 35 | 6814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 100% |
| baal.nano.N 1.42 | 39 | 90% |
| sanja.First 0.1 | 26 | 96% |
| cvt.Firsty 1.0 | 25 | 88% |
| zyx.micro.Ant 1.1 | 18 | 89% |
| amk.Punbot.Punbot 0.01 | 18 | 100% |
| Grystrion.TrackerWO 1.0 | 17 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| baal.nano.N 1.42 | 8 | 26% | 43 |
| zyx.micro.Ant 1.1 | 7 | 23% | 33 |
| tvv.nano.Polaris 1.2 | 5 | 16% | 60 |
| cvt.Firsty 1.0 | 4 | 13% | 21 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 11 |
| sanja.First 0.1 | 2 | 6% | 27 |
| sample.RamFire 1.0 | 2 | 6% | 3 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 71.9 | 103 / 210 | 3.53 | 16.6% | 33035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.6% | 103 |
| kc.micro.Figment 1.0 | 2.3 | 14.2% | 46 |
| cs.Wren 1.0 | 3.2 | 12.5% | 14 |
| mz.Cork 0.1 | 3.8 | 11.7% | 13 |
| js.PinBall 1.6 | 4.8 | 10.9% | 18 |
| joe.ADinosaur 1.0 | 6.0 | 9.0% | 4 |
| evd.X1 0.01 | 7.0 | 8.0% | 3 |
| jsal.Jsalbot 1.0 | 7.8 | 6.7% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 62.5 | 17 / 35 | 5000 |
| 2 | 1 | 64.4 | 71.7 | 14 / 35 | 5303 |
| 3 | 1 | 66.9 | 77.1 | 20 / 35 | 5932 |
| 4 | 1 | 65.6 | 74.9 | 18 / 35 | 5237 |
| 5 | 1 | 69.1 | 81.3 | 22 / 35 | 6273 |
| 6 | 1 | 62.0 | 63.5 | 12 / 35 | 5290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 62 | 76% |
| cs.Wren 1.0 | 31 | 90% |
| mz.Cork 0.1 | 17 | 88% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 107 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 47 | 44% | 104 |
| cs.Wren 1.0 | 13 | 12% | 34 |
| PSW.Relentless 0.1 | 12 | 11% | 13 |
| evd.X1 0.01 | 12 | 11% | 12 |
| mz.Cork 0.1 | 7 | 7% | 20 |
| js.PinBall 1.6 | 7 | 7% | 10 |
| joe.ADinosaur 1.0 | 6 | 6% | 8 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.6 | 127 / 210 | 2.57 | 18.5% | 28410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.5% | 127 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 26 |
| stelo.AreaTargetingBot 1.1 | 3.7 | 11.0% | 24 |
| ntc.Opposite 1.5 | 4.0 | 10.5% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.2% | 0 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 10.0% | 9 |
| disan.Chair 2.2.0 | 6.8 | 8.7% | 12 |
| DBall.NUKE 0.1 | 8.0 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 9.0 | 6.1% | 3 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 26 / 35 | 4802 |
| 2 | 1 | 65.8 | 75.6 | 19 / 35 | 4649 |
| 3 | 1 | 64.6 | 73.3 | 18 / 35 | 4413 |
| 4 | 1 | 68.5 | 85.4 | 24 / 35 | 4605 |
| 5 | 1 | 66.9 | 81.0 | 19 / 35 | 4839 |
| 6 | 1 | 69.0 | 88.6 | 21 / 35 | 5102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 39 | 85% |
| stelo.AreaTargetingBot 1.1 | 27 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 100% |
| disan.Chair 2.2.0 | 17 | 65% |
| DBall.NUKE 0.1 | 14 | 86% |
| donjezza.Muncho 1.0 | 12 | 100% |
| ntc.Opposite 1.5 | 9 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 19% | 42 |
| stelo.AreaTargetingBot 1.1 | 16 | 19% | 41 |
| pfvicm.Sobieski 7.2.3b | 16 | 19% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 14% | 29 |
| disan.Chair 2.2.0 | 9 | 11% | 22 |
| ntc.Opposite 1.5 | 7 | 8% | 16 |
| pbg.R2D2 1.0 | 4 | 5% | 11 |
| DBall.NUKE 0.1 | 2 | 2% | 14 |
| donjezza.Muncho 1.0 | 1 | 1% | 8 |

## Melee bench: F13

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 71.8 | 81 / 210 | 3.54 | 15.6% | 26110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.2 | 15.6% | 81 |
| oog.melee.Capulet 1.2 | 2.3 | 14.3% | 49 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.6% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 25 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 11 |
| ejb.Polaris 1.0.1 | 5.7 | 10.9% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 77.5 | 16 / 35 | 4646 |
| 2 | 1 | 63.8 | 70.8 | 13 / 35 | 4287 |
| 3 | 1 | 65.3 | 72.1 | 16 / 35 | 4607 |
| 4 | 2 | 62.6 | 67.3 | 13 / 35 | 4003 |
| 5 | 1 | 64.1 | 72.1 | 12 / 35 | 4389 |
| 6 | 1 | 64.0 | 71.1 | 11 / 35 | 4178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 30 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 72% |
| kawigi.micro.Shiz 1.1 | 24 | 100% |
| yagami.Tidus 0.11 | 13 | 100% |
| ejb.Polaris 1.0.1 | 6 | 67% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 53 | 41% | 75 |
| yagami.Tidus 0.11 | 23 | 18% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 13% | 39 |
| kawigi.micro.Shiz 1.1 | 12 | 9% | 26 |
| ejb.Polaris 1.0.1 | 11 | 9% | 17 |
| stelo.MirrorNano 1.3 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| kurios.DOSexe .9a | 3 | 2% | 3 |

## Melee bench: F14

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.4 | 143 / 210 | 2.49 | 18.3% | 27880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 18.3% | 143 |
| wee.Gem 1.8.4 | 3.2 | 11.7% | 20 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 7 |
| bzdp.Pansy 2.1 | 3.7 | 11.5% | 10 |
| wompi.Quokka 1.6 | 4.0 | 11.2% | 17 |
| m3thos.Eva00 1.1 | 6.0 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 28 / 35 | 4964 |
| 2 | 1 | 68.0 | 87.0 | 25 / 35 | 4324 |
| 3 | 1 | 67.6 | 83.8 | 22 / 35 | 4836 |
| 4 | 1 | 67.2 | 78.7 | 24 / 35 | 5031 |
| 5 | 1 | 66.7 | 81.0 | 24 / 35 | 4419 |
| 6 | 1 | 65.5 | 78.4 | 20 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 96% |
| wee.Gem 1.8.4 | 32 | 100% |
| ratosh.Nobo 0.21 | 26 | 92% |
| wompi.Quokka 1.6 | 22 | 73% |
| m3thos.Eva00 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Quokka 1.6 | 14 | 21% | 26 |
| bzdp.Pansy 2.1 | 13 | 19% | 56 |
| ratosh.Nobo 0.21 | 9 | 13% | 37 |
| m3thos.Eva00 1.1 | 7 | 10% | 20 |
| wee.Gem 1.8.4 | 6 | 9% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 7% | 6 |
| maribo.FollowFire 1 | 5 | 7% | 5 |
| bayen.UbaMicro 1.4 | 4 | 6% | 11 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 88.8 | 132 / 210 | 2.00 | 21.5% | 46697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.5% | 132 |
| wompi.Wallaby 5.1 | 2.0 | 17.9% | 58 |
| mz.NanoGod 2.02 | 3.0 | 13.5% | 12 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.2% | 4 |
| ayk.WallHugger 1.0 | 5.0 | 9.1% | 2 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 7.9% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.4 | 23 / 35 | 7576 |
| 2 | 1 | 73.0 | 87.6 | 24 / 35 | 8340 |
| 3 | 1 | 70.8 | 80.6 | 17 / 35 | 7344 |
| 4 | 1 | 73.8 | 93.7 | 26 / 35 | 8054 |
| 5 | 1 | 72.7 | 89.2 | 20 / 35 | 7794 |
| 6 | 1 | 72.6 | 89.5 | 22 / 35 | 7589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 80% |
| exauge.GateKeeper 1.1.121g | 12 | 92% |
| mz.NanoGod 2.02 | 9 | 78% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 50% |

Hadur died in 81 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 46% | 137 |
| mz.NanoGod 2.02 | 24 | 30% | 35 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 13 |
| stelo.PianistNano 1.2 | 6 | 7% | 8 |
| stuff.Vlad 0.1 | 4 | 5% | 8 |
| ayk.WallHugger 1.0 | 4 | 5% | 7 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.4 | 115 / 210 | 3.48 | 16.7% | 28551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 16.7% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.3% | 18 |
| bvh.micro.Freya 0.3 | 3.3 | 11.5% | 16 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.1% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 11.0% | 16 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.1% | 10 |
| conscience.Electron 1.3g | 7.3 | 7.6% | 3 |
| ap.Frederick 1.1 | 8.2 | 7.2% | 9 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 72.7 | 19 / 35 | 4313 |
| 2 | 1 | 67.3 | 78.4 | 23 / 35 | 5014 |
| 3 | 1 | 64.0 | 68.3 | 20 / 35 | 4693 |
| 4 | 1 | 66.5 | 76.8 | 18 / 35 | 5110 |
| 5 | 1 | 64.0 | 67.9 | 18 / 35 | 4914 |
| 6 | 1 | 64.0 | 70.5 | 17 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 96% |
| dummy.micro.Sparrow 2.5 | 30 | 90% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 95% |
| bvh.micro.Freya 0.3 | 18 | 83% |
| stelo.MirrorMicro 1.0 | 4 | 75% |
| ap.Frederick 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 19 | 20% | 20 |
| voidious.micro.BlitzBat 1.05 | 18 | 19% | 59 |
| dl.BetterWalls 1.0 | 13 | 14% | 14 |
| dummy.micro.Sparrow 2.5 | 12 | 13% | 35 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 9% | 35 |
| bvh.micro.Freya 0.3 | 9 | 9% | 27 |
| stelo.MirrorMicro 1.0 | 8 | 8% | 12 |
| conscience.Electron 1.3g | 7 | 7% | 8 |

## Melee bench: F17

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 86.5 | 153 / 210 | 2.21 | 21.2% | 41036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 21.2% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 13.9% | 19 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.2% | 8 |
| sul.Lunar 1.1 | 3.7 | 11.4% | 15 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.8% | 4 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 8 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.2% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 85.4 | 24 / 35 | 6400 |
| 2 | 1 | 71.5 | 84.4 | 28 / 35 | 6665 |
| 3 | 1 | 71.5 | 89.2 | 26 / 35 | 6681 |
| 4 | 1 | 71.0 | 85.4 | 25 / 35 | 6743 |
| 5 | 1 | 72.7 | 90.8 | 28 / 35 | 7169 |
| 6 | 1 | 71.4 | 83.8 | 22 / 35 | 7378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 98% |
| sul.Lunar 1.1 | 39 | 97% |
| supersample.SuperBoxBot 1.0 | 32 | 91% |
| dsw.StaticD 1.0 | 19 | 74% |
| mme.NikeEnhanced 2.0 | 9 | 89% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 19 | 33% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 16% | 56 |
| dsw.StaticD 1.0 | 8 | 14% | 22 |
| tlp.ThreeLeggedPig 1 | 8 | 14% | 13 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 12 |
| sul.Lunar 1.1 | 4 | 7% | 46 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWAU 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.1 | 121 / 210 | 2.34 | 19.3% | 38057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAU 0.1 | 1.0 | 19.3% | 121 |
| radnor.DoctorBob 1.42 | 2.7 | 12.8% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.2% | 21 |
| mld.Wisdom 1.0 | 3.5 | 12.0% | 23 |
| amz.NanoClone 1.41 | 4.8 | 10.2% | 10 |
| KiraNL.Chupacabra 0.4 | 5.8 | 9.7% | 4 |
| sample.Walls 1.0 | 7.5 | 7.0% | 1 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.2% | 6 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 20 / 35 | 6706 |
| 2 | 1 | 71.4 | 91.1 | 25 / 35 | 6882 |
| 3 | 1 | 69.5 | 85.7 | 22 / 35 | 6204 |
| 4 | 1 | 69.3 | 84.8 | 20 / 35 | 6517 |
| 5 | 1 | 68.7 | 84.1 | 20 / 35 | 6106 |
| 6 | 1 | 66.1 | 77.5 | 14 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 90% |
| radnor.DoctorBob 1.42 | 39 | 74% |
| mld.Wisdom 1.0 | 26 | 65% |
| amz.NanoClone 1.41 | 12 | 67% |
| KiraNL.Chupacabra 0.4 | 11 | 91% |
| jangs.ns51 1.0 | 5 | 80% |
| sample.Walls 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 31% | 47 |
| radnor.DoctorBob 1.42 | 26 | 29% | 55 |
| KiraNL.Chupacabra 0.4 | 11 | 12% | 21 |
| amz.NanoClone 1.41 | 11 | 12% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 9% | 51 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 5 |

