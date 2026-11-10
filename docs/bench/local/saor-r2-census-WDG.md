# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 90.3 | 158 / 210 | 1.88 | 22.0% | 44386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.0% | 158 |
| mz.AntiGrav 1.0 | 2.8 | 13.5% | 11 |
| radnor.DoctorBob 1.42 | 3.0 | 13.6% | 20 |
| mld.Infinity 2.2 | 3.2 | 13.0% | 15 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 6 |
| sample.Walls 1.0 | 6.5 | 7.0% | 0 |
| GarmBox.Oranges 1.0 | 6.7 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 93.0 | 25 / 35 | 7281 |
| 2 | 1 | 73.3 | 91.1 | 27 / 35 | 7790 |
| 3 | 1 | 72.0 | 87.9 | 28 / 35 | 6866 |
| 4 | 1 | 73.2 | 91.4 | 27 / 35 | 7661 |
| 5 | 1 | 71.7 | 86.7 | 23 / 35 | 6959 |
| 6 | 1 | 73.8 | 91.4 | 28 / 35 | 7829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 60 | 98% |
| mld.Infinity 2.2 | 46 | 96% |
| radnor.DoctorBob 1.42 | 36 | 81% |
| amz.NanoClone 1.41 | 10 | 60% |
| jangs.ns51 1.0 | 7 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 25 | 48% | 71 |
| mld.Infinity 2.2 | 10 | 19% | 49 |
| amz.NanoClone 1.41 | 8 | 15% | 16 |
| mz.AntiGrav 1.0 | 5 | 10% | 58 |
| GarmBox.Oranges 1.0 | 2 | 4% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 6 |
| sample.Walls 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.1 | 123 / 210 | 2.43 | 18.7% | 33339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 18.7% | 123 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.8% | 52 |
| mld.DustBunny 3.8 | 2.8 | 13.3% | 17 |
| djdjdj.NanoSkunk10 1.0 | 4.7 | 9.5% | 8 |
| maribo.melee.BMV 0.1 | 4.7 | 9.7% | 2 |
| zyx.nano.Ant 1.1 | 6.7 | 8.3% | 2 |
| fullsail.SweetTea 1.1 | 7.5 | 6.7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.1% | 4 |
| bzdp.BoxCar 2.0 | 8.0 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 25 / 35 | 5741 |
| 2 | 1 | 69.0 | 88.3 | 21 / 35 | 5481 |
| 3 | 1 | 69.9 | 90.5 | 24 / 35 | 5725 |
| 4 | 1 | 69.9 | 92.4 | 24 / 35 | 5741 |
| 5 | 1 | 69.7 | 91.1 | 21 / 35 | 5667 |
| 6 | 3 | 59.4 | 51.1 | 8 / 35 | 4984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 59 | 76% |
| mld.DustBunny 3.8 | 58 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 10 | 100% |
| maribo.melee.BMV 0.1 | 5 | 80% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 31% | 67 |
| oog.melee.Mercutio 1.0 | 24 | 28% | 68 |
| zyx.nano.Ant 1.1 | 10 | 11% | 11 |
| cs.Grudge 1.0 | 8 | 9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 20 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 5% | 15 |
| maribo.melee.BMV 0.1 | 3 | 3% | 10 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.7 | 132 / 210 | 2.64 | 19.8% | 38252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.8% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.0% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.5% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.0% | 15 |
| fm.mammillarias 1.3 | 5.2 | 9.6% | 2 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.3% | 9 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.0% | 2 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 4 |
| sample.Fire 1.0 | 9.3 | 5.1% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 84.8 | 23 / 35 | 6447 |
| 2 | 1 | 70.1 | 81.0 | 23 / 35 | 6708 |
| 3 | 1 | 66.1 | 69.5 | 18 / 35 | 5617 |
| 4 | 1 | 70.1 | 84.4 | 22 / 35 | 6144 |
| 5 | 1 | 69.8 | 84.8 | 21 / 35 | 6424 |
| 6 | 1 | 71.3 | 86.0 | 25 / 35 | 6912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 41 | 90% |
| stelo.SoRobotNanoMelee 1.2 | 33 | 82% |
| myl.nano.KomoriNinja 1.1 | 24 | 96% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| sp.Nanos.Ember 1.1 | 15 | 93% |
| fm.mammillarias 1.3 | 6 | 83% |
| sample.Fire 1.0 | 3 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 21 | 27% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 19% | 38 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 40 |
| fm.mammillarias 1.3 | 8 | 10% | 14 |
| cb.nano.Insomnia 1.0 | 7 | 9% | 15 |
| sp.Nanos.Ember 1.1 | 6 | 8% | 23 |
| cs.sheldor.Talon 1.1 | 5 | 6% | 9 |
| sample.Fire 1.0 | 4 | 5% | 6 |
| sample.Tracker 1.0 | 4 | 5% | 5 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 84.8 | 153 / 210 | 2.37 | 20.4% | 39132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.4% | 153 |
| kawigi.nano.Lib 1.0 | 2.3 | 12.2% | 13 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.0% | 14 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.9% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.7% | 6 |
| yk.JahMicro 1.0 | 7.8 | 7.3% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.2% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.8 | 24 / 35 | 6254 |
| 2 | 1 | 70.8 | 87.3 | 25 / 35 | 6840 |
| 3 | 1 | 69.3 | 81.9 | 26 / 35 | 6082 |
| 4 | 1 | 69.8 | 85.7 | 24 / 35 | 6467 |
| 5 | 1 | 70.2 | 83.2 | 26 / 35 | 6499 |
| 6 | 1 | 71.4 | 87.0 | 28 / 35 | 6990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 53 | 96% |
| stelo.SoJNanoMelee 1.1 | 52 | 88% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 16 | 94% |
| tj.zombie1n 1.0.1 | 12 | 100% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 41% | 82 |
| stelo.SoJNanoMelee 1.1 | 11 | 19% | 41 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 26 |
| tj.zombie1n 1.0.1 | 5 | 9% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 9% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 7% | 28 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| repositorio.NanoStep 1.0 | 1 | 2% | 8 |
| sample.VelociRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 64.9 | 85 / 210 | 4.16 | 15.4% | 29096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.4% | 85 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 25 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.0% | 30 |
| sam.Samspin 1.0 | 6.0 | 9.7% | 12 |
| EBBU.Sim2 1.02 | 6.3 | 9.8% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 8.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.2 | 57.1 | 14 / 35 | 4577 |
| 2 | 1 | 63.1 | 65.1 | 12 / 35 | 5121 |
| 3 | 1 | 63.1 | 64.8 | 15 / 35 | 5033 |
| 4 | 1 | 62.1 | 64.8 | 14 / 35 | 4533 |
| 5 | 1 | 64.2 | 71.7 | 15 / 35 | 5042 |
| 6 | 1 | 63.2 | 65.7 | 15 / 35 | 4790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 29 | 66% |
| simonton.nano.MeleeSeed 1.8 | 23 | 87% |
| ahf.NanoAndrew .4 | 18 | 83% |
| EBBU.Sim2 1.02 | 10 | 100% |
| sam.Samspin 1.0 | 7 | 86% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 6 | 100% |
| sample.TrackFire 1.0 | 4 | 75% |

Hadur died in 126 of 210 rounds, at a mean tick of 350. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bwbaugh.nano.Tirunculus 0.0.0a | 21 | 17% | 21 |
| simonton.nano.MeleeSeed 1.8 | 18 | 14% | 37 |
| oog.melee.Corsair 1.0 | 18 | 14% | 37 |
| robar.nano.Assertive_Melee 0.2 | 17 | 13% | 22 |
| ahf.NanoAndrew .4 | 15 | 12% | 36 |
| zyx.nano.BacillusComma 1.0 | 14 | 11% | 18 |
| EBBU.Sim2 1.02 | 9 | 7% | 17 |
| sam.Samspin 1.0 | 9 | 7% | 13 |
| sample.TrackFire 1.0 | 5 | 4% | 6 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.4 | 147 / 210 | 1.95 | 20.1% | 34390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.1% | 147 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 25 |
| gh.nano.Grofvuil 0.2 | 3.0 | 11.9% | 11 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 9.9% | 14 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.6% | 3 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.4% | 3 |
| fm.claire 1.7 | 6.5 | 8.2% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.4% | 3 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 10.0 | 5.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.4 | 26 / 35 | 6280 |
| 2 | 1 | 71.0 | 92.4 | 23 / 35 | 6123 |
| 3 | 1 | 67.2 | 80.0 | 22 / 35 | 5107 |
| 4 | 1 | 71.7 | 93.7 | 28 / 35 | 6299 |
| 5 | 1 | 69.7 | 92.4 | 24 / 35 | 5331 |
| 6 | 1 | 68.5 | 85.7 | 24 / 35 | 5250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 84% |
| oog.melee.CapuletDroid 1.1 | 38 | 97% |
| gh.nano.Grofvuil 0.2 | 22 | 77% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| sample.SpinBot 1.0 | 11 | 91% |
| fm.claire 1.7 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 50% |

Hadur died in 63 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 38% | 85 |
| oog.melee.CapuletDroid 1.1 | 11 | 17% | 44 |
| gh.nano.Grofvuil 0.2 | 9 | 14% | 26 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 20 |
| sample.SpinBot 1.0 | 4 | 6% | 9 |
| kurios.DOSexe .9b | 3 | 5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 3% | 11 |
| fm.claire 1.7 | 1 | 2% | 5 |
| pa.Improved 1.0 | 1 | 2% | 2 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.1 | 114 / 210 | 2.43 | 19.0% | 35490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.0% | 114 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.9% | 33 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.0% | 29 |
| mz.MicroGodMelee 1 | 3.8 | 12.1% | 23 |
| DBall.Anarchy 0.1 | 5.3 | 8.3% | 3 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 3 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 2 |
| fire219.CatBot 1.0 | 8.3 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.7 | 5.8% | 3 |
| acogdev.alpha 0.2 | 9.0 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 73.7 | 17 / 35 | 5168 |
| 2 | 1 | 68.9 | 84.8 | 19 / 35 | 6000 |
| 3 | 1 | 70.7 | 87.9 | 22 / 35 | 6514 |
| 4 | 1 | 67.3 | 83.2 | 17 / 35 | 5216 |
| 5 | 1 | 70.4 | 87.0 | 19 / 35 | 6622 |
| 6 | 1 | 69.5 | 88.3 | 20 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 66 | 85% |
| mz.MicroGodMelee 1 | 37 | 78% |
| gh.micro.Gruweltje 0.7 | 24 | 54% |
| DBall.Anarchy 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| acogdev.alpha 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| el.JumpShoot 0.2 | 2 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 32 | 33% | 50 |
| spinnercat.micro.Tyger 0.1 | 23 | 24% | 69 |
| mz.MicroGodMelee 1 | 21 | 22% | 50 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 9 |
| fire219.CatBot 1.0 | 5 | 5% | 4 |
| acogdev.alpha 0.2 | 3 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 7 |
| el.JumpShoot 0.2 | 2 | 2% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 11 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 72.1 | 111 / 210 | 3.51 | 17.1% | 31979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 17.1% | 111 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.8% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.3% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 5 |
| germ.TheMind .2 | 5.3 | 9.2% | 8 |
| awesomeness.Elite 1.0 | 5.8 | 8.9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.3% | 1 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 6 |
| sample.Crazy 1.0 | 9.0 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 70.2 | 19 / 35 | 5404 |
| 2 | 1 | 65.5 | 70.8 | 18 / 35 | 5436 |
| 3 | 1 | 67.4 | 76.5 | 24 / 35 | 5522 |
| 4 | 2 | 65.0 | 69.2 | 14 / 35 | 5086 |
| 5 | 1 | 65.7 | 73.0 | 20 / 35 | 4997 |
| 6 | 1 | 65.7 | 72.7 | 16 / 35 | 5534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 85% |
| qualidafial.MajorDick 1.0.1 | 12 | 92% |
| germ.TheMind .2 | 7 | 100% |
| sample.Crazy 1.0 | 6 | 100% |
| stelo.UntouchableNano 1.3 | 5 | 60% |
| awesomeness.Elite 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 400. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 41% | 97 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 14% | 31 |
| stelo.UntouchableNano 1.3 | 14 | 14% | 20 |
| awesomeness.Elite 1.0 | 11 | 11% | 16 |
| germ.TheMind .2 | 5 | 5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 11 |
| qualidafial.MajorDick 1.0.1 | 5 | 5% | 10 |
| mym.EdgeStalker 1.0 | 2 | 2% | 6 |
| sample.Crazy 1.0 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 89.3 | 147 / 210 | 1.96 | 20.5% | 32927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.5% | 147 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 27 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.0% | 7 |
| maribo.IotaCT 1.1 | 4.0 | 10.5% | 8 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.5 | 8.0% | 4 |
| stelo.PatternRobot 1.0 | 8.2 | 7.3% | 4 |
| spinnercat.Omen 1.0 | 8.3 | 7.5% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 26 / 35 | 5404 |
| 2 | 1 | 69.7 | 83.8 | 23 / 35 | 5039 |
| 3 | 1 | 70.8 | 89.2 | 25 / 35 | 5537 |
| 4 | 1 | 71.3 | 90.5 | 24 / 35 | 5575 |
| 5 | 1 | 71.6 | 91.7 | 25 / 35 | 5747 |
| 6 | 1 | 71.1 | 89.2 | 24 / 35 | 5625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 75 | 87% |
| nz.jdc.nano.GridFu 1.0 | 31 | 100% |
| timmit.nano.TimDog 0.33 | 17 | 59% |
| stelo.PatternRobot 1.0 | 15 | 93% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 91% |
| maribo.IotaCT 1.1 | 10 | 90% |
| ratosh.Wesco 1.4 | 6 | 67% |
| spinnercat.Omen 1.0 | 4 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 18 | 29% | 68 |
| timmit.nano.TimDog 0.33 | 16 | 25% | 36 |
| nz.jdc.nano.GridFu 1.0 | 7 | 11% | 45 |
| maribo.IotaCT 1.1 | 6 | 10% | 17 |
| stelo.PatternRobot 1.0 | 6 | 10% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 8% | 11 |
| ratosh.Wesco 1.4 | 3 | 5% | 12 |
| spinnercat.Omen 1.0 | 2 | 3% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.4 | 179 / 210 | 1.60 | 22.1% | 40668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.1% | 179 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 10 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 4 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 1 |
| sanja.First 0.1 | 6.0 | 8.4% | 1 |
| zyx.micro.Ant 1.1 | 6.2 | 8.5% | 6 |
| cvt.Firsty 1.0 | 7.2 | 7.7% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.8% | 1 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 93.7 | 31 / 35 | 6623 |
| 2 | 1 | 72.8 | 98.7 | 32 / 35 | 6626 |
| 3 | 1 | 71.9 | 92.7 | 28 / 35 | 6840 |
| 4 | 1 | 71.9 | 90.5 | 30 / 35 | 6837 |
| 5 | 1 | 72.6 | 94.3 | 30 / 35 | 7049 |
| 6 | 1 | 71.6 | 90.5 | 28 / 35 | 6693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cvt.Firsty 1.0 | 40 | 90% |
| tvv.nano.Polaris 1.2 | 37 | 97% |
| baal.nano.N 1.42 | 35 | 94% |
| sanja.First 0.1 | 24 | 96% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 14 | 100% |
| zyx.micro.Ant 1.1 | 14 | 93% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 7 | 23% | 65 |
| cvt.Firsty 1.0 | 5 | 16% | 29 |
| zyx.micro.Ant 1.1 | 5 | 16% | 26 |
| baal.nano.N 1.42 | 3 | 10% | 41 |
| sanja.First 0.1 | 3 | 10% | 17 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 14 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 7 |
| sample.RamFire 1.0 | 2 | 6% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 2 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 67.1 | 77 / 210 | 3.96 | 15.4% | 32339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.5 | 15.4% | 77 |
| kc.micro.Figment 1.0 | 1.8 | 14.9% | 70 |
| cs.Wren 1.0 | 2.8 | 13.0% | 23 |
| js.PinBall 1.6 | 4.5 | 11.4% | 15 |
| mz.Cork 0.1 | 4.5 | 11.0% | 15 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 2 |
| evd.X1 0.01 | 7.2 | 8.1% | 3 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 56.8 | 9 / 35 | 5045 |
| 2 | 2 | 64.9 | 72.1 | 14 / 35 | 5675 |
| 3 | 1 | 66.1 | 72.7 | 15 / 35 | 5921 |
| 4 | 1 | 62.8 | 67.3 | 13 / 35 | 5100 |
| 5 | 1 | 64.5 | 72.4 | 14 / 35 | 5457 |
| 6 | 2 | 61.1 | 61.3 | 12 / 35 | 5141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 75% |
| cs.Wren 1.0 | 22 | 82% |
| js.PinBall 1.6 | 12 | 83% |
| mz.Cork 0.1 | 5 | 40% |
| donjezza.Jezza 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |

Hadur died in 133 of 210 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 57 | 43% | 99 |
| cs.Wren 1.0 | 17 | 13% | 30 |
| js.PinBall 1.6 | 16 | 12% | 25 |
| mz.Cork 0.1 | 13 | 10% | 16 |
| joe.ADinosaur 1.0 | 12 | 9% | 13 |
| evd.X1 0.01 | 11 | 8% | 14 |
| PSW.Relentless 0.1 | 6 | 5% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.6 | 135 / 210 | 2.56 | 18.7% | 28860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.7% | 135 |
| myl.nano.Graviton 1.10 | 3.0 | 11.4% | 22 |
| ntc.Opposite 1.5 | 3.7 | 11.3% | 8 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.4% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.5% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 4.8 | 10.2% | 1 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 8 |
| DBall.NUKE 0.1 | 7.3 | 7.9% | 7 |
| donjezza.Muncho 1.0 | 9.5 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 21 / 35 | 4972 |
| 2 | 1 | 67.5 | 81.6 | 23 / 35 | 4705 |
| 3 | 1 | 65.0 | 72.7 | 19 / 35 | 4444 |
| 4 | 1 | 69.6 | 87.0 | 25 / 35 | 5251 |
| 5 | 1 | 68.2 | 85.1 | 23 / 35 | 4686 |
| 6 | 1 | 68.9 | 87.9 | 24 / 35 | 4802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 45 | 84% |
| myl.nano.Graviton 1.10 | 32 | 84% |
| ntc.Opposite 1.5 | 20 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| donjezza.Muncho 1.0 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| disan.Chair 2.2.0 | 9 | 100% |
| DBall.NUKE 0.1 | 7 | 86% |
| pbg.R2D2 1.0 | 4 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 488. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 18 | 24% | 28 |
| myl.nano.Graviton 1.10 | 17 | 22% | 43 |
| stelo.AreaTargetingBot 1.1 | 13 | 17% | 42 |
| ntc.Opposite 1.5 | 11 | 14% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 11% | 18 |
| disan.Chair 2.2.0 | 5 | 7% | 20 |
| DBall.NUKE 0.1 | 2 | 3% | 14 |
| pbg.R2D2 1.0 | 2 | 3% | 6 |
| donjezza.Muncho 1.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 71.1 | 80 / 210 | 3.60 | 15.6% | 26582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.6% | 80 |
| oog.melee.Capulet 1.2 | 2.7 | 14.0% | 57 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 22 |
| yagami.Tidus 0.11 | 5.2 | 11.4% | 14 |
| ejb.Polaris 1.0.1 | 5.7 | 10.4% | 6 |
| stelo.MirrorNano 1.3 | 7.2 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 66.3 | 11 / 35 | 4734 |
| 2 | 1 | 66.0 | 77.5 | 15 / 35 | 4546 |
| 3 | 1 | 64.1 | 72.7 | 16 / 35 | 4480 |
| 4 | 1 | 62.8 | 69.5 | 10 / 35 | 4128 |
| 5 | 1 | 65.0 | 72.4 | 17 / 35 | 4360 |
| 6 | 1 | 62.9 | 68.3 | 11 / 35 | 4334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 62% |
| kawigi.micro.Shiz 1.1 | 25 | 96% |
| yagami.Tidus 0.11 | 17 | 94% |
| ejb.Polaris 1.0.1 | 6 | 83% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 629. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 35% | 68 |
| yagami.Tidus 0.11 | 23 | 18% | 35 |
| kawigi.micro.Shiz 1.1 | 14 | 11% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 29 |
| ejb.Polaris 1.0.1 | 11 | 8% | 19 |
| stelo.MirrorNano 1.3 | 11 | 8% | 13 |
| kurios.DOSexe .9a | 8 | 6% | 8 |
| step.nanoPri 1.0 | 4 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 78.5 | 127 / 210 | 2.93 | 17.5% | 27966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.5% | 127 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 20 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 23 |
| wompi.Quokka 1.6 | 3.8 | 11.8% | 12 |
| ratosh.Nobo 0.21 | 4.2 | 11.0% | 8 |
| m3thos.Eva00 1.1 | 6.2 | 9.4% | 7 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.0% | 4 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.9 | 24 / 35 | 4955 |
| 2 | 1 | 65.9 | 78.7 | 20 / 35 | 4269 |
| 3 | 1 | 65.9 | 75.6 | 20 / 35 | 4710 |
| 4 | 1 | 67.4 | 82.9 | 24 / 35 | 4728 |
| 5 | 1 | 65.1 | 73.3 | 20 / 35 | 4697 |
| 6 | 1 | 64.8 | 71.7 | 19 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 91% |
| wee.Gem 1.8.4 | 32 | 97% |
| wompi.Quokka 1.6 | 25 | 92% |
| ratosh.Nobo 0.21 | 12 | 83% |
| m3thos.Eva00 1.1 | 11 | 82% |
| jeremyreeder.Vincent 2011.12.09 | 6 | 83% |
| bayen.UbaMicro 1.4 | 5 | 60% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 390. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 16% | 54 |
| maribo.FollowFire 1 | 13 | 16% | 12 |
| bayen.UbaMicro 1.4 | 11 | 13% | 17 |
| ratosh.Nobo 0.21 | 9 | 11% | 21 |
| m3thos.Eva00 1.1 | 9 | 11% | 17 |
| wee.Gem 1.8.4 | 8 | 10% | 48 |
| wompi.Quokka 1.6 | 8 | 10% | 23 |
| stelo.MyAgileRobot 0.2 | 7 | 8% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 6% | 9 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 87.1 | 122 / 210 | 2.16 | 20.9% | 45810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.9% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 18.0% | 65 |
| mz.NanoGod 2.02 | 3.0 | 14.2% | 20 |
| ayk.WallHugger 1.0 | 4.3 | 10.0% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 1 |
| stuff.Vlad 0.1 | 6.3 | 7.6% | 0 |
| stelo.PianistNano 1.2 | 6.7 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 87.0 | 24 / 35 | 7929 |
| 2 | 1 | 70.5 | 82.2 | 16 / 35 | 7305 |
| 3 | 1 | 74.1 | 93.7 | 24 / 35 | 8357 |
| 4 | 1 | 70.7 | 85.1 | 18 / 35 | 6784 |
| 5 | 1 | 71.7 | 86.0 | 19 / 35 | 7543 |
| 6 | 1 | 72.8 | 88.6 | 21 / 35 | 7892 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 105 | 71% |
| mz.NanoGod 2.02 | 16 | 69% |
| ayk.WallHugger 1.0 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 10 | 100% |
| drd.Dreadknoght 0.9 | 7 | 100% |
| stelo.PianistNano 1.2 | 6 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 48 | 54% | 137 |
| mz.NanoGod 2.02 | 19 | 21% | 36 |
| ayk.WallHugger 1.0 | 9 | 10% | 13 |
| exauge.GateKeeper 1.1.121g | 8 | 9% | 13 |
| stelo.PianistNano 1.2 | 3 | 3% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.9 | 107 / 210 | 3.17 | 17.3% | 29849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 17.3% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.5% | 18 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.7% | 29 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.0 | 10.1% | 21 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.2% | 9 |
| conscience.Electron 1.3g | 6.8 | 7.9% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.7% | 4 |
| dl.BetterWalls 1.0 | 9.0 | 6.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 71.1 | 15 / 35 | 5254 |
| 2 | 2 | 61.4 | 64.8 | 13 / 35 | 4156 |
| 3 | 1 | 66.0 | 74.9 | 20 / 35 | 4858 |
| 4 | 1 | 65.1 | 73.7 | 15 / 35 | 4855 |
| 5 | 1 | 68.2 | 83.8 | 21 / 35 | 5265 |
| 6 | 1 | 69.0 | 87.3 | 23 / 35 | 5461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 45 | 93% |
| dummy.micro.Sparrow 2.5 | 25 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 68% |
| bvh.micro.Freya 0.3 | 18 | 78% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 484. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 23 | 22% | 49 |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 18% | 38 |
| voidious.micro.BlitzBat 1.05 | 15 | 15% | 48 |
| bvh.micro.Freya 0.3 | 11 | 11% | 23 |
| conscience.Electron 1.3g | 11 | 11% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 11% | 11 |
| dl.BetterWalls 1.0 | 9 | 9% | 15 |
| stelo.MirrorMicro 1.0 | 4 | 4% | 13 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 82.6 | 147 / 210 | 2.57 | 20.6% | 41244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.6% | 147 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.1% | 17 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 13 |
| supersample.SuperBoxBot 1.0 | 3.7 | 10.9% | 15 |
| mme.NikeEnhanced 2.0 | 5.0 | 9.8% | 3 |
| dsw.StaticD 1.0 | 6.0 | 8.3% | 7 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.2% | 5 |
| sample.Corners 1.0 | 9.0 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 75.9 | 22 / 35 | 5902 |
| 2 | 1 | 68.7 | 77.8 | 21 / 35 | 6346 |
| 3 | 1 | 69.4 | 76.2 | 21 / 35 | 6923 |
| 4 | 1 | 73.3 | 91.7 | 29 / 35 | 7723 |
| 5 | 1 | 73.2 | 91.1 | 29 / 35 | 7675 |
| 6 | 1 | 70.5 | 82.9 | 25 / 35 | 6675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 50 | 100% |
| sul.Lunar 1.1 | 42 | 100% |
| supersample.SuperBoxBot 1.0 | 25 | 84% |
| mme.NikeEnhanced 2.0 | 11 | 91% |
| dsw.StaticD 1.0 | 8 | 63% |
| sample.Corners 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 3 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 22 | 34% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 23% | 63 |
| dsw.StaticD 1.0 | 14 | 22% | 22 |
| sul.Lunar 1.1 | 4 | 6% | 42 |
| sample.Corners 1.0 | 3 | 5% | 9 |
| mme.NikeEnhanced 2.0 | 2 | 3% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 6 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 84.3 | 120 / 210 | 2.41 | 19.6% | 40641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.6% | 120 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.2% | 29 |
| KiraNL.Chupacabra 0.4 | 4.0 | 10.7% | 5 |
| mld.Wisdom 1.0 | 4.3 | 11.1% | 15 |
| amz.NanoClone 1.41 | 5.3 | 9.7% | 8 |
| sample.Walls 1.0 | 7.5 | 7.3% | 2 |
| GarmBox.Oranges 1.0 | 7.7 | 7.3% | 1 |
| jangs.ns51 1.0 | 8.8 | 5.8% | 2 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 77.5 | 18 / 35 | 6287 |
| 2 | 1 | 69.1 | 81.3 | 18 / 35 | 6892 |
| 3 | 1 | 70.8 | 88.9 | 21 / 35 | 7041 |
| 4 | 1 | 71.6 | 90.5 | 24 / 35 | 7235 |
| 5 | 1 | 70.3 | 87.9 | 21 / 35 | 6964 |
| 6 | 1 | 67.9 | 80.0 | 18 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 44 | 80% |
| radnor.DoctorBob 1.42 | 43 | 77% |
| mld.Wisdom 1.0 | 21 | 76% |
| KiraNL.Chupacabra 0.4 | 11 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 592. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 32% | 61 |
| mld.Wisdom 1.0 | 24 | 27% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 20% | 56 |
| amz.NanoClone 1.41 | 7 | 8% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 6% | 21 |
| GarmBox.Oranges 1.0 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 3 | 3% | 4 |
| sample.Walls 1.0 | 1 | 1% | 8 |

