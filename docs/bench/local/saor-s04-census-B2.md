# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 90.3 | 321 / 420 | 1.87 | 21.9% | 87248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 21.9% | 321 |
| radnor.DoctorBob 1.42 | 2.5 | 13.9% | 44 |
| mz.AntiGrav 1.0 | 2.9 | 13.8% | 20 |
| mld.Infinity 2.2 | 3.6 | 12.9% | 26 |
| amz.NanoClone 1.41 | 5.0 | 10.2% | 6 |
| sample.Walls 1.0 | 6.3 | 7.2% | 2 |
| GarmBox.Oranges 1.0 | 7.0 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 2 |
| sample.Target 1.0 | 9.5 | 3.6% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.1 | 88.3 | 27 / 35 | 7578 |
| 2 | 1 | 71.7 | 86.3 | 25 / 35 | 6885 |
| 3 | 1 | 72.7 | 90.5 | 27 / 35 | 7119 |
| 4 | 1 | 72.8 | 89.2 | 25 / 35 | 7508 |
| 5 | 1 | 72.1 | 88.3 | 25 / 35 | 7300 |
| 6 | 1 | 73.5 | 94.0 | 28 / 35 | 7008 |
| 7 | 1 | 75.7 | 100.0 | 35 / 35 | 8147 |
| 8 | 1 | 72.6 | 88.3 | 27 / 35 | 7273 |
| 9 | 1 | 73.9 | 93.3 | 31 / 35 | 7546 |
| 10 | 1 | 71.7 | 88.6 | 22 / 35 | 6975 |
| 11 | 1 | 72.0 | 87.6 | 23 / 35 | 6868 |
| 12 | 1 | 72.1 | 89.2 | 26 / 35 | 7041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 135 | 99% |
| mld.Infinity 2.2 | 102 | 91% |
| radnor.DoctorBob 1.42 | 67 | 85% |
| amz.NanoClone 1.41 | 12 | 83% |
| jangs.ns51 1.0 | 11 | 100% |
| sample.Target 1.0 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| arthord.MannyPacquiao Beta | 3 | 100% |

Hadur died in 100 of 420 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 43 | 43% | 137 |
| mld.Infinity 2.2 | 20 | 20% | 45 |
| mz.AntiGrav 1.0 | 18 | 18% | 157 |
| amz.NanoClone 1.41 | 8 | 8% | 21 |
| GarmBox.Oranges 1.0 | 6 | 6% | 10 |
| sample.Walls 1.0 | 2 | 2% | 24 |
| arthord.MannyPacquiao Beta | 2 | 2% | 8 |
| jangs.ns51 1.0 | 0 | 0% | 10 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 291 / 420 | 2.22 | 19.1% | 62538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 19.1% | 291 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.2% | 76 |
| mld.DustBunny 3.8 | 3.0 | 13.3% | 17 |
| maribo.melee.BMV 0.1 | 4.1 | 10.3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.5 | 9.0% | 10 |
| zyx.nano.Ant 1.1 | 6.5 | 8.1% | 2 |
| fullsail.SweetTea 1.1 | 7.7 | 7.0% | 4 |
| bzdp.BoxCar 2.0 | 7.8 | 7.3% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.0% | 13 |
| cs.Grudge 1.0 | 9.6 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.4 | 18 / 35 | 4521 |
| 2 | 1 | 69.5 | 89.5 | 26 / 35 | 5134 |
| 3 | 1 | 70.6 | 96.8 | 27 / 35 | 5443 |
| 4 | 1 | 70.2 | 93.0 | 27 / 35 | 5192 |
| 5 | 1 | 68.9 | 87.0 | 26 / 35 | 5346 |
| 6 | 1 | 69.8 | 89.2 | 26 / 35 | 5265 |
| 7 | 1 | 69.1 | 87.6 | 27 / 35 | 5168 |
| 8 | 1 | 70.1 | 91.4 | 28 / 35 | 5310 |
| 9 | 1 | 68.8 | 85.7 | 24 / 35 | 5269 |
| 10 | 1 | 64.1 | 63.5 | 14 / 35 | 5340 |
| 11 | 1 | 70.0 | 90.8 | 24 / 35 | 5351 |
| 12 | 1 | 68.2 | 83.8 | 24 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 152 | 77% |
| mld.DustBunny 3.8 | 106 | 96% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 72% |
| djdjdj.NanoSkunk10 1.0 | 18 | 100% |
| fullsail.SweetTea 1.1 | 18 | 94% |
| zyx.nano.Ant 1.1 | 10 | 100% |
| maribo.melee.BMV 0.1 | 9 | 100% |
| bzdp.BoxCar 2.0 | 4 | 100% |

Hadur died in 132 of 420 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 54 | 41% | 169 |
| mld.DustBunny 3.8 | 21 | 16% | 112 |
| fullsail.SweetTea 1.1 | 12 | 9% | 31 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 8% | 25 |
| maribo.melee.BMV 0.1 | 10 | 8% | 19 |
| zyx.nano.Ant 1.1 | 9 | 7% | 23 |
| djdjdj.NanoSkunk10 1.0 | 8 | 6% | 26 |
| cs.Grudge 1.0 | 8 | 6% | 9 |
| bzdp.BoxCar 2.0 | 0 | 0% | 4 |

## Melee bench: F03

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 85.6 | 298 / 420 | 2.30 | 20.4% | 74205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 20.4% | 298 |
| myl.micro.Troodon 1.10 | 2.0 | 13.6% | 48 |
| myl.nano.KomoriNinja 1.1 | 3.4 | 11.7% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 4.1 | 10.7% | 23 |
| cb.nano.Insomnia 1.0 | 4.9 | 10.1% | 24 |
| fm.mammillarias 1.3 | 5.9 | 8.8% | 4 |
| cs.sheldor.Talon 1.1 | 6.8 | 8.3% | 1 |
| sp.Nanos.Ember 1.1 | 7.8 | 7.0% | 4 |
| sample.Tracker 1.0 | 9.4 | 4.6% | 1 |
| sample.Fire 1.0 | 9.6 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 86.7 | 23 / 35 | 5888 |
| 2 | 1 | 69.7 | 82.9 | 24 / 35 | 6057 |
| 3 | 1 | 72.7 | 93.0 | 28 / 35 | 6569 |
| 4 | 1 | 70.6 | 84.4 | 26 / 35 | 6237 |
| 5 | 1 | 71.8 | 91.4 | 26 / 35 | 6435 |
| 6 | 1 | 69.1 | 80.3 | 24 / 35 | 6066 |
| 7 | 1 | 69.8 | 84.1 | 24 / 35 | 6023 |
| 8 | 1 | 71.5 | 88.9 | 24 / 35 | 6444 |
| 9 | 1 | 72.6 | 92.7 | 27 / 35 | 6569 |
| 10 | 1 | 69.6 | 81.6 | 25 / 35 | 6000 |
| 11 | 1 | 69.9 | 83.8 | 26 / 35 | 5955 |
| 12 | 1 | 68.2 | 76.8 | 21 / 35 | 5962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 102 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 79 | 91% |
| cb.nano.Insomnia 1.0 | 60 | 83% |
| myl.nano.KomoriNinja 1.1 | 41 | 98% |
| sp.Nanos.Ember 1.1 | 17 | 94% |
| fm.mammillarias 1.3 | 13 | 100% |
| cs.sheldor.Talon 1.1 | 6 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 122 of 420 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| myl.micro.Troodon 1.10 | 23 | 19% | 145 |
| cb.nano.Insomnia 1.0 | 23 | 19% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 19 | 16% | 64 |
| myl.nano.KomoriNinja 1.1 | 18 | 15% | 81 |
| fm.mammillarias 1.3 | 12 | 10% | 26 |
| sp.Nanos.Ember 1.1 | 11 | 9% | 35 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 27 |
| sample.Fire 1.0 | 4 | 3% | 12 |
| sample.Tracker 1.0 | 4 | 3% | 5 |

## Melee bench: F04

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 88.4 | 317 / 420 | 2.05 | 21.1% | 79986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 21.1% | 317 |
| kawigi.nano.Lib 1.0 | 2.4 | 12.5% | 25 |
| tvv.micro.Antares 1.1.1 | 2.7 | 12.1% | 23 |
| stelo.SoJNanoMelee 1.1 | 4.8 | 9.5% | 21 |
| tj.zombie1n 1.0.1 | 5.5 | 8.7% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.9 | 8.6% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 6.5 | 8.2% | 16 |
| yk.JahMicro 1.0 | 7.3 | 8.0% | 7 |
| repositorio.NanoStep 1.0 | 9.1 | 6.2% | 3 |
| sample.VelociRobot 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 86.3 | 25 / 35 | 6532 |
| 2 | 1 | 71.4 | 88.3 | 27 / 35 | 6823 |
| 3 | 1 | 70.4 | 87.9 | 26 / 35 | 6240 |
| 4 | 1 | 71.1 | 88.9 | 25 / 35 | 6593 |
| 5 | 1 | 70.0 | 83.2 | 27 / 35 | 6410 |
| 6 | 1 | 72.3 | 94.0 | 26 / 35 | 6999 |
| 7 | 1 | 72.6 | 91.7 | 29 / 35 | 7164 |
| 8 | 1 | 70.8 | 89.5 | 24 / 35 | 6538 |
| 9 | 1 | 71.2 | 85.4 | 27 / 35 | 6997 |
| 10 | 1 | 69.5 | 84.1 | 25 / 35 | 6113 |
| 11 | 1 | 70.4 | 86.3 | 27 / 35 | 6352 |
| 12 | 1 | 72.8 | 94.6 | 29 / 35 | 7225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 114 | 91% |
| stelo.SoJNanoMelee 1.1 | 90 | 93% |
| ers.nano.hawk.HawkLA 3.0m | 38 | 82% |
| tvv.micro.Antares 1.1.1 | 35 | 100% |
| tj.zombie1n 1.0.1 | 31 | 97% |
| yk.JahMicro 1.0 | 17 | 76% |
| repositorio.NanoStep 1.0 | 10 | 90% |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 100% |
| sample.VelociRobot 1.0 | 4 | 100% |

Hadur died in 103 of 420 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 46 | 45% | 167 |
| tvv.micro.Antares 1.1.1 | 10 | 10% | 59 |
| stelo.SoJNanoMelee 1.1 | 10 | 10% | 54 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 9% | 57 |
| tj.zombie1n 1.0.1 | 9 | 9% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 7 | 7% | 15 |
| yk.JahMicro 1.0 | 6 | 6% | 18 |
| repositorio.NanoStep 1.0 | 3 | 3% | 15 |
| sample.VelociRobot 1.0 | 3 | 3% | 13 |

## Melee bench: F05

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 72.9 | 217 / 420 | 3.44 | 16.6% | 59049 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 16.6% | 217 |
| oog.melee.Corsair 1.0 | 2.1 | 12.7% | 52 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 10.9% | 43 |
| ahf.NanoAndrew .4 | 3.9 | 11.1% | 47 |
| EBBU.Sim2 1.02 | 5.2 | 9.9% | 21 |
| sam.Samspin 1.0 | 6.3 | 9.5% | 17 |
| zyx.nano.BacillusComma 1.0 | 6.5 | 9.1% | 16 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 8.8% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.1 | 6.5% | 0 |
| sample.TrackFire 1.0 | 9.9 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.3 | 18 / 35 | 4839 |
| 2 | 1 | 67.5 | 82.5 | 21 / 35 | 5206 |
| 3 | 1 | 63.9 | 70.5 | 17 / 35 | 4892 |
| 4 | 1 | 62.3 | 66.7 | 15 / 35 | 4629 |
| 5 | 1 | 65.4 | 73.7 | 17 / 35 | 5239 |
| 6 | 1 | 64.6 | 70.2 | 19 / 35 | 5291 |
| 7 | 1 | 61.7 | 63.2 | 12 / 35 | 4824 |
| 8 | 1 | 63.6 | 70.2 | 16 / 35 | 4482 |
| 9 | 1 | 66.6 | 78.4 | 21 / 35 | 5151 |
| 10 | 1 | 64.6 | 73.0 | 21 / 35 | 4759 |
| 11 | 1 | 65.1 | 74.9 | 20 / 35 | 4733 |
| 12 | 1 | 66.1 | 77.8 | 20 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 78 | 95% |
| oog.melee.Corsair 1.0 | 73 | 71% |
| ahf.NanoAndrew .4 | 43 | 81% |
| sam.Samspin 1.0 | 22 | 95% |
| EBBU.Sim2 1.02 | 16 | 100% |
| robar.nano.Assertive_Melee 0.2 | 11 | 82% |
| zyx.nano.BacillusComma 1.0 | 7 | 100% |
| sample.TrackFire 1.0 | 3 | 100% |

Hadur died in 205 of 420 rounds, at a mean tick of 417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 40 | 20% | 96 |
| simonton.nano.MeleeSeed 1.8 | 32 | 16% | 102 |
| ahf.NanoAndrew .4 | 29 | 14% | 69 |
| bwbaugh.nano.Tirunculus 0.0.0a | 27 | 13% | 24 |
| robar.nano.Assertive_Melee 0.2 | 25 | 12% | 38 |
| zyx.nano.BacillusComma 1.0 | 21 | 10% | 32 |
| EBBU.Sim2 1.02 | 15 | 7% | 28 |
| sam.Samspin 1.0 | 12 | 6% | 25 |
| sample.TrackFire 1.0 | 4 | 2% | 6 |

## Melee bench: F06

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.9 | 298 / 420 | 1.91 | 19.9% | 64105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 19.9% | 298 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 35 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.3% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.9 | 9.5% | 34 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.9% | 12 |
| fm.claire 1.7 | 5.8 | 8.7% | 6 |
| arthord.NanoSatanMelee Beta | 5.9 | 9.0% | 10 |
| sample.SpinBot 1.0 | 8.1 | 7.2% | 4 |
| pa.Improved 1.0 | 9.0 | 6.1% | 0 |
| kurios.DOSexe .9b | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 25 / 35 | 5852 |
| 2 | 1 | 69.7 | 90.2 | 27 / 35 | 5075 |
| 3 | 1 | 70.6 | 91.7 | 27 / 35 | 5510 |
| 4 | 1 | 70.4 | 92.4 | 27 / 35 | 5486 |
| 5 | 1 | 68.9 | 87.9 | 24 / 35 | 5261 |
| 6 | 1 | 68.3 | 87.0 | 23 / 35 | 4928 |
| 7 | 1 | 71.4 | 94.6 | 27 / 35 | 5719 |
| 8 | 1 | 69.2 | 88.9 | 25 / 35 | 5165 |
| 9 | 1 | 68.3 | 84.4 | 21 / 35 | 5256 |
| 10 | 1 | 69.5 | 91.4 | 24 / 35 | 5046 |
| 11 | 1 | 69.2 | 88.3 | 22 / 35 | 5404 |
| 12 | 1 | 70.2 | 91.4 | 26 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 139 | 90% |
| oog.melee.CapuletDroid 1.1 | 65 | 77% |
| gh.nano.Grofvuil 0.2 | 50 | 88% |
| arthord.NanoSatanMelee Beta | 29 | 83% |
| winamp32.micro.MicroMacro 1.0 | 24 | 75% |
| sample.SpinBot 1.0 | 15 | 93% |
| fm.claire 1.7 | 13 | 92% |
| pa.Improved 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 6 | 83% |

Hadur died in 125 of 420 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.CapuletDroid 1.1 | 31 | 25% | 40 |
| d414.nano.Quantum 1.0.0 | 27 | 22% | 145 |
| gh.nano.Grofvuil 0.2 | 17 | 14% | 78 |
| arthord.NanoSatanMelee Beta | 14 | 11% | 41 |
| fm.claire 1.7 | 10 | 8% | 25 |
| winamp32.micro.MicroMacro 1.0 | 9 | 7% | 40 |
| sample.SpinBot 1.0 | 8 | 6% | 17 |
| kurios.DOSexe .9b | 3 | 2% | 20 |
| pa.Improved 1.0 | 3 | 2% | 11 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.7 | 210 / 420 | 2.38 | 18.7% | 68004 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 18.7% | 210 |
| gh.micro.Gruweltje 0.7 | 2.2 | 14.8% | 82 |
| spinnercat.micro.Tyger 0.1 | 3.4 | 13.3% | 39 |
| mz.MicroGodMelee 1 | 3.4 | 13.3% | 66 |
| DBall.Anarchy 0.1 | 5.3 | 8.7% | 11 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.8% | 2 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 5 |
| fire219.CatBot 1.0 | 8.6 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 8.6 | 5.6% | 3 |
| acogdev.alpha 0.2 | 8.8 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 18 / 35 | 5603 |
| 2 | 1 | 67.1 | 81.6 | 14 / 35 | 5551 |
| 3 | 1 | 67.8 | 81.6 | 18 / 35 | 5639 |
| 4 | 1 | 69.8 | 89.2 | 21 / 35 | 5801 |
| 5 | 1 | 68.3 | 84.4 | 17 / 35 | 5584 |
| 6 | 1 | 69.9 | 91.7 | 18 / 35 | 5700 |
| 7 | 1 | 68.1 | 82.5 | 16 / 35 | 5867 |
| 8 | 1 | 69.2 | 87.6 | 19 / 35 | 5598 |
| 9 | 1 | 68.8 | 86.0 | 16 / 35 | 5667 |
| 10 | 1 | 67.6 | 81.0 | 17 / 35 | 5500 |
| 11 | 1 | 67.9 | 82.5 | 21 / 35 | 5429 |
| 12 | 1 | 68.3 | 82.2 | 15 / 35 | 6065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 110 | 88% |
| mz.MicroGodMelee 1 | 89 | 51% |
| gh.micro.Gruweltje 0.7 | 70 | 31% |
| DBall.Anarchy 0.1 | 31 | 97% |
| mbro.Detektor3 0.1.1 | 8 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 211 of 420 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 79 | 37% | 138 |
| gh.micro.Gruweltje 0.7 | 72 | 34% | 110 |
| spinnercat.micro.Tyger 0.1 | 27 | 13% | 89 |
| acogdev.alpha 0.2 | 9 | 4% | 11 |
| caimano.Furia_Ceca 0.22 | 8 | 4% | 11 |
| fire219.CatBot 1.0 | 5 | 2% | 5 |
| mbro.Detektor3 0.1.1 | 4 | 2% | 15 |
| el.JumpShoot 0.2 | 4 | 2% | 7 |
| DBall.Anarchy 0.1 | 3 | 1% | 33 |

## Melee bench: F08

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 71.3 | 216 / 420 | 3.59 | 16.6% | 62919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.2 | 16.6% | 216 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 80 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.4% | 65 |
| qualidafial.MajorDick 1.0.1 | 4.3 | 9.8% | 17 |
| germ.TheMind .2 | 4.9 | 9.5% | 11 |
| awesomeness.Elite 1.0 | 6.7 | 8.4% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 7.8 | 7.5% | 7 |
| sample.Crazy 1.0 | 8.7 | 7.0% | 4 |
| mym.EdgeStalker 1.0 | 10.0 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 80.0 | 22 / 35 | 5442 |
| 2 | 1 | 64.9 | 70.8 | 17 / 35 | 5444 |
| 3 | 1 | 65.8 | 74.0 | 18 / 35 | 5449 |
| 4 | 1 | 67.5 | 79.7 | 23 / 35 | 5111 |
| 5 | 2 | 62.2 | 64.8 | 14 / 35 | 4863 |
| 6 | 1 | 62.3 | 62.5 | 16 / 35 | 4988 |
| 7 | 2 | 63.0 | 65.7 | 14 / 35 | 5170 |
| 8 | 1 | 66.5 | 76.5 | 22 / 35 | 4992 |
| 9 | 1 | 66.5 | 74.6 | 19 / 35 | 5382 |
| 10 | 1 | 64.8 | 70.2 | 18 / 35 | 5373 |
| 11 | 1 | 64.0 | 67.3 | 15 / 35 | 4986 |
| 12 | 1 | 64.5 | 69.2 | 18 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 144 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 40 | 83% |
| germ.TheMind .2 | 23 | 91% |
| qualidafial.MajorDick 1.0.1 | 17 | 94% |
| sample.Crazy 1.0 | 9 | 100% |
| awesomeness.Elite 1.0 | 6 | 83% |
| stelo.UntouchableNano 1.3 | 5 | 80% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |

Hadur died in 206 of 420 rounds, at a mean tick of 426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 43% | 197 |
| simonton.nano.WeekendObsession_Melee 1.0 | 41 | 20% | 68 |
| germ.TheMind .2 | 17 | 8% | 39 |
| qualidafial.MajorDick 1.0.1 | 17 | 8% | 22 |
| awesomeness.Elite 1.0 | 16 | 8% | 28 |
| stelo.UntouchableNano 1.3 | 15 | 7% | 22 |
| lrem.micro.MoggFanatic 0.2 | 7 | 3% | 15 |
| sample.Crazy 1.0 | 2 | 1% | 20 |
| mym.EdgeStalker 1.0 | 2 | 1% | 7 |

## Melee bench: F09

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 88.6 | 313 / 420 | 2.02 | 20.0% | 59716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 20.0% | 313 |
| rz.HawkOnFire 0.1 | 2.1 | 13.5% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.1 | 11.9% | 21 |
| maribo.IotaCT 1.1 | 4.3 | 10.5% | 19 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.7% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 9.6% | 3 |
| spinnercat.Omen 1.0 | 7.8 | 8.2% | 6 |
| ratosh.Wesco 1.4 | 7.8 | 8.0% | 8 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 12 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 26 / 35 | 4646 |
| 2 | 1 | 68.4 | 82.2 | 25 / 35 | 4540 |
| 3 | 1 | 69.5 | 86.7 | 27 / 35 | 4920 |
| 4 | 1 | 72.3 | 95.6 | 30 / 35 | 5244 |
| 5 | 1 | 70.0 | 89.8 | 28 / 35 | 4817 |
| 6 | 1 | 69.3 | 85.1 | 22 / 35 | 4874 |
| 7 | 1 | 71.0 | 87.9 | 27 / 35 | 5059 |
| 8 | 1 | 71.3 | 90.5 | 28 / 35 | 5066 |
| 9 | 1 | 69.3 | 83.8 | 19 / 35 | 5326 |
| 10 | 1 | 71.3 | 94.0 | 26 / 35 | 5201 |
| 11 | 1 | 70.9 | 89.5 | 27 / 35 | 5150 |
| 12 | 1 | 71.1 | 89.2 | 28 / 35 | 4873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 141 | 95% |
| nz.jdc.nano.GridFu 1.0 | 88 | 95% |
| maribo.IotaCT 1.1 | 27 | 70% |
| timmit.nano.TimDog 0.33 | 26 | 88% |
| stelo.PatternRobot 1.0 | 26 | 85% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 100% |
| ratosh.Wesco 1.4 | 13 | 92% |
| spinnercat.Omen 1.0 | 5 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 24 | 22% | 63 |
| rz.HawkOnFire 0.1 | 20 | 18% | 118 |
| stelo.PatternRobot 1.0 | 17 | 16% | 34 |
| maribo.IotaCT 1.1 | 14 | 13% | 49 |
| nz.jdc.nano.GridFu 1.0 | 12 | 11% | 102 |
| ratosh.Wesco 1.4 | 9 | 8% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 7% | 12 |
| spinnercat.Omen 1.0 | 3 | 3% | 11 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.7 | 356 / 420 | 1.66 | 21.7% | 77529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 21.7% | 356 |
| tvv.nano.Polaris 1.2 | 2.3 | 12.0% | 22 |
| baal.nano.N 1.42 | 2.8 | 11.4% | 6 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.5% | 7 |
| zyx.micro.Ant 1.1 | 5.3 | 9.1% | 11 |
| sanja.First 0.1 | 5.9 | 8.6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 6.8 | 8.2% | 2 |
| amk.Punbot.Punbot 0.01 | 7.9 | 7.4% | 5 |
| cvt.Firsty 1.0 | 8.4 | 7.1% | 8 |
| sample.RamFire 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.7 | 28 / 35 | 6498 |
| 2 | 1 | 69.4 | 82.9 | 25 / 35 | 6148 |
| 3 | 1 | 73.0 | 95.9 | 33 / 35 | 6838 |
| 4 | 1 | 72.0 | 94.0 | 29 / 35 | 6752 |
| 5 | 1 | 73.1 | 97.8 | 33 / 35 | 6729 |
| 6 | 1 | 72.1 | 89.5 | 29 / 35 | 6941 |
| 7 | 1 | 71.3 | 92.4 | 29 / 35 | 6090 |
| 8 | 1 | 71.8 | 96.2 | 30 / 35 | 6047 |
| 9 | 1 | 72.4 | 94.0 | 30 / 35 | 6743 |
| 10 | 1 | 71.5 | 94.0 | 32 / 35 | 6064 |
| 11 | 1 | 71.0 | 91.7 | 28 / 35 | 6018 |
| 12 | 1 | 72.0 | 92.4 | 30 / 35 | 6661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tvv.nano.Polaris 1.2 | 86 | 92% |
| baal.nano.N 1.42 | 69 | 100% |
| cvt.Firsty 1.0 | 55 | 91% |
| sanja.First 0.1 | 43 | 95% |
| zyx.micro.Ant 1.1 | 43 | 93% |
| amk.Punbot.Punbot 0.01 | 36 | 94% |
| Grystrion.TrackerWO 1.0 | 26 | 100% |
| squidM.TentalceMeleeNano 1.1 | 15 | 100% |
| sample.RamFire 1.0 | 2 | 100% |

Hadur died in 65 of 420 rounds, at a mean tick of 640. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tvv.nano.Polaris 1.2 | 17 | 26% | 107 |
| Grystrion.TrackerWO 1.0 | 10 | 15% | 42 |
| zyx.micro.Ant 1.1 | 8 | 12% | 60 |
| cvt.Firsty 1.0 | 8 | 12% | 45 |
| sanja.First 0.1 | 7 | 11% | 59 |
| baal.nano.N 1.42 | 5 | 8% | 59 |
| amk.Punbot.Punbot 0.01 | 4 | 6% | 11 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 21 |
| sample.RamFire 1.0 | 3 | 5% | 8 |

## Melee bench: F11

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 68.2 | 153 / 420 | 3.86 | 15.2% | 59265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.micro.Figment 1.0 | 1.4 | 15.1% | 125 |
| hadur117.micro.SaorB2 0.1 | 1.6 | 15.2% | 153 |
| cs.Wren 1.0 | 3.5 | 12.3% | 42 |
| js.PinBall 1.6 | 4.0 | 11.5% | 38 |
| mz.Cork 0.1 | 4.7 | 10.8% | 28 |
| joe.ADinosaur 1.0 | 6.0 | 9.5% | 6 |
| evd.X1 0.01 | 7.0 | 8.2% | 2 |
| jsal.Jsalbot 1.0 | 8.0 | 7.0% | 12 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 14 |
| PSW.Relentless 0.1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 72.7 | 15 / 35 | 5327 |
| 2 | 1 | 62.4 | 67.0 | 12 / 35 | 4863 |
| 3 | 2 | 60.4 | 62.9 | 9 / 35 | 4679 |
| 4 | 2 | 60.7 | 62.2 | 13 / 35 | 4706 |
| 5 | 1 | 66.2 | 79.0 | 16 / 35 | 5291 |
| 6 | 2 | 59.8 | 61.9 | 10 / 35 | 4552 |
| 7 | 2 | 62.1 | 67.0 | 10 / 35 | 4866 |
| 8 | 1 | 60.5 | 60.6 | 13 / 35 | 4984 |
| 9 | 2 | 63.8 | 71.1 | 17 / 35 | 4560 |
| 10 | 2 | 63.0 | 70.5 | 13 / 35 | 4706 |
| 11 | 1 | 64.4 | 73.3 | 13 / 35 | 5222 |
| 12 | 2 | 64.0 | 69.8 | 12 / 35 | 5509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 146 | 60% |
| cs.Wren 1.0 | 33 | 91% |
| js.PinBall 1.6 | 16 | 50% |
| mz.Cork 0.1 | 15 | 73% |
| jsal.Jsalbot 1.0 | 9 | 78% |
| donjezza.Jezza 1.0 | 6 | 83% |
| joe.ADinosaur 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 50% |

Hadur died in 267 of 420 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 116 | 43% | 207 |
| joe.ADinosaur 1.0 | 30 | 11% | 34 |
| evd.X1 0.01 | 26 | 10% | 28 |
| cs.Wren 1.0 | 25 | 9% | 51 |
| mz.Cork 0.1 | 24 | 9% | 33 |
| js.PinBall 1.6 | 20 | 7% | 31 |
| PSW.Relentless 0.1 | 17 | 6% | 16 |
| jsal.Jsalbot 1.0 | 5 | 2% | 11 |
| donjezza.Jezza 1.0 | 4 | 1% | 7 |

## Melee bench: F12

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.7 | 275 / 420 | 2.47 | 18.9% | 58305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 18.9% | 275 |
| myl.nano.Graviton 1.10 | 3.1 | 11.4% | 37 |
| ntc.Opposite 1.5 | 3.4 | 11.2% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 36 |
| lrem.micro.SpikeSoldier 0.4 | 4.6 | 10.0% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.7 | 9.4% | 7 |
| disan.Chair 2.2.0 | 6.9 | 8.7% | 15 |
| DBall.NUKE 0.1 | 7.2 | 8.4% | 7 |
| donjezza.Muncho 1.0 | 9.4 | 5.9% | 13 |
| pbg.R2D2 1.0 | 9.6 | 5.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 75.2 | 20 / 35 | 4766 |
| 2 | 1 | 67.0 | 77.1 | 22 / 35 | 5012 |
| 3 | 1 | 67.7 | 83.5 | 22 / 35 | 4574 |
| 4 | 1 | 70.3 | 90.5 | 26 / 35 | 5416 |
| 5 | 1 | 70.0 | 88.9 | 24 / 35 | 5429 |
| 6 | 1 | 68.9 | 84.8 | 23 / 35 | 4948 |
| 7 | 1 | 67.5 | 84.8 | 22 / 35 | 4453 |
| 8 | 1 | 67.1 | 79.7 | 21 / 35 | 4688 |
| 9 | 1 | 69.5 | 87.0 | 26 / 35 | 5215 |
| 10 | 1 | 67.8 | 82.9 | 21 / 35 | 4639 |
| 11 | 1 | 67.6 | 84.1 | 22 / 35 | 4623 |
| 12 | 1 | 68.2 | 85.4 | 26 / 35 | 4542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 67 | 93% |
| stelo.AreaTargetingBot 1.1 | 63 | 83% |
| ntc.Opposite 1.5 | 42 | 88% |
| disan.Chair 2.2.0 | 36 | 89% |
| donjezza.Muncho 1.0 | 27 | 85% |
| DBall.NUKE 0.1 | 26 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 21 | 86% |
| pfvicm.Sobieski 7.2.3b | 14 | 100% |
| pbg.R2D2 1.0 | 10 | 100% |

Hadur died in 145 of 420 rounds, at a mean tick of 580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lrem.micro.SpikeSoldier 0.4 | 28 | 19% | 57 |
| pfvicm.Sobieski 7.2.3b | 27 | 19% | 44 |
| ntc.Opposite 1.5 | 23 | 16% | 56 |
| stelo.AreaTargetingBot 1.1 | 22 | 15% | 79 |
| myl.nano.Graviton 1.10 | 18 | 12% | 75 |
| disan.Chair 2.2.0 | 9 | 6% | 28 |
| donjezza.Muncho 1.0 | 8 | 6% | 28 |
| DBall.NUKE 0.1 | 7 | 5% | 37 |
| pbg.R2D2 1.0 | 3 | 2% | 14 |

## Melee bench: F13

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 70.4 | 168 / 420 | 3.66 | 15.4% | 50823 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.2 | 15.4% | 168 |
| oog.melee.Capulet 1.2 | 2.6 | 14.0% | 99 |
| kawigi.micro.Shiz 1.1 | 2.9 | 13.6% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.6% | 48 |
| yagami.Tidus 0.11 | 4.6 | 12.0% | 17 |
| ejb.Polaris 1.0.1 | 5.9 | 10.9% | 19 |
| stelo.MirrorNano 1.3 | 7.2 | 7.6% | 1 |
| step.nanoPri 1.0 | 7.8 | 6.8% | 2 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 71.7 | 17 / 35 | 4195 |
| 2 | 1 | 65.1 | 75.2 | 16 / 35 | 3981 |
| 3 | 1 | 64.4 | 71.7 | 12 / 35 | 4267 |
| 4 | 1 | 64.5 | 71.1 | 13 / 35 | 4858 |
| 5 | 2 | 60.8 | 58.1 | 12 / 35 | 4288 |
| 6 | 2 | 62.0 | 65.7 | 11 / 35 | 4025 |
| 7 | 1 | 63.7 | 67.3 | 17 / 35 | 4295 |
| 8 | 1 | 63.9 | 72.1 | 14 / 35 | 3947 |
| 9 | 1 | 64.8 | 73.3 | 16 / 35 | 4112 |
| 10 | 1 | 65.9 | 80.3 | 11 / 35 | 4270 |
| 11 | 1 | 64.8 | 71.1 | 16 / 35 | 4528 |
| 12 | 1 | 62.8 | 67.6 | 13 / 35 | 4057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 65 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 80% |
| kawigi.micro.Shiz 1.1 | 48 | 94% |
| yagami.Tidus 0.11 | 38 | 92% |
| ejb.Polaris 1.0.1 | 15 | 60% |
| step.nanoPri 1.0 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 253 of 420 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 97 | 38% | 148 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 15% | 77 |
| yagami.Tidus 0.11 | 34 | 13% | 60 |
| ejb.Polaris 1.0.1 | 31 | 12% | 46 |
| kawigi.micro.Shiz 1.1 | 20 | 8% | 47 |
| stelo.MirrorNano 1.3 | 16 | 6% | 19 |
| kurios.DOSexe .9a | 9 | 4% | 10 |
| step.nanoPri 1.0 | 8 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 79.9 | 260 / 420 | 2.81 | 17.6% | 54603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 17.6% | 260 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 35 |
| wee.Gem 1.8.4 | 3.4 | 11.7% | 59 |
| wompi.Quokka 1.6 | 3.4 | 11.4% | 34 |
| ratosh.Nobo 0.21 | 4.8 | 10.7% | 6 |
| m3thos.Eva00 1.1 | 5.8 | 9.5% | 13 |
| bayen.UbaMicro 1.4 | 6.8 | 8.8% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 8.1 | 7.2% | 3 |
| stelo.MyAgileRobot 0.2 | 9.1 | 5.8% | 2 |
| maribo.FollowFire 1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.2 | 20 / 35 | 4445 |
| 2 | 1 | 67.4 | 80.0 | 22 / 35 | 4973 |
| 3 | 1 | 65.7 | 77.5 | 21 / 35 | 4623 |
| 4 | 1 | 67.4 | 81.6 | 26 / 35 | 4528 |
| 5 | 1 | 66.4 | 80.3 | 22 / 35 | 4438 |
| 6 | 1 | 66.2 | 79.4 | 21 / 35 | 4662 |
| 7 | 1 | 68.0 | 82.9 | 24 / 35 | 4774 |
| 8 | 1 | 66.6 | 84.4 | 23 / 35 | 4232 |
| 9 | 1 | 65.2 | 74.0 | 17 / 35 | 4648 |
| 10 | 1 | 67.8 | 83.2 | 23 / 35 | 4769 |
| 11 | 1 | 65.3 | 77.5 | 21 / 35 | 4169 |
| 12 | 1 | 65.1 | 75.2 | 20 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 96 | 89% |
| wee.Gem 1.8.4 | 64 | 84% |
| wompi.Quokka 1.6 | 63 | 90% |
| ratosh.Nobo 0.21 | 29 | 93% |
| m3thos.Eva00 1.1 | 20 | 85% |
| bayen.UbaMicro 1.4 | 16 | 81% |
| jeremyreeder.Vincent 2011.12.09 | 4 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |

Hadur died in 161 of 420 rounds, at a mean tick of 522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 29 | 18% | 108 |
| wee.Gem 1.8.4 | 23 | 14% | 85 |
| wompi.Quokka 1.6 | 21 | 13% | 60 |
| bayen.UbaMicro 1.4 | 20 | 12% | 33 |
| stelo.MyAgileRobot 0.2 | 16 | 10% | 18 |
| maribo.FollowFire 1 | 16 | 10% | 14 |
| ratosh.Nobo 0.21 | 14 | 9% | 41 |
| m3thos.Eva00 1.1 | 12 | 7% | 39 |
| jeremyreeder.Vincent 2011.12.09 | 10 | 6% | 19 |

## Melee bench: F15

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 82.4 | 126 / 420 | 2.59 | 19.0% | 84866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.2 | 19.6% | 259 |
| hadur117.micro.SaorB2 0.1 | 1.8 | 19.0% | 126 |
| mz.NanoGod 2.02 | 3.0 | 13.9% | 23 |
| ayk.WallHugger 1.0 | 4.7 | 9.7% | 3 |
| exauge.GateKeeper 1.1.121g | 4.8 | 9.5% | 5 |
| stuff.Vlad 0.1 | 5.7 | 8.5% | 1 |
| stelo.PianistNano 1.2 | 6.8 | 7.6% | 3 |
| drd.Dreadknoght 0.9 | 8.0 | 6.0% | 0 |
| sample.SittingDuck 1.0 | 9.3 | 3.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.2 | 87.0 | 12 / 35 | 7346 |
| 2 | 2 | 70.5 | 84.1 | 10 / 35 | 7737 |
| 3 | 2 | 69.1 | 81.3 | 11 / 35 | 6755 |
| 4 | 2 | 66.4 | 72.1 | 6 / 35 | 6231 |
| 5 | 2 | 70.6 | 86.3 | 10 / 35 | 7247 |
| 6 | 2 | 70.2 | 82.5 | 13 / 35 | 6946 |
| 7 | 2 | 70.2 | 85.4 | 9 / 35 | 7444 |
| 8 | 1 | 70.1 | 83.8 | 9 / 35 | 7433 |
| 9 | 2 | 69.5 | 83.8 | 10 / 35 | 6344 |
| 10 | 2 | 69.1 | 76.8 | 11 / 35 | 7179 |
| 11 | 1 | 70.4 | 83.2 | 15 / 35 | 6960 |
| 12 | 2 | 69.8 | 81.9 | 10 / 35 | 7244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 224 | 27% |
| mz.NanoGod 2.02 | 31 | 68% |
| exauge.GateKeeper 1.1.121g | 17 | 94% |
| ayk.WallHugger 1.0 | 11 | 100% |
| drd.Dreadknoght 0.9 | 8 | 100% |
| stelo.PianistNano 1.2 | 5 | 80% |
| stuff.Vlad 0.1 | 4 | 100% |
| sample.SittingDuck 1.0 | 2 | 100% |

Hadur died in 294 of 420 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 203 | 69% | 276 |
| mz.NanoGod 2.02 | 46 | 16% | 72 |
| exauge.GateKeeper 1.1.121g | 17 | 6% | 25 |
| ayk.WallHugger 1.0 | 10 | 3% | 17 |
| stuff.Vlad 0.1 | 10 | 3% | 14 |
| stelo.PianistNano 1.2 | 7 | 2% | 11 |
| drd.Dreadknoght 0.9 | 1 | 0% | 5 |

## Melee bench: F16

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.1 | 233 / 420 | 3.24 | 17.3% | 59896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 17.3% | 233 |
| voidious.micro.BlitzBat 1.05 | 2.2 | 12.8% | 43 |
| dummy.micro.Sparrow 2.5 | 3.4 | 11.9% | 42 |
| bvh.micro.Freya 0.3 | 4.2 | 11.2% | 33 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.4 | 10.8% | 31 |
| stelo.MirrorMicro 1.0 | 6.0 | 8.9% | 11 |
| conscience.Electron 1.3g | 6.9 | 8.1% | 7 |
| ap.Frederick 1.1 | 8.3 | 6.9% | 17 |
| dl.BetterWalls 1.0 | 8.8 | 6.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 73.7 | 17 / 35 | 4761 |
| 2 | 1 | 68.7 | 85.1 | 22 / 35 | 5421 |
| 3 | 1 | 64.5 | 68.6 | 19 / 35 | 5076 |
| 4 | 1 | 66.9 | 78.7 | 22 / 35 | 4989 |
| 5 | 1 | 67.9 | 81.3 | 21 / 35 | 5275 |
| 6 | 1 | 69.0 | 85.1 | 24 / 35 | 5372 |
| 7 | 1 | 65.0 | 72.1 | 19 / 35 | 4744 |
| 8 | 1 | 62.4 | 64.8 | 15 / 35 | 4812 |
| 9 | 1 | 64.8 | 71.7 | 18 / 35 | 4759 |
| 10 | 1 | 64.8 | 71.4 | 20 / 35 | 4798 |
| 11 | 1 | 65.3 | 74.9 | 18 / 35 | 4736 |
| 12 | 1 | 66.1 | 74.3 | 18 / 35 | 5153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 78 | 92% |
| davidalves.net.DuelistMicroMelee 1.4 | 54 | 89% |
| dummy.micro.Sparrow 2.5 | 50 | 86% |
| bvh.micro.Freya 0.3 | 47 | 87% |
| stelo.MirrorMicro 1.0 | 15 | 87% |
| ap.Frederick 1.1 | 13 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 190 of 420 rounds, at a mean tick of 455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| conscience.Electron 1.3g | 38 | 20% | 46 |
| dummy.micro.Sparrow 2.5 | 31 | 16% | 72 |
| mn.nano.perceptual.Impact 1.3.0 | 27 | 14% | 27 |
| voidious.micro.BlitzBat 1.05 | 24 | 13% | 91 |
| bvh.micro.Freya 0.3 | 24 | 13% | 47 |
| davidalves.net.DuelistMicroMelee 1.4 | 23 | 12% | 76 |
| dl.BetterWalls 1.0 | 14 | 7% | 28 |
| stelo.MirrorMicro 1.0 | 9 | 5% | 32 |

## Melee bench: F17

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 86.2 | 302 / 420 | 2.25 | 20.9% | 82126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 20.9% | 302 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 14.5% | 41 |
| sul.Lunar 1.1 | 3.3 | 11.3% | 26 |
| supersample.SuperBoxBot 1.0 | 4.1 | 11.1% | 15 |
| mme.NikeEnhanced 2.0 | 5.3 | 8.8% | 4 |
| dsw.StaticD 1.0 | 5.4 | 8.5% | 14 |
| tlp.ThreeLeggedPig 1 | 7.1 | 7.2% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.5% | 8 |
| sample.MyFirstRobot 1.0 | 9.2 | 5.7% | 6 |
| sample.Corners 1.0 | 9.5 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 92.4 | 29 / 35 | 6833 |
| 2 | 1 | 66.7 | 74.3 | 19 / 35 | 5984 |
| 3 | 1 | 70.7 | 87.9 | 25 / 35 | 6370 |
| 4 | 1 | 73.3 | 92.1 | 28 / 35 | 7463 |
| 5 | 1 | 68.3 | 76.2 | 23 / 35 | 6328 |
| 6 | 1 | 71.6 | 87.9 | 24 / 35 | 7046 |
| 7 | 1 | 70.4 | 84.4 | 25 / 35 | 6549 |
| 8 | 1 | 72.8 | 93.3 | 28 / 35 | 7341 |
| 9 | 1 | 71.1 | 87.3 | 27 / 35 | 6746 |
| 10 | 1 | 72.9 | 90.8 | 29 / 35 | 7468 |
| 11 | 1 | 71.1 | 86.3 | 23 / 35 | 6994 |
| 12 | 1 | 69.9 | 81.0 | 22 / 35 | 7004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 109 | 88% |
| sul.Lunar 1.1 | 81 | 100% |
| supersample.SuperBoxBot 1.0 | 55 | 95% |
| sample.MyFirstJuniorRobot 1.0 | 22 | 95% |
| mme.NikeEnhanced 2.0 | 18 | 100% |
| sample.MyFirstRobot 1.0 | 17 | 94% |
| dsw.StaticD 1.0 | 12 | 50% |
| tlp.ThreeLeggedPig 1 | 6 | 100% |
| sample.Corners 1.0 | 5 | 100% |

Hadur died in 120 of 420 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.TestMelee 0.1 | 38 | 32% | 132 |
| supersample.SuperBoxBot 1.0 | 36 | 30% | 82 |
| dsw.StaticD 1.0 | 18 | 15% | 36 |
| sul.Lunar 1.1 | 8 | 7% | 94 |
| mme.NikeEnhanced 2.0 | 5 | 4% | 25 |
| sample.MyFirstRobot 1.0 | 5 | 4% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 18 |
| sample.Corners 1.0 | 3 | 3% | 12 |
| tlp.ThreeLeggedPig 1 | 3 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorB2 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 79.6 | 229 / 420 | 2.84 | 18.2% | 73475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorB2 0.1 | 1.0 | 18.2% | 229 |
| mld.Wisdom 1.0 | 2.5 | 12.6% | 42 |
| radnor.DoctorBob 1.42 | 2.8 | 12.6% | 44 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.4 | 10.9% | 39 |
| KiraNL.Chupacabra 0.4 | 4.9 | 10.5% | 20 |
| amz.NanoClone 1.41 | 5.4 | 9.9% | 26 |
| sample.Walls 1.0 | 7.3 | 7.6% | 9 |
| GarmBox.Oranges 1.0 | 7.8 | 7.2% | 3 |
| jangs.ns51 1.0 | 8.8 | 6.5% | 8 |
| sample.Target 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 78.7 | 20 / 35 | 5983 |
| 2 | 1 | 66.8 | 78.1 | 18 / 35 | 5898 |
| 3 | 1 | 69.0 | 86.7 | 20 / 35 | 6161 |
| 4 | 1 | 66.6 | 73.3 | 20 / 35 | 6065 |
| 5 | 1 | 65.1 | 74.9 | 15 / 35 | 5715 |
| 6 | 1 | 68.9 | 82.9 | 22 / 35 | 6522 |
| 7 | 1 | 69.1 | 84.4 | 21 / 35 | 6524 |
| 8 | 1 | 68.7 | 80.6 | 22 / 35 | 6563 |
| 9 | 1 | 66.2 | 76.5 | 18 / 35 | 5701 |
| 10 | 1 | 68.3 | 81.9 | 18 / 35 | 6311 |
| 11 | 1 | 65.9 | 74.3 | 16 / 35 | 6153 |
| 12 | 1 | 67.5 | 82.5 | 19 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 89 | 90% |
| radnor.DoctorBob 1.42 | 49 | 76% |
| mld.Wisdom 1.0 | 41 | 76% |
| amz.NanoClone 1.41 | 36 | 69% |
| KiraNL.Chupacabra 0.4 | 22 | 68% |
| jangs.ns51 1.0 | 18 | 89% |
| sample.Walls 1.0 | 14 | 100% |
| GarmBox.Oranges 1.0 | 6 | 83% |
| sample.Target 1.0 | 6 | 100% |

Hadur died in 193 of 420 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 48 | 25% | 99 |
| mld.Wisdom 1.0 | 42 | 22% | 73 |
| KiraNL.Chupacabra 0.4 | 35 | 18% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 15% | 103 |
| amz.NanoClone 1.41 | 21 | 11% | 43 |
| jangs.ns51 1.0 | 9 | 5% | 22 |
| sample.Walls 1.0 | 5 | 3% | 15 |
| GarmBox.Oranges 1.0 | 4 | 2% | 6 |
1 death(s) with no robot to name.

