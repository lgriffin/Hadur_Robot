# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 89.2 | 160 / 210 | 1.97 | 21.1% | 40751 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 21.1% | 160 |
| radnor.DoctorBob 1.42 | 2.8 | 14.3% | 17 |
| mz.AntiGrav 1.0 | 3.0 | 13.2% | 9 |
| mld.Infinity 2.2 | 3.2 | 13.4% | 20 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 1 |
| sample.Walls 1.0 | 6.7 | 7.1% | 1 |
| GarmBox.Oranges 1.0 | 6.8 | 6.4% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 84.8 | 26 / 35 | 6043 |
| 2 | 1 | 72.4 | 90.8 | 27 / 35 | 7132 |
| 3 | 1 | 70.3 | 85.1 | 27 / 35 | 5841 |
| 4 | 1 | 72.0 | 90.5 | 26 / 35 | 7041 |
| 5 | 1 | 72.8 | 90.8 | 26 / 35 | 7238 |
| 6 | 1 | 73.6 | 93.3 | 28 / 35 | 7456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 59 | 98% |
| radnor.DoctorBob 1.42 | 48 | 85% |
| mld.Infinity 2.2 | 45 | 93% |
| amz.NanoClone 1.41 | 7 | 100% |
| sample.Target 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 18 | 36% | 80 |
| mz.AntiGrav 1.0 | 14 | 28% | 73 |
| mld.Infinity 2.2 | 9 | 18% | 17 |
| amz.NanoClone 1.41 | 4 | 8% | 20 |
| jangs.ns51 1.0 | 3 | 6% | 5 |
| sample.Walls 1.0 | 1 | 2% | 7 |
| GarmBox.Oranges 1.0 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |

## Melee bench: F02

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.4 | 136 / 210 | 2.50 | 18.0% | 27499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.3 | 18.0% | 136 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.2% | 34 |
| mld.DustBunny 3.8 | 2.5 | 13.6% | 15 |
| maribo.melee.BMV 0.1 | 4.3 | 10.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 5.0 | 9.7% | 7 |
| zyx.nano.Ant 1.1 | 6.0 | 8.8% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 7 |
| fullsail.SweetTea 1.1 | 8.3 | 6.5% | 5 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.5 | 26 / 35 | 4618 |
| 2 | 1 | 66.9 | 84.8 | 22 / 35 | 4151 |
| 3 | 1 | 69.5 | 92.4 | 25 / 35 | 4987 |
| 4 | 1 | 70.2 | 94.0 | 29 / 35 | 4779 |
| 5 | 1 | 69.6 | 91.4 | 26 / 35 | 4906 |
| 6 | 3 | 56.1 | 47.3 | 8 / 35 | 4058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 72 | 79% |
| mld.DustBunny 3.8 | 50 | 88% |
| djdjdj.NanoSkunk10 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 22 | 30% | 70 |
| mld.DustBunny 3.8 | 19 | 26% | 64 |
| cs.Grudge 1.0 | 10 | 14% | 9 |
| zyx.nano.Ant 1.1 | 7 | 9% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 22 |
| fullsail.SweetTea 1.1 | 3 | 4% | 11 |
| maribo.melee.BMV 0.1 | 3 | 4% | 9 |
| bzdp.BoxCar 2.0 | 3 | 4% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 2 | 3% | 11 |

## Melee bench: F03

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 17 over 6 battles (2.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 87.0 | 156 / 210 | 2.17 | 20.3% | 34855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 20.3% | 156 |
| myl.micro.Troodon 1.10 | 2.0 | 13.8% | 30 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.0% | 5 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 10.4% | 8 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.7% | 4 |
| fm.mammillarias 1.3 | 6.0 | 8.8% | 2 |
| cs.sheldor.Talon 1.1 | 6.5 | 8.1% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 6.9% | 4 |
| sample.Fire 1.0 | 9.3 | 5.1% | 0 |
| sample.Tracker 1.0 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.1 | 25 / 35 | 5772 |
| 2 | 1 | 70.7 | 88.6 | 28 / 35 | 5838 |
| 3 | 1 | 70.5 | 86.3 | 25 / 35 | 5792 |
| 4 | 1 | 70.5 | 86.7 | 28 / 35 | 5889 |
| 5 | 1 | 68.3 | 80.0 | 22 / 35 | 5700 |
| 6 | 1 | 72.2 | 95.2 | 28 / 35 | 5864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 48 | 96% |
| myl.micro.Troodon 1.10 | 43 | 91% |
| cb.nano.Insomnia 1.0 | 26 | 100% |
| myl.nano.KomoriNinja 1.1 | 23 | 96% |
| sp.Nanos.Ember 1.1 | 12 | 83% |
| sample.Fire 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |
| fm.mammillarias 1.3 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 13 | 24% | 63 |
| myl.nano.KomoriNinja 1.1 | 9 | 17% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 15% | 38 |
| cb.nano.Insomnia 1.0 | 8 | 15% | 10 |
| fm.mammillarias 1.3 | 7 | 13% | 12 |
| sp.Nanos.Ember 1.1 | 4 | 7% | 17 |
| cs.sheldor.Talon 1.1 | 2 | 4% | 14 |
| sample.Fire 1.0 | 2 | 4% | 8 |
| sample.Tracker 1.0 | 1 | 2% | 1 |

## Melee bench: F04

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 86.8 | 151 / 210 | 2.19 | 20.2% | 36976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 20.2% | 151 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.7% | 19 |
| tvv.micro.Antares 1.1.1 | 3.0 | 12.1% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.2 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 5.5 | 9.0% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 6.7 | 8.0% | 6 |
| yk.JahMicro 1.0 | 6.8 | 8.4% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.2 | 23 / 35 | 5716 |
| 2 | 1 | 70.8 | 87.6 | 25 / 35 | 6708 |
| 3 | 1 | 68.2 | 80.3 | 21 / 35 | 5852 |
| 4 | 1 | 70.1 | 87.6 | 26 / 35 | 5861 |
| 5 | 1 | 70.0 | 86.7 | 26 / 35 | 6029 |
| 6 | 1 | 72.6 | 95.6 | 30 / 35 | 6810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 58 | 88% |
| stelo.SoJNanoMelee 1.1 | 35 | 94% |
| tj.zombie1n 1.0.1 | 21 | 71% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 17 | 100% |
| yk.JahMicro 1.0 | 10 | 80% |
| sample.VelociRobot 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 25 | 42% | 86 |
| stelo.SoJNanoMelee 1.1 | 10 | 17% | 33 |
| tj.zombie1n 1.0.1 | 6 | 10% | 10 |
| yk.JahMicro 1.0 | 5 | 8% | 11 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 27 |
| Grystrion.RandomTrackerNOREV 1.0 | 4 | 7% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 5% | 24 |
| sample.VelociRobot 1.0 | 1 | 2% | 6 |
| repositorio.NanoStep 1.0 | 1 | 2% | 5 |

## Melee bench: F05

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 66.5 | 96 / 210 | 4.01 | 14.9% | 26004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.2 | 14.9% | 96 |
| oog.melee.Corsair 1.0 | 2.3 | 12.7% | 35 |
| ahf.NanoAndrew .4 | 3.2 | 11.6% | 27 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 11.3% | 20 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 9 |
| EBBU.Sim2 1.02 | 5.7 | 9.8% | 10 |
| zyx.nano.BacillusComma 1.0 | 6.7 | 9.3% | 9 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.6% | 0 |
| sample.TrackFire 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 67.9 | 18 / 35 | 4321 |
| 2 | 2 | 59.6 | 59.7 | 11 / 35 | 4335 |
| 3 | 1 | 64.8 | 75.6 | 19 / 35 | 4730 |
| 4 | 1 | 62.4 | 68.3 | 16 / 35 | 4345 |
| 5 | 1 | 62.2 | 68.6 | 18 / 35 | 4082 |
| 6 | 1 | 59.2 | 59.0 | 14 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 32 | 97% |
| oog.melee.Corsair 1.0 | 30 | 67% |
| ahf.NanoAndrew .4 | 17 | 88% |
| sam.Samspin 1.0 | 12 | 83% |
| EBBU.Sim2 1.02 | 10 | 100% |
| sample.TrackFire 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |

Hadur died in 115 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 23 | 20% | 45 |
| robar.nano.Assertive_Melee 0.2 | 18 | 16% | 25 |
| zyx.nano.BacillusComma 1.0 | 17 | 15% | 21 |
| oog.melee.Corsair 1.0 | 16 | 14% | 41 |
| ahf.NanoAndrew .4 | 13 | 11% | 34 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 10% | 10 |
| EBBU.Sim2 1.02 | 9 | 8% | 18 |
| sam.Samspin 1.0 | 4 | 3% | 7 |
| sample.TrackFire 1.0 | 3 | 3% | 8 |

## Melee bench: F06

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.8 | 156 / 210 | 2.28 | 19.1% | 29906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 19.1% | 156 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 14 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.2% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 10.0% | 14 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 3 |
| arthord.NanoSatanMelee Beta | 6.2 | 8.4% | 3 |
| fm.claire 1.7 | 6.7 | 8.2% | 2 |
| sample.SpinBot 1.0 | 7.2 | 7.6% | 5 |
| kurios.DOSexe .9b | 9.5 | 6.1% | 1 |
| pa.Improved 1.0 | 9.5 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 25 / 35 | 4963 |
| 2 | 1 | 69.4 | 92.1 | 28 / 35 | 4556 |
| 3 | 1 | 68.4 | 85.1 | 25 / 35 | 4878 |
| 4 | 1 | 67.0 | 80.6 | 24 / 35 | 4911 |
| 5 | 1 | 68.7 | 84.8 | 25 / 35 | 5202 |
| 6 | 1 | 70.0 | 89.2 | 29 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 96% |
| oog.melee.CapuletDroid 1.1 | 41 | 83% |
| gh.nano.Grofvuil 0.2 | 23 | 87% |
| arthord.NanoSatanMelee Beta | 15 | 100% |
| sample.SpinBot 1.0 | 10 | 100% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 13 | 23% | 24 |
| gh.nano.Grofvuil 0.2 | 11 | 20% | 46 |
| arthord.NanoSatanMelee Beta | 7 | 13% | 16 |
| d414.nano.Quantum 1.0.0 | 6 | 11% | 64 |
| fm.claire 1.7 | 5 | 9% | 7 |
| kurios.DOSexe .9b | 4 | 7% | 23 |
| winamp32.micro.MicroMacro 1.0 | 3 | 5% | 15 |
| sample.SpinBot 1.0 | 3 | 5% | 7 |
| pa.Improved 1.0 | 3 | 5% | 5 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.2 | 106 / 210 | 2.78 | 17.8% | 32232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 17.8% | 106 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.5% | 37 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.2% | 20 |
| mz.MicroGodMelee 1 | 3.7 | 12.9% | 33 |
| DBall.Anarchy 0.1 | 5.0 | 9.3% | 9 |
| caimano.Furia_Ceca 0.22 | 6.2 | 7.8% | 1 |
| el.JumpShoot 0.2 | 8.2 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.2 | 6.5% | 0 |
| mbro.Detektor3 0.1.1 | 8.5 | 6.2% | 2 |
| fire219.CatBot 1.0 | 9.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 21 / 35 | 5458 |
| 2 | 1 | 67.8 | 86.3 | 17 / 35 | 5389 |
| 3 | 1 | 65.8 | 76.5 | 16 / 35 | 5313 |
| 4 | 1 | 66.3 | 75.9 | 18 / 35 | 5258 |
| 5 | 1 | 64.2 | 69.2 | 13 / 35 | 5436 |
| 6 | 1 | 68.6 | 85.1 | 21 / 35 | 5378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 91% |
| mz.MicroGodMelee 1 | 42 | 57% |
| gh.micro.Gruweltje 0.7 | 27 | 30% |
| DBall.Anarchy 0.1 | 18 | 100% |
| mbro.Detektor3 0.1.1 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 67% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |

Hadur died in 104 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.micro.Gruweltje 0.7 | 35 | 34% | 53 |
| mz.MicroGodMelee 1 | 29 | 28% | 59 |
| spinnercat.micro.Tyger 0.1 | 16 | 15% | 53 |
| acogdev.alpha 0.2 | 7 | 7% | 8 |
| DBall.Anarchy 0.1 | 4 | 4% | 17 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 9 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 5 |
| el.JumpShoot 0.2 | 3 | 3% | 4 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.2 | 124 / 210 | 3.41 | 16.9% | 30754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.2 | 16.9% | 124 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 15.0% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.7 | 13.9% | 30 |
| germ.TheMind .2 | 5.0 | 9.5% | 7 |
| qualidafial.MajorDick 1.0.1 | 5.0 | 9.2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 5.8 | 8.9% | 2 |
| awesomeness.Elite 1.0 | 7.2 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 7.3 | 7.7% | 8 |
| sample.Crazy 1.0 | 8.7 | 6.6% | 3 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 18 / 35 | 5317 |
| 2 | 1 | 63.7 | 67.6 | 20 / 35 | 4752 |
| 3 | 1 | 68.0 | 79.0 | 24 / 35 | 5598 |
| 4 | 2 | 63.5 | 66.3 | 18 / 35 | 4966 |
| 5 | 1 | 63.5 | 67.3 | 21 / 35 | 4854 |
| 6 | 1 | 68.1 | 81.9 | 23 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 87% |
| germ.TheMind .2 | 10 | 90% |
| awesomeness.Elite 1.0 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 406. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 43 | 49% | 106 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 21% | 48 |
| qualidafial.MajorDick 1.0.1 | 8 | 9% | 10 |
| stelo.UntouchableNano 1.3 | 5 | 6% | 9 |
| germ.TheMind .2 | 4 | 5% | 11 |
| awesomeness.Elite 1.0 | 4 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 9 |
| mym.EdgeStalker 1.0 | 2 | 2% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 14 over 6 battles (2.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.3 | 149 / 210 | 2.32 | 18.8% | 27084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 18.8% | 149 |
| rz.HawkOnFire 0.1 | 2.0 | 13.6% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.1% | 10 |
| maribo.IotaCT 1.1 | 4.3 | 10.9% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.7% | 1 |
| timmit.nano.TimDog 0.33 | 5.7 | 9.4% | 7 |
| ratosh.Wesco 1.4 | 7.3 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 8.3% | 2 |
| stelo.PatternRobot 1.0 | 8.5 | 7.5% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.5 | 26 / 35 | 4784 |
| 2 | 1 | 71.7 | 95.9 | 32 / 35 | 4627 |
| 3 | 1 | 68.2 | 83.2 | 25 / 35 | 4427 |
| 4 | 1 | 68.7 | 85.1 | 23 / 35 | 4679 |
| 5 | 1 | 66.7 | 78.7 | 22 / 35 | 4302 |
| 6 | 1 | 66.6 | 79.7 | 21 / 35 | 4265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 65 | 97% |
| nz.jdc.nano.GridFu 1.0 | 42 | 95% |
| maribo.IotaCT 1.1 | 11 | 82% |
| stelo.PatternRobot 1.0 | 10 | 100% |
| timmit.nano.TimDog 0.33 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 100% |
| spinnercat.Omen 1.0 | 6 | 100% |
| ratosh.Wesco 1.4 | 6 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 17 | 27% | 31 |
| nz.jdc.nano.GridFu 1.0 | 15 | 24% | 55 |
| maribo.IotaCT 1.1 | 8 | 13% | 22 |
| rz.HawkOnFire 0.1 | 7 | 11% | 56 |
| ratosh.Wesco 1.4 | 4 | 6% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 11 |
| stelo.PatternRobot 1.0 | 4 | 6% | 10 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.5 | 183 / 210 | 1.67 | 21.3% | 35521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 21.3% | 183 |
| tvv.nano.Polaris 1.2 | 2.3 | 11.7% | 5 |
| baal.nano.N 1.42 | 2.8 | 11.3% | 3 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.5% | 2 |
| zyx.micro.Ant 1.1 | 5.3 | 8.6% | 6 |
| sanja.First 0.1 | 5.5 | 9.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 0 |
| cvt.Firsty 1.0 | 8.3 | 7.7% | 9 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 97.1 | 32 / 35 | 6192 |
| 2 | 1 | 69.5 | 85.7 | 29 / 35 | 5623 |
| 3 | 1 | 71.5 | 93.3 | 32 / 35 | 5861 |
| 4 | 1 | 71.5 | 93.7 | 31 / 35 | 5957 |
| 5 | 1 | 70.7 | 93.0 | 29 / 35 | 5783 |
| 6 | 1 | 71.4 | 92.4 | 30 / 35 | 6105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 47 | 98% |
| baal.nano.N 1.42 | 36 | 100% |
| cvt.Firsty 1.0 | 29 | 93% |
| sanja.First 0.1 | 23 | 100% |
| amk.Punbot.Punbot 0.01 | 19 | 100% |
| Grystrion.TrackerWO 1.0 | 16 | 100% |
| zyx.micro.Ant 1.1 | 13 | 92% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cvt.Firsty 1.0 | 6 | 22% | 28 |
| zyx.micro.Ant 1.1 | 6 | 22% | 23 |
| sanja.First 0.1 | 4 | 15% | 21 |
| tvv.nano.Polaris 1.2 | 3 | 11% | 49 |
| Grystrion.TrackerWO 1.0 | 3 | 11% | 25 |
| sample.RamFire 1.0 | 3 | 11% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 12 |
| amk.Punbot.Punbot 0.01 | 1 | 4% | 6 |
| baal.nano.N 1.42 | 0 | 0% | 33 |

## Melee bench: F11

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 71.5 | 86 / 210 | 3.57 | 15.7% | 28745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 15.8% | 75 |
| hadur117.micro.SaorPD 0.1 | 1.7 | 15.7% | 86 |
| cs.Wren 1.0 | 3.2 | 12.9% | 21 |
| mz.Cork 0.1 | 4.3 | 11.4% | 10 |
| js.PinBall 1.6 | 4.7 | 11.1% | 9 |
| joe.ADinosaur 1.0 | 5.8 | 9.5% | 3 |
| evd.X1 0.01 | 7.2 | 7.8% | 1 |
| jsal.Jsalbot 1.0 | 8.0 | 6.4% | 2 |
| donjezza.Jezza 1.0 | 9.2 | 4.9% | 3 |
| PSW.Relentless 0.1 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 74.0 | 13 / 35 | 4867 |
| 2 | 1 | 67.2 | 80.0 | 20 / 35 | 5282 |
| 3 | 1 | 64.8 | 75.6 | 16 / 35 | 4958 |
| 4 | 2 | 61.6 | 64.1 | 12 / 35 | 4318 |
| 5 | 2 | 61.3 | 65.1 | 13 / 35 | 4453 |
| 6 | 2 | 63.5 | 70.2 | 12 / 35 | 4867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 73 | 52% |
| cs.Wren 1.0 | 29 | 86% |
| mz.Cork 0.1 | 9 | 78% |
| js.PinBall 1.6 | 8 | 100% |
| joe.ADinosaur 1.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| donjezza.Jezza 1.0 | 1 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 64 | 51% | 106 |
| joe.ADinosaur 1.0 | 13 | 10% | 16 |
| evd.X1 0.01 | 12 | 10% | 14 |
| mz.Cork 0.1 | 10 | 8% | 17 |
| cs.Wren 1.0 | 9 | 7% | 24 |
| PSW.Relentless 0.1 | 7 | 6% | 9 |
| js.PinBall 1.6 | 5 | 4% | 13 |
| jsal.Jsalbot 1.0 | 5 | 4% | 8 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.4 | 144 / 210 | 2.31 | 19.0% | 28015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 19.0% | 144 |
| myl.nano.Graviton 1.10 | 2.8 | 11.4% | 10 |
| ntc.Opposite 1.5 | 3.2 | 11.3% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 5.3 | 9.8% | 1 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.5% | 1 |
| disan.Chair 2.2.0 | 6.8 | 8.6% | 8 |
| DBall.NUKE 0.1 | 7.7 | 7.8% | 5 |
| donjezza.Muncho 1.0 | 8.7 | 6.3% | 10 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.2 | 26 / 35 | 4875 |
| 2 | 1 | 68.8 | 89.2 | 23 / 35 | 4734 |
| 3 | 1 | 69.9 | 88.9 | 27 / 35 | 5088 |
| 4 | 1 | 66.7 | 80.0 | 22 / 35 | 4608 |
| 5 | 1 | 68.2 | 85.4 | 24 / 35 | 4463 |
| 6 | 1 | 66.5 | 80.0 | 22 / 35 | 4247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.AreaTargetingBot 1.1 | 42 | 93% |
| myl.nano.Graviton 1.10 | 37 | 97% |
| lrem.micro.SpikeSoldier 0.4 | 17 | 94% |
| disan.Chair 2.2.0 | 16 | 88% |
| ntc.Opposite 1.5 | 14 | 93% |
| pfvicm.Sobieski 7.2.3b | 13 | 100% |
| donjezza.Muncho 1.0 | 11 | 55% |
| DBall.NUKE 0.1 | 5 | 80% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ntc.Opposite 1.5 | 12 | 18% | 26 |
| pfvicm.Sobieski 7.2.3b | 11 | 16% | 19 |
| stelo.AreaTargetingBot 1.1 | 10 | 15% | 40 |
| DBall.NUKE 0.1 | 8 | 12% | 19 |
| donjezza.Muncho 1.0 | 7 | 10% | 12 |
| myl.nano.Graviton 1.10 | 6 | 9% | 40 |
| lrem.micro.SpikeSoldier 0.4 | 6 | 9% | 23 |
| disan.Chair 2.2.0 | 4 | 6% | 20 |
| pbg.R2D2 1.0 | 3 | 4% | 9 |

## Melee bench: F13

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 75.7 | 105 / 210 | 3.19 | 16.3% | 25390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 16.3% | 105 |
| oog.melee.Capulet 1.2 | 3.0 | 13.5% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.1% | 23 |
| kawigi.micro.Shiz 1.1 | 3.3 | 12.9% | 30 |
| yagami.Tidus 0.11 | 4.8 | 11.6% | 7 |
| ejb.Polaris 1.0.1 | 5.7 | 10.7% | 11 |
| stelo.MirrorNano 1.3 | 7.2 | 7.7% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 70.5 | 15 / 35 | 3743 |
| 2 | 1 | 67.5 | 80.6 | 20 / 35 | 4575 |
| 3 | 1 | 64.8 | 74.9 | 17 / 35 | 4037 |
| 4 | 1 | 68.2 | 84.1 | 19 / 35 | 4721 |
| 5 | 1 | 63.5 | 68.9 | 17 / 35 | 3956 |
| 6 | 1 | 64.8 | 74.9 | 17 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| oog.melee.Capulet 1.2 | 28 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 93% |
| yagami.Tidus 0.11 | 20 | 90% |
| ejb.Polaris 1.0.1 | 13 | 62% |

Hadur died in 105 of 210 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 45 | 43% | 72 |
| yagami.Tidus 0.11 | 16 | 15% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 11% | 37 |
| ejb.Polaris 1.0.1 | 11 | 10% | 22 |
| kawigi.micro.Shiz 1.1 | 8 | 8% | 32 |
| step.nanoPri 1.0 | 6 | 6% | 6 |
| stelo.MirrorNano 1.3 | 4 | 4% | 5 |
| kurios.DOSexe .9a | 3 | 3% | 3 |

## Melee bench: F14

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.0 | 133 / 210 | 2.71 | 17.6% | 25777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 17.6% | 133 |
| bzdp.Pansy 2.1 | 2.7 | 12.6% | 20 |
| wee.Gem 1.8.4 | 3.2 | 12.0% | 33 |
| wompi.Quokka 1.6 | 3.5 | 11.6% | 12 |
| ratosh.Nobo 0.21 | 4.7 | 11.0% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 9.2% | 2 |
| bayen.UbaMicro 1.4 | 6.8 | 8.5% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.7% | 2 |
| stelo.MyAgileRobot 0.2 | 8.7 | 6.1% | 0 |
| maribo.FollowFire 1 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.9 | 22 / 35 | 4491 |
| 2 | 1 | 66.4 | 82.2 | 19 / 35 | 4422 |
| 3 | 1 | 66.5 | 80.0 | 22 / 35 | 4514 |
| 4 | 1 | 67.2 | 82.9 | 25 / 35 | 4153 |
| 5 | 1 | 67.7 | 85.4 | 27 / 35 | 4131 |
| 6 | 1 | 63.9 | 73.7 | 18 / 35 | 4066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 84% |
| wee.Gem 1.8.4 | 44 | 86% |
| wompi.Quokka 1.6 | 28 | 93% |
| ratosh.Nobo 0.21 | 15 | 93% |
| m3thos.Eva00 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 12 | 15% | 49 |
| wompi.Quokka 1.6 | 11 | 14% | 27 |
| wee.Gem 1.8.4 | 10 | 13% | 48 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 13% | 12 |
| maribo.FollowFire 1 | 9 | 12% | 10 |
| ratosh.Nobo 0.21 | 7 | 9% | 18 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 13 |
| bayen.UbaMicro 1.4 | 6 | 8% | 17 |
| m3thos.Eva00 1.1 | 6 | 8% | 15 |

## Melee bench: F15

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 82.0 | 69 / 210 | 2.62 | 18.5% | 39934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 19.9% | 119 |
| hadur117.micro.SaorPD 0.1 | 1.8 | 18.5% | 69 |
| mz.NanoGod 2.02 | 3.0 | 14.0% | 13 |
| ayk.WallHugger 1.0 | 4.5 | 9.8% | 2 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.3% | 4 |
| stuff.Vlad 0.1 | 5.8 | 8.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 2 |
| drd.Dreadknoght 0.9 | 8.0 | 6.3% | 1 |
| sample.SittingDuck 1.0 | 9.2 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.5 | 83.5 | 12 / 35 | 6583 |
| 2 | 1 | 70.7 | 87.0 | 17 / 35 | 6975 |
| 3 | 2 | 67.1 | 74.6 | 8 / 35 | 6416 |
| 4 | 2 | 68.8 | 80.0 | 11 / 35 | 6422 |
| 5 | 2 | 70.1 | 84.1 | 12 / 35 | 7035 |
| 6 | 2 | 69.1 | 82.9 | 9 / 35 | 6503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 117 | 34% |
| mz.NanoGod 2.02 | 18 | 78% |
| ayk.WallHugger 1.0 | 7 | 86% |
| drd.Dreadknoght 0.9 | 4 | 75% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 96 | 68% | 139 |
| mz.NanoGod 2.02 | 22 | 15% | 36 |
| ayk.WallHugger 1.0 | 10 | 7% | 14 |
| exauge.GateKeeper 1.1.121g | 8 | 6% | 11 |
| stuff.Vlad 0.1 | 5 | 4% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |

## Melee bench: F16

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.0 | 107 / 210 | 3.43 | 16.4% | 26865 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 16.4% | 107 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 13.7% | 28 |
| dummy.micro.Sparrow 2.5 | 3.2 | 12.0% | 23 |
| bvh.micro.Freya 0.3 | 3.8 | 11.3% | 18 |
| stelo.MirrorMicro 1.0 | 5.3 | 9.4% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.5 | 9.9% | 12 |
| conscience.Electron 1.3g | 7.2 | 8.0% | 1 |
| ap.Frederick 1.1 | 8.3 | 7.0% | 9 |
| dl.BetterWalls 1.0 | 8.7 | 6.8% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 70.5 | 16 / 35 | 4307 |
| 2 | 1 | 64.7 | 73.3 | 21 / 35 | 4460 |
| 3 | 1 | 62.8 | 67.3 | 15 / 35 | 4272 |
| 4 | 1 | 63.6 | 69.5 | 17 / 35 | 4330 |
| 5 | 1 | 66.4 | 80.0 | 19 / 35 | 4894 |
| 6 | 1 | 65.6 | 77.1 | 19 / 35 | 4602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 49 | 82% |
| dummy.micro.Sparrow 2.5 | 31 | 84% |
| bvh.micro.Freya 0.3 | 19 | 79% |
| davidalves.net.DuelistMicroMelee 1.4 | 17 | 88% |
| stelo.MirrorMicro 1.0 | 9 | 89% |
| ap.Frederick 1.1 | 3 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 21 | 20% | 49 |
| dummy.micro.Sparrow 2.5 | 18 | 17% | 37 |
| mn.nano.perceptual.Impact 1.3.0 | 16 | 15% | 18 |
| conscience.Electron 1.3g | 14 | 13% | 16 |
| bvh.micro.Freya 0.3 | 12 | 12% | 29 |
| dl.BetterWalls 1.0 | 11 | 11% | 19 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 6% | 26 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 16 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 88.1 | 160 / 210 | 2.07 | 20.7% | 38441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 20.7% | 160 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 15.0% | 17 |
| sul.Lunar 1.1 | 3.0 | 11.5% | 9 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.5% | 8 |
| mme.NikeEnhanced 2.0 | 5.3 | 9.2% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.6% | 8 |
| tlp.ThreeLeggedPig 1 | 6.8 | 7.1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.8% | 4 |
| sample.Corners 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.9 | 29 / 35 | 6659 |
| 2 | 1 | 71.7 | 90.8 | 27 / 35 | 6624 |
| 3 | 1 | 69.2 | 81.9 | 24 / 35 | 6056 |
| 4 | 1 | 70.9 | 88.9 | 26 / 35 | 6391 |
| 5 | 1 | 69.9 | 83.5 | 26 / 35 | 6046 |
| 6 | 1 | 71.2 | 88.9 | 28 / 35 | 6665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 55 | 95% |
| sul.Lunar 1.1 | 50 | 98% |
| supersample.SuperBoxBot 1.0 | 24 | 92% |
| mme.NikeEnhanced 2.0 | 12 | 92% |
| dsw.StaticD 1.0 | 12 | 83% |
| sample.Corners 1.0 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| tlp.ThreeLeggedPig 1 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 14 | 26% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 21% | 63 |
| dsw.StaticD 1.0 | 11 | 21% | 28 |
| mme.NikeEnhanced 2.0 | 5 | 9% | 12 |
| sul.Lunar 1.1 | 4 | 8% | 61 |
| sample.Corners 1.0 | 2 | 4% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 4% | 3 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorPD 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v300, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 80.8 | 127 / 210 | 2.73 | 18.4% | 36083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorPD 0.1 | 1.0 | 18.4% | 127 |
| radnor.DoctorBob 1.42 | 2.5 | 12.8% | 21 |
| mld.Wisdom 1.0 | 2.8 | 12.5% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 19 |
| KiraNL.Chupacabra 0.4 | 5.0 | 10.4% | 7 |
| amz.NanoClone 1.41 | 5.3 | 9.6% | 8 |
| sample.Walls 1.0 | 6.7 | 8.3% | 7 |
| GarmBox.Oranges 1.0 | 8.2 | 7.4% | 3 |
| jangs.ns51 1.0 | 8.5 | 6.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.4 | 20 / 35 | 5396 |
| 2 | 1 | 66.3 | 75.2 | 20 / 35 | 5845 |
| 3 | 1 | 68.7 | 83.2 | 23 / 35 | 6408 |
| 4 | 1 | 68.6 | 82.9 | 21 / 35 | 6331 |
| 5 | 1 | 67.0 | 79.0 | 20 / 35 | 5751 |
| 6 | 1 | 69.3 | 86.0 | 23 / 35 | 6352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 96% |
| radnor.DoctorBob 1.42 | 28 | 89% |
| mld.Wisdom 1.0 | 25 | 88% |
| KiraNL.Chupacabra 0.4 | 12 | 92% |
| amz.NanoClone 1.41 | 9 | 56% |
| jangs.ns51 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| sample.Target 1.0 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 33% | 45 |
| KiraNL.Chupacabra 0.4 | 17 | 20% | 27 |
| amz.NanoClone 1.41 | 13 | 15% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 12% | 61 |
| radnor.DoctorBob 1.42 | 9 | 11% | 39 |
| GarmBox.Oranges 1.0 | 3 | 4% | 4 |
| sample.Walls 1.0 | 2 | 2% | 10 |
| jangs.ns51 1.0 | 2 | 2% | 5 |

