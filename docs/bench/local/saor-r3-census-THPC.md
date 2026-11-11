# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 89.0 | 154 / 210 | 1.99 | 21.3% | 42654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 21.3% | 154 |
| radnor.DoctorBob 1.42 | 2.2 | 14.6% | 17 |
| mz.AntiGrav 1.0 | 3.0 | 14.2% | 18 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 14 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 6 |
| sample.Walls 1.0 | 6.5 | 6.7% | 1 |
| GarmBox.Oranges 1.0 | 7.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.0 | 4.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 81.9 | 24 / 35 | 6244 |
| 2 | 1 | 72.7 | 88.9 | 26 / 35 | 7431 |
| 3 | 1 | 72.7 | 93.3 | 26 / 35 | 7164 |
| 4 | 1 | 71.7 | 86.7 | 23 / 35 | 7085 |
| 5 | 1 | 72.5 | 90.5 | 26 / 35 | 7338 |
| 6 | 1 | 73.6 | 92.7 | 29 / 35 | 7392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 71 | 93% |
| mld.Infinity 2.2 | 43 | 91% |
| radnor.DoctorBob 1.42 | 39 | 92% |
| amz.NanoClone 1.41 | 10 | 70% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 51% | 89 |
| amz.NanoClone 1.41 | 8 | 14% | 16 |
| mz.AntiGrav 1.0 | 7 | 12% | 64 |
| mld.Infinity 2.2 | 5 | 9% | 13 |
| GarmBox.Oranges 1.0 | 5 | 9% | 7 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| sample.Walls 1.0 | 1 | 2% | 12 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.4 | 119 / 210 | 2.85 | 17.3% | 27725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.2 | 17.3% | 119 |
| oog.melee.Mercutio 1.0 | 1.8 | 15.6% | 59 |
| mld.DustBunny 3.8 | 3.0 | 13.9% | 15 |
| maribo.melee.BMV 0.1 | 4.2 | 10.9% | 2 |
| zyx.nano.Ant 1.1 | 5.2 | 9.0% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.8% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.7% | 5 |
| bzdp.BoxCar 2.0 | 7.8 | 7.1% | 1 |
| fullsail.SweetTea 1.1 | 8.2 | 6.6% | 5 |
| cs.Grudge 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 24 / 35 | 4927 |
| 2 | 1 | 67.5 | 86.7 | 21 / 35 | 4370 |
| 3 | 1 | 65.8 | 76.5 | 20 / 35 | 4601 |
| 4 | 1 | 66.6 | 79.7 | 21 / 35 | 4450 |
| 5 | 1 | 67.7 | 87.6 | 24 / 35 | 4273 |
| 6 | 2 | 62.1 | 57.8 | 9 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 84 | 81% |
| mld.DustBunny 3.8 | 41 | 88% |
| maribo.melee.BMV 0.1 | 7 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 75% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 31% | 95 |
| mld.DustBunny 3.8 | 16 | 18% | 45 |
| maribo.melee.BMV 0.1 | 12 | 13% | 21 |
| fullsail.SweetTea 1.1 | 11 | 12% | 13 |
| zyx.nano.Ant 1.1 | 8 | 9% | 11 |
| bzdp.BoxCar 2.0 | 5 | 5% | 5 |
| cs.Grudge 1.0 | 5 | 5% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 6 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 9 |

## Melee bench: F03

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 84.3 | 145 / 210 | 2.41 | 19.9% | 35279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 19.9% | 145 |
| myl.micro.Troodon 1.10 | 2.0 | 14.2% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.2% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.8% | 13 |
| cb.nano.Insomnia 1.0 | 5.2 | 9.5% | 8 |
| fm.mammillarias 1.3 | 6.0 | 8.4% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.7% | 3 |
| sample.Fire 1.0 | 9.2 | 5.0% | 2 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.8 | 29 / 35 | 6329 |
| 2 | 1 | 66.5 | 74.3 | 20 / 35 | 5218 |
| 3 | 1 | 66.5 | 73.7 | 20 / 35 | 5468 |
| 4 | 1 | 72.5 | 93.7 | 29 / 35 | 6219 |
| 5 | 1 | 70.9 | 87.0 | 25 / 35 | 6207 |
| 6 | 1 | 69.8 | 86.3 | 22 / 35 | 5838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 58 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 37 | 97% |
| myl.nano.KomoriNinja 1.1 | 23 | 96% |
| cb.nano.Insomnia 1.0 | 22 | 91% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| fm.mammillarias 1.3 | 4 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 13 | 20% | 71 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 18% | 43 |
| myl.nano.KomoriNinja 1.1 | 10 | 15% | 39 |
| fm.mammillarias 1.3 | 10 | 15% | 14 |
| sp.Nanos.Ember 1.1 | 5 | 8% | 17 |
| cb.nano.Insomnia 1.0 | 5 | 8% | 8 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 8 |
| sample.Fire 1.0 | 4 | 6% | 6 |
| sample.Tracker 1.0 | 2 | 3% | 2 |

## Melee bench: F04

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.8 | 167 / 210 | 1.82 | 21.2% | 38671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 21.2% | 167 |
| tvv.micro.Antares 1.1.1 | 2.5 | 12.5% | 10 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 13 |
| tj.zombie1n 1.0.1 | 5.2 | 9.0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.5% | 2 |
| yk.JahMicro 1.0 | 6.3 | 8.0% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 6.8 | 8.1% | 3 |
| repositorio.NanoStep 1.0 | 8.5 | 6.7% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 86.3 | 25 / 35 | 6338 |
| 2 | 1 | 72.1 | 91.4 | 27 / 35 | 7134 |
| 3 | 1 | 71.3 | 92.4 | 29 / 35 | 5964 |
| 4 | 1 | 70.8 | 88.9 | 27 / 35 | 6334 |
| 5 | 1 | 71.0 | 90.5 | 29 / 35 | 6001 |
| 6 | 1 | 72.7 | 95.6 | 30 / 35 | 6900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 81 | 90% |
| stelo.SoJNanoMelee 1.1 | 32 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 22 | 95% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| yk.JahMicro 1.0 | 13 | 85% |
| tj.zombie1n 1.0.1 | 11 | 64% |
| repositorio.NanoStep 1.0 | 6 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 42% | 92 |
| tvv.micro.Antares 1.1.1 | 7 | 16% | 38 |
| tj.zombie1n 1.0.1 | 7 | 16% | 11 |
| stelo.SoJNanoMelee 1.1 | 3 | 7% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 5% | 28 |
| yk.JahMicro 1.0 | 2 | 5% | 7 |
| sample.VelociRobot 1.0 | 2 | 5% | 2 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |

## Melee bench: F05

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 67.9 | 96 / 210 | 3.89 | 15.8% | 30002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.2 | 15.8% | 96 |
| oog.melee.Corsair 1.0 | 1.8 | 13.4% | 36 |
| ahf.NanoAndrew .4 | 3.3 | 11.6% | 24 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.6% | 14 |
| sam.Samspin 1.0 | 5.2 | 10.5% | 20 |
| EBBU.Sim2 1.02 | 5.8 | 9.6% | 6 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 8.8% | 7 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.6 | 60.6 | 13 / 35 | 4425 |
| 2 | 1 | 64.6 | 70.8 | 18 / 35 | 5232 |
| 3 | 1 | 65.6 | 75.9 | 20 / 35 | 5181 |
| 4 | 1 | 62.4 | 64.8 | 12 / 35 | 5104 |
| 5 | 2 | 61.4 | 63.5 | 14 / 35 | 4593 |
| 6 | 1 | 65.7 | 71.7 | 19 / 35 | 5467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 39 | 62% |
| simonton.nano.MeleeSeed 1.8 | 27 | 96% |
| ahf.NanoAndrew .4 | 25 | 88% |
| sam.Samspin 1.0 | 10 | 100% |
| robar.nano.Assertive_Melee 0.2 | 9 | 67% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 115 of 210 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 23% | 53 |
| simonton.nano.MeleeSeed 1.8 | 21 | 18% | 45 |
| bwbaugh.nano.Tirunculus 0.0.0a | 16 | 14% | 15 |
| ahf.NanoAndrew .4 | 15 | 13% | 38 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 20 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 11 |
| EBBU.Sim2 1.02 | 8 | 7% | 11 |
| sam.Samspin 1.0 | 4 | 3% | 14 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |

## Melee bench: F06

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.0 | 141 / 210 | 2.26 | 19.2% | 30781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 19.2% | 141 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 17 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.8% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.4% | 22 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.4% | 7 |
| arthord.NanoSatanMelee Beta | 5.8 | 8.7% | 4 |
| fm.claire 1.7 | 6.7 | 8.2% | 0 |
| pa.Improved 1.0 | 8.8 | 5.9% | 1 |
| kurios.DOSexe .9b | 9.0 | 5.6% | 2 |
| sample.SpinBot 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.2 | 23 / 35 | 5183 |
| 2 | 1 | 68.8 | 86.0 | 23 / 35 | 5058 |
| 3 | 1 | 70.1 | 90.8 | 26 / 35 | 5361 |
| 4 | 1 | 69.4 | 89.8 | 26 / 35 | 5027 |
| 5 | 1 | 68.8 | 85.4 | 24 / 35 | 5110 |
| 6 | 1 | 67.4 | 81.0 | 19 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 95% |
| oog.melee.CapuletDroid 1.1 | 40 | 80% |
| gh.nano.Grofvuil 0.2 | 19 | 84% |
| winamp32.micro.MicroMacro 1.0 | 10 | 70% |
| arthord.NanoSatanMelee Beta | 7 | 71% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 25% | 85 |
| oog.melee.CapuletDroid 1.1 | 13 | 19% | 17 |
| gh.nano.Grofvuil 0.2 | 11 | 16% | 39 |
| winamp32.micro.MicroMacro 1.0 | 7 | 10% | 19 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 13 |
| fm.claire 1.7 | 6 | 9% | 12 |
| kurios.DOSexe .9b | 4 | 6% | 14 |
| sample.SpinBot 1.0 | 2 | 3% | 6 |
| pa.Improved 1.0 | 2 | 3% | 4 |

## Melee bench: F07

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.9 | 97 / 210 | 2.72 | 17.9% | 32807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 17.9% | 97 |
| gh.micro.Gruweltje 0.7 | 2.5 | 15.0% | 48 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.9% | 23 |
| mz.MicroGodMelee 1 | 3.3 | 13.8% | 34 |
| DBall.Anarchy 0.1 | 5.3 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.3% | 2 |
| acogdev.alpha 0.2 | 8.5 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 8.8 | 5.4% | 2 |
| fire219.CatBot 1.0 | 8.8 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.2 | 17 / 35 | 5556 |
| 2 | 1 | 67.5 | 80.3 | 16 / 35 | 5384 |
| 3 | 1 | 65.6 | 76.8 | 14 / 35 | 5053 |
| 4 | 1 | 65.8 | 74.0 | 14 / 35 | 5284 |
| 5 | 1 | 67.2 | 82.2 | 16 / 35 | 5441 |
| 6 | 1 | 70.1 | 88.9 | 20 / 35 | 6089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.MicroGodMelee 1 | 53 | 55% |
| spinnercat.micro.Tyger 0.1 | 50 | 94% |
| gh.micro.Gruweltje 0.7 | 30 | 30% |
| DBall.Anarchy 0.1 | 6 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 48 | 42% | 78 |
| gh.micro.Gruweltje 0.7 | 37 | 32% | 56 |
| spinnercat.micro.Tyger 0.1 | 13 | 11% | 50 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| fire219.CatBot 1.0 | 4 | 4% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 72.2 | 113 / 210 | 3.50 | 16.7% | 31346 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.3 | 16.7% | 113 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.8% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.7% | 27 |
| qualidafial.MajorDick 1.0.1 | 4.5 | 9.8% | 6 |
| germ.TheMind .2 | 5.7 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 5.7 | 8.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.0% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 7.4% | 5 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.2 | 19 / 35 | 5086 |
| 2 | 1 | 62.7 | 63.5 | 15 / 35 | 5331 |
| 3 | 2 | 62.8 | 66.0 | 15 / 35 | 4715 |
| 4 | 2 | 63.9 | 68.3 | 18 / 35 | 5108 |
| 5 | 1 | 67.3 | 78.1 | 23 / 35 | 5297 |
| 6 | 1 | 69.0 | 81.9 | 23 / 35 | 5809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 76% |
| germ.TheMind .2 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 42% | 103 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 30% | 45 |
| germ.TheMind .2 | 9 | 9% | 17 |
| awesomeness.Elite 1.0 | 6 | 6% | 11 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 11 |
| qualidafial.MajorDick 1.0.1 | 4 | 4% | 9 |
| mym.EdgeStalker 1.0 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 5 |

## Melee bench: F09

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.3 | 156 / 210 | 2.06 | 20.0% | 31091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 20.0% | 156 |
| rz.HawkOnFire 0.1 | 2.0 | 13.8% | 11 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.7% | 8 |
| timmit.nano.TimDog 0.33 | 4.7 | 10.6% | 13 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.7% | 1 |
| ratosh.Wesco 1.4 | 6.8 | 8.7% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 7.4% | 3 |
| stelo.PatternRobot 1.0 | 8.0 | 7.6% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 26 / 35 | 5277 |
| 2 | 1 | 69.8 | 87.9 | 26 / 35 | 4709 |
| 3 | 1 | 71.6 | 90.2 | 28 / 35 | 5786 |
| 4 | 1 | 68.4 | 81.3 | 21 / 35 | 5286 |
| 5 | 1 | 69.1 | 85.4 | 25 / 35 | 4737 |
| 6 | 1 | 71.8 | 92.4 | 30 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 83 | 99% |
| nz.jdc.nano.GridFu 1.0 | 32 | 100% |
| timmit.nano.TimDog 0.33 | 17 | 82% |
| stelo.PatternRobot 1.0 | 13 | 92% |
| maribo.IotaCT 1.1 | 10 | 70% |
| ratosh.Wesco 1.4 | 6 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 18 | 33% | 39 |
| rz.HawkOnFire 0.1 | 11 | 20% | 66 |
| stelo.PatternRobot 1.0 | 8 | 15% | 19 |
| nz.jdc.nano.GridFu 1.0 | 7 | 13% | 49 |
| ratosh.Wesco 1.4 | 3 | 6% | 12 |
| maribo.IotaCT 1.1 | 3 | 6% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 9 |
| spinnercat.Omen 1.0 | 1 | 2% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.4 | 185 / 210 | 1.50 | 21.8% | 37075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 21.8% | 185 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.8% | 6 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 2 |
| Grystrion.TrackerWO 1.0 | 4.8 | 9.1% | 2 |
| zyx.micro.Ant 1.1 | 4.8 | 9.4% | 5 |
| sanja.First 0.1 | 5.7 | 9.2% | 6 |
| cvt.Firsty 1.0 | 7.3 | 7.5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.2 | 32 / 35 | 6312 |
| 2 | 1 | 71.4 | 94.0 | 31 / 35 | 5858 |
| 3 | 1 | 71.2 | 90.8 | 30 / 35 | 6244 |
| 4 | 1 | 72.7 | 99.0 | 33 / 35 | 6171 |
| 5 | 1 | 72.1 | 95.6 | 31 / 35 | 6162 |
| 6 | 1 | 71.2 | 91.1 | 28 / 35 | 6328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 41 | 98% |
| tvv.nano.Polaris 1.2 | 36 | 100% |
| sanja.First 0.1 | 31 | 90% |
| cvt.Firsty 1.0 | 28 | 100% |
| zyx.micro.Ant 1.1 | 22 | 91% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| Grystrion.TrackerWO 1.0 | 12 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 35% | 40 |
| tvv.nano.Polaris 1.2 | 5 | 19% | 61 |
| sanja.First 0.1 | 5 | 19% | 26 |
| baal.nano.N 1.42 | 2 | 8% | 35 |
| amk.Punbot.Punbot 0.01 | 2 | 8% | 5 |
| sample.RamFire 1.0 | 2 | 8% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 4% | 17 |
| cvt.Firsty 1.0 | 0 | 0% | 18 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.1 | 79 / 210 | 3.78 | 15.2% | 28641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 16.0% | 74 |
| hadur117.micro.SaorTHPC 0.1 | 1.8 | 15.2% | 79 |
| cs.Wren 1.0 | 3.2 | 12.6% | 20 |
| js.PinBall 1.6 | 4.3 | 11.3% | 14 |
| mz.Cork 0.1 | 5.0 | 10.6% | 3 |
| joe.ADinosaur 1.0 | 5.5 | 10.2% | 5 |
| evd.X1 0.01 | 7.3 | 7.3% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 4 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 7 |
| PSW.Relentless 0.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 69.8 | 13 / 35 | 4681 |
| 2 | 2 | 64.2 | 70.8 | 15 / 35 | 4762 |
| 3 | 1 | 64.4 | 71.4 | 15 / 35 | 5175 |
| 4 | 2 | 62.8 | 70.8 | 12 / 35 | 4551 |
| 5 | 2 | 64.6 | 73.7 | 16 / 35 | 4923 |
| 6 | 2 | 59.4 | 58.1 | 8 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 77 | 64% |
| mz.Cork 0.1 | 11 | 100% |
| cs.Wren 1.0 | 9 | 78% |
| js.PinBall 1.6 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 60% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 1 | 0% |

Hadur died in 131 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 59 | 45% | 110 |
| joe.ADinosaur 1.0 | 18 | 14% | 21 |
| evd.X1 0.01 | 13 | 10% | 13 |
| js.PinBall 1.6 | 12 | 9% | 18 |
| mz.Cork 0.1 | 11 | 8% | 18 |
| cs.Wren 1.0 | 10 | 8% | 17 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |

## Melee bench: F12

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.5 | 139 / 210 | 2.49 | 18.9% | 29259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 18.9% | 139 |
| myl.nano.Graviton 1.10 | 2.7 | 12.0% | 27 |
| ntc.Opposite 1.5 | 3.2 | 11.7% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.0 | 9.5% | 16 |
| pfvicm.Sobieski 7.2.3b | 6.0 | 9.4% | 2 |
| disan.Chair 2.2.0 | 6.5 | 8.6% | 5 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 8.8 | 6.4% | 6 |
| pbg.R2D2 1.0 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.0 | 22 / 35 | 4951 |
| 2 | 1 | 67.5 | 81.9 | 24 / 35 | 4765 |
| 3 | 1 | 68.5 | 84.4 | 23 / 35 | 4857 |
| 4 | 1 | 70.1 | 87.6 | 27 / 35 | 5623 |
| 5 | 1 | 67.0 | 80.6 | 22 / 35 | 4441 |
| 6 | 1 | 67.8 | 85.4 | 21 / 35 | 4622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 41 | 90% |
| ntc.Opposite 1.5 | 28 | 79% |
| stelo.AreaTargetingBot 1.1 | 21 | 90% |
| disan.Chair 2.2.0 | 20 | 95% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 94% |
| donjezza.Muncho 1.0 | 13 | 77% |
| DBall.NUKE 0.1 | 8 | 100% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 20 | 28% | 31 |
| myl.nano.Graviton 1.10 | 12 | 17% | 55 |
| stelo.AreaTargetingBot 1.1 | 11 | 15% | 30 |
| ntc.Opposite 1.5 | 11 | 15% | 27 |
| donjezza.Muncho 1.0 | 7 | 10% | 14 |
| disan.Chair 2.2.0 | 4 | 6% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 4% | 19 |
| DBall.NUKE 0.1 | 2 | 3% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 69.6 | 82 / 210 | 3.74 | 15.0% | 24366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 2.0 | 15.0% | 82 |
| oog.melee.Capulet 1.2 | 2.0 | 14.6% | 50 |
| kawigi.micro.Shiz 1.1 | 3.0 | 13.5% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.7% | 26 |
| yagami.Tidus 0.11 | 4.3 | 11.7% | 9 |
| ejb.Polaris 1.0.1 | 5.5 | 10.9% | 14 |
| stelo.MirrorNano 1.3 | 7.2 | 7.8% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 70.2 | 14 / 35 | 3928 |
| 2 | 1 | 64.8 | 74.9 | 18 / 35 | 4013 |
| 3 | 3 | 61.7 | 65.4 | 12 / 35 | 3832 |
| 4 | 1 | 66.0 | 76.2 | 15 / 35 | 4459 |
| 5 | 4 | 59.8 | 60.3 | 10 / 35 | 3669 |
| 6 | 2 | 64.5 | 70.5 | 13 / 35 | 4465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 63% |
| yagami.Tidus 0.11 | 23 | 91% |
| kawigi.micro.Shiz 1.1 | 20 | 95% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 77% |
| ejb.Polaris 1.0.1 | 10 | 40% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 62 | 48% | 94 |
| yagami.Tidus 0.11 | 17 | 13% | 27 |
| ejb.Polaris 1.0.1 | 17 | 13% | 26 |
| kawigi.micro.Shiz 1.1 | 13 | 10% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 8% | 23 |
| step.nanoPri 1.0 | 5 | 4% | 9 |
| stelo.MirrorNano 1.3 | 5 | 4% | 6 |

## Melee bench: F14

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.9 | 135 / 210 | 2.72 | 17.4% | 24974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 17.4% | 135 |
| wee.Gem 1.8.4 | 2.8 | 12.3% | 30 |
| bzdp.Pansy 2.1 | 3.2 | 12.3% | 16 |
| wompi.Quokka 1.6 | 4.0 | 11.4% | 19 |
| ratosh.Nobo 0.21 | 4.0 | 11.1% | 3 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 3 |
| bayen.UbaMicro 1.4 | 6.7 | 8.7% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.9% | 0 |
| maribo.FollowFire 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.9 | 19 / 35 | 4172 |
| 2 | 1 | 65.7 | 80.0 | 24 / 35 | 3674 |
| 3 | 1 | 67.1 | 84.1 | 22 / 35 | 4426 |
| 4 | 1 | 67.6 | 84.1 | 26 / 35 | 4412 |
| 5 | 1 | 66.0 | 81.6 | 21 / 35 | 4165 |
| 6 | 1 | 65.9 | 80.6 | 23 / 35 | 4125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 60 | 93% |
| wee.Gem 1.8.4 | 32 | 88% |
| wompi.Quokka 1.6 | 19 | 63% |
| ratosh.Nobo 0.21 | 16 | 100% |
| bayen.UbaMicro 1.4 | 11 | 100% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 17% | 56 |
| wee.Gem 1.8.4 | 12 | 16% | 43 |
| wompi.Quokka 1.6 | 12 | 16% | 23 |
| stelo.MyAgileRobot 0.2 | 10 | 13% | 11 |
| maribo.FollowFire 1 | 9 | 12% | 11 |
| ratosh.Nobo 0.21 | 8 | 11% | 24 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 11% | 13 |
| bayen.UbaMicro 1.4 | 4 | 5% | 16 |
| m3thos.Eva00 1.1 | 0 | 0% | 12 |

## Melee bench: F15

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 83.3 | 66 / 210 | 2.50 | 19.6% | 45749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 20.1% | 130 |
| hadur117.micro.SaorTHPC 0.1 | 1.7 | 19.6% | 66 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 9 |
| exauge.GateKeeper 1.1.121g | 4.2 | 9.7% | 2 |
| ayk.WallHugger 1.0 | 4.8 | 9.3% | 1 |
| stuff.Vlad 0.1 | 6.0 | 8.4% | 0 |
| stelo.PianistNano 1.2 | 7.0 | 7.6% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.6% | 1 |
| sample.SittingDuck 1.0 | 9.5 | 2.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 70.6 | 83.8 | 9 / 35 | 7359 |
| 2 | 2 | 69.6 | 77.5 | 10 / 35 | 7750 |
| 3 | 2 | 70.4 | 81.6 | 8 / 35 | 7637 |
| 4 | 2 | 70.5 | 86.0 | 14 / 35 | 6896 |
| 5 | 1 | 71.2 | 83.8 | 12 / 35 | 7674 |
| 6 | 1 | 72.6 | 87.0 | 13 / 35 | 8433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 134 | 32% |
| mz.NanoGod 2.02 | 10 | 80% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 106 | 73% | 147 |
| mz.NanoGod 2.02 | 21 | 14% | 32 |
| exauge.GateKeeper 1.1.121g | 13 | 9% | 13 |
| ayk.WallHugger 1.0 | 3 | 2% | 8 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 78.5 | 120 / 210 | 2.94 | 17.6% | 29113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 17.6% | 120 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 12.7% | 18 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 27 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.8 | 10.4% | 17 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.7% | 7 |
| conscience.Electron 1.3g | 6.8 | 8.2% | 1 |
| ap.Frederick 1.1 | 8.0 | 6.8% | 6 |
| dl.BetterWalls 1.0 | 9.3 | 5.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 72.4 | 14 / 35 | 4705 |
| 2 | 1 | 66.8 | 79.0 | 21 / 35 | 4914 |
| 3 | 1 | 66.6 | 77.8 | 20 / 35 | 4847 |
| 4 | 1 | 68.2 | 84.4 | 25 / 35 | 4757 |
| 5 | 1 | 67.0 | 79.7 | 21 / 35 | 5244 |
| 6 | 1 | 65.8 | 77.5 | 19 / 35 | 4646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 43 | 95% |
| dummy.micro.Sparrow 2.5 | 36 | 83% |
| davidalves.net.DuelistMicroMelee 1.4 | 22 | 77% |
| bvh.micro.Freya 0.3 | 20 | 90% |
| stelo.MirrorMicro 1.0 | 8 | 88% |
| ap.Frederick 1.1 | 6 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| dummy.micro.Sparrow 2.5 | 20 | 22% | 49 |
| bvh.micro.Freya 0.3 | 15 | 17% | 34 |
| conscience.Electron 1.3g | 14 | 16% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 13 | 14% | 34 |
| voidious.micro.BlitzBat 1.05 | 10 | 11% | 43 |
| stelo.MirrorMicro 1.0 | 6 | 7% | 16 |
| dl.BetterWalls 1.0 | 6 | 7% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 7% | 6 |

## Melee bench: F17

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 86.0 | 153 / 210 | 2.26 | 20.7% | 40841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 20.7% | 153 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 24 |
| sul.Lunar 1.1 | 3.3 | 11.7% | 12 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.8% | 14 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 1 |
| dsw.StaticD 1.0 | 5.3 | 9.4% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 6.8% | 0 |
| sample.MyFirstRobot 1.0 | 8.2 | 6.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 6.1% | 1 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 82.5 | 24 / 35 | 7455 |
| 2 | 1 | 70.0 | 86.0 | 23 / 35 | 6085 |
| 3 | 1 | 70.9 | 87.0 | 26 / 35 | 6465 |
| 4 | 1 | 72.5 | 88.6 | 29 / 35 | 7290 |
| 5 | 1 | 72.0 | 88.9 | 27 / 35 | 6927 |
| 6 | 1 | 69.9 | 83.2 | 24 / 35 | 6619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 56 | 91% |
| sul.Lunar 1.1 | 44 | 100% |
| supersample.SuperBoxBot 1.0 | 26 | 85% |
| dsw.StaticD 1.0 | 13 | 92% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| tlp.ThreeLeggedPig 1 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 17 | 29% | 29 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 24% | 70 |
| dsw.StaticD 1.0 | 9 | 15% | 31 |
| sul.Lunar 1.1 | 5 | 8% | 56 |
| sample.MyFirstRobot 1.0 | 5 | 8% | 10 |
| mme.NikeEnhanced 2.0 | 4 | 7% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 2 |
| sample.Corners 1.0 | 1 | 2% | 1 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorTHPC 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 79.6 | 117 / 210 | 2.84 | 18.3% | 37808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorTHPC 0.1 | 1.0 | 18.3% | 117 |
| radnor.DoctorBob 1.42 | 2.2 | 13.0% | 23 |
| mld.Wisdom 1.0 | 3.3 | 12.2% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.4% | 17 |
| amz.NanoClone 1.41 | 4.8 | 10.6% | 20 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.0% | 7 |
| sample.Walls 1.0 | 7.3 | 7.3% | 3 |
| GarmBox.Oranges 1.0 | 8.0 | 6.7% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.3% | 2 |
| sample.Target 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 77.5 | 18 / 35 | 6707 |
| 2 | 1 | 66.4 | 77.8 | 19 / 35 | 5772 |
| 3 | 1 | 68.9 | 84.4 | 24 / 35 | 6149 |
| 4 | 1 | 66.8 | 77.8 | 16 / 35 | 6265 |
| 5 | 1 | 67.9 | 80.0 | 19 / 35 | 6444 |
| 6 | 1 | 68.2 | 80.0 | 21 / 35 | 6471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 96% |
| radnor.DoctorBob 1.42 | 27 | 78% |
| mld.Wisdom 1.0 | 24 | 71% |
| KiraNL.Chupacabra 0.4 | 12 | 75% |
| jangs.ns51 1.0 | 10 | 90% |
| amz.NanoClone 1.41 | 7 | 71% |
| sample.Walls 1.0 | 6 | 100% |
| sample.Target 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 32 | 34% | 49 |
| radnor.DoctorBob 1.42 | 18 | 19% | 47 |
| KiraNL.Chupacabra 0.4 | 13 | 14% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 13% | 56 |
| amz.NanoClone 1.41 | 11 | 12% | 17 |
| sample.Walls 1.0 | 3 | 3% | 7 |
| GarmBox.Oranges 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 10 |

