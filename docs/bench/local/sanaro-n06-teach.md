# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 10 battles (21.2 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.6 | 209 / 350 | 2.11 | 18.4% | 40759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.4% | 209 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.3% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 39 |
| bzdp.Pansy 2.1 | 3.9 | 11.9% | 25 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.1% | 5 |
| tvv.nano.Polaris 1.2 | 6.4 | 8.7% | 6 |
| fm.claire 1.7 | 6.9 | 8.1% | 3 |
| zyx.nano.Ant 1.1 | 7.1 | 8.0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.1% | 11 |
| arthord.MannyPacquiao Beta | 10.0 | 2.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.1 | 24 / 35 | 4870 |
| 2 | 1 | 69.0 | 90.5 | 21 / 35 | 4261 |
| 3 | 1 | 67.5 | 85.1 | 21 / 35 | 3978 |
| 4 | 1 | 66.9 | 83.8 | 17 / 35 | 3792 |
| 5 | 1 | 68.3 | 88.9 | 23 / 35 | 3910 |
| 6 | 1 | 67.3 | 85.4 | 21 / 35 | 3976 |
| 7 | 1 | 67.9 | 85.7 | 23 / 35 | 4026 |
| 8 | 1 | 68.3 | 87.6 | 20 / 35 | 4112 |
| 9 | 1 | 67.4 | 89.5 | 17 / 35 | 3720 |
| 10 | 1 | 68.5 | 88.6 | 22 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 75% |
| bzdp.Pansy 2.1 | 58 | 88% |
| arthord.NanoSatanMelee Beta | 19 | 89% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 30% |
| tvv.nano.Polaris 1.2 | 8 | 100% |
| fm.claire 1.7 | 5 | 80% |
| zyx.nano.Ant 1.1 | 5 | 100% |

Hadur died in 141 of 350 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 25% | 97 |
| bzdp.Pansy 2.1 | 28 | 20% | 66 |
| d414.nano.Quantum 1.0.0 | 27 | 19% | 78 |
| arthord.NanoSatanMelee Beta | 16 | 11% | 35 |
| ers.nano.hawk.HawkLA 3.0m | 13 | 9% | 26 |
| fm.claire 1.7 | 9 | 6% | 15 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 21 |
| zyx.nano.Ant 1.1 | 6 | 4% | 10 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |

Posture (Hadur's M records, 341 rounds): 247729 melee ticks, 85503 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (341 rounds): longest scan gap while four or more were alive 34 ticks (341 rounds over 8); rounds whose longest gap at any count was over 8: 341; robots dropped as dead without a death event: 1.

Targeting waves (341 rounds): 80082 sent, 72060 reached their opponent, 10611 virtual hits (14.7% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 622 over 10 battles (62.2 per battle, most in one battle 234). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.6 | 287 / 350 | 1.58 | 21.3% | 53686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.3% | 287 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 12.9% | 21 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 11.5% | 12 |
| DBall.Anarchy 0.1 | 5.9 | 8.9% | 3 |
| fm.mammillarias 1.3 | 6.0 | 8.9% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 7.6 | 7.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 5.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 93.7 | 28 / 35 | 5623 |
| 2 | 1 | 71.2 | 91.7 | 25 / 35 | 5655 |
| 3 | 1 | 72.7 | 96.5 | 31 / 35 | 5187 |
| 4 | 1 | 71.4 | 92.4 | 27 / 35 | 5259 |
| 5 | 1 | 72.2 | 93.0 | 27 / 35 | 5324 |
| 6 | 1 | 71.3 | 90.8 | 28 / 35 | 5104 |
| 7 | 1 | 71.6 | 90.8 | 30 / 35 | 5191 |
| 8 | 1 | 72.7 | 93.7 | 31 / 35 | 5317 |
| 9 | 1 | 73.0 | 97.1 | 30 / 35 | 5581 |
| 10 | 1 | 72.9 | 96.2 | 30 / 35 | 5445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 119 | 89% |
| d414.nano.Quantum 1.0.0 | 112 | 98% |
| simonton.nano.MeleeSeed 1.8 | 42 | 98% |
| stelo.SoJNanoMelee 1.1 | 21 | 95% |
| DBall.Anarchy 0.1 | 6 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 67 of 350 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 25% | 120 |
| d414.nano.Quantum 1.0.0 | 17 | 25% | 98 |
| simonton.nano.MeleeSeed 1.8 | 10 | 15% | 62 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 15% | 14 |
| fm.mammillarias 1.3 | 5 | 7% | 14 |
| stelo.SoJNanoMelee 1.1 | 3 | 4% | 15 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 7 |
| DBall.Anarchy 0.1 | 0 | 0% | 16 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 344 rounds): 229317 melee ticks, 103909 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (344 rounds): longest scan gap while four or more were alive 96 ticks (344 rounds over 8); rounds whose longest gap at any count was over 8: 344; robots dropped as dead without a death event: 2.

Targeting waves (344 rounds): 68682 sent, 60347 reached their opponent, 15397 virtual hits (25.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 10 battles (43.1 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.5 | 259 / 350 | 1.68 | 20.7% | 57556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.7% | 259 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.3% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.5% | 32 |
| ahf.NanoAndrew .4 | 4.1 | 11.1% | 13 |
| timmit.nano.TimDog 0.33 | 5.3 | 9.4% | 6 |
| ratosh.Nobo 0.21 | 5.7 | 8.7% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 6.6% | 7 |
| repositorio.NanoStep 1.0 | 8.4 | 5.7% | 3 |
| sample.Crazy 1.0 | 8.6 | 5.4% | 1 |
| kurios.DOSexe .9a | 9.6 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 20 / 35 | 5434 |
| 2 | 1 | 72.1 | 96.5 | 29 / 35 | 5759 |
| 3 | 1 | 72.3 | 95.6 | 28 / 35 | 6205 |
| 4 | 1 | 72.5 | 96.8 | 30 / 35 | 6054 |
| 5 | 1 | 69.6 | 87.6 | 23 / 35 | 5494 |
| 6 | 1 | 72.2 | 96.5 | 29 / 35 | 5951 |
| 7 | 1 | 70.2 | 89.2 | 25 / 35 | 5814 |
| 8 | 1 | 70.2 | 90.5 | 27 / 35 | 5437 |
| 9 | 1 | 70.3 | 90.5 | 22 / 35 | 5506 |
| 10 | 1 | 71.5 | 93.0 | 26 / 35 | 5902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 113 | 83% |
| d414.nano.Quantum 1.0.0 | 104 | 94% |
| ahf.NanoAndrew .4 | 33 | 88% |
| timmit.nano.TimDog 0.33 | 19 | 79% |
| stelo.PatternRobot 1.0 | 8 | 100% |
| repositorio.NanoStep 1.0 | 7 | 71% |
| ratosh.Nobo 0.21 | 6 | 83% |
| sample.Crazy 1.0 | 5 | 100% |

Hadur died in 93 of 350 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 39% | 116 |
| ahf.NanoAndrew .4 | 15 | 16% | 58 |
| d414.nano.Quantum 1.0.0 | 12 | 13% | 86 |
| timmit.nano.TimDog 0.33 | 10 | 11% | 35 |
| ratosh.Nobo 0.21 | 7 | 8% | 18 |
| stelo.PatternRobot 1.0 | 5 | 5% | 14 |
| repositorio.NanoStep 1.0 | 4 | 4% | 12 |
| kurios.DOSexe .9a | 2 | 2% | 4 |
| sample.Crazy 1.0 | 0 | 0% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 247278 melee ticks, 91501 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 58 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 80395 sent, 72561 reached their opponent, 14609 virtual hits (20.1% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 271 over 10 battles (27.1 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 92.9 | 294 / 350 | 1.64 | 22.3% | 75226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 22.3% | 294 |
| d414.nano.Quantum 1.0.0 | 2.1 | 15.6% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 14.8% | 20 |
| wompi.Quokka 1.6 | 4.0 | 11.0% | 2 |
| maribo.FollowFire 1 | 5.6 | 7.5% | 0 |
| kurios.DOSexe .9b | 5.7 | 7.7% | 1 |
| jangs.ns51 1.0 | 7.5 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.6 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 8.6 | 5.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 95.6 | 29 / 35 | 7762 |
| 2 | 1 | 72.8 | 90.5 | 28 / 35 | 7283 |
| 3 | 1 | 73.8 | 98.4 | 31 / 35 | 7191 |
| 4 | 1 | 72.3 | 87.6 | 30 / 35 | 7303 |
| 5 | 1 | 73.4 | 93.0 | 29 / 35 | 7479 |
| 6 | 1 | 73.9 | 94.0 | 31 / 35 | 7873 |
| 7 | 1 | 73.5 | 94.9 | 28 / 35 | 7531 |
| 8 | 1 | 73.8 | 94.3 | 31 / 35 | 7744 |
| 9 | 1 | 73.6 | 93.7 | 31 / 35 | 7655 |
| 10 | 1 | 72.0 | 87.3 | 26 / 35 | 7405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 167 | 90% |
| d414.nano.Quantum 1.0.0 | 126 | 97% |
| wompi.Quokka 1.6 | 9 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 57 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 44% | 161 |
| maribo.FollowFire 1 | 15 | 26% | 19 |
| d414.nano.Quantum 1.0.0 | 9 | 16% | 100 |
| wompi.Quokka 1.6 | 3 | 5% | 28 |
| jangs.ns51 1.0 | 2 | 4% | 7 |
| kurios.DOSexe .9b | 1 | 2% | 18 |
| sample.VelociRobot 1.0 | 1 | 2% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 10 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 333 rounds): 259270 melee ticks, 123717 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 233 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 78 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 1.

Targeting waves (333 rounds): 78659 sent, 70902 reached their opponent, 19089 virtual hits (26.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 10 battles (30.9 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 92.5 | 260 / 350 | 1.68 | 21.1% | 64079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.1% | 260 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.5% | 27 |
| ntc.Opposite 1.5 | 4.4 | 11.3% | 5 |
| js.PinBall 1.6 | 5.0 | 11.2% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.4 | 10.5% | 3 |
| sp.Nanos.Ember 1.1 | 7.0 | 6.6% | 2 |
| PSW.Relentless 0.1 | 8.2 | 4.4% | 0 |
| sample.Fire 1.0 | 8.8 | 3.6% | 1 |
| sample.Target 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.0 | 97.8 | 29 / 35 | 6127 |
| 2 | 1 | 70.6 | 86.0 | 24 / 35 | 6223 |
| 3 | 1 | 72.2 | 94.0 | 25 / 35 | 6507 |
| 4 | 1 | 72.3 | 92.7 | 25 / 35 | 6587 |
| 5 | 1 | 73.5 | 96.2 | 28 / 35 | 6932 |
| 6 | 1 | 70.6 | 89.2 | 24 / 35 | 5899 |
| 7 | 1 | 72.3 | 93.3 | 28 / 35 | 6244 |
| 8 | 1 | 73.3 | 96.5 | 29 / 35 | 6480 |
| 9 | 1 | 71.7 | 89.5 | 25 / 35 | 6408 |
| 10 | 1 | 71.8 | 89.5 | 23 / 35 | 6672 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 117 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 105 | 81% |
| js.PinBall 1.6 | 31 | 84% |
| sp.Nanos.Ember 1.1 | 17 | 94% |
| ntc.Opposite 1.5 | 17 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 80% |

Hadur died in 91 of 350 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 29% | 105 |
| d414.nano.Quantum 1.0.0 | 19 | 21% | 96 |
| js.PinBall 1.6 | 14 | 15% | 52 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 11% | 38 |
| ntc.Opposite 1.5 | 9 | 10% | 30 |
| PSW.Relentless 0.1 | 9 | 10% | 8 |
| sp.Nanos.Ember 1.1 | 3 | 3% | 20 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 336 rounds): 252136 melee ticks, 96357 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (336 rounds): longest scan gap while four or more were alive 50 ticks (336 rounds over 8); rounds whose longest gap at any count was over 8: 336; robots dropped as dead without a death event: 0.

Targeting waves (336 rounds): 78670 sent, 70821 reached their opponent, 15963 virtual hits (22.5% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 338 over 10 battles (33.8 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.0 | 214 / 350 | 1.99 | 18.9% | 45238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 18.9% | 214 |
| d414.nano.Quantum 1.0.0 | 2.7 | 13.0% | 29 |
| kawigi.nano.Lib 1.0 | 3.6 | 12.5% | 25 |
| radnor.DoctorBob 1.42 | 3.9 | 12.1% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 12.2% | 31 |
| myl.nano.Graviton 1.10 | 5.7 | 10.6% | 16 |
| stelo.MirrorNano 1.3 | 7.5 | 7.4% | 1 |
| ratosh.Wesco 1.4 | 7.8 | 6.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.9 | 27 / 35 | 4793 |
| 2 | 1 | 68.2 | 85.4 | 18 / 35 | 4332 |
| 3 | 1 | 69.2 | 87.0 | 23 / 35 | 4476 |
| 4 | 1 | 70.6 | 94.3 | 23 / 35 | 4501 |
| 5 | 1 | 70.9 | 91.4 | 26 / 35 | 4991 |
| 6 | 1 | 69.6 | 88.3 | 23 / 35 | 4475 |
| 7 | 1 | 67.6 | 84.1 | 20 / 35 | 4121 |
| 8 | 1 | 69.1 | 88.6 | 18 / 35 | 4644 |
| 9 | 1 | 69.0 | 87.9 | 19 / 35 | 4567 |
| 10 | 1 | 68.4 | 87.9 | 17 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 73% |
| d414.nano.Quantum 1.0.0 | 62 | 87% |
| kawigi.nano.Lib 1.0 | 50 | 84% |
| radnor.DoctorBob 1.42 | 40 | 88% |
| myl.nano.Graviton 1.10 | 31 | 84% |
| stelo.MirrorNano 1.3 | 5 | 80% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 138 of 350 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 25% | 82 |
| radnor.DoctorBob 1.42 | 26 | 19% | 73 |
| d414.nano.Quantum 1.0.0 | 24 | 17% | 57 |
| kawigi.nano.Lib 1.0 | 19 | 14% | 52 |
| myl.nano.Graviton 1.10 | 16 | 12% | 50 |
| stelo.MirrorNano 1.3 | 8 | 6% | 19 |
| squidM.TentalceMeleeNano 1.1 | 5 | 4% | 8 |
| ratosh.Wesco 1.4 | 4 | 3% | 9 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 335 rounds): 228289 melee ticks, 78914 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 533 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (335 rounds): longest scan gap while four or more were alive 171 ticks (335 rounds over 8); rounds whose longest gap at any count was over 8: 335; robots dropped as dead without a death event: 0.

Targeting waves (335 rounds): 75443 sent, 67311 reached their opponent, 12981 virtual hits (19.3% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 559 over 10 battles (55.9 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.8 | 239 / 350 | 1.83 | 20.2% | 56343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.2% | 239 |
| d414.nano.Quantum 1.0.0 | 2.2 | 12.9% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.4% | 35 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.1% | 17 |
| oog.melee.CapuletDroid 1.1 | 4.9 | 10.8% | 22 |
| nz.jdc.nano.GridFu 1.0 | 5.6 | 10.4% | 7 |
| mz.Cork 0.1 | 6.6 | 9.8% | 12 |
| stuff.Vlad 0.1 | 8.3 | 5.4% | 0 |
| stelo.UntouchableNano 1.3 | 8.7 | 5.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.7 | 26 / 35 | 5771 |
| 2 | 1 | 70.1 | 87.6 | 21 / 35 | 5462 |
| 3 | 1 | 71.2 | 90.5 | 26 / 35 | 5922 |
| 4 | 1 | 71.5 | 92.1 | 25 / 35 | 5806 |
| 5 | 1 | 71.2 | 93.0 | 24 / 35 | 5722 |
| 6 | 1 | 70.1 | 91.7 | 22 / 35 | 5148 |
| 7 | 1 | 70.1 | 89.2 | 22 / 35 | 5579 |
| 8 | 1 | 70.3 | 89.8 | 24 / 35 | 5508 |
| 9 | 1 | 71.6 | 93.7 | 27 / 35 | 5791 |
| 10 | 1 | 70.3 | 88.6 | 22 / 35 | 5634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 80% |
| d414.nano.Quantum 1.0.0 | 72 | 94% |
| oog.melee.CapuletDroid 1.1 | 63 | 86% |
| cb.nano.Insomnia 1.0 | 34 | 85% |
| mz.Cork 0.1 | 24 | 71% |
| nz.jdc.nano.GridFu 1.0 | 9 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |

Hadur died in 115 of 350 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 29% | 103 |
| cb.nano.Insomnia 1.0 | 23 | 20% | 24 |
| oog.melee.CapuletDroid 1.1 | 22 | 19% | 84 |
| d414.nano.Quantum 1.0.0 | 17 | 15% | 64 |
| mz.Cork 0.1 | 11 | 10% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 23 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 339 rounds): 272929 melee ticks, 110343 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (339 rounds): longest scan gap while four or more were alive 50 ticks (339 rounds over 8); rounds whose longest gap at any count was over 8: 339; robots dropped as dead without a death event: 0.

Targeting waves (339 rounds): 83467 sent, 75448 reached their opponent, 15557 virtual hits (20.6% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 203 over 10 battles (20.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.2 | 281 / 350 | 1.52 | 21.7% | 64585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.7% | 281 |
| d414.nano.Quantum 1.0.0 | 2.4 | 14.5% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.9% | 31 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.2% | 7 |
| baal.nano.N 1.42 | 5.1 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 8.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.9 | 7.8% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 4.9% | 2 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 90.5 | 28 / 35 | 6721 |
| 2 | 1 | 73.0 | 95.6 | 28 / 35 | 6341 |
| 3 | 1 | 74.1 | 99.4 | 33 / 35 | 6484 |
| 4 | 1 | 73.0 | 94.9 | 28 / 35 | 6711 |
| 5 | 1 | 73.8 | 97.5 | 30 / 35 | 6771 |
| 6 | 1 | 72.5 | 90.5 | 26 / 35 | 6493 |
| 7 | 1 | 73.2 | 96.5 | 31 / 35 | 6187 |
| 8 | 1 | 72.0 | 91.4 | 27 / 35 | 6314 |
| 9 | 1 | 72.8 | 94.6 | 27 / 35 | 6527 |
| 10 | 1 | 71.5 | 91.1 | 23 / 35 | 6036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 142 | 85% |
| d414.nano.Quantum 1.0.0 | 108 | 96% |
| gh.nano.Grofvuil 0.2 | 39 | 97% |
| baal.nano.N 1.42 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 50% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |

Hadur died in 71 of 350 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 42% | 122 |
| d414.nano.Quantum 1.0.0 | 13 | 18% | 96 |
| gh.nano.Grofvuil 0.2 | 9 | 13% | 64 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 11% | 8 |
| baal.nano.N 1.42 | 4 | 6% | 27 |
| donjezza.Muncho 1.0 | 3 | 4% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 17 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 332 rounds): 244056 melee ticks, 107580 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 73 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 73501 sent, 65817 reached their opponent, 17135 virtual hits (26.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 249 over 10 battles (24.9 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.7 | 283 / 350 | 1.56 | 21.4% | 53935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.4% | 283 |
| d414.nano.Quantum 1.0.0 | 2.3 | 12.8% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 11.9% | 18 |
| mld.DustBunny 3.8 | 3.4 | 11.9% | 8 |
| stelo.SoRobotNanoMelee 1.2 | 5.4 | 8.7% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 6.8 | 7.4% | 4 |
| wee.Gem 1.8.4 | 7.1 | 7.2% | 6 |
| cs.sheldor.Talon 1.1 | 7.4 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 8.7 | 6.3% | 2 |
| step.nanoPri 1.0 | 9.6 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 24 / 35 | 4977 |
| 2 | 1 | 70.8 | 90.8 | 27 / 35 | 5035 |
| 3 | 1 | 70.7 | 91.1 | 25 / 35 | 5517 |
| 4 | 1 | 71.8 | 94.3 | 27 / 35 | 5669 |
| 5 | 1 | 72.3 | 93.7 | 32 / 35 | 5788 |
| 6 | 1 | 72.0 | 95.9 | 29 / 35 | 5505 |
| 7 | 1 | 71.5 | 94.9 | 29 / 35 | 5243 |
| 8 | 1 | 72.6 | 96.8 | 30 / 35 | 5439 |
| 9 | 1 | 72.7 | 97.1 | 32 / 35 | 5576 |
| 10 | 1 | 71.0 | 92.7 | 28 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 94 | 86% |
| d414.nano.Quantum 1.0.0 | 93 | 91% |
| mld.DustBunny 3.8 | 70 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 100% |
| tj.zombie1n 1.0.1 | 12 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| wee.Gem 1.8.4 | 5 | 80% |
| step.nanoPri 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 100% |

Hadur died in 68 of 350 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 29% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 22% | 93 |
| mld.DustBunny 3.8 | 12 | 18% | 59 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 7% | 26 |
| wee.Gem 1.8.4 | 5 | 7% | 18 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 4% | 31 |
| tj.zombie1n 1.0.1 | 3 | 4% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 7 |

Posture (Hadur's M records, 332 rounds): 223329 melee ticks, 87580 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 462 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (332 rounds): longest scan gap while four or more were alive 237 ticks (332 rounds over 8); rounds whose longest gap at any count was over 8: 332; robots dropped as dead without a death event: 1.

Targeting waves (332 rounds): 73983 sent, 65857 reached their opponent, 16171 virtual hits (24.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 10 battles (19.9 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.1 | 261 / 350 | 1.71 | 21.0% | 61223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.0% | 261 |
| d414.nano.Quantum 1.0.0 | 2.2 | 15.1% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.3% | 42 |
| mld.Infinity 2.2 | 4.0 | 11.4% | 13 |
| conscience.Electron 1.3g | 5.6 | 7.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 7.4 | 6.8% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.0 | 29 / 35 | 5806 |
| 2 | 1 | 72.1 | 94.3 | 27 / 35 | 6175 |
| 3 | 1 | 71.9 | 93.0 | 25 / 35 | 6286 |
| 4 | 1 | 71.2 | 92.7 | 28 / 35 | 5718 |
| 5 | 1 | 70.2 | 87.0 | 21 / 35 | 5994 |
| 6 | 1 | 71.7 | 91.4 | 25 / 35 | 6348 |
| 7 | 1 | 71.6 | 91.7 | 26 / 35 | 6178 |
| 8 | 1 | 70.9 | 89.5 | 24 / 35 | 5822 |
| 9 | 1 | 72.5 | 96.5 | 29 / 35 | 6160 |
| 10 | 1 | 72.3 | 91.7 | 27 / 35 | 6736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 148 | 82% |
| d414.nano.Quantum 1.0.0 | 112 | 96% |
| mld.Infinity 2.2 | 20 | 85% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| ayk.WallHugger 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 89 of 350 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 51% | 153 |
| d414.nano.Quantum 1.0.0 | 19 | 21% | 96 |
| robar.nano.Assertive_Melee 0.2 | 13 | 15% | 29 |
| mld.Infinity 2.2 | 6 | 7% | 28 |
| conscience.Electron 1.3g | 4 | 4% | 14 |
| ayk.WallHugger 1.0 | 1 | 1% | 12 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 11 |
| donjezza.Jezza 1.0 | 0 | 0% | 6 |

Posture (Hadur's M records, 333 rounds): 243368 melee ticks, 113275 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (333 rounds): longest scan gap while four or more were alive 103 ticks (333 rounds over 8); rounds whose longest gap at any count was over 8: 333; robots dropped as dead without a death event: 0.

Targeting waves (333 rounds): 74487 sent, 66710 reached their opponent, 14711 virtual hits (22.1% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 335 over 10 battles (33.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.0 | 266 / 350 | 1.54 | 21.1% | 55111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 21.1% | 266 |
| d414.nano.Quantum 1.0.0 | 2.3 | 14.0% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 31 |
| oog.melee.Corsair 1.0 | 3.8 | 12.1% | 15 |
| mz.NanoGod 2.02 | 4.9 | 10.3% | 10 |
| awesomeness.Elite 1.0 | 6.0 | 7.9% | 1 |
| DBall.NUKE 0.1 | 7.4 | 6.1% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 6.3% | 0 |
| sample.Walls 1.0 | 9.1 | 4.9% | 2 |
| stelo.PianistNano 1.2 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.2 | 31 / 35 | 5868 |
| 2 | 1 | 71.3 | 94.6 | 23 / 35 | 5313 |
| 3 | 1 | 72.0 | 95.6 | 28 / 35 | 5328 |
| 4 | 1 | 71.5 | 94.6 | 30 / 35 | 5316 |
| 5 | 1 | 70.7 | 91.4 | 22 / 35 | 5657 |
| 6 | 1 | 71.8 | 94.3 | 27 / 35 | 5583 |
| 7 | 1 | 69.0 | 85.7 | 21 / 35 | 5034 |
| 8 | 1 | 72.2 | 94.3 | 28 / 35 | 5590 |
| 9 | 1 | 72.5 | 96.5 | 29 / 35 | 5837 |
| 10 | 1 | 72.4 | 97.1 | 27 / 35 | 5585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 111 | 83% |
| d414.nano.Quantum 1.0.0 | 101 | 93% |
| oog.melee.Corsair 1.0 | 47 | 91% |
| mz.NanoGod 2.02 | 24 | 79% |
| awesomeness.Elite 1.0 | 13 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 85 of 350 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 27% | 101 |
| d414.nano.Quantum 1.0.0 | 21 | 25% | 90 |
| oog.melee.Corsair 1.0 | 16 | 19% | 73 |
| mz.NanoGod 2.02 | 9 | 11% | 36 |
| zyx.nano.BacillusComma 1.0 | 5 | 6% | 11 |
| awesomeness.Elite 1.0 | 4 | 5% | 22 |
| DBall.NUKE 0.1 | 3 | 4% | 6 |
| sample.Walls 1.0 | 2 | 2% | 5 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 334 rounds): 247633 melee ticks, 94393 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 343 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (334 rounds): longest scan gap while four or more were alive 277 ticks (334 rounds over 8); rounds whose longest gap at any count was over 8: 334; robots dropped as dead without a death event: 0.

Targeting waves (334 rounds): 78578 sent, 70895 reached their opponent, 14272 virtual hits (20.1% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 228 over 10 battles (22.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 97.4 | 307 / 350 | 1.23 | 23.3% | 68150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 23.3% | 307 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.4% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 12.7% | 20 |
| sul.Lunar 1.1 | 3.9 | 10.9% | 11 |
| myl.nano.KomoriNinja 1.1 | 5.4 | 8.6% | 0 |
| maribo.melee.BMV 0.1 | 5.8 | 8.5% | 0 |
| sam.Samspin 1.0 | 6.9 | 6.9% | 1 |
| spinnercat.Omen 1.0 | 8.4 | 5.8% | 1 |
| sample.SpinBot 1.0 | 9.1 | 5.1% | 0 |
| cvt.Firsty 1.0 | 9.4 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.7 | 99.7 | 34 / 35 | 7119 |
| 2 | 1 | 73.3 | 97.5 | 29 / 35 | 6394 |
| 3 | 1 | 73.7 | 95.9 | 29 / 35 | 6850 |
| 4 | 1 | 74.0 | 97.8 | 31 / 35 | 6716 |
| 5 | 1 | 74.7 | 99.4 | 33 / 35 | 7067 |
| 6 | 1 | 73.4 | 96.5 | 30 / 35 | 6371 |
| 7 | 1 | 73.9 | 96.8 | 30 / 35 | 7069 |
| 8 | 1 | 73.4 | 95.2 | 30 / 35 | 6569 |
| 9 | 1 | 74.0 | 98.1 | 30 / 35 | 6826 |
| 10 | 1 | 74.4 | 97.1 | 31 / 35 | 7169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 116 | 86% |
| d414.nano.Quantum 1.0.0 | 106 | 98% |
| sul.Lunar 1.1 | 80 | 90% |
| sam.Samspin 1.0 | 8 | 100% |
| maribo.melee.BMV 0.1 | 7 | 100% |
| myl.nano.KomoriNinja 1.1 | 7 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| cvt.Firsty 1.0 | 3 | 100% |

Hadur died in 43 of 350 rounds, at a mean tick of 1458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 44% | 125 |
| sul.Lunar 1.1 | 12 | 28% | 55 |
| d414.nano.Quantum 1.0.0 | 5 | 12% | 93 |
| maribo.melee.BMV 0.1 | 3 | 7% | 28 |
| myl.nano.KomoriNinja 1.1 | 2 | 5% | 26 |
| sam.Samspin 1.0 | 1 | 2% | 8 |
| spinnercat.Omen 1.0 | 1 | 2% | 7 |
| sample.SpinBot 1.0 | 0 | 0% | 4 |
| cvt.Firsty 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 330 rounds): 253901 melee ticks, 124511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (330 rounds): longest scan gap while four or more were alive 32 ticks (330 rounds over 8); rounds whose longest gap at any count was over 8: 330; robots dropped as dead without a death event: 1.

Targeting waves (330 rounds): 79029 sent, 71296 reached their opponent, 21632 virtual hits (30.3% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 553 over 10 battles (55.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 10 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.3 | 266 / 350 | 1.78 | 20.2% | 50929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20 | 1.0 | 20.2% | 266 |
| d414.nano.Quantum 1.0.0 | 2.1 | 13.3% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.7% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 10.5% | 13 |
| mld.Wisdom 1.0 | 4.5 | 10.2% | 8 |
| tvv.nano.Polaris 1.2 | 7.0 | 8.1% | 1 |
| amz.NanoClone 1.41 | 7.2 | 7.9% | 1 |
| zyx.nano.Ant 1.1 | 7.4 | 7.8% | 0 |
| arthord.NanoSatanMelee Beta | 8.3 | 6.8% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.2 | 28 / 35 | 4806 |
| 2 | 1 | 71.5 | 95.6 | 30 / 35 | 5249 |
| 3 | 1 | 71.2 | 93.7 | 28 / 35 | 5302 |
| 4 | 1 | 69.9 | 88.3 | 24 / 35 | 5367 |
| 5 | 1 | 68.8 | 87.3 | 26 / 35 | 4614 |
| 6 | 1 | 71.2 | 94.6 | 28 / 35 | 4906 |
| 7 | 1 | 70.4 | 92.7 | 27 / 35 | 5077 |
| 8 | 1 | 69.0 | 87.0 | 24 / 35 | 4859 |
| 9 | 1 | 70.3 | 91.4 | 25 / 35 | 5090 |
| 10 | 1 | 71.4 | 92.7 | 26 / 35 | 5659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 121 | 85% |
| d414.nano.Quantum 1.0.0 | 105 | 94% |
| mld.Wisdom 1.0 | 17 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 100% |
| arthord.NanoSatanMelee Beta | 12 | 100% |
| tvv.nano.Polaris 1.2 | 10 | 90% |
| zyx.nano.Ant 1.1 | 9 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |

Hadur died in 88 of 350 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 32% | 126 |
| d414.nano.Quantum 1.0.0 | 24 | 27% | 88 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 10% | 46 |
| mld.Wisdom 1.0 | 6 | 7% | 27 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 15 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 17 |
| zyx.nano.Ant 1.1 | 3 | 3% | 10 |
| arthord.MannyPacquiao Beta | 3 | 3% | 5 |
| amz.NanoClone 1.41 | 2 | 2% | 14 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 339 rounds): 216831 melee ticks, 102440 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (339 rounds): longest scan gap while four or more were alive 48 ticks (339 rounds over 8); rounds whose longest gap at any count was over 8: 339; robots dropped as dead without a death event: 0.

Targeting waves (339 rounds): 70444 sent, 62539 reached their opponent, 13775 virtual hits (22.0% of those reached).

