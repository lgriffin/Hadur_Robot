# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 90.4 | 150 / 210 | 1.87 | 21.4% | 42843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 21.4% | 150 |
| mz.AntiGrav 1.0 | 2.5 | 14.1% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 23 |
| mld.Infinity 2.2 | 3.7 | 13.1% | 14 |
| amz.NanoClone 1.41 | 5.0 | 10.0% | 1 |
| sample.Walls 1.0 | 6.5 | 7.2% | 2 |
| jangs.ns51 1.0 | 7.2 | 6.3% | 0 |
| GarmBox.Oranges 1.0 | 7.3 | 6.4% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.0% | 0 |
| sample.Target 1.0 | 9.8 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 90.8 | 26 / 35 | 6963 |
| 2 | 1 | 72.9 | 92.4 | 25 / 35 | 7516 |
| 3 | 1 | 74.0 | 95.2 | 30 / 35 | 7666 |
| 4 | 1 | 72.2 | 91.7 | 27 / 35 | 6581 |
| 5 | 1 | 69.9 | 81.9 | 18 / 35 | 6845 |
| 6 | 1 | 72.3 | 90.2 | 24 / 35 | 7272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 84% |
| mld.Infinity 2.2 | 49 | 100% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| amz.NanoClone 1.41 | 9 | 89% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 38% | 61 |
| mz.AntiGrav 1.0 | 17 | 28% | 63 |
| amz.NanoClone 1.41 | 7 | 12% | 16 |
| mld.Infinity 2.2 | 5 | 8% | 50 |
| jangs.ns51 1.0 | 3 | 5% | 7 |
| GarmBox.Oranges 1.0 | 3 | 5% | 3 |
| arthord.MannyPacquiao Beta | 2 | 3% | 2 |
| sample.Walls 1.0 | 0 | 0% | 6 |

## Melee bench: F02

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.9 | 109 / 210 | 2.45 | 18.0% | 31133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.0% | 109 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.9% | 65 |
| mld.DustBunny 3.8 | 2.8 | 14.1% | 20 |
| maribo.melee.BMV 0.1 | 4.0 | 10.7% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 8.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.0% | 8 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 1 |
| fullsail.SweetTea 1.1 | 7.3 | 6.7% | 0 |
| bzdp.BoxCar 2.0 | 8.5 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 22 / 35 | 5576 |
| 2 | 1 | 68.1 | 86.3 | 16 / 35 | 5388 |
| 3 | 1 | 66.9 | 83.8 | 15 / 35 | 4982 |
| 4 | 1 | 68.3 | 87.3 | 22 / 35 | 5107 |
| 5 | 1 | 65.2 | 75.9 | 15 / 35 | 5159 |
| 6 | 1 | 67.6 | 86.3 | 19 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 55 | 84% |
| oog.melee.Mercutio 1.0 | 49 | 59% |
| maribo.melee.BMV 0.1 | 10 | 80% |
| djdjdj.NanoSkunk10 1.0 | 8 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| zyx.nano.Ant 1.1 | 5 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 38 | 37% | 75 |
| mld.DustBunny 3.8 | 32 | 31% | 74 |
| maribo.melee.BMV 0.1 | 9 | 9% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 15 |
| cs.Grudge 1.0 | 6 | 6% | 5 |
| zyx.nano.Ant 1.1 | 5 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 3% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |
| bzdp.BoxCar 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 84.8 | 135 / 210 | 2.37 | 19.9% | 37834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 19.9% | 135 |
| myl.micro.Troodon 1.10 | 2.0 | 14.4% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 11.3% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 3.8 | 11.3% | 18 |
| cb.nano.Insomnia 1.0 | 4.7 | 9.9% | 6 |
| fm.mammillarias 1.3 | 6.0 | 9.0% | 4 |
| cs.sheldor.Talon 1.1 | 7.0 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 8.2 | 6.4% | 6 |
| sample.Fire 1.0 | 9.3 | 4.8% | 2 |
| sample.Tracker 1.0 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 85.1 | 24 / 35 | 6771 |
| 2 | 1 | 70.4 | 88.6 | 24 / 35 | 6083 |
| 3 | 1 | 70.8 | 86.3 | 25 / 35 | 6430 |
| 4 | 1 | 69.0 | 81.3 | 22 / 35 | 6132 |
| 5 | 1 | 69.7 | 84.4 | 22 / 35 | 6330 |
| 6 | 1 | 68.8 | 83.2 | 18 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 55 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 44 | 84% |
| cb.nano.Insomnia 1.0 | 20 | 100% |
| myl.nano.KomoriNinja 1.1 | 12 | 92% |
| sp.Nanos.Ember 1.1 | 9 | 89% |
| fm.mammillarias 1.3 | 4 | 100% |
| sample.Fire 1.0 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 19 | 25% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 24% | 50 |
| fm.mammillarias 1.3 | 12 | 16% | 18 |
| myl.nano.KomoriNinja 1.1 | 10 | 13% | 28 |
| cb.nano.Insomnia 1.0 | 7 | 9% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 7 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 14 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| sample.Fire 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.9 | 144 / 210 | 1.91 | 20.9% | 39772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 20.9% | 144 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.1% | 17 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.7% | 11 |
| stelo.SoJNanoMelee 1.1 | 5.0 | 9.0% | 23 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.0 | 9.2% | 1 |
| tj.zombie1n 1.0.1 | 5.3 | 9.3% | 3 |
| yk.JahMicro 1.0 | 7.3 | 7.7% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.6% | 5 |
| repositorio.NanoStep 1.0 | 8.7 | 6.4% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 20 / 35 | 6629 |
| 2 | 1 | 72.0 | 91.1 | 26 / 35 | 7143 |
| 3 | 1 | 71.6 | 92.1 | 27 / 35 | 6522 |
| 4 | 1 | 71.1 | 89.5 | 25 / 35 | 6759 |
| 5 | 1 | 69.6 | 84.1 | 21 / 35 | 6714 |
| 6 | 1 | 70.4 | 91.1 | 25 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 64 | 88% |
| stelo.SoJNanoMelee 1.1 | 43 | 74% |
| tj.zombie1n 1.0.1 | 17 | 94% |
| yk.JahMicro 1.0 | 15 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 15 | 80% |
| tvv.micro.Antares 1.1.1 | 8 | 75% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 35% | 95 |
| stelo.SoJNanoMelee 1.1 | 17 | 26% | 39 |
| tvv.micro.Antares 1.1.1 | 9 | 14% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 9% | 19 |
| tj.zombie1n 1.0.1 | 5 | 8% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 5% | 5 |
| yk.JahMicro 1.0 | 1 | 2% | 9 |
| repositorio.NanoStep 1.0 | 1 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 2% | 4 |

## Melee bench: F05

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 74.0 | 104 / 210 | 3.34 | 16.7% | 30664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 16.7% | 104 |
| oog.melee.Corsair 1.0 | 2.5 | 12.4% | 24 |
| ahf.NanoAndrew .4 | 2.8 | 11.6% | 29 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.3% | 11 |
| EBBU.Sim2 1.02 | 5.3 | 9.7% | 7 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 13 |
| zyx.nano.BacillusComma 1.0 | 6.8 | 9.0% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.7% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 6.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 78.7 | 22 / 35 | 5367 |
| 2 | 1 | 65.3 | 77.1 | 18 / 35 | 5057 |
| 3 | 1 | 64.9 | 72.7 | 20 / 35 | 5071 |
| 4 | 1 | 63.1 | 69.5 | 15 / 35 | 4855 |
| 5 | 1 | 66.1 | 78.1 | 16 / 35 | 5510 |
| 6 | 1 | 62.4 | 67.6 | 13 / 35 | 4804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 37 | 97% |
| oog.melee.Corsair 1.0 | 27 | 70% |
| ahf.NanoAndrew .4 | 17 | 82% |
| sam.Samspin 1.0 | 11 | 100% |
| EBBU.Sim2 1.02 | 11 | 91% |
| zyx.nano.BacillusComma 1.0 | 8 | 88% |
| robar.nano.Assertive_Melee 0.2 | 6 | 67% |
| sample.TrackFire 1.0 | 1 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 18 | 17% | 43 |
| robar.nano.Assertive_Melee 0.2 | 17 | 16% | 19 |
| zyx.nano.BacillusComma 1.0 | 15 | 14% | 22 |
| bwbaugh.nano.Tirunculus 0.0.0a | 14 | 13% | 15 |
| ahf.NanoAndrew .4 | 13 | 12% | 35 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 43 |
| EBBU.Sim2 1.02 | 10 | 9% | 16 |
| sam.Samspin 1.0 | 6 | 6% | 15 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.1 | 125 / 210 | 2.43 | 18.6% | 32414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.6% | 125 |
| d414.nano.Quantum 1.0.0 | 2.3 | 14.1% | 35 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.6% | 17 |
| oog.melee.CapuletDroid 1.1 | 3.8 | 10.7% | 14 |
| arthord.NanoSatanMelee Beta | 5.5 | 9.0% | 5 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 9 |
| fm.claire 1.7 | 6.5 | 8.5% | 2 |
| sample.SpinBot 1.0 | 8.3 | 6.6% | 1 |
| kurios.DOSexe .9b | 9.0 | 5.7% | 2 |
| pa.Improved 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.4 | 20 / 35 | 5335 |
| 2 | 1 | 69.6 | 88.6 | 22 / 35 | 5857 |
| 3 | 1 | 70.2 | 91.4 | 24 / 35 | 5738 |
| 4 | 1 | 65.8 | 81.3 | 16 / 35 | 4632 |
| 5 | 1 | 68.7 | 83.2 | 24 / 35 | 5563 |
| 6 | 1 | 67.2 | 81.9 | 19 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 85% |
| oog.melee.CapuletDroid 1.1 | 38 | 97% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| gh.nano.Grofvuil 0.2 | 15 | 80% |
| sample.SpinBot 1.0 | 8 | 88% |
| winamp32.micro.MicroMacro 1.0 | 6 | 83% |
| fm.claire 1.7 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 67% |

Hadur died in 86 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 31% | 67 |
| gh.nano.Grofvuil 0.2 | 16 | 19% | 33 |
| fm.claire 1.7 | 9 | 10% | 14 |
| kurios.DOSexe .9b | 9 | 10% | 12 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 44 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 17 |
| sample.SpinBot 1.0 | 6 | 7% | 8 |
| winamp32.micro.MicroMacro 1.0 | 4 | 5% | 11 |
| pa.Improved 1.0 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 83.8 | 104 / 210 | 2.46 | 18.3% | 34125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.3% | 104 |
| gh.micro.Gruweltje 0.7 | 2.0 | 15.0% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 13.4% | 28 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 22 |
| DBall.Anarchy 0.1 | 5.2 | 8.7% | 10 |
| caimano.Furia_Ceca 0.22 | 6.7 | 7.7% | 2 |
| acogdev.alpha 0.2 | 7.2 | 6.7% | 4 |
| el.JumpShoot 0.2 | 7.7 | 6.5% | 0 |
| fire219.CatBot 1.0 | 8.8 | 5.6% | 0 |
| mbro.Detektor3 0.1.1 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 83.2 | 18 / 35 | 5846 |
| 2 | 1 | 66.9 | 82.2 | 13 / 35 | 5570 |
| 3 | 1 | 69.5 | 88.3 | 22 / 35 | 5856 |
| 4 | 1 | 65.8 | 77.8 | 13 / 35 | 5451 |
| 5 | 1 | 69.6 | 89.5 | 21 / 35 | 6004 |
| 6 | 1 | 66.7 | 81.9 | 17 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 54 | 85% |
| gh.micro.Gruweltje 0.7 | 38 | 50% |
| mz.MicroGodMelee 1 | 26 | 77% |
| DBall.Anarchy 0.1 | 11 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| acogdev.alpha 0.2 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 36 | 34% | 63 |
| spinnercat.micro.Tyger 0.1 | 27 | 25% | 64 |
| mz.MicroGodMelee 1 | 23 | 22% | 49 |
| acogdev.alpha 0.2 | 8 | 8% | 12 |
| caimano.Furia_Ceca 0.22 | 7 | 7% | 9 |
| el.JumpShoot 0.2 | 3 | 3% | 3 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 7 |

## Melee bench: F08

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 75.0 | 98 / 210 | 3.25 | 16.6% | 30735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.3 | 16.6% | 98 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.8% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 14.0% | 34 |
| germ.TheMind .2 | 4.3 | 10.0% | 9 |
| qualidafial.MajorDick 1.0.1 | 5.8 | 8.8% | 1 |
| awesomeness.Elite 1.0 | 5.8 | 8.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.1% | 2 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.2% | 9 |
| sample.Crazy 1.0 | 8.3 | 6.6% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.9 | 21 / 35 | 5295 |
| 2 | 2 | 64.2 | 70.2 | 15 / 35 | 5309 |
| 3 | 2 | 65.7 | 74.3 | 15 / 35 | 5326 |
| 4 | 1 | 63.3 | 71.4 | 14 / 35 | 4778 |
| 5 | 1 | 66.2 | 78.7 | 19 / 35 | 5019 |
| 6 | 1 | 64.2 | 72.4 | 14 / 35 | 5008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 83% |
| germ.TheMind .2 | 12 | 75% |
| awesomeness.Elite 1.0 | 7 | 86% |
| stelo.UntouchableNano 1.3 | 7 | 43% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 503. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 42 | 37% | 83 |
| simonton.nano.WeekendObsession_Melee 1.0 | 25 | 22% | 45 |
| germ.TheMind .2 | 19 | 17% | 33 |
| stelo.UntouchableNano 1.3 | 13 | 12% | 18 |
| awesomeness.Elite 1.0 | 8 | 7% | 14 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 5 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 5 |
| mym.EdgeStalker 1.0 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 84.8 | 132 / 210 | 2.37 | 19.1% | 30794 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 19.1% | 132 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 25 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 8 |
| maribo.IotaCT 1.1 | 4.3 | 10.8% | 15 |
| timmit.nano.TimDog 0.33 | 5.5 | 9.8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.3% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 8.1% | 6 |
| stelo.PatternRobot 1.0 | 7.8 | 8.0% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 79.4 | 18 / 35 | 5089 |
| 2 | 1 | 70.0 | 87.3 | 25 / 35 | 5178 |
| 3 | 1 | 69.6 | 86.7 | 23 / 35 | 4943 |
| 4 | 1 | 71.3 | 91.4 | 26 / 35 | 5595 |
| 5 | 1 | 69.7 | 87.6 | 24 / 35 | 5079 |
| 6 | 1 | 66.1 | 76.2 | 16 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 60 | 87% |
| nz.jdc.nano.GridFu 1.0 | 38 | 100% |
| stelo.PatternRobot 1.0 | 17 | 88% |
| timmit.nano.TimDog 0.33 | 13 | 62% |
| maribo.IotaCT 1.1 | 6 | 83% |
| spinnercat.Omen 1.0 | 5 | 100% |
| ratosh.Wesco 1.4 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 20 | 26% | 64 |
| timmit.nano.TimDog 0.33 | 19 | 24% | 27 |
| stelo.PatternRobot 1.0 | 13 | 17% | 26 |
| ratosh.Wesco 1.4 | 11 | 14% | 23 |
| nz.jdc.nano.GridFu 1.0 | 6 | 8% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 6 |
| maribo.IotaCT 1.1 | 3 | 4% | 12 |
| spinnercat.Omen 1.0 | 2 | 3% | 6 |

## Melee bench: F10

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.0 | 163 / 210 | 1.81 | 21.3% | 39896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 21.3% | 163 |
| tvv.nano.Polaris 1.2 | 2.5 | 11.8% | 12 |
| baal.nano.N 1.42 | 2.8 | 11.1% | 6 |
| Grystrion.TrackerWO 1.0 | 4.5 | 9.8% | 5 |
| squidM.TentalceMeleeNano 1.1 | 5.7 | 8.9% | 1 |
| sanja.First 0.1 | 6.2 | 8.4% | 1 |
| zyx.micro.Ant 1.1 | 7.0 | 8.8% | 8 |
| cvt.Firsty 1.0 | 7.0 | 8.1% | 11 |
| amk.Punbot.Punbot 0.01 | 8.3 | 7.4% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.6 | 24 / 35 | 6198 |
| 2 | 1 | 73.2 | 97.5 | 32 / 35 | 7290 |
| 3 | 1 | 70.8 | 87.6 | 24 / 35 | 6938 |
| 4 | 1 | 71.9 | 94.6 | 27 / 35 | 6849 |
| 5 | 1 | 71.2 | 89.5 | 29 / 35 | 6710 |
| 6 | 1 | 69.6 | 88.3 | 27 / 35 | 5911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 38 | 97% |
| cvt.Firsty 1.0 | 28 | 86% |
| baal.nano.N 1.42 | 28 | 89% |
| sanja.First 0.1 | 20 | 100% |
| zyx.micro.Ant 1.1 | 17 | 88% |
| Grystrion.TrackerWO 1.0 | 16 | 94% |
| amk.Punbot.Punbot 0.01 | 16 | 100% |
| squidM.TentalceMeleeNano 1.1 | 10 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 14 | 29% | 35 |
| baal.nano.N 1.42 | 10 | 21% | 34 |
| cvt.Firsty 1.0 | 10 | 21% | 33 |
| Grystrion.TrackerWO 1.0 | 7 | 15% | 18 |
| tvv.nano.Polaris 1.2 | 3 | 6% | 56 |
| sample.RamFire 1.0 | 3 | 6% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 2% | 2 |
| sanja.First 0.1 | 0 | 0% | 18 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 7 |

## Melee bench: F11

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 68.8 | 83 / 210 | 3.81 | 15.3% | 29763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.7% | 70 |
| hadur117.micro.SaorWFR 0.1 | 1.7 | 15.3% | 83 |
| cs.Wren 1.0 | 2.8 | 12.6% | 19 |
| js.PinBall 1.6 | 4.2 | 11.2% | 14 |
| mz.Cork 0.1 | 5.0 | 10.4% | 10 |
| joe.ADinosaur 1.0 | 5.8 | 9.7% | 8 |
| evd.X1 0.01 | 7.0 | 8.2% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 5 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 0 |
| PSW.Relentless 0.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 65.1 | 11 / 35 | 4634 |
| 2 | 2 | 65.9 | 75.9 | 15 / 35 | 5192 |
| 3 | 2 | 62.2 | 64.8 | 13 / 35 | 5024 |
| 4 | 1 | 63.4 | 70.5 | 16 / 35 | 4783 |
| 5 | 2 | 60.8 | 63.8 | 10 / 35 | 4971 |
| 6 | 1 | 64.4 | 72.7 | 18 / 35 | 5159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 55 | 73% |
| cs.Wren 1.0 | 19 | 89% |
| mz.Cork 0.1 | 14 | 86% |
| js.PinBall 1.6 | 5 | 80% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 50% |
| donjezza.Jezza 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 49 | 39% | 98 |
| joe.ADinosaur 1.0 | 18 | 14% | 19 |
| evd.X1 0.01 | 16 | 13% | 16 |
| cs.Wren 1.0 | 14 | 11% | 27 |
| mz.Cork 0.1 | 14 | 11% | 25 |
| js.PinBall 1.6 | 7 | 6% | 11 |
| jsal.Jsalbot 1.0 | 5 | 4% | 9 |
| PSW.Relentless 0.1 | 4 | 3% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.2 | 133 / 210 | 2.42 | 18.9% | 30253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 18.9% | 133 |
| myl.nano.Graviton 1.10 | 2.5 | 11.8% | 22 |
| ntc.Opposite 1.5 | 3.2 | 11.5% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.2% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 10.2% | 6 |
| disan.Chair 2.2.0 | 7.3 | 8.0% | 8 |
| DBall.NUKE 0.1 | 7.8 | 7.6% | 4 |
| donjezza.Muncho 1.0 | 9.0 | 6.2% | 8 |
| pbg.R2D2 1.0 | 9.7 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.4 | 23 / 35 | 5036 |
| 2 | 1 | 67.6 | 82.9 | 19 / 35 | 5144 |
| 3 | 1 | 67.8 | 83.8 | 23 / 35 | 4935 |
| 4 | 1 | 67.5 | 80.6 | 21 / 35 | 5131 |
| 5 | 1 | 69.1 | 87.9 | 24 / 35 | 5014 |
| 6 | 1 | 68.4 | 84.8 | 23 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 88% |
| myl.nano.Graviton 1.10 | 36 | 94% |
| ntc.Opposite 1.5 | 17 | 82% |
| donjezza.Muncho 1.0 | 16 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| DBall.NUKE 0.1 | 9 | 89% |
| disan.Chair 2.2.0 | 9 | 56% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 16 | 21% | 42 |
| pfvicm.Sobieski 7.2.3b | 16 | 21% | 27 |
| ntc.Opposite 1.5 | 14 | 18% | 22 |
| myl.nano.Graviton 1.10 | 10 | 13% | 45 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 13% | 24 |
| disan.Chair 2.2.0 | 6 | 8% | 12 |
| pbg.R2D2 1.0 | 4 | 5% | 9 |
| DBall.NUKE 0.1 | 2 | 3% | 16 |
| donjezza.Muncho 1.0 | 0 | 0% | 13 |

## Melee bench: F13

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 66.7 | 73 / 210 | 4.00 | 14.6% | 26355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 2.2 | 14.6% | 73 |
| oog.melee.Capulet 1.2 | 2.5 | 14.3% | 45 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.0% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.0% | 30 |
| yagami.Tidus 0.11 | 4.7 | 11.9% | 15 |
| ejb.Polaris 1.0.1 | 6.0 | 10.0% | 5 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.2% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.1 | 17 / 35 | 4699 |
| 2 | 1 | 63.9 | 70.2 | 14 / 35 | 4719 |
| 3 | 4 | 58.9 | 56.5 | 10 / 35 | 4020 |
| 4 | 2 | 62.6 | 67.6 | 13 / 35 | 4294 |
| 5 | 4 | 59.6 | 58.7 | 8 / 35 | 4168 |
| 6 | 1 | 63.4 | 69.2 | 11 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 91% |
| oog.melee.Capulet 1.2 | 27 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 75% |
| yagami.Tidus 0.11 | 15 | 87% |
| ejb.Polaris 1.0.1 | 3 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 62 | 45% | 78 |
| yagami.Tidus 0.11 | 25 | 18% | 34 |
| kawigi.micro.Shiz 1.1 | 16 | 12% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 9% | 32 |
| ejb.Polaris 1.0.1 | 10 | 7% | 15 |
| kurios.DOSexe .9a | 4 | 3% | 5 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 4 |

## Melee bench: F14

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 80.4 | 131 / 210 | 2.76 | 17.6% | 27225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 17.6% | 131 |
| wee.Gem 1.8.4 | 2.5 | 12.3% | 27 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 18 |
| ratosh.Nobo 0.21 | 4.0 | 11.4% | 8 |
| wompi.Quokka 1.6 | 4.5 | 11.1% | 16 |
| m3thos.Eva00 1.1 | 6.3 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 6.7 | 8.8% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.0 | 7.1% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.4 | 22 / 35 | 4220 |
| 2 | 1 | 65.2 | 76.5 | 18 / 35 | 4572 |
| 3 | 1 | 66.7 | 80.3 | 24 / 35 | 4601 |
| 4 | 1 | 67.1 | 82.9 | 23 / 35 | 4692 |
| 5 | 1 | 68.2 | 84.1 | 25 / 35 | 5008 |
| 6 | 1 | 65.7 | 80.3 | 19 / 35 | 4132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| wee.Gem 1.8.4 | 36 | 89% |
| wompi.Quokka 1.6 | 22 | 100% |
| m3thos.Eva00 1.1 | 11 | 91% |
| ratosh.Nobo 0.21 | 9 | 89% |
| bayen.UbaMicro 1.4 | 6 | 67% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 15 | 19% | 60 |
| wee.Gem 1.8.4 | 12 | 15% | 50 |
| ratosh.Nobo 0.21 | 11 | 14% | 21 |
| stelo.MyAgileRobot 0.2 | 9 | 11% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 10% | 13 |
| maribo.FollowFire 1 | 8 | 10% | 6 |
| wompi.Quokka 1.6 | 6 | 8% | 19 |
| bayen.UbaMicro 1.4 | 6 | 8% | 10 |
| m3thos.Eva00 1.1 | 4 | 5% | 15 |

## Melee bench: F15

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 86.7 | 129 / 210 | 2.20 | 20.6% | 44054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.2 | 20.6% | 129 |
| wompi.Wallaby 5.1 | 1.8 | 18.1% | 61 |
| mz.NanoGod 2.02 | 3.0 | 14.5% | 14 |
| ayk.WallHugger 1.0 | 4.5 | 10.0% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 4 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 0 |
| stelo.PianistNano 1.2 | 7.2 | 7.1% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.2 | 3.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 87.6 | 19 / 35 | 7778 |
| 2 | 1 | 71.5 | 86.7 | 23 / 35 | 6826 |
| 3 | 2 | 67.9 | 74.3 | 13 / 35 | 6539 |
| 4 | 1 | 72.9 | 89.8 | 26 / 35 | 7490 |
| 5 | 1 | 73.2 | 90.2 | 23 / 35 | 7926 |
| 6 | 1 | 72.7 | 91.4 | 25 / 35 | 7495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 112 | 78% |
| exauge.GateKeeper 1.1.121g | 13 | 85% |
| ayk.WallHugger 1.0 | 11 | 100% |
| mz.NanoGod 2.02 | 8 | 88% |
| drd.Dreadknoght 0.9 | 4 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 44 | 54% | 142 |
| mz.NanoGod 2.02 | 19 | 23% | 31 |
| ayk.WallHugger 1.0 | 9 | 11% | 16 |
| exauge.GateKeeper 1.1.121g | 6 | 7% | 10 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F16

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 75.8 | 115 / 210 | 3.18 | 17.1% | 29435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 17.1% | 115 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.9% | 30 |
| dummy.micro.Sparrow 2.5 | 2.8 | 12.5% | 17 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 16 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.7 | 10.8% | 23 |
| stelo.MirrorMicro 1.0 | 6.0 | 9.0% | 4 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 2 |
| ap.Frederick 1.1 | 9.0 | 6.1% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.3 | 23 / 35 | 5107 |
| 2 | 1 | 66.5 | 78.7 | 20 / 35 | 4960 |
| 3 | 1 | 63.9 | 71.1 | 17 / 35 | 4616 |
| 4 | 1 | 67.0 | 79.7 | 19 / 35 | 5314 |
| 5 | 1 | 60.2 | 60.6 | 14 / 35 | 4338 |
| 6 | 1 | 68.0 | 84.1 | 22 / 35 | 5100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 85% |
| dummy.micro.Sparrow 2.5 | 32 | 91% |
| davidalves.net.DuelistMicroMelee 1.4 | 27 | 78% |
| bvh.micro.Freya 0.3 | 21 | 90% |
| ap.Frederick 1.1 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 25% | 57 |
| mn.nano.perceptual.Impact 1.3.0 | 17 | 18% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 15% | 37 |
| dummy.micro.Sparrow 2.5 | 12 | 13% | 43 |
| bvh.micro.Freya 0.3 | 8 | 8% | 23 |
| conscience.Electron 1.3g | 8 | 8% | 13 |
| dl.BetterWalls 1.0 | 7 | 7% | 13 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 9 |

## Melee bench: F17

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 91.5 | 158 / 210 | 1.76 | 21.8% | 42989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 21.8% | 158 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 13.0% | 15 |
| sul.Lunar 1.1 | 3.2 | 11.5% | 14 |
| supersample.SuperBoxBot 1.0 | 3.8 | 11.1% | 8 |
| mme.NikeEnhanced 2.0 | 5.2 | 9.0% | 3 |
| dsw.StaticD 1.0 | 5.8 | 8.5% | 5 |
| tlp.ThreeLeggedPig 1 | 7.5 | 7.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.7% | 2 |
| sample.MyFirstRobot 1.0 | 8.8 | 5.7% | 3 |
| sample.Corners 1.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 90.8 | 27 / 35 | 7352 |
| 2 | 1 | 72.2 | 90.8 | 28 / 35 | 6892 |
| 3 | 1 | 71.6 | 89.5 | 25 / 35 | 7269 |
| 4 | 1 | 71.1 | 88.9 | 24 / 35 | 7086 |
| 5 | 1 | 72.7 | 94.0 | 28 / 35 | 7049 |
| 6 | 1 | 72.5 | 95.2 | 26 / 35 | 7341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 49 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 86% |
| supersample.SuperBoxBot 1.0 | 33 | 91% |
| dsw.StaticD 1.0 | 11 | 73% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| sample.Corners 1.0 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 100% |
| mme.NikeEnhanced 2.0 | 7 | 100% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 14 | 27% | 39 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 25% | 47 |
| dsw.StaticD 1.0 | 9 | 17% | 19 |
| mme.NikeEnhanced 2.0 | 7 | 13% | 18 |
| tlp.ThreeLeggedPig 1 | 4 | 8% | 5 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 13 |
| sul.Lunar 1.1 | 1 | 2% | 51 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 2% | 8 |
| sample.Corners 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorWFR 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v310, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 76.9 | 99 / 210 | 3.08 | 17.6% | 37336 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWFR 0.1 | 1.0 | 17.6% | 99 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 32 |
| mld.Wisdom 1.0 | 3.0 | 12.7% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.3 | 11.1% | 19 |
| KiraNL.Chupacabra 0.4 | 4.8 | 10.7% | 15 |
| amz.NanoClone 1.41 | 5.5 | 10.2% | 13 |
| sample.Walls 1.0 | 7.2 | 7.7% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 0 |
| jangs.ns51 1.0 | 9.0 | 6.0% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 70.8 | 9 / 35 | 6424 |
| 2 | 1 | 67.1 | 76.5 | 20 / 35 | 6005 |
| 3 | 1 | 69.8 | 85.4 | 19 / 35 | 6974 |
| 4 | 1 | 65.8 | 74.6 | 14 / 35 | 6096 |
| 5 | 1 | 67.6 | 79.0 | 19 / 35 | 6342 |
| 6 | 1 | 65.6 | 75.2 | 18 / 35 | 5495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 89% |
| radnor.DoctorBob 1.42 | 26 | 81% |
| mld.Wisdom 1.0 | 18 | 61% |
| amz.NanoClone 1.41 | 12 | 58% |
| KiraNL.Chupacabra 0.4 | 9 | 89% |
| sample.Walls 1.0 | 9 | 89% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |
| sample.Target 1.0 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 33 | 30% | 46 |
| KiraNL.Chupacabra 0.4 | 22 | 20% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 15% | 51 |
| radnor.DoctorBob 1.42 | 17 | 15% | 45 |
| amz.NanoClone 1.41 | 12 | 11% | 17 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| jangs.ns51 1.0 | 4 | 4% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 2 |

