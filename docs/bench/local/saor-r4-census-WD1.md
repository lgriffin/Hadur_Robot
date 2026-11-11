# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 43 over 6 battles (7.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 91.6 | 159 / 210 | 1.76 | 22.2% | 43871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 22.2% | 159 |
| mz.AntiGrav 1.0 | 2.5 | 14.3% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 14.2% | 18 |
| mld.Infinity 2.2 | 3.7 | 12.7% | 18 |
| amz.NanoClone 1.41 | 5.0 | 10.5% | 2 |
| sample.Walls 1.0 | 6.5 | 6.5% | 0 |
| GarmBox.Oranges 1.0 | 6.8 | 6.2% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.6% | 1 |
| arthord.MannyPacquiao Beta | 9.2 | 4.1% | 0 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.3 | 94.3 | 28 / 35 | 6699 |
| 2 | 1 | 74.0 | 93.7 | 27 / 35 | 7825 |
| 3 | 1 | 73.0 | 90.8 | 25 / 35 | 7143 |
| 4 | 1 | 72.9 | 88.3 | 26 / 35 | 7536 |
| 5 | 1 | 74.9 | 95.9 | 30 / 35 | 7884 |
| 6 | 1 | 71.6 | 86.7 | 23 / 35 | 6784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 63 | 97% |
| mld.Infinity 2.2 | 45 | 87% |
| radnor.DoctorBob 1.42 | 44 | 89% |
| amz.NanoClone 1.41 | 15 | 93% |
| sample.Walls 1.0 | 3 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 51 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 41% | 72 |
| mz.AntiGrav 1.0 | 14 | 27% | 85 |
| mld.Infinity 2.2 | 8 | 16% | 13 |
| amz.NanoClone 1.41 | 4 | 8% | 18 |
| jangs.ns51 1.0 | 4 | 8% | 6 |
| GarmBox.Oranges 1.0 | 0 | 0% | 4 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

## Melee bench: F02

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 151 / 210 | 2.14 | 19.5% | 32144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.5% | 151 |
| oog.melee.Mercutio 1.0 | 2.2 | 14.7% | 38 |
| mld.DustBunny 3.8 | 2.8 | 13.0% | 12 |
| maribo.melee.BMV 0.1 | 4.0 | 10.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 8.2% | 2 |
| zyx.nano.Ant 1.1 | 6.3 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 7.6% | 6 |
| fullsail.SweetTea 1.1 | 8.0 | 6.1% | 0 |
| bzdp.BoxCar 2.0 | 8.0 | 6.9% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.8 | 24 / 35 | 5184 |
| 2 | 1 | 69.1 | 87.9 | 25 / 35 | 5076 |
| 3 | 1 | 71.9 | 96.2 | 31 / 35 | 6165 |
| 4 | 1 | 68.5 | 89.2 | 25 / 35 | 4771 |
| 5 | 1 | 71.3 | 95.9 | 31 / 35 | 5270 |
| 6 | 1 | 66.2 | 71.1 | 15 / 35 | 5678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 99 | 81% |
| mld.DustBunny 3.8 | 44 | 91% |
| maribo.melee.BMV 0.1 | 10 | 100% |
| fullsail.SweetTea 1.1 | 7 | 100% |
| zyx.nano.Ant 1.1 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 24 | 40% | 112 |
| mld.DustBunny 3.8 | 10 | 17% | 50 |
| maribo.melee.BMV 0.1 | 7 | 12% | 12 |
| cs.Grudge 1.0 | 5 | 8% | 6 |
| zyx.nano.Ant 1.1 | 4 | 7% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 3 |
| bzdp.BoxCar 2.0 | 2 | 3% | 2 |

## Melee bench: F03

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 57 over 6 battles (9.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 84.7 | 134 / 210 | 2.38 | 20.1% | 36917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 134 |
| myl.micro.Troodon 1.10 | 2.0 | 14.8% | 35 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 12.0% | 5 |
| cb.nano.Insomnia 1.0 | 4.8 | 9.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 10.1% | 15 |
| cs.sheldor.Talon 1.1 | 6.2 | 8.9% | 1 |
| fm.mammillarias 1.3 | 6.2 | 8.7% | 3 |
| sp.Nanos.Ember 1.1 | 7.7 | 7.3% | 5 |
| sample.Tracker 1.0 | 9.5 | 4.6% | 0 |
| sample.Fire 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 91.1 | 24 / 35 | 6583 |
| 2 | 1 | 69.8 | 81.6 | 23 / 35 | 6221 |
| 3 | 1 | 70.5 | 83.2 | 24 / 35 | 6429 |
| 4 | 1 | 69.7 | 84.8 | 18 / 35 | 6046 |
| 5 | 1 | 69.4 | 84.4 | 22 / 35 | 5633 |
| 6 | 1 | 69.9 | 83.2 | 23 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 67 | 88% |
| myl.nano.KomoriNinja 1.1 | 24 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 13 | 85% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| fm.mammillarias 1.3 | 6 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 24 | 32% | 83 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 21% | 34 |
| cb.nano.Insomnia 1.0 | 12 | 16% | 7 |
| fm.mammillarias 1.3 | 8 | 11% | 12 |
| myl.nano.KomoriNinja 1.1 | 5 | 7% | 30 |
| sp.Nanos.Ember 1.1 | 4 | 5% | 21 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 15 |
| sample.Fire 1.0 | 2 | 3% | 3 |
| sample.Tracker 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 76 over 6 battles (12.7 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 87.8 | 156 / 210 | 2.10 | 20.8% | 38921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.8% | 156 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.2% | 14 |
| tvv.micro.Antares 1.1.1 | 2.8 | 11.9% | 15 |
| tj.zombie1n 1.0.1 | 5.3 | 8.7% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.5 | 8.9% | 0 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 8.9% | 10 |
| yk.JahMicro 1.0 | 6.0 | 8.3% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 7.8% | 4 |
| repositorio.NanoStep 1.0 | 8.7 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 89.5 | 30 / 35 | 6827 |
| 2 | 1 | 69.5 | 83.5 | 24 / 35 | 6291 |
| 3 | 1 | 70.2 | 85.4 | 25 / 35 | 6200 |
| 4 | 1 | 70.5 | 86.0 | 25 / 35 | 6671 |
| 5 | 1 | 70.6 | 88.3 | 24 / 35 | 6574 |
| 6 | 1 | 72.1 | 94.3 | 28 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 72 | 92% |
| stelo.SoJNanoMelee 1.1 | 29 | 90% |
| tvv.micro.Antares 1.1.1 | 21 | 95% |
| ers.nano.hawk.HawkLA 3.0m | 14 | 100% |
| yk.JahMicro 1.0 | 14 | 86% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| repositorio.NanoStep 1.0 | 6 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 43% | 96 |
| stelo.SoJNanoMelee 1.1 | 11 | 20% | 28 |
| tvv.micro.Antares 1.1.1 | 6 | 11% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 6 | 11% | 11 |
| yk.JahMicro 1.0 | 4 | 7% | 9 |
| tj.zombie1n 1.0.1 | 3 | 6% | 6 |
| repositorio.NanoStep 1.0 | 1 | 2% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 14 |
| sample.VelociRobot 1.0 | 0 | 0% | 9 |

## Melee bench: F05

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 73.9 | 122 / 210 | 3.35 | 17.1% | 29812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.1% | 122 |
| oog.melee.Corsair 1.0 | 2.3 | 12.5% | 20 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 11.7% | 20 |
| ahf.NanoAndrew .4 | 3.8 | 10.9% | 18 |
| EBBU.Sim2 1.02 | 5.7 | 9.5% | 3 |
| sam.Samspin 1.0 | 5.8 | 9.6% | 14 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 9.3% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.6% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.1 | 20 / 35 | 5041 |
| 2 | 1 | 66.9 | 77.5 | 21 / 35 | 5129 |
| 3 | 1 | 66.1 | 74.3 | 21 / 35 | 5156 |
| 4 | 1 | 67.0 | 79.7 | 22 / 35 | 4977 |
| 5 | 1 | 64.4 | 69.8 | 21 / 35 | 4720 |
| 6 | 1 | 63.9 | 70.2 | 17 / 35 | 4789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 42 | 86% |
| oog.melee.Corsair 1.0 | 41 | 88% |
| ahf.NanoAndrew .4 | 22 | 95% |
| sam.Samspin 1.0 | 14 | 86% |
| robar.nano.Assertive_Melee 0.2 | 7 | 86% |
| EBBU.Sim2 1.02 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 416. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 25 | 28% | 57 |
| oog.melee.Corsair 1.0 | 13 | 15% | 44 |
| robar.nano.Assertive_Melee 0.2 | 10 | 11% | 16 |
| sam.Samspin 1.0 | 8 | 9% | 16 |
| zyx.nano.BacillusComma 1.0 | 8 | 9% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 9% | 8 |
| EBBU.Sim2 1.02 | 6 | 7% | 16 |
| sample.TrackFire 1.0 | 6 | 7% | 9 |
| ahf.NanoAndrew .4 | 4 | 5% | 27 |

## Melee bench: F06

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 41 over 6 battles (6.8 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.5 | 149 / 210 | 1.94 | 19.9% | 32791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.9% | 149 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.7% | 28 |
| gh.nano.Grofvuil 0.2 | 3.0 | 12.1% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 9.8% | 15 |
| arthord.NanoSatanMelee Beta | 5.0 | 9.5% | 4 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.5% | 3 |
| fm.claire 1.7 | 6.7 | 8.1% | 3 |
| sample.SpinBot 1.0 | 8.5 | 6.1% | 2 |
| pa.Improved 1.0 | 9.2 | 5.9% | 0 |
| kurios.DOSexe .9b | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 25 / 35 | 5355 |
| 2 | 1 | 70.6 | 90.5 | 25 / 35 | 5665 |
| 3 | 1 | 69.5 | 85.7 | 26 / 35 | 5388 |
| 4 | 1 | 69.2 | 85.1 | 23 / 35 | 5893 |
| 5 | 1 | 70.3 | 93.7 | 25 / 35 | 5346 |
| 6 | 1 | 69.2 | 90.8 | 25 / 35 | 5144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 84% |
| oog.melee.CapuletDroid 1.1 | 33 | 97% |
| gh.nano.Grofvuil 0.2 | 21 | 95% |
| arthord.NanoSatanMelee Beta | 14 | 79% |
| winamp32.micro.MicroMacro 1.0 | 8 | 100% |
| kurios.DOSexe .9b | 4 | 75% |
| sample.SpinBot 1.0 | 3 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 37% | 100 |
| gh.nano.Grofvuil 0.2 | 14 | 23% | 41 |
| arthord.NanoSatanMelee Beta | 8 | 13% | 20 |
| oog.melee.CapuletDroid 1.1 | 7 | 11% | 15 |
| fm.claire 1.7 | 3 | 5% | 5 |
| sample.SpinBot 1.0 | 3 | 5% | 4 |
| kurios.DOSexe .9b | 2 | 3% | 9 |
| pa.Improved 1.0 | 1 | 2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 11 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 54 over 6 battles (9.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 82.7 | 116 / 210 | 2.56 | 18.4% | 32817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.4% | 116 |
| spinnercat.micro.Tyger 0.1 | 2.2 | 14.8% | 40 |
| gh.micro.Gruweltje 0.7 | 2.8 | 14.8% | 29 |
| mz.MicroGodMelee 1 | 4.0 | 13.2% | 13 |
| DBall.Anarchy 0.1 | 5.7 | 8.0% | 3 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.4% | 2 |
| el.JumpShoot 0.2 | 6.5 | 6.8% | 4 |
| fire219.CatBot 1.0 | 8.3 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.4% | 2 |
| acogdev.alpha 0.2 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 75.2 | 17 / 35 | 5232 |
| 2 | 1 | 70.8 | 89.5 | 25 / 35 | 6016 |
| 3 | 1 | 67.6 | 82.9 | 14 / 35 | 5609 |
| 4 | 1 | 68.2 | 82.5 | 21 / 35 | 5338 |
| 5 | 1 | 68.4 | 82.9 | 21 / 35 | 5499 |
| 6 | 1 | 67.9 | 83.2 | 18 / 35 | 5123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 67 | 57% |
| mz.MicroGodMelee 1 | 44 | 95% |
| gh.micro.Gruweltje 0.7 | 35 | 71% |
| el.JumpShoot 0.2 | 6 | 67% |
| DBall.Anarchy 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| spinnercat.micro.Tyger 0.1 | 39 | 41% | 72 |
| gh.micro.Gruweltje 0.7 | 21 | 22% | 54 |
| mz.MicroGodMelee 1 | 12 | 13% | 44 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 8 |
| el.JumpShoot 0.2 | 4 | 4% | 7 |
| fire219.CatBot 1.0 | 4 | 4% | 4 |
| acogdev.alpha 0.2 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 9 |
| mbro.Detektor3 0.1.1 | 3 | 3% | 7 |

## Melee bench: F08

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 72.6 | 103 / 210 | 3.46 | 16.6% | 30290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.6% | 103 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 49 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 21 |
| germ.TheMind .2 | 4.7 | 9.4% | 10 |
| qualidafial.MajorDick 1.0.1 | 6.0 | 9.0% | 3 |
| awesomeness.Elite 1.0 | 6.3 | 8.8% | 6 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.9% | 5 |
| stelo.UntouchableNano 1.3 | 7.2 | 7.5% | 7 |
| sample.Crazy 1.0 | 8.5 | 6.9% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 67.9 | 14 / 35 | 5472 |
| 2 | 1 | 65.5 | 71.4 | 17 / 35 | 5398 |
| 3 | 1 | 64.7 | 73.7 | 16 / 35 | 4700 |
| 4 | 1 | 66.7 | 77.5 | 19 / 35 | 5116 |
| 5 | 1 | 66.5 | 78.1 | 19 / 35 | 5016 |
| 6 | 1 | 63.0 | 67.3 | 18 / 35 | 4588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 78% |
| germ.TheMind .2 | 11 | 91% |
| qualidafial.MajorDick 1.0.1 | 8 | 88% |
| awesomeness.Elite 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 4 | 75% |
| stelo.UntouchableNano 1.3 | 4 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 498. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 58 | 54% | 119 |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 18% | 34 |
| qualidafial.MajorDick 1.0.1 | 7 | 7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6 | 6% | 9 |
| stelo.UntouchableNano 1.3 | 6 | 6% | 7 |
| germ.TheMind .2 | 5 | 5% | 14 |
| awesomeness.Elite 1.0 | 4 | 4% | 7 |
| sample.Crazy 1.0 | 1 | 1% | 6 |
| mym.EdgeStalker 1.0 | 1 | 1% | 3 |

## Melee bench: F09

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 28 over 6 battles (4.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.8 | 154 / 210 | 2.00 | 20.1% | 31081 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 20.1% | 154 |
| rz.HawkOnFire 0.1 | 2.0 | 14.1% | 19 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.8% | 9 |
| timmit.nano.TimDog 0.33 | 4.2 | 10.1% | 9 |
| maribo.IotaCT 1.1 | 4.5 | 10.5% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.1% | 2 |
| ratosh.Wesco 1.4 | 7.3 | 7.9% | 2 |
| spinnercat.Omen 1.0 | 7.7 | 7.9% | 5 |
| stelo.PatternRobot 1.0 | 7.8 | 7.8% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 88.6 | 27 / 35 | 5504 |
| 2 | 1 | 70.0 | 86.3 | 24 / 35 | 5345 |
| 3 | 1 | 70.5 | 88.9 | 25 / 35 | 5433 |
| 4 | 1 | 70.9 | 93.3 | 27 / 35 | 4797 |
| 5 | 1 | 70.5 | 90.5 | 28 / 35 | 4905 |
| 6 | 1 | 69.7 | 85.4 | 23 / 35 | 5097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 80 | 93% |
| nz.jdc.nano.GridFu 1.0 | 38 | 95% |
| timmit.nano.TimDog 0.33 | 15 | 80% |
| maribo.IotaCT 1.1 | 14 | 93% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| ratosh.Wesco 1.4 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.HawkOnFire 0.1 | 14 | 25% | 65 |
| timmit.nano.TimDog 0.33 | 11 | 20% | 27 |
| stelo.PatternRobot 1.0 | 9 | 16% | 18 |
| nz.jdc.nano.GridFu 1.0 | 6 | 11% | 48 |
| maribo.IotaCT 1.1 | 6 | 11% | 26 |
| ratosh.Wesco 1.4 | 5 | 9% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| spinnercat.Omen 1.0 | 1 | 2% | 5 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 2 |

## Melee bench: F10

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 40 over 6 battles (6.7 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 92.0 | 177 / 210 | 1.72 | 21.8% | 40070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.8% | 177 |
| tvv.nano.Polaris 1.2 | 2.2 | 12.4% | 14 |
| baal.nano.N 1.42 | 2.8 | 11.6% | 4 |
| zyx.micro.Ant 1.1 | 4.7 | 9.6% | 7 |
| Grystrion.TrackerWO 1.0 | 5.0 | 9.6% | 2 |
| sanja.First 0.1 | 5.7 | 8.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 8.0 | 6.7% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 7.5% | 1 |
| sample.RamFire 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 98.1 | 34 / 35 | 7258 |
| 2 | 1 | 72.4 | 93.3 | 29 / 35 | 7017 |
| 3 | 1 | 70.4 | 87.6 | 27 / 35 | 6254 |
| 4 | 1 | 71.1 | 88.6 | 28 / 35 | 6541 |
| 5 | 1 | 72.3 | 93.0 | 30 / 35 | 6736 |
| 6 | 1 | 71.0 | 91.1 | 29 / 35 | 6264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 45 | 98% |
| tvv.nano.Polaris 1.2 | 39 | 95% |
| sanja.First 0.1 | 23 | 96% |
| cvt.Firsty 1.0 | 22 | 86% |
| zyx.micro.Ant 1.1 | 20 | 95% |
| Grystrion.TrackerWO 1.0 | 17 | 94% |
| amk.Punbot.Punbot 0.01 | 15 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 12 | 35% | 41 |
| tvv.nano.Polaris 1.2 | 4 | 12% | 49 |
| sample.RamFire 1.0 | 4 | 12% | 6 |
| baal.nano.N 1.42 | 3 | 9% | 39 |
| sanja.First 0.1 | 3 | 9% | 30 |
| cvt.Firsty 1.0 | 3 | 9% | 20 |
| Grystrion.TrackerWO 1.0 | 3 | 9% | 17 |
| amk.Punbot.Punbot 0.01 | 1 | 3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |

## Melee bench: F11

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 34 over 6 battles (5.7 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.6 | 70 / 210 | 3.65 | 15.4% | 29905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.5 | 15.9% | 89 |
| hadur117.micro.SaorWD1 0.1 | 1.5 | 15.4% | 70 |
| cs.Wren 1.0 | 3.0 | 12.5% | 17 |
| mz.Cork 0.1 | 4.5 | 10.8% | 10 |
| js.PinBall 1.6 | 4.5 | 10.6% | 10 |
| joe.ADinosaur 1.0 | 6.3 | 9.1% | 4 |
| evd.X1 0.01 | 6.7 | 8.8% | 2 |
| jsal.Jsalbot 1.0 | 8.2 | 6.7% | 6 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 74.9 | 11 / 35 | 5250 |
| 2 | 1 | 64.8 | 74.6 | 15 / 35 | 5002 |
| 3 | 1 | 63.4 | 67.6 | 14 / 35 | 5220 |
| 4 | 2 | 61.8 | 64.4 | 10 / 35 | 4989 |
| 5 | 1 | 64.1 | 74.9 | 12 / 35 | 5104 |
| 6 | 2 | 60.9 | 67.0 | 8 / 35 | 4340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 70 | 34% |
| cs.Wren 1.0 | 22 | 91% |
| mz.Cork 0.1 | 13 | 92% |
| js.PinBall 1.6 | 10 | 100% |
| evd.X1 0.01 | 2 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 67 | 48% | 95 |
| evd.X1 0.01 | 21 | 15% | 24 |
| js.PinBall 1.6 | 15 | 11% | 26 |
| joe.ADinosaur 1.0 | 13 | 9% | 16 |
| cs.Wren 1.0 | 10 | 7% | 26 |
| mz.Cork 0.1 | 7 | 5% | 15 |
| PSW.Relentless 0.1 | 6 | 4% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 31 over 6 battles (5.2 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.0 | 126 / 210 | 2.53 | 18.6% | 29045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 18.6% | 126 |
| myl.nano.Graviton 1.10 | 2.2 | 12.3% | 25 |
| ntc.Opposite 1.5 | 3.7 | 11.4% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.2% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.4% | 20 |
| pfvicm.Sobieski 7.2.3b | 5.5 | 9.8% | 5 |
| disan.Chair 2.2.0 | 6.7 | 8.4% | 4 |
| DBall.NUKE 0.1 | 8.0 | 7.2% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 6.5% | 13 |
| pbg.R2D2 1.0 | 9.8 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.4 | 18 / 35 | 4436 |
| 2 | 1 | 71.1 | 92.1 | 24 / 35 | 5606 |
| 3 | 1 | 67.6 | 82.9 | 23 / 35 | 4693 |
| 4 | 1 | 65.5 | 76.8 | 18 / 35 | 4531 |
| 5 | 1 | 67.4 | 82.5 | 20 / 35 | 4723 |
| 6 | 1 | 68.9 | 85.1 | 23 / 35 | 5056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 43 | 84% |
| stelo.AreaTargetingBot 1.1 | 24 | 71% |
| ntc.Opposite 1.5 | 22 | 73% |
| disan.Chair 2.2.0 | 20 | 90% |
| DBall.NUKE 0.1 | 11 | 100% |
| donjezza.Muncho 1.0 | 10 | 60% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 18 | 21% | 35 |
| myl.nano.Graviton 1.10 | 17 | 20% | 61 |
| ntc.Opposite 1.5 | 13 | 15% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 14% | 26 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 21 |
| donjezza.Muncho 1.0 | 5 | 6% | 10 |
| DBall.NUKE 0.1 | 3 | 4% | 12 |
| disan.Chair 2.2.0 | 3 | 4% | 9 |
| pbg.R2D2 1.0 | 3 | 4% | 8 |

## Melee bench: F13

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 95 over 6 battles (15.8 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 75.4 | 96 / 210 | 3.21 | 16.2% | 25875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 16.2% | 96 |
| oog.melee.Capulet 1.2 | 2.3 | 13.7% | 32 |
| kawigi.micro.Shiz 1.1 | 3.2 | 14.0% | 37 |
| yagami.Tidus 0.11 | 4.2 | 12.4% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 19 |
| ejb.Polaris 1.0.1 | 6.0 | 10.4% | 10 |
| stelo.MirrorNano 1.3 | 7.3 | 7.3% | 1 |
| step.nanoPri 1.0 | 7.7 | 6.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 72.4 | 13 / 35 | 4456 |
| 2 | 1 | 67.2 | 82.5 | 16 / 35 | 4375 |
| 3 | 1 | 64.6 | 72.4 | 16 / 35 | 4299 |
| 4 | 1 | 65.8 | 78.4 | 19 / 35 | 3951 |
| 5 | 1 | 63.7 | 68.9 | 14 / 35 | 4451 |
| 6 | 1 | 66.1 | 78.1 | 18 / 35 | 4343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 32 | 97% |
| oog.melee.Capulet 1.2 | 29 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 92% |
| yagami.Tidus 0.11 | 17 | 59% |
| ejb.Polaris 1.0.1 | 7 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 35% | 67 |
| yagami.Tidus 0.11 | 29 | 25% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 14% | 39 |
| ejb.Polaris 1.0.1 | 9 | 8% | 19 |
| kawigi.micro.Shiz 1.1 | 6 | 5% | 24 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| kurios.DOSexe .9a | 5 | 4% | 5 |
| stelo.MirrorNano 1.3 | 3 | 3% | 5 |

## Melee bench: F14

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 52 over 6 battles (8.7 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.4 | 135 / 210 | 2.86 | 17.7% | 27544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 17.7% | 135 |
| wee.Gem 1.8.4 | 3.0 | 11.7% | 26 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 9 |
| wompi.Quokka 1.6 | 3.5 | 11.4% | 18 |
| ratosh.Nobo 0.21 | 4.5 | 11.1% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 10.0% | 11 |
| bayen.UbaMicro 1.4 | 7.0 | 8.6% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.2 | 6.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.8% | 0 |
| maribo.FollowFire 1 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.5 | 27 / 35 | 4900 |
| 2 | 1 | 65.3 | 73.0 | 22 / 35 | 4476 |
| 3 | 1 | 64.4 | 72.1 | 19 / 35 | 4612 |
| 4 | 1 | 68.2 | 84.8 | 23 / 35 | 4881 |
| 5 | 1 | 66.9 | 81.9 | 23 / 35 | 4459 |
| 6 | 1 | 65.0 | 74.0 | 21 / 35 | 4216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 100% |
| wee.Gem 1.8.4 | 39 | 95% |
| ratosh.Nobo 0.21 | 17 | 94% |
| wompi.Quokka 1.6 | 16 | 88% |
| m3thos.Eva00 1.1 | 12 | 67% |
| bayen.UbaMicro 1.4 | 3 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 2 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 10 | 13% | 46 |
| wompi.Quokka 1.6 | 10 | 13% | 25 |
| m3thos.Eva00 1.1 | 9 | 12% | 20 |
| jeremyreeder.Vincent 2011.12.09 | 9 | 12% | 12 |
| bzdp.Pansy 2.1 | 8 | 11% | 54 |
| bayen.UbaMicro 1.4 | 8 | 11% | 14 |
| maribo.FollowFire 1 | 8 | 11% | 10 |
| ratosh.Nobo 0.21 | 7 | 9% | 21 |
| stelo.MyAgileRobot 0.2 | 7 | 9% | 8 |

## Melee bench: F15

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 30 over 6 battles (5.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 85.2 | 72 / 210 | 2.33 | 20.9% | 50983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.3 | 20.9% | 72 |
| wompi.Wallaby 5.1 | 1.7 | 20.2% | 123 |
| mz.NanoGod 2.02 | 3.0 | 13.0% | 10 |
| exauge.GateKeeper 1.1.121g | 4.5 | 9.5% | 4 |
| ayk.WallHugger 1.0 | 5.2 | 9.2% | 0 |
| stuff.Vlad 0.1 | 5.3 | 8.8% | 2 |
| stelo.PianistNano 1.2 | 7.2 | 6.9% | 0 |
| drd.Dreadknoght 0.9 | 7.8 | 5.7% | 0 |
| sample.SittingDuck 1.0 | 9.5 | 2.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 86.3 | 13 / 35 | 8601 |
| 2 | 1 | 73.2 | 91.1 | 13 / 35 | 8576 |
| 3 | 1 | 73.2 | 87.3 | 12 / 35 | 8950 |
| 4 | 1 | 72.7 | 87.0 | 12 / 35 | 8434 |
| 5 | 2 | 70.9 | 79.7 | 11 / 35 | 8030 |
| 6 | 2 | 71.3 | 80.0 | 11 / 35 | 8392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 133 | 31% |
| mz.NanoGod 2.02 | 13 | 77% |
| exauge.GateKeeper 1.1.121g | 11 | 91% |
| ayk.WallHugger 1.0 | 7 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1038. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 108 | 78% | 152 |
| mz.NanoGod 2.02 | 12 | 9% | 24 |
| exauge.GateKeeper 1.1.121g | 9 | 6% | 16 |
| ayk.WallHugger 1.0 | 6 | 4% | 11 |
| stelo.PianistNano 1.2 | 4 | 3% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 56 over 6 battles (9.3 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 72.9 | 105 / 210 | 3.44 | 16.4% | 27212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.2 | 16.4% | 105 |
| voidious.micro.BlitzBat 1.05 | 1.8 | 13.6% | 32 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 20 |
| bvh.micro.Freya 0.3 | 3.7 | 11.2% | 17 |
| davidalves.net.DuelistMicroMelee 1.4 | 5.2 | 10.3% | 15 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.8% | 7 |
| conscience.Electron 1.3g | 7.0 | 8.1% | 3 |
| ap.Frederick 1.1 | 8.5 | 6.8% | 7 |
| dl.BetterWalls 1.0 | 8.8 | 6.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 69.2 | 17 / 35 | 4523 |
| 2 | 1 | 66.4 | 79.4 | 21 / 35 | 4666 |
| 3 | 1 | 66.9 | 81.6 | 19 / 35 | 4805 |
| 4 | 2 | 60.2 | 57.5 | 12 / 35 | 4589 |
| 5 | 1 | 64.3 | 73.0 | 19 / 35 | 4160 |
| 6 | 1 | 65.5 | 76.8 | 17 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 72% |
| dummy.micro.Sparrow 2.5 | 24 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 19 | 89% |
| bvh.micro.Freya 0.3 | 13 | 92% |
| stelo.MirrorMicro 1.0 | 9 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 34 | 32% | 73 |
| dummy.micro.Sparrow 2.5 | 16 | 15% | 42 |
| conscience.Electron 1.3g | 14 | 13% | 16 |
| dl.BetterWalls 1.0 | 13 | 12% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 10% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 8% | 31 |
| stelo.MirrorMicro 1.0 | 5 | 5% | 11 |
| bvh.micro.Freya 0.3 | 5 | 5% | 11 |

## Melee bench: F17

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 59 over 6 battles (9.8 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 88.2 | 155 / 210 | 2.06 | 21.6% | 41903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 21.6% | 155 |
| sheldor.melee.nano.TestMelee 0.1 | 2.0 | 14.9% | 20 |
| sul.Lunar 1.1 | 3.8 | 10.8% | 8 |
| supersample.SuperBoxBot 1.0 | 4.2 | 10.2% | 11 |
| mme.NikeEnhanced 2.0 | 4.5 | 9.6% | 3 |
| dsw.StaticD 1.0 | 5.5 | 8.7% | 2 |
| sample.MyFirstRobot 1.0 | 7.8 | 6.8% | 9 |
| tlp.ThreeLeggedPig 1 | 7.8 | 6.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.5 | 6.5% | 2 |
| sample.Corners 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 81.0 | 22 / 35 | 6775 |
| 2 | 1 | 72.1 | 92.1 | 26 / 35 | 6800 |
| 3 | 1 | 72.8 | 90.2 | 25 / 35 | 7370 |
| 4 | 1 | 71.3 | 86.3 | 26 / 35 | 6596 |
| 5 | 1 | 73.0 | 90.5 | 27 / 35 | 7632 |
| 6 | 1 | 72.2 | 89.2 | 29 / 35 | 6730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 68 | 93% |
| sul.Lunar 1.1 | 31 | 97% |
| supersample.SuperBoxBot 1.0 | 22 | 86% |
| sample.MyFirstRobot 1.0 | 14 | 79% |
| dsw.StaticD 1.0 | 13 | 100% |
| mme.NikeEnhanced 2.0 | 11 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| tlp.ThreeLeggedPig 1 | 4 | 75% |

Hadur died in 58 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 18 | 31% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 19% | 75 |
| sample.MyFirstRobot 1.0 | 6 | 10% | 18 |
| mme.NikeEnhanced 2.0 | 6 | 10% | 16 |
| sul.Lunar 1.1 | 5 | 9% | 32 |
| dsw.StaticD 1.0 | 5 | 9% | 18 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 3% | 8 |
| tlp.ThreeLeggedPig 1 | 2 | 3% | 4 |
| sample.Corners 1.0 | 2 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorWD1 0.1 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v378, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx512M.

Skipped turns: 29 over 6 battles (4.8 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 82.6 | 128 / 210 | 2.57 | 19.4% | 40160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorWD1 0.1 | 1.0 | 19.4% | 128 |
| radnor.DoctorBob 1.42 | 3.0 | 12.5% | 22 |
| mld.Wisdom 1.0 | 3.2 | 12.2% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.2 | 12.3% | 21 |
| amz.NanoClone 1.41 | 5.0 | 10.3% | 10 |
| KiraNL.Chupacabra 0.4 | 5.7 | 9.8% | 8 |
| sample.Walls 1.0 | 7.5 | 7.1% | 3 |
| GarmBox.Oranges 1.0 | 7.7 | 6.9% | 0 |
| jangs.ns51 1.0 | 8.8 | 5.9% | 3 |
| sample.Target 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 79.7 | 21 / 35 | 6677 |
| 2 | 1 | 70.1 | 83.2 | 24 / 35 | 7134 |
| 3 | 1 | 70.5 | 87.6 | 24 / 35 | 6583 |
| 4 | 1 | 70.4 | 87.3 | 23 / 35 | 7076 |
| 5 | 1 | 69.9 | 86.3 | 19 / 35 | 7015 |
| 6 | 1 | 65.7 | 71.4 | 17 / 35 | 5675 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 88% |
| radnor.DoctorBob 1.42 | 31 | 77% |
| mld.Wisdom 1.0 | 30 | 80% |
| amz.NanoClone 1.41 | 12 | 75% |
| KiraNL.Chupacabra 0.4 | 12 | 58% |
| jangs.ns51 1.0 | 7 | 86% |
| sample.Target 1.0 | 5 | 100% |
| GarmBox.Oranges 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 531. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| KiraNL.Chupacabra 0.4 | 22 | 27% | 29 |
| mld.Wisdom 1.0 | 18 | 22% | 40 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 18% | 63 |
| radnor.DoctorBob 1.42 | 15 | 18% | 44 |
| amz.NanoClone 1.41 | 8 | 10% | 15 |
| sample.Walls 1.0 | 2 | 2% | 8 |
| jangs.ns51 1.0 | 2 | 2% | 7 |
| GarmBox.Oranges 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

