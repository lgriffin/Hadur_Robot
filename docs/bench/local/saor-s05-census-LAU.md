# Bench suite: micromelee-census.txt

## Melee bench: F01

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 90.2 | 327 / 420 | 1.88 | 21.9% | 87274 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.9% | 327 |
| mz.AntiGrav 1.0 | 2.4 | 14.0% | 24 |
| radnor.DoctorBob 1.42 | 2.8 | 13.5% | 31 |
| mld.Infinity 2.2 | 3.9 | 12.7% | 26 |
| amz.NanoClone 1.41 | 4.9 | 10.3% | 6 |
| GarmBox.Oranges 1.0 | 6.6 | 6.8% | 0 |
| sample.Walls 1.0 | 6.8 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.8 | 6.1% | 3 |
| arthord.MannyPacquiao Beta | 9.3 | 4.3% | 1 |
| sample.Target 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 92.7 | 30 / 35 | 7405 |
| 2 | 1 | 71.0 | 83.5 | 24 / 35 | 6909 |
| 3 | 1 | 73.9 | 95.9 | 33 / 35 | 7166 |
| 4 | 1 | 70.0 | 81.6 | 20 / 35 | 6647 |
| 5 | 1 | 72.2 | 85.1 | 25 / 35 | 7665 |
| 6 | 1 | 73.4 | 92.7 | 28 / 35 | 7199 |
| 7 | 1 | 74.1 | 95.2 | 29 / 35 | 7854 |
| 8 | 1 | 72.4 | 88.3 | 27 / 35 | 7436 |
| 9 | 1 | 73.6 | 94.6 | 27 / 35 | 7319 |
| 10 | 1 | 71.6 | 85.1 | 25 / 35 | 6895 |
| 11 | 1 | 73.2 | 94.0 | 28 / 35 | 7485 |
| 12 | 1 | 73.5 | 93.7 | 31 / 35 | 7294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.AntiGrav 1.0 | 139 | 96% |
| mld.Infinity 2.2 | 95 | 92% |
| radnor.DoctorBob 1.42 | 73 | 85% |
| amz.NanoClone 1.41 | 15 | 93% |
| arthord.MannyPacquiao Beta | 11 | 91% |
| jangs.ns51 1.0 | 9 | 100% |
| sample.Target 1.0 | 5 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| GarmBox.Oranges 1.0 | 2 | 100% |

Hadur died in 93 of 420 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 32 | 34% | 147 |
| mz.AntiGrav 1.0 | 17 | 18% | 152 |
| amz.NanoClone 1.41 | 17 | 18% | 36 |
| mld.Infinity 2.2 | 15 | 16% | 29 |
| GarmBox.Oranges 1.0 | 5 | 5% | 11 |
| arthord.MannyPacquiao Beta | 4 | 4% | 10 |
| sample.Walls 1.0 | 2 | 2% | 16 |
| jangs.ns51 1.0 | 1 | 1% | 12 |

## Melee bench: F02

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.9 | 274 / 420 | 2.18 | 19.1% | 62815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.1 | 19.1% | 274 |
| oog.melee.Mercutio 1.0 | 2.1 | 14.6% | 91 |
| mld.DustBunny 3.8 | 2.8 | 13.1% | 20 |
| maribo.melee.BMV 0.1 | 4.1 | 10.5% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 8.7% | 10 |
| zyx.nano.Ant 1.1 | 6.1 | 8.3% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.1 | 7.4% | 13 |
| fullsail.SweetTea 1.1 | 7.8 | 7.1% | 3 |
| bzdp.BoxCar 2.0 | 8.3 | 6.8% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 98.1 | 30 / 35 | 5859 |
| 2 | 1 | 68.5 | 85.4 | 20 / 35 | 5143 |
| 3 | 1 | 69.2 | 91.1 | 25 / 35 | 4872 |
| 4 | 1 | 70.8 | 95.9 | 26 / 35 | 5749 |
| 5 | 2 | 59.2 | 54.3 | 8 / 35 | 4677 |
| 6 | 1 | 67.4 | 82.2 | 21 / 35 | 5014 |
| 7 | 1 | 70.6 | 95.6 | 28 / 35 | 5237 |
| 8 | 1 | 69.6 | 92.1 | 24 / 35 | 5059 |
| 9 | 1 | 68.1 | 86.0 | 25 / 35 | 5083 |
| 10 | 1 | 68.0 | 78.4 | 15 / 35 | 5702 |
| 11 | 1 | 69.8 | 93.3 | 26 / 35 | 4951 |
| 12 | 1 | 70.1 | 90.8 | 26 / 35 | 5469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 156 | 70% |
| mld.DustBunny 3.8 | 105 | 90% |
| djdjdj.NanoSkunk10 1.0 | 20 | 95% |
| maribo.melee.BMV 0.1 | 19 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| fullsail.SweetTea 1.1 | 14 | 100% |
| zyx.nano.Ant 1.1 | 7 | 86% |
| bzdp.BoxCar 2.0 | 2 | 100% |

Hadur died in 146 of 420 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 63 | 43% | 173 |
| mld.DustBunny 3.8 | 23 | 16% | 106 |
| zyx.nano.Ant 1.1 | 17 | 12% | 23 |
| cs.Grudge 1.0 | 15 | 10% | 15 |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 7% | 28 |
| fullsail.SweetTea 1.1 | 7 | 5% | 21 |
| maribo.melee.BMV 0.1 | 6 | 4% | 21 |
| djdjdj.NanoSkunk10 1.0 | 3 | 2% | 29 |
| bzdp.BoxCar 2.0 | 2 | 1% | 4 |

## Melee bench: F03

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 89.0 | 318 / 420 | 1.99 | 21.2% | 77014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.2% | 318 |
| myl.micro.Troodon 1.10 | 2.0 | 13.3% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.2 | 11.7% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 10.3% | 26 |
| cb.nano.Insomnia 1.0 | 5.1 | 9.6% | 13 |
| fm.mammillarias 1.3 | 5.8 | 9.2% | 3 |
| cs.sheldor.Talon 1.1 | 6.7 | 8.5% | 0 |
| sp.Nanos.Ember 1.1 | 8.0 | 6.8% | 6 |
| sample.Fire 1.0 | 9.3 | 4.9% | 0 |
| sample.Tracker 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 29 / 35 | 6449 |
| 2 | 1 | 72.0 | 92.1 | 29 / 35 | 6461 |
| 3 | 1 | 72.8 | 91.7 | 30 / 35 | 6947 |
| 4 | 1 | 72.5 | 95.2 | 28 / 35 | 6516 |
| 5 | 1 | 69.7 | 80.3 | 23 / 35 | 6344 |
| 6 | 1 | 72.4 | 91.4 | 29 / 35 | 6619 |
| 7 | 1 | 71.7 | 91.1 | 28 / 35 | 6326 |
| 8 | 1 | 70.1 | 83.8 | 23 / 35 | 6216 |
| 9 | 1 | 71.2 | 88.9 | 24 / 35 | 6343 |
| 10 | 1 | 70.9 | 90.2 | 25 / 35 | 6093 |
| 11 | 1 | 68.8 | 81.3 | 22 / 35 | 5800 |
| 12 | 1 | 72.8 | 92.1 | 28 / 35 | 6900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.micro.Troodon 1.10 | 110 | 97% |
| stelo.SoRobotNanoMelee 1.2 | 84 | 87% |
| cb.nano.Insomnia 1.0 | 51 | 92% |
| myl.nano.KomoriNinja 1.1 | 41 | 100% |
| sp.Nanos.Ember 1.1 | 30 | 97% |
| fm.mammillarias 1.3 | 8 | 100% |
| sample.Fire 1.0 | 7 | 100% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| sample.Tracker 1.0 | 1 | 100% |

Hadur died in 103 of 420 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 24% | 82 |
| myl.micro.Troodon 1.10 | 22 | 21% | 135 |
| cb.nano.Insomnia 1.0 | 20 | 19% | 20 |
| myl.nano.KomoriNinja 1.1 | 10 | 10% | 80 |
| fm.mammillarias 1.3 | 9 | 9% | 22 |
| sp.Nanos.Ember 1.1 | 7 | 7% | 40 |
| sample.Fire 1.0 | 4 | 4% | 13 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 21 |
| sample.Tracker 1.0 | 3 | 3% | 3 |

## Melee bench: F04

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 89.3 | 311 / 420 | 1.96 | 21.2% | 79971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.2% | 311 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.2% | 22 |
| tvv.micro.Antares 1.1.1 | 3.0 | 11.6% | 25 |
| tj.zombie1n 1.0.1 | 4.9 | 9.2% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 5.3 | 9.0% | 2 |
| yk.JahMicro 1.0 | 6.3 | 8.2% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.4 | 8.4% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 7.8% | 13 |
| repositorio.NanoStep 1.0 | 8.8 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.0 | 27 / 35 | 6657 |
| 2 | 1 | 71.8 | 91.4 | 27 / 35 | 6812 |
| 3 | 1 | 70.7 | 88.9 | 24 / 35 | 6651 |
| 4 | 1 | 72.7 | 93.7 | 31 / 35 | 6967 |
| 5 | 1 | 72.5 | 92.7 | 28 / 35 | 6899 |
| 6 | 1 | 72.1 | 92.1 | 28 / 35 | 6773 |
| 7 | 1 | 71.0 | 87.6 | 25 / 35 | 6953 |
| 8 | 1 | 69.6 | 83.5 | 24 / 35 | 6289 |
| 9 | 1 | 70.5 | 87.9 | 23 / 35 | 6586 |
| 10 | 1 | 70.7 | 88.9 | 24 / 35 | 6672 |
| 11 | 1 | 70.2 | 87.3 | 24 / 35 | 6336 |
| 12 | 1 | 71.4 | 92.1 | 26 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 136 | 93% |
| stelo.SoJNanoMelee 1.1 | 77 | 91% |
| tvv.micro.Antares 1.1.1 | 37 | 86% |
| tj.zombie1n 1.0.1 | 30 | 87% |
| ers.nano.hawk.HawkLA 3.0m | 26 | 69% |
| yk.JahMicro 1.0 | 18 | 72% |
| Grystrion.RandomTrackerNOREV 1.0 | 14 | 100% |
| repositorio.NanoStep 1.0 | 11 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 109 of 420 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 34 | 31% | 156 |
| stelo.SoJNanoMelee 1.1 | 21 | 19% | 65 |
| tvv.micro.Antares 1.1.1 | 15 | 14% | 51 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 9% | 39 |
| tj.zombie1n 1.0.1 | 10 | 9% | 26 |
| Grystrion.RandomTrackerNOREV 1.0 | 9 | 8% | 22 |
| yk.JahMicro 1.0 | 9 | 8% | 19 |
| repositorio.NanoStep 1.0 | 1 | 1% | 24 |
| sample.VelociRobot 1.0 | 0 | 0% | 15 |

## Melee bench: F05

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 73.2 | 216 / 420 | 3.41 | 16.6% | 59487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 16.6% | 216 |
| oog.melee.Corsair 1.0 | 2.0 | 12.7% | 67 |
| ahf.NanoAndrew .4 | 3.7 | 11.5% | 58 |
| simonton.nano.MeleeSeed 1.8 | 4.2 | 10.7% | 24 |
| EBBU.Sim2 1.02 | 5.4 | 9.7% | 11 |
| sam.Samspin 1.0 | 5.5 | 9.9% | 23 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 8.7% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 8.7% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.0 | 6.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.1 | 19 / 35 | 5313 |
| 2 | 1 | 65.9 | 73.7 | 20 / 35 | 5106 |
| 3 | 1 | 63.7 | 71.7 | 18 / 35 | 4767 |
| 4 | 1 | 64.0 | 72.1 | 15 / 35 | 4829 |
| 5 | 1 | 64.4 | 73.3 | 17 / 35 | 4969 |
| 6 | 1 | 66.7 | 79.4 | 22 / 35 | 5275 |
| 7 | 1 | 65.0 | 75.6 | 15 / 35 | 4968 |
| 8 | 1 | 59.5 | 57.5 | 13 / 35 | 4363 |
| 9 | 1 | 66.2 | 75.6 | 22 / 35 | 4962 |
| 10 | 1 | 66.6 | 76.2 | 22 / 35 | 5405 |
| 11 | 1 | 64.2 | 71.4 | 16 / 35 | 5058 |
| 12 | 1 | 64.3 | 74.0 | 17 / 35 | 4472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.nano.MeleeSeed 1.8 | 84 | 92% |
| oog.melee.Corsair 1.0 | 74 | 61% |
| ahf.NanoAndrew .4 | 41 | 78% |
| EBBU.Sim2 1.02 | 26 | 96% |
| sam.Samspin 1.0 | 16 | 100% |
| zyx.nano.BacillusComma 1.0 | 12 | 75% |
| robar.nano.Assertive_Melee 0.2 | 9 | 89% |
| sample.TrackFire 1.0 | 3 | 100% |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 100% |

Hadur died in 204 of 420 rounds, at a mean tick of 447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Corsair 1.0 | 51 | 25% | 109 |
| simonton.nano.MeleeSeed 1.8 | 30 | 15% | 87 |
| zyx.nano.BacillusComma 1.0 | 28 | 14% | 36 |
| bwbaugh.nano.Tirunculus 0.0.0a | 26 | 13% | 28 |
| robar.nano.Assertive_Melee 0.2 | 22 | 11% | 33 |
| ahf.NanoAndrew .4 | 18 | 9% | 67 |
| EBBU.Sim2 1.02 | 15 | 7% | 32 |
| sam.Samspin 1.0 | 7 | 3% | 16 |
| sample.TrackFire 1.0 | 7 | 3% | 10 |

## Melee bench: F06

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 300 / 420 | 1.99 | 19.9% | 65901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.9% | 300 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 41 |
| gh.nano.Grofvuil 0.2 | 3.1 | 11.9% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 9.7% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.8% | 11 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.2% | 3 |
| fm.claire 1.7 | 6.7 | 8.1% | 1 |
| sample.SpinBot 1.0 | 7.8 | 7.3% | 5 |
| pa.Improved 1.0 | 8.9 | 6.1% | 2 |
| kurios.DOSexe .9b | 9.6 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 20 / 35 | 5597 |
| 2 | 1 | 69.8 | 87.3 | 28 / 35 | 5528 |
| 3 | 1 | 70.5 | 91.1 | 27 / 35 | 5412 |
| 4 | 1 | 69.2 | 85.4 | 26 / 35 | 5283 |
| 5 | 1 | 67.9 | 82.2 | 20 / 35 | 5311 |
| 6 | 1 | 69.9 | 91.4 | 25 / 35 | 5405 |
| 7 | 1 | 68.9 | 85.1 | 24 / 35 | 5668 |
| 8 | 1 | 70.7 | 92.4 | 28 / 35 | 5551 |
| 9 | 1 | 70.5 | 91.7 | 25 / 35 | 5708 |
| 10 | 1 | 69.3 | 87.9 | 25 / 35 | 5596 |
| 11 | 1 | 70.9 | 94.0 | 27 / 35 | 5513 |
| 12 | 1 | 70.0 | 91.4 | 25 / 35 | 5329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 146 | 95% |
| oog.melee.CapuletDroid 1.1 | 76 | 80% |
| gh.nano.Grofvuil 0.2 | 41 | 85% |
| arthord.NanoSatanMelee Beta | 22 | 100% |
| winamp32.micro.MicroMacro 1.0 | 17 | 76% |
| sample.SpinBot 1.0 | 15 | 87% |
| kurios.DOSexe .9b | 9 | 89% |
| fm.claire 1.7 | 9 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 121 of 420 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 25% | 158 |
| oog.melee.CapuletDroid 1.1 | 29 | 24% | 47 |
| gh.nano.Grofvuil 0.2 | 21 | 17% | 79 |
| sample.SpinBot 1.0 | 11 | 9% | 19 |
| winamp32.micro.MicroMacro 1.0 | 9 | 7% | 36 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 30 |
| kurios.DOSexe .9b | 5 | 4% | 26 |
| fm.claire 1.7 | 4 | 3% | 12 |
| pa.Improved 1.0 | 3 | 2% | 9 |

## Melee bench: F07

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.3 | 223 / 420 | 2.33 | 18.9% | 69540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.9% | 223 |
| gh.micro.Gruweltje 0.7 | 2.3 | 14.9% | 90 |
| spinnercat.micro.Tyger 0.1 | 3.2 | 13.2% | 30 |
| mz.MicroGodMelee 1 | 3.6 | 13.0% | 60 |
| DBall.Anarchy 0.1 | 5.3 | 8.5% | 13 |
| caimano.Furia_Ceca 0.22 | 6.0 | 7.5% | 1 |
| el.JumpShoot 0.2 | 7.9 | 6.2% | 2 |
| acogdev.alpha 0.2 | 8.3 | 6.1% | 1 |
| fire219.CatBot 1.0 | 8.3 | 6.0% | 0 |
| mbro.Detektor3 0.1.1 | 9.2 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.1 | 14 / 35 | 5328 |
| 2 | 1 | 68.4 | 85.7 | 20 / 35 | 5205 |
| 3 | 1 | 68.6 | 85.7 | 16 / 35 | 5865 |
| 4 | 1 | 69.5 | 87.3 | 24 / 35 | 5586 |
| 5 | 1 | 68.6 | 83.8 | 21 / 35 | 5836 |
| 6 | 1 | 68.9 | 85.7 | 18 / 35 | 6103 |
| 7 | 1 | 69.4 | 87.6 | 17 / 35 | 6156 |
| 8 | 1 | 69.6 | 89.2 | 19 / 35 | 5743 |
| 9 | 1 | 67.7 | 82.5 | 14 / 35 | 5692 |
| 10 | 1 | 68.4 | 84.8 | 16 / 35 | 5859 |
| 11 | 1 | 68.8 | 84.4 | 21 / 35 | 5936 |
| 12 | 1 | 70.5 | 89.2 | 23 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| spinnercat.micro.Tyger 0.1 | 104 | 91% |
| mz.MicroGodMelee 1 | 89 | 57% |
| gh.micro.Gruweltje 0.7 | 70 | 37% |
| DBall.Anarchy 0.1 | 33 | 100% |
| el.JumpShoot 0.2 | 7 | 86% |
| mbro.Detektor3 0.1.1 | 6 | 100% |
| acogdev.alpha 0.2 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 197 of 420 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.MicroGodMelee 1 | 85 | 43% | 151 |
| gh.micro.Gruweltje 0.7 | 63 | 32% | 98 |
| spinnercat.micro.Tyger 0.1 | 28 | 14% | 103 |
| acogdev.alpha 0.2 | 6 | 3% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 3% | 7 |
| DBall.Anarchy 0.1 | 3 | 2% | 27 |
| fire219.CatBot 1.0 | 3 | 2% | 5 |
| el.JumpShoot 0.2 | 2 | 1% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 10 |

## Melee bench: F08

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 72.9 | 236 / 420 | 3.44 | 16.9% | 62938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.3 | 16.9% | 236 |
| simonton.micro.Sprout 1.1.3 | 1.9 | 15.1% | 70 |
| simonton.nano.WeekendObsession_Melee 1.0 | 2.8 | 13.0% | 46 |
| qualidafial.MajorDick 1.0.1 | 4.9 | 9.4% | 12 |
| germ.TheMind .2 | 5.3 | 9.3% | 14 |
| awesomeness.Elite 1.0 | 6.4 | 8.6% | 16 |
| lrem.micro.MoggFanatic 0.2 | 6.8 | 8.4% | 2 |
| stelo.UntouchableNano 1.3 | 6.9 | 8.2% | 16 |
| sample.Crazy 1.0 | 8.7 | 7.1% | 5 |
| mym.EdgeStalker 1.0 | 10.0 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 64.8 | 18 / 35 | 4911 |
| 2 | 1 | 67.1 | 81.0 | 22 / 35 | 4951 |
| 3 | 1 | 68.0 | 77.8 | 24 / 35 | 5884 |
| 4 | 1 | 65.0 | 70.2 | 20 / 35 | 5302 |
| 5 | 2 | 62.6 | 65.4 | 14 / 35 | 4908 |
| 6 | 2 | 62.5 | 61.3 | 11 / 35 | 5231 |
| 7 | 1 | 65.3 | 69.8 | 18 / 35 | 5242 |
| 8 | 1 | 65.7 | 75.9 | 21 / 35 | 5156 |
| 9 | 1 | 70.7 | 92.1 | 26 / 35 | 5612 |
| 10 | 1 | 67.4 | 77.8 | 22 / 35 | 5613 |
| 11 | 1 | 66.6 | 76.2 | 22 / 35 | 5289 |
| 12 | 1 | 62.5 | 62.5 | 18 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 156 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 46 | 85% |
| qualidafial.MajorDick 1.0.1 | 24 | 96% |
| germ.TheMind .2 | 18 | 83% |
| awesomeness.Elite 1.0 | 11 | 91% |
| stelo.UntouchableNano 1.3 | 10 | 70% |
| sample.Crazy 1.0 | 7 | 100% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 184 of 420 rounds, at a mean tick of 409. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 41% | 195 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 15% | 70 |
| awesomeness.Elite 1.0 | 20 | 11% | 42 |
| germ.TheMind .2 | 15 | 8% | 31 |
| stelo.UntouchableNano 1.3 | 14 | 8% | 21 |
| qualidafial.MajorDick 1.0.1 | 12 | 7% | 21 |
| lrem.micro.MoggFanatic 0.2 | 11 | 6% | 21 |
| mym.EdgeStalker 1.0 | 8 | 4% | 10 |
| sample.Crazy 1.0 | 0 | 0% | 7 |

## Melee bench: F09

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.0 | 321 / 420 | 1.99 | 20.2% | 60288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 20.2% | 321 |
| rz.HawkOnFire 0.1 | 2.1 | 13.8% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.8% | 20 |
| maribo.IotaCT 1.1 | 4.8 | 10.4% | 12 |
| timmit.nano.TimDog 0.33 | 5.0 | 9.9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 3 |
| ratosh.Wesco 1.4 | 7.6 | 7.9% | 4 |
| spinnercat.Omen 1.0 | 7.9 | 7.7% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 7.7% | 13 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 90.2 | 27 / 35 | 4808 |
| 2 | 1 | 68.2 | 81.9 | 23 / 35 | 4308 |
| 3 | 1 | 69.6 | 85.4 | 28 / 35 | 4828 |
| 4 | 1 | 71.4 | 94.0 | 28 / 35 | 5031 |
| 5 | 1 | 71.1 | 91.1 | 28 / 35 | 4943 |
| 6 | 1 | 70.5 | 91.1 | 26 / 35 | 5016 |
| 7 | 1 | 71.6 | 91.1 | 30 / 35 | 5403 |
| 8 | 1 | 70.9 | 88.3 | 28 / 35 | 5234 |
| 9 | 1 | 72.0 | 93.0 | 29 / 35 | 5260 |
| 10 | 1 | 68.9 | 81.6 | 22 / 35 | 4926 |
| 11 | 1 | 70.5 | 88.9 | 26 / 35 | 5142 |
| 12 | 1 | 71.3 | 91.1 | 26 / 35 | 5389 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.HawkOnFire 0.1 | 153 | 97% |
| nz.jdc.nano.GridFu 1.0 | 70 | 96% |
| maribo.IotaCT 1.1 | 28 | 96% |
| timmit.nano.TimDog 0.33 | 25 | 84% |
| stelo.PatternRobot 1.0 | 18 | 94% |
| ratosh.Wesco 1.4 | 16 | 94% |
| dmh.robocode.robot.RedDwarf 0.4 | 14 | 100% |
| spinnercat.Omen 1.0 | 12 | 100% |

Hadur died in 99 of 420 rounds, at a mean tick of 549. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| timmit.nano.TimDog 0.33 | 31 | 31% | 60 |
| rz.HawkOnFire 0.1 | 15 | 15% | 122 |
| nz.jdc.nano.GridFu 1.0 | 13 | 13% | 90 |
| stelo.PatternRobot 1.0 | 13 | 13% | 29 |
| ratosh.Wesco 1.4 | 10 | 10% | 35 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 9% | 18 |
| maribo.IotaCT 1.1 | 8 | 8% | 50 |
| spinnercat.Omen 1.0 | 0 | 0% | 13 |

## Melee bench: F10

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.9 | 352 / 420 | 1.73 | 21.5% | 77034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.5% | 352 |
| baal.nano.N 1.42 | 2.5 | 11.6% | 7 |
| tvv.nano.Polaris 1.2 | 2.8 | 11.3% | 21 |
| Grystrion.TrackerWO 1.0 | 4.7 | 9.6% | 2 |
| zyx.micro.Ant 1.1 | 4.9 | 9.4% | 18 |
| squidM.TentalceMeleeNano 1.1 | 6.7 | 8.4% | 4 |
| sanja.First 0.1 | 6.8 | 8.2% | 4 |
| cvt.Firsty 1.0 | 7.5 | 7.5% | 11 |
| amk.Punbot.Punbot 0.01 | 8.2 | 7.3% | 2 |
| sample.RamFire 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 89.8 | 27 / 35 | 6499 |
| 2 | 1 | 71.8 | 93.7 | 31 / 35 | 6367 |
| 3 | 1 | 72.6 | 95.9 | 29 / 35 | 7015 |
| 4 | 1 | 71.7 | 90.8 | 30 / 35 | 6532 |
| 5 | 1 | 72.5 | 95.6 | 32 / 35 | 6630 |
| 6 | 1 | 71.6 | 93.7 | 31 / 35 | 6406 |
| 7 | 1 | 71.7 | 96.8 | 29 / 35 | 6179 |
| 8 | 1 | 71.7 | 94.9 | 31 / 35 | 6353 |
| 9 | 1 | 70.5 | 87.6 | 28 / 35 | 6075 |
| 10 | 1 | 71.4 | 90.8 | 29 / 35 | 6547 |
| 11 | 1 | 70.2 | 86.7 | 28 / 35 | 6174 |
| 12 | 1 | 70.5 | 86.7 | 27 / 35 | 6257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| baal.nano.N 1.42 | 71 | 97% |
| tvv.nano.Polaris 1.2 | 66 | 95% |
| cvt.Firsty 1.0 | 65 | 95% |
| sanja.First 0.1 | 49 | 100% |
| zyx.micro.Ant 1.1 | 45 | 93% |
| amk.Punbot.Punbot 0.01 | 28 | 96% |
| Grystrion.TrackerWO 1.0 | 25 | 92% |
| squidM.TentalceMeleeNano 1.1 | 15 | 93% |
| sample.RamFire 1.0 | 3 | 100% |

Hadur died in 70 of 420 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.micro.Ant 1.1 | 15 | 21% | 63 |
| Grystrion.TrackerWO 1.0 | 13 | 19% | 38 |
| baal.nano.N 1.42 | 12 | 17% | 81 |
| tvv.nano.Polaris 1.2 | 7 | 10% | 90 |
| amk.Punbot.Punbot 0.01 | 7 | 10% | 17 |
| cvt.Firsty 1.0 | 6 | 9% | 54 |
| sample.RamFire 1.0 | 5 | 7% | 8 |
| sanja.First 0.1 | 3 | 4% | 39 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 17 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 69.1 | 164 / 420 | 3.78 | 15.6% | 61866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.4 | 15.6% | 164 |
| kc.micro.Figment 1.0 | 1.7 | 15.1% | 135 |
| cs.Wren 1.0 | 3.4 | 12.5% | 33 |
| mz.Cork 0.1 | 4.1 | 11.4% | 37 |
| js.PinBall 1.6 | 4.6 | 11.2% | 34 |
| joe.ADinosaur 1.0 | 5.9 | 9.5% | 4 |
| evd.X1 0.01 | 6.9 | 8.1% | 6 |
| jsal.Jsalbot 1.0 | 8.1 | 6.7% | 7 |
| donjezza.Jezza 1.0 | 9.2 | 5.4% | 2 |
| PSW.Relentless 0.1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 63.2 | 15 / 35 | 4562 |
| 2 | 2 | 60.9 | 61.0 | 13 / 35 | 5067 |
| 3 | 1 | 64.6 | 72.7 | 14 / 35 | 5311 |
| 4 | 1 | 66.1 | 76.8 | 21 / 35 | 5227 |
| 5 | 1 | 62.3 | 66.0 | 9 / 35 | 5268 |
| 6 | 1 | 62.9 | 64.4 | 12 / 35 | 5283 |
| 7 | 1 | 64.8 | 73.7 | 14 / 35 | 5390 |
| 8 | 1 | 64.3 | 72.1 | 14 / 35 | 5246 |
| 9 | 2 | 62.1 | 65.4 | 12 / 35 | 5277 |
| 10 | 2 | 58.8 | 61.3 | 8 / 35 | 4318 |
| 11 | 1 | 67.9 | 81.6 | 20 / 35 | 5567 |
| 12 | 2 | 64.7 | 71.4 | 12 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.micro.Figment 1.0 | 146 | 57% |
| cs.Wren 1.0 | 34 | 97% |
| mz.Cork 0.1 | 18 | 78% |
| js.PinBall 1.6 | 15 | 100% |
| jsal.Jsalbot 1.0 | 9 | 67% |
| joe.ADinosaur 1.0 | 7 | 86% |
| donjezza.Jezza 1.0 | 6 | 83% |
| evd.X1 0.01 | 2 | 100% |

Hadur died in 257 of 420 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.micro.Figment 1.0 | 113 | 44% | 202 |
| evd.X1 0.01 | 31 | 12% | 36 |
| joe.ADinosaur 1.0 | 30 | 12% | 34 |
| cs.Wren 1.0 | 25 | 10% | 44 |
| mz.Cork 0.1 | 22 | 9% | 34 |
| js.PinBall 1.6 | 16 | 6% | 37 |
| PSW.Relentless 0.1 | 10 | 4% | 10 |
| jsal.Jsalbot 1.0 | 7 | 3% | 15 |
| donjezza.Jezza 1.0 | 3 | 1% | 8 |

## Melee bench: F12

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.4 | 281 / 420 | 2.40 | 19.1% | 59166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.1% | 281 |
| myl.nano.Graviton 1.10 | 2.5 | 11.9% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.3% | 8 |
| ntc.Opposite 1.5 | 4.2 | 10.5% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 10.2% | 22 |
| pfvicm.Sobieski 7.2.3b | 4.9 | 9.9% | 14 |
| disan.Chair 2.2.0 | 7.2 | 8.2% | 11 |
| DBall.NUKE 0.1 | 7.3 | 8.3% | 13 |
| donjezza.Muncho 1.0 | 9.2 | 6.3% | 21 |
| pbg.R2D2 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.1 | 20 / 35 | 5054 |
| 2 | 1 | 66.4 | 76.2 | 17 / 35 | 5371 |
| 3 | 1 | 69.2 | 87.6 | 27 / 35 | 4749 |
| 4 | 1 | 70.5 | 91.4 | 27 / 35 | 5120 |
| 5 | 1 | 67.2 | 80.3 | 22 / 35 | 4493 |
| 6 | 1 | 68.1 | 82.2 | 25 / 35 | 4769 |
| 7 | 1 | 64.9 | 72.1 | 18 / 35 | 4747 |
| 8 | 1 | 68.7 | 86.3 | 24 / 35 | 4868 |
| 9 | 1 | 68.4 | 86.7 | 23 / 35 | 4635 |
| 10 | 1 | 70.2 | 89.2 | 26 / 35 | 5446 |
| 11 | 1 | 69.1 | 87.3 | 27 / 35 | 4571 |
| 12 | 1 | 69.8 | 89.2 | 25 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| myl.nano.Graviton 1.10 | 85 | 91% |
| stelo.AreaTargetingBot 1.1 | 79 | 90% |
| ntc.Opposite 1.5 | 33 | 91% |
| DBall.NUKE 0.1 | 32 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 30 | 93% |
| disan.Chair 2.2.0 | 21 | 90% |
| donjezza.Muncho 1.0 | 21 | 57% |
| pfvicm.Sobieski 7.2.3b | 8 | 63% |
| pbg.R2D2 1.0 | 8 | 88% |

Hadur died in 142 of 420 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.AreaTargetingBot 1.1 | 25 | 18% | 75 |
| pfvicm.Sobieski 7.2.3b | 25 | 18% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 15% | 55 |
| ntc.Opposite 1.5 | 20 | 14% | 50 |
| myl.nano.Graviton 1.10 | 19 | 13% | 81 |
| donjezza.Muncho 1.0 | 12 | 8% | 24 |
| pbg.R2D2 1.0 | 7 | 5% | 30 |
| disan.Chair 2.2.0 | 7 | 5% | 27 |
| DBall.NUKE 0.1 | 6 | 4% | 36 |

## Melee bench: F13

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.7 | 181 / 420 | 3.55 | 15.8% | 52471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.3 | 15.8% | 181 |
| kawigi.micro.Shiz 1.1 | 2.4 | 13.9% | 77 |
| oog.melee.Capulet 1.2 | 2.6 | 14.0% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 34 |
| yagami.Tidus 0.11 | 4.6 | 11.8% | 24 |
| ejb.Polaris 1.0.1 | 5.8 | 10.5% | 19 |
| stelo.MirrorNano 1.3 | 7.5 | 7.2% | 0 |
| step.nanoPri 1.0 | 7.5 | 7.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 71.7 | 14 / 35 | 4278 |
| 2 | 1 | 63.4 | 68.3 | 13 / 35 | 4180 |
| 3 | 1 | 66.6 | 74.6 | 20 / 35 | 5003 |
| 4 | 2 | 60.9 | 61.3 | 12 / 35 | 4128 |
| 5 | 1 | 64.8 | 74.0 | 11 / 35 | 4550 |
| 6 | 2 | 63.1 | 68.3 | 13 / 35 | 4062 |
| 7 | 2 | 63.4 | 66.3 | 14 / 35 | 4153 |
| 8 | 2 | 62.4 | 66.0 | 13 / 35 | 3912 |
| 9 | 1 | 67.3 | 80.6 | 22 / 35 | 4438 |
| 10 | 1 | 67.5 | 81.9 | 17 / 35 | 4722 |
| 11 | 1 | 63.6 | 69.5 | 15 / 35 | 4187 |
| 12 | 1 | 67.4 | 78.1 | 17 / 35 | 4858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 69 | 68% |
| kawigi.micro.Shiz 1.1 | 54 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 93% |
| yagami.Tidus 0.11 | 31 | 97% |
| ejb.Polaris 1.0.1 | 18 | 56% |
| stelo.MirrorNano 1.3 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 240 of 420 rounds, at a mean tick of 623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 98 | 41% | 158 |
| yagami.Tidus 0.11 | 34 | 14% | 60 |
| kawigi.micro.Shiz 1.1 | 28 | 12% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 10% | 64 |
| ejb.Polaris 1.0.1 | 23 | 10% | 43 |
| stelo.MirrorNano 1.3 | 12 | 5% | 13 |
| kurios.DOSexe .9a | 11 | 5% | 11 |
| step.nanoPri 1.0 | 11 | 5% | 11 |

## Melee bench: F14

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.9 | 279 / 420 | 2.72 | 18.0% | 56125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 18.0% | 279 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 21 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 57 |
| wompi.Quokka 1.6 | 3.8 | 11.4% | 34 |
| ratosh.Nobo 0.21 | 4.5 | 10.8% | 11 |
| m3thos.Eva00 1.1 | 5.3 | 10.1% | 13 |
| bayen.UbaMicro 1.4 | 7.1 | 8.4% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 8.3 | 6.8% | 1 |
| stelo.MyAgileRobot 0.2 | 9.0 | 5.8% | 1 |
| maribo.FollowFire 1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 78.7 | 22 / 35 | 4290 |
| 2 | 1 | 65.0 | 74.0 | 20 / 35 | 4383 |
| 3 | 1 | 67.9 | 82.5 | 23 / 35 | 4941 |
| 4 | 1 | 65.2 | 76.8 | 21 / 35 | 4339 |
| 5 | 1 | 68.2 | 82.2 | 26 / 35 | 4902 |
| 6 | 1 | 67.9 | 83.5 | 24 / 35 | 4679 |
| 7 | 1 | 69.0 | 86.3 | 26 / 35 | 5232 |
| 8 | 1 | 69.3 | 91.1 | 27 / 35 | 4808 |
| 9 | 1 | 67.9 | 82.9 | 26 / 35 | 4673 |
| 10 | 1 | 67.1 | 80.6 | 24 / 35 | 4988 |
| 11 | 1 | 63.1 | 71.4 | 17 / 35 | 4177 |
| 12 | 1 | 66.9 | 80.3 | 23 / 35 | 4713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 100 | 97% |
| wee.Gem 1.8.4 | 83 | 90% |
| wompi.Quokka 1.6 | 45 | 80% |
| ratosh.Nobo 0.21 | 33 | 97% |
| m3thos.Eva00 1.1 | 20 | 100% |
| bayen.UbaMicro 1.4 | 12 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 5 | 100% |
| stelo.MyAgileRobot 0.2 | 2 | 100% |

Hadur died in 144 of 420 rounds, at a mean tick of 482. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 26 | 18% | 96 |
| maribo.FollowFire 1 | 24 | 17% | 25 |
| wompi.Quokka 1.6 | 23 | 16% | 62 |
| ratosh.Nobo 0.21 | 15 | 10% | 37 |
| bzdp.Pansy 2.1 | 14 | 10% | 95 |
| jeremyreeder.Vincent 2011.12.09 | 13 | 9% | 23 |
| stelo.MyAgileRobot 0.2 | 13 | 9% | 20 |
| m3thos.Eva00 1.1 | 10 | 7% | 36 |
| bayen.UbaMicro 1.4 | 5 | 3% | 22 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 84.2 | 160 / 420 | 2.42 | 20.1% | 94831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.3 | 20.1% | 160 |
| wompi.Wallaby 5.1 | 1.8 | 19.4% | 232 |
| mz.NanoGod 2.02 | 3.0 | 13.6% | 16 |
| ayk.WallHugger 1.0 | 4.3 | 9.8% | 1 |
| exauge.GateKeeper 1.1.121g | 5.1 | 9.0% | 6 |
| stuff.Vlad 0.1 | 5.8 | 8.5% | 2 |
| stelo.PianistNano 1.2 | 7.0 | 7.3% | 3 |
| drd.Dreadknoght 0.9 | 7.8 | 5.9% | 0 |
| sample.SittingDuck 1.0 | 9.1 | 3.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.9 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 84.1 | 13 / 35 | 7726 |
| 2 | 1 | 71.0 | 83.5 | 15 / 35 | 8102 |
| 3 | 1 | 71.3 | 84.4 | 16 / 35 | 7586 |
| 4 | 2 | 70.1 | 80.3 | 10 / 35 | 7940 |
| 5 | 1 | 72.1 | 87.6 | 16 / 35 | 8179 |
| 6 | 1 | 71.5 | 85.4 | 14 / 35 | 7742 |
| 7 | 1 | 71.3 | 82.2 | 15 / 35 | 8070 |
| 8 | 1 | 73.0 | 89.2 | 16 / 35 | 8500 |
| 9 | 2 | 71.2 | 83.8 | 11 / 35 | 7852 |
| 10 | 1 | 72.2 | 87.0 | 15 / 35 | 8095 |
| 11 | 2 | 68.7 | 78.1 | 7 / 35 | 7047 |
| 12 | 1 | 71.1 | 85.1 | 12 / 35 | 7992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 225 | 38% |
| mz.NanoGod 2.02 | 39 | 77% |
| exauge.GateKeeper 1.1.121g | 19 | 84% |
| drd.Dreadknoght 0.9 | 10 | 100% |
| ayk.WallHugger 1.0 | 8 | 100% |
| stelo.PianistNano 1.2 | 6 | 83% |
| sample.SittingDuck 1.0 | 4 | 100% |
| stuff.Vlad 0.1 | 3 | 67% |

Hadur died in 260 of 420 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 182 | 70% | 279 |
| mz.NanoGod 2.02 | 45 | 17% | 77 |
| exauge.GateKeeper 1.1.121g | 10 | 4% | 21 |
| ayk.WallHugger 1.0 | 10 | 4% | 18 |
| stelo.PianistNano 1.2 | 9 | 3% | 9 |
| stuff.Vlad 0.1 | 3 | 1% | 10 |
| drd.Dreadknoght 0.9 | 1 | 0% | 6 |

## Melee bench: F16

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.6 | 252 / 420 | 3.11 | 17.5% | 58907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 17.5% | 252 |
| voidious.micro.BlitzBat 1.05 | 2.4 | 12.8% | 36 |
| dummy.micro.Sparrow 2.5 | 3.6 | 11.6% | 32 |
| bvh.micro.Freya 0.3 | 3.8 | 11.4% | 28 |
| davidalves.net.DuelistMicroMelee 1.4 | 4.5 | 10.6% | 32 |
| stelo.MirrorMicro 1.0 | 5.8 | 9.5% | 18 |
| conscience.Electron 1.3g | 7.2 | 7.9% | 4 |
| dl.BetterWalls 1.0 | 8.5 | 6.6% | 6 |
| ap.Frederick 1.1 | 8.6 | 6.6% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 73.0 | 19 / 35 | 4903 |
| 2 | 1 | 68.2 | 85.7 | 23 / 35 | 5023 |
| 3 | 1 | 62.8 | 67.9 | 17 / 35 | 4237 |
| 4 | 1 | 64.8 | 71.1 | 20 / 35 | 4621 |
| 5 | 1 | 64.8 | 72.1 | 20 / 35 | 4707 |
| 6 | 1 | 68.2 | 82.5 | 20 / 35 | 5243 |
| 7 | 1 | 64.4 | 70.5 | 20 / 35 | 4787 |
| 8 | 1 | 64.5 | 69.5 | 19 / 35 | 4850 |
| 9 | 1 | 68.1 | 83.5 | 23 / 35 | 5123 |
| 10 | 1 | 67.1 | 79.0 | 23 / 35 | 5041 |
| 11 | 1 | 67.7 | 81.0 | 23 / 35 | 5189 |
| 12 | 1 | 68.1 | 83.2 | 25 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 78 | 95% |
| dummy.micro.Sparrow 2.5 | 63 | 92% |
| bvh.micro.Freya 0.3 | 49 | 96% |
| davidalves.net.DuelistMicroMelee 1.4 | 48 | 81% |
| ap.Frederick 1.1 | 16 | 100% |
| stelo.MirrorMicro 1.0 | 13 | 77% |
| conscience.Electron 1.3g | 3 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 171 of 420 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 32 | 19% | 31 |
| voidious.micro.BlitzBat 1.05 | 28 | 16% | 90 |
| dummy.micro.Sparrow 2.5 | 25 | 15% | 82 |
| davidalves.net.DuelistMicroMelee 1.4 | 24 | 14% | 77 |
| conscience.Electron 1.3g | 24 | 14% | 36 |
| bvh.micro.Freya 0.3 | 14 | 8% | 44 |
| stelo.MirrorMicro 1.0 | 12 | 7% | 31 |
| dl.BetterWalls 1.0 | 12 | 7% | 28 |

## Melee bench: F17

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 90.1 | 329 / 420 | 1.89 | 21.9% | 86106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 21.9% | 329 |
| sheldor.melee.nano.TestMelee 0.1 | 2.1 | 13.6% | 34 |
| sul.Lunar 1.1 | 3.2 | 11.4% | 11 |
| supersample.SuperBoxBot 1.0 | 4.0 | 10.7% | 24 |
| mme.NikeEnhanced 2.0 | 5.1 | 9.6% | 5 |
| dsw.StaticD 1.0 | 5.8 | 8.6% | 9 |
| tlp.ThreeLeggedPig 1 | 7.3 | 6.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.2 | 6.3% | 4 |
| sample.MyFirstRobot 1.0 | 9.1 | 5.6% | 6 |
| sample.Corners 1.0 | 9.3 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 88.6 | 27 / 35 | 7142 |
| 2 | 1 | 71.1 | 86.7 | 26 / 35 | 7115 |
| 3 | 1 | 71.6 | 87.3 | 26 / 35 | 7140 |
| 4 | 1 | 72.4 | 90.2 | 28 / 35 | 7252 |
| 5 | 1 | 73.4 | 94.9 | 30 / 35 | 7472 |
| 6 | 1 | 72.2 | 88.6 | 29 / 35 | 7102 |
| 7 | 1 | 73.3 | 95.6 | 29 / 35 | 7127 |
| 8 | 1 | 71.4 | 87.0 | 25 / 35 | 7483 |
| 9 | 1 | 72.5 | 90.8 | 26 / 35 | 7334 |
| 10 | 1 | 71.8 | 90.5 | 26 / 35 | 7005 |
| 11 | 1 | 71.5 | 88.9 | 28 / 35 | 6929 |
| 12 | 1 | 72.5 | 92.4 | 29 / 35 | 7005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 111 | 98% |
| sheldor.melee.nano.TestMelee 0.1 | 101 | 93% |
| supersample.SuperBoxBot 1.0 | 53 | 83% |
| dsw.StaticD 1.0 | 26 | 77% |
| mme.NikeEnhanced 2.0 | 23 | 87% |
| sample.MyFirstRobot 1.0 | 15 | 87% |
| tlp.ThreeLeggedPig 1 | 11 | 91% |
| sample.MyFirstJuniorRobot 1.0 | 11 | 91% |
| sample.Corners 1.0 | 9 | 100% |

Hadur died in 95 of 420 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| supersample.SuperBoxBot 1.0 | 28 | 29% | 61 |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 27% | 127 |
| dsw.StaticD 1.0 | 11 | 12% | 45 |
| mme.NikeEnhanced 2.0 | 8 | 8% | 24 |
| sample.Corners 1.0 | 5 | 5% | 15 |
| sul.Lunar 1.1 | 4 | 4% | 106 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 14 |
| tlp.ThreeLeggedPig 1 | 2 | 2% | 10 |
4 death(s) with no robot to name.

## Melee bench: F18

hadur117.micro.SaorLAU 0.1 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 12. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 82.4 | 250 / 420 | 2.59 | 19.0% | 76136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.SaorLAU 0.1 | 1.0 | 19.0% | 250 |
| radnor.DoctorBob 1.42 | 2.5 | 12.9% | 48 |
| mld.Wisdom 1.0 | 3.0 | 12.1% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.2 | 11.2% | 40 |
| KiraNL.Chupacabra 0.4 | 5.2 | 10.3% | 10 |
| amz.NanoClone 1.41 | 5.3 | 10.0% | 20 |
| sample.Walls 1.0 | 7.3 | 7.7% | 8 |
| GarmBox.Oranges 1.0 | 8.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 8.4 | 6.3% | 5 |
| sample.Target 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.3 | 25 / 35 | 6154 |
| 2 | 1 | 68.6 | 80.3 | 21 / 35 | 6330 |
| 3 | 1 | 68.1 | 81.6 | 20 / 35 | 6047 |
| 4 | 1 | 70.2 | 87.0 | 25 / 35 | 6744 |
| 5 | 1 | 68.0 | 80.3 | 22 / 35 | 6102 |
| 6 | 1 | 69.3 | 83.5 | 22 / 35 | 6843 |
| 7 | 1 | 68.0 | 78.1 | 21 / 35 | 6468 |
| 8 | 1 | 69.5 | 86.7 | 21 / 35 | 6330 |
| 9 | 1 | 67.7 | 81.0 | 19 / 35 | 5876 |
| 10 | 1 | 69.2 | 84.8 | 18 / 35 | 6839 |
| 11 | 1 | 65.2 | 72.4 | 13 / 35 | 6045 |
| 12 | 1 | 69.7 | 86.3 | 23 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 109 | 90% |
| radnor.DoctorBob 1.42 | 69 | 83% |
| mld.Wisdom 1.0 | 40 | 68% |
| KiraNL.Chupacabra 0.4 | 20 | 85% |
| amz.NanoClone 1.41 | 18 | 67% |
| jangs.ns51 1.0 | 17 | 100% |
| sample.Walls 1.0 | 14 | 86% |
| sample.Target 1.0 | 7 | 100% |
| GarmBox.Oranges 1.0 | 3 | 100% |

Hadur died in 171 of 420 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 56 | 33% | 87 |
| radnor.DoctorBob 1.42 | 37 | 22% | 107 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 15% | 118 |
| KiraNL.Chupacabra 0.4 | 25 | 15% | 41 |
| amz.NanoClone 1.41 | 14 | 8% | 26 |
| jangs.ns51 1.0 | 7 | 4% | 15 |
| sample.Walls 1.0 | 4 | 2% | 16 |
| GarmBox.Oranges 1.0 | 3 | 2% | 4 |

