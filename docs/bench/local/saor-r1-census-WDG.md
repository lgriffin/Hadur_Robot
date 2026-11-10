# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.1 | 90.6 | 161 / 210 | 1.85 | 22.2% | 44800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 22.2% | 161 |
| mz.AntiGrav 1.0 | 2.5 | 14.4% | 14 |
| radnor.DoctorBob 1.42 | 2.5 | 14.3% | 22 |
| mld.Infinity 2.2 | 4.0 | 12.0% | 11 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 1 |
| sample.Walls 1.0 | 6.3 | 6.8% | 0 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 1 |
| arthord.MannyPacquiao Beta | 9.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 86.7 | 27 / 35 | 7164 |
| 2 | 1 | 72.9 | 90.2 | 25 / 35 | 7494 |
| 3 | 1 | 72.7 | 86.0 | 24 / 35 | 7619 |
| 4 | 1 | 73.9 | 93.3 | 28 / 35 | 7902 |
| 5 | 1 | 72.6 | 89.8 | 27 / 35 | 7106 |
| 6 | 1 | 74.4 | 97.5 | 30 / 35 | 7515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 85 | 98% |
| radnor.DoctorBob 1.42 | 37 | 86% |
| mld.Infinity 2.2 | 28 | 93% |
| sample.Walls 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 5 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 615. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 42% | 64 |
| amz.NanoClone 1.41 | 11 | 22% | 20 |
| mz.AntiGrav 1.0 | 10 | 20% | 79 |
| mld.Infinity 2.2 | 7 | 14% | 33 |
| jangs.ns51 1.0 | 1 | 2% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.7 | 101 / 210 | 2.65 | 18.1% | 32587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 18.1% | 101 |
| oog.melee.Mercutio 1.0 | 1.8 | 14.6% | 57 |
| mld.DustBunny 3.8 | 3.0 | 13.2% | 18 |
| maribo.melee.BMV 0.1 | 4.2 | 10.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.3% | 12 |
| zyx.nano.Ant 1.1 | 5.7 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 8 |
| fullsail.SweetTea 1.1 | 8.3 | 6.4% | 6 |
| bzdp.BoxCar 2.0 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.9 | 15 / 35 | 5606 |
| 2 | 1 | 69.4 | 89.2 | 20 / 35 | 5582 |
| 3 | 1 | 70.3 | 93.3 | 25 / 35 | 5517 |
| 4 | 2 | 61.4 | 58.7 | 11 / 35 | 5041 |
| 5 | 1 | 66.5 | 76.8 | 16 / 35 | 5594 |
| 6 | 1 | 67.4 | 84.1 | 14 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 55 | 65% |
| mld.DustBunny 3.8 | 39 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 64% |
| djdjdj.NanoSkunk10 1.0 | 13 | 92% |
| maribo.melee.BMV 0.1 | 6 | 67% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 36% | 75 |
| mld.DustBunny 3.8 | 26 | 24% | 58 |
| maribo.melee.BMV 0.1 | 11 | 10% | 16 |
| cs.Grudge 1.0 | 9 | 8% | 9 |
| djdjdj.NanoSkunk10 1.0 | 8 | 7% | 22 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 6% | 13 |
| zyx.nano.Ant 1.1 | 5 | 5% | 8 |
| fullsail.SweetTea 1.1 | 5 | 5% | 8 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 81.7 | 136 / 210 | 2.64 | 19.8% | 37409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.8% | 136 |
| myl.micro.Troodon 1.10 | 2.0 | 14.1% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 7 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.1% | 17 |
| fm.mammillarias 1.3 | 5.7 | 9.4% | 3 |
| cb.nano.Insomnia 1.0 | 5.8 | 9.2% | 8 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.5% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.6% | 4 |
| sample.Fire 1.0 | 9.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.1 | 23 / 35 | 6468 |
| 2 | 1 | 69.9 | 80.6 | 22 / 35 | 6346 |
| 3 | 1 | 71.0 | 90.5 | 26 / 35 | 5965 |
| 4 | 1 | 70.2 | 82.5 | 24 / 35 | 6430 |
| 5 | 1 | 66.6 | 69.8 | 18 / 35 | 5705 |
| 6 | 1 | 70.3 | 82.9 | 23 / 35 | 6495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 48 | 94% |
| stelo.SoRobotNanoMelee 1.2 | 39 | 87% |
| cb.nano.Insomnia 1.0 | 21 | 95% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| myl.nano.KomoriNinja 1.1 | 12 | 100% |
| fm.mammillarias 1.3 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| sample.Fire 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 27% | 68 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 23% | 45 |
| sp.Nanos.Ember 1.1 | 10 | 14% | 18 |
| cb.nano.Insomnia 1.0 | 9 | 12% | 15 |
| fm.mammillarias 1.3 | 8 | 11% | 10 |
| myl.nano.KomoriNinja 1.1 | 4 | 5% | 36 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 10 |
| sample.Fire 1.0 | 3 | 4% | 5 |

## Melee bench: F04

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 86.4 | 151 / 210 | 2.22 | 20.4% | 38054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.4% | 151 |
| kawigi.nano.Lib 1.0 | 2.2 | 12.8% | 21 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 8 |
| stelo.SoJNanoMelee 1.1 | 4.5 | 9.7% | 12 |
| tj.zombie1n 1.0.1 | 5.5 | 9.1% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.0 | 9.0% | 3 |
| yk.JahMicro 1.0 | 6.7 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.5% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 6.6% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.6 | 28 / 35 | 6285 |
| 2 | 1 | 68.8 | 79.7 | 20 / 35 | 6645 |
| 3 | 1 | 69.7 | 87.6 | 25 / 35 | 5795 |
| 4 | 1 | 70.5 | 88.9 | 27 / 35 | 5958 |
| 5 | 1 | 70.2 | 87.9 | 24 / 35 | 6441 |
| 6 | 1 | 71.3 | 86.7 | 27 / 35 | 6930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoJNanoMelee 1.1 | 60 | 88% |
| kawigi.nano.Lib 1.0 | 55 | 89% |
| tj.zombie1n 1.0.1 | 18 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 70% |
| yk.JahMicro 1.0 | 7 | 100% |
| repositorio.NanoStep 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 24 | 41% | 81 |
| stelo.SoJNanoMelee 1.1 | 15 | 25% | 48 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 8% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 9 |
| tj.zombie1n 1.0.1 | 3 | 5% | 11 |
| tvv.micro.Antares 1.1.1 | 2 | 3% | 22 |
| yk.JahMicro 1.0 | 2 | 3% | 7 |
| sample.VelociRobot 1.0 | 2 | 3% | 6 |
| repositorio.NanoStep 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 67.5 | 89 / 210 | 3.93 | 15.7% | 28557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 15.7% | 89 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 34 |
| ahf.NanoAndrew .4 | 3.0 | 11.8% | 27 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.2% | 24 |
| sam.Samspin 1.0 | 5.5 | 9.7% | 12 |
| zyx.nano.BacillusComma 1.0 | 6.2 | 9.2% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 9.2% | 6 |
| EBBU.Sim2 1.02 | 7.8 | 8.6% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 7.1% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.2 | 17 / 35 | 4804 |
| 2 | 1 | 65.7 | 75.2 | 19 / 35 | 4865 |
| 3 | 1 | 61.2 | 63.5 | 12 / 35 | 4451 |
| 4 | 1 | 64.3 | 68.3 | 15 / 35 | 5164 |
| 5 | 1 | 61.2 | 61.9 | 14 / 35 | 4500 |
| 6 | 1 | 61.4 | 60.6 | 12 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 39 | 85% |
| oog.melee.Corsair 1.0 | 29 | 59% |
| ahf.NanoAndrew .4 | 25 | 80% |
| sam.Samspin 1.0 | 9 | 78% |
| robar.nano.Assertive_Melee 0.2 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |
| EBBU.Sim2 1.02 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 21% | 57 |
| ahf.NanoAndrew .4 | 18 | 15% | 36 |
| oog.melee.Corsair 1.0 | 17 | 14% | 38 |
| zyx.nano.BacillusComma 1.0 | 16 | 13% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 15 | 12% | 15 |
| robar.nano.Assertive_Melee 0.2 | 14 | 11% | 20 |
| sam.Samspin 1.0 | 7 | 6% | 14 |
| sample.TrackFire 1.0 | 5 | 4% | 5 |
| EBBU.Sim2 1.02 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.3 | 133 / 210 | 2.23 | 19.1% | 31732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 19.1% | 133 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.6% | 29 |
| gh.nano.Grofvuil 0.2 | 3.5 | 10.7% | 12 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 11.4% | 20 |
| fm.claire 1.7 | 5.8 | 8.6% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.3 | 8.2% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.8% | 2 |
| sample.SpinBot 1.0 | 8.2 | 7.1% | 3 |
| pa.Improved 1.0 | 9.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.2 | 5.8% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 26 / 35 | 5563 |
| 2 | 1 | 67.5 | 84.1 | 17 / 35 | 5365 |
| 3 | 1 | 66.8 | 79.0 | 21 / 35 | 5044 |
| 4 | 1 | 70.2 | 92.4 | 25 / 35 | 5488 |
| 5 | 1 | 69.0 | 86.0 | 25 / 35 | 5299 |
| 6 | 1 | 67.3 | 83.5 | 19 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 84% |
| oog.melee.CapuletDroid 1.1 | 38 | 97% |
| gh.nano.Grofvuil 0.2 | 13 | 92% |
| arthord.NanoSatanMelee Beta | 11 | 91% |
| sample.SpinBot 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 50% |
| fm.claire 1.7 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 30% | 71 |
| arthord.NanoSatanMelee Beta | 13 | 17% | 24 |
| kurios.DOSexe .9b | 13 | 17% | 19 |
| gh.nano.Grofvuil 0.2 | 12 | 16% | 28 |
| fm.claire 1.7 | 6 | 8% | 9 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 40 |
| winamp32.micro.MicroMacro 1.0 | 3 | 4% | 8 |
| sample.SpinBot 1.0 | 3 | 4% | 5 |
| pa.Improved 1.0 | 1 | 1% | 5 |

## Melee bench: F07

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.6 | 105 / 210 | 2.56 | 18.5% | 34719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.5% | 105 |
| gh.micro.Gruweltje 0.7 | 2.0 | 14.7% | 32 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 30 |
| mz.MicroGodMelee 1 | 3.7 | 12.8% | 32 |
| DBall.Anarchy 0.1 | 5.3 | 8.8% | 5 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.4% | 0 |
| acogdev.alpha 0.2 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.3 | 5.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 15 / 35 | 5797 |
| 2 | 1 | 66.8 | 75.2 | 19 / 35 | 5600 |
| 3 | 1 | 69.4 | 87.6 | 21 / 35 | 5849 |
| 4 | 1 | 69.3 | 88.9 | 19 / 35 | 5877 |
| 5 | 1 | 68.5 | 83.5 | 17 / 35 | 5856 |
| 6 | 1 | 66.9 | 80.0 | 14 / 35 | 5740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 50 | 80% |
| mz.MicroGodMelee 1 | 37 | 59% |
| gh.micro.Gruweltje 0.7 | 28 | 68% |
| DBall.Anarchy 0.1 | 12 | 100% |
| mbro.Detektor3 0.1.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 33 | 31% | 53 |
| spinnercat.micro.Tyger 0.1 | 31 | 30% | 65 |
| gh.micro.Gruweltje 0.7 | 22 | 21% | 50 |
| DBall.Anarchy 0.1 | 5 | 5% | 14 |
| acogdev.alpha 0.2 | 5 | 5% | 10 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 76.1 | 130 / 210 | 3.15 | 17.8% | 32431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.8% | 130 |
| simonton.micro.Sprout 1.1.3 | 2.3 | 14.3% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.6% | 37 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.4% | 6 |
| germ.TheMind .2 | 5.0 | 9.0% | 2 |
| awesomeness.Elite 1.0 | 6.2 | 8.6% | 6 |
| lrem.micro.MoggFanatic 0.2 | 7.2 | 7.9% | 1 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.9% | 3 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 80.0 | 25 / 35 | 5570 |
| 2 | 1 | 66.6 | 74.6 | 20 / 35 | 5286 |
| 3 | 1 | 63.5 | 66.3 | 19 / 35 | 4862 |
| 4 | 1 | 64.6 | 68.6 | 19 / 35 | 5100 |
| 5 | 1 | 69.8 | 87.6 | 24 / 35 | 5860 |
| 6 | 1 | 68.2 | 79.7 | 23 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 86% |
| germ.TheMind .2 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 7 | 71% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 54% | 107 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 15% | 29 |
| awesomeness.Elite 1.0 | 6 | 8% | 17 |
| germ.TheMind .2 | 5 | 6% | 17 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 10 |
| qualidafial.MajorDick 1.0.1 | 4 | 5% | 12 |
| lrem.micro.MoggFanatic 0.2 | 3 | 4% | 9 |
| mym.EdgeStalker 1.0 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.0 | 153 / 210 | 1.90 | 20.4% | 31732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.4% | 153 |
| rz.HawkOnFire 0.1 | 2.2 | 13.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.2% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.5 | 10.1% | 5 |
| maribo.IotaCT 1.1 | 5.0 | 10.1% | 6 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.4% | 9 |
| ratosh.Wesco 1.4 | 7.3 | 8.2% | 1 |
| stelo.PatternRobot 1.0 | 8.0 | 7.7% | 9 |
| spinnercat.Omen 1.0 | 8.3 | 7.3% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.3 | 24 / 35 | 4824 |
| 2 | 1 | 71.4 | 91.1 | 26 / 35 | 5518 |
| 3 | 1 | 70.9 | 92.7 | 29 / 35 | 4839 |
| 4 | 1 | 71.6 | 93.3 | 25 / 35 | 5934 |
| 5 | 1 | 70.1 | 86.7 | 24 / 35 | 5124 |
| 6 | 1 | 71.0 | 89.8 | 25 / 35 | 5493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 72 | 100% |
| nz.jdc.nano.GridFu 1.0 | 33 | 94% |
| stelo.PatternRobot 1.0 | 20 | 70% |
| maribo.IotaCT 1.1 | 13 | 85% |
| timmit.nano.TimDog 0.33 | 12 | 58% |
| ratosh.Wesco 1.4 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 71% |
| spinnercat.Omen 1.0 | 6 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PatternRobot 1.0 | 15 | 26% | 23 |
| timmit.nano.TimDog 0.33 | 14 | 25% | 27 |
| nz.jdc.nano.GridFu 1.0 | 12 | 21% | 49 |
| rz.HawkOnFire 0.1 | 6 | 11% | 67 |
| maribo.IotaCT 1.1 | 4 | 7% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 13 |
| ratosh.Wesco 1.4 | 2 | 4% | 7 |
| spinnercat.Omen 1.0 | 0 | 0% | 6 |

## Melee bench: F10

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.1 | 180 / 210 | 1.53 | 21.8% | 39237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 21.8% | 180 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 9 |
| baal.nano.N 1.42 | 2.7 | 11.5% | 9 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 5.3 | 9.0% | 1 |
| sanja.First 0.1 | 6.0 | 8.5% | 3 |
| zyx.micro.Ant 1.1 | 6.2 | 8.5% | 4 |
| amk.Punbot.Punbot 0.01 | 8.5 | 6.9% | 0 |
| cvt.Firsty 1.0 | 8.7 | 6.7% | 3 |
| sample.RamFire 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.6 | 28 / 35 | 6535 |
| 2 | 1 | 71.2 | 93.0 | 29 / 35 | 6294 |
| 3 | 1 | 71.8 | 93.3 | 31 / 35 | 6389 |
| 4 | 1 | 73.1 | 95.9 | 32 / 35 | 7234 |
| 5 | 1 | 72.1 | 95.9 | 30 / 35 | 6500 |
| 6 | 1 | 71.3 | 92.1 | 30 / 35 | 6285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 49 | 94% |
| baal.nano.N 1.42 | 31 | 90% |
| cvt.Firsty 1.0 | 27 | 96% |
| sanja.First 0.1 | 25 | 96% |
| zyx.micro.Ant 1.1 | 23 | 87% |
| Grystrion.TrackerWO 1.0 | 15 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 80% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 23% | 27 |
| tvv.nano.Polaris 1.2 | 6 | 19% | 64 |
| baal.nano.N 1.42 | 5 | 16% | 39 |
| sanja.First 0.1 | 4 | 13% | 25 |
| Grystrion.TrackerWO 1.0 | 3 | 10% | 15 |
| squidM.TentalceMeleeNano 1.1 | 3 | 10% | 14 |
| cvt.Firsty 1.0 | 1 | 3% | 17 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 5 |
| sample.RamFire 1.0 | 1 | 3% | 1 |

## Melee bench: F11

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 68.1 | 81 / 210 | 3.87 | 15.7% | 32528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.3 | 15.7% | 81 |
| kc.micro.Figment 1.0 | 1.7 | 15.0% | 65 |
| cs.Wren 1.0 | 3.0 | 12.6% | 20 |
| mz.Cork 0.1 | 4.7 | 11.1% | 14 |
| js.PinBall 1.6 | 4.7 | 11.0% | 17 |
| joe.ADinosaur 1.0 | 5.7 | 9.6% | 6 |
| evd.X1 0.01 | 7.0 | 7.9% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.6% | 4 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 3 |
| PSW.Relentless 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 73.3 | 19 / 35 | 5499 |
| 2 | 1 | 62.8 | 66.7 | 14 / 35 | 5203 |
| 3 | 2 | 64.1 | 70.5 | 9 / 35 | 5467 |
| 4 | 2 | 60.3 | 56.8 | 14 / 35 | 5028 |
| 5 | 1 | 64.4 | 70.5 | 12 / 35 | 5654 |
| 6 | 1 | 64.4 | 71.1 | 13 / 35 | 5677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 57 | 61% |
| cs.Wren 1.0 | 29 | 90% |
| mz.Cork 0.1 | 12 | 92% |
| js.PinBall 1.6 | 7 | 86% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 49% | 107 |
| cs.Wren 1.0 | 15 | 12% | 27 |
| joe.ADinosaur 1.0 | 11 | 8% | 11 |
| mz.Cork 0.1 | 10 | 8% | 23 |
| evd.X1 0.01 | 10 | 8% | 11 |
| js.PinBall 1.6 | 9 | 7% | 15 |
| PSW.Relentless 0.1 | 8 | 6% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |

## Melee bench: F12

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 151 / 210 | 1.98 | 20.3% | 31240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.3% | 151 |
| ntc.Opposite 1.5 | 2.8 | 11.8% | 11 |
| myl.nano.Graviton 1.10 | 3.0 | 11.3% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 10.4% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.2 | 9.6% | 14 |
| pfvicm.Sobieski 7.2.3b | 5.8 | 8.8% | 2 |
| disan.Chair 2.2.0 | 7.2 | 8.1% | 5 |
| DBall.NUKE 0.1 | 7.2 | 8.3% | 4 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 27 / 35 | 5259 |
| 2 | 1 | 71.5 | 95.6 | 29 / 35 | 5208 |
| 3 | 1 | 70.8 | 90.8 | 25 / 35 | 5545 |
| 4 | 1 | 67.1 | 80.3 | 20 / 35 | 4989 |
| 5 | 1 | 69.8 | 90.5 | 26 / 35 | 5035 |
| 6 | 1 | 69.7 | 87.6 | 24 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 49 | 90% |
| ntc.Opposite 1.5 | 34 | 85% |
| stelo.AreaTargetingBot 1.1 | 30 | 93% |
| DBall.NUKE 0.1 | 17 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| disan.Chair 2.2.0 | 10 | 70% |
| donjezza.Muncho 1.0 | 6 | 83% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 14 | 23% | 35 |
| ntc.Opposite 1.5 | 12 | 20% | 36 |
| myl.nano.Graviton 1.10 | 10 | 16% | 46 |
| pfvicm.Sobieski 7.2.3b | 10 | 16% | 22 |
| disan.Chair 2.2.0 | 7 | 11% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 5% | 25 |
| pbg.R2D2 1.0 | 2 | 3% | 11 |
| donjezza.Muncho 1.0 | 2 | 3% | 6 |
| DBall.NUKE 0.1 | 1 | 2% | 14 |

## Melee bench: F13

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 74.2 | 84 / 210 | 3.32 | 16.0% | 26446 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 16.0% | 84 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.5% | 36 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.6% | 23 |
| yagami.Tidus 0.11 | 4.7 | 11.6% | 12 |
| ejb.Polaris 1.0.1 | 5.8 | 10.3% | 4 |
| stelo.MirrorNano 1.3 | 7.2 | 8.1% | 1 |
| step.nanoPri 1.0 | 7.8 | 7.5% | 3 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 73.3 | 14 / 35 | 4576 |
| 2 | 1 | 63.5 | 70.2 | 13 / 35 | 4314 |
| 3 | 1 | 67.6 | 84.8 | 14 / 35 | 4678 |
| 4 | 1 | 65.1 | 74.6 | 16 / 35 | 4430 |
| 5 | 2 | 61.3 | 63.8 | 11 / 35 | 4018 |
| 6 | 1 | 66.2 | 78.7 | 16 / 35 | 4430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 72% |
| kawigi.micro.Shiz 1.1 | 30 | 87% |
| oog.melee.Capulet 1.2 | 29 | 45% |
| yagami.Tidus 0.11 | 18 | 94% |
| stelo.MirrorNano 1.3 | 3 | 100% |
| step.nanoPri 1.0 | 3 | 33% |
| ejb.Polaris 1.0.1 | 2 | 50% |

Hadur died in 128 of 210 rounds, at a mean tick of 646. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 49 | 38% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 19% | 48 |
| yagami.Tidus 0.11 | 23 | 18% | 36 |
| ejb.Polaris 1.0.1 | 8 | 6% | 16 |
| step.nanoPri 1.0 | 8 | 6% | 9 |
| kawigi.micro.Shiz 1.1 | 7 | 5% | 26 |
| stelo.MirrorNano 1.3 | 5 | 4% | 8 |
| kurios.DOSexe .9a | 4 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.0 | 136 / 210 | 2.71 | 17.9% | 28469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 17.9% | 136 |
| bzdp.Pansy 2.1 | 3.0 | 11.7% | 15 |
| ratosh.Nobo 0.21 | 3.5 | 11.5% | 17 |
| wompi.Quokka 1.6 | 3.8 | 11.3% | 15 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 17 |
| bayen.UbaMicro 1.4 | 6.3 | 9.4% | 7 |
| m3thos.Eva00 1.1 | 6.5 | 9.0% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.3% | 1 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 19 / 35 | 5024 |
| 2 | 1 | 67.1 | 82.5 | 23 / 35 | 4559 |
| 3 | 1 | 65.9 | 78.1 | 22 / 35 | 4511 |
| 4 | 1 | 69.3 | 89.5 | 26 / 35 | 5183 |
| 5 | 1 | 66.0 | 77.8 | 23 / 35 | 4482 |
| 6 | 1 | 66.3 | 78.4 | 23 / 35 | 4710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 96% |
| wee.Gem 1.8.4 | 32 | 94% |
| wompi.Quokka 1.6 | 23 | 83% |
| ratosh.Nobo 0.21 | 19 | 84% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| m3thos.Eva00 1.1 | 9 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 15 | 20% | 31 |
| bzdp.Pansy 2.1 | 13 | 18% | 55 |
| wompi.Quokka 1.6 | 11 | 15% | 25 |
| maribo.FollowFire 1 | 9 | 12% | 9 |
| stelo.MyAgileRobot 0.2 | 8 | 11% | 8 |
| bayen.UbaMicro 1.4 | 7 | 9% | 15 |
| wee.Gem 1.8.4 | 5 | 7% | 43 |
| m3thos.Eva00 1.1 | 3 | 4% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 4% | 6 |

## Melee bench: F15

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.1 | 122 / 210 | 2.16 | 21.1% | 46356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.2 | 21.1% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 17.2% | 60 |
| mz.NanoGod 2.02 | 2.8 | 14.7% | 19 |
| ayk.WallHugger 1.0 | 4.7 | 9.2% | 1 |
| exauge.GateKeeper 1.1.121g | 4.7 | 9.5% | 4 |
| stuff.Vlad 0.1 | 6.2 | 8.0% | 1 |
| stelo.PianistNano 1.2 | 6.5 | 7.8% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 5.8% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 91.1 | 20 / 35 | 7779 |
| 2 | 2 | 69.3 | 75.6 | 15 / 35 | 7045 |
| 3 | 1 | 73.1 | 90.2 | 20 / 35 | 8076 |
| 4 | 1 | 72.9 | 89.2 | 21 / 35 | 8079 |
| 5 | 1 | 73.1 | 89.5 | 24 / 35 | 8016 |
| 6 | 1 | 71.9 | 87.3 | 22 / 35 | 7361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 97 | 76% |
| exauge.GateKeeper 1.1.121g | 18 | 83% |
| mz.NanoGod 2.02 | 14 | 50% |
| drd.Dreadknoght 0.9 | 13 | 92% |
| stelo.PianistNano 1.2 | 8 | 75% |
| ayk.WallHugger 1.0 | 6 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 43% | 121 |
| mz.NanoGod 2.02 | 32 | 36% | 45 |
| ayk.WallHugger 1.0 | 8 | 9% | 11 |
| exauge.GateKeeper 1.1.121g | 4 | 4% | 7 |
| stelo.PianistNano 1.2 | 3 | 3% | 9 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| drd.Dreadknoght 0.9 | 1 | 1% | 10 |

## Melee bench: F16

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 71.0 | 99 / 210 | 3.61 | 16.2% | 28247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 16.2% | 99 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.5% | 31 |
| bvh.micro.Freya 0.3 | 3.5 | 11.0% | 18 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 24 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.3% | 3 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 3 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 6.3% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 69.8 | 17 / 35 | 4225 |
| 2 | 1 | 61.7 | 61.3 | 14 / 35 | 4844 |
| 3 | 1 | 66.3 | 79.0 | 18 / 35 | 5055 |
| 4 | 1 | 61.6 | 62.5 | 14 / 35 | 4457 |
| 5 | 1 | 66.9 | 80.0 | 20 / 35 | 4883 |
| 6 | 1 | 64.8 | 73.0 | 16 / 35 | 4783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 90% |
| dummy.micro.Sparrow 2.5 | 30 | 87% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 64% |
| bvh.micro.Freya 0.3 | 15 | 80% |
| stelo.MirrorMicro 1.0 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 22% | 60 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 21% | 24 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 18% | 37 |
| dummy.micro.Sparrow 2.5 | 15 | 14% | 39 |
| conscience.Electron 1.3g | 9 | 8% | 11 |
| stelo.MirrorMicro 1.0 | 8 | 7% | 16 |
| dl.BetterWalls 1.0 | 7 | 6% | 9 |
| bvh.micro.Freya 0.3 | 5 | 5% | 14 |

## Melee bench: F17

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 84.1 | 144 / 210 | 2.43 | 20.6% | 40100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 20.6% | 144 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.8% | 21 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 15 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.4% | 13 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.4% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.8% | 4 |
| tlp.ThreeLeggedPig 1 | 7.0 | 7.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.0% | 3 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.8% | 4 |
| sample.Corners 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 85.1 | 23 / 35 | 6485 |
| 2 | 1 | 70.8 | 82.9 | 22 / 35 | 7062 |
| 3 | 1 | 70.5 | 82.2 | 25 / 35 | 6817 |
| 4 | 1 | 70.7 | 82.9 | 22 / 35 | 6696 |
| 5 | 1 | 71.6 | 88.3 | 28 / 35 | 6383 |
| 6 | 1 | 70.3 | 83.2 | 24 / 35 | 6657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 91% |
| sul.Lunar 1.1 | 43 | 100% |
| supersample.SuperBoxBot 1.0 | 30 | 83% |
| mme.NikeEnhanced 2.0 | 10 | 90% |
| dsw.StaticD 1.0 | 7 | 71% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 19 | 29% | 74 |
| supersample.SuperBoxBot 1.0 | 17 | 26% | 37 |
| dsw.StaticD 1.0 | 10 | 15% | 16 |
| mme.NikeEnhanced 2.0 | 7 | 11% | 15 |
| sul.Lunar 1.1 | 5 | 8% | 48 |
| tlp.ThreeLeggedPig 1 | 5 | 8% | 7 |
| sample.Corners 1.0 | 3 | 5% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F18

hadur117.micro.SaorWDG 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v338, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.0 | 110 / 210 | 2.71 | 18.7% | 38555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWDG 0.1 | 1.0 | 18.7% | 110 |
| radnor.DoctorBob 1.42 | 2.5 | 13.1% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 11.8% | 29 |
| mld.Wisdom 1.0 | 3.7 | 11.5% | 17 |
| KiraNL.Chupacabra 0.4 | 5.2 | 9.7% | 5 |
| amz.NanoClone 1.41 | 5.3 | 9.7% | 11 |
| sample.Walls 1.0 | 7.2 | 7.8% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 7.8% | 1 |
| jangs.ns51 1.0 | 9.0 | 5.9% | 3 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.2 | 20 / 35 | 6497 |
| 2 | 1 | 65.4 | 72.4 | 15 / 35 | 5780 |
| 3 | 1 | 68.7 | 82.2 | 19 / 35 | 6466 |
| 4 | 1 | 69.2 | 84.1 | 19 / 35 | 6828 |
| 5 | 1 | 67.8 | 81.0 | 17 / 35 | 6471 |
| 6 | 1 | 69.0 | 83.8 | 20 / 35 | 6513 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 46 | 85% |
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 20 | 70% |
| amz.NanoClone 1.41 | 7 | 71% |
| jangs.ns51 1.0 | 6 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| GarmBox.Oranges 1.0 | 6 | 100% |
| KiraNL.Chupacabra 0.4 | 6 | 83% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 29% | 46 |
| radnor.DoctorBob 1.42 | 27 | 27% | 54 |
| KiraNL.Chupacabra 0.4 | 16 | 16% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 12% | 52 |
| amz.NanoClone 1.41 | 9 | 9% | 12 |
| sample.Walls 1.0 | 3 | 3% | 9 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 4 |

