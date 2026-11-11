# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 85.0 | 130 / 210 | 2.35 | 20.3% | 43378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 20.3% | 130 |
| mz.AntiGrav 1.0 | 2.2 | 14.9% | 27 |
| radnor.DoctorBob 1.42 | 3.0 | 14.4% | 27 |
| mld.Infinity 2.2 | 3.8 | 12.2% | 13 |
| amz.NanoClone 1.41 | 5.0 | 10.7% | 8 |
| sample.Walls 1.0 | 6.3 | 7.5% | 4 |
| GarmBox.Oranges 1.0 | 6.7 | 7.1% | 0 |
| jangs.ns51 1.0 | 8.0 | 5.6% | 1 |
| sample.Target 1.0 | 9.3 | 3.6% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 85.4 | 24 / 35 | 7201 |
| 2 | 1 | 72.4 | 89.5 | 22 / 35 | 7953 |
| 3 | 1 | 70.3 | 81.6 | 21 / 35 | 6956 |
| 4 | 1 | 70.2 | 81.0 | 20 / 35 | 7029 |
| 5 | 1 | 71.0 | 86.7 | 21 / 35 | 7065 |
| 6 | 1 | 71.4 | 86.0 | 22 / 35 | 7174 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 77 | 87% |
| radnor.DoctorBob 1.42 | 33 | 82% |
| mld.Infinity 2.2 | 27 | 96% |
| sample.Walls 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 3 | 67% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| sample.Target 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 30 | 38% | 68 |
| mz.AntiGrav 1.0 | 23 | 29% | 76 |
| amz.NanoClone 1.41 | 13 | 16% | 16 |
| mld.Infinity 2.2 | 6 | 8% | 30 |
| sample.Walls 1.0 | 4 | 5% | 9 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.3 | 94 / 210 | 2.95 | 16.9% | 31137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 16.9% | 94 |
| oog.melee.Mercutio 1.0 | 2.0 | 15.0% | 61 |
| mld.DustBunny 3.8 | 3.0 | 13.5% | 27 |
| maribo.melee.BMV 0.1 | 3.8 | 10.7% | 2 |
| zyx.nano.Ant 1.1 | 5.3 | 9.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.8% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.2% | 8 |
| fullsail.SweetTea 1.1 | 7.8 | 7.3% | 7 |
| bzdp.BoxCar 2.0 | 8.3 | 7.5% | 0 |
| cs.Grudge 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.0 | 16 / 35 | 5071 |
| 2 | 2 | 63.1 | 71.1 | 14 / 35 | 4871 |
| 3 | 1 | 65.5 | 76.2 | 18 / 35 | 5515 |
| 4 | 1 | 66.8 | 80.3 | 16 / 35 | 5191 |
| 5 | 1 | 65.9 | 78.1 | 14 / 35 | 5272 |
| 6 | 1 | 67.3 | 83.2 | 16 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 50 | 68% |
| mld.DustBunny 3.8 | 43 | 74% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 8 | 88% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 67% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 33% | 76 |
| mld.DustBunny 3.8 | 37 | 31% | 67 |
| maribo.melee.BMV 0.1 | 9 | 8% | 18 |
| zyx.nano.Ant 1.1 | 9 | 8% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 8% | 12 |
| fullsail.SweetTea 1.1 | 6 | 5% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 4% | 9 |
| cs.Grudge 1.0 | 3 | 3% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 74.8 | 98 / 210 | 3.27 | 17.2% | 33945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 17.2% | 98 |
| myl.micro.Troodon 1.10 | 1.8 | 15.6% | 54 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.4% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 4.2 | 11.4% | 25 |
| cb.nano.Insomnia 1.0 | 4.7 | 10.3% | 18 |
| fm.mammillarias 1.3 | 5.7 | 9.6% | 5 |
| cs.sheldor.Talon 1.1 | 7.2 | 8.4% | 0 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.2% | 4 |
| sample.Fire 1.0 | 9.5 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 73.7 | 16 / 35 | 5932 |
| 2 | 1 | 67.8 | 78.1 | 19 / 35 | 6053 |
| 3 | 1 | 66.3 | 77.8 | 14 / 35 | 5577 |
| 4 | 1 | 64.4 | 68.6 | 18 / 35 | 5236 |
| 5 | 2 | 63.7 | 68.6 | 13 / 35 | 5002 |
| 6 | 1 | 68.9 | 81.9 | 18 / 35 | 6145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 37 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 28 | 75% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| myl.nano.KomoriNinja 1.1 | 13 | 100% |
| sp.Nanos.Ember 1.1 | 10 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 530. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 30 | 27% | 61 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 24% | 45 |
| fm.mammillarias 1.3 | 18 | 16% | 20 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 18 |
| myl.nano.KomoriNinja 1.1 | 11 | 10% | 33 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 13 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 13 |
| sample.Tracker 1.0 | 1 | 1% | 1 |
| sample.Fire 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 80.3 | 125 / 210 | 2.77 | 18.9% | 38192 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 18.9% | 125 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.0% | 21 |
| tvv.micro.Antares 1.1.1 | 3.2 | 11.4% | 15 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.4% | 20 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 10 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.4% | 2 |
| yk.JahMicro 1.0 | 7.2 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.9% | 10 |
| repositorio.NanoStep 1.0 | 8.8 | 6.4% | 2 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 82.2 | 23 / 35 | 6713 |
| 2 | 1 | 69.5 | 86.0 | 22 / 35 | 6276 |
| 3 | 1 | 67.3 | 77.5 | 17 / 35 | 6391 |
| 4 | 1 | 67.0 | 76.2 | 21 / 35 | 6051 |
| 5 | 1 | 66.2 | 73.0 | 17 / 35 | 5954 |
| 6 | 1 | 70.5 | 87.0 | 25 / 35 | 6807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 91% |
| stelo.SoJNanoMelee 1.1 | 29 | 83% |
| tj.zombie1n 1.0.1 | 14 | 93% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 67% |
| repositorio.NanoStep 1.0 | 8 | 100% |
| yk.JahMicro 1.0 | 8 | 88% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 38% | 90 |
| stelo.SoJNanoMelee 1.1 | 13 | 15% | 30 |
| tvv.micro.Antares 1.1.1 | 11 | 13% | 28 |
| tj.zombie1n 1.0.1 | 9 | 11% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 8 | 9% | 12 |
| yk.JahMicro 1.0 | 6 | 7% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 6% | 14 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 13 |

## Melee bench: F05

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 63.7 | 65 / 210 | 4.27 | 14.4% | 29101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 14.4% | 65 |
| oog.melee.Corsair 1.0 | 2.0 | 13.0% | 35 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 11.5% | 29 |
| ahf.NanoAndrew .4 | 3.8 | 11.5% | 30 |
| EBBU.Sim2 1.02 | 5.7 | 10.1% | 12 |
| sam.Samspin 1.0 | 5.8 | 10.0% | 20 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 9.1% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.2 | 9.1% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 59.9 | 60.6 | 10 / 35 | 4683 |
| 2 | 1 | 60.4 | 63.8 | 11 / 35 | 4673 |
| 3 | 1 | 62.6 | 67.9 | 13 / 35 | 5098 |
| 4 | 1 | 60.6 | 64.4 | 12 / 35 | 4654 |
| 5 | 1 | 60.0 | 58.1 | 8 / 35 | 5250 |
| 6 | 1 | 61.6 | 67.3 | 11 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 54% |
| simonton.nano.MeleeSeed 1.8 | 25 | 80% |
| EBBU.Sim2 1.02 | 10 | 100% |
| sam.Samspin 1.0 | 9 | 67% |
| ahf.NanoAndrew .4 | 9 | 78% |
| zyx.nano.BacillusComma 1.0 | 6 | 67% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 407. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 26 | 18% | 45 |
| simonton.nano.MeleeSeed 1.8 | 22 | 15% | 39 |
| zyx.nano.BacillusComma 1.0 | 20 | 14% | 23 |
| EBBU.Sim2 1.02 | 17 | 12% | 23 |
| robar.nano.Assertive_Melee 0.2 | 17 | 12% | 20 |
| ahf.NanoAndrew .4 | 16 | 11% | 26 |
| sam.Samspin 1.0 | 15 | 10% | 19 |
| sample.TrackFire 1.0 | 8 | 5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 4% | 7 |

## Melee bench: F06

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.5 | 106 / 210 | 3.03 | 17.1% | 30428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 17.1% | 106 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.8% | 37 |
| gh.nano.Grofvuil 0.2 | 3.2 | 12.3% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.4% | 20 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 9.1% | 8 |
| fm.claire 1.7 | 6.0 | 8.6% | 5 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.0% | 5 |
| sample.SpinBot 1.0 | 7.8 | 6.9% | 1 |
| pa.Improved 1.0 | 8.8 | 6.4% | 1 |
| kurios.DOSexe .9b | 10.0 | 5.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.5 | 20 / 35 | 5142 |
| 2 | 1 | 63.2 | 71.1 | 13 / 35 | 4775 |
| 3 | 1 | 65.1 | 78.1 | 17 / 35 | 4656 |
| 4 | 1 | 63.7 | 69.8 | 15 / 35 | 5189 |
| 5 | 1 | 68.8 | 83.2 | 22 / 35 | 5951 |
| 6 | 1 | 65.4 | 79.0 | 19 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 77% |
| oog.melee.CapuletDroid 1.1 | 21 | 100% |
| gh.nano.Grofvuil 0.2 | 19 | 79% |
| arthord.NanoSatanMelee Beta | 13 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 71% |
| sample.SpinBot 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| pa.Improved 1.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 33% | 69 |
| gh.nano.Grofvuil 0.2 | 15 | 14% | 31 |
| fm.claire 1.7 | 12 | 12% | 16 |
| winamp32.micro.MicroMacro 1.0 | 11 | 11% | 17 |
| arthord.NanoSatanMelee Beta | 10 | 10% | 19 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 32 |
| sample.SpinBot 1.0 | 6 | 6% | 10 |
| kurios.DOSexe .9b | 5 | 5% | 11 |
| pa.Improved 1.0 | 4 | 4% | 5 |

## Melee bench: F07

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.3 | 94 / 210 | 3.13 | 17.1% | 33969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 17.1% | 94 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.3% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.0 | 14.2% | 31 |
| mz.MicroGodMelee 1 | 3.2 | 13.6% | 36 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 5 |
| caimano.Furia_Ceca 0.22 | 5.7 | 7.9% | 1 |
| acogdev.alpha 0.2 | 8.0 | 6.5% | 2 |
| el.JumpShoot 0.2 | 8.2 | 6.1% | 2 |
| mbro.Detektor3 0.1.1 | 8.3 | 6.0% | 2 |
| fire219.CatBot 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 72.1 | 12 / 35 | 5581 |
| 2 | 1 | 68.2 | 84.1 | 20 / 35 | 5667 |
| 3 | 1 | 67.4 | 81.3 | 15 / 35 | 5816 |
| 4 | 1 | 65.0 | 72.7 | 15 / 35 | 5292 |
| 5 | 1 | 66.5 | 75.9 | 19 / 35 | 5939 |
| 6 | 1 | 65.1 | 72.1 | 13 / 35 | 5674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 45 | 96% |
| mz.MicroGodMelee 1 | 42 | 67% |
| gh.micro.Gruweltje 0.7 | 12 | 58% |
| DBall.Anarchy 0.1 | 6 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| acogdev.alpha 0.2 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 40 | 34% | 66 |
| spinnercat.micro.Tyger 0.1 | 24 | 21% | 60 |
| gh.micro.Gruweltje 0.7 | 21 | 18% | 34 |
| caimano.Furia_Ceca 0.22 | 13 | 11% | 15 |
| acogdev.alpha 0.2 | 8 | 7% | 11 |
| DBall.Anarchy 0.1 | 3 | 3% | 12 |
| el.JumpShoot 0.2 | 3 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 2 | 2% | 5 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.2 | 95 / 210 | 3.69 | 16.1% | 32191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 1.3 | 16.2% | 54 |
| hadur117.micro.SaorWNW 0.1 | 2.0 | 16.1% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.5% | 33 |
| germ.TheMind .2 | 4.8 | 9.6% | 7 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.5% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.3% | 2 |
| awesomeness.Elite 1.0 | 6.8 | 8.0% | 7 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.9% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.8% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 61.9 | 9 / 35 | 5315 |
| 2 | 1 | 68.4 | 81.9 | 25 / 35 | 5876 |
| 3 | 2 | 64.4 | 69.5 | 16 / 35 | 5401 |
| 4 | 1 | 66.2 | 76.2 | 18 / 35 | 5526 |
| 5 | 3 | 58.9 | 57.8 | 9 / 35 | 4647 |
| 6 | 2 | 65.6 | 73.7 | 18 / 35 | 5426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 56 | 84% |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 76% |
| germ.TheMind .2 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 48 | 41% | 91 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 18% | 37 |
| germ.TheMind .2 | 16 | 14% | 26 |
| qualidafial.MajorDick 1.0.1 | 11 | 9% | 13 |
| stelo.UntouchableNano 1.3 | 9 | 8% | 15 |
| awesomeness.Elite 1.0 | 5 | 4% | 12 |
| sample.Crazy 1.0 | 3 | 3% | 8 |
| lrem.micro.MoggFanatic 0.2 | 2 | 2% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 78.9 | 117 / 210 | 2.90 | 17.7% | 29602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 17.7% | 117 |
| rz.HawkOnFire 0.1 | 2.2 | 13.6% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.4% | 23 |
| maribo.IotaCT 1.1 | 4.7 | 10.5% | 11 |
| timmit.nano.TimDog 0.33 | 5.2 | 10.0% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.8% | 3 |
| ratosh.Wesco 1.4 | 6.7 | 8.9% | 5 |
| spinnercat.Omen 1.0 | 8.2 | 8.0% | 6 |
| stelo.PatternRobot 1.0 | 8.8 | 7.5% | 8 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 65.1 | 14 / 35 | 4566 |
| 2 | 1 | 66.8 | 78.1 | 19 / 35 | 4742 |
| 3 | 1 | 69.1 | 87.0 | 23 / 35 | 5074 |
| 4 | 1 | 67.7 | 80.6 | 21 / 35 | 5177 |
| 5 | 1 | 66.9 | 77.5 | 19 / 35 | 4983 |
| 6 | 1 | 68.8 | 85.1 | 21 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 56 | 96% |
| nz.jdc.nano.GridFu 1.0 | 24 | 100% |
| timmit.nano.TimDog 0.33 | 15 | 53% |
| ratosh.Wesco 1.4 | 11 | 82% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| maribo.IotaCT 1.1 | 7 | 86% |
| spinnercat.Omen 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 26 | 28% | 38 |
| rz.HawkOnFire 0.1 | 19 | 20% | 62 |
| ratosh.Wesco 1.4 | 16 | 17% | 26 |
| nz.jdc.nano.GridFu 1.0 | 11 | 12% | 43 |
| stelo.PatternRobot 1.0 | 10 | 11% | 18 |
| maribo.IotaCT 1.1 | 9 | 10% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 2% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 85.9 | 146 / 210 | 2.27 | 20.3% | 40128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 20.3% | 146 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.8% | 25 |
| baal.nano.N 1.42 | 3.2 | 11.5% | 9 |
| Grystrion.TrackerWO 1.0 | 4.2 | 10.2% | 5 |
| zyx.micro.Ant 1.1 | 5.3 | 9.4% | 10 |
| squidM.TentalceMeleeNano 1.1 | 7.0 | 8.0% | 3 |
| sanja.First 0.1 | 7.0 | 7.8% | 3 |
| cvt.Firsty 1.0 | 7.2 | 7.7% | 7 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.3% | 1 |
| sample.RamFire 1.0 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.8 | 25 / 35 | 6438 |
| 2 | 1 | 69.3 | 83.8 | 21 / 35 | 6502 |
| 3 | 1 | 70.8 | 88.6 | 27 / 35 | 6975 |
| 4 | 1 | 68.4 | 81.0 | 20 / 35 | 6436 |
| 5 | 1 | 69.9 | 86.0 | 24 / 35 | 6413 |
| 6 | 1 | 72.4 | 91.1 | 29 / 35 | 7364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 31 | 90% |
| baal.nano.N 1.42 | 30 | 93% |
| cvt.Firsty 1.0 | 24 | 79% |
| zyx.micro.Ant 1.1 | 22 | 91% |
| Grystrion.TrackerWO 1.0 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| sanja.First 0.1 | 14 | 100% |
| squidM.TentalceMeleeNano 1.1 | 6 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 24 | 38% | 37 |
| Grystrion.TrackerWO 1.0 | 8 | 13% | 19 |
| tvv.nano.Polaris 1.2 | 7 | 11% | 53 |
| baal.nano.N 1.42 | 7 | 11% | 37 |
| cvt.Firsty 1.0 | 7 | 11% | 19 |
| squidM.TentalceMeleeNano 1.1 | 4 | 6% | 14 |
| sanja.First 0.1 | 3 | 5% | 22 |
| amk.Punbot.Punbot 0.01 | 3 | 5% | 5 |
| sample.RamFire 1.0 | 1 | 2% | 4 |

## Melee bench: F11

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 62.3 | 68 / 210 | 4.39 | 14.2% | 30613 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.4% | 69 |
| hadur117.micro.SaorWNW 0.1 | 2.5 | 14.2% | 68 |
| cs.Wren 1.0 | 2.5 | 13.1% | 25 |
| mz.Cork 0.1 | 4.3 | 11.4% | 15 |
| js.PinBall 1.6 | 4.5 | 11.2% | 12 |
| joe.ADinosaur 1.0 | 6.2 | 9.8% | 4 |
| evd.X1 0.01 | 6.7 | 8.7% | 4 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 8 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 6 |
| PSW.Relentless 0.1 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 74.3 | 12 / 35 | 6121 |
| 2 | 2 | 61.5 | 62.5 | 14 / 35 | 4942 |
| 3 | 2 | 62.6 | 65.4 | 13 / 35 | 5503 |
| 4 | 2 | 61.5 | 63.8 | 13 / 35 | 5076 |
| 5 | 5 | 56.9 | 52.4 | 7 / 35 | 4517 |
| 6 | 3 | 57.3 | 55.6 | 9 / 35 | 4454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 39 | 77% |
| cs.Wren 1.0 | 29 | 86% |
| js.PinBall 1.6 | 9 | 56% |
| mz.Cork 0.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| joe.ADinosaur 1.0 | 2 | 0% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 35% | 81 |
| cs.Wren 1.0 | 26 | 18% | 46 |
| js.PinBall 1.6 | 18 | 13% | 22 |
| evd.X1 0.01 | 14 | 10% | 17 |
| joe.ADinosaur 1.0 | 13 | 9% | 14 |
| mz.Cork 0.1 | 11 | 8% | 16 |
| PSW.Relentless 0.1 | 6 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |

## Melee bench: F12

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.5 | 94 / 210 | 3.75 | 15.7% | 27734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 15.7% | 94 |
| myl.nano.Graviton 1.10 | 2.5 | 12.3% | 38 |
| ntc.Opposite 1.5 | 3.7 | 11.2% | 10 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.2% | 31 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 4 |
| pfvicm.Sobieski 7.2.3b | 6.2 | 9.9% | 10 |
| disan.Chair 2.2.0 | 6.5 | 9.1% | 15 |
| DBall.NUKE 0.1 | 8.2 | 8.1% | 3 |
| donjezza.Muncho 1.0 | 9.2 | 6.2% | 4 |
| pbg.R2D2 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 66.7 | 15 / 35 | 4647 |
| 2 | 1 | 63.4 | 70.2 | 16 / 35 | 4634 |
| 3 | 1 | 63.5 | 69.8 | 18 / 35 | 4434 |
| 4 | 1 | 62.6 | 65.7 | 16 / 35 | 4638 |
| 5 | 1 | 65.0 | 78.4 | 14 / 35 | 4525 |
| 6 | 1 | 62.5 | 66.0 | 15 / 35 | 4856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 29 | 83% |
| stelo.AreaTargetingBot 1.1 | 27 | 81% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 95% |
| DBall.NUKE 0.1 | 9 | 100% |
| disan.Chair 2.2.0 | 7 | 86% |
| ntc.Opposite 1.5 | 5 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| donjezza.Muncho 1.0 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 435. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.nano.Graviton 1.10 | 28 | 24% | 57 |
| pfvicm.Sobieski 7.2.3b | 23 | 20% | 25 |
| stelo.AreaTargetingBot 1.1 | 18 | 16% | 37 |
| ntc.Opposite 1.5 | 18 | 16% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 18 |
| disan.Chair 2.2.0 | 7 | 6% | 19 |
| DBall.NUKE 0.1 | 6 | 5% | 17 |
| pbg.R2D2 1.0 | 4 | 3% | 7 |
| donjezza.Muncho 1.0 | 3 | 3% | 6 |

## Melee bench: F13

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 65.6 | 62 / 210 | 4.10 | 13.9% | 24814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 1.8 | 14.8% | 58 |
| hadur117.micro.SaorWNW 0.1 | 2.3 | 13.9% | 62 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.4% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.6% | 22 |
| yagami.Tidus 0.11 | 4.3 | 12.3% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 6.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.1 | 67.6 | 12 / 35 | 4161 |
| 2 | 3 | 62.3 | 66.3 | 10 / 35 | 4428 |
| 3 | 1 | 63.6 | 70.2 | 13 / 35 | 4501 |
| 4 | 4 | 59.5 | 61.9 | 8 / 35 | 3668 |
| 5 | 2 | 62.8 | 69.8 | 10 / 35 | 4271 |
| 6 | 3 | 58.5 | 57.5 | 9 / 35 | 3785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 33 | 67% |
| kawigi.micro.Shiz 1.1 | 20 | 90% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 59% |
| yagami.Tidus 0.11 | 7 | 86% |
| ejb.Polaris 1.0.1 | 4 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 51 | 34% | 71 |
| yagami.Tidus 0.11 | 30 | 20% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 17% | 41 |
| kawigi.micro.Shiz 1.1 | 16 | 11% | 30 |
| ejb.Polaris 1.0.1 | 8 | 5% | 14 |
| stelo.MirrorNano 1.3 | 8 | 5% | 8 |
| kurios.DOSexe .9a | 5 | 3% | 6 |
| step.nanoPri 1.0 | 5 | 3% | 6 |

## Melee bench: F14

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.1 | 100 / 210 | 3.60 | 15.7% | 27091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 15.7% | 100 |
| bzdp.Pansy 2.1 | 2.8 | 13.0% | 31 |
| ratosh.Nobo 0.21 | 3.7 | 11.7% | 13 |
| wee.Gem 1.8.4 | 3.7 | 12.1% | 35 |
| wompi.Quokka 1.6 | 4.3 | 11.5% | 18 |
| m3thos.Eva00 1.1 | 5.7 | 10.0% | 9 |
| bayen.UbaMicro 1.4 | 6.8 | 8.9% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 6.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.6 | 20 / 35 | 4481 |
| 2 | 1 | 64.6 | 73.0 | 17 / 35 | 4738 |
| 3 | 1 | 63.2 | 69.2 | 18 / 35 | 4550 |
| 4 | 1 | 61.2 | 66.0 | 13 / 35 | 4139 |
| 5 | 1 | 65.9 | 79.0 | 18 / 35 | 4805 |
| 6 | 1 | 61.1 | 63.8 | 14 / 35 | 4378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 35 | 89% |
| wee.Gem 1.8.4 | 30 | 90% |
| wompi.Quokka 1.6 | 24 | 96% |
| ratosh.Nobo 0.21 | 15 | 73% |
| m3thos.Eva00 1.1 | 6 | 100% |
| bayen.UbaMicro 1.4 | 4 | 50% |

Hadur died in 111 of 210 rounds, at a mean tick of 388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ratosh.Nobo 0.21 | 24 | 22% | 36 |
| bzdp.Pansy 2.1 | 17 | 15% | 53 |
| bayen.UbaMicro 1.4 | 15 | 14% | 17 |
| wee.Gem 1.8.4 | 14 | 13% | 40 |
| m3thos.Eva00 1.1 | 12 | 11% | 17 |
| maribo.FollowFire 1 | 10 | 9% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 8% | 11 |
| wompi.Quokka 1.6 | 5 | 5% | 18 |
| stelo.MyAgileRobot 0.2 | 5 | 5% | 5 |

## Melee bench: F15

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 87.8 | 129 / 210 | 2.10 | 21.4% | 47956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 21.4% | 129 |
| wompi.Wallaby 5.1 | 2.0 | 17.6% | 52 |
| mz.NanoGod 2.02 | 3.0 | 14.3% | 25 |
| ayk.WallHugger 1.0 | 4.5 | 9.6% | 0 |
| exauge.GateKeeper 1.1.121g | 5.2 | 9.0% | 2 |
| stuff.Vlad 0.1 | 5.3 | 8.6% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.4% | 1 |
| drd.Dreadknoght 0.9 | 7.8 | 5.6% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 92.1 | 23 / 35 | 7946 |
| 2 | 1 | 73.4 | 90.8 | 22 / 35 | 8210 |
| 3 | 1 | 71.7 | 84.4 | 22 / 35 | 7707 |
| 4 | 1 | 73.1 | 88.6 | 20 / 35 | 8275 |
| 5 | 1 | 70.9 | 81.9 | 18 / 35 | 7640 |
| 6 | 1 | 73.0 | 89.2 | 24 / 35 | 8178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 109 | 83% |
| mz.NanoGod 2.02 | 17 | 59% |
| ayk.WallHugger 1.0 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 10 | 90% |
| stelo.PianistNano 1.2 | 4 | 75% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 30 | 37% | 123 |
| mz.NanoGod 2.02 | 28 | 35% | 43 |
| exauge.GateKeeper 1.1.121g | 10 | 12% | 13 |
| ayk.WallHugger 1.0 | 8 | 10% | 20 |
| stelo.PianistNano 1.2 | 4 | 5% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.8 | 94 / 210 | 3.81 | 15.5% | 28611 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.2 | 15.5% | 94 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.1% | 26 |
| dummy.micro.Sparrow 2.5 | 2.7 | 12.6% | 22 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 11.0% | 23 |
| bvh.micro.Freya 0.3 | 4.7 | 10.9% | 18 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.5% | 8 |
| conscience.Electron 1.3g | 7.0 | 8.3% | 5 |
| dl.BetterWalls 1.0 | 8.2 | 7.0% | 5 |
| ap.Frederick 1.1 | 8.7 | 6.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 75.9 | 14 / 35 | 4982 |
| 2 | 1 | 60.9 | 64.8 | 13 / 35 | 4410 |
| 3 | 1 | 64.9 | 73.3 | 19 / 35 | 4868 |
| 4 | 1 | 62.8 | 67.3 | 17 / 35 | 4905 |
| 5 | 2 | 60.2 | 58.1 | 14 / 35 | 4729 |
| 6 | 1 | 64.3 | 73.3 | 17 / 35 | 4717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 79% |
| dummy.micro.Sparrow 2.5 | 29 | 93% |
| bvh.micro.Freya 0.3 | 19 | 84% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 76% |
| stelo.MirrorMicro 1.0 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 425. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 26 | 22% | 57 |
| davidalves.net.DuelistMicroMelee 1.4 | 20 | 17% | 41 |
| conscience.Electron 1.3g | 20 | 17% | 22 |
| dummy.micro.Sparrow 2.5 | 15 | 13% | 36 |
| bvh.micro.Freya 0.3 | 14 | 12% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 9% | 11 |
| dl.BetterWalls 1.0 | 5 | 4% | 10 |
| stelo.MirrorMicro 1.0 | 5 | 4% | 9 |

## Melee bench: F17

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 83.0 | 129 / 210 | 2.53 | 20.1% | 42310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 20.1% | 129 |
| sheldor.melee.nano.TestMelee 0.1 | 2.2 | 14.7% | 23 |
| supersample.SuperBoxBot 1.0 | 3.0 | 11.6% | 25 |
| sul.Lunar 1.1 | 4.0 | 11.1% | 9 |
| mme.NikeEnhanced 2.0 | 4.8 | 9.7% | 9 |
| dsw.StaticD 1.0 | 6.3 | 8.0% | 6 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.8 | 6.2% | 4 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 5 |
| sample.Corners 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 85.7 | 21 / 35 | 7117 |
| 2 | 1 | 70.4 | 81.0 | 20 / 35 | 7240 |
| 3 | 1 | 69.9 | 84.1 | 25 / 35 | 6325 |
| 4 | 1 | 69.6 | 81.6 | 21 / 35 | 6975 |
| 5 | 1 | 70.0 | 84.4 | 20 / 35 | 6928 |
| 6 | 1 | 70.3 | 81.0 | 22 / 35 | 7725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 46 | 87% |
| sul.Lunar 1.1 | 39 | 97% |
| supersample.SuperBoxBot 1.0 | 26 | 77% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 100% |
| dsw.StaticD 1.0 | 5 | 40% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| sample.Corners 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 29 | 36% | 40 |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 25% | 67 |
| mme.NikeEnhanced 2.0 | 9 | 11% | 18 |
| dsw.StaticD 1.0 | 7 | 9% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 7% | 10 |
| sample.Corners 1.0 | 4 | 5% | 9 |
| sul.Lunar 1.1 | 3 | 4% | 42 |
| tlp.ThreeLeggedPig 1 | 3 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F18

hadur117.micro.SaorWNW 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 70.5 | 91 / 210 | 3.65 | 16.5% | 36132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWNW 0.1 | 1.0 | 16.5% | 91 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.8 | 12.8% | 32 |
| mld.Wisdom 1.0 | 4.0 | 11.5% | 15 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.1% | 5 |
| amz.NanoClone 1.41 | 5.8 | 10.0% | 16 |
| sample.Walls 1.0 | 6.7 | 8.6% | 11 |
| GarmBox.Oranges 1.0 | 7.7 | 7.5% | 1 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 67.9 | 15 / 35 | 6234 |
| 2 | 1 | 66.5 | 77.1 | 14 / 35 | 6200 |
| 3 | 1 | 64.9 | 69.2 | 18 / 35 | 5965 |
| 4 | 1 | 65.5 | 71.1 | 16 / 35 | 6553 |
| 5 | 1 | 62.5 | 65.7 | 14 / 35 | 5157 |
| 6 | 1 | 65.3 | 72.1 | 14 / 35 | 6023 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 39 | 90% |
| radnor.DoctorBob 1.42 | 23 | 70% |
| mld.Wisdom 1.0 | 14 | 79% |
| sample.Walls 1.0 | 8 | 100% |
| KiraNL.Chupacabra 0.4 | 8 | 88% |
| amz.NanoClone 1.41 | 7 | 43% |
| GarmBox.Oranges 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 30 | 25% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 20% | 62 |
| radnor.DoctorBob 1.42 | 20 | 17% | 39 |
| KiraNL.Chupacabra 0.4 | 16 | 13% | 26 |
| amz.NanoClone 1.41 | 15 | 13% | 18 |
| GarmBox.Oranges 1.0 | 6 | 5% | 5 |
| sample.Walls 1.0 | 4 | 3% | 10 |
| jangs.ns51 1.0 | 4 | 3% | 8 |

