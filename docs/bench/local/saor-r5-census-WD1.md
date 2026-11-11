# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 51 over 6 battles (8.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.7 | 162 / 210 | 1.75 | 22.4% | 45296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.4% | 162 |
| mz.AntiGrav 1.0 | 2.2 | 14.4% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 16 |
| mld.Infinity 2.2 | 4.0 | 12.3% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.8% | 3 |
| jangs.ns51 1.0 | 6.8 | 6.3% | 2 |
| sample.Walls 1.0 | 7.2 | 6.4% | 0 |
| GarmBox.Oranges 1.0 | 7.5 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 8.7 | 4.6% | 0 |
| sample.Target 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.0 | 96.2 | 29 / 35 | 7577 |
| 2 | 1 | 72.4 | 87.0 | 27 / 35 | 7640 |
| 3 | 1 | 72.4 | 89.2 | 26 / 35 | 7355 |
| 4 | 1 | 74.7 | 95.6 | 27 / 35 | 8007 |
| 5 | 1 | 72.8 | 89.8 | 25 / 35 | 7416 |
| 6 | 1 | 73.6 | 92.4 | 28 / 35 | 7301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 86 | 98% |
| radnor.DoctorBob 1.42 | 39 | 82% |
| mld.Infinity 2.2 | 32 | 81% |
| amz.NanoClone 1.41 | 7 | 100% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| sample.Target 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 42% | 65 |
| mz.AntiGrav 1.0 | 11 | 23% | 101 |
| mld.Infinity 2.2 | 10 | 21% | 16 |
| GarmBox.Oranges 1.0 | 3 | 6% | 4 |
| jangs.ns51 1.0 | 2 | 4% | 6 |
| amz.NanoClone 1.41 | 1 | 2% | 8 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 39 over 6 battles (6.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.8 | 152 / 210 | 2.01 | 19.5% | 31427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.5% | 152 |
| oog.melee.Mercutio 1.0 | 2.5 | 14.3% | 36 |
| mld.DustBunny 3.8 | 2.5 | 14.0% | 12 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 0 |
| zyx.nano.Ant 1.1 | 6.3 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 7.2% | 6 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 8.1% | 0 |
| fullsail.SweetTea 1.1 | 7.2 | 7.5% | 3 |
| bzdp.BoxCar 2.0 | 8.2 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 28 / 35 | 5327 |
| 2 | 1 | 69.5 | 82.5 | 22 / 35 | 6096 |
| 3 | 1 | 69.0 | 87.3 | 24 / 35 | 5131 |
| 4 | 1 | 70.5 | 94.6 | 27 / 35 | 5357 |
| 5 | 1 | 67.6 | 82.5 | 22 / 35 | 4887 |
| 6 | 1 | 69.9 | 93.3 | 29 / 35 | 4629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 70 | 86% |
| mld.DustBunny 3.8 | 67 | 91% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| bzdp.BoxCar 2.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 20 | 34% | 80 |
| oog.melee.Mercutio 1.0 | 16 | 28% | 73 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 14 |
| fullsail.SweetTea 1.1 | 5 | 9% | 12 |
| cs.Grudge 1.0 | 4 | 7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 3 | 5% | 11 |
| zyx.nano.Ant 1.1 | 3 | 5% | 5 |
| maribo.melee.BMV 0.1 | 1 | 2% | 8 |
| bzdp.BoxCar 2.0 | 1 | 2% | 2 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 82.0 | 132 / 210 | 2.62 | 19.7% | 36351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.7% | 132 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 40 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 11.8% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.8% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.9% | 12 |
| fm.mammillarias 1.3 | 6.0 | 8.7% | 3 |
| cs.sheldor.Talon 1.1 | 6.3 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.1% | 4 |
| sample.Fire 1.0 | 9.5 | 4.6% | 1 |
| sample.Tracker 1.0 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 80.6 | 25 / 35 | 5546 |
| 2 | 1 | 67.5 | 77.8 | 21 / 35 | 5271 |
| 3 | 1 | 72.2 | 88.6 | 26 / 35 | 6885 |
| 4 | 1 | 69.2 | 81.3 | 21 / 35 | 6027 |
| 5 | 1 | 71.0 | 86.0 | 23 / 35 | 6361 |
| 6 | 1 | 68.3 | 77.8 | 16 / 35 | 6261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 62 | 87% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 89% |
| myl.nano.KomoriNinja 1.1 | 23 | 100% |
| cb.nano.Insomnia 1.0 | 21 | 81% |
| fm.mammillarias 1.3 | 7 | 86% |
| sp.Nanos.Ember 1.1 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 26% | 83 |
| cb.nano.Insomnia 1.0 | 15 | 19% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 17% | 31 |
| fm.mammillarias 1.3 | 10 | 13% | 17 |
| myl.nano.KomoriNinja 1.1 | 7 | 9% | 36 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 6 |
| sample.Fire 1.0 | 4 | 5% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 10 |
| sample.Tracker 1.0 | 2 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 77 over 6 battles (12.8 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.2 | 160 / 210 | 1.98 | 21.3% | 39875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.3% | 160 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.4% | 13 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.0% | 10 |
| stelo.SoJNanoMelee 1.1 | 5.2 | 9.1% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.7 | 8.6% | 1 |
| tj.zombie1n 1.0.1 | 5.7 | 8.9% | 8 |
| yk.JahMicro 1.0 | 6.2 | 8.1% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.7% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.4% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 89.2 | 26 / 35 | 6596 |
| 2 | 1 | 72.4 | 94.3 | 29 / 35 | 6546 |
| 3 | 1 | 70.0 | 84.8 | 25 / 35 | 6291 |
| 4 | 1 | 71.7 | 89.5 | 28 / 35 | 6958 |
| 5 | 1 | 70.2 | 83.8 | 25 / 35 | 6375 |
| 6 | 1 | 72.5 | 93.3 | 27 / 35 | 7109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 74 | 92% |
| stelo.SoJNanoMelee 1.1 | 38 | 84% |
| tvv.micro.Antares 1.1.1 | 20 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 13 | 100% |
| yk.JahMicro 1.0 | 12 | 100% |
| tj.zombie1n 1.0.1 | 9 | 67% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 36% | 94 |
| stelo.SoJNanoMelee 1.1 | 13 | 26% | 44 |
| tj.zombie1n 1.0.1 | 8 | 16% | 8 |
| tvv.micro.Antares 1.1.1 | 6 | 12% | 22 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 15 |
| repositorio.NanoStep 1.0 | 1 | 2% | 13 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 70.6 | 106 / 210 | 3.65 | 16.3% | 28813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.3% | 106 |
| oog.melee.Corsair 1.0 | 2.3 | 12.6% | 21 |
| ahf.NanoAndrew .4 | 3.8 | 11.8% | 36 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 11.3% | 23 |
| sam.Samspin 1.0 | 5.7 | 9.6% | 8 |
| EBBU.Sim2 1.02 | 5.8 | 9.5% | 3 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 9.4% | 7 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 8.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.1 | 21 / 35 | 5048 |
| 2 | 1 | 64.5 | 70.5 | 19 / 35 | 4852 |
| 3 | 1 | 60.9 | 60.6 | 15 / 35 | 4409 |
| 4 | 1 | 63.8 | 68.9 | 19 / 35 | 4736 |
| 5 | 1 | 66.3 | 77.5 | 20 / 35 | 4893 |
| 6 | 1 | 63.5 | 68.9 | 12 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 42 | 88% |
| simonton.nano.MeleeSeed 1.8 | 31 | 84% |
| ahf.NanoAndrew .4 | 27 | 81% |
| sam.Samspin 1.0 | 9 | 89% |
| EBBU.Sim2 1.02 | 6 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 382. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 25% | 48 |
| ahf.NanoAndrew .4 | 18 | 17% | 45 |
| robar.nano.Assertive_Melee 0.2 | 18 | 17% | 25 |
| oog.melee.Corsair 1.0 | 10 | 10% | 43 |
| zyx.nano.BacillusComma 1.0 | 9 | 9% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 9% | 9 |
| sam.Samspin 1.0 | 6 | 6% | 13 |
| EBBU.Sim2 1.02 | 4 | 4% | 10 |
| sample.TrackFire 1.0 | 4 | 4% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 53 over 6 battles (8.8 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.7 | 157 / 210 | 2.01 | 20.2% | 33522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.2% | 157 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 20 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.5% | 4 |
| oog.melee.CapuletDroid 1.1 | 3.7 | 10.8% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.8% | 3 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 3 |
| fm.claire 1.7 | 6.7 | 7.9% | 2 |
| pa.Improved 1.0 | 8.2 | 6.7% | 2 |
| kurios.DOSexe .9b | 9.2 | 5.7% | 0 |
| sample.SpinBot 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 28 / 35 | 5058 |
| 2 | 1 | 70.1 | 87.0 | 26 / 35 | 5626 |
| 3 | 1 | 67.1 | 78.1 | 20 / 35 | 5318 |
| 4 | 1 | 69.9 | 88.6 | 27 / 35 | 5383 |
| 5 | 1 | 71.1 | 94.3 | 27 / 35 | 5769 |
| 6 | 1 | 72.5 | 95.2 | 29 / 35 | 6368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 91% |
| oog.melee.CapuletDroid 1.1 | 48 | 83% |
| gh.nano.Grofvuil 0.2 | 19 | 95% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 86% |
| pa.Improved 1.0 | 5 | 80% |
| fm.claire 1.7 | 2 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 15 | 28% | 20 |
| d414.nano.Quantum 1.0.0 | 13 | 25% | 94 |
| fm.claire 1.7 | 8 | 15% | 11 |
| gh.nano.Grofvuil 0.2 | 5 | 9% | 30 |
| winamp32.micro.MicroMacro 1.0 | 3 | 6% | 14 |
| arthord.NanoSatanMelee Beta | 3 | 6% | 13 |
| sample.SpinBot 1.0 | 3 | 6% | 7 |
| pa.Improved 1.0 | 2 | 4% | 8 |
| kurios.DOSexe .9b | 1 | 2% | 11 |

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.4 | 126 / 210 | 2.22 | 19.3% | 34404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.3% | 126 |
| gh.micro.Gruweltje 0.7 | 2.5 | 14.6% | 27 |
| spinnercat.micro.Tyger 0.1 | 2.7 | 14.2% | 32 |
| mz.MicroGodMelee 1 | 3.8 | 12.8% | 16 |
| DBall.Anarchy 0.1 | 5.0 | 8.4% | 4 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.2% | 2 |
| el.JumpShoot 0.2 | 7.7 | 6.3% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.3% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.6% | 1 |
| mbro.Detektor3 0.1.1 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 22 / 35 | 5698 |
| 2 | 1 | 68.7 | 83.5 | 24 / 35 | 5418 |
| 3 | 1 | 68.9 | 86.7 | 18 / 35 | 5613 |
| 4 | 1 | 68.0 | 82.5 | 20 / 35 | 5256 |
| 5 | 1 | 72.0 | 92.7 | 23 / 35 | 6834 |
| 6 | 1 | 68.7 | 84.4 | 19 / 35 | 5585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 69 | 71% |
| mz.MicroGodMelee 1 | 48 | 88% |
| gh.micro.Gruweltje 0.7 | 43 | 67% |
| DBall.Anarchy 0.1 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 28 | 33% | 65 |
| mz.MicroGodMelee 1 | 21 | 25% | 63 |
| gh.micro.Gruweltje 0.7 | 18 | 21% | 57 |
| acogdev.alpha 0.2 | 9 | 11% | 10 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 7 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 59 over 6 battles (9.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 71.0 | 100 / 210 | 3.61 | 16.4% | 30417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.4% | 100 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.6% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 13.0% | 25 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.6% | 7 |
| germ.TheMind .2 | 5.2 | 9.5% | 11 |
| awesomeness.Elite 1.0 | 6.2 | 8.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 7.5 | 8.2% | 6 |
| sample.Crazy 1.0 | 9.0 | 6.7% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 69.5 | 16 / 35 | 5273 |
| 2 | 2 | 62.6 | 65.7 | 14 / 35 | 4755 |
| 3 | 1 | 65.7 | 74.9 | 17 / 35 | 5179 |
| 4 | 1 | 63.6 | 67.9 | 17 / 35 | 4878 |
| 5 | 1 | 67.2 | 79.4 | 21 / 35 | 5066 |
| 6 | 1 | 64.7 | 68.6 | 15 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 72% |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 82% |
| stelo.UntouchableNano 1.3 | 8 | 75% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 7 | 86% |
| germ.TheMind .2 | 6 | 83% |
| lrem.micro.MoggFanatic 0.2 | 4 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 499. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 55 | 50% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 15% | 32 |
| germ.TheMind .2 | 11 | 10% | 19 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 16 |
| qualidafial.MajorDick 1.0.1 | 7 | 6% | 10 |
| awesomeness.Elite 1.0 | 5 | 5% | 10 |
| lrem.micro.MoggFanatic 0.2 | 5 | 5% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 262 over 6 battles (43.7 per battle, most in one battle 173). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 88.3 | 155 / 210 | 2.06 | 20.1% | 31728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 155 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.5% | 8 |
| maribo.IotaCT 1.1 | 4.2 | 10.6% | 10 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.9% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.7% | 0 |
| ratosh.Wesco 1.4 | 6.8 | 8.2% | 6 |
| spinnercat.Omen 1.0 | 7.3 | 7.9% | 2 |
| stelo.PatternRobot 1.0 | 8.7 | 7.5% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 87.0 | 26 / 35 | 5156 |
| 2 | 1 | 71.4 | 90.2 | 28 / 35 | 5408 |
| 3 | 1 | 69.6 | 86.0 | 26 / 35 | 5300 |
| 4 | 1 | 71.6 | 90.2 | 26 / 35 | 5904 |
| 5 | 1 | 70.1 | 91.7 | 26 / 35 | 4859 |
| 6 | 1 | 69.6 | 84.4 | 23 / 35 | 5101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 79 | 95% |
| nz.jdc.nano.GridFu 1.0 | 35 | 100% |
| maribo.IotaCT 1.1 | 18 | 78% |
| timmit.nano.TimDog 0.33 | 17 | 94% |
| ratosh.Wesco 1.4 | 9 | 100% |
| stelo.PatternRobot 1.0 | 6 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 11 | 20% | 63 |
| stelo.PatternRobot 1.0 | 11 | 20% | 17 |
| maribo.IotaCT 1.1 | 8 | 15% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 13% | 10 |
| nz.jdc.nano.GridFu 1.0 | 6 | 11% | 54 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 18 |
| ratosh.Wesco 1.4 | 4 | 7% | 19 |
| spinnercat.Omen 1.0 | 2 | 4% | 4 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.5 | 175 / 210 | 1.67 | 22.0% | 40612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.0% | 175 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 16 |
| baal.nano.N 1.42 | 2.8 | 11.2% | 4 |
| Grystrion.TrackerWO 1.0 | 4.3 | 9.6% | 0 |
| zyx.micro.Ant 1.1 | 5.3 | 9.0% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.7% | 0 |
| sanja.First 0.1 | 7.2 | 8.1% | 1 |
| amk.Punbot.Punbot 0.01 | 7.5 | 7.6% | 3 |
| cvt.Firsty 1.0 | 7.8 | 7.0% | 5 |
| sample.RamFire 1.0 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 92.7 | 31 / 35 | 7082 |
| 2 | 1 | 70.6 | 86.7 | 26 / 35 | 6473 |
| 3 | 1 | 72.0 | 93.0 | 31 / 35 | 6620 |
| 4 | 1 | 72.0 | 94.6 | 25 / 35 | 6714 |
| 5 | 1 | 72.4 | 92.7 | 31 / 35 | 6800 |
| 6 | 1 | 72.6 | 95.6 | 31 / 35 | 6923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 46 | 96% |
| baal.nano.N 1.42 | 32 | 100% |
| cvt.Firsty 1.0 | 27 | 93% |
| zyx.micro.Ant 1.1 | 22 | 91% |
| sanja.First 0.1 | 19 | 95% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| amk.Punbot.Punbot 0.01 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 7 | 19% | 36 |
| cvt.Firsty 1.0 | 7 | 19% | 29 |
| tvv.nano.Polaris 1.2 | 6 | 17% | 43 |
| sample.RamFire 1.0 | 6 | 17% | 7 |
| amk.Punbot.Punbot 0.01 | 4 | 11% | 7 |
| sanja.First 0.1 | 3 | 8% | 28 |
| Grystrion.TrackerWO 1.0 | 2 | 6% | 21 |
| baal.nano.N 1.42 | 1 | 3% | 27 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.8 | 57 / 210 | 3.81 | 15.2% | 31295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.2 | 15.9% | 91 |
| hadur117.micro.SaorWD1 0.1 | 1.8 | 15.2% | 57 |
| cs.Wren 1.0 | 3.3 | 11.6% | 14 |
| js.PinBall 1.6 | 4.0 | 11.4% | 13 |
| mz.Cork 0.1 | 5.0 | 10.8% | 14 |
| joe.ADinosaur 1.0 | 6.0 | 9.3% | 5 |
| evd.X1 0.01 | 7.0 | 8.0% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 6 |
| PSW.Relentless 0.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 72.1 | 9 / 35 | 5048 |
| 2 | 2 | 65.2 | 74.3 | 9 / 35 | 5658 |
| 3 | 1 | 65.3 | 74.9 | 14 / 35 | 5688 |
| 4 | 2 | 61.5 | 64.4 | 11 / 35 | 4960 |
| 5 | 2 | 59.8 | 62.2 | 5 / 35 | 4944 |
| 6 | 2 | 61.3 | 64.8 | 9 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 85 | 29% |
| cs.Wren 1.0 | 12 | 92% |
| js.PinBall 1.6 | 8 | 100% |
| mz.Cork 0.1 | 7 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 50% |

Hadur died in 153 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 88 | 58% | 116 |
| js.PinBall 1.6 | 14 | 9% | 22 |
| evd.X1 0.01 | 13 | 8% | 15 |
| cs.Wren 1.0 | 10 | 7% | 21 |
| joe.ADinosaur 1.0 | 9 | 6% | 10 |
| PSW.Relentless 0.1 | 8 | 5% | 8 |
| mz.Cork 0.1 | 6 | 4% | 13 |
| jsal.Jsalbot 1.0 | 4 | 3% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.1 | 136 / 210 | 2.43 | 19.2% | 30332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.2% | 136 |
| myl.nano.Graviton 1.10 | 2.5 | 12.0% | 19 |
| ntc.Opposite 1.5 | 3.3 | 11.3% | 12 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.0% | 6 |
| stelo.AreaTargetingBot 1.1 | 5.5 | 9.6% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.6% | 3 |
| disan.Chair 2.2.0 | 7.2 | 8.3% | 11 |
| DBall.NUKE 0.1 | 7.5 | 7.9% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 5.9% | 9 |
| pbg.R2D2 1.0 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.8 | 20 / 35 | 5142 |
| 2 | 1 | 66.2 | 77.1 | 18 / 35 | 4841 |
| 3 | 1 | 67.9 | 80.6 | 21 / 35 | 4925 |
| 4 | 1 | 69.7 | 87.3 | 26 / 35 | 4878 |
| 5 | 1 | 69.9 | 87.3 | 26 / 35 | 5247 |
| 6 | 1 | 69.9 | 87.6 | 25 / 35 | 5299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 46 | 93% |
| disan.Chair 2.2.0 | 18 | 94% |
| pfvicm.Sobieski 7.2.3b | 18 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 88% |
| ntc.Opposite 1.5 | 16 | 81% |
| DBall.NUKE 0.1 | 15 | 93% |
| stelo.AreaTargetingBot 1.1 | 15 | 53% |
| donjezza.Muncho 1.0 | 9 | 78% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 19 | 25% | 61 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 17% | 28 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 26 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 24 |
| ntc.Opposite 1.5 | 9 | 12% | 21 |
| pbg.R2D2 1.0 | 4 | 5% | 13 |
| DBall.NUKE 0.1 | 3 | 4% | 14 |
| donjezza.Muncho 1.0 | 3 | 4% | 13 |
| disan.Chair 2.2.0 | 3 | 4% | 10 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 75.7 | 111 / 210 | 3.19 | 16.6% | 25709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.6% | 111 |
| oog.melee.Capulet 1.2 | 2.2 | 14.3% | 32 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.5% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.2% | 19 |
| yagami.Tidus 0.11 | 4.3 | 11.9% | 13 |
| ejb.Polaris 1.0.1 | 5.8 | 10.7% | 4 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.5% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 68.9 | 16 / 35 | 4344 |
| 2 | 1 | 65.9 | 73.3 | 20 / 35 | 4559 |
| 3 | 1 | 66.9 | 80.6 | 18 / 35 | 4055 |
| 4 | 1 | 63.9 | 71.7 | 18 / 35 | 3522 |
| 5 | 1 | 68.4 | 86.0 | 23 / 35 | 4494 |
| 6 | 1 | 65.9 | 73.3 | 16 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 48 | 83% |
| kawigi.micro.Shiz 1.1 | 33 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 96% |
| yagami.Tidus 0.11 | 15 | 87% |
| ejb.Polaris 1.0.1 | 8 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 37 | 37% | 72 |
| kawigi.micro.Shiz 1.1 | 20 | 20% | 42 |
| yagami.Tidus 0.11 | 17 | 17% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 10% | 34 |
| stelo.MirrorNano 1.3 | 6 | 6% | 7 |
| ejb.Polaris 1.0.1 | 4 | 4% | 19 |
| step.nanoPri 1.0 | 4 | 4% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 33 over 6 battles (5.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.4 | 133 / 210 | 2.86 | 17.5% | 26370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.5% | 133 |
| bzdp.Pansy 2.1 | 2.5 | 12.9% | 24 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 19 |
| wee.Gem 1.8.4 | 4.2 | 11.2% | 18 |
| ratosh.Nobo 0.21 | 4.3 | 11.1% | 8 |
| m3thos.Eva00 1.1 | 5.5 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 7.2 | 8.2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.4% | 0 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.1% | 2 |
| maribo.FollowFire 1 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.4 | 22 / 35 | 4347 |
| 2 | 1 | 67.2 | 82.5 | 22 / 35 | 4436 |
| 3 | 1 | 64.3 | 72.1 | 21 / 35 | 4531 |
| 4 | 1 | 66.6 | 82.5 | 24 / 35 | 4108 |
| 5 | 1 | 65.4 | 74.9 | 21 / 35 | 4180 |
| 6 | 1 | 68.3 | 85.7 | 23 / 35 | 4768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 92% |
| wee.Gem 1.8.4 | 25 | 96% |
| wompi.Quokka 1.6 | 21 | 90% |
| ratosh.Nobo 0.21 | 16 | 81% |
| m3thos.Eva00 1.1 | 14 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 450. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 16 | 20% | 63 |
| maribo.FollowFire 1 | 12 | 15% | 9 |
| wompi.Quokka 1.6 | 11 | 14% | 24 |
| ratosh.Nobo 0.21 | 10 | 13% | 29 |
| wee.Gem 1.8.4 | 9 | 11% | 38 |
| bayen.UbaMicro 1.4 | 7 | 9% | 10 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 11 |
| m3thos.Eva00 1.1 | 5 | 6% | 15 |
| stelo.MyAgileRobot 0.2 | 3 | 4% | 7 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 86.1 | 90 / 210 | 2.25 | 21.1% | 50747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.1% | 90 |
| wompi.Wallaby 5.1 | 2.0 | 19.3% | 107 |
| mz.NanoGod 2.02 | 3.0 | 13.7% | 7 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.8% | 2 |
| ayk.WallHugger 1.0 | 5.2 | 9.0% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.9% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.5% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 83.8 | 17 / 35 | 8601 |
| 2 | 1 | 72.5 | 86.3 | 14 / 35 | 8474 |
| 3 | 1 | 74.0 | 90.2 | 17 / 35 | 9278 |
| 4 | 1 | 72.6 | 86.7 | 16 / 35 | 8798 |
| 5 | 1 | 71.5 | 85.1 | 15 / 35 | 7481 |
| 6 | 1 | 71.6 | 84.4 | 11 / 35 | 8115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 128 | 36% |
| mz.NanoGod 2.02 | 17 | 88% |
| exauge.GateKeeper 1.1.121g | 14 | 93% |
| stelo.PianistNano 1.2 | 6 | 100% |
| ayk.WallHugger 1.0 | 5 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1039. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 96 | 79% | 152 |
| mz.NanoGod 2.02 | 10 | 8% | 27 |
| exauge.GateKeeper 1.1.121g | 7 | 6% | 15 |
| ayk.WallHugger 1.0 | 4 | 3% | 8 |
| stuff.Vlad 0.1 | 3 | 2% | 4 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 70.8 | 95 / 210 | 3.63 | 16.1% | 27825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.1% | 95 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 14.3% | 36 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.1% | 21 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.2 | 11.1% | 20 |
| bvh.micro.Freya 0.3 | 4.8 | 10.7% | 20 |
| stelo.MirrorMicro 1.0 | 5.5 | 9.3% | 7 |
| conscience.Electron 1.3g | 7.2 | 7.6% | 2 |
| ap.Frederick 1.1 | 8.0 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 9.3 | 6.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 65.4 | 13 / 35 | 4135 |
| 2 | 1 | 63.6 | 68.9 | 16 / 35 | 4559 |
| 3 | 1 | 65.5 | 75.9 | 17 / 35 | 4792 |
| 4 | 1 | 66.1 | 78.1 | 20 / 35 | 4637 |
| 5 | 1 | 65.2 | 71.7 | 17 / 35 | 5096 |
| 6 | 2 | 62.1 | 64.8 | 12 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 62 | 71% |
| dummy.micro.Sparrow 2.5 | 26 | 85% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 74% |
| bvh.micro.Freya 0.3 | 11 | 82% |
| ap.Frederick 1.1 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 35 | 30% | 81 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 17% | 42 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 15% | 16 |
| dummy.micro.Sparrow 2.5 | 15 | 13% | 34 |
| conscience.Electron 1.3g | 14 | 12% | 15 |
| stelo.MirrorMicro 1.0 | 6 | 5% | 6 |
| dl.BetterWalls 1.0 | 5 | 4% | 8 |
| bvh.micro.Freya 0.3 | 4 | 3% | 7 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.6 | 157 / 210 | 2.30 | 20.8% | 39984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.8% | 157 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 18 |
| supersample.SuperBoxBot 1.0 | 3.3 | 11.9% | 10 |
| sul.Lunar 1.1 | 3.7 | 11.1% | 11 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.6% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.7% | 1 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.3% | 2 |
| sample.MyFirstRobot 1.0 | 8.5 | 5.9% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 8.7 | 5.8% | 3 |
| sample.Corners 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 87.9 | 22 / 35 | 6734 |
| 2 | 1 | 70.3 | 84.8 | 25 / 35 | 6336 |
| 3 | 1 | 71.1 | 84.1 | 28 / 35 | 6343 |
| 4 | 1 | 70.8 | 82.5 | 25 / 35 | 6888 |
| 5 | 1 | 71.6 | 87.9 | 29 / 35 | 6691 |
| 6 | 1 | 71.6 | 86.0 | 28 / 35 | 6992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 96% |
| sul.Lunar 1.1 | 36 | 100% |
| supersample.SuperBoxBot 1.0 | 27 | 89% |
| dsw.StaticD 1.0 | 14 | 100% |
| mme.NikeEnhanced 2.0 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| tlp.ThreeLeggedPig 1 | 5 | 100% |
| sample.Corners 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |

Hadur died in 55 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 29% | 38 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 25% | 63 |
| mme.NikeEnhanced 2.0 | 6 | 11% | 18 |
| dsw.StaticD 1.0 | 5 | 9% | 20 |
| tlp.ThreeLeggedPig 1 | 5 | 9% | 7 |
| sample.MyFirstRobot 1.0 | 2 | 4% | 15 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 7 |
| sample.Corners 1.0 | 2 | 4% | 2 |
| sul.Lunar 1.1 | 1 | 2% | 38 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.4 | 114 / 210 | 2.76 | 18.8% | 38620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.8% | 114 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 24 |
| mld.Wisdom 1.0 | 3.2 | 12.1% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.0% | 26 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 11 |
| KiraNL.Chupacabra 0.4 | 5.5 | 10.1% | 7 |
| sample.Walls 1.0 | 7.5 | 7.2% | 3 |
| GarmBox.Oranges 1.0 | 7.8 | 7.0% | 0 |
| jangs.ns51 1.0 | 8.7 | 6.4% | 5 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 68.6 | 14 / 35 | 6095 |
| 2 | 1 | 67.9 | 81.0 | 19 / 35 | 6115 |
| 3 | 1 | 68.7 | 81.6 | 17 / 35 | 6662 |
| 4 | 1 | 69.6 | 83.5 | 21 / 35 | 6986 |
| 5 | 1 | 68.8 | 82.2 | 20 / 35 | 6553 |
| 6 | 1 | 69.5 | 85.7 | 23 / 35 | 6209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 85% |
| radnor.DoctorBob 1.42 | 33 | 73% |
| mld.Wisdom 1.0 | 19 | 68% |
| amz.NanoClone 1.41 | 16 | 100% |
| KiraNL.Chupacabra 0.4 | 10 | 90% |
| jangs.ns51 1.0 | 10 | 70% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 75% |

Hadur died in 97 of 210 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 29 | 30% | 42 |
| radnor.DoctorBob 1.42 | 23 | 24% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 23% | 60 |
| KiraNL.Chupacabra 0.4 | 13 | 13% | 23 |
| jangs.ns51 1.0 | 4 | 4% | 10 |
| GarmBox.Oranges 1.0 | 3 | 3% | 5 |
| amz.NanoClone 1.41 | 2 | 2% | 11 |
| sample.Walls 1.0 | 1 | 1% | 6 |

