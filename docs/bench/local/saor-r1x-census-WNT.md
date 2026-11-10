# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 90.4 | 158 / 210 | 1.87 | 21.5% | 43225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 21.5% | 158 |
| mz.AntiGrav 1.0 | 2.5 | 14.6% | 17 |
| radnor.DoctorBob 1.42 | 3.0 | 13.8% | 17 |
| mld.Infinity 2.2 | 3.5 | 12.7% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 3 |
| sample.Walls 1.0 | 6.2 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 7.2 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.7 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 93.0 | 28 / 35 | 7396 |
| 2 | 1 | 72.4 | 89.8 | 25 / 35 | 7026 |
| 3 | 1 | 71.3 | 86.7 | 21 / 35 | 7181 |
| 4 | 1 | 71.2 | 87.6 | 26 / 35 | 6486 |
| 5 | 1 | 73.6 | 94.0 | 31 / 35 | 7722 |
| 6 | 1 | 72.8 | 91.1 | 27 / 35 | 7414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 83 | 95% |
| mld.Infinity 2.2 | 40 | 93% |
| radnor.DoctorBob 1.42 | 32 | 97% |
| amz.NanoClone 1.41 | 8 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 37% | 57 |
| amz.NanoClone 1.41 | 13 | 25% | 19 |
| mz.AntiGrav 1.0 | 8 | 15% | 73 |
| mld.Infinity 2.2 | 6 | 12% | 43 |
| sample.Walls 1.0 | 2 | 4% | 6 |
| arthord.MannyPacquiao Beta | 2 | 4% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 5 |
| GarmBox.Oranges 1.0 | 1 | 2% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.3 | 120 / 210 | 2.05 | 18.9% | 31674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 18.9% | 120 |
| mld.DustBunny 3.8 | 2.3 | 14.4% | 19 |
| oog.melee.Mercutio 1.0 | 2.7 | 14.4% | 50 |
| maribo.melee.BMV 0.1 | 4.0 | 11.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 8.2% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.4% | 7 |
| zyx.nano.Ant 1.1 | 7.3 | 7.3% | 0 |
| bzdp.BoxCar 2.0 | 7.5 | 7.1% | 0 |
| fullsail.SweetTea 1.1 | 8.0 | 6.0% | 4 |
| cs.Grudge 1.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.9 | 20 / 35 | 5660 |
| 2 | 1 | 66.2 | 83.8 | 17 / 35 | 4534 |
| 3 | 1 | 69.0 | 89.2 | 24 / 35 | 5419 |
| 4 | 1 | 69.6 | 87.3 | 20 / 35 | 5791 |
| 5 | 1 | 67.9 | 86.0 | 17 / 35 | 5110 |
| 6 | 1 | 70.3 | 94.6 | 22 / 35 | 5160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 66 | 76% |
| oog.melee.Mercutio 1.0 | 64 | 67% |
| djdjdj.NanoSkunk10 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 35 | 38% | 84 |
| mld.DustBunny 3.8 | 28 | 31% | 74 |
| maribo.melee.BMV 0.1 | 7 | 8% | 12 |
| zyx.nano.Ant 1.1 | 6 | 7% | 8 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 5% | 11 |
| fullsail.SweetTea 1.1 | 5 | 5% | 6 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 11 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 82.3 | 120 / 210 | 2.59 | 19.0% | 35500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 19.0% | 120 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 39 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.9% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 10.9% | 25 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.5% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.6% | 0 |
| fm.mammillarias 1.3 | 6.8 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 7.2 | 7.8% | 3 |
| sample.Fire 1.0 | 9.3 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 80.3 | 22 / 35 | 6050 |
| 2 | 1 | 69.2 | 84.1 | 20 / 35 | 6149 |
| 3 | 1 | 69.1 | 83.2 | 21 / 35 | 5722 |
| 4 | 1 | 68.5 | 82.9 | 21 / 35 | 5581 |
| 5 | 1 | 68.3 | 81.0 | 15 / 35 | 6226 |
| 6 | 1 | 68.8 | 82.5 | 21 / 35 | 5772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 53 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 34 | 74% |
| myl.nano.KomoriNinja 1.1 | 15 | 93% |
| cb.nano.Insomnia 1.0 | 14 | 100% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| fm.mammillarias 1.3 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 26% | 78 |
| stelo.SoRobotNanoMelee 1.2 | 22 | 24% | 44 |
| fm.mammillarias 1.3 | 16 | 18% | 20 |
| cb.nano.Insomnia 1.0 | 13 | 14% | 15 |
| myl.nano.KomoriNinja 1.1 | 8 | 9% | 24 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 14 |
| sample.Fire 1.0 | 2 | 2% | 8 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 91.0 | 156 / 210 | 1.81 | 21.6% | 41662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 21.6% | 156 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.4% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 12 |
| stelo.SoJNanoMelee 1.1 | 4.7 | 9.6% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.8% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.1% | 4 |
| yk.JahMicro 1.0 | 7.3 | 7.9% | 2 |
| repositorio.NanoStep 1.0 | 9.2 | 6.0% | 1 |
| sample.VelociRobot 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 91.7 | 26 / 35 | 7161 |
| 2 | 1 | 71.2 | 91.1 | 25 / 35 | 6469 |
| 3 | 1 | 72.1 | 90.8 | 28 / 35 | 7191 |
| 4 | 1 | 70.4 | 86.3 | 23 / 35 | 6690 |
| 5 | 1 | 72.4 | 93.7 | 29 / 35 | 7059 |
| 6 | 1 | 71.8 | 92.4 | 25 / 35 | 7092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 64 | 86% |
| kawigi.nano.Lib 1.0 | 59 | 92% |
| tj.zombie1n 1.0.1 | 14 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 77% |
| tvv.micro.Antares 1.1.1 | 12 | 83% |
| yk.JahMicro 1.0 | 9 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 30% | 81 |
| stelo.SoJNanoMelee 1.1 | 15 | 28% | 44 |
| tvv.micro.Antares 1.1.1 | 7 | 13% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 9% | 22 |
| tj.zombie1n 1.0.1 | 5 | 9% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 5 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| sample.VelociRobot 1.0 | 1 | 2% | 8 |
| repositorio.NanoStep 1.0 | 0 | 0% | 8 |

## Melee bench: F05

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.2 | 92 / 210 | 3.23 | 16.6% | 30278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 16.6% | 92 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 38 |
| ahf.NanoAndrew .4 | 4.0 | 11.0% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.3% | 22 |
| EBBU.Sim2 1.02 | 5.2 | 10.3% | 9 |
| sam.Samspin 1.0 | 5.5 | 9.8% | 17 |
| zyx.nano.BacillusComma 1.0 | 6.3 | 9.3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.8% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 79.0 | 17 / 35 | 5479 |
| 2 | 1 | 65.1 | 76.5 | 16 / 35 | 4876 |
| 3 | 1 | 65.2 | 77.1 | 17 / 35 | 4849 |
| 4 | 1 | 64.7 | 76.2 | 15 / 35 | 5082 |
| 5 | 1 | 63.3 | 69.8 | 12 / 35 | 5170 |
| 6 | 1 | 63.7 | 72.4 | 15 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 32 | 66% |
| simonton.nano.MeleeSeed 1.8 | 25 | 84% |
| sam.Samspin 1.0 | 19 | 74% |
| ahf.NanoAndrew .4 | 16 | 81% |
| EBBU.Sim2 1.02 | 15 | 87% |
| robar.nano.Assertive_Melee 0.2 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 17 | 14% | 39 |
| ahf.NanoAndrew .4 | 17 | 14% | 35 |
| EBBU.Sim2 1.02 | 16 | 14% | 29 |
| robar.nano.Assertive_Melee 0.2 | 15 | 13% | 21 |
| sam.Samspin 1.0 | 13 | 11% | 21 |
| zyx.nano.BacillusComma 1.0 | 13 | 11% | 19 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 29 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10 | 8% | 9 |
| sample.TrackFire 1.0 | 6 | 5% | 8 |

## Melee bench: F06

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.6 | 137 / 210 | 2.30 | 19.0% | 32175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 19.0% | 137 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 30 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 12 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.7% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.9% | 11 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.5% | 4 |
| fm.claire 1.7 | 6.3 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.7 | 7.3% | 4 |
| pa.Improved 1.0 | 9.3 | 6.1% | 1 |
| kurios.DOSexe .9b | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.5 | 23 / 35 | 5456 |
| 2 | 1 | 67.7 | 85.1 | 20 / 35 | 5121 |
| 3 | 1 | 70.4 | 88.6 | 26 / 35 | 6216 |
| 4 | 1 | 68.4 | 84.1 | 22 / 35 | 5474 |
| 5 | 1 | 67.2 | 81.9 | 23 / 35 | 5038 |
| 6 | 1 | 67.2 | 83.2 | 23 / 35 | 4870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 92% |
| oog.melee.CapuletDroid 1.1 | 41 | 98% |
| arthord.NanoSatanMelee Beta | 17 | 82% |
| sample.SpinBot 1.0 | 10 | 100% |
| gh.nano.Grofvuil 0.2 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| fm.claire 1.7 | 2 | 50% |
| kurios.DOSexe .9b | 1 | 0% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 32% | 79 |
| gh.nano.Grofvuil 0.2 | 10 | 14% | 23 |
| fm.claire 1.7 | 10 | 14% | 12 |
| oog.melee.CapuletDroid 1.1 | 7 | 10% | 49 |
| sample.SpinBot 1.0 | 7 | 10% | 12 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 14 |
| kurios.DOSexe .9b | 5 | 7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 9 |
| pa.Improved 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.5 | 109 / 210 | 2.57 | 18.3% | 34203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.2 | 18.3% | 109 |
| gh.micro.Gruweltje 0.7 | 1.8 | 15.2% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 26 |
| mz.MicroGodMelee 1 | 4.0 | 12.2% | 22 |
| DBall.Anarchy 0.1 | 5.3 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 8.1% | 3 |
| el.JumpShoot 0.2 | 8.0 | 6.4% | 3 |
| mbro.Detektor3 0.1.1 | 8.2 | 5.9% | 1 |
| acogdev.alpha 0.2 | 8.7 | 6.0% | 1 |
| fire219.CatBot 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 19 / 35 | 6179 |
| 2 | 1 | 68.8 | 86.0 | 19 / 35 | 5887 |
| 3 | 1 | 65.7 | 76.8 | 16 / 35 | 5176 |
| 4 | 1 | 69.3 | 85.4 | 19 / 35 | 6028 |
| 5 | 1 | 69.4 | 85.7 | 21 / 35 | 6214 |
| 6 | 2 | 64.3 | 73.7 | 15 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 61 | 89% |
| mz.MicroGodMelee 1 | 35 | 66% |
| gh.micro.Gruweltje 0.7 | 17 | 71% |
| DBall.Anarchy 0.1 | 8 | 100% |
| el.JumpShoot 0.2 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 29 | 29% | 55 |
| gh.micro.Gruweltje 0.7 | 25 | 25% | 47 |
| spinnercat.micro.Tyger 0.1 | 24 | 24% | 64 |
| caimano.Furia_Ceca 0.22 | 10 | 10% | 13 |
| acogdev.alpha 0.2 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 8 |

## Melee bench: F08

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 72.6 | 104 / 210 | 3.47 | 16.6% | 31913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.3 | 16.6% | 104 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.9% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.1% | 28 |
| germ.TheMind .2 | 4.3 | 9.9% | 5 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.5% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 8.2% | 6 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.6% | 4 |
| sample.Crazy 1.0 | 8.8 | 6.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 69.8 | 16 / 35 | 5222 |
| 2 | 2 | 61.9 | 62.9 | 15 / 35 | 5048 |
| 3 | 2 | 63.4 | 66.0 | 16 / 35 | 5230 |
| 4 | 1 | 66.0 | 76.8 | 16 / 35 | 5390 |
| 5 | 1 | 64.8 | 72.4 | 15 / 35 | 5186 |
| 6 | 1 | 70.1 | 87.6 | 26 / 35 | 5837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 79% |
| germ.TheMind .2 | 12 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| awesomeness.Elite 1.0 | 5 | 60% |
| sample.Crazy 1.0 | 4 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 45% | 98 |
| germ.TheMind .2 | 18 | 17% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 11% | 30 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 17 |
| lrem.micro.MoggFanatic 0.2 | 7 | 7% | 8 |
| awesomeness.Elite 1.0 | 6 | 6% | 9 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 3 | 3% | 7 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.3 | 136 / 210 | 2.41 | 18.7% | 28638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 18.7% | 136 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 24 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.3% | 14 |
| timmit.nano.TimDog 0.33 | 4.3 | 10.6% | 14 |
| maribo.IotaCT 1.1 | 5.0 | 10.3% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.4% | 2 |
| stelo.PatternRobot 1.0 | 7.5 | 8.1% | 8 |
| ratosh.Wesco 1.4 | 7.5 | 8.1% | 5 |
| spinnercat.Omen 1.0 | 8.5 | 7.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.7 | 26 / 35 | 5488 |
| 2 | 1 | 67.2 | 79.0 | 20 / 35 | 4524 |
| 3 | 1 | 64.4 | 73.0 | 16 / 35 | 4258 |
| 4 | 1 | 70.7 | 88.3 | 26 / 35 | 5194 |
| 5 | 1 | 68.9 | 88.6 | 24 / 35 | 4418 |
| 6 | 1 | 69.0 | 85.4 | 24 / 35 | 4756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 64 | 92% |
| nz.jdc.nano.GridFu 1.0 | 27 | 100% |
| timmit.nano.TimDog 0.33 | 19 | 79% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 90% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| maribo.IotaCT 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 4 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 16 | 22% | 25 |
| timmit.nano.TimDog 0.33 | 14 | 19% | 30 |
| rz.HawkOnFire 0.1 | 12 | 16% | 56 |
| ratosh.Wesco 1.4 | 10 | 14% | 27 |
| nz.jdc.nano.GridFu 1.0 | 9 | 12% | 36 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 13 |
| maribo.IotaCT 1.1 | 5 | 7% | 13 |
| spinnercat.Omen 1.0 | 2 | 3% | 9 |

## Melee bench: F10

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.9 | 150 / 210 | 2.09 | 20.3% | 37609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 20.3% | 150 |
| tvv.nano.Polaris 1.2 | 3.0 | 11.3% | 20 |
| baal.nano.N 1.42 | 3.0 | 11.5% | 8 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.2% | 2 |
| zyx.micro.Ant 1.1 | 5.7 | 9.4% | 10 |
| sanja.First 0.1 | 6.2 | 8.8% | 6 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.3% | 3 |
| cvt.Firsty 1.0 | 7.3 | 7.8% | 11 |
| amk.Punbot.Punbot 0.01 | 7.8 | 7.4% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.3 | 30 / 35 | 6775 |
| 2 | 1 | 68.8 | 85.1 | 21 / 35 | 5942 |
| 3 | 1 | 67.6 | 80.0 | 19 / 35 | 6032 |
| 4 | 1 | 70.6 | 91.1 | 26 / 35 | 6232 |
| 5 | 1 | 69.3 | 85.4 | 24 / 35 | 5998 |
| 6 | 1 | 71.7 | 92.7 | 30 / 35 | 6630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 35 | 94% |
| tvv.nano.Polaris 1.2 | 27 | 89% |
| cvt.Firsty 1.0 | 24 | 88% |
| sanja.First 0.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 19 | 100% |
| zyx.micro.Ant 1.1 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 7 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 559. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 24 | 40% | 41 |
| cvt.Firsty 1.0 | 9 | 15% | 27 |
| tvv.nano.Polaris 1.2 | 7 | 12% | 38 |
| Grystrion.TrackerWO 1.0 | 7 | 12% | 24 |
| sanja.First 0.1 | 5 | 8% | 21 |
| baal.nano.N 1.42 | 4 | 7% | 34 |
| sample.RamFire 1.0 | 2 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 9 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 7 |

## Melee bench: F11

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.9 | 81 / 210 | 3.89 | 15.2% | 30822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.2 | 15.2% | 81 |
| kc.micro.Figment 1.0 | 1.8 | 14.5% | 57 |
| cs.Wren 1.0 | 3.5 | 12.5% | 24 |
| js.PinBall 1.6 | 4.2 | 11.3% | 12 |
| mz.Cork 0.1 | 4.5 | 11.3% | 24 |
| joe.ADinosaur 1.0 | 6.2 | 9.6% | 2 |
| evd.X1 0.01 | 6.7 | 8.6% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.1% | 4 |
| PSW.Relentless 0.1 | 9.3 | 5.0% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 68.6 | 12 / 35 | 5403 |
| 2 | 1 | 62.5 | 67.9 | 12 / 35 | 5130 |
| 3 | 1 | 63.5 | 69.8 | 15 / 35 | 5069 |
| 4 | 1 | 64.5 | 71.7 | 18 / 35 | 5281 |
| 5 | 1 | 63.4 | 70.5 | 14 / 35 | 5187 |
| 6 | 2 | 59.4 | 59.0 | 10 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 56% |
| cs.Wren 1.0 | 31 | 90% |
| mz.Cork 0.1 | 11 | 91% |
| js.PinBall 1.6 | 7 | 71% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| joe.ADinosaur 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 52 | 40% | 87 |
| evd.X1 0.01 | 25 | 19% | 27 |
| joe.ADinosaur 1.0 | 15 | 12% | 19 |
| cs.Wren 1.0 | 12 | 9% | 31 |
| js.PinBall 1.6 | 12 | 9% | 19 |
| PSW.Relentless 0.1 | 7 | 5% | 6 |
| mz.Cork 0.1 | 3 | 2% | 9 |
| donjezza.Jezza 1.0 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 8 |

## Melee bench: F12

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.9 | 122 / 210 | 2.72 | 18.2% | 28874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 18.2% | 122 |
| ntc.Opposite 1.5 | 3.0 | 11.9% | 19 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.5% | 7 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 4 |
| disan.Chair 2.2.0 | 7.7 | 7.7% | 7 |
| donjezza.Muncho 1.0 | 9.3 | 6.1% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.4 | 17 / 35 | 4694 |
| 2 | 1 | 66.3 | 79.7 | 17 / 35 | 4928 |
| 3 | 1 | 67.5 | 81.9 | 20 / 35 | 4916 |
| 4 | 1 | 67.3 | 81.9 | 24 / 35 | 4469 |
| 5 | 1 | 67.2 | 78.7 | 21 / 35 | 5000 |
| 6 | 1 | 68.2 | 84.8 | 23 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 32 | 91% |
| myl.nano.Graviton 1.10 | 29 | 90% |
| ntc.Opposite 1.5 | 19 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 85% |
| donjezza.Muncho 1.0 | 12 | 92% |
| disan.Chair 2.2.0 | 12 | 83% |
| DBall.NUKE 0.1 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 22% | 32 |
| ntc.Opposite 1.5 | 19 | 21% | 27 |
| stelo.AreaTargetingBot 1.1 | 13 | 15% | 40 |
| myl.nano.Graviton 1.10 | 13 | 15% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 8% | 21 |
| disan.Chair 2.2.0 | 6 | 7% | 13 |
| pbg.R2D2 1.0 | 6 | 7% | 11 |
| DBall.NUKE 0.1 | 4 | 4% | 16 |
| donjezza.Muncho 1.0 | 1 | 1% | 12 |

## Melee bench: F13

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 68.9 | 78 / 210 | 3.80 | 14.9% | 25849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.8 | 14.9% | 78 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 46 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.9% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 30 |
| yagami.Tidus 0.11 | 5.0 | 11.5% | 9 |
| ejb.Polaris 1.0.1 | 5.8 | 10.6% | 10 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 2 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 62.9 | 13 / 35 | 4026 |
| 2 | 1 | 64.3 | 71.1 | 15 / 35 | 4287 |
| 3 | 4 | 59.8 | 61.0 | 9 / 35 | 4208 |
| 4 | 1 | 64.6 | 71.1 | 14 / 35 | 4493 |
| 5 | 1 | 66.2 | 80.3 | 17 / 35 | 4551 |
| 6 | 1 | 62.3 | 67.0 | 10 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 32 | 63% |
| kawigi.micro.Shiz 1.1 | 27 | 100% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 82% |
| yagami.Tidus 0.11 | 12 | 83% |
| ejb.Polaris 1.0.1 | 7 | 100% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 132 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 62 | 47% | 87 |
| yagami.Tidus 0.11 | 20 | 15% | 27 |
| kawigi.micro.Shiz 1.1 | 17 | 13% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 11% | 32 |
| ejb.Polaris 1.0.1 | 10 | 8% | 17 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.3 | 139 / 210 | 2.50 | 18.2% | 28551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 18.2% | 139 |
| bzdp.Pansy 2.1 | 2.7 | 12.3% | 20 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 23 |
| wompi.Quokka 1.6 | 4.0 | 10.9% | 11 |
| ratosh.Nobo 0.21 | 4.3 | 10.8% | 5 |
| m3thos.Eva00 1.1 | 6.3 | 9.4% | 6 |
| bayen.UbaMicro 1.4 | 6.7 | 9.0% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.5% | 1 |
| maribo.FollowFire 1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.2 | 22 / 35 | 4703 |
| 2 | 1 | 67.1 | 81.9 | 24 / 35 | 4606 |
| 3 | 1 | 68.2 | 89.5 | 25 / 35 | 4506 |
| 4 | 1 | 65.4 | 74.6 | 19 / 35 | 5083 |
| 5 | 1 | 68.7 | 86.7 | 26 / 35 | 4828 |
| 6 | 1 | 67.6 | 84.1 | 23 / 35 | 4825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 89% |
| wee.Gem 1.8.4 | 37 | 100% |
| wompi.Quokka 1.6 | 21 | 90% |
| ratosh.Nobo 0.21 | 19 | 100% |
| m3thos.Eva00 1.1 | 12 | 83% |
| bayen.UbaMicro 1.4 | 5 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 18% | 60 |
| wompi.Quokka 1.6 | 13 | 18% | 23 |
| ratosh.Nobo 0.21 | 11 | 15% | 27 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 14% | 11 |
| maribo.FollowFire 1 | 8 | 11% | 12 |
| wee.Gem 1.8.4 | 5 | 7% | 46 |
| bayen.UbaMicro 1.4 | 5 | 7% | 9 |
| m3thos.Eva00 1.1 | 4 | 6% | 15 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 85.7 | 114 / 210 | 2.29 | 20.2% | 43695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 20.2% | 114 |
| wompi.Wallaby 5.1 | 2.0 | 18.4% | 79 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 12 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.6% | 2 |
| ayk.WallHugger 1.0 | 5.0 | 9.6% | 2 |
| stuff.Vlad 0.1 | 5.3 | 9.0% | 1 |
| stelo.PianistNano 1.2 | 7.0 | 7.0% | 0 |
| drd.Dreadknoght 0.9 | 8.0 | 5.4% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 81.9 | 17 / 35 | 7384 |
| 2 | 1 | 71.1 | 87.0 | 17 / 35 | 7094 |
| 3 | 1 | 71.7 | 88.3 | 19 / 35 | 7411 |
| 4 | 1 | 73.0 | 88.6 | 25 / 35 | 7909 |
| 5 | 1 | 71.7 | 88.9 | 19 / 35 | 7035 |
| 6 | 1 | 69.8 | 79.7 | 17 / 35 | 6862 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 100 | 68% |
| mz.NanoGod 2.02 | 18 | 83% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| ayk.WallHugger 1.0 | 9 | 100% |
| stelo.PianistNano 1.2 | 5 | 100% |
| drd.Dreadknoght 0.9 | 5 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 57 | 59% | 134 |
| mz.NanoGod 2.02 | 17 | 18% | 30 |
| exauge.GateKeeper 1.1.121g | 9 | 9% | 15 |
| ayk.WallHugger 1.0 | 8 | 8% | 15 |
| stuff.Vlad 0.1 | 3 | 3% | 7 |
| drd.Dreadknoght 0.9 | 2 | 2% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.9 | 116 / 210 | 3.17 | 17.0% | 28634 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 17.0% | 116 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.9% | 20 |
| dummy.micro.Sparrow 2.5 | 3.5 | 11.6% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.0 | 11.2% | 18 |
| bvh.micro.Freya 0.3 | 4.5 | 10.9% | 15 |
| stelo.MirrorMicro 1.0 | 6.3 | 8.9% | 6 |
| conscience.Electron 1.3g | 6.5 | 8.7% | 2 |
| ap.Frederick 1.1 | 8.5 | 6.9% | 8 |
| dl.BetterWalls 1.0 | 9.2 | 6.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.8 | 18 / 35 | 4792 |
| 2 | 1 | 66.2 | 78.1 | 20 / 35 | 4873 |
| 3 | 1 | 65.6 | 76.2 | 20 / 35 | 4606 |
| 4 | 1 | 65.2 | 75.9 | 18 / 35 | 4716 |
| 5 | 1 | 65.8 | 74.6 | 21 / 35 | 5048 |
| 6 | 1 | 64.5 | 73.0 | 19 / 35 | 4599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 89% |
| bvh.micro.Freya 0.3 | 25 | 92% |
| dummy.micro.Sparrow 2.5 | 22 | 86% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 456. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 21% | 54 |
| davidalves.net.DuelistMicroMelee 1.4 | 16 | 17% | 45 |
| dummy.micro.Sparrow 2.5 | 14 | 15% | 32 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 15% | 14 |
| conscience.Electron 1.3g | 11 | 12% | 13 |
| bvh.micro.Freya 0.3 | 7 | 7% | 26 |
| dl.BetterWalls 1.0 | 7 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 6 | 6% | 16 |

## Melee bench: F17

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 91.1 | 159 / 210 | 1.80 | 21.8% | 43346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 21.8% | 159 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.4% | 14 |
| supersample.SuperBoxBot 1.0 | 3.5 | 11.2% | 14 |
| sul.Lunar 1.1 | 3.5 | 11.6% | 12 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.3% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.3% | 2 |
| tlp.ThreeLeggedPig 1 | 7.2 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 2 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.5% | 5 |
| sample.Corners 1.0 | 9.2 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 91.1 | 28 / 35 | 7257 |
| 2 | 1 | 72.5 | 90.8 | 26 / 35 | 7565 |
| 3 | 1 | 72.1 | 93.0 | 26 / 35 | 6720 |
| 4 | 1 | 72.1 | 93.3 | 27 / 35 | 7089 |
| 5 | 1 | 73.3 | 93.0 | 28 / 35 | 7767 |
| 6 | 1 | 70.7 | 85.4 | 24 / 35 | 6948 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 48 | 90% |
| sul.Lunar 1.1 | 46 | 98% |
| supersample.SuperBoxBot 1.0 | 24 | 88% |
| dsw.StaticD 1.0 | 14 | 86% |
| sample.MyFirstJuniorRobot 1.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| sample.Corners 1.0 | 8 | 100% |
| mme.NikeEnhanced 2.0 | 8 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 21 | 40% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 25% | 57 |
| sul.Lunar 1.1 | 6 | 12% | 49 |
| dsw.StaticD 1.0 | 5 | 10% | 19 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 16 |
| mme.NikeEnhanced 2.0 | 1 | 2% | 10 |
| sample.Corners 1.0 | 1 | 2% | 9 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWNT 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.8 | 100 / 210 | 3.18 | 17.1% | 34882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNT 0.1 | 1.0 | 17.1% | 100 |
| mld.Wisdom 1.0 | 2.8 | 12.8% | 25 |
| radnor.DoctorBob 1.42 | 3.3 | 12.4% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.2% | 26 |
| KiraNL.Chupacabra 0.4 | 5.3 | 9.8% | 5 |
| amz.NanoClone 1.41 | 5.3 | 10.1% | 11 |
| sample.Walls 1.0 | 7.2 | 8.2% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 5 |
| jangs.ns51 1.0 | 9.0 | 6.4% | 4 |
| sample.Target 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.3 | 16 / 35 | 6031 |
| 2 | 1 | 67.5 | 81.0 | 19 / 35 | 6062 |
| 3 | 1 | 66.1 | 76.2 | 17 / 35 | 5625 |
| 4 | 1 | 65.5 | 74.9 | 16 / 35 | 5585 |
| 5 | 1 | 65.3 | 74.3 | 15 / 35 | 5864 |
| 6 | 1 | 65.3 | 74.3 | 17 / 35 | 5715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 95% |
| radnor.DoctorBob 1.42 | 24 | 79% |
| mld.Wisdom 1.0 | 18 | 67% |
| amz.NanoClone 1.41 | 16 | 81% |
| KiraNL.Chupacabra 0.4 | 8 | 100% |
| sample.Walls 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 26 | 24% | 40 |
| radnor.DoctorBob 1.42 | 25 | 23% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 20 | 18% | 56 |
| amz.NanoClone 1.41 | 15 | 14% | 23 |
| KiraNL.Chupacabra 0.4 | 11 | 10% | 19 |
| GarmBox.Oranges 1.0 | 7 | 6% | 7 |
| jangs.ns51 1.0 | 4 | 4% | 8 |
| sample.Walls 1.0 | 2 | 2% | 11 |

