# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 89.0 | 158 / 210 | 1.99 | 21.6% | 43347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 21.6% | 158 |
| radnor.DoctorBob 1.42 | 2.7 | 13.9% | 20 |
| mz.AntiGrav 1.0 | 2.8 | 13.6% | 14 |
| mld.Infinity 2.2 | 3.8 | 12.6% | 11 |
| amz.NanoClone 1.41 | 4.7 | 10.7% | 6 |
| sample.Walls 1.0 | 6.3 | 7.1% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 87.3 | 25 / 35 | 7315 |
| 2 | 1 | 72.2 | 87.9 | 27 / 35 | 7333 |
| 3 | 1 | 70.1 | 82.5 | 23 / 35 | 6519 |
| 4 | 1 | 72.7 | 91.1 | 26 / 35 | 7208 |
| 5 | 1 | 73.8 | 91.4 | 28 / 35 | 7799 |
| 6 | 1 | 73.4 | 93.7 | 29 / 35 | 7173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 76 | 95% |
| mld.Infinity 2.2 | 39 | 100% |
| radnor.DoctorBob 1.42 | 31 | 94% |
| amz.NanoClone 1.41 | 6 | 83% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 37% | 66 |
| mz.AntiGrav 1.0 | 12 | 23% | 61 |
| amz.NanoClone 1.41 | 9 | 17% | 19 |
| mld.Infinity 2.2 | 5 | 10% | 45 |
| jangs.ns51 1.0 | 5 | 10% | 5 |
| sample.Walls 1.0 | 2 | 4% | 9 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.1 | 116 / 210 | 2.52 | 18.4% | 32533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.2 | 18.4% | 116 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.6% | 60 |
| mld.DustBunny 3.8 | 2.7 | 13.7% | 16 |
| maribo.melee.BMV 0.1 | 4.3 | 10.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.2 | 9.1% | 7 |
| zyx.nano.Ant 1.1 | 6.5 | 7.9% | 1 |
| fullsail.SweetTea 1.1 | 7.8 | 7.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 6.8% | 6 |
| bzdp.BoxCar 2.0 | 8.3 | 7.0% | 1 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.6 | 21 / 35 | 5574 |
| 2 | 1 | 66.7 | 79.4 | 16 / 35 | 5041 |
| 3 | 1 | 69.9 | 90.8 | 19 / 35 | 6085 |
| 4 | 1 | 69.8 | 91.7 | 28 / 35 | 5080 |
| 5 | 1 | 69.2 | 90.8 | 21 / 35 | 5389 |
| 6 | 2 | 62.0 | 58.4 | 11 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 65% |
| mld.DustBunny 3.8 | 54 | 83% |
| djdjdj.NanoSkunk10 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 73% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| bzdp.BoxCar 2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 0% |

Hadur died in 94 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 41% | 75 |
| mld.DustBunny 3.8 | 23 | 24% | 65 |
| cs.Grudge 1.0 | 10 | 11% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 7% | 13 |
| maribo.melee.BMV 0.1 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 3 | 3% | 4 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 20 |
| bzdp.BoxCar 2.0 | 2 | 2% | 5 |

## Melee bench: F03

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.1 | 142 / 210 | 2.43 | 20.1% | 37816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.1% | 142 |
| myl.micro.Troodon 1.10 | 2.2 | 14.2% | 33 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.0% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.5 | 10.4% | 16 |
| fm.mammillarias 1.3 | 5.0 | 9.6% | 5 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.4% | 6 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.4% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 7.0% | 2 |
| sample.Fire 1.0 | 9.3 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.9 | 24 / 35 | 6584 |
| 2 | 1 | 71.2 | 87.3 | 27 / 35 | 6445 |
| 3 | 1 | 68.0 | 75.6 | 20 / 35 | 6170 |
| 4 | 1 | 70.9 | 89.2 | 26 / 35 | 6183 |
| 5 | 1 | 69.8 | 85.4 | 23 / 35 | 5893 |
| 6 | 1 | 70.4 | 85.4 | 22 / 35 | 6541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 52 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 35 | 86% |
| cb.nano.Insomnia 1.0 | 24 | 100% |
| myl.nano.KomoriNinja 1.1 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 9 | 100% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 21 | 31% | 49 |
| myl.micro.Troodon 1.10 | 14 | 21% | 71 |
| cb.nano.Insomnia 1.0 | 10 | 15% | 17 |
| fm.mammillarias 1.3 | 8 | 12% | 15 |
| myl.nano.KomoriNinja 1.1 | 4 | 6% | 22 |
| sample.Tracker 1.0 | 4 | 6% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 14 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 7 |
| sample.Fire 1.0 | 1 | 1% | 10 |

## Melee bench: F04

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 87.4 | 152 / 210 | 2.13 | 20.7% | 39834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.7% | 152 |
| kawigi.nano.Lib 1.0 | 2.5 | 12.4% | 12 |
| tvv.micro.Antares 1.1.1 | 2.7 | 11.8% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 4.7 | 9.3% | 2 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 6 |
| stelo.SoJNanoMelee 1.1 | 5.7 | 9.2% | 16 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.9% | 6 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.0 | 22 / 35 | 6374 |
| 2 | 1 | 72.1 | 92.1 | 27 / 35 | 7112 |
| 3 | 1 | 70.6 | 88.3 | 28 / 35 | 6250 |
| 4 | 1 | 70.9 | 87.6 | 25 / 35 | 6898 |
| 5 | 1 | 70.5 | 88.6 | 24 / 35 | 6548 |
| 6 | 1 | 70.6 | 87.9 | 26 / 35 | 6652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 93% |
| stelo.SoJNanoMelee 1.1 | 44 | 82% |
| tj.zombie1n 1.0.1 | 21 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 77% |
| yk.JahMicro 1.0 | 13 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 22 | 38% | 85 |
| stelo.SoJNanoMelee 1.1 | 14 | 24% | 31 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 10% | 18 |
| tj.zombie1n 1.0.1 | 5 | 9% | 14 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 24 |
| yk.JahMicro 1.0 | 4 | 7% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 12 |
| sample.VelociRobot 1.0 | 0 | 0% | 7 |
| repositorio.NanoStep 1.0 | 0 | 0% | 5 |

## Melee bench: F05

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.9 | 88 / 210 | 3.62 | 16.1% | 29749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 16.1% | 88 |
| oog.melee.Corsair 1.0 | 2.0 | 12.9% | 35 |
| ahf.NanoAndrew .4 | 3.3 | 11.5% | 24 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.8% | 24 |
| EBBU.Sim2 1.02 | 5.8 | 9.7% | 8 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.0% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.7 | 8.2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 6.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.0 | 60.6 | 11 / 35 | 4611 |
| 2 | 1 | 61.4 | 61.3 | 11 / 35 | 5165 |
| 3 | 1 | 64.2 | 73.3 | 13 / 35 | 4988 |
| 4 | 1 | 65.8 | 76.5 | 16 / 35 | 5224 |
| 5 | 1 | 65.4 | 76.8 | 17 / 35 | 4843 |
| 6 | 1 | 65.7 | 76.8 | 20 / 35 | 4918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 28 | 71% |
| simonton.nano.MeleeSeed 1.8 | 27 | 78% |
| ahf.NanoAndrew .4 | 18 | 89% |
| EBBU.Sim2 1.02 | 14 | 93% |
| sam.Samspin 1.0 | 13 | 85% |
| zyx.nano.BacillusComma 1.0 | 6 | 67% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 26% | 50 |
| oog.melee.Corsair 1.0 | 19 | 15% | 42 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 19 |
| ahf.NanoAndrew .4 | 13 | 11% | 29 |
| EBBU.Sim2 1.02 | 12 | 10% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 12 |
| sam.Samspin 1.0 | 9 | 7% | 19 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 12 |
| sample.TrackFire 1.0 | 4 | 3% | 6 |

## Melee bench: F06

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.7 | 143 / 210 | 2.20 | 19.5% | 32844 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.5% | 143 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.5% | 30 |
| gh.nano.Grofvuil 0.2 | 3.5 | 11.1% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 9.3% | 8 |
| fm.claire 1.7 | 5.7 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 6.7 | 8.2% | 5 |
| sample.SpinBot 1.0 | 7.7 | 7.3% | 1 |
| pa.Improved 1.0 | 9.0 | 6.2% | 2 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.0 | 24 / 35 | 5984 |
| 2 | 1 | 70.2 | 90.8 | 25 / 35 | 5742 |
| 3 | 1 | 67.6 | 82.5 | 20 / 35 | 5159 |
| 4 | 1 | 69.0 | 85.7 | 25 / 35 | 5169 |
| 5 | 1 | 69.4 | 88.9 | 25 / 35 | 5271 |
| 6 | 1 | 69.1 | 86.3 | 24 / 35 | 5519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 81% |
| oog.melee.CapuletDroid 1.1 | 38 | 97% |
| arthord.NanoSatanMelee Beta | 17 | 88% |
| sample.SpinBot 1.0 | 14 | 100% |
| gh.nano.Grofvuil 0.2 | 13 | 77% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| pa.Improved 1.0 | 3 | 67% |

Hadur died in 68 of 210 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 32% | 77 |
| oog.melee.CapuletDroid 1.1 | 9 | 13% | 42 |
| gh.nano.Grofvuil 0.2 | 9 | 13% | 26 |
| arthord.NanoSatanMelee Beta | 8 | 12% | 18 |
| winamp32.micro.MicroMacro 1.0 | 6 | 9% | 17 |
| fm.claire 1.7 | 4 | 6% | 10 |
| sample.SpinBot 1.0 | 4 | 6% | 9 |
| pa.Improved 1.0 | 3 | 4% | 7 |
| kurios.DOSexe .9b | 3 | 4% | 4 |

## Melee bench: F07

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.4 | 93 / 210 | 2.68 | 17.9% | 33832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.9% | 93 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 13.7% | 33 |
| mz.MicroGodMelee 1 | 3.8 | 12.5% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 8.8% | 6 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 4 |
| el.JumpShoot 0.2 | 7.8 | 6.5% | 3 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 8.7 | 6.0% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.6 | 17 / 35 | 5956 |
| 2 | 1 | 68.0 | 83.5 | 16 / 35 | 5726 |
| 3 | 1 | 66.3 | 79.7 | 15 / 35 | 5201 |
| 4 | 1 | 67.5 | 81.6 | 16 / 35 | 5744 |
| 5 | 1 | 68.6 | 87.6 | 18 / 35 | 5681 |
| 6 | 1 | 65.2 | 74.3 | 11 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 79% |
| mz.MicroGodMelee 1 | 35 | 54% |
| gh.micro.Gruweltje 0.7 | 32 | 63% |
| DBall.Anarchy 0.1 | 9 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 50% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 34 | 29% | 52 |
| gh.micro.Gruweltje 0.7 | 32 | 27% | 53 |
| spinnercat.micro.Tyger 0.1 | 27 | 23% | 64 |
| acogdev.alpha 0.2 | 12 | 10% | 13 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 8 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 4 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 73.3 | 111 / 210 | 3.40 | 16.7% | 30012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.3 | 16.7% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.6% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.5 | 13.7% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.7 | 9.4% | 8 |
| germ.TheMind .2 | 4.8 | 9.7% | 4 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.7% | 6 |
| awesomeness.Elite 1.0 | 6.5 | 8.7% | 10 |
| sample.Crazy 1.0 | 8.3 | 7.2% | 2 |
| stelo.UntouchableNano 1.3 | 8.5 | 7.2% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.2 | 56.5 | 14 / 35 | 4423 |
| 2 | 1 | 66.1 | 73.3 | 21 / 35 | 5376 |
| 3 | 2 | 64.2 | 72.4 | 16 / 35 | 4576 |
| 4 | 1 | 68.1 | 82.5 | 22 / 35 | 5411 |
| 5 | 1 | 65.9 | 74.6 | 18 / 35 | 5164 |
| 6 | 1 | 67.0 | 80.3 | 20 / 35 | 5062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 88% |
| qualidafial.MajorDick 1.0.1 | 10 | 90% |
| germ.TheMind .2 | 8 | 100% |
| lrem.micro.MoggFanatic 0.2 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| mym.EdgeStalker 1.0 | 3 | 100% |
| sample.Crazy 1.0 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 39 | 39% | 90 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 18% | 41 |
| germ.TheMind .2 | 10 | 10% | 18 |
| qualidafial.MajorDick 1.0.1 | 8 | 8% | 12 |
| lrem.micro.MoggFanatic 0.2 | 8 | 8% | 11 |
| awesomeness.Elite 1.0 | 6 | 6% | 13 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 8 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| mym.EdgeStalker 1.0 | 3 | 3% | 6 |

## Melee bench: F09

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.5 | 161 / 210 | 1.86 | 20.5% | 31511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.5% | 161 |
| rz.HawkOnFire 0.1 | 2.0 | 13.7% | 17 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.6% | 8 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.2% | 10 |
| maribo.IotaCT 1.1 | 4.7 | 10.1% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.4% | 1 |
| stelo.PatternRobot 1.0 | 7.7 | 8.0% | 4 |
| ratosh.Wesco 1.4 | 7.8 | 7.9% | 3 |
| spinnercat.Omen 1.0 | 8.5 | 7.2% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 89.8 | 25 / 35 | 5343 |
| 2 | 1 | 71.1 | 91.7 | 28 / 35 | 5115 |
| 3 | 1 | 71.4 | 90.8 | 28 / 35 | 5326 |
| 4 | 1 | 70.1 | 88.3 | 25 / 35 | 5272 |
| 5 | 1 | 70.6 | 90.2 | 28 / 35 | 4927 |
| 6 | 1 | 71.3 | 92.1 | 27 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 92% |
| nz.jdc.nano.GridFu 1.0 | 33 | 100% |
| stelo.PatternRobot 1.0 | 22 | 91% |
| timmit.nano.TimDog 0.33 | 15 | 67% |
| maribo.IotaCT 1.1 | 9 | 89% |
| ratosh.Wesco 1.4 | 8 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 14 | 29% | 28 |
| rz.HawkOnFire 0.1 | 12 | 24% | 67 |
| stelo.PatternRobot 1.0 | 7 | 14% | 18 |
| nz.jdc.nano.GridFu 1.0 | 5 | 10% | 47 |
| ratosh.Wesco 1.4 | 4 | 8% | 16 |
| maribo.IotaCT 1.1 | 4 | 8% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F10

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.1 | 176 / 210 | 1.44 | 22.1% | 39642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 22.1% | 176 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.3% | 10 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 6 |
| Grystrion.TrackerWO 1.0 | 4.2 | 9.7% | 1 |
| zyx.micro.Ant 1.1 | 5.2 | 9.3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.3% | 1 |
| sanja.First 0.1 | 7.0 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 2 |
| cvt.Firsty 1.0 | 8.3 | 7.2% | 5 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 29 / 35 | 6555 |
| 2 | 1 | 72.5 | 95.9 | 30 / 35 | 6754 |
| 3 | 1 | 72.5 | 95.9 | 29 / 35 | 6664 |
| 4 | 1 | 71.3 | 94.9 | 30 / 35 | 6022 |
| 5 | 1 | 71.7 | 92.4 | 27 / 35 | 6654 |
| 6 | 1 | 73.1 | 97.5 | 31 / 35 | 6993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 41 | 98% |
| cvt.Firsty 1.0 | 33 | 91% |
| zyx.micro.Ant 1.1 | 26 | 81% |
| amk.Punbot.Punbot 0.01 | 25 | 100% |
| sanja.First 0.1 | 24 | 96% |
| baal.nano.N 1.42 | 23 | 87% |
| Grystrion.TrackerWO 1.0 | 13 | 100% |
| squidM.TentalceMeleeNano 1.1 | 4 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 11 | 31% | 41 |
| baal.nano.N 1.42 | 7 | 20% | 37 |
| tvv.nano.Polaris 1.2 | 5 | 14% | 58 |
| cvt.Firsty 1.0 | 5 | 14% | 29 |
| sanja.First 0.1 | 2 | 6% | 23 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 6 |
| Grystrion.TrackerWO 1.0 | 1 | 3% | 9 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 4 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 64.3 | 86 / 210 | 4.21 | 14.9% | 29724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.7 | 14.9% | 86 |
| kc.micro.Figment 1.0 | 1.7 | 14.3% | 53 |
| cs.Wren 1.0 | 3.0 | 12.6% | 21 |
| js.PinBall 1.6 | 4.5 | 11.1% | 16 |
| mz.Cork 0.1 | 4.8 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 5.7 | 9.4% | 5 |
| evd.X1 0.01 | 6.7 | 8.8% | 9 |
| jsal.Jsalbot 1.0 | 8.0 | 7.2% | 5 |
| donjezza.Jezza 1.0 | 9.3 | 6.1% | 7 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 65.1 | 14 / 35 | 5160 |
| 2 | 2 | 61.9 | 65.1 | 12 / 35 | 5023 |
| 3 | 2 | 61.0 | 62.9 | 12 / 35 | 4681 |
| 4 | 1 | 64.8 | 70.2 | 18 / 35 | 5319 |
| 5 | 3 | 58.7 | 56.5 | 13 / 35 | 4257 |
| 6 | 1 | 63.2 | 66.0 | 17 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 49 | 76% |
| cs.Wren 1.0 | 24 | 100% |
| js.PinBall 1.6 | 8 | 75% |
| mz.Cork 0.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 6 | 83% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| PSW.Relentless 0.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 452. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 50 | 40% | 86 |
| cs.Wren 1.0 | 18 | 15% | 36 |
| PSW.Relentless 0.1 | 13 | 10% | 12 |
| js.PinBall 1.6 | 10 | 8% | 21 |
| joe.ADinosaur 1.0 | 10 | 8% | 13 |
| evd.X1 0.01 | 10 | 8% | 12 |
| mz.Cork 0.1 | 9 | 7% | 18 |
| donjezza.Jezza 1.0 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.2 | 136 / 210 | 2.33 | 19.4% | 30874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 19.4% | 136 |
| myl.nano.Graviton 1.10 | 2.5 | 11.6% | 23 |
| ntc.Opposite 1.5 | 3.5 | 11.4% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.6% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.9% | 15 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 9.4% | 3 |
| DBall.NUKE 0.1 | 7.2 | 8.2% | 4 |
| disan.Chair 2.2.0 | 7.3 | 8.0% | 10 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 2 |
| pbg.R2D2 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 22 / 35 | 5315 |
| 2 | 1 | 69.2 | 87.3 | 24 / 35 | 4945 |
| 3 | 1 | 68.8 | 84.4 | 22 / 35 | 5189 |
| 4 | 1 | 66.8 | 77.5 | 20 / 35 | 5032 |
| 5 | 1 | 70.4 | 91.4 | 27 / 35 | 5011 |
| 6 | 1 | 68.5 | 84.8 | 21 / 35 | 5382 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 38 | 92% |
| stelo.AreaTargetingBot 1.1 | 36 | 83% |
| ntc.Opposite 1.5 | 24 | 88% |
| donjezza.Muncho 1.0 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 86% |
| DBall.NUKE 0.1 | 11 | 100% |
| disan.Chair 2.2.0 | 9 | 56% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 15 | 20% | 46 |
| stelo.AreaTargetingBot 1.1 | 15 | 20% | 44 |
| ntc.Opposite 1.5 | 11 | 15% | 27 |
| pfvicm.Sobieski 7.2.3b | 11 | 15% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 23 |
| disan.Chair 2.2.0 | 8 | 11% | 14 |
| DBall.NUKE 0.1 | 3 | 4% | 16 |
| pbg.R2D2 1.0 | 2 | 3% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 14 |

## Melee bench: F13

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.8 | 87 / 210 | 3.18 | 16.4% | 26748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.2 | 16.4% | 87 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 43 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.4% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 25 |
| yagami.Tidus 0.11 | 4.2 | 12.3% | 16 |
| ejb.Polaris 1.0.1 | 6.0 | 10.1% | 8 |
| stelo.MirrorNano 1.3 | 7.2 | 7.3% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 66.7 | 11 / 35 | 4044 |
| 2 | 1 | 66.9 | 80.6 | 15 / 35 | 4740 |
| 3 | 1 | 67.4 | 79.0 | 18 / 35 | 4993 |
| 4 | 1 | 65.2 | 76.2 | 11 / 35 | 4480 |
| 5 | 1 | 65.4 | 74.9 | 17 / 35 | 4374 |
| 6 | 1 | 65.2 | 77.5 | 15 / 35 | 4117 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 75% |
| yagami.Tidus 0.11 | 22 | 100% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| ejb.Polaris 1.0.1 | 5 | 80% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 35 | 28% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 43 |
| yagami.Tidus 0.11 | 21 | 17% | 40 |
| ejb.Polaris 1.0.1 | 15 | 12% | 20 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 28 |
| stelo.MirrorNano 1.3 | 9 | 7% | 9 |
| step.nanoPri 1.0 | 5 | 4% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 5 |

## Melee bench: F14

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 74.3 | 120 / 210 | 3.31 | 16.6% | 26621 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 16.6% | 120 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 21 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 20 |
| wompi.Quokka 1.6 | 3.7 | 11.4% | 17 |
| ratosh.Nobo 0.21 | 4.5 | 11.0% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 9.8% | 10 |
| bayen.UbaMicro 1.4 | 7.0 | 9.3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 7.8 | 7.5% | 4 |
| maribo.FollowFire 1 | 9.5 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 71.7 | 19 / 35 | 3898 |
| 2 | 1 | 65.0 | 74.3 | 19 / 35 | 4726 |
| 3 | 1 | 66.3 | 79.7 | 20 / 35 | 4673 |
| 4 | 1 | 64.7 | 72.7 | 21 / 35 | 4362 |
| 5 | 1 | 65.3 | 73.0 | 21 / 35 | 4816 |
| 6 | 1 | 64.7 | 74.3 | 20 / 35 | 4146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 42 | 93% |
| bzdp.Pansy 2.1 | 39 | 92% |
| wompi.Quokka 1.6 | 23 | 83% |
| ratosh.Nobo 0.21 | 12 | 83% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| m3thos.Eva00 1.1 | 6 | 83% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.FollowFire 1 | 17 | 19% | 17 |
| wompi.Quokka 1.6 | 13 | 14% | 28 |
| ratosh.Nobo 0.21 | 12 | 13% | 27 |
| jeremyreeder.Vincent 2011.12.09 | 11 | 12% | 13 |
| wee.Gem 1.8.4 | 8 | 9% | 48 |
| m3thos.Eva00 1.1 | 8 | 9% | 15 |
| bayen.UbaMicro 1.4 | 8 | 9% | 13 |
| bzdp.Pansy 2.1 | 7 | 8% | 39 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 6 |

## Melee bench: F15

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 90.1 | 153 / 210 | 1.89 | 22.0% | 47357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 22.0% | 153 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 45 |
| mz.NanoGod 2.02 | 3.0 | 14.1% | 9 |
| ayk.WallHugger 1.0 | 4.8 | 9.5% | 0 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.4% | 3 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 6.7% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.0 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 87.3 | 22 / 35 | 7484 |
| 2 | 1 | 74.1 | 91.4 | 28 / 35 | 8017 |
| 3 | 1 | 73.8 | 92.1 | 28 / 35 | 7916 |
| 4 | 1 | 73.3 | 89.8 | 25 / 35 | 7927 |
| 5 | 1 | 73.8 | 93.0 | 25 / 35 | 8279 |
| 6 | 1 | 72.5 | 87.0 | 25 / 35 | 7734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 88% |
| mz.NanoGod 2.02 | 18 | 78% |
| exauge.GateKeeper 1.1.121g | 11 | 100% |
| ayk.WallHugger 1.0 | 9 | 100% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 3 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 23 | 39% | 129 |
| mz.NanoGod 2.02 | 23 | 39% | 45 |
| ayk.WallHugger 1.0 | 5 | 8% | 14 |
| exauge.GateKeeper 1.1.121g | 5 | 8% | 10 |
| stelo.PianistNano 1.2 | 3 | 5% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.8 | 123 / 210 | 3.00 | 17.7% | 30008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 17.7% | 123 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 12.7% | 18 |
| dummy.micro.Sparrow 2.5 | 3.3 | 11.5% | 20 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 18 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.3% | 1 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 5 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 77.5 | 21 / 35 | 5454 |
| 2 | 1 | 65.8 | 75.9 | 19 / 35 | 5116 |
| 3 | 1 | 64.9 | 76.2 | 17 / 35 | 4572 |
| 4 | 1 | 68.3 | 85.4 | 22 / 35 | 4959 |
| 5 | 1 | 68.4 | 82.5 | 23 / 35 | 5480 |
| 6 | 1 | 63.9 | 69.5 | 21 / 35 | 4427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 57 | 88% |
| dummy.micro.Sparrow 2.5 | 24 | 88% |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 87% |
| bvh.micro.Freya 0.3 | 20 | 85% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 19 | 22% | 43 |
| voidious.micro.BlitzBat 1.05 | 13 | 15% | 56 |
| davidalves.net.DuelistMicroMelee 1.4 | 12 | 14% | 37 |
| conscience.Electron 1.3g | 12 | 14% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 14% | 11 |
| bvh.micro.Freya 0.3 | 10 | 11% | 24 |
| dl.BetterWalls 1.0 | 6 | 7% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 10 |

## Melee bench: F17

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.7 | 142 / 210 | 2.38 | 20.6% | 40448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 20.6% | 142 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.5% | 20 |
| sul.Lunar 1.1 | 3.5 | 11.0% | 14 |
| supersample.SuperBoxBot 1.0 | 3.8 | 10.7% | 12 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.4% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 12 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 2 |
| sample.Corners 1.0 | 9.3 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 87.3 | 26 / 35 | 7128 |
| 2 | 1 | 71.2 | 87.6 | 24 / 35 | 6798 |
| 3 | 1 | 70.2 | 81.6 | 21 / 35 | 6866 |
| 4 | 1 | 70.9 | 87.3 | 24 / 35 | 6803 |
| 5 | 1 | 70.6 | 83.5 | 24 / 35 | 6599 |
| 6 | 1 | 69.7 | 80.6 | 23 / 35 | 6254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 53 | 94% |
| sul.Lunar 1.1 | 36 | 100% |
| supersample.SuperBoxBot 1.0 | 23 | 87% |
| dsw.StaticD 1.0 | 13 | 54% |
| mme.NikeEnhanced 2.0 | 13 | 92% |
| sample.Corners 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 26 | 38% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 25% | 69 |
| dsw.StaticD 1.0 | 11 | 16% | 22 |
| mme.NikeEnhanced 2.0 | 5 | 7% | 12 |
| sul.Lunar 1.1 | 4 | 6% | 39 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 4 |
| sample.Corners 1.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F18

hadur117.micro.SaorWAS 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 80.8 | 116 / 210 | 2.73 | 18.7% | 38444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWAS 0.1 | 1.0 | 18.7% | 116 |
| radnor.DoctorBob 1.42 | 2.2 | 13.1% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.7% | 24 |
| mld.Wisdom 1.0 | 3.8 | 11.6% | 19 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.3% | 10 |
| amz.NanoClone 1.41 | 6.0 | 9.5% | 10 |
| GarmBox.Oranges 1.0 | 7.7 | 7.0% | 0 |
| sample.Walls 1.0 | 7.8 | 7.1% | 1 |
| jangs.ns51 1.0 | 8.2 | 7.0% | 5 |
| sample.Target 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.7 | 21 / 35 | 6724 |
| 2 | 1 | 68.0 | 80.3 | 19 / 35 | 6526 |
| 3 | 1 | 67.8 | 76.5 | 21 / 35 | 6473 |
| 4 | 1 | 68.3 | 81.9 | 19 / 35 | 6429 |
| 5 | 1 | 67.8 | 78.1 | 18 / 35 | 6383 |
| 6 | 1 | 67.5 | 81.3 | 18 / 35 | 5909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 89% |
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 19 | 68% |
| KiraNL.Chupacabra 0.4 | 11 | 82% |
| amz.NanoClone 1.41 | 9 | 44% |
| sample.Walls 1.0 | 8 | 100% |
| jangs.ns51 1.0 | 8 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 546. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 21 | 22% | 61 |
| mld.Wisdom 1.0 | 20 | 21% | 32 |
| radnor.DoctorBob 1.42 | 19 | 20% | 48 |
| KiraNL.Chupacabra 0.4 | 18 | 19% | 25 |
| amz.NanoClone 1.41 | 10 | 11% | 24 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 7 |

