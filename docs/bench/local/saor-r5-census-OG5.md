# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 88.3 | 151 / 210 | 2.05 | 21.5% | 42924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.5% | 151 |
| mz.AntiGrav 1.0 | 2.7 | 13.9% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 14.3% | 26 |
| mld.Infinity 2.2 | 3.5 | 13.3% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.4% | 2 |
| sample.Walls 1.0 | 6.3 | 6.6% | 2 |
| GarmBox.Oranges 1.0 | 6.8 | 6.5% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 92.1 | 25 / 35 | 7367 |
| 2 | 1 | 72.8 | 91.1 | 28 / 35 | 7224 |
| 3 | 1 | 71.1 | 82.5 | 23 / 35 | 6699 |
| 4 | 1 | 71.1 | 83.8 | 22 / 35 | 6862 |
| 5 | 1 | 73.7 | 92.4 | 28 / 35 | 7699 |
| 6 | 1 | 72.7 | 87.9 | 25 / 35 | 7073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 68 | 97% |
| radnor.DoctorBob 1.42 | 45 | 80% |
| mld.Infinity 2.2 | 42 | 81% |
| amz.NanoClone 1.41 | 10 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 36% | 79 |
| mz.AntiGrav 1.0 | 14 | 24% | 75 |
| mld.Infinity 2.2 | 14 | 24% | 20 |
| amz.NanoClone 1.41 | 5 | 8% | 11 |
| jangs.ns51 1.0 | 4 | 7% | 11 |
| arthord.MannyPacquiao Beta | 1 | 2% | 4 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| GarmBox.Oranges 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.7 | 157 / 210 | 2.11 | 19.1% | 29750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.1% | 157 |
| oog.melee.Mercutio 1.0 | 2.2 | 15.0% | 37 |
| mld.DustBunny 3.8 | 2.8 | 13.7% | 9 |
| maribo.melee.BMV 0.1 | 4.0 | 11.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 7.8% | 1 |
| zyx.nano.Ant 1.1 | 6.7 | 7.6% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.3% | 3 |
| fullsail.SweetTea 1.1 | 7.5 | 6.7% | 0 |
| bzdp.BoxCar 2.0 | 7.8 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.6 | 29 / 35 | 4894 |
| 2 | 1 | 68.2 | 84.4 | 24 / 35 | 5076 |
| 3 | 1 | 68.9 | 87.3 | 27 / 35 | 4729 |
| 4 | 1 | 67.9 | 84.1 | 22 / 35 | 5010 |
| 5 | 1 | 69.6 | 92.7 | 28 / 35 | 4488 |
| 6 | 1 | 70.2 | 89.8 | 27 / 35 | 5553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 90 | 84% |
| mld.DustBunny 3.8 | 62 | 95% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 4 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 23 | 43% | 102 |
| mld.DustBunny 3.8 | 7 | 13% | 63 |
| zyx.nano.Ant 1.1 | 6 | 11% | 9 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 8% | 12 |
| fullsail.SweetTea 1.1 | 4 | 8% | 7 |
| maribo.melee.BMV 0.1 | 3 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 4% | 5 |
| bzdp.BoxCar 2.0 | 2 | 4% | 2 |
| cs.Grudge 1.0 | 2 | 4% | 1 |

## Melee bench: F03

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 27 over 6 battles (4.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 83.7 | 138 / 210 | 2.47 | 20.1% | 37301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.1% | 138 |
| myl.micro.Troodon 1.10 | 2.2 | 13.8% | 27 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.1% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.2% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.1% | 13 |
| fm.mammillarias 1.3 | 6.0 | 9.4% | 7 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.6% | 1 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.2% | 2 |
| sample.Tracker 1.0 | 9.0 | 4.9% | 0 |
| sample.Fire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 78.4 | 18 / 35 | 5992 |
| 2 | 1 | 72.7 | 94.0 | 29 / 35 | 6764 |
| 3 | 1 | 70.9 | 87.3 | 25 / 35 | 6224 |
| 4 | 1 | 69.1 | 81.3 | 18 / 35 | 6162 |
| 5 | 1 | 71.0 | 84.1 | 26 / 35 | 6166 |
| 6 | 1 | 68.8 | 76.8 | 22 / 35 | 5993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 60 | 95% |
| stelo.SoRobotNanoMelee 1.2 | 31 | 71% |
| cb.nano.Insomnia 1.0 | 29 | 83% |
| myl.nano.KomoriNinja 1.1 | 19 | 100% |
| sp.Nanos.Ember 1.1 | 7 | 100% |
| fm.mammillarias 1.3 | 5 | 60% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.nano.Insomnia 1.0 | 19 | 26% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 24% | 37 |
| myl.micro.Troodon 1.10 | 11 | 15% | 74 |
| myl.nano.KomoriNinja 1.1 | 9 | 13% | 36 |
| fm.mammillarias 1.3 | 6 | 8% | 15 |
| sp.Nanos.Ember 1.1 | 4 | 6% | 13 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 7 |
| sample.Tracker 1.0 | 2 | 3% | 3 |
| sample.Fire 1.0 | 1 | 1% | 5 |

## Melee bench: F04

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 87.7 | 155 / 210 | 2.10 | 20.6% | 38026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.6% | 155 |
| tvv.micro.Antares 1.1.1 | 2.2 | 12.5% | 15 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.3% | 7 |
| tj.zombie1n 1.0.1 | 4.8 | 9.3% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 6.0 | 8.4% | 3 |
| yk.JahMicro 1.0 | 6.2 | 8.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 9.0% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 6.8 | 7.9% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 6.7% | 2 |
| sample.VelociRobot 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.2 | 27 / 35 | 6319 |
| 2 | 1 | 71.1 | 87.9 | 28 / 35 | 6546 |
| 3 | 1 | 67.7 | 80.6 | 21 / 35 | 5425 |
| 4 | 1 | 70.2 | 87.0 | 23 / 35 | 6566 |
| 5 | 1 | 72.5 | 95.2 | 30 / 35 | 6745 |
| 6 | 1 | 70.4 | 86.3 | 26 / 35 | 6425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 94% |
| stelo.SoJNanoMelee 1.1 | 32 | 78% |
| tvv.micro.Antares 1.1.1 | 28 | 89% |
| tj.zombie1n 1.0.1 | 14 | 64% |
| yk.JahMicro 1.0 | 13 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 12 | 100% |
| repositorio.NanoStep 1.0 | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 18 | 33% | 85 |
| stelo.SoJNanoMelee 1.1 | 10 | 18% | 35 |
| tj.zombie1n 1.0.1 | 10 | 18% | 15 |
| tvv.micro.Antares 1.1.1 | 9 | 16% | 32 |
| repositorio.NanoStep 1.0 | 2 | 4% | 11 |
| sample.VelociRobot 1.0 | 2 | 4% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 17 |
| yk.JahMicro 1.0 | 1 | 2% | 8 |

## Melee bench: F05

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.1 | 112 / 210 | 3.42 | 17.0% | 30581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.0% | 112 |
| oog.melee.Corsair 1.0 | 2.0 | 13.3% | 29 |
| ahf.NanoAndrew .4 | 3.5 | 11.5% | 20 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 11.3% | 21 |
| EBBU.Sim2 1.02 | 5.5 | 9.6% | 11 |
| sam.Samspin 1.0 | 5.8 | 9.3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.9% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.8 | 8.4% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.2 | 6.3% | 0 |
| sample.TrackFire 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 76.2 | 21 / 35 | 5090 |
| 2 | 1 | 66.4 | 75.9 | 19 / 35 | 5454 |
| 3 | 1 | 63.6 | 67.3 | 13 / 35 | 5110 |
| 4 | 1 | 65.6 | 73.7 | 20 / 35 | 4824 |
| 5 | 1 | 65.9 | 73.3 | 19 / 35 | 5299 |
| 6 | 1 | 64.9 | 72.1 | 20 / 35 | 4804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Corsair 1.0 | 43 | 95% |
| simonton.nano.MeleeSeed 1.8 | 40 | 83% |
| ahf.NanoAndrew .4 | 21 | 95% |
| robar.nano.Assertive_Melee 0.2 | 10 | 80% |
| sam.Samspin 1.0 | 8 | 88% |
| EBBU.Sim2 1.02 | 5 | 40% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |

Hadur died in 98 of 210 rounds, at a mean tick of 370. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 27 | 28% | 57 |
| robar.nano.Assertive_Melee 0.2 | 22 | 22% | 32 |
| ahf.NanoAndrew .4 | 11 | 11% | 32 |
| oog.melee.Corsair 1.0 | 10 | 10% | 47 |
| EBBU.Sim2 1.02 | 10 | 10% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 7% | 7 |
| zyx.nano.BacillusComma 1.0 | 6 | 6% | 11 |
| sam.Samspin 1.0 | 4 | 4% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 2 |

## Melee bench: F06

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.2 | 151 / 210 | 2.06 | 19.7% | 31454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 19.7% | 151 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.5% | 21 |
| gh.nano.Grofvuil 0.2 | 2.8 | 11.7% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 9.3% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.9% | 7 |
| fm.claire 1.7 | 5.7 | 8.9% | 5 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.0% | 1 |
| pa.Improved 1.0 | 8.8 | 6.1% | 1 |
| kurios.DOSexe .9b | 8.8 | 6.0% | 2 |
| sample.SpinBot 1.0 | 9.2 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 26 / 35 | 4860 |
| 2 | 1 | 70.0 | 87.6 | 25 / 35 | 5654 |
| 3 | 1 | 69.1 | 86.7 | 24 / 35 | 5178 |
| 4 | 1 | 68.6 | 88.3 | 24 / 35 | 4877 |
| 5 | 1 | 69.9 | 89.8 | 24 / 35 | 5709 |
| 6 | 1 | 69.9 | 89.8 | 28 / 35 | 5176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 91% |
| oog.melee.CapuletDroid 1.1 | 26 | 81% |
| gh.nano.Grofvuil 0.2 | 26 | 100% |
| arthord.NanoSatanMelee Beta | 14 | 93% |
| winamp32.micro.MicroMacro 1.0 | 9 | 100% |
| fm.claire 1.7 | 6 | 83% |
| kurios.DOSexe .9b | 5 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 25% | 85 |
| oog.melee.CapuletDroid 1.1 | 13 | 22% | 17 |
| gh.nano.Grofvuil 0.2 | 9 | 15% | 42 |
| fm.claire 1.7 | 8 | 14% | 12 |
| winamp32.micro.MicroMacro 1.0 | 5 | 8% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 7% | 14 |
| sample.SpinBot 1.0 | 4 | 7% | 8 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 8 |

## Melee bench: F07

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 25 over 6 battles (4.2 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.5 | 107 / 210 | 2.66 | 17.9% | 31231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.9% | 107 |
| spinnercat.micro.Tyger 0.1 | 2.0 | 15.7% | 50 |
| gh.micro.Gruweltje 0.7 | 3.0 | 14.5% | 33 |
| mz.MicroGodMelee 1 | 4.0 | 12.6% | 8 |
| caimano.Furia_Ceca 0.22 | 5.5 | 8.2% | 1 |
| DBall.Anarchy 0.1 | 5.5 | 8.4% | 6 |
| el.JumpShoot 0.2 | 7.7 | 6.1% | 2 |
| fire219.CatBot 1.0 | 8.2 | 5.8% | 0 |
| acogdev.alpha 0.2 | 9.0 | 5.4% | 1 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.9 | 16 / 35 | 5190 |
| 2 | 1 | 67.2 | 79.4 | 18 / 35 | 5141 |
| 3 | 1 | 68.3 | 83.8 | 17 / 35 | 5419 |
| 4 | 1 | 69.4 | 88.9 | 20 / 35 | 5505 |
| 5 | 1 | 68.4 | 87.6 | 22 / 35 | 4698 |
| 6 | 1 | 65.5 | 73.7 | 14 / 35 | 5278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 73 | 59% |
| mz.MicroGodMelee 1 | 37 | 97% |
| gh.micro.Gruweltje 0.7 | 30 | 73% |
| el.JumpShoot 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 53 | 51% | 98 |
| gh.micro.Gruweltje 0.7 | 19 | 18% | 46 |
| mz.MicroGodMelee 1 | 7 | 7% | 35 |
| acogdev.alpha 0.2 | 6 | 6% | 8 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 6 |
| fire219.CatBot 1.0 | 5 | 5% | 5 |
| mbro.Detektor3 0.1.1 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 5 |
| DBall.Anarchy 0.1 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 68.0 | 99 / 210 | 3.88 | 15.6% | 28273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.3 | 15.6% | 99 |
| simonton.micro.Sprout 1.1.3 | 1.8 | 15.2% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.2% | 29 |
| qualidafial.MajorDick 1.0.1 | 4.8 | 9.9% | 6 |
| germ.TheMind .2 | 4.8 | 9.7% | 9 |
| awesomeness.Elite 1.0 | 6.2 | 8.8% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.7% | 5 |
| stelo.UntouchableNano 1.3 | 7.3 | 8.0% | 5 |
| sample.Crazy 1.0 | 9.0 | 7.0% | 2 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 68.3 | 17 / 35 | 4195 |
| 2 | 2 | 63.4 | 72.4 | 16 / 35 | 4426 |
| 3 | 2 | 63.9 | 67.0 | 17 / 35 | 4976 |
| 4 | 1 | 64.2 | 69.8 | 13 / 35 | 5158 |
| 5 | 1 | 63.8 | 67.0 | 19 / 35 | 4817 |
| 6 | 1 | 62.6 | 63.8 | 17 / 35 | 4701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 74 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 72% |
| qualidafial.MajorDick 1.0.1 | 9 | 89% |
| germ.TheMind .2 | 8 | 63% |
| awesomeness.Elite 1.0 | 8 | 75% |
| stelo.UntouchableNano 1.3 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 57 | 51% | 111 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 17% | 36 |
| germ.TheMind .2 | 10 | 9% | 17 |
| stelo.UntouchableNano 1.3 | 8 | 7% | 11 |
| qualidafial.MajorDick 1.0.1 | 6 | 5% | 11 |
| awesomeness.Elite 1.0 | 6 | 5% | 9 |
| lrem.micro.MoggFanatic 0.2 | 3 | 3% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.9 | 158 / 210 | 1.91 | 20.4% | 30425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.4% | 158 |
| nz.jdc.nano.GridFu 1.0 | 2.5 | 12.9% | 9 |
| rz.HawkOnFire 0.1 | 2.5 | 13.7% | 13 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 10 |
| timmit.nano.TimDog 0.33 | 5.2 | 9.7% | 9 |
| ratosh.Wesco 1.4 | 6.5 | 8.6% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.8% | 3 |
| stelo.PatternRobot 1.0 | 7.5 | 7.6% | 3 |
| spinnercat.Omen 1.0 | 8.8 | 6.7% | 1 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 92.1 | 27 / 35 | 5528 |
| 2 | 1 | 71.6 | 93.7 | 28 / 35 | 5014 |
| 3 | 1 | 70.6 | 87.6 | 28 / 35 | 4994 |
| 4 | 1 | 69.5 | 83.8 | 25 / 35 | 4719 |
| 5 | 1 | 72.3 | 94.6 | 27 / 35 | 5310 |
| 6 | 1 | 69.5 | 87.6 | 23 / 35 | 4860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 71 | 97% |
| nz.jdc.nano.GridFu 1.0 | 45 | 93% |
| maribo.IotaCT 1.1 | 13 | 92% |
| timmit.nano.TimDog 0.33 | 13 | 92% |
| ratosh.Wesco 1.4 | 13 | 77% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.IotaCT 1.1 | 11 | 21% | 23 |
| rz.HawkOnFire 0.1 | 9 | 17% | 65 |
| timmit.nano.TimDog 0.33 | 8 | 15% | 20 |
| ratosh.Wesco 1.4 | 8 | 15% | 20 |
| nz.jdc.nano.GridFu 1.0 | 6 | 12% | 58 |
| rrh.Iwillfindyou 2.0 | 4 | 8% | 4 |
| stelo.PatternRobot 1.0 | 3 | 6% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 6% | 5 |

## Melee bench: F10

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 88.5 | 164 / 210 | 2.04 | 20.8% | 38056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 20.8% | 164 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.5% | 18 |
| baal.nano.N 1.42 | 3.0 | 11.5% | 7 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.3% | 4 |
| zyx.micro.Ant 1.1 | 5.3 | 9.2% | 5 |
| sanja.First 0.1 | 6.5 | 8.5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 7.2 | 7.7% | 3 |
| cvt.Firsty 1.0 | 7.5 | 7.9% | 6 |
| amk.Punbot.Punbot 0.01 | 7.7 | 7.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 87.6 | 25 / 35 | 6520 |
| 2 | 1 | 71.0 | 88.9 | 28 / 35 | 6511 |
| 3 | 1 | 71.4 | 92.1 | 30 / 35 | 6161 |
| 4 | 1 | 71.8 | 92.7 | 27 / 35 | 6722 |
| 5 | 1 | 69.4 | 85.1 | 27 / 35 | 5801 |
| 6 | 1 | 69.9 | 84.4 | 27 / 35 | 6341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 42 | 88% |
| baal.nano.N 1.42 | 41 | 98% |
| cvt.Firsty 1.0 | 36 | 89% |
| sanja.First 0.1 | 18 | 94% |
| zyx.micro.Ant 1.1 | 17 | 100% |
| amk.Punbot.Punbot 0.01 | 14 | 100% |
| Grystrion.TrackerWO 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 9 | 20% | 59 |
| cvt.Firsty 1.0 | 8 | 17% | 35 |
| zyx.micro.Ant 1.1 | 8 | 17% | 30 |
| sanja.First 0.1 | 5 | 11% | 31 |
| sample.RamFire 1.0 | 5 | 11% | 6 |
| baal.nano.N 1.42 | 4 | 9% | 21 |
| Grystrion.TrackerWO 1.0 | 3 | 7% | 12 |
| amk.Punbot.Punbot 0.01 | 2 | 4% | 5 |
| squidM.TentalceMeleeNano 1.1 | 2 | 4% | 4 |

## Melee bench: F11

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 18 over 6 battles (3.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 65.8 | 71 / 210 | 4.08 | 14.8% | 30244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.3 | 16.0% | 86 |
| hadur117.micro.SaorOG5 0.1 | 1.7 | 14.8% | 71 |
| cs.Wren 1.0 | 3.3 | 12.5% | 20 |
| js.PinBall 1.6 | 4.2 | 11.2% | 12 |
| mz.Cork 0.1 | 4.7 | 10.7% | 10 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 3 |
| evd.X1 0.01 | 6.8 | 8.0% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.9% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 3 |
| PSW.Relentless 0.1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.8 | 58.4 | 10 / 35 | 4326 |
| 2 | 2 | 60.9 | 63.2 | 12 / 35 | 4529 |
| 3 | 1 | 65.2 | 72.4 | 17 / 35 | 5610 |
| 4 | 2 | 62.2 | 66.3 | 10 / 35 | 5271 |
| 5 | 2 | 63.1 | 68.9 | 10 / 35 | 5152 |
| 6 | 1 | 62.4 | 65.7 | 12 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 75 | 53% |
| cs.Wren 1.0 | 13 | 100% |
| mz.Cork 0.1 | 9 | 67% |
| js.PinBall 1.6 | 8 | 88% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 3 | 67% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 74 | 53% | 117 |
| evd.X1 0.01 | 14 | 10% | 14 |
| cs.Wren 1.0 | 10 | 7% | 23 |
| PSW.Relentless 0.1 | 10 | 7% | 10 |
| js.PinBall 1.6 | 9 | 6% | 18 |
| mz.Cork 0.1 | 9 | 6% | 11 |
| joe.ADinosaur 1.0 | 8 | 6% | 8 |
| donjezza.Jezza 1.0 | 3 | 2% | 5 |
| jsal.Jsalbot 1.0 | 3 | 2% | 3 |

## Melee bench: F12

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 13 over 6 battles (2.2 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.7 | 118 / 210 | 2.82 | 17.8% | 27557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 17.8% | 118 |
| ntc.Opposite 1.5 | 2.5 | 11.5% | 16 |
| myl.nano.Graviton 1.10 | 3.5 | 11.8% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.8% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.5% | 26 |
| pfvicm.Sobieski 7.2.3b | 5.3 | 10.3% | 4 |
| disan.Chair 2.2.0 | 7.3 | 8.4% | 8 |
| DBall.NUKE 0.1 | 7.3 | 7.9% | 5 |
| donjezza.Muncho 1.0 | 9.3 | 5.8% | 7 |
| pbg.R2D2 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 82.2 | 20 / 35 | 5028 |
| 2 | 1 | 68.9 | 87.0 | 24 / 35 | 4931 |
| 3 | 1 | 65.2 | 75.2 | 18 / 35 | 4107 |
| 4 | 1 | 67.0 | 81.0 | 17 / 35 | 4797 |
| 5 | 1 | 66.6 | 82.9 | 22 / 35 | 3883 |
| 6 | 1 | 64.4 | 70.2 | 17 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 33 | 88% |
| stelo.AreaTargetingBot 1.1 | 29 | 52% |
| ntc.Opposite 1.5 | 19 | 58% |
| disan.Chair 2.2.0 | 18 | 89% |
| pfvicm.Sobieski 7.2.3b | 17 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| donjezza.Muncho 1.0 | 9 | 89% |
| DBall.NUKE 0.1 | 9 | 89% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 590. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 22 | 23% | 41 |
| ntc.Opposite 1.5 | 18 | 19% | 27 |
| myl.nano.Graviton 1.10 | 16 | 17% | 46 |
| pfvicm.Sobieski 7.2.3b | 12 | 13% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 25 |
| disan.Chair 2.2.0 | 7 | 7% | 12 |
| DBall.NUKE 0.1 | 4 | 4% | 14 |
| donjezza.Muncho 1.0 | 3 | 3% | 10 |
| pbg.R2D2 1.0 | 3 | 3% | 10 |

## Melee bench: F13

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 76.5 | 109 / 210 | 3.11 | 16.3% | 23390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.2 | 16.3% | 109 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.3% | 38 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 30 |
| yagami.Tidus 0.11 | 4.0 | 12.3% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.1% | 13 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 5 |
| stelo.MirrorNano 1.3 | 7.2 | 7.5% | 0 |
| step.nanoPri 1.0 | 7.8 | 7.1% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 74.0 | 17 / 35 | 3855 |
| 2 | 1 | 66.5 | 79.0 | 20 / 35 | 3712 |
| 3 | 2 | 65.4 | 72.7 | 15 / 35 | 4490 |
| 4 | 1 | 66.1 | 79.0 | 19 / 35 | 3844 |
| 5 | 1 | 67.5 | 84.4 | 22 / 35 | 3985 |
| 6 | 1 | 62.9 | 69.8 | 16 / 35 | 3504 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 45 | 84% |
| oog.melee.Capulet 1.2 | 41 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 94% |
| yagami.Tidus 0.11 | 15 | 73% |
| ejb.Polaris 1.0.1 | 9 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 39 | 39% | 71 |
| kawigi.micro.Shiz 1.1 | 19 | 19% | 43 |
| yagami.Tidus 0.11 | 19 | 19% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 9% | 38 |
| kurios.DOSexe .9a | 6 | 6% | 6 |
| stelo.MirrorNano 1.3 | 5 | 5% | 5 |
| ejb.Polaris 1.0.1 | 3 | 3% | 16 |
| step.nanoPri 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 35 over 6 battles (5.8 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.1 | 146 / 210 | 2.61 | 18.0% | 27091 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.0% | 146 |
| bzdp.Pansy 2.1 | 2.8 | 12.2% | 12 |
| wee.Gem 1.8.4 | 3.2 | 11.9% | 15 |
| wompi.Quokka 1.6 | 4.0 | 10.8% | 11 |
| ratosh.Nobo 0.21 | 4.5 | 10.8% | 10 |
| m3thos.Eva00 1.1 | 5.5 | 9.8% | 12 |
| bayen.UbaMicro 1.4 | 7.0 | 8.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 7.3% | 2 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.9% | 1 |
| maribo.FollowFire 1 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 79.4 | 23 / 35 | 4570 |
| 2 | 1 | 66.7 | 82.2 | 24 / 35 | 4291 |
| 3 | 1 | 68.5 | 86.7 | 26 / 35 | 4657 |
| 4 | 1 | 68.5 | 87.0 | 26 / 35 | 4792 |
| 5 | 1 | 67.4 | 82.5 | 25 / 35 | 4547 |
| 6 | 1 | 64.9 | 74.6 | 22 / 35 | 4234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 98% |
| wee.Gem 1.8.4 | 45 | 93% |
| wompi.Quokka 1.6 | 18 | 100% |
| m3thos.Eva00 1.1 | 14 | 79% |
| ratosh.Nobo 0.21 | 11 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 424. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.MyAgileRobot 0.2 | 12 | 19% | 12 |
| wee.Gem 1.8.4 | 11 | 17% | 52 |
| bzdp.Pansy 2.1 | 10 | 16% | 64 |
| maribo.FollowFire 1 | 10 | 16% | 11 |
| m3thos.Eva00 1.1 | 7 | 11% | 16 |
| wompi.Quokka 1.6 | 4 | 6% | 18 |
| ratosh.Nobo 0.21 | 4 | 6% | 15 |
| bayen.UbaMicro 1.4 | 4 | 6% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 3% | 5 |

## Melee bench: F15

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 83.3 | 63 / 210 | 2.50 | 20.1% | 48687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 20.2% | 131 |
| hadur117.micro.SaorOG5 0.1 | 1.5 | 20.1% | 63 |
| mz.NanoGod 2.02 | 3.0 | 13.8% | 9 |
| stuff.Vlad 0.1 | 5.0 | 9.3% | 1 |
| exauge.GateKeeper 1.1.121g | 5.0 | 9.3% | 5 |
| ayk.WallHugger 1.0 | 5.2 | 9.3% | 0 |
| stelo.PianistNano 1.2 | 6.8 | 7.7% | 1 |
| drd.Dreadknoght 0.9 | 8.0 | 5.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.7% | 0 |
| sample.SittingDuck 1.0 | 9.7 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.7 | 86.3 | 7 / 35 | 8347 |
| 2 | 1 | 72.2 | 86.3 | 10 / 35 | 8139 |
| 3 | 1 | 71.9 | 82.9 | 12 / 35 | 8163 |
| 4 | 2 | 70.6 | 80.6 | 8 / 35 | 7832 |
| 5 | 1 | 71.7 | 82.9 | 14 / 35 | 8322 |
| 6 | 2 | 71.0 | 80.6 | 12 / 35 | 7884 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 137 | 30% |
| mz.NanoGod 2.02 | 10 | 70% |
| exauge.GateKeeper 1.1.121g | 9 | 89% |
| stuff.Vlad 0.1 | 3 | 67% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 109 | 74% | 152 |
| mz.NanoGod 2.02 | 17 | 12% | 28 |
| exauge.GateKeeper 1.1.121g | 7 | 5% | 9 |
| ayk.WallHugger 1.0 | 6 | 4% | 6 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| stuff.Vlad 0.1 | 3 | 2% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 4 |

## Melee bench: F16

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 72.4 | 103 / 210 | 3.49 | 16.1% | 26222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 16.1% | 103 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.6% | 35 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.2% | 21 |
| bvh.micro.Freya 0.3 | 4.0 | 11.4% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.3 | 11.5% | 19 |
| stelo.MirrorMicro 1.0 | 6.2 | 8.9% | 6 |
| conscience.Electron 1.3g | 6.8 | 8.0% | 2 |
| ap.Frederick 1.1 | 8.5 | 6.5% | 8 |
| dl.BetterWalls 1.0 | 9.0 | 6.2% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.3 | 21 / 35 | 4534 |
| 2 | 1 | 59.8 | 61.3 | 11 / 35 | 3952 |
| 3 | 1 | 64.5 | 74.3 | 17 / 35 | 4346 |
| 4 | 1 | 64.8 | 74.6 | 18 / 35 | 4309 |
| 5 | 1 | 65.6 | 76.5 | 20 / 35 | 4553 |
| 6 | 1 | 63.4 | 67.3 | 16 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 66% |
| dummy.micro.Sparrow 2.5 | 33 | 82% |
| davidalves.net.DuelistMicroMelee 1.4 | 21 | 90% |
| bvh.micro.Freya 0.3 | 16 | 100% |
| stelo.MirrorMicro 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 31 | 29% | 62 |
| conscience.Electron 1.3g | 15 | 14% | 18 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 14% | 15 |
| davidalves.net.DuelistMicroMelee 1.4 | 14 | 13% | 46 |
| dummy.micro.Sparrow 2.5 | 13 | 12% | 39 |
| stelo.MirrorMicro 1.0 | 7 | 7% | 9 |
| bvh.micro.Freya 0.3 | 6 | 6% | 12 |
| dl.BetterWalls 1.0 | 5 | 5% | 8 |
| ap.Frederick 1.1 | 1 | 1% | 0 |

## Melee bench: F17

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 37 over 6 battles (6.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 87.1 | 157 / 210 | 2.16 | 21.5% | 42247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 21.5% | 157 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.3% | 22 |
| sul.Lunar 1.1 | 3.7 | 10.7% | 10 |
| supersample.SuperBoxBot 1.0 | 4.3 | 10.6% | 6 |
| mme.NikeEnhanced 2.0 | 4.3 | 9.5% | 3 |
| dsw.StaticD 1.0 | 5.7 | 8.6% | 5 |
| tlp.ThreeLeggedPig 1 | 7.2 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.7% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.2% | 5 |
| sample.Corners 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 84.4 | 25 / 35 | 6729 |
| 2 | 1 | 73.1 | 89.2 | 26 / 35 | 7673 |
| 3 | 1 | 72.7 | 90.8 | 29 / 35 | 7195 |
| 4 | 1 | 70.1 | 82.5 | 26 / 35 | 6301 |
| 5 | 1 | 73.8 | 95.6 | 31 / 35 | 7503 |
| 6 | 1 | 69.5 | 80.3 | 20 / 35 | 6846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 54 | 93% |
| sul.Lunar 1.1 | 33 | 100% |
| supersample.SuperBoxBot 1.0 | 29 | 100% |
| dsw.StaticD 1.0 | 13 | 85% |
| mme.NikeEnhanced 2.0 | 10 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| tlp.ThreeLeggedPig 1 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 8 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 15 | 28% | 62 |
| supersample.SuperBoxBot 1.0 | 15 | 28% | 44 |
| dsw.StaticD 1.0 | 7 | 13% | 19 |
| sul.Lunar 1.1 | 5 | 9% | 39 |
| sample.MyFirstRobot 1.0 | 5 | 9% | 13 |
| sample.Corners 1.0 | 3 | 6% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 4% | 15 |
| tlp.ThreeLeggedPig 1 | 2 | 4% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 10 |

## Melee bench: F18

hadur117.micro.SaorOG5 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 78.0 | 103 / 210 | 2.98 | 18.2% | 38366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorOG5 0.1 | 1.0 | 18.2% | 103 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.5 | 12.1% | 27 |
| mld.Wisdom 1.0 | 4.5 | 11.3% | 11 |
| amz.NanoClone 1.41 | 4.8 | 10.5% | 14 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.5% | 15 |
| sample.Walls 1.0 | 7.3 | 7.3% | 5 |
| GarmBox.Oranges 1.0 | 7.8 | 6.9% | 1 |
| jangs.ns51 1.0 | 8.5 | 6.1% | 3 |
| sample.Target 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 81.3 | 18 / 35 | 7065 |
| 2 | 1 | 69.1 | 80.3 | 19 / 35 | 6732 |
| 3 | 1 | 67.0 | 76.2 | 18 / 35 | 6118 |
| 4 | 1 | 66.7 | 75.9 | 17 / 35 | 5892 |
| 5 | 1 | 67.5 | 78.4 | 16 / 35 | 6290 |
| 6 | 1 | 66.9 | 76.2 | 15 / 35 | 6269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 48 | 83% |
| radnor.DoctorBob 1.42 | 34 | 74% |
| mld.Wisdom 1.0 | 17 | 76% |
| amz.NanoClone 1.41 | 13 | 69% |
| KiraNL.Chupacabra 0.4 | 12 | 58% |
| sample.Walls 1.0 | 4 | 100% |
| jangs.ns51 1.0 | 4 | 75% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 28 | 26% | 44 |
| radnor.DoctorBob 1.42 | 23 | 21% | 46 |
| KiraNL.Chupacabra 0.4 | 18 | 17% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 15% | 60 |
| amz.NanoClone 1.41 | 13 | 12% | 17 |
| sample.Walls 1.0 | 4 | 4% | 8 |
| jangs.ns51 1.0 | 3 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 2% | 3 |

