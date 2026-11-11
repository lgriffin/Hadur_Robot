# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 45 over 6 battles (7.5 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 87.8 | 147 / 210 | 2.10 | 21.4% | 43864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.4% | 147 |
| radnor.DoctorBob 1.42 | 2.3 | 14.5% | 25 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 15 |
| mld.Infinity 2.2 | 4.0 | 12.4% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 4 |
| GarmBox.Oranges 1.0 | 6.3 | 6.7% | 0 |
| sample.Walls 1.0 | 7.0 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 84.8 | 26 / 35 | 7190 |
| 2 | 1 | 71.3 | 84.8 | 20 / 35 | 7486 |
| 3 | 1 | 73.2 | 92.4 | 29 / 35 | 7181 |
| 4 | 1 | 72.7 | 88.6 | 23 / 35 | 7402 |
| 5 | 1 | 71.7 | 87.0 | 22 / 35 | 6919 |
| 6 | 1 | 72.8 | 89.2 | 27 / 35 | 7686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 66 | 97% |
| mld.Infinity 2.2 | 47 | 81% |
| radnor.DoctorBob 1.42 | 35 | 83% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 3 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 28 | 44% | 85 |
| mld.Infinity 2.2 | 16 | 25% | 15 |
| mz.AntiGrav 1.0 | 8 | 13% | 78 |
| amz.NanoClone 1.41 | 7 | 11% | 18 |
| jangs.ns51 1.0 | 2 | 3% | 7 |
| arthord.MannyPacquiao Beta | 1 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 2% | 0 |
| sample.Walls 1.0 | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 50 over 6 battles (8.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 151 / 210 | 2.13 | 19.4% | 31722 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.4% | 151 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 37 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 9 |
| maribo.melee.BMV 0.1 | 4.0 | 10.3% | 0 |
| zyx.nano.Ant 1.1 | 6.5 | 8.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.0% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 4 |
| fullsail.SweetTea 1.1 | 7.8 | 6.5% | 4 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 24 / 35 | 5088 |
| 2 | 1 | 69.2 | 88.6 | 25 / 35 | 5188 |
| 3 | 1 | 71.1 | 94.0 | 29 / 35 | 5316 |
| 4 | 1 | 70.6 | 94.3 | 27 / 35 | 5334 |
| 5 | 1 | 68.6 | 86.0 | 27 / 35 | 4805 |
| 6 | 1 | 67.4 | 73.0 | 19 / 35 | 5991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 82 | 87% |
| mld.DustBunny 3.8 | 63 | 90% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 80% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 20 | 34% | 98 |
| mld.DustBunny 3.8 | 15 | 25% | 67 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 9 |
| fullsail.SweetTea 1.1 | 4 | 7% | 5 |
| maribo.melee.BMV 0.1 | 3 | 5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 3 | 5% | 8 |
| bzdp.BoxCar 2.0 | 3 | 5% | 5 |
| cs.Grudge 1.0 | 3 | 5% | 4 |
| zyx.nano.Ant 1.1 | 2 | 3% | 4 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 83.0 | 135 / 210 | 2.53 | 19.5% | 34809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.5% | 135 |
| myl.micro.Troodon 1.10 | 2.2 | 14.8% | 37 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.7% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.0% | 17 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.6% | 8 |
| fm.mammillarias 1.3 | 5.5 | 9.2% | 4 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.1% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.5% | 0 |
| sample.Tracker 1.0 | 9.3 | 5.0% | 0 |
| sample.Fire 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 82.2 | 21 / 35 | 5635 |
| 2 | 1 | 69.5 | 81.9 | 23 / 35 | 5888 |
| 3 | 1 | 69.8 | 85.1 | 25 / 35 | 5923 |
| 4 | 1 | 69.6 | 84.1 | 19 / 35 | 5758 |
| 5 | 1 | 68.7 | 81.6 | 22 / 35 | 5363 |
| 6 | 1 | 70.4 | 82.9 | 25 / 35 | 6242 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 71 | 86% |
| stelo.SoRobotNanoMelee 1.2 | 27 | 85% |
| myl.nano.KomoriNinja 1.1 | 22 | 91% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| sp.Nanos.Ember 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 5 | 80% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 20 | 27% | 85 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 30 |
| cb.nano.Insomnia 1.0 | 10 | 13% | 15 |
| fm.mammillarias 1.3 | 9 | 12% | 12 |
| myl.nano.KomoriNinja 1.1 | 6 | 8% | 35 |
| cs.sheldor.Talon 1.1 | 6 | 8% | 16 |
| sample.Fire 1.0 | 4 | 5% | 5 |
| sample.Tracker 1.0 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 7 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.1 | 152 / 210 | 2.16 | 20.5% | 38512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.5% | 152 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.7% | 16 |
| tvv.micro.Antares 1.1.1 | 2.8 | 12.1% | 13 |
| tj.zombie1n 1.0.1 | 5.3 | 9.1% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.4% | 2 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.7% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 6.3 | 8.0% | 1 |
| yk.JahMicro 1.0 | 7.2 | 7.8% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 6.3% | 0 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 89.2 | 23 / 35 | 7053 |
| 2 | 1 | 71.1 | 91.1 | 27 / 35 | 6216 |
| 3 | 1 | 69.7 | 83.8 | 25 / 35 | 6676 |
| 4 | 1 | 70.2 | 85.4 | 25 / 35 | 6445 |
| 5 | 1 | 70.3 | 87.6 | 26 / 35 | 6164 |
| 6 | 1 | 69.7 | 85.4 | 26 / 35 | 5958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 91% |
| stelo.SoJNanoMelee 1.1 | 32 | 75% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 100% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| yk.JahMicro 1.0 | 9 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| sample.VelociRobot 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 19 | 32% | 87 |
| stelo.SoJNanoMelee 1.1 | 18 | 31% | 39 |
| tj.zombie1n 1.0.1 | 6 | 10% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 8% | 6 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 24 |
| yk.JahMicro 1.0 | 3 | 5% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 23 |
| repositorio.NanoStep 1.0 | 1 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 69.1 | 107 / 210 | 3.78 | 16.1% | 28829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.1% | 107 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 24 |
| ahf.NanoAndrew .4 | 3.3 | 11.7% | 31 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 10.7% | 16 |
| EBBU.Sim2 1.02 | 5.5 | 9.9% | 6 |
| sam.Samspin 1.0 | 5.8 | 9.5% | 10 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.1% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.2% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 7.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 69.2 | 18 / 35 | 4604 |
| 2 | 1 | 64.5 | 70.2 | 18 / 35 | 5046 |
| 3 | 1 | 66.6 | 76.5 | 19 / 35 | 5235 |
| 4 | 1 | 61.3 | 60.6 | 17 / 35 | 4476 |
| 5 | 1 | 64.3 | 69.5 | 18 / 35 | 4801 |
| 6 | 1 | 63.6 | 68.6 | 17 / 35 | 4667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 41 | 85% |
| simonton.nano.MeleeSeed 1.8 | 34 | 97% |
| ahf.NanoAndrew .4 | 16 | 94% |
| EBBU.Sim2 1.02 | 13 | 92% |
| robar.nano.Assertive_Melee 0.2 | 6 | 100% |
| sam.Samspin 1.0 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 26 | 25% | 60 |
| oog.melee.Corsair 1.0 | 14 | 13% | 43 |
| EBBU.Sim2 1.02 | 13 | 13% | 24 |
| robar.nano.Assertive_Melee 0.2 | 13 | 13% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 13 | 13% | 15 |
| zyx.nano.BacillusComma 1.0 | 11 | 11% | 12 |
| sam.Samspin 1.0 | 8 | 8% | 11 |
| ahf.NanoAndrew .4 | 5 | 5% | 19 |
| sample.TrackFire 1.0 | 1 | 1% | 4 |

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 86.9 | 158 / 210 | 2.18 | 19.9% | 33483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.9% | 158 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 18 |
| gh.nano.Grofvuil 0.2 | 3.3 | 11.6% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.2% | 15 |
| arthord.NanoSatanMelee Beta | 5.2 | 9.3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 9.0% | 2 |
| fm.claire 1.7 | 6.3 | 8.5% | 1 |
| pa.Improved 1.0 | 8.3 | 6.2% | 1 |
| kurios.DOSexe .9b | 9.2 | 5.5% | 1 |
| sample.SpinBot 1.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 85.7 | 26 / 35 | 5749 |
| 2 | 1 | 68.3 | 83.5 | 21 / 35 | 5268 |
| 3 | 1 | 70.5 | 89.2 | 28 / 35 | 5818 |
| 4 | 1 | 70.1 | 87.3 | 28 / 35 | 5577 |
| 5 | 1 | 69.4 | 87.9 | 28 / 35 | 5111 |
| 6 | 1 | 70.6 | 87.9 | 27 / 35 | 5960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 92% |
| oog.melee.CapuletDroid 1.1 | 33 | 94% |
| gh.nano.Grofvuil 0.2 | 22 | 100% |
| arthord.NanoSatanMelee Beta | 13 | 92% |
| winamp32.micro.MicroMacro 1.0 | 12 | 100% |
| pa.Improved 1.0 | 6 | 83% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 19% | 81 |
| arthord.NanoSatanMelee Beta | 10 | 19% | 22 |
| oog.melee.CapuletDroid 1.1 | 9 | 17% | 15 |
| gh.nano.Grofvuil 0.2 | 5 | 10% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5 | 10% | 20 |
| sample.SpinBot 1.0 | 5 | 10% | 7 |
| pa.Improved 1.0 | 4 | 8% | 11 |
| fm.claire 1.7 | 3 | 6% | 9 |
| kurios.DOSexe .9b | 1 | 2% | 10 |

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.2 | 117 / 210 | 2.60 | 18.5% | 33651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.5% | 117 |
| spinnercat.micro.Tyger 0.1 | 2.3 | 14.8% | 40 |
| gh.micro.Gruweltje 0.7 | 2.7 | 14.8% | 29 |
| mz.MicroGodMelee 1 | 4.0 | 13.1% | 14 |
| DBall.Anarchy 0.1 | 5.2 | 8.5% | 4 |
| caimano.Furia_Ceca 0.22 | 5.8 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.3 | 5.8% | 0 |
| acogdev.alpha 0.2 | 8.8 | 5.5% | 1 |
| mbro.Detektor3 0.1.1 | 9.0 | 5.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.7 | 25 / 35 | 5428 |
| 2 | 1 | 69.2 | 84.4 | 18 / 35 | 5763 |
| 3 | 1 | 67.5 | 76.2 | 14 / 35 | 6211 |
| 4 | 1 | 69.9 | 88.3 | 23 / 35 | 5926 |
| 5 | 1 | 65.7 | 76.8 | 17 / 35 | 4541 |
| 6 | 1 | 68.6 | 81.0 | 20 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 52 | 56% |
| mz.MicroGodMelee 1 | 50 | 96% |
| gh.micro.Gruweltje 0.7 | 34 | 82% |
| DBall.Anarchy 0.1 | 4 | 75% |
| el.JumpShoot 0.2 | 4 | 100% |
| mbro.Detektor3 0.1.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 38 | 41% | 66 |
| gh.micro.Gruweltje 0.7 | 19 | 20% | 54 |
| mz.MicroGodMelee 1 | 16 | 17% | 57 |
| DBall.Anarchy 0.1 | 4 | 4% | 9 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 5 |
| el.JumpShoot 0.2 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 69.9 | 86 / 210 | 3.70 | 16.3% | 31939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.5 | 16.3% | 86 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 15.5% | 57 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 12.8% | 28 |
| qualidafial.MajorDick 1.0.1 | 5.3 | 9.5% | 4 |
| lrem.micro.MoggFanatic 0.2 | 5.5 | 9.1% | 10 |
| germ.TheMind .2 | 5.5 | 9.4% | 10 |
| awesomeness.Elite 1.0 | 6.8 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 7.5 | 7.7% | 6 |
| sample.Crazy 1.0 | 8.3 | 7.1% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 64.8 | 11 / 35 | 4900 |
| 2 | 1 | 66.0 | 74.0 | 17 / 35 | 5647 |
| 3 | 1 | 66.0 | 75.9 | 16 / 35 | 5266 |
| 4 | 2 | 63.9 | 66.3 | 11 / 35 | 5499 |
| 5 | 1 | 65.3 | 71.4 | 15 / 35 | 5463 |
| 6 | 1 | 63.9 | 67.3 | 16 / 35 | 5164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 71% |
| germ.TheMind .2 | 8 | 63% |
| awesomeness.Elite 1.0 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 5 | 80% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 69 | 56% | 117 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 11% | 23 |
| germ.TheMind .2 | 10 | 8% | 19 |
| stelo.UntouchableNano 1.3 | 10 | 8% | 14 |
| awesomeness.Elite 1.0 | 8 | 6% | 12 |
| lrem.micro.MoggFanatic 0.2 | 7 | 6% | 12 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 86.9 | 157 / 210 | 2.18 | 19.8% | 29989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.8% | 157 |
| rz.HawkOnFire 0.1 | 2.2 | 13.9% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 12.8% | 16 |
| maribo.IotaCT 1.1 | 4.5 | 10.7% | 9 |
| timmit.nano.TimDog 0.33 | 4.8 | 9.9% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.5 | 8.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 8.4% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.3 | 7.1% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 87.6 | 29 / 35 | 5208 |
| 2 | 1 | 71.9 | 91.7 | 30 / 35 | 5384 |
| 3 | 1 | 70.0 | 86.3 | 24 / 35 | 5067 |
| 4 | 1 | 70.7 | 89.5 | 27 / 35 | 4756 |
| 5 | 1 | 69.2 | 83.5 | 25 / 35 | 4743 |
| 6 | 1 | 68.8 | 82.5 | 22 / 35 | 4831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 76 | 92% |
| nz.jdc.nano.GridFu 1.0 | 33 | 97% |
| timmit.nano.TimDog 0.33 | 17 | 100% |
| maribo.IotaCT 1.1 | 11 | 91% |
| ratosh.Wesco 1.4 | 11 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 16 | 30% | 69 |
| nz.jdc.nano.GridFu 1.0 | 10 | 19% | 45 |
| maribo.IotaCT 1.1 | 7 | 13% | 19 |
| timmit.nano.TimDog 0.33 | 6 | 11% | 29 |
| stelo.PatternRobot 1.0 | 6 | 11% | 16 |
| spinnercat.Omen 1.0 | 3 | 6% | 10 |
| ratosh.Wesco 1.4 | 2 | 4% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 16 over 6 battles (2.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.3 | 177 / 210 | 1.69 | 21.9% | 40200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.9% | 177 |
| baal.nano.N 1.42 | 2.3 | 12.2% | 3 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.3% | 8 |
| Grystrion.TrackerWO 1.0 | 4.0 | 10.4% | 5 |
| sanja.First 0.1 | 5.7 | 8.5% | 1 |
| zyx.micro.Ant 1.1 | 6.0 | 8.9% | 8 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 7.7% | 1 |
| cvt.Firsty 1.0 | 7.8 | 7.3% | 6 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.2% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 89.8 | 28 / 35 | 6732 |
| 2 | 1 | 72.9 | 95.2 | 31 / 35 | 6855 |
| 3 | 1 | 70.8 | 85.1 | 27 / 35 | 6541 |
| 4 | 1 | 72.5 | 95.9 | 30 / 35 | 6663 |
| 5 | 1 | 72.2 | 91.7 | 29 / 35 | 6512 |
| 6 | 1 | 72.9 | 96.2 | 32 / 35 | 6897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 47 | 100% |
| tvv.nano.Polaris 1.2 | 39 | 90% |
| cvt.Firsty 1.0 | 29 | 86% |
| sanja.First 0.1 | 24 | 100% |
| amk.Punbot.Punbot 0.01 | 17 | 100% |
| zyx.micro.Ant 1.1 | 13 | 100% |
| Grystrion.TrackerWO 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 9 | 27% | 36 |
| tvv.nano.Polaris 1.2 | 7 | 21% | 35 |
| cvt.Firsty 1.0 | 4 | 12% | 34 |
| baal.nano.N 1.42 | 3 | 9% | 45 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 11 |
| sanja.First 0.1 | 2 | 6% | 28 |
| sample.RamFire 1.0 | 2 | 6% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 7 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.8 | 68 / 210 | 3.81 | 15.3% | 30838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.5 | 15.3% | 68 |
| kc.micro.Figment 1.0 | 1.5 | 15.3% | 91 |
| cs.Wren 1.0 | 3.2 | 12.7% | 19 |
| mz.Cork 0.1 | 4.3 | 10.8% | 7 |
| js.PinBall 1.6 | 4.5 | 10.7% | 9 |
| joe.ADinosaur 1.0 | 6.2 | 9.0% | 5 |
| evd.X1 0.01 | 6.8 | 8.3% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 7.0% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 6.3% | 9 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 65.7 | 12 / 35 | 5459 |
| 2 | 2 | 61.5 | 64.8 | 12 / 35 | 4546 |
| 3 | 2 | 64.4 | 74.6 | 9 / 35 | 5472 |
| 4 | 1 | 63.1 | 67.9 | 12 / 35 | 5215 |
| 5 | 1 | 63.0 | 70.2 | 11 / 35 | 5076 |
| 6 | 2 | 63.3 | 69.5 | 12 / 35 | 5070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 63 | 24% |
| cs.Wren 1.0 | 18 | 89% |
| js.PinBall 1.6 | 12 | 100% |
| mz.Cork 0.1 | 11 | 91% |
| jsal.Jsalbot 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 60% |
| joe.ADinosaur 1.0 | 3 | 100% |
| evd.X1 0.01 | 3 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 79 | 56% | 99 |
| cs.Wren 1.0 | 13 | 9% | 29 |
| js.PinBall 1.6 | 12 | 8% | 21 |
| mz.Cork 0.1 | 11 | 8% | 21 |
| evd.X1 0.01 | 11 | 8% | 14 |
| PSW.Relentless 0.1 | 7 | 5% | 6 |
| joe.ADinosaur 1.0 | 5 | 4% | 7 |
| donjezza.Jezza 1.0 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 8 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.9 | 127 / 210 | 2.63 | 18.6% | 29609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.6% | 127 |
| myl.nano.Graviton 1.10 | 2.7 | 12.5% | 30 |
| ntc.Opposite 1.5 | 3.8 | 10.9% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.5% | 4 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.2% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 5.0 | 10.1% | 5 |
| disan.Chair 2.2.0 | 6.5 | 9.0% | 9 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 7 |
| donjezza.Muncho 1.0 | 9.2 | 5.7% | 4 |
| pbg.R2D2 1.0 | 9.8 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 30 / 35 | 5353 |
| 2 | 1 | 63.6 | 71.7 | 14 / 35 | 4382 |
| 3 | 1 | 68.2 | 83.2 | 19 / 35 | 5132 |
| 4 | 1 | 68.5 | 83.5 | 22 / 35 | 5086 |
| 5 | 1 | 67.0 | 79.7 | 21 / 35 | 4868 |
| 6 | 1 | 67.8 | 80.3 | 21 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 84% |
| stelo.AreaTargetingBot 1.1 | 26 | 77% |
| disan.Chair 2.2.0 | 21 | 90% |
| ntc.Opposite 1.5 | 16 | 75% |
| pfvicm.Sobieski 7.2.3b | 15 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 92% |
| DBall.NUKE 0.1 | 11 | 91% |
| donjezza.Muncho 1.0 | 5 | 80% |

Hadur died in 85 of 210 rounds, at a mean tick of 571. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 16 | 19% | 53 |
| ntc.Opposite 1.5 | 16 | 19% | 28 |
| stelo.AreaTargetingBot 1.1 | 15 | 18% | 35 |
| pfvicm.Sobieski 7.2.3b | 13 | 15% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 13% | 32 |
| pbg.R2D2 1.0 | 5 | 6% | 6 |
| DBall.NUKE 0.1 | 4 | 5% | 15 |
| disan.Chair 2.2.0 | 3 | 4% | 6 |
| donjezza.Muncho 1.0 | 2 | 2% | 10 |

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.0 | 99 / 210 | 3.43 | 16.0% | 25411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.0% | 99 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.4% | 37 |
| oog.melee.Capulet 1.2 | 3.0 | 14.4% | 38 |
| yagami.Tidus 0.11 | 4.3 | 12.0% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.0% | 19 |
| ejb.Polaris 1.0.1 | 6.0 | 10.2% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.4% | 0 |
| step.nanoPri 1.0 | 7.7 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 73.3 | 16 / 35 | 4211 |
| 2 | 1 | 66.4 | 76.8 | 17 / 35 | 4453 |
| 3 | 1 | 64.7 | 71.1 | 17 / 35 | 4165 |
| 4 | 1 | 67.1 | 81.9 | 16 / 35 | 4357 |
| 5 | 1 | 64.3 | 70.8 | 18 / 35 | 4220 |
| 6 | 2 | 62.2 | 63.8 | 15 / 35 | 4005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 46 | 78% |
| kawigi.micro.Shiz 1.1 | 36 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 90% |
| yagami.Tidus 0.11 | 13 | 92% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 50 | 45% | 76 |
| yagami.Tidus 0.11 | 19 | 17% | 34 |
| kawigi.micro.Shiz 1.1 | 12 | 11% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 9% | 35 |
| stelo.MirrorNano 1.3 | 9 | 8% | 11 |
| kurios.DOSexe .9a | 5 | 5% | 5 |
| step.nanoPri 1.0 | 4 | 4% | 4 |
| ejb.Polaris 1.0.1 | 2 | 2% | 12 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.0 | 139 / 210 | 2.71 | 18.1% | 28329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.1% | 139 |
| bzdp.Pansy 2.1 | 2.5 | 12.3% | 21 |
| wee.Gem 1.8.4 | 3.3 | 11.9% | 25 |
| ratosh.Nobo 0.21 | 3.8 | 11.2% | 7 |
| wompi.Quokka 1.6 | 4.5 | 11.0% | 10 |
| m3thos.Eva00 1.1 | 5.8 | 9.7% | 4 |
| bayen.UbaMicro 1.4 | 7.2 | 7.8% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.2% | 1 |
| stelo.MyAgileRobot 0.2 | 8.8 | 6.2% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.5 | 21 / 35 | 4899 |
| 2 | 1 | 65.3 | 75.6 | 19 / 35 | 4478 |
| 3 | 1 | 66.0 | 76.8 | 20 / 35 | 4870 |
| 4 | 1 | 70.2 | 91.1 | 31 / 35 | 4875 |
| 5 | 1 | 67.0 | 79.4 | 23 / 35 | 4753 |
| 6 | 1 | 67.1 | 80.6 | 25 / 35 | 4454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 61 | 97% |
| wee.Gem 1.8.4 | 37 | 86% |
| ratosh.Nobo 0.21 | 20 | 85% |
| m3thos.Eva00 1.1 | 14 | 100% |
| wompi.Quokka 1.6 | 14 | 93% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 13 | 18% | 32 |
| bzdp.Pansy 2.1 | 10 | 14% | 58 |
| wee.Gem 1.8.4 | 10 | 14% | 47 |
| bayen.UbaMicro 1.4 | 10 | 14% | 12 |
| wompi.Quokka 1.6 | 8 | 11% | 17 |
| maribo.FollowFire 1 | 8 | 11% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 6 | 8% | 9 |
| stelo.MyAgileRobot 0.2 | 4 | 6% | 6 |
| m3thos.Eva00 1.1 | 3 | 4% | 20 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 86.9 | 77 / 210 | 2.18 | 21.0% | 50206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 21.0% | 77 |
| wompi.Wallaby 5.1 | 1.8 | 19.5% | 116 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 9 |
| exauge.GateKeeper 1.1.121g | 4.0 | 10.0% | 6 |
| ayk.WallHugger 1.0 | 5.3 | 9.1% | 1 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.0% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 87.0 | 15 / 35 | 8204 |
| 2 | 1 | 72.3 | 85.4 | 14 / 35 | 8540 |
| 3 | 1 | 73.7 | 92.4 | 13 / 35 | 9006 |
| 4 | 1 | 72.8 | 88.3 | 12 / 35 | 8358 |
| 5 | 2 | 71.4 | 84.4 | 7 / 35 | 7976 |
| 6 | 1 | 72.1 | 84.1 | 16 / 35 | 8122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 136 | 34% |
| mz.NanoGod 2.02 | 16 | 75% |
| exauge.GateKeeper 1.1.121g | 14 | 64% |
| ayk.WallHugger 1.0 | 7 | 86% |
| drd.Dreadknoght 0.9 | 3 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 105 | 78% | 149 |
| mz.NanoGod 2.02 | 10 | 7% | 28 |
| exauge.GateKeeper 1.1.121g | 10 | 7% | 14 |
| ayk.WallHugger 1.0 | 5 | 4% | 10 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 73.7 | 115 / 210 | 3.37 | 16.7% | 27912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.7% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.6% | 33 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 19 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 13 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.0% | 18 |
| stelo.MirrorMicro 1.0 | 6.2 | 9.1% | 6 |
| conscience.Electron 1.3g | 7.0 | 7.8% | 2 |
| ap.Frederick 1.1 | 8.0 | 6.9% | 3 |
| dl.BetterWalls 1.0 | 9.0 | 6.1% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 75.6 | 18 / 35 | 4523 |
| 2 | 1 | 66.9 | 77.8 | 22 / 35 | 5082 |
| 3 | 2 | 61.1 | 62.9 | 12 / 35 | 4198 |
| 4 | 1 | 65.5 | 72.7 | 21 / 35 | 4844 |
| 5 | 1 | 65.9 | 77.5 | 22 / 35 | 4627 |
| 6 | 1 | 65.9 | 75.9 | 20 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 51 | 75% |
| dummy.micro.Sparrow 2.5 | 38 | 97% |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 93% |
| bvh.micro.Freya 0.3 | 14 | 86% |
| stelo.MirrorMicro 1.0 | 7 | 100% |
| ap.Frederick 1.1 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 401. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 27% | 65 |
| mn.nano.perceptual.Impact 1.3.0 | 23 | 24% | 22 |
| conscience.Electron 1.3g | 18 | 19% | 22 |
| dummy.micro.Sparrow 2.5 | 9 | 9% | 44 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 7% | 25 |
| bvh.micro.Freya 0.3 | 6 | 6% | 15 |
| dl.BetterWalls 1.0 | 4 | 4% | 8 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 9 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 47 over 6 battles (7.8 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 89.3 | 160 / 210 | 1.97 | 22.2% | 43601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.2% | 160 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.2% | 16 |
| sul.Lunar 1.1 | 3.3 | 11.5% | 12 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.0% | 10 |
| mme.NikeEnhanced 2.0 | 5.2 | 8.8% | 7 |
| dsw.StaticD 1.0 | 6.0 | 8.2% | 3 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.2% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.9% | 2 |
| sample.Corners 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 88.6 | 29 / 35 | 7442 |
| 2 | 1 | 74.0 | 95.2 | 29 / 35 | 7706 |
| 3 | 1 | 71.8 | 84.4 | 25 / 35 | 7180 |
| 4 | 1 | 71.5 | 86.7 | 23 / 35 | 6974 |
| 5 | 1 | 72.2 | 87.3 | 27 / 35 | 7108 |
| 6 | 1 | 73.5 | 93.3 | 27 / 35 | 7191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 66 | 91% |
| sul.Lunar 1.1 | 36 | 100% |
| supersample.SuperBoxBot 1.0 | 23 | 87% |
| dsw.StaticD 1.0 | 12 | 100% |
| mme.NikeEnhanced 2.0 | 11 | 55% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 16 | 31% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 22% | 68 |
| mme.NikeEnhanced 2.0 | 9 | 18% | 14 |
| sul.Lunar 1.1 | 5 | 10% | 40 |
| tlp.ThreeLeggedPig 1 | 4 | 8% | 6 |
| dsw.StaticD 1.0 | 3 | 6% | 17 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 11 |
| sample.Corners 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 22 over 6 battles (3.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 80.0 | 121 / 210 | 2.80 | 18.7% | 38122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.7% | 121 |
| radnor.DoctorBob 1.42 | 2.0 | 13.3% | 28 |
| mld.Wisdom 1.0 | 3.7 | 11.8% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.8 | 11.4% | 16 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.0% | 11 |
| amz.NanoClone 1.41 | 5.8 | 9.4% | 7 |
| sample.Walls 1.0 | 7.0 | 8.1% | 6 |
| GarmBox.Oranges 1.0 | 8.2 | 6.8% | 2 |
| jangs.ns51 1.0 | 8.5 | 6.7% | 1 |
| sample.Target 1.0 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 83.5 | 22 / 35 | 6735 |
| 2 | 1 | 67.9 | 81.6 | 20 / 35 | 5811 |
| 3 | 1 | 68.0 | 77.8 | 18 / 35 | 6665 |
| 4 | 1 | 66.6 | 77.1 | 17 / 35 | 6290 |
| 5 | 1 | 64.9 | 70.5 | 17 / 35 | 5730 |
| 6 | 1 | 71.2 | 89.5 | 27 / 35 | 6891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 49 | 90% |
| radnor.DoctorBob 1.42 | 46 | 83% |
| mld.Wisdom 1.0 | 20 | 70% |
| KiraNL.Chupacabra 0.4 | 9 | 67% |
| jangs.ns51 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 5 | 100% |
| sample.Target 1.0 | 4 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 23 | 26% | 36 |
| radnor.DoctorBob 1.42 | 19 | 21% | 56 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 19% | 63 |
| KiraNL.Chupacabra 0.4 | 17 | 19% | 24 |
| GarmBox.Oranges 1.0 | 5 | 6% | 5 |
| amz.NanoClone 1.41 | 4 | 4% | 10 |
| jangs.ns51 1.0 | 4 | 4% | 7 |
| sample.Walls 1.0 | 1 | 1% | 3 |

